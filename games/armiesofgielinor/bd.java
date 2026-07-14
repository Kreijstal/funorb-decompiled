/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bd extends tc {
    static int[] field_q;
    static int field_r;
    static je field_o;
    int[] field_n;
    static String field_k;
    static String field_l;
    int field_m;
    static wk field_p;

    final static void a(String[][] param0, String[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 != 2378077) {
            return;
        }
        int var4 = fd.field_n[0].length;
        for (var5 = 0; var5 < var4; var5++) {
            var6 = param0[var5].length;
            aw.field_j[param2][var5] = new int[var6];
            da.a(var5, 0, param0, param1, param2);
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 != 28038) {
            return;
        }
        field_p = null;
        field_o = null;
        field_l = null;
        field_q = null;
    }

    final static void a(int param0, boolean param1, int param2, wk[] param3, int param4, int param5) {
        param3[0].e(param2, param5, param0);
        param3[1].c(param2 + param3[1].field_y, param5, param4 + -(param3[2].field_y << 2127308961), param3[2].field_v, param0);
        param3[2].e(param4 + (param2 + -param3[2].field_y), param5, param0);
        if (!param1) {
            field_p = null;
        }
    }

    final static void a(byte param0, fj param1) {
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            ra.field_e = param1;
            if (ra.field_e == null) {
              break L1;
            } else {
              if (!ra.field_e.field_h) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        L2: {
          ds.a(stackIn_4_0, 115);
          if (param0 >= 65) {
            break L2;
          } else {
            field_r = -94;
            break L2;
          }
        }
    }

    protected bd() {
    }

    abstract void a(int param0, ha param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "End Game";
        field_l = "Searching for an opponent";
        field_q = new int[]{8421504, 4868682, 6117412, 10061107, 13676848, 6111780, 6109220, 7022375, 10510689, 10526049, 10911834, 8429665, 6398112, 6389920, 7823776, 10510752, 5070116, 3104036, 2383197, 2378077, 2832496, 4270960, 6433648, 6104138, 13833236, 13355829, 13201949, 7252004, 4700601, 3047635, 8210361, 12991150};
    }
}
