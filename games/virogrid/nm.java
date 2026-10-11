/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static char field_d;
    static int[] field_a;
    static int field_b;
    static String field_c;

    final static boolean c(int param0) {
        if (param0 != 2) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          nm.a((java.applet.Applet) null, 111);
        }
        return 250 < kf.field_e ? true : false;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 26523) {
          field_c = (String) null;
        }
    }

    final static void b(int param0) {
        la.field_n = false;
        rj.field_d = null;
        de.field_rb = null;
        if (param0 != 1) {
          eh var2 = (eh) null;
          nm.a((byte[]) null, (rm[]) null, (int[]) null, (String[][]) null, (byte[]) null, (eh) null, 27, (String[]) null, (String[][]) null, (mg[][]) null, true, (mg[][]) null, -1, (int[]) null, (byte) -43, (String[]) null, (eh) null, (eh) null, 123);
        }
        eh.field_j = null;
        dh.field_o = null;
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_17_0 = false;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = Virogrid.field_F ? 1 : 0;
          try {
            if (af.field_i) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (q.b("getcookies", 6168, param0));
              var4 = ql.a(var3, (byte) -123, ';');
              var5 = 0;
              if (param1 < 77) {
                field_b = -17;
              }
              while (var4.length > var5) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
                var5++;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_17_0 = (null != param0.getParameter("tuhstatbut"));
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref2;
            stackIn_20_1 = new StringBuilder().append("nm.E(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw kg.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte[] param0, rm[] param1, int[] param2, String[][] param3, byte[] param4, eh param5, int param6, String[] param7, String[][] param8, mg[][] param9, boolean param10, mg[][] param11, int param12, int[] param13, byte param14, String[] param15, eh param16, eh param17, int param18) {
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
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          if (param14 > -65) {
            nm.a(true, -102, (byte) 44);
          }
          var20 = (String[]) null;
          jg.a(param7, (String[]) null, param8, param0, param16, param11, param3, param4, param12, 1, param10, param1, param18, param5, param2, param17, (byte) 99, param13, param15, param9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_6_0 = var19;
          stackIn_6_1 = new StringBuilder().append("nm.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param8 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param9 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param16 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param17 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param18).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, byte param2) {
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        String[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String stackIn_63_2 = null;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_69_2 = null;
        int stackIn_89_0 = 0;
        boolean stackIn_90_1 = false;
        int stackIn_113_0 = 0;
        int stackIn_114_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        String[] var5_ref_String__Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var9Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime2;
        int var9Lifetime3;
        int var6Lifetime2Lifetime1;
        int var8Lifetime1Lifetime1;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          p.field_d = param1;
          var3_int = 120 / ((-14 - param2) / 41);
          la.field_n = true;
          if (p.field_d == 0) {
            var4 = sf.a((byte) 124, re.field_n, j.field_h, rf.field_b, fb.field_l);
            var5 = 3 + var4;
            mn.field_c = new String[var5];
            wg.field_h = new int[var5];
            for (var6 = 0; var5 > var6; var6++) {
              wg.field_h[var6] = -1;
            }
            rb.field_a = new int[2];
            for (var6 = 0; var4 > var6; var6++) {
              mn.field_c[var6] = fb.field_l[var6];
            }
            mn.field_c[-3 + var5] = "";
            mn.field_c[-2 + var5] = vi.field_m;
            wg.field_h[-2 + var5] = 0;
            rb.field_a[0] = 4;
            mn.field_c[-1 + var5] = je.field_I;
            wg.field_h[var5 - 1] = 1;
            rb.field_a[1] = 5;
          } else if (1 == p.field_d) {
            var4 = sf.a((byte) 125, re.field_n, j.field_h, rf.field_b, fb.field_l);
            var5 = var4 + 2;
            wg.field_h = new int[var5];
            mn.field_c = new String[var5];
            for (var6 = 0; var5 > var6; var6++) {
              wg.field_h[var6] = -1;
            }
            rb.field_a = new int[1];
            for (var6 = 0; var6 < var4; var6++) {
              mn.field_c[var6] = fb.field_l[var6];
            }
            mn.field_c[-2 + var5] = "";
            mn.field_c[var5 - 1] = je.field_I;
            wg.field_h[-1 + var5] = 0;
            rb.field_a[0] = 5;
          } else if (2 != p.field_d) {
            if (p.field_d == 3) {
              if (!ei.field_c.field_a) {
                var4 = sf.a((byte) 127, fd.field_x, j.field_h, rf.field_b, fb.field_l);
              } else {
                var4 = sf.a((byte) 120, eh.field_h, j.field_h, rf.field_b, fb.field_l);
              }
              var5 = 2 + var4;
              mn.field_c = new String[var5];
              wg.field_h = new int[var5];
              for (var6 = 0; var6 < var5; var6++) {
                wg.field_h[var6] = -1;
              }
              rb.field_a = new int[1];
              for (var6 = 0; var4 > var6; var6++) {
                mn.field_c[var6] = fb.field_l[var6];
              }
              mn.field_c[-2 + var5] = "";
              mn.field_c[var5 - 1] = je.field_I;
              wg.field_h[var5 - 1] = 0;
              rb.field_a[0] = 5;
            } else if (p.field_d == 4) {
              var4 = sf.a((byte) 120, tl.field_j, j.field_h, rf.field_b, fb.field_l);
              var5 = var4 + 2;
              wg.field_h = new int[var5];
              mn.field_c = new String[var5];
              for (var6 = 0; var5 > var6; var6++) {
                wg.field_h[var6] = -1;
              }
              rb.field_a = new int[1];
              for (var6 = 0; var6 < var4; var6++) {
                mn.field_c[var6] = fb.field_l[var6];
              }
              mn.field_c[-2 + var5] = "";
              mn.field_c[var5 - 1] = je.field_I;
              wg.field_h[-1 + var5] = 0;
              rb.field_a[0] = 5;
            } else {
              if (p.field_d != 5) {
                throw new IllegalArgumentException();
              }
              var4 = sf.a((byte) 123, el.field_i, j.field_h, rf.field_b, fb.field_l);
              var5 = var4 + 3;
              mn.field_c = new String[var5];
              wg.field_h = new int[var5];
              for (var6 = 0; var6 < var5; var6++) {
                wg.field_h[var6] = -1;
              }
              rb.field_a = new int[2];
              for (var6 = 0; var6 < var4; var6++) {
                mn.field_c[var6] = fb.field_l[var6];
              }
              mn.field_c[-3 + var5] = "";
              mn.field_c[-2 + var5] = vf.field_a;
              wg.field_h[-2 + var5] = 0;
              rb.field_a[0] = 3;
              mn.field_c[-1 + var5] = je.field_I;
              wg.field_h[var5 - 1] = 1;
              rb.field_a[1] = 5;
            }
          } else {
            var4 = sf.a((byte) 121, oi.a(new String[]{"<br><%0><br>"}, ji.field_d, 2), j.field_h, rf.field_b, fb.field_l);
            var5 = -1;
            for (var6 = 0; var6 < var4; var6++) {
              if (!"<%0>".equals(fb.field_l[var6])) {
                continue;
              }
              var5 = var6;
              break;
            }
            if (var5 == -1) {
              throw new IllegalStateException();
            }
            rj.field_d = new String[var5];
            ek.a(fb.field_l, 0, rj.field_d, 0, var5);
            eh.field_j = new String[-1 + var4 - var5];
            ek.a(fb.field_l, 1 + var5, eh.field_j, 0, -var5 + var4 - 1);
            var4 = sf.a((byte) 124, oi.a(new String[]{"<br><%0><br>"}, mh.field_e, 2), j.field_h, rf.field_b, fb.field_l);
            var5 = -1;
            for (var6 = 0; var4 > var6; var6++) {
              if (!"<%0>".equals(fb.field_l[var6])) {
                continue;
              }
              var5 = var6;
              break;
            }
            if (var5 == -1) {
              throw new IllegalStateException();
            }
            dh.field_o = new String[var5];
            ek.a(fb.field_l, 0, dh.field_o, 0, var5);
            de.field_rb = new String[-var5 + var4 - 1];
            ek.a(fb.field_l, var5 + 1, de.field_rb, 0, -var5 + (var4 - 1));
            if (dh.field_o.length > rj.field_d.length) {
              stackIn_52_0 = dh.field_o.length;
            } else {
              stackIn_52_0 = rj.field_d.length;
            }
            var6 = stackIn_52_0;
            if (de.field_rb.length <= eh.field_j.length) {
              stackIn_55_0 = eh.field_j.length;
            } else {
              stackIn_55_0 = de.field_rb.length;
            }
            var7 = stackIn_55_0;
            var8 = var7 + (var6 + 7);
            wg.field_h = new int[var8];
            mn.field_c = new String[var8];
            for (var9 = 0; var8 > var9; var9++) {
              wg.field_h[var9] = -1;
            }
            rb.field_a = new int[2];
            mn.field_c[1] = sl.field_c;
            wg.field_h[1] = 0;
            mn.field_c[0] = mm.field_b;
            mn.field_c[4] = ud.field_d;
            mn.field_c[5] = "";
            rb.field_a[0] = 5;
            mn.field_c[2] = dk.field_u;
            wg.field_h[3] = 1;
            rb.field_a[1] = 2;
            mn.field_c[3] = eb.field_a;
            for (var9Lifetime2 = 0; var9Lifetime2 < var6; var9Lifetime2++) {
              stackIn_62_0 = mn.field_c;
              stackIn_62_1 = 6 + var9Lifetime2;
              if (var9Lifetime2 + dh.field_o.length - var6 < 0) {
                stackIn_63_2 = "";
              } else {
                stackIn_63_2 = dh.field_o[-var6 + var9Lifetime2 + dh.field_o.length];
              }
              stackIn_62_0[stackIn_62_1] = stackIn_63_2;
            }
            mn.field_c[var6 + 6] = null;
            wg.field_h[var6 + 6] = -2;
            for (var9Lifetime3 = 0; var9Lifetime3 < var7; var9Lifetime3++) {
              stackIn_68_0 = mn.field_c;
              stackIn_68_1 = 7 - (-var6 - var9Lifetime3);
              if (de.field_rb.length > var9Lifetime3) {
                stackIn_69_2 = de.field_rb[var9Lifetime3];
              } else {
                stackIn_69_2 = "";
              }
              stackIn_68_0[stackIn_68_1] = stackIn_69_2;
            }
            af.field_e = hc.a(-9986);
          }
          co.field_k.field_o = rb.field_a.length;
          var4Lifetime1 = 0;
          for (var5Lifetime1 = 0; var5Lifetime1 < mn.field_c.length; var5Lifetime1++) {
            stackIn_89_0 = 1492912648;
            stackIn_90_1 = !(wg.field_h[var5Lifetime1] < 0);
            var6Lifetime1 = gl.a(stackIn_89_0, stackIn_90_1, mn.field_c[var5Lifetime1]);
            if (var4Lifetime1 < var6Lifetime1) {
              var4Lifetime1 = var6Lifetime1;
            }
          }
          if (p.field_d == 2) {
            var11 = rj.field_d;
            var5_ref_String__ = var11;
            for (var6Lifetime2 = 0; var11.length > var6Lifetime2; var6Lifetime2++) {
              var12 = var11[var6Lifetime2];
              var8Lifetime1 = gl.a(1492912648, false, var12);
              if (var4Lifetime1 < var8Lifetime1) {
                var4Lifetime1 = var8Lifetime1;
              }
            }
            var5_ref_String__Lifetime1 = eh.field_j;
            for (var6Lifetime2Lifetime1 = 0; var5_ref_String__Lifetime1.length > var6Lifetime2Lifetime1; var6Lifetime2Lifetime1++) {
              var13 = var5_ref_String__Lifetime1[var6Lifetime2Lifetime1];
              var8Lifetime1Lifetime1 = gl.a(1492912648, false, var13);
              if (var8Lifetime1Lifetime1 > var4Lifetime1) {
                var4Lifetime1 = var8Lifetime1Lifetime1;
              }
            }
          }
          sg.field_n = co.field_k.field_o * (bj.field_j + oh.field_d << 1);
          qg.field_g = var4Lifetime1 + hn.field_q - (var4Lifetime1 >> 1);
          gi.field_c = -(var4Lifetime1 >> 1) + hn.field_q;
          for (var5Lifetime2 = 0; mn.field_c.length > var5Lifetime2; var5Lifetime2++) {
            stackIn_113_0 = sg.field_n;
            if (wg.field_h[var5Lifetime2] >= 0) {
              stackIn_114_1 = mi.field_c;
            } else {
              stackIn_114_1 = re.field_m;
            }
            sg.field_n = stackIn_113_0 + stackIn_114_1;
          }
          ih.field_a = -(sg.field_n >> 1) + ad.field_i;
          hn.field_v = new int[mn.field_c.length][];
          var5Lifetime3 = 0;
          var6Lifetime3 = ih.field_a;
          while (var5Lifetime3 < mn.field_c.length) {
            var7Lifetime1 = wg.field_h[var5Lifetime3];
            if (var7Lifetime1 < 0) {
              var6Lifetime3 = var6Lifetime3 + re.field_m;
            } else {
              var8Lifetime2 = gl.a(1492912648, true, mn.field_c[var5Lifetime3]);
              var6Lifetime3 = var6Lifetime3 + oh.field_d;
              var9Lifetime1 = -(var8Lifetime2 >> 1) + hn.field_q;
              hn.field_v[var5Lifetime3] = new int[4];
              hn.field_v[var5Lifetime3][0] = var9Lifetime1 - eh.field_d;
              hn.field_v[var5Lifetime3][1] = var6Lifetime3;
              hn.field_v[var5Lifetime3][2] = (eh.field_d << 1) + var8Lifetime2;
              var6Lifetime3 = var6Lifetime3 + ((bj.field_j << 1) + (oh.field_d + mi.field_c));
              hn.field_v[var5Lifetime3][3] = (bj.field_j << 1) + mi.field_c;
            }
            var5Lifetime3++;
          }
          if (p.field_d != 2) {
            co.field_k.a(param0, pn.a(hk.field_Jb, nl.field_u, (byte) 111), -563, 0);
          } else {
            co.field_k.a(param0, -1, -563, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "nm.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void d(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (w.field_L != null) {
          var1 = w.field_L;
          synchronized (var1) {
            w.field_L = null;
          }
        }
        if (param0 < 109) {
          field_c = (String) null;
        }
    }

    static {
        field_b = 0;
        field_a = new int[8192];
        field_c = "You have entered another game.";
    }
}
