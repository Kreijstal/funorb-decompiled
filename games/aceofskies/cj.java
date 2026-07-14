/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj implements tl {
    jagdx.IDirect3DVertexBuffer field_f;
    private int field_b;
    private byte field_g;
    private kr field_e;
    private boolean field_a;
    private int field_c;
    private boolean field_d;

    public final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 <= -112) {
          ((cj) this).field_c = param2;
          ((cj) this).field_g = (byte)param0;
          if (((cj) this).field_b < ((cj) this).field_c) {
            L0: {
              var5 = 8;
              if (((cj) this).field_a) {
                var5 = var5 | 512;
                var4 = 0;
                break L0;
              } else {
                var4 = 1;
                break L0;
              }
            }
            if (((cj) this).field_f != null) {
              L1: {
                ((cj) this).field_f = ((cj) this).field_e.field_Rc.a(((cj) this).field_c, var5, 0, var4, ((cj) this).field_f);
                ((cj) this).field_b = ((cj) this).field_c;
                if (((cj) this).field_f == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L1;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  break L1;
                }
              }
              return stackIn_18_0 != 0;
            } else {
              L2: {
                ((cj) this).field_f = ((cj) this).field_e.field_Rc.a(((cj) this).field_c, var5, 0, var4, ((cj) this).field_f);
                ((cj) this).field_b = ((cj) this).field_c;
                if (((cj) this).field_f == null) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
              }
              return stackIn_14_0 != 0;
            }
          } else {
            L3: {
              if (((cj) this).field_f == null) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    public final void a(int param0) {
        L0: {
          if (null != ((cj) this).field_f) {
            ((cj) this).field_f = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 4665) {
          int discarded$2 = ((cj) this).b(28);
          ((cj) this).field_b = 0;
          ((cj) this).field_c = 0;
          return;
        } else {
          ((cj) this).field_b = 0;
          ((cj) this).field_c = 0;
          return;
        }
    }

    final int b(int param0) {
        if (param0 != 1) {
            boolean discarded$0 = ((cj) this).a((byte) 105);
            return ((cj) this).field_g;
        }
        return ((cj) this).field_g;
    }

    public final boolean a(byte param0) {
        if (!((cj) this).field_d) {
          if (param0 != -60) {
            return true;
          } else {
            return false;
          }
        } else {
          if (!jagdx.gf.a((byte) 73, ((cj) this).field_f.Unlock())) {
            if (param0 != -60) {
              return true;
            } else {
              return false;
            }
          } else {
            ((cj) this).field_d = false;
            return true;
          }
        }
    }

    public final jaclib.memory.Buffer a(boolean param0, byte param1) {
        int stackIn_4_0 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_5_0 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_6_0 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackOut_3_0 = 0;
        jagdx.IDirect3DVertexBuffer stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_5_0 = 0;
        jagdx.IDirect3DVertexBuffer stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_4_0 = 0;
        jagdx.IDirect3DVertexBuffer stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        if (null != ((cj) this).field_f) {
          param0 = param0 & ((cj) this).field_a;
          if (((cj) this).field_d) {
            if (param1 < -58) {
              return null;
            } else {
              return (jaclib.memory.Buffer) null;
            }
          } else {
            L0: {
              stackOut_3_0 = 124;
              stackOut_3_1 = ((cj) this).field_f;
              stackOut_3_2 = 0;
              stackOut_3_3 = ((cj) this).field_b;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              if (!param0) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = (jagdx.IDirect3DVertexBuffer) (Object) stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                break L0;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = (jagdx.IDirect3DVertexBuffer) (Object) stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = 8192;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                stackIn_6_4 = stackOut_4_4;
                break L0;
              }
            }
            if (!jagdx.gf.a((byte) stackIn_6_0, ((jagdx.IDirect3DVertexBuffer) (Object) stackIn_6_1).Lock(stackIn_6_2, stackIn_6_3, stackIn_6_4, ((cj) this).field_e.field_vc))) {
              if (param1 < -58) {
                return null;
              } else {
                return (jaclib.memory.Buffer) null;
              }
            } else {
              ((cj) this).field_d = true;
              return (jaclib.memory.Buffer) (Object) ((cj) this).field_e.field_vc;
            }
          }
        } else {
          return null;
        }
    }

    cj(kr param0, boolean param1) {
        ((cj) this).field_d = false;
        ((cj) this).field_e = param0;
        ((cj) this).field_a = param1 ? true : false;
    }
}
