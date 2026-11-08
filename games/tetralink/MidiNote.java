/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNote extends IntrusiveNode {
    int field_H;
    MusicPatch field_B;
    int field_C;
    int field_n;
    PcmSample field_y;
    int field_D;
    int field_J;
    int field_s;
    PcmSampleStream field_I;
    int field_E;
    int field_G;
    int field_x;
    int field_A;
    static GzipDecompressor field_z;
    int field_p;
    int field_r;
    int field_F;
    int field_o;
    MusicPatchEnvelope field_q;
    int field_u;
    int field_v;
    static String field_w;
    int field_t;

    final void releaseVoice(int param0) {
        this.field_B = null;
        this.field_q = null;
        this.field_I = null;
        this.field_y = null;
        int var2 = -115 / ((15 - param0) / 40);
    }

    final static void renderStartupScreen(java.awt.Canvas param0, boolean param1, int param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = TetraLink.field_J;
        try {
          if (GrowableIntList.field_a < 10) {
            var3_int = 0;
            if (TextureCache.field_h) {
              TextureCache.field_h = false;
              var3_int = 1;
            }
            NetworkArchiveRequest.drawLoadingMessage(Js5Transport.field_e, ArchiveFactoryHelpers.getCommonUiLoadPercent((byte) -63), LoadingStatusHelpers.getLoadingStatusText(-31307), (byte) 84, var3_int != 0);
          } else {
            if (!RasterStackHelpers.isLogoIntroFinished((byte) -99)) {
              SoftwareRasterizer.clear();
              NanoTickClock.drawLogoIntro(320, 240, -109);
              CachedArchiveSource.paintCanvasNow(0, 0, param0, -2);
            } else {
              if (DisplayNameForm.field_R == 0) {
                StripedProgressBar.drawOverlayBackdrop(param1, 1, false);
                CachedArchiveSource.paintCanvasNow(0, 0, param0, -2);
              } else {
                LoadingScreenRenderHelpers.renderLoadingScreen(-8129, param0);
              }
            }
          }
          if (param2 == 32511) {
            return;
          }
          MidiNote.postPendingMessage((byte) 26);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("oc.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static Sprite[] loadFrameSprites(String param0, boolean param1, Archive param2, String param3) {
        Sprite[] var4 = null;
        RuntimeException var4_ref = null;
        Sprite[] var5 = null;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = PlayingSound.loadSpritesByName((byte) -117, param2, param3, param0);
          var4 = var5;
          var5[3].field_F = var5[3].field_E;
          var5[1].field_t = var5[1].field_u;
          var5[5].field_F = var5[5].field_E;
          var5[7].field_t = var5[7].field_u;
          if (!param1) {
            field_w = (String) null;
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("oc.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          field_z = (GzipDecompressor) null;
          field_z = null;
          field_w = null;
          return;
        }
        field_z = null;
        field_w = null;
    }

    final static void postPendingMessage(byte param0) {
        String var2 = null;
        String var1 = null;
        String var1Lifetime1;
        if (param0 >= 61) {
          if (null != ArchiveRequest.field_t) {
            var2 = ArchiveRequest.field_t;
            var1 = var2;
            GzipDecompressor.showMessageDialogText((byte) -105, SectorCacheStore.formatTemplate(new String[]{var2}, ChatPanelSlideHelpers.field_f, 122));
            ArchiveRequest.field_t = null;
          }
          return;
        }
        field_w = (String) null;
        if (null != ArchiveRequest.field_t) {
          var2 = ArchiveRequest.field_t;
          var1Lifetime1 = var2;
          GzipDecompressor.showMessageDialogText((byte) -105, SectorCacheStore.formatTemplate(new String[]{var2}, ChatPanelSlideHelpers.field_f, 122));
          ArchiveRequest.field_t = null;
        }
    }

    MidiNote() {
    }

    static {
        field_z = new GzipDecompressor();
        field_w = "Waiting for sound effects";
    }
}
