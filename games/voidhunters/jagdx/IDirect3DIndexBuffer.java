/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3DIndexBuffer extends jaclib.peer.IUnknown {
    private final native boolean _Update(long param0, int param1, int param2);

    IDirect3DIndexBuffer(jaclib.peer.tqb param0) {
        super(param0);
    }

    public final native int Unlock();

    protected final long a() {
        return super.a();
    }

    public final native int Lock(int param0, int param1, int param2, jagdx.GeometryBuffer param3);
}
