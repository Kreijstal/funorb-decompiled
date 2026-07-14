/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static ug field_c;
    static boolean field_b;
    static String field_d;
    static jk field_a;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != hl.field_d) {
            var2 = param0.getKeyChar();
            if (var2 != 0) {
                if (var2 != 65535) {
                    if (jj.a((byte) 118, (char) var2)) {
                        var3 = 127 & 1 + b.field_M;
                        if (var3 != ja.field_f) {
                            fj.field_C[b.field_M] = -1;
                            ql.field_k[b.field_M] = (char)var2;
                            b.field_M = var3;
                        }
                    }
                }
            }
        }
        param0.consume();
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static String a(java.applet.Applet param0, int param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            Object stackIn_3_0 = null;
            String stackIn_9_0 = null;
            Object stackOut_2_0 = null;
            String stackOut_8_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = TorChallenge.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1 > 99) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return (String) (Object) stackIn_3_0;
                    }
                    case 4: {
                        try {
                            var9 = param0.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) ff.a("getcookies", param0, 20511);
                            var5 = dl.a(var4, ';', -32);
                            var6 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var6 >= var5.length) {
                                statePc = 13;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (0 > var7) {
                                statePc = 10;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = var5[var6].substring(var7 - -1).trim();
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0;
                    }
                    case 10: {
                        try {
                            var6++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var2 = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (null != ah.field_g) {
                            statePc = 15;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return ah.field_g;
                    }
                    case 16: {
                        return param0.getParameter("settings");
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

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (null == hl.field_d) {
            break L0;
          } else {
            L1: {
              L2: {
                vf.field_a = 0;
                var2 = param0.getKeyCode();
                if (-1 < (var2 ^ -1)) {
                  break L2;
                } else {
                  if (var2 < tf.field_l.length) {
                    var2 = tf.field_l[var2];
                    if (0 == (var2 & 128)) {
                      if (df.field_Q > -1) {
                        break L1;
                      } else {
                        if (-1 > var2) {
                          break L1;
                        } else {
                          bb.field_g[df.field_Q] = var2;
                          df.field_Q = 127 & df.field_Q - -1;
                          if (df.field_Q != qa.field_a) {
                            break L1;
                          } else {
                            df.field_Q = -1;
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (df.field_Q > -1) {
                        break L1;
                      } else {
                        if (-1 > var2) {
                          break L1;
                        } else {
                          bb.field_g[df.field_Q] = var2;
                          df.field_Q = 127 & df.field_Q - -1;
                          if (df.field_Q != qa.field_a) {
                            break L1;
                          } else {
                            df.field_Q = -1;
                            break L1;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              if (df.field_Q > -1) {
                break L1;
              } else {
                if (-1 > var2) {
                  break L1;
                } else {
                  bb.field_g[df.field_Q] = var2;
                  df.field_Q = 127 & df.field_Q - -1;
                  if (df.field_Q != qa.field_a) {
                    break L1;
                  } else {
                    df.field_Q = -1;
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (0 > var2) {
                break L3;
              } else {
                var3 = 127 & b.field_M - -1;
                if (ja.field_f == var3) {
                  break L3;
                } else {
                  fj.field_C[b.field_M] = var2;
                  ql.field_k[b.field_M] = (char)0;
                  b.field_M = var3;
                  break L3;
                }
              }
            }
            var3 = param0.getModifiers();
            if (-1 != (10 & var3 ^ -1)) {
              param0.consume();
              break L0;
            } else {
              if ((var2 ^ -1) == -86) {
                param0.consume();
                break L0;
              } else {
                if ((var2 ^ -1) != -11) {
                  break L0;
                } else {
                  param0.consume();
                  break L0;
                }
              }
            }
          }
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        L0: {
          if (hl.field_d == null) {
            break L0;
          } else {
            L1: {
              L2: {
                vf.field_a = 0;
                var2 = param0.getKeyCode();
                if ((var2 ^ -1) > -1) {
                  break L2;
                } else {
                  if (var2 < tf.field_l.length) {
                    var2 = tf.field_l[var2] & -129;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            if (df.field_Q < 0) {
              break L0;
            } else {
              if ((var2 ^ -1) <= -1) {
                bb.field_g[df.field_Q] = var2 ^ -1;
                df.field_Q = 1 + df.field_Q & 127;
                if (qa.field_a == df.field_Q) {
                  df.field_Q = -1;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
          }
        }
        param0.consume();
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (hl.field_d != null) {
            df.field_Q = -1;
        }
    }

    public static void a(byte param0) {
        if (param0 != -36) {
            field_c = null;
        }
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_c = null;
    }
}
