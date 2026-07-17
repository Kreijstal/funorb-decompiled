/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr extends oj {
    static int[] field_F;
    static dm field_E;
    static wk field_z;
    static int[][] field_y;
    int[] field_B;
    static cv field_C;
    static rk field_G;
    static bo field_D;
    int field_I;
    private boolean field_A;
    static boolean field_J;
    int field_H;

    final String a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        String stackIn_49_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        String stackOut_48_0 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  System.out.println("Move event debug");
                  System.out.println("Unit at " + ((kr) this).field_H + "," + ((kr) this).field_I);
                  var3_int = 0;
                  L3: while (true) {
                    if (var3_int >= ((kr) this).field_B.length) {
                      break L2;
                    } else {
                      var4 = ((kr) this).field_B[var3_int];
                      stackOut_6_0 = -2;
                      stackOut_6_1 = ~var4;
                      stackIn_38_0 = stackOut_6_0;
                      stackIn_38_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var6 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            L6: {
                              L7: {
                                L8: {
                                  if (stackIn_7_0 != stackIn_7_1) {
                                    break L8;
                                  } else {
                                    if (var6 == 0) {
                                      System.out.println("North");
                                      if (var6 == 0) {
                                        break L4;
                                      } else {
                                        break L7;
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                if (var4 == 2) {
                                  break L7;
                                } else {
                                  L9: {
                                    if (0 != var4) {
                                      break L9;
                                    } else {
                                      if (var6 == 0) {
                                        break L6;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  if (3 == var4) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              System.out.println("South");
                              if (var6 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                            System.out.println("East");
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          System.out.println("West");
                          break L4;
                        }
                        var3_int++;
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_37_0 = -3;
              stackOut_37_1 = (param0 - 53) / 51;
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              break L1;
            }
            L10: {
              var4 = stackIn_38_0 / stackIn_38_1;
              var3_ref = "EventMove: start: (" + ((kr) this).field_H + ", " + ((kr) this).field_I + ")" + "\n";
              if (null != ((kr) this).field_B) {
                var3_ref = var3_ref + "footsteps[" + ((kr) this).field_B.length + "]: (";
                var5 = 0;
                L11: while (true) {
                  L12: {
                    if (var5 >= ((kr) this).field_B.length) {
                      break L12;
                    } else {
                      var3_ref = var3_ref + ((kr) this).field_B[var5];
                      var5++;
                      if (var6 != 0) {
                        break L10;
                      } else {
                        if (var6 == 0) {
                          continue L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  var3_ref = var3_ref + ")";
                  break L10;
                }
              } else {
                break L10;
              }
            }
            stackOut_48_0 = (String) var3_ref;
            stackIn_49_0 = stackOut_48_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "kr.C(" + param0 + 44 + param1 + 41);
        }
        return stackIn_49_0;
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param1 < -84) {
              stackOut_3_0 = ((kr) this).a((byte) -39, param2, param0, true);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("kr.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(kl param0, boolean param1, kl param2, kl param3) {
        RuntimeException var4 = null;
        wk var4_ref = null;
        ru[] var5 = null;
        ru[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ru[] var10 = null;
        wk var10_ref = null;
        wk var11 = null;
        int var11_int = 0;
        wk var12 = null;
        int var13 = 0;
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              t.field_d = fk.a("frame_top", (byte) -124, param2, "commonui");
              ip.field_c = fk.a("frame_bottom", (byte) -125, param2, "commonui");
              gt.field_e = ic.a("jagex_logo_grey", (byte) 51, "commonui", param2);
              bb.field_b = fk.a("button", (byte) -124, param2, "commonui");
              db.field_a = ac.a(param2, "validation", (byte) -4, "commonui");
              gl.field_e = (ka) (Object) it.a("arezzo12", param2, param3, (byte) -87, "commonui");
              ArmiesOfGielinor.field_J = (ka) (Object) it.a("arezzo14", param2, param3, (byte) -87, "commonui");
              bv.field_t = (ka) (Object) it.a("arezzo14bold", param2, param3, (byte) -87, "commonui");
              var4_ref = new wk(param0.a("", 45, "button.gif"), (java.awt.Component) (Object) si.field_b);
              if (!param1) {
                break L1;
              } else {
                kr.g(90);
                break L1;
              }
            }
            ru discarded$1 = pv.a("commonui", "dropdown", param2, 24914);
            var5 = lo.a("screen_options", -28106, "commonui", param2);
            oa.field_H = new ru[4];
            dq.field_e = new ru[4];
            tg.field_b = new ru[4];
            var6 = new ru[][]{oa.field_H, dq.field_e, tg.field_b};
            var7 = new int[4][];
            var7[0] = var5[0].field_j;
            var8 = 1;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var8 <= ~var7.length) {
                    break L4;
                  } else {
                    var7[var8] = (int[]) var7[0].clone();
                    var8++;
                    if (var13 != 0) {
                      break L3;
                    } else {
                      if (var13 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var8 = var5[0].field_k[0];
                var7[2][var8] = 16777215;
                var7[1][var8] = 2394342;
                var7[3][var8] = 4767999;
                break L3;
              }
              var9 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var9 >= 3) {
                      break L7;
                    } else {
                      var10 = var6[var9];
                      stackOut_13_0 = 0;
                      stackIn_23_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var13 != 0) {
                        break L6;
                      } else {
                        var11_int = stackIn_14_0;
                        L8: while (true) {
                          L9: {
                            L10: {
                              if (~var10.length >= ~var11_int) {
                                break L10;
                              } else {
                                var10[var11_int] = vf.a(var7[var11_int], -13546, var5[var9]);
                                var11_int++;
                                if (var13 != 0) {
                                  break L9;
                                } else {
                                  if (var13 == 0) {
                                    continue L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            var9++;
                            break L9;
                          }
                          if (var13 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  var9 = var4_ref.field_v;
                  rq.a((byte) -56);
                  var4_ref.b();
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L6;
                }
                qn.c(stackIn_23_0, 0, qn.field_l, qn.field_g);
                var10_ref = new wk(var9, var9);
                var10_ref.b();
                var4_ref.f(0, 0);
                var11 = new wk(var9, var9);
                var11.b();
                var4_ref.f(-var4_ref.field_y + var9, 0);
                var12 = new wk(-(var9 * 2) + var4_ref.field_y, var9);
                var12.b();
                var4_ref.f(-var9, 0);
                rf.b(-18862);
                bb.field_b = new wk[]{var10_ref, var12, var11};
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("kr.D(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L11;
            }
          }
          L12: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44).append(param1).append(44);
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L12;
            }
          }
          L13: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(44);
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L13;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L13;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 41);
        }
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        ne var5 = null;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        ne var9 = null;
        int var10_int = 0;
        ne var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_143_0 = null;
        StringBuilder stackIn_143_1 = null;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        String stackIn_146_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_142_0 = null;
        StringBuilder stackOut_142_1 = null;
        RuntimeException stackOut_145_0 = null;
        StringBuilder stackOut_145_1 = null;
        String stackOut_145_2 = null;
        RuntimeException stackOut_143_0 = null;
        StringBuilder stackOut_143_1 = null;
        String stackOut_143_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((kr) this).field_A) {
              return;
            } else {
              L1: {
                ((kr) this).field_A = true;
                var3_int = ((kr) this).field_H;
                var4 = ((kr) this).field_I;
                if (param1 == -26661) {
                  break L1;
                } else {
                  field_J = false;
                  break L1;
                }
              }
              var5 = param0.field_Eb[((kr) this).field_H - -(((kr) this).field_I * param0.field_v)];
              var6 = var5.field_c;
              if (null != var6) {
                L2: {
                  L3: {
                    var7 = 0;
                    if (param0.field_Eb[((kr) this).field_H + param0.field_v * ((kr) this).field_I].field_h == 6) {
                      break L3;
                    } else {
                      if (param0.field_Eb[((kr) this).field_H + param0.field_v * ((kr) this).field_I].field_h == 4) {
                        break L3;
                      } else {
                        if (param0.field_Eb[((kr) this).field_I * param0.field_v + ((kr) this).field_H].field_h != 10) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = 1;
                  stackIn_19_0 = stackOut_16_0;
                  break L2;
                }
                var8 = stackIn_19_0;
                var9_int = 0;
                L4: while (true) {
                  L5: {
                    if (~((kr) this).field_B.length >= ~var9_int) {
                      break L5;
                    } else {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              var10_int = ((kr) this).field_B[var9_int];
                              if (var10_int == 1) {
                                var4--;
                                if (var12 == 0) {
                                  break L6;
                                } else {
                                  break L9;
                                }
                              } else {
                                L10: {
                                  if (var10_int != 2) {
                                    break L10;
                                  } else {
                                    if (var12 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (0 != var10_int) {
                                    break L11;
                                  } else {
                                    if (var12 == 0) {
                                      break L8;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                if (var10_int == 3) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var4++;
                            if (var12 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                          var3_int++;
                          if (var12 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                        var3_int--;
                        break L6;
                      }
                      L12: {
                        L13: {
                          L14: {
                            var10 = param0.field_Eb[var4 * param0.field_v + var3_int];
                            var11 = var10.field_h;
                            if (62 != var6.field_N) {
                              break L14;
                            } else {
                              if (var11 != 2) {
                                break L14;
                              } else {
                                if (((kr) this).field_B.length == 1) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          L15: {
                            if (29 != var6.field_N) {
                              break L15;
                            } else {
                              L16: {
                                if (var11 != 3) {
                                  break L16;
                                } else {
                                  param0.b((byte) 10, 0, var3_int, var4);
                                  var7 = 1;
                                  if (var12 == 0) {
                                    break L12;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              if (param0.field_K == null) {
                                break L12;
                              } else {
                                L17: {
                                  if (var11 == 7) {
                                    break L17;
                                  } else {
                                    if (var11 != 11) {
                                      break L12;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if (!var6.c(false)) {
                                  break L12;
                                } else {
                                  if (var10.a(var6.field_O, (byte) 91)) {
                                    break L12;
                                  } else {
                                    if (var10.field_a == -1) {
                                      break L12;
                                    } else {
                                      var7 = 1;
                                      param0.b((byte) 127, 1, var3_int, var4);
                                      if (var12 == 0) {
                                        break L12;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L18: {
                            if (var6.field_N != 40) {
                              break L18;
                            } else {
                              if (0 != var11) {
                                break L18;
                              } else {
                                var7 = 1;
                                param0.b((byte) 6, 3, var3_int, var4);
                                if (var12 == 0) {
                                  break L12;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          if (((kr) this).field_w.field_N != 73) {
                            break L12;
                          } else {
                            if (var8 == 0) {
                              break L12;
                            } else {
                              L19: {
                                if (var11 == 0) {
                                  param0.b((byte) -59, 4, var3_int, var4);
                                  var7 = 1;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              if (var11 != 1) {
                                break L12;
                              } else {
                                param0.b((byte) -100, 10, var3_int, var4);
                                var7 = 1;
                                if (var12 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                        param0.b((byte) 113, 0, var3_int, var4);
                        var7 = 1;
                        break L12;
                      }
                      var9_int++;
                      if (var12 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L20: {
                    L21: {
                      var9 = param0.field_Eb[param0.field_v * var4 + var3_int];
                      if (var6.field_N == 39) {
                        break L21;
                      } else {
                        L22: {
                          if (var6.field_J != var3_int) {
                            break L22;
                          } else {
                            if (var6.field_w == var4) {
                              break L20;
                            } else {
                              break L22;
                            }
                          }
                        }
                        L23: {
                          L24: {
                            if (var6.field_bb) {
                              break L24;
                            } else {
                              var5.field_c = null;
                              var5.field_m = var5.e(10);
                              if (var12 == 0) {
                                break L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                          var6.field_bb = false;
                          ((kr) this).field_w.field_bb = false;
                          param0.a(8288, ((kr) this).field_w);
                          break L23;
                        }
                        L25: {
                          ((kr) this).field_w.field_w = var4;
                          ((kr) this).field_w.field_J = var3_int;
                          ((kr) this).field_w.a((byte) 106);
                          var10 = var9;
                          if (!var6.p(-75)) {
                            break L25;
                          } else {
                            var7 = 3;
                            break L25;
                          }
                        }
                        L26: {
                          L27: {
                            L28: {
                              if (!var10.e((byte) -118)) {
                                break L28;
                              } else {
                                if (~var10.field_a == ~((kr) this).field_w.field_O) {
                                  break L27;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            var10.field_c = ((kr) this).field_w;
                            if (0 < var7) {
                              param0.a(var4, var3_int, 0, var7);
                              if (var12 == 0) {
                                break L26;
                              } else {
                                break L27;
                              }
                            } else {
                              break L26;
                            }
                          }
                          ((kr) this).field_w.field_G = true;
                          ((kr) this).field_w.field_S = true;
                          ((kr) this).field_w.d(-109);
                          boolean discarded$1 = param0.m(0, ((kr) this).field_w.field_O);
                          break L26;
                        }
                        L29: {
                          if (var7 > 0) {
                            param0.a(((kr) this).field_I, ((kr) this).field_H, param1 + 26661, var7);
                            nk.a((byte) 101);
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        if (var12 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var6.field_s = true;
                    var9.field_c = var6.b(false);
                    var9.field_c.field_J = var3_int;
                    var9.field_c.field_w = var4;
                    var9.field_c.a((byte) -35);
                    var9.field_c.field_s = true;
                    param0.a(param1 ^ -18501, var9.field_c);
                    break L20;
                  }
                  ((kr) this).field_w.field_s = true;
                  fl.a(param0, param1 ^ 26718);
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var3 = decompiledCaughtException;
            stackOut_142_0 = (RuntimeException) var3;
            stackOut_142_1 = new StringBuilder().append("kr.G(");
            stackIn_145_0 = stackOut_142_0;
            stackIn_145_1 = stackOut_142_1;
            stackIn_143_0 = stackOut_142_0;
            stackIn_143_1 = stackOut_142_1;
            if (param0 == null) {
              stackOut_145_0 = (RuntimeException) (Object) stackIn_145_0;
              stackOut_145_1 = (StringBuilder) (Object) stackIn_145_1;
              stackOut_145_2 = "null";
              stackIn_146_0 = stackOut_145_0;
              stackIn_146_1 = stackOut_145_1;
              stackIn_146_2 = stackOut_145_2;
              break L30;
            } else {
              stackOut_143_0 = (RuntimeException) (Object) stackIn_143_0;
              stackOut_143_1 = (StringBuilder) (Object) stackIn_143_1;
              stackOut_143_2 = "{...}";
              stackIn_146_0 = stackOut_143_0;
              stackIn_146_1 = stackOut_143_1;
              stackIn_146_2 = stackOut_143_2;
              break L30;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_146_0, stackIn_146_2 + 44 + param1 + 41);
        }
    }

    public static void g(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_F = null;
              field_z = null;
              field_E = null;
              field_G = null;
              if (param0 == 29333) {
                break L1;
              } else {
                kr.g(-45);
                break L1;
              }
            }
            field_C = null;
            field_D = null;
            field_y = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "kr.B(" + param0 + 41);
        }
    }

    kr(int param0, int param1, int[] param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((kr) this).field_A = false;
        try {
          L0: {
            ((kr) this).field_H = param0;
            ((kr) this).field_m = 0;
            ((kr) this).field_B = param2;
            ((kr) this).field_I = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("kr.<init>(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new int[29][];
        field_F = new int[]{1000, 1150, 850, 1300, 700};
        field_J = true;
        field_D = new bo();
        gb.a(24, 0, 180, 460, 160, 465, new int[12], -59);
        gb.a(30, 23, 180, 460, 160, 320, new int[5], -52);
        bt.a(26);
        gb.a(30, 1, 180, 460, 100, 400, new int[8], -90);
        gb.a(30, 24, 180, 460, 100, 400, new int[9], -43);
        gb.a(30, 2, 180, 460, 100, 400, new int[6], -75);
        gb.a(30, 19, 180, 460, 100, 170, new int[2], -115);
        gb.a(30, 25, 180, 460, 100, 170, new int[2], -54);
        gb.a(30, 3, 180, 460, 100, 400, new int[9], -41);
        gb.a(30, 4, 180, 460, 100, 400, new int[8], -86);
        gb.a(30, 6, 180, 460, 400, 460, new int[2], -115);
        gb.a(30, 26, 180, 460, 400, 460, new int[2], -51);
        gb.a(30, 27, 180, 460, 400, 460, new int[2], -111);
        gb.a(30, 28, 180, 460, 400, 460, new int[2], -117);
        gb.a(30, 12, 60, 580, 440, 470, new int[4], -114);
        gb.a(30, 13, 60, 580, 440, 470, new int[1], -78);
        gb.a(30, 20, 60, 580, 440, 470, new int[4], -95);
        vt.a(-120);
        gb.a(30, 8, 280, 360, 438, 440, new int[2], -119);
        gb.a(30, 9, 280, 360, 438, 440, new int[1], -27);
        gb.a(30, 10, 180, 460, 400, 460, new int[2], -70);
        gb.a(30, 11, 100, 540, 100, 400, new int[1], -52);
        gb.a(30, 15, 180, 460, 100, 400, new int[0], -102);
        gb.a(30, 14, 180, 460, 120, 350, new int[7], -96);
        gb.a(30, 16, 532, 633, 390, 420, new int[1], -36);
        gb.a(30, 17, 180, 460, 100, 400, new int[7], -63);
        gb.a(30, 18, 60, 580, 440, 470, new int[4], -87);
        df.a(-20);
    }
}
