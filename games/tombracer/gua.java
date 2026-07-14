/*
 * Decompiled by CFR-JS 0.4.0.
 */
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;

final class gua {
    private jagdx.IDirect3DSurface field_a;
    private jagdx.IDirect3DSurface field_c;
    private jagdx.IDirect3DSwapChain field_b;

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 75) {
          L0: {
            ((gua) this).field_b = null;
            if (((gua) this).field_b == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((gua) this).field_b == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte param0, jagdx.IDirect3DSwapChain param1, jagdx.IDirect3DSurface param2) {
        ((gua) this).field_a = param2;
        if (param0 > -6) {
            return;
        }
        ((gua) this).field_b = param1;
        ((gua) this).field_c = ((gua) this).field_b.a(0, 0);
    }

    final void a(boolean param0) {
        jagdx.IDirect3DSurface stackIn_2_0 = null;
        jagdx.IDirect3DSurface stackIn_3_0 = null;
        jagdx.IDirect3DSurface stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        jagdx.IDirect3DSwapChain stackIn_12_0 = null;
        jagdx.IDirect3DSwapChain stackIn_13_0 = null;
        jagdx.IDirect3DSwapChain stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        jagdx.IDirect3DSwapChain stackIn_22_0 = null;
        jagdx.IDirect3DSwapChain stackIn_23_0 = null;
        jagdx.IDirect3DSwapChain stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        jagdx.IDirect3DSurface stackOut_1_0 = null;
        jagdx.IDirect3DSurface stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        jagdx.IDirect3DSurface stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        jagdx.IDirect3DSwapChain stackOut_21_0 = null;
        jagdx.IDirect3DSwapChain stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        jagdx.IDirect3DSwapChain stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        jagdx.IDirect3DSwapChain stackOut_11_0 = null;
        jagdx.IDirect3DSwapChain stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        jagdx.IDirect3DSwapChain stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          if (((gua) this).field_c == null) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = ((gua) this).field_c;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0) {
                stackOut_3_0 = (jagdx.IDirect3DSurface) (Object) stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = (jagdx.IDirect3DSurface) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((gua) this).field_c = null;
            break L0;
          }
        }
        if (!param0) {
          L2: {
            ((gua) this).field_c = null;
            if (null != ((gua) this).field_a) {
              ((gua) this).field_a = null;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null != ((gua) this).field_b) {
              L4: {
                stackOut_21_0 = ((gua) this).field_b;
                stackIn_23_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (param0) {
                  stackOut_23_0 = (jagdx.IDirect3DSwapChain) (Object) stackIn_23_0;
                  stackOut_23_1 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  break L4;
                } else {
                  stackOut_22_0 = (jagdx.IDirect3DSwapChain) (Object) stackIn_22_0;
                  stackOut_22_1 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  break L4;
                }
              }
              ((gua) this).field_b = null;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L5: {
            if (null != ((gua) this).field_a) {
              ((gua) this).field_a = null;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (null != ((gua) this).field_b) {
              L7: {
                stackOut_11_0 = ((gua) this).field_b;
                stackIn_13_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (param0) {
                  stackOut_13_0 = (jagdx.IDirect3DSwapChain) (Object) stackIn_13_0;
                  stackOut_13_1 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  break L7;
                } else {
                  stackOut_12_0 = (jagdx.IDirect3DSwapChain) (Object) stackIn_12_0;
                  stackOut_12_1 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  break L7;
                }
              }
              ((gua) this).field_b = null;
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
        return ((gua) this).field_b.Present(param0);
    }

    gua(jagdx.IDirect3DSwapChain param0, jagdx.IDirect3DSurface param1) {
        ((gua) this).a((byte) -14, param0, param1);
    }
}
