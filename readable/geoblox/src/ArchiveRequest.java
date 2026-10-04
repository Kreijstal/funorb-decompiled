/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    static IntrusiveDeque pendingActionMarkers;
    volatile boolean pending;
    boolean priority;
    static String createAgeTooltipText;
    static int uiFontArchiveId;
    static long[] field_p;
    static String fullscreenAcceptButtonText;
    boolean seenByCleanup;
    static int[] sessionPacketLengthByOpcode;
    static float loadingScaledProgress;

    final static void a(int param0, java.awt.Color param1, boolean param2, boolean param3, String param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          try {
            var9 = MessageDialog.gameCanvas.getGraphics();
            if (null == UiFontResources.awtLoadingFont) {
              UiFontResources.awtLoadingFont = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param2) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, AudioService.canvasWidth, ClientRenderingState.canvasHeight);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == TextWidgetRenderer.field_a) {
                TextWidgetRenderer.field_a = MessageDialog.gameCanvas.createImage(304, 34);
              }
              var10 = TextWidgetRenderer.field_a.getGraphics();
              var10.setColor(param1);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param0, 30);
              var10.setColor(java.awt.Color.black);
              if (param3) {
                return;
              }
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(3 * param0 + 2, 2, 300 - 3 * param0, 30);
              var10.setFont(UiFontResources.awtLoadingFont);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param4, (-(6 * param4.length()) + 304) / 2, 22);
              var9.drawImage(TextWidgetRenderer.field_a, AudioService.canvasWidth / 2 - 152, ClientRenderingState.canvasHeight / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = AudioService.canvasWidth / 2 - 152;
              var8 = ClientRenderingState.canvasHeight / 2 - 18;
              var9.setColor(param1);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(var7 + 2, 2 + var8, 3 * param0, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(1 + var7, 1 + var8, 301, 31);
              var9.fillRect(param0 * 3 + (2 + var7), 2 + var8, -(param0 * 3) + 300, 30);
              var9.setFont(UiFontResources.awtLoadingFont);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param4, (-(6 * param4.length()) + 304) / 2 + var7, 22 + var8);
            }
            if (SpriteState.field_q == null) {
              return;
            }
            var9.setFont(UiFontResources.awtLoadingFont);
            var9.setColor(java.awt.Color.white);
            var9.drawString(SpriteState.field_q, AudioService.canvasWidth / 2 - 6 * SpriteState.field_q.length() / 2, -26 + ClientRenderingState.canvasHeight / 2);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            MessageDialog.gameCanvas.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("pb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    abstract byte[] getBytes(int methodGuard);

    public static void f(int param0) {
        createAgeTooltipText = null;
        pendingActionMarkers = null;
        field_p = null;
        sessionPacketLengthByOpcode = null;
        fullscreenAcceptButtonText = null;
        if (param0 != 31735) {
            String var2 = (String) null;
            ArchiveRequest.a(68, (java.awt.Color) null, true, true, (String) null);
        }
    }

    abstract int getProgress(int methodGuard);

    ArchiveRequest() {
        this.pending = true;
    }

    static {
        pendingActionMarkers = new IntrusiveDeque();
        createAgeTooltipText = "Type your age in years";
        sessionPacketLengthByOpcode = new int[256];
        fullscreenAcceptButtonText = "Accept";
        field_p = new long[32];
    }
}
