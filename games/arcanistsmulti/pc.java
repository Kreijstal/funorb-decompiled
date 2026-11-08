/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static ConnectionState field_g;
    static PcmStreamMixer field_e;
    static String field_f;
    static String field_a;
    static String field_d;
    static int field_b;
    static String field_c;

    public static void releaseStatics(boolean param0) {
        field_d = null;
        if (param0) {
          return;
        }
        field_f = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_c = null;
    }

    final static void drawTexturedSprite(int[] param0, int param1, int[] param2, int[] param3, byte param4, int[] param5, Sprite param6, int param7) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var15Lifetime1;
        int var15Lifetime2;
        try {
          if (param6 == null) {
            return;
          }
          var8_int = -24 / ((-43 - param4) / 34);
          param7 = param7 + param6.field_x;
          param1 = param1 + param6.field_o;
          var9 = param7 + SoftwareRasterizer.field_e * param1;
          var10 = 0;
          var11 = param6.field_y;
          var12 = param6.field_q;
          var13 = -var12 + SoftwareRasterizer.field_e;
          if (SoftwareRasterizer.field_c > param1) {
            var15 = -param1 + SoftwareRasterizer.field_c;
            var10 = var10 + var15 * var12;
            var9 = var9 + SoftwareRasterizer.field_e * var15;
            var11 = var11 - var15;
            param1 = SoftwareRasterizer.field_c;
          }
          var14 = 0;
          if (SoftwareRasterizer.field_i > param7) {
            var15Lifetime1 = -param7 + SoftwareRasterizer.field_i;
            var10 = var10 + var15Lifetime1;
            var13 = var13 + var15Lifetime1;
            var14 = var14 + var15Lifetime1;
            var12 = var12 - var15Lifetime1;
            var9 = var9 + var15Lifetime1;
            param7 = SoftwareRasterizer.field_i;
          }
          if (param1 + var11 > SoftwareRasterizer.field_k) {
            var11 = var11 - (-SoftwareRasterizer.field_k + var11 + param1);
          }
          if (param7 + var12 > SoftwareRasterizer.field_h) {
            var15Lifetime2 = -SoftwareRasterizer.field_h + param7 + var12;
            var12 = var12 - var15Lifetime2;
            var14 = var14 + var15Lifetime2;
            var13 = var13 + var15Lifetime2;
          }
          if (0 < var12 &&
            0 < var11) {
            ClipState.blitTextureRows(param0, var10, var13, var11, param6.field_A, param5, 0, 0, (byte) -99, param3, var14, var9, param2, var12, SoftwareRasterizer.field_l, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("pc.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param6 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_a = "<shad><col=<%0>>FROST</col></shad>";
        field_d = "More suggestions";
        field_f = "Lesson 3 of 7<br><br>Use of a basic guided spell in a safe and secure environment.<br><br>Use the Arcane Arrows spell to destroy all three targets.<br><br><br>* Targeting with the focus point *<br>* Using the focus point to hit targets behind cover *";
        field_c = "You cannot join this game - it is in progress";
        field_g = new ConnectionState();
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void drawTexturedSpriteIntGuard(int[] param0, int param1, int[] param2, int[] param3, int param4, int[] param5, Sprite param6, int param7) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var15Lifetime1;
        int var15Lifetime2;
        try {
          if (param6 == null) {
            return;
          }
          var8_int = -24 / ((-43 - param4) / 34);
          param7 = param7 + param6.field_x;
          param1 = param1 + param6.field_o;
          var9 = param7 + SoftwareRasterizer.field_e * param1;
          var10 = 0;
          var11 = param6.field_y;
          var12 = param6.field_q;
          var13 = -var12 + SoftwareRasterizer.field_e;
          if (SoftwareRasterizer.field_c > param1) {
            var15 = -param1 + SoftwareRasterizer.field_c;
            var10 = var10 + var15 * var12;
            var9 = var9 + SoftwareRasterizer.field_e * var15;
            var11 = var11 - var15;
            param1 = SoftwareRasterizer.field_c;
          }
          var14 = 0;
          if (SoftwareRasterizer.field_i > param7) {
            var15Lifetime1 = -param7 + SoftwareRasterizer.field_i;
            var10 = var10 + var15Lifetime1;
            var13 = var13 + var15Lifetime1;
            var14 = var14 + var15Lifetime1;
            var12 = var12 - var15Lifetime1;
            var9 = var9 + var15Lifetime1;
            param7 = SoftwareRasterizer.field_i;
          }
          if (param1 + var11 > SoftwareRasterizer.field_k) {
            var11 = var11 - (-SoftwareRasterizer.field_k + var11 + param1);
          }
          if (param7 + var12 > SoftwareRasterizer.field_h) {
            var15Lifetime2 = -SoftwareRasterizer.field_h + param7 + var12;
            var12 = var12 - var15Lifetime2;
            var14 = var14 + var15Lifetime2;
            var13 = var13 + var15Lifetime2;
          }
          if (0 < var12 &&
            0 < var11) {
            ClipState.blitTextureRows(param0, var10, var13, var11, param6.field_A, param5, 0, 0, (byte) -99, param3, var14, var9, param2, var12, SoftwareRasterizer.field_l, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("pc.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param6 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param7).append(')').toString());
        }
    }
}
