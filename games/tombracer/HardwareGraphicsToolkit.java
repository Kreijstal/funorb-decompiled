/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class HardwareGraphicsToolkit extends GraphicsToolkit {
    private IntrusiveDeque field_ic;
    ResourceArchive field_I;
    Object field_Ub;
    static fta field_w;
    long field_peer;
    int field_jc;
    hk field_Mb;
    jaclib.memory.heap.NativeHeapBuffer field_o;
    private jaclib.memory.heap.NativeHeap field_t;
    jagex3.graphics2.hw.NativeInterface field_P;
    int field_Hb;
    private Hashtable field_oc;
    int field_X;
    AffineTransform3D field_q;
    int field_Xb;
    boolean field_gb;
    int field_Fb;
    AffineTransform3D field_bb;
    AffineTransform3D field_Y;
    AffineTransform3D field_Qb;
    private AffineTransform3D field_rc;
    private AffineTransform3D field_xc;
    int field_Vb;
    private boolean field_Fc;
    float field_fc;
    boolean field_m;
    int field_C;
    float field_Cb;
    int field_K;
    private boolean field_ab;
    private float[] field_dc;
    boolean field_Nb;
    private int field_Jc;
    float[] field_Gb;
    float field_j;
    int field_J;
    int field_Ic;
    private ld field_eb;
    private boolean field_V;
    int field_Sb;
    private ShaderEffect field_pb;
    private float field_lc;
    private float[] field_Eb;
    SceneLight[] field_ib;
    boolean field_qc;
    gb field_lb;
    int field_i;
    mla field_r;
    private int field_ac;
    private float[] field_Lb;
    private int field_F;
    ica[] field_db;
    int field_Ac;
    float field_yb;
    float field_zc;
    boolean field_Bb;
    int field_D;
    int field_Dc;
    int field_jb;
    private int field_nb;
    private DynamicGeometryBuffer field_kb;
    float field_Kb;
    int field_S;
    float field_H;
    private boolean field_L;
    ura[] field_v;
    int field_k;
    private int field_Lc;
    boolean field_Zb;
    private float field_G;
    private float[] field_vc;
    int field_Bc;
    ica[] field_mc;
    boolean field_l;
    private GpuTexture[] field_N;
    private int field_rb;
    GpuTexture field_Jb;
    boolean field_Yb;
    float field_pc;
    float[] field_M;
    private int field_kc;
    AffineTransform3D[] field_hc;
    float field_sc;
    private boolean field_s;
    private boolean field_p;
    int field_Gc;
    private int field_qb;
    private int field_Q;
    float field_f;
    int field_bc;
    int field_e;
    boolean field_yc;
    float field_Hc;
    private int field_vb;
    boolean field_x;
    private float[] field_R;
    float field_d;
    private int field_Tb;
    private int field_Rb;
    private float[] field_Ib;
    boolean field_U;
    float[] field_T;
    int field_Kc;
    float field_uc;
    private jaclib.memory.Stream field_y;
    float field_B;
    private int field_u;
    int field_A;
    private boolean field_zb;
    private int field_wb;
    int field_Cc;
    boolean field_wc;
    int field_g;
    boolean field_Ob;
    int field_h;
    private float field_Pb;
    private HardwareTextureCache field_Ec;
    private ShaderEffect[] field_sb;
    HardwareModel field_W;
    private AffineTransform3D field_Ab;
    HardwareModel field_n;
    HardwareModel field_ec;
    private qm field_cb;
    mna field_Db;
    HardwareModel field_E;
    HardwareModel field_gc;
    private mna field_ub;
    private VertexBuffer field_z;
    HardwareModel field_O;
    mna field_nc;
    mna field_ob;
    private qm field_hb;
    private mna field_mb;
    HardwareModel field_fb;
    HardwareModel field_cc;
    HardwareModel field_tc;
    HardwareModel field_tb;
    private qm field_xb;
    private mna field_Z;
    boolean field_Wb;

    final void ZA(int param0, float param1, float param2, float param3, float param4, float param5) {
        int stackIn_3_0 = 0;
        int var7;
        float var8;
        stackIn_3_0 = (this.field_Tb == param0) ? 0 : 1;
        var7 = stackIn_3_0;
        if (var7 != 0 ||
          param1 != this.field_j ||
          param2 != this.field_pc) {
          this.field_j = param1;
          this.field_pc = param2;
          this.field_Tb = param0;
          if (var7 != 0) {
            this.field_Kb = (float)(255 & this.field_Tb) / 255.0f;
            this.field_sc = (float)(16711680 & this.field_Tb) / 16711680.0f;
            this.field_yb = (float)(65280 & this.field_Tb) / 65280.0f;
            this.applyAmbientLightColor(0);
          }
          this.field_P.setSunColour(this.field_sc, this.field_yb, this.field_Kb, param1, param2);
          this.applyDirectionalLightColors(86);
        }
        if (this.field_Eb[0] != param3 ||
          param4 != this.field_Eb[1] ||
          this.field_Eb[2] != param5) {
          this.field_Eb[1] = param4;
          this.field_Eb[2] = param5;
          this.field_Eb[0] = param3;
          this.field_dc[0] = -param3;
          this.field_dc[2] = -param5;
          this.field_dc[1] = -param4;
          var8 = (float)(1.0 / Math.sqrt((double)(param5 * param5 + (param3 * param3 + param4 * param4))));
          this.field_Gb[2] = var8 * param5;
          this.field_Gb[1] = var8 * param4;
          this.field_Gb[0] = param3 * var8;
          this.field_M[0] = -this.field_Gb[0];
          this.field_M[1] = -this.field_Gb[1];
          this.field_M[2] = -this.field_Gb[2];
          this.field_P.setSunDirection(this.field_Gb[0], this.field_Gb[1], this.field_Gb[2]);
          this.applyLightPositions(-88);
        }
        this.uploadDirectionalLights((byte) -78);
    }

    abstract void setAlphaCombineSource(fp param0, int param1, boolean param2, int param3);

    abstract void applyViewMatrix(boolean param0);

    final void prepareOrthographicModelRendering(byte param0) {
        if (param0 != 102) {
          this.field_o = (jaclib.memory.heap.NativeHeapBuffer) null;
        }
        if (this.field_rb != 16) {
          this.useOrthographicProjection(22);
          this.setFogEnabled(true, -69);
          this.setDepthTestEnabled(0, true);
          this.setDepthWriteEnabled(true, (byte) 81);
          this.setBlendMode(1, 1);
          this.field_rb = 16;
        }
    }

    final void usePixelProjection(int param0) {
        mla var2 = null;
        if (this.field_r != S2CRewardChoicePacket.field_d) {
          var2 = this.field_r;
          this.field_r = S2CRewardChoicePacket.field_d;
          if (var2.isModelProjection(-101)) {
            this.modelViewChanged((byte) 94);
          }
          this.buildPixelProjection(0);
          this.field_T = this.field_Lb;
          this.projectionChanged((byte) 26);
          this.field_rb = this.field_rb & -25;
        }
        if (param0 != 19822) {
          this.applyAmbientLightColor(87);
        }
    }

    final za createHeap(int param0) {
        to var2 = new to(param0);
        this.field_ic.addLast((byte) -68, var2);
        return (za) ((Object) var2);
    }

    final void setBlendMode(int param0, int param1) {
        gb var3;
        int var4;
        int var5;
        int var6;
        int stackIn_11_0 = 0;
        boolean stackIn_15_1 = false;
        boolean stackIn_21_1 = false;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != this.field_wb) {
          if (1 == param0) {
            var3 = GameScreen.field_b;
            var5 = 1;
            var4 = 1;
          } else {
            if (2 == param0) {
              var4 = 1;
              var5 = 0;
              var3 = mp.field_a;
            } else {
              if (param0 != 128) {
                var4 = 0;
                var5 = 0;
                var3 = NotLoggedInMenu.field_q;
              } else {
                var5 = 1;
                var4 = 1;
                var3 = BrickOperator.field_w;
              }
            }
          }
          stackIn_11_0 = (var5 != 0) ? 0 : 1;
          if (stackIn_11_0 == (this.field_m ? 1 : 0)) {
            stackIn_15_1 = (var5 != 0);
            this.field_m = stackIn_15_1;
            this.applyAlphaTest(param1 ^ -128);
          }
          if (var4 != (this.field_Yb ? 1 : 0)) {
            stackIn_21_1 = (var4 != 0);
            this.field_Yb = stackIn_21_1;
            this.applyBlendEnabled(-27581);
          }
          if (var3 != this.field_lb) {
            this.field_lb = var3;
            this.applyBlendFactors(false);
          }
          this.field_rb = this.field_rb & -29;
          this.field_wb = param0;
        }
        if (param1 != 1) {
          this.field_fc = 1.0839076042175293f;
        }
    }

    final void setAlphaCombineSource(int param0, boolean param1, fp param2) {
        try {
          this.setAlphaCombineSource(param2, 15802, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "eo.QH(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    void dispose() {
        IntrusiveNode var1 = null;
        Enumeration var1_ref = null;
        java.awt.Canvas var2 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!this.field_Fc) {
          var1 = this.field_ic.first(-80);
          while (var1 != null) {
            ((to) (var1)).b((byte) 30);
            var1 = this.field_ic.next(110);
          }
          var1_ref = this.field_oc.keys();
          while (var1_ref.hasMoreElements()) {
            var2 = (java.awt.Canvas) (var1_ref.nextElement());
            this.releaseSurface(this.field_oc.get(var2), false, var2);
          }
          LegacyOpenGlEnvironmentWaterEffect.a(true, false, true);
          this.field_P.release();
          this.field_Fc = true;
        }
    }

    abstract void applyAlphaTest(int param0);

    final Transform3D createTransform() {
        return (Transform3D) ((Object) new AffineTransform3D());
    }

    final void setTextureCombineMode(byte param0, int param1) {
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = 14 % ((param0 - 61) / 46);
        if (param1 != 1) {
          if (param1 != 0) {
            if (param1 == 2) {
              this.setTextureCombineOperations(PlatformComponent.field_F, (byte) -110, r.field_m);
            } else {
              if (param1 != 3) {
                if (param1 == 4) {
                  this.setTextureCombineOperations(FunOrbConsole.field_w, (byte) -110, FunOrbConsole.field_w);
                }
              } else {
                this.setTextureCombineOperations(iw.field_c, (byte) -110, NormalMapOperator.field_m);
              }
            }
          } else {
            this.setTextureCombineOperations(iw.field_c, (byte) -110, iw.field_c);
          }
        } else {
          this.setTextureCombineOperations(PlatformComponent.field_F, (byte) -110, PlatformComponent.field_F);
        }
    }

    abstract void applyFogParameters(int param0);

    abstract boolean supportsTexture3D(una param0, int param1, ft param2);

    final void prepareGlyphRendering(int param0) {
        if (4 != this.field_rb) {
          this.usePixelProjection(19822);
          this.setFogEnabled(false, -52);
          this.setLightingEnabled(0, false);
          this.setDepthTestEnabled(0, false);
          this.setDepthWriteEnabled(false, (byte) 81);
          this.bindMaterialTexture((byte) -80, false, false, -2);
          this.setBlendMode(1, 1);
          this.setTextureCombineMode((byte) -68, 0);
          this.field_rb = 4;
        }
        if (param0 >= -104) {
          this.field_peer = 17L;
        }
    }

    final void a(float param0, int param1) {
        if (param1 != -229) {
          this.field_cb = (qm) null;
        }
        if (param0 != this.field_Pb) {
          this.field_Pb = param0;
          this.invalidateOrthographicProjection(param1 ^ -229);
        }
    }

    final static boolean d(int param0, int param1) {
        int var2 = 74 / ((-6 - param0) / 32);
        return param1 >= 2 ? true : false;
    }

    private final void useOrthographicProjection(int param0) {
        mla var2_ref_mla = null;
        if (this.field_r != RasterBuffer.field_d) {
          var2_ref_mla = this.field_r;
          this.field_r = RasterBuffer.field_d;
          if (!var2_ref_mla.isModelProjection(-114)) {
            this.modelViewChanged((byte) 94);
          }
          this.buildOrthographicProjection((byte) 83);
          this.field_T = this.field_Ib;
          this.projectionChanged((byte) 26);
          this.field_rb = this.field_rb & -8;
        }
        int var2 = 110 % ((-25 - param0) / 46);
    }

    abstract void applyLightPositions(int param0);

    abstract Object createSurface(boolean param0, java.awt.Canvas param1);

    final void setLightingEnabled(int param0, boolean param1) {
        if (this.field_l != param1) {
          this.field_l = param1 ? true : false;
          this.applyLighting((byte) -102);
          this.field_rb = this.field_rb & -8;
        }
        if (param0 != 0) {
          this.field_Pb = 0.3918037712574005f;
        }
    }

    abstract VertexBuffer createIndexBuffer(int param0, boolean param1);

    abstract void uploadDirectionalLights(byte param0);

    private final void projectionChanged(byte param0) {
        if (param0 != 26) {
          this.field_Yb = true;
        }
        this.applyProjectionMatrix((byte) 119);
        if (null != this.field_pb) {
          this.field_pb.onProjectionChanged(param0 + 62);
        }
    }

    final void setDepthWriteEnabled(boolean param0, byte param1) {
        if (this.field_qc != param0) {
          this.field_qc = param0 ? true : false;
          this.applyDepthWrite((byte) -128);
          this.field_rb = this.field_rb & -32;
        }
        if (param1 != 81) {
          this.field_e = 64;
        }
    }

    private final void updateProjectionDepthTerms(int param0) {
        if (param0 != -30801) {
          return;
        }
        this.field_R[10] = this.field_lc;
        this.field_R[14] = this.field_G;
        this.field_d = ((float)(-this.field_k) + this.field_R[14]) / this.field_R[10];
    }

    final void modelTransformChanged(int param0) {
        this.field_gb = false;
        if (param0 != -1662) {
          this.field_Wb = true;
        }
        this.applyModelTransform(16);
    }

    final ToolkitSprite createSprite(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        gh stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new gh(this, param3, param4, param0, param1, param2);
          return (ToolkitSprite) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("eo.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void useIdentityProjection(int param0) {
        mla var2 = null;
        if (param0 != 256) {
          this.updateProjectionDepthTerms(-116);
        }
        if (ListTracksCommand.field_p != this.field_r) {
          var2 = this.field_r;
          this.field_r = ListTracksCommand.field_p;
          if (var2.isModelProjection(-65)) {
            this.modelViewChanged((byte) 94);
          }
          this.field_rb = this.field_rb & -32;
          this.field_T = this.field_vc;
        }
    }

    final void drawHorizontalLine(int param0, int param1, int param2, int param3, int param4) {
        this.drawLine(param0, param1, param0 + param2, param1, param3, param4);
    }

    private final void applyModelTransform(int param0) {
        float var2 = 0.0f;
        if (param0 != 16) {
          this.setModelBufferSize(107);
        }
        if (S2CRewardChoicePacket.field_d == this.field_r) {
          var2 = this.pixelCenterOffset((byte) -61);
          this.field_q.translate(var2, param0 ^ -128, var2, 0.0f);
        }
        this.field_p = false;
        this.applyModelMatrix((byte) -73);
        if (this.field_pb != null) {
          this.field_pb.onViewMatrixChanged((byte) 107);
        }
    }

    abstract void applyViewport(byte param0);

    final Transform3D getTransform() {
        return (Transform3D) ((Object) this.field_Ab);
    }

    abstract void applyActiveTexture(boolean param0);

    final int underwaterSurfaceHeight(boolean param0) {
        if (param0) {
          return 107;
        }
        return this.field_vb;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 3) {
          return;
        }
        field_w = null;
    }

    abstract void applyAmbientLightColor(int param0);

    abstract void applyDirectionalLightColors(int param0);

    private final void buildOrthographicProjection(byte param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float var8;
        float[] var10;
        int[] var9;
        if (!this.field_ab) {
          var10 = this.field_Ib;
          var2 = var10;
          var3 = (float)this.field_D;
          var4 = (float)this.field_k;
          var5 = (float)(-this.field_kc) * this.field_Pb / (float)this.field_h;
          var6 = this.field_Pb * (float)(-this.field_Q) / (float)this.field_Ic;
          var7 = (float)(-this.field_Q + this.field_Hb) * this.field_Pb / (float)this.field_Ic;
          var8 = (float)(-this.field_kc + this.field_jc) * this.field_Pb / (float)this.field_h;
          if (var6 != var7 &&
            var8 != var5) {
            var2[11] = 0.0f;
            var2[6] = 0.0f;
            var2[12] = (var7 + var6) / (var6 - var7);
            var2[10] = 1.0f / (var3 - var4);
            var2[9] = 0.0f;
            var2[14] = var3 / (var3 - var4);
            var2[0] = 2.0f / (-var6 + var7);
            var2[3] = 0.0f;
            var2[1] = 0.0f;
            var2[4] = 0.0f;
            var2[7] = 0.0f;
            var2[15] = 1.0f;
            var2[5] = 2.0f / (-var5 + var8);
            var2[2] = 0.0f;
            var2[8] = 0.0f;
            var2[13] = (var8 + var5) / (var8 - var5);
          } else {
            var10[14] = 0.0f;
            var10[3] = 0.0f;
            var10[6] = 0.0f;
            var10[5] = 1.0f;
            var10[15] = 1.0f;
            var10[4] = 0.0f;
            var10[1] = 0.0f;
            var10[2] = 0.0f;
            var10[11] = 0.0f;
            var10[10] = 1.0f;
            var10[12] = 0.0f;
            var10[9] = 0.0f;
            var10[0] = 1.0f;
            var10[8] = 0.0f;
            var10[13] = 0.0f;
            var10[7] = 0.0f;
          }
          this.L(param0 - 73);
          this.field_ab = true;
        }
        if (param0 != 83) {
          var9 = (int[]) null;
          this.da(-58, 96, -43, (int[]) null);
        }
    }

    private final void L(int param0) {
        this.field_Cb = (float)this.field_k;
        if (param0 != 10) {
          int[] var3 = (int[]) null;
          this.da(-108, 67, -5, (int[]) null);
        }
    }

    final void fillShadedTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
    }

    final GpuTexture2D createIntTexture2D(boolean param0, int param1, boolean param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        GpuTexture2D stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.updateTime(-115);
          }
          stackIn_3_0 = this.createIntTexture2D(param4, 0, param2, param3, 0, param1, 75);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("eo.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final AffineTransform3D getViewTransform(int param0) {
        if (param0 < 1) {
          this.field_Jb = (GpuTexture) null;
        }
        return this.field_Qb;
    }

    final na environmentCubeTexture(int param0) {
        int var2 = -92 / ((-33 - param0) / 36);
        if (this.field_eb == null) {
          return null;
        }
        return this.field_eb.b(68);
    }

    final void xa(float param0) {
        if (this.field_fc != param0) {
          this.field_fc = param0;
          this.field_P.setAmbient(param0);
          this.applyAmbientLightColor(0);
          this.uploadDirectionalLights((byte) -78);
        }
    }

    final void preparePerspectiveModelRendering(int param0) {
        if (this.field_rb != 8) {
          this.usePerspectiveProjection((byte) -74);
          this.setFogEnabled(true, -91);
          this.setDepthTestEnabled(0, true);
          this.setDepthWriteEnabled(true, (byte) 81);
          this.setBlendMode(1, 1);
          this.field_rb = 8;
        }
        if (param0 != 11) {
          field_w = (fta) null;
        }
    }

    abstract void applyColorCombineOperation(int param0);

    abstract void applyTexCoordGeneration(dn param0, byte param1);

    abstract void releaseSurface(Object param0, boolean param1, java.awt.Canvas param2);

    private final void buildPixelProjection(int param0) {
        float[] var2;
        float[] var3;
        if (param0 != 0) {
          return;
        }
        if (!this.field_zb) {
          var3 = this.field_Lb;
          var2 = var3;
          this.field_zb = true;
          if (0 != this.field_Hb &&
            this.field_jc != 0) {
            var3[6] = 0.0f;
            var3[8] = 0.0f;
            var3[7] = 0.0f;
            var3[3] = 0.0f;
            var3[12] = -1.0f;
            var3[10] = 0.5f;
            var3[4] = 0.0f;
            var3[13] = 1.0f;
            var3[11] = 0.0f;
            var3[15] = 1.0f;
            var3[0] = 2.0f / (float)this.field_Hb;
            var3[9] = 0.0f;
            var3[14] = 0.5f;
            var3[1] = 0.0f;
            var3[5] = -2.0f / (float)this.field_jc;
            var3[2] = 0.0f;
          } else {
            var2[10] = 1.0f;
            var2[11] = 0.0f;
            var2[6] = 0.0f;
            var2[13] = 0.0f;
            var2[5] = 1.0f;
            var2[4] = 0.0f;
            var2[2] = 0.0f;
            var2[15] = 1.0f;
            var2[12] = 0.0f;
            var2[7] = 0.0f;
            var2[3] = 0.0f;
            var2[14] = 0.0f;
            var2[1] = 0.0f;
            var2[8] = 0.0f;
            var2[9] = 0.0f;
            var2[0] = 1.0f;
          }
        }
    }

    private final void selectShaderEffect(int param0, int param1, int param2, boolean param3, boolean param4, int param5) {
        int stackIn_10_0 = 0;
        int var8;
        var8 = TombRacer.field_G ? 1 : 0;
        param4 = param4 & this.p(-112);
        if (param5 != -25) {
          this.field_eb = (ld) null;
        }
        if (!param4 && (param0 == 4 ||
          8 == param0 ||
          param0 == 9)) {
          param0 = 2;
          if (param0 != 4) {
            stackIn_10_0 = 1;
          } else {
            stackIn_10_0 = param1 & 1;
          }
          param2 = stackIn_10_0;
          param1 = 0;
        }
        if (param0 != 0 &&
          param3) {
          param0 = param0 | -2147483648;
        }
        if (this.field_qb == param0) {
          if (this.field_qb != 0) {
            this.field_sb[this.field_qb & 2147483647].refreshState(param3, param5 ^ -5737);
            if (this.field_Lc != param1 ||
              this.field_Rb != param2) {
              this.field_sb[this.field_qb & 2147483647].setParameters((byte) 55, param1, param2);
              this.field_Rb = param2;
              this.field_Lc = param1;
            }
          }
        } else {
          if (0 != this.field_qb) {
            this.field_sb[this.field_qb & 2147483647].disable(-79);
          }
          if (param0 == 0) {
            this.field_pb = null;
          } else {
            this.field_pb = this.field_sb[2147483647 & param0];
            this.field_pb.enable(-112, param3);
            this.field_pb.refreshState(param3, 5744);
            this.field_pb.setParameters((byte) 55, param1, param2);
          }
          this.field_qb = param0;
          this.field_Rb = param2;
          this.field_Lc = param1;
        }
    }

    final AffineTransform3D getModelTransform(byte param0) {
        if (param0 != -77) {
          this.field_pb = (ShaderEffect) null;
        }
        return this.field_q;
    }

    ShaderEffect createShaderEffect(int param0, int param1) {
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 <= 37) {
          this.field_Qb = (AffineTransform3D) null;
        }
        var3 = param0;
        if (6 == var3) {
          return (ShaderEffect) ((Object) new HardwareUnlitEffect(this));
        }
        if (var3 == 1) {
          return (ShaderEffect) ((Object) new HardwareSpecularEffect(this));
        }
        if (var3 == 2) {
          return (ShaderEffect) ((Object) new HardwareAnimatedWaterEffect(this, this.field_Mb));
        }
        if (var3 != 7) {
          return (ShaderEffect) ((Object) new FallbackShaderEffect(this));
        }
        return (ShaderEffect) ((Object) new HardwareReflectionEffect(this));
    }

    final void setLights(int param0, SceneLight[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          for (var3_int = 0; var3_int < param0; var3_int++) {
            this.field_ib[var3_int] = param1[var3_int];
          }
          this.field_Bc = param0;
          if (this.field_r.isModelProjection(-89)) {
            this.applyPointLights((byte) 92);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("eo.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void updateTime(int param0) {
        if (null != this.field_Ec) {
          this.field_Ec.ageCache(5);
        }
        this.field_Dc = param0 & 2147483647;
    }

    final void setFogEnabled(boolean param0, int param1) {
        if (this.field_Bb != param0) {
          this.field_Bb = param0 ? true : false;
          this.applyFogEnabled(2);
          this.field_rb = this.field_rb & -32;
        }
        if (param1 >= -51) {
          this.field_Bb = false;
        }
    }

    final jaclib.memory.heap.NativeHeapBuffer allocateNativeBuffer(boolean param0, int param1, boolean param2) {
        if (param0) {
          return (jaclib.memory.heap.NativeHeapBuffer) null;
        }
        return this.field_t.a(param1, param2);
    }

    private final void usePerspectiveProjection(byte param0) {
        mla var2 = null;
        if (param0 != -74) {
          this.field_T = (float[]) null;
        }
        if (SpriteSampleOperator.field_s != this.field_r) {
          var2 = this.field_r;
          this.field_r = SpriteSampleOperator.field_s;
          if (!var2.isModelProjection(-109)) {
            this.modelViewChanged((byte) 94);
          }
          this.buildPerspectiveProjection(7);
          this.field_T = this.field_R;
          this.projectionChanged((byte) 26);
          this.field_rb = this.field_rb & -8;
        }
    }

    final void setTextureConstantColor(int param0, int param1) {
        if (param0 != 3625) {
          return;
        }
        if (this.field_bc != param1) {
          this.field_bc = param1;
          this.applyTextureConstantColor(-95);
        }
    }

    final static Weapon createGunWeaponPreset(byte param0) {
        Weapon var1 = new Weapon();
        var1.effect = new Effect(0, 5);
        var1.effect.setDeathMessageIndex(1, 11);
        var1.field_c = true;
        var1.field_d = 0;
        var1.maxAmmo = -1;
        var1.field_n = 655360;
        var1.field_h = 25;
        var1.field_k = 150;
        var1.field_o = 26;
        var1.field_t = 27;
        if (param0 >= -14) {
          return (Weapon) null;
        }
        var1.field_b = 0;
        return var1;
    }

    abstract void applyDepthTest(byte param0);

    final int[] projectionParameters() {
        return new int[]{this.field_Q, this.field_kc, this.field_Ic, this.field_h};
    }

    final void getClip(int[] param0) {
        try {
          param0[3] = this.field_jb;
          param0[1] = this.field_K;
          param0[2] = this.field_C;
          param0[0] = this.field_A;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "eo.K(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final float[] writeTransposedProjection(float[] param0, boolean param1) {
        RuntimeException var3 = null;
        float[] stackIn_2_0 = null;
        float[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0[12] = this.field_T[3];
          param0[0] = this.field_T[0];
          param0[4] = this.field_T[1];
          param0[8] = this.field_T[2];
          if (param1) {
            stackIn_2_0 = (float[]) null;
            return stackIn_2_0;
          }
          param0[5] = this.field_T[5];
          param0[9] = this.field_T[6];
          param0[13] = this.field_T[7];
          param0[2] = this.field_T[8];
          param0[1] = this.field_T[4];
          param0[10] = this.field_T[10];
          param0[14] = this.field_T[11];
          param0[6] = this.field_T[9];
          param0[7] = this.field_T[13];
          param0[3] = this.field_T[12];
          param0[15] = this.field_T[15];
          param0[11] = this.field_T[14];
          stackIn_4_0 = (float[]) (param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("eo.JG(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void applyAlphaCombineOperation(byte param0);

    final void resetModelTransform(byte param0) {
        this.field_q.setIdentity();
        this.field_gb = true;
        this.applyModelTransform(16);
        if (param0 < 97) {
          this.createIndexBuffer(36, false);
        }
    }

    private final void fogChanged(int param0) {
        if (param0 != -7840) {
          this.field_mb = (mna) null;
        }
        if (this.field_pb != null) {
          this.field_pb.onFogChanged(true);
        }
        this.applyFogParameters(1);
    }

    abstract void applyTextureMatrix(int param0);

    abstract void applyModelMatrix(byte param0);

    abstract qm createVertexBuffer(int param0, boolean param1);

    private final void invalidateOrthographicProjection(int param0) {
        if (param0 != 0) {
          return;
        }
        this.field_ab = false;
        this.buildOrthographicProjection((byte) 83);
        if (this.field_r == RasterBuffer.field_d) {
          this.projectionChanged((byte) 26);
        }
    }

    private final void invalidatePerspectiveProjection(int param0) {
        this.field_s = false;
        this.buildPerspectiveProjection(7);
        if (param0 != -19320) {
          this.field_Mb = (hk) null;
        }
        if (this.field_r == SpriteSampleOperator.field_s) {
          this.projectionChanged((byte) 26);
        }
    }

    final void setColorCombineSource(fp param0, int param1, int param2) {
        try {
          this.setColorCombineSource(param0, param1, -6219, false, false);
          if (param2 >= -13) {
            this.field_qb = 22;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "eo.GF(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void setTransform(Transform3D param0) {
        try {
          this.field_bb = (AffineTransform3D) (param0);
          this.field_Qb.copyStateFrom(this.field_bb, 1);
          this.field_Qb.negateYZ((byte) 42);
          this.field_rc.setTransposedFrom((Transform3D) (this.field_Qb), (byte) 127);
          this.field_Y.setTransposedFrom((Transform3D) (this.field_bb), (byte) -31);
          if (this.field_r.isModelProjection(-38)) {
            this.modelViewChanged((byte) 94);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "eo.W(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void fillRectangle(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.prepareSolidRendering(114);
        this.setTextureConstantColor(3625, param4);
        this.setColorCombineSource(LruNodeCache.field_c, 0, -117);
        this.setAlphaCombineSource(0, false, LruNodeCache.field_c);
        this.setBlendMode(param5, 1);
        this.field_q.setScale(1.0f, (float)param2, false, (float)param3);
        this.field_q.translate(param0, param1, 0);
        this.modelTransformChanged(-1662);
        this.setMultisampling(1, false);
        this.drawUnitQuad(2);
        this.setMultisampling(1, true);
        this.setAlphaCombineSource(0, false, ej.field_c);
        this.setColorCombineSource(ej.field_c, 0, -119);
    }

    private final void createLineBuffer(boolean param0) {
        this.field_cb = this.createVertexBuffer(6, param0);
        this.field_cb.allocate(24, 12, param0);
        this.field_mb = this.createVertexLayout(new ne[]{new ne(gj.field_p)}, 0);
    }

    final void setDepthWriteAllowed(boolean param0, int param1) {
        this.field_Nb = param0 ? true : false;
        this.applyDepthWrite((byte) 117);
        if (param1 != 0) {
          this.field_S = -102;
        }
    }

    abstract void applyBlendEnabled(int param0);

    final void drawUnitQuad(int param0) {
        this.drawGeometryBuffer(vs.field_T, (byte) -32, param0);
    }

    final int estimatedResourceBytes(int param0) {
        if (param0 != 10) {
          this.xa(-0.16009120643138885f);
        }
        return this.field_X + this.field_Xb + this.field_Fb;
    }

    final void DA(int param0, int param1, int param2, int param3) {
        this.field_kc = param1;
        this.field_Ic = param2;
        this.field_Q = param0;
        this.field_h = param3;
        this.invalidateOrthographicProjection(0);
        this.invalidatePerspectiveProjection(-19320);
        this.useIdentityProjection(256);
        this.clipChanged((byte) -115);
    }

    final void HA(int param0, int param1, int param2, int param3, int[] param4) {
        RuntimeException runtimeException = null;
        float var6_float = 0.0f;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_float = this.field_bb.transformZ((float)param2, (float)param0, (byte) -105, (float)param1);
          if (!((float)this.field_D > var6_float) &&
            !(var6_float > (float)this.field_k)) {
            var7 = (int)((float)this.field_Ic * this.field_bb.transformX(1, (float)param0, (float)param1, (float)param2) / (float)param3);
            var8 = (int)((float)this.field_h * this.field_bb.transformY((float)param0, (float)param2, (float)param1, (byte) 123) / (float)param3);
            param4[1] = (int)((float)var8 - this.field_zc);
            param4[2] = (int)var6_float;
            param4[0] = (int)(-this.field_f + (float)var7);
            return;
          }
          var7_ref_int__ = param4;
          var8_ref_int__ = param4;
          param4[2] = -1;
          var8_ref_int__[1] = -1;
          var7_ref_int__[0] = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("eo.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void drawCircle(int param0, int param1, int param2, int param3, int param4) {
        this.prepareSolidRendering(118);
        this.setTextureConstantColor(3625, param3);
        this.setColorCombineSource(LruNodeCache.field_c, 0, -71);
        this.setAlphaCombineSource(0, false, LruNodeCache.field_c);
        this.setBlendMode(param4, 1);
        this.field_q.setScale(1.0f, (float)param2, false, (float)param2);
        this.field_q.translate(param0, param1, 0);
        this.modelTransformChanged(-1662);
        this.setMultisampling(1, false);
        this.bindVertexBuffer(-125, 0, this.field_hb);
        this.bindVertexLayout(this.field_Z, -32);
        this.drawPrimitives(256, ToolkitSelector.field_d, 1, 0);
        this.setMultisampling(1, true);
        this.setAlphaCombineSource(0, false, ej.field_c);
        this.setColorCombineSource(ej.field_c, 0, -104);
    }

    final void bindMaterialTexture(byte param0, boolean param1, boolean param2, int param3) {
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
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
        boolean decompiledFrameRemainder0 = true;
        var14 = TombRacer.field_G ? 1 : 0;
        if (param3 == this.field_Jc) {
          stackIn_3_0 = this.field_L;
          if (this.field_V) {
            stackIn_4_1 = 0;
          } else {
            stackIn_4_1 = 1;
          }
          decompiledFrameRemainder0 = ((stackIn_3_0 ? 1 : 0) == stackIn_4_1);
        }
        if (decompiledFrameRemainder0) {
          var5 = null;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          stackIn_8_0 = (this.field_L) ? 3 : 0;
          var9 = stackIn_8_0;
          if (param3 >= 0) {
            var5 = this.field_Ec.getTexture(param3, 111);
            var10 = this.field_c.metadata((byte) -47, param3);
            if (0 == var10.field_s &&
              var10.field_o == 0) {
              this.resetTextureTransform((byte) -80);
            } else {
              stackIn_16_0 = (!var10.field_g) ? 128 : 64;
              var11 = stackIn_16_0;
              var12 = 50 * var11;
              var13 = this.getActiveTextureTransform(0);
              var13.setTranslationFloat((byte) 126, (float)(var10.field_o * (this.field_Dc % var12)) / (float)var12, 0.0f, (float)(var10.field_s * (this.field_Dc % var12)) / (float)var12);
              this.setTextureTransformMode(pfa.field_i, false);
            }
            var6 = var10.field_q;
            if (!this.field_L) {
              var7 = var10.field_a;
              var9 = var10.field_h;
              var8 = var10.field_t;
            }
          } else {
            this.resetTextureTransform((byte) 88);
          }
          this.selectShaderEffect(var9, var7, var8, param1, param2, -25);
          if (null == this.field_pb) {
            this.bindTexture(true, (GpuTexture) (var5));
            this.setTextureCombineMode((byte) -37, var6);
          } else {
            this.field_pb.bindTexture(var6, (GpuTexture) (var5), 24595);
          }
          this.field_Jc = param3;
          this.field_V = this.field_L;
        }
        this.field_rb = this.field_rb & -8;
        if (param0 != -80) {
          this.field_Tb = 57;
        }
    }

    final void bindTexture(boolean param0, GpuTexture param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_N[this.field_Cc] != param1) {
            this.field_N[this.field_Cc] = param1;
            if (param1 != null) {
              param1.bind((byte) 89);
            } else {
              this.unbindTexture(1);
            }
            this.field_rb = this.field_rb & -2;
          }
          if (!param0) {
            this.field_wb = 77;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("eo.LF(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    abstract GpuTexture2D createIntTexture2D(int[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6);

    final void setModelTransform(AffineTransform3D param0, byte param1) {
        try {
          this.field_q.copyStateFrom(param0, 1);
          this.field_gb = false;
          int var3_int = 127 % ((param1 - 23) / 33);
          this.applyModelTransform(16);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "eo.IG(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void prepareSolidRendering(int param0) {
        if (param0 < 105) {
          return;
        }
        if (this.field_rb != 1) {
          this.usePixelProjection(19822);
          this.setFogEnabled(false, -63);
          this.setLightingEnabled(0, false);
          this.setDepthTestEnabled(0, false);
          this.setDepthWriteEnabled(false, (byte) 81);
          this.bindMaterialTexture((byte) -80, false, false, -2);
          this.setTextureCombineMode((byte) 118, 1);
          this.bindTexture(true, this.field_Jb);
          this.field_rb = 1;
        }
    }

    final void drawLine(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7;
        float var8;
        float var9;
        var7 = (float)(-param0) + (float)param2;
        var8 = (float)(-param1) + (float)param3;
        if (0.0f == var7 &&
          0.0f == var8) {
          var7 = 1.0f;
        } else {
          var9 = (float)(1.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
          var7 = var7 * var9;
          var8 = var8 * var9;
        }
        if (!this.writeLineVertices((float)param1, 0.0f, (float)param2 + var7, (float)param3 + var8, 0.0f, (float)param0, (byte) 126)) {
          return;
        }
        this.prepareSolidRendering(121);
        this.setTextureConstantColor(3625, param4);
        this.setColorCombineSource(LruNodeCache.field_c, 0, -61);
        this.setAlphaCombineSource(0, false, LruNodeCache.field_c);
        this.setBlendMode(param5, 1);
        this.resetModelTransform((byte) 106);
        this.setMultisampling(1, false);
        this.drawLineBuffer((byte) -70);
        this.setMultisampling(1, true);
        this.setAlphaCombineSource(0, false, ej.field_c);
        this.setColorCombineSource(ej.field_c, 0, -77);
    }

    final int underwaterFogIntensity(int param0) {
        if (param0 != -2903) {
          return 28;
        }
        return this.field_nb;
    }

    final void setFogAllowed(byte param0, boolean param1) {
        if ((!param1 ? 1 : 0) == (this.field_U ? 1 : 0)) {
          this.field_U = param1 ? true : false;
          this.applyFogEnabled(2);
        }
        if (param0 <= 42) {
          this.field_Yb = true;
        }
    }

    abstract lv createTexture3D(byte[] param0, ft param1, byte param2, int param3, int param4, int param5);

    abstract void applyTextureConstantColor(int param0);

    abstract void applyBlendFactors(boolean param0);

    final GpuTexture2D createFloatTexture2D(float[] param0, ft param1, boolean param2, boolean param3, int param4, int param5) {
        RuntimeException var7 = null;
        ft var8 = null;
        GpuTexture2D stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            var8 = (ft) null;
            this.createFloatTexture2D((float[]) null, (ft) null, false, false, 69, -89);
          }
          stackIn_3_0 = this.createFloatTexture2D(param1, 0, 0, param3, param4, 0, param0, param5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("eo.FF(");
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
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    abstract void applyFogEnabled(int param0);

    abstract void applyScissorEnabled(byte param0);

    private final boolean writeLineVertices(float param0, float param1, float param2, float param3, float param4, float param5, byte param6) {
        jaclib.memory.Buffer var11 = this.field_cb.mapBuffer(-15730, true);
        if (var11 == null) {
          return false;
        }
        jaclib.memory.Stream var9 = this.streamForBuffer(var11, 125);
        if (jaclib.memory.Stream.b()) {
          var9.b(param5);
          var9.b(param0);
          var9.b(param1);
          var9.b(param2);
          var9.b(param3);
          var9.b(param4);
        } else {
          var9.a(param5);
          var9.a(param0);
          var9.a(param1);
          var9.a(param2);
          var9.a(param3);
          var9.a(param4);
        }
        var9.a();
        int var10 = 16 % ((param6 - 72) / 44);
        return this.field_cb.unmapBuffer(true);
    }

    abstract void applyDepthWrite(byte param0);

    private final void drawLineBuffer(byte param0) {
        this.bindVertexBuffer(-126, 0, this.field_cb);
        if (param0 != -70) {
          this.applyProjectionMatrix((byte) -46);
        }
        this.bindVertexLayout(this.field_mb, -32);
        this.drawPrimitives(1, io.field_c, 0, param0 + 70);
    }

    final void da(int param0, int param1, int param2, int[] param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        float var7 = 0.0f;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_bb.transformZ((float)param2, (float)param0, (byte) -50, (float)param1);
          if (!(var7 < -0.0078125f) &&
            !(0.0078125f < var7)) {
            var6 = this.field_kc;
            var5_int = this.field_Q;
          } else {
            var5_int = (int)((float)this.field_Ic * this.field_bb.transformX(1, (float)param0, (float)param1, (float)param2) / var7);
            var6 = (int)((float)this.field_h * this.field_bb.transformY((float)param0, (float)param2, (float)param1, (byte) 126) / var7);
          }
          param3[0] = (int)((float)var5_int - this.field_f);
          param3[2] = (int)var7;
          param3[1] = (int)((float)var6 - this.field_zc);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("eo.da(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void resetTextureTransform(byte param0) {
        if (DualLinkNode.field_h != this.field_v[this.field_Cc]) {
          this.field_v[this.field_Cc] = DualLinkNode.field_h;
          this.field_hc[this.field_Cc].setIdentity();
          this.textureTransformChanged(0);
        }
        int var2 = -62 % ((param0 - 28) / 46);
    }

    final void rebuildDeviceResources(byte param0) {
        Enumeration var3 = null;
        java.awt.Canvas var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        Hashtable var2 = new Hashtable();
        if (this.field_oc != null &&
          !this.field_oc.isEmpty()) {
          var3 = this.field_oc.keys();
          while (var3.hasMoreElements()) {
            var4 = (java.awt.Canvas) (var3.nextElement());
            var2.put(var4, this.createSurface(false, var4));
          }
        }
        if (param0 != 6) {
          return;
        }
        this.field_oc = var2;
        this.createDynamicGeometryBuffer(param0 ^ 138);
        this.createLineBuffer(true);
        this.createCircleBuffer((byte) 15);
        this.field_kb.allocate(-120, this);
    }

    private final void createDynamicGeometryBuffer(int param0) {
        int var2;
        jaclib.memory.Buffer var3;
        int var5;
        jaclib.memory.Stream var4;
        var5 = TombRacer.field_G ? 1 : 0;
        this.field_xb = this.createVertexBuffer(6, false);
        this.field_xb.allocate(param0, 28, true);
        var2 = 0;
        scanLoop1: while (true) {
          if (var2 < 4) {
            var3 = this.field_xb.mapBuffer(param0 - 15870, true);
            if (var3 != null) {
              var4 = this.streamForBuffer(var3, param0 - 14);
              if (!jaclib.memory.Stream.b()) {
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
              if (this.field_xb.unmapBuffer(true)) {
                break scanLoop1;
              }
            }
            var2++;
            continue;
          }
          break;
        }
        this.field_ub = this.createVertexLayout(new ne[]{new ne(new gj[]{gj.field_p, gj.field_n, gj.field_n})}, 0);
        return;
    }

    final void L(int param0, int param1, int param2) {
        if (this.field_g != param0 ||
          this.field_J != param1 ||
          param2 != this.field_Ac) {
          this.field_J = param1;
          this.field_Ac = param2;
          this.field_g = param0;
          this.fogChanged(-7840);
          this.applyFogEnabled(2);
        }
    }

    abstract void drawIndexedPrimitives(VertexBuffer param0, int param1, int param2, int param3, iw param4, int param5, int param6);

    private final boolean p(int param0) {
        if (param0 > -41) {
          iw var3 = (iw) null;
          this.drawPrimitives(-55, (iw) null, 17, -88);
        }
        return this.field_sb[3].isSupported(1185);
    }

    void resetDriverState(int param0) {
        if (param0 != -29040) {
          this.drawHorizontalLine(-18, -45, 101, 121, 112);
        }
        this.applyAllRenderState((byte) 97);
    }

    abstract void unbindTexture(int param0);

    final void setLightingSuppressed(boolean param0, byte param1) {
        if (param1 < 53) {
          return;
        }
        if ((!param0 ? 1 : 0) == (this.field_yc ? 1 : 0)) {
          this.field_yc = param0 ? true : false;
          this.applyLighting((byte) -102);
        }
    }

    abstract void setTextureCoordinateIndex(int param0, byte param1);

    final AffineTransform3D getTransposedViewTransform(boolean param0) {
        if (!param0) {
          this.field_zb = true;
        }
        return this.field_rc;
    }

    private final void drawGeometryBuffer(iw param0, byte param1, int param2) {
        try {
          this.bindVertexBuffer(-128, 0, this.field_xb);
          this.bindVertexLayout(this.field_ub, -32);
          this.drawPrimitives(param2, param0, 0, 0);
          if (param1 != -32) {
            this.textureTransformChanged(-14);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "eo.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract GpuTexture2D createTexture2D(int param0, int param1, ft param2, byte param3, una param4);

    final void drawRectOutline(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = this.pixelCenterOffset((byte) -76);
        this.prepareSolidRendering(119);
        this.setTextureConstantColor(3625, param4);
        this.setColorCombineSource(LruNodeCache.field_c, 0, -126);
        this.setAlphaCombineSource(0, false, LruNodeCache.field_c);
        this.setBlendMode(param5, 1);
        this.field_q.setScale(1.0f, (float)(param2 - 1), false, (float)(param3 - 1));
        this.field_q.translate(-var7 + (float)param1, -39, (float)param0 - var7, 0.0f);
        this.modelTransformChanged(-1662);
        this.setMultisampling(1, false);
        this.drawGeometryBuffer(ToolkitSelector.field_d, (byte) -32, 4);
        this.setMultisampling(1, true);
        this.setAlphaCombineSource(0, false, ej.field_c);
        this.setColorCombineSource(ej.field_c, 0, -31);
    }

    final AffineTransform3D textureTransform(byte param0) {
        if (param0 <= 75) {
          return (AffineTransform3D) null;
        }
        return this.field_hc[this.field_Cc];
    }

    abstract na createCubeTexture(byte param0, int[][] param1, boolean param2, int param3);

    final void za(int param0, int param1, int param2, int param3, int param4) {
        this.prepareSolidRendering(118);
        this.setTextureConstantColor(3625, param3);
        this.setColorCombineSource(LruNodeCache.field_c, 0, -74);
        this.setAlphaCombineSource(0, false, LruNodeCache.field_c);
        this.setBlendMode(param4, 1);
        this.field_q.setScale(1.0f, (float)param2, false, (float)param2);
        this.field_q.translate(param0, param1, 0);
        this.modelTransformChanged(-1662);
        this.setMultisampling(1, false);
        this.bindVertexBuffer(-125, 0, this.field_hb);
        this.bindVertexLayout(this.field_Z, -32);
        this.drawPrimitives(256, vs.field_T, 0, 0);
        this.setMultisampling(1, true);
        this.setAlphaCombineSource(0, false, ej.field_c);
        this.setColorCombineSource(ej.field_c, 0, -93);
    }

    final void prepareSpriteRendering(byte param0) {
        if (this.field_rb != 2) {
          this.usePixelProjection(19822);
          this.setFogEnabled(false, -99);
          this.setLightingEnabled(0, false);
          this.setDepthTestEnabled(0, false);
          this.setDepthWriteEnabled(false, (byte) 81);
          this.bindMaterialTexture((byte) -80, false, false, -2);
          this.field_rb = 2;
        }
        if (param0 < 104) {
          this.field_ob = (mna) null;
        }
    }

    final void f(int param0, int param1) {
        if (this.field_D != param0 ||
          param1 != this.field_k) {
          this.field_D = param0;
          this.field_k = param1;
          this.invalidatePerspectiveProjection(-19320);
          this.invalidateOrthographicProjection(0);
          this.fogChanged(-7840);
        }
    }

    abstract boolean supportsTexture2D(boolean param0, una param1, ft param2);

    abstract void applyDirectionalLightsEnabled(byte param0);

    abstract float pixelCenterOffset(byte param0);

    final void initializeHardwareResources(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        this.field_N = new GpuTexture[this.field_Vb];
        this.field_hc = new AffineTransform3D[this.field_Vb];
        this.field_db = new ica[this.field_Vb];
        this.field_v = new ura[this.field_Vb];
        this.field_mc = new ica[this.field_Vb];
        int var2 = 0;
        if (param0 > -70) {
          this.field_zb = false;
        }
        while (var2 < this.field_Vb) {
          this.field_db[var2] = iw.field_c;
          this.field_mc[var2] = iw.field_c;
          this.field_v[var2] = DualLinkNode.field_h;
          this.field_hc[var2] = new AffineTransform3D();
          var2++;
        }
        this.field_ib = new SceneLight[-2 + this.field_e];
        this.field_Jb = (GpuTexture) ((Object) this.createTexture2D(1, 1, SwitchableId.field_a, (byte) -63, una.field_g));
        this.useHeap(new to(262144));
        this.field_Db = this.createVertexLayout(new ne[]{new ne(new gj[]{gj.field_p, gj.field_n})}, 0);
        this.createVertexLayout(new ne[]{new ne(new gj[]{gj.field_p, gj.field_b})}, 0);
        this.field_nc = this.createVertexLayout(new ne[]{new ne(gj.field_p), new ne(gj.field_b), new ne(gj.field_n), new ne(gj.field_e)}, 0);
        this.field_ob = this.createVertexLayout(new ne[]{new ne(gj.field_p), new ne(gj.field_b), new ne(gj.field_n)}, 0);
        this.field_cc = new HardwareModel(this, 0, 0, false, false);
        this.field_tb = new HardwareModel(this, 0, 0, true, true);
        this.field_gc = new HardwareModel(this, 0, 0, false, false);
        this.field_W = new HardwareModel(this, 0, 0, true, true);
        this.field_fb = new HardwareModel(this, 0, 0, false, false);
        this.field_E = new HardwareModel(this, 0, 0, true, true);
        this.field_O = new HardwareModel(this, 0, 0, false, false);
        this.field_n = new HardwareModel(this, 0, 0, true, true);
        this.field_ec = new HardwareModel(this, 0, 0, false, false);
        this.field_tc = new HardwareModel(this, 0, 0, true, true);
        this.field_kb = new DynamicGeometryBuffer(this);
        this.field_z = this.createIndexBuffer(26, true);
        this.rebuildDeviceResources((byte) 6);
        this.field_Mb = new hk(this);
        this.field_sb[1] = this.createShaderEffect(1, 56);
        this.field_sb[2] = this.createShaderEffect(2, 48);
        this.field_sb[4] = this.createShaderEffect(4, 46);
        this.field_sb[5] = this.createShaderEffect(5, 53);
        this.field_sb[6] = this.createShaderEffect(6, 70);
        this.field_sb[7] = this.createShaderEffect(7, 54);
        this.field_sb[3] = this.createShaderEffect(3, 66);
        this.field_sb[8] = this.createShaderEffect(8, 100);
        this.field_sb[9] = this.createShaderEffect(9, 76);
        if (!this.field_sb[2].isSupported(1185)) {
          this.field_sb[2] = this.createShaderEffect(0, 105);
        }
        if (!this.field_sb[4].isSupported(1185)) {
          this.field_sb[4] = this.field_sb[2];
        }
        if (!this.field_sb[8].isSupported(1185)) {
          this.field_sb[8] = this.field_sb[4];
        }
        if (!this.field_sb[9].isSupported(1185)) {
          this.field_sb[9] = this.field_sb[8];
        }
        this.resetDriverState(-29040);
        this.la();
        this.copyFrontToBack();
    }

    abstract void setColorCombineSource(fp param0, int param1, int param2, boolean param3, boolean param4);

    private final void createCircleBuffer(byte param0) {
        int var5 = 0;
        int var2;
        jaclib.memory.Buffer var3;
        jaclib.memory.Stream var4;
        double var6;
        float var8;
        float var9;
        int var10;
        var10 = TombRacer.field_G ? 1 : 0;
        this.field_hb = this.createVertexBuffer(6, false);
        this.field_hb.allocate(3096, 12, true);
        if (param0 < 14) {
          this.field_B = -1.9750553369522095f;
        }
        var2 = 0;
        scanLoop1: while (true) {
          if (var2 < 4) {
            var3 = this.field_hb.mapBuffer(-15730, true);
            if (var3 != null) {
              var4 = this.streamForBuffer(var3, 125);
              var4.b(0.0f);
              var4.b(0.0f);
              var4.b(0.0f);
              for (var5 = 0; var5 <= 256; var5++) {
                var6 = (double)(var5 * 2) * 3.141592653589793 / 256.0;
                var8 = (float)Math.cos(var6);
                var9 = (float)Math.sin(var6);
                if (jaclib.memory.Stream.b()) {
                  var4.b(var9);
                  var4.b(var8);
                  var4.b(0.0f);
                } else {
                  var4.a(var9);
                  var4.a(var8);
                  var4.a(0.0f);
                }
              }
              var4.a();
              if (this.field_hb.unmapBuffer(true)) {
                break scanLoop1;
              }
            }
            var2++;
            continue;
          }
          break;
        }
        this.field_Z = this.createVertexLayout(new ne[]{new ne(gj.field_p)}, 0);
        return;
    }

    final void setDepthTestEnabled(int param0, boolean param1) {
        if ((!this.field_wc ? 1 : 0) == (param1 ? 1 : 0)) {
          this.field_wc = param1 ? true : false;
          this.applyDepthTest((byte) -69);
          this.field_rb = this.field_rb & -32;
        }
        if (param0 != 0) {
          this.setBlendMode(0, 83);
        }
    }

    void applyPointLights(byte param0) {
        this.field_S = this.field_Bc;
        if (param0 != 92) {
          return;
        }
        this.field_Bc = 0;
    }

    final static boolean hasFlag1024(int param0, byte param1, int param2) {
        int var3 = -104 / ((-46 - param1) / 50);
        return (param2 & 1024) != 0 ? true : false;
    }

    final void setModelBufferSize(int param0) {
    }

    abstract void bindVertexLayout(mna param0, int param1);

    final AffineTransform3D getModelViewTransform(byte param0) {
        if (!this.field_p) {
          this.field_xc.setProduct(this.field_Qb, this.field_q, (byte) 127);
          this.field_p = true;
        }
        int var2 = 30 / ((param0 - 51) / 41);
        return this.field_xc;
    }

    private final void clipChanged(byte param0) {
        this.field_f = (float)(-this.field_Q + this.field_A);
        this.field_zc = (float)(this.field_K - this.field_kc);
        int var2 = -90 % ((-57 - param0) / 57);
        this.field_H = (float)(this.field_jb - this.field_kc);
        this.field_uc = (float)(-this.field_Q + this.field_C);
    }

    final int getMaxLights() {
        return -2 + this.field_e;
    }

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
        this.field_ic = new IntrusiveDeque();
        this.field_gb = true;
        this.field_q = new AffineTransform3D();
        this.field_bb = new AffineTransform3D();
        this.field_Y = new AffineTransform3D();
        this.field_Qb = new AffineTransform3D();
        this.field_rc = new AffineTransform3D();
        this.field_xc = new AffineTransform3D();
        this.field_C = 0;
        this.field_Jc = -1;
        this.field_Lb = new float[16];
        this.field_Eb = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_i = 0;
        this.field_ac = -1;
        this.field_Gb = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_fc = 1.0f;
        this.field_qc = false;
        this.field_vc = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.field_k = 3584;
        this.field_Kb = 1.0f;
        this.field_sc = 1.0f;
        this.field_dc = new float[]{0.0f, 0.0f, 1.0f, 0.0f};
        this.field_V = false;
        this.field_p = false;
        this.field_J = -1;
        this.field_m = true;
        this.field_Fc = false;
        this.field_Q = 0;
        this.field_M = new float[]{0.0f, 0.0f, -1.0f, 0.0f};
        this.field_Zb = true;
        this.field_Lc = 0;
        this.field_Sb = 128;
        this.field_s = false;
        this.field_nb = 0;
        this.field_ab = false;
        this.field_lb = GameScreen.field_b;
        this.field_Rb = 0;
        this.field_K = 0;
        this.field_D = 50;
        this.field_Ib = new float[16];
        this.field_pc = -1.0f;
        this.field_d = 3584.0f;
        this.field_Yb = true;
        this.field_r = ListTracksCommand.field_p;
        this.field_Ac = 0;
        this.field_jb = 0;
        this.field_yb = 1.0f;
        this.field_yc = false;
        this.field_j = -1.0f;
        this.field_R = new float[16];
        this.field_kc = 0;
        this.field_u = -1;
        this.field_T = this.field_vc;
        this.field_U = true;
        this.field_Nb = true;
        this.field_wb = 1;
        this.field_Kc = 0;
        this.field_Cc = 0;
        this.field_h = 512;
        this.field_qb = 0;
        this.field_zb = false;
        this.field_Cb = 3584.0f;
        this.field_A = 0;
        this.field_sb = new ShaderEffect[10];
        this.field_Ic = 512;
        this.field_Pb = 1.0f;
        this.field_l = false;
        this.field_wc = false;
        this.field_g = -1;
        this.field_Tb = 16777215;
        this.field_y = new jaclib.memory.Stream();
        this.field_Ab = new AffineTransform3D();
        try {
          try {
            this.field_Ub = param1;
            this.field_I = param3;
            this.field_Gc = param4;
            var11 = param0.getSize();
            this.field_Hb = var11.width;
            this.field_jc = var11.height;
            this.field_F = param5;
            CanvasImageBuffer.a(true, (byte) 107, false);
            if (this.field_c != null) {
              this.field_Ec = new HardwareTextureCache(this, this.field_c);
              this.field_P = new jagex3.graphics2.hw.NativeInterface(this.field_c.textureCount(-15061), this.field_F);
              for (var8 = 0; var8 < this.field_c.textureCount(-15061); var8++) {
                var9 = this.field_c.metadata((byte) -79, var8);
                if (var9 != null) {
                  this.field_P.initTextureMetrics(var8, var9.field_c, var9.field_i);
                }
              }
              return;
            }
            this.field_P = new jagex3.graphics2.hw.NativeInterface(0, this.field_F);
            this.field_Ec = null;
            return;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var7 = decompiledCaughtException;
            var7.printStackTrace();
            this.close(true);
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var7_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var7_ref;
          stackIn_12_1 = new StringBuilder().append("eo.<init>(");
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
          throw tba.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void setTextureTransformMode(ura param0, boolean param1) {
        try {
          if (param1) {
            this.field_Zb = false;
          }
          this.field_v[this.field_Cc] = param0;
          this.textureTransformChanged(0);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "eo.SG(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        if (!this.writeLineVertices((float)param1, (float)param2, (float)param3, (float)param4, (float)param5, (float)param0, (byte) -70)) {
          return;
        }
        this.useOrthographicProjection(-89);
        this.a((float)param6, -229);
        this.setFogEnabled(false, -103);
        this.setLightingEnabled(0, false);
        this.setDepthTestEnabled(0, false);
        this.setDepthWriteEnabled(false, (byte) 81);
        this.setBlendMode(param8, 1);
        this.bindMaterialTexture((byte) -80, false, false, -2);
        this.setTextureConstantColor(3625, param7);
        this.bindTexture(true, this.field_Jb);
        this.setTextureCombineMode((byte) -95, 1);
        this.setColorCombineSource(LruNodeCache.field_c, 0, -87);
        this.setAlphaCombineSource(0, false, LruNodeCache.field_c);
        this.resetModelTransform((byte) 104);
        this.setMultisampling(1, false);
        this.drawLineBuffer((byte) -70);
        this.setMultisampling(1, true);
        this.setAlphaCombineSource(0, false, ej.field_c);
        this.setColorCombineSource(ej.field_c, 0, -14);
    }

    final void setActiveTextureUnit(int param0, boolean param1) {
        if (param1) {
          this.field_F = -91;
        }
        if (param0 != this.field_Cc) {
          this.field_Cc = param0;
          this.applyActiveTexture(false);
        }
    }

    abstract mna createVertexLayout(ne[] param0, int param1);

    private final void buildPerspectiveProjection(int param0) {
        float[] var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float var7;
        float[] var8;
        if (!this.field_s) {
          var8 = this.field_R;
          var2 = var8;
          var3 = (float)(this.field_D * -this.field_Q) / (float)this.field_Ic;
          var4 = (float)(this.field_D * (this.field_Hb - this.field_Q)) / (float)this.field_Ic;
          var5 = (float)(this.field_kc * this.field_D) / (float)this.field_h;
          var6 = (float)((this.field_kc - this.field_jc) * this.field_D) / (float)this.field_h;
          if (var3 != var4 &&
            var5 != var6) {
            var7 = 2.0f * (float)this.field_D;
            var8[13] = 0.0f;
            this.field_lc = (float)this.field_k / (float)(this.field_D - this.field_k);
            var8[10] = (float)this.field_k / (float)(this.field_D - this.field_k);
            var8[9] = (var6 + var5) / (var5 - var6);
            var8[7] = 0.0f;
            this.field_G = (float)(this.field_D * this.field_k) / (float)(-this.field_k + this.field_D);
            var8[14] = (float)(this.field_D * this.field_k) / (float)(-this.field_k + this.field_D);
            var8[6] = 0.0f;
            var8[3] = 0.0f;
            var8[2] = 0.0f;
            var8[1] = 0.0f;
            var8[4] = 0.0f;
            var8[0] = var7 / (-var3 + var4);
            var8[15] = 0.0f;
            var8[12] = 0.0f;
            var8[11] = -1.0f;
            var8[5] = var7 / (-var6 + var5);
            var8[8] = (var4 + var3) / (var4 - var3);
          } else {
            var8[13] = 0.0f;
            var8[8] = 0.0f;
            var8[4] = 0.0f;
            var8[15] = 1.0f;
            var8[3] = 0.0f;
            var8[10] = 1.0f;
            var8[6] = 0.0f;
            var8[0] = 1.0f;
            var8[7] = 0.0f;
            var8[9] = 0.0f;
            var8[2] = 0.0f;
            var8[11] = 0.0f;
            var8[14] = 0.0f;
            var8[5] = 1.0f;
            var8[1] = 0.0f;
            var8[12] = 0.0f;
          }
          this.updateProjectionDepthTerms(-30801);
          this.field_s = true;
        }
        if (param0 != 7) {
          this.field_M = (float[]) null;
        }
    }

    abstract GpuTexture2D createByteTexture2D(boolean param0, byte[] param1, int param2, int param3, int param4, int param5, ft param6, int param7);

    final void la() {
        this.field_K = 0;
        this.field_A = 0;
        this.field_C = this.field_Hb;
        this.field_jb = this.field_jc;
        if (this.field_Wb) {
          this.field_Wb = false;
          this.applyScissorEnabled((byte) -24);
        }
        this.clipChanged((byte) -120);
    }

    final boolean supportsHeap() {
        return true;
    }

    final void setClip(int param0, int param1, int param2, int param3) {
        if (param0 <= 0 && -1 + this.field_Hb <= param2 && param1 <= 0 &&
          this.field_jc - 1 <= param3) {
          this.la();
          return;
        }
        this.field_C = param2 <= this.field_Hb ? param2 : 0;
        this.field_A = param0 < 0 ? 0 : param0;
        this.field_jb = param3 > this.field_Hb ? 0 : param3;
        this.field_K = 0 > param1 ? 0 : param1;
        if (!this.field_Wb) {
          this.field_Wb = true;
          this.applyScissorEnabled((byte) 123);
        }
        this.applyScissor(-3335);
        this.clipChanged((byte) 80);
    }

    private final void applyAllRenderState(byte param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        this.applyAmbientLightColor(0);
        this.applyDirectionalLightColors(40);
        this.applyLighting((byte) -102);
        this.applyPointLights((byte) 92);
        this.applyLightPositions(-71);
        this.uploadDirectionalLights((byte) -78);
        this.applyDirectionalLightsEnabled((byte) -21);
        this.applyDepthTest((byte) -69);
        this.applyDepthWrite((byte) -126);
        this.applyFogEnabled(2);
        this.applyFogParameters(1);
        if (param0 < 83) {
          this.field_nb = 104;
        }
        this.applyBlendEnabled(-27581);
        this.applyBlendFactors(false);
        this.applyAlphaTest(-104);
        for (var2 = -1 + this.field_Vb; var2 >= 0; var2--) {
          this.setActiveTextureUnit(var2, false);
          this.applyColorCombineOperation(-3485);
          this.applyAlphaCombineOperation((byte) -23);
          this.resetTextureTransform((byte) 114);
        }
        this.applyTextureConstantColor(-48);
        this.applyViewport((byte) -116);
        this.applyProjectionMatrix((byte) 119);
        this.applyModelMatrix((byte) -73);
        this.applyViewMatrix(false);
    }

    final static void q(int param0) {
        jsa.a(false, 17);
        int var1 = 36 % ((param0 + 38) / 62);
    }

    final int underwaterFogColor(int param0) {
        if (param0 != 65280) {
          this.field_tc = (HardwareModel) null;
        }
        return this.field_ac;
    }

    final GameFont createFont(FontMetrics param0, SpriteData[] param1, boolean param2) {
        RuntimeException var4 = null;
        ca stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new ca(this, param0, param1, param2);
          return (GameFont) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("eo.I(");
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
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final SceneLight createLight(int param0, int param1, int param2, int param3, int param4, float param5) {
        return (SceneLight) ((Object) new HardwareSceneLight(param0, param1, param2, param3, param4, param5));
    }

    final int getActiveTextureUnit(byte param0) {
        if (param0 <= 82) {
          this.field_Lc = 103;
        }
        return this.field_Cc;
    }

    final AffineTransform3D getActiveTextureTransform(int param0) {
        if (param0 != 0) {
          this.a(-0.6965478658676147f, 12);
        }
        return this.field_hc[this.field_Cc];
    }

    final void intersectClip(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (this.field_A < param0) {
          var5 = 1;
          this.field_A = param0;
        }
        if (this.field_C > param2) {
          var5 = 1;
          this.field_C = param2;
        }
        if (param1 > this.field_K) {
          this.field_K = param1;
          var5 = 1;
        }
        if (this.field_jb > param3) {
          this.field_jb = param3;
          var5 = 1;
        }
        if (var5 != 0) {
          if (!this.field_Wb) {
            this.field_Wb = true;
            this.applyScissorEnabled((byte) 125);
          }
          this.applyScissor(-3335);
          this.clipChanged((byte) -125);
        }
    }

    final jaclib.memory.Stream streamForBuffer(jaclib.memory.Buffer param0, int param1) {
        RuntimeException var3 = null;
        jaclib.memory.Stream stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 124) {
            this.underwaterSurfaceHeight(false);
          }
          this.field_y.a(param0);
          stackIn_3_0 = this.field_y;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eo.RA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void drawPrimitives(int param0, iw param1, int param2, int param3);

    final int i() {
        return this.field_D;
    }

    final ToolkitModel createModel(ModelData param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        HardwareModel stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_1_0 = new HardwareModel(this, param0, param1, param3, param4, param2);
          return (ToolkitModel) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("eo.MB(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (!this.writeLineVertices((float)param1, (float)param2, (float)param3, (float)param4, (float)param5, (float)param0, (byte) -40)) {
          return;
        }
        this.usePerspectiveProjection((byte) -74);
        this.setFogEnabled(false, -68);
        this.setLightingEnabled(0, false);
        this.setDepthTestEnabled(0, false);
        this.setDepthWriteEnabled(false, (byte) 81);
        this.setBlendMode(param7, 1);
        this.bindMaterialTexture((byte) -80, false, false, -2);
        this.setTextureConstantColor(3625, param6);
        this.bindTexture(true, this.field_Jb);
        this.setTextureCombineMode((byte) -12, 1);
        this.setColorCombineSource(LruNodeCache.field_c, 0, -117);
        this.setAlphaCombineSource(0, false, LruNodeCache.field_c);
        this.resetModelTransform((byte) 119);
        this.setMultisampling(1, false);
        this.drawLineBuffer((byte) -70);
        this.setMultisampling(1, true);
        this.setAlphaCombineSource(0, false, ej.field_c);
        this.setColorCombineSource(ej.field_c, 0, -85);
    }

    final void setTextureCombineOperations(ica param0, byte param1, ica param2) {
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
          if (param1 != -110) {
            return;
          }
          if (this.field_mc[this.field_Cc] != param2) {
            this.field_mc[this.field_Cc] = param2;
            var4_int = 1;
            this.applyColorCombineOperation(-3485);
          }
          if (param0 != this.field_db[this.field_Cc]) {
            this.field_db[this.field_Cc] = param0;
            this.applyAlphaCombineOperation((byte) -23);
            var4_int = 1;
          }
          if (var4_int != 0) {
            this.field_rb = this.field_rb & -30;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("eo.UF(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    abstract void applyLighting(byte param0);

    private final void modelViewChanged(byte param0) {
        this.field_p = false;
        if (null != this.field_pb) {
          this.field_pb.onModelMatrixChanged(true);
        }
        this.applyViewMatrix(false);
        if (param0 != 94) {
          this.i();
        }
    }

    abstract void setMultisampling(int param0, boolean param1);

    final int underwaterFogDivisor(boolean param0) {
        if (param0) {
          this.field_nc = (mna) null;
        }
        return this.field_u;
    }

    abstract GpuTexture2D createFloatTexture2D(ft param0, int param1, int param2, boolean param3, int param4, int param5, float[] param6, int param7);

    private final void textureTransformChanged(int param0) {
        this.applyTextureMatrix(param0);
        if (null != this.field_pb) {
          this.field_pb.onTextureMatrixChanged(true);
        }
    }

    abstract void applyProjectionMatrix(byte param0);

    final void releaseDeviceResources(int param0) {
        java.awt.Canvas var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        Enumeration var2 = this.field_oc.keys();
        while (var2.hasMoreElements()) {
          var3 = (java.awt.Canvas) (var2.nextElement());
          this.releaseSurface(this.field_oc.get(var3), false, var3);
        }
        this.field_xb.close(12574);
        this.field_cb.close(12574);
        if (param0 != 6) {
          this.setDepthWriteEnabled(false, (byte) -31);
        }
        this.field_hb.close(12574);
        this.field_tb.releaseBuffers((byte) 112);
        this.field_W.releaseBuffers((byte) 126);
        this.field_E.releaseBuffers((byte) 112);
        this.field_n.releaseBuffers((byte) 114);
        this.field_tc.releaseBuffers((byte) 122);
        this.field_kb.release((byte) 86);
        this.field_z.close(param0 ^ 12568);
    }

    final GpuTexture2D createByteTexture2D(int param0, byte[] param1, boolean param2, ft param3, int param4, int param5) {
        RuntimeException var7 = null;
        GpuTexture2D stackIn_2_0 = null;
        GpuTexture2D stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < -71) {
            stackIn_4_0 = this.createByteTexture2D(param2, param1, 0, param0, 1, 0, param3, param5);
            return stackIn_4_0;
          }
          stackIn_2_0 = (GpuTexture2D) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("eo.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final ToolkitSprite createSprite(SpriteData param0, boolean param1) {
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
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0.field_i != 0 &&
            param0.field_a != 0) {
            var12 = new int[param0.field_i * param0.field_a];
            var11 = var12;
            var4 = var11;
            var5 = 0;
            var6 = 0;
            if (null != param0.field_h) {
              for (var7 = 0; param0.field_a > var7; var7++) {
                for (var8 = 0; param0.field_i > var8; var8++) {
                  incrementValue$2 = var6;
                  var6++;
                  var4[incrementValue$2] = WallTile.bitwiseOr(param0.field_h[var5] << 24, param0.field_g[SnakePitBehaviour.bitwiseAnd((int) param0.field_f[var5], 255)]);
                  var5++;
                }
              }
            } else {
              for (var7 = 0; var7 < param0.field_a; var7++) {
                for (var8 = 0; var8 < param0.field_i; var8++) {
                  incrementValue$0 = var5;
                  var5++;
                  var9 = param0.field_g[255 & param0.field_f[incrementValue$0]];
                  incrementValue$1 = var6;
                  var6++;
                  stackIn_18_0 = var4;
                  stackIn_18_1 = incrementValue$1;
                  if (0 == var9) {
                    stackIn_19_2 = 0;
                  } else {
                    stackIn_19_2 = WallTile.bitwiseOr(-16777216, var9);
                  }
                  stackIn_18_0[stackIn_18_1] = stackIn_19_2;
                }
              }
            }
            var3 = this.createSpriteCopy(var12, param0.field_a, 117, param0.field_i, param0.field_i, 0);
          } else {
            var3 = this.createSpriteCopy(new int[]{0}, 1, 81, 1, 1, 0);
          }
          var3.setInsets(param0.field_d, param0.field_c, param0.field_b, param0.field_e);
          stackIn_23_0 = var3;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("eo.EB(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final void useHeap(za param0) {
        try {
          this.field_t = ((to) (param0)).field_h;
          this.field_o = this.field_t.a(32768, false);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "eo.FB(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void applyScissor(int param0);

    final int XA() {
        return this.field_k;
    }

    abstract void bindVertexBuffer(int param0, int param1, qm param2);

    static {
        field_w = new fta();
    }
}
