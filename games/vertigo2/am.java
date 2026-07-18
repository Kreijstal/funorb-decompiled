/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    private bg[] field_a;
    private int[][] field_u;
    static fe field_o;
    static int field_n;
    static int field_t;
    private cn field_s;
    private ha field_f;
    private float field_p;
    private int field_l;
    static boolean field_b;
    static String field_e;
    private int[][] field_r;
    static String field_m;
    private int[] field_j;
    private int field_i;
    private int field_q;
    private hb[] field_c;
    private int field_d;
    private cq[] field_g;
    private int field_k;
    private String[] field_h;
    private int[][] field_v;

    final void a(bh param0, byte param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        wo var13 = null;
        ho var14 = null;
        wo var15 = null;
        cq[] stackIn_89_0 = null;
        cq[] stackIn_90_0 = null;
        cq[] stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        cq[] stackOut_88_0 = null;
        cq[] stackOut_90_0 = null;
        byte stackOut_90_1 = 0;
        cq[] stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((am) this).field_l == ((am) this).field_d) {
                if (param3 < 0) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var13 = param0.field_f[param3];
                        var6 = lj.a(var13.field_E, false, 128);
                        var7 = lj.a(var13.field_y, false, 128);
                        var8 = lj.a(var13.field_k - -120, false, 240);
                        var9 = ((am) this).field_s.field_q;
                        if (var9 != 0) {
                          break L4;
                        } else {
                          if (param0.a((byte) 108, -1 + var7, var6, var8 + -1) != null) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var9 != 1) {
                          break L5;
                        } else {
                          if (null != param0.a((byte) 108, var7, var6 + -1, var8 + -1)) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var9 != 2) {
                          break L6;
                        } else {
                          if (param0.a((byte) 108, 1 + var7, var6, -1 + var8) != null) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (3 != var9) {
                          break L7;
                        } else {
                          if (param0.a((byte) 108, var7, 1 + var6, -1 + var8) == null) {
                            break L7;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((am) this).field_s.a(1, 125);
                      break L2;
                    }
                    ((am) this).field_s.a(0, -125);
                    break L2;
                  }
                  L8: {
                    if (!param2) {
                      break L8;
                    } else {
                      if (!cr.field_eb[il.field_d]) {
                        break L8;
                      } else {
                        if (param0.h(param1 ^ -9869) != 1) {
                          break L8;
                        } else {
                          if (var13.field_G) {
                            break L8;
                          } else {
                            if (var13.b(param1 ^ 119) == 4) {
                              break L8;
                            } else {
                              if (param0.d(-2)) {
                                break L8;
                              } else {
                                ((am) this).field_s.a(2, 40);
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    if (!var13.field_G) {
                      break L9;
                    } else {
                      if (5 == var13.b(-1)) {
                        break L9;
                      } else {
                        ((am) this).field_s.a(var13.c((byte) -127), param1 ^ -66);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    ((am) this).field_s.a(-1);
                    var10 = var13.b(param1 ^ 119);
                    if (var10 != ((am) this).field_i) {
                      if (((am) this).field_i != 7) {
                        break L10;
                      } else {
                        ((am) this).field_s.d(param1 ^ -594);
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                  ((am) this).field_i = var13.b(-1);
                  break L1;
                }
              } else {
                ((am) this).field_p = ((am) this).field_p + 0.05000000074505806f;
                if (1.0f > ((am) this).field_p) {
                  break L1;
                } else {
                  ((am) this).field_d = param3;
                  ((am) this).field_l = param3;
                  ((am) this).field_p = 0.0f;
                  break L1;
                }
              }
            }
            L11: {
              var5_int = param0.h(param1 ^ -9869);
              if (param1 == -120) {
                break L11;
              } else {
                var12 = null;
                ((am) this).a(true, 50, (bh) null, (byte) -74);
                break L11;
              }
            }
            L12: {
              var6 = param0.field_n;
              var7 = var5_int;
              if (var7 == 6) {
                L13: {
                  L14: {
                    if (param0.field_w == 0) {
                      break L14;
                    } else {
                      if (param0.field_w != 3) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (var6 <= 200) {
                    break L13;
                  } else {
                    if (200 >= ((am) this).field_q) {
                      gm.a(25, (byte) -55);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L15: {
                  if (((am) this).field_k == var5_int) {
                    break L15;
                  } else {
                    var7 = 0;
                    L16: while (true) {
                      if (var7 >= ((am) this).field_c.length) {
                        break L15;
                      } else {
                        ((am) this).field_c[var7].d(-23);
                        var7++;
                        continue L16;
                      }
                    }
                  }
                }
                var7 = 0;
                L17: while (true) {
                  if (var7 >= ((am) this).field_c.length) {
                    if (param0.field_w != 2) {
                      break L12;
                    } else {
                      L18: {
                        if (param3 != 0) {
                          break L18;
                        } else {
                          if (param0.field_E < 50) {
                            ((am) this).field_c[0].a(19, (byte) -36);
                            break L18;
                          } else {
                            if (param0.field_E > 50) {
                              ((am) this).field_c[1].a(19, (byte) -36);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      if (param3 != 1) {
                        break L12;
                      } else {
                        L19: {
                          if (param0.field_E > 50) {
                            ((am) this).field_c[0].a(19, (byte) -36);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        if (param0.field_E >= 50) {
                          break L12;
                        } else {
                          ((am) this).field_c[1].a(19, (byte) -36);
                          break L12;
                        }
                      }
                    }
                  } else {
                    ((am) this).field_c[var7].a(0, (byte) -36);
                    var7++;
                    continue L17;
                  }
                }
              } else {
                if (var7 == 0) {
                  ((am) this).field_c[0].a(0, param1 ^ 25116);
                  if (1 < ((am) this).field_c.length) {
                    ((am) this).field_c[1].a(1, -25196);
                    break L12;
                  } else {
                    break L12;
                  }
                } else {
                  L20: {
                    if (var7 != 2) {
                      if (var7 == 7) {
                        break L20;
                      } else {
                        break L12;
                      }
                    } else {
                      break L20;
                    }
                  }
                  if (var6 >= 75) {
                    ((am) this).field_c[0].a(25, (byte) -36);
                    if (param0.field_w == 0) {
                      break L12;
                    } else {
                      if (param0.field_w != 3) {
                        ((am) this).field_c[1].a(25, (byte) -36);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
              }
            }
            ((am) this).field_k = var5_int;
            ((am) this).field_q = var6;
            var7 = 0;
            L21: while (true) {
              if (var7 >= ((am) this).field_g.length) {
                var7 = 0;
                L22: while (true) {
                  L23: {
                    if (var7 >= 4) {
                      break L23;
                    } else {
                      var14 = param0.a((byte) -114);
                      if (var14 != null) {
                        L24: {
                          if (var14.field_h < 0) {
                            var14.field_h = (byte) 0;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L25: {
                          stackOut_88_0 = ((am) this).field_g;
                          stackIn_90_0 = stackOut_88_0;
                          stackIn_89_0 = stackOut_88_0;
                          if (var14.field_h <= 1) {
                            stackOut_90_0 = (cq[]) (Object) stackIn_90_0;
                            stackOut_90_1 = var14.field_h;
                            stackIn_91_0 = stackOut_90_0;
                            stackIn_91_1 = stackOut_90_1;
                            break L25;
                          } else {
                            stackOut_89_0 = (cq[]) (Object) stackIn_89_0;
                            stackOut_89_1 = 0;
                            stackIn_91_0 = stackOut_89_0;
                            stackIn_91_1 = stackOut_89_1;
                            break L25;
                          }
                        }
                        ((cq) (Object) stackIn_91_0[stackIn_91_1]).a(111, var14.field_j, var14.field_b, var14.field_c, var14.field_f, var14.field_g);
                        var7++;
                        continue L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  var7 = 0;
                  L26: while (true) {
                    if (~var7 <= ~param0.field_f.length) {
                      break L0;
                    } else {
                      var15 = param0.field_f[var7];
                      ((am) this).field_c[var7].a(var15, (byte) -76);
                      var7++;
                      continue L26;
                    }
                  }
                }
              } else {
                ((am) this).field_g[var7].a((byte) 68);
                var7++;
                continue L21;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var5 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) var5;
            stackOut_96_1 = new StringBuilder().append("am.F(");
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param0 == null) {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L27;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L27;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, bh param2) {
        RuntimeException var4 = null;
        wo[] var4_array = null;
        int var5 = 0;
        int var6 = 0;
        wo var7_ref_wo = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fe var11_ref_fe = null;
        int var11 = 0;
        int var12_int = 0;
        jg[] var12 = null;
        int var13_int = 0;
        rn[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19_int = 0;
        Object var19 = null;
        int var20 = 0;
        int var21 = 0;
        wo[] var22 = null;
        int stackIn_7_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_69_0 = 0;
        bg stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int[] stackIn_81_2 = null;
        bg stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int[] stackIn_82_2 = null;
        bg stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int[] stackIn_83_2 = null;
        int stackIn_83_3 = 0;
        bg stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int[] stackIn_85_2 = null;
        bg stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int[] stackIn_86_2 = null;
        bg stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int[] stackIn_87_2 = null;
        int stackIn_87_3 = 0;
        bg stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int[] stackIn_98_2 = null;
        bg stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int[] stackIn_99_2 = null;
        bg stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int[] stackIn_100_2 = null;
        int stackIn_100_3 = 0;
        bg stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int[] stackIn_105_2 = null;
        bg stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int[] stackIn_106_2 = null;
        bg stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int[] stackIn_107_2 = null;
        int stackIn_107_3 = 0;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        bg stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int[] stackOut_104_2 = null;
        bg stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int[] stackOut_106_2 = null;
        int stackOut_106_3 = 0;
        bg stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int[] stackOut_105_2 = null;
        int stackOut_105_3 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        bg stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int[] stackOut_97_2 = null;
        bg stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int[] stackOut_99_2 = null;
        int stackOut_99_3 = 0;
        bg stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int[] stackOut_98_2 = null;
        int stackOut_98_3 = 0;
        bg stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int[] stackOut_84_2 = null;
        bg stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int[] stackOut_86_2 = null;
        int stackOut_86_3 = 0;
        bg stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int[] stackOut_85_2 = null;
        int stackOut_85_3 = 0;
        bg stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int[] stackOut_80_2 = null;
        bg stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int[] stackOut_82_2 = null;
        int stackOut_82_3 = 0;
        bg stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int[] stackOut_81_2 = null;
        int stackOut_81_3 = 0;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        var21 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var22 = param2.field_f;
              var4_array = var22;
              if (0 <= param0) {
                if (param2.c((byte) 104)) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_7_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_7_0;
              if (var5 == 0) {
                hn.a(false, 380, -420, ((am) this).field_s.field_e, -390, 0, -140, 180, 0, 0, -1);
                break L2;
              } else {
                if (!param2.d(-2)) {
                  L3: {
                    if (!((am) this).field_s.field_o) {
                      break L3;
                    } else {
                      ((am) this).field_s.field_o = false;
                      ((am) this).field_s.d(550);
                      break L3;
                    }
                  }
                  var7_ref_wo = var22[param0];
                  if (((am) this).field_d == ((am) this).field_l) {
                    ((am) this).field_s.a(var7_ref_wo.field_k, var7_ref_wo.field_E, 12257, var7_ref_wo.field_y);
                    break L2;
                  } else {
                    var8 = var7_ref_wo.field_E - var22[((am) this).field_d].field_E;
                    var9 = -var22[((am) this).field_d].field_y + var7_ref_wo.field_y;
                    var10 = -var22[((am) this).field_d].field_k + var7_ref_wo.field_k;
                    ((am) this).field_s.a(var22[((am) this).field_d].field_k + (int)((float)var10 * ((am) this).field_p), var22[((am) this).field_d].field_E + (int)((float)var8 * ((am) this).field_p), 12257, var22[((am) this).field_d].field_y + (int)(((am) this).field_p * (float)var9));
                    break L2;
                  }
                } else {
                  L4: {
                    ((am) this).field_s.a(param2.field_D, param2.field_A + 1000, param2.field_v, false, param2.field_h, param2.field_K, -1000 + param2.field_z);
                    if (!((am) this).field_s.field_o) {
                      ((am) this).field_s.d(550);
                      ((am) this).field_s.a(param2.field_D, param2.field_A, param2.field_v, false, param2.field_h, param2.field_K, param2.field_z);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((am) this).field_s.a(0, 0, 12257, 0);
                  break L2;
                }
              }
            }
            var6 = 0;
            L5: while (true) {
              if (var6 >= ((am) this).field_c.length) {
                L6: {
                  if (!hn.field_t) {
                    ue.field_N.c(0, 0);
                    break L6;
                  } else {
                    qr.field_l.a(((am) this).field_s.field_e, 28580);
                    break L6;
                  }
                }
                L7: {
                  sc.a(true, rg.field_f);
                  var6 = ((am) this).field_s.field_e[0];
                  var7 = ((am) this).field_s.field_e[2];
                  var8 = ((am) this).field_s.field_e[1];
                  var9 = param2.h(9979);
                  if (var9 != 7) {
                    if (var9 != 6) {
                      if (var9 != 3) {
                        if (var9 == 4) {
                          stackOut_33_0 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          break L7;
                        } else {
                          stackOut_32_0 = 0;
                          stackIn_35_0 = stackOut_32_0;
                          break L7;
                        }
                      } else {
                        stackOut_30_0 = 1;
                        stackIn_35_0 = stackOut_30_0;
                        break L7;
                      }
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_35_0 = stackOut_28_0;
                      break L7;
                    }
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_35_0 = stackOut_26_0;
                    break L7;
                  }
                }
                L8: {
                  var10 = stackIn_35_0;
                  if (cn.field_r) {
                    L9: {
                      L10: {
                        var11_ref_fe = sf.field_b;
                        var12_int = sf.field_b.field_y << 5;
                        var13_int = sf.field_b.field_t << 5;
                        var14 = Vertigo2.field_C.field_y << 4;
                        var15 = Vertigo2.field_C.field_t << 4;
                        var16 = ji.field_p.field_y << 4;
                        var17_int = ji.field_p.field_t << 4;
                        var18 = jf.field_M.field_y << 4;
                        var19_int = jf.field_M.field_t << 4;
                        if (((am) this).field_s.field_o) {
                          break L10;
                        } else {
                          if (var10 != 0) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var16 = var16 / 2;
                      var12_int = var12_int / 2;
                      var19_int = var19_int / 2;
                      var13_int = var13_int / 2;
                      var14 = var14 / 2;
                      var15 = var15 / 2;
                      var18 = var18 / 2;
                      var17_int = var17_int / 2;
                      break L9;
                    }
                    gb.a(((am) this).field_r[0][1], (fb) (Object) jf.field_M, var19_int, ((am) this).field_r[0][0], ((am) this).field_s.field_e, ((am) this).field_r[0][2], var18, -98);
                    var20 = 0;
                    L11: while (true) {
                      if (1000 <= var20) {
                        gb.a(((am) this).field_v[0][1], (fb) (Object) Vertigo2.field_C, var15, ((am) this).field_v[0][0], ((am) this).field_s.field_e, ((am) this).field_v[0][2], var14, -124);
                        gb.a(((am) this).field_v[1][1], (fb) (Object) ji.field_p, var17_int, ((am) this).field_v[1][0], ((am) this).field_s.field_e, ((am) this).field_v[1][2], var16, -114);
                        break L8;
                      } else {
                        gb.a(((am) this).field_u[var20][1], (fb) (Object) var11_ref_fe, var13_int, ((am) this).field_u[var20][0], ((am) this).field_s.field_e, ((am) this).field_u[var20][2], var12_int, -118);
                        var20++;
                        continue L11;
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                var11 = 0;
                var12 = param2.c(126);
                var13_int = param2.l(-115) - 1;
                L12: while (true) {
                  if (var13_int < 0) {
                    var13 = param2.m(9384);
                    var14 = param2.e((byte) 117) - 1;
                    L13: while (true) {
                      if (var14 < 0) {
                        L14: {
                          if (var10 == 0) {
                            break L14;
                          } else {
                            ((am) this).field_c[0].a(param0, -25196);
                            break L14;
                          }
                        }
                        L15: {
                          if (var9 == 0) {
                            break L15;
                          } else {
                            var14 = 0;
                            L16: while (true) {
                              if (((am) this).field_c.length <= var14) {
                                break L15;
                              } else {
                                ((am) this).field_j[var11] = ((am) this).field_c[var14].a(var6, var7, 0, var8);
                                int incrementValue$3 = var11;
                                var11++;
                                ((am) this).field_a[incrementValue$3] = (bg) (Object) ((am) this).field_c[var14];
                                if (var10 != 0) {
                                  break L15;
                                } else {
                                  var14++;
                                  continue L16;
                                }
                              }
                            }
                          }
                        }
                        this.a(-1 + var11, 3, 0);
                        if (param1 >= 82) {
                          L17: {
                            L18: {
                              var14 = param2.field_n;
                              if (var9 == 2) {
                                break L18;
                              } else {
                                if (7 != var9) {
                                  var15 = var11 + -1;
                                  L19: while (true) {
                                    if (0 > var15) {
                                      break L17;
                                    } else {
                                      L20: {
                                        stackOut_104_0 = ((am) this).field_a[var15];
                                        stackOut_104_1 = 0;
                                        stackOut_104_2 = ((am) this).field_s.field_e;
                                        stackIn_106_0 = stackOut_104_0;
                                        stackIn_106_1 = stackOut_104_1;
                                        stackIn_106_2 = stackOut_104_2;
                                        stackIn_105_0 = stackOut_104_0;
                                        stackIn_105_1 = stackOut_104_1;
                                        stackIn_105_2 = stackOut_104_2;
                                        if (param2.field_w != 2) {
                                          stackOut_106_0 = (bg) (Object) stackIn_106_0;
                                          stackOut_106_1 = stackIn_106_1;
                                          stackOut_106_2 = (int[]) (Object) stackIn_106_2;
                                          stackOut_106_3 = 0;
                                          stackIn_107_0 = stackOut_106_0;
                                          stackIn_107_1 = stackOut_106_1;
                                          stackIn_107_2 = stackOut_106_2;
                                          stackIn_107_3 = stackOut_106_3;
                                          break L20;
                                        } else {
                                          stackOut_105_0 = (bg) (Object) stackIn_105_0;
                                          stackOut_105_1 = stackIn_105_1;
                                          stackOut_105_2 = (int[]) (Object) stackIn_105_2;
                                          stackOut_105_3 = 1;
                                          stackIn_107_0 = stackOut_105_0;
                                          stackIn_107_1 = stackOut_105_1;
                                          stackIn_107_2 = stackOut_105_2;
                                          stackIn_107_3 = stackOut_105_3;
                                          break L20;
                                        }
                                      }
                                      ((bg) (Object) stackIn_107_0).a(stackIn_107_1 != 0, stackIn_107_2, stackIn_107_3 != 0, ((am) this).field_s.field_o);
                                      var15--;
                                      continue L19;
                                    }
                                  }
                                } else {
                                  break L18;
                                }
                              }
                            }
                            L21: {
                              if (50 > var14) {
                                stackOut_68_0 = 0;
                                stackIn_69_0 = stackOut_68_0;
                                break L21;
                              } else {
                                stackOut_67_0 = 1;
                                stackIn_69_0 = stackOut_67_0;
                                break L21;
                              }
                            }
                            var15 = stackIn_69_0;
                            if (var15 != 0) {
                              var16 = 0;
                              L22: while (true) {
                                if (((am) this).field_c.length <= var16) {
                                  ((am) this).field_s.field_e[1] = ((am) this).field_s.field_e[1] - (20 * var14 - 1000);
                                  var16 = var11 - 1;
                                  L23: while (true) {
                                    if (0 > var16) {
                                      break L17;
                                    } else {
                                      L24: {
                                        if (((am) this).field_a[var16] instanceof hb) {
                                          L25: {
                                            stackOut_97_0 = ((am) this).field_a[var16];
                                            stackOut_97_1 = -30;
                                            stackOut_97_2 = ((am) this).field_s.field_e;
                                            stackIn_99_0 = stackOut_97_0;
                                            stackIn_99_1 = stackOut_97_1;
                                            stackIn_99_2 = stackOut_97_2;
                                            stackIn_98_0 = stackOut_97_0;
                                            stackIn_98_1 = stackOut_97_1;
                                            stackIn_98_2 = stackOut_97_2;
                                            if (param2.field_w != 2) {
                                              stackOut_99_0 = (bg) (Object) stackIn_99_0;
                                              stackOut_99_1 = stackIn_99_1;
                                              stackOut_99_2 = (int[]) (Object) stackIn_99_2;
                                              stackOut_99_3 = 0;
                                              stackIn_100_0 = stackOut_99_0;
                                              stackIn_100_1 = stackOut_99_1;
                                              stackIn_100_2 = stackOut_99_2;
                                              stackIn_100_3 = stackOut_99_3;
                                              break L25;
                                            } else {
                                              stackOut_98_0 = (bg) (Object) stackIn_98_0;
                                              stackOut_98_1 = stackIn_98_1;
                                              stackOut_98_2 = (int[]) (Object) stackIn_98_2;
                                              stackOut_98_3 = 1;
                                              stackIn_100_0 = stackOut_98_0;
                                              stackIn_100_1 = stackOut_98_1;
                                              stackIn_100_2 = stackOut_98_2;
                                              stackIn_100_3 = stackOut_98_3;
                                              break L25;
                                            }
                                          }
                                          ((bg) (Object) stackIn_100_0).a(stackIn_100_1, stackIn_100_2, stackIn_100_3 != 0, (byte[]) null, ((am) this).field_s.field_o);
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      var16--;
                                      continue L23;
                                    }
                                  }
                                } else {
                                  ((am) this).field_c[var16].a(6, (byte) -36);
                                  var16++;
                                  continue L22;
                                }
                              }
                            } else {
                              L26: {
                                var16 = var14 * 24 / 50;
                                var17 = oo.field_c;
                                var18 = var16;
                                if (12 > var18) {
                                  break L26;
                                } else {
                                  var18 = 11;
                                  break L26;
                                }
                              }
                              L27: {
                                oo.field_c = bm.field_G[var18];
                                var19 = null;
                                var16 -= 12;
                                if (var16 < 0) {
                                  break L27;
                                } else {
                                  L28: {
                                    if (var16 >= 12) {
                                      var16 = 11;
                                      break L28;
                                    } else {
                                      break L28;
                                    }
                                  }
                                  var19 = (Object) (Object) lf.field_A[var16];
                                  break L27;
                                }
                              }
                              var20 = -1 + var11;
                              L29: while (true) {
                                if (0 > var20) {
                                  oo.field_c = var17;
                                  break L17;
                                } else {
                                  L30: {
                                    if (!(((am) this).field_a[var20] instanceof hb)) {
                                      L31: {
                                        stackOut_84_0 = ((am) this).field_a[var20];
                                        stackOut_84_1 = -30;
                                        stackOut_84_2 = ((am) this).field_s.field_e;
                                        stackIn_86_0 = stackOut_84_0;
                                        stackIn_86_1 = stackOut_84_1;
                                        stackIn_86_2 = stackOut_84_2;
                                        stackIn_85_0 = stackOut_84_0;
                                        stackIn_85_1 = stackOut_84_1;
                                        stackIn_85_2 = stackOut_84_2;
                                        if (2 != param2.field_w) {
                                          stackOut_86_0 = (bg) (Object) stackIn_86_0;
                                          stackOut_86_1 = stackIn_86_1;
                                          stackOut_86_2 = (int[]) (Object) stackIn_86_2;
                                          stackOut_86_3 = 0;
                                          stackIn_87_0 = stackOut_86_0;
                                          stackIn_87_1 = stackOut_86_1;
                                          stackIn_87_2 = stackOut_86_2;
                                          stackIn_87_3 = stackOut_86_3;
                                          break L31;
                                        } else {
                                          stackOut_85_0 = (bg) (Object) stackIn_85_0;
                                          stackOut_85_1 = stackIn_85_1;
                                          stackOut_85_2 = (int[]) (Object) stackIn_85_2;
                                          stackOut_85_3 = 1;
                                          stackIn_87_0 = stackOut_85_0;
                                          stackIn_87_1 = stackOut_85_1;
                                          stackIn_87_2 = stackOut_85_2;
                                          stackIn_87_3 = stackOut_85_3;
                                          break L31;
                                        }
                                      }
                                      ((bg) (Object) stackIn_87_0).a(stackIn_87_1, stackIn_87_2, stackIn_87_3 != 0, (byte[]) var19, ((am) this).field_s.field_o);
                                      break L30;
                                    } else {
                                      L32: {
                                        oo.field_c = var17;
                                        stackOut_80_0 = ((am) this).field_a[var20];
                                        stackOut_80_1 = -30;
                                        stackOut_80_2 = ((am) this).field_s.field_e;
                                        stackIn_82_0 = stackOut_80_0;
                                        stackIn_82_1 = stackOut_80_1;
                                        stackIn_82_2 = stackOut_80_2;
                                        stackIn_81_0 = stackOut_80_0;
                                        stackIn_81_1 = stackOut_80_1;
                                        stackIn_81_2 = stackOut_80_2;
                                        if (param2.field_w != 2) {
                                          stackOut_82_0 = (bg) (Object) stackIn_82_0;
                                          stackOut_82_1 = stackIn_82_1;
                                          stackOut_82_2 = (int[]) (Object) stackIn_82_2;
                                          stackOut_82_3 = 0;
                                          stackIn_83_0 = stackOut_82_0;
                                          stackIn_83_1 = stackOut_82_1;
                                          stackIn_83_2 = stackOut_82_2;
                                          stackIn_83_3 = stackOut_82_3;
                                          break L32;
                                        } else {
                                          stackOut_81_0 = (bg) (Object) stackIn_81_0;
                                          stackOut_81_1 = stackIn_81_1;
                                          stackOut_81_2 = (int[]) (Object) stackIn_81_2;
                                          stackOut_81_3 = 1;
                                          stackIn_83_0 = stackOut_81_0;
                                          stackIn_83_1 = stackOut_81_1;
                                          stackIn_83_2 = stackOut_81_2;
                                          stackIn_83_3 = stackOut_81_3;
                                          break L32;
                                        }
                                      }
                                      ((bg) (Object) stackIn_83_0).a(stackIn_83_1, stackIn_83_2, stackIn_83_3 != 0, (byte[]) null, ((am) this).field_s.field_o);
                                      oo.field_c = bm.field_G[var18];
                                      break L30;
                                    }
                                  }
                                  var20--;
                                  continue L29;
                                }
                              }
                            }
                          }
                          break L0;
                        } else {
                          return;
                        }
                      } else {
                        ((am) this).field_j[var11] = var13[var14].a(var7, -113, var6, var8);
                        int incrementValue$4 = var11;
                        var11++;
                        ((am) this).field_a[incrementValue$4] = (bg) (Object) var13[var14];
                        var14--;
                        continue L13;
                      }
                    }
                  } else {
                    L33: {
                      if (var12[var13_int] != null) {
                        ((am) this).field_j[var11] = var12[var13_int].a(var7, -128, var6, var8);
                        int incrementValue$5 = var11;
                        var11++;
                        ((am) this).field_a[incrementValue$5] = (bg) (Object) var12[var13_int];
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    var13_int--;
                    continue L12;
                  }
                }
              } else {
                ((am) this).field_c[var6].a(false, var22[var6]);
                var6++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var4 = decompiledCaughtException;
            stackOut_109_0 = (RuntimeException) var4;
            stackOut_109_1 = new StringBuilder().append("am.G(").append(param0).append(',').append(param1).append(',');
            stackIn_111_0 = stackOut_109_0;
            stackIn_111_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param2 == null) {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "null";
              stackIn_112_0 = stackOut_111_0;
              stackIn_112_1 = stackOut_111_1;
              stackIn_112_2 = stackOut_111_2;
              break L34;
            } else {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "{...}";
              stackIn_112_0 = stackOut_110_0;
              stackIn_112_1 = stackOut_110_1;
              stackIn_112_2 = stackOut_110_2;
              break L34;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_112_0, stackIn_112_2 + ')');
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        for (var2 = 0; var2 < ((am) this).field_c.length; var2++) {
            ((am) this).field_c[var2].d(-125);
            ((am) this).field_g[var2].a(-96);
        }
        if (param0 < 115) {
            ((am) this).field_f = null;
        }
    }

    final void a(int param0) {
        if (param0 != 15481) {
            ((am) this).b((byte) -1);
        }
        if (!((am) this).field_s.a(true)) {
            return;
        }
        ((am) this).field_s.field_q = (3 + ((am) this).field_s.field_q) % 4;
    }

    final void b(byte param0) {
        if (!((am) this).field_s.a(true)) {
            return;
        }
        ((am) this).field_s.field_q = (((am) this).field_s.field_q + 1) % 4;
        if (param0 <= 47) {
            ((am) this).field_h = null;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            Object var3 = null;
            ((am) this).a((bh) null, -30, -79);
        }
        return ((am) this).field_l != ((am) this).field_d ? true : false;
    }

    final void a(bh param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wo var11 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((am) this).field_l != ((am) this).field_d) {
                ((am) this).field_p = ((am) this).field_p + 0.05000000074505806f;
                if (((am) this).field_p < 1.0f) {
                  break L1;
                } else {
                  ((am) this).field_d = param1;
                  ((am) this).field_l = param1;
                  ((am) this).field_p = 0.0f;
                  break L1;
                }
              } else {
                if (0 > param1) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var11 = param0.field_f[param1];
                        var5 = lj.a(var11.field_E, false, 128);
                        var6 = lj.a(var11.field_y, false, 128);
                        var7 = lj.a(120 + var11.field_k, false, 240);
                        var8 = ((am) this).field_s.field_q;
                        if (var8 != 0) {
                          break L4;
                        } else {
                          if (null != param0.a((byte) 108, var6 + -1, var5, -1 + var7)) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (1 != var8) {
                          break L5;
                        } else {
                          if (null != param0.a((byte) 108, var6, -1 + var5, var7 - 1)) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var8 != 2) {
                          break L6;
                        } else {
                          if (null != param0.a((byte) 108, var6 + 1, var5, -1 + var7)) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var8 != 3) {
                          break L7;
                        } else {
                          if (param0.a((byte) 108, var6, 1 + var5, -1 + var7) == null) {
                            break L7;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((am) this).field_s.a(1, 94);
                      break L2;
                    }
                    ((am) this).field_s.a(0, 109);
                    break L2;
                  }
                  L8: {
                    if (var11.field_G) {
                      ((am) this).field_s.a(var11.c((byte) -128), -115);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    ((am) this).field_s.a(-1);
                    var9 = var11.b(-1);
                    if (((am) this).field_i == var9) {
                      break L9;
                    } else {
                      if (((am) this).field_i == 7) {
                        ((am) this).field_s.d(550);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  ((am) this).field_i = var11.b(-1);
                  break L1;
                }
              }
            }
            L10: {
              var4_int = param0.h(9979);
              if (param2 < -9) {
                break L10;
              } else {
                ((am) this).field_p = 0.5239396691322327f;
                break L10;
              }
            }
            L11: {
              var5 = var4_int;
              if (6 == var5) {
                if (0 == ((am) this).field_c[0].c(false)) {
                  ((am) this).field_c[0].a(22, (byte) -36);
                  break L11;
                } else {
                  break L11;
                }
              } else {
                if (var5 == 0) {
                  ((am) this).field_c[0].a(0, -25196);
                  if (1 >= ((am) this).field_c.length) {
                    break L11;
                  } else {
                    ((am) this).field_c[1].a(1, -25196);
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
            }
            ((am) this).field_k = var4_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("am.C(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L12;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, bh param4, int param5, int param6, int param7, int param8) {
        wo[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wo var14_ref_wo = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        fe var18_ref_fe = null;
        int var18 = 0;
        int var19 = 0;
        int var20_int = 0;
        jg[] var20 = null;
        int var21_int = 0;
        rn[] var21 = null;
        int var22 = 0;
        int var23 = 0;
        hi[] var23_ref_hi__ = null;
        int var24 = 0;
        int var25 = 0;
        int[] var25_ref_int__ = null;
        int var26 = 0;
        int[] var26_ref_int__ = null;
        int var27_int = 0;
        String[] var27 = null;
        int var28 = 0;
        Object var28_ref = null;
        int var29 = 0;
        String var29_ref_String = null;
        Object var30_ref = null;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        wo[] var33 = null;
        Object var34 = null;
        hb var34_ref = null;
        lg var35 = null;
        fc var36 = null;
        Object var37 = null;
        hb var37_ref = null;
        String[] var38 = null;
        String[] var39 = null;
        String var40 = null;
        String[] var41 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        hb stackIn_30_0 = null;
        hb stackIn_31_0 = null;
        hb stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_127_0 = 0;
        bg stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        int[] stackIn_144_2 = null;
        bg stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        int[] stackIn_145_2 = null;
        bg stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int[] stackIn_146_2 = null;
        int stackIn_146_3 = 0;
        bg stackIn_149_0 = null;
        bg stackIn_150_0 = null;
        bg stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        bg stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int[] stackIn_152_2 = null;
        bg stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        int[] stackIn_153_2 = null;
        bg stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        int[] stackIn_154_2 = null;
        int stackIn_154_3 = 0;
        bg stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        int[] stackIn_164_2 = null;
        bg stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        int[] stackIn_165_2 = null;
        bg stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        int[] stackIn_166_2 = null;
        int stackIn_166_3 = 0;
        int stackIn_189_0 = 0;
        bg stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        int[] stackIn_204_2 = null;
        bg stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        int[] stackIn_205_2 = null;
        bg stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        int[] stackIn_206_2 = null;
        int stackIn_206_3 = 0;
        bg stackIn_218_0 = null;
        bg stackIn_219_0 = null;
        bg stackIn_220_0 = null;
        int stackIn_220_1 = 0;
        bg stackIn_221_0 = null;
        int stackIn_221_1 = 0;
        int[] stackIn_221_2 = null;
        bg stackIn_222_0 = null;
        int stackIn_222_1 = 0;
        int[] stackIn_222_2 = null;
        bg stackIn_223_0 = null;
        int stackIn_223_1 = 0;
        int[] stackIn_223_2 = null;
        int stackIn_223_3 = 0;
        int stackIn_247_0 = 0;
        int stackIn_260_0 = 0;
        bh stackIn_305_0 = null;
        int stackIn_305_1 = 0;
        bh stackIn_306_0 = null;
        int stackIn_306_1 = 0;
        bh stackIn_307_0 = null;
        int stackIn_307_1 = 0;
        bh stackIn_308_0 = null;
        int stackIn_308_1 = 0;
        bh stackIn_309_0 = null;
        int stackIn_309_1 = 0;
        int stackIn_309_2 = 0;
        int stackIn_324_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        bg stackOut_163_0 = null;
        int stackOut_163_1 = 0;
        int[] stackOut_163_2 = null;
        bg stackOut_165_0 = null;
        int stackOut_165_1 = 0;
        int[] stackOut_165_2 = null;
        int stackOut_165_3 = 0;
        bg stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        int[] stackOut_164_2 = null;
        int stackOut_164_3 = 0;
        bg stackOut_148_0 = null;
        bg stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        bg stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        bg stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        int[] stackOut_151_2 = null;
        bg stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int[] stackOut_153_2 = null;
        int stackOut_153_3 = 0;
        bg stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        int[] stackOut_152_2 = null;
        int stackOut_152_3 = 0;
        bg stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        int[] stackOut_143_2 = null;
        bg stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        int[] stackOut_145_2 = null;
        int stackOut_145_3 = 0;
        bg stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        int[] stackOut_144_2 = null;
        int stackOut_144_3 = 0;
        int stackOut_188_0 = 0;
        int stackOut_187_0 = 0;
        bg stackOut_217_0 = null;
        bg stackOut_219_0 = null;
        int stackOut_219_1 = 0;
        bg stackOut_218_0 = null;
        int stackOut_218_1 = 0;
        bg stackOut_220_0 = null;
        int stackOut_220_1 = 0;
        int[] stackOut_220_2 = null;
        bg stackOut_222_0 = null;
        int stackOut_222_1 = 0;
        int[] stackOut_222_2 = null;
        int stackOut_222_3 = 0;
        bg stackOut_221_0 = null;
        int stackOut_221_1 = 0;
        int[] stackOut_221_2 = null;
        int stackOut_221_3 = 0;
        bg stackOut_203_0 = null;
        int stackOut_203_1 = 0;
        int[] stackOut_203_2 = null;
        bg stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        int[] stackOut_205_2 = null;
        int stackOut_205_3 = 0;
        bg stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        int[] stackOut_204_2 = null;
        int stackOut_204_3 = 0;
        int stackOut_259_0 = 0;
        int stackOut_258_0 = 0;
        int stackOut_246_0 = 0;
        int stackOut_245_0 = 0;
        bh stackOut_304_0 = null;
        int stackOut_304_1 = 0;
        bh stackOut_305_0 = null;
        int stackOut_305_1 = 0;
        bh stackOut_308_0 = null;
        int stackOut_308_1 = 0;
        int stackOut_308_2 = 0;
        bh stackOut_306_0 = null;
        int stackOut_306_1 = 0;
        bh stackOut_307_0 = null;
        int stackOut_307_1 = 0;
        int stackOut_307_2 = 0;
        int stackOut_323_0 = 0;
        int stackOut_322_0 = 0;
        hb stackOut_29_0 = null;
        hb stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        hb stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        L0: {
          var34 = null;
          var37 = null;
          var32 = Vertigo2.field_L ? 1 : 0;
          var33 = param4.field_f;
          var10 = var33;
          if (param4.field_w != 2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            var11 = stackIn_3_0;
            if (param8 < 0) {
              break L2;
            } else {
              if (!param4.c((byte) 104)) {
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        L3: {
          var12 = stackIn_7_0;
          if (var12 != 0) {
            L4: {
              if (!param4.d(-2)) {
                break L4;
              } else {
                if (0 > param0) {
                  break L4;
                } else {
                  L5: {
                    if (!((am) this).field_s.field_o) {
                      ((am) this).field_s.d(550);
                      ((am) this).field_s.a(param4.field_D, param4.field_A, param4.field_v, false, param4.field_h, param4.field_K, param4.field_z);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((am) this).field_s.a(0, 0, 12257, 0);
                  break L3;
                }
              }
            }
            L6: {
              if (!((am) this).field_s.field_o) {
                break L6;
              } else {
                ((am) this).field_s.field_o = false;
                ((am) this).field_s.d(550);
                break L6;
              }
            }
            var14_ref_wo = var33[param8];
            if (((am) this).field_d == ((am) this).field_l) {
              if (5 == param4.h(9979)) {
                break L3;
              } else {
                ((am) this).field_s.a(var14_ref_wo.field_k, var14_ref_wo.field_E, 12257, var14_ref_wo.field_y);
                break L3;
              }
            } else {
              var15 = -var10[((am) this).field_d].field_E + var14_ref_wo.field_E;
              var16 = var14_ref_wo.field_y + -var10[((am) this).field_d].field_y;
              var17 = -var10[((am) this).field_d].field_k + var14_ref_wo.field_k;
              ((am) this).field_s.a((int)((float)var17 * ((am) this).field_p) + var10[((am) this).field_d].field_k, (int)(((am) this).field_p * (float)var15) + var10[((am) this).field_d].field_E, 12257, var10[((am) this).field_d].field_y + (int)((float)var16 * ((am) this).field_p));
              break L3;
            }
          } else {
            L7: {
              if (param4.field_w == 0) {
                break L7;
              } else {
                if (3 == param4.field_w) {
                  break L7;
                } else {
                  L8: {
                    if (param3) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L8;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      break L8;
                    }
                  }
                  hn.a(stackIn_13_0 != 0, 180, -120, ((am) this).field_s.field_e, -270, -80, -140, 180, 0, 0, -1);
                  break L3;
                }
              }
            }
            hn.a(false, param4.field_f[0].field_E, -420, ((am) this).field_s.field_e, -270, -64, -140, param4.field_f[0].field_y, 0, 0, -1);
            break L3;
          }
        }
        var13 = 0;
        L9: while (true) {
          if (((am) this).field_c.length <= var13) {
            L10: {
              if (hn.field_t) {
                qr.field_l.a(((am) this).field_s.field_e, 28580);
                break L10;
              } else {
                ue.field_N.c(0, 0);
                break L10;
              }
            }
            L11: {
              sc.a(param3, rg.field_f);
              var13 = param4.h(9979);
              if (var13 == 4) {
                L12: {
                  var14 = 255 * param4.field_n / 200;
                  if (var14 <= 255) {
                    break L12;
                  } else {
                    var14 = 255;
                    break L12;
                  }
                }
                if (0 < var14) {
                  jn.a(((am) this).field_s.field_e, 3000, (fb) (Object) ie.field_Hb, 1300, var14, (ie.field_Hb.field_B << 3) + 2000, 4000, 10, 2000 + (ie.field_Hb.field_x << 3));
                  break L11;
                } else {
                  break L11;
                }
              } else {
                break L11;
              }
            }
            L13: {
              L14: {
                var14 = ((am) this).field_s.field_e[0];
                var15 = ((am) this).field_s.field_e[2];
                var16 = ((am) this).field_s.field_e[1];
                if (var13 == 7) {
                  break L14;
                } else {
                  if (var13 == 6) {
                    break L14;
                  } else {
                    if (3 == var13) {
                      break L14;
                    } else {
                      if (var13 != 4) {
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
              }
              stackOut_48_0 = 1;
              stackIn_50_0 = stackOut_48_0;
              break L13;
            }
            L15: {
              var17 = stackIn_50_0;
              if (cn.field_r) {
                L16: {
                  var18_ref_fe = sf.field_b;
                  var19 = sf.field_b.field_y << 3;
                  var20_int = sf.field_b.field_t << 3;
                  var21_int = Vertigo2.field_C.field_y << 3;
                  var22 = Vertigo2.field_C.field_t << 3;
                  var23 = ji.field_p.field_y << 3;
                  var24 = ji.field_p.field_t << 3;
                  var25 = jf.field_M.field_y << 3;
                  var26 = jf.field_M.field_t << 3;
                  if (var13 != 4) {
                    gb.a(((am) this).field_r[0][1], (fb) (Object) jf.field_M, var26, ((am) this).field_r[0][0], ((am) this).field_s.field_e, ((am) this).field_r[0][2], var25, -86);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (var13 != 4) {
                    var27_int = 0;
                    L18: while (true) {
                      if (var27_int >= 1000) {
                        break L17;
                      } else {
                        gb.a(((am) this).field_u[var27_int][1], (fb) (Object) var18_ref_fe, var20_int, ((am) this).field_u[var27_int][0], ((am) this).field_s.field_e, ((am) this).field_u[var27_int][2], var19, -95);
                        var27_int++;
                        continue L18;
                      }
                    }
                  } else {
                    if (200 > param4.field_n) {
                      var27_int = -(param4.field_n * 255 / 200) + 255;
                      var28 = 0;
                      L19: while (true) {
                        if (var28 >= 1000) {
                          break L17;
                        } else {
                          jn.a(((am) this).field_s.field_e, ((am) this).field_u[var28][2], (fb) (Object) var18_ref_fe, ((am) this).field_u[var28][1], var27_int, var20_int, ((am) this).field_u[var28][0], 10, var19);
                          var28++;
                          continue L19;
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                if (var13 != 4) {
                  gb.a(((am) this).field_v[0][1], (fb) (Object) Vertigo2.field_C, var22, ((am) this).field_v[0][0], ((am) this).field_s.field_e, ((am) this).field_v[0][2], var21_int, -128);
                  gb.a(((am) this).field_v[1][1], (fb) (Object) ji.field_p, var24, ((am) this).field_v[1][0], ((am) this).field_s.field_e, ((am) this).field_v[1][2], var23, -128);
                  break L15;
                } else {
                  break L15;
                }
              } else {
                break L15;
              }
            }
            L20: {
              if (gi.field_r) {
                bi.a(0, 0, 640, 480);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              var18 = var16 - 240;
              if (param4.h(9979) != 1) {
                break L21;
              } else {
                if (((am) this).field_s.field_o) {
                  break L21;
                } else {
                  if (var16 - -240 < var33[param8].field_k) {
                    var18 = var16;
                    break L21;
                  } else {
                    break L21;
                  }
                }
              }
            }
            var19 = 0;
            var20 = param4.c(108);
            var21_int = -1 + param4.l(81);
            L22: while (true) {
              if (var21_int < 0) {
                var21 = param4.m(9384);
                var22 = param4.e((byte) -128) + -1;
                L23: while (true) {
                  if (var22 < 0) {
                    var22 = 0;
                    L24: while (true) {
                      if (((am) this).field_g.length <= var22) {
                        L25: {
                          if (var17 != 0) {
                            L26: {
                              ((am) this).field_c[0].a(param8, -25196);
                              if (((am) this).field_c.length <= 1) {
                                break L26;
                              } else {
                                ((am) this).field_c[1].a(1 - param8, -25196);
                                break L26;
                              }
                            }
                            if (var13 == 0) {
                              break L25;
                            } else {
                              var22 = 0;
                              L27: while (true) {
                                if (var22 >= ((am) this).field_c.length) {
                                  break L25;
                                } else {
                                  ((am) this).field_j[var19] = ((am) this).field_c[var22].a(var14, var15, 0, var16);
                                  int incrementValue$7 = var19;
                                  var19++;
                                  ((am) this).field_a[incrementValue$7] = (bg) (Object) ((am) this).field_c[var22];
                                  var22++;
                                  continue L27;
                                }
                              }
                            }
                          } else {
                            if (var13 == 0) {
                              break L25;
                            } else {
                              var22 = 0;
                              L28: while (true) {
                                if (var22 >= ((am) this).field_c.length) {
                                  break L25;
                                } else {
                                  ((am) this).field_j[var19] = ((am) this).field_c[var22].a(var14, var15, 0, var16);
                                  int incrementValue$8 = var19;
                                  var19++;
                                  ((am) this).field_a[incrementValue$8] = (bg) (Object) ((am) this).field_c[var22];
                                  var22++;
                                  continue L28;
                                }
                              }
                            }
                          }
                        }
                        L29: {
                          this.a(-1 + var19, 3, 0);
                          if (lf.field_C) {
                            L30: {
                              L31: {
                                if (null == dc.field_J) {
                                  break L31;
                                } else {
                                  if (dc.field_J.length == ((am) this).field_c.length) {
                                    break L30;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                              dc.field_J = new lg[((am) this).field_c.length];
                              break L30;
                            }
                            L32: {
                              L33: {
                                if (null == oe.field_ob) {
                                  break L33;
                                } else {
                                  if (((am) this).field_c.length == oe.field_ob.length) {
                                    break L32;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                              oe.field_ob = new int[((am) this).field_c.length][3];
                              break L32;
                            }
                            L34: {
                              if (null != va.field_b) {
                                break L34;
                              } else {
                                va.field_b = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
                                break L34;
                              }
                            }
                            var22 = 0;
                            L35: while (true) {
                              if (((am) this).field_c.length <= var22) {
                                break L29;
                              } else {
                                ((am) this).field_c[var22].b(true);
                                dc.field_J[var22] = ((am) this).field_c[var22].c((byte) 4);
                                oe.field_ob[var22][0] = ((am) this).field_c[var22].field_w;
                                oe.field_ob[var22][1] = ((am) this).field_c[var22].field_z;
                                oe.field_ob[var22][2] = ((am) this).field_c[var22].field_x;
                                var22++;
                                continue L35;
                              }
                            }
                          } else {
                            var22 = 0;
                            L36: while (true) {
                              if (~var22 <= ~((am) this).field_c.length) {
                                break L29;
                              } else {
                                ((am) this).field_c[var22].b(true);
                                var22++;
                                continue L36;
                              }
                            }
                          }
                        }
                        L37: {
                          L38: {
                            var22 = param4.field_n;
                            if (((am) this).field_s.c(-1870) == 2) {
                              break L38;
                            } else {
                              if (((am) this).field_s.b(1) != 2) {
                                stackOut_126_0 = 0;
                                stackIn_127_0 = stackOut_126_0;
                                break L37;
                              } else {
                                break L38;
                              }
                            }
                          }
                          stackOut_125_0 = 1;
                          stackIn_127_0 = stackOut_125_0;
                          break L37;
                        }
                        L39: {
                          L40: {
                            var23 = stackIn_127_0;
                            if (var13 == 2) {
                              break L40;
                            } else {
                              if (var13 == 7) {
                                break L40;
                              } else {
                                var24 = var19 - 1;
                                L41: while (true) {
                                  if (0 > var24) {
                                    break L39;
                                  } else {
                                    L42: {
                                      if (!(((am) this).field_a[var24] instanceof hb)) {
                                        L43: {
                                          var25_ref_int__ = oo.field_c;
                                          var26 = ((am) this).field_a[var24].a(5) - var33[param8].field_k;
                                          if (var26 <= 0) {
                                            break L43;
                                          } else {
                                            if (!((am) this).field_s.field_o) {
                                              L44: {
                                                if (var26 < 720) {
                                                  var27_int = var26 / hn.field_v;
                                                  break L44;
                                                } else {
                                                  var27_int = 15;
                                                  break L44;
                                                }
                                              }
                                              oo.field_c = Vertigo2.field_J[var27_int];
                                              break L43;
                                            } else {
                                              break L43;
                                            }
                                          }
                                        }
                                        L45: {
                                          if (var23 != 0) {
                                            if (((am) this).field_a[var24].a(5) < -16 + var33[param8].field_k) {
                                              L46: {
                                                var27_int = 24;
                                                var28_ref = (Object) (Object) oo.field_c;
                                                var29 = var27_int;
                                                if (12 > var29) {
                                                  break L46;
                                                } else {
                                                  var29 = 11;
                                                  break L46;
                                                }
                                              }
                                              L47: {
                                                oo.field_c = bm.field_G[var29];
                                                var27_int -= 12;
                                                var30_ref = null;
                                                if (var27_int >= 0) {
                                                  L48: {
                                                    if (var27_int >= 12) {
                                                      var27_int = 11;
                                                      break L48;
                                                    } else {
                                                      break L48;
                                                    }
                                                  }
                                                  var30_ref = (Object) (Object) lf.field_A[var27_int];
                                                  break L47;
                                                } else {
                                                  break L47;
                                                }
                                              }
                                              L49: {
                                                stackOut_163_0 = ((am) this).field_a[var24];
                                                stackOut_163_1 = -30;
                                                stackOut_163_2 = ((am) this).field_s.field_e;
                                                stackIn_165_0 = stackOut_163_0;
                                                stackIn_165_1 = stackOut_163_1;
                                                stackIn_165_2 = stackOut_163_2;
                                                stackIn_164_0 = stackOut_163_0;
                                                stackIn_164_1 = stackOut_163_1;
                                                stackIn_164_2 = stackOut_163_2;
                                                if (param4.field_w != 2) {
                                                  stackOut_165_0 = (bg) (Object) stackIn_165_0;
                                                  stackOut_165_1 = stackIn_165_1;
                                                  stackOut_165_2 = (int[]) (Object) stackIn_165_2;
                                                  stackOut_165_3 = 0;
                                                  stackIn_166_0 = stackOut_165_0;
                                                  stackIn_166_1 = stackOut_165_1;
                                                  stackIn_166_2 = stackOut_165_2;
                                                  stackIn_166_3 = stackOut_165_3;
                                                  break L49;
                                                } else {
                                                  stackOut_164_0 = (bg) (Object) stackIn_164_0;
                                                  stackOut_164_1 = stackIn_164_1;
                                                  stackOut_164_2 = (int[]) (Object) stackIn_164_2;
                                                  stackOut_164_3 = 1;
                                                  stackIn_166_0 = stackOut_164_0;
                                                  stackIn_166_1 = stackOut_164_1;
                                                  stackIn_166_2 = stackOut_164_2;
                                                  stackIn_166_3 = stackOut_164_3;
                                                  break L49;
                                                }
                                              }
                                              ((bg) (Object) stackIn_166_0).a(stackIn_166_1, stackIn_166_2, stackIn_166_3 != 0, (byte[]) var30_ref, ((am) this).field_s.field_o);
                                              oo.field_c = (int[]) var28_ref;
                                              break L45;
                                            } else {
                                              L50: {
                                                stackOut_148_0 = ((am) this).field_a[var24];
                                                stackIn_150_0 = stackOut_148_0;
                                                stackIn_149_0 = stackOut_148_0;
                                                if (param3) {
                                                  stackOut_150_0 = (bg) (Object) stackIn_150_0;
                                                  stackOut_150_1 = 0;
                                                  stackIn_151_0 = stackOut_150_0;
                                                  stackIn_151_1 = stackOut_150_1;
                                                  break L50;
                                                } else {
                                                  stackOut_149_0 = (bg) (Object) stackIn_149_0;
                                                  stackOut_149_1 = 1;
                                                  stackIn_151_0 = stackOut_149_0;
                                                  stackIn_151_1 = stackOut_149_1;
                                                  break L50;
                                                }
                                              }
                                              L51: {
                                                stackOut_151_0 = (bg) (Object) stackIn_151_0;
                                                stackOut_151_1 = stackIn_151_1;
                                                stackOut_151_2 = ((am) this).field_s.field_e;
                                                stackIn_153_0 = stackOut_151_0;
                                                stackIn_153_1 = stackOut_151_1;
                                                stackIn_153_2 = stackOut_151_2;
                                                stackIn_152_0 = stackOut_151_0;
                                                stackIn_152_1 = stackOut_151_1;
                                                stackIn_152_2 = stackOut_151_2;
                                                if (param4.field_w != 2) {
                                                  stackOut_153_0 = (bg) (Object) stackIn_153_0;
                                                  stackOut_153_1 = stackIn_153_1;
                                                  stackOut_153_2 = (int[]) (Object) stackIn_153_2;
                                                  stackOut_153_3 = 0;
                                                  stackIn_154_0 = stackOut_153_0;
                                                  stackIn_154_1 = stackOut_153_1;
                                                  stackIn_154_2 = stackOut_153_2;
                                                  stackIn_154_3 = stackOut_153_3;
                                                  break L51;
                                                } else {
                                                  stackOut_152_0 = (bg) (Object) stackIn_152_0;
                                                  stackOut_152_1 = stackIn_152_1;
                                                  stackOut_152_2 = (int[]) (Object) stackIn_152_2;
                                                  stackOut_152_3 = 1;
                                                  stackIn_154_0 = stackOut_152_0;
                                                  stackIn_154_1 = stackOut_152_1;
                                                  stackIn_154_2 = stackOut_152_2;
                                                  stackIn_154_3 = stackOut_152_3;
                                                  break L51;
                                                }
                                              }
                                              ((bg) (Object) stackIn_154_0).a(stackIn_154_1 != 0, stackIn_154_2, stackIn_154_3 != 0, ((am) this).field_s.field_o);
                                              break L45;
                                            }
                                          } else {
                                            L52: {
                                              stackOut_143_0 = ((am) this).field_a[var24];
                                              stackOut_143_1 = 0;
                                              stackOut_143_2 = ((am) this).field_s.field_e;
                                              stackIn_145_0 = stackOut_143_0;
                                              stackIn_145_1 = stackOut_143_1;
                                              stackIn_145_2 = stackOut_143_2;
                                              stackIn_144_0 = stackOut_143_0;
                                              stackIn_144_1 = stackOut_143_1;
                                              stackIn_144_2 = stackOut_143_2;
                                              if (param4.field_w != 2) {
                                                stackOut_145_0 = (bg) (Object) stackIn_145_0;
                                                stackOut_145_1 = stackIn_145_1;
                                                stackOut_145_2 = (int[]) (Object) stackIn_145_2;
                                                stackOut_145_3 = 0;
                                                stackIn_146_0 = stackOut_145_0;
                                                stackIn_146_1 = stackOut_145_1;
                                                stackIn_146_2 = stackOut_145_2;
                                                stackIn_146_3 = stackOut_145_3;
                                                break L52;
                                              } else {
                                                stackOut_144_0 = (bg) (Object) stackIn_144_0;
                                                stackOut_144_1 = stackIn_144_1;
                                                stackOut_144_2 = (int[]) (Object) stackIn_144_2;
                                                stackOut_144_3 = 1;
                                                stackIn_146_0 = stackOut_144_0;
                                                stackIn_146_1 = stackOut_144_1;
                                                stackIn_146_2 = stackOut_144_2;
                                                stackIn_146_3 = stackOut_144_3;
                                                break L52;
                                              }
                                            }
                                            ((bg) (Object) stackIn_146_0).a(stackIn_146_1 != 0, stackIn_146_2, stackIn_146_3 != 0, ((am) this).field_s.field_o);
                                            break L45;
                                          }
                                        }
                                        oo.field_c = var25_ref_int__;
                                        break L42;
                                      } else {
                                        var34_ref = (hb) (Object) ((am) this).field_a[var24];
                                        if (~var34_ref.b(100) != ~param8) {
                                          var34_ref.a(-30, ((am) this).field_s.field_e, var11 != 0, lf.field_A[5], ((am) this).field_s.field_o);
                                          break L42;
                                        } else {
                                          var34_ref.a(false, ((am) this).field_s.field_e, var11 != 0, ((am) this).field_s.field_o);
                                          break L42;
                                        }
                                      }
                                    }
                                    L53: {
                                      if (!lf.field_C) {
                                        break L53;
                                      } else {
                                        if (var13 != 0) {
                                          if (((am) this).field_a[var24].field_d != 0) {
                                            var25 = 0;
                                            L54: while (true) {
                                              if (~var25 <= ~((am) this).field_c.length) {
                                                break L53;
                                              } else {
                                                L55: {
                                                  if (dc.field_J[var25] == null) {
                                                    break L55;
                                                  } else {
                                                    if ((var25 - -1 & ((am) this).field_a[var24].field_d) == 0) {
                                                      break L55;
                                                    } else {
                                                      va.field_b[0] = oe.field_ob[var25][0];
                                                      va.field_b[2] = oe.field_ob[var25][1];
                                                      va.field_b[1] = ((am) this).field_a[var24].a(true);
                                                      var26 = -(128 * (va.field_b[1] - oe.field_ob[var25][2]) / 960) + 128;
                                                      if (var26 <= 10) {
                                                        break L55;
                                                      } else {
                                                        if (var26 <= 128) {
                                                          var35 = new lg(dc.field_J[var25], false, true, true, true);
                                                          var35.b(var26, 128, var26);
                                                          var36 = ((am) this).field_a[var24].a(var35, oe.field_ob[var25][0], oe.field_ob[var25][1], (byte) -101);
                                                          if (var36 == null) {
                                                            break L55;
                                                          } else {
                                                            if (var36.field_T >= 4096) {
                                                              break L55;
                                                            } else {
                                                              if (var36.field_w >= 4096) {
                                                                break L55;
                                                              } else {
                                                                var36.field_K = false;
                                                                var36.a(((am) this).field_s.field_e, va.field_b);
                                                                break L55;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          break L55;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var25++;
                                                continue L54;
                                              }
                                            }
                                          } else {
                                            break L53;
                                          }
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                    var24--;
                                    continue L41;
                                  }
                                }
                              }
                            }
                          }
                          L56: {
                            if (var22 < 50) {
                              stackOut_188_0 = 0;
                              stackIn_189_0 = stackOut_188_0;
                              break L56;
                            } else {
                              stackOut_187_0 = 1;
                              stackIn_189_0 = stackOut_187_0;
                              break L56;
                            }
                          }
                          var24 = stackIn_189_0;
                          if (var24 != 0) {
                            var25 = 0;
                            L57: while (true) {
                              if (~((am) this).field_c.length >= ~var25) {
                                ((am) this).field_s.field_e[1] = ((am) this).field_s.field_e[1] - (-1000 + var22 * 20);
                                var25 = -1 + var19;
                                L58: while (true) {
                                  if (var25 < 0) {
                                    break L39;
                                  } else {
                                    L59: {
                                      if (((am) this).field_a[var25] instanceof hb) {
                                        L60: {
                                          stackOut_217_0 = ((am) this).field_a[var25];
                                          stackIn_219_0 = stackOut_217_0;
                                          stackIn_218_0 = stackOut_217_0;
                                          if (param3) {
                                            stackOut_219_0 = (bg) (Object) stackIn_219_0;
                                            stackOut_219_1 = 0;
                                            stackIn_220_0 = stackOut_219_0;
                                            stackIn_220_1 = stackOut_219_1;
                                            break L60;
                                          } else {
                                            stackOut_218_0 = (bg) (Object) stackIn_218_0;
                                            stackOut_218_1 = 1;
                                            stackIn_220_0 = stackOut_218_0;
                                            stackIn_220_1 = stackOut_218_1;
                                            break L60;
                                          }
                                        }
                                        L61: {
                                          stackOut_220_0 = (bg) (Object) stackIn_220_0;
                                          stackOut_220_1 = stackIn_220_1;
                                          stackOut_220_2 = ((am) this).field_s.field_e;
                                          stackIn_222_0 = stackOut_220_0;
                                          stackIn_222_1 = stackOut_220_1;
                                          stackIn_222_2 = stackOut_220_2;
                                          stackIn_221_0 = stackOut_220_0;
                                          stackIn_221_1 = stackOut_220_1;
                                          stackIn_221_2 = stackOut_220_2;
                                          if (param4.field_w != 2) {
                                            stackOut_222_0 = (bg) (Object) stackIn_222_0;
                                            stackOut_222_1 = stackIn_222_1;
                                            stackOut_222_2 = (int[]) (Object) stackIn_222_2;
                                            stackOut_222_3 = 0;
                                            stackIn_223_0 = stackOut_222_0;
                                            stackIn_223_1 = stackOut_222_1;
                                            stackIn_223_2 = stackOut_222_2;
                                            stackIn_223_3 = stackOut_222_3;
                                            break L61;
                                          } else {
                                            stackOut_221_0 = (bg) (Object) stackIn_221_0;
                                            stackOut_221_1 = stackIn_221_1;
                                            stackOut_221_2 = (int[]) (Object) stackIn_221_2;
                                            stackOut_221_3 = 1;
                                            stackIn_223_0 = stackOut_221_0;
                                            stackIn_223_1 = stackOut_221_1;
                                            stackIn_223_2 = stackOut_221_2;
                                            stackIn_223_3 = stackOut_221_3;
                                            break L61;
                                          }
                                        }
                                        ((bg) (Object) stackIn_223_0).a(stackIn_223_1 != 0, stackIn_223_2, stackIn_223_3 != 0, ((am) this).field_s.field_o);
                                        break L59;
                                      } else {
                                        break L59;
                                      }
                                    }
                                    var25--;
                                    continue L58;
                                  }
                                }
                              } else {
                                ((am) this).field_c[var25].a(6, (byte) -36);
                                var25++;
                                continue L57;
                              }
                            }
                          } else {
                            L62: {
                              var25 = var22 * 24 / 50;
                              var26_ref_int__ = oo.field_c;
                              var27_int = var25;
                              if (12 > var27_int) {
                                break L62;
                              } else {
                                var27_int = 11;
                                break L62;
                              }
                            }
                            L63: {
                              oo.field_c = bm.field_G[var27_int];
                              var28_ref = null;
                              var25 -= 12;
                              if (0 > var25) {
                                break L63;
                              } else {
                                L64: {
                                  if (var25 >= 12) {
                                    var25 = 11;
                                    break L64;
                                  } else {
                                    break L64;
                                  }
                                }
                                var28_ref = (Object) (Object) lf.field_A[var25];
                                break L63;
                              }
                            }
                            var29 = var19 + -1;
                            L65: while (true) {
                              if (var29 < 0) {
                                oo.field_c = var26_ref_int__;
                                break L39;
                              } else {
                                L66: {
                                  if (((am) this).field_a[var29] instanceof hb) {
                                    L67: {
                                      var37_ref = (hb) (Object) ((am) this).field_a[var29];
                                      oo.field_c = var26_ref_int__;
                                      if (~var37_ref.b(108) != ~param8) {
                                        L68: {
                                          stackOut_203_0 = ((am) this).field_a[var29];
                                          stackOut_203_1 = -30;
                                          stackOut_203_2 = ((am) this).field_s.field_e;
                                          stackIn_205_0 = stackOut_203_0;
                                          stackIn_205_1 = stackOut_203_1;
                                          stackIn_205_2 = stackOut_203_2;
                                          stackIn_204_0 = stackOut_203_0;
                                          stackIn_204_1 = stackOut_203_1;
                                          stackIn_204_2 = stackOut_203_2;
                                          if (param4.field_w != 2) {
                                            stackOut_205_0 = (bg) (Object) stackIn_205_0;
                                            stackOut_205_1 = stackIn_205_1;
                                            stackOut_205_2 = (int[]) (Object) stackIn_205_2;
                                            stackOut_205_3 = 0;
                                            stackIn_206_0 = stackOut_205_0;
                                            stackIn_206_1 = stackOut_205_1;
                                            stackIn_206_2 = stackOut_205_2;
                                            stackIn_206_3 = stackOut_205_3;
                                            break L68;
                                          } else {
                                            stackOut_204_0 = (bg) (Object) stackIn_204_0;
                                            stackOut_204_1 = stackIn_204_1;
                                            stackOut_204_2 = (int[]) (Object) stackIn_204_2;
                                            stackOut_204_3 = 1;
                                            stackIn_206_0 = stackOut_204_0;
                                            stackIn_206_1 = stackOut_204_1;
                                            stackIn_206_2 = stackOut_204_2;
                                            stackIn_206_3 = stackOut_204_3;
                                            break L68;
                                          }
                                        }
                                        ((bg) (Object) stackIn_206_0).a(stackIn_206_1, stackIn_206_2, stackIn_206_3 != 0, lf.field_A[8], ((am) this).field_s.field_o);
                                        break L67;
                                      } else {
                                        var37_ref.a(false, ((am) this).field_s.field_e, var11 != 0, ((am) this).field_s.field_o);
                                        break L67;
                                      }
                                    }
                                    oo.field_c = bm.field_G[var27_int];
                                    break L66;
                                  } else {
                                    ((am) this).field_a[var29].a(-30, ((am) this).field_s.field_e, var11 != 0, (byte[]) var28_ref, ((am) this).field_s.field_o);
                                    break L66;
                                  }
                                }
                                var29--;
                                continue L65;
                              }
                            }
                          }
                        }
                        var24 = 0;
                        L69: while (true) {
                          if (var24 >= ((am) this).field_g.length) {
                            L70: {
                              L71: {
                                var27_int = var13;
                                if (var27_int == 0) {
                                  if (param4.field_w != 0) {
                                    if (param4.field_w != 1) {
                                      if (param4.field_w != 2) {
                                        break L71;
                                      } else {
                                        var39 = new String[4];
                                        var27 = var39;
                                        var27[0] = hk.field_r;
                                        var27[1] = Vertigo2.a(new String[2], qh.field_c, -126);
                                        var27[3] = de.field_c;
                                        var27[2] = lh.field_d;
                                        var28 = 1;
                                        var29 = 0;
                                        L72: while (true) {
                                          if (var39.length <= var29) {
                                            var28 += 20;
                                            var29 = 610 - var28 / 2;
                                            qi.a(false, -(var28 / 2) + var29, var28, 5);
                                            va.field_s.a(var39[0], 16777215, -1, var29, 30, 2);
                                            qi.a(false, -(var28 / 2) + var29, var28, 55);
                                            va.field_s.a(var39[1], 16777215, -1, var29, 80, 2);
                                            if (0 <= param0) {
                                              L73: {
                                                if (param3) {
                                                  stackOut_259_0 = 0;
                                                  stackIn_260_0 = stackOut_259_0;
                                                  break L73;
                                                } else {
                                                  stackOut_258_0 = 1;
                                                  stackIn_260_0 = stackOut_258_0;
                                                  break L73;
                                                }
                                              }
                                              qi.a(stackIn_260_0 != 0, var29 - var28 / 2, var28, 105);
                                              if (param8 == 0) {
                                                va.field_s.a(lh.field_d, 16131600, -1, var29, 130, 2);
                                                break L70;
                                              } else {
                                                va.field_s.a(de.field_c, 2479095, -1, var29, 130, 2);
                                                break L70;
                                              }
                                            } else {
                                              break L70;
                                            }
                                          } else {
                                            var28 = Math.max(var28, va.field_s.a(1, var39[var29]));
                                            var29++;
                                            continue L72;
                                          }
                                        }
                                      }
                                    } else {
                                      var38 = new String[4];
                                      var27 = var38;
                                      var27[0] = bq.field_H;
                                      var27[1] = Vertigo2.a(new String[2], qh.field_c, -118);
                                      var27[2] = lh.field_d;
                                      var27[3] = de.field_c;
                                      var28 = 1;
                                      var29 = 0;
                                      L74: while (true) {
                                        if (~var38.length >= ~var29) {
                                          L75: {
                                            var28 += 20;
                                            var29 = -(var28 / 2) + 610;
                                            if (param3) {
                                              stackOut_246_0 = 0;
                                              stackIn_247_0 = stackOut_246_0;
                                              break L75;
                                            } else {
                                              stackOut_245_0 = 1;
                                              stackIn_247_0 = stackOut_245_0;
                                              break L75;
                                            }
                                          }
                                          qi.a(stackIn_247_0 != 0, var29 + -(var28 / 2), var28, 5);
                                          va.field_s.a(var38[0], 16777215, -1, var29, 30, 2);
                                          qi.a(false, -(var28 / 2) + var29, var28, 55);
                                          va.field_s.a(var38[1], 16777215, -1, var29, 80, 2);
                                          if (param0 < 0) {
                                            break L70;
                                          } else {
                                            qi.a(false, -(var28 / 2) + var29, var28, 105);
                                            if (param8 != 0) {
                                              va.field_s.a(var38[3], 2479095, -1, var29, 130, 2);
                                              break L70;
                                            } else {
                                              va.field_s.a(var38[2], 16131600, -1, var29, 130, 2);
                                              break L70;
                                            }
                                          }
                                        } else {
                                          var28 = Math.max(var28, va.field_s.a(1, var38[var29]));
                                          var29++;
                                          continue L74;
                                        }
                                      }
                                    }
                                  } else {
                                    va.field_s.a(620, -45, 16777215, 30, -1, Vertigo2.a(new String[1], bl.field_o, -121));
                                    break L70;
                                  }
                                } else {
                                  if (2 != var27_int) {
                                    if (var27_int == 5) {
                                      L76: {
                                        var24 = -1;
                                        var25 = 0;
                                        if (!param4.k(94)) {
                                          break L76;
                                        } else {
                                          L77: {
                                            if (param0 == 0) {
                                              var24 = 5;
                                              break L77;
                                            } else {
                                              var24 = 7;
                                              break L77;
                                            }
                                          }
                                          var27_int = -(ea.field_d[var24].field_x / 2) + 320;
                                          var25 = 1;
                                          ea.field_d[var24].e(var27_int, 70);
                                          break L76;
                                        }
                                      }
                                      if (param4.b(-15531)) {
                                        L78: {
                                          if (param0 != 1) {
                                            var24 = 8;
                                            break L78;
                                          } else {
                                            var24 = 5;
                                            break L78;
                                          }
                                        }
                                        L79: {
                                          var27_int = 70;
                                          if (var25 != 0) {
                                            var27_int = var27_int + (ea.field_d[7].field_B + 20);
                                            break L79;
                                          } else {
                                            break L79;
                                          }
                                        }
                                        var28 = -(ea.field_d[var24].field_x / 2) + 320;
                                        ea.field_d[var24].e(var28, var27_int);
                                        break L70;
                                      } else {
                                        break L70;
                                      }
                                    } else {
                                      if (var27_int != 3) {
                                        if (4 == var27_int) {
                                          ea.field_d[6].e(-(ea.field_d[6].field_x / 2) + 320, -20);
                                          va.field_s.a(md.field_y, 16777215, -1, 320, 420, 2);
                                          break L70;
                                        } else {
                                          if (var27_int == 6) {
                                            L80: {
                                              if (param4.field_w == 2) {
                                                break L80;
                                              } else {
                                                ea.field_d[1].e(320 - ea.field_d[1].field_x / 2, 70);
                                                break L80;
                                              }
                                            }
                                            if (0 != param4.field_w) {
                                              L81: {
                                                var27_int = (-var22 + 250) / 50;
                                                if (var27_int < 0) {
                                                  var27_int = 0;
                                                  break L81;
                                                } else {
                                                  break L81;
                                                }
                                              }
                                              L82: {
                                                va.field_s.a(Vertigo2.a(new String[1], lr.field_T, -114), 16777215, -1, 320, 420, 2);
                                                if (param4.field_w != 2) {
                                                  break L82;
                                                } else {
                                                  L83: {
                                                    var28 = param4.field_E;
                                                    if (param0 >= 0) {
                                                      if (50 >= var28) {
                                                        if (var28 < 50) {
                                                          if (0 != param8) {
                                                            var29_ref_String = Vertigo2.a(new String[2], pe.field_L, -13);
                                                            ea.field_d[2].e(320 - ea.field_d[2].field_x / 2, 70);
                                                            break L83;
                                                          } else {
                                                            var29_ref_String = Vertigo2.a(new String[2], ad.field_b, -118);
                                                            ea.field_d[3].e(320 + -(ea.field_d[3].field_x / 2), 70);
                                                            break L83;
                                                          }
                                                        } else {
                                                          var29_ref_String = Vertigo2.a(new String[2], gp.field_q, 90);
                                                          ea.field_d[4].e(-(ea.field_d[4].field_x / 2) + 320, 70);
                                                          break L83;
                                                        }
                                                      } else {
                                                        if (param8 != 0) {
                                                          var29_ref_String = Vertigo2.a(new String[2], ad.field_b, 47);
                                                          ea.field_d[3].e(-(ea.field_d[3].field_x / 2) + 320, 70);
                                                          break L83;
                                                        } else {
                                                          var29_ref_String = Vertigo2.a(new String[2], pe.field_L, -126);
                                                          ea.field_d[2].e(320 + -(ea.field_d[2].field_x / 2), 70);
                                                          break L83;
                                                        }
                                                      }
                                                    } else {
                                                      var29_ref_String = Vertigo2.a(new String[2], gp.field_q, -128);
                                                      if (50 >= var28) {
                                                        if (var28 < 50) {
                                                          ea.field_d[10].e(-(ea.field_d[10].field_x / 2) + 320, 70);
                                                          break L83;
                                                        } else {
                                                          ea.field_d[4].e(320 - ea.field_d[4].field_x / 2, 70);
                                                          break L83;
                                                        }
                                                      } else {
                                                        ea.field_d[9].e(320 - ea.field_d[9].field_x / 2, 70);
                                                        break L83;
                                                      }
                                                    }
                                                  }
                                                  va.field_s.a(var29_ref_String, 16777215, -1, 320, 200, 2);
                                                  break L82;
                                                }
                                              }
                                              break L70;
                                            } else {
                                              va.field_s.a(md.field_y, 16777215, -1, 320, 420, 2);
                                              break L70;
                                            }
                                          } else {
                                            if (var27_int != 1) {
                                              break L71;
                                            } else {
                                              L84: {
                                                L85: {
                                                  stackOut_304_0 = (bh) param4;
                                                  stackOut_304_1 = 3;
                                                  stackIn_307_0 = stackOut_304_0;
                                                  stackIn_307_1 = stackOut_304_1;
                                                  stackIn_305_0 = stackOut_304_0;
                                                  stackIn_305_1 = stackOut_304_1;
                                                  if (param4.field_w == 0) {
                                                    break L85;
                                                  } else {
                                                    stackOut_305_0 = (bh) (Object) stackIn_305_0;
                                                    stackOut_305_1 = stackIn_305_1;
                                                    stackIn_308_0 = stackOut_305_0;
                                                    stackIn_308_1 = stackOut_305_1;
                                                    stackIn_306_0 = stackOut_305_0;
                                                    stackIn_306_1 = stackOut_305_1;
                                                    if (param4.field_w != 3) {
                                                      stackOut_308_0 = (bh) (Object) stackIn_308_0;
                                                      stackOut_308_1 = stackIn_308_1;
                                                      stackOut_308_2 = 0;
                                                      stackIn_309_0 = stackOut_308_0;
                                                      stackIn_309_1 = stackOut_308_1;
                                                      stackIn_309_2 = stackOut_308_2;
                                                      break L84;
                                                    } else {
                                                      stackOut_306_0 = (bh) (Object) stackIn_306_0;
                                                      stackOut_306_1 = stackIn_306_1;
                                                      stackIn_307_0 = stackOut_306_0;
                                                      stackIn_307_1 = stackOut_306_1;
                                                      break L85;
                                                    }
                                                  }
                                                }
                                                stackOut_307_0 = (bh) (Object) stackIn_307_0;
                                                stackOut_307_1 = stackIn_307_1;
                                                stackOut_307_2 = 1;
                                                stackIn_309_0 = stackOut_307_0;
                                                stackIn_309_1 = stackOut_307_1;
                                                stackIn_309_2 = stackOut_307_2;
                                                break L84;
                                              }
                                              L86: {
                                                var26 = ((bh) (Object) stackIn_309_0).c(stackIn_309_1, stackIn_309_2 != 0);
                                                ((am) this).field_f.field_d = var26;
                                                ((am) this).field_f.a(200, true, 220, 28, 14);
                                                if (param4.field_w != 2) {
                                                  if (1 == param4.field_w) {
                                                    L87: {
                                                      if (param3) {
                                                        stackOut_323_0 = 0;
                                                        stackIn_324_0 = stackOut_323_0;
                                                        break L87;
                                                      } else {
                                                        stackOut_322_0 = 1;
                                                        stackIn_324_0 = stackOut_322_0;
                                                        break L87;
                                                      }
                                                    }
                                                    qi.a(stackIn_324_0 != 0, 20, va.field_s.a(1, lp.field_A), 55);
                                                    va.field_s.a(16777215, (byte) 104, -1, 20, lp.field_A, 80);
                                                    break L86;
                                                  } else {
                                                    break L86;
                                                  }
                                                } else {
                                                  L88: {
                                                    var27_int = param4.field_I / 50;
                                                    qi.a(false, 20, va.field_s.a(1, tr.field_e), 10);
                                                    if (var27_int < 0) {
                                                      var27_int = 0;
                                                      break L88;
                                                    } else {
                                                      break L88;
                                                    }
                                                  }
                                                  va.field_s.a(16777215, (byte) 52, -1, 20, tr.field_e, 35);
                                                  if (param4.field_I > 0) {
                                                    L89: {
                                                      var40 = Vertigo2.a(new String[1], mc.field_f, -3);
                                                      var29 = va.field_s.a(1, var40);
                                                      qi.a(false, -20 + -var29 + 640, var29, 60);
                                                      var30 = 16777215;
                                                      if (var27_int < 10) {
                                                        var31 = (int)(100.0 * (Math.sin((double)param4.field_I / 8.0) + 1.0)) + 55;
                                                        var30 = var31 + (var31 << 8) - -16711680;
                                                        break L89;
                                                      } else {
                                                        break L89;
                                                      }
                                                    }
                                                    va.field_s.a(var30, (byte) 108, -1, 640 - (var29 - -20), var40, 66 - -va.field_s.field_k);
                                                    break L86;
                                                  } else {
                                                    break L86;
                                                  }
                                                }
                                              }
                                              L90: {
                                                if (param8 < 0) {
                                                  break L90;
                                                } else {
                                                  if (var22 > 25) {
                                                    var33[param8].a(param4.field_w, 3, param5, 0, ((am) this).field_s.field_o, param6);
                                                    break L90;
                                                  } else {
                                                    break L90;
                                                  }
                                                }
                                              }
                                              L91: {
                                                if (param4.field_w != 0) {
                                                  break L91;
                                                } else {
                                                  if (param7 == 0) {
                                                    rq.a(190, 210, 282, 20, 64, 150);
                                                    int discarded$9 = tk.field_c.a(tq.field_c, 40, 292, 200, 160, 16777215, -1, 0, 0, va.field_s.field_c + va.field_s.field_j);
                                                    int discarded$10 = tk.field_c.a(vl.field_g, 50, 294, 160, 160, 16777215, -1, 2, 0, va.field_s.field_c + va.field_s.field_j);
                                                    break L91;
                                                  } else {
                                                    break L91;
                                                  }
                                                }
                                              }
                                              L92: {
                                                if (param4.field_w == 2) {
                                                  break L92;
                                                } else {
                                                  if (1 == param4.field_w) {
                                                    break L92;
                                                  } else {
                                                    break L70;
                                                  }
                                                }
                                              }
                                              var41 = new String[2];
                                              var27 = var41;
                                              var27[0] = Vertigo2.a(new String[1], dk.field_m, -125);
                                              var27[1] = Vertigo2.a(new String[1], lk.field_h, -125);
                                              var28 = 1;
                                              var29 = 0;
                                              L93: while (true) {
                                                if (var29 >= var41.length) {
                                                  L94: {
                                                    var29 = 20;
                                                    var30 = 85;
                                                    if (param4.field_w == 1) {
                                                      var30 += 45;
                                                      break L94;
                                                    } else {
                                                      break L94;
                                                    }
                                                  }
                                                  L95: {
                                                    if (param0 == 0) {
                                                      break L95;
                                                    } else {
                                                      qi.a(false, var29, var28, 5 + (-30 + var30));
                                                      va.field_s.a(16131600, (byte) 89, -1, var29, var41[0], var30);
                                                      var30 += 50;
                                                      break L95;
                                                    }
                                                  }
                                                  if (param0 == 1) {
                                                    break L71;
                                                  } else {
                                                    qi.a(false, var29, var28, -30 + var30 - -5);
                                                    va.field_s.a(2479095, (byte) 98, -1, var29, var41[1], var30);
                                                    break L70;
                                                  }
                                                } else {
                                                  L96: {
                                                    if (~param0 != ~var29) {
                                                      var28 = Math.max(var28, va.field_s.a(1, var41[var29]));
                                                      break L96;
                                                    } else {
                                                      break L96;
                                                    }
                                                  }
                                                  var29++;
                                                  continue L93;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        ea.field_d[0].e(320 + -(ea.field_d[0].field_x / 2), 70);
                                        va.field_s.a(md.field_y, 16777215, -1, 320, 420, 2);
                                        break L70;
                                      }
                                    }
                                  } else {
                                    break L70;
                                  }
                                }
                              }
                              break L70;
                            }
                            return;
                          } else {
                            ((am) this).field_g[var24].a(((am) this).field_s.field_e, -926966430);
                            var24++;
                            continue L69;
                          }
                        }
                      } else {
                        L97: {
                          var23_ref_hi__ = ((am) this).field_g[var22].b(-34);
                          if (var23_ref_hi__ == null) {
                            break L97;
                          } else {
                            var24 = 0;
                            L98: while (true) {
                              if (((am) this).field_g[var22].field_k <= var24) {
                                break L97;
                              } else {
                                ((am) this).field_j[var19] = var23_ref_hi__[var24].a((byte) -127, var15, var14, var16);
                                int incrementValue$11 = var19;
                                var19++;
                                ((am) this).field_a[incrementValue$11] = (bg) (Object) var23_ref_hi__[var24];
                                var24++;
                                continue L98;
                              }
                            }
                          }
                        }
                        var22++;
                        continue L24;
                      }
                    }
                  } else {
                    L99: {
                      if (var18 < var21[var22].field_s) {
                        ((am) this).field_j[var19] = var21[var22].a(var15, -104, var14, var16);
                        int incrementValue$12 = var19;
                        var19++;
                        ((am) this).field_a[incrementValue$12] = (bg) (Object) var21[var22];
                        break L99;
                      } else {
                        break L99;
                      }
                    }
                    var22--;
                    continue L23;
                  }
                }
              } else {
                L100: {
                  if (var20[var21_int] == null) {
                    break L100;
                  } else {
                    if (var18 >= var20[var21_int].field_s) {
                      break L100;
                    } else {
                      ((am) this).field_j[var19] = var20[var21_int].a(var15, -112, var14, var16);
                      int incrementValue$13 = var19;
                      var19++;
                      ((am) this).field_a[incrementValue$13] = (bg) (Object) var20[var21_int];
                      break L100;
                    }
                  }
                }
                var21_int--;
                continue L22;
              }
            }
          } else {
            L101: {
              stackOut_29_0 = ((am) this).field_c[var13];
              stackIn_31_0 = stackOut_29_0;
              stackIn_30_0 = stackOut_29_0;
              if (param3) {
                stackOut_31_0 = (hb) (Object) stackIn_31_0;
                stackOut_31_1 = 0;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                break L101;
              } else {
                stackOut_30_0 = (hb) (Object) stackIn_30_0;
                stackOut_30_1 = 1;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                break L101;
              }
            }
            ((hb) (Object) stackIn_32_0).a(stackIn_32_1 != 0, var33[var13]);
            var13++;
            continue L9;
          }
        }
    }

    final int a(byte param0) {
        if (param0 >= -105) {
            return 101;
        }
        return ((am) this).field_s.field_q;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        bg var6 = null;
        int var7 = 0;
        int var8 = 0;
        bg var9 = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          if (param1 == 3) {
            break L0;
          } else {
            ((am) this).field_v = null;
            break L0;
          }
        }
        L1: {
          if (param0 <= param2) {
            break L1;
          } else {
            var4 = (param0 + param2) / 2;
            L2: while (true) {
              if (null != ((am) this).field_a[var4]) {
                var5 = param2;
                var6 = ((am) this).field_a[var4];
                var7 = ((am) this).field_j[var4];
                ((am) this).field_a[var4] = ((am) this).field_a[param0];
                ((am) this).field_a[param0] = var6;
                ((am) this).field_j[var4] = ((am) this).field_j[param0];
                ((am) this).field_j[param0] = var7;
                var8 = param2;
                L3: while (true) {
                  if (param0 <= var8) {
                    ((am) this).field_a[param0] = ((am) this).field_a[var5];
                    ((am) this).field_j[param0] = ((am) this).field_j[var5];
                    ((am) this).field_a[var5] = var6;
                    ((am) this).field_j[var5] = var7;
                    this.a(var5 + -1, param1, param2);
                    this.a(param0, 3, 1 + var5);
                    break L1;
                  } else {
                    if (null == ((am) this).field_a[var8]) {
                      ((am) this).field_a[var8] = ((am) this).field_a[var5];
                      ((am) this).field_j[var8] = ((am) this).field_j[var5];
                      int incrementValue$2 = var5;
                      var5++;
                      ((am) this).field_a[incrementValue$2] = null;
                      var8++;
                      continue L3;
                    } else {
                      if (var7 > ((am) this).field_j[var8]) {
                        var9 = ((am) this).field_a[var8];
                        var10 = ((am) this).field_j[var8];
                        ((am) this).field_a[var8] = ((am) this).field_a[var5];
                        ((am) this).field_j[var8] = ((am) this).field_j[var5];
                        ((am) this).field_a[var5] = var9;
                        ((am) this).field_j[var5] = var10;
                        var5++;
                        var8++;
                        continue L3;
                      } else {
                        var8++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                if (param2 != var4) {
                  ((am) this).field_a[var4] = ((am) this).field_a[param2];
                  int incrementValue$3 = param2;
                  param2++;
                  ((am) this).field_a[incrementValue$3] = null;
                  continue L2;
                } else {
                  this.a(param0, 3, var4 - -1);
                  return;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1, bh param2, byte param3) {
        RuntimeException var5 = null;
        wo[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        wo var8_ref_wo = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fe var13_ref_fe = null;
        jg[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        rn[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        int[] var19 = null;
        int var20 = 0;
        int var21_int = 0;
        Object var21 = null;
        int var22 = 0;
        int var23 = 0;
        wo[] var24 = null;
        int stackIn_5_0 = 0;
        int stackIn_33_0 = 0;
        bg stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int[] stackIn_66_2 = null;
        bg stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int[] stackIn_67_2 = null;
        bg stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int[] stackIn_68_2 = null;
        int stackIn_68_3 = 0;
        int stackIn_72_0 = 0;
        bg stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int[] stackIn_85_2 = null;
        bg stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int[] stackIn_86_2 = null;
        bg stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int[] stackIn_87_2 = null;
        int stackIn_87_3 = 0;
        bg stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int[] stackIn_89_2 = null;
        bg stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int[] stackIn_90_2 = null;
        bg stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int[] stackIn_91_2 = null;
        int stackIn_91_3 = 0;
        bg stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int[] stackIn_102_2 = null;
        bg stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int[] stackIn_103_2 = null;
        bg stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int[] stackIn_104_2 = null;
        int stackIn_104_3 = 0;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_110_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        bg stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int[] stackOut_65_2 = null;
        bg stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int[] stackOut_67_2 = null;
        int stackOut_67_3 = 0;
        bg stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int[] stackOut_66_2 = null;
        int stackOut_66_3 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        bg stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int[] stackOut_101_2 = null;
        bg stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int[] stackOut_103_2 = null;
        int stackOut_103_3 = 0;
        bg stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int[] stackOut_102_2 = null;
        int stackOut_102_3 = 0;
        bg stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int[] stackOut_88_2 = null;
        bg stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int[] stackOut_90_2 = null;
        int stackOut_90_3 = 0;
        bg stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int[] stackOut_89_2 = null;
        int stackOut_89_3 = 0;
        bg stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int[] stackOut_84_2 = null;
        bg stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int[] stackOut_86_2 = null;
        int stackOut_86_3 = 0;
        bg stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int[] stackOut_85_2 = null;
        int stackOut_85_3 = 0;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        var23 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var24 = param2.field_f;
                var5_array = var24;
                if (0 > param1) {
                  break L2;
                } else {
                  if (!param2.c((byte) 104)) {
                    break L2;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6 = stackIn_5_0;
              if (var6 == 0) {
                hn.a(false, 380, -420, ((am) this).field_s.field_e, -390, 0, -140, 180, 0, 0, -1);
                break L3;
              } else {
                if (!param2.d(-2)) {
                  L4: {
                    if (!((am) this).field_s.field_o) {
                      break L4;
                    } else {
                      ((am) this).field_s.field_o = false;
                      ((am) this).field_s.d(550);
                      break L4;
                    }
                  }
                  var8_ref_wo = var24[param1];
                  if (~((am) this).field_l == ~((am) this).field_d) {
                    ((am) this).field_s.a(var8_ref_wo.field_k, var8_ref_wo.field_E, 12257, var8_ref_wo.field_y);
                    break L3;
                  } else {
                    var9 = var8_ref_wo.field_E + -var24[((am) this).field_d].field_E;
                    var10 = var8_ref_wo.field_y - var24[((am) this).field_d].field_y;
                    var11 = -var24[((am) this).field_d].field_k + var8_ref_wo.field_k;
                    ((am) this).field_s.a((int)((float)var11 * ((am) this).field_p) + var24[((am) this).field_d].field_k, (int)(((am) this).field_p * (float)var9) + var24[((am) this).field_d].field_E, 12257, var24[((am) this).field_d].field_y + (int)(((am) this).field_p * (float)var10));
                    break L3;
                  }
                } else {
                  L5: {
                    ((am) this).field_s.a(param2.field_D, 2000 + param2.field_A, param2.field_v, false, param2.field_h, param2.field_K, param2.field_z - 2000);
                    if (!((am) this).field_s.field_o) {
                      ((am) this).field_s.d(550);
                      ((am) this).field_s.a(param2.field_D, param2.field_A, param2.field_v, false, param2.field_h, param2.field_K, param2.field_z);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((am) this).field_s.a(0, 0, 12257, 0);
                  break L3;
                }
              }
            }
            var7 = 0;
            L6: while (true) {
              if (var7 >= ((am) this).field_c.length) {
                L7: {
                  if (param0) {
                    L8: {
                      if (!hn.field_t) {
                        ue.field_N.c(0, 0);
                        break L8;
                      } else {
                        qr.field_l.a(((am) this).field_s.field_e, 28580);
                        break L8;
                      }
                    }
                    sc.a(true, rg.field_f);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L9: {
                  L10: {
                    var7 = ((am) this).field_s.field_e[0];
                    var8 = ((am) this).field_s.field_e[2];
                    var9 = ((am) this).field_s.field_e[1];
                    var11 = 31 % ((82 - param3) / 37);
                    var10 = param2.h(9979);
                    if (var10 == 7) {
                      break L10;
                    } else {
                      if (var10 == 6) {
                        break L10;
                      } else {
                        if (var10 == 3) {
                          break L10;
                        } else {
                          if (4 != var10) {
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  stackOut_31_0 = 1;
                  stackIn_33_0 = stackOut_31_0;
                  break L9;
                }
                L11: {
                  var12 = stackIn_33_0;
                  if (!cn.field_r) {
                    break L11;
                  } else {
                    if (param0) {
                      L12: {
                        L13: {
                          var13_ref_fe = sf.field_b;
                          var14_int = sf.field_b.field_y << 5;
                          var15_int = sf.field_b.field_t << 5;
                          var16 = Vertigo2.field_C.field_y << 4;
                          var17 = Vertigo2.field_C.field_t << 4;
                          var18 = ji.field_p.field_y << 4;
                          var19_int = ji.field_p.field_t << 4;
                          var20 = jf.field_M.field_y << 4;
                          var21_int = jf.field_M.field_t << 4;
                          if (((am) this).field_s.field_o) {
                            break L13;
                          } else {
                            if (var12 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        var21_int = var21_int / 2;
                        var16 = var16 / 2;
                        var18 = var18 / 2;
                        var17 = var17 / 2;
                        var19_int = var19_int / 2;
                        var15_int = var15_int / 2;
                        var14_int = var14_int / 2;
                        var20 = var20 / 2;
                        break L12;
                      }
                      gb.a(((am) this).field_r[0][1], (fb) (Object) jf.field_M, var21_int, ((am) this).field_r[0][0], ((am) this).field_s.field_e, ((am) this).field_r[0][2], var20, -123);
                      var22 = 0;
                      L14: while (true) {
                        if (var22 >= 1000) {
                          gb.a(((am) this).field_v[0][1], (fb) (Object) Vertigo2.field_C, var17, ((am) this).field_v[0][0], ((am) this).field_s.field_e, ((am) this).field_v[0][2], var16, -96);
                          gb.a(((am) this).field_v[1][1], (fb) (Object) ji.field_p, var19_int, ((am) this).field_v[1][0], ((am) this).field_s.field_e, ((am) this).field_v[1][2], var18, -89);
                          break L11;
                        } else {
                          gb.a(((am) this).field_u[var22][1], (fb) (Object) var13_ref_fe, var15_int, ((am) this).field_u[var22][0], ((am) this).field_s.field_e, ((am) this).field_u[var22][2], var14_int, -105);
                          var22++;
                          continue L14;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                var13 = 0;
                var14 = param2.c(121);
                var15_int = -1 + param2.l(102);
                L15: while (true) {
                  if (var15_int < 0) {
                    var15 = param2.m(9384);
                    var16 = -1 + param2.e((byte) 82);
                    L16: while (true) {
                      if (0 > var16) {
                        L17: {
                          if (var12 == 0) {
                            break L17;
                          } else {
                            ((am) this).field_c[0].a(param1, -25196);
                            break L17;
                          }
                        }
                        L18: {
                          if (var10 == 0) {
                            break L18;
                          } else {
                            var16 = 0;
                            L19: while (true) {
                              if (~((am) this).field_c.length >= ~var16) {
                                break L18;
                              } else {
                                ((am) this).field_j[var13] = ((am) this).field_c[var16].a(var7, var8, 0, var9);
                                int incrementValue$3 = var13;
                                var13++;
                                ((am) this).field_a[incrementValue$3] = (bg) (Object) ((am) this).field_c[var16];
                                if (var12 == 0) {
                                  var16++;
                                  continue L19;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                        }
                        L20: {
                          L21: {
                            L22: {
                              this.a(var13 + -1, 3, 0);
                              var16 = param2.field_n;
                              if (2 == var10) {
                                break L22;
                              } else {
                                if (7 == var10) {
                                  break L22;
                                } else {
                                  var17 = -1 + var13;
                                  L23: while (true) {
                                    if (var17 < 0) {
                                      break L21;
                                    } else {
                                      L24: {
                                        stackOut_65_0 = ((am) this).field_a[var17];
                                        stackOut_65_1 = 0;
                                        stackOut_65_2 = ((am) this).field_s.field_e;
                                        stackIn_67_0 = stackOut_65_0;
                                        stackIn_67_1 = stackOut_65_1;
                                        stackIn_67_2 = stackOut_65_2;
                                        stackIn_66_0 = stackOut_65_0;
                                        stackIn_66_1 = stackOut_65_1;
                                        stackIn_66_2 = stackOut_65_2;
                                        if (2 != param2.field_w) {
                                          stackOut_67_0 = (bg) (Object) stackIn_67_0;
                                          stackOut_67_1 = stackIn_67_1;
                                          stackOut_67_2 = (int[]) (Object) stackIn_67_2;
                                          stackOut_67_3 = 0;
                                          stackIn_68_0 = stackOut_67_0;
                                          stackIn_68_1 = stackOut_67_1;
                                          stackIn_68_2 = stackOut_67_2;
                                          stackIn_68_3 = stackOut_67_3;
                                          break L24;
                                        } else {
                                          stackOut_66_0 = (bg) (Object) stackIn_66_0;
                                          stackOut_66_1 = stackIn_66_1;
                                          stackOut_66_2 = (int[]) (Object) stackIn_66_2;
                                          stackOut_66_3 = 1;
                                          stackIn_68_0 = stackOut_66_0;
                                          stackIn_68_1 = stackOut_66_1;
                                          stackIn_68_2 = stackOut_66_2;
                                          stackIn_68_3 = stackOut_66_3;
                                          break L24;
                                        }
                                      }
                                      ((bg) (Object) stackIn_68_0).a(stackIn_68_1 != 0, stackIn_68_2, stackIn_68_3 != 0, ((am) this).field_s.field_o);
                                      var17--;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            }
                            L25: {
                              if (50 > var16) {
                                stackOut_71_0 = 0;
                                stackIn_72_0 = stackOut_71_0;
                                break L25;
                              } else {
                                stackOut_70_0 = 1;
                                stackIn_72_0 = stackOut_70_0;
                                break L25;
                              }
                            }
                            var17 = stackIn_72_0;
                            if (var17 != 0) {
                              var18 = 0;
                              L26: while (true) {
                                if (~var18 <= ~((am) this).field_c.length) {
                                  ((am) this).field_s.field_e[1] = ((am) this).field_s.field_e[1] - (-50 + var16) * 20;
                                  var18 = var13 - 1;
                                  L27: while (true) {
                                    if (var18 < 0) {
                                      break L21;
                                    } else {
                                      L28: {
                                        if (((am) this).field_a[var18] instanceof hb) {
                                          L29: {
                                            stackOut_101_0 = ((am) this).field_a[var18];
                                            stackOut_101_1 = -30;
                                            stackOut_101_2 = ((am) this).field_s.field_e;
                                            stackIn_103_0 = stackOut_101_0;
                                            stackIn_103_1 = stackOut_101_1;
                                            stackIn_103_2 = stackOut_101_2;
                                            stackIn_102_0 = stackOut_101_0;
                                            stackIn_102_1 = stackOut_101_1;
                                            stackIn_102_2 = stackOut_101_2;
                                            if (param2.field_w != 2) {
                                              stackOut_103_0 = (bg) (Object) stackIn_103_0;
                                              stackOut_103_1 = stackIn_103_1;
                                              stackOut_103_2 = (int[]) (Object) stackIn_103_2;
                                              stackOut_103_3 = 0;
                                              stackIn_104_0 = stackOut_103_0;
                                              stackIn_104_1 = stackOut_103_1;
                                              stackIn_104_2 = stackOut_103_2;
                                              stackIn_104_3 = stackOut_103_3;
                                              break L29;
                                            } else {
                                              stackOut_102_0 = (bg) (Object) stackIn_102_0;
                                              stackOut_102_1 = stackIn_102_1;
                                              stackOut_102_2 = (int[]) (Object) stackIn_102_2;
                                              stackOut_102_3 = 1;
                                              stackIn_104_0 = stackOut_102_0;
                                              stackIn_104_1 = stackOut_102_1;
                                              stackIn_104_2 = stackOut_102_2;
                                              stackIn_104_3 = stackOut_102_3;
                                              break L29;
                                            }
                                          }
                                          ((bg) (Object) stackIn_104_0).a(stackIn_104_1, stackIn_104_2, stackIn_104_3 != 0, (byte[]) null, ((am) this).field_s.field_o);
                                          break L28;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      var18--;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((am) this).field_c[var18].a(6, (byte) -36);
                                  var18++;
                                  continue L26;
                                }
                              }
                            } else {
                              L30: {
                                var18 = var16 * 24 / 50;
                                var19 = oo.field_c;
                                var20 = var18;
                                if (var20 < 12) {
                                  break L30;
                                } else {
                                  var20 = 11;
                                  break L30;
                                }
                              }
                              L31: {
                                oo.field_c = bm.field_G[var20];
                                var21 = null;
                                var18 -= 12;
                                if (0 <= var18) {
                                  L32: {
                                    if (var18 >= 12) {
                                      var18 = 11;
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  var21 = (Object) (Object) lf.field_A[var18];
                                  break L31;
                                } else {
                                  break L31;
                                }
                              }
                              var22 = -1 + var13;
                              L33: while (true) {
                                if (var22 < 0) {
                                  oo.field_c = var19;
                                  break L20;
                                } else {
                                  L34: {
                                    if (!(((am) this).field_a[var22] instanceof hb)) {
                                      L35: {
                                        stackOut_88_0 = ((am) this).field_a[var22];
                                        stackOut_88_1 = -30;
                                        stackOut_88_2 = ((am) this).field_s.field_e;
                                        stackIn_90_0 = stackOut_88_0;
                                        stackIn_90_1 = stackOut_88_1;
                                        stackIn_90_2 = stackOut_88_2;
                                        stackIn_89_0 = stackOut_88_0;
                                        stackIn_89_1 = stackOut_88_1;
                                        stackIn_89_2 = stackOut_88_2;
                                        if (param2.field_w != 2) {
                                          stackOut_90_0 = (bg) (Object) stackIn_90_0;
                                          stackOut_90_1 = stackIn_90_1;
                                          stackOut_90_2 = (int[]) (Object) stackIn_90_2;
                                          stackOut_90_3 = 0;
                                          stackIn_91_0 = stackOut_90_0;
                                          stackIn_91_1 = stackOut_90_1;
                                          stackIn_91_2 = stackOut_90_2;
                                          stackIn_91_3 = stackOut_90_3;
                                          break L35;
                                        } else {
                                          stackOut_89_0 = (bg) (Object) stackIn_89_0;
                                          stackOut_89_1 = stackIn_89_1;
                                          stackOut_89_2 = (int[]) (Object) stackIn_89_2;
                                          stackOut_89_3 = 1;
                                          stackIn_91_0 = stackOut_89_0;
                                          stackIn_91_1 = stackOut_89_1;
                                          stackIn_91_2 = stackOut_89_2;
                                          stackIn_91_3 = stackOut_89_3;
                                          break L35;
                                        }
                                      }
                                      ((bg) (Object) stackIn_91_0).a(stackIn_91_1, stackIn_91_2, stackIn_91_3 != 0, (byte[]) var21, ((am) this).field_s.field_o);
                                      break L34;
                                    } else {
                                      L36: {
                                        oo.field_c = var19;
                                        stackOut_84_0 = ((am) this).field_a[var22];
                                        stackOut_84_1 = -30;
                                        stackOut_84_2 = ((am) this).field_s.field_e;
                                        stackIn_86_0 = stackOut_84_0;
                                        stackIn_86_1 = stackOut_84_1;
                                        stackIn_86_2 = stackOut_84_2;
                                        stackIn_85_0 = stackOut_84_0;
                                        stackIn_85_1 = stackOut_84_1;
                                        stackIn_85_2 = stackOut_84_2;
                                        if (param2.field_w != 2) {
                                          stackOut_86_0 = (bg) (Object) stackIn_86_0;
                                          stackOut_86_1 = stackIn_86_1;
                                          stackOut_86_2 = (int[]) (Object) stackIn_86_2;
                                          stackOut_86_3 = 0;
                                          stackIn_87_0 = stackOut_86_0;
                                          stackIn_87_1 = stackOut_86_1;
                                          stackIn_87_2 = stackOut_86_2;
                                          stackIn_87_3 = stackOut_86_3;
                                          break L36;
                                        } else {
                                          stackOut_85_0 = (bg) (Object) stackIn_85_0;
                                          stackOut_85_1 = stackIn_85_1;
                                          stackOut_85_2 = (int[]) (Object) stackIn_85_2;
                                          stackOut_85_3 = 1;
                                          stackIn_87_0 = stackOut_85_0;
                                          stackIn_87_1 = stackOut_85_1;
                                          stackIn_87_2 = stackOut_85_2;
                                          stackIn_87_3 = stackOut_85_3;
                                          break L36;
                                        }
                                      }
                                      ((bg) (Object) stackIn_87_0).a(stackIn_87_1, stackIn_87_2, stackIn_87_3 != 0, (byte[]) null, ((am) this).field_s.field_o);
                                      oo.field_c = bm.field_G[var20];
                                      break L34;
                                    }
                                  }
                                  var22--;
                                  continue L33;
                                }
                              }
                            }
                          }
                          break L20;
                        }
                        break L0;
                      } else {
                        ((am) this).field_j[var13] = var15[var16].a(var8, -128, var7, var9);
                        int incrementValue$4 = var13;
                        var13++;
                        ((am) this).field_a[incrementValue$4] = (bg) (Object) var15[var16];
                        var16--;
                        continue L16;
                      }
                    }
                  } else {
                    L37: {
                      if (var14[var15_int] != null) {
                        ((am) this).field_j[var13] = var14[var15_int].a(var8, -116, var7, var9);
                        int incrementValue$5 = var13;
                        var13++;
                        ((am) this).field_a[incrementValue$5] = (bg) (Object) var14[var15_int];
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    var15_int--;
                    continue L15;
                  }
                }
              } else {
                ((am) this).field_c[var7].a(false, var24[var7]);
                var7++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L38: {
            var5 = decompiledCaughtException;
            stackOut_107_0 = (RuntimeException) var5;
            stackOut_107_1 = new StringBuilder().append("am.M(").append(param0).append(',').append(param1).append(',');
            stackIn_109_0 = stackOut_107_0;
            stackIn_109_1 = stackOut_107_1;
            stackIn_108_0 = stackOut_107_0;
            stackIn_108_1 = stackOut_107_1;
            if (param2 == null) {
              stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
              stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
              stackOut_109_2 = "null";
              stackIn_110_0 = stackOut_109_0;
              stackIn_110_1 = stackOut_109_1;
              stackIn_110_2 = stackOut_109_2;
              break L38;
            } else {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "{...}";
              stackIn_110_0 = stackOut_108_0;
              stackIn_110_1 = stackOut_108_1;
              stackIn_110_2 = stackOut_108_2;
              break L38;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_110_0, stackIn_110_2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_e = null;
        field_o = null;
    }

    final void a(byte param0, int param1, int param2) {
        ((am) this).field_p = 0.0f;
        if (param0 != -17) {
            ((am) this).field_v = null;
        }
        ((am) this).field_d = param1;
        ((am) this).field_l = param2;
    }

    am(int param0, int param1, String[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        double var6 = 0.0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            ((am) this).field_s = new cn();
            ((am) this).field_c = new hb[param1];
            ((am) this).field_h = new String[param1];
            ((am) this).field_a = new bg[500];
            ((am) this).field_j = new int[500];
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= param1) {
                ((am) this).field_u = new int[1000][3];
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 900) {
                    var4_int = 900;
                    L3: while (true) {
                      if (1000 <= var4_int) {
                        ((am) this).field_v = new int[2][3];
                        var4_int = 0;
                        L4: while (true) {
                          if (var4_int >= 2) {
                            ((am) this).field_r = new int[1][3];
                            var4_int = 0;
                            L5: while (true) {
                              if (var4_int >= 1) {
                                ((am) this).field_g = new cq[param1 + 1];
                                var4_int = 0;
                                L6: while (true) {
                                  if (var4_int >= ((am) this).field_g.length) {
                                    ((am) this).field_p = 1.100000023841858f;
                                    ((am) this).field_f = new ha(0, 100, 0);
                                    break L0;
                                  } else {
                                    ((am) this).field_g[var4_int] = new cq();
                                    var4_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var5 = be.a(1920, (byte) 83) + 3920;
                                var6 = 3.141592653589793 * Math.random() * 2.0;
                                ((am) this).field_r[var4_int][0] = (int)(320.0 + Math.cos(var6) * (double)var5);
                                ((am) this).field_r[var4_int][2] = (int)(320.0 + (double)var5 * Math.sin(var6));
                                ((am) this).field_r[var4_int][1] = 1800 + be.a(7200, (byte) 83);
                                var4_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var5 = 2560 - -be.a(2000, (byte) 83);
                            var6 = Math.random() * 3.141592653589793 * 2.0;
                            ((am) this).field_v[var4_int][0] = (int)(Math.cos(var6) * (double)var5 + 320.0);
                            ((am) this).field_v[var4_int][2] = (int)(320.0 + Math.sin(var6) * (double)var5);
                            ((am) this).field_v[var4_int][1] = be.a(7200, (byte) 83) - -1800;
                            var4_int++;
                            continue L4;
                          }
                        }
                      } else {
                        var5 = be.a(5840, (byte) 83);
                        var6 = Math.random() * 3.141592653589793 * 2.0;
                        ((am) this).field_u[var4_int][0] = (int)(320.0 + Math.cos(var6) * (double)var5);
                        ((am) this).field_u[var4_int][2] = (int)(320.0 + (double)var5 * Math.sin(var6));
                        ((am) this).field_u[var4_int][1] = 12600;
                        var4_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var5 = 3920 - -be.a(1920, (byte) 83);
                    var6 = 2.0 * (Math.random() * 3.141592653589793);
                    ((am) this).field_u[var4_int][0] = (int)(320.0 + (double)var5 * Math.cos(var6));
                    ((am) this).field_u[var4_int][2] = (int)(Math.sin(var6) * (double)var5 + 320.0);
                    ((am) this).field_u[var4_int][1] = be.a(14400, (byte) 83) + -1800;
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                ((am) this).field_c[var4_int] = new hb();
                ((am) this).field_h[var4_int] = param2[var4_int];
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("am.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 96;
        field_e = "Click";
        field_m = "Please try again in a few minutes.";
    }
}
