/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SoftwareSprite2D {
    int width;
    static String field_c;
    int offsetY;
    int height;
    int canvasWidth;
    static PlatformRequest field_b;
    int canvasHeight;
    int offsetX;

    abstract void draw(int param0, int param1);

    final static void a(int param0) {
        DualLinkNode var2 = null;
        int var3 = VoidHunters.field_G;
        DualLinkNode var2Lifetime1;
        try {
          GetBoostersCooldown.field_p = 0;
          OpenGlIndexBuffer.field_k = 0;
          HslAdjustTextureOperation.field_q = null;
          DisplayModeErrorDialog.field_M.clear(120);
          int var1_int = -31 % ((param0 + 31) / 39);
          SetPointDefenceLaserProjectileOndamageParticles.field_o.clear(97);
          var2 = MenuInputState.field_f.first(-43);
          while (var2 != null) {
            var2.unlinkSecondary((byte) -35);
            var2 = MenuInputState.field_f.next(-1);
          }
          var2Lifetime1 = TeamNodeCondition.field_c.first(-94);
          while (var2Lifetime1 != null) {
            var2Lifetime1.unlinkSecondary((byte) -35);
            var2Lifetime1 = TeamNodeCondition.field_c.next(-1);
          }
          iwa.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ija.G(" + param0 + ')');
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_c = null;
        if (!param0) {
          field_b = (PlatformRequest) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static Object[] a(Object param0, Object[] param1, int param2, GameStateFactory param3) {
        RuntimeException var4 = null;
        GameStateFactory var5 = null;
        Object[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            var5 = (GameStateFactory) null;
            SoftwareSprite2D.a(param1[1], (Object[]) null, ((int[]) (param1[7]))[7], (GameStateFactory) null);
          }
          stackIn_3_0 = GetFighterBayReload.a(param1, param0, false, param3, param2 - 110);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ija.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    abstract void drawWithAlpha(int param0, int param1, int param2);

    static {
        field_c = "Players: ";
    }
}
