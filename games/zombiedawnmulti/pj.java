/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends se implements co, in {
    private tf field_H;
    static long[] field_K;
    private sq field_L;
    static ta field_I;
    private gn field_G;
    static String field_J;

    private final String a(int param0) {
        if (param0 < 92) {
            return null;
        }
        return "</col></u>";
    }

    public final void a(int param0, sq param1, int param2, int param3) {
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param3 == 0) {
          ge.a("terms.ws", (byte) 125);
          if (param2 > -16) {
            field_K = null;
            return;
          } else {
            return;
          }
        } else {
          if (param3 == 1) {
            ge.a("privacy.ws", (byte) 125);
            if (param2 <= -16) {
              return;
            } else {
              field_K = null;
              return;
            }
          } else {
            if (2 != param3) {
              if (param2 > -16) {
                field_K = null;
                return;
              } else {
                return;
              }
            } else {
              ge.a("conduct.ws", (byte) 125);
              if (param2 <= -16) {
                return;
              } else {
                field_K = null;
                return;
              }
            }
          }
        }
    }

    pj(tf param0) {
        super(0, 0, 288, 0, (nl) null);
        ((pj) this).field_H = param0;
        ((pj) this).field_G = new gn(ub.field_xb, (bj) null);
        ((pj) this).field_G.field_h = (nl) (Object) new oq();
        String var7 = vl.a(ng.field_a, new String[2], 2);
        int var3 = 20;
        hq var4 = new hq(ke.field_h, 0, 0, 0, 0, 16777215, -1, 3, 0, ke.field_h.field_C, -1, 2147483647, true);
        ((pj) this).field_L = new sq(var7, (nl) (Object) var4);
        ((pj) this).field_L.field_x = "";
        ((pj) this).field_L.a(0, (byte) -107, mp.field_d);
        ((pj) this).field_L.a(1, (byte) -115, mp.field_d);
        ((pj) this).field_L.field_A = (bj) this;
        ((pj) this).field_L.field_n = -40 + ((pj) this).field_n;
        ((pj) this).field_L.a(((pj) this).field_n + -40, var3, (byte) -4, 26);
        var3 = var3 + (((pj) this).field_L.field_w + 15);
        ((pj) this).b((byte) 108, (cf) (Object) ((pj) this).field_L);
        int var5 = 4;
        int var6 = 200;
        ((pj) this).field_G.b(300 - var6 >> 2142098369, var3, 28972, var6, 40);
        ((pj) this).field_G.field_A = (bj) this;
        ((pj) this).b((byte) 59, (cf) (Object) ((pj) this).field_G);
        ((pj) this).b(0, 0, 28972, 300, var5 + (var3 - -55));
    }

    public static void c(boolean param0) {
        field_K = null;
        field_I = null;
        if (!param0) {
            field_K = null;
            field_J = null;
            return;
        }
        field_J = null;
    }

    private final String h(int param0) {
        if (param0 != -1) {
            Object var3 = null;
            boolean discarded$0 = ((pj) this).a(-29, '.', (cf) null, 60);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final static ef a(ul param0, int param1, ul param2, String param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param0.a(param4, (byte) 105);
        if (param1 != 4) {
          field_I = null;
          var6 = param0.a(param3, var5, param1 + -5);
          return er.a(param2, var5, 0, var6, param0);
        } else {
          var6 = param0.a(param3, var5, param1 + -5);
          return er.a(param2, var5, 0, var6, param0);
        }
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (param0 != 98) {
            if (param0 == 99) {
              return ((pj) this).a(24, param2);
            } else {
              return false;
            }
          } else {
            return ((pj) this).a((byte) -1, param2);
          }
        }
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        Object var7 = null;
        L0: {
          if (param2 == ((pj) this).field_G) {
            va.a((byte) 62);
            ((pj) this).field_H.m(-7435);
            break L0;
          } else {
            break L0;
          }
        }
        if (param3 >= -83) {
          var7 = null;
          ((pj) this).a(82, -128, (gn) null, -108, 33);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8 = 0;
        int var10 = ZombieDawnMulti.field_E ? 1 : 0;
        hn[] var11 = new hn[ia.field_x.length - -1];
        hn[] var7 = var11;
        int var9 = 83 / ((50 - param5) / 57);
        for (var8 = 0; ia.field_x.length > var8; var8++) {
            var11[var8] = ia.field_x[var8];
        }
        var7[-1 + var7.length] = new hn(param3, param4, param1, param6, param0, param2);
        ia.field_x = var7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new long[32];
        field_J = "Ready... ";
    }
}
