/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static vf field_c;
    static int field_d;
    static int field_e;
    static int[] field_f;
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var22Lifetime1;
        int var23Lifetime1;
        var26 = Torquing.field_u;
        try {
          var6_int = 0;
          var7 = param5;
          var8 = param2 * param2;
          var9 = param5 * param5;
          var10 = var9 << 1;
          var11 = var8 << 1;
          var12 = param5 << 1;
          var13 = var8 * (1 - var12) + var10;
          var14 = -((-1 + var12) * var11) + var9;
          var15 = var8 << 2;
          var16 = var9 << 2;
          var17 = ((var6_int << 1) + 3) * var10;
          var18 = var11 * ((var7 << 1) - 3);
          var21 = -103 % ((82 - param3) / 34);
          var19 = var16 * (1 + var6_int);
          if (j.field_q <= param4 &&
            param4 <= qk.field_p) {
            var22 = ln.a(qg.field_z, kn.field_e, param2 + param1, 88);
            var23 = ln.a(qg.field_z, kn.field_e, param1 - param2, 89);
            di.a(var23, (byte) -91, param0, qd.field_a[param4], var22);
          }
          var20 = (var7 - 1) * var15;
          while (true) {
            if (var7 <= 0) {
              return;
            }
            if (var13 < 0) {
              while (0 > var13) {
                var14 = var14 + var19;
                var13 = var13 + var17;
                var17 = var17 + var16;
                var19 = var19 + var16;
                var6_int++;
              }
            }
            if (var14 < 0) {
              var14 = var14 + var19;
              var13 = var13 + var17;
              var17 = var17 + var16;
              var6_int++;
              var19 = var19 + var16;
            }
            var13 = var13 - var20;
            var14 = var14 - var18;
            var7--;
            var18 = var18 - var15;
            var20 = var20 - var15;
            var22Lifetime1 = param4 - var7;
            var23Lifetime1 = var7 + param4;
            if (j.field_q > var23Lifetime1) {
              continue;
            }
            if (qk.field_p < var22Lifetime1) {
              continue;
            }
            var24 = ln.a(qg.field_z, kn.field_e, var6_int + param1, 112);
            var25 = ln.a(qg.field_z, kn.field_e, -var6_int + param1, 94);
            if (j.field_q <= var22Lifetime1) {
              di.a(var25, (byte) -91, param0, qd.field_a[var22Lifetime1], var24);
            }
            if (qk.field_p < var23Lifetime1) {
              continue;
            }
            di.a(var25, (byte) 86, param0, qd.field_a[var23Lifetime1], var24);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "a.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(boolean param0, String param1, java.applet.Applet param2, int param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          java.applet.Applet var5 = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (vh.field_i.startsWith("win") &&
              fq.a(param1, 0)) {
              return;
            }
            try {
              param2.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
              if (param3 == 3) {
                return;
              }
              var5 = (java.applet.Applet) null;
              a.a(false, (String) null, (java.applet.Applet) null, -43);
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              nn.a("MGR1: " + param1, (Throwable) null, param3 ^ -9959);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4_ref;
            stackIn_12_1 = new StringBuilder().append("a.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = new int[128];
        field_b = "Email (Login):";
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}
