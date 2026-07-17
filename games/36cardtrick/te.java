/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class te {
    static String field_b;
    static int field_a;

    final static kc a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Main.field_T;
        kc var6 = new kc(param0, param0);
        kc var3 = var6;
        if (param1 >= -123) {
            return null;
        }
        for (var4 = 0; var4 < var3.field_r.length; var4++) {
            var6.field_r[var4] = param2;
        }
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
    }

    abstract void a(java.awt.Component param0, boolean param1);

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var3 = null;
                boolean discarded$2 = te.a(false, (String) null);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length() < lg.field_k) {
                  break L2;
                } else {
                  if (param1.length() > jd.field_g) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("te.D(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    abstract void a(int param0, java.awt.Component param1);

    abstract int b(int param0);

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
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
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var11 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (param0 > 36) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var7 <= var8) {
                      if (param1 > 62) {
                        stackOut_39_0 = var5;
                        stackIn_40_0 = stackOut_39_0;
                        break L0;
                      } else {
                        stackOut_37_0 = 1;
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0 != 0;
                      }
                    } else {
                      L3: {
                        L4: {
                          var9 = param2.charAt(var8);
                          if (var8 != 0) {
                            break L4;
                          } else {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                break L3;
                              }
                            } else {
                              var4_int = 1;
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (48 > var9) {
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
                          if (97 > var9) {
                            stackOut_21_0 = 0;
                            stackIn_22_0 = stackOut_21_0;
                            return stackIn_22_0 != 0;
                          } else {
                            if (var9 <= 122) {
                              var9 -= 87;
                              break L5;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (var9 < param0) {
                          L8: {
                            if (var4_int == 0) {
                              break L8;
                            } else {
                              var9 = -var9;
                              break L8;
                            }
                          }
                          var10 = var9 + var6 * param0;
                          if (var10 / param0 != var6) {
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            return stackIn_33_0 != 0;
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L3;
                          }
                        } else {
                          stackOut_26_0 = 0;
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0 != 0;
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("te.F(").append(param0).append(44).append(param1).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L9;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + 1 + 41);
        }
        return stackIn_40_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Type your email address again to make sure it's correct";
    }
}
