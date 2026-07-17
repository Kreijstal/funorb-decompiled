/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static String[] field_b;
    int field_a;
    private fr field_c;
    static String field_d;
    static boolean field_e;

    protected final void finalize() throws Throwable {
        ((vk) this).field_c.a(((vk) this).field_a, (byte) 113);
        super.finalize();
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param4 > param5) {
              if (param3 > 1 + param5) {
                L1: {
                  if (param3 <= param5 - -5) {
                    break L1;
                  } else {
                    if (param0 == param1) {
                      break L1;
                    } else {
                      var7_int = (param0 & param1 & 1) + (param0 >> 1) - -(param1 >> 1);
                      var8 = param5;
                      var9 = param1;
                      var10 = param0;
                      var11 = param5;
                      L2: while (true) {
                        if (param3 <= var11) {
                          vk.a(var9, param1, param2, var8, param4, param5, param6);
                          vk.a(param0, var10, (byte) -107, param3, param4, var8, param6);
                          break L0;
                        } else {
                          L3: {
                            var12 = pd.field_q[var11];
                            if (!param6) {
                              stackOut_22_0 = uc.field_c[var12];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = lj.field_a[var12];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_23_0;
                            if (var13 <= var7_int) {
                              if (var13 > var10) {
                                var10 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              L5: {
                                pd.field_q[var11] = pd.field_q[var8];
                                if (var13 < var9) {
                                  var9 = var13;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              int incrementValue$1 = var8;
                              var8++;
                              pd.field_q[incrementValue$1] = var12;
                              break L4;
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param3;
                L6: while (true) {
                  if (var7_int <= param5) {
                    return;
                  } else {
                    var8 = param5;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = pd.field_q[var8];
                          var10 = pd.field_q[1 + var8];
                          if (jl.a(var10, var9, param6, (byte) 98)) {
                            pd.field_q[var8] = var10;
                            pd.field_q[var8 + 1] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var7, "vk.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static void a(int param0) {
        if (param0 > -31) {
            vk.a(-31);
        }
        qr.field_c = new jn();
    }

    public static void b() {
        field_b = null;
        field_d = null;
    }

    vk(fr param0, int param1, int param2) {
        try {
            ((vk) this).field_a = param2;
            ((vk) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "vk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Placing enemies...", "Placing terrain..."};
        field_d = null;
    }
}
