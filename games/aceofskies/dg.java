/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dg extends rg {
    private hi field_M;
    private int field_K;
    static int[] field_Q;
    private int field_S;
    static String field_L;
    private int field_O;
    private int field_N;
    private of field_R;
    private int field_J;
    private ea field_P;

    final void f(byte param0) {
        if (vu.field_g != this.field_R) {
          this.field_R = ha.field_b;
          this.field_K = 0;
          if (param0 >= -28) {
            this.h(-95);
            this.c(this.field_P, -15291);
            this.field_P = null;
            this.field_M.field_u = 0;
            return;
          } else {
            this.c(this.field_P, -15291);
            this.field_P = null;
            this.field_M.field_u = 0;
            return;
          }
        } else {
          return;
        }
    }

    final boolean i(int param0) {
        this.e((byte) 82);
        int var2 = -118 / ((20 - param0) / 62);
        return super.i(126);
    }

    final void e(byte param0) {
        if (param0 <= 26) {
            this.h(127);
            if (null == this.field_R) {
                super.e((byte) 101);
                return;
            }
            if (ha.field_b != this.field_R) {
                this.a(12 + this.field_P.field_q, (byte) 29, this.field_P.field_n + this.field_N + 12);
                this.c(this.field_P, -15291);
            } else {
                this.field_R = null;
                this.field_M.field_u = 256;
                super.e((byte) 101);
                return;
            }
            this.field_R = null;
            this.field_M.field_u = 256;
            super.e((byte) 101);
            return;
        }
        if (null == this.field_R) {
            super.e((byte) 101);
            return;
        }
        if (ha.field_b != this.field_R) {
            this.a(12 + this.field_P.field_q, (byte) 29, this.field_P.field_n + this.field_N + 12);
            this.c(this.field_P, -15291);
        } else {
            this.field_R = null;
            this.field_M.field_u = 256;
            super.e((byte) 101);
            return;
        }
        this.field_R = null;
        this.field_M.field_u = 256;
        super.e((byte) 101);
    }

    void d(ea param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -30244) {
              break L0;
            } else {
              this.field_N = -48;
              break L0;
            }
          }
          this.field_P = param0;
          if (this.field_R == we.field_a) {
            this.a(param1 + 30131, this.field_P.field_n + 12 + this.field_N, this.field_P.field_q + 12, this.field_S);
            this.field_K = 0;
            return;
          } else {
            if (this.field_R != vu.field_g) {
              this.field_K = 0;
              this.field_R = vu.field_g;
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("dg.CA(");

            if (param0 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    boolean h(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (this.field_R == null) {
          if (param0 != 11) {
            this.f((byte) 126);
            return super.h(11);
          } else {
            return super.h(11);
          }
        } else {
          if (this.field_R != vu.field_g) {
            if (ha.field_b == this.field_R) {
              fieldTemp$2 = this.field_K + 1;
              this.field_K = this.field_K + 1;
              if (fieldTemp$2 != this.field_J) {
                this.field_M.field_u = (this.field_K << 224045032) / this.field_J;
                if (param0 != 11) {
                  this.f((byte) 126);
                  return super.h(11);
                } else {
                  return super.h(11);
                }
              } else {
                this.field_R = null;
                this.field_M.field_u = 256;
                if (param0 != 11) {
                  this.f((byte) 126);
                  return super.h(11);
                } else {
                  return super.h(11);
                }
              }
            } else {
              if (param0 != 11) {
                this.f((byte) 126);
                return super.h(11);
              } else {
                return super.h(11);
              }
            }
          } else {
            fieldTemp$3 = this.field_K + 1;
            this.field_K = this.field_K + 1;
            if (fieldTemp$3 == this.field_O) {
              this.field_R = we.field_a;
              this.a(-34, this.field_N + (12 + this.field_P.field_n), this.field_P.field_q + 12, this.field_S);
              this.field_K = 0;
              this.field_M.field_u = 0;
              if (param0 == 11) {
                return super.h(11);
              } else {
                this.f((byte) 126);
                return super.h(11);
              }
            } else {
              this.field_M.field_u = 256 - (this.field_K << 749379592) / this.field_O;
              if (param0 == 11) {
                return super.h(11);
              } else {
                this.f((byte) 126);
                return super.h(11);
              }
            }
          }
        }
    }

    boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 71 % ((-53 - param0) / 33);
            if (!super.a(82, param1, param2, param3)) {
              if (this.field_M != null) {
                L1: {
                  if (param1 != 98) {
                    break L1;
                  } else {
                    this.field_M.a(param3, (byte) -42);
                    break L1;
                  }
                }
                L2: {
                  if (-100 == (param1 ^ -1)) {
                    this.field_M.a(param3, (byte) -42);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
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
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("dg.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    private final void c(ea param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_M == null) {
                break L1;
              } else {
                this.field_M.c(-127);
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                this.field_M = new hi();
                break L2;
              } else {
                param0.a(param0.field_n, 6, this.field_N + 6, param0.field_q, (byte) 124);
                this.field_M = new hi(param0);
                break L2;
              }
            }
            this.a(this.field_M, 1);
            this.field_P = null;
            if (param1 == -15291) {
              break L0;
            } else {
              this.field_O = -42;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("dg.KB(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public static void k(int param0) {
        field_L = null;
        if (param0 != 12) {
            dg.j(-73);
            field_Q = null;
            return;
        }
        field_Q = null;
    }

    dg(lt param0, ea param1, int param2, int param3, int param4) {
        super(param0, param1.field_q + 12, param2 + 12 - -param1.field_n);
        try {
            this.field_S = param4;
            this.field_J = param3;
            this.field_O = param3;
            this.field_N = param2;
            this.c(param1, -15291);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "dg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean j(int param0) {
        int stackIn_8_0 = 0;
        if (param0 == 27711) {
          if (10 <= ob.field_d) {
            if (ks.field_b) {
              return false;
            } else {
              L0: {
                if (tg.a(-90)) {
                  stackIn_8_0 = 0;
                  break L0;
                } else {
                  stackIn_8_0 = 1;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    static {
        field_Q = new int[2];
        field_L = "Please enter your age in years";
    }
}
