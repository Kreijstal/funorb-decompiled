/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuSprite extends ToolkitSprite {
    private boolean field_k;
    private GpuTexture2D texture;
    private int paddingLeft;
    static GameStateFactory field_c;
    private boolean field_j;
    private int paddingTop;
    static boolean field_e;
    private boolean field_b;
    private int height;
    private int paddingRight;
    private int width;
    private boolean field_i;
    private GpuToolkit toolkit;
    private int paddingBottom;
    private boolean field_a;

    final int getPaddedHeight() {
        return this.paddingTop + this.height + this.paddingBottom;
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        if (param0 > -79) {
          GpuSprite.clearSharedReferences(9);
        }
    }

    final void drawScaled(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        GpuTransform3D var10;
        GpuTransform3D var11;
        GpuTexture2D stackIn_4_0 = null;
        TextureFilterMode stackIn_6_1 = null;
        var11 = this.toolkit.getModelTransform(11);
        var10 = this.toolkit.getTextureTransform((byte) -119);
        stackIn_4_0 = this.texture;
        if (!this.field_j &&
          !this.field_i &&
          (1 & param7) != 0) {
          stackIn_6_1 = SoftwareFaceAttachmentState.field_a;
        } else {
          stackIn_6_1 = SetLagVariant.field_o;
        }
        ((GpuTexture2D) (Object) stackIn_4_0).setFilterMode(stackIn_6_1, -28798);
        this.toolkit.prepareSpriteDraw((byte) 111);
        this.toolkit.setTexture(this.texture, -109);
        this.toolkit.setBlendMode(124, param6);
        this.toolkit.setTextureCombineMode(-117, param4);
        this.toolkit.setRgbCombineSource(1, pea.field_d, 7);
        this.toolkit.setAlphaCombineSource(1, (byte) -97, pea.field_d);
        this.toolkit.setTextureConstantColor(-127, param5);
        var10.setScale(5557, this.texture.getU((float)this.width, -1080), this.texture.getV((float)this.height, 106), 1.0f);
        if (this.field_k) {
          param2 = this.width * param2 / this.getPaddedWidth();
          param3 = this.height * param3 / this.getPaddedHeight();
          param0 = param0 + this.paddingLeft * param2 / this.width;
          param1 = param1 + param3 * this.paddingTop / this.height;
        }
        var11.setScale(5557, (float)param2, (float)param3, 0.0f);
        var11.translate(param1, 16383, 0, param0);
        this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
        this.toolkit.markModelTransformChanged(20837);
        this.toolkit.drawUnitQuadTriangles((byte) -79);
        this.toolkit.resetTextureTransform((byte) 74);
        this.toolkit.setRgbCombineSource(1, SpriteTextureOperation.field_l, 7);
        this.toolkit.setAlphaCombineSource(1, (byte) -55, SpriteTextureOperation.field_l);
    }

    final static int swapTeamId(int param0, int param1) {
        if (param0 != 21957) {
          return -115;
        }
        if (param1 >= 0 &&
          param1 <= 1) {
          return -param1 + 1;
        }
        return param1;
    }

    final void draw(int param0, int param1, int param2, int param3, int param4) {
        GpuTransform3D var8 = this.toolkit.getModelTransform(11);
        GpuTransform3D var7 = this.toolkit.getTextureTransform((byte) 124);
        param1 = param1 + this.paddingTop;
        param0 = param0 + this.paddingLeft;
        this.texture.setFilterMode(SetLagVariant.field_o, -28798);
        this.toolkit.prepareSpriteDraw((byte) 111);
        this.toolkit.setTexture(this.texture, -123);
        this.toolkit.setBlendMode(121, param4);
        this.toolkit.setTextureCombineMode(107, param2);
        this.toolkit.setRgbCombineSource(1, pea.field_d, 7);
        this.toolkit.setAlphaCombineSource(1, (byte) -54, pea.field_d);
        this.toolkit.setTextureConstantColor(-127, param3);
        var8.setScale(5557, (float)this.width, (float)this.height, 0.0f);
        var8.translate(param1, 16383, 0, param0);
        var7.setScale(5557, this.texture.getU((float)this.width, -1080), this.texture.getV((float)this.height, 117), 1.0f);
        this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
        this.toolkit.markModelTransformChanged(20837);
        this.toolkit.drawUnitQuadTriangles((byte) -72);
        this.toolkit.resetTextureTransform((byte) 85);
        this.toolkit.setRgbCombineSource(1, SpriteTextureOperation.field_l, 7);
        this.toolkit.setAlphaCombineSource(1, (byte) -72, SpriteTextureOperation.field_l);
    }

    final int getPaddedWidth() {
        return this.paddingRight + (this.width + this.paddingLeft);
    }

    final void drawAffine(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        GpuTransform3D var12;
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var21;
        float var22;
        float var23;
        float var24;
        float var25;
        float var26;
        GpuTransform3D var27;
        GpuTexture2D stackIn_4_0 = null;
        TextureFilterMode stackIn_5_1 = null;
        var27 = this.toolkit.getModelTransform(11);
        var12 = this.toolkit.getTextureTransform((byte) 81);
        stackIn_4_0 = this.texture;
        if (!this.field_j &&
          !this.field_i &&
          (param9 & 1) != 0) {
          stackIn_5_1 = SoftwareFaceAttachmentState.field_a;
        } else {
          stackIn_5_1 = SetLagVariant.field_o;
        }
        ((GpuTexture2D) (Object) stackIn_4_0).setFilterMode(stackIn_5_1, -28798);
        this.toolkit.prepareSpriteDraw((byte) 111);
        this.toolkit.setTexture(this.texture, -122);
        this.toolkit.setBlendMode(54, param8);
        this.toolkit.setTextureCombineMode(13, param6);
        this.toolkit.setRgbCombineSource(1, pea.field_d, 7);
        this.toolkit.setAlphaCombineSource(1, (byte) -121, pea.field_d);
        this.toolkit.setTextureConstantColor(-126, param7);
        if (this.field_k) {
          var13 = (float)this.getPaddedWidth();
          var14 = (float)this.getPaddedHeight();
          var15 = (-param0 + param2) / var13;
          var16 = (param3 - param1) / var13;
          var17 = (-param0 + param4) / var14;
          var18 = (-param1 + param5) / var14;
          var19 = var17 * (float)this.paddingTop;
          var20 = var18 * (float)this.paddingTop;
          var21 = (float)this.paddingLeft * var15;
          var22 = var16 * (float)this.paddingLeft;
          var23 = (float)this.paddingRight * -var15;
          var24 = (float)this.paddingRight * -var16;
          var25 = (float)this.paddingBottom * -var17;
          param1 = var20 + (var22 + param1);
          param2 = param2 + var23 + var19;
          param3 = var24 + param3 + var20;
          param4 = var21 + param4 + var25;
          var26 = -var18 * (float)this.paddingBottom;
          param0 = var19 + (var21 + param0);
          param5 = var26 + (param5 + var22);
        }
        var27.setRotation(0.0f, 0.0f, (byte) 101, param2 - param0, 0.0f, 0.0f, -param1 + param5, param3 - param1, 1.0f, -param0 + param4);
        var27.translate(0.0f, param0, param1, (byte) 13);
        var12.setScale(5557, this.texture.getU((float)this.width, -1080), this.texture.getV((float)this.height, 110), 1.0f);
        this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
        this.toolkit.markModelTransformChanged(20837);
        this.toolkit.drawUnitQuadTriangles((byte) -102);
        this.toolkit.resetTextureTransform((byte) 72);
        this.toolkit.setRgbCombineSource(1, SpriteTextureOperation.field_l, 7);
        this.toolkit.setAlphaCombineSource(1, (byte) -123, SpriteTextureOperation.field_l);
    }

    final int getHeight() {
        return this.height;
    }

    final void drawTiled(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var17 = 0;
        GpuTransform3D var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var18;
        int var19;
        int var20;
        int var22;
        GpuTransform3D var23;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int var21;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        var22 = VoidHunters.field_G;
        var23 = this.toolkit.getModelTransform(11);
        var9 = this.toolkit.getTextureTransform((byte) -122);
        this.texture.setFilterMode(SetLagVariant.field_o, -28798);
        this.toolkit.prepareSpriteDraw((byte) 111);
        this.toolkit.setTexture(this.texture, -119);
        this.toolkit.setBlendMode(75, param6);
        this.toolkit.setTextureCombineMode(-124, param4);
        this.toolkit.setRgbCombineSource(1, pea.field_d, 7);
        this.toolkit.setAlphaCombineSource(1, (byte) -98, pea.field_d);
        this.toolkit.setTextureConstantColor(-123, param5);
        if (this.field_a &&
          0 == this.paddingTop &&
          this.paddingBottom == 0) {
          stackIn_5_0 = 1;
        } else {
          stackIn_5_0 = 0;
        }
        var10 = stackIn_5_0;
        if (this.field_b &&
          this.paddingLeft == 0 &&
          this.paddingRight == 0) {
          stackIn_10_0 = 1;
        } else {
          stackIn_10_0 = 0;
        }
        boolean decompiledFrameRemainder0 = true;
        var11 = stackIn_10_0;
        if ((var11 & var10) == 0) {
          if (var11 != 0) {
            var12 = param3 + param1;
            var13 = this.getPaddedHeight();
            var9.setScale(5557, this.texture.getU((float)param2, -1080), this.texture.getV((float)this.height, 91), 1.0f);
            this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
            var14 = param1 + this.paddingTop;
            for (var15 = var14 + this.height; var15 <= var12; var15 = var15 + var13) {
              var23.setScale(5557, (float)param2, (float)this.height, 0.0f);
              var23.translate(var14, 16383, 0, param0);
              this.toolkit.markModelTransformChanged(20837);
              this.toolkit.drawUnitQuadTriangles((byte) -87);
              var14 = var14 + var13;
            }
            if (var12 > var14) {
              var16 = var12 - var14;
              var9.setScale(5557, this.texture.getU((float)param2, -1080), this.texture.getV((float)var16, 90), 1.0f);
              this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
              var23.setScale(5557, (float)param2, (float)var16, 0.0f);
              var23.translate(var14, 16383, 0, param0);
              this.toolkit.markModelTransformChanged(20837);
              this.toolkit.drawUnitQuadTriangles((byte) -81);
            }
          } else if (var10 != 0) {
            var12 = param2 + param0;
            var13 = this.getPaddedWidth();
            var9.setScale(5557, this.texture.getU((float)this.width, -1080), this.texture.getV((float)param3, 75), 1.0f);
            this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
            var14 = this.paddingLeft + param0;
            var15 = this.width + var14;
            while (var12 >= var15) {
              var23.setScale(5557, (float)this.width, (float)param3, 0.0f);
              var23.translate(param1, 16383, 0, var14);
              this.toolkit.markModelTransformChanged(20837);
              this.toolkit.drawUnitQuadTriangles((byte) -91);
              var15 = var15 + var13;
              var14 = var14 + var13;
            }
            if (var12 > var14) {
              var16 = -var14 + var12;
              var9.setScale(5557, this.texture.getU((float)var16, -1080), this.texture.getV((float)param3, 121), 1.0f);
              this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
              var23.setScale(5557, (float)var16, (float)param3, 0.0f);
              var23.translate(param1, 16383, 0, var14);
              this.toolkit.markModelTransformChanged(20837);
              this.toolkit.drawUnitQuadTriangles((byte) -89);
            }
          } else {
            var12 = param1 + param3;
            var13 = param2 + param0;
            var14 = this.getPaddedWidth();
            var15 = this.getPaddedHeight();
            var16 = this.paddingTop + param1;
            for (var17 = this.height + var16; var17 <= var12; var17 = var17 + var15) {
              var9.setScale(5557, this.texture.getU((float)this.width, -1080), this.texture.getV((float)this.height, 107), 1.0f);
              this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
              var18 = param0 + this.paddingLeft;
              var19 = this.width + var18;
              while (var19 <= var13) {
                var23.setScale(5557, (float)this.width, (float)this.height, 0.0f);
                var23.translate(var16, 16383, 0, var18);
                this.toolkit.markModelTransformChanged(20837);
                var19 = var19 + var14;
                var18 = var18 + var14;
                this.toolkit.drawUnitQuadTriangles((byte) -82);
              }
              if (var13 > var18) {
                var20 = -var18 + var13;
                var9.setScale(5557, this.texture.getU((float)var20, -1080), this.texture.getV((float)this.height, 78), 1.0f);
                this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
                var23.setScale(5557, (float)var20, (float)this.height, 0.0f);
                var23.translate(var16, 16383, 0, var18);
                this.toolkit.markModelTransformChanged(20837);
                this.toolkit.drawUnitQuadTriangles((byte) -90);
              }
              var16 = var16 + var15;
            }
            if (var12 > var16) {
              var18Lifetime1 = -var16 + var12;
              var9.setScale(5557, this.texture.getU((float)this.width, -1080), this.texture.getV((float)var18Lifetime1, 104), 1.0f);
              this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
              var19Lifetime1 = this.paddingLeft + param0;
              for (var20Lifetime1 = var19Lifetime1 + this.width; var13 >= var20Lifetime1; var20Lifetime1 = var20Lifetime1 + var14) {
                var23.setScale(5557, (float)this.width, (float)var18Lifetime1, 0.0f);
                var23.translate(var16, 16383, 0, var19Lifetime1);
                this.toolkit.markModelTransformChanged(20837);
                var19Lifetime1 = var19Lifetime1 + var14;
                this.toolkit.drawUnitQuadTriangles((byte) -109);
              }
              if (var13 <= var19Lifetime1) {
                this.toolkit.resetTextureTransform((byte) 125);
                this.toolkit.setRgbCombineSource(1, SpriteTextureOperation.field_l, 7);
                this.toolkit.setAlphaCombineSource(1, (byte) -101, SpriteTextureOperation.field_l);
                decompiledFrameRemainder0 = false;
              }
              else {
                var21 = -var19Lifetime1 + var13;
                var9.setScale(5557, this.texture.getU((float)var21, -1080), this.texture.getV((float)var18Lifetime1, 92), 1.0f);
                this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
                var23.setScale(5557, (float)var21, (float)var18Lifetime1, 0.0f);
                var23.translate(var16, 16383, 0, var19Lifetime1);
                this.toolkit.markModelTransformChanged(20837);
                this.toolkit.drawUnitQuadTriangles((byte) -80);
              }
            }
          }
        } else {
          var9.setScale(5557, this.texture.getU((float)param2, -1080), this.texture.getV((float)param3, 88), 1.0f);
          var23.setScale(5557, (float)param2, (float)param3, 0.0f);
          var23.translate(param1, 16383, 0, param0);
          this.toolkit.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
          this.toolkit.markModelTransformChanged(20837);
          this.toolkit.drawUnitQuadTriangles((byte) -66);
        }
        if (decompiledFrameRemainder0) {
          this.toolkit.resetTextureTransform((byte) 125);
          this.toolkit.setRgbCombineSource(1, SpriteTextureOperation.field_l, 7);
          this.toolkit.setAlphaCombineSource(1, (byte) -101, SpriteTextureOperation.field_l);
        }

    }

    final static void a(byte param0, int param1) {
        IsaacPacketBuffer var2 = RequestNewestBlackboxRecording.field_p;
        var2.writeIsaacByte(24335, param1);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        if (param0 <= 93) {
          field_c = (GameStateFactory) null;
        }
        var2.writeByte(0, 2);
        var2.writeBytes(0, GetPlayerRepairTime.field_o, -1, GetPlayerRepairTime.field_o.length);
        var2.writeByte(0, Hardpoint.field_a);
        var2.writeByte(0, TutorialProgressState.field_d);
        var2.writeBytes(0, GetDebrisThrowable.field_p, -1, GetDebrisThrowable.field_p.length);
        var2.writeLengthByte(-var3 + var2.position, -129);
    }

    final void setPadding(int param0, int param1, int param2, int param3) {
        boolean stackIn_7_1 = false;
        this.paddingTop = param1;
        this.paddingLeft = param0;
        this.paddingBottom = param3;
        this.paddingRight = param2;
        stackIn_7_1 = (this.paddingLeft != 0) || (0 != this.paddingTop) || (0 != this.paddingRight) || (this.paddingBottom != 0);
        this.field_k = stackIn_7_1;
    }

    final int getWidth() {
        return this.width;
    }

    final void writePixels(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
          this.texture.updatePixels(param1, param3, param2, param5, param6, param4, param0, (byte) -101);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mjb.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    GpuSprite(GpuToolkit param0, int param1, int param2, boolean param3) {
        Object stackIn_3_0;
        GpuToolkit stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        TextureFormat stackIn_4_5 = null;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_14_1 = false;
        boolean stackIn_18_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.paddingTop = 0;
        this.field_k = false;
        this.paddingRight = 0;
        this.paddingLeft = 0;
        this.paddingBottom = 0;
        try {
          this.height = param2;
          this.width = param1;
          this.toolkit = param0;
          stackIn_3_0 = this;
          stackIn_3_1 = (GpuToolkit) (param0);
          stackIn_3_2 = 118;
          stackIn_3_3 = param1;
          stackIn_3_4 = param2;
          if (param3) {
            stackIn_4_5 = ComponentAttachmentPlan.field_d;
          } else {
            stackIn_4_5 = SetGrapplingHookFireForce.field_o;
          }
          this.texture = ((GpuToolkit) (Object) stackIn_3_1).createTexture2D(stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_4_5, GpuDataType.UNSIGNED_BYTE);
          this.texture.setRepeat(true, (byte) -98, true);
          stackIn_7_1 = (~param1 != ~this.texture.getWidth((byte) 113));
          this.field_j = stackIn_7_1;
          stackIn_10_1 = (param2 != this.texture.getHeight((byte) -55));
          this.field_i = stackIn_10_1;
          stackIn_14_1 = (!this.field_j) && (this.texture.usesNormalizedCoordinates(-127));
          this.field_b = stackIn_14_1;
          stackIn_18_1 = (!this.field_i) && (this.texture.usesNormalizedCoordinates(36));
          this.field_a = stackIn_18_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("mjb.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    GpuSprite(GpuToolkit param0, int param1, int param2, int[] param3, int param4, int param5) {
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_11_1 = false;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.paddingTop = 0;
        this.field_k = false;
        this.paddingRight = 0;
        this.paddingLeft = 0;
        this.paddingBottom = 0;
        try {
          this.height = param2;
          this.width = param1;
          this.toolkit = param0;
          this.texture = param0.createTexture2DFromPixels(param1, false, param3, param2, param5, true, param4);
          this.texture.setRepeat(true, (byte) -98, true);
          stackIn_4_1 = (param1 != this.texture.getWidth((byte) 113));
          this.field_j = stackIn_4_1;
          stackIn_7_1 = (~this.texture.getHeight((byte) -57) != ~param2);
          this.field_i = stackIn_7_1;
          stackIn_11_1 = (!this.field_j) && (this.texture.usesNormalizedCoordinates(-13));
          this.field_b = stackIn_11_1;
          stackIn_15_1 = (!this.field_i) && (this.texture.usesNormalizedCoordinates(-128));
          this.field_a = stackIn_15_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_19_0 = var7;
          stackIn_19_1 = new StringBuilder().append("mjb.<init>(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_e = false;
        field_c = (GameStateFactory) ((Object) new PartitionZoneListFactory());
    }
}
