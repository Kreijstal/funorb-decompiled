/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VerticalScrollbar extends UiComponent {
    private UiComponent pageDownRegion;
    static String field_Qb;
    private int repeatDelay;
    private UiComponent upButton;
    private UiComponent pageUpRegion;
    static int[] rankingSortIndices;
    static TableRowSubmission field_Ub;
    private UiComponent thumb;
    private UiComponent downButton;
    static String field_Rb;
    private UiComponent track;
    static int[] ninjaBackgroundColors;

    final void setScrollbarBounds(int x, int viewportHeight, int height, byte obfuscationGuard, int width, int scrollOffset, int contentHeight, int y) {
        int var9 = -128 % ((-55 - obfuscationGuard) / 47);
        this.height = height;
        this.width = width;
        this.localY = y;
        this.localX = x;
        this.layoutScrollbar(-98, contentHeight, scrollOffset, viewportHeight);
    }

    final boolean pollPageUp(int obfuscationGuard) {
        if (this.pageUpRegion.pressedButton != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (0 != this.pageUpRegion.capturedButton) {
          if (this.repeatDelay > 0) {
            this.repeatDelay = this.repeatDelay - 1;
          }
          if (this.repeatDelay == 0 &&
            this.thumb.screenY + this.thumb.remainingY > po.pointerY) {
            this.repeatDelay = 3;
            return true;
          }
        }
        if (obfuscationGuard == 2) {
          return false;
        }
        this.pollLineDown(36);
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        QuickChatPhraseDefinition.quickChatMenuRoot.setBounds(param2, param5, param1, param3, (byte) 64);
        if (param6 == 94) {
          if (null != hd.quickChatMenu) {
            hd.quickChatMenu.layoutMenuChain(param6 ^ 94, -HighscoresScreen.field_v + param4, param2, param0, param4, param2);
          }
          return;
        }
    }

    final boolean pollPageDown(byte obfuscationGuard) {
        int var2 = -127 % ((-24 - obfuscationGuard) / 34);
        if (this.pageDownRegion.pressedButton != 0) {
          this.repeatDelay = 20;
          return true;
        }
        if (0 == this.pageDownRegion.capturedButton) {
          return false;
        }
        if (0 < this.repeatDelay) {
          this.repeatDelay = this.repeatDelay - 1;
          if (this.repeatDelay != 0) {
            return false;
          }
          if (this.thumb.remainingHeight + this.thumb.height + (this.thumb.screenY + this.thumb.remainingY) <= po.pointerY) {
            this.repeatDelay = 3;
            return true;
          }
          return false;
        }
        if (this.repeatDelay != 0) {
          return false;
        }
        if (this.thumb.remainingHeight + this.thumb.height + (this.thumb.screenY + this.thumb.remainingY) <= po.pointerY) {
          this.repeatDelay = 3;
          return true;
        }
        return false;
    }

    final static int a(int param0, byte param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        int var2 = -124 % ((35 - param1) / 37);
        return 1 + param0;
    }

    final boolean isThumbCaptured(byte obfuscationGuard) {
        if (obfuscationGuard != 57) {
          return false;
        }
        return this.thumb.capturedButton != 0 ? true : false;
    }

    VerticalScrollbar(long id, UiComponent upStyle, UiComponent downStyle, UiComponent pageStyle, UiComponent thumbStyle) {
        super(id, (UiComponent) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        UiComponent var9 = null;
        UiComponent var10 = null;
        try {
          this.upButton = new UiComponent(0L, upStyle);
          this.downButton = new UiComponent(0L, downStyle);
          this.addChild(this.upButton, 0);
          this.addChild(this.downButton, 0);
          this.track = new UiComponent(0L, (UiComponent) null);
          this.addChild(this.track, 0);
          this.pageUpRegion = new UiComponent(0L, pageStyle);
          this.pageDownRegion = new UiComponent(0L, pageStyle);
          this.pageDownRegion.useParentFrameBounds = true;
          var9 = this.pageUpRegion;
          var10 = var9;
          var10.useParentFrameBounds = true;
          this.track.addChild(this.pageUpRegion, 0);
          this.track.addChild(this.pageDownRegion, 0);
          this.thumb = new UiComponent(0L, thumbStyle);
          this.thumb.draggable = true;
          this.track.addChild(this.thumb, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("fj.<init>(").append(id).append(',');
          if (upStyle == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (downStyle == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (pageStyle == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (thumbStyle == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean pollLineUp(int obfuscationGuard) {
        if (obfuscationGuard != this.upButton.pressedButton) {
          this.repeatDelay = 20;
          return true;
        }
        if (this.upButton.capturedButton == 0) {
          return false;
        }
        if (0 < this.repeatDelay) {
          this.repeatDelay = this.repeatDelay - 1;
          if (this.repeatDelay == 0) {
            this.repeatDelay = 3;
            return true;
          }
          return false;
        }
        if (this.repeatDelay == 0) {
          this.repeatDelay = 3;
          return true;
        }
        return false;
    }

    VerticalScrollbar(long id, VerticalScrollbar styleTemplate) {
        this(id, styleTemplate.upButton, styleTemplate.downButton, styleTemplate.pageUpRegion, styleTemplate.thumb);
    }

    public static void e(byte param0) {
        ninjaBackgroundColors = null;
        field_Rb = null;
        field_Ub = null;
        field_Qb = null;
        if (param0 == 33) {
          rankingSortIndices = null;
          return;
        }
        PaletteFont var2 = (PaletteFont) null;
        VerticalScrollbar.a(31, (String) null, 82, (PaletteFont) null, 55, -109);
        rankingSortIndices = null;
    }

    final int getDraggedScrollOffset(int contentHeight, int viewportHeight, byte obfuscationGuard, boolean clampMinimumFirst) {
        int thumbPosition = 0;
        int scrollRange = 0;
        int scrollOffset = 0;
        int guardDivision = -116 % ((49 - obfuscationGuard) / 47);
        int thumbTravel = -this.thumb.height + this.track.height;
        if (0 < thumbTravel) {
          thumbPosition = this.thumb.localY;
          scrollRange = -viewportHeight + contentHeight;
          scrollOffset = (thumbTravel / 2 + thumbPosition * scrollRange) / thumbTravel;
        }
        if (clampMinimumFirst) {
          if (scrollOffset < 0) {
            scrollOffset = 0;
          }
          if (-viewportHeight + contentHeight < scrollOffset) {
            scrollOffset = -viewportHeight + contentHeight;
          }
          return scrollOffset;
        }
        if (-viewportHeight + contentHeight < scrollOffset) {
          scrollOffset = -viewportHeight + contentHeight;
        }
        if (scrollOffset < 0) {
          scrollOffset = 0;
          return scrollOffset;
        }
        return scrollOffset;
    }

    final static RgbSprite[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 == 1) {
          return SpriteGeometry.a(param0, 1, 1, 9361, param2, 1, 3, param4, param1);
        }
        field_Ub = (TableRowSubmission) null;
        return SpriteGeometry.a(param0, 1, 1, 9361, param2, 1, 3, param4, param1);
    }

    final void layoutScrollbar(int obfuscationGuard, int contentHeight, int scrollOffset, int viewportHeight) {
        int upButtonHeight = 0;
        int downButtonY = 0;
        int emptyContentRange = 0;
        int emptyThumbTravel = 0;
        int emptyThumbY = 0;
        int emptyPageSplit = 0;
        UiComponent emptyUpButton = null;
        UiComponent emptyDownButton = null;
        UiComponent emptyTrack = null;
        UiComponent emptyPageUpRegion = null;
        UiComponent emptyPageDownRegion = null;
        UiComponent emptyThumb = null;
        UiComponent upButton;
        UiComponent downButton;
        UiComponent track;
        UiComponent pageUpRegion;
        UiComponent pageDownRegion;
        UiComponent thumb;
        int scrollRange;
        int thumbTravel;
        int thumbY;
        int pageSplit;
        if (this.width * 2 <= this.height) {
          upButtonHeight = this.width;
          downButtonY = this.height - this.width;
        } else {
          downButtonY = this.height / 2;
          upButtonHeight = this.height / 2;
        }
        int trackHeight = -upButtonHeight + downButtonY;
        int thumbHeight = trackHeight;
        if (contentHeight <= 0) {
          emptyContentRange = -viewportHeight + contentHeight;
          emptyThumbTravel = trackHeight - thumbHeight;
          emptyThumbY = 0;
          if (emptyContentRange > 0) {
            emptyThumbY = (emptyContentRange / 2 + emptyThumbTravel * scrollOffset) / emptyContentRange;
          }
          emptyPageSplit = emptyThumbY + thumbHeight / 2;
          emptyUpButton = this.upButton;
          emptyUpButton.localY = 0;
          emptyUpButton.height = upButtonHeight;
          emptyUpButton.width = this.width;
          emptyUpButton.localX = 0;
          emptyDownButton = this.downButton;
          emptyDownButton.localY = downButtonY;
          emptyDownButton.height = this.height - downButtonY;
          emptyDownButton.localX = 0;
          emptyDownButton.width = this.width;
          emptyTrack = this.track;
          emptyTrack.localY = upButtonHeight;
          emptyTrack.height = trackHeight;
          emptyTrack.localX = 0;
          emptyTrack.width = this.width;
          emptyPageUpRegion = this.pageUpRegion;
          emptyPageUpRegion.width = this.width;
          emptyPageUpRegion.height = emptyPageSplit;
          emptyPageUpRegion.localX = 0;
          emptyPageUpRegion.localY = 0;
          emptyPageDownRegion = this.pageDownRegion;
          emptyPageDownRegion.width = this.width;
          if (obfuscationGuard <= -75) {
            emptyPageDownRegion.height = trackHeight - emptyPageSplit;
            emptyPageDownRegion.localY = emptyPageSplit;
            emptyPageDownRegion.localX = 0;
            emptyThumb = this.thumb;
            emptyThumb.localY = emptyThumbY;
            this.track.enabled = contentHeight > viewportHeight ? true : false;
            this.downButton.enabled = contentHeight > viewportHeight ? true : false;
            this.upButton.enabled = contentHeight > viewportHeight ? true : false;
            emptyThumb.height = thumbHeight;
            emptyThumb.width = this.width;
            emptyThumb.localX = 0;
            return;
          }
          return;
        }
        thumbHeight = thumbHeight * viewportHeight / contentHeight;
        if (this.width > thumbHeight) {
          thumbHeight = this.width;
        }
        if (trackHeight < thumbHeight) {
          thumbHeight = trackHeight;
        }
        scrollRange = -viewportHeight + contentHeight;
        thumbTravel = trackHeight - thumbHeight;
        thumbY = 0;
        if (scrollRange > 0) {
          thumbY = (scrollRange / 2 + thumbTravel * scrollOffset) / scrollRange;
        }
        pageSplit = thumbY + thumbHeight / 2;
        upButton = this.upButton;
        upButton.localY = 0;
        upButton.height = upButtonHeight;
        upButton.width = this.width;
        upButton.localX = 0;
        downButton = this.downButton;
        downButton.localY = downButtonY;
        downButton.height = this.height - downButtonY;
        downButton.localX = 0;
        downButton.width = this.width;
        track = this.track;
        track.localY = upButtonHeight;
        track.height = trackHeight;
        track.localX = 0;
        track.width = this.width;
        pageUpRegion = this.pageUpRegion;
        pageUpRegion.width = this.width;
        pageUpRegion.height = pageSplit;
        pageUpRegion.localX = 0;
        pageUpRegion.localY = 0;
        pageDownRegion = this.pageDownRegion;
        pageDownRegion.width = this.width;
        if (obfuscationGuard <= -75) {
          pageDownRegion.height = trackHeight - pageSplit;
          pageDownRegion.localY = pageSplit;
          pageDownRegion.localX = 0;
          thumb = this.thumb;
          thumb.localY = thumbY;
          this.track.enabled = contentHeight > viewportHeight ? true : false;
          this.downButton.enabled = contentHeight > viewportHeight ? true : false;
          this.upButton.enabled = contentHeight > viewportHeight ? true : false;
          thumb.height = thumbHeight;
          thumb.width = this.width;
          thumb.localX = 0;
          return;
        }
    }

    final static void a(int param0, String param1, int param2, PaletteFont param3, int param4, int param5) {
        try {
          if (param4 != -15531) {
            VerticalScrollbar.e((byte) 21);
          }
          InteractiveGameClient.a(param2, param3, param1, 320, param0, param5, -126);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean pollLineDown(int obfuscationGuard) {
        if (0 != this.downButton.pressedButton) {
          this.repeatDelay = 20;
          return true;
        }
        if (obfuscationGuard != 2) {
          return true;
        }
        if (this.downButton.capturedButton == 0) {
          return false;
        }
        if (this.repeatDelay > 0) {
          this.repeatDelay = this.repeatDelay - 1;
        }
        if (this.repeatDelay != 0) {
          return false;
        }
        this.repeatDelay = 3;
        return true;
    }

    static {
        field_Ub = null;
        field_Rb = "Return to Main Menu";
        ninjaBackgroundColors = new int[]{15091200, 16494651, 3781573, 12658477, 26679};
    }
}
