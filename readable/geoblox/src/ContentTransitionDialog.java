/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableDialog {
    private int contentResizeDurationTicks;
    private int contentVerticalInset;
    private UiWidget pendingContent;
    private int fadeOutDurationTicks;
    private int contentFadeTick;
    private hh contentTransitionPhase;
    static int[] secondVertexTransformedX;
    static MusicScore resultMusicTrack;
    private OpacityWidget contentOpacityWidget;
    private int fadeInDurationTicks;

    final boolean settleDialogAnimation(int methodGuard) {
        if (methodGuard != 229) {
            return false;
        }
        this.finishTransition(true);
        return super.settleDialogAnimation(229);
    }

    ContentTransitionDialog(DialogLayer dialogLayer, UiWidget initialContent, int contentVerticalInset, int fadeDurationTicks, int resizeDurationTicks) {
        super(dialogLayer, initialContent.widgetWidth + 12, 12 + contentVerticalInset + initialContent.widgetHeight);
        try {
            this.contentResizeDurationTicks = resizeDurationTicks;
            this.contentVerticalInset = contentVerticalInset;
            this.fadeInDurationTicks = fadeDurationTicks;
            this.fadeOutDurationTicks = fadeDurationTicks;
            this.installContent(-21102, initialContent);
        } catch (RuntimeException contentDialogConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) contentDialogConstructionFailure), "qf.<init>(" + (dialogLayer != null ? "{...}" : "null") + ',' + (initialContent != null ? "{...}" : "null") + ',' + contentVerticalInset + ',' + fadeDurationTicks + ',' + resizeDurationTicks + ')');
        }
    }

    boolean advanceDialogAnimation(int methodGuard) {
        int nextFadeOutTick = 0;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard != -1) {
            return true;
        }
        if (this.contentTransitionPhase == null) {
            return super.advanceDialogAnimation(-1);
        }
        if (la.contentFadeOutPhase == this.contentTransitionPhase) {
            nextFadeOutTick = this.contentFadeTick + 1;
            this.contentFadeTick = this.contentFadeTick + 1;
            if (nextFadeOutTick == this.fadeOutDurationTicks) {
                this.contentTransitionPhase = la.contentResizePhase;
                this.startResizeTransition(12 + this.contentVerticalInset + this.pendingContent.widgetHeight, this.pendingContent.widgetWidth + 12, methodGuard ^ 5268, this.contentResizeDurationTicks);
                this.contentFadeTick = 0;
                this.contentOpacityWidget.opacity = 0;
                return super.advanceDialogAnimation(-1);
            }
            this.contentOpacityWidget.opacity = 256 - (this.contentFadeTick << 8) / this.fadeOutDurationTicks;
            return super.advanceDialogAnimation(-1);
        }
        if (qb.contentFadeInPhase != this.contentTransitionPhase) {
            return super.advanceDialogAnimation(-1);
        }
        int nextFadeInTick = this.contentFadeTick + 1;
        this.contentFadeTick = this.contentFadeTick + 1;
        if (this.fadeInDurationTicks == nextFadeInTick) {
            this.contentTransitionPhase = null;
            this.contentOpacityWidget.opacity = 256;
            return super.advanceDialogAnimation(-1);
        }
        this.contentOpacityWidget.opacity = (this.contentFadeTick << 8) / this.fadeInDurationTicks;
        return super.advanceDialogAnimation(-1);
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != 256) {
            return;
        }
        resultMusicTrack = null;
        secondVertexTransformedX = null;
    }

    final void onResizeTransitionComplete(int methodGuard) {
        if (la.contentFadeOutPhase == this.contentTransitionPhase) {
            return;
        }
        if (methodGuard < -20) {
            this.contentFadeTick = 0;
            this.contentTransitionPhase = qb.contentFadeInPhase;
            this.installContent(-21102, this.pendingContent);
            this.pendingContent = null;
            this.contentOpacityWidget.opacity = 0;
            return;
        }
        secondVertexTransformedX = (int[]) null;
        this.contentFadeTick = 0;
        this.contentTransitionPhase = qb.contentFadeInPhase;
        this.installContent(-21102, this.pendingContent);
        this.pendingContent = null;
        this.contentOpacityWidget.opacity = 0;
    }

    boolean handleKeyInput(int keyCode, int methodGuard, char typedCharacter, UiWidget eventContext) {
        RuntimeException keyInputFailure = null;
        RuntimeException keyFailureBeforeContext = null;
        StringBuilder keyFailureContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtKeyInputException = null;
        try {
          if (super.handleKeyInput(keyCode, methodGuard, typedCharacter, eventContext)) {
            return true;
          }
          if (this.contentOpacityWidget != null) {
            if (keyCode == 98) {
              this.contentOpacityWidget.requestKeyboardFocus((byte) -92, eventContext);
            }
            if (keyCode == 99) {
              this.contentOpacityWidget.requestKeyboardFocus((byte) -99, eventContext);
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException caughtKeyInputFailure) {
          caughtKeyInputException = caughtKeyInputFailure;
          keyInputFailure = caughtKeyInputException;
          keyFailureBeforeContext = (RuntimeException) (keyInputFailure);
          keyFailureContextBuilder = new StringBuilder().append("qf.I(").append(keyCode).append(',').append(methodGuard).append(',').append(typedCharacter).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyFailureBeforeContext), ((StringBuilder) (Object) keyFailureContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    private final void installContent(int methodGuard, UiWidget content) {
        RuntimeException contentInstallationFailure = null;
        UiWidget guardedNullContentSnapshot = null;
        RuntimeException contentFailureBeforeContext = null;
        StringBuilder contentFailureContextBuilder = null;
        String contentContextDescription = null;
        RuntimeException caughtContentInstallationException = null;
        try {
          if (this.contentOpacityWidget != null) {
            this.contentOpacityWidget.unlinkNode(false);
          }
          if (content == null) {
            this.contentOpacityWidget = new OpacityWidget();
          } else {
            content.setWidgetBounds(content.widgetHeight, content.widgetWidth, (byte) -77, this.contentVerticalInset + 6, 6);
            this.contentOpacityWidget = new OpacityWidget(content);
          }
          this.addChild((byte) -123, (UiWidget) (this.contentOpacityWidget));
          this.pendingContent = null;
          if (methodGuard == -21102) {
            return;
          }
          guardedNullContentSnapshot = (UiWidget) null;
          this.handleKeyInput(-67, -54, 'ﾽ', (UiWidget) null);
          return;
        } catch (java.lang.RuntimeException caughtContentInstallationFailure) {
          caughtContentInstallationException = caughtContentInstallationFailure;
          contentInstallationFailure = caughtContentInstallationException;
          contentFailureBeforeContext = (RuntimeException) (contentInstallationFailure);
          contentFailureContextBuilder = new StringBuilder().append("qf.SB(").append(methodGuard).append(',');
          if (content == null) {
            contentContextDescription = "null";
          } else {
            contentContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) contentFailureBeforeContext), ((StringBuilder) (Object) contentFailureContextBuilder).append(contentContextDescription).append(')').toString());
        }
    }

    final static ai a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        ai var9 = null;
        RuntimeException var9_ref = null;
        ai stackIn_2_0 = null;
        ai stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new ai(param1, param6, param0, param5, param2, param8, param4);
          TriangleMesh.field_j.addLast(param3 ^ -25202, var9);
          ArchiveIndex.a(var9, param7, param3 ^ -25169);
          if (param3 == 25134) {
            stackIn_4_0 = (ai) (var9);
            return stackIn_4_0;
          }
          stackIn_2_0 = (ai) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var9_ref);
          stackIn_7_1 = new StringBuilder().append("qf.UB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    void replaceContent(UiWidget content, int methodGuard) {
        RuntimeException contentReplacementFailure = null;
        RuntimeException replacementFailureBeforeContext = null;
        StringBuilder replacementFailureContextBuilder = null;
        String contentContextDescription = null;
        RuntimeException caughtContentReplacementException = null;
        try {
          this.pendingContent = content;
          if (la.contentResizePhase != this.contentTransitionPhase) {
            if (la.contentFadeOutPhase != this.contentTransitionPhase) {
              this.contentTransitionPhase = la.contentFadeOutPhase;
              this.contentFadeTick = 0;
            }
          } else {
            this.startResizeTransition(this.contentVerticalInset + (12 + this.pendingContent.widgetHeight), this.pendingContent.widgetWidth + 12, -5269, this.contentResizeDurationTicks);
            this.contentFadeTick = 0;
          }
          if (methodGuard < -10) {
            return;
          }
          this.contentOpacityWidget = (OpacityWidget) null;
          return;
        } catch (java.lang.RuntimeException caughtContentReplacementFailure) {
          caughtContentReplacementException = caughtContentReplacementFailure;
          contentReplacementFailure = caughtContentReplacementException;
          replacementFailureBeforeContext = (RuntimeException) (contentReplacementFailure);
          replacementFailureContextBuilder = new StringBuilder().append("qf.PB(");
          if (content == null) {
            contentContextDescription = "null";
          } else {
            contentContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) replacementFailureBeforeContext), ((StringBuilder) (Object) replacementFailureContextBuilder).append(contentContextDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void finishTransition(boolean finishResize) {
        if (null == this.contentTransitionPhase) {
            super.finishTransition(finishResize);
            return;
        }
        if (this.contentTransitionPhase != qb.contentFadeInPhase) {
            this.resizeAndCenter(this.pendingContent.widgetHeight + (this.contentVerticalInset + 12), 106, this.pendingContent.widgetWidth + 12);
            this.installContent(-21102, this.pendingContent);
        } else {
            this.contentTransitionPhase = null;
            this.contentOpacityWidget.opacity = 256;
            super.finishTransition(finishResize);
            return;
        }
        this.contentTransitionPhase = null;
        this.contentOpacityWidget.opacity = 256;
        super.finishTransition(finishResize);
    }

    static {
        secondVertexTransformedX = new int[8192];
    }
}
