/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshPrioritySupport {
    static int rankedSortUpperBoundValue;
    static TextTemplateArgumentType textTemplateArgumentTypeFourteen;
    static boolean messageDialogUiFlowActive;
    static ClientFlowToken completedClientFlowToken;
    static int bootstrapLanguageId;
    static IntrusiveDeque delayedIncomingPackets;

    public static void releaseStaticReferences(int methodGuard) {
        textTemplateArgumentTypeFourteen = null;
        if (methodGuard != 0) {
            return;
        }
        completedClientFlowToken = null;
        delayedIncomingPackets = null;
    }

    final static void updateSessionCookie(String sessionValue, java.applet.Applet applet, int expiryLengthComplement) {
        try {
            String cookiePrefix = null;
            String cookieHost = null;
            String cookieText = null;
            try {
                ScorePopup.sessionCookieOverride = sessionValue;
                try {
                    cookiePrefix = applet.getParameter("cookieprefix");
                    cookieHost = applet.getParameter("cookiehost");
                    cookieText = cookiePrefix + "session=" + sessionValue + "; version=1; path=/; domain=" + cookieHost;
                    if ((~sessionValue.length() == expiryLengthComplement)) {
                        cookieText = cookieText + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    AppletJavaScriptBridge.evaluateScript(applet, "document.cookie=\"" + cookieText + "\"", (byte) -92);
                } catch (Throwable ignoredCookieScriptFailure) {
                }
                ByteStorage.updatePageNavigationLinks(applet, 20000000);
            } catch (RuntimeException cookieUpdateFailure) {
                throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cookieUpdateFailure), "va.C(" + (sessionValue != null ? "{...}" : "null") + ',' + (applet != null ? "{...}" : "null") + ',' + expiryLengthComplement + ')');
            }
        } catch (RuntimeException | Error uncheckedCookieUpdateFailure) {
            throw uncheckedCookieUpdateFailure;
        } catch (Throwable checkedCookieUpdateFailure) {
            throw new RuntimeException(checkedCookieUpdateFailure);
        }
    }

    final static Sprite[] createSolidCenterSlices(int color, byte methodGuard) {
        if (methodGuard != -112) {
            completedClientFlowToken = (ClientFlowToken) null;
        }
        Sprite[] allocatedSlices = new Sprite[9];
        Sprite[] slicesResultAlias = allocatedSlices;
        allocatedSlices[4] = SecondaryNodeDequeIterator.createPartiallyFilledSquareSprite(0, color, 64);
        return slicesResultAlias;
    }

    final static void groupQueuedMeshFacesByPriority(int faceIndexScratch, byte[] facePriorities, int remainingFacesScratch, int[] priorityWriteOffsets, byte guard) {
        int remainingBeforeDecrement = 0;
        int sourceIndexBeforeIncrement = 0;
        byte facePriority = 0;
        int destinationIndexBeforeIncrement = 0;
        RuntimeException groupingFailureBeforeContext = null;
        StringBuilder groupingMessagePrefix = null;
        String prioritiesDescription = null;
        StringBuilder messageBeforeOffsets = null;
        String offsetsDescription = null;
        RuntimeException caughtGroupingFailure = null;
        int depthBucketIndex = 0;
        RuntimeException groupingFailure = null;
        int depthBucketReadIndex = 0;
        int controlFlagSnapshot = 0;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          depthBucketIndex = 0;
          depthBucketTraversal: while (true) {
            if (depthBucketIndex >= GameApplet.meshFaceCountsByDepthBucket.length) {
              if (guard != -85) {
                MeshPrioritySupport.createSolidCenterSlices(80, (byte) 55);
              }
              return;
            }
            remainingFacesScratch = GameApplet.meshFaceCountsByDepthBucket[depthBucketIndex];
            depthBucketReadIndex = depthBucketIndex << 4;
            while (true) {
              remainingBeforeDecrement = remainingFacesScratch;
              remainingFacesScratch--;
              if (0 == remainingBeforeDecrement) {
                depthBucketIndex++;
                continue depthBucketTraversal;
              }
              sourceIndexBeforeIncrement = depthBucketReadIndex;
              depthBucketReadIndex++;
              faceIndexScratch = InstrumentNoteMask.meshFaceOrder[sourceIndexBeforeIncrement];
              facePriority = facePriorities[faceIndexScratch];
              destinationIndexBeforeIncrement = priorityWriteOffsets[facePriority];
              priorityWriteOffsets[facePriority] = destinationIndexBeforeIncrement + 1;
              InstrumentNoteMask.meshFaceOrder[destinationIndexBeforeIncrement] = faceIndexScratch;
              continue;
            }
          }
        } catch (java.lang.RuntimeException caughtGroupingParameter) {
          caughtGroupingFailure = caughtGroupingParameter;
          groupingFailure = caughtGroupingFailure;
          groupingFailureBeforeContext = groupingFailure;
          groupingMessagePrefix = new StringBuilder().append("va.B(").append(faceIndexScratch).append(',');
          if (facePriorities == null) {
            prioritiesDescription = "null";
          } else {
            prioritiesDescription = "{...}";
          }
          messageBeforeOffsets = ((StringBuilder) (Object) groupingMessagePrefix).append(prioritiesDescription).append(',').append(remainingFacesScratch).append(',');
          if (priorityWriteOffsets == null) {
            offsetsDescription = "null";
          } else {
            offsetsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) groupingFailureBeforeContext), ((StringBuilder) (Object) messageBeforeOffsets).append(offsetsDescription).append(',').append(guard).append(')').toString());
        }
    }

    static {
        messageDialogUiFlowActive = false;
        textTemplateArgumentTypeFourteen = new TextTemplateArgumentType(14, 0, 4, 1);
        completedClientFlowToken = new ClientFlowToken();
    }
}
