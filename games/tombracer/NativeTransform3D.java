/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeTransform3D extends Transform3D implements e {
    long field_nativeid;

    private final native void P(long param0, int param1, int param2, int param3, int param4, int param5, int param6);

    final void rotateX(int param0) {
        this.J(this.field_nativeid, param0);
    }

    public final void w(boolean param0) {
        this.AA(this.field_nativeid, param0);
    }

    private final native void la();

    private final native void m(long param0, int param1);

    private final native void za(long param0, int param1);

    final void setIdentity() {
        this.u(this.field_nativeid);
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          ho.a(-1, (e) (this));
        }
    }

    private final native void AA(long param0, boolean param1);

    final void rotateZ(int param0) {
        this.za(this.field_nativeid, param0);
    }

    private final native void J(long param0, int param1);

    private final native void a(long param0, int param1, int param2, int param3);

    private final native void u(long param0);

    final void rotateY(int param0) {
        this.m(this.field_nativeid, param0);
    }

    final void setCamera(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.P(this.field_nativeid, param0, param1, param2, param3, param4, param5);
    }

    final void translate(int param0, int param1, int param2) {
        this.a(this.field_nativeid, param0, param1, param2);
    }

    NativeTransform3D() {
        this.la();
    }
}
