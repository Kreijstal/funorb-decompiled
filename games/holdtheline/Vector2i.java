/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Vector2i {
    static InputValidationError field_h;
    static String field_b;
    int x;
    static RotatedSpriteSheetAsset field_d;
    static int[] field_g;
    static String field_j;
    static String field_f;
    static boolean field_c;
    int y;
    static int[] field_e;
    static String[] field_i;

    static int xor(int param0, int param1) {
        return param0 ^ param1;
    }

    final int dot(int param0, Vector2i param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -80) {
            stackIn_4_0 = this.x * param1.x + this.y * param1.y;
            return stackIn_4_0;
          }
          stackIn_2_0 = -14;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int lengthSquared(int param0) {
        int var2 = 55 % ((-50 - param0) / 49);
        return this.x * this.x + this.y * this.y;
    }

    final Vector2f divideToFloat(float param0, byte param1) {
        if (param1 >= 119) {
          return new Vector2f((float)this.x / param0, (float)this.y / param0);
        }
        field_e = (int[]) null;
        return new Vector2f((float)this.x / param0, (float)this.y / param0);
    }

    public static void clearSharedReferences(byte param0) {
        field_g = null;
        field_e = null;
        field_f = null;
        field_j = null;
        field_d = null;
        field_i = null;
        field_b = null;
        field_h = null;
        if (param0 <= 90) {
          field_i = (String[]) null;
        }
    }

    final int cross(boolean param0, Vector2i param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_f = (String) null;
          }
          stackIn_3_0 = -(param1.x * this.y) + this.x * param1.y;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static Vector2f a(BoundaryCurve param0, BoundaryCurve param1, int param2) {
        Vector2f var3 = null;
        RuntimeException var3_ref = null;
        Vector2f var4 = null;
        Vector2f var5 = null;
        Vector2f var6 = null;
        float var7 = 0.0f;
        BoundaryCurve var8 = null;
        Vector2f stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.getEndDirection(false);
          var4 = param1.getStartDirection(-1);
          var5 = var4.perpendicular((byte) -119);
          var6 = new Vector2f(var4);
          var6.subtract(var3, param2 ^ 2095);
          if (param2 != 3251) {
            var8 = (BoundaryCurve) null;
            Vector2i.a((BoundaryCurve) null, (BoundaryCurve) null, -127);
          }
          if (!(0.0010000000474974513f > Math.abs(var5.dot(var6, (byte) -10)))) {
            var6.normalize(-1);
            var7 = var5.dot(var6, (byte) -10);
            var6.scale(1.0f / var7, -1);
          } else {
            var6 = var5;
          }
          stackIn_6_0 = var6;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("wb.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, PaletteBitmapFont param10) {
        try {
          param10.drawParagraph(param1, 1 + param6, 1 + param5, param4, param7, 8, -1, 114, param9, param3, param0);
          param10.drawParagraph(param1, param6, param5, param4, param7, param2, param8, param9, param3, param0);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "wb.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ')');
        }
    }

    final Vector2f normalized(int param0) {
        int var3 = 11 % ((-68 - param0) / 44);
        float var2 = (float)Math.sqrt((double)(this.x * this.x + this.y * this.y));
        return new Vector2f((float)this.x / var2, (float)this.y / var2);
    }

    Vector2i(int param0, int param1) {
        this.x = param0;
        this.y = param1;
    }

    Vector2i(Point2i param0, Point2i param1) {
        try {
          this.y = param1.y - param0.y;
          this.x = -param0.x + param1.x;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "wb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new InputValidationError();
        field_f = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_j = "Invalid password.";
        field_e = new int[8192];
        field_b = "Collecting <col=1>1 or 2 blue or green</col> powerups has a lasting effect that does not need to be activated.";
        field_i = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
