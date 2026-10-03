/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
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
            ol.writeAchievementSubmissionPacket(packetOpcode, unacknowledgedSubmission, 30175);
            unacknowledgedSubmission = (AchievementSubmission) ((Object) ResourceArchive.unacknowledgedAchievementSubmissions.nextForIteration(1));
          }
          pendingQuery = k.pendingAchievementQueries.firstForIteration(0);
          if (methodGuard > -123) {
            createDisplayNameTooltipText = (String) null;
          }
          while (pendingQuery != null) {
            re.writeAchievementStateRequest(-101, packetOpcode);
            pendingQuery = k.pendingAchievementQueries.nextForIteration(1);
          }
          return;
        } catch (java.lang.RuntimeException caughtRetryFailure) {
          caughtRetryException = caughtRetryFailure;
          retryFailure = caughtRetryException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) retryFailure), "ud.A(" + methodGuard + ',' + packetOpcode + ')');
        }
    }

    final static j a(int param0, String param1) {
        String var2 = null;
        j var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        j stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Geoblox.clientControlFlowFlag;
        try {
          if (null == ug.field_a) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var2 = ResizableDialog.a(var7, 12);
          if (var2 == null) {
            var2 = param1;
          }
          var3 = (j) ((Object) ug.field_a.a((long)var2.hashCode(), -1));
          if (param0 != 0) {
            var6 = (String) null;
            ud.a(55, (String) null);
          }
          while (var3 != null) {
            var8 = (CharSequence) ((Object) var3.field_hb);
            var4 = ResizableDialog.a(var8, 12);
            if (var4 == null) {
              var4 = var3.field_hb;
            }
            if (var4.equals(var2)) {
              stackIn_16_0 = var3;
              return stackIn_16_0;
            }
            var3 = (j) ((Object) ug.field_a.a(param0 ^ -29925));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("ud.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        createDisplayNameTooltipText = null;
        loadingSoundEffectsText = null;
        if (param0 != 0) {
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
          incomingPacket = eh.field_d;
          responseType = incomingPacket.readUnsignedByte((byte) 34);
          if (0 == responseType) {
            allocatedResultValues = wf.createAchievementStateValues(89);
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
            queryReceivingValues = (AchievementQuery) ((Object) k.pendingAchievementQueries.firstForIteration(0));
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
                queryReceivingZeroValues = (AchievementQuery) ((Object) k.pendingAchievementQueries.firstForIteration(0));
                if (queryReceivingZeroValues == null) {
                  Bzip2DecoderState.closeSessionSocket((byte) -115);
                  return;
                }
                queryReceivingZeroValues.resultValues = wf.createAchievementStateValues(86);
                queryReceivingZeroValues.achievementMask = queryReceivingZeroValues.resultValues[0];
                queryReceivingZeroValues.completed = true;
                queryReceivingZeroValues.unlinkNode(false);
              } else {
                gi.a((Throwable) null, "A1: " + og.e(55), (byte) 125);
                Bzip2DecoderState.closeSessionSocket((byte) -116);
              }
            }
          }
          if (methodGuard <= 85) {
            ud.a(-63);
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
