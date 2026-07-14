/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int[] field_a;
    static String[] field_d;
    static String field_c;
    static int field_b;

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        if (!param0) {
            field_b = -14;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != va.field_w) {
            us.field_c = -1;
        }
    }

    final static at a(int param0) {
        at var1 = new at();
        var1.a((byte) -119, (tc) (Object) new re("hello", new Class[0], "Be friendly."));
        var1.a((byte) -119, (tc) (Object) new ba("printCoat", new Class[0], "Print out your current coat of arms in a line ready for the config file."));
        var1.a((byte) -119, (tc) (Object) new jq("setCoat", new Class[1], "Set your coat of arms to one indicated by the format used in the config file (including coat=)."));
        int var2 = -43 % ((param0 - 32) / 63);
        var1.a((byte) -119, (tc) (Object) new qa("channelFadeTime", new Class[1], "Change the time to fade between channel sets in the campaign menu, in milliseconds."));
        var1.a((byte) -119, (tc) (Object) new oh("channelBaseVolume", new Class[1], "(From 0 to 256) Change the volume of the base (<=3) channels in the campaign menu when in a campaign map."));
        var1.a((byte) -119, (tc) (Object) new mw("listMissions", new Class[1], "List available missions."));
        var1.a((byte) -119, (tc) (Object) new wt("giveTo", new Class[1], "Change ownership of a selected tile in the map."));
        var1.a((byte) -119, (tc) (Object) new qp("defeat", new Class[3], "Defeat the given player. And specify it as happening in the given number of turns and damage taken"));
        var1.a((byte) -119, (tc) (Object) new an("defeat", new Class[1], "Defeat the given player."));
        var1.a((byte) -119, (tc) (Object) new oa("toggleSkip", new Class[0], "Toggle Automatically Skipping Player Turns"));
        var1.a((byte) -119, (tc) (Object) new gg("printVictoryConditions", new Class[0], "Print out victory conditions for current player"));
        var1.a((byte) -119, (tc) (Object) new ot("fixInvisible", new Class[0], "Make invisible units visible"));
        return var1;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (va.field_w != null) {
            fc.field_b = 0;
            var2 = param0.getKeyCode();
            if ((var2 ^ -1) <= -1) {
                // if_icmpge L43
                var2 = -129 & kw.field_M[var2];
            } else {
                var2 = -1;
            }
            if (us.field_c >= 0) {
                if ((var2 ^ -1) <= -1) {
                    ee.field_x[us.field_c] = var2 ^ -1;
                    us.field_c = 127 & 1 + us.field_c;
                    if (!(cc.field_a != us.field_c)) {
                        us.field_c = -1;
                    }
                }
            }
        }
        param0.consume();
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(null == va.field_w)) {
            var2 = param0.getKeyChar();
            if (var2 != 0) {
                if (var2 != 65535) {
                    if (!(!jb.a((char) var2, 16150))) {
                        var3 = 127 & cr.field_Z + 1;
                        if (var3 != be.field_E) {
                            gt.field_d[cr.field_Z] = -1;
                            ua.field_u[cr.field_Z] = (char)var2;
                            cr.field_Z = var3;
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
          if (null == va.field_w) {
            break L0;
          } else {
            L1: {
              L2: {
                fc.field_b = 0;
                var2 = param0.getKeyCode();
                if (0 > var2) {
                  break L2;
                } else {
                  if (kw.field_M.length <= var2) {
                    break L2;
                  } else {
                    var2 = kw.field_M[var2];
                    if (0 == (128 & var2)) {
                      if (us.field_c < 0) {
                        break L1;
                      } else {
                        if (0 > var2) {
                          break L1;
                        } else {
                          ee.field_x[us.field_c] = var2;
                          us.field_c = us.field_c + 1 & 127;
                          if (cc.field_a != us.field_c) {
                            break L1;
                          } else {
                            us.field_c = -1;
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (us.field_c < 0) {
                        break L1;
                      } else {
                        if (0 > var2) {
                          break L1;
                        } else {
                          ee.field_x[us.field_c] = var2;
                          us.field_c = us.field_c + 1 & 127;
                          if (cc.field_a != us.field_c) {
                            break L1;
                          } else {
                            us.field_c = -1;
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var2 = -1;
              if (us.field_c < 0) {
                break L1;
              } else {
                if (0 > var2) {
                  break L1;
                } else {
                  ee.field_x[us.field_c] = var2;
                  us.field_c = us.field_c + 1 & 127;
                  if (cc.field_a != us.field_c) {
                    break L1;
                  } else {
                    us.field_c = -1;
                    break L1;
                  }
                }
              }
            }
            L3: {
              if ((var2 ^ -1) > -1) {
                break L3;
              } else {
                var3 = 127 & cr.field_Z - -1;
                if (var3 == be.field_E) {
                  break L3;
                } else {
                  gt.field_d[cr.field_Z] = var2;
                  ua.field_u[cr.field_Z] = (char)0;
                  cr.field_Z = var3;
                  break L3;
                }
              }
            }
            var3 = param0.getModifiers();
            if (0 != (var3 & 10)) {
              param0.consume();
              break L0;
            } else {
              if (-86 == (var2 ^ -1)) {
                param0.consume();
                break L0;
              } else {
                if (10 != var2) {
                  break L0;
                } else {
                  param0.consume();
                  break L0;
                }
              }
            }
          }
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 > -5) {
            return true;
        }
        if (!wn.a(param1, 1, true)) {
            return false;
        }
        for (var2 = 0; var2 < param1.length(); var2++) {
            if (!ph.a(-48, param1.charAt(var2))) {
                return false;
            }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Spells to move your units around more efficiently, and to control your enemies.";
    }
}
