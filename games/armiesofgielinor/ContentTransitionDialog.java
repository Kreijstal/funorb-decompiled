/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableModalDialog {
    private int resizeDuration;
    static String[] field_W;
    static ClientUiComponent field_X;
    private int fadeOutDuration;
    private int transitionTick;
    private AlphaWidgetContainer contentWrapper;
    private tv transitionStage;
    static h field_db;
    private int contentInsetTop;
    private Widget pendingContent;
    private int fadeInDuration;
    static PcmStreamMixer field_eb;
    static String field_Y;
    static String field_gb;

    final static void c(int param0, int param1, int param2) {
        if (param2 < 1) {
          field_db = (h) null;
          InstructionsPanel.field_B = param0;
          QuickChatPhrase.field_C = param1;
          return;
        }
        InstructionsPanel.field_B = param0;
        QuickChatPhrase.field_C = param1;
    }

    final void resizeCompleted(int obfuscationGuard) {
        if (this.transitionStage == TeleportAction.contentFadeOutStage) {
          return;
        }
        this.transitionStage = ki.contentFadeInStage;
        int var2 = 113 % ((obfuscationGuard - 69) / 50);
        this.transitionTick = 0;
        this.installContent(72, this.pendingContent);
        this.pendingContent = null;
        this.contentWrapper.alpha = 0;
    }

    boolean advanceDialogAnimation(byte obfuscationGuard) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null == this.transitionStage) {
          if (obfuscationGuard == -1) {
            return super.advanceDialogAnimation((byte) -1);
          }
          this.snapDialogAnimation(117);
          return super.advanceDialogAnimation((byte) -1);
        }
        if (TeleportAction.contentFadeOutStage == this.transitionStage) {
          fieldTemp$2 = this.transitionTick + 1;
          this.transitionTick = this.transitionTick + 1;
          if (this.fadeOutDuration != fieldTemp$2) {
            this.contentWrapper.alpha = 256 - (this.transitionTick << 8) / this.fadeOutDuration;
          } else {
            this.transitionStage = ContextualRuntimeException.contentResizeStage;
            this.resizeDialog(this.resizeDuration, false, this.pendingContent.height + 12 + this.contentInsetTop, this.pendingContent.width + 12);
            this.transitionTick = 0;
            this.contentWrapper.alpha = 0;
          }
          if (obfuscationGuard == -1) {
            return super.advanceDialogAnimation((byte) -1);
          }
          this.snapDialogAnimation(117);
          return super.advanceDialogAnimation((byte) -1);
        }
        if (ki.contentFadeInStage != this.transitionStage) {
          if (obfuscationGuard == -1) {
            return super.advanceDialogAnimation((byte) -1);
          }
          this.snapDialogAnimation(117);
          return super.advanceDialogAnimation((byte) -1);
        }
        fieldTemp$3 = this.transitionTick + 1;
        this.transitionTick = this.transitionTick + 1;
        if (this.fadeInDuration != fieldTemp$3) {
          this.contentWrapper.alpha = (this.transitionTick << 8) / this.fadeInDuration;
        } else {
          this.transitionStage = null;
          this.contentWrapper.alpha = 256;
        }
        if (obfuscationGuard == -1) {
          return super.advanceDialogAnimation((byte) -1);
        }
        this.snapDialogAnimation(117);
        return super.advanceDialogAnimation((byte) -1);
    }

    public static void i(byte param0) {
        field_db = null;
        field_gb = null;
        field_eb = null;
        field_W = null;
        field_Y = null;
        if (param0 != -72) {
          return;
        }
        field_X = null;
    }

    final void finishResize(int obfuscationGuard) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (this.transitionStage == null) {
          super.finishResize(81);
          var2 = 71 % ((obfuscationGuard + 25) / 57);
          return;
        }
        if (ki.contentFadeInStage != this.transitionStage) {
          this.setCenteredSize(this.pendingContent.width + 12, (byte) 98, 12 + (this.contentInsetTop + this.pendingContent.height));
          this.installContent(107, this.pendingContent);
        } else {
          this.transitionStage = null;
          this.contentWrapper.alpha = 256;
          super.finishResize(81);
          var2Lifetime1 = 71 % ((obfuscationGuard + 25) / 57);
          return;
        }
        this.transitionStage = null;
        this.contentWrapper.alpha = 256;
        super.finishResize(81);
        var2Lifetime2 = 71 % ((obfuscationGuard + 25) / 57);
    }

    void replaceContent(Widget content, byte obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 116 % ((-27 - obfuscationGuard) / 44);
          this.pendingContent = content;
          if (this.transitionStage == ContextualRuntimeException.contentResizeStage) {
            this.resizeDialog(this.resizeDuration, false, this.pendingContent.height + (12 + this.contentInsetTop), 12 + this.pendingContent.width);
            this.transitionTick = 0;
            return;
          }
          if (this.transitionStage == TeleportAction.contentFadeOutStage) {
            return;
          }
          this.transitionStage = TeleportAction.contentFadeOutStage;
          this.transitionTick = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pt.A(");
          if (content == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(rootWidget, keyCode, character, obfuscationGuard)) {
            return true;
          }
          if (null == this.contentWrapper) {
            return false;
          }
          if (98 == keyCode) {
            this.contentWrapper.takeFocus(obfuscationGuard ^ -12222, rootWidget);
          }
          if (keyCode == 99) {
            this.contentWrapper.takeFocus(11, rootWidget);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("pt.F(");
          if (rootWidget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean snapDialogAnimation(int obfuscationGuard) {
        int var2 = 115 / ((obfuscationGuard + 1) / 44);
        this.finishResize(121);
        return super.snapDialogAnimation(92);
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var4 = param2.getGraphics();
            if (param1 != 12) {
              field_Y = (String) null;
            }
            so.field_b.a(255, var4, param0, param3);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("pt.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void installContent(int obfuscationGuard, Widget content) {
        try {
          if (this.contentWrapper != null) {
            this.contentWrapper.unlink(92);
          }
          if (content != null) {
            content.setBounds(6, content.width, 6 + this.contentInsetTop, 8192, content.height);
            this.contentWrapper = new AlphaWidgetContainer(content);
          } else {
            this.contentWrapper = new AlphaWidgetContainer();
          }
          int var3_int = 29 % ((obfuscationGuard - 24) / 42);
          this.addChild((byte) 10, (Widget) (this.contentWrapper));
          this.pendingContent = null;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pt.G(" + obfuscationGuard + ',' + (content != null ? "{...}" : "null") + ')');
        }
    }

    ContentTransitionDialog(ModalDialogHost host, Widget content, int contentInsetTop, int fadeDuration, int resizeDuration) {
        super(host, content.width + 12, 12 + contentInsetTop + content.height);
        try {
          this.resizeDuration = resizeDuration;
          this.contentInsetTop = contentInsetTop;
          this.fadeInDuration = fadeDuration;
          this.fadeOutDuration = fadeDuration;
          this.installContent(-36, content);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pt.<init>(" + (host != null ? "{...}" : "null") + ',' + (content != null ? "{...}" : "null") + ',' + contentInsetTop + ',' + fadeDuration + ',' + resizeDuration + ')');
        }
    }

    static {
        field_W = new String[]{"ready", "walk", "run", "attack", "ranged", "jeer", "defend", "death"};
        field_db = new h(3);
        field_Y = "Go Back";
        field_gb = "You cannot chat to <%0> because <%0> is offline in your friend list.";
    }
}
