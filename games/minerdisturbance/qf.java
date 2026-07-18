/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends pi {
    static ea[][] field_o;
    static String field_r;
    static int field_p;
    static int field_n;
    byte[] field_s;
    static String field_q;

    final static void a(int param0, int param1, ln param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var20 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var6_int = (param0 - param1 << 8) / param2.field_j;
              var7 = (param1 << 8) + param2.field_b * var6_int;
              param5 = param5 + param2.field_b;
              param3 = param3 + param2.field_e;
              var8 = param3 * eh.field_g + param5;
              var9 = 0;
              var10 = param2.field_f;
              var11 = param2.field_a;
              var12 = eh.field_g - var11;
              if (param3 < eh.field_d) {
                var14 = eh.field_d + -param3;
                var9 = var9 + var14 * var11;
                param3 = eh.field_d;
                var10 = var10 - var14;
                var8 = var8 + eh.field_g * var14;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var13 = 0;
              if (param5 < eh.field_a) {
                var14 = eh.field_a + -param5;
                var12 = var12 + var14;
                var11 = var11 - var14;
                var13 = var13 + var14;
                var7 = var7 + var14 * var6_int;
                var9 = var9 + var14;
                param5 = eh.field_a;
                var8 = var8 + var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 + var10 > eh.field_e) {
                var10 = var10 - (-eh.field_e + (var10 + param3));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (eh.field_k < var11 + param5) {
                var14 = -eh.field_k + param5 + var11;
                var12 = var12 + var14;
                var11 = var11 - var14;
                var13 = var13 + var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var11 <= 0) {
                break L5;
              } else {
                if (var10 <= 0) {
                  break L5;
                } else {
                  param3 = -var10;
                  L6: while (true) {
                    if (0 <= param3) {
                      break L0;
                    } else {
                      var14 = var7;
                      param5 = -var11;
                      L7: while (true) {
                        if (0 <= param5) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param3++;
                          continue L6;
                        } else {
                          L8: {
                            var15 = var14 >> 8;
                            var14 = var14 + var6_int;
                            var16 = 256 - var15;
                            if (var15 >= 0) {
                              L9: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param2.field_n[255 & param2.field_m[incrementValue$1]];
                                if (0 != var17) {
                                  if (var15 > 255) {
                                    eh.field_f[var8] = var17;
                                    break L9;
                                  } else {
                                    var18 = eh.field_f[var8];
                                    var19 = 16711935 & var16 * (16711935 & var18) + var15 * (var17 & 16711935) >> 8;
                                    eh.field_f[var8] = (c.a(16711707, var16 * c.a(var18, 65280) - -(var15 * c.a(65280, var17))) >> 8) + var19;
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var8++;
                              param5++;
                              break L8;
                            } else {
                              var9++;
                              var8++;
                              param5++;
                              break L8;
                            }
                          }
                          param5++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var6;
            stackOut_35_1 = new StringBuilder().append("qf.A(").append(param0).append(',').append(param1).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L10;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param3 + ',' + 0 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -28581) {
            return;
        }
        field_o = null;
        field_r = null;
        field_q = null;
    }

    qf(byte[] param0) {
        try {
            ((qf) this).field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "qf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new ea[2][9];
        field_p = 0;
        field_n = 0;
        field_q = "Anon.";
    }
}
