/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends oh {
    private int field_P;
    static int[] field_J;
    private String field_U;
    static nj field_N;
    private int field_I;
    private boolean field_H;
    private cc field_K;
    static nk[][] field_S;
    private int field_Q;
    static boolean field_O;
    static String field_T;
    static String field_L;
    static String field_G;
    static od field_R;
    static cr[] field_M;

    mg(int param0, int param1, int param2, int param3, iq param4, boolean param5, int param6, int param7, cc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ur) null, (uf) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_P = param9;
              this.field_I = param6;
              this.field_Q = param7;
              this.field_K = param8;
              this.field_C = param4;
              this.field_U = param10;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((mg) (this)).field_H = stackIn_4_1 != 0;
              var12_int = this.field_I + -this.field_Q;
              var13 = this.field_K.a(param10, var12_int, this.field_K.field_z) + this.field_Q * 2;
              if (param3 < var13) {
                this.a(false, param0, param1, var13, param2);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (this.field_H) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = this.field_I - -(this.field_Q * 2);
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_C.a(false, var14, (-param3 + var13 >> 165415681) + this.field_Q, -(2 * this.field_Q) + param3, param2 - this.field_I - 3 * this.field_Q);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("mg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = param2 + this.field_o;
        int var6 = param3 + this.field_t;
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        int var7 = this.field_H ? -(2 * this.field_Q) + -this.field_I + this.field_n : 0;
        this.field_K.a(this.field_U, this.field_Q + var7 + var5, var6 - -this.field_Q, -this.field_Q + this.field_I, -(2 * this.field_Q) + this.field_s, this.field_P, -1, !this.field_H ? 2 : 0, 1, this.field_K.field_z);
    }

    final static void a(int param0, boolean param1, float param2, String param3) {
        if (!(null != bb.field_F)) {
            bb.field_F = new fg(ch.field_e, eg.field_t);
            ch.field_e.b(bb.field_F, 0);
        }
        bb.field_F.a(param2, 4210752, param1, param3);
        if (param0 != 1) {
            return;
        }
        try {
            bi.c();
            mh.a(true, false);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "mg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2, uh param3) {
        nk dupTemp$0 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        nk stackIn_23_0 = null;
        nk stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        nk stackIn_30_0 = null;
        nk stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        nk stackIn_76_0 = null;
        nk stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        nk stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        int stackIn_83_1 = 0;
        nk stackIn_88_0 = null;
        boolean stackIn_88_1 = false;
        nk stackIn_89_0 = null;
        boolean stackIn_89_1 = false;
        int stackIn_89_2 = 0;
        nk stackIn_93_0 = null;
        nk stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_98_0 = 0;
        nk stackIn_114_0 = null;
        nk stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        nk stackIn_118_0 = null;
        nk stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        nk stackIn_122_0 = null;
        nk stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        nk stackIn_126_0 = null;
        nk stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        String stackIn_142_0 = null;
        nk stackIn_146_0 = null;
        nk stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        nk stackIn_149_0 = null;
        nk stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        int stackIn_156_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_216_0 = 0;
        nk stackIn_318_0 = null;
        boolean stackIn_318_1 = false;
        nk stackIn_319_0 = null;
        boolean stackIn_319_1 = false;
        int stackIn_319_2 = 0;
        nk stackIn_321_0 = null;
        byte stackIn_321_1 = 0;
        int stackIn_321_2 = 0;
        int stackIn_321_3 = 0;
        int stackIn_324_1 = 0;
        nk stackIn_328_0 = null;
        nk stackIn_329_0 = null;
        int stackIn_329_1 = 0;
        nk stackIn_333_0 = null;
        nk stackIn_334_0 = null;
        int stackIn_334_1 = 0;
        RuntimeException stackIn_342_0 = null;
        StringBuilder stackIn_342_1 = null;
        RuntimeException stackIn_343_0 = null;
        StringBuilder stackIn_343_1 = null;
        String stackIn_343_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        nk[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        nk var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        nk var28 = null;
        nk var29 = null;
        nk[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        var26 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2) {
                L2: {
                  if (qn.field_q) {
                    stackIn_12_0 = 0;
                    break L2;
                  } else {
                    stackIn_12_0 = 1;
                    break L2;
                  }
                }
                var4_int = stackIn_12_0;
                break L1;
              } else {
                L3: {
                  if (cn.b(false)) {
                    if (!param3.field_kc) {
                      stackIn_8_0 = 1;
                      break L3;
                    } else {
                      stackIn_8_0 = 0;
                      break L3;
                    }
                  } else {
                    stackIn_8_0 = 0;
                    break L3;
                  }
                }
                var4_int = stackIn_8_0;
                break L1;
              }
            }
            L4: {
              var5 = param0 ? 1 : 0;
              if (param2) {
                break L4;
              } else {
                var6 = 0;
                L5: while (true) {
                  if (var6 >= 5) {
                    if (field_S[0][2].field_G) {
                      if (cn.b(false)) {
                        ko.field_S = qn.field_z;
                        break L4;
                      } else {
                        ko.field_S = Vertigo2.a(new String[]{gd.field_j.field_Nb}, e.field_e, 77);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L6: {
                      if (var4_int == 0) {
                        break L6;
                      } else {
                        if (field_S[0][1 + var6].field_tb == 0) {
                          break L6;
                        } else {
                          if (var6 != param3.field_Ub) {
                            param3.field_Ub = var6;
                            var5 = 1;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      stackIn_23_0 = field_S[0][var6 + 1];

                      if (var4_int == 0) {
                        stackIn_24_0 = (nk) ((Object) stackIn_23_0);
                        stackIn_24_1 = 0;
                        break L7;
                      } else {
                        stackIn_24_0 = (nk) ((Object) stackIn_23_0);
                        stackIn_24_1 = 1;
                        break L7;
                      }
                    }
                    L8: {
                      stackIn_24_0.field_lb = stackIn_24_1 != 0;
                      if (db.field_S) {
                        break L8;
                      } else {
                        if (var6 == 3) {
                          field_S[0][1 + var6].field_lb = false;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      stackIn_30_0 = field_S[0][1 + var6];

                      if (var6 != param3.field_Ub) {
                        stackIn_31_0 = (nk) ((Object) stackIn_30_0);
                        stackIn_31_1 = 0;
                        break L9;
                      } else {
                        stackIn_31_0 = (nk) ((Object) stackIn_30_0);
                        stackIn_31_1 = 1;
                        break L9;
                      }
                    }
                    stackIn_31_0.field_V = stackIn_31_1 != 0;
                    var6++;
                    continue L5;
                  }
                }
              }
            }
            L10: {
              if (2 > rc.field_a.length) {
                break L10;
              } else {
                L11: {
                  if (param2) {
                    if (-1 != np.field_Ob) {
                      stackIn_44_0 = 1;
                      break L11;
                    } else {
                      stackIn_44_0 = 0;
                      break L11;
                    }
                  } else {
                    stackIn_44_0 = 0;
                    break L11;
                  }
                }
                L12: {
                  var6 = stackIn_44_0;
                  if (var6 == 0) {
                    break L12;
                  } else {
                    var7 = np.field_Ob;
                    var8_int = 0;
                    L13: while (true) {
                      if (qc.field_w.length <= var8_int) {
                        qc.field_w[var7 / 8] = (byte)om.a((int) qc.field_w[var7 / 8], 1 << var7 % 8);
                        break L12;
                      } else {
                        qc.field_w[var8_int] = (byte) 0;
                        var8_int++;
                        continue L13;
                      }
                    }
                  }
                }
                L14: {
                  if (!param2) {
                    stackIn_52_0 = 0;
                    break L14;
                  } else {
                    stackIn_52_0 = -1;
                    break L14;
                  }
                }
                var7 = stackIn_52_0;
                L15: while (true) {
                  if (rc.field_a.length <= var7) {
                    break L10;
                  } else {
                    L16: {
                      if (var6 != 0) {
                        if (var7 != np.field_Ob) {
                          stackIn_60_0 = 1;
                          break L16;
                        } else {
                          stackIn_60_0 = 0;
                          break L16;
                        }
                      } else {
                        stackIn_60_0 = 0;
                        break L16;
                      }
                    }
                    L17: {
                      var8_int = stackIn_60_0;
                      if (var4_int == 0) {
                        break L17;
                      } else {
                        if (field_S[1][1 + var7].field_tb != 0) {
                          if (param2) {
                            if (var6 != 0) {
                              break L17;
                            } else {
                              if ((var7 ^ -1) == 0) {
                                var9 = 0;
                                L18: while (true) {
                                  if (var9 >= qc.field_w.length) {
                                    break L17;
                                  } else {
                                    qc.field_w[var9] = (byte) 0;
                                    var9++;
                                    continue L18;
                                  }
                                }
                              } else {
                                qc.field_w[var7 / 8] = (byte)tk.a((int) qc.field_w[var7 / 8], 1 << b.a(var7, 7));
                                break L17;
                              }
                            }
                          } else {
                            var9 = rc.field_a[var7];
                            if (var9 != param3.field_uc) {
                              param3.field_uc = var9;
                              var5 = 1;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                    L19: {
                      if (param2) {
                        if (var7 == -1) {
                          field_S[1][var7 + 1].field_V = true;
                          var9 = 0;
                          L20: while (true) {
                            if (var9 >= rc.field_a.length) {
                              break L19;
                            } else {
                              L21: {
                                dupTemp$0 = field_S[1][1 + var7];
                                stackIn_88_0 = (nk) (dupTemp$0);

                                stackIn_88_1 = dupTemp$0.field_V;

                                if ((qc.field_w[var9 / 8] & 1 << (7 & var9)) != 0) {
                                  stackIn_89_0 = (nk) ((Object) stackIn_88_0);
                                  stackIn_89_1 = stackIn_88_1;
                                  stackIn_89_2 = 0;
                                  break L21;
                                } else {
                                  stackIn_89_0 = (nk) ((Object) stackIn_88_0);
                                  stackIn_89_1 = stackIn_88_1;
                                  stackIn_89_2 = 1;
                                  break L21;
                                }
                              }
                              stackIn_89_0.field_V = stackIn_89_1 & stackIn_89_2 != 0;
                              var9++;
                              continue L20;
                            }
                          }
                        } else {
                          stackIn_80_0 = field_S[1][var7 + 1];
                          stackIn_80_1 = qc.field_w[var7 / 8] & 1 << (var7 & 7) ^ -1;
                          stackIn_80_2 = -1;
                          L22: {


                            if (stackIn_80_1 == stackIn_80_2) {
                              stackIn_80_0 = (nk) ((Object) stackIn_80_0);
                              stackIn_83_1 = 0;
                              break L22;
                            } else {
                              stackIn_80_0 = (nk) ((Object) stackIn_80_0);
                              stackIn_83_1 = 1;
                              break L22;
                            }
                          }
                          stackIn_80_0.field_V = stackIn_83_1 != 0;
                          break L19;
                        }
                      } else {
                        L23: {
                          var9 = rc.field_a[var7];
                          stackIn_76_0 = field_S[1][1 + var7];

                          if (param3.field_uc != var9) {
                            stackIn_77_0 = (nk) ((Object) stackIn_76_0);
                            stackIn_77_1 = 0;
                            break L23;
                          } else {
                            stackIn_77_0 = (nk) ((Object) stackIn_76_0);
                            stackIn_77_1 = 1;
                            break L23;
                          }
                        }
                        stackIn_77_0.field_V = stackIn_77_1 != 0;
                        break L19;
                      }
                    }
                    L24: {
                      L25: {
                        stackIn_93_0 = field_S[1][1 + var7];

                        if (var4_int == 0) {
                          break L25;
                        } else {
                          stackIn_93_0 = (nk) ((Object) stackIn_93_0);

                          if (var8_int != 0) {
                            break L25;
                          } else {
                            stackIn_94_0 = (nk) ((Object) stackIn_93_0);
                            stackIn_94_1 = 1;
                            break L24;
                          }
                        }
                      }
                      stackIn_94_0 = (nk) ((Object) stackIn_93_0);
                      stackIn_94_1 = 0;
                      break L24;
                    }
                    stackIn_94_0.field_lb = stackIn_94_1 != 0;
                    var7++;
                    continue L15;
                  }
                }
              }
            }
            L26: {
              if (!param2) {
                stackIn_98_0 = 1;
                break L26;
              } else {
                stackIn_98_0 = 0;
                break L26;
              }
            }
            var6 = stackIn_98_0;
            L27: while (true) {
              if (3 <= var6) {
                L28: {
                  if (!param2) {
                    break L28;
                  } else {
                    if (sp.field_O > 1) {
                      var6 = 0;
                      L29: while (true) {
                        if (var6 >= sp.field_O - -1) {
                          break L28;
                        } else {
                          L30: {
                            var29 = field_S[3][var6];
                            if (var4_int == 0) {
                              break L30;
                            } else {
                              if (var29.field_tb == 0) {
                                break L30;
                              } else {
                                ua.field_a = var6;
                                break L30;
                              }
                            }
                          }
                          L31: {
                            if (!var29.field_G) {
                              break L31;
                            } else {
                              if ((var6 ^ -1) < -1) {
                                L32: {
                                  if (lh.field_c == null) {
                                    stackIn_142_0 = null;
                                    break L32;
                                  } else {
                                    stackIn_142_0 = lh.field_c[var6 - 1];
                                    break L32;
                                  }
                                }
                                var8 = stackIn_142_0;
                                if (var8 == null) {
                                  break L31;
                                } else {
                                  ko.field_S = var8;
                                  break L31;
                                }
                              } else {
                                break L31;
                              }
                            }
                          }
                          L33: {
                            stackIn_146_0 = (nk) (var29);

                            if (var4_int == 0) {
                              stackIn_147_0 = (nk) ((Object) stackIn_146_0);
                              stackIn_147_1 = 0;
                              break L33;
                            } else {
                              stackIn_147_0 = (nk) ((Object) stackIn_146_0);
                              stackIn_147_1 = 1;
                              break L33;
                            }
                          }
                          L34: {
                            stackIn_147_0.field_lb = stackIn_147_1 != 0;
                            stackIn_149_0 = (nk) (var29);

                            if (var6 != ua.field_a) {
                              stackIn_150_0 = (nk) ((Object) stackIn_149_0);
                              stackIn_150_1 = 0;
                              break L34;
                            } else {
                              stackIn_150_0 = (nk) ((Object) stackIn_149_0);
                              stackIn_150_1 = 1;
                              break L34;
                            }
                          }
                          stackIn_150_0.field_V = stackIn_150_1 != 0;
                          var6++;
                          continue L29;
                        }
                      }
                    } else {
                      break L28;
                    }
                  }
                }
                var6 = 0;
                var7 = 0;
                L35: while (true) {
                  if (ol.field_A <= var7) {
                    L36: {
                      if (var5 == 0) {
                        break L36;
                      } else {
                        if (param2) {
                          break L36;
                        } else {
                          ar.a(953354214, param1);
                          break L36;
                        }
                      }
                    }
                    break L0;
                  } else {
                    L37: {
                      var30 = field_S[var7 + 4];
                      var8_array = var30;
                      if (!param2) {
                        stackIn_156_0 = 0;
                        break L37;
                      } else {
                        stackIn_156_0 = -1;
                        break L37;
                      }
                    }
                    var9 = stackIn_156_0;
                    L38: while (true) {
                      if (var30.length + -1 <= var9) {
                        var6 = var6 + (kr.field_c[var7] & 255);
                        var7++;
                        continue L35;
                      } else {
                        L39: {
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          if (var4_int == 0) {
                            break L39;
                          } else {
                            if ((var9 ^ -1) <= -1) {
                              L40: {
                                if (il.field_b == null) {
                                  break L40;
                                } else {
                                  if (null != il.field_b[var7]) {
                                    if ((il.field_b[var7][var9] & (ob.field_L ^ -1) ^ -1) >= -1) {
                                      break L40;
                                    } else {
                                      var15 = ib.a((ob.field_L ^ -1) & il.field_b[var7][var9], (byte) 79);
                                      var14 = 1;
                                      break L40;
                                    }
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                              L41: {
                                if (null == sf.field_f) {
                                  break L41;
                                } else {
                                  if (sf.field_f[var7] == null) {
                                    break L41;
                                  } else {
                                    if (-1 > (q.field_y ^ -1)) {
                                      break L41;
                                    } else {
                                      if (sf.field_f[var7][var9]) {
                                        var10 = 1;
                                        break L41;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                              }
                              L42: {
                                if (null == te.field_D) {
                                  break L42;
                                } else {
                                  if (te.field_D[var7] == null) {
                                    break L42;
                                  } else {
                                    L43: {
                                      var16 = te.field_D[var7][var9];
                                      if ((var16 ^ -1) >= -1) {
                                        break L43;
                                      } else {
                                        if (rp.field_a < var16) {
                                          var12 = 1;
                                          break L43;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                    if (var16 == 0) {
                                      break L42;
                                    } else {
                                      if (vb.field_g) {
                                        break L42;
                                      } else {
                                        if (-1 <= (q.field_y ^ -1)) {
                                          var10 = 1;
                                          break L42;
                                        } else {
                                          break L42;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L44: {
                                if (null == qh.field_e) {
                                  break L44;
                                } else {
                                  if (null != qh.field_e[var7]) {
                                    L45: {
                                      var16 = qh.field_e[var7][var9];
                                      if (0 == var16) {
                                        break L45;
                                      } else {
                                        if (vb.field_g) {
                                          break L45;
                                        } else {
                                          if (q.field_y > 0) {
                                            break L45;
                                          } else {
                                            var10 = 1;
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                    if (0 >= var16) {
                                      break L44;
                                    } else {
                                      if (qn.field_w < var16) {
                                        var11 = 1;
                                        break L44;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              L46: {
                                if (param2) {
                                  if (null != dl.field_b) {
                                    if (dl.field_b[var7] != null) {
                                      if (!dl.field_b[var7][var9]) {
                                        stackIn_204_0 = 0;
                                        break L46;
                                      } else {
                                        stackIn_204_0 = 1;
                                        break L46;
                                      }
                                    } else {
                                      stackIn_204_0 = 0;
                                      break L46;
                                    }
                                  } else {
                                    stackIn_204_0 = 0;
                                    break L46;
                                  }
                                } else {
                                  stackIn_204_0 = 0;
                                  break L46;
                                }
                              }
                              var13 = stackIn_204_0;
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                        }
                        L47: {
                          if (2 > fn.field_z) {
                            break L47;
                          } else {
                            if (!cr.field_eb[12]) {
                              break L47;
                            } else {
                              var13 = 0;
                              var14 = 0;
                              var10 = 0;
                              var11 = 0;
                              var12 = 0;
                              break L47;
                            }
                          }
                        }
                        L48: {
                          L49: {
                            gd.field_r = true;
                            if (var10 != 0) {
                              break L49;
                            } else {
                              if (var11 != 0) {
                                break L49;
                              } else {
                                if (var12 != 0) {
                                  break L49;
                                } else {
                                  if (var13 != 0) {
                                    break L49;
                                  } else {
                                    if (var14 == 0) {
                                      stackIn_216_0 = 0;
                                      break L48;
                                    } else {
                                      stackIn_216_0 = 1;
                                      break L48;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackIn_216_0 = 1;
                          break L48;
                        }
                        L50: {
                          var16 = stackIn_216_0;
                          if (var16 != 0) {
                            break L50;
                          } else {
                            if (var9 < 0) {
                              break L50;
                            } else {
                              if (gr.field_W == null) {
                                break L50;
                              } else {
                                L51: {
                                  if (!param2) {
                                    break L51;
                                  } else {
                                    if (qn.field_q) {
                                      break L50;
                                    } else {
                                      break L51;
                                    }
                                  }
                                }
                                L52: {
                                  ng.field_a = false;
                                  if (null != e.field_c) {
                                    break L52;
                                  } else {
                                    mn.field_t = new boolean[ol.field_A];
                                    e.field_c = new byte[ol.field_A];
                                    break L52;
                                  }
                                }
                                gd.field_r = false;
                                var17_int = 0;
                                L53: while (true) {
                                  if (var17_int >= var7) {
                                    L54: {
                                      uq.a(param3, var7, 20473, 0, -1, var9, -1, param2);
                                      if (fn.field_z < 2) {
                                        break L54;
                                      } else {
                                        if (!cr.field_eb[12]) {
                                          break L54;
                                        } else {
                                          gd.field_r = true;
                                          break L54;
                                        }
                                      }
                                    }
                                    if (gd.field_r) {
                                      break L50;
                                    } else {
                                      var16 = 1;
                                      break L50;
                                    }
                                  } else {
                                    mn.field_t[var17_int] = false;
                                    var17_int++;
                                    continue L53;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L55: {
                          var17 = var8_array[var9 + 1];
                          if (var4_int == 0) {
                            break L55;
                          } else {
                            if (var17.field_tb == 0) {
                              break L55;
                            } else {
                              if (!param2) {
                                if (var16 != 0) {
                                  break L55;
                                } else {
                                  if (param3.field_fc[var7] == (byte)var9) {
                                    break L55;
                                  } else {
                                    param3.field_fc[var7] = (byte)var9;
                                    var5 = 1;
                                    break L55;
                                  }
                                }
                              } else {
                                if (var9 != -1) {
                                  dj.field_a[(var9 - -var6) / 8] = (byte)tk.a((int) dj.field_a[(var9 + var6) / 8], 1 << b.a(7, var9 + var6));
                                  break L55;
                                } else {
                                  var18 = var6;
                                  L56: while (true) {
                                    if (var18 >= var30.length + (var6 + -1)) {
                                      break L55;
                                    } else {
                                      dj.field_a[var18 / 8] = (byte)b.a((int) dj.field_a[var18 / 8], 1 << b.a(7, var18) ^ -1);
                                      var18++;
                                      continue L56;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L57: {
                          if (!param2) {
                            break L57;
                          } else {
                            if (var16 == 0) {
                              break L57;
                            } else {
                              dj.field_a[(var6 + var9) / 8] = (byte)b.a((int) dj.field_a[(var6 + var9) / 8], 1 << b.a(7, var6 + var9) ^ -1);
                              break L57;
                            }
                          }
                        }
                        L58: {
                          if ((var9 ^ -1) > -1) {
                            break L58;
                          } else {
                            if (var17.field_G) {
                              L59: {
                                if (null != rf.field_m) {
                                  if (rf.field_m[var7] != null) {
                                    var18_ref = rf.field_m[var7][var9];
                                    break L59;
                                  } else {
                                    var18_ref = null;
                                    break L59;
                                  }
                                } else {
                                  var18_ref = null;
                                  break L59;
                                }
                              }
                              L60: {
                                if (an.field_f == null) {
                                  var19 = null;
                                  break L60;
                                } else {
                                  if (null != an.field_f[var7]) {
                                    var19 = an.field_f[var7][var9];
                                    break L60;
                                  } else {
                                    var19 = null;
                                    break L60;
                                  }
                                }
                              }
                              L61: {
                                var20 = null;
                                if (var19 == null) {
                                  break L61;
                                } else {
                                  if (!((String) (var19)).equals(var18_ref)) {
                                    var20 = var19;
                                    break L61;
                                  } else {
                                    break L61;
                                  }
                                }
                              }
                              L62: {
                                var21 = null;
                                if (var13 == 0) {
                                  if (var10 == 0) {
                                    L63: {
                                      if (var11 != 0) {
                                        var22_int = qh.field_e[var7][var9] - qn.field_w;
                                        if (var22_int == 1) {
                                          var21 = jm.field_D;
                                          break L63;
                                        } else {
                                          var21 = Vertigo2.a(new String[]{Integer.toString(var22_int)}, kk.field_h, 53);
                                          break L63;
                                        }
                                      } else {
                                        break L63;
                                      }
                                    }
                                    L64: {
                                      if (var12 != 0) {
                                        var31 = Vertigo2.a(new String[]{Integer.toString(rp.field_a), Integer.toString(te.field_D[var7][var9])}, mf.field_a, -120);
                                        var21 = var31;
                                        var21 = var31;
                                        if (var21 == null) {
                                          var21 = var31;
                                          break L64;
                                        } else {
                                          var21 = (String) (var21) + "<br>" + var31;
                                          break L64;
                                        }
                                      } else {
                                        break L64;
                                      }
                                    }
                                    if (var14 != 0) {
                                      L65: {
                                        var22 = ld.field_c;
                                        if (0 >= var15) {
                                          break L65;
                                        } else {
                                          if (null == ck.field_H) {
                                            break L65;
                                          } else {
                                            if (var15 > ck.field_H.length) {
                                              break L65;
                                            } else {
                                              if (ck.field_H[var15 + -1] != null) {
                                                var22 = ck.field_H[var15 + -1][0];
                                                break L65;
                                              } else {
                                                break L65;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 == null) {
                                        var21 = var22;
                                        break L62;
                                      } else {
                                        var21 = (String) (var21) + "<br>" + (String) (var22);
                                        break L62;
                                      }
                                    } else {
                                      break L62;
                                    }
                                  } else {
                                    var21 = tr.field_d;
                                    break L62;
                                  }
                                } else {
                                  var21 = le.field_b;
                                  break L62;
                                }
                              }
                              L66: {
                                if (var4_int == 0) {
                                  break L66;
                                } else {
                                  if (!gd.field_r) {
                                    L67: {
                                      var22 = null;
                                      if (ng.field_a) {
                                        var22 = "</col>" + rq.field_v + "<col=A00000>";
                                        var25 = var22;
                                        var22 = var25;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        break L67;
                                      } else {
                                        break L67;
                                      }
                                    }
                                    var23 = 0;
                                    var24 = 0;
                                    L68: while (true) {
                                      if (var24 >= var7) {
                                        if (var23 != 0) {
                                          var21 = qc.field_u + (String) (var22);
                                          break L66;
                                        } else {
                                          var21 = Vertigo2.a(new String[]{(String) (var22)}, ir.field_b, -124);
                                          break L66;
                                        }
                                      } else {
                                        L69: {
                                          if (mn.field_t[var24]) {
                                            var25_ref = "</col>" + md.field_C[var24] + "<col=A00000>";
                                            var22 = var25_ref;
                                            var21 = var22;
                                            var22 = var25_ref;
                                            if (var22 != null) {
                                              var22 = (String) (var22) + ", " + var25_ref;
                                              var21 = var22;
                                              var21 = var22;
                                              var23 = 1;
                                              break L69;
                                            } else {
                                              var22 = var25_ref;
                                              break L69;
                                            }
                                          } else {
                                            break L69;
                                          }
                                        }
                                        var24++;
                                        continue L68;
                                      }
                                    }
                                  } else {
                                    break L66;
                                  }
                                }
                              }
                              L70: {
                                if (var21 != null) {
                                  var32 = "<col=A00000>" + (String) (var21);
                                  var33 = uj.a("<br>", "<br><col=A00000>", 0, var32);
                                  if (var20 == null) {
                                    var20 = var33;
                                    break L70;
                                  } else {
                                    var20 = (String) (var20) + "<br>" + var33;
                                    break L70;
                                  }
                                } else {
                                  break L70;
                                }
                              }
                              if (var20 == null) {
                                break L58;
                              } else {
                                ko.field_S = (String) (var20);
                                break L58;
                              }
                            } else {
                              break L58;
                            }
                          }
                        }
                        L71: {
                          if (!param2) {
                            L72: {
                              L73: {
                                stackIn_328_0 = (nk) (var17);

                                if (!gd.field_r) {
                                  break L73;
                                } else {
                                  stackIn_328_0 = (nk) ((Object) stackIn_328_0);

                                  if (param3.field_fc[var7] != (byte)var9) {
                                    break L73;
                                  } else {
                                    stackIn_329_0 = (nk) ((Object) stackIn_328_0);
                                    stackIn_329_1 = 1;
                                    break L72;
                                  }
                                }
                              }
                              stackIn_329_0 = (nk) ((Object) stackIn_328_0);
                              stackIn_329_1 = 0;
                              break L72;
                            }
                            stackIn_329_0.field_V = stackIn_329_1 != 0;
                            break L71;
                          } else {
                            if (-1 != var9) {
                              stackIn_321_0 = (nk) (var17);
                              stackIn_321_1 = dj.field_a[(var9 + var6) / 8];
                              stackIn_321_2 = 1;
                              stackIn_321_3 = 7 & var6 - -var9;
                              L74: {


                                if ((stackIn_321_1 & stackIn_321_2 << stackIn_321_3) == 0) {
                                  stackIn_321_0 = (nk) ((Object) stackIn_321_0);
                                  stackIn_324_1 = 0;
                                  break L74;
                                } else {
                                  stackIn_321_0 = (nk) ((Object) stackIn_321_0);
                                  stackIn_324_1 = 1;
                                  break L74;
                                }
                              }
                              stackIn_321_0.field_V = stackIn_324_1 != 0;
                              break L71;
                            } else {
                              var17.field_V = true;
                              var27 = var6;
                              var18 = var27;
                              L75: while (true) {
                                if (var27 >= var30.length + var6 - 1) {
                                  break L71;
                                } else {
                                  L76: {
                                    stackIn_318_0 = (nk) (var17);

                                    stackIn_318_1 = var17.field_V;

                                    if (-1 != (dj.field_a[var27 / 8] & 1 << (var27 & 7) ^ -1)) {
                                      stackIn_319_0 = (nk) ((Object) stackIn_318_0);
                                      stackIn_319_1 = stackIn_318_1;
                                      stackIn_319_2 = 0;
                                      break L76;
                                    } else {
                                      stackIn_319_0 = (nk) ((Object) stackIn_318_0);
                                      stackIn_319_1 = stackIn_318_1;
                                      stackIn_319_2 = 1;
                                      break L76;
                                    }
                                  }
                                  stackIn_319_0.field_V = stackIn_319_1 & stackIn_319_2 != 0;
                                  var27++;
                                  continue L75;
                                }
                              }
                            }
                          }
                        }
                        L77: {
                          L78: {
                            stackIn_333_0 = (nk) (var17);

                            if (var4_int == 0) {
                              break L78;
                            } else {
                              stackIn_333_0 = (nk) ((Object) stackIn_333_0);

                              if (var16 != 0) {
                                break L78;
                              } else {
                                stackIn_334_0 = (nk) ((Object) stackIn_333_0);
                                stackIn_334_1 = 1;
                                break L77;
                              }
                            }
                          }
                          stackIn_334_0 = (nk) ((Object) stackIn_333_0);
                          stackIn_334_1 = 0;
                          break L77;
                        }
                        stackIn_334_0.field_lb = stackIn_334_1 != 0;
                        var9++;
                        continue L38;
                      }
                    }
                  }
                }
              } else {
                L79: {
                  var28 = field_S[2][var6];
                  if (var4_int == 0) {
                    break L79;
                  } else {
                    if (0 != var28.field_tb) {
                      if (!param2) {
                        if (param3.field_xc != var6) {
                          param3.field_xc = var6;
                          var5 = 1;
                          break L79;
                        } else {
                          break L79;
                        }
                      } else {
                        if (var6 != 0) {
                          kg.field_y = kg.field_y ^ var6;
                          break L79;
                        } else {
                          kg.field_y = 0;
                          break L79;
                        }
                      }
                    } else {
                      break L79;
                    }
                  }
                }
                L80: {
                  if (!param2) {
                    L81: {
                      stackIn_122_0 = (nk) (var28);

                      if (0 == (param3.field_xc & var6)) {
                        stackIn_123_0 = (nk) ((Object) stackIn_122_0);
                        stackIn_123_1 = 0;
                        break L81;
                      } else {
                        stackIn_123_0 = (nk) ((Object) stackIn_122_0);
                        stackIn_123_1 = 1;
                        break L81;
                      }
                    }
                    stackIn_123_0.field_V = stackIn_123_1 != 0;
                    break L80;
                  } else {
                    if (var6 != 0) {
                      L82: {
                        stackIn_118_0 = (nk) (var28);

                        if ((var6 & kg.field_y) == 0) {
                          stackIn_119_0 = (nk) ((Object) stackIn_118_0);
                          stackIn_119_1 = 0;
                          break L82;
                        } else {
                          stackIn_119_0 = (nk) ((Object) stackIn_118_0);
                          stackIn_119_1 = 1;
                          break L82;
                        }
                      }
                      stackIn_119_0.field_V = stackIn_119_1 != 0;
                      break L80;
                    } else {
                      L83: {
                        stackIn_114_0 = (nk) (var28);

                        if (-1 != (kg.field_y ^ -1)) {
                          stackIn_115_0 = (nk) ((Object) stackIn_114_0);
                          stackIn_115_1 = 0;
                          break L83;
                        } else {
                          stackIn_115_0 = (nk) ((Object) stackIn_114_0);
                          stackIn_115_1 = 1;
                          break L83;
                        }
                      }
                      stackIn_115_0.field_V = stackIn_115_1 != 0;
                      break L80;
                    }
                  }
                }
                L84: {
                  stackIn_126_0 = (nk) (var28);

                  if (var4_int == 0) {
                    stackIn_127_0 = (nk) ((Object) stackIn_126_0);
                    stackIn_127_1 = 0;
                    break L84;
                  } else {
                    stackIn_127_0 = (nk) ((Object) stackIn_126_0);
                    stackIn_127_1 = 1;
                    break L84;
                  }
                }
                stackIn_127_0.field_lb = stackIn_127_1 != 0;
                var6++;
                continue L27;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L85: {
            var4 = decompiledCaughtException;
            stackIn_342_0 = (RuntimeException) (var4);

            stackIn_342_1 = new StringBuilder().append("mg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_343_0 = (RuntimeException) ((Object) stackIn_342_0);
              stackIn_343_1 = (StringBuilder) ((Object) stackIn_342_1);
              stackIn_343_2 = "null";
              break L85;
            } else {
              stackIn_343_0 = (RuntimeException) ((Object) stackIn_342_0);
              stackIn_343_1 = (StringBuilder) ((Object) stackIn_342_1);
              stackIn_343_2 = "{...}";
              break L85;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_343_0), stackIn_343_2 + ')');
        }
    }

    public static void h(int param0) {
        field_L = null;
        field_G = null;
        field_R = null;
        field_J = null;
        field_M = null;
        field_S = (nk[][]) null;
        field_N = null;
        if (param0 != 2) {
            uh var2 = (uh) null;
            mg.a(true, 49, false, (uh) null);
        }
        field_T = null;
    }

    final String a(boolean param0) {
        int var2 = this.field_C.field_p ? 1 : 0;
        this.field_C.field_p = this.field_p;
        String var3 = this.field_C.a(param0);
        this.field_C.field_p = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_J = new int[8192];
        field_N = new nj();
        field_T = "Cancel draw";
        field_G = "The following settings need to be changed:  ";
        field_L = "Breaking real-world laws";
    }
}
