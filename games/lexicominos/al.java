/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends nb {
    static ng field_C;
    private eg field_B;
    boolean field_D;
    private int field_E;
    static String field_G;
    static gk field_F;
    static ei field_H;

    private final int g(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        if (param0 >= -70) {
          L0: {
            this.field_E = -87;
            if (!this.field_D) {
              stackIn_12_0 = 0;
              break L0;
            } else {
              if (this != this.field_B.e(false)) {
                stackIn_12_0 = 0;
                break L0;
              } else {
                stackIn_12_0 = 256;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!this.field_D) {
              stackIn_6_0 = 0;
              break L1;
            } else {
              if (this != this.field_B.e(false)) {
                stackIn_6_0 = 0;
                break L1;
              } else {
                stackIn_6_0 = 256;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (this.field_E != 0) {
          if (256 > this.field_E) {
            if (ki.field_c != null) {
              if (ki.field_c.field_p >= this.field_j) {
                if (this.field_v > ki.field_c.field_u) {
                  ki.field_c = new db(this.field_j, this.field_v);
                  de.a(ki.field_c, param0 + 121);
                  lf.a();
                  this.a(0, (byte) 115, 0);
                  super.a(param0, -this.field_o + -param1, -param2 - this.field_t, param3);
                  pd.a(-22949);
                  ki.field_c.b(param2 - -this.field_t, this.field_o + param1, this.field_E);
                  return;
                } else {
                  de.a(ki.field_c, param0 + 121);
                  lf.a();
                  this.a(0, (byte) 115, 0);
                  super.a(param0, -this.field_o + -param1, -param2 - this.field_t, param3);
                  pd.a(-22949);
                  ki.field_c.b(param2 - -this.field_t, this.field_o + param1, this.field_E);
                  return;
                }
              } else {
                ki.field_c = new db(this.field_j, this.field_v);
                de.a(ki.field_c, param0 + 121);
                lf.a();
                this.a(0, (byte) 115, 0);
                super.a(param0, -this.field_o + -param1, -param2 - this.field_t, param3);
                pd.a(-22949);
                ki.field_c.b(param2 - -this.field_t, this.field_o + param1, this.field_E);
                return;
              }
            } else {
              ki.field_c = new db(this.field_j, this.field_v);
              de.a(ki.field_c, param0 + 121);
              lf.a();
              this.a(0, (byte) 115, 0);
              super.a(param0, -this.field_o + -param1, -param2 - this.field_t, param3);
              pd.a(-22949);
              ki.field_c.b(param2 - -this.field_t, this.field_o + param1, this.field_E);
              return;
            }
          } else {
            if (-1 != (param3 ^ -1)) {
              return;
            } else {
              this.a(param1 - -this.field_o, (byte) -99, this.field_t + param2);
              super.a((byte) -115, param1, param2, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean a(byte param0) {
        if (param0 == 26) {
          this.field_E = this.g(-101);
          if (0 == this.field_E) {
            if (this.field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.a(-114, (byte) -25, 68);
          this.field_E = this.g(-101);
          if (0 == this.field_E) {
            if (this.field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    al(eg param0, int param1, int param2) {
        super(-param1 + ql.field_O >> 203577121, kg.field_C - param2 >> -1914076895, param1, param2, (rd) null);
        try {
            this.field_D = false;
            this.field_E = 0;
            this.field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final w e(int param0) {
        w var2 = super.e(param0);
        if (var2 != null) {
            return var2;
        }
        return (w) (this);
    }

    public static void d(byte param0) {
        if (param0 <= 0) {
            return;
        }
        field_G = null;
        field_F = null;
        field_C = null;
        field_H = null;
    }

    boolean f(byte param0) {
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int var2;
        int var3;
        L0: {
          var2 = this.g(-111);
          var3 = -this.field_E + var2;
          if ((var3 ^ -1) < -1) {
            this.field_E = this.field_E + (-1 + (var3 + 8)) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= -21) {
          if (0 > var3) {
            L1: {
              L2: {
                this.field_E = this.field_E + (var3 + -16 + 1) / 16;
                if (this.field_E != 0) {
                  break L2;
                } else {
                  if (-1 != (var2 ^ -1)) {
                    break L2;
                  } else {
                    if (this.field_D) {
                      break L2;
                    } else {
                      stackIn_36_0 = 1;
                      break L1;
                    }
                  }
                }
              }
              stackIn_36_0 = 0;
              break L1;
            }
            return stackIn_36_0 != 0;
          } else {
            L3: {
              L4: {
                if (this.field_E != 0) {
                  break L4;
                } else {
                  if (-1 != (var2 ^ -1)) {
                    break L4;
                  } else {
                    if (this.field_D) {
                      break L4;
                    } else {
                      stackIn_30_0 = 1;
                      break L3;
                    }
                  }
                }
              }
              stackIn_30_0 = 0;
              break L3;
            }
            return stackIn_30_0 != 0;
          }
        } else {
          al.e((byte) -102);
          if (0 > var3) {
            this.field_E = this.field_E + (var3 + -16 + 1) / 16;
            if (this.field_E == 0) {
              if (-1 != (var2 ^ -1)) {
                return false;
              } else {
                L5: {
                  if (this.field_D) {
                    stackIn_21_0 = 0;
                    break L5;
                  } else {
                    stackIn_21_0 = 1;
                    break L5;
                  }
                }
                return stackIn_21_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            if (this.field_E == 0) {
              if (-1 != (var2 ^ -1)) {
                return false;
              } else {
                L6: {
                  if (this.field_D) {
                    stackIn_11_0 = 0;
                    break L6;
                  } else {
                    stackIn_11_0 = 1;
                    break L6;
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

    abstract void a(int param0, byte param1, int param2);

    final static void a(int param0, String param1, float param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              pb.field_j = param1;
              tl.field_g = param2;
              if (param0 == 16) {
                break L1;
              } else {
                al.e((byte) 114);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("al.RA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        this.a(param2, param0, true, -param2 + kg.field_C >> -1925371807, ql.field_O - param0 >> -257670367);
        if (param1 >= -94) {
            field_H = (ei) null;
        }
    }

    final static Boolean e(byte param0) {
        if (param0 >= -109) {
            return (Boolean) null;
        }
        Boolean var1 = wh.field_d;
        wh.field_d = null;
        return var1;
    }

    static {
        field_G = "Create a free account to start using this feature";
        field_C = new ng();
        field_F = new gk();
    }
}
