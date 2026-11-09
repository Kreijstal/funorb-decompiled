/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class IDirect3D extends jaclib.peer.IUnknown {
    private jaclib.peer.PeerReferenceManager references;

    private final native int _GetDeviceCaps(int param0, int param1, jagdx.D3DCAPS param2);

    private final native int _GetAdapterDisplayMode(int param0, jagdx.D3DDISPLAYMODE param1);

    public final native int CheckDepthStencilMatch(int param0, int param1, int param2, int param3, int param4);

    private final native int _CreateDevice(int param0, int param1, java.awt.Canvas param2, int param3, jagdx.D3DPRESENT_PARAMETERS param4, jagdx.IDirect3DDevice param5);

    public final native int CheckDeviceMultiSampleType(int param0, int param1, int param2, boolean param3, int param4);

    private IDirect3D(jaclib.peer.PeerReferenceManager param0) {
        super(param0);
        this.references = param0;
    }

    private final native static int _Direct3DCreate(int param0, jagdx.IDirect3D param1);

    public final int getAdapterDisplayMode(int adapter, jagdx.D3DDISPLAYMODE displayMode) {
        return this._GetAdapterDisplayMode(adapter, displayMode);
    }

    public final static jagdx.IDirect3D createDirect3D(int version, jaclib.peer.PeerReferenceManager references) {
        jagdx.IDirect3D var2 = new jagdx.IDirect3D(references);
        int var3 = jagdx.IDirect3D._Direct3DCreate(version, var2);
        if (jagdx.HResult.failed(var3, -1)) {
          throw new jagdx.DirectXException(String.valueOf(var3));
        }
        return var2;
    }

    public final jagdx.D3DCAPS getDeviceCaps(int adapter, int deviceType) {
        jagdx.D3DCAPS var3 = new jagdx.D3DCAPS();
        int var4 = this._GetDeviceCaps(adapter, deviceType, var3);
        if (jagdx.HResult.failed(var4, -1)) {
          throw new jagdx.DirectXException(String.valueOf(var4));
        }
        return var3;
    }

    public final native int CheckDeviceFormat(int param0, int param1, int param2, int param3, int param4, int param5);

    public final jagdx.IDirect3DDevice createDevice(int adapter, int deviceType, java.awt.Canvas canvas, int flags, jagdx.D3DPRESENT_PARAMETERS parameters) {
        jagdx.IDirect3DDevice var6 = new jagdx.IDirect3DDevice(this.references);
        int var7 = this._CreateDevice(adapter, deviceType, canvas, flags, parameters, var6);
        if (!jagdx.HResult.failed(var7, -1)) {
          return var6;
        }
        throw new jagdx.DirectXException(String.valueOf(var7));
    }

    public final native int CheckDeviceType(int param0, int param1, int param2, int param3, boolean param4);
}
