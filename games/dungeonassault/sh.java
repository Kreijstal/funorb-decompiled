/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static cn field_a;
    static String field_b;

    final static String a(byte param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          if (param0 > -117) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var2_int = param1.length();
          var3 = new char[var2_int];
          for (var4 = 0; var2_int > var4; var4++) {
            var3[var2_int - (1 + var4)] = param1.charAt(var4);
          }
          stackIn_8_0 = new String(var3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("sh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(int param0, lb param1) {
        kl var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          var2 = bf.field_f[2].field_b;
          if (var2 instanceof fk) {
            ((fk) (var2)).a(param1, 83);
          }
          if (param0 != 27886) {
            field_a = (cn) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("sh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static cf[] a(int param0, String param1, int[] param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        cf[] var4 = null;
        int var6 = 0;
        lb var7 = null;
        cf[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          var3_int = param2.length;
          var4 = new cf[var3_int];
          for (var5 = 0; var5 < var3_int; var5++) {
            var4[var5] = mp.a(Integer.toString(var5 + 1), param1, 0, param2[var5]);
          }
          if (param0 >= -55) {
            var7 = (lb) null;
            sh.a(-87, (lb) null);
          }
          stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("sh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = 41 % ((param0 - 57) / 50);
          if ((ib.field_j - 1) * ib.field_d <= param1) {
            var3_int = param1 - (ib.field_j - 1) * ib.field_d;
            var4 = ib.field_j + var3_int;
          } else {
            var3_int = param1 % (ib.field_j - 1) + ib.field_j * (param1 / (-1 + ib.field_j));
            var4 = var3_int + 1;
          }
          var6 = param2[var3_int] - param2[var4];
          if (0 < var6) {
            stackIn_6_0 = var6;
          } else {
            stackIn_6_0 = -var6;
          }
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("sh.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          field_a = (cn) null;
        }
        field_a = null;
    }

    static {
        field_b = "Email is valid";
    }
}
