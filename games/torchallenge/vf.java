/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int[] field_b;
    static int field_d;
    static String field_c;
    static volatile int field_a;

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (te.field_b != null) {
            sj.field_L = 0;
            bj.field_c = -1;
            qb.field_g = -1;
            ua.field_c = true;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != te.field_b) {
            jc.field_h = 0;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(te.field_b == null)) {
            sj.field_L = 0;
            bj.field_c = param0.getX();
            qb.field_g = param0.getY();
            ua.field_c = true;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(te.field_b == null)) {
            sj.field_L = 0;
            bj.field_c = param0.getX();
            qb.field_g = param0.getY();
            ua.field_c = true;
        }
    }

    final static String a(int param0, long param1) {
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = TorChallenge.field_F ? 1 : 0;
        if (param1 <= 0L) {
            return null;
        }
        if (6582952005840035281L <= param1) {
            return null;
        }
        if (0L == param1 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        int var6 = -13 % ((param0 - -43) / 44);
        while (-1L != (var4 ^ -1L)) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var7 = new StringBuilder(var3);
        while (-1L != (param1 ^ -1L)) {
            var8 = param1;
            param1 = param1 / 37L;
            var10 = rj.field_h[(int)(-(37L * param1) + var8)];
            if (!(95 != var10)) {
                var11 = -1 + var7.length();
                var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                var10 = 160;
            }
            StringBuilder discarded$0 = var7.append(var10);
        }
        StringBuilder discarded$1 = var7.reverse();
        var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
        return var7.toString();
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        var3 = 5;
        var7 = -111 / ((24 - param0) / 59);
        var6 = 0;
        L0: while (true) {
          if (-4 >= (var6 ^ -1)) {
            return;
          } else {
            var1 = ii.field_f[var6][0];
            var8 = 1 + var1;
            L1: while (true) {
              if (var8 >= 6) {
                var8 = 0;
                L2: while (true) {
                  if (3 <= var8) {
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= 3) {
                        var6++;
                        continue L0;
                      } else {
                        var5 = il.field_o[var8];
                        if (var5 > var1) {
                          var5 = var5 + -1;
                          var2 = 0;
                          var2 = 1 << var5 | var2;
                          if ((hd.field_c[var6] & var2 ^ -1) < -1) {
                            hd.field_c[var6] = TorChallenge.a(hd.field_c[var6], var2);
                            var8++;
                            continue L3;
                          } else {
                            var8++;
                            continue L3;
                          }
                        } else {
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = (var8 - -1) * 2 - 1;
                    if (var4 > var1) {
                      var2 = 0;
                      var2 = var2 | 1 << var8;
                      if (-1 > (hk.field_c[var6] & var2 ^ -1)) {
                        hk.field_c[var6] = TorChallenge.a(var2, hk.field_c[var6]);
                        var8++;
                        continue L2;
                      } else {
                        var8++;
                        continue L2;
                      }
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              } else {
                L4: {
                  var2 = 0;
                  var2 = 1 << var8 | var2;
                  if ((var2 & k.field_b[var6]) <= 0) {
                    break L4;
                  } else {
                    k.field_b[var6] = TorChallenge.a(var2, k.field_b[var6]);
                    break L4;
                  }
                }
                var9 = 0;
                L5: while (true) {
                  if (var3 <= var9) {
                    var8++;
                    continue L1;
                  } else {
                    var2 = 0;
                    var2 = 1 << var9 | var2;
                    if ((var2 & pi.field_d[var6][var8] ^ -1) < -1) {
                      pi.field_d[var6][var8] = TorChallenge.a(var2, pi.field_d[var6][var8]);
                      var9++;
                      continue L5;
                    } else {
                      var9++;
                      continue L5;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        int var1 = -57 % ((param0 - 40) / 37);
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != te.field_b) {
            sj.field_L = 0;
            bj.field_c = param0.getX();
            qb.field_g = param0.getY();
            ua.field_c = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (te.field_b != null) {
            sj.field_L = 0;
            aa.field_a = param0.getX();
            ll.field_g = param0.getY();
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                e.field_o = 2;
                jc.field_h = 2;
            } else {
                e.field_o = 1;
                jc.field_h = 1;
            }
            var2 = param0.getModifiers();
            if (-1 == (8 & var2)) {
            }
            ua.field_c = true;
            if (0 != (4 & var2)) {
            }
            if (-1 != (var2 & 16)) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (!(null == te.field_b)) {
            sj.field_L = 0;
            jc.field_h = 0;
            ua.field_c = true;
            var2 = param0.getModifiers();
            if ((var2 & 8) != 0) {
            }
            if ((16 & var2) != 0) {
            }
            if ((4 & var2) != 0) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    final static byte[] a(int param0, String param1) {
        if (param0 != 95) {
            field_b = null;
        }
        return dj.field_cb.a(-2, param1, "");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "No highscores";
        field_b = new int[1024];
        field_a = 0;
    }
}
