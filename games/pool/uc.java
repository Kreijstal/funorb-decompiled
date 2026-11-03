/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static UiComponent field_b;
    static UiComponent field_a;

    public static void releaseStatics(byte param0) {
        if (param0 != 112) {
          uc.pushRasterSnapshot((byte) 104);
        }
        field_b = null;
        field_a = null;
    }

    final static boolean isNameCharacter(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (td.isAlphanumeric(param0, (byte) 5)) {
          return true;
        }
        if (param1 != -51) {
          uc.a(80);
        }
        if (param0 != 45 &&
          param0 != 160 &&
          param0 != 32) {
          if (95 != param0) {
            return false;
          }
          return true;
        }
        return true;
    }

    final static boolean a(int param0) {
        if (param0 > -95) {
          return false;
        }
        return true;
    }

    final static void pushRasterSnapshot(byte param0) {
        RasterSnapshot var1 = (RasterSnapshot) (cb.field_e.b(-1));
        int var2 = 34 % ((-56 - param0) / 50);
        if (var1 == null) {
          var1 = new RasterSnapshot();
        }
        var1.setRasterState(SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipBottom, -95, SoftwareRasterizer.clipRight, SoftwareRasterizer.pixels, SoftwareRasterizer.clipTop);
        AccountCreationForm.field_S.b((byte) 83, var1);
    }

    final static double[][] a(boolean param0, double[][][] param1) {
        int var3_int = 0;
        int var5 = 0;
        int var6 = 0;
        int incrementValue$1 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        double[][] var3 = null;
        int var4 = 0;
        double[][] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 0;
          if (!param0) {
            uc.pushRasterSnapshot((byte) 42);
          }
          for (var3_int = 0; param1.length > var3_int; var3_int++) {
            var2_int = var2_int + param1[var3_int].length;
          }
          var3 = new double[var2_int][6];
          var4 = 0;
          for (var5 = 0; param1.length > var5; var5++) {
            for (var6 = 0; var6 < param1[var5].length; var6++) {
              incrementValue$1 = var4;
              var4++;
              var3[incrementValue$1] = param1[var5][var6];
            }
          }
          stackIn_12_0 = var3;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("uc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
