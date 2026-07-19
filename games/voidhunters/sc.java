/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sc implements eeb {
    static String field_b;
    private long field_a;

    public final void a(int param0) {
        this.field_a = wt.a(false);
        if (param0 <= 6) {
            this.field_a = -33L;
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
        if (this.b((byte) -120)) {
          return mp.field_p;
        } else {
          if (350L + this.field_a > wt.a(false)) {
            return tg.field_p;
          } else {
            if (param0 != 35) {
              field_b = (String) null;
              return this.b(-1);
            } else {
              return this.b(-1);
            }
          }
        }
    }

    abstract String d(int param0);

    abstract qrb b(int param0);

    public final String c(byte param0) {
        if (param0 == -79) {
          if (!this.b((byte) -115)) {
            if ((wt.a(false) ^ -1L) > (this.field_a - -350L ^ -1L)) {
              return null;
            } else {
              return this.d(16384);
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    static {
        field_b = "Players";
    }
}
