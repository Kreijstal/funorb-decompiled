/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BattlefieldTheme {
    String structureShadowFile;
    RgbSprite[] structureShadowSprites;
    String backgroundImageFile;
    String terrainSpriteFile;
    static int[][] field_p;
    int themeId;
    static String[] field_k;
    IndexedSprite[] foliageSprites;
    IndexedSprite[] terrainSprites;
    static int field_h;
    static String field_r;
    static int field_f;
    int[] terrainPreviewColours;
    String foliageShadowFile;
    IndexedSprite[] structureSprites;
    RgbSprite[] foliageShadowSprites;
    static String field_j;
    String structureSpriteFile;
    private PcmSample[] ambientSounds;
    static String field_s;
    String foliageSpriteFile;
    String[] ambientSoundNames;
    String musicTrackName;
    MusicTrack musicTrack;

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        boolean stackIn_16_0 = false;
        boolean stackIn_34_0 = false;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (!param0) {
          if (EffectPresentation.field_h[param1] > EffectPresentation.field_h[param2]) {
            return true;
          }
          if (EffectPresentation.field_h[param2] > EffectPresentation.field_h[param1]) {
            return false;
          }
          if (no.field_U[param1] > no.field_U[param2]) {
            return true;
          }
          boolean decompiledFrameRemainder1 = true;
          if (no.field_U[param1] >= no.field_U[param2]) {
            var4 = VineGrowthAction.field_s[param2] + AnimationFrameSet.field_w[param2] + TutorialController.field_c[param2];
            var5 = VineGrowthAction.field_s[param1] + (AnimationFrameSet.field_w[param1] + TutorialController.field_c[param1]);
            if (var4 < var5) {
              return true;
            }
            if (var5 < var4) {
              return false;
            }
            var6 = -52 / ((47 - param3) / 35);
            if (param1 > param2) {
              stackIn_16_0 = true;
              decompiledFrameRemainder1 = false;
            }
          }
          if (decompiledFrameRemainder1) {
            stackIn_16_0 = false;
          }
          return stackIn_16_0;
        }
        if (no.field_U[param2] < no.field_U[param1]) {
          return true;
        }
        if (no.field_U[param2] > no.field_U[param1]) {
          return false;
        }
        if (EffectPresentation.field_h[param1] > EffectPresentation.field_h[param2]) {
          return true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (EffectPresentation.field_h[param1] >= EffectPresentation.field_h[param2]) {
          var4Lifetime1 = VineGrowthAction.field_s[param2] + AnimationFrameSet.field_w[param2] + TutorialController.field_c[param2];
          var5Lifetime1 = VineGrowthAction.field_s[param1] + (AnimationFrameSet.field_w[param1] + TutorialController.field_c[param1]);
          if (var4Lifetime1 < var5Lifetime1) {
            return true;
          }
          if (var5Lifetime1 < var4Lifetime1) {
            return false;
          }
          var6Lifetime1 = -52 / ((47 - param3) / 35);
          if (param1 > param2) {
            stackIn_34_0 = true;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_34_0 = false;
        }
        return stackIn_34_0;
    }

    final void loadAmbientSounds(int obfuscationGuard, SoundCache soundCache) {
        int soundIndex = 0;
        int obfuscationControl = 0;
        byte[] discardedBytes = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == this.ambientSoundNames) {
            return;
          }
          this.ambientSounds = new PcmSample[this.ambientSoundNames.length];
          if (obfuscationGuard != 17952) {
            discardedBytes = (byte[]) null;
            BattlefieldTheme.decodeSingleByteText(102, -75, -58, (byte[]) null);
          }
          for (soundIndex = 0; soundIndex < this.ambientSoundNames.length; soundIndex++) {
            this.ambientSounds[soundIndex] = soundCache.getSoundEffectByName(this.ambientSoundNames[soundIndex], (byte) -97, "");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("co.G(").append(obfuscationGuard).append(',');
          if (soundCache == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final PcmSample chooseAmbientSound(int obfuscationGuard) {
        int var2 = 27 % ((50 - obfuscationGuard) / 33);
        return this.ambientSounds[AttackEvent.nextBoundedInt(false, this.ambientSounds.length, li.field_n)];
    }

    public static void a(byte param0) {
        field_r = null;
        field_p = (int[][]) null;
        field_s = null;
        field_k = null;
        if (param0 >= -100) {
          BattlefieldTheme.a(true, 87, 46, 119);
          field_j = null;
          return;
        }
        field_j = null;
    }

    final RgbSprite loadBackgroundImage(byte obfuscationGuard) {
        int var2 = -68 / ((53 - obfuscationGuard) / 32);
        return this.readBackgroundImage(34);
    }

    final static String decodeSingleByteText(int offset, int length, int obfuscationGuard, byte[] bytes) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_3_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var11 = new char[length];
          var10 = var11;
          var4 = var10;
          var5 = 0;
          if (obfuscationGuard > -65) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          for (var6 = 0; length > var6; var6++) {
            var7 = 255 & bytes[offset + var6];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = MapRepository.field_a[-128 + var7];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
          }
          stackIn_17_0 = new String(var11, 0, var5);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("co.K(").append(offset).append(',').append(length).append(',').append(obfuscationGuard).append(',');
          if (bytes == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void setResourceArchives(ResourceArchive backgroundArchive, int obfuscationGuard, ResourceArchive spriteArchive) {
        try {
          SocketResourceClient.themeSpriteArchive = spriteArchive;
          fd.themeBackgroundArchive = backgroundArchive;
          if (obfuscationGuard != 0) {
            this.terrainSpriteFile = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "co.H(" + (backgroundArchive != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (spriteArchive != null ? "{...}" : "null") + ')');
        }
    }

    final void prepareMusicSamples(SoundCache soundCache, ResourceArchive patchArchive, ResourceArchive musicArchive, int sampleBudget, MidiPcmStream audioEngine) {
        if (null == this.musicTrackName ||
          audioEngine == null ||
          musicArchive == null) {
          return;
        }
        this.musicTrack = MusicTrack.load(musicArchive, "", this.musicTrackName);
        if (null == this.musicTrack) {
          return;
        }
        try {
          audioEngine.prepareTrackSamples(soundCache, patchArchive, sampleBudget, this.musicTrack, (byte) 86);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "co.J(" + (soundCache != null ? "{...}" : "null") + ',' + (patchArchive != null ? "{...}" : "null") + ',' + (musicArchive != null ? "{...}" : "null") + ',' + sampleBudget + ',' + (audioEngine != null ? "{...}" : "null") + ')');
        }
    }

    final void loadSpriteSheets(byte obfuscationGuard) {
        if (this.structureShadowSprites != null) {
          return;
        }
        this.terrainSprites = MapLayout.loadIndexedSpritesByName(this.terrainSpriteFile, -28106, "basic", SocketResourceClient.themeSpriteArchive);
        this.foliageSprites = MapLayout.loadIndexedSpritesByName(this.foliageSpriteFile, -28106, "basic", SocketResourceClient.themeSpriteArchive);
        this.structureSprites = MapLayout.loadIndexedSpritesByName(this.structureSpriteFile, -28106, "basic", SocketResourceClient.themeSpriteArchive);
        this.foliageShadowSprites = fk.loadRgbSpritesByName(this.foliageShadowFile, (byte) -128, SocketResourceClient.themeSpriteArchive, "basic");
        if (obfuscationGuard > -63) {
          this.foliageShadowSprites = (RgbSprite[]) null;
          this.structureShadowSprites = fk.loadRgbSpritesByName(this.structureShadowFile, (byte) -127, SocketResourceClient.themeSpriteArchive, "basic");
          return;
        }
        this.structureShadowSprites = fk.loadRgbSpritesByName(this.structureShadowFile, (byte) -127, SocketResourceClient.themeSpriteArchive, "basic");
    }

    final void releaseSprites(int obfuscationGuard) {
        this.structureShadowSprites = null;
        this.foliageSprites = null;
        this.foliageShadowSprites = null;
        if (obfuscationGuard != 0) {
          field_k = (String[]) null;
          this.terrainSprites = null;
          this.structureSprites = null;
          return;
        }
        this.terrainSprites = null;
        this.structureSprites = null;
    }

    private final RgbSprite readBackgroundImage(int obfuscationGuard) {
        if (obfuscationGuard != 34) {
          return (RgbSprite) null;
        }
        byte[] var3 = fd.themeBackgroundArchive.getFileByName(this.backgroundImageFile, obfuscationGuard ^ 108, "");
        byte[] var2 = var3;
        return new RgbSprite(var3, (java.awt.Component) ((Object) VerticalScrollbar.p(0)));
    }

    static {
        field_p = new int[][]{new int[]{0, 26, 27, 28, 0, 0, 29}, new int[]{0, 30, 31, 32, 34, 34, 33}, new int[]{0, 39, 40, 41, 43, 43, 42}, new int[]{0, 44, 45, 46, 48, 48, 47}, new int[]{0, 35, 36, 37, 0, 0, 38}};
        field_k = new String[3];
        field_r = "<%0> must play 1 more rated game before playing with the current options.";
        field_s = "Requires <%0>";
        field_j = "Shortcut Reference";
    }
}
