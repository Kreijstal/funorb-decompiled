/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteArrayPoolSupport {
    static String[] rankedListResponseNames;
    static String loadingStatusText;
    static String tutorialColourMatchMessage;
    static Sprite fadingDialogScratchSprite;
    static String createPasswordConfirmationTooltipText;

    final synchronized static byte[] acquireByteArray(boolean earlyReturnGuard, int length) {
        int pool100PopIndex = 0;
        int pool5000PopIndex = 0;
        int pool30000PopIndex = 0;
        int additionalPoolPopIndex = 0;
        byte[][] additionalPoolSnapshot = null;
        byte[] smallPoolArrayBeforeReturn;
        int additionalPoolIndex;
        byte[] additionalPoolArrayBeforeReturn;
        byte[] mediumPoolArrayBeforeReturn;
        byte[] largePoolArrayBeforeReturn;
        if (length == 100 &&
            DialRenderer.byteArrayPool100Count > 0) {
          pool100PopIndex = DialRenderer.byteArrayPool100Count - 1;
          DialRenderer.byteArrayPool100Count = DialRenderer.byteArrayPool100Count - 1;
          smallPoolArrayBeforeReturn = TextInputWidget.byteArrayPool100[pool100PopIndex];
          TextInputWidget.byteArrayPool100[DialRenderer.byteArrayPool100Count] = null;
          return smallPoolArrayBeforeReturn;
        }
        if (length == 5000 &&
            0 < TextWidgetSupport.byteArrayPool5000Count) {
          pool5000PopIndex = TextWidgetSupport.byteArrayPool5000Count - 1;
          TextWidgetSupport.byteArrayPool5000Count = TextWidgetSupport.byteArrayPool5000Count - 1;
          mediumPoolArrayBeforeReturn = StatefulWidgetRenderer.byteArrayPool5000[pool5000PopIndex];
          StatefulWidgetRenderer.byteArrayPool5000[TextWidgetSupport.byteArrayPool5000Count] = null;
          return mediumPoolArrayBeforeReturn;
        }
        if (earlyReturnGuard) {
          return (byte[]) null;
        }
        if (length == 30000 &&
            EmailValidator.byteArrayPool30000Count > 0) {
          pool30000PopIndex = EmailValidator.byteArrayPool30000Count - 1;
          EmailValidator.byteArrayPool30000Count = EmailValidator.byteArrayPool30000Count - 1;
          largePoolArrayBeforeReturn = NetworkArchiveRequest.byteArrayPool30000[pool30000PopIndex];
          NetworkArchiveRequest.byteArrayPool30000[EmailValidator.byteArrayPool30000Count] = null;
          return largePoolArrayBeforeReturn;
        }
        if (SharedBufferPools.additionalByteArrayPools != null) {
          additionalPoolIndex = 0;
          while (!(additionalPoolIndex >= TextPairLoginPayload.additionalByteArrayPoolLengths.length)) {
            if (TextPairLoginPayload.additionalByteArrayPoolLengths[additionalPoolIndex] != length) {
              additionalPoolIndex++;
              continue;
            }
            if (0 >= ClientClockSupport.additionalByteArrayPoolCounts[additionalPoolIndex]) {
              additionalPoolIndex++;
              continue;
            }
            additionalPoolPopIndex = ClientClockSupport.additionalByteArrayPoolCounts[additionalPoolIndex] - 1;
            additionalPoolSnapshot = SharedBufferPools.additionalByteArrayPools[additionalPoolIndex];
            ClientClockSupport.additionalByteArrayPoolCounts[additionalPoolIndex] = additionalPoolPopIndex;
            additionalPoolArrayBeforeReturn = additionalPoolSnapshot[additionalPoolPopIndex];
            SharedBufferPools.additionalByteArrayPools[additionalPoolIndex][ClientClockSupport.additionalByteArrayPoolCounts[additionalPoolIndex]] = null;
            return additionalPoolArrayBeforeReturn;
          }
        }
        return new byte[length];
    }

    final static void resendIntRecordRequests(int packetOpcode, int methodGuard) {
        int clientControlFlowGuard = 0;
        KeyedIntRecordSubmission submission = null;
        IntArrayQuery query = null;
        RuntimeException caughtResendFailure = null;
        RuntimeException resendFailureForContext = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          submission = (KeyedIntRecordSubmission) (GrowableIntList.pendingIntRecordSubmissions.firstForIteration(0));
          while (submission != null) {
            LoginUiSupport.writeIntRecordSubmission(packetOpcode, 86, submission);
            submission = (KeyedIntRecordSubmission) (GrowableIntList.pendingIntRecordSubmissions.nextForIteration(1));
          }
          if (methodGuard < 115) {
            fadingDialogScratchSprite = (Sprite) null;
          }
          query = (IntArrayQuery) (IntArrayQuery.pendingIntArrayQueries.firstForIteration(0));
          while (query != null) {
            StrongCacheReference.writeIntArrayQuery((byte) -88, packetOpcode, query);
            query = (IntArrayQuery) (IntArrayQuery.pendingIntArrayQueries.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException resendFailure) {
          caughtResendFailure = resendFailure;
          resendFailureForContext = caughtResendFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) resendFailureForContext), "oi.B(" + packetOpcode + ',' + methodGuard + ')');
        }
    }

    final static Sprite[] loadSpritesByName(byte methodGuard, String fileName, String groupName, ResourceArchive graphicsArchive) {
        int groupId = 0;
        RuntimeException spriteLoadFailureForContext = null;
        int guardResidue = 0;
        int fileId = 0;
        Sprite[] spritesBeforeReturn = null;
        RuntimeException spriteLoadFailureBeforeContext = null;
        StringBuilder spriteLoadMessagePrefix = null;
        String fileNameDescription = null;
        StringBuilder spriteLoadMessageBeforeGroupName = null;
        String groupNameDescription = null;
        StringBuilder spriteLoadMessageBeforeArchive = null;
        String graphicsArchiveDescription = null;
        RuntimeException caughtSpriteLoadFailure = null;
        try {
          guardResidue = -59 % ((41 - methodGuard) / 39);
          groupId = graphicsArchive.findGroupId((byte) 127, groupName);
          fileId = graphicsArchive.findFileId(fileName, -101, groupId);
          spritesBeforeReturn = StatefulWidgetRenderer.loadSpritesWithDecodedAlpha(groupId, -122, fileId, graphicsArchive);
          return spritesBeforeReturn;
        } catch (java.lang.RuntimeException spriteLoadFailure) {
          caughtSpriteLoadFailure = spriteLoadFailure;
          spriteLoadFailureForContext = caughtSpriteLoadFailure;
          spriteLoadFailureBeforeContext = spriteLoadFailureForContext;
          spriteLoadMessagePrefix = new StringBuilder().append("oi.C(").append(methodGuard).append(',');
          if (fileName == null) {
            fileNameDescription = "null";
          } else {
            fileNameDescription = "{...}";
          }
          spriteLoadMessageBeforeGroupName = ((StringBuilder) (Object) spriteLoadMessagePrefix).append(fileNameDescription).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          spriteLoadMessageBeforeArchive = ((StringBuilder) (Object) spriteLoadMessageBeforeGroupName).append(groupNameDescription).append(',');
          if (graphicsArchive == null) {
            graphicsArchiveDescription = "null";
          } else {
            graphicsArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) spriteLoadFailureBeforeContext), ((StringBuilder) (Object) spriteLoadMessageBeforeArchive).append(graphicsArchiveDescription).append(')').toString());
        }
    }

    public static void clearBytePoolAndUiResources(byte methodGuard) {
        createPasswordConfirmationTooltipText = null;
        int guardResidue = -119 / ((methodGuard - 49) / 55);
        loadingStatusText = null;
        fadingDialogScratchSprite = null;
        tutorialColourMatchMessage = null;
        rankedListResponseNames = null;
    }

    static {
        rankedListResponseNames = new String[255];
        tutorialColourMatchMessage = "The objective of Geoblox is to stack geoblox on your avatar in patterns of three in a row, by shape, colour, or both shape AND colour. Matching both shape and colour simultaneously will earn you even more points!<br>Try connecting three of a kind by colour now. Press <img=2> once you are ready to continue.";
        createPasswordConfirmationTooltipText = "Type your password again to make sure it's correct";
    }
}
