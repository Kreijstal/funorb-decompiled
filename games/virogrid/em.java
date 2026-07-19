/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static float field_c;
    static String field_e;
    static String[] field_f;
    static v field_d;
    static r field_a;
    static String[] field_b;

    public static void a(int param0) {
        field_f = null;
        if (param0 >= -78) {
          em.a((byte) -63, 112);
          field_b = null;
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static void a(byte param0, int param1) {
        hg var2 = null;
        int var3 = 0;
        var2 = gk.field_g;
        var2.g(param1, 8);
        var2.field_l = var2.field_l + 1;
        var3 = var2.field_l;
        var2.a(2, -124);
        var2.a(kn.field_E, kn.field_E.length, 0, (byte) -121);
        var2.a(aa.field_e, -111);
        var2.a(qc.field_c, 77);
        if (param0 != -55) {
          field_b = (String[]) null;
          var2.a(pm.field_p, pm.field_p.length, 0, (byte) -105);
          var2.b(var2.field_l - var3, -1);
          return;
        } else {
          var2.a(pm.field_p, pm.field_p.length, 0, (byte) -105);
          var2.b(var2.field_l - var3, -1);
          return;
        }
    }

    final static void b(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var5 = ph.field_o;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "em.B(" + param0 + ')');
        }
    }

    final static v a(int param0, int param1, eh param2, boolean param3, eh param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        v stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        v stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (hn.a(param2, param0, param1, (byte) 109)) {
              L1: {
                if (!param3) {
                  break L1;
                } else {
                  em.b(20);
                  break L1;
                }
              }
              stackOut_5_0 = pm.a(-9618, param4.a(param0, param1, 0));
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("em.A(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (v) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              wa.field_F = wa.field_F + 1;
              if (-1 != uh.field_c) {
                break L1;
              } else {
                if (sk.field_d != -1) {
                  break L1;
                } else {
                  uh.field_c = nl.field_u;
                  sk.field_d = hk.field_Jb;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 != null) {
                  if (param1.equals(od.field_l)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (od.field_l != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!ei.field_a) {
                  if (wa.field_F >= ed.field_a) {
                    if (wa.field_F < nb.field_y + ed.field_a) {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_16_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_16_0 = stackOut_11_0;
                    break L4;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_16_0 = stackOut_9_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_16_0;
                if (param1 == null) {
                  wa.field_F = 0;
                  break L5;
                } else {
                  if (ei.field_a) {
                    wa.field_F = ed.field_a;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      wa.field_F = ed.field_a;
                      break L5;
                    } else {
                      wa.field_F = 0;
                      break L5;
                    }
                  }
                }
              }
              ge.field_b = sk.field_d;
              mc.field_a = uh.field_c;
              if (param1 == null) {
                if (var2_int == 0) {
                  break L2;
                } else {
                  ei.field_a = true;
                  break L2;
                }
              } else {
                ei.field_a = false;
                break L2;
              }
            }
            L6: {
              od.field_l = param1;
              if (ei.field_a) {
                break L6;
              } else {
                if (ed.field_a <= wa.field_F) {
                  break L6;
                } else {
                  if (w.field_J) {
                    mc.field_a = uh.field_c;
                    wa.field_F = 0;
                    ge.field_b = sk.field_d;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              uh.field_c = -1;
              if (param0) {
                break L7;
              } else {
                field_b = (String[]) null;
                break L7;
              }
            }
            L8: {
              sk.field_d = -1;
              if (!ei.field_a) {
                break L8;
              } else {
                if (wa.field_F == kl.field_E) {
                  ei.field_a = false;
                  wa.field_F = 0;
                  break L8;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var2);
            stackOut_40_1 = new StringBuilder().append("em.C(").append(param0).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L9;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
    }

    static {
        field_f = new String[]{"All scores", "My scores", "Best each"};
        field_e = "White";
        field_b = new String[]{"Dominate the grid to achieve victory!<br><br>Players take turns to select a piece and either clone it into an adjacent space, or jump it two spaces.<br><br>If a piece is cloned or jumped into a space that is next to one or more opposing pieces, it will automatically capture those pieces.<br><br>If the grid is filled before either player wipes out the other, the player with the most pieces on the grid wins.", "Each player has a limited amount of time to perform their move. If the timer ever reaches zero, a move is played for them by the easy AI. After three strikes in an online game, that player forfeits the game.<br><br>To rotate the board in game, use the arrow keys or the control panel at the lower-right-hand corner of the screen, or hold down the right mouse button while moving the mouse.<br><br>The circle button in the control panel will restore the default view.<br><br>You can zoom the camera in and out with the mouse wheel or with the up and down arrow keys."};
    }
}
