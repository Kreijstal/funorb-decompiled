/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static String field_c;
    static String field_a;
    static String field_b;

    final static byte[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        sb var9 = null;
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
          var9 = new sb(param0);
          var3 = var9.d((byte) -54);
          var4 = var9.b((byte) 69);
          if (var4 >= 0 && (eg.field_h == 0 ||
            !(var4 > eg.field_h))) {
            if (var3 == param1) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.a(var13, (byte) -120, 0, var4);
              stackIn_21_0 = var5;
              return stackIn_21_0;
            }
            var5_int = var9.b((byte) 20);
            if (0 <= var5_int && (eg.field_h == 0 ||
              !(var5_int > eg.field_h))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 != 1) {
                var7 = pi.field_g;
                synchronized (var7) {
                  pi.field_g.a(var9, true, var12);
                }
              } else {
                va.a(var12, var5_int, param0, var4, 9);
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
          stackIn_24_1 = new StringBuilder().append("in.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static bg a(int param0, byte param1) {
        bg[] var2;
        int var3;
        int var4;
        bg[] var5;
        int var3Lifetime1;
        var4 = MinerDisturbance.field_ab;
        var5 = pm.b(-5596);
        var2 = var5;
        if (param1 == 77) {
          for (var3 = 0; var5.length > var3; var3++) {
            if (param0 == var5[var3].field_c) {
              return var5[var3];
            }
          }
          return null;
        }
        field_a = (String) null;
        for (var3Lifetime1 = 0; var5.length > var3Lifetime1; var3Lifetime1++) {
          if (param0 == var5[var3Lifetime1].field_c) {
            return var5[var3Lifetime1];
          }
        }
        return null;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 14912) {
          return;
        }
        field_c = null;
    }

    final static String a(CharSequence[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            field_c = (String) null;
          }
          stackIn_3_0 = kl.a(param0, param0.length, 0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("in.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "Checking";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
