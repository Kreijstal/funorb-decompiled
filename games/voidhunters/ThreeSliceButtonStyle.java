/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ThreeSliceButtonStyle extends UiTextStyle {
    static Widget field_r;
    private int normalTint;
    private int disabledTint;
    static byte[] field_u;
    private int highlightTint;
    private Sprite[] backgroundSprites;

    public final void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          var7 = 112 / ((param0 + 27) / 35);
          if (!param1.hovered) {
            stackIn_6_0 = (param1.hasFocus((byte) -120)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param1 instanceof UiFocusableComponent) {
            param4 = param4 & ((UiFocusableComponent) (param1)).enabled;
          }
          if (!param4) {
            stackIn_14_0 = this.disabledTint;
          } else {
            if (var6_int != 0) {
              stackIn_14_0 = this.highlightTint;
            } else {
              stackIn_14_0 = this.normalTint;
            }
          }
          var8 = stackIn_14_0;
          SetPhysicsCollisionForceMultiplier.drawTintedThreeSliceStrip(this.backgroundSprites, var8, param1.y + (param3 + (-this.backgroundSprites[0].paddedHeight + param1.height >> 1)), param1.width, param2 + param1.x, true);
          stackIn_17_0 = (!param4) ? 7105644 : 16777215;
          var9 = stackIn_17_0;
          this.font.drawParagraph(param1.text, param2 + param1.x, param1.y + param3 - 2, param1.width, param1.height, var9, -1, 1, 1, this.font.maxAscent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("vva.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public ThreeSliceButtonStyle() {
        this(2188450, 2591221, 9543);
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != 121) {
          return;
        }
        field_r = null;
        field_u = null;
    }

    private ThreeSliceButtonStyle(int param0, int param1, int param2) {
        this.normalTint = param0;
        this.backgroundSprites = GetBombletSprayProjectileLife.field_o;
        this.disabledTint = param2;
        this.font = GetBoostersCooldown.field_r;
        this.highlightTint = param1;
    }

    static {
    }
}
