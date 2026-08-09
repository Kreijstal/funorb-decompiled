/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends od {
    static int field_j;
    static pf field_k;

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    cl(long param0, String param1) {
        super(param0, param1);
    }

    final s b(byte param0) {
        if (param0 != 1) {
            int[] var3 = (int[]) null;
            cl.a(-8, (hl) null, false, true, (int[]) null, -126);
        }
        return ef.field_e;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        wj.b(param0);
        ki.c(param2, param3, param4, param1);
    }

    final static hl a(int param0, hl param1, boolean param2, boolean param3, int[] param4, int param5) {
        hl stackIn_3_0 = null;
        hl stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int[] var7 = null;
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
        hl var21 = null;
        int[] var23 = null;
        int[] var25 = null;
        int[] var27 = null;
        var19 = StarCannon.field_A;
        try {
          L0: {
            if (!param3) {
              var21 = new hl(param0 + (param0 + param1.field_u), param0 + param1.field_v - -param0);
              var21.field_x = param0 + (param1.field_x - -param0);
              var21.field_q = param0 + (param0 + param1.field_q);
              var21.field_y = -param0 + param1.field_y;
              var21.field_w = param1.field_w - param0;
              var25 = var21.field_B;
              var23 = var25;
              var7 = var23;
              var27 = param1.field_B;
              var9 = param0 * param0;
              var10 = (param0 << -1565736703) + (var9 + 1) << 1071048673;
              var11 = -param0;
              L1: while (true) {
                if (param0 < var11) {
                  var20 = 0;
                  var11 = var20;
                  L2: while (true) {
                    if (var20 >= var25.length) {
                      stackIn_34_0 = (hl) (var21);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        var12 = var25[var20];
                        if (-2147483648 != (var12 ^ -1)) {
                          if (var12 == 0) {
                            break L3;
                          } else {
                            var7[var20] = param4[var12];
                            break L3;
                          }
                        } else {
                          var25[var20] = 0;
                          break L3;
                        }
                      }
                      var20++;
                      continue L2;
                    }
                  }
                } else {
                  var10 = var10 + (var11 * 2 - 1);
                  var12 = var10;
                  var13 = -param0;
                  L4: while (true) {
                    if (param0 < var13) {
                      var11++;
                      continue L1;
                    } else {
                      L5: {
                        var12 = var12 + (var13 * 2 + -1);
                        if ((var12 ^ -1) >= (var9 ^ -1)) {
                          L6: {
                            var14 = (var9 + -var12) * param5 / var9;
                            if (!param2) {
                              break L6;
                            } else {
                              if (0 != var13) {
                                break L6;
                              } else {
                                if (-1 == (var11 ^ -1)) {
                                  var14 = 2147483647;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var15 = 0;
                          var16 = (var11 - -param0) * var21.field_u + (param0 + var13);
                          var17 = 0;
                          L7: while (true) {
                            if (var17 >= param1.field_v) {
                              break L5;
                            } else {
                              var18 = 0;
                              L8: while (true) {
                                if (var18 >= param1.field_u) {
                                  var16 = var16 + (param0 << -1681923039);
                                  var17++;
                                  continue L7;
                                } else {
                                  L9: {
                                    if (0 == var27[var15]) {
                                      break L9;
                                    } else {
                                      if (var14 <= var25[var16]) {
                                        break L9;
                                      } else {
                                        var25[var16] = var14;
                                        break L9;
                                      }
                                    }
                                  }
                                  var15++;
                                  var16++;
                                  var18++;
                                  continue L8;
                                }
                              }
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                      var13++;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (hl) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var6);

            stackIn_37_1 = new StringBuilder().append("cl.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L10;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L11;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_38_0), stackIn_41_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_34_0;
        }
    }

    public static void d(byte param0) {
        if (param0 < 81) {
            field_k = (pf) null;
        }
        field_k = null;
    }

    static {
        field_k = new pf();
    }
}
