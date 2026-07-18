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
        try {
            field_o = null;
            field_q = null;
            if (param0 > -66) {
                field_q = null;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "jg.A(" + param0 + ')');
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
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
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
                                    var15 = var14 >> 1719775784;
                                    var16 = -var15 + 256;
                                    var14 = var14 + var6_int;
                                    stackOut_26_0 = -1;
                                    stackOut_26_1 = ~var15;
                                    stackIn_43_0 = stackOut_26_0;
                                    stackIn_43_1 = stackOut_26_1;
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    if (var20 != 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        L14: {
                                          if (stackIn_27_0 < stackIn_27_1) {
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
                                            var19 = 16711935 & var16 * (16711935 & var18) - -((var17 & 16711935) * var15) >> 1658284680;
                                            tc.field_b[var8] = var19 - -pk.a(65280, pk.a(var18, 65280) * var16 - -(pk.a(65280, var17) * var15) >> 1066756584);
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
                                stackOut_42_0 = var8;
                                stackOut_42_1 = var12;
                                stackIn_43_0 = stackOut_42_0;
                                stackIn_43_1 = stackOut_42_1;
                                break L11;
                              }
                              var8 = stackIn_43_0 + stackIn_43_1;
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
            stackOut_45_0 = (RuntimeException) var6;
            stackOut_45_1 = new StringBuilder().append("jg.D(").append(param0).append(',').append(param1).append(',');
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L17;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L17;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
        vj var17 = null;
        vj var18 = null;
        int var19 = 0;
        int var20 = 0;
        lb var21 = null;
        gj var21_ref = null;
        float var22 = 0.0f;
        float var23 = 0.0f;
        int var23_int = 0;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        int var27 = 0;
        int var28 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        boolean stackOut_29_0 = false;
        boolean stackOut_37_0 = false;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
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
              var17 = (vj) param1.field_b[param1.field_e - 1];
              var18 = (vj) param1.field_b[0];
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
                L4: {
                  if (~var20 <= ~param1.field_e) {
                    break L4;
                  } else {
                    var17 = var18;
                    var18 = (vj) param1.field_b[(1 + var20) % param1.field_e];
                    if (var28 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          L7: {
                            if (var17 instanceof lb) {
                              break L7;
                            } else {
                              var21_ref = (gj) (Object) var17;
                              var22 = var21_ref.f(50);
                              var23_int = (int)(var22 / 5.0f) - -1;
                              var24 = var22 / (float)var23_int;
                              var25 = (var21_ref.field_w - var21_ref.field_r) / (float)var23_int;
                              var26 = var25 + var21_ref.field_r;
                              var27 = 1;
                              L8: while (true) {
                                L9: {
                                  if (var23_int < var27) {
                                    break L9;
                                  } else {
                                    stackOut_12_0 = (var21_ref.field_r < var21_ref.field_w ? -1 : (var21_ref.field_r == var21_ref.field_w ? 0 : 1));
                                    stackIn_38_0 = stackOut_12_0;
                                    stackIn_13_0 = stackOut_12_0;
                                    if (var28 != 0) {
                                      break L5;
                                    } else {
                                      L10: {
                                        L11: {
                                          if (stackIn_13_0 > 0) {
                                            break L11;
                                          } else {
                                            var3_ref = new qm((int)((double)var21_ref.field_t.field_h + (double)(-param0.field_h + var21_ref.field_u) * Math.cos((double)var26)), (int)((double)var21_ref.field_t.field_f - (double)(-param0.field_h + var21_ref.field_u) * Math.sin((double)var26)));
                                            var4 = new qm((int)((double)var21_ref.field_t.field_h + (double)(var21_ref.field_u + param0.field_c) * Math.cos((double)var26)), (int)((double)var21_ref.field_t.field_f - (double)(var21_ref.field_u + param0.field_c) * Math.sin((double)var26)));
                                            if (var28 == 0) {
                                              break L10;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        var3_ref = new qm((int)((double)var21_ref.field_t.field_h + (double)(param0.field_h + var21_ref.field_u) * Math.cos((double)var26)), (int)((double)var21_ref.field_t.field_f - (double)(param0.field_h + var21_ref.field_u) * Math.sin((double)var26)));
                                        var4 = new qm((int)((double)var21_ref.field_t.field_h + (double)(-param0.field_c + var21_ref.field_u) * Math.cos((double)var26)), (int)((double)var21_ref.field_t.field_f - (double)(var21_ref.field_u - param0.field_c) * Math.sin((double)var26)));
                                        break L10;
                                      }
                                      L12: {
                                        var26 = var26 + var25;
                                        var6.a(var3_ref.field_h, (byte) 74);
                                        var6.a(var3_ref.field_f, (byte) 94);
                                        var7.a(var4.field_h, (byte) 106);
                                        var15 = var15 - var24;
                                        var7.a(var4.field_f, (byte) 104);
                                        if (var15 > 0.0f) {
                                          break L12;
                                        } else {
                                          L13: {
                                            if (!var21_ref.field_p) {
                                              break L13;
                                            } else {
                                              param0.a(var6.a(-97), var19, (byte) -79, var7.a(-90));
                                              break L13;
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
                                          break L12;
                                        }
                                      }
                                      var27++;
                                      if (var28 == 0) {
                                        continue L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                var5 = var21_ref.a(0);
                                var10 = wb.a((vj) (Object) var21_ref, var18, 3251);
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
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var21 = (lb) (Object) var17;
                          var10 = var21.g(-1).a((byte) 77);
                          var11 = new in(var10);
                          var10.a((float)param0.field_c, -1);
                          var11.a((float)param0.field_h, -1);
                          var22 = var14 / var21.f(50);
                          var16 = var15 / var21.f(50);
                          var23 = var21.f(50);
                          L14: while (true) {
                            L15: {
                              if (var23 <= var15) {
                                break L15;
                              } else {
                                var5 = var21.a(false, var16);
                                var3_ref = new qm(var5);
                                var3_ref.a(var10, (byte) 89);
                                var4 = new qm(var5);
                                var4.a(var11, -13201);
                                var6.a(var3_ref.field_h, (byte) 100);
                                var6.a(var3_ref.field_f, (byte) 63);
                                var7.a(var4.field_h, (byte) 106);
                                var7.a(var4.field_f, (byte) 89);
                                stackOut_29_0 = var17.field_p;
                                stackIn_38_0 = stackOut_29_0 ? 1 : 0;
                                stackIn_30_0 = stackOut_29_0;
                                if (var28 != 0) {
                                  break L5;
                                } else {
                                  L16: {
                                    if (stackIn_30_0) {
                                      param0.a(var6.a(-77), var19, (byte) -65, var7.a(-60));
                                      break L16;
                                    } else {
                                      break L16;
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
                                    continue L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            var5 = var21.field_s;
                            var10 = wb.a((vj) (Object) var21, var18, 3251);
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
                            break L6;
                          }
                        }
                        stackOut_37_0 = var17.field_p;
                        stackIn_38_0 = stackOut_37_0 ? 1 : 0;
                        break L5;
                      }
                      L17: {
                        if (stackIn_38_0 != 0) {
                          param0.a(var6.a(-88), var19, (byte) -127, var7.a(-57));
                          break L17;
                        } else {
                          break L17;
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
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var3;
            stackOut_43_1 = new StringBuilder().append("jg.B(");
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L18;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L18;
            }
          }
          L19: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L19;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L19;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (~(7 & param1) != param0) {
                var2_int = -(param1 & 7) + 8;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = param1 + var2_int;
            stackOut_4_0 = var3;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "jg.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_5_0;
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
