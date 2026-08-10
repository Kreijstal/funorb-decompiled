/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static ug field_c;
    static boolean field_b;
    static String field_d;
    static jk field_a;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (null != hl.field_d) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && jj.a((byte) 118, (char) var2_int)) {
                    var3 = 127 & 1 + b.field_M;
                    if (var3 != ja.field_f) {
                        fj.field_C[b.field_M] = -1;
                        ql.field_k[b.field_M] = (char)var2_int;
                        b.field_M = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "mj.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static String a(java.applet.Applet param0, int param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_3_0 = null;
            String stackIn_9_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var8 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    if (param1 > 99) {
                      var9 = param0.getParameter("cookieprefix");
                      var3 = var9 + "settings";
                      var4 = (String) (ff.a("getcookies", param0, 20511));
                      var5 = dl.a(var4, ';', -32);
                      var6 = 0;
                      L2: while (true) {
                        if (var6 >= var5.length) {
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L3: {
                            var7 = var5[var6].indexOf('=');
                            if (0 > var7) {
                              break L3;
                            } else {
                              if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                                break L3;
                              } else {
                                stackIn_9_0 = var5[var6].substring(var7 - -1).trim();
                                decompiledRegionSelector0 = 2;
                                break L1;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_3_0 = (String) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    if (null != ah.field_g) {
                      stackIn_16_0 = ah.field_g;
                      decompiledRegionSelector1 = 0;
                      break L0;
                    } else {
                      return param0.getParameter("settings");
                    }
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref);

                stackIn_19_1 = new StringBuilder().append("mj.B(");

                if (param0 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L5;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L5;
                }
              }
              throw oj.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_3_0;
              } else {
                return stackIn_9_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == hl.field_d) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      vf.field_a = 0;
                      var2_int = param0.getKeyCode();
                      if (-1 < (var2_int ^ -1)) {
                        break L4;
                      } else {
                        if (var2_int < tf.field_l.length) {
                          var2_int = tf.field_l[var2_int];
                          if (0 == (var2_int & 128)) {
                            break L3;
                          } else {
                            var2_int = -1;
                            break L3;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2_int = -1;
                    break L3;
                  }
                  L5: {
                    if ((df.field_Q ^ -1) > -1) {
                      break L5;
                    } else {
                      if (-1 < (var2_int ^ -1)) {
                        break L5;
                      } else {
                        bb.field_g[df.field_Q] = var2_int;
                        df.field_Q = 127 & df.field_Q - -1;
                        if (df.field_Q != qa.field_a) {
                          break L5;
                        } else {
                          df.field_Q = -1;
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    if (0 > var2_int) {
                      break L6;
                    } else {
                      var3 = 127 & b.field_M - -1;
                      if (ja.field_f == var3) {
                        break L6;
                      } else {
                        fj.field_C[b.field_M] = var2_int;
                        ql.field_k[b.field_M] = (char)0;
                        b.field_M = var3;
                        break L6;
                      }
                    }
                  }
                  var3 = param0.getModifiers();
                  if (-1 != (10 & var3 ^ -1)) {
                    param0.consume();
                    break L1;
                  } else {
                    if ((var2_int ^ -1) == -86) {
                      param0.consume();
                      break L1;
                    } else {
                      if ((var2_int ^ -1) != -11) {
                        break L2;
                      } else {
                        param0.consume();
                        break L1;
                      }
                    }
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("mj.keyPressed(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (hl.field_d == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    vf.field_a = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if (var2_int < tf.field_l.length) {
                        var2_int = tf.field_l[var2_int] & -129;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (df.field_Q < 0) {
                  break L1;
                } else {
                  if ((var2_int ^ -1) <= -1) {
                    bb.field_g[df.field_Q] = var2_int ^ -1;
                    df.field_Q = 1 + df.field_Q & 127;
                    if (qa.field_a == df.field_Q) {
                      df.field_Q = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            param0.consume();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("mj.keyReleased(");

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
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
            if (hl.field_d != null) {
                df.field_Q = -1;
            }
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "mj.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -36) {
            field_c = (ug) null;
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_b = false;
        field_c = null;
    }
}
