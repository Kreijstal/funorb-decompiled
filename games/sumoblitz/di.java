/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class di extends ak {
    private int field_i;

    final void b(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        super.b(param0 + 0);
        kf.field_u.d(param0 ^ 18481);
        if (!(this.field_i % 50 != 0)) {
            up.field_a = fi.a(640, he.field_o, (byte) -96) << -1372317240;
            cv.field_E = fi.a(480, he.field_o, (byte) -96) << -1347168376;
        }
        kf.field_u.a(false, cv.field_E, up.field_a);
        if (param0 != -18556) {
            this.field_i = -126;
        }
        if (0 == this.field_i % 100) {
            ff.a(kf.field_u.field_C, 40, kf.field_u.field_z, im.field_b, lr.field_a[fi.a(6, he.field_o, (byte) -96)], (byte) 94);
            gn.a(34 - -fi.a(4, he.field_o, (byte) -96), true);
        }
        if (this.field_i % 2 == 0) {
            im.field_b.a((ms) (new eq(50, -1024 + (kf.field_u.field_C - -fi.a(2048, he.field_o, (byte) -96)) >> 476304552, kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96) - 1024 >> 1841568008, -1, 0, false)), (byte) 39);
            im.field_b.a((ms) (new eq(50, -1024 + (kf.field_u.field_C + fi.a(2048, he.field_o, (byte) -96)) >> 1361217352, -1024 + (kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96)) >> 1154435944, -1, 2, false)), (byte) 39);
            im.field_b.a((ms) (new eq(50, -1024 + kf.field_u.field_C + fi.a(2048, he.field_o, (byte) -96) >> -510921944, kf.field_u.field_z + fi.a(2048, he.field_o, (byte) -96) - 1024 >> 1137458600, -1, 4, false)), (byte) 39);
        } else {
            im.field_b.a((ms) (new eq(50, kf.field_u.field_C - -fi.a(2048, he.field_o, (byte) -96) + -1024 >> -1704631000, -1024 + (kf.field_u.field_z + fi.a(2048, he.field_o, (byte) -96)) >> 124855400, -1, 1, true)), (byte) 39);
            im.field_b.a((ms) (new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 1559284616, kf.field_u.field_z - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> -1073312728, -1, 3, true)), (byte) 39);
            im.field_b.a((ms) (new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 108089896, -1024 + kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96) >> -861402680, -1, 5, true)), (byte) 39);
        }
        nt var2 = (nt) ((Object) im.field_b.b(68));
        while (var2 != null) {
            if (var2.a(-2567)) {
                var2.b(false);
                if (var2 instanceof vi && (fi.a(3, he.field_o, (byte) -96) ^ -1) == -2 && !((vi) ((Object) var2)).field_u) {
                    uv.a(lr.field_a[fi.a(6, he.field_o, (byte) -96)], var2.field_o, param0 ^ 18547, var2.field_k, im.field_b, 20);
                }
            }
            var2 = (nt) ((Object) im.field_b.d((byte) 18));
        }
        this.field_i = this.field_i + 1;
    }

    final static String b(byte param0) {
        int var3 = 0;
        String var8 = null;
        int var4 = 0;
        int var5 = 0;
        String var9 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        int var2 = 42 / ((param0 - -75) / 49);
        String var7 = "(" + li.field_r + " " + vb.field_I + " " + ur.field_Q + ") " + iw.field_a;
        String var1 = var7;
        if (0 >= gu.field_d) {
        } else {
            var1 = var7 + ":";
            for (var3 = 0; var3 < gu.field_d; var3++) {
                var8 = var1 + ' ';
                var4 = ig.field_a.field_n[var3] & 255;
                var5 = var4 >> 22797604;
                var4 = var4 & 15;
                if (10 <= var5) {
                    var5 += 55;
                } else {
                    var5 += 48;
                }
                if (10 <= var4) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                var9 = var8 + (char)var5;
                var1 = var9 + (char)var4;
            }
        }
        return var1;
    }

    public di() {
        super(12);
        im.field_b = new jn();
    }

    final void a(int param0, ha param1, int param2) {
        ha var8 = null;
        hr[] var5 = null;
        nt var7 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        try {
            var8 = param1;
            var5 = hf.field_H;
            wo.a(var5, 60, 210, 0, 1, var8, 220, 350, 1, true);
            wo.a(hf.field_H, lu.field_e.a() + 20, -10 + (-(lu.field_e.c() >> -1042230751) + 320), -1426063360, 3, param1, lu.field_e.c() - -20, 190 - (lu.field_e.a() >> -314680511), 1, true);
            lu.field_e.a(-(lu.field_e.c() >> -1963037023) + 320, 200 - (lu.field_e.a() >> -1889581407));
            var7 = (nt) ((Object) im.field_b.b(-102));
            while (var7 != null) {
                var7.a(param1, param2 + 2230);
                var7 = (nt) ((Object) im.field_b.d((byte) 18));
            }
            kf.field_u.a(param1, param2 + 21754);
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "di.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
