/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static int field_a;

    od(uq param0, int param1, int param2, int param3) {
    }

    final static int toOpenGlDataType(boolean param0, GpuDataType param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_2_0 = 25;
            return stackIn_2_0;
          }
          if (GpuDataType.BYTE == param1) {
            stackIn_5_0 = 5120;
            return stackIn_5_0;
          }
          if (param1 == GpuDataType.SHORT) {
            stackIn_27_0 = 5122;
            return stackIn_27_0;
          }
          if (GpuDataType.INT == param1) {
            stackIn_9_0 = 5124;
            return stackIn_9_0;
          }
          if (GpuDataType.UNSIGNED_BYTE == param1) {
            stackIn_12_0 = 5121;
            return stackIn_12_0;
          }
          if (GpuDataType.UNSIGNED_SHORT == param1) {
            stackIn_25_0 = 5123;
            return stackIn_25_0;
          }
          if (GpuDataType.UNSIGNED_INT == param1) {
            stackIn_16_0 = 5125;
            return stackIn_16_0;
          }
          if (GpuDataType.HALF_FLOAT == param1) {
            stackIn_23_0 = 5131;
            return stackIn_23_0;
          }
          if (param1 != GpuDataType.FLOAT) {
            throw new IllegalArgumentException("");
          }
          stackIn_21_0 = 5126;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("od.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        field_a = 0;
    }
}
