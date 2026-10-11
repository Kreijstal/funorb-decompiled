/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg implements Runnable {
    qb field_c;
    static String field_e;
    static String field_f;
    volatile ap[] field_d;
    volatile boolean field_b;
    static String field_g;
    volatile boolean field_a;

    final static void a(int param0) {
        qq.field_I = ks.c(108);
        if (param0 == 0) {
          le.field_e = new tc();
          wa.a((byte) -50, true, true);
          return;
        }
        field_f = (String) null;
        le.field_e = new tc();
        wa.a((byte) -50, true, true);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int[] param8, int param9) {
        int var16 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var17 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param5) {
          return;
        }
        param0--;
        while (param0 >= 0) {
          try {
            var17 = param8;
            var10 = var17;
            var11 = param2;
            var12 = param6;
            var13 = param4;
            var14 = param1;
            var15 = (var17[var11] & 16711422) >> 1;
            var10[var11] = var15 + (we.a(33471547, var14) >> 17) - (-we.a(65280, var13 >> 9) - (we.a(33423360, var12) >> 1));
            param2++;
            param1 = param1 + param7;
            param6 = param6 + param9;
            param4 = param4 + param3;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10_ref = decompiledCaughtException;
            stackIn_10_0 = var10_ref;
            stackIn_10_1 = new StringBuilder().append("jg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            if (param8 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param9).append(')').toString());
          }
          param0--;
        }
    }

    final static dc a(vr param0, String[] param1, int param2, int param3, int param4) {
        try {
          dc var5 = null;
          RuntimeException var5_ref = null;
          vi var6 = null;
          dc stackIn_3_0 = null;
          dc stackIn_8_0 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          jn var6_ref = null;
          try {
            var5 = new dc(param2, param0, -1, param1);
            try {
              if (false) throw (jn) null;
              var6 = new vi();
              var5.field_g = var6.a((byte) -116);
              if (param3 != -22379) {
                stackIn_3_0 = (dc) null;
                return stackIn_3_0;
              }
              var5.field_g.a(var5.field_v, param0, param3 + 22383);
              var5.e(0);
              var5.b(-124);
              stackIn_8_0 = var5;
              return stackIn_8_0;
            } catch (jn decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (jn) (Object) decompiledCaughtException;
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var5_ref;
            stackIn_11_1 = new StringBuilder().append("jg.C(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        int var1_int = 0;
        ap var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_a = true;
        try {
          try {
            while (!this.field_b) {
              for (var1_int = 0; var1_int < 2; var1_int++) {
                var2 = this.field_d[var1_int];
                if (var2 != null) {
                  var2.e();
                }
              }
              jb.a((byte) -98, 10L);
              var5 = (Object) null;
              ud.a(-106, this.field_c, (Object) null);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var6 = (String) null;
            jq.a(-29901, (Throwable) ((Object) var1), (String) null);
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_a = false;
          throw jg.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_a = false;
    }

    final static java.net.URL a(java.applet.Applet param0, boolean param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4Lifetime1;
        Object var4Lifetime2;
        try {
          var3 = null;
          if (cj.field_u != null &&
            !cj.field_u.equals(param0.getParameter("settings"))) {
            var3 = cj.field_u;
            var4 = var3;
            var4Lifetime2 = var3;
          }
          var4Lifetime1 = null;
          if (param1) {
            field_f = (String) null;
          }
          if (cr.field_d != null &&
            !cr.field_d.equals(param0.getParameter("session"))) {
            var4Lifetime1 = cr.field_d;
          }
          stackIn_10_0 = np.a((String) (var3), -1, (String) (var4Lifetime1), false, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("jg.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_f = null;
        field_e = null;
        if (param0 > -41) {
          String[] var2 = (String[]) null;
          jg.a((vr) null, (String[]) null, 30, -16, 113);
          return;
        }
    }

    jg() {
        this.field_d = new ap[2];
        this.field_b = false;
        this.field_a = false;
    }

    static {
        field_f = "Click to offer a Non-Agression Pact to <%0>.";
        field_e = "(<%0> players want to join)";
        field_g = "You have declined the invitation.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
