/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ui extends g {
    private int field_E;
    private ei field_H;
    boolean field_G;
    static pb field_F;
    static li field_C;
    static String field_D;
    static String field_B;

    final void a(int param0, byte param1, int param2, int param3) {
        if (-1 != (this.field_E ^ -1)) {
          if (this.field_E >= 256) {
            if (param0 != 0) {
              return;
            } else {
              this.b(param1 ^ -58, param2 + this.field_k, param3 + this.field_w);
              super.a(param0, (byte) -57, param2, param3);
              return;
            }
          } else {
            if (rj.field_s != null) {
              if (this.field_p <= rj.field_s.field_v) {
                if (this.field_t <= rj.field_s.field_y) {
                  hj.a(rj.field_s, 1);
                  ti.d();
                  this.b(param1 + 58, 0, 0);
                  super.a(param0, param1, -this.field_k + -param2, -this.field_w + -param3);
                  id.b((byte) -58);
                  rj.field_s.e(param3 + this.field_w, param2 - -this.field_k, this.field_E);
                  return;
                } else {
                  rj.field_s = new pb(this.field_p, this.field_t);
                  hj.a(rj.field_s, 1);
                  ti.d();
                  this.b(param1 + 58, 0, 0);
                  super.a(param0, param1, -this.field_k + -param2, -this.field_w + -param3);
                  id.b((byte) -58);
                  rj.field_s.e(param3 + this.field_w, param2 - -this.field_k, this.field_E);
                  return;
                }
              } else {
                rj.field_s = new pb(this.field_p, this.field_t);
                hj.a(rj.field_s, 1);
                ti.d();
                this.b(param1 + 58, 0, 0);
                super.a(param0, param1, -this.field_k + -param2, -this.field_w + -param3);
                id.b((byte) -58);
                rj.field_s.e(param3 + this.field_w, param2 - -this.field_k, this.field_E);
                return;
              }
            } else {
              rj.field_s = new pb(this.field_p, this.field_t);
              hj.a(rj.field_s, 1);
              ti.d();
              this.b(param1 + 58, 0, 0);
              super.a(param0, param1, -this.field_k + -param2, -this.field_w + -param3);
              id.b((byte) -58);
              rj.field_s.e(param3 + this.field_w, param2 - -this.field_k, this.field_E);
              return;
            }
          }
        } else {
          return;
        }
    }

    private final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        if (param0 != 0) {
          L0: {
            this.b(-18, -2, -61);
            if (!this.field_G) {
              stackIn_12_0 = 0;
              break L0;
            } else {
              if (this.field_H.d((byte) -120) == this) {
                stackIn_12_0 = 256;
                break L0;
              } else {
                stackIn_12_0 = 0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!this.field_G) {
              stackIn_6_0 = 0;
              break L1;
            } else {
              if (this.field_H.d((byte) -120) == this) {
                stackIn_6_0 = 256;
                break L1;
              } else {
                stackIn_6_0 = 0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    public static void e(byte param0) {
        field_B = null;
        field_F = null;
        field_C = null;
        if (param0 != -29) {
            return;
        }
        field_D = null;
    }

    abstract void b(int param0, int param1, int param2);

    boolean d(boolean param0) {
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int var2;
        int var3;
        if (param0) {
          L0: {
            var2 = this.a(0);
            var3 = var2 - this.field_E;
            if (var3 > 0) {
              this.field_E = this.field_E + (8 + (var3 + -1)) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          if ((var3 ^ -1) > -1) {
            L1: {
              L2: {
                this.field_E = this.field_E + (var3 - 16 - -1) / 16;
                if (0 != this.field_E) {
                  break L2;
                } else {
                  if (0 != var2) {
                    break L2;
                  } else {
                    if (this.field_G) {
                      break L2;
                    } else {
                      stackIn_38_0 = 1;
                      break L1;
                    }
                  }
                }
              }
              stackIn_38_0 = 0;
              break L1;
            }
            return stackIn_38_0 != 0;
          } else {
            L3: {
              L4: {
                if (0 != this.field_E) {
                  break L4;
                } else {
                  if (0 != var2) {
                    break L4;
                  } else {
                    if (this.field_G) {
                      break L4;
                    } else {
                      stackIn_32_0 = 1;
                      break L3;
                    }
                  }
                }
              }
              stackIn_32_0 = 0;
              break L3;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          L5: {
            field_B = (String) null;
            var2 = this.a(0);
            var3 = var2 - this.field_E;
            if (var3 > 0) {
              this.field_E = this.field_E + (8 + (var3 + -1)) / 8;
              break L5;
            } else {
              break L5;
            }
          }
          if ((var3 ^ -1) > -1) {
            this.field_E = this.field_E + (var3 - 16 - -1) / 16;
            if (0 == this.field_E) {
              if (0 != var2) {
                return false;
              } else {
                L6: {
                  if (this.field_G) {
                    stackIn_20_0 = 0;
                    break L6;
                  } else {
                    stackIn_20_0 = 1;
                    break L6;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            if (0 == this.field_E) {
              if (0 != var2) {
                return false;
              } else {
                L7: {
                  if (this.field_G) {
                    stackIn_11_0 = 0;
                    break L7;
                  } else {
                    stackIn_11_0 = 1;
                    break L7;
                  }
                }
                return stackIn_11_0 != 0;
              }
            } else {
              return false;
            }
          }
        }
    }

    final rj a(byte param0) {
        rj var2 = super.a(param0);
        if (var2 != null) {
            return var2;
        }
        return (rj) (this);
    }

    boolean h(int param0) {
        if (param0 > 98) {
          this.field_E = this.a(0);
          if (this.field_E == 0) {
            if (this.field_G) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    ui(ei param0, int param1, int param2) {
        super(ml.field_b + -param1 >> -1820756927, -param2 + vf.field_F >> -1655264063, param1, param2, (uk) null);
        try {
            this.field_E = 0;
            this.field_H = param0;
            this.field_G = false;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        this.b(param0, ml.field_b - param0 >> 1359765697, vf.field_F + -param2 >> 2138435233, param2, 23987);
        if (param1 > -4) {
            field_B = (String) null;
        }
    }

    static {
        field_C = new li(12, 0, 1, 0);
        field_D = "Checking";
        field_B = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
