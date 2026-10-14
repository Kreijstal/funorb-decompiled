/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class BackgroundScene {
    private String musicName;
    int sceneId;
    static int field_a;
    static String field_g;
    MusicTrack musicData;
    static String field_o;
    static BlankScreen field_p;
    private int[] soundEffectOrder;
    private PcmSound[] soundEffects;
    private String[] soundEffectNames;
    boolean musicReady;
    int loadedSoundCount;
    static int pressedButton;
    static int[] field_i;
    static ResourceArchive field_f;
    static RgbSprite[][] field_k;
    static int masterSoundGain;

    RgbSprite c(byte param0) {
        if (param0 > -74) {
          return (RgbSprite) null;
        }
        return QuickChatHelpDialog.field_Ub[ChatMessage.backgroundVariant];
    }

    final PcmSound[] pollSoundEffects(int obfuscationGuard) {
        String var3 = null;
        String var2 = null;
        if (this.loadedSoundCount < this.soundEffects.length) {
          var3 = this.soundEffectNames[this.soundEffectOrder[this.loadedSoundCount]];
          var2 = var3;
          if (BrickABrac.field_I.hasFileName(var2, "", (byte) -121)) {
            this.soundEffects[this.loadedSoundCount] = SoundPlayback.soundCache.getSoundEffectByName(var3, "", (byte) 122);
          }
          if (QuickChatMenu.field_gc.hasFileName(var2, "", (byte) -121)) {
            this.soundEffects[this.loadedSoundCount] = SoundPlayback.soundCache.getMusicSampleByName((byte) 28, var3, "");
          }
          if (this.soundEffects[this.loadedSoundCount] != null) {
            this.loadedSoundCount = this.loadedSoundCount + 1;
          }
        }
        if (obfuscationGuard != 0) {
          field_f = (ResourceArchive) null;
        }
        return this.soundEffects;
    }

    abstract void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX);

    RgbSprite[] b(int param0) {
        if (param0 >= -12) {
          return (RgbSprite[]) null;
        }
        return GzipInflater.field_a;
    }

    BackgroundScene(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        this(sceneId, musicName, EmailConfirmationValidator.createSoundEffectNames(soundEffectCount, soundEffectPrefix, (byte) -1));
    }

    final static void drawFlatMeshTriangle(int halfRgb, int yA, int xC, int xA, int yB, int yC, int xB, int obfuscationGuard) {
        int unusedGameFlag;
        int guardQuotient;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (yB > yA) {
          if (yB >= yC) {
            if (yC > yA) {
              TextFieldValidator.rasterFlatMeshTriangle(xC, xB, yA, Rasterizer2D.pixels, yB, yC, halfRgb, xA, 0);
            } else {
              TextFieldValidator.rasterFlatMeshTriangle(xA, xB, yC, Rasterizer2D.pixels, yB, yA, halfRgb, xC, 0);
            }
          } else {
            TextFieldValidator.rasterFlatMeshTriangle(xB, xC, yA, Rasterizer2D.pixels, yC, yB, halfRgb, xA, 0);
          }
        } else {
          if (yC > yA) {
            TextFieldValidator.rasterFlatMeshTriangle(xA, xC, yB, Rasterizer2D.pixels, yC, yA, halfRgb, xB, 0);
          } else {
            if (yB < yC) {
              TextFieldValidator.rasterFlatMeshTriangle(xC, xA, yB, Rasterizer2D.pixels, yA, yC, halfRgb, xB, 0);
            } else {
              TextFieldValidator.rasterFlatMeshTriangle(xB, xA, yC, Rasterizer2D.pixels, yA, yB, halfRgb, xC, 0);
            }
          }
        }
        guardQuotient = 88 % ((-60 - obfuscationGuard) / 62);
    }

    final void ensureSprites(int obfuscationGuard) {
        if (!this.hasSprites((byte) -99)) {
          this.loadSprites(false);
        }
        if (obfuscationGuard != 1) {
          String var3 = (String) null;
          BackgroundScene.a((java.applet.Applet) null, 122, (String) null);
        }
    }

    RgbSprite[] a(byte param0, int param1) {
        int var3 = -89 % ((param0 - 65) / 49);
        return null;
    }

    abstract boolean loadSprites(boolean obfuscationGuard);

    abstract boolean hasSprites(byte obfuscationGuard);

    RgbSprite a(boolean param0, int param1) {
        if (param0) {
          return null;
        }
        field_g = (String) null;
        return null;
    }

    abstract void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY);

    public static void a(byte param0) {
        if (param0 != 7) {
          return;
        }
        field_o = null;
        field_i = null;
        field_p = null;
        field_g = null;
        field_k = (RgbSprite[][]) null;
        field_f = null;
    }

    final void pollMusicPreparation(int obfuscationGuard) {
        MusicTrack dupTemp$0 = null;
        int fieldTemp$1 = 0;
        if (this.musicData == null) {
          dupTemp$0 = MusicTrack.load(UiComponent.field_lb, "", this.musicName);
          this.musicData = dupTemp$0;
          if (dupTemp$0 == null) {
            return;
          }
        }
        if (!m.musicSynthesizer.prepareTrack(obfuscationGuard ^ -74, this.musicData, 22050, IterableIntrusiveHashTable.field_a, SoundPlayback.soundCache)) {
          return;
        }
        if (OpacityWidget.pendingMusicLoads > 0) {
          fieldTemp$1 = OpacityWidget.pendingMusicLoads - 1;
          OpacityWidget.pendingMusicLoads = OpacityWidget.pendingMusicLoads - 1;
          if (0 == fieldTemp$1) {
            m.musicSynthesizer.a((byte) 118);
          }
        }
        this.musicReady = true;
        if (obfuscationGuard != 59) {
          this.pollSoundEffects(-106);
        }
    }

    final static String a(java.applet.Applet param0, int param1, String param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_8_0 = null;
          Object stackIn_13_0 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = BrickABrac.field_J ? 1 : 0;
          try {
            try {
              if (param1 < 74) {
                BackgroundScene.a((byte) 0);
              }
              var3 = (String) (ne.a("getcookies", -127, param0));
              var4 = FarmBackground.a((byte) 122, var3, ';');
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param2)) {
                  stackIn_8_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_13_0 = null;
            return (String) (stackIn_13_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("ki.W(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int c(int param0) {
        if (param0 > -72) {
          this.a(57, false);
        }
        return 256;
    }

    abstract void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16);

    RgbSprite[] a(int param0, boolean param1) {
        if (param1) {
          return null;
        }
        return (RgbSprite[]) null;
    }

    private BackgroundScene(int sceneId, String musicName, String[] soundEffectNames) {
        int var4_int = 0;
        try {
          this.musicName = musicName;
          this.sceneId = sceneId;
          this.soundEffectNames = soundEffectNames;
          this.soundEffects = new PcmSound[this.soundEffectNames.length];
          this.soundEffectOrder = new int[this.soundEffectNames.length];
          for (var4_int = 0; this.soundEffectOrder.length > var4_int; var4_int++) {
            this.soundEffectOrder[var4_int] = var4_int;
          }
          AppletGameShell.shuffleFivePasses(this.soundEffectOrder, (byte) 39, ButtonWidgetRenderer.field_w);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ki.<init>(" + sceneId + ',' + (musicName != null ? "{...}" : "null") + ',' + (soundEffectNames != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Please select options in the following rows:  ";
        field_a = 1;
        field_o = "World select";
        pressedButton = 0;
        field_p = new BlankScreen();
        field_i = new int[5];
        masterSoundGain = 256;
    }
}
