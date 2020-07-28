import Vue from 'vue'
import '@babel/polyfill'
import 'api/resources'
import {store} from 'store/store'
import App from 'page/App.vue'
import router from "router/router";

new Vue({
    router,
    store,
    render: a => a(App)
}).$mount("#app");
