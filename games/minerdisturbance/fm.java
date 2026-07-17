/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends kn implements sh {
    private int[] field_P;
    static int[] field_N;
    private int field_R;
    private hc[] field_M;
    private we field_Q;
    static String field_K;
    static String field_O;
    static fg[] field_S;
    private String field_L;
    private rg field_J;
    static String field_I;

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (var6_int >= ((fm) this).field_R) {
                  break L2;
                } else {
                  if (((fm) this).field_M[var6_int] != param2) {
                    var6_int++;
                    continue L1;
                  } else {
                    var7 = ((fm) this).field_P[var6_int];
                    if (var7 != -1) {
                      oj.a(((fm) this).field_P[var6_int], 3);
                      break L2;
                    } else {
                      ((fm) this).field_J.s(2121792);
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param1 == 6) {
                  break L3;
                } else {
                  ((fm) this).field_J = null;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("fm.B(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final hc a(String param0, int param1, rm param2) {
        hc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        hc stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        hc stackOut_2_0 = null;
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
        try {
          L0: {
            L1: {
              var4 = new hc(param0, param2);
              if (param1 > 28) {
                break L1;
              } else {
                ((fm) this).field_P = null;
                break L1;
              }
            }
            var4.field_A = (ad) (Object) new wi();
            var5 = -2 + ((fm) this).field_q;
            ((fm) this).a(((fm) this).field_q - -34, -88, 0, ((fm) this).field_v, 0);
            var4.a(30, -89, 7, -14 + ((fm) this).field_v, var5);
            ((fm) this).a(-1, (fe) (Object) var4);
            stackOut_2_0 = (hc) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("fm.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean a(byte param0) {
        int var1 = -49;
        return am.c((byte) 111) == 35 ? true : false;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((fm) this).field_Q.a(((fm) this).field_L, ((fm) this).field_u + param1 + 14, param2 - -((fm) this).field_t + 10, ((fm) this).field_v - 28, ((fm) this).field_q, 16777215, -1, 0, 0, ((fm) this).field_Q.field_I);
    }

    final static void f(byte param0) {
        ui.field_L = -640;
        fl.field_d = false;
        el.field_c = false;
        tk.field_a = false;
    }

    fm(rg param0, we param1, String param2) {
        super(0, 0, 288, 0, (ad) null);
        int var4_int = 0;
        ((fm) this).field_R = 0;
        try {
            ((fm) this).field_L = param2;
            ((fm) this).field_Q = param1;
            ((fm) this).field_J = param0;
            var4_int = ((fm) this).field_L == null ? 0 : ((fm) this).field_Q.b(((fm) this).field_L, 260, ((fm) this).field_Q.field_I);
            ((fm) this).a(var4_int + 22, -93, 0, 288, 0);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "fm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void e(byte param0) {
        if (param0 != -123) {
            field_N = null;
        }
        field_K = null;
        field_I = null;
        field_S = null;
        field_N = null;
        field_O = null;
    }

    final static void a(String param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("fm.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
    }

    final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = ((fm) this).field_R;
            this.a(-32164, var4_int - -1);
            ((fm) this).field_M[var4_int] = ((fm) this).a(param1, 35, (rm) this);
            if (param2 > -55) {
                field_I = null;
            }
            ((fm) this).field_P[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "fm.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        if (param0 != -32164) {
            return;
        }
        if (((fm) this).field_R >= param1) {
            return;
        }
        hc[] var7 = new hc[param1];
        hc[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((fm) this).field_R; var5++) {
            var7[var5] = ((fm) this).field_M[var5];
            var4[var5] = ((fm) this).field_P[var5];
        }
        ((fm) this).field_P = var4;
        ((fm) this).field_R = param1;
        ((fm) this).field_M = var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_S = new fg[255];
        field_O = "Ranking: Insipid Explorer";
        field_N = new int[4];
        field_K = "Need more lift? Grab this handy jetpack! Hold <img=25> and <img=17> to rocket into the skies! Comes with 2 year warantee to offset the volatile nature of the device.";
        for (var0 = 0; field_S.length > var0; var0++) {
            field_S[var0] = new fg();
        }
        field_I = "Your email address is used to identify this account";
    }
}
