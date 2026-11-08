/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatLineMenuHelpers {
    static String field_d;
    static String field_c;
    static String field_b;
    static String field_a;
    static String field_f;
    static ChatMessage[] field_e;

    public static void releaseStatics(int param0) {
        if (param0 < 33) {
          return;
        }
        field_e = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static void openChatMessageContextMenu(ChatMessage param0, int param1) {
        SceneWidget stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        PlayerContextMenu var6 = null;
        String var7 = null;
        PlayerContextMenu var8 = null;
        String var9 = null;
        PlayerContextMenu var10 = null;
        String var11 = null;
        PlayerContextMenu var12 = null;
        String var13 = null;
        PlayerContextMenu var14 = null;
        try {
          stackIn_2_0 = param0.field_m;
          if (param0.field_k != 1) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = param0.field_e;
          }
          TextAndMenuHelpers.openPlayerContextMenu(stackIn_2_0, stackIn_3_1, param0.field_k, (int[]) null, param0.field_p, param0.field_d, 1073741824, param0.field_j, (ScrollContainer) null);
          if (~param0.field_k == param1 &&
            !ScrollContainer.isLoginPromptIdle((byte) 120) &&
            LoginEncryptionHelpers.field_b == null &&
            null == ByteArrayPoolHelpers.field_a) {
            if (!DesignerPageTables.field_g) {
              var6 = AudioService.field_i;
              var7 = ListRequestHelpers.field_d;
              var6.field_j.addItem(2, 14, var7);
            }
            var8 = AudioService.field_i;
            var9 = NameAvailabilityValidator.field_u;
            var8.field_j.addItem(2, 20, var9);
          }
          if (param0.field_k == 1 &&
            !ScrollContainer.isLoginPromptIdle((byte) 37) &&
            LoginEncryptionHelpers.field_b != null &&
            param0.field_e == LoginEncryptionHelpers.field_b.getGameId(-120)) {
            if (!DesignerPageTables.field_g) {
              var10 = AudioService.field_i;
              var11 = LoginCredentialHelpers.field_g;
              var10.field_j.addItem(param1 + 3, 14, var11);
            }
            var12 = AudioService.field_i;
            var13 = LinkButtonPainter.field_g;
            var12.field_j.addItem(2, 20, var13);
          }
          AudioService.field_i.addLobbyGameActions((byte) 64);
          AudioService.field_i.addGameInviteActions(false, (byte) -79);
          AudioService.field_i.addSocialActions(param0.field_l, -2, param0.field_k);
          AudioService.field_i.addReportAction(-99);
          AudioService.field_i.addChatFilterActions(0, param0);
          var14 = AudioService.field_i;
          var3 = TextButton.field_S;
          var4 = BufferedRandomAccessFile.field_j;
          var14.field_j.layoutItems(0, 0, var4, (byte) -97, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ph.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean isCanvasResizeAllowed(int param0) {
        if (param0 != 12412) {
          field_f = (String) null;
          if (AssetDecoders.field_a == null) {
            return false;
          }
          if (AssetDecoders.field_a.canResizeViewport((byte) -60)) {
            return true;
          }
          return false;
        }
        if (AssetDecoders.field_a == null) {
          return false;
        }
        if (AssetDecoders.field_a.canResizeViewport((byte) -60)) {
          return true;
        }
        return false;
    }

    final static void setPopupItemColours(int param0, int param1, int param2, int param3) {
        ClientGlobals.field_i = param0;
        if (param3 >= -62) {
          return;
        }
        PopupMenuSupport.field_e = param1;
        CipherPacketBuffer.field_I = param2;
    }

    static {
        field_c = "Please try again in a few minutes.";
        field_a = "Players: ";
        field_b = "Open in popup window";
        field_f = "Try changing the '<%0>' setting.";
        field_d = "TOTAL: <img=24><col=<%1>><%0></col>";
    }
}
