/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpecularGpuMaterialEffect extends GpuMaterialEffect {
    private boolean field_e;
    static int field_g;
    private boolean field_h;
    private GpuCubeTexture[] field_f;

    final void setParameters(int param0, int param1, int param2) {
        if (param2 != 5) {
          return;
        }
        if (this.field_e) {
          this.toolkit.setActiveTextureUnit(1, param2 ^ -112);
          this.toolkit.setTexture(this.field_f[-1 + param1], -116);
          this.toolkit.setActiveTextureUnit(0, -109);
        }
    }

    SpecularGpuMaterialEffect(GpuToolkit param0) {
        super(param0);
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        boolean stackIn_5_1 = false;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        this.field_e = false;
        try {
          if (param0.field_vb) {
            stackIn_5_1 = !(param0.field_L >= 3);
            this.field_h = stackIn_5_1;
            stackIn_8_0 = (!this.field_h) ? 127 : 48;
            var2_int = stackIn_8_0;
            var29 = new int[6][4096];
            var27 = new int[6][4096];
            var28 = new int[6][4096];
            var9 = 0;
            for (var14 = 0; var14 < 64; var14++) {
              for (var15 = 0; var15 < 64; var15++) {
                var12 = -1.0f + 2.0f * (float)var14 / 64.0f;
                var11 = -1.0f + 2.0f * (float)var15 / 64.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + 1.0f + var12 * var12)));
                var12 = var12 * var13;
                var11 = var11 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (0 != var16) {
                    if (var16 != 1) {
                      if (var16 == 2) {
                        var10 = var12;
                      } else {
                        if (3 != var16) {
                          if (4 == var16) {
                            var10 = var13;
                          } else {
                            var10 = -var13;
                          }
                        } else {
                          var10 = -var12;
                        }
                      }
                    } else {
                      var10 = var11;
                    }
                  } else {
                    var10 = -var11;
                  }
                  if (!(var10 > 0.0f)) {
                    var7 = 0;
                    var8 = 0;
                    var6 = 0;
                  } else {
                    var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                    var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                    var8 = (int)((double)var2_int * Math.pow((double)var10, 12.0));
                  }
                  var27[var16][var9] = var6 << 24;
                  var28[var16][var9] = var7 << 24;
                  var29[var16][var9] = var8 << 24;
                }
                var9++;
              }
            }
            this.field_f = new GpuCubeTexture[3];
            this.field_f[0] = this.toolkit.createCubeTexture(false, -5210, var27, 64);
            this.field_f[1] = this.toolkit.createCubeTexture(false, -5210, var28, 64);
            this.field_f[2] = this.toolkit.createCubeTexture(false, -5210, var29, 64);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("qr.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void applyRenderState(int param0, boolean param1) {
        if (param0 != 5) {
          GpuTexture var4 = (GpuTexture) null;
          this.setTexture((byte) -108, 75, (GpuTexture) null);
        }
        this.toolkit.setTextureCombineOperations(MissionVariable.field_c, true, OpenGlGlyphMask.field_a);
    }

    final void enable(int param0, boolean param1) {
        int var4;
        GpuTransform3D var5;
        var4 = VoidHunters.field_G;
        if (param0 != 5) {
          return;
        }
        if (null == this.field_f) {
          this.toolkit.setAlphaCombineSource(0, (byte) -113, GetArmageddonLength.field_q);
        } else {
          if (!param1) {
            this.toolkit.setAlphaCombineSource(0, (byte) -113, GetArmageddonLength.field_q);
          } else {
            this.toolkit.setActiveTextureUnit(1, -51);
            this.toolkit.setTextureCoordinateMode((byte) -111, tea.field_d);
            var5 = this.toolkit.getTextureTransform((byte) 8);
            var5.setRotationX((byte) -80, 1024);
            this.toolkit.setTextureTransformMode(LoadSettings.field_o, true);
            if (!this.field_h) {
              this.toolkit.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, MissionVariable.field_c);
              this.toolkit.setRgbCombineSource(0, SpriteTextureOperation.field_l, 7);
              this.toolkit.setActiveTextureUnit(2, -51);
              this.toolkit.setTextureCombineOperations(MissionVariable.field_c, true, GpuQuadBuffers.field_c);
              this.toolkit.setRgbCombineSource(0, SpriteTextureOperation.field_l, param0 ^ 2);
              this.toolkit.setRgbCombineSource(true, param0 ^ -21120, false, SpriteTextureOperation.field_l, 1);
              this.toolkit.setAlphaCombineSource(0, (byte) -86, GetArmageddonLength.field_q);
              this.toolkit.setTexture(this.toolkit.field_Q, param0 - 119);
            } else {
              this.toolkit.setTextureCombineOperations(MissionVariable.field_c, true, GpuQuadBuffers.field_c);
              this.toolkit.setRgbCombineSource(true, param0 - 21120, false, SetGrapplingHookMaxExtension8Force.field_q, 0);
              this.toolkit.setAlphaCombineSource(0, (byte) -96, GetArmageddonLength.field_q);
            }
            this.toolkit.setActiveTextureUnit(0, -100);
            this.field_e = true;
          }
        }
    }

    final void setTexture(byte param0, int param1, GpuTexture param2) {
        if (param0 <= 42) {
          return;
        }
        try {
          this.toolkit.setTexture(param2, -113);
          this.toolkit.setTextureCombineMode(-124, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qr.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void disable(int param0) {
        int var3;
        var3 = VoidHunters.field_G;
        if (!this.field_e) {
          this.toolkit.setAlphaCombineSource(0, (byte) -99, SetGrapplingHookMaxExtension8Force.field_q);
        } else {
          this.toolkit.setActiveTextureUnit(1, -114);
          this.toolkit.setTexture((GpuTexture) null, -123);
          this.toolkit.setTextureCoordinateMode((byte) -111, UnderlinedLinkRenderer.field_d);
          this.toolkit.resetTextureTransform((byte) 108);
          if (this.field_h) {
            this.toolkit.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, OpenGlGlyphMask.field_a);
            this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
            this.toolkit.setAlphaCombineSource(0, (byte) -92, SetGrapplingHookMaxExtension8Force.field_q);
          } else {
            this.toolkit.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, OpenGlGlyphMask.field_a);
            this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
            this.toolkit.setActiveTextureUnit(2, -90);
            this.toolkit.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, OpenGlGlyphMask.field_a);
            this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, param0 - 2536);
            this.toolkit.setRgbCombineSource(1, SpriteTextureOperation.field_l, 7);
            this.toolkit.setAlphaCombineSource(0, (byte) -105, SetGrapplingHookMaxExtension8Force.field_q);
            this.toolkit.setTexture((GpuTexture) null, -128);
          }
          this.toolkit.setActiveTextureUnit(0, -110);
          this.field_e = false;
        }
        if (param0 != 2543) {
          return;
        }
        this.toolkit.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, OpenGlGlyphMask.field_a);
    }

    final boolean isSupported(byte param0) {
        int var2 = -3 / ((34 - param0) / 63);
        return true;
    }

    static {
    }
}
