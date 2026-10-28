/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundCache {
    static ReverbPcmStream field_a;
    private ResourceArchive vorbisArchive;
    private ResourceArchive synthesizedArchive;
    static String field_c;
    private IntrusiveNodeHashTable pendingVorbis;
    private IntrusiveNodeHashTable pcmCache;
    static IndexedSprite[] field_f;

    private final PcmSample getVorbisSample(int[] budget, byte guard, int groupId, int fileId) {
        String stackIn_24_2 = null;
        try {
          int var5_int = (groupId << 4 & 65522 | groupId >>> 12) ^ fileId;
          if (guard <= 14) {
            PcmSample stackIn_2_0 = (PcmSample) null;
            return stackIn_2_0;
          }
          var5_int = var5_int | groupId << 16;
          long var6 = 4294967296L ^ (long)var5_int;
          PcmSample var8 = (PcmSample) (this.pcmCache.get(var6, -1));
          if (var8 != null) {
            PcmSample stackIn_6_0 = var8;
            return stackIn_6_0;
          }
          if (budget != null &&
            0 >= budget[0]) {
            return null;
          }
          VorbisSample var9 = (VorbisSample) (this.pendingVorbis.get(var6, -1));
          if (var9 == null) {
            var9 = VorbisSample.load(this.vorbisArchive, groupId, fileId);
            if (var9 == null) {
              Object stackIn_14_0 = null;
              return (PcmSample) (stackIn_14_0);
            }
            this.pendingVorbis.put(var9, 10901, var6);
          }
          PcmSample var8Lifetime1 = var9.decodeToPcm(budget);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.unlink((byte) -27);
          this.pcmCache.put(var8Lifetime1, 10901, var6);
          PcmSample stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var5;
          StringBuilder stackIn_23_1 = new StringBuilder().append("ec.D(");
          if (budget == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(guard).append(',').append(groupId).append(',').append(fileId).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_a = null;
        int var1 = 78 / ((guard - 56) / 54);
        field_c = null;
        field_f = null;
    }

    private final PcmSample getSynthesizedSample(int guard, int groupId, int[] budget, int fileId) {
        String stackIn_21_2 = null;
        try {
          int var5_int = fileId ^ (groupId << 4 & 65533 | groupId >>> 12);
          var5_int = var5_int | groupId << 16;
          long var6 = (long)var5_int;
          PcmSample var8 = (PcmSample) (this.pcmCache.get(var6, -1));
          if (var8 != null) {
            PcmSample stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (budget != null &&
            budget[0] <= 0) {
            Object stackIn_7_0 = null;
            return (PcmSample) (stackIn_7_0);
          }
          SoundEffect var9 = SoundEffect.load(this.synthesizedArchive, groupId, fileId);
          if (var9 == null) {
            Object stackIn_10_0 = null;
            return (PcmSample) (stackIn_10_0);
          }
          if (guard != 1158948012) {
            int[] var10 = (int[]) null;
            PcmSample discarded$1 = this.getSynthesizedSample(-13, 124, (int[]) null, 13);
          }
          PcmSample var11 = var9.toPcmSample();
          PcmSample var8Lifetime1 = var11;
          this.pcmCache.put(var8Lifetime1, 10901, var6);
          if (budget != null) {
            budget[0] = budget[0] - var11.samples.length;
          }
          PcmSample stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var5;
          StringBuilder stackIn_20_1 = new StringBuilder().append("ec.C(").append(guard).append(',').append(groupId).append(',');
          if (budget == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(fileId).append(')').toString());
        }
    }

    final PcmSample getVorbisSample(int groupId, byte guard, int fileId) {
        if (guard == -128) {
          return this.getVorbisSample((int[]) null, (byte) 18, groupId, fileId);
        }
        this.synthesizedArchive = (ResourceArchive) null;
        return this.getVorbisSample((int[]) null, (byte) 18, groupId, fileId);
    }

    final PcmSample getSynthesizedSample(byte guard, int fileId, int groupId) {
        if (guard > 44) {
          return this.getSynthesizedSample(1158948012, groupId, (int[]) null, fileId);
        }
        this.vorbisArchive = (ResourceArchive) null;
        return this.getSynthesizedSample(1158948012, groupId, (int[]) null, fileId);
    }

    SoundCache(ResourceArchive param0, ResourceArchive param1) {
        this.pendingVorbis = new IntrusiveNodeHashTable(256);
        this.pcmCache = new IntrusiveNodeHashTable(256);
        try {
          this.vorbisArchive = param1;
          this.synthesizedArchive = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Email is valid";
    }
}
