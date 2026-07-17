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
            if (!(null == ((aa) this).field_T)) {
                ((aa) this).field_T.f(0);
            }
            int var3_int = 54 % ((-33 - param0) / 56);
            if (param1 != null) {
                param1.a((byte) 125, 6, ((aa) this).field_N + 6, param1.field_o, param1.field_p);
                ((aa) this).field_T = new fq(param1);
            } else {
                ((aa) this).field_T = new fq();
            }
            ((aa) this).a((gm) (Object) ((aa) this).field_T, -6938);
            ((aa) this).field_V = null;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "aa.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    void c(gm param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((aa) this).field_V = param0;
            if (param1 == 33) {
              if (((aa) this).field_S == gn.field_b) {
                ((aa) this).b(((aa) this).field_N + 12 + ((aa) this).field_V.field_o, (byte) -15, ((aa) this).field_O, ((aa) this).field_V.field_p + 12);
                ((aa) this).field_P = 0;
                return;
              } else {
                if (((aa) this).field_S == gf.field_j) {
                  break L0;
                } else {
                  ((aa) this).field_S = gf.field_j;
                  ((aa) this).field_P = 0;
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("aa.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    aa(ln param0, gm param1, int param2, int param3, int param4) {
        super(param0, param1.field_p + 12, param1.field_o + 12 + param2);
        try {
            ((aa) this).field_R = param3;
            ((aa) this).field_W = param3;
            ((aa) this).field_O = param4;
            ((aa) this).field_N = param2;
            this.b((byte) -124, param1);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "aa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
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
        int var3 = 0;
        var3 = Torquing.field_u;
        if (((aa) this).field_S != null) {
          if (((aa) this).field_S != gf.field_j) {
            if (ql.field_s == ((aa) this).field_S) {
              int fieldTemp$2 = ((aa) this).field_P + 1;
              ((aa) this).field_P = ((aa) this).field_P + 1;
              if (((aa) this).field_R == fieldTemp$2) {
                ((aa) this).field_T.field_D = 256;
                ((aa) this).field_S = null;
                if (param0 != -7) {
                  ((aa) this).g((byte) 13);
                  return super.h(param0);
                } else {
                  return super.h(param0);
                }
              } else {
                ((aa) this).field_T.field_D = (((aa) this).field_P << 8) / ((aa) this).field_R;
                if (param0 != -7) {
                  ((aa) this).g((byte) 13);
                  return super.h(param0);
                } else {
                  return super.h(param0);
                }
              }
            } else {
              if (param0 != -7) {
                ((aa) this).g((byte) 13);
                return super.h(param0);
              } else {
                return super.h(param0);
              }
            }
          } else {
            int fieldTemp$3 = ((aa) this).field_P + 1;
            ((aa) this).field_P = ((aa) this).field_P + 1;
            if (((aa) this).field_W == fieldTemp$3) {
              ((aa) this).field_S = gn.field_b;
              ((aa) this).b(((aa) this).field_V.field_o + (12 + ((aa) this).field_N), (byte) -15, ((aa) this).field_O, 12 - -((aa) this).field_V.field_p);
              ((aa) this).field_T.field_D = 0;
              ((aa) this).field_P = 0;
              if (param0 == -7) {
                return super.h(param0);
              } else {
                ((aa) this).g((byte) 13);
                return super.h(param0);
              }
            } else {
              ((aa) this).field_T.field_D = 256 - (((aa) this).field_P << 8) / ((aa) this).field_W;
              if (param0 == -7) {
                return super.h(param0);
              } else {
                ((aa) this).g((byte) 13);
                return super.h(param0);
              }
            }
          }
        } else {
          if (param0 != -7) {
            ((aa) this).g((byte) 13);
            return super.h(param0);
          } else {
            return super.h(param0);
          }
        }
    }

    boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var5_int = 0;
            if (!super.a(param0, param1, param2, 36)) {
              if (((aa) this).field_T != null) {
                L1: {
                  if (param0 != 98) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((aa) this).field_T.a(param1, false);
                    break L1;
                  }
                }
                L2: {
                  if (param0 != 99) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((aa) this).field_T.a(param1, false);
                    break L2;
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                return false;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("aa.D(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + 55 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final void j(int param0) {
        if (null == ((aa) this).field_S) {
            super.j(param0);
            return;
        }
        if (ql.field_s != ((aa) this).field_S) {
            ((aa) this).a(((aa) this).field_V.field_p + 12, (byte) -25, ((aa) this).field_N + 12 + ((aa) this).field_V.field_o);
            this.b((byte) -101, ((aa) this).field_V);
        } else {
            ((aa) this).field_S = null;
            ((aa) this).field_T.field_D = 256;
            super.j(param0);
            return;
        }
        ((aa) this).field_S = null;
        ((aa) this).field_T.field_D = 256;
        super.j(param0);
    }

    final void g(byte param0) {
        if (gf.field_j != ((aa) this).field_S) {
          ((aa) this).field_S = ql.field_s;
          ((aa) this).field_P = 0;
          if (param0 <= 122) {
            aa.m(2);
            this.b((byte) 83, ((aa) this).field_V);
            ((aa) this).field_V = null;
            ((aa) this).field_T.field_D = 0;
            return;
          } else {
            this.b((byte) 83, ((aa) this).field_V);
            ((aa) this).field_V = null;
            ((aa) this).field_T.field_D = 0;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        ((aa) this).j(0);
        if (param0 < 114) {
            return false;
        }
        return super.a((byte) 122);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new ce();
        field_Q = 0L;
        field_X = new byte[520];
    }
}
