/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgressDialog extends ResizableModalPanel {
    private String footerText;
    private String statusText;
    private boolean alternateStyle;
    private boolean normalAnimationStopped;
    private StripedProgressBar progressBar;

    ProgressDialog(ModalStack param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.footerText = param1;
          if (this.footerText != null) {
            var3_int = GetBoostersCooldown.field_r.getParagraphHeight(this.footerText, 260, GetBoostersCooldown.field_r.maxAscent);
            this.setCenteredSize(300, -1860440319, 150 + var3_int);
          }
          this.progressBar = new StripedProgressBar(13, 50, 274, 30, 15, 2113632, 4210752);
          this.progressBar.animateStripes = true;
          this.normalAnimationStopped = false;
          this.alternateStyle = false;
          this.addChild(-18756, this.progressBar);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "goa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawFrame(int param0, int param1, int param2) {
        super.drawFrame(param0, param1, param2);
        GetBoostersCooldown.field_r.drawCentered(this.statusText, (this.width >> 1) + param2, 103 + param0, 16777215, -1);
        if (null != this.footerText) {
          SoftwareRasterizer2D.drawHorizontalLine(param2 + 20, 113 + param0, 260, 8421504);
          GetBoostersCooldown.field_r.drawParagraph(this.footerText, 20 + param2, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, GetBoostersCooldown.field_r.maxAscent);
        }
    }

    final void stopProgressAnimation(int param0) {
        if (param0 == 25880) {
          this.progressBar.animateStripes = false;
          this.normalAnimationStopped = true;
          return;
        }
        String var3 = (String) null;
        this.updateProgress(false, (String) null, -1.248936414718628f, (byte) -121);
        this.progressBar.animateStripes = false;
        this.normalAnimationStopped = true;
    }

    final void updateProgress(boolean param0, String param1, float param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (this.alternateStyle) ? 0 : 1;
          if (stackIn_3_0 == (param0 ? 1 : 0)) {
            stackIn_8_1 = (param0);
            this.alternateStyle = stackIn_8_1;
            if (!this.alternateStyle) {
              this.progressBar.setColors(2113632, -21202, 4210752);
              if (this.normalAnimationStopped) {
                this.progressBar.animateStripes = false;
              }
            } else {
              this.progressBar.setColors(8405024, -21202, 4210752);
              this.progressBar.animateStripes = true;
            }
          }
          this.statusText = param1;
          this.progressBar.progress16 = (int)(param2 / 100.0f * 65536.0f);
          if (param3 == -89) {
            return;
          }
          this.statusText = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("goa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
