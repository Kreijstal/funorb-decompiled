/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchCompleteScreen extends MatchResultScreen {
    static int[][] field_C;
    static String field_z;
    static String[] field_y;
    static String field_F;
    static int field_E;
    static AlignedIconLabel[][] field_A;
    static UiComponent field_x;

    public static void f(byte param0) {
        field_z = null;
        field_A = (AlignedIconLabel[][]) null;
        field_C = (int[][]) null;
        field_x = null;
        int var1 = 55 / ((-70 - param0) / 41);
        field_F = null;
        field_y = null;
    }

    final void handleNavigationKey(int obfuscationGuard, int keyCode, char character) {
        if (obfuscationGuard != -120) {
          String var5 = (String) null;
          MatchCompleteScreen.a((String) null, 111);
        }
        this.selection.navigateHorizontal(0, -1);
    }

    final int getResultBottom(int obfuscationGuard) {
        if (obfuscationGuard != -6) {
          MatchCompleteScreen.f((byte) -118);
        }
        return 480;
    }

    final static boolean a(byte param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (MatchCompleteScreen.a(param1, 0)) {
            return false;
          }
          if (DualLinkDeque.a((byte) 54, param1)) {
            return false;
          }
          if (pp.a(param1, true)) {
            return false;
          }
          if (param0 >= -38) {
            return true;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (MenuButton.a(param1, 0, param2)) {
            return false;
          }
          if (ll.a(param1, (byte) 122, param2)) {
            return false;
          }
          if (!ep.a(param1, (byte) 73, param2)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ab.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    MatchCompleteScreen() {
        super(20, lo.field_a);
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var2_int = param1; var2_int < param0.length(); var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!StateIconLabel.isAsciiLetter(true, (char) var3) &&
              !eh.isAsciiDigit((char) var3, (byte) 95)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ab.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static LobbyPlayer findLobbyPlayer(byte obfuscationGuard, long playerId) {
        if (obfuscationGuard != 96) {
          MatchCompleteScreen.findLobbyPlayer((byte) 62, 38L);
        }
        return (LobbyPlayer) (eq.lobbyPlayerIndex.get(playerId, obfuscationGuard ^ -97));
    }

    static {
        int var0 = 0;
        field_z = "Add name";
        field_C = new int[5][256];
        field_y = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_F = "Weak: your ball will be unable to destroy any bricks.";
        for (var0 = 0; var0 < 5; var0++) {
          field_C[var0][240] = 15790320;
          field_C[var0][251] = 16382457;
          field_C[var0][255] = 16777215;
        }
        field_C[0][104] = 16301244;
        field_C[0][97] = 16760767;
        field_C[0][95] = 15907000;
        field_C[1][95] = 11703759;
        field_C[1][104] = 12098263;
        field_C[1][97] = 12558303;
        field_C[2][104] = 10012328;
        field_C[2][95] = 9616800;
        field_C[2][97] = 10473381;
        field_C[3][95] = 13738423;
        field_C[3][97] = 15184843;
        field_C[3][104] = 14461633;
        field_C[4][95] = 12374409;
        field_C[4][104] = 12967056;
        field_C[4][97] = 13625239;
    }
}
