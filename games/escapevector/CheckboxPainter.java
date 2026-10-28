/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxPainter implements WidgetPainter {
    private int field_a;
    private int field_p;
    private int field_m;
    private int field_j;
    static ResourceArchive field_h;
    static ig field_l;
    private int field_g;
    static hf field_q;
    static String field_f;
    private int field_e;
    static boolean field_n;
    private int field_k;
    private BitmapFont field_o;
    private int field_d;
    private int field_i;
    static int field_s;
    static Sprite field_c;
    private int field_r;
    private int field_t;
    static byte[][] spriteAlphas;

    final static int a(BinaryBitmapFont param0, int param1) {
        String stackIn_7_2 = null;
        try {
          if (param1 != 0) {
            spriteAlphas = (byte[][]) null;
          }
          String var2 = " ";
          int var3 = param0.stringWidth(var2);
          int stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("hn.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        UiComponent stackIn_3_0 = null;
        String stackIn_20_2 = null;
        try {
          if (!(component instanceof Checkbox)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiComponent) (component);
          }
          Checkbox var11 = (Checkbox) (stackIn_3_0);
          if (var11 != null) {
            enabled = enabled & var11.enabled;
          }
          int var7 = 5592405;
          SoftwareRasterizer.fillRectangle(originX + component.x, originY + component.y, component.width, component.height, this.field_t);
          if (enabled) {
            var7 = 16777215;
          }
          int var8 = component.x + originX + this.field_e;
          if (guard > -14) {
            return;
          }
          int var9 = this.field_r + (component.y + originY);
          SoftwareRasterizer.drawDropShadow(var8, var9, this.field_a, this.field_k, 5592405);
          SoftwareRasterizer.fillRectangle(var8, var9, this.field_a, this.field_k, var7);
          if (var11.selected) {
            SoftwareRasterizer.drawLine(var8, var9, var8 + this.field_a, this.field_k + var9, 1);
            SoftwareRasterizer.drawLine(var8 + this.field_a, var9, var8, this.field_k + var9, 1);
          }
          if (this.field_o != null) {
            int var10 = this.field_e + (this.field_a + this.field_g);
            this.field_o.drawParagraph(component.text, var10 + originX + component.x, this.field_m + component.y + originY, component.width - (var10 + this.field_g), -(this.field_g << 1) + component.height, this.field_i, this.field_d, this.field_p, this.field_j, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var6;
          StringBuilder stackIn_19_1 = new StringBuilder().append("hn.M(").append(originX).append(',').append(originY).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(enabled).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        spriteAlphas = (byte[][]) null;
        field_f = null;
        if (guard != -44) {
          return;
        }
        field_h = null;
        field_l = null;
        field_q = null;
        field_c = null;
    }

    CheckboxPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_p = 1;
        this.field_j = 1;
        try {
          this.field_m = param2;
          this.field_k = param7;
          this.field_a = param8;
          this.field_r = param6;
          this.field_i = param3;
          this.field_o = param0;
          this.field_g = param1;
          this.field_d = param4;
          this.field_t = param9;
          this.field_e = param5;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = "Time: ";
        field_q = new hf();
    }
}
