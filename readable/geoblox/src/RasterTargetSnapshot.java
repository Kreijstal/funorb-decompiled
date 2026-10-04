/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterTargetSnapshot extends IntrusiveNode {
    static String previousText;
    int framebufferHeight;
    static long[] updateTimeHistoryMillis;
    static Sprite[] introFaceFrames;
    static String[] field_f;
    int[] pixels;
    int clipBottom;
    static int pendingActionPanelHeight;
    int clipLeft;
    static GameplayEntity[] entitiesById;
    int clipTop;
    int clipRight;
    int stride;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param1 != -91) {
                return;
              }
              try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(SessionGameApplet.applySessionOverridesToUrl(var2, 68, param0), "_top");
                return;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_8_0 = var2_ref2;
              stackIn_8_1 = new StringBuilder().append("tl.A(");
              if (param0 == null) {
                stackIn_9_2 = "null";
              } else {
                stackIn_9_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 == 6491) {
            previousText = null;
            entitiesById = null;
            updateTimeHistoryMillis = null;
            field_f = null;
            introFaceFrames = null;
            return;
        }
        RasterTargetSnapshot.b(-67);
        previousText = null;
        entitiesById = null;
        updateTimeHistoryMillis = null;
        field_f = null;
        introFaceFrames = null;
    }

    RasterTargetSnapshot() {
    }

    final void capture(int clipLeft, int clipRight, int clipBottom, int stride, int framebufferHeight, int clipTop, int[] pixels, boolean methodGuard) {
        try {
            this.clipTop = clipTop;
            this.clipLeft = clipLeft;
            this.pixels = pixels;
            this.clipBottom = clipBottom;
            this.clipRight = clipRight;
            if (!methodGuard) {
                RasterTargetSnapshot.b(-125);
            }
            this.framebufferHeight = framebufferHeight;
            this.stride = stride;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "tl.C(" + clipLeft + ',' + clipRight + ',' + clipBottom + ',' + stride + ',' + framebufferHeight + ',' + clipTop + ',' + (pixels != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    static {
        previousText = "Prev";
        updateTimeHistoryMillis = new long[32];
        entitiesById = new GameplayEntity[1000];
    }
}
