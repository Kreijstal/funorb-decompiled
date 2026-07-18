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
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              ((e) this).field_h = param0;
              stackOut_0_0 = this;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (!param1) {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            ((e) this).field_g = stackIn_3_1 != 0;
            if (param2 <= -28) {
              L2: {
                if (((e) this).field_g) {
                  break L2;
                } else {
                  ((e) this).field_h = 256 - ((e) this).field_h;
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
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("e.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void a(np param0, int param1, boolean param2, int param3, int param4) {
        int var5_int = 0;
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
        String var30_ref_String = null;
        int var30 = 0;
        int var31 = 0;
        np stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        np stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        np stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_49_0 = 0;
        hd stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        hd stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        hd stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        np stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        np stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        np stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        hd stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        hd stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        hd stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        L0: {
          var31 = Kickabout.field_G;
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null == uv.field_i) {
            break L0;
          } else {
            L1: {
              if (null != ds.field_h) {
                break L1;
              } else {
                if (lh.field_E != null) {
                  break L1;
                } else {
                  if (null != so.field_f) {
                    break L1;
                  } else {
                    if (hm.field_D != null) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            var9 = 0;
            L2: while (true) {
              if (var9 >= ss.field_j) {
                break L0;
              } else {
                L3: {
                  var10_int = uv.field_i.field_Eb[var9] & 255;
                  if (ds.field_h == null) {
                    break L3;
                  } else {
                    if (null != ds.field_h[var9]) {
                      if (ds.field_h[var9][var10_int]) {
                        var5_int = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (lh.field_E == null) {
                    break L4;
                  } else {
                    if (null == lh.field_E[var9]) {
                      break L4;
                    } else {
                      L5: {
                        var11_int = lh.field_E[var9][var10_int];
                        if (0 == var11_int) {
                          break L5;
                        } else {
                          if (!fv.field_d) {
                            var5_int = 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var11_int > var6) {
                        var6 = var11_int;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L6: {
                  if (null == hm.field_D) {
                    break L6;
                  } else {
                    if (null != hm.field_D[var9]) {
                      var8 = var8 | hm.field_D[var9][var10_int];
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (null == so.field_f) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        }
        L8: {
          stackOut_29_0 = (np) param0;
          stackOut_29_1 = param1 * (4 * sh.field_c - -8);
          stackIn_31_0 = stackOut_29_0;
          stackIn_31_1 = stackOut_29_1;
          stackIn_30_0 = stackOut_29_0;
          stackIn_30_1 = stackOut_29_1;
          if (ig.field_f != param0) {
            stackOut_31_0 = (np) (Object) stackIn_31_0;
            stackOut_31_1 = stackIn_31_1;
            stackOut_31_2 = 0;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            stackIn_32_2 = stackOut_31_2;
            break L8;
          } else {
            stackOut_30_0 = (np) (Object) stackIn_30_0;
            stackOut_30_1 = stackIn_30_1;
            stackOut_30_2 = 1;
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_32_2 = stackOut_30_2;
            break L8;
          }
        }
        L9: {
          if (((np) (Object) stackIn_32_0).a(stackIn_32_1, stackIn_32_2 == 0, param2, 2, false, (sh.field_c - -2) * 2)) {
            stackOut_34_0 = 0;
            stackIn_35_0 = stackOut_34_0;
            break L9;
          } else {
            stackOut_33_0 = 1;
            stackIn_35_0 = stackOut_33_0;
            break L9;
          }
        }
        L10: {
          var9 = stackIn_35_0;
          var10 = param0.field_Ab.field_jb;
          if (param4 >= 0) {
            break L10;
          } else {
            e.a(112);
            break L10;
          }
        }
        var11 = null;
        var12 = (he) (Object) var10.g(24009);
        L11: while (true) {
          if (var12 == null) {
            return;
          } else {
            L12: {
              var13 = 0;
              if (var12.field_jb == null) {
                L13: {
                  var12.field_Lb = new hd(0L, mp.field_f);
                  var12.a((byte) -120, var12.field_Lb);
                  var12.field_Ob = new hd(0L, pw.field_J);
                  if (!ui.field_t) {
                    break L13;
                  } else {
                    var12.a((byte) -127, var12.field_Ob);
                    break L13;
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
                break L12;
              } else {
                break L12;
              }
            }
            L14: {
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
                break L14;
              } else {
                var21 += 42;
                break L14;
              }
            }
            L15: {
              var20 = hu.a(var12.field_Lb.field_X, var20, var21);
              if (var20.equals((Object) (Object) var12.field_Nb)) {
                stackOut_48_0 = 0;
                stackIn_49_0 = stackOut_48_0;
                break L15;
              } else {
                stackOut_47_0 = 1;
                stackIn_49_0 = stackOut_47_0;
                break L15;
              }
            }
            L16: {
              var22 = stackIn_49_0;
              if (var12.field_Sb < 4) {
                if (0 < var12.field_Sb) {
                  var20 = "<img=" + (var12.field_Sb - 1) + ">" + var20;
                  break L16;
                } else {
                  break L16;
                }
              } else {
                var20 = "<img=" + (bk.field_e + var12.field_Sb + -4) + ">" + var20;
                break L16;
              }
            }
            L17: {
              var12.field_Lb.field_E = var20;
              if (var12.h(-13356)) {
                break L17;
              } else {
                L18: {
                  L19: {
                    L20: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5_int == 0) {
                        break L20;
                      } else {
                        if (!var12.field_Cb) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    if (var12.field_Qb < var6) {
                      break L19;
                    } else {
                      if (var7 > var12.field_Db) {
                        break L19;
                      } else {
                        if (-1 >= (var12.field_Pb & var8)) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  var24_int = 8421504;
                  var23_int = 8414771;
                  break L18;
                }
                L21: {
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
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    if (!var12.field_Gb) {
                      if (var12.field_Fb) {
                        var12.field_Lb.field_E = vo.a((byte) -18, ni.field_p, new String[1]);
                        var12.field_Tb.field_E = kw.field_a;
                        var12.field_Hb.field_E = jo.field_A;
                        break L21;
                      } else {
                        var12.field_Tb.field_E = nc.field_c;
                        break L21;
                      }
                    } else {
                      var12.field_Lb.field_E = vo.a((byte) -18, ug.field_d, new String[1]);
                      var12.field_Hb.field_E = vt.field_a;
                      break L21;
                    }
                  }
                }
                L22: {
                  var25_int = 0;
                  if (null == uv.field_i) {
                    break L22;
                  } else {
                    if (!np.a(38)) {
                      break L22;
                    } else {
                      if (~var12.field_Ab != ~dd.field_c) {
                        L23: {
                          if (null == var12.field_Tb.field_E) {
                            break L23;
                          } else {
                            var26 = var12.field_Tb.g((byte) 122) + eb.field_b * 2;
                            var12.field_Tb.a(true, var26, var25_int, var19, sh.field_c);
                            var25_int = var25_int + var26;
                            break L23;
                          }
                        }
                        if (null == var12.field_Hb.field_E) {
                          break L22;
                        } else {
                          L24: {
                            if (param0 != bs.field_c) {
                              var26 = var12.field_Hb.g((byte) 113) + eb.field_b * 2;
                              break L24;
                            } else {
                              var26 = 40;
                              break L24;
                            }
                          }
                          var12.field_Hb.a(true, var26, var25_int, var19, sh.field_c);
                          var25_int = var25_int + var26;
                          break L22;
                        }
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                L25: {
                  stackOut_83_0 = var12.field_Lb;
                  stackOut_83_1 = 1;
                  stackOut_83_2 = -var25_int;
                  stackIn_85_0 = stackOut_83_0;
                  stackIn_85_1 = stackOut_83_1;
                  stackIn_85_2 = stackOut_83_2;
                  stackIn_84_0 = stackOut_83_0;
                  stackIn_84_1 = stackOut_83_1;
                  stackIn_84_2 = stackOut_83_2;
                  if (ui.field_t) {
                    stackOut_85_0 = (hd) (Object) stackIn_85_0;
                    stackOut_85_1 = stackIn_85_1;
                    stackOut_85_2 = stackIn_85_2;
                    stackOut_85_3 = 42;
                    stackIn_86_0 = stackOut_85_0;
                    stackIn_86_1 = stackOut_85_1;
                    stackIn_86_2 = stackOut_85_2;
                    stackIn_86_3 = stackOut_85_3;
                    break L25;
                  } else {
                    stackOut_84_0 = (hd) (Object) stackIn_84_0;
                    stackOut_84_1 = stackIn_84_1;
                    stackOut_84_2 = stackIn_84_2;
                    stackOut_84_3 = 0;
                    stackIn_86_0 = stackOut_84_0;
                    stackIn_86_1 = stackOut_84_1;
                    stackIn_86_2 = stackOut_84_2;
                    stackIn_86_3 = stackOut_84_3;
                    break L25;
                  }
                }
                L26: {
                  ((hd) (Object) stackIn_86_0).a(stackIn_86_1 != 0, stackIn_86_2 + -stackIn_86_3 + var12.field_q, var25_int, var19, sh.field_c);
                  var12.field_Ob.field_E = Integer.toString(var12.field_Qb);
                  var12.field_Ob.a(true, 40, -40 + var12.field_q, var19, sh.field_c);
                  var19 = var19 + sh.field_c;
                  if (!var12.field_Lb.field_gb) {
                    break L26;
                  } else {
                    if (var22 == 0) {
                      break L26;
                    } else {
                      sn.field_e = var12.field_Nb;
                      if (wm.field_o == null) {
                        break L17;
                      } else {
                        if (null == wm.field_o[var12.field_Sb]) {
                          break L17;
                        } else {
                          sn.field_e = sn.field_e + " - " + wm.field_o[var12.field_Sb];
                          break L17;
                        }
                      }
                    }
                  }
                }
                if (!var12.field_Lb.field_gb) {
                  break L17;
                } else {
                  if (null == wm.field_o) {
                    break L17;
                  } else {
                    if (null == wm.field_o[var12.field_Sb]) {
                      break L17;
                    } else {
                      sn.field_e = wm.field_o[var12.field_Sb];
                      break L17;
                    }
                  }
                }
              }
            }
            L27: {
              int discarded$2 = 73;
              var23 = kr.a(var20, var12.field_Mb);
              var24 = var23;
              var24 = var23;
              if (var23 == null) {
                break L27;
              } else {
                var24_int = var12.field_zb.field_X.b(var23, -eb.field_b + var12.field_q + -eb.field_b);
                var12.field_zb.field_E = var23;
                var12.field_zb.field_U = var12.field_Jb * 256 / mg.field_c;
                var12.field_zb.a(true, -(2 * eb.field_b) + var12.field_q, eb.field_b, var19, sh.field_c * var24_int);
                var19 = var19 + var24_int * sh.field_c;
                break L27;
              }
            }
            L28: {
              if (var9 != 0) {
                break L28;
              } else {
                var12.field_L = var19 + -var12.field_mb;
                break L28;
              }
            }
            L29: {
              if (var13 == 0) {
                break L29;
              } else {
                param0.field_Ab.a(true, 2, (hd) (Object) var12, (hd) var11);
                break L29;
              }
            }
            L30: {
              if (var12.field_sb == 0) {
                break L30;
              } else {
                if (var12.h(-13356)) {
                  break L30;
                } else {
                  if (var12.field_Tb.field_sb == 0) {
                    if (var12.field_Hb.field_sb == 0) {
                      bv.a(vc.field_y, sm.field_q, 0, 95, 0, var12, param0);
                      break L30;
                    } else {
                      ko.a(64, 11, var12.field_Ab);
                      break L30;
                    }
                  } else {
                    int discarded$3 = 122;
                    uc.a(var12.field_Ab, 11);
                    break L30;
                  }
                }
              }
            }
            L31: {
              var11 = (Object) (Object) var12;
              if (!var12.field_Q) {
                break L31;
              } else {
                if (!var12.h(-13356)) {
                  L32: {
                    var24 = null;
                    if (~dd.field_c != ~var12.field_Ab) {
                      L33: {
                        if (var5_int == 0) {
                          break L33;
                        } else {
                          if (var12.field_Cb) {
                            break L33;
                          } else {
                            var24 = vo.a((byte) -18, wh.field_v, new String[1]);
                            break L32;
                          }
                        }
                      }
                      if (var12.field_Db >= var7) {
                        if (var12.field_Qb < var6) {
                          var24 = vo.a((byte) -18, nu.field_D, new String[2]);
                          break L32;
                        } else {
                          if ((~var12.field_Pb & var8) != 0) {
                            var25_int = ps.a((byte) -86, ~var12.field_Pb & var8);
                            var24 = vo.a((byte) -18, il.field_e, new String[1]);
                            if (var25_int <= 0) {
                              break L32;
                            } else {
                              if (null == um.field_a) {
                                break L32;
                              } else {
                                if (var25_int > um.field_a.length) {
                                  break L32;
                                } else {
                                  if (um.field_a[-1 + var25_int] != null) {
                                    var24 = vo.a((byte) -18, um.field_a[var25_int - 1][2], new String[1]);
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                            }
                          } else {
                            break L32;
                          }
                        }
                      } else {
                        L34: {
                          var25_int = -var12.field_Db + var7;
                          if (var25_int == 1) {
                            var24 = vo.a((byte) -18, qr.field_d, new String[1]);
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        var24 = vo.a((byte) -18, rr.field_e, new String[2]);
                        break L32;
                      }
                    } else {
                      L35: {
                        if (var5_int == 0) {
                          break L35;
                        } else {
                          if (!var12.field_Cb) {
                            var24 = ob.field_F;
                            break L32;
                          } else {
                            break L35;
                          }
                        }
                      }
                      if (var12.field_Db < var7) {
                        L36: {
                          var25_int = -var12.field_Db + var7;
                          if (1 == var25_int) {
                            var24 = kt.field_k;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        var24 = vo.a((byte) -18, rn.field_h, new String[2]);
                        break L32;
                      } else {
                        if (var12.field_Qb >= var6) {
                          if ((var8 & ~var12.field_Pb) == 0) {
                            break L32;
                          } else {
                            var25_int = ps.a((byte) -63, ~var12.field_Pb & var8);
                            var24 = ca.field_e;
                            if (var25_int <= 0) {
                              break L32;
                            } else {
                              if (null == um.field_a) {
                                break L32;
                              } else {
                                if (var25_int > um.field_a.length) {
                                  break L32;
                                } else {
                                  if (um.field_a[-1 + var25_int] != null) {
                                    var24 = um.field_a[-1 + var25_int][1];
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var24 = vo.a((byte) -18, ic.field_c, new String[2]);
                          break L32;
                        }
                      }
                    }
                  }
                  if (var24 == null) {
                    break L31;
                  } else {
                    var24 = "<col=A00000>" + var24;
                    var30_ref_String = var24;
                    var25 = var30_ref_String;
                    var24 = var25;
                    var30_ref_String = var24;
                    var25 = var30_ref_String;
                    var25 = null;
                    var26 = 0;
                    var27_int = 0;
                    L37: while (true) {
                      if (var27_int >= ss.field_j) {
                        L38: {
                          L39: {
                            if (param0 != bs.field_c) {
                              break L39;
                            } else {
                              if (!np.a(47)) {
                                break L39;
                              } else {
                                if (var26 == 0) {
                                  var24 = var24 + "<br>" + vo.a((byte) -18, oj.field_V, new String[1]);
                                  break L38;
                                } else {
                                  var24 = var24 + "<br>" + vg.field_Cb + var25;
                                  break L38;
                                }
                              }
                            }
                          }
                          if (var26 == 0) {
                            var24 = var24 + "<br>" + vo.a((byte) -18, ak.field_l, new String[1]);
                            break L38;
                          } else {
                            var24 = var24 + "<br>" + po.field_c + var25;
                            break L38;
                          }
                        }
                        L40: {
                          if (bs.field_c != param0) {
                            break L40;
                          } else {
                            if (np.a(111)) {
                              break L40;
                            } else {
                              var27 = uv.field_i.field_ec;
                              var24 = var24 + "<br>" + vo.a((byte) -18, qq.field_F, new String[1]);
                              break L40;
                            }
                          }
                        }
                        sn.field_e = var24;
                        break L31;
                      } else {
                        L41: {
                          var28 = uv.field_i.field_Eb[var27_int] & 255;
                          var29 = 0;
                          if (ds.field_h == null) {
                            break L41;
                          } else {
                            if (null == ds.field_h[var27_int]) {
                              break L41;
                            } else {
                              if (!ds.field_h[var27_int][var28]) {
                                break L41;
                              } else {
                                if (!var12.field_Cb) {
                                  var29 = 1;
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                        }
                        L42: {
                          if (null == lh.field_E) {
                            break L42;
                          } else {
                            if (lh.field_E[var27_int] == null) {
                              break L42;
                            } else {
                              L43: {
                                var30 = lh.field_E[var27_int][var28];
                                if (var30 == 0) {
                                  break L43;
                                } else {
                                  if (fv.field_d) {
                                    break L43;
                                  } else {
                                    if (var12.field_Cb) {
                                      break L43;
                                    } else {
                                      var29 = 1;
                                      break L43;
                                    }
                                  }
                                }
                              }
                              if (var30 > var12.field_Qb) {
                                var29 = 1;
                                break L42;
                              } else {
                                break L42;
                              }
                            }
                          }
                        }
                        L44: {
                          if (null == so.field_f) {
                            break L44;
                          } else {
                            if (null != so.field_f[var27_int]) {
                              L45: {
                                var30 = so.field_f[var27_int][var28];
                                if (0 == var30) {
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
                              if (var30 <= var12.field_Db) {
                                break L44;
                              } else {
                                var29 = 1;
                                break L44;
                              }
                            } else {
                              break L44;
                            }
                          }
                        }
                        L46: {
                          if (null == hm.field_D) {
                            break L46;
                          } else {
                            if (hm.field_D[var27_int] != null) {
                              if ((~var12.field_Pb & hm.field_D[var27_int][var28]) != 0) {
                                var29 = 1;
                                break L46;
                              } else {
                                break L46;
                              }
                            } else {
                              break L46;
                            }
                          }
                        }
                        L47: {
                          if (var29 == 0) {
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                        var27_int++;
                        continue L37;
                      }
                    }
                  }
                } else {
                  var12 = (he) (Object) var10.c(33);
                  continue L11;
                }
              }
            }
            var12 = (he) (Object) var10.c(33);
            continue L11;
          }
        }
    }

    final void a(int param0, boolean param1) {
        L0: {
          if (((e) this).field_h != 256) {
            iu.field_k.b(0, 0, ((e) this).field_h);
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
            ((e) this).a(-86, true, 42, (js) null);
            break L1;
          }
        }
    }

    private final void b() {
        if (((e) this).field_g) {
            if (((e) this).field_h < 256) {
                return;
            }
        }
        ((e) this).field_l = 0;
        mg.a((byte) -25);
        mv.a((byte) 122);
        jm.a(0, false, -2);
    }

    e() {
        super(-5);
        ((e) this).field_l = 40;
        ((e) this).field_h = 0;
        ((e) this).field_g = true;
    }

    final boolean a(int param0, int param1, char param2) {
        if (!wh.field_q) {
            if (((e) this).field_l > 0) {
                int discarded$0 = -257;
                this.b();
            }
        }
        if (param1 >= -5) {
            boolean discarded$1 = ((e) this).a(-30, -24, '2');
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
                int fieldTemp$4 = ((e) this).field_l - 1;
                ((e) this).field_l = ((e) this).field_l - 1;
                if (fieldTemp$4 <= 0) {
                  break L1;
                } else {
                  if (ip.field_a != 0) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              int discarded$5 = -257;
              this.b();
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
