<template>
    <div class="gallery-item animate__animated animate__fadeInUp animate__fast">
        <img
                :src="imagePath + post['unlocalizedName'] + '.' + extension"
                :alt="post['unlocalizedName']"/>
        <hr>
        {{post['id']}}: {{post['unlocalizedName']}}
    </div>
</template>

<script>
    export default {
        name: 'GalleryItem',
        props: ['post'],
        data() {
            return {
                imagePath: '/images/gallery/preview/',
                extension: 'jpg',
            };
        }
    }
</script>

<style scoped lang="css">
    .gallery-item {
        display: inline-block;
        margin: 15px 15px;
        padding: 10px;
        width: 340px;

        background-color: #34495c;
        color: #fff;

        border-radius: 2px;

        flex: 1 0 auto;
        transition: background-color .1s linear;
    }

    .gallery-item:hover {
        background-color: #395a75;
        cursor: pointer;
    }

    .gallery-item img {
        display: block;

        max-width: 315px;
        max-height: 315px;

        transition: transform .1s linear;
        border-radius: 5px;

        margin: 0 auto;
    }

    .gallery-item img:hover {
        transform: scale(1.2);
    }
</style>