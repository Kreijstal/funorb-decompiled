/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComboBoxRenderer implements UiRenderer {
    private UiComboBox comboBox;
    static int field_a;
    static Widget field_c;
    static String field_d;

    public static void clearSharedReferences(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 <= 44) {
          UiComboBoxRenderer.clearSharedReferences((byte) 122);
        }
    }

    final static void fillHorizontalSpan(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 != -25) {
          return;
        }
        if (param3 <= param4) {
          GetSalvoRepairTimeMultiplier.fillArraySpan(param0, param4, ResourceNode.field_b[param1], (byte) 75, param3);
          return;
        }
        GetSalvoRepairTimeMultiplier.fillArraySpan(param0, param3, ResourceNode.field_b[param1], (byte) 75, param4);
    }

    UiComboBoxRenderer(UiComboBox param0) {
        try {
          this.comboBox = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bpa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        try {
          var6_int = param1.x + param2;
          var7 = param3 + param1.y;
          ServerTickFactory.a(var7, (byte) 115, param1.height, param1.width, var6_int);
          if (param1.hasFocus((byte) -120)) {
            SetCountermeasureLauncherRandomness.a(var7 + 2, param1.width - 4, 2 + var6_int, param1.height - 4, (byte) -100);
          }
          SoftwareRasterizer2D.setClip(var6_int, var7, param1.width + (var6_int - 2), param1.height + var7);
          var9 = 78 % ((-27 - param0) / 35);
          var8 = this.comboBox.list.getSelectedItem((byte) 96);
          if (var8 != null) {
            var10 = var8.toString();
            this.comboBox.font.draw(var10, 2 + var6_int, -1 + ((this.comboBox.font.maxAscent + param1.height >> 1) + var7), 10000536, -1);
            if (this.comboBox.hasFocus((byte) -120) &&
              var10.startsWith(this.comboBox.typedPrefix)) {
              var11 = this.comboBox.font.getStringWidth(this.comboBox.typedPrefix);
              SoftwareRasterizer2D.fillRectangleAlpha(var6_int + 2, var7 + 2, var11, -4 + param1.height, 2188450, 100);
            }
          }
          SoftwareRasterizer2D.resetClip();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("bpa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_a = 131072;
        field_d = "This game option is only available to members.";
    }
}
