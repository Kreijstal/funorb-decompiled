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
        this.field_h = param0;
        this.field_g = param1 ? true : false;
        if (param2 > -28) {
            return;
        }
        try {
            if (!this.field_g) {
                this.field_h = 256 - this.field_h;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "e.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(np param0, int param1, boolean param2, int param3, int param4) {
        np stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        np stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_46_0 = 0;
        int stackIn_60_0 = 0;
        hd stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        hd stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        RuntimeException stackIn_214_0 = null;
        StringBuilder stackIn_214_1 = null;
        RuntimeException stackIn_215_0 = null;
        StringBuilder stackIn_215_1 = null;
        String stackIn_215_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        tf var10 = null;
        int var11_int = 0;
        Object var11 = null;
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
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        var31 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var5_int = 0;
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
                    L4: {
                      var10_int = uv.field_i.field_Eb[var9] & 255;
                      if (ds.field_h == null) {
                        break L4;
                      } else {
                        if (null != ds.field_h[var9]) {
                          if (ds.field_h[var9][var10_int]) {
                            var5_int = 1;
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
                                var5_int = 1;
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
                    if (null != so.field_f) {
                      if (null != so.field_f[var9]) {
                        L8: {
                          var11_int = so.field_f[var9][var10_int];
                          if (0 == var11_int) {
                            break L8;
                          } else {
                            if (!fv.field_d) {
                              var5_int = 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (var11_int > var7) {
                            var7 = var11_int;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var9++;
                        continue L3;
                      } else {
                        var9++;
                        continue L3;
                      }
                    } else {
                      var9++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L10: {
              stackIn_42_0 = (np) (param0);

              stackIn_42_1 = param1 * (4 * sh.field_c - -8);

              if (ig.field_f != param0) {
                stackIn_43_0 = (np) ((Object) stackIn_42_0);
                stackIn_43_1 = stackIn_42_1;
                stackIn_43_2 = 0;
                break L10;
              } else {
                stackIn_43_0 = (np) ((Object) stackIn_42_0);
                stackIn_43_1 = stackIn_42_1;
                stackIn_43_2 = 1;
                break L10;
              }
            }
            L11: {
              if (!((np) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2 != 0, param2, 2, false, (sh.field_c - -2) * 2)) {
                stackIn_46_0 = 0;
                break L11;
              } else {
                stackIn_46_0 = 1;
                break L11;
              }
            }
            L12: {
              var9 = stackIn_46_0;
              var10 = param0.field_Ab.field_jb;
              if (param4 >= 0) {
                break L12;
              } else {
                e.a(112);
                break L12;
              }
            }
            var11 = null;
            var12 = (he) ((Object) var10.g(24009));
            L13: while (true) {
              if (var12 == null) {
                break L0;
              } else {
                L14: {
                  var13 = 0;
                  if (var12.field_jb == null) {
                    L15: {
                      var12.field_Lb = new hd(0L, mp.field_f);
                      var12.a((byte) -120, var12.field_Lb);
                      var12.field_Ob = new hd(0L, pw.field_J);
                      if (!ui.field_t) {
                        break L15;
                      } else {
                        var12.a((byte) -127, var12.field_Ob);
                        break L15;
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
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L16: {
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
                  var32 = var12.field_Nb;
                  var21 = 72;
                  if (bf.field_u != param0) {
                    break L16;
                  } else {
                    var21 += 42;
                    break L16;
                  }
                }
                L17: {
                  var33 = hu.a(var12.field_Lb.field_X, var32, var21);
                  var20 = var33;
                  if (var33.equals(var12.field_Nb)) {
                    stackIn_60_0 = 0;
                    break L17;
                  } else {
                    stackIn_60_0 = 1;
                    break L17;
                  }
                }
                L18: {
                  var22 = stackIn_60_0;
                  if ((var12.field_Sb ^ -1) > -5) {
                    if (0 < var12.field_Sb) {
                      var20 = "<img=" + (var12.field_Sb - 1) + ">" + var33;
                      break L18;
                    } else {
                      break L18;
                    }
                  } else {
                    var20 = "<img=" + (bk.field_e + var12.field_Sb + -4) + ">" + var33;
                    break L18;
                  }
                }
                L19: {
                  var12.field_Lb.field_E = var20;
                  if (var12.h(-13356)) {
                    break L19;
                  } else {
                    L20: {
                      L21: {
                        L22: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5_int == 0) {
                            break L22;
                          } else {
                            if (!var12.field_Cb) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        if (var12.field_Qb < var6) {
                          break L21;
                        } else {
                          if (var7 > var12.field_Db) {
                            break L21;
                          } else {
                            if (-1 <= ((var12.field_Pb ^ -1) & var8 ^ -1)) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      var24_int = 8421504;
                      var23_int = 8414771;
                      break L20;
                    }
                    L23: {
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
                        if (!uv.field_i.field_Cb) {
                          var12.field_Hb.field_E = wk.field_a;
                          break L23;
                        } else {
                          break L23;
                        }
                      } else {
                        if (!var12.field_Gb) {
                          if (var12.field_Fb) {
                            var12.field_Lb.field_E = vo.a((byte) -18, ni.field_p, new String[]{var20});
                            var12.field_Tb.field_E = kw.field_a;
                            var12.field_Hb.field_E = jo.field_A;
                            break L23;
                          } else {
                            var12.field_Tb.field_E = nc.field_c;
                            break L23;
                          }
                        } else {
                          var12.field_Lb.field_E = vo.a((byte) -18, ug.field_d, new String[]{var20});
                          var12.field_Hb.field_E = vt.field_a;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      var25_int = 0;
                      if (null == uv.field_i) {
                        break L24;
                      } else {
                        if (!np.a(38)) {
                          break L24;
                        } else {
                          if ((var12.field_Ab ^ -1L) != (dd.field_c ^ -1L)) {
                            L25: {
                              if (null == var12.field_Tb.field_E) {
                                break L25;
                              } else {
                                var26 = var12.field_Tb.g((byte) 122) + eb.field_b * 2;
                                var12.field_Tb.a(true, var26, var25_int, var19, sh.field_c);
                                var25_int = var25_int + var26;
                                break L25;
                              }
                            }
                            if (null == var12.field_Hb.field_E) {
                              break L24;
                            } else {
                              L26: {
                                if (param0 != bs.field_c) {
                                  var26 = var12.field_Hb.g((byte) 113) + eb.field_b * 2;
                                  break L26;
                                } else {
                                  var26 = 40;
                                  break L26;
                                }
                              }
                              var12.field_Hb.a(true, var26, var25_int, var19, sh.field_c);
                              var25_int = var25_int + var26;
                              break L24;
                            }
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    L27: {
                      stackIn_96_0 = var12.field_Lb;

                      stackIn_96_1 = 1;

                      stackIn_96_2 = -var25_int;

                      if (ui.field_t) {
                        stackIn_97_0 = (hd) ((Object) stackIn_96_0);
                        stackIn_97_1 = stackIn_96_1;
                        stackIn_97_2 = stackIn_96_2;
                        stackIn_97_3 = 42;
                        break L27;
                      } else {
                        stackIn_97_0 = (hd) ((Object) stackIn_96_0);
                        stackIn_97_1 = stackIn_96_1;
                        stackIn_97_2 = stackIn_96_2;
                        stackIn_97_3 = 0;
                        break L27;
                      }
                    }
                    L28: {
                      ((hd) (Object) stackIn_97_0).a(stackIn_97_1 != 0, stackIn_97_2 + -stackIn_97_3 + var12.field_q, var25_int, var19, sh.field_c);
                      var12.field_Ob.field_E = Integer.toString(var12.field_Qb);
                      var12.field_Ob.a(true, 40, -40 + var12.field_q, var19, sh.field_c);
                      var19 = var19 + sh.field_c;
                      if (!var12.field_Lb.field_gb) {
                        break L28;
                      } else {
                        if (var22 == 0) {
                          break L28;
                        } else {
                          sn.field_e = var12.field_Nb;
                          if (wm.field_o == null) {
                            break L19;
                          } else {
                            if (null == wm.field_o[var12.field_Sb]) {
                              break L19;
                            } else {
                              sn.field_e = sn.field_e + " - " + wm.field_o[var12.field_Sb];
                              break L19;
                            }
                          }
                        }
                      }
                    }
                    if (!var12.field_Lb.field_gb) {
                      break L19;
                    } else {
                      if (null == wm.field_o) {
                        break L19;
                      } else {
                        if (null == wm.field_o[var12.field_Sb]) {
                          break L19;
                        } else {
                          sn.field_e = wm.field_o[var12.field_Sb];
                          break L19;
                        }
                      }
                    }
                  }
                }
                L29: {
                  var23 = kr.a(var20, var12.field_Mb, (byte) 73);
                  var24 = var23;
                  var30 = var24;
                  var25 = var30;
                  var24 = var23;
                  if (var23 == null) {
                    break L29;
                  } else {
                    var24_int = var12.field_zb.field_X.b(var23, -eb.field_b + var12.field_q + -eb.field_b);
                    var12.field_zb.field_E = var23;
                    var12.field_zb.field_U = var12.field_Jb * 256 / mg.field_c;
                    var12.field_zb.a(true, -(2 * eb.field_b) + var12.field_q, eb.field_b, var19, sh.field_c * var24_int);
                    var19 = var19 + var24_int * sh.field_c;
                    break L29;
                  }
                }
                L30: {
                  if (var9 != 0) {
                    break L30;
                  } else {
                    var12.field_L = var19 + -var12.field_mb;
                    break L30;
                  }
                }
                L31: {
                  if (var13 == 0) {
                    break L31;
                  } else {
                    param0.field_Ab.a(true, 2, var12, (hd) (var11));
                    break L31;
                  }
                }
                L32: {
                  if (var12.field_sb == 0) {
                    break L32;
                  } else {
                    if (var12.h(-13356)) {
                      break L32;
                    } else {
                      if (var12.field_Tb.field_sb == 0) {
                        if (var12.field_Hb.field_sb == 0) {
                          bv.a(vc.field_y, sm.field_q, 0, 95, 0, var12, param0);
                          break L32;
                        } else {
                          ko.a(64, param3, var12.field_Ab);
                          break L32;
                        }
                      } else {
                        uc.a(var12.field_Ab, param3, 122);
                        break L32;
                      }
                    }
                  }
                }
                L33: {
                  var11 = var12;
                  if (!var12.field_Q) {
                    break L33;
                  } else {
                    if (!var12.h(-13356)) {
                      L34: {
                        var24 = null;
                        if ((dd.field_c ^ -1L) != (var12.field_Ab ^ -1L)) {
                          L35: {
                            if (var5_int == 0) {
                              break L35;
                            } else {
                              if (var12.field_Cb) {
                                break L35;
                              } else {
                                var24 = vo.a((byte) -18, wh.field_v, new String[]{var20});
                                break L34;
                              }
                            }
                          }
                          if (var12.field_Db >= var7) {
                            if (var12.field_Qb < var6) {
                              var24 = vo.a((byte) -18, nu.field_D, new String[]{var20, Integer.toString(var6)});
                              var30 = var24;
                              var25 = var30;
                              var24 = var25;
                              var30 = var24;
                              var25 = var30;
                              break L34;
                            } else {
                              if (((var12.field_Pb ^ -1) & var8) != 0) {
                                var25_int = ps.a((byte) -86, (var12.field_Pb ^ -1) & var8);
                                var24 = vo.a((byte) -18, il.field_e, new String[]{var20});
                                if (var25_int <= 0) {
                                  break L34;
                                } else {
                                  if (null == um.field_a) {
                                    break L34;
                                  } else {
                                    if (var25_int > um.field_a.length) {
                                      break L34;
                                    } else {
                                      if (um.field_a[-1 + var25_int] != null) {
                                        var24 = vo.a((byte) -18, um.field_a[var25_int - 1][2], new String[]{var20});
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L34;
                              }
                            }
                          } else {
                            L36: {
                              var25_int = -var12.field_Db + var7;
                              if ((var25_int ^ -1) == -2) {
                                var24 = vo.a((byte) -18, qr.field_d, new String[]{var20});
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                            var24 = vo.a((byte) -18, rr.field_e, new String[]{var20, Integer.toString(var25_int)});
                            break L34;
                          }
                        } else {
                          L37: {
                            if (var5_int == 0) {
                              break L37;
                            } else {
                              if (!var12.field_Cb) {
                                var24 = ob.field_F;
                                break L34;
                              } else {
                                break L37;
                              }
                            }
                          }
                          if (var12.field_Db < var7) {
                            L38: {
                              var25_int = -var12.field_Db + var7;
                              if (1 == var25_int) {
                                var24 = kt.field_k;
                                break L38;
                              } else {
                                break L38;
                              }
                            }
                            var24 = vo.a((byte) -18, rn.field_h, new String[]{null, Integer.toString(var25_int)});
                            break L34;
                          } else {
                            if (var12.field_Qb >= var6) {
                              if ((var8 & (var12.field_Pb ^ -1)) == 0) {
                                break L34;
                              } else {
                                var25_int = ps.a((byte) -63, (var12.field_Pb ^ -1) & var8);
                                var24 = ca.field_e;
                                if ((var25_int ^ -1) >= -1) {
                                  break L34;
                                } else {
                                  if (null == um.field_a) {
                                    break L34;
                                  } else {
                                    if (var25_int > um.field_a.length) {
                                      break L34;
                                    } else {
                                      if (um.field_a[-1 + var25_int] != null) {
                                        var24 = um.field_a[-1 + var25_int][1];
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var24 = vo.a((byte) -18, ic.field_c, new String[]{null, Integer.toString(var6)});
                              break L34;
                            }
                          }
                        }
                      }
                      if (var24 == null) {
                        break L33;
                      } else {
                        var34 = "<col=A00000>" + (String) (var24);
                        var30_ref = var34;
                        var25 = var30_ref;
                        var24 = var25;
                        var30_ref = var34;
                        var25 = var30_ref;
                        var25 = null;
                        var26 = 0;
                        var27_int = 0;
                        L39: while (true) {
                          if (var27_int >= ss.field_j) {
                            L40: {
                              L41: {
                                if (param0 != bs.field_c) {
                                  break L41;
                                } else {
                                  if (!np.a(47)) {
                                    break L41;
                                  } else {
                                    if (var26 == 0) {
                                      var24 = var34 + "<br>" + vo.a((byte) -18, oj.field_V, new String[]{(String) (var25)});
                                      break L40;
                                    } else {
                                      var24 = var34 + "<br>" + vg.field_Cb + (String) (var25);
                                      break L40;
                                    }
                                  }
                                }
                              }
                              if (var26 == 0) {
                                var24 = var34 + "<br>" + vo.a((byte) -18, ak.field_l, new String[]{(String) (var25)});
                                break L40;
                              } else {
                                var24 = var34 + "<br>" + po.field_c + (String) (var25);
                                break L40;
                              }
                            }
                            L42: {
                              if (bs.field_c != param0) {
                                break L42;
                              } else {
                                if (np.a(111)) {
                                  break L42;
                                } else {
                                  var27 = uv.field_i.field_ec;
                                  var24 = (String) (var24) + "<br>" + vo.a((byte) -18, qq.field_F, new String[]{var27});
                                  break L42;
                                }
                              }
                            }
                            sn.field_e = (String) (var24);
                            break L33;
                          } else {
                            L43: {
                              var28 = uv.field_i.field_Eb[var27_int] & 255;
                              var29 = 0;
                              if (ds.field_h == null) {
                                break L43;
                              } else {
                                if (null == ds.field_h[var27_int]) {
                                  break L43;
                                } else {
                                  if (!ds.field_h[var27_int][var28]) {
                                    break L43;
                                  } else {
                                    if (!var12.field_Cb) {
                                      var29 = 1;
                                      break L43;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                              }
                            }
                            L44: {
                              if (null == lh.field_E) {
                                break L44;
                              } else {
                                if (lh.field_E[var27_int] == null) {
                                  break L44;
                                } else {
                                  L45: {
                                    var30_int = lh.field_E[var27_int][var28];
                                    if (var30_int == 0) {
                                      break L45;
                                    } else {
                                      if (fv.field_d) {
                                        break L45;
                                      } else {
                                        if (var12.field_Cb) {
                                          break L45;
                                        } else {
                                          var29 = 1;
                                          break L45;
                                        }
                                      }
                                    }
                                  }
                                  if (var30_int > var12.field_Qb) {
                                    var29 = 1;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                            }
                            L46: {
                              if (null == so.field_f) {
                                break L46;
                              } else {
                                if (null != so.field_f[var27_int]) {
                                  L47: {
                                    var30_int = so.field_f[var27_int][var28];
                                    if (0 == var30_int) {
                                      break L47;
                                    } else {
                                      if (fv.field_d) {
                                        break L47;
                                      } else {
                                        if (var12.field_Cb) {
                                          break L47;
                                        } else {
                                          var29 = 1;
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                  if (var30_int <= var12.field_Db) {
                                    break L46;
                                  } else {
                                    var29 = 1;
                                    break L46;
                                  }
                                } else {
                                  break L46;
                                }
                              }
                            }
                            L48: {
                              if (null == hm.field_D) {
                                break L48;
                              } else {
                                if (hm.field_D[var27_int] != null) {
                                  if (((var12.field_Pb ^ -1) & hm.field_D[var27_int][var28]) != 0) {
                                    var29 = 1;
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                } else {
                                  break L48;
                                }
                              }
                            }
                            if (var29 != 0) {
                              L49: {
                                var30_ref = "<col=A00000>" + ok.field_b[var27_int] + "</col>";
                                var25 = var30_ref;
                                var24 = var25;
                                var25 = var30_ref;
                                if (var25 == null) {
                                  var25 = var30_ref;
                                  var24 = var25;
                                  var24 = var25;
                                  break L49;
                                } else {
                                  var26 = 1;
                                  var25 = (String) (var25) + ", " + var30_ref;
                                  break L49;
                                }
                              }
                              var27_int++;
                              continue L39;
                            } else {
                              var27_int++;
                              continue L39;
                            }
                          }
                        }
                      }
                    } else {
                      var12 = (he) ((Object) var10.c(33));
                      continue L13;
                    }
                  }
                }
                var12 = (he) ((Object) var10.c(33));
                continue L13;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L50: {
            var5 = decompiledCaughtException;
            stackIn_214_0 = (RuntimeException) (var5);

            stackIn_214_1 = new StringBuilder().append("e.E(");

            if (param0 == null) {
              stackIn_215_0 = (RuntimeException) ((Object) stackIn_214_0);
              stackIn_215_1 = (StringBuilder) ((Object) stackIn_214_1);
              stackIn_215_2 = "null";
              break L50;
            } else {
              stackIn_215_0 = (RuntimeException) ((Object) stackIn_214_0);
              stackIn_215_1 = (StringBuilder) ((Object) stackIn_214_1);
              stackIn_215_2 = "{...}";
              break L50;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_215_0), stackIn_215_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        js var4;
        L0: {
          if (this.field_h != 256) {
            iu.field_k.b(0, 0, this.field_h);
            break L0;
          } else {
            iu.field_k.d(0, 0);
            break L0;
          }
        }
        L1: {
          if (param0 == -5) {
            break L1;
          } else {
            var4 = (js) null;
            this.a(-86, true, 42, (js) null);
            break L1;
          }
        }
    }

    private final void b(int param0) {
        if (this.field_g && -257 < (this.field_h ^ -1)) {
            return;
        }
        this.field_l = 0;
        if (param0 != -257) {
            js var3 = (js) null;
            this.a(-112, true, 15, (js) null);
        }
        mg.a((byte) -25);
        mv.a((byte) 122);
        jm.a(0, false, param0 + 255);
    }

    e() {
        super(-5);
        this.field_l = 40;
        this.field_h = 0;
        this.field_g = true;
    }

    final boolean a(int param0, int param1, char param2) {
        if (!wh.field_q && (this.field_l ^ -1) < -1) {
            this.b(-257);
        }
        if (param1 >= -5) {
            this.a(-30, -24, '2');
            return true;
        }
        return true;
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
        int fieldTemp$1 = 0;
        int var3;
        L0: {
          var3 = -43 / ((38 - param0) / 60);
          if (wh.field_q) {
            break L0;
          } else {
            if (!param1) {
              break L0;
            } else {
              L1: {
                fieldTemp$1 = this.field_l - 1;
                this.field_l = this.field_l - 1;
                if ((fieldTemp$1 ^ -1) >= -1) {
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
        field_o = "Select the pitch you'd like to play on.";
    }
}
