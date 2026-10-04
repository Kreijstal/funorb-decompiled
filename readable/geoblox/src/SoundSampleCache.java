/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundSampleCache {
    private ResourceArchive vorbisArchive;
    private IntrusiveNodeHashTable pendingVorbisDecoders;
    private ResourceArchive synthesizedSoundArchive;
    private IntrusiveNodeHashTable decodedSamples;

    final PcmSample getVorbisSampleByName(int methodGuard, String resourceName) {
        RuntimeException lookupFailureForContext = null;
        PcmSample invalidGuardResult = null;
        PcmSample sampleAtReturn = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String resourceNameDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          if (methodGuard == -1879044097) {
            sampleAtReturn = this.getVorbisSampleByNameBudgeted(resourceName, (int[]) null, methodGuard ^ -1879044098);
            return sampleAtReturn;
          }
          invalidGuardResult = (PcmSample) null;
          return invalidGuardResult;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("ci.B(").append(methodGuard).append(',');
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) lookupMessagePrefix).append(resourceNameDescription).append(')').toString());
        }
    }

    final PcmSample getSynthesizedSampleByName(int methodGuard, String resourceName) {
        RuntimeException lookupFailureForContext = null;
        PcmSample invalidGuardResult = null;
        PcmSample sampleAtReturn = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String resourceNameDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          if (methodGuard == 1) {
            sampleAtReturn = this.getSynthesizedSampleByNameBudgeted((byte) -90, resourceName, (int[]) null);
            return sampleAtReturn;
          }
          invalidGuardResult = (PcmSample) null;
          return invalidGuardResult;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("ci.A(").append(methodGuard).append(',');
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) lookupMessagePrefix).append(resourceNameDescription).append(')').toString());
        }
    }

    final PcmSample getVorbisSampleById(int sampleId, int expectedFileSlotCount, int[] byteBudget) {
        RuntimeException lookupFailureForContext = null;
        PcmSample singleGroupSampleAtReturn = null;
        PcmSample singleFileSampleAtReturn = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String byteBudgetDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          if (1 == this.vorbisArchive.getGroupSlotCount(false)) {
            singleGroupSampleAtReturn = this.getVorbisSampleByIds(byteBudget, 0, sampleId, (byte) 14);
            return singleGroupSampleAtReturn;
          }
          if (expectedFileSlotCount != this.vorbisArchive.getFileSlotCount(-9467, sampleId)) {
            throw new RuntimeException();
          }
          singleFileSampleAtReturn = this.getVorbisSampleByIds(byteBudget, sampleId, 0, (byte) 14);
          return singleFileSampleAtReturn;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("ci.J(").append(sampleId).append(',').append(expectedFileSlotCount).append(',');
          if (byteBudget == null) {
            byteBudgetDescription = "null";
          } else {
            byteBudgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) lookupMessagePrefix).append(byteBudgetDescription).append(')').toString());
        }
    }

    final PcmSample getSynthesizedSampleById(int sampleId, int[] byteBudget, boolean groupLookupGuard) {
        RuntimeException lookupFailureForContext = null;
        PcmSample singleGroupSampleAtReturn = null;
        PcmSample singleFileSampleAtReturn = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String byteBudgetDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          if (this.synthesizedSoundArchive.getGroupSlotCount(groupLookupGuard) == 1) {
            singleGroupSampleAtReturn = this.getSynthesizedSampleByIds(byteBudget, 97, 0, sampleId);
            return singleGroupSampleAtReturn;
          }
          if (1 != this.synthesizedSoundArchive.getFileSlotCount(-9467, sampleId)) {
            throw new RuntimeException();
          }
          singleFileSampleAtReturn = this.getSynthesizedSampleByIds(byteBudget, 125, sampleId, 0);
          return singleFileSampleAtReturn;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("ci.E(").append(sampleId).append(',');
          if (byteBudget == null) {
            byteBudgetDescription = "null";
          } else {
            byteBudgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) lookupMessagePrefix).append(byteBudgetDescription).append(',').append(groupLookupGuard).append(')').toString());
        }
    }

    private final PcmSample getSynthesizedSampleByNameBudgeted(byte methodGuard, String resourceName, int[] byteBudget) {
        RuntimeException lookupFailureForContext = null;
        PcmSample namedFileSampleAtReturn = null;
        PcmSample namedGroupSampleAtReturn = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String resourceNameDescription = null;
        StringBuilder messageBeforeByteBudget = null;
        String byteBudgetDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          if (methodGuard != -90) {
            this.vorbisArchive = (ResourceArchive) null;
          }
          if (!this.synthesizedSoundArchive.hasGroupName((byte) -126, "")) {
            namedGroupSampleAtReturn = this.getSynthesizedSample(byteBudget, "", resourceName, true);
            return namedGroupSampleAtReturn;
          }
          namedFileSampleAtReturn = this.getSynthesizedSample(byteBudget, resourceName, "", true);
          return namedFileSampleAtReturn;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("ci.F(").append(methodGuard).append(',');
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          messageBeforeByteBudget = ((StringBuilder) (Object) lookupMessagePrefix).append(resourceNameDescription).append(',');
          if (byteBudget == null) {
            byteBudgetDescription = "null";
          } else {
            byteBudgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeByteBudget).append(byteBudgetDescription).append(')').toString());
        }
    }

    final static EmailAvailabilityQuery a(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        EmailAvailabilityQuery stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((EntityContactSupport.activeEmailAvailabilityQuery.isCompleted(-87)) &&
              (!param1.equals(EntityContactSupport.activeEmailAvailabilityQuery.candidateEmail(19491)))) {
            EntityContactSupport.activeEmailAvailabilityQuery = ImageProducerRasterBuffer.a((byte) 86, param1);
          }
          if (param0 != -1) {
            var3 = (String) null;
            SoundSampleCache.a(-30, (String) null);
          }
          stackIn_7_0 = EntityContactSupport.activeEmailAvailabilityQuery;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ci.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final PcmSample getSynthesizedSample(int[] byteBudget, String fileName, String groupName, boolean methodGuard) {
        int groupId = 0;
        RuntimeException lookupFailureForContext = null;
        int fileId = 0;
        Object missingFileResult = null;
        PcmSample sampleAtReturn = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String byteBudgetDescription = null;
        StringBuilder messageBeforeFileName = null;
        String fileNameDescription = null;
        StringBuilder messageBeforeGroupName = null;
        String groupNameDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          groupId = this.synthesizedSoundArchive.findGroupId((byte) 127, groupName);
          if (groupId < 0) {
            return null;
          }
          if (!methodGuard) {
            this.synthesizedSoundArchive = (ResourceArchive) null;
          }
          fileId = this.synthesizedSoundArchive.findFileId(fileName, -98, groupId);
          if (fileId >= 0) {
            sampleAtReturn = this.getSynthesizedSampleByIds(byteBudget, 98, groupId, fileId);
            return sampleAtReturn;
          }
          missingFileResult = null;
          return (PcmSample) (missingFileResult);
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("ci.H(");
          if (byteBudget == null) {
            byteBudgetDescription = "null";
          } else {
            byteBudgetDescription = "{...}";
          }
          messageBeforeFileName = ((StringBuilder) (Object) lookupMessagePrefix).append(byteBudgetDescription).append(',');
          if (fileName == null) {
            fileNameDescription = "null";
          } else {
            fileNameDescription = "{...}";
          }
          messageBeforeGroupName = ((StringBuilder) (Object) messageBeforeFileName).append(fileNameDescription).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeGroupName).append(groupNameDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    private final PcmSample getSynthesizedSampleByIds(int[] byteBudget, int methodGuard, int groupId, int fileId) {
        int packedCacheKey = 0;
        RuntimeException lookupFailureForContext = null;
        long cacheKey = 0L;
        PcmSample cachedThenRenderedSample = null;
        SynthesizedSoundEffect soundEffect = null;
        PcmSample renderedSample = null;
        PcmSample cachedSampleAtReturn = null;
        PcmSample renderedSampleAtReturn = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String byteBudgetDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          packedCacheKey = fileId ^ (65533 & groupId << 4 | groupId >>> 12);
          packedCacheKey = packedCacheKey | groupId << 16;
          cacheKey = (long)packedCacheKey;
          cachedThenRenderedSample = (PcmSample) ((Object) this.decodedSamples.findByKey(cacheKey, (byte) -74));
          if (methodGuard <= 19) {
            this.synthesizedSoundArchive = (ResourceArchive) null;
          }
          if (cachedThenRenderedSample != null) {
            cachedSampleAtReturn = cachedThenRenderedSample;
            return cachedSampleAtReturn;
          }
          if ((byteBudget != null) &&
              (byteBudget[0] <= 0)) {
            return null;
          }
          soundEffect = SynthesizedSoundEffect.load(this.synthesizedSoundArchive, groupId, fileId);
          if (soundEffect == null) {
            return null;
          }
          renderedSample = soundEffect.toPcmSample();
          cachedThenRenderedSample = renderedSample;
          this.decodedSamples.put((byte) 102, cachedThenRenderedSample, cacheKey);
          if (byteBudget != null) {
            byteBudget[0] = byteBudget[0] - renderedSample.samples.length;
          }
          renderedSampleAtReturn = cachedThenRenderedSample;
          return renderedSampleAtReturn;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("ci.C(");
          if (byteBudget == null) {
            byteBudgetDescription = "null";
          } else {
            byteBudgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) lookupMessagePrefix).append(byteBudgetDescription).append(',').append(methodGuard).append(',').append(groupId).append(',').append(fileId).append(')').toString());
        }
    }

    private final PcmSample getVorbisSampleByIds(int[] byteBudget, int groupId, int fileId, byte methodGuard) {
        int packedCacheKey = 0;
        RuntimeException lookupFailureForContext = null;
        long cacheKey = 0L;
        PcmSample cachedThenDecodedSample = null;
        MusicDecoder decoder = null;
        PcmSample invalidGuardResult = null;
        PcmSample cachedSampleAtReturn = null;
        Object exhaustedBudgetResult = null;
        Object missingDecoderResult = null;
        Object incompleteDecodeResult = null;
        PcmSample decodedSampleAtReturn = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String byteBudgetDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          packedCacheKey = ((groupId & -1879044097) << 4 | groupId >>> 12) ^ fileId;
          packedCacheKey = packedCacheKey | groupId << 16;
          cacheKey = (long)packedCacheKey ^ 4294967296L;
          cachedThenDecodedSample = (PcmSample) ((Object) this.decodedSamples.findByKey(cacheKey, (byte) -115));
          if (methodGuard != 14) {
            invalidGuardResult = (PcmSample) null;
            return invalidGuardResult;
          }
          if (cachedThenDecodedSample != null) {
            cachedSampleAtReturn = cachedThenDecodedSample;
            return cachedSampleAtReturn;
          }
          if ((byteBudget != null) &&
              (byteBudget[0] <= 0)) {
            exhaustedBudgetResult = null;
            return (PcmSample) (exhaustedBudgetResult);
          }
          decoder = (MusicDecoder) ((Object) this.pendingVorbisDecoders.findByKey(cacheKey, (byte) -96));
          if (decoder == null) {
            decoder = MusicDecoder.loadById(this.vorbisArchive, groupId, fileId);
            if (decoder == null) {
              missingDecoderResult = null;
              return (PcmSample) (missingDecoderResult);
            }
            this.pendingVorbisDecoders.put((byte) 102, decoder, cacheKey);
          }
          cachedThenDecodedSample = decoder.decodePcmBudgeted(byteBudget);
          if (cachedThenDecodedSample == null) {
            incompleteDecodeResult = null;
            return (PcmSample) (incompleteDecodeResult);
          }
          decoder.unlinkNode(false);
          this.decodedSamples.put((byte) 102, cachedThenDecodedSample, cacheKey);
          decodedSampleAtReturn = cachedThenDecodedSample;
          return decodedSampleAtReturn;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("ci.D(");
          if (byteBudget == null) {
            byteBudgetDescription = "null";
          } else {
            byteBudgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) lookupMessagePrefix).append(byteBudgetDescription).append(',').append(groupId).append(',').append(fileId).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static void a(String[] args, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 416577356) {
            return;
          }
          if (EntityCollisionSupport.activeAccountCreationForm != null) {
            EntityCollisionSupport.activeAccountCreationForm.usernameSuggestions.setSuggestions((byte) 126, args);
          }
          if (null == MouseWheelInput.activeDisplayNamePanel) {
            return;
          }
          MouseWheelInput.activeDisplayNamePanel.usernameSuggestions.setSuggestions((byte) 126, args);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ci.I(");
          if (args == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final PcmSample getVorbisSampleByNameBudgeted(String resourceName, int[] byteBudget, int methodGuard) {
        RuntimeException lookupFailureForContext = null;
        PcmSample namedFileSampleAtReturn = null;
        PcmSample namedGroupSampleAtReturn = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String resourceNameDescription = null;
        StringBuilder messageBeforeByteBudget = null;
        String byteBudgetDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          if (this.vorbisArchive.hasGroupName((byte) -120, "")) {
            namedFileSampleAtReturn = this.getVorbisSample(resourceName, byteBudget, 12628, "");
            return namedFileSampleAtReturn;
          }
          if (methodGuard != 1) {
            this.pendingVorbisDecoders = (IntrusiveNodeHashTable) null;
          }
          namedGroupSampleAtReturn = this.getVorbisSample("", byteBudget, 12628, resourceName);
          return namedGroupSampleAtReturn;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("ci.L(");
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          messageBeforeByteBudget = ((StringBuilder) (Object) lookupMessagePrefix).append(resourceNameDescription).append(',');
          if (byteBudget == null) {
            byteBudgetDescription = "null";
          } else {
            byteBudgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeByteBudget).append(byteBudgetDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    private final PcmSample getVorbisSample(String fileName, int[] byteBudget, int methodGuard, String groupName) {
        int groupId = 0;
        RuntimeException lookupFailureForContext = null;
        int fileId = 0;
        Object missingGroupResult = null;
        PcmSample invalidGuardResult = null;
        Object missingFileResult = null;
        PcmSample sampleAtReturn = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String fileNameDescription = null;
        StringBuilder messageBeforeByteBudget = null;
        String byteBudgetDescription = null;
        StringBuilder messageBeforeGroupName = null;
        String groupNameDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          groupId = this.vorbisArchive.findGroupId((byte) 127, groupName);
          if (0 > groupId) {
            missingGroupResult = null;
            return (PcmSample) (missingGroupResult);
          }
          if (methodGuard != 12628) {
            invalidGuardResult = (PcmSample) null;
            return invalidGuardResult;
          }
          fileId = this.vorbisArchive.findFileId(fileName, -89, groupId);
          if (fileId >= 0) {
            sampleAtReturn = this.getVorbisSampleByIds(byteBudget, groupId, fileId, (byte) 14);
            return sampleAtReturn;
          }
          missingFileResult = null;
          return (PcmSample) (missingFileResult);
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("ci.G(");
          if (fileName == null) {
            fileNameDescription = "null";
          } else {
            fileNameDescription = "{...}";
          }
          messageBeforeByteBudget = ((StringBuilder) (Object) lookupMessagePrefix).append(fileNameDescription).append(',');
          if (byteBudget == null) {
            byteBudgetDescription = "null";
          } else {
            byteBudgetDescription = "{...}";
          }
          messageBeforeGroupName = ((StringBuilder) (Object) messageBeforeByteBudget).append(byteBudgetDescription).append(',').append(methodGuard).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeGroupName).append(groupNameDescription).append(')').toString());
        }
    }

    SoundSampleCache(ResourceArchive synthesizedSoundArchive, ResourceArchive vorbisArchive) {
        this.pendingVorbisDecoders = new IntrusiveNodeHashTable(256);
        this.decodedSamples = new IntrusiveNodeHashTable(256);
        try {
            this.synthesizedSoundArchive = synthesizedSoundArchive;
            this.vorbisArchive = vorbisArchive;
        } catch (RuntimeException cacheInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cacheInitializationFailure), "ci.<init>(" + (synthesizedSoundArchive != null ? "{...}" : "null") + ',' + (vorbisArchive != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
