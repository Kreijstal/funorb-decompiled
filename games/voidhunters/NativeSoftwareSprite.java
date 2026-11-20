/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareSprite extends ToolkitSprite implements NativeResource {
    long field_nativeid;

    private final native void b(long param0, float param1, float param2, float param3, float param4, float param5, float param6, int param7, int param8, int param9, int param10);

    final void draw(int param0, int param1, int param2, int param3, int param4) {
        this.W(this.field_nativeid, param0, param1, param2, param3, param4);
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeDisposalQueue.enqueue(0, (NativeResource) (this));
        }
    }

    final int getWidth() {
        return this.M(this.field_nativeid);
    }

    public final void disposeNative(boolean param0) {
        this.R(this.field_nativeid, param0);
    }

    private final native void W(long param0, int param1, int param2, int param3, int param4, int param5);

    final int getPaddedHeight() {
        return this.JA(this.field_nativeid);
    }

    private final native void R(long param0, boolean param1);

    private final native void ma(NativeSoftwareToolkit param0, int[] param1, byte[] param2, byte[] param3, int param4, int param5, int param6, int param7);

    final void drawScaled(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.RA(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6, param7);
    }

    final int getHeight() {
        return this.I(this.field_nativeid);
    }

    private final native int JA(long param0);

    final void drawTiled(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.P(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6);
    }

    private final native void RA(long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    private final native int I(long param0);

    private final native void ua(NativeSoftwareToolkit param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6);

    private final native void A(long param0, int param1, int param2, int param3, int param4);

    final void setPadding(int param0, int param1, int param2, int param3) {
        this.A(this.field_nativeid, param0, param1, param2, param3);
    }

    NativeSoftwareSprite(NativeSoftwareToolkit param0, int param1, int param2) {
        this.EA(param0, param1, param2);
    }

    final void drawAffine(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        this.b(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    private final native int wa(long param0);

    NativeSoftwareSprite(NativeSoftwareToolkit param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.ua(param0, param1, param2, param3, param4, param5, param6);
    }

    private final native void P(long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    private final native void EA(NativeSoftwareToolkit param0, int param1, int param2);

    private final native int M(long param0);

    private final native void aa(long param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7);

    final int getPaddedWidth() {
        return this.wa(this.field_nativeid);
    }

    final void writePixels(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        this.aa(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6);
    }

    NativeSoftwareSprite(NativeSoftwareToolkit param0, int[] param1, byte[] param2, byte[] param3, int param4, int param5, int param6, int param7) {
        this.ma(param0, param1, param2, param3, param4, param5, param6, param7);
    }
}
