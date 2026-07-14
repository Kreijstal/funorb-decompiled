/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static int field_b;
    static String field_e;
    static String field_c;
    static String field_a;
    static String field_d;

    final static boolean a(boolean param0, int param1) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          return true;
        } else {
          L0: {
            if ((param1 & -param1) != param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static boolean a(ja param0, float param1, int param2) {
        if (param2 != 0) {
          return false;
        } else {
          return aa.a(vf.field_L, -(vf.field_L.field_s >> -280910815) + ng.field_G, -(vf.field_L.field_o >> 1703629537) + td.field_E, bk.field_a, 0, 0);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        field_a = null;
        if (param0 > 0) {
            boolean discarded$0 = uj.a(false, -95);
        }
    }

    final static String[] a(char param0, boolean param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = (CharSequence) (Object) param2;
        int var3 = cg.a(var9, param1, param0);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var3 > var7; var7++) {
            for (var8 = var6; param2.charAt(var8) != param0; var8++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_e = "Error connecting to server. Please try using a different server.";
        field_c = "Harvesting Pumpkin";
        field_a = "Starting Game";
        field_d = "to return to the normal view.";
    }
}
