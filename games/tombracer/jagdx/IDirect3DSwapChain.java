/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3DSwapChain extends jaclib.peer.IUnknown {
    private jaclib.peer.sha a;

    IDirect3DSwapChain(jaclib.peer.sha param0) {
        super(param0);
        this.a = param0;
    }

    public final jagdx.IDirect3DSurface a(int param0, int param1) {
        jagdx.IDirect3DSurface var3 = null;
        int var4 = 0;
        var3 = new jagdx.IDirect3DSurface(this.a);
        var4 = this._GetBackBuffer(param0, param1, var3);
        if (jagdx.ah.a(var4, 10643)) {
          throw new jagdx.eva(String.valueOf(var4));
        } else {
          return var3;
        }
    }

    private final native int _GetBackBuffer(int param0, int param1, jagdx.IDirect3DSurface param2);

    public final native int Present(int param0);
}
