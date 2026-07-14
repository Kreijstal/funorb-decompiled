/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static java.awt.Image field_a;
    static ag field_b;

    final static boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return kb.field_S;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        rh.field_c.a(param0, param1, -2147483648, param5, param2);
        if (param3 != 22478) {
            field_a = null;
        }
        if (!(tl.field_Fb == null)) {
            tl.field_Fb.a(param5, param6, -hf.field_g + param4, param5, param4, 6);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -54) {
            return;
        }
        field_a = null;
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Chess.field_G;
        if (param1 >= 106) {
          L0: {
            if (0 < cl.field_d) {
              L1: {
                if (null != ch.field_gb) {
                  rm.field_R = ch.field_gb.a((byte) 101);
                  dn.a(2, (byte) -96);
                  break L1;
                } else {
                  rm.field_R = fn.a(0, 480, 0, 21, 640, oc.field_l);
                  break L1;
                }
              }
              if (rm.field_R != null) {
                ca.a(13369344, (java.awt.Canvas) (Object) rm.field_R);
                var2 = 2;
                break L0;
              } else {
                var2 = 3;
                break L0;
              }
            } else {
              if (vi.a(-3)) {
                var2 = 0;
                break L0;
              } else {
                var2 = 1;
                break L0;
              }
            }
          }
          L2: {
            if (null != ch.field_gb) {
              break L2;
            } else {
              if (re.field_r) {
                qh.a(false, param0, var2);
                break L2;
              } else {
                break L2;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var5 = Chess.field_G;
        int var2 = param1.length();
        int var3 = 0;
        for (var4 = 0; var4 < var2; var4++) {
            var3 = -var3 + (var3 << -1729978203) + ai.a((byte) -43, param1.charAt(var4));
        }
        if (param0 >= -71) {
            return -87;
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ag();
    }
}
