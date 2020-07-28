import Vue from 'vue';
import Vuex from 'vuex';
import posts from './modules/posts';
import categories from "./modules/categories";

Vue.use(Vuex);

export const store = new Vuex.Store({
    state: {},
    getters: {},
    mutations: {},
    actions: {},
    modules: {
        posts,
        categories
    },
});

