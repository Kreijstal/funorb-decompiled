/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_a;
    static long field_b;

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fi var6 = null;
        byte[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          if (param1 > 0) {
            var9 = new byte[param0];
            var4 = var9;
            for (var5 = 0; var5 < param0; var5++) {
              var9[var5] = param3[var5 + param1];
            }
          } else {
            var4 = param3;
          }
          var5Lifetime1 = 53 / ((47 - param2) / 35);
          var6 = new fi();
          var6.b((byte) 127);
          var6.a((long)(8 * param0), var4, 0);
          var7 = new byte[64];
          var6.a(var7, 0, (byte) 124);
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("q.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
    }
}
