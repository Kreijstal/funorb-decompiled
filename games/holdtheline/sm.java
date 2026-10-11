/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static uf field_a;
    static String field_d;
    static ah field_b;
    static si field_c;

    final static String a(int param0, int param1, int param2, byte[] param3) {
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
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = HoldTheLine.field_D;
        try {
          var12 = new char[param0];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          if (param2 != -129) {
            sm.a((byte) -10);
          }
          var5 = 0;
          for (var6 = 0; param0 > var6; var6++) {
            var7 = 255 & param3[param1 + var6];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = ja.field_Qb[var7 - 128];
                if (0 == var8) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var10[incrementValue$1] = (char)var7;
            }
          }
          stackIn_15_0 = new String(var12, 0, var5);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("sm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 != 72) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_d = "<col=2>Not Attempted</col>";
        field_b = new ah();
    }
}
