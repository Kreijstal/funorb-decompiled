/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AimTarget {
    int distance;
    int field_k;
    static String createPasswordHint;
    static DualLinkNodeHashTable field_b;
    static UiComponent field_f;
    static String mpCancelrematch;
    static String[] field_a;
    private int field_g;
    static int field_e;
    boolean targetIsBall;
    boolean field_j;
    int field_d;
    static Sprite field_i;

    final boolean a(byte param0, int param1, PoolGameModel param2) {
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != -8) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.targetIsBall && (!param2.balls[this.field_g].inPlay ||
            param1 == this.field_g)) {
            stackIn_9_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_9_0 = true;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("df.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static String getLoadingStatusMessage(byte param0) {
        if (QuickChatCategoryDefinition.field_y < 2) {
          return ByteRecordSubmission.field_q;
        }
        if (null != QuickChatPhraseRegistry.field_a) {
          if (!QuickChatPhraseRegistry.field_a.isIndexReady(84)) {
            return BufferedFile.field_b;
          }
          return SingleChildWidget.field_F;
        }
        if (!WorldPointProjectionSupport.field_d.isIndexReady(101)) {
          return NineSliceFrameSupport.waitingforGraphics;
        }
        if (!WorldPointProjectionSupport.field_d.ensureGroupAvailableByName("commonui", 0)) {
          return HighScoreSubmission.loadingGraphics + " - " + WorldPointProjectionSupport.field_d.getGroupProgressByName(100, "commonui") + "%";
        }
        if (!PolarTableScene.field_nb.isIndexReady(-127)) {
          return SpaceTableScene.waitingforFonts;
        }
        if (param0 != 84) {
          return (String) null;
        }
        if (!PolarTableScene.field_nb.ensureGroupAvailableByName("commonui", 0)) {
          return TickClock.loadingFonts + " - " + PolarTableScene.field_nb.getGroupProgressByName(100, "commonui") + "%";
        }
        if (!DualLinkNode.field_r.isIndexReady(66)) {
          return DebugTuningSupport.waitingforExtradata;
        }
        if (!DualLinkNode.field_r.ensureAllGroupsAvailable(-63)) {
          return SoundCache.loadingExtradata + " - " + DualLinkNode.field_r.getOverallProgress(0) + "%";
        }
        return ProjectedLineSupport.pleasewaitDotdotdot;
    }

    final void computeDistance(int param0, Ball param1, PoolGameModel param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var4_long = 0L;
        RuntimeException var4 = null;
        long var6 = 0L;
        int[] var8_ref_int__ = null;
        long var8 = 0L;
        int[] var10 = null;
        Ball var11 = null;
        try {
          if (this.targetIsBall) {
            var11 = param2.balls[this.field_g];
            var4_long = (long)param1.positionX - (long)var11.positionX;
            var6 = -(long)var11.positionY + (long)param1.positionY;
            var4_long = var4_long >> 8;
            var6 = var6 >> 8;
          } else {
            var10 = param2.field_e[this.field_g];
            var8_ref_int__ = var10;
            var4_long = -(long)var10[0] + (long)param1.positionX;
            var4_long = var4_long >> 8;
            var6 = (long)param1.positionY - (long)var10[1];
            var6 = var6 >> 8;
          }
          var8 = IterableNodeHashTable.a(-119, var4_long * var4_long + var6 * var6);
          if (-2147483648L <= var8 &&
            var8 <= 2147483647L) {
            if (param0 != 1763073386) {
              field_e = 62;
            }
            this.distance = (int)var8;
            return;
          }
          throw new IllegalStateException("dist too big when checking for visibility.");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("df.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 >= 82) {
          field_a = null;
          createPasswordHint = null;
          field_i = null;
          field_f = null;
          mpCancelrematch = null;
          return;
        }
        AimTarget.getLoadingStatusMessage((byte) -85);
        field_a = null;
        createPasswordHint = null;
        field_i = null;
        field_f = null;
        mpCancelrematch = null;
    }

    final void a(int param0, boolean param1, boolean param2) {
        this.targetIsBall = param1 ? true : false;
        if (param2) {
          this.field_g = param0;
          return;
        }
        this.field_g = -112;
        this.field_g = param0;
    }

    final int a(PoolGameModel param0, Ball param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        Ball var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -6661) {
            field_i = (Sprite) null;
          }
          if (this.targetIsBall) {
            var6 = param0.balls[this.field_g];
            stackIn_4_0 = 8191 & ResizableDialog.c(var6.positionX - param1.positionX >> 10, var6.positionY - param1.positionY >> 10, 4096);
            return stackIn_4_0;
          }
          var5 = param0.field_e[this.field_g];
          var4 = var5;
          stackIn_6_0 = 8191 & ResizableDialog.c(var5[0] - param1.positionX >> 10, -param1.positionY + var5[1] >> 10, 4096);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("df.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 != 1048576) {
          return -61;
        }
        return ShotEvent.a(ArchiveProvider.divideFixed16(this.distance, (byte) -112, this.targetIsBall ? 1048576L : 524288L), false);
    }

    static {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        createPasswordHint = "Passwords must be between 5 and 20 letters and numbers";
        mpCancelrematch = "Cancel rematch";
    }
}
