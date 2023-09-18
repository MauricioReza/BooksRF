package com.amaurypm.videogamesrf.data.remote.model

import com.google.gson.annotations.SerializedName

/**
 * Creado por Amaury Perea Matsumura el 02/09/23
 */

data class BookDetailDto(


    @SerializedName("title")
    var title: String? = null,
    @SerializedName("Ubicacion")
    var Ubicacion: String? = null,
    @SerializedName("Coleccion")
    var Coleccion: String? = null,
    @SerializedName("image")
    var image: String? = null,
    @SerializedName("long_desc")
    var longDesc: String? = null


)
