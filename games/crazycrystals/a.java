/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class a implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_a;
    static ue field_b;
    static dl field_c;
    static am field_d;

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
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
              if (null == tm.field_b) {
                break L1;
              } else {
                aq.field_s = 0;
                fq.field_C = param0.getX();
                tn.field_s = param0.getY();
                wl.field_m = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("a.mouseEntered(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
              if (null != tm.field_b) {
                L2: {
                  aq.field_s = 0;
                  kk.field_g = param0.getX();
                  sb.field_I = param0.getY();
                  if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    th.field_y = 2;
                    uc.field_b = 2;
                    break L2;
                  } else {
                    th.field_y = 1;
                    uc.field_b = 1;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  wl.field_m = true;
                  if ((var2_int & 4) != 0) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (0 == (16 & var2_int)) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if ((8 & var2_int) != 0) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (param0.isPopupTrigger()) {
                param0.consume();
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("a.mousePressed(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
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
              if (tm.field_b != null) {
                aq.field_s = 0;
                fq.field_C = -1;
                tn.field_s = -1;
                wl.field_m = true;
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
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("a.mouseExited(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
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
              if (tm.field_b == null) {
                break L1;
              } else {
                aq.field_s = 0;
                fq.field_C = param0.getX();
                tn.field_s = param0.getY();
                wl.field_m = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("a.mouseMoved(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
              if (tm.field_b == null) {
                break L1;
              } else {
                aq.field_s = 0;
                fq.field_C = param0.getX();
                tn.field_s = param0.getY();
                wl.field_m = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("a.mouseDragged(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
              if (null == tm.field_b) {
                break L1;
              } else {
                L2: {
                  aq.field_s = 0;
                  uc.field_b = 0;
                  wl.field_m = true;
                  var2_int = param0.getModifiers();
                  if (-1 == (var2_int & 4)) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-1 != (var2_int & 8)) {
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
              }
            }
            L4: {
              if (param0.isPopupTrigger()) {
                param0.consume();
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("a.mouseReleased(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L5;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, vc param5, int param6, int param7, vc param8, int param9, int param10, int param11, hj param12, hj param13, int param14, hj param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException var21 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            sl.a(param5, param8, 107, param18);
            mo.a(20, 17, 15, 26, (byte) -16);
            mh.a(param7, -20, 240);
            f.a(20, param15, 5, param13, 0, (byte) 104);
            u.a(param6, param12, 250, param9);
            vf.a(param11, (byte) 118, param10, param19);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var21;
            stackOut_4_1 = new StringBuilder().append("a.A(").append(26).append(',').append(240).append(',').append(0).append(',').append(17).append(',').append(15).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param8 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param12 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param13 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param15 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 20 + ',' + 5 + ',' + param18 + ',' + param19 + ',' + 20 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
        field_c = null;
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
              if (tm.field_b != null) {
                uc.field_b = 0;
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
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("a.focusLost(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = CrazyCrystals.field_B;
          sd.field_T = null;
          dj.field_t = false;
          if (ne.field_d) {
            sp.field_a.l(126);
            break L0;
          } else {
            var1 = kl.field_V;
            if (var1 <= 0) {
              sp.field_a.i((byte) -78);
              rf.a(3);
              break L0;
            } else {
              if (var1 != 1) {
                sd.field_T = ci.a(new String[1], gh.field_t, 3);
                sd.field_T = dk.a(new CharSequence[3], (byte) -55);
                sp.field_a.i((byte) -78);
                rf.a(3);
                break L0;
              } else {
                sd.field_T = va.field_a;
                sd.field_T = dk.a(new CharSequence[3], (byte) -55);
                sp.field_a.i((byte) -78);
                rf.a(3);
                break L0;
              }
            }
          }
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -38;
            stackOut_0_0 = qn.a((byte) -123, false, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("a.E(").append(-30).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3_int = 0;
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
        int stackIn_103_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
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
        int stackOut_102_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
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
            var3_int = v.a(ec.field_m, ug.field_a, -27815, vk.field_L, eb.field_y);
            var4 = 3 + var3_int;
            ub.field_b = new int[var4];
            je.field_i = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                sn.field_a = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3_int) {
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
                var3_int = v.a(ec.field_m, ci.a(new String[1], rg.field_b, 3), -27815, vk.field_L, eb.field_y);
                var4 = -1;
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (var3_int <= var5) {
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
                    lo.field_c = new String[-1 + var3_int - var4];
                    eg.a((Object[]) (Object) eb.field_y, 1 + var4, (Object[]) (Object) lo.field_c, 0, -1 + (-var4 + var3_int));
                    var3_int = v.a(ec.field_m, ci.a(new String[1], jg.field_t, 3), -27815, vk.field_L, eb.field_y);
                    var4 = -1;
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        if (var3_int <= var5) {
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
                          ne.field_a = new String[-var4 + (var3_int - 1)];
                          eg.a((Object[]) (Object) eb.field_y, 1 + var4, (Object[]) (Object) ne.field_a, 0, -1 + (-var4 + var3_int));
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
                                  if (-var5 + (var8 + sl.field_r.length) >= 0) {
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
                  if (am.field_g != 4) {
                    if (am.field_g != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var3_int = v.a(ec.field_m, fn.field_i, -27815, vk.field_L, eb.field_y);
                      var4 = var3_int + 3;
                      je.field_i = new String[var4];
                      ub.field_b = new int[var4];
                      var5 = 0;
                      L14: while (true) {
                        if (var4 <= var5) {
                          sn.field_a = new int[2];
                          var5 = 0;
                          L15: while (true) {
                            if (var3_int <= var5) {
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
                    var3_int = v.a(ec.field_m, nh.field_C, -27815, vk.field_L, eb.field_y);
                    var4 = var3_int + 2;
                    ub.field_b = new int[var4];
                    je.field_i = new String[var4];
                    var5 = 0;
                    L16: while (true) {
                      if (var5 >= var4) {
                        sn.field_a = new int[1];
                        var5 = 0;
                        L17: while (true) {
                          if (var5 >= var3_int) {
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
                      var3_int = v.a(ec.field_m, ib.field_m, -27815, vk.field_L, eb.field_y);
                      break L18;
                    } else {
                      var3_int = v.a(ec.field_m, gn.field_U, -27815, vk.field_L, eb.field_y);
                      break L18;
                    }
                  }
                  var4 = var3_int + 2;
                  ub.field_b = new int[var4];
                  je.field_i = new String[var4];
                  var5 = 0;
                  L19: while (true) {
                    if (var4 <= var5) {
                      sn.field_a = new int[1];
                      var5 = 0;
                      L20: while (true) {
                        if (var5 >= var3_int) {
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
              var3_int = v.a(ec.field_m, ug.field_a, -27815, vk.field_L, eb.field_y);
              var4 = var3_int + 2;
              ub.field_b = new int[var4];
              je.field_i = new String[var4];
              var5 = 0;
              L21: while (true) {
                if (var5 >= var4) {
                  sn.field_a = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (var3_int <= var5) {
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
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= je.field_i.length) {
            L24: {
              if (am.field_g != 2) {
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
                        L27: {
                          var13 = var11[var5];
                          var7 = vm.a((byte) -113, false, var13);
                          if (var3_int >= var7) {
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  } else {
                    L28: {
                      var12 = var10[var5];
                      var7 = vm.a((byte) 98, false, var12);
                      if (var7 <= var3_int) {
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              }
            }
            ri.field_a = oa.field_b + (var3_int + -(var3_int >> 1));
            gp.field_a = (field_a + bn.field_c << 1) * lb.field_l.field_b;
            bf.field_c = -(var3_int >> 1) + oa.field_b;
            var4 = 0;
            L29: while (true) {
              if (var4 >= je.field_i.length) {
                pf.field_n = -(gp.field_a >> 1) + rn.field_n;
                cd.field_z = new int[je.field_i.length][];
                if (param0 > 103) {
                  var4 = 0;
                  var5 = pf.field_n;
                  L30: while (true) {
                    if (je.field_i.length <= var4) {
                      L31: {
                        if (2 == am.field_g) {
                          lb.field_l.a((byte) 41, param2, -1, -1);
                          break L31;
                        } else {
                          lb.field_l.a((byte) 41, param2, be.a(-1013410975, qh.field_i, bm.field_h), 0);
                          break L31;
                        }
                      }
                      return;
                    } else {
                      L32: {
                        var6 = ub.field_b[var4];
                        if (var6 >= 0) {
                          var7 = vm.a((byte) -112, true, je.field_i[var4]);
                          var5 = var5 + field_a;
                          var8 = -(var7 >> 1) + oa.field_b;
                          cd.field_z[var4] = new int[4];
                          cd.field_z[var4][0] = var8 + -to.field_d;
                          cd.field_z[var4][1] = var5;
                          cd.field_z[var4][2] = var7 + (to.field_d << 1);
                          var5 = var5 + (field_a + (bn.field_c << 1) + gh.field_w);
                          cd.field_z[var4][3] = gh.field_w + (bn.field_c << 1);
                          break L32;
                        } else {
                          var5 = var5 + io.field_O;
                          break L32;
                        }
                      }
                      var4++;
                      continue L30;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L33: {
                  stackOut_102_0 = gp.field_a;
                  stackIn_104_0 = stackOut_102_0;
                  stackIn_103_0 = stackOut_102_0;
                  if (ub.field_b[var4] >= 0) {
                    stackOut_104_0 = stackIn_104_0;
                    stackOut_104_1 = gh.field_w;
                    stackIn_105_0 = stackOut_104_0;
                    stackIn_105_1 = stackOut_104_1;
                    break L33;
                  } else {
                    stackOut_103_0 = stackIn_103_0;
                    stackOut_103_1 = io.field_O;
                    stackIn_105_0 = stackOut_103_0;
                    stackIn_105_1 = stackOut_103_1;
                    break L33;
                  }
                }
                gp.field_a = stackIn_105_0 + stackIn_105_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              stackOut_86_0 = 90;
              stackIn_88_0 = stackOut_86_0;
              stackIn_87_0 = stackOut_86_0;
              if (ub.field_b[var4] < 0) {
                stackOut_88_0 = stackIn_88_0;
                stackOut_88_1 = 0;
                stackIn_89_0 = stackOut_88_0;
                stackIn_89_1 = stackOut_88_1;
                break L34;
              } else {
                stackOut_87_0 = stackIn_87_0;
                stackOut_87_1 = 1;
                stackIn_89_0 = stackOut_87_0;
                stackIn_89_1 = stackOut_87_1;
                break L34;
              }
            }
            L35: {
              var5 = vm.a((byte) stackIn_89_0, stackIn_89_1 != 0, je.field_i[var4]);
              if (var3_int >= var5) {
                break L35;
              } else {
                break L35;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
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
              if (!param0.isPopupTrigger()) {
                break L1;
              } else {
                param0.consume();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("a.mouseClicked(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    static {
    }
}
