package jp.techacademy.takumi.nishida.jumpactiongame

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite

class Enemy(texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int )
    : GameObject(texture, srcX, srcY, srcWidth,srcHeight){

    companion object{
        val ENEMY_WIDTH = 1.0f
        val ENEMY_HEIGHT = 1.0f
    }

    init {
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT)
    }
}