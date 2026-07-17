/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static am field_f;
    static int[] field_e;
    static int field_a;
    static String field_d;
    static String field_c;
    static pj field_b;

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
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
            stackOut_2_0 = wk.a(90, param0, param1, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("wk.A(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -1 + 41);
        }
        return stackIn_3_0;
    }

    final static int a(int param0, int param1, CharSequence param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if (param1 > 36) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    if (param0 == 90) {
                      break L2;
                    } else {
                      field_d = null;
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_39_0 = var6;
                        stackIn_40_0 = stackOut_39_0;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param2.charAt(var8);
                          if (var8 == 0) {
                            if (45 != var9) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (90 >= var9) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param1 > var9) {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = param1 * var6 + var9;
                          if (var10 / param1 != var6) {
                            throw new NumberFormatException();
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("wk.B(").append(param0).append(44).append(param1).append(44);
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
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L11;
            }
          }
          throw la.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + 1 + 41);
        }
        return stackIn_40_0;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new am();
        field_e = new int[8192];
        field_a = -1;
        field_c = "Orb points: <%0>";
        field_b = new pj();
    }
}
