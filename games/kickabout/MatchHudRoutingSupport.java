/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchHudRoutingSupport {
    static int[] field_a;
    static String field_d;
    static String[] field_c;
    static String field_b;

    final static int alignToEight(int param0, byte param1) {
        int var2 = 0;
        int var3 = -123 % ((param1 - 43) / 55);
        if (0 != (param0 & 7)) {
          var2 = 8 - (7 & param0);
        }
        int var4 = var2 + param0;
        return var4;
    }

    final static void enqueueWelcomeDialog(int param0) {
        if (param0 == 31663) {
          ScrollPane.field_Jb.addLast(new WelcomeDialog(), 3);
          return;
        }
        String var2 = (String) null;
        MatchHudRoutingSupport.startLoginTransition((byte) 32, false, (String) null);
        ScrollPane.field_Jb.addLast(new WelcomeDialog(), 3);
    }

    final static SocketConnector createSocketConnector(String param0, int param1, int param2) {
        ProxySocketConnector var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ProxySocketConnector stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ProxySocketConnector();
          if (param2 != -13067) {
            var4 = (String) null;
            MatchHudRoutingSupport.setAccountStatusText(true, (String) null, (String) null, 68);
          }
          ((SocketConnector) ((Object) var3)).field_a = param1;
          ((SocketConnector) ((Object) var3)).field_c = param0;
          stackIn_3_0 = var3;
          return (SocketConnector) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ql.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 == 7) {
          field_c = null;
          return;
        }
        String var2 = (String) null;
        MatchHudRoutingSupport.createSocketConnector((String) null, 72, 40);
        field_c = null;
    }

    final static void startLoginTransition(byte param0, boolean param1, String param2) {
        try {
          WeightedLruCache.field_a = ClientUiUpdateSupport.field_c;
          SaveChangesDialog.field_G = param1 ? true : false;
          if (param0 <= 11) {
            String var4 = (String) null;
            MatchHudRoutingSupport.setAccountStatusText(true, (String) null, (String) null, -26);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ql.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void setAccountStatusText(boolean param0, String param1, String param2, int param3) {
        if (param3 != 3960) {
          return;
        }
        try {
          TutorialMessages.field_b = param2;
          NetworkGameClient.field_y = param1;
          MouseInputHandler.a(ImageProducerRasterBuffer.field_g, 4, param0);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ql.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void drawMatchHud(byte param0, boolean param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 96) {
            field_d = (String) null;
          }
          var3_int = FriendsListPanel.getHudOpacity(false, (byte) 71);
          if (4 == AsciiCharacterSupport.field_c.phase) {
            LoadingProgressSupport.drawActiveMatchTimer(1, var3_int);
            PlayerValueSortCriterion.a(param2, var3_int, AsciiCharacterSupport.field_c.participantStatus, 14839);
            if (ContextMenuItem.field_Cb == -2 ||
              !AsciiCharacterSupport.field_c.participantStatus[ContextMenuItem.field_Cb].isActive(3511)) {
              MatchHudSupport.drawControlLegend(param1, 16777215, var3_int);
            }
          }
          if (!JaggrabDownloader.field_c) {
            return;
          }
          BlackFadeScreen.drawQuickChatToggleHint((byte) -85);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ql.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void sortByCriterion(Object[] param0, SortCriterion param1, byte param2) {
        try {
          WorldSpriteDecoration.a(param1, -1 + param0.length, param0, 29921, 0);
          int var3_int = -63 % ((77 - param2) / 37);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ql.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new int[2];
        field_b = "Email address is unavailable";
        field_d = "Reload game";
        field_c = new String[]{"Last 30 mins", "Under 1 hr", "Under 2 hrs", "Under 3 hrs", "Under 4 hrs", "Under 6 hrs", "Under 12 hrs", "Under 24 hrs", "Under 2 days", "Under 3 days", "Over 3 days"};
    }
}
