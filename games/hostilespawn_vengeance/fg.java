/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static jb[] field_b;
    static String field_a;
    static int[] field_c;
    static bd field_d;

    final static void a(int param0, int param1, int param2, p param3) {
        int var4_int = 0;
        try {
            var4_int = -(param3.field_e * 32) + 256;
            int var5 = -125 % ((-44 - param2) / 49);
            lg.field_k.a(true, var4_int, (int)param3.field_c, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "fg.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(ic param0, int param1, boolean param2, jd param3) {
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        p var9 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (null == param0.field_l) {
                  break L1;
                } else {
                  if (param3 == null) {
                    break L1;
                  } else {
                    if (param0.field_j == param3.field_t) {
                      var4_int = param3.field_w.length;
                      var5 = param0.field_l[param1].length / var4_int;
                      var6 = 0;
                      L2: while (true) {
                        if (var5 <= var6) {
                          L3: {
                            if (!param2) {
                              break L3;
                            } else {
                              var9 = (p) null;
                              fg.a(81, -66, -114, (p) null);
                              break L3;
                            }
                          }
                          stackIn_23_0 = -1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L4: {
                            if ((param3.field_k ^ -1L) != (param0.field_i[param1][var6] ^ -1L)) {
                              break L4;
                            } else {
                              if (pc.a(14088, param0.field_p[param1][var6])) {
                                var7 = 0;
                                L5: while (true) {
                                  if (var7 >= var4_int) {
                                    stackIn_18_0 = var6;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  } else {
                                    if (param3.field_w[var7] != param0.field_l[param1][var6 * var4_int - -var7]) {
                                      break L4;
                                    } else {
                                      var7++;
                                      continue L5;
                                    }
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("fg.A(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_23_0;
          }
        }
    }

    final static java.awt.Container b(byte param0) {
        if (!(null == md.field_n)) {
            return (java.awt.Container) ((Object) md.field_n);
        }
        if (param0 != -31) {
            field_b = (jb[]) null;
        }
        return (java.awt.Container) ((Object) bn.c(-1));
    }

    final static bd a(String param0, String param1, gb param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bd stackIn_2_0 = null;
        bd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param2.a((byte) -2, param0);
            if (!param3) {
              var5 = param2.a(var4_int, param1, -1);
              stackIn_4_0 = ac.a(var4_int, var5, (byte) -118, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (bd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("fg.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        int var1 = -49 % ((param0 - -55) / 38);
        field_c = null;
    }

    final static boolean a(int param0) {
        if (param0 != 32) {
            fg.a((byte) 107);
        }
        return sj.field_a.a(-26720);
    }

    static {
        field_b = new jb[27];
        field_a = "Please enter your age in years";
        field_c = new int[]{3, 4};
    }
}
