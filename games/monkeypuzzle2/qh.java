/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String[] field_c;
    static le[] field_a;
    static int field_b;

    final static void a(int param0, boolean param1) {
        gb.field_f = param0;
        if (!param1) {
          String var3 = (String) null;
          qh.a(-59, (aj) null, -21, false, (aj) null, 19, (String) null);
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (we.field_n != null) {
            mg.field_s = 0;
            b.field_k = -1;
            dh.field_b = -1;
            oh.field_b = true;
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qh.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != we.field_n) {
            mg.field_s = 0;
            b.field_k = param0.getX();
            dh.field_b = param0.getY();
            oh.field_b = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qh.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (null != we.field_n) {
            mg.field_s = 0;
            b.field_k = param0.getX();
            dh.field_b = param0.getY();
            oh.field_b = true;
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qh.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (we.field_n != null) {
            mg.field_s = 0;
            b.field_k = param0.getX();
            dh.field_b = param0.getY();
            oh.field_b = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qh.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(int param0, aj param1, int param2, boolean param3, aj param4, int param5, String param6) {
        int var12 = 0;
        int stackIn_8_0 = 0;
        gk stackIn_19_0 = null;
        String stackIn_20_1 = null;
        gk stackIn_22_0 = null;
        String stackIn_23_1 = null;
        int stackIn_34_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param2 != -1) {
            field_a = (le[]) null;
          }
          var14 = param4.a((byte) -93);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param1.a((byte) -77);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (null == ol.field_g &&
            !cb.a(-123, false)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if (ii.field_r == dk.field_h) {
            kc.field_b = null;
            gf.field_c.field_h = 0;
            if (param6 == null) {
              uc.field_a.field_h = 0;
              uc.field_a.a(-803539344, pi.field_l.nextInt());
              uc.field_a.a(-803539344, pi.field_l.nextInt());
              stackIn_19_0 = uc.field_a;
              if (!param4.b(0)) {
                stackIn_20_1 = "";
              } else {
                stackIn_20_1 = var14;
              }
              ((gk) (Object) stackIn_19_0).a(stackIn_20_1, -84);
              stackIn_22_0 = uc.field_a;
              if (!param1.b(0)) {
                stackIn_23_1 = "";
              } else {
                stackIn_23_1 = var8;
              }
              ((gk) (Object) stackIn_22_0).a(stackIn_23_1, 116);
              gf.field_c.b(16, param2 - 49151);
              gf.field_c.field_h = gf.field_c.field_h + 1;
              var9 = gf.field_c.field_h;
              e.a(sd.field_a, fj.field_F, (byte) 113, gf.field_c, uc.field_a);
              gf.field_c.a(gf.field_c.field_h - var9, (byte) -114);
            } else {
              var9 = 0;
              uc.field_a.field_h = 0;
              if (param3) {
                var9 = var9 | 1;
              }
              uc.field_a.a(-803539344, pi.field_l.nextInt());
              uc.field_a.a(param2 ^ 803539343, pi.field_l.nextInt());
              uc.field_a.a(var14, param2 ^ 103);
              uc.field_a.a(var8, -64);
              var15 = (CharSequence) ((Object) param6);
              uc.field_a.a(q.a(var15, 20), 122);
              uc.field_a.c(param0, 127);
              uc.field_a.b(param5, param2 - 49151);
              uc.field_a.b(var9, -49152);
              gf.field_c.b(18, param2 - 49151);
              gf.field_c.field_h = gf.field_c.field_h + 2;
              var10 = gf.field_c.field_h;
              var11_ref_StringLifetime4 = lc.a(ii.a(false), (byte) -89);
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              gf.field_c.a(param2 + 69, var11_ref_StringLifetime4);
              e.a(sd.field_a, fj.field_F, (byte) -112, gf.field_c, uc.field_a);
              gf.field_c.d(6903, gf.field_c.field_h - var10);
            }
            al.a((byte) -71, -1);
            dk.field_h = vd.field_e;
          }
          if (vd.field_e == dk.field_h &&
            hj.a(1, true)) {
            var9Lifetime1 = MonkeyPuzzle2.field_D.a((byte) 114);
            MonkeyPuzzle2.field_D.field_h = 0;
            if (var9Lifetime1 >= 100 &&
              105 >= var9Lifetime1) {
              cm.field_E = new String[-100 + var9Lifetime1];
              dk.field_h = MonkeyPuzzle2.field_C;
            } else {
              if (var9Lifetime1 == 248) {
                nh.a((byte) 99, ii.a(false));
                sl.field_n = sb.field_q;
                gk.a(-1);
                ck.field_e = false;
                stackIn_34_0 = var9Lifetime1;
                return stackIn_34_0;
              }
              if (var9Lifetime1 == 99) {
                hj.a(gb.a((byte) 57), true);
                kc.field_b = new Boolean(bi.a((byte) 122, MonkeyPuzzle2.field_D));
                MonkeyPuzzle2.field_D.field_h = 0;
              } else {
                dk.field_h = ma.field_d;
                rc.field_f = -1;
                wk.field_a = var9Lifetime1;
              }
            }
          }
          if (MonkeyPuzzle2.field_C == dk.field_h) {
            var9Lifetime2 = 2;
            if (hj.a(var9Lifetime2, true)) {
              var10Lifetime1 = MonkeyPuzzle2.field_D.j(17277);
              MonkeyPuzzle2.field_D.field_h = 0;
              if (hj.a(var10Lifetime1, true)) {
                var11 = cm.field_E.length;
                for (var12 = 0; var11 > var12; var12++) {
                  cm.field_E[var12] = MonkeyPuzzle2.field_D.b((byte) 93);
                }
                gk.a(-1);
                ck.field_e = false;
                stackIn_48_0 = 100 + var11;
                return stackIn_48_0;
              }
            }
          }
          if (dk.field_h == ma.field_d &&
            gb.a(true)) {
            if (wk.field_a != 255) {
              sl.field_n = MonkeyPuzzle2.field_D.f(-1);
            } else {
              var9_ref_String = MonkeyPuzzle2.field_D.g(-1185292952);
              if (var9_ref_String != null) {
                pe.a(var9_ref_String, (byte) -108, ii.a(false));
              }
            }
            gk.a(param2 ^ 0);
            ck.field_e = false;
            stackIn_57_0 = wk.field_a;
            return stackIn_57_0;
          }
          if (ol.field_g == null) {
            if (ck.field_e) {
              if (wf.a(114) > 30000L) {
                sl.field_n = kj.field_E;
              } else {
                sl.field_n = hh.field_p;
              }
              ck.field_e = false;
              stackIn_65_0 = 249;
              return stackIn_65_0;
            }
            var9Lifetime3 = cg.field_g;
            cg.field_g = id.field_m;
            ck.field_e = true;
            id.field_m = var9Lifetime3;
          }
          stackIn_68_0 = -1;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("qh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(')').toString());
        }
    }

    final static void a(hl param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            ek.field_d[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; ea.field_c > var2_intLifetime1; var2_intLifetime1++) {
            if (pg.field_e[var2_intLifetime1].field_i == param0.field_i) {
              dupTemp$3 = pg.field_e[var2_intLifetime1].a(2147483647);
              ek.field_d[dupTemp$3] = ek.field_d[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a(2147483647);
          ek.field_d[dupTemp$0] = ek.field_d[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; ea.field_c > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (~param0.field_i == ~pg.field_e[var3].field_i) {
              var4 = pg.field_e[var3].a(2147483647);
              if (uj.field_g < ek.field_d[var4]) {
                ek.field_d[var4] = ek.field_d[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              pg.field_e[incrementValue$2] = pg.field_e[var3];
            }
          }
          ea.field_c = var2_intLifetime2;
          if (param1 != 6191) {
            field_b = -73;
          }
          fieldTemp$1 = ea.field_c;
          ea.field_c = ea.field_c + 1;
          pg.field_e[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("qh.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qh.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (we.field_n != null) {
            mg.field_s = 0;
            cj.field_d = param0.getX();
            ek.field_a = param0.getY();
            pf.a(0);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              ke.field_g = 1;
              lf.field_a = 1;
            } else {
              ke.field_g = 2;
              lf.field_a = 2;
            }
            var2_int = param0.getModifiers();
            if ((8 & var2_int) != 0) {
            }
            oh.field_b = true;
            if ((var2_int & 16) == 0) {
            }
            if ((4 & var2_int) != 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("qh.mousePressed(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != we.field_n) {
            lf.field_a = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qh.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (we.field_n != null) {
            mg.field_s = 0;
            lf.field_a = 0;
            oh.field_b = true;
            var2_int = param0.getModifiers();
            if ((8 & var2_int) != 0) {
            }
            if (0 != (16 & var2_int)) {
            }
            if ((var2_int & 4) != 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("qh.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
