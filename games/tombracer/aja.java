/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aja extends lea {
    static String field_G;
    static int field_H;
    static String field_I;

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        ue var5 = null;
        mfa var6 = null;
        kga var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = super.a(param0, param1, param2);
            var5 = new ue(param2, param0);
            var5.a(2, false);
            var4.a((byte) 83, (nv) (Object) var5);
            var6 = rm.field_a;
            var7 = (kga) (Object) var6.a(12, 125);
            var7.b((byte) 123, 1);
            var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
            stackOut_0_0 = (fsa) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("aja.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
        return stackIn_1_0;
    }

    aja(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        jea var5_ref = null;
        jea var6 = null;
        jea var7 = null;
        jea var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref_String = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vna var17 = null;
        pha var18 = null;
        int var18_int = 0;
        int var19 = 0;
        jea stackIn_25_0 = null;
        jea stackIn_26_0 = null;
        jea stackIn_28_0 = null;
        jea stackIn_30_0 = null;
        jea stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_87_0 = 0;
        boolean stackIn_99_0 = false;
        int stackIn_107_0 = 0;
        boolean stackIn_182_0 = false;
        int stackIn_217_0 = 0;
        jea stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        jea stackIn_247_0 = null;
        int stackIn_247_1 = 0;
        jea stackIn_249_0 = null;
        int stackIn_249_1 = 0;
        jea stackIn_250_0 = null;
        int stackIn_250_1 = 0;
        jea stackIn_252_0 = null;
        int stackIn_252_1 = 0;
        jea stackIn_254_0 = null;
        int stackIn_254_1 = 0;
        jea stackIn_255_0 = null;
        int stackIn_255_1 = 0;
        int stackIn_255_2 = 0;
        jea stackIn_256_0 = null;
        int stackIn_256_1 = 0;
        jea stackIn_257_0 = null;
        int stackIn_257_1 = 0;
        jea stackIn_259_0 = null;
        int stackIn_259_1 = 0;
        jea stackIn_260_0 = null;
        int stackIn_260_1 = 0;
        jea stackIn_262_0 = null;
        int stackIn_262_1 = 0;
        jea stackIn_264_0 = null;
        int stackIn_264_1 = 0;
        jea stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        int stackIn_265_2 = 0;
        jea stackIn_266_0 = null;
        int stackIn_266_1 = 0;
        jea stackIn_267_0 = null;
        int stackIn_267_1 = 0;
        jea stackIn_269_0 = null;
        int stackIn_269_1 = 0;
        jea stackIn_270_0 = null;
        int stackIn_270_1 = 0;
        jea stackIn_272_0 = null;
        int stackIn_272_1 = 0;
        jea stackIn_274_0 = null;
        int stackIn_274_1 = 0;
        jea stackIn_275_0 = null;
        int stackIn_275_1 = 0;
        int stackIn_275_2 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        jea stackOut_24_0 = null;
        jea stackOut_25_0 = null;
        jea stackOut_26_0 = null;
        jea stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        jea stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_86_0 = 0;
        boolean stackOut_98_0 = false;
        int stackOut_106_0 = 0;
        boolean stackOut_181_0 = false;
        int stackOut_216_0 = 0;
        jea stackOut_245_0 = null;
        int stackOut_245_1 = 0;
        jea stackOut_246_0 = null;
        int stackOut_246_1 = 0;
        jea stackOut_247_0 = null;
        int stackOut_247_1 = 0;
        jea stackOut_249_0 = null;
        int stackOut_249_1 = 0;
        jea stackOut_250_0 = null;
        int stackOut_250_1 = 0;
        jea stackOut_252_0 = null;
        int stackOut_252_1 = 0;
        int stackOut_252_2 = 0;
        jea stackOut_254_0 = null;
        int stackOut_254_1 = 0;
        int stackOut_254_2 = 0;
        jea stackOut_255_0 = null;
        int stackOut_255_1 = 0;
        jea stackOut_256_0 = null;
        int stackOut_256_1 = 0;
        jea stackOut_257_0 = null;
        int stackOut_257_1 = 0;
        jea stackOut_259_0 = null;
        int stackOut_259_1 = 0;
        jea stackOut_260_0 = null;
        int stackOut_260_1 = 0;
        jea stackOut_262_0 = null;
        int stackOut_262_1 = 0;
        int stackOut_262_2 = 0;
        jea stackOut_264_0 = null;
        int stackOut_264_1 = 0;
        int stackOut_264_2 = 0;
        jea stackOut_265_0 = null;
        int stackOut_265_1 = 0;
        jea stackOut_266_0 = null;
        int stackOut_266_1 = 0;
        jea stackOut_267_0 = null;
        int stackOut_267_1 = 0;
        jea stackOut_269_0 = null;
        int stackOut_269_1 = 0;
        jea stackOut_270_0 = null;
        int stackOut_270_1 = 0;
        jea stackOut_272_0 = null;
        int stackOut_272_1 = 0;
        int stackOut_272_2 = 0;
        jea stackOut_274_0 = null;
        int stackOut_274_1 = 0;
        int stackOut_274_2 = 0;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              dga.a(fp.field_e, 199);
              if (null != uu.field_a) {
                L2: {
                  L3: {
                    bc.field_b.field_X = true;
                    var5_ref = pk.field_z;
                    pk.field_z.field_t = 0;
                    var5_ref.field_G = 0;
                    var6 = hw.field_a;
                    hw.field_a.field_t = 0;
                    var6.field_G = 0;
                    var7 = dl.field_t;
                    dl.field_t.field_t = 0;
                    var7.field_G = 0;
                    if (!mka.b(param1 + 8193)) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          wf.field_g.field_r = una.field_d.toUpperCase();
                          var9 = (2 + dka.field_b.field_G) / 2;
                          pk.field_z.a(-2 + var9, 40, -23776, -40 + dka.field_b.field_t, 0);
                          if (~uu.field_a.field_Mb > ~uu.field_a.field_Jb) {
                            break L5;
                          } else {
                            pk.field_z.field_r = ml.field_c.toUpperCase();
                            pk.field_z.field_X = false;
                            if (var19 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        pk.field_z.field_r = eu.field_b.toUpperCase();
                        pk.field_z.field_X = true;
                        break L4;
                      }
                      L6: {
                        pk.field_z.field_w = hg.field_g.field_w;
                        if (so.field_K > 0) {
                          L7: {
                            L8: {
                              if (1 != so.field_K) {
                                break L8;
                              } else {
                                var10_ref_String = sj.field_a;
                                if (var19 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var10_ref_String = gl.a((byte) 84, ld.field_f, new String[1]);
                            break L7;
                          }
                          L9: {
                            if ((lh.field_a & 16) != 0) {
                              break L9;
                            } else {
                              if (tla.field_e) {
                                break L9;
                              } else {
                                pk.field_z.field_w = hg.field_g.field_C;
                                break L9;
                              }
                            }
                          }
                          pk.field_z.field_r = pk.field_z.field_r + "<br>" + var10_ref_String;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L10: {
                        L11: {
                          hw.field_a.a(dka.field_b.field_G + -var9, 40, -23776, dka.field_b.field_t - 40, var9);
                          hw.field_a.field_r = ki.field_p.toUpperCase();
                          var8 = hw.field_a;
                          stackOut_24_0 = hw.field_a;
                          stackIn_30_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (!param3) {
                            break L11;
                          } else {
                            stackOut_25_0 = (jea) (Object) stackIn_25_0;
                            stackIn_30_0 = stackOut_25_0;
                            stackIn_26_0 = stackOut_25_0;
                            if (uq.field_d != 0L) {
                              break L11;
                            } else {
                              stackOut_26_0 = (jea) (Object) stackIn_26_0;
                              stackIn_28_0 = stackOut_26_0;
                              stackOut_28_0 = (jea) (Object) stackIn_28_0;
                              stackOut_28_1 = 1;
                              stackIn_31_0 = stackOut_28_0;
                              stackIn_31_1 = stackOut_28_1;
                              break L10;
                            }
                          }
                        }
                        stackOut_30_0 = (jea) (Object) stackIn_30_0;
                        stackOut_30_1 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        break L10;
                      }
                      L12: {
                        stackIn_31_0.field_X = stackIn_31_1 != 0;
                        var10 = 2;
                        if (null != ce.field_A) {
                          L13: {
                            if (tba.field_m != null) {
                              break L13;
                            } else {
                              tba.field_m = new byte[fk.field_b];
                              sda.field_f = new boolean[fk.field_b];
                              break L13;
                            }
                          }
                          var11 = 0;
                          L14: while (true) {
                            L15: {
                              L16: {
                                if (~var11 <= ~fk.field_b) {
                                  break L16;
                                } else {
                                  sda.field_f[var11] = false;
                                  var11++;
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
                                  if (var10 >= 2) {
                                    break L19;
                                  } else {
                                    var11 = 0;
                                    stackOut_45_0 = 0;
                                    stackIn_87_0 = stackOut_45_0;
                                    stackIn_46_0 = stackOut_45_0;
                                    if (var19 != 0) {
                                      break L18;
                                    } else {
                                      var12 = stackIn_46_0;
                                      L20: while (true) {
                                        stackOut_47_0 = ce.field_A.length;
                                        stackOut_47_1 = var12;
                                        stackIn_48_0 = stackOut_47_0;
                                        stackIn_48_1 = stackOut_47_1;
                                        L21: while (true) {
                                          L22: {
                                            L23: {
                                              if (stackIn_48_0 <= stackIn_48_1) {
                                                break L23;
                                              } else {
                                                var13_ref_int__ = ce.field_A[var12];
                                                stackOut_49_0 = 0;
                                                stackIn_82_0 = stackOut_49_0;
                                                stackIn_50_0 = stackOut_49_0;
                                                if (var19 != 0) {
                                                  break L22;
                                                } else {
                                                  var14 = stackIn_50_0;
                                                  L24: while (true) {
                                                    L25: {
                                                      L26: {
                                                        L27: {
                                                          if (var13_ref_int__.length <= var14) {
                                                            break L27;
                                                          } else {
                                                            var15 = var13_ref_int__[var14];
                                                            var16 = var13_ref_int__[1 + var14];
                                                            stackOut_52_0 = 0;
                                                            stackOut_52_1 = ~var15;
                                                            stackIn_74_0 = stackOut_52_0;
                                                            stackIn_74_1 = stackOut_52_1;
                                                            stackIn_53_0 = stackOut_52_0;
                                                            stackIn_53_1 = stackOut_52_1;
                                                            if (var19 != 0) {
                                                              break L26;
                                                            } else {
                                                              L28: {
                                                                if (stackIn_53_0 == stackIn_53_1) {
                                                                  L29: {
                                                                    if (var10 != 0) {
                                                                      stackOut_64_0 = uu.field_a.field_Mb;
                                                                      stackIn_65_0 = stackOut_64_0;
                                                                      break L29;
                                                                    } else {
                                                                      stackOut_62_0 = uu.field_a.field_Jb;
                                                                      stackIn_65_0 = stackOut_62_0;
                                                                      break L29;
                                                                    }
                                                                  }
                                                                  var17_int = stackIn_65_0;
                                                                  if (~var17_int == ~var16) {
                                                                    break L28;
                                                                  } else {
                                                                    if (var19 == 0) {
                                                                      break L25;
                                                                    } else {
                                                                      break L28;
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (~var16 != ~(255 & uu.field_a.field_ac[var15])) {
                                                                    break L25;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                              }
                                                              var14 += 2;
                                                              if (var19 == 0) {
                                                                continue L24;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var11 = 1;
                                                        var14 = -1;
                                                        var15 = 0;
                                                        stackOut_73_0 = var13_ref_int__.length;
                                                        stackOut_73_1 = var15;
                                                        stackIn_74_0 = stackOut_73_0;
                                                        stackIn_74_1 = stackOut_73_1;
                                                        break L26;
                                                      }
                                                      L30: while (true) {
                                                        L31: {
                                                          if (stackIn_74_0 <= stackIn_74_1) {
                                                            break L31;
                                                          } else {
                                                            var16 = var13_ref_int__[var15];
                                                            stackOut_75_0 = ~var14;
                                                            stackOut_75_1 = ~var16;
                                                            stackIn_48_0 = stackOut_75_0;
                                                            stackIn_48_1 = stackOut_75_1;
                                                            stackIn_76_0 = stackOut_75_0;
                                                            stackIn_76_1 = stackOut_75_1;
                                                            if (var19 != 0) {
                                                              continue L21;
                                                            } else {
                                                              L32: {
                                                                if (stackIn_76_0 <= stackIn_76_1) {
                                                                  break L32;
                                                                } else {
                                                                  var14 = var16;
                                                                  break L32;
                                                                }
                                                              }
                                                              var15 += 2;
                                                              if (var19 == 0) {
                                                                stackOut_73_0 = var13_ref_int__.length;
                                                                stackOut_73_1 = var15;
                                                                stackIn_74_0 = stackOut_73_0;
                                                                stackIn_74_1 = stackOut_73_1;
                                                                continue L30;
                                                              } else {
                                                                break L31;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        sda.field_f[var14] = true;
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
                                            stackOut_81_0 = var11;
                                            stackIn_82_0 = stackOut_81_0;
                                            break L22;
                                          }
                                          if (stackIn_82_0 != 0) {
                                            break L19;
                                          } else {
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
                                }
                                stackOut_86_0 = 2;
                                stackIn_87_0 = stackOut_86_0;
                                break L18;
                              }
                              if (stackIn_87_0 > ld.field_e) {
                                break L12;
                              } else {
                                if (!oj.field_tb[12]) {
                                  break L12;
                                } else {
                                  var10 = 2;
                                  break L12;
                                }
                              }
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                      L33: {
                        L34: {
                          if (var10 >= 2) {
                            break L34;
                          } else {
                            hw.field_a.field_X = false;
                            if (!hw.field_a.field_pb) {
                              break L33;
                            } else {
                              var11_ref = null;
                              var12 = 0;
                              var13 = 0;
                              L35: while (true) {
                                L36: {
                                  L37: {
                                    if (var13 >= fk.field_b) {
                                      break L37;
                                    } else {
                                      stackOut_98_0 = sda.field_f[var13];
                                      stackIn_107_0 = stackOut_98_0 ? 1 : 0;
                                      stackIn_99_0 = stackOut_98_0;
                                      if (var19 != 0) {
                                        break L36;
                                      } else {
                                        L38: {
                                          if (!stackIn_99_0) {
                                            break L38;
                                          } else {
                                            L39: {
                                              var14_ref_String = "<col=A00000>" + kma.field_e[var13] + "</col>";
                                              if (null != var11_ref) {
                                                break L39;
                                              } else {
                                                var11_ref = (Object) (Object) var14_ref_String;
                                                if (var19 == 0) {
                                                  break L38;
                                                } else {
                                                  break L39;
                                                }
                                              }
                                            }
                                            var11_ref = (Object) (Object) ((String) var11_ref + ", " + var14_ref_String);
                                            var12 = 1;
                                            break L38;
                                          }
                                        }
                                        var13++;
                                        if (var19 == 0) {
                                          continue L35;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_106_0 = var10;
                                  stackIn_107_0 = stackOut_106_0;
                                  break L36;
                                }
                                L40: {
                                  if (stackIn_107_0 == 0) {
                                    L41: {
                                      var13_ref_String = wqa.field_J;
                                      if (var12 != 0) {
                                        break L41;
                                      } else {
                                        var14_ref_String = gl.a((byte) 82, field_I, new String[1]);
                                        if (var19 == 0) {
                                          break L40;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                    var14_ref_String = v.field_j + (String) var11_ref;
                                    break L40;
                                  } else {
                                    L42: {
                                      var13_ref_String = lha.field_m;
                                      if (var12 != 0) {
                                        break L42;
                                      } else {
                                        var14_ref_String = gl.a((byte) 102, bl.field_b, new String[1]);
                                        if (var19 == 0) {
                                          break L40;
                                        } else {
                                          break L42;
                                        }
                                      }
                                    }
                                    var14_ref_String = uda.field_w + (String) var11_ref;
                                    break L40;
                                  }
                                }
                                qda.field_b = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                                if (var19 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                        }
                        L43: {
                          if (null != rl.field_u) {
                            break L43;
                          } else {
                            if (null != hp.field_a) {
                              break L43;
                            } else {
                              if (nra.field_g != null) {
                                break L43;
                              } else {
                                if (null == lga.field_z) {
                                  break L33;
                                } else {
                                  break L43;
                                }
                              }
                            }
                          }
                        }
                        var11 = 0;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        L44: while (true) {
                          L45: {
                            L46: {
                              if (var16 >= fk.field_b) {
                                break L46;
                              } else {
                                var17_int = uu.field_a.field_ac[var16] & 255;
                                if (var19 != 0) {
                                  break L45;
                                } else {
                                  L47: {
                                    if (rl.field_u == null) {
                                      break L47;
                                    } else {
                                      if (null == rl.field_u[var16]) {
                                        break L47;
                                      } else {
                                        if (!rl.field_u[var16][var17_int]) {
                                          break L47;
                                        } else {
                                          var11 = 1;
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                  L48: {
                                    if (null == hp.field_a) {
                                      break L48;
                                    } else {
                                      if (hp.field_a[var16] != null) {
                                        L49: {
                                          var18_int = hp.field_a[var16][var17_int];
                                          if (0 == var18_int) {
                                            break L49;
                                          } else {
                                            if (!dea.field_c) {
                                              var11 = 1;
                                              break L49;
                                            } else {
                                              break L49;
                                            }
                                          }
                                        }
                                        if (var13 >= var18_int) {
                                          break L48;
                                        } else {
                                          var13 = var18_int;
                                          break L48;
                                        }
                                      } else {
                                        break L48;
                                      }
                                    }
                                  }
                                  L50: {
                                    if (lga.field_z == null) {
                                      break L50;
                                    } else {
                                      if (null != lga.field_z[var16]) {
                                        var15 = var15 | lga.field_z[var16][var17_int];
                                        break L50;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  L51: {
                                    if (null == nra.field_g) {
                                      break L51;
                                    } else {
                                      if (nra.field_g[var16] == null) {
                                        break L51;
                                      } else {
                                        L52: {
                                          var18_int = nra.field_g[var16][var17_int];
                                          if (var14 < var18_int) {
                                            var14 = var18_int;
                                            break L52;
                                          } else {
                                            break L52;
                                          }
                                        }
                                        if (0 == var18_int) {
                                          break L51;
                                        } else {
                                          if (!dea.field_c) {
                                            var11 = 1;
                                            break L51;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var16++;
                                  if (var19 == 0) {
                                    continue L44;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                            }
                            var16 = 0;
                            break L45;
                          }
                          var17 = tn.field_n.field_tb.field_J;
                          var18 = (pha) (Object) var17.f(param1 + -79);
                          L53: while (true) {
                            L54: {
                              L55: {
                                if (null == var18) {
                                  break L55;
                                } else {
                                  stackOut_181_0 = var18.f(162);
                                  stackIn_217_0 = stackOut_181_0 ? 1 : 0;
                                  stackIn_182_0 = stackOut_181_0;
                                  if (var19 != 0) {
                                    break L54;
                                  } else {
                                    L56: {
                                      L57: {
                                        if (!stackIn_182_0) {
                                          break L57;
                                        } else {
                                          if (var19 == 0) {
                                            break L56;
                                          } else {
                                            break L57;
                                          }
                                        }
                                      }
                                      L58: {
                                        if (var11 == 0) {
                                          break L58;
                                        } else {
                                          if (var18.field_tb) {
                                            break L58;
                                          } else {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L55;
                                            } else {
                                              break L58;
                                            }
                                          }
                                        }
                                      }
                                      L59: {
                                        if (~var18.field_Jb > ~var13) {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L55;
                                          } else {
                                            break L59;
                                          }
                                        } else {
                                          break L59;
                                        }
                                      }
                                      L60: {
                                        if (var18.field_zb >= var14) {
                                          break L60;
                                        } else {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L55;
                                          } else {
                                            break L60;
                                          }
                                        }
                                      }
                                      L61: {
                                        if ((~var18.field_Eb & var15) <= 0) {
                                          break L61;
                                        } else {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L55;
                                          } else {
                                            break L61;
                                          }
                                        }
                                      }
                                      if (var12 != 0) {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L55;
                                        } else {
                                          break L56;
                                        }
                                      } else {
                                        break L56;
                                      }
                                    }
                                    var18 = (pha) (Object) var17.e(120);
                                    if (var19 == 0) {
                                      continue L53;
                                    } else {
                                      break L55;
                                    }
                                  }
                                }
                              }
                              stackOut_216_0 = -3;
                              stackIn_217_0 = stackOut_216_0;
                              break L54;
                            }
                            L62: {
                              if (stackIn_217_0 < ~ld.field_e) {
                                break L62;
                              } else {
                                if (!oj.field_tb[12]) {
                                  break L62;
                                } else {
                                  var16 = 0;
                                  break L62;
                                }
                              }
                            }
                            if (var16 != 0) {
                              hw.field_a.field_X = false;
                              if (!hw.field_a.field_pb) {
                                break L33;
                              } else {
                                L63: {
                                  if (rm.field_e.field_a.field_wb == 0) {
                                    break L63;
                                  } else {
                                    qda.field_b = gl.a((byte) 126, sta.field_A, new String[1]);
                                    if (var19 == 0) {
                                      break L33;
                                    } else {
                                      break L63;
                                    }
                                  }
                                }
                                qda.field_b = kh.field_o;
                                break L33;
                              }
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      if (var19 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9_ref_String = uu.field_a.field_tb;
                  wf.field_g.field_r = gl.a((byte) 113, jea.field_nb, new String[1]).toUpperCase();
                  dl.field_t.a(dka.field_b.field_G, 40, -23776, dka.field_b.field_t - 40, 0);
                  dl.field_t.field_r = gl.a((byte) 107, bja.field_d, new String[1]);
                  var8 = dl.field_t;
                  break L2;
                }
                L64: {
                  if (uq.field_d != 0L) {
                    L65: {
                      var9 = (int)(-bva.b((byte) -107) + uq.field_d);
                      var9 = (999 + var9) / 1000;
                      if (var9 < 1) {
                        var9 = 1;
                        break L65;
                      } else {
                        break L65;
                      }
                    }
                    var8.field_r = gl.a((byte) 97, he.field_b, new String[1]);
                    break L64;
                  } else {
                    break L64;
                  }
                }
                cea.field_a.field_r = gl.a((byte) 106, tra.field_A, new String[2]);
                break L1;
              } else {
                break L1;
              }
            }
            L66: {
              L67: {
                stackOut_245_0 = nra.field_c;
                stackOut_245_1 = -98;
                stackIn_254_0 = stackOut_245_0;
                stackIn_254_1 = stackOut_245_1;
                stackIn_246_0 = stackOut_245_0;
                stackIn_246_1 = stackOut_245_1;
                if (!param4) {
                  break L67;
                } else {
                  stackOut_246_0 = (jea) (Object) stackIn_246_0;
                  stackOut_246_1 = stackIn_246_1;
                  stackIn_254_0 = stackOut_246_0;
                  stackIn_254_1 = stackOut_246_1;
                  stackIn_247_0 = stackOut_246_0;
                  stackIn_247_1 = stackOut_246_1;
                  if (param0) {
                    break L67;
                  } else {
                    stackOut_247_0 = (jea) (Object) stackIn_247_0;
                    stackOut_247_1 = stackIn_247_1;
                    stackIn_249_0 = stackOut_247_0;
                    stackIn_249_1 = stackOut_247_1;
                    stackOut_249_0 = (jea) (Object) stackIn_249_0;
                    stackOut_249_1 = stackIn_249_1;
                    stackIn_254_0 = stackOut_249_0;
                    stackIn_254_1 = stackOut_249_1;
                    stackIn_250_0 = stackOut_249_0;
                    stackIn_250_1 = stackOut_249_1;
                    if (tla.field_e) {
                      break L67;
                    } else {
                      stackOut_250_0 = (jea) (Object) stackIn_250_0;
                      stackOut_250_1 = stackIn_250_1;
                      stackIn_252_0 = stackOut_250_0;
                      stackIn_252_1 = stackOut_250_1;
                      stackOut_252_0 = (jea) (Object) stackIn_252_0;
                      stackOut_252_1 = stackIn_252_1;
                      stackOut_252_2 = 1;
                      stackIn_255_0 = stackOut_252_0;
                      stackIn_255_1 = stackOut_252_1;
                      stackIn_255_2 = stackOut_252_2;
                      break L66;
                    }
                  }
                }
              }
              stackOut_254_0 = (jea) (Object) stackIn_254_0;
              stackOut_254_1 = stackIn_254_1;
              stackOut_254_2 = 0;
              stackIn_255_0 = stackOut_254_0;
              stackIn_255_1 = stackOut_254_1;
              stackIn_255_2 = stackOut_254_2;
              break L66;
            }
            L68: {
              L69: {
                ((jea) (Object) stackIn_255_0).c(stackIn_255_1, stackIn_255_2 != 0);
                stackOut_255_0 = dka.field_b;
                stackOut_255_1 = 67;
                stackIn_264_0 = stackOut_255_0;
                stackIn_264_1 = stackOut_255_1;
                stackIn_256_0 = stackOut_255_0;
                stackIn_256_1 = stackOut_255_1;
                if (!param4) {
                  break L69;
                } else {
                  stackOut_256_0 = (jea) (Object) stackIn_256_0;
                  stackOut_256_1 = stackIn_256_1;
                  stackIn_264_0 = stackOut_256_0;
                  stackIn_264_1 = stackOut_256_1;
                  stackIn_257_0 = stackOut_256_0;
                  stackIn_257_1 = stackOut_256_1;
                  if (param0) {
                    break L69;
                  } else {
                    stackOut_257_0 = (jea) (Object) stackIn_257_0;
                    stackOut_257_1 = stackIn_257_1;
                    stackIn_259_0 = stackOut_257_0;
                    stackIn_259_1 = stackOut_257_1;
                    stackOut_259_0 = (jea) (Object) stackIn_259_0;
                    stackOut_259_1 = stackIn_259_1;
                    stackIn_264_0 = stackOut_259_0;
                    stackIn_264_1 = stackOut_259_1;
                    stackIn_260_0 = stackOut_259_0;
                    stackIn_260_1 = stackOut_259_1;
                    if (tla.field_e) {
                      break L69;
                    } else {
                      stackOut_260_0 = (jea) (Object) stackIn_260_0;
                      stackOut_260_1 = stackIn_260_1;
                      stackIn_262_0 = stackOut_260_0;
                      stackIn_262_1 = stackOut_260_1;
                      stackOut_262_0 = (jea) (Object) stackIn_262_0;
                      stackOut_262_1 = stackIn_262_1;
                      stackOut_262_2 = 1;
                      stackIn_265_0 = stackOut_262_0;
                      stackIn_265_1 = stackOut_262_1;
                      stackIn_265_2 = stackOut_262_2;
                      break L68;
                    }
                  }
                }
              }
              stackOut_264_0 = (jea) (Object) stackIn_264_0;
              stackOut_264_1 = stackIn_264_1;
              stackOut_264_2 = 0;
              stackIn_265_0 = stackOut_264_0;
              stackIn_265_1 = stackOut_264_1;
              stackIn_265_2 = stackOut_264_2;
              break L68;
            }
            L70: {
              L71: {
                ((jea) (Object) stackIn_265_0).c(stackIn_265_1, stackIn_265_2 != 0);
                stackOut_265_0 = hf.field_a;
                stackOut_265_1 = 36;
                stackIn_274_0 = stackOut_265_0;
                stackIn_274_1 = stackOut_265_1;
                stackIn_266_0 = stackOut_265_0;
                stackIn_266_1 = stackOut_265_1;
                if (!param4) {
                  break L71;
                } else {
                  stackOut_266_0 = (jea) (Object) stackIn_266_0;
                  stackOut_266_1 = stackIn_266_1;
                  stackIn_274_0 = stackOut_266_0;
                  stackIn_274_1 = stackOut_266_1;
                  stackIn_267_0 = stackOut_266_0;
                  stackIn_267_1 = stackOut_266_1;
                  if (param0) {
                    break L71;
                  } else {
                    stackOut_267_0 = (jea) (Object) stackIn_267_0;
                    stackOut_267_1 = stackIn_267_1;
                    stackIn_269_0 = stackOut_267_0;
                    stackIn_269_1 = stackOut_267_1;
                    stackOut_269_0 = (jea) (Object) stackIn_269_0;
                    stackOut_269_1 = stackIn_269_1;
                    stackIn_274_0 = stackOut_269_0;
                    stackIn_274_1 = stackOut_269_1;
                    stackIn_270_0 = stackOut_269_0;
                    stackIn_270_1 = stackOut_269_1;
                    if (!tla.field_e) {
                      break L71;
                    } else {
                      stackOut_270_0 = (jea) (Object) stackIn_270_0;
                      stackOut_270_1 = stackIn_270_1;
                      stackIn_272_0 = stackOut_270_0;
                      stackIn_272_1 = stackOut_270_1;
                      stackOut_272_0 = (jea) (Object) stackIn_272_0;
                      stackOut_272_1 = stackIn_272_1;
                      stackOut_272_2 = 1;
                      stackIn_275_0 = stackOut_272_0;
                      stackIn_275_1 = stackOut_272_1;
                      stackIn_275_2 = stackOut_272_2;
                      break L70;
                    }
                  }
                }
              }
              stackOut_274_0 = (jea) (Object) stackIn_274_0;
              stackOut_274_1 = stackIn_274_1;
              stackOut_274_2 = 0;
              stackIn_275_0 = stackOut_274_0;
              stackIn_275_1 = stackOut_274_1;
              stackIn_275_2 = stackOut_274_2;
              break L70;
            }
            ((jea) (Object) stackIn_275_0).c(stackIn_275_1, stackIn_275_2 != 0);
            rm.field_e.field_a.e((byte) -98);
            if (param1 == -1) {
              L72: {
                if (null == uu.field_a) {
                  break L72;
                } else {
                  L73: {
                    if (0 != bc.field_b.field_y) {
                      et.a(param2, 30, uu.field_a.f(0));
                      break L73;
                    } else {
                      break L73;
                    }
                  }
                  L74: {
                    if (hw.field_a.field_y != 0) {
                      hoa.field_p = true;
                      break L74;
                    } else {
                      break L74;
                    }
                  }
                  L75: {
                    if (pk.field_z.field_y != 0) {
                      tla.field_e = true;
                      break L75;
                    } else {
                      break L75;
                    }
                  }
                  L76: {
                    if (fsa.field_q.field_y == 0) {
                      break L76;
                    } else {
                      tla.field_e = false;
                      break L76;
                    }
                  }
                  cm.a(param2, uu.field_a, param1 ^ 21289, false);
                  break L72;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "aja.SB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void A(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_I = null;
              if (param0 == 32076) {
                break L1;
              } else {
                aja.a(false, 126, -63, false, true);
                break L1;
              }
            }
            field_G = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "aja.TB(" + param0 + ')');
        }
    }

    aja(la param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Reject <%0> from this game";
        field_I = "Please select an option in the '<%0>' row.";
    }
}
