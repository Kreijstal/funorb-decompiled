/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QueuedLobbyRequest extends IntrusiveNode {
    int[] field_o;
    static String field_n;
    static boolean field_l;
    int field_p;
    static SceneWidget field_m;
    static String field_k;

    final static boolean isLocalPlayerName(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            return true;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_4_0 = LobbyGame.field_Hb.equals(DisplayNameHelpers.normalizeDisplayName(var3, (byte) 72));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("sm.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void handleNameEntryResult(int param0, boolean param1, int param2) {
        int var3;
        Object var4;
        Object var5;
        String var6;
        CharSequence var7;
        CharSequence var8;
        int var3Lifetime1;
        Object var4Lifetime1;
        Object var5Lifetime1;
        String var6Lifetime1;
        if (param2 != 0) {
          field_l = true;
          if (CanvasInputHelpers.field_f == null) {
            return;
          }
          var3 = CanvasInputHelpers.field_f.updateAndPollNameInput(-126, param1);
          if (var3 == 0) {
            return;
          }
          if (2 == var3 &&
            CanvasInputHelpers.field_f.field_cb != null &&
            !CanvasInputHelpers.field_f.field_cb.equals("")) {
            if (91 != CanvasInputHelpers.field_f.field_cb.charAt(0)) {
              var7 = (CharSequence) ((Object) CanvasInputHelpers.field_f.field_cb);
              var4 = DisplayNameHelpers.normalizeDisplayName(var7, (byte) 26);
            } else {
              var4 = CanvasInputHelpers.field_f.field_cb;
            }
            var5 = null;
            if (QuickChatCategoryCache.field_e == 0) {
              var5 = IncomingPacketHelpers.requestAddFriend((String) (var4), param0, (byte) 108);
            }
            if (QuickChatCategoryCache.field_e == 1) {
              var5 = SpriteLoadHelpers.requestRemoveFriend(param0, (String) (var4), (byte) -106);
            }
            if (QuickChatCategoryCache.field_e == 2) {
              var5 = ScoreMarkerDemo.requestAddIgnore(-34, (String) (var4), param0);
            }
            if (QuickChatCategoryCache.field_e == 3) {
              var5 = SkinSelectionHelpers.requestRemoveIgnore((String) (var4), param0, (String) (var4), -20867);
              var4 = var5;
              var4 = var5;
            }
            if (var5 != null) {
              var6 = (String) null;
              MidiPcmStream.appendChatMessage(0, (String) null, (String) (var4), (byte) -59, 2, (String) (var5));
            }
          }
          CanvasInputHelpers.field_f = null;
          QuickChatCategoryCache.field_e = -1;
          return;
        }
        if (CanvasInputHelpers.field_f == null) {
          return;
        }
        var3Lifetime1 = CanvasInputHelpers.field_f.updateAndPollNameInput(-126, param1);
        if (var3Lifetime1 == 0) {
          return;
        }
        if (2 != var3Lifetime1) {
          CanvasInputHelpers.field_f = null;
          QuickChatCategoryCache.field_e = -1;
          return;
        }
        if (CanvasInputHelpers.field_f.field_cb == null) {
          CanvasInputHelpers.field_f = null;
          QuickChatCategoryCache.field_e = -1;
          return;
        }
        if (CanvasInputHelpers.field_f.field_cb.equals("")) {
          CanvasInputHelpers.field_f = null;
          QuickChatCategoryCache.field_e = -1;
          return;
        }
        if (91 != CanvasInputHelpers.field_f.field_cb.charAt(0)) {
          var8 = (CharSequence) ((Object) CanvasInputHelpers.field_f.field_cb);
          var4Lifetime1 = DisplayNameHelpers.normalizeDisplayName(var8, (byte) 26);
        } else {
          var4Lifetime1 = CanvasInputHelpers.field_f.field_cb;
        }
        var5Lifetime1 = null;
        if (QuickChatCategoryCache.field_e == 0) {
          var5Lifetime1 = IncomingPacketHelpers.requestAddFriend((String) (var4Lifetime1), param0, (byte) 108);
        }
        if (QuickChatCategoryCache.field_e == 1) {
          var5Lifetime1 = SpriteLoadHelpers.requestRemoveFriend(param0, (String) (var4Lifetime1), (byte) -106);
        }
        if (QuickChatCategoryCache.field_e == 2) {
          var5Lifetime1 = ScoreMarkerDemo.requestAddIgnore(-34, (String) (var4Lifetime1), param0);
        }
        if (QuickChatCategoryCache.field_e == 3) {
          var5Lifetime1 = SkinSelectionHelpers.requestRemoveIgnore((String) (var4Lifetime1), param0, (String) (var4Lifetime1), -20867);
        }
        if (var5Lifetime1 == null) {
          CanvasInputHelpers.field_f = null;
          QuickChatCategoryCache.field_e = -1;
          return;
        }
        var6Lifetime1 = (String) null;
        MidiPcmStream.appendChatMessage(0, (String) null, (String) (var4Lifetime1), (byte) -59, 2, (String) (var5Lifetime1));
        CanvasInputHelpers.field_f = null;
        QuickChatCategoryCache.field_e = -1;
        return;
    }

    public static void releaseStatics(byte param0) {
        field_m = null;
        field_k = null;
        field_n = null;
        if (param0 >= -99) {
          QueuedLobbyRequest.releaseStatics((byte) -113);
        }
    }

    private QueuedLobbyRequest() throws Throwable {
        throw new Error();
    }

    static {
        field_l = false;
        field_k = "(1 player wants to join)";
        field_n = "Please select an option in the '<%0>' row.";
    }
}
