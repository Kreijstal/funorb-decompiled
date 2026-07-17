/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wa extends vh {
    static String field_q;
    static int field_s;
    static volatile int field_p;
    static String field_t;
    static bg[] field_r;

    public static void c(int param0) {
        field_t = null;
        field_q = null;
        field_r = null;
        if (param0 != 21834) {
            field_q = null;
        }
    }

    final static void a(ci param0, byte param1, String param2) {
        try {
            fa.field_d = param0;
            if (param1 < 19) {
                wa.c(-64);
            }
            jh.field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "wa.M(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(ci param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ci var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var19 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (l.field_b <= param1) {
                break L1;
              } else {
                param7 = param7 - (l.field_b + -param1);
                param1 = l.field_b;
                break L1;
              }
            }
            L2: {
              if (l.field_d > param5) {
                param2 = param2 - (l.field_d + -param5);
                param5 = l.field_d;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 + param7 <= l.field_f) {
                break L3;
              } else {
                param7 = -param1 + l.field_f;
                break L3;
              }
            }
            L4: {
              if (param5 - -param2 <= l.field_c) {
                break L4;
              } else {
                param2 = -param5 + l.field_c;
                break L4;
              }
            }
            L5: {
              if (param7 <= 0) {
                break L5;
              } else {
                if (param2 <= 0) {
                  break L5;
                } else {
                  var21 = param0.d();
                  var32 = l.field_i;
                  var10 = l.field_k;
                  var11 = l.field_j;
                  var30 = new int[4];
                  l.b(var30);
                  param0.a();
                  l.i(var30[0], var30[1], var30[2], var30[3]);
                  var13 = param1 + param0.field_r * param5;
                  var14 = -param7 + param0.field_r;
                  var31 = var21.field_z;
                  var28 = var31;
                  var25 = var28;
                  var22 = var25;
                  var15 = var22;
                  var16 = param5;
                  L6: while (true) {
                    if (param5 + param2 <= var16) {
                      var16 = 60 / ((param3 - 1) / 51);
                      var21.b(-param0.field_p, -param0.field_v);
                      l.a(var32, var10, var11);
                      l.a(var30);
                      break L0;
                    } else {
                      var17 = param1;
                      L7: while (true) {
                        if (param1 - -param7 <= var17) {
                          var13 = var13 + var14;
                          var16++;
                          continue L6;
                        } else {
                          L8: {
                            var18 = var31[var13];
                            if (0 == var18) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var13++;
                          var17++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var8 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var8;
            stackOut_24_1 = new StringBuilder().append("wa.L(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new char[var2_int];
              if (param0 == -117) {
                break L1;
              } else {
                var6 = null;
                wa.a((ci) null, (byte) 117, (String) null);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3[-1 + (var2_int + -var4)] = param1.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("wa.N(").append(param0).append(44);
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
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    wa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "OM-4 FG";
        field_s = 65280;
        field_p = 0;
    }
}
