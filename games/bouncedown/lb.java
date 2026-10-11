/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static int[] field_c;
    int field_e;
    static int field_b;
    int field_d;
    int field_f;
    int field_a;
    static wi field_g;

    final static void a(tj param0, int param1, int param2, tj param3) {
        try {
          gk.field_a = param1;
          jc.field_h = param0;
          ba.field_E = param3;
          l.a(na.field_k / 2, (byte) 127, na.field_e / 2);
          int var4_int = -4 % ((param2 + 34) / 39);
          hh.b(param0.field_x + param0.field_F, param3.field_F, param0.field_F, param3.field_F + param3.field_x, 0);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "lb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -3) {
          field_b = -113;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final static a[] a(int param0, ii param1) {
        int var5 = 0;
        int var2_int = 0;
        int var3 = 0;
        a[] var4 = null;
        a var6_ref_a = null;
        int var6 = 0;
        int var7 = 0;
        a[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Bounce.field_N;
        try {
          var2_int = param1.f(7, 8);
          if (param0 < 42) {
            lb.a((byte) 78);
          }
          if (0 < var2_int) {
            return null;
          }
          var3 = param1.f(7, 12);
          var4 = new a[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (!re.a(101, param1)) {
              var6 = param1.f(7, wd.a(var5 - 1, -95));
              var4[var5] = var4[var6];
            } else {
              var6_ref_a = new a();
              param1.f(7, 24);
              param1.f(7, 24);
              var6_ref_a.field_d = param1.f(7, 24);
              param1.f(7, 9);
              param1.f(7, 12);
              param1.f(7, 12);
              param1.f(7, 12);
              var4[var5] = var6_ref_a;
            }
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("lb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_c = new int[16384];
        field_g = new wi(256);
    }
}
