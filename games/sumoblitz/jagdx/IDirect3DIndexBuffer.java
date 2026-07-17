/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3DIndexBuffer extends jaclib.peer.IUnknown {
    public final native int Unlock();

    private final native boolean _Update(long param0, int param1, int param2);

    public final native int Lock(int param0, int param1, int param2, jagdx.GeometryBuffer param3);

    protected final long a() {
        return super.a();
    }

    IDirect3DIndexBuffer(jaclib.peer.pf param0) {
        super(param0);
    }
}
