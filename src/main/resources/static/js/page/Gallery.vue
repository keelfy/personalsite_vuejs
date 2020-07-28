<template>
    <div class="main">
        <div class="gallery-categories-nav animate__animated animate__fadeInLeft">
            <h2 class="category-list-header">Categories</h2>

            <ul class="categories-list">
                <li v-for="category in categories['categories']" :key="'category-' + category['id']">
                    <a class="category-item" href="#">{{category['unlocalizedName']}}</a>
                    <hr/>
                </li>
            </ul>
        </div>
        <gallery-list :posts="posts['posts']"></gallery-list>
    </div>
</template>

<script>
    import {mapState} from 'vuex'
    import GalleryList from '../component/GalleryList.vue';

    export default {
        components: {
            'gallery-list': GalleryList,
        },
        created() {
            this.$store.dispatch('getPosts');
            this.$store.dispatch('getCategories')
        },
        computed: mapState(['posts', 'categories']),
    }
</script>

<style scoped lang="css">
    /** Main */
    .main {
        display: flex;
        align-items: self-end;
    }

    /** Categories */
    .category-list-header {
        text-align: center;
        margin-top: 10px;
    }

    @media screen and (max-width: 600px) {
        .gallery-categories-nav {
            display: none;
        }
    }

    .gallery-categories-nav {
        flex: 1;

        border-radius: 5px;

        padding-bottom: 10px;
        margin: 15px;

        color: #fff;
        background-color: #5c738a;
    }

    .categories-list {
        list-style: none;
        margin: 30px 30px;
        padding: 0;
    }

    .categories-list li {
        margin: 30px auto;
    }

    .category-item {
        text-decoration: none;
        font-size: 20px;
        font-weight: 400;
        color: #ddd;

        transition: font-size .2s linear, color .1s linear;
    }

    .category-item:hover {
        font-size: 22px;
        color: #fff;
    }
</style>