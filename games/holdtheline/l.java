/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class l {
    static pc[] field_a;
    static boolean field_b;

    final static void a(int param0, vk param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        ei var3 = null;
        int var4 = 0;
        ei var5 = null;
        ei var6 = null;
        ei var7 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param1.field_c.field_e) {
                L2: {
                  if (param0 == 29824) {
                    break L2;
                  } else {
                    field_a = (pc[]) null;
                    break L2;
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= param1.field_t.field_e) {
                    var2_int = 0;
                    L4: while (true) {
                      if (param1.field_t.field_e <= var2_int) {
                        L5: {
                          if (-4 != (param1.field_p ^ -1)) {
                            break L5;
                          } else {
                            jg.a(wg.field_c, param1.field_e, (byte) 95);
                            break L5;
                          }
                        }
                        break L0;
                      } else {
                        var7 = (ei) (param1.field_t.field_b[var2_int]);
                        jg.a(new ce(7, 20.0f), var7, (byte) 41);
                        var2_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var6 = (ei) (param1.field_t.field_b[var2_int]);
                    jg.a(new pj(7, 20.0f), var6, (byte) 82);
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                L6: {
                  var5 = (ei) (param1.field_c.field_b[var2_int]);
                  var3 = var5;
                  if (-1 == (param1.field_p ^ -1)) {
                    jg.a(ri.field_c, var5, (byte) 92);
                    break L6;
                  } else {
                    if ((param1.field_p ^ -1) == -3) {
                      jg.a(vh.field_f, var5, (byte) 18);
                      break L6;
                    } else {
                      if (-4 != (param1.field_p ^ -1)) {
                        jg.a(new kj(7, 13941600), var5, (byte) 42);
                        break L6;
                      } else {
                        jg.a(new kj(4, 12566272), var5, (byte) 118);
                        break L6;
                      }
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("l.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 17310) {
            field_b = false;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, in param4, int param5, qm param6, in param7, qm param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9_int = -param8.field_h + param6.field_h;
            var10 = -param8.field_f + param6.field_f;
            var11 = Math.abs(param4.field_j * param7.field_j + param7.field_g * param4.field_g);
            var12 = Math.abs(-(param7.field_j * param4.field_g) + param7.field_g * param4.field_j);
            var13 = var12;
            var14 = var11;
            var15 = param7.field_j * (float)var9_int + (float)var10 * param7.field_g;
            var16 = -((float)var10 * param7.field_j) + param7.field_g * (float)var9_int;
            var17 = (float)var9_int * param4.field_j + (float)var10 * param4.field_g;
            var18 = -((float)var10 * param4.field_j) + param4.field_g * (float)var9_int;
            le.field_s[0] = (float)(-param2) + (-((float)param1 * var13) - var11 * (float)param3 + Math.abs(var15));
            if (le.field_s[0] > 0.0f) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              le.field_s[1] = (float)(-param5) + (Math.abs(var16) - (var12 * (float)param3 + var14 * (float)param1));
              if (le.field_s[1] <= 0.0f) {
                le.field_s[2] = Math.abs(var17) - (var11 * (float)param2 + (float)param5 * var12) - (float)param3;
                if (0.0f < le.field_s[2]) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  le.field_s[3] = (float)(-param1) + (Math.abs(var18) - (var14 * (float)param5 + var13 * (float)param2));
                  if (le.field_s[3] <= (float)param0) {
                    stackIn_15_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_13_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
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
          L1: {
            var9 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var9);

            stackIn_18_1 = new StringBuilder().append("l.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L1;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param7 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param8 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), stackIn_28_2 + ')');
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
                return stackIn_13_0 != 0;
              } else {
                return stackIn_15_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_a = new pc[14];
        field_b = false;
    }
}
