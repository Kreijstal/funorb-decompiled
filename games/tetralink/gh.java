/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static String field_b;
    static int[] field_a;

    final static Boolean a(byte param0) {
        Boolean var1 = ui.field_b;
        ui.field_b = null;
        if (param0 < 91) {
            field_a = (int[]) null;
        }
        return var1;
    }

    public static void a(int param0) {
        if (param0 <= 64) {
            field_b = (String) null;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, oh[] param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param0 <= 0) {
                  break L1;
                } else {
                  var5_int = param3[0].field_t;
                  var6 = param3[2].field_t;
                  var7 = param3[1].field_t;
                  param3[0].c(param1, param2);
                  param3[2].c(param1 + param0 + -var6, param2);
                  ra.a(lj.field_a);
                  ra.b(var5_int + param1, param2, -var6 + (param0 + param1), param2 - -param3[1].field_F);
                  var8 = var5_int + param1;
                  var9 = param1 - (-param0 - -var6);
                  param1 = var8;
                  L2: while (true) {
                    if (var9 <= param1) {
                      L3: {
                        if (param4 <= -123) {
                          break L3;
                        } else {
                          field_b = (String) null;
                          break L3;
                        }
                      }
                      ra.b(lj.field_a);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param3[1].c(param1, param2);
                      param1 = param1 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("gh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, boolean param1) {
        if (!(sj.field_g == null)) {
            if (sj.field_g.b(-20728, param1)) {
                sj.field_g = null;
            }
        }
        if (param0 <= 76) {
            field_a = (int[]) null;
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            if (-1 == (param2 ^ -1)) {
              stackIn_4_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 == (param2 ^ -1)) {
                var10 = param0[param1];
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
                var4_int = param1 + param2;
                var5 = 0;
                var6_int = param1;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param1;
                    L2: while (true) {
                      if (var7 >= var4_int) {
                        stackIn_25_0 = var6.toString();
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 == null) {
                            discarded$3 = var6.append("null");
                            break L3;
                          } else {
                            discarded$4 = var6.append(var8);
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param0[var6_int];
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
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var4_ref);

            stackIn_28_1 = new StringBuilder().append("gh.C(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
              return stackIn_25_0;
            }
          }
        }
    }

    static {
        field_a = new int[4];
        field_b = "Advertising websites";
    }
}
