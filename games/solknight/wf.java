/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf implements oe {
    static String field_a;
    static String field_b;
    private long field_c;

    public static void f(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 350) {
          field_a = (String) null;
        }
    }

    public final void a(byte param0) {
        this.field_c = je.a(1);
        if (param0 != -127) {
          field_a = (String) null;
        }
    }

    abstract qf b(byte param0);

    public final String c(int param0) {
        if (this.a(109)) {
          return null;
        }
        if (param0 >= -66) {
          this.field_c = -47L;
          if (350L + this.field_c <= je.a(1)) {
            return this.e(8192);
          }
          return null;
        }
        if (350L + this.field_c <= je.a(1)) {
          return this.e(8192);
        }
        return null;
    }

    abstract String e(int param0);

    final static void d(int param0) {
        k.field_d = new rf();
        if (param0 == 350) {
          gf.field_cb.c(-3399, k.field_d);
          return;
        }
        wf.c((byte) -49);
        gf.field_cb.c(-3399, k.field_d);
    }

    public final qf b(int param0) {
        if (this.a(param0 + 9480)) {
          return rd.field_b;
        }
        if (je.a(1) < this.field_c + 350L) {
          return hg.field_E;
        }
        if (param0 == -9362) {
          return this.b((byte) -103);
        }
        return (qf) null;
    }

    final static boolean c(byte param0) {
        if (param0 >= -41) {
          return false;
        }
        if (lf.field_d == null) {
          return false;
        }
        if (jj.field_Y != ef.field_e) {
          return false;
        }
        return true;
    }

    static {
        field_a = "This password is part of your Player Name, and would be easy to guess";
        field_b = "Level complete";
    }
}
