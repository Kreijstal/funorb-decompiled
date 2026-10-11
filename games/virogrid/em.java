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
        if (param0 < -78) {
          field_b = null;
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        }
        em.a((byte) -63, 112);
        field_b = null;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static void a(byte param0, int param1) {
        hg var2 = gk.field_g;
        var2.g(param1, 8);
        var2.field_l = var2.field_l + 1;
        int var3 = var2.field_l;
        var2.a(2, -124);
        var2.a(kn.field_E, kn.field_E.length, 0, (byte) -121);
        var2.a(aa.field_e, -111);
        var2.a(qc.field_c, 77);
        if (param0 == -55) {
          var2.a(pm.field_p, pm.field_p.length, 0, (byte) -105);
          var2.b(var2.field_l - var3, -1);
          return;
        }
        field_b = (String[]) null;
        var2.a(pm.field_p, pm.field_p.length, 0, (byte) -105);
        var2.b(var2.field_l - var3, -1);
    }

    final static void b(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          var5 = ph.field_o;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!hn.a(param2, param0, param1, (byte) 109)) {
            stackIn_2_0 = null;
            return (v) (stackIn_2_0);
          }
          if (param3) {
            em.b(20);
          }
          stackIn_6_0 = pm.a(-9618, param4.a(param0, param1, 0));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("em.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(boolean param0, String param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          wa.field_F = wa.field_F + 1;
          if (-1 == uh.field_c &&
            sk.field_d == -1) {
            uh.field_c = nl.field_u;
            sk.field_d = hk.field_Jb;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(od.field_l));
          } else {
            decompiledFrameRemainder0 = (od.field_l == null);
          }
          if (decompiledFrameRemainder0) {
            if (!ei.field_a) {
              if (wa.field_F >= ed.field_a) {
                stackIn_16_0 = (wa.field_F < nb.field_y + ed.field_a) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param1 == null) {
              wa.field_F = 0;
            } else {
              if (ei.field_a) {
                wa.field_F = ed.field_a;
              } else {
                if (var2_int != 0) {
                  wa.field_F = ed.field_a;
                } else {
                  wa.field_F = 0;
                }
              }
            }
            ge.field_b = sk.field_d;
            mc.field_a = uh.field_c;
            if (param1 == null) {
              if (var2_int != 0) {
                ei.field_a = true;
              }
            } else {
              ei.field_a = false;
            }
          }
          od.field_l = param1;
          if (!ei.field_a &&
            ed.field_a > wa.field_F &&
            w.field_J) {
            mc.field_a = uh.field_c;
            wa.field_F = 0;
            ge.field_b = sk.field_d;
          }
          uh.field_c = -1;
          if (!param0) {
            field_b = (String[]) null;
          }
          sk.field_d = -1;
          if (ei.field_a) {
            if (wa.field_F != kl.field_E) {
              return;
            }
            ei.field_a = false;
            wa.field_F = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("em.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    static {
        field_f = new String[]{"All scores", "My scores", "Best each"};
        field_e = "White";
        field_b = new String[]{"Dominate the grid to achieve victory!<br><br>Players take turns to select a piece and either clone it into an adjacent space, or jump it two spaces.<br><br>If a piece is cloned or jumped into a space that is next to one or more opposing pieces, it will automatically capture those pieces.<br><br>If the grid is filled before either player wipes out the other, the player with the most pieces on the grid wins.", "Each player has a limited amount of time to perform their move. If the timer ever reaches zero, a move is played for them by the easy AI. After three strikes in an online game, that player forfeits the game.<br><br>To rotate the board in game, use the arrow keys or the control panel at the lower-right-hand corner of the screen, or hold down the right mouse button while moving the mouse.<br><br>The circle button in the control panel will restore the default view.<br><br>You can zoom the camera in and out with the mouse wheel or with the up and down arrow keys."};
    }
}
