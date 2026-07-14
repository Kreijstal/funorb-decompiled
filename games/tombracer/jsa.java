/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jsa extends qr {
    private int field_G;
    static String field_F;
    private String field_C;
    private int field_D;
    static String field_z;
    private boolean field_E;
    private int field_A;
    private il field_B;
    static String field_y;

    final String d(byte param0) {
        int var3 = 114 % ((param0 - -58) / 60);
        int var2 = ((jsa) this).field_x.field_f ? 1 : 0;
        ((jsa) this).field_x.field_f = ((jsa) this).field_f;
        String var4 = ((jsa) this).field_x.d((byte) 56);
        ((jsa) this).field_x.field_f = var2 != 0 ? true : false;
        return var4;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((jsa) this).field_i + param0;
        int var6 = ((jsa) this).field_n - -param1;
        super.a(param0, param1, param2 ^ param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        int var7 = ((jsa) this).field_E ? ((jsa) this).field_m - ((jsa) this).field_D - ((jsa) this).field_G * 2 : 0;
        int discarded$0 = ((jsa) this).field_B.a(((jsa) this).field_C, ((jsa) this).field_G + var5 - -var7, ((jsa) this).field_G + var6, ((jsa) this).field_D + -((jsa) this).field_G, -(((jsa) this).field_G * 2) + ((jsa) this).field_p, ((jsa) this).field_A, -1, !((jsa) this).field_E ? 2 : 0, 1, ((jsa) this).field_B.field_w);
    }

    jsa(int param0, int param1, int param2, int param3, ae param4, boolean param5, int param6, int param7, il param8, int param9, String param10) {
        super(param0, param1, param2, param3, (isa) null, (qc) null);
        ((jsa) this).field_D = param6;
        ((jsa) this).field_A = param9;
        ((jsa) this).field_C = param10;
        ((jsa) this).field_B = param8;
        ((jsa) this).field_x = param4;
        ((jsa) this).field_E = param5 ? true : false;
        ((jsa) this).field_G = param7;
        int var12 = -((jsa) this).field_G + ((jsa) this).field_D;
        int var13 = ((jsa) this).field_B.a(param10, var12, ((jsa) this).field_B.field_w) - -(((jsa) this).field_G * 2);
        if (param3 < var13) {
            ((jsa) this).a((byte) -31, param2, var13, param0, param1);
        } else {
            var13 = param3;
        }
        int var14 = !((jsa) this).field_E ? 2 * ((jsa) this).field_G + ((jsa) this).field_D : 0;
        ((jsa) this).field_x.a((byte) -31, -((jsa) this).field_D + param2 + -(((jsa) this).field_G * 3), -(((jsa) this).field_G * 2) + param3, var14, ((jsa) this).field_G - -(var13 - param3 >> 2094708161));
    }

    final static iu[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 2) {
          field_z = null;
          return hi.a(param0, 1, param3, 1, param4, 1, 3, true, param2);
        } else {
          return hi.a(param0, 1, param3, 1, param4, 1, 3, true, param2);
        }
    }

    final static void a(boolean param0, int param1) {
        if (param0) {
            return;
        }
        bf.field_a = param1;
    }

    public static void e(int param0) {
        field_z = null;
        field_F = null;
        if (param0 != 2) {
            field_y = null;
            field_y = null;
            return;
        }
        field_y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Show all private chat";
        field_F = "Waiting for Other Players";
        field_y = "This is your RuneScape clan if you have one.";
    }
}
