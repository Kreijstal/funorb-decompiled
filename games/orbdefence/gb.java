/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static int field_b;
    static int field_d;
    static String field_e;
    private int field_a;
    private qe field_c;
    static String field_h;
    static String[] field_g;
    private ek field_i;
    private int field_f;

    private final void a(nf param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 0) {
            field_g = (String[]) null;
          }
          if (param0 != null) {
            param0.b(57);
            param0.c(-1);
            this.field_f = this.field_f + param0.field_m;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gb.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        nf var6 = null;
        lc var6_ref = null;
        int var7 = OrbDefence.field_D ? 1 : 0;
        try {
          if (this.field_a < param2) {
            throw new IllegalStateException();
          }
          this.a(2, param3);
          this.field_f = this.field_f - param2;
          while (this.field_f < 0) {
            var6 = (nf) (this.field_c.a(-39));
            this.a(var6, param0 ^ 0);
          }
          var6_ref = new lc(param1, param2);
          this.field_i.a(var6_ref, param0 - 124, param3);
          this.field_c.a(var6_ref, 21693);
          ((nf) ((Object) var6_ref)).field_h = (long)param0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "gb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final Object a(long param0, int param1) {
        lc var6 = null;
        nf var7 = (nf) (this.field_i.a(param0, param1 - 1));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.f(param1);
        if (var5 == null) {
          var7.b(57);
          var7.c(-1);
          this.field_f = this.field_f + var7.field_m;
          return null;
        }
        if (var7.g(param1 ^ 9)) {
          var6 = new lc(var5, var7.field_m);
          this.field_i.a(var6, -128, var7.field_d);
          this.field_c.a(var6, 21693);
          ((nf) ((Object) var6)).field_h = 0L;
          var7.b(57);
          var7.c(-1);
        } else {
          this.field_c.a(var7, 21693);
          var7.field_h = 0L;
        }
        return var5;
    }

    private final void a(int param0, long param1) {
        nf var4 = (nf) (this.field_i.a(param1, -1));
        if (param0 != 2) {
          this.field_c = (qe) null;
        }
        this.a(var4, 0);
    }

    public static void a(int param0) {
        field_g = null;
        field_h = null;
        if (param0 != 2867) {
          gb.b(-52);
        }
        field_e = null;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        boolean stackIn_4_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        String[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        String stackIn_44_2 = null;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        String stackIn_51_2 = null;
        boolean stackIn_93_0 = false;
        int stackIn_116_0 = 0;
        int stackIn_117_1 = 0;
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
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          kg.field_m = param1;
          stackIn_4_0 = param0;
          pc.field_db = stackIn_4_0;
          if (kg.field_m == 0) {
            var3_int = th.a(jd.field_a, ta.field_y, li.field_c, vi.field_I, -60);
            var4 = var3_int + 3;
            ea.field_d = new String[var4];
            dd.field_B = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              dd.field_B[var5] = -1;
            }
            gg.field_O = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              ea.field_d[var5] = li.field_c[var5];
            }
            ea.field_d[-3 + var4] = "";
            ea.field_d[-2 + var4] = p.field_f;
            dd.field_B[-2 + var4] = 0;
            gg.field_O[0] = 4;
            ea.field_d[-1 + var4] = th.field_d;
            dd.field_B[var4 - 1] = 1;
            gg.field_O[1] = 5;
          } else if (kg.field_m == 1) {
            var3_int = th.a(jd.field_a, ta.field_y, li.field_c, vi.field_I, -77);
            var4 = var3_int + 2;
            ea.field_d = new String[var4];
            dd.field_B = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              dd.field_B[var5] = -1;
            }
            gg.field_O = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              ea.field_d[var5] = li.field_c[var5];
            }
            ea.field_d[-2 + var4] = "";
            ea.field_d[var4 - 1] = th.field_d;
            dd.field_B[-1 + var4] = 0;
            gg.field_O[0] = 5;
          } else if (kg.field_m != 2) {
            if (3 == kg.field_m) {
              if (wc.field_c.field_q) {
                var3_int = th.a(jd.field_a, am.field_c, li.field_c, vi.field_I, -62);
              } else {
                var3_int = th.a(jd.field_a, dg.field_C, li.field_c, vi.field_I, -98);
              }
              var4 = 2 + var3_int;
              ea.field_d = new String[var4];
              dd.field_B = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                dd.field_B[var5] = -1;
              }
              gg.field_O = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                ea.field_d[var5] = li.field_c[var5];
              }
              ea.field_d[var4 - 2] = "";
              ea.field_d[var4 - 1] = th.field_d;
              dd.field_B[-1 + var4] = 0;
              gg.field_O[0] = 5;
            } else if (4 == kg.field_m) {
              var3_int = th.a(jd.field_a, fi.field_a, li.field_c, vi.field_I, -89);
              var4 = var3_int + 2;
              ea.field_d = new String[var4];
              dd.field_B = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                dd.field_B[var5] = -1;
              }
              gg.field_O = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                ea.field_d[var5] = li.field_c[var5];
              }
              ea.field_d[-2 + var4] = "";
              ea.field_d[-1 + var4] = th.field_d;
              dd.field_B[var4 - 1] = 0;
              gg.field_O[0] = 5;
            } else {
              if (kg.field_m != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = th.a(jd.field_a, lh.field_a, li.field_c, vi.field_I, -52);
              var4 = var3_int + 3;
              dd.field_B = new int[var4];
              ea.field_d = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                dd.field_B[var5] = -1;
              }
              gg.field_O = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                ea.field_d[var5] = li.field_c[var5];
              }
              ea.field_d[var4 - 3] = "";
              ea.field_d[var4 - 2] = ge.field_o;
              dd.field_B[-2 + var4] = 0;
              gg.field_O[0] = 3;
              ea.field_d[var4 - 1] = th.field_d;
              dd.field_B[-1 + var4] = 1;
              gg.field_O[1] = 5;
            }
          } else {
            var3_int = th.a(jd.field_a, t.a(-415993727, new String[]{"<br><%0><br>"}, mc.field_f), li.field_c, vi.field_I, -105);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(li.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            pj.field_o = new String[var4];
            mk.a(li.field_c, 0, pj.field_o, 0, var4);
            bc.field_t = new String[var3_int - var4 - 1];
            mk.a(li.field_c, 1 + var4, bc.field_t, 0, var3_int + (-var4 - 1));
            var4 = -1;
            var3_int = th.a(jd.field_a, t.a(-415993727, new String[]{"<br><%0><br>"}, qk.field_c), li.field_c, vi.field_I, -108);
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(li.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            fd.field_e = new String[var4];
            mk.a(li.field_c, 0, fd.field_e, 0, var4);
            sj.field_u = new String[-1 + var3_int - var4];
            mk.a(li.field_c, var4 + 1, sj.field_u, 0, -1 + (-var4 + var3_int));
            if (fd.field_e.length <= pj.field_o.length) {
              stackIn_33_0 = pj.field_o.length;
            } else {
              stackIn_33_0 = fd.field_e.length;
            }
            var5 = stackIn_33_0;
            if (sj.field_u.length > bc.field_t.length) {
              stackIn_36_0 = sj.field_u.length;
            } else {
              stackIn_36_0 = bc.field_t.length;
            }
            var6 = stackIn_36_0;
            var7 = var6 + (var5 + 7);
            dd.field_B = new int[var7];
            ea.field_d = new String[var7];
            for (var8 = 0; var7 > var8; var8++) {
              dd.field_B[var8] = -1;
            }
            ea.field_d[0] = sa.field_g;
            dd.field_B[1] = 0;
            ea.field_d[1] = lc.field_s;
            gg.field_O = new int[2];
            ea.field_d[3] = mj.field_k;
            dd.field_B[3] = 1;
            ea.field_d[4] = te.field_J;
            ea.field_d[2] = ii.field_a;
            gg.field_O[1] = 2;
            gg.field_O[0] = 5;
            ea.field_d[5] = "";
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_43_0 = ea.field_d;
              stackIn_43_1 = var8Lifetime2 + 6;
              if (0 <= fd.field_e.length + (var8Lifetime2 - var5)) {
                stackIn_44_2 = fd.field_e[var8Lifetime2 + fd.field_e.length - var5];
              } else {
                stackIn_44_2 = "";
              }
              stackIn_43_0[stackIn_43_1] = stackIn_44_2;
            }
            ea.field_d[var5 + 6] = null;
            dd.field_B[6 + var5] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_48_0 = ea.field_d;
              stackIn_48_1 = 7 + var5 + var8Lifetime3;
              stackIn_48_2 = sj.field_u.length;
              stackIn_48_3 = var8Lifetime3;
              if (stackIn_48_2 > stackIn_48_3) {
                stackIn_51_2 = sj.field_u[var8Lifetime3];
              } else {
                stackIn_51_2 = "";
              }
              stackIn_48_0[stackIn_48_1] = stackIn_51_2;
            }
            am.field_a = ji.b(111);
          }
          ab.field_j.field_i = gg.field_O.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < ea.field_d.length; var4Lifetime1++) {
            stackIn_93_0 = !(dd.field_B[var4Lifetime1] < 0);
            var5Lifetime1 = hg.a(stackIn_93_0, ea.field_d[var4Lifetime1], 0);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (kg.field_m == 2) {
            var10 = pj.field_o;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = hg.a(false, var11, 0);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = bc.field_t;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = hg.a(false, var12, 0);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          ha.field_o = -(var3_intLifetime1 >> 1) + fd.field_c;
          lc.field_q = -(var3_intLifetime1 >> 1) + (fd.field_c + var3_intLifetime1);
          rf.field_C = (gg.field_N + ol.field_b << 1) * ab.field_j.field_i;
          for (var4Lifetime2 = 0; var4Lifetime2 < ea.field_d.length; var4Lifetime2++) {
            stackIn_116_0 = rf.field_C;
            if (dd.field_B[var4Lifetime2] >= 0) {
              stackIn_117_1 = el.field_D;
            } else {
              stackIn_117_1 = d.field_j;
            }
            rf.field_C = stackIn_116_0 + stackIn_117_1;
          }
          sd.field_h = sf.field_T - (rf.field_C >> 1);
          qd.field_d = new int[ea.field_d.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = sd.field_h;
          while (ea.field_d.length > var4Lifetime3) {
            var6Lifetime1 = dd.field_B[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + d.field_j;
            } else {
              var7Lifetime2 = hg.a(true, ea.field_d[var4Lifetime3], 0);
              var8Lifetime1 = fd.field_c - (var7Lifetime2 >> 1);
              var5Lifetime3 = var5Lifetime3 + gg.field_N;
              qd.field_d[var4Lifetime3] = new int[4];
              qd.field_d[var4Lifetime3][0] = var8Lifetime1 - mj.field_f;
              qd.field_d[var4Lifetime3][1] = var5Lifetime3;
              qd.field_d[var4Lifetime3][2] = var7Lifetime2 + (mj.field_f << 1);
              var5Lifetime3 = var5Lifetime3 + ((ol.field_b << 1) + gg.field_N + el.field_D);
              qd.field_d[var4Lifetime3][3] = el.field_D + (ol.field_b << 1);
            }
            var4Lifetime3++;
          }
          if (kg.field_m == 2) {
            ab.field_j.a(-1, -1, 0, param2);
          } else {
            ab.field_j.a(0, jc.a(ua.field_a, (byte) 71, vl.field_d), 0, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3), "gb.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(Object param0, byte param1, long param2) {
        try {
          this.a(0, param0, 1, param2);
          int var5_int = -24 % ((-26 - param1) / 63);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "gb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0) {
        field_h = cd.field_t.g(2);
        CharSequence var2 = (CharSequence) ((Object) field_h);
        sg.field_E = ua.a(-88, var2);
        if (param0 > -27) {
          gb.b(-121);
        }
    }

    private gb() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "WAVE";
        field_g = new String[]{"First Fight", "Pincer", "Breakout", "Dominion", "Gridlock", "Orb Central"};
    }
}
