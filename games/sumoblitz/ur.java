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
            ((ur) this).field_U = param2;
            ((ur) this).field_S = param3;
            ((ur) this).field_T = param3;
            ((ur) this).field_Z = param4;
            this.b(param1, -125);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ur.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean g(int param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (null != ((ur) this).field_Y) {
          if (((ur) this).field_Y != sr.field_i) {
            if (((ur) this).field_Y == mm.field_a) {
              int fieldTemp$2 = ((ur) this).field_W + 1;
              ((ur) this).field_W = ((ur) this).field_W + 1;
              if (((ur) this).field_S != fieldTemp$2) {
                ((ur) this).field_P.field_A = (((ur) this).field_W << 8) / ((ur) this).field_S;
                if (param0 != -28778) {
                  ((ur) this).field_T = 19;
                  return super.g(-28778);
                } else {
                  return super.g(-28778);
                }
              } else {
                ((ur) this).field_Y = null;
                ((ur) this).field_P.field_A = 256;
                if (param0 != -28778) {
                  ((ur) this).field_T = 19;
                  return super.g(-28778);
                } else {
                  return super.g(-28778);
                }
              }
            } else {
              if (param0 != -28778) {
                ((ur) this).field_T = 19;
                return super.g(-28778);
              } else {
                return super.g(-28778);
              }
            }
          } else {
            int fieldTemp$3 = ((ur) this).field_W + 1;
            ((ur) this).field_W = ((ur) this).field_W + 1;
            if (fieldTemp$3 == ((ur) this).field_T) {
              ((ur) this).field_Y = lw.field_a;
              ((ur) this).a(false, ((ur) this).field_U + (12 + ((ur) this).field_V.field_p), ((ur) this).field_Z, ((ur) this).field_V.field_q + 12);
              ((ur) this).field_W = 0;
              ((ur) this).field_P.field_A = 0;
              if (param0 == -28778) {
                return super.g(-28778);
              } else {
                ((ur) this).field_T = 19;
                return super.g(-28778);
              }
            } else {
              ((ur) this).field_P.field_A = 256 + -((((ur) this).field_W << 8) / ((ur) this).field_T);
              if (param0 == -28778) {
                return super.g(-28778);
              } else {
                ((ur) this).field_T = 19;
                return super.g(-28778);
              }
            }
          }
        } else {
          if (param0 != -28778) {
            ((ur) this).field_T = 19;
            return super.g(-28778);
          } else {
            return super.g(-28778);
          }
        }
    }

    final void f(byte param0) {
        if (!(null == ((ur) this).field_Y)) {
            if (!(mm.field_a == ((ur) this).field_Y)) {
                ((ur) this).c(12 + ((ur) this).field_V.field_q, ((ur) this).field_V.field_p + (((ur) this).field_U + 12), 79);
                this.b(((ur) this).field_V, -124);
            }
            ((ur) this).field_P.field_A = 256;
            ((ur) this).field_Y = null;
        }
        super.f(param0);
    }

    final boolean h(int param0) {
        if (param0 != 0) {
            return true;
        }
        ((ur) this).f((byte) -128);
        return super.h(param0);
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, (byte) 42, param3)) {
              if (((ur) this).field_P != null) {
                L1: {
                  if (param3 == 98) {
                    boolean discarded$4 = ((ur) this).field_P.a(param0, (byte) 61);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param3 != 99) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((ur) this).field_P.a(param0, (byte) 61);
                    break L2;
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
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
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ur.KA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + 51 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    private final void b(pk param0, int param1) {
        try {
            int var3_int = -16 / ((param1 - -72) / 51);
            if (!(((ur) this).field_P == null)) {
                ((ur) this).field_P.b(false);
            }
            if (param0 == null) {
                ((ur) this).field_P = new in();
            } else {
                param0.a(107, 6, ((ur) this).field_U + 6, param0.field_p, param0.field_q);
                ((ur) this).field_P = new in(param0);
            }
            ((ur) this).a((pk) (Object) ((ur) this).field_P, 124);
            ((ur) this).field_V = null;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ur.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void b(byte param0, pk param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
            L1: {
              if (param0 < -87) {
                break L1;
              } else {
                var4 = null;
                this.b((pk) null, 78);
                break L1;
              }
            }
            ((ur) this).field_V = param1;
            if (lw.field_a == ((ur) this).field_Y) {
              ((ur) this).a(false, ((ur) this).field_V.field_p + ((ur) this).field_U + 12, ((ur) this).field_Z, ((ur) this).field_V.field_q + 12);
              ((ur) this).field_W = 0;
              return;
            } else {
              if (((ur) this).field_Y == sr.field_i) {
                break L0;
              } else {
                ((ur) this).field_Y = sr.field_i;
                ((ur) this).field_W = 0;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ur.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
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
        if (!(((ur) this).field_Y != sr.field_i)) {
            return;
        }
        ((ur) this).field_W = param0;
        ((ur) this).field_Y = mm.field_a;
        this.b(((ur) this).field_V, -124);
        ((ur) this).field_P.field_A = 0;
        ((ur) this).field_V = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = -1;
        field_X = "Passwords can only contain letters and numbers";
    }
}
