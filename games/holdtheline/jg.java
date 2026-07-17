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
        field_q = null;
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
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
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
              if (~tc.field_i <= ~(var10 + param0)) {
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
                    L8: {
                      L9: {
                        if (param0 >= 0) {
                          break L9;
                        } else {
                          var14 = var7;
                          if (var20 != 0) {
                            break L8;
                          } else {
                            param4 = -var11;
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (param4 >= 0) {
                                    break L12;
                                  } else {
                                    var15 = var14 >> 8;
                                    var16 = -var15 + 256;
                                    var14 = var14 + var6_int;
                                    stackOut_22_0 = -1;
                                    stackOut_22_1 = ~var15;
                                    stackIn_35_0 = stackOut_22_0;
                                    stackIn_35_1 = stackOut_22_1;
                                    stackIn_23_0 = stackOut_22_0;
                                    stackIn_23_1 = stackOut_22_1;
                                    if (var20 != 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        L14: {
                                          if (stackIn_23_0 < stackIn_23_1) {
                                            var9++;
                                            var8++;
                                            if (var20 == 0) {
                                              break L13;
                                            } else {
                                              break L14;
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        L15: {
                                          int incrementValue$1 = var9;
                                          var9++;
                                          var17 = param2.field_z[incrementValue$1];
                                          if (var17 != 0) {
                                            L16: {
                                              if (var15 <= 255) {
                                                break L16;
                                              } else {
                                                tc.field_b[var8] = var17;
                                                if (var20 == 0) {
                                                  break L15;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            var18 = tc.field_b[var8];
                                            var19 = 16711935 & var16 * (16711935 & var18) - -((var17 & 16711935) * var15) >> 8;
                                            tc.field_b[var8] = var19 - -pk.a(65280, pk.a(var18, 65280) * var16 - -(pk.a(65280, var17) * var15) >> 8);
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        var8++;
                                        break L13;
                                      }
                                      param4++;
                                      if (var20 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                var9 = var9 + var13;
                                stackOut_34_0 = var8;
                                stackOut_34_1 = var12;
                                stackIn_35_0 = stackOut_34_0;
                                stackIn_35_1 = stackOut_34_1;
                                break L11;
                              }
                              var8 = stackIn_35_0 + stackIn_35_1;
                              param0++;
                              if (var20 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      break L8;
                    }
                    break L0;
                  }
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var6 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var6;
            stackOut_37_1 = new StringBuilder().append("jg.D(").append(param0).append(44).append(param1).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L17;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L17;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
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
        int stackIn_10_0 = 0;
        boolean stackIn_22_0 = false;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_21_0 = false;
        boolean stackOut_27_0 = false;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
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
              var12 = fb.a(param1, (byte) 115);
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
              L3: {
                if (var20 >= param1.field_e) {
                  break L3;
                } else {
                  var17_ref = var18_ref;
                  var18_ref = (vj) param1.field_b[(1 + var20) % param1.field_e];
                  if (var28 != 0) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        L6: {
                          if (var17_ref instanceof lb) {
                            break L6;
                          } else {
                            var21_ref2 = (gj) (Object) var17_ref;
                            var22 = var21_ref2.f(50);
                            var23_int = (int)(var22 / 5.0f) - -1;
                            var24 = var22 / (float)var23_int;
                            var25 = (var21_ref2.field_w - var21_ref2.field_r) / (float)var23_int;
                            var26 = var25 + var21_ref2.field_r;
                            var27 = 1;
                            L7: while (true) {
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
                                if (var28 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              } else {
                                stackOut_9_0 = (var21_ref2.field_r < var21_ref2.field_w ? -1 : (var21_ref2.field_r == var21_ref2.field_w ? 0 : 1));
                                stackIn_28_0 = stackOut_9_0;
                                stackIn_10_0 = stackOut_9_0;
                                if (var28 != 0) {
                                  break L4;
                                } else {
                                  L8: {
                                    L9: {
                                      if (stackIn_10_0 > 0) {
                                        break L9;
                                      } else {
                                        var3_ref = new qm((int)((double)var21_ref2.field_t.field_h + (double)(-param0.field_h + var21_ref2.field_u) * Math.cos((double)var26)), (int)((double)var21_ref2.field_t.field_f - (double)(-param0.field_h + var21_ref2.field_u) * Math.sin((double)var26)));
                                        var4 = new qm((int)((double)var21_ref2.field_t.field_h + (double)(var21_ref2.field_u + param0.field_c) * Math.cos((double)var26)), (int)((double)var21_ref2.field_t.field_f - (double)(var21_ref2.field_u + param0.field_c) * Math.sin((double)var26)));
                                        if (var28 == 0) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var3_ref = new qm((int)((double)var21_ref2.field_t.field_h + (double)(param0.field_h + var21_ref2.field_u) * Math.cos((double)var26)), (int)((double)var21_ref2.field_t.field_f - (double)(param0.field_h + var21_ref2.field_u) * Math.sin((double)var26)));
                                    var4 = new qm((int)((double)var21_ref2.field_t.field_h + (double)(-param0.field_c + var21_ref2.field_u) * Math.cos((double)var26)), (int)((double)var21_ref2.field_t.field_f - (double)(var21_ref2.field_u - param0.field_c) * Math.sin((double)var26)));
                                    break L8;
                                  }
                                  L10: {
                                    var26 = var26 + var25;
                                    var6.a(var3_ref.field_h, (byte) 74);
                                    var6.a(var3_ref.field_f, (byte) 94);
                                    var7.a(var4.field_h, (byte) 106);
                                    var15 = var15 - var24;
                                    var7.a(var4.field_f, (byte) 104);
                                    if (var15 > 0.0f) {
                                      break L10;
                                    } else {
                                      L11: {
                                        if (!var21_ref2.field_p) {
                                          break L11;
                                        } else {
                                          param0.a(var6.a(-97), var19, (byte) -79, var7.a(-90));
                                          break L11;
                                        }
                                      }
                                      var6 = o.a((byte) 78);
                                      var15 = var15 + var14;
                                      var19++;
                                      var7 = o.a((byte) 55);
                                      var6.a(var3_ref.field_h, (byte) 71);
                                      var6.a(var3_ref.field_f, (byte) 69);
                                      var7.a(var4.field_h, (byte) 101);
                                      var7.a(var4.field_f, (byte) 72);
                                      break L10;
                                    }
                                  }
                                  var27++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        }
                        var21_ref = (lb) (Object) var17_ref;
                        var10 = var21_ref.g(-1).a((byte) 77);
                        var11 = new in(var10);
                        var10.a((float)param0.field_c, -1);
                        var11.a((float)param0.field_h, -1);
                        var22 = var14 / var21_ref.f(50);
                        var16 = var15 / var21_ref.f(50);
                        var23 = var21_ref.f(50);
                        L12: while (true) {
                          L13: {
                            if (var23 <= var15) {
                              break L13;
                            } else {
                              var5 = var21_ref.a(false, var16);
                              var3_ref = new qm(var5);
                              var3_ref.a(var10, (byte) 89);
                              var4 = new qm(var5);
                              var4.a(var11, -13201);
                              var6.a(var3_ref.field_h, (byte) 100);
                              var6.a(var3_ref.field_f, (byte) 63);
                              var7.a(var4.field_h, (byte) 106);
                              var7.a(var4.field_f, (byte) 89);
                              stackOut_21_0 = var17_ref.field_p;
                              stackIn_28_0 = stackOut_21_0 ? 1 : 0;
                              stackIn_22_0 = stackOut_21_0;
                              if (var28 != 0) {
                                break L4;
                              } else {
                                L14: {
                                  if (stackIn_22_0) {
                                    param0.a(var6.a(-77), var19, (byte) -65, var7.a(-60));
                                    break L14;
                                  } else {
                                    break L14;
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
                                if (var28 == 0) {
                                  continue L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
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
                          break L5;
                        }
                      }
                      stackOut_27_0 = var17_ref.field_p;
                      stackIn_28_0 = stackOut_27_0 ? 1 : 0;
                      break L4;
                    }
                    L15: {
                      if (stackIn_28_0 != 0) {
                        param0.a(var6.a(-88), var19, (byte) -127, var7.a(-57));
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var6 = o.a((byte) 68);
                    var7 = o.a((byte) -109);
                    var6.a(var3_ref.field_h, (byte) 68);
                    var6.a(var3_ref.field_f, (byte) 75);
                    var7.a(var4.field_h, (byte) 82);
                    var7.a(var4.field_f, (byte) 115);
                    var20++;
                    if (var28 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("jg.B(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L16;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L16;
            }
          }
          L17: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L17;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L17;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param2 + 41);
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(~(7 & param1) == param0)) {
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
