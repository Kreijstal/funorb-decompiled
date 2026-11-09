/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class MessageDialog extends ContentTransitionDialog implements WidgetActionListener {
    static DraggableWidget field_gb;
    static int field_ab;
    private boolean field_cb;
    static ToolkitFont field_db;
    static String loadingMusicText;
    static boolean arcadeMode;
    private StripedProgressWidget progressWidget;
    private boolean failureShown;
    private boolean field_fb;
    private LegacyBitmapFont font;
    private boolean field_eb;

    final static void clearCookieAndReload(int guard, java.applet.Applet applet) {
        try {
          if (guard != -1540) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            MessageDialog.clearCookieAndReload(-115, (java.applet.Applet) null);
          }
          SingleChildWidget.setSessionCookie(-118, "", applet);
          HiscoreRequest.reloadApplet(guard + 9732, applet);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gt.AB(" + guard + ',' + (applet != null ? "{...}" : "null") + ')');
        }
    }

    final void closeDialog(int guard) {
        if (guard != -7) {
          this.failureShown = true;
          if (!this.open) {
            return;
          }
          this.open = false;
          if (this.field_cb) {
            TextLayout.showReconnectForm(0);
            return;
          }
          if (this.field_fb) {
            LinkWidgetRenderer.a(-363927231);
            return;
          }
          return;
        }
        if (!this.open) {
          return;
        }
        this.open = false;
        if (this.field_cb) {
          TextLayout.showReconnectForm(0);
          return;
        }
        if (this.field_fb) {
          LinkWidgetRenderer.a(-363927231);
          return;
        }
    }

    public static void releaseStatics(int param0) {
        loadingMusicText = null;
        field_db = null;
        int var1 = 57 / ((param0 - 70) / 48);
        field_gb = null;
    }

    final static int displayPromptTextWidth(byte guard, String text, boolean buttonFont) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard > -2) {
            stackIn_2_0 = -68;
            return stackIn_2_0;
          }
          if (!buttonFont) {
            stackIn_7_0 = ValidatedTextInputWidget.field_R.stringWidth(text);
            return stackIn_7_0;
          }
          stackIn_5_0 = MouseWheelInput.field_a.stringWidth(text);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gt.W(").append(guard).append(',');
          if (text == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(buttonFont).append(')').toString());
        }
    }

    final static boolean containsForwardOrReverse(String text, String needle, int guard) {
        String var3 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = TextureFilter.reverseString(needle, (byte) 66);
          if (guard < 46) {
            loadingMusicText = (String) null;
          }
          if (text.indexOf(needle) != -1) {
            return true;
          }
          if (text.indexOf(var3) != -1) {
            return true;
          }
          stackIn_14_0 = (text.startsWith(needle)) || (text.startsWith(var3)) || (text.endsWith(needle)) || (text.endsWith(var3));
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("gt.LA(");
          if (text == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (needle == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(guard).append(')').toString());
        }
    }

    final void showConnectionRestored(boolean guard) {
        StatusMessagePanel var2 = null;
        this.progressWidget.setColors(2121792, 4210752, 55);
        if (!guard) {
          var2 = new StatusMessagePanel(this, this.font, ImageProducerRasterBuffer.connectionRestoredText);
          var2.addResultButton(SessionStatisticsSubmission.returnToGameText, 15, true);
          this.transitionToContent((byte) -121, var2);
          return;
        }
    }

    public void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 710) {
            field_db = (ToolkitFont) null;
          }
          if (!this.field_eb) {
            SocialContact.openAppletPage("tochangedisplayname.ws", LegacyOpenGlUnlitEffect.activeApplet(guard - 708), (byte) -103);
            return;
          }
          ReflectionCheck.setAccountDialogResult(3, -82);
          this.closeDialog(-7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("gt.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        String var6 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (13 == keyCode) {
            this.closeDialog(-7);
            return true;
          }
          if (guard < 9) {
            var6 = (String) null;
            MessageDialog.displayPromptTextWidthIntGuard(20, (String) null, false);
          }
          stackIn_7_0 = super.onKey(root, character, (byte) 51, keyCode);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("gt.KA(");
          if (root == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    final static void flushAccountWrites(int minimumBytes, int keepaliveOpcode) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (DisplayModeConfirmationDialog.accountSocket != null && (0 > keepaliveOpcode ||
            LegacyOpenGlUnderwaterEffect.CONNECTED == TextCaretLayout.accountPhase)) {
            if (InwardSparkParticle.outgoingPacket.position == 0 &&
              (ArchiveCatalog.lastAccountWriteMillis + 10000L) < IntroMeshResources.monotonicTimeMillis(minimumBytes - 14)) {
              InwardSparkParticle.outgoingPacket.writeCipherByte(keepaliveOpcode, 8);
            }
            if (InwardSparkParticle.outgoingPacket.position > minimumBytes) {
              try {
                DisplayModeConfirmationDialog.accountSocket.write(0, -2, InwardSparkParticle.outgoingPacket.payload, InwardSparkParticle.outgoingPacket.position);
                ArchiveCatalog.lastAccountWriteMillis = IntroMeshResources.monotonicTimeMillis(-21);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                LegacyOpenGlTextureCache.closeAccountSocket((byte) -115);
              }
              InwardSparkParticle.outgoingPacket.position = 0;
            }
            return;
          }
          InwardSparkParticle.outgoingPacket.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void shutdownClientSession(int guard) {
        HardwareAnimatedWaterEffect.d(1);
        if (NineSlicePanel.field_f != null) {
          CheckboxWidget.a(true, NineSlicePanel.field_f);
        }
        ShaderEffect.releaseKeyboardState(false);
        MouseInputShutdown.releaseMouseInput(28679);
        if (guard != 0) {
          field_gb = (DraggableWidget) null;
        }
        MarkerTrackWidget.closeCacheResources(-1);
        if (NameSuggestionsPanel.hasLoginSessionSocket((byte) -98)) {
          InwardSparkParticle.outgoingPacket.writeCipherByte(1, 8);
          MessageDialog.flushAccountWrites(0, 0);
        }
        LegacyOpenGlTextureCache.closeAccountSocket((byte) -127);
    }

    final void showFailure(String message, int failureCode, int guard) {
        boolean stackIn_7_1 = false;
        StatusMessagePanel stackIn_15_0 = null;
        String stackIn_16_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        StatusMessagePanel var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.failureShown) {
            return;
          }
          this.failureShown = true;
          stackIn_7_1 = (failureCode == 256);
          this.field_eb = stackIn_7_1;
          if (guard != 21089) {
            return;
          }
          this.progressWidget.setColors(8405024, 4210752, guard ^ 20995);
          var6 = new StatusMessagePanel(this, this.font, message);
          if (5 != failureCode) {
            if (failureCode != 256) {
              stackIn_15_0 = var6;
              if (this.field_cb) {
                stackIn_16_1 = AppletFocusState.retryText;
              } else {
                stackIn_16_1 = FullscreenCanvas.backText;
              }
              ((StatusMessagePanel) (Object) stackIn_15_0).addResultButton(stackIn_16_1, -1, true);
            } else {
              var6.appendButton(AppletFocusState.retryText, (byte) -123, (WidgetListener) (this));
            }
          } else {
            var6.addResultButton(DisplayModeFailure.reloadGameText, 11, true);
            var6.addResultButton(HiscoreRequest.quitToWebsiteText, 17, true);
          }
          if (failureCode == 3) {
            var6.addResultButton(IntroFinalFrameResources.toServerListText, 7, true);
          } else {
            if (failureCode != 4) {
              if (failureCode != 6) {
                if (failureCode != 9) {
                  this.transitionToContent((byte) -97, var6);
                  return;
                }
                var6.appendButton(IsaacPacketBuffer.changeDisplayNameText, (byte) -123, (WidgetListener) (this));
              } else {
                var6.addResultButton(PowerupTrailParticle.toCustomerSupportText, 9, true);
              }
            } else {
              var6.addResultButton(LegacyWaterTextureResources.playFreeVersionText, 8, true);
            }
          }
          this.transitionToContent((byte) -97, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("gt.BB(");
          if (message == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(failureCode).append(',').append(guard).append(')').toString());
        }
    }

    MessageDialog(DialogLayer param0, LegacyBitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new StatusMessagePanel((MessageDialog) null, param1, param2), 77, 10, 10);
        try {
          this.field_fb = param4 ? true : false;
          this.field_eb = false;
          this.font = param1;
          this.field_cb = param3 ? true : false;
          this.failureShown = false;
          this.progressWidget = new StripedProgressWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.progressWidget.animated = true;
          this.addChild(this.progressWidget, 78);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_ab = 0;
        loadingMusicText = "Loading music";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int displayPromptTextWidthIntGuard(int guard, String text, boolean buttonFont) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard > -2) {
            stackIn_2_0 = -68;
            return stackIn_2_0;
          }
          if (!buttonFont) {
            stackIn_7_0 = ValidatedTextInputWidget.field_R.stringWidth(text);
            return stackIn_7_0;
          }
          stackIn_5_0 = MouseWheelInput.field_a.stringWidth(text);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gt.W(").append(guard).append(',');
          if (text == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(buttonFont).append(')').toString());
        }
    }
}
