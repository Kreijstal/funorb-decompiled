/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static ci field_b;
    static int[] field_c;
    static long[] field_d;
    static boolean field_a;

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = qd.a(false);
        var2 = nj.b(3);
        de.field_c.a(vh.field_g + -o.field_f, (o.field_f << 1324516449) + var1, var2 + (bb.field_b << -393711775), true, -bb.field_b + id.field_c);
        le.a((byte) -115);
        if (param0 != 6) {
          field_b = null;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        if (param0 == -393711775) {
          if (pi.field_d != null) {
            if (null == pi.field_d.field_k) {
              ud.field_d = null;
              pi.field_d = null;
              return;
            } else {
              pi.field_d.field_k.field_gb = false;
              ud.field_d = null;
              pi.field_d = null;
              return;
            }
          } else {
            ud.field_d = null;
            pi.field_d = null;
            return;
          }
        } else {
          field_b = null;
          if (pi.field_d == null) {
            ud.field_d = null;
            pi.field_d = null;
            return;
          } else {
            L0: {
              if (null != pi.field_d.field_k) {
                pi.field_d.field_k.field_gb = false;
                break L0;
              } else {
                break L0;
              }
            }
            ud.field_d = null;
            pi.field_d = null;
            return;
          }
        }
    }

    final static boolean a(int param0, p param1) {
        int var2 = param1.i(-111);
        int var3 = (var2 ^ -1) == param0 ? 1 : 0;
        return var3 != 0;
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 < 123) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new long[32];
    }
}
