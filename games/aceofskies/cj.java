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
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int var4;
        int var5;
        if (param1 <= -112) {
          this.field_c = param2;
          this.field_g = (byte)param0;
          if (this.field_b < this.field_c) {
            L0: {
              var5 = 8;
              if (this.field_a) {
                var5 = var5 | 512;
                var4 = 0;
                break L0;
              } else {
                var4 = 1;
                break L0;
              }
            }
            if (this.field_f != null) {
              L1: {
                this.field_f.a(1618);
                this.field_f = this.field_e.field_Rc.a(this.field_c, var5, 0, var4, this.field_f);
                this.field_b = this.field_c;
                if (this.field_f == null) {
                  stackIn_18_0 = 0;
                  break L1;
                } else {
                  stackIn_18_0 = 1;
                  break L1;
                }
              }
              return stackIn_18_0 != 0;
            } else {
              L2: {
                this.field_f = this.field_e.field_Rc.a(this.field_c, var5, 0, var4, this.field_f);
                this.field_b = this.field_c;
                if (this.field_f == null) {
                  stackIn_14_0 = 0;
                  break L2;
                } else {
                  stackIn_14_0 = 1;
                  break L2;
                }
              }
              return stackIn_14_0 != 0;
            }
          } else {
            L3: {
              if (this.field_f == null) {
                stackIn_6_0 = 0;
                break L3;
              } else {
                stackIn_6_0 = 1;
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
          if (null != this.field_f) {
            this.field_f.a(1618);
            this.field_f = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 4665) {
          this.b(28);
          this.field_b = 0;
          this.field_c = 0;
          return;
        } else {
          this.field_b = 0;
          this.field_c = 0;
          return;
        }
    }

    final int b(int param0) {
        if (param0 != 1) {
            this.a((byte) 105);
            return this.field_g;
        }
        return this.field_g;
    }

    public final boolean a(byte param0) {
        if (!this.field_d) {
          if (param0 != -60) {
            return true;
          } else {
            return false;
          }
        } else {
          if (!jagdx.gf.a((byte) 73, this.field_f.Unlock())) {
            if (param0 != -60) {
              return true;
            } else {
              return false;
            }
          } else {
            this.field_d = false;
            return true;
          }
        }
    }

    public final jaclib.memory.Buffer a(boolean param0, byte param1) {
        int stackIn_5_0;
        jagdx.IDirect3DVertexBuffer stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        int stackIn_6_0 = 0;
        jagdx.IDirect3DVertexBuffer stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        if (null != this.field_f) {
          param0 = param0 & this.field_a;
          if (this.field_d) {
            if (param1 < -58) {
              return null;
            } else {
              return (jaclib.memory.Buffer) null;
            }
          } else {
            L0: {
              stackIn_5_0 = 124;

              stackIn_5_1 = this.field_f;

              stackIn_5_2 = 0;

              stackIn_5_3 = this.field_b;

              if (!param0) {
                stackIn_6_0 = stackIn_5_0;
                stackIn_6_1 = (jagdx.IDirect3DVertexBuffer) ((Object) stackIn_5_1);
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = stackIn_5_3;
                stackIn_6_4 = 0;
                break L0;
              } else {
                stackIn_6_0 = stackIn_5_0;
                stackIn_6_1 = (jagdx.IDirect3DVertexBuffer) ((Object) stackIn_5_1);
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = stackIn_5_3;
                stackIn_6_4 = 8192;
                break L0;
              }
            }
            if (!jagdx.gf.a((byte) stackIn_6_0, ((jagdx.IDirect3DVertexBuffer) (Object) stackIn_6_1).Lock(stackIn_6_2, stackIn_6_3, stackIn_6_4, this.field_e.field_vc))) {
              if (param1 < -58) {
                return null;
              } else {
                return (jaclib.memory.Buffer) null;
              }
            } else {
              this.field_d = true;
              return (jaclib.memory.Buffer) ((Object) this.field_e.field_vc);
            }
          }
        } else {
          return null;
        }
    }

    cj(kr param0, boolean param1) {
        this.field_d = false;
        this.field_e = param0;
        this.field_a = param1 ? true : false;
    }
}
