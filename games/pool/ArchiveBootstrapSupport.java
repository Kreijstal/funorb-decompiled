/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveBootstrapSupport {
    static String clickToQuickchat;
    static String tutorialShotModeEnter;
    static String muChatTips;

    final static void initializeArchiveInfrastructure(PlatformTaskDispatcher param0, int param1, int param2, int param3, String param4, byte param5, int param6, int param7, int param8) {
        try {
          IntegerSyntaxSupport.field_a = param6;
          AccountWelcomePanel.field_X = param4;
          UiWidget.field_B = param8;
          SpaceObject.field_f = param2;
          DebugTuningSlider.field_k = param1;
          TextInputPainter.field_v = param7;
          ButtonWidget.field_M = param0;
          ReflectionReplySupport.field_h = param3;
          if (param5 >= -61) {
            muChatTips = (String) null;
          }
          GameRules.field_c = (Js5Transport) ((Object) new SocketArchiveNetworkClient());
          CheckboxWidget.field_U = new DiskCacheWorker(param0);
          TranslatedUiText.field_m = new Js5ArchiveManager(GameRules.field_c, CheckboxWidget.field_U);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "je.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static boolean b(byte param0) {
        if (param0 < 95) {
          ArchiveBootstrapSupport.releaseStatics((byte) -44);
          if (PlasmaTableScene.field_gb == null) {
            return false;
          }
          if (PlasmaTableScene.field_gb.canApplyConstrainedSize(100)) {
            return true;
          }
          return false;
        }
        if (PlasmaTableScene.field_gb == null) {
          return false;
        }
        if (PlasmaTableScene.field_gb.canApplyConstrainedSize(100)) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        clickToQuickchat = null;
        tutorialShotModeEnter = null;
        muChatTips = null;
        if (param0 > -122) {
          clickToQuickchat = (String) null;
        }
    }

    final static void a(int param0, int param1, boolean param2, byte[] param3, int param4, boolean param5) {
        CipherPacketBuffer var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          var6 = JaggrabDownloader.field_j;
          var6.writeCipheredOpcode(param5, param0);
          var6.position = var6.position + 1;
          var7 = var6.position;
          var6.writeByte(4, false);
          var6.writeByte(param1, param5);
          var8 = param4;
          if (param2) {
            var8 += 128;
          }
          var6.writeByte(var8, param5);
          var6.writeBytes(param3, (byte) 0, 0, param3.length);
          var6.writeByteLengthPrefix(var6.position - var7, !param5 ? true : false);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "je.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        clickToQuickchat = "Click or press F10 to open Quick Chat";
        muChatTips = "Tips";
        tutorialShotModeEnter = "To enter <u=ffffff>shot mode</u>: <col=99ff99>Press</col> <img=4>, or <img=0> click on the cue ball once.";
    }
}
