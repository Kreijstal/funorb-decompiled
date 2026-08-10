/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String[] field_d;
    static ji[] field_e;
    static String field_c;
    static String field_b;
    static String field_a;

    public static void a(byte param0) {
        int var1 = -36 % ((-59 - param0) / 57);
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
            if (wc.field_i != null) {
                qj.field_h = -1;
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "i.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(wc.field_i == null)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && ak.a(-2036, (char) var2_int)) {
                    var3 = 127 & 1 + fk.field_e;
                    if (ad.field_b != var3) {
                        kk.field_b[fk.field_e] = -1;
                        pi.field_b[fk.field_e] = (char)var2_int;
                        fk.field_e = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "i.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
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
            L1: {
              if (wc.field_i == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    km.field_f = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (qj.field_a.length > var2_int) {
                        var2_int = qj.field_a[var2_int];
                        if ((128 & var2_int) == 0) {
                          break L2;
                        } else {
                          var2_int = -1;
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                L4: {
                  if (0 > qj.field_h) {
                    break L4;
                  } else {
                    if (-1 >= (var2_int ^ -1)) {
                      ni.field_b[qj.field_h] = var2_int;
                      qj.field_h = 1 + qj.field_h & 127;
                      if (qj.field_h != hh.field_b) {
                        break L4;
                      } else {
                        qj.field_h = -1;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if ((var2_int ^ -1) <= -1) {
                    var3 = fk.field_e - -1 & 127;
                    if (ad.field_b != var3) {
                      kk.field_b[fk.field_e] = var2_int;
                      pi.field_b[fk.field_e] = (char)0;
                      fk.field_e = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    break L6;
                  } else {
                    if (var2_int == 85) {
                      break L6;
                    } else {
                      if (var2_int == 10) {
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
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("i.keyPressed(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
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
              if (wc.field_i == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    km.field_f = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (var2_int >= qj.field_a.length) {
                        break L3;
                      } else {
                        var2_int = -129 & qj.field_a[var2_int];
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (0 > qj.field_h) {
                  break L1;
                } else {
                  if (-1 >= (var2_int ^ -1)) {
                    ni.field_b[qj.field_h] = var2_int ^ -1;
                    qj.field_h = 127 & 1 + qj.field_h;
                    if (hh.field_b == qj.field_h) {
                      qj.field_h = -1;
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
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("i.keyReleased(");

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
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_a = "This control is disabled. To enable it, click on <col=1f76a6><%0></col> in the options menu.";
        field_b = "Unrated game";
        field_c = "Asking for or providing contact information";
        field_d = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_e = new ji[23];
    }
}
