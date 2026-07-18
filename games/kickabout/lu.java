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
        var2.a(113, 5);
        var2.a(123, uv.field_i.field_bc);
        int var4 = (uv.field_i.field_Mb << 6) + uv.field_i.field_Wb;
        var2.a(106, var4);
        var2.a(0, uv.field_i.field_Eb.length, 1991220144, uv.field_i.field_Eb);
        var2.c(62, var2.field_n - var3);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
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
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        tf var17 = null;
        int var17_int = 0;
        Object var18 = null;
        he var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        hd var21 = null;
        int[] var22 = null;
        String var24 = null;
        int[] var25 = null;
        hd var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        hd stackIn_16_0 = null;
        hd stackIn_17_0 = null;
        hd stackIn_18_0 = null;
        hd stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_37_0 = 0;
        hd stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        hd stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        hd stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        hd stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        hd stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        int stackIn_145_2 = 0;
        hd stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        hd stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        hd stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        hd stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        hd stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        int stackIn_150_2 = 0;
        hd stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        hd stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        hd stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        hd stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        hd stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        RuntimeException decompiledCaughtException = null;
        hd stackOut_15_0 = null;
        hd stackOut_16_0 = null;
        hd stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        hd stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        hd stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        hd stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        hd stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        hd stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        int stackOut_143_2 = 0;
        hd stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        int stackOut_144_2 = 0;
        hd stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        hd stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        hd stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        hd stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        int stackOut_148_2 = 0;
        hd stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        int stackOut_149_2 = 0;
        hd stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        hd stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        hd stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        hd stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_153_2 = 0;
        hd stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
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
                    ci.field_h.field_E = vo.a((byte) -18, bv.field_m, new String[1]).toUpperCase();
                    nv.field_F.a(true, fp.field_p.field_q, 0, fp.field_p.field_mb - 40, 40);
                    nv.field_F.field_E = vo.a((byte) -18, wa.field_c, new String[1]);
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
                      if (fh.field_b > 0) {
                        L5: {
                          if (fh.field_b == 1) {
                            var10_ref_String = kp.field_i;
                            break L5;
                          } else {
                            var10_ref_String = vo.a((byte) -18, jb.field_f, new String[1]);
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
                        stackOut_15_0 = ua.field_k;
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (!param3) {
                          break L7;
                        } else {
                          stackOut_16_0 = (hd) (Object) stackIn_16_0;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (0L != vg.field_Ib) {
                            break L7;
                          } else {
                            stackOut_17_0 = (hd) (Object) stackIn_17_0;
                            stackOut_17_1 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            break L6;
                          }
                        }
                      }
                      stackOut_18_0 = (hd) (Object) stackIn_18_0;
                      stackOut_18_1 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
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
                                if (var10 >= 2) {
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
                                      var28 = la.field_k[var12];
                                      var27 = var28;
                                      var25 = var27;
                                      var22 = var25;
                                      var13_array = var22;
                                      var14_int = 0;
                                      L14: while (true) {
                                        L15: {
                                          if (var14_int >= var28.length) {
                                            var11_int = 1;
                                            var14_int = -1;
                                            var15 = 0;
                                            L16: while (true) {
                                              if (var28.length <= var15) {
                                                m.field_f[var14_int] = true;
                                                break L15;
                                              } else {
                                                L17: {
                                                  var16 = var28[var15];
                                                  if (var14_int >= var16) {
                                                    break L17;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                                var15 += 2;
                                                continue L16;
                                              }
                                            }
                                          } else {
                                            L18: {
                                              var15 = var28[var14_int];
                                              var16 = var13_array[var14_int + 1];
                                              if (var15 != -1) {
                                                if ((uv.field_i.field_Eb[var15] & 255) == var16) {
                                                  break L18;
                                                } else {
                                                  break L15;
                                                }
                                              } else {
                                                L19: {
                                                  if (0 == var10) {
                                                    stackOut_36_0 = uv.field_i.field_bc;
                                                    stackIn_37_0 = stackOut_36_0;
                                                    break L19;
                                                  } else {
                                                    stackOut_35_0 = uv.field_i.field_gc;
                                                    stackIn_37_0 = stackOut_35_0;
                                                    break L19;
                                                  }
                                                }
                                                var17_int = stackIn_37_0;
                                                if (var17_int == var16) {
                                                  break L18;
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
                    if (var10 < 2) {
                      ua.field_k.field_lb = false;
                      if (!ua.field_k.field_Q) {
                        break L2;
                      } else {
                        var11 = null;
                        var12 = 0;
                        var13_int = 0;
                        L20: while (true) {
                          if (ss.field_j <= var13_int) {
                            L21: {
                              if (var10 != 0) {
                                var13 = os.field_w;
                                if (var12 == 0) {
                                  var14 = vo.a((byte) -18, bp.field_yb, new String[1]);
                                  break L21;
                                } else {
                                  var14 = oi.field_k + (String) var11;
                                  break L21;
                                }
                              } else {
                                var13 = sb.field_g;
                                if (var12 != 0) {
                                  var14 = gm.field_S + (String) var11;
                                  break L21;
                                } else {
                                  var14 = vo.a((byte) -18, kb.field_D, new String[1]);
                                  break L21;
                                }
                              }
                            }
                            sn.field_e = "<col=A00000>" + var13 + "<br>" + var14;
                            break L2;
                          } else {
                            L22: {
                              if (m.field_f[var13_int]) {
                                var24 = "<col=A00000>" + ok.field_b[var13_int] + "</col>";
                                if (var11 == null) {
                                  var11 = (Object) (Object) var24;
                                  break L22;
                                } else {
                                  var12 = 1;
                                  var11 = (Object) (Object) ((String) var11 + ", " + var24);
                                  break L22;
                                }
                              } else {
                                break L22;
                              }
                            }
                            var13_int++;
                            continue L20;
                          }
                        }
                      }
                    } else {
                      L23: {
                        if (null != ds.field_h) {
                          break L23;
                        } else {
                          if (null != lh.field_E) {
                            break L23;
                          } else {
                            if (null != so.field_f) {
                              break L23;
                            } else {
                              if (null == hm.field_D) {
                                break L2;
                              } else {
                                break L23;
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
                      L24: while (true) {
                        if (var16 >= ss.field_j) {
                          var16 = 0;
                          var17 = bs.field_c.field_Ab.field_jb;
                          var18_ref = (he) (Object) var17.g(24009);
                          L25: while (true) {
                            L26: {
                              if (var18_ref == null) {
                                break L26;
                              } else {
                                L27: {
                                  if (var18_ref.h(-13356)) {
                                    break L27;
                                  } else {
                                    L28: {
                                      if (var11_int == 0) {
                                        break L28;
                                      } else {
                                        if (var18_ref.field_Cb) {
                                          break L28;
                                        } else {
                                          var16 = 1;
                                          break L26;
                                        }
                                      }
                                    }
                                    if (var18_ref.field_Qb >= var13_int) {
                                      if (var14_int > var18_ref.field_Db) {
                                        var16 = 1;
                                        break L26;
                                      } else {
                                        if ((var15 & ~var18_ref.field_Pb) > 0) {
                                          var16 = 1;
                                          break L26;
                                        } else {
                                          if (var12 == 0) {
                                            break L27;
                                          } else {
                                            var16 = 1;
                                            break L26;
                                          }
                                        }
                                      }
                                    } else {
                                      var16 = 1;
                                      break L26;
                                    }
                                  }
                                }
                                var18_ref = (he) (Object) var17.c(param2 ^ -33);
                                continue L25;
                              }
                            }
                            L29: {
                              if (tk.field_Ib < 2) {
                                break L29;
                              } else {
                                if (ne.field_G[12]) {
                                  var16 = 0;
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            if (var16 != 0) {
                              ua.field_k.field_lb = false;
                              if (ua.field_k.field_Q) {
                                if (ni.field_l.field_b.field_Db != 0) {
                                  sn.field_e = vo.a((byte) -18, pu.field_Fb, new String[1]);
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
                          L30: {
                            var17_int = 255 & uv.field_i.field_Eb[var16];
                            if (null == ds.field_h) {
                              break L30;
                            } else {
                              if (ds.field_h[var16] == null) {
                                break L30;
                              } else {
                                if (!ds.field_h[var16][var17_int]) {
                                  break L30;
                                } else {
                                  var11_int = 1;
                                  break L30;
                                }
                              }
                            }
                          }
                          L31: {
                            if (lh.field_E == null) {
                              break L31;
                            } else {
                              if (lh.field_E[var16] == null) {
                                break L31;
                              } else {
                                L32: {
                                  var18_int = lh.field_E[var16][var17_int];
                                  if (var18_int == 0) {
                                    break L32;
                                  } else {
                                    if (fv.field_d) {
                                      break L32;
                                    } else {
                                      var11_int = 1;
                                      break L32;
                                    }
                                  }
                                }
                                if (var18_int <= var13_int) {
                                  break L31;
                                } else {
                                  var13_int = var18_int;
                                  break L31;
                                }
                              }
                            }
                          }
                          L33: {
                            if (null == so.field_f) {
                              break L33;
                            } else {
                              if (so.field_f[var16] != null) {
                                L34: {
                                  var18_int = so.field_f[var16][var17_int];
                                  if (var18_int > var14_int) {
                                    var14_int = var18_int;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                if (var18_int == 0) {
                                  break L33;
                                } else {
                                  if (fv.field_d) {
                                    break L33;
                                  } else {
                                    var11_int = 1;
                                    break L33;
                                  }
                                }
                              } else {
                                L35: {
                                  if (null == hm.field_D) {
                                    break L35;
                                  } else {
                                    break L35;
                                  }
                                }
                                var16++;
                                continue L24;
                              }
                            }
                          }
                          L36: {
                            if (null == hm.field_D) {
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          var16++;
                          continue L24;
                        }
                      }
                    }
                  }
                }
                L37: {
                  if (vg.field_Ib == 0L) {
                    break L37;
                  } else {
                    L38: {
                      var9 = (int)(-nj.a(22) + vg.field_Ib);
                      var9 = (var9 - -999) / 1000;
                      if (var9 >= 1) {
                        break L38;
                      } else {
                        var9 = 1;
                        break L38;
                      }
                    }
                    var8.field_E = vo.a((byte) -18, gf.field_h, new String[1]);
                    break L37;
                  }
                }
                ka.field_c.field_E = vo.a((byte) -18, ib.field_F, new String[2]);
                break L1;
              }
            }
            L39: {
              L40: {
                stackOut_140_0 = dn.field_Cb;
                stackOut_140_1 = param2 ^ param2;
                stackIn_144_0 = stackOut_140_0;
                stackIn_144_1 = stackOut_140_1;
                stackIn_141_0 = stackOut_140_0;
                stackIn_141_1 = stackOut_140_1;
                if (!param0) {
                  break L40;
                } else {
                  stackOut_141_0 = (hd) (Object) stackIn_141_0;
                  stackOut_141_1 = stackIn_141_1;
                  stackIn_144_0 = stackOut_141_0;
                  stackIn_144_1 = stackOut_141_1;
                  stackIn_142_0 = stackOut_141_0;
                  stackIn_142_1 = stackOut_141_1;
                  if (param4) {
                    break L40;
                  } else {
                    stackOut_142_0 = (hd) (Object) stackIn_142_0;
                    stackOut_142_1 = stackIn_142_1;
                    stackIn_144_0 = stackOut_142_0;
                    stackIn_144_1 = stackOut_142_1;
                    stackIn_143_0 = stackOut_142_0;
                    stackIn_143_1 = stackOut_142_1;
                    if (td.field_b) {
                      break L40;
                    } else {
                      stackOut_143_0 = (hd) (Object) stackIn_143_0;
                      stackOut_143_1 = stackIn_143_1;
                      stackOut_143_2 = 1;
                      stackIn_145_0 = stackOut_143_0;
                      stackIn_145_1 = stackOut_143_1;
                      stackIn_145_2 = stackOut_143_2;
                      break L39;
                    }
                  }
                }
              }
              stackOut_144_0 = (hd) (Object) stackIn_144_0;
              stackOut_144_1 = stackIn_144_1;
              stackOut_144_2 = 0;
              stackIn_145_0 = stackOut_144_0;
              stackIn_145_1 = stackOut_144_1;
              stackIn_145_2 = stackOut_144_2;
              break L39;
            }
            L41: {
              L42: {
                ((hd) (Object) stackIn_145_0).b(stackIn_145_1, stackIn_145_2 != 0);
                stackOut_145_0 = fp.field_p;
                stackOut_145_1 = 0;
                stackIn_149_0 = stackOut_145_0;
                stackIn_149_1 = stackOut_145_1;
                stackIn_146_0 = stackOut_145_0;
                stackIn_146_1 = stackOut_145_1;
                if (!param0) {
                  break L42;
                } else {
                  stackOut_146_0 = (hd) (Object) stackIn_146_0;
                  stackOut_146_1 = stackIn_146_1;
                  stackIn_149_0 = stackOut_146_0;
                  stackIn_149_1 = stackOut_146_1;
                  stackIn_147_0 = stackOut_146_0;
                  stackIn_147_1 = stackOut_146_1;
                  if (param4) {
                    break L42;
                  } else {
                    stackOut_147_0 = (hd) (Object) stackIn_147_0;
                    stackOut_147_1 = stackIn_147_1;
                    stackIn_149_0 = stackOut_147_0;
                    stackIn_149_1 = stackOut_147_1;
                    stackIn_148_0 = stackOut_147_0;
                    stackIn_148_1 = stackOut_147_1;
                    if (td.field_b) {
                      break L42;
                    } else {
                      stackOut_148_0 = (hd) (Object) stackIn_148_0;
                      stackOut_148_1 = stackIn_148_1;
                      stackOut_148_2 = 1;
                      stackIn_150_0 = stackOut_148_0;
                      stackIn_150_1 = stackOut_148_1;
                      stackIn_150_2 = stackOut_148_2;
                      break L41;
                    }
                  }
                }
              }
              stackOut_149_0 = (hd) (Object) stackIn_149_0;
              stackOut_149_1 = stackIn_149_1;
              stackOut_149_2 = 0;
              stackIn_150_0 = stackOut_149_0;
              stackIn_150_1 = stackOut_149_1;
              stackIn_150_2 = stackOut_149_2;
              break L41;
            }
            L43: {
              L44: {
                ((hd) (Object) stackIn_150_0).b(stackIn_150_1, stackIn_150_2 != 0);
                stackOut_150_0 = tn.field_f;
                stackOut_150_1 = 0;
                stackIn_154_0 = stackOut_150_0;
                stackIn_154_1 = stackOut_150_1;
                stackIn_151_0 = stackOut_150_0;
                stackIn_151_1 = stackOut_150_1;
                if (!param0) {
                  break L44;
                } else {
                  stackOut_151_0 = (hd) (Object) stackIn_151_0;
                  stackOut_151_1 = stackIn_151_1;
                  stackIn_154_0 = stackOut_151_0;
                  stackIn_154_1 = stackOut_151_1;
                  stackIn_152_0 = stackOut_151_0;
                  stackIn_152_1 = stackOut_151_1;
                  if (param4) {
                    break L44;
                  } else {
                    stackOut_152_0 = (hd) (Object) stackIn_152_0;
                    stackOut_152_1 = stackIn_152_1;
                    stackIn_154_0 = stackOut_152_0;
                    stackIn_154_1 = stackOut_152_1;
                    stackIn_153_0 = stackOut_152_0;
                    stackIn_153_1 = stackOut_152_1;
                    if (!td.field_b) {
                      break L44;
                    } else {
                      stackOut_153_0 = (hd) (Object) stackIn_153_0;
                      stackOut_153_1 = stackIn_153_1;
                      stackOut_153_2 = 1;
                      stackIn_155_0 = stackOut_153_0;
                      stackIn_155_1 = stackOut_153_1;
                      stackIn_155_2 = stackOut_153_2;
                      break L43;
                    }
                  }
                }
              }
              stackOut_154_0 = (hd) (Object) stackIn_154_0;
              stackOut_154_1 = stackIn_154_1;
              stackOut_154_2 = 0;
              stackIn_155_0 = stackOut_154_0;
              stackIn_155_1 = stackOut_154_1;
              stackIn_155_2 = stackOut_154_2;
              break L43;
            }
            L45: {
              ((hd) (Object) stackIn_155_0).b(stackIn_155_1, stackIn_155_2 != 0);
              ni.field_l.field_b.h((byte) 71);
              if (null == uv.field_i) {
                break L45;
              } else {
                L46: {
                  if (ac.field_b.field_sb != 0) {
                    gu.a(uv.field_i.h((byte) 73), (byte) -108, param1);
                    break L46;
                  } else {
                    break L46;
                  }
                }
                L47: {
                  if (ua.field_k.field_sb == 0) {
                    break L47;
                  } else {
                    gs.field_e = true;
                    break L47;
                  }
                }
                L48: {
                  if (em.field_d.field_sb == 0) {
                    break L48;
                  } else {
                    td.field_b = true;
                    break L48;
                  }
                }
                L49: {
                  if (kt.field_i.field_sb != 0) {
                    td.field_b = false;
                    break L49;
                  } else {
                    break L49;
                  }
                }
                ma.a(param1, (byte) -57, uv.field_i, false);
                break L45;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var5, "lu.DB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = ((lu) this).field_o << 3;
        param3 = (15 & var6) + (param3 << 4);
        int var7 = ((lu) this).field_v << 3;
        param0 = (param0 << 4) + (var7 & 15);
        ((lu) this).a(var6, var7, param3, param0, param2, param4);
        if (param1 != 24407) {
            lu.a(false, 46, 70, true, false);
        }
    }

    final static int a(hu param0, String param1, int param2, String[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
                  param3[0] = (String) (Object) param3;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
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
                      int incrementValue$2 = var6;
                      var6++;
                      param3[incrementValue$2] = param1.substring(var7, var8).trim();
                      break L3;
                    }
                  }
                  stackOut_20_0 = var6;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var10 = param1.charAt(var9);
                      if (var10 == 32) {
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
                      int incrementValue$3 = var6;
                      var6++;
                      param3[incrementValue$3] = var11;
                      break L4;
                    }
                  }
                  L6: {
                    if (var10 != 62) {
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackOut_6_0 = 59;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("lu.FB(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param4 + ')');
        }
        return stackIn_21_0;
    }

    public static void g(byte param0) {
        field_p = null;
        field_t = null;
        field_r = null;
        field_u = null;
        field_x = null;
    }

    lu() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_r = "Type your age in years";
        field_u = "Only show private chat from my friends and opponents";
    }
}
