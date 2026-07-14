/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends wf {
    int field_h;
    private int field_g;
    private int[] field_j;
    private static int[] field_f;
    boolean field_e;
    int field_i;

    final void a(int param0, int param1) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param0 == 0) {
            if (param1 == 0) {
                return;
            }
        }
        if (field_f != null) {
            // if_icmpeq L37
        }
        field_f = new int[((ui) this).field_j.length];
        int var3 = ((ui) this).field_j.length;
        int var4 = param0;
        int var5 = ((ui) this).field_g - 1;
        int var6 = ((ui) this).field_g * param1;
        int var7 = var3 - 1;
        int var8_int = 0;
        while (var8_int < var3) {
            var9 = var8_int + var6 & var7;
            for (var10 = 0; var10 < ((ui) this).field_g; var10++) {
                var11 = var8_int + var10;
                var12 = var9 + (var10 + var4 & var5);
                field_f[var11] = ((ui) this).field_j[var12];
            }
            var8_int = var8_int + ((ui) this).field_g;
        }
        int[] var8 = ((ui) this).field_j;
        ((ui) this).field_j = field_f;
        field_f = var8;
    }

    public static void a() {
        field_f = null;
    }

    private ui() throws Throwable {
        throw new Error();
    }
}
