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

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("bettercustomcursor")
public interface CustomCursorConfig extends Config
{
	@ConfigItem(
			keyName = "cursorStyle",
			name = "Cursor",
			description = "Select which cursor you wish to use"
	)
	default CustomCursor selectedCursor()
	{
		return CustomCursor.RS3_GOLD;
	}

	// Allows someone to use crosshair cursors ect
	@Range(
			min = 0,
			max = 31
	)
	@ConfigItem(
			keyName = "cursorXPoint",
			name = "Cursor X Point",
			description = "Select which x point on the cursor image you wish to use (e.g., 0 is left, 16 is middle, 31 is right)"
	)
	default int cursorXPoint() {
		return 0;
	}

	@Range(
			min = 0,
			max = 31
	)
	@ConfigItem(
			keyName = "cursorYPoint",
			name = "Cursor Y Point",
			description = "Select which y point on the cursor image you wish to use (e.g., 0 is top, 16 is middle, 31 is bottom)"
	)
	default int cursorYPoint() {
		return 0;
	}
}