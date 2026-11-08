/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientInputResetSupport {
    static int[] field_d;
    static int field_a;
    static String mpYouresigned;
    static int field_e;
    static int field_b;

    final static void resetClientInput(byte param0) {
        AccountStateQuery.leaveFullscreen((byte) -128);
        if (TimeTrialSelectScreen.field_K != null) {
          CanvasInputSupport.detachInputListeners(TimeTrialSelectScreen.field_K, 0);
        }
        LimitedRandomAccessFile.a(-22444);
        int var1 = 8 / ((param0 + 12) / 55);
        DebugOverlayLayoutSupport.detachMouseHandler(0);
        TextWidgetPainter.closeNetworkAndCacheResources((byte) 70);
        if (!TriangleMesh.hasActiveLoginResponse((byte) 84)) {
          ShotEvent.closeClientSocket(-111);
          return;
        }
        JaggrabDownloader.field_j.writeCipheredOpcode(false, 1);
        DebugTuningSupport.flushClientPackets(0, 0);
        ShotEvent.closeClientSocket(-111);
    }

    final static void drawProjectedCross(int param0, int param1, int[] param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        param0 = param0 - param2[0];
        param1 = param1 - param2[1];
        param5 = param5 - param2[2];
        if (param4 != 10521) {
          int[] var9 = (int[]) null;
          ClientInputResetSupport.drawProjectedCross(-11, -8, (int[]) null, -102, -112, 112);
        }
        int var6_int = param2[11] * param5 + param2[10] * param1 + param0 * param2[9] >> 16;
        if (var6_int <= 0) {
          return;
        }
        try {
          var7 = param2[5] * param5 + param2[3] * param0 + param1 * param2[4] >> 7;
          var8 = param2[6] * param0 + (param1 * param2[7] + param2[8] * param5) >> 7;
          var7 = TriangleRasterizer.projectionCenterX + var7 / var6_int;
          var8 = TriangleRasterizer.projectionCenterY + var8 / var6_int;
          SoftwareRasterizer.drawLine(-4 + var7, var8, 4 + var7, var8, param3);
          SoftwareRasterizer.drawLine(var7, var8 - 4, var7, var8 + 4, param3);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cd.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int param0) {
        mpYouresigned = null;
        field_d = null;
        if (param0 <= 35) {
          mpYouresigned = (String) null;
        }
    }

    static {
        mpYouresigned = "You have resigned.";
        field_a = 22;
        field_b = 0;
    }
}
