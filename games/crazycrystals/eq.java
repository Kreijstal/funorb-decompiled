/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends rl {
    static int[] field_l;
    static dl field_k;
    static int field_j;

    final pb b(byte param0) {
        if (param0 > -127) {
          eq.b(68, -24);
          return (pb) ((Object) new gd());
        }
        return (pb) ((Object) new gd());
    }

    public static void f(int param0) {
        field_k = null;
        if (param0 != 1) {
          eq.c(-34, (byte) 28);
          field_l = null;
          return;
        }
        field_l = null;
    }

    final static int c(int param0, byte param1) {
        int var2;
        var2 = 0;
        if (param0 < 0) {
          var2 += 16;
          param0 = param0 >>> 16;
        } else {
          if (param0 >= 65536) {
            var2 += 16;
            param0 = param0 >>> 16;
          }
        }
        if (param0 >= 256) {
          var2 += 8;
          param0 = param0 >>> 8;
        }
        if (param1 != 100) {
          eq.f(80);
        }
        if (param0 >= 16) {
          param0 = param0 >>> 4;
          var2 += 4;
        }
        if (param0 >= 4) {
          param0 = param0 >>> 2;
          var2 += 2;
        }
        if (param0 >= 1) {
          var2++;
          param0 = param0 >>> 1;
        }
        return param0 + var2;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        pd.field_g[param1] = pd.field_g[param1] + 10 * param2;
        if (!param0) {
          eq.b(43, -88);
        }
    }

    final static void b(int param0, int param1) {
        md var2 = tp.field_f;
        var2.d(param0 ^ 10, param1);
        var2.a(true, 1);
        var2.a(true, param0);
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        f stackIn_2_0 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -6 + (int)(Math.random() * 12.99);
          if (param0) {
            stackIn_2_0 = (f) null;
            return stackIn_2_0;
          }
          var7 = (int)(100.0 * Math.pow(2.0, (double)var6_int / 12.0));
          tb.field_d.a(qp.field_i, var7, 48 * gi.field_m, param3);
          ph.a(10, (byte) 107, param1, param4);
          stackIn_4_0 = bm.field_g;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("eq.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    eq() {
    }

    static {
        field_l = new int[]{1, 2, 3, 5, 10, 1, 3, 5, 1, 2, 5, 10, 5, 2, 5, 10, 1};
        field_k = new dl(270, 70);
    }
}
