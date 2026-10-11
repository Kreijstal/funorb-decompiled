/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends rf {
    int[] field_q;
    int[] field_g;
    byte[][][] field_l;
    int field_k;
    static String field_u;
    bk[] field_i;
    int[] field_r;
    bk[] field_p;
    int field_n;
    static rk field_h;
    static long field_j;
    static int field_f;
    static o field_m;
    static int field_s;
    static String[] field_t;
    static String field_o;

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var11 = new char[param3];
          var10 = var11;
          var9 = var10;
          var4 = var9;
          var5 = 0;
          if (param1 <= 59) {
            va.b((byte) 21);
          }
          for (var6 = 0; param3 > var6; var6++) {
            var7 = 255 & param2[param0 + var6];
            if (0 != var7) {
              if (128 <= var7 &&
                var7 < 160) {
                var8 = ee.field_c[-128 + var7];
                if (0 == var8) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var9[incrementValue$1] = (char)var7;
            }
          }
          stackIn_16_0 = new String(var11, 0, var5);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("va.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_h = null;
        int var1 = -70 / ((8 - param0) / 59);
        field_m = null;
        field_o = null;
        field_u = null;
        field_t = null;
    }

    va() {
    }

    static {
        field_u = "Friends can be added in multiplayer<nbsp>games";
        field_h = new rk();
        field_m = new o(0, 2, 2, 1);
        field_o = "Error connecting to server. Please try using a different server.";
    }
}
