/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static je field_a;
    static int field_b;
    static String field_e;
    static String field_d;
    static je field_c;

    final static void a(boolean param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (76 == param1) {
            return;
        }
        if (param0) {
            if (!param2) {
                return;
            }
            for (var3 = 1; var3 < mn.field_m[param1].length; var3++) {
                mn.field_k[param1][var3] = null;
            }
            return;
        }
        if (!(16 != param1)) {
            param1 = 78;
        }
        if (25 == param1) {
            param1 = 79;
        }
        if ((param1 ^ -1) == -49) {
            param1 = 80;
        }
        if (param1 != 85) {
            if (!param2) {
                return;
            }
            for (var3 = 1; var3 < mn.field_m[param1].length; var3++) {
                mn.field_k[param1][var3] = null;
            }
            return;
        }
        param1 = 89;
        if (!param2) {
            return;
        }
        for (var3 = 1; var3 < mn.field_m[param1].length; var3++) {
            mn.field_k[param1][var3] = null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 != 1) {
            field_c = null;
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static int a(byte param0, int param1) {
        param1 = ((-1431655766 & param1) >>> 716488737) + (1431655765 & param1);
        param1 = (param1 & 858993459) - -((param1 & -858993458) >>> -799002878);
        param1 = 252645135 & (param1 >>> 539582692) + param1;
        if (param0 >= -70) {
            field_e = null;
            param1 = param1 + (param1 >>> 1897789992);
            param1 = param1 + (param1 >>> 261794928);
            return param1 & 255;
        }
        param1 = param1 + (param1 >>> 1897789992);
        param1 = param1 + (param1 >>> 261794928);
        return param1 & 255;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Send private message";
        field_e = "Month";
        field_b = 5;
    }
}
