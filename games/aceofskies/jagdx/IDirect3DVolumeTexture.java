/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3DVolumeTexture extends jagdx.IDirect3DBaseTexture {
    public final native int LockBox(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, jagdx.PixelBuffer param8);

    IDirect3DVolumeTexture(jaclib.peer.qt param0) {
        super(param0);
    }

    public final native boolean UnlockBox(int param0);
}
