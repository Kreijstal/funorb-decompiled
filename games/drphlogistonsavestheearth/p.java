/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static gb field_a;
    static String field_b;
    static int[] field_c;
    static sd field_d;
    static he field_e;
    static int field_f;

    final static String a(int param0, byte param1, byte[] param2, int param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var11 = new char[param0];
          var10 = var11;
          var4 = var10;
          var5 = 0;
          var6 = 0;
          if (param1 != 79) {
            field_a = (gb) null;
          }
          while (param0 > var6) {
            var7 = param2[param3 + var6] & 255;
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = we.field_a[-128 + var7];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
            var6++;
          }
          stackIn_14_0 = new String(var11, 0, var5);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("p.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, nh param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        nh var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (wj.field_g > param6) {
            param0 = param0 - (-param6 + wj.field_g);
            param6 = wj.field_g;
          }
          if (wj.field_e > param5) {
            param3 = param3 - (-param5 + wj.field_e);
            param5 = wj.field_e;
          }
          if (param6 + param0 > wj.field_b) {
            param0 = -param6 + wj.field_b;
          }
          if (param5 + param3 > wj.field_j) {
            param3 = -param5 + wj.field_j;
          }
          if (param0 > 0 &&
            param3 > 0) {
            var21 = param7.a();
            var30 = wj.field_l;
            var10 = wj.field_k;
            var11 = wj.field_c;
            var29 = new int[4];
            wj.b(var29);
            param7.c();
            wj.d(var29[param2], var29[1], var29[2], var29[3]);
            var13 = param6 + param7.field_y * param5;
            var14 = param7.field_y - param0;
            var25 = var21.field_B;
            var22 = var25;
            var15 = var22;
            for (var16 = param5; var16 < param5 + param3; var16++) {
              for (var17 = param6; param0 + param6 > var17; var17++) {
                var18 = var25[var13];
                if (var18 != 0 && (var17 > 0 &&
                  var15[-1 + var13] == 0 ||
                  var16 > 0 &&
                  var15[var13 - param7.field_y] == 0 ||
                  var17 < -1 + param7.field_y &&
                  var15[var13 + 1] == 0 ||
                  !(var16 >= -1 + param7.field_w) &&
                  var15[param7.field_y + var13] == 0)) {
                  wj.b(var17, var16, param1, param4);
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.d(-param7.field_D, -param7.field_v);
            wj.a(var30, var10, var11);
            wj.a(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_42_0 = var8;
          stackIn_42_1 = new StringBuilder().append("p.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
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
              if (param0 != -161) {
                return;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
              param1.getAppletContext().showDocument(kk.a(var2, param1, 4767999), "_top");
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
            stackIn_8_1 = new StringBuilder().append("p.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 != -29912) {
          field_e = (he) null;
        }
    }

    static {
        field_c = new int[16384];
        field_b = "Names should contain a maximum of 12 characters";
        field_d = new sd("email");
    }
}
