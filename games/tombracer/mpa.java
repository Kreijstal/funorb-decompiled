/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mpa extends lc {
    static int[] field_W;
    static apa field_V;
    static boolean field_X;

    mpa(jta param0, ae param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        boolean stackIn_24_0 = false;
        String stackIn_31_0 = null;
        int stackIn_34_0 = 0;
        String stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        boolean stackOut_23_0 = false;
        String stackOut_30_0 = null;
        String stackOut_36_0 = null;
        String stackOut_19_0 = null;
        String stackOut_14_0 = null;
        String stackOut_9_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param0 < -66) {
                  break L1;
                } else {
                  discarded$1 = mpa.a(true, -28, -59);
                  break L1;
                }
              }
              L2: {
                var3_int = param2.length();
                if ((var3_int ^ -1) > -2) {
                  break L2;
                } else {
                  if (12 < var3_int) {
                    break L2;
                  } else {
                    L3: {
                      var4 = jd.a(1, param2);
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (-2 >= (var4.length() ^ -1)) {
                          L4: {
                            if (hf.a(-85, var4.charAt(0))) {
                              break L4;
                            } else {
                              if (hf.a(-99, var4.charAt(-1 + var4.length()))) {
                                break L4;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  L6: {
                                    if (param2.length() <= var6) {
                                      stackOut_33_0 = var5 ^ -1;
                                      stackIn_34_0 = stackOut_33_0;
                                      break L6;
                                    } else {
                                      var7 = param2.charAt(var6);
                                      stackOut_23_0 = hf.a(124, (char) var7);
                                      stackIn_34_0 = stackOut_23_0 ? 1 : 0;
                                      stackIn_24_0 = stackOut_23_0;
                                      if (var8 != 0) {
                                        break L6;
                                      } else {
                                        L7: {
                                          L8: {
                                            if (!stackIn_24_0) {
                                              break L8;
                                            } else {
                                              var5++;
                                              if (var8 == 0) {
                                                break L7;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                          var5 = 0;
                                          break L7;
                                        }
                                        L9: {
                                          if ((var5 ^ -1) > -3) {
                                            break L9;
                                          } else {
                                            if (param1) {
                                              break L9;
                                            } else {
                                              stackOut_30_0 = pqa.field_r;
                                              stackIn_31_0 = stackOut_30_0;
                                              decompiledRegionSelector0 = 4;
                                              break L0;
                                            }
                                          }
                                        }
                                        var6++;
                                        continue L5;
                                      }
                                    }
                                  }
                                  if (stackIn_34_0 < -1) {
                                    stackOut_36_0 = gta.field_e;
                                    stackIn_37_0 = stackOut_36_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    return null;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_19_0 = gta.field_e;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_14_0 = ssa.field_d;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackOut_9_0 = ssa.field_d;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = ssa.field_d;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var3);
            stackOut_39_1 = new StringBuilder().append("mpa.M(").append(param0).append(',').append(param1).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0;
                } else {
                  return stackIn_37_0;
                }
              }
            }
          }
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            field_X = false;
            if (-1 == (param2 & 1048832 ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (param2 & 1048832 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, ae param1) {
        try {
            if (param0 <= 67) {
                field_W = (int[]) null;
            }
            super.a(75, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mpa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        field_V = null;
        if (param0 != 0) {
            return;
        }
        field_W = null;
    }

    static {
        field_W = new int[]{0, 512, 0};
    }
}
