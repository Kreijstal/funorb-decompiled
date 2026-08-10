/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_a;
    static boolean field_d;
    static int field_b;
    static int[] field_e;
    static boolean field_c;

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
            if (null != ng.field_b) {
                wc.field_Ob = 0;
                lf.field_m = param0.getX();
                vg.field_c = param0.getY();
                kg.field_l = true;
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "h.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
            if (null != ng.field_b) {
                wc.field_Ob = 0;
                lf.field_m = param0.getX();
                vg.field_c = param0.getY();
                kg.field_l = true;
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "h.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(vn[] param0, int param1, int param2, byte param3, int param4) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            if (param3 == -17) {
              L1: {
                if (-1 == (param1 ^ -1)) {
                  param0[param2].a();
                  param0[param4].e(0, 0);
                  bi.a(0, 0, 24, 24, 0, 128);
                  cn.field_f.b(-124);
                  break L1;
                } else {
                  if (param1 == 1) {
                    param0[param2].a();
                    param0[param4].e(0, 0);
                    var5_int = 0;
                    L2: while (true) {
                      if (var5_int < 24) {
                        bi.g(var5_int, 0, 24, 0, 5 * var5_int);
                        var5_int++;
                        continue L2;
                      } else {
                        cn.field_f.b(-124);
                        break L1;
                      }
                    }
                  } else {
                    if (param1 == 2) {
                      param0[param2].a();
                      param0[param4].e(0, 0);
                      var5_int = 0;
                      L3: while (true) {
                        if (24 > var5_int) {
                          bi.g(var5_int, 0, 24, 0, -(var5_int * 5) + 120);
                          var5_int++;
                          continue L3;
                        } else {
                          cn.field_f.b(-124);
                          break L1;
                        }
                      }
                    } else {
                      if (-4 == (param1 ^ -1)) {
                        param0[param2].a();
                        param0[param4].e(0, 0);
                        var5_int = 0;
                        L4: while (true) {
                          if ((var5_int ^ -1) > -25) {
                            bi.a(0, var5_int, 24, 0, 5 * var5_int);
                            var5_int++;
                            continue L4;
                          } else {
                            cn.field_f.b(-124);
                            break L1;
                          }
                        }
                      } else {
                        if (param1 == 4) {
                          param0[param2].a();
                          param0[param4].e(0, 0);
                          var5_int = 0;
                          L5: while (true) {
                            if ((var5_int ^ -1) > -25) {
                              bi.a(0, var5_int, 24, 0, -(var5_int * 5) + 120);
                              var5_int++;
                              continue L5;
                            } else {
                              cn.field_f.b(-124);
                              break L1;
                            }
                          }
                        } else {
                          if (6 == param1) {
                            param0[param2].a();
                            param0[param4].e(0, 0);
                            var5_int = 0;
                            L6: while (true) {
                              if (24 > var5_int) {
                                bi.a(var5_int + 1, var5_int, -var5_int + 24, 0, var5_int * 5);
                                bi.g(var5_int, var5_int, 24 - var5_int, 0, 5 * var5_int);
                                var5_int++;
                                continue L6;
                              } else {
                                cn.field_f.b(-124);
                                break L1;
                              }
                            }
                          } else {
                            if (param1 != 8) {
                              if (-8 != (param1 ^ -1)) {
                                if (-6 == (param1 ^ -1)) {
                                  param0[param2].a();
                                  param0[param4].e(0, 0);
                                  var5_int = 0;
                                  L7: while (true) {
                                    if (-25 < (var5_int ^ -1)) {
                                      bi.a(24 + -var5_int, var5_int, var5_int, 0, -(var5_int * 5) + 120);
                                      bi.g(var5_int, 0, 24 - var5_int, 0, 5 * var5_int);
                                      var5_int++;
                                      continue L7;
                                    } else {
                                      cn.field_f.b(-124);
                                      break L1;
                                    }
                                  }
                                } else {
                                  cn.field_f.b(-124);
                                  break L1;
                                }
                              } else {
                                param0[param2].a();
                                param0[param4].e(0, 0);
                                var5_int = 0;
                                L8: while (true) {
                                  if (-25 < (var5_int ^ -1)) {
                                    bi.a(0, var5_int, 24 + -var5_int, 0, var5_int * 5);
                                    bi.g(var5_int, -var5_int + 24, var5_int, 0, 120 - var5_int * 5);
                                    var5_int++;
                                    continue L8;
                                  } else {
                                    cn.field_f.b(-124);
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              param0[param2].a();
                              param0[param4].e(0, 0);
                              var5_int = 0;
                              L9: while (true) {
                                if (var5_int < 24) {
                                  bi.a(0, var5_int, var5_int + 1, 0, -(5 * var5_int) + 120);
                                  bi.g(var5_int, 0, var5_int, 0, -(5 * var5_int) + 120);
                                  var5_int++;
                                  continue L9;
                                } else {
                                  cn.field_f.b(-124);
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var5);

            stackIn_50_1 = new StringBuilder().append("h.A(");

            if (param0 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L10;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L10;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
            if (param0.isPopupTrigger()) {
                param0.consume();
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "h.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static v[] a(dj param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        vn[] var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 <= -68) {
              break L0;
            } else {
              var5 = (vn[]) null;
              h.a((vn[]) null, -98, 92, (byte) 28, 20);
              break L0;
            }
          }
          if (ph.a(param1, 31043, param3, param0)) {
            return di.a(-79);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("h.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
            if (ng.field_b != null) {
                wc.field_Ob = 0;
                lf.field_m = -1;
                vg.field_c = -1;
                kg.field_l = true;
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "h.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null == ng.field_b) {
                break L1;
              } else {
                L2: {
                  wc.field_Ob = 0;
                  ep.field_m = param0.getX();
                  pf.field_c = param0.getY();
                  pd.a(-22826);
                  if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    nb.field_j = 1;
                    le.field_c = 1;
                    break L2;
                  } else {
                    nb.field_j = 2;
                    le.field_c = 2;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  kg.field_l = true;
                  if ((var2_int & 8) != 0) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((var2_int & 16) == 0) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (0 != (var2_int & 4)) {
                  break L1;
                } else {
                  break L1;
                }
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
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("h.mousePressed(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L6;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
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
              if (ng.field_b != null) {
                L2: {
                  wc.field_Ob = 0;
                  le.field_c = 0;
                  kg.field_l = true;
                  var2_int = param0.getModifiers();
                  if ((var2_int & 4) != 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-1 == (var2_int & 8 ^ -1)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if ((var2_int & 16) != 0) {
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

            stackIn_10_1 = new StringBuilder().append("h.mouseReleased(");

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
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
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
              if (null != ng.field_b) {
                le.field_c = 0;
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

            stackIn_6_1 = new StringBuilder().append("h.focusLost(");

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != -14380) {
            h.a(-106);
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
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
              if (null != ng.field_b) {
                wc.field_Ob = 0;
                lf.field_m = param0.getX();
                vg.field_c = param0.getY();
                kg.field_l = true;
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

            stackIn_6_1 = new StringBuilder().append("h.mouseEntered(");

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_a = 25;
        field_e = new int[61];
    }
}
