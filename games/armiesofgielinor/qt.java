/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qt {
    static int[] field_c;
    static String field_d;
    static ru field_e;
    static String field_a;
    static String field_b;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        field_e = null;
        field_c = null;
        field_b = null;
        if (param0 <= 89) {
            int discarded$0 = qt.a(70, 71, (byte) -22);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if ((param1 ^ -1) >= -1) {
            if (param2 > -49) {
              field_b = null;
              return var3;
            } else {
              return var3;
            }
          } else {
            var3 = var3 << -683904767 | param0 & 1;
            param1--;
            param0 = param0 >>> 1;
            continue L0;
          }
        }
    }

    final static void a(boolean param0) {
        tm.a();
        if (param0) {
            return;
        }
        tm.b(0.75f);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_d = "Bridges can only be built on straight coastlines.";
        field_a = "Defeat the enemy leader to win this battle.";
        field_b = "You have withdrawn your request to join.";
    }
}
