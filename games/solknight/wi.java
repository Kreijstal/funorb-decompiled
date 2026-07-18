/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends gg {
    static String field_k;
    static int field_l;
    static o[] field_i;
    static na field_j;
    static String field_h;

    private wi() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
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
        int stackOut_20_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                stackOut_35_0 = var5;
                stackIn_36_0 = stackOut_35_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (var8 == 0) {
                      if (var9 == 45) {
                        var4_int = 1;
                        break L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var9 < 97) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0 != 0;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (var9 >= 10) {
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    return stackIn_27_0 != 0;
                  } else {
                    L7: {
                      if (var4_int == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = var6 * 10 + var9;
                    if (var10 / 10 == var6) {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    } else {
                      stackOut_31_0 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      return stackIn_32_0 != 0;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var4;
            stackOut_37_1 = new StringBuilder().append("wi.B(").append(-913).append(',').append(true).append(',');
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
              break L8;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L8;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + 10 + ')');
        }
        return stackIn_36_0 != 0;
    }

    final static void c() {
        jd var2 = id.field_c;
        var2.e(6, -2147483648);
        var2.c(114, 1);
        var2.c(75, 0);
    }

    public static void a() {
        field_h = null;
        field_i = null;
        field_j = null;
        field_k = null;
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 0;
            if (param1 < 0) {
              break L1;
            } else {
              if (param1 >= 65536) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var2 += 16;
          param1 = param1 >>> 16;
          break L0;
        }
        L2: {
          if (param1 < 256) {
            break L2;
          } else {
            var2 += 8;
            param1 = param1 >>> 8;
            break L2;
          }
        }
        L3: {
          if (param1 >= 16) {
            param1 = param1 >>> 4;
            var2 += 4;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param1 < 4) {
            break L4;
          } else {
            var2 += 2;
            param1 = param1 >>> 2;
            break L4;
          }
        }
        if (param0 >= 72) {
          L5: {
            if (param1 < 1) {
              break L5;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L5;
            }
          }
          return param1 + var2;
        } else {
          return -3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 250;
        field_k = "Type your password again to make sure it's correct";
        field_h = "Updates will sent to the email address you've given";
    }
}
