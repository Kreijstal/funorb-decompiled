/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static int field_c;
    static volatile int field_d;
    static long field_a;
    static String field_b;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
    }

    final static String a(int param0, int param1, jc param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param2.c(false);
                  if (var3_int > param1) {
                    var3_int = param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param0 == 128) {
                    break L3;
                  } else {
                    field_b = (String) null;
                    break L3;
                  }
                }
                var4 = new byte[var3_int];
                param2.field_l = param2.field_l + ph.field_k.a(var4, param2.field_l, 0, var3_int, param2.field_g, true);
                var5 = nf.a(var3_int, (byte) -128, 0, var4);
                stackIn_6_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_8_0 = "Cabbage";
              return stackIn_8_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("hc.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) >= param1) {
                break L1;
              } else {
                if (128 > param0) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < 160) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param0 != 0) {
                var6 = cg.field_f;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L4;
                    } else {
                      stackIn_15_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            stackIn_18_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2_ref), "hc.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final synchronized static long a(int param0) {
        long var1;
        var1 = System.currentTimeMillis();
        if (pm.field_o <= var1) {
          if (param0 != -9986) {
            return -66L;
          } else {
            pm.field_o = var1;
            return var1 - -b.field_Gb;
          }
        } else {
          b.field_Gb = b.field_Gb + (pm.field_o + -var1);
          if (param0 != -9986) {
            return -66L;
          } else {
            pm.field_o = var1;
            return var1 - -b.field_Gb;
          }
        }
    }

    static {
        field_c = 4;
        field_d = 0;
        field_b = "<%0>'s turn (<%1>)";
    }
}
