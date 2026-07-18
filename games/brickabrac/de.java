/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends km {
    static cd field_v;
    private tp[] field_r;
    static mh field_t;
    private mf field_u;
    static int field_x;
    static jp field_s;
    static int field_w;

    public static void g(int param0) {
        field_v = null;
        field_t = null;
        if (param0 != 2) {
            de.g(47);
            field_s = null;
            return;
        }
        field_s = null;
    }

    final void b(byte param0) {
        lb.d();
        if (param0 > -14) {
          L0: {
            de.g(61);
            if (ff.field_c != null) {
              ff.field_c.e((byte) -93);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (ff.field_c != null) {
              ff.field_c.e((byte) -93);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!(null == tn.field_m)) {
            tn.field_m.a(true, param0);
        }
    }

    final static long f() {
        return ue.a(false) - oj.field_t;
    }

    private final boolean c(int param0, int param1) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param1 != 0) {
          if (3 == param1) {
            return false;
          } else {
            L0: {
              if (param1 != 2) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            L1: {
              var3 = stackIn_6_0;
              ng.a(var3 != 0, 74, ((de) this).a(true));
              if (var3 != 0) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            return stackIn_9_0 != 0;
          }
        } else {
          return false;
        }
    }

    de(mf param0) {
        super(12, 180, 460, 150, 35, (int[]) null);
        try {
            ((de) this).field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "de.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param2 < -52) {
          if (null != ((de) this).field_r) {
            if (ff.field_c == null) {
              ff.field_c = new w((java.applet.Applet) (Object) sl.field_C, oc.field_u, ((de) this).field_r, false, hq.field_u);
              return;
            } else {
              boolean discarded$4 = this.c(460, ff.field_c.a(false, param1));
              return;
            }
          } else {
            int discarded$5 = -946715356;
            ((de) this).field_r = wq.a("benefits", ((de) this).field_u, "members_benefits_screenshots");
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 <= 98) {
            return false;
        }
        if (null != ff.field_c) {
            return this.c(460, ff.field_c.a((byte) -93));
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new cd(2);
    }
}
