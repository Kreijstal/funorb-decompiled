/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountPayloadSupport {
    static PathPoint field_a;
    static volatile long field_c;
    static Sprite[] field_d;
    static int field_b;

    public static void releaseStatics(boolean guard) {
        field_a = null;
        if (guard) {
          field_d = null;
          return;
        }
        java.math.BigInteger var2 = (java.math.BigInteger) null;
        AccountPayloadSupport.writeEncryptedPayload(-123, (PacketBuffer) null, (PacketBuffer) null, (java.math.BigInteger) null, (java.math.BigInteger) null);
        field_d = null;
    }

    final static void writeEncryptedPayload(int offset, PacketBuffer destination, PacketBuffer source, java.math.BigInteger exponent, java.math.BigInteger modulus) {
        try {
          TransitionPoint.writeEncryptedAccountPayload(modulus, false, exponent, source.payload, destination, source.position, offset);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "bn.B(" + offset + ',' + (destination != null ? "{...}" : "null") + ',' + (source != null ? "{...}" : "null") + ',' + (exponent != null ? "{...}" : "null") + ',' + (modulus != null ? "{...}" : "null") + ')');
        }
    }

    final static void installAchievementIcons(Sprite[] icons, int start) {
        String stackIn_11_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (ProxySocketConnector.achievementDefinitions == null) {
            return;
          }
          AchievementDefinition[] var8 = ProxySocketConnector.achievementDefinitions;
          AchievementDefinition[] var2 = var8;
          for (int var3 = start; var8.length > var3; var3++) {
            AchievementDefinition var4 = var8[var3];
            int var5 = var4.achievementId;
            Sprite var6 = icons[var5];
            var4.icon = var6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var2_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("bn.C(");
          if (icons == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(start).append(')').toString());
        }
    }

    static {
        field_a = new PathPoint(0, 0);
        field_c = 0L;
        field_b = 0;
    }
}
