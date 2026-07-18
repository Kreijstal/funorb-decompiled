/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends pg {
    static ha field_g;
    byte[] field_k;
    int field_j;
    static String field_i;
    static int field_h;

    final static jg a(int param0, int param1, int param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jg var8_ref_jg = null;
        int var9 = 0;
        jg var9_ref_jg = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_43_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_132_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = null;
        qo.field_f.field_Cb.field_G.c(param0 ^ -16711298);
        var5 = 0;
        var6 = 0;
        var7 = gb.field_f - 1;
        L0: while (true) {
          if (var7 < 0) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (gb.field_f <= var8) {
                var8 = var6 - (var7 - qo.field_f.field_Cb.field_B) + qo.field_f.field_Cb.field_I;
                qo.field_f.field_Cb.field_I = qo.field_f.field_Cb.field_I - var8;
                if (param0 == 16711422) {
                  qo.field_f.field_Cb.field_db = qo.field_f.field_Cb.field_db + var8;
                  if (!ui.field_s) {
                    qo.field_f.field_Cb.field_B = var7 - qo.field_f.field_Cb.field_I;
                    if (!ui.field_s) {
                      L2: {
                        if (!ef.field_r) {
                          break L2;
                        } else {
                          if (tm.field_d == null) {
                            break L2;
                          } else {
                            di.field_j = true;
                            var9 = -qo.field_f.field_Cb.field_B + -qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                            if (di.field_j) {
                              L3: {
                                qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9;
                                qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                                if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                                  stackOut_121_0 = 0;
                                  stackIn_122_0 = stackOut_121_0;
                                  break L3;
                                } else {
                                  stackOut_120_0 = 1;
                                  stackIn_122_0 = stackOut_120_0;
                                  break L3;
                                }
                              }
                              di.field_j = stackIn_122_0 != 0;
                              return (jg) var4;
                            } else {
                              L4: {
                                qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                                if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                                  stackOut_117_0 = 0;
                                  stackIn_118_0 = stackOut_117_0;
                                  break L4;
                                } else {
                                  stackOut_116_0 = 1;
                                  stackIn_118_0 = stackOut_116_0;
                                  break L4;
                                }
                              }
                              di.field_j = stackIn_118_0 != 0;
                              return (jg) var4;
                            }
                          }
                        }
                      }
                      var9 = -qo.field_f.field_Cb.field_B + -qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                      if (di.field_j) {
                        L5: {
                          qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9;
                          qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                          if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                            stackOut_131_0 = 0;
                            stackIn_132_0 = stackOut_131_0;
                            break L5;
                          } else {
                            stackOut_130_0 = 1;
                            stackIn_132_0 = stackOut_130_0;
                            break L5;
                          }
                        }
                        di.field_j = stackIn_132_0 != 0;
                        return (jg) var4;
                      } else {
                        L6: {
                          qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                          if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                            stackOut_127_0 = 0;
                            stackIn_128_0 = stackOut_127_0;
                            break L6;
                          } else {
                            stackOut_126_0 = 1;
                            stackIn_128_0 = stackOut_126_0;
                            break L6;
                          }
                        }
                        di.field_j = stackIn_128_0 != 0;
                        return (jg) var4;
                      }
                    } else {
                      ui.field_s = false;
                      qo.field_f.field_Cb.field_db = qo.field_f.field_Hb.field_I + -qo.field_f.field_Cb.field_I;
                      qo.field_f.field_Cb.field_bb = 0;
                      di.field_j = true;
                      if (ef.field_r) {
                        if (tm.field_d != null) {
                          di.field_j = true;
                          var9 = -qo.field_f.field_Cb.field_B + -qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                          if (di.field_j) {
                            L7: {
                              qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9;
                              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                              if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                                stackOut_109_0 = 0;
                                stackIn_110_0 = stackOut_109_0;
                                break L7;
                              } else {
                                stackOut_108_0 = 1;
                                stackIn_110_0 = stackOut_108_0;
                                break L7;
                              }
                            }
                            di.field_j = stackIn_110_0 != 0;
                            return (jg) var4;
                          } else {
                            L8: {
                              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                              if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                                stackOut_105_0 = 0;
                                stackIn_106_0 = stackOut_105_0;
                                break L8;
                              } else {
                                stackOut_104_0 = 1;
                                stackIn_106_0 = stackOut_104_0;
                                break L8;
                              }
                            }
                            di.field_j = stackIn_106_0 != 0;
                            return (jg) var4;
                          }
                        } else {
                          var9 = -qo.field_f.field_Cb.field_B + -qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                          if (di.field_j) {
                            L9: {
                              qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9;
                              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                              if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                                stackOut_99_0 = 0;
                                stackIn_100_0 = stackOut_99_0;
                                break L9;
                              } else {
                                stackOut_98_0 = 1;
                                stackIn_100_0 = stackOut_98_0;
                                break L9;
                              }
                            }
                            di.field_j = stackIn_100_0 != 0;
                            return (jg) var4;
                          } else {
                            L10: {
                              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                              if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                                stackOut_95_0 = 0;
                                stackIn_96_0 = stackOut_95_0;
                                break L10;
                              } else {
                                stackOut_94_0 = 1;
                                stackIn_96_0 = stackOut_94_0;
                                break L10;
                              }
                            }
                            di.field_j = stackIn_96_0 != 0;
                            return (jg) var4;
                          }
                        }
                      } else {
                        var9 = -qo.field_f.field_Cb.field_B + -qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                        if (di.field_j) {
                          L11: {
                            qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9;
                            qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                            if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                              stackOut_88_0 = 0;
                              stackIn_89_0 = stackOut_88_0;
                              break L11;
                            } else {
                              stackOut_87_0 = 1;
                              stackIn_89_0 = stackOut_87_0;
                              break L11;
                            }
                          }
                          di.field_j = stackIn_89_0 != 0;
                          return (jg) var4;
                        } else {
                          L12: {
                            qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                            if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                              stackOut_84_0 = 0;
                              stackIn_85_0 = stackOut_84_0;
                              break L12;
                            } else {
                              stackOut_83_0 = 1;
                              stackIn_85_0 = stackOut_83_0;
                              break L12;
                            }
                          }
                          di.field_j = stackIn_85_0 != 0;
                          return (jg) var4;
                        }
                      }
                    }
                  } else {
                    qo.field_f.field_Cb.field_I = var7;
                    qo.field_f.field_Cb.field_B = var7 - qo.field_f.field_Cb.field_I;
                    if (ui.field_s) {
                      ui.field_s = false;
                      qo.field_f.field_Cb.field_db = qo.field_f.field_Hb.field_I + -qo.field_f.field_Cb.field_I;
                      qo.field_f.field_Cb.field_bb = 0;
                      di.field_j = true;
                      if (ef.field_r) {
                        if (tm.field_d == null) {
                          var9 = -qo.field_f.field_Cb.field_B + -qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                          if (di.field_j) {
                            L13: {
                              qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9;
                              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                              if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                                stackOut_76_0 = 0;
                                stackIn_77_0 = stackOut_76_0;
                                break L13;
                              } else {
                                stackOut_75_0 = 1;
                                stackIn_77_0 = stackOut_75_0;
                                break L13;
                              }
                            }
                            di.field_j = stackIn_77_0 != 0;
                            return (jg) var4;
                          } else {
                            L14: {
                              qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                              if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                                stackOut_72_0 = 0;
                                stackIn_73_0 = stackOut_72_0;
                                break L14;
                              } else {
                                stackOut_71_0 = 1;
                                stackIn_73_0 = stackOut_71_0;
                                break L14;
                              }
                            }
                            di.field_j = stackIn_73_0 != 0;
                            return (jg) var4;
                          }
                        } else {
                          L15: {
                            di.field_j = true;
                            var9 = -qo.field_f.field_Cb.field_B + -qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                            if (!di.field_j) {
                              break L15;
                            } else {
                              qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9;
                              break L15;
                            }
                          }
                          L16: {
                            qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                            if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                              stackOut_67_0 = 0;
                              stackIn_68_0 = stackOut_67_0;
                              break L16;
                            } else {
                              stackOut_66_0 = 1;
                              stackIn_68_0 = stackOut_66_0;
                              break L16;
                            }
                          }
                          di.field_j = stackIn_68_0 != 0;
                          return (jg) var4;
                        }
                      } else {
                        L17: {
                          var9 = -qo.field_f.field_Cb.field_B + -qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                          if (!di.field_j) {
                            break L17;
                          } else {
                            qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9;
                            break L17;
                          }
                        }
                        L18: {
                          qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                          if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                            stackOut_60_0 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            break L18;
                          } else {
                            stackOut_59_0 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            break L18;
                          }
                        }
                        di.field_j = stackIn_61_0 != 0;
                        return (jg) var4;
                      }
                    } else {
                      L19: {
                        if (!ef.field_r) {
                          break L19;
                        } else {
                          if (tm.field_d == null) {
                            break L19;
                          } else {
                            di.field_j = true;
                            break L19;
                          }
                        }
                      }
                      L20: {
                        var9 = -qo.field_f.field_Cb.field_B + -qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                        if (!di.field_j) {
                          break L20;
                        } else {
                          qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9;
                          break L20;
                        }
                      }
                      L21: {
                        qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                        if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                          stackOut_53_0 = 0;
                          stackIn_54_0 = stackOut_53_0;
                          break L21;
                        } else {
                          stackOut_52_0 = 1;
                          stackIn_54_0 = stackOut_52_0;
                          break L21;
                        }
                      }
                      di.field_j = stackIn_54_0 != 0;
                      return (jg) var4;
                    }
                  }
                } else {
                  L22: {
                    jg discarded$1 = f.a(-105, 114, -71, 4);
                    qo.field_f.field_Cb.field_db = qo.field_f.field_Cb.field_db + var8;
                    if (!ui.field_s) {
                      break L22;
                    } else {
                      qo.field_f.field_Cb.field_I = var7;
                      break L22;
                    }
                  }
                  L23: {
                    qo.field_f.field_Cb.field_B = var7 - qo.field_f.field_Cb.field_I;
                    if (!ui.field_s) {
                      break L23;
                    } else {
                      ui.field_s = false;
                      qo.field_f.field_Cb.field_db = qo.field_f.field_Hb.field_I + -qo.field_f.field_Cb.field_I;
                      qo.field_f.field_Cb.field_bb = 0;
                      di.field_j = true;
                      break L23;
                    }
                  }
                  L24: {
                    if (!ef.field_r) {
                      break L24;
                    } else {
                      if (tm.field_d == null) {
                        break L24;
                      } else {
                        di.field_j = true;
                        break L24;
                      }
                    }
                  }
                  L25: {
                    var9 = -qo.field_f.field_Cb.field_B + -qo.field_f.field_Cb.field_I + qo.field_f.field_Hb.field_I;
                    if (!di.field_j) {
                      break L25;
                    } else {
                      qo.field_f.field_Cb.field_bb = -qo.field_f.field_Cb.field_db + var9;
                      break L25;
                    }
                  }
                  L26: {
                    qo.field_f.a(param2, param1 * 2 * param2, 9860, true);
                    if (qo.field_f.field_Cb.field_db - -qo.field_f.field_Cb.field_bb != var9) {
                      stackOut_42_0 = 0;
                      stackIn_43_0 = stackOut_42_0;
                      break L26;
                    } else {
                      stackOut_41_0 = 1;
                      stackIn_43_0 = stackOut_41_0;
                      break L26;
                    }
                  }
                  di.field_j = stackIn_43_0 != 0;
                  return (jg) var4;
                }
              } else {
                var9_ref_jg = g.field_d[var8];
                if (null != var9_ref_jg.field_a) {
                  L27: {
                    qo.field_f.field_Cb.a(var9_ref_jg.field_a, 110);
                    var9_ref_jg.field_a.a(var9_ref_jg.field_a.c(-25921), param3, var7, param2, (byte) -120);
                    if (0 != var9_ref_jg.field_a.field_U) {
                      var4 = (Object) (Object) var9_ref_jg;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  var7 = var7 + param2;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L28: {
              var8_ref_jg = g.field_d[var7];
              var9 = 0;
              if (wh.field_g) {
                break L28;
              } else {
                if (var5 >= hj.field_b) {
                  break L28;
                } else {
                  var10_int = oh.a((byte) 126, var8_ref_jg.field_m);
                  if (var8_ref_jg.b(-84) < var10_int) {
                    break L28;
                  } else {
                    L29: {
                      if (var8_ref_jg.field_i) {
                        break L29;
                      } else {
                        if (!sa.a(var8_ref_jg.field_n, 320)) {
                          break L29;
                        } else {
                          break L28;
                        }
                      }
                    }
                    var9 = 1;
                    break L28;
                  }
                }
              }
            }
            if (var9 == 0) {
              var8_ref_jg.field_a = null;
              var7--;
              continue L0;
            } else {
              L30: {
                L31: {
                  if (var8_ref_jg.field_a == null) {
                    break L31;
                  } else {
                    if (ui.field_s) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
                L32: {
                  if (var8_ref_jg.field_a == null) {
                    vh.field_t = vh.field_t + 1;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                var10 = jk.a(3, var8_ref_jg);
                var11 = var10 + dj.a(var8_ref_jg.field_e);
                var12 = rm.a(var8_ref_jg, (byte) 106);
                var8_ref_jg.field_a = new kc(0L, nf.field_A, var11);
                var6 = var6 + param2;
                var8_ref_jg.field_a.field_ob = var12;
                var8_ref_jg.field_a.field_J = var12 + (-((var12 & 16711422) >> 1) - -((16711422 & nf.field_A.field_J) >> 1));
                var8_ref_jg.field_a.field_eb = var12 + (-(var12 >> 1 & 8355711) + (nf.field_A.field_eb >> 1 & 8355711));
                var8_ref_jg.field_a.field_Z = oo.field_x;
                break L30;
              }
              var5++;
              var7--;
              var7--;
              continue L0;
            }
          }
        }
    }

    f(byte[] param0) {
        try {
            ((f) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "f.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, byte param4, int param5, boolean param6, int param7, int param8, boolean param9, boolean param10, int param11, int param12, int param13) {
        kh.field_c = null;
        ej.a(101);
        param3 = w.a(0, param8, param1, param11, param3, param2, param13);
        fn.a(param9, param3, param7, param0, 16777215, 16777215, param10, param13, true, 83);
        mo.a(1, param10, param7);
        kn.a(param1, param7, false, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Close";
    }
}
