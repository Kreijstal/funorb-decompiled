/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    static int field_o;
    static String field_s;
    static int field_p;
    boolean field_q;
    boolean field_t;
    static int field_r;
    volatile boolean field_u;

    final static void requestIntroScene(int param0, byte param1) {
        int var2 = -92 % ((78 - param1) / 44);
        MusicEnvelope.field_i = param0;
        CachedArchiveSource.field_n = true;
        if (param0 == 1) {
          QuickChatCategoryRegistry.transitionMusicTrack(32767, SoundTriggerTick.field_d, true, 476);
        }
    }

    public static void clearStatics(int param0) {
        if (param0 != -18301) {
          return;
        }
        field_s = null;
    }

    abstract byte[] getData(byte param0);

    abstract int getProgress(int param0);

    final static LoginMethodPreference readLastLoginMethod(java.applet.Applet param0, boolean param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        LoginMethodPreference[] var3 = null;
        LoginMethodPreference var5 = null;
        int var6 = 0;
        java.applet.Applet var7 = null;
        LoginMethodPreference stackIn_4_0 = null;
        LoginMethodPreference stackIn_10_0 = null;
        LoginMethodPreference stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2 = DialWidget.readBrowserCookie(false, "jagex-last-login-method", param0);
          if (var2 == null) {
            stackIn_4_0 = LobbyPlayerEntry.field_Rb;
            return stackIn_4_0;
          }
          var3 = IntrusiveNode.getLoginMethods((byte) -90);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.matches((byte) 80, var2)) {
              stackIn_10_0 = var5;
              return stackIn_10_0;
            }
          }
          if (!param1) {
            var7 = (java.applet.Applet) null;
            ArchiveRequest.readLastLoginMethod((java.applet.Applet) null, false);
          }
          stackIn_15_0 = LobbyPlayerEntry.field_Rb;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("jc.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void decodeLogoAudio(int param0, Archive param1) {
        VorbisSample var2 = null;
        try {
          VorbisSample.readSetup(param1.getFileByName(true, "", "headers.packvorbis"));
          var2 = VorbisSample.load(param1, "jagex logo2.packvorbis", "");
          var2.decodeAll();
          int var3 = 38 / ((param0 - 28) / 50);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "jc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean shouldServiceLobbyConnection(int param0) {
        if (param0 != -11) {
          field_s = (String) null;
          if (SoundPlayback.field_i < 10) {
            return false;
          }
          if (!BirthDateConfirmationForm.field_P) {
            return !DirectByteArrayStorage.isLobbyConnected((byte) -119) ? true : false;
          }
          return false;
        }
        if (SoundPlayback.field_i < 10) {
          return false;
        }
        if (!BirthDateConfirmationForm.field_P) {
          return !DirectByteArrayStorage.isLobbyConnected((byte) -119) ? true : false;
        }
        return false;
    }

    final static void prepareAchievementPlaceholderSprites(int param0, Sprite param1) {
        RandomAccessCacheFile.pushLegacyRasterState(-117);
        DerelictMapGenerator.field_n = new Sprite(128, 128);
        DerelictMapGenerator.field_n.bindAsRenderTarget();
        if (param0 <= 12) {
          return;
        }
        try {
          param1.draw(0, 0);
          AccountBooleanRequest.field_h = new Sprite(256, 256);
          AccountBooleanRequest.field_h.bindAsRenderTarget();
          DerelictMapGenerator.field_n.drawScaled(0, 0, 256, 256);
          SoftwareRasterizer.blurRectangle(3, 3, 0, 0, 256, 256);
          FourIntSubmissionRequest.field_o = new Sprite(32, 32);
          FourIntSubmissionRequest.field_o.bindAsRenderTarget();
          DerelictMapGenerator.field_n.drawQuarterSize(0, 0);
          DiplomacyNotice.field_k = new Sprite(256, 256);
          DiplomacyNotice.field_k.bindAsRenderTarget();
          DerelictMapGenerator.field_n.draw(64, 64);
          SoftwareRasterizer.blurRectangle(12, 12, 0, 0, 256, 256);
          MouseInputHandler.field_b = new Sprite(64, 64);
          MouseInputHandler.field_b.bindAsRenderTarget();
          FourIntSubmissionRequest.field_o.draw(16, 16);
          SoftwareRasterizer.blurRectangle(3, 3, 0, 0, 64, 64);
          OpacityWidget.popLegacyRasterState(0);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "jc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ArchiveRequest() {
        this.field_u = true;
    }

    static {
        field_o = 0;
    }
}
