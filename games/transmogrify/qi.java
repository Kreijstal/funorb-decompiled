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
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("qi.mouseClicked(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("qi.mouseExited(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
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
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("qi.focusLost(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
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
              if (null != hi.field_e) {
                L2: {
                  L3: {
                    gj.field_l = 0;
                    dh.field_w = param0.getX();
                    ga.field_b = param0.getY();
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
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("qi.mousePressed(");
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
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("qi.mouseMoved(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("qi.mouseDragged(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
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
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("qi.mouseEntered(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
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
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("qi.mouseReleased(");
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        int var3 = 0;
        sj var4 = null;
        int var4_int = 0;
        int var5 = 0;
        sj stackIn_26_0 = null;
        sj stackIn_34_0 = null;
        int stackIn_37_0 = 0;
        Object stackIn_41_0 = null;
        sj stackIn_49_0 = null;
        sj stackIn_53_0 = null;
        Object stackIn_61_0 = null;
        sj stackIn_70_0 = null;
        sj stackIn_76_0 = null;
        Object stackIn_78_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_25_0 = null;
        sj stackOut_33_0 = null;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        Object stackOut_40_0 = null;
        sj stackOut_48_0 = null;
        sj stackOut_52_0 = null;
        Object stackOut_60_0 = null;
        sj stackOut_69_0 = null;
        sj stackOut_75_0 = null;
        Object stackOut_77_0 = null;
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
                              stackOut_25_0 = od.field_g.field_e[-1 + var2];
                              stackIn_34_0 = stackOut_25_0;
                              stackIn_26_0 = stackOut_25_0;
                              if (var5 != 0) {
                                break L10;
                              } else {
                                if (stackIn_26_0 != null) {
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
                          stackOut_33_0 = sg.field_d;
                          stackIn_34_0 = stackOut_33_0;
                          break L10;
                        }
                        L13: {
                          if (stackIn_34_0.field_o == od.field_g) {
                            stackOut_36_0 = sg.field_d.field_t;
                            stackIn_37_0 = stackOut_36_0;
                            break L13;
                          } else {
                            stackOut_35_0 = 12;
                            stackIn_37_0 = stackOut_35_0;
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
                                  if (var2 < var4_int) {
                                    if (var5 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    stackOut_40_0 = null;
                                    stackIn_78_0 = stackOut_40_0;
                                    stackIn_41_0 = stackOut_40_0;
                                    if (var5 != 0) {
                                      break L6;
                                    } else {
                                      L18: {
                                        if (stackIn_41_0 != od.field_g.field_e[var4_int]) {
                                          od.field_g.field_e[var4_int].a(-1 + var4_int, 28, od.field_g);
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      var4_int++;
                                      continue L17;
                                    }
                                  }
                                }
                              }
                            }
                            var4_int = var3 - 1;
                            L19: while (true) {
                              if (var2 > var4_int) {
                                break L15;
                              } else {
                                stackOut_48_0 = od.field_g.field_e[var4_int];
                                stackIn_53_0 = stackOut_48_0;
                                stackIn_49_0 = stackOut_48_0;
                                if (var5 != 0) {
                                  break L14;
                                } else {
                                  L20: {
                                    if (stackIn_49_0 == null) {
                                      break L20;
                                    } else {
                                      od.field_g.field_e[var4_int].a(var4_int + 1, 28, od.field_g);
                                      break L20;
                                    }
                                  }
                                  var4_int--;
                                  continue L19;
                                }
                              }
                            }
                          }
                          stackOut_52_0 = sg.field_d;
                          stackIn_53_0 = stackOut_52_0;
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
                  L21: {
                    if (var1 != null) {
                      break L21;
                    } else {
                      L22: {
                        if (sg.field_d.field_o == od.field_g) {
                          break L22;
                        } else {
                          sg.field_d.a(sg.field_d.field_t, 28, sg.field_d.field_o);
                          if (var5 == 0) {
                            break L7;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var3 = 0;
                      L23: while (true) {
                        L24: {
                          if (-13 >= (var3 ^ -1)) {
                            break L24;
                          } else {
                            var4 = od.field_g.field_e[var3];
                            stackOut_60_0 = null;
                            stackIn_78_0 = stackOut_60_0;
                            stackIn_61_0 = stackOut_60_0;
                            if (var5 != 0) {
                              break L6;
                            } else {
                              if (stackIn_61_0 == var4) {
                                break L24;
                              } else {
                                var4.a(var4.field_t, 28, var4.field_o);
                                var3++;
                                if (var5 == 0) {
                                  continue L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                        }
                        if (var5 == 0) {
                          break L7;
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                  L25: {
                    L26: {
                      if (sg.field_d.field_o == od.field_g) {
                        var3 = sg.field_d.field_t + 1;
                        L27: while (true) {
                          if (12 <= var3) {
                            break L26;
                          } else {
                            stackOut_69_0 = od.field_g.field_e[var3];
                            stackIn_76_0 = stackOut_69_0;
                            stackIn_70_0 = stackOut_69_0;
                            if (var5 != 0) {
                              break L25;
                            } else {
                              L28: {
                                if (stackIn_70_0 != null) {
                                  break L28;
                                } else {
                                  if (var5 == 0) {
                                    break L26;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                              od.field_g.field_e[var3].a(-1 + var3, 28, od.field_g);
                              var3++;
                              if (var5 == 0) {
                                continue L27;
                              } else {
                                sg.field_d.a(var2, 28, (j) (var1));
                                sg.field_d = null;
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        break L26;
                      }
                    }
                    stackOut_75_0 = sg.field_d;
                    stackIn_76_0 = stackOut_75_0;
                    break L25;
                  }
                  ((sj) (Object) stackIn_76_0).a(var2, 28, (j) (var1));
                  break L7;
                }
                stackOut_77_0 = null;
                stackIn_78_0 = stackOut_77_0;
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
