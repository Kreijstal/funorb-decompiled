/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3DSurface extends jaclib.peer.IUnknown {
    public final native int LockRect(int param0, int param1, int param2, int param3, int param4, jagdx.PixelBuffer param5);

    IDirect3DSurface(jaclib.peer.qt param0) {
        super(param0);
    }

    public final native boolean UnlockRect();
}
