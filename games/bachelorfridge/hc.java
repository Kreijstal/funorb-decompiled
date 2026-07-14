/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends vd implements lja {
    private mf field_I;
    private int[] field_G;
    private int field_E;
    static int field_J;
    private String field_C;
    private hf[] field_F;
    static int field_D;
    private po field_H;

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        int var7 = 0;
        int var8 = BachelorFridge.field_y;
        int var6 = 0;
        if (param3 < 50) {
            ((hc) this).a((byte) -102, -21, 19, -11);
        }
        while (var6 < ((hc) this).field_E) {
            if (!(param1 != ((hc) this).field_F[var6])) {
                var7 = ((hc) this).field_G[var6];
                if ((var7 ^ -1) == 0) {
                    ((hc) this).field_I.p(-83);
                    break;
                }
                ep.a(((hc) this).field_G[var6], 8192);
                break;
            }
            var6++;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        this.a((byte) -85, param1, param2, param3);
        int discarded$0 = ((hc) this).field_H.a(((hc) this).field_C, 14 + (((hc) this).field_s + param3), 10 + ((hc) this).field_v + param1, -28 + ((hc) this).field_p, ((hc) this).field_q, 16777215, -1, 0, 0, ((hc) this).field_H.field_u);
        int var5 = -1 % ((param0 - -20) / 54);
    }

    final void a(int param0, String param1, int param2) {
        int var4 = ((hc) this).field_E;
        this.a(var4 - -1, param0 ^ param0);
        ((hc) this).field_F[var4] = ((hc) this).a((pl) this, param1, param0 + 19521);
        ((hc) this).field_G[var4] = param2;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        if (((hc) this).field_E >= param0) {
            return;
        }
        hf[] var7 = new hf[param0];
        hf[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = param1; ((hc) this).field_E > var5; var5++) {
            var7[var5] = ((hc) this).field_F[var5];
            var4[var5] = ((hc) this).field_G[var5];
        }
        ((hc) this).field_F = var3;
        ((hc) this).field_E = param0;
        ((hc) this).field_G = var4;
    }

    hc(mf param0, po param1, String param2) {
        super(0, 0, 288, 0, (qda) null);
        ((hc) this).field_E = 0;
        ((hc) this).field_I = param0;
        ((hc) this).field_H = param1;
        ((hc) this).field_C = param2;
        int var4 = ((hc) this).field_C != null ? ((hc) this).field_H.a(((hc) this).field_C, 260, ((hc) this).field_H.field_u) : 0;
        ((hc) this).a(0, 22 + var4, (byte) 59, 288, 0);
    }

    final hf a(pl param0, String param1, int param2) {
        if (param2 != 19528) {
            Object var6 = null;
            hf discarded$0 = ((hc) this).a((pl) null, (String) null, -17);
        }
        hf var4 = new hf(param1, param0);
        var4.field_f = (qda) (Object) new ff();
        int var5 = -2 + ((hc) this).field_q;
        ((hc) this).a(0, 34 + ((hc) this).field_q, (byte) 59, ((hc) this).field_p, 0);
        var4.a(7, 30, (byte) 59, -14 + ((hc) this).field_p, var5);
        ((hc) this).c((wj) (Object) var4, -126);
        return var4;
    }

    static {
    }
}
