/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementProtocolSupport {
    static String loadingSoundEffectsText;
    static String createDisplayNameTooltipText;

    final static void resendAchievementMessages(byte methodGuard, int packetOpcode) {
        IntrusiveNode pendingQuery = null;
        int unusedClientControlSnapshot = 0;
        AchievementSubmission unacknowledgedSubmission = null;
        RuntimeException caughtRetryException = null;
        RuntimeException retryFailure = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          unacknowledgedSubmission = (AchievementSubmission) ((Object) ResourceArchive.unacknowledgedAchievementSubmissions.firstForIteration(0));
          while (unacknowledgedSubmission != null) {
            MultiHandleSliderWidget.writeAchievementSubmissionPacket(packetOpcode, unacknowledgedSubmission, 30175);
            unacknowledgedSubmission = (AchievementSubmission) ((Object) ResourceArchive.unacknowledgedAchievementSubmissions.nextForIteration(1));
          }
          pendingQuery = NodeHashTableIterator.pendingAchievementQueries.firstForIteration(0);
          if (methodGuard > -123) {
            createDisplayNameTooltipText = (String) null;
          }
          while (pendingQuery != null) {
            RankedListQuery.writeAchievementStateRequest(-101, packetOpcode);
            pendingQuery = NodeHashTableIterator.pendingAchievementQueries.nextForIteration(1);
          }
          return;
        } catch (java.lang.RuntimeException caughtRetryFailure) {
          caughtRetryException = caughtRetryFailure;
          retryFailure = caughtRetryException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) retryFailure), "ud.A(" + methodGuard + ',' + packetOpcode + ')');
        }
    }

    final static SocialListEntry findSecondarySocialEntry(int methodGuard, String displayName) {
        String lookupName = null;
        SocialListEntry candidateEntry = null;
        String candidateName = null;
        int unusedClientControlSnapshot = 0;
        String unusedNullNameSnapshot = null;
        CharSequence inputNameCharacters = null;
        CharSequence candidateNameCharacters = null;
        SocialListEntry matchedEntryResult = null;
        RuntimeException lookupFailureCause = null;
        StringBuilder lookupFailurePrefix = null;
        String displayNameDescription = null;
        RuntimeException caughtLookupFailure = null;
        RuntimeException lookupFailureForContext = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (null == ScorePopupSupport.secondarySocialEntriesByNameHash) {
            return null;
          }
          inputNameCharacters = (CharSequence) ((Object) displayName);
          lookupName = ResizableDialog.a(inputNameCharacters, 12);
          if (lookupName == null) {
            lookupName = displayName;
          }
          candidateEntry = (SocialListEntry) ((Object) ScorePopupSupport.secondarySocialEntriesByNameHash.findFirst((long)lookupName.hashCode(), -1));
          if (methodGuard != 0) {
            unusedNullNameSnapshot = (String) null;
            AchievementProtocolSupport.findSecondarySocialEntry(55, (String) null);
          }
          while (candidateEntry != null) {
            candidateNameCharacters = (CharSequence) ((Object) candidateEntry.displayName);
            candidateName = ResizableDialog.a(candidateNameCharacters, 12);
            if (candidateName == null) {
              candidateName = candidateEntry.displayName;
            }
            if (candidateName.equals(lookupName)) {
              matchedEntryResult = candidateEntry;
              return matchedEntryResult;
            }
            candidateEntry = (SocialListEntry) ((Object) ScorePopupSupport.secondarySocialEntriesByNameHash.findNext(methodGuard ^ -29925));
          }
          return null;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureCause = lookupFailureForContext;
          lookupFailurePrefix = new StringBuilder().append("ud.C(").append(methodGuard).append(',');
          if (displayName == null) {
            displayNameDescription = "null";
          } else {
            displayNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureCause), ((StringBuilder) (Object) lookupFailurePrefix).append(displayNameDescription).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        createDisplayNameTooltipText = null;
        loadingSoundEffectsText = null;
        if (methodGuard != 0) {
            createDisplayNameTooltipText = (String) null;
        }
    }

    final static void handleAchievementResponse(int methodGuard) {
        int responseValueIndex = 0;
        RuntimeException caughtResponseException = null;
        RuntimeException responseFailure = null;
        int responseType = 0;
        int[] resultValuesForQuery = null;
        int[] resultValuesAlias = null;
        PacketBuffer packetForValueReads = null;
        int responseValueCount = 0;
        int unusedClientControlSnapshot = 0;
        int[] mutableResultValues = null;
        int[] allocatedResultValues = null;
        AchievementSubmission acknowledgedSubmission = null;
        PacketBuffer incomingPacket = null;
        int[] resultValuesBeforeQueryAssignment = null;
        AchievementQuery queryReceivingValues = null;
        AchievementQuery queryReceivingZeroValues = null;
        int[] resultValuesForMaskRead = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          incomingPacket = LogoCompositor.sessionPacketBuffer;
          responseType = incomingPacket.readUnsignedByte((byte) 34);
          if (0 == responseType) {
            allocatedResultValues = SessionGameApplet.createAchievementStateValues(89);
            resultValuesForMaskRead = allocatedResultValues;
            resultValuesBeforeQueryAssignment = resultValuesForMaskRead;
            resultValuesForQuery = resultValuesBeforeQueryAssignment;
            mutableResultValues = allocatedResultValues;
            resultValuesAlias = mutableResultValues;
            packetForValueReads = incomingPacket;
            responseValueCount = ((ByteArrayBuffer) ((Object) packetForValueReads)).readUnsignedByte((byte) 34);
            for (responseValueIndex = 0; responseValueIndex < responseValueCount; responseValueIndex++) {
              mutableResultValues[responseValueIndex] = ((ByteArrayBuffer) ((Object) packetForValueReads)).readIntBE((byte) -97);
            }
            queryReceivingValues = (AchievementQuery) ((Object) NodeHashTableIterator.pendingAchievementQueries.firstForIteration(0));
            if (queryReceivingValues == null) {
              Bzip2DecoderState.closeSessionSocket((byte) -117);
              return;
            }
            queryReceivingValues.resultValues = resultValuesForQuery;
            queryReceivingValues.completed = true;
            queryReceivingValues.achievementMask = resultValuesForMaskRead[0];
            queryReceivingValues.unlinkNode(false);
          } else {
            if (responseType == 1) {
              acknowledgedSubmission = (AchievementSubmission) ((Object) ResourceArchive.unacknowledgedAchievementSubmissions.firstForIteration(0));
              if (acknowledgedSubmission == null) {
                Bzip2DecoderState.closeSessionSocket((byte) -120);
                return;
              }
              acknowledgedSubmission.unlinkNode(false);
            } else {
              if (responseType == 2) {
                queryReceivingZeroValues = (AchievementQuery) ((Object) NodeHashTableIterator.pendingAchievementQueries.firstForIteration(0));
                if (queryReceivingZeroValues == null) {
                  Bzip2DecoderState.closeSessionSocket((byte) -115);
                  return;
                }
                queryReceivingZeroValues.resultValues = SessionGameApplet.createAchievementStateValues(86);
                queryReceivingZeroValues.achievementMask = queryReceivingZeroValues.resultValues[0];
                queryReceivingZeroValues.completed = true;
                queryReceivingZeroValues.unlinkNode(false);
              } else {
                IterableNodeHashTable.reportClientError((Throwable) null, "A1: " + TextTemplateDefinition.e(55), (byte) 125);
                Bzip2DecoderState.closeSessionSocket((byte) -116);
              }
            }
          }
          if (methodGuard <= 85) {
            AchievementProtocolSupport.releaseStaticReferences(-63);
          }
          return;
        } catch (java.lang.RuntimeException caughtResponseFailure) {
          caughtResponseException = caughtResponseFailure;
          responseFailure = caughtResponseException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) responseFailure), "ud.D(" + methodGuard + ')');
        }
    }

    static {
        createDisplayNameTooltipText = "Enter the name you'd prefer. This is the name displayed to other players.";
        loadingSoundEffectsText = "Loading sound effects";
    }
}
