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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((e) this).field_h = param0;
                        ((e) this).field_g = param1;
                        if (param2 <= -28) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        if (((e) this).field_g) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((e) this).field_h = 256 - ((e) this).field_h;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) runtimeException;
                        stackOut_6_1 = new StringBuilder().append("e.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (param3 == null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                        stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                        stackOut_7_2 = "{...}";
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_10_2 = stackOut_7_2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 9: {
                    stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                    stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                    stackOut_9_2 = "null";
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(np param0, int param1, boolean param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        tf var10 = null;
        int var10_int = 0;
        he var11 = null;
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
        int var24_int = 0;
        String var24 = null;
        String var24_ref = null;
        int var25_int = 0;
        String var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        int var30_int = 0;
        String var30 = null;
        int var31 = 0;
        np stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        np stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        np stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_69_0 = 0;
        hd stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        hd stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        hd stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        np stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        np stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        np stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        hd stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        hd stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_117_3 = 0;
        hd stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        int stackOut_116_3 = 0;
        L0: {
          L1: {
            var31 = Kickabout.field_G;
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
                          if ((var11_int ^ -1) < (var6 ^ -1)) {
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
                                var5_int = 1;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if ((var11_int ^ -1) < (var7 ^ -1)) {
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
            stackOut_49_0 = (np) param0;
            stackOut_49_1 = param1 * (4 * sh.field_c - -8);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (ig.field_f != param0) {
              stackOut_51_0 = (np) (Object) stackIn_51_0;
              stackOut_51_1 = stackIn_51_1;
              stackOut_51_2 = 0;
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L10;
            } else {
              stackOut_50_0 = (np) (Object) stackIn_50_0;
              stackOut_50_1 = stackIn_50_1;
              stackOut_50_2 = 1;
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L10;
            }
          }
          var9 = ((np) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2 != 0, param2, 2, false, (sh.field_c - -2) * 2) ? 1 : 0;
          break L0;
        }
        L11: {
          var10 = param0.field_Ab.field_jb;
          if (param4 >= 0) {
            break L11;
          } else {
            e.a(112);
            break L11;
          }
        }
        var11 = null;
        var12 = (he) (Object) var10.g(24009);
        L12: while (true) {
          L13: {
            L14: {
              if (null == var12) {
                break L14;
              } else {
                var13 = 0;
                if (var31 != 0) {
                  break L13;
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
                      stackOut_68_0 = 0;
                      stackIn_69_0 = stackOut_68_0;
                      break L18;
                    } else {
                      stackOut_67_0 = 1;
                      stackIn_69_0 = stackOut_67_0;
                      break L18;
                    }
                  }
                  L19: {
                    L20: {
                      var22 = stackIn_69_0;
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
                            if (var5_int == 0) {
                              break L24;
                            } else {
                              if (!var12.field_Cb) {
                                break L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                          if ((var12.field_Qb ^ -1) > (var6 ^ -1)) {
                            break L23;
                          } else {
                            if ((var7 ^ -1) < (var12.field_Db ^ -1)) {
                              break L23;
                            } else {
                              if (-1 <= ((var12.field_Pb ^ -1) & var8 ^ -1)) {
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
                                if (var31 == 0) {
                                  break L25;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            var12.field_Lb.field_E = vo.a((byte) -18, ni.field_p, new String[1]);
                            var12.field_Tb.field_E = kw.field_a;
                            var12.field_Hb.field_E = jo.field_A;
                            if (var31 == 0) {
                              break L25;
                            } else {
                              break L26;
                            }
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
                        stackOut_115_0 = var12.field_Lb;
                        stackOut_115_1 = 1;
                        stackOut_115_2 = -var25_int;
                        stackIn_117_0 = stackOut_115_0;
                        stackIn_117_1 = stackOut_115_1;
                        stackIn_117_2 = stackOut_115_2;
                        stackIn_116_0 = stackOut_115_0;
                        stackIn_116_1 = stackOut_115_1;
                        stackIn_116_2 = stackOut_115_2;
                        if (ui.field_t) {
                          stackOut_117_0 = (hd) (Object) stackIn_117_0;
                          stackOut_117_1 = stackIn_117_1;
                          stackOut_117_2 = stackIn_117_2;
                          stackOut_117_3 = 42;
                          stackIn_118_0 = stackOut_117_0;
                          stackIn_118_1 = stackOut_117_1;
                          stackIn_118_2 = stackOut_117_2;
                          stackIn_118_3 = stackOut_117_3;
                          break L33;
                        } else {
                          stackOut_116_0 = (hd) (Object) stackIn_116_0;
                          stackOut_116_1 = stackIn_116_1;
                          stackOut_116_2 = stackIn_116_2;
                          stackOut_116_3 = 0;
                          stackIn_118_0 = stackOut_116_0;
                          stackIn_118_1 = stackOut_116_1;
                          stackIn_118_2 = stackOut_116_2;
                          stackIn_118_3 = stackOut_116_3;
                          break L33;
                        }
                      }
                      L34: {
                        ((hd) (Object) stackIn_118_0).a(stackIn_118_1 != 0, stackIn_118_2 + -stackIn_118_3 + var12.field_q, var25_int, var19, sh.field_c);
                        var12.field_Ob.field_E = Integer.toString(var12.field_Qb);
                        var12.field_Ob.a(true, 40, -40 + var12.field_q, var19, sh.field_c);
                        var19 = var19 + sh.field_c;
                        if (!var12.field_Lb.field_gb) {
                          break L34;
                        } else {
                          if (var22 == 0) {
                            break L34;
                          } else {
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
                                  break L34;
                                }
                              }
                            }
                          }
                        }
                      }
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
                  L35: {
                    var23 = kr.a(var20, var12.field_Mb, (byte) 73);
                    if (var23 == null) {
                      break L35;
                    } else {
                      var24_int = var12.field_zb.field_X.b(var23, -eb.field_b + var12.field_q + -eb.field_b);
                      var12.field_zb.field_E = var23;
                      var12.field_zb.field_U = var12.field_Jb * 256 / mg.field_c;
                      var12.field_zb.a(true, -(2 * eb.field_b) + var12.field_q, eb.field_b, var19, sh.field_c * var24_int);
                      var19 = var19 + var24_int * sh.field_c;
                      break L35;
                    }
                  }
                  L36: {
                    if (var9 != 0) {
                      break L36;
                    } else {
                      var12.field_L = var19 + -var12.field_mb;
                      break L36;
                    }
                  }
                  L37: {
                    if (var13 == 0) {
                      break L37;
                    } else {
                      param0.field_Ab.a(true, 2, (hd) (Object) var12, (hd) (Object) var11);
                      break L37;
                    }
                  }
                  L38: {
                    if (var12.field_sb == 0) {
                      break L38;
                    } else {
                      if (var12.h(-13356)) {
                        break L38;
                      } else {
                        L39: {
                          if ((var12.field_Tb.field_sb ^ -1) == -1) {
                            break L39;
                          } else {
                            uc.a(var12.field_Ab, param3, 122);
                            if (var31 == 0) {
                              break L38;
                            } else {
                              break L39;
                            }
                          }
                        }
                        L40: {
                          if ((var12.field_Hb.field_sb ^ -1) == -1) {
                            break L40;
                          } else {
                            ko.a(64, param3, var12.field_Ab);
                            if (var31 == 0) {
                              break L38;
                            } else {
                              break L40;
                            }
                          }
                        }
                        bv.a(vc.field_y, sm.field_q, 0, 95, 0, var12, param0);
                        break L38;
                      }
                    }
                  }
                  L41: {
                    var11 = var12;
                    if (!var12.field_Q) {
                      break L41;
                    } else {
                      if (!var12.h(-13356)) {
                        L42: {
                          var24 = null;
                          if ((dd.field_c ^ -1L) != (var12.field_Ab ^ -1L)) {
                            L43: {
                              if (var5_int == 0) {
                                break L43;
                              } else {
                                if (var12.field_Cb) {
                                  break L43;
                                } else {
                                  var24 = vo.a((byte) -18, wh.field_v, new String[1]);
                                  break L42;
                                }
                              }
                            }
                            if (var12.field_Db >= var7) {
                              if (var12.field_Qb < var6) {
                                var24 = vo.a((byte) -18, nu.field_D, new String[2]);
                                break L42;
                              } else {
                                if (((var12.field_Pb ^ -1) & var8) != 0) {
                                  L44: {
                                    var25_int = ps.a((byte) -86, (var12.field_Pb ^ -1) & var8);
                                    var24 = vo.a((byte) -18, il.field_e, new String[1]);
                                    if (var25_int <= 0) {
                                      break L44;
                                    } else {
                                      if (null == um.field_a) {
                                        break L44;
                                      } else {
                                        if ((var25_int ^ -1) < (um.field_a.length ^ -1)) {
                                          break L44;
                                        } else {
                                          if (um.field_a[-1 + var25_int] != null) {
                                            var24 = vo.a((byte) -18, um.field_a[var25_int - 1][2], new String[1]);
                                            break L44;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                            } else {
                              L45: {
                                var25_int = -var12.field_Db + var7;
                                if ((var25_int ^ -1) == -2) {
                                  var24 = vo.a((byte) -18, qr.field_d, new String[1]);
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              var24 = vo.a((byte) -18, rr.field_e, new String[2]);
                              break L42;
                            }
                          } else {
                            L46: {
                              if (var5_int == 0) {
                                break L46;
                              } else {
                                if (!var12.field_Cb) {
                                  var24 = ob.field_F;
                                  break L42;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            if (var12.field_Db < var7) {
                              L47: {
                                var25_int = -var12.field_Db + var7;
                                if (1 == var25_int) {
                                  var24 = kt.field_k;
                                  break L47;
                                } else {
                                  break L47;
                                }
                              }
                              var24 = vo.a((byte) -18, rn.field_h, new String[2]);
                              break L42;
                            } else {
                              if (var12.field_Qb >= var6) {
                                if ((var8 & (var12.field_Pb ^ -1) ^ -1) == -1) {
                                  break L42;
                                } else {
                                  L48: {
                                    var25_int = ps.a((byte) -63, (var12.field_Pb ^ -1) & var8);
                                    var24 = ca.field_e;
                                    if ((var25_int ^ -1) >= -1) {
                                      break L48;
                                    } else {
                                      if (null == um.field_a) {
                                        break L48;
                                      } else {
                                        if ((var25_int ^ -1) < (um.field_a.length ^ -1)) {
                                          break L48;
                                        } else {
                                          if (um.field_a[-1 + var25_int] != null) {
                                            var24_ref = um.field_a[-1 + var25_int][1];
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L42;
                                }
                              } else {
                                var24 = vo.a((byte) -18, ic.field_c, new String[2]);
                                break L42;
                              }
                            }
                          }
                        }
                        if (null == var24) {
                          break L41;
                        } else {
                          var24 = "<col=A00000>" + var24;
                          var25 = null;
                          var26 = 0;
                          var27_int = 0;
                          L49: while (true) {
                            L50: {
                              L51: {
                                L52: {
                                  if (var27_int >= ss.field_j) {
                                    break L52;
                                  } else {
                                    var28 = uv.field_i.field_Eb[var27_int] & 255;
                                    var29 = 0;
                                    if (var31 != 0) {
                                      break L51;
                                    } else {
                                      L53: {
                                        if (ds.field_h == null) {
                                          break L53;
                                        } else {
                                          if (null == ds.field_h[var27_int]) {
                                            break L53;
                                          } else {
                                            if (!ds.field_h[var27_int][var28]) {
                                              break L53;
                                            } else {
                                              if (!var12.field_Cb) {
                                                var29 = 1;
                                                break L53;
                                              } else {
                                                break L53;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L54: {
                                        if (null == lh.field_E) {
                                          break L54;
                                        } else {
                                          if (lh.field_E[var27_int] == null) {
                                            break L54;
                                          } else {
                                            L55: {
                                              var30_int = lh.field_E[var27_int][var28];
                                              if (var30_int == 0) {
                                                break L55;
                                              } else {
                                                if (fv.field_d) {
                                                  break L55;
                                                } else {
                                                  if (var12.field_Cb) {
                                                    break L55;
                                                  } else {
                                                    var29 = 1;
                                                    break L55;
                                                  }
                                                }
                                              }
                                            }
                                            if ((var30_int ^ -1) < (var12.field_Qb ^ -1)) {
                                              var29 = 1;
                                              break L54;
                                            } else {
                                              break L54;
                                            }
                                          }
                                        }
                                      }
                                      L56: {
                                        if (null == so.field_f) {
                                          break L56;
                                        } else {
                                          if (null != so.field_f[var27_int]) {
                                            L57: {
                                              var30_int = so.field_f[var27_int][var28];
                                              if (0 == var30_int) {
                                                break L57;
                                              } else {
                                                if (fv.field_d) {
                                                  break L57;
                                                } else {
                                                  if (var12.field_Cb) {
                                                    break L57;
                                                  } else {
                                                    var29 = 1;
                                                    break L57;
                                                  }
                                                }
                                              }
                                            }
                                            if ((var30_int ^ -1) >= (var12.field_Db ^ -1)) {
                                              break L56;
                                            } else {
                                              var29 = 1;
                                              break L56;
                                            }
                                          } else {
                                            break L56;
                                          }
                                        }
                                      }
                                      L58: {
                                        if (null == hm.field_D) {
                                          break L58;
                                        } else {
                                          if (hm.field_D[var27_int] != null) {
                                            if (((var12.field_Pb ^ -1) & hm.field_D[var27_int][var28]) != 0) {
                                              var29 = 1;
                                              break L58;
                                            } else {
                                              break L58;
                                            }
                                          } else {
                                            break L58;
                                          }
                                        }
                                      }
                                      L59: {
                                        if (var29 == 0) {
                                          break L59;
                                        } else {
                                          L60: {
                                            var30 = "<col=A00000>" + ok.field_b[var27_int] + "</col>";
                                            if (var25 == null) {
                                              break L60;
                                            } else {
                                              var26 = 1;
                                              var25 = var25 + ", " + var30;
                                              if (var31 == 0) {
                                                break L59;
                                              } else {
                                                break L60;
                                              }
                                            }
                                          }
                                          var25 = var30;
                                          break L59;
                                        }
                                      }
                                      var27_int++;
                                      if (var31 == 0) {
                                        continue L49;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                }
                                if (param0 != bs.field_c) {
                                  break L51;
                                } else {
                                  if (!np.a(47)) {
                                    break L51;
                                  } else {
                                    L61: {
                                      if (var26 == 0) {
                                        break L61;
                                      } else {
                                        var24 = var24 + "<br>" + vg.field_Cb + var25;
                                        if (var31 == 0) {
                                          break L50;
                                        } else {
                                          break L61;
                                        }
                                      }
                                    }
                                    var24 = var24 + "<br>" + vo.a((byte) -18, oj.field_V, new String[1]);
                                    if (var31 == 0) {
                                      break L50;
                                    } else {
                                      break L51;
                                    }
                                  }
                                }
                              }
                              L62: {
                                if (var26 == 0) {
                                  break L62;
                                } else {
                                  var24 = var24 + "<br>" + po.field_c + var25;
                                  if (var31 == 0) {
                                    break L50;
                                  } else {
                                    break L62;
                                  }
                                }
                              }
                              var24 = var24 + "<br>" + vo.a((byte) -18, ak.field_l, new String[1]);
                              break L50;
                            }
                            L63: {
                              if (bs.field_c != param0) {
                                break L63;
                              } else {
                                if (np.a(111)) {
                                  break L63;
                                } else {
                                  var27 = uv.field_i.field_ec;
                                  var24 = var24 + "<br>" + vo.a((byte) -18, qq.field_F, new String[1]);
                                  break L63;
                                }
                              }
                            }
                            sn.field_e = var24;
                            break L41;
                          }
                        }
                      } else {
                        break L41;
                      }
                    }
                  }
                  var12 = (he) (Object) var10.c(33);
                  if (var31 == 0) {
                    continue L12;
                  } else {
                    break L14;
                  }
                }
              }
            }
            break L13;
          }
          return;
        }
    }

    final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((e) this).field_h == 256) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        iu.field_k.b(0, 0, ((e) this).field_h);
                        if (Kickabout.field_G == 0) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        iu.field_k.d(0, 0);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == -5) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((e) this).a(-86, true, 42, (js) null);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var3, "e.A(" + param0 + 44 + param1 + 41);
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!((e) this).field_g) {
              break L0;
            } else {
              if (-257 >= (((e) this).field_h ^ -1)) {
                break L0;
              } else {
                return;
              }
            }
          }
          try {
            L1: {
              ((e) this).field_l = 0;
              if (param0 == -257) {
                break L1;
              } else {
                ((e) this).a(-112, true, 15, (js) null);
                break L1;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          mg.a((byte) -25);
          mv.a((byte) 122);
          jm.a(0, false, param0 + 255);
        }
    }

    e() {
        super(-5);
        ((e) this).field_l = 40;
        ((e) this).field_h = 0;
        ((e) this).field_g = true;
    }

    final boolean a(int param0, int param1, char param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        int stackIn_13_0 = 0;
        Object stackOut_1_0 = null;
        int stackOut_12_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (wh.field_q) {
                            statePc = 8;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = this;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((((e) this).field_l ^ -1) >= -1) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.b(-257);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param1 < -5) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        boolean discarded$2 = ((e) this).a(-30, -24, '2');
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var4, "e.G(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_i = null;
              field_k = null;
              if (param0 == -1) {
                break L0;
              } else {
                field_j = 46;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_n = null;
          field_o = null;
          field_m = null;
        }
    }

    final void a(byte param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        boolean stackIn_3_0 = false;
        Object stackIn_7_0 = null;
        int stackIn_11_0 = 0;
        boolean stackOut_2_0 = false;
        Object stackOut_6_0 = null;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3_int = -43 / ((38 - param0) / 60);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (wh.field_q) {
                            statePc = 19;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = param1;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!stackIn_3_0) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((e) this).field_l = ((e) this).field_l - 1;
                        if ((((e) this).field_l - 1 ^ -1) >= -1) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = ip.field_a;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((stackIn_11_0 ^ -1) != -1) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.b(-257);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) runtimeException, "e.D(" + param0 + 44 + param1 + 41);
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
