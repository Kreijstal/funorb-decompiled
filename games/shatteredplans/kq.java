/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;
import java.applet.Applet;

final class kq {
    private qh field_nb;
    private jh field_S;
    private int field_b;
    private jh field_g;
    private jh field_bb;
    private qh field_j;
    private String field_P;
    private int field_x;
    private jh field_N;
    private jh field_db;
    private os field_k;
    private String[] field_ab;
    private os field_F;
    private int field_D;
    private ub field_E;
    private int[][] field_G;
    private int field_u;
    private os field_M;
    private int[][] field_q;
    static bi field_R;
    private boolean field_Y;
    private os field_V;
    private boolean field_I;
    private qh field_J;
    static String field_L;
    private qr field_O;
    private jh field_a;
    private int field_w;
    private qh field_cb;
    private bi field_T;
    private boolean field_v;
    private qh field_e;
    private String[][] field_l;
    private os field_m;
    private os field_lb;
    private int[][] field_C;
    static qr field_h;
    private String field_r;
    private int field_U;
    private int field_fb;
    private int field_jb;
    private int[] field_p;
    private int[][] field_Z;
    private pf field_B;
    private int[] field_ob;
    private boolean field_ib;
    jh field_X;
    jh field_d;
    private jh field_mb;
    private os field_K;
    private bi field_eb;
    private boolean[] field_z;
    private jh field_f;
    private int field_H;
    private jh field_gb;
    private km field_s;
    private String field_o;
    private int field_kb;
    private jh field_n;
    static String field_i;
    static jo field_A;
    private pf field_y;
    private jh field_W;
    private int field_Q;
    private jh field_hb;
    private om field_t;
    static int[] field_c;

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        em var3_ref = null;
        ad var3_ref2 = null;
        int var4 = 0;
        jh var5 = null;
        qk var6 = null;
        sd var7 = null;
        String var8 = null;
        int var9 = 0;
        StringBuilder stackIn_17_0 = null;
        StringBuilder stackIn_19_0 = null;
        StringBuilder stackIn_21_0 = null;
        StringBuilder stackIn_22_0 = null;
        String stackIn_22_1 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_16_0 = null;
        StringBuilder stackOut_21_0 = null;
        String stackOut_21_1 = null;
        StringBuilder stackOut_17_0 = null;
        StringBuilder stackOut_19_0 = null;
        String stackOut_19_1 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((kq) this).field_s.field_m != 2) {
                break L1;
              } else {
                if (param1 != 2) {
                  var3_ref = (em) (Object) ((kq) this).field_e.field_x;
                  var4 = 0;
                  L2: while (true) {
                    if (~var3_ref.field_d.length >= ~var4) {
                      break L1;
                    } else {
                      L3: {
                        var5 = var3_ref.field_d[var4];
                        var6 = var3_ref.field_i[var4];
                        var7 = (sd) var5.field_h;
                        if (!var5.f(244874369)) {
                          break L3;
                        } else {
                          L4: {
                            var5.e((byte) 37);
                            if (0 != var7.field_x) {
                              L5: {
                                stackOut_16_0 = new StringBuilder().append(hd.field_j).append(" ");
                                stackIn_21_0 = stackOut_16_0;
                                stackIn_17_0 = stackOut_16_0;
                                if (var7.field_x != 1) {
                                  stackOut_21_0 = (StringBuilder) (Object) stackIn_21_0;
                                  stackOut_21_1 = re.a(d.field_c, 4371, new String[1]);
                                  stackIn_22_0 = stackOut_21_0;
                                  stackIn_22_1 = stackOut_21_1;
                                  break L5;
                                } else {
                                  stackOut_17_0 = (StringBuilder) (Object) stackIn_17_0;
                                  stackIn_19_0 = stackOut_17_0;
                                  stackOut_19_0 = (StringBuilder) (Object) stackIn_19_0;
                                  stackOut_19_1 = ad.field_a;
                                  stackIn_22_0 = stackOut_19_0;
                                  stackIn_22_1 = stackOut_19_1;
                                  break L5;
                                }
                              }
                              var8 = stackIn_22_1;
                              break L4;
                            } else {
                              var8 = pe.field_F;
                              break L4;
                            }
                          }
                          var6.field_o = var8;
                          var5.field_o = var8;
                          break L3;
                        }
                      }
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            ((kq) this).field_s.field_m = param1;
            var3_int = 0;
            L6: while (true) {
              if (~var3_int <= ~((kq) this).field_s.field_z.field_z.length) {
                L7: {
                  if (param0 <= -70) {
                    break L7;
                  } else {
                    ((kq) this).field_P = null;
                    break L7;
                  }
                }
                L8: {
                  var3_ref2 = (ad) (Object) ((kq) this).field_k.field_v;
                  var3_ref2.field_e.a(-2948, (bi) null);
                  if (((kq) this).field_s.field_z.field_T != -1) {
                    break L8;
                  } else {
                    if (!((kq) this).field_s.field_L) {
                      var4 = param1;
                      if (var4 != 0) {
                        if (var4 == 1) {
                          ((kq) this).a(10, 0, gi.field_b);
                          break L8;
                        } else {
                          if (var4 == 2) {
                            ((kq) this).a(10, 0, re.a(wp.field_c, 4371, new String[2]));
                            break L8;
                          } else {
                            if (var4 == 3) {
                              ((kq) this).a(10, 0, ol.field_l);
                              break L8;
                            } else {
                              if (4 != var4) {
                                if (5 == var4) {
                                  ((kq) this).a(10, 0, li.field_e);
                                  break L8;
                                } else {
                                  if (6 != var4) {
                                    if (7 != var4) {
                                      ((kq) this).a(10, 0, (String) null);
                                      break L8;
                                    } else {
                                      ((kq) this).a(10, 0, ml.field_k);
                                      break L8;
                                    }
                                  } else {
                                    ((kq) this).a(10, 0, i.field_f);
                                    break L8;
                                  }
                                }
                              } else {
                                ((kq) this).a(10, 0, mr.field_c);
                                break L8;
                              }
                            }
                          }
                        }
                      } else {
                        ((kq) this).a(10, 0, ub.field_Bb);
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                break L0;
              } else {
                ((kq) this).field_s.field_z.field_z[var3_int] = 0;
                var3_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "kq.TA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ln[] var3_array = null;
        int var4 = 0;
        ln var5 = null;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        fs stackIn_47_0 = null;
        fs stackIn_47_1 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_45_0 = null;
        fs stackOut_45_1 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((kq) this).field_s.a(param0, 24);
            L1: {
              var3_int = param0;
              if (var3_int == 0) {
                ((kq) this).a(-118, 3);
                var3_array = ((kq) this).field_s.field_P.field_g.field_e;
                var4 = 0;
                L2: while (true) {
                  if (~var4 <= ~var3_array.length) {
                    break L1;
                  } else {
                    L3: {
                      var5 = var3_array[var4];
                      if (var5.field_y != ((kq) this).field_s.field_n) {
                        break L3;
                      } else {
                        if (!var5.field_u) {
                          ((kq) this).field_s.field_z.field_z[var5.field_p] = 2;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4++;
                    continue L2;
                  }
                }
              } else {
                if (var3_int == 1) {
                  ((kq) this).a(-103, 4);
                  var3_array = ((kq) this).field_s.field_P.field_g.field_e;
                  var4 = 0;
                  L4: while (true) {
                    if (~var3_array.length >= ~var4) {
                      break L1;
                    } else {
                      L5: {
                        var5 = var3_array[var4];
                        if (((kq) this).field_s.field_n != var5.field_y) {
                          break L5;
                        } else {
                          if (var5.field_L == 0) {
                            ((kq) this).field_s.field_z.field_z[var5.field_p] = 2;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var4++;
                      continue L4;
                    }
                  }
                } else {
                  if (var3_int == 2) {
                    ((kq) this).a(-102, 5);
                    var3_array = ((kq) this).field_s.field_P.field_g.field_e;
                    var4 = 0;
                    L6: while (true) {
                      if (var4 >= var3_array.length) {
                        break L1;
                      } else {
                        var5 = var3_array[var4];
                        stackOut_45_0 = var5.field_y;
                        stackOut_45_1 = ((kq) this).field_s.field_n;
                        stackIn_47_0 = stackOut_45_0;
                        stackIn_47_1 = stackOut_45_1;
                        L7: {
                          if (stackIn_47_0 == stackIn_47_1) {
                            break L7;
                          } else {
                            L8: {
                              if (null == var5.field_y) {
                                break L8;
                              } else {
                                if (!((kq) this).field_s.field_n.field_h[var5.field_y.field_x]) {
                                  break L8;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var6 = var5.field_D;
                            var7 = 0;
                            L9: while (true) {
                              if (var6.length <= var7) {
                                break L7;
                              } else {
                                var8 = var6[var7];
                                if (((kq) this).field_s.field_n == var8.field_y) {
                                  ((kq) this).field_s.field_z.field_z[var5.field_p] = 2;
                                  break L7;
                                } else {
                                  var7++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                        var4++;
                        continue L6;
                      }
                    }
                  } else {
                    if (var3_int != 3) {
                      break L1;
                    } else {
                      ((kq) this).a(-111, 6);
                      var3_array = ((kq) this).field_s.field_P.field_g.field_e;
                      var4 = 0;
                      L10: while (true) {
                        if (~var4 <= ~var3_array.length) {
                          break L1;
                        } else {
                          L11: {
                            var5 = var3_array[var4];
                            if (((kq) this).field_s.field_n == var5.field_y) {
                              ((kq) this).field_s.field_z.field_z[var5.field_p] = 2;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var4++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "kq.GA(" + param0 + ',' + 4705 + ')');
        }
    }

    final static void b(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ln[] var2_array = null;
        String var2_ref = null;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_119_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!qj.a(true, (CharSequence) (Object) "stage", (CharSequence) (Object) param0)) {
              if (param1 == 7) {
                if (!param0.equalsIgnoreCase("zoomtohome")) {
                  if (param0.equalsIgnoreCase("closetohome")) {
                    oq.field_a.field_z.a(ho.field_d.field_m.field_q, 126);
                    return;
                  } else {
                    if (!param0.equalsIgnoreCase("zoomtowarning")) {
                      if (!param0.equalsIgnoreCase("zoomOut")) {
                        L1: {
                          if (param0.equalsIgnoreCase("zoom12")) {
                            oq.field_a.field_z.a(oq.field_a.field_P.field_g.field_e[12], 124);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        L2: {
                          if (!param0.equalsIgnoreCase("zoomDerelict")) {
                            break L2;
                          } else {
                            var2_array = oq.field_a.field_P.field_g.field_e;
                            var3 = 0;
                            L3: while (true) {
                              if (var2_array.length <= var3) {
                                break L2;
                              } else {
                                var4 = var2_array[var3];
                                if (var4.field_B >= 6) {
                                  oq.field_a.field_z.a(var4, param1 ^ 121);
                                  break L2;
                                } else {
                                  var3++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                        if (!param0.equalsIgnoreCase("block")) {
                          if (!param0.equalsIgnoreCase("capture1")) {
                            if (!param0.equalsIgnoreCase("showtabs")) {
                              if (param0.equalsIgnoreCase("startai")) {
                                var2_int = 1;
                                L4: while (true) {
                                  if (var2_int >= oq.field_a.field_s.length) {
                                    return;
                                  } else {
                                    oq.field_a.field_s[var2_int].a(true, -6861);
                                    var2_int++;
                                    continue L4;
                                  }
                                }
                              } else {
                                if (qj.a(true, (CharSequence) (Object) "enable", (CharSequence) (Object) param0)) {
                                  L5: {
                                    var2_ref = param0.substring(7).trim();
                                    if (var2_ref.endsWith("Button")) {
                                      oq.field_a.field_Y.a(var2_ref, true, param1 + -15023);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var2_ref.equalsIgnoreCase("animationControls")) {
                                      oq.field_a.field_Y.field_K.field_s = true;
                                      oq.field_a.field_Y.field_N.g(86);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  return;
                                } else {
                                  L7: {
                                    if (qj.a(true, (CharSequence) (Object) "disable", (CharSequence) (Object) param0)) {
                                      var2_ref = param0.substring(8).trim();
                                      if (!var2_ref.endsWith("Button")) {
                                        break L7;
                                      } else {
                                        oq.field_a.field_Y.a(var2_ref, false, param1 ^ -15009);
                                        break L7;
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                  if (qj.a(true, (CharSequence) (Object) "hide", (CharSequence) (Object) param0)) {
                                    var2_ref = param0.substring(4).trim();
                                    int discarded$2 = 31;
                                    oq.field_a.field_Y.a(var2_ref, false);
                                    return;
                                  } else {
                                    if (qj.a(true, (CharSequence) (Object) "show", (CharSequence) (Object) param0)) {
                                      var2_ref = param0.substring(4).trim();
                                      int discarded$3 = 31;
                                      oq.field_a.field_Y.a(var2_ref, true);
                                      return;
                                    } else {
                                      L8: {
                                        if (qj.a(true, (CharSequence) (Object) "highlight", (CharSequence) (Object) param0)) {
                                          var2_ref = param0.substring(10).trim();
                                          if (var2_ref.equalsIgnoreCase("wormholes")) {
                                            er.field_g = true;
                                            return;
                                          } else {
                                            if (!var2_ref.equalsIgnoreCase("borders")) {
                                              if (!var2_ref.equalsIgnoreCase("garrison")) {
                                                if (var2_ref.equalsIgnoreCase("resources")) {
                                                  td.field_L = true;
                                                  return;
                                                } else {
                                                  if (!var2_ref.equalsIgnoreCase("productionHammer")) {
                                                    if (!var2_ref.equalsIgnoreCase("ready")) {
                                                      break L8;
                                                    } else {
                                                      ph.field_g = true;
                                                      decompiledRegionSelector0 = 0;
                                                      break L0;
                                                    }
                                                  } else {
                                                    se.field_k = true;
                                                    return;
                                                  }
                                                }
                                              } else {
                                                me.field_j = true;
                                                return;
                                              }
                                            } else {
                                              tl.field_u = true;
                                              return;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                      decompiledRegionSelector0 = 1;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            } else {
                              return;
                            }
                          } else {
                            var2_int = ma.a((CharSequence) (Object) param0.substring(9), 2);
                            id.field_d = oq.field_a.field_P.field_g.field_e[var2_int];
                            uq.field_m.a(pa.a(id.field_d, param1 ^ -9), 27275, "capture1");
                            return;
                          }
                        } else {
                          is.field_b = true;
                          return;
                        }
                      } else {
                        oq.field_a.field_z.c(false);
                        return;
                      }
                    } else {
                      var2_array = oq.field_a.field_P.field_g.field_e;
                      var3 = 0;
                      L9: while (true) {
                        if (~var2_array.length >= ~var3) {
                          return;
                        } else {
                          L10: {
                            var4 = var2_array[var3];
                            if (var4.field_y != ho.field_d) {
                              break L10;
                            } else {
                              if (!oq.field_a.field_V[var4.field_p]) {
                                oq.field_a.field_z.a(92, var4, 300.0f);
                                return;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var3++;
                          continue L9;
                        }
                      }
                    }
                  }
                } else {
                  oq.field_a.field_z.a(39, ho.field_d.field_m.field_q, 200.0f);
                  return;
                }
              } else {
                return;
              }
            } else {
              var2_int = Integer.parseInt(param0.substring(6));
              no.a(-92, var2_int);
              oq.field_a.a(2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_115_0 = (RuntimeException) var2;
            stackOut_115_1 = new StringBuilder().append("kq.U(");
            stackIn_118_0 = stackOut_115_0;
            stackIn_118_1 = stackOut_115_1;
            stackIn_116_0 = stackOut_115_0;
            stackIn_116_1 = stackOut_115_1;
            if (param0 == null) {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "null";
              stackIn_119_0 = stackOut_118_0;
              stackIn_119_1 = stackOut_118_1;
              stackIn_119_2 = stackOut_118_2;
              break L11;
            } else {
              stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
              stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
              stackOut_116_2 = "{...}";
              stackIn_119_0 = stackOut_116_0;
              stackIn_119_1 = stackOut_116_1;
              stackIn_119_2 = stackOut_116_2;
              break L11;
            }
          }
          throw r.a((Throwable) (Object) stackIn_119_0, stackIn_119_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, fs param1) {
        RuntimeException var3 = null;
        ph var3_ref = null;
        int var4 = 0;
        fs var5 = null;
        fe var5_ref = null;
        int var6 = 0;
        ff[] var6_ref_ff__ = null;
        lp var7 = null;
        int var8_int = 0;
        String var8 = null;
        vd var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        fe[] stackIn_17_0 = null;
        fe[] stackIn_19_0 = null;
        fe[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ff[][] stackIn_21_0 = null;
        ff[][] stackIn_23_0 = null;
        ff[][] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        lp[] stackIn_25_0 = null;
        lp[] stackIn_27_0 = null;
        lp[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_78_0 = 0;
        String stackIn_86_0 = null;
        fs stackIn_105_0 = null;
        int stackIn_112_0 = 0;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_124_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        fe[] stackOut_16_0 = null;
        fe[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        fe[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ff[][] stackOut_20_0 = null;
        ff[][] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        ff[][] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        lp[] stackOut_24_0 = null;
        lp[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        lp[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        String stackOut_85_0 = null;
        String stackOut_83_0 = null;
        int stackOut_77_0 = 0;
        int stackOut_75_0 = 0;
        fs stackOut_104_0 = null;
        fs stackOut_102_0 = null;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 <= -10) {
              L1: {
                if (!((kq) this).field_s.field_W) {
                  break L1;
                } else {
                  if (kb.field_x >= 6) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
              L2: {
                L3: {
                  var3_ref = (ph) (Object) ((kq) this).field_J.field_x;
                  if (((kq) this).field_s.field_n == null) {
                    break L3;
                  } else {
                    if (param1 == ((kq) this).field_s.field_n) {
                      break L3;
                    } else {
                      L4: {
                        if (param1.field_x >= ((kq) this).field_s.field_n.field_x) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L4;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_16_0 = stackOut_13_0;
                          break L4;
                        }
                      }
                      L5: {
                        var4 = stackIn_16_0;
                        stackOut_16_0 = var3_ref.field_i;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var4 == 0) {
                          stackOut_19_0 = (fe[]) (Object) stackIn_19_0;
                          stackOut_19_1 = param1.field_x - 1;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L5;
                        } else {
                          stackOut_17_0 = (fe[]) (Object) stackIn_17_0;
                          stackOut_17_1 = param1.field_x;
                          stackIn_20_0 = stackOut_17_0;
                          stackIn_20_1 = stackOut_17_1;
                          break L5;
                        }
                      }
                      L6: {
                        var5_ref = stackIn_20_0[stackIn_20_1];
                        stackOut_20_0 = var3_ref.field_f;
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var4 == 0) {
                          stackOut_23_0 = (ff[][]) (Object) stackIn_23_0;
                          stackOut_23_1 = param1.field_x;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          break L6;
                        } else {
                          stackOut_21_0 = (ff[][]) (Object) stackIn_21_0;
                          stackOut_21_1 = 1 + param1.field_x;
                          stackIn_24_0 = stackOut_21_0;
                          stackIn_24_1 = stackOut_21_1;
                          break L6;
                        }
                      }
                      L7: {
                        var6_ref_ff__ = stackIn_24_0[stackIn_24_1];
                        stackOut_24_0 = var3_ref.field_h;
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var4 != 0) {
                          stackOut_27_0 = (lp[]) (Object) stackIn_27_0;
                          stackOut_27_1 = 1 + param1.field_x;
                          stackIn_28_0 = stackOut_27_0;
                          stackIn_28_1 = stackOut_27_1;
                          break L7;
                        } else {
                          stackOut_25_0 = (lp[]) (Object) stackIn_25_0;
                          stackOut_25_1 = param1.field_x;
                          stackIn_28_0 = stackOut_25_0;
                          stackIn_28_1 = stackOut_25_1;
                          break L7;
                        }
                      }
                      L8: {
                        var7 = stackIn_28_0[stackIn_28_1];
                        if (0 != (((kq) this).field_s.field_P.field_w & 1 << param1.field_x)) {
                          L9: {
                            if ((((kq) this).field_s.field_P.field_f & 1 << param1.field_x) == 0) {
                              stackOut_85_0 = of.field_d;
                              stackIn_86_0 = stackOut_85_0;
                              break L9;
                            } else {
                              stackOut_83_0 = he.field_l;
                              stackIn_86_0 = stackOut_83_0;
                              break L9;
                            }
                          }
                          var8 = stackIn_86_0;
                          var5_ref.a((byte) 122, 0, var8);
                          int discarded$3 = 0;
                          var6_ref_ff__[0].a(-2948, ne.a(-1));
                          var9_int = 1;
                          L10: while (true) {
                            if (~var9_int <= ~var6_ref_ff__.length) {
                              var7.field_o = null;
                              var9 = (vd) (Object) var7.field_l.d(0);
                              L11: while (true) {
                                if (null == var9) {
                                  break L8;
                                } else {
                                  var9.field_o = null;
                                  var9 = (vd) (Object) var7.field_l.a((byte) -71);
                                  continue L11;
                                }
                              }
                            } else {
                              var6_ref_ff__[var9_int].a(-2948, wm.a(-1, 0));
                              var9_int++;
                              continue L10;
                            }
                          }
                        } else {
                          L12: {
                            if (param1.field_h[((kq) this).field_s.field_n.field_x]) {
                              var8_int = ((kq) this).field_s.field_n.field_k;
                              var5_ref.a((byte) -83, 9386040, re.a(jb.field_e, 4371, new String[1]));
                              var7.field_o = null;
                              var9 = (vd) (Object) var7.field_l.d(0);
                              L13: while (true) {
                                if (var9 == null) {
                                  break L12;
                                } else {
                                  var9.field_o = null;
                                  var9 = (vd) (Object) var7.field_l.a((byte) -71);
                                  continue L13;
                                }
                              }
                            } else {
                              L14: {
                                if ((1 << ((kq) this).field_s.field_n.field_x & param1.field_A) != 0) {
                                  var5_ref.a((byte) -109, 3375155, fb.field_gc);
                                  var7.field_o = re.a(mf.field_u, 4371, new String[1]);
                                  var9 = (vd) (Object) var7.field_l.d(0);
                                  L15: while (true) {
                                    if (var9 == null) {
                                      break L14;
                                    } else {
                                      var9.field_o = re.a(mf.field_u, 4371, new String[1]);
                                      var9 = (vd) (Object) var7.field_l.a((byte) -71);
                                      continue L15;
                                    }
                                  }
                                } else {
                                  if (0 != (1 << param1.field_x & ((kq) this).field_s.field_n.field_A)) {
                                    var5_ref.a((byte) -54, 3375155, il.field_hb);
                                    var7.field_o = re.a(gn.field_x, 4371, new String[1]);
                                    var9 = (vd) (Object) var7.field_l.d(0);
                                    L16: while (true) {
                                      if (null == var9) {
                                        break L14;
                                      } else {
                                        var9.field_o = re.a(gn.field_x, 4371, new String[1]);
                                        var9 = (vd) (Object) var7.field_l.a((byte) -71);
                                        continue L16;
                                      }
                                    }
                                  } else {
                                    var5_ref.a((byte) 2, 3375155, eb.field_e);
                                    var7.field_o = re.a(jg.field_f, 4371, new String[1]);
                                    var9 = (vd) (Object) var7.field_l.d(0);
                                    L17: while (true) {
                                      if (null == var9) {
                                        break L14;
                                      } else {
                                        var9.field_o = re.a(jg.field_f, 4371, new String[1]);
                                        var9 = (vd) (Object) var7.field_l.a((byte) -71);
                                        continue L17;
                                      }
                                    }
                                  }
                                }
                              }
                              var8_int = -1;
                              break L12;
                            }
                          }
                          int discarded$4 = 0;
                          var6_ref_ff__[0].a(-2948, ne.a(var8_int));
                          var9_int = 1;
                          L18: while (true) {
                            if (var6_ref_ff__.length <= var9_int) {
                              break L8;
                            } else {
                              L19: {
                                var10 = -1 + var9_int;
                                if (~((kq) this).field_s.field_n.field_x < ~var10) {
                                  break L19;
                                } else {
                                  var10++;
                                  break L19;
                                }
                              }
                              L20: {
                                if (var10 < param1.field_x) {
                                  break L20;
                                } else {
                                  var10++;
                                  if (~var10 != ~((kq) this).field_s.field_n.field_x) {
                                    break L20;
                                  } else {
                                    var10++;
                                    break L20;
                                  }
                                }
                              }
                              L21: {
                                if (!param1.field_h[var10]) {
                                  stackOut_77_0 = -1;
                                  stackIn_78_0 = stackOut_77_0;
                                  break L21;
                                } else {
                                  stackOut_75_0 = ((kq) this).field_s.field_P.field_v[var10].field_k;
                                  stackIn_78_0 = stackOut_75_0;
                                  break L21;
                                }
                              }
                              var8_int = stackIn_78_0;
                              var6_ref_ff__[var9_int].a(-2948, wm.a(var8_int, 0));
                              var9_int++;
                              continue L18;
                            }
                          }
                        }
                      }
                      break L2;
                    }
                  }
                }
                var4 = 0;
                L22: while (true) {
                  if (var3_ref.field_f[0].length <= var4) {
                    break L2;
                  } else {
                    L23: {
                      if (param1.field_x <= var4) {
                        stackOut_104_0 = ((kq) this).field_s.field_P.field_v[var4 + 1];
                        stackIn_105_0 = stackOut_104_0;
                        break L23;
                      } else {
                        stackOut_102_0 = ((kq) this).field_s.field_P.field_v[var4];
                        stackIn_105_0 = stackOut_102_0;
                        break L23;
                      }
                    }
                    L24: {
                      L25: {
                        var5 = stackIn_105_0;
                        if (!param1.field_h[var5.field_x]) {
                          break L25;
                        } else {
                          if ((((kq) this).field_s.field_P.field_w & 1 << var5.field_x) != 0) {
                            break L25;
                          } else {
                            stackOut_109_0 = var5.field_k;
                            stackIn_112_0 = stackOut_109_0;
                            break L24;
                          }
                        }
                      }
                      stackOut_111_0 = -1;
                      stackIn_112_0 = stackOut_111_0;
                      break L24;
                    }
                    L26: {
                      var6 = stackIn_112_0;
                      if (var4 == 0) {
                        int discarded$5 = 0;
                        var3_ref.field_f[0][var4].a(-2948, ne.a(var6));
                        break L26;
                      } else {
                        var3_ref.field_f[0][var4].a(-2948, wm.a(var6, 0));
                        break L26;
                      }
                    }
                    var4++;
                    continue L22;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var3 = decompiledCaughtException;
            stackOut_120_0 = (RuntimeException) var3;
            stackOut_120_1 = new StringBuilder().append("kq.E(").append(param0).append(',');
            stackIn_123_0 = stackOut_120_0;
            stackIn_123_1 = stackOut_120_1;
            stackIn_121_0 = stackOut_120_0;
            stackIn_121_1 = stackOut_120_1;
            if (param1 == null) {
              stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "null";
              stackIn_124_0 = stackOut_123_0;
              stackIn_124_1 = stackOut_123_1;
              stackIn_124_2 = stackOut_123_2;
              break L27;
            } else {
              stackOut_121_0 = (RuntimeException) (Object) stackIn_121_0;
              stackOut_121_1 = (StringBuilder) (Object) stackIn_121_1;
              stackOut_121_2 = "{...}";
              stackIn_124_0 = stackOut_121_0;
              stackIn_124_1 = stackOut_121_1;
              stackIn_124_2 = stackOut_121_2;
              break L27;
            }
          }
          throw r.a((Throwable) (Object) stackIn_124_0, stackIn_124_2 + ')');
        }
    }

    private final void a(String param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (param0.startsWith("production")) {
                ((kq) this).field_mb.field_s = param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0.startsWith("projects")) {
                ((kq) this).field_S.field_s = param1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0.startsWith("fleets")) {
                ((kq) this).field_W.field_s = param1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0.startsWith("diplomacy")) {
                ((kq) this).field_n.field_s = param1;
                break L4;
              } else {
                break L4;
              }
            }
            if (param2 == -15016) {
              L5: {
                if (!param0.startsWith("victory")) {
                  break L5;
                } else {
                  if (((kq) this).field_g == null) {
                    break L5;
                  } else {
                    ((kq) this).field_g.field_s = param1;
                    break L5;
                  }
                }
              }
              L6: {
                if (param0.startsWith("turn")) {
                  ((kq) this).field_bb.field_s = param1;
                  break L6;
                } else {
                  break L6;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("kq.BB(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        bi var8 = null;
        int[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bi var14 = null;
        int var15 = 0;
        int[][] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20_int = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24_int = 0;
        vd var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33_int = 0;
        String var33 = null;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        bi stackIn_32_0 = null;
        String stackIn_81_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        bi stackOut_31_0 = null;
        bi stackOut_30_0 = null;
        String stackOut_80_0 = null;
        String stackOut_79_0 = null;
        Object stackOut_78_0 = null;
        String stackOut_77_0 = null;
        String stackOut_71_0 = null;
        L0: {
          var40 = ShatteredPlansClient.field_F ? 1 : 0;
          var3_int = 32;
          if (param1 >= 32) {
            break L0;
          } else {
            var3_int = param1;
            break L0;
          }
        }
        L1: {
          var4 = re.a(20, 32, var3_int, 550, 0);
          sn.a(640, 101, 480, 192 - -((-var3_int + 32 << 6) / 32), 0, 0);
          var5 = (640 - var4) / 2;
          var6 = 80;
          var7 = 360;
          if (fj.field_t.field_h != 2) {
            if (fj.field_t.field_h == 1) {
              sn.a(var4, -117, var7, 128 + (-var3_int + 32 << 7) / 32, var5, var6);
              break L1;
            } else {
              if (fj.field_t.field_h == 0) {
                if (var3_int == 32) {
                  gf.d(var5, var6, var4, var7, 855316);
                  break L1;
                } else {
                  gf.c(var5, var6, var4, var7, 855316, (var3_int << 8) / 32);
                  break L1;
                }
              } else {
                break L1;
              }
            }
          } else {
            sn.a(var4, -104, var7, (32 + -var3_int << 7) / 32 + 128, var5, var6);
            var8 = qh.a((bi) null, var6, var4, var5, -1, var7);
            bs.a(var8, 93);
            gf.b(3, 3, 0, 0, var4, var7);
            cg.i(0);
            var8.a(var5, var6, (var3_int << 7) / 32);
            break L1;
          }
        }
        L2: {
          L3: {
            ga.a(var7, var6, var5, (byte) -60, var4);
            var8_array = new int[4];
            gf.a(var8_array);
            gf.d(var5, var6, var5 - -var4, var6 + var7);
            var9 = 0;
            var10 = 0;
            var11 = ((kq) this).field_s.field_P.field_z ? 1 : 0;
            var12 = 1;
            if (var11 == 0) {
              break L3;
            } else {
              if (0 <= ((kq) this).field_s.field_P.field_k) {
                break L3;
              } else {
                stackOut_16_0 = 1;
                stackIn_18_0 = stackOut_16_0;
                break L2;
              }
            }
          }
          stackOut_17_0 = 0;
          stackIn_18_0 = stackOut_17_0;
          break L2;
        }
        L4: {
          var13 = stackIn_18_0;
          if (((kq) this).field_s.field_n == null) {
            break L4;
          } else {
            L5: {
              if (((kq) this).field_s.field_n.field_x != ((kq) this).field_s.field_P.field_k) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L5;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L5;
              }
            }
            L6: {
              L7: {
                var9 = stackIn_23_0;
                if ((((kq) this).field_s.field_P.field_w & 1 << ((kq) this).field_s.field_n.field_x) != 0) {
                  break L7;
                } else {
                  if (!((kq) this).field_s.field_P.field_x.a((byte) 108, ((kq) this).field_s.field_n)) {
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              break L6;
            }
            var10 = stackIn_28_0;
            break L4;
          }
        }
        L8: {
          if (var10 != 0) {
            stackOut_31_0 = dp.field_s;
            stackIn_32_0 = stackOut_31_0;
            break L8;
          } else {
            stackOut_30_0 = ce.field_v;
            stackIn_32_0 = stackOut_30_0;
            break L8;
          }
        }
        L9: {
          L10: {
            var14 = stackIn_32_0;
            var15 = ((kq) this).field_s.field_P.field_r;
            int discarded$2 = 410;
            var16 = this.j();
            var17 = var4 - 40;
            if (((kq) this).field_Q == 0) {
              break L10;
            } else {
              if (null != var16) {
                var18 = 0;
                L11: while (true) {
                  if (var18 >= 240) {
                    break L9;
                  } else {
                    L12: {
                      var19 = var18 + 20 + var6;
                      var20_int = 20 + var5;
                      var21 = -40 + var4;
                      if (var21 > 320) {
                        var21 = 320;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      var22 = 0;
                      if (var21 >= 0) {
                        int discarded$3 = 16403;
                        ml.a(var19, var21, var18, var20_int, var14, var22);
                        gf.f(var20_int, var19, var21, 0, 192);
                        gf.a(var20_int - 1, var19, 16777215);
                        gf.a(var20_int - -var21, var19, 16777215);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var18++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
          }
          var18 = 0;
          L14: while (true) {
            if (var18 >= 240) {
              break L9;
            } else {
              L15: {
                var19 = var18 + (var6 + 20);
                var20_int = 20 + var5;
                var21 = -40 + var4;
                if (320 < var21) {
                  var21 = 320;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                var22 = 0;
                if (var21 < 0) {
                  break L16;
                } else {
                  am.a(var20_int, var18, var14, var22, var21, var19, (byte) -107);
                  gf.a(-1 + var20_int, var19, 16777215);
                  gf.a(var20_int + var21, var19, 16777215);
                  break L16;
                }
              }
              var18++;
              continue L14;
            }
          }
        }
        L17: {
          if (var17 <= 320) {
            break L17;
          } else {
            var17 = 320;
            break L17;
          }
        }
        L18: {
          if (((kq) this).field_Q == 0) {
            break L18;
          } else {
            if (((kq) this).field_Q == 25) {
              break L18;
            } else {
              if (var16 == null) {
                break L18;
              } else {
                var18 = 0;
                L19: while (true) {
                  if (var18 >= 240) {
                    break L18;
                  } else {
                    L20: {
                      var19 = var18 + (var6 + 20);
                      var20_int = var5 + 20;
                      var21 = -40 + var4;
                      if (var21 <= 320) {
                        break L20;
                      } else {
                        var21 = 320;
                        break L20;
                      }
                    }
                    L21: {
                      var22 = 0;
                      if (var21 < 0) {
                        break L21;
                      } else {
                        ld.a(var18, var20_int, var21, var19, -68, var22, -((kq) this).field_Q + 256, var14);
                        break L21;
                      }
                    }
                    var18++;
                    continue L19;
                  }
                }
              }
            }
          }
        }
        L22: {
          gf.f(20 + var5 - 1, 20 + var6 + -1, 322, 16777215);
          gf.f(-1 + (20 + var5), 20 + var6 + 240, 322, 16777215);
          var18 = var5 - -320 + 125;
          if (var9 == 0) {
            if (var10 != 0) {
              stackOut_80_0 = (String) field_L;
              stackIn_81_0 = stackOut_80_0;
              break L22;
            } else {
              if (var13 != 0) {
                stackOut_79_0 = ef.field_c;
                stackIn_81_0 = stackOut_79_0;
                break L22;
              } else {
                if (var11 == 0) {
                  stackOut_78_0 = null;
                  stackIn_81_0 = (String) (Object) stackOut_78_0;
                  break L22;
                } else {
                  stackOut_77_0 = fj.field_o;
                  stackIn_81_0 = stackOut_77_0;
                  break L22;
                }
              }
            }
          } else {
            stackOut_71_0 = fj.field_o;
            stackIn_81_0 = stackOut_71_0;
            break L22;
          }
        }
        L23: {
          var20 = stackIn_81_0;
          if (((kq) this).field_s.field_n != null) {
            break L23;
          } else {
            if (var13 == 0) {
              var20 = " ";
              break L23;
            } else {
              break L23;
            }
          }
        }
        mp.field_b.c(var20, var18, 27 + var6, 16777215, -1);
        var21 = -10 + (40 + var5) - -320;
        var22 = 40 + var6;
        var23 = 4 * ((kq) this).field_D;
        var17 = -40 + var4;
        var24_int = 0;
        L24: while (true) {
          if (var24_int >= 4) {
            L25: {
              if (var17 > 320) {
                var17 = 320;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              gf.d(20 + var5, var6 + 20, var17 + (var5 - -20), var6 + 260);
              if (((kq) this).field_Q == 0) {
                break L26;
              } else {
                if (var16 == null) {
                  break L26;
                } else {
                  var24_int = var16[0].length;
                  var25 = 1;
                  var26 = 0;
                  L27: while (true) {
                    if (~var26 <= ~var15) {
                      L28: {
                        var26 = 320;
                        var27 = 222;
                        var21 = var5 + 20;
                        var28 = var27 + (20 + var6);
                        var29 = ((kq) this).field_fb + -1 << 10;
                        if (((kq) this).field_kb == 0) {
                          break L28;
                        } else {
                          var29 = -1024 + re.a(((kq) this).field_H << 10, 32, ((kq) this).field_kb, ((kq) this).field_fb << 10, 0);
                          break L28;
                        }
                      }
                      L29: {
                        if (((kq) this).field_Q == 256) {
                          var30 = 0;
                          L30: while (true) {
                            if (var15 <= var30) {
                              break L29;
                            } else {
                              var19 = ((kq) this).field_s.field_P.field_v[var30].field_s;
                              var31 = var21;
                              var32 = var28 - var27 * var16[var30][0] / var25;
                              var34 = var32;
                              var35 = 1;
                              L31: while (true) {
                                if (var35 >= var24_int) {
                                  var30++;
                                  continue L30;
                                } else {
                                  var36 = var21 + (var35 * var26 << 10) / var29;
                                  var37 = var16[var30][var35];
                                  var33_int = -(var37 * var27 / var25) + var28;
                                  var38 = 0;
                                  L32: while (true) {
                                    if (~var38 <= ~(var36 + -var31)) {
                                      var31 = var36;
                                      var32 = var33_int;
                                      var35++;
                                      continue L31;
                                    } else {
                                      var39 = re.a(var32, var36 - var31, var38, var33_int, 0);
                                      gf.g(-1 + var31 - -var38, var34, var38 + var31, var39, var19);
                                      var34 = var39;
                                      var38++;
                                      continue L32;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var30 = 0;
                          L33: while (true) {
                            if (var30 >= var15) {
                              break L29;
                            } else {
                              var19 = ((kq) this).field_s.field_P.field_v[var30].field_s;
                              var31 = var21;
                              var32 = -(var16[var30][0] * var27 / var25) + var28;
                              var34 = var32;
                              var35 = 1;
                              L34: while (true) {
                                if (~var35 <= ~var24_int) {
                                  var30++;
                                  continue L33;
                                } else {
                                  var36 = var26 * var35 / (var24_int + -1) + var21;
                                  var37 = var16[var30][var35];
                                  var33_int = -(var27 * var37 / var25) + var28;
                                  var38 = 0;
                                  L35: while (true) {
                                    if (~var38 <= ~(var36 - var31)) {
                                      var31 = var36;
                                      var32 = var33_int;
                                      var35++;
                                      continue L34;
                                    } else {
                                      var39 = re.a(var32, -var31 + var36, var38, var33_int, 0);
                                      gf.g(var31 - (-var38 + 1), var34, var31 + var38, var39, var19, ((kq) this).field_Q);
                                      var34 = var39;
                                      var38++;
                                      continue L35;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L36: {
                        var30 = (var24_int - -7) / 8;
                        if (0 != var30) {
                          break L36;
                        } else {
                          var30 = 1;
                          break L36;
                        }
                      }
                      var31 = 0;
                      L37: while (true) {
                        if (var31 >= var24_int) {
                          break L26;
                        } else {
                          L38: {
                            var32 = var21 - -(var26 * var31 / (-1 + var24_int));
                            if (0 == var31 % var30) {
                              L39: {
                                var33 = Integer.toString(var31);
                                var34 = rs.field_Cb.c(var33);
                                var35 = -(var34 >> 1) + var32;
                                if (var31 == 0) {
                                  var35 = var21 + var34 / 2;
                                  break L39;
                                } else {
                                  if (var24_int - 1 != var31) {
                                    break L39;
                                  } else {
                                    var35 = -var34 + var35;
                                    break L39;
                                  }
                                }
                              }
                              rs.field_Cb.d(Integer.toString(var31), var35, 20 + var6 + (var27 - -rs.field_Cb.field_J), 16777215, -1);
                              var34 = 0;
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                          gf.a(var32, 20 + var6, var27, 789516);
                          var31++;
                          continue L37;
                        }
                      }
                    } else {
                      var27 = 0;
                      L40: while (true) {
                        if (var24_int <= var27) {
                          var26++;
                          continue L27;
                        } else {
                          L41: {
                            if (~var16[var26][var27] < ~var25) {
                              var25 = var16[var26][var27];
                              break L41;
                            } else {
                              break L41;
                            }
                          }
                          var27++;
                          continue L40;
                        }
                      }
                    }
                  }
                }
              }
            }
            L42: {
              L43: {
                gf.d(var5, var6, var5 - -var4, var7 + var6);
                if (((kq) this).field_s.field_P.field_z) {
                  break L43;
                } else {
                  if (((kq) this).field_s.field_n == null) {
                    break L42;
                  } else {
                    if ((1 << ((kq) this).field_s.field_n.field_x & ((kq) this).field_s.field_P.field_w) == 0) {
                      break L42;
                    } else {
                      break L43;
                    }
                  }
                }
              }
              rs.field_Cb.c(uo.field_d, var5 + 180, var6 + (var7 + -74), 16777215, -1);
              break L42;
            }
            var24 = (vd) (Object) ((kq) this).field_B.d(0);
            L44: while (true) {
              if (var24 == null) {
                L45: {
                  gf.b(var8_array);
                  if (((kq) this).field_r == null) {
                    break L45;
                  } else {
                    if (((kq) this).field_jb <= 60) {
                      break L45;
                    } else {
                      this.a(false, ((kq) this).field_r);
                      break L45;
                    }
                  }
                }
                return;
              } else {
                var24.a(127);
                var24 = (vd) (Object) ((kq) this).field_B.a((byte) -71);
                continue L44;
              }
            }
          } else {
            this.b(var24_int, var22, var21, 85, var23);
            var23++;
            var22 = var22 + (8 + ((kq) this).field_ob[var24_int]);
            var24_int++;
            continue L24;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        RuntimeException decompiledCaughtException = null;
        var21 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = ((kq) this).field_s.field_P.field_r;
              var7 = ((kq) this).field_G[param4][-1 + var6_int];
              var8 = ((kq) this).field_G[param4][var6_int + -2];
              if (null == ((kq) this).field_s.field_n) {
                break L1;
              } else {
                if (~((kq) this).field_s.field_n.field_x == ~var7) {
                  break L1;
                } else {
                  var8 = ((kq) this).field_s.field_n.field_x;
                  break L1;
                }
              }
            }
            var9 = ((kq) this).field_ob[param0];
            L2: {
              ga.a(var9, param1, param2, (byte) -63, 190);
              rs.field_Cb.d(jo.field_g[param4], 10 + param2, param1 - -rs.field_Cb.field_J, 16777215, -1);
              var10 = 210;
              var11 = var10 / (6 - -var6_int);
              var12 = 2 * var11 + 12;
              var13 = -(var11 * 8) + var10;
              var14 = var9 - 27;
              if (((kq) this).field_p[param0] != 0) {
                var15 = kf.a(((kq) this).field_G[param4], 117);
                var16 = 0;
                L3: while (true) {
                  if (~var6_int >= ~var16) {
                    break L2;
                  } else {
                    L4: {
                      var17 = (var6_int * var14 - (var15[var16] * var14 >> 1)) / var6_int;
                      var18 = (var6_int - var15[var16]) * var14 / var6_int;
                      var19 = (-var12 + ((kq) this).field_ob[param0] << 8) / var13;
                      if (~var16 != ~var7) {
                        break L4;
                      } else {
                        var17 = var14 >> 1;
                        var19 = 256;
                        break L4;
                      }
                    }
                    L5: {
                      if (var16 == var8) {
                        var17 = var14;
                        var19 = 256;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var20 = rs.field_Cb.field_J + param1 - -re.a(var17, 32, ((kq) this).field_p[param0], var18, 0);
                    this.a(param4, var20, var16, var19, (byte) 58, 10 + param2);
                    var16++;
                    continue L3;
                  }
                }
              } else {
                this.a(var7, 2, param4, param2 - -10, rs.field_Cb.field_J + param1 + (var14 >> 1));
                this.a(var8, 2, param4, param2 - -10, param1 - (-rs.field_Cb.field_J + -var14));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var6, "kq.P(" + param0 + ',' + param1 + ',' + param2 + ',' + 85 + ',' + param4 + ')');
        }
    }

    final void o(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((kq) this).field_bb != null) {
                ((kq) this).field_bb.field_p = false;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((kq) this).field_e.field_s = false;
              if (((kq) this).field_j == null) {
                break L2;
              } else {
                ((kq) this).field_j.field_s = false;
                break L2;
              }
            }
            L3: {
              ((kq) this).field_J.field_s = false;
              ((kq) this).field_cb.field_s = false;
              if (param0 == -4956) {
                break L3;
              } else {
                ((kq) this).field_B = null;
                break L3;
              }
            }
            L4: {
              if (null == ((kq) this).field_nb) {
                break L4;
              } else {
                ((kq) this).field_nb.field_s = false;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.T(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        RuntimeException var7 = null;
        fs var7_ref = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7_ref = ((kq) this).field_s.field_P.field_v[param2];
            var8 = var7_ref.field_s;
            rs.field_Cb.c(((kq) this).field_l[param0][param2], param5 + 27, param1, var8, -1, param3);
            rs.field_Cb.d(eh.field_I[((kq) this).field_q[param0][param2]], 37 + param5, param1, var8, -1, param3);
            rs.field_Cb.d(var7_ref.field_t, param5 - -67, param1, var8, -1, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var7, "kq.FB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + 58 + ',' + param5 + ')');
        }
    }

    private final void c() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Integer var10_ref_Integer = null;
        int var11_int = 0;
        String var11 = null;
        jh var12 = null;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ((kq) this).field_b;
              var3 = 32;
              if (var2_int >= 32) {
                break L1;
              } else {
                var3 = var2_int;
                break L1;
              }
            }
            var4 = re.a(20, 32, var3, 550, 0);
            var5 = (-var4 + 640) / 2;
            var6 = 80;
            var7 = -10 + (320 + var5 + 40);
            var8 = var6 + 51;
            var9 = 0;
            L2: while (true) {
              L3: {
                if (4 <= var9) {
                  break L3;
                } else {
                  L4: {
                    var10 = ((kq) this).field_ob[var9];
                    if (~var7 < ~pd.field_k) {
                      break L4;
                    } else {
                      if (var8 > bb.field_b) {
                        break L4;
                      } else {
                        if (190 + var7 <= pd.field_k) {
                          break L4;
                        } else {
                          if (bb.field_b > var8 - -var10) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  var8 = var8 + (var10 - -8);
                  var9++;
                  continue L2;
                }
              }
              L5: {
                boolean discarded$1 = wj.a(((kq) this).field_B, (byte) -112);
                if (dn.field_h == null) {
                  break L5;
                } else {
                  L6: {
                    var10_ref_Integer = (Integer) dn.field_h.field_h;
                    var11_int = var10_ref_Integer.intValue();
                    this.a(var11_int, (byte) -116);
                    if (((kq) this).field_hb.f(244874369)) {
                      ((kq) this).field_hb.e((byte) 124);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (!((kq) this).field_gb.f(244874369)) {
                      break L7;
                    } else {
                      ((kq) this).field_gb.e((byte) 81);
                      break L7;
                    }
                  }
                  L8: {
                    if (((kq) this).field_db.f(244874369)) {
                      ((kq) this).field_db.e((byte) 111);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (((kq) this).field_a.f(244874369)) {
                      ((kq) this).field_a.e((byte) 9);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var12 = (jh) (Object) dn.field_h;
                  var12.e((byte) 102);
                  break L5;
                }
              }
              L10: {
                if (4 == var9) {
                  ((kq) this).field_r = null;
                  ((kq) this).field_jb = 0;
                  break L10;
                } else {
                  L11: {
                    ((kq) this).field_w = var9;
                    var10 = ((kq) this).field_w + ((kq) this).field_D * 4;
                    var11 = bk.field_b[var10];
                    if (var11 != ((kq) this).field_r) {
                      ((kq) this).field_r = bk.field_b[var10];
                      ((kq) this).field_jb = 0;
                      break L11;
                    } else {
                      ((kq) this).field_jb = ((kq) this).field_jb + 1;
                      break L11;
                    }
                  }
                  break L10;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.H(" + -56 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        fs var6 = ((kq) this).field_s.field_P.field_v[param0];
        if (param1 != 2) {
            return;
        }
        try {
            var7 = var6.field_s;
            rs.field_Cb.b(((kq) this).field_l[param2][param0], param3 + 27, param4, var7, -1);
            rs.field_Cb.d(eh.field_I[((kq) this).field_q[param2][param0]], param3 - -37, param4, var7, -1);
            rs.field_Cb.d(var6.field_t, 67 + param3, param4, var7, -1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "kq.CB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(String param0, boolean param1) {
        RuntimeException var4 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (!param0.startsWith("production")) {
                break L1;
              } else {
                ((kq) this).field_e.field_s = param1;
                break L1;
              }
            }
            L2: {
              if (param0.startsWith("projects")) {
                ((kq) this).field_j.field_s = param1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0.startsWith("fleets")) {
                ((kq) this).field_cb.field_s = param1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param0.startsWith("diplomacy")) {
                break L4;
              } else {
                ((kq) this).field_J.field_s = param1;
                break L4;
              }
            }
            L5: {
              if (!param0.startsWith("victory")) {
                break L5;
              } else {
                if (null != ((kq) this).field_nb) {
                  ((kq) this).field_nb.field_s = param1;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("kq.L(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ',' + 31 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        rh var2 = null;
        int var3 = 0;
        lp var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((kq) this).field_j.field_z.e(0);
              ((kq) this).field_j.field_A = false;
              ((kq) this).field_S.d(false);
              var2 = (rh) (Object) ((kq) this).field_j.field_x;
              if (param0 == 428) {
                break L1;
              } else {
                this.a(95, (sd) null, true);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (4 <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = e.a(((kq) this).field_s.field_n.field_u[var3], (byte) -68, var3, var2);
                  var4.a((byte) 62, ((kq) this).field_j.field_z.field_k, ((kq) this).field_j.field_z.field_y + ((kq) this).field_j.field_z.field_t);
                  ((kq) this).field_j.field_z.a((vd) (Object) var4, 8);
                  if (5 > ((kq) this).field_s.field_n.field_u[var3]) {
                    break L3;
                  } else {
                    ((kq) this).field_j.field_A = true;
                    ((kq) this).field_S.g(param0 ^ 464);
                    break L3;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "kq.HB(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[2];
            int discarded$1 = rs.field_Cb.a(var5, param3 - -5, param1 - -5, param0 + -10, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
            var6 = vg.field_t.field_z * 2 + rs.field_Cb.c("= " + vs.field_a);
            gf.a((param0 + -var6) / 2 + (param3 + -10), 15 + (param1 + rs.field_Cb.field_J), var6 - -20, 10 + vg.field_t.field_w * 3, 5, 0, 128);
            var7 = 29 + (rs.field_Cb.field_J + param1);
            var8 = vg.field_t.field_z + rs.field_Cb.c("= " + re.a(hg.field_s, 4371, new String[1]));
            ek.field_z.f((-ek.field_z.field_z + vg.field_t.field_z) / 2 + (param0 + -var8) / 2 + param3, var7);
            vg.field_t.f((-var8 + param0) / 2 + param3, var7 - 9);
            gf.b(em.field_c[0] + (param3 + (vg.field_t.field_z + (param0 - var8)) / 2 << 4), ul.field_Db[0] + (var7 + ek.field_z.field_w / 2 << 4), 50, 7, h.field_s);
            gf.b((param3 + (vg.field_t.field_z + param0 + -var8) / 2 << 4) + em.field_c[2], (ek.field_z.field_w / 2 + var7 << 4) + ul.field_Db[2], 50, 7, h.field_s);
            gf.b(em.field_c[3] + ((vg.field_t.field_z + (-var8 + param0)) / 2 + param3 << 4), (ek.field_z.field_w / 2 + var7 << 4) - -ul.field_Db[3], 50, 7, h.field_s);
            rs.field_Cb.d("= " + re.a(hg.field_s, 4371, new String[1]), vg.field_t.field_z + param3 + ((-var8 + param0) / 2 + 5), vg.field_t.field_w / 2 + var7 - 4, 16777215, -1);
            var7 = var7 + vg.field_t.field_w;
            ek.field_z.f(param3 + ((-var8 + param0) / 2 - -((-ek.field_z.field_z + vg.field_t.field_z) / 2)), var7);
            vg.field_t.f((param0 - var8) / 2 + param3, var7 + -9);
            var9 = 0;
            gf.b((param3 + (vg.field_t.field_z + (-var8 + param0)) / 2 << 4) - -em.field_c[0], ul.field_Db[0] + (ek.field_z.field_w / 2 + var7 << 4), 50, 7, h.field_s);
            gf.b(((vg.field_t.field_z + -var8 + param0) / 2 + param3 << 4) + em.field_c[1], ul.field_Db[1] + (ek.field_z.field_w / 2 + var7 << 4), 50, 7, h.field_s);
            rs.field_Cb.d("= " + re.a(hg.field_s, 4371, new String[1]), 5 + vg.field_t.field_z + ((param0 - var8) / 2 + param3), -4 + (var7 + vg.field_t.field_w / 2), 16777215, -1);
            var7 = var7 + vg.field_t.field_w;
            ek.field_z.f(-5 + (param3 - -((-var6 + param0) / 2) + (-ek.field_z.field_z + vg.field_t.field_z) / 2), var7);
            vg.field_t.f((-var6 + param0) / 2 + param3 - 5, var7 - 9);
            gf.b(em.field_c[0] + (-5 + ((vg.field_t.field_z + (param0 - var6)) / 2 + param3) << 4), ul.field_Db[0] + (var7 - -(ek.field_z.field_w / 2) << 4), 50, 7, h.field_s);
            ek.field_z.f(-5 + (vg.field_t.field_z + (-var6 + param0) / 2 + param3) - -((-ek.field_z.field_z + vg.field_t.field_z) / 2), var7);
            vg.field_t.f(param3 - -((-var6 + param0) / 2) + (vg.field_t.field_z - 5), var7 - 9);
            rs.field_Cb.d("= " + vs.field_a, 2 * vg.field_t.field_z + (-var6 + param0) / 2 + param3, vg.field_t.field_w / 2 + (-4 + var7), 16777215, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5_ref, "kq.NA(" + param0 + ',' + param1 + ',' + 27 + ',' + param3 + ')');
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[1];
            int discarded$1 = rs.field_Cb.a(var5, 5 + param0, param2 - -5, -10 + param3, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
            var6 = qe.field_j.field_z + rs.field_Cb.c("= " + vs.field_a);
            gf.a(-5 + (param3 - var6) / 2 + param0, 20 + rs.field_Cb.field_J + param2, var6 - -15, qe.field_j.field_w + 10, 5, 0, 128);
            qe.field_j.f(param0 - -((param3 + -var6) / 2), rs.field_Cb.field_J + (param2 + 20));
            rs.field_Cb.d("= " + vs.field_a, (param3 - var6) / 2 + (param0 - -qe.field_j.field_z), 25 + rs.field_Cb.field_J + (qe.field_j.field_w / 2 + param2), 16777215, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5_ref, "kq.D(" + param0 + ',' + -1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        dc var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        fs[] var7 = null;
        int var7_int = 0;
        int var8 = 0;
        fs var9 = null;
        int var9_int = 0;
        um var10 = null;
        int[][] var10_array = null;
        int[] var11 = null;
        int var11_int = 0;
        int[] var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_25_0 = 0;
        int[] stackIn_53_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int[] stackOut_52_0 = null;
        int[] stackOut_51_0 = null;
        int[] stackOut_49_0 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_ref = ((kq) this).field_s.field_P;
              var4 = var3_ref.field_r;
              var5 = 1 + var3_ref.field_O - ((kq) this).field_s.field_q;
              if (((kq) this).field_D == param0) {
                ((kq) this).field_Z = ((kq) this).field_C;
                break L1;
              } else {
                L2: {
                  if (((kq) this).field_kb != 0) {
                    int discarded$1 = 410;
                    ((kq) this).field_Z = this.j();
                    break L2;
                  } else {
                    ((kq) this).field_Z = ((kq) this).field_C;
                    break L2;
                  }
                }
                ((kq) this).field_kb = 1;
                ((kq) this).field_D = param0;
                break L1;
              }
            }
            L3: {
              var6 = 8 / ((-73 - param1) / 42);
              if (100 < var5) {
                var5 = 100;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (((kq) this).field_Z == null) {
                  break L5;
                } else {
                  if (var5 == ((kq) this).field_Z[0].length) {
                    break L5;
                  } else {
                    L6: {
                      var7_int = ((kq) this).field_Z[0].length;
                      if (var5 <= var7_int) {
                        stackOut_24_0 = var5;
                        stackIn_25_0 = stackOut_24_0;
                        break L6;
                      } else {
                        stackOut_22_0 = var7_int;
                        stackIn_25_0 = stackOut_22_0;
                        break L6;
                      }
                    }
                    L7: {
                      var8 = stackIn_25_0;
                      var9_int = -var5 + var7_int;
                      if (var9_int < 0) {
                        var9_int = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var10_array = new int[var4][];
                    var11_int = 0;
                    L8: while (true) {
                      if (var11_int >= var4) {
                        ((kq) this).field_kb = 1;
                        ((kq) this).field_Z = var10_array;
                        ((kq) this).field_H = var7_int;
                        break L4;
                      } else {
                        var10_array[var11_int] = new int[var5];
                        ps.a(((kq) this).field_Z[var11_int], var9_int, var10_array[var11_int], 0, var8);
                        var12_int = var7_int;
                        L9: while (true) {
                          if (~var5 >= ~var12_int) {
                            var11_int++;
                            continue L8;
                          } else {
                            var10_array[var11_int][var12_int] = ((kq) this).field_Z[var11_int][-1 + var7_int];
                            var12_int++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              ((kq) this).field_H = var5;
              break L4;
            }
            L10: {
              ((kq) this).field_fb = var5;
              if (1 >= var5) {
                ((kq) this).field_C = null;
                break L10;
              } else {
                ((kq) this).field_C = new int[var4][];
                var7 = var3_ref.field_v;
                var8 = 0;
                L11: while (true) {
                  if (var7.length <= var8) {
                    break L10;
                  } else {
                    L12: {
                      var9 = var7[var8];
                      var10 = var9.field_q;
                      if (((kq) this).field_D == 1) {
                        stackOut_52_0 = var10.field_f;
                        stackIn_53_0 = stackOut_52_0;
                        break L12;
                      } else {
                        if (((kq) this).field_D == 2) {
                          stackOut_51_0 = var10.field_h;
                          stackIn_53_0 = stackOut_51_0;
                          break L12;
                        } else {
                          stackOut_49_0 = var10.field_g;
                          stackIn_53_0 = stackOut_49_0;
                          break L12;
                        }
                      }
                    }
                    var11 = stackIn_53_0;
                    var12 = new int[var5];
                    var13 = 0;
                    L13: while (true) {
                      if (var13 >= var5) {
                        ((kq) this).field_C[var9.field_x] = var12;
                        var8++;
                        continue L11;
                      } else {
                        var14 = (1 + var13 + var3_ref.field_O + (100 - var5)) % 100;
                        var12[var13] = var11[var14] << 10;
                        var13++;
                        continue L13;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "kq.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        rh var3 = null;
        lp var4 = null;
        vd var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = (rh) (Object) ((kq) this).field_j.field_x;
              if (var3.field_b[param0] == null) {
                break L1;
              } else {
                var3.field_b[param0].a((byte) -126, ii.field_s);
                break L1;
              }
            }
            L2: {
              var4 = var3.field_c[param0];
              if (param1 == 2) {
                break L2;
              } else {
                this.a((byte) 43);
                break L2;
              }
            }
            var4.field_o = jd.field_h;
            var5 = (vd) (Object) var4.field_l.d(param1 + -2);
            L3: while (true) {
              if (null == var5) {
                break L0;
              } else {
                L4: {
                  if (var5.field_o == null) {
                    break L4;
                  } else {
                    var5.field_o = jd.field_h;
                    break L4;
                  }
                }
                var5 = (vd) (Object) var4.field_l.a((byte) -71);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "kq.AB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_c = null;
              field_A = null;
              field_i = null;
              field_R = null;
              field_h = null;
              if (param0 == 320) {
                break L1;
              } else {
                field_L = null;
                break L1;
              }
            }
            field_L = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "kq.IA(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        ln[] var3_ref_ln__ = null;
        fs[] var3_ref_fs__ = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        fs[] var4_array = null;
        ln var5_ref_ln = null;
        int var5 = 0;
        fs var5_ref_fs = null;
        int var6_int = 0;
        sd var6 = null;
        fs var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        lp var9 = null;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((kq) this).field_cb.field_z.e(param0);
            var2_array = new int[((kq) this).field_s.field_P.field_r];
            var3_ref_ln__ = ((kq) this).field_s.field_P.field_g.field_e;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= var3_ref_ln__.length) {
                var3_ref_fs__ = ((kq) this).field_s.field_P.field_v;
                var4_int = 0;
                L2: while (true) {
                  if (~var3_ref_fs__.length >= ~var4_int) {
                    var3 = 0;
                    var4 = var2_array;
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        var4_array = ((kq) this).field_s.field_P.field_v;
                        var5 = param0;
                        L4: while (true) {
                          if (var4_array.length <= var5) {
                            break L0;
                          } else {
                            var6_ref = var4_array[var5];
                            var7 = var2_array[var6_ref.field_x];
                            var8 = var6_ref.field_v.field_o / 2 - -((-var6_ref.field_v.field_o + 182) * var7 / var3);
                            var9 = sl.a(var7, -30577, var6_ref, var8);
                            var9.a((byte) 39, ((kq) this).field_cb.field_z.field_k, ((kq) this).field_cb.field_z.field_y + ((kq) this).field_cb.field_z.field_t);
                            ((kq) this).field_cb.field_z.a((vd) (Object) var9, 8);
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L5: {
                          var6_int = var4[var5];
                          if (~var6_int >= ~var3) {
                            break L5;
                          } else {
                            var3 = var6_int;
                            break L5;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      var5_ref_fs = var3_ref_fs__[var4_int];
                      if (((kq) this).field_s.field_P.field_o.field_i) {
                        if (0 >= var5_ref_fs.field_m.field_r) {
                          break L6;
                        } else {
                          var2_array[var5_ref_fs.field_x] = var2_array[var5_ref_fs.field_x] + var5_ref_fs.field_m.field_r;
                          break L6;
                        }
                      } else {
                        var6 = (sd) (Object) var5_ref_fs.field_i.d(0);
                        L7: while (true) {
                          if (null == var6) {
                            break L6;
                          } else {
                            L8: {
                              if (var6.field_r <= 0) {
                                break L8;
                              } else {
                                var2_array[var5_ref_fs.field_x] = var2_array[var5_ref_fs.field_x] + var6.field_r;
                                break L8;
                              }
                            }
                            var6 = (sd) (Object) var5_ref_fs.field_i.a((byte) -71);
                            continue L7;
                          }
                        }
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                L9: {
                  var5_ref_ln = var3_ref_ln__[var4_int];
                  if (var5_ref_ln.field_y == null) {
                    break L9;
                  } else {
                    var2_array[var5_ref_ln.field_y.field_x] = var2_array[var5_ref_ln.field_y.field_x] + var5_ref_ln.field_x;
                    break L9;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.EB(" + param0 + ')');
        }
    }

    final void c(int param0, int param1) {
        RuntimeException runtimeException = null;
        rh var3 = null;
        lp var4 = null;
        vd var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = (rh) (Object) ((kq) this).field_j.field_x;
              if (null == var3.field_b[param0]) {
                break L1;
              } else {
                var3.field_b[param0].a((byte) -88, mf.field_v);
                break L1;
              }
            }
            L2: {
              if (param1 > 126) {
                break L2;
              } else {
                this.a(-90);
                break L2;
              }
            }
            var4 = var3.field_c[param0];
            var4.field_o = mm.field_q;
            var5 = (vd) (Object) var4.field_l.d(0);
            L3: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L4: {
                  if (var5.field_o == null) {
                    break L4;
                  } else {
                    var5.field_o = mm.field_q;
                    break L4;
                  }
                }
                var5 = (vd) (Object) var4.field_l.a((byte) -71);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "kq.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(fs[] param0, int param1) {
        RuntimeException var3 = null;
        String[] var3_array = null;
        boolean[] var4 = null;
        int var5 = 0;
        fs[] var6 = null;
        int[][] var6_array = null;
        int var7_int = 0;
        int[][] var7 = null;
        fs var8_ref_fs = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_array = new String[param1 + param0.length];
            var4 = new boolean[param0.length - -1];
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((kq) this).field_ab.length - 1) {
                var3_array[-1 + var3_array.length] = ((kq) this).field_ab[-1 + ((kq) this).field_ab.length];
                var4[var4.length + -1] = ((kq) this).field_z[((kq) this).field_z.length - 1];
                ((kq) this).field_ab = var3_array;
                ((kq) this).field_z = var4;
                this.e(param1 + -1);
                var5 = ((kq) this).field_cb.field_i;
                ((kq) this).field_cb.a(true, ((kq) this).field_cb.field_z.field_y + 28, ((kq) this).field_cb.field_m);
                ((kq) this).field_cb.field_z.a(true, ((kq) this).field_cb.field_z.field_y - -10, ((kq) this).field_cb.field_z.field_m);
                ((kq) this).field_cb.d(-((kq) this).field_cb.field_i + var5, 0, 0);
                this.f(param1 + -15908);
                int discarded$1 = 6;
                this.i();
                var6 = ((kq) this).field_s.field_P.field_v;
                var7_int = 0;
                L2: while (true) {
                  if (var6.length <= var7_int) {
                    L3: {
                      ((kq) this).field_J.a(true, ((kq) this).field_J.field_z.field_y - -28, ((kq) this).field_J.field_m);
                      ((kq) this).field_J.field_z.a(true, 10 + ((kq) this).field_J.field_z.field_y, ((kq) this).field_J.field_z.field_m);
                      var6_array = new int[param0.length][];
                      var7 = new int[param0.length][];
                      if (null == ((kq) this).field_C) {
                        break L3;
                      } else {
                        var8 = 0;
                        L4: while (true) {
                          if (var8 >= ((kq) this).field_C.length) {
                            var6_array[-1 + param0.length] = new int[var6_array[0].length];
                            ((kq) this).field_C = var6_array;
                            break L3;
                          } else {
                            var6_array[var8] = ((kq) this).field_C[var8];
                            var8++;
                            continue L4;
                          }
                        }
                      }
                    }
                    L5: {
                      if (null != ((kq) this).field_Z) {
                        var8 = 0;
                        L6: while (true) {
                          if (var8 >= ((kq) this).field_Z.length) {
                            var7[-1 + param0.length] = new int[var7[0].length];
                            ((kq) this).field_Z = var7;
                            break L5;
                          } else {
                            var7[var8] = ((kq) this).field_Z[var8];
                            var8++;
                            continue L6;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      if (kb.field_x == 7) {
                        ((kq) this).field_s.field_P.field_x = (me) (Object) new qg(param0);
                        ((kq) this).field_s.field_P.field_x.a((byte) -24, ((kq) this).field_s.field_P, (kq) this);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    break L0;
                  } else {
                    var8_ref_fs = var6[var7_int];
                    this.a((byte) -113, var8_ref_fs);
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                var3_array[var5] = ((kq) this).field_ab[var5];
                var4[var5] = ((kq) this).field_z[var5];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("kq.GB(");
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param1 + ')');
        }
    }

    final static void g(int param0) {
        if (!sq.a(false)) {
            return;
        }
        try {
            gm.a(false, 63, 4);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "kq.DB(" + 4 + ')');
        }
    }

    final void l(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        vd var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_118_0 = 0;
        String stackIn_136_0 = null;
        String stackIn_159_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_117_0 = 0;
        int stackOut_115_0 = 0;
        String stackOut_135_0 = null;
        String stackOut_134_0 = null;
        String stackOut_132_0 = null;
        String stackOut_158_0 = null;
        String stackOut_156_0 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((kq) this).field_s.field_W) {
                break L1;
              } else {
                mq.a((byte) -44);
                break L1;
              }
            }
            L2: {
              if (!((kq) this).field_s.field_f) {
                break L2;
              } else {
                if (!((kq) this).field_s.field_P.field_z) {
                  L3: {
                    gf.a(h.field_F.field_z * 3 + 521, 4, rk.field_j.field_z, -2 + rs.field_Cb.field_J, 2, 0, 128);
                    var2_int = (((kq) this).field_s.field_S - -49) / 50;
                    if (((kq) this).field_s.field_S < 0) {
                      rs.field_Cb.c(this.a(false, Math.abs(var2_int)), 521 - -(h.field_F.field_z * 3) + rk.field_j.field_z / 2, rs.field_Cb.field_J * 3 / 4 + 3, 16711680, -1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (~mb.field_o[((kq) this).field_s.field_P.field_J] < ~(3 * ((kq) this).field_s.field_S)) {
                    L4: {
                      var3_int = ((kq) this).field_s.field_S % 50;
                      if (30 <= var3_int) {
                        break L4;
                      } else {
                        if (var3_int >= 20) {
                          break L2;
                        } else {
                          if (var3_int >= 10) {
                            break L4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    rs.field_Cb.c(this.a(false, Math.abs(var2_int)), h.field_F.field_z * 3 + 521 - -(rk.field_j.field_z / 2), 3 * rs.field_Cb.field_J / 4 + 3, 3974311, -1);
                    break L2;
                  } else {
                    rs.field_Cb.c(this.a(false, Math.abs(var2_int)), rk.field_j.field_z / 2 + 3 * h.field_F.field_z + 521, rs.field_Cb.field_J * 3 / 4 + 3, 16777215, -1);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            L5: {
              var2_int = 0 / ((param0 - 78) / 41);
              if (!((kq) this).field_s.field_W) {
                break L5;
              } else {
                if (ph.field_g) {
                  kb.field_w.f(((kq) this).field_bb.field_k + -10, ((kq) this).field_bb.field_t - 10);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            var3 = (vd) (Object) ((kq) this).field_y.f(3725);
            L6: while (true) {
              if (var3 == null) {
                L7: {
                  int discarded$2 = -14145;
                  vn.d();
                  if (null == ((kq) this).field_O) {
                    break L7;
                  } else {
                    ((kq) this).field_O.b(false, 96);
                    break L7;
                  }
                }
                L8: {
                  if (((kq) this).field_U != -1) {
                    var4 = ((kq) this).field_x;
                    var5 = 5 + (((kq) this).field_k.field_i + ((kq) this).field_k.field_t);
                    gf.a(((kq) this).field_k.field_k - -1, var5, ((kq) this).field_T.field_z + 10, rs.field_Cb.field_J, 5, 0);
                    gf.f(((kq) this).field_k.field_k, -1 + var5, 12 + ((kq) this).field_T.field_z, rs.field_Cb.field_J + 2, 6, 2052949);
                    sa.a(var4 * 5, ((kq) this).field_k.field_k - -6, (byte) 116, 32, ((kq) this).field_T, var5 - 4);
                    if (!((kq) this).field_ib) {
                      break L8;
                    } else {
                      var6 = ((kq) this).field_x - 125;
                      if (var6 > 0) {
                        L9: {
                          var7 = (var6 << 12) / 250;
                          var7 = var7 & 511;
                          if (256 >= var7) {
                            break L9;
                          } else {
                            var7 = 512 + -var7;
                            break L9;
                          }
                        }
                        ((kq) this).field_eb.c(6 + ((kq) this).field_k.field_k, var5 + -4, var7);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                L10: {
                  var4 = cl.field_n % 64;
                  if (24 >= var4) {
                    break L10;
                  } else {
                    if (var4 > 40) {
                      break L10;
                    } else {
                      var4 = 24;
                      break L10;
                    }
                  }
                }
                L11: {
                  if (var4 > 40) {
                    var4 = 64 + -var4;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var4 = 10 * var4;
                  var5 = ui.a(16777215, 16711680, -125, var4);
                  if (!((kq) this).field_e.field_A) {
                    break L12;
                  } else {
                    if (((kq) this).field_mb.field_s) {
                      jq.field_b.b(((kq) this).field_mb.field_k, ((kq) this).field_mb.field_t, var5);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (null == ((kq) this).field_j) {
                    break L13;
                  } else {
                    if (!((kq) this).field_j.field_A) {
                      break L13;
                    } else {
                      if (!((kq) this).field_S.field_s) {
                        break L13;
                      } else {
                        ci.field_p.b(((kq) this).field_S.field_k, ((kq) this).field_S.field_t, var5);
                        break L13;
                      }
                    }
                  }
                }
                L14: {
                  if (!((kq) this).field_cb.field_A) {
                    break L14;
                  } else {
                    if (!((kq) this).field_W.field_s) {
                      break L14;
                    } else {
                      us.field_a.b(((kq) this).field_W.field_k, ((kq) this).field_W.field_t, var5);
                      break L14;
                    }
                  }
                }
                L15: {
                  if (!((kq) this).field_J.field_A) {
                    break L15;
                  } else {
                    if (((kq) this).field_n.field_s) {
                      fl.field_b.b(((kq) this).field_n.field_k, ((kq) this).field_n.field_t, var5);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
                L16: {
                  if (null == ((kq) this).field_nb) {
                    break L16;
                  } else {
                    if (!((kq) this).field_nb.field_A) {
                      break L16;
                    } else {
                      if (!((kq) this).field_g.field_s) {
                        break L16;
                      } else {
                        je.field_f.b(((kq) this).field_g.field_k, ((kq) this).field_g.field_t, var5);
                        break L16;
                      }
                    }
                  }
                }
                var3 = (vd) (Object) ((kq) this).field_y.f(3725);
                L17: while (true) {
                  if (var3 == null) {
                    L18: {
                      var6 = 0;
                      var7 = 0;
                      var8 = null;
                      var9 = 0;
                      var10 = 16777215;
                      if (((kq) this).field_s.field_P.field_z) {
                        L19: {
                          if (((kq) this).field_s.field_P.field_k >= 0) {
                            stackOut_117_0 = 0;
                            stackIn_118_0 = stackOut_117_0;
                            break L19;
                          } else {
                            stackOut_115_0 = 1;
                            stackIn_118_0 = stackOut_115_0;
                            break L19;
                          }
                        }
                        L20: {
                          var6 = stackIn_118_0;
                          if (((kq) this).field_s.field_n == null) {
                            break L20;
                          } else {
                            L21: {
                              if ((1 << ((kq) this).field_s.field_n.field_x & ((kq) this).field_s.field_P.field_w) != 0) {
                                break L21;
                              } else {
                                if (((kq) this).field_s.field_P.field_x.a((byte) 69, ((kq) this).field_s.field_n)) {
                                  break L21;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var7 = 1;
                            break L20;
                          }
                        }
                        L22: {
                          if (var7 != 0) {
                            stackOut_135_0 = (String) field_L;
                            stackIn_136_0 = stackOut_135_0;
                            break L22;
                          } else {
                            if (var6 != 0) {
                              stackOut_134_0 = m.field_v;
                              stackIn_136_0 = stackOut_134_0;
                              break L22;
                            } else {
                              stackOut_132_0 = fj.field_o;
                              stackIn_136_0 = stackOut_132_0;
                              break L22;
                            }
                          }
                        }
                        var8 = (Object) (Object) stackIn_136_0;
                        if (((kq) this).field_s.field_n != null) {
                          break L18;
                        } else {
                          if (var6 != 0) {
                            break L18;
                          } else {
                            var8 = (Object) (Object) re.a(vp.field_t, 4371, new String[1]);
                            break L18;
                          }
                        }
                      } else {
                        break L18;
                      }
                    }
                    L23: {
                      if (((kq) this).field_s.field_n == null) {
                        break L23;
                      } else {
                        if ((((kq) this).field_s.field_P.field_w & 1 << ((kq) this).field_s.field_n.field_x) != 0) {
                          if (((kq) this).field_I) {
                            var9 = 1;
                            var8 = (Object) (Object) field_L;
                            break L23;
                          } else {
                            break L23;
                          }
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (null == var8) {
                        break L24;
                      } else {
                        L25: {
                          mp.field_b.a((String) var8, 320, 240, var10, -1, qd.field_f);
                          var11 = rs.field_Cb.field_J + 245;
                          if (var8 != (Object) (Object) m.field_v) {
                            break L25;
                          } else {
                            L26: {
                              if (((kq) this).field_s.field_P.field_w != 0) {
                                stackOut_158_0 = oh.field_g;
                                stackIn_159_0 = stackOut_158_0;
                                break L26;
                              } else {
                                stackOut_156_0 = ad.field_b;
                                stackIn_159_0 = stackOut_156_0;
                                break L26;
                              }
                            }
                            var8 = (Object) (Object) stackIn_159_0;
                            rs.field_Cb.a((String) var8, 320, var11, var10, -1, qd.field_f);
                            var11 = var11 + (3 + rs.field_Cb.field_J);
                            break L25;
                          }
                        }
                        rs.field_Cb.a(er.field_p, 320, var11, var10, -1, qd.field_f);
                        if (var9 == 0) {
                          break L24;
                        } else {
                          var11 = var11 + (rs.field_Cb.field_J - -3);
                          rs.field_Cb.a(vn.field_i, 320, var11, var10, -1, qd.field_f);
                          break L24;
                        }
                      }
                    }
                    L27: {
                      if (((kq) this).field_u == 0) {
                        break L27;
                      } else {
                        int discarded$3 = 5512;
                        this.k();
                        break L27;
                      }
                    }
                    L28: {
                      if (((kq) this).field_b != 0) {
                        this.a((byte) 11, ((kq) this).field_b);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (qa.field_w == null) {
                        break L29;
                      } else {
                        if (qa.field_w.field_o == null) {
                          break L29;
                        } else {
                          this.a(false, qa.field_w.field_o);
                          break L29;
                        }
                      }
                    }
                    break L0;
                  } else {
                    L30: {
                      if (var3 instanceof qh) {
                        var3.a(123);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    var3 = (vd) (Object) ((kq) this).field_y.b(-127);
                    continue L17;
                  }
                }
              } else {
                L31: {
                  if (!(var3 instanceof qh)) {
                    var3.a(121);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                var3 = (vd) (Object) ((kq) this).field_y.b(-125);
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.M(" + param0 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (qa.field_t > 0) {
                if (!on.field_b) {
                  break L1;
                } else {
                  gf.h(0, 0, gf.field_b, tg.field_c.field_N);
                  so.field_v.b(param1, -66);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param0 == -57) {
              L2: {
                L3: {
                  if (0 < bc.field_b) {
                    break L3;
                  } else {
                    if (ee.field_k <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (ti.field_e) {
                  gf.h(0, 0, gf.field_b, tg.field_c.field_N);
                  ed.field_d.b(param1, -83);
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        try {
            var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[0];
            int var6 = -53;
            int discarded$0 = rs.field_Cb.a(var5, 5 + param0, param3 + 5, -10 + param1, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "kq.FA(" + param0 + ',' + param1 + ',' + 122 + ',' + param3 + ')');
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_20_0 = false;
        int stackIn_26_0 = 0;
        boolean stackIn_28_0 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_11_0 = false;
        boolean stackOut_19_0 = false;
        boolean stackOut_27_0 = false;
        int stackOut_25_0 = 0;
        boolean stackOut_1_0 = false;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (!param0.startsWith("production")) {
              if (param0.startsWith("projects")) {
                stackOut_6_0 = ((kq) this).field_j.field_s;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0.startsWith("fleets")) {
                  stackOut_11_0 = ((kq) this).field_cb.field_s;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  L1: {
                    if (param1 <= -112) {
                      break L1;
                    } else {
                      ((kq) this).field_K = null;
                      break L1;
                    }
                  }
                  if (param0.startsWith("diplomacy")) {
                    stackOut_19_0 = ((kq) this).field_J.field_s;
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0;
                  } else {
                    L2: {
                      if (!param0.startsWith("victory")) {
                        break L2;
                      } else {
                        if (((kq) this).field_nb != null) {
                          stackOut_27_0 = ((kq) this).field_nb.field_s;
                          stackIn_28_0 = stackOut_27_0;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    return stackIn_26_0 != 0;
                  }
                }
              }
            } else {
              stackOut_1_0 = ((kq) this).field_e.field_s;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("kq.R(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L3;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ')');
        }
        return stackIn_28_0;
    }

    final void e(byte param0) {
        em var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        sd var4 = null;
        String var5 = null;
        int var6 = 0;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackIn_12_0 = null;
        StringBuilder stackIn_14_0 = null;
        StringBuilder stackIn_15_0 = null;
        String stackIn_15_1 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_9_0 = null;
        StringBuilder stackOut_14_0 = null;
        String stackOut_14_1 = null;
        StringBuilder stackOut_10_0 = null;
        StringBuilder stackOut_12_0 = null;
        String stackOut_12_1 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2 = (em) (Object) ((kq) this).field_e.field_x;
            if (param0 == 43) {
              var3 = 0;
              L1: while (true) {
                if (~var3 <= ~var2.field_i.length) {
                  break L0;
                } else {
                  L2: {
                    var4 = (sd) var2.field_i[var3].field_h;
                    var2.field_i[var3].a((byte) -122, Integer.toString(var4.field_x));
                    if (var4.field_x != 0) {
                      L3: {
                        stackOut_9_0 = new StringBuilder().append(il.field_lb).append(" ");
                        stackIn_14_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var4.field_x != 1) {
                          stackOut_14_0 = (StringBuilder) (Object) stackIn_14_0;
                          stackOut_14_1 = re.a(d.field_c, 4371, new String[1]);
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          break L3;
                        } else {
                          stackOut_10_0 = (StringBuilder) (Object) stackIn_10_0;
                          stackIn_12_0 = stackOut_10_0;
                          stackOut_12_0 = (StringBuilder) (Object) stackIn_12_0;
                          stackOut_12_1 = ad.field_a;
                          stackIn_15_0 = stackOut_12_0;
                          stackIn_15_1 = stackOut_12_1;
                          break L3;
                        }
                      }
                      var5 = stackIn_15_1;
                      break L2;
                    } else {
                      var5 = pe.field_F;
                      break L2;
                    }
                  }
                  var2.field_d[var3].field_o = var5;
                  var2.field_i[var3].field_o = var5;
                  var3++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "kq.I(" + param0 + ')');
        }
    }

    final void a(byte param0, km param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((kq) this).field_s = param1;
              int discarded$3 = 6;
              this.i();
              if (param0 == -33) {
                break L1;
              } else {
                ((kq) this).field_z = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("kq.BA(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(int param0, int param1, String param2) {
        ad var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var4 = (ad) (Object) ((kq) this).field_k.field_v;
              if (param0 == 10) {
                break L1;
              } else {
                ((kq) this).field_v = false;
                break L1;
              }
            }
            L2: {
              if (400 <= rs.field_Cb.c(param2)) {
                var5 = param2.indexOf(" ", param2.length() / 2);
                var6 = param2.substring(0, var5) + "<br>" + param2.substring(var5 + 1);
                var4.field_f.a(param1, var6, 16777215);
                var4.field_f.a((byte) 50, 15, -(rs.field_Cb.field_J * 5 / 4) + (((kq) this).field_k.field_t + ((kq) this).field_k.field_i / 2 - 1));
                break L2;
              } else {
                var4.field_f.a(param1, param2, 16777215);
                var4.field_f.a((byte) 64, 15, -(3 * rs.field_Cb.field_J / 4) + (((kq) this).field_k.field_t + ((kq) this).field_k.field_i / 2 - 1));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4_ref;
            stackOut_9_1 = new StringBuilder().append("kq.B(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    private final void a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                ((kq) this).field_u = 0;
                var2_int = 94 % ((param0 - -45) / 39);
                if (!((kq) this).field_N.f(244874369)) {
                  break L2;
                } else {
                  if (((kq) this).field_s.field_Q == null) {
                    break L2;
                  } else {
                    ((kq) this).field_s.field_z.a(0, ((kq) this).field_s.field_Q.field_a, false);
                    ((kq) this).field_X.g(114);
                    ((kq) this).field_X.field_o = ip.field_h;
                    break L1;
                  }
                }
              }
              ((kq) this).field_s.field_z.a(-1, new pf(), false);
              ((kq) this).field_s.a(2);
              ((kq) this).field_X.d(false);
              ((kq) this).field_X.field_o = da.field_f;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.G(" + param0 + ')');
        }
    }

    final void h(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[][] var3 = null;
        fs[] var4_ref_fs__ = null;
        int var4 = 0;
        int var5 = 0;
        fs var6_ref_fs = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_52_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((kq) this).field_s.field_W) {
                break L1;
              } else {
                ma.j(param0 ^ -25141);
                break L1;
              }
            }
            L2: {
              if (oq.field_j != 84) {
                break L2;
              } else {
                ((kq) this).field_s.field_z.e(param0 + -18640);
                ((kq) this).field_s.a(2);
                break L2;
              }
            }
            L3: {
              if (oq.field_j != 83) {
                break L3;
              } else {
                if (((kq) this).field_s.field_P.field_r != 1) {
                  L4: {
                    stackOut_12_0 = this;
                    stackIn_15_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (((kq) this).field_Y) {
                      stackOut_15_0 = this;
                      stackOut_15_1 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L4;
                    } else {
                      stackOut_13_0 = this;
                      stackOut_13_1 = 1;
                      stackIn_16_0 = stackOut_13_0;
                      stackIn_16_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  L5: {
                    ((kq) this).field_Y = stackIn_16_1 != 0;
                    if (!((kq) this).field_Y) {
                      break L5;
                    } else {
                      if (null == ((kq) this).field_s.field_n) {
                        break L5;
                      } else {
                        if ((((kq) this).field_s.field_P.field_w & 1 << ((kq) this).field_s.field_n.field_x) == 0) {
                          break L5;
                        } else {
                          ((kq) this).field_I = false;
                          break L5;
                        }
                      }
                    }
                  }
                  var2_int = ((kq) this).field_s.field_P.field_r;
                  ((kq) this).field_l = new String[16][var2_int];
                  ((kq) this).field_G = new int[16][];
                  var3 = new int[16][var2_int];
                  var4_ref_fs__ = ((kq) this).field_s.field_P.field_v;
                  var5 = 0;
                  L6: while (true) {
                    if (~var5 <= ~var4_ref_fs__.length) {
                      ((kq) this).field_q = new int[16][var2_int];
                      var4 = 0;
                      L7: while (true) {
                        if (var4 >= 16) {
                          break L3;
                        } else {
                          int discarded$1 = 3718;
                          ((kq) this).field_G[var4] = nf.a(var3[var4]);
                          var5 = 0;
                          L8: while (true) {
                            if (var2_int <= var5) {
                              var4++;
                              continue L7;
                            } else {
                              var6 = 0;
                              var7 = 0;
                              L9: while (true) {
                                if (~var7 <= ~var2_int) {
                                  ((kq) this).field_q[var4][var5] = var2_int - var6;
                                  var5++;
                                  continue L8;
                                } else {
                                  L10: {
                                    if (~var3[var4][var7] >= ~var3[var4][var5]) {
                                      var6++;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var7++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var6_ref_fs = var4_ref_fs__[var5];
                      var7_ref_int__ = var6_ref_fs.field_q.b((byte) -111);
                      var8 = var6_ref_fs.field_q.a(121);
                      var9 = 0;
                      L11: while (true) {
                        if (var9 >= 16) {
                          var5++;
                          continue L6;
                        } else {
                          var3[var9][var6_ref_fs.field_x] = var7_ref_int__[var9];
                          ((kq) this).field_l[var9][var6_ref_fs.field_x] = var8[var9];
                          var9++;
                          continue L11;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L12: {
              if (oq.field_j != 66) {
                break L12;
              } else {
                L13: {
                  if (ge.field_n) {
                    stackOut_51_0 = 0;
                    stackIn_52_0 = stackOut_51_0;
                    break L13;
                  } else {
                    stackOut_49_0 = 1;
                    stackIn_52_0 = stackOut_49_0;
                    break L13;
                  }
                }
                ge.field_n = stackIn_52_0 != 0;
                ((kq) this).field_f.e((byte) 20);
                break L12;
              }
            }
            L14: {
              if (param0 == -1) {
                break L14;
              } else {
                kq.c(56);
                break L14;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.KA(" + param0 + ')');
        }
    }

    final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 14) {
                break L1;
              } else {
                ((kq) this).field_x = 36;
                break L1;
              }
            }
            if (!((kq) this).field_s.field_W) {
              if (!((kq) this).field_s.field_f) {
                stackOut_9_0 = ((kq) this).field_O.field_db;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = tg.field_c.field_db;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = 480;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.A(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    private final void m(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              de.field_j = 0;
              if (!((kq) this).field_N.f(244874369)) {
                break L1;
              } else {
                de.field_j = de.field_j | 32;
                break L1;
              }
            }
            L2: {
              var2_int = -45 / ((param0 - 14) / 38);
              if (!((kq) this).field_d.f(244874369)) {
                break L2;
              } else {
                de.field_j = de.field_j | 64;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.F(" + param0 + ')');
        }
    }

    private final void k() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        String var8 = null;
        me var9 = null;
        int var10 = 0;
        bi var11 = null;
        om var12 = null;
        int var13_int = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException decompiledCaughtException = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 32;
              if (32 > ((kq) this).field_u) {
                var2_int = ((kq) this).field_u;
                break L1;
              } else {
                if (((kq) this).field_u <= 59968) {
                  break L1;
                } else {
                  var2_int = 60000 - ((kq) this).field_u;
                  break L1;
                }
              }
            }
            L2: {
              var3 = re.a(21, 32, var2_int, 450, 0);
              sn.a(640, -84, 480, (-var2_int + 32 << 6) / 32 + 192, 0, 0);
              var4 = (640 + -var3) / 2;
              var5 = 80;
              var6 = 250;
              ei.a(true, var6, var3, -12394, var5, var4, 3974311);
              var7 = new int[4];
              gf.a(var7);
              gf.d(var4 - -(rs.field_Cb.field_J / 2), var5, -(rs.field_Cb.field_J / 2) + var4 + var3, var5 - -var6);
              var9 = ((kq) this).field_s.field_P.field_x;
              if (!(var9 instanceof ui)) {
                if (!(var9 instanceof nh)) {
                  if (var9 instanceof hp) {
                    var8 = cf.field_I;
                    break L2;
                  } else {
                    var8 = lm.field_a;
                    break L2;
                  }
                } else {
                  var8 = ue.field_c;
                  break L2;
                }
              } else {
                var8 = la.field_n;
                break L2;
              }
            }
            L3: {
              var8 = var8 + "   ";
              if (((kq) this).field_s.field_P.field_o.field_l) {
                var8 = var8 + tp.field_k;
                break L3;
              } else {
                var8 = var8 + og.field_a;
                break L3;
              }
            }
            L4: {
              rs.field_Cb.d(var8.toUpperCase(), 10 + var4, rs.field_Cb.field_J + var5, 16777215, -1);
              ij.a(0, -rs.field_Cb.field_J + 451, true, var4 - -(rs.field_Cb.field_J / 2), 10 + hb.field_b[0].field_w, rs.field_Cb.field_J + var5 + 5);
              var10 = 0;
              if (null != ((kq) this).field_s.field_n) {
                var10 = ((kq) this).field_s.field_n.field_x;
                break L4;
              } else {
                break L4;
              }
            }
            var11 = new bi(hb.field_b[0].field_w, -rs.field_Cb.field_J + 450 - (10 - -(hb.field_b[0].field_z / 2)));
            ra.a(-118);
            var11.e();
            gf.i(0, 0, var11.field_z, var11.field_w, ((kq) this).field_s.field_P.field_v[var10].field_k, 0);
            cg.i(0);
            var11.f();
            var11.a(5 + (rs.field_Cb.field_J / 2 + var4), rs.field_Cb.field_J + var5 + 10, 64);
            var12 = new om(hb.field_b[0].field_z, hb.field_b[0].field_w);
            var13_int = 0;
            L5: while (true) {
              if (~hb.field_b[var10].field_B.length >= ~var13_int) {
                L6: {
                  var12.f(5 + (var4 + rs.field_Cb.field_J / 2) + (var11.field_z + -(hb.field_b[0].field_z / 2)), 10 + var5 - -rs.field_Cb.field_J);
                  hb.field_b[var10].a(-(hb.field_b[0].field_z / 2) + (var11.field_z + rs.field_Cb.field_J / 2) + (var4 + 5), rs.field_Cb.field_J + (var5 + 10), 64);
                  var13 = re.a(eo.field_hb, 4371, new String[1]);
                  var14 = 10 + hb.field_b[0].field_w + (var5 + (20 + mp.field_b.field_J));
                  mp.field_b.c(var13, 320, var14, 16777215, -1);
                  var15 = -32 + ((kq) this).field_u;
                  if (var15 > 0) {
                    if (var15 < 32) {
                      rs.field_Cb.a(((kq) this).field_P, 320, 3 + var14 + rs.field_Cb.field_J, 2458760, -1, var15 * 8);
                      break L6;
                    } else {
                      rs.field_Cb.c(((kq) this).field_P, 320, var14 + rs.field_Cb.field_J - -3, 2458760, -1);
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var9 instanceof jj) {
                    this.a(var4 + (rs.field_Cb.field_J / 2 + 5), 439 - rs.field_Cb.field_J, (byte) 122, var5 + rs.field_Cb.field_J);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (!(var9 instanceof ui)) {
                    break L8;
                  } else {
                    this.c(rs.field_Cb.field_J / 2 + (var4 + 5), -1, rs.field_Cb.field_J + var5, -11 + (450 - rs.field_Cb.field_J));
                    break L8;
                  }
                }
                L9: {
                  if (!(var9 instanceof nh)) {
                    break L9;
                  } else {
                    this.b(-rs.field_Cb.field_J + 439, rs.field_Cb.field_J + var5, 27, rs.field_Cb.field_J / 2 + (var4 + 5));
                    break L9;
                  }
                }
                L10: {
                  if (var9 instanceof hp) {
                    this.a(5 + rs.field_Cb.field_J / 2 + var4, -rs.field_Cb.field_J + 439, -117, rs.field_Cb.field_J + var5);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                gf.b(var7);
                break L0;
              } else {
                L11: {
                  if ((-16777216 & hb.field_b[var10].field_B[var13_int]) == 0) {
                    var12.field_B[var13_int] = 0;
                    break L11;
                  } else {
                    var12.field_B[var13_int] = -16777216;
                    break L11;
                  }
                }
                var13_int++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.DA(" + 5512 + ')');
        }
    }

    final static void c(int param0) {
        try {
            if (param0 != 28164) {
                kq.a((byte) -86, true);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "kq.VA(" + param0 + ')');
        }
    }

    private final int[][] j() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[][] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_17_0 = null;
        int[][] stackIn_22_0 = null;
        int[][] stackIn_35_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_16_0 = null;
        int[][] stackOut_21_0 = null;
        int[][] stackOut_34_0 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((kq) this).field_C) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (int[][]) (Object) stackIn_5_0;
            } else {
              L1: {
                L2: {
                  if (null == ((kq) this).field_Z) {
                    break L2;
                  } else {
                    if (((kq) this).field_Z[0] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                ((kq) this).field_kb = 0;
                ((kq) this).field_Z = ((kq) this).field_C;
                ((kq) this).field_H = ((kq) this).field_fb;
                break L1;
              }
              if (((kq) this).field_C[0].length != ((kq) this).field_Z[0].length) {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (int[][]) (Object) stackIn_17_0;
              } else {
                if (0 == ((kq) this).field_kb) {
                  stackOut_21_0 = ((kq) this).field_Z;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0;
                } else {
                  var2_int = ((kq) this).field_s.field_P.field_r;
                  var3 = ((kq) this).field_C[0].length;
                  var4 = new int[var2_int][];
                  var5 = 0;
                  L3: while (true) {
                    if (~var2_int >= ~var5) {
                      stackOut_34_0 = (int[][]) var4;
                      stackIn_35_0 = stackOut_34_0;
                      break L0;
                    } else {
                      var6 = ((kq) this).field_Z[var5];
                      var7 = ((kq) this).field_C[var5];
                      var8 = new int[var3];
                      var9 = 0;
                      L4: while (true) {
                        if (var3 <= var9) {
                          var4[var5] = var8;
                          var5++;
                          continue L3;
                        } else {
                          var8[var9] = re.a(var6[var9], 32, ((kq) this).field_kb, var7[var9], nc.a(410, 410));
                          var9++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.OA(" + 410 + ')');
        }
        return stackIn_35_0;
    }

    final void i(byte param0) {
        vd var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2 = (vd) (Object) ((kq) this).field_y.d(0);
            if (param0 == -47) {
              L1: while (true) {
                if (null == var2) {
                  ((kq) this).field_j = null;
                  ((kq) this).field_N = null;
                  ((kq) this).field_e = null;
                  ((kq) this).field_J = null;
                  ((kq) this).field_g = null;
                  ((kq) this).field_cb = null;
                  ((kq) this).field_n = null;
                  ((kq) this).field_d = null;
                  ((kq) this).field_S = null;
                  ((kq) this).field_nb = null;
                  ((kq) this).field_W = null;
                  ((kq) this).field_k = null;
                  ((kq) this).field_bb = null;
                  ((kq) this).field_X = null;
                  ((kq) this).field_mb = null;
                  break L0;
                } else {
                  var2.c(false);
                  var2 = (vd) (Object) ((kq) this).field_y.a((byte) -71);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "kq.O(" + param0 + ')');
        }
    }

    final static java.applet.Applet f(byte param0) {
        RuntimeException var1 = null;
        java.applet.Applet stackIn_2_0 = null;
        kf stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_6_0 = null;
        java.applet.Applet stackOut_1_0 = null;
        try {
          L0: {
            if (hb.field_a == null) {
              L1: {
                if (param0 >= 123) {
                  break L1;
                } else {
                  field_A = null;
                  break L1;
                }
              }
              stackOut_6_0 = ts.field_G;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = hb.field_a;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "kq.C(" + param0 + ')');
        }
        return (java.applet.Applet) (Object) stackIn_7_0;
    }

    final void n(int param0) {
        RuntimeException var2 = null;
        fs[] var2_array = null;
        int var3 = 0;
        fs var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.f(-15907);
              if (null == ((kq) this).field_j) {
                break L1;
              } else {
                this.a(428);
                break L1;
              }
            }
            L2: {
              var2_array = ((kq) this).field_s.field_P.field_v;
              var3 = 0;
              if (param0 >= 32) {
                break L2;
              } else {
                this.a(27, 32, 20, -85, 71);
                break L2;
              }
            }
            L3: while (true) {
              if (var3 >= var2_array.length) {
                L4: {
                  ((kq) this).field_J.field_A = false;
                  ((kq) this).field_n.d(false);
                  this.e(0);
                  if (((kq) this).field_hb.f(244874369)) {
                    this.a(0, (byte) 1);
                    break L4;
                  } else {
                    if (!((kq) this).field_gb.f(244874369)) {
                      if (!((kq) this).field_db.f(244874369)) {
                        if (!((kq) this).field_a.f(244874369)) {
                          break L4;
                        } else {
                          this.a(3, (byte) 29);
                          break L4;
                        }
                      } else {
                        this.a(2, (byte) 21);
                        break L4;
                      }
                    } else {
                      this.a(1, (byte) -128);
                      break L4;
                    }
                  }
                }
                L5: {
                  if (!((kq) this).field_s.field_W) {
                    int discarded$3 = vc.a((byte) -39, mp.field_e.length);
                    ((kq) this).field_P = ((kq) this).field_s.field_P.a((byte) -50);
                    ((kq) this).field_u = 1;
                    gm discarded$4 = qk.a(ub.field_yb, 63);
                    break L5;
                  } else {
                    int discarded$5 = 112;
                    pe.k();
                    this.a((byte) -109);
                    break L5;
                  }
                }
                break L0;
              } else {
                var4 = var2_array[var3];
                this.a((byte) -53, var4);
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.UA(" + param0 + ')');
        }
    }

    final boolean a(boolean param0, byte param1) {
        int var3_int = 0;
        vd var4_ref_vd = null;
        qh var4_ref_qh = null;
        int var4 = 0;
        em var4_ref_em = null;
        rh var4_ref_rh = null;
        ph var4_ref_ph = null;
        qh var5 = null;
        int var5_int = 0;
        lp[] var5_array = null;
        int var6 = 0;
        lp var6_ref_lp = null;
        sd var7 = null;
        lp var7_ref = null;
        fs var8 = null;
        int var9 = 0;
        int stackIn_21_0 = 0;
        int stackIn_100_0 = 0;
        tr stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        tr stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        tr stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        tr stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        pf stackIn_110_2 = null;
        tr stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        tr stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        tr stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        pf stackIn_119_2 = null;
        tr stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        tr stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        tr stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        tr stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        pf stackIn_130_2 = null;
        tr stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        tr stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        tr stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        tr stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        pf stackIn_135_2 = null;
        int stackIn_191_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        tr stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        tr stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        Object stackOut_134_2 = null;
        tr stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        tr stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        pf stackOut_133_2 = null;
        tr stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        tr stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        pf stackOut_129_2 = null;
        tr stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        tr stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        Object stackOut_128_2 = null;
        tr stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        tr stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        pf stackOut_118_2 = null;
        tr stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        Object stackOut_117_2 = null;
        tr stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        tr stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        pf stackOut_109_2 = null;
        tr stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        tr stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        Object stackOut_108_2 = null;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_189_0 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((kq) this).field_b == 0) {
          if (((kq) this).field_u == 0) {
            L0: {
              L1: {
                if (null != qa.field_w) {
                  break L1;
                } else {
                  if (bb.field_b >= tg.field_c.field_db) {
                    break L1;
                  } else {
                    L2: {
                      if (null == ((kq) this).field_O) {
                        break L2;
                      } else {
                        if (~bb.field_b > ~((kq) this).field_O.field_db) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  }
                }
              }
              stackOut_19_0 = 1;
              stackIn_21_0 = stackOut_19_0;
              break L0;
            }
            L3: {
              var3_int = stackIn_21_0;
              boolean discarded$5 = wj.a(((kq) this).field_y, (byte) -99);
              if (wl.field_f != null) {
                var4_ref_vd = (vd) (Object) ((kq) this).field_y.d(0);
                L4: while (true) {
                  if (null == var4_ref_vd) {
                    break L3;
                  } else {
                    if (var4_ref_vd instanceof qh) {
                      L5: {
                        var5 = (qh) (Object) var4_ref_vd;
                        if (!var5.field_s) {
                          break L5;
                        } else {
                          if (!var5.a((byte) 43, wl.field_f)) {
                            break L5;
                          } else {
                            L6: {
                              this.a(62, var5);
                              var5.field_A = false;
                              if (var5 != ((kq) this).field_e) {
                                break L6;
                              } else {
                                ((kq) this).field_mb.d(false);
                                break L6;
                              }
                            }
                            L7: {
                              if (var5 == ((kq) this).field_j) {
                                ((kq) this).field_S.d(false);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              if (((kq) this).field_J == var5) {
                                ((kq) this).field_n.d(false);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (var5 != ((kq) this).field_cb) {
                                break L9;
                              } else {
                                ((kq) this).field_W.d(false);
                                break L9;
                              }
                            }
                            if (var5 == ((kq) this).field_nb) {
                              ((kq) this).field_g.d(false);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      var4_ref_vd = (vd) (Object) ((kq) this).field_y.a((byte) -71);
                      continue L4;
                    } else {
                      var4_ref_vd = (vd) (Object) ((kq) this).field_y.a((byte) -71);
                      continue L4;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            L10: {
              if (null != dn.field_h) {
                if (!(dn.field_h.field_h instanceof qh)) {
                  if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_mb) {
                    L11: {
                      if (((kq) this).field_e.field_s) {
                        ((kq) this).field_e.field_s = false;
                        ((kq) this).field_mb.field_o = t.field_b;
                        break L11;
                      } else {
                        this.a(93, ((kq) this).field_e);
                        ((kq) this).field_mb.field_o = ep.field_b;
                        ((kq) this).field_e.field_s = true;
                        break L11;
                      }
                    }
                    ((kq) this).field_e.field_A = false;
                    ((kq) this).field_mb.d(false);
                    return var3_int != 0;
                  } else {
                    if ((Object) (Object) ((kq) this).field_S == (Object) (Object) dn.field_h) {
                      L12: {
                        if (!((kq) this).field_j.field_s) {
                          this.a(-120, ((kq) this).field_j);
                          ((kq) this).field_S.field_o = ue.field_b;
                          ((kq) this).field_j.field_s = true;
                          break L12;
                        } else {
                          ((kq) this).field_S.field_o = n.field_j;
                          ((kq) this).field_j.field_s = false;
                          break L12;
                        }
                      }
                      ((kq) this).field_j.field_A = false;
                      ((kq) this).field_S.d(false);
                      return var3_int != 0;
                    } else {
                      if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_n) {
                        L13: {
                          if (!((kq) this).field_J.field_s) {
                            this.a(113, ((kq) this).field_J);
                            ((kq) this).field_n.field_o = te.field_b;
                            ((kq) this).field_J.field_s = true;
                            break L13;
                          } else {
                            ((kq) this).field_n.field_o = rk.field_o;
                            ((kq) this).field_J.field_s = false;
                            break L13;
                          }
                        }
                        ((kq) this).field_J.field_A = false;
                        ((kq) this).field_n.d(false);
                        return var3_int != 0;
                      } else {
                        if ((Object) (Object) ((kq) this).field_W == (Object) (Object) dn.field_h) {
                          L14: {
                            if (((kq) this).field_cb.field_s) {
                              ((kq) this).field_cb.field_s = false;
                              ((kq) this).field_W.field_o = wm.field_a;
                              break L14;
                            } else {
                              this.a(-113, ((kq) this).field_cb);
                              ((kq) this).field_W.field_o = lc.field_d;
                              ((kq) this).field_cb.field_s = true;
                              break L14;
                            }
                          }
                          ((kq) this).field_cb.field_A = false;
                          ((kq) this).field_W.d(false);
                          return var3_int != 0;
                        } else {
                          if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_g) {
                            L15: {
                              if (((kq) this).field_nb.field_s) {
                                ((kq) this).field_nb.field_s = false;
                                ((kq) this).field_g.field_o = hi.field_d;
                                break L15;
                              } else {
                                this.a(40, ((kq) this).field_nb);
                                ((kq) this).field_nb.field_s = true;
                                ((kq) this).field_g.field_o = hi.field_d;
                                break L15;
                              }
                            }
                            ((kq) this).field_nb.field_A = false;
                            ((kq) this).field_g.d(false);
                            return var3_int != 0;
                          } else {
                            if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_bb) {
                              int discarded$6 = 121;
                              this.g();
                              return var3_int != 0;
                            } else {
                              if ((Object) (Object) ((kq) this).field_f != (Object) (Object) dn.field_h) {
                                if ((Object) (Object) ((kq) this).field_N != (Object) (Object) dn.field_h) {
                                  if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_X) {
                                    L16: {
                                      if (null == ((kq) this).field_s.field_Q) {
                                        break L16;
                                      } else {
                                        ((kq) this).field_X.e((byte) 97);
                                        break L16;
                                      }
                                    }
                                    L17: {
                                      if (!((kq) this).field_X.f(244874369)) {
                                        L18: {
                                          ((kq) this).field_X.field_o = da.field_f;
                                          stackOut_131_0 = ((kq) this).field_s.field_z;
                                          stackOut_131_1 = -1;
                                          stackIn_134_0 = stackOut_131_0;
                                          stackIn_134_1 = stackOut_131_1;
                                          stackIn_132_0 = stackOut_131_0;
                                          stackIn_132_1 = stackOut_131_1;
                                          if (null == ((kq) this).field_s.field_Q) {
                                            stackOut_134_0 = (tr) (Object) stackIn_134_0;
                                            stackOut_134_1 = stackIn_134_1;
                                            stackOut_134_2 = null;
                                            stackIn_135_0 = stackOut_134_0;
                                            stackIn_135_1 = stackOut_134_1;
                                            stackIn_135_2 = (pf) (Object) stackOut_134_2;
                                            break L18;
                                          } else {
                                            stackOut_132_0 = (tr) (Object) stackIn_132_0;
                                            stackOut_132_1 = stackIn_132_1;
                                            stackIn_133_0 = stackOut_132_0;
                                            stackIn_133_1 = stackOut_132_1;
                                            stackOut_133_0 = (tr) (Object) stackIn_133_0;
                                            stackOut_133_1 = stackIn_133_1;
                                            stackOut_133_2 = ((kq) this).field_s.field_Q.field_a;
                                            stackIn_135_0 = stackOut_133_0;
                                            stackIn_135_1 = stackOut_133_1;
                                            stackIn_135_2 = stackOut_133_2;
                                            break L18;
                                          }
                                        }
                                        ((tr) (Object) stackIn_135_0).a(stackIn_135_1, stackIn_135_2, false);
                                        ((kq) this).field_s.a(2);
                                        break L17;
                                      } else {
                                        L19: {
                                          ((kq) this).field_X.field_o = ip.field_h;
                                          stackOut_126_0 = ((kq) this).field_s.field_z;
                                          stackOut_126_1 = 0;
                                          stackIn_129_0 = stackOut_126_0;
                                          stackIn_129_1 = stackOut_126_1;
                                          stackIn_127_0 = stackOut_126_0;
                                          stackIn_127_1 = stackOut_126_1;
                                          if (null != ((kq) this).field_s.field_Q) {
                                            stackOut_129_0 = (tr) (Object) stackIn_129_0;
                                            stackOut_129_1 = stackIn_129_1;
                                            stackOut_129_2 = ((kq) this).field_s.field_Q.field_a;
                                            stackIn_130_0 = stackOut_129_0;
                                            stackIn_130_1 = stackOut_129_1;
                                            stackIn_130_2 = stackOut_129_2;
                                            break L19;
                                          } else {
                                            stackOut_127_0 = (tr) (Object) stackIn_127_0;
                                            stackOut_127_1 = stackIn_127_1;
                                            stackIn_128_0 = stackOut_127_0;
                                            stackIn_128_1 = stackOut_127_1;
                                            stackOut_128_0 = (tr) (Object) stackIn_128_0;
                                            stackOut_128_1 = stackIn_128_1;
                                            stackOut_128_2 = null;
                                            stackIn_130_0 = stackOut_128_0;
                                            stackIn_130_1 = stackOut_128_1;
                                            stackIn_130_2 = (pf) (Object) stackOut_128_2;
                                            break L19;
                                          }
                                        }
                                        ((tr) (Object) stackIn_130_0).a(stackIn_130_1, stackIn_130_2, false);
                                        break L17;
                                      }
                                    }
                                    return var3_int != 0;
                                  } else {
                                    if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_d) {
                                      L20: {
                                        ((kq) this).field_d.e((byte) 73);
                                        if (!((kq) this).field_d.f(244874369)) {
                                          ((kq) this).field_d.field_o = ec.field_t;
                                          break L20;
                                        } else {
                                          ((kq) this).field_d.field_o = de.field_k;
                                          break L20;
                                        }
                                      }
                                      this.m(108);
                                      return var3_int != 0;
                                    } else {
                                      L21: {
                                        if (null == ((kq) this).field_s.field_n) {
                                          break L21;
                                        } else {
                                          if (!((kq) this).field_e.field_s) {
                                            break L21;
                                          } else {
                                            var4_ref_em = (em) (Object) ((kq) this).field_e.field_x;
                                            var5_int = 0;
                                            L22: while (true) {
                                              if (~var5_int <= ~var4_ref_em.field_f.length) {
                                                break L21;
                                              } else {
                                                L23: {
                                                  var6_ref_lp = var4_ref_em.field_f[var5_int];
                                                  var7 = (sd) var6_ref_lp.field_h;
                                                  if (var6_ref_lp.a((byte) -10, dn.field_h)) {
                                                    L24: {
                                                      if (2 != ((kq) this).field_s.field_m) {
                                                        break L24;
                                                      } else {
                                                        if (((kq) this).field_s.field_c == var7) {
                                                          ((kq) this).a(-125, 0);
                                                          break L23;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    if (var7.field_x > 0) {
                                                      this.a(-2, var7, false);
                                                      break L23;
                                                    } else {
                                                      break L23;
                                                    }
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                                var5_int++;
                                                continue L22;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L25: {
                                        if (((kq) this).field_s.field_n == null) {
                                          break L25;
                                        } else {
                                          if (!((kq) this).field_j.field_s) {
                                            break L25;
                                          } else {
                                            var4_ref_rh = (rh) (Object) ((kq) this).field_j.field_x;
                                            var5_int = 0;
                                            L26: while (true) {
                                              if (~var4_ref_rh.field_c.length >= ~var5_int) {
                                                break L25;
                                              } else {
                                                L27: {
                                                  if (!var4_ref_rh.field_c[var5_int].a((byte) 24, dn.field_h)) {
                                                    break L27;
                                                  } else {
                                                    if (((kq) this).field_s.field_n.field_u[var5_int] == 5) {
                                                      this.d(var5_int, 4705);
                                                      break L27;
                                                    } else {
                                                      break L27;
                                                    }
                                                  }
                                                }
                                                var5_int++;
                                                continue L26;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (((kq) this).field_s.field_n == null) {
                                        break L10;
                                      } else {
                                        if (!((kq) this).field_J.field_s) {
                                          break L10;
                                        } else {
                                          var4_ref_ph = (ph) (Object) ((kq) this).field_J.field_x;
                                          var5_array = var4_ref_ph.field_h;
                                          var6 = 0;
                                          L28: while (true) {
                                            if (var6 >= var5_array.length) {
                                              break L10;
                                            } else {
                                              L29: {
                                                var7_ref = var5_array[var6];
                                                var8 = (fs) var7_ref.field_h;
                                                if (var8 != ((kq) this).field_s.field_n) {
                                                  if (var7_ref.a((byte) -118, dn.field_h)) {
                                                    if (((kq) this).field_s.field_n.field_h[var8.field_x]) {
                                                      break L29;
                                                    } else {
                                                      ((kq) this).field_s.a(var8, (byte) 54);
                                                      break L29;
                                                    }
                                                  } else {
                                                    break L29;
                                                  }
                                                } else {
                                                  break L29;
                                                }
                                              }
                                              var6++;
                                              continue L28;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L30: {
                                    ((kq) this).field_N.e((byte) 37);
                                    if (!((kq) this).field_N.f(244874369)) {
                                      L31: {
                                        ((kq) this).field_N.field_o = fl.field_e;
                                        if (!((kq) this).field_X.f(244874369)) {
                                          break L31;
                                        } else {
                                          ((kq) this).field_X.e((byte) 88);
                                          ((kq) this).field_X.field_o = da.field_f;
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        stackOut_116_0 = ((kq) this).field_s.field_z;
                                        stackOut_116_1 = -1;
                                        stackIn_118_0 = stackOut_116_0;
                                        stackIn_118_1 = stackOut_116_1;
                                        stackIn_117_0 = stackOut_116_0;
                                        stackIn_117_1 = stackOut_116_1;
                                        if (null != ((kq) this).field_s.field_Q) {
                                          stackOut_118_0 = (tr) (Object) stackIn_118_0;
                                          stackOut_118_1 = stackIn_118_1;
                                          stackOut_118_2 = ((kq) this).field_s.field_Q.field_a;
                                          stackIn_119_0 = stackOut_118_0;
                                          stackIn_119_1 = stackOut_118_1;
                                          stackIn_119_2 = stackOut_118_2;
                                          break L32;
                                        } else {
                                          stackOut_117_0 = (tr) (Object) stackIn_117_0;
                                          stackOut_117_1 = stackIn_117_1;
                                          stackOut_117_2 = null;
                                          stackIn_119_0 = stackOut_117_0;
                                          stackIn_119_1 = stackOut_117_1;
                                          stackIn_119_2 = (pf) (Object) stackOut_117_2;
                                          break L32;
                                        }
                                      }
                                      ((tr) (Object) stackIn_119_0).a(stackIn_119_1, stackIn_119_2, false);
                                      ((kq) this).field_s.a(2);
                                      break L30;
                                    } else {
                                      ((kq) this).field_N.field_o = fi.field_i;
                                      if (((kq) this).field_s.field_Q == null) {
                                        break L30;
                                      } else {
                                        L33: {
                                          stackOut_106_0 = ((kq) this).field_s.field_z;
                                          stackOut_106_1 = 0;
                                          stackIn_109_0 = stackOut_106_0;
                                          stackIn_109_1 = stackOut_106_1;
                                          stackIn_107_0 = stackOut_106_0;
                                          stackIn_107_1 = stackOut_106_1;
                                          if (null != ((kq) this).field_s.field_Q) {
                                            stackOut_109_0 = (tr) (Object) stackIn_109_0;
                                            stackOut_109_1 = stackIn_109_1;
                                            stackOut_109_2 = ((kq) this).field_s.field_Q.field_a;
                                            stackIn_110_0 = stackOut_109_0;
                                            stackIn_110_1 = stackOut_109_1;
                                            stackIn_110_2 = stackOut_109_2;
                                            break L33;
                                          } else {
                                            stackOut_107_0 = (tr) (Object) stackIn_107_0;
                                            stackOut_107_1 = stackIn_107_1;
                                            stackIn_108_0 = stackOut_107_0;
                                            stackIn_108_1 = stackOut_107_1;
                                            stackOut_108_0 = (tr) (Object) stackIn_108_0;
                                            stackOut_108_1 = stackIn_108_1;
                                            stackOut_108_2 = null;
                                            stackIn_110_0 = stackOut_108_0;
                                            stackIn_110_1 = stackOut_108_1;
                                            stackIn_110_2 = (pf) (Object) stackOut_108_2;
                                            break L33;
                                          }
                                        }
                                        ((tr) (Object) stackIn_110_0).a(stackIn_110_1, stackIn_110_2, false);
                                        if (!((kq) this).field_X.f(244874369)) {
                                          ((kq) this).field_X.e((byte) 8);
                                          ((kq) this).field_X.field_o = ip.field_h;
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                  }
                                  this.m(101);
                                  return var3_int != 0;
                                }
                              } else {
                                L34: {
                                  if (ge.field_n) {
                                    stackOut_99_0 = 0;
                                    stackIn_100_0 = stackOut_99_0;
                                    break L34;
                                  } else {
                                    stackOut_98_0 = 1;
                                    stackIn_100_0 = stackOut_98_0;
                                    break L34;
                                  }
                                }
                                ge.field_n = stackIn_100_0 != 0;
                                ((kq) this).field_f.e((byte) 33);
                                return var3_int != 0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  L35: {
                    var4_ref_qh = (qh) dn.field_h.field_h;
                    var4_ref_qh.field_s = false;
                    if (var4_ref_qh == ((kq) this).field_e) {
                      ((kq) this).field_mb.field_o = t.field_b;
                      ((kq) this).field_mb.d(false);
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if (((kq) this).field_j == var4_ref_qh) {
                      ((kq) this).field_S.field_o = n.field_j;
                      ((kq) this).field_S.d(false);
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (((kq) this).field_J != var4_ref_qh) {
                      break L37;
                    } else {
                      ((kq) this).field_n.field_o = rk.field_o;
                      ((kq) this).field_n.d(false);
                      break L37;
                    }
                  }
                  L38: {
                    if (((kq) this).field_cb != var4_ref_qh) {
                      break L38;
                    } else {
                      ((kq) this).field_W.field_o = wm.field_a;
                      ((kq) this).field_W.d(false);
                      break L38;
                    }
                  }
                  L39: {
                    if (var4_ref_qh != ((kq) this).field_nb) {
                      break L39;
                    } else {
                      ((kq) this).field_g.field_o = hi.field_d;
                      ((kq) this).field_g.d(false);
                      break L39;
                    }
                  }
                  var4_ref_qh.field_A = false;
                  return var3_int != 0;
                }
              } else {
                break L10;
              }
            }
            L40: {
              if (param1 >= 43) {
                break L40;
              } else {
                ((kq) this).field_y = null;
                break L40;
              }
            }
            L41: {
              if (var3_int != 0) {
                stackOut_190_0 = 0;
                stackIn_191_0 = stackOut_190_0;
                break L41;
              } else {
                stackOut_189_0 = 1;
                stackIn_191_0 = stackOut_189_0;
                break L41;
              }
            }
            L42: {
              if (stackIn_191_0 != 1) {
                break L42;
              } else {
                if (!((kq) this).field_s.field_W) {
                  break L42;
                } else {
                  var4 = ks.a(param0, true) ? 1 : 0;
                  if (var4 == 0) {
                    break L42;
                  } else {
                    return true;
                  }
                }
              }
            }
            return var3_int != 0;
          } else {
            L43: {
              if (je.field_d != 0) {
                if (32 <= ((kq) this).field_u) {
                  if (59968 <= ((kq) this).field_u) {
                    break L43;
                  } else {
                    ((kq) this).field_u = 59968;
                    gm discarded$7 = qk.a(sf.field_g, 111);
                    break L43;
                  }
                } else {
                  ((kq) this).field_u = -((kq) this).field_u + 60000;
                  gm discarded$8 = qk.a(sf.field_g, 121);
                  break L43;
                }
              } else {
                break L43;
              }
            }
            return true;
          }
        } else {
          int discarded$9 = -56;
          this.c();
          return true;
        }
    }

    private final void a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 10 + pd.field_k;
              var4 = bb.field_b + 20;
              var5 = rs.field_Cb.c(param1);
              if (13 + var4 > 480) {
                var3_int = pd.field_k;
                var4 = -15 + bb.field_b;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (10 + (var5 + var3_int) <= 639) {
                break L2;
              } else {
                var3_int = -1 + -var5 + 630;
                break L2;
              }
            }
            gf.a(var3_int, var4, var5 - -10, 13, 5, 0, 192);
            gf.f(-1 + var3_int, var4 - 1, var5 - -12, 15, 6, 3974311);
            rs.field_Cb.d(param1, 6 + var3_int, 3 + (var4 + rs.field_Cb.field_J / 2), 16777215, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("kq.K(").append(false).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    private final void i() {
        RuntimeException var2 = null;
        ph var2_ref = null;
        lp var3 = null;
        int var3_int = 0;
        int var4 = 0;
        lp var4_ref_lp = null;
        lp var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((kq) this).field_s.field_W) {
                break L1;
              } else {
                if (6 <= kb.field_x) {
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              ((kq) this).field_J.field_z.e(0);
              var2_ref = new ph(((kq) this).field_s.field_P.field_r);
              ((kq) this).field_J.field_x = (jk) (Object) var2_ref;
              if (((kq) this).field_s.field_n != null) {
                var3 = nl.a(var2_ref, ((kq) this).field_s.field_P.field_v, 2, ((kq) this).field_s.field_n);
                var3.a((byte) 125, ((kq) this).field_J.field_z.field_k, ((kq) this).field_J.field_z.field_t - -((kq) this).field_J.field_z.field_y);
                ((kq) this).field_J.field_z.a((vd) (Object) var3, 8);
                var4 = 0;
                L3: while (true) {
                  if (~((kq) this).field_s.field_P.field_r >= ~var4) {
                    break L2;
                  } else {
                    L4: {
                      if (((kq) this).field_s.field_P.field_v[var4] != ((kq) this).field_s.field_n) {
                        var5 = lr.a(var2_ref, ((kq) this).field_s.field_n, (byte) 21, ((kq) this).field_s.field_P.field_v[var4], ((kq) this).field_s.field_P.field_v);
                        var5.a((byte) 83, ((kq) this).field_J.field_z.field_k, ((kq) this).field_J.field_z.field_t - -((kq) this).field_J.field_z.field_y);
                        ((kq) this).field_J.field_z.a((vd) (Object) var5, 8);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var4++;
                    continue L3;
                  }
                }
              } else {
                var3_int = 0;
                L5: while (true) {
                  if (var3_int >= ((kq) this).field_s.field_P.field_r) {
                    break L2;
                  } else {
                    var4_ref_lp = nl.a(var2_ref, ((kq) this).field_s.field_P.field_v, 2, ((kq) this).field_s.field_P.field_v[var3_int]);
                    var4_ref_lp.a((byte) 65, ((kq) this).field_J.field_z.field_k, ((kq) this).field_J.field_z.field_t - -((kq) this).field_J.field_z.field_y);
                    ((kq) this).field_J.field_z.a((vd) (Object) var4_ref_lp, 8);
                    var3_int++;
                    continue L5;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.W(" + 6 + ')');
        }
    }

    final void h(byte param0) {
        RuntimeException var2 = null;
        ad var2_ref = null;
        fs[] var2_array = null;
        int var2_int = 0;
        int var3_int = 0;
        dc var3 = null;
        fs var4_ref_fs = null;
        int var4 = 0;
        int var5 = 0;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_90_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_89_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((kq) this).field_s.field_L) {
                  break L2;
                } else {
                  if (((kq) this).field_bb != null) {
                    ((kq) this).field_bb.d(false);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var2_ref = (ad) (Object) ((kq) this).field_k.field_v;
                var2_ref.field_e.a(-2948, (bi) null);
                if (((kq) this).field_s.field_N != 1) {
                  ((kq) this).a(10, 0, re.a(gs.field_m, 4371, new String[1]));
                  break L3;
                } else {
                  ((kq) this).a(10, 0, il.field_Y);
                  break L3;
                }
              }
              break L1;
            }
            var2_array = ((kq) this).field_s.field_P.field_v;
            var3_int = 0;
            L4: while (true) {
              if (~var3_int <= ~var2_array.length) {
                L5: {
                  if (((kq) this).field_s.field_f) {
                    break L5;
                  } else {
                    if (!((kq) this).field_s.field_W) {
                      int discarded$7 = 15;
                      this.b();
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                int discarded$8 = -127;
                rh.b();
                ((kq) this).field_V.a((byte) 68, ((kq) this).field_V.field_k, ((kq) this).d((byte) 14) - ((kq) this).field_V.field_i / 2);
                ((kq) this).field_K.a((byte) 45, ((kq) this).field_K.field_k, ((kq) this).field_V.field_t);
                var2_int = -63 / ((67 - param0) / 41);
                var3 = ((kq) this).field_s.field_P;
                var4 = 0;
                var5 = 0;
                L6: while (true) {
                  if (var3.field_r <= var5) {
                    L7: {
                      L8: {
                        if (null == ((kq) this).field_s.field_n) {
                          break L8;
                        } else {
                          if (((kq) this).field_s.field_n.field_A != 0) {
                            var4 = 1;
                            if (((kq) this).field_ab[var3.field_r] != ul.field_Ab) {
                              ((kq) this).field_ab[var3.field_r] = ul.field_Ab;
                              ((kq) this).field_z[var3.field_r] = true;
                              ((kq) this).field_J.field_A = true;
                              ((kq) this).field_n.g(86);
                              break L7;
                            } else {
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      ((kq) this).field_ab[var3.field_r] = null;
                      break L7;
                    }
                    L9: {
                      if (var4 == 0) {
                        ((kq) this).field_x = 250;
                        ((kq) this).field_U = -1;
                        break L9;
                      } else {
                        L10: {
                          var5 = 250;
                          if (!((kq) this).field_ib) {
                            break L10;
                          } else {
                            var5 = 5 * var5 >> 2;
                            break L10;
                          }
                        }
                        L11: {
                          int fieldTemp$9 = ((kq) this).field_x + 1;
                          ((kq) this).field_x = ((kq) this).field_x + 1;
                          if (~var5 < ~fieldTemp$9) {
                            break L11;
                          } else {
                            L12: while (true) {
                              L13: {
                                int fieldTemp$10 = ((kq) this).field_U + 1;
                                ((kq) this).field_U = ((kq) this).field_U + 1;
                                if (~fieldTemp$10 != ~((kq) this).field_ab.length) {
                                  break L13;
                                } else {
                                  ((kq) this).field_U = 0;
                                  break L13;
                                }
                              }
                              if (null == ((kq) this).field_ab[((kq) this).field_U]) {
                                continue L12;
                              } else {
                                ((kq) this).field_x = 0;
                                ((kq) this).field_o = ((kq) this).field_ab[((kq) this).field_U];
                                ((kq) this).field_ib = ((kq) this).field_z[((kq) this).field_U];
                                ((kq) this).field_z[((kq) this).field_U] = false;
                                var6 = rs.field_Cb.c(((kq) this).field_o);
                                ((kq) this).field_T = new bi(var6, rs.field_Cb.field_q + rs.field_Cb.field_J);
                                bs.a(((kq) this).field_T, 92);
                                gf.b();
                                rs.field_Cb.b(((kq) this).field_o, ((kq) this).field_T.field_z, rs.field_Cb.field_J, 16777215, -1);
                                ((kq) this).field_eb = ((kq) this).field_T.g();
                                ((kq) this).field_eb.e();
                                gf.b();
                                rs.field_Cb.b(((kq) this).field_o, ((kq) this).field_T.field_z, rs.field_Cb.field_J, 16777215, -1);
                                gf.b(1, 1, 0, 0, ((kq) this).field_eb.field_z, ((kq) this).field_eb.field_w);
                                cg.i(0);
                                break L11;
                              }
                            }
                          }
                        }
                        break L9;
                      }
                    }
                    L14: {
                      if (((kq) this).field_u != 0) {
                        L15: {
                          int fieldTemp$11 = ((kq) this).field_u + 1;
                          ((kq) this).field_u = ((kq) this).field_u + 1;
                          if (fieldTemp$11 != 60000) {
                            break L15;
                          } else {
                            this.a((byte) 33);
                            break L15;
                          }
                        }
                        if (((kq) this).field_u == 59968) {
                          gm discarded$12 = qk.a(sf.field_g, 122);
                          break L14;
                        } else {
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L16: {
                      if (!((kq) this).field_Y) {
                        if (((kq) this).field_b <= 0) {
                          break L16;
                        } else {
                          ((kq) this).field_b = ((kq) this).field_b - 1;
                          break L16;
                        }
                      } else {
                        if (32 > ((kq) this).field_b) {
                          ((kq) this).field_b = ((kq) this).field_b + 1;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      if (((kq) this).field_b != 0) {
                        int discarded$13 = 3;
                        this.p();
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (!((kq) this).field_s.field_W) {
                        break L18;
                      } else {
                        L19: {
                          gi.a(false);
                          ra.a(-127);
                          fj.field_r.e();
                          gf.d(0, 0, fj.field_r.field_z, fj.field_r.field_w, 0);
                          if (!se.field_k) {
                            break L19;
                          } else {
                            aq.field_i.f(10, 10);
                            var5 = ui.a(0, 16777215, -96, qd.field_f);
                            fj.field_r.f(var5);
                            fj.field_r.f(var5);
                            fj.field_r.e();
                            gf.b(5, 5, 0, 0, fj.field_r.field_z, fj.field_r.field_w);
                            break L19;
                          }
                        }
                        L20: {
                          kb.field_w.e();
                          gf.d(0, 0, kb.field_w.field_z, kb.field_w.field_w, 0);
                          if (ph.field_g) {
                            rk.field_j.f(10, 10);
                            var5 = ui.a(0, 16777215, -103, qd.field_f);
                            kb.field_w.f(var5);
                            kb.field_w.f(var5);
                            kb.field_w.e();
                            gf.b(2, 2, 0, 0, kb.field_w.field_z, kb.field_w.field_w);
                            var6 = 0;
                            L21: while (true) {
                              if (var6 >= kb.field_w.field_B.length) {
                                break L20;
                              } else {
                                kb.field_w.field_B[var6] = 16777215 + we.a(kb.field_w.field_B[var6] << 8, -16777216);
                                var6++;
                                continue L21;
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                        cg.i(0);
                        break L18;
                      }
                    }
                    break L0;
                  } else {
                    L22: {
                      if (~var5 == ~((kq) this).field_s.field_h) {
                        if ((1 << var5 & var3.field_e) == 0) {
                          if (0 == (var3.field_f & 1 << var5)) {
                            if ((1 << var5 & ((kq) this).field_s.field_P.field_w) == 0) {
                              L23: {
                                if (var3.field_z) {
                                  break L23;
                                } else {
                                  if ((1 << var5 & var3.field_y) != 0) {
                                    var6_ref_String = pl.field_b;
                                    break L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              var6_ref_String = null;
                              break L22;
                            } else {
                              var6_ref_String = lp.field_A;
                              break L22;
                            }
                          } else {
                            var6_ref_String = uh.field_e;
                            break L22;
                          }
                        } else {
                          if (((kq) this).field_s.field_M) {
                            var6_ref_String = ae.field_d;
                            break L22;
                          } else {
                            var6_ref_String = f.field_B;
                            break L22;
                          }
                        }
                      } else {
                        var6_ref_String = var3.field_I[var5];
                        if ((1 << var5 & ((kq) this).field_s.field_i) != 0) {
                          if ((var3.field_f & 1 << var5) == 0) {
                            var6_ref_String = re.a(bj.field_M, 4371, new String[1]);
                            break L22;
                          } else {
                            var6_ref_String = re.a(lg.field_f, 4371, new String[1]);
                            break L22;
                          }
                        } else {
                          if (0 != (var3.field_e & 1 << var5)) {
                            if (((kq) this).field_s.field_M) {
                              var6_ref_String = re.a(vm.field_Fb, 4371, new String[1]);
                              break L22;
                            } else {
                              var6_ref_String = re.a(bb.field_d, 4371, new String[1]);
                              break L22;
                            }
                          } else {
                            if ((var3.field_f & 1 << var5) == 0) {
                              if ((((kq) this).field_s.field_P.field_w & 1 << var5) == 0) {
                                L24: {
                                  if (var3.field_z) {
                                    break L24;
                                  } else {
                                    if ((var3.field_y & 1 << var5) != 0) {
                                      var6_ref_String = re.a(ob.field_i, 4371, new String[1]);
                                      break L22;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                var6_ref_String = null;
                                break L22;
                              } else {
                                var6_ref_String = null;
                                break L22;
                              }
                            } else {
                              var6_ref_String = re.a(ek.field_y, 4371, new String[1]);
                              break L22;
                            }
                          }
                        }
                      }
                    }
                    L25: {
                      if (null == var6_ref_String) {
                        break L25;
                      } else {
                        if (var6_ref_String.equals((Object) (Object) ((kq) this).field_ab[var5])) {
                          break L25;
                        } else {
                          ((kq) this).field_z[var5] = true;
                          break L25;
                        }
                      }
                    }
                    L26: {
                      ((kq) this).field_ab[var5] = var6_ref_String;
                      stackOut_89_0 = var4;
                      stackIn_92_0 = stackOut_89_0;
                      stackIn_90_0 = stackOut_89_0;
                      if (null == var6_ref_String) {
                        stackOut_92_0 = stackIn_92_0;
                        stackOut_92_1 = 0;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        break L26;
                      } else {
                        stackOut_90_0 = stackIn_90_0;
                        stackOut_90_1 = 1;
                        stackIn_93_0 = stackOut_90_0;
                        stackIn_93_1 = stackOut_90_1;
                        break L26;
                      }
                    }
                    var4 = stackIn_93_0 | stackIn_93_1;
                    var5++;
                    continue L6;
                  }
                }
              } else {
                var4_ref_fs = var2_array[var3_int];
                this.a((byte) -13, var4_ref_fs);
                var3_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.EA(" + param0 + ')');
        }
    }

    private final void p() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((kq) this).field_kb != 0) {
                int fieldTemp$3 = ((kq) this).field_kb + 1;
                ((kq) this).field_kb = ((kq) this).field_kb + 1;
                if (fieldTemp$3 < 32) {
                  break L1;
                } else {
                  ((kq) this).field_Z = ((kq) this).field_C;
                  ((kq) this).field_H = ((kq) this).field_fb;
                  ((kq) this).field_kb = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (3 == ((kq) this).field_D) {
                  break L3;
                } else {
                  if (null != ((kq) this).field_C) {
                    int fieldTemp$4 = ((kq) this).field_Q + 8;
                    ((kq) this).field_Q = ((kq) this).field_Q + 8;
                    if (fieldTemp$4 <= 256) {
                      break L2;
                    } else {
                      ((kq) this).field_Q = 256;
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              int fieldTemp$5 = ((kq) this).field_Q - 8;
              ((kq) this).field_Q = ((kq) this).field_Q - 8;
              if (fieldTemp$5 < 0) {
                ((kq) this).field_Q = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              ((kq) this).field_p[((kq) this).field_w] = ((kq) this).field_p[((kq) this).field_w] + 1;
              if (32 < ((kq) this).field_p[((kq) this).field_w] + 1) {
                ((kq) this).field_p[((kq) this).field_w] = 32;
                break L4;
              } else {
                break L4;
              }
            }
            var2_int = 32 + -((kq) this).field_p[((kq) this).field_w];
            var3 = 0;
            L5: while (true) {
              if (4 <= var3) {
                L6: {
                  var3 = ((kq) this).field_s.field_P.field_r;
                  var4 = 210;
                  if (var3 != 2) {
                    var5 = var4 / (6 + var3);
                    var6 = 12 + 2 * var5;
                    var7 = -(8 * var5) + var4;
                    ((kq) this).field_ob[((kq) this).field_w] = var6 - -var7;
                    var8 = re.a(0, 32, ((kq) this).field_p[((kq) this).field_w], var7, 0);
                    var7 = var7 - var8;
                    var9 = new int[4];
                    var10 = 0;
                    var11 = 0;
                    L7: while (true) {
                      if (4 <= var11) {
                        if (var10 == 0) {
                          var11 = 0;
                          L8: while (true) {
                            if (var11 >= 4) {
                              break L6;
                            } else {
                              stackOut_64_0 = var11;
                              stackOut_64_1 = ((kq) this).field_w;
                              stackIn_66_0 = stackOut_64_0;
                              stackIn_66_1 = stackOut_64_1;
                              L9: {
                                if (stackIn_66_0 == stackIn_66_1) {
                                  break L9;
                                } else {
                                  ((kq) this).field_ob[var11] = var6 + var7 / 3;
                                  ((kq) this).field_ob[((kq) this).field_w] = ((kq) this).field_ob[((kq) this).field_w] - var7 / 3;
                                  break L9;
                                }
                              }
                              var11++;
                              continue L8;
                            }
                          }
                        } else {
                          var11 = 0;
                          L10: while (true) {
                            if (var11 >= 4) {
                              break L6;
                            } else {
                              L11: {
                                if (var11 == ((kq) this).field_w) {
                                  break L11;
                                } else {
                                  ((kq) this).field_ob[var11] = var7 * var9[var11] / var10 + var6;
                                  ((kq) this).field_ob[((kq) this).field_w] = ((kq) this).field_ob[((kq) this).field_w] - var7 * var9[var11] / var10;
                                  break L11;
                                }
                              }
                              var11++;
                              continue L10;
                            }
                          }
                        }
                      } else {
                        L12: {
                          if (((kq) this).field_w == var11) {
                            break L12;
                          } else {
                            var12 = re.a(0, 32, ((kq) this).field_p[var11], 1024, 0);
                            var9[var11] = var12;
                            var10 = var10 + var12;
                            break L12;
                          }
                        }
                        var11++;
                        continue L7;
                      }
                    }
                  } else {
                    var5 = 0;
                    L13: while (true) {
                      if (var5 >= 4) {
                        break L6;
                      } else {
                        var6 = var4 / (4 - var5);
                        ((kq) this).field_ob[var5] = 12 - -var6;
                        var4 = var4 - var6;
                        var5++;
                        continue L13;
                      }
                    }
                  }
                }
                var5 = re.a(20, 32, ((kq) this).field_b, 550, 0);
                ((kq) this).field_F.a((byte) 85, 20 + (640 + -var5) / 2, ((kq) this).field_hb.field_t);
                ((kq) this).field_lb.a((byte) 45, 5 + (((kq) this).field_hb.field_m + (-var5 + 640) / 2) - -20, ((kq) this).field_gb.field_t);
                ((kq) this).field_m.a((byte) 107, 2 * (((kq) this).field_hb.field_m - -5) + (640 - var5) / 2 + 20, ((kq) this).field_db.field_t);
                ((kq) this).field_M.a((byte) 101, (640 - var5) / 2 - -20 - -((((kq) this).field_hb.field_m - -5) * 3), ((kq) this).field_a.field_t);
                break L0;
              } else {
                L14: {
                  if (~var3 == ~((kq) this).field_w) {
                    break L14;
                  } else {
                    if (var2_int < ((kq) this).field_p[var3]) {
                      ((kq) this).field_p[var3] = ((kq) this).field_p[var3] - 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                var3++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.RA(" + 3 + ')');
        }
    }

    private final void b() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf var8_ref_nf = null;
        int var9 = 0;
        nf var9_ref_nf = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_32_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = ed.field_f * ed.field_f;
            var3 = var2_int + -(fl.field_h * fl.field_h);
            var4 = 360 - -(120 * var3 / var2_int);
            ((kq) this).field_O.a(640, 120, (byte) 112, var4, 0);
            ((kq) this).field_E.field_xb.field_M.a(0);
            var5 = 0;
            var6 = 0;
            var7 = -1 + da.field_g;
            L1: while (true) {
              if (var7 < 0) {
                var7 = 0;
                var8 = 0;
                L2: while (true) {
                  if (var8 >= da.field_g) {
                    L3: {
                      var8 = -var7 + var6 + ((kq) this).field_E.field_xb.field_gb + ((kq) this).field_E.field_xb.field_mb;
                      ((kq) this).field_E.field_xb.field_mb = ((kq) this).field_E.field_xb.field_mb - var8;
                      ((kq) this).field_E.field_xb.field_db = ((kq) this).field_E.field_xb.field_db + var8;
                      ((kq) this).field_E.field_xb.field_mb = var7;
                      ((kq) this).field_E.field_xb.field_gb = var7 + -((kq) this).field_E.field_xb.field_mb;
                      var9 = ((kq) this).field_E.field_zb.field_mb + -((kq) this).field_E.field_xb.field_mb + -((kq) this).field_E.field_xb.field_gb;
                      if (((kq) this).field_v) {
                        ((kq) this).field_E.field_xb.field_w = var9 - ((kq) this).field_E.field_xb.field_db;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      ((kq) this).field_E.a(30 * so.field_o, true, (byte) -115, 15);
                      stackOut_32_0 = this;
                      stackIn_35_0 = stackOut_32_0;
                      stackIn_33_0 = stackOut_32_0;
                      if (var9 != ((kq) this).field_E.field_xb.field_db - -((kq) this).field_E.field_xb.field_w) {
                        stackOut_35_0 = this;
                        stackOut_35_1 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        break L4;
                      } else {
                        stackOut_33_0 = this;
                        stackOut_33_1 = 1;
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_36_1 = stackOut_33_1;
                        break L4;
                      }
                    }
                    ((kq) this).field_v = stackIn_36_1 != 0;
                    ((kq) this).field_O.a(true, -20429);
                    break L0;
                  } else {
                    L5: {
                      var9_ref_nf = wm.field_d[var8];
                      if (null != var9_ref_nf.field_j) {
                        ((kq) this).field_E.field_xb.a(4, var9_ref_nf.field_j);
                        var9_ref_nf.field_j.a(var9_ref_nf.field_j.e(false), 15, (byte) 79, var7, tg.field_a);
                        var7 += 15;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var8++;
                    continue L2;
                  }
                }
              } else {
                L6: {
                  var8_ref_nf = wm.field_d[var7];
                  if (~kp.field_i >= ~var5) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L6;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_9_0 = stackOut_6_0;
                    break L6;
                  }
                }
                L7: {
                  var9 = stackIn_9_0;
                  if (var9 != 0) {
                    L8: {
                      if (null != var8_ref_nf.field_j) {
                        break L8;
                      } else {
                        var10 = var8_ref_nf.field_g;
                        var8_ref_nf.field_j = new qr(0L, gn.field_w, var8_ref_nf.field_k);
                        var8_ref_nf.field_j.field_jb = ((16711422 & gn.field_w.field_jb) >> 1) + var10 - (var10 >> 1 & 8355711);
                        var6 += 15;
                        var8_ref_nf.field_j.field_nb = ho.field_f;
                        var8_ref_nf.field_j.field_x = var10;
                        var8_ref_nf.field_j.field_qb = (8355711 & gn.field_w.field_qb >> 1) + (-((var10 & 16711422) >> 1) + var10);
                        break L8;
                      }
                    }
                    var5++;
                    break L7;
                  } else {
                    var8_ref_nf.field_j = null;
                    break L7;
                  }
                }
                var7--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.MA(" + 15 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = uq.field_k;
            L1: while (true) {
              if (kr.field_f.length <= var3_int) {
                L2: {
                  if (16777215 == 16777215) {
                    break L2;
                  } else {
                    field_L = null;
                    break L2;
                  }
                }
                stackOut_17_0 = -1;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L3: {
                  var5 = ss.field_a[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + e.field_d;
                    break L3;
                  } else {
                    var6 = vm.a(kr.field_f[var3_int], 0, true);
                    var7 = cn.field_w + -(var6 >> 1);
                    var4 = var4 + sm.field_b;
                    if (ek.a(id.field_b + (ar.field_i << 1), param0, var7 + -tr.field_Lb, (byte) -99, var4, (tr.field_Lb << 1) + var6, param1)) {
                      stackOut_9_0 = var5;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    } else {
                      var4 = var4 + (id.field_b + (ar.field_i << 1) - -sm.field_b);
                      break L3;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "kq.Q(" + param0 + ',' + param1 + ',' + 16777215 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(int param0, qh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            ((kq) this).field_y.a((oh) (Object) param1, 0);
            var3_int = -87 % ((param0 - -52) / 61);
            ((kq) this).field_y.a((oh) (Object) ((kq) this).field_K, 0);
            ((kq) this).field_y.a((oh) (Object) ((kq) this).field_V, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kq.CA(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final String a(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        StringBuilder var4 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            var3_int = param1 / 60;
            param1 = param1 % 60;
            var4 = new StringBuilder(5);
            StringBuilder discarded$15 = var4.append((char)(48 + var3_int / 10));
            StringBuilder discarded$16 = var4.append((char)(48 - -(var3_int % 10)));
            StringBuilder discarded$17 = var4.append(':');
            StringBuilder discarded$18 = var4.append((char)(param1 / 10 + 48));
            StringBuilder discarded$19 = var4.append((char)(param1 % 10 + 48));
            stackOut_3_0 = var4.toString();
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "kq.S(" + false + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final bh b(byte param0) {
        RuntimeException var2 = null;
        bh var2_ref = null;
        int var3 = 0;
        bh var4 = null;
        pf var5 = null;
        int var6 = 0;
        Object var7 = null;
        bh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pf stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        bh stackIn_4_2 = null;
        bh stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        pf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        bh stackIn_6_2 = null;
        bh stackIn_6_3 = null;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        pf stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        bh stackIn_8_2 = null;
        bh stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        pf stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        bh stackIn_9_2 = null;
        bh stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        pf stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        bh stackIn_12_2 = null;
        bh stackIn_12_3 = null;
        pf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        bh stackIn_14_2 = null;
        bh stackIn_14_3 = null;
        pf stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        bh stackIn_16_2 = null;
        bh stackIn_16_3 = null;
        pf stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        bh stackIn_17_2 = null;
        bh stackIn_17_3 = null;
        int stackIn_17_4 = 0;
        pf stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        bh stackIn_20_2 = null;
        bh stackIn_20_3 = null;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        int stackIn_20_6 = 0;
        pf stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        bh stackIn_22_2 = null;
        bh stackIn_22_3 = null;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        pf stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        bh stackIn_24_2 = null;
        bh stackIn_24_3 = null;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        pf stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        bh stackIn_25_2 = null;
        bh stackIn_25_3 = null;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        pf stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        bh stackIn_30_2 = null;
        bh stackIn_30_3 = null;
        int stackIn_30_4 = 0;
        pf stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        bh stackIn_32_2 = null;
        bh stackIn_32_3 = null;
        int stackIn_32_4 = 0;
        pf stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        bh stackIn_33_2 = null;
        bh stackIn_33_3 = null;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        Object stackIn_44_0 = null;
        bh stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_45_0 = null;
        pf stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        bh stackOut_3_2 = null;
        bh stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        pf stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        bh stackOut_8_2 = null;
        bh stackOut_8_3 = null;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        pf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        bh stackOut_4_2 = null;
        bh stackOut_4_3 = null;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        pf stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        bh stackOut_6_2 = null;
        bh stackOut_6_3 = null;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        pf stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        bh stackOut_11_2 = null;
        bh stackOut_11_3 = null;
        pf stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        bh stackOut_16_2 = null;
        bh stackOut_16_3 = null;
        int stackOut_16_4 = 0;
        pf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        bh stackOut_12_2 = null;
        bh stackOut_12_3 = null;
        pf stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        bh stackOut_14_2 = null;
        bh stackOut_14_3 = null;
        int stackOut_14_4 = 0;
        pf stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        bh stackOut_19_2 = null;
        bh stackOut_19_3 = null;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        int stackOut_19_6 = 0;
        pf stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        bh stackOut_24_2 = null;
        bh stackOut_24_3 = null;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        pf stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        bh stackOut_20_2 = null;
        bh stackOut_20_3 = null;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        pf stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        bh stackOut_22_2 = null;
        bh stackOut_22_3 = null;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        pf stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        bh stackOut_29_2 = null;
        bh stackOut_29_3 = null;
        int stackOut_29_4 = 0;
        pf stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        bh stackOut_32_2 = null;
        bh stackOut_32_3 = null;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        pf stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        bh stackOut_30_2 = null;
        bh stackOut_30_3 = null;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        Object stackOut_43_0 = null;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_ref = new bh(0, 50, 640, 430);
            var3 = -79 % ((-6 - param0) / 50);
            if (!((kq) this).field_s.field_W) {
              stackOut_45_0 = new bh(0, 50, 640, 430);
              stackIn_46_0 = stackOut_45_0;
              break L0;
            } else {
              L1: {
                var4 = new bh(e.field_f, fk.field_k, ei.field_e, kl.field_o);
                var5 = new pf();
                if (var2_ref.field_l >= var4.field_l) {
                  break L1;
                } else {
                  L2: {
                    stackOut_3_0 = (pf) var5;
                    stackOut_3_1 = -113;
                    stackOut_3_2 = null;
                    stackOut_3_3 = null;
                    stackOut_3_4 = var2_ref.field_l;
                    stackOut_3_5 = var2_ref.field_q;
                    stackIn_8_0 = stackOut_3_0;
                    stackIn_8_1 = stackOut_3_1;
                    stackIn_8_2 = stackOut_3_2;
                    stackIn_8_3 = stackOut_3_3;
                    stackIn_8_4 = stackOut_3_4;
                    stackIn_8_5 = stackOut_3_5;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    stackIn_4_2 = stackOut_3_2;
                    stackIn_4_3 = stackOut_3_3;
                    stackIn_4_4 = stackOut_3_4;
                    stackIn_4_5 = stackOut_3_5;
                    if (var4.field_l > var2_ref.field_o) {
                      stackOut_8_0 = (pf) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = null;
                      stackOut_8_3 = null;
                      stackOut_8_4 = stackIn_8_4;
                      stackOut_8_5 = stackIn_8_5;
                      stackOut_8_6 = var2_ref.field_o;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      stackIn_9_3 = stackOut_8_3;
                      stackIn_9_4 = stackOut_8_4;
                      stackIn_9_5 = stackOut_8_5;
                      stackIn_9_6 = stackOut_8_6;
                      break L2;
                    } else {
                      stackOut_4_0 = (pf) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = null;
                      stackOut_4_3 = null;
                      stackOut_4_4 = stackIn_4_4;
                      stackOut_4_5 = stackIn_4_5;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      stackIn_6_3 = stackOut_4_3;
                      stackIn_6_4 = stackOut_4_4;
                      stackIn_6_5 = stackOut_4_5;
                      stackOut_6_0 = (pf) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = null;
                      stackOut_6_3 = null;
                      stackOut_6_4 = stackIn_6_4;
                      stackOut_6_5 = stackIn_6_5;
                      stackOut_6_6 = var4.field_l;
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_9_1 = stackOut_6_1;
                      stackIn_9_2 = stackOut_6_2;
                      stackIn_9_3 = stackOut_6_3;
                      stackIn_9_4 = stackOut_6_4;
                      stackIn_9_5 = stackOut_6_5;
                      stackIn_9_6 = stackOut_6_6;
                      break L2;
                    }
                  }
                  ((pf) (Object) stackIn_9_0).a((byte) stackIn_9_1, (oh) (Object) new bh(stackIn_9_4, stackIn_9_5, stackIn_9_6, var2_ref.field_i));
                  break L1;
                }
              }
              L3: {
                if (~var4.field_o <= ~var2_ref.field_o) {
                  break L3;
                } else {
                  L4: {
                    stackOut_11_0 = (pf) var5;
                    stackOut_11_1 = -113;
                    stackOut_11_2 = null;
                    stackOut_11_3 = null;
                    stackIn_16_0 = stackOut_11_0;
                    stackIn_16_1 = stackOut_11_1;
                    stackIn_16_2 = stackOut_11_2;
                    stackIn_16_3 = stackOut_11_3;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    if (var4.field_o >= var2_ref.field_l) {
                      stackOut_16_0 = (pf) (Object) stackIn_16_0;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = null;
                      stackOut_16_3 = null;
                      stackOut_16_4 = var4.field_o;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      stackIn_17_4 = stackOut_16_4;
                      break L4;
                    } else {
                      stackOut_12_0 = (pf) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackOut_14_0 = (pf) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = null;
                      stackOut_14_3 = null;
                      stackOut_14_4 = var2_ref.field_l;
                      stackIn_17_0 = stackOut_14_0;
                      stackIn_17_1 = stackOut_14_1;
                      stackIn_17_2 = stackOut_14_2;
                      stackIn_17_3 = stackOut_14_3;
                      stackIn_17_4 = stackOut_14_4;
                      break L4;
                    }
                  }
                  ((pf) (Object) stackIn_17_0).a((byte) stackIn_17_1, (oh) (Object) new bh(stackIn_17_4, var2_ref.field_q, var2_ref.field_o, var2_ref.field_i));
                  break L3;
                }
              }
              L5: {
                if (~var4.field_q >= ~var2_ref.field_q) {
                  break L5;
                } else {
                  L6: {
                    stackOut_19_0 = (pf) var5;
                    stackOut_19_1 = -113;
                    stackOut_19_2 = null;
                    stackOut_19_3 = null;
                    stackOut_19_4 = var2_ref.field_l;
                    stackOut_19_5 = var2_ref.field_q;
                    stackOut_19_6 = var2_ref.field_o;
                    stackIn_24_0 = stackOut_19_0;
                    stackIn_24_1 = stackOut_19_1;
                    stackIn_24_2 = stackOut_19_2;
                    stackIn_24_3 = stackOut_19_3;
                    stackIn_24_4 = stackOut_19_4;
                    stackIn_24_5 = stackOut_19_5;
                    stackIn_24_6 = stackOut_19_6;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    stackIn_20_3 = stackOut_19_3;
                    stackIn_20_4 = stackOut_19_4;
                    stackIn_20_5 = stackOut_19_5;
                    stackIn_20_6 = stackOut_19_6;
                    if (~var2_ref.field_i > ~var4.field_q) {
                      stackOut_24_0 = (pf) (Object) stackIn_24_0;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = null;
                      stackOut_24_3 = null;
                      stackOut_24_4 = stackIn_24_4;
                      stackOut_24_5 = stackIn_24_5;
                      stackOut_24_6 = stackIn_24_6;
                      stackOut_24_7 = var2_ref.field_i;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      stackIn_25_3 = stackOut_24_3;
                      stackIn_25_4 = stackOut_24_4;
                      stackIn_25_5 = stackOut_24_5;
                      stackIn_25_6 = stackOut_24_6;
                      stackIn_25_7 = stackOut_24_7;
                      break L6;
                    } else {
                      stackOut_20_0 = (pf) (Object) stackIn_20_0;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = null;
                      stackOut_20_3 = null;
                      stackOut_20_4 = stackIn_20_4;
                      stackOut_20_5 = stackIn_20_5;
                      stackOut_20_6 = stackIn_20_6;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      stackIn_22_3 = stackOut_20_3;
                      stackIn_22_4 = stackOut_20_4;
                      stackIn_22_5 = stackOut_20_5;
                      stackIn_22_6 = stackOut_20_6;
                      stackOut_22_0 = (pf) (Object) stackIn_22_0;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = null;
                      stackOut_22_3 = null;
                      stackOut_22_4 = stackIn_22_4;
                      stackOut_22_5 = stackIn_22_5;
                      stackOut_22_6 = stackIn_22_6;
                      stackOut_22_7 = var4.field_q;
                      stackIn_25_0 = stackOut_22_0;
                      stackIn_25_1 = stackOut_22_1;
                      stackIn_25_2 = stackOut_22_2;
                      stackIn_25_3 = stackOut_22_3;
                      stackIn_25_4 = stackOut_22_4;
                      stackIn_25_5 = stackOut_22_5;
                      stackIn_25_6 = stackOut_22_6;
                      stackIn_25_7 = stackOut_22_7;
                      break L6;
                    }
                  }
                  ((pf) (Object) stackIn_25_0).a((byte) stackIn_25_1, (oh) (Object) new bh(stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7));
                  break L5;
                }
              }
              L7: {
                if (var2_ref.field_i > var4.field_i) {
                  L8: {
                    stackOut_29_0 = (pf) var5;
                    stackOut_29_1 = -113;
                    stackOut_29_2 = null;
                    stackOut_29_3 = null;
                    stackOut_29_4 = var2_ref.field_l;
                    stackIn_32_0 = stackOut_29_0;
                    stackIn_32_1 = stackOut_29_1;
                    stackIn_32_2 = stackOut_29_2;
                    stackIn_32_3 = stackOut_29_3;
                    stackIn_32_4 = stackOut_29_4;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    stackIn_30_3 = stackOut_29_3;
                    stackIn_30_4 = stackOut_29_4;
                    if (~var2_ref.field_q >= ~var4.field_i) {
                      stackOut_32_0 = (pf) (Object) stackIn_32_0;
                      stackOut_32_1 = stackIn_32_1;
                      stackOut_32_2 = null;
                      stackOut_32_3 = null;
                      stackOut_32_4 = stackIn_32_4;
                      stackOut_32_5 = var4.field_i;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      stackIn_33_2 = stackOut_32_2;
                      stackIn_33_3 = stackOut_32_3;
                      stackIn_33_4 = stackOut_32_4;
                      stackIn_33_5 = stackOut_32_5;
                      break L8;
                    } else {
                      stackOut_30_0 = (pf) (Object) stackIn_30_0;
                      stackOut_30_1 = stackIn_30_1;
                      stackOut_30_2 = null;
                      stackOut_30_3 = null;
                      stackOut_30_4 = stackIn_30_4;
                      stackOut_30_5 = var2_ref.field_q;
                      stackIn_33_0 = stackOut_30_0;
                      stackIn_33_1 = stackOut_30_1;
                      stackIn_33_2 = stackOut_30_2;
                      stackIn_33_3 = stackOut_30_3;
                      stackIn_33_4 = stackOut_30_4;
                      stackIn_33_5 = stackOut_30_5;
                      break L8;
                    }
                  }
                  ((pf) (Object) stackIn_33_0).a((byte) stackIn_33_1, (oh) (Object) new bh(stackIn_33_4, stackIn_33_5, var2_ref.field_o, var2_ref.field_i));
                  break L7;
                } else {
                  break L7;
                }
              }
              var6 = 0;
              var7 = null;
              var8 = (bh) (Object) var5.d(0);
              L9: while (true) {
                if (null == var8) {
                  stackOut_43_0 = var7;
                  stackIn_44_0 = stackOut_43_0;
                  return (bh) (Object) stackIn_44_0;
                } else {
                  L10: {
                    var9 = -var8.field_l + var8.field_o;
                    var10 = -var8.field_q + var8.field_i;
                    stackOut_36_0 = var10;
                    stackOut_36_1 = var9;
                    stackIn_39_0 = stackOut_36_0;
                    stackIn_39_1 = stackOut_36_1;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    if (var9 >= var10) {
                      stackOut_39_0 = stackIn_39_0;
                      stackOut_39_1 = stackIn_39_1;
                      stackOut_39_2 = var10;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      stackIn_40_2 = stackOut_39_2;
                      break L10;
                    } else {
                      stackOut_37_0 = stackIn_37_0;
                      stackOut_37_1 = stackIn_37_1;
                      stackOut_37_2 = var9;
                      stackIn_40_0 = stackOut_37_0;
                      stackIn_40_1 = stackOut_37_1;
                      stackIn_40_2 = stackOut_37_2;
                      break L10;
                    }
                  }
                  L11: {
                    var11 = stackIn_40_0 * (stackIn_40_1 * stackIn_40_2);
                    if (~var11 >= ~var6) {
                      break L11;
                    } else {
                      var7 = (Object) (Object) var8;
                      var6 = var11;
                      break L11;
                    }
                  }
                  var8 = (bh) (Object) var5.a((byte) -71);
                  continue L9;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.PA(" + param0 + ')');
        }
        return stackIn_46_0;
    }

    private final void f(int param0) {
        RuntimeException var2 = null;
        em var2_ref = null;
        fs[] var3_ref_fs__ = null;
        sd var3_ref_sd = null;
        lp var3_ref_lp = null;
        int var3 = 0;
        int var4 = 0;
        lp var4_ref_lp = null;
        fs var5 = null;
        lp var5_ref = null;
        sd var6 = null;
        lp var6_ref = null;
        lp var7 = null;
        lp var8 = null;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((kq) this).field_e.field_z.e(param0 + 15907);
              var2_ref = (em) (Object) ((kq) this).field_e.field_x;
              if (null == ((kq) this).field_s.field_n) {
                break L1;
              } else {
                if ((1 << ((kq) this).field_s.field_n.field_x & ((kq) this).field_s.field_P.field_w) == 0) {
                  if (!((kq) this).field_s.field_P.field_o.field_i) {
                    var2_ref.field_d = new jh[((kq) this).field_s.field_n.field_i.e(0)];
                    var2_ref.field_f = new lp[((kq) this).field_s.field_n.field_i.e(0)];
                    var2_ref.field_i = new qk[((kq) this).field_s.field_n.field_i.e(0)];
                    ((kq) this).field_e.field_A = false;
                    ((kq) this).field_mb.d(false);
                    var3_ref_sd = (sd) (Object) ((kq) this).field_s.field_n.field_i.d(0);
                    if (var3_ref_sd != null) {
                      L2: {
                        var4_ref_lp = rc.a((byte) 120, var3_ref_sd, var2_ref, true);
                        var4_ref_lp.a((byte) 52, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_t - -((kq) this).field_e.field_z.field_y);
                        ((kq) this).field_e.field_z.a((vd) (Object) var4_ref_lp, 8);
                        if (var3_ref_sd.field_x <= 0) {
                          break L2;
                        } else {
                          ((kq) this).field_e.field_A = true;
                          ((kq) this).field_mb.g(param0 ^ -15994);
                          break L2;
                        }
                      }
                      var3_ref_sd = (sd) (Object) ((kq) this).field_s.field_n.field_i.a((byte) -71);
                      L3: while (true) {
                        if (var3_ref_sd == null) {
                          break L1;
                        } else {
                          L4: {
                            var5_ref = rc.a((byte) 123, var3_ref_sd, var2_ref, false);
                            var5_ref.a((byte) 126, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_t + ((kq) this).field_e.field_z.field_y);
                            ((kq) this).field_e.field_z.a((vd) (Object) var5_ref, param0 + 15915);
                            if (var3_ref_sd.field_x > 0) {
                              ((kq) this).field_e.field_A = true;
                              ((kq) this).field_mb.g(95);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var3_ref_sd = (sd) (Object) ((kq) this).field_s.field_n.field_i.a((byte) -71);
                          continue L3;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L5: {
                      var2_ref.field_d = new jh[1];
                      var2_ref.field_f = new lp[1];
                      var2_ref.field_i = new qk[1];
                      var3_ref_lp = rc.a((byte) 119, (sd) (Object) ((kq) this).field_s.field_n.field_m, var2_ref, true);
                      var3_ref_lp.a((byte) 108, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_y + ((kq) this).field_e.field_z.field_t);
                      ((kq) this).field_e.field_z.a((vd) (Object) var3_ref_lp, 8);
                      if (((kq) this).field_s.field_n.field_m.field_x > 0) {
                        ((kq) this).field_e.field_A = true;
                        ((kq) this).field_mb.g(88);
                        break L5;
                      } else {
                        ((kq) this).field_e.field_A = false;
                        ((kq) this).field_mb.d(false);
                        break L5;
                      }
                    }
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (null == ((kq) this).field_s.field_n) {
                break L6;
              } else {
                L7: {
                  if (!((kq) this).field_s.field_W) {
                    break L7;
                  } else {
                    if (kb.field_x < 5) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                ((kq) this).field_e.field_z.a((vd) (Object) hc.a(((kq) this).field_e.field_z.field_k, 126, ((kq) this).field_e.field_z.field_y + ((kq) this).field_e.field_z.field_t), 8);
                break L6;
              }
            }
            L8: {
              if (param0 == -15907) {
                break L8;
              } else {
                bh discarded$1 = ((kq) this).b((byte) 96);
                break L8;
              }
            }
            var3_ref_fs__ = ((kq) this).field_s.field_P.field_v;
            var4 = 0;
            L9: while (true) {
              if (~var4 <= ~var3_ref_fs__.length) {
                L10: {
                  var3 = 3 + ((kq) this).field_e.field_z.field_y - -20;
                  if (var3 > 363) {
                    var3 = 363;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  ((kq) this).field_e.a(true, var3, ((kq) this).field_e.field_m);
                  ((kq) this).field_e.field_z.a(true, -18 + (var3 + -10), ((kq) this).field_e.field_z.field_m);
                  var2_ref.field_e.a(true, -10 + (-15 + (var3 + -3)), var2_ref.field_e.field_m);
                  if (var3 >= 363) {
                    var2_ref.field_e.field_p = true;
                    break L11;
                  } else {
                    var2_ref.field_e.field_p = false;
                    break L11;
                  }
                }
                break L0;
              } else {
                L12: {
                  var5 = var3_ref_fs__[var4];
                  if (var5 == ((kq) this).field_s.field_n) {
                    break L12;
                  } else {
                    if ((((kq) this).field_s.field_P.field_w & 1 << var5.field_x) != 0) {
                      break L12;
                    } else {
                      if (!((kq) this).field_s.field_P.field_o.field_i) {
                        var6 = (sd) (Object) var5.field_i.d(0);
                        if (var6 != null) {
                          var7 = an.a((byte) -76, true, var6);
                          var7.a((byte) 52, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_y + ((kq) this).field_e.field_z.field_t);
                          ((kq) this).field_e.field_z.a((vd) (Object) var7, 8);
                          var6 = (sd) (Object) var5.field_i.a((byte) -71);
                          L13: while (true) {
                            if (null == var6) {
                              break L12;
                            } else {
                              var8 = an.a((byte) -76, false, var6);
                              var8.a((byte) 51, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_y + ((kq) this).field_e.field_z.field_t);
                              ((kq) this).field_e.field_z.a((vd) (Object) var8, param0 ^ -15915);
                              var6 = (sd) (Object) var5.field_i.a((byte) -71);
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      } else {
                        var6_ref = an.a((byte) -76, true, (sd) (Object) var5.field_m);
                        var6_ref.a((byte) 113, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_y + ((kq) this).field_e.field_z.field_t);
                        ((kq) this).field_e.field_z.a((vd) (Object) var6_ref, param0 ^ -15915);
                        break L12;
                      }
                    }
                  }
                }
                var4++;
                continue L9;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.QA(" + param0 + ')');
        }
    }

    private final void g() {
        RuntimeException var2 = null;
        ad var2_ref = null;
        sd var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((kq) this).field_s.field_z.e(-18641);
            ((kq) this).field_s.a(2);
            if (((kq) this).field_s.field_n != null) {
              L1: {
                var2_ref = (ad) (Object) ((kq) this).field_k.field_v;
                if (!var2_ref.field_e.d((byte) 34)) {
                  break L1;
                } else {
                  if (((kq) this).field_s.field_m != 2) {
                    if (!((kq) this).field_s.field_P.field_o.field_i) {
                      var3 = (sd) (Object) ((kq) this).field_s.field_n.field_i.d(0);
                      L2: while (true) {
                        if (null == var3) {
                          break L1;
                        } else {
                          if (var3.field_x > 0) {
                            this.a(-2, var3, true);
                            return;
                          } else {
                            var3 = (sd) (Object) ((kq) this).field_s.field_n.field_i.a((byte) -71);
                            continue L2;
                          }
                        }
                      }
                    } else {
                      if (((kq) this).field_s.field_n.field_m.field_x <= 0) {
                        break L1;
                      } else {
                        this.a(-2, (sd) (Object) ((kq) this).field_s.field_n.field_m, true);
                        return;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                ((kq) this).field_s.m(124);
                ((kq) this).field_bb.g(81);
                var2_ref.field_e.a(-2948, (bi) null);
                if (((kq) this).field_s.field_N == 1) {
                  ((kq) this).a(10, 0, il.field_Y);
                  break L3;
                } else {
                  ((kq) this).a(10, 0, re.a(gs.field_m, 4371, new String[1]));
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.LA(" + 121 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[3];
            int discarded$1 = rs.field_Cb.a(var5, 5 + param0, param3 + 5, -10 + param1, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
            var6 = 20 + param3 - -rs.field_Cb.field_J + 9;
            var7 = 64 + rs.field_Cb.c("= " + re.a(sq.field_p, 4371, new String[1]));
            rk.field_k.b((-var7 + param1) / 2 + param0, -24 + var6, 64, 64);
            rs.field_Cb.d(re.a(hg.field_s, 4371, new String[1]), param0 - (-((param1 + -var7) / 2) + -75), var6 - -7, 16777215, -1);
            rs.field_Cb.d("=", param0 + (param1 - var7) / 2 + 64, 13 + var6, 16777215, -1);
            rs.field_Cb.d(re.a(sq.field_p, 4371, new String[1]), 75 + ((param1 - var7) / 2 + param0), 19 + var6, 16777215, -1);
            var6 += 44;
            ti.field_h.b((-var7 + param1) / 2 + param0, var6 + -24, 64, 64);
            rs.field_Cb.d(re.a(hg.field_s, 4371, new String[1]), 75 + ((-var7 + param1) / 2 + param0), 7 + var6, 16777215, -1);
            var8 = -27;
            rs.field_Cb.d("=", (-var7 + param1) / 2 + (param0 - -64), 13 + var6, 16777215, -1);
            rs.field_Cb.d(re.a(sq.field_p, 4371, new String[1]), 75 + (param1 - var7) / 2 + param0, var6 + 19, 16777215, -1);
            var6 += 52;
            cp.field_t.b(param0 - -((param1 - var7) / 2), var6 + -24, 64, 64);
            rs.field_Cb.d(re.a(hg.field_s, 4371, new String[1]), 75 + ((-var7 + param1) / 2 + param0), var6 + 7, 16777215, -1);
            rs.field_Cb.d("=", 64 + param0 - -((-var7 + param1) / 2), 13 + var6, 16777215, -1);
            rs.field_Cb.d(re.a(sq.field_p, 4371, new String[1]), param0 - (-((-var7 + param1) / 2) - 75), 19 + var6, 16777215, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5_ref, "kq.SA(" + param0 + ',' + param1 + ',' + -117 + ',' + param3 + ')');
        }
    }

    final void a(int param0, fs[] param1, int[] param2, int[] param3, fs[] param4, qk[] param5, byte param6, int param7) {
        RuntimeException var9 = null;
        lp var9_ref = null;
        lp var10 = null;
        int var11 = 0;
        lp var12 = null;
        int var13 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param6 == -47) {
              var9_ref = ((kq) this).field_nb.field_z;
              var9_ref.e(0);
              int discarded$1 = 1;
              var10 = mf.a(param5);
              var10.a((byte) 61, var9_ref.field_k, var9_ref.field_y + var9_ref.field_t);
              var9_ref.a((vd) (Object) var10, 8);
              var11 = 0;
              L1: while (true) {
                if (~param1.length >= ~var11) {
                  L2: {
                    L3: {
                      if (param7 <= 0) {
                        break L3;
                      } else {
                        if (3 >= param7) {
                          ((kq) this).field_nb.field_A = true;
                          ((kq) this).field_g.g(108);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    ((kq) this).field_nb.field_A = false;
                    ((kq) this).field_g.d(false);
                    break L2;
                  }
                  break L0;
                } else {
                  var12 = fb.a(param7, param0, 28, param3[var11], param1[var11], param2[var11], param4, ((kq) this).field_s.field_P);
                  var12.a((byte) 38, var9_ref.field_k, var9_ref.field_t - -var9_ref.field_y);
                  var9_ref.a((vd) (Object) var12, param6 ^ -39);
                  var11++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var9;
            stackOut_18_1 = new StringBuilder().append("kq.V(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          L6: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L6;
            }
          }
          L7: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L7;
            }
          }
          L8: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param5 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L8;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void a(int param0, sd param1, boolean param2) {
        RuntimeException var4 = null;
        em var4_ref = null;
        int var5_int = 0;
        ln var5 = null;
        ad var5_ref = null;
        jh var6 = null;
        qk var7 = null;
        sd var8 = null;
        String var9 = null;
        int var10 = 0;
        StringBuilder stackIn_12_0 = null;
        StringBuilder stackIn_14_0 = null;
        StringBuilder stackIn_16_0 = null;
        StringBuilder stackIn_17_0 = null;
        String stackIn_17_1 = null;
        StringBuilder stackIn_25_0 = null;
        StringBuilder stackIn_27_0 = null;
        StringBuilder stackIn_29_0 = null;
        StringBuilder stackIn_30_0 = null;
        String stackIn_30_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_11_0 = null;
        StringBuilder stackOut_16_0 = null;
        String stackOut_16_1 = null;
        StringBuilder stackOut_12_0 = null;
        StringBuilder stackOut_14_0 = null;
        String stackOut_14_1 = null;
        StringBuilder stackOut_24_0 = null;
        StringBuilder stackOut_29_0 = null;
        String stackOut_29_1 = null;
        StringBuilder stackOut_25_0 = null;
        StringBuilder stackOut_27_0 = null;
        String stackOut_27_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((kq) this).field_s.field_c = param1;
              ((kq) this).a(-83, 2);
              var4_ref = (em) (Object) ((kq) this).field_e.field_x;
              if (param0 == -2) {
                break L1;
              } else {
                ((kq) this).field_x = 60;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var4_ref.field_d.length <= var5_int) {
                L3: {
                  if (!param2) {
                    break L3;
                  } else {
                    var5_ref = (ad) (Object) ((kq) this).field_k.field_v;
                    var5_ref.field_e.a(-2948, (bi) (Object) ((kq) this).field_t);
                    var5_ref.field_f.a((byte) 122, 55, var5_ref.field_f.field_t);
                    if (!((kq) this).field_s.field_W) {
                      break L3;
                    } else {
                      fl.a(0, "unplaced");
                      break L3;
                    }
                  }
                }
                var5 = param1.j(18229);
                L4: while (true) {
                  if (null == var5) {
                    break L0;
                  } else {
                    ((kq) this).field_s.field_z.field_z[var5.field_p] = 2;
                    var5 = param1.h(-23410);
                    continue L4;
                  }
                }
              } else {
                L5: {
                  var6 = var4_ref.field_d[var5_int];
                  var7 = var4_ref.field_i[var5_int];
                  var8 = (sd) var6.field_h;
                  if (var6.f(param0 + 244874371)) {
                    L6: {
                      var6.e((byte) 72);
                      if (var8.field_x == 0) {
                        var9 = pe.field_F;
                        break L6;
                      } else {
                        L7: {
                          stackOut_11_0 = new StringBuilder().append(hd.field_j).append(" ");
                          stackIn_16_0 = stackOut_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          if (var8.field_x != 1) {
                            stackOut_16_0 = (StringBuilder) (Object) stackIn_16_0;
                            stackOut_16_1 = re.a(d.field_c, 4371, new String[1]);
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            break L7;
                          } else {
                            stackOut_12_0 = (StringBuilder) (Object) stackIn_12_0;
                            stackIn_14_0 = stackOut_12_0;
                            stackOut_14_0 = (StringBuilder) (Object) stackIn_14_0;
                            stackOut_14_1 = ad.field_a;
                            stackIn_17_0 = stackOut_14_0;
                            stackIn_17_1 = stackOut_14_1;
                            break L7;
                          }
                        }
                        var9 = stackIn_17_1;
                        break L6;
                      }
                    }
                    var7.field_o = var9;
                    var6.field_o = var9;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if ((Object) (Object) param1 != var6.field_h) {
                    break L8;
                  } else {
                    L9: {
                      var6.e((byte) 26);
                      if (var8.field_x == 0) {
                        var9 = pe.field_F;
                        break L9;
                      } else {
                        L10: {
                          stackOut_24_0 = new StringBuilder().append(il.field_lb).append(" ");
                          stackIn_29_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (var8.field_x != 1) {
                            stackOut_29_0 = (StringBuilder) (Object) stackIn_29_0;
                            stackOut_29_1 = re.a(d.field_c, 4371, new String[1]);
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            break L10;
                          } else {
                            stackOut_25_0 = (StringBuilder) (Object) stackIn_25_0;
                            stackIn_27_0 = stackOut_25_0;
                            stackOut_27_0 = (StringBuilder) (Object) stackIn_27_0;
                            stackOut_27_1 = ad.field_a;
                            stackIn_30_0 = stackOut_27_0;
                            stackIn_30_1 = stackOut_27_1;
                            break L10;
                          }
                        }
                        var9 = stackIn_30_1;
                        break L9;
                      }
                    }
                    var7.field_o = var9;
                    var6.field_o = var9;
                    break L8;
                  }
                }
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var4;
            stackOut_44_1 = new StringBuilder().append("kq.N(").append(param0).append(',');
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L11;
            }
          }
          throw r.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param2 + ')');
        }
    }

    kq(km param0) {
        int var2_int = 0;
        int var3 = 0;
        qr var3_ref_qr = null;
        qr var4 = null;
        fs var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          ((kq) this).field_v = true;
          fj.field_r = new bi(20 + aq.field_i.field_o, aq.field_i.field_p + 20);
          kb.field_w = new om(rk.field_j.field_o + 20, rk.field_j.field_p - -20);
          ((kq) this).field_I = true;
          ((kq) this).field_s = param0;
          ((kq) this).field_y = new pf();
          int discarded$7 = 112;
          ((kq) this).field_e = ch.a();
          ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_e);
          if (((kq) this).field_s.field_n != null) {
            int discarded$8 = 127;
            ((kq) this).field_j = ij.b();
            ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_j);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((kq) this).field_J = mg.d(28, ((kq) this).field_s.field_P.field_r);
          int discarded$9 = 6;
          this.i();
          ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_J);
          ((kq) this).field_cb = gl.a(((kq) this).field_s.field_P.field_r, -1);
          ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_cb);
          var2_int = ((kq) this).field_s.field_P.field_x.b(false);
          if (var2_int <= 0) {
            break L1;
          } else {
            int discarded$10 = 1;
            ((kq) this).field_nb = in.a(var2_int);
            ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_nb);
            break L1;
          }
        }
        L2: {
          int discarded$11 = 69;
          ((kq) this).field_k = ol.a();
          ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_k);
          if (null == ((kq) this).field_s.field_n) {
            break L2;
          } else {
            ((kq) this).field_S = new jh(511, 25, h.field_F.field_z, h.field_F.field_w, -1, h.field_F, (String) null, 0, -1, ak.field_x, (String) null, 0);
            ((kq) this).field_S.field_o = n.field_j;
            ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_S);
            break L2;
          }
        }
        L3: {
          ((kq) this).field_n = new jh(h.field_F.field_z / 2 + 512, 5, fm.field_e.field_z, fm.field_e.field_w, -1, fm.field_e, (String) null, 0, -1, bd.field_D, (String) null, 0);
          ((kq) this).field_n.field_o = rk.field_o;
          ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_n);
          ((kq) this).field_W = new jh(513 - -h.field_F.field_z, 25, k.field_d.field_z, k.field_d.field_w, -1, k.field_d, (String) null, 0, -1, cs.field_h, (String) null, 0);
          ((kq) this).field_W.field_o = wm.field_a;
          ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_W);
          ((kq) this).field_mb = new jh(fm.field_e.field_z + 514 - -(h.field_F.field_z / 2), 5, tm.field_r.field_z, tm.field_r.field_w, -1, tm.field_r, (String) null, 0, -1, je.field_b, (String) null, 0);
          ((kq) this).field_mb.field_o = t.field_b;
          ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_mb);
          if (((kq) this).field_nb == null) {
            break L3;
          } else {
            ((kq) this).field_g = new jh(k.field_d.field_z + h.field_F.field_z + 515, 25, wl.field_d.field_z, wl.field_d.field_w, -1, wl.field_d, (String) null, 0, -1, nr.field_k, (String) null, 0);
            ((kq) this).field_g.field_o = hi.field_d;
            ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_g);
            break L3;
          }
        }
        L4: {
          if (((kq) this).field_s.field_n == null) {
            break L4;
          } else {
            ((kq) this).field_bb = new jh(521 + h.field_F.field_z * 3, 20, rk.field_j.field_z, rk.field_j.field_w, -1, rk.field_j, (String) null, 0, -1, ei.field_a, (String) null, 0);
            ((kq) this).field_bb.field_o = oj.field_Bb;
            ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_bb);
            break L4;
          }
        }
        L5: {
          ((kq) this).field_K = new os(590, 480 - rs.field_Cb.field_J, 60, 2 * rs.field_Cb.field_J);
          ((kq) this).field_y.a((oh) (Object) ((kq) this).field_K, 0);
          ((kq) this).field_N = new jh(595, 480 + -nr.field_r[3].field_w, nr.field_r[3].field_z, nr.field_r[3].field_w, -1, nr.field_r[3], (String) null, 0, -1, nr.field_r[0], (String) null, 0);
          if ((32 & de.field_j) == 0) {
            ((kq) this).field_N.field_o = fl.field_e;
            break L5;
          } else {
            ((kq) this).field_N.e((byte) 9);
            ((kq) this).field_N.field_o = fi.field_i;
            break L5;
          }
        }
        L6: {
          ((kq) this).field_X = new jh(610, -nr.field_r[1].field_w + 480, nr.field_r[1].field_z, nr.field_r[1].field_w, -1, nr.field_r[1], (String) null, 0, -1, nr.field_r[4], (String) null, 0);
          ((kq) this).field_X.field_o = da.field_f;
          ((kq) this).field_d = new jh(625, 480 - nr.field_r[5].field_w, nr.field_r[5].field_z, nr.field_r[5].field_w, -1, nr.field_r[5], (String) null, 0, -1, nr.field_r[2], (String) null, 0);
          if ((de.field_j & 64) != 0) {
            ((kq) this).field_d.e((byte) 23);
            ((kq) this).field_d.field_o = de.field_k;
            break L6;
          } else {
            ((kq) this).field_d.field_o = ec.field_t;
            break L6;
          }
        }
        ((kq) this).field_K.a((vd) (Object) ((kq) this).field_N, 8);
        ((kq) this).field_K.a((vd) (Object) ((kq) this).field_X, 8);
        ((kq) this).field_K.a((vd) (Object) ((kq) this).field_d, 8);
        ((kq) this).field_V = new os(3, 480, 10 + rs.field_Cb.c(fk.field_l), 2 * rs.field_Cb.field_J);
        ((kq) this).field_f = new jh(3, 480, ((kq) this).field_V.field_m, rs.field_Cb.field_J - 4, -1, (bi) null, fk.field_l, 16777215, -1, (bi) null, db.field_d, 16777215);
        ((kq) this).field_V.a((vd) (Object) ((kq) this).field_f, 8);
        ((kq) this).field_y.a((oh) (Object) ((kq) this).field_V, 0);
        ((kq) this).field_t = new om(go.field_L.field_o, go.field_L.field_p);
        ra.a(-128);
        ((kq) this).field_t.e();
        go.field_L.d(0, 0, 16711680);
        var3 = 0;
        L7: while (true) {
          if (((kq) this).field_t.field_B.length <= var3) {
            L8: {
              cg.i(0);
              if (((kq) this).field_s.field_f) {
                break L8;
              } else {
                if (((kq) this).field_s.field_W) {
                  break L8;
                } else {
                  qn.b(116);
                  var3_ref_qr = new qr(0L, (qr) null);
                  var3_ref_qr.field_M = new pf();
                  ((kq) this).field_E = new ub(0L, var3_ref_qr, dm.field_h, se.field_m);
                  var4 = new qr(0L, l.field_a);
                  ((kq) this).field_O = new qr(0L, oh.field_a);
                  ((kq) this).field_O.a(640, 120, (byte) 116, 480, 0);
                  var4.a(634, ((kq) this).field_O.field_mb - 6, (byte) 84, 3, 3);
                  ((kq) this).field_O.a(4, var4);
                  var4.a(4, (qr) (Object) ((kq) this).field_E);
                  var5 = -5 + var4.field_mb;
                  ((kq) this).field_E.a(624, 5, 5, 2, -125, -5 + var5, 15);
                  ge.field_n = false;
                  break L8;
                }
              }
            }
            L9: {
              int discarded$12 = 1;
              cq.a((nq) (Object) rs.field_Cb);
              ((kq) this).field_ob = new int[]{82, 52, 52, 52};
              ((kq) this).field_Q = 0;
              ((kq) this).field_ab = new String[1 + ((kq) this).field_s.field_P.field_r];
              ((kq) this).field_U = -1;
              ((kq) this).field_p = new int[]{32, 0, 0, 0};
              ((kq) this).field_z = new boolean[((kq) this).field_s.field_P.field_r - -1];
              ((kq) this).field_B = new pf();
              ((kq) this).field_F = new os(0, 410, 128, 21);
              ((kq) this).field_lb = new os(0, 410, 128, 21);
              ((kq) this).field_m = new os(0, 410, 128, 21);
              ((kq) this).field_M = new os(0, 410, 128, 21);
              ((kq) this).field_B.a((byte) -113, (oh) (Object) ((kq) this).field_F);
              ((kq) this).field_B.a((byte) -113, (oh) (Object) ((kq) this).field_lb);
              ((kq) this).field_B.a((byte) -113, (oh) (Object) ((kq) this).field_m);
              ((kq) this).field_B.a((byte) -113, (oh) (Object) ((kq) this).field_M);
              ((kq) this).field_hb = new jh(0, 410, 128, 21, -1, (bi) null, ja.field_n.toUpperCase(), 16777215, -1, (bi) null, ja.field_n.toUpperCase(), 2805974);
              ((kq) this).field_F.a((vd) (Object) ((kq) this).field_hb, 8);
              ((kq) this).field_gb = new jh(0, 410, 128, 21, -1, (bi) null, na.field_s.toUpperCase(), 16777215, -1, (bi) null, na.field_s.toUpperCase(), 2805974);
              ((kq) this).field_lb.a((vd) (Object) ((kq) this).field_gb, 8);
              ((kq) this).field_db = new jh(0, 410, 128, 21, -1, (bi) null, po.field_a.toUpperCase(), 16777215, -1, (bi) null, po.field_a.toUpperCase(), 2805974);
              ((kq) this).field_m.a((vd) (Object) ((kq) this).field_db, 8);
              ((kq) this).field_a = new jh(0, 410, 128, 21, -1, (bi) null, ph.field_a.toUpperCase(), 16777215, -1, (bi) null, ph.field_a.toUpperCase(), 2805974);
              ((kq) this).field_M.a((vd) (Object) ((kq) this).field_a, 8);
              ((kq) this).field_hb.field_h = (Object) (Object) new Integer(0);
              ((kq) this).field_gb.field_h = (Object) (Object) new Integer(1);
              ((kq) this).field_db.field_h = (Object) (Object) new Integer(2);
              ((kq) this).field_a.field_h = (Object) (Object) new Integer(3);
              ((kq) this).field_a.e((byte) 54);
              if (!((kq) this).field_s.field_W) {
                break L9;
              } else {
                ((kq) this).field_mb.field_s = false;
                ((kq) this).field_n.field_s = false;
                ((kq) this).field_W.field_s = false;
                ((kq) this).field_S.field_s = false;
                ((kq) this).field_g.field_s = false;
                ((kq) this).field_bb.field_s = false;
                ((kq) this).field_K.field_s = false;
                ((kq) this).field_V.field_s = false;
                jr.a("continue", 1904, wm.field_e);
                jr.a("continue2", 1904, aq.field_k);
                jr.a("continue3", 1904, gn.field_v);
                jr.a("continuekey", 1904, ul.field_Ob);
                jr.a("captureAll", 1904, in.field_e);
                jr.a("exit", 1904, sa.field_b);
                ho.field_d = ((kq) this).field_s.field_n;
                var3 = 0;
                L10: while (true) {
                  if (((kq) this).field_s.field_P.field_r <= var3) {
                    int discarded$13 = -21502;
                    lp.a(1546006977, n.a("start"));
                    break L9;
                  } else {
                    var4_ref = ((kq) this).field_s.field_P.field_v[var3];
                    jr.a("playercol" + var3, 1904, re.a("<col=<%0>>", 4371, new String[1]));
                    jr.a("player" + var3, 1904, re.a("<col=<%0>><%1></col>", 4371, new String[2]));
                    jr.a("playerhome" + var3, 1904, re.a("<col=<%0>><%1></col>", 4371, new String[2]));
                    var3++;
                    continue L10;
                  }
                }
              }
            }
            return;
          } else {
            L11: {
              if (0 != ((kq) this).field_t.field_B[var3]) {
                gf.c(var3 % ((kq) this).field_t.field_z, var3 / ((kq) this).field_t.field_z, 16711680, 128);
                ((kq) this).field_t.field_B[var3] = ee.a(((kq) this).field_t.field_B[var3], -16777216);
                break L11;
              } else {
                break L11;
              }
            }
            var3++;
            continue L7;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "DEFEAT!";
        field_i = "<%0> cannot join; the game has started.";
    }
}
