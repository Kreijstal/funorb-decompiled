/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    static String field_b;
    static boolean field_a;

    final static int a(of param0, int param1, id param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.field_m == null) {
                  break L1;
                } else {
                  if (param2 == null) {
                    break L1;
                  } else {
                    if (param0.field_p != param2.field_l) {
                      break L1;
                    } else {
                      L2: {
                        if (param1 == -1) {
                          break L2;
                        } else {
                          field_a = true;
                          break L2;
                        }
                      }
                      var4_int = param2.field_q.length;
                      var5 = param0.field_m[param3].length / var4_int;
                      var6 = 0;
                      L3: while (true) {
                        if (var5 <= var6) {
                          stackIn_22_0 = -1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L4: {
                            if (param0.field_r[param3][var6] != param2.field_s) {
                              break L4;
                            } else {
                              if (!ea.a(param0.field_o[param3][var6], (byte) -25)) {
                                break L4;
                              } else {
                                var7 = 0;
                                L5: while (true) {
                                  if (var4_int <= var7) {
                                    stackIn_19_0 = var6;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  } else {
                                    if (param2.field_q[var7] != param0.field_m[param3][var6 * var4_int + var7]) {
                                      break L4;
                                    } else {
                                      var7++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var6++;
                          continue L3;
                        }
                      }
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
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("kp.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0;
          } else {
            return stackIn_22_0;
          }
        }
    }

    public static void a(int param0) {
        id var2;
        if (param0 != -1) {
          var2 = (id) null;
          kp.a((of) null, -64, (id) null, -29);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static void a(int param0, id param1, int param2) {
        try {
            if (param2 <= 60) {
                id var4 = (id) null;
                kp.a((of) null, 14, (id) null, -12);
            }
            ow.field_f.a((ms) (param1), (byte) 39);
            km.a((byte) 69, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "kp.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Classic";
        field_a = false;
    }
}
