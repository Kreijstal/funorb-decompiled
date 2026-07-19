/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends ma {
    static int field_M;
    static ph field_W;
    private mm field_T;
    private int field_O;
    static qm field_U;
    static String field_ab;
    private boolean field_S;
    static String field_P;
    private int field_X;
    private int field_Q;
    static int field_R;
    static uf field_V;
    static boolean field_Z;
    private String field_Y;

    de(int param0, int param1, int param2, int param3, ce param4, boolean param5, int param6, int param7, mm param8, int param9, String param10) {
        super(param0, param1, param2, param3, (gl) null, (kg) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((de) (this)).field_S = stackIn_4_1 != 0;
                this.field_X = param9;
                this.field_L = param4;
                this.field_O = param7;
                this.field_T = param8;
                this.field_Y = param10;
                this.field_Q = param6;
                var12_int = -this.field_O + this.field_Q;
                var13 = this.field_T.b(param10, var12_int, this.field_T.field_R) - -(this.field_O * 2);
                if (var13 > param3) {
                  break L3;
                } else {
                  var13 = param3;
                  if (!client.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.b(var13, param2, param0, param1, -16555);
              break L2;
            }
            L4: {
              if (!this.field_S) {
                stackOut_9_0 = this.field_Q - -(this.field_O * 2);
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L4;
              }
            }
            var14 = stackIn_10_0;
            this.field_L.b(-(this.field_O * 2) + param3, param2 - this.field_Q + -(3 * this.field_O), var14, this.field_O + (var13 - param3 >> 1459606401), -16555);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var12);
            stackOut_12_1 = new StringBuilder().append("de.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    public static void g(int param0) {
        field_W = null;
        field_V = null;
        field_P = null;
        field_U = null;
        if (param0 >= -117) {
          field_P = (String) null;
          field_ab = null;
          return;
        } else {
          field_ab = null;
          return;
        }
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(boolean param0, int param1, String param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_4_0 = null;
        int stackIn_37_0 = 0;
        String[] stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_48_0 = 0;
        String[] stackIn_48_1 = null;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        int stackOut_47_0 = 0;
        String[] stackOut_47_1 = null;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_36_0 = 0;
        String[] stackOut_36_1 = null;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              ph.field_Ab = true;
              kk.field_k = param3;
              var11 = param2;
              if (!param4) {
                stackOut_3_0 = me.field_C;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = qn.field_rb;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              L3: {
                var6 = stackIn_4_0;
                if (-1 != (kk.field_k ^ -1)) {
                  break L3;
                } else {
                  var7 = te.a(var11, 116, 480, pj.field_N, wf.field_q);
                  var8 = var7 + 3;
                  ug.field_q = new int[var8];
                  ef.field_M = new String[var8];
                  var9 = 0;
                  L4: while (true) {
                    L5: {
                      if (var9 >= var8) {
                        ef.field_T = new int[2];
                        break L5;
                      } else {
                        ug.field_q[var9] = -1;
                        var9++;
                        if (var10 != 0) {
                          break L5;
                        } else {
                          continue L4;
                        }
                      }
                    }
                    var9 = 0;
                    L6: while (true) {
                      L7: {
                        if (var9 >= var7) {
                          ef.field_M[-3 + var8] = "";
                          ef.field_M[var8 - 2] = var6;
                          ug.field_q[var8 + -2] = 0;
                          ef.field_T[0] = 1;
                          ef.field_M[-1 + var8] = og.field_gb;
                          ug.field_q[-1 + var8] = 1;
                          ef.field_T[1] = 2;
                          break L7;
                        } else {
                          ef.field_M[var9] = pj.field_N[var9];
                          var9++;
                          if (var10 != 0) {
                            break L7;
                          } else {
                            continue L6;
                          }
                        }
                      }
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              if ((kk.field_k ^ -1) == -2) {
                var7 = te.a(var11, 104, 480, pj.field_N, wf.field_q);
                var8 = 2 - -var7;
                ug.field_q = new int[var8];
                ef.field_M = new String[var8];
                var9 = 0;
                L8: while (true) {
                  L9: {
                    if (var9 >= var8) {
                      ef.field_T = new int[1];
                      break L9;
                    } else {
                      ug.field_q[var9] = -1;
                      var9++;
                      if (var10 != 0) {
                        break L9;
                      } else {
                        continue L8;
                      }
                    }
                  }
                  var9 = 0;
                  L10: while (true) {
                    L11: {
                      if (var9 >= var7) {
                        ef.field_M[var8 + -2] = "";
                        ef.field_M[-1 + var8] = og.field_gb;
                        ug.field_q[-1 + var8] = 0;
                        break L11;
                      } else {
                        ef.field_M[var9] = pj.field_N[var9];
                        var9++;
                        if (var10 != 0) {
                          break L11;
                        } else {
                          continue L10;
                        }
                      }
                    }
                    ef.field_T[0] = 2;
                    break L2;
                  }
                }
              } else {
                throw new IllegalArgumentException();
              }
            }
            wj.field_Jb.field_l = ef.field_T.length;
            var7 = 0;
            var8 = 0;
            if (param1 == -5540) {
              L12: while (true) {
                L13: {
                  L14: {
                    if (var8 >= ef.field_M.length) {
                      ac.field_A = (je.field_c + le.field_t << 1002777217) * wj.field_Jb.field_l;
                      fb.field_f = -(var7 >> -1152159039) + (af.field_f + var7);
                      ad.field_a = af.field_f - (var7 >> 1945551777);
                      var8 = 0;
                      L15: while (true) {
                        stackOut_47_0 = var8;
                        stackOut_47_1 = ef.field_M;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        if (stackIn_48_0 >= stackIn_48_1.length) {
                          break L14;
                        } else {
                          stackOut_49_0 = ac.field_A;
                          stackOut_49_1 = ug.field_q[var8];
                          stackIn_55_0 = stackOut_49_0;
                          stackIn_55_1 = stackOut_49_1;
                          stackIn_50_0 = stackOut_49_0;
                          stackIn_50_1 = stackOut_49_1;
                          if (var10 != 0) {
                            break L13;
                          } else {
                            L16: {
                              stackOut_50_0 = stackIn_50_0;
                              stackIn_52_0 = stackOut_50_0;
                              stackIn_51_0 = stackOut_50_0;
                              if (stackIn_50_1 < 0) {
                                stackOut_52_0 = stackIn_52_0;
                                stackOut_52_1 = ma.field_I;
                                stackIn_53_0 = stackOut_52_0;
                                stackIn_53_1 = stackOut_52_1;
                                break L16;
                              } else {
                                stackOut_51_0 = stackIn_51_0;
                                stackOut_51_1 = vb.field_V;
                                stackIn_53_0 = stackOut_51_0;
                                stackIn_53_1 = stackOut_51_1;
                                break L16;
                              }
                            }
                            ac.field_A = stackIn_53_0 + stackIn_53_1;
                            var8++;
                            if (var10 == 0) {
                              continue L15;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    } else {
                      stackOut_36_0 = 0;
                      stackOut_36_1 = ef.field_M;
                      stackIn_48_0 = stackOut_36_0;
                      stackIn_48_1 = stackOut_36_1;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      if (var10 != 0) {
                        L17: while (true) {
                          if (stackIn_48_0 >= stackIn_48_1.length) {
                            break L14;
                          } else {
                            stackOut_49_0 = ac.field_A;
                            stackOut_49_1 = ug.field_q[var8];
                            stackIn_55_0 = stackOut_49_0;
                            stackIn_55_1 = stackOut_49_1;
                            stackIn_50_0 = stackOut_49_0;
                            stackIn_50_1 = stackOut_49_1;
                            if (var10 != 0) {
                              break L13;
                            } else {
                              L18: {
                                stackOut_50_0 = stackIn_50_0;
                                stackIn_52_0 = stackOut_50_0;
                                stackIn_51_0 = stackOut_50_0;
                                if (stackIn_50_1 < 0) {
                                  stackOut_52_0 = stackIn_52_0;
                                  stackOut_52_1 = ma.field_I;
                                  stackIn_53_0 = stackOut_52_0;
                                  stackIn_53_1 = stackOut_52_1;
                                  break L18;
                                } else {
                                  stackOut_51_0 = stackIn_51_0;
                                  stackOut_51_1 = vb.field_V;
                                  stackIn_53_0 = stackOut_51_0;
                                  stackIn_53_1 = stackOut_51_1;
                                  break L18;
                                }
                              }
                              ac.field_A = stackIn_53_0 + stackIn_53_1;
                              var8++;
                              if (var10 == 0) {
                                stackOut_47_0 = var8;
                                stackOut_47_1 = ef.field_M;
                                stackIn_48_0 = stackOut_47_0;
                                stackIn_48_1 = stackOut_47_1;
                                continue L17;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      } else {
                        L19: {
                          stackOut_37_0 = stackIn_37_0;
                          stackOut_37_1 = stackIn_37_1[var8];
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          if (0 > ug.field_q[var8]) {
                            stackOut_39_0 = stackIn_39_0;
                            stackOut_39_1 = (String) ((Object) stackIn_39_1);
                            stackOut_39_2 = 0;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            stackIn_40_2 = stackOut_39_2;
                            break L19;
                          } else {
                            stackOut_38_0 = stackIn_38_0;
                            stackOut_38_1 = (String) ((Object) stackIn_38_1);
                            stackOut_38_2 = 1;
                            stackIn_40_0 = stackOut_38_0;
                            stackIn_40_1 = stackOut_38_1;
                            stackIn_40_2 = stackOut_38_2;
                            break L19;
                          }
                        }
                        L20: {
                          var9 = qb.a(stackIn_40_0, stackIn_40_1, stackIn_40_2 != 0);
                          if ((ug.field_q[var8] ^ -1) != 0) {
                            var9 = var9 + ba.field_d * 2;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (var9 <= var7) {
                            break L21;
                          } else {
                            var7 = var9;
                            break L21;
                          }
                        }
                        var8++;
                        continue L12;
                      }
                    }
                  }
                  stackOut_54_0 = kk.field_e;
                  stackOut_54_1 = -(ac.field_A >> 1639359713);
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  break L13;
                }
                rn.field_d = stackIn_55_0 + stackIn_55_1;
                wj.field_Jb.a(0, 0, pm.a(pm.field_f, -2141435999, bh.field_g), param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var5 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var5);
            stackOut_57_1 = new StringBuilder().append("de.B(").append(param0).append(',').append(param1).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param2 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param0 + this.field_u;
        int var6 = this.field_D - -param3;
        if (param1 > -103) {
            return;
        }
        super.a(param0, -109, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        int var7 = this.field_S ? this.field_t + (-this.field_Q + -(2 * this.field_O)) : 0;
        int discarded$0 = this.field_T.a(this.field_Y, var7 + var5 + this.field_O, var6 - -this.field_O, -this.field_O + this.field_Q, this.field_y + -(2 * this.field_O), this.field_X, -1, this.field_S ? 0 : 2, 1, this.field_T.field_R);
    }

    final static ck[] c(boolean param0) {
        ck[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        byte[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_11_0 = false;
        var7 = client.field_A ? 1 : 0;
        var1 = new ck[ec.field_g];
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var2 >= ec.field_g) {
                break L2;
              } else {
                var3 = hc.field_c[var2] * tm.field_a[var2];
                var13 = tc.field_Nb[var2];
                var11 = new int[var3];
                var9 = var11;
                var5 = var9;
                stackOut_2_0 = 0;
                stackIn_12_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var7 != 0) {
                  break L1;
                } else {
                  var6 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      if (var6 >= var3) {
                        var1[var2] = new ck(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var11);
                        var2++;
                        break L4;
                      } else {
                        var5[var6] = mb.field_d[lb.a((int) var13[var6], 255)];
                        var6++;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            oa.a(126);
            stackOut_11_0 = param0;
            stackIn_12_0 = stackOut_11_0 ? 1 : 0;
            break L1;
          }
          if (stackIn_12_0 != 0) {
            field_W = (ph) null;
            return var1;
          } else {
            return var1;
          }
        }
    }

    final String c(byte param0) {
        int var2 = this.field_L.field_q ? 1 : 0;
        this.field_L.field_q = this.field_q;
        String var3 = this.field_L.c(param0);
        this.field_L.field_q = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_ab = "If you do nothing the game will revert to normal view in <%0> second.";
        field_P = "Instructions";
        field_Z = false;
        field_U = new qm(12, 0, 1, 0);
    }
}
