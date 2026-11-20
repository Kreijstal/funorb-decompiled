/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class GpuToolkit extends GraphicsToolkit {
    private jaclib.memory.heap.NativeHeap field_jc;
    static String[] field_Yb;
    WaterTextures field_Mb;
    private IntrusiveDeque field_s;
    Object field_qc;
    private Hashtable field_rb;
    int viewportWidth;
    long field_peer;
    int viewportHeight;
    private jagex3.graphics2.hw.NativeInterface field_Zb;
    ResourceArchive field_Ab;
    jaclib.memory.heap.NativeHeapBuffer field_m;
    boolean field_ec;
    int field_Nb;
    GpuTransform3D modelTransform;
    int field_mb;
    int field_ob;
    private GpuTransform3D field_t;
    private GpuTransform3D field_f;
    GpuTransform3D viewTransform;
    private GpuTransform3D inverseViewTransform;
    private GpuTransform3D modelViewTransform;
    int scissorBottom;
    int field_pc;
    boolean depthWriteEnabled;
    float ambientIntensity;
    int field_Qb;
    TextureCombineOperation[] rgbCombineOperations;
    float lightGreen;
    private float[] screenProjection;
    boolean field_M;
    int field_L;
    float lightRed;
    boolean field_uc;
    private int underwaterFogColor;
    boolean lightingSuppressed;
    private boolean modelViewValid;
    private int field_lb;
    private GpuTexture[] textures;
    int viewportX;
    private int materialTextureId;
    private float[] field_fb;
    int activeTextureUnit;
    private float[] orthographicProjection;
    int field_h;
    private float[] field_Db;
    int field_lc;
    private float[] perspectiveProjection;
    float[] projectionMatrix;
    private int waterPlaneDistance;
    float field_p;
    PointLight[] pointLights;
    private boolean orthographicProjectionValid;
    private int materialEffectId;
    float[] antiSunDirection;
    float[] sunDirection;
    private GpuMaterialEffect[] materialEffects;
    private atb field_I;
    TextureCombineOperation[] alphaCombineOperations;
    private float field_B;
    int previousPointLightCount;
    int scissorLeft;
    boolean field_sc;
    private boolean field_hc;
    private boolean field_q;
    private GpuMaterialEffect materialEffect;
    int scissorRight;
    private int field_k;
    int scissorTop;
    private int underwaterFogStrength;
    private int field_V;
    private je field_Ib;
    private jaclib.memory.Stream bufferWriter;
    boolean lightingEnabled;
    private GpuEnvironmentMapSource field_kc;
    private int field_e;
    float antiSunIntensity;
    private int materialParameter2;
    int field_Wb;
    float field_r;
    private int field_tb;
    private int field_Gb;
    boolean depthTestEnabled;
    float lightBlue;
    int field_j;
    boolean field_g;
    private int underwaterDepthScale;
    private int field_K;
    boolean alphaTestEnabled;
    private float field_Z;
    boolean field_vb;
    private float[] clipSpaceProjection;
    int viewportY;
    GpuTexture field_Q;
    private float field_xb;
    private boolean screenProjectionValid;
    GpuTransform3D[] textureTransforms;
    private boolean perspectiveProjectionValid;
    boolean effectFogEnabled;
    boolean fogEnabled;
    GpuProjectionMode projectionMode;
    int field_qb;
    private int blendMode;
    TextureTransformMode[] textureTransformModes;
    private int materialParameter1;
    int pointLightCount;
    int textureConstantColor;
    int field_n;
    float sunIntensity;
    boolean blendingEnabled;
    int field_rc;
    private boolean field_Tb;
    ConsoleCommandRegistry blendFunction;
    private GpuVertexBuffer quadVertexBuffer;
    private GpuVertexDeclaration circleVertexDeclaration;
    private GpuModel field_w;
    private GpuVertexDeclaration quadVertexDeclaration;
    private GpuVertexDeclaration lineVertexDeclaration;
    GpuVertexDeclaration field_Vb;
    private GpuModel field_D;
    private GpuVertexBuffer circleVertexBuffer;
    private GpuModel field_hb;
    private GpuModel field_Jb;
    private GpuModel field_R;
    private GpuVertexBuffer lineVertexBuffer;
    private GpuIndexBuffer field_T;
    boolean scissorEnabled;

    final boolean supportsShadows() {
        return true;
    }

    abstract void applyDepthWriteEnabled(int param0);

    void initializeRenderState(int param0) {
        this.applyRenderState((byte) 92);
        if (param0 < 106) {
          this.supportsShadows();
        }
    }

    final void setClip(int param0, int param1, int param2, int param3) {
        if (param0 <= 0 && -1 + this.viewportWidth <= param2 && param1 <= 0 &&
          param3 >= -1 + this.viewportHeight) {
          this.resetScissor(-120);
          return;
        }
        this.scissorTop = param1 >= 0 ? param1 : 0;
        this.scissorRight = param2 > this.viewportWidth ? 0 : param2;
        this.scissorBottom = this.viewportWidth >= param3 ? param3 : 0;
        this.scissorLeft = param0 >= 0 ? param0 : 0;
        if (!this.scissorEnabled) {
          this.scissorEnabled = true;
          this.applyScissorEnabled((byte) 81);
        }
        this.applyScissorRectangle((byte) -99);
        this.onClipChanged((byte) -114);
    }

    final void drawUnitQuadTriangles(byte param0) {
        if (param0 > -51) {
          this.field_kc = (GpuEnvironmentMapSource) null;
        }
        this.drawUnitQuad(0, UiViewport.field_v, 2);
    }

    final GpuTransform3D getModelTransform(int param0) {
        if (param0 != 11) {
          TextureCombineSource var3 = (TextureCombineSource) null;
          this.setAlphaCombineSource(-91, (byte) 122, (TextureCombineSource) null);
        }
        return this.modelTransform;
    }

    final void setAmbientLight(float param0) {
        if (param0 != this.ambientIntensity) {
          this.ambientIntensity = param0;
          this.field_Zb.setAmbient(param0);
          this.applyAmbientLight(true);
          this.commitDirectionalLights((byte) 44);
        }
    }

    abstract void setAlphaCombineSource(boolean param0, byte param1, TextureCombineSource param2, int param3);

    abstract void applyTextureConstantColor(byte param0);

    abstract void applyDirectionalLightColors(byte param0);

    final void setLightingEnabled(byte param0, boolean param1) {
        if ((!this.lightingEnabled ? 1 : 0) != (!param1 ? 1 : 0)) {
          this.lightingEnabled = param1 ? true : false;
          this.applyLightingEnabled(-78);
          this.field_V = this.field_V & -8;
        }
        if (param0 >= -11) {
          this.field_ob = 42;
        }
    }

    private final void updateModelTransform(int param0) {
        float var2 = 0.0f;
        if (param0 != 0) {
          return;
        }
        if (GetMassDriverFireForce.field_p == this.projectionMode) {
          var2 = this.getPixelOffset((byte) -128);
          this.modelTransform.translate(0.0f, var2, var2, (byte) 13);
        }
        this.modelViewValid = false;
        this.applyModelTransform((byte) 98);
        if (this.materialEffect != null) {
          this.materialEffect.onModelTransformChanged(5);
        }
    }

    final GpuTransform3D getModelViewTransform(int param0) {
        if (!this.modelViewValid) {
          this.modelViewTransform.setProduct(this.modelTransform, this.viewTransform, true);
          this.modelViewValid = true;
        }
        if (param0 != 0) {
          this.activeTextureUnit = 111;
        }
        return this.modelViewTransform;
    }

    final void fillRectangle(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.preparePrimitiveDraw(false);
        this.setTextureConstantColor(-126, param4);
        this.setRgbCombineSource(0, pea.field_d, 7);
        this.setAlphaCombineSource(0, (byte) -108, pea.field_d);
        this.setBlendMode(99, param5);
        this.modelTransform.setScale(5557, (float)param2, (float)param3, 1.0f);
        this.modelTransform.translate(param1, 16383, 0, param0);
        this.markModelTransformChanged(20837);
        this.setMultisampleEnabled(-44, false);
        this.drawUnitQuadTriangles((byte) -64);
        this.setMultisampleEnabled(-86, true);
        this.setAlphaCombineSource(0, (byte) -53, SetGrapplingHookMaxExtension8Force.field_q);
        this.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
    }

    private final void updateDepthRange(int param0) {
        if (null != this.materialEffect) {
          this.materialEffect.onDepthRangeChanged(true);
        }
        if (param0 <= 105) {
          this.lineVertexBuffer = (GpuVertexBuffer) null;
        }
        this.applyFogParameters(8);
    }

    abstract void applyFogParameters(int param0);

    abstract void applyScissorEnabled(byte param0);

    final void setAlphaCombineSource(int param0, byte param1, TextureCombineSource param2) {
        try {
          if (param1 >= -48) {
            this.sunIntensity = -0.04896149784326553f;
          }
          this.setAlphaCombineSource(false, (byte) 94, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pf.SE(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    abstract float getPixelOffset(byte param0);

    private final void applyRenderState(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        this.applyAmbientLight(true);
        this.applyDirectionalLightColors((byte) 65);
        this.applyLightingEnabled(-51);
        this.applyPointLights(68);
        this.applyDirectionalLightDirections(3);
        this.commitDirectionalLights((byte) -119);
        this.applyDirectionalLightsEnabled(false);
        this.applyDepthTestEnabled(12614);
        this.applyDepthWriteEnabled(-43);
        this.applyFogEnabled(1);
        this.applyFogParameters(8);
        if (param0 <= 14) {
          this.modelViewValid = false;
        }
        this.applyBlendingEnabled((byte) -56);
        this.applyBlendFunction((byte) -39);
        this.applyAlphaTestEnabled(17634);
        for (var2 = -1 + this.field_L; var2 >= 0; var2--) {
          this.setActiveTextureUnit(var2, -63);
          this.applyRgbCombineOperation(-88);
          this.applyAlphaCombineOperation((byte) 116);
          this.resetTextureTransform((byte) 112);
        }
        this.applyTextureConstantColor((byte) -109);
        this.applyViewport((byte) 107);
        this.applyProjectionMatrix((byte) -65);
        this.applyModelTransform((byte) 114);
        this.applyViewTransform(17891);
    }

    abstract void applyLightingEnabled(int param0);

    final GpuTexture2D createTexture2DFromPixels(int param0, boolean param1, int param2, byte param3, int[] param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        GpuTexture2D stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -43 / ((23 - param3) / 56);
          stackIn_1_0 = this.createTexture2DFromPixels(param0, param1, param4, param2, 0, true, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("pf.IE(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean supportsOffscreenRendering() {
        return false;
    }

    private final void onClipChanged(byte param0) {
        if (param0 >= -61) {
          this.getGpuMemoryUsage(-117);
        }
    }

    final GpuTransform3D getTextureTransform(int param0) {
        if (param0 != 0) {
          this.screenProjectionValid = false;
        }
        return this.textureTransforms[this.activeTextureUnit];
    }

    final void fillCircle(int param0, int param1, int param2, int param3, int param4) {
        this.preparePrimitiveDraw(false);
        this.setTextureConstantColor(-128, param3);
        this.setRgbCombineSource(0, pea.field_d, 7);
        this.setAlphaCombineSource(0, (byte) -65, pea.field_d);
        this.setBlendMode(83, param4);
        this.modelTransform.setScale(5557, (float)param2, (float)param2, 1.0f);
        this.modelTransform.translate(param1, 16383, 0, param0);
        this.markModelTransformChanged(20837);
        this.setMultisampleEnabled(-114, false);
        this.setVertexBuffer((byte) -6, this.circleVertexBuffer, 0);
        this.setVertexDeclaration(-51, this.circleVertexDeclaration);
        this.drawPrimitive(UiViewport.field_v, 0, 256, 66);
        this.setMultisampleEnabled(-82, true);
        this.setAlphaCombineSource(0, (byte) -122, SetGrapplingHookMaxExtension8Force.field_q);
        this.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
    }

    abstract void applyAlphaTestEnabled(int param0);

    final void setTextureCombineMode(int param0, int param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var4 = VoidHunters.field_G;
        if (param1 == 1) {
          this.setTextureCombineOperations(MissionVariable.field_c, true, MissionVariable.field_c);
        } else {
          if (param1 == 0) {
            this.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, OpenGlGlyphMask.field_a);
          } else {
            if (param1 == 2) {
              this.setTextureCombineOperations(MissionVariable.field_c, true, SetThrusterBindingMoveAndTurnHasOppositeMove.field_o);
            } else {
              if (param1 == 3) {
                this.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, je.field_c);
              } else {
                if (param1 != 4) {
                  var3 = 106 / ((-56 - param0) / 59);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  this.setTextureCombineOperations(ToolkitRasterStateCache.field_a, true, ToolkitRasterStateCache.field_a);
                }
              }
            }
          }
        }
        if (decompiledFrameRemainder0) {
          var3Lifetime1 = 106 / ((-56 - param0) / 59);
        }

    }

    void applyPointLights(int param0) {
        this.previousPointLightCount = this.pointLightCount;
        if (param0 < 66) {
          return;
        }
        this.pointLightCount = 0;
    }

    private final void buildScreenProjection(int param0) {
        float[] var2;
        float[] var3;
        if (param0 != 1761) {
          this.applyTextureConstantColor((byte) -73);
        }
        if (!this.screenProjectionValid) {
          var3 = this.screenProjection;
          var2 = var3;
          if (this.viewportWidth != 0 &&
            this.viewportHeight != 0) {
            var2[9] = 0.0f;
            var2[11] = 0.0f;
            var2[3] = 0.0f;
            var2[1] = 0.0f;
            var2[10] = 0.5f;
            var2[14] = 0.5f;
            var2[5] = -2.0f / (float)this.viewportHeight;
            var2[8] = 0.0f;
            var2[2] = 0.0f;
            var2[0] = 2.0f / (float)this.viewportWidth;
            var2[6] = 0.0f;
            var2[13] = 1.0f;
            var2[7] = 0.0f;
            var2[15] = 1.0f;
            var2[4] = 0.0f;
            var2[12] = -1.0f;
          } else {
            var3[2] = 0.0f;
            var3[4] = 0.0f;
            var3[12] = 0.0f;
            var3[8] = 0.0f;
            var3[1] = 0.0f;
            var3[6] = 0.0f;
            var3[0] = 1.0f;
            var3[14] = 0.0f;
            var3[5] = 1.0f;
            var3[9] = 0.0f;
            var3[7] = 0.0f;
            var3[15] = 1.0f;
            var3[13] = 0.0f;
            var3[11] = 0.0f;
            var3[10] = 1.0f;
            var3[3] = 0.0f;
          }
          this.screenProjectionValid = true;
        }
    }

    final void setDirectionalLighting(int param0, float param1, float param2, float param3, float param4, float param5) {
        int stackIn_3_0 = 0;
        int var7;
        float var8;
        stackIn_3_0 = (this.field_tb == param0) ? 0 : 1;
        var7 = stackIn_3_0;
        if (var7 != 0 ||
          param1 != this.sunIntensity ||
          this.antiSunIntensity != param2) {
          this.sunIntensity = param1;
          this.antiSunIntensity = param2;
          this.field_tb = param0;
          if (var7 != 0) {
            this.lightRed = (float)(16711680 & this.field_tb) / 16711680.0f;
            this.lightGreen = (float)(this.field_tb & 65280) / 65280.0f;
            this.lightBlue = (float)(255 & this.field_tb) / 255.0f;
            this.applyAmbientLight(true);
          }
          this.field_Zb.setSunColour(this.lightRed, this.lightGreen, this.lightBlue, param1, param2);
          this.applyDirectionalLightColors((byte) 56);
        }
        if (this.field_Db[0] != param3 ||
          this.field_Db[1] != param4 ||
          this.field_Db[2] != param5) {
          this.field_Db[1] = param4;
          this.field_Db[2] = param5;
          this.field_Db[0] = param3;
          this.field_fb[2] = -param5;
          this.field_fb[1] = -param4;
          this.field_fb[0] = -param3;
          var8 = (float)(1.0 / Math.sqrt((double)(param5 * param5 + (param4 * param4 + param3 * param3))));
          this.sunDirection[1] = var8 * param4;
          this.sunDirection[0] = var8 * param3;
          this.sunDirection[2] = var8 * param5;
          this.antiSunDirection[0] = -this.sunDirection[0];
          this.antiSunDirection[1] = -this.sunDirection[1];
          this.antiSunDirection[2] = -this.sunDirection[2];
          this.field_Zb.setSunDirection(this.sunDirection[0], this.sunDirection[1], this.sunDirection[2]);
          this.applyDirectionalLightDirections(3);
        }
        this.commitDirectionalLights((byte) -120);
    }

    final int getNearPlane() {
        return this.field_h;
    }

    private final void updateViewTransform(int param0) {
        if (param0 != 0) {
          this.blendMode = -87;
        }
        this.modelViewValid = false;
        if (this.materialEffect != null) {
          this.materialEffect.onViewTransformChanged((byte) 15);
        }
        this.applyViewTransform(17891);
    }

    private final void updateOrthographicProjection(boolean param0) {
        this.orthographicProjectionValid = false;
        this.buildOrthographicProjection((byte) 97);
        if (UsernameAvailabilityValidator.field_h == this.projectionMode) {
          this.updateProjection(17975);
        }
        if (!param0) {
          this.updateDepthRange(27);
        }
    }

    GpuToolkit(java.awt.Canvas param0, Object param1, TextureProvider param2, ResourceArchive param3, int param4, int param5) {
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
        this.field_s = new IntrusiveDeque();
        this.field_ec = true;
        this.modelTransform = new GpuTransform3D();
        this.field_t = new GpuTransform3D();
        this.field_f = new GpuTransform3D();
        this.viewTransform = new GpuTransform3D();
        this.inverseViewTransform = new GpuTransform3D();
        this.modelViewTransform = new GpuTransform3D();
        this.lightingSuppressed = false;
        this.depthWriteEnabled = false;
        this.viewportX = 0;
        this.underwaterFogColor = -1;
        this.field_h = 50;
        this.screenProjection = new float[16];
        this.modelViewValid = false;
        this.scissorBottom = 0;
        this.perspectiveProjection = new float[16];
        this.field_M = true;
        this.field_Db = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.ambientIntensity = 1.0f;
        this.activeTextureUnit = 0;
        this.field_B = 1.0f;
        this.scissorLeft = 0;
        this.field_Qb = 0;
        this.orthographicProjection = new float[16];
        this.field_k = 512;
        this.field_fb = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.lightGreen = 1.0f;
        this.field_q = false;
        this.field_j = -1;
        this.materialParameter2 = 0;
        this.scissorRight = 0;
        this.field_Gb = 0;
        this.antiSunIntensity = -1.0f;
        this.underwaterDepthScale = -1;
        this.lightBlue = 1.0f;
        this.lightingEnabled = false;
        this.field_hc = false;
        this.field_lb = 512;
        this.field_lc = -1;
        this.materialEffectId = 0;
        this.depthTestEnabled = false;
        this.field_K = 0;
        this.field_Wb = 3584;
        this.materialEffects = new GpuMaterialEffect[10];
        this.antiSunDirection = new float[]{0.0f, 0.0f, -1.0f, 0.0f};
        this.screenProjectionValid = false;
        this.field_g = true;
        this.clipSpaceProjection = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.projectionMode = SetVariableAction.field_c;
        this.viewportY = 0;
        this.blendMode = 1;
        this.projectionMatrix = this.clipSpaceProjection;
        this.sunDirection = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.materialTextureId = -1;
        this.perspectiveProjectionValid = false;
        this.orthographicProjectionValid = false;
        this.field_tb = 16777215;
        this.alphaTestEnabled = true;
        this.effectFogEnabled = true;
        this.underwaterFogStrength = 0;
        this.materialParameter1 = 0;
        this.sunIntensity = -1.0f;
        this.lightRed = 1.0f;
        this.blendingEnabled = true;
        this.scissorTop = 0;
        this.blendFunction = GetGrapplingHookRopeBreakLength.field_o;
        this.field_n = 128;
        this.bufferWriter = new jaclib.memory.Stream();
        GpuTransform3D discarded$1 = new GpuTransform3D();
        try {
          try {
            this.field_Ab = param3;
            this.field_rc = param4;
            this.field_qc = param1;
            var11 = param0.getSize();
            this.field_e = param5;
            this.viewportHeight = var11.height;
            this.viewportWidth = var11.width;
            PasswordValidator.a(false, (byte) 33, true);
            if (this.field_a != null) {
              this.field_I = new atb(this, this.field_a);
              this.field_Zb = new jagex3.graphics2.hw.NativeInterface(this.field_a.getTextureCount(11316), this.field_e);
              for (var8 = 0; var8 < this.field_a.getTextureCount(11316); var8++) {
                var9 = this.field_a.getTextureMetadata(-20292, var8);
                if (var9 != null) {
                  this.field_Zb.initTextureMetrics(var8, var9.field_b, var9.field_g);
                }
              }
              return;
            }
            this.field_Zb = new jagex3.graphics2.hw.NativeInterface(0, this.field_e);
            this.field_I = null;
            return;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var7 = decompiledCaughtException;
            var7.printStackTrace();
            this.dispose((byte) 30);
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var7_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var7_ref;
          stackIn_12_1 = new StringBuilder().append("pf.<init>(");
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int getFarPlane() {
        return this.field_Wb;
    }

    final boolean hasSlowOffscreenRendering() {
        return false;
    }

    final void prepareGlyphDraw(byte param0) {
        int var2 = 42 % ((param0 + 29) / 36);
        if (this.field_V != 4) {
          this.selectScreenProjection((byte) 6);
          this.setFogEnabled(false, -30305);
          this.setLightingEnabled((byte) -35, false);
          this.setDepthTestEnabled(false, -1700);
          this.setDepthWriteEnabled((byte) -74, false);
          this.setMaterial(false, (byte) 18, false, -2);
          this.setBlendMode(92, 1);
          this.setTextureCombineMode(87, 0);
          this.field_V = 4;
        }
    }

    abstract void setTextureCoordinateMode(byte param0, TextureCoordinateMode param1);

    final GpuTexture2D createTexture2DFromBytes(int param0, TextureFormat param1, int param2, int param3, boolean param4, byte[] param5) {
        RuntimeException var7 = null;
        GpuTexture2D stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            this.getActiveTextureUnit((byte) -110);
          }
          stackIn_3_0 = this.createTexture2DFromBytes(0, param5, param1, 0, param0, param3, param4, param2 + 11);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("pf.AH(").append(param0).append(',');
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void fillGradientTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
    }

    private final void preparePrimitiveDraw(boolean param0) {
        if (param0) {
          this.modelViewTransform = (GpuTransform3D) null;
        }
        if (this.field_V != 1) {
          this.selectScreenProjection((byte) -124);
          this.setFogEnabled(false, -30305);
          this.setLightingEnabled((byte) -58, false);
          this.setDepthTestEnabled(false, -1700);
          this.setDepthWriteEnabled((byte) -74, false);
          this.setMaterial(false, (byte) 125, false, -2);
          this.setTextureCombineMode(32, 1);
          this.setTexture(this.field_Q, -123);
          this.field_V = 1;
        }
    }

    abstract void applyScissorRectangle(byte param0);

    private final void updatePerspectiveDepthTerms(boolean param0) {
        this.perspectiveProjection[10] = this.field_xb;
        this.perspectiveProjection[14] = this.field_Z;
        if (!param0) {
          this.getInverseViewTransform((byte) -70);
        }
    }

    final void resetModelTransform(boolean param0) {
        this.modelTransform.setIdentityWithZScale(1);
        this.field_ec = param0 ? true : false;
        this.updateModelTransform(0);
    }

    final ToolkitFont createFont(ToolkitFontMetrics param0, IndexedSpriteData[] param1, boolean param2) {
        RuntimeException var4 = null;
        GpuFont stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new GpuFont(this, param0, param1, param2);
          return (ToolkitFont) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("pf.BA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean supportsResizableBackbuffer() {
        return true;
    }

    private final void updateProjection(int param0) {
        this.applyProjectionMatrix((byte) -66);
        if (param0 != 17975) {
          return;
        }
        if (null != this.materialEffect) {
          this.materialEffect.onProjectionChanged(true);
        }
    }

    abstract void applyDirectionalLightsEnabled(boolean param0);

    final void initializeGpuResources(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        this.textures = new GpuTexture[this.field_L];
        this.textureTransformModes = new TextureTransformMode[this.field_L];
        this.rgbCombineOperations = new TextureCombineOperation[this.field_L];
        this.textureTransforms = new GpuTransform3D[this.field_L];
        this.alphaCombineOperations = new TextureCombineOperation[this.field_L];
        for (var2 = 0; var2 < this.field_L; var2++) {
          this.alphaCombineOperations[var2] = OpenGlGlyphMask.field_a;
          this.rgbCombineOperations[var2] = OpenGlGlyphMask.field_a;
          this.textureTransformModes[var2] = SetGrappleDebris.field_o;
          this.textureTransforms[var2] = new GpuTransform3D();
        }
        this.pointLights = new PointLight[-2 + this.field_qb];
        this.field_Q = (GpuTexture) ((Object) this.createTexture2D(125, 1, 1, ComponentAttachmentPlan.field_d, GpuDataType.UNSIGNED_BYTE));
        this.setHeap(new GpuNativeHeap(262144));
        this.field_Vb = this.createVertexDeclaration(10, new VertexStreamLayout[]{new VertexStreamLayout(new VertexAttribute[]{VertexAttribute.field_k, VertexAttribute.field_l})});
        this.createVertexDeclaration(10, new VertexStreamLayout[]{new VertexStreamLayout(new VertexAttribute[]{VertexAttribute.field_k, VertexAttribute.field_d})});
        this.createVertexDeclaration(param0 ^ -31099, new VertexStreamLayout[]{new VertexStreamLayout(VertexAttribute.field_k), new VertexStreamLayout(VertexAttribute.field_d), new VertexStreamLayout(VertexAttribute.field_l), new VertexStreamLayout(VertexAttribute.field_g)});
        this.createVertexDeclaration(10, new VertexStreamLayout[]{new VertexStreamLayout(VertexAttribute.field_k), new VertexStreamLayout(VertexAttribute.field_d), new VertexStreamLayout(VertexAttribute.field_l)});
        GpuModel discarded$0 = new GpuModel(this, 0, 0, false, false);
        this.field_R = new GpuModel(this, 0, 0, true, true);
        GpuModel discarded$1 = new GpuModel(this, 0, 0, false, false);
        this.field_D = new GpuModel(this, 0, 0, true, true);
        GpuModel discarded$2 = new GpuModel(this, 0, 0, false, false);
        this.field_hb = new GpuModel(this, 0, 0, true, true);
        GpuModel discarded$3 = new GpuModel(this, 0, 0, false, false);
        this.field_Jb = new GpuModel(this, 0, 0, true, true);
        GpuModel discarded$4 = new GpuModel(this, 0, 0, false, false);
        this.field_w = new GpuModel(this, 0, 0, true, true);
        this.field_Ib = new je(this);
        this.field_T = this.createIndexBuffer((byte) -19, true);
        this.recreateGpuResources(param0 ^ -31089);
        this.field_Mb = new WaterTextures(this);
        this.materialEffects[1] = this.createMaterialEffect((byte) -123, 1);
        this.materialEffects[2] = this.createMaterialEffect((byte) 33, 2);
        this.materialEffects[4] = this.createMaterialEffect((byte) 119, 4);
        this.materialEffects[5] = this.createMaterialEffect((byte) -114, 5);
        this.materialEffects[6] = this.createMaterialEffect((byte) 35, 6);
        this.materialEffects[7] = this.createMaterialEffect((byte) -97, 7);
        this.materialEffects[3] = this.createMaterialEffect((byte) 115, 3);
        this.materialEffects[8] = this.createMaterialEffect((byte) -114, 8);
        this.materialEffects[9] = this.createMaterialEffect((byte) -114, 9);
        if (!this.materialEffects[2].isSupported((byte) -89)) {
          this.materialEffects[2] = this.createMaterialEffect((byte) -115, 0);
        }
        if (!this.materialEffects[4].isSupported((byte) -40)) {
          this.materialEffects[4] = this.materialEffects[2];
        }
        if (!this.materialEffects[8].isSupported((byte) 127)) {
          this.materialEffects[8] = this.materialEffects[4];
        }
        if (!this.materialEffects[9].isSupported((byte) 110)) {
          this.materialEffects[9] = this.materialEffects[8];
        }
        if (param0 != -31089) {
          this.sunDirection = (float[]) null;
        }
        this.initializeRenderState(125);
        this.resetScissor(param0 + 31003);
        this.copyFrontToBackBuffer();
    }

    abstract void applyModelTransform(byte param0);

    final void setLightingSuppressed(boolean param0, int param1) {
        if ((param0 ? 1 : 0) == (!this.lightingSuppressed ? 1 : 0)) {
          this.lightingSuppressed = param0 ? true : false;
          this.applyLightingEnabled(-118);
        }
        if (param1 < 32) {
          this.applyAlphaCombineOperation((byte) -50);
        }
    }

    final boolean supportsMemoryPools() {
        return true;
    }

    private final void buildOrthographicProjection(byte param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float var8;
        float[] var9;
        if (param0 != 97) {
          this.field_hb = (GpuModel) null;
        }
        if (!this.orthographicProjectionValid) {
          var9 = this.orthographicProjection;
          var2 = var9;
          var3 = (float)this.field_h;
          var4 = (float)this.field_Wb;
          var5 = this.field_B * (float)(-this.field_Gb) / (float)this.field_k;
          var6 = this.field_B * (float)(-this.field_K) / (float)this.field_lb;
          var7 = (float)(-this.field_K + this.viewportWidth) * this.field_B / (float)this.field_lb;
          var8 = (float)(this.viewportHeight - this.field_Gb) * this.field_B / (float)this.field_k;
          if (var6 != var7 &&
            var5 != var8) {
            var2[11] = 0.0f;
            var2[6] = 0.0f;
            var2[4] = 0.0f;
            var2[10] = 1.0f / (var3 - var4);
            var2[12] = (var7 + var6) / (-var7 + var6);
            var2[3] = 0.0f;
            var2[7] = 0.0f;
            var2[8] = 0.0f;
            var2[1] = 0.0f;
            var2[9] = 0.0f;
            var2[13] = (var5 + var8) / (var8 - var5);
            var2[14] = var3 / (-var4 + var3);
            var2[15] = 1.0f;
            var2[5] = 2.0f / (var8 - var5);
            var2[2] = 0.0f;
            var2[0] = 2.0f / (-var6 + var7);
          } else {
            var9[13] = 0.0f;
            var9[5] = 1.0f;
            var9[11] = 0.0f;
            var9[2] = 0.0f;
            var9[10] = 1.0f;
            var9[8] = 0.0f;
            var9[14] = 0.0f;
            var9[4] = 0.0f;
            var9[1] = 0.0f;
            var9[15] = 1.0f;
            var9[12] = 0.0f;
            var9[7] = 0.0f;
            var9[0] = 1.0f;
            var9[3] = 0.0f;
            var9[9] = 0.0f;
            var9[6] = 0.0f;
          }
          this.onOrthographicProjectionChanged((byte) 72);
          this.orthographicProjectionValid = true;
        }
    }

    abstract GpuVertexDeclaration createVertexDeclaration(int param0, VertexStreamLayout[] param1);

    abstract void applyRgbCombineOperation(int param0);

    private final boolean uploadLineVertices(float param0, float param1, byte param2, float param3, float param4, float param5, float param6) {
        jaclib.memory.Buffer var10 = this.lineVertexBuffer.lock(true, (byte) 87);
        if (var10 == null) {
          return false;
        }
        jaclib.memory.Stream var9 = this.getBufferWriter(var10, false);
        if (!jaclib.memory.Stream.isBigEndian()) {
          var9.writeFloatLE(param5);
          var9.writeFloatLE(param1);
          var9.writeFloatLE(param0);
          var9.writeFloatLE(param4);
          var9.writeFloatLE(param3);
          var9.writeFloatLE(param6);
        } else {
          var9.writeFloat(param5);
          var9.writeFloat(param1);
          var9.writeFloat(param0);
          var9.writeFloat(param4);
          var9.writeFloat(param3);
          var9.writeFloat(param6);
        }
        if (param2 >= -58) {
          this.scissorBottom = -117;
        }
        var9.flush();
        return this.lineVertexBuffer.unlock(-20836);
    }

    private final void setMaterialEffect(boolean param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        int stackIn_10_0 = 0;
        int var8;
        TextureFormat var9;
        var8 = VoidHunters.field_G;
        if (param1) {
          var9 = (TextureFormat) null;
          this.createTexture3D(-31, -99, (byte[]) null, (TextureFormat) null, -65, -32);
        }
        param0 = param0 & this.supportsUnderwaterEffects();
        if (!param0 && (param2 == 4 ||
          param2 == 8 ||
          param2 == 9)) {
          param2 = 2;
          if (param2 != 4) {
            stackIn_10_0 = 1;
          } else {
            stackIn_10_0 = param3 & 1;
          }
          param4 = stackIn_10_0;
          param3 = 0;
        }
        if (param2 != 0 &&
          param5) {
          param2 = param2 | -2147483648;
        }
        if (this.materialEffectId != param2) {
          if (this.materialEffectId != 0) {
            this.materialEffects[2147483647 & this.materialEffectId].disable(2543);
          }
          if (param2 == 0) {
            this.materialEffect = null;
          } else {
            this.materialEffect = this.materialEffects[2147483647 & param2];
            this.materialEffect.enable(5, param5);
            this.materialEffect.applyRenderState(5, param5);
            this.materialEffect.setParameters(param4, param3, 5);
          }
          this.materialEffectId = param2;
          this.materialParameter1 = param3;
          this.materialParameter2 = param4;
        } else {
          if (this.materialEffectId != 0) {
            this.materialEffects[this.materialEffectId & 2147483647].applyRenderState(5, param5);
            if (param3 != this.materialParameter1 ||
              param4 != this.materialParameter2) {
              this.materialEffects[2147483647 & this.materialEffectId].setParameters(param4, param3, 5);
              this.materialParameter2 = param4;
              this.materialParameter1 = param3;
            }
          }
        }
    }

    abstract void applyDepthTestEnabled(int param0);

    final void setEffectFogEnabled(boolean param0, boolean param1) {
        if ((!this.effectFogEnabled ? 1 : 0) != (!param0 ? 1 : 0)) {
          this.effectFogEnabled = param0 ? true : false;
          this.applyFogEnabled(1);
        }
        if (param1) {
          this.drawCircle(-21, -6, -111, -17, -121);
        }
    }

    abstract void applyActiveTextureUnit(int param0);

    final void resetScissor(int param0) {
        this.scissorBottom = this.viewportHeight;
        this.scissorLeft = 0;
        this.scissorRight = this.viewportWidth;
        this.scissorTop = 0;
        if (this.scissorEnabled) {
          this.scissorEnabled = false;
          this.applyScissorEnabled((byte) 81);
        }
        this.onClipChanged((byte) -114);
        if (param0 > -53) {
          int[] var3 = (int[]) null;
          this.createTexture2DFromPixels(-67, false, 114, (byte) 35, (int[]) null);
        }
    }

    final void setBlendMode(int param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        ConsoleCommandRegistry var3 = null;
        int var6 = VoidHunters.field_G;
        if (param0 < 53) {
          return;
        }
        if (this.blendMode == param1) {
        } else {
          if (param1 == 1) {
            var5 = 1;
            var4 = 1;
            var3 = GetGrapplingHookRopeBreakLength.field_o;
          } else {
            if (2 == param1) {
              var3 = GpuTransform3D.field_b;
              var4 = 1;
              var5 = 0;
            } else {
              if (param1 != 128) {
                var4 = 0;
                var3 = SoftwareRasterState.field_f;
                var5 = 0;
              } else {
                var5 = 1;
                var3 = DebugSendable.field_e;
                var4 = 1;
              }
            }
          }
          if ((var5 == 0 ? 1 : 0) != (!this.alphaTestEnabled ? 1 : 0)) {
            this.alphaTestEnabled = var5 != 0 ? true : false;
            this.applyAlphaTestEnabled(17634);
          }
          if ((!this.blendingEnabled ? 1 : 0) != (var4 == 0 ? 1 : 0)) {
            this.blendingEnabled = var4 != 0 ? true : false;
            this.applyBlendingEnabled((byte) -56);
          }
          if (var3 != this.blendFunction) {
            this.blendFunction = var3;
            this.applyBlendFunction((byte) -39);
          }
          this.blendMode = param1;
          this.field_V = this.field_V & -29;
        }
    }

    final void selectScreenProjection(byte param0) {
        GpuProjectionMode var3 = null;
        int var2 = -109 / ((param0 + 65) / 34);
        if (this.projectionMode != GetMassDriverFireForce.field_p) {
          var3 = this.projectionMode;
          this.projectionMode = GetMassDriverFireForce.field_p;
          if (var3.usesViewTransform(-12178)) {
            this.updateViewTransform(0);
          }
          this.buildScreenProjection(1761);
          this.projectionMatrix = this.screenProjection;
          this.updateProjection(17975);
          this.field_V = this.field_V & -25;
        }
    }

    final void setTextureConstantColor(int param0, int param1) {
        if (param0 > -121) {
          this.setTextureConstantColor(-49, -58);
        }
        if (this.textureConstantColor != param1) {
          this.textureConstantColor = param1;
          this.applyTextureConstantColor((byte) -109);
        }
    }

    abstract GpuCubeTexture createCubeTexture(boolean param0, int param1, int[][] param2, int param3);

    final Model3D createModel(ModelData param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        GpuModel stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new GpuModel(this, param0, param1, param3, param4, param2);
          return (Model3D) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("pf.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void drawLine(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7;
        float var8;
        float var9;
        var7 = (float)param2 - (float)param0;
        var8 = (float)(-param1) + (float)param3;
        if (0.0f == var7 &&
          0.0f == var8) {
          var7 = 1.0f;
        } else {
          var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
          var8 = var8 * var9;
          var7 = var7 * var9;
        }
        if (!this.uploadLineVertices(0.0f, (float)param1, (byte) -126, (float)param3 + var8, (float)param2 + var7, (float)param0, 0.0f)) {
          return;
        }
        this.preparePrimitiveDraw(false);
        this.setTextureConstantColor(-128, param4);
        this.setRgbCombineSource(0, pea.field_d, 7);
        this.setAlphaCombineSource(0, (byte) -118, pea.field_d);
        this.setBlendMode(72, param5);
        this.resetModelTransform(true);
        this.setMultisampleEnabled(-75, false);
        this.drawUploadedLine(126);
        this.setMultisampleEnabled(-101, true);
        this.setAlphaCombineSource(0, (byte) -70, SetGrapplingHookMaxExtension8Force.field_q);
        this.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
    }

    final int[] getProjectionParameters() {
        return new int[]{this.field_K, this.field_Gb, this.field_lb, this.field_k};
    }

    final void selectClipSpaceProjection(byte param0) {
        GpuProjectionMode var2 = null;
        if (SetVariableAction.field_c != this.projectionMode) {
          var2 = this.projectionMode;
          this.projectionMode = SetVariableAction.field_c;
          if (var2.usesViewTransform(-12178)) {
            this.updateViewTransform(0);
          }
          this.field_V = this.field_V & -32;
          this.projectionMatrix = this.clipSpaceProjection;
        }
        if (param0 != -101) {
          this.lineVertexBuffer = (GpuVertexBuffer) null;
        }
    }

    abstract GpuTexture2D createTexture2DFromBytes(int param0, byte[] param1, TextureFormat param2, int param3, int param4, int param5, boolean param6, int param7);

    void releaseResources() {
        IntrusiveNode var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        int var3 = VoidHunters.field_G;
        if (!this.field_hc) {
          var1 = this.field_s.first(0);
          while (var1 != null) {
            ((GpuNativeHeap) (var1)).deallocate(true);
            var1 = this.field_s.next((byte) 116);
          }
          var1_ref = this.field_rb.keys();
          while (var1_ref.hasMoreElements()) {
            var2 = (java.awt.Canvas) (var1_ref.nextElement());
            this.releaseSurface(var2, this.field_rb.get(var2), 0);
          }
          SetDebrisFoundInPairs.a((byte) 104, true, false);
          this.field_Zb.release();
          this.field_hc = true;
        }
    }

    abstract void setTextureCoordinateIndex(int param0, int param1);

    abstract GpuTexture2D createTexture2D(int param0, int param1, int param2, TextureFormat param3, GpuDataType param4);

    abstract void applyViewTransform(int param0);

    final boolean supportsFastTexturedParticles() {
        return true;
    }

    final GpuTexture2D createTexture2DFromFloats(int param0, int param1, float[] param2, boolean param3, int param4, TextureFormat param5) {
        RuntimeException var7 = null;
        GpuTexture2D stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -1) {
            this.createCubeTexture(false, -91, (int[][]) null, -127);
          }
          stackIn_3_0 = this.createTexture2DFromFloats(param5, param2, param3, 0, param1, 0, true, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("pf.JF(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void prepareSpriteDraw(byte param0) {
        if (this.field_V != 2) {
          this.selectScreenProjection((byte) -121);
          this.setFogEnabled(false, param0 - 30416);
          this.setLightingEnabled((byte) -112, false);
          this.setDepthTestEnabled(false, -1700);
          this.setDepthWriteEnabled((byte) -74, false);
          this.setMaterial(false, (byte) -128, false, -2);
          this.field_V = 2;
        }
        if (param0 != 111) {
          this.applyAlphaCombineOperation((byte) -103);
        }
    }

    final jaclib.memory.heap.NativeHeapBuffer allocateNativeBuffer(boolean param0, int param1, int param2) {
        int var4 = -73 % ((param1 - 37) / 38);
        return this.field_jc.allocate(param2, param0);
    }

    final void intersectClip(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (this.scissorLeft < param0) {
          var5 = 1;
          this.scissorLeft = param0;
        }
        if (param2 < this.scissorRight) {
          this.scissorRight = param2;
          var5 = 1;
        }
        if (param1 > this.scissorTop) {
          this.scissorTop = param1;
          var5 = 1;
        }
        if (param3 < this.scissorBottom) {
          this.scissorBottom = param3;
          var5 = 1;
        }
        if (var5 != 0) {
          if (!this.scissorEnabled) {
            this.scissorEnabled = true;
            this.applyScissorEnabled((byte) 81);
          }
          this.applyScissorRectangle((byte) -104);
          this.onClipChanged((byte) -89);
        }
    }

    final GpuTransform3D getViewTransform(byte param0) {
        if (param0 <= 5) {
          this.supportsFastTexturedParticles();
        }
        return this.viewTransform;
    }

    abstract void applyProjectionMatrix(byte param0);

    final int getMaxPointLights() {
        return -2 + this.field_qb;
    }

    final void drawVerticalLine(int param0, int param1, int param2, int param3, int param4) {
        this.drawLine(param0, param1, param0, param2 + param1, param3, param4);
    }

    final Transform3D createTransform() {
        return (Transform3D) ((Object) new GpuTransform3D());
    }

    private final void createQuadGeometry(boolean param0) {
        int var2;
        jaclib.memory.Buffer var3;
        int var5;
        jaclib.memory.Stream var4;
        var5 = VoidHunters.field_G;
        if (!param0) {
          return;
        }
        this.quadVertexBuffer = this.createVertexBuffer(false, 3);
        this.quadVertexBuffer.allocate(28, 140, 126);
        var2 = 0;
        scanLoop1: while (true) {
          if (4 > var2) {
            var3 = this.quadVertexBuffer.lock(true, (byte) 119);
            if (var3 != null) {
              var4 = this.getBufferWriter(var3, false);
              if (jaclib.memory.Stream.isBigEndian()) {
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(1.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
              } else {
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(1.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
              }
              var4.flush();
              if (this.quadVertexBuffer.unlock(-20836)) {
                break scanLoop1;
              }
            }
            var2++;
            continue;
          }
          break;
        }
        this.quadVertexDeclaration = this.createVertexDeclaration(10, new VertexStreamLayout[]{new VertexStreamLayout(new VertexAttribute[]{VertexAttribute.field_k, VertexAttribute.field_l, VertexAttribute.field_l})});
        return;
    }

    final jaclib.memory.Stream getBufferWriter(jaclib.memory.Buffer param0, boolean param1) {
        RuntimeException var3 = null;
        jaclib.memory.Stream stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.textureTransforms = (GpuTransform3D[]) null;
          }
          this.bufferWriter.setBuffer(param0);
          stackIn_3_0 = this.bufferWriter;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pf.IF(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final float[] writeTransposedProjection(int param0, float[] param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1[8] = this.projectionMatrix[2];
          param1[0] = this.projectionMatrix[0];
          param1[4] = this.projectionMatrix[1];
          param1[12] = this.projectionMatrix[3];
          if (param0 < 98) {
            this.lightBlue = -0.8953596949577332f;
          }
          param1[13] = this.projectionMatrix[7];
          param1[2] = this.projectionMatrix[8];
          param1[1] = this.projectionMatrix[4];
          param1[5] = this.projectionMatrix[5];
          param1[9] = this.projectionMatrix[6];
          param1[7] = this.projectionMatrix[13];
          param1[6] = this.projectionMatrix[9];
          param1[3] = this.projectionMatrix[12];
          param1[14] = this.projectionMatrix[11];
          param1[10] = this.projectionMatrix[10];
          param1[11] = this.projectionMatrix[14];
          param1[15] = this.projectionMatrix[15];
          stackIn_3_0 = (float[]) (param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pf.TG(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    abstract void setVertexDeclaration(int param0, GpuVertexDeclaration param1);

    final void setRgbCombineSource(int param0, TextureCombineSource param1, int param2) {
        try {
          this.setRgbCombineSource(false, param2 - 21122, false, param1, param0);
          if (param2 != 7) {
            this.supportsMemoryPools();
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pf.LF(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void updateTextureTransform(byte param0) {
        this.applyTextureTransform(0);
        if (param0 != 96) {
          this.field_Db = (float[]) null;
        }
        if (this.materialEffect != null) {
          this.materialEffect.onTextureTransformChanged(8);
        }
    }

    final void resetTextureTransform(byte param0) {
        if (param0 <= 63) {
          this.inverseViewTransform = (GpuTransform3D) null;
        }
        if (this.textureTransformModes[this.activeTextureUnit] != SetGrappleDebris.field_o) {
          this.textureTransformModes[this.activeTextureUnit] = SetGrappleDebris.field_o;
          this.textureTransforms[this.activeTextureUnit].setIdentityWithZScale(1);
          this.updateTextureTransform((byte) 96);
        }
    }

    abstract void applyViewport(byte param0);

    final boolean supportsAntialiasing() {
        return this.field_sc;
    }

    GpuMaterialEffect createMaterialEffect(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        var3 = 79 % ((param0 + 34) / 63);
        var4 = param1;
        if (var4 == 6) {
          return (GpuMaterialEffect) ((Object) new UnlitGpuMaterialEffect(this));
        }
        if (var4 == 1) {
          return (GpuMaterialEffect) ((Object) new SpecularGpuMaterialEffect(this));
        }
        if (var4 == 2) {
          return (GpuMaterialEffect) ((Object) new WaterNoiseGpuMaterialEffect(this, this.field_Mb));
        }
        if (var4 != 7) {
          return (GpuMaterialEffect) ((Object) new UnsupportedGpuMaterialEffect(this));
        }
        return (GpuMaterialEffect) ((Object) new EnvironmentReflectionGpuMaterialEffect(this));
    }

    final void drawCircle(int param0, int param1, int param2, int param3, int param4) {
        this.preparePrimitiveDraw(false);
        this.setTextureConstantColor(-126, param3);
        this.setRgbCombineSource(0, pea.field_d, 7);
        this.setAlphaCombineSource(0, (byte) -65, pea.field_d);
        this.setBlendMode(58, param4);
        this.modelTransform.setScale(5557, (float)param2, (float)param2, 1.0f);
        this.modelTransform.translate(param1, 16383, 0, param0);
        this.markModelTransformChanged(20837);
        this.setMultisampleEnabled(-112, false);
        this.setVertexBuffer((byte) -6, this.circleVertexBuffer, 0);
        this.setVertexDeclaration(115, this.circleVertexDeclaration);
        this.drawPrimitive(GetFightersPerPlayerMaximum.reportReasonCount, 1, 256, -114);
        this.setMultisampleEnabled(-27, true);
        this.setAlphaCombineSource(0, (byte) -97, SetGrapplingHookMaxExtension8Force.field_q);
        this.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
    }

    abstract boolean supportsTexture2DFormat(int param0, TextureFormat param1, GpuDataType param2);

    abstract Object createSurface(byte param0, java.awt.Canvas param1);

    abstract void setMultisampleEnabled(int param0, boolean param1);

    abstract GpuIndexBuffer createIndexBuffer(byte param0, boolean param1);

    final void setDepthRange(int param0, int param1) {
        if (param0 != this.field_h ||
          param1 != this.field_Wb) {
          this.field_h = param0;
          this.field_Wb = param1;
          this.updatePerspectiveProjection((byte) 20);
          this.updateOrthographicProjection(true);
          this.updateDepthRange(112);
        }
    }

    void updateFrame(int param0) {
        if (null != this.field_I) {
          this.field_I.a((byte) -106);
        }
        this.field_pc = param0 & 2147483647;
    }

    final void markModelTransformChanged(int param0) {
        if (param0 != 20837) {
          return;
        }
        this.field_ec = false;
        this.updateModelTransform(0);
    }

    final void setTexture(GpuTexture param0, int param1) {
        try {
          if (param1 > -105) {
            this.createSprite(91, -101, true);
          }
          if (param0 != this.textures[this.activeTextureUnit]) {
            this.textures[this.activeTextureUnit] = param0;
            if (param0 == null) {
              this.unbindTexture(3);
            } else {
              param0.bind(-27445);
            }
            this.field_V = this.field_V & -2;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pf.HF(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract GpuVertexBuffer createVertexBuffer(boolean param0, int param1);

    final void setDepthWriteEnabled(byte param0, boolean param1) {
        if (param0 != -74) {
          this.updateTextureTransform((byte) 123);
        }
        if ((!param1 ? 1 : 0) == (this.depthWriteEnabled ? 1 : 0)) {
          this.depthWriteEnabled = param1 ? true : false;
          this.applyDepthWriteEnabled(param0 ^ 22);
          this.field_V = this.field_V & -32;
        }
    }

    private final void createCircleGeometry(int param0) {
        int var5 = 0;
        int var2;
        jaclib.memory.Buffer var3;
        jaclib.memory.Stream var4;
        double var6;
        float var8;
        float var9;
        int var10;
        var10 = VoidHunters.field_G;
        this.circleVertexBuffer = this.createVertexBuffer(false, param0 - 3093);
        this.circleVertexBuffer.allocate(12, param0, 86);
        var2 = 0;
        scanLoop1: while (true) {
          if (var2 < 4) {
            var3 = this.circleVertexBuffer.lock(true, (byte) 52);
            if (var3 != null) {
              var4 = this.getBufferWriter(var3, false);
              var4.writeFloat(0.0f);
              var4.writeFloat(0.0f);
              var4.writeFloat(0.0f);
              for (var5 = 0; var5 <= 256; var5++) {
                var6 = 3.141592653589793 * (double)(var5 * 2) / 256.0;
                var8 = (float)Math.cos(var6);
                var9 = (float)Math.sin(var6);
                if (jaclib.memory.Stream.isBigEndian()) {
                  var4.writeFloat(var9);
                  var4.writeFloat(var8);
                  var4.writeFloat(0.0f);
                } else {
                  var4.writeFloatLE(var9);
                  var4.writeFloatLE(var8);
                  var4.writeFloatLE(0.0f);
                }
              }
              var4.flush();
              if (this.circleVertexBuffer.unlock(param0 ^ -23932)) {
                break scanLoop1;
              }
            }
            var2++;
            continue;
          }
          break;
        }
        this.circleVertexDeclaration = this.createVertexDeclaration(10, new VertexStreamLayout[]{new VertexStreamLayout(VertexAttribute.field_k)});
        return;
    }

    final void drawHorizontalLine(int param0, int param1, int param2, int param3, int param4) {
        this.drawLine(param0, param1, param2 + param0, param1, param3, param4);
    }

    final boolean supportsMultipleCanvases() {
        return false;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (!GetUseCircleFill.a(param1, (byte) -120, param2)) {
          return false;
        }
        if (MissionGenerationDataFactory.a(param2, (byte) 91, param1) | (param0 != (param1 & 36864) ? true : false) | IncrementVariableAction.a(param2, param1, (byte) 9)) {
          return true;
        }
        return (EmailAvailabilityValidator.a(param1, false, param2) | ((param1 & 8192) != 0 ? true : false) | MessageLogFactory.a(param2, 65536, param1)) & ((55 & param2) == 0 ? true : false);
    }

    abstract void drawPrimitive(PrimitiveType param0, int param1, int param2, int param3);

    abstract void applyTextureTransform(int param0);

    final void getClip(int[] param0) {
        try {
          param0[1] = this.scissorTop;
          param0[0] = this.scissorLeft;
          param0[3] = this.scissorBottom;
          param0[2] = this.scissorRight;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pf.K(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void setProjectionParameters(int param0, int param1, int param2, int param3) {
        this.field_lb = param2;
        this.field_Gb = param1;
        this.field_k = param3;
        this.field_K = param0;
        this.updateOrthographicProjection(true);
        this.updatePerspectiveProjection((byte) 54);
        this.selectClipSpaceProjection((byte) -101);
        this.onClipChanged((byte) -103);
    }

    abstract GpuTexture3D createTexture3D(int param0, int param1, byte[] param2, TextureFormat param3, int param4, int param5);

    final GpuTransform3D getTextureTransform(byte param0) {
        int var2 = 34 % ((param0 + 63) / 51);
        return this.textureTransforms[this.activeTextureUnit];
    }

    final void setActiveTextureUnit(int param0, int param1) {
        if (param1 >= -38) {
          this.field_sc = true;
        }
        if (param0 != this.activeTextureUnit) {
          this.activeTextureUnit = param0;
          this.applyActiveTextureUnit(12);
        }
    }

    private final void updatePerspectiveProjection(byte param0) {
        int var2 = -18 % ((param0 + 54) / 63);
        this.perspectiveProjectionValid = false;
        this.buildPerspectiveProjection((byte) -94);
        if (pia.field_x == this.projectionMode) {
          this.updateProjection(17975);
        }
    }

    abstract void applyFogEnabled(int param0);

    final ToolkitSprite createSprite(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        GpuSprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new GpuSprite(this, param3, param4, param0, param1, param2);
          return (ToolkitSprite) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("pf.W(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean hasVolatileBackbuffer() {
        return true;
    }

    final void drawThickLine(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        float var8 = (float)param2 - (float)param0;
        float var9 = (float)param3 - (float)param1;
        float var10 = 0.0f;
        float var11 = 1.0f;
        if (var8 != 0.0f ||
          var9 != 0.0f) {
          var11 = (float)Math.sqrt((double)(var9 * var9 + var8 * var8));
          var10 = (float)Math.atan2((double)var9, (double)var8);
        }
        this.preparePrimitiveDraw(false);
        this.setTextureConstantColor(-125, param4);
        this.setRgbCombineSource(0, pea.field_d, 7);
        this.setAlphaCombineSource(0, (byte) -71, pea.field_d);
        this.setBlendMode(99, param6);
        this.modelTransform.setScale(5557, var11, (float)param5, 1.0f);
        this.modelTransform.translate(-param5 / 2, 16383, 0, 0);
        this.modelTransform.rotateZ((int)((double)var10 * 2607.5945876176133) & 16383, 3);
        this.modelTransform.translate(param1, 16383, 0, param0);
        this.markModelTransformChanged(20837);
        this.setMultisampleEnabled(-72, false);
        this.drawUnitQuadTriangles((byte) -54);
        this.setMultisampleEnabled(-59, true);
        this.setAlphaCombineSource(0, (byte) -117, SetGrapplingHookMaxExtension8Force.field_q);
        this.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
    }

    final ToolkitSprite createSprite(int param0, int param1, boolean param2) {
        return (ToolkitSprite) ((Object) new GpuSprite(this, param0, param1, param2));
    }

    abstract void unbindTexture(int param0);

    abstract void setRgbCombineSource(boolean param0, int param1, boolean param2, TextureCombineSource param3, int param4);

    final GpuCubeTexture getEnvironmentCubeTexture(int param0) {
        if (param0 != 10) {
          this.pointLights = (PointLight[]) null;
        }
        return this.field_kc == null ? null : this.field_kc.getCubeTexture((byte) -118);
    }

    final int getUnderwaterDepthScale(int param0) {
        if (param0 < 78) {
          this.applyAmbientLight(true);
        }
        return this.underwaterDepthScale;
    }

    final void setMaterial(boolean param0, byte param1, boolean param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        Object var5_ref;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        TextureMetadata var10;
        int var11;
        int var12;
        GpuTransform3D var13;
        int var14;
        boolean decompiledFrameRemainder0 = true;
        var14 = VoidHunters.field_G;
        if (param3 == this.materialTextureId) {
          stackIn_4_0 = (this.field_Tb) ? 0 : 1;
          if (this.field_q) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = 1;
          }
          decompiledFrameRemainder0 = (stackIn_4_0 != stackIn_7_1);
        }
        if (decompiledFrameRemainder0) {
          var5_ref = null;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          stackIn_12_0 = (!this.field_Tb) ? 0 : 3;
          var9 = stackIn_12_0;
          if (param3 < 0) {
            this.resetTextureTransform((byte) 126);
          } else {
            var5_ref = this.field_I.a(-1, param3);
            var10 = this.field_a.getTextureMetadata(-20292, param3);
            if (var10.field_p == 0 &&
              var10.field_d == 0) {
              this.resetTextureTransform((byte) 75);
            } else {
              stackIn_19_0 = (var10.field_h) ? 64 : 128;
              var11 = stackIn_19_0;
              var12 = 50 * var11;
              var13 = this.getTextureTransform((byte) 24);
              var13.setTranslation((float)(var10.field_p * (this.field_pc % var12)) / (float)var12, (float)(this.field_pc % var12 * var10.field_d) / (float)var12, 49, 0.0f);
              this.setTextureTransformMode(OpenGlInterleavedVertexBuffer.field_a, true);
            }
            var6 = var10.field_f;
            if (!this.field_Tb) {
              var8 = var10.field_o;
              var9 = var10.field_c;
              var7 = var10.field_n;
            }
          }
          this.setMaterialEffect(param2, false, var9, var7, var8, param0);
          if (null == this.materialEffect) {
            this.setTexture((GpuTexture) (var5_ref), -113);
            this.setTextureCombineMode(-119, var6);
          } else {
            this.materialEffect.setTexture((byte) 106, var6, (GpuTexture) (var5_ref));
          }
          this.materialTextureId = param3;
          this.field_q = this.field_Tb;
        }
        this.field_V = this.field_V & -8;
        var5 = -90 % ((-66 - param1) / 45);
    }

    final void setDepthTestEnabled(boolean param0, int param1) {
        if (param1 != -1700) {
          this.prepareSpriteDraw((byte) 77);
        }
        if (param0 != this.depthTestEnabled) {
          this.depthTestEnabled = param0 ? true : false;
          this.applyDepthTestEnabled(param1 ^ -14310);
          this.field_V = this.field_V & -32;
        }
    }

    final void setFogEnabled(boolean param0, int param1) {
        if (param1 != -30305) {
          this.depthTestEnabled = true;
        }
        if ((this.fogEnabled ? 1 : 0) == (!param0 ? 1 : 0)) {
          this.fogEnabled = param0 ? true : false;
          this.applyFogEnabled(1);
          this.field_V = this.field_V & -32;
        }
    }

    private final void drawUnitQuad(int param0, PrimitiveType param1, int param2) {
        try {
          this.setVertexBuffer((byte) -6, this.quadVertexBuffer, param0);
          this.setVertexDeclaration(101, this.quadVertexDeclaration);
          this.drawPrimitive(param1, 0, param2, -114);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pf.FH(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int getGpuMemoryUsage(int param0) {
        if (param0 != 3554) {
          return -16;
        }
        return this.field_Nb + this.field_ob + this.field_mb;
    }

    final void drawRectangle(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = this.getPixelOffset((byte) -95);
        this.preparePrimitiveDraw(false);
        this.setTextureConstantColor(-123, param4);
        this.setRgbCombineSource(0, pea.field_d, 7);
        this.setAlphaCombineSource(0, (byte) -113, pea.field_d);
        this.setBlendMode(103, param5);
        this.modelTransform.setScale(5557, (float)(-1 + param2), (float)(param3 - 1), 1.0f);
        this.modelTransform.translate(0.0f, (float)param0 - var7, -var7 + (float)param1, (byte) 13);
        this.markModelTransformChanged(20837);
        this.setMultisampleEnabled(-118, false);
        this.drawUnitQuad(0, GetFightersPerPlayerMaximum.reportReasonCount, 4);
        this.setMultisampleEnabled(-110, true);
        this.setAlphaCombineSource(0, (byte) -67, SetGrapplingHookMaxExtension8Force.field_q);
        this.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, 7);
    }

    abstract void applyDirectionalLightDirections(int param0);

    final GpuTransform3D getInverseViewTransform(byte param0) {
        if (param0 < 70) {
          this.projectionMode = (GpuProjectionMode) null;
        }
        return this.inverseViewTransform;
    }

    final boolean isBloomSupported() {
        return false;
    }

    final int getActiveTextureUnit(byte param0) {
        if (param0 != 9) {
          return -4;
        }
        return this.activeTextureUnit;
    }

    private final void buildPerspectiveProjection(byte param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float[] var8;
        if (!this.perspectiveProjectionValid) {
          var8 = this.perspectiveProjection;
          var2 = var8;
          var3 = (float)(this.field_h * -this.field_K) / (float)this.field_lb;
          var4 = (float)(this.field_h * (this.viewportWidth - this.field_K)) / (float)this.field_lb;
          var5 = (float)(this.field_Gb * this.field_h) / (float)this.field_k;
          var6 = (float)(this.field_h * (-this.viewportHeight + this.field_Gb)) / (float)this.field_k;
          if (var4 != var3 &&
            var5 != var6) {
            var7 = (float)this.field_h * 2.0f;
            var8[1] = 0.0f;
            var8[7] = 0.0f;
            var8[6] = 0.0f;
            var8[3] = 0.0f;
            var8[2] = 0.0f;
            var8[12] = 0.0f;
            this.field_xb = (float)this.field_Wb / (float)(-this.field_Wb + this.field_h);
            var8[10] = (float)this.field_Wb / (float)(-this.field_Wb + this.field_h);
            var8[0] = var7 / (var4 - var3);
            var8[5] = var7 / (-var6 + var5);
            var8[9] = (var5 + var6) / (-var6 + var5);
            this.field_Z = (float)(this.field_h * this.field_Wb) / (float)(this.field_h - this.field_Wb);
            var8[14] = (float)(this.field_h * this.field_Wb) / (float)(this.field_h - this.field_Wb);
            var8[8] = (var3 + var4) / (-var3 + var4);
            var8[4] = 0.0f;
            var8[13] = 0.0f;
            var8[11] = -1.0f;
            var8[15] = 0.0f;
          } else {
            var8[5] = 1.0f;
            var8[9] = 0.0f;
            var8[3] = 0.0f;
            var8[12] = 0.0f;
            var8[4] = 0.0f;
            var8[14] = 0.0f;
            var8[2] = 0.0f;
            var8[1] = 0.0f;
            var8[6] = 0.0f;
            var8[13] = 0.0f;
            var8[11] = 0.0f;
            var8[15] = 1.0f;
            var8[10] = 1.0f;
            var8[8] = 0.0f;
            var8[0] = 1.0f;
            var8[7] = 0.0f;
          }
          this.updatePerspectiveDepthTerms(true);
          this.perspectiveProjectionValid = true;
        }
        if (param0 >= -80) {
          this.updateViewTransform(-105);
        }
    }

    final boolean supportsMultipleThreads() {
        return false;
    }

    private final void drawUploadedLine(int param0) {
        this.setVertexBuffer((byte) -6, this.lineVertexBuffer, 0);
        if (param0 <= 102) {
          int[] var3 = (int[]) null;
          this.createTexture2DFromPixels(-65, true, (int[]) null, -35, -49, false, 126);
        }
        this.setVertexDeclaration(124, this.lineVertexDeclaration);
        this.drawPrimitive(TextureFilterMode.field_b, 0, 1, -93);
    }

    abstract void applyBlendFunction(byte param0);

    abstract void setVertexBuffer(byte param0, GpuVertexBuffer param1, int param2);

    final int getUnderwaterFogColor(byte param0) {
        boolean discarded$0 = false;
        if (param0 > -109) {
          discarded$0 = this.uploadLineVertices(-0.3812601566314697f, 0.24077846109867096f, (byte) 10, 0.3140295147895813f, 0.6470803022384644f, 1.3212025165557861f, 0.2246333807706833f);
        }
        return this.underwaterFogColor;
    }

    abstract GpuTexture2D createTexture2DFromPixels(int param0, boolean param1, int[] param2, int param3, int param4, boolean param5, int param6);

    final void releaseGpuResources(byte param0) {
        java.awt.Canvas var3_ref_java_awt_Canvas = null;
        int var4 = VoidHunters.field_G;
        Enumeration var2 = this.field_rb.keys();
        while (var2.hasMoreElements()) {
          var3_ref_java_awt_Canvas = (java.awt.Canvas) (var2.nextElement());
          this.releaseSurface(var3_ref_java_awt_Canvas, this.field_rb.get(var3_ref_java_awt_Canvas), 0);
        }
        this.quadVertexBuffer.release(-96);
        this.lineVertexBuffer.release(-103);
        this.circleVertexBuffer.release(-117);
        int var3 = 19 % ((47 - param0) / 45);
        this.field_R.releaseBuffers(26385);
        this.field_D.releaseBuffers(26385);
        this.field_hb.releaseBuffers(26385);
        this.field_Jb.releaseBuffers(26385);
        this.field_w.releaseBuffers(26385);
        this.field_Ib.a(false);
        this.field_T.release(-127);
    }

    final boolean supportsFarClipPlane() {
        return true;
    }

    final void setTextureTransformMode(TextureTransformMode param0, boolean param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.textureTransformModes[this.activeTextureUnit] = param0;
          if (!param1) {
            this.field_pc = 121;
            this.updateTextureTransform((byte) 96);
          } else {
            this.updateTextureTransform((byte) 96);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pf.VF(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void onOrthographicProjectionChanged(byte param0) {
        if (param0 < 66) {
          this.drawUploadedLine(12);
        }
    }

    abstract void commitDirectionalLights(byte param0);

    private final void createLineGeometry(int param0) {
        this.lineVertexBuffer = this.createVertexBuffer(true, 3);
        this.lineVertexBuffer.allocate(12, 24, 95);
        this.lineVertexDeclaration = this.createVertexDeclaration(10, new VertexStreamLayout[]{new VertexStreamLayout(VertexAttribute.field_k)});
        if (param0 != 27191) {
          this.materialEffect = (GpuMaterialEffect) null;
        }
    }

    final void setTextureCombineOperations(TextureCombineOperation param0, boolean param1, TextureCombineOperation param2) {
        int var4_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = 0;
          if (!param1) {
            return;
          }
          if (this.rgbCombineOperations[this.activeTextureUnit] != param2) {
            this.rgbCombineOperations[this.activeTextureUnit] = param2;
            var4_int = 1;
            this.applyRgbCombineOperation(-97);
          }
          if (this.alphaCombineOperations[this.activeTextureUnit] != param0) {
            this.alphaCombineOperations[this.activeTextureUnit] = param0;
            this.applyAlphaCombineOperation((byte) 122);
            var4_int = 1;
          }
          if (var4_int != 0) {
            this.field_V = this.field_V & -30;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("pf.FF(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    abstract void applyAlphaCombineOperation(byte param0);

    public static void clearSharedReferences(byte param0) {
        field_Yb = null;
        if (param0 != -101) {
          field_Yb = (String[]) null;
        }
    }

    final void recreateGpuResources(int param0) {
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        int var5 = VoidHunters.field_G;
        Hashtable var2 = new Hashtable();
        if (this.field_rb != null &&
          !this.field_rb.isEmpty()) {
          var3 = this.field_rb.keys();
          while (var3.hasMoreElements()) {
            var4 = (java.awt.Canvas) (var3.nextElement());
            var2.put(var4, this.createSurface((byte) -53, var4));
          }
        }
        this.field_rb = var2;
        this.createQuadGeometry(true);
        if (param0 != 0) {
          this.lightingEnabled = false;
        }
        this.createLineGeometry(param0 ^ 27191);
        this.createCircleGeometry(3096);
        this.field_Ib.a(24, this);
    }

    final ToolkitSprite createSprite(IndexedSpriteData param0, boolean param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_13_2 = 0;
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
        var10 = VoidHunters.field_G;
        try {
          if (param0.width != 0 &&
            param0.height != 0) {
            var12 = new int[param0.height * param0.width];
            var11 = var12;
            var4 = var11;
            var5 = 0;
            var6 = 0;
            if (param0.alpha != null) {
              for (var7 = 0; var7 < param0.height; var7++) {
                for (var8 = 0; param0.width > var8; var8++) {
                  incrementValue$0 = var6;
                  var6++;
                  var4[incrementValue$0] = SetAngularForceDownshift.orBits(param0.palette[MenuBackgroundBattle.andBits(255, (int) param0.pixels[var5])], param0.alpha[var5] << 24);
                  var5++;
                }
              }
            } else {
              for (var7 = 0; param0.height > var7; var7++) {
                for (var8 = 0; param0.width > var8; var8++) {
                  incrementValue$1 = var5;
                  var5++;
                  var9 = param0.palette[param0.pixels[incrementValue$1] & 255];
                  incrementValue$2 = var6;
                  var6++;
                  stackIn_12_0 = var4;
                  stackIn_12_1 = incrementValue$2;
                  if (var9 != 0) {
                    stackIn_13_2 = SetAngularForceDownshift.orBits(-16777216, var9);
                  } else {
                    stackIn_13_2 = 0;
                  }
                  stackIn_12_0[stackIn_12_1] = stackIn_13_2;
                }
              }
            }
            var3 = this.createSprite(param0.width, param0.width, var12, 0, (byte) 70, param0.height);
          } else {
            var3 = this.createSprite(1, 1, new int[]{0}, 0, (byte) 92, 1);
          }
          var3.setPadding(param0.leftPadding, param0.topPadding, param0.rightPadding, param0.bottomPadding);
          stackIn_23_0 = var3;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("pf.AB(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean supportsEnvironmentMaps() {
        return true;
    }

    abstract void applyAmbientLight(boolean param0);

    final boolean supportsUnderwaterEffects() {
        return this.materialEffects[3].isSupported((byte) 111);
    }

    abstract void applyBlendingEnabled(byte param0);

    final GraphicsHeap createHeap(int param0) {
        GpuNativeHeap var2 = new GpuNativeHeap(param0);
        this.field_s.addLast(-10258, var2);
        return (GraphicsHeap) ((Object) var2);
    }

    final int getUnderwaterFogStrength(boolean param0) {
        if (param0) {
          this.materialEffectId = -18;
        }
        return this.underwaterFogStrength;
    }

    abstract GpuTexture2D createTexture2DFromFloats(TextureFormat param0, float[] param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7);

    final int getWaterPlaneDistance(byte param0) {
        if (param0 <= 78) {
          this.field_Z = -0.38502317667007446f;
        }
        return this.waterPlaneDistance;
    }

    final void setViewTransform(Transform3D param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_t = (GpuTransform3D) (param0);
          this.viewTransform.set(this.field_t, 16383);
          this.viewTransform.flipYZ(16489);
          this.inverseViewTransform.setRigidInverse(-25609, this.viewTransform);
          this.field_f.setRigidInverse(-25609, this.field_t);
          if (this.projectionMode.usesViewTransform(-12178)) {
            this.updateViewTransform(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pf.FB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void setHeap(GraphicsHeap param0) {
        try {
          this.field_jc = ((GpuNativeHeap) (param0)).heap;
          this.field_m = this.field_jc.allocate(32768, false);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pf.GB(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void releaseSurface(java.awt.Canvas param0, Object param1, int param2);

    abstract boolean supportsTexture3DFormat(GpuDataType param0, TextureFormat param1, int param2);

    static {
        field_Yb = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
