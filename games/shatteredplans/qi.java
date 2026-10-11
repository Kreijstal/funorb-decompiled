/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends oh {
    static String field_m;
    static int field_j;
    ln field_l;
    fs field_k;
    static pf field_h;
    int field_i;

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
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var12 = new char[param1];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          var5 = 0;
          for (var6 = 0; param1 > var6; var6++) {
            var7 = param0[var6 + param2] & 255;
            if (var7 != 0) {
              if (var7 >= 128 &&
                160 > var7) {
                var8 = tl.field_p[var7 - 128];
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
          if (param3 > -113) {
            qi.a(0);
          }
          stackIn_18_0 = new String(var12, 0, var5);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("qi.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_h = null;
        if (param0 != 0) {
          byte[] var2 = (byte[]) null;
          qi.a((byte[]) null, 50, -16, 91);
        }
    }

    qi(ln param0, fs param1, int param2) {
        try {
          this.field_k = param1;
          this.field_i = param2;
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_m = "ESC - cancel this line";
    }
}
