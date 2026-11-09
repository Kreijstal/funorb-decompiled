/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXSwapChainSurface {
    private jagdx.IDirect3DSwapChain swapChain;
    private jagdx.IDirect3DSurface backbuffer;
    private jagdx.IDirect3DSurface surface;

    final int present(int flags, int guard) {
        if (guard > -14) {
          return -48;
        }
        return this.swapChain.Present(flags);
    }

    final void close(byte guard) {
        if (this.backbuffer != null) {
          this.backbuffer.release(-22671);
          this.backbuffer = null;
        }
        if (null != this.surface) {
          this.surface.release(-22671);
          this.surface = null;
        }
        if (guard != 71) {
          this.isValid(40);
        }
        if (this.swapChain != null) {
          this.swapChain.release(-22671);
          this.swapChain = null;
        }
    }

    final void attach(boolean guard, jagdx.IDirect3DSurface surface, jagdx.IDirect3DSwapChain chain) {
        if (!guard) {
          this.swapChain = chain;
          this.surface = surface;
          this.backbuffer = this.swapChain.a(0, 0);
          return;
        }
        jagdx.IDirect3DSwapChain var5 = (jagdx.IDirect3DSwapChain) null;
        this.attach(false, (jagdx.IDirect3DSurface) null, (jagdx.IDirect3DSwapChain) null);
        this.swapChain = chain;
        this.surface = surface;
        this.backbuffer = this.swapChain.a(0, 0);
    }

    final boolean isValid(int guard) {
        if (guard != -22169) {
          return true;
        }
        return null != this.swapChain ? true : false;
    }

    DirectXSwapChainSurface(jagdx.IDirect3DSwapChain chain, jagdx.IDirect3DSurface surface) {
        this.attach(false, surface, chain);
    }
}
