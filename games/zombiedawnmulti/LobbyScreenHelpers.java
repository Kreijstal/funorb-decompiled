/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class LobbyScreenHelpers {
    static boolean field_b;
    static boolean field_a;

    final static String replaceChar(char param0, String param1, String param2, int param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$3 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4_int = param2.length();
          var5 = param1.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if (var8_int < 0) {
                break;
              }
              var8_int++;
              var6 = var6 + var7;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param2.indexOf((int) param0, var9);
            if (var10 >= 0) {
              discarded$4 = var8.append(param2.substring(var9, var10));
              discarded$5 = var8.append(param1);
              var9 = var10 + 1;
              continue;
            }
            break;
          }
          if (param3 > -36) {
            stackIn_10_0 = (String) null;
            return stackIn_10_0;
          }
          discarded$3 = var8.append(param2.substring(var9));
          stackIn_12_0 = var8.toString();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ee.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final static LevelData loadLevelVersion3(byte[] param0, boolean param1) {
        int var6 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var7 = 0;
        LevelData stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = 90000;
          var3 = 10;
          var4 = 0;
          var5 = new byte[param0.length + 12];
          LevelEncodingHelpers.putInt(-107, 0, var5, RasterStackHelpers.readIntAt(param1, 0, param0));
          LevelEncodingHelpers.putInt(-124, 1, var5, var4);
          LevelEncodingHelpers.putInt(-101, 2, var5, var2_int);
          LevelEncodingHelpers.putInt(-113, 3, var5, var3);
          for (var6 = 1; var6 < param0.length / 4; var6++) {
            LevelEncodingHelpers.putInt(-115, 3 + var6, var5, RasterStackHelpers.readIntAt(true, var6, param0));
          }
          stackIn_5_0 = LevelEncodingHelpers.decodeLegacyLevel(-93, var5);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ee.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean pollStatusSocket(boolean param0, boolean param1) {
        long dupTemp$2 = 0L;
        if (AudioServiceHelpers.field_g == null) {
          AudioServiceHelpers.field_g = ViewportController.field_m.requestSocket(LobbyDrawHelpers.field_c, FeatureSupportHelpers.field_b, (byte) -120);
        }
        if (AudioServiceHelpers.field_g.field_f == 0) {
          return false;
        }
        dupTemp$2 = ClockAndScreenHelpers.monotonicMillis((byte) 90);
        UiWidget.field_g = dupTemp$2;
        AlignedIconLabel.field_Gb = dupTemp$2;
        if (param1) {
          return false;
        }
        if (AudioServiceHelpers.field_g.field_f != 1) {
        }
        IntroScreen.field_l = IndexedSpriteState.field_i;
        AudioServiceHelpers.field_g = null;
        return true;
    }

    final static SimHuman createArmedHuman(int param0, int param1, int param2, boolean param3) {
        if (!param3) {
          field_b = false;
        }
        if (19 == param0) {
          return null;
        }
        return (SimHuman) ((Object) new SimArmedHuman(param2, param1, param0));
    }

    final static void updateLobbyScreen(int param0, boolean param1, int param2, int param3, int param4, boolean param5, boolean param6, int param7, boolean param8, int param9, int param10, boolean param11, int param12, boolean param13) {
        MeltdownPuddleCell.field_j = null;
        QuickChatHelpDialog.showKickedFromGameNotice((byte) 75);
        param8 = StatSubmissionHelpers.routePointerInput(param10, 4, param3, param2, param7, param8, param4);
        LabeledChildWidget.updateLobbyPanels(param9, param13, param12, 2, param8, param0, param6, param2, param5, param11);
        if (!param1) {
          LobbyScreenHelpers.updateLobbyScreen(-102, true, -123, -91, -93, false, false, -65, false, 82, -99, true, 54, true);
        }
        DialWidgetPainter.updateLobbyPlayerList(param12, (byte) 101, param6);
        QuickChatCategoryRegistry.updateChatPanel((byte) -114, param12, param8, param7);
    }

    static {
        field_b = false;
    }
}
