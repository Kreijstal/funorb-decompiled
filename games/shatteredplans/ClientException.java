/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ClientException extends RuntimeException {
    String field_b;
    Throwable field_e;
    static String field_c;
    static int[] field_f;
    static String field_g;
    static int field_d;
    static int field_a;

    final static void openDefaultQuickChatMenu(boolean param0) {
        ProductionContent.field_h = 0;
        AccountNoticeDialog.r(0);
        if (!param0) {
          int[] var2 = (int[]) null;
          ClientException.sortPairedIntsDescending(-36, -67, -120, (int[]) null, (int[]) null);
        }
    }

    final static void drawGradientWidgetBorder(byte param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          SoftwareRasterizer.drawHorizontalLine(param3, param1, param4 + 1, 10000536);
          SoftwareRasterizer.drawHorizontalLine(param3, param2 + param1, 1 + param4, 12105912);
          var5_int = 1;
          var6 = param2;
          if (var5_int + param1 < SoftwareRasterizer.field_a) {
            var5_int = -param1 + SoftwareRasterizer.field_a;
          }
          if (SoftwareRasterizer.field_f < param1 + var6) {
            var6 = -param1 + SoftwareRasterizer.field_f;
          }
          var7 = -57 % ((param0 - 36) / 45);
          for (var8 = var5_int; var8 < var6; var8++) {
            var9 = 48 * var8 / param2 + 152;
            var10 = var9 << 8 | var9 << 16 | var9;
            SoftwareRasterizer.field_h[param3 + SoftwareRasterizer.field_b * (var8 + param1)] = var10;
            SoftwareRasterizer.field_h[param4 + param3 + (param1 + var8) * SoftwareRasterizer.field_b] = var10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var5), "rg.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void clearTutorialConditionalTextAges(boolean param0) {
        if (param0) {
          field_f = (int[]) null;
        }
    }

    final static void drawAccountChoiceMenu(int param0) {
        int var3 = 0;
        boolean stackIn_13_0 = false;
        TiledNineSlicePainter stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        TiledNineSlicePainter var9 = null;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1_int = ValidationMessageWidget.field_R - ByteArrayReadRequest.field_j;
          ByteArrayReadRequest.field_j = -(var1_int >> 1) + WeightedLruCache.field_e;
          GameSoundSetupSupport.field_b = -(DiskCacheWorker.field_b >> 1) + LoginForm.field_O;
          ValidationMessageWidget.field_R = ByteArrayReadRequest.field_j + var1_int;
          var2 = GameSoundSetupSupport.field_b;
          if (param0 <= 32) {
            return;
          }
          for (var3 = 0; StarLinkPlanner.field_c.length > var3; var3++) {
            var4 = ClientClockSupport.field_d[var3];
            if (0 > var4) {
              var5 = ProductionContent.field_j;
            } else {
              if (var4 == AccountStatusDialog.field_nb.field_c) {
                var5 = LoginResultSupport.field_a;
              } else {
                var5 = AccountNoticeKind.field_b;
              }
            }
            var6 = StarLinkPlanner.field_c[var3];
            stackIn_13_0 = !(var4 < 0);
            var7 = UiTextSupport.measureMenuLabel(stackIn_13_0, var6, true);
            var8 = WeightedLruCache.field_e - (var7 >> 1);
            if (var4 >= 0) {
              var2 = var2 + LobbyOptionSupport.field_e;
              if (AccountStatusDialog.field_nb.field_c != var4) {
                stackIn_17_0 = UniformNineSliceFactory.field_e;
              } else {
                stackIn_17_0 = SocialNameInputPanel.field_Cb;
              }
              var9 = stackIn_17_0;
              if (var9 != null) {
                var9.draw((LobbyRoomInteractionSupport.field_g << 1) + ClientUiResourceState.field_b, -LobbyOptionSupport.field_g + var8, var2, var7 + (LobbyOptionSupport.field_g << 1), -103);
              }
              var2 = var2 + LobbyRoomInteractionSupport.field_g;
            }
            if (var4 >= 0) {
              MusicEnvelope.field_g.drawString(var6, var8, var2 + KeyboardStateSupport.field_c, var5, -1);
              var2 = var2 + (ClientUiResourceState.field_b + LobbyOptionSupport.field_e + LobbyRoomInteractionSupport.field_g);
            } else {
              FourIntSubmissionRequest.field_k.drawString(var6, var8, var2 + WidgetStyle.field_r, var5, -1);
              var2 = var2 + MenuButton.field_A;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1), "rg.B(" + param0 + ')');
        }
    }

    final static void sortPairedIntsDescending(int param0, int param1, int param2, int[] param3, int[] param4) {
        int var10 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != -2147483648) {
            return;
          }
          if (param2 > param0) {
            var5_int = (param0 + param2) / 2;
            var6 = param0;
            var7 = param4[var5_int];
            param4[var5_int] = param4[param2];
            param4[param2] = var7;
            var8 = param3[var5_int];
            param3[var5_int] = param3[param2];
            param3[param2] = var8;
            stackIn_8_0 = (var7 != 2147483647) ? 1 : 0;
            var9 = stackIn_8_0;
            for (var10 = param0; param2 > var10; var10++) {
              if ((-(var9 & var10) + var7) < param4[var10]) {
                var11 = param4[var10];
                param4[var10] = param4[var6];
                param4[var6] = var11;
                var12 = param3[var10];
                param3[var10] = param3[var6];
                param3[var6++] = var12;
              }
            }
            param4[param2] = param4[var6];
            param4[var6] = var7;
            param3[param2] = param3[var6];
            param3[var6] = var8;
            ClientException.sortPairedIntsDescending(param0, -2147483648, -1 + var6, param3, param4);
            ClientException.sortPairedIntsDescending(1 + var6, -2147483648, param2, param3, param4);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rg.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static int randomInRange(int param0, int param1, byte param2) {
        if (param2 < 81) {
          field_d = -104;
          return TaskAi.randomBelow(param0 + (-param1 + 1), DateValidationSupport.field_b, -11) + param1;
        }
        return TaskAi.randomBelow(param0 + (-param1 + 1), DateValidationSupport.field_b, -11) + param1;
    }

    public static void clearStatics(int param0) {
        if (param0 <= 54) {
          field_d = 111;
          field_g = null;
          field_c = null;
          field_f = null;
          return;
        }
        field_g = null;
        field_c = null;
        field_f = null;
    }

    ClientException(Throwable param0, String param1) {
        this.field_e = param0;
        this.field_b = param1;
    }

    static {
        field_c = "Logging in...";
        field_a = 56;
        field_g = "Fleets built";
    }
}
