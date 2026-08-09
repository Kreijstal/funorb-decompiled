/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    final static java.awt.Frame a(vh param0, int param1, int param2, int param3, int param4, int param5) {
        Object stackIn_3_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sf[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        vh var10 = null;
        sf[] var11 = null;
        rc var12 = null;
        var9 = Torquing.field_u;
        try {
          L0: {
            if (param0.a((byte) 13)) {
              L1: {
                if (param4 == 0) {
                  var11 = no.a(param0, -33);
                  var6 = var11;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var11.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (var11[var8].field_d != param2) {
                            break L3;
                          } else {
                            if (var11[var8].field_c != param1) {
                              break L3;
                            } else {
                              L4: {
                                if (param5 == 0) {
                                  break L4;
                                } else {
                                  if (var11[var8].field_e != param5) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var11[var8].field_b <= param4) {
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              param4 = var11[var8].field_b;
                              var7_int = 1;
                              break L3;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var12 = param0.a(true, param2, param1, param5, param4);
              L6: while (true) {
                if (var12.field_a != 0) {
                  L7: {
                    if (param3 == 0) {
                      break L7;
                    } else {
                      var10 = (vh) null;
                      jj.a((vh) null, 19, 84, -43, 52, 100);
                      break L7;
                    }
                  }
                  var7 = (java.awt.Frame) (var12.field_d);
                  if (var7 != null) {
                    if (-3 != (var12.field_a ^ -1)) {
                      stackIn_37_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      ka.a(-123, var7, param0);
                      stackIn_35_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_32_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  ub.a(1976, 10L);
                  continue L6;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6_ref = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var6_ref);

            stackIn_40_1 = new StringBuilder().append("jj.B(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L8;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L8;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_32_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_35_0);
            } else {
              return stackIn_37_0;
            }
          }
        }
    }

    final static sm a(sm param0, int[] param1, int param2) {
        sm var3 = null;
        RuntimeException var3_ref = null;
        sm stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new sm(param2, 0, 0);
            var3.field_d = param0.field_d;
            var3.field_a = param0.field_a;
            var3.field_l = param0.field_l;
            var3.field_j = param0.field_j;
            var3.field_g = param0.field_g;
            var3.field_k = param1;
            var3.field_c = param0.field_c;
            var3.field_e = param0.field_e;
            stackIn_1_0 = (sm) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("jj.A(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    static {
    }
}
