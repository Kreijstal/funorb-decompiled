/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProjectedLineSupport {
    static UiComponent field_d;
    static Sprite field_k;
    static int field_h;
    static Sprite field_m;
    static int field_g;
    static java.awt.Font field_c;
    static String muChatFriends;
    static int field_e;
    static boolean field_f;
    static String publicchatUnavailableRatedgame;
    static String muChatLobbyFriendsOnly;
    static String fsAcceptBeforeaccept;
    static String pleasewaitDotdotdot;
    static String memberslevelName;

    final static boolean isPointerInside(int param0, UiComponent param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.screenX;
          if (param0 != 1) {
            memberslevelName = (String) null;
          }
          var3 = param1.screenY;
          stackIn_8_0 = (ReflectionReplySupport.field_i >= var2_int) && (var2_int + param1.width > ReflectionReplySupport.field_i) && (var3 <= DebouncedValidationProvider.field_f) && (var3 + param1.height > DebouncedValidationProvider.field_f);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("cl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        muChatFriends = null;
        pleasewaitDotdotdot = null;
        field_k = null;
        muChatLobbyFriendsOnly = null;
        memberslevelName = null;
        publicchatUnavailableRatedgame = null;
        if (param0 <= -43) {
          fsAcceptBeforeaccept = null;
          field_m = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static AlphaFont createAlphaFont(byte[] param0, boolean param1) {
        AlphaFont var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        AlphaFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (AlphaFont) (stackIn_2_0);
          }
          var2 = new AlphaFont(param0, AchievementsScreen.field_I, LoginRequestSupport.field_d, LinkButtonPainter.field_a, AccountTextSupport.field_f, IntrusiveNode.field_h, LimitedRandomAccessFile.field_b);
          OpacityWidget.releaseSpriteDecoderArrays(-1);
          if (!param1) {
            pleasewaitDotdotdot = (String) null;
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("cl.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void resetChatComposition(int param0) {
        Base37Support.field_c.setLength(0);
        CookieDateSupport.field_b = 0;
        if (param0 != 14851) {
          memberslevelName = (String) null;
        }
    }

    final static void drawProjectedLine(int param0, int param1, int[] param2, float[] param3, float[] param4) {
        if (!TextWidgetPainter.projectPointIfVisible((byte) 107, param2, param3)) {
          return;
        }
        if (!TextWidgetPainter.projectPointIfVisible((byte) 127, param2, param4)) {
          return;
        }
        try {
          SoftwareRasterizer.drawLine((int)param3[0], (int)param3[param1], (int)param4[0], (int)param4[1], param0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cl.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
        publicchatUnavailableRatedgame = "Public chat is unavailable while setting up a rated game.";
        fsAcceptBeforeaccept = "Click";
        muChatLobbyFriendsOnly = "Only show lobby chat from my friends";
        pleasewaitDotdotdot = "Please wait...";
        muChatFriends = "Friends";
        memberslevelName = "Members only";
    }
}
