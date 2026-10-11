/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static int field_a;
    static dd field_b;
    static String field_e;
    static String field_c;
    static int field_d;

    final static int a(byte param0) {
        if (param0 < 33) {
          return 3;
        }
        return qk.field_g;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 1) {
          field_b = (dd) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    final static kl a(di param0, int param1, String param2, String param3, di param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        kl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32362) {
            field_d = 16;
          }
          var5_int = param4.b(param2, -1);
          var6 = param4.a(var5_int, 0, param3);
          stackIn_3_0 = hi.a(107, var5_int, var6, param0, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("sk.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static short[] a(byte param0, int param1, short[] param2, short param3) {
        short[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        short[] var7 = null;
        short[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pool.field_O;
        try {
          var7 = new short[param1 + param2.length];
          var4 = var7;
          for (var5 = 0; param2.length > var5; var5++) {
            var7[var5] = param2[var5];
          }
          while (var4.length > var5) {
            var4[var5] = (short)param3;
            var5++;
          }
          if (param0 != -123) {
            field_a = -15;
          }
          stackIn_9_0 = var4;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("sk.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = "Press F10 to open Quick Chat.";
        field_d = 1;
        field_e = "<%0> have won!";
    }
}
