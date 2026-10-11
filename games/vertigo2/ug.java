/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ug {
    static int field_b;
    static long field_a;
    static java.awt.Image field_c;

    abstract void b(int param0);

    abstract long a(int param0);

    final static void a(byte param0, int param1, int param2, int param3) {
        if (param0 < -46) {
          vm.field_b = param2;
          t.field_c = param1;
          vg.field_d = param3;
          return;
        }
        field_c = (java.awt.Image) null;
        vm.field_b = param2;
        t.field_c = param1;
        vg.field_d = param3;
    }

    abstract int a(boolean param0, long param1);

    final static void a(int param0, int param1, int param2, long param3, String param4) {
        nm.field_E = param0;
        qi.field_b = param4;
        if (param1 != -3) {
          return;
        }
        try {
          ff.field_m = true;
          ap.field_c = param2;
          ba.field_a = param3;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ug.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static wp a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        wp var7 = null;
        int var8 = 0;
        wp stackIn_4_0 = null;
        wp stackIn_7_0 = null;
        wp stackIn_10_0 = null;
        wp stackIn_17_0 = null;
        wp stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = ab.field_a;
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = cg.field_a;
            return stackIn_7_0;
          }
          var3 = jr.a((byte) -9, '.', param0);
          if (var3.length < 2) {
            stackIn_10_0 = ab.field_a;
            return stackIn_10_0;
          }
          var4 = var3;
          if (param1 >= -45) {
            field_a = 17L;
          }
          var5 = 0;
          while (true) {
            if (var4.length <= var5) {
              stackIn_20_0 = cr.b(var3[var3.length - 1], 0);
              return stackIn_20_0;
            }
            var6 = var4[var5];
            var7 = pe.a(var6, true);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_17_0 = var7;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ug.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static r a(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        if (!param3) {
          return vo.a(false, 124, param4, param0, param1, param2);
        }
        String var6 = (String) null;
        ug.a(66, -15, -123, 95L, (String) null);
        return vo.a(false, 124, param4, param0, param1, param2);
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != 0) {
          ug.c(-10);
        }
    }

    final static gd a(ed param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        gd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 46) {
            var3 = (String) null;
            ug.a((String) null, (byte) -93);
          }
          stackIn_3_0 = new gd(param0.n(2), param0.n(2), param0.n(param1 - 44), param0.n(2), param0.n(2), param0.n(2), param0.n(2), param0.n(param1 ^ 44), param0.m(0), param0.h(param1 - 57));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ug.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(long param0, boolean param1) {
        long var4 = this.a(104);
        if (!param1) {
          this.b(-10);
          if (0L < var4) {
            um.a(param1, var4);
            return this.a(true, param0);
          }
          return this.a(true, param0);
        }
        if (0L >= var4) {
          return this.a(true, param0);
        }
        um.a(param1, var4);
        return this.a(true, param0);
    }

    static {
    }
}
