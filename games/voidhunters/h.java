/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends da implements e {
    long field_nativeid;

    protected final void finalize() {
        if (((h) this).field_nativeid != 0L) {
            pq.a(0, (e) this);
        }
    }

    private final native void JA(oa param0, ya param1, byte[][] param2, int[] param3, int[] param4, int[] param5, int[] param6);

    final native void fa(char param0, int param1, int param2, int param3, boolean param4);

    h(oa param0, ya param1, sw param2, ima[] param3, aja[] param4) {
        super((ha) (Object) param0, param2);
        int var11 = 0;
        byte[][] var6 = new byte[param3.length][];
        int[] var7 = new int[param3.length];
        int[] var8 = new int[param3.length];
        int[] var9 = new int[param3.length];
        int[] var10 = new int[param3.length];
        for (var11 = 0; var11 < param3.length; var11++) {
            var6[var11] = param3[var11].field_h;
            var7[var11] = param3[var11].field_f;
            var8[var11] = param3[var11].field_e;
            var9[var11] = param3[var11].field_c;
            var10[var11] = param3[var11].field_g;
        }
        this.JA(param0, param1, var6, var7, var8, var9, var10);
    }

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        this.NA(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    private final native void NA(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    public final native void w(boolean param0);
}
