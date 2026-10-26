/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundCache {
    static String field_f;
    private IntrusiveNodeHashTable vorbisSampleCache;
    static int field_d;
    static long[] field_c;
    static int field_e;
    private ResourceArchive vorbisSoundArchive;
    private ResourceArchive synthesizedSoundArchive;
    private IntrusiveNodeHashTable pcmSampleCache;

    final PcmSample getVorbisSample(int sampleId, int[] remainingByteBudget, byte obfuscationGuard) {
        RuntimeException var4 = null;
        PcmSample stackIn_3_0 = null;
        PcmSample stackIn_6_0 = null;
        PcmSample stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.vorbisSoundArchive.a((byte) 127)) {
            stackIn_3_0 = this.getVorbisSampleByGroup(0, sampleId, remainingByteBudget, 1452176260);
            return stackIn_3_0;
          }
          if (this.vorbisSoundArchive.b(sampleId, obfuscationGuard + 28004) == 1) {
            stackIn_6_0 = this.getVorbisSampleByGroup(sampleId, 0, remainingByteBudget, 1452176260);
            return stackIn_6_0;
          }
          if (obfuscationGuard == -92) {
            throw new RuntimeException();
          }
          stackIn_9_0 = (PcmSample) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ob.F(").append(sampleId).append(',');
          if (remainingByteBudget == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
          field_e = 125;
          field_c = null;
          return;
        }
        field_c = null;
    }

    private final PcmSample getVorbisSampleByGroup(int groupId, int fileId, int[] remainingByteBudget, int obfuscationGuard) {
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_6_0 = null;
        PcmSample stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        t var9 = null;
        PcmSample var8Lifetime1;
        try {
          var5_int = fileId ^ ((groupId & -268431361) << 4 | groupId >>> 12);
          var5_int = var5_int | groupId << 16;
          if (obfuscationGuard != 1452176260) {
            stackIn_2_0 = (PcmSample) null;
            return stackIn_2_0;
          }
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (PcmSample) (this.pcmSampleCache.findByKey((byte) 106, var6));
          if (var8 != null) {
            stackIn_6_0 = var8;
            return stackIn_6_0;
          }
          if (remainingByteBudget != null &&
            remainingByteBudget[0] <= 0) {
            return null;
          }
          var9 = (t) (this.vorbisSampleCache.findByKey((byte) 106, var6));
          if (var9 == null) {
            var9 = t.a(this.vorbisSoundArchive, groupId, fileId);
            if (var9 == null) {
              return null;
            }
            this.vorbisSampleCache.put(-105, var6, var9);
          }
          var8Lifetime1 = var9.a(remainingByteBudget);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.unlink(-125);
          this.pcmSampleCache.put(124, var6, var8Lifetime1);
          stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("ob.D(").append(groupId).append(',').append(fileId).append(',');
          if (remainingByteBudget == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static String a(String param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (rr.field_b.startsWith("win")) {
            stackIn_2_0 = param0 + ".dll";
            return stackIn_2_0;
          }
          if (rr.field_b.startsWith("linux")) {
            stackIn_5_0 = "lib" + param0 + ".so";
            return stackIn_5_0;
          }
          if (rr.field_b.startsWith("mac")) {
            stackIn_8_0 = "lib" + param0 + ".dylib";
            return stackIn_8_0;
          }
          if (param1 == -18) {
            return null;
          }
          stackIn_12_0 = (String) null;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ob.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final PcmSample getSynthesizedSampleByGroup(int fileId, int[] remainingByteBudget, int groupId, int obfuscationGuard) {
        PcmSample discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        bj var9 = null;
        int[] var10 = null;
        PcmSample var11 = null;
        PcmSample stackIn_5_0 = null;
        PcmSample stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        PcmSample var8Lifetime1;
        try {
          var5_int = (groupId >>> 12 | (groupId & -805302273) << 4) ^ fileId;
          var5_int = var5_int | groupId << 16;
          var6 = (long)var5_int;
          if (obfuscationGuard > -37) {
            var10 = (int[]) null;
            discarded$1 = this.getVorbisSampleByGroup(-58, -101, (int[]) null, -98);
          }
          var8 = (PcmSample) (this.pcmSampleCache.findByKey((byte) 106, var6));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (remainingByteBudget != null &&
            remainingByteBudget[0] <= 0) {
            return null;
          }
          var9 = bj.a(this.synthesizedSoundArchive, groupId, fileId);
          if (var9 == null) {
            return null;
          }
          var11 = var9.a();
          var8Lifetime1 = var11;
          this.pcmSampleCache.put(105, var6, var8Lifetime1);
          if (remainingByteBudget != null) {
            remainingByteBudget[0] = remainingByteBudget[0] - var11.samples.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ob.A(").append(fileId).append(',');
          if (remainingByteBudget == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(groupId).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final PcmSample getSynthesizedSample(int[] remainingByteBudget, int sampleId, byte obfuscationGuard) {
        RuntimeException var4 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.synthesizedSoundArchive.a((byte) 113) == 1) {
            stackIn_2_0 = this.getSynthesizedSampleByGroup(sampleId, remainingByteBudget, 0, -58);
            return stackIn_2_0;
          }
          if (obfuscationGuard <= 96) {
            field_f = (String) null;
          }
          if (this.synthesizedSoundArchive.b(sampleId, 27912) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.getSynthesizedSampleByGroup(0, remainingByteBudget, sampleId, -58);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ob.B(");
          if (remainingByteBudget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(sampleId).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SoundCache(ResourceArchive synthesizedSoundArchive, ResourceArchive vorbisSoundArchive) {
        this.vorbisSampleCache = new IntrusiveNodeHashTable(256);
        this.pcmSampleCache = new IntrusiveNodeHashTable(256);
        try {
          this.synthesizedSoundArchive = synthesizedSoundArchive;
          this.vorbisSoundArchive = vorbisSoundArchive;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ob.<init>(" + (synthesizedSoundArchive != null ? "{...}" : "null") + ',' + (vorbisSoundArchive != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new long[32];
        field_f = "Name";
    }
}
