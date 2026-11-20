/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vva extends bob {
    static Widget field_r;
    private int field_s;
    private int field_p;
    static byte[] field_u;
    private int field_t;
    private Sprite[] field_q;

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
            stackIn_14_0 = this.field_p;
          } else {
            if (var6_int != 0) {
              stackIn_14_0 = this.field_t;
            } else {
              stackIn_14_0 = this.field_s;
            }
          }
          var8 = stackIn_14_0;
          SetPhysicsCollisionForceMultiplier.a(this.field_q, var8, param1.y + (param3 + (-this.field_q[0].paddedHeight + param1.height >> 1)), param1.width, param2 + param1.x, true);
          stackIn_17_0 = (!param4) ? 7105644 : 16777215;
          var9 = stackIn_17_0;
          this.field_d.drawParagraph(param1.text, param2 + param1.x, param1.y + param3 - 2, param1.width, param1.height, var9, -1, 1, 1, this.field_d.maxAscent);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public vva() {
        this(2188450, 2591221, 9543);
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != 121) {
          return;
        }
        field_r = null;
        field_u = null;
    }

    private vva(int param0, int param1, int param2) {
        this.field_s = param0;
        this.field_q = GetBombletSprayProjectileLife.field_o;
        this.field_p = param2;
        this.field_d = GetBoostersCooldown.field_r;
        this.field_t = param1;
    }

    static {
    }
}
