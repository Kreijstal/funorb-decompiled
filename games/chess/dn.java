/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static boolean field_b;
    static String field_d;
    static rk[] field_g;
    static int[] field_h;
    static String field_a;
    static jd field_f;
    static ci field_c;
    static int[] field_e;

    final static void a(boolean param0) {
        if (!param0) {
          return;
        }
        sh.a(-65);
    }

    final static di a(ci param0, int[] param1, ci param2, ci param3, int param4) {
        int var10_int = 0;
        Object stackIn_9_0 = null;
        di stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        di[] var8 = null;
        int var9 = 0;
        Exception var10 = null;
        dj var11 = null;
        int var12 = 0;
        um var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        var12 = Chess.field_G;
        try {
          var5_int = param1.length;
          var6 = new String[var5_int];
          var15 = new char[var5_int];
          var14 = var15;
          var7 = var14;
          var8 = new di[var5_int];
          if (param4 != 13911) {
            var13 = (um) null;
            dn.a(21, -29, (byte) 51, (um) null, (um) null);
          }
          var9 = 49;
          try {
            for (var10_int = 0; var10_int < var5_int; var10_int++) {
              var11 = oa.field_b.a((byte) 79, param1[var10_int]);
              var6[var10_int] = var11.e((byte) -107);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = null;
            return (di) (stackIn_9_0);
          }
          stackIn_11_0 = new di(0L, param0, param2, param3, var8, param1, var6, var15);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("dn.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        try {
          try {
            u.a(bh.i(81), true, new Object[]{new Integer(param0)}, "resizing");
          } catch (Throwable throwable) {
          }
          int var2 = -73 % ((-52 - param1) / 35);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_h = null;
        field_g = null;
        field_c = null;
        field_f = null;
        if (param0 <= 64) {
          return;
        }
        field_e = null;
        field_a = null;
    }

    final static pm a(int param0, int param1, byte param2, um param3, um param4) {
        RuntimeException var5 = null;
        pm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 118) {
            field_f = (jd) null;
          }
          if (!tj.a(param1, param0, param3, (byte) 83)) {
            return null;
          }
          stackIn_6_0 = g.a(param4.a(param1, param0, 5847), 127);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dn.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        nk var2 = qn.field_U;
        var2.f(param1, -85);
        var2.c(1, (byte) -73);
        var2.c(3, (byte) 124);
        if (param0 <= 10) {
          dn.a(true);
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_d = "<%0> is offering a rematch.";
        field_h = new int[]{14, 28};
        field_a = "Friends";
        field_f = new jd("");
        field_e = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if (1 == (var0 & 1)) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_e[var1] = var0;
        }
    }
}
