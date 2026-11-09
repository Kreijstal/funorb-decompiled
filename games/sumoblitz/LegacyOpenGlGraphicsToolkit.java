/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class LegacyOpenGlGraphicsToolkit extends GraphicsToolkit {
    private int field_s;
    private long field_ob;
    private java.awt.Canvas field_ab;
    int field_Ec;
    private int field_I;
    private long field_rb;
    jaggl.OpenGL field_y;
    private Hashtable field_Gb;
    private int field_Z;
    static String unfortunatelyYourConfigurationDoesnText;
    private ic field_O;
    private kk field_Pb;
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
    private int field_qc;
    private int field_Jb;
    private LegacyOpenGlFramebufferTarget[] field_m;
    private LegacyOpenGlFramebufferTarget field_Fb;
    private LegacyOpenGlFramebufferTarget[] field_Hc;
    private int field_w;
    private SecondaryNodeQueue field_Db;
    private LegacyOpenGlSprite field_Tb;
    private LegacyOpenGlFramebufferTarget field_hc;
    private LegacyOpenGlFramebufferTarget[] field_dc;
    private IntrusiveNodeHashTable field_nc;
    int textureBytes;
    int field_Xb;
    private int field_V;
    private int field_ic;
    private IntrusiveDeque field_fb;
    private IntrusiveDeque field_j;
    private IntrusiveDeque field_q;
    private IntrusiveDeque field_tc;
    private IntrusiveDeque field_fc;
    private IntrusiveDeque field_qb;
    private IntrusiveDeque field_cc;
    private int field_nb;
    private long field_vc;
    private int field_Ab;
    private int field_zb;
    private boolean field_S;
    private boolean field_x;
    private boolean field_tb;
    private boolean field_A;
    LegacyOpenGlTransform3D field_M;
    LegacyOpenGlTransform3D field_mc;
    private float[] field_eb;
    private boolean field_Zb;
    private float field_l;
    boolean supportsFramebufferObjects;
    private String field_E;
    private int field_t;
    private LegacyVertexBuffer field_Rb;
    private bt field_Y;
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
    private int field_pc;
    private float field_Lb;
    int field_k;
    float field_bc;
    private float field_ub;
    private int field_wc;
    boolean field_B;
    private boolean field_ec;
    boolean field_Ob;
    private int field_db;
    boolean field_Cc;
    int field_u;
    private int field_Ub;
    private int field_Wb;
    boolean supportsVertexPrograms;
    boolean field_Ic;
    private int field_lc;
    private int field_Q;
    private LegacyOpenGlTexture[] field_ib;
    private boolean field_r;
    private int field_yc;
    private LegacyVertexBuffer field_zc;
    private int field_Eb;
    int field_Mb;
    private boolean field_R;
    private boolean field_hb;
    private int field_P;
    private boolean field_uc;
    private float field_Qb;
    private String field_Dc;
    private int field_sb;
    private int field_Nb;
    private int field_Cb;
    private boolean lightingSuppressed;
    private int field_v;
    private float field_i;
    float field_z;
    float field_ac;
    boolean field_W;
    private int field_sc;
    private boolean field_Gc;
    private int field_jb;
    int field_kc;
    boolean field_C;
    private boolean field_K;
    private int field_xb;
    LegacyOpenGlTexture2D field_n;
    boolean supportsVertexShaders;
    float field_cb;
    private boolean field_Bb;
    boolean supportsFloatTextures;
    boolean supportsFragmentShaders;
    int maxTextureUnits;
    private boolean field_mb;
    private float field_kb;
    private int field_bb;
    float field_Fc;

    private final int d(int param0) {
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
        if (param0 <= var4.length) {
          try {
            var5_int = no.a((byte) -128, (CharSequence) ((Object) var4[0]));
            var6 = no.a((byte) -127, (CharSequence) ((Object) var4[1]));
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
        if (!this.field_y.a("GL_ARB_multitexture")) {
          var2 = var2 | 8;
        }
        if (!this.field_y.a("GL_ARB_texture_env_combine")) {
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
        this.field_R = jaclib.memory.Stream.b();
        this.field_Gc = this.field_y.arePbuffersAvailable();
        this.field_J = this.field_y.a("GL_ARB_vertex_buffer_object");
        this.field_hb = this.field_y.a("GL_ARB_multisample");
        this.supportsVertexPrograms = this.field_y.a("GL_ARB_vertex_program");
        this.field_y.a("GL_ARB_fragment_program");
        this.supportsVertexShaders = this.field_y.a("GL_ARB_vertex_shader");
        this.supportsFragmentShaders = this.field_y.a("GL_ARB_fragment_shader");
        this.field_Ic = this.field_y.a("GL_EXT_texture3D");
        this.field_C = this.field_y.a("GL_ARB_texture_rectangle");
        this.field_Ob = this.field_y.a("GL_ARB_texture_cube_map");
        this.supportsFloatTextures = this.field_y.a("GL_ARB_texture_float");
        this.field_Cc = false;
        this.supportsFramebufferObjects = this.field_y.a("GL_EXT_framebuffer_object");
        this.field_B = this.field_y.a("GL_EXT_framebuffer_blit");
        this.field_vb = this.field_y.a("GL_EXT_framebuffer_multisample");
        this.field_W = FixedPointPerlinNoise3D.field_h.startsWith("mac");
        jaggl.OpenGL.glGetFloatv(2834, LegacyOpenGlSpriteMask.field_g, 0);
        stackIn_26_0 = (var2 != 0) ? var2 : 0;
        return stackIn_26_0;
    }

    private final void k(byte param0) {
        if (1 != this.field_nb) {
          this.t(1);
          this.d(3, false);
          this.b(-69, false);
          this.a(65, false);
          this.a(false, (byte) -94);
          this.bindTexture(106, (LegacyOpenGlTexture) null);
          this.a((byte) 123, -2);
          this.setTextureCombineMode(1, true);
          this.field_nb = 1;
        }
        int var2 = -67 % ((39 - param0) / 49);
    }

    private final void b(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.field_eb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
        int var2 = -104 % ((14 - param0) / 61);
    }

    private final void c(byte param0) {
        int incrementValue$1 = 0;
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        if (param0 <= 73) {
          this.field_mc = (LegacyOpenGlTransform3D) null;
        }
        while (!this.field_y.b()) {
          incrementValue$1 = var2;
          var2++;
          if (incrementValue$1 > 5) {
            throw new RuntimeException("");
          }
          TextureCombineOperation.sleepMillis(1000L, (byte) 87);
        }
    }

    private final void a(float param0, float param1, float param2, int param3) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (this.field_mb) {
          jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glTranslatef(param2, param0, param1);
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_mb = true;
        if (param3 != 32151) {
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

    private final void d(boolean param0) {
        java.awt.Dimension var2 = null;
        if (this.field_ab == null) {
          this.field_s = 0;
          this.field_I = 0;
        } else {
          var2 = this.field_ab.getSize();
          this.field_s = var2.width;
          this.field_I = var2.height;
        }
        if (null == this.field_Fb) {
          this.field_Ec = this.field_I;
          this.field_Z = this.field_s;
          this.h((byte) -55);
        }
        this.g((byte) -81);
        if (param0) {
          this.j(-1303);
          return;
        }
    }

    final void getClip(int[] bounds) {
        try {
          bounds[2] = this.field_jb;
          bounds[0] = this.field_yc;
          bounds[1] = this.field_Wb;
          bounds[3] = this.field_Eb;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fr.K(" + (bounds != null ? "{...}" : "null") + ')');
        }
    }

    final void drawHorizontalLine(int x, int y, int length, int color, int blendMode) {
        this.k((byte) -121);
        this.c(25189, blendMode);
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

    private final void f(byte param0) {
        if (param0 >= -103) {
          this.field_zb = 95;
        }
        this.field_eb[10] = this.field_i;
        this.field_eb[14] = this.field_Qb;
    }

    private final void c(LegacyOpenGlFramebufferTarget param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_qc >= 0 &&
            this.field_m[this.field_qc] == param0) {
            fieldTemp$1 = this.field_qc;
            this.field_qc = this.field_qc - 1;
            this.field_m[fieldTemp$1] = null;
            if (param1 < 68) {
              return;
            }
            param0.unbindReadFramebuffer(-20745);
            if (this.field_qc < 0) {
              this.field_hc = null;
            } else {
              this.field_hc = this.field_m[this.field_qc];
              this.field_hc.bindReadFramebuffer(195);
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("fr.QB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a() {
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

    final void a(int param0, float param1, float param2, float param3, float param4) {
        LegacyOpenGlSpriteMask.field_g[2] = param2;
        if (param0 != 31322) {
          this.field_Xb = 70;
        }
        LegacyOpenGlSpriteMask.field_g[0] = param3;
        LegacyOpenGlSpriteMask.field_g[1] = param1;
        LegacyOpenGlSpriteMask.field_g[3] = param4;
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
            this.r(75);
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

    final int b(int param0, byte param1) {
        if (param1 != -14) {
          LegacyOpenGlFramebufferTarget var4 = (LegacyOpenGlFramebufferTarget) null;
          this.popFramebuffer((byte) 16, (LegacyOpenGlFramebufferTarget) null);
        }
        if (param0 == 1) {
          return 7681;
        }
        if (param0 == 0) {
          return 8448;
        }
        if (param0 == 2) {
          return 34165;
        }
        if (param0 == 3) {
          return 260;
        }
        if (param0 != 4) {
          throw new IllegalArgumentException();
        }
        return 34023;
    }

    final RenderBuffer createRenderBuffer(int width, int height) {
        return null;
    }

    final void q(int param0) {
        if (2 != this.field_nb) {
          this.t(1);
          this.d(3, false);
          this.b(-74, false);
          this.a(99, false);
          this.a(false, (byte) -89);
          this.a((byte) 119, -2);
          this.field_nb = 2;
        }
        if (param0 > -49) {
          ToolkitSprite var3 = (ToolkitSprite) null;
          this.bindSpriteTarget((ToolkitSprite) null, true);
        }
    }

    private final void n(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -105) {
          this.supportsFragmentShaders = false;
        }
        stackIn_6_0 = (this.field_S) && (this.field_Zb);
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
        this.field_O = new ic();
        LegacyOpenGlTransform3D discarded$0 = new LegacyOpenGlTransform3D();
        LegacyOpenGlTransform3D discarded$1 = new LegacyOpenGlTransform3D();
        this.field_jc = false;
        this.field_oc = new IntrusiveDeque();
        this.field_Jb = -1;
        this.field_qc = -1;
        this.field_m = new LegacyOpenGlFramebufferTarget[4];
        this.field_Hc = new LegacyOpenGlFramebufferTarget[4];
        this.field_w = -1;
        this.field_dc = new LegacyOpenGlFramebufferTarget[4];
        this.field_Db = new SecondaryNodeQueue();
        this.field_nc = new IntrusiveNodeHashTable(16);
        this.field_fb = new IntrusiveDeque();
        this.field_j = new IntrusiveDeque();
        this.field_q = new IntrusiveDeque();
        this.field_tc = new IntrusiveDeque();
        this.field_fc = new IntrusiveDeque();
        this.field_qb = new IntrusiveDeque();
        this.field_cc = new IntrusiveDeque();
        LegacyOpenGlTransform3D discarded$2 = new LegacyOpenGlTransform3D();
        this.field_M = new LegacyOpenGlTransform3D();
        this.field_mc = new LegacyOpenGlTransform3D();
        this.field_t = 0;
        this.field_l = 0.0f;
        this.field_gc = 8448;
        this.field_o = new float[4];
        this.field_Zb = true;
        this.field_eb = new float[16];
        this.field_pc = 0;
        this.field_db = 0;
        this.field_lc = 0;
        this.field_sb = 512;
        this.field_Wb = 0;
        this.field_Cb = 3584;
        this.field_ub = 1.0f;
        this.field_k = -1;
        this.field_Eb = 0;
        this.field_v = 8448;
        this.field_u = -1;
        this.field_sc = 50;
        this.field_ac = 1.0f;
        this.field_Mb = 0;
        this.field_gb = false;
        this.field_z = 1.0f;
        this.field_Nb = 512;
        this.field_P = -1;
        this.field_kc = -1;
        this.field_yc = 0;
        this.field_jb = 0;
        this.field_kb = 1.0f;
        this.field_bb = 0;
        this.field_Fc = 1.0f;
        FloatPacketBuffer discarded$3 = new FloatPacketBuffer(8192);
        try {
          this.field_Bc = param2;
          this.field_ab = param0;
          if (!ScrollPane.b((byte) -107, "jaclib")) {
            throw new RuntimeException("");
          }
          if (!ScrollPane.b((byte) 97, "jaggl")) {
            throw new RuntimeException("");
          }
          try {
            this.field_y = new jaggl.OpenGL();
            dupTemp$4 = this.field_y.init(param0, 8, 8, 8, 24, 0, this.field_Bc);
            this.field_ob = dupTemp$4;
            this.field_rb = dupTemp$4;
            if (this.field_ob == 0L) {
              throw new RuntimeException("");
            }
            this.c((byte) 117);
            var4_int = this.d(2);
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
                      if (jf.a(-13181, var21)) {
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
                        if (jf.a(-13181, var22)) {
                          var23 = (CharSequence) ((Object) var10.substring(0, 4));
                          var5_int = no.a((byte) -128, var23);
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
              this.field_C = this.field_C & this.field_y.a("GL_ARB_half_float_pixel");
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
            kr.a(true, -107, false);
            this.field_jc = true;
            this.field_Pb = new kk(this, this.textureProvider);
            this.i((byte) -93);
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
            this.l(0);
            this.d(true);
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

    final synchronized void a(int param0, boolean param1, int param2) {
        if (!param1) {
          this.field_Ub = 26;
        }
        IntNode var4 = new IntNode(param2);
        var4.key = (long)param0;
        this.field_j.addLast((IntrusiveNode) (var4), (byte) 39);
    }

    final void dispose() {
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        Long var3 = null;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        IntrusiveNode var1 = this.field_oc.first(79);
        while (var1 != null) {
          ((LegacyOpenGlGraphicsHeap) (var1)).a(-4009);
          var1 = this.field_oc.next((byte) 18);
        }
        if (this.postProcessManager != null) {
          this.postProcessManager.close((byte) 113);
        }
        if (null != this.field_y) {
          this.h(-27782);
          var1_ref = this.field_Gb.keys();
          while (var1_ref.hasMoreElements()) {
            var2 = (java.awt.Canvas) (var1_ref.nextElement());
            var3 = (Long) (this.field_Gb.get(var2));
            this.field_y.releaseSurface(var2, var3.longValue());
          }
          this.field_y.release();
          this.field_y = null;
        }
        if (this.field_jc) {
          pt.a(false, true, -1);
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
          var10 = new int[data.field_i * data.field_h];
          var12 = var10;
          var11 = var12;
          var3 = var11;
          var4 = 0;
          var5 = 0;
          if (data.field_a != null) {
            for (var6_int = 0; data.field_i > var6_int; var6_int++) {
              for (var7 = 0; data.field_h > var7; var7++) {
                incrementValue$0 = var5;
                var5++;
                var3[incrementValue$0] = ic.a(data.field_g[LegacyOpenGlPostProcessManager.bitwiseAnd((int) data.field_e[var4], 255)], data.field_a[var4] << 24);
                var4++;
              }
            }
          } else {
            for (var6_int = 0; data.field_i > var6_int; var6_int++) {
              for (var7 = 0; data.field_h > var7; var7++) {
                incrementValue$1 = var4;
                var4++;
                var8 = data.field_g[255 & data.field_e[incrementValue$1]];
                incrementValue$2 = var5;
                var5++;
                stackIn_8_0 = var10;
                stackIn_8_1 = incrementValue$2;
                if (var8 != 0) {
                  stackIn_9_2 = ic.a(-16777216, var8);
                } else {
                  stackIn_9_2 = 0;
                }
                stackIn_8_0[stackIn_8_1] = stackIn_9_2;
              }
            }
          }
          var6 = this.createSpriteCopy(0, -2, data.field_i, data.field_h, data.field_h, var12);
          var6.setInsets(data.field_c, data.field_d, data.field_b, data.field_f);
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

    private final void h(int param0) {
        if (param0 != -27782) {
          this.restoreCanvasTarget();
        }
        this.field_y.a();
    }

    final boolean usesNativeRendering() {
        return true;
    }

    private final void c(boolean param0) {
        if (this.field_mb) {
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glMatrixMode(5888);
          this.field_mb = false;
        }
        if (param0) {
          this.field_cc = (IntrusiveDeque) null;
        }
    }

    final void setProjection(int centerX, int centerY, int scaleX, int scaleY) {
        this.field_Nb = scaleX;
        this.field_db = centerY;
        this.field_sb = scaleY;
        this.field_t = centerX;
        this.o(770);
        this.m(-117);
        if (this.field_Q == 3) {
          this.p(-15048);
        } else {
          if (this.field_Q == 2) {
            this.b((byte) -108);
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
          this.t(1);
          this.bindTexture(88, (LegacyOpenGlTexture) null);
          this.c(25189, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
          jaggl.OpenGL.glRasterPos2i(x, y);
          jaggl.OpenGL.glDrawPixelsi(width, height, 32993, this.field_L, pixels, offset);
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fr.SA(" + x + ',' + y + ',' + width + ',' + height + ',' + (pixels != null ? "{...}" : "null") + ',' + offset + ',' + stride + ')');
        }
    }

    private final void g(byte param0) {
        if (param0 == -81) {
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
          this.field_Ec = -84;
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

    final synchronized void b(byte param0, int param1) {
        IntNode var3 = new IntNode(param1);
        if (param0 > -1) {
          this.field_bb = -108;
        }
        this.field_tc.addLast((IntrusiveNode) (var3), (byte) 39);
    }

    final void restoreCanvasTarget() {
        if (!this.supportsFramebufferObjects) {
          if (!this.field_Gc) {
            throw new RuntimeException("");
          }
          this.field_Tb.copyFromFramebuffer(0, this.field_Ec, 0, 0, 0, this.field_Z, -3773);
          this.field_y.setSurface(this.field_rb);
        } else {
          if (this.field_Fb == this.field_H) {
            this.field_H.detachAttachment(0, 17012);
            this.field_H.detachAttachment(8, 17012);
            this.popFramebuffer((byte) -123, (LegacyOpenGlFramebufferTarget) (this.field_H));
            this.field_Tb = null;
            this.field_Ec = this.field_I;
            this.field_Z = this.field_s;
            this.g((byte) -81);
            this.h((byte) -81);
            this.j(-1303);
            return;
          }
          throw new RuntimeException();
        }
        this.field_Tb = null;
        this.field_Ec = this.field_I;
        this.field_Z = this.field_s;
        this.g((byte) -81);
        this.h((byte) -81);
        this.j(-1303);
    }

    final void useHeap(GraphicsHeap heap) {
        jq discarded$2 = null;
        jq discarded$3 = null;
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
            this.field_Rb = this.a(20, false, (byte) -23, var3.position, var3.payload);
            discarded$2 = new jq(this.field_Rb, 5126, 3, 0);
            discarded$3 = new jq(this.field_Rb, 5126, 2, 12);
            this.field_O.a(this, false);
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

    private final void o(int param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float[] var8;
        float var7;
        var8 = this.field_eb;
        var2 = var8;
        var3 = (float)(-this.field_t * this.field_sc) / (float)this.field_Nb;
        var4 = (float)((this.field_Z - this.field_t) * this.field_sc) / (float)this.field_Nb;
        if (param0 != 770) {
          return;
        }
        var5 = (float)(this.field_db * this.field_sc) / (float)this.field_sb;
        var6 = (float)((this.field_db - this.field_Ec) * this.field_sc) / (float)this.field_sb;
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
          this.field_Qb = -(var7 * (float)this.field_Cb) / (float)(-this.field_sc + this.field_Cb);
          var2[14] = -(var7 * (float)this.field_Cb) / (float)(-this.field_sc + this.field_Cb);
          var2[0] = var7 / (var4 - var3);
          var2[11] = -1.0f;
          var2[7] = 0.0f;
          this.field_i = (float)(-(this.field_sc + this.field_Cb)) / (float)(-this.field_sc + this.field_Cb);
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
        this.f((byte) -127);
    }

    final void a(float param0, int param1, float param2) {
        this.field_l = param2;
        this.field_ub = param0;
        this.i(param1 + 3074);
        if (param1 != 15) {
          this.i((byte) -17);
        }
    }

    private final void p(int param0) {
        float var2 = this.field_kb * (float)(-this.field_t) / (float)this.field_Nb;
        float var3 = this.field_kb * (float)(-this.field_db) / (float)this.field_sb;
        float var4 = this.field_kb * (float)(-this.field_t + this.field_Z) / (float)this.field_Nb;
        float var5 = this.field_kb * (float)(-this.field_db + this.field_Ec) / (float)this.field_sb;
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        if (var4 != var2 &&
          var5 != var3) {
          jaggl.OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field_sc, (double)this.field_Cb);
        }
        if (param0 == -15048) {
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

    private final void g(int param0) {
        if (this.field_r &&
          this.field_kc >= 0) {
          jaggl.OpenGL.glEnable(2912);
        } else {
          jaggl.OpenGL.glDisable(2912);
        }
        if (param0 != 16) {
          this.k(-114);
        }
    }

    final void k(int param0) {
        if (param0 != -25462) {
          this.field_m = (LegacyOpenGlFramebufferTarget[]) null;
        }
        if (this.field_nb != 4) {
          this.t(1);
          this.d(param0 + 25465, false);
          this.b(-55, false);
          this.a(param0 ^ -25409, false);
          this.a(false, (byte) -101);
          this.a((byte) 110, -2);
          this.c(25189, 1);
          this.field_nb = 4;
        }
    }

    final void intersectClip(int left, int top, int right, int bottom) {
        if (this.field_yc < left) {
          this.field_yc = left;
        }
        if (right < this.field_jb) {
          this.field_jb = right;
        }
        if (top > this.field_Wb) {
          this.field_Wb = top;
        }
        if (this.field_Eb > bottom) {
          this.field_Eb = bottom;
        }
        jaggl.OpenGL.glEnable(3089);
        this.m(-124);
        this.r(0);
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
        this.k((byte) -36);
        float var10 = var8 + (float)height;
        this.c(25189, blendMode);
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

    private final void a(byte param0, int param1) {
        this.a(true, param1, (byte) -102);
        if (param0 < 109) {
          this.field_Mb = 30;
        }
    }

    final void setClip(int left, int top, int right, int bottom) {
        if (left < 0) {
          left = 0;
        }
        if (this.field_Ec < bottom) {
          bottom = this.field_Ec;
        }
        if (top < 0) {
          top = 0;
        }
        if (this.field_Z < right) {
          right = this.field_Z;
        }
        this.field_Wb = top;
        this.field_Eb = bottom;
        this.field_jb = right;
        this.field_yc = left;
        jaggl.OpenGL.glEnable(3089);
        this.m(-122);
        this.r(0);
    }

    final void b(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, param2 + 34176, param0);
        jaggl.OpenGL.glTexEnvi(8960, param2 + 34192, param1);
        int var5 = 42 % ((param3 + 69) / 47);
    }

    final synchronized void queueShaderObjectDeletion(long objectId, byte guard) {
        IntrusiveNode var4 = new IntrusiveNode();
        int var5 = 35 / ((-24 - guard) / 54);
        var4.key = objectId;
        this.field_cc.addLast(var4, (byte) 39);
    }

    private final void b(int param0, LegacyOpenGlFramebufferTarget param1) {
        int fieldTemp$0 = 0;
        try {
          if (3 <= this.field_qc) {
            throw new RuntimeException();
          }
          if (param0 != 30369) {
            this.field_Fc = -0.9330850839614868f;
          }
          if (this.field_qc >= 0) {
            this.field_m[this.field_qc].unbindReadFramebuffer(-20745);
          }
          fieldTemp$0 = this.field_qc + 1;
          this.field_qc = this.field_qc + 1;
          this.field_m[fieldTemp$0] = param1;
          this.field_hc = param1;
          this.field_hc.bindReadFramebuffer(195);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fr.HB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void j(int param0) {
        this.field_Wb = 0;
        this.field_yc = 0;
        this.field_Eb = this.field_Ec;
        if (param0 == -1303) {
          this.field_jb = this.field_Z;
          jaggl.OpenGL.glDisable(3089);
          this.m(-117);
          return;
        }
    }

    private final void d(int param0, boolean param1) {
        if (this.field_r != param1) {
          this.field_r = param1 ? true : false;
          this.g(16);
          this.field_nb = this.field_nb & -32;
        }
        if (param0 != 3) {
          this.field_R = false;
        }
    }

    final void present(int sourceX, int sourceY) throws RenderPresentationException {
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        try {
          this.field_y.swapBuffers();
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
        }
    }

    final int[] b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        if (param2 != 1) {
          SpriteData var9 = (SpriteData) null;
          this.createSprite((SpriteData) null, true);
        }
        int[] var10 = new int[param1 * param4];
        int[] var6 = var10;
        for (var7 = 0; param4 > var7; var7++) {
          jaggl.OpenGL.glReadPixelsi(param3, this.field_Ec - (param0 + var7), param1, 1, 32993, this.field_L, var10, param1 * var7);
        }
        return var10;
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        this.a((byte) 111, -2);
        for (var2 = this.maxTextureUnits - 1; var2 >= 0; var2--) {
          this.setActiveTextureUnit(var2, 90);
          this.bindTexture(param0 + 111, (LegacyOpenGlTexture) null);
          jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.setTextureCombineOperations(param0 + 20685, 8448, 8448);
        this.b(34168, 770, 2, 10);
        this.c(false);
        this.field_Ab = 1;
        jaggl.OpenGL.glEnable(3042);
        jaggl.OpenGL.glBlendFunc(770, 771);
        this.field_zb = 1;
        jaggl.OpenGL.glEnable(3008);
        jaggl.OpenGL.glAlphaFunc(516, 0.0f);
        this.field_A = true;
        jaggl.OpenGL.glColorMask(true, true, true, true);
        this.field_tb = true;
        this.d(param0 ^ 3, true);
        this.b(-44, true);
        this.a(84, true);
        this.a(true, (byte) -76);
        this.g((byte) -81);
        this.field_y.setSwapInterval(0);
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
        for (var3 = param0; var3 < 8; var3++) {
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
        this.field_P = -1;
        this.j(param0 - 1303);
    }

    final void drawLine(int x0, int y0, int x1, int y1, int color, int blendMode) {
        float var7;
        float var8;
        float var9;
        this.k((byte) -99);
        this.c(25189, blendMode);
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

    private final void b(int param0, boolean param1) {
        if ((!this.field_Bb ? 1 : 0) == (param1 ? 1 : 0)) {
          this.field_Bb = param1 ? true : false;
          this.applyLightingState(true);
          this.field_nb = this.field_nb & -8;
        }
        if (param0 > -8) {
          this.field_nc = (IntrusiveNodeHashTable) null;
        }
    }

    private final void a(boolean param0, byte param1) {
        if (param1 < -73) {
          if ((!param0 ? 1 : 0) == (this.field_S ? 1 : 0)) {
            this.field_S = param0 ? true : false;
            this.n(-112);
            this.field_nb = this.field_nb & -32;
          }
          return;
        }
    }

    final int farPlane() {
        return this.field_Cb;
    }

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, 34184 + param1, param2);
        jaggl.OpenGL.glTexEnvi(8960, param1 + 34200, param3);
        if (param0 < 108) {
          this.h((byte) -89);
        }
    }

    private final void r(int param0) {
        if (param0 != 0) {
          this.intersectClip(-87, -86, 40, 96);
        }
        if (this.field_jb >= this.field_yc &&
          this.field_Wb <= this.field_Eb) {
          jaggl.OpenGL.glScissor(this.field_yc + this.field_pc, -this.field_Eb + this.field_Ec + this.field_bb, this.field_jb - this.field_yc, -this.field_Wb + this.field_Eb);
        } else {
          jaggl.OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    final LegacyOpenGlCubeTexture environmentCube(byte guard) {
        if (guard != 62) {
          this.field_r = false;
        }
        return null == this.field_Y ? null : this.field_Y.b((byte) 113);
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
        while (!this.field_j.isEmpty((byte) -119)) {
          var5 = (IntNode) (this.field_j.removeFirst(9));
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
        while (!this.field_tc.isEmpty((byte) -93)) {
          var7 = (IntNode) (this.field_tc.removeFirst(9));
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
        this.field_Pb.a(122);
        if (100663296 < this.e((byte) 7) &&
          wq.monotonicTimeMillis(-64) > this.field_vc + 60000L) {
          System.gc();
          this.field_vc = wq.monotonicTimeMillis(-78);
        }
        this.animationTime = timeMillis;
    }

    final LegacyVertexBuffer a(int param0, boolean param1, byte param2, int param3, byte[] param4) {
        RuntimeException var6 = null;
        LegacyOpenGlVertexBuffer stackIn_7_0 = null;
        sl stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -23) {
            this.field_jb = -14;
          }
          if (this.field_J && (!param1 ||
            this.field_K)) {
            stackIn_7_0 = new LegacyOpenGlVertexBuffer(this, param0, param4, param3, param1);
            return (LegacyVertexBuffer) ((Object) stackIn_7_0);
          }
          stackIn_9_0 = new sl(this, param0, param4, param3);
          return (LegacyVertexBuffer) ((Object) stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("fr.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void e(int param0, int param1) {
        LegacyOpenGlSpriteMask.field_g[0] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(param1, 16711680) / 16711680.0f;
        LegacyOpenGlSpriteMask.field_g[2] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(255, param1) / 255.0f;
        LegacyOpenGlSpriteMask.field_g[1] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(65280, param1) / 65280.0f;
        LegacyOpenGlSpriteMask.field_g[3] = (float)(param1 >>> 24) / 255.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, LegacyOpenGlSpriteMask.field_g, param0);
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
            this.field_Fb = framebuffer;
            this.field_hc = framebuffer;
            this.field_hc.bindFramebuffer(30352);
          } else {
            this.b(30369, framebuffer);
            this.a(4608, framebuffer);
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
          this.o(770);
          this.i(3089);
          if (this.field_Q == 3) {
            this.p(-15048);
          } else {
            if (this.field_Q == 2) {
              this.b((byte) -110);
            }
          }
        }
    }

    private final void i(byte param0) {
        LegacyOpenGlFramebuffer discarded$14 = null;
        int var2 = 9 / ((param0 - 14) / 61);
        this.field_ib = new LegacyOpenGlTexture[this.maxTextureUnits];
        this.field_n = new LegacyOpenGlTexture2D(this, 3553, 6408, 1, 1);
        LegacyOpenGlTexture2D discarded$0 = new LegacyOpenGlTexture2D(this, 3553, 6408, 1, 1);
        LegacyOpenGlTexture2D discarded$1 = new LegacyOpenGlTexture2D(this, 3553, 6408, 1, 1);
        lf discarded$2 = new lf(this);
        lf discarded$3 = new lf(this);
        lf discarded$4 = new lf(this);
        lf discarded$5 = new lf(this);
        lf discarded$6 = new lf(this);
        lf discarded$7 = new lf(this);
        lf discarded$8 = new lf(this);
        lf discarded$9 = new lf(this);
        lf discarded$10 = new lf(this);
        lf discarded$13 = new lf(this);
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
                this.field_Fb = null;
                this.field_hc = null;
                return;
              }
              dupTemp$3 = this.field_dc[this.field_Jb];
              this.field_Fb = dupTemp$3;
              this.field_hc = dupTemp$3;
              this.field_hc.bindFramebuffer(30352);
              return;
            }
            throw new RuntimeException();
          }
          this.c(framebuffer, 71);
          this.b(framebuffer, -963075224);
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

    private final void a(boolean param0, int param1, byte param2) {
        if (param2 > -65) {
          return;
        }
        this.a(param1, 118, true, param0);
    }

    private final void t(int param0) {
        if (param0 != this.field_Q) {
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          if (this.field_Z > 0 &&
            this.field_Ec > 0) {
            jaggl.OpenGL.glOrtho(0.0, (double)this.field_Z, (double)this.field_Ec, 0.0, -1.0, 1.0);
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
        if (this.field_yc > centerX + radius) {
          return;
        }
        if (-radius + centerX <= this.field_jb &&
          centerY + radius >= this.field_Wb &&
          this.field_Eb >= centerY - radius) {
          this.k((byte) 127);
          this.c(25189, blendMode);
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
          var8 = jo.a(var8, false);
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
        wh var3_ref = null;
        RuntimeException var3_ref2 = null;
        DualLinkNode var4 = null;
        int var6 = 0;
        wh var7 = null;
        wh var8 = null;
        LegacyOpenGlRenderbuffer var9 = null;
        LegacyOpenGlRenderbuffer var10 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.field_Tb = (LegacyOpenGlSprite) (sprite);
          if (this.supportsFramebufferObjects) {
            if (null == this.field_H) {
              this.field_H = new LegacyOpenGlFramebuffer(this);
            }
            if (this.field_Fb == this.field_H) {
              throw new RuntimeException();
            }
            this.pushFramebuffer(this.field_H, -125);
            if (withBuffer) {
              var3 = (LegacyOpenGlRenderbuffer) (this.field_nc.a(127, (long)(this.field_Tb.width() << 16 | this.field_Tb.height())));
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
            var3_ref = (wh) (this.field_nc.a(117, (long)(this.field_Tb.width() << 16 | this.field_Tb.height())));
            if (var3_ref == null) {
              var7 = new wh(this, this.field_Tb.width(), this.field_Tb.height());
              var3_ref = var7;
              this.field_ic = this.field_ic + var7.field_v * 4;
              while (this.field_ic > 2097152) {
                var4 = this.field_Db.removeLast((byte) 126);
                if (var4 != null) {
                  var8 = (wh) (var4);
                  var8.unlinkSecondary(-5106);
                  var8.unlink(false);
                  this.field_y.releasePbuffer(var8.e(-99));
                  this.field_ic = this.field_ic - var8.field_v;
                  continue;
                }
                break;
              }
              this.field_nc.a(var7, -1, (long)(this.field_Tb.width() << 16 | this.field_Tb.height()));
            }
            this.field_Db.addFirst(var3_ref, -4);
            this.field_y.setPbuffer(var3_ref.e(-106));
          }
          this.field_Z = sprite.width();
          this.field_Ec = sprite.height();
          this.g((byte) -81);
          this.h((byte) -98);
          this.j(-1303);
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

    private final void h(byte param0) {
        jaggl.OpenGL.glViewport(this.field_pc, this.field_bb, this.field_Z, this.field_Ec);
        if (param0 >= -16) {
          this.field_qb = (IntrusiveDeque) null;
        }
    }

    private final int e(byte param0) {
        if (param0 != 7) {
          this.field_vb = true;
        }
        return this.field_V + (this.textureBytes + this.field_Xb);
    }

    private final void a(int param0, LegacyOpenGlFramebufferTarget param1) {
        int fieldTemp$0 = 0;
        if (param0 != 4608) {
          return;
        }
        try {
          if (this.field_w >= 3) {
            throw new RuntimeException();
          }
          if (this.field_w >= 0) {
            this.field_Hc[this.field_w].unbindDrawFramebuffer(false);
          }
          fieldTemp$0 = this.field_w + 1;
          this.field_w = this.field_w + 1;
          this.field_Hc[fieldTemp$0] = param1;
          this.field_Fb = param1;
          this.field_Fb.bindDrawFramebuffer(param0 ^ 4725);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fr.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int nearPlane() {
        return this.field_sc;
    }

    final void c(int param0, int param1) {
        boolean stackIn_14_1 = false;
        int stackIn_18_0 = 0;
        int stackIn_21_1 = 0;
        boolean stackIn_29_1 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 25189) {
          this.field_pb = (jaclib.memory.heap.NativeHeap) null;
        }
        if (param1 != this.field_Ab) {
          if (1 == param1) {
            var4 = 1;
            var3 = 1;
            var5 = 1;
          } else {
            if (2 != param1) {
              if (param1 != 128) {
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
          this.field_Ab = param1;
          this.field_nb = this.field_nb & -29;
        }
    }

    private final void applyLightingState(boolean guard) {
        RenderBuffer var3;
        if (!guard) {
          var3 = (RenderBuffer) null;
          this.createRenderTarget((RenderSurface) null, (RenderBuffer) null);
        }
        if (this.field_Bb &&
          !this.lightingSuppressed) {
          jaggl.OpenGL.glEnable(2896);
        } else {
          jaggl.OpenGL.glDisable(2896);
        }
    }

    private final void m(int param0) {
        if (param0 >= -116) {
          this.h(80);
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
        if (0 >= this.field_Z) {
          return;
        }
        if (this.field_Ec > 0) {
          var1 = this.field_yc;
          var2 = this.field_jb;
          var3 = this.field_Wb;
          var4 = this.field_Eb;
          this.j(-1303);
          jaggl.OpenGL.glReadBuffer(1028);
          jaggl.OpenGL.glDrawBuffer(1029);
          this.g((byte) -81);
          this.d(3, false);
          this.b(-119, false);
          this.a(108, false);
          this.a(false, (byte) -115);
          this.bindTexture(83, (LegacyOpenGlTexture) null);
          this.a((byte) 124, -2);
          this.setTextureCombineMode(1, true);
          this.c(25189, 0);
          jaggl.OpenGL.glMatrixMode(5889);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
          jaggl.OpenGL.glMatrixMode(5888);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glCopyPixels(0, 0, this.field_Z, this.field_Ec, 6144);
          jaggl.OpenGL.glFlush();
          jaggl.OpenGL.glReadBuffer(1029);
          jaggl.OpenGL.glDrawBuffer(1029);
          this.setClip(var1, var3, var2, var4);
          return;
        }
    }

    final void clear(int color) {
        this.c(25189, 0);
        jaggl.OpenGL.glClearColor((float)(color & 16711680) / 16711680.0f, (float)(color & 65280) / 65280.0f, (float)(color & 255) / 255.0f, (float)(color >>> 24) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    private final void a(int param0, int param1, boolean param2, boolean param3) {
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
        if (this.field_wc == param0) {
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
          if (param0 < 0) {
            this.c(false);
          } else {
            var5 = this.field_Pb.a(0, param0);
            var10 = this.textureProvider.a(-29193, param0);
            if (var10.field_c == 0 &&
              var10.field_u == 0) {
              this.c(false);
            } else {
              stackIn_15_0 = (var10.field_n) ? 64 : 128;
              var11 = stackIn_15_0;
              var12 = 50 * var11;
              this.a((float)(var10.field_u * (this.animationTime % var12)) / (float)var12, 0.0f, (float)(var10.field_c * (this.animationTime % var12)) / (float)var12, 32151);
            }
            if (!this.field_uc) {
              var9 = var10.field_d;
              var8 = var10.field_h;
              var7 = var10.field_j;
            }
            var6 = var10.field_q;
          }
          this.effectManager.selectEffect(param2, var8, 125, var7, param3, var9);
          if (!this.effectManager.bindTexture(var6, (byte) 71, (LegacyOpenGlTexture) (var5))) {
            this.bindTexture(103, (LegacyOpenGlTexture) (var5));
            this.setTextureCombineMode(var6, true);
          }
          this.field_gb = this.field_uc;
          this.field_wc = param0;
        }
        this.field_nb = this.field_nb & -8;
        if (param1 <= 109) {
          this.b(-42, (byte) -3);
        }
    }

    private final void b(LegacyOpenGlFramebufferTarget param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_w >= 0 &&
            this.field_Hc[this.field_w] == param0) {
            if (param1 != -963075224) {
              this.field_ac = -0.3817848265171051f;
            }
            fieldTemp$1 = this.field_w;
            this.field_w = this.field_w - 1;
            this.field_Hc[fieldTemp$1] = null;
            param0.unbindDrawFramebuffer(false);
            if (this.field_w < 0) {
              this.field_Fb = null;
            } else {
              this.field_Fb = this.field_Hc[this.field_w];
              this.field_Fb.bindDrawFramebuffer(param1 + 963075341);
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("fr.AB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        if ((!param1 ? 1 : 0) == (!this.field_x ? 1 : 0)) {
        } else {
          if (param1) {
            jaggl.OpenGL.glEnable(2929);
          } else {
            jaggl.OpenGL.glDisable(2929);
          }
          this.field_x = param1 ? true : false;
          this.field_nb = this.field_nb & -32;
        }
        if (param0 <= 52) {
          this.field_oc = (IntrusiveDeque) null;
        }
    }

    private final void i(int param0) {
        this.field_Lb = (float)(-this.field_lc + this.field_Cb) - this.field_l;
        this.field_bc = -((float)this.field_kc * this.field_ub) + this.field_Lb;
        if (this.field_bc < (float)this.field_sc) {
          this.field_bc = (float)this.field_sc;
        }
        jaggl.OpenGL.glFogf(2915, this.field_bc);
        if (param0 != 3089) {
          return;
        }
        jaggl.OpenGL.glFogf(2916, this.field_Lb);
        LegacyOpenGlSpriteMask.field_g[1] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(this.field_P, 65280) / 65280.0f;
        LegacyOpenGlSpriteMask.field_g[2] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(255, this.field_P) / 255.0f;
        LegacyOpenGlSpriteMask.field_g[0] = (float)LegacyOpenGlPostProcessManager.bitwiseAnd(this.field_P, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, LegacyOpenGlSpriteMask.field_g, 0);
    }

    static {
        unfortunatelyYourConfigurationDoesnText = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
