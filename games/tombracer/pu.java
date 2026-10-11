/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pu implements isa {
    static int[] field_a;
    static int field_b;

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        hpa.field_f = true;
        if (param1 != 255) {
          return;
        }
        try {
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          lha.a(var3, var2, (byte) 117, var4, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pu.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, byte[][] param3, int[] param4, byte[] param5, byte[][] param6, int[] param7) {
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = TombRacer.field_G ? 1 : 0;
        try {
          var8_int = param7[param0];
          var9 = param4[param0] + var8_int;
          var10 = param7[param1];
          var11 = param4[param1] + var10;
          var12 = var8_int;
          if (var8_int < var10) {
            var12 = var10;
          }
          var13 = var9;
          if (var9 > var11) {
            var13 = var11;
          }
          var14 = 255 & param5[param0];
          if ((param5[param1] & 255) < var14) {
            var14 = param5[param1] & 255;
          }
          var15 = param6[param0];
          if (!param2) {
            field_b = -77;
          }
          var16 = param3[param1];
          var17 = -var8_int + var12;
          var18 = -var10 + var12;
          for (var19 = var12; var13 > var19; var19++) {
            incrementValue$0 = var17;
            var17++;
            incrementValue$1 = var18;
            var18++;
            var20 = var15[incrementValue$0] + var16[incrementValue$1];
            if (var20 < var14) {
              var14 = var20;
            }
          }
          stackIn_18_0 = -var14;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("pu.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        try {
          if (param2 != 16777215) {
            field_a = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pu.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -53) {
          field_a = (int[]) null;
        }
    }

    static {
        field_a = new int[1];
    }
}
