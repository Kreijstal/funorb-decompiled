/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fra {
    static String field_c;
    static int field_b;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 2147483647) {
            fra.a(52);
        }
    }

    final static boolean a(int[] param0, int param1, int param2, int param3) {
        int stackIn_21_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 2147483647;
            var5 = -2147483648;
            var6 = 2147483647;
            var7 = -2147483648;
            var8 = 0;
            L1: while (true) {
              if (var8 >= param0.length) {
                L2: {
                  if (param2 == 2) {
                    break L2;
                  } else {
                    fra.a(25);
                    break L2;
                  }
                }
                if (em.a(5220, var5, param1, var7, param3, var4_int, var6)) {
                  L3: {
                    var8 = param3;
                    var9 = param1;
                    var10 = param3 + -(var4_int - -var5 >> -1474575423);
                    var11 = -(var6 + var7 >> -694688287) + param1;
                    if (Math.abs(var10) < Math.abs(var11)) {
                      if (0 < var10) {
                        var8 = var8 + (var5 - var4_int);
                        break L3;
                      } else {
                        var8 = var8 - (var5 + -var4_int);
                        break L3;
                      }
                    } else {
                      if ((var11 ^ -1) < -1) {
                        var9 = var9 + (-var6 + var7);
                        break L3;
                      } else {
                        var9 = var9 - (var7 - var6);
                        break L3;
                      }
                    }
                  }
                  var10 = 0;
                  var17 = 0;
                  var11 = var17;
                  L4: while (true) {
                    if (var17 >= param0.length) {
                      L5: {
                        if (var10 % 2 != 1) {
                          stackIn_40_0 = 0;
                          break L5;
                        } else {
                          stackIn_40_0 = 1;
                          break L5;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L6: {
                        var12 = param0[var17];
                        var13 = param0[1 + var17];
                        var14 = param0[(2 + var17) % param0.length];
                        var15 = param0[(var17 - -3) % param0.length];
                        if (-1 == ng.a(8, param1, (byte) 93, param3, var14, var8, var13, var12, var15, var9)) {
                          break L6;
                        } else {
                          var10++;
                          break L6;
                        }
                      }
                      var17 += 2;
                      continue L4;
                    }
                  }
                } else {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L7: {
                  var9 = param0[var8];
                  if (var5 < var9) {
                    var5 = var9;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var10 = param0[1 + var8];
                  if (var9 >= var4_int) {
                    break L8;
                  } else {
                    var4_int = var9;
                    break L8;
                  }
                }
                L9: {
                  if (var10 > var7) {
                    var7 = var10;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var6 > var10) {
                    var6 = var10;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var8 += 2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var4);

            stackIn_43_1 = new StringBuilder().append("fra.C(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L11;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0 != 0;
        } else {
          return stackIn_40_0 != 0;
        }
    }

    final static int a(byte param0) {
        int var1 = -17 / ((-44 - param0) / 49);
        return sea.a(-19) - seb.a(27546) / 2;
    }

    static {
        field_a = 1;
        field_b = 50;
        field_c = "This option cannot be combined with the current '<%0>' setting.";
    }
}
