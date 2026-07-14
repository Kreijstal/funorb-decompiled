/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dd {
    static db field_f;
    int field_c;
    static String field_d;
    int[] field_b;
    java.awt.Image field_e;
    int field_a;

    abstract void a(boolean param0, int param1, int param2, java.awt.Component param3);

    final static void a(int param0, int param1) {
        th var2 = ed.field_q;
        var2.h(param1, 0);
        if (param0 <= 32) {
            return;
        }
        var2.c(1, -1);
        var2.c(0, -1);
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (param0 != 34) {
            String discarded$0 = dd.a(true, false, true, -68);
        }
        if (!(0 != param1)) {
            return 0;
        }
        if ((param1 ^ -1) < -1) {
            var2 = 1;
            if (!(param1 <= 65535)) {
                param1 = param1 >> 16;
                var2 += 16;
            }
            if (!((param1 ^ -1) >= -256)) {
                var2 += 8;
                param1 = param1 >> 8;
            }
            if (!((param1 ^ -1) >= -16)) {
                var2 += 4;
                param1 = param1 >> 4;
            }
            if (param1 < -4) {
                param1 = param1 >> 2;
                var2 += 2;
            }
            if (-2 < param1) {
                param1 = param1 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (!(param1 >= -65536)) {
            var2 += 16;
            param1 = param1 >> 16;
        }
        if (255 < param1) {
            param1 = param1 >> 8;
            var2 += 8;
        }
        if (!(15 <= param1)) {
            var2 += 4;
            param1 = param1 >> 4;
        }
        if (!(param1 <= 3)) {
            param1 = param1 >> 2;
            var2 += 2;
        }
        if (1 > param1) {
            var2++;
            param1 = param1 >> 1;
        }
        return var2;
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (param2) {
            var4++;
        }
        if (param3 != -11902) {
            field_d = null;
        }
        return sb.field_c[var4];
    }

    abstract void a(int param0, java.awt.Graphics param1, byte param2, int param3);

    public static void a(int param0) {
        field_d = null;
        if (param0 != 1) {
            String discarded$0 = dd.a(false, false, false, -79);
        }
        field_f = null;
    }

    final static void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        int var2 = 1;
        while (var2 < param0.length) {
            var2 = 1 + 3 * var2;
        }
        var2 = var2 / 3;
        if (param1 != -23588) {
            int discarded$0 = dd.a((byte) 112, 61);
        }
        while ((var2 ^ -1) < -1) {
            for (var3 = 0; var3 < var2; var3++) {
                vh.a((byte) -42, var2, param0, var3);
            }
            var2 = var2 / 3;
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            return;
        }
        lf.a(((dd) this).field_b, ((dd) this).field_a, ((dd) this).field_c);
    }

    static {
    }
}
