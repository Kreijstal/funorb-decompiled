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
            field_c = null;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = stellarshard.field_B;
        var3 = 0;
        if (param2 < -80) {
          var4 = rg.field_F;
          L0: while (true) {
            if (var3 >= stellarshard.field_L.length) {
              return -1;
            } else {
              var5 = sj.field_J[var3];
              if (-1 < (var5 ^ -1)) {
                var4 = var4 + l.field_e;
                var3++;
                continue L0;
              } else {
                var6 = qe.a((byte) -103, stellarshard.field_L[var3], true);
                var4 = var4 + nh.field_f;
                var7 = s.field_b + -(var6 >> 986746337);
                if (ma.a(param0, var7 - le.field_k, var4, (byte) -86, na.field_a - -(nh.field_h << -1828477087), param1, var6 - -(le.field_k << 1669009825))) {
                  return var5;
                } else {
                  var4 = var4 + (na.field_a + ((nh.field_h << -1066550079) + nh.field_f));
                  var3++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 103;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != pk.field_e) {
            var2 = param0.getKeyChar();
            if (var2 != 0) {
                if (var2 != 65535) {
                    if (wa.a((char) var2, (byte) -79)) {
                        var3 = 127 & 1 + l.field_h;
                        if (var3 != di.field_a) {
                            sf.field_d[l.field_h] = -1;
                            ac.field_i[l.field_h] = (char)var2;
                            l.field_h = var3;
                        }
                    }
                }
            }
        }
        param0.consume();
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (pk.field_e != null) {
            L1: {
              L2: {
                ce.field_e = 0;
                var2 = param0.getKeyCode();
                if ((var2 ^ -1) > -1) {
                  break L2;
                } else {
                  if (hd.field_a.length > var2) {
                    var2 = hd.field_a[var2];
                    if ((var2 & 128) == 0) {
                      break L1;
                    } else {
                      var2 = -1;
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            L3: {
              if ((se.field_H ^ -1) > -1) {
                break L3;
              } else {
                if (var2 < 0) {
                  break L3;
                } else {
                  ob.field_c[se.field_H] = var2;
                  se.field_H = se.field_H - -1 & 127;
                  if (se.field_H == vd.field_e) {
                    se.field_H = -1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              if ((var2 ^ -1) > -1) {
                break L4;
              } else {
                var3 = 1 + l.field_h & 127;
                if (var3 != di.field_a) {
                  sf.field_d[l.field_h] = var2;
                  ac.field_i[l.field_h] = (char)0;
                  l.field_h = var3;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              var3 = param0.getModifiers();
              if (0 != (var3 & 10)) {
                break L5;
              } else {
                if (-86 == (var2 ^ -1)) {
                  break L5;
                } else {
                  if (10 == var2) {
                    break L5;
                  } else {
                    break L0;
                  }
                }
              }
            }
            param0.consume();
            break L0;
          } else {
            break L0;
          }
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null == pk.field_e) {
        } else {
            ce.field_e = 0;
            var2 = param0.getKeyCode();
            if (var2 >= 0) {
                // if_icmple L44
                var2 = hd.field_a[var2] & -129;
            } else {
                var2 = -1;
            }
            if (se.field_H >= 0) {
                if (!(var2 < 0)) {
                    ob.field_c[se.field_H] = var2 ^ -1;
                    se.field_H = se.field_H - -1 & 127;
                    if (!(vd.field_e != se.field_H)) {
                        se.field_H = -1;
                    }
                }
            }
        }
        param0.consume();
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static wb a(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = stellarshard.field_B;
        if (param1 < 31) {
            return null;
        }
        int var2 = param0.length();
        for (var3 = 0; var2 > var3; var3++) {
            var4 = param0.charAt(var3);
            if (48 > var4) {
                return null;
            }
            if (57 < var4) {
                return null;
            }
        }
        return h.field_a;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (pk.field_e != null) {
            se.field_H = -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
