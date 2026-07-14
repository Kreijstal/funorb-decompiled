/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends ae {
    static ja field_k;
    static String field_j;
    int field_l;
    static int field_n;
    static java.awt.Image field_i;
    private int field_m;

    final void a(int param0, qd param1) {
        Object var4 = null;
        if (param0 != 0) {
          var4 = null;
          boolean discarded$2 = fq.a((k) null, (byte) 15);
          param1.a((byte) -74, ((fq) this).field_l, ((fq) this).field_m);
          return;
        } else {
          param1.a((byte) -74, ((fq) this).field_l, ((fq) this).field_m);
          return;
        }
    }

    public static void c(boolean param0) {
        Object var2 = null;
        field_i = null;
        field_j = null;
        if (!param0) {
          var2 = null;
          boolean discarded$2 = fq.a((k) null, (byte) -34);
          field_k = null;
          return;
        } else {
          field_k = null;
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          return;
        } else {
          pb.field_e.c("state " + ((fq) this).field_l + " in " + (-param3 + ((fq) this).field_f), 5, 20, 16777215, 0);
          return;
        }
    }

    final static boolean a(int param0, ga param1) {
        int var2 = -79 / ((-36 - param0) / 36);
        return param1.h(1, 14862) == 1 ? true : false;
    }

    final static boolean a(int param0, int param1, int[] param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 < 126) {
          L0: {
            field_j = null;
            if ((param2[param0 >> -1978018459] & 1 << (param0 & 31)) == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((param2[param0 >> -1978018459] & 1 << (param0 & 31)) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(boolean param0, int param1, ug param2, int param3, int param4) {
        ra.field_m.a(param2, 1000000, !param0 ? true : false, param4, param1, true);
        int var5 = 95 / ((5 - param3) / 60);
    }

    final static boolean a(k param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -114) {
          L0: {
            field_k = null;
            var2 = param0.g(31365);
            if (var2 != 1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          var3 = stackIn_8_0;
          return var3 != 0;
        } else {
          L1: {
            var2 = param0.g(31365);
            if (var2 != 1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          return var3 != 0;
        }
    }

    fq(int param0, int param1, int param2) {
        super(param0);
        ((fq) this).field_m = param2;
        ((fq) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Create a free account to start using this feature";
    }
}
