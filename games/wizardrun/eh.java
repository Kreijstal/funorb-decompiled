/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh implements bf {
    private vd field_b;
    static String field_i;
    private int field_f;
    static String field_h;
    private int field_j;
    private int field_d;
    static uh field_e;
    private int field_a;
    private int field_c;
    private int field_g;

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        vb var12 = null;
        ub stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        ub stackOut_1_0 = null;
        L0: {
          var11 = wizardrun.field_H;
          if (!(param2 instanceof vb)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (ub) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (ub) param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (vb) (Object) stackIn_3_0;
          ed.c(param2.field_o + param0, param1 + param2.field_l, param2.field_r, param2.field_n, ((eh) this).field_a);
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = -(2 * var12.field_G) + param2.field_r;
        var8 = var12.field_G + (param2.field_o + param0);
        if (!param3) {
          return;
        } else {
          var9 = param2.field_l + param1 - -var12.field_J;
          ed.e(var8, var9, var8 - -var7, var9, ((eh) this).field_j);
          var10 = -1 + var12.d(0);
          L2: while (true) {
            if (-1 < (var10 ^ -1)) {
              L3: {
                if (((eh) this).field_b != null) {
                  ((eh) this).field_b.b(var12.field_k, var8 - -(var7 / 2), var12.field_J + var9 + ((eh) this).field_b.field_E, ((eh) this).field_c, ((eh) this).field_g);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              ed.a(var12.b(-10455, var10) * var7 / var12.e(1) + var8, var9, ((eh) this).field_d, ((eh) this).field_f);
              var10--;
              continue L2;
            }
          }
        }
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 != 2) {
            eh.b(-17);
            field_e = null;
            field_i = null;
            return;
        }
        field_e = null;
        field_i = null;
    }

    eh(vd param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((eh) this).field_d = param5;
        ((eh) this).field_g = param2;
        ((eh) this).field_j = param3;
        ((eh) this).field_f = param6;
        ((eh) this).field_c = param1;
        ((eh) this).field_b = param0;
        ((eh) this).field_a = param4;
    }

    final static long a(int param0) {
        if (param0 != 2) {
            field_e = null;
            return d.a((byte) 75) + -eg.field_C;
        }
        return d.a((byte) 75) + -eg.field_C;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Email is valid";
        field_e = null;
        field_i = " </col>Stage:<col=ffff00>";
    }
}
