/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ega {
    static int field_c;
    static String field_d;
    static int field_b;
    static nh field_e;
    private static String[] field_a;

    final static boolean a(int param0, CharSequence param1, boolean param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
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
        int stackOut_25_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (param0 > 36) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param1.length();
                    var8 = 0;
                    if (param2) {
                      break L2;
                    } else {
                      var12 = null;
                      boolean discarded$1 = ega.a(-127, (CharSequence) null, true, false);
                      break L2;
                    }
                  }
                  L3: while (true) {
                    if (var8 >= var7) {
                      stackOut_41_0 = var5;
                      stackIn_42_0 = stackOut_41_0;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (0 != var8) {
                            break L5;
                          } else {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                L6: {
                                  if (param3) {
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var8++;
                                continue L3;
                              }
                            }
                          }
                        }
                        L7: {
                          L8: {
                            if (var9 < 48) {
                              break L8;
                            } else {
                              if (var9 > 57) {
                                break L8;
                              } else {
                                var9 -= 48;
                                break L7;
                              }
                            }
                          }
                          L9: {
                            if (65 > var9) {
                              break L9;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (var9 < 97) {
                            stackOut_25_0 = 0;
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0 != 0;
                          } else {
                            if (122 >= var9) {
                              var9 -= 87;
                              break L7;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (var9 >= param0) {
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          return stackIn_32_0 != 0;
                        } else {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = var9 + param0 * var6;
                          if (var10 / param0 != var6) {
                            stackOut_37_0 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            return stackIn_38_0 != 0;
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("ega.A(").append(param0).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L11;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_42_0 != 0;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "No spectators";
        field_a = new String[2];
        field_a[0] = "Skeleton";
    }
}
