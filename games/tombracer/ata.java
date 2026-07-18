/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ata extends rra {
    private int field_i;
    private int field_h;
    private int field_f;
    private int field_g;

    final void a(int param0, int param1, int param2) {
        int var4 = param2 * ((ata) this).field_i >> 12;
        int var5 = ((ata) this).field_f * param2 >> 12;
        int var6 = param0 * ((ata) this).field_h >> 12;
        int var7 = param0 * ((ata) this).field_g >> 12;
        cca.a(var7, var5, ((ata) this).field_c, var6, 936441872, var4);
        int var8 = 127 % ((55 - param1) / 37);
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = ((ata) this).field_i * param0 >> 12;
        int var5 = ((ata) this).field_f * param0 >> 12;
        if (!param2) {
            return;
        }
        int var6 = param1 * ((ata) this).field_h >> 12;
        int var7 = ((ata) this).field_g * param1 >> 12;
        lo.a(var5, ((ata) this).field_d, var7, var4, var6, param2, ((ata) this).field_b);
    }

    ata(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        ((ata) this).field_g = param3;
        ((ata) this).field_i = param0;
        ((ata) this).field_h = param1;
        ((ata) this).field_f = param2;
    }

    final static String b(int param0) {
        int var3 = 0;
        String var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        String var1 = "";
        String[] var2 = rf.field_c;
        for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            var1 = var1 + var4 + "\n";
        }
        return var1;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = param1 * ((ata) this).field_i >> 12;
        int var5 = param1 * ((ata) this).field_f >> 12;
        if (param0 > -117) {
            ((ata) this).a((byte) -12, 75, -53);
        }
        int var6 = ((ata) this).field_h * param2 >> 12;
        int var7 = ((ata) this).field_g * param2 >> 12;
        tl.a((byte) -71, var4, var6, var5, var7, ((ata) this).field_d, ((ata) this).field_c, ((ata) this).field_b);
    }

    static {
    }
}
