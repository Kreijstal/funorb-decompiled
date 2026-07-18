/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends hr implements e {
    long field_nativeid;

    private final native void ma(oa param0, int[] param1, byte[] param2, byte[] param3, int param4, int param5, int param6, int param7);

    private final native int JA(long param0);

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.W(((j) this).field_nativeid, param0, param1, param2, param3, param4);
    }

    private final native int I(long param0);

    private final native void A(long param0, int param1, int param2, int param3, int param4);

    private final native void b(long param0, float param1, float param2, float param3, float param4, float param5, float param6, int param7, int param8, int param9, int param10);

    final int d() {
        return this.JA(((j) this).field_nativeid);
    }

    private final native int wa(long param0);

    private final native void W(long param0, int param1, int param2, int param3, int param4, int param5);

    final int b() {
        return this.wa(((j) this).field_nativeid);
    }

    final int c() {
        return this.M(((j) this).field_nativeid);
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        this.b(((j) this).field_nativeid, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    private final native void RA(long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.RA(((j) this).field_nativeid, param0, param1, param2, param3, param4, param5, param6, param7);
    }

    final int a() {
        return this.I(((j) this).field_nativeid);
    }

    private final native void ua(oa param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6);

    final void a(int param0, int param1, int param2, int param3) {
        this.A(((j) this).field_nativeid, param0, param1, param2, param3);
    }

    public final void w(boolean param0) {
        this.R(((j) this).field_nativeid, param0);
    }

    private final native int M(long param0);

    j(oa param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.ua(param0, param1, param2, param3, param4, param5, param6);
    }

    private final native void R(long param0, boolean param1);

    protected final void finalize() {
        if (((j) this).field_nativeid != 0L) {
            pa.a((e) this, (byte) -37);
        }
    }

    j(oa param0, int[] param1, byte[] param2, byte[] param3, int param4, int param5, int param6, int param7) {
        this.ma(param0, param1, param2, param3, param4, param5, param6, param7);
    }
}
