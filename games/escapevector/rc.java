/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static ak field_a;
    static oi field_b;
    static String field_c;

    final static void a(java.awt.Canvas param0, boolean param1) {
        PointCloudEffect.a((byte) -38, (java.awt.Component) ((Object) param0));
        if (!param1) {
          return;
        }
        try {
          rm.a((java.awt.Component) ((Object) param0), (byte) 38);
          if (ji.field_b != null) {
            ji.field_b.a((java.awt.Component) ((Object) param0), true);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "rc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int var9 = EscapeVector.obfuscationControl;
        if (param4) {
          if (param7 > param5) {
            if (param2 > param7) {
              ha.a(param6, param7, param5, param1, param0, 41, param3, param2, SoftwareRasterizer.pixels);
              return;
            }
            if (param5 < param2) {
              ha.a(param0, param2, param5, param1, param6, 38, param3, param7, SoftwareRasterizer.pixels);
              return;
            }
            ha.a(param1, param5, param2, param0, param6, 127, param3, param7, SoftwareRasterizer.pixels);
            return;
          }
          if (param5 < param2) {
            ha.a(param1, param5, param7, param6, param0, 42, param3, param2, SoftwareRasterizer.pixels);
            return;
          }
          if (param2 <= param7) {
            ha.a(param6, param7, param2, param0, param1, 66, param3, param5, SoftwareRasterizer.pixels);
            return;
          }
          ha.a(param0, param2, param7, param6, param1, 120, param3, param5, SoftwareRasterizer.pixels);
          return;
        }
        rc.a(-25);
        if (param7 > param5) {
          if (param2 > param7) {
            ha.a(param6, param7, param5, param1, param0, 41, param3, param2, SoftwareRasterizer.pixels);
            return;
          }
          if (param5 < param2) {
            ha.a(param0, param2, param5, param1, param6, 38, param3, param7, SoftwareRasterizer.pixels);
            return;
          }
          ha.a(param1, param5, param2, param0, param6, 127, param3, param7, SoftwareRasterizer.pixels);
          return;
        }
        if (param5 < param2) {
          ha.a(param1, param5, param7, param6, param0, 42, param3, param2, SoftwareRasterizer.pixels);
          return;
        }
        if (param2 <= param7) {
          ha.a(param6, param7, param2, param0, param1, 66, param3, param5, SoftwareRasterizer.pixels);
          return;
        }
        ha.a(param0, param2, param7, param6, param1, 120, param3, param5, SoftwareRasterizer.pixels);
    }

    public static void a(int param0) {
        if (param0 == -49153) {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_b = (oi) null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static fn a(int param0, byte param1, fn param2, fn param3) {
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        try {
          int var4_int = param3.field_c;
          int var5 = param3.field_b;
          if (param0 == 16384) {
            var5 = param2.field_c;
            var4_int = param3.field_b;
          }
          if (param0 == 32768) {
            var4_int = param2.field_c;
            var5 = param2.field_b;
          }
          if (param0 == 49152) {
            var5 = param3.field_c;
            var4_int = param2.field_b;
          }
          if (param1 <= 119) {
            field_b = (oi) null;
          }
          fn stackIn_12_0 = new fn(var4_int, var5);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("rc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_c = "Out of shield!";
    }
}
