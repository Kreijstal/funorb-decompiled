/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3D extends jaclib.peer.IUnknown {
    private jaclib.peer.sha a;

    private final native int _GetAdapterDisplayMode(int param0, jagdx.D3DDISPLAYMODE param1);

    public final native int CheckDeviceFormat(int param0, int param1, int param2, int param3, int param4, int param5);

    private final native static int _Direct3DCreate(int param0, jagdx.IDirect3D param1);

    public final static jagdx.IDirect3D a(int param0, jaclib.peer.sha param1) {
        jagdx.IDirect3D var2 = null;
        int var3 = 0;
        var2 = new jagdx.IDirect3D(param1);
        var3 = IDirect3D._Direct3DCreate(param0, var2);
        if (jagdx.ah.a(var3, 10643)) {
          throw new jagdx.eva(String.valueOf(var3));
        } else {
          return var2;
        }
    }

    private final native int _CreateDevice(int param0, int param1, java.awt.Canvas param2, int param3, jagdx.D3DPRESENT_PARAMETERS param4, jagdx.IDirect3DDevice param5);

    public final jagdx.D3DCAPS a(int param0, int param1) {
        jagdx.D3DCAPS var3 = null;
        int var4 = 0;
        var3 = new jagdx.D3DCAPS();
        var4 = this._GetDeviceCaps(param0, param1, var3);
        if (jagdx.ah.a(var4, 10643)) {
          throw new jagdx.eva(String.valueOf(var4));
        } else {
          return var3;
        }
    }

    public final native int CheckDeviceType(int param0, int param1, int param2, int param3, boolean param4);

    private final native int _GetDeviceCaps(int param0, int param1, jagdx.D3DCAPS param2);

    private IDirect3D(jaclib.peer.sha param0) {
        super(param0);
        ((jagdx.IDirect3D) this).a = param0;
    }

    public final native int CheckDepthStencilMatch(int param0, int param1, int param2, int param3, int param4);

    public final native int CheckDeviceMultiSampleType(int param0, int param1, int param2, boolean param3, int param4);

    public final int a(int param0, jagdx.D3DDISPLAYMODE param1) {
        return this._GetAdapterDisplayMode(param0, param1);
    }

    public final jagdx.IDirect3DDevice a(int param0, int param1, java.awt.Canvas param2, int param3, jagdx.D3DPRESENT_PARAMETERS param4) {
        jagdx.IDirect3DDevice var6 = new jagdx.IDirect3DDevice(((jagdx.IDirect3D) this).a);
        int var7 = this._CreateDevice(param0, param1, param2, param3, param4, var6);
        if (!(!jagdx.ah.a(var7, 10643))) {
            throw new jagdx.eva(String.valueOf(var7));
        }
        return var6;
    }
}
