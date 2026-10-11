/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uc implements he {
    private long field_c;
    static ge field_a;
    static rk field_b;
    static kl[] field_d;

    public final String a(int param0) {
        if (param0 != 26162) {
          return (String) null;
        }
        if (this.a(true)) {
          return null;
        }
        if ((this.field_c + 350L) <= dd.b(101)) {
          return this.b(-128);
        }
        return null;
    }

    public final void a(byte param0) {
        this.field_c = dd.b(118);
        int var2 = -69 % ((param0 + 29) / 45);
    }

    public final p b(byte param0) {
        if (this.a(true)) {
          return uh.field_g;
        }
        int var2 = -87 / ((param0 + 85) / 36);
        if (!((this.field_c + 350L) <= dd.b(61))) {
          return cg.field_g;
        }
        return this.c(4096);
    }

    final static String c(byte param0) {
        if (param0 <= 47) {
          return (String) null;
        }
        return jk.field_b;
    }

    abstract String b(int param0);

    final static void a(int param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param0 < -90) {
          if (0L == param1 % 10L) {
            r.a(18780, param1 - 1L);
            r.a(18780, 1L);
          } else {
            r.a(18780, param1);
          }
          return;
        }
    }

    public static void e(int param0) {
        if (param0 != 1) {
          return;
        }
        field_d = null;
        field_a = null;
        field_b = null;
    }

    abstract p c(int param0);

    final static void d(int param0) {
        if (qb.field_h == -mh.field_k + 0) {
          if (param0 == 1) {
            qb.field_h = qb.field_h + 1;
            return;
          }
          return;
        }
        if (qb.field_h != 250 - mh.field_k) {
          if (param0 == 1) {
            qb.field_h = qb.field_h + 1;
            return;
          }
          return;
        }
        if (param0 == 1) {
          qb.field_h = qb.field_h + 1;
          return;
        }
    }

    static {
        field_a = new ge();
        field_b = new rk();
    }
}
