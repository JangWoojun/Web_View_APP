package com.example.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items=  mutableListOf<ContentModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/B64oLGvWbo5d",
            "https://mp-seoul-image-production-s3.mangoplate.com/523935_1623245432052274.jpg",
                "스시이마"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/_c641YCsJWU3",
                "https://mp-seoul-image-production-s3.mangoplate.com/249700/1042666_1597122578575_37310?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "횟집울릉도"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/cHYhGejaT_",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/532640_1471097953708316.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "제주도그릴특상"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/i4IbCYrqwDeQ",
                "https://mp-seoul-image-production-s3.mangoplate.com/1515134_1610875043199453.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "니하오"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/VdkLLgPWWaCe",
                "https://mp-seoul-image-production-s3.mangoplate.com/1841276_1649592947606927.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "필구커피"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/OSyIG-aiK2u_",
                "https://mp-seoul-image-production-s3.mangoplate.com/617296_1594644170549462.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "오레노라멘"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/Y8rBeDQx300W",
                "https://mp-seoul-image-production-s3.mangoplate.com/337678/570339_1600079149341_33170",
                "햇살머무는식탁"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/OybhNJprdbjV",
                "https://mp-seoul-image-production-s3.mangoplate.com/617296_1590073813316973.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "히카리우동"
            )
        )
        items.add(
            ContentModel(
                "mangoplate.com/restaurants/IH9yXPcXK9",
                "https://mp-seoul-image-production-s3.mangoplate.com/1704015_1647292401380684.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "삼오순대국"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/2BvZsuhVXBiA",
                "https://mp-seoul-image-production-s3.mangoplate.com/1757039_1629718218737542.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "포옹싸 "
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/jfx6vNvQPwf-",
                "https://mp-seoul-image-production-s3.mangoplate.com/1047892_1629374260979864.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "동"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/ZU5yw9Q_SAu1",
                "https://mp-seoul-image-production-s3.mangoplate.com/1609150_1581753452281729.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "온도차"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/_ObtBp2gTr",
                "https://mp-seoul-image-production-s3.mangoplate.com/197741/45556_1626173533189_16397?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "성너머집"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/bZiVaUmeNZ8t",
                "https://mp-seoul-image-production-s3.mangoplate.com/1095722_1633774976507833.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "코스믹버거랩"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/i2Wsu9MZl9",
                "https://mp-seoul-image-production-s3.mangoplate.com/1515134_1619767984538700.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "원조두꺼비불오징어 "
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/hRxG1GICPwm0",
                "https://mp-seoul-image-production-s3.mangoplate.com/1841276_1649517303492758.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "플롭"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/nsC2gslUeJ",
                "https://mp-seoul-image-production-s3.mangoplate.com/91729/439642_1597292077911_8009?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                "목노집"
            )
        )
        items.add(
            ContentModel(
                "https://www.mangoplate.com/restaurants/ycHaFj1ZlG",
                "https://mp-seoul-image-production-s3.mangoplate.com/964639_1519228177603248.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "벙구갈비"
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerview.adapter = rvAdapter

        rvAdapter.itemClick = object: RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {

                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url",items[position].url)
                startActivity(intent)

            }

        }

        recyclerview.layoutManager = GridLayoutManager(this,2)
    }
}