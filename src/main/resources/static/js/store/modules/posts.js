import {AXIOS} from 'utils/axios';

const state = {
    posts: null,
};

const getters = {};

const mutations = {
    setPosts: (state, payload) => {
        state.posts = payload;
    },
};

const actions = {
    getPosts: async (context, payload) => {
        let {data} = await AXIOS.get('gallery');
        context.commit('setPosts', data);
    },
};

export default {
    state,
    getters,
    mutations,
    actions,
};