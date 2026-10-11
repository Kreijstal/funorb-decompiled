/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_a;
    static ue field_b;
    static dl field_c;
    static am field_d;

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (null != tm.field_b) {
            aq.field_s = 0;
            fq.field_C = param0.getX();
            tn.field_s = param0.getY();
            wl.field_m = true;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "a.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != tm.field_b) {
            aq.field_s = 0;
            kk.field_g = param0.getX();
            sb.field_I = param0.getY();
            lo.a((byte) -57);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              th.field_y = 2;
              uc.field_b = 2;
            } else {
              th.field_y = 1;
              uc.field_b = 1;
            }
            var2_int = param0.getModifiers();
            wl.field_m = true;
            if ((var2_int & 4) != 0) {
            }
            if (0 == (16 & var2_int)) {
            }
            if ((8 & var2_int) != 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("a.mousePressed(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (tm.field_b != null) {
            aq.field_s = 0;
            fq.field_C = -1;
            tn.field_s = -1;
            wl.field_m = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("a.mouseExited(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
          if (tm.field_b != null) {
            aq.field_s = 0;
            fq.field_C = param0.getX();
            tn.field_s = param0.getY();
            wl.field_m = true;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "a.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
          if (tm.field_b != null) {
            aq.field_s = 0;
            fq.field_C = param0.getX();
            tn.field_s = param0.getY();
            wl.field_m = true;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "a.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
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
          if (null != tm.field_b) {
            aq.field_s = 0;
            uc.field_b = 0;
            wl.field_m = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 4) == 0) {
            }
            if ((var2_int & 8) != 0) {
            }
            if ((var2_int & 16) != 0) {
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
          stackIn_10_1 = new StringBuilder().append("a.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, vc param5, int param6, int param7, vc param8, int param9, int param10, int param11, hj param12, hj param13, int param14, hj param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          if (param2 != 0) {
            return;
          }
          sl.a(param5, param8, 107, param18);
          mo.a(param20, param3, param4, param0, (byte) -16);
          mh.a(param7, -20, param1);
          f.a(param16, param15, param17, param13, param14, (byte) 104);
          u.a(param6, param12, 250, param9);
          vf.a(param11, (byte) 118, param10, param19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("a.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param13 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (!param0) {
          hj var2 = (hj) null;
          a.a(74, 5, -18, 74, -59, (vc) null, -54, -86, (vc) null, -31, 85, -40, (hj) null, (hj) null, 11, (hj) null, -17, -43, 64, -124, 62);
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (tm.field_b != null) {
            uc.field_b = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("a.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1;
        int var2;
        CharSequence var3;
        var2 = CrazyCrystals.field_B;
        sd.field_T = null;
        dj.field_t = false;
        if (param0 != 63) {
          var3 = (CharSequence) null;
          a.a(-70, (CharSequence) null);
        }
        if (ne.field_d) {
          sp.field_a.l(126);
        } else {
          var1 = kl.field_V;
          if (var1 > 0) {
            if (var1 != 1) {
              sd.field_T = ci.a(new String[]{Integer.toString(var1)}, gh.field_t, 3);
            } else {
              sd.field_T = va.field_a;
            }
            sd.field_T = dk.a(new CharSequence[]{(CharSequence) ((Object) sd.field_T), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) qe.field_h)}, (byte) -55);
          }
          sp.field_a.i((byte) -78);
          rf.a(param0 - 60);
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -38 / ((45 - param0) / 48);
          stackIn_1_0 = qn.a((byte) -123, false, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("a.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        String[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        String stackIn_70_2 = null;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        String stackIn_77_2 = null;
        int stackIn_90_0 = 0;
        boolean stackIn_91_1 = false;
        int stackIn_115_0 = 0;
        int stackIn_116_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = CrazyCrystals.field_B;
        try {
          rd.field_h = true;
          am.field_g = param1;
          if (am.field_g == 0) {
            var3_int = v.a(ec.field_m, ug.field_a, -27815, vk.field_L, eb.field_y);
            var4 = 3 + var3_int;
            ub.field_b = new int[var4];
            je.field_i = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              ub.field_b[var5] = -1;
            }
            sn.field_a = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              je.field_i[var5] = eb.field_y[var5];
            }
            je.field_i[var4 - 3] = "";
            je.field_i[-2 + var4] = ig.field_m;
            ub.field_b[-2 + var4] = 0;
            sn.field_a[0] = 4;
            je.field_i[var4 - 1] = qo.field_o;
            ub.field_b[-1 + var4] = 1;
            sn.field_a[1] = 5;
          } else if (am.field_g == 1) {
            var3_int = v.a(ec.field_m, ug.field_a, -27815, vk.field_L, eb.field_y);
            var4 = var3_int + 2;
            ub.field_b = new int[var4];
            je.field_i = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              ub.field_b[var5] = -1;
            }
            sn.field_a = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              je.field_i[var5] = eb.field_y[var5];
            }
            je.field_i[var4 - 2] = "";
            je.field_i[var4 - 1] = qo.field_o;
            ub.field_b[var4 - 1] = 0;
            sn.field_a[0] = 5;
          } else if (am.field_g != 2) {
            if (3 == am.field_g) {
              if (te.field_a.field_h) {
                var3_int = v.a(ec.field_m, ib.field_m, -27815, vk.field_L, eb.field_y);
              } else {
                var3_int = v.a(ec.field_m, gn.field_U, -27815, vk.field_L, eb.field_y);
              }
              var4 = var3_int + 2;
              ub.field_b = new int[var4];
              je.field_i = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                ub.field_b[var5] = -1;
              }
              sn.field_a = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                je.field_i[var5] = eb.field_y[var5];
              }
              je.field_i[var4 - 2] = "";
              je.field_i[-1 + var4] = qo.field_o;
              ub.field_b[-1 + var4] = 0;
              sn.field_a[0] = 5;
            } else if (am.field_g == 4) {
              var3_int = v.a(ec.field_m, nh.field_C, -27815, vk.field_L, eb.field_y);
              var4 = var3_int + 2;
              ub.field_b = new int[var4];
              je.field_i = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                ub.field_b[var5] = -1;
              }
              sn.field_a = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                je.field_i[var5] = eb.field_y[var5];
              }
              je.field_i[var4 - 2] = "";
              je.field_i[-1 + var4] = qo.field_o;
              ub.field_b[var4 - 1] = 0;
              sn.field_a[0] = 5;
            } else {
              if (am.field_g != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = v.a(ec.field_m, fn.field_i, -27815, vk.field_L, eb.field_y);
              var4 = var3_int + 3;
              je.field_i = new String[var4];
              ub.field_b = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                ub.field_b[var5] = -1;
              }
              sn.field_a = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                je.field_i[var5] = eb.field_y[var5];
              }
              je.field_i[var4 - 3] = "";
              je.field_i[-2 + var4] = ia.field_h;
              ub.field_b[-2 + var4] = 0;
              sn.field_a[0] = 3;
              je.field_i[-1 + var4] = qo.field_o;
              ub.field_b[-1 + var4] = 1;
              sn.field_a[1] = 5;
            }
          } else {
            var3_int = v.a(ec.field_m, ci.a(new String[]{"<br><%0><br>"}, rg.field_b, 3), -27815, vk.field_L, eb.field_y);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(eb.field_y[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            jl.field_a = new String[var4];
            eg.a(eb.field_y, 0, jl.field_a, 0, var4);
            lo.field_c = new String[-1 + var3_int - var4];
            eg.a(eb.field_y, 1 + var4, lo.field_c, 0, -1 + (-var4 + var3_int));
            var3_int = v.a(ec.field_m, ci.a(new String[]{"<br><%0><br>"}, jg.field_t, 3), -27815, vk.field_L, eb.field_y);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(eb.field_y[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            sl.field_r = new String[var4];
            eg.a(eb.field_y, 0, sl.field_r, 0, var4);
            ne.field_a = new String[-var4 + (var3_int - 1)];
            eg.a(eb.field_y, 1 + var4, ne.field_a, 0, -1 + (-var4 + var3_int));
            if (jl.field_a.length < sl.field_r.length) {
              stackIn_59_0 = sl.field_r.length;
            } else {
              stackIn_59_0 = jl.field_a.length;
            }
            var5 = stackIn_59_0;
            if (lo.field_c.length >= ne.field_a.length) {
              stackIn_62_0 = lo.field_c.length;
            } else {
              stackIn_62_0 = ne.field_a.length;
            }
            var6 = stackIn_62_0;
            var7 = var6 + (7 + var5);
            je.field_i = new String[var7];
            ub.field_b = new int[var7];
            for (var8 = 0; var8 < var7; var8++) {
              ub.field_b[var8] = -1;
            }
            je.field_i[0] = sa.field_rb;
            ub.field_b[1] = 0;
            je.field_i[1] = qc.field_h;
            sn.field_a = new int[2];
            je.field_i[5] = "";
            sn.field_a[1] = 2;
            sn.field_a[0] = 5;
            je.field_i[2] = jk.field_h;
            je.field_i[3] = jb.field_a;
            je.field_i[4] = ca.field_g;
            ub.field_b[3] = 1;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_69_0 = je.field_i;
              stackIn_69_1 = 6 + var8Lifetime2;
              if (-var5 + (var8Lifetime2 + sl.field_r.length) >= 0) {
                stackIn_70_2 = sl.field_r[sl.field_r.length + (var8Lifetime2 - var5)];
              } else {
                stackIn_70_2 = "";
              }
              stackIn_69_0[stackIn_69_1] = stackIn_70_2;
            }
            je.field_i[var5 + 6] = null;
            ub.field_b[6 + var5] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_74_0 = je.field_i;
              stackIn_74_1 = var8Lifetime3 + var5 + 7;
              stackIn_74_2 = ne.field_a.length;
              stackIn_74_3 = var8Lifetime3;
              if (stackIn_74_2 > stackIn_74_3) {
                stackIn_77_2 = ne.field_a[var8Lifetime3];
              } else {
                stackIn_77_2 = "";
              }
              stackIn_74_0[stackIn_74_1] = stackIn_77_2;
            }
            wm.field_d = lo.a((byte) -60);
          }
          lb.field_l.field_b = sn.field_a.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < je.field_i.length; var4Lifetime1++) {
            stackIn_90_0 = 90;
            stackIn_91_1 = !(ub.field_b[var4Lifetime1] < 0);
            var5Lifetime1 = vm.$cfr$intArgs$a$62abead39cee(stackIn_90_0, stackIn_91_1, je.field_i[var4Lifetime1]);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (am.field_g == 2) {
            var10 = jl.field_a;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = vm.$cfr$intArgs$a$62abead39cee(98, false, var11);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = lo.field_c;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = vm.$cfr$intArgs$a$62abead39cee(-113, false, var12);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          ri.field_a = oa.field_b + (var3_intLifetime1 - (var3_intLifetime1 >> 1));
          gp.field_a = (field_a + bn.field_c << 1) * lb.field_l.field_b;
          bf.field_c = -(var3_intLifetime1 >> 1) + oa.field_b;
          for (var4Lifetime2 = 0; var4Lifetime2 < je.field_i.length; var4Lifetime2++) {
            stackIn_115_0 = gp.field_a;
            if (ub.field_b[var4Lifetime2] >= 0) {
              stackIn_116_1 = gh.field_w;
            } else {
              stackIn_116_1 = io.field_O;
            }
            gp.field_a = stackIn_115_0 + stackIn_116_1;
          }
          pf.field_n = -(gp.field_a >> 1) + rn.field_n;
          cd.field_z = new int[je.field_i.length][];
          if (param0 <= 103) {
            return;
          }
          var4Lifetime3 = 0;
          var5Lifetime3 = pf.field_n;
          while (je.field_i.length > var4Lifetime3) {
            var6Lifetime1 = ub.field_b[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = vm.$cfr$intArgs$a$62abead39cee(-112, true, je.field_i[var4Lifetime3]);
              var5Lifetime3 = var5Lifetime3 + field_a;
              var8Lifetime1 = -(var7Lifetime2 >> 1) + oa.field_b;
              cd.field_z[var4Lifetime3] = new int[4];
              cd.field_z[var4Lifetime3][0] = var8Lifetime1 - to.field_d;
              cd.field_z[var4Lifetime3][1] = var5Lifetime3;
              cd.field_z[var4Lifetime3][2] = var7Lifetime2 + (to.field_d << 1);
              var5Lifetime3 = var5Lifetime3 + (field_a + (bn.field_c << 1) + gh.field_w);
              cd.field_z[var4Lifetime3][3] = gh.field_w + (bn.field_c << 1);
            } else {
              var5Lifetime3 = var5Lifetime3 + io.field_O;
            }
            var4Lifetime3++;
          }
          if (2 == am.field_g) {
            lb.field_l.a((byte) 41, param2, -1, -1);
          } else {
            lb.field_l.a((byte) 41, param2, be.a(-1013410975, qh.field_i, bm.field_h), 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var3), "a.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "a.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
