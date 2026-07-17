/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends ga implements el {
    private String field_Q;
    private rg[] field_L;
    private int[] field_H;
    static String field_R;
    static String field_O;
    private int field_P;
    private ok field_T;
    static bi field_U;
    private dh field_S;

    final rg a(String param0, uk param1, boolean param2) {
        rg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        rg stackIn_4_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        rg stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
        try {
          L0: {
            if (!param2) {
              var4 = new rg(param0, param1);
              var4.field_n = (fe) (Object) new je();
              var5 = ((jn) this).field_z + -2;
              ((jn) this).a(-114, ((jn) this).field_F, 0, ((jn) this).field_z - -34, 0);
              var4.a(-121, -14 + ((jn) this).field_F, var5, 30, 7);
              ((jn) this).b((fj) (Object) var4, 10);
              stackOut_3_0 = (rg) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (rg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("jn.E(");
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
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
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    public static void j(int param0) {
        field_O = null;
        field_U = null;
        field_R = null;
    }

    jn(dh param0, ok param1, String param2) {
        super(0, 0, 288, 0, (fe) null);
        int var4_int = 0;
        ((jn) this).field_P = 0;
        try {
            ((jn) this).field_Q = param2;
            ((jn) this).field_S = param0;
            ((jn) this).field_T = param1;
            var4_int = null != ((jn) this).field_Q ? ((jn) this).field_T.b(((jn) this).field_Q, 260, ((jn) this).field_T.field_C) : 0;
            ((jn) this).a(-125, 288, 0, var4_int + 22, 0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "jn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(boolean param0, int param1) {
        int var6 = Confined.field_J ? 1 : 0;
        if (!(param1 > ((jn) this).field_P)) {
            return;
        }
        rg[] var7 = new rg[param1];
        rg[] var3 = var7;
        int[] var4 = new int[param1];
        int var5 = 0;
        if (param0) {
            return;
        }
        while (var5 < ((jn) this).field_P) {
            var7[var5] = ((jn) this).field_L[var5];
            var4[var5] = ((jn) this).field_H[var5];
            var5++;
        }
        ((jn) this).field_L = var3;
        ((jn) this).field_H = var4;
        ((jn) this).field_P = param1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 36) {
            Object var6 = null;
            ((jn) this).a(111, (String) null, -98);
        }
        super.a(param0, param1, (byte) 125, param3);
        int discarded$0 = ((jn) this).field_T.a(((jn) this).field_Q, param3 - -((jn) this).field_q + 14, 10 + (((jn) this).field_m + param0), ((jn) this).field_F - 28, ((jn) this).field_z, 16777215, -1, 0, 0, ((jn) this).field_T.field_C);
    }

    final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        if (param0 != 0) {
            return;
        }
        try {
            var4_int = ((jn) this).field_P;
            this.a(false, 1 + var4_int);
            ((jn) this).field_L[var4_int] = ((jn) this).a(param1, (uk) this, false);
            ((jn) this).field_H[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "jn.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 68) {
                break L1;
              } else {
                ((jn) this).field_H = null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                if (((jn) this).field_P <= var6_int) {
                  break L3;
                } else {
                  if (param3 == ((jn) this).field_L[var6_int]) {
                    var7 = ((jn) this).field_H[var6_int];
                    if (var7 == -1) {
                      ((jn) this).field_S.n(10);
                      break L3;
                    } else {
                      vf.a((byte) -114, ((jn) this).field_H[var6_int]);
                      break L3;
                    }
                  } else {
                    var6_int++;
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("jn.FA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 41);
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  if (!param0) {
                    var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                    param1.getAppletContext().showDocument(pn.a(var2, (byte) -33, param1), "_top");
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("jn.A(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
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
              throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Names can only contain letters, numbers, spaces and underscores";
        field_O = "Distance";
    }
}
