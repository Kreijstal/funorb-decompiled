/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPacketBuilder {
    static String field_d;
    static String field_e;
    static QuickChatDynamicCommand field_a;
    static int field_c;
    static boolean field_b;

    public static void releaseStatics(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0) {
          LoginCredentials var2 = (LoginCredentials) null;
          LoginPacketBuilder.buildLoginPacket(true, (LoginCredentials) null, true, true, 25);
        }
    }

    final static void buildLoginPacket(boolean param0, LoginCredentials param1, boolean param2, boolean param3, int param4) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          LoginCredentials.field_d[0] = IntrusiveDeque.field_c.nextInt();
          LoginCredentials.field_d[1] = IntrusiveDeque.field_c.nextInt();
          LoginCredentials.field_d[2] = (int)(LevelData.field_g >> 32);
          LoginCredentials.field_d[3] = (int)LevelData.field_g;
          AccountConsentPanel.field_G.position = 0;
          AccountConsentPanel.field_G.writeInt(LoginCredentials.field_d[0], 613003928);
          AccountConsentPanel.field_G.writeInt(LoginCredentials.field_d[1], 613003928);
          AccountConsentPanel.field_G.writeInt(LoginCredentials.field_d[2], 613003928);
          AccountConsentPanel.field_G.writeInt(LoginCredentials.field_d[3], 613003928);
          GameShell.writeRandomSeed(AccountConsentPanel.field_G, -18);
          AccountConsentPanel.field_G.writeShort(-1947079288, param4);
          param1.writeCredentials(4, AccountConsentPanel.field_G);
          AccountPacketState.field_b.position = 0;
          if (!param3) {
            AccountPacketState.field_b.writeByte((byte) 11, 16);
          } else {
            AccountPacketState.field_b.writeByte((byte) 11, 18);
          }
          AccountPacketState.field_b.position = AccountPacketState.field_b.position + 2;
          var5_int = AccountPacketState.field_b.position;
          AccountPacketState.field_b.writeInt(MidiNote.field_G, 613003928);
          AccountPacketState.field_b.writeLong(1290648728, TextWrappingHelpers.field_d);
          var6 = 0;
          if (IntrusiveDequeCursor.field_g) {
            var6 = var6 | 1;
          }
          if (BeveledFrameFactory.field_g) {
            var6 = var6 | 4;
          }
          if (param0) {
            var6 = var6 | 8;
          }
          if (EmailCheckRequest.field_b != null) {
            var6 = var6 | 16;
          }
          AccountPacketState.field_b.writeByte((byte) 11, var6);
          if (!param2) {
            field_c = -6;
          }
          var7 = SettingsCookieReader.readSettingsCookie(DisplayNameValidator.getActiveApplet(1), (byte) 102);
          if (var7 == null) {
            var7 = "";
          }
          AccountPacketState.field_b.writeCp1252String(var7, false);
          if (null != EmailCheckRequest.field_b) {
            AccountPacketState.field_b.writePrefixedCp1252String(0, EmailCheckRequest.field_b);
          }
          EncryptedLoginHelpers.writeEncryptedPayload(StrongCacheEntry.field_s, 0, ArchiveCatalog.field_d, AccountConsentPanel.field_G, AccountPacketState.field_b);
          AccountPacketState.field_b.backpatchShortLength(AccountPacketState.field_b.position - var5_int, (byte) -67);
          PasswordContentHelpers.flushAccountPackets((byte) -67, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("gi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_d = "This password is part of your Player Name, and would be easy to guess";
        field_e = null;
        field_a = new QuickChatDynamicCommand(11, 0, 1, 2);
    }
}
