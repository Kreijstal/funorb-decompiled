/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends da implements e {
    long field_nativeid;

    private final native void NA(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    final native void fa(char param0, int param1, int param2, int param3, boolean param4);

    protected final void finalize() {
        if (((h) this).field_nativeid != 0L) {
            pa.a((e) this, (byte) -37);
        }
    }

    public final native void w(boolean param0);

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        this.NA(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    h(oa param0, ya param1, ta param2, ri[] param3, hr[] param4) {
        super((ha) (Object) param0, param2);
        int var11 = 0;
        byte[][] var6 = new byte[param3.length][];
        int[] var7 = new int[param3.length];
        int[] var8 = new int[param3.length];
        int[] var9 = new int[param3.length];
        int[] var10 = new int[param3.length];
        for (var11 = 0; var11 < param3.length; var11++) {
            var6[var11] = param3[var11].field_e;
            var7[var11] = param3[var11].field_h;
            var8[var11] = param3[var11].field_i;
            var9[var11] = param3[var11].field_c;
            var10[var11] = param3[var11].field_d;
        }
        this.JA(param0, param1, var6, var7, var8, var9, var10);
    }

    private final native void JA(oa param0, ya param1, byte[][] param2, int[] param3, int[] param4, int[] param5, int[] param6);
}
