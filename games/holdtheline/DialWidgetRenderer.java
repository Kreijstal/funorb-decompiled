/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialWidgetRenderer implements WidgetRenderer {
    private int field_b;
    private int field_k;
    private int field_j;
    private int field_c;
    private int field_e;
    static RoadStripRenderer field_f;
    private int field_g;
    private int field_d;
    private BitmapFont field_h;
    static AccountProtocolState field_a;
    static SpriteAsset field_i;

    public static void clearSharedReferences(boolean param0) {
        field_i = null;
        field_f = null;
        if (!param0) {
          return;
        }
        field_a = null;
    }

    DialWidgetRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_h = param0;
          this.field_g = param2;
          this.field_c = param4;
          this.field_k = param7;
          this.field_b = param6;
          this.field_j = param5;
          this.field_e = param3;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static int parsePowerupCategory(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.equalsIgnoreCase("red") &&
            !param1.equalsIgnoreCase("weapons")) {
            if (param0 <= 93) {
              DialWidgetRenderer.clearSharedReferences(true);
            }
            if (!param1.equalsIgnoreCase("green") &&
              !param1.equalsIgnoreCase("speed")) {
              if (!param1.equalsIgnoreCase("blue") &&
                !param1.equalsIgnoreCase("shields")) {
                if (!param1.equalsIgnoreCase("black")) {
                  throw new IllegalArgumentException();
                }
                stackIn_19_0 = 3;
                return stackIn_19_0;
              }
              stackIn_16_0 = 2;
              return stackIn_16_0;
            }
            stackIn_11_0 = 1;
            return stackIn_11_0;
          }
          stackIn_4_0 = 0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("vh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public final void drawWidget(boolean param0, int param1, int param2, UiWidget param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        DialWidget var14 = null;
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          if (!(param3 instanceof DialWidget)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiWidget) (param3);
          }
          var14 = (DialWidget) (stackIn_3_0);
          if (var14 == null) {
          }
          SoftwareRasterizer.fillRectangle(param3.x + param1, param4 + param3.y, param3.width, param3.height, this.field_k);
          var7 = var14.field_G + (param3.x + param1);
          var8 = var14.field_J + (param4 + param3.y);
          SoftwareRasterizer.fillCircle(var7, var8, var14.field_P, this.field_j);
          if (var14.field_L != -1) {
            var9 = 2.0 * ((double)var14.field_L * 3.141592653589793) / (double)var14.field_O;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_P);
            var12 = (int)(Math.cos(var9) * (double)var14.field_P);
            SoftwareRasterizer.fillCircle(var7 + var11, var12 + var8, 1, this.field_b);
          }
          SoftwareRasterizer.fillCircle(var7, var8, 2, 1);
          var9Lifetime1 = 2.0 * ((double)var14.field_K * 3.141592653589793) / (double)var14.field_O;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_P);
          if (param2 > -48) {
            this.field_g = -87;
          }
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_P);
          SoftwareRasterizer.drawLine(var7, var8, var7 + var11Lifetime1, var8 + var12Lifetime1, 1);
          if (this.field_h == null) {
            return;
          }
          var13 = var14.field_P + var14.field_G + this.field_d;
          this.field_h.drawParagraph(param3.text, param1 + (param3.x + var13), param4 + param3.y + this.field_g, -this.field_d + (-var13 + param3.width), param3.height - (this.field_d << 1), this.field_e, this.field_c, 1, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("vh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_f = (RoadStripRenderer) ((Object) new ShadedRoadStripRenderer(7, 30.0f, new int[]{8372223, 16777215}));
        field_a = new AccountProtocolState();
    }
}
