/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderTargetHelpers {
    static ModelMesh field_a;
    static int[] field_d;
    static String field_b;
    static Js5Archive field_c;
    static String textOptions;

    final static void openLoginForm(int param0) {
        String var2 = (String) null;
        GrowableIntList.openLoginPanelWithMessage((byte) 119, "", (String) null);
        if (param0 != 256) {
          RenderTargetHelpers.releaseStatics(false);
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_a = null;
          field_c = null;
          field_b = null;
          field_d = null;
          textOptions = null;
          return;
        }
        textOptions = (String) null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        textOptions = null;
    }

    final static void resendQueuedListRequests(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        StatSubmission var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          var4 = (StatSubmission) (RankingArraySupport.field_b.first((byte) -46));
          while (var4 != null) {
            ProxyAuthenticationRequiredException.sendStatSubmission(param1 ^ -11514, var4, param0);
            var4 = (StatSubmission) (RankingArraySupport.field_b.next(param1 ^ -5038));
          }
          if (param1 != -11513) {
            RenderTargetHelpers.releaseStatics(false);
          }
          var2 = QuickChatOpenHelpers.field_a.first((byte) -31);
          while (var2 != null) {
            LobbySessionHelpers.sendPendingRequestPacket(param0, true);
            var2 = QuickChatOpenHelpers.field_a.next(16213);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2_ref), "pj.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void setRenderTargetSprite(Sprite param0, int param1) {
        try {
          ArchiveLoadSequence.saveRasterState(param1 - 142);
          if (param1 != 256) {
            field_d = (int[]) null;
          }
          param0.makeRasterTarget();
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "pj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = new int[256];
        field_b = "Warning: if you quit, you will lose any game you are in the middle of!";
        textOptions = "Options";
    }
}
