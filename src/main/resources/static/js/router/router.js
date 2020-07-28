import Vue from 'vue'
import VueRouter from 'vue-router'
import HomePage from 'page/Home.vue'
import GalleryPage from 'page/Gallery.vue'
import ContactPage from 'page/Contact.vue'

Vue.use(VueRouter);

const routes = [
    { path: '/', component: HomePage },
    { path: '/gallery/:id?', component: GalleryPage },
    { path: '/contact', component: ContactPage },
    { path: '*', component: HomePage },
];

export default new VueRouter({
    mode: 'history',
    routes
});
