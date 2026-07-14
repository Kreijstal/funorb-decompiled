/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh implements pf {
    private int field_k;
    private int field_f;
    private int field_m;
    private int field_l;
    private int field_b;
    private dj field_j;
    static vn field_c;
    private int field_i;
    static String field_h;
    static String field_d;
    static boolean field_n;
    static eg field_g;
    static String field_a;
    static String[] field_e;

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wg var12 = null;
        qm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        qm stackOut_1_0 = null;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          if (!(param0 instanceof wg)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (qm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (qm) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (wg) (Object) stackIn_3_0;
          de.d(param0.field_n + param2, param3 - -param0.field_j, param0.field_v, param0.field_k, ((lh) this).field_k);
          if (var12 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        if (param1 == 5592405) {
          var7 = -(2 * var12.field_H) + param0.field_v;
          var8 = param0.field_n + param2 - -var12.field_H;
          var9 = var12.field_L + (param0.field_j + param3);
          de.b(var8, var9, var7 + var8, var9, ((lh) this).field_b);
          var10 = -1 + var12.c(false);
          L2: while (true) {
            if (0 > var10) {
              if (null != ((lh) this).field_j) {
                ((lh) this).field_j.b(var12.field_g, var8 - -(var7 / 2), var12.field_L + (((lh) this).field_j.field_H + var9), ((lh) this).field_l, ((lh) this).field_f);
                return;
              } else {
                return;
              }
            } else {
              de.i(var8 + var7 * var12.a(0, var10) / var12.g((byte) -102), var9, ((lh) this).field_i, ((lh) this).field_m);
              var10--;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
        field_d = null;
        if (param0 != 2) {
          field_d = null;
          field_a = null;
          field_g = null;
          return;
        } else {
          field_a = null;
          field_g = null;
          return;
        }
    }

    lh(dj param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((lh) this).field_i = param5;
        ((lh) this).field_f = param2;
        ((lh) this).field_b = param3;
        ((lh) this).field_j = param0;
        ((lh) this).field_k = param4;
        ((lh) this).field_l = param1;
        ((lh) this).field_m = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new vn();
        field_d = "Just one target left; you're almost there! If a target is hard to hit, try aiming away from it and watching how Arcane Arrow curves around to the focus point.";
        field_h = "Remaining time this turn";
        field_a = "Discard";
        field_e = new String[]{"All scores", "My scores", "Best each"};
    }
}
