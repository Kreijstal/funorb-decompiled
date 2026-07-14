/*
 * Decompiled by CFR-JS 0.4.0.
 */
class be extends bh {
    static String field_s;
    static String field_o;
    static int[] field_t;
    be field_p;
    static int[] field_w;
    static int field_q;
    static jc field_x;
    static int field_n;
    be field_v;
    long field_r;
    static ck[][] field_u;

    public static void a(int param0) {
        field_s = null;
        field_w = null;
        field_o = null;
        field_u = null;
        field_t = null;
        int var1 = -75 / ((-44 - param0) / 60);
        field_x = null;
    }

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 != 98) {
            return false;
        }
        return sk.a(true, param1, true, 10);
    }

    final void a(long param0, byte param1) {
        if (((be) this).field_v != null) {
            throw new RuntimeException();
        }
        ((be) this).field_r = param0;
        if (param1 < 107) {
            field_n = 116;
            return;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        if (param1 != -57) {
            return;
        }
        oa.a(param0, -1, "");
        wb.a(param0, 30307);
    }

    final long c(byte param0) {
        if (param0 != 57) {
            return ((be) this).field_r;
        }
        return ((be) this).field_r;
    }

    final static void a(byte param0, ig param1) {
        Object var3 = null;
        if (param1 != null) {
          if (param0 <= 117) {
            var3 = null;
            be.a((byte) 85, (ig) null);
            mg.field_bc = param1;
            ie.field_c.field_M.c(110);
            ie.field_c.a((w) (Object) mg.field_bc, -16834);
            jh.field_h = true;
            return;
          } else {
            mg.field_bc = param1;
            ie.field_c.field_M.c(110);
            ie.field_c.a((w) (Object) mg.field_bc, -16834);
            jh.field_h = true;
            return;
          }
        } else {
          return;
        }
    }

    final void e(byte param0) {
        if (null == ((be) this).field_v) {
          return;
        } else {
          ((be) this).field_v.field_p = ((be) this).field_p;
          ((be) this).field_p.field_v = ((be) this).field_v;
          if (param0 < 68) {
            field_u = null;
            ((be) this).field_v = null;
            ((be) this).field_p = null;
            return;
          } else {
            ((be) this).field_v = null;
            ((be) this).field_p = null;
            return;
          }
        }
    }

    protected be() {
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -68) {
          ((be) this).field_r = 35L;
          if (((be) this).field_v != null) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (((be) this).field_v == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_t = new int[8192];
        field_s = "Unable to delete name - system busy";
        field_n = 0;
        field_o = "Average rating";
        field_q = 0;
        field_x = new jc();
    }
}
