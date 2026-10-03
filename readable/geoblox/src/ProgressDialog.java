/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgressDialog extends ResizableDialog {
    private String introductoryText;
    static LoginMethod field_W;
    private boolean normalAnimationStopped;
    private boolean redHighlightActive;
    private ProgressBarWidget progressBar;
    private String statusText;

    ProgressDialog(DialogLayer dialogLayer, String introductoryText) {
        super(dialogLayer, 300, 120);
        int var3_int = 0;
        try {
            this.introductoryText = introductoryText;
            if (this.introductoryText != null) {
                var3_int = hh.field_c.measureWrappedHeight(this.introductoryText, 260, hh.field_c.maxAscent);
                this.resizeAndCenter(var3_int + 150, 103, 300);
            }
            this.progressBar = new ProgressBarWidget(13, 50, 274, 30, 15, 2113632, 4210752);
            this.normalAnimationStopped = false;
            this.progressBar.animationEnabled = true;
            this.redHighlightActive = false;
            this.addChild((byte) -98, this.progressBar);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "rl.<init>(" + (dialogLayer != null ? "{...}" : "null") + ',' + (introductoryText != null ? "{...}" : "null") + ')');
        }
    }

    final static DelayedPcmStream a(int param0, PcmStream param1, int param2) {
        RuntimeException var3 = null;
        DelayedPcmStream stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1000) {
            ProgressDialog.n(-33);
          }
          stackIn_3_0 = new DelayedPcmStream(param1, param0 * AudioOutput.sampleRateHz / 1000);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean n(int param0) {
        if (param0 != -1071908447) {
            return false;
        }
        return IntrusiveDeque.field_d == WidgetSkinState.field_g ? true : false;
    }

    final void stopNormalAnimation(int methodGuard) {
        this.progressBar.animationEnabled = false;
        this.normalAnimationStopped = true;
        if (methodGuard != 23181) {
            PcmStream var3 = (PcmStream) null;
            ProgressDialog.a(9, (PcmStream) null, 122);
        }
    }

    final static void writeByteShortQuery(int packetOpcode, int methodGuard, ByteShortQuery query) {
        PacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = CacheReference.field_q;
          var3.writeCipherByte(packetOpcode, (byte) -85);
          var3.writeByte((byte) 123, query.queryByte);
          var3.writeShortBE(query.queryShort, methodGuard + 28161);
          if (methodGuard == 534) {
            return;
          }
          field_W = (LoginMethod) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("rl.G(").append(packetOpcode).append(',').append(methodGuard).append(',');
          if (query == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void h(byte param0) {
        if (param0 != 57) {
            field_W = (LoginMethod) null;
            field_W = null;
            return;
        }
        field_W = null;
    }

    final void updateProgress(boolean redHighlight, String statusText, int methodGuard, float percentage) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -51 / ((methodGuard - 86) / 32);
          stackIn_2_0 = redHighlight;
          if (this.redHighlightActive) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) != stackIn_3_1) {
            this.statusText = statusText;
            this.progressBar.fillFractionQ16 = (int)(65536.0f * (percentage / 100.0f));
            return;
          }
          if (!redHighlight) {
            stackIn_8_1 = false;
          } else {
            stackIn_8_1 = true;
          }
          ((ProgressDialog) (this)).redHighlightActive = stackIn_8_1;
          if (!this.redHighlightActive) {
            this.progressBar.setStripeColors(4210752, 2113632, (byte) -103);
            if (this.normalAnimationStopped) {
              this.progressBar.animationEnabled = false;
            }
          } else {
            this.progressBar.setStripeColors(4210752, 8405024, (byte) -103);
            this.progressBar.animationEnabled = true;
          }
          this.statusText = statusText;
          this.progressBar.fillFractionQ16 = (int)(65536.0f * (percentage / 100.0f));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rl.C(").append(redHighlight).append(',');
          if (statusText == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(methodGuard).append(',').append(percentage).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        hh.field_c.drawCenteredText(this.statusText, (this.widgetWidth >> 1) + param0, param2 + 103, 16777215, -1);
        if (this.introductoryText != null) {
            SoftwareRasterizer.drawHorizontalLine(20 + param0, -7 + param2 + 120, 260, 8421504);
            hh.field_c.drawParagraph(this.introductoryText, param0 + 20, 8 + (120 + param2), 260, 100, 16777215, -1, 1, 0, hh.field_c.maxAscent);
        }
    }

    static {
        field_W = new LoginMethod("usename");
    }
}
