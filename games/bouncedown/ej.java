/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static String field_b;
    static tg field_a;
    static int field_d;
    static String field_c;
    static String field_e;

    final static void a(int param0, String param1) {
        System.out.println("Error: " + ak.a(param0 ^ 123, "%0a", "\n", param1));
        if (param0 != 100) {
            field_d = -84;
        }
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        var5 = Bounce.field_N;
        vc.field_F = he.field_p;
        if (param0 != param3) {
          if (100 <= param0) {
            if (-106 > (param0 ^ -1)) {
              oa.field_c = wb.a(param0, param3 + -254, param2);
              return;
            } else {
              var4 = param1;
              oh.a((byte) -29, var4);
              oa.field_c = qj.a(false, param1);
              return;
            }
          } else {
            oa.field_c = wb.a(param0, param3 + -254, param2);
            return;
          }
        } else {
          L0: {
            stackOut_1_0 = 5579;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (13 <= cg.field_a) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          oa.field_c = r.a(stackIn_4_0, stackIn_4_1 != 0);
          var6 = null;
          oh.a((byte) -29, (String[]) null);
          return;
        }
    }

    public static void a(int param0) {
        int var1 = 36 % ((53 - param0) / 44);
        field_b = null;
        field_a = null;
        field_e = null;
        field_c = null;
    }

    final static boolean b(int param0) {
        if (param0 < 0) {
          if (dh.field_a != null) {
            if (pj.field_a != b.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (dh.field_a != null) {
            if (pj.field_a != b.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = null;
    }
}
