/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    static int[] field_c;
    static String field_d;
    static int[][] field_b;
    static String field_a;

    final static String a(int param0, char param1) {
        return String.valueOf('[');
    }

    public static void a() {
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static vj a(int param0, float param1, vj param2, float param3) {
        RuntimeException var4 = null;
        lb var5 = null;
        gj var6 = null;
        gj stackIn_2_0 = null;
        lb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        lb stackOut_3_0 = null;
        gj stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2 instanceof lb) {
              var5 = (lb) (Object) param2;
              stackOut_3_0 = new lb(var5.a(false, param3), var5.a(false, param1), param2.field_k, param2.field_p, param2.field_q);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              var6 = (gj) (Object) param2;
              stackOut_1_0 = new gj(var6.field_t, var6.field_u, var6.field_r + (-var6.field_r + var6.field_w) * param3, var6.field_r + (var6.field_w - var6.field_r) * param1, param2.field_k, param2.field_p, param2.field_q);
              stackIn_2_0 = stackOut_1_0;
              return (vj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("fk.A(").append(1).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
        return (vj) (Object) stackIn_4_0;
    }

    final static void a(int[] param0, String[] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hj var10_ref_hj = null;
        int var11 = 0;
        hj var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_4_0 = 0;
        hj stackIn_9_0 = null;
        hj stackIn_12_0 = null;
        ql stackIn_36_0 = null;
        String stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        ql stackIn_37_0 = null;
        String stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        ql stackIn_38_0 = null;
        String stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        hj stackOut_8_0 = null;
        hj stackOut_7_0 = null;
        hj stackOut_11_0 = null;
        hj stackOut_10_0 = null;
        ql stackOut_35_0 = null;
        String stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        ql stackOut_37_0 = null;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        ql stackOut_36_0 = null;
        String stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var19 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var8 = param1.length;
              on.field_t.a(param6, param4);
              nj.field_i.a(381 + param6, param4);
              if (var8 != 1) {
                stackOut_3_0 = 2;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var9 = stackIn_4_0;
              if (param5 != -1) {
                L3: {
                  if (var9 > param5) {
                    stackOut_8_0 = de.field_O;
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = dc.field_ab;
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var10_ref_hj = stackIn_9_0;
                  var11 = var10_ref_hj.field_s;
                  if (param5 + 1 < var9) {
                    stackOut_11_0 = de.field_O;
                    stackIn_12_0 = stackOut_11_0;
                    break L4;
                  } else {
                    stackOut_10_0 = dc.field_ab;
                    stackIn_12_0 = stackOut_10_0;
                    break L4;
                  }
                }
                var12 = stackIn_12_0;
                var13 = var12.field_s;
                var14 = param6;
                var7_int = 0;
                L5: while (true) {
                  if (param5 < var7_int) {
                    var15 = var14 - -param0[1 + param5];
                    var16 = 0;
                    L6: while (true) {
                      if (on.field_t.field_y <= var16) {
                        break L2;
                      } else {
                        var17 = var10_ref_hj.field_s;
                        L7: while (true) {
                          L8: {
                            if (var17 <= 0) {
                              break L8;
                            } else {
                              if (var10_ref_hj.field_z[-1 + (var11 * var16 + var17)] == 0) {
                                var17--;
                                continue L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var17 = var17 + var14;
                          var18 = 0;
                          L9: while (true) {
                            L10: {
                              if (var12.field_s <= var18) {
                                break L10;
                              } else {
                                if (var12.field_z[var16 * var13 + var18] != 0) {
                                  break L10;
                                } else {
                                  var18++;
                                  continue L9;
                                }
                              }
                            }
                            var18 = var18 + var15;
                            tc.c(var17, param4 + var16, var18 - var17, 16744576, 128);
                            var16++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var14 = var14 + param0[var7_int];
                    var7_int++;
                    continue L5;
                  }
                }
              } else {
                break L2;
              }
            }
            var10 = param6;
            var7_int = 0;
            L11: while (true) {
              if (var7_int >= param0.length) {
                var10 = param6 + 11 + param0[0];
                var7_int = 0;
                L12: while (true) {
                  if (var8 <= var7_int) {
                    var11 = -75 / ((param2 - -10) / 62);
                    break L0;
                  } else {
                    L13: {
                      stackOut_35_0 = nm.field_c;
                      stackOut_35_1 = param1[var7_int];
                      stackOut_35_2 = param0[1 + var7_int] / 2 + var10;
                      stackOut_35_3 = (nm.field_c.field_G + 30) / 2 + (param4 - 2);
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      stackIn_36_3 = stackOut_35_3;
                      if (var7_int != param3) {
                        stackOut_37_0 = (ql) (Object) stackIn_37_0;
                        stackOut_37_1 = (String) (Object) stackIn_37_1;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = stackIn_37_3;
                        stackOut_37_4 = 1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        stackIn_38_3 = stackOut_37_3;
                        stackIn_38_4 = stackOut_37_4;
                        break L13;
                      } else {
                        stackOut_36_0 = (ql) (Object) stackIn_36_0;
                        stackOut_36_1 = (String) (Object) stackIn_36_1;
                        stackOut_36_2 = stackIn_36_2;
                        stackOut_36_3 = stackIn_36_3;
                        stackOut_36_4 = 2;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_38_2 = stackOut_36_2;
                        stackIn_38_3 = stackOut_36_3;
                        stackIn_38_4 = stackOut_36_4;
                        break L13;
                      }
                    }
                    ((ql) (Object) stackIn_38_0).b(stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_38_4, -1);
                    var10 = var10 + param0[1 + var7_int];
                    var7_int++;
                    continue L12;
                  }
                }
              } else {
                L14: {
                  var10 = var10 + param0[var7_int];
                  if (var9 <= var7_int) {
                    dc.field_ab.d(var10, param4, 153);
                    break L14;
                  } else {
                    de.field_O.d(var10, param4, 153);
                    break L14;
                  }
                }
                var7_int++;
                continue L11;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var7;
            stackOut_41_1 = new StringBuilder().append("fk.C(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L15;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L15;
            }
          }
          L16: {
            stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L16;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L16;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Connection lost. <%0>";
        field_c = fc.a(-39, 5, 4);
        field_b = new int[14][];
        field_a = "<img=3>";
        field_b[5] = new int[1];
        field_b[6] = new int[1];
        field_b[8] = new int[1];
        field_b[13] = new int[2];
        field_b[7] = new int[1];
        field_b[9] = new int[1];
        field_b[10] = new int[1];
        field_b[2] = new int[1];
        field_b[12] = new int[0];
        field_b[1] = new int[5];
        field_b[0] = new int[8];
        field_b[3] = new int[1];
        field_b[11] = new int[0];
        field_b[4] = new int[2];
    }
}
