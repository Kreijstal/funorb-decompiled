/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static bn[] field_k;
    private int field_d;
    static String field_f;
    static String field_a;
    static int field_i;
    private int field_b;
    private o[] field_e;
    static String field_g;
    static String field_l;
    static int[] field_h;
    private o field_c;
    private o field_j;

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        if (param1.equals((Object) (Object) "B")) {
            return Byte.TYPE;
        }
        if (param1.equals((Object) (Object) "I")) {
            return Integer.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "S"))) {
            return Short.TYPE;
        }
        if (param1.equals((Object) (Object) "J")) {
            return Long.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "Z"))) {
            return Boolean.TYPE;
        }
        if (param1.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "D"))) {
            return Double.TYPE;
        }
        if (param0 != 0) {
            field_g = null;
            if (!(!param1.equals((Object) (Object) "C"))) {
                return Character.TYPE;
            }
            return Class.forName(param1);
        }
        if (!(!param1.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param1);
    }

    final void a(int param0, long param1, o param2) {
        o var5 = null;
        int var6 = 0;
        if (param2.field_c != null) {
            param2.c(-2193);
            var5 = ((kl) this).field_e[(int)((long)(-1 + ((kl) this).field_b) & param1)];
            param2.field_h = var5;
            param2.field_c = var5.field_c;
            param2.field_c.field_h = param2;
            param2.field_e = param1;
            param2.field_h.field_c = param2;
            var6 = -127 % ((-35 - param0) / 62);
            return;
        }
        var5 = ((kl) this).field_e[(int)((long)(-1 + ((kl) this).field_b) & param1)];
        param2.field_h = var5;
        param2.field_c = var5.field_c;
        param2.field_c.field_h = param2;
        param2.field_e = param1;
        param2.field_h.field_c = param2;
        var6 = -127 % ((-35 - param0) / 62);
    }

    final o a(int param0, long param1) {
        o var6 = null;
        int var7 = Chess.field_G;
        o var4 = ((kl) this).field_e[(int)((long)(((kl) this).field_b + -1) & param1)];
        ((kl) this).field_j = var4.field_h;
        int var5 = 101 / ((-50 - param0) / 58);
        while (((kl) this).field_j != var4) {
            if ((param1 ^ -1L) == (((kl) this).field_j.field_e ^ -1L)) {
                var6 = ((kl) this).field_j;
                ((kl) this).field_j = ((kl) this).field_j.field_h;
                return var6;
            }
            ((kl) this).field_j = ((kl) this).field_j.field_h;
        }
        ((kl) this).field_j = null;
        return null;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        ol.a((java.awt.Component) (Object) param0, param1 ^ -102);
        if (param1 != -114) {
            return;
        }
        uj.a(param1 + 114, (java.awt.Component) (Object) param0);
        if (!(ii.field_L == null)) {
            ii.field_L.a((java.awt.Component) (Object) param0, param1 + 116);
        }
    }

    final o b(byte param0) {
        int var3 = 0;
        o var4 = null;
        o var5 = null;
        o var8 = null;
        var3 = Chess.field_G;
        if (0 < ((kl) this).field_d) {
          if (((kl) this).field_e[((kl) this).field_d + -1] != ((kl) this).field_c) {
            var8 = ((kl) this).field_c;
            ((kl) this).field_c = var8.field_h;
            return var8;
          } else {
            L0: while (true) {
              if (((kl) this).field_b <= ((kl) this).field_d) {
                if (param0 < 64) {
                  return null;
                } else {
                  return null;
                }
              } else {
                ((kl) this).field_d = ((kl) this).field_d + 1;
                var5 = ((kl) this).field_e[((kl) this).field_d].field_h;
                if (((kl) this).field_e[-1 + ((kl) this).field_d] != var5) {
                  ((kl) this).field_c = var5.field_h;
                  return var5;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (((kl) this).field_b <= ((kl) this).field_d) {
              if (param0 < 64) {
                return null;
              } else {
                return null;
              }
            } else {
              ((kl) this).field_d = ((kl) this).field_d + 1;
              var4 = ((kl) this).field_e[((kl) this).field_d].field_h;
              if (((kl) this).field_e[-1 + ((kl) this).field_d] != var4) {
                ((kl) this).field_c = var4.field_h;
                return var4;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_l = null;
        field_h = null;
        field_f = null;
        field_g = null;
        field_a = null;
        if (param0 <= -43) {
            return;
        }
        Object var2 = null;
        kl.a((java.awt.Canvas) null, (byte) 34);
    }

    final o a(boolean param0) {
        ((kl) this).field_d = 0;
        if (!param0) {
            o discarded$0 = ((kl) this).a(-106, 109L);
            return ((kl) this).b((byte) 88);
        }
        return ((kl) this).b((byte) 88);
    }

    kl(int param0) {
        int var2 = 0;
        o var3 = null;
        ((kl) this).field_d = 0;
        ((kl) this).field_e = new o[param0];
        ((kl) this).field_b = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new o();
            ((kl) this).field_e[var2] = new o();
            var3.field_c = var3;
            var3.field_h = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "%D";
        field_k = new bn[7];
        field_g = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "Return to lobby";
        field_h = new int[128];
        field_l = "White wins!";
    }
}
