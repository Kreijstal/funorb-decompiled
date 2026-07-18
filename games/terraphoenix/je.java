/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static String field_b;
    static int[] field_a;

    final static String a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param1.length();
              if (param0 >= 54) {
                break L1;
              } else {
                int discarded$15 = je.a(-16, 65);
                break L1;
              }
            }
            L2: {
              var6 = var4_int;
              var7 = -1 + var5;
              if (0 == var7) {
                break L2;
              } else {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param2.indexOf('_', var8_int);
                  if (0 > var8_int) {
                    break L2;
                  } else {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L3;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param2.indexOf('_', var9);
              if (var10 >= 0) {
                StringBuilder discarded$16 = var8.append(param2.substring(var9, var10));
                StringBuilder discarded$17 = var8.append(param1);
                var9 = 1 + var10;
                continue L4;
              } else {
                StringBuilder discarded$18 = var8.append(param2.substring(var9));
                stackOut_11_0 = var8.toString();
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("je.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + '_' + ')');
        }
        return stackIn_12_0;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 <= -63) {
          var2 = 0;
          if (0 <= param1) {
            if (param1 >= 65536) {
              L0: {
                param1 = param1 >>> 16;
                var2 += 16;
                if (256 <= param1) {
                  var2 += 8;
                  param1 = param1 >>> 8;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (param1 < 16) {
                  break L1;
                } else {
                  param1 = param1 >>> 4;
                  var2 += 4;
                  break L1;
                }
              }
              L2: {
                if (param1 < 4) {
                  break L2;
                } else {
                  param1 = param1 >>> 2;
                  var2 += 2;
                  break L2;
                }
              }
              L3: {
                if (param1 >= 1) {
                  var2++;
                  param1 = param1 >>> 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              return param1 + var2;
            } else {
              L4: {
                if (256 <= param1) {
                  var2 += 8;
                  param1 = param1 >>> 8;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (param1 < 16) {
                  break L5;
                } else {
                  param1 = param1 >>> 4;
                  var2 += 4;
                  break L5;
                }
              }
              L6: {
                if (param1 < 4) {
                  break L6;
                } else {
                  param1 = param1 >>> 2;
                  var2 += 2;
                  break L6;
                }
              }
              L7: {
                if (param1 >= 1) {
                  var2++;
                  param1 = param1 >>> 1;
                  break L7;
                } else {
                  break L7;
                }
              }
              return param1 + var2;
            }
          } else {
            L8: {
              param1 = param1 >>> 16;
              var2 += 16;
              if (256 <= param1) {
                var2 += 8;
                param1 = param1 >>> 8;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param1 < 16) {
                break L9;
              } else {
                param1 = param1 >>> 4;
                var2 += 4;
                break L9;
              }
            }
            L10: {
              if (param1 < 4) {
                break L10;
              } else {
                param1 = param1 >>> 2;
                var2 += 2;
                break L10;
              }
            }
            L11: {
              if (param1 >= 1) {
                var2++;
                param1 = param1 >>> 1;
                break L11;
              } else {
                break L11;
              }
            }
            return param1 + var2;
          }
        } else {
          return -121;
        }
    }

    final static fh a(int param0) {
        if (df.field_K == null) {
          df.field_K = new fh();
          df.field_K.a(qk.field_e, (byte) -106);
          df.field_K.field_b = ra.field_l;
          df.field_K.field_u = 2763306;
          df.field_K.field_k = 4;
          df.field_K.field_v = 6;
          df.field_K.field_r = 7697781;
          df.field_K.field_p = 14;
          df.field_K.field_o = 5;
          df.field_K.field_m = 0;
          return df.field_K;
        } else {
          return df.field_K;
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Abort mission";
    }
}
