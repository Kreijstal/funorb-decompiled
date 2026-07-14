/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends gb {
    static int[] field_m;
    private java.nio.ByteBuffer field_n;
    static int field_l;
    static String field_h;
    static String field_k;
    static String field_g;
    static int field_j;
    static String field_i;

    final byte[] a(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((ge) this).field_n.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$19 = ((ge) this).field_n.position(0);
        java.nio.ByteBuffer discarded$20 = ((ge) this).field_n.get(var3);
        if (param0 != -21109) {
          return null;
        } else {
          return var3;
        }
    }

    final void a(byte param0, byte[] param1) {
        ((ge) this).field_n = java.nio.ByteBuffer.allocateDirect(param1.length);
        java.nio.Buffer discarded$9 = ((ge) this).field_n.position(0);
        if (param0 > -30) {
          return;
        } else {
          java.nio.ByteBuffer discarded$10 = ((ge) this).field_n.put(param1);
          return;
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        String var3 = null;
        String var4 = null;
        var3 = null;
        if (param0 != 0) {
          return null;
        } else {
          L0: {
            if (dn.field_Ub == null) {
              break L0;
            } else {
              if (dn.field_Ub.equals((Object) (Object) param2.getParameter("settings"))) {
                break L0;
              } else {
                var3 = dn.field_Ub;
                var4 = var3;
                var4 = var3;
                break L0;
              }
            }
          }
          L1: {
            var4 = null;
            if (null == ja.field_h) {
              break L1;
            } else {
              if (ja.field_h.equals((Object) (Object) param2.getParameter("session"))) {
                break L1;
              } else {
                var4 = ja.field_h;
                break L1;
              }
            }
          }
          return fc.a(-19571, param1, var3, var4, -1);
        }
    }

    public static void b(int param0) {
        if (param0 <= 3) {
            return;
        }
        field_i = null;
        field_h = null;
        field_m = null;
        field_g = null;
        field_k = null;
    }

    final static int a(int param0, byte param1) {
        if (param1 != -32) {
          return -20;
        } else {
          param0--;
          param0 = param0 | param0 >>> -1882720287;
          param0 = param0 | param0 >>> 296757634;
          param0 = param0 | param0 >>> -1076979676;
          param0 = param0 | param0 >>> -44437880;
          param0 = param0 | param0 >>> 1392010064;
          return param0 + 1;
        }
    }

    ge() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
        field_k = "Add name";
        field_h = "Suggest muting this player";
        field_g = "Fullscreen";
        field_m = jg.a(true);
        field_i = "Detail: High";
        field_j = 0;
    }
}
