/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    static km field_d;
    static String[] field_b;
    static String field_g;
    static String field_f;
    static p field_a;
    static int field_c;
    static km field_e;

    final static boolean a(int param0, int param1, byte param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        int var5;
        String var5_ref_String;
        int var6;
        String var8;
        String var9;
        int var10;
        int var11;
        int var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        String var36;
        String var37;
        String var38;
        String var39;
        String var40;
        String var41;
        Object var42;
        CharSequence var43;
        int var6Lifetime1;
        String var8Lifetime1;
        String var8Lifetime2;
        String var8Lifetime3;
        String var8Lifetime4;
        String var8Lifetime5;
        String var8Lifetime6;
        String var8Lifetime7;
        String var8Lifetime8;
        var42 = null;
        var12 = Virogrid.field_F ? 1 : 0;
        var3 = 1;
        if (!uf.field_i &&
          null == qc.field_i) {
          var3 = 0;
        }
        if (sd.field_e == 0 &&
          null != la.field_h) {
          var3 = 0;
        }
        if (sd.field_e == 2 &&
          !ub.g(68)) {
          var3 = 0;
        }
        var4 = -34 % ((param2 - 59) / 55);
        if (um.field_Gb == 84) {
          if (var3 != 0) {
            if (0 < oi.field_h.length()) {
              var5_ref_String = oi.field_h.toString();
              var8 = var5_ref_String;
              var8Lifetime8 = var5_ref_String;
              if (jf.a(-96, var5_ref_String)) {
                var14 = (String) null;
                var13 = (String) null;
                gf.a((String) null, 0, false, am.field_d, 2, (String) null);
                var16 = (String) null;
                var15 = (String) null;
                gf.a((String) null, 0, false, rl.field_q, 2, (String) null);
                re.c((byte) 121);
                return true;
              }
              var6 = sd.field_e;
              if (var6 == 0 &&
                null != wl.field_d) {
                var6 = 1;
              }
              if (id.a(var6, (byte) 123) == 2) {
                sd.a(1, param1, var6, (byte) 97);
              }
              jl.a(-1, sd.field_e, va.field_d, param0, (byte) 39, var5_ref_String);
              re.c((byte) 121);
              return true;
            }
          } else {
            if (sd.field_e == 0) {
              return true;
            }
          }
          re.c((byte) 121);
          return true;
        }
        if (um.field_Gb == 85) {
          if (var3 == 0) {
            return true;
          }
          if (oi.field_h.length() <= 0) {
            return true;
          }
          gi.a(oi.field_h, -18340, -1 + oi.field_h.length(), ' ');
          return true;
        }
        var5 = nm.field_d;
        if (!ig.a((byte) -126, (char) var5)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (80 <= oi.field_h.length()) {
          return true;
        }
        discarded$0 = oi.field_h.append((char) var5);
        var6Lifetime1 = 485;
        var18 = mi.field_d;
        var8Lifetime1 = var18;
        var8Lifetime2 = var18;
        var17 = jb.a(124, var18);
        var8Lifetime3 = var17;
        var8Lifetime4 = var17;
        var20 = var17;
        var8Lifetime5 = var20;
        var8Lifetime6 = var20;
        if (sd.field_e != 2) {
          var8Lifetime7 = "";
          if (sd.field_e == 0) {
            if (null == wl.field_d &&
              ch.field_e) {
              var8Lifetime7 = "[" + fj.field_a + "] ";
            }
            if (wl.field_d == null) {
              var36 = var8Lifetime7 + var20 + ": ";
              var6Lifetime1 = var6Lifetime1 - hk.field_Ob.a(var36);
              if (hk.field_Ob.a(oi.field_h.toString()) > var6Lifetime1) {
                gi.a(oi.field_h, -18340, oi.field_h.length() - 1, ' ');
              }
              return true;
            }
            if (!bf.field_t) {
              var39 = "[" + oi.a(new String[]{wl.field_d.field_Qb}, ra.field_c, 2) + "] ";
              var40 = var39 + var20 + ": ";
              var6Lifetime1 = var6Lifetime1 - hk.field_Ob.a(var40);
              if (hk.field_Ob.a(oi.field_h.toString()) > var6Lifetime1) {
                gi.a(oi.field_h, -18340, oi.field_h.length() - 1, ' ');
              }
              return true;
            }
            if (null == tl.field_e) {
              var37 = "[" + oi.a(new String[]{wl.field_d.field_Qb}, ra.field_c, 2) + "] ";
              var38 = var37 + var20 + ": ";
              var6Lifetime1 = var6Lifetime1 - hk.field_Ob.a(var38);
              if (hk.field_Ob.a(oi.field_h.toString()) > var6Lifetime1) {
                gi.a(oi.field_h, -18340, oi.field_h.length() - 1, ' ');
              }
              return true;
            }
            var8Lifetime7 = "[" + tl.field_e + "] ";
          }
          var41 = var8Lifetime7 + var20 + ": ";
          var6Lifetime1 = var6Lifetime1 - hk.field_Ob.a(var41);
        } else {
          var43 = (CharSequence) ((Object) va.field_d);
          var19 = oi.a(new String[]{ji.a(11, var43)}, lm.field_c, 2);
          var8Lifetime7 = var19;
          var8Lifetime7 = var19;
          var9 = oi.a(new String[]{var17}, mf.field_d, 2);
          var8Lifetime7 = var9;
          var8Lifetime7 = var9;
          var10 = hk.field_Ob.a(var19);
          var11 = hk.field_Ob.a(var9);
          if (var10 <= var11) {
            var6Lifetime1 = var6Lifetime1 - var11;
          } else {
            var6Lifetime1 = var6Lifetime1 - var10;
          }
        }
        if (hk.field_Ob.a(oi.field_h.toString()) <= var6Lifetime1) {
          return true;
        }
        gi.a(oi.field_h, -18340, oi.field_h.length() - 1, ' ');
        return true;
    }

    public static void b(byte param0) {
        field_d = null;
        field_b = null;
        field_e = null;
        field_f = null;
        int var1 = -60 / ((30 - param0) / 54);
        field_a = null;
        field_g = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        lk var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          la.field_h = null;
          ld.field_c = false;
          wl.field_d = null;
          if (ci.field_o != null) {
            ci.field_o.a(false);
            ci.field_o = null;
          }
          ti.field_i = null;
          if (null != te.field_f) {
            te.field_f.a(false);
            te.field_f = null;
          }
          ma.field_c = null;
          if (qm.field_Mb != null) {
            qm.field_Mb.a(false);
            qm.field_Mb = null;
          }
          ah.field_h = null;
          if (ti.field_i != null) {
            var3 = (lk) (ti.field_i.a(true));
            while (var3 != null) {
              var3.c(40);
              var3 = (lk) (ti.field_i.b(-1));
            }
            ti.field_i = null;
          }
          if (param0 >= -30) {
            field_a = (p) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "fn.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          pa.field_l = rg.field_d;
          if (param0 == 255) {
            stackIn_9_0 = -32;
            stackIn_10_1 = !(13 <= nf.field_d);
            vb.field_c = Virogrid.$cfr$intArgs$b$d65aded092bd(stackIn_9_0, stackIn_10_1);
          } else {
            if (param0 >= 100 &&
              param0 <= 105) {
              vb.field_c = md.a(param2, 7655);
            } else {
              vb.field_c = lc.a(param0, param3, param1 ^ 29532);
            }
          }
          if (param1 != 105) {
            fn.a((byte) 118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("fn.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        hg var2 = null;
        if (param1) {
          var2 = gk.field_g;
          var2.g(param0, 8);
          var2.a(1, -91);
          var2.a(2, -96);
          return;
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != -69) {
            field_e = (km) null;
          }
          for (var1_int = 0; qh.field_K > var1_int; var1_int++) {
            el.field_s[var1_int] = null;
          }
          qh.field_K = 0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "fn.F(" + param0 + ')');
        }
    }

    static {
        field_f = "Play the game without logging in just yet";
        field_g = "2D - Fastest";
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_a = new p();
    }
}
