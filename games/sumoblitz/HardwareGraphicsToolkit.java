/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class HardwareGraphicsToolkit extends GraphicsToolkit {
    WaterTextureResources waterTextures;
    private Hashtable field_Q;
    Object field_Ib;
    int field_Sb;
    jaclib.memory.heap.NativeHeapBuffer field_z;
    static TextureTransformMode TEXTURE_PROJECTED;
    ResourceArchive field_ab;
    private jagex3.graphics2.hw.NativeInterface field_nc;
    private IntrusiveDeque field_lb;
    int field_rb;
    long field_peer;
    private jaclib.memory.heap.NativeHeap field_gb;
    int field_pc;
    AffineTransform3D modelTransform;
    boolean modelIdentity;
    static Boolean field_j;
    int field_Cb;
    int field_o;
    AffineTransform3D viewTransform;
    private AffineTransform3D scratchTransform;
    private AffineTransform3D modelViewTransform;
    private boolean field_fb;
    boolean field_Z;
    private float field_qb;
    private int field_Pb;
    int activeTextureUnit;
    int field_bc;
    private int effectParameters1;
    int pendingPointLightCount;
    private boolean orthographicValid;
    private boolean field_bb;
    float field_E;
    int field_oc;
    int clipLeft;
    AffineTransform3D[] textureTransforms;
    int field_Kb;
    boolean lightingSuppressed;
    private ShaderEffect[] effects;
    float[] field_G;
    int clipRight;
    private int activeEffect;
    private int field_Vb;
    private int effectParameters0;
    int field_kc;
    private HardwareTextureCache field_lc;
    TextureCombineOperation[] field_K;
    boolean fogAllowed;
    boolean lightingEnabled;
    private int field_mb;
    int field_Y;
    boolean fogEnabled;
    private ShaderEffect activeShaderEffect;
    private jaclib.memory.Stream field_cb;
    private int field_Hb;
    TextureCombineOperation[] field_B;
    private int field_k;
    float field_T;
    float field_jb;
    private float[] orthographicMatrix;
    float field_Tb;
    private int field_P;
    int textureUnitCount;
    int field_C;
    int field_Yb;
    private int field_Ob;
    private float[] field_w;
    private float[] field_fc;
    int field_r;
    boolean field_db;
    private boolean field_zb;
    int clipBottom;
    private boolean modelViewValid;
    boolean depthWriteEnabled;
    boolean field_Eb;
    private int field_sc;
    boolean depthTestEnabled;
    int textureConstantColor;
    int field_y;
    BlendMode blendFactors;
    float field_S;
    private GpuTexture[] field_Zb;
    float field_Xb;
    boolean field_u;
    private float[] perspectiveMatrix;
    float[] field_U;
    PointLight[] pointLights;
    private float field_q;
    float field_J;
    int field_tc;
    private HardwareQuadBatchBuffers field_yb;
    private HardwareCubeMapSource environmentSource;
    private int blendMode;
    private int field_dc;
    float[] projectionMatrix;
    boolean field_ob;
    int field_Nb;
    private boolean perspectiveValid;
    float field_hb;
    ProjectionMode projectionMode;
    private int field_rc;
    int clipTop;
    private int field_ic;
    int previousPointLightCount;
    boolean field_W;
    private float field_kb;
    private boolean field_H;
    GpuTexture field_D;
    TextureTransformMode[] textureTransformModes;
    private HardwareBufferSet field_ib;
    private VertexBuffer lineVertices;
    private IndexBuffer field_M;
    private HardwareBufferSet field_Fb;
    VertexLayout field_jc;
    private HardwareBufferSet field_gc;
    private VertexBuffer dynamicVertices;
    private VertexLayout lineLayout;
    private HardwareBufferSet field_qc;
    private HardwareBufferSet field_hc;
    private VertexLayout dynamicLayout;
    private VertexBuffer field_Qb;
    private VertexLayout field_n;
    boolean scissorEnabled;

    abstract Texture2D a(TextureFormat param0, int param1, int param2, int param3, byte[] param4, byte param5, int param6, boolean param7);

    private final void c(byte param0) {
        float[] var2;
        float[] var3;
        float[] var4;
        float[] var5;
        if (param0 != -88) {
          HardwareGraphicsToolkit.j((byte) -98);
        }
        if (!this.field_zb) {
          var3 = this.field_fc;
          var5 = var3;
          var4 = var5;
          var2 = var4;
          if (0 != this.field_rb &&
            this.field_Sb != 0) {
            var5[12] = -1.0f;
            var5[10] = 0.5f;
            var2[5] = -2.0f / (float)this.field_Sb;
            var2[2] = 0.0f;
            var2[4] = 0.0f;
            var2[7] = 0.0f;
            var2[11] = 0.0f;
            var2[15] = 1.0f;
            var2[6] = 0.0f;
            var2[8] = 0.0f;
            var5[14] = 0.5f;
            var2[13] = 1.0f;
            var2[0] = 2.0f / (float)this.field_rb;
            var2[9] = 0.0f;
            var2[3] = 0.0f;
            var2[1] = 0.0f;
          } else {
            var3[14] = 0.0f;
            var3[3] = 0.0f;
            var3[12] = 0.0f;
            var3[10] = 1.0f;
            var3[1] = 0.0f;
            var3[0] = 1.0f;
            var3[9] = 0.0f;
            var3[15] = 1.0f;
            var3[4] = 0.0f;
            var3[7] = 0.0f;
            var3[13] = 0.0f;
            var3[6] = 0.0f;
            var3[8] = 0.0f;
            var3[11] = 0.0f;
            var3[5] = 1.0f;
            var3[2] = 0.0f;
          }
          this.field_zb = true;
        }
    }

    final void setDepthTestEnabled(int guard, boolean enabled) {
        if ((!this.depthTestEnabled ? 1 : 0) != (!enabled ? 1 : 0)) {
          this.depthTestEnabled = enabled ? true : false;
          this.applyDepthTest(79);
          this.field_ic = this.field_ic & -32;
        }
        if (guard <= 32) {
          this.field_K = (TextureCombineOperation[]) null;
        }
    }

    abstract void applyViewMatrix(int guard);

    final Texture2D a(byte[] param0, int param1, int param2, TextureFormat param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        Texture2D stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 0) {
            this.activeTextureUnit = 3;
          }
          stackIn_3_0 = this.a(param3, param1, param2, 0, param0, (byte) 97, 0, param5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("aw.TD(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final AffineTransform3D scratchTransform(boolean guard) {
        if (!guard) {
          return (AffineTransform3D) null;
        }
        return this.scratchTransform;
    }

    private final void h(byte param0) {
        if (param0 > -77) {
          this.field_lc = (HardwareTextureCache) null;
        }
    }

    final void resetModelTransform(int guard) {
        this.modelTransform.setIdentity(guard);
        this.modelIdentity = true;
        this.syncModelTransform(-29654);
    }

    abstract void applyLighting(boolean guard);

    abstract IndexBuffer createIndexBuffer(int guard, boolean dynamic);

    abstract Object a(java.awt.Canvas param0, int param1);

    final int M(int param0) {
        int var2 = -35 / ((param0 - 54) / 59);
        return this.field_Pb;
    }

    final static String a(String param0, String param1, String param2, boolean param3) {
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (!param3) {
          TEXTURE_PROJECTED = (TextureTransformMode) null;
        }
        int var4 = param1.indexOf(param0);
        while (-1 != var4) {
          param1 = param1.substring(0, var4) + param2 + param1.substring(param0.length() + var4);
          var4 = param1.indexOf(param0, param2.length() + var4);
        }
        return param1;
    }

    final AffineTransform3D currentTextureTransform(int guard) {
        if (guard != 26453) {
          return (AffineTransform3D) null;
        }
        return this.textureTransforms[this.activeTextureUnit];
    }

    final void d(boolean param0) {
        ProjectionMode var2 = null;
        if (param0) {
          this.fogChanged((byte) 96);
        }
        if (GameInstructions.field_k != this.projectionMode) {
          var2 = this.projectionMode;
          this.projectionMode = GameInstructions.field_k;
          if (var2.usesViewTransform(-20011)) {
            this.viewTransformChanged(16);
          }
          this.field_ic = this.field_ic & -32;
          this.projectionMatrix = this.field_w;
        }
    }

    final void modelTransformChanged(int guard) {
        this.modelIdentity = false;
        if (guard != 0) {
          return;
        }
        this.syncModelTransform(-29654);
    }

    abstract void applyBlendFactors(int guard);

    final void resetClip(int guard) {
        this.clipLeft = 0;
        this.clipTop = 0;
        if (guard != -16088) {
          this.field_Ob = -12;
        }
        this.clipRight = this.field_rb;
        this.clipBottom = this.field_Sb;
        if (this.scissorEnabled) {
          this.scissorEnabled = false;
          this.applyScissorEnabled(-121);
        }
        this.h((byte) -128);
    }

    abstract CubeTexture a(int param0, byte param1, int[][] param2, boolean param3);

    abstract float b(byte param0);

    private final void syncModelTransform(int guard) {
        float var2 = 0.0f;
        if (PerlinNoiseSliceGenerator.field_h == this.projectionMode) {
          var2 = this.b((byte) 127);
          this.modelTransform.translate((byte) 96, 0.0f, var2, var2);
        }
        if (guard != -29654) {
          this.field_Y = -4;
        }
        this.modelViewValid = false;
        this.applyModelMatrix(0);
        if (null != this.activeShaderEffect) {
          this.activeShaderEffect.updateViewUniforms((byte) 37);
        }
    }

    final int activeTextureUnit(int guard) {
        int var2 = 39 % ((guard + 20) / 54);
        return this.activeTextureUnit;
    }

    final void setLightingEnabled(int guard, boolean enabled) {
        if (this.lightingEnabled != enabled) {
          this.lightingEnabled = enabled ? true : false;
          this.applyLighting(false);
          this.field_ic = this.field_ic & -8;
        }
        int var3 = -80 % ((35 - guard) / 54);
    }

    abstract Texture3D a(boolean param0, TextureFormat param1, int param2, int param3, byte[] param4, int param5);

    abstract void unbindTexture(byte guard);

    final void intersectClip(int left, int top, int right, int bottom) {
        int var5 = 0;
        if (left > this.clipTop) {
          var5 = 1;
          this.clipTop = left;
        }
        if (right < this.clipRight) {
          var5 = 1;
          this.clipRight = right;
        }
        if (this.clipLeft < top) {
          this.clipLeft = top;
          var5 = 1;
        }
        if (bottom < this.clipBottom) {
          this.clipBottom = bottom;
          var5 = 1;
        }
        if (var5 != 0) {
          if (!this.scissorEnabled) {
            this.scissorEnabled = true;
            this.applyScissorEnabled(-57);
          }
          this.applyScissor(4);
          this.h((byte) -122);
        }
    }

    abstract void applyScissor(int guard);

    public static void releaseStatics(int param0) {
        TEXTURE_PROJECTED = null;
        if (param0 != 8) {
          TEXTURE_PROJECTED = (TextureTransformMode) null;
        }
        field_j = null;
    }

    abstract void setColorCombineSource(byte guard, int argument, boolean useAlpha, boolean invert, TextureCombineSource source);

    abstract void applyLightPositions(int guard);

    abstract void applyAmbientLightColor(int guard);

    final ToolkitSprite createSprite(SpriteData data, boolean preferIndexed) {
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        ToolkitSprite stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        ToolkitSprite var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (0 != data.field_h &&
            0 != data.field_i) {
            var12 = new int[data.field_h * data.field_i];
            var11 = var12;
            var4 = var11;
            var5 = 0;
            var6 = 0;
            if (null != data.field_a) {
              for (var7 = 0; var7 < data.field_i; var7++) {
                for (var8 = 0; var8 < data.field_h; var8++) {
                  incrementValue$2 = var6;
                  var6++;
                  var4[incrementValue$2] = LegacyOpenGlInterleavedStream.bitwiseOr(data.field_a[var5] << 24, data.field_g[LegacyOpenGlPostProcessManager.bitwiseAnd(255, (int) data.field_e[var5])]);
                  var5++;
                }
              }
            } else {
              for (var7 = 0; var7 < data.field_i; var7++) {
                for (var8 = 0; data.field_h > var8; var8++) {
                  incrementValue$0 = var5;
                  var5++;
                  var9 = data.field_g[data.field_e[incrementValue$0] & 255];
                  incrementValue$1 = var6;
                  var6++;
                  stackIn_18_0 = var4;
                  stackIn_18_1 = incrementValue$1;
                  if (var9 == 0) {
                    stackIn_19_2 = 0;
                  } else {
                    stackIn_19_2 = LegacyOpenGlInterleavedStream.bitwiseOr(var9, -16777216);
                  }
                  stackIn_18_0[stackIn_18_1] = stackIn_19_2;
                }
              }
            }
            var3 = this.createSpriteCopy(0, -2, data.field_i, data.field_h, data.field_h, var12);
          } else {
            var3 = this.createSpriteCopy(0, -2, 1, 1, 1, new int[]{0});
          }
          var3.setInsets(data.field_c, data.field_d, data.field_b, data.field_f);
          stackIn_23_0 = var3;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("aw.RA(");
          if (data == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(preferIndexed).append(')').toString());
        }
    }

    private final void drawLineBuffer(boolean guard) {
        if (guard) {
          this.field_Hb = -20;
        }
        this.bindVertexBuffer(0, 119, this.lineVertices);
        this.bindVertexLayout(-77, this.lineLayout);
        this.drawPrimitives(0, 0, 1, PasswordValidator.LINES);
    }

    final Texture2D a(int param0, TextureFormat param1, byte param2, boolean param3, int param4, float[] param5) {
        RuntimeException var7 = null;
        Texture2D stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 84) {
            this.field_kc = 90;
          }
          stackIn_3_0 = this.a(0, param4, param3, 0, param5, param0, (byte) -125, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("aw.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final jaclib.memory.Stream a(boolean param0, jaclib.memory.Buffer param1) {
        RuntimeException var3 = null;
        jaclib.memory.Stream stackIn_2_0 = null;
        jaclib.memory.Stream stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_2_0 = (jaclib.memory.Stream) null;
            return stackIn_2_0;
          }
          this.field_cb.a(param1);
          stackIn_4_0 = this.field_cb;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("aw.NE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void setAlphaCombineSource(TextureCombineSource source, int argument, boolean guard) {
        try {
          if (!guard) {
            this.c((byte) -34);
          }
          this.setAlphaCombineSource(argument, false, (byte) 54, source);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "aw.ID(" + (source != null ? "{...}" : "null") + ',' + argument + ',' + guard + ')');
        }
    }

    abstract void applyBlendEnabled(byte guard);

    private final void drawDynamicPrimitives(int firstVertex, PrimitiveType primitive, int primitiveCount) {
        try {
          this.bindVertexBuffer(0, 86, this.dynamicVertices);
          this.bindVertexLayout(125, this.dynamicLayout);
          this.drawPrimitives(firstVertex, firstVertex ^ 0, primitiveCount, primitive);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "aw.VE(" + firstVertex + ',' + (primitive != null ? "{...}" : "null") + ',' + primitiveCount + ')');
        }
    }

    final void setTextureTransformMode(TextureTransformMode mode, int guard) {
        try {
          if (guard != 28880) {
            this.applyViewMatrix(-123);
          }
          this.textureTransformModes[this.activeTextureUnit] = mode;
          this.textureTransformChanged(guard ^ 28752);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "aw.A(" + (mode != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void e(boolean param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        this.textureTransforms = new AffineTransform3D[this.textureUnitCount];
        this.field_Zb = new GpuTexture[this.textureUnitCount];
        this.textureTransformModes = new TextureTransformMode[this.textureUnitCount];
        this.field_K = new TextureCombineOperation[this.textureUnitCount];
        this.field_B = new TextureCombineOperation[this.textureUnitCount];
        for (var2 = 0; this.textureUnitCount > var2; var2++) {
          this.field_B[var2] = SlowBurstParticle.MODULATE;
          this.field_K[var2] = SlowBurstParticle.MODULATE;
          this.textureTransformModes[var2] = HotspotTextWidget.TEXTURE_TRANSFORM_DISABLED;
          this.textureTransforms[var2] = new AffineTransform3D();
        }
        this.pointLights = new PointLight[-2 + this.field_bc];
        this.field_D = (GpuTexture) ((Object) this.a(GpuDataType.UNSIGNED_BYTE, BeveledTextInputRenderer.RGBA, 1, 1, (byte) -110));
        this.useHeap(new HardwareGraphicsHeap(262144));
        this.field_jc = this.a(new VertexStreamLayout[]{new VertexStreamLayout(new VertexAttribute[]{VertexAttribute.POSITION, VertexAttribute.TEXCOORD2})}, (byte) 78);
        this.a(new VertexStreamLayout[]{new VertexStreamLayout(new VertexAttribute[]{VertexAttribute.POSITION, VertexAttribute.COLOR})}, (byte) 70);
        this.a(new VertexStreamLayout[]{new VertexStreamLayout(VertexAttribute.POSITION), new VertexStreamLayout(VertexAttribute.COLOR), new VertexStreamLayout(VertexAttribute.TEXCOORD2), new VertexStreamLayout(VertexAttribute.NORMAL)}, (byte) 14);
        this.a(new VertexStreamLayout[]{new VertexStreamLayout(VertexAttribute.POSITION), new VertexStreamLayout(VertexAttribute.COLOR), new VertexStreamLayout(VertexAttribute.TEXCOORD2)}, (byte) 100);
        HardwareBufferSet discarded$0 = new HardwareBufferSet(this, 0, 0, false, false);
        this.field_gc = new HardwareBufferSet(this, 0, 0, true, true);
        HardwareBufferSet discarded$1 = new HardwareBufferSet(this, 0, 0, false, false);
        this.field_qc = new HardwareBufferSet(this, 0, 0, true, true);
        HardwareBufferSet discarded$2 = new HardwareBufferSet(this, 0, 0, false, false);
        this.field_hc = new HardwareBufferSet(this, 0, 0, true, true);
        HardwareBufferSet discarded$3 = new HardwareBufferSet(this, 0, 0, false, false);
        this.field_Fb = new HardwareBufferSet(this, 0, 0, true, true);
        HardwareBufferSet discarded$4 = new HardwareBufferSet(this, 0, 0, false, param0);
        this.field_ib = new HardwareBufferSet(this, 0, 0, true, true);
        this.field_yb = new HardwareQuadBatchBuffers(this);
        this.field_M = this.createIndexBuffer(3, true);
        this.P(-55);
        this.waterTextures = new WaterTextureResources(this);
        this.effects[1] = this.createShaderEffect(0, 1);
        this.effects[2] = this.createShaderEffect(0, 2);
        this.effects[4] = this.createShaderEffect(0, 4);
        this.effects[5] = this.createShaderEffect(0, 5);
        this.effects[6] = this.createShaderEffect(0, 6);
        this.effects[7] = this.createShaderEffect(0, 7);
        this.effects[3] = this.createShaderEffect(0, 3);
        this.effects[8] = this.createShaderEffect(0, 8);
        this.effects[9] = this.createShaderEffect(0, 9);
        if (!this.effects[2].isSupported((byte) -82)) {
          this.effects[2] = this.createShaderEffect(0, 0);
        }
        if (!this.effects[4].isSupported((byte) -67)) {
          this.effects[4] = this.effects[2];
        }
        if (!this.effects[8].isSupported((byte) -42)) {
          this.effects[8] = this.effects[4];
        }
        if (!this.effects[9].isSupported((byte) -43)) {
          this.effects[9] = this.effects[8];
        }
        this.resetDriverState(1);
        this.resetClip(-16088);
        this.copyFrontToBack();
    }

    abstract void releaseSurface(java.awt.Canvas canvas, Object surface, int guard);

    private final void invalidatePerspectiveProjection(int guard) {
        this.perspectiveValid = false;
        if (guard != 2) {
          return;
        }
        this.buildPerspectiveProjection(guard ^ -63);
        if (pd.PERSPECTIVE == this.projectionMode) {
          this.projectionChanged(guard ^ 3);
        }
    }

    final void setTextureConstantColor(boolean guard, int color) {
        if (guard) {
          return;
        }
        if (color != this.textureConstantColor) {
          this.textureConstantColor = color;
          this.applyTextureConstantColor(1);
        }
    }

    final AffineTransform3D textureTransform(int guard) {
        if (guard != 0) {
          return (AffineTransform3D) null;
        }
        return this.textureTransforms[this.activeTextureUnit];
    }

    final static void C(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var6 = ModalDialog.field_C;
          var1 = var6;
          var3 = -20 / ((-66 - param0) / 42);
          var2 = 0;
          var4 = var6.length;
          while (var4 > var2) {
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1_ref), "aw.N(" + param0 + ')');
        }
    }

    private final void viewTransformChanged(int guard) {
        this.modelViewValid = false;
        if (guard != 16) {
          this.field_Kb = 40;
        }
        if (this.activeShaderEffect != null) {
          this.activeShaderEffect.updateTransformUniforms(guard ^ -90);
        }
        this.applyViewMatrix(-26911);
    }

    abstract void bindVertexLayout(int guard, VertexLayout layout);

    abstract boolean a(byte param0, GpuDataType param1, TextureFormat param2);

    void resetDriverState(int guard) {
        this.applyAllRenderState(-1);
        if (guard != 1) {
          byte[] var3 = (byte[]) null;
          this.a(true, (TextureFormat) null, -62, 114, (byte[]) null, 71);
        }
    }

    abstract void applyFogEnabled(byte guard);

    abstract boolean a(GpuDataType param0, TextureFormat param1, int param2);

    final void useHeap(GraphicsHeap heap) {
        try {
          this.field_gb = ((HardwareGraphicsHeap) (heap)).heap;
          this.field_z = this.field_gb.a(32768, false);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "aw.OB(" + (heap != null ? "{...}" : "null") + ')');
        }
    }

    void dispose() {
        IntrusiveNode var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (!this.field_H) {
          var1 = this.field_lb.first(-66);
          while (var1 != null) {
            ((HardwareGraphicsHeap) (var1)).close(-14365);
            var1 = this.field_lb.next((byte) 18);
          }
          var1_ref = this.field_Q.keys();
          while (var1_ref.hasMoreElements()) {
            var2 = (java.awt.Canvas) (var1_ref.nextElement());
            this.releaseSurface(var2, this.field_Q.get(var2), 0);
          }
          CubeMapSource.releaseColorTables(false, true, -1);
          this.field_nc.release();
          this.field_H = true;
        }
    }

    abstract void applyViewport(int guard);

    final void getClip(int[] bounds) {
        try {
          bounds[0] = this.clipTop;
          bounds[3] = this.clipBottom;
          bounds[2] = this.clipRight;
          bounds[1] = this.clipLeft;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "aw.K(" + (bounds != null ? "{...}" : "null") + ')');
        }
    }

    abstract void drawPrimitives(int startVertex, int guard, int primitiveCount, PrimitiveType type);

    final void drawCircle(int centerX, int centerY, int radius, int color, int blendMode) {
        this.f((byte) 117);
        this.setTextureConstantColor(false, color);
        this.setColorCombineSource(AccountRequestState.CONSTANT, 0, 0);
        this.setAlphaCombineSource(AccountRequestState.CONSTANT, 0, true);
        this.setBlendMode(blendMode, 13);
        this.modelTransform.setScale((float)radius, (float)radius, 0, 1.0f);
        this.modelTransform.translate(centerY, centerX, (byte) 103, 0);
        this.modelTransformChanged(0);
        this.setMultisampling(1, false);
        this.bindVertexBuffer(0, 121, this.field_Qb);
        this.bindVertexLayout(-64, this.field_n);
        this.drawPrimitives(1, 0, 256, AccountCreationNavigation.LINE_STRIP);
        this.setMultisampling(1, true);
        this.setAlphaCombineSource(LegacyVertexAttribute.TEXTURE, 0, true);
        this.setColorCombineSource(LegacyVertexAttribute.TEXTURE, 0, 0);
    }

    final static void j(byte param0) {
        VertexLayout.field_b = -1;
        qf.field_a = 0;
        GraphicsHeap.field_k = -1;
        up.field_d = false;
        LegacyOpenGlCubeTexture.field_l = null;
        int var1 = 47 / ((9 - param0) / 43);
    }

    final int[] projectionParameters() {
        return new int[]{this.field_P, this.field_Hb, this.field_sc, this.field_rc};
    }

    abstract void applyTextureConstantColor(int greenIndex);

    abstract void J(int param0);

    final GraphicsHeap createHeap(int capacity) {
        HardwareGraphicsHeap var2 = new HardwareGraphicsHeap(capacity);
        this.field_lb.addLast((IntrusiveNode) (var2), (byte) 39);
        return (GraphicsHeap) ((Object) var2);
    }

    final float[] a(int param0, float[] param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1[0] = this.projectionMatrix[0];
          param1[8] = this.projectionMatrix[2];
          param1[12] = this.projectionMatrix[3];
          param1[4] = this.projectionMatrix[1];
          param1[5] = this.projectionMatrix[5];
          param1[1] = this.projectionMatrix[4];
          param1[13] = this.projectionMatrix[7];
          param1[9] = this.projectionMatrix[6];
          param1[2] = this.projectionMatrix[8];
          param1[14] = this.projectionMatrix[11];
          param1[10] = this.projectionMatrix[10];
          param1[6] = this.projectionMatrix[9];
          param1[3] = this.projectionMatrix[12];
          param1[7] = this.projectionMatrix[13];
          param1[15] = this.projectionMatrix[15];
          param1[11] = this.projectionMatrix[14];
          if (param0 > -44) {
            this.field_peer = -100L;
          }
          stackIn_3_0 = (float[]) (param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aw.TC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    abstract void applyColorCombineOperation(byte guard);

    final boolean usesNativeRendering() {
        return true;
    }

    private final void createLineBuffer(byte guard) {
        this.lineVertices = this.createVertexBuffer((byte) 51, true);
        this.lineVertices.allocate(12, (byte) -35, 24);
        if (guard < 102) {
          this.field_db = false;
        }
        this.lineLayout = this.a(new VertexStreamLayout[]{new VertexStreamLayout(VertexAttribute.POSITION)}, (byte) 118);
    }

    private final void f(byte param0) {
        int var2 = 90 / ((param0 - 40) / 56);
        if (this.field_ic != 1) {
          this.L(-25);
          this.setFogAllowed(false, -32);
          this.setLightingEnabled(123, false);
          this.setDepthTestEnabled(90, false);
          this.setDepthWriteEnabled(false, 4);
          this.a(-2, false, 50, false);
          this.h(57, 1);
          this.a(this.field_D, 117);
          this.field_ic = 1;
        }
    }

    abstract void applyDirectionalLightsEnabled(int guard);

    final void setDepthRange(int nearPlane, int farPlane) {
        if (nearPlane != this.field_oc ||
          farPlane != this.field_Yb) {
          this.field_Yb = farPlane;
          this.field_oc = nearPlane;
          this.invalidatePerspectiveProjection(2);
          this.invalidateOrthographicProjection(13);
          this.fogChanged((byte) -78);
        }
    }

    abstract Texture2D a(GpuDataType param0, TextureFormat param1, int param2, int param3, byte param4);

    final void setFogEnabled(int guard, boolean enabled) {
        if ((!enabled ? 1 : 0) != (!this.fogEnabled ? 1 : 0)) {
          this.fogEnabled = enabled ? true : false;
          this.applyFogEnabled((byte) -119);
        }
        if (guard != 0) {
          this.field_oc = -100;
        }
    }

    final void drawLine(int x0, int y0, int x1, int y1, int color, int blendMode) {
        float var7;
        float var8;
        float var9;
        var7 = (float)(-x0) + (float)x1;
        var8 = (float)y1 - (float)y0;
        if (0.0f == var7 &&
          var8 == 0.0f) {
          var7 = 1.0f;
        } else {
          var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
          var7 = var7 * var9;
          var8 = var8 * var9;
        }
        if (!this.a(0.0f, (float)y1 + var8, true, (float)x1 + var7, (float)x0, (float)y0, 0.0f)) {
          return;
        }
        this.f((byte) -57);
        this.setTextureConstantColor(false, color);
        this.setColorCombineSource(AccountRequestState.CONSTANT, 0, 0);
        this.setAlphaCombineSource(AccountRequestState.CONSTANT, 0, true);
        this.setBlendMode(blendMode, 13);
        this.resetModelTransform(1);
        this.setMultisampling(1, false);
        this.drawLineBuffer(false);
        this.setMultisampling(1, true);
        this.setAlphaCombineSource(LegacyVertexAttribute.TEXTURE, 0, true);
        this.setColorCombineSource(LegacyVertexAttribute.TEXTURE, 0, 0);
    }

    private final void O(int param0) {
        int var2;
        jaclib.memory.Buffer var3;
        int var5;
        jaclib.memory.Stream var4;
        var5 = Sumoblitz.field_L ? 1 : 0;
        this.dynamicVertices = this.createVertexBuffer((byte) 51, false);
        this.dynamicVertices.allocate(28, (byte) -35, 140);
        var2 = 0;
        scanLoop1: while (true) {
          if (4 > var2) {
            var3 = this.dynamicVertices.map(7454, true);
            if (var3 != null) {
              var4 = this.a(true, var3);
              if (jaclib.memory.Stream.b()) {
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(1.0f);
                var4.a(0.0f);
                var4.a(1.0f);
                var4.a(1.0f);
                var4.a(1.0f);
                var4.a(0.0f);
                var4.a(1.0f);
                var4.a(1.0f);
                var4.a(1.0f);
                var4.a(1.0f);
                var4.a(1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(1.0f);
                var4.a(0.0f);
                var4.a(1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(0.0f);
              } else {
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(1.0f);
                var4.b(0.0f);
                var4.b(1.0f);
                var4.b(1.0f);
                var4.b(1.0f);
                var4.b(0.0f);
                var4.b(1.0f);
                var4.b(1.0f);
                var4.b(1.0f);
                var4.b(1.0f);
                var4.b(1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(1.0f);
                var4.b(0.0f);
                var4.b(1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(0.0f);
              }
              var4.a();
              if (this.dynamicVertices.unmap(22957)) {
                break scanLoop1;
              }
            }
            var2++;
            continue;
          }
          break;
        }
        this.dynamicLayout = this.a(new VertexStreamLayout[]{new VertexStreamLayout(new VertexAttribute[]{VertexAttribute.POSITION, VertexAttribute.TEXCOORD2, VertexAttribute.TEXCOORD2})}, (byte) 99);
        if (param0 != 5) {
          this.textureTransformChanged(-25);
        }
        return;
    }

    final void a(GpuTexture param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 <= 89) {
            discarded$1 = this.a(-0.810268759727478f, 2.1692757606506348f, false, -2.797441005706787f, 1.3712314367294312f, 0.6615611910820007f, 0.5074755549430847f);
          }
          if (this.field_Zb[this.activeTextureUnit] != param0) {
            this.field_Zb[this.activeTextureUnit] = param0;
            if (param0 != null) {
              param0.bind(8905);
            } else {
              this.unbindTexture((byte) 9);
            }
            this.field_ic = this.field_ic & -2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("aw.BA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void y(int param0) {
        int var5 = 0;
        int var2;
        jaclib.memory.Buffer var3;
        jaclib.memory.Stream var4;
        double var6;
        float var8;
        float var9;
        int var10;
        var10 = Sumoblitz.field_L ? 1 : 0;
        this.field_Qb = this.createVertexBuffer((byte) 51, false);
        this.field_Qb.allocate(12, (byte) -35, 3096);
        var2 = 0;
        scanLoop1: while (true) {
          if (4 > var2) {
            var3 = this.field_Qb.map(7454, true);
            if (var3 != null) {
              var4 = this.a(true, var3);
              var4.a(0.0f);
              var4.a(0.0f);
              var4.a(0.0f);
              for (var5 = 0; var5 <= 256; var5++) {
                var6 = (double)(var5 * 2) * 3.141592653589793 / 256.0;
                var8 = (float)Math.cos(var6);
                var9 = (float)Math.sin(var6);
                if (jaclib.memory.Stream.b()) {
                  var4.a(var9);
                  var4.a(var8);
                  var4.a(0.0f);
                } else {
                  var4.b(var9);
                  var4.b(var8);
                  var4.b(0.0f);
                }
              }
              var4.a();
              if (this.field_Qb.unmap(22957)) {
                break scanLoop1;
              }
            }
            var2++;
            continue;
          }
          break;
        }
        if (param0 >= -97) {
          return;
        }
        this.field_n = this.a(new VertexStreamLayout[]{new VertexStreamLayout(VertexAttribute.POSITION)}, (byte) 50);
        return;
    }

    final static GraphicsToolkit a(TextureProvider param0, java.awt.Canvas param1, int param2, int param3) {
        RuntimeException var4 = null;
        String var5 = null;
        LegacyOpenGlGraphicsToolkit stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 27541) {
            var5 = (String) null;
            HardwareGraphicsToolkit.a((String) null, (String) null, (String) null, false);
          }
          stackIn_3_0 = new LegacyOpenGlGraphicsToolkit(param1, param0, param2);
          return (GraphicsToolkit) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("aw.CB(");
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void projectionChanged(int guard) {
        this.applyProjectionMatrix(-2);
        if (null != this.activeShaderEffect) {
          this.activeShaderEffect.updateProjectionUniforms(false);
        }
        if (guard != 1) {
          this.effectParameters1 = 74;
        }
    }

    final void setBlendMode(int mode, int guard) {
        BlendMode var3;
        int var4;
        int var5;
        int var6;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_21_1 = false;
        int stackIn_25_0 = 0;
        boolean stackIn_29_1 = false;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 13) {
          this.field_cb = (jaclib.memory.Stream) null;
        }
        if (mode != this.blendMode) {
          if (mode != 1) {
            if (mode == 2) {
              var5 = 0;
              var4 = 1;
              var3 = ServerDataReadRequest.ADDITIVE_BLEND;
            } else {
              if (mode == 128) {
                var3 = ShrinkingRingEffect.DESTINATION_COLOR_BLEND;
                var5 = 1;
                var4 = 1;
              } else {
                var5 = 0;
                var3 = StrongCacheReference.NO_BLEND;
                var4 = 0;
              }
            }
          } else {
            var5 = 1;
            var4 = 1;
            var3 = LimitedRandomAccessFile.ALPHA_BLEND;
          }
          stackIn_14_0 = (this.field_u) ? 0 : 1;
          stackIn_17_1 = (var5 != 0) ? 0 : 1;
          if (stackIn_14_0 != stackIn_17_1) {
            stackIn_21_1 = (var5 != 0);
            this.field_u = stackIn_21_1;
            this.applyAlphaTest(102);
          }
          stackIn_25_0 = (var4 != 0) ? 0 : 1;
          if (stackIn_25_0 == (this.field_ob ? 1 : 0)) {
            stackIn_29_1 = (var4 != 0);
            this.field_ob = stackIn_29_1;
            this.applyBlendEnabled((byte) -4);
          }
          if (var3 != this.blendFactors) {
            this.blendFactors = var3;
            this.applyBlendFactors(-19519);
          }
          this.blendMode = mode;
          this.field_ic = this.field_ic & -29;
        }
    }

    private final boolean a(float param0, float param1, boolean param2, float param3, float param4, float param5, float param6) {
        jaclib.memory.Buffer var10 = this.lineVertices.map(7454, param2);
        if (var10 == null) {
          return false;
        }
        jaclib.memory.Stream var9 = this.a(param2, var10);
        if (!jaclib.memory.Stream.b()) {
          var9.b(param4);
          var9.b(param5);
          var9.b(param6);
          var9.b(param3);
          var9.b(param1);
          var9.b(param0);
        } else {
          var9.a(param4);
          var9.a(param5);
          var9.a(param6);
          var9.a(param3);
          var9.a(param1);
          var9.a(param0);
        }
        var9.a();
        return this.lineVertices.unmap(22957);
    }

    final void fillRectangle(int x, int y, int width, int height, int color, int blendMode) {
        this.f((byte) -104);
        this.setTextureConstantColor(false, color);
        this.setColorCombineSource(AccountRequestState.CONSTANT, 0, 0);
        this.setAlphaCombineSource(AccountRequestState.CONSTANT, 0, true);
        this.setBlendMode(blendMode, 13);
        this.modelTransform.setScale((float)height, (float)width, 0, 1.0f);
        this.modelTransform.translate(y, x, (byte) 107, 0);
        this.modelTransformChanged(0);
        this.setMultisampling(1, false);
        this.drawTriangleFan(2);
        this.setMultisampling(1, true);
        this.setAlphaCombineSource(LegacyVertexAttribute.TEXTURE, 0, true);
        this.setColorCombineSource(LegacyVertexAttribute.TEXTURE, 0, 0);
    }

    final void setDepthWriteEnabled(boolean enabled, int guard) {
        if (guard != 4) {
          this.f((byte) -69);
        }
        if ((!enabled ? 1 : 0) != (!this.depthWriteEnabled ? 1 : 0)) {
          this.depthWriteEnabled = enabled ? true : false;
          this.applyDepthWrite(120);
          this.field_ic = this.field_ic & -32;
        }
    }

    final void drawHorizontalLine(int x, int y, int length, int color, int blendMode) {
        this.drawLine(x, y, length + x, y, color, blendMode);
    }

    final int nearPlane() {
        return this.field_oc;
    }

    final ToolkitFont createFont(FontMetrics metrics, SpriteData[] glyphs, boolean useMaskGlyphs) {
        RuntimeException var4 = null;
        HardwareBitmapFont stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new HardwareBitmapFont(this, metrics, glyphs, useMaskGlyphs);
          return (ToolkitFont) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("aw.DF(");
          if (metrics == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (glyphs == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(useMaskGlyphs).append(')').toString());
        }
    }

    final void setClip(int left, int top, int right, int bottom) {
        if (left <= 0 && this.field_rb - 1 <= right && top <= 0 &&
          this.field_Sb - 1 <= bottom) {
          this.resetClip(-16088);
          return;
        }
        this.clipLeft = 0 > top ? 0 : top;
        this.clipBottom = this.field_rb < bottom ? 0 : bottom;
        this.clipRight = this.field_rb >= right ? right : 0;
        this.clipTop = left >= 0 ? left : 0;
        if (!this.scissorEnabled) {
          this.scissorEnabled = true;
          this.applyScissorEnabled(-87);
        }
        this.applyScissor(4);
        this.h((byte) -82);
    }

    abstract void applyAlphaTest(int guard);

    private final void invalidateOrthographicProjection(int guard) {
        this.orthographicValid = false;
        if (guard != 13) {
          this.O(109);
        }
        this.buildOrthographicProjection(0);
        if (PerlinNoise2D.ORTHOGRAPHIC == this.projectionMode) {
          this.projectionChanged(1);
        }
    }

    private final void applyAllRenderState(int guard) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        this.applyAmbientLightColor(7);
        this.applyDirectionalLightColors(0);
        this.applyLighting(false);
        this.applyPointLights(-95);
        this.applyLightPositions(guard - 75);
        this.J(0);
        this.applyDirectionalLightsEnabled(0);
        this.applyDepthTest(guard + 59);
        this.applyDepthWrite(guard + 120);
        this.applyFogEnabled((byte) -119);
        this.b(true);
        this.applyBlendEnabled((byte) -4);
        this.applyBlendFactors(guard - 19518);
        this.applyAlphaTest(-92);
        if (guard != -1) {
          this.modelTransform = (AffineTransform3D) null;
        }
        for (var2 = this.textureUnitCount - 1; var2 >= 0; var2--) {
          this.setActiveTextureUnit(var2, -114);
          this.applyColorCombineOperation((byte) -128);
          this.applyAlphaCombineOperation(-86);
          this.resetTextureTransform(0);
        }
        this.applyTextureConstantColor(1);
        this.applyViewport(guard + 1);
        this.applyProjectionMatrix(-2);
        this.applyModelMatrix(guard + 1);
        this.applyViewMatrix(-26911);
    }

    final void a(byte param0, TextureCombineOperation param1, TextureCombineOperation param2) {
        int var4_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = 0;
          if (param2 != this.field_K[this.activeTextureUnit]) {
            this.field_K[this.activeTextureUnit] = param2;
            var4_int = 1;
            this.applyColorCombineOperation((byte) -93);
          }
          if (param1 != this.field_B[this.activeTextureUnit]) {
            this.field_B[this.activeTextureUnit] = param1;
            this.applyAlphaCombineOperation(-126);
            var4_int = 1;
          }
          if (var4_int != 0) {
            this.field_ic = this.field_ic & -30;
          }
          if (param0 != -83) {
            this.usesNativeRendering();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("aw.FF(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    abstract void applyAlphaCombineOperation(int guard);

    HardwareGraphicsToolkit(java.awt.Canvas param0, Object param1, TextureProvider param2, ResourceArchive param3, int param4, int param5) {
        super(param2);
        int var8 = 0;
        TextureMetadata var9 = null;
        java.awt.Dimension var11 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        Throwable var7 = null;
        RuntimeException var7_ref = null;
        this.field_lb = new IntrusiveDeque();
        this.modelIdentity = true;
        this.modelTransform = new AffineTransform3D();
        AffineTransform3D discarded$3 = new AffineTransform3D();
        AffineTransform3D discarded$4 = new AffineTransform3D();
        this.viewTransform = new AffineTransform3D();
        this.scratchTransform = new AffineTransform3D();
        this.modelViewTransform = new AffineTransform3D();
        this.activeTextureUnit = 0;
        this.effectParameters1 = 0;
        this.orthographicValid = false;
        this.lightingSuppressed = false;
        this.field_qb = 1.0f;
        this.activeEffect = 0;
        this.field_G = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_oc = 50;
        this.field_mb = 0;
        this.field_Hb = 0;
        this.clipLeft = 0;
        this.lightingEnabled = false;
        this.field_Vb = -1;
        this.fogEnabled = true;
        this.field_bb = false;
        this.field_Yb = 3584;
        this.field_Ob = -1;
        this.field_jb = 1.0f;
        this.effectParameters0 = 0;
        this.field_C = -1;
        this.clipRight = 0;
        this.clipBottom = 0;
        this.field_w = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.field_sc = 512;
        this.field_fc = new float[16];
        this.blendFactors = LimitedRandomAccessFile.ALPHA_BLEND;
        this.field_zb = false;
        this.field_Z = true;
        this.field_y = 0;
        this.projectionMatrix = this.field_w;
        this.field_S = -1.0f;
        this.field_Kb = -1;
        this.blendMode = 1;
        this.field_u = true;
        this.effects = new ShaderEffect[10];
        this.depthTestEnabled = false;
        this.field_tc = 128;
        this.depthWriteEnabled = false;
        this.field_db = true;
        this.field_P = 0;
        this.orthographicMatrix = new float[16];
        this.perspectiveMatrix = new float[16];
        this.field_hb = -1.0f;
        this.modelViewValid = false;
        this.perspectiveValid = false;
        this.field_T = 1.0f;
        this.field_Xb = 1.0f;
        this.field_U = new float[]{0.0f, 0.0f, -1.0f, 0.0f};
        this.field_rc = 512;
        this.clipTop = 0;
        this.field_ob = true;
        this.field_r = 0;
        this.projectionMode = GameInstructions.field_k;
        this.field_H = false;
        this.field_k = -1;
        this.field_Nb = 0;
        this.field_J = 1.0f;
        this.field_cb = new jaclib.memory.Stream();
        AffineTransform3D discarded$5 = new AffineTransform3D();
        try {
          try {
            this.field_Ib = param1;
            this.field_ab = param3;
            this.field_Y = param4;
            var11 = param0.getSize();
            this.field_dc = param5;
            this.field_Sb = var11.height;
            this.field_rb = var11.width;
            RasterColorTables.retainColorTables(true, -107, false);
            if (null != this.textureProvider) {
              this.field_lc = new HardwareTextureCache(this, this.textureProvider);
              this.field_nc = new jagex3.graphics2.hw.NativeInterface(this.textureProvider.a(32075), this.field_dc);
              for (var8 = 0; var8 < this.textureProvider.a(32075); var8++) {
                var9 = this.textureProvider.a(-29193, var8);
                if (var9 != null) {
                  this.field_nc.initTextureMetrics(var8, var9.field_t, var9.field_g);
                }
              }
              return;
            }
            this.field_nc = new jagex3.graphics2.hw.NativeInterface(0, this.field_dc);
            this.field_lc = null;
            return;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var7 = decompiledCaughtException;
            var7.printStackTrace();
            this.close((byte) -60);
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var7_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var7_ref;
          stackIn_12_1 = new StringBuilder().append("aw.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void setLightingSuppressed(boolean suppressed, boolean guard) {
        if ((!this.lightingSuppressed ? 1 : 0) == (suppressed ? 1 : 0)) {
          this.lightingSuppressed = suppressed ? true : false;
          this.applyLighting(!guard ? true : false);
        }
        if (!guard) {
          this.field_kc = -110;
        }
    }

    abstract void applyScissorEnabled(int guard);

    final ToolkitSprite createSprite(int[] pixels, int offset, int stride, int width, int height, boolean copyPixels) {
        RuntimeException var7 = null;
        HardwareTextureSprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new HardwareTextureSprite(this, width, height, pixels, offset, stride);
          return (ToolkitSprite) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("aw.TB(");
          if (pixels == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(offset).append(',').append(stride).append(',').append(width).append(',').append(height).append(',').append(copyPixels).append(')').toString());
        }
    }

    final void setColorCombineSource(TextureCombineSource source, int argument, int guard) {
        if (guard != 0) {
          return;
        }
        try {
          this.setColorCombineSource((byte) 72, argument, false, false, source);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "aw.PB(" + (source != null ? "{...}" : "null") + ',' + argument + ',' + guard + ')');
        }
    }

    abstract VertexLayout a(VertexStreamLayout[] param0, byte param1);

    private final void textureTransformChanged(int guard) {
        if (guard != 128) {
          this.clipLeft = -58;
        }
        this.applyTextureMatrix(26803);
        if (this.activeShaderEffect != null) {
          this.activeShaderEffect.updateTextureUniforms((byte) -92);
        }
    }

    final void setProjection(int centerX, int centerY, int scaleX, int scaleY) {
        this.field_P = centerX;
        this.field_Hb = centerY;
        this.field_sc = scaleX;
        this.field_rc = scaleY;
        this.invalidateOrthographicProjection(13);
        this.invalidatePerspectiveProjection(2);
        this.d(false);
        this.h((byte) -128);
    }

    private final void fogChanged(byte guard) {
        if (this.activeShaderEffect != null) {
          this.activeShaderEffect.updateFogUniforms(260);
        }
        if (guard > -25) {
          return;
        }
        this.b(true);
    }

    void applyPointLights(int guard) {
        this.previousPointLightCount = this.pendingPointLightCount;
        if (guard >= -83) {
          this.clipLeft = -113;
        }
        this.pendingPointLightCount = 0;
    }

    final jaclib.memory.heap.NativeHeapBuffer allocateNativeBuffer(boolean guard, boolean allocationOption, int size) {
        if (guard) {
          this.field_C = -95;
        }
        return this.field_gb.a(size, allocationOption);
    }

    final AffineTransform3D modelViewTransform(byte guard) {
        if (!this.modelViewValid) {
          this.modelViewTransform.setProduct(this.viewTransform, (byte) 77, this.modelTransform);
          this.modelViewValid = true;
        }
        if (guard < 58) {
          return (AffineTransform3D) null;
        }
        return this.modelViewTransform;
    }

    abstract void bindVertexBuffer(int stream, int guard, VertexBuffer buffer);

    final void K(int param0) {
        if (4 != this.field_ic) {
          this.L(-25);
          this.setFogAllowed(false, -32);
          this.setLightingEnabled(111, false);
          this.setDepthTestEnabled(80, false);
          this.setDepthWriteEnabled(false, 4);
          this.a(-2, false, 50, false);
          this.setBlendMode(1, 13);
          this.h(96, 0);
          this.field_ic = 4;
        }
        if (param0 != 0) {
          this.field_Zb = (GpuTexture[]) null;
        }
    }

    final int farPlane() {
        return this.field_Yb;
    }

    void updateTime(int timeMillis) {
        if (this.field_lc != null) {
          this.field_lc.ageTextures(125);
        }
        this.field_kc = 2147483647 & timeMillis;
    }

    final void L(int param0) {
        ProjectionMode var2 = null;
        if (param0 != -25) {
          this.createHeap(-125);
        }
        if (this.projectionMode != PerlinNoiseSliceGenerator.field_h) {
          var2 = this.projectionMode;
          this.projectionMode = PerlinNoiseSliceGenerator.field_h;
          if (var2.usesViewTransform(-20011)) {
            this.viewTransformChanged(16);
          }
          this.c((byte) -88);
          this.projectionMatrix = this.field_fc;
          this.projectionChanged(param0 ^ -26);
          this.field_ic = this.field_ic & -25;
        }
    }

    final AffineTransform3D modelTransform(int guard) {
        if (guard <= 57) {
          return (AffineTransform3D) null;
        }
        return this.modelTransform;
    }

    final void resetTextureTransform(int guard) {
        if (guard != 0) {
          this.setTextureConstantColor(true, -85);
        }
        if (HotspotTextWidget.TEXTURE_TRANSFORM_DISABLED != this.textureTransformModes[this.activeTextureUnit]) {
          this.textureTransformModes[this.activeTextureUnit] = HotspotTextWidget.TEXTURE_TRANSFORM_DISABLED;
          this.textureTransforms[this.activeTextureUnit].setIdentity(1);
          this.textureTransformChanged(128);
        }
    }

    final Texture2D a(int[] param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        Texture2D stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -88) {
            this.lineVertices = (VertexBuffer) null;
          }
          stackIn_3_0 = this.a(param2, 0, param0, param4, -64, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("aw.CE(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    abstract void applyProjectionMatrix(int guard);

    abstract void applyTexCoordGeneration(int guard, TextureCoordinateGeneration mode);

    abstract VertexBuffer createVertexBuffer(byte guard, boolean dynamic);

    final void drawTriangleFan(int primitiveCount) {
        this.drawDynamicPrimitives(0, AccountServiceResult.TRIANGLE_FAN, primitiveCount);
    }

    final void setActiveTextureUnit(int unit, int guard) {
        if (guard > -107) {
          return;
        }
        if (unit != this.activeTextureUnit) {
          this.activeTextureUnit = unit;
          this.applyActiveTexture(-31);
        }
    }

    abstract void applyModelMatrix(int guard);

    private final void p(int param0) {
        if (param0 != 5) {
          this.field_k = -39;
        }
    }

    final int v(int param0) {
        if (param0 != 15) {
          return -11;
        }
        return this.field_k;
    }

    abstract void c(int param0, int param1);

    final int S(int param0) {
        int var2 = -108 / ((64 - param0) / 32);
        return this.field_Ob;
    }

    private final boolean o(byte param0) {
        if (param0 != 24) {
          this.applyActiveTexture(83);
        }
        return this.effects[3].isSupported((byte) -59);
    }

    abstract void applyDepthTest(int guard);

    abstract void applyDepthWrite(int guard);

    private final void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        int stackIn_10_0 = 0;
        int var8;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 2147483647) {
          this.activeShaderEffect = (ShaderEffect) null;
        }
        param3 = param3 & this.o((byte) 24);
        if (!param3 && (param5 == 4 ||
          8 == param5 ||
          9 == param5)) {
          param5 = 2;
          if (param5 == 4) {
            stackIn_10_0 = 1 & param4;
          } else {
            stackIn_10_0 = 1;
          }
          param2 = stackIn_10_0;
          param4 = 0;
        }
        if (param5 != 0 &&
          param1) {
          param5 = param5 | -2147483648;
        }
        if (param5 == this.activeEffect) {
          if (this.activeEffect != 0) {
            this.effects[this.activeEffect & 2147483647].refreshState(param1, (byte) -127);
            if (param4 != this.effectParameters0 ||
              this.effectParameters1 != param2) {
              this.effects[2147483647 & this.activeEffect].setParameters(34023, param2, param4);
              this.effectParameters0 = param4;
              this.effectParameters1 = param2;
            }
          }
        } else {
          if (this.activeEffect != 0) {
            this.effects[this.activeEffect & 2147483647].disable(false);
          }
          if (param5 != 0) {
            this.activeShaderEffect = this.effects[2147483647 & param5];
            this.activeShaderEffect.enable(param1, 20186);
            this.activeShaderEffect.refreshState(param1, (byte) -79);
            this.activeShaderEffect.setParameters(param0 ^ 2147449624, param2, param4);
          } else {
            this.activeShaderEffect = null;
          }
          this.activeEffect = param5;
          this.effectParameters1 = param2;
          this.effectParameters0 = param4;
        }
    }

    abstract void applyDirectionalLightColors(int arrayOffset);

    final void w(int param0) {
        if (2 != this.field_ic) {
          this.L(-25);
          this.setFogAllowed(false, -32);
          this.setLightingEnabled(param0 + 109, false);
          this.setDepthTestEnabled(83, false);
          this.setDepthWriteEnabled(false, 4);
          this.a(-2, false, param0 + 40, false);
          this.field_ic = 2;
        }
        if (param0 != 10) {
          this.a(-53, true, 73, false);
        }
    }

    final int e(byte param0) {
        if (param0 < 5) {
          TextureFormat var3 = (TextureFormat) null;
          this.a((GpuDataType) null, (TextureFormat) null, -127, 20, (byte) -94);
        }
        return this.field_mb;
    }

    final void h(int param0, int param1) {
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 <= 28) {
          this.modelViewValid = true;
        }
        if (param1 == 1) {
          this.a((byte) -83, lf.REPLACE, lf.REPLACE);
        } else {
          if (0 == param1) {
            this.a((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
          } else {
            if (param1 == 2) {
              this.a((byte) -83, lf.REPLACE, OpenGlBuffer.INTERPOLATE);
            } else {
              if (param1 == 3) {
                this.a((byte) -83, SlowBurstParticle.MODULATE, LoginForm.ADD);
              } else {
                if (param1 == 4) {
                  this.a((byte) -83, EmailAvailabilityRequest.SUBTRACT, EmailAvailabilityRequest.SUBTRACT);
                }
              }
            }
          }
        }
    }

    final int estimatedResourceBytes(int guard) {
        int var2 = 21 % ((-37 - guard) / 47);
        return this.field_Cb + (this.field_o + this.field_pc);
    }

    final void a(int param0, boolean param1, int param2, boolean param3) {
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        Object var5;
        int var6;
        int var7;
        int var8;
        int var9;
        TextureMetadata var10;
        int var11;
        int var12;
        AffineTransform3D var13;
        int var14;
        var14 = Sumoblitz.field_L ? 1 : 0;
        if (param2 != 50) {
          TEXTURE_PROJECTED = (TextureTransformMode) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_Vb == param0) {
          stackIn_6_0 = (this.field_fb) ? 0 : 1;
          if (this.field_bb) {
            stackIn_9_1 = 0;
          } else {
            stackIn_9_1 = 1;
          }
          decompiledFrameRemainder0 = (stackIn_6_0 != stackIn_9_1);
        }
        if (decompiledFrameRemainder0) {
          var5 = null;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          stackIn_14_0 = (!this.field_fb) ? 0 : 3;
          var9 = stackIn_14_0;
          if (0 > param0) {
            this.resetTextureTransform(0);
          } else {
            var5 = this.field_lc.getTexture(param2 + 37, param0);
            var10 = this.textureProvider.a(-29193, param0);
            if (var10.field_c == 0 &&
              var10.field_u == 0) {
              this.resetTextureTransform(0);
            } else {
              stackIn_21_0 = (var10.field_n) ? 64 : 128;
              var11 = stackIn_21_0;
              var12 = var11 * 50;
              var13 = this.textureTransform(0);
              var13.setTranslation((float)(this.field_kc % var12 * var10.field_u) / (float)var12, 0.0f, (float)(var10.field_c * (this.field_kc % var12)) / (float)var12, param2 - 50);
              this.setTextureTransformMode(IntList.TEXTURE_COUNT2, param2 + 28830);
            }
            var6 = var10.field_q;
            if (!this.field_fb) {
              var9 = var10.field_d;
              var8 = var10.field_h;
              var7 = var10.field_j;
            }
          }
          this.a(2147483647, param1, var8, param3, var7, var9);
          if (null == this.activeShaderEffect) {
            this.a((GpuTexture) (var5), 117);
            this.h(45, var6);
          } else {
            this.activeShaderEffect.bindTexture(var6, 18834, (GpuTexture) (var5));
          }
          this.field_bb = this.field_fb;
          this.field_Vb = param0;
        }
        this.field_ic = this.field_ic & -8;
    }

    abstract void b(boolean param0);

    final AffineTransform3D viewTransform(byte guard) {
        if (guard != -28) {
          return (AffineTransform3D) null;
        }
        return this.viewTransform;
    }

    abstract void setMultisampling(int guard, boolean enabled);

    final void s(byte param0) {
        java.awt.Canvas var3_ref_java_awt_Canvas = null;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        Enumeration var2 = this.field_Q.keys();
        while (var2.hasMoreElements()) {
          var3_ref_java_awt_Canvas = (java.awt.Canvas) (var2.nextElement());
          this.releaseSurface(var3_ref_java_awt_Canvas, this.field_Q.get(var3_ref_java_awt_Canvas), 0);
        }
        int var3 = 82 % ((11 - param0) / 51);
        this.dynamicVertices.close(12001);
        this.lineVertices.close(12001);
        this.field_Qb.close(12001);
        this.field_gc.close((byte) 100);
        this.field_qc.close((byte) 20);
        this.field_hc.close((byte) -128);
        this.field_Fb.close((byte) 7);
        this.field_ib.close((byte) -123);
        this.field_yb.closeDynamicVertices(-19073);
        this.field_M.close(12001);
    }

    final void setFogAllowed(boolean allowed, int guard) {
        if (guard != -32) {
          this.viewTransform((byte) -79);
        }
        if (allowed != this.fogAllowed) {
          this.fogAllowed = allowed ? true : false;
          this.applyFogEnabled((byte) -119);
          this.field_ic = this.field_ic & -32;
        }
    }

    abstract void applyTextureMatrix(int guard);

    private final void updateProjectionDepthTerms(byte guard) {
        this.perspectiveMatrix[10] = this.field_q;
        this.perspectiveMatrix[14] = this.field_kb;
        if (guard != -83) {
          this.field_Tb = 1.2932486534118652f;
        }
    }

    final void P(int param0) {
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        Hashtable var2 = new Hashtable();
        if (param0 >= -26) {
          return;
        }
        if (null != this.field_Q &&
          !this.field_Q.isEmpty()) {
          var3 = this.field_Q.keys();
          while (var3.hasMoreElements()) {
            var4 = (java.awt.Canvas) (var3.nextElement());
            var2.put(var4, this.a(var4, 3));
          }
        }
        this.field_Q = var2;
        this.O(5);
        this.createLineBuffer((byte) 121);
        this.y(-101);
        this.field_yb.allocateDynamicVertices(117, this);
    }

    private final void buildOrthographicProjection(int guard) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float var8;
        float[] var9;
        if (!this.orthographicValid) {
          var9 = this.orthographicMatrix;
          var2 = var9;
          var3 = (float)this.field_oc;
          var4 = (float)this.field_Yb;
          var5 = (float)(-this.field_Hb) * this.field_qb / (float)this.field_rc;
          var6 = (float)(-this.field_P) * this.field_qb / (float)this.field_sc;
          var7 = (float)(-this.field_P + this.field_rb) * this.field_qb / (float)this.field_sc;
          var8 = (float)(this.field_Sb - this.field_Hb) * this.field_qb / (float)this.field_rc;
          if (var6 != var7 &&
            var5 != var8) {
            var9[14] = var3 / (var3 - var4);
            var9[1] = 0.0f;
            var9[10] = 1.0f / (-var4 + var3);
            var9[6] = 0.0f;
            var9[15] = 1.0f;
            var9[8] = 0.0f;
            var9[9] = 0.0f;
            var9[2] = 0.0f;
            var9[7] = 0.0f;
            var9[11] = 0.0f;
            var9[5] = 2.0f / (-var5 + var8);
            var9[12] = (var7 + var6) / (-var7 + var6);
            var9[0] = 2.0f / (-var6 + var7);
            var9[3] = 0.0f;
            var9[4] = 0.0f;
            var9[13] = (var8 + var5) / (-var5 + var8);
          } else {
            var2[9] = 0.0f;
            var2[5] = 1.0f;
            var2[3] = 0.0f;
            var2[15] = 1.0f;
            var2[6] = 0.0f;
            var2[12] = 0.0f;
            var2[14] = 0.0f;
            var2[11] = 0.0f;
            var2[7] = 0.0f;
            var2[0] = 1.0f;
            var2[8] = 0.0f;
            var2[1] = 0.0f;
            var2[13] = 0.0f;
            var2[10] = 1.0f;
            var2[2] = 0.0f;
            var2[4] = 0.0f;
          }
          this.p(guard + 5);
          this.orthographicValid = true;
        }
        if (guard != 0) {
          this.nearPlane();
        }
    }

    final CubeTexture environmentCubeTexture(byte guard) {
        if (guard != 122) {
          HardwareGraphicsToolkit.j((byte) 73);
        }
        if (this.environmentSource == null) {
          return null;
        }
        return this.environmentSource.cubeTexture(guard ^ 37);
    }

    abstract Texture2D a(int param0, int param1, boolean param2, int param3, float[] param4, int param5, byte param6, TextureFormat param7);

    abstract void setAlphaCombineSource(int argument, boolean invert, byte guard, TextureCombineSource source);

    ShaderEffect createShaderEffect(int guard, int effectId) {
        int var3;
        int var4;
        VertexStreamLayout[] var5;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 0) {
          var5 = (VertexStreamLayout[]) null;
          this.a((VertexStreamLayout[]) null, (byte) -48);
        }
        var3 = effectId;
        if (var3 == 6) {
          return (ShaderEffect) ((Object) new HardwareUnlitEffect(this));
        }
        if (var3 == 1) {
          return (ShaderEffect) ((Object) new HardwareSpecularEffect(this));
        }
        if (2 == var3) {
          return (ShaderEffect) ((Object) new HardwareAnimatedWaterEffect(this, this.waterTextures));
        }
        if (7 != var3) {
          return (ShaderEffect) ((Object) new FallbackShaderEffect(this));
        }
        return (ShaderEffect) ((Object) new HardwareReflectionEffect(this));
    }

    abstract void applyActiveTexture(int guard);

    abstract Texture2D a(boolean param0, int param1, int[] param2, int param3, int param4, int param5, int param6);

    private final void buildPerspectiveProjection(int guard) {
        int var2;
        float[] var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float[] var9;
        float[] var10;
        float var8;
        var2 = 115 / ((39 - guard) / 47);
        if (!this.perspectiveValid) {
          var10 = this.perspectiveMatrix;
          var9 = var10;
          var3 = var9;
          var4 = (float)(this.field_oc * -this.field_P) / (float)this.field_sc;
          var5 = (float)(this.field_oc * (-this.field_P + this.field_rb)) / (float)this.field_sc;
          var6 = (float)(this.field_Hb * this.field_oc) / (float)this.field_rc;
          var7 = (float)(this.field_oc * (this.field_Hb - this.field_Sb)) / (float)this.field_rc;
          if (var5 != var4 &&
            var7 != var6) {
            var8 = (float)this.field_oc * 2.0f;
            var3[0] = var8 / (-var4 + var5);
            var3[1] = 0.0f;
            var3[4] = 0.0f;
            var3[9] = (var6 + var7) / (var6 - var7);
            var3[15] = 0.0f;
            var3[5] = var8 / (-var7 + var6);
            var3[8] = (var5 + var4) / (-var4 + var5);
            this.field_kb = (float)(this.field_Yb * this.field_oc) / (float)(-this.field_Yb + this.field_oc);
            var3[14] = (float)(this.field_Yb * this.field_oc) / (float)(-this.field_Yb + this.field_oc);
            var3[6] = 0.0f;
            var3[2] = 0.0f;
            var10[11] = -1.0f;
            var3[12] = 0.0f;
            var3[7] = 0.0f;
            var3[13] = 0.0f;
            var3[3] = 0.0f;
            this.field_q = (float)this.field_Yb / (float)(this.field_oc - this.field_Yb);
            var3[10] = (float)this.field_Yb / (float)(this.field_oc - this.field_Yb);
          } else {
            var3[5] = 1.0f;
            var3[11] = 0.0f;
            var3[9] = 0.0f;
            var3[8] = 0.0f;
            var3[12] = 0.0f;
            var3[0] = 1.0f;
            var3[6] = 0.0f;
            var3[2] = 0.0f;
            var3[7] = 0.0f;
            var3[3] = 0.0f;
            var3[15] = 1.0f;
            var3[13] = 0.0f;
            var3[10] = 1.0f;
            var3[14] = 0.0f;
            var3[4] = 0.0f;
            var3[1] = 0.0f;
          }
          this.updateProjectionDepthTerms((byte) -83);
          this.perspectiveValid = true;
        }
    }

    static {
        TEXTURE_PROJECTED = new TextureTransformMode();
    }
}
