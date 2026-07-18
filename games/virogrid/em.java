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
        field_b = null;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static void a() {
        hg var2 = gk.field_g;
        var2.g(11, 8);
        var2.field_l = var2.field_l + 1;
        int var3 = var2.field_l;
        var2.a(2, -124);
        var2.a(kn.field_E, kn.field_E.length, 0, (byte) -121);
        var2.a(aa.field_e, -111);
        var2.a(qc.field_c, 77);
        var2.a(pm.field_p, pm.field_p.length, 0, (byte) -105);
        var2.b(var2.field_l - var3, -1);
    }

    final static void b() {
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
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1_ref, "em.B(" + 0 + ')');
        }
    }

    final static v a(int param0, int param1, eh param2, boolean param3, eh param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        v stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        v stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            int discarded$9 = 109;
            if (hn.a(param2, param0, param1)) {
              int discarded$10 = 20;
              em.b();
              stackOut_3_0 = pm.a(-9618, param4.a(param0, param1, 0));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (v) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("em.A(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(false).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
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
                  if (param1.equals((Object) (Object) od.field_l)) {
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
              sk.field_d = -1;
              if (!ei.field_a) {
                break L7;
              } else {
                if (wa.field_F == kl.field_E) {
                  ei.field_a = false;
                  wa.field_F = 0;
                  break L7;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("em.C(").append(true).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"All scores", "My scores", "Best each"};
        field_e = "White";
        field_b = new String[]{"Dominate the grid to achieve victory!<br><br>Players take turns to select a piece and either clone it into an adjacent space, or jump it two spaces.<br><br>If a piece is cloned or jumped into a space that is next to one or more opposing pieces, it will automatically capture those pieces.<br><br>If the grid is filled before either player wipes out the other, the player with the most pieces on the grid wins.", "Each player has a limited amount of time to perform their move. If the timer ever reaches zero, a move is played for them by the easy AI. After three strikes in an online game, that player forfeits the game.<br><br>To rotate the board in game, use the arrow keys or the control panel at the lower-right-hand corner of the screen, or hold down the right mouse button while moving the mouse.<br><br>The circle button in the control panel will restore the default view.<br><br>You can zoom the camera in and out with the mouse wheel or with the up and down arrow keys."};
    }
}
