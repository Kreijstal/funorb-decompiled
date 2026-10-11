/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static km[] field_b;
    static tk field_c;
    static int[] field_a;
    static String field_e;
    static String field_d;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_e = null;
        field_a = null;
        if (param0 != -1) {
          byte[] var2 = (byte[]) null;
          gh.a((byte[]) null, 100, 123, -101);
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          qa.a((byte) 122, "", param0);
          jd.a((byte) -117, param0);
          if (param1 != -161) {
            field_a = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "gh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_3_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = Chess.field_G;
        try {
          if (param2 != -161) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var12 = new char[param3];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          var5 = 0;
          for (var6 = 0; param3 > var6; var6++) {
            var7 = param0[param1 + var6] & 255;
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = jn.field_M[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var10[incrementValue$1] = (char)var7;
            }
          }
          stackIn_17_0 = new String(var12, 0, var5);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("gh.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = new tk();
        field_e = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_d = "Mouse over an icon for details";
    }
}
