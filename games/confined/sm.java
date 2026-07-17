/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends rl {
    static mn field_y;
    ae field_B;
    static od field_A;
    int field_z;
    byte[] field_C;

    final static boolean a(int param0, hb param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = -87 / ((param0 - -63) / 59);
              if (1 != param1.g(1, 0)) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("sm.F(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == 87) {
                break L1;
              } else {
                field_y = null;
                break L1;
              }
            }
            L2: while (true) {
              param3--;
              if (0 > param3) {
                break L0;
              } else {
                var9 = param0;
                var5 = var9;
                var6 = param2;
                var7 = param1;
                var9[var6] = var7 - -(va.a(var9[var6], 16711422) >> 1);
                param2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("sm.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final byte[] e(byte param0) {
        if (((sm) this).field_v) {
            throw new RuntimeException();
        }
        if (param0 < 82) {
            return null;
        }
        return ((sm) this).field_C;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 < 2) {
                break L1;
              } else {
                if (param2 <= 36) {
                  var4_int = param1 ? 1 : 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param0.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var7 <= var8) {
                      stackOut_40_0 = var5;
                      stackIn_41_0 = stackOut_40_0;
                      break L0;
                    } else {
                      L3: {
                        var9 = param0.charAt(var8);
                        if (0 == var8) {
                          if (var9 != 45) {
                            if (43 != var9) {
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            var4_int = 1;
                            var8++;
                            var8++;
                            continue L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if (48 > var9) {
                            break L5;
                          } else {
                            if (var9 <= 57) {
                              var9 -= 48;
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (65 > var9) {
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
                          if (97 > var9) {
                            break L7;
                          } else {
                            if (122 < var9) {
                              break L7;
                            } else {
                              var9 -= 87;
                              break L4;
                            }
                          }
                        }
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0 != 0;
                      }
                      if (~var9 <= ~param2) {
                        stackOut_27_0 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        return stackIn_28_0 != 0;
                      } else {
                        L8: {
                          if (var4_int != 0) {
                            var9 = -var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var10 = var6 * param2 + var9;
                        if (var6 == var10 / param2) {
                          var5 = 1;
                          var6 = var10;
                          var8++;
                          var8++;
                          continue L2;
                        } else {
                          stackOut_33_0 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          return stackIn_34_0 != 0;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var4;
            stackOut_42_1 = new StringBuilder().append("sm.G(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L9;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 44 + param1 + 44 + param2 + 44 + 1 + 41);
        }
        return stackIn_41_0 != 0;
    }

    final int f(byte param0) {
        if (((sm) this).field_v) {
            return 0;
        }
        if (param0 != 100) {
            ((sm) this).field_z = 27;
            return 100;
        }
        return 100;
    }

    public static void g(byte param0) {
        field_A = null;
        field_y = null;
    }

    sm() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new mn();
    }
}
