<template>
    <p>{{book.getTitle()}} : {{book.getAuthor()}}</p>
</template>>

<script>
import { BookMessage } from '../grpc/Book_pb'

export default {
    name: 'BookItem',
    props: {
        book: BookMessage        
    }
}
</script>>