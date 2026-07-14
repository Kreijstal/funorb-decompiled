/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends mc {
    static boolean field_w;
    static rj field_y;
    static ah field_p;
    static je field_u;
    static String field_t;
    int field_s;
    int field_C;
    int field_z;
    static String field_A;
    static int[] field_q;
    static wf field_x;
    static boolean field_r;
    static a field_v;
    static String field_n;
    static String field_o;
    static ri field_B;

    final static void a(byte param0, java.awt.Canvas param1) {
        if (param0 > -95) {
          return;
        } else {
          L0: {
            mn.a((java.awt.Component) (Object) param1, true);
            vb.a(-51, (java.awt.Component) (Object) param1);
            if (null != qf.field_k) {
              qf.field_k.a(0, (java.awt.Component) (Object) param1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static int a(int param0, double param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 != 1.0) {
          if (param2 != 45) {
            oa.a(-17);
            var4 = param0 >> -1512952592;
            var5 = (param0 & 65416) >> 10882792;
            var4 = (int)(Math.pow((double)var4 / 256.0, param1) * 256.0);
            var6 = param0 & 255;
            var5 = (int)(Math.pow((double)var5 / 256.0, param1) * 256.0);
            var6 = (int)(256.0 * Math.pow((double)var6 / 256.0, param1));
            return (var4 << 926160176) + ((var5 << -1068730168) + var6);
          } else {
            var4 = param0 >> -1512952592;
            var5 = (param0 & 65416) >> 10882792;
            var4 = (int)(Math.pow((double)var4 / 256.0, param1) * 256.0);
            var6 = param0 & 255;
            var5 = (int)(Math.pow((double)var5 / 256.0, param1) * 256.0);
            var6 = (int)(256.0 * Math.pow((double)var6 / 256.0, param1));
            return (var4 << 926160176) + ((var5 << -1068730168) + var6);
          }
        } else {
          return param0;
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_v = null;
        field_x = null;
        field_u = null;
        field_n = null;
        field_p = null;
        field_A = null;
        if (param0 != -25731) {
          return;
        } else {
          field_y = null;
          field_B = null;
          field_o = null;
          field_t = null;
          return;
        }
    }

    private oa() throws Throwable {
        throw new Error();
    }

    final static boolean a(String param0, int param1) {
        if (param1 != 65416) {
            return false;
        }
        if (!(fd.field_J != null)) {
            return false;
        }
        return param0.toLowerCase().indexOf(fd.field_J.toLowerCase()) >= 0 ? true : false;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param1 != 13309) {
          return 105;
        } else {
          var3 = -1 + param2 & param0 >> 1716681983;
          return var3 + ((param0 >>> -2026239393) + param0) % param2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Connection restored.";
        field_u = new je();
        field_A = "Open";
        field_n = "Login: ";
        field_r = true;
        field_o = "Join <%0>'s game";
        field_q = new int[8192];
        field_v = new a();
    }
}
