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
              long dupTemp$2 = hm.a(64);
              aj.field_m = dupTemp$2;
              jc.field_c = dupTemp$2;
              if ((ra.field_b.field_b ^ -1) == -2) {
                try {
                  L1: {
                    L2: {
                      sh.field_e = new mo((java.net.Socket) ra.field_b.field_e, op.field_p);
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
                    al.a(pc.field_q, (byte) 66, bj.field_a, (we) (Object) aa.field_f, hf.field_n);
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
        int stackIn_38_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
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
              if ((w.field_v.field_r ^ -1) == -1) {
                L0: {
                  ql.field_m = w.field_v.field_d.field_d;
                  if (param0 == 5) {
                    break L0;
                  } else {
                    field_c = -69;
                    break L0;
                  }
                }
                L1: {
                  if ((of.field_d ^ -1) == (ql.field_m ^ -1)) {
                    if (-1 > (lb.field_D ^ -1)) {
                      lb.field_D = lb.field_D - 1;
                      break L1;
                    } else {
                      if ((pl.field_S ^ -1) < -1) {
                        pl.field_S = pl.field_S - 1;
                        break L1;
                      } else {
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
                    }
                  } else {
                    int fieldTemp$7 = pl.field_S;
                    pl.field_S = pl.field_S + 1;
                    if ((fieldTemp$7 ^ -1) <= -16) {
                      L3: {
                        of.field_d = ql.field_m;
                        if (5 != ql.field_m) {
                          stackOut_103_0 = 15;
                          stackIn_104_0 = stackOut_103_0;
                          break L3;
                        } else {
                          stackOut_102_0 = 75;
                          stackIn_104_0 = stackOut_102_0;
                          break L3;
                        }
                      }
                      lb.field_D = stackIn_104_0;
                      break L1;
                    } else {
                      L4: {
                        if (-1 == of.field_d) {
                          break L4;
                        } else {
                          var1 = jb.field_b[of.field_d];
                          var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                          break L4;
                        }
                      }
                      return;
                    }
                  }
                }
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
                if (-2 != (w.field_v.field_r ^ -1)) {
                  L6: {
                    ql.field_m = -1;
                    if (param0 == 5) {
                      break L6;
                    } else {
                      field_c = -69;
                      break L6;
                    }
                  }
                  L7: {
                    if ((of.field_d ^ -1) == (ql.field_m ^ -1)) {
                      if (-1 > (lb.field_D ^ -1)) {
                        lb.field_D = lb.field_D - 1;
                        break L7;
                      } else {
                        if ((pl.field_S ^ -1) >= -1) {
                          break L7;
                        } else {
                          pl.field_S = pl.field_S - 1;
                          break L7;
                        }
                      }
                    } else {
                      int fieldTemp$8 = pl.field_S;
                      pl.field_S = pl.field_S + 1;
                      if ((fieldTemp$8 ^ -1) > -16) {
                        break L7;
                      } else {
                        L8: {
                          of.field_d = ql.field_m;
                          if (5 != ql.field_m) {
                            stackOut_85_0 = 15;
                            stackIn_86_0 = stackOut_85_0;
                            break L8;
                          } else {
                            stackOut_84_0 = 75;
                            stackIn_86_0 = stackOut_84_0;
                            break L8;
                          }
                        }
                        lb.field_D = stackIn_86_0;
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if (-1 == of.field_d) {
                      break L9;
                    } else {
                      var1 = jb.field_b[of.field_d];
                      var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                      break L9;
                    }
                  }
                  return;
                } else {
                  L10: {
                    if (0 != w.field_v.field_d.field_d) {
                      stackOut_63_0 = -1;
                      stackIn_64_0 = stackOut_63_0;
                      break L10;
                    } else {
                      stackOut_62_0 = 5;
                      stackIn_64_0 = stackOut_62_0;
                      break L10;
                    }
                  }
                  L11: {
                    ql.field_m = stackIn_64_0;
                    if (param0 == 5) {
                      break L11;
                    } else {
                      field_c = -69;
                      break L11;
                    }
                  }
                  L12: {
                    if ((of.field_d ^ -1) == (ql.field_m ^ -1)) {
                      if (-1 > (lb.field_D ^ -1)) {
                        lb.field_D = lb.field_D - 1;
                        break L12;
                      } else {
                        if ((pl.field_S ^ -1) >= -1) {
                          break L12;
                        } else {
                          pl.field_S = pl.field_S - 1;
                          break L12;
                        }
                      }
                    } else {
                      int fieldTemp$9 = pl.field_S;
                      pl.field_S = pl.field_S + 1;
                      if ((fieldTemp$9 ^ -1) > -16) {
                        break L12;
                      } else {
                        L13: {
                          of.field_d = ql.field_m;
                          if (5 != ql.field_m) {
                            stackOut_70_0 = 15;
                            stackIn_71_0 = stackOut_70_0;
                            break L13;
                          } else {
                            stackOut_69_0 = 75;
                            stackIn_71_0 = stackOut_69_0;
                            break L13;
                          }
                        }
                        lb.field_D = stackIn_71_0;
                        break L12;
                      }
                    }
                  }
                  L14: {
                    if (-1 == of.field_d) {
                      break L14;
                    } else {
                      var1 = jb.field_b[of.field_d];
                      var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                      break L14;
                    }
                  }
                  return;
                }
              }
            } else {
              if (param0 == 5) {
                L15: {
                  if ((of.field_d ^ -1) == (ql.field_m ^ -1)) {
                    if (-1 > (lb.field_D ^ -1)) {
                      lb.field_D = lb.field_D - 1;
                      break L15;
                    } else {
                      if ((pl.field_S ^ -1) >= -1) {
                        break L15;
                      } else {
                        pl.field_S = pl.field_S - 1;
                        break L15;
                      }
                    }
                  } else {
                    int fieldTemp$10 = pl.field_S;
                    pl.field_S = pl.field_S + 1;
                    if ((fieldTemp$10 ^ -1) > -16) {
                      break L15;
                    } else {
                      L16: {
                        of.field_d = ql.field_m;
                        if (5 != ql.field_m) {
                          stackOut_50_0 = 15;
                          stackIn_51_0 = stackOut_50_0;
                          break L16;
                        } else {
                          stackOut_49_0 = 75;
                          stackIn_51_0 = stackOut_49_0;
                          break L16;
                        }
                      }
                      lb.field_D = stackIn_51_0;
                      break L15;
                    }
                  }
                }
                L17: {
                  if (-1 == of.field_d) {
                    break L17;
                  } else {
                    var1 = jb.field_b[of.field_d];
                    var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                    break L17;
                  }
                }
                return;
              } else {
                L18: {
                  field_c = -69;
                  if ((of.field_d ^ -1) == (ql.field_m ^ -1)) {
                    if (-1 > (lb.field_D ^ -1)) {
                      lb.field_D = lb.field_D - 1;
                      break L18;
                    } else {
                      if ((pl.field_S ^ -1) >= -1) {
                        break L18;
                      } else {
                        pl.field_S = pl.field_S - 1;
                        break L18;
                      }
                    }
                  } else {
                    int fieldTemp$11 = pl.field_S;
                    pl.field_S = pl.field_S + 1;
                    if ((fieldTemp$11 ^ -1) > -16) {
                      break L18;
                    } else {
                      L19: {
                        of.field_d = ql.field_m;
                        if (5 != ql.field_m) {
                          stackOut_37_0 = 15;
                          stackIn_38_0 = stackOut_37_0;
                          break L19;
                        } else {
                          stackOut_36_0 = 75;
                          stackIn_38_0 = stackOut_36_0;
                          break L19;
                        }
                      }
                      lb.field_D = stackIn_38_0;
                      break L18;
                    }
                  }
                }
                L20: {
                  if (-1 == of.field_d) {
                    break L20;
                  } else {
                    var1 = jb.field_b[of.field_d];
                    var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                    break L20;
                  }
                }
                return;
              }
            }
          } else {
            if (param0 == 5) {
              L21: {
                if ((of.field_d ^ -1) == (ql.field_m ^ -1)) {
                  if (-1 > (lb.field_D ^ -1)) {
                    lb.field_D = lb.field_D - 1;
                    break L21;
                  } else {
                    if ((pl.field_S ^ -1) >= -1) {
                      break L21;
                    } else {
                      pl.field_S = pl.field_S - 1;
                      break L21;
                    }
                  }
                } else {
                  int fieldTemp$12 = pl.field_S;
                  pl.field_S = pl.field_S + 1;
                  if ((fieldTemp$12 ^ -1) > -16) {
                    break L21;
                  } else {
                    L22: {
                      of.field_d = ql.field_m;
                      if (5 != ql.field_m) {
                        stackOut_22_0 = 15;
                        stackIn_23_0 = stackOut_22_0;
                        break L22;
                      } else {
                        stackOut_21_0 = 75;
                        stackIn_23_0 = stackOut_21_0;
                        break L22;
                      }
                    }
                    lb.field_D = stackIn_23_0;
                    break L21;
                  }
                }
              }
              L23: {
                if (-1 == of.field_d) {
                  break L23;
                } else {
                  var1 = jb.field_b[of.field_d];
                  var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                  break L23;
                }
              }
              return;
            } else {
              L24: {
                field_c = -69;
                if ((of.field_d ^ -1) == (ql.field_m ^ -1)) {
                  if (-1 > (lb.field_D ^ -1)) {
                    lb.field_D = lb.field_D - 1;
                    break L24;
                  } else {
                    if ((pl.field_S ^ -1) >= -1) {
                      break L24;
                    } else {
                      pl.field_S = pl.field_S - 1;
                      break L24;
                    }
                  }
                } else {
                  int fieldTemp$13 = pl.field_S;
                  pl.field_S = pl.field_S + 1;
                  if ((fieldTemp$13 ^ -1) > -16) {
                    break L24;
                  } else {
                    L25: {
                      of.field_d = ql.field_m;
                      if (5 != ql.field_m) {
                        stackOut_9_0 = 15;
                        stackIn_10_0 = stackOut_9_0;
                        break L25;
                      } else {
                        stackOut_8_0 = 75;
                        stackIn_10_0 = stackOut_8_0;
                        break L25;
                      }
                    }
                    lb.field_D = stackIn_10_0;
                    break L24;
                  }
                }
              }
              L26: {
                if (-1 == of.field_d) {
                  break L26;
                } else {
                  var1 = jb.field_b[of.field_d];
                  var1.field_f = -(pl.field_S * (pl.field_S * 270) / 225) + 20;
                  break L26;
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
