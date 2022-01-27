package tech.linjiang.pandora.expand

import android.webkit.WebView

interface ExpandItemClickListener {
    fun onExpandItemClick(webView: WebView,content: String)
}