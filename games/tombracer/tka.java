/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tka extends vpa {
    private hja[] field_o;
    static volatile int field_n;
    static nh field_p;
    static jea field_q;

    tka(hja[] param0) {
        try {
          this.field_e = mj.field_J;
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tka.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 > -52) {
          field_q = (jea) null;
          field_p = null;
          field_q = null;
          return;
        }
        field_p = null;
        field_q = null;
    }

    final static void b(byte param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 <= 46) {
            field_p = (nh) null;
          }
          if (ou.field_e != null &&
            lm.field_r != null) {
            return;
          }
          lm.field_r = new int[256];
          ou.field_e = new int[256];
          for (var1_int = 0; 256 > var1_int; var1_int++) {
            var2 = (double)var1_int / 255.0 * 6.283185307179586;
            ou.field_e[var1_int] = (int)(Math.sin(var2) * 4096.0);
            lm.field_r[var1_int] = (int)(4096.0 * Math.cos(var2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "tka.A(" + param0 + ')');
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hja var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        try {
          bea.f(param1 + param0.field_i, param3 + param0.field_n, param0.field_m, param0.field_p, 10197915);
          if (param4) {
            stackIn_6_0 = (((rj) (param0)).field_w) ? 1 : 0;
          } else {
            stackIn_6_0 = 0;
          }
          var6_int = stackIn_6_0;
          if (param4) {
            stackIn_12_0 = (param0.b((byte) -34)) ? 1 : 0;
          } else {
            stackIn_12_0 = 0;
          }
          var7 = stackIn_12_0;
          var8 = 0;
          stackIn_15_0 = (var6_int == 0) ? 16777215 : 2394342;
          var9 = stackIn_15_0;
          if (var7 != 0) {
            var8 = var8 | 2;
          }
          if (var6_int != 0) {
            var8 = var8 | 1;
          }
          var10 = this.field_o[var8];
          var11 = param0.field_i + param1 + (-var10.field_a + param0.field_m) / 2;
          var12 = (param0.field_p - var10.field_b) / 2 + (param0.field_n + param3);
          var13 = param1 + (param0.field_i + param0.field_m / 2);
          var10.b(var11, var12);
          this.field_e.a(this.d(-4, param0), var13, param3, var9, -1);
          if (param2 == 16777215) {
            return;
          }
          tka.b((byte) 56);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_24_0 = var6;
          stackIn_24_1 = new StringBuilder().append("tka.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_n = 0;
    }
}
