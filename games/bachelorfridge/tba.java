/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tba extends bca {
    int field_q;
    static String field_r;
    int field_s;
    int[][] field_t;
    static volatile int field_u;

    final void a(byte param0, lu param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        this.a((byte) -26, param1);
        param1.d(((tba) this).field_q, 0);
        param1.d(((tba) this).field_s, 0);
        for (var3 = 0; (var3 ^ -1) > -7; var3++) {
            param1.d(((tba) this).field_t[var3][0], 0);
            param1.d(((tba) this).field_t[var3][1], 0);
        }
        if (param0 > -12) {
            field_u = 75;
        }
    }

    public static void d(int param0) {
        if (param0 != 9) {
            return;
        }
        field_r = null;
    }

    final void a(op param0, int param1) {
        ((tba) this).a(param0, (byte) -2);
        int var3 = 64 / ((param1 - 12) / 35);
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        if (param0 < 84) {
            return;
        }
        dm.field_g.field_g = 0;
        dm.field_g.d(12, 0);
        dm.field_g.e(ia.field_k.nextInt(), -1615464796);
        dm.field_g.e(ia.field_k.nextInt(), -1615464796);
        dm.field_g.d(param3, 0);
        dm.field_g.d(param2, 0);
        dm.field_g.b(param1, -113);
        dm.field_g.a(tg.field_p, 0, sm.field_q);
        sja.field_fb.c(18, (byte) 123);
        sja.field_fb.field_g = sja.field_fb.field_g + 1;
        int var4 = sja.field_fb.field_g + 1;
        sja.field_fb.a(0, -126, dm.field_g.field_g, dm.field_g.field_h);
        sja.field_fb.b((byte) 118, sja.field_fb.field_g - var4);
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            ((tba) this).field_s = -125;
        }
        return (at) (Object) new qr(param1, (tba) this);
    }

    tba(int param0, nq param1) {
        super(param0, param1);
        ((tba) this).field_t = new int[6][2];
    }

    final int[][] e(int param0) {
        int[][] var7 = new int[17][17];
        int[][] var6 = var7;
        int[][] var5 = var6;
        int[][] var4 = var5;
        int[][] var3 = var4;
        int[][] var2 = var3;
        var7[6][7] = 1;
        var7[5][8] = 1;
        var7[6][8] = 1;
        var7[7][6] = 1;
        var7[7][7] = 1;
        var7[param0][9] = 1;
        var7[7][9] = 1;
        var7[8][7] = 1;
        var7[7][8] = 1;
        var7[8][6] = 1;
        var7[7][10] = 1;
        var7[8][5] = 1;
        var7[9][7] = 1;
        var7[9][6] = 1;
        var7[8][10] = 1;
        var7[8][8] = 1;
        var7[8][11] = 1;
        var7[8][9] = 1;
        var7[9][10] = 1;
        var7[10][7] = 1;
        var7[9][8] = 1;
        var7[9][9] = 1;
        var7[10][8] = 1;
        var7[10][9] = 1;
        var7[11][8] = 1;
        return var2;
    }

    tba(lu param0) {
        super(param0);
        int var3 = 0;
        ((tba) this).field_k = param0.e((byte) 84);
        ((tba) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((tba) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((tba) this).field_q = param0.b(16711935);
        ((tba) this).field_s = param0.b(16711935);
        ((tba) this).field_t = new int[6][2];
        for (var3 = 0; -7 < (var3 ^ -1); var3++) {
            ((tba) this).field_t[var3] = new int[2];
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "You cannot delete this creature:";
        field_u = 0;
    }
}
