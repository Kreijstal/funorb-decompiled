/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co implements cr {
    private ir field_e;
    private int field_b;
    private boolean field_c;
    private jagdx.IDirect3DIndexBuffer field_f;
    private io field_a;
    private boolean field_g;
    private int field_d;

    public final boolean a(int param0) {
        if (this.field_c) {
          if (!jagdx.gv.b(this.field_f.Unlock(), -75)) {
            if (param0 != -28833) {
              return false;
            } else {
              return false;
            }
          } else {
            this.field_c = false;
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
        if (this.field_f == null) {
          this.field_d = 0;
          if (param0 != 12001) {
            this.field_b = -108;
            this.field_b = 0;
            return;
          } else {
            this.field_b = 0;
            return;
          }
        } else {
          this.field_f.a(-22671);
          this.field_f = null;
          this.field_d = 0;
          if (param0 == 12001) {
            this.field_b = 0;
            return;
          } else {
            this.field_b = -108;
            this.field_b = 0;
            return;
          }
        }
    }

    public final void a(byte param0, int param1) {
        int var3;
        int var4;
        Object stackIn_9_0;
        jagdx.IDirect3DDevice stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        Object stackIn_10_0;
        jagdx.IDirect3DDevice stackIn_10_1;
        int stackIn_10_2;
        int stackIn_10_3;
        int stackIn_10_4;
        L0: {
          this.field_b = this.field_a.field_j * param1;
          if (this.field_b <= this.field_d) {
            break L0;
          } else {
            L1: {
              var4 = 8;
              if (this.field_g) {
                var4 = var4 | 512;
                var3 = 0;
                break L1;
              } else {
                var3 = 1;
                break L1;
              }
            }
            L2: {
              if (this.field_f != null) {
                this.field_f.a(-22671);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              stackIn_9_0 = this;

              stackIn_9_1 = this.field_e.field_Cc;

              stackIn_9_2 = this.field_b;

              stackIn_9_3 = var4;

              if (io.field_k == this.field_a) {
                stackIn_10_0 = this;
                stackIn_10_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_9_1);
                stackIn_10_2 = stackIn_9_2;
                stackIn_10_3 = stackIn_9_3;
                stackIn_10_4 = 101;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_9_1);
                stackIn_10_2 = stackIn_9_2;
                stackIn_10_3 = stackIn_9_3;
                stackIn_10_4 = 102;
                break L3;
              }
            }
            ((co) (this)).field_f = ((jagdx.IDirect3DDevice) (Object) stackIn_10_1).a(stackIn_10_2, stackIn_10_3, stackIn_10_4, var3, this.field_f);
            this.field_d = this.field_b;
            break L0;
          }
        }
        if (param0 >= -67) {
          this.a((byte) 36, 56);
          return;
        } else {
          return;
        }
    }

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (this.field_f == null) {
            return null;
        }
        if (param1 != 10081) {
            return (jaclib.memory.Buffer) null;
        }
        param0 = param0 & this.field_g;
        if (this.field_c) {
            return null;
        }
        if (!(!jagdx.gv.b(this.field_f.Lock(0, this.field_d, !param0 ? 0 : 8192, this.field_e.field_Yc), -75))) {
            this.field_c = true;
            return (jaclib.memory.Buffer) ((Object) this.field_e.field_Yc);
        }
        return null;
    }

    co(ir param0, io param1, boolean param2) {
        this.field_c = false;
        this.field_e = param0;
        this.field_g = param2 ? true : false;
        this.field_a = param1;
    }
}
