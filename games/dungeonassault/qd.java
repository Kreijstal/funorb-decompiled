/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static cn field_d;
    static boolean[] field_c;
    static String field_a;
    static String[] field_e;
    static String field_b;

    final static ad a(int param0, int param1) {
        ad[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ad[] var5 = null;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param0 > 75) {
            break L0;
          } else {
            int discarded$2 = qd.a(12, 55, 102);
            break L0;
          }
        }
        var5 = ad.b(65280);
        var2 = var5;
        var3 = 0;
        L1: while (true) {
          if (var3 < var5.length) {
            if (param1 != var5[var3].field_b) {
              var3++;
              continue L1;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    final static nh a(boolean param0, boolean param1, int param2, byte param3, int param4) {
        if (param3 != -31) {
            field_e = null;
        }
        return uo.a(param0, param4, param1, param2, 27847, false);
    }

    public static void a(boolean param0) {
        if (!param0) {
            int discarded$0 = qd.a(-11, -87, -69);
        }
        field_a = null;
        field_e = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = tg.field_f[param2][param0];
        if (param1 != 380) {
            nh discarded$0 = qd.a(false, false, 41, (byte) -8, 52);
        }
        if (!(!ke.a(param1 ^ 280, var3))) {
            return 380;
        }
        return tg.field_j[param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Creating your account";
        field_b = "This password contains your Player Name, and would be easy to guess";
        field_e = new String[]{null, "This is the <%highlight>Dragons of Renown</col> table. It shows a list of all the players in the realm of Dungaria, sorted by their Renown. You can choose to start a raid against any of these players.<br><br><%command>Scroll through the list and examine your potential targets.</col>"};
    }
}
