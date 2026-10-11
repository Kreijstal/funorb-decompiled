/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends mf {
    static int[] field_m;
    static int field_n;
    static long field_k;
    static int field_l;

    final ok a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        ok stackIn_5_0 = null;
        ok stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (tg.a(param0, param1) != null) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (var3_int != 0) {
            stackIn_7_0 = gf.field_V;
            return stackIn_7_0;
          }
          stackIn_5_0 = hg.field_c;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("sj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    sj(og param0) {
        super(param0);
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param0) != hg.field_c) {
            return eh.field_h;
          }
          stackIn_3_0 = kd.field_b;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sj.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 > -122) {
          sj.f(-67);
          field_m = null;
          return;
        }
        field_m = null;
    }

    static {
    }
}
