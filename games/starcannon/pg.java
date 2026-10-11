/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends rf {
    static volatile int field_g;
    static int field_f;

    private pg() throws Throwable {
        throw new Error();
    }

    final static void a(boolean param0, byte param1) {
        na.field_a = ia.field_k * 10;
        if (nf.field_l != 0) {
          if (param1 > -39) {
            pg.a(true, (byte) -105);
          }
        } else {
          na.field_a = na.field_a >> 2;
          if (param1 > -39) {
            pg.a(true, (byte) -105);
            if (2 == nf.field_l) {
              na.field_a = na.field_a << 1;
            }
            if (param0) {
              if (50000 <= na.field_a) {
                ph.a(243, false, 12);
              }
              if (100000 > na.field_a) {
                if (na.field_a >= 200000) {
                  ph.a(241, false, 14);
                }
                return;
              }
              ph.a(242, false, 13);
              if (na.field_a < 200000) {
                return;
              }
              ph.a(241, false, 14);
            }
            return;
          }
        }
        if (2 == nf.field_l) {
          na.field_a = na.field_a << 1;
        }
        if (!param0) {
          return;
        }
        if (50000 <= na.field_a) {
          ph.a(243, false, 12);
        }
        if (100000 > na.field_a) {
          if (na.field_a < 200000) {
            return;
          }
          ph.a(241, false, 14);
          return;
        }
        ph.a(242, false, 13);
        if (na.field_a >= 200000) {
          ph.a(241, false, 14);
        }
    }

    static {
        field_g = 0;
        field_f = 0;
    }
}
