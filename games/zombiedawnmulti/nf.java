/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static int field_a;
    static int field_b;
    static int field_c;
    static int field_d;

    final static ma a(byte param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        ma var7 = null;
        int var8 = 0;
        ma stackIn_3_0 = null;
        ma stackIn_6_0 = null;
        ma stackIn_9_0 = null;
        ma stackIn_12_0 = null;
        ma stackIn_18_0 = null;
        ma stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = jo.field_e;
            return stackIn_3_0;
          }
          if (var2_int > 255) {
            stackIn_6_0 = er.field_f;
            return stackIn_6_0;
          }
          var3 = mk.a('.', false, param1);
          if (2 > var3.length) {
            stackIn_9_0 = jo.field_e;
            return stackIn_9_0;
          }
          if (param0 < 79) {
            stackIn_12_0 = (ma) null;
            return stackIn_12_0;
          }
          var4 = var3;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = lq.a((byte) 1, var6);
            if (var7 != null) {
              stackIn_18_0 = var7;
              return stackIn_18_0;
            }
          }
          stackIn_21_0 = pg.a(var3[-1 + var3.length], (byte) -86);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("nf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        ka.a(50, (byte) -110);
    }
}
