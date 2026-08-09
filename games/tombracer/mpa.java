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
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param0 < -66) {
                  break L1;
                } else {
                  mpa.a(true, -28, -59);
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
                                  if (param2.length() <= var6) {
                                    if ((var5 ^ -1) < -1) {
                                      stackIn_34_0 = gta.field_e;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param2.charAt(var6);
                                      if (!hf.a(124, (char) var7)) {
                                        var5 = 0;
                                        break L6;
                                      } else {
                                        var5++;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if ((var5 ^ -1) > -3) {
                                        break L7;
                                      } else {
                                        if (param1) {
                                          break L7;
                                        } else {
                                          stackIn_29_0 = pqa.field_r;
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
                            }
                          }
                          stackIn_20_0 = gta.field_e;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackIn_15_0 = ssa.field_d;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = ssa.field_d;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = ssa.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("mpa.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L8;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
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
                  return stackIn_29_0;
                } else {
                  return stackIn_34_0;
                }
              }
            }
          }
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0) {
          L0: {
            field_X = false;
            if (-1 == (param2 & 1048832 ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (param2 & 1048832 ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
