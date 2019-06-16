package com.example.movie_tmdb.data.vos

data class TopRatedMoviesVO (


    val vote_count:Int,

    val id: Int,

    val vote_average:Int,

    val title: String?,

    val poster_path: String,

    val original_title: String,

    val adult: Boolean


)


/*"vote_count": 2066,
"id": 19404,
"video": false,
"vote_average": 9,
"title": "Dilwale Dulhania Le Jayenge",
"popularity": 14.316,
"poster_path": "/uC6TTUhPpQCmgldGyYveKRAu8JN.jpg",
"original_language": "hi",
"original_title": "दिलवाले दुल्हनिया ले जायेंगे",
"genre_ids": [
35,
18,
10749
],
"backdrop_path": "/nl79FQ8xWZkhL3rDr1v2RFFR6J0.jpg",
"adult": false,
"overview": "Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga.",
"release_date": "1995-10-20"*/
