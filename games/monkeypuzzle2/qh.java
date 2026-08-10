/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String[] field_c;
    static le[] field_a;
    static int field_b;

    final static void a(int param0, boolean param1) {
        gb.field_f = param0;
        if (!param1) {
            String var3 = (String) null;
            qh.a(-59, (aj) null, -21, false, (aj) null, 19, (String) null);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qh.mouseMoved(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qh.mouseDragged(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static int a(int param0, aj param1, int param2, boolean param3, aj param4, int param5, String param6) {
        int stackIn_8_0 = 0;
        gk stackIn_19_0 = null;
        gk stackIn_20_0 = null;
        String stackIn_20_1 = null;
        gk stackIn_22_0 = null;
        gk stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_34_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_8_0 = -1;
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
                  kc.field_b = null;
                  gf.field_c.field_h = 0;
                  if (param6 == null) {
                    L5: {
                      uc.field_a.field_h = 0;
                      uc.field_a.a(-803539344, pi.field_l.nextInt());
                      uc.field_a.a(-803539344, pi.field_l.nextInt());
                      stackIn_19_0 = uc.field_a;

                      if (!param4.b(0)) {
                        stackIn_20_0 = (gk) ((Object) stackIn_19_0);
                        stackIn_20_1 = "";
                        break L5;
                      } else {
                        stackIn_20_0 = (gk) ((Object) stackIn_19_0);
                        stackIn_20_1 = (String) (var14);
                        break L5;
                      }
                    }
                    L6: {
                      ((gk) (Object) stackIn_20_0).a(stackIn_20_1, -84);
                      stackIn_22_0 = uc.field_a;

                      if (!param1.b(0)) {
                        stackIn_23_0 = (gk) ((Object) stackIn_22_0);
                        stackIn_23_1 = "";
                        break L6;
                      } else {
                        stackIn_23_0 = (gk) ((Object) stackIn_22_0);
                        stackIn_23_1 = (String) (var8);
                        break L6;
                      }
                    }
                    ((gk) (Object) stackIn_23_0).a(stackIn_23_1, 116);
                    gf.field_c.b(16, param2 + -49151);
                    gf.field_c.field_h = gf.field_c.field_h + 1;
                    var9 = gf.field_c.field_h;
                    e.a(sd.field_a, fj.field_F, (byte) 113, gf.field_c, uc.field_a);
                    gf.field_c.a(gf.field_c.field_h + -var9, (byte) -114);
                    break L4;
                  } else {
                    L7: {
                      var9 = 0;
                      uc.field_a.field_h = 0;
                      if (!param3) {
                        break L7;
                      } else {
                        var9 = var9 | 1;
                        break L7;
                      }
                    }
                    L8: {
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
                        break L8;
                      } else {
                        var11_ref_String = "";
                        break L8;
                      }
                    }
                    gf.field_c.a(param2 + 69, var11_ref_String);
                    e.a(sd.field_a, fj.field_F, (byte) -112, gf.field_c, uc.field_a);
                    gf.field_c.d(6903, gf.field_c.field_h - var10);
                    break L4;
                  }
                }
                al.a((byte) -71, -1);
                dk.field_h = vd.field_e;
                break L3;
              } else {
                break L3;
              }
            }
            L9: {
              if (vd.field_e == dk.field_h) {
                if (hj.a(1, true)) {
                  L10: {
                    var9 = MonkeyPuzzle2.field_D.a((byte) 114);
                    MonkeyPuzzle2.field_D.field_h = 0;
                    if (var9 < 100) {
                      break L10;
                    } else {
                      if (105 >= var9) {
                        cm.field_E = new String[-100 + var9];
                        dk.field_h = MonkeyPuzzle2.field_C;
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if ((var9 ^ -1) != -249) {
                    if (-100 == (var9 ^ -1)) {
                      hj.a(gb.a((byte) 57), true);
                      kc.field_b = new Boolean(bi.a((byte) 122, MonkeyPuzzle2.field_D));
                      MonkeyPuzzle2.field_D.field_h = 0;
                      break L9;
                    } else {
                      dk.field_h = ma.field_d;
                      rc.field_f = -1;
                      wk.field_a = var9;
                      break L9;
                    }
                  } else {
                    nh.a((byte) 99, ii.a(false));
                    sl.field_n = sb.field_q;
                    gk.a(-1);
                    ck.field_e = false;
                    stackIn_34_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L11: {
              if (MonkeyPuzzle2.field_C != dk.field_h) {
                break L11;
              } else {
                var9 = 2;
                if (hj.a(var9, true)) {
                  var10 = MonkeyPuzzle2.field_D.j(17277);
                  MonkeyPuzzle2.field_D.field_h = 0;
                  if (hj.a(var10, true)) {
                    var11 = cm.field_E.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var11 <= var12) {
                        gk.a(-1);
                        ck.field_e = false;
                        stackIn_48_0 = 100 + var11;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        cm.field_E[var12] = MonkeyPuzzle2.field_D.b((byte) 93);
                        var12++;
                        continue L12;
                      }
                    }
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
            }
            L13: {
              if (dk.field_h == ma.field_d) {
                if (!gb.a(true)) {
                  break L13;
                } else {
                  L14: {
                    if ((wk.field_a ^ -1) != -256) {
                      sl.field_n = MonkeyPuzzle2.field_D.f(-1);
                      break L14;
                    } else {
                      var9_ref_String = MonkeyPuzzle2.field_D.g(-1185292952);
                      if (var9_ref_String == null) {
                        break L14;
                      } else {
                        pe.a(var9_ref_String, (byte) -108, ii.a(false));
                        break L14;
                      }
                    }
                  }
                  gk.a(param2 ^ 0);
                  ck.field_e = false;
                  stackIn_57_0 = wk.field_a;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                break L13;
              }
            }
            L15: {
              if (ol.field_g == null) {
                if (!ck.field_e) {
                  var9 = cg.field_g;
                  cg.field_g = id.field_m;
                  ck.field_e = true;
                  id.field_m = var9;
                  break L15;
                } else {
                  L16: {
                    if (wf.a(114) > 30000L) {
                      sl.field_n = kj.field_E;
                      break L16;
                    } else {
                      sl.field_n = hh.field_p;
                      break L16;
                    }
                  }
                  ck.field_e = false;
                  stackIn_65_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                break L15;
              }
            }
            stackIn_68_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var7);

            stackIn_71_1 = new StringBuilder().append("qh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L17;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L18;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_77_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L19;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L19;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_72_0), stackIn_78_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_34_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_48_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_57_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_65_0;
                } else {
                  return stackIn_68_0;
                }
              }
            }
          }
        }
    }

    final static void a(hl param0, int param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (ea.field_c <= var2_int) {
                    dupTemp$0 = param0.a(2147483647);
                    ek.field_d[dupTemp$0] = ek.field_d[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (ea.field_c <= var3) {
                        L4: {
                          ea.field_c = var2_int;
                          if (param1 == 6191) {
                            break L4;
                          } else {
                            field_b = -73;
                            break L4;
                          }
                        }
                        fieldTemp$1 = ea.field_c;
                        ea.field_c = ea.field_c + 1;
                        pg.field_e[fieldTemp$1] = param0;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if ((param0.field_i ^ -1) == (pg.field_e[var3].field_i ^ -1)) {
                              var4 = pg.field_e[var3].a(2147483647);
                              if (uj.field_g >= ek.field_d[var4]) {
                                break L6;
                              } else {
                                ek.field_d[var4] = ek.field_d[var4] - 1;
                                break L5;
                              }
                            } else {
                              break L6;
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          pg.field_e[incrementValue$2] = pg.field_e[var3];
                          break L5;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (pg.field_e[var2_int].field_i != param0.field_i) {
                        break L7;
                      } else {
                        dupTemp$3 = pg.field_e[var2_int].a(2147483647);
                        ek.field_d[dupTemp$3] = ek.field_d[dupTemp$3] + 1;
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                ek.field_d[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("qh.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (we.field_n != null) {
                L2: {
                  mg.field_s = 0;
                  cj.field_d = param0.getX();
                  ek.field_a = param0.getY();
                  pf.a(0);
                  if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    ke.field_g = 1;
                    lf.field_a = 1;
                    break L2;
                  } else {
                    ke.field_g = 2;
                    lf.field_a = 2;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  if ((8 & var2_int) != 0) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  oh.field_b = true;
                  if ((var2_int & 16) == 0) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if ((4 & var2_int) != 0) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (!param0.isPopupTrigger()) {
                break L5;
              } else {
                param0.consume();
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("qh.mousePressed(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qh.focusLost(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (we.field_n != null) {
                L2: {
                  mg.field_s = 0;
                  lf.field_a = 0;
                  oh.field_b = true;
                  var2_int = param0.getModifiers();
                  if ((8 & var2_int) != 0) {
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
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("qh.mouseReleased(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
