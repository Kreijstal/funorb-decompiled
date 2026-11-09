/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public final class IDirect3DDevice extends jaclib.peer.IUnknown {
    private static float[] constantVector;
    private jaclib.peer.PeerReferenceManager references;

    public final int setRenderState(int state, boolean enabled) {
        return this.SetRenderStateb(state, enabled);
    }

    public final int setVertexShaderConstants(int startRegister, float[] values) {
        return this.SetVertexShaderConstantF(startRegister, values, values.length / 4);
    }

    private final native int _CreateIndexBuffer(int param0, int param1, int param2, int param3, jagdx.IDirect3DIndexBuffer param4);

    private final native int _CreateDepthStencilSurface(int param0, int param1, int param2, int param3, int param4, boolean param5, jagdx.IDirect3DSurface param6);

    public final jagdx.IDirect3DVertexDeclaration createVertexDeclaration(jagdx.VertexElementCollection elements, jagdx.IDirect3DVertexDeclaration declaration) {
        if (declaration != null) {
          declaration.release(-22671);
        } else {
          declaration = new jagdx.IDirect3DVertexDeclaration(this.references);
        }
        int var3 = this._CreateVertexDeclaration(elements, declaration);
        if (!jagdx.HResult.failed(var3, -1)) {
          return declaration;
        }
        throw new jagdx.DirectXException(String.valueOf(var3));
    }

    public final int setPixelShaderConstant(int register, float x, float y, float z, float w) {
        constantVector[3] = w;
        constantVector[1] = y;
        constantVector[0] = x;
        constantVector[2] = z;
        return this.SetPixelShaderConstantF(register, constantVector, 1);
    }

    public final native int SetPixelShader(jagdx.IDirect3DPixelShader param0);

    public final jagdx.IDirect3DVertexShader createVertexShader(byte[] bytecode) {
        if (bytecode == null) {
          return null;
        }
        jagdx.IDirect3DVertexShader var2 = new jagdx.IDirect3DVertexShader(this.references);
        int var3 = this._CreateVertexShader(bytecode, var2);
        if (jagdx.HResult.failed(var3, -1)) {
          throw new jagdx.DirectXException(String.valueOf(var3));
        }
        return var2;
    }

    public final native int SetVertexDeclaration(jagdx.IDirect3DVertexDeclaration param0);

    public final native int SetTransform(int param0, float[] param1);

    public final native int SetScissorRect(int param0, int param1, int param2, int param3);

    public final jagdx.IDirect3DVertexBuffer createVertexBuffer(int param0, int param1, int param2, int param3, jagdx.IDirect3DVertexBuffer param4) {
        if (param4 == null) {
          param4 = new jagdx.IDirect3DVertexBuffer(this.references);
        } else {
          param4.release(-22671);
        }
        int var6 = this._CreateVertexBuffer(param0, param1, param2, param3, param4);
        if (jagdx.HResult.failed(var6, -1)) {
          throw new jagdx.DirectXException(String.valueOf(var6));
        }
        return param4;
    }

    public final native int Clear(int param0, int param1, float param2, int param3);

    public final native int _CreateVolumeTexture(int param0, int param1, int param2, int param3, int param4, int param5, int param6, jagdx.IDirect3DVolumeTexture param7);

    public final jagdx.IDirect3DPixelShader createPixelShader(byte[] bytecode) {
        if (bytecode == null) {
          return null;
        }
        jagdx.IDirect3DPixelShader var2 = new jagdx.IDirect3DPixelShader(this.references);
        int var3 = this._CreatePixelShader(bytecode, var2);
        if (!jagdx.HResult.failed(var3, -1)) {
          return var2;
        }
        throw new jagdx.DirectXException(String.valueOf(var3));
    }

    public final native int SetPixelShaderConstantF(int param0, float[] param1, int param2);

    public final native int _CreateCubeTexture(int param0, int param1, int param2, int param3, int param4, jagdx.IDirect3DCubeTexture param5);

    public final native int SetViewport(int param0, int param1, int param2, int param3, float param4, float param5);

    public final jagdx.IDirect3DVolumeTexture createVolumeTexture(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        jagdx.IDirect3DVolumeTexture var8 = new jagdx.IDirect3DVolumeTexture(this.references);
        int var9 = this._CreateVolumeTexture(param0, param1, param2, param3, param4, param5, param6, var8);
        if (!jagdx.HResult.failed(var9, -1)) {
          return var8;
        }
        throw new jagdx.DirectXException(String.valueOf(var9));
    }

    private final native int _CreateRenderTarget(int param0, int param1, int param2, int param3, int param4, boolean param5, jagdx.IDirect3DSurface param6);

    IDirect3DDevice(jaclib.peer.PeerReferenceManager param0) {
        super(param0);
        this.references = param0;
    }

    public final jagdx.IDirect3DSurface createRenderTarget(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        jagdx.IDirect3DSurface var7 = new jagdx.IDirect3DSurface(this.references);
        int var8 = this._CreateRenderTarget(param0, param1, param2, param3, param4, param5, var7);
        if (!jagdx.HResult.failed(var8, -1)) {
          return var7;
        }
        throw new jagdx.DirectXException(String.valueOf(var8));
    }

    private final native int _CreateVertexDeclaration(jagdx.VertexElementCollection param0, jagdx.IDirect3DVertexDeclaration param1);

    public final native int EndScene();

    public final native int DrawIndexedPrimitive(int param0, int param1, int param2, int param3, int param4, int param5);

    public final native int _CreatePixelShader(byte[] param0, jagdx.IDirect3DPixelShader param1);

    private final native int _GetRenderTarget(int param0, jagdx.IDirect3DSurface param1);

    public final native int SetVertexShaderConstantF(int param0, float[] param1, int param2);

    public final native int SetTextureStageState(int param0, int param1, int param2);

    public final native int DrawPrimitive(int param0, int param1, int param2);

    public final native int _CreateVertexShader(byte[] param0, jagdx.IDirect3DVertexShader param1);

    private final native int _CreateVertexBuffer(int param0, int param1, int param2, int param3, jagdx.IDirect3DVertexBuffer param4);

    public final int setVertexShaderConstant(int register, float x, float y, float z, float w) {
        constantVector[2] = z;
        constantVector[1] = y;
        constantVector[0] = x;
        constantVector[3] = w;
        return this.SetVertexShaderConstantF(register, constantVector, 1);
    }

    public final int setRenderState(int state, float value) {
        return this.SetRenderStatef(state, value);
    }

    public final native int Reset(jagdx.D3DPRESENT_PARAMETERS param0);

    private final native int _GetDepthStencilSurface(jagdx.IDirect3DSurface param0);

    public final jagdx.IDirect3DSurface getDepthStencilSurface() {
        jagdx.IDirect3DSurface var1 = new jagdx.IDirect3DSurface(this.references);
        int var2 = this._GetDepthStencilSurface(var1);
        if (!jagdx.HResult.failed(var2, -1)) {
          return var1;
        }
        throw new jagdx.DirectXException(String.valueOf(var2));
    }

    public final jagdx.IDirect3DSwapChain getSwapChain(int index) {
        jagdx.IDirect3DSwapChain var2 = new jagdx.IDirect3DSwapChain(this.references);
        int var3 = this._GetSwapChain(index, var2);
        if (jagdx.HResult.failed(var3, -1)) {
          throw new jagdx.DirectXException(String.valueOf(var3));
        }
        return var2;
    }

    public final native int SetTexture(int param0, jagdx.IDirect3DBaseTexture param1);

    public final native int SetRenderState(int param0, int param1);

    private final native int SetRenderStatef(int param0, float param1);

    private final native int _CreateOffscreenPlainSurface(int param0, int param1, int param2, int param3, jagdx.IDirect3DSurface param4);

    private final native int _GetBackBuffer(int param0, int param1, int param2, jagdx.IDirect3DSurface param3);

    public final native int SetFVF(int param0);

    public final native int SetLight(int param0, jagdx.D3DLIGHT param1);

    public final native boolean LightEnable(int param0, boolean param1);

    public final jagdx.IDirect3DCubeTexture createCubeTexture(int param0, int param1, int param2, int param3, int param4) {
        jagdx.IDirect3DCubeTexture var6 = new jagdx.IDirect3DCubeTexture(this.references);
        int var7 = this._CreateCubeTexture(param0, param1, param2, param3, param4, var6);
        if (!jagdx.HResult.failed(var7, -1)) {
          return var6;
        }
        throw new jagdx.DirectXException(String.valueOf(var7));
    }

    public final native int SetStreamSource(int param0, jagdx.IDirect3DVertexBuffer param1, int param2, int param3);

    public final native int StretchRect(jagdx.IDirect3DSurface param0, int param1, int param2, int param3, int param4, jagdx.IDirect3DSurface param5, int param6, int param7, int param8, int param9, int param10);

    public final native int SetVertexShader(jagdx.IDirect3DVertexShader param0);

    public final native int _CreateTexture(int param0, int param1, int param2, int param3, int param4, int param5, jagdx.IDirect3DTexture param6);

    private final native int SetRenderStateb(int param0, boolean param1);

    public final native int SetSamplerState(int param0, int param1, int param2);

    public final jagdx.IDirect3DSurface getRenderTarget(int index) {
        jagdx.IDirect3DSurface var2 = new jagdx.IDirect3DSurface(this.references);
        int var3 = this._GetRenderTarget(index, var2);
        if (!jagdx.HResult.failed(var3, -1)) {
          return var2;
        }
        throw new jagdx.DirectXException(String.valueOf(var3));
    }

    private final native int _GetSwapChain(int param0, jagdx.IDirect3DSwapChain param1);

    public final native int BeginScene();

    public final jagdx.IDirect3DTexture createTexture(int param0, int param1, int param2, int param3, int param4, int param5) {
        jagdx.IDirect3DTexture var7 = new jagdx.IDirect3DTexture(this.references);
        int var8 = this._CreateTexture(param0, param1, param2, param3, param4, param5, var7);
        if (jagdx.HResult.failed(var8, -1)) {
          throw new jagdx.DirectXException(String.valueOf(var8));
        }
        return var7;
    }

    public final native int SetIndices(jagdx.IDirect3DIndexBuffer param0);

    public final native int TestCooperativeLevel();

    public final jagdx.IDirect3DIndexBuffer createIndexBuffer(int param0, int param1, int param2, int param3, jagdx.IDirect3DIndexBuffer param4) {
        if (param4 != null) {
          param4.release(-22671);
        } else {
          param4 = new jagdx.IDirect3DIndexBuffer(this.references);
        }
        int var6 = this._CreateIndexBuffer(param0, param1, param2, param3, param4);
        if (jagdx.HResult.failed(var6, -1)) {
          throw new jagdx.DirectXException(String.valueOf(var6));
        }
        return param4;
    }

    static {
        constantVector = new float[4];
    }
}
