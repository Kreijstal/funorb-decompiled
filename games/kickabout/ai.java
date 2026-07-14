/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends wj implements qu, vh {
    static ut field_E;
    private wi field_I;
    private jn field_B;
    static String field_L;
    static String field_C;
    static hd field_H;
    static up field_G;
    static String[] field_K;
    private lb field_D;
    static int field_J;

    private final String m(int param0) {
        if (param0 != -1522433695) {
            String discarded$0 = this.k(13);
            return "</col></u>";
        }
        return "</col></u>";
    }

    public static void l(int param0) {
        field_C = null;
        field_L = null;
        field_E = null;
        if (param0 != 0) {
          ai.l(122);
          field_H = null;
          field_K = null;
          field_G = null;
          return;
        } else {
          field_H = null;
          field_K = null;
          field_G = null;
          return;
        }
    }

    final static boolean a(int param0) {
        int var1 = 0;
        var1 = 61 % ((-62 - param0) / 44);
        if (null != kl.field_h) {
          if (!kl.field_h.e(0)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    ai(jn param0) {
        super(0, 0, 288, 0, (gj) null);
        ((ai) this).field_B = param0;
        ((ai) this).field_I = new wi(es.field_g, (jv) null);
        ((ai) this).field_I.field_r = (gj) (Object) new op();
        String var7 = vo.a((byte) -18, ov.field_a, new String[2]);
        int var3 = 20;
        qv var4 = new qv(gf.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, gf.field_a.field_G, -1, 2147483647, true);
        ((ai) this).field_D = new lb(var7, (gj) (Object) var4);
        ((ai) this).field_D.field_u = "";
        ((ai) this).field_D.a(fa.field_e, 0, 12082);
        ((ai) this).field_D.a(fa.field_e, 1, 12082);
        ((ai) this).field_D.field_n = ((ai) this).field_n - 40;
        ((ai) this).field_D.field_k = (jv) this;
        ((ai) this).field_D.c(-1, -40 + ((ai) this).field_n, 26, var3);
        var3 = var3 + (15 + ((ai) this).field_D.field_i);
        ((ai) this).a(-103, (fd) (Object) ((ai) this).field_D);
        int var5 = 4;
        int var6 = 200;
        ((ai) this).field_I.a(40, 1, 300 - var6 >> -1522433695, var6, var3);
        ((ai) this).field_I.field_k = (jv) this;
        ((ai) this).a(-43, (fd) (Object) ((ai) this).field_I);
        ((ai) this).a(55 + (var3 - -var5), 1, 0, 300, 0);
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        if (super.a(param0, (byte) -122, param2, param3)) {
          return true;
        } else {
          if ((param3 ^ -1) == -99) {
            return ((ai) this).a(param2, (byte) -100);
          } else {
            if (param3 != 99) {
              if (param1 > -60) {
                ((ai) this).field_B = null;
                return false;
              } else {
                return false;
              }
            } else {
              return ((ai) this).b(param2, (byte) 125);
            }
          }
        }
    }

    public final void a(lb param0, int param1, int param2, int param3) {
        int var6 = 0;
        var6 = Kickabout.field_G;
        if (param3 >= 7) {
          if (param2 != 0) {
            if (1 != param2) {
              if (2 == param2) {
                rb.a((byte) -51, "conduct.ws");
                return;
              } else {
                return;
              }
            } else {
              rb.a((byte) -51, "privacy.ws");
              return;
            }
          } else {
            rb.a((byte) -51, "terms.ws");
            return;
          }
        } else {
          return;
        }
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        if (param3 < 64) {
          L0: {
            ((ai) this).field_D = null;
            if (param1 == ((ai) this).field_I) {
              oh.a(-124);
              ((ai) this).field_B.q(-87);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param1 == ((ai) this).field_I) {
              oh.a(-124);
              ((ai) this).field_B.q(-87);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final String k(int param0) {
        if (param0 < 63) {
            Object var3 = null;
            ((ai) this).a((lb) null, -77, -73, -3);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = qr.a(param0, (byte) -1);
          if (!ia.field_c) {
            break L0;
          } else {
            var2 = -var2 + 896;
            break L0;
          }
        }
        if (param1 != 6784) {
          int discarded$2 = ai.a(121, -36);
          return var2;
        } else {
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "This kit is only available to you.";
        field_L = "Please try again in a few minutes.";
        field_K = new String[]{"Trap Mouse: Off", "Trap Mouse: On"};
    }
}
