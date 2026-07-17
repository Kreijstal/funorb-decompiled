/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class ng {
    static byte[] field_b;
    static String field_c;
    static ok field_g;
    static int field_e;
    static String field_a;
    static String field_f;
    static int field_d;

    final static so a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        so var9 = (so) (Object) fk.field_n.g(75);
        if (!(var9 != null)) {
            var9 = new so();
        }
        var9.a(param3, param4, param5, param7, param6, param8, param0, false, param2);
        int var10 = -109 % ((-78 - param1) / 44);
        return var9;
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
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            if (param0 == -49) {
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  stackOut_37_0 = var5;
                  stackIn_38_0 = stackOut_37_0;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      var9 = param2.charAt(var8);
                      if (var8 == 0) {
                        if (var9 != 45) {
                          if (var9 != 43) {
                            break L3;
                          } else {
                            if (!param1) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          var4_int = 1;
                          break L2;
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
                      L7: {
                        if (var9 < 97) {
                          break L7;
                        } else {
                          if (var9 > 122) {
                            break L7;
                          } else {
                            var9 -= 87;
                            break L4;
                          }
                        }
                      }
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0 != 0;
                    }
                    if (var9 < 10) {
                      L8: {
                        if (var4_int != 0) {
                          var9 = -var9;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var10 = var9 + 10 * var6;
                      if (var10 / 10 != var6) {
                        stackOut_33_0 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        return stackIn_34_0 != 0;
                      } else {
                        var5 = 1;
                        var6 = var10;
                        break L2;
                      }
                    } else {
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0 != 0;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("ng.O(").append(param0).append(44).append(param1).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L9;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L9;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + 10 + 41);
        }
        return stackIn_38_0 != 0;
    }

    abstract byte[] a(int param0, int param1);

    abstract int b(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              oo.b(param1, param3, param2 + param0, 10000536);
              oo.b(param1, param4 + param3, 1 + param2, 12105912);
              var5_int = 1;
              if (var5_int + param3 >= oo.field_e) {
                break L1;
              } else {
                var5_int = oo.field_e + -param3;
                break L1;
              }
            }
            L2: {
              var6 = param4;
              if (oo.field_d < param3 - -var6) {
                var6 = -param3 + oo.field_d;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = var7 * 48 / param4 + 152;
                var9 = var8 | (var8 << 16 | var8 << 8);
                oo.field_i[oo.field_b * (param3 + var7) - -param1] = var9;
                oo.field_i[(param3 + var7) * oo.field_b - (-param1 + -param2)] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var5, "ng.P(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_c = null;
        if (param0 != 816) {
            field_f = null;
        }
    }

    abstract be a(byte param0);

    final static String a(String param0, String param1, int param2, int param3) {
        RuntimeException var4 = null;
        ga var5 = null;
        int var6 = 0;
        ml var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        Object stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var8 = (CharSequence) (Object) param0;
            if (!em.a(var8, (byte) -38)) {
              stackOut_2_0 = u.field_f;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (ge.field_zb != 2) {
                stackOut_6_0 = id.field_A;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var7 = md.a((byte) 90, param1);
                if (var7 == null) {
                  stackOut_10_0 = vl.a(mf.field_a, new String[1], 2);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  L1: {
                    var7.a(true);
                    var7.a(-4564);
                    fn.field_d = fn.field_d - 1;
                    if (param2 <= -21) {
                      break L1;
                    } else {
                      ng.a(-125);
                      break L1;
                    }
                  }
                  var5 = ma.field_a;
                  var5.b((byte) -35, param3);
                  var5.field_j = var5.field_j + 1;
                  var6 = var5.field_j;
                  var5.a(113, 3);
                  var5.a(param0, (byte) 105);
                  var5.e(89, -var6 + var5.field_j);
                  stackOut_14_0 = null;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("ng.Q(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
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
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 44 + param3 + 41);
        }
        return (String) (Object) stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = null;
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "To report a player, right-click on their name and select the option to report abuse.";
        field_e = 320;
        field_c = "Prepare to run...";
    }
}
