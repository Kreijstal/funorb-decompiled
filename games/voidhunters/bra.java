/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bra {
    static String[] field_f;
    private t field_c;
    java.awt.Canvas field_a;
    ha field_g;
    long field_e;
    fs field_b;
    static int field_d;

    bra(ha param0, fs param1, java.awt.Canvas param2) {
        try {
            this.field_a = param2;
            this.field_g = param0;
            this.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final t a(byte param0) {
        if (param0 > -113) {
          L0: {
            this.field_e = -31L;
            if (null == this.field_c) {
              this.field_c = new t();
              break L0;
            } else {
              break L0;
            }
          }
          this.field_c.a(4, (bra) (this));
          return this.field_c;
        } else {
          L1: {
            if (null == this.field_c) {
              this.field_c = new t();
              break L1;
            } else {
              break L1;
            }
          }
          this.field_c.a(4, (bra) (this));
          return this.field_c;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            bra.a(true);
            field_f = null;
            return;
        }
        field_f = null;
    }

    static {
        field_d = 0;
    }
}
