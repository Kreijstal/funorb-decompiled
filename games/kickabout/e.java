/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends js {
    static String field_o;
    static mc field_k;
    private int field_l;
    private int field_h;
    static v[] field_n;
    static vq field_m;
    static int field_j;
    private boolean field_g;
    static eb field_i;

    final void a(int param0, boolean param1, int param2, js param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((e) this).field_h = param0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((e) this).field_g = stackIn_3_1 != 0;
        if (param2 > -28) {
          return;
        } else {
          L1: {
            if (((e) this).field_g) {
              break L1;
            } else {
              ((e) this).field_h = 256 - ((e) this).field_h;
              break L1;
            }
          }
          return;
        }
    }

    final static void a(np param0, int param1, boolean param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        tf var10 = null;
        Object var11 = null;
        int var11_int = 0;
        he var12 = null;
        int var13 = 0;
        hd var14 = null;
        hd var15 = null;
        hd var16 = null;
        hd var17 = null;
        hd var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        String var23 = null;
        int var23_int = 0;
        String var24 = null;
        int var24_int = 0;
        int var25_int = 0;
        String var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        np stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        np stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        np stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_44_0 = 0;
        int stackIn_60_0 = 0;
        hd stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        hd stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        hd stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        np stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        np stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        np stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        hd stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        hd stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        hd stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        L0: {
          L1: {
            var31 = Kickabout.field_G;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (null == uv.field_i) {
              break L1;
            } else {
              L2: {
                if (null != ds.field_h) {
                  break L2;
                } else {
                  if (lh.field_E != null) {
                    break L2;
                  } else {
                    if (null != so.field_f) {
                      break L2;
                    } else {
                      if (hm.field_D != null) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              var9 = 0;
              L3: while (true) {
                if (var9 >= ss.field_j) {
                  break L1;
                } else {
                  var10_int = uv.field_i.field_Eb[var9] & 255;
                  if (var31 != 0) {
                    break L0;
                  } else {
                    L4: {
                      if (ds.field_h == null) {
                        break L4;
                      } else {
                        if (null != ds.field_h[var9]) {
                          if (ds.field_h[var9][var10_int]) {
                            var5 = 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (lh.field_E == null) {
                        break L5;
                      } else {
                        if (null == lh.field_E[var9]) {
                          break L5;
                        } else {
                          L6: {
                            var11_int = lh.field_E[var9][var10_int];
                            if (0 == var11_int) {
                              break L6;
                            } else {
                              if (!fv.field_d) {
                                var5 = 1;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var11_int > var6) {
                            var6 = var11_int;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L7: {
                      if (null == hm.field_D) {
                        break L7;
                      } else {
                        if (null != hm.field_D[var9]) {
                          var8 = var8 | hm.field_D[var9][var10_int];
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (null == so.field_f) {
                        break L8;
                      } else {
                        if (null == so.field_f[var9]) {
                          break L8;
                        } else {
                          L9: {
                            var11_int = so.field_f[var9][var10_int];
                            if (0 == var11_int) {
                              break L9;
                            } else {
                              if (!fv.field_d) {
                                var5 = 1;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (var11_int > var7) {
                            var7 = var11_int;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    var9++;
                    if (var31 == 0) {
                      continue L3;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          L10: {
            stackOut_38_0 = (np) param0;
            stackOut_38_1 = param1 * (4 * sh.field_c - -8);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (ig.field_f != param0) {
              stackOut_40_0 = (np) (Object) stackIn_40_0;
              stackOut_40_1 = stackIn_40_1;
              stackOut_40_2 = 0;
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_39_0 = (np) (Object) stackIn_39_0;
              stackOut_39_1 = stackIn_39_1;
              stackOut_39_2 = 1;
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L10;
            }
          }
          L11: {
            if (((np) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2 == 0, param2, 2, false, (sh.field_c - -2) * 2)) {
              stackOut_43_0 = 0;
              stackIn_44_0 = stackOut_43_0;
              break L11;
            } else {
              stackOut_42_0 = 1;
              stackIn_44_0 = stackOut_42_0;
              break L11;
            }
          }
          var9 = stackIn_44_0;
          break L0;
        }
        L12: {
          var10 = param0.field_Ab.field_jb;
          if (param4 >= 0) {
            break L12;
          } else {
            e.a(112);
            break L12;
          }
        }
        var11 = null;
        var12 = (he) (Object) var10.g(24009);
        L13: while (true) {
          L14: {
            if (var12 == null) {
              break L14;
            } else {
              var13 = 0;
              if (var31 != 0) {
                break L14;
              } else {
                L15: {
                  if (var12.field_jb == null) {
                    L16: {
                      var12.field_Lb = new hd(0L, mp.field_f);
                      var12.a((byte) -120, var12.field_Lb);
                      var12.field_Ob = new hd(0L, pw.field_J);
                      if (!ui.field_t) {
                        break L16;
                      } else {
                        var12.a((byte) -127, var12.field_Ob);
                        break L16;
                      }
                    }
                    var12.field_Ob.field_A = 2;
                    var12.field_zb = new hd(0L, dw.field_e);
                    var12.a((byte) -112, var12.field_zb);
                    var12.b(false);
                    var12.field_Tb = new hd(0L, jc.field_r);
                    var12.a((byte) -115, var12.field_Tb);
                    var12.field_Hb = new hd(0L, mb.field_F);
                    var13 = 1;
                    var12.a((byte) -121, var12.field_Hb);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L17: {
                  var12.field_Lb.field_E = null;
                  var14 = var12.field_Lb;
                  var12.field_Lb.field_mb = 0;
                  var14.field_q = 0;
                  var12.field_Ob.field_E = null;
                  var12.field_Ob.field_mb = 0;
                  var15 = var12.field_Ob;
                  var15.field_q = 0;
                  var12.field_Tb.field_E = null;
                  var16 = var12.field_Tb;
                  var12.field_Tb.field_mb = 0;
                  var12.field_Hb.field_E = null;
                  var16.field_q = 0;
                  var12.field_Hb.field_mb = 0;
                  var17 = var12.field_Hb;
                  var17.field_q = 0;
                  var12.field_zb.field_E = null;
                  var12.field_zb.field_mb = 0;
                  var18 = var12.field_zb;
                  var18.field_q = 0;
                  var12.field_q = param0.field_Ab.field_q;
                  var19 = 0;
                  var20 = var12.field_Nb;
                  var21 = 72;
                  if (bf.field_u != param0) {
                    break L17;
                  } else {
                    var21 += 42;
                    break L17;
                  }
                }
                L18: {
                  var20 = hu.a(var12.field_Lb.field_X, var20, var21);
                  if (var20.equals((Object) (Object) var12.field_Nb)) {
                    stackOut_59_0 = 0;
                    stackIn_60_0 = stackOut_59_0;
                    break L18;
                  } else {
                    stackOut_58_0 = 1;
                    stackIn_60_0 = stackOut_58_0;
                    break L18;
                  }
                }
                L19: {
                  L20: {
                    var22 = stackIn_60_0;
                    if ((var12.field_Sb ^ -1) > -5) {
                      break L20;
                    } else {
                      var20 = "<img=" + (bk.field_e + var12.field_Sb + -4) + ">" + var20;
                      if (var31 == 0) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  if (0 < var12.field_Sb) {
                    var20 = "<img=" + (var12.field_Sb - 1) + ">" + var20;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L21: {
                  var12.field_Lb.field_E = var20;
                  if (var12.h(-13356)) {
                    break L21;
                  } else {
                    L22: {
                      L23: {
                        L24: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5 == 0) {
                            break L24;
                          } else {
                            if (!var12.field_Cb) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        if (var12.field_Qb < var6) {
                          break L23;
                        } else {
                          if (var7 > var12.field_Db) {
                            break L23;
                          } else {
                            if (-1 >= (var12.field_Pb & var8)) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      var24_int = 8421504;
                      var23_int = 8414771;
                      break L22;
                    }
                    L25: {
                      L26: {
                        var12.field_Tb.field_y = var23_int;
                        var12.field_Ob.field_y = var23_int;
                        var12.field_Lb.field_y = var23_int;
                        var12.field_Lb.field_H = var24_int;
                        var12.field_Lb.field_ab = var24_int;
                        var12.field_Lb.field_ub = var24_int;
                        var12.field_Ob.field_H = var24_int;
                        var12.field_Ob.field_ab = var24_int;
                        var12.field_Ob.field_ub = var24_int;
                        var12.field_Tb.field_H = var24_int;
                        var12.field_Tb.field_ab = var24_int;
                        var12.field_Tb.field_ub = var24_int;
                        if (param0 == bs.field_c) {
                          break L26;
                        } else {
                          L27: {
                            if (!var12.field_Gb) {
                              break L27;
                            } else {
                              var12.field_Lb.field_E = vo.a((byte) -18, ug.field_d, new String[1]);
                              var12.field_Hb.field_E = vt.field_a;
                              if (var31 == 0) {
                                break L25;
                              } else {
                                break L27;
                              }
                            }
                          }
                          L28: {
                            if (var12.field_Fb) {
                              break L28;
                            } else {
                              var12.field_Tb.field_E = nc.field_c;
                              break L28;
                            }
                          }
                          var12.field_Lb.field_E = vo.a((byte) -18, ni.field_p, new String[1]);
                          var12.field_Tb.field_E = kw.field_a;
                          var12.field_Hb.field_E = jo.field_A;
                          break L26;
                        }
                      }
                      if (!uv.field_i.field_Cb) {
                        var12.field_Hb.field_E = wk.field_a;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L29: {
                      var25_int = 0;
                      if (null == uv.field_i) {
                        break L29;
                      } else {
                        if (!np.a(38)) {
                          break L29;
                        } else {
                          if ((var12.field_Ab ^ -1L) != (dd.field_c ^ -1L)) {
                            L30: {
                              if (null == var12.field_Tb.field_E) {
                                break L30;
                              } else {
                                var26 = var12.field_Tb.g((byte) 122) + eb.field_b * 2;
                                var12.field_Tb.a(true, var26, var25_int, var19, sh.field_c);
                                var25_int = var25_int + var26;
                                break L30;
                              }
                            }
                            if (null == var12.field_Hb.field_E) {
                              break L29;
                            } else {
                              L31: {
                                L32: {
                                  if (param0 != bs.field_c) {
                                    break L32;
                                  } else {
                                    var26 = 40;
                                    if (var31 == 0) {
                                      break L31;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                                var26 = var12.field_Hb.g((byte) 113) + eb.field_b * 2;
                                break L31;
                              }
                              var12.field_Hb.a(true, var26, var25_int, var19, sh.field_c);
                              var25_int = var25_int + var26;
                              break L29;
                            }
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                    L33: {
                      stackOut_95_0 = var12.field_Lb;
                      stackOut_95_1 = 1;
                      stackOut_95_2 = -var25_int;
                      stackIn_97_0 = stackOut_95_0;
                      stackIn_97_1 = stackOut_95_1;
                      stackIn_97_2 = stackOut_95_2;
                      stackIn_96_0 = stackOut_95_0;
                      stackIn_96_1 = stackOut_95_1;
                      stackIn_96_2 = stackOut_95_2;
                      if (ui.field_t) {
                        stackOut_97_0 = (hd) (Object) stackIn_97_0;
                        stackOut_97_1 = stackIn_97_1;
                        stackOut_97_2 = stackIn_97_2;
                        stackOut_97_3 = 42;
                        stackIn_98_0 = stackOut_97_0;
                        stackIn_98_1 = stackOut_97_1;
                        stackIn_98_2 = stackOut_97_2;
                        stackIn_98_3 = stackOut_97_3;
                        break L33;
                      } else {
                        stackOut_96_0 = (hd) (Object) stackIn_96_0;
                        stackOut_96_1 = stackIn_96_1;
                        stackOut_96_2 = stackIn_96_2;
                        stackOut_96_3 = 0;
                        stackIn_98_0 = stackOut_96_0;
                        stackIn_98_1 = stackOut_96_1;
                        stackIn_98_2 = stackOut_96_2;
                        stackIn_98_3 = stackOut_96_3;
                        break L33;
                      }
                    }
                    ((hd) (Object) stackIn_98_0).a(stackIn_98_1 != 0, stackIn_98_2 + -stackIn_98_3 + var12.field_q, var25_int, var19, sh.field_c);
                    var12.field_Ob.field_E = Integer.toString(var12.field_Qb);
                    var12.field_Ob.a(true, 40, -40 + var12.field_q, var19, sh.field_c);
                    var19 = var19 + sh.field_c;
                    if (var12.field_Lb.field_gb) {
                      if (var22 != 0) {
                        sn.field_e = var12.field_Nb;
                        if (wm.field_o == null) {
                          break L21;
                        } else {
                          if (null == wm.field_o[var12.field_Sb]) {
                            break L21;
                          } else {
                            sn.field_e = sn.field_e + " - " + wm.field_o[var12.field_Sb];
                            if (var31 == 0) {
                              break L21;
                            } else {
                              if (!var12.field_Lb.field_gb) {
                                break L21;
                              } else {
                                if (null == wm.field_o) {
                                  break L21;
                                } else {
                                  if (null == wm.field_o[var12.field_Sb]) {
                                    break L21;
                                  } else {
                                    sn.field_e = wm.field_o[var12.field_Sb];
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (!var12.field_Lb.field_gb) {
                          break L21;
                        } else {
                          if (null == wm.field_o) {
                            break L21;
                          } else {
                            if (null == wm.field_o[var12.field_Sb]) {
                              break L21;
                            } else {
                              sn.field_e = wm.field_o[var12.field_Sb];
                              break L21;
                            }
                          }
                        }
                      }
                    } else {
                      if (!var12.field_Lb.field_gb) {
                        break L21;
                      } else {
                        if (null == wm.field_o) {
                          break L21;
                        } else {
                          if (null == wm.field_o[var12.field_Sb]) {
                            break L21;
                          } else {
                            sn.field_e = wm.field_o[var12.field_Sb];
                            break L21;
                          }
                        }
                      }
                    }
                  }
                }
                L34: {
                  var23 = kr.a(var20, var12.field_Mb, (byte) 73);
                  var24 = var23;
                  var24 = var23;
                  if (var23 == null) {
                    break L34;
                  } else {
                    var24_int = var12.field_zb.field_X.b(var23, -eb.field_b + var12.field_q + -eb.field_b);
                    var12.field_zb.field_E = var23;
                    var12.field_zb.field_U = var12.field_Jb * 256 / mg.field_c;
                    var12.field_zb.a(true, -(2 * eb.field_b) + var12.field_q, eb.field_b, var19, sh.field_c * var24_int);
                    var19 = var19 + var24_int * sh.field_c;
                    break L34;
                  }
                }
                L35: {
                  if (var9 != 0) {
                    break L35;
                  } else {
                    var12.field_L = var19 + -var12.field_mb;
                    break L35;
                  }
                }
                L36: {
                  if (var13 == 0) {
                    break L36;
                  } else {
                    param0.field_Ab.a(true, 2, (hd) (Object) var12, (hd) var11);
                    break L36;
                  }
                }
                L37: {
                  if (var12.field_sb == 0) {
                    break L37;
                  } else {
                    if (var12.h(-13356)) {
                      break L37;
                    } else {
                      L38: {
                        if (var12.field_Tb.field_sb == 0) {
                          break L38;
                        } else {
                          uc.a(var12.field_Ab, param3, 122);
                          if (var31 == 0) {
                            break L37;
                          } else {
                            break L38;
                          }
                        }
                      }
                      L39: {
                        if (var12.field_Hb.field_sb == 0) {
                          break L39;
                        } else {
                          ko.a(64, param3, var12.field_Ab);
                          break L39;
                        }
                      }
                      bv.a(vc.field_y, sm.field_q, 0, 95, 0, var12, param0);
                      break L37;
                    }
                  }
                }
                L40: {
                  var11 = (Object) (Object) var12;
                  if (!var12.field_Q) {
                    break L40;
                  } else {
                    if (!var12.h(-13356)) {
                      L41: {
                        var24 = null;
                        if ((dd.field_c ^ -1L) != (var12.field_Ab ^ -1L)) {
                          L42: {
                            if (var5 == 0) {
                              break L42;
                            } else {
                              if (var12.field_Cb) {
                                break L42;
                              } else {
                                var24 = vo.a((byte) -18, wh.field_v, new String[1]);
                                break L41;
                              }
                            }
                          }
                          if (var12.field_Db >= var7) {
                            if (var12.field_Qb < var6) {
                              var24 = vo.a((byte) -18, nu.field_D, new String[2]);
                              break L41;
                            } else {
                              if (((var12.field_Pb ^ -1) & var8) != 0) {
                                var25_int = ps.a((byte) -86, (var12.field_Pb ^ -1) & var8);
                                var24 = vo.a((byte) -18, il.field_e, new String[1]);
                                if (var25_int <= 0) {
                                  break L41;
                                } else {
                                  if (null == um.field_a) {
                                    break L41;
                                  } else {
                                    if (var25_int > um.field_a.length) {
                                      break L41;
                                    } else {
                                      if (um.field_a[-1 + var25_int] != null) {
                                        var24 = vo.a((byte) -18, um.field_a[var25_int - 1][2], new String[1]);
                                        break L41;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L41;
                              }
                            }
                          } else {
                            L43: {
                              var25_int = -var12.field_Db + var7;
                              if ((var25_int ^ -1) == -2) {
                                var24 = vo.a((byte) -18, qr.field_d, new String[1]);
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                            var24 = vo.a((byte) -18, rr.field_e, new String[2]);
                            break L41;
                          }
                        } else {
                          L44: {
                            if (var5 == 0) {
                              break L44;
                            } else {
                              if (!var12.field_Cb) {
                                var24 = ob.field_F;
                                break L41;
                              } else {
                                break L44;
                              }
                            }
                          }
                          if (var12.field_Db < var7) {
                            L45: {
                              var25_int = -var12.field_Db + var7;
                              if (1 == var25_int) {
                                var24 = kt.field_k;
                                break L45;
                              } else {
                                break L45;
                              }
                            }
                            var24 = vo.a((byte) -18, rn.field_h, new String[2]);
                            break L41;
                          } else {
                            if (var12.field_Qb >= var6) {
                              if ((var8 & (var12.field_Pb ^ -1)) == 0) {
                                break L41;
                              } else {
                                var25_int = ps.a((byte) -63, (var12.field_Pb ^ -1) & var8);
                                var24 = ca.field_e;
                                if ((var25_int ^ -1) >= -1) {
                                  break L41;
                                } else {
                                  if (null == um.field_a) {
                                    break L41;
                                  } else {
                                    if (var25_int > um.field_a.length) {
                                      break L41;
                                    } else {
                                      if (um.field_a[-1 + var25_int] != null) {
                                        var24 = um.field_a[-1 + var25_int][1];
                                        break L41;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var24 = vo.a((byte) -18, ic.field_c, new String[2]);
                              break L41;
                            }
                          }
                        }
                      }
                      if (var24 == null) {
                        break L40;
                      } else {
                        var24 = "<col=A00000>" + var24;
                        var30 = var24;
                        var25 = var30;
                        var24 = var25;
                        var30 = var24;
                        var25 = var30;
                        var25 = null;
                        var26 = 0;
                        var27_int = 0;
                        L46: while (true) {
                          L47: {
                            L48: {
                              L49: {
                                if (var27_int >= ss.field_j) {
                                  break L49;
                                } else {
                                  var28 = uv.field_i.field_Eb[var27_int] & 255;
                                  var29 = 0;
                                  if (var31 != 0) {
                                    break L48;
                                  } else {
                                    L50: {
                                      if (ds.field_h == null) {
                                        break L50;
                                      } else {
                                        if (null == ds.field_h[var27_int]) {
                                          break L50;
                                        } else {
                                          if (!ds.field_h[var27_int][var28]) {
                                            break L50;
                                          } else {
                                            if (!var12.field_Cb) {
                                              var29 = 1;
                                              break L50;
                                            } else {
                                              break L50;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L51: {
                                      if (null == lh.field_E) {
                                        break L51;
                                      } else {
                                        if (lh.field_E[var27_int] == null) {
                                          break L51;
                                        } else {
                                          L52: {
                                            var30_int = lh.field_E[var27_int][var28];
                                            if (var30_int == 0) {
                                              break L52;
                                            } else {
                                              if (fv.field_d) {
                                                break L52;
                                              } else {
                                                if (var12.field_Cb) {
                                                  break L52;
                                                } else {
                                                  var29 = 1;
                                                  break L52;
                                                }
                                              }
                                            }
                                          }
                                          if (var30_int > var12.field_Qb) {
                                            var29 = 1;
                                            break L51;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                    }
                                    L53: {
                                      if (null == so.field_f) {
                                        break L53;
                                      } else {
                                        if (null != so.field_f[var27_int]) {
                                          L54: {
                                            var30_int = so.field_f[var27_int][var28];
                                            if (0 == var30_int) {
                                              break L54;
                                            } else {
                                              if (fv.field_d) {
                                                break L54;
                                              } else {
                                                if (var12.field_Cb) {
                                                  break L54;
                                                } else {
                                                  var29 = 1;
                                                  break L54;
                                                }
                                              }
                                            }
                                          }
                                          if (var30_int <= var12.field_Db) {
                                            break L53;
                                          } else {
                                            var29 = 1;
                                            break L53;
                                          }
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                    L55: {
                                      if (null == hm.field_D) {
                                        break L55;
                                      } else {
                                        if (hm.field_D[var27_int] != null) {
                                          if (((var12.field_Pb ^ -1) & hm.field_D[var27_int][var28]) != 0) {
                                            var29 = 1;
                                            break L55;
                                          } else {
                                            break L55;
                                          }
                                        } else {
                                          break L55;
                                        }
                                      }
                                    }
                                    L56: {
                                      if (var29 == 0) {
                                        break L56;
                                      } else {
                                        L57: {
                                          var30 = "<col=A00000>" + ok.field_b[var27_int] + "</col>";
                                          var25 = var30;
                                          var24 = var25;
                                          var25 = var30;
                                          if (var25 == null) {
                                            break L57;
                                          } else {
                                            var26 = 1;
                                            var25 = var25 + ", " + var30;
                                            if (var31 == 0) {
                                              break L56;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                        var25 = var30;
                                        var24 = var25;
                                        var24 = var25;
                                        break L56;
                                      }
                                    }
                                    var27_int++;
                                    if (var31 == 0) {
                                      continue L46;
                                    } else {
                                      break L49;
                                    }
                                  }
                                }
                              }
                              if (param0 != bs.field_c) {
                                break L48;
                              } else {
                                if (!np.a(47)) {
                                  break L48;
                                } else {
                                  L58: {
                                    if (var26 == 0) {
                                      break L58;
                                    } else {
                                      var24 = var24 + "<br>" + vg.field_Cb + var25;
                                      if (var31 == 0) {
                                        break L47;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                  var24 = var24 + "<br>" + vo.a((byte) -18, oj.field_V, new String[1]);
                                  break L48;
                                }
                              }
                            }
                            L59: {
                              if (var26 == 0) {
                                break L59;
                              } else {
                                var24 = var24 + "<br>" + po.field_c + var25;
                                break L59;
                              }
                            }
                            var24 = var24 + "<br>" + vo.a((byte) -18, ak.field_l, new String[1]);
                            break L47;
                          }
                          L60: {
                            if (bs.field_c != param0) {
                              break L60;
                            } else {
                              if (np.a(111)) {
                                break L60;
                              } else {
                                var27 = uv.field_i.field_ec;
                                var24 = var24 + "<br>" + vo.a((byte) -18, qq.field_F, new String[1]);
                                break L60;
                              }
                            }
                          }
                          sn.field_e = var24;
                          break L40;
                        }
                      }
                    } else {
                      break L40;
                    }
                  }
                }
                var12 = (he) (Object) var10.c(33);
                continue L13;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, boolean param1) {
        if (((e) this).field_h == 256) {
            iu.field_k.d(0, 0);
        } else {
            iu.field_k.b(0, 0, ((e) this).field_h);
            if (Kickabout.field_G != 0) {
                iu.field_k.d(0, 0);
            }
        }
        if (param0 != -5) {
            ((e) this).a(-86, true, 42, (js) null);
        }
    }

    private final void b(int param0) {
        if (((e) this).field_g) {
          if (-257 < (((e) this).field_h ^ -1)) {
            return;
          } else {
            L0: {
              ((e) this).field_l = 0;
              if (param0 == -257) {
                break L0;
              } else {
                ((e) this).a(-112, true, 15, (js) null);
                break L0;
              }
            }
            mg.a((byte) -25);
            mv.a((byte) 122);
            jm.a(0, false, param0 + 255);
            return;
          }
        } else {
          L1: {
            ((e) this).field_l = 0;
            if (param0 == -257) {
              break L1;
            } else {
              ((e) this).a(-112, true, 15, (js) null);
              break L1;
            }
          }
          mg.a((byte) -25);
          mv.a((byte) 122);
          jm.a(0, false, param0 + 255);
          return;
        }
    }

    e() {
        super(-5);
        ((e) this).field_l = 40;
        ((e) this).field_h = 0;
        ((e) this).field_g = true;
    }

    final boolean a(int param0, int param1, char param2) {
        L0: {
          if (wh.field_q) {
            break L0;
          } else {
            if ((((e) this).field_l ^ -1) >= -1) {
              break L0;
            } else {
              this.b(-257);
              break L0;
            }
          }
        }
        if (param1 >= -5) {
          boolean discarded$2 = ((e) this).a(-30, -24, '2');
          return true;
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != -1) {
            field_j = 46;
        }
        field_n = null;
        field_o = null;
        field_m = null;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        L0: {
          var3 = -43 / ((38 - param0) / 60);
          if (wh.field_q) {
            break L0;
          } else {
            if (!param1) {
              break L0;
            } else {
              L1: {
                int fieldTemp$2 = ((e) this).field_l - 1;
                ((e) this).field_l = ((e) this).field_l - 1;
                if ((fieldTemp$2 ^ -1) >= -1) {
                  break L1;
                } else {
                  if (ip.field_a != 0) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              this.b(-257);
              break L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Select the pitch you'd like to play on.";
    }
}
