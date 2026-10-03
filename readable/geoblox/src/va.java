/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static int field_b;
    static TextTemplateArgumentType field_f;
    static boolean field_d;
    static al field_e;
    static int field_a;
    static IntrusiveDeque field_c;

    public static void a(int param0) {
        field_f = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                ScorePopup.field_j = param0;
                try {
                    var3 = param1.getParameter("cookieprefix");
                    var4 = param1.getParameter("cookiehost");
                    var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                    if (!(~param0.length() != param2)) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    wk.a(param1, "document.cookie=\"" + var5 + "\"", (byte) -92);
                } catch (Throwable throwable) {
                }
                ByteStorage.a(param1, 20000000);
            } catch (RuntimeException runtimeException) {
                throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "va.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static Sprite[] a(int param0, byte param1) {
        if (param1 != -112) {
            field_e = (al) null;
        }
        Sprite[] var3 = new Sprite[9];
        Sprite[] var2 = var3;
        var3[4] = SecondaryNodeDequeIterator.a(0, param0, 64);
        return var2;
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
          L0: while (true) {
            if (depthBucketIndex >= GameApplet.meshFaceCountsByDepthBucket.length) {
              if (guard != -85) {
                va.a(80, (byte) 55);
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
                continue L0;
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
        field_d = false;
        field_f = new TextTemplateArgumentType(14, 0, 4, 1);
        field_e = new al();
    }
}
