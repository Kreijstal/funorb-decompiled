/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScoreUpdateEvent extends GameEvent {
    static String field_l;
    static byte[] field_k;
    static int field_j;
    static Sprite field_m;
    private int[] field_i;

    public static void releaseStatics(int param0) {
        field_k = null;
        field_m = null;
        field_l = null;
        int var1 = 105 % ((22 - param0) / 60);
    }

    ScoreUpdateEvent(int param0, int[] param1) {
        super(param0);
        try {
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawDebugOverlay(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          field_j = -107;
        }
    }

    final static void emptyStaticHook(int param0) {
        if (param0 != -29956) {
          ScoreUpdateEvent.emptyStaticHook(-45);
        }
    }

    final void apply(int param0, GameScreen param1) {
        try {
          param1.setTeamScores(this.field_i, false);
          if (param0 != 0) {
            ScoreUpdateEvent.releaseStatics(-54);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void openPrivateChatTo(int param0, long param1, String param2) {
        CharSequence var5 = null;
        try {
          TextPopupHelpers.field_g = param2;
          if (param0 != -16745) {
            field_k = (byte[]) null;
          }
          UrlLaunchHelpers.field_a = 2;
          var5 = (CharSequence) ((Object) param2);
          RasterStackHelpers.field_a = AudioPumpThread.normalizePlayerName(var5, false);
          PhantomDecoy.field_M = param1;
          ReflectionCheckRequest.showDefaultQuickChatMenu((byte) 69);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fg.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Instructions";
    }
}
