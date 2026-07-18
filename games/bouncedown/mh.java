/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mh extends wk {
    private qc field_V;
    static int field_U;
    static lj field_R;
    private lk field_X;
    private int field_Q;
    private int field_T;
    static int field_Y;
    private int field_ab;
    static String field_W;
    private int field_O;
    static int field_Z;
    private int field_N;
    private jg field_S;

    boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, -14565)) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                if (null == ((mh) this).field_S) {
                  break L1;
                } else {
                  L2: {
                    if (param2 == 98) {
                      boolean discarded$4 = ((mh) this).field_S.a(param0, false);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (param2 != 99) {
                    break L1;
                  } else {
                    boolean discarded$5 = ((mh) this).field_S.a(param0, false);
                    return false;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("mh.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + -14565 + ')');
        }
        return stackIn_13_0 != 0;
    }

    void a(int param0, lk param1) {
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
            L1: {
              ((mh) this).field_X = param1;
              if (param0 == 10768) {
                break L1;
              } else {
                boolean discarded$2 = ((mh) this).e((byte) -12);
                break L1;
              }
            }
            if (mb.field_n != ((mh) this).field_V) {
              if (ub.field_b == ((mh) this).field_V) {
                break L0;
              } else {
                ((mh) this).field_V = ub.field_b;
                ((mh) this).field_T = 0;
                return;
              }
            } else {
              ((mh) this).a((byte) 126, ((mh) this).field_ab, 12 + ((mh) this).field_Q - -((mh) this).field_X.field_m, 12 + ((mh) this).field_X.field_k);
              ((mh) this).field_T = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("mh.A(").append(param0).append(',');
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
          throw ii.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    public static void m(int param0) {
        field_R = null;
        field_W = null;
        if (param0 != -16167) {
            field_U = 91;
        }
    }

    final void i(byte param0) {
        int var2 = -66 / ((31 - param0) / 35);
        if (null != ((mh) this).field_V) {
            if (!(((mh) this).field_V == vb.field_g)) {
                ((mh) this).c(-463076575, ((mh) this).field_X.field_k + 12, ((mh) this).field_X.field_m + 12 - -((mh) this).field_Q);
                this.b(((mh) this).field_X, 6);
            }
            ((mh) this).field_V = null;
            ((mh) this).field_S.field_E = 256;
        }
        super.i((byte) -58);
    }

    mh(pf param0, lk param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_k, param2 + (12 - -param1.field_m));
        try {
            ((mh) this).field_Q = param2;
            ((mh) this).field_ab = param4;
            ((mh) this).field_O = param3;
            ((mh) this).field_N = param3;
            this.b(param1, 6);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, oh param3, int param4, int param5, int param6, tj param7, int param8, int param9, int param10, byte param11, int param12, int param13, int param14, tj param15, int param16, int param17, int param18, oh param19, oh param20) {
        int var21_int = 0;
        RuntimeException var21 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            lb.a(param7, 320, -101, param15);
            int discarded$7 = 0;
            hh.b(20, 14, 20, 20);
            l.a(240, (byte) 127, 320);
            int discarded$8 = 82;
            int discarded$9 = 8;
            uk.a(param3, 4, 8, param19);
            var21_int = 0;
            di.a(0, 0, 0, param20);
            int discarded$10 = 102;
            int discarded$11 = 16741888;
            int discarded$12 = 16777215;
            int discarded$13 = 16697912;
            ti.a();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var21;
            stackOut_2_1 = new StringBuilder().append("mh.R(").append(240).append(',').append(20).append(',').append(16697912).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(320).append(',').append(16741888).append(',').append(14).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param7 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(16777215).append(',').append(8).append(',').append(20).append(',').append(115).append(',').append(320).append(',').append(20).append(',').append(0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param15 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(0).append(',').append(8).append(',').append(4).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param19 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param20 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    boolean e(byte param0) {
        int var3 = 0;
        var3 = Bounce.field_N;
        if (param0 != 21) {
          ((mh) this).i((byte) 37);
          if (null != ((mh) this).field_V) {
            if (ub.field_b == ((mh) this).field_V) {
              int fieldTemp$4 = ((mh) this).field_T + 1;
              ((mh) this).field_T = ((mh) this).field_T + 1;
              if (fieldTemp$4 != ((mh) this).field_N) {
                ((mh) this).field_S.field_E = -((((mh) this).field_T << 8) / ((mh) this).field_N) + 256;
                return super.e((byte) 21);
              } else {
                ((mh) this).field_V = mb.field_n;
                ((mh) this).a((byte) 126, ((mh) this).field_ab, ((mh) this).field_Q + 12 - -((mh) this).field_X.field_m, ((mh) this).field_X.field_k + 12);
                ((mh) this).field_T = 0;
                ((mh) this).field_S.field_E = 0;
                return super.e((byte) 21);
              }
            } else {
              if (vb.field_g == ((mh) this).field_V) {
                int fieldTemp$5 = ((mh) this).field_T + 1;
                ((mh) this).field_T = ((mh) this).field_T + 1;
                if (fieldTemp$5 != ((mh) this).field_O) {
                  ((mh) this).field_S.field_E = (((mh) this).field_T << 8) / ((mh) this).field_O;
                  return super.e((byte) 21);
                } else {
                  ((mh) this).field_V = null;
                  ((mh) this).field_S.field_E = 256;
                  return super.e((byte) 21);
                }
              } else {
                return super.e((byte) 21);
              }
            }
          } else {
            return super.e((byte) 21);
          }
        } else {
          if (null != ((mh) this).field_V) {
            if (ub.field_b == ((mh) this).field_V) {
              int fieldTemp$6 = ((mh) this).field_T + 1;
              ((mh) this).field_T = ((mh) this).field_T + 1;
              if (fieldTemp$6 != ((mh) this).field_N) {
                ((mh) this).field_S.field_E = -((((mh) this).field_T << 8) / ((mh) this).field_N) + 256;
                return super.e((byte) 21);
              } else {
                ((mh) this).field_V = mb.field_n;
                ((mh) this).a((byte) 126, ((mh) this).field_ab, ((mh) this).field_Q + 12 - -((mh) this).field_X.field_m, ((mh) this).field_X.field_k + 12);
                ((mh) this).field_T = 0;
                ((mh) this).field_S.field_E = 0;
                return super.e((byte) 21);
              }
            } else {
              if (vb.field_g == ((mh) this).field_V) {
                int fieldTemp$7 = ((mh) this).field_T + 1;
                ((mh) this).field_T = ((mh) this).field_T + 1;
                if (fieldTemp$7 != ((mh) this).field_O) {
                  ((mh) this).field_S.field_E = (((mh) this).field_T << 8) / ((mh) this).field_O;
                  return super.e((byte) 21);
                } else {
                  ((mh) this).field_V = null;
                  ((mh) this).field_S.field_E = 256;
                  return super.e((byte) 21);
                }
              } else {
                return super.e((byte) 21);
              }
            }
          } else {
            return super.e((byte) 21);
          }
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 >= 77) {
              L1: {
                le.a(-1, (java.awt.Component) (Object) param0);
                int discarded$2 = -80;
                ka.a((java.awt.Component) (Object) param0);
                if (null == hg.field_k) {
                  break L1;
                } else {
                  hg.field_k.a(55, (java.awt.Component) (Object) param0);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("mh.Q(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    private final void b(lk param0, int param1) {
        try {
            if (!(null == ((mh) this).field_S)) {
                ((mh) this).field_S.c(2);
            }
            if (param1 != 6) {
                Object var4 = null;
                ((mh) this).a(112, (lk) null);
            }
            if (param0 != null) {
                param0.b(param0.field_m, param1 + 74, param0.field_k, 6, ((mh) this).field_Q + 6);
                ((mh) this).field_S = new jg(param0);
            } else {
                ((mh) this).field_S = new jg();
            }
            ((mh) this).b((lk) (Object) ((mh) this).field_S, true);
            ((mh) this).field_X = null;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "mh.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean f(byte param0) {
        ((mh) this).i((byte) -119);
        if (param0 != -33) {
            ((mh) this).field_T = -104;
            return super.f((byte) -33);
        }
        return super.f((byte) -33);
    }

    final void l(int param0) {
        if (ub.field_b == ((mh) this).field_V) {
          return;
        } else {
          ((mh) this).field_T = 0;
          if (param0 != -4993) {
            mh.m(-111);
            ((mh) this).field_V = vb.field_g;
            this.b(((mh) this).field_X, param0 + 4999);
            ((mh) this).field_S.field_E = 0;
            ((mh) this).field_X = null;
            return;
          } else {
            ((mh) this).field_V = vb.field_g;
            this.b(((mh) this).field_X, param0 + 4999);
            ((mh) this).field_S.field_E = 0;
            ((mh) this).field_X = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "Retry";
        field_Z = -1;
        field_R = new lj();
    }
}
