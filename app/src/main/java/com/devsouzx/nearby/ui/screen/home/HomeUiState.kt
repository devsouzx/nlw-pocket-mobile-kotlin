package com.devsouzx.nearby.ui.screen.home

import com.google.android.gms.maps.model.LatLng
import com.devsouzx.nearby.data.model.Category
import com.devsouzx.nearby.data.model.Market

data class HomeUiState(
    val categories: List<Category>? = null,
    val markets: List<Market>? = null,
    val marketLocations: List<LatLng>? = null
)