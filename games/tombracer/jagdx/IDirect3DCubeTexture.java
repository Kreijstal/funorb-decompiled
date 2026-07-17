/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3DCubeTexture extends jagdx.IDirect3DBaseTexture {
    public final native int LockRect(int param0, int param1, int param2, int param3, int param4, int param5, int param6, jagdx.PixelBuffer param7);

    public final native boolean UnlockRect(int param0, int param1);

    IDirect3DCubeTexture(jaclib.peer.sha param0) {
        super(param0);
    }
}
