/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;
    static String field_c;
    static String field_b;

    final static vk a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          if (param0 < -88) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var2 = param1.length();
        if (0 != var2) {
          if ((var2 ^ -1) >= -64) {
            var3 = 0;
            L1: while (true) {
              if (var3 < var2) {
                var4 = param1.charAt(var3);
                if (45 == var4) {
                  L2: {
                    if (0 == var3) {
                      break L2;
                    } else {
                      if (var3 == var2 - 1) {
                        break L2;
                      } else {
                        var3++;
                        continue L1;
                      }
                    }
                  }
                  return vl.field_m;
                } else {
                  if ((qm.field_a.indexOf(var4) ^ -1) == 0) {
                    return vl.field_m;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return fg.field_m;
          }
        } else {
          return bg.field_l;
        }
    }

    public static void a(byte param0) {
        int var1 = 36 / ((param0 - 44) / 35);
        field_b = null;
        field_c = null;
        field_a = null;
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (null != ea.field_c) {
            L1: {
              L2: {
                nl.field_s = 0;
                var2 = param0.getKeyCode();
                if ((var2 ^ -1) > -1) {
                  break L2;
                } else {
                  if (ei.field_G.length <= var2) {
                    break L2;
                  } else {
                    var2 = ei.field_G[var2];
                    if ((128 & var2 ^ -1) != -1) {
                      var2 = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            L3: {
              if (ih.field_F < 0) {
                break L3;
              } else {
                if (var2 >= 0) {
                  nd.field_c[ih.field_F] = var2;
                  ih.field_F = 1 + ih.field_F & 127;
                  if (ih.field_F != uc.field_d) {
                    break L3;
                  } else {
                    ih.field_F = -1;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if ((var2 ^ -1) > -1) {
                break L4;
              } else {
                var3 = je.field_c - -1 & 127;
                if (var3 == he.field_e) {
                  break L4;
                } else {
                  vd.field_b[je.field_c] = var2;
                  gg.field_a[je.field_c] = (char)0;
                  je.field_c = var3;
                  break L4;
                }
              }
            }
            L5: {
              var3 = param0.getModifiers();
              if ((var3 & 10 ^ -1) != -1) {
                break L5;
              } else {
                if ((var2 ^ -1) == -86) {
                  break L5;
                } else {
                  if (-11 == (var2 ^ -1)) {
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
        L0: {
          if (ea.field_c == null) {
            break L0;
          } else {
            L1: {
              L2: {
                nl.field_s = 0;
                var2 = param0.getKeyCode();
                if (0 > var2) {
                  break L2;
                } else {
                  if (var2 < ei.field_G.length) {
                    var2 = ei.field_G[var2] & -129;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = -1;
              break L1;
            }
            if (0 > ih.field_F) {
              break L0;
            } else {
              if (0 > var2) {
                break L0;
              } else {
                nd.field_c[ih.field_F] = var2 ^ -1;
                ih.field_F = 1 + ih.field_F & 127;
                if (ih.field_F != uc.field_d) {
                  break L0;
                } else {
                  ih.field_F = -1;
                  break L0;
                }
              }
            }
          }
        }
        param0.consume();
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (ea.field_c != null) {
            ih.field_F = -1;
        }
    }

    final static void a(int param0) {
        jh.field_i = false;
        int discarded$4 = fj.field_g.d((byte) -122);
        if (param0 < 110) {
            Object var2 = null;
            vk discarded$5 = tg.a(-42, (String) null);
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != ea.field_c) {
            var2 = param0.getKeyChar();
            if (var2 != 0) {
                if (var2 != 65535) {
                    if (!(!na.a(0, (char) var2))) {
                        var3 = 1 + je.field_c & 127;
                        if (!(var3 == he.field_e)) {
                            vd.field_b[je.field_c] = -1;
                            gg.field_a[je.field_c] = (char)var2;
                            je.field_c = var3;
                        }
                    }
                }
            }
        }
        param0.consume();
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Connection lost - attempting to reconnect";
        field_c = "Select a zombie!";
        field_b = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
