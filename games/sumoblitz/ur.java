/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ur extends hf {
    private pk field_V;
    private int field_W;
    private int field_S;
    static String field_X;
    private in field_P;
    private int field_Z;
    static float field_R;
    static int field_Q;
    private jf field_Y;
    private int field_U;
    private int field_T;
    static int field_O;

    ur(dg param0, pk param1, int param2, int param3, int param4) {
        super(param0, param1.field_q + 12, param1.field_p + (12 + param2));
        try {
            this.field_U = param2;
            this.field_S = param3;
            this.field_T = param3;
            this.field_Z = param4;
            this.b(param1, -125);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ur.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean g(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (null != this.field_Y) {
          if (this.field_Y != sr.field_i) {
            if (this.field_Y == mm.field_a) {
              fieldTemp$2 = this.field_W + 1;
              this.field_W = this.field_W + 1;
              if (this.field_S != fieldTemp$2) {
                this.field_P.field_A = (this.field_W << 1474033192) / this.field_S;
                if (param0 != -28778) {
                  this.field_T = 19;
                  return super.g(-28778);
                } else {
                  return super.g(-28778);
                }
              } else {
                this.field_Y = null;
                this.field_P.field_A = 256;
                if (param0 != -28778) {
                  this.field_T = 19;
                  return super.g(-28778);
                } else {
                  return super.g(-28778);
                }
              }
            } else {
              if (param0 != -28778) {
                this.field_T = 19;
                return super.g(-28778);
              } else {
                return super.g(-28778);
              }
            }
          } else {
            fieldTemp$3 = this.field_W + 1;
            this.field_W = this.field_W + 1;
            if (fieldTemp$3 == this.field_T) {
              this.field_Y = lw.field_a;
              this.a(false, this.field_U + (12 + this.field_V.field_p), this.field_Z, this.field_V.field_q + 12);
              this.field_W = 0;
              this.field_P.field_A = 0;
              if (param0 == -28778) {
                return super.g(-28778);
              } else {
                this.field_T = 19;
                return super.g(-28778);
              }
            } else {
              this.field_P.field_A = 256 + -((this.field_W << -1588147576) / this.field_T);
              if (param0 == -28778) {
                return super.g(-28778);
              } else {
                this.field_T = 19;
                return super.g(-28778);
              }
            }
          }
        } else {
          if (param0 != -28778) {
            this.field_T = 19;
            return super.g(-28778);
          } else {
            return super.g(-28778);
          }
        }
    }

    final void f(byte param0) {
        if (!(null == this.field_Y)) {
            if (!(mm.field_a == this.field_Y)) {
                this.c(12 + this.field_V.field_q, this.field_V.field_p + (this.field_U + 12), 79);
                this.b(this.field_V, -124);
            }
            this.field_P.field_A = 256;
            this.field_Y = null;
        }
        super.f(param0);
    }

    final boolean h(int param0) {
        if (param0 != 0) {
            return true;
        }
        this.f((byte) -128);
        return super.h(param0 ^ 0);
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 >= 9) {
                break L1;
              } else {
                this.i(96);
                break L1;
              }
            }
            if (!super.a(param0, param1, (byte) 42, param3)) {
              if (this.field_P != null) {
                L2: {
                  if ((param3 ^ -1) == -99) {
                    this.field_P.a(param0, (byte) 61);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-100 != (param3 ^ -1)) {
                    break L3;
                  } else {
                    this.field_P.a(param0, (byte) 61);
                    break L3;
                  }
                }
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            } else {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("ur.KA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    private final void b(pk param0, int param1) {
        try {
            int var3_int = -16 / ((param1 - -72) / 51);
            if (!(this.field_P == null)) {
                this.field_P.b(false);
            }
            if (param0 == null) {
                this.field_P = new in();
            } else {
                param0.a(107, 6, this.field_U + 6, param0.field_p, param0.field_q);
                this.field_P = new in(param0);
            }
            this.a(this.field_P, 124);
            this.field_V = null;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ur.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void b(byte param0, pk param1) {
        RuntimeException var3 = null;
        pk var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -87) {
                break L1;
              } else {
                var4 = (pk) null;
                this.b((pk) null, 78);
                break L1;
              }
            }
            this.field_V = param1;
            if (lw.field_a == this.field_Y) {
              this.a(false, this.field_V.field_p + this.field_U + 12, this.field_Z, this.field_V.field_q + 12);
              this.field_W = 0;
              return;
            } else {
              if (this.field_Y == sr.field_i) {
                break L0;
              } else {
                this.field_Y = sr.field_i;
                this.field_W = 0;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ur.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public static void k(int param0) {
        if (param0 != 0) {
            ur.k(65);
            field_X = null;
            return;
        }
        field_X = null;
    }

    final void i(int param0) {
        if (!(this.field_Y != sr.field_i)) {
            return;
        }
        this.field_W = param0;
        this.field_Y = mm.field_a;
        this.b(this.field_V, -124);
        this.field_P.field_A = 0;
        this.field_V = null;
    }

    static {
        field_Q = -1;
        field_X = "Passwords can only contain letters and numbers";
    }
}
