/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sc implements eeb {
    static String field_b;
    private long field_a;

    public final void a(int param0) {
        ((sc) this).field_a = wt.a(false);
        if (param0 <= 6) {
            ((sc) this).field_a = -33L;
        }
    }

    public static void c(int param0) {
        if (param0 < 36) {
            sc.c(-26);
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final qrb a(byte param0) {
        if (((sc) this).b((byte) -120)) {
          return mp.field_p;
        } else {
          if (350L + ((sc) this).field_a > wt.a(false)) {
            return tg.field_p;
          } else {
            if (param0 != 35) {
              field_b = null;
              return ((sc) this).b(-1);
            } else {
              return ((sc) this).b(-1);
            }
          }
        }
    }

    abstract String d(int param0);

    abstract qrb b(int param0);

    public final String c(byte param0) {
        if (param0 == -79) {
          if (!((sc) this).b((byte) -115)) {
            if (~wt.a(false) > ~(((sc) this).field_a - -350L)) {
              return null;
            } else {
              return ((sc) this).d(16384);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Players";
    }
}
