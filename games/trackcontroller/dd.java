/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dd extends ic {
    static int field_o;
    static String field_p;

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        if (!(!param3)) {
            fc.a(param1.field_x, param2 + param1.field_m, param1.field_u, (byte) -22, param1.field_p + param4);
        }
        super.a(param0, param1, param2, param3, param4);
    }

    dd(oh param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_G, -1, 2147483647, false);
    }

    final static boolean c(byte param0) {
        if (param0 < 6) {
            dd.b(30);
            return ij.field_d.a(-119);
        }
        return ij.field_d.a(-119);
    }

    final static nj d(byte param0) {
        if (hf.field_f == fd.field_h) {
          throw new IllegalStateException();
        } else {
          if (param0 > 82) {
            if (fd.field_h != cj.field_e) {
              return null;
            } else {
              fd.field_h = hf.field_f;
              return h.field_c;
            }
          } else {
            return null;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != -3674) {
            field_p = null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    dd(int param0) {
        this(gk.field_c, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
