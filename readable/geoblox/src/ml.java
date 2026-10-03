/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends TextWidgetRenderer {
    static String createSelectAlternativeText;
    static PlatformTaskDispatcher field_s;
    static pf field_t;
    static int field_r;
    private int field_w;
    private int field_x;
    private int field_v;
    private Sprite[] field_y;

    public ml() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, int param1, int param2, boolean param3, UiWidget param4) {
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
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
          if (!param4.pointerInside) {
            stackIn_6_0 = (param4.hasKeyboardFocus((byte) 54)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param4 instanceof ButtonWidget) {
            param3 = param3 & ((ButtonWidget) ((Object) param4)).enabled;
          }
          if (param1 >= -5) {
            ml.c(-17);
          }
          if (param3) {
            if (var6_int == 0) {
              stackIn_16_0 = this.field_w;
            } else {
              stackIn_16_0 = this.field_x;
            }
          } else {
            stackIn_16_0 = this.field_v;
          }
          var7 = stackIn_16_0;
          jf.a(this.field_y, var7, param0 + param4.widgetX, param4.widgetWidth, (-this.field_y[0].fullHeight + param4.widgetHeight >> 1) + (param2 + param4.widgetY), -17154);
          stackIn_19_0 = (param3) ? 16777215 : 7105644;
          var8 = stackIn_19_0;
          this.field_n.drawParagraph(param4.widgetText, param4.widgetX + param0, -2 + param2 + param4.widgetY, param4.widgetWidth, param4.widgetHeight, var8, -1, 1, 1, this.field_n.maxAscent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ml.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 == 16777215) {
            createSelectAlternativeText = null;
            field_t = null;
            field_s = null;
            return;
        }
        ml.b(11);
        createSelectAlternativeText = null;
        field_t = null;
        field_s = null;
    }

    private ml(int param0, int param1, int param2) {
        this.field_n = hh.field_c;
        this.field_w = param0;
        this.field_v = param2;
        this.field_x = param1;
        this.field_y = MouseWheelInput.field_e;
    }

    final static String c(int param0) {
        String var1 = null;
        if (param0 == 7789) {
            var1 = "";
            if (!(null == field_t)) {
                var1 = field_t.h(87);
            }
            if (var1.length() == 0) {
                var1 = DualLinkNode.d((byte) -53);
            }
            if (!(var1.length() != 0)) {
                var1 = th.defaultPlayerNameText;
            }
            return var1;
        }
        return (String) null;
    }

    static {
        createSelectAlternativeText = "Use this alternative as your account name";
    }
}
