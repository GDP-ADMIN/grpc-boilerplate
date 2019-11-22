<template>
    <div class="book-item">
        <p>{{bookMessage.title}}</p>
    </div>
</template>>

<script>
import { BookMessage } from '../grpc/Book_pb'

export default {
    name: 'BookItem',
    props: {
        bookMessage: BookMessage        
    }
}
</script>>