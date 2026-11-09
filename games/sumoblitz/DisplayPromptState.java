/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayPromptState {
    final static void a(int param0, byte param1) {
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (5 <= BufferedCacheFile.nextGameplayRandomInt((byte) -84, 10)) {
          if (5 > BufferedCacheFile.nextGameplayRandomInt((byte) -84, 10)) {
            LoginPacketWriter.field_a = LoginPacketWriter.field_a - param0;
          } else {
            GraphicsToolkit.field_f = GraphicsToolkit.field_f - param0;
          }
          if (BufferedCacheFile.nextGameplayRandomInt((byte) -84, 10) < 5) {
            QuickChatCommand.field_a = QuickChatCommand.field_a - param0;
          } else {
            SoftwareTransform3D.field_b = SoftwareTransform3D.field_b - param0;
          }
        } else {
          if (BufferedCacheFile.nextGameplayRandomInt((byte) -84, 10) >= 5) {
            SoftwareTransform3D.field_b = SoftwareTransform3D.field_b + param0;
          } else {
            QuickChatCommand.field_a = QuickChatCommand.field_a + param0;
          }
          if (BufferedCacheFile.nextGameplayRandomInt((byte) -84, 10) >= 5) {
            GraphicsToolkit.field_f = GraphicsToolkit.field_f + param0;
          } else {
            LoginPacketWriter.field_a = LoginPacketWriter.field_a + param0;
          }
        }
        if (param1 < -92) {
          return;
        }
        DisplayPromptState.a(-126, (byte) 36);
    }

    final static boolean isDisplayPromptOpen(byte guard) {
        int var1 = 59 / ((50 - guard) / 50);
        return LimitedRandomAccessFile.field_d;
    }

    static {
    }
}
