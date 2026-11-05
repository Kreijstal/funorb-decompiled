/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static fh field_b;
    static String field_d;
    static String field_e;
    static dd field_c;
    static int field_f;
    static String field_a;

    final static void a(java.math.BigInteger param0, int param1, int param2, byte[] param3, ni param4, java.math.BigInteger param5, byte param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
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
        var10 = fleas.field_A ? 1 : 0;
        try {
          var7_int = pf.a(param6 ^ 104, param1);
          if (null == vk.field_N) {
            vk.field_N = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          if (param6 != -60) {
            return;
          }
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = vk.field_N.nextInt();
          }
          if (null == ri.field_x ||
            !(var7_int <= ri.field_x.field_k.length)) {
            ri.field_x = new ni(var7_int);
          }
          ri.field_x.field_i = 0;
          ri.field_x.a(param3, param1, param2, 0);
          ri.field_x.d(var7_int, 0);
          ri.field_x.a(0, var13);
          if (fleas.field_B == null ||
            !(100 <= fleas.field_B.field_k.length)) {
            fleas.field_B = new ni(100);
          }
          fleas.field_B.field_i = 0;
          fleas.field_B.a(param6 + 49, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            fleas.field_B.a(var13[var11], (byte) -15);
            var11++;
          }
          fleas.field_B.b((byte) -49, param1);
          fleas.field_B.a(param0, param5, 127);
          param4.a(fleas.field_B.field_k, fleas.field_B.field_i, 0, 0);
          param4.a(ri.field_x.field_k, ri.field_x.field_i, 0, param6 + 60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("qi.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param5 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -105) {
          return;
        }
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        byte[] var9 = null;
        ni var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          if (param1 != -22518) {
            var9 = (byte[]) null;
            qi.a((byte[]) null, -34);
          }
          var10 = new ni(param0);
          var3 = var10.e(false);
          var4 = var10.c((byte) 123);
          if (0 <= var4 && (0 == lj.field_b ||
            !(var4 > lj.field_b))) {
            if (var3 == 0) {
              var14 = new byte[var4];
              var12 = var14;
              var5 = var12;
              var10.b(var14, 0, -126, var4);
              stackIn_23_0 = var5;
              return stackIn_23_0;
            }
            var5_int = var10.c((byte) 126);
            if (0 <= var5_int && (lj.field_b == 0 ||
              !(lj.field_b < var5_int))) {
              var13 = new byte[var5_int];
              var11 = var13;
              var6 = var11;
              if (var3 == 1) {
                fe.a(var13, var5_int, param0, var4, 9);
              } else {
                var7 = se.field_c;
                synchronized (var7) {
                  se.field_c.a((byte) -126, var13, var10);
                }
              }
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("qi.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "Service unavailable";
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_b = new fh(8, 0, 4, 1);
    }
}
