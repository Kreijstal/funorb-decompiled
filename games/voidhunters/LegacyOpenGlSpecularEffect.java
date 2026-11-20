/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlSpecularEffect extends LegacyOpenGlMaterialEffect {
    private OpenGlCubeTexture[] specularMaps;
    static volatile int field_e;
    private boolean limitedTextureUnits;
    private OpenGlDisplayLists displayLists;
    private boolean active;

    final void enable(boolean param0, int param1) {
        if (param1 < 18) {
          this.active = true;
        }
        if (null != this.displayLists &&
          param0) {
          if (!this.limitedTextureUnits) {
            this.toolkit.setActiveTextureUnit(33984, 2);
            this.toolkit.bindTexture(64, this.toolkit.field_qb);
            this.toolkit.setActiveTextureUnit(33984, 0);
          }
          this.displayLists.callList(true, '\0');
          this.active = true;
        } else {
          this.toolkit.setAlphaCombineArgument(0, 770, 34168, 34184);
        }
    }

    final void setTexture(int param0, byte param1, OpenGlTexture param2) {
        try {
          if (param1 != 125) {
            field_e = -96;
          }
          this.toolkit.bindTexture(115, param2);
          this.toolkit.setTextureCombineMode(param1 ^ 125, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kv.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void disable(int param0) {
        if (!this.active) {
          this.toolkit.setAlphaCombineArgument(0, 770, 5890, 34184);
        } else {
          if (!this.limitedTextureUnits) {
            this.toolkit.setActiveTextureUnit(33984, 2);
            this.toolkit.bindTexture(62, (OpenGlTexture) null);
          }
          this.toolkit.setActiveTextureUnit(33984, 1);
          this.toolkit.bindTexture(param0 - 5852, (OpenGlTexture) null);
          this.toolkit.setActiveTextureUnit(33984, 0);
          this.displayLists.callList(true, '\001');
          this.active = false;
        }
        if (param0 != 5890) {
          return;
        }
        this.toolkit.setTextureCombineOperations(8448, 8448, false);
    }

    private final void buildDisplayLists(int param0) {
        int var3 = VoidHunters.field_G;
        this.displayLists = new OpenGlDisplayLists(this.toolkit, 2);
        this.displayLists.beginList(param0 ^ 14647, 0);
        this.toolkit.setActiveTextureUnit(param0 + 48651, 1);
        jaggl.OpenGL.glTexGeni(8192, 9472, 34065);
        jaggl.OpenGL.glTexGeni(8193, 9472, 34065);
        jaggl.OpenGL.glTexGeni(8194, 9472, 34065);
        jaggl.OpenGL.glEnable(3168);
        jaggl.OpenGL.glEnable(3169);
        jaggl.OpenGL.glEnable(3170);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRotatef(22.5f, 1.0f, 0.0f, 0.0f);
        jaggl.OpenGL.glMatrixMode(5888);
        if (!this.limitedTextureUnits) {
          this.toolkit.setTextureCombineOperations(7681, 8448, false);
          this.toolkit.setRgbCombineArgument(0, 34192, 768, 34168);
          this.toolkit.setActiveTextureUnit(33984, 2);
          this.toolkit.setTextureCombineOperations(260, 7681, false);
          this.toolkit.setRgbCombineArgument(0, param0 + 48859, 768, 34168);
          this.toolkit.setRgbCombineArgument(1, param0 ^ -48347, 770, 34168);
          this.toolkit.setAlphaCombineArgument(0, 770, 34167, 34184);
        } else {
          this.toolkit.setTextureCombineOperations(260, 7681, false);
          this.toolkit.setRgbCombineArgument(0, 34192, 770, 5890);
          this.toolkit.setAlphaCombineArgument(0, 770, 34167, 34184);
        }
        this.toolkit.setActiveTextureUnit(33984, 0);
        this.displayLists.endList(param0 + 19531);
        this.displayLists.beginList(-96, 1);
        if (param0 != -14667) {
          IsaacPacketBuffer var4 = (IsaacPacketBuffer) null;
          LegacyOpenGlSpecularEffect.readBoolean(true, (IsaacPacketBuffer) null);
        }
        this.toolkit.setActiveTextureUnit(param0 + 48651, 1);
        jaggl.OpenGL.glDisable(3168);
        jaggl.OpenGL.glDisable(3169);
        jaggl.OpenGL.glDisable(3170);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        if (!this.limitedTextureUnits) {
          this.toolkit.setTextureCombineOperations(8448, 8448, false);
          this.toolkit.setRgbCombineArgument(0, param0 + 48859, 768, 5890);
          this.toolkit.setActiveTextureUnit(param0 ^ -48523, 2);
          this.toolkit.setTextureCombineOperations(8448, 8448, false);
          this.toolkit.setRgbCombineArgument(0, param0 ^ -48347, 768, 5890);
          this.toolkit.setRgbCombineArgument(1, param0 ^ -48347, 768, 34168);
          this.toolkit.setAlphaCombineArgument(0, 770, 5890, 34184);
        } else {
          this.toolkit.setTextureCombineOperations(8448, 8448, false);
          this.toolkit.setRgbCombineArgument(0, 34192, 768, 5890);
          this.toolkit.setAlphaCombineArgument(0, 770, 5890, 34184);
        }
        this.toolkit.setActiveTextureUnit(param0 + 48651, 0);
        this.displayLists.endList(param0 + 19531);
    }

    final boolean isSupported(int param0) {
        if (param0 >= -87) {
          this.isSupported(8);
          return true;
        }
        return true;
    }

    final void applyRenderState(boolean param0, boolean param1) {
        if (!param0) {
          this.disable(53);
        }
        this.toolkit.setTextureCombineOperations(8448, 7681, false);
    }

    LegacyOpenGlSpecularEffect(OpenGlToolkit param0) {
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
        byte[][] var27 = null;
        byte[][] var28 = null;
        byte[][] var29 = null;
        this.active = false;
        try {
          if (param0.field_S) {
            stackIn_5_1 = !(param0.field_Dc >= 3);
            this.limitedTextureUnits = stackIn_5_1;
            stackIn_8_0 = (this.limitedTextureUnits) ? 48 : 127;
            var2_int = stackIn_8_0;
            var29 = new byte[6][4096];
            var27 = new byte[6][4096];
            var28 = new byte[6][4096];
            var9 = 0;
            for (var14 = 0; 64 > var14; var14++) {
              for (var15 = 0; 64 > var15; var15++) {
                var12 = 2.0f * (float)var14 / 64.0f - 1.0f;
                var11 = (float)var15 * 2.0f / 64.0f - 1.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + 1.0f + var12 * var12)));
                var12 = var12 * var13;
                var11 = var11 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (0 == var16) {
                    var10 = -var11;
                  } else {
                    if (var16 == 1) {
                      var10 = var11;
                    } else {
                      if (2 == var16) {
                        var10 = var12;
                      } else {
                        if (var16 == 3) {
                          var10 = -var12;
                        } else {
                          if (var16 == 4) {
                            var10 = var13;
                          } else {
                            var10 = -var13;
                          }
                        }
                      }
                    }
                  }
                  if (var10 > 0.0f) {
                    var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                    var7 = (int)((double)var2_int * Math.pow((double)var10, 36.0));
                    var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                  } else {
                    var8 = 0;
                    var7 = 0;
                    var6 = 0;
                  }
                  var27[var16][var9] = (byte)var6;
                  var28[var16][var9] = (byte)var7;
                  var29[var16][var9] = (byte)var8;
                }
                var9++;
              }
            }
            this.specularMaps = new OpenGlCubeTexture[3];
            this.specularMaps[0] = new OpenGlCubeTexture(this.toolkit, 6406, 64, false, var27, 6406);
            this.specularMaps[1] = new OpenGlCubeTexture(this.toolkit, 6406, 64, false, var28, 6406);
            this.specularMaps[2] = new OpenGlCubeTexture(this.toolkit, 6406, 64, false, var29, 6406);
            this.buildDisplayLists(-14667);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("kv.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void setParameters(int param0, int param1, int param2) {
        if (param1 != -25139) {
          return;
        }
        if (this.active) {
          this.toolkit.setActiveTextureUnit(param1 + 59123, 1);
          this.toolkit.bindTexture(65, this.specularMaps[-1 + param0]);
          this.toolkit.setActiveTextureUnit(param1 ^ -59123, 0);
        }
    }

    final static boolean readBoolean(boolean param0, IsaacPacketBuffer param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_e = -61;
          }
          stackIn_5_0 = (param1.readBits(0, 1) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("kv.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_e = -1;
    }
}
