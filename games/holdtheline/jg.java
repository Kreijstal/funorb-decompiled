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
            field_q = (String) null;
        }
    }

    final static void a(int param0, int param1, hj param2, boolean param3, int param4, int param5) {
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
        var20 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var6_int = (param5 - param1 << 736941000) / param2.field_o;
              var7 = (param1 << 1987805000) + var6_int * param2.field_u;
              param0 = param0 + param2.field_x;
              param4 = param4 + param2.field_u;
              var8 = param4 - -(param0 * tc.field_j);
              var9 = 0;
              if (param3) {
                break L1;
              } else {
                jg.a(13);
                break L1;
              }
            }
            L2: {
              var10 = param2.field_y;
              var11 = param2.field_s;
              var12 = -var11 + tc.field_j;
              if (param0 >= tc.field_a) {
                break L2;
              } else {
                var14 = -param0 + tc.field_a;
                var9 = var9 + var14 * var11;
                var8 = var8 + tc.field_j * var14;
                var10 = var10 - var14;
                param0 = tc.field_a;
                break L2;
              }
            }
            L3: {
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
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (tc.field_i >= var10 + param0) {
                break L4;
              } else {
                var10 = var10 - (var10 + (param0 + -tc.field_i));
                break L4;
              }
            }
            L5: {
              if (var11 + param4 > tc.field_e) {
                var14 = param4 + (var11 - tc.field_e);
                var13 = var13 + var14;
                var11 = var11 - var14;
                var12 = var12 + var14;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (0 >= var11) {
                break L6;
              } else {
                if (0 < var10) {
                  param0 = -var10;
                  L7: while (true) {
                    if (-1 >= (param0 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = var7;
                      param4 = -var11;
                      L8: while (true) {
                        if (param4 >= 0) {
                          var9 = var9 + var13;
                          var8 = var8 + var12;
                          param0++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> 1719775784;
                            var16 = -var15 + 256;
                            var14 = var14 + var6_int;
                            if (-1 < (var15 ^ -1)) {
                              var9++;
                              var8++;
                              break L9;
                            } else {
                              L10: {
                                incrementValue$1 = var9;
                                var9++;
                                var17 = param2.field_z[incrementValue$1];
                                if (var17 != 0) {
                                  if (-256 <= (var15 ^ -1)) {
                                    var18 = tc.field_b[var8];
                                    var19 = 16711935 & var16 * (16711935 & var18) - -((var17 & 16711935) * var15) >> 1658284680;
                                    tc.field_b[var8] = var19 - -pk.a(65280, pk.a(var18, 65280) * var16 - -(pk.a(65280, var17) * var15) >> 1066756584);
                                    break L10;
                                  } else {
                                    tc.field_b[var8] = var17;
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var8++;
                              break L9;
                            }
                          }
                          param4++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var6);
            stackOut_33_1 = new StringBuilder().append("jg.D(").append(param0).append(',').append(param1).append(',');
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
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(rd param0, ei param1, byte param2) {
        RuntimeException var3 = null;
        qm var3_ref = null;
        qm var4 = null;
        uh var6 = null;
        uh var7 = null;
        vj var8 = null;
        vj var9 = null;
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
        float var22 = 0.0f;
        float var23 = 0.0f;
        int var23_int = 0;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        int var27 = 0;
        int var28 = 0;
        in var29 = null;
        in var30 = null;
        qm var31 = null;
        qm var32 = null;
        qm var33 = null;
        uh var34 = null;
        uh var35 = null;
        vj var36 = null;
        Object var37 = null;
        gj var37_ref = null;
        uh var38 = null;
        uh var39 = null;
        Object var40 = null;
        in var41 = null;
        in var42 = null;
        qm var43 = null;
        qm var44 = null;
        qm var45 = null;
        Object var46 = null;
        lb var46_ref = null;
        in var47 = null;
        in var48 = null;
        qm var49 = null;
        qm var50 = null;
        qm var51 = null;
        uh var52 = null;
        uh var53 = null;
        in var54 = null;
        in var55 = null;
        qm var56 = null;
        qm var57 = null;
        qm var58 = null;
        uh var59 = null;
        uh var60 = null;
        vj var61 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var17 = null;
        var18 = null;
        var40 = null;
        var37 = null;
        var46 = null;
        var28 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var34 = o.a((byte) -115);
              var6 = var34;
              var35 = o.a((byte) -113);
              var7 = var35;
              var8 = (vj) (param1.field_b[-1 + param1.field_e]);
              var9 = (vj) (param1.field_b[0]);
              var31 = var8.a(0);
              var29 = wb.a(var8, var9, 3251);
              var30 = new in(var29);
              var29.a((float)param0.field_c, -1);
              var30.a((float)param0.field_h, -1);
              var32 = new qm(var31);
              var32.a(var29, (byte) 98);
              var33 = new qm(var31);
              var33.a(var30, -13201);
              var34.a(var32.field_h, (byte) 64);
              var34.a(var32.field_f, (byte) 127);
              var35.a(var33.field_h, (byte) 71);
              var35.a(var33.field_f, (byte) 68);
              var12 = fb.a(param1, (byte) 115);
              var13 = (int)(var12 / param0.field_k) + 1;
              var14 = var12 / (float)(var13 * param0.field_i);
              var15 = var14;
              var17_ref = (vj) (param1.field_b[param1.field_e - 1]);
              var18_ref = (vj) (param1.field_b[0]);
              var19 = 0;
              if (param2 >= 14) {
                break L1;
              } else {
                field_o = (go[]) null;
                break L1;
              }
            }
            var20 = 0;
            L2: while (true) {
              if (var20 >= param1.field_e) {
                break L0;
              } else {
                L3: {
                  var36 = var18_ref;
                  var17_ref = var36;
                  var61 = (vj) (param1.field_b[(1 + var20) % param1.field_e]);
                  if (var17_ref instanceof lb) {
                    var46_ref = (lb) ((Object) var36);
                    var47 = var46_ref.g(-1).a((byte) 77);
                    var48 = new in(var47);
                    var47.a((float)param0.field_c, -1);
                    var48.a((float)param0.field_h, -1);
                    var22 = var14 / var46_ref.f(50);
                    var16 = var15 / var46_ref.f(50);
                    var23 = var46_ref.f(50);
                    L4: while (true) {
                      if (var23 <= var15) {
                        var56 = var46_ref.field_s;
                        var54 = wb.a(var46_ref, var61, 3251);
                        var55 = new in(var54);
                        var54.a((float)param0.field_c, -1);
                        var55.a((float)param0.field_h, -1);
                        var57 = new qm(var56);
                        var3_ref = var57;
                        var57.a(var54, (byte) 126);
                        var58 = new qm(var56);
                        var4 = var58;
                        var58.a(var55, -13201);
                        var6.a(var57.field_h, (byte) 95);
                        var6.a(var57.field_f, (byte) 92);
                        var7.a(var58.field_h, (byte) 71);
                        var15 = var15 - var23;
                        var7.a(var58.field_f, (byte) 106);
                        break L3;
                      } else {
                        L5: {
                          var49 = var46_ref.a(false, var16);
                          var50 = new qm(var49);
                          var50.a(var47, (byte) 89);
                          var51 = new qm(var49);
                          var51.a(var48, -13201);
                          var6.a(var50.field_h, (byte) 100);
                          var6.a(var50.field_f, (byte) 63);
                          var7.a(var51.field_h, (byte) 106);
                          var7.a(var51.field_f, (byte) 89);
                          if (var36.field_p) {
                            param0.a(var6.a(-77), var19, (byte) -65, var7.a(-60));
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var19++;
                        var52 = o.a((byte) -112);
                        var6 = var52;
                        var53 = o.a((byte) -125);
                        var7 = var53;
                        var52.a(var50.field_h, (byte) 97);
                        var52.a(var50.field_f, (byte) 82);
                        var53.a(var51.field_h, (byte) 71);
                        var23 = var23 - var15;
                        var16 = var16 + var22;
                        var53.a(var51.field_f, (byte) 109);
                        var15 = var14;
                        continue L4;
                      }
                    }
                  } else {
                    var37_ref = (gj) ((Object) var36);
                    var22 = var37_ref.f(50);
                    var23_int = (int)(var22 / 5.0f) - -1;
                    var24 = var22 / (float)var23_int;
                    var25 = (var37_ref.field_w - var37_ref.field_r) / (float)var23_int;
                    var26 = var25 + var37_ref.field_r;
                    var27 = 1;
                    L6: while (true) {
                      if (var23_int < var27) {
                        var43 = var37_ref.a(0);
                        var41 = wb.a(var37_ref, var61, 3251);
                        var42 = new in(var41);
                        var41.a((float)param0.field_c, -1);
                        var42.a((float)param0.field_h, -1);
                        var44 = new qm(var43);
                        var3_ref = var44;
                        var44.a(var41, (byte) 117);
                        var45 = new qm(var43);
                        var4 = var45;
                        var45.a(var42, -13201);
                        var6.a(var44.field_h, (byte) 103);
                        var6.a(var44.field_f, (byte) 75);
                        var7.a(var45.field_h, (byte) 93);
                        var7.a(var45.field_f, (byte) 65);
                        break L3;
                      } else {
                        L7: {
                          if (var37_ref.field_r > var37_ref.field_w) {
                            var3_ref = new qm((int)((double)var37_ref.field_t.field_h + (double)(param0.field_h + var37_ref.field_u) * Math.cos((double)var26)), (int)((double)var37_ref.field_t.field_f - (double)(param0.field_h + var37_ref.field_u) * Math.sin((double)var26)));
                            var4 = new qm((int)((double)var37_ref.field_t.field_h + (double)(-param0.field_c + var37_ref.field_u) * Math.cos((double)var26)), (int)((double)var37_ref.field_t.field_f - (double)(var37_ref.field_u - param0.field_c) * Math.sin((double)var26)));
                            break L7;
                          } else {
                            var3_ref = new qm((int)((double)var37_ref.field_t.field_h + (double)(-param0.field_h + var37_ref.field_u) * Math.cos((double)var26)), (int)((double)var37_ref.field_t.field_f - (double)(-param0.field_h + var37_ref.field_u) * Math.sin((double)var26)));
                            var4 = new qm((int)((double)var37_ref.field_t.field_h + (double)(var37_ref.field_u + param0.field_c) * Math.cos((double)var26)), (int)((double)var37_ref.field_t.field_f - (double)(var37_ref.field_u + param0.field_c) * Math.sin((double)var26)));
                            break L7;
                          }
                        }
                        var26 = var26 + var25;
                        var6.a(var3_ref.field_h, (byte) 74);
                        var6.a(var3_ref.field_f, (byte) 94);
                        var7.a(var4.field_h, (byte) 106);
                        var15 = var15 - var24;
                        var7.a(var4.field_f, (byte) 104);
                        if (var15 <= 0.0f) {
                          L8: {
                            if (!var37_ref.field_p) {
                              break L8;
                            } else {
                              param0.a(var6.a(-97), var19, (byte) -79, var7.a(-90));
                              break L8;
                            }
                          }
                          var38 = o.a((byte) 78);
                          var6 = var38;
                          var15 = var15 + var14;
                          var19++;
                          var39 = o.a((byte) 55);
                          var7 = var39;
                          var38.a(var3_ref.field_h, (byte) 71);
                          var38.a(var3_ref.field_f, (byte) 69);
                          var39.a(var4.field_h, (byte) 101);
                          var39.a(var4.field_f, (byte) 72);
                          var27++;
                          continue L6;
                        } else {
                          var27++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
                L9: {
                  if (var36.field_p) {
                    param0.a(var6.a(-88), var19, (byte) -127, var7.a(-57));
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var59 = o.a((byte) 68);
                var60 = o.a((byte) -109);
                var59.a(var3_ref.field_h, (byte) 68);
                var59.a(var3_ref.field_f, (byte) 75);
                var60.a(var4.field_h, (byte) 82);
                var60.a(var4.field_f, (byte) 115);
                var20++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var3);
            stackOut_29_1 = new StringBuilder().append("jg.B(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!((7 & param1 ^ -1) == param0)) {
            var2 = -(param1 & 7) + 8;
        }
        int var3 = param1 + var2;
        return var3;
    }

    jg() {
    }

    static {
        field_q = "EXCLUSIVE";
    }
}
