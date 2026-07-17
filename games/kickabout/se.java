/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class se extends ct {
    static ef field_C;
    private tf field_A;
    static String field_B;

    public se() {
        super(0, 0, il.field_b, im.field_Ab, (gj) null, (jv) null);
        ((se) this).field_A = new tf();
    }

    final fd a(int param0) {
        nw var2 = null;
        RuntimeException var2_ref = null;
        ub var3 = null;
        int var4 = 0;
        fd stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_9_0 = null;
        Object stackOut_12_0 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2 = new nw(((se) this).field_A);
              if (param0 == 0) {
                break L1;
              } else {
                ((se) this).field_A = null;
                break L1;
              }
            }
            var3 = (ub) (Object) var2.a((byte) 98);
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var3.field_C) {
                    stackOut_9_0 = var3.a(false);
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var3 = (ub) (Object) var2.a(param0);
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_12_0 = null;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "se.H(" + param0 + 41);
        }
        return (fd) (Object) stackIn_13_0;
    }

    final static ut[] a(sj param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ut[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ut[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
            var4_int = param0.b(param2, -1);
            var5 = -67 % ((-81 - param1) / 38);
            var6 = param0.a((byte) -102, param3, var4_int);
            stackOut_0_0 = fa.a(var4_int, (byte) -89, var6, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("se.J(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_1_0;
    }

    final static gg a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        tf var4 = null;
        Object var5 = null;
        Object var6 = null;
        gg var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        uv var17 = null;
        String var18 = null;
        int var19 = 0;
        np stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        np stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        np stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        gg stackIn_9_0 = null;
        hd stackIn_34_0 = null;
        hd stackIn_36_0 = null;
        hd stackIn_37_0 = null;
        String stackIn_37_1 = null;
        hd stackIn_38_0 = null;
        hd stackIn_40_0 = null;
        hd stackIn_41_0 = null;
        String stackIn_41_1 = null;
        int stackIn_45_0 = 0;
        Object stackIn_86_0 = null;
        Object stackIn_103_0 = null;
        RuntimeException decompiledCaughtException = null;
        np stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        np stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        np stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        gg stackOut_8_0 = null;
        hd stackOut_33_0 = null;
        hd stackOut_36_0 = null;
        String stackOut_36_1 = null;
        hd stackOut_34_0 = null;
        String stackOut_34_1 = null;
        hd stackOut_37_0 = null;
        hd stackOut_40_0 = null;
        String stackOut_40_1 = null;
        hd stackOut_38_0 = null;
        String stackOut_38_1 = null;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        hd stackOut_85_0 = null;
        Object stackOut_102_0 = null;
        var19 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              stackOut_1_0 = ei.field_d.field_Cb;
              stackOut_1_1 = (sh.field_c * 3 - -6) * param2;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (ei.field_d.field_Cb != ig.field_f) {
                stackOut_4_0 = (np) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L1;
              } else {
                stackOut_2_0 = (np) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              var3_int = ((np) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2 != 0, param0, 2, false, param1 + sh.field_c) ? 1 : 0;
              var4 = ei.field_d.field_yb.field_jb;
              var5 = null;
              if (ts.field_d != 2) {
                L3: {
                  L4: {
                    du.field_f.field_E = uf.field_a;
                    kk.field_R.field_lb = false;
                    if (ts.field_d != 1) {
                      break L4;
                    } else {
                      ei.field_d.field_Cb.field_zb.field_E = aw.field_I;
                      if (var19 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ei.field_d.field_Cb.field_zb.field_E = jw.field_yb;
                  break L3;
                }
                hl.a(true, ei.field_d.field_yb);
                break L2;
              } else {
                kk.field_R.field_lb = true;
                du.field_f.field_E = vo.a((byte) -18, uf.field_d, new String[1]);
                ei.field_d.field_Cb.field_zb.field_E = null;
                var6 = null;
                var7 = (gg) (Object) var4.g(24009);
                L5: while (true) {
                  L6: {
                    L7: {
                      if (var7 == null) {
                        break L7;
                      } else {
                        var8 = 0;
                        stackOut_8_0 = (gg) var7;
                        stackIn_86_0 = (Object) (Object) stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var19 != 0) {
                          break L6;
                        } else {
                          L8: {
                            if (stackIn_9_0.field_jb == null) {
                              var7.field_Bb = new hd(0L, mp.field_f);
                              var7.a((byte) -112, var7.field_Bb);
                              var7.field_Ab = new hd(0L, pw.field_J);
                              var7.a((byte) -122, var7.field_Ab);
                              var7.field_Fb = new hd(0L, mp.field_f);
                              var7.a((byte) -117, var7.field_Fb);
                              var7.field_Ab.field_A = 2;
                              var7.b(false);
                              var8 = 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            L10: {
                              var7.field_q = ei.field_d.field_yb.field_q;
                              var9 = 0;
                              if (null == var7.field_zb) {
                                break L10;
                              } else {
                                L11: {
                                  if (var7.field_zb == bh.field_h) {
                                    break L11;
                                  } else {
                                    var10 = 13421568;
                                    var11 = 16777062;
                                    if (var19 == 0) {
                                      break L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var11 = 6750054;
                                var10 = 52224;
                                if (var19 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var10 = 13369344;
                            var11 = 16737894;
                            break L9;
                          }
                          L12: {
                            var12 = 0;
                            if (var7.field_Eb == null) {
                              break L12;
                            } else {
                              if (!var7.field_Eb.equals((Object) (Object) "")) {
                                var7.field_Fb.field_ub = var11;
                                var7.field_Fb.field_N = ll.field_n;
                                var12 = 1;
                                var7.field_Fb.a(true, 3 + ll.field_n.field_o, 0, var9, sh.field_c);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            var7.field_Ab.field_H = var11;
                            var7.field_Bb.field_H = var11;
                            var7.field_Ab.field_ub = var11;
                            var7.field_Bb.field_ub = var11;
                            var7.field_Ab.field_y = var10;
                            var7.field_Bb.field_y = var10;
                            var7.field_Ab.field_ab = var11;
                            var7.field_Bb.field_ab = var11;
                            var13 = 0;
                            var14 = var7.field_q + -82;
                            if (var12 != 0) {
                              var13 = 3 + ll.field_n.field_o;
                              var14 = var14 - var13;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            stackOut_33_0 = var7.field_Bb;
                            stackIn_36_0 = stackOut_33_0;
                            stackIn_34_0 = stackOut_33_0;
                            if (var14 > 0) {
                              stackOut_36_0 = (hd) (Object) stackIn_36_0;
                              stackOut_36_1 = hu.a(var7.field_Bb.field_X, var7.field_Gb, var14);
                              stackIn_37_0 = stackOut_36_0;
                              stackIn_37_1 = stackOut_36_1;
                              break L14;
                            } else {
                              stackOut_34_0 = (hd) (Object) stackIn_34_0;
                              stackOut_34_1 = var7.field_Gb;
                              stackIn_37_0 = stackOut_34_0;
                              stackIn_37_1 = stackOut_34_1;
                              break L14;
                            }
                          }
                          L15: {
                            stackIn_37_0.field_E = stackIn_37_1;
                            var7.field_Bb.a(true, var14, var13, var9, sh.field_c);
                            stackOut_37_0 = var7.field_Ab;
                            stackIn_40_0 = stackOut_37_0;
                            stackIn_38_0 = stackOut_37_0;
                            if (var7.field_zb == null) {
                              stackOut_40_0 = (hd) (Object) stackIn_40_0;
                              stackOut_40_1 = ga.field_K;
                              stackIn_41_0 = stackOut_40_0;
                              stackIn_41_1 = stackOut_40_1;
                              break L15;
                            } else {
                              stackOut_38_0 = (hd) (Object) stackIn_38_0;
                              stackOut_38_1 = var7.field_zb;
                              stackIn_41_0 = stackOut_38_0;
                              stackIn_41_1 = stackOut_38_1;
                              break L15;
                            }
                          }
                          L16: {
                            stackIn_41_0.field_E = stackIn_41_1;
                            var7.field_Ab.a(true, 80, var7.field_q - 80, var9, sh.field_c);
                            if (var7.field_Bb.field_E.equals((Object) (Object) var7.field_Gb)) {
                              stackOut_44_0 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              break L16;
                            } else {
                              stackOut_42_0 = 1;
                              stackIn_45_0 = stackOut_42_0;
                              break L16;
                            }
                          }
                          L17: {
                            var15 = stackIn_45_0;
                            var9 = var9 + sh.field_c;
                            if (var3_int == 0) {
                              var7.field_L = -var7.field_mb + var9;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            if (var8 != 0) {
                              ei.field_d.field_yb.a(true, 2, (hd) (Object) var7, (hd) var6);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            L20: {
                              var6 = (Object) (Object) var7;
                              if (var7.field_Fb == null) {
                                break L20;
                              } else {
                                if (!var7.field_Fb.field_gb) {
                                  break L20;
                                } else {
                                  sn.field_e = var7.field_Eb;
                                  if (var19 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            L21: {
                              if (var7.field_sb == 0) {
                                break L21;
                              } else {
                                L22: {
                                  var16 = var7.field_Gb;
                                  el.a((hd) (Object) var7, false, ei.field_d.field_Cb, -1, var16, (int[]) null, 0L, (String) null, -1);
                                  var5 = (Object) (Object) var7;
                                  if (null == var7.field_zb) {
                                    break L22;
                                  } else {
                                    if (ew.a(118, wi.field_v.field_k)) {
                                      break L22;
                                    } else {
                                      if (!iw.field_l) {
                                        L23: {
                                          if (kb.field_C) {
                                            break L23;
                                          } else {
                                            var17 = wi.field_v;
                                            var18 = vo.a((byte) -18, wp.field_a, new String[1]);
                                            var17.field_j.a(param1 ^ 2, 8, var18);
                                            break L23;
                                          }
                                        }
                                        var17 = wi.field_v;
                                        var18 = vo.a((byte) -18, ee.field_c, new String[1]);
                                        var17.field_j.a(0, 18, var18);
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                                if (var19 == 0) {
                                  break L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            if (!var7.field_Bb.field_gb) {
                              break L19;
                            } else {
                              if (var15 == 0) {
                                break L19;
                              } else {
                                sn.field_e = var7.field_Gb;
                                break L19;
                              }
                            }
                          }
                          var7 = (gg) (Object) var4.c(33);
                          if (var19 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    stackOut_85_0 = ei.field_d.field_Eb;
                    stackIn_86_0 = (Object) (Object) stackOut_85_0;
                    break L6;
                  }
                  L24: {
                    if (((hd) (Object) stackIn_86_0).field_sb != 0) {
                      k.field_m = new sl(ei.field_d.field_Eb.field_F, ei.field_d.field_Eb.field_T, ei.field_d.field_Eb.field_q, ei.field_d.field_Eb.field_mb, sf.field_G, pn.field_u, dw.field_e, dw.field_e);
                      fs.field_b = 0;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (ei.field_d.field_zb.field_sb != 0) {
                      k.field_m = new sl(ei.field_d.field_zb.field_F, ei.field_d.field_zb.field_T, ei.field_d.field_zb.field_q, ei.field_d.field_zb.field_mb, kf.field_yb, pn.field_u, dw.field_e, dw.field_e);
                      fs.field_b = 1;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  break L2;
                }
              }
            }
            stackOut_102_0 = var5;
            stackIn_103_0 = stackOut_102_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "se.O(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return (gg) (Object) stackIn_103_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        nw var5 = null;
        RuntimeException var5_ref = null;
        fd var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (param1 == 65) {
              L1: {
                if (null != ((se) this).field_r) {
                  ((se) this).field_r.a(113, true, param3, (fd) this, param2);
                  break L1;
                } else {
                  break L1;
                }
              }
              var5 = new nw(((se) this).field_A);
              var6 = (fd) (Object) var5.b(0);
              L2: while (true) {
                L3: {
                  L4: {
                    if (null == var6) {
                      break L4;
                    } else {
                      var6.a(param0, 65, param2 + ((se) this).field_t, ((se) this).field_g + param3);
                      var6 = (fd) (Object) var5.b((byte) 46);
                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var5_ref, "se.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final ub h(byte param0) {
        nw var2 = null;
        RuntimeException var2_ref = null;
        ub var3 = null;
        int var4 = 0;
        Object stackIn_3_0 = null;
        ub stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        ub stackOut_7_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == 18) {
              var2 = new nw(((se) this).field_A);
              var3 = (ub) (Object) var2.a((byte) 70);
              L1: while (true) {
                L2: {
                  if (null == var3) {
                    break L2;
                  } else {
                    if (!var3.field_C) {
                      var3 = (ub) (Object) var2.a(0);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      stackOut_7_0 = (ub) var3;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    }
                  }
                }
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ub) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "se.Q(" + param0 + 41);
        }
        return (ub) (Object) stackIn_11_0;
    }

    final void l(int param0) {
        RuntimeException runtimeException = null;
        nw var2 = null;
        ub var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var2 = new nw(((se) this).field_A);
            if (param0 == 4508) {
              var3 = (ub) (Object) var2.a((byte) -107);
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var3) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var3.a(param0 + -4521)) {
                            var3.c((byte) -109);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var3 = (ub) (Object) var2.a(0);
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "se.L(" + param0 + 41);
        }
    }

    final void a(fd param0, boolean param1) {
        ub var3 = null;
        RuntimeException var3_ref = null;
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
            if (!(param0 instanceof ub)) {
              throw new IllegalArgumentException();
            } else {
              L1: {
                var3 = (ub) (Object) param0;
                ((se) this).field_A.a(0, (gn) (Object) var3);
                if (!param1) {
                  break L1;
                } else {
                  ((se) this).field_A = null;
                  break L1;
                }
              }
              var3.field_C = true;
              boolean discarded$2 = var3.a((fd) this, 0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("se.K(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            param1.addMouseListener((java.awt.event.MouseListener) (Object) lw.field_e);
            param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lw.field_e);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) lw.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("se.I(").append(15282).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final void k(int param0) {
        RuntimeException runtimeException = null;
        nw var2 = null;
        ub var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2 = new nw(((se) this).field_A);
              if (param0 > 82) {
                break L1;
              } else {
                ub discarded$2 = ((se) this).h((byte) 110);
                break L1;
              }
            }
            var3 = (ub) (Object) var2.a((byte) 110);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var3) {
                    break L4;
                  } else {
                    var3.field_C = false;
                    var3 = (ub) (Object) var2.a(0);
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((se) this).field_z = null;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "se.N(" + param0 + 41);
        }
    }

    public static void m() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_C = null;
            field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "se.SA(" + -1 + 41);
        }
    }

    final static boolean a(byte param0, char param1) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -108) {
                break L1;
              } else {
                gg discarded$2 = se.a(true, 64, 120);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (65 > param1) {
                    break L4;
                  } else {
                    if (param1 <= 90) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param1 < 97) {
                    break L5;
                  } else {
                    if (param1 > 122) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "se.M(" + param0 + 44 + param1 + 41);
        }
        return stackIn_16_0 != 0;
    }

    final void n(int param0) {
        nw var2 = null;
        RuntimeException var2_ref = null;
        ub var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                boolean discarded$2 = se.a((byte) 111, '');
                break L1;
              }
            }
            var2 = new nw(((se) this).field_A);
            var3 = (ub) (Object) var2.a((byte) 107);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var3) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (!var3.k(-1)) {
                          break L5;
                        } else {
                          var3.c((byte) -109);
                          break L5;
                        }
                      }
                      var3 = (ub) (Object) var2.a(0);
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((se) this).field_z = (fd) (Object) ((se) this).h((byte) 18);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "se.RA(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "That name is not available";
    }
}
