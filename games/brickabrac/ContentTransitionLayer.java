/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionLayer extends PopupWidgetLayer {
    private OpacityWidget contentWrapper;
    private int fadeOutDuration;
    static int field_ob;
    private int phaseTick;
    static UiComponent field_gb;
    static ResourceArchive field_jb;
    static String field_ib;
    private Widget pendingContent;
    static QuickChatMenu field_kb;
    private int headerHeight;
    private int fadeInDuration;
    static int field_pb;
    static String field_hb;
    private ContentTransitionPhase transitionPhase;
    private int contentResizeDuration;

    void transitionToContent(byte obfuscationGuard, Widget content) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.pendingContent = content;
          if (MouseInput.contentResizing != this.transitionPhase) {
            if (this.transitionPhase != bh.contentFadingOut) {
              this.transitionPhase = bh.contentFadingOut;
              this.phaseTick = 0;
            }
          } else {
            this.resizeTo((byte) -116, this.contentResizeDuration, this.headerHeight + (12 + this.pendingContent.height), this.pendingContent.width + 12);
            this.phaseTick = 0;
          }
          if (obfuscationGuard > 105) {
            return;
          }
          field_hb = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("fe.C(").append(obfuscationGuard).append(',');
          if (content == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void finishTransition(int obfuscationGuard) {
        if (this.transitionPhase == null) {
          super.finishTransition(obfuscationGuard);
          return;
        }
        if (this.transitionPhase != NameEntryPopup.contentFadingIn) {
          this.setCenteredSize(true, this.headerHeight + 12 + this.pendingContent.height, 12 + this.pendingContent.width);
          this.installContent((byte) 56, this.pendingContent);
        } else {
          this.transitionPhase = null;
          this.contentWrapper.opacity256 = 256;
          super.finishTransition(obfuscationGuard);
          return;
        }
        this.transitionPhase = null;
        this.contentWrapper.opacity256 = 256;
        super.finishTransition(obfuscationGuard);
    }

    boolean tickLayerAndCheckHidden(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != 0) {
          Widget var4 = (Widget) null;
          this.handleWidgetKey(-125, (byte) 123, (Widget) null, 'ﾈ');
          if (this.transitionPhase == null) {
            return super.tickLayerAndCheckHidden(0);
          }
          if (this.transitionPhase != bh.contentFadingOut) {
            if (this.transitionPhase != NameEntryPopup.contentFadingIn) {
              return super.tickLayerAndCheckHidden(0);
            }
            fieldTemp$0 = this.phaseTick + 1;
            this.phaseTick = this.phaseTick + 1;
            if (this.fadeInDuration == fieldTemp$0) {
              this.transitionPhase = null;
              this.contentWrapper.opacity256 = 256;
              return super.tickLayerAndCheckHidden(0);
            }
            this.contentWrapper.opacity256 = (this.phaseTick << 8) / this.fadeInDuration;
            return super.tickLayerAndCheckHidden(0);
          }
          fieldTemp$1 = this.phaseTick + 1;
          this.phaseTick = this.phaseTick + 1;
          if (fieldTemp$1 != this.fadeOutDuration) {
            this.contentWrapper.opacity256 = 256 - (this.phaseTick << 8) / this.fadeOutDuration;
            return super.tickLayerAndCheckHidden(0);
          }
          this.transitionPhase = MouseInput.contentResizing;
          this.resizeTo((byte) -116, this.contentResizeDuration, this.pendingContent.height + (this.headerHeight + 12), 12 + this.pendingContent.width);
          this.contentWrapper.opacity256 = 0;
          this.phaseTick = 0;
          return super.tickLayerAndCheckHidden(0);
        }
        if (this.transitionPhase == null) {
          return super.tickLayerAndCheckHidden(0);
        }
        if (this.transitionPhase != bh.contentFadingOut) {
          if (this.transitionPhase != NameEntryPopup.contentFadingIn) {
            return super.tickLayerAndCheckHidden(0);
          }
          fieldTemp$2 = this.phaseTick + 1;
          this.phaseTick = this.phaseTick + 1;
          if (this.fadeInDuration == fieldTemp$2) {
            this.transitionPhase = null;
            this.contentWrapper.opacity256 = 256;
            return super.tickLayerAndCheckHidden(0);
          }
          this.contentWrapper.opacity256 = (this.phaseTick << 8) / this.fadeInDuration;
          return super.tickLayerAndCheckHidden(0);
        }
        int fieldTemp$3 = this.phaseTick + 1;
        this.phaseTick = this.phaseTick + 1;
        if (fieldTemp$3 != this.fadeOutDuration) {
          this.contentWrapper.opacity256 = 256 - (this.phaseTick << 8) / this.fadeOutDuration;
          return super.tickLayerAndCheckHidden(0);
        }
        this.transitionPhase = MouseInput.contentResizing;
        this.resizeTo((byte) -116, this.contentResizeDuration, this.pendingContent.height + (this.headerHeight + 12), 12 + this.pendingContent.width);
        this.contentWrapper.opacity256 = 0;
        this.phaseTick = 0;
        return super.tickLayerAndCheckHidden(0);
    }

    private final void installContent(byte obfuscationGuard, Widget content) {
        if (null != this.contentWrapper) {
          this.contentWrapper.unlink((byte) 111);
        }
        if (content == null) {
          this.contentWrapper = new OpacityWidget();
        } else {
          content.setBounds(content.height, 6, this.headerHeight + 6, (byte) -119, content.width);
          this.contentWrapper = new OpacityWidget(content);
        }
        this.addChild(this.contentWrapper, true);
        if (obfuscationGuard != 56) {
          return;
        }
        try {
          this.pendingContent = null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fe.F(" + obfuscationGuard + ',' + (content != null ? "{...}" : "null") + ')');
        }
    }

    final void onResizeCompleted(int obfuscationGuard) {
        if (this.transitionPhase == bh.contentFadingOut) {
          return;
        }
        this.phaseTick = 0;
        this.transitionPhase = NameEntryPopup.contentFadingIn;
        this.installContent((byte) 56, this.pendingContent);
        this.pendingContent = null;
        this.contentWrapper.opacity256 = 0;
        if (obfuscationGuard != -13717) {
          this.transitionPhase = (ContentTransitionPhase) null;
        }
    }

    boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleWidgetKey(keyCode, obfuscationGuard, focusRoot, character)) {
            return true;
          }
          if (null == this.contentWrapper) {
            return false;
          }
          if (98 == keyCode) {
            this.contentWrapper.tryFocus(true, focusRoot);
          }
          if (keyCode == 99) {
            this.contentWrapper.tryFocus(true, focusRoot);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("fe.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(character).append(')').toString());
        }
    }

    public static void l(int param0) {
        field_ib = null;
        field_hb = null;
        field_jb = null;
        field_kb = null;
        if (param0 <= 78) {
          return;
        }
        field_gb = null;
    }

    ContentTransitionLayer(WidgetLayerStack layerStack, Widget content, int headerHeight, int fadeDuration, int resizeDuration) {
        super(layerStack, 12 + content.width, 12 + headerHeight + content.height);
        try {
          this.contentResizeDuration = resizeDuration;
          this.headerHeight = headerHeight;
          this.fadeInDuration = fadeDuration;
          this.fadeOutDuration = fadeDuration;
          this.installContent((byte) 56, content);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fe.<init>(" + (layerStack != null ? "{...}" : "null") + ',' + (content != null ? "{...}" : "null") + ',' + headerHeight + ',' + fadeDuration + ',' + resizeDuration + ')');
        }
    }

    final boolean updateOpacityAndCheckHidden(int obfuscationGuard) {
        if (obfuscationGuard < -22) {
          this.finishTransition(20);
          return super.updateOpacityAndCheckHidden(-119);
        }
        this.fadeOutDuration = -1;
        this.finishTransition(20);
        return super.updateOpacityAndCheckHidden(-119);
    }

    static {
        field_ib = "This game option is not available in rated games.";
        field_hb = "Private";
    }
}
