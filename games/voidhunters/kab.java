/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kab extends bob {
    static String field_p;
    private caa[] field_q;

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        caa var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        try {
          dma.b(param2 + param1.field_g, param1.field_r + param3, param1.field_h, param1.field_f, 10197915);
          if (param4) {
            stackIn_6_0 = (((htb) (param1)).field_u) ? 1 : 0;
          } else {
            stackIn_6_0 = 0;
          }
          var6_int = stackIn_6_0;
          if (param4) {
            stackIn_12_0 = (param1.e((byte) -120)) ? 1 : 0;
          } else {
            stackIn_12_0 = 0;
          }
          var7 = stackIn_12_0;
          var8 = 0;
          stackIn_15_0 = (var6_int != 0) ? 2394342 : 16777215;
          var9 = stackIn_15_0;
          if (var7 != 0) {
            var8 = var8 | 2;
          }
          if (var6_int != 0) {
            var8 = var8 | 1;
          }
          var10 = this.field_q[var8];
          var12 = -89 % ((-27 - param0) / 35);
          var11 = param2 - (-param1.field_g - (-var10.field_h + param1.field_h) / 2);
          var13 = param3 + (param1.field_r + (-var10.field_e + param1.field_f) / 2);
          var14 = param1.field_g + param2 + param1.field_h / 2;
          var10.a(var11, var13);
          this.field_d.a(this.b((byte) -82, param1), var14, param3, var9, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("kab.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    kab(caa[] param0) {
        try {
          this.field_d = loa.field_o;
          this.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "kab.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_p = null;
        if (param0 != 777) {
          field_p = (String) null;
        }
    }

    static {
        field_p = "Hull beam";
    }
}
