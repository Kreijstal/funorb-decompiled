/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends ResizableDialog implements ButtonActivationListener {
    static int previousUiPointerButton;
    static float spawnIntervalScale;
    private ButtonWidget field_bb;
    static String menuText;
    static int field_cb;
    static int alternateArchivePort;
    static String createPasswordTooltipText;

    private final ButtonWidget a(String param0, byte param1, WidgetListener param2) {
        ButtonWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ButtonWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ButtonWidget(param0, param2);
          if (param1 != 87) {
            previousUiPointerButton = 121;
          }
          var4.renderer = (WidgetRenderer) ((Object) new ml());
          var5 = this.widgetHeight - 6;
          this.widgetHeight = this.widgetHeight + 38;
          var4.setWidgetBounds(30, -14 + (this.widgetWidth - 16), (byte) -111, var5, 15);
          this.addChild((byte) -70, var4);
          this.refreshLayout(param1 - 198);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ij.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void i(byte param0) {
        menuText = null;
        if (param0 > 0) {
            ij.i((byte) 25);
            createPasswordTooltipText = null;
            return;
        }
        createPasswordTooltipText = null;
    }

    final static int chooseSpawnEntityCategory(int methodGuard) {
        if (methodGuard <= 18) {
            ij.chooseSpawnEntityCategory(48);
            return qi.b(MessageDialog.availableEntityCategoryCount, 1);
        }
        return qi.b(MessageDialog.availableEntityCategoryCount, 1);
    }

    ij(DialogLayer param0, uj param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiWidget var4 = null;
        try {
          var3 = null;
          if (TextInputValidator.field_h == param1) {
            var3 = ei.fullscreenUnavailableTrySignedAppletText;
          } else {
            if (param1 == ei.field_hb) {
              var3 = k.fullscreenFocusText;
              this.widgetHeight = this.widgetHeight + 10;
              if (nb.a(true)) {
                var3 = ad.fullscreenFocusOrResolutionText;
                this.widgetHeight = this.widgetHeight + 20;
              }
            } else {
              if (param1 == LimitedRandomAccessFile.field_b) {
                var3 = MessageDialog.fullscreenTimeoutText;
                this.widgetHeight = this.widgetHeight + 30;
              }
            }
          }
          var4 = new UiWidget((String) (var3), (WidgetListener) null);
          var4.widgetX = 0;
          var4.widgetHeight = 80;
          var4.widgetWidth = this.widgetWidth;
          var4.widgetY = 50;
          var4.renderer = (WidgetRenderer) ((Object) new ff(hh.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild((byte) -91, var4);
          this.field_bb = this.a(hh.fullscreenCloseButtonText, (byte) 87, (WidgetListener) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ij.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void j(byte param0) {
        if (!(this.dialogVisible)) {
            return;
        }
        int var2 = 102 / ((param0 - 6) / 43);
        this.dialogVisible = false;
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, ButtonWidget param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == this.field_bb) {
            this.j((byte) 122);
          }
          if (param1 == -20) {
            return;
          }
          alternateArchivePort = -95;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ij.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void drawAvatarFaceOrCryFrame(byte methodGuard) {
        int avatarEyeMouthOffsetX = 0;
        int avatarEyeMouthOffsetY = 0;
        if (!UiWidget.gameplaySession.sessionEnding) {
            avatarEyeMouthOffsetX = UiWidget.gameplaySession.boardMaskOffsetX - 2;
            avatarEyeMouthOffsetY = UiWidget.gameplaySession.boardMaskOffsetY - 2;
            if (!(wa.avatarShockEffectTicks <= 0)) {
                vg.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].draw(320 - (vg.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].fullWidth >> 1), -(vg.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].fullHeight >> 1) + 240);
            }
            fc.avatarEyeFrames[DiskCacheWorker.avatarFeedbackFrameIndex].drawGrayModulated(avatarEyeMouthOffsetX + 320, 240 + avatarEyeMouthOffsetY, rj.avatarTintColor);
            vh.avatarMouthFrames[nd.avatarFeedbackModeId].drawGrayModulated(320 + avatarEyeMouthOffsetX, 240 + avatarEyeMouthOffsetY, rj.avatarTintColor);
            if (methodGuard >= 3) {
                return;
            }
            menuText = (String) null;
            return;
        }
        if (null == ul.currentAvatarCryFrame) {
            avatarEyeMouthOffsetX = UiWidget.gameplaySession.boardMaskOffsetX - 2;
            avatarEyeMouthOffsetY = UiWidget.gameplaySession.boardMaskOffsetY - 2;
            if (!(wa.avatarShockEffectTicks <= 0)) {
                vg.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].draw(320 - (vg.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].fullWidth >> 1), -(vg.silverStarShockFrames[IndexedSpriteState.avatarShockFrameIndex].fullHeight >> 1) + 240);
            }
            fc.avatarEyeFrames[DiskCacheWorker.avatarFeedbackFrameIndex].drawGrayModulated(avatarEyeMouthOffsetX + 320, 240 + avatarEyeMouthOffsetY, rj.avatarTintColor);
            vh.avatarMouthFrames[nd.avatarFeedbackModeId].drawGrayModulated(320 + avatarEyeMouthOffsetX, 240 + avatarEyeMouthOffsetY, rj.avatarTintColor);
            if (methodGuard >= 3) {
                return;
            }
            menuText = (String) null;
            return;
        }
        ul.currentAvatarCryFrame.draw(-(ul.currentAvatarCryFrame.fullWidth >> 1) + 319, -(ul.currentAvatarCryFrame.fullHeight >> 1) + 240);
        if (methodGuard >= 3) {
            return;
        }
        menuText = (String) null;
    }

    static {
        previousUiPointerButton = 0;
        menuText = "Menu";
        spawnIntervalScale = 0.5f;
        createPasswordTooltipText = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
