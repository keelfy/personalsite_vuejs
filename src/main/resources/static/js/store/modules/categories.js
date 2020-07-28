import {AXIOS} from 'utils/axios';

const state = {
    categories: null,
};

const getters = {};

const mutations = {
    setCategories: (state, payload) => {
        state.categories = payload;
    },
};

const actions = {
    getCategories: async (context, payload) => {
        let {data} = await AXIOS.get('category');
        context.commit('setCategories', data);
    },
};

export default {
    state,
    getters,
    mutations,
    actions,
};