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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (hi.field_e == null) {
                break L1;
              } else {
                gj.field_l = 0;
                fc.field_g = -1;
                uj.field_i = -1;
                li.field_j = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("qi.mouseExited(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != hi.field_e) {
                L2: {
                  L3: {
                    gj.field_l = 0;
                    dh.field_w = param0.getX();
                    ga.field_b = param0.getY();
                    lk.a(0);
                    if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                      break L3;
                    } else {
                      ad.field_b = 1;
                      cg.field_k = 1;
                      if (!Transmogrify.field_A) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ad.field_b = 2;
                  cg.field_k = 2;
                  break L2;
                }
                L4: {
                  var2_int = param0.getModifiers();
                  if (0 == (var2_int & 8)) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((16 & var2_int) != 0) {
                    break L5;
                  } else {
                    break L5;
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
          L6: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("qi.mousePressed(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (hi.field_e == null) {
                break L1;
              } else {
                gj.field_l = 0;
                fc.field_g = param0.getX();
                uj.field_i = param0.getY();
                li.field_j = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("qi.mouseMoved(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == hi.field_e) {
                break L1;
              } else {
                gj.field_l = 0;
                fc.field_g = param0.getX();
                uj.field_i = param0.getY();
                li.field_j = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("qi.mouseDragged(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        sj stackIn_34_0 = null;
        int stackIn_37_0 = 0;
        sj stackIn_53_0 = null;
        sj stackIn_76_0 = null;
        Object stackIn_78_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        sj var4 = null;
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
                L4: {
                  var2 = (oa.field_j - 34) / wl.field_K.field_n;
                  if (-1 < (var2 ^ -1)) {
                    break L4;
                  } else {
                    if (-13 >= (var2 ^ -1)) {
                      break L4;
                    } else {
                      if (wk.field_a.field_e[var2] != null) {
                        break L4;
                      } else {
                        if (bk.field_a < 190) {
                          break L4;
                        } else {
                          if (bk.field_a < 190 + wl.field_K.field_m) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                L5: {
                  var2 = (-161 + oa.field_j) / wl.field_K.field_n;
                  if ((var2 ^ -1) > -1) {
                    break L5;
                  } else {
                    if ((var2 ^ -1) <= -9) {
                      break L5;
                    } else {
                      if (null != si.field_i.field_e[var2]) {
                        break L5;
                      } else {
                        if ((bk.field_a ^ -1) > -248) {
                          break L5;
                        } else {
                          if (wl.field_K.field_m + 247 <= bk.field_a) {
                            break L5;
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
                if (var5 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
              var1 = wk.field_a;
              break L1;
            }
            if (param0 > 44) {
              L6: {
                L7: {
                  L8: {
                    if (od.field_g != var1) {
                      break L8;
                    } else {
                      L9: while (true) {
                        L10: {
                          L11: {
                            if (0 >= var2) {
                              break L11;
                            } else {
                              stackIn_34_0 = od.field_g.field_e[-1 + var2];

                              if (var5 != 0) {
                                break L10;
                              } else {
                                if (stackIn_34_0 != null) {
                                  break L11;
                                } else {
                                  var2--;
                                  if (var5 == 0) {
                                    continue L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                          L12: {
                            if (od.field_g != sg.field_d.field_o) {
                              break L12;
                            } else {
                              if (null == od.field_g.field_e[var2]) {
                                var2--;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          stackIn_34_0 = sg.field_d;
                          break L10;
                        }
                        L13: {
                          if (stackIn_34_0.field_o == od.field_g) {
                            stackIn_37_0 = sg.field_d.field_t;
                            break L13;
                          } else {
                            stackIn_37_0 = 12;
                            break L13;
                          }
                        }
                        L14: {
                          L15: {
                            L16: {
                              var3 = stackIn_37_0;
                              if (var3 > var2) {
                                break L16;
                              } else {
                                var4_int = 1 + var3;
                                L17: while (true) {
                                  L18: {
                                    if (var2 < var4_int) {
                                      break L18;
                                    } else {
                                      stackIn_78_0 = null;

                                      if (var5 != 0) {
                                        break L6;
                                      } else {
                                        L19: {
                                          if (stackIn_78_0 != od.field_g.field_e[var4_int]) {
                                            od.field_g.field_e[var4_int].a(-1 + var4_int, 28, od.field_g);
                                            break L19;
                                          } else {
                                            break L19;
                                          }
                                        }
                                        var4_int++;
                                        if (var5 == 0) {
                                          continue L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                  if (var5 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            var4_int = var3 - 1;
                            L20: while (true) {
                              if (var2 > var4_int) {
                                break L15;
                              } else {
                                stackIn_53_0 = od.field_g.field_e[var4_int];

                                if (var5 != 0) {
                                  break L14;
                                } else {
                                  L21: {
                                    if (stackIn_53_0 == null) {
                                      break L21;
                                    } else {
                                      od.field_g.field_e[var4_int].a(var4_int + 1, 28, od.field_g);
                                      break L21;
                                    }
                                  }
                                  var4_int--;
                                  if (var5 == 0) {
                                    continue L20;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                          }
                          stackIn_53_0 = sg.field_d;
                          break L14;
                        }
                        ((sj) (Object) stackIn_53_0).a(var2, 28, od.field_g);
                        if (var5 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  L22: {
                    if (var1 != null) {
                      break L22;
                    } else {
                      L23: {
                        if (sg.field_d.field_o == od.field_g) {
                          break L23;
                        } else {
                          sg.field_d.a(sg.field_d.field_t, 28, sg.field_d.field_o);
                          if (var5 == 0) {
                            break L7;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var3 = 0;
                      L24: while (true) {
                        L25: {
                          if (-13 >= (var3 ^ -1)) {
                            break L25;
                          } else {
                            var4 = od.field_g.field_e[var3];
                            stackIn_78_0 = null;

                            if (var5 != 0) {
                              break L6;
                            } else {
                              if (stackIn_78_0 == var4) {
                                break L25;
                              } else {
                                var4.a(var4.field_t, 28, var4.field_o);
                                var3++;
                                if (var5 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                        }
                        if (var5 == 0) {
                          break L7;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  L26: {
                    L27: {
                      if (sg.field_d.field_o == od.field_g) {
                        var3 = sg.field_d.field_t + 1;
                        L28: while (true) {
                          if (12 <= var3) {
                            break L27;
                          } else {
                            stackIn_76_0 = od.field_g.field_e[var3];

                            if (var5 != 0) {
                              break L26;
                            } else {
                              L29: {
                                if (stackIn_76_0 != null) {
                                  break L29;
                                } else {
                                  if (var5 == 0) {
                                    break L27;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                              od.field_g.field_e[var3].a(-1 + var3, 28, od.field_g);
                              var3++;
                              if (var5 == 0) {
                                continue L28;
                              } else {
                                sg.field_d.a(var2, 28, (j) (var1));
                                sg.field_d = null;
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        break L27;
                      }
                    }
                    stackIn_76_0 = sg.field_d;
                    break L26;
                  }
                  ((sj) (Object) stackIn_76_0).a(var2, 28, (j) (var1));
                  break L7;
                }
                stackIn_78_0 = null;
                break L6;
              }
              sg.field_d = (sj) ((Object) stackIn_78_0);
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
