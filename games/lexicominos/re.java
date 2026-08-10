/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class re extends ql {
    private w field_W;
    private int field_Y;
    private int field_bb;
    static java.math.BigInteger field_T;
    private int field_S;
    private ia field_U;
    private rb field_R;
    static String field_cb;
    private int field_V;
    private int field_ab;
    static ge field_X;
    static int field_Z;

    boolean f(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (this.field_R != null) {
          if (this.field_R == ok.field_k) {
            fieldTemp$0 = this.field_V + 1;
            this.field_V = this.field_V + 1;
            if (fieldTemp$0 != this.field_S) {
              this.field_U.field_E = -((this.field_V << -265658136) / this.field_S) + 256;
              if (param0 >= -21) {
                return false;
              } else {
                return super.f((byte) -102);
              }
            } else {
              this.field_R = fb.field_f;
              this.a(12 + this.field_W.field_j, (byte) -91, this.field_Y, this.field_ab + 12 + this.field_W.field_v);
              this.field_U.field_E = 0;
              this.field_V = 0;
              if (param0 >= -21) {
                return false;
              } else {
                return super.f((byte) -102);
              }
            }
          } else {
            if (this.field_R == rl.field_H) {
              fieldTemp$1 = this.field_V + 1;
              this.field_V = this.field_V + 1;
              if (fieldTemp$1 == this.field_bb) {
                this.field_U.field_E = 256;
                this.field_R = null;
                if (param0 >= -21) {
                  return false;
                } else {
                  return super.f((byte) -102);
                }
              } else {
                this.field_U.field_E = (this.field_V << 303147688) / this.field_bb;
                if (param0 >= -21) {
                  return false;
                } else {
                  return super.f((byte) -102);
                }
              }
            } else {
              if (param0 >= -21) {
                return false;
              } else {
                return super.f((byte) -102);
              }
            }
          }
        } else {
          if (param0 >= -21) {
            return false;
          } else {
            return super.f((byte) -102);
          }
        }
    }

    public static void i(byte param0) {
        field_X = null;
        field_T = null;
        field_cb = null;
        if (param0 != -27) {
            field_cb = (String) null;
        }
    }

    re(eg param0, w param1, int param2, int param3, int param4) {
        super(param0, param1.field_j + 12, param1.field_v + (param2 + 12));
        try {
            this.field_ab = param2;
            this.field_bb = param3;
            this.field_S = param3;
            this.field_Y = param4;
            this.a(param1, (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, (byte) 99)) {
              L1: {
                if (null != this.field_U) {
                  L2: {
                    if (param1 != 98) {
                      break L2;
                    } else {
                      this.field_U.a((byte) 44, param2);
                      break L2;
                    }
                  }
                  if ((param1 ^ -1) != -100) {
                    break L1;
                  } else {
                    this.field_U.a((byte) 44, param2);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              var5_int = -75 / ((-13 - param3) / 55);
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("re.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final void a(w param0, byte param1) {
        try {
            if (param1 != 125) {
                w var4 = (w) null;
                this.a((w) null, (byte) -90);
            }
            if (!(null == this.field_U)) {
                this.field_U.b((byte) -118);
            }
            if (param0 == null) {
                this.field_U = new ia();
            } else {
                param0.a(param0.field_v, param0.field_j, true, this.field_ab + 6, 6);
                this.field_U = new ia(param0);
            }
            this.b((byte) 57, (w) (this.field_U));
            this.field_W = null;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "re.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void h(byte param0) {
        if (ok.field_k == this.field_R) {
          return;
        } else {
          if (param0 != 38) {
            this.field_Y = 51;
            this.field_R = rl.field_H;
            this.field_V = 0;
            this.a(this.field_W, (byte) 125);
            this.field_U.field_E = 0;
            this.field_W = null;
            return;
          } else {
            this.field_R = rl.field_H;
            this.field_V = 0;
            this.a(this.field_W, (byte) 125);
            this.field_U.field_E = 0;
            this.field_W = null;
            return;
          }
        }
    }

    final boolean a(byte param0) {
        if (param0 != 26) {
            return false;
        }
        this.f(true);
        return super.a((byte) 26);
    }

    final void f(boolean param0) {
        if (!param0) {
          L0: {
            this.field_R = (rb) null;
            if (this.field_R == null) {
              break L0;
            } else {
              L1: {
                if (rl.field_H != this.field_R) {
                  this.b(this.field_W.field_j + 12, -119, this.field_W.field_v + (12 + this.field_ab));
                  this.a(this.field_W, (byte) 125);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_U.field_E = 256;
              this.field_R = null;
              break L0;
            }
          }
          super.f(param0);
          return;
        } else {
          L2: {
            if (this.field_R == null) {
              break L2;
            } else {
              L3: {
                if (rl.field_H != this.field_R) {
                  this.b(this.field_W.field_j + 12, -119, this.field_W.field_v + (12 + this.field_ab));
                  this.a(this.field_W, (byte) 125);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_U.field_E = 256;
              this.field_R = null;
              break L2;
            }
          }
          super.f(param0);
          return;
        }
    }

    void b(int param0, w param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 115) {
              this.field_W = param1;
              if (fb.field_f != this.field_R) {
                if (this.field_R != ok.field_k) {
                  this.field_R = ok.field_k;
                  this.field_V = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return;
                }
              } else {
                this.a(this.field_W.field_j + 12, (byte) -125, this.field_Y, this.field_W.field_v + (12 - -this.field_ab));
                this.field_V = 0;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("re.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_T = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_cb = "This entry doesn't match";
        field_Z = 0;
    }
}
