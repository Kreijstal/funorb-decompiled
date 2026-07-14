/*
 * Decompiled by CFR-JS 0.4.0.
 */
import jagdx.IDirect3DDevice;

final class co implements cr {
    private ir field_e;
    private int field_b;
    private boolean field_c;
    private jagdx.IDirect3DIndexBuffer field_f;
    private io field_a;
    private boolean field_g;
    private int field_d;

    public final boolean a(int param0) {
        if (((co) this).field_c) {
          if (!jagdx.gv.b(((co) this).field_f.Unlock(), -75)) {
            if (param0 != -28833) {
              return false;
            } else {
              return false;
            }
          } else {
            ((co) this).field_c = false;
            return true;
          }
        } else {
          if (param0 != -28833) {
            return false;
          } else {
            return false;
          }
        }
    }

    public final void b(int param0) {
        if (((co) this).field_f == null) {
          ((co) this).field_d = 0;
          if (param0 != 12001) {
            ((co) this).field_b = -108;
            ((co) this).field_b = 0;
            return;
          } else {
            ((co) this).field_b = 0;
            return;
          }
        } else {
          ((co) this).field_f = null;
          ((co) this).field_d = 0;
          if (param0 == 12001) {
            ((co) this).field_b = 0;
            return;
          } else {
            ((co) this).field_b = -108;
            ((co) this).field_b = 0;
            return;
          }
        }
    }

    public final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object stackIn_8_0 = null;
        jagdx.IDirect3DDevice stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        Object stackIn_9_0 = null;
        jagdx.IDirect3DDevice stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        Object stackIn_10_0 = null;
        jagdx.IDirect3DDevice stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        Object stackOut_7_0 = null;
        jagdx.IDirect3DDevice stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        Object stackOut_9_0 = null;
        jagdx.IDirect3DDevice stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        Object stackOut_8_0 = null;
        jagdx.IDirect3DDevice stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        L0: {
          ((co) this).field_b = ((co) this).field_a.field_j * param1;
          if (((co) this).field_b <= ((co) this).field_d) {
            break L0;
          } else {
            L1: {
              var4 = 8;
              if (((co) this).field_g) {
                var4 = var4 | 512;
                var3 = 0;
                break L1;
              } else {
                var3 = 1;
                break L1;
              }
            }
            L2: {
              if (((co) this).field_f != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              stackOut_7_0 = this;
              stackOut_7_1 = ((co) this).field_e.field_Cc;
              stackOut_7_2 = ((co) this).field_b;
              stackOut_7_3 = var4;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              if (io.field_k == ((co) this).field_a) {
                stackOut_9_0 = this;
                stackOut_9_1 = (jagdx.IDirect3DDevice) (Object) stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = stackIn_9_3;
                stackOut_9_4 = 101;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                stackIn_10_4 = stackOut_9_4;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = (jagdx.IDirect3DDevice) (Object) stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = 102;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                stackIn_10_4 = stackOut_8_4;
                break L3;
              }
            }
            ((co) this).field_f = ((jagdx.IDirect3DDevice) (Object) stackIn_10_1).a(stackIn_10_2, stackIn_10_3, stackIn_10_4, var3, ((co) this).field_f);
            ((co) this).field_d = ((co) this).field_b;
            break L0;
          }
        }
        if (param0 >= -67) {
          ((co) this).a((byte) 36, 56);
          return;
        } else {
          return;
        }
    }

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (((co) this).field_f == null) {
            return null;
        }
        if (param1 != 10081) {
            return null;
        }
        param0 = param0 & ((co) this).field_g;
        if (((co) this).field_c) {
            return null;
        }
        if (!(!jagdx.gv.b(((co) this).field_f.Lock(0, ((co) this).field_d, !param0 ? 0 : 8192, ((co) this).field_e.field_Yc), -75))) {
            ((co) this).field_c = true;
            return (jaclib.memory.Buffer) (Object) ((co) this).field_e.field_Yc;
        }
        return null;
    }

    co(ir param0, io param1, boolean param2) {
        ((co) this).field_c = false;
        ((co) this).field_e = param0;
        ((co) this).field_g = param2 ? true : false;
        ((co) this).field_a = param1;
    }
}
