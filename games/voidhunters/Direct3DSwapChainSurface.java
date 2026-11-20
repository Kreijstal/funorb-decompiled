/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Direct3DSwapChainSurface {
    private jagdx.IDirect3DSurface backBuffer;
    private jagdx.IDirect3DSwapChain swapChain;
    private jagdx.IDirect3DSurface depthStencilSurface;

    final boolean isInitialized(byte param0) {
        int var2 = 120 / ((65 - param0) / 53);
        return this.swapChain != null ? true : false;
    }

    final void release(int param0) {
        if (this.backBuffer != null) {
          this.backBuffer.release(false);
          this.backBuffer = null;
        }
        if (null != this.depthStencilSurface) {
          this.depthStencilSurface.release(false);
          this.depthStencilSurface = null;
        }
        if (this.swapChain != null) {
          this.swapChain.release(false);
          this.swapChain = null;
        }
        if (param0 <= -36) {
          return;
        }
        this.depthStencilSurface = (jagdx.IDirect3DSurface) null;
    }

    final int present(boolean param0, int param1) {
        if (!param0) {
          return this.swapChain.Present(param1);
        }
        jagdx.IDirect3DSurface var4 = (jagdx.IDirect3DSurface) null;
        this.initialize(-87, (jagdx.IDirect3DSwapChain) null, (jagdx.IDirect3DSurface) null);
        return this.swapChain.Present(param1);
    }

    final void initialize(int param0, jagdx.IDirect3DSwapChain param1, jagdx.IDirect3DSurface param2) {
        this.swapChain = param1;
        this.depthStencilSurface = param2;
        this.backBuffer = this.swapChain.getBackBuffer(0, param0);
    }

    Direct3DSwapChainSurface(jagdx.IDirect3DSwapChain param0, jagdx.IDirect3DSurface param1) {
        this.initialize(0, param0, param1);
    }
}
