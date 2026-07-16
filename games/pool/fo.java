/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String[] field_a;
    static int[][][] field_c;
    static String field_d;
    static int[] field_e;
    static int[] field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (wn.field_a != null) {
            L1: {
              L2: {
                ti.field_e = 0;
                var2 = param0.getKeyCode();
                if (-1 < (var2 ^ -1)) {
                  break L2;
                } else {
                  if ((var2 ^ -1) <= (el.field_H.length ^ -1)) {
                    break L2;
                  } else {
                    var2 = el.field_H[var2];
                    if (-1 == (var2 & 128 ^ -1)) {
                      break L1;
                    } else {
                      var2 = -1;
                      break L1;
                    }
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            L3: {
              if (qq.field_xb < 0) {
                break L3;
              } else {
                if (-1 >= (var2 ^ -1)) {
                  field_b[qq.field_xb] = var2;
                  qq.field_xb = 1 + qq.field_xb & 127;
                  if ((qq.field_xb ^ -1) != (jq.field_g ^ -1)) {
                    break L3;
                  } else {
                    qq.field_xb = -1;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (0 > var2) {
                break L4;
              } else {
                var3 = op.field_h + 1 & 127;
                if (var3 == bl.field_s) {
                  break L4;
                } else {
                  ee.field_b[op.field_h] = var2;
                  ek.field_c[op.field_h] = (char)0;
                  op.field_h = var3;
                  break L4;
                }
              }
            }
            L5: {
              var3 = param0.getModifiers();
              if ((10 & var3) != 0) {
                break L5;
              } else {
                if (-86 == (var2 ^ -1)) {
                  break L5;
                } else {
                  if ((var2 ^ -1) != -11) {
                    break L0;
                  } else {
                    break L5;
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

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Pool.field_O;
          if (sf.field_y < 10) {
            L1: {
              var3 = 0;
              if (he.field_c) {
                he.field_c = false;
                var3 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            vc.a(var3 != 0, 30, df.a((byte) 84), cm.field_H, tj.i(19535));
            break L0;
          } else {
            if (u.a(108)) {
              if (fk.field_ab == 0) {
                di.a(param1, (byte) 109, false);
                fe.a(0, 0, (byte) -65, param2);
                break L0;
              } else {
                vc.a(true, param2);
                break L0;
              }
            } else {
              qh.d();
              er.a(240, false, 320);
              fe.a(0, 0, (byte) -89, param2);
              break L0;
            }
          }
        }
        L2: {
          if (param0 == -55) {
            break L2;
          } else {
            field_d = null;
            break L2;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            return;
        }
        field_d = null;
        field_b = null;
        field_c = null;
        field_e = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != wn.field_a) {
            var2 = param0.getKeyChar();
            if (var2 != 0) {
                if (65535 != var2) {
                    if (!(!kn.a((byte) 112, (char) var2))) {
                        var3 = 1 + op.field_h & 127;
                        if (bl.field_s != var3) {
                            ee.field_b[op.field_h] = -1;
                            ek.field_c[op.field_h] = (char)var2;
                            op.field_h = var3;
                        }
                    }
                }
            }
        }
        param0.consume();
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        L0: {
          if (null == wn.field_a) {
            break L0;
          } else {
            L1: {
              L2: {
                ti.field_e = 0;
                var2 = param0.getKeyCode();
                if (-1 < (var2 ^ -1)) {
                  break L2;
                } else {
                  if (el.field_H.length <= var2) {
                    break L2;
                  } else {
                    var2 = el.field_H[var2] & -129;
                    break L1;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            if ((qq.field_xb ^ -1) > -1) {
              break L0;
            } else {
              if (var2 >= 0) {
                field_b[qq.field_xb] = var2 ^ -1;
                qq.field_xb = 127 & 1 + qq.field_xb;
                if (qq.field_xb != jq.field_g) {
                  break L0;
                } else {
                  qq.field_xb = -1;
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

    final static qb a(byte param0) {
        int var2 = 77 % ((20 - param0) / 41);
        qb var1 = new qb(vd.field_c, tq.field_r, el.field_I[0], ih.field_d[0], pd.field_a[0], rc.field_f[0], v.field_b[0], ma.field_h);
        sh.h(-1);
        return var1;
    }

    final static void a(String param0, float param1, boolean param2) {
        if (param2) {
            fo.a((String) null, 0.6310321688652039f, false);
        }
        am.field_n = param0;
        kk.field_w = param1;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (wn.field_a != null) {
            qq.field_xb = -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_d = "Find opponent";
        field_e = new int[256];
        field_b = new int[128];
        var1 = 0;
        L0: while (true) {
          if (-257 >= (var1 ^ -1)) {
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_e[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0 ^ -1) == -2) {
                  var0 = -306674912 ^ var0 >>> -149349503;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
