/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableModalPanel {
    static String field_kb;
    private AlphaContainer contentWrapper;
    static int field_jb;
    static String field_bb;
    private int resizeTicks;
    private int fadeOutTicks;
    private TerrainMaskSupport transitionPhase;
    private int transitionTick;
    static TrackerMusicDefinition field_eb;
    private int headerInset;
    private int fadeInTicks;
    private UiComponent pendingContent;

    void transitionToContent(UiComponent content, int guard) {
        String stackIn_11_2 = null;
        try {
          this.pendingContent = content;
          if (mc.field_c == this.transitionPhase) {
            this.animateResize(false, this.resizeTicks, 12 + this.pendingContent.width, this.pendingContent.height + this.headerInset + 12);
            this.transitionTick = 0;
          } else if (this.transitionPhase != MainMenuScreen.field_a) {
            this.transitionTick = 0;
            this.transitionPhase = MainMenuScreen.field_a;
          }
          if (guard == 30) {
            return;
          }
          this.refreshVisibilityAndCheckClosed((byte) -72);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("fj.D(");
          if (content == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    ContentTransitionDialog(ModalStack param0, UiComponent param1, int param2, int param3, int param4) {
        super(param0, param1.width + 12, param1.height + (param2 + 12));
        try {
          this.resizeTicks = param4;
          this.fadeInTicks = param3;
          this.fadeOutTicks = param3;
          this.headerInset = param2;
          this.installContent((byte) -123, param1);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean refreshVisibilityAndCheckClosed(byte guard) {
        int var2 = 50 / ((guard - 7) / 55);
        this.finishTransition(false);
        return super.refreshVisibilityAndCheckClosed((byte) 112);
    }

    public static void releaseStatics(int guard) {
        field_kb = null;
        if (guard != -11555) {
          ContentTransitionDialog.releaseStatics(-20);
          field_bb = null;
          field_eb = null;
          return;
        }
        field_bb = null;
        field_eb = null;
    }

    final void finishTransition(boolean guard) {
        if (null == this.transitionPhase) {
          super.finishTransition(guard);
          return;
        }
        if (this.transitionPhase != QuickChatPhraseCache.field_b) {
          this.resizeAndCenter(255, this.pendingContent.height + 12 + this.headerInset, 12 + this.pendingContent.width);
          this.installContent((byte) -121, this.pendingContent);
        } else {
          this.transitionPhase = null;
          this.contentWrapper.alpha = 256;
          super.finishTransition(guard);
          return;
        }
        this.transitionPhase = null;
        this.contentWrapper.alpha = 256;
        super.finishTransition(guard);
    }

    boolean updateAnimationsAndCheckClosed(int guard) {
        int var3 = EscapeVector.obfuscationControl;
        if (guard == -13907) {
          if (null == this.transitionPhase) {
            return super.updateAnimationsAndCheckClosed(-13907);
          }
          if (this.transitionPhase != MainMenuScreen.field_a) {
            if (QuickChatPhraseCache.field_b != this.transitionPhase) {
              return super.updateAnimationsAndCheckClosed(-13907);
            }
            int fieldTemp$0 = this.transitionTick + 1;
            this.transitionTick = this.transitionTick + 1;
            if (fieldTemp$0 != this.fadeInTicks) {
              this.contentWrapper.alpha = (this.transitionTick << 8) / this.fadeInTicks;
              return super.updateAnimationsAndCheckClosed(-13907);
            }
            this.transitionPhase = null;
            this.contentWrapper.alpha = 256;
            return super.updateAnimationsAndCheckClosed(-13907);
          }
          int fieldTemp$1 = this.transitionTick + 1;
          this.transitionTick = this.transitionTick + 1;
          if (this.fadeOutTicks == fieldTemp$1) {
            this.transitionPhase = mc.field_c;
            this.animateResize(false, this.resizeTicks, 12 + this.pendingContent.width, 12 - (-this.headerInset - this.pendingContent.height));
            this.transitionTick = 0;
            this.contentWrapper.alpha = 0;
            return super.updateAnimationsAndCheckClosed(-13907);
          }
          this.contentWrapper.alpha = -((this.transitionTick << 8) / this.fadeOutTicks) + 256;
          return super.updateAnimationsAndCheckClosed(-13907);
        }
        field_eb = (TrackerMusicDefinition) null;
        if (null == this.transitionPhase) {
          return super.updateAnimationsAndCheckClosed(-13907);
        }
        if (this.transitionPhase != MainMenuScreen.field_a) {
          if (QuickChatPhraseCache.field_b != this.transitionPhase) {
            return super.updateAnimationsAndCheckClosed(-13907);
          }
          int fieldTemp$2 = this.transitionTick + 1;
          this.transitionTick = this.transitionTick + 1;
          if (fieldTemp$2 != this.fadeInTicks) {
            this.contentWrapper.alpha = (this.transitionTick << 8) / this.fadeInTicks;
            return super.updateAnimationsAndCheckClosed(-13907);
          }
          this.transitionPhase = null;
          this.contentWrapper.alpha = 256;
          return super.updateAnimationsAndCheckClosed(-13907);
        }
        int fieldTemp$3 = this.transitionTick + 1;
        this.transitionTick = this.transitionTick + 1;
        if (this.fadeOutTicks == fieldTemp$3) {
          this.transitionPhase = mc.field_c;
          this.animateResize(false, this.resizeTicks, 12 + this.pendingContent.width, 12 - (-this.headerInset - this.pendingContent.height));
          this.transitionTick = 0;
          this.contentWrapper.alpha = 0;
          return super.updateAnimationsAndCheckClosed(-13907);
        }
        this.contentWrapper.alpha = -((this.transitionTick << 8) / this.fadeOutTicks) + 256;
        return super.updateAnimationsAndCheckClosed(-13907);
    }

    private final void installContent(byte guard, UiComponent content) {
        String stackIn_12_2 = null;
        try {
          if (this.contentWrapper != null) {
            this.contentWrapper.unlink((byte) -62);
          }
          if (content != null) {
            content.setBounds(content.width, 6 + this.headerInset, 6, true, content.height);
            this.contentWrapper = new AlphaContainer(content);
          } else {
            this.contentWrapper = new AlphaContainer();
          }
          this.addChild(this.contentWrapper, false);
          this.pendingContent = null;
          if (guard <= -72) {
            return;
          }
          this.fadeOutTicks = 65;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var3;
          StringBuilder stackIn_11_1 = new StringBuilder().append("fj.A(").append(guard).append(',');
          if (content == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_18_2 = null;
        try {
          if (super.onFocusedKey(root, character, keyCode, 43)) {
            return true;
          }
          if (guard <= 0) {
            this.transitionPhase = (TerrainMaskSupport) null;
          }
          if (this.contentWrapper == null) {
            return false;
          }
          if (98 == keyCode) {
            this.contentWrapper.focusNext(-4659, root);
          }
          if (99 == keyCode) {
            this.contentWrapper.focusNext(-4659, root);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5;
          StringBuilder stackIn_17_1 = new StringBuilder().append("fj.G(");
          if (root == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    final void onResizeComplete(int guard) {
        if (MainMenuScreen.field_a == this.transitionPhase) {
          return;
        }
        this.transitionPhase = QuickChatPhraseCache.field_b;
        this.transitionTick = 0;
        this.installContent((byte) -115, this.pendingContent);
        int var2 = 41 / ((45 - guard) / 53);
        this.pendingContent = null;
        this.contentWrapper.alpha = 0;
    }

    static {
        field_kb = "Next";
        field_bb = "Checking";
        field_jb = 10;
    }
}
