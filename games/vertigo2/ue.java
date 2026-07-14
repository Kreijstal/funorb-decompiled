/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends cj implements cm, ij {
    static s field_J;
    private pn field_L;
    private d field_P;
    private oe field_E;
    static int[] field_G;
    static String field_K;
    static String[] field_F;
    static int[] field_M;
    static String field_H;
    static int field_O;
    static er field_N;

    private final String a(byte param0) {
        if (param0 != -88) {
            ue.b((byte) 47, 58);
        }
        return "</col></u>";
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6 = -34 % ((-63 - param2) / 51);
        if (((ue) this).field_P == param1) {
            fj.g((byte) -123);
            ((ue) this).field_E.h((byte) 114);
        }
    }

    final static void b(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 77) {
            ue.b((byte) -108, -114);
        }
        tc.field_b = param1;
        if (ld.field_b != da.field_i) {
            var2 = ld.field_b * ld.field_b;
            var3 = var2 + -(da.field_i * da.field_i);
            param1 = param1 + (-param1 + ce.field_b) * var3 / var2;
        }
        td.field_c.a(91, 640, 120, param1, ml.field_w);
        rg.a(640, r.field_j, 0, -24 + ce.field_b, param0 + -4880, ia.field_G, 5);
    }

    ue(oe param0) {
        super(0, 0, 288, 0, (ur) null);
        ((ue) this).field_E = param0;
        ((ue) this).field_P = new d(vi.field_x, (uf) null);
        ((ue) this).field_P.field_B = (ur) (Object) new vo();
        String var7 = Vertigo2.a(new String[2], hi.field_n, -127);
        int var3 = 20;
        va var4 = new va(qc.field_x, 0, 0, 0, 0, 16777215, -1, 3, 0, qc.field_x.field_z, -1, 2147483647, true);
        ((ue) this).field_L = new pn(var7, (ur) (Object) var4);
        ((ue) this).field_L.field_q = "";
        ((ue) this).field_L.a(0, 0, fm.field_c);
        ((ue) this).field_L.a(1, 0, fm.field_c);
        ((ue) this).field_L.field_v = (uf) this;
        ((ue) this).field_L.field_n = -40 + ((ue) this).field_n;
        ((ue) this).field_L.b(26, var3, (byte) 119, -40 + ((ue) this).field_n);
        var3 = var3 + (15 + ((ue) this).field_L.field_s);
        ((ue) this).c((byte) 87, (iq) (Object) ((ue) this).field_L);
        int var5 = 4;
        int var6 = 200;
        ((ue) this).field_P.a(false, 300 - var6 >> 1232093025, var3, 40, var6);
        ((ue) this).field_P.field_v = (uf) this;
        ((ue) this).c((byte) 77, (iq) (Object) ((ue) this).field_P);
        ((ue) this).a(false, 0, 0, var5 + (55 + var3), 300);
    }

    private final String a(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ((ue) this).a(-116, (d) null, (byte) -51, -31, 41);
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (!((param2 ^ -1) != -99)) {
            return ((ue) this).a(32345, param3);
        }
        if ((param2 ^ -1) == -100) {
            return ((ue) this).b((byte) -95, param3);
        }
        return false;
    }

    public final void a(pn param0, int param1, int param2, byte param3) {
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param3 == 70) {
          L0: {
            if (0 != param1) {
              if (-2 == param1) {
                se.a("privacy.ws", 12);
                break L0;
              } else {
                if (-3 == param1) {
                  se.a("conduct.ws", 12);
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              se.a("terms.ws", 12);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void i(int param0) {
        field_F = null;
        field_H = null;
        field_J = null;
        if (param0 != 1) {
            return;
        }
        field_M = null;
        field_K = null;
        field_G = null;
        field_N = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_J = null;
        field_G = new int[4096];
        for (var0 = 0; (var0 ^ -1) > -4097; var0++) {
            field_G[var0] = wg.b(0, var0);
        }
        field_F = new String[]{"<lt><lt> ", " <gt><gt>"};
        field_K = "The game can be played online in 2 distinct modes:";
        field_H = "You are offering an unrated rematch.";
    }
}
