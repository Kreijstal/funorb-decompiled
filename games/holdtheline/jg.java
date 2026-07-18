/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends hl {
    int field_i;
    static String field_q;
    int[][] field_p;
    boolean field_j;
    long[][] field_k;
    static go[] field_o;
    int field_n;
    String[][] field_m;
    int field_l;

    public static void a(int param0) {
        field_o = null;
        field_q = null;
        if (param0 > -66) {
            field_q = null;
        }
    }

    final static void a(int param0, int param1, hj param2, boolean param3, int param4, int param5) {
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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var20 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var6_int = (param5 - param1 << 8) / param2.field_o;
              var7 = (param1 << 8) + var6_int * param2.field_u;
              param0 = param0 + param2.field_x;
              param4 = param4 + param2.field_u;
              var8 = param4 - -(param0 * tc.field_j);
              var9 = 0;
              var10 = param2.field_y;
              var11 = param2.field_s;
              var12 = -var11 + tc.field_j;
              if (param0 >= tc.field_a) {
                break L1;
              } else {
                var14 = -param0 + tc.field_a;
                var9 = var9 + var14 * var11;
                var8 = var8 + tc.field_j * var14;
                var10 = var10 - var14;
                param0 = tc.field_a;
                break L1;
              }
            }
            L2: {
              var13 = 0;
              if (param4 < tc.field_d) {
                var14 = -param4 + tc.field_d;
                var11 = var11 - var14;
                var12 = var12 + var14;
                var8 = var8 + var14;
                var7 = var7 + var14 * var6_int;
                var13 = var13 + var14;
                var9 = var9 + var14;
                param4 = tc.field_d;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~tc.field_i <= ~(var10 + param0)) {
                break L3;
              } else {
                var10 = var10 - (var10 + (param0 + -tc.field_i));
                break L3;
              }
            }
            L4: {
              if (var11 + param4 > tc.field_e) {
                var14 = param4 + (var11 - tc.field_e);
                var13 = var13 + var14;
                var11 = var11 - var14;
                var12 = var12 + var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 >= var11) {
                break L5;
              } else {
                if (0 < var10) {
                  param0 = -var10;
                  L6: while (true) {
                    if (param0 >= 0) {
                      break L0;
                    } else {
                      var14 = var7;
                      param4 = -var11;
                      L7: while (true) {
                        if (param4 >= 0) {
                          var9 = var9 + var13;
                          var8 = var8 + var12;
                          param0++;
                          continue L6;
                        } else {
                          L8: {
                            var15 = var14 >> 8;
                            var16 = -var15 + 256;
                            var14 = var14 + var6_int;
                            if (var15 < 0) {
                              var9++;
                              var8++;
                              break L8;
                            } else {
                              L9: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param2.field_z[incrementValue$1];
                                if (var17 != 0) {
                                  if (var15 <= 255) {
                                    var18 = tc.field_b[var8];
                                    var19 = 16711935 & var16 * (16711935 & var18) - -((var17 & 16711935) * var15) >> 8;
                                    tc.field_b[var8] = var19 - -pk.a(65280, pk.a(var18, 65280) * var16 - -(pk.a(65280, var17) * var15) >> 8);
                                    break L9;
                                  } else {
                                    tc.field_b[var8] = var17;
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var8++;
                              break L8;
                            }
                          }
                          param4++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("jg.D(").append(param0).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + true + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(rd param0, ei param1, byte param2) {
        RuntimeException var3 = null;
        qm var3_ref = null;
        qm var4 = null;
        qm var5 = null;
        uh var6 = null;
        uh var7 = null;
        vj var8 = null;
        vj var9 = null;
        in var10 = null;
        in var11 = null;
        float var12 = 0.0f;
        int var13 = 0;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        Object var17 = null;
        vj var17_ref = null;
        Object var18 = null;
        vj var18_ref = null;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        lb var21_ref = null;
        gj var21_ref2 = null;
        float var22 = 0.0f;
        float var23 = 0.0f;
        int var23_int = 0;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        int var27 = 0;
        int var28 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var17 = null;
        var18 = null;
        var21 = null;
        var28 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var6 = o.a((byte) -115);
              var7 = o.a((byte) -113);
              var8 = (vj) param1.field_b[-1 + param1.field_e];
              var9 = (vj) param1.field_b[0];
              var5 = var8.a(0);
              var10 = wb.a(var8, var9, 3251);
              var11 = new in(var10);
              var10.a((float)param0.field_c, -1);
              var11.a((float)param0.field_h, -1);
              var3_ref = new qm(var5);
              var3_ref.a(var10, (byte) 98);
              var4 = new qm(var5);
              var4.a(var11, -13201);
              var6.a(var3_ref.field_h, (byte) 64);
              var6.a(var3_ref.field_f, (byte) 127);
              var7.a(var4.field_h, (byte) 71);
              var7.a(var4.field_f, (byte) 68);
              int discarded$1 = 115;
              var12 = fb.a(param1);
              var13 = (int)(var12 / param0.field_k) + 1;
              var14 = var12 / (float)(var13 * param0.field_i);
              var15 = var14;
              var17_ref = (vj) param1.field_b[param1.field_e - 1];
              var18_ref = (vj) param1.field_b[0];
              var19 = 0;
              if (param2 >= 14) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            var20 = 0;
            L2: while (true) {
              if (var20 >= param1.field_e) {
                break L0;
              } else {
                L3: {
                  var17_ref = var18_ref;
                  var18_ref = (vj) param1.field_b[(1 + var20) % param1.field_e];
                  if (var17_ref instanceof lb) {
                    var21_ref = (lb) (Object) var17_ref;
                    var10 = var21_ref.g(-1).a((byte) 77);
                    var11 = new in(var10);
                    var10.a((float)param0.field_c, -1);
                    var11.a((float)param0.field_h, -1);
                    var22 = var14 / var21_ref.f(50);
                    var16 = var15 / var21_ref.f(50);
                    var23 = var21_ref.f(50);
                    L4: while (true) {
                      if (var23 <= var15) {
                        var5 = var21_ref.field_s;
                        var10 = wb.a((vj) (Object) var21_ref, var18_ref, 3251);
                        var11 = new in(var10);
                        var10.a((float)param0.field_c, -1);
                        var11.a((float)param0.field_h, -1);
                        var3_ref = new qm(var5);
                        var3_ref.a(var10, (byte) 126);
                        var4 = new qm(var5);
                        var4.a(var11, -13201);
                        var6.a(var3_ref.field_h, (byte) 95);
                        var6.a(var3_ref.field_f, (byte) 92);
                        var7.a(var4.field_h, (byte) 71);
                        var15 = var15 - var23;
                        var7.a(var4.field_f, (byte) 106);
                        break L3;
                      } else {
                        L5: {
                          var5 = var21_ref.a(false, var16);
                          var3_ref = new qm(var5);
                          var3_ref.a(var10, (byte) 89);
                          var4 = new qm(var5);
                          var4.a(var11, -13201);
                          var6.a(var3_ref.field_h, (byte) 100);
                          var6.a(var3_ref.field_f, (byte) 63);
                          var7.a(var4.field_h, (byte) 106);
                          var7.a(var4.field_f, (byte) 89);
                          if (var17_ref.field_p) {
                            param0.a(var6.a(-77), var19, (byte) -65, var7.a(-60));
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var19++;
                        var6 = o.a((byte) -112);
                        var7 = o.a((byte) -125);
                        var6.a(var3_ref.field_h, (byte) 97);
                        var6.a(var3_ref.field_f, (byte) 82);
                        var7.a(var4.field_h, (byte) 71);
                        var23 = var23 - var15;
                        var16 = var16 + var22;
                        var7.a(var4.field_f, (byte) 109);
                        var15 = var14;
                        continue L4;
                      }
                    }
                  } else {
                    var21_ref2 = (gj) (Object) var17_ref;
                    var22 = var21_ref2.f(50);
                    var23_int = (int)(var22 / 5.0f) - -1;
                    var24 = var22 / (float)var23_int;
                    var25 = (var21_ref2.field_w - var21_ref2.field_r) / (float)var23_int;
                    var26 = var25 + var21_ref2.field_r;
                    var27 = 1;
                    L6: while (true) {
                      if (var23_int < var27) {
                        var5 = var21_ref2.a(0);
                        var10 = wb.a((vj) (Object) var21_ref2, var18_ref, 3251);
                        var11 = new in(var10);
                        var10.a((float)param0.field_c, -1);
                        var11.a((float)param0.field_h, -1);
                        var3_ref = new qm(var5);
                        var3_ref.a(var10, (byte) 117);
                        var4 = new qm(var5);
                        var4.a(var11, -13201);
                        var6.a(var3_ref.field_h, (byte) 103);
                        var6.a(var3_ref.field_f, (byte) 75);
                        var7.a(var4.field_h, (byte) 93);
                        var7.a(var4.field_f, (byte) 65);
                        break L3;
                      } else {
                        L7: {
                          if (var21_ref2.field_r > var21_ref2.field_w) {
                            var3_ref = new qm((int)((double)var21_ref2.field_t.field_h + (double)(param0.field_h + var21_ref2.field_u) * Math.cos((double)var26)), (int)((double)var21_ref2.field_t.field_f - (double)(param0.field_h + var21_ref2.field_u) * Math.sin((double)var26)));
                            var4 = new qm((int)((double)var21_ref2.field_t.field_h + (double)(-param0.field_c + var21_ref2.field_u) * Math.cos((double)var26)), (int)((double)var21_ref2.field_t.field_f - (double)(var21_ref2.field_u - param0.field_c) * Math.sin((double)var26)));
                            break L7;
                          } else {
                            var3_ref = new qm((int)((double)var21_ref2.field_t.field_h + (double)(-param0.field_h + var21_ref2.field_u) * Math.cos((double)var26)), (int)((double)var21_ref2.field_t.field_f - (double)(-param0.field_h + var21_ref2.field_u) * Math.sin((double)var26)));
                            var4 = new qm((int)((double)var21_ref2.field_t.field_h + (double)(var21_ref2.field_u + param0.field_c) * Math.cos((double)var26)), (int)((double)var21_ref2.field_t.field_f - (double)(var21_ref2.field_u + param0.field_c) * Math.sin((double)var26)));
                            break L7;
                          }
                        }
                        L8: {
                          var26 = var26 + var25;
                          var6.a(var3_ref.field_h, (byte) 74);
                          var6.a(var3_ref.field_f, (byte) 94);
                          var7.a(var4.field_h, (byte) 106);
                          var15 = var15 - var24;
                          var7.a(var4.field_f, (byte) 104);
                          if (var15 > 0.0f) {
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var27++;
                        continue L6;
                      }
                    }
                  }
                }
                L9: {
                  if (var17_ref.field_p) {
                    param0.a(var6.a(-88), var19, (byte) -127, var7.a(-57));
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var6 = o.a((byte) 68);
                var7 = o.a((byte) -109);
                var6.a(var3_ref.field_h, (byte) 68);
                var6.a(var3_ref.field_f, (byte) 75);
                var7.a(var4.field_h, (byte) 82);
                var7.a(var4.field_f, (byte) 115);
                var20++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("jg.B(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!((7 & param1) == 0)) {
            var2 = -(param1 & 7) + 8;
        }
        int var3 = param1 + var2;
        return var3;
    }

    jg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "EXCLUSIVE";
    }
}
