/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends jd {
    static int[] field_j;
    static String field_k;
    private ga field_n;
    private ga field_o;
    static String field_m;
    static boolean field_l;

    private final boolean b(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_o.field_q.toLowerCase();
          if (param1 > -60) {
            return true;
          }
          var4 = param0.toLowerCase();
          if (0 < var3.length() &&
            0 < var4.length()) {
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0) {
              if (var3.length() - 1 <= var5) {
                return false;
              }
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (var4.indexOf(var6) < 0) {
                stackIn_14_0 = (0 <= var4.indexOf(var7));
                return stackIn_14_0;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("lo.H(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    lo(ga param0, ga param1, ga param2) {
        super(param0);
        try {
          this.field_n = param1;
          this.field_o = param2;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 != -96) {
          lo.a(32, -1, 38, -7, 52, false);
        }
        field_k = null;
        field_m = null;
        field_j = null;
    }

    final rv a(String param0, int param1) {
        boolean discarded$1 = false;
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        rv stackIn_5_0 = null;
        rv stackIn_9_0 = null;
        rv stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -5) {
            var5 = (String) null;
            discarded$1 = this.b((String) null, (byte) -69);
          }
          var3 = this.field_n.field_q.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_5_0 = jt.field_Bb;
            return stackIn_5_0;
          }
          if (!bi.a(var4, param1 - 32336, var3)) {
            stackIn_9_0 = jt.field_Bb;
            return stackIn_9_0;
          }
          if (!this.b(param0, (byte) -77)) {
            return he.field_yb;
          }
          stackIn_13_0 = jt.field_Bb;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("lo.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        boolean stackIn_11_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var8Lifetime1;
        var10 = Kickabout.field_G;
        try {
          if (gv.field_h == param2 &&
            param1 == jr.field_Kb &&
            wi.field_C == param3 &&
            param4 == gb.field_K &&
            rg.field_f == param5) {
            return;
          }
          gb.field_K = param4;
          gv.field_h = param2;
          wi.field_C = param3;
          stackIn_11_0 = param5;
          rg.field_f = stackIn_11_0;
          jr.field_Kb = param1;
          var6_int = (100 * jr.field_Kb >> 8) + 50;
          var7 = (116 * gv.field_h >> 8) + 40;
          iw.a(-68, wn.field_j);
          on.b();
          pt.a(var7, -22914, 0, on.field_f, 0);
          tn.field_e.a(0, 0, tn.field_e.field_o * var7 / 140, tn.field_e.field_v);
          ta.e(124);
          pt.a(on.field_g, -22914, var7, on.field_f, 0);
          tn.field_e.d(-140 + var7, 0);
          ta.e(param0 - 706856552);
          if (rg.field_f) {
            for (var8 = 0; on.field_a.length > var8; var8++) {
              on.field_a[var8] = (var6_int * on.field_a[var8] >> 8) * 65793;
            }
          } else {
            for (var8 = 0; var8 < on.field_a.length; var8++) {
              on.field_a[var8] = 16777215 - 257 * (var6_int * on.field_a[var8] >> 8);
            }
          }
          ta.e(121);
          iw.a(65, iw.field_g);
          on.b();
          var8Lifetime1 = uv.b(-gb.field_K, wi.field_C, (byte) 2);
          if (param0 != 706856675) {
            field_j = (int[]) null;
          }
          var9 = wn.field_j.field_o;
          sa.field_e = -(var9 * we.a(var8Lifetime1, false)) >> 17;
          lr.field_m = var9 * ei.a(var8Lifetime1, (byte) -23) >> 17;
          wn.field_j.a(wn.field_j.field_o << 3, wn.field_j.field_v << 3, on.field_g << 3, on.field_f << 3, var8Lifetime1 << 3, 4096);
          ta.e(118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var6), "lo.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param1.getParameter("username");
          if (param0 > -78) {
            lo.a(110, 93, 93);
          }
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (jc.a(var3, false) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("lo.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static he a(long param0, boolean param1) {
        if (param1) {
          field_j = (int[]) null;
        }
        return (he) (pq.field_N.a(-3611, param0));
    }

    final static void a(int param0, int param1, int param2, boolean param3, byte param4) {
        if (param4 != -55) {
          lo.a(124L, false);
        }
        int var5 = (int)(nj.a(-62) % 2000L * 100L) / 2000;
        var5 = (var5 + (param0 * 100 >> 16)) % 100;
        ut var6 = lt.field_c[var5];
        if (!param3) {
          var6.c(-(var6.field_o >> 1) + param1, -(var6.field_v >> 1) + param2);
        } else {
          var6.f(param1 - (var6.field_o >> 1), param2 - (var6.field_v >> 1));
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_n.field_q.toLowerCase();
          var4 = param1.toLowerCase();
          if (param0 != 25) {
            field_k = (String) null;
          }
          if (var4.length() == 0) {
            return null;
          }
          var5 = var4;
          if (lg.a(var5, (byte) 79)) {
            stackIn_8_0 = b.field_M;
            return stackIn_8_0;
          }
          if (hf.a(var5, -3)) {
            stackIn_11_0 = ua.field_h;
            return stackIn_11_0;
          }
          if (qe.a(true, var5)) {
            stackIn_15_0 = tq.field_D;
            return stackIn_15_0;
          }
          if (this.b(param1, (byte) -67)) {
            stackIn_18_0 = no.field_G;
            return stackIn_18_0;
          }
          if (0 >= var6.length()) {
            stackIn_32_0 = jq.field_c;
            return stackIn_32_0;
          }
          if (j.a((byte) 71, var6, var5)) {
            stackIn_22_0 = we.field_b;
            return stackIn_22_0;
          }
          if (uj.a(68, var5, var6)) {
            stackIn_26_0 = js.field_f;
            return stackIn_26_0;
          }
          if (!lj.a((byte) 69, var6, var5)) {
            return b.field_M;
          }
          stackIn_30_0 = we.field_b;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("lo.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Kickabout.field_G;
        uo var11 = pb.field_C;
        uo var3 = var11;
        int var9Lifetime1;
        if (param2 <= 44) {
          return;
        }
        try {
          var4 = Math.max(((hu) ((Object) var11)).a(ns.field_d[0]), Math.max(((hu) ((Object) var11)).a(ns.field_d[3]), ((hu) ((Object) var11)).a(ns.field_d[4]))) + 20;
          var5 = Math.max(((hu) ((Object) var11)).a(ns.field_d[1]), ((hu) ((Object) var11)).a(ns.field_d[2])) + 20;
          var6 = var5 + var5 + var4;
          var7 = -(var6 >> 1) + param1;
          var8 = -34 + param0;
          on.a(var7, var8, var4 + (var5 << 1), 69, 16777215, 30);
          on.h(var7 - 1, -1 + var8, 2 + (var4 + (var5 << 1)), 71, 16777215, 128);
          for (var9 = 1; var9 < 3; var9++) {
            on.c(var7 + 4, var8 + (var9 * 22 - 1), -10 + var6, 16777215, 100);
          }
          on.f(var7 + var4, 4 + var8, 59, 16777215, 100);
          on.f(var4 + var7 + var5, 4 + var8, 59, 16777215, 100);
          var9Lifetime1 = 22 + var8 - 4;
          ((hu) ((Object) var3)).c(ns.field_d[0], var7 - (-var4 + 5), var9Lifetime1, 16777215, 65793);
          ((hu) ((Object) var3)).d(ns.field_d[1], (var5 >> 1) + (var7 + var4), var9Lifetime1, 16777215, 65793);
          ((hu) ((Object) var3)).d(ns.field_d[2], (var5 >> 1) + (var5 + var7 + var4), var9Lifetime1, 16777215, 65793);
          var9Lifetime1 += 22;
          ((hu) ((Object) var3)).c(ns.field_d[3], -5 + var7 + var4, var9Lifetime1, 16777215, 65793);
          ((hu) ((Object) var3)).d("+30", (var5 >> 1) + (var4 + var7), var9Lifetime1, 16777215, 65793);
          ((hu) ((Object) var3)).d("+3", -2 + var7 + (var4 + (var5 + (var5 >> 1))), var9Lifetime1, 16777215, 65793);
          var9Lifetime1 += 22;
          ((hu) ((Object) var3)).c(ns.field_d[4], -5 + (var4 + var7), var9Lifetime1, 16777215, 65793);
          ((hu) ((Object) var3)).d("-10", (var5 >> 1) + (var4 + var7), var9Lifetime1, 16777215, 65793);
          ((hu) ((Object) var3)).d("0", -2 + (var4 + var7 - (-var5 - (var5 >> 1))), var9Lifetime1, 16777215, 65793);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lo.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static li a(li[] param0, boolean param1, tm[] param2, String param3) throws dw {
        int var5 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$0 = null;
        li stackIn_5_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder var7 = null;
        var6 = Kickabout.field_G;
        try {
          var4_int = 0;
          while (var4_int < param2.length) {
            if (!param2[var4_int].a(param0, 2, param3)) {
              var4_int++;
              continue;
            }
            stackIn_5_0 = param2[var4_int].a((byte) 84, param0);
            return stackIn_5_0;
          }
          var7 = new StringBuilder("The method " + param3 + "(");
          if (param1) {
            field_k = (String) null;
          }
          for (var5 = 0; param0.length > var5; var5++) {
            if (!param0[var5].field_b) {
              discarded$1 = var7.append(dr.a(-117, param0[var5].field_d.getClass()));
            } else {
              discarded$2 = var7.append(rm.a(param0[var5].field_d, (byte) 106).toString());
            }
            if (-1 + param0.length > var5) {
              discarded$3 = var7.append(',');
            }
          }
          discarded$0 = var7.append(") is undefined.");
          throw new dw(var7.toString());
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("lo.K(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_m = "Gamemodes";
        field_k = "There are no teams in this league";
    }
}
