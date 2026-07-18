/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static char[] field_f;
    private int field_t;
    private int field_e;
    private int field_k;
    private int field_g;
    private int field_o;
    private int field_d;
    private int field_l;
    static boolean field_i;
    private int field_a;
    private int field_j;
    private float field_c;
    private int field_p;
    static boolean field_m;
    static String field_b;
    private boolean field_s;
    private nc field_n;
    private int field_h;
    private int field_u;
    private int field_v;
    private int field_r;
    private int field_q;

    final void b(int param0) {
        if (null != ih.field_b) {
          return;
        } else {
          L0: {
            if (bn.field_d > 0) {
              break L0;
            } else {
              ((li) this).field_s = false;
              break L0;
            }
          }
          if (((li) this).field_s) {
            int fieldTemp$2 = ((li) this).field_k - 1;
            ((li) this).field_k = ((li) this).field_k - 1;
            if (fieldTemp$2 > 0) {
              return;
            } else {
              ((li) this).field_k = ((li) this).field_t;
              if (((li) this).field_q > qk.field_b) {
                ((li) this).field_s = false;
                return;
              } else {
                L1: {
                  this.c((byte) 22);
                  if (param0 == -7927) {
                    break L1;
                  } else {
                    li.b((byte) 33);
                    break L1;
                  }
                }
                return;
              }
            }
          } else {
            L2: {
              if (fl.field_i >= ((li) this).field_l) {
                if (((li) this).field_l > 0) {
                  fi.field_s = 0;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                fi.field_s = (((li) this).field_l + -fl.field_i) / 2;
                break L2;
              }
            }
            L3: {
              L4: {
                if (fl.field_i != ((li) this).field_h) {
                  break L4;
                } else {
                  if (((li) this).field_r == km.field_B) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((li) this).field_n.a(((li) this).field_r, ((li) this).field_h, (byte) 125);
              break L3;
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        ((li) this).field_l = param0;
        if (param2 > -104) {
            return;
        }
        ((li) this).field_j = param1;
    }

    public static void b(byte param0) {
        if (param0 != 112) {
            field_b = null;
        }
        field_b = null;
        field_f = null;
    }

    final boolean c(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1558) {
            break L0;
          } else {
            li.b((byte) -22);
            break L0;
          }
        }
        L1: {
          L2: {
            if (qk.field_b < ((li) this).field_q) {
              break L2;
            } else {
              if (bn.field_d <= 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final h a(int param0) {
        ((li) this).field_g = fl.field_i;
        ((li) this).field_v = km.field_B;
        ((li) this).field_n.a(((li) this).field_p, ((li) this).field_e, (byte) 106);
        km.field_Db = false;
        if (param0 != 11) {
            li.a(true);
        }
        h var2 = wm.a(((li) this).field_e, 0, ((li) this).field_p, 0, 5416, ei.field_c);
        if (!(var2 != null)) {
            ((li) this).a((byte) -122);
        }
        return var2;
    }

    final static void a(boolean param0) {
        int var1 = 0;
        double var2_double = 0.0;
        ic var2 = null;
        int var3 = 0;
        double var4 = 0.0;
        double var6 = 0.0;
        int var8 = 0;
        int stackIn_41_0 = 0;
        ic stackIn_60_0 = null;
        ic stackIn_63_0 = null;
        ic stackIn_64_0 = null;
        ic stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        ic stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        double stackIn_66_2 = 0.0;
        ic stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        double stackIn_67_2 = 0.0;
        ic stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        double stackIn_68_2 = 0.0;
        int stackIn_68_3 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        ic stackOut_59_0 = null;
        ic stackOut_58_0 = null;
        ic stackOut_62_0 = null;
        ic stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        ic stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        ic stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        double stackOut_65_2 = 0.0;
        ic stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        double stackOut_67_2 = 0.0;
        int stackOut_67_3 = 0;
        ic stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        double stackOut_66_2 = 0.0;
        int stackOut_66_3 = 0;
        L0: {
          var8 = Virogrid.field_F ? 1 : 0;
          if (tg.field_x != 0) {
            break L0;
          } else {
            if (gb.g(true)) {
              break L0;
            } else {
              if (ug.a(true)) {
                break L0;
              } else {
                if (!eg.a((byte) 47)) {
                  L1: {
                    if (!param0) {
                      break L1;
                    } else {
                      field_f = null;
                      break L1;
                    }
                  }
                  L2: {
                    if (oi.field_g == 0) {
                      break L2;
                    } else {
                      if (hm.field_c == 10) {
                        el.a(12229, true);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (oi.field_g == 0) {
                      break L3;
                    } else {
                      L4: {
                        qa.field_e = uk.a(-123, ii.field_b, a.field_y);
                        if (0 != qa.field_e) {
                          break L4;
                        } else {
                          if (wn.field_C != 0) {
                            L5: {
                              if (bc.field_c < 2) {
                                bc.field_c = co.field_l;
                                break L5;
                              } else {
                                bc.field_c = 0;
                                break L5;
                              }
                            }
                            ka.a(mf.a(108, i.field_y), (byte) 87);
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (2 != wn.field_C) {
                        break L3;
                      } else {
                        if (5 == qa.field_e) {
                          el.a(true, (byte) -106);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L6: {
                    qa.field_e = uk.a(-109, nl.field_u, hk.field_Jb);
                    if (j.field_e == 0) {
                      break L6;
                    } else {
                      if (2 != wn.field_C) {
                        break L6;
                      } else {
                        if (qa.field_e == 1) {
                          tl.a(0.0f, param0, 0.029999999329447746f);
                          break L6;
                        } else {
                          if (qa.field_e != 2) {
                            if (qa.field_e != 3) {
                              if (qa.field_e != 4) {
                                break L6;
                              } else {
                                tl.a(-8.0f, false, 0.0f);
                                break L6;
                              }
                            } else {
                              tl.a(8.0f, false, 0.0f);
                              break L6;
                            }
                          } else {
                            tl.a(0.0f, false, -0.029999999329447746f);
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    L8: {
                      if (~hm.field_c != ~i.field_y) {
                        break L8;
                      } else {
                        if (~pg.field_g != ~nf.field_g) {
                          break L8;
                        } else {
                          if (10 == i.field_y) {
                            break L8;
                          } else {
                            if (-1 == qa.field_e) {
                              stackOut_40_0 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    stackOut_39_0 = 1;
                    stackIn_41_0 = stackOut_39_0;
                    break L7;
                  }
                  L9: {
                    var1 = stackIn_41_0;
                    if (!ke.field_p.field_g) {
                      fa.field_k = (double)(hk.field_Jb + -tm.field_g + 200);
                      sf.field_M = (double)nl.field_u;
                      break L9;
                    } else {
                      L10: {
                        var2_double = (double)(nl.field_u - (df.field_e >> 1)) / 512.0;
                        var4 = (double)(-tm.field_g + hk.field_Jb) / 512.0;
                        var6 = -nk.field_K[2] / (nk.field_K[11] + (nk.field_K[5] * var2_double + var4 * nk.field_K[8]));
                        sf.field_M = 4.0 * ((var2_double * nk.field_K[3] + var4 * nk.field_K[6] + nk.field_K[9]) * var6 + nk.field_K[0]);
                        fa.field_k = (double)(-(df.field_f >> 1) + 440) + (nk.field_K[1] + (nk.field_K[10] + (var2_double * nk.field_K[4] + nk.field_K[7] * var4)) * var6) * 4.0;
                        if (0.0 > nk.field_K[11]) {
                          sf.field_M = 320.0 - sf.field_M;
                          break L10;
                        } else {
                          sf.field_M = 320.0 + sf.field_M;
                          break L10;
                        }
                      }
                      L11: {
                        if (we.field_c.field_J <= hk.field_Jb) {
                          break L11;
                        } else {
                          L12: {
                            L13: {
                              if (j.field_e == 2) {
                                break L13;
                              } else {
                                if (!dc.field_Y[81]) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            if (sf.field_F == -1) {
                              break L12;
                            } else {
                              if (nl.field_u == -1) {
                                break L12;
                              } else {
                                tl.a(0.0f, false, 0.004999999888241291f * (float)(-sf.field_F + nl.field_u));
                                break L12;
                              }
                            }
                          }
                          if (og.field_b != 0) {
                            tl.a((float)(24 * og.field_b), false, 0.0f);
                            break L11;
                          } else {
                            break L9;
                          }
                        }
                      }
                      break L9;
                    }
                  }
                  L14: {
                    if (vg.field_I == null) {
                      stackOut_59_0 = ei.field_b;
                      stackIn_60_0 = stackOut_59_0;
                      break L14;
                    } else {
                      stackOut_58_0 = vg.field_I;
                      stackIn_60_0 = stackOut_58_0;
                      break L14;
                    }
                  }
                  L15: {
                    var2 = stackIn_60_0;
                    if (var2 != null) {
                      L16: {
                        stackOut_62_0 = (ic) var2;
                        stackIn_64_0 = stackOut_62_0;
                        stackIn_63_0 = stackOut_62_0;
                        if (-1 != i.field_y) {
                          stackOut_64_0 = (ic) (Object) stackIn_64_0;
                          stackOut_64_1 = 0;
                          stackIn_65_0 = stackOut_64_0;
                          stackIn_65_1 = stackOut_64_1;
                          break L16;
                        } else {
                          stackOut_63_0 = (ic) (Object) stackIn_63_0;
                          stackOut_63_1 = 1;
                          stackIn_65_0 = stackOut_63_0;
                          stackIn_65_1 = stackOut_63_1;
                          break L16;
                        }
                      }
                      L17: {
                        stackOut_65_0 = (ic) (Object) stackIn_65_0;
                        stackOut_65_1 = stackIn_65_1;
                        stackOut_65_2 = fa.field_k;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        stackIn_67_2 = stackOut_65_2;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        stackIn_66_2 = stackOut_65_2;
                        if (nk.field_K[11] >= 0.0) {
                          stackOut_67_0 = (ic) (Object) stackIn_67_0;
                          stackOut_67_1 = stackIn_67_1;
                          stackOut_67_2 = stackIn_67_2;
                          stackOut_67_3 = 0;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          stackIn_68_2 = stackOut_67_2;
                          stackIn_68_3 = stackOut_67_3;
                          break L17;
                        } else {
                          stackOut_66_0 = (ic) (Object) stackIn_66_0;
                          stackOut_66_1 = stackIn_66_1;
                          stackOut_66_2 = stackIn_66_2;
                          stackOut_66_3 = 1;
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_68_1 = stackOut_66_1;
                          stackIn_68_2 = stackOut_66_2;
                          stackIn_68_3 = stackOut_66_3;
                          break L17;
                        }
                      }
                      ((ic) (Object) stackIn_68_0).a(stackIn_68_1 != 0, stackIn_68_2, stackIn_68_3 != 0, j.field_e, sf.field_M, oi.field_g, var1 != 0, (byte) -64);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L18: {
                    if (ab.b(i.field_y, 1)) {
                      al.field_j[i.field_y].a(var1 != 0, fa.field_k, sf.field_M, oi.field_g, -3666, oi.field_g);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (!w.field_J) {
                      break L19;
                    } else {
                      if (!ke.field_p.field_h) {
                        break L19;
                      } else {
                        if (sf.field_F == -1) {
                          break L19;
                        } else {
                          if (nl.field_u == -1) {
                            break L19;
                          } else {
                            if (hk.field_Jb == -1) {
                              break L19;
                            } else {
                              var3 = Math.abs(nl.field_u + -sf.field_F) + Math.abs(-pb.field_h + hk.field_Jb);
                              var4 = sf.field_M;
                              var6 = fa.field_k;
                              if (110.0 >= var4) {
                                break L19;
                              } else {
                                if (var4 >= 530.0) {
                                  break L19;
                                } else {
                                  if (var6 <= 0.0) {
                                    break L19;
                                  } else {
                                    if (var6 >= 400.0) {
                                      break L19;
                                    } else {
                                      gd.field_n.a((l) (Object) new pm((int)(16.0 * var4), (int)(var6 * 16.0), Math.min(ke.field_p.field_c, ke.field_p.field_i * var3 + ke.field_p.field_a)), (byte) -38);
                                      break L19;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L20: {
                    if (!db.b((byte) 13, 0)) {
                      break L20;
                    } else {
                      if (hj.field_h <= 0) {
                        break L20;
                      } else {
                        if (oi.field_g != 1) {
                          break L20;
                        } else {
                          if (nl.field_u <= il.field_k) {
                            break L20;
                          } else {
                            if (~nl.field_u <= ~il.field_I) {
                              break L20;
                            } else {
                              if (il.field_B >= hk.field_Jb) {
                                break L20;
                              } else {
                                if (~hk.field_Jb <= ~il.field_p) {
                                  break L20;
                                } else {
                                  if ((rn.field_c & 512) != 0) {
                                    break L20;
                                  } else {
                                    vf.a(-64);
                                    break L20;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  pb.field_h = hk.field_Jb;
                  sf.field_F = nl.field_u;
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, byte param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var20 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 < 0) {
                break L1;
              } else {
                if (~param0 > ~fk.field_n) {
                  L2: {
                    if (param1 >= 0) {
                      break L2;
                    } else {
                      if (0 <= param5) {
                        break L2;
                      } else {
                        if (param7 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (~param1 > ~fk.field_o) {
                      break L3;
                    } else {
                      if (~param5 > ~fk.field_o) {
                        break L3;
                      } else {
                        if (~param7 > ~fk.field_o) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var10 = 31 / ((0 - param8) / 32);
                    var15 = -param0 + param4;
                    if (param2 == param0) {
                      L5: {
                        if (param4 != param0) {
                          var16 = param4 - param2;
                          if (~param1 <= ~param5) {
                            var9_int = param5 << 16;
                            var11 = param1 << 16;
                            var13 = (param7 + -param1 << 16) / var15;
                            var12 = (-param5 + param7 << 16) / var16;
                            break L5;
                          } else {
                            var13 = (-param5 + param7 << 16) / var16;
                            var9_int = param1 << 16;
                            var11 = param5 << 16;
                            var12 = (param7 - param1 << 16) / var15;
                            break L5;
                          }
                        } else {
                          var13 = 0;
                          var9_int = param1 << 16;
                          var12 = 0;
                          var11 = param5 << 16;
                          break L5;
                        }
                      }
                      L6: {
                        if (param0 >= 0) {
                          break L6;
                        } else {
                          param0 = Math.min(-param0, param2 + -param0);
                          var9_int = var9_int + param0 * var12;
                          var11 = var11 + param0 * var13;
                          param0 = 0;
                          break L6;
                        }
                      }
                      var14 = 0;
                      break L4;
                    } else {
                      L7: {
                        var11 = param1 << 16;
                        var9_int = param1 << 16;
                        var16 = -param0 + param2;
                        var13 = (param7 + -param1 << 16) / var15;
                        var12 = (param5 - param1 << 16) / var16;
                        if (var13 <= var12) {
                          var17 = var12;
                          var12 = var13;
                          var13 = var17;
                          var14 = 1;
                          break L7;
                        } else {
                          var14 = 0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (param0 >= 0) {
                            break L9;
                          } else {
                            if (param2 < 0) {
                              param0 = param2 + -param0;
                              var9_int = var9_int + param0 * var12;
                              var11 = var11 + var13 * param0;
                              param0 = param2;
                              break L8;
                            } else {
                              param0 = -param0;
                              var11 = var11 + param0 * var13;
                              var9_int = var9_int + param0 * var12;
                              param0 = 0;
                              break L9;
                            }
                          }
                        }
                        var17 = fk.field_m[param0];
                        L10: while (true) {
                          if (~param0 <= ~param2) {
                            break L8;
                          } else {
                            L11: {
                              var18 = var9_int >> 16;
                              if (fk.field_o <= var18) {
                                break L11;
                              } else {
                                var19 = -(var9_int >> 16) + (var11 >> 16);
                                if (var19 != 0) {
                                  L12: {
                                    if (~fk.field_o >= ~(var18 - -var19)) {
                                      var19 = fk.field_o + (-var18 - 1);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (var18 >= 0) {
                                    jm.a(var19, param3, var18 + var17, true, param6);
                                    break L11;
                                  } else {
                                    jm.a(var18 + var19, param3, var17, true, param6);
                                    break L11;
                                  }
                                } else {
                                  if (var18 < 0) {
                                    break L11;
                                  } else {
                                    if (fk.field_o <= var18) {
                                      break L11;
                                    } else {
                                      jm.a(var19, param3, var17 + var18, true, param6);
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            param0++;
                            if (~param0 > ~fk.field_n) {
                              var9_int = var9_int + var12;
                              var17 = var17 + df.field_e;
                              var11 = var11 + var13;
                              continue L10;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var17 = -param2 + param4;
                      if (var17 != 0) {
                        L13: {
                          var18 = param7 << 16;
                          if (var14 != 0) {
                            var11 = param5 << 16;
                            break L13;
                          } else {
                            var9_int = param5 << 16;
                            break L13;
                          }
                        }
                        var13 = (-var11 + var18) / var17;
                        var12 = (var18 - var9_int) / var17;
                        break L4;
                      } else {
                        var12 = 0;
                        var13 = 0;
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (param0 < 0) {
                      param0 = -param0;
                      var11 = var11 + var13 * param0;
                      var9_int = var9_int + param0 * var12;
                      param0 = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  var16 = fk.field_m[param0];
                  L15: while (true) {
                    if (~param0 <= ~param4) {
                      break L0;
                    } else {
                      L16: {
                        var17 = var9_int >> 16;
                        if (var17 < fk.field_o) {
                          var18 = (var11 >> 16) + -(var9_int >> 16);
                          if (var18 != 0) {
                            L17: {
                              if (~(var18 + var17) <= ~fk.field_o) {
                                var18 = fk.field_o + (-var17 + -1);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var17 >= 0) {
                              jm.a(var18, param3, var16 + var17, true, param6);
                              break L16;
                            } else {
                              jm.a(var17 + var18, param3, var16, true, param6);
                              break L16;
                            }
                          } else {
                            if (var17 < 0) {
                              break L16;
                            } else {
                              if (~var17 > ~fk.field_o) {
                                jm.a(var18, param3, var16 + var17, true, param6);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                      param0++;
                      if (~param0 > ~fk.field_n) {
                        var9_int = var9_int + var12;
                        var16 = var16 + df.field_e;
                        var11 = var11 + var13;
                        continue L15;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var9;
            stackOut_74_1 = new StringBuilder().append("li.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L18;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L18;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        var2 = ((li) this).field_l;
        var3 = ((li) this).field_j;
        if (!((li) this).c(-1558)) {
          ((li) this).field_s = false;
          return;
        } else {
          L0: {
            if (((li) this).field_a >= var3) {
              if (var3 < ((li) this).field_o) {
                var3 = ((li) this).field_o;
                break L0;
              } else {
                break L0;
              }
            } else {
              var3 = ((li) this).field_a;
              break L0;
            }
          }
          L1: {
            if (var2 > ((li) this).field_u) {
              var2 = ((li) this).field_u;
              break L1;
            } else {
              if (var2 < ((li) this).field_d) {
                var2 = ((li) this).field_d;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (0.0f < ((li) this).field_c) {
              var4 = (int)(0.5f + ((li) this).field_c * (float)var3);
              if (var4 > var2) {
                var3 = (int)((float)var2 / ((li) this).field_c);
                break L2;
              } else {
                if (var2 > var4) {
                  var2 = var4;
                  break L2;
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L3: {
            L4: {
              if (var2 != fl.field_i) {
                break L4;
              } else {
                if (var3 != km.field_B) {
                  break L4;
                } else {
                  break L3;
                }
              }
            }
            ((li) this).field_n.a(var3, var2, (byte) 40);
            break L3;
          }
          L5: {
            if (((li) this).field_l <= 0) {
              break L5;
            } else {
              fi.field_s = (((li) this).field_l + -fl.field_i) / 2;
              break L5;
            }
          }
          return;
        }
    }

    final void a(byte param0) {
        ((li) this).field_n.a(((li) this).field_v, ((li) this).field_g, (byte) 47);
        if (param0 != -122) {
            Object var3 = null;
            li.a(16, 40, -84, (int[]) null, -112, -39, -22, 49, (byte) -74);
        }
    }

    private li() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new char[]{'[', ']', '#'};
        field_m = false;
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
