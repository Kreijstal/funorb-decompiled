/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgressDialog extends ResizableDialog {
    static String tooltipExtraVisit;
    static Sprite field_gb;
    static vh field_hb;
    static int[] field_ib;
    private String introductoryText;
    private String statusText;
    private ProgressBarWidget progressBar;
    static vh field_qb;
    private boolean normalAnimationStopped;
    static int[] field_mb;
    private boolean redHighlightActive;

    final static void l(int param0) {
        int var3 = 0;
        int var1 = BufferedFile.field_h * BufferedFile.field_h;
        int var2 = -(em.field_P * em.field_P) + var1;
        int var3Lifetime1;
        if (param0 == 23323) {
          var3 = StrongCacheEntry.field_J + (-StrongCacheEntry.field_J + cb.field_g) * var2 / var1;
          fl.field_q.b(var3, 2147483647, tn.field_u, 640, 120);
          mm.a(ja.field_b, cb.field_g - 24, 0, 640, 5, 118, CueAim.field_j);
          return;
        }
        field_ib = (int[]) null;
        var3Lifetime1 = StrongCacheEntry.field_J + (-StrongCacheEntry.field_J + cb.field_g) * var2 / var1;
        fl.field_q.b(var3Lifetime1, 2147483647, tn.field_u, 640, 120);
        mm.a(ja.field_b, cb.field_g - 24, 0, 640, 5, 118, CueAim.field_j);
    }

    final void drawDialogFrame(int param0, int param1, int param2) {
        super.drawDialogFrame(param0, param1, param2);
        bi.field_e.drawCentered(this.statusText, param0 + (this.widgetWidth >> 1), param1 + 103, 16777215, -1);
        if (null != this.introductoryText) {
          SoftwareRasterizer.drawHorizontalLine(param0 + 20, -7 + (param1 + 120), 260, 8421504);
          bi.field_e.drawParagraph(this.introductoryText, param0 + 20, 8 + (param1 + 120), 260, 100, 16777215, -1, 1, 0, bi.field_e.maxAscent);
        }
    }

    ProgressDialog(DialogLayer param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.introductoryText = param1;
          if (null != this.introductoryText) {
            var3_int = bi.field_e.measureWrappedHeight(this.introductoryText, 260, bi.field_e.maxAscent);
            this.resizeAndCenter(150 + var3_int, 31936, 300);
          }
          this.progressBar = new ProgressBarWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.progressBar.animationEnabled = true;
          this.normalAnimationStopped = false;
          this.redHighlightActive = false;
          this.addChild(true, this.progressBar);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(int param0) {
        tooltipExtraVisit = null;
        field_qb = null;
        field_ib = null;
        if (param0 == 7585) {
          field_gb = null;
          field_mb = null;
          field_hb = null;
          return;
        }
        ProgressDialog.l(-78);
        field_gb = null;
        field_mb = null;
        field_hb = null;
    }

    final void updateProgress(String param0, int param1, float param2, boolean param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2113632) {
            this.redHighlightActive = false;
          }
          if (param3 == this.redHighlightActive) {
            this.statusText = param0;
            this.progressBar.fillFractionQ16 = (int)(65536.0f * (param2 / 100.0f));
            return;
          }
          stackIn_7_1 = (param3);
          this.redHighlightActive = stackIn_7_1;
          if (!this.redHighlightActive) {
            this.progressBar.setStripeColors(4210752, param1 - 2094267, 2113632);
            if (this.normalAnimationStopped) {
              this.progressBar.animationEnabled = false;
            }
          } else {
            this.progressBar.setStripeColors(4210752, 19365, 8405024);
            this.progressBar.animationEnabled = true;
          }
          this.statusText = param0;
          this.progressBar.fillFractionQ16 = (int)(65536.0f * (param2 / 100.0f));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("wa.O(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void i(byte param0) {
        if (param0 == 72) {
          GameRules.field_c.field_e = 0;
          GameRules.field_c.field_a = 0;
          return;
        }
        field_ib = (int[]) null;
        GameRules.field_c.field_e = 0;
        GameRules.field_c.field_a = 0;
    }

    final static void m(int param0) {
        if (param0 != 8421504) {
          field_gb = (Sprite) null;
          if (null != PlasmaBallSkin.field_m) {
            if (PlasmaBallSkin.field_m.field_i != null) {
              PlasmaBallSkin.field_m.field_i.field_Ib = false;
            }
            PlasmaBallSkin.field_m = null;
            pf.field_c = null;
            return;
          }
          PlasmaBallSkin.field_m = null;
          pf.field_c = null;
          return;
        }
        if (null == PlasmaBallSkin.field_m) {
          PlasmaBallSkin.field_m = null;
          pf.field_c = null;
          return;
        }
        if (PlasmaBallSkin.field_m.field_i != null) {
          PlasmaBallSkin.field_m.field_i.field_Ib = false;
          PlasmaBallSkin.field_m = null;
          pf.field_c = null;
          return;
        }
        PlasmaBallSkin.field_m = null;
        pf.field_c = null;
    }

    final void stopNormalAnimation(int param0) {
        this.progressBar.animationEnabled = false;
        if (param0 != 0) {
          this.redHighlightActive = true;
          this.normalAnimationStopped = true;
          return;
        }
        this.normalAnimationStopped = true;
    }

    static {
        tooltipExtraVisit = "Extra visit";
        field_ib = new int[128];
        field_mb = new int[8192];
    }
}
