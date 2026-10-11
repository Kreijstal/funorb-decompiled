/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends am {
    int field_j;
    int field_i;
    static byte[] field_h;
    static String field_m;
    static boolean[] field_k;
    static String field_n;
    static bd field_l;

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          try {
            vh.field_c = param0;
            try {
              var3 = param1.getParameter("cookieprefix");
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = param1.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              if (param2 <= 47) {
                return;
              }
              var5Lifetime4 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (param0.length() == 0) {
                var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              a.a(param1, 17467, "document.cookie=\"" + var5Lifetime4 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            e.a(23148, param1);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var3_ref2;
            stackIn_12_1 = new StringBuilder().append("qj.D(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static fa a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        fa[] var3 = null;
        int var4 = 0;
        fa var5 = null;
        int var6 = 0;
        fa stackIn_3_0 = null;
        fa stackIn_10_0 = null;
        fa stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2 = ae.a(param0, "jagex-last-login-method", 0);
          if (var2 == null) {
            stackIn_3_0 = w.field_S;
            return stackIn_3_0;
          }
          var3 = pe.p(274);
          if (param1 > -29) {
            field_l = (bd) null;
          }
          var4 = 0;
          while (true) {
            if (var4 >= var3.length) {
              stackIn_13_0 = w.field_S;
              return stackIn_13_0;
            }
            var5 = var3[var4];
            if (!var5.a(0, var2)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_10_0 = var5;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_16_0 = var2_ref;
          stackIn_16_1 = new StringBuilder().append("qj.F(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        jd var4 = null;
        ic var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4 = (jd) (ib.field_a.g(-48));
          while (var4 != null) {
            ea.a(var4, param1, 70);
            var4 = (jd) (ib.field_a.a(12684));
          }
          if (param0 != -21) {
            field_k = (boolean[]) null;
          }
          var5 = (ic) (ch.field_p.g(-41));
          while (var5 != null) {
            rl.a(param1, var5, 746037954);
            var5 = (ic) (ch.field_p.a(12684));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "qj.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static fn a(gb param0, gb param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        java.applet.Applet var6 = null;
        Object stackIn_4_0 = null;
        fn stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1) {
            var6 = (java.applet.Applet) null;
            qj.a((java.applet.Applet) null, (byte) 22);
          }
          if (rl.a(2884, param1, param4, param3)) {
            stackIn_6_0 = th.a(-5427, param0.a(false, param3, param4));
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (fn) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("qj.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(vi param0, byte param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          hf.field_a = param0.e(8) << 5;
          var2_int = param0.l(32270);
          sm.field_g = (7 & var2_int) << 18;
          hf.field_a = hf.field_a + (var2_int >> 3);
          sm.field_g = sm.field_g + (param0.e(8) << 2);
          var2_intLifetime1 = param0.l(32270);
          sm.field_g = sm.field_g + (var2_intLifetime1 >> 6);
          jn.field_J = var2_intLifetime1 << 15 & 2064384;
          jn.field_J = jn.field_J + (param0.l(32270) << 7);
          if (param1 != -12) {
            vi var3 = (vi) null;
            qj.a((vi) null, (byte) -75);
          }
          var2_intLifetime2 = param0.l(32270);
          jn.field_J = jn.field_J + (var2_intLifetime2 >> 1);
          s.field_e = (var2_intLifetime2 & 1) << 16;
          s.field_e = s.field_e + param0.e(8);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "qj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != -13206) {
          return;
        }
        field_k = null;
        field_l = null;
        field_h = null;
        field_m = null;
    }

    final static void a(int param0, int param1, oc param2, oc param3) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        oj var5 = null;
        oc var6 = null;
        oj var7 = null;
        oc var8 = null;
        og var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          var4_int = ln.field_a.field_d;
          var5 = mm.field_m[0];
          var6 = var5.field_j;
          var7 = mm.field_m[param1];
          var8 = var7.field_j;
          var9 = var7.field_l;
          if (param0 > -87) {
            field_m = (String) null;
          }
          var10 = var8.b(-4);
          stackIn_5_0 = (wb.field_R > 0) ? 0 : 1;
          var11 = stackIn_5_0;
          if (var11 != 0) {
            stackIn_11_0 = (cm.field_c[var10] > 0) ? 1 : 0;
          } else {
            stackIn_11_0 = 0;
          }
          var12 = stackIn_11_0;
          var15 = var7.a(3, var12 != 0);
          var16 = var7.field_E;
          var14 = (int)(24.0 * (-var9.field_a + ((double)(-var8.field_g) + (var5.field_l.field_a + (double)var6.field_g))));
          var17 = var7.field_r;
          var13 = (int)(24.0 * ((double)var6.field_e + var5.field_l.field_f - (double)var8.field_e - var9.field_f));
          if (1 == ue.field_d) {
            return;
          }
          if (ul.field_L > -1 &&
            10 > ul.field_L) {
            return;
          }
          if (var7.field_i == 27) {
            if (0 >= var7.field_I) {
              var7.field_I = 0;
              if (var7.field_s) {
                tk.a(1, jc.field_c, 27, true);
              }
              var7.field_s = false;
            } else {
              if (var7.field_x == var7.field_I) {
                var7.field_s = true;
              }
            }
            if (!var7.field_s) {
              var17 = var17 * 8;
              var7.field_I = var7.field_I + 1;
            }
            if (var7.field_L > 0) {
              var7.field_I = var7.field_x;
              var7.field_L = var7.field_L - 1;
            }
          }
          if (1 == bm.field_c &&
            -1 == rl.field_c) {
            return;
          }
          ei.a(var17, var16, var8, var11 != 0, var9, param3, var15, 6, var12 != 0, var7, var4_int, var13, var10, 81, 8, var14, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_36_0 = var4;
          stackIn_36_1 = new StringBuilder().append("qj.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final static fe a(int param0, String param1, int param2) {
        el var3 = null;
        RuntimeException var3_ref = null;
        el stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 27) {
            field_m = (String) null;
          }
          var3 = new el();
          ((fe) ((Object) var3)).field_b = param2;
          ((fe) ((Object) var3)).field_a = param1;
          stackIn_3_0 = var3;
          return (fe) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("qj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    private qj() throws Throwable {
        throw new Error();
    }

    static {
        field_m = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_n = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
