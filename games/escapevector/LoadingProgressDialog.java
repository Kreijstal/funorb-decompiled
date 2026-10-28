/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadingProgressDialog extends ResizableModalPanel {
    private String description;
    private boolean field_eb;
    static String field_fb;
    private String statusText;
    private boolean field_gb;
    private StripedProgressBar progressBar;
    static ResourceArchive field_ab;
    static int[] field_bb;
    static PcmSample field_hb;

    final void setStopAnimatingWhenNormal(boolean stop) {
        this.field_gb = stop ? true : false;
        this.progressBar.animateStripes = false;
    }

    final static ObjectSpriteSet[] objectSpriteSets(boolean guard) {
        if (guard) {
          return (ObjectSpriteSet[]) null;
        }
        return AccountRegistrationPanel.field_M;
    }

    final void setProgress(int guard, String status, float percent, boolean alternateColors) {
        try {
          int var5_int = 46 / ((guard + 43) / 54);
          if ((!alternateColors ? 1 : 0) == (this.field_eb ? 1 : 0)) {
            this.field_eb = alternateColors ? true : false;
            if (this.field_eb) {
              this.progressBar.setColors(4210752, 8405024, -127);
              this.progressBar.animateStripes = true;
            } else {
              this.progressBar.setColors(4210752, 2113632, -127);
              if (this.field_gb) {
                this.progressBar.animateStripes = false;
              }
            }
          }
          this.statusText = status;
          this.progressBar.progressQ16 = (int)(percent / 100.0f * 65536.0f);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "w.I(" + guard + ',' + (status != null ? "{...}" : "null") + ',' + percent + ',' + alternateColors + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_fb = null;
        field_hb = null;
        if (guard == 300) {
          field_ab = null;
          field_bb = null;
          return;
        }
        field_hb = (PcmSample) null;
        field_ab = null;
        field_bb = null;
    }

    LoadingProgressDialog(ModalStack param0, String param1) {
        super(param0, 300, 120);
        try {
          this.description = param1;
          if (null != this.description) {
            int var3_int = dl.field_b.paragraphHeight(this.description, 260, dl.field_b.maxAscent);
            this.resizeAndCenter(255, 150 + var3_int, 300);
          }
          this.progressBar = new StripedProgressBar(13, 50, 274, 30, 15, 2113632, 4210752);
          this.progressBar.animateStripes = true;
          this.field_eb = false;
          this.field_gb = false;
          this.addChild(this.progressBar, false);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawPanelBackground(int screenY, int screenX, byte guard) {
        super.drawPanelBackground(screenY, screenX, (byte) 109);
        dl.field_b.drawCentered(this.statusText, screenX + (this.width >> 1), 103 + screenY, 16777215, -1);
        if (guard < 80) {
          this.field_eb = true;
          if (this.description != null) {
            SoftwareRasterizer.drawHorizontalLine(screenX + 20, -7 + (120 + screenY), 260, 8421504);
            dl.field_b.drawParagraph(this.description, 20 + screenX, 8 + (screenY + 120), 260, 100, 16777215, -1, 1, 0, dl.field_b.maxAscent);
            return;
          }
          return;
        }
        if (this.description == null) {
          return;
        }
        SoftwareRasterizer.drawHorizontalLine(screenX + 20, -7 + (120 + screenY), 260, 8421504);
        dl.field_b.drawParagraph(this.description, 20 + screenX, 8 + (screenY + 120), 260, 100, 16777215, -1, 1, 0, dl.field_b.maxAscent);
    }

    static {
        field_fb = "Unfortunately we are unable to create an account for you at this time.";
        field_bb = new int[]{20, 28};
    }
}
