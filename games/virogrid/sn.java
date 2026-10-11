/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends qe {
    static String field_n;
    static String field_p;
    private wa field_o;
    private wa field_q;

    final static int h(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 3938) {
            field_n = (String) null;
          }
          tm.field_l.a(dc.field_O, co.field_i, (byte) -127, true);
          tm.field_l.i(-89);
          while (nd.b((byte) -123)) {
            tm.field_l.a(um.field_Gb, nm.field_d, -98);
          }
          if (el.field_r != -1) {
            var1_int = el.field_r;
            kf.a(-1, -1);
            stackIn_8_0 = var1_int;
            return stackIn_8_0;
          }
          if (fe.field_Fb) {
            stackIn_11_0 = 3;
            return stackIn_11_0;
          }
          if (ao.field_Kb == cb.field_c) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!w.field_I.b(-97)) {
            stackIn_17_0 = 1;
            return stackIn_17_0;
          }
          if (ao.field_Kb != pa.field_l) {
            stackIn_22_0 = -1;
            return stackIn_22_0;
          }
          stackIn_20_0 = 2;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "sn.J(" + param0 + ')');
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -22274) {
            field_n = (String) null;
          }
          var3 = this.field_o.field_n.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (0 >= var4.length()) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (0 <= var5 &&
              var5 < var3.length() - 1) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("sn.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static mg a(eh param0, String param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        mg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            sn.c((byte) -70);
          }
          var4_int = param0.a(-1, param2);
          var5 = param0.a(-125, var4_int, param1);
          stackIn_3_0 = w.a(param0, -80, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("sn.F(");
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
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    sn(wa param0, wa param1, wa param2) {
        super(param0);
        try {
          this.field_o = param2;
          this.field_q = param1;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_q.field_n.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            return null;
          }
          var5 = var4;
          if (we.a((byte) 80, var5)) {
            stackIn_5_0 = nh.field_l;
            return stackIn_5_0;
          }
          if (jd.a(-685, var5)) {
            stackIn_9_0 = ve.field_z;
            return stackIn_9_0;
          }
          if (al.a(var5, param0 + 26484)) {
            stackIn_12_0 = vd.field_V;
            return stackIn_12_0;
          }
          if (this.b(-22274, param1)) {
            stackIn_16_0 = ib.field_a;
            return stackIn_16_0;
          }
          if (param0 != -26358) {
            var6 = (String) null;
            sn.a((eh) null, (String) null, (String) null, false);
          }
          if (var7.length() <= 0) {
            stackIn_21_0 = ne.field_f;
            return stackIn_21_0;
          }
          if (mj.a(var5, var7, (byte) 126)) {
            stackIn_25_0 = ec.field_A;
            return stackIn_25_0;
          }
          if (me.a(var5, var7, true)) {
            stackIn_28_0 = kn.field_G;
            return stackIn_28_0;
          }
          if (!w.a(var5, var7, false)) {
            stackIn_33_0 = nh.field_l;
            return stackIn_33_0;
          }
          stackIn_31_0 = ec.field_A;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("sn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int[] param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Virogrid.field_F ? 1 : 0;
        try {
          while (true) {
            param3--;
            if (param3 < 0) {
              break;
            }
            var17 = param7;
            var10 = var17;
            var11 = param6;
            var12 = param9;
            var13 = param4;
            var14 = param1;
            var15 = (16711422 & var17[var11]) >> 1;
            var10[var11] = var15 + (rb.a(33455969, var14) >> 17) - (-rb.a(16711680, var12 >> 1) - (rb.a(33423751, var13) >> 9));
            param4 = param4 + param0;
            param9 = param9 + param8;
            param1 = param1 + param2;
            param6++;
          }
          int var10_int = -53 % ((param5 + 14) / 62);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "sn.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void c(byte param0) {
        int var1 = -63 / ((-50 - param0) / 36);
        field_p = null;
        field_n = null;
    }

    final wl a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        wl stackIn_2_0 = null;
        wl stackIn_5_0 = null;
        wl stackIn_9_0 = null;
        wl stackIn_12_0 = null;
        wl stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_q.field_n.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            stackIn_2_0 = ee.field_c;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_5_0 = (wl) null;
            return stackIn_5_0;
          }
          if (!ql.a(-95, var3, var4)) {
            stackIn_9_0 = ee.field_c;
            return stackIn_9_0;
          }
          if (!this.b(-22274, param0)) {
            stackIn_14_0 = bm.field_i;
            return stackIn_14_0;
          }
          stackIn_12_0 = ee.field_c;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("sn.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_n = "The account name you use to access RuneScape and other Jagex.com games";
        field_p = "Pause Menu";
    }
}
