/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg implements eb {
    private int field_j;
    private int field_c;
    private int field_f;
    static String field_i;
    static String field_b;
    static int field_g;
    private jl field_h;
    private int field_d;
    private int field_a;
    private int field_e;

    public static void a(int param0) {
        field_b = null;
        field_i = null;
        int var1 = -35 / ((param0 - 19) / 58);
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        tm var13 = null;
        tm var14 = null;
        ng stackIn_4_0 = null;
        ng stackIn_15_0 = null;
        Object stackOut_14_0 = null;
        ng stackOut_13_0 = null;
        Object stackOut_3_0 = null;
        ng stackOut_2_0 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        if (param1 != -124) {
          L0: {
            hg.a(-84);
            if (!(param0 instanceof tm)) {
              stackOut_14_0 = null;
              stackIn_15_0 = (ng) (Object) stackOut_14_0;
              break L0;
            } else {
              stackOut_13_0 = (ng) param0;
              stackIn_15_0 = stackOut_13_0;
              break L0;
            }
          }
          L1: {
            var13 = (tm) (Object) stackIn_15_0;
            t.d(param0.field_z + param3, param2 + param0.field_p, param0.field_E, param0.field_C, ((hg) this).field_d);
            if (var13 != null) {
              break L1;
            } else {
              break L1;
            }
          }
          var7 = param0.field_E - 2 * var13.field_R;
          var8 = param3 + param0.field_z + var13.field_R;
          var9 = param2 + param0.field_p - -var13.field_T;
          t.b(var8, var9, var7 + var8, var9, ((hg) this).field_c);
          var10 = -1 + var13.f((byte) 62);
          L2: while (true) {
            if (-1 < (var10 ^ -1)) {
              L3: {
                if (null != ((hg) this).field_h) {
                  ((hg) this).field_h.b(var13.field_q, var7 / 2 + var8, ((hg) this).field_h.field_M + (var9 - -var13.field_T), ((hg) this).field_f, ((hg) this).field_j);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              t.c(var8 - -(var7 * var13.a((byte) -91, var10) / var13.k(param1 + 123)), var9, ((hg) this).field_e, ((hg) this).field_a);
              var10--;
              continue L2;
            }
          }
        } else {
          L4: {
            if (!(param0 instanceof tm)) {
              stackOut_3_0 = null;
              stackIn_4_0 = (ng) (Object) stackOut_3_0;
              break L4;
            } else {
              stackOut_2_0 = (ng) param0;
              stackIn_4_0 = stackOut_2_0;
              break L4;
            }
          }
          L5: {
            var14 = (tm) (Object) stackIn_4_0;
            t.d(param0.field_z + param3, param2 + param0.field_p, param0.field_E, param0.field_C, ((hg) this).field_d);
            if (var14 != null) {
              break L5;
            } else {
              break L5;
            }
          }
          var7 = param0.field_E - 2 * var14.field_R;
          var8 = param3 + param0.field_z + var14.field_R;
          var9 = param2 + param0.field_p - -var14.field_T;
          t.b(var8, var9, var7 + var8, var9, ((hg) this).field_c);
          var10 = -1 + var14.f((byte) 62);
          L6: while (true) {
            if (-1 < (var10 ^ -1)) {
              L7: {
                if (null != ((hg) this).field_h) {
                  ((hg) this).field_h.b(var14.field_q, var7 / 2 + var8, ((hg) this).field_h.field_M + (var9 - -var14.field_T), ((hg) this).field_f, ((hg) this).field_j);
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            } else {
              t.c(var8 - -(var7 * var14.a((byte) -91, var10) / var14.k(param1 + 123)), var9, ((hg) this).field_e, ((hg) this).field_a);
              var10--;
              continue L6;
            }
          }
        }
    }

    hg(jl param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((hg) this).field_c = param3;
        ((hg) this).field_j = param2;
        ((hg) this).field_d = param4;
        ((hg) this).field_h = param0;
        ((hg) this).field_f = param1;
        ((hg) this).field_a = param6;
        ((hg) this).field_e = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<%0> has not yet unlocked this option for use.";
        field_b = "Rating";
        field_g = 50;
    }
}
