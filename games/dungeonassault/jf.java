/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends en {
    static String[] field_e;
    static cn field_f;
    static long[] field_g;
    private wb field_d;

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_g = null;
        if (!param0) {
          nh var2 = (nh) null;
          jf.a(18, (nh) null, -123, (byte) -39);
        }
    }

    private final cn c(byte param0) {
        cn var5 = null;
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 < 18) {
          this.field_d = (wb) null;
        } else {
          jh.c();
          var2 = 4 + this.field_d.field_c.field_y + la.field_b.b(this.field_d.field_b);
          var3 = la.field_b.field_H + la.field_b.field_E;
          if (this.field_d.field_c.field_v > var3) {
            var3 = this.field_d.field_c.field_v;
          }
          var5 = new cn(var2, var3);
          var5.e();
          this.field_d.field_c.c(0, la.field_b.field_H - this.field_d.field_c.field_v >> 1, this.field_d.field_a);
          la.field_b.b(ck.field_H.a(this.field_d.field_b, (byte) -48), 4 + this.field_d.field_c.field_y, la.field_b.field_H, this.field_d.field_a, -1);
          jh.b();
          return var5;
        }
        jh.c();
        var2Lifetime1 = 4 + this.field_d.field_c.field_y + la.field_b.b(this.field_d.field_b);
        var3Lifetime1 = la.field_b.field_H + la.field_b.field_E;
        if (this.field_d.field_c.field_v > var3Lifetime1) {
          var3Lifetime1 = this.field_d.field_c.field_v;
        }
        cn var6 = new cn(var2Lifetime1, var3Lifetime1);
        var6.e();
        this.field_d.field_c.c(0, la.field_b.field_H - this.field_d.field_c.field_v >> 1, this.field_d.field_a);
        la.field_b.b(ck.field_H.a(this.field_d.field_b, (byte) -48), 4 + this.field_d.field_c.field_y, la.field_b.field_H, this.field_d.field_a, -1);
        jh.b();
        return var6;
    }

    final static cn a(int param0, nh param1, int param2, byte param3) {
        RuntimeException var4 = null;
        cn stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        cn stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 41) {
            stackIn_2_0 = (cn) null;
            return stackIn_2_0;
          }
          if (kk.a(param1, 1, param2, param0)) {
            stackIn_7_0 = ff.a((byte) 86);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (cn) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("jf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, sa param1) {
        cn var3 = null;
        try {
          var3 = this.c((byte) 44);
          param1.a(var3, param0, false, -5, param1.field_y - var3.field_v >> 1);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "jf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final cn b(byte param0) {
        int var2 = -24 / ((-58 - param0) / 35);
        return this.c((byte) 25);
    }

    jf(wb param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new String[]{"Immortality", "Deaths are treated as incapacitation."};
        field_g = new long[32];
    }
}
