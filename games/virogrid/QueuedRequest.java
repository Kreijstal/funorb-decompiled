/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QueuedRequest extends IntrusiveNode {
    static boolean field_n;
    static LobbyGame field_h;
    static int field_k;
    static String field_i;
    static int field_l;
    static int field_g;
    int field_o;
    static String field_m;
    int field_j;

    final static void loadLogoSound(int param0, Js5Archive param1) {
        VorbisSample var2 = null;
        if (param0 != 1048576) {
          return;
        }
        try {
          VorbisSample.decodeSetup(param1.getFileByName("headers.packvorbis", 100, ""));
          var2 = VorbisSample.loadNamed(param1, "jagex logo2.packvorbis", "");
          var2.decodeAllToPcm();
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= 45) {
          field_h = null;
          field_i = null;
          field_m = null;
          return;
        }
        field_g = 115;
        field_h = null;
        field_i = null;
        field_m = null;
    }

    final static void playMusicTrack(int param0, int param1, boolean param2, MusicTrack param3) {
        Object var4 = null;
        Throwable var5 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (null != QuickChatCategoryCache.field_f) {
            AudioSetupHelpers.selectMusicTrack(1048576, param0 - 10509, param1, param3, param2);
          }
          if (param0 != -1) {
            return;
          }
          if (DropTargetWidget.field_B == null) {
            return;
          }
          var4 = CheckboxTickPainter.field_g;
          synchronized (var4) {
            DropTargetWidget.field_B.setChannelVolume(param1, true, -1);
            if (param3 == PopupMenuDrawHelpers.field_b) {
              return;
            }
            DropTargetWidget.field_B.stop(false);
            CheckboxTickPainter.field_g.flushDeviceSafely();
            PopupMenuDrawHelpers.field_b = param3;
            if (null != PopupMenuDrawHelpers.field_b) {
              DropTargetWidget.field_B.playTrack(param2, 37, PopupMenuDrawHelpers.field_b);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("la.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) (stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void drawLobbyScreen(int param0, boolean param1) {
        ClientEnvironmentHelpers.field_c.drawRoot(param1, 24960);
        BirthDateEntryPanel var2 = CameraAndLogoHelpers.field_c;
        if (param0 < -60) {
          if (var2 != null) {
            var2.renderWidgetPassesAndTooltip(0, ClientEnvironmentHelpers.field_c.field_J, ClientEnvironmentHelpers.field_c.field_Bb);
          }
          return;
        }
        MusicTrack var3 = (MusicTrack) null;
        QueuedRequest.playMusicTrack(22, -99, true, (MusicTrack) null);
        if (var2 != null) {
          var2.renderWidgetPassesAndTooltip(0, ClientEnvironmentHelpers.field_c.field_J, ClientEnvironmentHelpers.field_c.field_Bb);
        }
    }

    private QueuedRequest() throws Throwable {
        throw new Error();
    }

    static {
        field_i = "Ask to join <%0>'s game";
        field_n = false;
        field_m = "Hide game chat";
        field_g = 0;
    }
}
