/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa extends im {
    private int field_P;
    private int field_O;
    private int field_W;
    static ce field_U;
    private int field_R;
    private int field_N;
    private qd field_S;
    static byte[] field_X;
    private gm field_V;
    static volatile long field_Q;
    private fq field_T;

    private final void b(byte param0, gm param1) {
        try {
            if (!(null == this.field_T)) {
                this.field_T.f(0);
            }
            int var3_int = 54 % ((-33 - param0) / 56);
            if (param1 != null) {
                param1.a((byte) 125, 6, this.field_N + 6, param1.field_o, param1.field_p);
                this.field_T = new fq(param1);
            } else {
                this.field_T = new fq();
            }
            this.a(this.field_T, -6938);
            this.field_V = null;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "aa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void c(gm param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_V = param0;
            if (param1 == 33) {
              if (this.field_S == gn.field_b) {
                this.b(this.field_N + 12 + this.field_V.field_o, (byte) -15, this.field_O, this.field_V.field_p + 12);
                this.field_P = 0;
                return;
              } else {
                if (this.field_S == gf.field_j) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.field_S = gf.field_j;
                  this.field_P = 0;
                  return;
                }
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
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("aa.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    aa(ln param0, gm param1, int param2, int param3, int param4) {
        super(param0, param1.field_p + 12, param1.field_o + 12 + param2);
        try {
            this.field_R = param3;
            this.field_W = param3;
            this.field_O = param4;
            this.field_N = param2;
            this.b((byte) -124, param1);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "aa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void m(int param0) {
        field_X = null;
        if (param0 != 0) {
            return;
        }
        field_U = null;
    }

    boolean h(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = Torquing.field_u;
        if (this.field_S != null) {
          if (this.field_S != gf.field_j) {
            if (ql.field_s == this.field_S) {
              fieldTemp$2 = this.field_P + 1;
              this.field_P = this.field_P + 1;
              if (this.field_R == fieldTemp$2) {
                this.field_T.field_D = 256;
                this.field_S = null;
                if (param0 != -7) {
                  this.g((byte) 13);
                  return super.h(param0 + 0);
                } else {
                  return super.h(param0 + 0);
                }
              } else {
                this.field_T.field_D = (this.field_P << -1195325816) / this.field_R;
                if (param0 != -7) {
                  this.g((byte) 13);
                  return super.h(param0 + 0);
                } else {
                  return super.h(param0 + 0);
                }
              }
            } else {
              if (param0 != -7) {
                this.g((byte) 13);
                return super.h(param0 + 0);
              } else {
                return super.h(param0 + 0);
              }
            }
          } else {
            fieldTemp$3 = this.field_P + 1;
            this.field_P = this.field_P + 1;
            if (this.field_W == fieldTemp$3) {
              this.field_S = gn.field_b;
              this.b(this.field_V.field_o + (12 + this.field_N), (byte) -15, this.field_O, 12 - -this.field_V.field_p);
              this.field_T.field_D = 0;
              this.field_P = 0;
              if (param0 == -7) {
                return super.h(param0 + 0);
              } else {
                this.g((byte) 13);
                return super.h(param0 + 0);
              }
            } else {
              this.field_T.field_D = 256 - (this.field_P << -1936665496) / this.field_W;
              if (param0 == -7) {
                return super.h(param0 + 0);
              } else {
                this.g((byte) 13);
                return super.h(param0 + 0);
              }
            }
          }
        } else {
          if (param0 != -7) {
            this.g((byte) 13);
            return super.h(param0 + 0);
          } else {
            return super.h(param0 + 0);
          }
        }
    }

    boolean a(int param0, gm param1, char param2, int param3) {
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
            var5_int = 55 % ((-33 - param3) / 57);
            if (!super.a(param0, param1, param2, 36)) {
              if (this.field_T != null) {
                L1: {
                  if (param0 != 98) {
                    break L1;
                  } else {
                    this.field_T.a(param1, false);
                    break L1;
                  }
                }
                L2: {
                  if (-100 != (param0 ^ -1)) {
                    break L2;
                  } else {
                    this.field_T.a(param1, false);
                    break L2;
                  }
                }
                stackIn_10_0 = 0;
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
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("aa.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final void j(int param0) {
        if (null == this.field_S) {
            super.j(param0);
            return;
        }
        if (ql.field_s != this.field_S) {
            this.a(this.field_V.field_p + 12, (byte) -25, this.field_N + 12 + this.field_V.field_o);
            this.b((byte) -101, this.field_V);
        } else {
            this.field_S = null;
            this.field_T.field_D = 256;
            super.j(param0);
            return;
        }
        this.field_S = null;
        this.field_T.field_D = 256;
        super.j(param0);
    }

    final void g(byte param0) {
        if (gf.field_j != this.field_S) {
          this.field_S = ql.field_s;
          this.field_P = 0;
          if (param0 <= 122) {
            aa.m(2);
            this.b((byte) 83, this.field_V);
            this.field_V = null;
            this.field_T.field_D = 0;
            return;
          } else {
            this.b((byte) 83, this.field_V);
            this.field_V = null;
            this.field_T.field_D = 0;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        this.j(0);
        if (param0 < 114) {
            return false;
        }
        return super.a((byte) 122);
    }

    static {
        field_U = new ce();
        field_Q = 0L;
        field_X = new byte[520];
    }
}
