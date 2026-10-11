/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gua {
    private jagdx.IDirect3DSurface field_a;
    private jagdx.IDirect3DSurface field_c;
    private jagdx.IDirect3DSwapChain field_b;

    final boolean a(byte param0) {
        if (param0 == 75) {
          return this.field_b != null ? true : false;
        }
        this.field_b = (jagdx.IDirect3DSwapChain) null;
        return this.field_b != null ? true : false;
    }

    final void a(byte param0, jagdx.IDirect3DSwapChain param1, jagdx.IDirect3DSurface param2) {
        this.field_a = param2;
        if (param0 > -6) {
          return;
        }
        this.field_b = param1;
        this.field_c = this.field_b.a(0, 0);
    }

    final void a(boolean param0) {
        jagdx.IDirect3DSurface stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        jagdx.IDirect3DSwapChain stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        jagdx.IDirect3DSwapChain stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        if (this.field_c != null) {
          stackIn_3_0 = this.field_c;
          stackIn_4_1 = (param0) ? false : true;
          ((jagdx.IDirect3DSurface) (Object) stackIn_3_0).a(stackIn_4_1);
          this.field_c = null;
        }
        if (param0) {
          if (null != this.field_a) {
            this.field_a.a(false);
            this.field_a = null;
          }
          if (null != this.field_b) {
            stackIn_13_0 = this.field_b;
            stackIn_14_1 = (param0) ? false : true;
            ((jagdx.IDirect3DSwapChain) (Object) stackIn_13_0).a(stackIn_14_1);
            this.field_b = null;
          }
        } else {
          this.field_c = (jagdx.IDirect3DSurface) null;
          if (null != this.field_a) {
            this.field_a.a(false);
            this.field_a = null;
          }
          if (null != this.field_b) {
            stackIn_23_0 = this.field_b;
            stackIn_24_1 = (param0) ? false : true;
            ((jagdx.IDirect3DSwapChain) (Object) stackIn_23_0).a(stackIn_24_1);
            this.field_b = null;
          }
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 0) {
          return 83;
        }
        return this.field_b.Present(param0);
    }

    gua(jagdx.IDirect3DSwapChain param0, jagdx.IDirect3DSurface param1) {
        this.a((byte) -14, param0, param1);
    }
}
