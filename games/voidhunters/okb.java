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
        int var3 = 0;
        int var4 = 0;
        Object stackIn_9_0 = null;
        jagdx.IDirect3DDevice stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        Object stackIn_10_0 = null;
        jagdx.IDirect3DDevice stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        Object stackIn_11_0 = null;
        jagdx.IDirect3DDevice stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        Object stackIn_13_0 = null;
        jagdx.IDirect3DDevice stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        Object stackIn_14_0 = null;
        jagdx.IDirect3DDevice stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        Object stackIn_15_0 = null;
        jagdx.IDirect3DDevice stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        Object stackOut_12_0 = null;
        jagdx.IDirect3DDevice stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        Object stackOut_14_0 = null;
        jagdx.IDirect3DDevice stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        Object stackOut_13_0 = null;
        jagdx.IDirect3DDevice stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        Object stackOut_8_0 = null;
        jagdx.IDirect3DDevice stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        Object stackOut_10_0 = null;
        jagdx.IDirect3DDevice stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        Object stackOut_9_0 = null;
        jagdx.IDirect3DDevice stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
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
                stackOut_12_0 = this;
                stackOut_12_1 = this.field_a.field_Mc;
                stackOut_12_2 = this.field_g;
                stackOut_12_3 = var4;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                if (this.field_b == mj.field_e) {
                  stackOut_14_0 = this;
                  stackOut_14_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_14_1);
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = stackIn_14_3;
                  stackOut_14_4 = 101;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  stackIn_15_4 = stackOut_14_4;
                  break L1;
                } else {
                  stackOut_13_0 = this;
                  stackOut_13_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_13_1);
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = stackIn_13_3;
                  stackOut_13_4 = 102;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  stackIn_15_4 = stackOut_13_4;
                  break L1;
                }
              }
              ((okb) (this)).field_d = ((jagdx.IDirect3DDevice) (Object) stackIn_15_1).a(stackIn_15_2, stackIn_15_3, stackIn_15_4, var3, this.field_d);
              this.field_f = this.field_g;
              return;
            } else {
              L2: {
                stackOut_8_0 = this;
                stackOut_8_1 = this.field_a.field_Mc;
                stackOut_8_2 = this.field_g;
                stackOut_8_3 = var4;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                if (this.field_b == mj.field_e) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_10_1);
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = stackIn_10_3;
                  stackOut_10_4 = 101;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  stackIn_11_4 = stackOut_10_4;
                  break L2;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_9_1);
                  stackOut_9_2 = stackIn_9_2;
                  stackOut_9_3 = stackIn_9_3;
                  stackOut_9_4 = 102;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  stackIn_11_3 = stackOut_9_3;
                  stackIn_11_4 = stackOut_9_4;
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
        int var2 = 0;
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
        boolean discarded$6 = false;
        jagdx.IDirect3DIndexBuffer stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        jagdx.IDirect3DIndexBuffer stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        jagdx.IDirect3DIndexBuffer stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        jagdx.IDirect3DIndexBuffer stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        jagdx.IDirect3DIndexBuffer stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        jagdx.IDirect3DIndexBuffer stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        jagdx.IDirect3DIndexBuffer stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        jagdx.IDirect3DIndexBuffer stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        jagdx.IDirect3DIndexBuffer stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        jagdx.IDirect3DIndexBuffer stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        jagdx.IDirect3DIndexBuffer stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        jagdx.IDirect3DIndexBuffer stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        if (param0 < -23) {
          if (null != this.field_d) {
            param1 = param1 & this.field_e;
            if (!this.field_c) {
              L0: {
                stackOut_16_0 = this.field_d;
                stackOut_16_1 = 0;
                stackOut_16_2 = this.field_f;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                if (!param1) {
                  stackOut_18_0 = (jagdx.IDirect3DIndexBuffer) ((Object) stackIn_18_0);
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = stackIn_18_2;
                  stackOut_18_3 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  stackIn_19_3 = stackOut_18_3;
                  break L0;
                } else {
                  stackOut_17_0 = (jagdx.IDirect3DIndexBuffer) ((Object) stackIn_17_0);
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = stackIn_17_2;
                  stackOut_17_3 = 8192;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  stackIn_19_3 = stackOut_17_3;
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
          discarded$6 = this.b(-118);
          if (null != this.field_d) {
            param1 = param1 & this.field_e;
            if (!this.field_c) {
              L1: {
                stackOut_5_0 = this.field_d;
                stackOut_5_1 = 0;
                stackOut_5_2 = this.field_f;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                if (!param1) {
                  stackOut_7_0 = (jagdx.IDirect3DIndexBuffer) ((Object) stackIn_7_0);
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  break L1;
                } else {
                  stackOut_6_0 = (jagdx.IDirect3DIndexBuffer) ((Object) stackIn_6_0);
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
