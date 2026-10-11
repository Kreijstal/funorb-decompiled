/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static bg field_e;
    static String field_b;
    static int field_c;
    static ea[] field_d;
    static String field_f;
    static String field_a;

    final static void a(boolean param0, wh param1, int param2, int param3, int param4) {
        if (param2 != -32532) {
          return;
        }
        try {
          nj.field_e.a(false, param1, !param0 ? true : false, 1000000, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "dl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String b(byte param0) {
        if (param0 > -8) {
          field_a = (String) null;
          return bi.a(sj.field_d, true);
        }
        return bi.a(sj.field_d, true);
    }

    final static String a(sb param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param0.b(true);
            if (var3_int > param1) {
              var3_int = param1;
            }
            var4 = new byte[var3_int];
            param0.field_o = param0.field_o + hf.field_q.a(param0.field_o, 0, var3_int, param0.field_u, var4, 256);
            var5 = ph.a((byte) 54, var3_int, var4, 0);
            if (param2 != -27898) {
              dl.b(48);
            }
            stackIn_5_0 = var5;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = "Cabbage";
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("dl.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static vm a(bj param0, int param1, int param2, byte param3, bj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        vm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!cn.a(param1, 258, param2, param4)) {
            stackIn_2_0 = null;
            return (vm) (stackIn_2_0);
          }
          var5_int = 1 / ((37 - param3) / 62);
          stackIn_4_0 = bh.a((byte) 104, param0.a(false, param2, param1));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("dl.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int b(int param0) {
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        wh var8 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          if (param0 > -69) {
            var8 = (wh) null;
            dl.a(false, (wh) null, -17, -116, -117);
          }
          var1_int = 0;
          var2 = 0;
          while (mm.b((byte) 102)) {
            pn.field_a.b((byte) 117);
            if (pn.field_a.b(true)) {
              var1_int = 1;
            }
            if (13 != lj.field_t) {
              continue;
            }
            var2 = 1;
          }
          pn.field_a.a(sj.a(nk.field_w, (byte) 126, gb.field_e), sj.a(wi.field_w, (byte) 124, m.field_e), -1);
          if (pn.field_a.b(true)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            pn.field_a.field_e >= 0) {
            var3 = wf.field_P[pn.field_a.field_e];
            if (var3 == 2) {
              om.a(-22126);
            } else if (var3 == 5) {
              om.a(-22126);
            }
          } else {
            if (var2 != 0 &&
              2 != ti.field_M) {
              om.a(-22126);
            }
          }
          if (var3 == 0 &&
            ti.field_M == 2) {
            var4 = -tl.field_o + sf.a((byte) -57);
            var6 = (int)((10999L - var4) / 1000L);
            if (var6 <= 0) {
              var3 = 2;
              qd.a(-63, true, 5);
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "dl.B(" + param0 + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.addMouseListener(lb.field_y);
          param0.addMouseMotionListener(lb.field_y);
          param0.addFocusListener(lb.field_y);
          if (param1 != 73) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "dl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 < 52) {
          field_a = (String) null;
          return gd.field_B;
        }
        return gd.field_B;
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        if (param0 != -118) {
          return;
        }
        field_b = null;
        field_e = null;
        field_d = null;
    }

    static {
        field_e = new bg(12, 0, 1, 0);
        field_b = "Ranking: Macho Miner";
        field_d = new ea[2];
        field_f = "Achieved";
        field_a = "Email address is unavailable";
    }
}
