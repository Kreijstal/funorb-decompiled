/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static String field_a;

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (uc.field_m != null) {
                L2: {
                  tf.field_n = 0;
                  oga.field_q = 0;
                  gja.field_j = true;
                  var2_int = param0.getModifiers();
                  if (-1 != (var2_int & 16 ^ -1)) {
                    cj.field_f = cj.field_f & -2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-1 != (8 & var2_int ^ -1)) {
                    cj.field_f = cj.field_f & -3;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-1 != (var2_int & 4 ^ -1)) {
                  cj.field_f = cj.field_f & -5;
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
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("nn.mouseReleased(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != uc.field_m) {
              tf.field_n = 0;
              ue.field_N = param0.getX();
              dia.field_A = param0.getY();
              gja.field_j = true;
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

            stackIn_6_1 = new StringBuilder().append("nn.mouseMoved(");

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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (uc.field_m == null) {
                break L1;
              } else {
                L2: {
                  tf.field_n = 0;
                  tba.field_u = param0.getX();
                  dma.field_c = param0.getY();
                  f.b((byte) 73);
                  if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    jh.field_l = 1;
                    oga.field_q = 1;
                    break L2;
                  } else {
                    jh.field_l = 2;
                    oga.field_q = 2;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  if ((var2_int & 16) != 0) {
                    cj.field_f = cj.field_f | 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (0 == (var2_int & 8)) {
                    break L4;
                  } else {
                    cj.field_f = cj.field_f | 2;
                    break L4;
                  }
                }
                L5: {
                  if (0 == (4 & var2_int)) {
                    break L5;
                  } else {
                    cj.field_f = cj.field_f | 4;
                    break L5;
                  }
                }
                gja.field_j = true;
                break L1;
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
          L6: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("nn.mousePressed(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
            if (null != uc.field_m) {
                tf.field_n = 0;
                ue.field_N = param0.getX();
                dia.field_A = param0.getY();
                gja.field_j = true;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nn.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
            if (param0.isPopupTrigger()) {
                param0.consume();
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nn.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
            if (null != uc.field_m) {
                tf.field_n = 0;
                ue.field_N = -1;
                dia.field_A = -1;
                gja.field_j = true;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nn.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(aga param0, aga param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 104) {
              var3_int = param0.field_x - param1.field_x;
              var4 = param0.field_J + -param1.field_J;
              if (Math.abs(var3_int) >= Math.abs(var4)) {
                if (Math.abs(var3_int) > Math.abs(var4)) {
                  L1: {
                    if (0 <= var3_int) {
                      stackIn_24_0 = 4;
                      break L1;
                    } else {
                      stackIn_24_0 = 2;
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 5;
                  break L0;
                } else {
                  if (0 > var3_int) {
                    L2: {
                      if ((var4 ^ -1) > -1) {
                        stackIn_20_0 = 1;
                        break L2;
                      } else {
                        stackIn_20_0 = 2;
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (0 < var3_int) {
                      L3: {
                        if (var4 < 0) {
                          stackIn_16_0 = 4;
                          break L3;
                        } else {
                          stackIn_16_0 = 3;
                          break L3;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_12_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                L4: {
                  if ((var4 ^ -1) <= -1) {
                    stackIn_7_0 = 3;
                    break L4;
                  } else {
                    stackIn_7_0 = 1;
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -40;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("nn.B(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  return stackIn_24_0;
                }
              }
            }
          }
        }
    }

    final static void a(byte param0, sna param1) {
        sna var5 = null;
        int var3 = BachelorFridge.field_y;
        sna var4 = (sna) ((Object) param1.field_z.b((byte) 90));
        sna var2 = var4;
        while (var4 != null) {
            var4.field_hb = 0;
            var4.field_p = 0;
            var4.field_I = 0;
            var4.field_rb = 0;
            var5 = (sna) ((Object) param1.field_z.c(param0 ^ -126));
            var5 = var5;
        }
        if (param0 != -126) {
            return;
        }
        try {
            param1.field_rb = 0;
            param1.field_p = 0;
            param1.field_hb = 0;
            param1.field_I = 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nn.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
            if (uc.field_m != null) {
                oga.field_q = 0;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nn.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            nn.a(-74);
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (uc.field_m != null) {
              tf.field_n = 0;
              ue.field_N = param0.getX();
              dia.field_A = param0.getY();
              gja.field_j = true;
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

            stackIn_6_1 = new StringBuilder().append("nn.mouseDragged(");

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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_a = "You have been removed from <%0>'s game.";
    }
}
