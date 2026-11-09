/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizingDialog {
    private UiWidget pendingContent;
    private int transitionTicks;
    private int fadeInDuration;
    static String passwordsCanOnlyContainText;
    private FadingWidget contentWrapper;
    private int contentResizeDuration;
    static float field_R;
    static int field_Q;
    private ContentTransitionPhase transitionPhase;
    private int headerHeight;
    private int fadeOutDuration;
    static int field_O;

    ContentTransitionDialog(DialogLayer layer, UiWidget initialContent, int headerSize, int fadeDuration, int resizeDuration) {
        super(layer, initialContent.width + 12, initialContent.height + (12 + headerSize));
        try {
          this.headerHeight = headerSize;
          this.fadeInDuration = fadeDuration;
          this.fadeOutDuration = fadeDuration;
          this.contentResizeDuration = resizeDuration;
          this.installContent(initialContent, -125);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ur.<init>(" + (layer != null ? "{...}" : "null") + ',' + (initialContent != null ? "{...}" : "null") + ',' + headerSize + ',' + fadeDuration + ',' + resizeDuration + ')');
        }
    }

    boolean advanceAnimation(int guard) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (null != this.transitionPhase) {
          if (this.transitionPhase == LimitedRandomAccessFile.FADING_OUT) {
            fieldTemp$0 = this.transitionTicks + 1;
            this.transitionTicks = this.transitionTicks + 1;
            if (fieldTemp$0 != this.fadeOutDuration) {
              this.contentWrapper.opacity = 256 - (this.transitionTicks << 8) / this.fadeOutDuration;
              if (guard != -28778) {
                this.fadeOutDuration = 19;
                return super.advanceAnimation(-28778);
              }
              return super.advanceAnimation(-28778);
            }
            this.transitionPhase = lw.RESIZING;
            this.animateResize(false, this.headerHeight + (12 + this.pendingContent.height), this.contentResizeDuration, this.pendingContent.width + 12);
            this.transitionTicks = 0;
            this.contentWrapper.opacity = 0;
            if (guard != -28778) {
              this.fadeOutDuration = 19;
              return super.advanceAnimation(-28778);
            }
            return super.advanceAnimation(-28778);
          }
          if (this.transitionPhase != AccountRequestState.FADING_IN) {
            if (guard == -28778) {
              return super.advanceAnimation(-28778);
            }
            this.fadeOutDuration = 19;
            return super.advanceAnimation(-28778);
          }
          fieldTemp$1 = this.transitionTicks + 1;
          this.transitionTicks = this.transitionTicks + 1;
          if (this.fadeInDuration == fieldTemp$1) {
            this.transitionPhase = null;
            this.contentWrapper.opacity = 256;
            if (guard == -28778) {
              return super.advanceAnimation(-28778);
            }
            this.fadeOutDuration = 19;
            return super.advanceAnimation(-28778);
          }
          this.contentWrapper.opacity = (this.transitionTicks << 8) / this.fadeInDuration;
          if (guard == -28778) {
            return super.advanceAnimation(-28778);
          }
          this.fadeOutDuration = 19;
          return super.advanceAnimation(-28778);
        }
        if (guard == -28778) {
          return super.advanceAnimation(-28778);
        }
        this.fadeOutDuration = 19;
        return super.advanceAnimation(-28778);
    }

    final void finishResize(byte guard) {
        if (null != this.transitionPhase) {
          if (AccountRequestState.FADING_IN != this.transitionPhase) {
            this.resizeCentered(12 + this.pendingContent.width, this.pendingContent.height + (this.headerHeight + 12), 79);
            this.installContent(this.pendingContent, -124);
          }
          this.contentWrapper.opacity = 256;
          this.transitionPhase = null;
        }
        super.finishResize(guard);
    }

    final boolean finishAnimation(int guard) {
        if (guard != 0) {
          return true;
        }
        this.finishResize((byte) -128);
        return super.finishAnimation(guard ^ 0);
    }

    boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard < 9) {
            this.onResizeFinished(96);
          }
          if (super.onKey(root, character, (byte) 42, keyCode)) {
            return true;
          }
          if (this.contentWrapper == null) {
            return false;
          }
          if (keyCode == 98) {
            this.contentWrapper.requestFocus(root, (byte) 61);
          }
          if (keyCode == 99) {
            this.contentWrapper.requestFocus(root, (byte) 61);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ur.KA(");
          if (root == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    private final void installContent(UiWidget newContent, int guard) {
        try {
          int var3_int = -16 / ((guard + 72) / 51);
          if (this.contentWrapper != null) {
            this.contentWrapper.unlink(false);
          }
          if (newContent == null) {
            this.contentWrapper = new FadingWidget();
          } else {
            newContent.setBounds(107, 6, this.headerHeight + 6, newContent.height, newContent.width);
            this.contentWrapper = new FadingWidget(newContent);
          }
          this.addChild(this.contentWrapper, 124);
          this.pendingContent = null;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ur.DB(" + (newContent != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    void transitionToContent(byte guard, UiWidget newContent) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard >= -87) {
            var4 = (UiWidget) null;
            this.installContent((UiWidget) null, 78);
          }
          this.pendingContent = newContent;
          if (lw.RESIZING == this.transitionPhase) {
            this.animateResize(false, this.pendingContent.height + this.headerHeight + 12, this.contentResizeDuration, this.pendingContent.width + 12);
            this.transitionTicks = 0;
            return;
          }
          if (this.transitionPhase == LimitedRandomAccessFile.FADING_OUT) {
            return;
          }
          this.transitionPhase = LimitedRandomAccessFile.FADING_OUT;
          this.transitionTicks = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ur.E(").append(guard).append(',');
          if (newContent == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          ContentTransitionDialog.releaseStatics(65);
          passwordsCanOnlyContainText = null;
          return;
        }
        passwordsCanOnlyContainText = null;
    }

    final void onResizeFinished(int guard) {
        if (this.transitionPhase == LimitedRandomAccessFile.FADING_OUT) {
          return;
        }
        this.transitionTicks = guard;
        this.transitionPhase = AccountRequestState.FADING_IN;
        this.installContent(this.pendingContent, -124);
        this.contentWrapper.opacity = 0;
        this.pendingContent = null;
    }

    static {
        field_Q = -1;
        passwordsCanOnlyContainText = "Passwords can only contain letters and numbers";
    }
}
