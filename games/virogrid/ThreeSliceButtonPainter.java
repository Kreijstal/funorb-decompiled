/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ThreeSliceButtonPainter extends TextWidgetPainter {
    private int field_u;
    private int field_B;
    private Sprite[] field_x;
    private int field_y;
    static java.awt.Color field_v;
    static int field_C;
    static int[] field_D;
    static int[] field_A;
    static ProgressMessageDialog field_w;
    static int[] field_z;

    public final void drawWidget(int param0, UiWidget param1, boolean param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param1.field_p) {
            stackIn_6_0 = (param1.isFocused(true)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param1 instanceof TextButton) {
            param2 = param2 & ((TextButton) (param1)).field_C;
          }
          if (!param2) {
            stackIn_14_0 = this.field_u;
          } else {
            if (var6_int == 0) {
              stackIn_14_0 = this.field_B;
            } else {
              stackIn_14_0 = this.field_y;
            }
          }
          var7 = stackIn_14_0;
          if (param4 != -23294) {
            return;
          }
          stackIn_19_0 = (param2) ? 16777215 : 7105644;
          var8 = stackIn_19_0;
          EmailAvailabilityValidator.drawThreeSliceBar(this.field_x, param1.field_u + param3 + (param1.field_m - this.field_x[0].field_z >> 1), false, param1.field_g, param1.field_l + param0, var7);
          this.field_i.drawParagraph(param1.field_n, param0 + param1.field_l, param3 + param1.field_u - 2, param1.field_g, param1.field_m, var8, -1, 1, 1, this.field_i.field_H);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("hf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_w = null;
        field_A = null;
        if (param0 >= -79) {
          return;
        }
        field_v = null;
        field_z = null;
        field_D = null;
    }

    private ThreeSliceButtonPainter(int param0, int param1, int param2) {
        this.field_u = param2;
        this.field_x = CanvasPresentHelpers.buttonSprites;
        this.field_B = param0;
        this.field_y = param1;
        this.field_i = LoginRsaKey.arezzo14BoldFont;
    }

    public ThreeSliceButtonPainter() {
        this(2188450, 2591221, 9543);
    }

    static {
        field_v = new java.awt.Color(10040319);
        field_A = new int[8192];
        field_z = new int[8192];
    }
}
