/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lia implements qm {
    jagdx.IDirect3DVertexBuffer field_e;
    private int field_a;
    private boolean field_g;
    private boolean field_f;
    private int field_b;
    private byte field_d;
    private cta field_c;

    final int b(int param0) {
        if (param0 != -7339) {
            return 115;
        }
        return this.field_d;
    }

    public final void a(int param0) {
        if (null == this.field_e) {
          this.field_a = 0;
          if (param0 != 12574) {
            this.a(51, -94, true);
            this.field_b = 0;
            return;
          } else {
            this.field_b = 0;
            return;
          }
        } else {
          this.field_e.a(false);
          this.field_e = null;
          this.field_a = 0;
          if (param0 == 12574) {
            this.field_b = 0;
            return;
          } else {
            this.a(51, -94, true);
            this.field_b = 0;
            return;
          }
        }
    }

    public final boolean a(int param0, int param1, boolean param2) {
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int var4;
        int var5;
        this.field_d = (byte)param1;
        if (param2) {
          this.field_a = param0;
          if (this.field_b < this.field_a) {
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
            if (this.field_e != null) {
              L1: {
                this.field_e.a(false);
                this.field_e = this.field_c.field_jd.a(this.field_a, var5, 0, var4, this.field_e);
                this.field_b = this.field_a;
                if (null == this.field_e) {
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
                this.field_e = this.field_c.field_jd.a(this.field_a, var5, 0, var4, this.field_e);
                this.field_b = this.field_a;
                if (null == this.field_e) {
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
              if (null == this.field_e) {
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

    public final jaclib.memory.Buffer a(int param0, boolean param1) {
        if (null == this.field_e) {
            return null;
        }
        param1 = param1 & this.field_f;
        if (param0 != -15730) {
            this.a(52, 89, false);
            if (this.field_g) {
                return null;
            }
            if (!(!jagdx.ah.a(this.field_e.Lock(0, this.field_b, param1 ? 8192 : 0, this.field_c.field_Oc), (byte) 79))) {
                this.field_g = true;
                return (jaclib.memory.Buffer) ((Object) this.field_c.field_Oc);
            }
            return null;
        }
        if (this.field_g) {
            return null;
        }
        if (!(!jagdx.ah.a(this.field_e.Lock(0, this.field_b, param1 ? 8192 : 0, this.field_c.field_Oc), (byte) 79))) {
            this.field_g = true;
            return (jaclib.memory.Buffer) ((Object) this.field_c.field_Oc);
        }
        return null;
    }

    public final boolean a(boolean param0) {
        if (param0) {
          if (this.field_g) {
            if (!jagdx.ah.a(this.field_e.Unlock(), (byte) -109)) {
              return false;
            } else {
              this.field_g = false;
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.a(-68, -25, false);
          if (this.field_g) {
            if (!jagdx.ah.a(this.field_e.Unlock(), (byte) -109)) {
              return false;
            } else {
              this.field_g = false;
              return true;
            }
          } else {
            return false;
          }
        }
    }

    lia(cta param0, boolean param1) {
        this.field_g = false;
        this.field_f = param1 ? true : false;
        this.field_c = param0;
    }
}
