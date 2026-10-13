/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundCache {
    private ResourceArchive soundEffectArchive;
    static String field_d;
    static int field_b;
    static AccountNameCheckResult field_a;
    static String field_i;
    static String field_f;
    private ResourceArchive musicSampleArchive;
    private NodeHashTable unfinishedMusicSamples;
    static String field_c;
    private NodeHashTable pcmSamples;

    private final PcmSample loadSoundEffectByName(String fileName, String groupName, int obfuscationGuard, int[] sampleBudget) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        PcmSample stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.soundEffectArchive.getGroupId(groupName, 125);
          if (var5_int < obfuscationGuard) {
            stackIn_2_0 = null;
            return (PcmSample) (stackIn_2_0);
          }
          var6 = this.soundEffectArchive.getFileId((byte) 119, var5_int, fileName);
          if (var6 < 0) {
            return null;
          }
          stackIn_7_0 = this.loadSoundEffect(obfuscationGuard ^ 0, sampleBudget, var6, var5_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("p.E(");
          if (fileName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (groupName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(',');
          if (sampleBudget == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final PcmSample loadSoundEffectById(boolean obfuscationGuard, int[] sampleBudget, int sampleId) {
        RuntimeException var4 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_6_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.soundEffectArchive.getGroupCapacity(-113) == 1) {
            stackIn_2_0 = this.loadSoundEffect(0, sampleBudget, sampleId, 0);
            return stackIn_2_0;
          }
          if (1 == this.soundEffectArchive.getFileCapacity(sampleId, -2)) {
            stackIn_6_0 = this.loadSoundEffect(0, sampleBudget, 0, sampleId);
            return stackIn_6_0;
          }
          if (!obfuscationGuard) {
            field_a = (AccountNameCheckResult) null;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("p.I(").append(obfuscationGuard).append(',');
          if (sampleBudget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(sampleId).append(')').toString());
        }
    }

    final PcmSample getMusicSampleByName(byte obfuscationGuard, String groupName, String fileName) {
        RuntimeException var4 = null;
        java.applet.Applet var5 = null;
        PcmSample stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -125) {
            var5 = (java.applet.Applet) null;
            SoundCache.a(-46, (java.applet.Applet) null);
          }
          stackIn_3_0 = this.loadMusicSampleByName((int[]) null, (byte) 115, fileName, groupName);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("p.A(").append(obfuscationGuard).append(',');
          if (groupName == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (fileName == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final PcmSample loadMusicSample(int obfuscationGuard, int[] sampleBudget, int groupId, int fileId) {
        PcmSample stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_10_0 = null;
        PcmSample stackIn_17_0 = null;
        PcmSample stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int mixedResourceId = 0;
        RuntimeException var5 = null;
        long cacheKey = 0L;
        PcmSample cachedSample = null;
        VorbisSample musicSample = null;
        PcmSample decodedSample;
        try {
          mixedResourceId = fileId ^ (65532 & groupId << 4 | groupId >>> 12);
          mixedResourceId = mixedResourceId | groupId << 16;
          cacheKey = 4294967296L ^ (long)mixedResourceId;
          cachedSample = (PcmSample) (this.pcmSamples.get(-56, cacheKey));
          if (cachedSample != null) {
            stackIn_2_0 = cachedSample;
            return stackIn_2_0;
          }
          if (sampleBudget != null &&
            0 >= sampleBudget[0]) {
            stackIn_6_0 = null;
            return (PcmSample) (stackIn_6_0);
          }
          musicSample = (VorbisSample) (this.unfinishedMusicSamples.get(obfuscationGuard + 648691672, cacheKey));
          if (musicSample == null) {
            musicSample = VorbisSample.load(this.musicSampleArchive, groupId, fileId);
            if (musicSample == null) {
              stackIn_10_0 = null;
              return (PcmSample) (stackIn_10_0);
            }
            this.unfinishedMusicSamples.put(musicSample, cacheKey, obfuscationGuard + 648691834);
          }
          decodedSample = musicSample.decodeToPcm(sampleBudget);
          if (decodedSample == null) {
            return null;
          }
          musicSample.unlink(obfuscationGuard + 648691815);
          if (obfuscationGuard != -648691772) {
            stackIn_17_0 = (PcmSample) null;
            return stackIn_17_0;
          }
          this.pcmSamples.put(decodedSample, cacheKey, 32);
          stackIn_19_0 = decodedSample;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("p.D(").append(obfuscationGuard).append(',');
          if (sampleBudget == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(groupId).append(',').append(fileId).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_i = null;
        field_c = null;
        if (param0 == -58) {
          field_d = null;
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        SoundCache.a(114, (java.applet.Applet) null);
        field_d = null;
    }

    private final PcmSample loadSoundEffect(int obfuscationGuard, int[] sampleBudget, int fileId, int groupId) {
        int mixedResourceId = 0;
        RuntimeException var5 = null;
        long cacheKey = 0L;
        PcmSample cachedSample = null;
        SynthesizedSoundEffect soundEffect = null;
        PcmSample decodedSample = null;
        PcmSample stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        PcmSample stackIn_12_0 = null;
        PcmSample stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        PcmSample sampleToCache;
        try {
          mixedResourceId = (groupId >>> 12 | (1073745919 & groupId) << 4) ^ fileId;
          mixedResourceId = mixedResourceId | groupId << 16;
          cacheKey = (long)mixedResourceId;
          cachedSample = (PcmSample) (this.pcmSamples.get(obfuscationGuard ^ -121, cacheKey));
          if (cachedSample != null) {
            stackIn_2_0 = cachedSample;
            return stackIn_2_0;
          }
          if (sampleBudget != null &&
            sampleBudget[0] <= 0) {
            stackIn_6_0 = null;
            return (PcmSample) (stackIn_6_0);
          }
          soundEffect = SynthesizedSoundEffect.load(this.soundEffectArchive, groupId, fileId);
          if (soundEffect == null) {
            stackIn_9_0 = null;
            return (PcmSample) (stackIn_9_0);
          }
          if (obfuscationGuard != 0) {
            stackIn_12_0 = (PcmSample) null;
            return stackIn_12_0;
          }
          decodedSample = soundEffect.toPcmSample();
          sampleToCache = decodedSample;
          this.pcmSamples.put(sampleToCache, cacheKey, 77);
          if (sampleBudget != null) {
            sampleBudget[0] = sampleBudget[0] - decodedSample.samples.length;
          }
          stackIn_17_0 = sampleToCache;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("p.B(").append(obfuscationGuard).append(',');
          if (sampleBudget == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(fileId).append(',').append(groupId).append(')').toString());
        }
    }

    final PcmSample loadMusicSampleById(int[] sampleBudget, int obfuscationGuard, int sampleId) {
        int var4_int = 0;
        RuntimeException var4 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.musicSampleArchive.getGroupCapacity(-111) == 1) {
            stackIn_2_0 = this.loadMusicSample(-648691772, sampleBudget, 0, sampleId);
            return stackIn_2_0;
          }
          if (this.musicSampleArchive.getFileCapacity(sampleId, -2) == 1) {
            stackIn_6_0 = this.loadMusicSample(-648691772, sampleBudget, sampleId, 0);
            return stackIn_6_0;
          }
          var4_int = 50 % ((obfuscationGuard + 62) / 45);
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("p.G(");
          if (sampleBudget == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(',').append(sampleId).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param1.getParameter("username");
          if (param0 != -24602) {
            return;
          }
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (0L != DraggableWidgetContainer.a(var3, 0)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("p.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final PcmSample getSoundEffectByName(String fileName, byte obfuscationGuard, String groupName) {
        RuntimeException var4 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == -97) {
            stackIn_4_0 = this.loadSoundEffectByName(fileName, groupName, obfuscationGuard + 97, (int[]) null);
            return stackIn_4_0;
          }
          stackIn_2_0 = (PcmSample) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("p.F(");
          if (fileName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(',');
          if (groupName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static String a(int param0, int param1, byte param2, int param3) {
        int var4;
        int var5;
        int var5Lifetime1;
        if (0 >= param0) {
          throw new IllegalArgumentException("Can only get ordinal for positive numbers");
        }
        if (0 == param3) {
          var4 = param0 % 100;
          if (var4 < 11) {
            var5 = param0 % 10;
            if (var5 == 1) {
              return param0 + "st";
            }
            if (var5 == 2) {
              return param0 + "nd";
            }
            if (var5 == 3) {
              return param0 + "rd";
            }
            return param0 + "th";
          }
          if (var4 <= 13) {
            return param0 + "th";
          }
          var5Lifetime1 = param0 % 10;
          if (var5Lifetime1 == 1) {
            return param0 + "st";
          }
          if (var5Lifetime1 == 2) {
            return param0 + "nd";
          }
          if (var5Lifetime1 == 3) {
            return param0 + "rd";
          }
          return param0 + "th";
        }
        if (param2 >= -90) {
          field_c = (String) null;
        }
        if (param3 == 1) {
          return param0 + ".";
        }
        if (param3 == 2) {
          if (param0 != 1) {
            return param0 + "ème";
          }
          if (param1 == 2) {
            return param0 + "ère";
          }
          return param0 + "er";
        }
        if (3 != param3) {
          if (param3 == 4) {
            return param0 + "e";
          }
          throw new IllegalArgumentException("Unsupported language " + param3);
        }
        if (2 != param1) {
          return param0 + "º";
        }
        return param0 + "ª";
    }

    SoundCache(ResourceArchive soundEffectArchive, ResourceArchive musicSampleArchive) {
        this.unfinishedMusicSamples = new NodeHashTable(256);
        this.pcmSamples = new NodeHashTable(256);
        try {
          this.soundEffectArchive = soundEffectArchive;
          this.musicSampleArchive = musicSampleArchive;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "p.<init>(" + (soundEffectArchive != null ? "{...}" : "null") + ',' + (musicSampleArchive != null ? "{...}" : "null") + ')');
        }
    }

    private final PcmSample loadMusicSampleByName(int[] sampleBudget, byte obfuscationGuard, String fileName, String groupName) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        PcmSample stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.musicSampleArchive.getGroupId(groupName, 108);
          if (var5_int < 0) {
            stackIn_2_0 = null;
            return (PcmSample) (stackIn_2_0);
          }
          var6 = this.musicSampleArchive.getFileId((byte) 119, var5_int, fileName);
          if (var6 < 0) {
            return null;
          }
          var7 = -61 / ((obfuscationGuard - 48) / 33);
          stackIn_7_0 = this.loadMusicSample(-648691772, sampleBudget, var5_int, var6);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("p.H(");
          if (sampleBudget == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(',');
          if (fileName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (groupName == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_f = "Searching for opponents";
        field_i = "<%0> wins!";
        field_d = "This password contains your email address, and would be easy to guess";
        field_c = "Catalysts that cause units to duplicate.";
    }
}
