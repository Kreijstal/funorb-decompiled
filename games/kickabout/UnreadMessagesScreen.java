/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class UnreadMessagesScreen extends ButtonMenuScreen {
    static boolean field_D;
    static String field_B;
    static TextFieldNode field_A;

    public static void releaseStatics(int param0) {
        field_B = null;
        if (param0 >= -25) {
          return;
        }
        field_A = null;
    }

    final void updateScreen(byte param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int var3;
        int var4;
        int var4Lifetime1;
        super.updateScreen((byte) 117, param1);
        stackIn_3_0 = !(PlayerStats.beginReconnectGracePeriod((byte) -3));
        var3 = PasswordFieldPainter.updateContentCarousel(stackIn_3_0, -587);
        if (var3 != 3) {
          if (var3 == 1) {
            DelayedServerPacket.requestScreenTransition(0, false, -2);
          }
        } else {
          if (null == SplashScreen.field_m) {
            AuctionLogEntry.openSubscribePage(AppletContextSupport.getActiveApplet(-98), (byte) 126);
            var4 = 62 / ((38 - param0) / 60);
            return;
          } else {
            UiWidget.leaveFullscreen(0);
            AuctionLogEntry.openSubscribePage(AppletContextSupport.getActiveApplet(-98), (byte) 126);
          }
        }
        if (var3 == 2) {
          DelayedServerPacket.requestScreenTransition(0, true, -2);
        }
        var4Lifetime1 = 62 / ((38 - param0) / 60);
    }

    final static int multiplyFixed16(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var3 = param2 >> 16;
        int var4 = param2 & 65535;
        if (!param1) {
          var5 = param0 >> 16;
          var6 = 65535 & param0;
          return (var6 * var4 >> 16) + param0 * var3 + var5 * var4;
        }
        return 87;
    }

    final void drawScreen(int param0, boolean param1) {
        super.drawScreen(param0, param1);
    }

    UnreadMessagesScreen() {
    }

    final static void buildUnreadMessagesNotice(int param0) {
        int var1;
        int var2;
        var2 = Kickabout.field_G;
        CachedTextLayout.field_m = null;
        DiagnosticsOverlaySupport.field_g = false;
        if (param0 != -1) {
          return;
        }
        if (AuctionBidDialog.field_G) {
          WorldSpriteSequence.field_f.showConnectionRestored(2121792);
        } else {
          var1 = PlayerArchetypeSortCriterion.field_n;
          if (var1 > 0) {
            if (var1 != 1) {
              CachedTextLayout.field_m = LoginDialog.substitutePlaceholders(-18, ScrollContainer.field_Lb, new String[]{Integer.toString(var1)});
            } else {
              CachedTextLayout.field_m = ProxySocketConnector.field_h;
            }
            CachedTextLayout.field_m = DisplayModeSupport.concatenate(new CharSequence[]{(CharSequence) ((Object) CachedTextLayout.field_m), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) LobbyPlayerRow.field_Kb)}, false);
          }
          WorldSpriteSequence.field_f.closeDialog(-105);
          ConsoleLexer.showLoadingProgressDialog(param0 ^ 44);
        }
    }

    final static void reportClientError(String param0, Throwable param1, int param2) {
        try {
          PlatformTaskDispatcher stackIn_13_0;
          java.net.URL stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          StringBuilder stackIn_13_4;
          java.net.URL stackIn_14_1;
          java.net.URL stackIn_14_2;
          String stackIn_14_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          PlatformTask var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = Kickabout.field_G;
          try {
            var3 = "";
            if (param1 != null) {
              var3 = ExceptionTextSupport.formatCompactStackTrace(true, param1);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            FootballerAiOverlaySupport.printError(var3, param2 ^ 0);
            var7 = ThreadSleepSupport.replaceAll(-1, ":", "%3a", var3);
            var8 = ThreadSleepSupport.replaceAll(param2 ^ -2, "@", "%40", var7);
            var9 = ThreadSleepSupport.replaceAll(-1, "&", "%26", var8);
            var10 = ThreadSleepSupport.replaceAll(-1, "#", "%23", var9);
            if (null == SocialListLayoutSupport.field_a) {
              return;
            }
            stackIn_13_0 = DelegatingCanvas.field_a;
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_3 = SocialListLayoutSupport.field_a.getCodeBase();
            stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(RotaryDialPainter.field_e).append("&u=");
            if (null == ModelMaterialDecoder.field_b) {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = "" + SocialUiState.field_a;
            } else {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = ModelMaterialDecoder.field_b;
            }
            var4 = ((PlatformTaskDispatcher) (Object) stackIn_13_0).requestUrl(new java.net.URL(stackIn_13_3, ((StringBuilder) (Object) stackIn_13_4).append(stackIn_14_5).append("&v1=").append(PlatformTaskDispatcher.field_u).append("&v2=").append(PlatformTaskDispatcher.field_r).append("&e=").append(var10).toString()), (byte) -29);
            while (var4.field_a == 0) {
              ThreadSleepSupport.sleepMillis(1L, param2 + 0);
            }
            if (param2 == var4.field_a) {
              var5 = (DataInputStream) (var4.field_b);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_B = "This auction has been bought out! Your bid of <%0> was returned to you.";
    }
}
