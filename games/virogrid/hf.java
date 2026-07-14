/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends aj {
    private int field_u;
    private int field_B;
    private mg[] field_x;
    private int field_y;
    static java.awt.Color field_v;
    static int field_C;
    static int[] field_D;
    static int[] field_A;
    static sh field_w;
    static int[] field_z;

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        L0: {
          if (!param1.field_p) {
            if (param1.f(true)) {
              L1: {
                var6 = 1;
                if (param1 instanceof tg) {
                  param2 = param2 & ((tg) (Object) param1).field_C;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (!param2) {
                  stackOut_11_0 = ((hf) this).field_u;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  if (var6 == 0) {
                    stackOut_10_0 = ((hf) this).field_B;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((hf) this).field_y;
                    stackIn_12_0 = stackOut_9_0;
                    break L2;
                  }
                }
              }
              var7 = stackIn_12_0;
              if (param4 != -23294) {
                return;
              } else {
                L3: {
                  if (param2) {
                    stackOut_15_0 = 16777215;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = 7105644;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                var8 = stackIn_16_0;
                kd.a(((hf) this).field_x, param1.field_u + param3 + (param1.field_m + -((hf) this).field_x[0].field_z >> 1149084929), false, param1.field_g, param1.field_l + param0, var7);
                int discarded$2 = ((hf) this).field_i.a(param1.field_n, param0 - -param1.field_l, param3 + param1.field_u - 2, param1.field_g, param1.field_m, var8, -1, 1, 1, ((hf) this).field_i.field_H);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_19_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_19_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_19_0;
          if (param1 instanceof tg) {
            param2 = param2 & ((tg) (Object) param1).field_C;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (!param2) {
            stackOut_26_0 = ((hf) this).field_u;
            stackIn_27_0 = stackOut_26_0;
            break L5;
          } else {
            if (var6 == 0) {
              stackOut_25_0 = ((hf) this).field_B;
              stackIn_27_0 = stackOut_25_0;
              break L5;
            } else {
              stackOut_24_0 = ((hf) this).field_y;
              stackIn_27_0 = stackOut_24_0;
              break L5;
            }
          }
        }
        var7 = stackIn_27_0;
        if (param4 != -23294) {
          return;
        } else {
          L6: {
            if (param2) {
              stackOut_30_0 = 16777215;
              stackIn_31_0 = stackOut_30_0;
              break L6;
            } else {
              stackOut_29_0 = 7105644;
              stackIn_31_0 = stackOut_29_0;
              break L6;
            }
          }
          var8 = stackIn_31_0;
          kd.a(((hf) this).field_x, param1.field_u + param3 + (param1.field_m + -((hf) this).field_x[0].field_z >> 1149084929), false, param1.field_g, param1.field_l + param0, var7);
          int discarded$3 = ((hf) this).field_i.a(param1.field_n, param0 - -param1.field_l, param3 + param1.field_u - 2, param1.field_g, param1.field_m, var8, -1, 1, 1, ((hf) this).field_i.field_H);
          return;
        }
    }

    public static void b(int param0) {
        field_w = null;
        field_A = null;
        if (param0 >= -79) {
            return;
        }
        field_v = null;
        field_z = null;
        field_D = null;
    }

    private hf(int param0, int param1, int param2) {
        ((hf) this).field_u = param2;
        ((hf) this).field_x = td.field_g;
        ((hf) this).field_B = param0;
        ((hf) this).field_y = param1;
        ((hf) this).field_i = on.field_b;
    }

    public hf() {
        this(2188450, 2591221, 9543);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new java.awt.Color(10040319);
        field_A = new int[8192];
        field_z = new int[8192];
    }
}
