/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlAssemblyProgram {
    static String[] levelLoadStepLabels;
    int programId;
    private LegacyOpenGlGraphicsToolkit toolkit;
    static String field_d;
    static boolean field_e;

    protected final void finalize() throws Throwable {
        this.toolkit.queueAssemblyProgramDeletion(this.programId, (byte) 113);
        super.finalize();
    }

    final static void sortHiscoreRows(int minimum, int maximum, byte guard, int end, int limit, int start, boolean primaryStatisticFirst) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (limit <= start) {
            return;
          }
          if (end <= 1 + start) {
            return;
          }
          if (end > start + 5 &&
            minimum != maximum) {
            var7_int = (minimum & maximum & 1) + (minimum >> 1) + (maximum >> 1);
            var8 = start;
            var9 = maximum;
            var10 = minimum;
            for (var11 = start; end > var11; var11++) {
              var12 = FourIntReadRequest.field_q[var11];
              if (!primaryStatisticFirst) {
                stackIn_23_0 = IntroductionOverlaySupport.field_c[var12];
              } else {
                stackIn_23_0 = LoginFieldValue.field_a[var12];
              }
              var13 = stackIn_23_0;
              if (var13 <= var7_int) {
                if (var13 > var10) {
                  var10 = var13;
                }
              } else {
                FourIntReadRequest.field_q[var11] = FourIntReadRequest.field_q[var8];
                if (var13 < var9) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                FourIntReadRequest.field_q[incrementValue$0] = var12;
              }
            }
            LegacyOpenGlAssemblyProgram.sortHiscoreRows(var9, maximum, guard, var8, limit, start, primaryStatisticFirst);
            LegacyOpenGlAssemblyProgram.sortHiscoreRows(minimum, var10, (byte) -107, end, limit, var8, primaryStatisticFirst);
            return;
          }
          for (var7_intLifetime1 = -1 + end; var7_intLifetime1 > start; var7_intLifetime1--) {
            for (var8Lifetime1 = start; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = FourIntReadRequest.field_q[var8Lifetime1];
              var10Lifetime1 = FourIntReadRequest.field_q[1 + var8Lifetime1];
              if (HardwareQuadBatchBuffers.hiscoreRowSortsBefore(var10Lifetime1, var9Lifetime1, primaryStatisticFirst, (byte) 98)) {
                FourIntReadRequest.field_q[var8Lifetime1] = var10Lifetime1;
                FourIntReadRequest.field_q[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var7), "vk.C(" + minimum + ',' + maximum + ',' + guard + ',' + end + ',' + limit + ',' + start + ',' + primaryStatisticFirst + ')');
        }
    }

    final static void resetReflectionChecks(int guard) {
        if (guard > -31) {
          LegacyOpenGlAssemblyProgram.resetReflectionChecks(-31);
        }
        AccountConnectionPhase.reflectionChecks = new IntrusiveDeque();
    }

    public static void releaseStatics(int guard) {
        levelLoadStepLabels = null;
        if (guard != 429166529) {
          LegacyOpenGlAssemblyProgram.sortHiscoreRows(100, 10, (byte) 96, 17, -1, -25, true);
        }
        field_d = null;
    }

    LegacyOpenGlAssemblyProgram(LegacyOpenGlGraphicsToolkit owner, int target, int id) {
        try {
          this.programId = id;
          this.toolkit = owner;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "vk.<init>(" + (owner != null ? "{...}" : "null") + ',' + target + ',' + id + ')');
        }
    }

    static {
        levelLoadStepLabels = new String[]{"Placing enemies...", "Placing terrain..."};
        field_d = null;
    }
}
