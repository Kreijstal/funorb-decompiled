/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public final class IDirect3DDevice extends jaclib.peer.IUnknown {
    private static float[] a;
    private jaclib.peer.qt b;

    private final native int _CreateVertexBuffer(int param0, int param1, int param2, int param3, jagdx.IDirect3DVertexBuffer param4);

    public final native int EndScene();

    public final native int DrawIndexedPrimitive(int param0, int param1, int param2, int param3, int param4, int param5);

    public final native int Clear(int param0, int param1, float param2, int param3);

    public final int a(int param0, float param1, float param2, float param3, float param4) {
        a[2] = param3;
        a[3] = param4;
        a[1] = param2;
        a[0] = param1;
        return this.SetPixelShaderConstantF(param0, a, 1);
    }

    public final native int _CreateCubeTexture(int param0, int param1, int param2, int param3, int param4, jagdx.IDirect3DCubeTexture param5);

    public final native int _CreatePixelShader(byte[] param0, jagdx.IDirect3DPixelShader param1);

    public final jagdx.IDirect3DVolumeTexture a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        jagdx.IDirect3DVolumeTexture var8 = null;
        int var9 = 0;
        var8 = new jagdx.IDirect3DVolumeTexture(this.b);
        var9 = this._CreateVolumeTexture(param0, param1, param2, param3, param4, param5, param6, var8);
        if (jagdx.gf.a(-1, var9)) {
          throw new jagdx.ie(String.valueOf(var9));
        } else {
          return var8;
        }
    }

    public final native int SetRenderState(int param0, int param1);

    public final native int SetTexture(int param0, jagdx.IDirect3DBaseTexture param1);

    public final native int _CreateTexture(int param0, int param1, int param2, int param3, int param4, int param5, jagdx.IDirect3DTexture param6);

    public final native int SetTransform(int param0, float[] param1);

    public final int b(int param0, float param1, float param2, float param3, float param4) {
        a[3] = param4;
        a[1] = param2;
        a[2] = param3;
        a[0] = param1;
        return this.SetVertexShaderConstantF(param0, a, 1);
    }

    public final jagdx.IDirect3DIndexBuffer a(int param0, int param1, int param2, int param3, jagdx.IDirect3DIndexBuffer param4) {
        int var6 = 0;
        L0: {
          if (param4 == null) {
            param4 = new jagdx.IDirect3DIndexBuffer(this.b);
            break L0;
          } else {
            break L0;
          }
        }
        var6 = this._CreateIndexBuffer(param0, param1, param2, param3, param4);
        if (jagdx.gf.a(-1, var6)) {
          throw new jagdx.ie(String.valueOf(var6));
        } else {
          return param4;
        }
    }

    public final native int Reset(jagdx.D3DPRESENT_PARAMETERS param0);

    public final native int SetVertexShaderConstantF(int param0, float[] param1, int param2);

    private final native int _CreateVertexDeclaration(jagdx.VertexElementCollection param0, jagdx.IDirect3DVertexDeclaration param1);

    public final jagdx.IDirect3DCubeTexture a(int param0, int param1, int param2, int param3, int param4) {
        jagdx.IDirect3DCubeTexture var6 = new jagdx.IDirect3DCubeTexture(this.b);
        int var7 = this._CreateCubeTexture(param0, param1, param2, param3, param4, var6);
        if (!(!jagdx.gf.a(-1, var7))) {
            throw new jagdx.ie(String.valueOf(var7));
        }
        return var6;
    }

    private final native int _GetRenderTarget(int param0, jagdx.IDirect3DSurface param1);

    public final native int SetTextureStageState(int param0, int param1, int param2);

    public final native int TestCooperativeLevel();

    private final native int SetRenderStatef(int param0, float param1);

    public final native int SetStreamSource(int param0, jagdx.IDirect3DVertexBuffer param1, int param2, int param3);

    public final int a(int param0, boolean param1) {
        return this.SetRenderStateb(param0, param1);
    }

    private final native int _CreateIndexBuffer(int param0, int param1, int param2, int param3, jagdx.IDirect3DIndexBuffer param4);

    public final native int SetPixelShaderConstantF(int param0, float[] param1, int param2);

    private final native int _CreateRenderTarget(int param0, int param1, int param2, int param3, int param4, boolean param5, jagdx.IDirect3DSurface param6);

    public final int a(int param0, float[] param1) {
        return this.SetVertexShaderConstantF(param0, param1, param1.length / 4);
    }

    public final native boolean LightEnable(int param0, boolean param1);

    public final native int _CreateVolumeTexture(int param0, int param1, int param2, int param3, int param4, int param5, int param6, jagdx.IDirect3DVolumeTexture param7);

    public final jagdx.IDirect3DSurface c(int param0) {
        jagdx.IDirect3DSurface var2 = null;
        int var3 = 0;
        var2 = new jagdx.IDirect3DSurface(this.b);
        var3 = this._GetRenderTarget(param0, var2);
        if (jagdx.gf.a(-1, var3)) {
          throw new jagdx.ie(String.valueOf(var3));
        } else {
          return var2;
        }
    }

    public final jagdx.IDirect3DVertexShader b(byte[] param0) {
        jagdx.IDirect3DVertexShader var2 = null;
        int var3 = 0;
        if (param0 != null) {
          var2 = new jagdx.IDirect3DVertexShader(this.b);
          var3 = this._CreateVertexShader(param0, var2);
          if (jagdx.gf.a(-1, var3)) {
            throw new jagdx.ie(String.valueOf(var3));
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    public final native int SetViewport(int param0, int param1, int param2, int param3, float param4, float param5);

    private final native int _CreateDepthStencilSurface(int param0, int param1, int param2, int param3, int param4, boolean param5, jagdx.IDirect3DSurface param6);

    public final jagdx.IDirect3DSurface b() {
        jagdx.IDirect3DSurface var1 = new jagdx.IDirect3DSurface(this.b);
        int var2 = this._GetDepthStencilSurface(var1);
        if (!(!jagdx.gf.a(-1, var2))) {
            throw new jagdx.ie(String.valueOf(var2));
        }
        return var1;
    }

    private final native int _GetSwapChain(int param0, jagdx.IDirect3DSwapChain param1);

    public final int a(int param0, float param1) {
        return this.SetRenderStatef(param0, param1);
    }

    public final native int SetPixelShader(jagdx.IDirect3DPixelShader param0);

    public final native int BeginScene();

    public final native int _CreateVertexShader(byte[] param0, jagdx.IDirect3DVertexShader param1);

    private final native int _GetDepthStencilSurface(jagdx.IDirect3DSurface param0);

    public final jagdx.IDirect3DSurface a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        jagdx.IDirect3DSurface var7 = null;
        int var8 = 0;
        var7 = new jagdx.IDirect3DSurface(this.b);
        var8 = this._CreateRenderTarget(param0, param1, param2, param3, param4, param5, var7);
        if (jagdx.gf.a(-1, var8)) {
          throw new jagdx.ie(String.valueOf(var8));
        } else {
          return var7;
        }
    }

    public final native int SetLight(int param0, jagdx.D3DLIGHT param1);

    public final native int SetVertexDeclaration(jagdx.IDirect3DVertexDeclaration param0);

    public final jagdx.IDirect3DTexture a(int param0, int param1, int param2, int param3, int param4, int param5) {
        jagdx.IDirect3DTexture var7 = new jagdx.IDirect3DTexture(this.b);
        int var8 = this._CreateTexture(param0, param1, param2, param3, param4, param5, var7);
        if (!(!jagdx.gf.a(-1, var8))) {
            throw new jagdx.ie(String.valueOf(var8));
        }
        return var7;
    }

    public final native int SetScissorRect(int param0, int param1, int param2, int param3);

    public final jagdx.IDirect3DSwapChain b(int param0) {
        jagdx.IDirect3DSwapChain var2 = new jagdx.IDirect3DSwapChain(this.b);
        int var3 = this._GetSwapChain(param0, var2);
        if (!(!jagdx.gf.a(-1, var3))) {
            throw new jagdx.ie(String.valueOf(var3));
        }
        return var2;
    }

    private final native int _CreateOffscreenPlainSurface(int param0, int param1, int param2, int param3, jagdx.IDirect3DSurface param4);

    private final native int SetRenderStateb(int param0, boolean param1);

    IDirect3DDevice(jaclib.peer.qt param0) {
        super(param0);
        this.b = param0;
    }

    public final native int SetIndices(jagdx.IDirect3DIndexBuffer param0);

    public final native int SetSamplerState(int param0, int param1, int param2);

    public final native int DrawPrimitive(int param0, int param1, int param2);

    public final jagdx.IDirect3DVertexBuffer a(int param0, int param1, int param2, int param3, jagdx.IDirect3DVertexBuffer param4) {
        int var6 = 0;
        L0: {
          if (param4 != null) {
            break L0;
          } else {
            param4 = new jagdx.IDirect3DVertexBuffer(this.b);
            break L0;
          }
        }
        var6 = this._CreateVertexBuffer(param0, param1, param2, param3, param4);
        if (jagdx.gf.a(-1, var6)) {
          throw new jagdx.ie(String.valueOf(var6));
        } else {
          return param4;
        }
    }

    public final native int StretchRect(jagdx.IDirect3DSurface param0, int param1, int param2, int param3, int param4, jagdx.IDirect3DSurface param5, int param6, int param7, int param8, int param9, int param10);

    public final native int SetFVF(int param0);

    public final jagdx.IDirect3DVertexDeclaration a(jagdx.VertexElementCollection param0, jagdx.IDirect3DVertexDeclaration param1) {
        int var3 = 0;
        L0: {
          if (param1 != null) {
            break L0;
          } else {
            param1 = new jagdx.IDirect3DVertexDeclaration(this.b);
            break L0;
          }
        }
        var3 = this._CreateVertexDeclaration(param0, param1);
        if (jagdx.gf.a(-1, var3)) {
          throw new jagdx.ie(String.valueOf(var3));
        } else {
          return param1;
        }
    }

    private final native int _GetBackBuffer(int param0, int param1, int param2, jagdx.IDirect3DSurface param3);

    public final native int SetVertexShader(jagdx.IDirect3DVertexShader param0);

    public final jagdx.IDirect3DPixelShader a(byte[] param0) {
        if (param0 == null) {
            return null;
        }
        jagdx.IDirect3DPixelShader var2 = new jagdx.IDirect3DPixelShader(this.b);
        int var3 = this._CreatePixelShader(param0, var2);
        if (!(!jagdx.gf.a(-1, var3))) {
            throw new jagdx.ie(String.valueOf(var3));
        }
        return var2;
    }

    static {
        a = new float[4];
    }
}
