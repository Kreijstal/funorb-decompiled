/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gua {
    private jagdx.IDirect3DSurface field_a;
    private jagdx.IDirect3DSurface field_c;
    private jagdx.IDirect3DSwapChain field_b;

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 75) {
          L0: {
            this.field_b = (jagdx.IDirect3DSwapChain) null;
            if (this.field_b == null) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_b == null) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
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
        jagdx.IDirect3DSurface stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        jagdx.IDirect3DSwapChain stackIn_13_0 = null;
        jagdx.IDirect3DSwapChain stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        jagdx.IDirect3DSwapChain stackIn_23_0 = null;
        jagdx.IDirect3DSwapChain stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        L0: {
          if (this.field_c == null) {
            break L0;
          } else {
            L1: {
              stackIn_3_0 = this.field_c;

              if (param0) {
                stackIn_4_0 = (jagdx.IDirect3DSurface) ((Object) stackIn_3_0);
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = (jagdx.IDirect3DSurface) ((Object) stackIn_3_0);
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((jagdx.IDirect3DSurface) (Object) stackIn_4_0).a(stackIn_4_1 != 0);
            this.field_c = null;
            break L0;
          }
        }
        if (!param0) {
          L2: {
            this.field_c = (jagdx.IDirect3DSurface) null;
            if (null != this.field_a) {
              this.field_a.a(false);
              this.field_a = null;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null != this.field_b) {
              L4: {
                stackIn_23_0 = this.field_b;

                if (param0) {
                  stackIn_24_0 = (jagdx.IDirect3DSwapChain) ((Object) stackIn_23_0);
                  stackIn_24_1 = 0;
                  break L4;
                } else {
                  stackIn_24_0 = (jagdx.IDirect3DSwapChain) ((Object) stackIn_23_0);
                  stackIn_24_1 = 1;
                  break L4;
                }
              }
              ((jagdx.IDirect3DSwapChain) (Object) stackIn_24_0).a(stackIn_24_1 != 0);
              this.field_b = null;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L5: {
            if (null != this.field_a) {
              this.field_a.a(false);
              this.field_a = null;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (null != this.field_b) {
              L7: {
                stackIn_13_0 = this.field_b;

                if (param0) {
                  stackIn_14_0 = (jagdx.IDirect3DSwapChain) ((Object) stackIn_13_0);
                  stackIn_14_1 = 0;
                  break L7;
                } else {
                  stackIn_14_0 = (jagdx.IDirect3DSwapChain) ((Object) stackIn_13_0);
                  stackIn_14_1 = 1;
                  break L7;
                }
              }
              ((jagdx.IDirect3DSwapChain) (Object) stackIn_14_0).a(stackIn_14_1 != 0);
              this.field_b = null;
              break L6;
            } else {
              break L6;
            }
          }
          return;
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
