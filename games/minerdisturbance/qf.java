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
        int incrementValue$1 = 0;
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
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var20 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var6_int = (param0 - param1 << 425791336) / param2.field_j;
              var7 = (param1 << -329478968) + param2.field_b * var6_int;
              param5 = param5 + param2.field_b;
              param3 = param3 + param2.field_e;
              var8 = param3 * eh.field_g + param5;
              var9 = param4;
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
              if (-1 <= (var11 ^ -1)) {
                break L5;
              } else {
                if (var10 <= 0) {
                  break L5;
                } else {
                  param3 = -var10;
                  L6: while (true) {
                    if (0 <= param3) {
                      decompiledRegionSelector0 = 1;
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
                            var15 = var14 >> 1430211496;
                            var14 = var14 + var6_int;
                            var16 = 256 - var15;
                            if (var15 >= 0) {
                              L9: {
                                incrementValue$1 = var9;
                                var9++;
                                var17 = param2.field_n[255 & param2.field_m[incrementValue$1]];
                                if (0 != var17) {
                                  if (var15 > 255) {
                                    eh.field_f[var8] = var17;
                                    break L9;
                                  } else {
                                    var18 = eh.field_f[var8];
                                    var19 = 16711935 & var16 * (16711935 & var18) + var15 * (var17 & 16711935) >> 2007946504;
                                    eh.field_f[var8] = (c.a(16711707, var16 * c.a(var18, 65280) - -(var15 * c.a(65280, var17))) >> -1470954968) + var19;
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var8++;
                              break L8;
                            } else {
                              var9++;
                              var8++;
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var6);
            stackOut_33_1 = new StringBuilder().append("qf.A(").append(param0).append(',').append(param1).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L10;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -28581) {
            return;
        }
        field_o = (ea[][]) null;
        field_r = null;
        field_q = null;
    }

    qf(byte[] param0) {
        try {
            this.field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = new ea[2][9];
        field_p = 0;
        field_n = 0;
        field_q = "Anon.";
    }
}
