/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends vf {
    private Sprite field_Q;
    private int field_P;
    static int[][] logoMeshCenters;
    private dg field_M;
    static IndexedSprite sweetsBackgroundSprite;
    static MusicScore field_S;
    private String field_N;

    final String getHoverText(byte methodGuard) {
        if (methodGuard == 69) {
            return null;
        }
        return (String) null;
    }

    final static PaletteBitmapFont loadPaletteFontById(ResourceArchive fontMetricsArchive, int groupId, int methodGuard, ResourceArchive glyphGraphicsArchive, int fileId) {
        int sentinelRemainder = 0;
        RuntimeException fontFailureForContext = null;
        Object nullFontBeforeReturn = null;
        PaletteBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeArchiveDescriptions = null;
        StringBuilder fontMessagePrefix = null;
        String metricsArchiveDescription = null;
        StringBuilder fontMessageBeforeGlyphArchive = null;
        String glyphArchiveDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          sentinelRemainder = -107 % ((-62 - methodGuard) / 58);
          if (mf.decodeSpritesFromArchive(fileId, groupId, 116, glyphGraphicsArchive)) {
            fontBeforeReturn = ni.buildPaletteFontFromDecodedSprites(fontMetricsArchive.getFile(groupId, -28153, fileId), -108);
            return fontBeforeReturn;
          }
          nullFontBeforeReturn = null;
          return (PaletteBitmapFont) (nullFontBeforeReturn);
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeArchiveDescriptions = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("pi.O(");
          if (fontMetricsArchive == null) {
            metricsArchiveDescription = "null";
          } else {
            metricsArchiveDescription = "{...}";
          }
          fontMessageBeforeGlyphArchive = ((StringBuilder) (Object) fontMessagePrefix).append(metricsArchiveDescription).append(',').append(groupId).append(',').append(methodGuard).append(',');
          if (glyphGraphicsArchive == null) {
            glyphArchiveDescription = "null";
          } else {
            glyphArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeArchiveDescriptions), ((StringBuilder) (Object) fontMessageBeforeGlyphArchive).append(glyphArchiveDescription).append(',').append(fileId).append(')').toString());
        }
    }

    final static void c(int param0, int param1) {
        wg.field_a = param0 >> 4 & 3;
        if (!(wg.field_a <= 2)) {
            wg.field_a = 2;
        }
        ByteArrayBuffer.field_i = param0 >> 2 & 3;
        ad.field_j = 3 & param0;
        if (!(ByteArrayBuffer.field_i <= 2)) {
            ByteArrayBuffer.field_i = 2;
        }
        if (param1 != -12718) {
            pi.j(-27);
            if (ad.field_j > 2) {
                ad.field_j = 2;
                return;
            }
            return;
        }
        if (ad.field_j <= 2) {
            return;
        }
        ad.field_j = 2;
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            this.field_P = this.field_P + 1;
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "pi.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    final boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (methodGuard <= -30) {
            return false;
          }
          this.field_P = 97;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pi.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        String var5;
        lh var6;
        int var14;
        cc var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        Sprite var15;
        Sprite var16;
        Sprite var17;
        Sprite var18;
        Sprite var19;
        var14 = Geoblox.clientControlFlowFlag;
        var6 = this.field_M.a((byte) -105);
        if ((var6 != ImageProducerRasterBuffer.field_g) &&
            (var6 != si.field_n)) {
          var5 = this.field_M.c(-21666);
          if (!(var5 != null)) {
            var5 = this.field_N;
          }
        } else {
          var5 = cm.checkingText;
        }
        if (!var5.equals(this.widgetText)) {
          this.widgetText = var5;
          this.g(-55);
        }
        super.renderWidget(parentX, parentY, (byte) 106, renderPass);
        var6 = this.field_M.a((byte) -105);
        var8 = (cc) ((Object) this.renderer);
        var9 = this.widgetX + parentX;
        var10 = var8.a(parentY, -2, (UiWidget) (this)) + (var8.a((byte) 125, (UiWidget) (this)).b(-3111) >> 1);
        var11 = 7 % ((methodGuard - 1) / 43);
        if (ImageProducerRasterBuffer.field_g == var6) {
          var19 = oa.field_e[0];
          var12 = var19.fullWidth << 1;
          var13 = var19.fullHeight << 1;
          if (this.field_Q == null) {
            this.field_Q = new Sprite(var12, var13);
            Geoblox.setRasterTarget(1, this.field_Q);
          } else {
            if (this.field_Q.width < var12) {
              this.field_Q = new Sprite(var12, var13);
              Geoblox.setRasterTarget(1, this.field_Q);
            } else {
              if (this.field_Q.height < var13) {
                this.field_Q = new Sprite(var12, var13);
                Geoblox.setRasterTarget(1, this.field_Q);
              } else {
                Geoblox.setRasterTarget(1, this.field_Q);
                SoftwareRasterizer.clearFramebuffer();
              }
            }
          }
          var19.rotateSmooth(112, 144, var19.fullWidth << 4, var19.fullHeight << 4, -this.field_P << 10, 4096);
          id.a(true);
          this.field_Q.drawAdditive(-(var19.fullWidth >> 1) + var9, var10 - var19.fullHeight, 256);
          return;
        }
        if (var6 != si.field_n) {
          if (si.field_m == var6) {
            var17 = oa.field_e[2];
            var17.drawAdditive(var9, var10 - (var17.height >> 1), 256);
            return;
          }
          if (SocketArchiveNetworkClient.field_w != var6) {
            return;
          }
          var16 = oa.field_e[1];
          var16.drawAdditive(var9, var10 - (var16.height >> 1), 256);
          return;
        }
        var18 = oa.field_e[0];
        var15 = var18;
        var12 = var18.fullWidth << 1;
        var13 = var18.fullHeight << 1;
        if (this.field_Q == null) {
          this.field_Q = new Sprite(var12, var13);
          Geoblox.setRasterTarget(1, this.field_Q);
        } else {
          if (this.field_Q.width < var12) {
            this.field_Q = new Sprite(var12, var13);
            Geoblox.setRasterTarget(1, this.field_Q);
          } else {
            if (this.field_Q.height < var13) {
              this.field_Q = new Sprite(var12, var13);
              Geoblox.setRasterTarget(1, this.field_Q);
            } else {
              Geoblox.setRasterTarget(1, this.field_Q);
              SoftwareRasterizer.clearFramebuffer();
            }
          }
        }
        var18.rotateSmooth(112, 144, var18.fullWidth << 4, var18.fullHeight << 4, -this.field_P << 10, 4096);
        id.a(true);
        this.field_Q.drawAdditive(-(var18.fullWidth >> 1) + var9, var10 - var18.fullHeight, 256);
        return;
    }

    public static void j(int param0) {
        logoMeshCenters = (int[][]) null;
        field_S = null;
        if (param0 != 24033) {
            logoMeshCenters = (int[][]) null;
            sweetsBackgroundSprite = null;
            return;
        }
        sweetsBackgroundSprite = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        kd.field_e.a(0, 0, 0);
    }

    pi(dg param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ah.a((byte) -66));
        try {
            this.field_M = param0;
            this.field_N = param1;
            this.setWidgetBounds(param5, param4, (byte) -77, param3, param2);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
