/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends si {
    static String[] field_K;
    static he field_L;
    static he[] field_I;
    static int field_J;
    static he[] field_H;

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        pi var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          var7 = oh.field_b;
          if (var7 != null &&
            this.a(param1, param0, false, param4, param2)) {
            if (this.field_u instanceof hk) {
              ((hk) (this.field_u)).a((byte) 70, var7, this);
              oh.field_b = null;
              return;
            }
            if (!(var7.field_u instanceof hk)) {
              return;
            }
            ((hk) (var7.field_u)).a((byte) 70, var7, this);
            oh.field_b = null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("jk.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static Object a(boolean param0, byte[] param1, byte param2) {
        jc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_4_0 = null;
        jc stackIn_7_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -120) {
            field_K = (String[]) null;
          }
          if (param1 == null) {
            stackIn_4_0 = null;
            return stackIn_4_0;
          }
          if (param1.length > 136) {
            var3 = new jc();
            ((bh) ((Object) var3)).a(param1, (byte) -125);
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          if (!param0) {
            stackIn_12_0 = (byte[]) (param1);
            return stackIn_12_0;
          }
          stackIn_10_0 = qd.a((byte) 111, param1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("jk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_H = null;
        field_K = null;
        field_I = null;
        field_L = null;
        if (param0 != 7624) {
          field_H = (he[]) null;
        }
    }

    final static void a(int param0, String param1) {
        try {
          jk.b((byte) 71, param1);
          nc.a(j.field_Y, false, (byte) 92);
          if (param0 != 1) {
            jk.j(-66);
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "jk.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private jk(int param0, int param1, int param2, int param3, cg param4, fd param5, vg param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_z = param6;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "jk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, boolean param1, int param2) {
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_69_2 = null;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        String stackIn_76_2 = null;
        String stackIn_89_0 = null;
        boolean stackIn_90_1 = false;
        int stackIn_113_0 = 0;
        int stackIn_114_1 = 0;
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
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          re.field_g = param2;
          sh.field_e = true;
          if (re.field_g == 0) {
            var3_int = ab.a(ol.field_h, kc.field_j, pj.field_A, uj.field_i, param0 + 14025);
            var4 = 3 + var3_int;
            lg.field_a = new int[var4];
            sg.field_f = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              lg.field_a[var5] = -1;
            }
            mi.field_g = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              sg.field_f[var5] = pj.field_A[var5];
            }
            sg.field_f[-3 + var4] = "";
            sg.field_f[var4 - 2] = qa.field_N;
            lg.field_a[var4 - 2] = 0;
            mi.field_g[0] = 4;
            sg.field_f[-1 + var4] = ei.field_h;
            lg.field_a[-1 + var4] = 1;
            mi.field_g[1] = 5;
          } else if (re.field_g == 1) {
            var3_int = ab.a(ol.field_h, kc.field_j, pj.field_A, uj.field_i, param0 ^ 14027);
            var4 = var3_int + 2;
            lg.field_a = new int[var4];
            sg.field_f = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              lg.field_a[var5] = -1;
            }
            mi.field_g = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              sg.field_f[var5] = pj.field_A[var5];
            }
            sg.field_f[var4 - 2] = "";
            sg.field_f[var4 - 1] = ei.field_h;
            lg.field_a[-1 + var4] = 0;
            mi.field_g[0] = 5;
          } else if (2 != re.field_g) {
            if (re.field_g == 3) {
              if (sb.field_d.field_o) {
                var3_int = ab.a(ol.field_h, rc.field_h, pj.field_A, uj.field_i, 14074);
              } else {
                var3_int = ab.a(ol.field_h, of.field_u, pj.field_A, uj.field_i, 14074);
              }
              var4 = var3_int + 2;
              sg.field_f = new String[var4];
              lg.field_a = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                lg.field_a[var5] = -1;
              }
              mi.field_g = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                sg.field_f[var5] = pj.field_A[var5];
              }
              sg.field_f[-2 + var4] = "";
              sg.field_f[var4 - 1] = ei.field_h;
              lg.field_a[-1 + var4] = 0;
              mi.field_g[0] = 5;
            } else if (4 == re.field_g) {
              var3_int = ab.a(ol.field_h, o.field_f, pj.field_A, uj.field_i, 14074);
              var4 = var3_int + 2;
              sg.field_f = new String[var4];
              lg.field_a = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                lg.field_a[var5] = -1;
              }
              mi.field_g = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                sg.field_f[var5] = pj.field_A[var5];
              }
              sg.field_f[-2 + var4] = "";
              sg.field_f[var4 - 1] = ei.field_h;
              lg.field_a[var4 - 1] = 0;
              mi.field_g[0] = 5;
            } else {
              if (re.field_g != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = ab.a(ol.field_h, de.field_z, pj.field_A, uj.field_i, 14074);
              var4 = var3_int + 3;
              lg.field_a = new int[var4];
              sg.field_f = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                lg.field_a[var5] = -1;
              }
              mi.field_g = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                sg.field_f[var5] = pj.field_A[var5];
              }
              sg.field_f[var4 - 3] = "";
              sg.field_f[var4 - 2] = hi.field_h;
              lg.field_a[-2 + var4] = 0;
              mi.field_g[0] = 3;
              sg.field_f[var4 - 1] = ei.field_h;
              lg.field_a[var4 - 1] = 1;
              mi.field_g[1] = 5;
            }
          } else {
            var3_int = ab.a(ol.field_h, a.a(5044, mk.field_b, new String[]{"<br><%0><br>"}), pj.field_A, uj.field_i, param0 + 14025);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(pj.field_A[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            lk.field_i = new String[var4];
            kg.a(pj.field_A, 0, lk.field_i, 0, var4);
            wg.field_h = new String[var3_int + (-var4 - 1)];
            kg.a(pj.field_A, var4 + 1, wg.field_h, 0, var3_int - var4 - 1);
            var4 = -1;
            var3_int = ab.a(ol.field_h, a.a(5044, dl.field_I, new String[]{"<br><%0><br>"}), pj.field_A, uj.field_i, 14074);
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(pj.field_A[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ng.field_d = new String[var4];
            kg.a(pj.field_A, 0, ng.field_d, 0, var4);
            ga.field_i = new String[var3_int - var4 - 1];
            kg.a(pj.field_A, var4 + 1, ga.field_i, 0, -var4 + var3_int - 1);
            if (lk.field_i.length >= ng.field_d.length) {
              stackIn_58_0 = lk.field_i.length;
            } else {
              stackIn_58_0 = ng.field_d.length;
            }
            var5 = stackIn_58_0;
            if (wg.field_h.length >= ga.field_i.length) {
              stackIn_61_0 = wg.field_h.length;
            } else {
              stackIn_61_0 = ga.field_i.length;
            }
            var6 = stackIn_61_0;
            var7 = var6 + 7 + var5;
            lg.field_a = new int[var7];
            sg.field_f = new String[var7];
            for (var8 = 0; var7 > var8; var8++) {
              lg.field_a[var8] = -1;
            }
            sg.field_f[0] = na.field_d;
            mi.field_g = new int[2];
            lg.field_a[1] = 0;
            sg.field_f[1] = wk.field_h;
            sg.field_f[4] = sl.field_B;
            sg.field_f[2] = ph.field_d;
            lg.field_a[3] = 1;
            sg.field_f[3] = ff.field_K;
            mi.field_g[0] = 5;
            mi.field_g[1] = 2;
            sg.field_f[5] = "";
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_68_0 = sg.field_f;
              stackIn_68_1 = 6 + var8Lifetime2;
              if (0 > -var5 + (var8Lifetime2 + ng.field_d.length)) {
                stackIn_69_2 = "";
              } else {
                stackIn_69_2 = ng.field_d[ng.field_d.length + (var8Lifetime2 - var5)];
              }
              stackIn_68_0[stackIn_68_1] = stackIn_69_2;
            }
            sg.field_f[var5 + 6] = null;
            lg.field_a[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_73_0 = sg.field_f;
              stackIn_73_1 = var5 + 7 + var8Lifetime3;
              stackIn_73_2 = ga.field_i.length;
              stackIn_73_3 = var8Lifetime3;
              if (stackIn_73_2 > stackIn_73_3) {
                stackIn_76_2 = ga.field_i[var8Lifetime3];
              } else {
                stackIn_76_2 = "";
              }
              stackIn_73_0[stackIn_73_1] = stackIn_76_2;
            }
            aa.field_d = la.a(false);
          }
          wg.field_k.field_e = mi.field_g.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < sg.field_f.length; var4Lifetime1++) {
            stackIn_89_0 = sg.field_f[var4Lifetime1];
            stackIn_90_1 = !(lg.field_a[var4Lifetime1] < 0);
            var5Lifetime1 = u.a(stackIn_89_0, stackIn_90_1, true);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (re.field_g == 2) {
            var10 = lk.field_i;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = u.a(var11, false, true);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = wg.field_h;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = u.a(var12, false, true);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          li.field_k = -(var3_intLifetime1 >> 1) + var3_intLifetime1 + ji.field_f;
          si.field_B = ji.field_f - (var3_intLifetime1 >> 1);
          vi.field_e = wg.field_k.field_e * (ig.field_h + wa.field_N << 1);
          for (var4Lifetime2 = 0; var4Lifetime2 < sg.field_f.length; var4Lifetime2++) {
            stackIn_113_0 = vi.field_e;
            if (0 > lg.field_a[var4Lifetime2]) {
              stackIn_114_1 = s.field_g;
            } else {
              stackIn_114_1 = ni.field_p;
            }
            vi.field_e = stackIn_113_0 + stackIn_114_1;
          }
          jd.field_N = sa.field_f - (vi.field_e >> 1);
          if (param0 != 49) {
            return;
          }
          cj.field_f = new int[sg.field_f.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = jd.field_N;
          while (var4Lifetime3 < sg.field_f.length) {
            var6Lifetime1 = lg.field_a[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = u.a(sg.field_f[var4Lifetime3], true, true);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + ji.field_f;
              var5Lifetime3 = var5Lifetime3 + ig.field_h;
              cj.field_f[var4Lifetime3] = new int[4];
              cj.field_f[var4Lifetime3][0] = -dg.field_d + var8Lifetime1;
              cj.field_f[var4Lifetime3][1] = var5Lifetime3;
              cj.field_f[var4Lifetime3][2] = var7Lifetime2 + (dg.field_d << 1);
              var5Lifetime3 = var5Lifetime3 + (ni.field_p + (wa.field_N << 1) + ig.field_h);
              cj.field_f[var4Lifetime3][3] = (wa.field_N << 1) + ni.field_p;
            } else {
              var5Lifetime3 = var5Lifetime3 + s.field_g;
            }
            var4Lifetime3++;
          }
          if (re.field_g == 2) {
            wg.field_k.a(-1, -1, param1, 49);
          } else {
            wg.field_k.a(0, qg.a(ob.field_g, (byte) -112, ck.field_c), param1, 63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "jk.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, String param1, long param2, java.applet.Applet param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              if (param0 != 0) {
                field_J = -113;
              }
              var8 = param3.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param4 + "=" + param1 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param2 >= 0L) {
                var7Lifetime4 = var9 + "; Expires=" + bf.a(param2 * 1000L + la.a(false), (byte) -29) + "; Max-Age=" + param2;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              pb.a(true, "document.cookie=\"" + var7Lifetime4 + "\"", param3);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("jk.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void b(byte param0, String param1) {
        try {
          int var2_int = -65 % ((-30 - param0) / 62);
          cj.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "jk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = new String[]{"Destroy at least 15 death gliders", "Destroy at least 15 assault bots", "Destroy at least 15 tanks", "Destroy at least 15 barracks", "Complete at least one stage without firing any weapons", "Receive no damage in at least one stage", "Lose no lives in at least one stage", "Collect all powerups in at least one stage", "Collect no powerups in at least one stage", "Destroy all enemies in at least one stage", "Complete Earth levels", "Complete Space levels", "Complete Alien levels", "Destroy no human structures in at least one stage", "Complete the game on Hard"};
    }
}
