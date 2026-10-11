/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static wh field_a;
    static java.math.BigInteger field_g;
    static int field_f;
    static ea[] field_e;
    static int field_d;
    static int field_c;
    static int field_b;

    public static void a(int param0) {
        field_e = null;
        field_g = null;
        if (param0 == 0) {
          field_a = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        ph.a((byte) 20, -27, (byte[]) null, 126);
        field_a = null;
    }

    final static String a(byte param0, int param1, byte[] param2, int param3) {
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
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = MinerDisturbance.field_ab;
        try {
          if (param0 <= 13) {
            field_e = (ea[]) null;
          }
          var12 = new char[param1];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          var5 = 0;
          for (var6 = 0; param1 > var6; var6++) {
            var7 = param2[var6 + param3] & 255;
            if (0 != var7) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = tk.field_e[var7 - 128];
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
          stackIn_16_0 = new String(var12, 0, var5);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("ph.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_g = new java.math.BigInteger("65537");
        field_c = 0;
    }
}
