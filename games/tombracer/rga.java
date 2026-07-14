/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rga {
    static int[] field_b;
    int field_a;
    private int field_c;

    public static void a(byte param0) {
        if (param0 <= 56) {
            field_b = null;
        }
        field_b = null;
    }

    final static String[] a(int param0, String param1, char param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = TombRacer.field_G ? 1 : 0;
        CharSequence var11 = (CharSequence) (Object) param1;
        int var3 = sd.a(param2, (byte) 93, var11);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = 0;
        if (param0 != 32287) {
            Object var10 = null;
            String[] discarded$0 = rga.a(65, (String) null, 'ﾭ');
        }
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param2 != param1.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = param1.substring(var6);
        return var4;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var12 = 0;
        int[] var16 = null;
        int var14 = TombRacer.field_G ? 1 : 0;
        int var9 = param7 + -param0;
        int var8 = param0 + param4;
        for (var12 = param4; var8 > var12; var12++) {
            nra.a((byte) -55, param5, param6, vaa.field_a[var12], param3);
        }
        if (param1 <= 97) {
            rga.a((byte) -93);
        }
        for (var12 = param7; var12 > var9; var12--) {
            nra.a((byte) -55, param5, param6, vaa.field_a[var12], param3);
        }
        int var11 = param6 - param0;
        int var10 = param3 + param0;
        for (var12 = var8; var9 >= var12; var12++) {
            var16 = vaa.field_a[var12];
            nra.a((byte) -55, param5, var10, var16, param3);
            nra.a((byte) -55, param2, var11, var16, var10);
            nra.a((byte) -55, param5, param6, var16, var11);
        }
    }

    final static ka a(ka param0, byte param1, int param2) {
        int var3 = -57 % ((param2 - -32) / 49);
        if (param0 == null) {
            return null;
        }
        return param0.a(param1, 654255, false);
    }

    final rga a(int param0, int param1) {
        if (param0 != 0) {
            Object var4 = null;
            ka discarded$0 = rga.a((ka) null, (byte) 71, 47);
        }
        return new rga(((rga) this).field_c, param1);
    }

    final static int b(int param0, int param1) {
        if (param0 != 26499) {
            Object var3 = null;
            String[] discarded$0 = rga.a(121, (String) null, 'J');
        }
        if (!(cm.field_a != null)) {
            return 0;
        }
        g[] var4 = cm.field_a[param1].field_c;
        g[] var2 = var4;
        return var4.length;
    }

    rga(int param0, int param1) {
        ((rga) this).field_c = param0;
        ((rga) this).field_a = param1;
    }

    static {
    }
}
