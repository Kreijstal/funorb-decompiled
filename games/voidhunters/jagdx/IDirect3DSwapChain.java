/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3DSwapChain extends jaclib.peer.IUnknown {
    private jaclib.peer.tqb a;

    public final jagdx.IDirect3DSurface a(int param0, int param1) {
        jagdx.IDirect3DSurface var3 = new jagdx.IDirect3DSurface(this.a);
        int var4 = this._GetBackBuffer(param0, param1, var3);
        if (!(!jagdx.hea.a(var4, (byte) -116))) {
            throw new jagdx.nba(String.valueOf(var4));
        }
        return var3;
    }

    private final native int _GetBackBuffer(int param0, int param1, jagdx.IDirect3DSurface param2);

    IDirect3DSwapChain(jaclib.peer.tqb param0) {
        super(param0);
        this.a = param0;
    }

    public final native int Present(int param0);
}
