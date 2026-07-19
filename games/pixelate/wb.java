/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wb implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static int field_c;
    static String field_a;

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
            L1: {
              if (param0.isPopupTrigger()) {
                param0.consume();
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
            stackOut_4_1 = new StringBuilder().append("wb.mouseClicked(");
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
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
              if (fj.field_c == null) {
                break L1;
              } else {
                jm.field_o = 0;
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
            stackOut_3_1 = new StringBuilder().append("wb.focusLost(");
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
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            long dupTemp$2 = 0L;
            IOException var2 = null;
            pc var4 = null;
            pc var5 = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_9_0 = 0;
            L0: {
              if (ra.field_b == null) {
                ra.field_b = op.field_p.a(param0 ^ 20278, ii.field_B, gd.field_g);
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 == ra.field_b.field_b) {
              return false;
            } else {
              dupTemp$2 = hm.a(64);
              aj.field_m = dupTemp$2;
              jc.field_c = dupTemp$2;
              if ((ra.field_b.field_b ^ -1) == -2) {
                try {
                  L1: {
                    L2: {
                      sh.field_e = new mo((java.net.Socket) (ra.field_b.field_e), op.field_p);
                      aa.field_f.field_m = 0;
                      var4 = vi.field_o;
                      var5 = var4;
                      uk.field_s = ij.field_o;
                      var5.field_m = 0;
                      if (param1) {
                        stackOut_10_0 = -2;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = -1;
                        stackIn_11_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    oj.field_G = stackIn_11_0;
                    gb.field_d = stackIn_11_0;
                    tm.field_U = stackIn_11_0;
                    al.a(pc.field_q, (byte) 66, bj.field_a, aa.field_f, hf.field_n);
                    vg.b(-1, 10000);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  uk.field_s = jm.field_q;
                  ra.field_b = null;
                  return true;
                }
                ra.field_b = null;
                return true;
              } else {
                uk.field_s = jm.field_q;
                ra.field_b = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
              if (null == fj.field_c) {
                break L1;
              } else {
                oi.field_c = 0;
                u.field_b = param0.getX();
                ra.field_d = param0.getY();
                u.field_j = true;
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
            stackOut_3_1 = new StringBuilder().append("wb.mouseDragged(");
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
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
              if (null != fj.field_c) {
                oi.field_c = 0;
                u.field_b = -1;
                ra.field_d = -1;
                u.field_j = true;
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
            stackOut_4_1 = new StringBuilder().append("wb.mouseExited(");
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_a = null;
        if (param0 >= -43) {
            discarded$0 = wb.a(48, true);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
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
              if (fj.field_c == null) {
                break L1;
              } else {
                oi.field_c = 0;
                u.field_b = param0.getX();
                ra.field_d = param0.getY();
                u.field_j = true;
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
            stackOut_3_1 = new StringBuilder().append("wb.mouseMoved(");
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
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
              if (null == fj.field_c) {
                break L1;
              } else {
                L2: {
                  oi.field_c = 0;
                  c.field_X = param0.getX();
                  fa.field_j = param0.getY();
                  if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    tl.field_a = 2;
                    jm.field_o = 2;
                    break L2;
                  } else {
                    tl.field_a = 1;
                    jm.field_o = 1;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  if ((var2_int & 4) == 0) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((var2_int & 8) != 0) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-1 == (var2_int & 16 ^ -1)) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                u.field_j = true;
                break L1;
              }
            }
            L6: {
              if (param0.isPopupTrigger()) {
                param0.consume();
                break L6;
              } else {
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
            stackOut_12_1 = new StringBuilder().append("wb.mousePressed(");
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
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

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
              if (fj.field_c == null) {
                break L1;
              } else {
                oi.field_c = 0;
                u.field_b = param0.getX();
                ra.field_d = param0.getY();
                u.field_j = true;
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
            stackOut_3_1 = new StringBuilder().append("wb.mouseEntered(");
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
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (null != fj.field_c) {
                L2: {
                  oi.field_c = 0;
                  jm.field_o = 0;
                  u.field_j = true;
                  var2_int = param0.getModifiers();
                  if ((var2_int & 16) == 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 != (4 & var2_int)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if ((var2_int & 8) != 0) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
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
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("wb.mouseReleased(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static hh a(hh param0, boolean param1, int[] param2) {
        hh var3 = null;
        RuntimeException var3_ref = null;
        hh stackIn_2_0 = null;
        hh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_3_0 = null;
        hh stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var3 = new hh(0, 0, 0);
            var3.field_o = param2;
            var3.field_h = param0.field_h;
            var3.field_f = param0.field_f;
            if (!param1) {
              var3.field_d = param0.field_d;
              var3.field_n = param0.field_n;
              var3.field_m = param0.field_m;
              var3.field_a = param0.field_a;
              var3.field_g = param0.field_g;
              stackOut_3_0 = (hh) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (hh) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("wb.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static fm a(int param0, byte param1) {
        if (param1 != 124) {
            return (fm) null;
        }
        return el.a(-115, true, false, param0, 1, false);
    }

    final static void b(int param0) {
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        bi var1 = null;
        int var2 = 0;
        int stackIn_10_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var2 = Pixelate.field_H ? 1 : 0;
        if (-1 > (le.field_j ^ -1)) {
          le.field_j = le.field_j - 1;
          return;
        } else {
          if (sd.field_N) {
            if (tn.field_i != w.field_v.field_d.field_d) {
              tn.field_i = w.field_v.field_d.field_d;
              if (w.field_v.field_r == 0) {
                L0: {
                  ql.field_m = w.field_v.field_d.field_d;
                  if (param0 == 5) {
                    break L0;
                  } else {
                    field_c = -69;
                    break L0;
                  }
                }
                if (of.field_d == ql.field_m) {
                  if (-1 <= (lb.field_D ^ -1)) {
                    if ((pl.field_S ^ -1) >= -1) {
                      L1: {
                        if (-1 == of.field_d) {
                          break L1;
                        } else {
                          var1 = jb.field_b[of.field_d];
                          var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                          break L1;
                        }
                      }
                      return;
                    } else {
                      pl.field_S = pl.field_S - 1;
                      L2: {
                        if (-1 == of.field_d) {
                          break L2;
                        } else {
                          var1 = jb.field_b[of.field_d];
                          var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                          break L2;
                        }
                      }
                      return;
                    }
                  } else {
                    lb.field_D = lb.field_D - 1;
                    L3: {
                      if (-1 == of.field_d) {
                        break L3;
                      } else {
                        var1 = jb.field_b[of.field_d];
                        var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                        break L3;
                      }
                    }
                    return;
                  }
                } else {
                  fieldTemp$7 = pl.field_S;
                  pl.field_S = pl.field_S + 1;
                  if ((fieldTemp$7 ^ -1) <= -16) {
                    L4: {
                      of.field_d = ql.field_m;
                      if (5 != ql.field_m) {
                        stackOut_106_0 = 15;
                        stackIn_107_0 = stackOut_106_0;
                        break L4;
                      } else {
                        stackOut_105_0 = 75;
                        stackIn_107_0 = stackOut_105_0;
                        break L4;
                      }
                    }
                    lb.field_D = stackIn_107_0;
                    L5: {
                      if (-1 == of.field_d) {
                        break L5;
                      } else {
                        var1 = jb.field_b[of.field_d];
                        var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                        break L5;
                      }
                    }
                    return;
                  } else {
                    L6: {
                      if (-1 == of.field_d) {
                        break L6;
                      } else {
                        var1 = jb.field_b[of.field_d];
                        var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                        break L6;
                      }
                    }
                    return;
                  }
                }
              } else {
                if (-2 == (w.field_v.field_r ^ -1)) {
                  L7: {
                    if (0 != w.field_v.field_d.field_d) {
                      stackOut_80_0 = -1;
                      stackIn_81_0 = stackOut_80_0;
                      break L7;
                    } else {
                      stackOut_79_0 = 5;
                      stackIn_81_0 = stackOut_79_0;
                      break L7;
                    }
                  }
                  L8: {
                    ql.field_m = stackIn_81_0;
                    if (param0 == 5) {
                      break L8;
                    } else {
                      field_c = -69;
                      break L8;
                    }
                  }
                  L9: {
                    if (of.field_d == ql.field_m) {
                      if (-1 > (lb.field_D ^ -1)) {
                        lb.field_D = lb.field_D - 1;
                        break L9;
                      } else {
                        if ((pl.field_S ^ -1) >= -1) {
                          break L9;
                        } else {
                          pl.field_S = pl.field_S - 1;
                          break L9;
                        }
                      }
                    } else {
                      fieldTemp$8 = pl.field_S;
                      pl.field_S = pl.field_S + 1;
                      if ((fieldTemp$8 ^ -1) > -16) {
                        break L9;
                      } else {
                        L10: {
                          of.field_d = ql.field_m;
                          if (5 != ql.field_m) {
                            stackOut_87_0 = 15;
                            stackIn_88_0 = stackOut_87_0;
                            break L10;
                          } else {
                            stackOut_86_0 = 75;
                            stackIn_88_0 = stackOut_86_0;
                            break L10;
                          }
                        }
                        lb.field_D = stackIn_88_0;
                        break L9;
                      }
                    }
                  }
                  L11: {
                    if (-1 == of.field_d) {
                      break L11;
                    } else {
                      var1 = jb.field_b[of.field_d];
                      var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                      break L11;
                    }
                  }
                  return;
                } else {
                  L12: {
                    ql.field_m = -1;
                    if (param0 == 5) {
                      break L12;
                    } else {
                      field_c = -69;
                      break L12;
                    }
                  }
                  L13: {
                    if (of.field_d == ql.field_m) {
                      if (-1 > (lb.field_D ^ -1)) {
                        lb.field_D = lb.field_D - 1;
                        break L13;
                      } else {
                        if ((pl.field_S ^ -1) >= -1) {
                          break L13;
                        } else {
                          pl.field_S = pl.field_S - 1;
                          break L13;
                        }
                      }
                    } else {
                      fieldTemp$9 = pl.field_S;
                      pl.field_S = pl.field_S + 1;
                      if ((fieldTemp$9 ^ -1) > -16) {
                        break L13;
                      } else {
                        L14: {
                          of.field_d = ql.field_m;
                          if (5 != ql.field_m) {
                            stackOut_69_0 = 15;
                            stackIn_70_0 = stackOut_69_0;
                            break L14;
                          } else {
                            stackOut_68_0 = 75;
                            stackIn_70_0 = stackOut_68_0;
                            break L14;
                          }
                        }
                        lb.field_D = stackIn_70_0;
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if (-1 == of.field_d) {
                      break L15;
                    } else {
                      var1 = jb.field_b[of.field_d];
                      var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                      break L15;
                    }
                  }
                  return;
                }
              }
            } else {
              if (param0 != 5) {
                L16: {
                  field_c = -69;
                  if (of.field_d == ql.field_m) {
                    if (-1 > (lb.field_D ^ -1)) {
                      lb.field_D = lb.field_D - 1;
                      break L16;
                    } else {
                      if ((pl.field_S ^ -1) >= -1) {
                        break L16;
                      } else {
                        pl.field_S = pl.field_S - 1;
                        break L16;
                      }
                    }
                  } else {
                    fieldTemp$10 = pl.field_S;
                    pl.field_S = pl.field_S + 1;
                    if ((fieldTemp$10 ^ -1) > -16) {
                      break L16;
                    } else {
                      L17: {
                        of.field_d = ql.field_m;
                        if (5 != ql.field_m) {
                          stackOut_51_0 = 15;
                          stackIn_52_0 = stackOut_51_0;
                          break L17;
                        } else {
                          stackOut_50_0 = 75;
                          stackIn_52_0 = stackOut_50_0;
                          break L17;
                        }
                      }
                      lb.field_D = stackIn_52_0;
                      break L16;
                    }
                  }
                }
                L18: {
                  if (-1 == of.field_d) {
                    break L18;
                  } else {
                    var1 = jb.field_b[of.field_d];
                    var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                    break L18;
                  }
                }
                return;
              } else {
                L19: {
                  if (of.field_d == ql.field_m) {
                    if (-1 > (lb.field_D ^ -1)) {
                      lb.field_D = lb.field_D - 1;
                      break L19;
                    } else {
                      if ((pl.field_S ^ -1) >= -1) {
                        break L19;
                      } else {
                        pl.field_S = pl.field_S - 1;
                        break L19;
                      }
                    }
                  } else {
                    fieldTemp$11 = pl.field_S;
                    pl.field_S = pl.field_S + 1;
                    if ((fieldTemp$11 ^ -1) > -16) {
                      break L19;
                    } else {
                      L20: {
                        of.field_d = ql.field_m;
                        if (5 != ql.field_m) {
                          stackOut_38_0 = 15;
                          stackIn_39_0 = stackOut_38_0;
                          break L20;
                        } else {
                          stackOut_37_0 = 75;
                          stackIn_39_0 = stackOut_37_0;
                          break L20;
                        }
                      }
                      lb.field_D = stackIn_39_0;
                      break L19;
                    }
                  }
                }
                L21: {
                  if (-1 == of.field_d) {
                    break L21;
                  } else {
                    var1 = jb.field_b[of.field_d];
                    var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                    break L21;
                  }
                }
                return;
              }
            }
          } else {
            if (param0 != 5) {
              L22: {
                field_c = -69;
                if (of.field_d == ql.field_m) {
                  if (-1 > (lb.field_D ^ -1)) {
                    lb.field_D = lb.field_D - 1;
                    break L22;
                  } else {
                    if ((pl.field_S ^ -1) >= -1) {
                      break L22;
                    } else {
                      pl.field_S = pl.field_S - 1;
                      break L22;
                    }
                  }
                } else {
                  fieldTemp$12 = pl.field_S;
                  pl.field_S = pl.field_S + 1;
                  if ((fieldTemp$12 ^ -1) > -16) {
                    break L22;
                  } else {
                    L23: {
                      of.field_d = ql.field_m;
                      if (5 != ql.field_m) {
                        stackOut_22_0 = 15;
                        stackIn_23_0 = stackOut_22_0;
                        break L23;
                      } else {
                        stackOut_21_0 = 75;
                        stackIn_23_0 = stackOut_21_0;
                        break L23;
                      }
                    }
                    lb.field_D = stackIn_23_0;
                    break L22;
                  }
                }
              }
              L24: {
                if (-1 == of.field_d) {
                  break L24;
                } else {
                  var1 = jb.field_b[of.field_d];
                  var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                  break L24;
                }
              }
              return;
            } else {
              L25: {
                if (of.field_d == ql.field_m) {
                  if (-1 > (lb.field_D ^ -1)) {
                    lb.field_D = lb.field_D - 1;
                    break L25;
                  } else {
                    if ((pl.field_S ^ -1) >= -1) {
                      break L25;
                    } else {
                      pl.field_S = pl.field_S - 1;
                      break L25;
                    }
                  }
                } else {
                  fieldTemp$13 = pl.field_S;
                  pl.field_S = pl.field_S + 1;
                  if ((fieldTemp$13 ^ -1) > -16) {
                    break L25;
                  } else {
                    L26: {
                      of.field_d = ql.field_m;
                      if (5 != ql.field_m) {
                        stackOut_9_0 = 15;
                        stackIn_10_0 = stackOut_9_0;
                        break L26;
                      } else {
                        stackOut_8_0 = 75;
                        stackIn_10_0 = stackOut_8_0;
                        break L26;
                      }
                    }
                    lb.field_D = stackIn_10_0;
                    break L25;
                  }
                }
              }
              L27: {
                if (-1 == of.field_d) {
                  break L27;
                } else {
                  var1 = jb.field_b[of.field_d];
                  var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                  break L27;
                }
              }
              return;
            }
          }
        }
    }

    static {
        field_a = "Puzzle Complete!";
    }
}
