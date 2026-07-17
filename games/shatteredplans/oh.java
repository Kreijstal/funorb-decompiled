/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oh {
    static qr field_c;
    static qr field_a;
    oh field_f;
    static String field_g;
    long field_b;
    static bi[] field_d;
    oh field_e;

    final static int b(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = 94 % ((-61 - param1) / 58);
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          L0: {
            if (6144 > param0) {
              stackOut_7_0 = -br.field_o[-param0 + 6144];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = br.field_o[-6144 + param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param0 < 2048) {
              stackOut_3_0 = br.field_o[2048 + -param0];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -br.field_o[param0 - 2048];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static void b(int param0) {
        if (param0 != ~gm.field_i) {
          if (dh.a(-12165)) {
            oi.field_f = true;
            return;
          } else {
            int discarded$4 = -125;
            qk.g();
            gm.field_i = 11;
            oi.field_f = true;
            return;
          }
        } else {
          int discarded$5 = -125;
          qk.g();
          gm.field_i = 11;
          oi.field_f = true;
          return;
        }
    }

    final static bg[] c(byte param0) {
        return new bg[]{og.field_b, dm.field_f, mj.field_Rb};
    }

    final void b(byte param0) {
        if (((oh) this).field_e != null) {
          ((oh) this).field_e.field_f = ((oh) this).field_f;
          if (param0 >= -57) {
            boolean discarded$2 = ((oh) this).c(32);
            ((oh) this).field_f.field_e = ((oh) this).field_e;
            ((oh) this).field_e = null;
            ((oh) this).field_f = null;
            return;
          } else {
            ((oh) this).field_f.field_e = ((oh) this).field_e;
            ((oh) this).field_e = null;
            ((oh) this).field_f = null;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static boolean b(boolean param0) {
        if (wg.field_f == null) {
            return false;
        }
        if (!cs.field_j.a(64)) {
            return false;
        }
        return true;
    }

    final boolean c(int param0) {
        if (!(((oh) this).field_e != null)) {
            return false;
        }
        if (param0 != 2048) {
            oh.b(12);
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "All remaining colonies have agreed to a diplomatic settlement.";
    }
}
