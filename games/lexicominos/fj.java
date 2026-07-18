/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class fj extends si {
    byte[] field_w;
    static String field_x;
    int field_A;
    static String field_y;
    dl field_z;

    public static void f(byte param0) {
        field_x = null;
        field_y = null;
        if (param0 != -12) {
            Object var2 = null;
            String discarded$0 = fj.a((CharSequence) null, 26, true);
        }
    }

    final static void a(int param0, mc param1) {
        th var3 = ed.field_q;
        var3.h(5, 0);
        var3.c(2, -1);
        try {
            var3.c(0, -1);
            var3.c(param1.field_j, -1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "fj.A(" + 5 + ',' + (param1 != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_35_0 = null;
        String stackOut_30_0 = null;
        String stackOut_20_0 = null;
        String stackOut_15_0 = null;
        String stackOut_10_0 = null;
        Object stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var3_int = param0.length();
              if (param1 == 100) {
                L1: {
                  if (var3_int < 1) {
                    break L1;
                  } else {
                    if (var3_int <= 12) {
                      L2: {
                        int discarded$4 = -48;
                        var4 = ck.a(param0);
                        if (var4 == null) {
                          break L2;
                        } else {
                          if (var4.length() < 1) {
                            break L2;
                          } else {
                            L3: {
                              int discarded$5 = 78;
                              if (cf.a(var4.charAt(0))) {
                                break L3;
                              } else {
                                int discarded$6 = 78;
                                if (!cf.a(var4.charAt(-1 + var4.length()))) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    if (param0.length() <= var6) {
                                      if (var5 > 0) {
                                        stackOut_35_0 = ac.field_a;
                                        stackIn_36_0 = stackOut_35_0;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param0.charAt(var6);
                                        int discarded$7 = 78;
                                        if (!cf.a((char) var7)) {
                                          var5 = 0;
                                          break L5;
                                        } else {
                                          var5++;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (var5 < 2) {
                                          break L6;
                                        } else {
                                          if (!param2) {
                                            stackOut_30_0 = rg.field_a;
                                            stackIn_31_0 = stackOut_30_0;
                                            return stackIn_31_0;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            stackOut_20_0 = ac.field_a;
                            stackIn_21_0 = stackOut_20_0;
                            return stackIn_21_0;
                          }
                        }
                      }
                      stackOut_15_0 = wh.field_a;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_10_0 = wh.field_a;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (String) (Object) stackIn_6_0;
              }
            } else {
              stackOut_2_0 = wh.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("fj.D(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L7;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_36_0;
    }

    final byte[] d(byte param0) {
        int var2 = -4 % ((2 - param0) / 38);
        if (!(!((fj) this).field_v)) {
            throw new RuntimeException();
        }
        return ((fj) this).field_w;
    }

    final int c(byte param0) {
        if (param0 != 16) {
            fj.f((byte) 77);
            if (!(!((fj) this).field_v)) {
                return 0;
            }
            return 100;
        }
        if (!(!((fj) this).field_v)) {
            return 0;
        }
        return 100;
    }

    final static kb a(String param0, String param1) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        int var7 = 0;
        CharSequence var8 = null;
        kb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        kb stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
              var4_long = 0L;
              var7 = -15;
              var6 = null;
              if (param1.indexOf('@') == -1) {
                var8 = (CharSequence) (Object) param1;
                var4_long = fd.a((byte) -58, var8);
                break L1;
              } else {
                var6 = (Object) (Object) param1;
                break L1;
              }
            }
            stackOut_3_0 = ef.a(var4_long, -27981, (String) var6, false, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("fj.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + false + ',' + -111 + ')');
        }
        return stackIn_4_0;
    }

    fj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Email is valid";
        field_y = "Waiting for music";
    }
}
