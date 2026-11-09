/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlSpecularEffect extends LegacyOpenGlEffect {
    private boolean useTwoUnits;
    private LegacyOpenGlCubeTexture[] specularMaps;
    static ArchiveCatalog field_i;
    private LegacyOpenGlDisplayLists stateLists;
    private boolean active;
    static int[] field_h;

    final boolean isSupported(byte guard) {
        if (guard >= -64) {
          return true;
        }
        return true;
    }

    final void bindTexture(byte guard, int combineMode, LegacyOpenGlTexture texture) {
        try {
          this.toolkit.bindTexture(33, texture);
          this.toolkit.setTextureCombineMode(combineMode, true);
          if (guard != 35) {
            this.setParameters((byte) 46, 96, -43);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wt.A(" + guard + ',' + combineMode + ',' + (texture != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(int param0) {
        if (param0 != 8193) {
          field_h = (int[]) null;
        }
    }

    final void refreshState(int guard, boolean lighting) {
        this.toolkit.setTextureCombineOperations(20685, 7681, 8448);
        if (guard >= -30) {
          field_h = (int[]) null;
        }
    }

    private final void buildStateLists(int guard) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        this.stateLists = new LegacyOpenGlDisplayLists(this.toolkit, 2);
        this.stateLists.beginList(0, 4864);
        this.toolkit.setActiveTextureUnit(1, 98);
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
        if (!this.useTwoUnits) {
          this.toolkit.setTextureCombineOperations(20685, 8448, 7681);
          this.toolkit.b(34168, 768, 0, 30);
          this.toolkit.setActiveTextureUnit(2, 123);
          this.toolkit.setTextureCombineOperations(20685, 7681, 260);
          this.toolkit.b(34168, 768, 0, 4);
          this.toolkit.b(34168, 770, 1, 20);
          this.toolkit.a(125, 0, 34167, 770);
        } else {
          this.toolkit.setTextureCombineOperations(20685, 7681, 260);
          this.toolkit.b(5890, 770, 0, -20);
          this.toolkit.a(117, 0, 34167, 770);
        }
        this.toolkit.setActiveTextureUnit(0, 83);
        this.stateLists.endList(true);
        this.stateLists.beginList(1, 4864);
        if (guard > -116) {
          field_i = (ArchiveCatalog) null;
        }
        this.toolkit.setActiveTextureUnit(1, 102);
        jaggl.OpenGL.glDisable(3168);
        jaggl.OpenGL.glDisable(3169);
        jaggl.OpenGL.glDisable(3170);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        if (!this.useTwoUnits) {
          this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
          this.toolkit.b(5890, 768, 0, -120);
          this.toolkit.setActiveTextureUnit(2, 111);
          this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
          this.toolkit.b(5890, 768, 0, 20);
          this.toolkit.b(34168, 768, 1, -126);
          this.toolkit.a(114, 0, 5890, 770);
        } else {
          this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
          this.toolkit.b(5890, 768, 0, -118);
          this.toolkit.a(122, 0, 5890, 770);
        }
        this.toolkit.setActiveTextureUnit(0, 81);
        this.stateLists.endList(true);
    }

    LegacyOpenGlSpecularEffect(LegacyOpenGlGraphicsToolkit owner) {
        super(owner);
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
          if (owner.field_Ob) {
            stackIn_5_1 = !(owner.maxTextureUnits >= 3);
            this.useTwoUnits = stackIn_5_1;
            stackIn_8_0 = (this.useTwoUnits) ? 48 : 127;
            var2_int = stackIn_8_0;
            var29 = new byte[6][4096];
            var27 = new byte[6][4096];
            var28 = new byte[6][4096];
            var9 = 0;
            for (var14 = 0; 64 > var14; var14++) {
              for (var15 = 0; var15 < 64; var15++) {
                var12 = 2.0f * (float)var14 / 64.0f - 1.0f;
                var11 = -1.0f + 2.0f * (float)var15 / 64.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + 1.0f + var12 * var12)));
                var12 = var12 * var13;
                var11 = var11 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (var16 != 0) {
                    if (var16 == 1) {
                      var10 = var11;
                    } else {
                      if (var16 != 2) {
                        if (3 == var16) {
                          var10 = -var12;
                        } else {
                          if (var16 == 4) {
                            var10 = var13;
                          } else {
                            var10 = -var13;
                          }
                        }
                      } else {
                        var10 = var12;
                      }
                    }
                  } else {
                    var10 = -var11;
                  }
                  if (!(0.0f < var10)) {
                    var8 = 0;
                    var7 = 0;
                    var6 = 0;
                  } else {
                    var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                    var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                    var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                  }
                  var27[var16][var9] = (byte)var6;
                  var28[var16][var9] = (byte)var7;
                  var29[var16][var9] = (byte)var8;
                }
                var9++;
              }
            }
            this.specularMaps = new LegacyOpenGlCubeTexture[3];
            this.specularMaps[0] = new LegacyOpenGlCubeTexture(this.toolkit, 6406, 64, false, var27, 6406);
            this.specularMaps[1] = new LegacyOpenGlCubeTexture(this.toolkit, 6406, 64, false, var28, 6406);
            this.specularMaps[2] = new LegacyOpenGlCubeTexture(this.toolkit, 6406, 64, false, var29, 6406);
            this.buildStateLists(-125);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("wt.<init>(");
          if (owner == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 > -17) {
          return;
        }
        field_i = null;
        field_h = null;
    }

    final void disable(int guard) {
        if (this.active) {
          if (!this.useTwoUnits) {
            this.toolkit.setActiveTextureUnit(2, 124);
            this.toolkit.bindTexture(39, (LegacyOpenGlTexture) null);
          }
          this.toolkit.setActiveTextureUnit(1, 91);
          this.toolkit.bindTexture(59, (LegacyOpenGlTexture) null);
          this.toolkit.setActiveTextureUnit(0, 92);
          this.stateLists.callList((byte) 121, '\001');
          this.active = false;
        } else {
          this.toolkit.a(118, 0, 5890, 770);
        }
        this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
        if (guard > -125) {
          this.specularMaps = (LegacyOpenGlCubeTexture[]) null;
        }
    }

    final void enable(byte guard, boolean lighting) {
        if (guard <= 33) {
          LegacyOpenGlSpecularEffect.c(-77);
        }
        if (this.stateLists != null &&
          lighting) {
          if (!this.useTwoUnits) {
            this.toolkit.setActiveTextureUnit(2, 89);
            this.toolkit.bindTexture(101, this.toolkit.field_n);
            this.toolkit.setActiveTextureUnit(0, 105);
          }
          this.stateLists.callList((byte) 121, '\0');
          this.active = true;
        } else {
          this.toolkit.a(124, 0, 34168, 770);
        }
    }

    final static void a(int param0, byte param1) {
        AffineTransform3D.crossfadeMusicTrack(8, (byte) -55, TimedSceneEffect.field_m[param0], true);
        if (param1 < 27) {
          field_i = (ArchiveCatalog) null;
        }
    }

    final void setParameters(byte guard, int parameters0, int parameters1) {
        if (this.active) {
          this.toolkit.setActiveTextureUnit(1, 122);
          this.toolkit.bindTexture(107, this.specularMaps[parameters0 - 1]);
          this.toolkit.setActiveTextureUnit(0, 95);
        }
        if (guard < 39) {
          LegacyOpenGlSpecularEffect.c(-83);
        }
    }

    static {
        field_h = new int[]{1, 1, 1};
    }
}
