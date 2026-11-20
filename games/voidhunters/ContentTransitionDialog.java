/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableModalPanel {
    private int fadeInDuration;
    private UiComponent pendingContent;
    private int contentResizeDuration;
    private int fadeOutDuration;
    private int contentTopInset;
    private AlphaContainer content;
    private int transitionElapsed;
    private ContentTransitionPhase transitionPhase;

    void transitionToContent(UiComponent param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          this.pendingContent = param0;
          if (GameCanvasResizeListener.field_a == this.transitionPhase) {
            this.animateSize(116, this.pendingContent.width + 12, this.pendingContent.height + this.contentTopInset + 12, this.contentResizeDuration);
            this.transitionElapsed = 0;
          } else {
            if (this.transitionPhase != SettingsChangeFactory.field_e) {
              this.transitionPhase = SettingsChangeFactory.field_e;
              this.transitionElapsed = 0;
            }
          }
          var3_int = 99 / ((6 - param1) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gea.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (null == this.content) {
            return false;
          }
          if (param1 == 98) {
            this.content.requestFocus(0, param2);
          }
          if (param1 == 99) {
            this.content.requestFocus(0, param2);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("gea.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean finishAnimationsAndCheckClosed(byte param0) {
        if (param0 == 55) {
          this.finishResize(-10331);
          return super.finishAnimationsAndCheckClosed((byte) 55);
        }
        this.updateAndCheckClosed(87);
        this.finishResize(-10331);
        return super.finishAnimationsAndCheckClosed((byte) 55);
    }

    final void finishResize(int param0) {
        if (this.transitionPhase == null) {
          super.finishResize(param0);
          return;
        }
        if (this.transitionPhase != SetBloomCoefficientPercentage.field_o) {
          this.setCenteredSize(this.pendingContent.width + 12, -1860440319, this.pendingContent.height + (this.contentTopInset + 12));
          this.installContent(this.pendingContent, (byte) 71);
        } else {
          this.content.alpha = 256;
          this.transitionPhase = null;
          super.finishResize(param0);
          return;
        }
        this.content.alpha = 256;
        this.transitionPhase = null;
        super.finishResize(param0);
    }

    boolean updateAndCheckClosed(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = VoidHunters.field_G;
        if (param0 == 248) {
          if (this.transitionPhase == null) {
            return super.updateAndCheckClosed(248);
          }
          if (this.transitionPhase == SettingsChangeFactory.field_e) {
            fieldTemp$0 = this.transitionElapsed + 1;
            this.transitionElapsed = this.transitionElapsed + 1;
            if (this.fadeOutDuration == fieldTemp$0) {
              this.transitionPhase = GameCanvasResizeListener.field_a;
              this.animateSize(96, this.pendingContent.width + 12, this.pendingContent.height + (this.contentTopInset + 12), this.contentResizeDuration);
              this.content.alpha = 0;
              this.transitionElapsed = 0;
              return super.updateAndCheckClosed(248);
            }
            this.content.alpha = -((this.transitionElapsed << 8) / this.fadeOutDuration) + 256;
            return super.updateAndCheckClosed(248);
          }
          if (this.transitionPhase != SetBloomCoefficientPercentage.field_o) {
            return super.updateAndCheckClosed(248);
          }
          fieldTemp$1 = this.transitionElapsed + 1;
          this.transitionElapsed = this.transitionElapsed + 1;
          if (fieldTemp$1 == this.fadeInDuration) {
            this.transitionPhase = null;
            this.content.alpha = 256;
            return super.updateAndCheckClosed(248);
          }
          this.content.alpha = (this.transitionElapsed << 8) / this.fadeInDuration;
          return super.updateAndCheckClosed(248);
        }
        UiComponent var4 = (UiComponent) null;
        this.transitionToContent((UiComponent) null, 57);
        if (this.transitionPhase == null) {
          return super.updateAndCheckClosed(248);
        }
        if (this.transitionPhase == SettingsChangeFactory.field_e) {
          fieldTemp$2 = this.transitionElapsed + 1;
          this.transitionElapsed = this.transitionElapsed + 1;
          if (this.fadeOutDuration == fieldTemp$2) {
            this.transitionPhase = GameCanvasResizeListener.field_a;
            this.animateSize(96, this.pendingContent.width + 12, this.pendingContent.height + (this.contentTopInset + 12), this.contentResizeDuration);
            this.content.alpha = 0;
            this.transitionElapsed = 0;
            return super.updateAndCheckClosed(248);
          }
          this.content.alpha = -((this.transitionElapsed << 8) / this.fadeOutDuration) + 256;
          return super.updateAndCheckClosed(248);
        }
        if (this.transitionPhase != SetBloomCoefficientPercentage.field_o) {
          return super.updateAndCheckClosed(248);
        }
        int fieldTemp$3 = this.transitionElapsed + 1;
        this.transitionElapsed = this.transitionElapsed + 1;
        if (fieldTemp$3 == this.fadeInDuration) {
          this.transitionPhase = null;
          this.content.alpha = 256;
          return super.updateAndCheckClosed(248);
        }
        this.content.alpha = (this.transitionElapsed << 8) / this.fadeInDuration;
        return super.updateAndCheckClosed(248);
    }

    final void onResizeComplete(int param0) {
        if (SettingsChangeFactory.field_e == this.transitionPhase) {
          return;
        }
        this.transitionElapsed = 0;
        this.transitionPhase = SetBloomCoefficientPercentage.field_o;
        this.installContent(this.pendingContent, (byte) 71);
        this.pendingContent = null;
        if (param0 == 15435) {
          this.content.alpha = 0;
          return;
        }
        this.contentResizeDuration = 66;
        this.content.alpha = 0;
    }

    private final void installContent(UiComponent param0, byte param1) {
        try {
          if (null != this.content) {
            this.content.unlink(param1 - 3917);
          }
          if (param0 == null) {
            this.content = new AlphaContainer();
          } else {
            param0.setBounds(6, param0.width, param0.height, 1, this.contentTopInset + 6);
            this.content = new AlphaContainer(param0);
          }
          this.addChild(-18756, this.content);
          if (param1 != 71) {
            this.finishResize(85);
          }
          this.pendingContent = null;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gea.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ContentTransitionDialog(ModalStack param0, UiComponent param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.width, param1.height + (12 + param2));
        try {
          this.contentResizeDuration = param4;
          this.fadeInDuration = param3;
          this.fadeOutDuration = param3;
          this.contentTopInset = param2;
          this.installContent(param1, (byte) 71);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
