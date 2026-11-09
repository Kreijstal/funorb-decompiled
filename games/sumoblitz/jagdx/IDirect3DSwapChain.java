/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3DSwapChain extends jaclib.peer.IUnknown {
    private jaclib.peer.PeerReferenceManager references;

    public final native int Present(int param0);

    public final jagdx.IDirect3DSurface getBackBuffer(int index, int type) {
        jagdx.IDirect3DSurface var3 = new jagdx.IDirect3DSurface(this.references);
        int var4 = this._GetBackBuffer(index, type, var3);
        if (!jagdx.HResult.failed(var4, -1)) {
          return var3;
        }
        throw new jagdx.DirectXException(String.valueOf(var4));
    }

    private final native int _GetBackBuffer(int param0, int param1, jagdx.IDirect3DSurface param2);

    IDirect3DSwapChain(jaclib.peer.PeerReferenceManager param0) {
        super(param0);
        this.references = param0;
    }
}
