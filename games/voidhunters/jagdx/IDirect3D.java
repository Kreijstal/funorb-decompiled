/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3D extends jaclib.peer.IUnknown {
    private jaclib.peer.PeerReferenceManager a;

    public final jagdx.IDirect3DDevice createDevice(int param0, int param1, java.awt.Canvas param2, int param3, jagdx.D3DPRESENT_PARAMETERS param4) {
        jagdx.IDirect3DDevice var6 = new jagdx.IDirect3DDevice(this.a);
        int var7 = this._CreateDevice(param0, param1, param2, param3, param4, var6);
        if (!jagdx.HResult.failed(var7, (byte) -121)) {
          return var6;
        }
        throw new jagdx.Direct3DException(String.valueOf(var7));
    }

    public final static jagdx.IDirect3D createDirect3D(int param0, jaclib.peer.PeerReferenceManager param1) {
        jagdx.IDirect3D var2 = new jagdx.IDirect3D(param1);
        int var3 = jagdx.IDirect3D._Direct3DCreate(param0, var2);
        if (!jagdx.HResult.failed(var3, (byte) 11)) {
          return var2;
        }
        throw new jagdx.Direct3DException(String.valueOf(var3));
    }

    public final native int CheckDeviceMultiSampleType(int param0, int param1, int param2, boolean param3, int param4);

    private final native int _GetDeviceCaps(int param0, int param1, jagdx.D3DCAPS param2);

    private IDirect3D(jaclib.peer.PeerReferenceManager param0) {
        super(param0);
        this.a = param0;
    }

    public final native int CheckDeviceType(int param0, int param1, int param2, int param3, boolean param4);

    private final native int _GetAdapterDisplayMode(int param0, jagdx.D3DDISPLAYMODE param1);

    public final int getAdapterDisplayMode(int param0, jagdx.D3DDISPLAYMODE param1) {
        return this._GetAdapterDisplayMode(param0, param1);
    }

    public final native int CheckDeviceFormat(int param0, int param1, int param2, int param3, int param4, int param5);

    private final native int _CreateDevice(int param0, int param1, java.awt.Canvas param2, int param3, jagdx.D3DPRESENT_PARAMETERS param4, jagdx.IDirect3DDevice param5);

    private final native static int _Direct3DCreate(int param0, jagdx.IDirect3D param1);

    public final native int CheckDepthStencilMatch(int param0, int param1, int param2, int param3, int param4);

    public final jagdx.D3DCAPS getDeviceCaps(int param0, int param1) {
        jagdx.D3DCAPS var3 = new jagdx.D3DCAPS();
        int var4 = this._GetDeviceCaps(param0, param1, var3);
        if (jagdx.HResult.failed(var4, (byte) -126)) {
          throw new jagdx.Direct3DException(String.valueOf(var4));
        }
        return var3;
    }
}
