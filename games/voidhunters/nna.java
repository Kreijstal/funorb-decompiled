/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nna extends dqa implements oo {
    static String field_F;
    private int[] field_E;
    static String field_D;
    private os field_B;
    static int field_w;
    static llb field_v;
    static djb field_C;
    private no field_H;
    private String field_x;
    static ae field_z;
    private int field_A;
    private htb[] field_y;

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = VoidHunters.field_G;
        if (param0 != 11) {
            return;
        }
        for (var6 = 0; ((nna) this).field_A > var6; var6++) {
            if (((nna) this).field_y[var6] == param3) {
                var7 = ((nna) this).field_E[var6];
                if (0 == (var7 ^ -1)) {
                    ((nna) this).field_B.l((byte) -106);
                    break;
                }
                cea.a(127, ((nna) this).field_E[var6]);
                break;
            }
        }
    }

    final void a(int param0, String param1, int param2) {
        int var4 = ((nna) this).field_A;
        this.a(-4349, var4 - -1);
        if (param0 > -113) {
            field_D = null;
        }
        ((nna) this).field_y[var4] = ((nna) this).a((byte) 62, param1, (sba) this);
        ((nna) this).field_E[var4] = param2;
    }

    final htb a(byte param0, String param1, sba param2) {
        if (param0 <= 59) {
            ((nna) this).b(78, -29, 18, 90);
        }
        htb var4 = new htb(param1, param2);
        var4.field_q = (wwa) (Object) new vva();
        int var5 = -2 + ((nna) this).field_f;
        ((nna) this).a(0, ((nna) this).field_h, ((nna) this).field_f - -34, 1, 0);
        var4.a(7, ((nna) this).field_h - 14, 30, 1, var5);
        ((nna) this).b(-18756, (shb) (Object) var4);
        return var4;
    }

    public static void c(boolean param0) {
        field_F = null;
        field_v = null;
        field_z = null;
        field_C = null;
        if (!param0) {
            nna.c(true);
        }
        field_D = null;
    }

    nna(os param0, no param1, String param2) {
        super(0, 0, 288, 0, (wwa) null);
        ((nna) this).field_A = 0;
        ((nna) this).field_x = param2;
        ((nna) this).field_B = param0;
        ((nna) this).field_H = param1;
        int var4 = null != ((nna) this).field_x ? ((nna) this).field_H.b(((nna) this).field_x, 260, ((nna) this).field_H.field_k) : 0;
        ((nna) this).a(0, 288, var4 + 22, 1, 0);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 < 47) {
            Object var6 = null;
            htb discarded$0 = ((nna) this).a((byte) -58, (String) null, (sba) null);
        }
        super.b(param0, param1, 61, param3);
        int discarded$1 = ((nna) this).field_H.a(((nna) this).field_x, param0 - -((nna) this).field_g - -14, 10 + (param3 + ((nna) this).field_r), ((nna) this).field_h + -28, ((nna) this).field_f, 16777215, -1, 0, 0, ((nna) this).field_H.field_k);
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        if (!(param1 > ((nna) this).field_A)) {
            return;
        }
        htb[] var7 = new htb[param1];
        htb[] var3 = var7;
        if (param0 != -4349) {
            return;
        }
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((nna) this).field_A; var5++) {
            var7[var5] = ((nna) this).field_y[var5];
            var4[var5] = ((nna) this).field_E[var5];
        }
        ((nna) this).field_y = var3;
        ((nna) this).field_A = param1;
        ((nna) this).field_E = var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "This option cannot be combined with the current settings for:  ";
        field_D = "Return to game";
    }
}
