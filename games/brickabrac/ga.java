/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends nm {
    static jp[] field_k;
    static int field_i;
    static int field_j;
    static boolean[] field_l;

    public ga() {
    }

    final static void a(boolean param0, int param1) {
        boolean decompiledFrameRemainder0 = true;
        if ((ml.field_b <= 0) &&
          (decompiledFrameRemainder0 = (!(pe.field_j <= 0) ||
          !(0 >= eg.field_m))) &&
          (decompiledFrameRemainder0 = !(!hc.field_c))) {
          lb.b(0, 0, lb.field_c, gp.field_d.field_db);
          wi.field_j.a(true, param0);
          if (param1 >= -106) {
            field_l = (boolean[]) null;
          }
          return;
        }
        if (decompiledFrameRemainder0) {
          if (sc.field_c) {
            lb.b(0, 0, lb.field_c, gp.field_d.field_db);
            qp.field_f.a(true, param0);
            if ((!(pe.field_j <= 0) ||
              !(0 >= eg.field_m)) &&
              hc.field_c) {
              lb.b(0, 0, lb.field_c, gp.field_d.field_db);
              wi.field_j.a(true, param0);
            }
          } else {
            if (pe.field_j > 0) {
              if (hc.field_c) {
                lb.b(0, 0, lb.field_c, gp.field_d.field_db);
                wi.field_j.a(true, param0);
              }
            } else {
              if (0 < eg.field_m &&
                hc.field_c) {
                lb.b(0, 0, lb.field_c, gp.field_d.field_db);
                wi.field_j.a(true, param0);
              }
            }
          }
        }
        if (param1 < -106) {
          return;
        }
        field_l = (boolean[]) null;
    }

    final static void d(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        if (ki.field_d <= 32) {
          h.a(13894, 0);
          var1 = -2 % ((-60 - param0) / 34);
          return;
        }
        var1Lifetime1 = ki.field_d % 32;
        if (0 == var1Lifetime1) {
          var1Lifetime1 = 32;
        }
        h.a(13894, ki.field_d - var1Lifetime1);
        var1Lifetime2 = -2 % ((-60 - param0) / 34);
    }

    final static boolean c(int param0) {
        if (param0 != 30794) {
          return false;
        }
        return !ma.field_I.b(96) ? true : false;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          ga.a(51);
          field_l = null;
          field_k = null;
          return;
        }
        field_l = null;
        field_k = null;
    }

    static {
    }
}
