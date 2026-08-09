/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lu extends am {
    int field_n;
    int field_v;
    static ut[] field_p;
    static String[] field_x;
    int field_o;
    static String field_t;
    static String field_r;
    int field_s;
    int field_q;
    static String field_u;
    int field_w;

    final static void a(int param0, int param1) {
        ml var2 = or.field_d;
        var2.b(param1, (byte) 108);
        var2.field_n = var2.field_n + 1;
        int var3 = var2.field_n;
        if (param0 != 6773) {
            return;
        }
        var2.a(param0 + -6660, 5);
        var2.a(123, uv.field_i.field_bc);
        int var4 = (uv.field_i.field_Mb << 697071814) + uv.field_i.field_Wb;
        var2.a(106, var4);
        var2.a(0, uv.field_i.field_Eb.length, param0 ^ 1991213509, uv.field_i.field_Eb);
        var2.c(62, var2.field_n - var3);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        hd stackIn_18_0 = null;
        hd stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_37_0 = 0;
        hd stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        hd stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        int stackIn_149_2 = 0;
        hd stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        hd stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        int stackIn_154_2 = 0;
        hd stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        hd stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_159_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        hd var6 = null;
        hd var7 = null;
        hd var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        tf var17 = null;
        Object var18 = null;
        he var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        hd var21 = null;
        int[] var22 = null;
        String var24 = null;
        int[] var25 = null;
        hd var26 = null;
        var18 = null;
        var19 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              dw.a(7, ee.field_b);
              if (uv.field_i == null) {
                break L1;
              } else {
                L2: {
                  ac.field_b.field_lb = true;
                  em.field_d.field_mb = 0;
                  var21 = em.field_d;
                  var26 = var21;
                  var26.field_q = 0;
                  ua.field_k.field_mb = 0;
                  var6 = ua.field_k;
                  var6.field_q = 0;
                  nv.field_F.field_mb = 0;
                  var7 = nv.field_F;
                  var7.field_q = 0;
                  if (!np.a(113)) {
                    var9_ref_String = uv.field_i.field_ec;
                    ci.field_h.field_E = vo.a((byte) -18, bv.field_m, new String[]{var9_ref_String}).toUpperCase();
                    nv.field_F.a(true, fp.field_p.field_q, 0, fp.field_p.field_mb - 40, 40);
                    nv.field_F.field_E = vo.a((byte) -18, wa.field_c, new String[]{var9_ref_String});
                    var8 = nv.field_F;
                    break L2;
                  } else {
                    L3: {
                      ci.field_h.field_E = kf.field_zb.toUpperCase();
                      var9 = (fp.field_p.field_q - -2) / 2;
                      em.field_d.a(true, var9 + -2, 0, -40 + fp.field_p.field_mb, 40);
                      if (uv.field_i.field_bc <= uv.field_i.field_gc) {
                        em.field_d.field_E = no.field_I.toUpperCase();
                        em.field_d.field_lb = false;
                        break L3;
                      } else {
                        em.field_d.field_E = po.field_b.toUpperCase();
                        em.field_d.field_lb = true;
                        break L3;
                      }
                    }
                    L4: {
                      em.field_d.field_R = vg.field_Qb.field_R;
                      if ((fh.field_b ^ -1) < -1) {
                        L5: {
                          if ((fh.field_b ^ -1) == -2) {
                            var10_ref_String = kp.field_i;
                            break L5;
                          } else {
                            var10_ref_String = vo.a((byte) -18, jb.field_f, new String[]{Integer.toString(fh.field_b)});
                            break L5;
                          }
                        }
                        em.field_d.field_E = em.field_d.field_E + "<br>" + var10_ref_String;
                        if ((16 & de.field_c) != 0) {
                          break L4;
                        } else {
                          if (!td.field_b) {
                            em.field_d.field_R = vg.field_Qb.field_S;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      L7: {
                        ua.field_k.a(true, fp.field_p.field_q + -var9, var9, -40 + fp.field_p.field_mb, 40);
                        ua.field_k.field_E = hj.field_g.toUpperCase();
                        stackIn_18_0 = ua.field_k;

                        if (!param3) {
                          break L7;
                        } else {
                          stackIn_18_0 = (hd) ((Object) stackIn_18_0);

                          if (0L != vg.field_Ib) {
                            break L7;
                          } else {
                            stackIn_19_0 = (hd) ((Object) stackIn_18_0);
                            stackIn_19_1 = 1;
                            break L6;
                          }
                        }
                      }
                      stackIn_19_0 = (hd) ((Object) stackIn_18_0);
                      stackIn_19_1 = 0;
                      break L6;
                    }
                    L8: {
                      stackIn_19_0.field_lb = stackIn_19_1 != 0;
                      var8 = ua.field_k;
                      var10 = 2;
                      if (la.field_k != null) {
                        L9: {
                          if (hm.field_G == null) {
                            m.field_f = new boolean[ss.field_j];
                            hm.field_G = new byte[ss.field_j];
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var11_int = 0;
                        L10: while (true) {
                          if (ss.field_j <= var11_int) {
                            var10 = 0;
                            L11: while (true) {
                              L12: {
                                if ((var10 ^ -1) <= -3) {
                                  break L12;
                                } else {
                                  var11_int = 0;
                                  var12 = 0;
                                  L13: while (true) {
                                    if (var12 >= la.field_k.length) {
                                      if (var11_int != 0) {
                                        break L12;
                                      } else {
                                        var10++;
                                        continue L11;
                                      }
                                    } else {
                                      var25 = la.field_k[var12];
                                      var22 = var25;
                                      var13 = var22;
                                      var14_int = 0;
                                      L14: while (true) {
                                        L15: {
                                          if (var14_int >= var25.length) {
                                            var11_int = 1;
                                            var14_int = -1;
                                            var15 = 0;
                                            L16: while (true) {
                                              if (var25.length <= var15) {
                                                m.field_f[var14_int] = true;
                                                break L15;
                                              } else {
                                                var16 = var25[var15];
                                                if ((var14_int ^ -1) > (var16 ^ -1)) {
                                                  var14_int = var16;
                                                  var15 += 2;
                                                  continue L16;
                                                } else {
                                                  var15 += 2;
                                                  continue L16;
                                                }
                                              }
                                            }
                                          } else {
                                            L17: {
                                              var15 = var25[var14_int];
                                              var16 = var13[var14_int + 1];
                                              if (var15 != -1) {
                                                if ((uv.field_i.field_Eb[var15] & 255) == var16) {
                                                  break L17;
                                                } else {
                                                  break L15;
                                                }
                                              } else {
                                                L18: {
                                                  if (0 == var10) {
                                                    stackIn_37_0 = uv.field_i.field_bc;
                                                    break L18;
                                                  } else {
                                                    stackIn_37_0 = uv.field_i.field_gc;
                                                    break L18;
                                                  }
                                                }
                                                var17_int = stackIn_37_0;
                                                if (var17_int == var16) {
                                                  break L17;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            var14_int += 2;
                                            continue L14;
                                          }
                                        }
                                        var12++;
                                        continue L13;
                                      }
                                    }
                                  }
                                }
                              }
                              if (2 > tk.field_Ib) {
                                break L8;
                              } else {
                                if (ne.field_G[12]) {
                                  var10 = 2;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          } else {
                            m.field_f[var11_int] = false;
                            var11_int++;
                            continue L10;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    if ((var10 ^ -1) > -3) {
                      ua.field_k.field_lb = false;
                      if (!ua.field_k.field_Q) {
                        break L2;
                      } else {
                        var11 = null;
                        var12 = 0;
                        var13_int = 0;
                        L19: while (true) {
                          if (ss.field_j <= var13_int) {
                            L20: {
                              if (var10 != 0) {
                                var13_ref = os.field_w;
                                if (var12 == 0) {
                                  var14 = vo.a((byte) -18, bp.field_yb, new String[]{(String) (var11)});
                                  break L20;
                                } else {
                                  var14 = oi.field_k + (String) (var11);
                                  break L20;
                                }
                              } else {
                                var13_ref = sb.field_g;
                                if (var12 != 0) {
                                  var14 = gm.field_S + (String) (var11);
                                  break L20;
                                } else {
                                  var14 = vo.a((byte) -18, kb.field_D, new String[]{(String) (var11)});
                                  break L20;
                                }
                              }
                            }
                            sn.field_e = "<col=A00000>" + var13_ref + "<br>" + var14;
                            break L2;
                          } else {
                            L21: {
                              if (m.field_f[var13_int]) {
                                var24 = "<col=A00000>" + ok.field_b[var13_int] + "</col>";
                                if (var11 == null) {
                                  var11 = var24;
                                  break L21;
                                } else {
                                  var12 = 1;
                                  var11 = (String) (var11) + ", " + var24;
                                  break L21;
                                }
                              } else {
                                break L21;
                              }
                            }
                            var13_int++;
                            continue L19;
                          }
                        }
                      }
                    } else {
                      L22: {
                        if (null != ds.field_h) {
                          break L22;
                        } else {
                          if (null != lh.field_E) {
                            break L22;
                          } else {
                            if (null != so.field_f) {
                              break L22;
                            } else {
                              if (null == hm.field_D) {
                                break L2;
                              } else {
                                break L22;
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
                      L23: while (true) {
                        if (var16 >= ss.field_j) {
                          var16 = 0;
                          var17 = bs.field_c.field_Ab.field_jb;
                          var18_ref = (he) ((Object) var17.g(24009));
                          L24: while (true) {
                            L25: {
                              if (var18_ref == null) {
                                break L25;
                              } else {
                                L26: {
                                  if (var18_ref.h(-13356)) {
                                    break L26;
                                  } else {
                                    L27: {
                                      if (var11_int == 0) {
                                        break L27;
                                      } else {
                                        if (var18_ref.field_Cb) {
                                          break L27;
                                        } else {
                                          var16 = 1;
                                          break L25;
                                        }
                                      }
                                    }
                                    if (var18_ref.field_Qb >= var13_int) {
                                      if (var14_int > var18_ref.field_Db) {
                                        var16 = 1;
                                        break L25;
                                      } else {
                                        if ((var15 & (var18_ref.field_Pb ^ -1)) > 0) {
                                          var16 = 1;
                                          break L25;
                                        } else {
                                          if (var12 == 0) {
                                            break L26;
                                          } else {
                                            var16 = 1;
                                            break L25;
                                          }
                                        }
                                      }
                                    } else {
                                      var16 = 1;
                                      break L25;
                                    }
                                  }
                                }
                                var18_ref = (he) ((Object) var17.c(param2 ^ -33));
                                continue L24;
                              }
                            }
                            L28: {
                              if ((tk.field_Ib ^ -1) > -3) {
                                break L28;
                              } else {
                                if (ne.field_G[12]) {
                                  var16 = 0;
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            if (var16 != 0) {
                              ua.field_k.field_lb = false;
                              if (ua.field_k.field_Q) {
                                if (ni.field_l.field_b.field_Db != 0) {
                                  sn.field_e = vo.a((byte) -18, pu.field_Fb, new String[]{c.field_d});
                                  break L2;
                                } else {
                                  sn.field_e = pp.field_m;
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          L29: {
                            var17_int = 255 & uv.field_i.field_Eb[var16];
                            if (null == ds.field_h) {
                              break L29;
                            } else {
                              if (ds.field_h[var16] == null) {
                                break L29;
                              } else {
                                if (!ds.field_h[var16][var17_int]) {
                                  break L29;
                                } else {
                                  var11_int = 1;
                                  break L29;
                                }
                              }
                            }
                          }
                          L30: {
                            if (lh.field_E == null) {
                              break L30;
                            } else {
                              if (lh.field_E[var16] == null) {
                                break L30;
                              } else {
                                L31: {
                                  var18_int = lh.field_E[var16][var17_int];
                                  if (var18_int == 0) {
                                    break L31;
                                  } else {
                                    if (fv.field_d) {
                                      break L31;
                                    } else {
                                      var11_int = 1;
                                      break L31;
                                    }
                                  }
                                }
                                if (var18_int <= var13_int) {
                                  break L30;
                                } else {
                                  var13_int = var18_int;
                                  break L30;
                                }
                              }
                            }
                          }
                          L32: {
                            if (null == so.field_f) {
                              break L32;
                            } else {
                              if (so.field_f[var16] != null) {
                                L33: {
                                  var18_int = so.field_f[var16][var17_int];
                                  if (var18_int > var14_int) {
                                    var14_int = var18_int;
                                    break L33;
                                  } else {
                                    break L33;
                                  }
                                }
                                if (-1 == (var18_int ^ -1)) {
                                  break L32;
                                } else {
                                  if (fv.field_d) {
                                    break L32;
                                  } else {
                                    var11_int = 1;
                                    break L32;
                                  }
                                }
                              } else {
                                if (null != hm.field_D) {
                                  if (null != hm.field_D[var16]) {
                                    var15 = var15 | hm.field_D[var16][var17_int];
                                    var16++;
                                    continue L23;
                                  } else {
                                    var16++;
                                    continue L23;
                                  }
                                } else {
                                  var16++;
                                  continue L23;
                                }
                              }
                            }
                          }
                          if (null != hm.field_D) {
                            if (null != hm.field_D[var16]) {
                              var15 = var15 | hm.field_D[var16][var17_int];
                              var16++;
                              continue L23;
                            } else {
                              var16++;
                              continue L23;
                            }
                          } else {
                            var16++;
                            continue L23;
                          }
                        }
                      }
                    }
                  }
                }
                L34: {
                  if ((vg.field_Ib ^ -1L) == -1L) {
                    break L34;
                  } else {
                    L35: {
                      var9 = (int)(-nj.a(22) + vg.field_Ib);
                      var9 = (var9 - -999) / 1000;
                      if ((var9 ^ -1) <= -2) {
                        break L35;
                      } else {
                        var9 = 1;
                        break L35;
                      }
                    }
                    var8.field_E = vo.a((byte) -18, gf.field_h, new String[]{Integer.toString(var9)});
                    break L34;
                  }
                }
                ka.field_c.field_E = vo.a((byte) -18, ib.field_F, new String[]{Integer.toString(uv.field_i.field_gc), Integer.toString(uv.field_i.field_bc)});
                break L1;
              }
            }
            L36: {
              L37: {
                stackIn_148_0 = dn.field_Cb;

                stackIn_148_1 = param2 ^ param2;

                if (!param0) {
                  break L37;
                } else {
                  stackIn_148_0 = (hd) ((Object) stackIn_148_0);

                  if (param4) {
                    break L37;
                  } else {
                    stackIn_148_0 = (hd) ((Object) stackIn_148_0);

                    if (td.field_b) {
                      break L37;
                    } else {
                      stackIn_149_0 = (hd) ((Object) stackIn_148_0);
                      stackIn_149_1 = stackIn_148_1;
                      stackIn_149_2 = 1;
                      break L36;
                    }
                  }
                }
              }
              stackIn_149_0 = (hd) ((Object) stackIn_148_0);
              stackIn_149_1 = stackIn_148_1;
              stackIn_149_2 = 0;
              break L36;
            }
            L38: {
              L39: {
                ((hd) (Object) stackIn_149_0).b(stackIn_149_1, stackIn_149_2 != 0);
                stackIn_153_0 = fp.field_p;

                stackIn_153_1 = 0;

                if (!param0) {
                  break L39;
                } else {
                  stackIn_153_0 = (hd) ((Object) stackIn_153_0);

                  if (param4) {
                    break L39;
                  } else {
                    stackIn_153_0 = (hd) ((Object) stackIn_153_0);

                    if (td.field_b) {
                      break L39;
                    } else {
                      stackIn_154_0 = (hd) ((Object) stackIn_153_0);
                      stackIn_154_1 = stackIn_153_1;
                      stackIn_154_2 = 1;
                      break L38;
                    }
                  }
                }
              }
              stackIn_154_0 = (hd) ((Object) stackIn_153_0);
              stackIn_154_1 = stackIn_153_1;
              stackIn_154_2 = 0;
              break L38;
            }
            L40: {
              L41: {
                ((hd) (Object) stackIn_154_0).b(stackIn_154_1, stackIn_154_2 != 0);
                stackIn_158_0 = tn.field_f;

                stackIn_158_1 = 0;

                if (!param0) {
                  break L41;
                } else {
                  stackIn_158_0 = (hd) ((Object) stackIn_158_0);

                  if (param4) {
                    break L41;
                  } else {
                    stackIn_158_0 = (hd) ((Object) stackIn_158_0);

                    if (!td.field_b) {
                      break L41;
                    } else {
                      stackIn_159_0 = (hd) ((Object) stackIn_158_0);
                      stackIn_159_1 = stackIn_158_1;
                      stackIn_159_2 = 1;
                      break L40;
                    }
                  }
                }
              }
              stackIn_159_0 = (hd) ((Object) stackIn_158_0);
              stackIn_159_1 = stackIn_158_1;
              stackIn_159_2 = 0;
              break L40;
            }
            L42: {
              ((hd) (Object) stackIn_159_0).b(stackIn_159_1, stackIn_159_2 != 0);
              ni.field_l.field_b.h((byte) 71);
              if (null == uv.field_i) {
                break L42;
              } else {
                L43: {
                  if (ac.field_b.field_sb != 0) {
                    gu.a(uv.field_i.h((byte) 73), (byte) -108, param1);
                    break L43;
                  } else {
                    break L43;
                  }
                }
                L44: {
                  if (ua.field_k.field_sb == 0) {
                    break L44;
                  } else {
                    gs.field_e = true;
                    break L44;
                  }
                }
                L45: {
                  if (-1 == (em.field_d.field_sb ^ -1)) {
                    break L45;
                  } else {
                    td.field_b = true;
                    break L45;
                  }
                }
                L46: {
                  if (kt.field_i.field_sb != 0) {
                    td.field_b = false;
                    break L46;
                  } else {
                    break L46;
                  }
                }
                ma.a(param1, (byte) -57, uv.field_i, false);
                break L42;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var5), "lu.DB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_o << 1243163011;
        param3 = (15 & var6) + (param3 << -448835164);
        int var7 = this.field_v << 576627171;
        param0 = (param0 << 510368324) + (var7 & 15);
        this.a(var6, var7, param3, param0, param2, param4);
        if (param1 != 24407) {
            lu.a(false, 46, 70, true, false);
        }
    }

    final static int a(hu param0, String param1, int param2, String[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var5_int = param0.a(param1);
              if (param4 < var5_int) {
                break L1;
              } else {
                if (param1.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param3[0] = param1;
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (param4 + var5_int - 1) / param4;
            param4 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            if (param2 == -46) {
              var9 = 0;
              L2: while (true) {
                if (var8 <= var9) {
                  L3: {
                    if (var8 <= var7) {
                      break L3;
                    } else {
                      incrementValue$0 = var6;
                      var6++;
                      param3[incrementValue$0] = param1.substring(var7, var8).trim();
                      break L3;
                    }
                  }
                  stackIn_23_0 = var6;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var10 = param1.charAt(var9);
                      if (-33 == (var10 ^ -1)) {
                        break L5;
                      } else {
                        if (var10 == 45) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var11 = param1.substring(var7, 1 + var9).trim();
                    var12 = param0.a(var11);
                    if (var12 < param4) {
                      break L4;
                    } else {
                      var7 = 1 + var9;
                      incrementValue$1 = var6;
                      var6++;
                      param3[incrementValue$1] = var11;
                      break L4;
                    }
                  }
                  if (var10 == 62) {
                    if (param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      param3[incrementValue$2] = param1.substring(var7, -3 + var9).trim();
                      var7 = 1 + var9;
                      var9++;
                      continue L2;
                    } else {
                      var9++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_7_0 = 59;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("lu.FB(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_23_0;
          }
        }
    }

    public static void g(byte param0) {
        if (param0 != -28) {
            lu.a(47, -58);
        }
        field_p = null;
        field_t = null;
        field_r = null;
        field_u = null;
        field_x = null;
    }

    lu() {
    }

    static {
        field_x = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_r = "Type your age in years";
        field_u = "Only show private chat from my friends and opponents";
    }
}
