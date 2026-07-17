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
        if (vu.field_g != ((dg) this).field_R) {
          ((dg) this).field_R = ha.field_b;
          ((dg) this).field_K = 0;
          if (param0 >= -28) {
            boolean discarded$6 = ((dg) this).h(-95);
            int discarded$7 = -15291;
            this.c(((dg) this).field_P);
            ((dg) this).field_P = null;
            ((dg) this).field_M.field_u = 0;
            return;
          } else {
            int discarded$8 = -15291;
            this.c(((dg) this).field_P);
            ((dg) this).field_P = null;
            ((dg) this).field_M.field_u = 0;
            return;
          }
        } else {
          return;
        }
    }

    final boolean i(int param0) {
        ((dg) this).e((byte) 82);
        int var2 = -118 / ((20 - param0) / 62);
        return super.i(126);
    }

    final void e(byte param0) {
        if (param0 <= 26) {
            boolean discarded$4 = ((dg) this).h(127);
            if (null == ((dg) this).field_R) {
                super.e((byte) 101);
                return;
            }
            if (ha.field_b != ((dg) this).field_R) {
                ((dg) this).a(12 + ((dg) this).field_P.field_q, (byte) 29, ((dg) this).field_P.field_n + ((dg) this).field_N + 12);
                int discarded$5 = -15291;
                this.c(((dg) this).field_P);
            } else {
                ((dg) this).field_R = null;
                ((dg) this).field_M.field_u = 256;
                super.e((byte) 101);
                return;
            }
            ((dg) this).field_R = null;
            ((dg) this).field_M.field_u = 256;
            super.e((byte) 101);
            return;
        }
        if (null == ((dg) this).field_R) {
            super.e((byte) 101);
            return;
        }
        if (ha.field_b != ((dg) this).field_R) {
            ((dg) this).a(12 + ((dg) this).field_P.field_q, (byte) 29, ((dg) this).field_P.field_n + ((dg) this).field_N + 12);
            int discarded$6 = -15291;
            this.c(((dg) this).field_P);
        } else {
            ((dg) this).field_R = null;
            ((dg) this).field_M.field_u = 256;
            super.e((byte) 101);
            return;
        }
        ((dg) this).field_R = null;
        ((dg) this).field_M.field_u = 256;
        super.e((byte) 101);
    }

    void d(ea param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 == -30244) {
              break L0;
            } else {
              ((dg) this).field_N = -48;
              break L0;
            }
          }
          ((dg) this).field_P = param0;
          if (((dg) this).field_R == we.field_a) {
            ((dg) this).a(param1 + 30131, ((dg) this).field_P.field_n + 12 + ((dg) this).field_N, ((dg) this).field_P.field_q + 12, ((dg) this).field_S);
            ((dg) this).field_K = 0;
            return;
          } else {
            if (((dg) this).field_R != vu.field_g) {
              ((dg) this).field_K = 0;
              ((dg) this).field_R = vu.field_g;
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("dg.CA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    boolean h(int param0) {
        int var3 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (((dg) this).field_R == null) {
          if (param0 != 11) {
            ((dg) this).f((byte) 126);
            return super.h(11);
          } else {
            return super.h(11);
          }
        } else {
          if (((dg) this).field_R != vu.field_g) {
            if (ha.field_b == ((dg) this).field_R) {
              int fieldTemp$2 = ((dg) this).field_K + 1;
              ((dg) this).field_K = ((dg) this).field_K + 1;
              if (fieldTemp$2 != ((dg) this).field_J) {
                ((dg) this).field_M.field_u = (((dg) this).field_K << 8) / ((dg) this).field_J;
                if (param0 != 11) {
                  ((dg) this).f((byte) 126);
                  return super.h(11);
                } else {
                  return super.h(11);
                }
              } else {
                ((dg) this).field_R = null;
                ((dg) this).field_M.field_u = 256;
                if (param0 != 11) {
                  ((dg) this).f((byte) 126);
                  return super.h(11);
                } else {
                  return super.h(11);
                }
              }
            } else {
              if (param0 != 11) {
                ((dg) this).f((byte) 126);
                return super.h(11);
              } else {
                return super.h(11);
              }
            }
          } else {
            int fieldTemp$3 = ((dg) this).field_K + 1;
            ((dg) this).field_K = ((dg) this).field_K + 1;
            if (fieldTemp$3 == ((dg) this).field_O) {
              ((dg) this).field_R = we.field_a;
              ((dg) this).a(-34, ((dg) this).field_N + (12 + ((dg) this).field_P.field_n), ((dg) this).field_P.field_q + 12, ((dg) this).field_S);
              ((dg) this).field_K = 0;
              ((dg) this).field_M.field_u = 0;
              if (param0 == 11) {
                return super.h(11);
              } else {
                ((dg) this).f((byte) 126);
                return super.h(11);
              }
            } else {
              ((dg) this).field_M.field_u = 256 - (((dg) this).field_K << 8) / ((dg) this).field_O;
              if (param0 == 11) {
                return super.h(11);
              } else {
                ((dg) this).f((byte) 126);
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
            var5_int = 1;
            if (!super.a(82, param1, param2, param3)) {
              if (((dg) this).field_M != null) {
                L1: {
                  if (param1 != 98) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((dg) this).field_M.a(param3, (byte) -42);
                    break L1;
                  }
                }
                L2: {
                  if (param1 == 99) {
                    boolean discarded$5 = ((dg) this).field_M.a(param3, (byte) -42);
                    break L2;
                  } else {
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
            stackOut_12_1 = new StringBuilder().append("dg.G(").append(23).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    private final void c(ea param0) {
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
            if (((dg) this).field_M == null) {
              break L0;
            } else {
              ((dg) this).field_M.c(-127);
              break L0;
            }
          }
          L1: {
            if (param0 == null) {
              ((dg) this).field_M = new hi();
              break L1;
            } else {
              param0.a(param0.field_n, 6, ((dg) this).field_N + 6, param0.field_q, (byte) 124);
              ((dg) this).field_M = new hi(param0);
              break L1;
            }
          }
          ((dg) this).a((ea) (Object) ((dg) this).field_M, 1);
          ((dg) this).field_P = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("dg.KB(");
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
          throw pn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + -15291 + 41);
        }
    }

    public static void k() {
        field_L = null;
        field_Q = null;
    }

    dg(lt param0, ea param1, int param2, int param3, int param4) {
        super(param0, param1.field_q + 12, param2 + 12 - -param1.field_n);
        try {
            ((dg) this).field_S = param4;
            ((dg) this).field_J = param3;
            ((dg) this).field_O = param3;
            ((dg) this).field_N = param2;
            int discarded$0 = -15291;
            this.c(param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "dg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static boolean j(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 27711) {
          if (10 <= ob.field_d) {
            if (ks.field_b) {
              return false;
            } else {
              L0: {
                if (tg.a(-90)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new int[2];
        field_L = "Please enter your age in years";
    }
}
