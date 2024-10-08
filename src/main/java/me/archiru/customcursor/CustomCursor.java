/*
 * Copyright (c) 2018, Kruithne <kruithne@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package me.archiru.customcursor;

import java.awt.image.BufferedImage;
import javax.annotation.Nullable;
import lombok.Getter;
import net.runelite.client.util.ImageUtil;

@Getter
public enum CustomCursor
{
    RS3_GOLD("RS3 Gold", "cursor-rs3-gold.png"),
    RS3_SILVER("RS3 Silver", "cursor-rs3-silver.png"),
    DRAGON_DAGGER("Dragon Dagger", "cursor-dragon-dagger.png"),
    DRAGON_DAGGER_POISON("Dragon Dagger (p)", "cursor-dragon-dagger-p.png"),
    TROUT("Trout", "cursor-trout.png"),
    DRAGON_SCIMITAR("Dragon Scimitar", "cursor-dragon-scimitar.png"),
    EQUIPPED_WEAPON("Equipped Weapon"),
    CUSTOM_IMAGE("Custom Image");

    private final String name;
    @Nullable
    private final BufferedImage cursorImage;

    CustomCursor(String name)
    {
        this.name = name;
        this.cursorImage = null;
    }

    CustomCursor(String name, String icon)
    {
        this.name = name;
        this.cursorImage = ImageUtil.loadImageResource(CustomCursorPlugin.class, icon);
    }

    @Override
    public String toString()
    {
        return name;
    }
}