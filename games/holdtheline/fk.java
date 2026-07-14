/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    static int[] field_c;
    static String field_d;
    static int[][] field_b;
    static String field_a;

    final static String a(int param0, char param1) {
        if (param0 != 25) {
            return null;
        }
        return String.valueOf(param1);
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 < 98) {
            field_c = null;
        }
        field_b = null;
    }

    final static vj a(int param0, float param1, vj param2, float param3) {
        gj var6 = null;
        if (param0 != 1) {
            field_a = null;
        }
        if (!(param2 instanceof lb)) {
            var6 = (gj) (Object) param2;
            return (vj) (Object) new gj(var6.field_t, var6.field_u, var6.field_r + (-var6.field_r + var6.field_w) * param3, var6.field_r + (var6.field_w - var6.field_r) * param1, param2.field_k, param2.field_p, param2.field_q);
        }
        lb var5 = (lb) (Object) param2;
        return (vj) (Object) new lb(var5.a(false, param3), var5.a(false, param1), param2.field_k, param2.field_p, param2.field_q);
    }

    final static void a(int[] param0, String[] param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hj var10_ref = null;
        int var11 = 0;
        hj var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_3_0 = 0;
        hj stackIn_8_0 = null;
        hj stackIn_11_0 = null;
        ql stackIn_35_0 = null;
        String stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        ql stackIn_36_0 = null;
        String stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        ql stackIn_37_0 = null;
        String stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        hj stackOut_7_0 = null;
        hj stackOut_6_0 = null;
        hj stackOut_10_0 = null;
        hj stackOut_9_0 = null;
        ql stackOut_34_0 = null;
        String stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        ql stackOut_36_0 = null;
        String stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        ql stackOut_35_0 = null;
        String stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        L0: {
          var19 = HoldTheLine.field_D;
          var8 = param1.length;
          on.field_t.a(param6, param4);
          nj.field_i.a(381 + param6, param4);
          if (var8 != 1) {
            stackOut_2_0 = 2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var9 = stackIn_3_0;
          if ((param5 ^ -1) != 0) {
            L2: {
              if (var9 > param5) {
                stackOut_7_0 = de.field_O;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = dc.field_ab;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            L3: {
              var10_ref = stackIn_8_0;
              var11 = var10_ref.field_s;
              if (param5 + 1 < var9) {
                stackOut_10_0 = de.field_O;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = dc.field_ab;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            var12 = stackIn_11_0;
            var13 = var12.field_s;
            var14 = param6;
            var7 = 0;
            L4: while (true) {
              if (param5 < var7) {
                var15 = var14 - -param0[1 + param5];
                var16 = 0;
                L5: while (true) {
                  if (on.field_t.field_y <= var16) {
                    break L1;
                  } else {
                    var17 = var10_ref.field_s;
                    L6: while (true) {
                      L7: {
                        if (var17 <= 0) {
                          break L7;
                        } else {
                          if (var10_ref.field_z[-1 + (var11 * var16 + var17)] == 0) {
                            var17--;
                            continue L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var17 = var17 + var14;
                      var18 = 0;
                      L8: while (true) {
                        L9: {
                          if (var12.field_s <= var18) {
                            break L9;
                          } else {
                            if (var12.field_z[var16 * var13 + var18] != 0) {
                              break L9;
                            } else {
                              var18++;
                              continue L8;
                            }
                          }
                        }
                        var18 = var18 + var15;
                        tc.c(var17, param4 + var16, var18 - var17, 16744576, 128);
                        var16++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var14 = var14 + param0[var7];
                var7++;
                continue L4;
              }
            }
          } else {
            break L1;
          }
        }
        var10 = param6;
        var7 = 0;
        L10: while (true) {
          if (var7 >= param0.length) {
            var10 = param6 + 11 + param0[0];
            var7 = 0;
            L11: while (true) {
              if (var8 <= var7) {
                var11 = -75 / ((param2 - -10) / 62);
                return;
              } else {
                L12: {
                  stackOut_34_0 = nm.field_c;
                  stackOut_34_1 = param1[var7];
                  stackOut_34_2 = param0[1 + var7] / 2 + var10;
                  stackOut_34_3 = (nm.field_c.field_G + 30) / 2 + (param4 - 2);
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  stackIn_36_3 = stackOut_34_3;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  stackIn_35_2 = stackOut_34_2;
                  stackIn_35_3 = stackOut_34_3;
                  if (var7 != param3) {
                    stackOut_36_0 = (ql) (Object) stackIn_36_0;
                    stackOut_36_1 = (String) (Object) stackIn_36_1;
                    stackOut_36_2 = stackIn_36_2;
                    stackOut_36_3 = stackIn_36_3;
                    stackOut_36_4 = 1;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    stackIn_37_2 = stackOut_36_2;
                    stackIn_37_3 = stackOut_36_3;
                    stackIn_37_4 = stackOut_36_4;
                    break L12;
                  } else {
                    stackOut_35_0 = (ql) (Object) stackIn_35_0;
                    stackOut_35_1 = (String) (Object) stackIn_35_1;
                    stackOut_35_2 = stackIn_35_2;
                    stackOut_35_3 = stackIn_35_3;
                    stackOut_35_4 = 2;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_37_2 = stackOut_35_2;
                    stackIn_37_3 = stackOut_35_3;
                    stackIn_37_4 = stackOut_35_4;
                    break L12;
                  }
                }
                ((ql) (Object) stackIn_37_0).b(stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_37_4, -1);
                var10 = var10 + param0[1 + var7];
                var7++;
                continue L11;
              }
            }
          } else {
            var10 = var10 + param0[var7];
            if (var9 <= var7) {
              dc.field_ab.d(var10, param4, 153);
              var7++;
              continue L10;
            } else {
              de.field_O.d(var10, param4, 153);
              var7++;
              continue L10;
            }
          }
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
