/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    static nk[] field_b;
    static int[] field_c;
    static String field_d;
    static pa[] field_a;

    protected aa() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void b(int param0) {
        Object var2 = null;
        ub.a(rt.field_e, (String) null, -117);
        if (param0 != 87) {
            field_d = null;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, byte param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
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
        int stackOut_23_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (2 > param1) {
                break L1;
              } else {
                if (param1 > 36) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var7 <= var8) {
                      stackOut_39_0 = var5;
                      stackIn_40_0 = stackOut_39_0;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          var9 = param2.charAt(var8);
                          if (var8 == 0) {
                            if (var9 != 45) {
                              if (43 != var9) {
                                break L4;
                              } else {
                                if (!param0) {
                                  break L4;
                                } else {
                                  var8++;
                                  break L3;
                                }
                              }
                            } else {
                              var4_int = 1;
                              var8++;
                              break L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (var9 < 48) {
                              break L6;
                            } else {
                              if (57 < var9) {
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
                              if (var9 > 90) {
                                break L7;
                              } else {
                                var9 -= 55;
                                break L5;
                              }
                            }
                          }
                          if (var9 < 97) {
                            stackOut_23_0 = 0;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0 != 0;
                          } else {
                            if (var9 <= 122) {
                              var9 -= 87;
                              break L5;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (param1 > var9) {
                          L8: {
                            if (var4_int == 0) {
                              break L8;
                            } else {
                              var9 = -var9;
                              break L8;
                            }
                          }
                          var10 = param1 * var6 - -var9;
                          if (var6 == var10 / param1) {
                            var5 = 1;
                            var6 = var10;
                            break L3;
                          } else {
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            return stackIn_33_0 != 0;
                          }
                        } else {
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0 != 0;
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("aa.E(").append(param0).append(44).append(param1).append(44);
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
          throw pn.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + -43 + 41);
        }
        return stackIn_40_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new nk[8];
        field_d = "Account created successfully!";
    }
}
