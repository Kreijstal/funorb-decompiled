/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends rf {
    static String field_i;
    static int field_k;
    int[] field_j;
    static String[] field_f;
    int field_g;
    static byte[][] field_h;

    final static String a(int param0) {
        boolean discarded$0 = false;
        if (uh.field_k == jl.field_a) {
            return wj.field_c;
        }
        if (!qa.field_a.b(false)) {
            return qa.field_a.a((byte) 2);
        }
        if (ie.field_x == jl.field_a) {
            return qa.field_a.a((byte) 2);
        }
        if (param0 != 29084) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = we.a((byte) -46, (CharSequence) null, false, -37);
        }
        return lc.field_hb;
    }

    private we() throws Throwable {
        throw new Error();
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (36 < param3) {
                  break L1;
                } else {
                  if (param0 == -108) {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param1.length();
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var7) {
                        stackOut_40_0 = var5;
                        stackIn_41_0 = stackOut_40_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        L3: {
                          L4: {
                            var9 = param1.charAt(var8);
                            if (-1 != (var8 ^ -1)) {
                              break L4;
                            } else {
                              if (var9 == 45) {
                                var4_int = 1;
                                break L3;
                              } else {
                                if (var9 != 43) {
                                  break L4;
                                } else {
                                  if (!param2) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
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
                                if (var9 > 90) {
                                  break L7;
                                } else {
                                  var9 -= 55;
                                  break L5;
                                }
                              }
                            }
                            if (97 > var9) {
                              stackOut_25_0 = 0;
                              stackIn_26_0 = stackOut_25_0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L5;
                              } else {
                                return false;
                              }
                            }
                          }
                          if (var9 < param3) {
                            L8: {
                              if (var4_int != 0) {
                                var9 = -var9;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var10 = var6 * param3 - -var9;
                            if (var6 != var10 / param3) {
                              stackOut_36_0 = 0;
                              stackIn_37_0 = stackOut_36_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var5 = 1;
                              var6 = var10;
                              break L3;
                            }
                          } else {
                            stackOut_29_0 = 0;
                            stackIn_30_0 = stackOut_29_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var4);
            stackOut_42_1 = new StringBuilder().append("we.B(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L9;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L9;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_26_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_30_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_37_0 != 0;
              } else {
                return stackIn_41_0 != 0;
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        String discarded$0 = null;
        if (param0 != 95) {
            discarded$0 = we.a(-107);
        }
        field_f = null;
        field_h = (byte[][]) null;
        field_i = null;
    }

    static {
        field_k = 0;
        field_f = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_h = new byte[250][];
    }
}
