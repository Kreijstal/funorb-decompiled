/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wb implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static int field_c;
    static String field_a;

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (fj.field_c != null) {
            jm.field_o = 0;
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            IOException var2 = null;
            pc var4 = null;
            pc var5 = null;
            int stackIn_11_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ra.field_b == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        ra.field_b = op.field_p.a(param0 ^ 20278, ii.field_B, gd.field_g);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param0 == ra.field_b.field_b) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return false;
                    }
                    case 6: {
                        aj.field_m = hm.a(64);
                        jc.field_c = hm.a(64);
                        if ((ra.field_b.field_b ^ -1) == -2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        uk.field_s = jm.field_q;
                        ra.field_b = null;
                        return true;
                    }
                    case 8: {
                        try {
                            sh.field_e = new mo((java.net.Socket) ra.field_b.field_e, op.field_p);
                            aa.field_f.field_m = 0;
                            var4 = vi.field_o;
                            var5 = var4;
                            uk.field_s = ij.field_o;
                            var5.field_m = 0;
                            if (param1) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = -1;
                            stackIn_11_0 = stackOut_9_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = -2;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            oj.field_G = stackIn_11_0;
                            gb.field_d = stackIn_11_0;
                            tm.field_U = stackIn_11_0;
                            al.a(pc.field_q, (byte) 66, bj.field_a, (we) (Object) aa.field_f, hf.field_n);
                            vg.b(-1, 10000);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        ra.field_b = null;
                        return true;
                    }
                    case 13: {
                        var2 = (IOException) (Object) caughtException;
                        uk.field_s = jm.field_q;
                        ra.field_b = null;
                        return true;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (null != fj.field_c) {
            oi.field_c = 0;
            u.field_b = param0.getX();
            ra.field_d = param0.getY();
            u.field_j = true;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(null == fj.field_c)) {
            oi.field_c = 0;
            u.field_b = -1;
            ra.field_d = -1;
            u.field_j = true;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -43) {
            boolean discarded$0 = wb.a(48, true);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (fj.field_c != null) {
            oi.field_c = 0;
            u.field_b = param0.getX();
            ra.field_d = param0.getY();
            u.field_j = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != fj.field_c) {
          oi.field_c = 0;
          c.field_X = param0.getX();
          fa.field_j = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              tl.field_a = 1;
              jm.field_o = 1;
              var2 = param0.getModifiers();
              if ((var2 & 4) == 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((var2 & 8) != 0) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 == (var2 & 16 ^ -1)) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              u.field_j = true;
              if (param0.isPopupTrigger()) {
                param0.consume();
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              tl.field_a = 2;
              jm.field_o = 2;
              var2 = param0.getModifiers();
              if ((var2 & 4) == 0) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((var2 & 8) != 0) {
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 == (var2 & 16 ^ -1)) {
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              u.field_j = true;
              if (param0.isPopupTrigger()) {
                param0.consume();
                break L7;
              } else {
                break L7;
              }
            }
            return;
          }
        } else {
          L8: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L8;
            } else {
              break L8;
            }
          }
          return;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (fj.field_c != null) {
            oi.field_c = 0;
            u.field_b = param0.getX();
            ra.field_d = param0.getY();
            u.field_j = true;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null == fj.field_c) {
          L0: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            oi.field_c = 0;
            jm.field_o = 0;
            u.field_j = true;
            var2 = param0.getModifiers();
            if ((var2 & 16) == 0) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (0 != (4 & var2)) {
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if ((var2 & 8) != 0) {
              break L3;
            } else {
              break L3;
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
          return;
        }
    }

    final static hh a(hh param0, boolean param1, int[] param2) {
        hh var3 = null;
        var3 = new hh(0, 0, 0);
        var3.field_o = param2;
        var3.field_h = param0.field_h;
        var3.field_f = param0.field_f;
        if (param1) {
          return null;
        } else {
          var3.field_d = param0.field_d;
          var3.field_n = param0.field_n;
          var3.field_m = param0.field_m;
          var3.field_a = param0.field_a;
          var3.field_g = param0.field_g;
          return var3;
        }
    }

    final static fm a(int param0, byte param1) {
        if (param1 != 124) {
            return null;
        }
        return el.a(-115, true, false, param0, 1, false);
    }

    final static void b(int param0) {
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
              if (w.field_v.field_r == -1) {
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
                  pl.field_S = pl.field_S + 1;
                  if ((pl.field_S ^ -1) <= -16) {
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
                if (-2 == w.field_v.field_r) {
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
                      if (-1 < lb.field_D) {
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
                      pl.field_S = pl.field_S + 1;
                      if (pl.field_S > -16) {
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
                      if (-1 < lb.field_D) {
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
                      pl.field_S = pl.field_S + 1;
                      if (pl.field_S > -16) {
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
                    if (-1 < lb.field_D) {
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
                    pl.field_S = pl.field_S + 1;
                    if (pl.field_S > -16) {
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
                    if (-1 < lb.field_D) {
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
                    pl.field_S = pl.field_S + 1;
                    if (pl.field_S > -16) {
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
                  if (-1 < lb.field_D) {
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
                  pl.field_S = pl.field_S + 1;
                  if (pl.field_S > -16) {
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
                  if (-1 < lb.field_D) {
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
                  pl.field_S = pl.field_S + 1;
                  if (pl.field_S > -16) {
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Puzzle Complete!";
    }
}
