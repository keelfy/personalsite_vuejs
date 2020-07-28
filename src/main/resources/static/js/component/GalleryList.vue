<template>
    <div class="container-gallery">
        <div v-for="post in posts" :key="'post-' + post['id']">
            <gallery-item :post="post"></gallery-item>
        </div>
    </div>
</template>

<script>
    import GalleryItem from "./GalleryItem.vue";

    export default {
        name: 'GalleryList',
        props: ['posts'],
        components: {
            'gallery-item': GalleryItem,
        }
    }
</script>

<style scoped lang="css">
    .container-gallery {
        flex: 6;

        display: flex;
        flex-wrap: wrap;
        align-content: space-evenly;
    }
</style>