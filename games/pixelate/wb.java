/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wb implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static int field_c;
    static String field_a;

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
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
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wb.mouseClicked(");

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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wb.focusLost(");

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
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            long dupTemp$1 = 0L;
            IOException var2 = null;
            pc var4 = null;
            pc var5 = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
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
              dupTemp$1 = hm.a(64);
              aj.field_m = dupTemp$1;
              jc.field_c = dupTemp$1;
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
                        stackIn_11_0 = -2;
                        break L2;
                      } else {
                        stackIn_11_0 = -1;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wb.mouseDragged(");

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
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
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
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wb.mouseExited(");

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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -43) {
            wb.a(48, true);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wb.mouseMoved(");

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
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
                  hm.a(64);
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
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("wb.mousePressed(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wb.mouseEntered(");

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
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("wb.mouseReleased(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_4_0 = (hh) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (hh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("wb.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_107_0 = 0;
        bi var1;
        int var2;
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
                  fieldTemp$0 = pl.field_S;
                  pl.field_S = pl.field_S + 1;
                  if ((fieldTemp$0 ^ -1) <= -16) {
                    L4: {
                      of.field_d = ql.field_m;
                      if (5 != ql.field_m) {
                        stackIn_107_0 = 15;
                        break L4;
                      } else {
                        stackIn_107_0 = 75;
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
                      stackIn_81_0 = -1;
                      break L7;
                    } else {
                      stackIn_81_0 = 5;
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
                      fieldTemp$1 = pl.field_S;
                      pl.field_S = pl.field_S + 1;
                      if ((fieldTemp$1 ^ -1) > -16) {
                        break L9;
                      } else {
                        L10: {
                          of.field_d = ql.field_m;
                          if (5 != ql.field_m) {
                            stackIn_88_0 = 15;
                            break L10;
                          } else {
                            stackIn_88_0 = 75;
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
                      fieldTemp$2 = pl.field_S;
                      pl.field_S = pl.field_S + 1;
                      if ((fieldTemp$2 ^ -1) > -16) {
                        break L13;
                      } else {
                        L14: {
                          of.field_d = ql.field_m;
                          if (5 != ql.field_m) {
                            stackIn_70_0 = 15;
                            break L14;
                          } else {
                            stackIn_70_0 = 75;
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
                    fieldTemp$3 = pl.field_S;
                    pl.field_S = pl.field_S + 1;
                    if ((fieldTemp$3 ^ -1) > -16) {
                      break L16;
                    } else {
                      L17: {
                        of.field_d = ql.field_m;
                        if (5 != ql.field_m) {
                          stackIn_52_0 = 15;
                          break L17;
                        } else {
                          stackIn_52_0 = 75;
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
                    fieldTemp$4 = pl.field_S;
                    pl.field_S = pl.field_S + 1;
                    if ((fieldTemp$4 ^ -1) > -16) {
                      break L19;
                    } else {
                      L20: {
                        of.field_d = ql.field_m;
                        if (5 != ql.field_m) {
                          stackIn_39_0 = 15;
                          break L20;
                        } else {
                          stackIn_39_0 = 75;
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
                  fieldTemp$5 = pl.field_S;
                  pl.field_S = pl.field_S + 1;
                  if ((fieldTemp$5 ^ -1) > -16) {
                    break L22;
                  } else {
                    L23: {
                      of.field_d = ql.field_m;
                      if (5 != ql.field_m) {
                        stackIn_23_0 = 15;
                        break L23;
                      } else {
                        stackIn_23_0 = 75;
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
                  fieldTemp$6 = pl.field_S;
                  pl.field_S = pl.field_S + 1;
                  if ((fieldTemp$6 ^ -1) > -16) {
                    break L25;
                  } else {
                    L26: {
                      of.field_d = ql.field_m;
                      if (5 != ql.field_m) {
                        stackIn_10_0 = 15;
                        break L26;
                      } else {
                        stackIn_10_0 = 75;
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
