/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap implements pv {
    private boolean field_d;
    private byte field_e;
    private ir field_c;
    jagdx.IDirect3DVertexBuffer field_b;
    private int field_a;
    private int field_g;
    private boolean field_f;

    public final jaclib.memory.Buffer a(int param0, boolean param1) {
        jagdx.IDirect3DVertexBuffer stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        if (null != this.field_b) {
          if (param0 == 7454) {
            param1 = param1 & this.field_f;
            if (!this.field_d) {
              L0: {
                stackIn_16_0 = this.field_b;

                stackIn_16_1 = 0;

                stackIn_16_2 = this.field_g;

                if (!param1) {
                  stackIn_17_0 = (jagdx.IDirect3DVertexBuffer) ((Object) stackIn_16_0);
                  stackIn_17_1 = stackIn_16_1;
                  stackIn_17_2 = stackIn_16_2;
                  stackIn_17_3 = 0;
                  break L0;
                } else {
                  stackIn_17_0 = (jagdx.IDirect3DVertexBuffer) ((Object) stackIn_16_0);
                  stackIn_17_1 = stackIn_16_1;
                  stackIn_17_2 = stackIn_16_2;
                  stackIn_17_3 = 8192;
                  break L0;
                }
              }
              if (!jagdx.gv.b(((jagdx.IDirect3DVertexBuffer) (Object) stackIn_17_0).Lock(stackIn_17_1, stackIn_17_2, stackIn_17_3, this.field_c.field_Yc), param0 ^ -7499)) {
                return null;
              } else {
                this.field_d = true;
                return (jaclib.memory.Buffer) ((Object) this.field_c.field_Yc);
              }
            } else {
              return null;
            }
          } else {
            this.c(-80);
            param1 = param1 & this.field_f;
            if (!this.field_d) {
              L1: {
                stackIn_7_0 = this.field_b;

                stackIn_7_1 = 0;

                stackIn_7_2 = this.field_g;

                if (!param1) {
                  stackIn_8_0 = (jagdx.IDirect3DVertexBuffer) ((Object) stackIn_7_0);
                  stackIn_8_1 = stackIn_7_1;
                  stackIn_8_2 = stackIn_7_2;
                  stackIn_8_3 = 0;
                  break L1;
                } else {
                  stackIn_8_0 = (jagdx.IDirect3DVertexBuffer) ((Object) stackIn_7_0);
                  stackIn_8_1 = stackIn_7_1;
                  stackIn_8_2 = stackIn_7_2;
                  stackIn_8_3 = 8192;
                  break L1;
                }
              }
              if (!jagdx.gv.b(((jagdx.IDirect3DVertexBuffer) (Object) stackIn_8_0).Lock(stackIn_8_1, stackIn_8_2, stackIn_8_3, this.field_c.field_Yc), param0 ^ -7499)) {
                return null;
              } else {
                this.field_d = true;
                return (jaclib.memory.Buffer) ((Object) this.field_c.field_Yc);
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
          if (this.field_d) {
            if (!jagdx.gv.b(this.field_b.Unlock(), -98)) {
              return false;
            } else {
              this.field_d = false;
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
        if (null == this.field_b) {
          this.field_a = 0;
          this.field_g = 0;
          if (param0 != 12001) {
            this.field_g = 82;
            return;
          } else {
            return;
          }
        } else {
          this.field_b.a(param0 ^ -30320);
          this.field_b = null;
          this.field_a = 0;
          this.field_g = 0;
          if (param0 == 12001) {
            return;
          } else {
            this.field_g = 82;
            return;
          }
        }
    }

    public final boolean a(int param0, byte param1, int param2) {
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int var4;
        int var5;
        if (param1 == -35) {
          this.field_e = (byte)param0;
          this.field_a = param2;
          if (this.field_a > this.field_g) {
            L0: {
              var5 = 8;
              if (!this.field_f) {
                var4 = 1;
                break L0;
              } else {
                var4 = 0;
                var5 = var5 | 512;
                break L0;
              }
            }
            if (this.field_b != null) {
              L1: {
                this.field_b.a(-22671);
                this.field_b = this.field_c.field_Cc.a(this.field_a, var5, 0, var4, this.field_b);
                this.field_g = this.field_a;
                if (this.field_b == null) {
                  stackIn_15_0 = 0;
                  break L1;
                } else {
                  stackIn_15_0 = 1;
                  break L1;
                }
              }
              return stackIn_15_0 != 0;
            } else {
              L2: {
                this.field_b = this.field_c.field_Cc.a(this.field_a, var5, 0, var4, this.field_b);
                this.field_g = this.field_a;
                if (this.field_b == null) {
                  stackIn_11_0 = 0;
                  break L2;
                } else {
                  stackIn_11_0 = 1;
                  break L2;
                }
              }
              return stackIn_11_0 != 0;
            }
          } else {
            L3: {
              if (this.field_b == null) {
                stackIn_20_0 = 0;
                break L3;
              } else {
                stackIn_20_0 = 1;
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
            this.b(48);
            return this.field_e;
        }
        return this.field_e;
    }

    ap(ir param0, boolean param1) {
        this.field_d = false;
        this.field_c = param0;
        this.field_f = param1 ? true : false;
    }
}
