package com.devsouzx.nearby.ui.screen.market_details

import com.devsouzx.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null,
)