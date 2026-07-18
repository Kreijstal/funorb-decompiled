/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static qj field_f;
    static long field_b;
    static hi field_e;
    static int field_a;
    static String field_h;
    static boolean field_d;
    static int[][] field_g;
    static byte[][][] field_c;
    static int field_i;
    static int field_j;

    public static void a() {
        field_c = null;
        field_h = null;
        field_f = null;
        field_g = null;
        field_e = null;
    }

    final static short[] a(short[] param0, int param1, int param2, hj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param3.k(16, 1522829539);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (var4_int != param0.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param3.k(4, 1522829539);
                var6 = (short)param3.k(16, 1522829539);
                if (0 >= var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param0[var7] = (short)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param0[var7] = (short)(param3.k(var5, 1522829539) + var6);
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_16_0 = (short[]) param0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("lb.D(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(256).append(',').append(16).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_17_0;
    }

    final static String a(boolean param0) {
        String var1 = "";
        if (!(null == ok.field_a)) {
            var1 = ok.field_a.e((byte) 28);
        }
        if (var1.length() == 0) {
            int discarded$0 = -113;
            var1 = gj.a();
        }
        if (!(0 != var1.length())) {
            var1 = nf.field_q;
        }
        return var1;
    }

    final static q a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        q stackIn_4_0 = null;
        q stackIn_8_0 = null;
        q stackIn_12_0 = null;
        int stackIn_21_0 = 0;
        q stackIn_26_0 = null;
        q stackIn_39_0 = null;
        q stackIn_44_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        q stackOut_3_0 = null;
        q stackOut_7_0 = null;
        q stackOut_43_0 = null;
        q stackOut_38_0 = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        q stackOut_25_0 = null;
        q stackOut_11_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_3_0 = ai.field_a;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 64) {
              stackOut_7_0 = rd.field_d;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (param0.charAt(0) != 34) {
                var3 = 0;
                var4 = 0;
                L0: while (true) {
                  if (~var2_int < ~var4) {
                    L1: {
                      var5 = param0.charAt(var4);
                      if (46 != var5) {
                        if (-1 == nb.field_c.indexOf(var5)) {
                          stackOut_43_0 = vc.field_N;
                          stackIn_44_0 = stackOut_43_0;
                          return stackIn_44_0;
                        } else {
                          var3 = 0;
                          break L1;
                        }
                      } else {
                        L2: {
                          if (0 == var4) {
                            break L2;
                          } else {
                            if (~var4 == ~(var2_int - 1)) {
                              break L2;
                            } else {
                              if (var3 != 0) {
                                break L2;
                              } else {
                                var3 = 1;
                                break L1;
                              }
                            }
                          }
                        }
                        stackOut_38_0 = vc.field_N;
                        stackIn_39_0 = stackOut_38_0;
                        return stackIn_39_0;
                      }
                    }
                    var4++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                if (param0.charAt(var2_int + -1) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (var4 < -1 + var2_int) {
                      L4: {
                        var5 = param0.charAt(var4);
                        if (92 == var5) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              break L5;
                            } else {
                              stackOut_19_0 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_21_0;
                          break L4;
                        } else {
                          L6: {
                            if (var5 != 34) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                stackOut_25_0 = vc.field_N;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_11_0 = vc.field_N;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var2;
            stackOut_48_1 = new StringBuilder().append("lb.A(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L7;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + 5507 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0L;
        field_f = new qj();
        field_a = 256;
        field_e = new hi();
        field_i = 0;
        field_g = new int[][]{new int[4]};
    }
}
