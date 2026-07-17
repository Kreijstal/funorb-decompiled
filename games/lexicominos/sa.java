/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static String field_a;
    static ab field_g;
    int field_i;
    String field_f;
    String field_b;
    String field_e;
    sh field_d;
    static String field_h;
    static int field_c;

    final static ij[] a(int param0, ng param1) {
        RuntimeException var2 = null;
        ij[] var2_array = null;
        int var3 = 0;
        ij var4 = null;
        mk var5 = null;
        int var6 = 0;
        ij[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ij[] stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_array = new ij[param1.b(2)];
            var3 = 0;
            var4 = (ij) (Object) param1.a(true);
            L1: while (true) {
              if (var4 == null) {
                stackOut_17_0 = (ij[]) var2_array;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                var4.field_i = var3;
                int incrementValue$1 = var3;
                var3++;
                var2_array[incrementValue$1] = var4;
                var5 = (mk) (Object) var4.field_k.a(true);
                L2: while (true) {
                  if (var5 == null) {
                    var4 = (ij) (Object) param1.f(2);
                    continue L1;
                  } else {
                    L3: while (true) {
                      if (null == var5.field_k.field_m) {
                        if (var5.field_k == var4) {
                          var5.b((byte) -121);
                          var5 = (mk) (Object) var4.field_k.f(2);
                          continue L2;
                        } else {
                          L4: {
                            if (var5.field_k.field_r != var4) {
                              var5.field_k.field_r = var4;
                              var5.field_k.field_t = var5;
                              break L4;
                            } else {
                              if (var5.field_k.field_t.field_i < var5.field_i) {
                                var5.b((byte) -126);
                                break L4;
                              } else {
                                var5.field_k.field_t.b((byte) -124);
                                var5.field_k.field_t = var5;
                                break L4;
                              }
                            }
                          }
                          var5 = (mk) (Object) var4.field_k.f(2);
                          continue L2;
                        }
                      } else {
                        var5.field_k = var5.field_k.field_m;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("sa.A(").append(0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0;
    }

    public static void a() {
        field_h = null;
        field_g = null;
        field_a = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        pf.field_m = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        if (param0 <= 83) {
            return;
        }
        try {
            te.a(var2, var4, param1, var3, 1000);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "sa.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private sa() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0, String param1) {
        try {
            og.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "sa.B(" + 68 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email (Login):";
        field_c = 65;
        field_h = "Error connecting to server. Please try using a different server.";
    }
}
