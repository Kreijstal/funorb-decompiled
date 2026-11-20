/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetBombletSprayPushMultiplier extends ConsoleCommand {
    static int[] field_o;
    static EmailAvailabilityCheck emailAvailabilityCheck;

    final static ToolkitSprite a(byte param0, GraphicsToolkit param1, Sprite param2) {
        int var4 = 0;
        ToolkitSprite var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        ArgbSprite var6 = null;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        ToolkitSprite stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (!(param2 instanceof ArgbSprite)) {
            var6 = new ArgbSprite(param2.width, param2.height);
            var6.yOffset = param2.yOffset;
            var6.paddedHeight = param2.paddedHeight;
            var6.paddedWidth = param2.paddedWidth;
            var6.xOffset = param2.xOffset;
            for (var4 = 0; var6.pixels.length > var4; var4++) {
              stackIn_6_0 = var6.pixels;
              stackIn_6_1 = var4;
              if (0 != param2.pixels[var4]) {
                stackIn_7_2 = SetAngularForceDownshift.orBits(-16777216, param2.pixels[var4]);
              } else {
                stackIn_7_2 = 0;
              }
              stackIn_6_0[stackIn_6_1] = stackIn_7_2;
            }
            param2 = (Sprite) ((Object) var6);
          }
          if (param0 > -61) {
            field_o = (int[]) null;
          }
          var3 = param1.createSprite(param2.paddedWidth, param2.paddedWidth, param2.pixels, 0, (byte) 64, param2.paddedHeight);
          stackIn_12_0 = var3;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("wba.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            GetBombletSprayPushMultiplier.clearSharedReferences(73);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(190, 116));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wba.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        emailAvailabilityCheck = null;
        if (param0 > -70) {
          emailAvailabilityCheck = (EmailAvailabilityCheck) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    GetBombletSprayPushMultiplier(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
