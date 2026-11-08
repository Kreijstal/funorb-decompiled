/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextEntrySupport {
    static boolean field_f;
    static String field_e;
    static String[] field_g;
    static String field_a;
    static String field_d;
    static String field_h;
    static String field_c;
    static ScrollBar field_b;

    final static MenuButton[] selectMenuButtons(int[] param0, MenuButton[] param1, int param2) {
        int var4 = 0;
        MenuButton[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        MenuButton[] var6 = null;
        MenuButton[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          if (param0 == null) {
            return null;
          }
          var6 = new MenuButton[param0.length];
          var3 = var6;
          for (var4 = param2; var4 < param0.length; var4++) {
            var6[var4] = param1[param0[var4]];
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("rr.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean isPrintableClientCharacter(int param0, char param1) {
        if (param1 >= 32 &&
          param1 <= 126) {
          return true;
        }
        if (param1 >= 160 &&
          param1 <= 255) {
          return true;
        }
        int var2 = -23 / ((-53 - param0) / 55);
        if (param1 != 8364 &&
          param1 != 338 &&
          param1 != 8212 &&
          param1 != 339 &&
          param1 != 376) {
          return false;
        }
        return true;
    }

    final static int parseDecimalInt(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 10) {
            stackIn_4_0 = BlackFadeScreen.parseIntegerInRadix(param1, true, (byte) -103, 10);
            return stackIn_4_0;
          }
          stackIn_2_0 = -120;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rr.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        field_g = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_c = null;
        int var1 = -50 / ((-58 - param0) / 50);
        field_a = null;
    }

    final static void openPrivateQuickChat(String param0, byte param1, long param2) {
        CharSequence var5 = null;
        try {
          TrinketTile.field_Kb = param0;
          if (param1 != -70) {
            TextEntrySupport.isPrintableClientCharacter(36, '+');
          }
          NodeHashTableIterator.field_b = 2;
          var5 = (CharSequence) ((Object) param0);
          PlayerStatSortCriterion.field_o = MatchAgent.normalizeAccountName(param1 ^ -70, var5);
          IntDoubleCommand.field_A = param2;
          PlayArea.showCurrentQuickChatMenu(true);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "rr.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "<%0> must play <%1> more rated games before playing with the current options.";
        field_g = new String[]{"Tutorial", "Sprinting", "Sprinting", "Sprinting", "Dribbling", "Passing", "Passing", "Charging Up", "Tackling", "Tackling", "Tackling", "The Gauntlet", "Lobbing", "Lobbing", "Switching Player", "The Hotshot", "Scoring a Goal", "Scoring a Goal", "Choosing A Formation", "Choosing A Lineup", "Sandbox Mode"};
        field_d = "Too High";
        field_h = "TAB - hide chat temporarily";
        field_f = false;
        field_a = "<%0> scores a goal, extending their lead over <%1> with a score of <%2> to <%3>.";
        field_c = "Invalid date";
    }
}
