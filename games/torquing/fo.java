/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo extends hn implements ng {
    private int field_J;
    static String field_E;
    private int[] field_H;
    private mn field_C;
    private uc field_G;
    private lg[] field_I;
    private String field_B;

    fo(mn param0, uc param1, String param2) {
        super(0, 0, 288, 0, (el) null);
        ((fo) this).field_J = 0;
        ((fo) this).field_B = param2;
        ((fo) this).field_G = param1;
        ((fo) this).field_C = param0;
        int var4 = null != ((fo) this).field_B ? ((fo) this).field_G.a(((fo) this).field_B, 260, ((fo) this).field_G.field_x) : 0;
        ((fo) this).a((byte) -10, 0, 0, 22 + var4, 288);
    }

    final void a(String param0, int param1, int param2) {
        int var4 = ((fo) this).field_J;
        this.a(1 + var4, (byte) -119);
        ((fo) this).field_I[var4] = ((fo) this).a(param1 + -5177, param0, (ca) this);
        ((fo) this).field_H[var4] = param2;
        if (param1 != 5177) {
            ((fo) this).field_I = null;
        }
    }

    public static void h(int param0) {
        field_E = null;
        if (param0 != -2) {
            String discarded$0 = fo.i(-42);
        }
    }

    private final void a(int param0, byte param1) {
        int var6 = 0;
        int var7 = Torquing.field_u;
        if (!(param0 > ((fo) this).field_J)) {
            return;
        }
        lg[] var8 = new lg[param0];
        lg[] var3 = var8;
        int[] var4 = new int[param0];
        int var5 = 19 / ((-78 - param1) / 36);
        for (var6 = 0; ((fo) this).field_J > var6; var6++) {
            var8[var6] = ((fo) this).field_I[var6];
            var4[var6] = ((fo) this).field_H[var6];
        }
        ((fo) this).field_I = var3;
        ((fo) this).field_H = var4;
        ((fo) this).field_J = param0;
    }

    final static String i(int param0) {
        if (!(bh.field_a != mg.field_b)) {
            return on.field_d;
        }
        if (param0 != 17543) {
            field_E = null;
        }
        return vo.field_g;
    }

    final static int a(int param0, byte param1, int param2) {
        if (param0 < 0) {
            return fo.a(-param0, (byte) -74, param2);
        }
        if (0 > param2) {
            return fo.a(param0, (byte) -93, -param2);
        }
        if (!(param0 >= param2)) {
            return fo.a(param2, (byte) -46, param0);
        }
        if (!(-1 != (param2 ^ -1))) {
            return param0;
        }
        if (param1 > -15) {
            int discarded$0 = fo.a(104, (byte) -106, -117);
        }
        return fo.a(param2, (byte) -71, param0 % param2);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -29, param2, param3);
        int discarded$31 = ((fo) this).field_G.a(((fo) this).field_B, ((fo) this).field_w + (param3 + 14), ((fo) this).field_k + (param2 - -10), ((fo) this).field_p + -28, ((fo) this).field_o, 16777215, -1, 0, 0, ((fo) this).field_G.field_x);
        if (param1 >= -7) {
            Object var6 = null;
            lg discarded$32 = ((fo) this).a(92, (String) null, (ca) null);
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Torquing.field_u;
        for (var6 = 0; var6 < ((fo) this).field_J; var6++) {
            if (!(param1 != ((fo) this).field_I[var6])) {
                var7 = ((fo) this).field_H[var6];
                if (-1 != var7) {
                    od.b(128, ((fo) this).field_H[var6]);
                    break;
                }
                ((fo) this).field_C.b(true);
                break;
            }
        }
        if (param0 > -85) {
            this.a(-79, (byte) -81);
        }
    }

    final lg a(int param0, String param1, ca param2) {
        lg var4 = new lg(param1, param2);
        var4.field_q = (el) (Object) new rf();
        int var5 = -2 + ((fo) this).field_o;
        ((fo) this).a((byte) 127, param0, 0, 34 + ((fo) this).field_o, ((fo) this).field_p);
        var4.a((byte) -42, 7, var5, 30, -14 + ((fo) this).field_p);
        ((fo) this).a((gm) (Object) var4, -6938);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Cancel";
    }
}
