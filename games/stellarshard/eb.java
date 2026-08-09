/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int[] field_b;
    private static int[] field_c;
    static String field_d;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 != -1) {
            field_c = (int[]) null;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            var3_int = 0;
            if (param2 < -80) {
              var4 = rg.field_F;
              L1: while (true) {
                if (var3_int >= stellarshard.field_L.length) {
                  stackIn_15_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = sj.field_J[var3_int];
                    if (-1 < (var5 ^ -1)) {
                      var4 = var4 + l.field_e;
                      break L2;
                    } else {
                      var6 = qe.a((byte) -103, stellarshard.field_L[var3_int], true);
                      var4 = var4 + nh.field_f;
                      var7 = s.field_b + -(var6 >> 986746337);
                      if (ma.a(param0, var7 - le.field_k, var4, (byte) -86, na.field_a - -(nh.field_h << -1828477087), param1, var6 - -(le.field_k << 1669009825))) {
                        stackIn_10_0 = var5;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4 = var4 + (na.field_a + ((nh.field_h << -1066550079) + nh.field_f));
                        break L2;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 103;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "eb.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (null != pk.field_e) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && wa.a((char) var2_int, (byte) -79)) {
                    var3 = 127 & 1 + l.field_h;
                    if (var3 != di.field_a) {
                        sf.field_d[l.field_h] = -1;
                        ac.field_i[l.field_h] = (char)var2_int;
                        l.field_h = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "eb.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
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
            L1: {
              if (pk.field_e != null) {
                L2: {
                  L3: {
                    ce.field_e = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if (hd.field_a.length > var2_int) {
                        var2_int = hd.field_a[var2_int];
                        if ((var2_int & 128) == 0) {
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
                  if ((se.field_H ^ -1) > -1) {
                    break L4;
                  } else {
                    if (var2_int < 0) {
                      break L4;
                    } else {
                      ob.field_c[se.field_H] = var2_int;
                      se.field_H = se.field_H - -1 & 127;
                      if (se.field_H == vd.field_e) {
                        se.field_H = -1;
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
                    var3 = 1 + l.field_h & 127;
                    if (var3 != di.field_a) {
                      sf.field_d[l.field_h] = var2_int;
                      ac.field_i[l.field_h] = (char)0;
                      l.field_h = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var3 = param0.getModifiers();
                  if (0 != (var3 & 10)) {
                    break L6;
                  } else {
                    if (-86 == (var2_int ^ -1)) {
                      break L6;
                    } else {
                      if (10 == var2_int) {
                        break L6;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
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
          L7: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("eb.keyPressed(");

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
          throw ma.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != pk.field_e) {
                L2: {
                  L3: {
                    ce.field_e = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (hd.field_a.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = hd.field_a[var2_int] & -129;
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (se.field_H < 0) {
                  break L1;
                } else {
                  if (var2_int >= 0) {
                    ob.field_c[se.field_H] = var2_int ^ -1;
                    se.field_H = se.field_H - -1 & 127;
                    if (vd.field_e == se.field_H) {
                      se.field_H = -1;
                      break L1;
                    } else {
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
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("eb.keyReleased(");

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
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static wb a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wb stackIn_3_0 = null;
        wb stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            if (param1 >= 31) {
              var2_int = param0.length();
              var3 = 0;
              L1: while (true) {
                if (var2_int <= var3) {
                  stackIn_13_0 = h.field_a;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = param0.charAt(var3);
                  if (48 <= var4) {
                    if (57 >= var4) {
                      var3++;
                      continue L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = (wb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("eb.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_13_0;
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
              if (pk.field_e == null) {
                break L1;
              } else {
                se.field_H = -1;
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

            stackIn_5_1 = new StringBuilder().append("eb.focusLost(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_b = new int[8192];
        field_d = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_a = 0;
        field_c = new int[98304];
        for (var0 = 92682; (var0 ^ -1) <= -46342; var0--) {
            var6 = (long)((var0 << 1898080001) + 1);
            var4 = (long)((var0 << 972889537) + -1);
            var3 = (int)(-32768L + (var6 * var6 >> 2112250066));
            var2 = (int)(-32768L + (var4 * var4 >> -1839353326));
            if (!(field_c.length > var3)) {
                var3 = field_c.length - 1;
            }
            for (var1 = -1 >= (var2 ^ -1) ? var2 : 0; var1 <= var3; var1++) {
                field_c[var1] = var0;
            }
        }
    }
}
