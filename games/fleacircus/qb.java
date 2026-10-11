/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static int field_a;

    final static void a(int param0, byte param1, ql param2) {
        ih var5 = ud.field_b;
        var5.e(8, param0);
        var5.field_i = var5.field_i + 1;
        int var4 = var5.field_i;
        var5.a(-11, 1);
        var5.a(-11, param2.field_i);
        if (param1 < 43) {
          return;
        }
        try {
          var5.b(-24213, param2.field_m);
          var5.a(param2.field_r, (byte) -24);
          var5.a(param2.field_n, (byte) -120);
          var5.a(param2.field_p, (byte) -18);
          var5.a(param2.field_q, (byte) -60);
          var5.c(var4, -30532);
          var5.c((byte) -111, -var4 + var5.field_i);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "qb.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_6_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param1 >= -13) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param0.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(var5 + 32);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (48 > var5 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_24_0 = new String(var8);
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("qb.B(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param1 < 90) {
          return;
        }
        na.field_f = 1000000000L / (long)param0;
    }

    static {
    }
}
