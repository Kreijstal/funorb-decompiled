/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_b;
    static boolean field_a;

    final static void a(int param0, String[] param1, int param2, int param3, int param4, java.applet.Applet param5) {
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = Terraphoenix.field_V;
        try {
          df.field_L = param5.getParameter("overxgames");
          if (null == df.field_L) {
            df.field_L = "0";
          }
          fi.field_o = param5.getParameter("overxachievements");
          if (fi.field_o == null) {
            fi.field_o = "0";
          }
          var6 = param5.getParameter("currency");
          if (var6 == null) {
            ej.field_S = 2;
          } else {
            if (te.a((CharSequence) ((Object) var6), true)) {
              ej.field_S = ta.a((CharSequence) ((Object) var6), -121);
            } else {
              ej.field_S = 2;
            }
          }
          me.field_k = param4;
          da.field_b = param2;
          dh.field_h = param3;
          if (param0 != 22957) {
            field_a = true;
          }
          wg.field_l = new ci[param1.length];
          for (var7 = 0; param1.length > var7; var7++) {
            wg.field_l[var7] = new ci(317, 34);
          }
          vi.field_j = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_21_0 = var6_ref;
          stackIn_21_1 = new StringBuilder().append("li.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          var3 = new byte[var2_int];
          ka.a(param1, param0, var3, 0, var2_int);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("li.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        var8 = Terraphoenix.field_V;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int < 1) {
            return false;
          }
          if (12 < var3_int) {
            return false;
          }
          if (param2 != 18116) {
            var9 = (CharSequence) null;
            li.a(true, (CharSequence) null, 20);
          }
          var4 = hm.a((byte) 6, param1);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!ad.a((byte) 120, var4.charAt(0)) &&
              !ad.a((byte) 117, var4.charAt(var4.length() - 1))) {
              var5 = 0;
              for (var6 = 0; param1.length() > var6; var6++) {
                var7 = param1.charAt(var6);
                if (ad.a((byte) 88, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param0) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("li.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var3 = param0 >> 16;
        int var4 = param0 & 65535;
        if (param1 <= -114) {
          var5 = param2 >> 16;
          var6 = 65535 & param2;
          return var5 * var4 + var3 * param2 + (var6 * var4 >> 16);
        }
        return 76;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -394132240) {
          li.a(83, 64, 84);
        }
    }

    static {
        field_b = "Loading extra data";
        field_a = false;
    }
}
