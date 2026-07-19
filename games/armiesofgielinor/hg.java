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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (null == va.field_w) {
                break L1;
              } else {
                us.field_c = -1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("hg.focusLost(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
                        if (!ArmiesOfGielinor.field_M) {
                          break L2;
                        } else {
                          break L3;
                        }
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
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("hg.keyReleased(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
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
                if (var2_int != 0) {
                    if (var2_int != 65535) {
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
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hg.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (null == va.field_w) {
                break L1;
              } else {
                L2: {
                  L3: {
                    fc.field_b = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
                      break L3;
                    } else {
                      if (kw.field_M.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = kw.field_M[var2_int];
                        if (0 == (128 & var2_int)) {
                          break L2;
                        } else {
                          var2_int = -1;
                          if (!ArmiesOfGielinor.field_M) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                L4: {
                  if (us.field_c < 0) {
                    break L4;
                  } else {
                    if (0 > var2_int) {
                      break L4;
                    } else {
                      ee.field_x[us.field_c] = var2_int;
                      us.field_c = us.field_c + 1 & 127;
                      if (cc.field_a != us.field_c) {
                        break L4;
                      } else {
                        us.field_c = -1;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if ((var2_int ^ -1) > -1) {
                    break L5;
                  } else {
                    var3 = 127 & cr.field_Z - -1;
                    if (var3 == be.field_E) {
                      break L5;
                    } else {
                      gt.field_d[cr.field_Z] = var2_int;
                      ua.field_u[cr.field_Z] = (char)0;
                      cr.field_Z = var3;
                      break L5;
                    }
                  }
                }
                var3 = param0.getModifiers();
                if (0 != (var3 & 10)) {
                  param0.consume();
                  return;
                } else {
                  if (-86 == (var2_int ^ -1)) {
                    param0.consume();
                    return;
                  } else {
                    if (10 != var2_int) {
                      break L1;
                    } else {
                      param0.consume();
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("hg.keyPressed(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
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
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 <= -5) {
              if (wn.a(param1, 1, true)) {
                var2_int = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var2_int >= param1.length()) {
                        break L3;
                      } else {
                        stackOut_9_0 = ph.a(-48, param1.charAt(var2_int));
                        stackIn_15_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var3 != 0) {
                          break L2;
                        } else {
                          if (stackIn_10_0) {
                            var2_int++;
                            if (var3 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          } else {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    }
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("hg.B(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    static {
        field_c = "Spells to move your units around more efficiently, and to control your enemies.";
    }
}
