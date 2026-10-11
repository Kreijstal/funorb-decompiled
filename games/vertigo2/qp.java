/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp {
    static int[] field_g;
    static String field_c;
    r field_i;
    String field_a;
    String field_e;
    static int field_d;
    String field_f;
    static fe field_h;
    int field_b;

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, byte[] param2, int param3, int param4, byte param5, ed param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          var7_int = g.a(param4, param5 - 25412);
          if (null == sd.field_O) {
            sd.field_O = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = sd.field_O.nextInt();
          }
          if (param5 != 63) {
            field_g = (int[]) null;
          }
          if (null == kh.field_b ||
            !(kh.field_b.field_p.length >= var7_int)) {
            kh.field_b = new ed(var7_int);
          }
          kh.field_b.field_u = 0;
          kh.field_b.a(param3, param5 ^ -10149, param2, param4);
          kh.field_b.h(var7_int, 2);
          kh.field_b.a(var13, -12257);
          if (null == hh.field_b ||
            !(100 <= hh.field_b.field_p.length)) {
            hh.field_b = new ed(100);
          }
          hh.field_b.field_u = 0;
          hh.field_b.f(10, 79);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            hh.field_b.e(var13[var11], 0);
            var11++;
          }
          hh.field_b.d(param4, param5 - 1846);
          hh.field_b.a(param0, param1, 9157);
          param6.a(0, -10140, hh.field_b.field_p, hh.field_b.field_u);
          param6.a(0, param5 - 10203, kh.field_b.field_p, kh.field_b.field_u);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("qp.C(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        if (param1 < 47) {
          qp.a(-86, 78);
        }
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    public static void a(int param0) {
        field_g = null;
        field_c = null;
        if (param0 != -19721) {
          qp.a(52, -56);
        }
        field_h = null;
    }

    private qp() throws Throwable {
        throw new Error();
    }

    static {
        field_c = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
