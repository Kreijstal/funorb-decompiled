/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationStatusWidget extends RichTextWidget {
    private FieldValidator field_fb;
    static String field_P;
    static MeshData field_cb;
    static ok field_bb;
    private String field_eb;
    private int field_db;
    private RgbSprite field_T;

    final void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        try {
          this.field_db = this.field_db + 1;
          super.updatePointer(param0, -32, param2, param3);
          if (param1 >= -6) {
            UiWidget var6 = (UiWidget) null;
            this.updatePointer(95, -66, (UiWidget) null, 75);
          }
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "ea.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        int var1 = 101 / ((param0 - 37) / 53);
        field_bb = null;
        field_P = null;
        field_cb = null;
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        String var5;
        mk var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        RgbSprite var16;
        String var17;
        Object var18;
        RgbSprite var19;
        RgbSprite var20;
        RgbSprite var21;
        String var22;
        Object var23;
        RgbSprite var24;
        RgbSprite var25;
        RgbSprite var26;
        String var27;
        Object var28;
        RgbSprite var29;
        RgbSprite var31;
        RgbSprite var37;
        RgbSprite var38;
        Object var39;
        RgbSprite var40;
        RgbSprite var41;
        RgbSprite var42;
        TextWidgetRenderer var43;
        TextWidgetRenderer var44;
        TextWidgetRenderer var45;
        TextWidgetRenderer var46;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        String var5Lifetime1;
        mk var6Lifetime1;
        mk var6Lifetime2;
        RgbSprite var16Lifetime1;
        var18 = null;
        var23 = null;
        var28 = null;
        var39 = null;
        var13 = Chess.field_G;
        if (param2 >= -80) {
          return;
        }
        var6 = this.field_fb.getValidationStatus(21314);
        if (in.field_g == var6) {
          var17 = NetworkArchiveRequest.field_v;
          if (!var17.equals(this.field_v)) {
            this.field_v = var17;
            this.rebuildHotspotBounds((byte) 105);
          }
          super.drawWidget(param0, param1, -109, param3);
          var6 = this.field_fb.getValidationStatus(21314);
          var43 = (TextWidgetRenderer) ((Object) this.field_n);
          var9 = param3 + this.field_u;
          var10 = var43.getTextOriginY(0, param0, (UiWidget) (this)) + (var43.getTextLayout((UiWidget) (this), -23159).getLayoutHeight((byte) 34) >> 1);
          if (in.field_g != var6 &&
            var6 != MouseWheelInput.field_d) {
            if (var6 == qk.field_b) {
              var19 = AccountNameAvailabilityValidator.field_p[2];
              var19.drawAdditive(var9, -(var19.field_t >> 1) + var10, 256);
              return;
            }
            if (ProxyAuthenticationRequiredException.field_a != var6) {
              return;
            }
            var20 = AccountNameAvailabilityValidator.field_p[1];
            var20.drawAdditive(var9, -(var20.field_t >> 1) + var10, 256);
            return;
          }
          var21 = AccountNameAvailabilityValidator.field_p[0];
          var11 = var21.field_v << 1;
          var12 = var21.field_u << 1;
          if (null == this.field_T) {
            this.field_T = new RgbSprite(var11, var12);
            tl.a((byte) -67, this.field_T);
          } else {
            if (var11 > this.field_T.field_w) {
              this.field_T = new RgbSprite(var11, var12);
              tl.a((byte) -67, this.field_T);
            } else {
              if (var12 > this.field_T.field_t) {
                this.field_T = new RgbSprite(var11, var12);
                tl.a((byte) -67, this.field_T);
              } else {
                tl.a((byte) -67, this.field_T);
                SoftwareRasterizer.clearRaster();
              }
            }
          }
          var21.drawRotatedAboutBilinear(112, 144, var21.field_v << 4, var21.field_u << 4, -this.field_db << 10, 4096);
          fd.a(28773);
          this.field_T.drawAdditive(-(var21.field_v >> 1) + var9, -var21.field_u + var10, 256);
          return;
        }
        if (var6 == MouseWheelInput.field_d) {
          var22 = NetworkArchiveRequest.field_v;
          if (!var22.equals(this.field_v)) {
            this.field_v = var22;
            this.rebuildHotspotBounds((byte) 105);
          }
          super.drawWidget(param0, param1, -109, param3);
          var6 = this.field_fb.getValidationStatus(21314);
          var44 = (TextWidgetRenderer) ((Object) this.field_n);
          var9Lifetime1 = param3 + this.field_u;
          var10Lifetime1 = var44.getTextOriginY(0, param0, (UiWidget) (this)) + (var44.getTextLayout((UiWidget) (this), -23159).getLayoutHeight((byte) 34) >> 1);
          if (in.field_g != var6 &&
            var6 != MouseWheelInput.field_d) {
            if (var6 == qk.field_b) {
              var24 = AccountNameAvailabilityValidator.field_p[2];
              var24.drawAdditive(var9Lifetime1, -(var24.field_t >> 1) + var10Lifetime1, 256);
              return;
            }
            if (ProxyAuthenticationRequiredException.field_a != var6) {
              return;
            }
            var25 = AccountNameAvailabilityValidator.field_p[1];
            var25.drawAdditive(var9Lifetime1, -(var25.field_t >> 1) + var10Lifetime1, 256);
            return;
          }
          var26 = AccountNameAvailabilityValidator.field_p[0];
          var11Lifetime1 = var26.field_v << 1;
          var12Lifetime1 = var26.field_u << 1;
          if (null == this.field_T) {
            this.field_T = new RgbSprite(var11Lifetime1, var12Lifetime1);
            tl.a((byte) -67, this.field_T);
          } else {
            if (var11Lifetime1 > this.field_T.field_w) {
              this.field_T = new RgbSprite(var11Lifetime1, var12Lifetime1);
              tl.a((byte) -67, this.field_T);
            } else {
              if (var12Lifetime1 > this.field_T.field_t) {
                this.field_T = new RgbSprite(var11Lifetime1, var12Lifetime1);
                tl.a((byte) -67, this.field_T);
              } else {
                tl.a((byte) -67, this.field_T);
                SoftwareRasterizer.clearRaster();
              }
            }
          }
          var26.drawRotatedAboutBilinear(112, 144, var26.field_v << 4, var26.field_u << 4, -this.field_db << 10, 4096);
          fd.a(28773);
          this.field_T.drawAdditive(-(var26.field_v >> 1) + var9Lifetime1, -var26.field_u + var10Lifetime1, 256);
          return;
        }
        var5 = this.field_fb.getValidationMessage(false);
        if (var5 != null) {
          if (!var5.equals(this.field_v)) {
            this.field_v = var5;
            this.rebuildHotspotBounds((byte) 105);
          }
          super.drawWidget(param0, param1, -109, param3);
          var6Lifetime1 = this.field_fb.getValidationStatus(21314);
          var46 = (TextWidgetRenderer) ((Object) this.field_n);
          var9Lifetime2 = param3 + this.field_u;
          var10Lifetime2 = var46.getTextOriginY(0, param0, (UiWidget) (this)) + (var46.getTextLayout((UiWidget) (this), -23159).getLayoutHeight((byte) 34) >> 1);
          if (in.field_g != var6Lifetime1 &&
            var6Lifetime1 != MouseWheelInput.field_d) {
            if (var6Lifetime1 == qk.field_b) {
              var40 = AccountNameAvailabilityValidator.field_p[2];
              var40.drawAdditive(var9Lifetime2, -(var40.field_t >> 1) + var10Lifetime2, 256);
              return;
            }
            if (ProxyAuthenticationRequiredException.field_a != var6Lifetime1) {
              return;
            }
            var41 = AccountNameAvailabilityValidator.field_p[1];
            var41.drawAdditive(var9Lifetime2, -(var41.field_t >> 1) + var10Lifetime2, 256);
            return;
          }
          var42 = AccountNameAvailabilityValidator.field_p[0];
          var11Lifetime2 = var42.field_v << 1;
          var12Lifetime2 = var42.field_u << 1;
          if (null != this.field_T &&
            var11Lifetime2 <= this.field_T.field_w) {
            if (var12Lifetime2 <= this.field_T.field_t) {
              tl.a((byte) -67, this.field_T);
              SoftwareRasterizer.clearRaster();
            } else {
              this.field_T = new RgbSprite(var11Lifetime2, var12Lifetime2);
              tl.a((byte) -67, this.field_T);
            }
          } else {
            this.field_T = new RgbSprite(var11Lifetime2, var12Lifetime2);
            tl.a((byte) -67, this.field_T);
          }
          var42.drawRotatedAboutBilinear(112, 144, var42.field_v << 4, var42.field_u << 4, -this.field_db << 10, 4096);
          fd.a(28773);
          this.field_T.drawAdditive(-(var42.field_v >> 1) + var9Lifetime2, -var42.field_u + var10Lifetime2, 256);
          return;
        }
        var27 = this.field_eb;
        var5Lifetime1 = var27;
        if (!var27.equals(this.field_v)) {
          this.field_v = var27;
          this.rebuildHotspotBounds((byte) 105);
        }
        super.drawWidget(param0, param1, -109, param3);
        var6Lifetime2 = this.field_fb.getValidationStatus(21314);
        var45 = (TextWidgetRenderer) ((Object) this.field_n);
        var9Lifetime3 = param3 + this.field_u;
        var10Lifetime3 = var45.getTextOriginY(0, param0, (UiWidget) (this)) + (var45.getTextLayout((UiWidget) (this), -23159).getLayoutHeight((byte) 34) >> 1);
        if (in.field_g == var6Lifetime2) {
          var29 = AccountNameAvailabilityValidator.field_p[0];
          var16 = var29;
          var11Lifetime3 = var29.field_v << 1;
          var12Lifetime3 = var29.field_u << 1;
          if (null == this.field_T) {
            this.field_T = new RgbSprite(var11Lifetime3, var12Lifetime3);
            tl.a((byte) -67, this.field_T);
          } else {
            if (var11Lifetime3 > this.field_T.field_w) {
              this.field_T = new RgbSprite(var11Lifetime3, var12Lifetime3);
              tl.a((byte) -67, this.field_T);
            } else {
              if (var12Lifetime3 <= this.field_T.field_t) {
                tl.a((byte) -67, this.field_T);
                SoftwareRasterizer.clearRaster();
              } else {
                this.field_T = new RgbSprite(var11Lifetime3, var12Lifetime3);
                tl.a((byte) -67, this.field_T);
              }
            }
          }
          var29.drawRotatedAboutBilinear(112, 144, var29.field_v << 4, var29.field_u << 4, -this.field_db << 10, 4096);
          fd.a(28773);
          this.field_T.drawAdditive(-(var29.field_v >> 1) + var9Lifetime3, -var29.field_u + var10Lifetime3, 256);
          return;
        }
        if (var6Lifetime2 != MouseWheelInput.field_d) {
          if (var6Lifetime2 == qk.field_b) {
            var37 = AccountNameAvailabilityValidator.field_p[2];
            var37.drawAdditive(var9Lifetime3, -(var37.field_t >> 1) + var10Lifetime3, 256);
            return;
          }
          if (ProxyAuthenticationRequiredException.field_a != var6Lifetime2) {
            return;
          }
          var38 = AccountNameAvailabilityValidator.field_p[1];
          var38.drawAdditive(var9Lifetime3, -(var38.field_t >> 1) + var10Lifetime3, 256);
          return;
        }
        var31 = AccountNameAvailabilityValidator.field_p[0];
        var16Lifetime1 = var31;
        var11Lifetime4 = var31.field_v << 1;
        var12Lifetime4 = var31.field_u << 1;
        if (null == this.field_T) {
          this.field_T = new RgbSprite(var11Lifetime4, var12Lifetime4);
          tl.a((byte) -67, this.field_T);
        } else {
          if (var11Lifetime4 > this.field_T.field_w) {
            this.field_T = new RgbSprite(var11Lifetime4, var12Lifetime4);
            tl.a((byte) -67, this.field_T);
          } else {
            if (var12Lifetime4 > this.field_T.field_t) {
              this.field_T = new RgbSprite(var11Lifetime4, var12Lifetime4);
              tl.a((byte) -67, this.field_T);
            } else {
              tl.a((byte) -67, this.field_T);
              SoftwareRasterizer.clearRaster();
            }
          }
        }
        var31.drawRotatedAboutBilinear(112, 144, var31.field_v << 4, var31.field_u << 4, -this.field_db << 10, 4096);
        fd.a(28773);
        this.field_T.drawAdditive(-(var31.field_v >> 1) + var9Lifetime3, -var31.field_u + var10Lifetime3, 256);
    }

    final String getTooltipText(int param0) {
        if (param0 == 0) {
          return null;
        }
        this.getTooltipText(93);
        return null;
    }

    final boolean takeFocus(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ea.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int h(byte param0) {
        if (param0 != -16) {
          field_bb = (ok) null;
          return ImageProducerRasterBuffer.field_o;
        }
        return ImageProducerRasterBuffer.field_o;
    }

    ValidationStatusWidget(FieldValidator param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, PasswordValidator.d(false));
        try {
          this.field_fb = param0;
          this.field_eb = param1;
          this.setBounds(param3, 34, param5, param4, param2);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static long i(byte param0) {
        int var1 = 40 % ((-84 - param0) / 36);
        return -GrowableIntArray.field_d + ud.correctedCurrentTimeMillis(2);
    }

    static {
        field_P = "Shortcut Reference";
    }
}
