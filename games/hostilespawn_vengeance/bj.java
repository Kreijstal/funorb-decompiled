/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bj implements bg {
    static int field_b;
    static bd field_j;
    static int field_d;
    static int field_f;
    private long field_c;
    static String field_h;
    static String field_e;
    static String field_g;
    static String field_i;
    static boolean field_a;

    final static boolean c(byte param0) {
        if (param0 >= -23) {
          bj.c(44);
          if (null == ag.field_t) {
            return false;
          }
          if (rc.field_a.a(true)) {
            return true;
          }
          return false;
        }
        if (null == ag.field_t) {
          return false;
        }
        if (rc.field_a.a(true)) {
          return true;
        }
        return false;
    }

    public final bm b(int param0) {
        if (param0 >= -58) {
          return (bm) null;
        }
        if (this.a((byte) 73)) {
          return bm.field_g;
        }
        if (hn.a((byte) 80) >= (350L + this.field_c)) {
          return this.d(11269);
        }
        return wl.field_c;
    }

    public final String a(int param0) {
        if (param0 >= -22) {
          this.a(false);
          if (this.a((byte) -70)) {
            return null;
          }
          if ((350L + this.field_c) <= hn.a((byte) 80)) {
            return this.b((byte) 18);
          }
          return null;
        }
        if (this.a((byte) -70)) {
          return null;
        }
        if ((350L + this.field_c) <= hn.a((byte) 80)) {
          return this.b((byte) 18);
        }
        return null;
    }

    public final void a(boolean param0) {
        this.field_c = hn.a((byte) 80);
        if (!param0) {
          bj.c((byte) -120);
        }
    }

    abstract String b(byte param0);

    public static void c(int param0) {
        field_g = null;
        field_e = null;
        int var1 = -81 % ((param0 - 89) / 32);
        field_i = null;
        field_j = null;
        field_h = null;
    }

    abstract bm d(int param0);

    static {
        field_e = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_h = "I seem to be getting somewhere now.";
        field_g = "Controls";
        field_i = "Find the lift and get off this level.";
        field_f = -1;
    }
}
