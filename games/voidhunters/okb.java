/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class okb implements vca {
    private boolean field_c;
    private mj field_b;
    private int field_f;
    private boolean field_e;
    private int field_g;
    private jagdx.IDirect3DIndexBuffer field_d;
    private nla field_a;

    public final void a(int param0) {
        L0: {
          if (null != this.field_d) {
            this.field_d.a(false);
            this.field_d = null;
            break L0;
          } else {
            break L0;
          }
        }
        this.field_f = 0;
        if (param0 >= -84) {
          return;
        } else {
          this.field_g = 0;
          return;
        }
    }

    public final void a(int param0, int param1) {
        Object stackIn_10_0;
        jagdx.IDirect3DDevice stackIn_10_1;
        int stackIn_10_2;
        int stackIn_10_3;
        Object stackIn_11_0 = null;
        jagdx.IDirect3DDevice stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        Object stackIn_14_0;
        jagdx.IDirect3DDevice stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        Object stackIn_15_0 = null;
        jagdx.IDirect3DDevice stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int var3;
        int var4;
        this.field_g = this.field_b.field_h * param1;
        if (param0 == 25427) {
          if (this.field_g > this.field_f) {
            L0: {
              var4 = 8;
              if (this.field_e) {
                var3 = 0;
                var4 = var4 | 512;
                break L0;
              } else {
                var3 = 1;
                break L0;
              }
            }
            if (null != this.field_d) {
              L1: {
                this.field_d.a(false);
                stackIn_14_0 = this;

                stackIn_14_1 = this.field_a.field_Mc;

                stackIn_14_2 = this.field_g;

                stackIn_14_3 = var4;

                if (this.field_b == mj.field_e) {
                  stackIn_15_0 = this;
                  stackIn_15_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_14_1);
                  stackIn_15_2 = stackIn_14_2;
                  stackIn_15_3 = stackIn_14_3;
                  stackIn_15_4 = 101;
                  break L1;
                } else {
                  stackIn_15_0 = this;
                  stackIn_15_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_14_1);
                  stackIn_15_2 = stackIn_14_2;
                  stackIn_15_3 = stackIn_14_3;
                  stackIn_15_4 = 102;
                  break L1;
                }
              }
              ((okb) (this)).field_d = ((jagdx.IDirect3DDevice) (Object) stackIn_15_1).a(stackIn_15_2, stackIn_15_3, stackIn_15_4, var3, this.field_d);
              this.field_f = this.field_g;
              return;
            } else {
              L2: {
                stackIn_10_0 = this;

                stackIn_10_1 = this.field_a.field_Mc;

                stackIn_10_2 = this.field_g;

                stackIn_10_3 = var4;

                if (this.field_b == mj.field_e) {
                  stackIn_11_0 = this;
                  stackIn_11_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_10_1);
                  stackIn_11_2 = stackIn_10_2;
                  stackIn_11_3 = stackIn_10_3;
                  stackIn_11_4 = 101;
                  break L2;
                } else {
                  stackIn_11_0 = this;
                  stackIn_11_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_10_1);
                  stackIn_11_2 = stackIn_10_2;
                  stackIn_11_3 = stackIn_10_3;
                  stackIn_11_4 = 102;
                  break L2;
                }
              }
              ((okb) (this)).field_d = ((jagdx.IDirect3DDevice) (Object) stackIn_11_1).a(stackIn_11_2, stackIn_11_3, stackIn_11_4, var3, this.field_d);
              this.field_f = this.field_g;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final boolean b(int param0) {
        int var2;
        if (this.field_c) {
          if (!jagdx.hea.b(this.field_d.Unlock(), (byte) 90)) {
            var2 = 14 / ((13 - param0) / 37);
            return false;
          } else {
            this.field_c = false;
            return true;
          }
        } else {
          var2 = 14 / ((13 - param0) / 37);
          return false;
        }
    }

    public final jaclib.memory.Buffer a(byte param0, boolean param1) {
        jagdx.IDirect3DIndexBuffer stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        jagdx.IDirect3DIndexBuffer stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        jagdx.IDirect3DIndexBuffer stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        jagdx.IDirect3DIndexBuffer stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        if (param0 < -23) {
          if (null != this.field_d) {
            param1 = param1 & this.field_e;
            if (!this.field_c) {
              L0: {
                stackIn_18_0 = this.field_d;

                stackIn_18_1 = 0;

                stackIn_18_2 = this.field_f;

                if (!param1) {
                  stackIn_19_0 = (jagdx.IDirect3DIndexBuffer) ((Object) stackIn_18_0);
                  stackIn_19_1 = stackIn_18_1;
                  stackIn_19_2 = stackIn_18_2;
                  stackIn_19_3 = 0;
                  break L0;
                } else {
                  stackIn_19_0 = (jagdx.IDirect3DIndexBuffer) ((Object) stackIn_18_0);
                  stackIn_19_1 = stackIn_18_1;
                  stackIn_19_2 = stackIn_18_2;
                  stackIn_19_3 = 8192;
                  break L0;
                }
              }
              if (!jagdx.hea.b(((jagdx.IDirect3DIndexBuffer) (Object) stackIn_19_0).Lock(stackIn_19_1, stackIn_19_2, stackIn_19_3, this.field_a.field_Kc), (byte) 37)) {
                return null;
              } else {
                this.field_c = true;
                return (jaclib.memory.Buffer) ((Object) this.field_a.field_Kc);
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          this.b(-118);
          if (null != this.field_d) {
            param1 = param1 & this.field_e;
            if (!this.field_c) {
              L1: {
                stackIn_7_0 = this.field_d;

                stackIn_7_1 = 0;

                stackIn_7_2 = this.field_f;

                if (!param1) {
                  stackIn_8_0 = (jagdx.IDirect3DIndexBuffer) ((Object) stackIn_7_0);
                  stackIn_8_1 = stackIn_7_1;
                  stackIn_8_2 = stackIn_7_2;
                  stackIn_8_3 = 0;
                  break L1;
                } else {
                  stackIn_8_0 = (jagdx.IDirect3DIndexBuffer) ((Object) stackIn_7_0);
                  stackIn_8_1 = stackIn_7_1;
                  stackIn_8_2 = stackIn_7_2;
                  stackIn_8_3 = 8192;
                  break L1;
                }
              }
              if (!jagdx.hea.b(((jagdx.IDirect3DIndexBuffer) (Object) stackIn_8_0).Lock(stackIn_8_1, stackIn_8_2, stackIn_8_3, this.field_a.field_Kc), (byte) 37)) {
                return null;
              } else {
                this.field_c = true;
                return (jaclib.memory.Buffer) ((Object) this.field_a.field_Kc);
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    okb(nla param0, mj param1, boolean param2) {
        this.field_c = false;
        this.field_b = param1;
        this.field_e = param2 ? true : false;
        this.field_a = param0;
    }
}
