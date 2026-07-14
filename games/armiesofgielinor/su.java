/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su {
    static int[] field_a;
    private float[] field_e;
    static String field_b;
    static String field_c;
    static je field_d;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            su.a(true);
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final ej a(byte param0, ha param1, id[] param2, int param3, boolean param4) {
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        ej var10 = new ej(param1, param3, param4, param2);
        ej var6 = var10;
        int var7 = 0;
        int var8 = -40 / ((param0 - -12) / 61);
        while ((var7 ^ -1) > -63) {
            var10.field_P[var7] = ((su) this).field_e[var7];
            var7++;
        }
        return var6;
    }

    private su() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{1, 8, 8, 15, 1, 9};
        field_b = "Name";
        field_c = "Sound: ";
    }
}
