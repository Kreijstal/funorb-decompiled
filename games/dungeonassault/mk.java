/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ne {
    static nn field_j;
    byte[] field_k;
    static int[] field_i;

    final static String a(byte param0, byte[] param1, int param2, int param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            var13 = new char[param2];
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= param2) {
                stackOut_16_0 = new String(var13, 0, var5);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L2: {
                  var7 = 255 & param1[var6 + param3];
                  if (var7 != 0) {
                    L3: {
                      if (var7 < 128) {
                        break L3;
                      } else {
                        if (var7 < 160) {
                          L4: {
                            var8 = mh.field_d[var7 - 128];
                            if (var8 == 0) {
                              var8 = 63;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var7 = var8;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = (char)var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("mk.D(").append(-24).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    public static void b() {
        field_j = null;
        field_i = null;
    }

    mk(byte[] param0) {
        try {
            ((mk) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "mk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if (param1 != null) {
              var3_int = param1.length();
              if (var3_int < 1) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = jm.a((byte) 59, param1);
                    var5 = -123;
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (var4.length() >= 1) {
                        L2: {
                          if (jc.a(var4.charAt(0), -119)) {
                            break L2;
                          } else {
                            if (jc.a(var4.charAt(-1 + var4.length()), -59)) {
                              break L2;
                            } else {
                              var6 = 0;
                              var7 = 0;
                              L3: while (true) {
                                if (var7 >= param1.length()) {
                                  if (var6 <= 0) {
                                    stackOut_31_0 = 1;
                                    stackIn_32_0 = stackOut_31_0;
                                    break L0;
                                  } else {
                                    stackOut_29_0 = 0;
                                    stackIn_30_0 = stackOut_29_0;
                                    return stackIn_30_0 != 0;
                                  }
                                } else {
                                  L4: {
                                    var8 = param1.charAt(var7);
                                    if (!jc.a((char) var8, 68)) {
                                      var6 = 0;
                                      break L4;
                                    } else {
                                      var6++;
                                      break L4;
                                    }
                                  }
                                  if (var6 < 2) {
                                    var7++;
                                    continue L3;
                                  } else {
                                    stackOut_25_0 = 0;
                                    stackIn_26_0 = stackOut_25_0;
                                    return stackIn_26_0 != 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("mk.A(").append(false).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L5;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + 64 + ')');
        }
        return stackIn_32_0 != 0;
    }

    final static nh a(int param0, byte param1) {
        if (param1 != 34) {
            nh discarded$0 = mk.a(109, (byte) -40);
        }
        return uo.a(false, 1, true, param0, param1 + 27813, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[4];
    }
}
