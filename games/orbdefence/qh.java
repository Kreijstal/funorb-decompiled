/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static hj[] field_d;
    static int field_a;
    static int[] field_c;
    static byte[][] field_b;

    public static void c(int param0) {
        field_d = null;
        field_b = (byte[][]) null;
        field_c = null;
        if (param0 < 9) {
            field_a = 6;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ad.field_b != null) {
              wg.field_p = -1;
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

            stackIn_6_1 = new StringBuilder().append("qh.focusLost(");

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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ad.field_b != null) {
                L2: {
                  L3: {
                    ji.field_c = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (nd.field_a.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = nd.field_a[var2_int] & -129;
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if ((wg.field_p ^ -1) > -1) {
                  break L1;
                } else {
                  if (var2_int >= 0) {
                    gl.field_i[wg.field_p] = var2_int ^ -1;
                    wg.field_p = 1 + wg.field_p & 127;
                    if (al.field_b != wg.field_p) {
                      break L1;
                    } else {
                      wg.field_p = -1;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            param0.consume();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("qh.keyReleased(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              if (null == ad.field_b) {
                break L1;
              } else {
                L2: {
                  L3: {
                    ji.field_c = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
                      break L3;
                    } else {
                      if (nd.field_a.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = nd.field_a[var2_int];
                        if (-1 != (var2_int & 128 ^ -1)) {
                          var2_int = -1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                L4: {
                  if (-1 < (wg.field_p ^ -1)) {
                    break L4;
                  } else {
                    if (-1 < (var2_int ^ -1)) {
                      break L4;
                    } else {
                      gl.field_i[wg.field_p] = var2_int;
                      wg.field_p = wg.field_p - -1 & 127;
                      if (al.field_b == wg.field_p) {
                        wg.field_p = -1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if ((var2_int ^ -1) > -1) {
                    break L5;
                  } else {
                    var3 = 127 & 1 + uf.field_a;
                    if (var3 != md.field_g) {
                      g.field_g[uf.field_a] = var2_int;
                      ll.field_b[uf.field_a] = (char)0;
                      uf.field_a = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    break L6;
                  } else {
                    if (-86 == (var2_int ^ -1)) {
                      break L6;
                    } else {
                      if (-11 == (var2_int ^ -1)) {
                        break L6;
                      } else {
                        return;
                      }
                    }
                  }
                }
                param0.consume();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("qh.keyPressed(");

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
          throw dd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    final static String a(int param0) {
        int var1;
        if (qc.field_g != mg.field_m) {
          if (!bd.field_u.a(false)) {
            return bd.field_u.a(-63);
          } else {
            var1 = -5 % ((29 - param0) / 53);
            if (tg.field_c == mg.field_m) {
              return bd.field_u.a(-118);
            } else {
              return vh.field_k;
            }
          }
        } else {
          return sk.field_G;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (ad.field_b != null) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && oc.a((char) var2_int, 0)) {
                    var3 = 127 & 1 + uf.field_a;
                    if (var3 != md.field_g) {
                        g.field_g[uf.field_a] = -1;
                        ll.field_b[uf.field_a] = (char)var2_int;
                        uf.field_a = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "qh.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static int[] b(int param0) {
        if (param0 != 8) {
            qh.a(122);
            return new int[8];
        }
        return new int[8];
    }

    static {
        field_c = new int[12];
        field_b = new byte[1000][];
        field_c[9] = 1;
        field_c[2] = 1;
        field_c[6] = 10;
        field_c[7] = 1;
        field_c[4] = 500;
        field_c[10] = 10;
        field_c[0] = 1;
        field_c[8] = 1;
        field_c[1] = 1;
        field_c[3] = 10;
        field_c[5] = 1;
        field_c[11] = 500;
    }
}
