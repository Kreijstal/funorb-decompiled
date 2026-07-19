/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    int[] field_g;
    int[] field_G;
    int field_H;
    int field_d;
    int field_o;
    static String field_e;
    static int field_A;
    int field_n;
    boolean[] field_I;
    static boolean field_p;
    byte[][] field_z;
    static int[] field_J;
    static ao field_w;
    static String field_L;
    byte[] field_C;
    int field_x;
    int[][] field_O;
    byte[] field_t;
    int field_D;
    int field_q;
    int[][] field_c;
    byte[] field_l;
    int field_K;
    int[] field_a;
    byte[] field_v;
    int[][] field_h;
    int field_b;
    byte[] field_r;
    int field_N;
    int field_P;
    boolean[] field_E;
    int field_F;
    byte field_j;
    int field_u;
    int field_s;
    static cj field_B;
    byte[] field_k;
    int field_f;
    int[] field_m;
    static int field_M;
    static String field_i;
    static String field_y;

    final static boolean a(byte param0, char param1) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var2 = 24 / ((param0 - -12) / 58);
            if (160 == param1) {
              break L1;
            } else {
              if (param1 == 32) {
                break L1;
              } else {
                if (param1 == 95) {
                  break L1;
                } else {
                  if (param1 != 45) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static ja[] a(int param0) {
        ja[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        byte[] var10 = null;
        int[] var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var1 = new ja[qc.field_v];
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var2 ^ -1) <= (qc.field_v ^ -1)) {
                break L2;
              } else {
                var3 = vj.field_p[var2] * oq.field_w[var2];
                var10 = qp.field_t[var2];
                var11 = new int[var3];
                var9 = var11;
                var5 = var9;
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var7 != 0) {
                  break L1;
                } else {
                  var6 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var3 <= var6) {
                          break L5;
                        } else {
                          var5[var6] = tp.field_t[tq.b((int) var10[var6], 255)];
                          var6++;
                          if (var7 != 0) {
                            break L4;
                          } else {
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var1[var2] = new ja(ie.field_nb, hj.field_a, k.field_i[var2], qj.field_o[var2], oq.field_w[var2], vj.field_p[var2], var11);
                      var2++;
                      break L4;
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
            stackOut_10_0 = param0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          L6: {
            if (stackIn_11_0 > 2) {
              break L6;
            } else {
              eb.a(true, false, -9);
              break L6;
            }
          }
          fd.h((byte) 127);
          return var1;
        }
    }

    final static String a(int param0, boolean param1, boolean param2) {
        if (param2) {
          L0: {
            if (!param1) {
              break L0;
            } else {
              if (0 > param0) {
                break L0;
              } else {
                return gm.a(param0, param1, 10, -1);
              }
            }
          }
          return Integer.toString(param0);
        } else {
          return (String) null;
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        boolean stackIn_66_0 = false;
        int stackIn_71_0 = 0;
        boolean stackIn_77_0 = false;
        int stackIn_82_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_90_0 = 0;
        String[] stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        String[] stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        String[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        String[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        String stackIn_102_2 = null;
        String[] stackIn_106_0 = null;
        String[] stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        int stackIn_107_3 = 0;
        String[] stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        String[] stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        String[] stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        String stackIn_110_2 = null;
        String[] stackIn_127_0 = null;
        int stackIn_129_0 = 0;
        String[] stackIn_129_1 = null;
        int stackIn_130_0 = 0;
        String stackIn_130_1 = null;
        int stackIn_131_0 = 0;
        String stackIn_131_1 = null;
        int stackIn_132_0 = 0;
        String stackIn_132_1 = null;
        int stackIn_132_2 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        int stackIn_156_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        int stackIn_164_0 = 0;
        String[] stackIn_164_1 = null;
        int stackIn_166_0 = 0;
        int stackIn_166_1 = 0;
        int stackIn_171_0 = 0;
        int stackIn_171_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_65_0 = false;
        int stackOut_70_0 = 0;
        boolean stackOut_76_0 = false;
        int stackOut_81_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        String[] stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        String[] stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        String[] stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        String stackOut_109_2 = null;
        String[] stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        String stackOut_108_2 = null;
        String[] stackOut_105_0 = null;
        String[] stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_106_2 = 0;
        int stackOut_106_3 = 0;
        String[] stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        String[] stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        String stackOut_101_2 = null;
        String[] stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        String stackOut_100_2 = null;
        int stackOut_128_0 = 0;
        String[] stackOut_128_1 = null;
        int stackOut_129_0 = 0;
        String stackOut_129_1 = null;
        int stackOut_131_0 = 0;
        String stackOut_131_1 = null;
        int stackOut_131_2 = 0;
        int stackOut_130_0 = 0;
        String stackOut_130_1 = null;
        int stackOut_130_2 = 0;
        String[] stackOut_126_0 = null;
        int stackOut_165_0 = 0;
        int stackOut_165_1 = 0;
        int stackOut_163_0 = 0;
        String[] stackOut_163_1 = null;
        int stackOut_139_0 = 0;
        int stackOut_139_1 = 0;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        int stackOut_145_0 = 0;
        int stackOut_145_1 = 0;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        int stackOut_154_0 = 0;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
        int stackOut_155_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_156_0 = 0;
        int stackOut_156_1 = 0;
        int stackOut_159_0 = 0;
        int stackOut_159_1 = 0;
        int stackOut_159_2 = 0;
        int stackOut_170_0 = 0;
        int stackOut_170_1 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        ho.field_q = param2;
                        bq.field_c = true;
                        if ((ho.field_q ^ -1) == -1) {
                          break L6;
                        } else {
                          L7: {
                            if ((ho.field_q ^ -1) != -2) {
                              break L7;
                            } else {
                              var3_int = mb.a(uq.field_f, false, oi.field_e, cq.field_e, ib.field_b);
                              var4 = var3_int + 2;
                              wd.field_Q = new int[var4];
                              hq.field_m = new String[var4];
                              var5 = 0;
                              L8: while (true) {
                                L9: {
                                  L10: {
                                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                                      break L10;
                                    } else {
                                      wd.field_Q[var5] = -1;
                                      var5++;
                                      if (var9 != 0) {
                                        break L9;
                                      } else {
                                        if (var9 == 0) {
                                          continue L8;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  v.field_b = new int[1];
                                  break L9;
                                }
                                var5 = 0;
                                L11: while (true) {
                                  L12: {
                                    L13: {
                                      if ((var5 ^ -1) <= (var3_int ^ -1)) {
                                        break L13;
                                      } else {
                                        hq.field_m[var5] = cq.field_e[var5];
                                        var5++;
                                        if (var9 != 0) {
                                          break L12;
                                        } else {
                                          if (var9 == 0) {
                                            continue L11;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                    hq.field_m[var4 - 2] = "";
                                    hq.field_m[var4 - 1] = ic.field_f;
                                    wd.field_Q[var4 - 1] = 0;
                                    v.field_b[0] = 5;
                                    break L12;
                                  }
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          L14: {
                            if (ho.field_q == 2) {
                              break L14;
                            } else {
                              L15: {
                                if (ho.field_q != 3) {
                                  break L15;
                                } else {
                                  L16: {
                                    L17: {
                                      if (pl.field_J.field_d) {
                                        break L17;
                                      } else {
                                        var3_int = mb.a(uq.field_f, false, aa.field_j, cq.field_e, ib.field_b);
                                        if (var9 == 0) {
                                          break L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    var3_int = mb.a(uq.field_f, param0, hg.field_sb, cq.field_e, ib.field_b);
                                    break L16;
                                  }
                                  var4 = 2 - -var3_int;
                                  wd.field_Q = new int[var4];
                                  hq.field_m = new String[var4];
                                  var5 = 0;
                                  L18: while (true) {
                                    L19: {
                                      L20: {
                                        if ((var5 ^ -1) <= (var4 ^ -1)) {
                                          break L20;
                                        } else {
                                          wd.field_Q[var5] = -1;
                                          var5++;
                                          if (var9 != 0) {
                                            break L19;
                                          } else {
                                            if (var9 == 0) {
                                              continue L18;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      }
                                      v.field_b = new int[1];
                                      break L19;
                                    }
                                    var5 = 0;
                                    L21: while (true) {
                                      L22: {
                                        L23: {
                                          if ((var5 ^ -1) <= (var3_int ^ -1)) {
                                            break L23;
                                          } else {
                                            hq.field_m[var5] = cq.field_e[var5];
                                            var5++;
                                            if (var9 != 0) {
                                              break L22;
                                            } else {
                                              if (var9 == 0) {
                                                continue L21;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                        }
                                        hq.field_m[-2 + var4] = "";
                                        hq.field_m[-1 + var4] = ic.field_f;
                                        wd.field_Q[-1 + var4] = 0;
                                        v.field_b[0] = 5;
                                        break L22;
                                      }
                                      if (var9 == 0) {
                                        break L5;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                              }
                              L24: {
                                if (ho.field_q == 4) {
                                  break L24;
                                } else {
                                  if (ho.field_q == 5) {
                                    var3_int = mb.a(uq.field_f, false, ga.field_t, cq.field_e, ib.field_b);
                                    var4 = 3 + var3_int;
                                    wd.field_Q = new int[var4];
                                    hq.field_m = new String[var4];
                                    var5 = 0;
                                    L25: while (true) {
                                      L26: {
                                        L27: {
                                          if ((var4 ^ -1) >= (var5 ^ -1)) {
                                            break L27;
                                          } else {
                                            wd.field_Q[var5] = -1;
                                            var5++;
                                            if (var9 != 0) {
                                              break L26;
                                            } else {
                                              if (var9 == 0) {
                                                continue L25;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                        }
                                        v.field_b = new int[2];
                                        break L26;
                                      }
                                      var5 = 0;
                                      L28: while (true) {
                                        L29: {
                                          L30: {
                                            if (var5 >= var3_int) {
                                              break L30;
                                            } else {
                                              hq.field_m[var5] = cq.field_e[var5];
                                              var5++;
                                              if (var9 != 0) {
                                                break L29;
                                              } else {
                                                if (var9 == 0) {
                                                  continue L28;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                            }
                                          }
                                          hq.field_m[-3 + var4] = "";
                                          hq.field_m[-2 + var4] = ei.field_d;
                                          wd.field_Q[-2 + var4] = 0;
                                          v.field_b[0] = 3;
                                          hq.field_m[var4 - 1] = ic.field_f;
                                          wd.field_Q[-1 + var4] = 1;
                                          v.field_b[1] = 5;
                                          break L29;
                                        }
                                        if (var9 == 0) {
                                          break L5;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                  } else {
                                    throw new IllegalArgumentException();
                                  }
                                }
                              }
                              var3_int = mb.a(uq.field_f, false, on.field_cb, cq.field_e, ib.field_b);
                              var4 = 2 - -var3_int;
                              hq.field_m = new String[var4];
                              wd.field_Q = new int[var4];
                              var5 = 0;
                              L31: while (true) {
                                L32: {
                                  L33: {
                                    if (var5 >= var4) {
                                      break L33;
                                    } else {
                                      wd.field_Q[var5] = -1;
                                      var5++;
                                      if (var9 != 0) {
                                        break L32;
                                      } else {
                                        if (var9 == 0) {
                                          continue L31;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                  }
                                  v.field_b = new int[1];
                                  break L32;
                                }
                                var5 = 0;
                                L34: while (true) {
                                  L35: {
                                    L36: {
                                      if ((var5 ^ -1) <= (var3_int ^ -1)) {
                                        break L36;
                                      } else {
                                        hq.field_m[var5] = cq.field_e[var5];
                                        var5++;
                                        if (var9 != 0) {
                                          break L35;
                                        } else {
                                          if (var9 == 0) {
                                            continue L34;
                                          } else {
                                            break L36;
                                          }
                                        }
                                      }
                                    }
                                    hq.field_m[var4 - 2] = "";
                                    hq.field_m[var4 - 1] = ic.field_f;
                                    wd.field_Q[var4 - 1] = 0;
                                    v.field_b[0] = 5;
                                    break L35;
                                  }
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                          }
                          var3_int = mb.a(uq.field_f, param0, vl.a(ba.field_l, new String[]{"<br><%0><br>"}, 2), cq.field_e, ib.field_b);
                          var4 = -1;
                          var5 = 0;
                          L37: while (true) {
                            L38: {
                              L39: {
                                if (var3_int <= var5) {
                                  break L39;
                                } else {
                                  stackOut_65_0 = "<%0>".equals(cq.field_e[var5]);
                                  stackIn_71_0 = stackOut_65_0 ? 1 : 0;
                                  stackIn_66_0 = stackOut_65_0;
                                  if (var9 != 0) {
                                    break L38;
                                  } else {
                                    L40: {
                                      if (!stackIn_66_0) {
                                        break L40;
                                      } else {
                                        var4 = var5;
                                        if (var9 == 0) {
                                          break L39;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                    var5++;
                                    if (var9 == 0) {
                                      continue L37;
                                    } else {
                                      break L39;
                                    }
                                  }
                                }
                              }
                              stackOut_70_0 = var4 ^ -1;
                              stackIn_71_0 = stackOut_70_0;
                              break L38;
                            }
                            if (stackIn_71_0 == 0) {
                              throw new IllegalStateException();
                            } else {
                              aa.field_n = new String[var4];
                              d.a(cq.field_e, 0, aa.field_n, 0, var4);
                              ik.field_a = new String[var3_int - var4 - 1];
                              d.a(cq.field_e, var4 + 1, ik.field_a, 0, var3_int + -var4 + -1);
                              var4 = -1;
                              var3_int = mb.a(uq.field_f, false, vl.a(rn.field_g, new String[]{"<br><%0><br>"}, 2), cq.field_e, ib.field_b);
                              var5 = 0;
                              L41: while (true) {
                                L42: {
                                  L43: {
                                    if (var5 >= var3_int) {
                                      break L43;
                                    } else {
                                      stackOut_76_0 = "<%0>".equals(cq.field_e[var5]);
                                      stackIn_82_0 = stackOut_76_0 ? 1 : 0;
                                      stackIn_77_0 = stackOut_76_0;
                                      if (var9 != 0) {
                                        break L42;
                                      } else {
                                        L44: {
                                          if (!stackIn_77_0) {
                                            break L44;
                                          } else {
                                            var4 = var5;
                                            if (var9 == 0) {
                                              break L43;
                                            } else {
                                              break L44;
                                            }
                                          }
                                        }
                                        var5++;
                                        if (var9 == 0) {
                                          continue L41;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_81_0 = var4 ^ -1;
                                  stackIn_82_0 = stackOut_81_0;
                                  break L42;
                                }
                                if (stackIn_82_0 != 0) {
                                  L45: {
                                    q.field_a = new String[var4];
                                    d.a(cq.field_e, 0, q.field_a, 0, var4);
                                    ud.field_N = new String[var3_int + -var4 + -1];
                                    d.a(cq.field_e, var4 + 1, ud.field_N, 0, var3_int + (-var4 + -1));
                                    if (aa.field_n.length >= q.field_a.length) {
                                      stackOut_86_0 = aa.field_n.length;
                                      stackIn_87_0 = stackOut_86_0;
                                      break L45;
                                    } else {
                                      stackOut_85_0 = q.field_a.length;
                                      stackIn_87_0 = stackOut_85_0;
                                      break L45;
                                    }
                                  }
                                  L46: {
                                    var5 = stackIn_87_0;
                                    if ((ud.field_N.length ^ -1) >= (ik.field_a.length ^ -1)) {
                                      stackOut_89_0 = ik.field_a.length;
                                      stackIn_90_0 = stackOut_89_0;
                                      break L46;
                                    } else {
                                      stackOut_88_0 = ud.field_N.length;
                                      stackIn_90_0 = stackOut_88_0;
                                      break L46;
                                    }
                                  }
                                  var6 = stackIn_90_0;
                                  var7 = var6 + var5 + 7;
                                  hq.field_m = new String[var7];
                                  wd.field_Q = new int[var7];
                                  var8 = 0;
                                  L47: while (true) {
                                    L48: {
                                      L49: {
                                        if (var7 <= var8) {
                                          break L49;
                                        } else {
                                          wd.field_Q[var8] = -1;
                                          var8++;
                                          if (var9 != 0) {
                                            break L48;
                                          } else {
                                            if (var9 == 0) {
                                              continue L47;
                                            } else {
                                              break L49;
                                            }
                                          }
                                        }
                                      }
                                      v.field_b = new int[2];
                                      wd.field_Q[1] = 0;
                                      hq.field_m[1] = rb.field_b;
                                      hq.field_m[0] = mq.field_q;
                                      hq.field_m[3] = dd.field_e;
                                      v.field_b[1] = 2;
                                      v.field_b[0] = 5;
                                      hq.field_m[2] = cq.field_a;
                                      hq.field_m[4] = wj.field_h;
                                      hq.field_m[5] = "";
                                      wd.field_Q[3] = 1;
                                      break L48;
                                    }
                                    var8 = 0;
                                    L50: while (true) {
                                      L51: {
                                        L52: {
                                          L53: {
                                            if ((var5 ^ -1) >= (var8 ^ -1)) {
                                              break L53;
                                            } else {
                                              stackOut_98_0 = hq.field_m;
                                              stackOut_98_1 = 6 + var8;
                                              stackOut_98_2 = 0;
                                              stackOut_98_3 = var8 + (q.field_a.length + -var5);
                                              stackIn_107_0 = stackOut_98_0;
                                              stackIn_107_1 = stackOut_98_1;
                                              stackIn_107_2 = stackOut_98_2;
                                              stackIn_107_3 = stackOut_98_3;
                                              stackIn_99_0 = stackOut_98_0;
                                              stackIn_99_1 = stackOut_98_1;
                                              stackIn_99_2 = stackOut_98_2;
                                              stackIn_99_3 = stackOut_98_3;
                                              if (var9 != 0) {
                                                L54: while (true) {
                                                  L55: {
                                                    stackOut_107_0 = (String[]) ((Object) stackIn_107_0);
                                                    stackOut_107_1 = stackIn_107_1;
                                                    stackIn_109_0 = stackOut_107_0;
                                                    stackIn_109_1 = stackOut_107_1;
                                                    stackIn_108_0 = stackOut_107_0;
                                                    stackIn_108_1 = stackOut_107_1;
                                                    if (stackIn_107_2 > stackIn_107_3) {
                                                      stackOut_109_0 = (String[]) ((Object) stackIn_109_0);
                                                      stackOut_109_1 = stackIn_109_1;
                                                      stackOut_109_2 = ud.field_N[var8];
                                                      stackIn_110_0 = stackOut_109_0;
                                                      stackIn_110_1 = stackOut_109_1;
                                                      stackIn_110_2 = stackOut_109_2;
                                                      break L55;
                                                    } else {
                                                      stackOut_108_0 = (String[]) ((Object) stackIn_108_0);
                                                      stackOut_108_1 = stackIn_108_1;
                                                      stackOut_108_2 = "";
                                                      stackIn_110_0 = stackOut_108_0;
                                                      stackIn_110_1 = stackOut_108_1;
                                                      stackIn_110_2 = stackOut_108_2;
                                                      break L55;
                                                    }
                                                  }
                                                  stackIn_110_0[stackIn_110_1] = stackIn_110_2;
                                                  var8++;
                                                  if (var9 == 0) {
                                                    if (var6 <= var8) {
                                                      break L51;
                                                    } else {
                                                      stackOut_105_0 = hq.field_m;
                                                      stackIn_127_0 = stackOut_105_0;
                                                      stackIn_106_0 = stackOut_105_0;
                                                      if (var9 != 0) {
                                                        break L52;
                                                      } else {
                                                        stackOut_106_0 = (String[]) ((Object) stackIn_106_0);
                                                        stackOut_106_1 = var5 + 7 + var8;
                                                        stackOut_106_2 = var8 ^ -1;
                                                        stackOut_106_3 = ud.field_N.length ^ -1;
                                                        stackIn_107_0 = stackOut_106_0;
                                                        stackIn_107_1 = stackOut_106_1;
                                                        stackIn_107_2 = stackOut_106_2;
                                                        stackIn_107_3 = stackOut_106_3;
                                                        continue L54;
                                                      }
                                                    }
                                                  } else {
                                                    break L51;
                                                  }
                                                }
                                              } else {
                                                L56: {
                                                  stackOut_99_0 = (String[]) ((Object) stackIn_99_0);
                                                  stackOut_99_1 = stackIn_99_1;
                                                  stackIn_101_0 = stackOut_99_0;
                                                  stackIn_101_1 = stackOut_99_1;
                                                  stackIn_100_0 = stackOut_99_0;
                                                  stackIn_100_1 = stackOut_99_1;
                                                  if (stackIn_99_2 > stackIn_99_3) {
                                                    stackOut_101_0 = (String[]) ((Object) stackIn_101_0);
                                                    stackOut_101_1 = stackIn_101_1;
                                                    stackOut_101_2 = "";
                                                    stackIn_102_0 = stackOut_101_0;
                                                    stackIn_102_1 = stackOut_101_1;
                                                    stackIn_102_2 = stackOut_101_2;
                                                    break L56;
                                                  } else {
                                                    stackOut_100_0 = (String[]) ((Object) stackIn_100_0);
                                                    stackOut_100_1 = stackIn_100_1;
                                                    stackOut_100_2 = q.field_a[var8 - -q.field_a.length + -var5];
                                                    stackIn_102_0 = stackOut_100_0;
                                                    stackIn_102_1 = stackOut_100_1;
                                                    stackIn_102_2 = stackOut_100_2;
                                                    break L56;
                                                  }
                                                }
                                                stackIn_102_0[stackIn_102_1] = stackIn_102_2;
                                                var8++;
                                                if (var9 == 0) {
                                                  continue L50;
                                                } else {
                                                  break L53;
                                                }
                                              }
                                            }
                                          }
                                          hq.field_m[6 + var5] = null;
                                          wd.field_Q[var5 + 6] = -2;
                                          var8 = 0;
                                          L57: while (true) {
                                            if (var6 <= var8) {
                                              break L51;
                                            } else {
                                              stackOut_105_0 = hq.field_m;
                                              stackIn_127_0 = stackOut_105_0;
                                              stackIn_106_0 = stackOut_105_0;
                                              if (var9 != 0) {
                                                break L52;
                                              } else {
                                                stackOut_106_0 = (String[]) ((Object) stackIn_106_0);
                                                stackOut_106_1 = var5 + 7 + var8;
                                                stackOut_106_2 = var8 ^ -1;
                                                stackOut_106_3 = ud.field_N.length ^ -1;
                                                stackIn_107_0 = stackOut_106_0;
                                                stackIn_107_1 = stackOut_106_1;
                                                stackIn_107_2 = stackOut_106_2;
                                                stackIn_107_3 = stackOut_106_3;
                                                L58: {
                                                  stackOut_107_0 = (String[]) ((Object) stackIn_107_0);
                                                  stackOut_107_1 = stackIn_107_1;
                                                  stackIn_109_0 = stackOut_107_0;
                                                  stackIn_109_1 = stackOut_107_1;
                                                  stackIn_108_0 = stackOut_107_0;
                                                  stackIn_108_1 = stackOut_107_1;
                                                  if (stackIn_107_2 > stackIn_107_3) {
                                                    stackOut_109_0 = (String[]) ((Object) stackIn_109_0);
                                                    stackOut_109_1 = stackIn_109_1;
                                                    stackOut_109_2 = ud.field_N[var8];
                                                    stackIn_110_0 = stackOut_109_0;
                                                    stackIn_110_1 = stackOut_109_1;
                                                    stackIn_110_2 = stackOut_109_2;
                                                    break L58;
                                                  } else {
                                                    stackOut_108_0 = (String[]) ((Object) stackIn_108_0);
                                                    stackOut_108_1 = stackIn_108_1;
                                                    stackOut_108_2 = "";
                                                    stackIn_110_0 = stackOut_108_0;
                                                    stackIn_110_1 = stackOut_108_1;
                                                    stackIn_110_2 = stackOut_108_2;
                                                    break L58;
                                                  }
                                                }
                                                stackIn_110_0[stackIn_110_1] = stackIn_110_2;
                                                var8++;
                                                if (var9 == 0) {
                                                  continue L57;
                                                } else {
                                                  break L51;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L59: while (true) {
                                          if (stackIn_127_0.length <= var4) {
                                            break L3;
                                          } else {
                                            stackOut_128_0 = 0;
                                            stackOut_128_1 = hq.field_m;
                                            stackIn_164_0 = stackOut_128_0;
                                            stackIn_164_1 = stackOut_128_1;
                                            stackIn_129_0 = stackOut_128_0;
                                            stackIn_129_1 = stackOut_128_1;
                                            if (var9 != 0) {
                                              break L4;
                                            } else {
                                              L60: {
                                                stackOut_129_0 = stackIn_129_0;
                                                stackOut_129_1 = stackIn_129_1[var4];
                                                stackIn_131_0 = stackOut_129_0;
                                                stackIn_131_1 = stackOut_129_1;
                                                stackIn_130_0 = stackOut_129_0;
                                                stackIn_130_1 = stackOut_129_1;
                                                if (0 > wd.field_Q[var4]) {
                                                  stackOut_131_0 = stackIn_131_0;
                                                  stackOut_131_1 = (String) ((Object) stackIn_131_1);
                                                  stackOut_131_2 = 0;
                                                  stackIn_132_0 = stackOut_131_0;
                                                  stackIn_132_1 = stackOut_131_1;
                                                  stackIn_132_2 = stackOut_131_2;
                                                  break L60;
                                                } else {
                                                  stackOut_130_0 = stackIn_130_0;
                                                  stackOut_130_1 = (String) ((Object) stackIn_130_1);
                                                  stackOut_130_2 = 1;
                                                  stackIn_132_0 = stackOut_130_0;
                                                  stackIn_132_1 = stackOut_130_1;
                                                  stackIn_132_2 = stackOut_130_2;
                                                  break L60;
                                                }
                                              }
                                              L61: {
                                                var5 = hn.a(stackIn_132_0, stackIn_132_1, stackIn_132_2 != 0);
                                                if (var3_int < var5) {
                                                  var3_int = var5;
                                                  break L61;
                                                } else {
                                                  break L61;
                                                }
                                              }
                                              var4++;
                                              if (var9 == 0) {
                                                stackOut_126_0 = hq.field_m;
                                                stackIn_127_0 = stackOut_126_0;
                                                continue L59;
                                              } else {
                                                break L3;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      so.field_s = bl.a((byte) 41);
                                      if (var9 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                } else {
                                  throw new IllegalStateException();
                                }
                              }
                            }
                          }
                        }
                      }
                      var3_int = mb.a(uq.field_f, false, oi.field_e, cq.field_e, ib.field_b);
                      var4 = 3 + var3_int;
                      hq.field_m = new String[var4];
                      wd.field_Q = new int[var4];
                      var5 = 0;
                      L62: while (true) {
                        L63: {
                          L64: {
                            if ((var4 ^ -1) >= (var5 ^ -1)) {
                              break L64;
                            } else {
                              wd.field_Q[var5] = -1;
                              var5++;
                              if (var9 != 0) {
                                break L63;
                              } else {
                                if (var9 == 0) {
                                  continue L62;
                                } else {
                                  break L64;
                                }
                              }
                            }
                          }
                          v.field_b = new int[2];
                          break L63;
                        }
                        var5 = 0;
                        L65: while (true) {
                          L66: {
                            L67: {
                              if (var3_int <= var5) {
                                break L67;
                              } else {
                                hq.field_m[var5] = cq.field_e[var5];
                                var5++;
                                if (var9 != 0) {
                                  break L66;
                                } else {
                                  if (var9 == 0) {
                                    continue L65;
                                  } else {
                                    break L67;
                                  }
                                }
                              }
                            }
                            hq.field_m[-3 + var4] = "";
                            hq.field_m[-2 + var4] = p.field_b;
                            wd.field_Q[var4 - 2] = 0;
                            v.field_b[0] = 4;
                            hq.field_m[var4 + -1] = ic.field_f;
                            wd.field_Q[var4 + -1] = 1;
                            break L66;
                          }
                          v.field_b[1] = 5;
                          break L5;
                        }
                      }
                    }
                    aq.field_B.field_c = v.field_b.length;
                    var3_int = 0;
                    var4 = 0;
                    L68: while (true) {
                      stackOut_126_0 = hq.field_m;
                      stackIn_127_0 = stackOut_126_0;
                      if (stackIn_127_0.length <= var4) {
                        break L3;
                      } else {
                        stackOut_128_0 = 0;
                        stackOut_128_1 = hq.field_m;
                        stackIn_164_0 = stackOut_128_0;
                        stackIn_164_1 = stackOut_128_1;
                        stackIn_129_0 = stackOut_128_0;
                        stackIn_129_1 = stackOut_128_1;
                        if (var9 != 0) {
                          break L4;
                        } else {
                          L69: {
                            stackOut_129_0 = stackIn_129_0;
                            stackOut_129_1 = stackIn_129_1[var4];
                            stackIn_131_0 = stackOut_129_0;
                            stackIn_131_1 = stackOut_129_1;
                            stackIn_130_0 = stackOut_129_0;
                            stackIn_130_1 = stackOut_129_1;
                            if (0 > wd.field_Q[var4]) {
                              stackOut_131_0 = stackIn_131_0;
                              stackOut_131_1 = (String) ((Object) stackIn_131_1);
                              stackOut_131_2 = 0;
                              stackIn_132_0 = stackOut_131_0;
                              stackIn_132_1 = stackOut_131_1;
                              stackIn_132_2 = stackOut_131_2;
                              break L69;
                            } else {
                              stackOut_130_0 = stackIn_130_0;
                              stackOut_130_1 = (String) ((Object) stackIn_130_1);
                              stackOut_130_2 = 1;
                              stackIn_132_0 = stackOut_130_0;
                              stackIn_132_1 = stackOut_130_1;
                              stackIn_132_2 = stackOut_130_2;
                              break L69;
                            }
                          }
                          L70: {
                            var5 = hn.a(stackIn_132_0, stackIn_132_1, stackIn_132_2 != 0);
                            if (var3_int < var5) {
                              var3_int = var5;
                              break L70;
                            } else {
                              break L70;
                            }
                          }
                          var4++;
                          if (var9 == 0) {
                            continue L68;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L71: while (true) {
                    if (stackIn_164_0 >= stackIn_164_1.length) {
                      break L2;
                    } else {
                      var6 = wd.field_Q[var4];
                      stackOut_165_0 = -1;
                      stackOut_165_1 = var6 ^ -1;
                      stackIn_171_0 = stackOut_165_0;
                      stackIn_171_1 = stackOut_165_1;
                      stackIn_166_0 = stackOut_165_0;
                      stackIn_166_1 = stackOut_165_1;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L72: {
                          L73: {
                            if (stackIn_166_0 < stackIn_166_1) {
                              break L73;
                            } else {
                              var7 = hn.a(0, hq.field_m[var4], true);
                              var8 = am.field_c + -(var7 >> -573694047);
                              var5 = var5 + al.field_bb;
                              uf.field_b[var4] = new int[4];
                              uf.field_b[var4][0] = var8 + -no.field_Gb;
                              uf.field_b[var4][1] = var5;
                              uf.field_b[var4][2] = var7 - -(no.field_Gb << 290203713);
                              uf.field_b[var4][3] = (wk.field_G << -1501645247) + me.field_h;
                              var5 = var5 + ((wk.field_G << 2035462817) - (-al.field_bb + -me.field_h));
                              if (var9 == 0) {
                                break L72;
                              } else {
                                break L73;
                              }
                            }
                          }
                          var5 = var5 + se.field_C;
                          break L72;
                        }
                        var4++;
                        if (var9 == 0) {
                          stackOut_163_0 = var4;
                          stackOut_163_1 = hq.field_m;
                          stackIn_164_0 = stackOut_163_0;
                          stackIn_164_1 = stackOut_163_1;
                          continue L71;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                L74: {
                  L75: {
                    if (-3 != (ho.field_q ^ -1)) {
                      break L75;
                    } else {
                      var10 = aa.field_n;
                      var4_ref_String__ = var10;
                      var5 = 0;
                      L76: while (true) {
                        L77: {
                          if ((var10.length ^ -1) >= (var5 ^ -1)) {
                            break L77;
                          } else {
                            var11 = var10[var5];
                            var7 = hn.a(0, var11, false);
                            stackOut_139_0 = var3_int;
                            stackOut_139_1 = var7;
                            stackIn_146_0 = stackOut_139_0;
                            stackIn_146_1 = stackOut_139_1;
                            stackIn_140_0 = stackOut_139_0;
                            stackIn_140_1 = stackOut_139_1;
                            if (var9 != 0) {
                              L78: while (true) {
                                if (stackIn_146_0 >= stackIn_146_1) {
                                  break L75;
                                } else {
                                  var12 = var4_ref_String__[var5];
                                  var7 = hn.a(0, var12, false);
                                  stackOut_147_0 = var7 ^ -1;
                                  stackOut_147_1 = var3_int ^ -1;
                                  stackIn_152_0 = stackOut_147_0;
                                  stackIn_152_1 = stackOut_147_1;
                                  stackIn_148_0 = stackOut_147_0;
                                  stackIn_148_1 = stackOut_147_1;
                                  if (var9 != 0) {
                                    break L74;
                                  } else {
                                    L79: {
                                      if (stackIn_148_0 >= stackIn_148_1) {
                                        break L79;
                                      } else {
                                        var3_int = var7;
                                        break L79;
                                      }
                                    }
                                    var5++;
                                    if (var9 == 0) {
                                      stackOut_145_0 = var4_ref_String__.length ^ -1;
                                      stackOut_145_1 = var5 ^ -1;
                                      stackIn_146_0 = stackOut_145_0;
                                      stackIn_146_1 = stackOut_145_1;
                                      continue L78;
                                    } else {
                                      break L75;
                                    }
                                  }
                                }
                              }
                            } else {
                              L80: {
                                if (stackIn_140_0 < stackIn_140_1) {
                                  var3_int = var7;
                                  break L80;
                                } else {
                                  break L80;
                                }
                              }
                              var5++;
                              if (var9 == 0) {
                                continue L76;
                              } else {
                                break L77;
                              }
                            }
                          }
                        }
                        var4_ref_String__ = ik.field_a;
                        var5 = 0;
                        L81: while (true) {
                          stackOut_145_0 = var4_ref_String__.length ^ -1;
                          stackOut_145_1 = var5 ^ -1;
                          stackIn_146_0 = stackOut_145_0;
                          stackIn_146_1 = stackOut_145_1;
                          if (stackIn_146_0 >= stackIn_146_1) {
                            break L75;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = hn.a(0, var12, false);
                            stackOut_147_0 = var7 ^ -1;
                            stackOut_147_1 = var3_int ^ -1;
                            stackIn_152_0 = stackOut_147_0;
                            stackIn_152_1 = stackOut_147_1;
                            stackIn_148_0 = stackOut_147_0;
                            stackIn_148_1 = stackOut_147_1;
                            if (var9 != 0) {
                              break L74;
                            } else {
                              L82: {
                                if (stackIn_148_0 >= stackIn_148_1) {
                                  break L82;
                                } else {
                                  var3_int = var7;
                                  break L82;
                                }
                              }
                              var5++;
                              if (var9 == 0) {
                                continue L81;
                              } else {
                                break L75;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  qk.field_j = aq.field_B.field_c * (al.field_bb + wk.field_G << -2095370847);
                  ZombieDawnMulti.field_H = am.field_c - (var3_int >> 1283362145);
                  stackOut_151_0 = -(var3_int >> -641415647);
                  stackOut_151_1 = am.field_c - -var3_int;
                  stackIn_152_0 = stackOut_151_0;
                  stackIn_152_1 = stackOut_151_1;
                  break L74;
                }
                fl.field_a = stackIn_152_0 + stackIn_152_1;
                var4 = 0;
                L83: while (true) {
                  L84: {
                    L85: {
                      if (hq.field_m.length <= var4) {
                        break L85;
                      } else {
                        stackOut_154_0 = qk.field_j;
                        stackOut_154_1 = wd.field_Q[var4] ^ -1;
                        stackOut_154_2 = -1;
                        stackIn_160_0 = stackOut_154_0;
                        stackIn_160_1 = stackOut_154_1;
                        stackIn_160_2 = stackOut_154_2;
                        stackIn_155_0 = stackOut_154_0;
                        stackIn_155_1 = stackOut_154_1;
                        stackIn_155_2 = stackOut_154_2;
                        if (var9 != 0) {
                          break L84;
                        } else {
                          L86: {
                            stackOut_155_0 = stackIn_155_0;
                            stackIn_157_0 = stackOut_155_0;
                            stackIn_156_0 = stackOut_155_0;
                            if (stackIn_155_1 <= stackIn_155_2) {
                              stackOut_157_0 = stackIn_157_0;
                              stackOut_157_1 = me.field_h;
                              stackIn_158_0 = stackOut_157_0;
                              stackIn_158_1 = stackOut_157_1;
                              break L86;
                            } else {
                              stackOut_156_0 = stackIn_156_0;
                              stackOut_156_1 = se.field_C;
                              stackIn_158_0 = stackOut_156_0;
                              stackIn_158_1 = stackOut_156_1;
                              break L86;
                            }
                          }
                          qk.field_j = stackIn_158_0 + stackIn_158_1;
                          var4++;
                          if (var9 == 0) {
                            continue L83;
                          } else {
                            break L85;
                          }
                        }
                      }
                    }
                    stackOut_159_0 = bp.field_r;
                    stackOut_159_1 = qk.field_j;
                    stackOut_159_2 = 952257185;
                    stackIn_160_0 = stackOut_159_0;
                    stackIn_160_1 = stackOut_159_1;
                    stackIn_160_2 = stackOut_159_2;
                    break L84;
                  }
                  L87: {
                    ce.field_k = stackIn_160_0 - (stackIn_160_1 >> stackIn_160_2);
                    uf.field_b = new int[hq.field_m.length][];
                    if (!param0) {
                      break L87;
                    } else {
                      field_M = -108;
                      break L87;
                    }
                  }
                  var4 = 0;
                  var5 = ce.field_k;
                  L88: while (true) {
                    stackOut_163_0 = var4;
                    stackOut_163_1 = hq.field_m;
                    stackIn_164_0 = stackOut_163_0;
                    stackIn_164_1 = stackOut_163_1;
                    if (stackIn_164_0 >= stackIn_164_1.length) {
                      break L2;
                    } else {
                      var6 = wd.field_Q[var4];
                      stackOut_165_0 = -1;
                      stackOut_165_1 = var6 ^ -1;
                      stackIn_171_0 = stackOut_165_0;
                      stackIn_171_1 = stackOut_165_1;
                      stackIn_166_0 = stackOut_165_0;
                      stackIn_166_1 = stackOut_165_1;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L89: {
                          L90: {
                            if (stackIn_166_0 < stackIn_166_1) {
                              break L90;
                            } else {
                              var7 = hn.a(0, hq.field_m[var4], true);
                              var8 = am.field_c + -(var7 >> -573694047);
                              var5 = var5 + al.field_bb;
                              uf.field_b[var4] = new int[4];
                              uf.field_b[var4][0] = var8 + -no.field_Gb;
                              uf.field_b[var4][1] = var5;
                              uf.field_b[var4][2] = var7 - -(no.field_Gb << 290203713);
                              uf.field_b[var4][3] = (wk.field_G << -1501645247) + me.field_h;
                              var5 = var5 + ((wk.field_G << 2035462817) - (-al.field_bb + -me.field_h));
                              if (var9 == 0) {
                                break L89;
                              } else {
                                break L90;
                              }
                            }
                          }
                          var5 = var5 + se.field_C;
                          break L89;
                        }
                        var4++;
                        if (var9 == 0) {
                          continue L88;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_170_0 = ho.field_q;
              stackOut_170_1 = 2;
              stackIn_171_0 = stackOut_170_0;
              stackIn_171_1 = stackOut_170_1;
              break L1;
            }
            L91: {
              L92: {
                if (stackIn_171_0 != stackIn_171_1) {
                  break L92;
                } else {
                  aq.field_B.a(-1, param1, -31458, -1);
                  if (var9 == 0) {
                    break L91;
                  } else {
                    break L92;
                  }
                }
              }
              aq.field_B.a(0, param1, -31458, iq.a(bo.field_d, -1, bd.field_g));
              break L91;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "eb.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        String discarded$0 = null;
        field_L = null;
        if (!param0) {
            discarded$0 = eb.a(-18, false, true);
        }
        field_e = null;
        field_w = null;
        field_J = null;
        field_y = null;
        field_i = null;
        field_B = null;
    }

    eb() {
        this.field_z = new byte[6][258];
        this.field_c = new int[6][258];
        this.field_I = new boolean[256];
        this.field_O = new int[6][258];
        this.field_b = 0;
        this.field_l = new byte[18002];
        this.field_C = new byte[256];
        this.field_t = new byte[18002];
        this.field_E = new boolean[16];
        this.field_D = 0;
        this.field_g = new int[16];
        this.field_v = new byte[4096];
        this.field_h = new int[6][258];
        this.field_G = new int[257];
        this.field_a = new int[6];
        this.field_m = new int[256];
    }

    static {
        field_e = "Field Marshal";
        field_L = "This game option has not yet been unlocked for use.";
        field_A = 2;
        field_J = new int[8192];
        field_w = new ao(15, 0, 1, 0);
        field_i = "Strong zombie is strong.";
        field_y = "Password is valid";
    }
}
