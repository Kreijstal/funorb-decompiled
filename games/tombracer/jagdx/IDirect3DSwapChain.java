/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3DSwapChain extends jaclib.peer.IUnknown {
    private jaclib.peer.PeerReferenceManager a;

    IDirect3DSwapChain(jaclib.peer.PeerReferenceManager param0) {
        super(param0);
        this.a = param0;
    }

    public final jagdx.IDirect3DSurface getBackBuffer(int param0, int param1) {
        jagdx.IDirect3DSurface var3 = new jagdx.IDirect3DSurface(this.a);
        int var4 = this._GetBackBuffer(param0, param1, var3);
        if (!jagdx.Direct3DResult.failed(var4, 10643)) {
          return var3;
        }
        throw new jagdx.Direct3DException(String.valueOf(var4));
    }

    private final native int _GetBackBuffer(int param0, int param1, jagdx.IDirect3DSurface param2);

    public final native int Present(int param0);
}
