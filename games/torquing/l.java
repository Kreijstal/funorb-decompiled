/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static String field_b;
    static String field_c;
    static String field_a;
    static byte[][][] field_d;

    final static void a(int param0, qp param1, int param2) {
        df var5 = null;
        int var4 = 0;
        try {
          var5 = wa.field_d;
          var5.f(param2 ^ 117, param0);
          var5.field_n = var5.field_n + 1;
          var4 = var5.field_n;
          var5.b(90, param2);
          var5.b(90, param1.field_p);
          var5.b(90, param1.field_m);
          var5.b((byte) 60, param1.field_l);
          var5.b((byte) 60, param1.field_k);
          var5.b((byte) 60, param1.field_q);
          var5.b((byte) 60, param1.field_n);
          var5.a(var4, true);
          var5.c((byte) 48, var5.field_n - var4);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "l.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static tl a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var6 = 0;
        if (param3 == 83) {
          if (param2 == 0) {
            var6 = param1;
            if (1 == var6) {
              param2 = 1000;
            }
          }
          return new tl(param0, param5, param4, param1, param2);
        }
        return (tl) null;
    }

    public static void a(byte param0) {
        field_d = (byte[][][]) null;
        int var1 = 124 % ((17 - param0) / 51);
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static byte[] a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        fj var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          var9 = new fj(param1);
          var3 = var9.i((byte) -101);
          var4 = var9.c((byte) -102);
          if (param0 <= var4 && (0 == ee.field_v ||
            !(var4 > ee.field_v))) {
            if (0 == var3) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.a(48, var4, var13, 0);
              stackIn_21_0 = var5;
              return stackIn_21_0;
            }
            var5_int = var9.c((byte) -108);
            if (var5_int >= 0 && (ee.field_v == 0 ||
              !(var5_int > ee.field_v))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 == 1) {
                fc.a(var12, var5_int, param1, var4, 9);
              } else {
                var7 = wo.field_d;
                synchronized (var7) {
                  wo.field_d.a((byte) -67, var9, var12);
                }
              }
              stackIn_19_0 = var6;
              return stackIn_19_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("l.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(ni param0, int param1, int param2) {
        df var5 = null;
        int var4 = 0;
        try {
          var5 = wa.field_d;
          df var3 = var5;
          var5.f(127, param1);
          var5.field_n = var5.field_n + 1;
          var4 = var5.field_n;
          var5.b(90, param2);
          if (param0.field_j != null) {
            var5.b(90, param0.field_j.length);
            var5.a(param0.field_j.length, 0, param0.field_j, (byte) -58);
          } else {
            var5.b(90, 0);
          }
          var5.a(var4, true);
          var5.field_n = var5.field_n - 4;
          param0.field_k = var5.c((byte) -88);
          var5.c((byte) 48, -var4 + var5.field_n);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "l.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param2 != 23273) {
          return true;
        }
        if (param3 < param5) {
          return false;
        }
        if (param4 + param5 <= param3) {
          return false;
        }
        if (param6 > param1) {
          return false;
        }
        if (param1 < param0 + param6) {
          return true;
        }
        return false;
    }

    static {
        field_c = "Loading fonts";
        field_a = "GRAPHICS: ";
        field_b = "Updates will sent to the email address you've given";
    }
}
