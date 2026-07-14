/*
 * Decompiled by CFR-JS 0.4.0.
 */
import jagdx.IDirect3DVertexBuffer;

final class ap implements pv {
    private boolean field_d;
    private byte field_e;
    private ir field_c;
    jagdx.IDirect3DVertexBuffer field_b;
    private int field_a;
    private int field_g;
    private boolean field_f;

    public final jaclib.memory.Buffer a(int param0, boolean param1) {
        jagdx.IDirect3DVertexBuffer stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        jagdx.IDirect3DVertexBuffer stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        jagdx.IDirect3DVertexBuffer stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        jagdx.IDirect3DVertexBuffer stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        jagdx.IDirect3DVertexBuffer stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        jagdx.IDirect3DVertexBuffer stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        jagdx.IDirect3DVertexBuffer stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        if (null != ((ap) this).field_b) {
          if (param0 == 7454) {
            param1 = param1 & ((ap) this).field_f;
            if (!((ap) this).field_d) {
              L0: {
                stackOut_14_0 = ((ap) this).field_b;
                stackOut_14_1 = 0;
                stackOut_14_2 = ((ap) this).field_g;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                if (!param1) {
                  stackOut_16_0 = (jagdx.IDirect3DVertexBuffer) (Object) stackIn_16_0;
                  stackOut_16_1 = stackIn_16_1;
                  stackOut_16_2 = stackIn_16_2;
                  stackOut_16_3 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  stackIn_17_3 = stackOut_16_3;
                  break L0;
                } else {
                  stackOut_15_0 = (jagdx.IDirect3DVertexBuffer) (Object) stackIn_15_0;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = stackIn_15_2;
                  stackOut_15_3 = 8192;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_17_3 = stackOut_15_3;
                  break L0;
                }
              }
              if (!jagdx.gv.b(((jagdx.IDirect3DVertexBuffer) (Object) stackIn_17_0).Lock(stackIn_17_1, stackIn_17_2, stackIn_17_3, ((ap) this).field_c.field_Yc), param0 ^ -7499)) {
                return null;
              } else {
                ((ap) this).field_d = true;
                return (jaclib.memory.Buffer) (Object) ((ap) this).field_c.field_Yc;
              }
            } else {
              return null;
            }
          } else {
            int discarded$2 = ((ap) this).c(-80);
            param1 = param1 & ((ap) this).field_f;
            if (!((ap) this).field_d) {
              L1: {
                stackOut_5_0 = ((ap) this).field_b;
                stackOut_5_1 = 0;
                stackOut_5_2 = ((ap) this).field_g;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                if (!param1) {
                  stackOut_7_0 = (jagdx.IDirect3DVertexBuffer) (Object) stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  break L1;
                } else {
                  stackOut_6_0 = (jagdx.IDirect3DVertexBuffer) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = 8192;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_8_3 = stackOut_6_3;
                  break L1;
                }
              }
              if (!jagdx.gv.b(((jagdx.IDirect3DVertexBuffer) (Object) stackIn_8_0).Lock(stackIn_8_1, stackIn_8_2, stackIn_8_3, ((ap) this).field_c.field_Yc), param0 ^ -7499)) {
                return null;
              } else {
                ((ap) this).field_d = true;
                return (jaclib.memory.Buffer) (Object) ((ap) this).field_c.field_Yc;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public final boolean a(int param0) {
        if (param0 == 22957) {
          if (((ap) this).field_d) {
            if (!jagdx.gv.b(((ap) this).field_b.Unlock(), -98)) {
              return false;
            } else {
              ((ap) this).field_d = false;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public final void b(int param0) {
        if (null == ((ap) this).field_b) {
          ((ap) this).field_a = 0;
          ((ap) this).field_g = 0;
          if (param0 != 12001) {
            ((ap) this).field_g = 82;
            return;
          } else {
            return;
          }
        } else {
          ((ap) this).field_b = null;
          ((ap) this).field_a = 0;
          ((ap) this).field_g = 0;
          if (param0 == 12001) {
            return;
          } else {
            ((ap) this).field_g = 82;
            return;
          }
        }
    }

    public final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        if (param1 == -35) {
          ((ap) this).field_e = (byte)param0;
          ((ap) this).field_a = param2;
          if (((ap) this).field_a > ((ap) this).field_g) {
            L0: {
              var5 = 8;
              if (!((ap) this).field_f) {
                var4 = 1;
                break L0;
              } else {
                var4 = 0;
                var5 = var5 | 512;
                break L0;
              }
            }
            if (((ap) this).field_b != null) {
              L1: {
                ((ap) this).field_b = ((ap) this).field_c.field_Cc.a(((ap) this).field_a, var5, 0, var4, ((ap) this).field_b);
                ((ap) this).field_g = ((ap) this).field_a;
                if (((ap) this).field_b == null) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L1;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L1;
                }
              }
              return stackIn_15_0 != 0;
            } else {
              L2: {
                ((ap) this).field_b = ((ap) this).field_c.field_Cc.a(((ap) this).field_a, var5, 0, var4, ((ap) this).field_b);
                ((ap) this).field_g = ((ap) this).field_a;
                if (((ap) this).field_b == null) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                }
              }
              return stackIn_11_0 != 0;
            }
          } else {
            L3: {
              if (((ap) this).field_b == null) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L3;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L3;
              }
            }
            return stackIn_20_0 != 0;
          }
        } else {
          return true;
        }
    }

    final int c(int param0) {
        if (param0 <= 84) {
            ((ap) this).b(48);
            return ((ap) this).field_e;
        }
        return ((ap) this).field_e;
    }

    ap(ir param0, boolean param1) {
        ((ap) this).field_d = false;
        ((ap) this).field_c = param0;
        ((ap) this).field_f = param1 ? true : false;
    }
}
