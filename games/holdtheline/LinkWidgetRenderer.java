/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LinkWidgetRenderer implements WidgetRenderer {
    static RotatedSpriteAsset[] field_b;
    static String field_f;
    private int field_g;
    static ResourceArchive field_d;
    private int field_e;
    private BitmapFont field_a;
    static String field_c;

    final static void a(int param0, String param1, boolean param2, PaletteBitmapFont param3, int param4, int param5) {
        try {
          if (!param2) {
            field_f = (String) null;
          }
          param3.drawRightAlignedAlpha(param1, param0 + 1, 1 + param4, 8, -1, 114);
          param3.drawRightAligned(param1, param0, param4, param5, -1);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "am.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        PaletteBitmapFont var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 114) {
            var3 = (PaletteBitmapFont) null;
            LinkWidgetRenderer.a(-98, (String) null, true, (PaletteBitmapFont) null, 48, -52);
          }
          RoadFillRenderer.attachKeyboard((java.awt.Component) ((Object) param0), -116);
          gk.a((java.awt.Component) ((Object) param0), param1 ^ 109);
          if (null == TrackBoundary.field_u) {
            return;
          }
          TrackBoundary.field_u.a((java.awt.Component) ((Object) param0), (byte) 106);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("am.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void drawWidget(boolean param0, int param1, int param2, UiWidget param3, int param4) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HoldTheLine.field_D;
        try {
          if (param2 > -48) {
            field_b = (RotatedSpriteAsset[]) null;
          }
          if (!param3.hovered &&
            !param3.isFocused((byte) -20)) {
            stackIn_8_0 = 2188450;
          } else {
            stackIn_8_0 = 3249872;
          }
          var6_int = stackIn_8_0;
          this.field_a.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + param3.text + "</u>", param3.x + param1, param3.y + param4, param3.width, param3.height, var6_int, -1, this.field_e, this.field_g, this.field_a.ascent + this.field_a.descent);
          if (param3.isFocused((byte) -20)) {
            var7 = this.field_a.measureText(param3.text);
            var8 = this.field_a.descent + this.field_a.ascent;
            var9 = param1 + param3.x;
            var10 = param4 + param3.y;
            if (this.field_e == 2) {
              var9 = var9 + (param3.width - var7);
            } else {
              if (this.field_e == 1) {
                var9 = var9 + (-var7 + param3.width >> 1);
              }
            }
            if (2 == this.field_g) {
              var10 = var10 + (-var8 + param3.height);
            } else {
              if (1 == this.field_g) {
                var10 = var10 + (param3.height - var8 >> 1);
              }
            }
            GrowableObjectList.a(var8, 4 + var7, -2 + var9, var10 + 2, (byte) 19);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("am.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    public LinkWidgetRenderer() {
        this.field_g = 1;
        this.field_e = 1;
        this.field_a = IntrusiveNode.field_g;
    }

    final static void a(int param0, byte param1, fb param2) {
        try {
          AccountTermsPanel.field_O.addLast((byte) -103, param2);
          if (param1 >= -27) {
            fb var4 = (fb) null;
            LinkWidgetRenderer.a(-120, (byte) -6, (fb) null);
          }
          VehicleDefinition.a(param2, param0, 118);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "am.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        field_f = null;
        if (param0 != 1) {
          LinkWidgetRenderer.clearSharedReferences(-13);
        }
    }

    LinkWidgetRenderer(BitmapFont param0, int param1, int param2) {
        try {
          this.field_e = param1;
          this.field_a = param0;
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "am.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Single-player controls:";
    }
}
