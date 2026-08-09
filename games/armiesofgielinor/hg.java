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
        try {
            if (null != va.field_w) {
                us.field_c = -1;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static at a(int param0) {
        at var1 = new at();
        var1.a((byte) -119, (tc) (new re("hello", new Class[]{}, "Be friendly.")));
        var1.a((byte) -119, (tc) (new ba("printCoat", new Class[]{}, "Print out your current coat of arms in a line ready for the config file.")));
        var1.a((byte) -119, (tc) (new jq("setCoat", new Class[]{String.class}, "Set your coat of arms to one indicated by the format used in the config file (including coat=).")));
        int var2 = -43 % ((param0 - 32) / 63);
        var1.a((byte) -119, (tc) (new qa("channelFadeTime", new Class[]{Integer.TYPE}, "Change the time to fade between channel sets in the campaign menu, in milliseconds.")));
        var1.a((byte) -119, (tc) (new oh("channelBaseVolume", new Class[]{Integer.TYPE}, "(From 0 to 256) Change the volume of the base (<=3) channels in the campaign menu when in a campaign map.")));
        var1.a((byte) -119, (tc) (new mw("listMissions", new Class[]{Integer.TYPE}, "List available missions.")));
        var1.a((byte) -119, (tc) (new wt("giveTo", new Class[]{Integer.TYPE}, "Change ownership of a selected tile in the map.")));
        var1.a((byte) -119, (tc) (new qp("defeat", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, "Defeat the given player. And specify it as happening in the given number of turns and damage taken")));
        var1.a((byte) -119, (tc) (new an("defeat", new Class[]{Integer.TYPE}, "Defeat the given player.")));
        var1.a((byte) -119, (tc) (new oa("toggleSkip", new Class[]{}, "Toggle Automatically Skipping Player Turns")));
        var1.a((byte) -119, (tc) (new gg("printVictoryConditions", new Class[]{}, "Print out victory conditions for current player")));
        var1.a((byte) -119, (tc) (new ot("fixInvisible", new Class[]{}, "Make invisible units visible")));
        return var1;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (va.field_w == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    fc.field_b = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if (var2_int >= kw.field_M.length) {
                        break L3;
                      } else {
                        var2_int = -129 & kw.field_M[var2_int];
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (us.field_c < 0) {
                  break L1;
                } else {
                  if ((var2_int ^ -1) > -1) {
                    break L1;
                  } else {
                    ee.field_x[us.field_c] = var2_int ^ -1;
                    us.field_c = 127 & 1 + us.field_c;
                    if (cc.field_a == us.field_c) {
                      us.field_c = -1;
                      break L1;
                    } else {
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
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("hg.keyReleased(");

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
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(null == va.field_w)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535) {
                    if (!(!jb.a((char) var2_int, 16150))) {
                        var3 = 127 & cr.field_Z + 1;
                        if (var3 != be.field_E) {
                            gt.field_d[cr.field_Z] = -1;
                            ua.field_u[cr.field_Z] = (char)var2_int;
                            cr.field_Z = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hg.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (null == va.field_w) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      fc.field_b = 0;
                      var2_int = param0.getKeyCode();
                      if (0 > var2_int) {
                        break L4;
                      } else {
                        if (kw.field_M.length <= var2_int) {
                          break L4;
                        } else {
                          var2_int = kw.field_M[var2_int];
                          if (0 == (128 & var2_int)) {
                            break L3;
                          } else {
                            var2_int = -1;
                            break L3;
                          }
                        }
                      }
                    }
                    var2_int = -1;
                    break L3;
                  }
                  L5: {
                    if (us.field_c < 0) {
                      break L5;
                    } else {
                      if (0 > var2_int) {
                        break L5;
                      } else {
                        ee.field_x[us.field_c] = var2_int;
                        us.field_c = us.field_c + 1 & 127;
                        if (cc.field_a != us.field_c) {
                          break L5;
                        } else {
                          us.field_c = -1;
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    if ((var2_int ^ -1) > -1) {
                      break L6;
                    } else {
                      var3 = 127 & cr.field_Z - -1;
                      if (var3 == be.field_E) {
                        break L6;
                      } else {
                        gt.field_d[cr.field_Z] = var2_int;
                        ua.field_u[cr.field_Z] = (char)0;
                        cr.field_Z = var3;
                        break L6;
                      }
                    }
                  }
                  var3 = param0.getModifiers();
                  if (0 != (var3 & 10)) {
                    param0.consume();
                    break L1;
                  } else {
                    if (-86 == (var2_int ^ -1)) {
                      param0.consume();
                      break L1;
                    } else {
                      if (10 != var2_int) {
                        break L2;
                      } else {
                        param0.consume();
                        break L1;
                      }
                    }
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("hg.keyPressed(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 <= -5) {
              if (wn.a(param1, 1, true)) {
                var2_int = 0;
                L1: while (true) {
                  if (var2_int >= param1.length()) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (ph.a(-48, param1.charAt(var2_int))) {
                      var2_int++;
                      continue L1;
                    } else {
                      stackIn_11_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("hg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    static {
        field_c = "Spells to move your units around more efficiently, and to control your enemies.";
    }
}
