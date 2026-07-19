/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private jagdx.IDirect3DSwapChain field_b;
    private jagdx.IDirect3DSurface field_a;
    private jagdx.IDirect3DSurface field_c;

    final int a(int param0, int param1) {
        if (param1 > -14) {
            return -48;
        }
        return this.field_b.Present(param0);
    }

    final void a(byte param0) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        L0: {
          if (this.field_a != null) {
            this.field_a = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (null == this.field_c) {
          if (param0 != 71) {
            L1: {
              discarded$2 = this.a(40);
              if (this.field_b != null) {
                this.field_b = null;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (this.field_b != null) {
                this.field_b = null;
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          this.field_c = null;
          if (param0 == 71) {
            L3: {
              if (this.field_b != null) {
                this.field_b = null;
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              discarded$3 = this.a(40);
              if (this.field_b != null) {
                this.field_b = null;
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        }
    }

    final void a(boolean param0, jagdx.IDirect3DSurface param1, jagdx.IDirect3DSwapChain param2) {
        jagdx.IDirect3DSwapChain var5 = null;
        if (param0) {
          var5 = (jagdx.IDirect3DSwapChain) null;
          this.a(false, (jagdx.IDirect3DSurface) null, (jagdx.IDirect3DSwapChain) null);
          this.field_b = param2;
          this.field_c = param1;
          this.field_a = this.field_b.a(0, 0);
          return;
        } else {
          this.field_b = param2;
          this.field_c = param1;
          this.field_a = this.field_b.a(0, 0);
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 != -22169) {
            return true;
        }
        return null != this.field_b ? true : false;
    }

    kg(jagdx.IDirect3DSwapChain param0, jagdx.IDirect3DSurface param1) {
        this.a(false, param1, param0);
    }
}
