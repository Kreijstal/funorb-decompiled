/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialWidgetPainter implements WidgetPainter {
    private int field_f;
    private int field_i;
    private BitmapFont field_e;
    private int field_a;
    private int field_j;
    private int field_c;
    private int field_b;
    private int field_d;
    static int[] field_h;
    static Boolean field_g;

    final static void enqueueAchievementRecord(AchievementRecord record, int opcode, int guard) {
        try {
          RasterSnapshot.field_l.addLast(-12328, record);
          DebouncedValidator.writeAchievementRecord(record, opcode, true);
          if (guard != 1) {
            DialWidgetPainter.b((byte) 98);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "sc.B(" + (record != null ? "{...}" : "null") + ',' + opcode + ',' + guard + ')');
        }
    }

    public final void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        UiComponent stackIn_5_0 = null;
        String stackIn_15_2 = null;
        try {
          if (guard > -14) {
            java.awt.Component var14 = (java.awt.Component) null;
            DialWidgetPainter.detachKeyboardInput((byte) 67, (java.awt.Component) null);
          }
          if (!(component instanceof DialWidget)) {
            stackIn_5_0 = null;
          } else {
            stackIn_5_0 = (UiComponent) (component);
          }
          DialWidget var15 = (DialWidget) (stackIn_5_0);
          SoftwareRasterizer.fillRectangle(component.x + originX, component.y + originY, component.width, component.height, this.field_a);
          if (var15 != null) {
          }
          int var7 = var15.centerX + (originX + component.x);
          int var8 = component.y + (originY + var15.centerY);
          SoftwareRasterizer.fillCircle(var7, var8, var15.radius, this.field_c);
          if (var15.markerValue != -1) {
            double var9 = 2.0 * (3.141592653589793 * (double)var15.markerValue) / (double)var15.stepCount;
            int var11 = (int)(-Math.sin(var9) * (double)var15.radius);
            int var12 = (int)(Math.cos(var9) * (double)var15.radius);
            SoftwareRasterizer.fillCircle(var7 + var11, var12 + var8, 1, this.field_b);
          }
          SoftwareRasterizer.fillCircle(var7, var8, 2, 1);
          double var9Lifetime1 = 3.141592653589793 * (double)var15.value * 2.0 / (double)var15.stepCount;
          int var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var15.radius);
          int var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var15.radius);
          SoftwareRasterizer.drawLine(var7, var8, var11Lifetime1 + var7, var8 + var12Lifetime1, 1);
          if (null == this.field_e) {
            return;
          }
          int var13 = this.field_i + (var15.centerX + var15.radius);
          this.field_e.drawParagraph(component.text, var13 + component.x + originX, originY + (component.y + this.field_f), component.width - (var13 + this.field_i), component.height - (this.field_i << 1), this.field_j, this.field_d, 1, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var6;
          StringBuilder stackIn_14_1 = new StringBuilder().append("sc.M(").append(originX).append(',').append(originY).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(enabled).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (QuickChatPhraseCache.field_e == 10) {
          fe.a(-84);
          QuickChatPhraseCache.field_e = 11;
        } else if (!NetworkGameClient.i(56)) {
          fe.a(-84);
          QuickChatPhraseCache.field_e = 11;
        }
        pb.field_d = true;
        if (param0 < -81) {
          return;
        }
        java.awt.Component var2 = (java.awt.Component) null;
        DialWidgetPainter.detachKeyboardInput((byte) -55, (java.awt.Component) null);
    }

    public static void releaseStatics(byte guard) {
        if (guard >= -15) {
          return;
        }
        field_g = null;
        field_h = null;
    }

    DialWidgetPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_j = param3;
          this.field_b = param6;
          this.field_e = param0;
          this.field_d = param4;
          this.field_f = param2;
          this.field_c = param5;
          this.field_a = param7;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "sc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void detachKeyboardInput(byte guard, java.awt.Component component) {
        component.removeKeyListener(ThreeSliceButtonPainter.field_v);
        component.removeFocusListener(ThreeSliceButtonPainter.field_v);
        if (guard != -58) {
          return;
        }
        try {
          Js5Transport.field_b = -1;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "sc.A(" + guard + ',' + (component != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new int[]{0, 16384, 32768, 49152};
    }
}
