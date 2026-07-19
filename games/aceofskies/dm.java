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
        int var2 = 0;
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
        int var3 = 0;
        int var4 = 0;
        Object stackIn_7_0 = null;
        jagdx.IDirect3DDevice stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        Object stackIn_8_0 = null;
        jagdx.IDirect3DDevice stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        Object stackIn_9_0 = null;
        jagdx.IDirect3DDevice stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        Object stackIn_14_0 = null;
        jagdx.IDirect3DDevice stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        Object stackIn_15_0 = null;
        jagdx.IDirect3DDevice stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        Object stackIn_16_0 = null;
        jagdx.IDirect3DDevice stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        Object stackOut_13_0 = null;
        jagdx.IDirect3DDevice stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        Object stackOut_15_0 = null;
        jagdx.IDirect3DDevice stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        Object stackOut_14_0 = null;
        jagdx.IDirect3DDevice stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        Object stackOut_6_0 = null;
        jagdx.IDirect3DDevice stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        Object stackOut_8_0 = null;
        jagdx.IDirect3DDevice stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        Object stackOut_7_0 = null;
        jagdx.IDirect3DDevice stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
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
                stackOut_13_0 = this;
                stackOut_13_1 = this.field_f.field_Rc;
                stackOut_13_2 = this.field_a;
                stackOut_13_3 = var4;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_15_2 = stackOut_13_2;
                stackIn_15_3 = stackOut_13_3;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                stackIn_14_3 = stackOut_13_3;
                if (this.field_e == la.field_b) {
                  stackOut_15_0 = this;
                  stackOut_15_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_15_1);
                  stackOut_15_2 = stackIn_15_2;
                  stackOut_15_3 = stackIn_15_3;
                  stackOut_15_4 = 101;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  stackIn_16_3 = stackOut_15_3;
                  stackIn_16_4 = stackOut_15_4;
                  break L2;
                } else {
                  stackOut_14_0 = this;
                  stackOut_14_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_14_1);
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = stackIn_14_3;
                  stackOut_14_4 = 102;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  stackIn_16_3 = stackOut_14_3;
                  stackIn_16_4 = stackOut_14_4;
                  break L2;
                }
              }
              ((dm) (this)).field_g = ((jagdx.IDirect3DDevice) (Object) stackIn_16_1).a(stackIn_16_2, stackIn_16_3, stackIn_16_4, var3, this.field_g);
              this.field_b = this.field_a;
              break L0;
            } else {
              L3: {
                stackOut_6_0 = this;
                stackOut_6_1 = this.field_f.field_Rc;
                stackOut_6_2 = this.field_a;
                stackOut_6_3 = var4;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                if (this.field_e == la.field_b) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_8_1);
                  stackOut_8_2 = stackIn_8_2;
                  stackOut_8_3 = stackIn_8_3;
                  stackOut_8_4 = 101;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  stackIn_9_4 = stackOut_8_4;
                  break L3;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_7_1);
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = stackIn_7_3;
                  stackOut_7_4 = 102;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  stackIn_9_4 = stackOut_7_4;
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
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        if (null == this.field_g) {
          this.field_b = 0;
          this.field_a = 0;
          if (param0 != 4665) {
            discarded$4 = this.a((byte) 35);
            return;
          } else {
            return;
          }
        } else {
          this.field_g = null;
          this.field_b = 0;
          this.field_a = 0;
          if (param0 == 4665) {
            return;
          } else {
            discarded$5 = this.a((byte) 35);
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
