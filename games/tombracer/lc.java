/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lc extends ofa {
    private sla field_M;
    static int[] field_N;
    private int field_R;
    private int field_O;
    private int field_Q;
    static String field_L;
    private rg field_P;
    private int field_S;
    private ae field_T;
    private int field_U;

    private final void a(boolean param0, ae param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (null != ((lc) this).field_P) {
              ((lc) this).field_P.p(83);
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 == null) {
            ((lc) this).field_P = new rg();
            ((lc) this).a((ae) (Object) ((lc) this).field_P, -1);
            ((lc) this).field_T = null;
            return;
          } else {
            param1.a((byte) -31, param1.field_m, param1.field_p, 6, ((lc) this).field_S + 6);
            ((lc) this).field_P = new rg(param1);
            ((lc) this).a((ae) (Object) ((lc) this).field_P, -1);
            ((lc) this).field_T = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("lc.E(").append(false).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final void c(boolean param0) {
        if (((lc) this).field_M != null) {
          if (((lc) this).field_M == nr.field_a) {
            ((lc) this).field_P.field_y = 256;
            ((lc) this).field_M = null;
            super.c(param0);
            return;
          } else {
            ((lc) this).c(-11560, ((lc) this).field_T.field_p + (((lc) this).field_S + 12), 12 + ((lc) this).field_T.field_m);
            this.a(false, ((lc) this).field_T);
            ((lc) this).field_P.field_y = 256;
            ((lc) this).field_M = null;
            super.c(param0);
            return;
          }
        } else {
          super.c(param0);
          return;
        }
    }

    void a(int param0, ae param1) {
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
            L1: {
              ((lc) this).field_T = param1;
              if (((lc) this).field_M != us.field_e) {
                if (bj.field_p != ((lc) this).field_M) {
                  ((lc) this).field_M = bj.field_p;
                  ((lc) this).field_R = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ((lc) this).a(((lc) this).field_Q, ((lc) this).field_T.field_m + 12, ((lc) this).field_T.field_p + ((lc) this).field_S + 12, (byte) -105);
                ((lc) this).field_R = 0;
                break L1;
              }
            }
            if (param0 > 67) {
              break L0;
            } else {
              ((lc) this).field_R = -128;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("lc.F(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    boolean a(int param0) {
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (null != ((lc) this).field_M) {
          if (((lc) this).field_M != bj.field_p) {
            if (nr.field_a == ((lc) this).field_M) {
              int fieldTemp$2 = ((lc) this).field_R + 1;
              ((lc) this).field_R = ((lc) this).field_R + 1;
              if (((lc) this).field_U == fieldTemp$2) {
                ((lc) this).field_M = null;
                ((lc) this).field_P.field_y = 256;
                return super.a(127);
              } else {
                ((lc) this).field_P.field_y = (((lc) this).field_R << 8) / ((lc) this).field_U;
                return super.a(127);
              }
            } else {
              return super.a(127);
            }
          } else {
            int fieldTemp$3 = ((lc) this).field_R + 1;
            ((lc) this).field_R = ((lc) this).field_R + 1;
            if (fieldTemp$3 != ((lc) this).field_O) {
              ((lc) this).field_P.field_y = 256 + -((((lc) this).field_R << 8) / ((lc) this).field_O);
              return super.a(127);
            } else {
              ((lc) this).field_M = us.field_e;
              ((lc) this).a(((lc) this).field_Q, ((lc) this).field_T.field_m + 12, ((lc) this).field_T.field_p + (((lc) this).field_S + 12), (byte) -103);
              ((lc) this).field_R = 0;
              ((lc) this).field_P.field_y = 0;
              return super.a(127);
            }
          }
        } else {
          return super.a(127);
        }
    }

    public static void e(boolean param0) {
        field_N = null;
        field_L = null;
    }

    final void d(int param0) {
        if (((lc) this).field_M != bj.field_p) {
          ((lc) this).field_M = nr.field_a;
          if (param0 > -20) {
            ((lc) this).field_R = 19;
            ((lc) this).field_R = 0;
            this.a(false, ((lc) this).field_T);
            ((lc) this).field_P.field_y = 0;
            ((lc) this).field_T = null;
            return;
          } else {
            ((lc) this).field_R = 0;
            this.a(false, ((lc) this).field_T);
            ((lc) this).field_P.field_y = 0;
            ((lc) this).field_T = null;
            return;
          }
        } else {
          return;
        }
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
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
            if (!super.a(param0, param1, param2, true)) {
              if (null != ((lc) this).field_P) {
                L1: {
                  if (param2 != 98) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((lc) this).field_P.a(param1, false);
                    break L1;
                  }
                }
                L2: {
                  if (param2 == 99) {
                    boolean discarded$5 = ((lc) this).field_P.a(param1, false);
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
            stackOut_12_1 = new StringBuilder().append("lc.P(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + true + ')');
        }
        return stackIn_11_0 != 0;
    }

    lc(jta param0, ae param1, int param2, int param3, int param4) {
        super(param0, param1.field_m + 12, param1.field_p + param2 + 12);
        try {
            ((lc) this).field_U = param3;
            ((lc) this).field_O = param3;
            ((lc) this).field_Q = param4;
            ((lc) this).field_S = param2;
            this.a(false, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0) {
        if (param0 > -53) {
            return false;
        }
        ((lc) this).c(true);
        return super.a((byte) -120);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new int[1];
        field_L = "Score";
    }
}
