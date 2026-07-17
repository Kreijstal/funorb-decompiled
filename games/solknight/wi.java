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

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            if (param0 == -913) {
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  stackOut_41_0 = var5;
                  stackIn_42_0 = stackOut_41_0;
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
                            L4: {
                              if (param1) {
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var8++;
                            continue L1;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    L5: {
                      L6: {
                        if (var9 < 48) {
                          break L6;
                        } else {
                          if (var9 > 57) {
                            break L6;
                          } else {
                            var9 -= 48;
                            break L5;
                          }
                        }
                      }
                      L7: {
                        if (var9 < 65) {
                          break L7;
                        } else {
                          if (var9 <= 90) {
                            var9 -= 55;
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var9 < 97) {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        return stackIn_27_0 != 0;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L5;
                        } else {
                          return false;
                        }
                      }
                    }
                    if (var9 >= 10) {
                      stackOut_32_0 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      return stackIn_33_0 != 0;
                    } else {
                      L8: {
                        if (var4_int == 0) {
                          break L8;
                        } else {
                          var9 = -var9;
                          break L8;
                        }
                      }
                      var10 = var6 * 10 + var9;
                      if (var10 / 10 == var6) {
                        var5 = 1;
                        var6 = var10;
                        break L2;
                      } else {
                        stackOut_37_0 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0 != 0;
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("wi.B(").append(param0).append(44).append(param1).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L9;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L9;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + 10 + 41);
        }
        return stackIn_42_0 != 0;
    }

    final static void c(int param0, int param1) {
        jd var2 = id.field_c;
        var2.e(param1, -2147483648);
        var2.c(114, param0);
        var2.c(75, 0);
    }

    public static void a(int param0) {
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
