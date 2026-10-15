/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollPane extends UiComponent {
    UiComponent content;
    static int field_Pb;
    UiComponent viewport;
    VerticalScrollbar scrollbar;
    static int chatHistorySize;
    static int collisionY256;

    final void updateScroll(boolean obfuscationGuard, int lineStep, boolean clampMinimumFirst, int wheelDisplacement) {
        boolean discarded$0 = false;
        this.applyScrollInput(wheelDisplacement, 0, this.viewport.height, lineStep, clampMinimumFirst);
        if (!obfuscationGuard) {
          discarded$0 = this.layoutAndScroll(85, true, 28, 9, 42, false, -118);
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == gd.field_b) {
            return false;
          }
          var2_int = -66 / ((30 - param1) / 42);
          stackIn_6_0 = !(param0.toLowerCase().indexOf(gd.field_b.toLowerCase()) < 0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("mm.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setScrollPaneBounds(int contentRightInset, byte obfuscationGuard, int width, int x, int y, int scrollbarWidth, int height) {
        this.localY = y;
        if (obfuscationGuard < -108) {
          this.height = height;
          this.width = width;
          this.localX = x;
          this.layoutScrollPane((byte) -45, scrollbarWidth, contentRightInset);
          return;
        }
    }

    ScrollPane(long id, UiComponent content, UiComponent viewportStyle, VerticalScrollbar scrollbarStyle) {
        super(id, (UiComponent) null);
        try {
          this.viewport = new UiComponent(0L, viewportStyle);
          this.scrollbar = new VerticalScrollbar(0L, scrollbarStyle);
          this.addChild(this.viewport, 0);
          this.addChild(this.scrollbar, 0);
          this.content = content;
          this.viewport.addChild(content, 0);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "mm.<init>(" + id + ',' + (content != null ? "{...}" : "null") + ',' + (viewportStyle != null ? "{...}" : "null") + ',' + (scrollbarStyle != null ? "{...}" : "null") + ')');
        }
    }

    private final void applyScrollInput(int wheelDisplacement, int obfuscationGuard, int pageStep, int lineStep, boolean clampMinimumFirst) {
        if (this.scrollbar.pollLineUp(obfuscationGuard ^ obfuscationGuard)) {
          this.content.remainingY = this.content.remainingY + lineStep;
        }
        if (this.scrollbar.pollLineDown(2)) {
          this.content.remainingY = this.content.remainingY - lineStep;
        }
        if (this.scrollbar.pollPageUp(obfuscationGuard ^ 2)) {
          this.content.remainingY = this.content.remainingY + pageStep;
        }
        if (this.scrollbar.pollPageDown((byte) -79)) {
          this.content.remainingY = this.content.remainingY - pageStep;
        }
        if (this.activeInside) {
          this.content.remainingY = this.content.remainingY - wheelDisplacement;
        }
        if (!clampMinimumFirst) {
          if (!(-(this.content.remainingY + this.content.localY) <= -this.viewport.height + this.content.remainingHeight + this.content.height)) {
            this.content.remainingY = -this.content.localY - (this.content.remainingHeight + this.content.height - this.viewport.height);
          }
          if (0 <= -(this.content.localY + this.content.remainingY)) {
            if (this.scrollbar.isThumbCaptured((byte) 57)) {
              this.content.localY = -this.scrollbar.getDraggedScrollOffset(this.content.height, this.viewport.height, (byte) 106, clampMinimumFirst);
              this.content.remainingY = 0;
              this.scrollbar.layoutScrollbar(-76, this.content.height, -this.content.localY, this.viewport.height);
              return;
            }
            this.scrollbar.layoutScrollbar(-76, this.content.height, -this.content.localY, this.viewport.height);
            return;
          }
          this.content.remainingY = -this.content.localY;
          if (this.scrollbar.isThumbCaptured((byte) 57)) {
            this.content.localY = -this.scrollbar.getDraggedScrollOffset(this.content.height, this.viewport.height, (byte) 106, clampMinimumFirst);
            this.content.remainingY = 0;
            this.scrollbar.layoutScrollbar(-76, this.content.height, -this.content.localY, this.viewport.height);
            return;
          }
          this.scrollbar.layoutScrollbar(-76, this.content.height, -this.content.localY, this.viewport.height);
          return;
        }
        if (-(this.content.remainingY + this.content.localY) < 0) {
          this.content.remainingY = -this.content.localY;
          if (-(this.content.remainingY + this.content.localY) > this.content.height + this.content.remainingHeight - this.viewport.height) {
            this.content.remainingY = -this.content.localY - (-this.viewport.height + (this.content.height + this.content.remainingHeight));
            if (this.scrollbar.isThumbCaptured((byte) 57)) {
              this.content.localY = -this.scrollbar.getDraggedScrollOffset(this.content.height, this.viewport.height, (byte) 106, clampMinimumFirst);
              this.content.remainingY = 0;
            }
            this.scrollbar.layoutScrollbar(-76, this.content.height, -this.content.localY, this.viewport.height);
            return;
          }
          if (!this.scrollbar.isThumbCaptured((byte) 57)) {
            this.scrollbar.layoutScrollbar(-76, this.content.height, -this.content.localY, this.viewport.height);
            return;
          }
          this.content.localY = -this.scrollbar.getDraggedScrollOffset(this.content.height, this.viewport.height, (byte) 106, clampMinimumFirst);
          this.content.remainingY = 0;
          this.scrollbar.layoutScrollbar(-76, this.content.height, -this.content.localY, this.viewport.height);
          return;
        }
        if (-(this.content.remainingY + this.content.localY) > this.content.height + this.content.remainingHeight - this.viewport.height) {
          this.content.remainingY = -this.content.localY - (-this.viewport.height + (this.content.height + this.content.remainingHeight));
          if (!this.scrollbar.isThumbCaptured((byte) 57)) {
            this.scrollbar.layoutScrollbar(-76, this.content.height, -this.content.localY, this.viewport.height);
            return;
          }
          this.content.localY = -this.scrollbar.getDraggedScrollOffset(this.content.height, this.viewport.height, (byte) 106, clampMinimumFirst);
          this.content.remainingY = 0;
          this.scrollbar.layoutScrollbar(-76, this.content.height, -this.content.localY, this.viewport.height);
          return;
        }
        if (!this.scrollbar.isThumbCaptured((byte) 57)) {
          this.scrollbar.layoutScrollbar(-76, this.content.height, -this.content.localY, this.viewport.height);
          return;
        }
        this.content.localY = -this.scrollbar.getDraggedScrollOffset(this.content.height, this.viewport.height, (byte) 106, clampMinimumFirst);
        this.content.remainingY = 0;
        this.scrollbar.layoutScrollbar(-76, this.content.height, -this.content.localY, this.viewport.height);
    }

    private final boolean layoutAndScroll(int gap, boolean keepChildLayout, int wheelDisplacement, int lineStep, int pageStep, boolean allowActiveRelayout, int obfuscationGuard) {
        int requestedKeepLayout = 0;
        int inactiveKeepLayout;
        int activeKeepLayout;
        int relayoutKeepLayout;
        if (keepChildLayout) {
          requestedKeepLayout = 1;
          this.content.layoutVerticalContent(this.viewport.height, gap, -2147483648, requestedKeepLayout != 0);
          this.applyScrollInput(wheelDisplacement, obfuscationGuard, pageStep, lineStep, false);
          return requestedKeepLayout != 0;
        }
        if (!this.activeInside) {
          inactiveKeepLayout = 0;
          this.content.layoutVerticalContent(this.viewport.height, gap, -2147483648, inactiveKeepLayout != 0);
          this.applyScrollInput(wheelDisplacement, obfuscationGuard, pageStep, lineStep, false);
          return inactiveKeepLayout != 0;
        }
        if (!allowActiveRelayout) {
          activeKeepLayout = 1;
          this.content.layoutVerticalContent(this.viewport.height, gap, -2147483648, activeKeepLayout != 0);
          this.applyScrollInput(wheelDisplacement, obfuscationGuard, pageStep, lineStep, false);
          return activeKeepLayout != 0;
        }
        relayoutKeepLayout = 0;
        this.content.layoutVerticalContent(this.viewport.height, gap, -2147483648, relayoutKeepLayout != 0);
        this.applyScrollInput(wheelDisplacement, obfuscationGuard, pageStep, lineStep, false);
        return relayoutKeepLayout != 0;
    }

    private final void layoutScrollPane(byte obfuscationGuard, int scrollbarWidth, int contentRightInset) {
        this.content.localX = 0;
        this.viewport.height = this.height;
        this.viewport.width = -contentRightInset + this.width - scrollbarWidth;
        if (obfuscationGuard == -45) {
          this.content.width = -scrollbarWidth + (this.width - contentRightInset);
          this.scrollbar.setScrollbarBounds(-scrollbarWidth + this.width, this.viewport.height, this.height, (byte) -110, scrollbarWidth, -this.content.localY, this.content.height, 0);
          return;
        }
        this.setScrollPaneBounds(-40, (byte) -114, -15, 122, 34, 27, 42);
        this.content.width = -scrollbarWidth + (this.width - contentRightInset);
        this.scrollbar.setScrollbarBounds(-scrollbarWidth + this.width, this.viewport.height, this.height, (byte) -110, scrollbarWidth, -this.content.localY, this.content.height, 0);
    }

    final static void h(int param0) {
        SoundPlayback var1 = null;
        int var2 = 0;
        String var3 = null;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        SoundPlayback var1Lifetime1;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          DirectByteStorage.field_f.pump();
          if (param0 != -29448) {
            var3 = (String) null;
            ScrollPane.a((String) null, (byte) 116);
          }
          UnderwaterBackground.field_w.pump();
          GameRenderAudioHelpers.field_c = GameRenderAudioHelpers.field_c - 1;
          if (GameRenderAudioHelpers.field_c == 0) {
            GameRenderAudioHelpers.field_c = 200;
            var1 = (SoundPlayback) (QuickChatPhraseDefinition.soundPlaybacks.first(-110));
            while (var1 != null) {
              if (!var1.sourceNode.isLinked(0)) {
                var1.unlink((byte) 111);
              }
              var1 = (SoundPlayback) (QuickChatPhraseDefinition.soundPlaybacks.next((byte) 116));
            }
            if (WidgetLayer.field_M != null) {
              var1Lifetime1 = (SoundPlayback) (WidgetLayer.field_M.first(param0 + 29407));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.sourceNode.isLinked(0)) {
                  var1Lifetime1.unlink((byte) 111);
                }
                var1Lifetime1 = (SoundPlayback) (WidgetLayer.field_M.next((byte) 116));
              }
            }
          }
          if (null != ConditionalTextValue.musicSynthesizer) {
            stackIn_20_0 = ConditionalTextValue.musicSynthesizer.hasMidiData(-1);
            if (!stackIn_20_0) {
              IsaacGenerator.field_a = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "mm.D(" + param0 + ')');
        }
    }

    final boolean updateContentLayout(int gap, int wheelDisplacement, int lineStep, int obfuscationGuard, boolean allowActiveRelayout, boolean keepChildLayout) {
        if (obfuscationGuard == 22676) {
          return this.layoutAndScroll(gap, keepChildLayout, wheelDisplacement, lineStep, this.viewport.height, allowActiveRelayout, 0);
        }
        field_Pb = 127;
        return this.layoutAndScroll(gap, keepChildLayout, wheelDisplacement, lineStep, this.viewport.height, allowActiveRelayout, 0);
    }

    static {
        field_Pb = 3;
    }
}
