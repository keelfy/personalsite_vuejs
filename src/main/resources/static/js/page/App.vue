<template>
    <div>
        <div class="intro">
            <header class="header">
                <div class="container">
                    <div class="header-inner">
                        <a href="/" class="header-logo">Oleg Kuzmin</a>
                        <nav class="navbar">
                            <router-link class="nav-item" v-bind:class="{selected: this.$route.path === '/'}" to="/">Home</router-link>
                            <router-link class="nav-item" v-bind:class="{selected: this.$route.path === '/gallery'}" to="/gallery">Gallery</router-link>
                            <router-link class="nav-item"  v-bind:class="{selected: this.$route.path === '/contact'}" to="/contact">Contact</router-link>
                        </nav>
                    </div>
                </div>
            </header>
        </div>
        <router-view></router-view>
    </div>
</template>

<script>

</script>

<style scoped>
    /** Intro */
    .intro {
        width: 100%;
        height: 130px;
        background:
                url("/images/industrial_hero_1.jpg")
                no-repeat
                center;
        background-size: cover;

        -webkit-box-shadow: inset 0 141px 105px -24px rgba(0,0,0,0.75);
        -moz-box-shadow: inset 0 141px 105px -24px rgba(0,0,0,0.75);
        box-shadow: inset 0 141px 105px -24px rgba(0,0,0,0.75);
    }

    /** Header */
    .header {
        width: 80%;
        margin: 0 auto;
        padding-top: 50px;

        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        z-index: 1000;
    }

    .header-inner {
        display: flex;
        flex-wrap: nowrap;
        align-items: center;
        justify-content: space-between;
    }

    .header-logo {
        text-decoration: none;
        text-transform: uppercase;
        letter-spacing: .2em;
        font-weight: 400;
        font-size: 22px;
        color: #fff;

        transition: color .2s linear;
    }

    .header-logo:hover {
        color: #c7dbff;
    }

    /** Navigation */
    .navbar {
        font-size: 16px;
        text-transform: uppercase;
    }

    .nav-item {
        display: inline-block;
        vertical-align: top;
        margin: 0 10px;
        position: relative;

        color: gray;
        text-decoration: none;

        transition: color .2s linear;
    }

    .selected {
        color: #fff;
        transition: none;
    }

    .nav-item:after {
        content: "";
        display: block;
        width: 100%;
        height: 1px;
        opacity: 0;

        background-color: #DBDBDB;

        position: absolute;
        top: 100%;
        left: 0;
        z-index: 1;

        transition: opacity .1s linear;
    }

    .nav-item:hover {
        color: #DBDBDB;
    }

    .nav-item:hover:after {
        opacity: 1;
    }
</style>