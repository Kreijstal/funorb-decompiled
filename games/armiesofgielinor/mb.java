/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends oj {
    int field_D;
    private int field_I;
    private boolean field_E;
    static je field_F;
    int field_z;
    static long field_G;
    static kl field_B;
    int field_H;
    private int field_A;
    private boolean field_y;

    final static rn a(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = param0.length();
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        if (param1 >= -12) {
            return null;
        }
        return ov.field_h;
    }

    final void a(ha param0, int param1) {
        if (((mb) this).field_E) {
            return;
        }
        ((mb) this).field_E = true;
        param0.a(false, ((mb) this).field_z, ((mb) this).field_A, ((mb) this).field_H, 1, ((mb) this).field_D, ((mb) this).field_I);
        ((mb) this).field_w = param0.c(((mb) this).field_H, true, ((mb) this).field_z);
        ((mb) this).field_w.field_W = ((mb) this).field_w.field_W | ((mb) this).field_y;
        if (param1 != -26661) {
            ((mb) this).field_A = -119;
        }
        fl.a(param0, param1 + 26537);
    }

    final static jd a(int param0, int param1, int param2, int param3, vh param4, ha param5, int param6, boolean param7) {
        int var17 = 0;
        if (param6 > -75) {
            return null;
        }
        int var8 = param4.k(0);
        int var9 = param4.e((byte) -104);
        int var10 = param4.k(0);
        int var11 = param4.a((byte) 110);
        int var12 = param4.k(0);
        int var13 = param4.k(0);
        int var14 = param4.k(0);
        int var15 = param4.k(0);
        if (!((var14 ^ -1) != -256)) {
            var14 = -1;
        }
        jd var16 = new jd(param3, param2, param0, var8 >> 1859546053, var10, var11, var9, var13, 7 & var8, param5, var12 & 15, var12 >> -1879353052, var14, param7, var15);
        var16.field_V = param4.k(0);
        if ((var16.field_V & 4) != 0) {
            var16.field_K = param4.h((byte) 121);
        }
        if (-1 > (param1 ^ -1)) {
            var17 = param4.k(0);
            if (!((2 & var17) == 0)) {
                var16.field_E = param4.k(0);
            }
            if (0 != (1 & var17)) {
                var16.field_H = param4.k(0);
            }
        }
        return var16;
    }

    final boolean a(at param0, byte param1, ic param2) {
        param2.field_y = -2;
        if (param1 > -84) {
            Object var5 = null;
            ((mb) this).a((ha) null, 15);
        }
        return ((mb) this).a((byte) -39, param2, param0, true);
    }

    final String a(byte param0, boolean param1) {
        int var4 = 46 % ((53 - param0) / 51);
        if (param1) {
            System.out.println("Summon event debug");
            System.out.println("Player " + ((mb) this).field_D);
            System.out.println("Unit at " + ((mb) this).field_z + "," + ((mb) this).field_H);
            System.out.println("Type " + ((mb) this).field_A + " Bonus" + ((mb) this).field_I);
        }
        String var3 = "EventSummon: pos: (" + ((mb) this).field_z + "," + ((mb) this).field_H + "), bonus: " + ((mb) this).field_I + ", player: " + ((mb) this).field_D;
        return var3;
    }

    public static void d(byte param0) {
        field_F = null;
        if (param0 <= 103) {
            Object var2 = null;
            jd discarded$0 = mb.a(48, -43, -111, 118, (vh) null, (ha) null, -109, true);
        }
        field_B = null;
    }

    mb(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        ((mb) this).field_H = param2;
        ((mb) this).field_y = param5 ? true : false;
        ((mb) this).field_m = 2;
        ((mb) this).field_D = param4;
        ((mb) this).field_I = param3;
        ((mb) this).field_A = param0;
        ((mb) this).field_z = param1;
    }

    mb(int param0, int param1, int param2, int param3, int param4) {
        ((mb) this).field_H = param2;
        ((mb) this).field_A = param0;
        ((mb) this).field_m = 2;
        ((mb) this).field_y = false;
        ((mb) this).field_D = param4;
        ((mb) this).field_z = param1;
        ((mb) this).field_I = param3;
    }

    static {
    }
}
