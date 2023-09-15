package com.example.android.cameraxextensions

import android.util.Log
import android.view.View
import android.widget.ImageView


class SightManagerImpl(private val root: View) : SightManager {

    private val sight: ImageView by lazy {
        val s: ImageView = root.findViewById(R.id.sight)
        "sight:$s".logD()
        s
    }

    override fun scrollSight(distanceX: Float, distanceY: Float) {
        "postTranslate ${-distanceX}, ${-distanceY}".logD()
        sight.x = sight.x - distanceX / 5
        sight.y = sight.y - distanceY / 5
    }
}

fun String.logD() {
    Log.d("Sight", this)
}
