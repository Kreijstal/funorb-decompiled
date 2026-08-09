/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static dl[] field_b;
    static long field_d;
    static int[] field_e;
    static int[] field_a;
    static int field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (null != uf.field_c) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && 65535 != var2_int && pn.a(true, (char) var2_int)) {
                    var3 = 127 & ei.field_A - -1;
                    if (var3 != td.field_d) {
                        re.field_o[ei.field_A] = -1;
                        tp.field_i[ei.field_A] = (char)var2_int;
                        ei.field_A = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "vf.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
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
              if (uf.field_c == null) {
                break L1;
              } else {
                bo.field_n = -1;
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

            stackIn_5_1 = new StringBuilder().append("vf.focusLost(");

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
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
              if (null != uf.field_c) {
                L2: {
                  L3: {
                    jf.field_a = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (rg.field_a.length > var2_int) {
                        var2_int = rg.field_a[var2_int] & -129;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (bo.field_n < 0) {
                  break L1;
                } else {
                  if (0 <= var2_int) {
                    pl.field_n[bo.field_n] = var2_int ^ -1;
                    bo.field_n = 127 & bo.field_n - -1;
                    if (bo.field_n != ud.field_Z) {
                      break L1;
                    } else {
                      bo.field_n = -1;
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
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("vf.keyReleased(");

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
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (uf.field_c != null) {
          var1 = uf.field_c;
          synchronized (var1) {
            L0: {
              uf.field_c = null;
              break L0;
            }
          }
          L1: {
            if (param0 == -1) {
              break L1;
            } else {
              vf.a((byte) -2);
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (param0 == -1) {
              break L2;
            } else {
              vf.a((byte) -2);
              break L2;
            }
          }
          return;
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
            if (uf.field_c != null) {
              L1: {
                L2: {
                  jf.field_a = 0;
                  var2_int = param0.getKeyCode();
                  if (-1 < (var2_int ^ -1)) {
                    break L2;
                  } else {
                    if (rg.field_a.length > var2_int) {
                      var2_int = rg.field_a[var2_int];
                      if ((var2_int & 128) == 0) {
                        break L1;
                      } else {
                        var2_int = -1;
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = -1;
                break L1;
              }
              L3: {
                if (0 > bo.field_n) {
                  break L3;
                } else {
                  if (var2_int >= 0) {
                    pl.field_n[bo.field_n] = var2_int;
                    bo.field_n = 127 & bo.field_n + 1;
                    if (ud.field_Z != bo.field_n) {
                      break L3;
                    } else {
                      bo.field_n = -1;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var2_int >= 0) {
                  var3 = ei.field_A + 1 & 127;
                  if (var3 == td.field_d) {
                    break L4;
                  } else {
                    re.field_o[ei.field_A] = var2_int;
                    tp.field_i[ei.field_A] = (char)0;
                    ei.field_A = var3;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                var3 = param0.getModifiers();
                if (-1 != (var3 & 10 ^ -1)) {
                  break L5;
                } else {
                  if (-86 == (var2_int ^ -1)) {
                    break L5;
                  } else {
                    if (var2_int == 10) {
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

            stackIn_25_1 = new StringBuilder().append("vf.keyPressed(");

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
          throw dn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        mc.field_s = param3;
        if (param1 <= 113) {
            return;
        }
        jn.field_i = param2;
        ao.field_e = param0;
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -117) {
            vf.a(-34);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_c = 70;
        field_a = new int[]{0, 12, 24, 36, 0, 12, 24, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_e = new int[8192];
    }
}
