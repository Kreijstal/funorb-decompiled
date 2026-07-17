/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class mpa extends lc {
    static int[] field_W;
    static apa field_V;
    static boolean field_X;

    mpa(jta param0, ae param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
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
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_33_0 = null;
        String stackOut_28_0 = null;
        String stackOut_19_0 = null;
        String stackOut_14_0 = null;
        String stackOut_9_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param0 < -66) {
                  break L1;
                } else {
                  boolean discarded$1 = mpa.a(true, -28, -59);
                  break L1;
                }
              }
              L2: {
                var3_int = param2.length();
                if (var3_int < 1) {
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
                        if (var4.length() >= 1) {
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
                                  if (~param2.length() >= ~var6) {
                                    if (var5 > 0) {
                                      stackOut_33_0 = gta.field_e;
                                      stackIn_34_0 = stackOut_33_0;
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
                                      if (var5 < 2) {
                                        break L7;
                                      } else {
                                        if (param1) {
                                          break L7;
                                        } else {
                                          stackOut_28_0 = pqa.field_r;
                                          stackIn_29_0 = stackOut_28_0;
                                          return stackIn_29_0;
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
                          stackOut_19_0 = gta.field_e;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_14_0 = ssa.field_d;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                }
              }
              stackOut_9_0 = ssa.field_d;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            } else {
              stackOut_2_0 = ssa.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("mpa.M(").append(param0).append(44).append(param1).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
        }
        return stackIn_34_0;
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
            if (-1 == (param2 & 1048832)) {
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
            if (-1 == (param2 & 1048832)) {
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
                field_W = null;
            }
            super.a(75, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mpa.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new int[]{0, 512, 0};
    }
}
