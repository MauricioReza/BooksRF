package com.amaurypm.videogamesrf.data.remote.model

import com.google.gson.annotations.SerializedName


data class BookDto(
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("titulo")
    var titulo: String? = null,
    @SerializedName("autor")
    var autor: String? = null,
    @SerializedName("thumbnail")
    var thumbnail: String? = null,
    @SerializedName("pie_de_imprenta")
    var pie_de_imprenta: String? = null,
    @SerializedName("clasificación")
    var clasificación: String? = null


)
