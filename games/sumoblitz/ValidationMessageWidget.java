/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationMessageWidget extends HotspotTextWidget {
    private Sprite field_K;
    static int field_R;
    private InputValidator validator;
    static int field_T;
    private String field_U;
    private int animationTicks;
    static String dataServerFullOrText;
    static boolean field_P;

    final String hoveredTooltip(int guard) {
        if (guard == -6696) {
          return null;
        }
        return (String) null;
    }

    final boolean requestFocus(UiWidget root, byte guard) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == 61) {
            return false;
          }
          var4 = (UiWidget) null;
          this.requestFocus((UiWidget) null, (byte) 73);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bn.Q(");
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        try {
          this.animationTicks = this.animationTicks + 1;
          super.update(parentX, 83, root, parentY);
          int var5_int = -76 / ((guard + 25) / 45);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bn.U(" + parentX + ',' + guard + ',' + (root != null ? "{...}" : "null") + ',' + parentY + ')');
        }
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        String var5;
        ValidationStatus var6;
        int var13;
        Object var17;
        Object var22;
        Object var27;
        Object var32;
        Object var37;
        Object var46;
        int var9;
        int var10;
        int var11;
        int var12;
        Sprite var16;
        Sprite var18;
        Sprite var19;
        Sprite var20;
        String var21;
        Sprite var23;
        Sprite var24;
        Sprite var25;
        String var26;
        Sprite var28;
        Sprite var29;
        Sprite var30;
        String var31;
        Sprite var33;
        Sprite var34;
        Sprite var35;
        String var36;
        Sprite var38;
        Sprite var39;
        Sprite var44;
        Sprite var45;
        Sprite var47;
        Sprite var48;
        Sprite var49;
        TextWidgetLayout var50;
        TextWidgetLayout var51;
        TextWidgetLayout var52;
        TextWidgetLayout var53;
        TextWidgetLayout var54;
        TextWidgetLayout var55;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var12Lifetime5;
        int var12Lifetime6;
        ValidationStatus var6Lifetime1;
        ValidationStatus var6Lifetime2;
        ValidationStatus var6Lifetime3;
        ValidationStatus var6Lifetime4;
        ValidationStatus var6Lifetime5;
        var17 = null;
        var22 = null;
        var27 = null;
        var32 = null;
        var37 = null;
        var46 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        if (guard < -35) {
          var6 = this.validator.getStatus(-126);
          if (var6 != GameInstructions.DEBOUNCING &&
            var6 != kt.PENDING) {
            var5 = this.validator.getMessage(3690);
            if (var5 == null) {
              var5 = this.field_U;
            }
          } else {
            var5 = SoftwareRenderTarget.checkingText;
          }
          if (!var5.equals(this.text)) {
            this.text = var5;
            this.rebuildHotspots(9);
          }
          super.renderLayer(parentX, parentY, (byte) -119, layer);
          var6Lifetime5 = this.validator.getStatus(-106);
          var50 = (TextWidgetLayout) ((Object) this.renderer);
          var9 = this.x + parentX;
          var10 = var50.textOriginY(parentY, (UiWidget) (this), 0) + (var50.layoutText(-3, (UiWidget) (this)).height(true) >> 1);
          if (var6Lifetime5 != GameInstructions.DEBOUNCING &&
            kt.PENDING != var6Lifetime5) {
            if (qr.INVALID == var6Lifetime5) {
              var18 = fw.field_m[2];
              var18.d(var9, -(var18.field_u >> 1) + var10, 256);
              return;
            }
            if (qe.VALID != var6Lifetime5) {
              return;
            }
            var19 = fw.field_m[1];
            var19.d(var9, var10 - (var19.field_u >> 1), 256);
            return;
          }
          var20 = fw.field_m[0];
          var11 = var20.field_z << 1;
          var12 = var20.field_w << 1;
          if (this.field_K == null) {
            this.field_K = new Sprite(var11, var12);
            jq.a(7161, this.field_K);
          } else {
            if (var11 > this.field_K.field_x) {
              this.field_K = new Sprite(var11, var12);
              jq.a(7161, this.field_K);
            } else {
              if (this.field_K.field_u < var12) {
                this.field_K = new Sprite(var11, var12);
                jq.a(7161, this.field_K);
              } else {
                jq.a(7161, this.field_K);
                SoftwareRasterizer.clear();
              }
            }
          }
          var20.a(112, 144, var20.field_z << 4, var20.field_w << 4, -this.animationTicks << 10, 4096);
          ClientException.popRasterState((byte) -50);
          this.field_K.d(-(var20.field_z >> 1) + var9, -var20.field_w + var10, 256);
          return;
        }
        this.renderLayer(-71, -15, (byte) -42, -1);
        var6Lifetime1 = this.validator.getStatus(-126);
        if (var6Lifetime1 == GameInstructions.DEBOUNCING) {
          var21 = SoftwareRenderTarget.checkingText;
          if (!var21.equals(this.text)) {
            this.text = var21;
            this.rebuildHotspots(9);
          }
          super.renderLayer(parentX, parentY, (byte) -119, layer);
          var6Lifetime1 = this.validator.getStatus(-106);
          var51 = (TextWidgetLayout) ((Object) this.renderer);
          var9Lifetime1 = this.x + parentX;
          var10Lifetime1 = var51.textOriginY(parentY, (UiWidget) (this), 0) + (var51.layoutText(-3, (UiWidget) (this)).height(true) >> 1);
          if (var6Lifetime1 != GameInstructions.DEBOUNCING &&
            kt.PENDING != var6Lifetime1) {
            if (qr.INVALID == var6Lifetime1) {
              var23 = fw.field_m[2];
              var23.d(var9Lifetime1, -(var23.field_u >> 1) + var10Lifetime1, 256);
              return;
            }
            if (qe.VALID != var6Lifetime1) {
              return;
            }
            var24 = fw.field_m[1];
            var24.d(var9Lifetime1, var10Lifetime1 - (var24.field_u >> 1), 256);
            return;
          }
          var25 = fw.field_m[0];
          var11Lifetime1 = var25.field_z << 1;
          var12Lifetime1 = var25.field_w << 1;
          if (this.field_K == null) {
            this.field_K = new Sprite(var11Lifetime1, var12Lifetime1);
            jq.a(7161, this.field_K);
          } else {
            if (var11Lifetime1 > this.field_K.field_x) {
              this.field_K = new Sprite(var11Lifetime1, var12Lifetime1);
              jq.a(7161, this.field_K);
            } else {
              if (this.field_K.field_u < var12Lifetime1) {
                this.field_K = new Sprite(var11Lifetime1, var12Lifetime1);
                jq.a(7161, this.field_K);
              } else {
                jq.a(7161, this.field_K);
                SoftwareRasterizer.clear();
              }
            }
          }
          var25.a(112, 144, var25.field_z << 4, var25.field_w << 4, -this.animationTicks << 10, 4096);
          ClientException.popRasterState((byte) -50);
          this.field_K.d(-(var25.field_z >> 1) + var9Lifetime1, -var25.field_w + var10Lifetime1, 256);
          return;
        }
        if (var6Lifetime1 == kt.PENDING) {
          var26 = SoftwareRenderTarget.checkingText;
          if (!var26.equals(this.text)) {
            this.text = var26;
            this.rebuildHotspots(9);
          }
          super.renderLayer(parentX, parentY, (byte) -119, layer);
          var6Lifetime1 = this.validator.getStatus(-106);
          var52 = (TextWidgetLayout) ((Object) this.renderer);
          var9Lifetime2 = this.x + parentX;
          var10Lifetime2 = var52.textOriginY(parentY, (UiWidget) (this), 0) + (var52.layoutText(-3, (UiWidget) (this)).height(true) >> 1);
          if (var6Lifetime1 != GameInstructions.DEBOUNCING &&
            kt.PENDING != var6Lifetime1) {
            if (qr.INVALID == var6Lifetime1) {
              var28 = fw.field_m[2];
              var28.d(var9Lifetime2, -(var28.field_u >> 1) + var10Lifetime2, 256);
              return;
            }
            if (qe.VALID != var6Lifetime1) {
              return;
            }
            var29 = fw.field_m[1];
            var29.d(var9Lifetime2, var10Lifetime2 - (var29.field_u >> 1), 256);
            return;
          }
          var30 = fw.field_m[0];
          var11Lifetime2 = var30.field_z << 1;
          var12Lifetime2 = var30.field_w << 1;
          if (this.field_K == null) {
            this.field_K = new Sprite(var11Lifetime2, var12Lifetime2);
            jq.a(7161, this.field_K);
          } else {
            if (var11Lifetime2 > this.field_K.field_x) {
              this.field_K = new Sprite(var11Lifetime2, var12Lifetime2);
              jq.a(7161, this.field_K);
            } else {
              if (this.field_K.field_u >= var12Lifetime2) {
                jq.a(7161, this.field_K);
                SoftwareRasterizer.clear();
              } else {
                this.field_K = new Sprite(var11Lifetime2, var12Lifetime2);
                jq.a(7161, this.field_K);
              }
            }
          }
          var30.a(112, 144, var30.field_z << 4, var30.field_w << 4, -this.animationTicks << 10, 4096);
          ClientException.popRasterState((byte) -50);
          this.field_K.d(-(var30.field_z >> 1) + var9Lifetime2, -var30.field_w + var10Lifetime2, 256);
          return;
        }
        var31 = this.validator.getMessage(3690);
        if (var31 != null) {
          if (!var31.equals(this.text)) {
            this.text = var31;
            this.rebuildHotspots(9);
          }
          super.renderLayer(parentX, parentY, (byte) -119, layer);
          var6Lifetime2 = this.validator.getStatus(-106);
          var53 = (TextWidgetLayout) ((Object) this.renderer);
          var9Lifetime3 = this.x + parentX;
          var10Lifetime3 = var53.textOriginY(parentY, (UiWidget) (this), 0) + (var53.layoutText(-3, (UiWidget) (this)).height(true) >> 1);
          if (var6Lifetime2 != GameInstructions.DEBOUNCING &&
            kt.PENDING != var6Lifetime2) {
            if (qr.INVALID == var6Lifetime2) {
              var33 = fw.field_m[2];
              var33.d(var9Lifetime3, -(var33.field_u >> 1) + var10Lifetime3, 256);
              return;
            }
            if (qe.VALID != var6Lifetime2) {
              return;
            }
            var34 = fw.field_m[1];
            var34.d(var9Lifetime3, var10Lifetime3 - (var34.field_u >> 1), 256);
            return;
          }
          var35 = fw.field_m[0];
          var11Lifetime3 = var35.field_z << 1;
          var12Lifetime3 = var35.field_w << 1;
          if (this.field_K == null) {
            this.field_K = new Sprite(var11Lifetime3, var12Lifetime3);
            jq.a(7161, this.field_K);
          } else {
            if (var11Lifetime3 > this.field_K.field_x) {
              this.field_K = new Sprite(var11Lifetime3, var12Lifetime3);
              jq.a(7161, this.field_K);
            } else {
              if (this.field_K.field_u >= var12Lifetime3) {
                jq.a(7161, this.field_K);
                SoftwareRasterizer.clear();
              } else {
                this.field_K = new Sprite(var11Lifetime3, var12Lifetime3);
                jq.a(7161, this.field_K);
              }
            }
          }
          var35.a(112, 144, var35.field_z << 4, var35.field_w << 4, -this.animationTicks << 10, 4096);
          ClientException.popRasterState((byte) -50);
          this.field_K.d(-(var35.field_z >> 1) + var9Lifetime3, -var35.field_w + var10Lifetime3, 256);
          return;
        }
        var36 = this.field_U;
        if (var36.equals(this.text)) {
          super.renderLayer(parentX, parentY, (byte) -119, layer);
          var6Lifetime3 = this.validator.getStatus(-106);
          var55 = (TextWidgetLayout) ((Object) this.renderer);
          var9Lifetime4 = this.x + parentX;
          var10Lifetime4 = var55.textOriginY(parentY, (UiWidget) (this), 0) + (var55.layoutText(-3, (UiWidget) (this)).height(true) >> 1);
          if (var6Lifetime3 != GameInstructions.DEBOUNCING &&
            kt.PENDING != var6Lifetime3) {
            if (qr.INVALID == var6Lifetime3) {
              var47 = fw.field_m[2];
              var47.d(var9Lifetime4, -(var47.field_u >> 1) + var10Lifetime4, 256);
              return;
            }
            if (qe.VALID != var6Lifetime3) {
              return;
            }
            var48 = fw.field_m[1];
            var48.d(var9Lifetime4, var10Lifetime4 - (var48.field_u >> 1), 256);
            return;
          }
          var49 = fw.field_m[0];
          var11Lifetime4 = var49.field_z << 1;
          var12Lifetime4 = var49.field_w << 1;
          if (this.field_K != null &&
            var11Lifetime4 <= this.field_K.field_x) {
            if (this.field_K.field_u >= var12Lifetime4) {
              jq.a(7161, this.field_K);
              SoftwareRasterizer.clear();
            } else {
              this.field_K = new Sprite(var11Lifetime4, var12Lifetime4);
              jq.a(7161, this.field_K);
            }
          } else {
            this.field_K = new Sprite(var11Lifetime4, var12Lifetime4);
            jq.a(7161, this.field_K);
          }
          var49.a(112, 144, var49.field_z << 4, var49.field_w << 4, -this.animationTicks << 10, 4096);
          ClientException.popRasterState((byte) -50);
          this.field_K.d(-(var49.field_z >> 1) + var9Lifetime4, -var49.field_w + var10Lifetime4, 256);
          return;
        }
        this.text = var36;
        this.rebuildHotspots(9);
        super.renderLayer(parentX, parentY, (byte) -119, layer);
        var6Lifetime4 = this.validator.getStatus(-106);
        var54 = (TextWidgetLayout) ((Object) this.renderer);
        var9Lifetime5 = this.x + parentX;
        var10Lifetime5 = var54.textOriginY(parentY, (UiWidget) (this), 0) + (var54.layoutText(-3, (UiWidget) (this)).height(true) >> 1);
        if (var6Lifetime4 == GameInstructions.DEBOUNCING) {
          var38 = fw.field_m[0];
          var11Lifetime5 = var38.field_z << 1;
          var12Lifetime5 = var38.field_w << 1;
          if (this.field_K != null &&
            var11Lifetime5 <= this.field_K.field_x) {
            if (this.field_K.field_u >= var12Lifetime5) {
              jq.a(7161, this.field_K);
              SoftwareRasterizer.clear();
            } else {
              this.field_K = new Sprite(var11Lifetime5, var12Lifetime5);
              jq.a(7161, this.field_K);
            }
          } else {
            this.field_K = new Sprite(var11Lifetime5, var12Lifetime5);
            jq.a(7161, this.field_K);
          }
          var38.a(112, 144, var38.field_z << 4, var38.field_w << 4, -this.animationTicks << 10, 4096);
          ClientException.popRasterState((byte) -50);
          this.field_K.d(-(var38.field_z >> 1) + var9Lifetime5, -var38.field_w + var10Lifetime5, 256);
          return;
        }
        if (kt.PENDING != var6Lifetime4) {
          if (qr.INVALID == var6Lifetime4) {
            var44 = fw.field_m[2];
            var44.d(var9Lifetime5, -(var44.field_u >> 1) + var10Lifetime5, 256);
            return;
          }
          if (qe.VALID != var6Lifetime4) {
            return;
          }
          var45 = fw.field_m[1];
          var45.d(var9Lifetime5, var10Lifetime5 - (var45.field_u >> 1), 256);
          return;
        }
        var39 = fw.field_m[0];
        var16 = var39;
        var11Lifetime6 = var39.field_z << 1;
        var12Lifetime6 = var39.field_w << 1;
        if (this.field_K != null &&
          var11Lifetime6 <= this.field_K.field_x) {
          if (this.field_K.field_u >= var12Lifetime6) {
            jq.a(7161, this.field_K);
            SoftwareRasterizer.clear();
          } else {
            this.field_K = new Sprite(var11Lifetime6, var12Lifetime6);
            jq.a(7161, this.field_K);
          }
        } else {
          this.field_K = new Sprite(var11Lifetime6, var12Lifetime6);
          jq.a(7161, this.field_K);
        }
        var39.a(112, 144, var39.field_z << 4, var39.field_w << 4, -this.animationTicks << 10, 4096);
        ClientException.popRasterState((byte) -50);
        this.field_K.d(-(var39.field_z >> 1) + var9Lifetime5, -var39.field_w + var10Lifetime5, 256);
        return;
    }

    final static void f(int param0) {
        nv.field_a = nv.field_a + 1;
        CacheReferenceNode.field_u = 150;
        int var1 = nv.field_a / param0;
        if (un.field_a.length - 1 != var1) {
          if (un.field_a.length <= var1) {
            var1 = un.field_a.length - 1;
          }
          pd.scoreMultiplier = un.field_a[var1];
          return;
        }
        FontMetrics.field_b = FontMetrics.field_b + 1;
        if (ps.field_e[12] == FontMetrics.field_b) {
          UnderageAccountInfoPanel.b(24753, 243, 12);
          if (un.field_a.length <= var1) {
            var1 = un.field_a.length - 1;
          }
          pd.scoreMultiplier = un.field_a[var1];
          return;
        }
        if (un.field_a.length <= var1) {
          var1 = un.field_a.length - 1;
        }
        pd.scoreMultiplier = un.field_a[var1];
    }

    ValidationMessageWidget(InputValidator validation, String helpText, int x, int y, int width, int height) {
        super(helpText, fw.a(0));
        try {
          this.field_U = helpText;
          this.validator = validation;
          this.setBounds(-60, x, y, height, width);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bn.<init>(" + (validation != null ? "{...}" : "null") + ',' + (helpText != null ? "{...}" : "null") + ',' + x + ',' + y + ',' + width + ',' + height + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        dataServerFullOrText = null;
        int var1 = -83 / ((param0 + 17) / 49);
    }

    static {
        field_T = 5;
        dataServerFullOrText = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_P = false;
        field_R = 0;
    }
}
