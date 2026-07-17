/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3DIndexBuffer extends jaclib.peer.IUnknown {
    private final native boolean _Update(long param0, int param1, int param2);

    protected final long a() {
        return super.a();
    }

    IDirect3DIndexBuffer(jaclib.peer.sha param0) {
        super(param0);
    }

    public final native int Lock(int param0, int param1, int param2, jagdx.GeometryBuffer param3);

    public final native int Unlock();
}
