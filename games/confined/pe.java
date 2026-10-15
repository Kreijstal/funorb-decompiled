/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends rk {
    static va field_p;
    static volatile int field_n;
    static bi field_o;
    static int field_q;
    static int field_m;

    final static void a(ok param0, sd param1, String param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Confined.field_J ? 1 : 0;
        try {
          if (param4 != 3694) {
            field_o = (bi) null;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; param2.length() > var7; var7++) {
            var8 = param2.charAt(var7);
            if (var8 == 60) {
              var6 = param1.field_e[0] + ((var5_int >> 8) + param0.c(param2.substring(0, var7)));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + param3;
              }
              param1.field_e[var7] = param1.field_e[0] + (var5_int >> 8) + (param0.c(param2.substring(0, var7 + 1)) - param0.a((char) var8));
            } else {
              param1.field_e[var7] = var6;
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("pe.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              if (param0 > -47) {
                pe.b(106);
              }
              param1.getAppletContext().showDocument(pn.a(var2, (byte) -33, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("pe.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 <= 24) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          pe.a((java.applet.Applet) null, (byte) -46);
        }
        field_o = null;
        field_p = null;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          ci.a(param0, "", -81);
          me.a((byte) 74, param0);
          if (param1 != 11) {
            field_o = (bi) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pe.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private pe() throws Throwable {
        throw new Error();
    }

    final static boolean a(int[] param0, int param1) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        hc var4_ref_hc = null;
        int var4 = 0;
        hc var5 = null;
        int var7 = 0;
        var7 = Confined.field_J ? 1 : 0;
        try {
          if (param1 >= -63) {
            field_o = (bi) null;
          }
          if (wd.field_f != lk.field_d) {
            return false;
          }
          var2_long = ri.a(-3);
          if (tk.field_b != 0 &&
            tg.field_S < 0) {
            var4_ref_hc = (hc) (qh.field_w.a(-121));
            if (var4_ref_hc != null &&
              var4_ref_hc.field_r < var2_long) {
              var4_ref_hc.a(true);
              ai.field_i = var4_ref_hc.field_q.length;
              e.field_c.field_n = 0;
              for (var5_int = 0; var5_int < ai.field_i; var5_int++) {
                e.field_c.field_m[var5_int] = var4_ref_hc.field_q[var5_int];
              }
              kk.field_c = pk.field_c;
              pk.field_c = qm.field_y;
              qm.field_y = Confined.field_F;
              Confined.field_F = var4_ref_hc.field_o;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("pe.D(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
        stackIn_18_0 = tg.field_S;
        try {
          while (true) {
            if (stackIn_18_0 < 0) {
              e.field_c.field_n = 0;
              if (!jj.a(1, (byte) -113)) {
                return false;
              }
              tg.field_S = e.field_c.h(-1);
              e.field_c.field_n = 0;
              ai.field_i = param0[tg.field_S];
            }
            if (!jc.a(-111)) {
              return false;
            }
            if (tk.field_b == 0) {
              kk.field_c = pk.field_c;
              pk.field_c = qm.field_y;
              qm.field_y = Confined.field_F;
              Confined.field_F = tg.field_S;
              tg.field_S = -1;
              return true;
            }
            var4 = tk.field_b;
            if (0.0 != gl.field_i) {
              var4 = (int)((double)var4 + hj.field_h.nextGaussian() * gl.field_i);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new hc((long)var4 + var2_long, tg.field_S, new byte[ai.field_i]);
            for (var6 = 0; var6 < ai.field_i; var6++) {
              var5.field_q[var6] = e.field_c.field_m[var6];
            }
            qh.field_w.a((rk) (var5), (byte) -93);
            tg.field_S = -1;
            stackIn_18_0 = tg.field_S;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("pe.D(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_n = 0;
        field_p = new va();
    }
}
