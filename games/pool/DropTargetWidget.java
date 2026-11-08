/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidget extends SingleChildWidget {
    static BallDebugOverlay[] field_O;
    static int[][] field_N;

    static long bitwiseOr(long param0, long param1) {
        return param0 | param1;
    }

    final void handlePointerRelease(int param0, int param1, int param2, int param3, byte param4, UiWidget param5) {
        DraggableWidget var7 = null;
        super.handlePointerRelease(param0, param1, param2, param3, (byte) 67, param5);
        if (param4 < 62) {
          return;
        }
        try {
          var7 = PasswordValidator.field_u;
          if (var7 != null) {
            if (!this.containsPointer(param0, param2, param1, -1, param3)) {
              return;
            }
            if (this.listener instanceof DropListener) {
              ((DropListener) (this.listener)).onDrop(-110, this, var7);
              PasswordValidator.field_u = null;
              return;
            }
            if (!(var7.listener instanceof DropListener)) {
              return;
            }
            ((DropListener) (var7.listener)).onDrop(-74, this, var7);
            PasswordValidator.field_u = null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "k.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, long param2) {
        CipherPacketBuffer var4 = JaggrabDownloader.field_j;
        var4.writeCipheredOpcode(false, param0);
        var4.position = var4.position + 1;
        int var6 = 84 / ((-74 - param1) / 37);
        int var5 = var4.position;
        var4.writeByte(6, false);
        var4.writeLong(param2, (byte) -126);
        var4.writeByteLengthPrefix(var4.position - var5, true);
    }

    final static void g(byte param0) {
        if (param0 != 96) {
          field_O = (BallDebugOverlay[]) null;
          if (!LookupQuery.isClientNoticeOpen(1)) {
            return;
          }
          CacheEntry.a(false, 4, 4);
          return;
        }
        if (!LookupQuery.isClientNoticeOpen(1)) {
          return;
        }
        CacheEntry.a(false, 4, 4);
    }

    final static String a(long param0, int param1, boolean param2, int param3) {
        if (param2) {
          return ResourceArchive.formatFixedPoint(param0, param3, false, -109, param1, 10);
        }
        DropTargetWidget.releaseStatics(83);
        return ResourceArchive.formatFixedPoint(param0, param3, false, -109, param1, 10);
    }

    private DropTargetWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.child = param6;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "k.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int[] param0, byte param1, int[] param2) {
        try {
          PlayingSound.sortParallelArrays(param2.length, (byte) -104, param2, param0, 0);
          if (param1 != -121) {
            field_O = (BallDebugOverlay[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "k.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_O = null;
        field_N = (int[][]) null;
        if (param0 != 120) {
          field_N = (int[][]) null;
        }
    }

    final static boolean a(ResourceArchive param0, ResourceArchive param1, ResourceArchive param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.isIndexReady(85)) {
            return false;
          }
          if (!param0.ensureGroupAvailableByName("commonui", 0)) {
            return false;
          }
          if (param1.isIndexReady(71) &&
            param1.ensureGroupAvailableByName("commonui", 0)) {
            if (param2.isIndexReady(122) &&
              param2.ensureGroupAvailableByName("button.gif", 0)) {
              if (param3) {
                return true;
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("k.H(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_N = new int[120][2];
    }
}
