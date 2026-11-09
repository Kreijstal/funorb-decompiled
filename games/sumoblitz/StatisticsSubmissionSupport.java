/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatisticsSubmissionSupport {
    static String classicText;
    static boolean field_a;

    final static int findSubmittedHiscore(HiscoreRequest request, int guard, SessionStatisticsSubmission submission, int list) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (request != null &&
            request.values != null &&
            submission != null &&
            request.tableId == submission.tableId) {
            if (guard != -1) {
              field_a = true;
            }
            var4_int = submission.values.length;
            var5 = request.values[list].length / var4_int;
            for (var6 = 0; var5 > var6; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (request.entryIds[list][var6] == submission.entryId &&
                AccountUiBootstrap.isCurrentUserName(request.names[list][var6], (byte) -25)) {
                for (var7 = 0; var4_int > var7; var7++) {
                  if (submission.values[var7] != request.values[list][var6 * var4_int + var7]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_19_0 = var6;
                  return stackIn_19_0;
                }
              }
            }
            stackIn_22_0 = -1;
            return stackIn_22_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("kp.C(");
          if (request == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(guard).append(',');
          if (submission == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(list).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == -1) {
          classicText = null;
          return;
        }
        SessionStatisticsSubmission var2 = (SessionStatisticsSubmission) null;
        StatisticsSubmissionSupport.findSubmittedHiscore((HiscoreRequest) null, -64, (SessionStatisticsSubmission) null, -29);
        classicText = null;
    }

    final static void submitStatistics(int opcode, SessionStatisticsSubmission submission, int guard) {
        try {
          if (guard <= 60) {
            SessionStatisticsSubmission var4 = (SessionStatisticsSubmission) null;
            StatisticsSubmissionSupport.findSubmittedHiscore((HiscoreRequest) null, 14, (SessionStatisticsSubmission) null, -12);
          }
          HuffmanDecoder.field_f.addLast((IntrusiveNode) (submission), (byte) 39);
          FourStatHiscoreRequest.sendSessionStatistics((byte) 69, opcode, submission);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kp.A(" + opcode + ',' + (submission != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    static {
        classicText = "Classic";
        field_a = false;
    }
}
