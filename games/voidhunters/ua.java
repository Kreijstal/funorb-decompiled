/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
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
              si.a(67, 62, param0[0].a(51));
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = null;
                int discarded$2 = ua.a(false, (CharSequence) null, true, -5);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ua.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    ua(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(boolean param0, CharSequence param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_47_0 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (param3 <= 36) {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    if (param2) {
                      break L2;
                    } else {
                      field_o = 6;
                      break L2;
                    }
                  }
                  var7 = param1.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_47_0 = var6;
                        stackIn_48_0 = stackOut_47_0;
                        break L0;
                      }
                    } else {
                      L4: {
                        var9 = param1.charAt(var8);
                        if (var8 == 0) {
                          if (var9 == 45) {
                            var4_int = 1;
                            var8++;
                            var8++;
                            continue L3;
                          } else {
                            if (43 != var9) {
                              break L4;
                            } else {
                              if (param0) {
                                var8++;
                                var8++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          if (48 > var9) {
                            break L6;
                          } else {
                            if (var9 <= 57) {
                              var9 -= 48;
                              break L5;
                            } else {
                              break L6;
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
                        L8: {
                          if (var9 < 97) {
                            break L8;
                          } else {
                            if (var9 <= 122) {
                              var9 -= 87;
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        throw new NumberFormatException();
                      }
                      if (~param3 >= ~var9) {
                        throw new NumberFormatException();
                      } else {
                        L9: {
                          if (var4_int != 0) {
                            var9 = -var9;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var10 = var9 + var6 * param3;
                        if (~var6 != ~(var10 / param3)) {
                          throw new NumberFormatException();
                        } else {
                          var6 = var10;
                          var5 = 1;
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var4;
            stackOut_49_1 = new StringBuilder().append("ua.B(").append(param0).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L10;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L10;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_48_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 1;
    }
}
