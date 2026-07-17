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
        if (param0 < -23) {
          if (null != ag.field_t) {
            if (!rc.field_a.a(true)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          bj.c(44);
          if (null != ag.field_t) {
            if (!rc.field_a.a(true)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final bm b(int param0) {
        if (param0 < -58) {
          if (!((bj) this).a((byte) 73)) {
            if (~hn.a((byte) 80) > ~(350L + ((bj) this).field_c)) {
              return wl.field_c;
            } else {
              return ((bj) this).d(11269);
            }
          } else {
            return bm.field_g;
          }
        } else {
          return null;
        }
    }

    public final String a(int param0) {
        if (param0 < -22) {
          if (!((bj) this).a((byte) -70)) {
            if (~(350L + ((bj) this).field_c) < ~hn.a((byte) 80)) {
              return null;
            } else {
              return ((bj) this).b((byte) 18);
            }
          } else {
            return null;
          }
        } else {
          ((bj) this).a(false);
          if (!((bj) this).a((byte) -70)) {
            if (~(350L + ((bj) this).field_c) < ~hn.a((byte) 80)) {
              return null;
            } else {
              return ((bj) this).b((byte) 18);
            }
          } else {
            return null;
          }
        }
    }

    public final void a(boolean param0) {
        ((bj) this).field_c = hn.a((byte) 80);
        if (!param0) {
            boolean discarded$0 = bj.c((byte) -120);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_h = "I seem to be getting somewhere now.";
        field_g = "Controls";
        field_i = "Find the lift and get off this level.";
        field_f = -1;
    }
}
