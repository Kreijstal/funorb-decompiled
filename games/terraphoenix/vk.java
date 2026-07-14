/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static String field_a;
    static int field_c;
    static java.security.SecureRandom field_b;
    static ci field_d;

    final static void a(int param0) {
        int var2 = 0;
        var2 = Terraphoenix.field_V;
        if (!si.o(param0 + 8187)) {
          if (null != a.field_b) {
            if (!a.field_b.field_d) {
              return;
            } else {
              ga.b((byte) 82);
              cl.field_J.a((gl) (Object) new hi(cl.field_J, ql.field_e), (byte) -1);
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$3 = cl.field_J.a(true, q.field_Hb, dm.field_g, 120);
          if (param0 == -8177) {
            cl.field_J.i((byte) 126);
            L0: while (true) {
              if (!fd.d(1)) {
                return;
              } else {
                boolean discarded$4 = cl.field_J.a(lf.field_c, ua.field_g, (byte) -116);
                continue L0;
              }
            }
          } else {
            vk.a(87);
            cl.field_J.i((byte) 126);
            L1: while (true) {
              if (!fd.d(1)) {
                return;
              } else {
                boolean discarded$5 = cl.field_J.a(lf.field_c, ua.field_g, (byte) -116);
                continue L1;
              }
            }
          }
        }
    }

    final static kf a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        kf[] var3 = null;
        int var4 = 0;
        kf var5 = null;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        var2 = tb.a(-119, "jagex-last-login-method", param1);
        if (var2 == null) {
          return gm.field_j;
        } else {
          var3 = fm.a(param0);
          var4 = 0;
          L0: while (true) {
            if (var3.length > var4) {
              var5 = var3[var4];
              if (var5.a((byte) -126, var2)) {
                return var5;
              } else {
                var4++;
                continue L0;
              }
            } else {
              return gm.field_j;
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 10417) {
          field_b = null;
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "UFO preparing to launch";
        field_c = 640;
    }
}
