/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf {
    static um field_d;
    static il field_j;
    static String field_k;
    static String[] field_e;
    static String field_g;
    int[] field_l;
    int field_c;
    static int[] field_f;
    static String field_a;
    java.awt.Image field_h;
    int field_b;
    static String field_i;
    static java.applet.Applet field_m;

    abstract void a(int param0, int param1, byte param2, java.awt.Component param3);

    final static void a(String param0, int param1) {
        try {
          rf.field_a = param0;
          kf.a(param1, -1);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "wf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_i = null;
        field_g = null;
        field_m = null;
        field_e = null;
        field_j = null;
        field_k = null;
        field_a = null;
        if (param0 != -28608) {
          return;
        }
        field_d = null;
    }

    final static boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        String var8;
        boolean stackIn_8_0 = false;
        if (!param3) {
          var8 = (String) null;
          wf.a((String) null, -15);
        }
        stackIn_8_0 = (param0 <= param1) && (param1 < param2 + param0) && (param4 <= param5) && (param6 + param4 > param5);
        return stackIn_8_0;
    }

    final static void a(int param0, e param1, int param2, e param3) {
        try {
          ti.field_g = param3;
          if (param2 != 0) {
            wf.a(83, 51, -93, false, 111, -102, -46);
          }
          j.field_h = param1;
          rf.field_b = param0;
          bj.a(df.field_e / 2, 23, df.field_f / 2);
          vb.a(param1.field_A, (byte) 90, param1.field_A + param1.field_G, param3.field_G + param3.field_A, param3.field_A);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "wf.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(byte param0, int param1, java.awt.Graphics param2, int param3);

    final static oj a(km param0, km param1, u param2, int param3, km param4) {
        int var14 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        oj stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        oj[] var11 = null;
        int var12 = 0;
        u var13_ref_u = null;
        int var13 = 0;
        int var15 = 0;
        th var16 = null;
        int var17 = 0;
        e var18 = null;
        int[] var19 = null;
        char[] var20 = null;
        int[] var21 = null;
        char[] var22 = null;
        int var12Lifetime1;
        var17 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 == null) {
            return null;
          }
          if (param2.field_x == null) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = param2.field_x.length;
          }
          var5_int = stackIn_7_0;
          if (null != param2.field_w) {
            stackIn_10_0 = param2.field_w.length;
          } else {
            stackIn_10_0 = 0;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          var22 = new char[var7];
          var20 = var22;
          var9 = var20;
          if (param3 != 49) {
            var18 = (e) null;
            wf.a(96, (e) null, -35, (e) null);
          }
          var21 = new int[var7];
          var19 = var21;
          var10 = var19;
          var11 = new oj[var7];
          if (null != param2.field_x) {
            for (var12 = 0; param2.field_x.length > var12; var12++) {
              var13_ref_u = dm.field_v.a(param2.field_x[var12], (byte) 61);
              var8[var12] = var13_ref_u.field_v;
              var9[var12] = param2.field_p[var12];
              var11[var12] = wf.a(param0, param1, var13_ref_u, 49, param4);
            }
          }
          if (param2.field_w != null) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; var14 < param2.field_w.length; var14++) {
              var15 = param2.field_w[var14];
              if (-1 == var15) {
                var8[var12Lifetime1 + var14] = je.field_G;
                var9[var14 + var12Lifetime1] = param2.field_r[var14];
                var10[var12Lifetime1 + var14] = param2.field_w[var14];
              } else {
                var16 = cj.field_s.a((byte) 125, var15);
                var8[var12Lifetime1 + var14] = var16.d(119);
                var9[var14 + var12Lifetime1] = param2.field_r[var14];
                if (0 >= var9[var14 + var12Lifetime1]) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char)var13;
                }
                var10[var14 + var12Lifetime1] = param2.field_w[var14];
              }
            }
          }
          stackIn_28_0 = new oj(0L, param1, param0, param4, var11, var21, var8, var22);
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("wf.G(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param0.getCodeBase();
              var3 = og.a(-1, param0, var4).getFile();
              if (param1 != 49) {
                return;
              }
              q.a(param0, -8582, new Object[]{"home", var3 + "home.ws"}, "updatelinks");
              q.a(param0, -8582, new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks");
              q.a(param0, -8582, new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks");
              q.a(param0, -8582, new Object[]{"options", var3 + "options.ws"}, "updatelinks");
              q.a(param0, param1 - 8631, new Object[]{"terms", var3 + "terms.ws"}, "updatelinks");
              q.a(param0, param1 - 8631, new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("wf.H(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        df.a(this.field_l, this.field_c, this.field_b);
        if (param0 != 29) {
          this.a((byte) -120);
        }
    }

    static {
        field_e = new String[]{"Turn duration (seconds)", "Grid width"};
        field_k = "Playing";
        field_a = "Unfortunately we are unable to create an account for you at this time.";
        field_g = "Owner";
        field_i = "Friends";
    }
}
