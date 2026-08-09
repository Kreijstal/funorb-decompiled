/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static rj field_b;
    static int field_a;
    static int[] field_d;
    static int[][] field_c;
    static aa field_e;
    static long field_f;

    final static ge[] a(int param0, lj param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        ge[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param1.a(param3, -80);
              if (param0 > 27) {
                break L1;
              } else {
                var6 = (String) null;
                mh.a((String) null, (byte) -125, 0.009368140250444412f);
                break L1;
              }
            }
            var5 = param1.a(var4_int, param2, (byte) 85);
            stackIn_3_0 = m.a(param1, var4_int, (byte) 6, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("mh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, byte param1, float param2) {
        bg.field_G = param2;
        if (param1 != -125) {
            return;
        }
        try {
            sa.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "mh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte[] param1, int[] param2, int param3, boolean param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                field_e = (aa) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (vf.field_b.length <= var5_int) {
                break L0;
              } else {
                param3 = vf.field_b[var5_int];
                var6 = var5_int << 1108340484;
                L3: while (true) {
                  incrementValue$5 = param3;
                  param3--;
                  if (-1 == (incrementValue$5 ^ -1)) {
                    var5_int++;
                    continue L2;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param0 = k.field_e[incrementValue$6];
                    dupTemp$7 = param1[param0];
                    dupTemp$8 = param2[dupTemp$7];
                    param2[dupTemp$7] = dupTemp$8 + 1;
                    k.field_e[dupTemp$8] = param0;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("mh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(String param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (li.a((byte) -82, param2)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!qf.a(-8503, param2)) {
                if (gi.a((byte) 57, param2)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.length() == 0) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (kc.a(param0, (byte) -52, param2)) {
                      stackIn_18_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L1: {
                        if (param1) {
                          break L1;
                        } else {
                          var4 = (String) null;
                          mh.a(66, (lj) null, (String) null, (String) null);
                          break L1;
                        }
                      }
                      if (!bc.a((byte) -128, param2, param0)) {
                        if (ja.a(param2, 119, param0)) {
                          stackIn_27_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          return true;
                        }
                      } else {
                        stackIn_23_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("mh.D(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L2;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L3;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0 != 0;
                  } else {
                    return stackIn_27_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        int var1 = -79 % ((param0 - 6) / 35);
        field_c = (int[][]) null;
    }

    static {
        field_b = new rj();
        field_d = new int[5];
        field_c = new int[][]{new int[]{15, 15, 15}, new int[]{10, 10, 10}, new int[]{5, 10, 15}, new int[]{50, 50, 50}, new int[]{5, 5, 5}, new int[]{20, 20, 60}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0}, new int[]{0}};
    }
}
