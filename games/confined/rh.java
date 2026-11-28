/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends RichTextWidget {
    private int field_Y;
    private RgbSprite field_eb;
    static ej field_ab;
    private String field_cb;
    private FieldValidator field_bb;
    static int field_X;
    static String field_db;
    static RgbSprite field_Z;

    final void drawWidget(int param0, int param1, byte param2, int param3) {
        String var5;
        fi var6;
        int var13;
        Object var17;
        Object var23;
        int var9;
        int var10;
        int var11;
        int var12;
        RgbSprite var16;
        RgbSprite var18;
        RgbSprite var19;
        RgbSprite var20;
        RgbSprite var21;
        RgbSprite var24;
        RgbSprite var25;
        RgbSprite var26;
        TextWidgetRenderer var27;
        TextWidgetRenderer var28;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        fi var6Lifetime1;
        fi var6Lifetime2;
        var17 = null;
        var23 = null;
        var13 = Confined.field_J ? 1 : 0;
        var6 = this.field_bb.getValidationStatus(-3621);
        if (ab.field_b != var6 &&
          qh.field_x != var6) {
          var5 = this.field_bb.getValidationMessage((byte) 75);
          if (var5 == null) {
            var5 = this.field_cb;
          }
        } else {
          var5 = lk.field_f;
        }
        if (!var5.equals(this.field_B)) {
          this.field_B = var5;
          this.rebuildHotspotBounds(false);
        }
        if (param2 >= 36) {
          super.drawWidget(param0, param1, (byte) 94, param3);
          var6Lifetime1 = this.field_bb.getValidationStatus(-3621);
          var28 = (TextWidgetRenderer) ((Object) this.field_n);
          var9 = this.field_q + param3;
          var10 = var28.getTextOriginY(param0, 2, (UiWidget) (this)) + (var28.getTextLayout((UiWidget) (this), (byte) -88).getLayoutHeight(23791) >> 1);
          if (ab.field_b != var6Lifetime1 &&
            var6Lifetime1 != qh.field_x) {
            if (var6Lifetime1 == fb.field_e) {
              var24 = gg.field_q[2];
              var24.drawAdditive(var9, -(var24.field_w >> 1) + var10, 256);
              return;
            }
            if (TextHotspotBounds.field_q != var6Lifetime1) {
              return;
            }
            var25 = gg.field_q[1];
            var25.drawAdditive(var9, var10 - (var25.field_w >> 1), 256);
            return;
          }
          var26 = gg.field_q[0];
          var11 = var26.field_t << 1;
          var12 = var26.field_x << 1;
          if (null == this.field_eb) {
            this.field_eb = new RgbSprite(var11, var12);
            vm.a(this.field_eb, -8409);
          } else {
            if (var11 > this.field_eb.field_u) {
              this.field_eb = new RgbSprite(var11, var12);
              vm.a(this.field_eb, -8409);
            } else {
              if (this.field_eb.field_w < var12) {
                this.field_eb = new RgbSprite(var11, var12);
                vm.a(this.field_eb, -8409);
              } else {
                vm.a(this.field_eb, -8409);
                SoftwareRasterizer.clearRaster();
              }
            }
          }
          var26.drawRotatedAbout(112, 144, var26.field_t << 4, var26.field_x << 4, -this.field_Y << 10, 4096);
          StripedProgressWidget.b(false);
          this.field_eb.drawAdditive(var9 - (var26.field_t >> 1), var10 - var26.field_x, 256);
          return;
        }
        this.drawWidget(-64, 111, (byte) -111, 110);
        super.drawWidget(param0, param1, (byte) 94, param3);
        var6Lifetime2 = this.field_bb.getValidationStatus(-3621);
        var27 = (TextWidgetRenderer) ((Object) this.field_n);
        var9Lifetime1 = this.field_q + param3;
        var10Lifetime1 = var27.getTextOriginY(param0, 2, (UiWidget) (this)) + (var27.getTextLayout((UiWidget) (this), (byte) -88).getLayoutHeight(23791) >> 1);
        if (ab.field_b == var6Lifetime2) {
          var18 = gg.field_q[0];
          var11Lifetime1 = var18.field_t << 1;
          var12Lifetime1 = var18.field_x << 1;
          if (null != this.field_eb &&
            var11Lifetime1 <= this.field_eb.field_u &&
            this.field_eb.field_w >= var12Lifetime1) {
            vm.a(this.field_eb, -8409);
            SoftwareRasterizer.clearRaster();
          } else {
            this.field_eb = new RgbSprite(var11Lifetime1, var12Lifetime1);
            vm.a(this.field_eb, -8409);
          }
          var18.drawRotatedAbout(112, 144, var18.field_t << 4, var18.field_x << 4, -this.field_Y << 10, 4096);
          StripedProgressWidget.b(false);
          this.field_eb.drawAdditive(var9Lifetime1 - (var18.field_t >> 1), var10Lifetime1 - var18.field_x, 256);
          return;
        }
        if (var6Lifetime2 != qh.field_x) {
          if (var6Lifetime2 == fb.field_e) {
            var20 = gg.field_q[2];
            var20.drawAdditive(var9Lifetime1, -(var20.field_w >> 1) + var10Lifetime1, 256);
            return;
          }
          if (TextHotspotBounds.field_q != var6Lifetime2) {
            return;
          }
          var21 = gg.field_q[1];
          var21.drawAdditive(var9Lifetime1, var10Lifetime1 - (var21.field_w >> 1), 256);
          return;
        }
        var19 = gg.field_q[0];
        var16 = var19;
        var11Lifetime2 = var19.field_t << 1;
        var12Lifetime2 = var19.field_x << 1;
        if (null != this.field_eb &&
          var11Lifetime2 <= this.field_eb.field_u &&
          this.field_eb.field_w >= var12Lifetime2) {
          vm.a(this.field_eb, -8409);
          SoftwareRasterizer.clearRaster();
        } else {
          this.field_eb = new RgbSprite(var11Lifetime2, var12Lifetime2);
          vm.a(this.field_eb, -8409);
        }
        var19.drawRotatedAbout(112, 144, var19.field_t << 4, var19.field_x << 4, -this.field_Y << 10, 4096);
        StripedProgressWidget.b(false);
        this.field_eb.drawAdditive(var9Lifetime1 - (var19.field_t >> 1), var10Lifetime1 - var19.field_x, 256);
        return;
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_Z = null;
        field_db = null;
        if (param0 != 8692) {
          rh.clearDeclaredStaticReferences(-116);
          field_ab = null;
          return;
        }
        field_ab = null;
    }

    final boolean takeFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 418) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rh.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    rh(FieldValidator param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, kc.a((byte) 93));
        try {
          this.field_cb = param1;
          this.field_bb = param0;
          this.setBounds(-123, param4, param3, param5, param2);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        try {
          this.field_Y = this.field_Y + 1;
          super.updatePointer(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "rh.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String getTooltipText(byte param0) {
        if (param0 <= -82) {
          return null;
        }
        UiWidget var3 = (UiWidget) null;
        this.takeFocus((UiWidget) null, -88);
        return null;
    }

    static {
        field_ab = new ej();
        field_X = 0;
        field_db = "You already have lasers";
    }
}
