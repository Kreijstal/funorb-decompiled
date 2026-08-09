/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm implements ti {
    private kr field_f;
    private int field_b;
    private jagdx.IDirect3DIndexBuffer field_g;
    private boolean field_d;
    private la field_e;
    private int field_a;
    private boolean field_c;

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (param1 != 32570) {
            this.a(75, -106);
            if (this.field_g == null) {
                return null;
            }
            param0 = param0 & this.field_c;
            if (this.field_d) {
                return null;
            }
            if (!(!jagdx.gf.a((byte) 94, this.field_g.Lock(0, this.field_b, param0 ? 8192 : 0, this.field_f.field_vc)))) {
                this.field_d = true;
                return (jaclib.memory.Buffer) ((Object) this.field_f.field_vc);
            }
            return null;
        }
        if (this.field_g == null) {
            return null;
        }
        param0 = param0 & this.field_c;
        if (this.field_d) {
            return null;
        }
        if (!(!jagdx.gf.a((byte) 94, this.field_g.Lock(0, this.field_b, param0 ? 8192 : 0, this.field_f.field_vc)))) {
            this.field_d = true;
            return (jaclib.memory.Buffer) ((Object) this.field_f.field_vc);
        }
        return null;
    }

    public final boolean a(byte param0) {
        int var2;
        var2 = 31 % ((-61 - param0) / 59);
        if (this.field_d) {
          if (!jagdx.gf.a((byte) 72, this.field_g.Unlock())) {
            return false;
          } else {
            this.field_d = false;
            return true;
          }
        } else {
          return false;
        }
    }

    public final void a(int param0, int param1) {
        int var3;
        int var4;
        Object stackIn_8_0;
        jagdx.IDirect3DDevice stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        Object stackIn_9_0 = null;
        jagdx.IDirect3DDevice stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        Object stackIn_15_0;
        jagdx.IDirect3DDevice stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        Object stackIn_16_0;
        jagdx.IDirect3DDevice stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_16_4;
        L0: {
          this.field_a = this.field_e.field_c * param1;
          if (this.field_a > this.field_b) {
            L1: {
              var4 = 8;
              if (!this.field_c) {
                var3 = 1;
                break L1;
              } else {
                var4 = var4 | 512;
                var3 = 0;
                break L1;
              }
            }
            if (this.field_g == null) {
              L2: {
                stackIn_15_0 = this;

                stackIn_15_1 = this.field_f.field_Rc;

                stackIn_15_2 = this.field_a;

                stackIn_15_3 = var4;

                if (this.field_e == la.field_b) {
                  stackIn_16_0 = this;
                  stackIn_16_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_15_1);
                  stackIn_16_2 = stackIn_15_2;
                  stackIn_16_3 = stackIn_15_3;
                  stackIn_16_4 = 101;
                  break L2;
                } else {
                  stackIn_16_0 = this;
                  stackIn_16_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_15_1);
                  stackIn_16_2 = stackIn_15_2;
                  stackIn_16_3 = stackIn_15_3;
                  stackIn_16_4 = 102;
                  break L2;
                }
              }
              ((dm) (this)).field_g = ((jagdx.IDirect3DDevice) (Object) stackIn_16_1).a(stackIn_16_2, stackIn_16_3, stackIn_16_4, var3, this.field_g);
              this.field_b = this.field_a;
              break L0;
            } else {
              L3: {
                this.field_g.a(1618);
                stackIn_8_0 = this;

                stackIn_8_1 = this.field_f.field_Rc;

                stackIn_8_2 = this.field_a;

                stackIn_8_3 = var4;

                if (this.field_e == la.field_b) {
                  stackIn_9_0 = this;
                  stackIn_9_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_8_1);
                  stackIn_9_2 = stackIn_8_2;
                  stackIn_9_3 = stackIn_8_3;
                  stackIn_9_4 = 101;
                  break L3;
                } else {
                  stackIn_9_0 = this;
                  stackIn_9_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_8_1);
                  stackIn_9_2 = stackIn_8_2;
                  stackIn_9_3 = stackIn_8_3;
                  stackIn_9_4 = 102;
                  break L3;
                }
              }
              ((dm) (this)).field_g = ((jagdx.IDirect3DDevice) (Object) stackIn_9_1).a(stackIn_9_2, stackIn_9_3, stackIn_9_4, var3, this.field_g);
              this.field_b = this.field_a;
              if (param0 != -12880) {
                this.field_a = -21;
                return;
              } else {
                return;
              }
            }
          } else {
            break L0;
          }
        }
        if (param0 != -12880) {
          this.field_a = -21;
          return;
        } else {
          return;
        }
    }

    public final void a(int param0) {
        if (null == this.field_g) {
          this.field_b = 0;
          this.field_a = 0;
          if (param0 != 4665) {
            this.a((byte) 35);
            return;
          } else {
            return;
          }
        } else {
          this.field_g.a(1618);
          this.field_g = null;
          this.field_b = 0;
          this.field_a = 0;
          if (param0 == 4665) {
            return;
          } else {
            this.a((byte) 35);
            return;
          }
        }
    }

    dm(kr param0, la param1, boolean param2) {
        this.field_d = false;
        this.field_e = param1;
        this.field_f = param0;
        this.field_c = param2 ? true : false;
    }
}
