/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mu extends cm {
    private int field_W;
    private ic field_X;
    private fd field_V;
    static String field_S;
    private int field_T;
    private pj field_ab;
    private int field_U;
    static hd field_Y;
    static int[] field_Q;
    private int field_Z;
    private int field_R;

    private final void b(fd param0, int param1) {
        try {
            if (!(null == ((mu) this).field_ab)) {
                ((mu) this).field_ab.c((byte) -109);
            }
            if (param1 <= 50) {
                ((mu) this).field_X = null;
            }
            if (param0 == null) {
                ((mu) this).field_ab = new pj();
            } else {
                param0.a(param0.field_i, 1, 6, param0.field_n, ((mu) this).field_R + 6);
                ((mu) this).field_ab = new pj(param0);
            }
            ((mu) this).a(-83, (fd) (Object) ((mu) this).field_ab);
            ((mu) this).field_V = null;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "mu.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void m(int param0) {
        if (null == ((mu) this).field_X) {
            super.m(param0);
            return;
        }
        if (wn.field_b != ((mu) this).field_X) {
            ((mu) this).a((byte) 127, ((mu) this).field_V.field_i + (((mu) this).field_R + 12), 12 + ((mu) this).field_V.field_n);
            this.b(((mu) this).field_V, 54);
        } else {
            ((mu) this).field_ab.field_F = 256;
            ((mu) this).field_X = null;
            super.m(param0);
            return;
        }
        ((mu) this).field_ab.field_F = 256;
        ((mu) this).field_X = null;
        super.m(param0);
    }

    boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          if (super.a(param0, (byte) -78, param2, param3)) {
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0 != 0;
          } else {
            if (null != ((mu) this).field_ab) {
              L0: {
                if (param3 == 98) {
                  boolean discarded$4 = ((mu) this).field_ab.a(param2, 0);
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (param3 != 99) {
                  break L1;
                } else {
                  boolean discarded$5 = ((mu) this).field_ab.a(param2, 0);
                  break L1;
                }
              }
              return false;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("mu.E(").append(param0).append(',').append(-94).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, qm param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 < sk.field_d.field_o) {
                  sk.field_d.a(true, 1000000, param3, -9017, param2, param4, param0);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("mu.D(").append(param0).append(',').append(true).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param4 + ',' + true + ')');
        }
    }

    public static void p() {
        field_Q = null;
        field_S = null;
        field_Y = null;
    }

    void a(byte param0, fd param1) {
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
              ((mu) this).field_V = param1;
              if (param0 <= -117) {
                break L1;
              } else {
                ((mu) this).field_R = 54;
                break L1;
              }
            }
            if (bf.field_m == ((mu) this).field_X) {
              ((mu) this).a((byte) -23, ((mu) this).field_U, ((mu) this).field_V.field_i + (12 - -((mu) this).field_R), ((mu) this).field_V.field_n + 12);
              ((mu) this).field_T = 0;
              return;
            } else {
              if (rv.field_e == ((mu) this).field_X) {
                break L0;
              } else {
                ((mu) this).field_X = rv.field_e;
                ((mu) this).field_T = 0;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("mu.F(").append(param0).append(',');
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
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    mu(se param0, fd param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_n, param1.field_i + (12 - -param2));
        try {
            ((mu) this).field_U = param4;
            ((mu) this).field_Z = param3;
            ((mu) this).field_W = param3;
            ((mu) this).field_R = param2;
            this.b(param1, 94);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "mu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 > -11) {
          ((mu) this).n(55);
          ((mu) this).m(4000);
          return super.a(-13);
        } else {
          ((mu) this).m(4000);
          return super.a(-13);
        }
    }

    final void n(int param0) {
        if (rv.field_e != ((mu) this).field_X) {
          ((mu) this).field_T = 0;
          ((mu) this).field_X = wn.field_b;
          this.b(((mu) this).field_V, 99);
          if (param0 != 4096) {
            return;
          } else {
            ((mu) this).field_ab.field_F = 0;
            ((mu) this).field_V = null;
            return;
          }
        } else {
          return;
        }
    }

    boolean k(int param0) {
        int var3 = 0;
        var3 = Kickabout.field_G;
        if (((mu) this).field_X != null) {
          if (rv.field_e == ((mu) this).field_X) {
            int fieldTemp$2 = ((mu) this).field_T + 1;
            ((mu) this).field_T = ((mu) this).field_T + 1;
            if (((mu) this).field_W == fieldTemp$2) {
              ((mu) this).field_X = bf.field_m;
              ((mu) this).a((byte) -104, ((mu) this).field_U, ((mu) this).field_R + (12 + ((mu) this).field_V.field_i), 12 + ((mu) this).field_V.field_n);
              ((mu) this).field_ab.field_F = 0;
              ((mu) this).field_T = 0;
              return super.k(-1);
            } else {
              ((mu) this).field_ab.field_F = -((((mu) this).field_T << 8) / ((mu) this).field_W) + 256;
              return super.k(-1);
            }
          } else {
            if (((mu) this).field_X == wn.field_b) {
              int fieldTemp$3 = ((mu) this).field_T + 1;
              ((mu) this).field_T = ((mu) this).field_T + 1;
              if (fieldTemp$3 == ((mu) this).field_Z) {
                ((mu) this).field_X = null;
                ((mu) this).field_ab.field_F = 256;
                return super.k(-1);
              } else {
                ((mu) this).field_ab.field_F = (((mu) this).field_T << 8) / ((mu) this).field_Z;
                return super.k(-1);
              }
            } else {
              return super.k(-1);
            }
          }
        } else {
          return super.k(-1);
        }
    }

    final static boolean a(ml param0) {
        return param0.l(1, 59) == 1;
    }

    final static int a(int param0, int param1, String param2, String param3, String param4, boolean param5, int param6) {
        ec var7 = null;
        RuntimeException var7_ref = null;
        ec var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var7 = new ec(param2);
            var8 = new ec(param4);
            stackOut_2_0 = m.a(param6, var8, var7, param1, param5, param3, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7_ref;
            stackOut_4_1 = new StringBuilder().append("mu.H(").append(12).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new int[2];
        field_S = "HOME  <%0> - <%1>  AWAY";
    }
}
