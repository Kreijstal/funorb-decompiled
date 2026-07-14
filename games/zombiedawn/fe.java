/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends hp implements oa, hh {
    private hm field_I;
    private an field_K;
    static af field_M;
    static int field_O;
    static String field_J;
    static int[] field_G;
    static String field_L;
    static String field_F;
    private md field_N;
    static int field_H;

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5 = 0;
        if (!super.a(-119, param1, param2, param3)) {
          if (98 == param1) {
            return ((fe) this).b((byte) 123, param2);
          } else {
            if (-100 == (param1 ^ -1)) {
              return ((fe) this).a(1, param2);
            } else {
              var5 = -46 % ((-83 - param0) / 32);
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static v b(boolean param0) {
        v var1 = null;
        var1 = new v(gl.field_F, kd.field_pb, sl.field_d[0], bo.field_o[0], bn.field_c[0], uf.field_n[0], vj.field_m[0], j.field_a);
        no.f((byte) -36);
        if (!param0) {
          field_F = null;
          return var1;
        } else {
          return var1;
        }
    }

    fe(md param0) {
        super(0, 0, 288, 0, (io) null);
        ((fe) this).field_N = param0;
        ((fe) this).field_K = new an(jb.field_c, (sk) null);
        ((fe) this).field_K.field_h = (io) (Object) new vm();
        String var7 = s.a(1938762664, dn.field_J, new String[2]);
        int var3 = 20;
        vf var4 = new vf(ia.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, ia.field_e.field_I, -1, 2147483647, true);
        ((fe) this).field_I = new hm(var7, (io) (Object) var4);
        ((fe) this).field_I.field_s = "";
        ((fe) this).field_I.a(0, -21423, sm.field_b);
        ((fe) this).field_I.a(1, -21423, sm.field_b);
        ((fe) this).field_I.field_i = ((fe) this).field_i - 40;
        ((fe) this).field_I.field_v = (sk) this;
        ((fe) this).field_I.a(26, var3, true, ((fe) this).field_i - 40);
        var3 = var3 + (15 + ((fe) this).field_I.field_n);
        ((fe) this).a((ga) (Object) ((fe) this).field_I, 10);
        int var5 = 4;
        int var6 = 200;
        ((fe) this).field_K.a(33, var3, 300 - var6 >> 214752609, var6, 40);
        ((fe) this).field_K.field_v = (sk) this;
        ((fe) this).a((ga) (Object) ((fe) this).field_K, 10);
        ((fe) this).a(31, 0, 0, 300, var3 + (55 - -var5));
    }

    public final void a(hm param0, int param1, int param2, int param3) {
        int var6 = 0;
        Object var7 = null;
        var6 = ZombieDawn.field_J;
        if (0 == param2) {
          nf.a(param1 + -108, "terms.ws");
          if (param1 != 120) {
            var7 = null;
            ((fe) this).a((hm) null, -81, 53, -37);
            return;
          } else {
            return;
          }
        } else {
          if (-2 != (param2 ^ -1)) {
            if (2 != param2) {
              if (param1 != 120) {
                var7 = null;
                ((fe) this).a((hm) null, -81, 53, -37);
                return;
              } else {
                return;
              }
            } else {
              nf.a(12, "conduct.ws");
              if (param1 == 120) {
                return;
              } else {
                var7 = null;
                ((fe) this).a((hm) null, -81, 53, -37);
                return;
              }
            }
          } else {
            nf.a(12, "privacy.ws");
            if (param1 == 120) {
              return;
            } else {
              var7 = null;
              ((fe) this).a((hm) null, -81, 53, -37);
              return;
            }
          }
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        if (param1 == -6) {
          if (param2 == ((fe) this).field_K) {
            ed.a(param1 + 425);
            ((fe) this).field_N.h((byte) -126);
            return;
          } else {
            return;
          }
        } else {
          String discarded$3 = this.h(-70);
          if (param2 != ((fe) this).field_K) {
            return;
          } else {
            ed.a(param1 + 425);
            ((fe) this).field_N.h((byte) -126);
            return;
          }
        }
    }

    private final String e(byte param0) {
        if (param0 <= 78) {
            field_G = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final String h(int param0) {
        int var2 = -124 % ((param0 - 81) / 34);
        return "<u=2164A2><col=2164A2>";
    }

    public static void a(int param0) {
        field_F = null;
        field_G = null;
        field_L = null;
        field_M = null;
        field_J = null;
        int var1 = 99 / ((29 - param0) / 38);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new af();
        field_L = "Please try again in a few minutes.";
        field_G = new int[]{39, 35};
        field_F = "Return to game";
        field_J = "MIASMA";
    }
}
