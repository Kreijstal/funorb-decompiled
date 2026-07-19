/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm implements eja {
    jagdx.IDirect3DIndexBuffer field_d;
    private cta field_a;
    private int field_f;
    private boolean field_e;
    private una field_g;
    private int field_c;
    private boolean field_b;

    public final boolean a(byte param0) {
        int var2 = 0;
        if (this.field_b) {
          if (!jagdx.ah.a(this.field_d.Unlock(), (byte) -123)) {
            var2 = 58 / ((param0 - 54) / 41);
            return false;
          } else {
            this.field_b = false;
            return true;
          }
        } else {
          var2 = 58 / ((param0 - 54) / 41);
          return false;
        }
    }

    public final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
        Object stackIn_11_0 = null;
        jagdx.IDirect3DDevice stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        Object stackIn_12_0 = null;
        jagdx.IDirect3DDevice stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        Object stackIn_13_0 = null;
        jagdx.IDirect3DDevice stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        Object stackOut_10_0 = null;
        jagdx.IDirect3DDevice stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        Object stackOut_12_0 = null;
        jagdx.IDirect3DDevice stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        Object stackOut_11_0 = null;
        jagdx.IDirect3DDevice stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
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
        this.field_c = this.field_g.field_e * param1;
        var3 = -99 / ((param0 - -30) / 36);
        if (this.field_f < this.field_c) {
          L0: {
            var5 = 8;
            if (!this.field_e) {
              var4 = 1;
              break L0;
            } else {
              var5 = var5 | 512;
              var4 = 0;
              break L0;
            }
          }
          if (this.field_d != null) {
            L1: {
              stackOut_10_0 = this;
              stackOut_10_1 = this.field_a.field_jd;
              stackOut_10_2 = this.field_c;
              stackOut_10_3 = var5;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              stackIn_12_3 = stackOut_10_3;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              stackIn_11_3 = stackOut_10_3;
              if (this.field_g != una.field_f) {
                stackOut_12_0 = this;
                stackOut_12_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_12_1);
                stackOut_12_2 = stackIn_12_2;
                stackOut_12_3 = stackIn_12_3;
                stackOut_12_4 = 102;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                stackIn_13_4 = stackOut_12_4;
                break L1;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_11_1);
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = stackIn_11_3;
                stackOut_11_4 = 101;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                stackIn_13_4 = stackOut_11_4;
                break L1;
              }
            }
            ((dm) (this)).field_d = ((jagdx.IDirect3DDevice) (Object) stackIn_13_1).a(stackIn_13_2, stackIn_13_3, stackIn_13_4, var4, this.field_d);
            this.field_f = this.field_c;
            return;
          } else {
            L2: {
              stackOut_6_0 = this;
              stackOut_6_1 = this.field_a.field_jd;
              stackOut_6_2 = this.field_c;
              stackOut_6_3 = var5;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              if (this.field_g != una.field_f) {
                stackOut_8_0 = this;
                stackOut_8_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_8_1);
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = 102;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                break L2;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = (jagdx.IDirect3DDevice) ((Object) stackIn_7_1);
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = 101;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = stackOut_7_3;
                stackIn_9_4 = stackOut_7_4;
                break L2;
              }
            }
            ((dm) (this)).field_d = ((jagdx.IDirect3DDevice) (Object) stackIn_9_1).a(stackIn_9_2, stackIn_9_3, stackIn_9_4, var4, this.field_d);
            this.field_f = this.field_c;
            return;
          }
        } else {
          return;
        }
    }

    public final jaclib.memory.Buffer a(boolean param0, byte param1) {
        jagdx.IDirect3DIndexBuffer stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        jagdx.IDirect3DIndexBuffer stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        jagdx.IDirect3DIndexBuffer stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        jagdx.IDirect3DIndexBuffer stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        jagdx.IDirect3DIndexBuffer stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        jagdx.IDirect3DIndexBuffer stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        if (this.field_d != null) {
          param0 = param0 & this.field_e;
          if (!this.field_b) {
            L0: {
              stackOut_7_0 = this.field_d;
              stackOut_7_1 = 0;
              stackOut_7_2 = this.field_f;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              if (!param0) {
                stackOut_9_0 = (jagdx.IDirect3DIndexBuffer) ((Object) stackIn_9_0);
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                break L0;
              } else {
                stackOut_8_0 = (jagdx.IDirect3DIndexBuffer) ((Object) stackIn_8_0);
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = 8192;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                break L0;
              }
            }
            if (!jagdx.ah.a(((jagdx.IDirect3DIndexBuffer) (Object) stackIn_10_0).Lock(stackIn_10_1, stackIn_10_2, stackIn_10_3, this.field_a.field_Oc), (byte) -94)) {
              if (param1 < -9) {
                return null;
              } else {
                this.field_g = (una) null;
                return null;
              }
            } else {
              this.field_b = true;
              return (jaclib.memory.Buffer) ((Object) this.field_a.field_Oc);
            }
          } else {
            if (param1 < -9) {
              return null;
            } else {
              this.field_g = (una) null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public final una b(int param0) {
        if (param0 != -32491) {
            return (una) null;
        }
        return this.field_g;
    }

    public final void a(int param0) {
        if (this.field_d == null) {
          this.field_c = 0;
          if (param0 != 12574) {
            this.field_g = (una) null;
            this.field_f = 0;
            return;
          } else {
            this.field_f = 0;
            return;
          }
        } else {
          this.field_d = null;
          this.field_c = 0;
          if (param0 == 12574) {
            this.field_f = 0;
            return;
          } else {
            this.field_g = (una) null;
            this.field_f = 0;
            return;
          }
        }
    }

    dm(cta param0, una param1, boolean param2) {
        this.field_b = false;
        this.field_a = param0;
        this.field_e = param2 ? true : false;
        this.field_g = param1;
    }
}
