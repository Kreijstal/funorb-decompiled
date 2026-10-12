/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VerticalScrollbar extends ClientUiComponent {
    private ClientUiComponent thumb;
    static CombatSandbox field_Rb;
    static String field_Jb;
    static char[] field_Nb;
    static String field_Kb;
    private ClientUiComponent pageDownArea;
    static String[][] field_Mb;
    static String field_Tb;
    static tu field_Sb;
    private ClientUiComponent upButton;
    private ClientUiComponent pageUpArea;
    private ClientUiComponent track;
    private int repeatTicks;
    private ClientUiComponent downButton;

    VerticalScrollbar(long key, ClientUiComponent upStyle, ClientUiComponent downStyle, ClientUiComponent trackStyle, ClientUiComponent thumbStyle) {
        super(key, (ClientUiComponent) null);
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
        ClientUiComponent var9 = null;
        ClientUiComponent var10 = null;
        try {
          this.upButton = new ClientUiComponent(0L, upStyle);
          this.downButton = new ClientUiComponent(0L, downStyle);
          this.addChild(this.upButton, 42);
          this.addChild(this.downButton, 59);
          this.track = new ClientUiComponent(0L, (ClientUiComponent) null);
          this.addChild(this.track, 101);
          this.pageUpArea = new ClientUiComponent(0L, trackStyle);
          this.pageDownArea = new ClientUiComponent(0L, trackStyle);
          this.pageDownArea.drawSkinInParentBounds = true;
          var9 = this.pageUpArea;
          var10 = var9;
          var10.drawSkinInParentBounds = true;
          this.track.addChild(this.pageUpArea, 81);
          this.track.addChild(this.pageDownArea, 53);
          this.thumb = new ClientUiComponent(0L, thumbStyle);
          this.thumb.draggable = true;
          this.track.addChild(this.thumb, 47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("ll.<init>(").append(key).append(',');
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
          if (trackStyle == null) {
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_Nb = null;
        field_Tb = null;
        field_Kb = null;
        field_Mb = (String[][]) null;
        field_Jb = null;
        if (param0 == -1) {
          field_Rb = null;
          field_Sb = null;
          return;
        }
    }

    VerticalScrollbar(long key, VerticalScrollbar style) {
        this(key, style.upButton, style.downButton, style.pageUpArea, style.thumb);
    }

    final void setLayout(int obfuscationGuard, int width, int height, int y, int contentHeight, int viewportHeight, int x, int scrollOffset) {
        this.height = height;
        if (obfuscationGuard == 201) {
          this.x = x;
          this.width = width;
          this.y = y;
          this.layoutThumb(obfuscationGuard - 201, contentHeight, viewportHeight, scrollOffset);
          return;
        }
        this.getDraggedScrollOffset(30, false, 45, -68);
        this.x = x;
        this.width = width;
        this.y = y;
        this.layoutThumb(obfuscationGuard - 201, contentHeight, viewportHeight, scrollOffset);
    }

    final boolean pollScrollDown(int obfuscationGuard) {
        if (this.downButton.pressedButton != 0) {
          this.repeatTicks = 20;
          return true;
        }
        int var2 = -103 % ((obfuscationGuard + 72) / 45);
        if (0 == this.downButton.heldPressButton) {
          return false;
        }
        if (this.repeatTicks > 0) {
          this.repeatTicks = this.repeatTicks - 1;
        }
        if (0 == this.repeatTicks) {
          this.repeatTicks = 3;
          return true;
        }
        return false;
    }

    final void layoutThumb(int pageDownX, int contentHeight, int viewportHeight, int scrollOffset) {
        int upButtonHeight = 0;
        int downButtonY = 0;
        int nonpositiveContentOverflow = 0;
        int nonpositiveContentTravel = 0;
        int nonpositiveContentThumbY = 0;
        int nonpositiveContentSplitY = 0;
        ClientUiComponent nonpositiveContentUpButton = null;
        ClientUiComponent nonpositiveContentDownButton = null;
        ClientUiComponent nonpositiveContentTrack = null;
        ClientUiComponent nonpositiveContentPageUpArea = null;
        ClientUiComponent nonpositiveContentPageDownArea = null;
        ClientUiComponent nonpositiveContentThumb = null;
        ClientUiComponent upButton;
        ClientUiComponent downButton;
        ClientUiComponent track;
        ClientUiComponent pageUpArea;
        ClientUiComponent pageDownArea;
        ClientUiComponent thumb;
        int scrollOverflow;
        int thumbTravel;
        int thumbY;
        int trackSplitY;
        if (2 * this.width <= this.height) {
          upButtonHeight = this.width;
          downButtonY = this.height - this.width;
        } else {
          downButtonY = this.height / 2;
          upButtonHeight = this.height / 2;
        }
        int trackHeight = -upButtonHeight + downButtonY;
        int thumbHeight = trackHeight;
        if (contentHeight <= 0) {
          nonpositiveContentOverflow = -viewportHeight + contentHeight;
          nonpositiveContentTravel = trackHeight - thumbHeight;
          nonpositiveContentThumbY = 0;
          if (nonpositiveContentOverflow > 0) {
            nonpositiveContentThumbY = (nonpositiveContentOverflow / 2 + scrollOffset * nonpositiveContentTravel) / nonpositiveContentOverflow;
          }
          nonpositiveContentSplitY = nonpositiveContentThumbY + thumbHeight / 2;
          nonpositiveContentUpButton = this.upButton;
          nonpositiveContentUpButton.height = upButtonHeight;
          nonpositiveContentUpButton.y = 0;
          nonpositiveContentUpButton.x = 0;
          nonpositiveContentUpButton.width = this.width;
          nonpositiveContentDownButton = this.downButton;
          nonpositiveContentDownButton.x = 0;
          nonpositiveContentDownButton.width = this.width;
          nonpositiveContentDownButton.y = downButtonY;
          nonpositiveContentDownButton.height = this.height - downButtonY;
          nonpositiveContentTrack = this.track;
          nonpositiveContentTrack.height = trackHeight;
          nonpositiveContentTrack.y = upButtonHeight;
          nonpositiveContentTrack.x = 0;
          nonpositiveContentTrack.width = this.width;
          nonpositiveContentPageUpArea = this.pageUpArea;
          nonpositiveContentPageUpArea.y = 0;
          nonpositiveContentPageUpArea.height = nonpositiveContentSplitY;
          nonpositiveContentPageUpArea.width = this.width;
          nonpositiveContentPageUpArea.x = 0;
          nonpositiveContentPageDownArea = this.pageDownArea;
          nonpositiveContentPageDownArea.x = pageDownX;
          nonpositiveContentPageDownArea.y = nonpositiveContentSplitY;
          nonpositiveContentPageDownArea.height = trackHeight - nonpositiveContentSplitY;
          nonpositiveContentPageDownArea.width = this.width;
          nonpositiveContentThumb = this.thumb;
          this.track.inputEnabled = contentHeight > viewportHeight ? true : false;
          this.downButton.inputEnabled = contentHeight > viewportHeight ? true : false;
          this.upButton.inputEnabled = contentHeight > viewportHeight ? true : false;
          nonpositiveContentThumb.x = 0;
          nonpositiveContentThumb.y = nonpositiveContentThumbY;
          nonpositiveContentThumb.height = thumbHeight;
          nonpositiveContentThumb.width = this.width;
          return;
        }
        thumbHeight = thumbHeight * viewportHeight / contentHeight;
        if (!(thumbHeight >= this.width)) {
          thumbHeight = this.width;
        }
        if (trackHeight < thumbHeight) {
          thumbHeight = trackHeight;
        }
        scrollOverflow = -viewportHeight + contentHeight;
        thumbTravel = trackHeight - thumbHeight;
        thumbY = 0;
        if (scrollOverflow > 0) {
          thumbY = (scrollOverflow / 2 + scrollOffset * thumbTravel) / scrollOverflow;
        }
        trackSplitY = thumbY + thumbHeight / 2;
        upButton = this.upButton;
        upButton.height = upButtonHeight;
        upButton.y = 0;
        upButton.x = 0;
        upButton.width = this.width;
        downButton = this.downButton;
        downButton.x = 0;
        downButton.width = this.width;
        downButton.y = downButtonY;
        downButton.height = this.height - downButtonY;
        track = this.track;
        track.height = trackHeight;
        track.y = upButtonHeight;
        track.x = 0;
        track.width = this.width;
        pageUpArea = this.pageUpArea;
        pageUpArea.y = 0;
        pageUpArea.height = trackSplitY;
        pageUpArea.width = this.width;
        pageUpArea.x = 0;
        pageDownArea = this.pageDownArea;
        pageDownArea.x = pageDownX;
        pageDownArea.y = trackSplitY;
        pageDownArea.height = trackHeight - trackSplitY;
        pageDownArea.width = this.width;
        thumb = this.thumb;
        this.track.inputEnabled = contentHeight > viewportHeight ? true : false;
        this.downButton.inputEnabled = contentHeight > viewportHeight ? true : false;
        this.upButton.inputEnabled = contentHeight > viewportHeight ? true : false;
        thumb.x = 0;
        thumb.y = thumbY;
        thumb.height = thumbHeight;
        thumb.width = this.width;
    }

    final boolean isThumbHeld(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          return this.thumb.heldPressButton != 0 ? true : false;
        }
        VerticalScrollbar.k(-78);
        return this.thumb.heldPressButton != 0 ? true : false;
    }

    final boolean pollScrollUp(int obfuscationGuard) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (this.upButton.pressedButton != 0) {
          this.repeatTicks = 20;
          return true;
        }
        if (this.upButton.heldPressButton == 0) {
          var2 = 33 % ((18 - obfuscationGuard) / 47);
          return false;
        }
        if (this.repeatTicks > 0) {
          this.repeatTicks = this.repeatTicks - 1;
          if (this.repeatTicks == 0) {
            this.repeatTicks = 3;
            return true;
          }
          var2Lifetime1 = 33 % ((18 - obfuscationGuard) / 47);
          return false;
        }
        if (this.repeatTicks == 0) {
          this.repeatTicks = 3;
          return true;
        }
        var2Lifetime2 = 33 % ((18 - obfuscationGuard) / 47);
        return false;
    }

    final int getDraggedScrollOffset(int viewportHeight, boolean clampMinimumFirst, int contentHeight, int obfuscationGuard) {
        int scrollOffset;
        int thumbTravel;
        int thumbY;
        int scrollOverflow;
        scrollOffset = 0;
        thumbTravel = this.track.height - this.thumb.height;
        if (thumbTravel > 0) {
          thumbY = this.thumb.y;
          scrollOverflow = -viewportHeight + contentHeight;
          scrollOffset = (thumbY * scrollOverflow + thumbTravel / 2) / thumbTravel;
        }
        if (clampMinimumFirst) {
          if (scrollOffset < 0) {
            scrollOffset = 0;
          }
          if (-viewportHeight + contentHeight < scrollOffset) {
            scrollOffset = contentHeight - viewportHeight;
          }
        } else {
          if (contentHeight - viewportHeight < scrollOffset) {
            scrollOffset = -viewportHeight + contentHeight;
          }
          if (0 > scrollOffset) {
            scrollOffset = 0;
          }
        }
        if (obfuscationGuard > 102) {
          return scrollOffset;
        }
        this.pageDownArea = (ClientUiComponent) null;
        return scrollOffset;
    }

    final static java.awt.Canvas p(int param0) {
        if (param0 != 0) {
          field_Jb = (String) null;
          return FixedQuaternion.field_a == null ? IndexedSpriteBase.field_b : (java.awt.Canvas) ((Object) FixedQuaternion.field_a);
        }
        return FixedQuaternion.field_a == null ? IndexedSpriteBase.field_b : (java.awt.Canvas) ((Object) FixedQuaternion.field_a);
    }

    final boolean pollPageUp(int obfuscationGuard) {
        if (this.pageUpArea.pressedButton != 0) {
          this.repeatTicks = 20;
          return true;
        }
        if (obfuscationGuard > -31) {
          this.pollScrollDown(109);
        }
        if (this.pageUpArea.heldPressButton == 0) {
          return false;
        }
        if (this.repeatTicks > 0) {
          this.repeatTicks = this.repeatTicks - 1;
        }
        if (this.repeatTicks != 0) {
          return false;
        }
        if (this.thumb.pendingYDelta + this.thumb.screenY <= ko.pointerY) {
          return false;
        }
        this.repeatTicks = 3;
        return true;
    }

    final boolean pollPageDown(int obfuscationGuard) {
        if (this.pageDownArea.pressedButton != 0) {
          this.repeatTicks = 20;
          return true;
        }
        if (this.pageDownArea.heldPressButton == 0) {
          if (obfuscationGuard == 28809) {
            return false;
          }
          this.track = (ClientUiComponent) null;
          return false;
        }
        if (this.repeatTicks > 0) {
          this.repeatTicks = this.repeatTicks - 1;
        }
        if (0 == this.repeatTicks) {
          if (ko.pointerY >= this.thumb.pendingHeightDelta + (this.thumb.height + this.thumb.pendingYDelta + this.thumb.screenY)) {
            this.repeatTicks = 3;
            return true;
          }
          if (obfuscationGuard == 28809) {
            return false;
          }
          this.track = (ClientUiComponent) null;
          return false;
        }
        if (obfuscationGuard == 28809) {
          return false;
        }
        this.track = (ClientUiComponent) null;
        return false;
    }

    static {
        field_Nb = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_Jb = "level <%0> prestige";
        field_Kb = "Runite is a wondrous material, creating armours that help to protect well from all different types of damage.";
        field_Tb = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
