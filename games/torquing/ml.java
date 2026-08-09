/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static sm[] field_a;
    static String field_b;
    static int[] field_d;
    static String field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(null == ha.field_b)) {
                var2_int = param0.getKeyChar();
                if (0 != var2_int && var2_int != 65535) {
                    if (!(!fm.a((byte) 32, (char) var2_int))) {
                        var3 = 127 & 1 + gn.field_d;
                        if (q.field_g != var3) {
                            ol.field_c[gn.field_d] = -1;
                            pe.field_H[gn.field_d] = (char)var2_int;
                            gn.field_d = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ml.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -3) {
            return;
        }
        field_d = null;
        field_c = null;
        field_a = null;
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
            if (ha.field_b != null) {
              hb.field_y = -1;
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

            stackIn_6_1 = new StringBuilder().append("ml.focusLost(");

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
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            if (ha.field_b != null) {
              L1: {
                L2: {
                  po.field_w = 0;
                  var2_int = param0.getKeyCode();
                  if (0 > var2_int) {
                    break L2;
                  } else {
                    if (var2_int >= vo.field_a.length) {
                      break L2;
                    } else {
                      var2_int = vo.field_a[var2_int];
                      if ((var2_int & 128) != 0) {
                        var2_int = -1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var2_int = -1;
                break L1;
              }
              L3: {
                if (-1 < (hb.field_y ^ -1)) {
                  break L3;
                } else {
                  if (var2_int >= 0) {
                    no.field_i[hb.field_y] = var2_int;
                    hb.field_y = hb.field_y + 1 & 127;
                    if (n.field_w != hb.field_y) {
                      break L3;
                    } else {
                      hb.field_y = -1;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (0 > var2_int) {
                  break L4;
                } else {
                  var3 = gn.field_d - -1 & 127;
                  if (q.field_g != var3) {
                    ol.field_c[gn.field_d] = var2_int;
                    pe.field_H[gn.field_d] = (char)0;
                    gn.field_d = var3;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                var3 = param0.getModifiers();
                if ((var3 & 10) != 0) {
                  break L5;
                } else {
                  if (-86 == (var2_int ^ -1)) {
                    break L5;
                  } else {
                    if ((var2_int ^ -1) == -11) {
                      break L5;
                    } else {
                      return;
                    }
                  }
                }
              }
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
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ml.keyPressed(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
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
              if (ha.field_b == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    po.field_w = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (var2_int < vo.field_a.length) {
                        var2_int = -129 & vo.field_a[var2_int];
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (-1 < (hb.field_y ^ -1)) {
                  break L1;
                } else {
                  if ((var2_int ^ -1) > -1) {
                    break L1;
                  } else {
                    no.field_i[hb.field_y] = var2_int ^ -1;
                    hb.field_y = 127 & 1 + hb.field_y;
                    if (hb.field_y != n.field_w) {
                      break L1;
                    } else {
                      hb.field_y = -1;
                      break L1;
                    }
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
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("ml.keyReleased(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_b = "Names should contain a maximum of 12 characters";
        field_d = new int[3];
        field_c = "Change display name";
    }
}
