/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static String field_b;
    static String field_c;
    static int field_a;
    static mh field_d;

    final static eh a() {
        int var1 = 0;
        if (null == dm.field_g) {
          dm.field_g = new eh();
          dm.field_g.a(a.field_u, 13421772);
          dm.field_g.field_p = 2763306;
          dm.field_g.field_h = 6;
          dm.field_g.field_a = 4;
          dm.field_g.field_g = 0;
          dm.field_g.field_f = 5;
          dm.field_g.field_j = 7697781;
          dm.field_g.field_m = 14;
          dm.field_g.field_l = og.field_Yb;
          var1 = 89;
          return dm.field_g;
        } else {
          var1 = 89;
          return dm.field_g;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = -59;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = param2.length();
            var9 = 0;
            L1: while (true) {
              if (var8 <= var9) {
                stackOut_35_0 = var6;
                stackIn_36_0 = stackOut_35_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var10 = param2.charAt(var9);
                    if (var9 == 0) {
                      if (var10 != 45) {
                        if (var10 != 43) {
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var5 = 1;
                        var9++;
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var10 < 48) {
                        break L5;
                      } else {
                        if (var10 > 57) {
                          break L5;
                        } else {
                          var10 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var10 < 65) {
                        break L6;
                      } else {
                        if (var10 <= 90) {
                          var10 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var10 < 97) {
                        break L7;
                      } else {
                        if (var10 > 122) {
                          break L7;
                        } else {
                          var10 -= 87;
                          break L4;
                        }
                      }
                    }
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0 != 0;
                  }
                  if (10 <= var10) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  } else {
                    L8: {
                      if (var5 != 0) {
                        var10 = -var10;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var11 = var10 + var7 * 10;
                    if (var7 == var11 / 10) {
                      var7 = var11;
                      var6 = 1;
                      var9++;
                      break L2;
                    } else {
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    }
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var4;
            stackOut_37_1 = new StringBuilder().append("sh.C(").append(1).append(44).append(104).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L9;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L9;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + 10 + 41);
        }
        return stackIn_36_0 != 0;
    }

    final static void b() {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                        qh.field_a = 1 + (int)(var3.longValue() / 1048576L);
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "More suggestions";
        field_b = "Encouraging rule breaking";
    }
}
