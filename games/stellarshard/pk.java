/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static int field_c;
    static int field_g;
    static String field_f;
    static int field_h;
    static int[] field_j;
    static int[] field_i;
    static String[] field_d;
    static eb field_e;
    static String field_b;
    static qc field_a;

    final static boolean a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 != 0) {
          if (param0 != -12663) {
            L0: {
              field_f = null;
              if (-1 == (pl.field_U & 1 << param1)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              if (-1 == (pl.field_U & 1 << param1 ^ -1)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static void a(String param0, String[] param1, int param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var5 = stellarshard.field_B;
        o.field_l = ta.field_m;
        var4 = 63 / ((-39 - param3) / 62);
        if (255 != param2) {
          if (-101 >= (param2 ^ -1)) {
            if (105 < param2) {
              hi.field_d = fb.a(param2, true, param0);
              return;
            } else {
              hi.field_d = gj.a(true, param1);
              return;
            }
          } else {
            hi.field_d = fb.a(param2, true, param0);
            return;
          }
        } else {
          L0: {
            if (u.field_k >= 13) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          hi.field_d = dg.a(stackIn_4_0 != 0, 0);
          return;
        }
    }

    final static void a(int param0) {
        if (10 == eg.field_d) {
          ki.f(107);
          eg.field_d = 11;
          if (param0 == 4) {
            b.field_v = true;
            return;
          } else {
            boolean discarded$6 = pk.a(105, -118);
            b.field_v = true;
            return;
          }
        } else {
          if (!fa.a(-72)) {
            ki.f(107);
            eg.field_d = 11;
            if (param0 != 4) {
              boolean discarded$7 = pk.a(105, -118);
              b.field_v = true;
              return;
            } else {
              b.field_v = true;
              return;
            }
          } else {
            if (param0 == 4) {
              b.field_v = true;
              return;
            } else {
              boolean discarded$8 = pk.a(105, -118);
              b.field_v = true;
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_j = null;
        field_b = null;
        field_i = null;
        if (param0 <= 25) {
          pk.a(75);
          field_a = null;
          field_f = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Passwords can only contain letters and numbers";
        field_h = 100;
        field_i = new int[4];
        field_e = new eb();
    }
}
