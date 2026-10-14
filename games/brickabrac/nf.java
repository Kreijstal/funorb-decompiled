/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends HotspotTextWidget {
    private int field_Q;
    static int selectedAchievementId;
    private String field_S;
    static int hoveredAchievementId;
    static RgbSprite[] field_W;
    static boolean field_V;
    private RgbSprite field_X;
    private ia field_R;
    static String field_T;
    static RgbSprite halloweenNearSprite;

    final boolean tryFocus(boolean obfuscationGuard, Widget focusRoot) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nf.CA(").append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final String getTooltip(int obfuscationGuard) {
        if (obfuscationGuard > 6) {
          return null;
        }
        return (String) null;
    }

    nf(ia param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, DraggableWidget.g(-23009));
        try {
          this.field_R = param0;
          this.field_S = param1;
          this.setBounds(param5, param2, param3, (byte) -119, param4);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "nf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0) {
        po.a(13);
        if (param0 != 109) {
          field_T = (String) null;
        }
    }

    public static void f(byte param0) {
        field_W = null;
        halloweenNearSprite = null;
        field_T = null;
        if (param0 >= -18) {
          nf.a((byte) 48);
        }
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        qh var6;
        int var9;
        int var10;
        int var13;
        String var17;
        Object var18;
        WidgetLayoutProvider var18_ref;
        RgbSprite var19;
        RgbSprite var20;
        Object var22;
        Object var27;
        Object var31;
        Object var36;
        Object var40;
        Object var44;
        Object var50;
        String var5;
        int var11;
        int var12;
        RgbSprite var16;
        RgbSprite var21;
        WidgetLayoutProvider var22_ref;
        RgbSprite var23;
        RgbSprite var24;
        RgbSprite var25;
        String var26;
        WidgetLayoutProvider var27_ref;
        RgbSprite var28;
        RgbSprite var29;
        RgbSprite var30;
        WidgetLayoutProvider var31_ref;
        RgbSprite var32;
        RgbSprite var33;
        RgbSprite var34;
        String var35;
        WidgetLayoutProvider var36_ref;
        RgbSprite var37;
        RgbSprite var38;
        RgbSprite var39;
        WidgetLayoutProvider var40_ref;
        RgbSprite var41;
        RgbSprite var42;
        RgbSprite var43;
        WidgetLayoutProvider var44_ref;
        RgbSprite var45;
        RgbSprite var46;
        RgbSprite var47;
        WidgetLayoutProvider var50_ref;
        RgbSprite var51;
        RgbSprite var52;
        RgbSprite var53;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var9Lifetime5;
        int var10Lifetime5;
        int var11Lifetime5;
        int var12Lifetime5;
        int var9Lifetime1Lifetime1;
        int var9Lifetime2Lifetime1;
        int var10Lifetime1Lifetime1;
        int var10Lifetime2Lifetime1;
        int var11Lifetime1Lifetime1;
        int var11Lifetime2Lifetime1;
        int var12Lifetime1Lifetime1;
        int var12Lifetime2Lifetime1;
        qh var6Lifetime1;
        qh var6Lifetime2;
        qh var6Lifetime3;
        String var5Lifetime1;
        qh var6Lifetime1Lifetime1;
        var18 = null;
        var22 = null;
        var27 = null;
        var31 = null;
        var36 = null;
        var40 = null;
        var44 = null;
        var50 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        var6 = this.field_R.b((byte) -31);
        if (var6 == m.field_c) {
          var17 = DropTargetWidget.field_G;
          if (!var17.equals(this.text)) {
            this.text = var17;
            this.rebuildHotspots(obfuscationGuard + 10);
            super.drawLayer(parentY, parentX, layer, obfuscationGuard);
            var6 = this.field_R.b((byte) -31);
            var18_ref = (WidgetLayoutProvider) ((Object) this.renderer);
            var9 = parentX + this.x;
            var10 = var18_ref.a(parentY, (byte) -107, (Widget) (this)) + (var18_ref.getTextLayout((Widget) (this), obfuscationGuard ^ 32).getHeight(0) >> 1);
            if (var6 != m.field_c &&
              var6 != SaveResultsPromptScreen.field_z) {
              if (lp.field_xb == var6) {
                var19 = df.field_a[2];
                var19.f(var9, var10 - (var19.height >> 1), 256);
                return;
              }
              if (DualLinkIterator.field_c != var6) {
                return;
              }
              var20 = df.field_a[1];
              var20.f(var9, -(var20.height >> 1) + var10, 256);
              return;
            }
            var21 = df.field_a[0];
            var11 = var21.canvasWidth << 1;
            var12 = var21.canvasHeight << 1;
            if (this.field_X != null &&
              var11 <= this.field_X.width &&
              this.field_X.height >= var12) {
              IndexedSpriteGeometry.pushSpriteRaster(-70, this.field_X);
              Rasterizer2D.clear();
            } else {
              this.field_X = new RgbSprite(var11, var12);
              IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
            }
            var21.a(112, 144, var21.canvasWidth << 4, var21.canvasHeight << 4, -this.field_Q << 10, 4096);
            sc.popRaster(-111);
            this.field_X.f(-(var21.canvasWidth >> 1) + var9, -var21.canvasHeight + var10, 256);
            return;
          }
          super.drawLayer(parentY, parentX, layer, obfuscationGuard);
          var6 = this.field_R.b((byte) -31);
          var22_ref = (WidgetLayoutProvider) ((Object) this.renderer);
          var9Lifetime5 = parentX + this.x;
          var10Lifetime5 = var22_ref.a(parentY, (byte) -107, (Widget) (this)) + (var22_ref.getTextLayout((Widget) (this), obfuscationGuard ^ 32).getHeight(0) >> 1);
          if (var6 != m.field_c &&
            var6 != SaveResultsPromptScreen.field_z) {
            if (lp.field_xb == var6) {
              var23 = df.field_a[2];
              var23.f(var9Lifetime5, var10Lifetime5 - (var23.height >> 1), 256);
              return;
            }
            if (DualLinkIterator.field_c != var6) {
              return;
            }
            var24 = df.field_a[1];
            var24.f(var9Lifetime5, -(var24.height >> 1) + var10Lifetime5, 256);
            return;
          }
          var25 = df.field_a[0];
          var11Lifetime5 = var25.canvasWidth << 1;
          var12Lifetime5 = var25.canvasHeight << 1;
          if (this.field_X == null) {
            this.field_X = new RgbSprite(var11Lifetime5, var12Lifetime5);
            IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
          } else {
            if (var11Lifetime5 > this.field_X.width) {
              this.field_X = new RgbSprite(var11Lifetime5, var12Lifetime5);
              IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
            } else {
              if (this.field_X.height >= var12Lifetime5) {
                IndexedSpriteGeometry.pushSpriteRaster(-70, this.field_X);
                Rasterizer2D.clear();
              } else {
                this.field_X = new RgbSprite(var11Lifetime5, var12Lifetime5);
                IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
              }
            }
          }
          var25.a(112, 144, var25.canvasWidth << 4, var25.canvasHeight << 4, -this.field_Q << 10, 4096);
          sc.popRaster(-111);
          this.field_X.f(-(var25.canvasWidth >> 1) + var9Lifetime5, -var25.canvasHeight + var10Lifetime5, 256);
          return;
        }
        if (var6 == SaveResultsPromptScreen.field_z) {
          var26 = DropTargetWidget.field_G;
          if (!var26.equals(this.text)) {
            this.text = var26;
            this.rebuildHotspots(obfuscationGuard + 10);
            super.drawLayer(parentY, parentX, layer, obfuscationGuard);
            var6 = this.field_R.b((byte) -31);
            var27_ref = (WidgetLayoutProvider) ((Object) this.renderer);
            var9Lifetime1 = parentX + this.x;
            var10Lifetime1 = var27_ref.a(parentY, (byte) -107, (Widget) (this)) + (var27_ref.getTextLayout((Widget) (this), obfuscationGuard ^ 32).getHeight(0) >> 1);
            if (var6 != m.field_c &&
              var6 != SaveResultsPromptScreen.field_z) {
              if (lp.field_xb == var6) {
                var28 = df.field_a[2];
                var28.f(var9Lifetime1, var10Lifetime1 - (var28.height >> 1), 256);
                return;
              }
              if (DualLinkIterator.field_c != var6) {
                return;
              }
              var29 = df.field_a[1];
              var29.f(var9Lifetime1, -(var29.height >> 1) + var10Lifetime1, 256);
              return;
            }
            var30 = df.field_a[0];
            var11Lifetime1 = var30.canvasWidth << 1;
            var12Lifetime1 = var30.canvasHeight << 1;
            if (this.field_X != null &&
              var11Lifetime1 <= this.field_X.width &&
              this.field_X.height >= var12Lifetime1) {
              IndexedSpriteGeometry.pushSpriteRaster(-70, this.field_X);
              Rasterizer2D.clear();
            } else {
              this.field_X = new RgbSprite(var11Lifetime1, var12Lifetime1);
              IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
            }
            var30.a(112, 144, var30.canvasWidth << 4, var30.canvasHeight << 4, -this.field_Q << 10, 4096);
            sc.popRaster(-111);
            this.field_X.f(-(var30.canvasWidth >> 1) + var9Lifetime1, -var30.canvasHeight + var10Lifetime1, 256);
            return;
          }
          super.drawLayer(parentY, parentX, layer, obfuscationGuard);
          var6 = this.field_R.b((byte) -31);
          var31_ref = (WidgetLayoutProvider) ((Object) this.renderer);
          var9Lifetime1Lifetime1 = parentX + this.x;
          var10Lifetime1Lifetime1 = var31_ref.a(parentY, (byte) -107, (Widget) (this)) + (var31_ref.getTextLayout((Widget) (this), obfuscationGuard ^ 32).getHeight(0) >> 1);
          if (var6 != m.field_c &&
            var6 != SaveResultsPromptScreen.field_z) {
            if (lp.field_xb == var6) {
              var32 = df.field_a[2];
              var32.f(var9Lifetime1Lifetime1, var10Lifetime1Lifetime1 - (var32.height >> 1), 256);
              return;
            }
            if (DualLinkIterator.field_c != var6) {
              return;
            }
            var33 = df.field_a[1];
            var33.f(var9Lifetime1Lifetime1, -(var33.height >> 1) + var10Lifetime1Lifetime1, 256);
            return;
          }
          var34 = df.field_a[0];
          var11Lifetime1Lifetime1 = var34.canvasWidth << 1;
          var12Lifetime1Lifetime1 = var34.canvasHeight << 1;
          if (this.field_X == null) {
            this.field_X = new RgbSprite(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
            IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
          } else {
            if (var11Lifetime1Lifetime1 > this.field_X.width) {
              this.field_X = new RgbSprite(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
            } else {
              if (this.field_X.height >= var12Lifetime1Lifetime1) {
                IndexedSpriteGeometry.pushSpriteRaster(-70, this.field_X);
                Rasterizer2D.clear();
              } else {
                this.field_X = new RgbSprite(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
                IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
              }
            }
          }
          var34.a(112, 144, var34.canvasWidth << 4, var34.canvasHeight << 4, -this.field_Q << 10, 4096);
          sc.popRaster(-111);
          this.field_X.f(-(var34.canvasWidth >> 1) + var9Lifetime1Lifetime1, -var34.canvasHeight + var10Lifetime1Lifetime1, 256);
          return;
        }
        var5 = this.field_R.a(-118);
        if (var5 != null) {
          if (var5.equals(this.text)) {
            super.drawLayer(parentY, parentX, layer, obfuscationGuard);
            var6Lifetime1 = this.field_R.b((byte) -31);
            var50_ref = (WidgetLayoutProvider) ((Object) this.renderer);
            var9Lifetime2 = parentX + this.x;
            var10Lifetime2 = var50_ref.a(parentY, (byte) -107, (Widget) (this)) + (var50_ref.getTextLayout((Widget) (this), obfuscationGuard ^ 32).getHeight(0) >> 1);
            if (var6Lifetime1 != m.field_c &&
              var6Lifetime1 != SaveResultsPromptScreen.field_z) {
              if (lp.field_xb == var6Lifetime1) {
                var51 = df.field_a[2];
                var51.f(var9Lifetime2, var10Lifetime2 - (var51.height >> 1), 256);
                return;
              }
              if (DualLinkIterator.field_c != var6Lifetime1) {
                return;
              }
              var52 = df.field_a[1];
              var52.f(var9Lifetime2, -(var52.height >> 1) + var10Lifetime2, 256);
              return;
            }
            var53 = df.field_a[0];
            var11Lifetime2 = var53.canvasWidth << 1;
            var12Lifetime2 = var53.canvasHeight << 1;
            if (this.field_X != null &&
              var11Lifetime2 <= this.field_X.width &&
              this.field_X.height >= var12Lifetime2) {
              IndexedSpriteGeometry.pushSpriteRaster(-70, this.field_X);
              Rasterizer2D.clear();
            } else {
              this.field_X = new RgbSprite(var11Lifetime2, var12Lifetime2);
              IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
            }
            var53.a(112, 144, var53.canvasWidth << 4, var53.canvasHeight << 4, -this.field_Q << 10, 4096);
            sc.popRaster(-111);
            this.field_X.f(-(var53.canvasWidth >> 1) + var9Lifetime2, -var53.canvasHeight + var10Lifetime2, 256);
            return;
          }
          this.text = var5;
          this.rebuildHotspots(obfuscationGuard + 10);
          super.drawLayer(parentY, parentX, layer, obfuscationGuard);
          var6Lifetime1Lifetime1 = this.field_R.b((byte) -31);
          var44_ref = (WidgetLayoutProvider) ((Object) this.renderer);
          var9Lifetime2Lifetime1 = parentX + this.x;
          var10Lifetime2Lifetime1 = var44_ref.a(parentY, (byte) -107, (Widget) (this)) + (var44_ref.getTextLayout((Widget) (this), obfuscationGuard ^ 32).getHeight(0) >> 1);
          if (var6Lifetime1Lifetime1 != m.field_c &&
            var6Lifetime1Lifetime1 != SaveResultsPromptScreen.field_z) {
            if (lp.field_xb == var6Lifetime1Lifetime1) {
              var45 = df.field_a[2];
              var45.f(var9Lifetime2Lifetime1, var10Lifetime2Lifetime1 - (var45.height >> 1), 256);
              return;
            }
            if (DualLinkIterator.field_c != var6Lifetime1Lifetime1) {
              return;
            }
            var46 = df.field_a[1];
            var46.f(var9Lifetime2Lifetime1, -(var46.height >> 1) + var10Lifetime2Lifetime1, 256);
            return;
          }
          var47 = df.field_a[0];
          var16 = var47;
          var11Lifetime2Lifetime1 = var47.canvasWidth << 1;
          var12Lifetime2Lifetime1 = var47.canvasHeight << 1;
          if (this.field_X == null) {
            this.field_X = new RgbSprite(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
            IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
          } else {
            if (var11Lifetime2Lifetime1 > this.field_X.width) {
              this.field_X = new RgbSprite(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
              IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
            } else {
              if (this.field_X.height >= var12Lifetime2Lifetime1) {
                IndexedSpriteGeometry.pushSpriteRaster(-70, this.field_X);
                Rasterizer2D.clear();
              } else {
                this.field_X = new RgbSprite(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
                IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
              }
            }
          }
          var47.a(112, 144, var47.canvasWidth << 4, var47.canvasHeight << 4, -this.field_Q << 10, 4096);
          sc.popRaster(-111);
          this.field_X.f(-(var47.canvasWidth >> 1) + var9Lifetime2Lifetime1, -var47.canvasHeight + var10Lifetime2Lifetime1, 256);
          return;
        }
        var35 = this.field_S;
        var5Lifetime1 = var35;
        if (!var35.equals(this.text)) {
          this.text = var35;
          this.rebuildHotspots(obfuscationGuard + 10);
          super.drawLayer(parentY, parentX, layer, obfuscationGuard);
          var6Lifetime2 = this.field_R.b((byte) -31);
          var36_ref = (WidgetLayoutProvider) ((Object) this.renderer);
          var9Lifetime3 = parentX + this.x;
          var10Lifetime3 = var36_ref.a(parentY, (byte) -107, (Widget) (this)) + (var36_ref.getTextLayout((Widget) (this), obfuscationGuard ^ 32).getHeight(0) >> 1);
          if (var6Lifetime2 != m.field_c &&
            var6Lifetime2 != SaveResultsPromptScreen.field_z) {
            if (lp.field_xb == var6Lifetime2) {
              var37 = df.field_a[2];
              var37.f(var9Lifetime3, var10Lifetime3 - (var37.height >> 1), 256);
              return;
            }
            if (DualLinkIterator.field_c != var6Lifetime2) {
              return;
            }
            var38 = df.field_a[1];
            var38.f(var9Lifetime3, -(var38.height >> 1) + var10Lifetime3, 256);
            return;
          }
          var39 = df.field_a[0];
          var11Lifetime3 = var39.canvasWidth << 1;
          var12Lifetime3 = var39.canvasHeight << 1;
          if (this.field_X != null &&
            var11Lifetime3 <= this.field_X.width &&
            this.field_X.height >= var12Lifetime3) {
            IndexedSpriteGeometry.pushSpriteRaster(-70, this.field_X);
            Rasterizer2D.clear();
          } else {
            this.field_X = new RgbSprite(var11Lifetime3, var12Lifetime3);
            IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
          }
          var39.a(112, 144, var39.canvasWidth << 4, var39.canvasHeight << 4, -this.field_Q << 10, 4096);
          sc.popRaster(-111);
          this.field_X.f(-(var39.canvasWidth >> 1) + var9Lifetime3, -var39.canvasHeight + var10Lifetime3, 256);
          return;
        }
        super.drawLayer(parentY, parentX, layer, obfuscationGuard);
        var6Lifetime3 = this.field_R.b((byte) -31);
        var40_ref = (WidgetLayoutProvider) ((Object) this.renderer);
        var9Lifetime4 = parentX + this.x;
        var10Lifetime4 = var40_ref.a(parentY, (byte) -107, (Widget) (this)) + (var40_ref.getTextLayout((Widget) (this), obfuscationGuard ^ 32).getHeight(0) >> 1);
        if (var6Lifetime3 != m.field_c &&
          var6Lifetime3 != SaveResultsPromptScreen.field_z) {
          if (lp.field_xb == var6Lifetime3) {
            var41 = df.field_a[2];
            var41.f(var9Lifetime4, var10Lifetime4 - (var41.height >> 1), 256);
            return;
          }
          if (DualLinkIterator.field_c != var6Lifetime3) {
            return;
          }
          var42 = df.field_a[1];
          var42.f(var9Lifetime4, -(var42.height >> 1) + var10Lifetime4, 256);
          return;
        }
        var43 = df.field_a[0];
        var11Lifetime4 = var43.canvasWidth << 1;
        var12Lifetime4 = var43.canvasHeight << 1;
        if (this.field_X == null) {
          this.field_X = new RgbSprite(var11Lifetime4, var12Lifetime4);
          IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
        } else {
          if (var11Lifetime4 > this.field_X.width) {
            this.field_X = new RgbSprite(var11Lifetime4, var12Lifetime4);
            IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
          } else {
            if (this.field_X.height < var12Lifetime4) {
              this.field_X = new RgbSprite(var11Lifetime4, var12Lifetime4);
              IndexedSpriteGeometry.pushSpriteRaster(-86, this.field_X);
            } else {
              IndexedSpriteGeometry.pushSpriteRaster(-70, this.field_X);
              Rasterizer2D.clear();
            }
          }
        }
        var43.a(112, 144, var43.canvasWidth << 4, var43.canvasHeight << 4, -this.field_Q << 10, 4096);
        sc.popRaster(-111);
        this.field_X.f(-(var43.canvasWidth >> 1) + var9Lifetime4, -var43.canvasHeight + var10Lifetime4, 256);
        return;
    }

    final void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        try {
          this.field_Q = this.field_Q + 1;
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "nf.WA(" + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ',' + parentY + ')');
        }
    }

    static {
        field_V = false;
        field_T = "You have been removed from <%0>'s game.";
    }
}
