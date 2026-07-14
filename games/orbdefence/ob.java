/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ta implements ff, ai {
    private ig field_B;
    static String field_E;
    static int field_K;
    static boolean field_F;
    static sc field_I;
    static String field_L;
    static String field_D;
    static int field_H;
    static String field_C;
    private te field_A;
    private s field_G;

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        if (!(param3 != ((ob) this).field_G)) {
            mh.b((byte) -57);
            ((ob) this).field_B.q(4210752);
        }
        int var6 = -98 / ((param0 - -3) / 62);
    }

    public static void a(byte param0) {
        field_E = null;
        field_L = null;
        field_D = null;
        field_I = null;
        if (param0 != -19) {
          field_K = -18;
          field_C = null;
          return;
        } else {
          field_C = null;
          return;
        }
    }

    public final void a(int param0, int param1, byte param2, te param3) {
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        if (param2 == 101) {
          if (param1 != 0) {
            if (param1 != 1) {
              if (param1 == 2) {
                ol.a("conduct.ws", param2 + -100);
                return;
              } else {
                return;
              }
            } else {
              ol.a("privacy.ws", param2 + -100);
              return;
            }
          } else {
            ol.a("terms.ws", 1);
            return;
          }
        } else {
          ((ob) this).field_A = null;
          if (param1 != 0) {
            if (param1 != 1) {
              if (param1 != 2) {
                return;
              } else {
                ol.a("conduct.ws", param2 + -100);
                return;
              }
            } else {
              ol.a("privacy.ws", param2 + -100);
              return;
            }
          } else {
            ol.a("terms.ws", 1);
            return;
          }
        }
    }

    ob(ig param0) {
        super(0, 0, 288, 0, (td) null);
        ((ob) this).field_B = param0;
        ((ob) this).field_G = new s(sk.field_C, (ag) null);
        ((ob) this).field_G.field_j = (td) (Object) new vk();
        String var7 = t.a(-415993727, new String[2], lb.field_a);
        int var3 = 20;
        jc var4 = new jc(lm.field_f, 0, 0, 0, 0, 16777215, -1, 3, 0, lm.field_f.field_H, -1, 2147483647, true);
        ((ob) this).field_A = new te(var7, (td) (Object) var4);
        ((ob) this).field_A.field_i = "";
        ((ob) this).field_A.a(0, b.field_p, 2);
        ((ob) this).field_A.a(1, b.field_p, 2);
        ((ob) this).field_A.field_h = (ag) this;
        ((ob) this).field_A.field_m = ((ob) this).field_m + -40;
        ((ob) this).field_A.a(var3, (byte) 53, -40 + ((ob) this).field_m, 26);
        var3 = var3 + (((ob) this).field_A.field_r - -15);
        ((ob) this).a((pj) (Object) ((ob) this).field_A, (byte) 74);
        int var5 = 4;
        int var6 = 200;
        ((ob) this).field_G.a(300 + -var6 >> -1625521855, var3, 40, (byte) -90, var6);
        ((ob) this).field_G.field_h = (ag) this;
        ((ob) this).a((pj) (Object) ((ob) this).field_G, (byte) 74);
        ((ob) this).a(0, 0, var5 + var3 + 55, (byte) -90, 300);
    }

    final static java.awt.Container l(int param0) {
        if (h.field_J != null) {
            return (java.awt.Container) (Object) h.field_J;
        }
        if (param0 != 4) {
            ob.a((byte) -91);
            return (java.awt.Container) (Object) uj.b((byte) -120);
        }
        return (java.awt.Container) (Object) uj.b((byte) -120);
    }

    private final String k(int param0) {
        if (param0 != -804) {
            field_H = -2;
            return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (param1 == -99) {
            return ((ob) this).a(param2, false);
          } else {
            if (-100 != param1) {
              return false;
            } else {
              return ((ob) this).b(param2, false);
            }
          }
        } else {
          return true;
        }
    }

    private final String m(int param0) {
        if (param0 <= 55) {
            field_C = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "NOVA BLAST";
        field_F = false;
        field_L = "NITRO BLAST";
        field_D = "Cancel";
        field_C = "Unfortunately we are unable to create an account for you at this time.";
    }
}
