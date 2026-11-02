/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends DefaultWidgetRenderer {
    static IndexedSprite field_u;
    private int field_x;
    private int field_v;
    private int field_w;
    private Sprite[] field_t;

    public static void releaseStatics(int param0) {
        if (param0 != 16777215) {
          field_u = (IndexedSprite) null;
          field_u = null;
          return;
        }
        field_u = null;
    }

    public final void a(int param0, UiWidget param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param1.mouseOver) {
            stackIn_6_0 = (param1.isFocused(1023)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param1 instanceof InteractiveWidget) {
            param4 = param4 & ((InteractiveWidget) (param1)).field_z;
          }
          if (param4) {
            if (var6_int != 0) {
              stackIn_13_0 = this.field_v;
            } else {
              stackIn_13_0 = this.field_x;
            }
          } else {
            stackIn_13_0 = this.field_w;
          }
          var7 = stackIn_13_0;
          BufferedSocket.a(param1.x + param0, var7, 447, param1.y + param3 + (param1.height - this.field_t[0].field_o >> 1), param1.width, this.field_t);
          stackIn_16_0 = (param4) ? 16777215 : 7105644;
          var8 = stackIn_16_0;
          if (param2 != 32679) {
            ff.releaseStatics(122);
          }
          this.field_l.drawParagraph(param1.text, param1.x + param0, -2 + (param1.y + param3), param1.width, param1.height, var8, -1, 1, 1, this.field_l.field_u);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("ff.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private ff(int param0, int param1, int param2) {
        this.field_w = param2;
        this.field_x = param0;
        this.field_v = param1;
        this.field_l = qia.field_a;
        this.field_t = DamageTileEffect.field_k;
    }

    public ff() {
        this(2188450, 2591221, 9543);
    }

    static {
    }
}
