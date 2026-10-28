/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RockBuster extends IntrusiveNode {
    boolean field_h;
    PointCloudEffect exhaustParticles;
    static Sprite field_j;
    int exhaustWriteIndex;
    PcmSampleStream flightSound;
    int xQ16;
    int angle256;
    int activeExhaustParticles;
    int velocityYQ16;
    int yQ16;
    int velocityXQ16;
    int remainingFlightTicks;

    public static void releaseStatics(byte guard) {
        field_j = null;
        int var1 = -26 / ((guard - 26) / 58);
    }

    final static boolean containsIdentifierIgnoringUnderscores(int guard, String password, String identifier) {
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        try {
          identifier = MouseWheelInput.replaceCharacter(-1, '_', identifier, "");
          String var3 = DynamicTerrainRenderer.reverseString(identifier, false);
          if (guard >= -77) {
            field_j = (Sprite) null;
          }
          boolean stackIn_7_0 = (password.indexOf(identifier) != -1) || (password.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("pi.B(").append(guard).append(',');
          if (password == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (identifier == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    RockBuster() {
    }

    static {
    }
}
