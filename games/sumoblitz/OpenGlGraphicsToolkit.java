/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlGraphicsToolkit extends HardwareGraphicsToolkit {
    private jaggl.OpenGL field_Yc;
    private IntrusiveDeque field_Kc;
    private IntrusiveDeque field_Gc;
    private IntrusiveDeque field_Zc;
    private IntrusiveDeque field_Xc;
    private IntrusiveDeque field_Vc;
    private IntrusiveDeque field_Pc;
    private IntrusiveDeque field_Fc;
    private boolean field_Dc;
    private boolean field_Lc;
    private OpenGlVertexBuffer[] field_zc;
    jaggl.MapBuffer field_Qc;
    private int field_ad;
    private long field_Cc;
    private boolean field_Sc;
    private boolean field_Tc;
    private boolean field_Uc;
    jaggl.MapBuffer field_Bc;
    int[] field_Hc;
    boolean field_Jc;
    private boolean field_bd;
    int field_Ec;
    boolean field_Nc;
    private boolean field_Ic;
    boolean field_Mc;
    private String field_Rc;
    boolean field_Ac;
    private String field_Wc;
    private int field_Oc;

    final void applyPointLights(int guard) {
        PointLight var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var2 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        this.resetModelTransform(1);
        for (var2 = 0; this.pendingPointLightCount > var2; var2++) {
          var3 = this.pointLights[var2];
          var4 = var3.color((byte) 50);
          var5 = 16386 + var2;
          var6 = var3.intensity(0) / 255.0f;
          NetworkResourceRequest.field_v[0] = (float)var3.getX((byte) 97);
          NetworkResourceRequest.field_v[1] = (float)var3.getY((byte) 109);
          NetworkResourceRequest.field_v[2] = (float)var3.getZ(true);
          NetworkResourceRequest.field_v[3] = 1.0f;
          jaggl.OpenGL.glLightfv(var5, 4611, NetworkResourceRequest.field_v, 0);
          NetworkResourceRequest.field_v[0] = var6 * (float)LegacyOpenGlPostProcessManager.bitwiseAnd(var4 >> 16, 255);
          NetworkResourceRequest.field_v[3] = 1.0f;
          NetworkResourceRequest.field_v[1] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(var4 >> 8, 255) * var6;
          NetworkResourceRequest.field_v[2] = var6 * (float)LegacyOpenGlPostProcessManager.bitwiseAnd(255, var4);
          jaggl.OpenGL.glLightfv(var5, 4609, NetworkResourceRequest.field_v, 0);
          jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.radius(0) * var3.radius(0)));
          jaggl.OpenGL.glEnable(var5);
        }
        while (var2 < this.previousPointLightCount) {
          jaggl.OpenGL.glDisable(16386 + var2);
          var2++;
        }
        if (guard >= -83) {
          this.field_Ac = true;
        }
        super.applyPointLights(-120);
    }

    final Object a(java.awt.Canvas param0, int param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        TextureFormat var5 = null;
        Long stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_long = this.field_Yc.prepareSurface(param0);
          if (param1 != 3) {
            var5 = (TextureFormat) null;
            this.a((GpuDataType) null, (TextureFormat) null, -119, -113, (byte) -97);
          }
          if (var3_long == -1L) {
            throw new RuntimeException();
          }
          stackIn_6_0 = new Long(var3_long);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("on.EA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setColorCombineSource(byte guard, int argument, boolean useAlpha, boolean invert, TextureCombineSource source) {
        int var6_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          jaggl.OpenGL.glTexEnvi(8960, 34176 + argument, FullscreenMembershipDialog.glTextureCombineSource(81, source));
          var6_int = 45 / ((16 - guard) / 56);
          if (!useAlpha) {
            stackIn_7_0 = 8960;
            stackIn_7_1 = argument + 34192;
            if (invert) {
              stackIn_8_2 = 769;
            } else {
              stackIn_8_2 = 768;
            }
            jaggl.OpenGL.glTexEnvi(stackIn_7_0, stackIn_7_1, stackIn_8_2);
          } else {
            stackIn_3_0 = 8960;
            stackIn_3_1 = argument + 34192;
            if (!invert) {
              stackIn_4_2 = 770;
            } else {
              stackIn_4_2 = 771;
            }
            jaggl.OpenGL.glTexEnvi(stackIn_3_0, stackIn_3_1, stackIn_4_2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("on.ED(").append(guard).append(',').append(argument).append(',').append(useAlpha).append(',').append(invert).append(',');
          if (source == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void applyDirectionalLightColors(int arrayOffset) {
        NetworkResourceRequest.field_v[3] = 1.0f;
        NetworkResourceRequest.field_v[1] = this.field_jb * this.field_S;
        NetworkResourceRequest.field_v[0] = this.field_S * this.field_J;
        NetworkResourceRequest.field_v[2] = this.field_Xb * this.field_S;
        jaggl.OpenGL.glLightfv(16384, 4609, NetworkResourceRequest.field_v, 0);
        NetworkResourceRequest.field_v[3] = 1.0f;
        NetworkResourceRequest.field_v[1] = -this.field_hb * this.field_jb;
        NetworkResourceRequest.field_v[0] = this.field_J * -this.field_hb;
        NetworkResourceRequest.field_v[2] = this.field_Xb * -this.field_hb;
        jaggl.OpenGL.glLightfv(16385, 4609, NetworkResourceRequest.field_v, arrayOffset);
    }

    final void applyAlphaCombineOperation(int guard) {
        jaggl.OpenGL.glTexEnvi(8960, 34162, ShaderEffect.glTextureCombineOperation(-9267, this.field_B[this.activeTextureUnit]));
        if (guard >= -80) {
          this.b(true);
        }
    }

    final synchronized void a(int param0, long param1) {
        IntrusiveNode var4 = new IntrusiveNode();
        if (param0 != 33984) {
          int[] var5 = (int[]) null;
          this.drawPixels(-105, -54, 124, -38, (int[]) null, -85, -29);
        }
        var4.key = param1;
        this.field_Fc.addLast(var4, (byte) 39);
    }

    final void applyFogEnabled(byte guard) {
        if (this.fogEnabled &&
          this.fogAllowed &&
          this.field_Kb >= 0) {
          jaggl.OpenGL.glEnable(2912);
        } else {
          jaggl.OpenGL.glDisable(2912);
        }
        if (guard != -119) {
          this.field_Uc = true;
        }
    }

    final synchronized void updateTime(int timeMillis) {
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        int var2;
        int var4;
        IntNode var5;
        IntNode var6;
        IntNode var7;
        IntNode var8;
        IntNode var9;
        IntrusiveNode var10;
        IntrusiveNode var11;
        IntNode var12;
        var4 = Sumoblitz.field_L ? 1 : 0;
        timeMillis = timeMillis & 2147483647;
        var2 = 0;
        while (!this.field_Gc.isEmpty((byte) -100)) {
          var5 = (IntNode) (this.field_Gc.removeFirst(9));
          incrementValue$5 = var2;
          var2++;
          SceneryParticle.field_A[incrementValue$5] = (int)var5.key;
          this.field_o = this.field_o - var5.value;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteBuffersARB(var2, SceneryParticle.field_A, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteBuffersARB(var2, SceneryParticle.field_A, 0);
          var2 = 0;
        }
        while (!this.field_Zc.isEmpty((byte) -105)) {
          var6 = (IntNode) (this.field_Zc.removeFirst(9));
          incrementValue$4 = var2;
          var2++;
          SceneryParticle.field_A[incrementValue$4] = (int)var6.key;
          this.field_Cb = this.field_Cb - var6.value;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteTextures(var2, SceneryParticle.field_A, 0);
          var2 = 0;
        }
        if (var2 <= 0) {
          while (!this.field_Xc.isEmpty((byte) -73)) {
            var7 = (IntNode) (this.field_Xc.removeFirst(9));
            incrementValue$1 = var2;
            var2++;
            SceneryParticle.field_A[incrementValue$1] = var7.value;
            if (1000 != var2) {
              continue;
            }
            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, SceneryParticle.field_A, 0);
            var2 = 0;
          }
        } else {
          jaggl.OpenGL.glDeleteTextures(var2, SceneryParticle.field_A, 0);
          var2 = 0;
          while (!this.field_Xc.isEmpty((byte) -73)) {
            var7 = (IntNode) (this.field_Xc.removeFirst(9));
            incrementValue$0 = var2;
            var2++;
            SceneryParticle.field_A[incrementValue$0] = var7.value;
            if (1000 != var2) {
              continue;
            }
            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, SceneryParticle.field_A, 0);
            var2 = 0;
          }
        }
        if (var2 <= 0) {
          while (!this.field_Vc.isEmpty((byte) -123)) {
            var8 = (IntNode) (this.field_Vc.removeFirst(9));
            incrementValue$3 = var2;
            var2++;
            SceneryParticle.field_A[incrementValue$3] = (int)var8.key;
            this.field_pc = this.field_pc - var8.value;
            if (var2 != 1000) {
              continue;
            }
            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, SceneryParticle.field_A, 0);
            var2 = 0;
          }
        } else {
          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, SceneryParticle.field_A, 0);
          var2 = 0;
          while (!this.field_Vc.isEmpty((byte) -123)) {
            var8 = (IntNode) (this.field_Vc.removeFirst(9));
            incrementValue$2 = var2;
            var2++;
            SceneryParticle.field_A[incrementValue$2] = (int)var8.key;
            this.field_pc = this.field_pc - var8.value;
            if (var2 != 1000) {
              continue;
            }
            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, SceneryParticle.field_A, 0);
            var2 = 0;
          }
        }
        if (var2 <= 0) {
          while (!this.field_Kc.isEmpty((byte) -88)) {
            var9 = (IntNode) (this.field_Kc.removeFirst(9));
            jaggl.OpenGL.glDeleteLists((int)var9.key, var9.value);
          }
          while (!this.field_Pc.isEmpty((byte) -68)) {
            var10 = this.field_Pc.removeFirst(9);
            jaggl.OpenGL.glDeleteProgramARB((int)var10.key);
          }
          while (!this.field_Fc.isEmpty((byte) -95)) {
            var11 = this.field_Fc.removeFirst(9);
            jaggl.OpenGL.glDeleteObjectARB(var11.key);
          }
          while (!this.field_Kc.isEmpty((byte) -68)) {
            var12 = (IntNode) (this.field_Kc.removeFirst(9));
            jaggl.OpenGL.glDeleteLists((int)var12.key, var12.value);
          }
          if (!(this.estimatedResourceBytes(64) <= 100663296) &&
            !(IntroMeshResources.monotonicTimeMillis(-117) <= 60000L + this.field_Cc)) {
            System.gc();
            this.field_Cc = IntroMeshResources.monotonicTimeMillis(-39);
          }
        } else {
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, SceneryParticle.field_A, 0);
          var2 = 0;
          while (!this.field_Kc.isEmpty((byte) -88)) {
            var9 = (IntNode) (this.field_Kc.removeFirst(9));
            jaggl.OpenGL.glDeleteLists((int)var9.key, var9.value);
          }
          while (!this.field_Pc.isEmpty((byte) -68)) {
            var10 = this.field_Pc.removeFirst(9);
            jaggl.OpenGL.glDeleteProgramARB((int)var10.key);
          }
          while (!this.field_Fc.isEmpty((byte) -95)) {
            var11 = this.field_Fc.removeFirst(9);
            jaggl.OpenGL.glDeleteObjectARB(var11.key);
          }
          while (!this.field_Kc.isEmpty((byte) -68)) {
            var12 = (IntNode) (this.field_Kc.removeFirst(9));
            jaggl.OpenGL.glDeleteLists((int)var12.key, var12.value);
          }
          if (!(this.estimatedResourceBytes(64) <= 100663296) &&
            !(IntroMeshResources.monotonicTimeMillis(-117) <= 60000L + this.field_Cc)) {
            System.gc();
            this.field_Cc = IntroMeshResources.monotonicTimeMillis(-39);
          }
        }
        super.updateTime(timeMillis);
    }

    final Texture2D a(int param0, int param1, boolean param2, int param3, float[] param4, int param5, byte param6, TextureFormat param7) {
        RuntimeException var9 = null;
        OpenGlTexture2D var10 = null;
        OpenGlTexture2D stackIn_7_0 = null;
        OpenGlRectangleTexture stackIn_10_0 = null;
        OpenGlTexture2D stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 > -61) {
            this.setMultisampling(66, false);
          }
          if (!this.field_Ic && (!IntegerMath.isSingleBitOrZero(param1, -116) ||
            !IntegerMath.isSingleBitOrZero(param5, -122))) {
            if (this.field_bd) {
              stackIn_10_0 = new OpenGlRectangleTexture(this, param7, param1, param5, param4, param0, param3);
              return (Texture2D) ((Object) stackIn_10_0);
            }
            var10 = new OpenGlTexture2D(this, param7, GpuDataType.FLOAT, LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param1), LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param5));
            var10.uploadFloats(0, param7, param5, 0, 14137, param0, param1, param4, param3);
            stackIn_12_0 = var10;
            return (Texture2D) ((Object) stackIn_12_0);
          }
          stackIn_7_0 = new OpenGlTexture2D(this, param7, param1, param5, param2, param4, param0, param3);
          return (Texture2D) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_15_0 = var9;
          stackIn_15_1 = new StringBuilder().append("on.SC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        this.field_Tb = (float)(-this.field_Nb + this.field_Yb);
        this.field_E = this.field_Tb - (float)this.field_Kb;
        if (this.field_E < (float)this.field_oc) {
          this.field_E = (float)this.field_oc;
        }
        jaggl.OpenGL.glFogf(2915, this.field_E);
        jaggl.OpenGL.glFogf(2916, this.field_Tb);
        NetworkResourceRequest.field_v[1] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(65280, this.field_C) / 65280.0f;
        if (!param0) {
          return;
        }
        NetworkResourceRequest.field_v[2] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(255, this.field_C) / 255.0f;
        NetworkResourceRequest.field_v[0] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(this.field_C, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, NetworkResourceRequest.field_v, 0);
    }

    final void clear(int color) {
        jaggl.OpenGL.glClearColor((float)(16711680 & color) / 16711680.0f, (float)(color & 65280) / 65280.0f, (float)(color & 255) / 255.0f, (float)(color >>> 24) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final void applyViewport(int guard) {
        if (guard != 0) {
          PrimitiveType var3 = (PrimitiveType) null;
          this.drawPrimitives(-111, -93, -40, (PrimitiveType) null);
        }
        jaggl.OpenGL.glViewport(this.field_r, this.field_y, this.field_rb, this.field_Sb);
    }

    final boolean a(byte param0, GpuDataType param1, TextureFormat param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -85 / ((70 - param0) / 42);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("on.HC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void setMultisampling(int guard, boolean enabled) {
        if (!enabled) {
          jaggl.OpenGL.glDisable(32925);
        } else {
          jaggl.OpenGL.glEnable(32925);
        }
        if (guard != 1) {
          byte[] var4 = (byte[]) null;
          this.a((TextureFormat) null, -18, -125, 65, (byte[]) null, (byte) -115, -5, true);
        }
    }

    final void applyDirectionalLightsEnabled(int guard) {
        if (guard != 0) {
          this.field_Ic = false;
        }
        if (!this.field_Z) {
          jaggl.OpenGL.glDisable(16384);
          jaggl.OpenGL.glDisable(16385);
        } else {
          jaggl.OpenGL.glEnable(16384);
          jaggl.OpenGL.glEnable(16385);
        }
    }

    final void bindVertexLayout(int guard, VertexLayout layout) {
        int var16 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_24_0 = 0;
        boolean stackIn_31_1 = false;
        int stackIn_35_0 = 0;
        int stackIn_38_1 = 0;
        boolean stackIn_45_1 = false;
        boolean stackIn_53_1 = false;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        VertexStreamLayout var10 = null;
        OpenGlVertexBuffer var11 = null;
        int var12 = 0;
        int var13 = 0;
        long var14 = 0L;
        VertexAttribute var17 = null;
        int var18 = 0;
        VertexStreamLayout[] var19 = null;
        int var9Lifetime1;
        int var9Lifetime2;
        var18 = Sumoblitz.field_L ? 1 : 0;
        try {
          var19 = ((OpenGlVertexLayout) (layout)).streams;
          var4 = 0;
          var6 = 82 / ((guard - 71) / 45);
          var5 = 0;
          var7 = 0;
          var8 = 0;
          for (var9 = 0; var9 < var19.length; var9++) {
            var10 = var19[var9];
            var11 = this.field_zc[var9];
            var12 = 0;
            var13 = var11.stride(34962);
            var14 = var11.clientAddress(-24168);
            var11.bind(1175993800);
            for (var16 = 0; var10.attributeCount(44115) > var16; var16++) {
              var17 = var10.attribute(-80, var16);
              if (var17 == VertexAttribute.POSITION) {
                jaggl.OpenGL.glVertexPointer(3, 5126, var13, var14 + (long)var12);
                var8 = 1;
              } else {
                if (VertexAttribute.NORMAL == var17) {
                  var7 = 1;
                  jaggl.OpenGL.glNormalPointer(5126, var13, (long)var12 + var14);
                } else {
                  if (var17 != VertexAttribute.COLOR) {
                    if (VertexAttribute.TEXCOORD1 == var17) {
                      incrementValue$0 = var4;
                      var4++;
                      jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$0);
                      jaggl.OpenGL.glTexCoordPointer(1, 5126, var13, var14 + (long)var12);
                    } else {
                      if (var17 == VertexAttribute.TEXCOORD2) {
                        incrementValue$1 = var4;
                        var4++;
                        jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$1);
                        jaggl.OpenGL.glTexCoordPointer(2, 5126, var13, var14 + (long)var12);
                      } else {
                        if (VertexAttribute.TEXCOORD3 != var17) {
                          if (var17 == VertexAttribute.TEXCOORD4) {
                            incrementValue$2 = var4;
                            var4++;
                            jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$2);
                            jaggl.OpenGL.glTexCoordPointer(4, 5126, var13, (long)var12 + var14);
                          }
                        } else {
                          incrementValue$3 = var4;
                          var4++;
                          jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$3);
                          jaggl.OpenGL.glTexCoordPointer(3, 5126, var13, var14 + (long)var12);
                        }
                      }
                    }
                  } else {
                    jaggl.OpenGL.glColorPointer(4, 5121, var13, var14 + (long)var12);
                    var5 = 1;
                  }
                }
              }
              var12 = var12 + var17.sizeBytes;
            }
          }
          stackIn_24_0 = (this.field_Lc) ? 0 : 1;
          if (stackIn_24_0 == var8) {
            if (var8 != 0) {
              jaggl.OpenGL.glEnableClientState(32884);
            } else {
              jaggl.OpenGL.glDisableClientState(32884);
            }
            stackIn_31_1 = (var8 != 0);
            this.field_Lc = stackIn_31_1;
          }
          stackIn_35_0 = (var7 != 0) ? 0 : 1;
          if (this.field_Sc) {
            stackIn_38_1 = 0;
          } else {
            stackIn_38_1 = 1;
          }
          if (stackIn_35_0 != stackIn_38_1) {
            if (var7 == 0) {
              jaggl.OpenGL.glDisableClientState(32885);
            } else {
              jaggl.OpenGL.glEnableClientState(32885);
            }
            stackIn_45_1 = (var7 != 0);
            this.field_Sc = stackIn_45_1;
          }
          if (var5 != (this.field_Tc ? 1 : 0)) {
            if (var5 != 0) {
              jaggl.OpenGL.glEnableClientState(32886);
            } else {
              jaggl.OpenGL.glDisableClientState(32886);
            }
            stackIn_53_1 = (var5 != 0);
            this.field_Tc = stackIn_53_1;
          }
          if (this.field_ad < var4) {
            for (var9Lifetime1 = this.field_ad; var4 > var9Lifetime1; var9Lifetime1++) {
              jaggl.OpenGL.glClientActiveTexture(var9Lifetime1 + 33984);
              jaggl.OpenGL.glEnableClientState(32888);
            }
            this.field_ad = var4;
            return;
          }
          if (var4 < this.field_ad) {
            for (var9Lifetime2 = var4; var9Lifetime2 < this.field_ad; var9Lifetime2++) {
              jaggl.OpenGL.glClientActiveTexture(var9Lifetime2 + 33984);
              jaggl.OpenGL.glDisableClientState(32888);
            }
            this.field_ad = var4;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_68_0 = var3;
          stackIn_68_1 = new StringBuilder().append("on.AE(").append(guard).append(',');
          if (layout == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
        }
    }

    final void applyColorCombineOperation(byte guard) {
        if (guard >= -74) {
          this.field_ad = 99;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, ShaderEffect.glTextureCombineOperation(-9267, this.field_K[this.activeTextureUnit]));
    }

    final void restoreCanvasTarget() {
    }

    final void drawPixels(int x, int y, int width, int height, int[] pixels, int offset, int stride) {
        try {
          this.L(-25);
          this.a((GpuTexture) null, 126);
          this.setBlendMode(0, 13);
          this.resetModelTransform(1);
          jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
          jaggl.OpenGL.glRasterPos2i(x, y);
          jaggl.OpenGL.glDrawPixelsi(width, height, 32993, this.field_Ec, pixels, offset);
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "on.SA(" + x + ',' + y + ',' + width + ',' + height + ',' + (pixels != null ? "{...}" : "null") + ',' + offset + ',' + stride + ')');
        }
    }

    final boolean a() {
        return false;
    }

    final void applyTextureMatrix(int guard) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (guard != 26803) {
          this.field_Zc = (IntrusiveDeque) null;
        }
        if (HotspotTextWidget.TEXTURE_TRANSFORM_DISABLED != this.textureTransformModes[this.activeTextureUnit]) {
          jaggl.OpenGL.glLoadMatrixf(this.textureTransforms[this.activeTextureUnit].writeColumnMajor4x4(-107, StripedProgressWidget.field_y), 0);
        } else {
          jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void bindRenderTarget(RenderTarget target) {
    }

    final CubeTexture a(int param0, byte param1, int[][] param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        OpenGlCubeTexture stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 57 % ((-23 - param1) / 48);
          stackIn_1_0 = new OpenGlCubeTexture(this, param0, param3, param2);
          return (CubeTexture) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("on.SD(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(')').toString());
        }
    }

    OpenGlGraphicsToolkit(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, TextureProvider param3, ResourceArchive param4, int param5) {
        super(param1, new Long(param2), param3, param4, param5, 1);
        int var15 = 0;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Throwable var8 = null;
        RuntimeException var8_ref = null;
        String[] var9 = null;
        int var10_int = 0;
        NumberFormatException var10 = null;
        int var11_int = 0;
        Throwable var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        String var16 = null;
        Exception var17 = null;
        String var20 = null;
        String var21 = null;
        int[] var26 = null;
        int[] var27 = null;
        Object var28 = null;
        Object var29 = null;
        Object var30 = null;
        CharSequence var31 = null;
        CharSequence var32 = null;
        CharSequence var33 = null;
        var28 = null;
        var29 = null;
        var30 = null;
        this.field_Kc = new IntrusiveDeque();
        this.field_Gc = new IntrusiveDeque();
        this.field_Zc = new IntrusiveDeque();
        this.field_Xc = new IntrusiveDeque();
        this.field_Vc = new IntrusiveDeque();
        this.field_Pc = new IntrusiveDeque();
        this.field_Fc = new IntrusiveDeque();
        this.field_zc = new OpenGlVertexBuffer[16];
        this.field_Qc = new jaggl.MapBuffer();
        this.field_Bc = new jaggl.MapBuffer();
        try {
          try {
            this.field_Yc = param0;
            this.field_Yc.b();
            this.field_Wc = jaggl.OpenGL.glGetString(7936).toLowerCase();
            this.field_Rc = jaggl.OpenGL.glGetString(7937).toLowerCase();
            if (this.field_Wc.indexOf("microsoft") == -1 &&
              -1 == this.field_Wc.indexOf("brian paul") &&
              -1 == this.field_Wc.indexOf("mesa")) {
              var20 = jaggl.OpenGL.glGetString(7938);
              var9 = SocialContact.split(' ', var20.replace('.', ' '), -27224);
              if (var9.length < 2) {
                throw new RuntimeException("");
              }
              try {
                var10_int = no.parseDecimal((byte) -128, (CharSequence) ((Object) var9[0]));
                var11_int = no.parseDecimal((byte) -128, (CharSequence) ((Object) var9[1]));
                this.field_Oc = var11_int + 10 * var10_int;
              } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var10 = (NumberFormatException) (Object) decompiledCaughtException;
                throw new RuntimeException("");
              }
              if (this.field_Oc < 12) {
                throw new RuntimeException("");
              }
              if (!this.field_Yc.a("GL_ARB_multitexture")) {
                throw new RuntimeException("");
              }
              if (!this.field_Yc.a("GL_ARB_texture_env_combine")) {
                throw new RuntimeException("");
              }
              var26 = new int[1];
              jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
              this.textureUnitCount = var26[0];
              if (2 > this.textureUnitCount) {
                throw new RuntimeException("");
              }
              this.field_bc = 8;
              this.field_Nc = this.field_Yc.a("GL_ARB_vertex_buffer_object");
              this.field_Yc.a("GL_ARB_multisample");
              this.field_bd = this.field_Yc.a("GL_ARB_texture_rectangle");
              this.field_W = this.field_Yc.a("GL_ARB_texture_cube_map");
              this.field_Ic = this.field_Yc.a("GL_ARB_texture_non_power_of_two");
              this.field_Eb = this.field_Yc.a("GL_EXT_texture3D");
              this.field_Jc = this.field_Yc.a("GL_ARB_vertex_shader");
              this.field_Ac = this.field_Yc.a("GL_ARB_vertex_program");
              this.field_Mc = this.field_Yc.a("GL_ARB_fragment_shader");
              this.field_Yc.a("GL_ARB_fragment_program");
              this.field_Hc = new int[this.textureUnitCount];
              if (jaclib.memory.Stream.b()) {
                stackIn_21_1 = 33639;
              } else {
                stackIn_21_1 = 5121;
              }
              this.field_Ec = stackIn_21_1;
              if (this.field_Rc.indexOf("radeon") != -1) {
                var11_int = 0;
                var12 = 0;
                var13 = 0;
                var14 = SocialContact.split(' ', this.field_Rc.replace('/', ' '), -27224);
                for (var15 = 0; var14.length > var15; var15++) {
                  var21 = var14[var15];
                  var16 = var21;
                  var16 = var21;
                  var16 = var21;
                  try {
                    boolean decompiledFrameRemainder0 = true;
                    if (0 < var21.length()) {
                      if (120 == var21.charAt(0) &&
                        3 <= var21.length()) {
                        var31 = (CharSequence) ((Object) var21.substring(1, 3));
                        if (ContentTransitionPhase.a(-13181, var31)) {
                          var16 = var21.substring(1);
                          var13 = 1;
                        }
                      }
                      if (var16.equals("hd")) {
                        var12 = 1;
                      } else {
                        if (var16.startsWith("hd")) {
                          var12 = 1;
                          var16 = var16.substring(2);
                        }
                        if (var16.length() >= 4) {
                          var32 = (CharSequence) ((Object) var16.substring(0, 4));
                          if (ContentTransitionPhase.a(-13181, var32)) {
                            var33 = (CharSequence) ((Object) var16.substring(0, 4));
                            var11_int = no.parseDecimal((byte) -127, var33);
                            decompiledRegionSelector0 = 1;
                            decompiledFrameRemainder0 = false;
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      decompiledRegionSelector0 = 0;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var17 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                  }
                  if (decompiledRegionSelector0 == 0) {
                    continue;
                  }
                  break;
                }
                if (var13 == 0 &&
                  var12 == 0) {
                  if (var11_int >= 7000 &&
                    var11_int <= 7999) {
                    this.field_Nc = false;
                  }
                  if (var11_int >= 7000 &&
                    var11_int <= 9250) {
                    this.field_Eb = false;
                  }
                }
                this.field_bd = this.field_bd & this.field_Yc.a("GL_ARB_half_float_pixel");
              }
              if (-1 != this.field_Wc.indexOf("intel")) {
              }
              if (this.field_Nc) {
                try {
                  var27 = new int[1];
                  jaggl.OpenGL.glGenBuffersARB(1, var27, 0);
                } catch (java.lang.Throwable decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var11 = decompiledCaughtException;
                  throw new RuntimeException("");
                }
              }
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.Throwable decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var8 = decompiledCaughtException;
            var8.printStackTrace();
            this.close((byte) -98);
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var8_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_61_0 = var8_ref;
          stackIn_61_1 = new StringBuilder().append("on.<init>(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param4 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param5).append(')').toString());
        }
    }

    final void applyDepthTest(int guard) {
        if (this.depthTestEnabled) {
          jaggl.OpenGL.glEnable(2929);
        } else {
          jaggl.OpenGL.glDisable(2929);
        }
        if (guard <= 19) {
          this.field_Fc = (IntrusiveDeque) null;
        }
    }

    final void bindSpriteTarget(ToolkitSprite sprite, boolean withBuffer) {
    }

    final void J(int param0) {
        if (param0 != 0) {
          this.field_Oc = 37;
        }
    }

    final void applyTexCoordGeneration(int guard, TextureCoordinateGeneration mode) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (mode != lf.DISABLED) {
            var3_int = ka.glTexCoordGeneration(mode, -116);
            jaggl.OpenGL.glTexGeni(8192, 9472, var3_int);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glTexGeni(8193, 9472, var3_int);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glTexGeni(8194, 9472, var3_int);
            jaggl.OpenGL.glEnable(3170);
          } else {
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
          }
          if (guard != 13754) {
            this.applyDepthWrite(122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("on.B(").append(guard).append(',');
          if (mode == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        IntNode var4 = new IntNode(param1);
        var4.key = (long)param2;
        this.field_Gc.addLast((IntrusiveNode) (var4), (byte) 39);
        if (param0 != -99) {
          this.clear(-33);
        }
    }

    final void applyAmbientLightColor(int guard) {
        NetworkResourceRequest.field_v[3] = 1.0f;
        NetworkResourceRequest.field_v[2] = this.field_T * this.field_Xb;
        NetworkResourceRequest.field_v[1] = this.field_T * this.field_jb;
        NetworkResourceRequest.field_v[0] = this.field_J * this.field_T;
        jaggl.OpenGL.glLightModelfv(2899, NetworkResourceRequest.field_v, 0);
        if (guard != 7) {
          int[] var3 = (int[]) null;
          this.drawPixels(-42, 12, 8, 123, (int[]) null, 81, 90);
        }
    }

    final Texture2D a(GpuDataType param0, TextureFormat param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        OpenGlRectangleTexture stackIn_8_0 = null;
        OpenGlTexture2D stackIn_10_0 = null;
        OpenGlTexture2D stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -99) {
            this.restoreCanvasTarget();
          }
          if (!this.field_Ic && (!IntegerMath.isSingleBitOrZero(param3, -124) ||
            !IntegerMath.isSingleBitOrZero(param2, -128))) {
            if (!this.field_bd) {
              stackIn_10_0 = new OpenGlTexture2D(this, param1, param0, LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param3), LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param2));
              return (Texture2D) ((Object) stackIn_10_0);
            }
            stackIn_8_0 = new OpenGlRectangleTexture(this, param1, param0, param3, param2);
            return (Texture2D) ((Object) stackIn_8_0);
          }
          stackIn_12_0 = new OpenGlTexture2D(this, param1, param0, param3, param2);
          return (Texture2D) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("on.NB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void applyScissorEnabled(int guard) {
        if (this.scissorEnabled) {
          jaggl.OpenGL.glEnable(3089);
        } else {
          jaggl.OpenGL.glDisable(3089);
        }
        int var2 = 104 / ((0 - guard) / 55);
    }

    final void applyLighting(boolean guard) {
        if (guard) {
          return;
        }
        if (this.lightingEnabled &&
          !this.lightingSuppressed) {
          jaggl.OpenGL.glEnable(2896);
        } else {
          jaggl.OpenGL.glDisable(2896);
        }
    }

    final VertexBuffer createVertexBuffer(byte guard, boolean dynamic) {
        if (guard != 51) {
          this.createShaderEffect(83, -4);
        }
        return (VertexBuffer) ((Object) new OpenGlVertexBuffer(this, dynamic));
    }

    final void applyScissor(int guard) {
        jaggl.OpenGL.glScissor(this.clipTop + this.field_r, -this.clipBottom + (this.field_y + this.field_Sb), this.clipRight - this.clipTop, this.clipBottom - this.clipLeft);
        if (guard != 4) {
          this.field_Oc = -14;
        }
    }

    final void resetDriverState(int guard) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        for (var2 = this.textureUnitCount - 1; var2 >= 0; var2--) {
          jaggl.OpenGL.glActiveTexture(33984 + var2);
          jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
          jaggl.OpenGL.glTexEnvi(8960, 34161, 8448);
          jaggl.OpenGL.glTexEnvi(8960, 34178, 34166);
          jaggl.OpenGL.glTexEnvi(8960, 34162, 8448);
          jaggl.OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34186, 34168);
        jaggl.OpenGL.glShadeModel(7425);
        jaggl.OpenGL.glClearDepth(1.0f);
        jaggl.OpenGL.glDepthFunc(515);
        jaggl.OpenGL.glPolygonMode(1028, 6914);
        jaggl.OpenGL.glEnable(2884);
        jaggl.OpenGL.glCullFace(1029);
        jaggl.OpenGL.glAlphaFunc(516, 0.0f);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glColorMaterial(1028, 5634);
        jaggl.OpenGL.glEnable(2903);
        float[] var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
        for (var3 = 0; var3 < 8; var3++) {
          var4 = 16384 + var3;
          jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
          jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
          jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
        }
        jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
        jaggl.OpenGL.glFogi(2917, 9729);
        jaggl.OpenGL.glHint(3156, 4353);
        this.field_Yc.setSwapInterval(0);
        super.resetDriverState(guard);
    }

    final synchronized void a(int param0, byte param1) {
        IntrusiveNode var3 = new IntrusiveNode();
        var3.key = (long)param0;
        if (param1 != -96) {
          this.b((byte) -39);
        }
        this.field_Pc.addLast(var3, (byte) 39);
    }

    final void c(int param0, int param1) {
        if (param1 < 83) {
          this.field_Jc = false;
        }
    }

    final void drawPrimitives(int startVertex, int guard, int primitiveCount, PrimitiveType type) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 0) {
            this.field_Pc = (IntrusiveDeque) null;
          }
          if (type == PasswordValidator.LINES) {
            var6 = 2 * primitiveCount;
            var5_int = 1;
          } else {
            if (AccountCreationNavigation.LINE_STRIP != type) {
              if (WhirlpoolDigest.TRIANGLES == type) {
                var6 = 3 * primitiveCount;
                var5_int = 4;
              } else {
                if (AccountServiceResult.TRIANGLE_FAN == type) {
                  var5_int = 6;
                  var6 = primitiveCount + 2;
                } else {
                  if (OpenGlVertexLayout.TRIANGLE_STRIP != type) {
                    var6 = primitiveCount;
                    var5_int = 0;
                  } else {
                    var5_int = 5;
                    var6 = primitiveCount + 2;
                  }
                }
              }
            } else {
              var5_int = 3;
              var6 = primitiveCount + 1;
            }
          }
          jaggl.OpenGL.glDrawArrays(var5_int, startVertex, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("on.UC(").append(startVertex).append(',').append(guard).append(',').append(primitiveCount).append(',');
          if (type == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final boolean a(GpuDataType param0, TextureFormat param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 6) {
            return true;
          }
          this.field_Dc = false;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("on.SE(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (param2 != 23) {
          return;
        }
        IntNode var4 = new IntNode(param0);
        var4.key = (long)param1;
        this.field_Zc.addLast((IntrusiveNode) (var4), (byte) 39);
    }

    final void applyModelMatrix(int guard) {
        this.t((byte) 68);
        if (guard != 0) {
          this.field_Gc = (IntrusiveDeque) null;
        }
    }

    final IndexBuffer createIndexBuffer(int guard, boolean dynamic) {
        if (guard != 3) {
          this.a(-106, (byte) -119, (int[][]) null, false);
        }
        return (IndexBuffer) ((Object) new OpenGlIndexBuffer(this, GpuDataType.UNSIGNED_SHORT, dynamic));
    }

    final void applyTextureConstantColor(int greenIndex) {
        NetworkResourceRequest.field_v[3] = (float)(this.textureConstantColor >>> 24) / 255.0f;
        NetworkResourceRequest.field_v[2] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(255, this.textureConstantColor) / 255.0f;
        NetworkResourceRequest.field_v[0] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(16711680, this.textureConstantColor) / 16711680.0f;
        NetworkResourceRequest.field_v[greenIndex] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(this.textureConstantColor, 65280) / 65280.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, NetworkResourceRequest.field_v, 0);
    }

    final void setAlphaCombineSource(int argument, boolean invert, byte guard, TextureCombineSource source) {
        try {
          jaggl.OpenGL.glTexEnvi(8960, 34184 + argument, FullscreenMembershipDialog.glTextureCombineSource(127, source));
          jaggl.OpenGL.glTexEnvi(8960, argument + 34200, !invert ? 770 : 771);
          int var5_int = -37 % ((guard - 1) / 45);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "on.BF(" + argument + ',' + invert + ',' + guard + ',' + (source != null ? "{...}" : "null") + ')');
        }
    }

    final void releaseSurface(java.awt.Canvas canvas, Object surface, int guard) {
        Long var4 = null;
        try {
          if (guard != 0) {
            this.applyAlphaTest(30);
          }
          var4 = (Long) (surface);
          this.field_Yc.releaseSurface(canvas, var4.longValue());
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "on.JE(" + (canvas != null ? "{...}" : "null") + ',' + (surface != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final RenderBuffer createRenderBuffer(int width, int height) {
        return null;
    }

    final float b(byte param0) {
        if (param0 < 125) {
          this.field_Yc = (jaggl.OpenGL) null;
        }
        return 0.0f;
    }

    final void unbindTexture(byte guard) {
        int var2 = this.field_Hc[this.activeTextureUnit];
        if (0 != var2) {
          this.field_Hc[this.activeTextureUnit] = 0;
          jaggl.OpenGL.glBindTexture(var2, 0);
          jaggl.OpenGL.glDisable(var2);
        }
        if (guard != 9) {
          this.field_bd = false;
        }
    }

    final VertexLayout a(VertexStreamLayout[] param0, byte param1) {
        RuntimeException var3 = null;
        OpenGlVertexLayout stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 6) {
            this.field_Kc = (IntrusiveDeque) null;
          }
          stackIn_3_0 = new OpenGlVertexLayout(param0);
          return (VertexLayout) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("on.V(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final Texture2D a(boolean param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        OpenGlTexture2D var9 = null;
        OpenGlTexture2D stackIn_7_0 = null;
        OpenGlRectangleTexture stackIn_10_0 = null;
        OpenGlTexture2D stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -41) {
            this.unbindTexture((byte) 14);
          }
          if (!this.field_Ic && (!IntegerMath.isSingleBitOrZero(param3, -118) ||
            !IntegerMath.isSingleBitOrZero(param6, -113))) {
            if (this.field_bd) {
              stackIn_10_0 = new OpenGlRectangleTexture(this, param3, param6, param2, param5, param1);
              return (Texture2D) ((Object) stackIn_10_0);
            }
            var9 = new OpenGlTexture2D(this, BeveledTextInputRenderer.RGBA, GpuDataType.UNSIGNED_BYTE, LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param3), LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param6));
            var9.uploadInts(param6, false, param5, param3, param1, param2, 0, 0);
            stackIn_12_0 = var9;
            return (Texture2D) ((Object) stackIn_12_0);
          }
          stackIn_7_0 = new OpenGlTexture2D(this, param3, param6, param0, param2, param5, param1);
          return (Texture2D) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("on.WD(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void applyBlendEnabled(byte guard) {
        if (guard != -4) {
          return;
        }
        if (this.field_ob) {
          jaggl.OpenGL.glEnable(3042);
        } else {
          jaggl.OpenGL.glDisable(3042);
        }
    }

    final Texture2D a(TextureFormat param0, int param1, int param2, int param3, byte[] param4, byte param5, int param6, boolean param7) {
        int var9_int = 0;
        RuntimeException var9 = null;
        OpenGlTexture2D var10 = null;
        OpenGlTexture2D stackIn_5_0 = null;
        OpenGlRectangleTexture stackIn_8_0 = null;
        OpenGlTexture2D stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9_int = 108 % ((50 - param5) / 44);
          if (!this.field_Ic && (!IntegerMath.isSingleBitOrZero(param1, -107) ||
            !IntegerMath.isSingleBitOrZero(param2, -111))) {
            if (this.field_bd) {
              stackIn_8_0 = new OpenGlRectangleTexture(this, param0, param1, param2, param4, param6, param3);
              return (Texture2D) ((Object) stackIn_8_0);
            }
            var10 = new OpenGlTexture2D(this, param0, GpuDataType.UNSIGNED_BYTE, LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param1), LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param2));
            var10.uploadBytes(param0, 0, (byte) 77, param6, param4, param2, param1, 0, param3);
            stackIn_10_0 = var10;
            return (Texture2D) ((Object) stackIn_10_0);
          }
          stackIn_5_0 = new OpenGlTexture2D(this, param0, param1, param2, param7, param4, param6, param3);
          return (Texture2D) ((Object) stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_13_0 = var9;
          stackIn_13_1 = new StringBuilder().append("on.UA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void applyActiveTexture(int guard) {
        if (guard > -7) {
          this.field_zc = (OpenGlVertexBuffer[]) null;
        }
        jaggl.OpenGL.glActiveTexture(this.activeTextureUnit + 33984);
    }

    final void applyLightPositions(int guard) {
        if (guard >= -47) {
          this.applyDirectionalLightsEnabled(-20);
        }
        jaggl.OpenGL.glLightfv(16384, 4611, this.field_G, 0);
        jaggl.OpenGL.glLightfv(16385, 4611, this.field_U, 0);
    }

    final void bindVertexBuffer(int stream, int guard, VertexBuffer buffer) {
        try {
          this.field_zc[stream] = (OpenGlVertexBuffer) (buffer);
          if (guard < 62) {
            this.applyScissorEnabled(-86);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "on.BE(" + stream + ',' + guard + ',' + (buffer != null ? "{...}" : "null") + ')');
        }
    }

    final void applyAlphaTest(int guard) {
        if (!this.field_u) {
          jaggl.OpenGL.glDisable(3008);
        } else {
          jaggl.OpenGL.glEnable(3008);
        }
        int var2 = -24 / ((-6 - guard) / 54);
    }

    final ShaderEffect createShaderEffect(int guard, int effectId) {
        int var3;
        if (guard != 0) {
          this.field_Pc = (IntrusiveDeque) null;
        }
        var3 = effectId;
        if (var3 == 3) {
          return (ShaderEffect) ((Object) new OpenGlUnderwaterEffect(this, this.field_ab));
        }
        if (var3 == 4) {
          return (ShaderEffect) ((Object) new OpenGlTransparentWaterEffect(this, this.field_ab, this.waterTextures));
        }
        if (var3 == 8) {
          return (ShaderEffect) ((Object) new OpenGlEnvironmentWaterEffect(this, this.field_ab, this.waterTextures));
        }
        return super.createShaderEffect(0, effectId);
    }

    final void applyViewMatrix(int guard) {
        this.field_Uc = false;
        if (guard != -26911) {
          this.field_Wc = (String) null;
        }
        this.t((byte) 68);
    }

    final void applyProjectionMatrix(int guard) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.projectionMatrix, 0);
        if (guard != -2) {
          this.field_Wc = (String) null;
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void applyBlendFactors(int guard) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.blendFactors == LimitedRandomAccessFile.ALPHA_BLEND) {
          jaggl.OpenGL.glBlendFunc(770, 771);
        } else {
          if (this.blendFactors == ServerDataReadRequest.ADDITIVE_BLEND) {
            jaggl.OpenGL.glBlendFunc(1, 1);
          } else {
            if (ShrinkingRingEffect.DESTINATION_COLOR_BLEND == this.blendFactors) {
              jaggl.OpenGL.glBlendFunc(774, 1);
            }
          }
        }
        if (guard != -19519) {
          this.field_ad = -66;
        }
    }

    final void applyDepthWrite(int guard) {
        boolean stackIn_6_0 = false;
        if (guard < 113) {
          this.field_Tc = true;
        }
        stackIn_6_0 = (this.field_db) && (this.depthWriteEnabled);
        jaggl.OpenGL.glDepthMask(stackIn_6_0);
    }

    private final void t(byte param0) {
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_Dc) {
          jaggl.OpenGL.glPopMatrix();
        }
        if (param0 != 68) {
          return;
        }
        if (!this.projectionMode.usesViewTransform(-20011)) {
          if (!this.modelIdentity) {
            jaggl.OpenGL.glLoadMatrixf(this.modelTransform.writeColumnMajor4x4(-110, StripedProgressWidget.field_y), 0);
          } else {
            jaggl.OpenGL.glLoadIdentity();
          }
          this.field_Dc = false;
        } else {
          if (!this.field_Uc) {
            jaggl.OpenGL.glLoadMatrixf(this.viewTransform.writeColumnMajor4x4(-63, StripedProgressWidget.field_y), 0);
            this.field_Uc = true;
            this.applyLightPositions(-114);
            this.applyPointLights(param0 ^ -25);
          }
          if (!this.modelIdentity) {
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glMultMatrixf(this.modelTransform.writeColumnMajor4x4(-79, StripedProgressWidget.field_y), 0);
            this.field_Dc = true;
          } else {
            this.field_Dc = false;
          }
        }
    }

    final void dispose() {
        super.dispose();
        if (this.field_Yc != null) {
          this.field_Yc.a();
          this.field_Yc.release();
          this.field_Yc = null;
        }
    }

    final void present(int sourceX, int sourceY) throws RenderPresentationException {
        this.field_Yc.swapBuffers();
    }

    final RenderTarget createRenderTarget(RenderSurface surface, RenderBuffer buffer) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = null;
          return (RenderTarget) (stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("on.OF(");
          if (surface == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (buffer == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final Texture3D a(boolean param0, TextureFormat param1, int param2, int param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        OpenGlTexture3D stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_Wc = (String) null;
          }
          stackIn_3_0 = new OpenGlTexture3D(this, param1, param5, param3, param2, param4);
          return (Texture3D) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("on.PE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(')').toString());
        }
    }

    final void copyFrontToBack() {
        if (this.field_rb <= 0 &&
          !(this.field_Sb > 0)) {
          return;
        }
        int var1 = this.clipTop;
        int var2 = this.clipRight;
        int var3 = this.clipLeft;
        int var4 = this.clipBottom;
        this.resetClip(-16088);
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.d(false);
        this.setFogAllowed(false, -32);
        this.setLightingEnabled(101, false);
        this.setDepthTestEnabled(47, false);
        this.setDepthWriteEnabled(false, 4);
        this.a((GpuTexture) null, 120);
        this.a(-2, false, 50, false);
        this.h(40, 1);
        this.setBlendMode(0, 13);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, this.field_rb, this.field_Sb, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.setClip(var1, var3, var2, var4);
    }

    static {
    }
}
