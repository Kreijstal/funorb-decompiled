/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends hl {
    static ah field_i;
    int field_k;
    static boolean field_j;
    byte[] field_l;

    final static String[] a(String param0, byte param1, char param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = HoldTheLine.field_D;
        CharSequence var11 = (CharSequence) (Object) param0;
        int var3 = of.a(0, var11, param2);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = 0;
        if (param1 >= -27) {
            Object var10 = null;
            String[] discarded$0 = fl.a((String) null, (byte) 112, '￐');
        }
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param2 != param0.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param0.substring(var6, var8);
            var6 = var8 - -1;
        }
        var4[var3] = param0.substring(var6);
        return var4;
    }

    public static void a(int param0) {
        if (param0 != 381) {
            Object var2 = null;
            fl.a((String) null, 82, 107, -78, 12);
        }
        field_i = null;
    }

    final static void a(String param0, int param1, int param2, int param3, int param4) {
        on.field_t.a(param1, param4);
        nj.field_i.a(381 + param1, param4);
        nm.field_c.b(param0, param1 + 320, -2 + ((30 - -nm.field_c.field_G) / 2 + param4), param2, -1);
        if (param3 != -1753) {
            field_i = null;
        }
    }

    fl(byte[] param0) {
        ((fl) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ah();
    }
}
