/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class LegacyOpenGlGraphicsToolkit extends GraphicsToolkit {
    private int canvasWidth;
    private long field_ob;
    private java.awt.Canvas canvas;
    int viewportHeight;
    private int canvasHeight;
    private long field_rb;
    jaggl.OpenGL context;
    private Hashtable field_Gb;
    private int viewportWidth;
    static String unfortunatelyYourConfigurationDoesnText;
    private LegacyOpenGlInterleavedStream field_O;
    private LegacyOpenGlTextureCache field_Pb;
    int field_X;
    private LegacyOpenGlPostProcessManager postProcessManager;
    private LegacyOpenGlEffectManager effectManager;
    int field_Bc;
    private LegacyOpenGlFloatPostProcessEffect floatPostProcessEffect;
    private IntrusiveDeque field_oc;
    jaclib.memory.heap.NativeHeap field_pb;
    int animationTime;
    private boolean field_jc;
    LegacyOpenGlNormalMapGenerator normalMapGenerator;
    private LegacyOpenGlFramebuffer field_H;
    private int readFramebufferIndex;
    private int field_Jb;
    private LegacyOpenGlFramebufferTarget[] readFramebufferStack;
    private LegacyOpenGlFramebufferTarget drawFramebuffer;
    private LegacyOpenGlFramebufferTarget[] drawFramebufferStack;
    private int drawFramebufferIndex;
    private SecondaryNodeQueue field_Db;
    private LegacyOpenGlSprite field_Tb;
    private LegacyOpenGlFramebufferTarget readFramebuffer;
    private LegacyOpenGlFramebufferTarget[] field_dc;
    private IntrusiveNodeHashTable field_nc;
    int textureBytes;
    int field_Xb;
    private int field_V;
    private int field_ic;
    private IntrusiveDeque field_fb;
    private IntrusiveDeque buffersToDelete;
    private IntrusiveDeque field_q;
    private IntrusiveDeque framebuffersToDelete;
    private IntrusiveDeque field_fc;
    private IntrusiveDeque field_qb;
    private IntrusiveDeque field_cc;
    private int field_nb;
    private long field_vc;
    private int field_Ab;
    private int field_zb;
    private boolean depthWriteEnabled;
    private boolean field_x;
    private boolean field_tb;
    private boolean field_A;
    LegacyOpenGlTransform3D field_M;
    LegacyOpenGlTransform3D field_mc;
    private float[] projectionMatrix;
    private boolean field_Zb;
    private float fogDistanceOffset;
    boolean supportsFramebufferObjects;
    private String field_E;
    private int field_t;
    private LegacyVertexBuffer field_Rb;
    private LegacyCubeMapSource field_Y;
    private int field_gc;
    LegacyOpenGlFramebuffer scratchFramebuffer;
    boolean field_vb;
    private int activeTextureUnit;
    private boolean field_J;
    private boolean field_gb;
    private int field_Yb;
    float[] field_o;
    int field_L;
    int field_yb;
    private int viewportX;
    private float fogEnd;
    int field_k;
    float fogStart;
    private float fogDistanceScale;
    private int field_wc;
    boolean field_B;
    private boolean field_ec;
    boolean field_Ob;
    private int field_db;
    boolean field_Cc;
    int field_u;
    private int field_Ub;
    private int clipTop;
    boolean supportsVertexPrograms;
    boolean field_Ic;
    private int field_lc;
    private int field_Q;
    private LegacyOpenGlTexture[] field_ib;
    private boolean fogEnabled;
    private int clipLeft;
    private LegacyVertexBuffer field_zc;
    private int clipBottom;
    int field_Mb;
    private boolean field_R;
    private boolean field_hb;
    private int fogColor;
    private boolean field_uc;
    private float projectionDepthOffset;
    private String field_Dc;
    private int field_sb;
    private int field_Nb;
    private int field_Cb;
    private boolean lightingSuppressed;
    private int field_v;
    private float projectionDepthScale;
    float field_z;
    float field_ac;
    boolean field_W;
    private int field_sc;
    private boolean field_Gc;
    private int clipRight;
    int field_kc;
    boolean field_C;
    private boolean field_K;
    private int field_xb;
    LegacyOpenGlTexture2D field_n;
    boolean supportsVertexShaders;
    float field_cb;
    private boolean lightingEnabled;
    boolean supportsFloatTextures;
    boolean supportsFragmentShaders;
    int maxTextureUnits;
    private boolean field_mb;
    private float field_kb;
    private int viewportY;
    float field_Fc;

    private final int initializeCapabilities(int guard) {
        int stackIn_26_0 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        String var3 = null;
        String[] var4 = null;
        int var5_int = 0;
        NumberFormatException var5 = null;
        int var6 = 0;
        int[] var9 = null;
        var2 = 0;
        this.field_E = jaggl.OpenGL.glGetString(7936).toLowerCase();
        this.field_Dc = jaggl.OpenGL.glGetString(7937).toLowerCase();
        if (this.field_E.indexOf("microsoft") != -1) {
          var2 = var2 | 1;
        }
        if (this.field_E.indexOf("brian paul") != -1 ||
          this.field_E.indexOf("mesa") != -1) {
          var2 = var2 | 1;
        }
        var3 = jaggl.OpenGL.glGetString(7938);
        var4 = SocialContact.split(' ', var3.replace('.', ' '), -27224);
        if (guard <= var4.length) {
          try {
            var5_int = LoginFormState.parseDecimal((byte) -128, (CharSequence) ((Object) var4[0]));
            var6 = LoginFormState.parseDecimal((byte) -127, (CharSequence) ((Object) var4[1]));
            this.field_Yb = var5_int * 10 + var6;
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (NumberFormatException) (Object) decompiledCaughtException;
            var2 = var2 | 4;
          }
        } else {
          var2 = var2 | 4;
        }
        if (this.field_Yb < 12) {
          var2 = var2 | 2;
        }
        if (!this.context.supportsExtension("GL_ARB_multitexture")) {
          var2 = var2 | 8;
        }
        if (!this.context.supportsExtension("GL_ARB_texture_env_combine")) {
          var2 = var2 | 32;
        }
        var9 = new int[1];
        jaggl.OpenGL.glGetIntegerv(34018, var9, 0);
        this.maxTextureUnits = var9[0];
        jaggl.OpenGL.glGetIntegerv(34929, var9, 0);
        this.field_Ub = var9[0];
        jaggl.OpenGL.glGetIntegerv(34930, var9, 0);
        this.field_xb = var9[0];
        if (this.maxTextureUnits < 2 ||
          this.field_Ub < 2 ||
          this.field_xb < 2) {
          var2 = var2 | 16;
        }
        this.field_R = jaclib.memory.Stream.isNativeBigEndian();
        this.field_Gc = this.context.arePbuffersAvailable();
        this.field_J = this.context.supportsExtension("GL_ARB_vertex_buffer_object");
        this.field_hb = this.context.supportsExtension("GL_ARB_multisample");
        this.supportsVertexPrograms = this.context.supportsExtension("GL_ARB_vertex_program");
        this.context.supportsExtension("GL_ARB_fragment_program");
        this.supportsVertexShaders = this.context.supportsExtension("GL_ARB_vertex_shader");
        this.supportsFragmentShaders = this.context.supportsExtension("GL_ARB_fragment_shader");
        this.field_Ic = this.context.supportsExtension("GL_EXT_texture3D");
        this.field_C = this.context.supportsExtension("GL_ARB_texture_rectangle");
        this.field_Ob = this.context.supportsExtension("GL_ARB_texture_cube_map");
        this.supportsFloatTextures = this.context.supportsExtension("GL_ARB_texture_float");
        this.field_Cc = false;
        this.supportsFramebufferObjects = this.context.supportsExtension("GL_EXT_framebuffer_object");
        this.field_B = this.context.supportsExtension("GL_EXT_framebuffer_blit");
        this.field_vb = this.context.supportsExtension("GL_EXT_framebuffer_multisample");
        this.field_W = FixedPointPerlinNoise3D.field_h.startsWith("mac");
        jaggl.OpenGL.glGetFloatv(2834, LegacyOpenGlSpriteMask.field_g, 0);
        stackIn_26_0 = (var2 != 0) ? var2 : 0;
        return stackIn_26_0;
    }

    private final void prepareSolidRendering(byte guard) {
        if (1 != this.field_nb) {
          this.usePixelProjection(1);
          this.setFogEnabled(3, false);
          this.setLightingEnabled(-69, false);
          this.setDepthTest(65, false);
          this.setDepthWriteEnabled(false, (byte) -94);
          this.bindTexture(106, (LegacyOpenGlTexture) null);
          this.bindMaterialTexture((byte) 123, -2);
          this.setTextureCombineMode(1, true);
          this.field_nb = 1;
        }
        int var2 = -67 % ((39 - guard) / 49);
    }

    private final void applyProjectionMatrix(byte guard) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.projectionMatrix, 0);
        jaggl.OpenGL.glMatrixMode(5888);
        int var2 = -104 % ((14 - guard) / 61);
    }

    private final void attachContextWithRetry(byte guard) {
        int incrementValue$1 = 0;
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        if (guard <= 73) {
          this.field_mc = (LegacyOpenGlTransform3D) null;
        }
        while (!this.context.attachToThread()) {
          incrementValue$1 = var2;
          var2++;
          if (incrementValue$1 > 5) {
            throw new RuntimeException("");
          }
          TextureCombineOperation.sleepMillis(1000L, (byte) 87);
        }
    }

    private final void translateTextureMatrix(float y, float z, float x, int guard) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (this.field_mb) {
          jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glTranslatef(x, y, z);
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_mb = true;
        if (guard != 32151) {
          this.field_nb = 10;
        }
    }

    final void setActiveTextureUnit(int unit, int guard) {
        if (guard < 79) {
          this.applyLightingState(false);
        }
        if (unit != this.activeTextureUnit) {
          jaggl.OpenGL.glActiveTexture(33984 + unit);
          this.activeTextureUnit = unit;
        }
    }

    private final void updateCanvasSize(boolean resetClip) {
        java.awt.Dimension var2 = null;
        if (this.canvas == null) {
          this.canvasWidth = 0;
          this.canvasHeight = 0;
        } else {
          var2 = this.canvas.getSize();
          this.canvasWidth = var2.width;
          this.canvasHeight = var2.height;
        }
        if (null == this.drawFramebuffer) {
          this.viewportHeight = this.canvasHeight;
          this.viewportWidth = this.canvasWidth;
          this.applyViewport((byte) -55);
        }
        this.invalidateProjectionMode((byte) -81);
        if (resetClip) {
          this.resetViewportClip(-1303);
          return;
        }
    }

    final void getClip(int[] bounds) {
        try {
          bounds[2] = this.clipRight;
          bounds[0] = this.clipLeft;
          bounds[1] = this.clipTop;
          bounds[3] = this.clipBottom;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fr.K(" + (bounds != null ? "{...}" : "null") + ')');
        }
    }

    final void drawHorizontalLine(int x, int y, int length, int color, int blendMode) {
        this.prepareSolidRendering((byte) -121);
        this.setBlendMode(25189, blendMode);
        float var6 = 0.3499999940395355f + (float)x;
        float var7 = (float)y + 0.3499999940395355f;
        jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(var6, var7);
        jaggl.OpenGL.glVertex2f((float)length + var6, var7);
        jaggl.OpenGL.glEnd();
    }

    final synchronized void queueRenderbufferDeletion(int renderbufferId, int guard, int bytes) {
        IntNode var4 = new IntNode(bytes);
        var4.key = (long)renderbufferId;
        this.field_fc.addLast((IntrusiveNode) (var4), (byte) 39);
        int var5 = 33 % ((guard - 32) / 38);
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 66) {
          return;
        }
        unfortunatelyYourConfigurationDoesnText = null;
    }

    private final void updateProjectionDepthTerms(byte guard) {
        if (guard >= -103) {
          this.field_zb = 95;
        }
        this.projectionMatrix[10] = this.projectionDepthScale;
        this.projectionMatrix[14] = this.projectionDepthOffset;
    }

    private final void popReadFramebuffer(LegacyOpenGlFramebufferTarget framebuffer, int guard) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.readFramebufferIndex >= 0 &&
            this.readFramebufferStack[this.readFramebufferIndex] == framebuffer) {
            fieldTemp$1 = this.readFramebufferIndex;
            this.readFramebufferIndex = this.readFramebufferIndex - 1;
            this.readFramebufferStack[fieldTemp$1] = null;
            if (guard < 68) {
              return;
            }
            framebuffer.unbindReadFramebuffer(-20745);
            if (this.readFramebufferIndex < 0) {
              this.readFramebuffer = null;
            } else {
              this.readFramebuffer = this.readFramebufferStack[this.readFramebufferIndex];
              this.readFramebuffer.bindReadFramebuffer(195);
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("fr.QB(");
          if (framebuffer == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    final boolean isFloatPostProcessingEnabled() {
        return this.floatPostProcessEffect != null && this.floatPostProcessEffect.isEnabled(118);
    }

    final ToolkitFont createFont(FontMetrics metrics, SpriteData[] glyphs, boolean useMaskGlyphs) {
        RuntimeException var4 = null;
        LegacyOpenGlBitmapFont stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new LegacyOpenGlBitmapFont(this, metrics, glyphs, useMaskGlyphs);
          return (ToolkitFont) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("fr.DF(");
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

    final void setTextureConstantRgba(int guard, float green, float blue, float red, float alpha) {
        LegacyOpenGlSpriteMask.field_g[2] = blue;
        if (guard != 31322) {
          this.field_Xb = 70;
        }
        LegacyOpenGlSpriteMask.field_g[0] = red;
        LegacyOpenGlSpriteMask.field_g[1] = green;
        LegacyOpenGlSpriteMask.field_g[3] = alpha;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, LegacyOpenGlSpriteMask.field_g, 0);
    }

    final void bindTexture(int guard, LegacyOpenGlTexture texture) {
        RuntimeException runtimeException = null;
        LegacyOpenGlTexture var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard < 8) {
            this.applyScissorRect(75);
          }
          var3 = this.field_ib[this.activeTextureUnit];
          if (texture != var3) {
            if (texture == null) {
              jaggl.OpenGL.glDisable(var3.target);
            } else {
              if (var3 == null) {
                jaggl.OpenGL.glEnable(texture.target);
              } else {
                if (texture.target != var3.target) {
                  jaggl.OpenGL.glDisable(var3.target);
                  jaggl.OpenGL.glEnable(texture.target);
                }
              }
              jaggl.OpenGL.glBindTexture(texture.target, texture.textureId(-113));
            }
            this.field_ib[this.activeTextureUnit] = texture;
          }
          this.field_nb = this.field_nb & -2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_17_0 = runtimeException;
          stackIn_17_1 = new StringBuilder().append("fr.L(").append(guard).append(',');
          if (texture == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final int glTextureCombineOperation(int operation, byte guard) {
        if (guard != -14) {
          LegacyOpenGlFramebufferTarget var4 = (LegacyOpenGlFramebufferTarget) null;
          this.popFramebuffer((byte) 16, (LegacyOpenGlFramebufferTarget) null);
        }
        if (operation == 1) {
          return 7681;
        }
        if (operation == 0) {
          return 8448;
        }
        if (operation == 2) {
          return 34165;
        }
        if (operation == 3) {
          return 260;
        }
        if (operation != 4) {
          throw new IllegalArgumentException();
        }
        return 34023;
    }

    final RenderBuffer createRenderBuffer(int width, int height) {
        return null;
    }

    final void prepareSpriteRendering(int guard) {
        if (2 != this.field_nb) {
          this.usePixelProjection(1);
          this.setFogEnabled(3, false);
          this.setLightingEnabled(-74, false);
          this.setDepthTest(99, false);
          this.setDepthWriteEnabled(false, (byte) -89);
          this.bindMaterialTexture((byte) 119, -2);
          this.field_nb = 2;
        }
        if (guard > -49) {
          ToolkitSprite var3 = (ToolkitSprite) null;
          this.bindSpriteTarget((ToolkitSprite) null, true);
        }
    }

    private final void applyDepthWrite(int guard) {
        boolean stackIn_6_0 = false;
        if (guard >= -105) {
          this.supportsFragmentShaders = false;
        }
        stackIn_6_0 = (this.depthWriteEnabled) && (this.field_Zb);
        jaggl.OpenGL.glDepthMask(stackIn_6_0);
    }

    LegacyOpenGlGraphicsToolkit(java.awt.Canvas param0, TextureProvider param1, int param2) {
        super(param1);
        long dupTemp$4 = 0L;
        int var9 = 0;
        int stackIn_12_1 = 0;
        boolean stackIn_51_1 = false;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var4_int = 0;
        Throwable var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        Throwable var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        String var10 = null;
        Exception var11 = null;
        String var13 = null;
        int[] var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        CharSequence var21 = null;
        CharSequence var22 = null;
        CharSequence var23 = null;
        var18 = null;
        var19 = null;
        var20 = null;
        this.field_Gb = new Hashtable();
        this.field_X = 128;
        this.field_O = new LegacyOpenGlInterleavedStream();
        LegacyOpenGlTransform3D discarded$0 = new LegacyOpenGlTransform3D();
        LegacyOpenGlTransform3D discarded$1 = new LegacyOpenGlTransform3D();
        this.field_jc = false;
        this.field_oc = new IntrusiveDeque();
        this.field_Jb = -1;
        this.readFramebufferIndex = -1;
        this.readFramebufferStack = new LegacyOpenGlFramebufferTarget[4];
        this.drawFramebufferStack = new LegacyOpenGlFramebufferTarget[4];
        this.drawFramebufferIndex = -1;
        this.field_dc = new LegacyOpenGlFramebufferTarget[4];
        this.field_Db = new SecondaryNodeQueue();
        this.field_nc = new IntrusiveNodeHashTable(16);
        this.field_fb = new IntrusiveDeque();
        this.buffersToDelete = new IntrusiveDeque();
        this.field_q = new IntrusiveDeque();
        this.framebuffersToDelete = new IntrusiveDeque();
        this.field_fc = new IntrusiveDeque();
        this.field_qb = new IntrusiveDeque();
        this.field_cc = new IntrusiveDeque();
        LegacyOpenGlTransform3D discarded$2 = new LegacyOpenGlTransform3D();
        this.field_M = new LegacyOpenGlTransform3D();
        this.field_mc = new LegacyOpenGlTransform3D();
        this.field_t = 0;
        this.fogDistanceOffset = 0.0f;
        this.field_gc = 8448;
        this.field_o = new float[4];
        this.field_Zb = true;
        this.projectionMatrix = new float[16];
        this.viewportX = 0;
        this.field_db = 0;
        this.field_lc = 0;
        this.field_sb = 512;
        this.clipTop = 0;
        this.field_Cb = 3584;
        this.fogDistanceScale = 1.0f;
        this.field_k = -1;
        this.clipBottom = 0;
        this.field_v = 8448;
        this.field_u = -1;
        this.field_sc = 50;
        this.field_ac = 1.0f;
        this.field_Mb = 0;
        this.field_gb = false;
        this.field_z = 1.0f;
        this.field_Nb = 512;
        this.fogColor = -1;
        this.field_kc = -1;
        this.clipLeft = 0;
        this.clipRight = 0;
        this.field_kb = 1.0f;
        this.viewportY = 0;
        this.field_Fc = 1.0f;
        FloatPacketBuffer discarded$3 = new FloatPacketBuffer(8192);
        try {
          this.field_Bc = param2;
          this.canvas = param0;
          if (!ScrollPane.b((byte) -107, "jaclib")) {
            throw new RuntimeException("");
          }
          if (!ScrollPane.b((byte) 97, "jaggl")) {
            throw new RuntimeException("");
          }
          try {
            this.context = new jaggl.OpenGL();
            dupTemp$4 = this.context.init(param0, 8, 8, 8, 24, 0, this.field_Bc);
            this.field_ob = dupTemp$4;
            this.field_rb = dupTemp$4;
            if (this.field_ob == 0L) {
              throw new RuntimeException("");
            }
            this.attachContextWithRetry((byte) 117);
            var4_int = this.initializeCapabilities(2);
            if (0 != var4_int) {
              throw new RuntimeException("");
            }
            if (this.field_R) {
              stackIn_12_1 = 33639;
            } else {
              stackIn_12_1 = 5121;
            }
            this.field_L = stackIn_12_1;
            if (-1 != this.field_Dc.indexOf("radeon")) {
              var5_int = 0;
              var6 = 0;
              var7 = 0;
              var8 = SocialContact.split(' ', this.field_Dc.replace('/', ' '), -27224);
              for (var9 = 0; var8.length > var9; var9++) {
                var13 = var8[var9];
                var10 = var13;
                var10 = var13;
                var10 = var13;
                try {
                  boolean decompiledFrameRemainder0 = true;
                  if (var13.length() > 0) {
                    if (var13.charAt(0) == 120 &&
                      3 <= var13.length()) {
                      var21 = (CharSequence) ((Object) var13.substring(1, 3));
                      if (ContentTransitionPhase.a(-13181, var21)) {
                        var7 = 1;
                        var10 = var13.substring(1);
                      }
                    }
                    if (var10.equals("hd")) {
                      var6 = 1;
                    } else {
                      if (var10.startsWith("hd")) {
                        var10 = var10.substring(2);
                        var6 = 1;
                      }
                      if (4 <= var10.length()) {
                        var22 = (CharSequence) ((Object) var10.substring(0, 4));
                        if (ContentTransitionPhase.a(-13181, var22)) {
                          var23 = (CharSequence) ((Object) var10.substring(0, 4));
                          var5_int = LoginFormState.parseDecimal((byte) -128, var23);
                          decompiledRegionSelector0 = 1;
                          decompiledFrameRemainder0 = false;
                        }
                      }
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    decompiledRegionSelector0 = 0;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var11 = (Exception) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 0;
                }
                if (decompiledRegionSelector0 == 0) {
                  continue;
                }
                break;
              }
              if (var7 == 0 &&
                var6 == 0) {
                if (7000 <= var5_int &&
                  var5_int <= 7999) {
                  this.field_J = false;
                }
                if (var5_int >= 7000 &&
                  var5_int <= 9250) {
                  this.field_Ic = false;
                }
              }
              if (var6 == 0 ||
                var5_int < 4000) {
                this.supportsFloatTextures = false;
              }
              this.field_C = this.field_C & this.context.supportsExtension("GL_ARB_half_float_pixel");
              this.field_K = this.field_J;
            }
            if (this.field_E.indexOf("intel") != -1) {
              this.supportsFramebufferObjects = false;
            }
            stackIn_51_1 = !(this.field_E.equals("s3 graphics"));
            this.field_ec = stackIn_51_1;
            if (this.field_J) {
              try {
                var17 = new int[1];
                jaggl.OpenGL.glGenBuffersARB(1, var17, 0);
              } catch (java.lang.Throwable decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var5 = decompiledCaughtException;
                throw new RuntimeException("");
              }
            }
            RasterColorTables.retainColorTables(true, -107, false);
            this.field_jc = true;
            this.field_Pb = new LegacyOpenGlTextureCache(this, this.textureProvider);
            this.initializeDeviceResources((byte) -93);
            this.normalMapGenerator = new LegacyOpenGlNormalMapGenerator(this);
            this.postProcessManager = new LegacyOpenGlPostProcessManager(this);
            if (this.postProcessManager.isAvailable(550267135)) {
              this.floatPostProcessEffect = new LegacyOpenGlFloatPostProcessEffect(this);
              if (!this.floatPostProcessEffect.isSupported(-8111)) {
                this.floatPostProcessEffect.close(50);
                this.floatPostProcessEffect = null;
              }
            }
            this.effectManager = new LegacyOpenGlEffectManager(this);
            this.resetDriverState(0);
            this.updateCanvasSize(true);
            this.copyFrontToBack();
            return;
          } catch (java.lang.Throwable decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var4 = decompiledCaughtException;
            var4.printStackTrace();
            this.dispose();
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_64_0 = var4_ref;
          stackIn_64_1 = new StringBuilder().append("fr.<init>(");
          if (param0 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param1 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param2).append(')').toString());
        }
    }

    final void setTextureCombineOperations(int guard, int alphaOperation, int colorOperation) {
        int var4;
        if (guard != 20685) {
          return;
        }
        if (this.activeTextureUnit != 0) {
          jaggl.OpenGL.glTexEnvi(8960, 34161, colorOperation);
          jaggl.OpenGL.glTexEnvi(8960, 34162, alphaOperation);
        } else {
          var4 = 0;
          if (colorOperation != this.field_gc) {
            jaggl.OpenGL.glTexEnvi(8960, 34161, colorOperation);
            this.field_gc = colorOperation;
            var4 = 1;
          }
          if (this.field_v != alphaOperation) {
            jaggl.OpenGL.glTexEnvi(8960, 34162, alphaOperation);
            var4 = 1;
            this.field_v = alphaOperation;
          }
          if (var4 != 0) {
            this.field_nb = this.field_nb & -30;
          }
        }
    }

    final void setLightingSuppressed(boolean suppressed, byte guard) {
        if ((!this.lightingSuppressed ? 1 : 0) == (suppressed ? 1 : 0)) {
          this.lightingSuppressed = suppressed ? true : false;
          this.applyLightingState(true);
        }
        if (guard >= -63) {
          this.field_yb = 22;
        }
    }

    final int[] projectionParameters() {
        return new int[]{this.field_t, this.field_db, this.field_Nb, this.field_sb};
    }

    final synchronized void queueBufferDeletion(int bufferId, boolean guard, int byteLength) {
        if (!guard) {
          this.field_Ub = 26;
        }
        IntNode var4 = new IntNode(byteLength);
        var4.key = (long)bufferId;
        this.buffersToDelete.addLast((IntrusiveNode) (var4), (byte) 39);
    }

    final void dispose() {
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        IntrusiveNode var1 = this.field_oc.first(79);
        while (var1 != null) {
          ((LegacyOpenGlGraphicsHeap) (var1)).close(-4009);
          var1 = this.field_oc.next((byte) 18);
        }
        if (this.postProcessManager != null) {
          this.postProcessManager.close((byte) 113);
        }
        if (null != this.context) {
          this.detachContext(-27782);
          var1_ref = this.field_Gb.keys();
          while (var1_ref.hasMoreElements()) {
            var2 = (java.awt.Canvas) (var1_ref.nextElement());
            var3 = (Long) (this.field_Gb.get(var2));
            this.context.releaseSurface(var2, var3.longValue());
          }
          this.context.release();
          this.context = null;
        }
        if (this.field_jc) {
          CubeMapSource.releaseColorTables(false, true, -1);
          this.field_jc = false;
        }
    }

    final void bindRenderTarget(RenderTarget target) {
    }

    final ToolkitSprite createSprite(SpriteData data, boolean preferIndexed) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        ToolkitSprite stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        ToolkitSprite var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          var10 = new int[data.height * data.width];
          var12 = var10;
          var11 = var12;
          var3 = var11;
          var4 = 0;
          var5 = 0;
          if (data.alpha != null) {
            for (var6_int = 0; data.height > var6_int; var6_int++) {
              for (var7 = 0; data.width > var7; var7++) {
                incrementValue$0 = var5;
                var5++;
                var3[incrementValue$0] = LegacyOpenGlInterleavedStream.bitwiseOr(data.palette[LegacyOpenGlPostProcessManager.bitwiseAnd((int) data.indices[var4], 255)], data.alpha[var4] << 24);
                var4++;
              }
            }
          } else {
            for (var6_int = 0; data.height > var6_int; var6_int++) {
              for (var7 = 0; data.width > var7; var7++) {
                incrementValue$1 = var4;
                var4++;
                var8 = data.palette[255 & data.indices[incrementValue$1]];
                incrementValue$2 = var5;
                var5++;
                stackIn_8_0 = var10;
                stackIn_8_1 = incrementValue$2;
                if (var8 != 0) {
                  stackIn_9_2 = LegacyOpenGlInterleavedStream.bitwiseOr(-16777216, var8);
                } else {
                  stackIn_9_2 = 0;
                }
                stackIn_8_0[stackIn_8_1] = stackIn_9_2;
              }
            }
          }
          var6 = this.createSpriteCopy(0, -2, data.height, data.width, data.width, var12);
          var6.setInsets(data.leftInset, data.topInset, data.rightInset, data.bottomInset);
          stackIn_18_0 = var6;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("fr.RA(");
          if (data == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(preferIndexed).append(')').toString());
        }
    }

    private final void detachContext(int guard) {
        if (guard != -27782) {
          this.restoreCanvasTarget();
        }
        this.context.detachFromThread();
    }

    final boolean usesNativeRendering() {
        return true;
    }

    private final void resetTextureMatrix(boolean guard) {
        if (this.field_mb) {
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glMatrixMode(5888);
          this.field_mb = false;
        }
        if (guard) {
          this.field_cc = (IntrusiveDeque) null;
        }
    }

    final void setProjection(int centerX, int centerY, int scaleX, int scaleY) {
        this.field_Nb = scaleX;
        this.field_db = centerY;
        this.field_sb = scaleY;
        this.field_t = centerX;
        this.buildPerspectiveProjection(770);
        this.clipChanged(-117);
        if (this.field_Q == 3) {
          this.applyOrthographicProjection(-15048);
        } else {
          if (this.field_Q == 2) {
            this.applyProjectionMatrix((byte) -108);
          }
        }
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
          stackIn_4_1 = new StringBuilder().append("fr.OF(");
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

    final void drawPixels(int x, int y, int width, int height, int[] pixels, int offset, int stride) {
        try {
          this.usePixelProjection(1);
          this.bindTexture(88, (LegacyOpenGlTexture) null);
          this.setBlendMode(25189, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
          jaggl.OpenGL.glRasterPos2i(x, y);
          jaggl.OpenGL.glDrawPixelsi(width, height, 32993, this.field_L, pixels, offset);
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fr.SA(" + x + ',' + y + ',' + width + ',' + height + ',' + (pixels != null ? "{...}" : "null") + ',' + offset + ',' + stride + ')');
        }
    }

    private final void invalidateProjectionMode(byte guard) {
        if (guard == -81) {
          if (0 != this.field_Q) {
            this.field_Q = 0;
            this.field_nb = this.field_nb & -32;
          }
          return;
        }
    }

    final boolean supportsUnderwaterEffect(int guard) {
        int var2 = 35 / ((-45 - guard) / 58);
        return this.effectManager.isSupported(3, (byte) 71);
    }

    final void setTextureCombineMode(int mode, boolean guard) {
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (!guard) {
          this.viewportHeight = -84;
        }
        if (mode == 1) {
          this.setTextureCombineOperations(20685, 7681, 7681);
        } else {
          if (mode != 0) {
            if (mode == 2) {
              this.setTextureCombineOperations(20685, 7681, 34165);
            } else {
              if (mode == 3) {
                this.setTextureCombineOperations(20685, 8448, 260);
              } else {
                if (4 == mode) {
                  this.setTextureCombineOperations(20685, 34023, 34023);
                }
              }
            }
          } else {
            this.setTextureCombineOperations(20685, 8448, 8448);
          }
        }
    }

    final synchronized void queueAssemblyProgramDeletion(int programId, byte guard) {
        IntrusiveNode var3 = new IntrusiveNode();
        var3.key = (long)programId;
        int var4 = -109 / ((25 - guard) / 42);
        this.field_qb.addLast(var3, (byte) 39);
    }

    final synchronized void queueFramebufferDeletion(byte guard, int framebufferId) {
        IntNode var3 = new IntNode(framebufferId);
        if (guard > -1) {
          this.viewportY = -108;
        }
        this.framebuffersToDelete.addLast((IntrusiveNode) (var3), (byte) 39);
    }

    final void restoreCanvasTarget() {
        if (!this.supportsFramebufferObjects) {
          if (!this.field_Gc) {
            throw new RuntimeException("");
          }
          this.field_Tb.copyFromFramebuffer(0, this.viewportHeight, 0, 0, 0, this.viewportWidth, -3773);
          this.context.setSurface(this.field_rb);
        } else {
          if (this.drawFramebuffer == this.field_H) {
            this.field_H.detachAttachment(0, 17012);
            this.field_H.detachAttachment(8, 17012);
            this.popFramebuffer((byte) -123, (LegacyOpenGlFramebufferTarget) (this.field_H));
            this.field_Tb = null;
            this.viewportHeight = this.canvasHeight;
            this.viewportWidth = this.canvasWidth;
            this.invalidateProjectionMode((byte) -81);
            this.applyViewport((byte) -81);
            this.resetViewportClip(-1303);
            return;
          }
          throw new RuntimeException();
        }
        this.field_Tb = null;
        this.viewportHeight = this.canvasHeight;
        this.viewportWidth = this.canvasWidth;
        this.invalidateProjectionMode((byte) -81);
        this.applyViewport((byte) -81);
        this.resetViewportClip(-1303);
    }

    final void useHeap(GraphicsHeap heap) {
        LegacyVertexAttribute discarded$2 = null;
        LegacyVertexAttribute discarded$3 = null;
        FloatPacketBuffer var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_pb = ((LegacyOpenGlGraphicsHeap) (heap)).heap;
          if (null == this.field_Rb) {
            var3 = new FloatPacketBuffer(80);
            if (this.field_R) {
              var3.writeFloat((byte) 87, -1.0f);
              var3.writeFloat((byte) -69, -1.0f);
              var3.writeFloat((byte) -120, 0.0f);
              var3.writeFloat((byte) 87, 0.0f);
              var3.writeFloat((byte) -108, 1.0f);
              var3.writeFloat((byte) 108, 1.0f);
              var3.writeFloat((byte) 93, -1.0f);
              var3.writeFloat((byte) 125, 0.0f);
              var3.writeFloat((byte) 76, 1.0f);
              var3.writeFloat((byte) 72, 1.0f);
              var3.writeFloat((byte) 74, 1.0f);
              var3.writeFloat((byte) 109, 1.0f);
              var3.writeFloat((byte) 123, 0.0f);
              var3.writeFloat((byte) -77, 1.0f);
              var3.writeFloat((byte) 121, 0.0f);
              var3.writeFloat((byte) 90, -1.0f);
              var3.writeFloat((byte) 121, 1.0f);
              var3.writeFloat((byte) 86, 0.0f);
              var3.writeFloat((byte) -66, 0.0f);
              var3.writeFloat((byte) 95, 0.0f);
            } else {
              var3.writeFloatLE((byte) -36, -1.0f);
              var3.writeFloatLE((byte) -36, -1.0f);
              var3.writeFloatLE((byte) -36, 0.0f);
              var3.writeFloatLE((byte) -36, 0.0f);
              var3.writeFloatLE((byte) -36, 1.0f);
              var3.writeFloatLE((byte) -36, 1.0f);
              var3.writeFloatLE((byte) -36, -1.0f);
              var3.writeFloatLE((byte) -36, 0.0f);
              var3.writeFloatLE((byte) -36, 1.0f);
              var3.writeFloatLE((byte) -36, 1.0f);
              var3.writeFloatLE((byte) -36, 1.0f);
              var3.writeFloatLE((byte) -36, 1.0f);
              var3.writeFloatLE((byte) -36, 0.0f);
              var3.writeFloatLE((byte) -36, 1.0f);
              var3.writeFloatLE((byte) -36, 0.0f);
              var3.writeFloatLE((byte) -36, -1.0f);
              var3.writeFloatLE((byte) -36, 1.0f);
              var3.writeFloatLE((byte) -36, 0.0f);
              var3.writeFloatLE((byte) -36, 0.0f);
              var3.writeFloatLE((byte) -36, 0.0f);
            }
            this.field_Rb = this.createVertexBuffer(20, false, (byte) -23, var3.position, var3.payload);
            discarded$2 = new LegacyVertexAttribute(this.field_Rb, 5126, 3, 0);
            discarded$3 = new LegacyVertexAttribute(this.field_Rb, 5126, 2, 12);
            this.field_O.initializeStream(this, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("fr.OB(");
          if (heap == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void buildPerspectiveProjection(int guard) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float[] var8;
        float var7;
        var8 = this.projectionMatrix;
        var2 = var8;
        var3 = (float)(-this.field_t * this.field_sc) / (float)this.field_Nb;
        var4 = (float)((this.viewportWidth - this.field_t) * this.field_sc) / (float)this.field_Nb;
        if (guard != 770) {
          return;
        }
        var5 = (float)(this.field_db * this.field_sc) / (float)this.field_sb;
        var6 = (float)((this.field_db - this.viewportHeight) * this.field_sc) / (float)this.field_sb;
        if (var3 != var4 &&
          var6 != var5) {
          var7 = (float)this.field_sc * 2.0f;
          var2[6] = 0.0f;
          var2[4] = 0.0f;
          var2[8] = (var3 + var4) / (var4 - var3);
          var2[3] = 0.0f;
          var2[12] = 0.0f;
          var2[15] = 0.0f;
          var2[9] = (var5 + var6) / (var5 - var6);
          var2[1] = 0.0f;
          var2[2] = 0.0f;
          this.projectionDepthOffset = -(var7 * (float)this.field_Cb) / (float)(-this.field_sc + this.field_Cb);
          var2[14] = -(var7 * (float)this.field_Cb) / (float)(-this.field_sc + this.field_Cb);
          var2[0] = var7 / (var4 - var3);
          var2[11] = -1.0f;
          var2[7] = 0.0f;
          this.projectionDepthScale = (float)(-(this.field_sc + this.field_Cb)) / (float)(-this.field_sc + this.field_Cb);
          var2[10] = (float)(-(this.field_sc + this.field_Cb)) / (float)(-this.field_sc + this.field_Cb);
          var2[5] = var7 / (-var6 + var5);
          var2[13] = 0.0f;
        } else {
          var8[15] = 1.0f;
          var8[13] = 0.0f;
          var8[9] = 0.0f;
          var8[2] = 0.0f;
          var8[5] = 1.0f;
          var8[10] = 1.0f;
          var8[11] = 0.0f;
          var8[7] = 0.0f;
          var8[14] = 0.0f;
          var8[6] = 0.0f;
          var8[1] = 0.0f;
          var8[4] = 0.0f;
          var8[8] = 0.0f;
          var8[0] = 1.0f;
          var8[12] = 0.0f;
          var8[3] = 0.0f;
        }
        this.updateProjectionDepthTerms((byte) -127);
    }

    final void setFogDistanceAdjustment(float scale, int guard, float offset) {
        this.fogDistanceOffset = offset;
        this.fogDistanceScale = scale;
        this.applyFogParameters(guard + 3074);
        if (guard != 15) {
          this.initializeDeviceResources((byte) -17);
        }
    }

    private final void applyOrthographicProjection(int guard) {
        float var2 = this.field_kb * (float)(-this.field_t) / (float)this.field_Nb;
        float var3 = this.field_kb * (float)(-this.field_db) / (float)this.field_sb;
        float var4 = this.field_kb * (float)(-this.field_t + this.viewportWidth) / (float)this.field_Nb;
        float var5 = this.field_kb * (float)(-this.field_db + this.viewportHeight) / (float)this.field_sb;
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        if (var4 != var2 &&
          var5 != var3) {
          jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field_sc, (double)this.field_Cb);
        }
        if (guard == -15048) {
          jaggl.OpenGL.glMatrixMode(5888);
          return;
        }
    }

    final synchronized void queueTextureDeletion(int textureId, int bytes, byte guard) {
        int var5 = -72 % ((53 - guard) / 38);
        IntNode var4 = new IntNode(bytes);
        var4.key = (long)textureId;
        this.field_q.addLast((IntrusiveNode) (var4), (byte) 39);
    }

    private final void applyFogEnabled(int guard) {
        if (this.fogEnabled &&
          this.field_kc >= 0) {
          jaggl.OpenGL.glEnable(2912);
        } else {
          jaggl.OpenGL.glDisable(2912);
        }
        if (guard != 16) {
          this.prepareGlyphRendering(-114);
        }
    }

    final void prepareGlyphRendering(int guard) {
        if (guard != -25462) {
          this.readFramebufferStack = (LegacyOpenGlFramebufferTarget[]) null;
        }
        if (this.field_nb != 4) {
          this.usePixelProjection(1);
          this.setFogEnabled(guard + 25465, false);
          this.setLightingEnabled(-55, false);
          this.setDepthTest(guard ^ -25409, false);
          this.setDepthWriteEnabled(false, (byte) -101);
          this.bindMaterialTexture((byte) 110, -2);
          this.setBlendMode(25189, 1);
          this.field_nb = 4;
        }
    }

    final void intersectClip(int left, int top, int right, int bottom) {
        if (this.clipLeft < left) {
          this.clipLeft = left;
        }
        if (right < this.clipRight) {
          this.clipRight = right;
        }
        if (top > this.clipTop) {
          this.clipTop = top;
        }
        if (this.clipBottom > bottom) {
          this.clipBottom = bottom;
        }
        jaggl.OpenGL.glEnable(3089);
        this.clipChanged(-124);
        this.applyScissorRect(0);
    }

    final GraphicsHeap createHeap(int capacity) {
        LegacyOpenGlGraphicsHeap var2 = new LegacyOpenGlGraphicsHeap(capacity);
        this.field_oc.addLast((IntrusiveNode) (var2), (byte) 39);
        return (GraphicsHeap) ((Object) var2);
    }

    final void fillRectangle(int x, int y, int width, int height, int color, int blendMode) {
        float var7 = (float)x + 0.3499999940395355f;
        float var8 = (float)y + 0.3499999940395355f;
        float var9 = var7 + (float)width;
        this.prepareSolidRendering((byte) -36);
        float var10 = var8 + (float)height;
        this.setBlendMode(25189, blendMode);
        jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
        if (this.field_hb) {
          jaggl.OpenGL.glDisable(32925);
        }
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glVertex2f(var7, var8);
        jaggl.OpenGL.glVertex2f(var7, var10);
        jaggl.OpenGL.glVertex2f(var9, var10);
        jaggl.OpenGL.glVertex2f(var9, var8);
        jaggl.OpenGL.glEnd();
        if (this.field_hb) {
          jaggl.OpenGL.glEnable(32925);
        }
    }

    private final void bindMaterialTexture(byte guard, int textureId) {
        this.bindMaterialTexture(true, textureId, (byte) -102);
        if (guard < 109) {
          this.field_Mb = 30;
        }
    }

    final void setClip(int left, int top, int right, int bottom) {
        if (left < 0) {
          left = 0;
        }
        if (this.viewportHeight < bottom) {
          bottom = this.viewportHeight;
        }
        if (top < 0) {
          top = 0;
        }
        if (this.viewportWidth < right) {
          right = this.viewportWidth;
        }
        this.clipTop = top;
        this.clipBottom = bottom;
        this.clipRight = right;
        this.clipLeft = left;
        jaggl.OpenGL.glEnable(3089);
        this.clipChanged(-122);
        this.applyScissorRect(0);
    }

    final void setTextureCombineSources(int rgbSource, int alphaSource, int index, int guard) {
        jaggl.OpenGL.glTexEnvi(8960, index + 34176, rgbSource);
        jaggl.OpenGL.glTexEnvi(8960, index + 34192, alphaSource);
        int var5 = 42 % ((guard + 69) / 47);
    }

    final synchronized void queueShaderObjectDeletion(long objectId, byte guard) {
        IntrusiveNode var4 = new IntrusiveNode();
        int var5 = 35 / ((-24 - guard) / 54);
        var4.key = objectId;
        this.field_cc.addLast(var4, (byte) 39);
    }

    private final void pushReadFramebuffer(int guard, LegacyOpenGlFramebufferTarget framebuffer) {
        int fieldTemp$0 = 0;
        try {
          if (3 <= this.readFramebufferIndex) {
            throw new RuntimeException();
          }
          if (guard != 30369) {
            this.field_Fc = -0.9330850839614868f;
          }
          if (this.readFramebufferIndex >= 0) {
            this.readFramebufferStack[this.readFramebufferIndex].unbindReadFramebuffer(-20745);
          }
          fieldTemp$0 = this.readFramebufferIndex + 1;
          this.readFramebufferIndex = this.readFramebufferIndex + 1;
          this.readFramebufferStack[fieldTemp$0] = framebuffer;
          this.readFramebuffer = framebuffer;
          this.readFramebuffer.bindReadFramebuffer(195);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fr.HB(" + guard + ',' + (framebuffer != null ? "{...}" : "null") + ')');
        }
    }

    private final void resetViewportClip(int guard) {
        this.clipTop = 0;
        this.clipLeft = 0;
        this.clipBottom = this.viewportHeight;
        if (guard == -1303) {
          this.clipRight = this.viewportWidth;
          jaggl.OpenGL.glDisable(3089);
          this.clipChanged(-117);
          return;
        }
    }

    private final void setFogEnabled(int guard, boolean enabled) {
        if (this.fogEnabled != enabled) {
          this.fogEnabled = enabled ? true : false;
          this.applyFogEnabled(16);
          this.field_nb = this.field_nb & -32;
        }
        if (guard != 3) {
          this.field_R = false;
        }
    }

    final void present(int sourceX, int sourceY) throws RenderPresentationException {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        try {
          this.context.swapBuffers();
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
        }
    }

    final int[] readPixels(int y, int width, int guard, int x, int height) {
        int var7 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 1) {
          SpriteData var9 = (SpriteData) null;
          this.createSprite((SpriteData) null, true);
        }
        int[] var10 = new int[width * height];
        int[] var6 = var10;
        for (var7 = 0; height > var7; var7++) {
          jaggl.OpenGL.glReadPixelsi(x, this.viewportHeight - (y + var7), width, 1, 32993, this.field_L, var10, width * var7);
        }
        return var10;
    }

    private final void resetDriverState(int guard) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        this.bindMaterialTexture((byte) 111, -2);
        for (var2 = this.maxTextureUnits - 1; var2 >= 0; var2--) {
          this.setActiveTextureUnit(var2, 90);
          this.bindTexture(guard + 111, (LegacyOpenGlTexture) null);
          jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.setTextureCombineOperations(guard + 20685, 8448, 8448);
        this.setTextureCombineSources(34168, 770, 2, 10);
        this.resetTextureMatrix(false);
        this.field_Ab = 1;
        jaggl.OpenGL.glEnable(3042);
        jaggl.OpenGL.glBlendFunc(770, 771);
        this.field_zb = 1;
        jaggl.OpenGL.glEnable(3008);
        jaggl.OpenGL.glAlphaFunc(516, 0.0f);
        this.field_A = true;
        jaggl.OpenGL.glColorMask(true, true, true, true);
        this.field_tb = true;
        this.setFogEnabled(guard ^ 3, true);
        this.setLightingEnabled(-44, true);
        this.setDepthTest(84, true);
        this.setDepthWriteEnabled(true, (byte) -76);
        this.invalidateProjectionMode((byte) -81);
        this.context.setSwapInterval(0);
        jaggl.OpenGL.glShadeModel(7425);
        jaggl.OpenGL.glClearDepth(1.0f);
        jaggl.OpenGL.glDepthFunc(515);
        jaggl.OpenGL.glPolygonMode(1028, 6914);
        jaggl.OpenGL.glEnable(2884);
        jaggl.OpenGL.glCullFace(1029);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glColorMaterial(1028, 5634);
        jaggl.OpenGL.glEnable(2903);
        float[] var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
        for (var3 = guard; var3 < 8; var3++) {
          var4 = 16384 + var3;
          jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
          jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
          jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
        }
        jaggl.OpenGL.glEnable(16384);
        jaggl.OpenGL.glEnable(16385);
        jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
        jaggl.OpenGL.glFogi(2917, 9729);
        jaggl.OpenGL.glHint(3156, 4353);
        this.fogColor = -1;
        this.resetViewportClip(guard - 1303);
    }

    final void drawLine(int x0, int y0, int x1, int y1, int color, int blendMode) {
        float var7;
        float var8;
        float var9;
        this.prepareSolidRendering((byte) -99);
        this.setBlendMode(25189, blendMode);
        var7 = (float)(-x0) + (float)x1;
        var8 = (float)y1 - (float)y0;
        if (0.0f == var7 &&
          0.0f == var8) {
          var7 = 1.0f;
        } else {
          var9 = (float)(1.0 / Math.sqrt((double)(var8 * var8 + var7 * var7)));
          var8 = var8 * var9;
          var7 = var7 * var9;
        }
        jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
        jaggl.OpenGL.glBegin(1);
        jaggl.OpenGL.glVertex2f(0.3499999940395355f + (float)x0, (float)y0 + 0.3499999940395355f);
        jaggl.OpenGL.glVertex2f(var7 + (float)x1 + 0.3499999940395355f, 0.3499999940395355f + (var8 + (float)y1));
        jaggl.OpenGL.glEnd();
    }

    private final void setLightingEnabled(int guard, boolean enabled) {
        if ((!this.lightingEnabled ? 1 : 0) == (enabled ? 1 : 0)) {
          this.lightingEnabled = enabled ? true : false;
          this.applyLightingState(true);
          this.field_nb = this.field_nb & -8;
        }
        if (guard > -8) {
          this.field_nc = (IntrusiveNodeHashTable) null;
        }
    }

    private final void setDepthWriteEnabled(boolean enabled, byte guard) {
        if (guard < -73) {
          if ((!enabled ? 1 : 0) == (this.depthWriteEnabled ? 1 : 0)) {
            this.depthWriteEnabled = enabled ? true : false;
            this.applyDepthWrite(-112);
            this.field_nb = this.field_nb & -32;
          }
          return;
        }
    }

    final int farPlane() {
        return this.field_Cb;
    }

    final void setTextureCombineOperands(int guard, int index, int rgbOperand, int alphaOperand) {
        jaggl.OpenGL.glTexEnvi(8960, 34184 + index, rgbOperand);
        jaggl.OpenGL.glTexEnvi(8960, index + 34200, alphaOperand);
        if (guard < 108) {
          this.applyViewport((byte) -89);
        }
    }

    private final void applyScissorRect(int guard) {
        if (guard != 0) {
          this.intersectClip(-87, -86, 40, 96);
        }
        if (this.clipRight >= this.clipLeft &&
          this.clipTop <= this.clipBottom) {
          jaggl.OpenGL.glScissor(this.clipLeft + this.viewportX, -this.clipBottom + this.viewportHeight + this.viewportY, this.clipRight - this.clipLeft, -this.clipTop + this.clipBottom);
        } else {
          jaggl.OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    final LegacyOpenGlCubeTexture environmentCube(byte guard) {
        if (guard != 62) {
          this.fogEnabled = false;
        }
        return null == this.field_Y ? null : this.field_Y.cubeTexture((byte) 113);
    }

    final synchronized void updateTime(int timeMillis) {
        int incrementValue$5 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int incrementValue$4 = 0;
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
        var2 = 0;
        timeMillis = timeMillis & 2147483647;
        while (!this.buffersToDelete.isEmpty((byte) -119)) {
          var5 = (IntNode) (this.buffersToDelete.removeFirst(9));
          incrementValue$5 = var2;
          var2++;
          LegacyOpenGlShoreWaveWaterEffect.field_h[incrementValue$5] = (int)var5.key;
          this.field_Xb = this.field_Xb - var5.value;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteBuffersARB(var2, LegacyOpenGlShoreWaveWaterEffect.field_h, 0);
          var2 = 0;
        }
        if (var2 <= 0) {
          while (!this.field_q.isEmpty((byte) -101)) {
            var6 = (IntNode) (this.field_q.removeFirst(9));
            incrementValue$1 = var2;
            var2++;
            LegacyOpenGlShoreWaveWaterEffect.field_h[incrementValue$1] = (int)var6.key;
            this.textureBytes = this.textureBytes - var6.value;
            if (var2 != 1000) {
              continue;
            }
            jaggl.OpenGL.glDeleteTextures(var2, LegacyOpenGlShoreWaveWaterEffect.field_h, 0);
            var2 = 0;
          }
        } else {
          jaggl.OpenGL.glDeleteBuffersARB(var2, LegacyOpenGlShoreWaveWaterEffect.field_h, 0);
          var2 = 0;
          while (!this.field_q.isEmpty((byte) -101)) {
            var6 = (IntNode) (this.field_q.removeFirst(9));
            incrementValue$0 = var2;
            var2++;
            LegacyOpenGlShoreWaveWaterEffect.field_h[incrementValue$0] = (int)var6.key;
            this.textureBytes = this.textureBytes - var6.value;
            if (var2 != 1000) {
              continue;
            }
            jaggl.OpenGL.glDeleteTextures(var2, LegacyOpenGlShoreWaveWaterEffect.field_h, 0);
            var2 = 0;
          }
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteTextures(var2, LegacyOpenGlShoreWaveWaterEffect.field_h, 0);
          var2 = 0;
        }
        while (!this.framebuffersToDelete.isEmpty((byte) -93)) {
          var7 = (IntNode) (this.framebuffersToDelete.removeFirst(9));
          incrementValue$4 = var2;
          var2++;
          LegacyOpenGlShoreWaveWaterEffect.field_h[incrementValue$4] = var7.value;
          if (1000 != var2) {
            continue;
          }
          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, LegacyOpenGlShoreWaveWaterEffect.field_h, 0);
          var2 = 0;
        }
        if (var2 <= 0) {
          while (!this.field_fc.isEmpty((byte) -78)) {
            var8 = (IntNode) (this.field_fc.removeFirst(9));
            incrementValue$3 = var2;
            var2++;
            LegacyOpenGlShoreWaveWaterEffect.field_h[incrementValue$3] = (int)var8.key;
            this.field_V = this.field_V - var8.value;
            if (1000 != var2) {
              continue;
            }
            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, LegacyOpenGlShoreWaveWaterEffect.field_h, 0);
            var2 = 0;
          }
        } else {
          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, LegacyOpenGlShoreWaveWaterEffect.field_h, 0);
          var2 = 0;
          while (!this.field_fc.isEmpty((byte) -78)) {
            var8 = (IntNode) (this.field_fc.removeFirst(9));
            incrementValue$2 = var2;
            var2++;
            LegacyOpenGlShoreWaveWaterEffect.field_h[incrementValue$2] = (int)var8.key;
            this.field_V = this.field_V - var8.value;
            if (1000 != var2) {
              continue;
            }
            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, LegacyOpenGlShoreWaveWaterEffect.field_h, 0);
            var2 = 0;
          }
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, LegacyOpenGlShoreWaveWaterEffect.field_h, 0);
          var2 = 0;
        }
        while (!this.field_fb.isEmpty((byte) -119)) {
          var9 = (IntNode) (this.field_fb.removeFirst(9));
          jaggl.OpenGL.glDeleteLists((int)var9.key, var9.value);
        }
        while (!this.field_qb.isEmpty((byte) -124)) {
          var10 = this.field_qb.removeFirst(9);
          jaggl.OpenGL.glDeleteProgramARB((int)var10.key);
        }
        while (!this.field_cc.isEmpty((byte) -67)) {
          var11 = this.field_cc.removeFirst(9);
          jaggl.OpenGL.glDeleteObjectARB(var11.key);
        }
        while (!this.field_fb.isEmpty((byte) -96)) {
          var12 = (IntNode) (this.field_fb.removeFirst(9));
          jaggl.OpenGL.glDeleteLists((int)var12.key, var12.value);
        }
        this.field_Pb.age(122);
        if (100663296 < this.estimatedResourceBytes((byte) 7) &&
          IntroMeshResources.monotonicTimeMillis(-64) > this.field_vc + 60000L) {
          System.gc();
          this.field_vc = IntroMeshResources.monotonicTimeMillis(-78);
        }
        this.animationTime = timeMillis;
    }

    final LegacyVertexBuffer createVertexBuffer(int stride, boolean dynamic, byte guard, int byteLength, byte[] bytes) {
        RuntimeException var6 = null;
        LegacyOpenGlVertexBuffer stackIn_7_0 = null;
        LegacyOpenGlClientVertexBuffer stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -23) {
            this.clipRight = -14;
          }
          if (this.field_J && (!dynamic ||
            this.field_K)) {
            stackIn_7_0 = new LegacyOpenGlVertexBuffer(this, stride, bytes, byteLength, dynamic);
            return (LegacyVertexBuffer) ((Object) stackIn_7_0);
          }
          stackIn_9_0 = new LegacyOpenGlClientVertexBuffer(this, stride, bytes, byteLength);
          return (LegacyVertexBuffer) ((Object) stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("fr.MA(").append(stride).append(',').append(dynamic).append(',').append(guard).append(',').append(byteLength).append(',');
          if (bytes == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void setTextureConstantArgb(int offset, int argb) {
        LegacyOpenGlSpriteMask.field_g[0] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(argb, 16711680) / 16711680.0f;
        LegacyOpenGlSpriteMask.field_g[2] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(255, argb) / 255.0f;
        LegacyOpenGlSpriteMask.field_g[1] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(65280, argb) / 65280.0f;
        LegacyOpenGlSpriteMask.field_g[3] = (float)(argb >>> 24) / 255.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, LegacyOpenGlSpriteMask.field_g, offset);
    }

    final void pushFramebuffer(LegacyOpenGlFramebufferTarget framebuffer, int guard) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!this.field_B) {
            if (this.field_Jb >= 3) {
              throw new RuntimeException();
            }
            if (0 <= this.field_Jb) {
              this.field_dc[this.field_Jb].unbindFramebuffer(-65);
            }
            fieldTemp$1 = this.field_Jb + 1;
            this.field_Jb = this.field_Jb + 1;
            this.field_dc[fieldTemp$1] = framebuffer;
            this.drawFramebuffer = framebuffer;
            this.readFramebuffer = framebuffer;
            this.readFramebuffer.bindFramebuffer(30352);
          } else {
            this.pushReadFramebuffer(30369, framebuffer);
            this.pushDrawFramebuffer(4608, framebuffer);
          }
          if (guard >= -70) {
            this.field_R = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("fr.E(");
          if (framebuffer == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    final void setDepthRange(int nearPlane, int farPlane) {
        if (nearPlane != this.field_sc ||
          this.field_Cb != farPlane) {
          this.field_sc = nearPlane;
          this.field_Cb = farPlane;
          this.buildPerspectiveProjection(770);
          this.applyFogParameters(3089);
          if (this.field_Q == 3) {
            this.applyOrthographicProjection(-15048);
          } else {
            if (this.field_Q == 2) {
              this.applyProjectionMatrix((byte) -110);
            }
          }
        }
    }

    private final void initializeDeviceResources(byte guard) {
        LegacyOpenGlFramebuffer discarded$14 = null;
        int var2 = 9 / ((guard - 14) / 61);
        this.field_ib = new LegacyOpenGlTexture[this.maxTextureUnits];
        this.field_n = new LegacyOpenGlTexture2D(this, 3553, 6408, 1, 1);
        LegacyOpenGlTexture2D discarded$0 = new LegacyOpenGlTexture2D(this, 3553, 6408, 1, 1);
        LegacyOpenGlTexture2D discarded$1 = new LegacyOpenGlTexture2D(this, 3553, 6408, 1, 1);
        LegacyOpenGlRenderBufferSet discarded$2 = new LegacyOpenGlRenderBufferSet(this);
        LegacyOpenGlRenderBufferSet discarded$3 = new LegacyOpenGlRenderBufferSet(this);
        LegacyOpenGlRenderBufferSet discarded$4 = new LegacyOpenGlRenderBufferSet(this);
        LegacyOpenGlRenderBufferSet discarded$5 = new LegacyOpenGlRenderBufferSet(this);
        LegacyOpenGlRenderBufferSet discarded$6 = new LegacyOpenGlRenderBufferSet(this);
        LegacyOpenGlRenderBufferSet discarded$7 = new LegacyOpenGlRenderBufferSet(this);
        LegacyOpenGlRenderBufferSet discarded$8 = new LegacyOpenGlRenderBufferSet(this);
        LegacyOpenGlRenderBufferSet discarded$9 = new LegacyOpenGlRenderBufferSet(this);
        LegacyOpenGlRenderBufferSet discarded$10 = new LegacyOpenGlRenderBufferSet(this);
        LegacyOpenGlRenderBufferSet discarded$13 = new LegacyOpenGlRenderBufferSet(this);
        if (this.supportsFramebufferObjects) {
          this.scratchFramebuffer = new LegacyOpenGlFramebuffer(this);
          discarded$14 = new LegacyOpenGlFramebuffer(this);
        }
    }

    final void popFramebuffer(byte guard, LegacyOpenGlFramebufferTarget framebuffer) {
        int fieldTemp$2 = 0;
        LegacyOpenGlFramebufferTarget dupTemp$3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = -102 % ((62 - guard) / 55);
          if (!this.field_B) {
            if (this.field_Jb >= 0 &&
              this.field_dc[this.field_Jb] == framebuffer) {
              fieldTemp$2 = this.field_Jb;
              this.field_Jb = this.field_Jb - 1;
              this.field_dc[fieldTemp$2] = null;
              framebuffer.unbindFramebuffer(-98);
              if (this.field_Jb < 0) {
                this.drawFramebuffer = null;
                this.readFramebuffer = null;
                return;
              }
              dupTemp$3 = this.field_dc[this.field_Jb];
              this.drawFramebuffer = dupTemp$3;
              this.readFramebuffer = dupTemp$3;
              this.readFramebuffer.bindFramebuffer(30352);
              return;
            }
            throw new RuntimeException();
          }
          this.popReadFramebuffer(framebuffer, 71);
          this.popDrawFramebuffer(framebuffer, -963075224);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("fr.SB(").append(guard).append(',');
          if (framebuffer == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void bindMaterialTexture(boolean allowSpecializedEffects, int textureId, byte guard) {
        if (guard > -65) {
          return;
        }
        this.bindMaterialTexture(textureId, 118, true, allowSpecializedEffects);
    }

    private final void usePixelProjection(int mode) {
        if (mode != this.field_Q) {
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          if (this.viewportWidth > 0 &&
            this.viewportHeight > 0) {
            jaggl.OpenGL.glOrtho(0.0, (double)this.viewportWidth, (double)this.viewportHeight, 0.0, -1.0, 1.0);
          }
          jaggl.OpenGL.glMatrixMode(5888);
          jaggl.OpenGL.glLoadIdentity();
          this.field_Q = 1;
          this.field_nb = this.field_nb & -25;
        }
    }

    final void drawCircle(int centerX, int centerY, int radius, int color, int blendMode) {
        int var9 = 0;
        float var6;
        float var7;
        int var8;
        int var10;
        var10 = Sumoblitz.field_L ? 1 : 0;
        if (radius < 0) {
          radius = -radius;
        }
        if (this.clipLeft > centerX + radius) {
          return;
        }
        if (-radius + centerX <= this.clipRight &&
          centerY + radius >= this.clipTop &&
          this.clipBottom >= centerY - radius) {
          this.prepareSolidRendering((byte) 127);
          this.setBlendMode(25189, blendMode);
          jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
          if (radius <= 1) {
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glVertex2f((float)(centerX + 1), (float)(centerY + 1));
            jaggl.OpenGL.glVertex2f((float)(centerX + 1), (float)(centerY - 1));
            jaggl.OpenGL.glVertex2f((float)(-1 + centerX), (float)(centerY - 1));
            jaggl.OpenGL.glVertex2f((float)(-1 + centerX), (float)(centerY + 1));
            jaggl.OpenGL.glEnd();
            return;
          }
          var6 = 0.3499999940395355f + (float)centerX;
          var7 = (float)centerY + 0.3499999940395355f;
          jaggl.OpenGL.glBegin(2);
          var8 = 262144 / (6 * radius);
          if (64 >= var8) {
            var8 = 64;
          } else {
            if (var8 > 512) {
              var8 = 512;
            }
          }
          var8 = ByteArrayPool.highestOneBit(var8, false);
          jaggl.OpenGL.glVertex2f(var6 + (float)radius, var7);
          for (var9 = 16384 - var8; var9 > 0; var9 = var9 - var8) {
            jaggl.OpenGL.glVertex2f((float)radius * TextInputWidget.field_M[var9] + var6, TextInputWidget.field_N[var9] * (float)radius + var7);
          }
          jaggl.OpenGL.glEnd();
          return;
        }
    }

    final int textureFormatBytes(int internalFormat, int guard) {
        if (guard > -6) {
          this.field_K = false;
        }
        if (internalFormat == 6406) {
          return 1;
        }
        if (6409 == internalFormat) {
          return 1;
        }
        if (internalFormat == 6410 ||
          internalFormat == 34846 ||
          internalFormat == 34844) {
          return 2;
        }
        if (6407 == internalFormat) {
          return 3;
        }
        if (internalFormat == 6408) {
          return 4;
        }
        if (internalFormat == 34847) {
          return 4;
        }
        if (internalFormat == 34843) {
          return 6;
        }
        if (internalFormat == 34842) {
          return 8;
        }
        if (internalFormat == 6402) {
          return 3;
        }
        if (internalFormat != 6401) {
          throw new IllegalArgumentException("");
        }
        return 1;
    }

    final ToolkitSprite createSprite(int[] pixels, int offset, int stride, int width, int height, boolean copyPixels) {
        RuntimeException var7 = null;
        LegacyOpenGlSprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new LegacyOpenGlSprite(this, width, height, pixels, offset, stride);
          return (ToolkitSprite) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("fr.TB(");
          if (pixels == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(offset).append(',').append(stride).append(',').append(width).append(',').append(height).append(',').append(copyPixels).append(')').toString());
        }
    }

    final void bindSpriteTarget(ToolkitSprite sprite, boolean withBuffer) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        LegacyOpenGlRenderbuffer var3 = null;
        LegacyOpenGlPbuffer var3_ref = null;
        RuntimeException var3_ref2 = null;
        DualLinkNode var4 = null;
        int var6 = 0;
        LegacyOpenGlPbuffer var7 = null;
        LegacyOpenGlPbuffer var8 = null;
        LegacyOpenGlRenderbuffer var9 = null;
        LegacyOpenGlRenderbuffer var10 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.field_Tb = (LegacyOpenGlSprite) (sprite);
          if (this.supportsFramebufferObjects) {
            if (null == this.field_H) {
              this.field_H = new LegacyOpenGlFramebuffer(this);
            }
            if (this.drawFramebuffer == this.field_H) {
              throw new RuntimeException();
            }
            this.pushFramebuffer(this.field_H, -125);
            if (withBuffer) {
              var3 = (LegacyOpenGlRenderbuffer) (this.field_nc.get(127, (long)(this.field_Tb.width() << 16 | this.field_Tb.height())));
              if (var3 == null) {
                var9 = new LegacyOpenGlRenderbuffer(this, 6402, this.field_Tb.width(), this.field_Tb.height());
                var3 = var9;
                this.field_ic = this.field_ic + var9.estimatedBytes;
                while (this.field_ic > 2097152) {
                  var4 = this.field_Db.removeLast((byte) 126);
                  if (var4 != null) {
                    var10 = (LegacyOpenGlRenderbuffer) (var4);
                    var10.unlinkSecondary(-5106);
                    var10.unlink(false);
                    var10.close(-127);
                    this.field_ic = this.field_ic - var10.estimatedBytes;
                    continue;
                  }
                  break;
                }
                this.field_nc.a(var9, -1, (long)(this.field_Tb.width() << 16 | this.field_Tb.height()));
              }
              this.field_Db.addFirst(var3, -4);
              this.field_H.attachRenderbuffer(var3, 8, -14269);
            }
            this.field_H.attachTexture(this.field_Tb.texture, -4610, 0);
          } else {
            if (!this.field_Gc) {
              throw new RuntimeException("");
            }
            var3_ref = (LegacyOpenGlPbuffer) (this.field_nc.get(117, (long)(this.field_Tb.width() << 16 | this.field_Tb.height())));
            if (var3_ref == null) {
              var7 = new LegacyOpenGlPbuffer(this, this.field_Tb.width(), this.field_Tb.height());
              var3_ref = var7;
              this.field_ic = this.field_ic + var7.pixelCount * 4;
              while (this.field_ic > 2097152) {
                var4 = this.field_Db.removeLast((byte) 126);
                if (var4 != null) {
                  var8 = (LegacyOpenGlPbuffer) (var4);
                  var8.unlinkSecondary(-5106);
                  var8.unlink(false);
                  this.context.releasePbuffer(var8.handle(-99));
                  this.field_ic = this.field_ic - var8.pixelCount;
                  continue;
                }
                break;
              }
              this.field_nc.a(var7, -1, (long)(this.field_Tb.width() << 16 | this.field_Tb.height()));
            }
            this.field_Db.addFirst(var3_ref, -4);
            this.context.setPbuffer(var3_ref.handle(-106));
          }
          this.viewportWidth = sprite.width();
          this.viewportHeight = sprite.height();
          this.invalidateProjectionMode((byte) -81);
          this.applyViewport((byte) -98);
          this.resetViewportClip(-1303);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_31_0 = var3_ref2;
          stackIn_31_1 = new StringBuilder().append("fr.MF(");
          if (sprite == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(withBuffer).append(')').toString());
        }
    }

    final void bindVertexBuffer(LegacyVertexBuffer buffer, int guard) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (buffer != this.field_zc) {
            if (this.field_J) {
              jaggl.OpenGL.glBindBufferARB(34962, buffer.bufferId(2721));
            }
            this.field_zc = buffer;
          }
          if (guard > -110) {
            this.field_Tb = (LegacyOpenGlSprite) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("fr.A(");
          if (buffer == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void applyViewport(byte guard) {
        jaggl.OpenGL.glViewport(this.viewportX, this.viewportY, this.viewportWidth, this.viewportHeight);
        if (guard >= -16) {
          this.field_qb = (IntrusiveDeque) null;
        }
    }

    private final int estimatedResourceBytes(byte guard) {
        if (guard != 7) {
          this.field_vb = true;
        }
        return this.field_V + (this.textureBytes + this.field_Xb);
    }

    private final void pushDrawFramebuffer(int guard, LegacyOpenGlFramebufferTarget framebuffer) {
        int fieldTemp$0 = 0;
        if (guard != 4608) {
          return;
        }
        try {
          if (this.drawFramebufferIndex >= 3) {
            throw new RuntimeException();
          }
          if (this.drawFramebufferIndex >= 0) {
            this.drawFramebufferStack[this.drawFramebufferIndex].unbindDrawFramebuffer(false);
          }
          fieldTemp$0 = this.drawFramebufferIndex + 1;
          this.drawFramebufferIndex = this.drawFramebufferIndex + 1;
          this.drawFramebufferStack[fieldTemp$0] = framebuffer;
          this.drawFramebuffer = framebuffer;
          this.drawFramebuffer.bindDrawFramebuffer(guard ^ 4725);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fr.VA(" + guard + ',' + (framebuffer != null ? "{...}" : "null") + ')');
        }
    }

    final int nearPlane() {
        return this.field_sc;
    }

    final void setBlendMode(int guard, int mode) {
        boolean stackIn_14_1 = false;
        int stackIn_18_0 = 0;
        int stackIn_21_1 = 0;
        boolean stackIn_29_1 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 25189) {
          this.field_pb = (jaclib.memory.heap.NativeHeap) null;
        }
        if (mode != this.field_Ab) {
          if (1 == mode) {
            var4 = 1;
            var3 = 1;
            var5 = 1;
          } else {
            if (2 != mode) {
              if (mode != 128) {
                var3 = 1;
                var4 = 0;
                var5 = 0;
              } else {
                var5 = 3;
                var4 = 1;
                var3 = 1;
              }
            } else {
              var3 = 1;
              var5 = 2;
              var4 = 0;
            }
          }
          if ((this.field_tb ? 1 : 0) != var3) {
            jaggl.OpenGL.glColorMask(var3 != 0, var3 != 0, var3 != 0, true);
            stackIn_14_1 = (var3 != 0);
            this.field_tb = stackIn_14_1;
          }
          stackIn_18_0 = (this.field_A) ? 0 : 1;
          stackIn_21_1 = (var4 != 0) ? 0 : 1;
          if (stackIn_18_0 != stackIn_21_1) {
            if (var4 == 0) {
              jaggl.OpenGL.glDisable(3008);
            } else {
              jaggl.OpenGL.glEnable(3008);
            }
            stackIn_29_1 = (var4 != 0);
            this.field_A = stackIn_29_1;
          }
          if (var5 != this.field_zb) {
            if (var5 == 1) {
              jaggl.OpenGL.glEnable(3042);
              jaggl.OpenGL.glBlendFunc(770, 771);
            } else {
              if (2 != var5) {
                if (var5 == 3) {
                  jaggl.OpenGL.glEnable(3042);
                  jaggl.OpenGL.glBlendFunc(774, 1);
                } else {
                  jaggl.OpenGL.glDisable(3042);
                }
              } else {
                jaggl.OpenGL.glEnable(3042);
                jaggl.OpenGL.glBlendFunc(1, 1);
              }
            }
            this.field_zb = var5;
          }
          this.field_Ab = mode;
          this.field_nb = this.field_nb & -29;
        }
    }

    private final void applyLightingState(boolean guard) {
        RenderBuffer var3;
        if (!guard) {
          var3 = (RenderBuffer) null;
          this.createRenderTarget((RenderSurface) null, (RenderBuffer) null);
        }
        if (this.lightingEnabled &&
          !this.lightingSuppressed) {
          jaggl.OpenGL.glEnable(2896);
        } else {
          jaggl.OpenGL.glDisable(2896);
        }
    }

    private final void clipChanged(int guard) {
        if (guard >= -116) {
          this.detachContext(80);
        }
    }

    final void copyFrontToBack() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (!this.field_ec) {
          return;
        }
        if (0 >= this.viewportWidth) {
          return;
        }
        if (this.viewportHeight > 0) {
          var1 = this.clipLeft;
          var2 = this.clipRight;
          var3 = this.clipTop;
          var4 = this.clipBottom;
          this.resetViewportClip(-1303);
          jaggl.OpenGL.glReadBuffer(1028);
          jaggl.OpenGL.glDrawBuffer(1029);
          this.invalidateProjectionMode((byte) -81);
          this.setFogEnabled(3, false);
          this.setLightingEnabled(-119, false);
          this.setDepthTest(108, false);
          this.setDepthWriteEnabled(false, (byte) -115);
          this.bindTexture(83, (LegacyOpenGlTexture) null);
          this.bindMaterialTexture((byte) 124, -2);
          this.setTextureCombineMode(1, true);
          this.setBlendMode(25189, 0);
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
          jaggl.OpenGL.glMatrixMode(5888);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glCopyPixels(0, 0, this.viewportWidth, this.viewportHeight, 6144);
          jaggl.OpenGL.glFlush();
          jaggl.OpenGL.glReadBuffer(1029);
          jaggl.OpenGL.glDrawBuffer(1029);
          this.setClip(var1, var3, var2, var4);
          return;
        }
    }

    final void clear(int color) {
        this.setBlendMode(25189, 0);
        jaggl.OpenGL.glClearColor((float)(color & 16711680) / 16711680.0f, (float)(color & 65280) / 65280.0f, (float)(color & 255) / 255.0f, (float)(color >>> 24) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    private final void bindMaterialTexture(int textureId, int guard, boolean lighting, boolean allowSpecializedEffects) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        Object var5;
        int var6;
        int var7;
        int var8;
        int var9;
        TextureMetadata var10;
        int var11;
        int var12;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_wc == textureId) {
          stackIn_4_0 = (this.field_uc) ? 0 : 1;
          decompiledFrameRemainder0 = (stackIn_4_0 == (this.field_gb ? 1 : 0));
        }
        if (decompiledFrameRemainder0) {
          var5 = null;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          stackIn_8_0 = (!this.field_uc) ? 0 : 3;
          var9 = stackIn_8_0;
          if (textureId < 0) {
            this.resetTextureMatrix(false);
          } else {
            var5 = this.field_Pb.texture(0, textureId);
            var10 = this.textureProvider.metadata(-29193, textureId);
            if (var10.field_c == 0 &&
              var10.field_u == 0) {
              this.resetTextureMatrix(false);
            } else {
              stackIn_15_0 = (var10.field_n) ? 64 : 128;
              var11 = stackIn_15_0;
              var12 = 50 * var11;
              this.translateTextureMatrix((float)(var10.field_u * (this.animationTime % var12)) / (float)var12, 0.0f, (float)(var10.field_c * (this.animationTime % var12)) / (float)var12, 32151);
            }
            if (!this.field_uc) {
              var9 = var10.field_d;
              var8 = var10.field_h;
              var7 = var10.field_j;
            }
            var6 = var10.field_q;
          }
          this.effectManager.selectEffect(lighting, var8, 125, var7, allowSpecializedEffects, var9);
          if (!this.effectManager.bindTexture(var6, (byte) 71, (LegacyOpenGlTexture) (var5))) {
            this.bindTexture(103, (LegacyOpenGlTexture) (var5));
            this.setTextureCombineMode(var6, true);
          }
          this.field_gb = this.field_uc;
          this.field_wc = textureId;
        }
        this.field_nb = this.field_nb & -8;
        if (guard <= 109) {
          this.glTextureCombineOperation(-42, (byte) -3);
        }
    }

    private final void popDrawFramebuffer(LegacyOpenGlFramebufferTarget framebuffer, int guard) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.drawFramebufferIndex >= 0 &&
            this.drawFramebufferStack[this.drawFramebufferIndex] == framebuffer) {
            if (guard != -963075224) {
              this.field_ac = -0.3817848265171051f;
            }
            fieldTemp$1 = this.drawFramebufferIndex;
            this.drawFramebufferIndex = this.drawFramebufferIndex - 1;
            this.drawFramebufferStack[fieldTemp$1] = null;
            framebuffer.unbindDrawFramebuffer(false);
            if (this.drawFramebufferIndex < 0) {
              this.drawFramebuffer = null;
            } else {
              this.drawFramebuffer = this.drawFramebufferStack[this.drawFramebufferIndex];
              this.drawFramebuffer.bindDrawFramebuffer(guard + 963075341);
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("fr.AB(");
          if (framebuffer == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void setDepthTest(int guard, boolean enabled) {
        if ((!enabled ? 1 : 0) == (!this.field_x ? 1 : 0)) {
        } else {
          if (enabled) {
            jaggl.OpenGL.glEnable(2929);
          } else {
            jaggl.OpenGL.glDisable(2929);
          }
          this.field_x = enabled ? true : false;
          this.field_nb = this.field_nb & -32;
        }
        if (guard <= 52) {
          this.field_oc = (IntrusiveDeque) null;
        }
    }

    private final void applyFogParameters(int guard) {
        this.fogEnd = (float)(-this.field_lc + this.field_Cb) - this.fogDistanceOffset;
        this.fogStart = -((float)this.field_kc * this.fogDistanceScale) + this.fogEnd;
        if (this.fogStart < (float)this.field_sc) {
          this.fogStart = (float)this.field_sc;
        }
        jaggl.OpenGL.glFogf(2915, this.fogStart);
        if (guard != 3089) {
          return;
        }
        jaggl.OpenGL.glFogf(2916, this.fogEnd);
        LegacyOpenGlSpriteMask.field_g[1] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(this.fogColor, 65280) / 65280.0f;
        LegacyOpenGlSpriteMask.field_g[2] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(255, this.fogColor) / 255.0f;
        LegacyOpenGlSpriteMask.field_g[0] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(this.fogColor, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, LegacyOpenGlSpriteMask.field_g, 0);
    }

    static {
        unfortunatelyYourConfigurationDoesnText = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
