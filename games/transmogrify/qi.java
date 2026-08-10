/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static nf field_c;
    static fe field_a;
    static int field_d;
    static String field_b;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qi.mouseClicked(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
            if (hi.field_e != null) {
                gj.field_l = 0;
                fc.field_g = -1;
                uj.field_i = -1;
                li.field_j = true;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "qi.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != hi.field_e) {
              cg.field_k = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qi.focusLost(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != hi.field_e) {
                L2: {
                  gj.field_l = 0;
                  dh.field_w = param0.getX();
                  ga.field_b = param0.getY();
                  lk.a(0);
                  if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    ad.field_b = 2;
                    cg.field_k = 2;
                    break L2;
                  } else {
                    ad.field_b = 1;
                    cg.field_k = 1;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  if (0 == (var2_int & 8)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((16 & var2_int) != 0) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                li.field_j = true;
                if ((var2_int & 4) == 0) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (!param0.isPopupTrigger()) {
              break L0;
            } else {
              param0.consume();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("qi.mousePressed(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
            if (hi.field_e != null) {
                gj.field_l = 0;
                fc.field_g = param0.getX();
                uj.field_i = param0.getY();
                li.field_j = true;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "qi.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
            if (null != hi.field_e) {
                gj.field_l = 0;
                fc.field_g = param0.getX();
                uj.field_i = param0.getY();
                li.field_j = true;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "qi.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != hi.field_e) {
              gj.field_l = 0;
              fc.field_g = param0.getX();
              uj.field_i = param0.getY();
              li.field_j = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qi.mouseEntered(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == hi.field_e) {
                break L1;
              } else {
                L2: {
                  gj.field_l = 0;
                  cg.field_k = 0;
                  li.field_j = true;
                  var2_int = param0.getModifiers();
                  if ((var2_int & 8) == 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((4 & var2_int) == 0) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-1 != (16 & var2_int ^ -1)) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("qi.mouseReleased(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void a(byte param0) {
        int stackIn_34_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        int var2 = 0;
        int var3 = 0;
        sj var4 = null;
        int var4_int = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var1 = null;
                if (null != od.field_g.field_e[11]) {
                  break L2;
                } else {
                  if ((oa.field_j ^ -1) > -35) {
                    break L2;
                  } else {
                    if (oa.field_j >= 34 - -(wl.field_K.field_n * 12)) {
                      break L2;
                    } else {
                      if ((bk.field_a ^ -1) > -115) {
                        break L2;
                      } else {
                        if (wl.field_K.field_m + 114 <= bk.field_a) {
                          break L2;
                        } else {
                          var1 = od.field_g;
                          var2 = (-34 + oa.field_j) / wl.field_K.field_n;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                var2 = (oa.field_j - 34) / wl.field_K.field_n;
                if (-1 < (var2 ^ -1)) {
                  break L3;
                } else {
                  if (-13 >= (var2 ^ -1)) {
                    break L3;
                  } else {
                    if (wk.field_a.field_e[var2] != null) {
                      break L3;
                    } else {
                      if (bk.field_a < 190) {
                        break L3;
                      } else {
                        if (bk.field_a < 190 + wl.field_K.field_m) {
                          var1 = wk.field_a;
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              L4: {
                var2 = (-161 + oa.field_j) / wl.field_K.field_n;
                if ((var2 ^ -1) > -1) {
                  break L4;
                } else {
                  if ((var2 ^ -1) <= -9) {
                    break L4;
                  } else {
                    if (null != si.field_i.field_e[var2]) {
                      break L4;
                    } else {
                      if ((bk.field_a ^ -1) > -248) {
                        break L4;
                      } else {
                        if (wl.field_K.field_m + 247 <= bk.field_a) {
                          break L4;
                        } else {
                          var1 = si.field_i;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            if (param0 > 44) {
              L5: {
                if (od.field_g != var1) {
                  if (var1 != null) {
                    L6: {
                      if (sg.field_d.field_o == od.field_g) {
                        var3 = sg.field_d.field_t + 1;
                        L7: while (true) {
                          if (12 <= var3) {
                            break L6;
                          } else {
                            if (od.field_g.field_e[var3] != null) {
                              od.field_g.field_e[var3].a(-1 + var3, 28, od.field_g);
                              var3++;
                              continue L7;
                            } else {
                              sg.field_d.a(var2, 28, (j) (var1));
                              sg.field_d = null;
                              return;
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    sg.field_d.a(var2, 28, (j) (var1));
                    break L5;
                  } else {
                    if (sg.field_d.field_o == od.field_g) {
                      var3 = 0;
                      L8: while (true) {
                        if (-13 >= (var3 ^ -1)) {
                          break L5;
                        } else {
                          var4 = od.field_g.field_e[var3];
                          if (var4 == null) {
                            break L5;
                          } else {
                            var4.a(var4.field_t, 28, var4.field_o);
                            var3++;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      sg.field_d.a(sg.field_d.field_t, 28, sg.field_d.field_o);
                      break L5;
                    }
                  }
                } else {
                  L9: while (true) {
                    L10: {
                      if (0 >= var2) {
                        break L10;
                      } else {
                        if (od.field_g.field_e[-1 + var2] != null) {
                          break L10;
                        } else {
                          var2--;
                          continue L9;
                        }
                      }
                    }
                    L11: {
                      if (od.field_g != sg.field_d.field_o) {
                        break L11;
                      } else {
                        if (null == od.field_g.field_e[var2]) {
                          var2--;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (sg.field_d.field_o == od.field_g) {
                        stackIn_34_0 = sg.field_d.field_t;
                        break L12;
                      } else {
                        stackIn_34_0 = 12;
                        break L12;
                      }
                    }
                    var3 = stackIn_34_0;
                    if (var3 > var2) {
                      var4_int = var3 - 1;
                      L13: while (true) {
                        if (var2 > var4_int) {
                          sg.field_d.a(var2, 28, od.field_g);
                          break L5;
                        } else {
                          L14: {
                            if (od.field_g.field_e[var4_int] == null) {
                              break L14;
                            } else {
                              od.field_g.field_e[var4_int].a(var4_int + 1, 28, od.field_g);
                              break L14;
                            }
                          }
                          var4_int--;
                          continue L13;
                        }
                      }
                    } else {
                      var4_int = 1 + var3;
                      L15: while (true) {
                        if (var2 < var4_int) {
                          sg.field_d.a(var2, 28, od.field_g);
                          break L5;
                        } else {
                          L16: {
                            if (null != od.field_g.field_e[var4_int]) {
                              od.field_g.field_e[var4_int].a(-1 + var4_int, 28, od.field_g);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          var4_int++;
                          continue L15;
                        }
                      }
                    }
                  }
                }
              }
              sg.field_d = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (var1), "qi.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        int var1 = 1 / ((-44 - param0) / 56);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_d = -1;
        field_b = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
