/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LoginCredentials {
    static String field_g;
    static int[] worldDirectionY;
    static String field_j;
    static String[][] field_i;
    static ScreenshotViewer field_c;
    static long field_b;
    static String field_a;
    static int[] field_h;
    static NodeDeque diagnosticLines;
    static String field_e;

    abstract void writeCredentials(int obfuscationGuard, PacketBuffer packet);

    final static GameCanvas createFullscreenCanvas(int refreshRate, int bitDepth, int width, int height, boolean obfuscationGuard, PlatformServices platform) {
        java.awt.Frame frameAlias = null;
        RuntimeException failure = null;
        GameCanvas canvas = null;
        java.awt.Frame frame = null;
        Object unavailableResult = null;
        GameCanvas canvasResult = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String platformSummary = null;
        RuntimeException caughtFailure = null;
        try {
          frame = WidgetTheme.openFullscreenFrame(refreshRate, platform, height, 119, bitDepth, width);
          frameAlias = frame;
          if (frame == null) {
            unavailableResult = null;
            return (GameCanvas) (unavailableResult);
          }
          canvas = new GameCanvas();
          canvas.window = frame;
          canvas.window.add((java.awt.Component) ((Object) canvas));
          canvas.setBounds(0, 0, width, height);
          canvas.addFocusListener(canvas);
          if (!obfuscationGuard) {
            LoginCredentials.a((byte) 7, -111);
          }
          canvas.requestFocus();
          canvasResult = canvas;
          return canvasResult;
        } catch (java.lang.RuntimeException caughtException) {
          caughtFailure = caughtException;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ff.H(").append(refreshRate).append(',').append(bitDepth).append(',').append(width).append(',').append(height).append(',').append(obfuscationGuard).append(',');
          if (platform == null) {
            platformSummary = "null";
          } else {
            platformSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(platformSummary).append(')').toString());
        }
    }

    abstract LoginCredentialKind getCredentialKind(int obfuscationGuard);

    public static void a(byte param0) {
        field_h = null;
        field_i = (String[][]) null;
        diagnosticLines = null;
        field_c = null;
        worldDirectionY = null;
        field_a = null;
        field_g = null;
        field_e = null;
        int var1 = -5 % ((param0 - 66) / 48);
        field_j = null;
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        TableRowSubmission var4 = null;
        TableDataRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var4 = (TableRowSubmission) (tm.pendingTableSubmissions.first(-84));
          while (var4 != null) {
            AppletGameShell.sendTableRow(param1, var4, 14989);
            var4 = (TableRowSubmission) (tm.pendingTableSubmissions.next((byte) 116));
          }
          if (param0 > -34) {
            return;
          }
          var5 = (TableDataRequest) (GameplayAudioEvent.pendingTableRequests.first(-71));
          while (var5 != null) {
            uo.sendTableRequest(var5, param1, (byte) 68);
            var5 = (TableDataRequest) (GameplayAudioEvent.pendingTableRequests.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "ff.G(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        worldDirectionY = new int[8192];
        field_h = new int[]{13, 12};
        field_e = "Invite more players, or alternatively try changing the following settings:  ";
        field_g = "Cancel rematch";
    }
}
