/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackerMusicDefinition {
    int[][] volumeEnvelopeValues;
    private int instrumentCount;
    int[] volumeSustainPoints;
    int[] orderList;
    int[] sampleLoopEnds;
    int[] volumeLoopEndPoints;
    private int[] sampleFileIds;
    int[] sampleFineTunes;
    static AchievementTracker field_f;
    int[][] instrumentSampleMaps;
    int[] sampleFlags;
    int[] samplePans;
    int[] panLoopStartPoints;
    int[] panLoopEndPoints;
    private int patternCount;
    int[] sampleLoopStarts;
    int[] instrumentFadeouts;
    int[][] panEnvelopeValues;
    private int[] sampleGroupIds;
    int[] panEnvelopeFlags;
    int[] patternRowCounts;
    PcmSample[] samples;
    int[][] volumeEnvelopeTicks;
    int initialTempoBpm;
    byte[][] patternData;
    int[] panSustainPoints;
    private SoundCache soundCache;
    int[] volumeEnvelopeFlags;
    int[] sampleRelativeNotes;
    int orderCount;
    static int field_j;
    int frequencyMode;
    int[] sampleVolumes;
    int initialTicksPerRow;
    int[] volumeLoopStartPoints;
    int[][] panEnvelopeTicks;
    int[] sampleLengths;
    int channelCount;

    final static void playFootstep(int pan) {
        AlternateUsernameCredentials.field_n.playSampleWithPan(!(0.5 <= Math.random()) ? TerrainMaskSupport.field_e : DisplayAndRatingSupport.field_b, 100, 6144 * IterableNodeHashTable.field_c / 64, pan);
    }

    final static String currentEmailOrLoginName(int guard) {
        if (InstructionsScreen.field_q == EmailAvailabilityValidator.field_o) {
          return AgeValidator.field_o;
        }
        if (!HighscorePlayerRecord.field_g.isComplete(0)) {
          return HighscorePlayerRecord.field_g.email(-84);
        }
        if (MeshMaterial.field_b == EmailAvailabilityValidator.field_o) {
          return HighscorePlayerRecord.field_g.email(-52);
        }
        if (guard != 31069) {
          TrackerMusicDefinition.releaseStatics(-82);
        }
        return StrongCacheEntry.field_v;
    }

    public static void releaseStatics(int guard) {
        field_f = null;
        if (guard != -32408) {
          field_j = -49;
        }
    }

    private final void loadSamples(int guard) {
        PcmSample var4;
        int var5 = EscapeVector.obfuscationControl;
        if (this.soundCache == null) {
          return;
        }
        boolean var2 = true;
        if (guard != 260404420) {
          this.instrumentFadeouts = (int[]) null;
        }
        for (int var3 = 0; var3 < this.samples.length; var3++) {
          if (this.samples[var3] == null) {
            if (this.sampleFlags[var3] >> 4 != 0) {
              var4 = this.soundCache.getVorbisSample(this.sampleGroupIds[var3], (byte) -128, this.sampleFileIds[var3]);
            } else {
              var4 = this.soundCache.getSynthesizedSample((byte) 55, this.sampleFileIds[var3], this.sampleGroupIds[var3]);
            }
            if (var4 == null) {
              var2 = false;
            } else {
              this.sampleFlags[var3] = SpriteCheckboxPainter.bitwiseAnd(this.sampleFlags[var3], 15);
              this.samples[var3] = var4;
            }
          }
        }
        if (var2) {
          this.soundCache = null;
          this.sampleGroupIds = null;
          this.sampleFileIds = null;
        }
    }

    final static String levelDisplayName(byte guard, int mode, int levelIndex) {
        if (levelIndex < -1) {
          return "";
        }
        if (-1 == levelIndex) {
          return StatefulTextPainter.field_v;
        }
        int var3 = SpriteFactorySupport.levelCount(false, mode);
        if (guard <= 75) {
          field_f = (AchievementTracker) null;
        }
        if (var3 <= levelIndex) {
          return "";
        }
        if (null == AudioService.field_b) {
          LoginHandshakeSupport.field_e = ProxySocketConnector.field_o;
          AudioService.field_b = new String[][]{LoginHandshakeSupport.field_e, ProxySocketConnector.field_o, SavedCompletionFlags.field_d, ThreeSliceButtonPainter.field_u};
        }
        return AudioService.field_b[mode][levelIndex];
    }

    TrackerMusicDefinition(PacketBuffer input, SoundCache soundCache) {
        try {
          this.soundCache = soundCache;
          this.orderCount = input.readUnsignedByte(0) + 1;
          input.readUnsignedByte(0);
          this.channelCount = 1 + input.readUnsignedByte(0);
          this.patternCount = input.readUnsignedByte(0) + 1;
          this.instrumentCount = input.readUnsignedByte(0) + 1;
          int var3_int = input.readUnsignedByte(0);
          this.frequencyMode = var3_int & 1;
          this.initialTicksPerRow = input.readUnsignedByte(0);
          this.initialTempoBpm = input.readUnsignedByte(0);
          this.orderList = new int[this.orderCount];
          int var4 = 0;
          for (int var5 = 0; var5 < this.orderCount; var5++) {
            int dupTemp$0 = var4 + input.readUnsignedByte(0);
            var4 = dupTemp$0;
            this.orderList[var5] = SpriteCheckboxPainter.bitwiseAnd(255, dupTemp$0);
          }
          this.patternData = new byte[256][];
          this.patternRowCounts = new int[256];
          ArraySupport.fill(this.patternRowCounts, 0, 256, 64);
          for (int var5Lifetime1 = 0; 256 > var5Lifetime1; var5Lifetime1++) {
            this.patternData[var5Lifetime1] = AccountSessionStatusSupport.field_b;
          }
          for (int var5Lifetime2 = 0; var5Lifetime2 < this.patternCount; var5Lifetime2++) {
            this.patternRowCounts[var5Lifetime2] = input.readUnsignedByte(0) + 1;
            int var6 = input.readUnsignedShort(1952);
            byte[] var16 = new byte[var6];
            if (0 < var6) {
              input.readBytes(var16, (byte) -96, 0, var6);
              this.patternData[var5Lifetime2] = var16;
            }
          }
          this.volumeEnvelopeFlags = new int[this.instrumentCount];
          this.panLoopEndPoints = new int[this.instrumentCount];
          this.panLoopStartPoints = new int[this.instrumentCount];
          this.panEnvelopeFlags = new int[this.instrumentCount];
          this.panEnvelopeTicks = new int[this.instrumentCount][];
          this.panEnvelopeValues = new int[this.instrumentCount][];
          this.instrumentSampleMaps = new int[this.instrumentCount][96];
          this.volumeLoopStartPoints = new int[this.instrumentCount];
          this.instrumentFadeouts = new int[this.instrumentCount];
          this.volumeSustainPoints = new int[this.instrumentCount];
          this.volumeLoopEndPoints = new int[this.instrumentCount];
          this.volumeEnvelopeValues = new int[this.instrumentCount][];
          this.panSustainPoints = new int[this.instrumentCount];
          this.volumeEnvelopeTicks = new int[this.instrumentCount][];
          int var5Lifetime3 = input.readUnsignedShort(1952);
          this.samplePans = new int[var5Lifetime3];
          this.sampleLengths = new int[var5Lifetime3];
          this.sampleFlags = new int[var5Lifetime3];
          this.sampleGroupIds = new int[var5Lifetime3];
          this.sampleVolumes = new int[var5Lifetime3];
          this.sampleRelativeNotes = new int[var5Lifetime3];
          this.samples = new PcmSample[var5Lifetime3];
          this.sampleFileIds = new int[var5Lifetime3];
          this.sampleLoopStarts = new int[var5Lifetime3];
          this.sampleFineTunes = new int[var5Lifetime3];
          this.sampleLoopEnds = new int[var5Lifetime3];
          int var5Lifetime4 = 0;
          for (int var6Lifetime1 = 0; var6Lifetime1 < this.instrumentCount; var6Lifetime1++) {
            int var7 = input.readUnsignedByte(0);
            if (var7 > 0) {
              int var4Lifetime1 = 0;
              for (int var8 = 0; var8 < 96; var8++) {
                int dupTemp$1 = var4Lifetime1 + input.readUnsignedByte(0);
                var4Lifetime1 = dupTemp$1;
                this.instrumentSampleMaps[var6Lifetime1][var8] = var5Lifetime4 + SpriteCheckboxPainter.bitwiseAnd(255, dupTemp$1);
              }
              this.volumeEnvelopeFlags[var6Lifetime1] = input.readUnsignedByte(0);
              int var8Lifetime1 = input.readUnsignedByte(0);
              this.volumeSustainPoints[var6Lifetime1] = input.readUnsignedByte(0);
              this.volumeLoopStartPoints[var6Lifetime1] = input.readUnsignedByte(0);
              this.volumeLoopEndPoints[var6Lifetime1] = this.volumeLoopStartPoints[var6Lifetime1] + input.readUnsignedByte(0);
              this.panEnvelopeFlags[var6Lifetime1] = input.readUnsignedByte(0);
              int var9 = input.readUnsignedByte(0);
              this.panSustainPoints[var6Lifetime1] = input.readUnsignedByte(0);
              this.panLoopStartPoints[var6Lifetime1] = input.readUnsignedByte(0);
              this.panLoopEndPoints[var6Lifetime1] = this.panLoopStartPoints[var6Lifetime1] + input.readUnsignedByte(0);
              int var4Lifetime1Lifetime1 = 0;
              int[] array$2 = new int[var8Lifetime1];
              this.volumeEnvelopeTicks[var6Lifetime1] = array$2;
              int var10 = 0;
              for (int var11 = 0; var8Lifetime1 > var11; var11++) {
                int dupTemp$3 = var10 + input.readSignedSmart((byte) 32);
                var10 = dupTemp$3;
                int localTemp$4 = var4Lifetime1Lifetime1 + dupTemp$3;
                var4Lifetime1Lifetime1 = localTemp$4;
                this.volumeEnvelopeTicks[var6Lifetime1][var11] = localTemp$4;
              }
              int[] array$5 = new int[var8Lifetime1];
              this.volumeEnvelopeValues[var6Lifetime1] = array$5;
              int var4Lifetime1Lifetime2 = 0;
              for (int var11Lifetime1 = 0; var11Lifetime1 < var8Lifetime1; var11Lifetime1++) {
                int dupTemp$6 = var4Lifetime1Lifetime2 + input.readUnsignedByte(0);
                var4Lifetime1Lifetime2 = dupTemp$6;
                this.volumeEnvelopeValues[var6Lifetime1][var11Lifetime1] = SpriteCheckboxPainter.bitwiseAnd(255, dupTemp$6);
              }
              int[] array$7 = new int[var9];
              this.panEnvelopeTicks[var6Lifetime1] = array$7;
              int var4Lifetime1Lifetime3 = 0;
              int var10Lifetime1 = 0;
              for (int var11Lifetime2 = 0; var9 > var11Lifetime2; var11Lifetime2++) {
                int dupTemp$8 = var10Lifetime1 + input.readSignedSmart((byte) 114);
                var10Lifetime1 = dupTemp$8;
                int localTemp$9 = var4Lifetime1Lifetime3 + dupTemp$8;
                var4Lifetime1Lifetime3 = localTemp$9;
                this.panEnvelopeTicks[var6Lifetime1][var11Lifetime2] = localTemp$9;
              }
              int var4Lifetime1Lifetime4 = 0;
              int[] array$10 = new int[var9];
              this.panEnvelopeValues[var6Lifetime1] = array$10;
              for (int var11Lifetime3 = 0; var9 > var11Lifetime3; var11Lifetime3++) {
                int dupTemp$11 = var4Lifetime1Lifetime4 + input.readUnsignedByte(0);
                var4Lifetime1Lifetime4 = dupTemp$11;
                this.panEnvelopeValues[var6Lifetime1][var11Lifetime3] = SpriteCheckboxPainter.bitwiseAnd(255, dupTemp$11);
              }
              this.instrumentFadeouts[var6Lifetime1] = input.readUnsignedShort(1952);
              for (int var11Lifetime4 = 0; var11Lifetime4 < var7; var11Lifetime4++) {
                this.sampleLengths[var5Lifetime4] = input.readUnsignedMedium((byte) -112);
                this.sampleLoopStarts[var5Lifetime4] = input.readUnsignedMedium((byte) -126);
                this.sampleLoopEnds[var5Lifetime4] = this.sampleLoopStarts[var5Lifetime4] + input.readUnsignedMedium((byte) -107);
                this.sampleVolumes[var5Lifetime4] = input.readUnsignedByte(0);
                this.sampleFineTunes[var5Lifetime4] = input.readByte(false);
                this.sampleFlags[var5Lifetime4] = input.readUnsignedByte(0);
                this.samplePans[var5Lifetime4] = input.readUnsignedByte(0);
                this.sampleRelativeNotes[var5Lifetime4] = input.readByte(false) - 1;
                this.sampleGroupIds[var5Lifetime4] = input.readUnsignedShort(1952);
                this.sampleFileIds[var5Lifetime4] = input.readUnsignedShort(1952);
                var5Lifetime4++;
              }
            }
          }
          this.loadSamples(260404420);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ce.<init>(" + (input != null ? "{...}" : "null") + ',' + (soundCache != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new AchievementTracker();
    }
}
