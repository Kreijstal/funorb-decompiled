/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h implements WidgetRenderer {
    static String field_f;
    private int field_g;
    private int field_a;
    private int field_c;
    static MouseWheelInput field_b;
    private int field_e;
    private int field_h;
    private BitmapFont field_d;
    private int field_i;

    public static void clearStaticReferences(byte param0) {
        field_f = null;
        if (param0 != 76) {
          return;
        }
        field_b = null;
    }

    public final void paintWidget(int param0, int param1, int param2, UiWidget param3, boolean param4) {
        int var10 = 0;
        UiWidget stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        tb var12 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (!(param3 instanceof tb)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (UiWidget) (param3);
          }
          var12 = (tb) (stackIn_4_0);
          SoftwareRasterizer.fillRectangle(param1 + param3.field_v, param3.field_m + param0, param3.field_s, param3.field_x, this.field_g);
          if (var12 != null) {
          }
          var7 = param3.field_s - var12.field_G * 2;
          var8 = var12.field_G + param1 + param3.field_v;
          var9 = var12.field_H + param0 + param3.field_m;
          SoftwareRasterizer.drawLine(var8, var9, var8 + var7, var9, this.field_a);
          if (param2 != 15430) {
            field_f = (String) null;
          }
          for (var10 = var12.a((byte) 65) - 1; var10 >= 0; var10--) {
            SoftwareRasterizer.fillCircle(var8 + var12.a(var10, -24584) * var7 / var12.j(11884), var9, this.field_h, this.field_e);
          }
          if (null == this.field_d) {
            return;
          }
          this.field_d.drawCentred(var12.field_n, var8 + var7 / 2, var12.field_H + var9 + this.field_d.field_u, this.field_c, this.field_i);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("h.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    h(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_h = param5;
          this.field_g = param4;
          this.field_c = param1;
          this.field_d = param0;
          this.field_e = param6;
          this.field_i = param2;
          this.field_a = param3;
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_f = "<col=ffffff>Close-range<nbsp>assault<nbsp>gun</col><br>The C.R.A.G. provides heavy stopping power for dealing with nearby targets. Accuracy and damage at range is very low.";
    }
}
