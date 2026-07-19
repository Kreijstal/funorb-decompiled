/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gma {
    private jagdx.IDirect3DSurface field_c;
    private jagdx.IDirect3DSwapChain field_a;
    private jagdx.IDirect3DSurface field_b;

    final boolean a(byte param0) {
        int var2 = 120 / ((65 - param0) / 53);
        return this.field_a != null ? true : false;
    }

    final void a(int param0) {
        L0: {
          if (this.field_c != null) {
            this.field_c = null;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (null != this.field_b) {
            this.field_b = null;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (this.field_a != null) {
            this.field_a = null;
            break L2;
          } else {
            break L2;
          }
        }
        if (param0 > -36) {
          this.field_b = (jagdx.IDirect3DSurface) null;
          return;
        } else {
          return;
        }
    }

    final int a(boolean param0, int param1) {
        jagdx.IDirect3DSurface var4 = null;
        if (param0) {
          var4 = (jagdx.IDirect3DSurface) null;
          this.a(-87, (jagdx.IDirect3DSwapChain) null, (jagdx.IDirect3DSurface) null);
          return this.field_a.Present(param1);
        } else {
          return this.field_a.Present(param1);
        }
    }

    final void a(int param0, jagdx.IDirect3DSwapChain param1, jagdx.IDirect3DSurface param2) {
        this.field_a = param1;
        this.field_b = param2;
        this.field_c = this.field_a.a(0, param0);
    }

    gma(jagdx.IDirect3DSwapChain param0, jagdx.IDirect3DSurface param1) {
        this.a(0, param0, param1);
    }
}
