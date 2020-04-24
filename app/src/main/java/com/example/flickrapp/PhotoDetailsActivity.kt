package com.example.flickrapp

import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.browse.*
import kotlinx.android.synthetic.main.content_photo_details.*

class PhotoDetailsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_details)

        activateToolbar(true)

//        val photo = intent.getSerializableExtra(PHOTO_TRANSFER) as Photo
        val photo = intent.extras?.getParcelable<Photo>(PHOTO_TRANSFER) as Photo

//        photo_title.text = "Title: " + photo.title
//        photo_tags.text = "Tags: " + photo.tags
        photo_title.text = resources.getString(R.string.photo_title_text, photo.title)
        photo_tags.text = resources.getString(R.string.photo_tags_text, photo.tags)
        photo_author.text = photo.author

        //photo_author.text = resources.getString(R.string.photo_author_text, "my", "red", "car")

        Picasso.with(this).load(photo.link)
            .error(R.drawable.placeholder)
            .placeholder(R.drawable.placeholder)
            .into(photo_image)
    }

}
