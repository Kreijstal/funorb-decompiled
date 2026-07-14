/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_a;
    static long field_b;

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        byte[] var9 = null;
        int var5 = 0;
        byte[] var4 = null;
        int var8 = SolKnight.field_L ? 1 : 0;
        if ((param1 ^ -1) >= -1) {
            var4 = param3;
        } else {
            var9 = new byte[param0];
            var4 = var9;
            for (var5 = 0; var5 < param0; var5++) {
                var9[var5] = param3[var5 + param1];
            }
        }
        var5 = 53 / ((47 - param2) / 35);
        fi var6 = new fi();
        var6.b((byte) 127);
        var6.a((long)(8 * param0), var4, 0);
        byte[] var7 = new byte[64];
        var6.a(var7, 0, (byte) 124);
        return var7;
    }

    static {
    }
}
