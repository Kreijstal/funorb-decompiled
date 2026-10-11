/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static int field_e;
    static int[][] field_c;
    static String field_b;
    static hj[] field_a;
    static int field_d;

    public static void b(int param0) {
        field_c = (int[][]) null;
        if (param0 >= -41) {
          hk.a(9);
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static tg a(wd param0, int param1, boolean param2) {
        tg stackIn_2_0 = null;
        g stackIn_5_0 = null;
        oe stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        oe var4 = null;
        g var4_ref = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        dd var7 = null;
        hn var8 = null;
        oe var9 = null;
        try {
          if (param1 != 1) {
            stackIn_2_0 = (tg) null;
            return stackIn_2_0;
          }
          if (param0 instanceof dd) {
            var7 = (dd) (param0);
            var4_ref = new g(param0.f(50), param0.field_k, param2);
            var4_ref.field_n = var7.p(-1);
            var4_ref.field_j = var7.b((byte) -105);
            stackIn_5_0 = var4_ref;
            return (tg) ((Object) stackIn_5_0);
          }
          var8 = (hn) (param0);
          var9 = new oe(param0.f(50), param0.field_k, param2);
          var4 = var9;
          var5 = var8.field_A;
          var6 = var8.field_K;
          var9.field_l = var8.field_H;
          if (var6 < var5) {
            var5 = 1.0f - var5;
            var9.field_k = var8.field_Q;
            var6 = -var6 + 1.0f;
            var9.field_m = var8.field_F;
          } else {
            var9.field_k = var8.field_F;
            var9.field_m = var8.field_Q;
          }
          if (0.0f != var5) {
            var4 = oc.a(var5, param1 ^ 16711934, var9);
            var6 = (-var5 + var6) / (-var5 + 1.0f);
          }
          if (var6 != 1.0f) {
            var4 = ua.a(false, var6, var4);
          }
          if (Float.isNaN(var4.field_e)) {
            throw new RuntimeException();
          }
          stackIn_16_0 = var4;
          return (tg) ((Object) stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("hk.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        go.a(0, 4);
        if (param0 != -30500) {
          field_c = (int[][]) null;
        }
    }

    final static void a(boolean param0) {
        dj.a(param0, qd.field_k, -94, ij.field_k);
        gn.field_g = true;
    }

    static {
        field_b = "Continue";
    }
}
