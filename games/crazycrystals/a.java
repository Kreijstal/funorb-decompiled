/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_a;
    static ue field_b;
    static dl field_c;
    static am field_d;

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != tm.field_b) {
            aq.field_s = 0;
            fq.field_C = param0.getX();
            tn.field_s = param0.getY();
            wl.field_m = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null == tm.field_b) {
        } else {
            aq.field_s = 0;
            kk.field_g = param0.getX();
            sb.field_I = param0.getY();
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                th.field_y = 1;
                uc.field_b = 1;
            } else {
                th.field_y = 2;
                uc.field_b = 2;
            }
            var2 = param0.getModifiers();
            wl.field_m = true;
            if ((var2 & 4) == 0) {
            }
            if (0 != (16 & var2)) {
            }
            if ((8 & var2) == 0) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(tm.field_b == null)) {
            aq.field_s = 0;
            fq.field_C = -1;
            tn.field_s = -1;
            wl.field_m = true;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (tm.field_b != null) {
            aq.field_s = 0;
            fq.field_C = param0.getX();
            tn.field_s = param0.getY();
            wl.field_m = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (tm.field_b != null) {
            aq.field_s = 0;
            fq.field_C = param0.getX();
            tn.field_s = param0.getY();
            wl.field_m = true;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != tm.field_b) {
            aq.field_s = 0;
            uc.field_b = 0;
            wl.field_m = true;
            var2 = param0.getModifiers();
            if (-1 != (var2 & 4)) {
            }
            if (-1 == (var2 & 8)) {
            }
            if ((var2 & 16) == 0) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, vc param5, int param6, int param7, vc param8, int param9, int param10, int param11, hj param12, hj param13, int param14, hj param15, int param16, int param17, int param18, int param19, int param20) {
        if (param2 != 0) {
            return;
        }
        sl.a(param5, param8, 107, param18);
        mo.a(param20, param3, param4, param0, (byte) -16);
        mh.a(param7, -20, param1);
        f.a(param16, param15, param17, param13, param14, (byte) 104);
        u.a(param6, param12, 250, param9);
        vf.a(param11, (byte) 118, param10, param19);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (!param0) {
            Object var2 = null;
            a.a(74, 5, -18, 74, -59, (vc) null, -54, -86, (vc) null, -31, 85, -40, (hj) null, (hj) null, 11, (hj) null, -17, -43, 64, -124, 62);
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(tm.field_b == null)) {
            uc.field_b = 0;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = CrazyCrystals.field_B;
          sd.field_T = null;
          dj.field_t = false;
          if (param0 == 63) {
            break L0;
          } else {
            var3 = null;
            boolean discarded$2 = a.a(-70, (CharSequence) null);
            break L0;
          }
        }
        L1: {
          if (ne.field_d) {
            sp.field_a.l(126);
            break L1;
          } else {
            var1 = kl.field_V;
            if ((var1 ^ -1) >= -1) {
              sp.field_a.i((byte) -78);
              rf.a(param0 + -60);
              break L1;
            } else {
              if ((var1 ^ -1) != -2) {
                sd.field_T = ci.a(new String[1], gh.field_t, 3);
                sd.field_T = dk.a(new CharSequence[3], (byte) -55);
                sp.field_a.i((byte) -78);
                rf.a(param0 + -60);
                break L1;
              } else {
                sd.field_T = va.field_a;
                sd.field_T = dk.a(new CharSequence[3], (byte) -55);
                sp.field_a.i((byte) -78);
                rf.a(param0 + -60);
                break L1;
              }
            }
          }
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2 = -38 / ((45 - param0) / 48);
        return qn.a((byte) -123, false, param1);
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        String stackIn_69_2 = null;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String stackIn_75_2 = null;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String stackOut_74_2 = null;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String[] stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        String stackOut_68_2 = null;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        L0: {
          var9 = CrazyCrystals.field_B;
          rd.field_h = true;
          am.field_g = param1;
          if (am.field_g == 0) {
            var3 = v.a(ec.field_m, ug.field_a, -27815, vk.field_L, eb.field_y);
            var4 = 3 + var3;
            ub.field_b = new int[var4];
            je.field_i = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                sn.field_a = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    je.field_i[var4 + -3] = "";
                    je.field_i[-2 + var4] = ig.field_m;
                    ub.field_b[-2 + var4] = 0;
                    sn.field_a[0] = 4;
                    je.field_i[var4 + -1] = qo.field_o;
                    ub.field_b[-1 + var4] = 1;
                    sn.field_a[1] = 5;
                    break L0;
                  } else {
                    je.field_i[var5] = eb.field_y[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                ub.field_b[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (am.field_g != 1) {
              if (am.field_g == 2) {
                var3 = v.a(ec.field_m, ci.a(new String[1], rg.field_b, 3), -27815, vk.field_L, eb.field_y);
                var4 = -1;
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (var3 <= var5) {
                      break L4;
                    } else {
                      if ("<%0>".equals((Object) (Object) eb.field_y[var5])) {
                        var4 = var5;
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    jl.field_a = new String[var4];
                    eg.a((Object[]) (Object) eb.field_y, 0, (Object[]) (Object) jl.field_a, 0, var4);
                    lo.field_c = new String[-1 + var3 - var4];
                    eg.a((Object[]) (Object) eb.field_y, 1 + var4, (Object[]) (Object) lo.field_c, 0, -1 + (-var4 + var3));
                    var3 = v.a(ec.field_m, ci.a(new String[1], jg.field_t, 3), -27815, vk.field_L, eb.field_y);
                    var4 = -1;
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        if (var3 <= var5) {
                          break L6;
                        } else {
                          if (!"<%0>".equals((Object) (Object) eb.field_y[var5])) {
                            var5++;
                            continue L5;
                          } else {
                            var4 = var5;
                            break L6;
                          }
                        }
                      }
                      if (-1 == var4) {
                        throw new IllegalStateException();
                      } else {
                        L7: {
                          sl.field_r = new String[var4];
                          eg.a((Object[]) (Object) eb.field_y, 0, (Object[]) (Object) sl.field_r, 0, var4);
                          ne.field_a = new String[-var4 + (var3 - 1)];
                          eg.a((Object[]) (Object) eb.field_y, 1 + var4, (Object[]) (Object) ne.field_a, 0, -1 + (-var4 + var3));
                          if (jl.field_a.length < sl.field_r.length) {
                            stackOut_57_0 = sl.field_r.length;
                            stackIn_58_0 = stackOut_57_0;
                            break L7;
                          } else {
                            stackOut_56_0 = jl.field_a.length;
                            stackIn_58_0 = stackOut_56_0;
                            break L7;
                          }
                        }
                        L8: {
                          var5 = stackIn_58_0;
                          if (lo.field_c.length >= ne.field_a.length) {
                            stackOut_60_0 = lo.field_c.length;
                            stackIn_61_0 = stackOut_60_0;
                            break L8;
                          } else {
                            stackOut_59_0 = ne.field_a.length;
                            stackIn_61_0 = stackOut_59_0;
                            break L8;
                          }
                        }
                        var6 = stackIn_61_0;
                        var7 = var6 + (7 - -var5);
                        je.field_i = new String[var7];
                        ub.field_b = new int[var7];
                        var8 = 0;
                        L9: while (true) {
                          if (var8 >= var7) {
                            je.field_i[0] = sa.field_rb;
                            ub.field_b[1] = 0;
                            je.field_i[1] = qc.field_h;
                            sn.field_a = new int[2];
                            je.field_i[5] = "";
                            sn.field_a[1] = 2;
                            sn.field_a[0] = 5;
                            je.field_i[2] = jk.field_h;
                            je.field_i[3] = jb.field_a;
                            je.field_i[4] = ca.field_g;
                            ub.field_b[3] = 1;
                            var8 = 0;
                            L10: while (true) {
                              if (var5 <= var8) {
                                je.field_i[var5 + 6] = null;
                                ub.field_b[6 - -var5] = -2;
                                var8 = 0;
                                L11: while (true) {
                                  if (var8 >= var6) {
                                    wm.field_d = lo.a((byte) -60);
                                    break L0;
                                  } else {
                                    L12: {
                                      stackOut_72_0 = je.field_i;
                                      stackOut_72_1 = var8 + var5 + 7;
                                      stackIn_74_0 = stackOut_72_0;
                                      stackIn_74_1 = stackOut_72_1;
                                      stackIn_73_0 = stackOut_72_0;
                                      stackIn_73_1 = stackOut_72_1;
                                      if (ne.field_a.length > var8) {
                                        stackOut_74_0 = (String[]) (Object) stackIn_74_0;
                                        stackOut_74_1 = stackIn_74_1;
                                        stackOut_74_2 = ne.field_a[var8];
                                        stackIn_75_0 = stackOut_74_0;
                                        stackIn_75_1 = stackOut_74_1;
                                        stackIn_75_2 = stackOut_74_2;
                                        break L12;
                                      } else {
                                        stackOut_73_0 = (String[]) (Object) stackIn_73_0;
                                        stackOut_73_1 = stackIn_73_1;
                                        stackOut_73_2 = "";
                                        stackIn_75_0 = stackOut_73_0;
                                        stackIn_75_1 = stackOut_73_1;
                                        stackIn_75_2 = stackOut_73_2;
                                        break L12;
                                      }
                                    }
                                    stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                L13: {
                                  stackOut_66_0 = je.field_i;
                                  stackOut_66_1 = 6 - -var8;
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_68_1 = stackOut_66_1;
                                  stackIn_67_0 = stackOut_66_0;
                                  stackIn_67_1 = stackOut_66_1;
                                  if ((-var5 + (var8 + sl.field_r.length) ^ -1) <= -1) {
                                    stackOut_68_0 = (String[]) (Object) stackIn_68_0;
                                    stackOut_68_1 = stackIn_68_1;
                                    stackOut_68_2 = sl.field_r[sl.field_r.length + (var8 - var5)];
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    stackIn_69_2 = stackOut_68_2;
                                    break L13;
                                  } else {
                                    stackOut_67_0 = (String[]) (Object) stackIn_67_0;
                                    stackOut_67_1 = stackIn_67_1;
                                    stackOut_67_2 = "";
                                    stackIn_69_0 = stackOut_67_0;
                                    stackIn_69_1 = stackOut_67_1;
                                    stackIn_69_2 = stackOut_67_2;
                                    break L13;
                                  }
                                }
                                stackIn_69_0[stackIn_69_1] = stackIn_69_2;
                                var8++;
                                continue L10;
                              }
                            }
                          } else {
                            ub.field_b[var8] = -1;
                            var8++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (3 != am.field_g) {
                  if (-5 != (am.field_g ^ -1)) {
                    if (-6 != (am.field_g ^ -1)) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = v.a(ec.field_m, fn.field_i, -27815, vk.field_L, eb.field_y);
                      var4 = var3 + 3;
                      je.field_i = new String[var4];
                      ub.field_b = new int[var4];
                      var5 = 0;
                      L14: while (true) {
                        if (var4 <= var5) {
                          sn.field_a = new int[2];
                          var5 = 0;
                          L15: while (true) {
                            if (var3 <= var5) {
                              je.field_i[var4 - 3] = "";
                              je.field_i[-2 + var4] = ia.field_h;
                              ub.field_b[-2 + var4] = 0;
                              sn.field_a[0] = 3;
                              je.field_i[-1 + var4] = qo.field_o;
                              ub.field_b[-1 + var4] = 1;
                              sn.field_a[1] = 5;
                              break L0;
                            } else {
                              je.field_i[var5] = eb.field_y[var5];
                              var5++;
                              continue L15;
                            }
                          }
                        } else {
                          ub.field_b[var5] = -1;
                          var5++;
                          continue L14;
                        }
                      }
                    }
                  } else {
                    var3 = v.a(ec.field_m, nh.field_C, -27815, vk.field_L, eb.field_y);
                    var4 = var3 + 2;
                    ub.field_b = new int[var4];
                    je.field_i = new String[var4];
                    var5 = 0;
                    L16: while (true) {
                      if (var5 >= var4) {
                        sn.field_a = new int[1];
                        var5 = 0;
                        L17: while (true) {
                          if (var5 >= var3) {
                            je.field_i[var4 - 2] = "";
                            je.field_i[-1 + var4] = qo.field_o;
                            ub.field_b[var4 - 1] = 0;
                            sn.field_a[0] = 5;
                            break L0;
                          } else {
                            je.field_i[var5] = eb.field_y[var5];
                            var5++;
                            continue L17;
                          }
                        }
                      } else {
                        ub.field_b[var5] = -1;
                        var5++;
                        continue L16;
                      }
                    }
                  }
                } else {
                  L18: {
                    if (te.field_a.field_h) {
                      var3 = v.a(ec.field_m, ib.field_m, -27815, vk.field_L, eb.field_y);
                      break L18;
                    } else {
                      var3 = v.a(ec.field_m, gn.field_U, -27815, vk.field_L, eb.field_y);
                      break L18;
                    }
                  }
                  var4 = var3 + 2;
                  ub.field_b = new int[var4];
                  je.field_i = new String[var4];
                  var5 = 0;
                  L19: while (true) {
                    if (var4 <= var5) {
                      sn.field_a = new int[1];
                      var5 = 0;
                      L20: while (true) {
                        if (var5 >= var3) {
                          je.field_i[var4 - 2] = "";
                          je.field_i[-1 + var4] = qo.field_o;
                          ub.field_b[-1 + var4] = 0;
                          sn.field_a[0] = 5;
                          break L0;
                        } else {
                          je.field_i[var5] = eb.field_y[var5];
                          var5++;
                          continue L20;
                        }
                      }
                    } else {
                      ub.field_b[var5] = -1;
                      var5++;
                      continue L19;
                    }
                  }
                }
              }
            } else {
              var3 = v.a(ec.field_m, ug.field_a, -27815, vk.field_L, eb.field_y);
              var4 = var3 + 2;
              ub.field_b = new int[var4];
              je.field_i = new String[var4];
              var5 = 0;
              L21: while (true) {
                if (var5 >= var4) {
                  sn.field_a = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (var3 <= var5) {
                      je.field_i[var4 + -2] = "";
                      je.field_i[var4 - 1] = qo.field_o;
                      ub.field_b[var4 - 1] = 0;
                      sn.field_a[0] = 5;
                      break L0;
                    } else {
                      je.field_i[var5] = eb.field_y[var5];
                      var5++;
                      continue L22;
                    }
                  }
                } else {
                  ub.field_b[var5] = -1;
                  var5++;
                  continue L21;
                }
              }
            }
          }
        }
        lb.field_l.field_b = sn.field_a.length;
        var3 = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= je.field_i.length) {
            L24: {
              if ((am.field_g ^ -1) != -3) {
                break L24;
              } else {
                var10 = jl.field_a;
                var5 = 0;
                L25: while (true) {
                  if (var5 >= var10.length) {
                    var11 = lo.field_c;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        break L24;
                      } else {
                        var13 = var11[var5];
                        var7 = vm.a((byte) -113, false, var13);
                        if (var3 < var7) {
                          var3 = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    var12 = var10[var5];
                    var7 = vm.a((byte) 98, false, var12);
                    if (var7 > var3) {
                      var3 = var7;
                      var5++;
                      continue L25;
                    } else {
                      var5++;
                      continue L25;
                    }
                  }
                }
              }
            }
            ri.field_a = oa.field_b + (var3 + -(var3 >> 1790602177));
            gp.field_a = (field_a + bn.field_c << 2031346433) * lb.field_l.field_b;
            bf.field_c = -(var3 >> 262385153) + oa.field_b;
            var4 = 0;
            L27: while (true) {
              if (var4 >= je.field_i.length) {
                pf.field_n = -(gp.field_a >> 685711809) + rn.field_n;
                cd.field_z = new int[je.field_i.length][];
                if (param0 > 103) {
                  var4 = 0;
                  var5 = pf.field_n;
                  L28: while (true) {
                    if (je.field_i.length <= var4) {
                      L29: {
                        if (2 == am.field_g) {
                          lb.field_l.a((byte) 41, param2, -1, -1);
                          break L29;
                        } else {
                          lb.field_l.a((byte) 41, param2, be.a(-1013410975, qh.field_i, bm.field_h), 0);
                          break L29;
                        }
                      }
                      return;
                    } else {
                      var6 = ub.field_b[var4];
                      if ((var6 ^ -1) <= -1) {
                        var7 = vm.a((byte) -112, true, je.field_i[var4]);
                        var5 = var5 + field_a;
                        var8 = -(var7 >> 303659489) + oa.field_b;
                        cd.field_z[var4] = new int[4];
                        cd.field_z[var4][0] = var8 + -to.field_d;
                        cd.field_z[var4][1] = var5;
                        cd.field_z[var4][2] = var7 + (to.field_d << 1569554401);
                        var5 = var5 + (field_a + (bn.field_c << -819165439) + gh.field_w);
                        cd.field_z[var4][3] = gh.field_w + (bn.field_c << -508643039);
                        var4++;
                        continue L28;
                      } else {
                        var5 = var5 + io.field_O;
                        var4++;
                        continue L28;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                L30: {
                  stackOut_105_0 = gp.field_a;
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_106_0 = stackOut_105_0;
                  if ((ub.field_b[var4] ^ -1) <= -1) {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = gh.field_w;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    break L30;
                  } else {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = io.field_O;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_108_1 = stackOut_106_1;
                    break L30;
                  }
                }
                gp.field_a = stackIn_108_0 + stackIn_108_1;
                var4++;
                continue L27;
              }
            }
          } else {
            L31: {
              stackOut_86_0 = 90;
              stackIn_88_0 = stackOut_86_0;
              stackIn_87_0 = stackOut_86_0;
              if (ub.field_b[var4] < 0) {
                stackOut_88_0 = stackIn_88_0;
                stackOut_88_1 = 0;
                stackIn_89_0 = stackOut_88_0;
                stackIn_89_1 = stackOut_88_1;
                break L31;
              } else {
                stackOut_87_0 = stackIn_87_0;
                stackOut_87_1 = 1;
                stackIn_89_0 = stackOut_87_0;
                stackIn_89_1 = stackOut_87_1;
                break L31;
              }
            }
            var5 = vm.a((byte) stackIn_89_0, stackIn_89_1 != 0, je.field_i[var4]);
            if (var3 < var5) {
              var3 = var5;
              var4++;
              continue L23;
            } else {
              var4++;
              continue L23;
            }
          }
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    static {
    }
}
