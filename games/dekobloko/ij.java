/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static boolean field_e;
    private String field_a;
    static ck field_d;
    static int field_c;
    static String field_b;

    final boolean a(String param0, int param1) {
        int var3 = -19 % ((42 - param1) / 60);
        return ((ij) this).field_a.equals((Object) (Object) param0);
    }

    final void a(int param0, java.applet.Applet param1) {
        if (param0 >= -40) {
          field_e = true;
          pf.a(param1, "jagex-last-login-method", 31536000L, (byte) 96, ((ij) this).field_a);
          return;
        } else {
          pf.a(param1, "jagex-last-login-method", 31536000L, (byte) 96, ((ij) this).field_a);
          return;
        }
    }

    final static int a(int param0, wl param1, String param2) {
        int var3 = 0;
        byte[] var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        var3 = param1.field_n;
        var6 = (CharSequence) (Object) param2;
        var4 = km.a(param0 ^ -18547, var6);
        param1.c(var4.length, 57);
        param1.field_n = param1.field_n + me.field_z.a(param1.field_r, var4, var4.length, param1.field_n, 0, 8);
        if (param0 != -20539) {
          var5 = null;
          boolean discarded$2 = ij.a((String) null, (String) null, (byte) -115);
          return -var3 + param1.field_n;
        } else {
          return -var3 + param1.field_n;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 >= -38) {
          var2 = null;
          boolean discarded$2 = ij.a((String) null, (String) null, (byte) -11);
          field_d = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        if (param0 != 5) {
            return null;
        }
        return wc.a(false, param1, param0 + -5);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = jm.a('_', param1, "", -1);
        if (param2 <= -101) {
          var3 = oa.a(param0, -1);
          if (param1.indexOf(param0) == -1) {
            if (-1 != param1.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          ij.a(-68, -120);
          var3 = oa.a(param0, -1);
          if (param1.indexOf(param0) != -1) {
            return true;
          } else {
            L0: {
              if (-1 == param1.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          qc.field_Y = param0;
          if (bl.field_T != dl.field_M) {
            var2 = dl.field_M * dl.field_M;
            var3 = var2 - bl.field_T * bl.field_T;
            param0 = param0 + var3 * (ac.field_B - param0) / var2;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 > -24) {
          ij.a(105);
          ea.field_D.a(640, 0, param0, 120, vh.field_g);
          gi.a(-24 + ac.field_B, j.field_c, 640, nk.field_b, 0, 5, (byte) -113);
          return;
        } else {
          ea.field_D.a(640, 0, param0, 120, vh.field_g);
          gi.a(-24 + ac.field_B, j.field_c, 640, nk.field_b, 0, 5, (byte) -113);
          return;
        }
    }

    ij(String param0) {
        ((ij) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_b = "Player Name: ";
    }
}
