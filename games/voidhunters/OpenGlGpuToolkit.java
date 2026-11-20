/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class OpenGlGpuToolkit extends GpuToolkit {
    static Random field_Jc;
    static int field_Oc;
    private IntrusiveDeque field_yc;
    private jaggl.OpenGL field_zc;
    private IntrusiveDeque field_Ic;
    private IntrusiveDeque field_Uc;
    private IntrusiveDeque field_Cc;
    private IntrusiveDeque field_bd;
    private IntrusiveDeque field_Ec;
    private IntrusiveDeque field_Gc;
    private boolean field_cd;
    private boolean field_Kc;
    private long field_Tc;
    jaggl.MapBuffer field_Sc;
    private int field_Rc;
    private boolean field_Lc;
    private boolean field_Yc;
    private OpenGlVertexBuffer[] field_Pc;
    private boolean field_Dc;
    jaggl.MapBuffer field_Vc;
    boolean field_Ac;
    private int field_Fc;
    int[] field_Wc;
    private boolean field_Zc;
    private boolean field_Xc;
    private String field_Bc;
    boolean field_Hc;
    boolean field_Qc;
    boolean field_Mc;
    private String field_ad;
    int field_Nc;

    final void setVertexBuffer(byte param0, GpuVertexBuffer param1, int param2) {
        try {
          if (param0 != -6) {
            this.field_Bc = (String) null;
          }
          this.field_Pc[param2] = (OpenGlVertexBuffer) (param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jp.VC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void setTextureCoordinateMode(byte param0, TextureCoordinateMode param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -111) {
            return;
          }
          if (meb.field_d != param1) {
            var3_int = gm.toOpenGlTextureCoordinateMode(param1, 9216);
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
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("jp.UC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void drawPrimitive(PrimitiveType param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = VoidHunters.field_G;
        try {
          var5_int = -83 / ((-4 - param3) / 32);
          if (TextureFilterMode.field_b != param0) {
            if (GetFightersPerPlayerMaximum.field_o != param0) {
              if (di.field_i == param0) {
                var6 = 4;
                var7 = 3 * param2;
              } else {
                if (param0 != UiViewport.field_v) {
                  if (param0 != GetUseTriFill.field_o) {
                    var7 = param2;
                    var6 = 0;
                  } else {
                    var7 = 2 + param2;
                    var6 = 5;
                  }
                } else {
                  var6 = 6;
                  var7 = param2 + 2;
                }
              }
            } else {
              var7 = param2 + 1;
              var6 = 3;
            }
          } else {
            var7 = param2 * 2;
            var6 = 1;
          }
          jaggl.OpenGL.glDrawArrays(var6, param1, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("jp.DE(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void applyBlendingEnabled(byte param0) {
        if (param0 != -56) {
          this.field_Lc = false;
        }
        if (!this.blendingEnabled) {
          jaggl.OpenGL.glDisable(3042);
        } else {
          jaggl.OpenGL.glEnable(3042);
        }
    }

    final void applyScissorEnabled(byte param0) {
        if (param0 != 81) {
          this.clearDepth();
        }
        if (this.scissorEnabled) {
          jaggl.OpenGL.glEnable(3089);
        } else {
          jaggl.OpenGL.glDisable(3089);
        }
    }

    final GpuIndexBuffer createIndexBuffer(byte param0, boolean param1) {
        if (param0 != -19) {
          return (GpuIndexBuffer) null;
        }
        return (GpuIndexBuffer) ((Object) new OpenGlIndexBuffer(this, GpuDataType.UNSIGNED_SHORT, param1));
    }

    final boolean enableBloom() {
        return false;
    }

    final synchronized void b(int param0, int param1, boolean param2) {
        if (param2) {
          ToolkitSprite var5 = (ToolkitSprite) null;
          this.setRenderTarget((ToolkitSprite) null, true);
        }
        IntegerNode var4 = new IntegerNode(param1);
        var4.key = (long)param0;
        this.field_Ic.addLast(-10258, var4);
    }

    final void setMultisampleEnabled(int param0, boolean param1) {
        if (!param1) {
          jaggl.OpenGL.glDisable(32925);
        } else {
          jaggl.OpenGL.glEnable(32925);
        }
        if (param0 >= -14) {
          this.applyBlendingEnabled((byte) -120);
        }
    }

    final void clearDepth() {
        this.setDepthWriteEnabled((byte) -74, true);
        jaggl.OpenGL.glClear(256);
    }

    final void releaseResources() {
        super.releaseResources();
        if (this.field_zc != null) {
          this.field_zc.detachFromCurrentThread();
          this.field_zc.release();
          this.field_zc = null;
        }
    }

    final GpuVertexDeclaration createVertexDeclaration(int param0, VertexStreamLayout[] param1) {
        RuntimeException var3 = null;
        OpenGlVertexDeclaration stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10) {
            this.field_Yc = true;
          }
          stackIn_3_0 = new OpenGlVertexDeclaration(param1);
          return (GpuVertexDeclaration) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jp.NC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void applyDirectionalLightsEnabled(boolean param0) {
        if (param0) {
          this.field_Cc = (IntrusiveDeque) null;
        }
        if (this.field_g) {
          jaggl.OpenGL.glEnable(16384);
          jaggl.OpenGL.glEnable(16385);
        } else {
          jaggl.OpenGL.glDisable(16384);
          jaggl.OpenGL.glDisable(16385);
        }
    }

    final void applyDepthTestEnabled(int param0) {
        if (param0 != 12614) {
          this.applyDepthWriteEnabled(-43);
        }
        if (this.depthTestEnabled) {
          jaggl.OpenGL.glEnable(2929);
        } else {
          jaggl.OpenGL.glDisable(2929);
        }
    }

    final void beginPostProcessing(int param0, int param1, int param2, int param3) {
    }

    final boolean isBloomEnabled() {
        return false;
    }

    public static void clearSharedReferences(int param0) {
        field_Jc = null;
        if (param0 != 771) {
          field_Oc = -126;
        }
    }

    final void initializeRenderState(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        for (var2 = -1 + this.field_L; var2 >= 0; var2--) {
          jaggl.OpenGL.glActiveTexture(var2 + 33984);
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
        for (var3 = 0; 8 > var3; var3++) {
          var4 = var3 + 16384;
          jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
          jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
          jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
        }
        if (param0 < 106) {
          this.field_Gc = (IntrusiveDeque) null;
        }
        jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
        jaggl.OpenGL.glFogi(2917, 9729);
        jaggl.OpenGL.glHint(3156, 4353);
        this.field_zc.setSwapInterval(0);
        super.initializeRenderState(117);
    }

    final GpuCubeTexture createCubeTexture(boolean param0, int param1, int[][] param2, int param3) {
        RuntimeException var5 = null;
        OpenGlGpuCubeTexture stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -5210) {
            this.applyPostProcessing();
          }
          stackIn_3_0 = new OpenGlGpuCubeTexture(this, param3, param0, param2);
          return (GpuCubeTexture) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("jp.TC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final void applyLightingEnabled(int param0) {
        if (this.lightingEnabled &&
          !this.lightingSuppressed) {
          jaggl.OpenGL.glEnable(2896);
        } else {
          jaggl.OpenGL.glDisable(2896);
        }
        if (param0 >= -15) {
          this.field_bd = (IntrusiveDeque) null;
        }
    }

    final GpuTexture2D createTexture2DFromPixels(int param0, boolean param1, int[] param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        OpenGlGpuTexture2D var9 = null;
        GpuTexture2D stackIn_2_0 = null;
        OpenGlGpuRectangleTexture stackIn_9_0 = null;
        OpenGlGpuTexture2D stackIn_11_0 = null;
        OpenGlGpuTexture2D stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param5) {
            stackIn_2_0 = (GpuTexture2D) null;
            return stackIn_2_0;
          }
          if (!this.field_Xc && (!bd.a(param0, (byte) -95) ||
            !bd.a(param3, (byte) -95))) {
            if (this.field_Zc) {
              stackIn_9_0 = new OpenGlGpuRectangleTexture(this, param0, param3, param2, param6, param4);
              return (GpuTexture2D) ((Object) stackIn_9_0);
            }
            var9 = new OpenGlGpuTexture2D(this, ComponentAttachmentPlan.field_d, GpuDataType.UNSIGNED_BYTE, GetSalvoaim.a(param0, (byte) -100), GetSalvoaim.a(param3, (byte) -121));
            var9.updatePixels(0, param3, param0, param6, param4, param2, 0, (byte) -104);
            stackIn_11_0 = var9;
            return (GpuTexture2D) ((Object) stackIn_11_0);
          }
          stackIn_13_0 = new OpenGlGpuTexture2D(this, param0, param3, param1, param2, param6, param4);
          return (GpuTexture2D) ((Object) stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("jp.ED(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void I(byte param0) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        if (this.field_Dc) {
          jaggl.OpenGL.glPopMatrix();
        }
        var2 = -41 % ((param0 - 24) / 42);
        if (!this.projectionMode.usesViewTransform(-12178)) {
          if (this.field_ec) {
            jaggl.OpenGL.glLoadIdentity();
          } else {
            jaggl.OpenGL.glLoadMatrixf(this.modelTransform.writeColumnMajorMatrix(GetDebrisMax.field_q, (byte) 114), 0);
          }
          this.field_Dc = false;
        } else {
          if (!this.field_cd) {
            jaggl.OpenGL.glLoadMatrixf(this.viewTransform.writeColumnMajorMatrix(GetDebrisMax.field_q, (byte) 114), 0);
            this.field_cd = true;
            this.applyDirectionalLightDirections(3);
            this.applyPointLights(73);
          }
          if (!this.field_ec) {
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glMultMatrixf(this.modelTransform.writeColumnMajorMatrix(GetDebrisMax.field_q, (byte) 114), 0);
            this.field_Dc = true;
          } else {
            this.field_Dc = false;
          }
        }
    }

    final void bindFramebuffer(Framebuffer param0) {
    }

    final void applyAmbientLight(boolean param0) {
        GetPhasedEnergyBeamFireForce.field_o[2] = this.ambientIntensity * this.lightBlue;
        GetPhasedEnergyBeamFireForce.field_o[1] = this.ambientIntensity * this.lightGreen;
        GetPhasedEnergyBeamFireForce.field_o[0] = this.ambientIntensity * this.lightRed;
        if (!param0) {
          field_Oc = -95;
        }
        GetPhasedEnergyBeamFireForce.field_o[3] = 1.0f;
        jaggl.OpenGL.glLightModelfv(2899, GetPhasedEnergyBeamFireForce.field_o, 0);
    }

    final synchronized void b(int param0, int param1, int param2) {
        if (param1 <= 89) {
          this.field_Gc = (IntrusiveDeque) null;
        }
        IntegerNode var4 = new IntegerNode(param2);
        var4.key = (long)param0;
        this.field_Uc.addLast(-10258, var4);
    }

    final Framebuffer createFramebuffer(ColorBuffer param0, DepthBuffer param1) {
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
          return (Framebuffer) (stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("jp.OB(");
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void clearColor(int param0) {
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 24) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final void writePixels(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
          this.selectScreenProjection((byte) 101);
          this.setTexture((GpuTexture) null, -111);
          this.setBlendMode(71, 0);
          this.resetModelTransform(true);
          jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
          jaggl.OpenGL.glRasterPos2i(param0, param1);
          jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_Nc, param4, param5);
          jaggl.OpenGL.glRasterPos2i(0, 0);
          jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jp.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final GpuVertexBuffer createVertexBuffer(boolean param0, int param1) {
        if (param1 != 3) {
          return (GpuVertexBuffer) null;
        }
        return (GpuVertexBuffer) ((Object) new OpenGlVertexBuffer(this, param0));
    }

    final void applyAlphaTestEnabled(int param0) {
        if (!this.alphaTestEnabled) {
          jaggl.OpenGL.glDisable(3008);
        } else {
          jaggl.OpenGL.glEnable(3008);
        }
        if (param0 != 17634) {
          this.releaseResources();
        }
    }

    final GpuMaterialEffect createMaterialEffect(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        var3 = -123 / ((-34 - param0) / 63);
        var4 = param1;
        if (3 == var4) {
          return (GpuMaterialEffect) ((Object) new OpenGlUnderwaterMaterialEffect(this, this.field_Ab));
        }
        if (var4 == 4) {
          return (GpuMaterialEffect) ((Object) new OpenGlTransparentWaterEffect(this, this.field_Ab, this.field_Mb));
        }
        if (var4 != 8) {
          return super.createMaterialEffect((byte) 54, param1);
        }
        return (GpuMaterialEffect) ((Object) new OpenGlEnvironmentMappedWaterEffect(this, this.field_Ab, this.field_Mb));
    }

    final void setRgbCombineSource(boolean param0, int param1, boolean param2, TextureCombineSource param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          jaggl.OpenGL.glTexEnvi(8960, param4 + 34176, qg.toOpenGlCombineSource(param3, false));
          if (param1 != -21115) {
            this.applyFogParameters(71);
          }
          if (!param0) {
            stackIn_9_0 = 8960;
            stackIn_9_1 = 34192 + param4;
            if (param2) {
              stackIn_10_2 = 769;
            } else {
              stackIn_10_2 = 768;
            }
            jaggl.OpenGL.glTexEnvi(stackIn_9_0, stackIn_9_1, stackIn_10_2);
          } else {
            stackIn_5_0 = 8960;
            stackIn_5_1 = 34192 + param4;
            if (!param2) {
              stackIn_6_2 = 770;
            } else {
              stackIn_6_2 = 771;
            }
            jaggl.OpenGL.glTexEnvi(stackIn_5_0, stackIn_5_1, stackIn_6_2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("jp.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final void applyDepthWriteEnabled(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -41) {
          this.field_Cc = (IntrusiveDeque) null;
        }
        stackIn_6_0 = (this.field_M) && (this.depthWriteEnabled);
        jaggl.OpenGL.glDepthMask(stackIn_6_0);
    }

    final void setAlphaCombineSource(boolean param0, byte param1, TextureCombineSource param2, int param3) {
        GpuVertexDeclaration var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          jaggl.OpenGL.glTexEnvi(8960, param3 + 34184, qg.toOpenGlCombineSource(param2, false));
          stackIn_2_0 = 8960;
          stackIn_2_1 = param3 + 34200;
          if (param0) {
            stackIn_3_2 = 771;
          } else {
            stackIn_3_2 = 770;
          }
          jaggl.OpenGL.glTexEnvi(stackIn_2_0, stackIn_2_1, stackIn_3_2);
          if (param1 != 94) {
            var6 = (GpuVertexDeclaration) null;
            this.setVertexDeclaration(-51, (GpuVertexDeclaration) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jp.WC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean supportsTexture2DFormat(int param0, TextureFormat param1, GpuDataType param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 43 % ((-77 - param0) / 49);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("jp.HD(").append(param0).append(',');
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void applyFogEnabled(int param0) {
        if (param0 != 1) {
          this.setBloomParameters(0.3592780530452728f, 1.5894063711166382f, 0.25299444794654846f);
        }
        if (this.effectFogEnabled &&
          this.fogEnabled &&
          this.field_j >= 0) {
          jaggl.OpenGL.glEnable(2912);
        } else {
          jaggl.OpenGL.glDisable(2912);
        }
    }

    final void setRenderTarget(ToolkitSprite param0, boolean param1) {
    }

    final float getPixelOffset(byte param0) {
        if (param0 > -90) {
          this.field_Yc = false;
        }
        return 0.0f;
    }

    final void applyDirectionalLightColors(byte param0) {
        GetPhasedEnergyBeamFireForce.field_o[2] = this.lightBlue * this.sunIntensity;
        GetPhasedEnergyBeamFireForce.field_o[1] = this.sunIntensity * this.lightGreen;
        GetPhasedEnergyBeamFireForce.field_o[0] = this.lightRed * this.sunIntensity;
        GetPhasedEnergyBeamFireForce.field_o[3] = 1.0f;
        jaggl.OpenGL.glLightfv(16384, 4609, GetPhasedEnergyBeamFireForce.field_o, 0);
        GetPhasedEnergyBeamFireForce.field_o[1] = this.lightGreen * -this.antiSunIntensity;
        if (param0 <= 4) {
          return;
        }
        GetPhasedEnergyBeamFireForce.field_o[2] = -this.antiSunIntensity * this.lightBlue;
        GetPhasedEnergyBeamFireForce.field_o[3] = 1.0f;
        GetPhasedEnergyBeamFireForce.field_o[0] = this.lightRed * -this.antiSunIntensity;
        jaggl.OpenGL.glLightfv(16385, 4609, GetPhasedEnergyBeamFireForce.field_o, 0);
    }

    final void applyViewTransform(int param0) {
        this.field_cd = false;
        this.I((byte) -105);
        if (param0 != 17891) {
          this.restoreDefaultFramebuffer();
        }
    }

    final void applyProjectionMatrix(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        if (param0 >= -17) {
          this.applyBlendFunction((byte) -2);
        }
        jaggl.OpenGL.glLoadMatrixf(this.projectionMatrix, 0);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final static float[] a(float[] param0, int param1, int param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new float[param1];
          var3 = var4;
          ArrayOperations.copy(param0, 0, var4, 0, param1);
          if (param2 != 7353) {
            field_Oc = -20;
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("jp.QD(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void updateFrame(int param0) {
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int var2;
        int var4;
        IntegerNode var5;
        IntegerNode var6;
        IntegerNode var7;
        IntegerNode var8;
        IntegerNode var9;
        IntrusiveNode var10;
        IntrusiveNode var11;
        IntegerNode var12;
        var4 = VoidHunters.field_G;
        var2 = 0;
        param0 = param0 & 2147483647;
        while (!this.field_Ic.isEmpty(112)) {
          var5 = (IntegerNode) (this.field_Ic.removeFirst(true));
          incrementValue$3 = var2;
          var2++;
          SystemNanoClock.field_c[incrementValue$3] = (int)var5.key;
          this.field_ob = this.field_ob - var5.value;
          if (1000 != var2) {
            continue;
          }
          jaggl.OpenGL.glDeleteBuffersARB(var2, SystemNanoClock.field_c, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteBuffersARB(var2, SystemNanoClock.field_c, 0);
          var2 = 0;
        }
        while (!this.field_Uc.isEmpty(120)) {
          var6 = (IntegerNode) (this.field_Uc.removeFirst(true));
          incrementValue$2 = var2;
          var2++;
          SystemNanoClock.field_c[incrementValue$2] = (int)var6.key;
          this.field_Nb = this.field_Nb - var6.value;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteTextures(var2, SystemNanoClock.field_c, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteTextures(var2, SystemNanoClock.field_c, 0);
          var2 = 0;
        }
        while (!this.field_Cc.isEmpty(112)) {
          var7 = (IntegerNode) (this.field_Cc.removeFirst(true));
          incrementValue$1 = var2;
          var2++;
          SystemNanoClock.field_c[incrementValue$1] = var7.value;
          if (1000 != var2) {
            continue;
          }
          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, SystemNanoClock.field_c, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, SystemNanoClock.field_c, 0);
          var2 = 0;
        }
        while (!this.field_bd.isEmpty(123)) {
          var8 = (IntegerNode) (this.field_bd.removeFirst(true));
          incrementValue$0 = var2;
          var2++;
          SystemNanoClock.field_c[incrementValue$0] = (int)var8.key;
          this.field_mb = this.field_mb - var8.value;
          if (var2 != 1000) {
            continue;
          }
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, SystemNanoClock.field_c, 0);
          var2 = 0;
        }
        if (var2 > 0) {
          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, SystemNanoClock.field_c, 0);
          var2 = 0;
        }
        while (!this.field_yc.isEmpty(-94)) {
          var9 = (IntegerNode) (this.field_yc.removeFirst(true));
          jaggl.OpenGL.glDeleteLists((int)var9.key, var9.value);
        }
        while (!this.field_Ec.isEmpty(-96)) {
          var10 = this.field_Ec.removeFirst(true);
          jaggl.OpenGL.glDeleteProgramARB((int)var10.key);
        }
        while (!this.field_Gc.isEmpty(127)) {
          var11 = this.field_Gc.removeFirst(true);
          jaggl.OpenGL.glDeleteObjectARB(var11.key);
        }
        while (!this.field_yc.isEmpty(-126)) {
          var12 = (IntegerNode) (this.field_yc.removeFirst(true));
          jaggl.OpenGL.glDeleteLists((int)var12.key, var12.value);
        }
        if (100663296 < this.getGpuMemoryUsage(3554) &&
          (this.field_Tc + 60000L) < wt.a(false)) {
          System.gc();
          this.field_Tc = wt.a(false);
        }
        super.updateFrame(param0);
    }

    final GpuTexture3D createTexture3D(int param0, int param1, byte[] param2, TextureFormat param3, int param4, int param5) {
        RuntimeException var7 = null;
        GpuTexture3D stackIn_2_0 = null;
        OpenGlGpuTexture3D stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 == -16539) {
            stackIn_4_0 = new OpenGlGpuTexture3D(this, param3, param4, param0, param1, param2);
            return (GpuTexture3D) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (GpuTexture3D) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("jp.BC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final GpuTexture2D createTexture2DFromFloats(TextureFormat param0, float[] param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7) {
        RuntimeException var9 = null;
        TextureCoordinateMode var10 = null;
        OpenGlGpuTexture2D var11 = null;
        OpenGlGpuTexture2D stackIn_7_0 = null;
        OpenGlGpuTexture2D stackIn_10_0 = null;
        OpenGlGpuRectangleTexture stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param6) {
            var10 = (TextureCoordinateMode) null;
            this.setTextureCoordinateMode((byte) -46, (TextureCoordinateMode) null);
          }
          if (!this.field_Xc && (!bd.a(param7, (byte) -95) ||
            !bd.a(param4, (byte) -95))) {
            if (this.field_Zc) {
              stackIn_12_0 = new OpenGlGpuRectangleTexture(this, param0, param7, param4, param1, param3, param5);
              return (GpuTexture2D) ((Object) stackIn_12_0);
            }
            var11 = new OpenGlGpuTexture2D(this, param0, GpuDataType.FLOAT, GetSalvoaim.a(param7, (byte) -125), GetSalvoaim.a(param4, (byte) -101));
            var11.updateFloatPixels(param4, param0, (byte) -51, param5, param1, 0, 0, param7, param3);
            stackIn_10_0 = var11;
            return (GpuTexture2D) ((Object) stackIn_10_0);
          }
          stackIn_7_0 = new OpenGlGpuTexture2D(this, param0, param7, param4, param2, param1, param3, param5);
          return (GpuTexture2D) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_15_0 = var9;
          stackIn_15_1 = new StringBuilder().append("jp.VD(");
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final DepthBuffer createDepthBuffer(int param0, int param1) {
        return null;
    }

    final void releaseSurface(java.awt.Canvas param0, Object param1, int param2) {
        Long var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var4 = (Long) (param1);
          this.field_zc.releaseSurface(param0, var4.longValue());
          if (param2 != 0) {
            this.applyDirectionalLightsEnabled(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_5_0 = var4_ref;
          stackIn_5_1 = new StringBuilder().append("jp.LC(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final void applyPointLights(int param0) {
        PointLight var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = VoidHunters.field_G;
        this.resetModelTransform(true);
        int var2 = 0;
        if (param0 <= 66) {
          return;
        }
        while (this.pointLightCount > var2) {
          var3 = this.pointLights[var2];
          var4 = var3.getColor(-118);
          var5 = 16386 + var2;
          var6 = var3.getIntensity(-392138175) / 255.0f;
          GetPhasedEnergyBeamFireForce.field_o[0] = (float)var3.getX((byte) -79);
          GetPhasedEnergyBeamFireForce.field_o[1] = (float)var3.getY(true);
          GetPhasedEnergyBeamFireForce.field_o[2] = (float)var3.getZ((byte) 62);
          GetPhasedEnergyBeamFireForce.field_o[3] = 1.0f;
          jaggl.OpenGL.glLightfv(var5, 4611, GetPhasedEnergyBeamFireForce.field_o, 0);
          GetPhasedEnergyBeamFireForce.field_o[0] = (float)dla.a(255, var4 >> 16) * var6;
          GetPhasedEnergyBeamFireForce.field_o[2] = (float)dla.a(255, var4) * var6;
          GetPhasedEnergyBeamFireForce.field_o[1] = var6 * (float)(dla.a(var4, 65382) >> 8);
          GetPhasedEnergyBeamFireForce.field_o[3] = 1.0f;
          jaggl.OpenGL.glLightfv(var5, 4609, GetPhasedEnergyBeamFireForce.field_o, 0);
          jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.getRadius(16777215) * var3.getRadius(16777215)));
          jaggl.OpenGL.glEnable(var5);
          var2++;
        }
        while (this.previousPointLightCount > var2) {
          jaggl.OpenGL.glDisable(var2 + 16386);
          var2++;
        }
        super.applyPointLights(75);
    }

    final synchronized void a(long param0, int param1) {
        IntrusiveNode var4 = new IntrusiveNode();
        var4.key = param0;
        if (param1 != 0) {
          return;
        }
        this.field_Gc.addLast(-10258, var4);
    }

    final Object createSurface(byte param0, java.awt.Canvas param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Long stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_long = this.field_zc.prepareSurface(param1);
          if (param0 > -21) {
            stackIn_2_0 = (Object) null;
            return stackIn_2_0;
          }
          if (-1L == var3_long) {
            throw new RuntimeException();
          }
          stackIn_7_0 = new Long(var3_long);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jp.MD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void applyTextureTransform(int param0) {
        if (param0 != 0) {
          return;
        }
        jaggl.OpenGL.glMatrixMode(5890);
        if (SetGrappleDebris.field_o == this.textureTransformModes[this.activeTextureUnit]) {
          jaggl.OpenGL.glLoadIdentity();
        } else {
          jaggl.OpenGL.glLoadMatrixf(this.textureTransforms[this.activeTextureUnit].writeColumnMajorMatrix(GetDebrisMax.field_q, (byte) 114), 0);
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void applyTextureConstantColor(byte param0) {
        GetPhasedEnergyBeamFireForce.field_o[3] = (float)(this.textureConstantColor >>> 24) / 255.0f;
        GetPhasedEnergyBeamFireForce.field_o[2] = (float)dla.a(255, this.textureConstantColor) / 255.0f;
        GetPhasedEnergyBeamFireForce.field_o[1] = (float)dla.a(65280, this.textureConstantColor) / 65280.0f;
        if (param0 != -109) {
          TextureCoordinateMode var3 = (TextureCoordinateMode) null;
          this.setTextureCoordinateMode((byte) -64, (TextureCoordinateMode) null);
        }
        GetPhasedEnergyBeamFireForce.field_o[0] = (float)dla.a(this.textureConstantColor, 16711680) / 16711680.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, GetPhasedEnergyBeamFireForce.field_o, 0);
    }

    final void applyAlphaCombineOperation(byte param0) {
        if (param0 < 109) {
          return;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34162, tc.toOpenGlCombineOperation(8448, this.alphaCombineOperations[this.activeTextureUnit]));
    }

    final void setBloomParameters(float param0, float param1, float param2) {
    }

    final void copyFrontToBackBuffer() {
        if (0 >= this.viewportWidth &&
          !(0 < this.viewportHeight)) {
          return;
        }
        int var1 = this.scissorLeft;
        int var2 = this.scissorRight;
        int var3 = this.scissorTop;
        int var4 = this.scissorBottom;
        this.resetScissor(-107);
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.selectClipSpaceProjection((byte) -101);
        this.setFogEnabled(false, -30305);
        this.setLightingEnabled((byte) -73, false);
        this.setDepthTestEnabled(false, -1700);
        this.setDepthWriteEnabled((byte) -74, false);
        this.setTexture((GpuTexture) null, -116);
        this.setMaterial(false, (byte) -124, false, -2);
        this.setTextureCombineMode(45, 1);
        this.setBlendMode(84, 0);
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
    }

    final GpuTexture2D createTexture2DFromBytes(int param0, byte[] param1, TextureFormat param2, int param3, int param4, int param5, boolean param6, int param7) {
        RuntimeException var9 = null;
        OpenGlGpuTexture2D var10 = null;
        OpenGlGpuTexture2D stackIn_7_0 = null;
        OpenGlGpuRectangleTexture stackIn_10_0 = null;
        OpenGlGpuTexture2D stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param7 != 11) {
            this.createCubeTexture(true, 116, (int[][]) null, -28);
          }
          if (!this.field_Xc && (!bd.a(param4, (byte) -95) ||
            !bd.a(param5, (byte) -95))) {
            if (this.field_Zc) {
              stackIn_10_0 = new OpenGlGpuRectangleTexture(this, param2, param4, param5, param1, param0, param3);
              return (GpuTexture2D) ((Object) stackIn_10_0);
            }
            var10 = new OpenGlGpuTexture2D(this, param2, GpuDataType.UNSIGNED_BYTE, GetSalvoaim.a(param4, (byte) -107), GetSalvoaim.a(param5, (byte) -127));
            var10.updateBytePixels(param3, param1, param5, param4, param0, 0, 3314, 0, param2);
            stackIn_12_0 = var10;
            return (GpuTexture2D) ((Object) stackIn_12_0);
          }
          stackIn_7_0 = new OpenGlGpuTexture2D(this, param2, param4, param5, param6, param1, param0, param3);
          return (GpuTexture2D) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_15_0 = var9;
          stackIn_15_1 = new StringBuilder().append("jp.LD(").append(param0).append(',');
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void applyViewport(byte param0) {
        jaggl.OpenGL.glViewport(this.viewportX, this.viewportY, this.viewportWidth, this.viewportHeight);
        int var2 = 105 / ((param0 + 40) / 57);
    }

    final void applyModelTransform(byte param0) {
        if (param0 <= 84) {
          return;
        }
        this.I((byte) 92);
    }

    final void commitDirectionalLights(byte param0) {
        int var2 = -60 % ((-45 - param0) / 51);
    }

    OpenGlGpuToolkit(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, TextureProvider param3, ResourceArchive param4, int param5) {
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
        this.field_yc = new IntrusiveDeque();
        this.field_Ic = new IntrusiveDeque();
        this.field_Uc = new IntrusiveDeque();
        this.field_Cc = new IntrusiveDeque();
        this.field_bd = new IntrusiveDeque();
        this.field_Ec = new IntrusiveDeque();
        this.field_Gc = new IntrusiveDeque();
        this.field_Pc = new OpenGlVertexBuffer[16];
        this.field_Sc = new jaggl.MapBuffer();
        this.field_Vc = new jaggl.MapBuffer();
        try {
          try {
            this.field_zc = param0;
            this.field_zc.attachToCurrentThread();
            this.field_Bc = jaggl.OpenGL.glGetString(7936).toLowerCase();
            this.field_ad = jaggl.OpenGL.glGetString(7937).toLowerCase();
            if (this.field_Bc.indexOf("microsoft") == -1 &&
              this.field_Bc.indexOf("brian paul") == -1 &&
              this.field_Bc.indexOf("mesa") == -1) {
              var20 = jaggl.OpenGL.glGetString(7938);
              var9 = SetFighterBayAimspeed.a((byte) -67, ' ', var20.replace('.', ' '));
              if (var9.length < 2) {
                throw new RuntimeException("");
              }
              try {
                var10_int = NebulaFieldFactory.a(-102, (CharSequence) ((Object) var9[0]));
                var11_int = NebulaFieldFactory.a(38, (CharSequence) ((Object) var9[1]));
                this.field_Fc = var10_int * 10 + var11_int;
              } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var10 = (NumberFormatException) (Object) decompiledCaughtException;
                throw new RuntimeException("");
              }
              if (this.field_Fc < 12) {
                throw new RuntimeException("");
              }
              if (!this.field_zc.hasExtension("GL_ARB_multitexture")) {
                throw new RuntimeException("");
              }
              if (!this.field_zc.hasExtension("GL_ARB_texture_env_combine")) {
                throw new RuntimeException("");
              }
              var26 = new int[1];
              jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
              this.field_L = var26[0];
              if (2 > this.field_L) {
                throw new RuntimeException("");
              }
              this.field_qb = 8;
              this.field_Hc = this.field_zc.hasExtension("GL_ARB_vertex_buffer_object");
              this.field_sc = this.field_zc.hasExtension("GL_ARB_multisample");
              this.field_Zc = this.field_zc.hasExtension("GL_ARB_texture_rectangle");
              this.field_vb = this.field_zc.hasExtension("GL_ARB_texture_cube_map");
              this.field_Xc = this.field_zc.hasExtension("GL_ARB_texture_non_power_of_two");
              this.field_uc = this.field_zc.hasExtension("GL_EXT_texture3D");
              this.field_Mc = this.field_zc.hasExtension("GL_ARB_vertex_shader");
              this.field_Ac = this.field_zc.hasExtension("GL_ARB_vertex_program");
              this.field_Qc = this.field_zc.hasExtension("GL_ARB_fragment_shader");
              this.field_zc.hasExtension("GL_ARB_fragment_program");
              this.field_Wc = new int[this.field_L];
              if (!jaclib.memory.Stream.isBigEndian()) {
                stackIn_21_1 = 5121;
              } else {
                stackIn_21_1 = 33639;
              }
              this.field_Nc = stackIn_21_1;
              if (this.field_ad.indexOf("radeon") != -1) {
                var11_int = 0;
                var12 = 0;
                var13 = 0;
                var14 = SetFighterBayAimspeed.a((byte) -67, ' ', this.field_ad.replace('/', ' '));
                for (var15 = 0; var14.length > var15; var15++) {
                  var21 = var14[var15];
                  var16 = var21;
                  var16 = var21;
                  var16 = var21;
                  try {
                    boolean decompiledFrameRemainder0 = true;
                    if (var21.length() > 0) {
                      if (var21.charAt(0) == 120 &&
                        var21.length() >= 3) {
                        var31 = (CharSequence) ((Object) var21.substring(1, 3));
                        if (SetPointDefenceLaserAimarc.a(var31, 10)) {
                          var13 = 1;
                          var16 = var21.substring(1);
                        }
                      }
                      if (var16.equals("hd")) {
                        var12 = 1;
                      } else {
                        if (var16.startsWith("hd")) {
                          var16 = var16.substring(2);
                          var12 = 1;
                        }
                        if (var16.length() >= 4) {
                          var32 = (CharSequence) ((Object) var16.substring(0, 4));
                          if (SetPointDefenceLaserAimarc.a(var32, 10)) {
                            var33 = (CharSequence) ((Object) var16.substring(0, 4));
                            var11_int = NebulaFieldFactory.a(63, var33);
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
                    this.field_Hc = false;
                  }
                  if (7000 <= var11_int &&
                    var11_int <= 9250) {
                    this.field_uc = false;
                  }
                }
                this.field_Zc = this.field_Zc & this.field_zc.hasExtension("GL_ARB_half_float_pixel");
              }
              if (this.field_Bc.indexOf("intel") == -1) {
              }
              if (this.field_Hc) {
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
            this.dispose((byte) 30);
            throw new RuntimeException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var8_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_61_0 = var8_ref;
          stackIn_61_1 = new StringBuilder().append("jp.<init>(");
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param5).append(')').toString());
        }
    }

    final int[] readPixels(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int[] var8 = new int[param3 * param2];
        int[] var5 = var8;
        for (var6 = 0; param3 > var6; var6++) {
          jaggl.OpenGL.glReadPixelsi(param0, -1 + (-param1 + (this.viewportHeight - var6)), param2, 1, 32993, this.field_Nc, var8, param2 * var6);
        }
        return var8;
    }

    final void applyScissorRectangle(byte param0) {
        int var2 = -28 % ((param0 + 6) / 45);
        jaggl.OpenGL.glScissor(this.scissorLeft + this.viewportX, this.viewportHeight + (this.viewportY - this.scissorBottom), this.scissorRight - this.scissorLeft, -this.scissorTop + this.scissorBottom);
    }

    final void applyActiveTextureUnit(int param0) {
        jaggl.OpenGL.glActiveTexture(33984 + this.activeTextureUnit);
        if (param0 != 12) {
          this.applyDirectionalLightsEnabled(false);
        }
    }

    final synchronized void a(int param0, byte param1) {
        IntrusiveNode var3 = new IntrusiveNode();
        var3.key = (long)param0;
        if (param1 <= 94) {
          return;
        }
        this.field_Ec.addLast(-10258, var3);
    }

    final void applyDirectionalLightDirections(int param0) {
        if (param0 != 3) {
          return;
        }
        jaggl.OpenGL.glLightfv(16384, 4611, this.sunDirection, 0);
        jaggl.OpenGL.glLightfv(16385, 4611, this.antiSunDirection, 0);
    }

    final void applyFogParameters(int param0) {
        this.field_r = (float)(-this.field_Qb + this.field_Wb);
        this.field_p = (float)(-this.field_j) + this.field_r;
        if (this.field_p < (float)this.field_h) {
          this.field_p = (float)this.field_h;
        }
        jaggl.OpenGL.glFogf(2915, this.field_p);
        jaggl.OpenGL.glFogf(2916, this.field_r);
        GetPhasedEnergyBeamFireForce.field_o[0] = (float)dla.a(this.field_lc, 16711680) / 16711680.0f;
        GetPhasedEnergyBeamFireForce.field_o[1] = (float)dla.a(this.field_lc, 65280) / 65280.0f;
        if (param0 != 8) {
          this.field_Cc = (IntrusiveDeque) null;
        }
        GetPhasedEnergyBeamFireForce.field_o[2] = (float)dla.a(255, this.field_lc) / 255.0f;
        jaggl.OpenGL.glFogfv(2918, GetPhasedEnergyBeamFireForce.field_o, 0);
    }

    final void applyPostProcessing() {
    }

    final GpuTexture2D createTexture2D(int param0, int param1, int param2, TextureFormat param3, GpuDataType param4) {
        RuntimeException var6 = null;
        GpuTexture2D stackIn_2_0 = null;
        OpenGlGpuTexture2D stackIn_9_0 = null;
        OpenGlGpuRectangleTexture stackIn_11_0 = null;
        OpenGlGpuTexture2D stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 115) {
            stackIn_2_0 = (GpuTexture2D) null;
            return stackIn_2_0;
          }
          if (!this.field_Xc && (!bd.a(param1, (byte) -95) ||
            !bd.a(param2, (byte) -95))) {
            if (this.field_Zc) {
              stackIn_11_0 = new OpenGlGpuRectangleTexture(this, param3, param4, param1, param2);
              return (GpuTexture2D) ((Object) stackIn_11_0);
            }
            stackIn_9_0 = new OpenGlGpuTexture2D(this, param3, param4, GetSalvoaim.a(param1, (byte) -102), GetSalvoaim.a(param2, (byte) -127));
            return (GpuTexture2D) ((Object) stackIn_9_0);
          }
          stackIn_13_0 = new OpenGlGpuTexture2D(this, param3, param4, param1, param2);
          return (GpuTexture2D) ((Object) stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("jp.CD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void restoreDefaultFramebuffer() {
    }

    final void applyRgbCombineOperation(int param0) {
        if (param0 > -64) {
          return;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, tc.toOpenGlCombineOperation(8448, this.rgbCombineOperations[this.activeTextureUnit]));
    }

    final void setTextureCoordinateIndex(int param0, int param1) {
        int var3 = 5 % ((36 - param0) / 33);
    }

    final boolean supportsTexture3DFormat(GpuDataType param0, TextureFormat param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 112 % ((-32 - param2) / 50);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("jp.QC(");
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

    final void unbindTexture(int param0) {
        int var2 = this.field_Wc[this.activeTextureUnit];
        if (param0 != 3) {
          this.field_Mc = false;
        }
        if (var2 != 0) {
          this.field_Wc[this.activeTextureUnit] = 0;
          jaggl.OpenGL.glBindTexture(var2, 0);
          jaggl.OpenGL.glDisable(var2);
        }
    }

    final void present(int param0, int param1) throws GraphicsPresentException {
        this.field_zc.swapBuffers();
    }

    final void setVertexDeclaration(int param0, GpuVertexDeclaration param1) {
        int var15 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        boolean stackIn_36_1 = false;
        int stackIn_40_0 = 0;
        int stackIn_43_1 = 0;
        boolean stackIn_51_1 = false;
        boolean stackIn_54_0 = false;
        int stackIn_55_1 = 0;
        boolean stackIn_63_1 = false;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        VertexStreamLayout var9_ref_qma = null;
        OpenGlVertexBuffer var10 = null;
        int var11 = 0;
        int var12 = 0;
        long var13 = 0L;
        VertexAttribute var16 = null;
        int var17 = 0;
        VertexStreamLayout[] var18 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        var17 = VoidHunters.field_G;
        try {
          var18 = ((OpenGlVertexDeclaration) (param1)).streams;
          var4 = 0;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          for (var8 = 0; var18.length > var8; var8++) {
            var9_ref_qma = var18[var8];
            var10 = this.field_Pc[var8];
            var11 = 0;
            var12 = var10.getStride((byte) 125);
            var13 = var10.getClientAddress(2);
            var10.bind((byte) 54);
            for (var15 = 0; var9_ref_qma.getAttributeCount(86) > var15; var15++) {
              var16 = var9_ref_qma.getAttribute(var15, 71);
              if (VertexAttribute.field_k == var16) {
                jaggl.OpenGL.glVertexPointer(3, 5126, var12, (long)var11 + var13);
                var7 = 1;
              } else {
                if (var16 != VertexAttribute.field_g) {
                  if (VertexAttribute.field_d != var16) {
                    if (var16 != VertexAttribute.field_e) {
                      if (var16 == VertexAttribute.field_l) {
                        incrementValue$0 = var4;
                        var4++;
                        jaggl.OpenGL.glClientActiveTexture(incrementValue$0 + 33984);
                        jaggl.OpenGL.glTexCoordPointer(2, 5126, var12, (long)var11 + var13);
                      } else {
                        if (VertexAttribute.field_h == var16) {
                          incrementValue$1 = var4;
                          var4++;
                          jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$1);
                          jaggl.OpenGL.glTexCoordPointer(3, 5126, var12, var13 + (long)var11);
                        } else {
                          if (var16 == VertexAttribute.field_b) {
                            incrementValue$2 = var4;
                            var4++;
                            jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$2);
                            jaggl.OpenGL.glTexCoordPointer(4, 5126, var12, var13 + (long)var11);
                          }
                        }
                      }
                    } else {
                      incrementValue$3 = var4;
                      var4++;
                      jaggl.OpenGL.glClientActiveTexture(incrementValue$3 + 33984);
                      jaggl.OpenGL.glTexCoordPointer(1, 5126, var12, (long)var11 + var13);
                    }
                  } else {
                    jaggl.OpenGL.glColorPointer(4, 5121, var12, var13 + (long)var11);
                    var5 = 1;
                  }
                } else {
                  var6 = 1;
                  jaggl.OpenGL.glNormalPointer(5126, var12, (long)var11 + var13);
                }
              }
              var11 = var11 + var16.byteSize;
            }
          }
          stackIn_25_0 = (var7 != 0) ? 0 : 1;
          if (this.field_Lc) {
            stackIn_28_1 = 0;
          } else {
            stackIn_28_1 = 1;
          }
          if (stackIn_25_0 != stackIn_28_1) {
            if (var7 == 0) {
              jaggl.OpenGL.glDisableClientState(32884);
            } else {
              jaggl.OpenGL.glEnableClientState(32884);
            }
            stackIn_36_1 = (var7 != 0);
            this.field_Lc = stackIn_36_1;
          }
          stackIn_40_0 = (var6 != 0) ? 0 : 1;
          if (this.field_Yc) {
            stackIn_43_1 = 0;
          } else {
            stackIn_43_1 = 1;
          }
          if (stackIn_40_0 != stackIn_43_1) {
            if (var6 == 0) {
              jaggl.OpenGL.glDisableClientState(32885);
            } else {
              jaggl.OpenGL.glEnableClientState(32885);
            }
            stackIn_51_1 = (var6 != 0);
            this.field_Yc = stackIn_51_1;
          }
          stackIn_54_0 = this.field_Kc;
          if (var5 != 0) {
            stackIn_55_1 = 0;
          } else {
            stackIn_55_1 = 1;
          }
          if ((stackIn_54_0 ? 1 : 0) == stackIn_55_1) {
            if (var5 != 0) {
              jaggl.OpenGL.glEnableClientState(32886);
            } else {
              jaggl.OpenGL.glDisableClientState(32886);
            }
            stackIn_63_1 = (var5 != 0);
            this.field_Kc = stackIn_63_1;
          }
          var8Lifetime1 = -72 % ((55 - param0) / 44);
          if (var4 > this.field_Rc) {
            for (var9 = this.field_Rc; var9 < var4; var9++) {
              jaggl.OpenGL.glClientActiveTexture(33984 + var9);
              jaggl.OpenGL.glEnableClientState(32888);
            }
            this.field_Rc = var4;
            return;
          }
          if (var4 < this.field_Rc) {
            for (var9Lifetime1 = var4; var9Lifetime1 < this.field_Rc; var9Lifetime1++) {
              jaggl.OpenGL.glClientActiveTexture(33984 + var9Lifetime1);
              jaggl.OpenGL.glDisableClientState(32888);
            }
            this.field_Rc = var4;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_78_0 = var3;
          stackIn_78_1 = new StringBuilder().append("jp.BE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    final void applyBlendFunction(byte param0) {
        int var3;
        var3 = VoidHunters.field_G;
        if (param0 != -39) {
          return;
        }
        if (GetGrapplingHookRopeBreakLength.field_o != this.blendFunction) {
          if (this.blendFunction == GpuTransform3D.field_b) {
            jaggl.OpenGL.glBlendFunc(1, 1);
          } else {
            if (DebugSendable.field_e == this.blendFunction) {
              jaggl.OpenGL.glBlendFunc(774, 1);
            }
          }
        } else {
          jaggl.OpenGL.glBlendFunc(770, 771);
        }
    }

    static {
        field_Oc = 4;
    }
}
