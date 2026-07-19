/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    int[] field_K;
    short[] field_J;
    short[] field_M;
    short[] field_N;
    static ck field_h;
    short[] field_o;
    int field_H;
    int[] field_T;
    int[] field_S;
    int field_n;
    int[] field_R;
    int[] field_g;
    static ck field_x;
    static String field_s;
    short[] field_F;
    static oh field_E;
    short[] field_r;
    short field_L;
    int[] field_w;
    int[] field_m;
    short[] field_O;
    int field_f;
    static String[] field_I;
    short field_D;
    byte[] field_Q;
    private boolean field_d;
    int[] field_v;
    short[] field_A;
    short field_l;
    short[] field_e;
    short[] field_z;
    static int[] field_G;
    int[] field_q;
    short[] field_u;
    short[] field_j;
    short[] field_k;
    short[] field_t;
    short[] field_c;
    int field_b;
    short[] field_P;
    short[] field_C;
    static String field_p;
    int field_a;
    byte field_B;
    short[] field_y;
    int field_i;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = client.field_A ? 1 : 0;
        if (!this.field_d) {
          L0: {
            this.field_d = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            if (param0 == -14200) {
              break L0;
            } else {
              this.a(70, 90, (byte) -86, 59, -78);
              break L0;
            }
          }
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (var8 >= this.field_l) {
                  break L3;
                } else {
                  var9 = this.field_J[var8];
                  var10 = this.field_o[var8];
                  if (var12 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (var9 <= var5) {
                        break L4;
                      } else {
                        var5 = var9;
                        break L4;
                      }
                    }
                    L5: {
                      var11 = this.field_e[var8];
                      if (var9 < var2) {
                        var2 = var9;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if ((var10 ^ -1) < (var6 ^ -1)) {
                        var6 = var10;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if ((var10 ^ -1) > (var3 ^ -1)) {
                        var3 = var10;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if ((var7 ^ -1) > (var11 ^ -1)) {
                        var7 = var11;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if ((var4 ^ -1) < (var11 ^ -1)) {
                        var4 = var11;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var8++;
                    if (var12 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.field_f = var5;
              this.field_H = var2;
              this.field_i = var7;
              this.field_a = var4;
              this.field_n = var6;
              this.field_b = var3;
              break L2;
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        ve var6 = null;
        ve var7 = null;
        uf var4 = null;
        if (param0 != -20974) {
            return;
        }
        if (ta.field_b != param2) {
            var6 = (ve) ((Object) tg.field_b.a(24710, (long)ta.field_b));
            var7 = var6;
            if (var7 != null) {
                var7.field_xc = null;
            }
            ta.field_b = param2;
            var4 = we.field_b;
            var4.f(param1, -4);
            var4.a(true, 3);
            var4.a(true, 11);
            var4.d(-1, param2);
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        w var5 = null;
        w var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        w var14 = null;
        String var15 = null;
        w var16 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        w stackIn_25_0 = null;
        w stackIn_26_0 = null;
        w stackIn_27_0 = null;
        String stackIn_27_1 = null;
        w stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        w stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        w stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        String stackIn_30_2 = null;
        boolean stackIn_52_0 = false;
        String stackIn_61_0 = null;
        w stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        w stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        w stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        w stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        w stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        w stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        w stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        w stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        w stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        w stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        w stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        w stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        w stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        w stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        w stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_84_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        w stackOut_24_0 = null;
        w stackOut_26_0 = null;
        String stackOut_26_1 = null;
        w stackOut_25_0 = null;
        String stackOut_25_1 = null;
        w stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        w stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        String stackOut_29_2 = null;
        w stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        String stackOut_28_2 = null;
        boolean stackOut_51_0 = false;
        String stackOut_60_0 = null;
        String stackOut_59_0 = null;
        w stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        w stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        w stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        w stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        w stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        w stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        w stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        w stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        w stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        w stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        w stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        w stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        w stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        w stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        w stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_83_0 = 0;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                qf.a(bf.field_r, 109);
                if (g.field_N == null) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      fh.field_d.field_N = 0;
                      var14 = fh.field_d;
                      var16 = var14;
                      var16.field_mb = 0;
                      nn.field_a.field_N = 0;
                      var5 = nn.field_a;
                      var5.field_mb = 0;
                      var6 = tg.field_i;
                      tg.field_i.field_N = 0;
                      var6.field_mb = 0;
                      fl.field_b.field_Y = cl.field_s.toUpperCase();
                      var7 = (2 + oh.field_d.field_mb) / 2;
                      tg.field_i.a(-2 + var7, param3 ^ 48, -40 + oh.field_d.field_N, 40, 0);
                      nn.field_a.a(oh.field_d.field_mb + -var7, param3 + -48, -40 + oh.field_d.field_N, 40, var7);
                      if ((b.field_P.length ^ -1) != -2) {
                        break L4;
                      } else {
                        if ((b.field_P[0] ^ -1) != -3) {
                          break L4;
                        } else {
                          var8 = 0;
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var8 = 0;
                    var9_int = 0;
                    var10 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if ((b.field_P.length ^ -1) >= (var10 ^ -1)) {
                            break L7;
                          } else {
                            stackOut_7_0 = -1;
                            stackOut_7_1 = kk.field_l[var10 / 8] & 1 << (var10 & 7) ^ -1;
                            stackIn_21_0 = stackOut_7_0;
                            stackIn_21_1 = stackOut_7_1;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            if (var12 != 0) {
                              break L6;
                            } else {
                              L8: {
                                if (stackIn_8_0 == stackIn_8_1) {
                                  stackOut_10_0 = 0;
                                  stackIn_11_0 = stackOut_10_0;
                                  break L8;
                                } else {
                                  stackOut_9_0 = 1;
                                  stackIn_11_0 = stackOut_9_0;
                                  break L8;
                                }
                              }
                              L9: {
                                var11_int = stackIn_11_0;
                                if (var11_int != 0) {
                                  var9_int++;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                if (var11_int == 0) {
                                  break L10;
                                } else {
                                  if ((b.field_P[var10] ^ -1) != -3) {
                                    var8 = 1;
                                    if (var12 == 0) {
                                      break L7;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var10++;
                              if (var12 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_20_0 = 0;
                        stackOut_20_1 = var9_int;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        break L6;
                      }
                      if (stackIn_21_0 != stackIn_21_1) {
                        break L3;
                      } else {
                        var8 = 1;
                        break L3;
                      }
                    }
                  }
                  L11: {
                    nn.field_a.field_Hb = true;
                    if (fj.field_h) {
                      break L11;
                    } else {
                      L12: {
                        stackOut_24_0 = nn.field_a;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var8 != 0) {
                          stackOut_26_0 = (w) ((Object) stackIn_26_0);
                          stackOut_26_1 = wg.field_g;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          break L12;
                        } else {
                          stackOut_25_0 = (w) ((Object) stackIn_25_0);
                          stackOut_25_1 = kd.field_r;
                          stackIn_27_0 = stackOut_25_0;
                          stackIn_27_1 = stackOut_25_1;
                          break L12;
                        }
                      }
                      L13: {
                        stackIn_27_0.field_Y = ((String) (Object) stackIn_27_1).toUpperCase();
                        stackOut_27_0 = cl.field_n;
                        stackOut_27_1 = 94;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        if (var8 == 0) {
                          stackOut_29_0 = (w) ((Object) stackIn_29_0);
                          stackOut_29_1 = stackIn_29_1;
                          stackOut_29_2 = wd.field_e;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          stackIn_30_2 = stackOut_29_2;
                          break L13;
                        } else {
                          stackOut_28_0 = (w) ((Object) stackIn_28_0);
                          stackOut_28_1 = stackIn_28_1;
                          stackOut_28_2 = af.field_c;
                          stackIn_30_0 = stackOut_28_0;
                          stackIn_30_1 = stackOut_28_1;
                          stackIn_30_2 = stackOut_28_2;
                          break L13;
                        }
                      }
                      L14: {
                        stackIn_30_0.field_Y = cm.a((byte) stackIn_30_1, stackIn_30_2, new String[]{nn.field_a.field_Y});
                        ma.field_G.field_Hb = true;
                        tg.field_i.field_Y = kh.field_b;
                        ve.field_ac = true;
                        if (bc.field_D == null) {
                          break L14;
                        } else {
                          L15: {
                            gd.field_b = false;
                            if (km.field_D == null) {
                              km.field_D = new byte[j.field_b];
                              rd.field_c = new boolean[j.field_b];
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          ve.field_ac = false;
                          var9_int = 0;
                          L16: while (true) {
                            L17: {
                              L18: {
                                if (var9_int >= j.field_b) {
                                  break L18;
                                } else {
                                  rd.field_c[var9_int] = false;
                                  var9_int++;
                                  if (var12 != 0) {
                                    break L17;
                                  } else {
                                    if (var12 == 0) {
                                      continue L16;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                              uc.a(-1, true, -1, 0, -1, j.field_b, g.field_N, false);
                              break L17;
                            }
                            if (2 > te.field_p) {
                              break L14;
                            } else {
                              if (!bj.field_d[12]) {
                                break L14;
                              } else {
                                ve.field_ac = true;
                                break L14;
                              }
                            }
                          }
                        }
                      }
                      if (!ve.field_ac) {
                        nn.field_a.field_Hb = false;
                        if (!nn.field_a.field_Kb) {
                          break L2;
                        } else {
                          L19: {
                            var9 = null;
                            if (gd.field_b) {
                              var9 = "<col=A00000>" + hb.field_Pb + "</col>";
                              var11 = var9;
                              var9 = var11;
                              var11 = var9;
                              var9 = var11;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          var10 = 0;
                          L20: while (true) {
                            L21: {
                              if (j.field_b <= var10) {
                                break L21;
                              } else {
                                stackOut_51_0 = rd.field_c[var10];
                                stackIn_84_0 = stackOut_51_0 ? 1 : 0;
                                stackIn_52_0 = stackOut_51_0;
                                if (var12 != 0) {
                                  break L1;
                                } else {
                                  L22: {
                                    if (!stackIn_52_0) {
                                      break L22;
                                    } else {
                                      L23: {
                                        var11_ref = "<col=A00000>" + pa.field_db[var10] + "</col>";
                                        var9 = var11_ref;
                                        var9 = var11_ref;
                                        if (var9 != null) {
                                          break L23;
                                        } else {
                                          var9 = var11_ref;
                                          if (var12 == 0) {
                                            break L22;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      var9 = (String) (var9) + ", " + var11_ref;
                                      break L22;
                                    }
                                  }
                                  var10++;
                                  if (var12 == 0) {
                                    continue L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            sl.field_g = "<col=A00000>" + lk.field_i + "<br>" + hb.field_Tb + (String) (var9);
                            if (var12 == 0) {
                              break L2;
                            } else {
                              break L11;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  L24: {
                    ma.field_G.field_Hb = false;
                    cl.field_n.field_Y = im.field_c;
                    if (var8 == 0) {
                      stackOut_60_0 = wk.field_j;
                      stackIn_61_0 = stackOut_60_0;
                      break L24;
                    } else {
                      stackOut_59_0 = hc.field_e;
                      stackIn_61_0 = stackOut_59_0;
                      break L24;
                    }
                  }
                  L25: {
                    var15 = stackIn_61_0;
                    var9 = var15;
                    var9 = var15;
                    var9 = var15;
                    var10 = tg.field_i.field_J.a(var15) - -(3 * tg.field_i.field_J.a('.'));
                    tg.field_i.field_X = 0;
                    tg.field_i.field_ub = (-var10 + tg.field_i.field_mb) / 2;
                    if (-17 != (48 & oe.field_G ^ -1)) {
                      break L25;
                    } else {
                      var9 = var15 + ".";
                      break L25;
                    }
                  }
                  L26: {
                    if ((oe.field_G & 48 ^ -1) != -33) {
                      break L26;
                    } else {
                      var9 = (String) (var9) + "..";
                      break L26;
                    }
                  }
                  L27: {
                    if ((48 & oe.field_G) != 48) {
                      break L27;
                    } else {
                      var9 = (String) (var9) + "...";
                      break L27;
                    }
                  }
                  tg.field_i.field_Y = (String) (var9);
                  nn.field_a.field_Y = fc.field_g.toUpperCase();
                  break L2;
                }
              }
              L28: {
                L29: {
                  stackOut_68_0 = ee.field_i;
                  stackOut_68_1 = 0;
                  stackIn_72_0 = stackOut_68_0;
                  stackIn_72_1 = stackOut_68_1;
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  if (!param1) {
                    break L29;
                  } else {
                    stackOut_69_0 = (w) ((Object) stackIn_69_0);
                    stackOut_69_1 = stackIn_69_1;
                    stackIn_72_0 = stackOut_69_0;
                    stackIn_72_1 = stackOut_69_1;
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    if (param2) {
                      break L29;
                    } else {
                      stackOut_70_0 = (w) ((Object) stackIn_70_0);
                      stackOut_70_1 = stackIn_70_1;
                      stackIn_72_0 = stackOut_70_0;
                      stackIn_72_1 = stackOut_70_1;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      if (dn.field_k) {
                        break L29;
                      } else {
                        stackOut_71_0 = (w) ((Object) stackIn_71_0);
                        stackOut_71_1 = stackIn_71_1;
                        stackOut_71_2 = 1;
                        stackIn_73_0 = stackOut_71_0;
                        stackIn_73_1 = stackOut_71_1;
                        stackIn_73_2 = stackOut_71_2;
                        break L28;
                      }
                    }
                  }
                }
                stackOut_72_0 = (w) ((Object) stackIn_72_0);
                stackOut_72_1 = stackIn_72_1;
                stackOut_72_2 = 0;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                stackIn_73_2 = stackOut_72_2;
                break L28;
              }
              L30: {
                L31: {
                  ((w) (Object) stackIn_73_0).a(stackIn_73_1 != 0, stackIn_73_2 != 0);
                  stackOut_73_0 = oh.field_d;
                  stackOut_73_1 = 0;
                  stackIn_77_0 = stackOut_73_0;
                  stackIn_77_1 = stackOut_73_1;
                  stackIn_74_0 = stackOut_73_0;
                  stackIn_74_1 = stackOut_73_1;
                  if (!param1) {
                    break L31;
                  } else {
                    stackOut_74_0 = (w) ((Object) stackIn_74_0);
                    stackOut_74_1 = stackIn_74_1;
                    stackIn_77_0 = stackOut_74_0;
                    stackIn_77_1 = stackOut_74_1;
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    if (param2) {
                      break L31;
                    } else {
                      stackOut_75_0 = (w) ((Object) stackIn_75_0);
                      stackOut_75_1 = stackIn_75_1;
                      stackIn_77_0 = stackOut_75_0;
                      stackIn_77_1 = stackOut_75_1;
                      stackIn_76_0 = stackOut_75_0;
                      stackIn_76_1 = stackOut_75_1;
                      if (dn.field_k) {
                        break L31;
                      } else {
                        stackOut_76_0 = (w) ((Object) stackIn_76_0);
                        stackOut_76_1 = stackIn_76_1;
                        stackOut_76_2 = 1;
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_78_1 = stackOut_76_1;
                        stackIn_78_2 = stackOut_76_2;
                        break L30;
                      }
                    }
                  }
                }
                stackOut_77_0 = (w) ((Object) stackIn_77_0);
                stackOut_77_1 = stackIn_77_1;
                stackOut_77_2 = 0;
                stackIn_78_0 = stackOut_77_0;
                stackIn_78_1 = stackOut_77_1;
                stackIn_78_2 = stackOut_77_2;
                break L30;
              }
              L32: {
                L33: {
                  ((w) (Object) stackIn_78_0).a(stackIn_78_1 != 0, stackIn_78_2 != 0);
                  stackOut_78_0 = mn.field_e;
                  stackOut_78_1 = 0;
                  stackIn_82_0 = stackOut_78_0;
                  stackIn_82_1 = stackOut_78_1;
                  stackIn_79_0 = stackOut_78_0;
                  stackIn_79_1 = stackOut_78_1;
                  if (!param1) {
                    break L33;
                  } else {
                    stackOut_79_0 = (w) ((Object) stackIn_79_0);
                    stackOut_79_1 = stackIn_79_1;
                    stackIn_82_0 = stackOut_79_0;
                    stackIn_82_1 = stackOut_79_1;
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    if (param2) {
                      break L33;
                    } else {
                      stackOut_80_0 = (w) ((Object) stackIn_80_0);
                      stackOut_80_1 = stackIn_80_1;
                      stackIn_82_0 = stackOut_80_0;
                      stackIn_82_1 = stackOut_80_1;
                      stackIn_81_0 = stackOut_80_0;
                      stackIn_81_1 = stackOut_80_1;
                      if (!dn.field_k) {
                        break L33;
                      } else {
                        stackOut_81_0 = (w) ((Object) stackIn_81_0);
                        stackOut_81_1 = stackIn_81_1;
                        stackOut_81_2 = 1;
                        stackIn_83_0 = stackOut_81_0;
                        stackIn_83_1 = stackOut_81_1;
                        stackIn_83_2 = stackOut_81_2;
                        break L32;
                      }
                    }
                  }
                }
                stackOut_82_0 = (w) ((Object) stackIn_82_0);
                stackOut_82_1 = stackIn_82_1;
                stackOut_82_2 = 0;
                stackIn_83_0 = stackOut_82_0;
                stackIn_83_1 = stackOut_82_1;
                stackIn_83_2 = stackOut_82_2;
                break L32;
              }
              ((w) (Object) stackIn_83_0).a(stackIn_83_1 != 0, stackIn_83_2 != 0);
              je.field_f.field_h.b(false);
              stackOut_83_0 = param3;
              stackIn_84_0 = stackOut_83_0;
              break L1;
            }
            L34: {
              if (stackIn_84_0 == 48) {
                break L34;
              } else {
                vg.a(49, 2, 67);
                break L34;
              }
            }
            L35: {
              if (g.field_N == null) {
                break L35;
              } else {
                L36: {
                  if (ma.field_G.field_ob != 0) {
                    ul.a(param0, param3 ^ 52);
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (-1 == (nn.field_a.field_ob ^ -1)) {
                    break L37;
                  } else {
                    L38: {
                      if (fj.field_h) {
                        break L38;
                      } else {
                        th.a(param0, true);
                        if (var12 == 0) {
                          break L37;
                        } else {
                          break L38;
                        }
                      }
                    }
                    ji.c(param0, 1);
                    break L37;
                  }
                }
                mc.a(g.field_N, true, param0, (byte) -127);
                break L35;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var4), "vg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0) {
        this.field_d = param0 ? true : false;
    }

    final static ji a(int param0, int param1) {
        if (param1 <= 20) {
            field_G = (int[]) null;
        }
        return kc.a(true, 1, param0, false, false, false);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        var5 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((this.field_l ^ -1) >= (var5 ^ -1)) {
                break L2;
              } else {
                this.field_J[var5] = (short)(this.field_J[var5] + param1);
                this.field_o[var5] = (short)(this.field_o[var5] + param2);
                this.field_e[var5] = (short)(this.field_e[var5] + param3);
                var5++;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (param0 <= -62) {
                break L3;
              } else {
                this.field_B = (byte) 59;
                break L3;
              }
            }
            this.a(false);
            break L1;
          }
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        var7 = 19 % ((68 - param2) / 34);
        var6 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((this.field_l ^ -1) >= (var6 ^ -1)) {
                break L2;
              } else {
                this.field_J[var6] = (short)(this.field_J[var6] * param1 / param4);
                this.field_o[var6] = (short)(param0 * this.field_o[var6] / param4);
                this.field_e[var6] = (short)(this.field_e[var6] * param3 / param4);
                var6++;
                if (var8 != 0) {
                  break L1;
                } else {
                  if (var8 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.a(false);
            break L1;
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_I = null;
        int var1 = 0 / ((10 - param0) / 39);
        field_s = null;
        field_p = null;
        field_h = null;
        field_x = null;
        field_G = null;
        field_E = null;
    }

    vg() {
        this.field_d = false;
        this.field_B = (byte) 0;
    }

    static {
        field_s = "Chat is currently disabled.";
        field_I = new String[16];
        field_G = new int[8192];
        field_p = "Only show lobby chat from my friends";
    }
}
