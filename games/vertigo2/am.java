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
        bh var12 = null;
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
              if (this.field_l == this.field_d) {
                if ((param3 ^ -1) > -1) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var13 = param0.field_f[param3];
                        var6 = lj.a(var13.field_E, false, 128);
                        var7 = lj.a(var13.field_y, false, 128);
                        var8 = lj.a(var13.field_k - -120, false, 240);
                        var9 = this.field_s.field_q;
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
                        if ((var9 ^ -1) != -2) {
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
                      this.field_s.a(1, 125);
                      break L2;
                    }
                    this.field_s.a(0, -125);
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
                                this.field_s.a(2, 40);
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
                        this.field_s.a(var13.c((byte) -127), param1 ^ -66);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    this.field_s.a(-1);
                    var10 = var13.b(param1 ^ 119);
                    if (var10 != this.field_i) {
                      if ((this.field_i ^ -1) != -8) {
                        break L10;
                      } else {
                        this.field_s.d(param1 ^ -594);
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                  this.field_i = var13.b(-1);
                  break L1;
                }
              } else {
                this.field_p = this.field_p + 0.05000000074505806f;
                if (1.0f > this.field_p) {
                  break L1;
                } else {
                  this.field_d = param3;
                  this.field_l = param3;
                  this.field_p = 0.0f;
                  break L1;
                }
              }
            }
            L11: {
              var5_int = param0.h(param1 ^ -9869);
              if (param1 == -120) {
                break L11;
              } else {
                var12 = (bh) null;
                this.a(true, 50, (bh) null, (byte) -74);
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
                      if ((param0.field_w ^ -1) != -4) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (var6 <= 200) {
                    break L13;
                  } else {
                    if (200 >= this.field_q) {
                      gm.a(25, (byte) -55);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L15: {
                  if (this.field_k == var5_int) {
                    break L15;
                  } else {
                    var7 = 0;
                    L16: while (true) {
                      if (var7 >= this.field_c.length) {
                        break L15;
                      } else {
                        this.field_c[var7].d(-23);
                        var7++;
                        continue L16;
                      }
                    }
                  }
                }
                var7 = 0;
                L17: while (true) {
                  if (var7 >= this.field_c.length) {
                    if (param0.field_w != 2) {
                      break L12;
                    } else {
                      L18: {
                        if (param3 != 0) {
                          break L18;
                        } else {
                          if ((param0.field_E ^ -1) > -51) {
                            this.field_c[0].a(19, (byte) -36);
                            break L18;
                          } else {
                            if (param0.field_E > 50) {
                              this.field_c[1].a(19, (byte) -36);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      if (-2 != (param3 ^ -1)) {
                        break L12;
                      } else {
                        L19: {
                          if (-51 > (param0.field_E ^ -1)) {
                            this.field_c[0].a(19, (byte) -36);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        if ((param0.field_E ^ -1) <= -51) {
                          break L12;
                        } else {
                          this.field_c[1].a(19, (byte) -36);
                          break L12;
                        }
                      }
                    }
                  } else {
                    this.field_c[var7].a(0, (byte) -36);
                    var7++;
                    continue L17;
                  }
                }
              } else {
                if (var7 == 0) {
                  this.field_c[0].a(0, param1 ^ 25116);
                  if (1 < this.field_c.length) {
                    this.field_c[1].a(1, -25196);
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
                  if (-76 >= (var6 ^ -1)) {
                    this.field_c[0].a(25, (byte) -36);
                    if (param0.field_w == 0) {
                      break L12;
                    } else {
                      if (param0.field_w != 3) {
                        this.field_c[1].a(25, (byte) -36);
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
            this.field_k = var5_int;
            this.field_q = var6;
            var7 = 0;
            L21: while (true) {
              if (var7 >= this.field_g.length) {
                var7 = 0;
                L22: while (true) {
                  L23: {
                    if (-5 >= (var7 ^ -1)) {
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
                          stackOut_88_0 = this.field_g;
                          stackIn_90_0 = stackOut_88_0;
                          stackIn_89_0 = stackOut_88_0;
                          if (var14.field_h <= 1) {
                            stackOut_90_0 = (cq[]) ((Object) stackIn_90_0);
                            stackOut_90_1 = var14.field_h;
                            stackIn_91_0 = stackOut_90_0;
                            stackIn_91_1 = stackOut_90_1;
                            break L25;
                          } else {
                            stackOut_89_0 = (cq[]) ((Object) stackIn_89_0);
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
                    if (var7 >= param0.field_f.length) {
                      break L0;
                    } else {
                      var15 = param0.field_f[var7];
                      this.field_c[var7].a(var15, (byte) -76);
                      var7++;
                      continue L26;
                    }
                  }
                }
              } else {
                this.field_g[var7].a((byte) 68);
                var7++;
                continue L21;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var5 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) (var5);
            stackOut_96_1 = new StringBuilder().append("am.F(");
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param0 == null) {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L27;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L27;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, bh param2) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
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
        int decompiledRegionSelector0 = 0;
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
                hn.a(false, 380, -420, this.field_s.field_e, -390, 0, -140, 180, 0, 0, -1);
                break L2;
              } else {
                if (!param2.d(-2)) {
                  L3: {
                    if (!this.field_s.field_o) {
                      break L3;
                    } else {
                      this.field_s.field_o = false;
                      this.field_s.d(550);
                      break L3;
                    }
                  }
                  var7_ref_wo = var22[param0];
                  if (this.field_d == this.field_l) {
                    this.field_s.a(var7_ref_wo.field_k, var7_ref_wo.field_E, 12257, var7_ref_wo.field_y);
                    break L2;
                  } else {
                    var8 = var7_ref_wo.field_E - var22[this.field_d].field_E;
                    var9 = -var22[this.field_d].field_y + var7_ref_wo.field_y;
                    var10 = -var22[this.field_d].field_k + var7_ref_wo.field_k;
                    this.field_s.a(var22[this.field_d].field_k + (int)((float)var10 * this.field_p), var22[this.field_d].field_E + (int)((float)var8 * this.field_p), 12257, var22[this.field_d].field_y + (int)(this.field_p * (float)var9));
                    break L2;
                  }
                } else {
                  L4: {
                    this.field_s.a(param2.field_D, param2.field_A + 1000, param2.field_v, false, param2.field_h, param2.field_K, -1000 + param2.field_z);
                    if (!this.field_s.field_o) {
                      this.field_s.d(550);
                      this.field_s.a(param2.field_D, param2.field_A, param2.field_v, false, param2.field_h, param2.field_K, param2.field_z);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_s.a(0, 0, 12257, 0);
                  break L2;
                }
              }
            }
            var6 = 0;
            L5: while (true) {
              if (var6 >= this.field_c.length) {
                L6: {
                  if (!hn.field_t) {
                    ue.field_N.c(0, 0);
                    break L6;
                  } else {
                    qr.field_l.a(this.field_s.field_e, 28580);
                    break L6;
                  }
                }
                L7: {
                  sc.a(true, rg.field_f);
                  var6 = this.field_s.field_e[0];
                  var7 = this.field_s.field_e[2];
                  var8 = this.field_s.field_e[1];
                  var9 = param2.h(9979);
                  if ((var9 ^ -1) != -8) {
                    if (var9 != 6) {
                      if ((var9 ^ -1) != -4) {
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
                        var12_int = sf.field_b.field_y << -151403483;
                        var13_int = sf.field_b.field_t << 776649029;
                        var14 = Vertigo2.field_C.field_y << -959041052;
                        var15 = Vertigo2.field_C.field_t << -1341295772;
                        var16 = ji.field_p.field_y << -1146748124;
                        var17_int = ji.field_p.field_t << -2078491100;
                        var18 = jf.field_M.field_y << -2040114780;
                        var19_int = jf.field_M.field_t << -957687612;
                        if (this.field_s.field_o) {
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
                    gb.a(this.field_r[0][1], jf.field_M, var19_int, this.field_r[0][0], this.field_s.field_e, this.field_r[0][2], var18, -98);
                    var20 = 0;
                    L11: while (true) {
                      if (1000 <= var20) {
                        gb.a(this.field_v[0][1], Vertigo2.field_C, var15, this.field_v[0][0], this.field_s.field_e, this.field_v[0][2], var14, -124);
                        gb.a(this.field_v[1][1], ji.field_p, var17_int, this.field_v[1][0], this.field_s.field_e, this.field_v[1][2], var16, -114);
                        break L8;
                      } else {
                        gb.a(this.field_u[var20][1], var11_ref_fe, var13_int, this.field_u[var20][0], this.field_s.field_e, this.field_u[var20][2], var12_int, -118);
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
                            this.field_c[0].a(param0, -25196);
                            break L14;
                          }
                        }
                        L15: {
                          if (var9 == 0) {
                            break L15;
                          } else {
                            var14 = 0;
                            L16: while (true) {
                              if (this.field_c.length <= var14) {
                                break L15;
                              } else {
                                this.field_j[var11] = this.field_c[var14].a(var6, var7, 0, var8);
                                incrementValue$3 = var11;
                                var11++;
                                this.field_a[incrementValue$3] = (bg) ((Object) this.field_c[var14]);
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
                                        stackOut_104_0 = this.field_a[var15];
                                        stackOut_104_1 = 0;
                                        stackOut_104_2 = this.field_s.field_e;
                                        stackIn_106_0 = stackOut_104_0;
                                        stackIn_106_1 = stackOut_104_1;
                                        stackIn_106_2 = stackOut_104_2;
                                        stackIn_105_0 = stackOut_104_0;
                                        stackIn_105_1 = stackOut_104_1;
                                        stackIn_105_2 = stackOut_104_2;
                                        if ((param2.field_w ^ -1) != -3) {
                                          stackOut_106_0 = (bg) ((Object) stackIn_106_0);
                                          stackOut_106_1 = stackIn_106_1;
                                          stackOut_106_2 = (int[]) ((Object) stackIn_106_2);
                                          stackOut_106_3 = 0;
                                          stackIn_107_0 = stackOut_106_0;
                                          stackIn_107_1 = stackOut_106_1;
                                          stackIn_107_2 = stackOut_106_2;
                                          stackIn_107_3 = stackOut_106_3;
                                          break L20;
                                        } else {
                                          stackOut_105_0 = (bg) ((Object) stackIn_105_0);
                                          stackOut_105_1 = stackIn_105_1;
                                          stackOut_105_2 = (int[]) ((Object) stackIn_105_2);
                                          stackOut_105_3 = 1;
                                          stackIn_107_0 = stackOut_105_0;
                                          stackIn_107_1 = stackOut_105_1;
                                          stackIn_107_2 = stackOut_105_2;
                                          stackIn_107_3 = stackOut_105_3;
                                          break L20;
                                        }
                                      }
                                      ((bg) (Object) stackIn_107_0).a(stackIn_107_1 != 0, stackIn_107_2, stackIn_107_3 != 0, this.field_s.field_o);
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
                                if (this.field_c.length <= var16) {
                                  this.field_s.field_e[1] = this.field_s.field_e[1] - (20 * var14 - 1000);
                                  var16 = var11 - 1;
                                  L23: while (true) {
                                    if (0 > var16) {
                                      break L17;
                                    } else {
                                      L24: {
                                        if (this.field_a[var16] instanceof hb) {
                                          L25: {
                                            stackOut_97_0 = this.field_a[var16];
                                            stackOut_97_1 = -30;
                                            stackOut_97_2 = this.field_s.field_e;
                                            stackIn_99_0 = stackOut_97_0;
                                            stackIn_99_1 = stackOut_97_1;
                                            stackIn_99_2 = stackOut_97_2;
                                            stackIn_98_0 = stackOut_97_0;
                                            stackIn_98_1 = stackOut_97_1;
                                            stackIn_98_2 = stackOut_97_2;
                                            if ((param2.field_w ^ -1) != -3) {
                                              stackOut_99_0 = (bg) ((Object) stackIn_99_0);
                                              stackOut_99_1 = stackIn_99_1;
                                              stackOut_99_2 = (int[]) ((Object) stackIn_99_2);
                                              stackOut_99_3 = 0;
                                              stackIn_100_0 = stackOut_99_0;
                                              stackIn_100_1 = stackOut_99_1;
                                              stackIn_100_2 = stackOut_99_2;
                                              stackIn_100_3 = stackOut_99_3;
                                              break L25;
                                            } else {
                                              stackOut_98_0 = (bg) ((Object) stackIn_98_0);
                                              stackOut_98_1 = stackIn_98_1;
                                              stackOut_98_2 = (int[]) ((Object) stackIn_98_2);
                                              stackOut_98_3 = 1;
                                              stackIn_100_0 = stackOut_98_0;
                                              stackIn_100_1 = stackOut_98_1;
                                              stackIn_100_2 = stackOut_98_2;
                                              stackIn_100_3 = stackOut_98_3;
                                              break L25;
                                            }
                                          }
                                          ((bg) (Object) stackIn_100_0).a(stackIn_100_1, stackIn_100_2, stackIn_100_3 != 0, (byte[]) null, this.field_s.field_o);
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
                                  this.field_c[var16].a(6, (byte) -36);
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
                                if (-1 < (var16 ^ -1)) {
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
                                  var19 = lf.field_A[var16];
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
                                    if (!(this.field_a[var20] instanceof hb)) {
                                      L31: {
                                        stackOut_84_0 = this.field_a[var20];
                                        stackOut_84_1 = -30;
                                        stackOut_84_2 = this.field_s.field_e;
                                        stackIn_86_0 = stackOut_84_0;
                                        stackIn_86_1 = stackOut_84_1;
                                        stackIn_86_2 = stackOut_84_2;
                                        stackIn_85_0 = stackOut_84_0;
                                        stackIn_85_1 = stackOut_84_1;
                                        stackIn_85_2 = stackOut_84_2;
                                        if (2 != param2.field_w) {
                                          stackOut_86_0 = (bg) ((Object) stackIn_86_0);
                                          stackOut_86_1 = stackIn_86_1;
                                          stackOut_86_2 = (int[]) ((Object) stackIn_86_2);
                                          stackOut_86_3 = 0;
                                          stackIn_87_0 = stackOut_86_0;
                                          stackIn_87_1 = stackOut_86_1;
                                          stackIn_87_2 = stackOut_86_2;
                                          stackIn_87_3 = stackOut_86_3;
                                          break L31;
                                        } else {
                                          stackOut_85_0 = (bg) ((Object) stackIn_85_0);
                                          stackOut_85_1 = stackIn_85_1;
                                          stackOut_85_2 = (int[]) ((Object) stackIn_85_2);
                                          stackOut_85_3 = 1;
                                          stackIn_87_0 = stackOut_85_0;
                                          stackIn_87_1 = stackOut_85_1;
                                          stackIn_87_2 = stackOut_85_2;
                                          stackIn_87_3 = stackOut_85_3;
                                          break L31;
                                        }
                                      }
                                      ((bg) (Object) stackIn_87_0).a(stackIn_87_1, stackIn_87_2, stackIn_87_3 != 0, (byte[]) (var19), this.field_s.field_o);
                                      break L30;
                                    } else {
                                      L32: {
                                        oo.field_c = var17;
                                        stackOut_80_0 = this.field_a[var20];
                                        stackOut_80_1 = -30;
                                        stackOut_80_2 = this.field_s.field_e;
                                        stackIn_82_0 = stackOut_80_0;
                                        stackIn_82_1 = stackOut_80_1;
                                        stackIn_82_2 = stackOut_80_2;
                                        stackIn_81_0 = stackOut_80_0;
                                        stackIn_81_1 = stackOut_80_1;
                                        stackIn_81_2 = stackOut_80_2;
                                        if (param2.field_w != 2) {
                                          stackOut_82_0 = (bg) ((Object) stackIn_82_0);
                                          stackOut_82_1 = stackIn_82_1;
                                          stackOut_82_2 = (int[]) ((Object) stackIn_82_2);
                                          stackOut_82_3 = 0;
                                          stackIn_83_0 = stackOut_82_0;
                                          stackIn_83_1 = stackOut_82_1;
                                          stackIn_83_2 = stackOut_82_2;
                                          stackIn_83_3 = stackOut_82_3;
                                          break L32;
                                        } else {
                                          stackOut_81_0 = (bg) ((Object) stackIn_81_0);
                                          stackOut_81_1 = stackIn_81_1;
                                          stackOut_81_2 = (int[]) ((Object) stackIn_81_2);
                                          stackOut_81_3 = 1;
                                          stackIn_83_0 = stackOut_81_0;
                                          stackIn_83_1 = stackOut_81_1;
                                          stackIn_83_2 = stackOut_81_2;
                                          stackIn_83_3 = stackOut_81_3;
                                          break L32;
                                        }
                                      }
                                      ((bg) (Object) stackIn_83_0).a(stackIn_83_1, stackIn_83_2, stackIn_83_3 != 0, (byte[]) null, this.field_s.field_o);
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
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        this.field_j[var11] = var13[var14].a(var7, -113, var6, var8);
                        incrementValue$4 = var11;
                        var11++;
                        this.field_a[incrementValue$4] = (bg) ((Object) var13[var14]);
                        var14--;
                        continue L13;
                      }
                    }
                  } else {
                    L33: {
                      if (var12[var13_int] != null) {
                        this.field_j[var11] = var12[var13_int].a(var7, -128, var6, var8);
                        incrementValue$5 = var11;
                        var11++;
                        this.field_a[incrementValue$5] = (bg) ((Object) var12[var13_int]);
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
                this.field_c[var6].a(false, var22[var6]);
                var6++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var4 = decompiledCaughtException;
            stackOut_109_0 = (RuntimeException) (var4);
            stackOut_109_1 = new StringBuilder().append("am.G(").append(param0).append(',').append(param1).append(',');
            stackIn_111_0 = stackOut_109_0;
            stackIn_111_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param2 == null) {
              stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
              stackOut_111_1 = (StringBuilder) ((Object) stackIn_111_1);
              stackOut_111_2 = "null";
              stackIn_112_0 = stackOut_111_0;
              stackIn_112_1 = stackOut_111_1;
              stackIn_112_2 = stackOut_111_2;
              break L34;
            } else {
              stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackOut_110_2 = "{...}";
              stackIn_112_0 = stackOut_110_0;
              stackIn_112_1 = stackOut_110_1;
              stackIn_112_2 = stackOut_110_2;
              break L34;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_112_0), stackIn_112_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        for (var2 = 0; var2 < this.field_c.length; var2++) {
            this.field_c[var2].d(-125);
            this.field_g[var2].a(-96);
        }
        if (param0 < 115) {
            this.field_f = (ha) null;
        }
    }

    final void a(int param0) {
        if (param0 != 15481) {
            this.b((byte) -1);
        }
        if (!this.field_s.a(true)) {
            return;
        }
        this.field_s.field_q = (3 + this.field_s.field_q) % 4;
    }

    final void b(byte param0) {
        if (!this.field_s.a(true)) {
            return;
        }
        this.field_s.field_q = (this.field_s.field_q + 1) % 4;
        if (param0 <= 47) {
            this.field_h = (String[]) null;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            bh var3 = (bh) null;
            this.a((bh) null, -30, -79);
        }
        return this.field_l != this.field_d ? true : false;
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
              if (this.field_l != this.field_d) {
                this.field_p = this.field_p + 0.05000000074505806f;
                if (this.field_p < 1.0f) {
                  break L1;
                } else {
                  this.field_d = param1;
                  this.field_l = param1;
                  this.field_p = 0.0f;
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
                        var8 = this.field_s.field_q;
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
                        if ((var8 ^ -1) != -3) {
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
                      this.field_s.a(1, 94);
                      break L2;
                    }
                    this.field_s.a(0, 109);
                    break L2;
                  }
                  L8: {
                    if (var11.field_G) {
                      this.field_s.a(var11.c((byte) -128), -115);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    this.field_s.a(-1);
                    var9 = var11.b(-1);
                    if (this.field_i == var9) {
                      break L9;
                    } else {
                      if (-8 == (this.field_i ^ -1)) {
                        this.field_s.d(550);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.field_i = var11.b(-1);
                  break L1;
                }
              }
            }
            L10: {
              var4_int = param0.h(9979);
              if (param2 < -9) {
                break L10;
              } else {
                this.field_p = 0.5239396691322327f;
                break L10;
              }
            }
            L11: {
              var5 = var4_int;
              if (6 == var5) {
                if (0 == this.field_c[0].c(false)) {
                  this.field_c[0].a(22, (byte) -36);
                  break L11;
                } else {
                  break L11;
                }
              } else {
                if (var5 == 0) {
                  this.field_c[0].a(0, -25196);
                  if (1 >= this.field_c.length) {
                    break L11;
                  } else {
                    this.field_c[1].a(1, -25196);
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
            }
            this.field_k = var4_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var4);
            stackOut_39_1 = new StringBuilder().append("am.C(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L12;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, bh param4, int param5, int param6, int param7, int param8) {
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        RuntimeException var10 = null;
        wo[] var10_array = null;
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
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        hb stackIn_33_0 = null;
        hb stackIn_34_0 = null;
        hb stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_134_0 = 0;
        bg stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        int[] stackIn_151_2 = null;
        bg stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int[] stackIn_152_2 = null;
        bg stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        int[] stackIn_153_2 = null;
        int stackIn_153_3 = 0;
        bg stackIn_156_0 = null;
        bg stackIn_157_0 = null;
        bg stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        bg stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int[] stackIn_159_2 = null;
        bg stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int[] stackIn_160_2 = null;
        bg stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int[] stackIn_161_2 = null;
        int stackIn_161_3 = 0;
        bg stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        int[] stackIn_171_2 = null;
        bg stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        int[] stackIn_172_2 = null;
        bg stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        int[] stackIn_173_2 = null;
        int stackIn_173_3 = 0;
        int stackIn_196_0 = 0;
        bg stackIn_211_0 = null;
        int stackIn_211_1 = 0;
        int[] stackIn_211_2 = null;
        bg stackIn_212_0 = null;
        int stackIn_212_1 = 0;
        int[] stackIn_212_2 = null;
        bg stackIn_213_0 = null;
        int stackIn_213_1 = 0;
        int[] stackIn_213_2 = null;
        int stackIn_213_3 = 0;
        bg stackIn_225_0 = null;
        bg stackIn_226_0 = null;
        bg stackIn_227_0 = null;
        int stackIn_227_1 = 0;
        bg stackIn_228_0 = null;
        int stackIn_228_1 = 0;
        int[] stackIn_228_2 = null;
        bg stackIn_229_0 = null;
        int stackIn_229_1 = 0;
        int[] stackIn_229_2 = null;
        bg stackIn_230_0 = null;
        int stackIn_230_1 = 0;
        int[] stackIn_230_2 = null;
        int stackIn_230_3 = 0;
        int stackIn_254_0 = 0;
        int stackIn_267_0 = 0;
        bh stackIn_311_0 = null;
        int stackIn_311_1 = 0;
        bh stackIn_312_0 = null;
        int stackIn_312_1 = 0;
        bh stackIn_313_0 = null;
        int stackIn_313_1 = 0;
        bh stackIn_314_0 = null;
        int stackIn_314_1 = 0;
        bh stackIn_315_0 = null;
        int stackIn_315_1 = 0;
        int stackIn_315_2 = 0;
        int stackIn_330_0 = 0;
        RuntimeException stackIn_357_0 = null;
        StringBuilder stackIn_357_1 = null;
        RuntimeException stackIn_358_0 = null;
        StringBuilder stackIn_358_1 = null;
        RuntimeException stackIn_359_0 = null;
        StringBuilder stackIn_359_1 = null;
        String stackIn_359_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_129_0 = 0;
        bg stackOut_170_0 = null;
        int stackOut_170_1 = 0;
        int[] stackOut_170_2 = null;
        bg stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        int[] stackOut_172_2 = null;
        int stackOut_172_3 = 0;
        bg stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        int[] stackOut_171_2 = null;
        int stackOut_171_3 = 0;
        bg stackOut_155_0 = null;
        bg stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        bg stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        bg stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        int[] stackOut_158_2 = null;
        bg stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        int[] stackOut_160_2 = null;
        int stackOut_160_3 = 0;
        bg stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        int[] stackOut_159_2 = null;
        int stackOut_159_3 = 0;
        bg stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        int[] stackOut_150_2 = null;
        bg stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        int[] stackOut_152_2 = null;
        int stackOut_152_3 = 0;
        bg stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        int[] stackOut_151_2 = null;
        int stackOut_151_3 = 0;
        int stackOut_195_0 = 0;
        int stackOut_194_0 = 0;
        bg stackOut_224_0 = null;
        bg stackOut_226_0 = null;
        int stackOut_226_1 = 0;
        bg stackOut_225_0 = null;
        int stackOut_225_1 = 0;
        bg stackOut_227_0 = null;
        int stackOut_227_1 = 0;
        int[] stackOut_227_2 = null;
        bg stackOut_229_0 = null;
        int stackOut_229_1 = 0;
        int[] stackOut_229_2 = null;
        int stackOut_229_3 = 0;
        bg stackOut_228_0 = null;
        int stackOut_228_1 = 0;
        int[] stackOut_228_2 = null;
        int stackOut_228_3 = 0;
        bg stackOut_210_0 = null;
        int stackOut_210_1 = 0;
        int[] stackOut_210_2 = null;
        bg stackOut_212_0 = null;
        int stackOut_212_1 = 0;
        int[] stackOut_212_2 = null;
        int stackOut_212_3 = 0;
        bg stackOut_211_0 = null;
        int stackOut_211_1 = 0;
        int[] stackOut_211_2 = null;
        int stackOut_211_3 = 0;
        int stackOut_266_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_252_0 = 0;
        bh stackOut_310_0 = null;
        int stackOut_310_1 = 0;
        bh stackOut_311_0 = null;
        int stackOut_311_1 = 0;
        bh stackOut_314_0 = null;
        int stackOut_314_1 = 0;
        int stackOut_314_2 = 0;
        bh stackOut_312_0 = null;
        int stackOut_312_1 = 0;
        bh stackOut_313_0 = null;
        int stackOut_313_1 = 0;
        int stackOut_313_2 = 0;
        int stackOut_329_0 = 0;
        int stackOut_328_0 = 0;
        hb stackOut_32_0 = null;
        hb stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        hb stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        RuntimeException stackOut_356_0 = null;
        StringBuilder stackOut_356_1 = null;
        RuntimeException stackOut_358_0 = null;
        StringBuilder stackOut_358_1 = null;
        String stackOut_358_2 = null;
        RuntimeException stackOut_357_0 = null;
        StringBuilder stackOut_357_1 = null;
        String stackOut_357_2 = null;
        var34 = null;
        var37 = null;
        var32 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var33 = param4.field_f;
              var10_array = var33;
              if (param4.field_w != 2) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var11 = stackIn_4_0;
              if ((param8 ^ -1) <= -1) {
                if (param4.c((byte) 104)) {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_10_0 = stackOut_7_0;
                  break L2;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_10_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_10_0;
              if (var12 != 0) {
                L4: {
                  if (!param4.d(-2)) {
                    break L4;
                  } else {
                    if (0 > param0) {
                      break L4;
                    } else {
                      L5: {
                        if (!this.field_s.field_o) {
                          this.field_s.d(550);
                          this.field_s.a(param4.field_D, param4.field_A, param4.field_v, false, param4.field_h, param4.field_K, param4.field_z);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.field_s.a(0, 0, 12257, 0);
                      break L3;
                    }
                  }
                }
                L6: {
                  if (!this.field_s.field_o) {
                    break L6;
                  } else {
                    this.field_s.field_o = false;
                    this.field_s.d(550);
                    break L6;
                  }
                }
                var14_ref_wo = var33[param8];
                if (this.field_d == this.field_l) {
                  if (5 == param4.h(9979)) {
                    break L3;
                  } else {
                    this.field_s.a(var14_ref_wo.field_k, var14_ref_wo.field_E, 12257, var14_ref_wo.field_y);
                    break L3;
                  }
                } else {
                  var15 = -var10_array[this.field_d].field_E + var14_ref_wo.field_E;
                  var16 = var14_ref_wo.field_y + -var10_array[this.field_d].field_y;
                  var17 = -var10_array[this.field_d].field_k + var14_ref_wo.field_k;
                  this.field_s.a((int)((float)var17 * this.field_p) + var10_array[this.field_d].field_k, (int)(this.field_p * (float)var15) + var10_array[this.field_d].field_E, 12257, var10_array[this.field_d].field_y + (int)((float)var16 * this.field_p));
                  break L3;
                }
              } else {
                L7: {
                  if (-1 == (param4.field_w ^ -1)) {
                    break L7;
                  } else {
                    if (3 == param4.field_w) {
                      break L7;
                    } else {
                      L8: {
                        if (param3) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L8;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L8;
                        }
                      }
                      hn.a(stackIn_16_0 != 0, 180, -120, this.field_s.field_e, -270, -80, -140, 180, 0, 0, -1);
                      break L3;
                    }
                  }
                }
                hn.a(false, param4.field_f[0].field_E, -420, this.field_s.field_e, -270, -64, -140, param4.field_f[0].field_y, 0, 0, -1);
                break L3;
              }
            }
            var13 = 0;
            L9: while (true) {
              if (this.field_c.length <= var13) {
                L10: {
                  if (hn.field_t) {
                    qr.field_l.a(this.field_s.field_e, 28580);
                    break L10;
                  } else {
                    ue.field_N.c(0, 0);
                    break L10;
                  }
                }
                L11: {
                  sc.a(param3, rg.field_f);
                  var13 = param4.h(9979);
                  if (-5 == (var13 ^ -1)) {
                    L12: {
                      var14 = 255 * param4.field_n / 200;
                      if ((var14 ^ -1) >= -256) {
                        break L12;
                      } else {
                        var14 = 255;
                        break L12;
                      }
                    }
                    if (0 < var14) {
                      jn.a(this.field_s.field_e, 3000, ie.field_Hb, 1300, var14, (ie.field_Hb.field_B << -598405085) + 2000, 4000, 10, 2000 + (ie.field_Hb.field_x << -196896029));
                      break L11;
                    } else {
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                L13: {
                  var14 = this.field_s.field_e[0];
                  var15 = this.field_s.field_e[2];
                  var16 = this.field_s.field_e[1];
                  if ((var13 ^ -1) != -8) {
                    if (var13 != 6) {
                      if (3 != var13) {
                        if (var13 == 4) {
                          stackOut_54_0 = 1;
                          stackIn_56_0 = stackOut_54_0;
                          break L13;
                        } else {
                          stackOut_53_0 = 0;
                          stackIn_56_0 = stackOut_53_0;
                          break L13;
                        }
                      } else {
                        stackOut_51_0 = 1;
                        stackIn_56_0 = stackOut_51_0;
                        break L13;
                      }
                    } else {
                      stackOut_49_0 = 1;
                      stackIn_56_0 = stackOut_49_0;
                      break L13;
                    }
                  } else {
                    stackOut_47_0 = 1;
                    stackIn_56_0 = stackOut_47_0;
                    break L13;
                  }
                }
                L14: {
                  var17 = stackIn_56_0;
                  if (cn.field_r) {
                    L15: {
                      var18_ref_fe = sf.field_b;
                      var19 = sf.field_b.field_y << -1829972285;
                      var20_int = sf.field_b.field_t << -1706986781;
                      var21_int = Vertigo2.field_C.field_y << -1638886781;
                      var22 = Vertigo2.field_C.field_t << -942226365;
                      var23 = ji.field_p.field_y << -1479130397;
                      var24 = ji.field_p.field_t << -613643965;
                      var25 = jf.field_M.field_y << -2134435453;
                      var26 = jf.field_M.field_t << -1244068445;
                      if (var13 != 4) {
                        gb.a(this.field_r[0][1], jf.field_M, var26, this.field_r[0][0], this.field_s.field_e, this.field_r[0][2], var25, -86);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if ((var13 ^ -1) != -5) {
                        var27_int = 0;
                        L17: while (true) {
                          if ((var27_int ^ -1) <= -1001) {
                            break L16;
                          } else {
                            gb.a(this.field_u[var27_int][1], var18_ref_fe, var20_int, this.field_u[var27_int][0], this.field_s.field_e, this.field_u[var27_int][2], var19, -95);
                            var27_int++;
                            continue L17;
                          }
                        }
                      } else {
                        if (200 > param4.field_n) {
                          var27_int = -(param4.field_n * 255 / 200) + 255;
                          var28 = 0;
                          L18: while (true) {
                            if ((var28 ^ -1) <= -1001) {
                              break L16;
                            } else {
                              jn.a(this.field_s.field_e, this.field_u[var28][2], var18_ref_fe, this.field_u[var28][1], var27_int, var20_int, this.field_u[var28][0], 10, var19);
                              var28++;
                              continue L18;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    if (var13 != 4) {
                      gb.a(this.field_v[0][1], Vertigo2.field_C, var22, this.field_v[0][0], this.field_s.field_e, this.field_v[0][2], var21_int, -128);
                      gb.a(this.field_v[1][1], ji.field_p, var24, this.field_v[1][0], this.field_s.field_e, this.field_v[1][2], var23, -128);
                      break L14;
                    } else {
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
                L19: {
                  if (gi.field_r) {
                    bi.a(0, 0, 640, 480);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  var18 = var16 - 240;
                  if (-2 != (param4.h(9979) ^ -1)) {
                    break L20;
                  } else {
                    if (this.field_s.field_o) {
                      break L20;
                    } else {
                      if (var16 - -240 < var33[param8].field_k) {
                        var18 = var16;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
                var19 = 0;
                var20 = param4.c(108);
                var21_int = -1 + param4.l(81);
                L21: while (true) {
                  if (-1 < (var21_int ^ -1)) {
                    var21 = param4.m(9384);
                    var22 = param4.e((byte) -128) + -1;
                    L22: while (true) {
                      if ((var22 ^ -1) > -1) {
                        var22 = 0;
                        L23: while (true) {
                          if (this.field_g.length <= var22) {
                            L24: {
                              if (var17 != 0) {
                                L25: {
                                  this.field_c[0].a(param8, -25196);
                                  if (this.field_c.length <= 1) {
                                    break L25;
                                  } else {
                                    this.field_c[1].a(1 - param8, -25196);
                                    break L25;
                                  }
                                }
                                if (var13 == 0) {
                                  break L24;
                                } else {
                                  var22 = 0;
                                  L26: while (true) {
                                    if (var22 >= this.field_c.length) {
                                      break L24;
                                    } else {
                                      this.field_j[var19] = this.field_c[var22].a(var14, var15, 0, var16);
                                      incrementValue$7 = var19;
                                      var19++;
                                      this.field_a[incrementValue$7] = (bg) ((Object) this.field_c[var22]);
                                      var22++;
                                      continue L26;
                                    }
                                  }
                                }
                              } else {
                                if (var13 == 0) {
                                  break L24;
                                } else {
                                  var22 = 0;
                                  L27: while (true) {
                                    if (var22 >= this.field_c.length) {
                                      break L24;
                                    } else {
                                      this.field_j[var19] = this.field_c[var22].a(var14, var15, 0, var16);
                                      incrementValue$8 = var19;
                                      var19++;
                                      this.field_a[incrementValue$8] = (bg) ((Object) this.field_c[var22]);
                                      var22++;
                                      continue L27;
                                    }
                                  }
                                }
                              }
                            }
                            L28: {
                              this.a(-1 + var19, 3, 0);
                              if (lf.field_C) {
                                L29: {
                                  L30: {
                                    if (null == dc.field_J) {
                                      break L30;
                                    } else {
                                      if (dc.field_J.length == this.field_c.length) {
                                        break L29;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  dc.field_J = new lg[this.field_c.length];
                                  break L29;
                                }
                                L31: {
                                  L32: {
                                    if (null == oe.field_ob) {
                                      break L32;
                                    } else {
                                      if (this.field_c.length == oe.field_ob.length) {
                                        break L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  oe.field_ob = new int[this.field_c.length][3];
                                  break L31;
                                }
                                L33: {
                                  if (null != va.field_b) {
                                    break L33;
                                  } else {
                                    va.field_b = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
                                    break L33;
                                  }
                                }
                                var22 = 0;
                                L34: while (true) {
                                  if (this.field_c.length <= var22) {
                                    break L28;
                                  } else {
                                    this.field_c[var22].b(true);
                                    dc.field_J[var22] = this.field_c[var22].c((byte) 4);
                                    oe.field_ob[var22][0] = this.field_c[var22].field_w;
                                    oe.field_ob[var22][1] = this.field_c[var22].field_z;
                                    oe.field_ob[var22][2] = this.field_c[var22].field_x;
                                    var22++;
                                    continue L34;
                                  }
                                }
                              } else {
                                var22 = 0;
                                L35: while (true) {
                                  if (var22 >= this.field_c.length) {
                                    break L28;
                                  } else {
                                    this.field_c[var22].b(true);
                                    var22++;
                                    continue L35;
                                  }
                                }
                              }
                            }
                            L36: {
                              var22 = param4.field_n;
                              if ((this.field_s.c(-1870) ^ -1) != -3) {
                                if ((this.field_s.b(1) ^ -1) == -3) {
                                  stackOut_132_0 = 1;
                                  stackIn_134_0 = stackOut_132_0;
                                  break L36;
                                } else {
                                  stackOut_131_0 = 0;
                                  stackIn_134_0 = stackOut_131_0;
                                  break L36;
                                }
                              } else {
                                stackOut_129_0 = 1;
                                stackIn_134_0 = stackOut_129_0;
                                break L36;
                              }
                            }
                            L37: {
                              L38: {
                                var23 = stackIn_134_0;
                                if (var13 == 2) {
                                  break L38;
                                } else {
                                  if (var13 == 7) {
                                    break L38;
                                  } else {
                                    var24 = var19 - 1;
                                    L39: while (true) {
                                      if (0 > var24) {
                                        break L37;
                                      } else {
                                        L40: {
                                          if (!(this.field_a[var24] instanceof hb)) {
                                            L41: {
                                              var25_ref_int__ = oo.field_c;
                                              var26 = this.field_a[var24].a(5) - var33[param8].field_k;
                                              if (-1 <= (var26 ^ -1)) {
                                                break L41;
                                              } else {
                                                if (!this.field_s.field_o) {
                                                  L42: {
                                                    if (var26 < 720) {
                                                      var27_int = var26 / hn.field_v;
                                                      break L42;
                                                    } else {
                                                      var27_int = 15;
                                                      break L42;
                                                    }
                                                  }
                                                  oo.field_c = Vertigo2.field_J[var27_int];
                                                  break L41;
                                                } else {
                                                  break L41;
                                                }
                                              }
                                            }
                                            L43: {
                                              if (var23 != 0) {
                                                if (this.field_a[var24].a(5) < -16 + var33[param8].field_k) {
                                                  L44: {
                                                    var27_int = 24;
                                                    var28_ref = oo.field_c;
                                                    var29 = var27_int;
                                                    if (12 > var29) {
                                                      break L44;
                                                    } else {
                                                      var29 = 11;
                                                      break L44;
                                                    }
                                                  }
                                                  L45: {
                                                    oo.field_c = bm.field_G[var29];
                                                    var27_int -= 12;
                                                    var30_ref = null;
                                                    if (var27_int >= 0) {
                                                      L46: {
                                                        if (var27_int >= 12) {
                                                          var27_int = 11;
                                                          break L46;
                                                        } else {
                                                          break L46;
                                                        }
                                                      }
                                                      var30_ref = lf.field_A[var27_int];
                                                      break L45;
                                                    } else {
                                                      break L45;
                                                    }
                                                  }
                                                  L47: {
                                                    stackOut_170_0 = this.field_a[var24];
                                                    stackOut_170_1 = -30;
                                                    stackOut_170_2 = this.field_s.field_e;
                                                    stackIn_172_0 = stackOut_170_0;
                                                    stackIn_172_1 = stackOut_170_1;
                                                    stackIn_172_2 = stackOut_170_2;
                                                    stackIn_171_0 = stackOut_170_0;
                                                    stackIn_171_1 = stackOut_170_1;
                                                    stackIn_171_2 = stackOut_170_2;
                                                    if (param4.field_w != 2) {
                                                      stackOut_172_0 = (bg) ((Object) stackIn_172_0);
                                                      stackOut_172_1 = stackIn_172_1;
                                                      stackOut_172_2 = (int[]) ((Object) stackIn_172_2);
                                                      stackOut_172_3 = 0;
                                                      stackIn_173_0 = stackOut_172_0;
                                                      stackIn_173_1 = stackOut_172_1;
                                                      stackIn_173_2 = stackOut_172_2;
                                                      stackIn_173_3 = stackOut_172_3;
                                                      break L47;
                                                    } else {
                                                      stackOut_171_0 = (bg) ((Object) stackIn_171_0);
                                                      stackOut_171_1 = stackIn_171_1;
                                                      stackOut_171_2 = (int[]) ((Object) stackIn_171_2);
                                                      stackOut_171_3 = 1;
                                                      stackIn_173_0 = stackOut_171_0;
                                                      stackIn_173_1 = stackOut_171_1;
                                                      stackIn_173_2 = stackOut_171_2;
                                                      stackIn_173_3 = stackOut_171_3;
                                                      break L47;
                                                    }
                                                  }
                                                  ((bg) (Object) stackIn_173_0).a(stackIn_173_1, stackIn_173_2, stackIn_173_3 != 0, (byte[]) (var30_ref), this.field_s.field_o);
                                                  oo.field_c = (int[]) (var28_ref);
                                                  break L43;
                                                } else {
                                                  L48: {
                                                    stackOut_155_0 = this.field_a[var24];
                                                    stackIn_157_0 = stackOut_155_0;
                                                    stackIn_156_0 = stackOut_155_0;
                                                    if (param3) {
                                                      stackOut_157_0 = (bg) ((Object) stackIn_157_0);
                                                      stackOut_157_1 = 0;
                                                      stackIn_158_0 = stackOut_157_0;
                                                      stackIn_158_1 = stackOut_157_1;
                                                      break L48;
                                                    } else {
                                                      stackOut_156_0 = (bg) ((Object) stackIn_156_0);
                                                      stackOut_156_1 = 1;
                                                      stackIn_158_0 = stackOut_156_0;
                                                      stackIn_158_1 = stackOut_156_1;
                                                      break L48;
                                                    }
                                                  }
                                                  L49: {
                                                    stackOut_158_0 = (bg) ((Object) stackIn_158_0);
                                                    stackOut_158_1 = stackIn_158_1;
                                                    stackOut_158_2 = this.field_s.field_e;
                                                    stackIn_160_0 = stackOut_158_0;
                                                    stackIn_160_1 = stackOut_158_1;
                                                    stackIn_160_2 = stackOut_158_2;
                                                    stackIn_159_0 = stackOut_158_0;
                                                    stackIn_159_1 = stackOut_158_1;
                                                    stackIn_159_2 = stackOut_158_2;
                                                    if (-3 != (param4.field_w ^ -1)) {
                                                      stackOut_160_0 = (bg) ((Object) stackIn_160_0);
                                                      stackOut_160_1 = stackIn_160_1;
                                                      stackOut_160_2 = (int[]) ((Object) stackIn_160_2);
                                                      stackOut_160_3 = 0;
                                                      stackIn_161_0 = stackOut_160_0;
                                                      stackIn_161_1 = stackOut_160_1;
                                                      stackIn_161_2 = stackOut_160_2;
                                                      stackIn_161_3 = stackOut_160_3;
                                                      break L49;
                                                    } else {
                                                      stackOut_159_0 = (bg) ((Object) stackIn_159_0);
                                                      stackOut_159_1 = stackIn_159_1;
                                                      stackOut_159_2 = (int[]) ((Object) stackIn_159_2);
                                                      stackOut_159_3 = 1;
                                                      stackIn_161_0 = stackOut_159_0;
                                                      stackIn_161_1 = stackOut_159_1;
                                                      stackIn_161_2 = stackOut_159_2;
                                                      stackIn_161_3 = stackOut_159_3;
                                                      break L49;
                                                    }
                                                  }
                                                  ((bg) (Object) stackIn_161_0).a(stackIn_161_1 != 0, stackIn_161_2, stackIn_161_3 != 0, this.field_s.field_o);
                                                  break L43;
                                                }
                                              } else {
                                                L50: {
                                                  stackOut_150_0 = this.field_a[var24];
                                                  stackOut_150_1 = 0;
                                                  stackOut_150_2 = this.field_s.field_e;
                                                  stackIn_152_0 = stackOut_150_0;
                                                  stackIn_152_1 = stackOut_150_1;
                                                  stackIn_152_2 = stackOut_150_2;
                                                  stackIn_151_0 = stackOut_150_0;
                                                  stackIn_151_1 = stackOut_150_1;
                                                  stackIn_151_2 = stackOut_150_2;
                                                  if (-3 != (param4.field_w ^ -1)) {
                                                    stackOut_152_0 = (bg) ((Object) stackIn_152_0);
                                                    stackOut_152_1 = stackIn_152_1;
                                                    stackOut_152_2 = (int[]) ((Object) stackIn_152_2);
                                                    stackOut_152_3 = 0;
                                                    stackIn_153_0 = stackOut_152_0;
                                                    stackIn_153_1 = stackOut_152_1;
                                                    stackIn_153_2 = stackOut_152_2;
                                                    stackIn_153_3 = stackOut_152_3;
                                                    break L50;
                                                  } else {
                                                    stackOut_151_0 = (bg) ((Object) stackIn_151_0);
                                                    stackOut_151_1 = stackIn_151_1;
                                                    stackOut_151_2 = (int[]) ((Object) stackIn_151_2);
                                                    stackOut_151_3 = 1;
                                                    stackIn_153_0 = stackOut_151_0;
                                                    stackIn_153_1 = stackOut_151_1;
                                                    stackIn_153_2 = stackOut_151_2;
                                                    stackIn_153_3 = stackOut_151_3;
                                                    break L50;
                                                  }
                                                }
                                                ((bg) (Object) stackIn_153_0).a(stackIn_153_1 != 0, stackIn_153_2, stackIn_153_3 != 0, this.field_s.field_o);
                                                break L43;
                                              }
                                            }
                                            oo.field_c = var25_ref_int__;
                                            break L40;
                                          } else {
                                            var34_ref = (hb) ((Object) this.field_a[var24]);
                                            if (var34_ref.b(100) != param8) {
                                              var34_ref.a(-30, this.field_s.field_e, var11 != 0, lf.field_A[5], this.field_s.field_o);
                                              break L40;
                                            } else {
                                              var34_ref.a(false, this.field_s.field_e, var11 != 0, this.field_s.field_o);
                                              break L40;
                                            }
                                          }
                                        }
                                        L51: {
                                          if (!lf.field_C) {
                                            break L51;
                                          } else {
                                            if (var13 != 0) {
                                              if (-1 != (this.field_a[var24].field_d ^ -1)) {
                                                var25 = 0;
                                                L52: while (true) {
                                                  if (var25 >= this.field_c.length) {
                                                    break L51;
                                                  } else {
                                                    L53: {
                                                      if (dc.field_J[var25] == null) {
                                                        break L53;
                                                      } else {
                                                        if ((var25 - -1 & this.field_a[var24].field_d) == 0) {
                                                          break L53;
                                                        } else {
                                                          va.field_b[0] = oe.field_ob[var25][0];
                                                          va.field_b[2] = oe.field_ob[var25][1];
                                                          va.field_b[1] = this.field_a[var24].a(true);
                                                          var26 = -(128 * (va.field_b[1] - oe.field_ob[var25][2]) / 960) + 128;
                                                          if ((var26 ^ -1) >= -11) {
                                                            break L53;
                                                          } else {
                                                            if (var26 <= 128) {
                                                              var35 = new lg(dc.field_J[var25], false, true, true, true);
                                                              var35.b(var26, 128, var26);
                                                              var36 = this.field_a[var24].a(var35, oe.field_ob[var25][0], oe.field_ob[var25][1], (byte) -101);
                                                              if (var36 == null) {
                                                                break L53;
                                                              } else {
                                                                if (var36.field_T >= 4096) {
                                                                  break L53;
                                                                } else {
                                                                  if (var36.field_w >= 4096) {
                                                                    break L53;
                                                                  } else {
                                                                    var36.field_K = false;
                                                                    var36.a(this.field_s.field_e, va.field_b);
                                                                    break L53;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              break L53;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var25++;
                                                    continue L52;
                                                  }
                                                }
                                              } else {
                                                break L51;
                                              }
                                            } else {
                                              break L51;
                                            }
                                          }
                                        }
                                        var24--;
                                        continue L39;
                                      }
                                    }
                                  }
                                }
                              }
                              L54: {
                                if ((var22 ^ -1) > -51) {
                                  stackOut_195_0 = 0;
                                  stackIn_196_0 = stackOut_195_0;
                                  break L54;
                                } else {
                                  stackOut_194_0 = 1;
                                  stackIn_196_0 = stackOut_194_0;
                                  break L54;
                                }
                              }
                              var24 = stackIn_196_0;
                              if (var24 != 0) {
                                var25 = 0;
                                L55: while (true) {
                                  if (this.field_c.length <= var25) {
                                    this.field_s.field_e[1] = this.field_s.field_e[1] - (-1000 + var22 * 20);
                                    var25 = -1 + var19;
                                    L56: while (true) {
                                      if ((var25 ^ -1) > -1) {
                                        break L37;
                                      } else {
                                        L57: {
                                          if (this.field_a[var25] instanceof hb) {
                                            L58: {
                                              stackOut_224_0 = this.field_a[var25];
                                              stackIn_226_0 = stackOut_224_0;
                                              stackIn_225_0 = stackOut_224_0;
                                              if (param3) {
                                                stackOut_226_0 = (bg) ((Object) stackIn_226_0);
                                                stackOut_226_1 = 0;
                                                stackIn_227_0 = stackOut_226_0;
                                                stackIn_227_1 = stackOut_226_1;
                                                break L58;
                                              } else {
                                                stackOut_225_0 = (bg) ((Object) stackIn_225_0);
                                                stackOut_225_1 = 1;
                                                stackIn_227_0 = stackOut_225_0;
                                                stackIn_227_1 = stackOut_225_1;
                                                break L58;
                                              }
                                            }
                                            L59: {
                                              stackOut_227_0 = (bg) ((Object) stackIn_227_0);
                                              stackOut_227_1 = stackIn_227_1;
                                              stackOut_227_2 = this.field_s.field_e;
                                              stackIn_229_0 = stackOut_227_0;
                                              stackIn_229_1 = stackOut_227_1;
                                              stackIn_229_2 = stackOut_227_2;
                                              stackIn_228_0 = stackOut_227_0;
                                              stackIn_228_1 = stackOut_227_1;
                                              stackIn_228_2 = stackOut_227_2;
                                              if (-3 != (param4.field_w ^ -1)) {
                                                stackOut_229_0 = (bg) ((Object) stackIn_229_0);
                                                stackOut_229_1 = stackIn_229_1;
                                                stackOut_229_2 = (int[]) ((Object) stackIn_229_2);
                                                stackOut_229_3 = 0;
                                                stackIn_230_0 = stackOut_229_0;
                                                stackIn_230_1 = stackOut_229_1;
                                                stackIn_230_2 = stackOut_229_2;
                                                stackIn_230_3 = stackOut_229_3;
                                                break L59;
                                              } else {
                                                stackOut_228_0 = (bg) ((Object) stackIn_228_0);
                                                stackOut_228_1 = stackIn_228_1;
                                                stackOut_228_2 = (int[]) ((Object) stackIn_228_2);
                                                stackOut_228_3 = 1;
                                                stackIn_230_0 = stackOut_228_0;
                                                stackIn_230_1 = stackOut_228_1;
                                                stackIn_230_2 = stackOut_228_2;
                                                stackIn_230_3 = stackOut_228_3;
                                                break L59;
                                              }
                                            }
                                            ((bg) (Object) stackIn_230_0).a(stackIn_230_1 != 0, stackIn_230_2, stackIn_230_3 != 0, this.field_s.field_o);
                                            break L57;
                                          } else {
                                            break L57;
                                          }
                                        }
                                        var25--;
                                        continue L56;
                                      }
                                    }
                                  } else {
                                    this.field_c[var25].a(6, (byte) -36);
                                    var25++;
                                    continue L55;
                                  }
                                }
                              } else {
                                L60: {
                                  var25 = var22 * 24 / 50;
                                  var26_ref_int__ = oo.field_c;
                                  var27_int = var25;
                                  if (12 > var27_int) {
                                    break L60;
                                  } else {
                                    var27_int = 11;
                                    break L60;
                                  }
                                }
                                L61: {
                                  oo.field_c = bm.field_G[var27_int];
                                  var28_ref = null;
                                  var25 -= 12;
                                  if (0 > var25) {
                                    break L61;
                                  } else {
                                    L62: {
                                      if (var25 >= 12) {
                                        var25 = 11;
                                        break L62;
                                      } else {
                                        break L62;
                                      }
                                    }
                                    var28_ref = lf.field_A[var25];
                                    break L61;
                                  }
                                }
                                var29 = var19 + -1;
                                L63: while (true) {
                                  if (var29 < 0) {
                                    oo.field_c = var26_ref_int__;
                                    break L37;
                                  } else {
                                    L64: {
                                      if (this.field_a[var29] instanceof hb) {
                                        L65: {
                                          var37_ref = (hb) ((Object) this.field_a[var29]);
                                          oo.field_c = var26_ref_int__;
                                          if (var37_ref.b(108) != param8) {
                                            L66: {
                                              stackOut_210_0 = this.field_a[var29];
                                              stackOut_210_1 = -30;
                                              stackOut_210_2 = this.field_s.field_e;
                                              stackIn_212_0 = stackOut_210_0;
                                              stackIn_212_1 = stackOut_210_1;
                                              stackIn_212_2 = stackOut_210_2;
                                              stackIn_211_0 = stackOut_210_0;
                                              stackIn_211_1 = stackOut_210_1;
                                              stackIn_211_2 = stackOut_210_2;
                                              if (param4.field_w != 2) {
                                                stackOut_212_0 = (bg) ((Object) stackIn_212_0);
                                                stackOut_212_1 = stackIn_212_1;
                                                stackOut_212_2 = (int[]) ((Object) stackIn_212_2);
                                                stackOut_212_3 = 0;
                                                stackIn_213_0 = stackOut_212_0;
                                                stackIn_213_1 = stackOut_212_1;
                                                stackIn_213_2 = stackOut_212_2;
                                                stackIn_213_3 = stackOut_212_3;
                                                break L66;
                                              } else {
                                                stackOut_211_0 = (bg) ((Object) stackIn_211_0);
                                                stackOut_211_1 = stackIn_211_1;
                                                stackOut_211_2 = (int[]) ((Object) stackIn_211_2);
                                                stackOut_211_3 = 1;
                                                stackIn_213_0 = stackOut_211_0;
                                                stackIn_213_1 = stackOut_211_1;
                                                stackIn_213_2 = stackOut_211_2;
                                                stackIn_213_3 = stackOut_211_3;
                                                break L66;
                                              }
                                            }
                                            ((bg) (Object) stackIn_213_0).a(stackIn_213_1, stackIn_213_2, stackIn_213_3 != 0, lf.field_A[8], this.field_s.field_o);
                                            break L65;
                                          } else {
                                            var37_ref.a(false, this.field_s.field_e, var11 != 0, this.field_s.field_o);
                                            break L65;
                                          }
                                        }
                                        oo.field_c = bm.field_G[var27_int];
                                        break L64;
                                      } else {
                                        this.field_a[var29].a(-30, this.field_s.field_e, var11 != 0, (byte[]) (var28_ref), this.field_s.field_o);
                                        break L64;
                                      }
                                    }
                                    var29--;
                                    continue L63;
                                  }
                                }
                              }
                            }
                            var24 = 0;
                            L67: while (true) {
                              if (var24 >= this.field_g.length) {
                                L68: {
                                  var27_int = var13;
                                  if (-1 == (var27_int ^ -1)) {
                                    if (-1 != (param4.field_w ^ -1)) {
                                      if (param4.field_w != 1) {
                                        if (param4.field_w != 2) {
                                          break L68;
                                        } else {
                                          var39 = new String[4];
                                          var27 = var39;
                                          var27[0] = hk.field_r;
                                          var27[1] = Vertigo2.a(new String[]{Integer.toString(param2), Integer.toString(param1)}, qh.field_c, -126);
                                          var27[3] = de.field_c;
                                          var27[2] = lh.field_d;
                                          var28 = 1;
                                          var29 = 0;
                                          L69: while (true) {
                                            if (var39.length <= var29) {
                                              var28 += 20;
                                              var29 = 610 - var28 / 2;
                                              qi.a(false, -(var28 / 2) + var29, var28, 5);
                                              va.field_s.a(var39[0], 16777215, -1, var29, 30, 2);
                                              qi.a(false, -(var28 / 2) + var29, var28, 55);
                                              va.field_s.a(var39[1], 16777215, -1, var29, 80, 2);
                                              if (0 <= param0) {
                                                L70: {
                                                  if (param3) {
                                                    stackOut_266_0 = 0;
                                                    stackIn_267_0 = stackOut_266_0;
                                                    break L70;
                                                  } else {
                                                    stackOut_265_0 = 1;
                                                    stackIn_267_0 = stackOut_265_0;
                                                    break L70;
                                                  }
                                                }
                                                qi.a(stackIn_267_0 != 0, var29 - var28 / 2, var28, 105);
                                                if (param8 == 0) {
                                                  va.field_s.a(lh.field_d, 16131600, -1, var29, 130, 2);
                                                  break L68;
                                                } else {
                                                  va.field_s.a(de.field_c, 2479095, -1, var29, 130, 2);
                                                  break L68;
                                                }
                                              } else {
                                                break L68;
                                              }
                                            } else {
                                              var28 = Math.max(var28, va.field_s.a(1, var39[var29]));
                                              var29++;
                                              continue L69;
                                            }
                                          }
                                        }
                                      } else {
                                        var38 = new String[4];
                                        var27 = var38;
                                        var27[0] = bq.field_H;
                                        var27[1] = Vertigo2.a(new String[]{Integer.toString(param2), Integer.toString(param1)}, qh.field_c, -118);
                                        var27[2] = lh.field_d;
                                        var27[3] = de.field_c;
                                        var28 = 1;
                                        var29 = 0;
                                        L71: while (true) {
                                          if (var38.length <= var29) {
                                            L72: {
                                              var28 += 20;
                                              var29 = -(var28 / 2) + 610;
                                              if (param3) {
                                                stackOut_253_0 = 0;
                                                stackIn_254_0 = stackOut_253_0;
                                                break L72;
                                              } else {
                                                stackOut_252_0 = 1;
                                                stackIn_254_0 = stackOut_252_0;
                                                break L72;
                                              }
                                            }
                                            qi.a(stackIn_254_0 != 0, var29 + -(var28 / 2), var28, 5);
                                            va.field_s.a(var38[0], 16777215, -1, var29, 30, 2);
                                            qi.a(false, -(var28 / 2) + var29, var28, 55);
                                            va.field_s.a(var38[1], 16777215, -1, var29, 80, 2);
                                            if (param0 < 0) {
                                              break L68;
                                            } else {
                                              qi.a(false, -(var28 / 2) + var29, var28, 105);
                                              if (param8 != 0) {
                                                va.field_s.a(var38[3], 2479095, -1, var29, 130, 2);
                                                break L68;
                                              } else {
                                                va.field_s.a(var38[2], 16131600, -1, var29, 130, 2);
                                                break L68;
                                              }
                                            }
                                          } else {
                                            var28 = Math.max(var28, va.field_s.a(1, var38[var29]));
                                            var29++;
                                            continue L71;
                                          }
                                        }
                                      }
                                    } else {
                                      va.field_s.a(620, -45, 16777215, 30, -1, Vertigo2.a(new String[]{Integer.toString(param7 + 1)}, bl.field_o, -121));
                                      break L68;
                                    }
                                  } else {
                                    if (2 != var27_int) {
                                      if ((var27_int ^ -1) == -6) {
                                        L73: {
                                          var24 = -1;
                                          var25 = 0;
                                          if (!param4.k(94)) {
                                            break L73;
                                          } else {
                                            L74: {
                                              if (param0 == 0) {
                                                var24 = 5;
                                                break L74;
                                              } else {
                                                var24 = 7;
                                                break L74;
                                              }
                                            }
                                            var27_int = -(ea.field_d[var24].field_x / 2) + 320;
                                            var25 = 1;
                                            ea.field_d[var24].e(var27_int, 70);
                                            break L73;
                                          }
                                        }
                                        if (param4.b(-15531)) {
                                          L75: {
                                            if (-2 != (param0 ^ -1)) {
                                              var24 = 8;
                                              break L75;
                                            } else {
                                              var24 = 5;
                                              break L75;
                                            }
                                          }
                                          L76: {
                                            var27_int = 70;
                                            if (var25 != 0) {
                                              var27_int = var27_int + (ea.field_d[7].field_B + 20);
                                              break L76;
                                            } else {
                                              break L76;
                                            }
                                          }
                                          var28 = -(ea.field_d[var24].field_x / 2) + 320;
                                          ea.field_d[var24].e(var28, var27_int);
                                          break L68;
                                        } else {
                                          break L68;
                                        }
                                      } else {
                                        if ((var27_int ^ -1) != -4) {
                                          if (4 == var27_int) {
                                            ea.field_d[6].e(-(ea.field_d[6].field_x / 2) + 320, -20);
                                            va.field_s.a(md.field_y, 16777215, -1, 320, 420, 2);
                                            break L68;
                                          } else {
                                            if (-7 == (var27_int ^ -1)) {
                                              L77: {
                                                if (param4.field_w == 2) {
                                                  break L77;
                                                } else {
                                                  ea.field_d[1].e(320 - ea.field_d[1].field_x / 2, 70);
                                                  break L77;
                                                }
                                              }
                                              if (0 != param4.field_w) {
                                                L78: {
                                                  var27_int = (-var22 + 250) / 50;
                                                  if (-1 < (var27_int ^ -1)) {
                                                    var27_int = 0;
                                                    break L78;
                                                  } else {
                                                    break L78;
                                                  }
                                                }
                                                va.field_s.a(Vertigo2.a(new String[]{Integer.toString(var27_int)}, lr.field_T, -114), 16777215, -1, 320, 420, 2);
                                                if (param4.field_w != 2) {
                                                  break L68;
                                                } else {
                                                  L79: {
                                                    var28 = param4.field_E;
                                                    if (-1 >= (param0 ^ -1)) {
                                                      if (50 >= var28) {
                                                        if (-51 < (var28 ^ -1)) {
                                                          if (0 != param8) {
                                                            var29_ref_String = Vertigo2.a(new String[]{Integer.toString(-var28 + 100), rq.field_x}, pe.field_L, -13);
                                                            ea.field_d[2].e(320 - ea.field_d[2].field_x / 2, 70);
                                                            break L79;
                                                          } else {
                                                            var29_ref_String = Vertigo2.a(new String[]{Integer.toString(var28), rq.field_A}, ad.field_b, -118);
                                                            ea.field_d[3].e(320 + -(ea.field_d[3].field_x / 2), 70);
                                                            break L79;
                                                          }
                                                        } else {
                                                          var29_ref_String = Vertigo2.a(new String[]{Integer.toString(var28), rq.field_A}, gp.field_q, 90);
                                                          ea.field_d[4].e(-(ea.field_d[4].field_x / 2) + 320, 70);
                                                          break L79;
                                                        }
                                                      } else {
                                                        if (param8 != 0) {
                                                          var29_ref_String = Vertigo2.a(new String[]{Integer.toString(-var28 + 100), rq.field_x}, ad.field_b, 47);
                                                          ea.field_d[3].e(-(ea.field_d[3].field_x / 2) + 320, 70);
                                                          break L79;
                                                        } else {
                                                          var29_ref_String = Vertigo2.a(new String[]{Integer.toString(var28), rq.field_A}, pe.field_L, -126);
                                                          ea.field_d[2].e(320 + -(ea.field_d[2].field_x / 2), 70);
                                                          break L79;
                                                        }
                                                      }
                                                    } else {
                                                      var29_ref_String = Vertigo2.a(new String[]{Integer.toString(var28), rq.field_A}, gp.field_q, -128);
                                                      if (50 >= var28) {
                                                        if (-51 < (var28 ^ -1)) {
                                                          ea.field_d[10].e(-(ea.field_d[10].field_x / 2) + 320, 70);
                                                          break L79;
                                                        } else {
                                                          ea.field_d[4].e(320 - ea.field_d[4].field_x / 2, 70);
                                                          break L79;
                                                        }
                                                      } else {
                                                        ea.field_d[9].e(320 - ea.field_d[9].field_x / 2, 70);
                                                        break L79;
                                                      }
                                                    }
                                                  }
                                                  va.field_s.a(var29_ref_String, 16777215, -1, 320, 200, 2);
                                                  break L68;
                                                }
                                              } else {
                                                va.field_s.a(md.field_y, 16777215, -1, 320, 420, 2);
                                                break L68;
                                              }
                                            } else {
                                              if (var27_int != 1) {
                                                break L68;
                                              } else {
                                                L80: {
                                                  L81: {
                                                    stackOut_310_0 = (bh) (param4);
                                                    stackOut_310_1 = 3;
                                                    stackIn_313_0 = stackOut_310_0;
                                                    stackIn_313_1 = stackOut_310_1;
                                                    stackIn_311_0 = stackOut_310_0;
                                                    stackIn_311_1 = stackOut_310_1;
                                                    if (param4.field_w == 0) {
                                                      break L81;
                                                    } else {
                                                      stackOut_311_0 = (bh) ((Object) stackIn_311_0);
                                                      stackOut_311_1 = stackIn_311_1;
                                                      stackIn_314_0 = stackOut_311_0;
                                                      stackIn_314_1 = stackOut_311_1;
                                                      stackIn_312_0 = stackOut_311_0;
                                                      stackIn_312_1 = stackOut_311_1;
                                                      if (-4 != (param4.field_w ^ -1)) {
                                                        stackOut_314_0 = (bh) ((Object) stackIn_314_0);
                                                        stackOut_314_1 = stackIn_314_1;
                                                        stackOut_314_2 = 0;
                                                        stackIn_315_0 = stackOut_314_0;
                                                        stackIn_315_1 = stackOut_314_1;
                                                        stackIn_315_2 = stackOut_314_2;
                                                        break L80;
                                                      } else {
                                                        stackOut_312_0 = (bh) ((Object) stackIn_312_0);
                                                        stackOut_312_1 = stackIn_312_1;
                                                        stackIn_313_0 = stackOut_312_0;
                                                        stackIn_313_1 = stackOut_312_1;
                                                        break L81;
                                                      }
                                                    }
                                                  }
                                                  stackOut_313_0 = (bh) ((Object) stackIn_313_0);
                                                  stackOut_313_1 = stackIn_313_1;
                                                  stackOut_313_2 = 1;
                                                  stackIn_315_0 = stackOut_313_0;
                                                  stackIn_315_1 = stackOut_313_1;
                                                  stackIn_315_2 = stackOut_313_2;
                                                  break L80;
                                                }
                                                L82: {
                                                  var26 = ((bh) (Object) stackIn_315_0).c(stackIn_315_1, stackIn_315_2 != 0);
                                                  this.field_f.field_d = var26;
                                                  this.field_f.a(200, true, 220, 28, 14);
                                                  if ((param4.field_w ^ -1) != -3) {
                                                    if (1 == param4.field_w) {
                                                      L83: {
                                                        if (param3) {
                                                          stackOut_329_0 = 0;
                                                          stackIn_330_0 = stackOut_329_0;
                                                          break L83;
                                                        } else {
                                                          stackOut_328_0 = 1;
                                                          stackIn_330_0 = stackOut_328_0;
                                                          break L83;
                                                        }
                                                      }
                                                      qi.a(stackIn_330_0 != 0, 20, va.field_s.a(1, lp.field_A), 55);
                                                      va.field_s.a(16777215, (byte) 104, -1, 20, lp.field_A, 80);
                                                      break L82;
                                                    } else {
                                                      break L82;
                                                    }
                                                  } else {
                                                    L84: {
                                                      var27_int = param4.field_I / 50;
                                                      qi.a(false, 20, va.field_s.a(1, tr.field_e), 10);
                                                      if (-1 < (var27_int ^ -1)) {
                                                        var27_int = 0;
                                                        break L84;
                                                      } else {
                                                        break L84;
                                                      }
                                                    }
                                                    va.field_s.a(16777215, (byte) 52, -1, 20, tr.field_e, 35);
                                                    if ((param4.field_I ^ -1) < -1) {
                                                      L85: {
                                                        var40 = Vertigo2.a(new String[]{gl.a(-121, true, false, param4.field_I)}, mc.field_f, -3);
                                                        var29 = va.field_s.a(1, var40);
                                                        qi.a(false, -20 + -var29 + 640, var29, 60);
                                                        var30 = 16777215;
                                                        if (-11 < (var27_int ^ -1)) {
                                                          var31 = (int)(100.0 * (Math.sin((double)param4.field_I / 8.0) + 1.0)) + 55;
                                                          var30 = var31 + (var31 << 493105224) - -16711680;
                                                          break L85;
                                                        } else {
                                                          break L85;
                                                        }
                                                      }
                                                      va.field_s.a(var30, (byte) 108, -1, 640 - (var29 - -20), var40, 66 - -va.field_s.field_k);
                                                      break L82;
                                                    } else {
                                                      break L82;
                                                    }
                                                  }
                                                }
                                                L86: {
                                                  if ((param8 ^ -1) > -1) {
                                                    break L86;
                                                  } else {
                                                    if (var22 > 25) {
                                                      var33[param8].a(param4.field_w, 3, param5, 0, this.field_s.field_o, param6);
                                                      break L86;
                                                    } else {
                                                      break L86;
                                                    }
                                                  }
                                                }
                                                L87: {
                                                  if (param4.field_w != 0) {
                                                    break L87;
                                                  } else {
                                                    if (param7 == 0) {
                                                      rq.a(190, 210, 282, 20, 64, 150);
                                                      discarded$9 = tk.field_c.a(tq.field_c, 40, 292, 200, 160, 16777215, -1, 0, 0, va.field_s.field_c + va.field_s.field_j);
                                                      discarded$10 = tk.field_c.a(vl.field_g, 50, 294, 160, 160, 16777215, -1, 2, 0, va.field_s.field_c + va.field_s.field_j);
                                                      break L87;
                                                    } else {
                                                      break L87;
                                                    }
                                                  }
                                                }
                                                L88: {
                                                  if (-3 == (param4.field_w ^ -1)) {
                                                    break L88;
                                                  } else {
                                                    if (1 == param4.field_w) {
                                                      break L88;
                                                    } else {
                                                      break L68;
                                                    }
                                                  }
                                                }
                                                var41 = new String[2];
                                                var27 = var41;
                                                var27[0] = Vertigo2.a(new String[]{this.field_h[0]}, dk.field_m, -125);
                                                var27[1] = Vertigo2.a(new String[]{this.field_h[1]}, lk.field_h, -125);
                                                var28 = 1;
                                                var29 = 0;
                                                L89: while (true) {
                                                  if (var29 >= var41.length) {
                                                    L90: {
                                                      var29 = 20;
                                                      var30 = 85;
                                                      if (param4.field_w == 1) {
                                                        var30 += 45;
                                                        break L90;
                                                      } else {
                                                        break L90;
                                                      }
                                                    }
                                                    L91: {
                                                      if (param0 == 0) {
                                                        break L91;
                                                      } else {
                                                        qi.a(false, var29, var28, 5 + (-30 + var30));
                                                        va.field_s.a(16131600, (byte) 89, -1, var29, var41[0], var30);
                                                        var30 += 50;
                                                        break L91;
                                                      }
                                                    }
                                                    if (-2 == (param0 ^ -1)) {
                                                      break L68;
                                                    } else {
                                                      qi.a(false, var29, var28, -30 + var30 - -5);
                                                      va.field_s.a(2479095, (byte) 98, -1, var29, var41[1], var30);
                                                      break L68;
                                                    }
                                                  } else {
                                                    L92: {
                                                      if (param0 != var29) {
                                                        var28 = Math.max(var28, va.field_s.a(1, var41[var29]));
                                                        break L92;
                                                      } else {
                                                        break L92;
                                                      }
                                                    }
                                                    var29++;
                                                    continue L89;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          ea.field_d[0].e(320 + -(ea.field_d[0].field_x / 2), 70);
                                          va.field_s.a(md.field_y, 16777215, -1, 320, 420, 2);
                                          break L68;
                                        }
                                      }
                                    } else {
                                      break L68;
                                    }
                                  }
                                }
                                break L0;
                              } else {
                                this.field_g[var24].a(this.field_s.field_e, -926966430);
                                var24++;
                                continue L67;
                              }
                            }
                          } else {
                            L93: {
                              var23_ref_hi__ = this.field_g[var22].b(-34);
                              if (var23_ref_hi__ == null) {
                                break L93;
                              } else {
                                var24 = 0;
                                L94: while (true) {
                                  if (this.field_g[var22].field_k <= var24) {
                                    break L93;
                                  } else {
                                    this.field_j[var19] = var23_ref_hi__[var24].a((byte) -127, var15, var14, var16);
                                    incrementValue$11 = var19;
                                    var19++;
                                    this.field_a[incrementValue$11] = (bg) ((Object) var23_ref_hi__[var24]);
                                    var24++;
                                    continue L94;
                                  }
                                }
                              }
                            }
                            var22++;
                            continue L23;
                          }
                        }
                      } else {
                        L95: {
                          if (var18 < var21[var22].field_s) {
                            this.field_j[var19] = var21[var22].a(var15, -104, var14, var16);
                            incrementValue$12 = var19;
                            var19++;
                            this.field_a[incrementValue$12] = (bg) ((Object) var21[var22]);
                            break L95;
                          } else {
                            break L95;
                          }
                        }
                        var22--;
                        continue L22;
                      }
                    }
                  } else {
                    L96: {
                      if (var20[var21_int] == null) {
                        break L96;
                      } else {
                        if (var18 >= var20[var21_int].field_s) {
                          break L96;
                        } else {
                          this.field_j[var19] = var20[var21_int].a(var15, -112, var14, var16);
                          incrementValue$13 = var19;
                          var19++;
                          this.field_a[incrementValue$13] = (bg) ((Object) var20[var21_int]);
                          break L96;
                        }
                      }
                    }
                    var21_int--;
                    continue L21;
                  }
                }
              } else {
                L97: {
                  stackOut_32_0 = this.field_c[var13];
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_33_0 = stackOut_32_0;
                  if (param3) {
                    stackOut_34_0 = (hb) ((Object) stackIn_34_0);
                    stackOut_34_1 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L97;
                  } else {
                    stackOut_33_0 = (hb) ((Object) stackIn_33_0);
                    stackOut_33_1 = 1;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    break L97;
                  }
                }
                ((hb) (Object) stackIn_35_0).a(stackIn_35_1 != 0, var33[var13]);
                var13++;
                continue L9;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L98: {
            var10 = decompiledCaughtException;
            stackOut_356_0 = (RuntimeException) (var10);
            stackOut_356_1 = new StringBuilder().append("am.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_358_0 = stackOut_356_0;
            stackIn_358_1 = stackOut_356_1;
            stackIn_357_0 = stackOut_356_0;
            stackIn_357_1 = stackOut_356_1;
            if (param4 == null) {
              stackOut_358_0 = (RuntimeException) ((Object) stackIn_358_0);
              stackOut_358_1 = (StringBuilder) ((Object) stackIn_358_1);
              stackOut_358_2 = "null";
              stackIn_359_0 = stackOut_358_0;
              stackIn_359_1 = stackOut_358_1;
              stackIn_359_2 = stackOut_358_2;
              break L98;
            } else {
              stackOut_357_0 = (RuntimeException) ((Object) stackIn_357_0);
              stackOut_357_1 = (StringBuilder) ((Object) stackIn_357_1);
              stackOut_357_2 = "{...}";
              stackIn_359_0 = stackOut_357_0;
              stackIn_359_1 = stackOut_357_1;
              stackIn_359_2 = stackOut_357_2;
              break L98;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_359_0), stackIn_359_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 >= -105) {
            return 101;
        }
        return this.field_s.field_q;
    }

    private final void a(int param0, int param1, int param2) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
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
            this.field_v = (int[][]) null;
            break L0;
          }
        }
        L1: {
          if (param0 <= param2) {
            break L1;
          } else {
            var4 = (param0 + param2) / 2;
            L2: while (true) {
              if (null != this.field_a[var4]) {
                var5 = param2;
                var6 = this.field_a[var4];
                var7 = this.field_j[var4];
                this.field_a[var4] = this.field_a[param0];
                this.field_a[param0] = var6;
                this.field_j[var4] = this.field_j[param0];
                this.field_j[param0] = var7;
                var8 = param2;
                L3: while (true) {
                  if (param0 <= var8) {
                    this.field_a[param0] = this.field_a[var5];
                    this.field_j[param0] = this.field_j[var5];
                    this.field_a[var5] = var6;
                    this.field_j[var5] = var7;
                    this.a(var5 + -1, param1 ^ 0, param2);
                    this.a(param0, 3, 1 + var5);
                    break L1;
                  } else {
                    if (null == this.field_a[var8]) {
                      this.field_a[var8] = this.field_a[var5];
                      this.field_j[var8] = this.field_j[var5];
                      incrementValue$2 = var5;
                      var5++;
                      this.field_a[incrementValue$2] = null;
                      var8++;
                      continue L3;
                    } else {
                      if (var7 > this.field_j[var8]) {
                        var9 = this.field_a[var8];
                        var10 = this.field_j[var8];
                        this.field_a[var8] = this.field_a[var5];
                        this.field_j[var8] = this.field_j[var5];
                        this.field_a[var5] = var9;
                        this.field_j[var5] = var10;
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
                  this.field_a[var4] = this.field_a[param2];
                  incrementValue$3 = param2;
                  param2++;
                  this.field_a[incrementValue$3] = null;
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
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
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
        int stackIn_7_0 = 0;
        int stackIn_38_0 = 0;
        bg stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int[] stackIn_71_2 = null;
        bg stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int[] stackIn_72_2 = null;
        bg stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int[] stackIn_73_2 = null;
        int stackIn_73_3 = 0;
        int stackIn_77_0 = 0;
        bg stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int[] stackIn_90_2 = null;
        bg stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int[] stackIn_91_2 = null;
        bg stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int[] stackIn_92_2 = null;
        int stackIn_92_3 = 0;
        bg stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int[] stackIn_94_2 = null;
        bg stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int[] stackIn_95_2 = null;
        bg stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int[] stackIn_96_2 = null;
        int stackIn_96_3 = 0;
        bg stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int[] stackIn_107_2 = null;
        bg stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int[] stackIn_108_2 = null;
        bg stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int[] stackIn_109_2 = null;
        int stackIn_109_3 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        bg stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int[] stackOut_70_2 = null;
        bg stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int[] stackOut_72_2 = null;
        int stackOut_72_3 = 0;
        bg stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int[] stackOut_71_2 = null;
        int stackOut_71_3 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        bg stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int[] stackOut_106_2 = null;
        bg stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        int[] stackOut_108_2 = null;
        int stackOut_108_3 = 0;
        bg stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        int[] stackOut_107_2 = null;
        int stackOut_107_3 = 0;
        bg stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int[] stackOut_93_2 = null;
        bg stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int[] stackOut_95_2 = null;
        int stackOut_95_3 = 0;
        bg stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int[] stackOut_94_2 = null;
        int stackOut_94_3 = 0;
        bg stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int[] stackOut_89_2 = null;
        bg stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int[] stackOut_91_2 = null;
        int stackOut_91_3 = 0;
        bg stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int[] stackOut_90_2 = null;
        int stackOut_90_3 = 0;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        var23 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var24 = param2.field_f;
              var5_array = var24;
              if (0 <= param1) {
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
              var6 = stackIn_7_0;
              if (var6 == 0) {
                hn.a(false, 380, -420, this.field_s.field_e, -390, 0, -140, 180, 0, 0, -1);
                break L2;
              } else {
                if (!param2.d(-2)) {
                  L3: {
                    if (!this.field_s.field_o) {
                      break L3;
                    } else {
                      this.field_s.field_o = false;
                      this.field_s.d(550);
                      break L3;
                    }
                  }
                  var8_ref_wo = var24[param1];
                  if (this.field_l == this.field_d) {
                    this.field_s.a(var8_ref_wo.field_k, var8_ref_wo.field_E, 12257, var8_ref_wo.field_y);
                    break L2;
                  } else {
                    var9 = var8_ref_wo.field_E + -var24[this.field_d].field_E;
                    var10 = var8_ref_wo.field_y - var24[this.field_d].field_y;
                    var11 = -var24[this.field_d].field_k + var8_ref_wo.field_k;
                    this.field_s.a((int)((float)var11 * this.field_p) + var24[this.field_d].field_k, (int)(this.field_p * (float)var9) + var24[this.field_d].field_E, 12257, var24[this.field_d].field_y + (int)(this.field_p * (float)var10));
                    break L2;
                  }
                } else {
                  L4: {
                    this.field_s.a(param2.field_D, 2000 + param2.field_A, param2.field_v, false, param2.field_h, param2.field_K, param2.field_z - 2000);
                    if (!this.field_s.field_o) {
                      this.field_s.d(550);
                      this.field_s.a(param2.field_D, param2.field_A, param2.field_v, false, param2.field_h, param2.field_K, param2.field_z);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.field_s.a(0, 0, 12257, 0);
                  break L2;
                }
              }
            }
            var7 = 0;
            L5: while (true) {
              if (var7 >= this.field_c.length) {
                L6: {
                  if (param0) {
                    L7: {
                      if (!hn.field_t) {
                        ue.field_N.c(0, 0);
                        break L7;
                      } else {
                        qr.field_l.a(this.field_s.field_e, 28580);
                        break L7;
                      }
                    }
                    sc.a(true, rg.field_f);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L8: {
                  var7 = this.field_s.field_e[0];
                  var8 = this.field_s.field_e[2];
                  var9 = this.field_s.field_e[1];
                  var11 = 31 % ((82 - param3) / 37);
                  var10 = param2.h(9979);
                  if (var10 != 7) {
                    if (var10 != 6) {
                      if (-4 != (var10 ^ -1)) {
                        if (4 == var10) {
                          stackOut_36_0 = 1;
                          stackIn_38_0 = stackOut_36_0;
                          break L8;
                        } else {
                          stackOut_35_0 = 0;
                          stackIn_38_0 = stackOut_35_0;
                          break L8;
                        }
                      } else {
                        stackOut_33_0 = 1;
                        stackIn_38_0 = stackOut_33_0;
                        break L8;
                      }
                    } else {
                      stackOut_31_0 = 1;
                      stackIn_38_0 = stackOut_31_0;
                      break L8;
                    }
                  } else {
                    stackOut_29_0 = 1;
                    stackIn_38_0 = stackOut_29_0;
                    break L8;
                  }
                }
                L9: {
                  var12 = stackIn_38_0;
                  if (!cn.field_r) {
                    break L9;
                  } else {
                    if (param0) {
                      L10: {
                        L11: {
                          var13_ref_fe = sf.field_b;
                          var14_int = sf.field_b.field_y << -592508443;
                          var15_int = sf.field_b.field_t << -990751611;
                          var16 = Vertigo2.field_C.field_y << -1276811772;
                          var17 = Vertigo2.field_C.field_t << 475085124;
                          var18 = ji.field_p.field_y << 138057220;
                          var19_int = ji.field_p.field_t << 1431992932;
                          var20 = jf.field_M.field_y << -1768262300;
                          var21_int = jf.field_M.field_t << -1183914364;
                          if (this.field_s.field_o) {
                            break L11;
                          } else {
                            if (var12 == 0) {
                              break L10;
                            } else {
                              break L11;
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
                        break L10;
                      }
                      gb.a(this.field_r[0][1], jf.field_M, var21_int, this.field_r[0][0], this.field_s.field_e, this.field_r[0][2], var20, -123);
                      var22 = 0;
                      L12: while (true) {
                        if ((var22 ^ -1) <= -1001) {
                          gb.a(this.field_v[0][1], Vertigo2.field_C, var17, this.field_v[0][0], this.field_s.field_e, this.field_v[0][2], var16, -96);
                          gb.a(this.field_v[1][1], ji.field_p, var19_int, this.field_v[1][0], this.field_s.field_e, this.field_v[1][2], var18, -89);
                          break L9;
                        } else {
                          gb.a(this.field_u[var22][1], var13_ref_fe, var15_int, this.field_u[var22][0], this.field_s.field_e, this.field_u[var22][2], var14_int, -105);
                          var22++;
                          continue L12;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                var13 = 0;
                var14 = param2.c(121);
                var15_int = -1 + param2.l(102);
                L13: while (true) {
                  if ((var15_int ^ -1) > -1) {
                    var15 = param2.m(9384);
                    var16 = -1 + param2.e((byte) 82);
                    L14: while (true) {
                      if (0 > var16) {
                        L15: {
                          if (var12 == 0) {
                            break L15;
                          } else {
                            this.field_c[0].a(param1, -25196);
                            break L15;
                          }
                        }
                        L16: {
                          if (var10 == 0) {
                            break L16;
                          } else {
                            var16 = 0;
                            L17: while (true) {
                              if (this.field_c.length <= var16) {
                                break L16;
                              } else {
                                this.field_j[var13] = this.field_c[var16].a(var7, var8, 0, var9);
                                incrementValue$3 = var13;
                                var13++;
                                this.field_a[incrementValue$3] = (bg) ((Object) this.field_c[var16]);
                                if (var12 == 0) {
                                  var16++;
                                  continue L17;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                        }
                        L18: {
                          L19: {
                            this.a(var13 + -1, 3, 0);
                            var16 = param2.field_n;
                            if (2 == var10) {
                              break L19;
                            } else {
                              if (7 == var10) {
                                break L19;
                              } else {
                                var17 = -1 + var13;
                                L20: while (true) {
                                  if ((var17 ^ -1) > -1) {
                                    break L18;
                                  } else {
                                    L21: {
                                      stackOut_70_0 = this.field_a[var17];
                                      stackOut_70_1 = 0;
                                      stackOut_70_2 = this.field_s.field_e;
                                      stackIn_72_0 = stackOut_70_0;
                                      stackIn_72_1 = stackOut_70_1;
                                      stackIn_72_2 = stackOut_70_2;
                                      stackIn_71_0 = stackOut_70_0;
                                      stackIn_71_1 = stackOut_70_1;
                                      stackIn_71_2 = stackOut_70_2;
                                      if (2 != param2.field_w) {
                                        stackOut_72_0 = (bg) ((Object) stackIn_72_0);
                                        stackOut_72_1 = stackIn_72_1;
                                        stackOut_72_2 = (int[]) ((Object) stackIn_72_2);
                                        stackOut_72_3 = 0;
                                        stackIn_73_0 = stackOut_72_0;
                                        stackIn_73_1 = stackOut_72_1;
                                        stackIn_73_2 = stackOut_72_2;
                                        stackIn_73_3 = stackOut_72_3;
                                        break L21;
                                      } else {
                                        stackOut_71_0 = (bg) ((Object) stackIn_71_0);
                                        stackOut_71_1 = stackIn_71_1;
                                        stackOut_71_2 = (int[]) ((Object) stackIn_71_2);
                                        stackOut_71_3 = 1;
                                        stackIn_73_0 = stackOut_71_0;
                                        stackIn_73_1 = stackOut_71_1;
                                        stackIn_73_2 = stackOut_71_2;
                                        stackIn_73_3 = stackOut_71_3;
                                        break L21;
                                      }
                                    }
                                    ((bg) (Object) stackIn_73_0).a(stackIn_73_1 != 0, stackIn_73_2, stackIn_73_3 != 0, this.field_s.field_o);
                                    var17--;
                                    continue L20;
                                  }
                                }
                              }
                            }
                          }
                          L22: {
                            if (50 > var16) {
                              stackOut_76_0 = 0;
                              stackIn_77_0 = stackOut_76_0;
                              break L22;
                            } else {
                              stackOut_75_0 = 1;
                              stackIn_77_0 = stackOut_75_0;
                              break L22;
                            }
                          }
                          var17 = stackIn_77_0;
                          if (var17 != 0) {
                            var18 = 0;
                            L23: while (true) {
                              if (var18 >= this.field_c.length) {
                                this.field_s.field_e[1] = this.field_s.field_e[1] - (-50 + var16) * 20;
                                var18 = var13 - 1;
                                L24: while (true) {
                                  if ((var18 ^ -1) > -1) {
                                    break L18;
                                  } else {
                                    L25: {
                                      if (this.field_a[var18] instanceof hb) {
                                        L26: {
                                          stackOut_106_0 = this.field_a[var18];
                                          stackOut_106_1 = -30;
                                          stackOut_106_2 = this.field_s.field_e;
                                          stackIn_108_0 = stackOut_106_0;
                                          stackIn_108_1 = stackOut_106_1;
                                          stackIn_108_2 = stackOut_106_2;
                                          stackIn_107_0 = stackOut_106_0;
                                          stackIn_107_1 = stackOut_106_1;
                                          stackIn_107_2 = stackOut_106_2;
                                          if (param2.field_w != 2) {
                                            stackOut_108_0 = (bg) ((Object) stackIn_108_0);
                                            stackOut_108_1 = stackIn_108_1;
                                            stackOut_108_2 = (int[]) ((Object) stackIn_108_2);
                                            stackOut_108_3 = 0;
                                            stackIn_109_0 = stackOut_108_0;
                                            stackIn_109_1 = stackOut_108_1;
                                            stackIn_109_2 = stackOut_108_2;
                                            stackIn_109_3 = stackOut_108_3;
                                            break L26;
                                          } else {
                                            stackOut_107_0 = (bg) ((Object) stackIn_107_0);
                                            stackOut_107_1 = stackIn_107_1;
                                            stackOut_107_2 = (int[]) ((Object) stackIn_107_2);
                                            stackOut_107_3 = 1;
                                            stackIn_109_0 = stackOut_107_0;
                                            stackIn_109_1 = stackOut_107_1;
                                            stackIn_109_2 = stackOut_107_2;
                                            stackIn_109_3 = stackOut_107_3;
                                            break L26;
                                          }
                                        }
                                        ((bg) (Object) stackIn_109_0).a(stackIn_109_1, stackIn_109_2, stackIn_109_3 != 0, (byte[]) null, this.field_s.field_o);
                                        break L25;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    var18--;
                                    continue L24;
                                  }
                                }
                              } else {
                                this.field_c[var18].a(6, (byte) -36);
                                var18++;
                                continue L23;
                              }
                            }
                          } else {
                            L27: {
                              var18 = var16 * 24 / 50;
                              var19 = oo.field_c;
                              var20 = var18;
                              if ((var20 ^ -1) > -13) {
                                break L27;
                              } else {
                                var20 = 11;
                                break L27;
                              }
                            }
                            L28: {
                              oo.field_c = bm.field_G[var20];
                              var21 = null;
                              var18 -= 12;
                              if (0 <= var18) {
                                L29: {
                                  if (-13 >= (var18 ^ -1)) {
                                    var18 = 11;
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                }
                                var21 = lf.field_A[var18];
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            var22 = -1 + var13;
                            L30: while (true) {
                              if (var22 < 0) {
                                oo.field_c = var19;
                                break L18;
                              } else {
                                L31: {
                                  if (!(this.field_a[var22] instanceof hb)) {
                                    L32: {
                                      stackOut_93_0 = this.field_a[var22];
                                      stackOut_93_1 = -30;
                                      stackOut_93_2 = this.field_s.field_e;
                                      stackIn_95_0 = stackOut_93_0;
                                      stackIn_95_1 = stackOut_93_1;
                                      stackIn_95_2 = stackOut_93_2;
                                      stackIn_94_0 = stackOut_93_0;
                                      stackIn_94_1 = stackOut_93_1;
                                      stackIn_94_2 = stackOut_93_2;
                                      if (param2.field_w != 2) {
                                        stackOut_95_0 = (bg) ((Object) stackIn_95_0);
                                        stackOut_95_1 = stackIn_95_1;
                                        stackOut_95_2 = (int[]) ((Object) stackIn_95_2);
                                        stackOut_95_3 = 0;
                                        stackIn_96_0 = stackOut_95_0;
                                        stackIn_96_1 = stackOut_95_1;
                                        stackIn_96_2 = stackOut_95_2;
                                        stackIn_96_3 = stackOut_95_3;
                                        break L32;
                                      } else {
                                        stackOut_94_0 = (bg) ((Object) stackIn_94_0);
                                        stackOut_94_1 = stackIn_94_1;
                                        stackOut_94_2 = (int[]) ((Object) stackIn_94_2);
                                        stackOut_94_3 = 1;
                                        stackIn_96_0 = stackOut_94_0;
                                        stackIn_96_1 = stackOut_94_1;
                                        stackIn_96_2 = stackOut_94_2;
                                        stackIn_96_3 = stackOut_94_3;
                                        break L32;
                                      }
                                    }
                                    ((bg) (Object) stackIn_96_0).a(stackIn_96_1, stackIn_96_2, stackIn_96_3 != 0, (byte[]) (var21), this.field_s.field_o);
                                    break L31;
                                  } else {
                                    L33: {
                                      oo.field_c = var19;
                                      stackOut_89_0 = this.field_a[var22];
                                      stackOut_89_1 = -30;
                                      stackOut_89_2 = this.field_s.field_e;
                                      stackIn_91_0 = stackOut_89_0;
                                      stackIn_91_1 = stackOut_89_1;
                                      stackIn_91_2 = stackOut_89_2;
                                      stackIn_90_0 = stackOut_89_0;
                                      stackIn_90_1 = stackOut_89_1;
                                      stackIn_90_2 = stackOut_89_2;
                                      if ((param2.field_w ^ -1) != -3) {
                                        stackOut_91_0 = (bg) ((Object) stackIn_91_0);
                                        stackOut_91_1 = stackIn_91_1;
                                        stackOut_91_2 = (int[]) ((Object) stackIn_91_2);
                                        stackOut_91_3 = 0;
                                        stackIn_92_0 = stackOut_91_0;
                                        stackIn_92_1 = stackOut_91_1;
                                        stackIn_92_2 = stackOut_91_2;
                                        stackIn_92_3 = stackOut_91_3;
                                        break L33;
                                      } else {
                                        stackOut_90_0 = (bg) ((Object) stackIn_90_0);
                                        stackOut_90_1 = stackIn_90_1;
                                        stackOut_90_2 = (int[]) ((Object) stackIn_90_2);
                                        stackOut_90_3 = 1;
                                        stackIn_92_0 = stackOut_90_0;
                                        stackIn_92_1 = stackOut_90_1;
                                        stackIn_92_2 = stackOut_90_2;
                                        stackIn_92_3 = stackOut_90_3;
                                        break L33;
                                      }
                                    }
                                    ((bg) (Object) stackIn_92_0).a(stackIn_92_1, stackIn_92_2, stackIn_92_3 != 0, (byte[]) null, this.field_s.field_o);
                                    oo.field_c = bm.field_G[var20];
                                    break L31;
                                  }
                                }
                                var22--;
                                continue L30;
                              }
                            }
                          }
                        }
                        break L0;
                      } else {
                        this.field_j[var13] = var15[var16].a(var8, -128, var7, var9);
                        incrementValue$4 = var13;
                        var13++;
                        this.field_a[incrementValue$4] = (bg) ((Object) var15[var16]);
                        var16--;
                        continue L14;
                      }
                    }
                  } else {
                    L34: {
                      if (var14[var15_int] != null) {
                        this.field_j[var13] = var14[var15_int].a(var8, -116, var7, var9);
                        incrementValue$5 = var13;
                        var13++;
                        this.field_a[incrementValue$5] = (bg) ((Object) var14[var15_int]);
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    var15_int--;
                    continue L13;
                  }
                }
              } else {
                this.field_c[var7].a(false, var24[var7]);
                var7++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var5 = decompiledCaughtException;
            stackOut_112_0 = (RuntimeException) (var5);
            stackOut_112_1 = new StringBuilder().append("am.M(").append(param0).append(',').append(param1).append(',');
            stackIn_114_0 = stackOut_112_0;
            stackIn_114_1 = stackOut_112_1;
            stackIn_113_0 = stackOut_112_0;
            stackIn_113_1 = stackOut_112_1;
            if (param2 == null) {
              stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
              stackOut_114_1 = (StringBuilder) ((Object) stackIn_114_1);
              stackOut_114_2 = "null";
              stackIn_115_0 = stackOut_114_0;
              stackIn_115_1 = stackOut_114_1;
              stackIn_115_2 = stackOut_114_2;
              break L35;
            } else {
              stackOut_113_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackOut_113_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackOut_113_2 = "{...}";
              stackIn_115_0 = stackOut_113_0;
              stackIn_115_1 = stackOut_113_1;
              stackIn_115_2 = stackOut_113_2;
              break L35;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_115_0), stackIn_115_2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        if (param0 != 1) {
            return;
        }
        field_e = null;
        field_o = null;
    }

    final void a(byte param0, int param1, int param2) {
        this.field_p = 0.0f;
        if (param0 != -17) {
            this.field_v = (int[][]) null;
        }
        this.field_d = param1;
        this.field_l = param2;
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
            this.field_s = new cn();
            this.field_c = new hb[param1];
            this.field_h = new String[param1];
            this.field_a = new bg[500];
            this.field_j = new int[500];
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= param1) {
                this.field_u = new int[1000][3];
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 900) {
                    var4_int = 900;
                    L3: while (true) {
                      if (1000 <= var4_int) {
                        this.field_v = new int[2][3];
                        var4_int = 0;
                        L4: while (true) {
                          if (-3 >= (var4_int ^ -1)) {
                            this.field_r = new int[1][3];
                            var4_int = 0;
                            L5: while (true) {
                              if (-2 >= (var4_int ^ -1)) {
                                this.field_g = new cq[param1 + 1];
                                var4_int = 0;
                                L6: while (true) {
                                  if (var4_int >= this.field_g.length) {
                                    this.field_p = 1.100000023841858f;
                                    this.field_f = new ha(0, 100, 0);
                                    break L0;
                                  } else {
                                    this.field_g[var4_int] = new cq();
                                    var4_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var5 = be.a(1920, (byte) 83) + 3920;
                                var6 = 3.141592653589793 * Math.random() * 2.0;
                                this.field_r[var4_int][0] = (int)(320.0 + Math.cos(var6) * (double)var5);
                                this.field_r[var4_int][2] = (int)(320.0 + (double)var5 * Math.sin(var6));
                                this.field_r[var4_int][1] = 1800 + be.a(7200, (byte) 83);
                                var4_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var5 = 2560 - -be.a(2000, (byte) 83);
                            var6 = Math.random() * 3.141592653589793 * 2.0;
                            this.field_v[var4_int][0] = (int)(Math.cos(var6) * (double)var5 + 320.0);
                            this.field_v[var4_int][2] = (int)(320.0 + Math.sin(var6) * (double)var5);
                            this.field_v[var4_int][1] = be.a(7200, (byte) 83) - -1800;
                            var4_int++;
                            continue L4;
                          }
                        }
                      } else {
                        var5 = be.a(5840, (byte) 83);
                        var6 = Math.random() * 3.141592653589793 * 2.0;
                        this.field_u[var4_int][0] = (int)(320.0 + Math.cos(var6) * (double)var5);
                        this.field_u[var4_int][2] = (int)(320.0 + (double)var5 * Math.sin(var6));
                        this.field_u[var4_int][1] = 12600;
                        var4_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var5 = 3920 - -be.a(1920, (byte) 83);
                    var6 = 2.0 * (Math.random() * 3.141592653589793);
                    this.field_u[var4_int][0] = (int)(320.0 + (double)var5 * Math.cos(var6));
                    this.field_u[var4_int][2] = (int)(Math.sin(var6) * (double)var5 + 320.0);
                    this.field_u[var4_int][1] = be.a(14400, (byte) 83) + -1800;
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                this.field_c[var4_int] = new hb();
                this.field_h[var4_int] = param2[var4_int];
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("am.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    static {
        field_t = 96;
        field_e = "Click";
        field_m = "Please try again in a few minutes.";
    }
}
