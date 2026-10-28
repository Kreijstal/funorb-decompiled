/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuEdgeSegment extends IntrusiveNode {
    int lowerBranchBudget;
    static String field_p;
    int ageTicks;
    int length;
    static String field_g;
    int y;
    int x;
    int targetLength;
    static LoginMethod field_n;
    int lifetimeTicks;
    int direction;
    static String field_k;
    int upperBranchBudget;

    final static void writeLoginRequest(LoginCredentials credentials, boolean reconnect, int clientValue, boolean option, byte guard) {
        String stackIn_25_2 = null;
        try {
          NameSuggestionsPanel.field_O[0] = QuitPageSupport.field_a.nextInt();
          NameSuggestionsPanel.field_O[1] = QuitPageSupport.field_a.nextInt();
          PathPoint.field_a.position = 0;
          NameSuggestionsPanel.field_O[2] = (int)(SecondaryIntrusiveDeque.field_b >> 32);
          NameSuggestionsPanel.field_O[3] = (int)SecondaryIntrusiveDeque.field_b;
          PathPoint.field_a.writeInt((byte) 126, NameSuggestionsPanel.field_O[0]);
          PathPoint.field_a.writeInt((byte) 123, NameSuggestionsPanel.field_O[1]);
          PathPoint.field_a.writeInt((byte) 124, NameSuggestionsPanel.field_O[2]);
          PathPoint.field_a.writeInt((byte) 126, NameSuggestionsPanel.field_O[3]);
          StripedProgressBar.writeInstallationSeed(0, PathPoint.field_a);
          PathPoint.field_a.writeShort(13, clientValue);
          credentials.writeTo(PathPoint.field_a, (byte) -121);
          QuickChatDynamicCommand.outgoingPackets.position = 0;
          if (!reconnect) {
            QuickChatDynamicCommand.outgoingPackets.writeByte(16, -123);
          } else {
            QuickChatDynamicCommand.outgoingPackets.writeByte(18, -123);
          }
          QuickChatDynamicCommand.outgoingPackets.position = QuickChatDynamicCommand.outgoingPackets.position + 2;
          int var5_int = QuickChatDynamicCommand.outgoingPackets.position;
          QuickChatDynamicCommand.outgoingPackets.writeInt((byte) 123, StripedProgressBar.field_L);
          QuickChatDynamicCommand.outgoingPackets.writeLong(ThreeSliceButtonPainter.field_q, (byte) -23);
          int var6 = 0;
          if (BitCountSupport.field_d) {
            var6 = var6 | 1;
          }
          if (KeyCodeSupport.field_b) {
            var6 = var6 | 4;
          }
          if (option) {
            var6 = var6 | 8;
          }
          if (null != SimulatorSpriteAssets.pendingDisplayName) {
            var6 = var6 | 16;
          }
          QuickChatDynamicCommand.outgoingPackets.writeByte(var6, guard - 24);
          String var7 = PauseMenuScreen.readSettingsCookie(guard ^ 98, PointCloudEffect.activeApplet((byte) -120));
          if (var7 == null) {
            var7 = "";
          }
          QuickChatDynamicCommand.outgoingPackets.writeString(var7, 101);
          if (guard != -99) {
            return;
          }
          if (SimulatorSpriteAssets.pendingDisplayName != null) {
            QuickChatDynamicCommand.outgoingPackets.writeCircumfixedString((byte) 100, SimulatorSpriteAssets.pendingDisplayName);
          }
          AccountPayloadSupport.writeEncryptedPayload(guard ^ -99, QuickChatDynamicCommand.outgoingPackets, PathPoint.field_a, MarkerSlider.field_O, MeshProjectionSupport.field_c);
          QuickChatDynamicCommand.outgoingPackets.backpatchShortLength(-var5_int + QuickChatDynamicCommand.outgoingPackets.position, 32614);
          ClientException.flushAccountPackets(-1, guard + 30884);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_24_0 = var5;
          StringBuilder stackIn_24_1 = new StringBuilder().append("oh.B(");
          if (credentials == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(reconnect).append(',').append(clientValue).append(',').append(option).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        if (guard == -20) {
          field_p = null;
          field_k = null;
          field_n = null;
          field_g = null;
          return;
        }
        LoginCredentials var2 = (LoginCredentials) null;
        MenuEdgeSegment.writeLoginRequest((LoginCredentials) null, true, 101, true, (byte) -46);
        field_p = null;
        field_k = null;
        field_n = null;
        field_g = null;
    }

    MenuEdgeSegment() {
    }

    static {
        field_g = "Extra thrust";
        field_n = new LoginMethod("usename");
        field_k = " - activate shield";
    }
}
