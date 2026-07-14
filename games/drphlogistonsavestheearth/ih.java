/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends pj implements ra, ke {
    static String field_N;
    private qd field_M;
    static int[] field_O;
    static String field_P;
    static String field_J;
    private qa field_Q;
    static int field_K;
    static int field_R;
    private hf field_L;

    final static he[] k(int param0) {
        int var2 = 0;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 24782) {
            return null;
        }
        he[] var1 = new he[bd.field_M];
        for (var2 = 0; var2 < bd.field_M; var2++) {
            var1[var2] = new he(oe.field_b, field_K, kh.field_i[var2], vi.field_b[var2], gf.field_o[var2], qa.field_J[var2], a.field_e[var2], aj.field_a);
        }
        oc.a((byte) -21);
        return var1;
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        if (param3 < 63) {
            return true;
        }
        if (super.a(param0, param1, param2, 88)) {
            return true;
        }
        if (!(-99 != (param0 ^ -1))) {
            return ((ih) this).a(param2, 65535);
        }
        if (param0 != 99) {
            return false;
        }
        return ((ih) this).a(param2, (byte) 105);
    }

    ih(qd param0) {
        super(0, 0, 288, 0, (cg) null);
        ((ih) this).field_M = param0;
        ((ih) this).field_L = new hf(cd.field_a, (fd) null);
        ((ih) this).field_L.field_l = (cg) (Object) new ie();
        String var7 = a.a(5044, wk.field_l, new String[2]);
        int var3 = 20;
        l var4 = new l(uh.field_i, 0, 0, 0, 0, 16777215, -1, 3, 0, uh.field_i.field_x, -1, 2147483647, true);
        ((ih) this).field_Q = new qa(var7, (cg) (Object) var4);
        ((ih) this).field_Q.field_v = "";
        ((ih) this).field_Q.a(we.field_d, 0, 124);
        ((ih) this).field_Q.a(we.field_d, 1, 115);
        ((ih) this).field_Q.field_u = (fd) this;
        ((ih) this).field_Q.field_w = -40 + ((ih) this).field_w;
        ((ih) this).field_Q.b(0, -40 + ((ih) this).field_w, 26, var3);
        var3 = var3 + (15 + ((ih) this).field_Q.field_k);
        ((ih) this).b((vg) (Object) ((ih) this).field_Q, (byte) 50);
        int var5 = 4;
        int var6 = 200;
        ((ih) this).field_L.a(var3, 40, 300 + -var6 >> 1119285729, 16535, var6);
        ((ih) this).field_L.field_u = (fd) this;
        ((ih) this).b((vg) (Object) ((ih) this).field_L, (byte) 125);
        ((ih) this).a(0, 55 + (var3 - -var5), 0, 16535, 300);
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        if (((ih) this).field_L == param3) {
            lk.b(1);
            ((ih) this).field_M.d(true);
        }
        if (!param2) {
            ((ih) this).field_M = null;
        }
    }

    public static void l(int param0) {
        field_O = null;
        if (param0 != 288) {
            return;
        }
        field_J = null;
        field_P = null;
        field_N = null;
    }

    public final void a(int param0, int param1, qa param2, int param3) {
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 > -90) {
            return;
        }
        if (0 == param0) {
            nd.a(-1, "terms.ws");
        } else {
            if (-2 != (param0 ^ -1)) {
                // if_icmpne L59
                nd.a(-1, "conduct.ws");
            } else {
                nd.a(-1, "privacy.ws");
            }
        }
    }

    private final String j(int param0) {
        if (param0 >= -57) {
            ((ih) this).field_M = null;
        }
        return "</col></u>";
    }

    private final String i(int param0) {
        int var2 = 56 % ((param0 - 28) / 57);
        return "<u=2164A2><col=2164A2>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "This entry doesn't match";
        field_O = new int[13];
        field_O[11] = 140;
        field_O[0] = 140;
        field_O[4] = 140;
        field_O[1] = 140;
        field_O[3] = 56;
        field_O[2] = 120;
        field_O[7] = 140;
        field_O[10] = 140;
        field_O[6] = 140;
        field_O[8] = 140;
        field_O[9] = 76;
        field_O[5] = 140;
        field_R = 0;
        field_P = "Discard";
    }
}
