/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static String field_d;
    static int[] field_c;
    static boolean field_a;
    static String field_b;

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var2Lifetime1Lifetime1;
        int var3Lifetime1Lifetime1;
        int var4Lifetime1Lifetime1;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var10 = c.field_d.field_B;
          var8 = var10;
          var7 = var8;
          var11 = var7;
          var9 = var11;
          var1 = var9;
          if (co.field_h > 0) {
            var5 = -co.field_h + 256;
            var4 = 256000;
            while (var4 > 0) {
              var4--;
              var3 = var10[var4];
              var2 = 16711935 & var3;
              var2 = var2 * var5;
              var3 = var3 & 65280;
              var2 = var2 & -16711936;
              var3 = var3 * var5;
              var2 = var2 + (-16711936 & co.field_h * 16711935);
              var3 = var3 & 16711680;
              var3 = var3 + (16711680 & 65280 * co.field_h);
              var7[var4] = oh.a(var2, var3) >>> 8;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (128.0f >= lj.field_r) {
            var3Lifetime1 = 200;
            while (0 < var3Lifetime1) {
              var3Lifetime1--;
              var4Lifetime1 = 1280 * var3Lifetime1;
              var2Lifetime1 = 640;
              while (true) {
                var2Lifetime1--;
                if (var2Lifetime1 <= 0) {
                  break;
                }
                var1[var4Lifetime1] = rb.a(var11[var4Lifetime1], 16711422);
                var1[var4Lifetime1] = var1[var4Lifetime1] >> 1;
                var4Lifetime1++;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (!(lj.field_r <= 256.0f)) {
              var2Lifetime1Lifetime1 = 256000;
              while (var2Lifetime1Lifetime1 > 0) {
                var2Lifetime1Lifetime1--;
                var1[var2Lifetime1Lifetime1] = rb.a(var11[var2Lifetime1Lifetime1], 16579836);
                var1[var2Lifetime1Lifetime1] = var1[var2Lifetime1Lifetime1] >> 2;
                var1[var2Lifetime1Lifetime1] = var1[var2Lifetime1Lifetime1] * 3;
              }
            } else {
              var3Lifetime1Lifetime1 = 100;
              while (var3Lifetime1Lifetime1 > 0) {
                var3Lifetime1Lifetime1--;
                var4Lifetime1Lifetime1 = 2560 * var3Lifetime1Lifetime1;
                var2Lifetime1Lifetime1 = 1280;
                while (true) {
                  var2Lifetime1Lifetime1--;
                  if (var2Lifetime1Lifetime1 <= 0) {
                    break;
                  }
                  var1[var4Lifetime1Lifetime1] = rb.a(var11[var4Lifetime1Lifetime1], 16711422);
                  var1[var4Lifetime1Lifetime1] = var1[var4Lifetime1Lifetime1] >> 1;
                  var4Lifetime1Lifetime1++;
                }
              }
            }
          }
          if (param0 == 8) {
            return;
          }
          field_a = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "wd.B(" + param0 + ')');
        }
    }

    final static String a(int param0, java.applet.Applet param1, String param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_7_0 = null;
          Object stackIn_12_0 = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = Virogrid.field_F ? 1 : 0;
          try {
            try {
              var3 = (String) (q.b("getcookies", 6168, param1));
              var4 = ql.a(var3, (byte) -123, ';');
              for (var5 = param0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(param2)) {
                  stackIn_7_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_12_0 = null;
            return (String) (stackIn_12_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var3_ref2;
            stackIn_15_1 = new StringBuilder().append("wd.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0) {
        int var1 = -38 % ((15 - param0) / 57);
        return nf.field_e;
    }

    final static int a(byte param0, int param1) {
        if (param0 >= -43) {
          wd.a((byte) -38, 106);
          if (param1 < 0) {
            if (param1 < -65536) {
              return -2048 + wl.field_c[134217728 / -param1];
            }
            return -wl.field_c[-param1 >> 5];
          }
          if (param1 <= 65536) {
            return wl.field_c[param1 >> 5];
          }
          return -wl.field_c[134217728 / param1] + 2048;
        }
        if (param1 < 0) {
          if (param1 < -65536) {
            return -2048 + wl.field_c[134217728 / -param1];
          }
          return -wl.field_c[-param1 >> 5];
        }
        if (param1 <= 65536) {
          return wl.field_c[param1 >> 5];
        }
        return -wl.field_c[134217728 / param1] + 2048;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 != -8518) {
          field_d = (String) null;
        }
    }

    static {
        field_c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_b = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
