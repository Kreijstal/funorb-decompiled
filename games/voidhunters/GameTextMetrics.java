/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameTextMetrics {
    static TextureCoordinateMode field_d;
    static int field_b;
    static String elapsedTimeText;
    static String domainLabelCharacters;

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          domainLabelCharacters = null;
          field_d = null;
          elapsedTimeText = null;
          return;
        }
        field_b = -71;
        domainLabelCharacters = null;
        field_d = null;
        elapsedTimeText = null;
    }

    final static int getStringWidth(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 13879) {
            domainLabelCharacters = (String) null;
          }
          if (OpenGlTexture1D.field_i) {
            stackIn_6_0 = SetTorpedoEnergyUsed.getToolkitFont(param0, param2 ^ 14107).getStringWidth(param1, param2 - 13878);
            return stackIn_6_0;
          }
          stackIn_4_0 = DateOfBirthTextFields.getDefaultBitmapFont(param0, param2 - 5891).getStringWidth(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tea.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_d = new TextureCoordinateMode();
        field_b = 0;
        elapsedTimeText = "Elapsed time";
        domainLabelCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
