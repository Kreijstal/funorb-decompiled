/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadingProgressDialog extends PopupWidgetLayer {
    private boolean highlighted;
    private String statusText;
    static int pressX;
    private boolean stopAnimationRequested;
    private ActivityIndicatorWidget activityBar;
    private String details;
    static String field_eb;
    static String field_db;
    static String field_cb;

    final void paintLayerFrame(int x, int obfuscationGuard, int y) {
        super.paintLayerFrame(x, obfuscationGuard ^ 0, y);
        FontSceneGlobals.field_a.drawCentered(this.statusText, x + (this.width >> 1), y + 103, 16777215, -1);
        if (obfuscationGuard == 274) {
          if (this.details != null) {
            Rasterizer2D.drawHorizontalLine(20 + x, 120 + y - 7, 260, 8421504);
            FontSceneGlobals.field_a.drawParagraph(this.details, x + 20, 8 + y + 120, 260, 100, 16777215, -1, 1, 0, FontSceneGlobals.field_a.ascent);
          }
          return;
        }
        this.stopAnimationRequested = false;
        if (this.details != null) {
          Rasterizer2D.drawHorizontalLine(20 + x, 120 + y - 7, 260, 8421504);
          FontSceneGlobals.field_a.drawParagraph(this.details, x + 20, 8 + y + 120, 260, 100, 16777215, -1, 1, 0, FontSceneGlobals.field_a.ascent);
        }
    }

    final static AlphaFont a(int param0, int param1, ResourceArchive param2, ResourceArchive param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        AlphaFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 111) {
            pressX = -88;
          }
          if (BytePayloadSubmission.decodeSpritesFromArchive(-104, param4, param2, param1)) {
            stackIn_6_0 = MusicEnvelope.a(param3.takeFile(param4, param1, 4), (byte) -14);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (AlphaFont) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("tb.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ResourceArchive var13 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = param1.length();
          var5 = param3.length();
          var6 = param0.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          if (!param2) {
            var13 = (ResourceArchive) null;
            LoadingProgressDialog.a(95, -81, (ResourceArchive) null, (ResourceArchive) null, -12);
          }
          var8 = var6 - var5;
          if (var8 != 0) {
            var9_int = 0;
            while (true) {
              var9_int = param1.indexOf(param3, var9_int);
              if (0 > var9_int) {
                break;
              }
              var9_int = var9_int + var5;
              var7 = var7 + var8;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          while (true) {
            var11 = param1.indexOf(param3, var10);
            if (var11 < 0) {
              discarded$0 = var9.append(param1.substring(var10));
              stackIn_14_0 = var9.toString();
              return stackIn_14_0;
            }
            discarded$1 = var9.append(param1.substring(var10, var11));
            var10 = var11 + var5;
            discarded$2 = var9.append(param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("tb.S(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void setProgress(float percent, String statusText, boolean highlighted, byte obfuscationGuard) {
        RuntimeException failure = null;
        boolean previousHighlight = false;
        int oppositeHighlightValue = 0;
        boolean nextHighlight = false;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String statusSummary = null;
        RuntimeException caughtFailure = null;
        try {
          previousHighlight = this.highlighted;
          if (highlighted) {
            oppositeHighlightValue = 0;
          } else {
            oppositeHighlightValue = 1;
          }
          if ((previousHighlight ? 1 : 0) == oppositeHighlightValue) {
            nextHighlight = (highlighted);
            this.highlighted = nextHighlight;
            if (this.highlighted) {
              this.activityBar.setActivityColors(8405024, 4210752, 2);
              this.activityBar.animated = true;
            } else {
              this.activityBar.setActivityColors(2113632, 4210752, obfuscationGuard - 84);
              if (this.stopAnimationRequested) {
                this.activityBar.animated = false;
              }
            }
          }
          this.activityBar.progressFraction65536 = (int)(percent / 100.0f * 65536.0f);
          if (obfuscationGuard != 86) {
            return;
          }
          this.statusText = statusText;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("tb.P(").append(percent).append(',');
          if (statusText == null) {
            statusSummary = "null";
          } else {
            statusSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(statusSummary).append(',').append(highlighted).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void stopActivityAnimation(int obfuscationGuard) {
        if (obfuscationGuard == 6457) {
          this.activityBar.animated = false;
          this.stopAnimationRequested = true;
          return;
        }
        this.stopActivityAnimation(88);
        this.activityBar.animated = false;
        this.stopAnimationRequested = true;
    }

    LoadingProgressDialog(WidgetLayerStack layerStack, String details) {
        super(layerStack, 300, 120);
        int detailHeight = 0;
        try {
          this.details = details;
          if (null != this.details) {
            detailHeight = FontSceneGlobals.field_a.measureWrappedHeight(this.details, 260, FontSceneGlobals.field_a.ascent);
            this.setCenteredSize(true, 150 + detailHeight, 300);
          }
          this.activityBar = new ActivityIndicatorWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.highlighted = false;
          this.stopAnimationRequested = false;
          this.activityBar.animated = true;
          this.addChild(this.activityBar, true);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "tb.<init>(" + (layerStack != null ? "{...}" : "null") + ',' + (details != null ? "{...}" : "null") + ')');
        }
    }

    public static void m(int param0) {
        field_cb = null;
        field_db = null;
        if (param0 > -26) {
          field_db = (String) null;
          field_eb = null;
          return;
        }
        field_eb = null;
    }

    static {
        field_db = "Catch this with your paddle.<br><br>A positive power-up is worth 100 points and will help you. A negative one will hinder you, but is worth 500 points!";
        pressX = 0;
    }
}
