/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String[] field_c;
    static le[] field_a;
    static int field_b;

    final static void a(int param0, boolean param1) {
        int discarded$0 = 0;
        gb.field_f = param0;
        if (!param1) {
            discarded$0 = qh.a(-59, (aj) null, -21, false, (aj) null, 19, (String) null);
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
            if (we.field_n != null) {
                mg.field_s = 0;
                b.field_k = -1;
                dh.field_b = -1;
                oh.field_b = true;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qh.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (null != we.field_n) {
                mg.field_s = 0;
                b.field_k = param0.getX();
                dh.field_b = param0.getY();
                oh.field_b = true;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("qh.mouseMoved(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
            if (null != we.field_n) {
                mg.field_s = 0;
                b.field_k = param0.getX();
                dh.field_b = param0.getY();
                oh.field_b = true;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qh.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (we.field_n != null) {
                mg.field_s = 0;
                b.field_k = param0.getX();
                dh.field_b = param0.getY();
                oh.field_b = true;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("qh.mouseDragged(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static int a(int param0, aj param1, int param2, boolean param3, aj param4, int param5, String param6) {
        boolean discarded$1 = false;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_8_0 = 0;
        gk stackIn_18_0 = null;
        gk stackIn_19_0 = null;
        gk stackIn_20_0 = null;
        String stackIn_20_1 = null;
        gk stackIn_21_0 = null;
        gk stackIn_22_0 = null;
        gk stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_34_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        gk stackOut_17_0 = null;
        gk stackOut_19_0 = null;
        String stackOut_19_1 = null;
        gk stackOut_18_0 = null;
        String stackOut_18_1 = null;
        gk stackOut_20_0 = null;
        gk stackOut_22_0 = null;
        String stackOut_22_1 = null;
        gk stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_33_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_74_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                field_a = (le[]) null;
                break L1;
              }
            }
            L2: {
              var14 = param4.a((byte) -93);
              var11_ref_String = var14;
              var11_ref_String = var14;
              var8 = param1.a((byte) -77);
              var11_ref_String = var8;
              var11_ref_String = var8;
              if (null == ol.field_g) {
                if (!cb.a(-123, false)) {
                  stackOut_7_0 = -1;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (ii.field_r == dk.field_h) {
                L4: {
                  L5: {
                    kc.field_b = null;
                    gf.field_c.field_h = 0;
                    if (param6 == null) {
                      break L5;
                    } else {
                      L6: {
                        var9 = 0;
                        uc.field_a.field_h = 0;
                        if (!param3) {
                          break L6;
                        } else {
                          var9 = var9 | 1;
                          break L6;
                        }
                      }
                      L7: {
                        uc.field_a.a(-803539344, pi.field_l.nextInt());
                        uc.field_a.a(param2 ^ 803539343, pi.field_l.nextInt());
                        uc.field_a.a(var14, param2 ^ 103);
                        uc.field_a.a(var8, -64);
                        var15 = (CharSequence) ((Object) param6);
                        uc.field_a.a(q.a(var15, 20), 122);
                        uc.field_a.c(param0, 127);
                        uc.field_a.b(param5, param2 + -49151);
                        uc.field_a.b(var9, -49152);
                        gf.field_c.b(18, param2 + -49151);
                        gf.field_c.field_h = gf.field_c.field_h + 2;
                        var10 = gf.field_c.field_h;
                        var11_ref_String = lc.a(ii.a(false), (byte) -89);
                        if (var11_ref_String != null) {
                          break L7;
                        } else {
                          var11_ref_String = "";
                          break L7;
                        }
                      }
                      gf.field_c.a(param2 + 69, var11_ref_String);
                      e.a(sd.field_a, fj.field_F, (byte) -112, gf.field_c, uc.field_a);
                      gf.field_c.d(6903, gf.field_c.field_h - var10);
                      if (var13 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    uc.field_a.field_h = 0;
                    uc.field_a.a(-803539344, pi.field_l.nextInt());
                    uc.field_a.a(-803539344, pi.field_l.nextInt());
                    stackOut_17_0 = uc.field_a;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (!param4.b(0)) {
                      stackOut_19_0 = (gk) ((Object) stackIn_19_0);
                      stackOut_19_1 = "";
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L8;
                    } else {
                      stackOut_18_0 = (gk) ((Object) stackIn_18_0);
                      stackOut_18_1 = (String) (var14);
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L8;
                    }
                  }
                  L9: {
                    ((gk) (Object) stackIn_20_0).a(stackIn_20_1, -84);
                    stackOut_20_0 = uc.field_a;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (!param1.b(0)) {
                      stackOut_22_0 = (gk) ((Object) stackIn_22_0);
                      stackOut_22_1 = "";
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      break L9;
                    } else {
                      stackOut_21_0 = (gk) ((Object) stackIn_21_0);
                      stackOut_21_1 = (String) (var8);
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      break L9;
                    }
                  }
                  ((gk) (Object) stackIn_23_0).a(stackIn_23_1, 116);
                  gf.field_c.b(16, param2 + -49151);
                  gf.field_c.field_h = gf.field_c.field_h + 1;
                  var9 = gf.field_c.field_h;
                  e.a(sd.field_a, fj.field_F, (byte) 113, gf.field_c, uc.field_a);
                  gf.field_c.a(gf.field_c.field_h + -var9, (byte) -114);
                  break L4;
                }
                al.a((byte) -71, -1);
                dk.field_h = vd.field_e;
                break L3;
              } else {
                break L3;
              }
            }
            L10: {
              if (vd.field_e == dk.field_h) {
                if (hj.a(1, true)) {
                  L11: {
                    L12: {
                      var9 = MonkeyPuzzle2.field_D.a((byte) 114);
                      MonkeyPuzzle2.field_D.field_h = 0;
                      if (var9 < 100) {
                        break L12;
                      } else {
                        if (105 >= var9) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if ((var9 ^ -1) != -249) {
                      L13: {
                        if (-100 == (var9 ^ -1)) {
                          break L13;
                        } else {
                          dk.field_h = ma.field_d;
                          rc.field_f = -1;
                          wk.field_a = var9;
                          if (var13 == 0) {
                            break L10;
                          } else {
                            break L13;
                          }
                        }
                      }
                      discarded$1 = hj.a(gb.a((byte) 57), true);
                      kc.field_b = new Boolean(bi.a((byte) 122, MonkeyPuzzle2.field_D));
                      MonkeyPuzzle2.field_D.field_h = 0;
                      if (var13 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    } else {
                      nh.a((byte) 99, ii.a(false));
                      sl.field_n = sb.field_q;
                      gk.a(-1);
                      ck.field_e = false;
                      stackOut_33_0 = var9;
                      stackIn_34_0 = stackOut_33_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  cm.field_E = new String[-100 + var9];
                  dk.field_h = MonkeyPuzzle2.field_C;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L14: {
              if (MonkeyPuzzle2.field_C != dk.field_h) {
                break L14;
              } else {
                var9 = 2;
                if (hj.a(var9, true)) {
                  var10 = MonkeyPuzzle2.field_D.j(17277);
                  MonkeyPuzzle2.field_D.field_h = 0;
                  if (hj.a(var10, true)) {
                    var11 = cm.field_E.length;
                    var12 = 0;
                    L15: while (true) {
                      L16: {
                        L17: {
                          if ((var11 ^ -1) >= (var12 ^ -1)) {
                            break L17;
                          } else {
                            cm.field_E[var12] = MonkeyPuzzle2.field_D.b((byte) 93);
                            var12++;
                            if (var13 != 0) {
                              break L16;
                            } else {
                              if (var13 == 0) {
                                continue L15;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        gk.a(-1);
                        ck.field_e = false;
                        break L16;
                      }
                      stackOut_52_0 = 100 + var11;
                      stackIn_53_0 = stackOut_52_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
            }
            L18: {
              if (dk.field_h == ma.field_d) {
                if (!gb.a(true)) {
                  break L18;
                } else {
                  L19: {
                    L20: {
                      if ((wk.field_a ^ -1) != -256) {
                        break L20;
                      } else {
                        L21: {
                          var9_ref_String = MonkeyPuzzle2.field_D.g(-1185292952);
                          if (var9_ref_String == null) {
                            break L21;
                          } else {
                            pe.a(var9_ref_String, (byte) -108, ii.a(false));
                            break L21;
                          }
                        }
                        if (var13 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    sl.field_n = MonkeyPuzzle2.field_D.f(-1);
                    break L19;
                  }
                  gk.a(param2 ^ 0);
                  ck.field_e = false;
                  stackOut_62_0 = wk.field_a;
                  stackIn_63_0 = stackOut_62_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                break L18;
              }
            }
            L22: {
              if (ol.field_g == null) {
                if (!ck.field_e) {
                  var9 = cg.field_g;
                  cg.field_g = id.field_m;
                  ck.field_e = true;
                  id.field_m = var9;
                  break L22;
                } else {
                  L23: {
                    L24: {
                      if (wf.a(114) > 30000L) {
                        break L24;
                      } else {
                        sl.field_n = hh.field_p;
                        if (var13 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    sl.field_n = kj.field_E;
                    break L23;
                  }
                  ck.field_e = false;
                  stackOut_71_0 = 249;
                  stackIn_72_0 = stackOut_71_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                break L22;
              }
            }
            stackOut_74_0 = -1;
            stackIn_75_0 = stackOut_74_0;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var7 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) (var7);
            stackOut_76_1 = new StringBuilder().append("qh.C(").append(param0).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param1 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L25;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L25;
            }
          }
          L26: {
            stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param4 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L26;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L26;
            }
          }
          L27: {
            stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',').append(param5).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param6 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L27;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L27;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_34_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_53_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_63_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_72_0;
                } else {
                  return stackIn_75_0;
                }
              }
            }
          }
        }
    }

    final static void a(hl param0, int param1) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int incrementValue$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 3) {
                    break L3;
                  } else {
                    ek.field_d[var2_int] = 0;
                    var2_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if ((ea.field_c ^ -1) >= (var2_int ^ -1)) {
                      break L6;
                    } else {
                      stackOut_9_0 = pg.field_e[var2_int].field_i ^ -1;
                      stackIn_14_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_10_0 != (param0.field_i ^ -1)) {
                            break L7;
                          } else {
                            dupTemp$4 = pg.field_e[var2_int].a(2147483647);
                            ek.field_d[dupTemp$4] = ek.field_d[dupTemp$4] + 1;
                            break L7;
                          }
                        }
                        var2_int++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  dupTemp$5 = param0.a(2147483647);
                  ek.field_d[dupTemp$5] = ek.field_d[dupTemp$5] + 1;
                  var2_int = 0;
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L5;
                }
                var3 = stackIn_14_0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if ((ea.field_c ^ -1) >= (var3 ^ -1)) {
                        break L10;
                      } else {
                        stackOut_16_0 = param0.field_i ^ -1;
                        stackOut_16_1 = pg.field_e[var3].field_i ^ -1;
                        stackIn_25_0 = stackOut_16_0;
                        stackIn_25_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (var5 != 0) {
                          break L9;
                        } else {
                          L11: {
                            L12: {
                              if (stackIn_17_0 == stackIn_17_1) {
                                var4 = pg.field_e[var3].a(2147483647);
                                if ((uj.field_g ^ -1) <= (ek.field_d[var4] ^ -1)) {
                                  break L12;
                                } else {
                                  ek.field_d[var4] = ek.field_d[var4] - 1;
                                  if (var5 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              } else {
                                break L12;
                              }
                            }
                            incrementValue$6 = var2_int;
                            var2_int++;
                            pg.field_e[incrementValue$6] = pg.field_e[var3];
                            break L11;
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    ea.field_c = var2_int;
                    stackOut_24_0 = param1;
                    stackOut_24_1 = 6191;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    break L9;
                  }
                  L13: {
                    if (stackIn_25_0 == stackIn_25_1) {
                      break L13;
                    } else {
                      field_b = -73;
                      break L13;
                    }
                  }
                  fieldTemp$7 = ea.field_c;
                  ea.field_c = ea.field_c + 1;
                  pg.field_e[fieldTemp$7] = param0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("qh.B(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L14;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L14;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
            if (param0.isPopupTrigger()) {
                param0.consume();
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qh.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (we.field_n != null) {
                L2: {
                  L3: {
                    mg.field_s = 0;
                    cj.field_d = param0.getX();
                    ek.field_a = param0.getY();
                    if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                      break L3;
                    } else {
                      ke.field_g = 2;
                      lf.field_a = 2;
                      if (!MonkeyPuzzle2.field_F) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ke.field_g = 1;
                  lf.field_a = 1;
                  break L2;
                }
                L4: {
                  var2_int = param0.getModifiers();
                  if ((8 & var2_int ^ -1) != -1) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  oh.field_b = true;
                  if ((var2_int & 16 ^ -1) == -1) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if ((4 & var2_int ^ -1) != -1) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (!param0.isPopupTrigger()) {
                break L6;
              } else {
                param0.consume();
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("qh.mousePressed(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L7;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (null != we.field_n) {
                lf.field_a = 0;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("qh.focusLost(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (we.field_n != null) {
                L2: {
                  mg.field_s = 0;
                  lf.field_a = 0;
                  oh.field_b = true;
                  var2_int = param0.getModifiers();
                  if ((8 & var2_int ^ -1) != -1) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 != (16 & var2_int)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-1 != (var2_int & 4 ^ -1)) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (!param0.isPopupTrigger()) {
                break L4;
              } else {
                param0.consume();
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("qh.mouseReleased(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L5;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
