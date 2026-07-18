/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends ji {
    static cr field_z;
    static int field_y;

    final int[][] b(int param0, int param1) {
        RuntimeException var3 = null;
        int[][] var3_array = null;
        int[] var4 = null;
        int[][] var5 = null;
        int[][] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_20_0 = null;
        var19 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -3780) {
                break L1;
              } else {
                field_y = 109;
                break L1;
              }
            }
            L2: {
              var3_array = ((gj) this).field_v.a(param1, param0 ^ 3778);
              if (((gj) this).field_v.field_c) {
                var4 = ((gj) this).a(2, -1, param1);
                var5 = ((gj) this).c(0, 3, param1);
                var6 = ((gj) this).c(1, 3, param1);
                var7 = var3_array[0];
                var8 = var3_array[1];
                var9 = var3_array[2];
                var10 = var5[0];
                var11 = var5[1];
                var12 = var5[2];
                var13 = var6[0];
                var14 = var6[1];
                var15 = var6[2];
                var16 = 0;
                L3: while (true) {
                  if (~var16 <= ~we.field_M) {
                    break L2;
                  } else {
                    L4: {
                      L5: {
                        var17 = var4[var16];
                        if (var17 != 4096) {
                          break L5;
                        } else {
                          var7[var16] = var10[var16];
                          var8[var16] = var11[var16];
                          var9[var16] = var12[var16];
                          if (var19 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var17 == 0) {
                          break L6;
                        } else {
                          var18 = -var17 + 4096;
                          var7[var16] = var13[var16] * var18 + var17 * var10[var16] >> -251472660;
                          var8[var16] = var14[var16] * var18 + var17 * var11[var16] >> -1824778068;
                          var9[var16] = var15[var16] * var18 + var17 * var12[var16] >> -452825556;
                          if (var19 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7[var16] = var13[var16];
                      var8[var16] = var14[var16];
                      var9[var16] = var15[var16];
                      break L4;
                    }
                    var16++;
                    if (var19 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_20_0 = (int[][]) var3_array;
            stackIn_21_0 = stackOut_20_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var3, "gj.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    public gj() {
        super(3, false);
    }

    final int[] c(int param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int[] stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int[] stackOut_26_0 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_array = ((gj) this).field_x.a(param0, (byte) -59);
                if (((gj) this).field_x.field_i) {
                  var4 = ((gj) this).a(0, -1, param0);
                  var5 = ((gj) this).a(1, -1, param0);
                  var6 = ((gj) this).a(2, -1, param0);
                  var7 = 0;
                  L3: while (true) {
                    if (~we.field_M >= ~var7) {
                      break L2;
                    } else {
                      var8 = var6[var7];
                      stackOut_6_0 = -4097;
                      stackOut_6_1 = ~var8;
                      stackIn_23_0 = stackOut_6_0;
                      stackIn_23_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 == stackIn_7_1) {
                              break L5;
                            } else {
                              L6: {
                                if (var8 == 0) {
                                  break L6;
                                } else {
                                  var3_array[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 1297401100;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var3_array[var7] = var5[var7];
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var3_array[var7] = var4[var7];
                          break L4;
                        }
                        var7++;
                        if (var9 == 0) {
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
              stackOut_22_0 = param1;
              stackOut_22_1 = 91;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              break L1;
            }
            L7: {
              if (stackIn_23_0 >= stackIn_23_1) {
                break L7;
              } else {
                int[] discarded$1 = ((gj) this).c(-97, -12);
                break L7;
              }
            }
            stackOut_26_0 = (int[]) var3_array;
            stackIn_27_0 = stackOut_26_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var3, "gj.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_27_0;
    }

    final static void a(byte param0, boolean param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              am.field_n = param3;
              vl.field_c = 0;
              ue.field_O = param2;
              if (al.a(am.field_n, (byte) -94)) {
                L2: {
                  L3: {
                    var4_int = 0;
                    if (am.field_n == 13) {
                      break L3;
                    } else {
                      if (am.field_n == 19) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4_int = 1;
                  break L2;
                }
                L4: {
                  if (am.field_n == 0) {
                    break L4;
                  } else {
                    if (am.field_n == 21) {
                      break L4;
                    } else {
                      if (am.field_n == 1) {
                        break L4;
                      } else {
                        if (2 == am.field_n) {
                          break L4;
                        } else {
                          if (am.field_n == 22) {
                            break L4;
                          } else {
                            if (3 == am.field_n) {
                              break L4;
                            } else {
                              if (am.field_n == 4) {
                                break L4;
                              } else {
                                var4_int = vp.a((byte) 76, am.field_n) - 1;
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (am.field_n != 7) {
                    break L5;
                  } else {
                    var4_int = 1;
                    break L5;
                  }
                }
                fh.field_y[am.field_n].a(-121, param1, var4_int);
                break L1;
              } else {
                break L1;
              }
            }
            var4_int = 72 % ((-10 - param0) / 41);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var4, "gj.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        cr var5_ref = null;
        cr var6 = null;
        cr var7 = null;
        cr var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        nj var17 = null;
        bs var18 = null;
        int var18_int = 0;
        int var19 = 0;
        cr stackIn_27_0 = null;
        cr stackIn_28_0 = null;
        cr stackIn_30_0 = null;
        cr stackIn_32_0 = null;
        cr stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_93_0 = 0;
        boolean stackIn_160_0 = false;
        int stackIn_195_0 = 0;
        boolean stackIn_221_0 = false;
        int stackIn_230_0 = 0;
        cr stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        cr stackIn_247_0 = null;
        int stackIn_247_1 = 0;
        cr stackIn_249_0 = null;
        int stackIn_249_1 = 0;
        cr stackIn_250_0 = null;
        int stackIn_250_1 = 0;
        cr stackIn_252_0 = null;
        int stackIn_252_1 = 0;
        cr stackIn_254_0 = null;
        int stackIn_254_1 = 0;
        cr stackIn_255_0 = null;
        int stackIn_255_1 = 0;
        int stackIn_255_2 = 0;
        cr stackIn_256_0 = null;
        int stackIn_256_1 = 0;
        cr stackIn_257_0 = null;
        int stackIn_257_1 = 0;
        cr stackIn_259_0 = null;
        int stackIn_259_1 = 0;
        cr stackIn_260_0 = null;
        int stackIn_260_1 = 0;
        cr stackIn_262_0 = null;
        int stackIn_262_1 = 0;
        cr stackIn_264_0 = null;
        int stackIn_264_1 = 0;
        cr stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        int stackIn_265_2 = 0;
        cr stackIn_266_0 = null;
        int stackIn_266_1 = 0;
        cr stackIn_267_0 = null;
        int stackIn_267_1 = 0;
        cr stackIn_269_0 = null;
        int stackIn_269_1 = 0;
        cr stackIn_270_0 = null;
        int stackIn_270_1 = 0;
        cr stackIn_272_0 = null;
        int stackIn_272_1 = 0;
        cr stackIn_274_0 = null;
        int stackIn_274_1 = 0;
        cr stackIn_275_0 = null;
        int stackIn_275_1 = 0;
        int stackIn_275_2 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        cr stackOut_26_0 = null;
        cr stackOut_27_0 = null;
        cr stackOut_28_0 = null;
        cr stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        cr stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_92_0 = 0;
        boolean stackOut_159_0 = false;
        int stackOut_194_0 = 0;
        boolean stackOut_220_0 = false;
        int stackOut_229_0 = 0;
        cr stackOut_245_0 = null;
        int stackOut_245_1 = 0;
        cr stackOut_246_0 = null;
        int stackOut_246_1 = 0;
        cr stackOut_247_0 = null;
        int stackOut_247_1 = 0;
        cr stackOut_249_0 = null;
        int stackOut_249_1 = 0;
        cr stackOut_250_0 = null;
        int stackOut_250_1 = 0;
        cr stackOut_252_0 = null;
        int stackOut_252_1 = 0;
        int stackOut_252_2 = 0;
        cr stackOut_254_0 = null;
        int stackOut_254_1 = 0;
        int stackOut_254_2 = 0;
        cr stackOut_255_0 = null;
        int stackOut_255_1 = 0;
        cr stackOut_256_0 = null;
        int stackOut_256_1 = 0;
        cr stackOut_257_0 = null;
        int stackOut_257_1 = 0;
        cr stackOut_259_0 = null;
        int stackOut_259_1 = 0;
        cr stackOut_260_0 = null;
        int stackOut_260_1 = 0;
        cr stackOut_262_0 = null;
        int stackOut_262_1 = 0;
        int stackOut_262_2 = 0;
        cr stackOut_264_0 = null;
        int stackOut_264_1 = 0;
        int stackOut_264_2 = 0;
        cr stackOut_265_0 = null;
        int stackOut_265_1 = 0;
        cr stackOut_266_0 = null;
        int stackOut_266_1 = 0;
        cr stackOut_267_0 = null;
        int stackOut_267_1 = 0;
        cr stackOut_269_0 = null;
        int stackOut_269_1 = 0;
        cr stackOut_270_0 = null;
        int stackOut_270_1 = 0;
        cr stackOut_272_0 = null;
        int stackOut_272_1 = 0;
        int stackOut_272_2 = 0;
        cr stackOut_274_0 = null;
        int stackOut_274_1 = 0;
        int stackOut_274_2 = 0;
        var19 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              hq.b(mp.field_b, -127);
              if (null != gd.field_j) {
                L2: {
                  L3: {
                    ne.field_G.field_lb = true;
                    var5_ref = fo.field_f;
                    fo.field_f.field_db = 0;
                    var5_ref.field_Fb = 0;
                    hd.field_g.field_db = 0;
                    var6 = hd.field_g;
                    var6.field_Fb = 0;
                    kk.field_f.field_db = 0;
                    var7 = kk.field_f;
                    var7.field_Fb = 0;
                    if (cn.b(false)) {
                      break L3;
                    } else {
                      var9_ref_String = gd.field_j.field_Nb;
                      ud.field_x.field_S = Vertigo2.a(new String[1], ie.field_Rb, 20).toUpperCase();
                      kk.field_f.a(88, lb.field_c.field_Fb, 40, -40 + lb.field_c.field_db, 0);
                      kk.field_f.field_S = Vertigo2.a(new String[1], od.field_Ob, 78);
                      var8 = kk.field_f;
                      if (var19 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      ud.field_x.field_S = fq.field_a.toUpperCase();
                      var9 = (2 + lb.field_c.field_Fb) / 2;
                      fo.field_f.a(93, var9 - 2, 40, lb.field_c.field_db - 40, 0);
                      if (~gd.field_j.field_uc >= ~gd.field_j.field_Qb) {
                        break L5;
                      } else {
                        fo.field_f.field_S = eh.field_g.toUpperCase();
                        fo.field_f.field_lb = true;
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    fo.field_f.field_S = fg.field_db.toUpperCase();
                    fo.field_f.field_lb = false;
                    break L4;
                  }
                  L6: {
                    fo.field_f.field_Bb = fb.field_u.field_Bb;
                    if (kk.field_j <= 0) {
                      break L6;
                    } else {
                      L7: {
                        L8: {
                          if (1 != kk.field_j) {
                            break L8;
                          } else {
                            var10_ref_String = e.field_l;
                            if (var19 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var10_ref_String = Vertigo2.a(new String[1], uo.field_c, 111);
                        break L7;
                      }
                      L9: {
                        if (0 != (lo.field_d & 16)) {
                          break L9;
                        } else {
                          if (!im.field_g) {
                            fo.field_f.field_Bb = fb.field_u.field_Q;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      fo.field_f.field_S = fo.field_f.field_S + "<br>" + var10_ref_String;
                      break L6;
                    }
                  }
                  L10: {
                    L11: {
                      hd.field_g.a(82, -var9 + lb.field_c.field_Fb, 40, lb.field_c.field_db - 40, var9);
                      hd.field_g.field_S = gm.field_a.toUpperCase();
                      stackOut_26_0 = hd.field_g;
                      stackIn_32_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (!param0) {
                        break L11;
                      } else {
                        stackOut_27_0 = (cr) (Object) stackIn_27_0;
                        stackIn_32_0 = stackOut_27_0;
                        stackIn_28_0 = stackOut_27_0;
                        if (r.field_h != 0L) {
                          break L11;
                        } else {
                          stackOut_28_0 = (cr) (Object) stackIn_28_0;
                          stackIn_30_0 = stackOut_28_0;
                          stackOut_30_0 = (cr) (Object) stackIn_30_0;
                          stackOut_30_1 = 1;
                          stackIn_33_0 = stackOut_30_0;
                          stackIn_33_1 = stackOut_30_1;
                          break L10;
                        }
                      }
                    }
                    stackOut_32_0 = (cr) (Object) stackIn_32_0;
                    stackOut_32_1 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    break L10;
                  }
                  L12: {
                    stackIn_33_0.field_lb = stackIn_33_1 != 0;
                    var8 = hd.field_g;
                    var10 = 2;
                    if (gr.field_W == null) {
                      break L12;
                    } else {
                      L13: {
                        if (null == e.field_c) {
                          e.field_c = new byte[ol.field_A];
                          mn.field_t = new boolean[ol.field_A];
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var11_int = 0;
                      L14: while (true) {
                        L15: {
                          L16: {
                            if (~ol.field_A >= ~var11_int) {
                              break L16;
                            } else {
                              mn.field_t[var11_int] = false;
                              var11_int++;
                              if (var19 != 0) {
                                break L15;
                              } else {
                                if (var19 == 0) {
                                  continue L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          var10 = 0;
                          break L15;
                        }
                        L17: while (true) {
                          L18: {
                            L19: {
                              if (2 <= var10) {
                                break L19;
                              } else {
                                var11_int = 0;
                                stackOut_48_0 = 0;
                                stackIn_93_0 = stackOut_48_0;
                                stackIn_49_0 = stackOut_48_0;
                                if (var19 != 0) {
                                  break L18;
                                } else {
                                  var12 = stackIn_49_0;
                                  L20: while (true) {
                                    stackOut_50_0 = gr.field_W.length;
                                    stackOut_50_1 = var12;
                                    stackIn_51_0 = stackOut_50_0;
                                    stackIn_51_1 = stackOut_50_1;
                                    L21: while (true) {
                                      L22: {
                                        L23: {
                                          if (stackIn_51_0 <= stackIn_51_1) {
                                            break L23;
                                          } else {
                                            var13_array = gr.field_W[var12];
                                            stackOut_52_0 = 0;
                                            stackIn_85_0 = stackOut_52_0;
                                            stackIn_53_0 = stackOut_52_0;
                                            if (var19 != 0) {
                                              break L22;
                                            } else {
                                              var14_int = stackIn_53_0;
                                              L24: while (true) {
                                                L25: {
                                                  L26: {
                                                    L27: {
                                                      if (~var13_array.length >= ~var14_int) {
                                                        break L27;
                                                      } else {
                                                        var15 = var13_array[var14_int];
                                                        var16 = var13_array[var14_int + 1];
                                                        stackOut_55_0 = var15;
                                                        stackOut_55_1 = -1;
                                                        stackIn_77_0 = stackOut_55_0;
                                                        stackIn_77_1 = stackOut_55_1;
                                                        stackIn_56_0 = stackOut_55_0;
                                                        stackIn_56_1 = stackOut_55_1;
                                                        if (var19 != 0) {
                                                          break L26;
                                                        } else {
                                                          L28: {
                                                            if (stackIn_56_0 == stackIn_56_1) {
                                                              L29: {
                                                                if (var10 == 0) {
                                                                  stackOut_67_0 = gd.field_j.field_uc;
                                                                  stackIn_68_0 = stackOut_67_0;
                                                                  break L29;
                                                                } else {
                                                                  stackOut_65_0 = gd.field_j.field_Qb;
                                                                  stackIn_68_0 = stackOut_65_0;
                                                                  break L29;
                                                                }
                                                              }
                                                              var17_int = stackIn_68_0;
                                                              if (var16 == var17_int) {
                                                                break L28;
                                                              } else {
                                                                if (var19 == 0) {
                                                                  break L25;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                            } else {
                                                              if ((255 & gd.field_j.field_fc[var15]) != var16) {
                                                                break L25;
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          }
                                                          var14_int += 2;
                                                          if (var19 == 0) {
                                                            continue L24;
                                                          } else {
                                                            break L27;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var11_int = 1;
                                                    var14_int = -1;
                                                    var15 = 0;
                                                    stackOut_76_0 = var15;
                                                    stackOut_76_1 = var13_array.length;
                                                    stackIn_77_0 = stackOut_76_0;
                                                    stackIn_77_1 = stackOut_76_1;
                                                    break L26;
                                                  }
                                                  L30: while (true) {
                                                    L31: {
                                                      if (stackIn_77_0 >= stackIn_77_1) {
                                                        break L31;
                                                      } else {
                                                        var16 = var13_array[var15];
                                                        stackOut_78_0 = var16;
                                                        stackOut_78_1 = var14_int;
                                                        stackIn_51_0 = stackOut_78_0;
                                                        stackIn_51_1 = stackOut_78_1;
                                                        stackIn_79_0 = stackOut_78_0;
                                                        stackIn_79_1 = stackOut_78_1;
                                                        if (var19 != 0) {
                                                          continue L21;
                                                        } else {
                                                          L32: {
                                                            if (stackIn_79_0 <= stackIn_79_1) {
                                                              break L32;
                                                            } else {
                                                              var14_int = var16;
                                                              break L32;
                                                            }
                                                          }
                                                          var15 += 2;
                                                          if (var19 == 0) {
                                                            stackOut_76_0 = var15;
                                                            stackOut_76_1 = var13_array.length;
                                                            stackIn_77_0 = stackOut_76_0;
                                                            stackIn_77_1 = stackOut_76_1;
                                                            continue L30;
                                                          } else {
                                                            break L31;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    mn.field_t[var14_int] = true;
                                                    break L25;
                                                  }
                                                }
                                                var12++;
                                                if (var19 == 0) {
                                                  continue L20;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_84_0 = var11_int;
                                        stackIn_85_0 = stackOut_84_0;
                                        break L22;
                                      }
                                      L33: {
                                        if (stackIn_85_0 == 0) {
                                          break L33;
                                        } else {
                                          if (var19 == 0) {
                                            break L19;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      }
                                      var10++;
                                      if (var19 == 0) {
                                        continue L17;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_92_0 = 2;
                            stackIn_93_0 = stackOut_92_0;
                            break L18;
                          }
                          if (stackIn_93_0 > fn.field_z) {
                            break L12;
                          } else {
                            if (!cr.field_eb[12]) {
                              break L12;
                            } else {
                              var10 = 2;
                              break L12;
                            }
                          }
                        }
                      }
                    }
                  }
                  L34: {
                    if (var10 < 2) {
                      break L34;
                    } else {
                      L35: {
                        if (sf.field_f != null) {
                          break L35;
                        } else {
                          if (te.field_D != null) {
                            break L35;
                          } else {
                            if (qh.field_e != null) {
                              break L35;
                            } else {
                              if (null != il.field_b) {
                                break L35;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                      var11_int = 0;
                      var12 = 0;
                      var13_int = 0;
                      var14_int = 0;
                      var15 = 0;
                      var16 = 0;
                      L36: while (true) {
                        L37: {
                          L38: {
                            if (var16 >= ol.field_A) {
                              break L38;
                            } else {
                              var17_int = 255 & gd.field_j.field_fc[var16];
                              if (var19 != 0) {
                                break L37;
                              } else {
                                L39: {
                                  if (sf.field_f == null) {
                                    break L39;
                                  } else {
                                    if (sf.field_f[var16] == null) {
                                      break L39;
                                    } else {
                                      if (sf.field_f[var16][var17_int]) {
                                        var11_int = 1;
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                }
                                L40: {
                                  if (null == te.field_D) {
                                    break L40;
                                  } else {
                                    if (te.field_D[var16] == null) {
                                      break L40;
                                    } else {
                                      L41: {
                                        var18_int = te.field_D[var16][var17_int];
                                        if (~var13_int <= ~var18_int) {
                                          break L41;
                                        } else {
                                          var13_int = var18_int;
                                          break L41;
                                        }
                                      }
                                      if (var18_int == 0) {
                                        break L40;
                                      } else {
                                        if (vb.field_g) {
                                          break L40;
                                        } else {
                                          var11_int = 1;
                                          break L40;
                                        }
                                      }
                                    }
                                  }
                                }
                                L42: {
                                  if (il.field_b == null) {
                                    break L42;
                                  } else {
                                    if (null == il.field_b[var16]) {
                                      break L42;
                                    } else {
                                      var15 = var15 | il.field_b[var16][var17_int];
                                      break L42;
                                    }
                                  }
                                }
                                L43: {
                                  if (null == qh.field_e) {
                                    break L43;
                                  } else {
                                    if (null == qh.field_e[var16]) {
                                      break L43;
                                    } else {
                                      L44: {
                                        var18_int = qh.field_e[var16][var17_int];
                                        if (var18_int == 0) {
                                          break L44;
                                        } else {
                                          if (vb.field_g) {
                                            break L44;
                                          } else {
                                            var11_int = 1;
                                            break L44;
                                          }
                                        }
                                      }
                                      if (~var14_int <= ~var18_int) {
                                        break L43;
                                      } else {
                                        var14_int = var18_int;
                                        break L43;
                                      }
                                    }
                                  }
                                }
                                var16++;
                                if (var19 == 0) {
                                  continue L36;
                                } else {
                                  break L38;
                                }
                              }
                            }
                          }
                          var16 = 0;
                          break L37;
                        }
                        var17 = vd.field_d.field_Nb.field_M;
                        var18 = (bs) (Object) var17.a((byte) 100);
                        L45: while (true) {
                          L46: {
                            L47: {
                              if (var18 == null) {
                                break L47;
                              } else {
                                stackOut_159_0 = var18.k(param3 + 15);
                                stackIn_195_0 = stackOut_159_0 ? 1 : 0;
                                stackIn_160_0 = stackOut_159_0;
                                if (var19 != 0) {
                                  break L46;
                                } else {
                                  L48: {
                                    L49: {
                                      if (!stackIn_160_0) {
                                        break L49;
                                      } else {
                                        if (var19 == 0) {
                                          break L48;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                    L50: {
                                      if (var11_int == 0) {
                                        break L50;
                                      } else {
                                        if (var18.field_Zb) {
                                          break L50;
                                        } else {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L47;
                                          } else {
                                            break L50;
                                          }
                                        }
                                      }
                                    }
                                    L51: {
                                      if (~var18.field_Rb > ~var13_int) {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L47;
                                        } else {
                                          break L51;
                                        }
                                      } else {
                                        break L51;
                                      }
                                    }
                                    L52: {
                                      if (~var18.field_Mb > ~var14_int) {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L47;
                                        } else {
                                          break L52;
                                        }
                                      } else {
                                        break L52;
                                      }
                                    }
                                    L53: {
                                      if ((var15 & ~var18.field_Kb) <= 0) {
                                        break L53;
                                      } else {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L47;
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                    if (var12 == 0) {
                                      break L48;
                                    } else {
                                      var16 = 1;
                                      if (var19 == 0) {
                                        break L47;
                                      } else {
                                        break L48;
                                      }
                                    }
                                  }
                                  var18 = (bs) (Object) var17.b(35);
                                  if (var19 == 0) {
                                    continue L45;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                            }
                            stackOut_194_0 = fn.field_z;
                            stackIn_195_0 = stackOut_194_0;
                            break L46;
                          }
                          L54: {
                            if (stackIn_195_0 < 2) {
                              break L54;
                            } else {
                              if (cr.field_eb[12]) {
                                var16 = 0;
                                break L54;
                              } else {
                                break L54;
                              }
                            }
                          }
                          L55: {
                            if (var16 != 0) {
                              hd.field_g.field_lb = false;
                              if (hd.field_g.field_G) {
                                L56: {
                                  if (el.field_e.field_b.field_Kb == 0) {
                                    break L56;
                                  } else {
                                    ko.field_S = Vertigo2.a(new String[1], pb.field_e, param3 ^ -117);
                                    if (var19 == 0) {
                                      break L55;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                                ko.field_S = di.field_y;
                                break L55;
                              } else {
                                break L55;
                              }
                            } else {
                              break L55;
                            }
                          }
                          if (var19 == 0) {
                            break L2;
                          } else {
                            break L34;
                          }
                        }
                      }
                    }
                  }
                  hd.field_g.field_lb = false;
                  if (!hd.field_g.field_G) {
                    break L2;
                  } else {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    L57: while (true) {
                      L58: {
                        L59: {
                          if (~var13_int <= ~ol.field_A) {
                            break L59;
                          } else {
                            stackOut_220_0 = mn.field_t[var13_int];
                            stackIn_230_0 = stackOut_220_0 ? 1 : 0;
                            stackIn_221_0 = stackOut_220_0;
                            if (var19 != 0) {
                              break L58;
                            } else {
                              L60: {
                                if (stackIn_221_0) {
                                  L61: {
                                    var14 = "<col=A00000>" + md.field_C[var13_int] + "</col>";
                                    if (var11 == null) {
                                      break L61;
                                    } else {
                                      var12 = 1;
                                      var11 = (Object) (Object) ((String) var11 + ", " + var14);
                                      if (var19 == 0) {
                                        break L60;
                                      } else {
                                        break L61;
                                      }
                                    }
                                  }
                                  var11 = (Object) (Object) var14;
                                  break L60;
                                } else {
                                  break L60;
                                }
                              }
                              var13_int++;
                              if (var19 == 0) {
                                continue L57;
                              } else {
                                break L59;
                              }
                            }
                          }
                        }
                        stackOut_229_0 = -1;
                        stackIn_230_0 = stackOut_229_0;
                        break L58;
                      }
                      L62: {
                        if (stackIn_230_0 != ~var10) {
                          L63: {
                            var13 = lo.field_a;
                            if (var12 == 0) {
                              break L63;
                            } else {
                              var14 = ni.field_e + (String) var11;
                              if (var19 == 0) {
                                break L62;
                              } else {
                                break L63;
                              }
                            }
                          }
                          var14 = Vertigo2.a(new String[1], eg.field_q, -123);
                          break L62;
                        } else {
                          L64: {
                            var13 = rn.field_y;
                            if (var12 != 0) {
                              break L64;
                            } else {
                              var14 = Vertigo2.a(new String[1], fa.field_t, 14);
                              if (var19 == 0) {
                                break L62;
                              } else {
                                break L64;
                              }
                            }
                          }
                          var14 = ia.field_H + (String) var11;
                          break L62;
                        }
                      }
                      ko.field_S = "<col=A00000>" + var13 + "<br>" + var14;
                      break L2;
                    }
                  }
                }
                L65: {
                  if (r.field_h == 0L) {
                    break L65;
                  } else {
                    L66: {
                      var9 = (int)(r.field_h + -gk.a(param3 + 108));
                      var9 = (var9 + 999) / 1000;
                      if (var9 < 1) {
                        var9 = 1;
                        break L66;
                      } else {
                        break L66;
                      }
                    }
                    var8.field_S = Vertigo2.a(new String[1], me.field_a, param3 ^ 89);
                    break L65;
                  }
                }
                nb.field_D.field_S = Vertigo2.a(new String[2], nq.field_I, 9);
                break L1;
              } else {
                break L1;
              }
            }
            L67: {
              L68: {
                stackOut_245_0 = hk.field_o;
                stackOut_245_1 = 0;
                stackIn_254_0 = stackOut_245_0;
                stackIn_254_1 = stackOut_245_1;
                stackIn_246_0 = stackOut_245_0;
                stackIn_246_1 = stackOut_245_1;
                if (!param4) {
                  break L68;
                } else {
                  stackOut_246_0 = (cr) (Object) stackIn_246_0;
                  stackOut_246_1 = stackIn_246_1;
                  stackIn_254_0 = stackOut_246_0;
                  stackIn_254_1 = stackOut_246_1;
                  stackIn_247_0 = stackOut_246_0;
                  stackIn_247_1 = stackOut_246_1;
                  if (param2) {
                    break L68;
                  } else {
                    stackOut_247_0 = (cr) (Object) stackIn_247_0;
                    stackOut_247_1 = stackIn_247_1;
                    stackIn_249_0 = stackOut_247_0;
                    stackIn_249_1 = stackOut_247_1;
                    stackOut_249_0 = (cr) (Object) stackIn_249_0;
                    stackOut_249_1 = stackIn_249_1;
                    stackIn_254_0 = stackOut_249_0;
                    stackIn_254_1 = stackOut_249_1;
                    stackIn_250_0 = stackOut_249_0;
                    stackIn_250_1 = stackOut_249_1;
                    if (im.field_g) {
                      break L68;
                    } else {
                      stackOut_250_0 = (cr) (Object) stackIn_250_0;
                      stackOut_250_1 = stackIn_250_1;
                      stackIn_252_0 = stackOut_250_0;
                      stackIn_252_1 = stackOut_250_1;
                      stackOut_252_0 = (cr) (Object) stackIn_252_0;
                      stackOut_252_1 = stackIn_252_1;
                      stackOut_252_2 = 1;
                      stackIn_255_0 = stackOut_252_0;
                      stackIn_255_1 = stackOut_252_1;
                      stackIn_255_2 = stackOut_252_2;
                      break L67;
                    }
                  }
                }
              }
              stackOut_254_0 = (cr) (Object) stackIn_254_0;
              stackOut_254_1 = stackIn_254_1;
              stackOut_254_2 = 0;
              stackIn_255_0 = stackOut_254_0;
              stackIn_255_1 = stackOut_254_1;
              stackIn_255_2 = stackOut_254_2;
              break L67;
            }
            L69: {
              L70: {
                ((cr) (Object) stackIn_255_0).a(stackIn_255_1, stackIn_255_2 != 0);
                stackOut_255_0 = lb.field_c;
                stackOut_255_1 = 0;
                stackIn_264_0 = stackOut_255_0;
                stackIn_264_1 = stackOut_255_1;
                stackIn_256_0 = stackOut_255_0;
                stackIn_256_1 = stackOut_255_1;
                if (!param4) {
                  break L70;
                } else {
                  stackOut_256_0 = (cr) (Object) stackIn_256_0;
                  stackOut_256_1 = stackIn_256_1;
                  stackIn_264_0 = stackOut_256_0;
                  stackIn_264_1 = stackOut_256_1;
                  stackIn_257_0 = stackOut_256_0;
                  stackIn_257_1 = stackOut_256_1;
                  if (param2) {
                    break L70;
                  } else {
                    stackOut_257_0 = (cr) (Object) stackIn_257_0;
                    stackOut_257_1 = stackIn_257_1;
                    stackIn_259_0 = stackOut_257_0;
                    stackIn_259_1 = stackOut_257_1;
                    stackOut_259_0 = (cr) (Object) stackIn_259_0;
                    stackOut_259_1 = stackIn_259_1;
                    stackIn_264_0 = stackOut_259_0;
                    stackIn_264_1 = stackOut_259_1;
                    stackIn_260_0 = stackOut_259_0;
                    stackIn_260_1 = stackOut_259_1;
                    if (im.field_g) {
                      break L70;
                    } else {
                      stackOut_260_0 = (cr) (Object) stackIn_260_0;
                      stackOut_260_1 = stackIn_260_1;
                      stackIn_262_0 = stackOut_260_0;
                      stackIn_262_1 = stackOut_260_1;
                      stackOut_262_0 = (cr) (Object) stackIn_262_0;
                      stackOut_262_1 = stackIn_262_1;
                      stackOut_262_2 = 1;
                      stackIn_265_0 = stackOut_262_0;
                      stackIn_265_1 = stackOut_262_1;
                      stackIn_265_2 = stackOut_262_2;
                      break L69;
                    }
                  }
                }
              }
              stackOut_264_0 = (cr) (Object) stackIn_264_0;
              stackOut_264_1 = stackIn_264_1;
              stackOut_264_2 = 0;
              stackIn_265_0 = stackOut_264_0;
              stackIn_265_1 = stackOut_264_1;
              stackIn_265_2 = stackOut_264_2;
              break L69;
            }
            L71: {
              L72: {
                ((cr) (Object) stackIn_265_0).a(stackIn_265_1, stackIn_265_2 != 0);
                stackOut_265_0 = wc.field_m;
                stackOut_265_1 = param3;
                stackIn_274_0 = stackOut_265_0;
                stackIn_274_1 = stackOut_265_1;
                stackIn_266_0 = stackOut_265_0;
                stackIn_266_1 = stackOut_265_1;
                if (!param4) {
                  break L72;
                } else {
                  stackOut_266_0 = (cr) (Object) stackIn_266_0;
                  stackOut_266_1 = stackIn_266_1;
                  stackIn_274_0 = stackOut_266_0;
                  stackIn_274_1 = stackOut_266_1;
                  stackIn_267_0 = stackOut_266_0;
                  stackIn_267_1 = stackOut_266_1;
                  if (param2) {
                    break L72;
                  } else {
                    stackOut_267_0 = (cr) (Object) stackIn_267_0;
                    stackOut_267_1 = stackIn_267_1;
                    stackIn_269_0 = stackOut_267_0;
                    stackIn_269_1 = stackOut_267_1;
                    stackOut_269_0 = (cr) (Object) stackIn_269_0;
                    stackOut_269_1 = stackIn_269_1;
                    stackIn_274_0 = stackOut_269_0;
                    stackIn_274_1 = stackOut_269_1;
                    stackIn_270_0 = stackOut_269_0;
                    stackIn_270_1 = stackOut_269_1;
                    if (!im.field_g) {
                      break L72;
                    } else {
                      stackOut_270_0 = (cr) (Object) stackIn_270_0;
                      stackOut_270_1 = stackIn_270_1;
                      stackIn_272_0 = stackOut_270_0;
                      stackIn_272_1 = stackOut_270_1;
                      stackOut_272_0 = (cr) (Object) stackIn_272_0;
                      stackOut_272_1 = stackIn_272_1;
                      stackOut_272_2 = 1;
                      stackIn_275_0 = stackOut_272_0;
                      stackIn_275_1 = stackOut_272_1;
                      stackIn_275_2 = stackOut_272_2;
                      break L71;
                    }
                  }
                }
              }
              stackOut_274_0 = (cr) (Object) stackIn_274_0;
              stackOut_274_1 = stackIn_274_1;
              stackOut_274_2 = 0;
              stackIn_275_0 = stackOut_274_0;
              stackIn_275_1 = stackOut_274_1;
              stackIn_275_2 = stackOut_274_2;
              break L71;
            }
            L73: {
              ((cr) (Object) stackIn_275_0).a(stackIn_275_1, stackIn_275_2 != 0);
              el.field_e.field_b.k(0);
              if (gd.field_j == null) {
                break L73;
              } else {
                L74: {
                  if (ne.field_G.field_tb == 0) {
                    break L74;
                  } else {
                    qk.d(gd.field_j.a((byte) -38), param1, 18964);
                    break L74;
                  }
                }
                L75: {
                  if (hd.field_g.field_tb == 0) {
                    break L75;
                  } else {
                    na.field_p = true;
                    break L75;
                  }
                }
                L76: {
                  if (fo.field_f.field_tb != 0) {
                    im.field_g = true;
                    break L76;
                  } else {
                    break L76;
                  }
                }
                L77: {
                  if (Vertigo2.field_M.field_tb != 0) {
                    im.field_g = false;
                    break L77;
                  } else {
                    break L77;
                  }
                }
                mg.a(false, param1, false, gd.field_j);
                break L73;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var5, "gj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != 0) {
                break L1;
              } else {
                L2: {
                  stackOut_1_0 = this;
                  stackIn_6_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (1 != param2.h(-11)) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L2;
                  } else {
                    stackOut_2_0 = this;
                    stackIn_4_0 = stackOut_2_0;
                    stackOut_4_0 = this;
                    stackOut_4_1 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_7_1 = stackOut_4_1;
                    break L2;
                  }
                }
                ((gj) this).field_o = stackIn_7_1 != 0;
                break L1;
              }
            }
            L3: {
              if (param0 == 110) {
                break L3;
              } else {
                int[] discarded$2 = ((gj) this).c(-57, -56);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("gj.C(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -68) {
                break L1;
              } else {
                gj.b((byte) -14);
                break L1;
              }
            }
            field_z = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "gj.B(" + param0 + ')');
        }
    }

    static {
    }
}
