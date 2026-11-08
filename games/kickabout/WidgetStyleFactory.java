/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetStyleFactory {
    static PopupDialog field_c;
    static Sprite field_a;
    static ContextMenu field_b;

    final static AvailabilityCheckRequest createAvailabilityRequest(int param0, String param1) {
        RuntimeException var2 = null;
        AvailabilityCheckRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -3505) {
            field_c = (PopupDialog) null;
          }
          stackIn_3_0 = new AvailabilityCheckRequest(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("su.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void drawRasterToCanvas(int param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var4 = param3.getGraphics();
            if (param0 != 27744) {
              field_a = (Sprite) null;
            }
            ColorQuantizationBox.field_f.drawImage(param1, 10, param2, var4);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("su.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static String decodeBase37Name(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        StringBuilder discarded$0 = null;
        int var9 = Kickabout.field_G;
        if (param1 <= 0L) {
          return null;
        }
        if (param1 >= 6582952005840035281L) {
          return null;
        }
        if (0L != param1 % 37L) {
          var3 = param0;
          var4 = param1;
          while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
          }
          var6 = new StringBuilder(var3);
          while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            discarded$0 = var6.append(ContextMenu.field_yb[(int)(var7 - param1 * 37L)]);
          }
          return var6.reverse().toString();
        }
        return null;
    }

    final static void appendRankingStatistics(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        int var6;
        int var7;
        PlatformTaskState.field_e[AuctionsScreen.field_O] = param3;
        ByteStorage.field_d[AuctionsScreen.field_O] = AuctionsScreen.field_O;
        LobbyMatchPreview.field_m[AuctionsScreen.field_O] = param4;
        if (BlackFadeScreen.field_g >= param4) {
          if (TextHotspotRegion.field_k <= param4) {
            AccountMessagePanel.field_G[AuctionsScreen.field_O] = param5;
            AgeValidator.field_j[AuctionsScreen.field_O] = param0;
            DropTargetWidget.field_B[AuctionsScreen.field_O] = param2;
            var6 = param5 - (-param0 - param2);
            if (var6 == 0) {
              stackIn_45_0 = 0;
            } else {
              stackIn_45_0 = param5 * 1000 / var6;
            }
            var7 = stackIn_45_0;
            DialogOverlay.field_a[AuctionsScreen.field_O] = var7;
            AuctionsScreen.field_O = AuctionsScreen.field_O + 1;
            if (NanoTickClock.field_s > var7) {
              NanoTickClock.field_s = var7;
            }
            if (var7 > TournamentLobbyScreen.field_V) {
              TournamentLobbyScreen.field_V = var7;
            }
            if (param1 == -106) {
              return;
            }
            field_b = (ContextMenu) null;
            return;
          }
          NanoTickClock.field_s = param4;
          AccountMessagePanel.field_G[AuctionsScreen.field_O] = param5;
          AgeValidator.field_j[AuctionsScreen.field_O] = param0;
          DropTargetWidget.field_B[AuctionsScreen.field_O] = param2;
          var6 = param5 - (-param0 - param2);
          if (var6 == 0) {
            stackIn_32_0 = 0;
          } else {
            stackIn_32_0 = param5 * 1000 / var6;
          }
          var7 = stackIn_32_0;
        } else {
          TournamentLobbyScreen.field_V = param4;
          if (TextHotspotRegion.field_k <= param4) {
            AccountMessagePanel.field_G[AuctionsScreen.field_O] = param5;
            AgeValidator.field_j[AuctionsScreen.field_O] = param0;
            DropTargetWidget.field_B[AuctionsScreen.field_O] = param2;
            var6 = param5 - (-param0 - param2);
            if (var6 == 0) {
              stackIn_5_0 = 0;
            } else {
              stackIn_5_0 = param5 * 1000 / var6;
            }
            var7 = stackIn_5_0;
          } else {
            NanoTickClock.field_s = param4;
            AccountMessagePanel.field_G[AuctionsScreen.field_O] = param5;
            AgeValidator.field_j[AuctionsScreen.field_O] = param0;
            DropTargetWidget.field_B[AuctionsScreen.field_O] = param2;
            var6 = param5 - (-param0 - param2);
            if (var6 == 0) {
              stackIn_18_0 = 0;
            } else {
              stackIn_18_0 = param5 * 1000 / var6;
            }
            var7 = stackIn_18_0;
          }
        }
        DialogOverlay.field_a[AuctionsScreen.field_O] = var7;
        AuctionsScreen.field_O = AuctionsScreen.field_O + 1;
        if (NanoTickClock.field_s > var7) {
          NanoTickClock.field_s = var7;
        }
        if (var7 > TournamentLobbyScreen.field_V) {
          TournamentLobbyScreen.field_V = var7;
        }
        if (param1 == -106) {
          return;
        }
        field_b = (ContextMenu) null;
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        int var1 = -21 % ((param0 + 46) / 55);
    }

    final static int getReducedPlayerValue(byte param0, PlayerStats param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 79 % ((-40 - param0) / 58);
          var3 = (PasswordLoginCredentials.a(param1, -576054046) << 1) / 3;
          if (var3 < 10) {
            var3 = 10;
          }
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("su.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static UiLayoutNode createStyledWidget(int param0, int param1, int param2, boolean param3, int param4, BitmapFont param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        UiLayoutNode var13 = null;
        RuntimeException var13_ref = null;
        UiLayoutNode stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            field_c = (PopupDialog) null;
          }
          var13 = new UiLayoutNode(0L, (UiLayoutNode) null);
          var13.field_R = FormationMaskSupport.a(param4, 0, param11);
          var13.field_S = FormationMaskSupport.a(param2, 0, param9);
          var13.field_rb = FormationMaskSupport.a(param12, 0, param1);
          var13.field_u = FormationMaskSupport.a(param8, 0, param0);
          var13.field_tb = FormationMaskSupport.a(param7, 0, param6);
          var13.field_X = param5;
          var13.field_y = param10;
          stackIn_3_0 = var13;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_6_0 = var13_ref;
          stackIn_6_1 = new StringBuilder().append("su.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    static {
    }
}
