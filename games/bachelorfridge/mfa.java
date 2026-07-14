/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mfa implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static int[] field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (vv.field_e == null) {
            break L0;
          } else {
            L1: {
              L2: {
                ce.field_x = 0;
                var2 = param0.getKeyCode();
                if (-1 < (var2 ^ -1)) {
                  break L2;
                } else {
                  if (ru.field_d.length > var2) {
                    var2 = ru.field_d[var2];
                    if ((var2 & 128) == 0) {
                      if (gfa.field_c < 0) {
                        break L1;
                      } else {
                        if ((var2 ^ -1) > -1) {
                          break L1;
                        } else {
                          wd.field_x[gfa.field_c] = var2;
                          gfa.field_c = gfa.field_c - -1 & 127;
                          if (cj.field_i != gfa.field_c) {
                            break L1;
                          } else {
                            gfa.field_c = -1;
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (gfa.field_c < 0) {
                        break L1;
                      } else {
                        if ((var2 ^ -1) > -1) {
                          break L1;
                        } else {
                          wd.field_x[gfa.field_c] = var2;
                          gfa.field_c = gfa.field_c - -1 & 127;
                          if (cj.field_i != gfa.field_c) {
                            break L1;
                          } else {
                            gfa.field_c = -1;
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
              if (gfa.field_c < 0) {
                break L1;
              } else {
                if ((var2 ^ -1) > -1) {
                  break L1;
                } else {
                  wd.field_x[gfa.field_c] = var2;
                  gfa.field_c = gfa.field_c - -1 & 127;
                  if (cj.field_i != gfa.field_c) {
                    break L1;
                  } else {
                    gfa.field_c = -1;
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (0 <= var2) {
                var3 = lma.field_x - -1 & 127;
                if (gha.field_q != var3) {
                  aq.field_a[lma.field_x] = var2;
                  dla.field_i[lma.field_x] = (char)0;
                  lma.field_x = var3;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L4: {
              var3 = param0.getModifiers();
              if ((var3 & 10) != 0) {
                break L4;
              } else {
                if (var2 == 85) {
                  break L4;
                } else {
                  if (-11 == (var2 ^ -1)) {
                    break L4;
                  } else {
                    break L0;
                  }
                }
              }
            }
            param0.consume();
            break L0;
          }
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        L0: {
          if (null == vv.field_e) {
            break L0;
          } else {
            L1: {
              L2: {
                ce.field_x = 0;
                var2 = param0.getKeyCode();
                if (0 > var2) {
                  break L2;
                } else {
                  if (var2 < ru.field_d.length) {
                    var2 = ru.field_d[var2] & -129;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            if (-1 < (gfa.field_c ^ -1)) {
              break L0;
            } else {
              if (0 > var2) {
                break L0;
              } else {
                wd.field_x[gfa.field_c] = var2 ^ -1;
                gfa.field_c = 127 & gfa.field_c + 1;
                if (gfa.field_c == cj.field_i) {
                  gfa.field_c = -1;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        param0.consume();
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static kv[] a(int param0) {
        kv[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        var8 = BachelorFridge.field_y;
        if (param0 == 10583) {
          var1 = new kv[ok.field_vb];
          var2 = 0;
          L0: while (true) {
            if (var2 >= ok.field_vb) {
              al.b(-18073);
              return var1;
            } else {
              var3 = eha.field_s[var2] * lq.field_A[var2];
              var21 = baa.field_P[var2];
              if (uf.field_b[var2]) {
                var23 = cea.field_d[var2];
                var24 = new int[var3];
                var20 = var24;
                var16 = var20;
                var13 = var16;
                var6 = var13;
                var7 = 0;
                L1: while (true) {
                  if (var7 >= var3) {
                    var1[var2] = (kv) (Object) new pa(ok.field_Bb, kh.field_r, fl.field_j[var2], fd.field_D[var2], lq.field_A[var2], eha.field_s[var2], var24);
                    var2++;
                    continue L0;
                  } else {
                    var6[var7] = mp.a(dda.a(var23[var7] << 756933880, -16777216), hk.field_f[dda.a((int) var21[var7], 255)]);
                    var7++;
                    continue L1;
                  }
                }
              } else {
                var9 = new int[var3];
                var22 = var9;
                var6_int = 0;
                L2: while (true) {
                  if (var6_int >= var3) {
                    var1[var2] = new kv(ok.field_Bb, kh.field_r, fl.field_j[var2], fd.field_D[var2], lq.field_A[var2], eha.field_s[var2], var22);
                    var2++;
                    continue L0;
                  } else {
                    var9[var6_int] = hk.field_f[dda.a(255, (int) var21[var6_int])];
                    var6_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static kg a(boolean param0, int param1, int param2, int param3, ht param4, int param5) {
        java.awt.Frame var8 = ts.a(param3, param4, param1, param5, 2, param2);
        java.awt.Frame var6 = var8;
        if (var8 == null) {
            return null;
        }
        kg var7 = new kg();
        var7.field_g = var8;
        java.awt.Component discarded$7 = var7.field_g.add((java.awt.Component) (Object) var7);
        if (!param0) {
            return null;
        }
        var7.setBounds(0, 0, param1, param3);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_b = null;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != vv.field_e) {
            gfa.field_c = -1;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(vv.field_e == null)) {
            var2 = param0.getKeyChar();
            if (0 != var2) {
                if (65535 != var2) {
                    if (!(!cga.a(255, (char) var2))) {
                        var3 = lma.field_x + 1 & 127;
                        if (!(var3 == gha.field_q)) {
                            aq.field_a[lma.field_x] = -1;
                            dla.field_i[lma.field_x] = (char)var2;
                            lma.field_x = var3;
                        }
                    }
                }
            }
        }
        param0.consume();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[256];
    }
}
