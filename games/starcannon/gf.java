/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static String field_e;
    static int field_b;
    static boolean field_d;
    static ud[] field_c;
    static hl[] field_a;

    public static void a(byte param0) {
        if (param0 > -102) {
          field_c = (ud[]) null;
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = rc.field_d;
        synchronized (var1) {
          L0: {
            L1: {
              pg.field_g = pg.field_g + 1;
              te.field_b = uh.field_i;
              pe.field_d = hj.field_d;
              la.field_c = wj.field_a;
              uf.field_d = vj.field_Y;
              vj.field_Y = false;
              kg.field_a = na.field_c;
              if (param0) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            rg.field_B = fb.field_j;
            kc.field_Q = oi.field_f;
            na.field_c = 0;
            break L0;
          }
        }
    }

    static {
        field_e = "PULSE LASER - Switches the Nova Ray to use the wide spread of the pulse laser.";
        field_d = false;
    }
}
