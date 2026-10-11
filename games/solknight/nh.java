/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    final static void a(byte param0, boolean param1, boolean param2) {
        String var4 = null;
        String var4Lifetime1;
        if (!param1) {
          mi.a();
          if (param0 >= -28) {
            var4 = (String) null;
            nh.a((da) null, (String) null, 2, (String) null);
            uf.a(false, param1);
            return;
          }
          uf.a(false, param1);
          return;
        }
        mi.a(0, 0, mi.field_a, mi.field_d, 0, 192);
        if (param0 >= -28) {
          var4Lifetime1 = (String) null;
          nh.a((da) null, (String) null, 2, (String) null);
          uf.a(false, param1);
          return;
        }
        uf.a(false, param1);
    }

    final static o[] a(da param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        o[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.c(param2 ^ 75, param3);
          if (param2 != 0) {
            nh.a((byte) 67);
          }
          var5 = param0.a(param1, param2 - 1, var4_int);
          stackIn_3_0 = de.a(var4_int, var5, -17042, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("nh.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (!lh.field_l) {
          throw new IllegalStateException();
        }
        if (param0 == 3) {
          kk.field_c = true;
          qa.a(true, -98);
          fj.field_i = 0;
          return;
        }
        nh.a((byte) 37, false, true);
        kk.field_c = true;
        qa.a(true, -98);
        fj.field_i = 0;
    }

    final static void a(int param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = -58 / ((0 - param0) / 57);
        if (null == ee.field_j) {
          return;
        }
        var2 = ee.field_j;
        synchronized (var2) {
          ee.field_j = null;
        }
    }

    static {
    }
}
