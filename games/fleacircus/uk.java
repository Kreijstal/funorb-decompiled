/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static String[] field_a;
    static wd field_b;

    final static String a(int param0, CharSequence param1) {
        int var7 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = fleas.field_A ? 1 : 0;
        try {
          var2_int = 33 / ((param0 + 55) / 38);
          if (param1 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var3 = 0;
          var4 = param1.length();
          while (var3 < var4) {
            if (r.a(param1.charAt(var3), 83)) {
              var3++;
              continue;
            }
            break;
          }
          while (var4 > var3) {
            if (r.a(param1.charAt(-1 + var4), 109)) {
              var4--;
              continue;
            }
            break;
          }
          var5 = var4 - var3;
          if (var5 < 1) {
            return null;
          }
          if (12 < var5) {
            return null;
          }
          var6 = new StringBuilder(var5);
          for (var7 = var3; var4 > var7; var7++) {
            var8 = param1.charAt(var7);
            if (sg.a((char) var8, (byte) -95)) {
              var9 = kl.a((byte) -78, (char) var8);
              if (0 != var9) {
                discarded$0 = var6.append((char) var9);
              }
            }
          }
          if (var6.length() != 0) {
            return var6.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("uk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 != 15000) {
          field_a = (String[]) null;
        }
        lj.field_e = true;
        ua.field_sb = 15000L + lj.a((byte) -68);
        return bh.field_t == 11 ? true : false;
    }

    final static void a(String param0, long param1, int param2, java.applet.Applet param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param3.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param2 != 0) {
                field_a = (String[]) null;
              }
              if (param1 >= 0L) {
                var7Lifetime4 = var9 + "; Expires=" + wd.a((byte) -61, param1 * 1000L + lj.a((byte) -95)) + "; Max-Age=" + param1;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              eb.a("document.cookie=\"" + var7Lifetime4 + "\"", -28924, param3);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("uk.E(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -9435) {
          field_b = (wd) null;
        }
        field_a = null;
    }

    final static bi a(byte param0, int[] param1, bi param2) {
        bi var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        bi stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new bi(0, 0, 0);
          var3.field_e = param2.field_e;
          var4 = 40 / ((param0 - 41) / 34);
          var3.field_l = param1;
          var3.field_d = param2.field_d;
          var3.field_c = param2.field_c;
          var3.field_g = param2.field_g;
          var3.field_h = param2.field_h;
          var3.field_a = param2.field_a;
          var3.field_k = param2.field_k;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("uk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_b = new wd();
    }
}
