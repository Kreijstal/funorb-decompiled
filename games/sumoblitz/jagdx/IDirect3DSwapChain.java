/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3DSwapChain extends jaclib.peer.IUnknown {
    private jaclib.peer.pf a;

    public final native int Present(int param0);

    public final jagdx.IDirect3DSurface a(int param0, int param1) {
        jagdx.IDirect3DSurface var3 = null;
        int var4 = 0;
        var3 = new jagdx.IDirect3DSurface(this.a);
        var4 = this._GetBackBuffer(param0, param1, var3);
        if (jagdx.gv.a(var4, -1)) {
          throw new jagdx.fg(String.valueOf(var4));
        } else {
          return var3;
        }
    }

    private final native int _GetBackBuffer(int param0, int param1, jagdx.IDirect3DSurface param2);

    IDirect3DSwapChain(jaclib.peer.pf param0) {
        super(param0);
        this.a = param0;
    }
}
