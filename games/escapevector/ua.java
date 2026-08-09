/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int field_a;
    static String field_b;
    static kg field_c;

    final static int[] a(int param0, boolean param1, int param2, ij param3) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var8 = param3.field_o[param2];
            var4 = var8;
            var5 = new int[var8.length];
            var6 = 0;
            L2: while (true) {
              if (var8.length <= var6) {
                stackIn_7_0 = (int[]) (var5);
                break L0;
              } else {
                var5[var6] = bj.a(-19, param0, var8[var6]);
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            field_a = 95;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        c var4;
        int var5;
        if (aj.b(-127)) {
          return;
        } else {
          var4 = om.field_c;
          var4.a(16, true);
          var4.field_m = var4.field_m + 1;
          if (param3 != 1) {
            field_b = (String) null;
            var5 = var4.field_m;
            var4.f(0, -123);
            var4.h(param3 + 45, param0);
            var4.f(param2, -123);
            var4.h(param3 + 9, param1);
            var4.e(-96, var4.field_m + -var5);
            return;
          } else {
            var5 = var4.field_m;
            var4.f(0, -123);
            var4.h(param3 + 45, param0);
            var4.f(param2, -123);
            var4.h(param3 + 9, param1);
            var4.e(-96, var4.field_m + -var5);
            return;
          }
        }
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        CharSequence var7_ref_CharSequence = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var8 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (1 == param1) {
                var10 = param2[param0];
                var4 = var10;
                if (var4 != null) {
                  stackIn_11_0 = var10.toString();
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param0 + param1;
                if (param3 == 4) {
                  var5 = 0;
                  var6_int = param0;
                  L1: while (true) {
                    if (var4_int <= var6_int) {
                      var6 = new StringBuilder(var5);
                      var7 = param0;
                      L2: while (true) {
                        if (var4_int <= var7) {
                          stackIn_30_0 = var6.toString();
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          L3: {
                            var8 = param2[var7];
                            if (var8 == null) {
                              discarded$0 = var6.append("null");
                              break L3;
                            } else {
                              discarded$1 = var6.append(var8);
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      L4: {
                        var7_ref_CharSequence = param2[var6_int];
                        if (var7_ref_CharSequence == null) {
                          var5 += 4;
                          break L4;
                        } else {
                          var5 = var5 + var7_ref_CharSequence.length();
                          break L4;
                        }
                      }
                      var6_int++;
                      continue L1;
                    }
                  }
                } else {
                  stackIn_14_0 = (String) null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var4_ref);

            stackIn_33_1 = new StringBuilder().append("ua.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L5;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                return stackIn_30_0;
              }
            }
          }
        }
    }

    static {
        field_b = "Current Objective";
    }
}
