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
        if (this.field_c != null) {
          this.field_c.a(false);
          this.field_c = null;
        }
        if (null != this.field_b) {
          this.field_b.a(false);
          this.field_b = null;
        }
        if (this.field_a != null) {
          this.field_a.a(false);
          this.field_a = null;
        }
        if (param0 <= -36) {
          return;
        }
        this.field_b = (jagdx.IDirect3DSurface) null;
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
          return this.field_a.Present(param1);
        }
        jagdx.IDirect3DSurface var4 = (jagdx.IDirect3DSurface) null;
        this.a(-87, (jagdx.IDirect3DSwapChain) null, (jagdx.IDirect3DSurface) null);
        return this.field_a.Present(param1);
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
