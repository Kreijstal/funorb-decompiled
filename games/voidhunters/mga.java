/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mga implements mkb {
    private byte field_b;
    private int field_c;
    jagdx.IDirect3DVertexBuffer field_f;
    private nla field_g;
    private boolean field_d;
    private boolean field_e;
    private int field_a;

    public final boolean a(int param0, int param1, int param2) {
        int stackIn_12_0 = 0;
        int stackIn_24_0 = 0;
        int var4;
        int var5;
        this.field_c = param1;
        if (param2 <= 81) {
          L0: {
            this.field_g = (nla) null;
            this.field_b = (byte)param0;
            if (this.field_a >= this.field_c) {
              break L0;
            } else {
              L1: {
                var5 = 8;
                if (this.field_e) {
                  var4 = 0;
                  var5 = var5 | 512;
                  break L1;
                } else {
                  var4 = 1;
                  break L1;
                }
              }
              L2: {
                if (this.field_f != null) {
                  this.field_f.a(false);
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_f = this.field_g.field_Mc.a(this.field_c, var5, 0, var4, this.field_f);
              this.field_a = this.field_c;
              break L0;
            }
          }
          L3: {
            if (this.field_f == null) {
              stackIn_24_0 = 0;
              break L3;
            } else {
              stackIn_24_0 = 1;
              break L3;
            }
          }
          return stackIn_24_0 != 0;
        } else {
          L4: {
            this.field_b = (byte)param0;
            if (this.field_a >= this.field_c) {
              break L4;
            } else {
              L5: {
                var5 = 8;
                if (this.field_e) {
                  var4 = 0;
                  var5 = var5 | 512;
                  break L5;
                } else {
                  var4 = 1;
                  break L5;
                }
              }
              L6: {
                if (this.field_f != null) {
                  this.field_f.a(false);
                  break L6;
                } else {
                  break L6;
                }
              }
              this.field_f = this.field_g.field_Mc.a(this.field_c, var5, 0, var4, this.field_f);
              this.field_a = this.field_c;
              break L4;
            }
          }
          L7: {
            if (this.field_f == null) {
              stackIn_12_0 = 0;
              break L7;
            } else {
              stackIn_12_0 = 1;
              break L7;
            }
          }
          return stackIn_12_0 != 0;
        }
    }

    final int a(byte param0) {
        int var2 = -6 % ((27 - param0) / 60);
        return this.field_b;
    }

    public final void a(int param0) {
        if (param0 > -84) {
          L0: {
            this.field_d = false;
            if (this.field_f != null) {
              this.field_f.a(false);
              this.field_f = null;
              break L0;
            } else {
              break L0;
            }
          }
          this.field_c = 0;
          this.field_a = 0;
          return;
        } else {
          L1: {
            if (this.field_f != null) {
              this.field_f.a(false);
              this.field_f = null;
              break L1;
            } else {
              break L1;
            }
          }
          this.field_c = 0;
          this.field_a = 0;
          return;
        }
    }

    public final boolean b(int param0) {
        if (param0 == -20836) {
          if (this.field_d) {
            if (!jagdx.hea.b(this.field_f.Unlock(), (byte) 53)) {
              return false;
            } else {
              this.field_d = false;
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_c = 48;
          if (this.field_d) {
            if (!jagdx.hea.b(this.field_f.Unlock(), (byte) 53)) {
              return false;
            } else {
              this.field_d = false;
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final jaclib.memory.Buffer a(boolean param0, byte param1) {
        if (null == this.field_f) {
            return null;
        }
        param0 = param0 & this.field_e;
        if (param1 <= 16) {
            this.field_e = false;
            if (this.field_d) {
                return null;
            }
            if (!(!jagdx.hea.b(this.field_f.Lock(0, this.field_a, !param0 ? 0 : 8192, this.field_g.field_Kc), (byte) 93))) {
                this.field_d = true;
                return (jaclib.memory.Buffer) ((Object) this.field_g.field_Kc);
            }
            return null;
        }
        if (this.field_d) {
            return null;
        }
        if (!(!jagdx.hea.b(this.field_f.Lock(0, this.field_a, !param0 ? 0 : 8192, this.field_g.field_Kc), (byte) 93))) {
            this.field_d = true;
            return (jaclib.memory.Buffer) ((Object) this.field_g.field_Kc);
        }
        return null;
    }

    mga(nla param0, boolean param1) {
        this.field_d = false;
        this.field_g = param0;
        this.field_e = param1 ? true : false;
    }
}
