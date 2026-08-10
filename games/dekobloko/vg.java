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
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
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
            if (var8 >= this.field_l) {
              this.field_f = var5;
              this.field_H = var2;
              this.field_i = var7;
              this.field_a = var4;
              this.field_n = var6;
              this.field_b = var3;
              return;
            } else {
              L2: {
                var9 = this.field_J[var8];
                var10 = this.field_o[var8];
                if (var9 <= var5) {
                  break L2;
                } else {
                  var5 = var9;
                  break L2;
                }
              }
              L3: {
                var11 = this.field_e[var8];
                if (var9 < var2) {
                  var2 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var10 > var6) {
                  var6 = var10;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var10 < var3) {
                  var3 = var10;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var7 < var11) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
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
        int stackIn_10_0 = 0;
        w stackIn_23_0 = null;
        w stackIn_24_0 = null;
        String stackIn_24_1 = null;
        w stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        w stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        String stackIn_27_2 = null;
        String stackIn_55_0 = null;
        w stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        w stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        w stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        w stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        w stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        w stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        RuntimeException decompiledCaughtException = null;
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
        int var13 = 0;
        w var15 = null;
        String var16 = null;
        w var17 = null;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              qf.a(bf.field_r, 109);
              if (g.field_N == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    fh.field_d.field_N = 0;
                    var15 = fh.field_d;
                    var17 = var15;
                    var17.field_mb = 0;
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
                      break L3;
                    } else {
                      if ((b.field_P[0] ^ -1) != -3) {
                        break L3;
                      } else {
                        var8 = 0;
                        break L2;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (b.field_P.length <= var10) {
                        break L5;
                      } else {
                        L6: {
                          if (-1 == (kk.field_l[var10 / 8] & 1 << (var10 & 7) ^ -1)) {
                            stackIn_10_0 = 0;
                            break L6;
                          } else {
                            stackIn_10_0 = 1;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_10_0;
                          if (var11_int != 0) {
                            var9_int++;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if ((b.field_P[var10] ^ -1) != -3) {
                              var8 = 1;
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (0 != var9_int) {
                      break L2;
                    } else {
                      var8 = 1;
                      break L2;
                    }
                  }
                }
                nn.field_a.field_Hb = true;
                if (fj.field_h) {
                  L9: {
                    ma.field_G.field_Hb = false;
                    cl.field_n.field_Y = im.field_c;
                    if (var8 == 0) {
                      stackIn_55_0 = wk.field_j;
                      break L9;
                    } else {
                      stackIn_55_0 = hc.field_e;
                      break L9;
                    }
                  }
                  L10: {
                    var16 = stackIn_55_0;
                    var9 = var16;
                    var9 = var16;
                    var9 = var16;
                    var10 = tg.field_i.field_J.a(var16) - -(3 * tg.field_i.field_J.a('.'));
                    tg.field_i.field_X = 0;
                    tg.field_i.field_ub = (-var10 + tg.field_i.field_mb) / 2;
                    if (-17 != (48 & oe.field_G ^ -1)) {
                      break L10;
                    } else {
                      var9 = var16 + ".";
                      break L10;
                    }
                  }
                  L11: {
                    if ((oe.field_G & 48 ^ -1) != -33) {
                      break L11;
                    } else {
                      var9 = (String) (var9) + "..";
                      break L11;
                    }
                  }
                  L12: {
                    if ((48 & oe.field_G) != 48) {
                      break L12;
                    } else {
                      var9 = (String) (var9) + "...";
                      break L12;
                    }
                  }
                  tg.field_i.field_Y = (String) (var9);
                  nn.field_a.field_Y = fc.field_g.toUpperCase();
                  break L1;
                } else {
                  L13: {
                    stackIn_23_0 = nn.field_a;

                    if (var8 != 0) {
                      stackIn_24_0 = (w) ((Object) stackIn_23_0);
                      stackIn_24_1 = wg.field_g;
                      break L13;
                    } else {
                      stackIn_24_0 = (w) ((Object) stackIn_23_0);
                      stackIn_24_1 = kd.field_r;
                      break L13;
                    }
                  }
                  L14: {
                    stackIn_24_0.field_Y = ((String) (Object) stackIn_24_1).toUpperCase();
                    stackIn_26_0 = cl.field_n;

                    stackIn_26_1 = 94;

                    if (var8 == 0) {
                      stackIn_27_0 = (w) ((Object) stackIn_26_0);
                      stackIn_27_1 = stackIn_26_1;
                      stackIn_27_2 = wd.field_e;
                      break L14;
                    } else {
                      stackIn_27_0 = (w) ((Object) stackIn_26_0);
                      stackIn_27_1 = stackIn_26_1;
                      stackIn_27_2 = af.field_c;
                      break L14;
                    }
                  }
                  L15: {
                    stackIn_27_0.field_Y = cm.a((byte) stackIn_27_1, stackIn_27_2, new String[]{nn.field_a.field_Y});
                    ma.field_G.field_Hb = true;
                    tg.field_i.field_Y = kh.field_b;
                    ve.field_ac = true;
                    if (bc.field_D == null) {
                      break L15;
                    } else {
                      L16: {
                        gd.field_b = false;
                        if (km.field_D == null) {
                          km.field_D = new byte[j.field_b];
                          rd.field_c = new boolean[j.field_b];
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      ve.field_ac = false;
                      var13 = 0;
                      var9_int = var13;
                      L17: while (true) {
                        if (var13 >= j.field_b) {
                          uc.a(-1, true, -1, 0, -1, j.field_b, g.field_N, false);
                          if (2 > te.field_p) {
                            break L15;
                          } else {
                            if (!bj.field_d[12]) {
                              break L15;
                            } else {
                              ve.field_ac = true;
                              break L15;
                            }
                          }
                        } else {
                          rd.field_c[var13] = false;
                          var13++;
                          continue L17;
                        }
                      }
                    }
                  }
                  if (!ve.field_ac) {
                    nn.field_a.field_Hb = false;
                    if (!nn.field_a.field_Kb) {
                      break L1;
                    } else {
                      L18: {
                        var9 = null;
                        if (gd.field_b) {
                          var9 = "<col=A00000>" + hb.field_Pb + "</col>";
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      var10 = 0;
                      L19: while (true) {
                        if (j.field_b <= var10) {
                          sl.field_g = "<col=A00000>" + lk.field_i + "<br>" + hb.field_Tb + (String) (var9);
                          break L1;
                        } else {
                          if (rd.field_c[var10]) {
                            L20: {
                              var11_ref = "<col=A00000>" + pa.field_db[var10] + "</col>";
                              var9 = var11_ref;
                              var9 = var11_ref;
                              if (var9 != null) {
                                var9 = (String) (var9) + ", " + var11_ref;
                                break L20;
                              } else {
                                var9 = var11_ref;
                                break L20;
                              }
                            }
                            var10++;
                            continue L19;
                          } else {
                            var10++;
                            continue L19;
                          }
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            L21: {
              L22: {
                stackIn_66_0 = ee.field_i;

                stackIn_66_1 = 0;

                if (!param1) {
                  break L22;
                } else {
                  stackIn_66_0 = (w) ((Object) stackIn_66_0);

                  if (param2) {
                    break L22;
                  } else {
                    stackIn_66_0 = (w) ((Object) stackIn_66_0);

                    if (dn.field_k) {
                      break L22;
                    } else {
                      stackIn_67_0 = (w) ((Object) stackIn_66_0);
                      stackIn_67_1 = stackIn_66_1;
                      stackIn_67_2 = 1;
                      break L21;
                    }
                  }
                }
              }
              stackIn_67_0 = (w) ((Object) stackIn_66_0);
              stackIn_67_1 = stackIn_66_1;
              stackIn_67_2 = 0;
              break L21;
            }
            L23: {
              L24: {
                ((w) (Object) stackIn_67_0).a(stackIn_67_1 != 0, stackIn_67_2 != 0);
                stackIn_71_0 = oh.field_d;

                stackIn_71_1 = 0;

                if (!param1) {
                  break L24;
                } else {
                  stackIn_71_0 = (w) ((Object) stackIn_71_0);

                  if (param2) {
                    break L24;
                  } else {
                    stackIn_71_0 = (w) ((Object) stackIn_71_0);

                    if (dn.field_k) {
                      break L24;
                    } else {
                      stackIn_72_0 = (w) ((Object) stackIn_71_0);
                      stackIn_72_1 = stackIn_71_1;
                      stackIn_72_2 = 1;
                      break L23;
                    }
                  }
                }
              }
              stackIn_72_0 = (w) ((Object) stackIn_71_0);
              stackIn_72_1 = stackIn_71_1;
              stackIn_72_2 = 0;
              break L23;
            }
            L25: {
              L26: {
                ((w) (Object) stackIn_72_0).a(stackIn_72_1 != 0, stackIn_72_2 != 0);
                stackIn_76_0 = mn.field_e;

                stackIn_76_1 = 0;

                if (!param1) {
                  break L26;
                } else {
                  stackIn_76_0 = (w) ((Object) stackIn_76_0);

                  if (param2) {
                    break L26;
                  } else {
                    stackIn_76_0 = (w) ((Object) stackIn_76_0);

                    if (!dn.field_k) {
                      break L26;
                    } else {
                      stackIn_77_0 = (w) ((Object) stackIn_76_0);
                      stackIn_77_1 = stackIn_76_1;
                      stackIn_77_2 = 1;
                      break L25;
                    }
                  }
                }
              }
              stackIn_77_0 = (w) ((Object) stackIn_76_0);
              stackIn_77_1 = stackIn_76_1;
              stackIn_77_2 = 0;
              break L25;
            }
            L27: {
              ((w) (Object) stackIn_77_0).a(stackIn_77_1 != 0, stackIn_77_2 != 0);
              je.field_f.field_h.b(false);
              if (param3 == 48) {
                break L27;
              } else {
                vg.a(49, 2, 67);
                break L27;
              }
            }
            L28: {
              if (g.field_N == null) {
                break L28;
              } else {
                L29: {
                  if (ma.field_G.field_ob != 0) {
                    ul.a(param0, param3 ^ 52);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (-1 == (nn.field_a.field_ob ^ -1)) {
                    break L30;
                  } else {
                    if (fj.field_h) {
                      ji.c(param0, 1);
                      break L30;
                    } else {
                      th.a(param0, true);
                      break L30;
                    }
                  }
                }
                mc.a(g.field_N, true, param0, (byte) -127);
                break L28;
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
        int var6 = client.field_A ? 1 : 0;
        for (var5 = 0; this.field_l > var5; var5++) {
            this.field_J[var5] = (short)(this.field_J[var5] + param1);
            this.field_o[var5] = (short)(this.field_o[var5] + param2);
            this.field_e[var5] = (short)(this.field_e[var5] + param3);
        }
        if (param0 > -62) {
            this.field_B = (byte) 59;
        }
        this.a(false);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var8 = client.field_A ? 1 : 0;
        int var7 = 19 % ((68 - param2) / 34);
        for (var6 = 0; this.field_l > var6; var6++) {
            this.field_J[var6] = (short)(this.field_J[var6] * param1 / param4);
            this.field_o[var6] = (short)(param0 * this.field_o[var6] / param4);
            this.field_e[var6] = (short)(this.field_e[var6] * param3 / param4);
        }
        this.a(false);
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
