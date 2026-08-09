/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String field_b;
    static ka field_a;

    final static void b(int param0) {
        eo.field_f = null;
        if (param0 != 26311) {
            ph.b(64);
        }
        on.field_i = null;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -1) {
            jc var2 = (jc) null;
            ph.a((rc) null, (byte) -75, 36, (jc) null);
        }
    }

    final static void a(byte param0, wj param1) {
        RuntimeException runtimeException = null;
        jc var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              tp.a(75, true, param1);
              if (param0 >= 40) {
                break L1;
              } else {
                var3 = (jc) null;
                ph.a((rc) null, (byte) -23, 122, (jc) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ph.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, dj param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        dj var5 = null;
        byte[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = param3.a((byte) 51, param0, param2);
            var4 = var6;
            if (var6 == null) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              rn.a(var6, 0);
              if (param1 == 31043) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5 = (dj) null;
                ph.a(-94, 1, -17, (dj) null);
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("ph.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static int a(rc param0, byte param1, int param2, jc param3) {
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
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.field_k == null) {
                  break L1;
                } else {
                  if (param0 == null) {
                    break L1;
                  } else {
                    if (param0.field_o != param3.field_s) {
                      break L1;
                    } else {
                      L2: {
                        var4_int = param0.field_k.length;
                        var5 = param3.field_k[param2].length / var4_int;
                        var6 = 0;
                        if (param1 < -69) {
                          break L2;
                        } else {
                          ph.a(-98);
                          break L2;
                        }
                      }
                      L3: while (true) {
                        if (var6 >= var5) {
                          stackIn_22_0 = -1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L4: {
                            if (param3.field_i[param2][var6] == param0.field_s) {
                              if (!l.a(117, param3.field_m[param2][var6])) {
                                break L4;
                              } else {
                                var7 = 0;
                                L5: while (true) {
                                  if (var4_int <= var7) {
                                    stackIn_19_0 = var6;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  } else {
                                    if (param3.field_k[param2][var6 * var4_int - -var7] != param0.field_k[var7]) {
                                      break L4;
                                    } else {
                                      var7++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L4;
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

            stackIn_25_1 = new StringBuilder().append("ph.D(");

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


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ')');
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

    static {
        field_b = null;
    }
}
