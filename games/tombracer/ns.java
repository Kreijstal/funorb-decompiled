/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ns extends qe {
    private float field_l;
    static String field_c;
    private tla field_i;
    static boolean[] field_d;
    static int field_g;
    private float[] field_e;
    private int field_h;
    private aaa field_m;
    static SoundCache field_j;
    private pva field_k;
    static boolean field_f;

    public static void releaseStatics(int param0) {
        if (param0 != 2) {
          return;
        }
        field_d = null;
        field_j = null;
        field_c = null;
    }

    final void a(boolean param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (this.field_i == null) {
          return;
        }
        this.field_i.a(4864, '\0');
        this.field_a.e(1, true);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadMatrixf(this.field_a.field_Tc.affineMatrix(-103), 0);
        int var3 = 5 / ((56 - param1) / 48);
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_a.e(0, true);
        if (this.field_h == this.field_a.field_Oc) {
        } else {
          var4 = this.field_a.field_Oc % 5000 * 128 / 5000;
          for (var5 = 0; 64 > var5; var5++) {
            jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field_e, var4);
            var4 += 2;
          }
          if (!this.field_m.field_g) {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
          } else {
            this.field_l = (float)(this.field_a.field_Oc % 4000) / 4000.0f;
          }
          this.field_h = this.field_a.field_Oc;
        }
    }

    ns(OpenGlToolkit param0, aaa param1) {
        super(param0);
        int var6 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var16 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        try {
          this.field_m = param1;
          if (this.field_a.field_G &&
            this.field_a.field_Ic >= 2) {
            this.field_k = C2SActionPacket.a(17, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", this.field_a);
            if (null == this.field_k) {
              return;
            }
            var16 = qv.a(false, 0, 3, 0.4000000059604645f, 64, (byte) -95, 4, 4, 256);
            var12 = var16;
            var11 = var12;
            var3 = var11;
            var23 = qv.a(false, 8, 3, 0.4000000059604645f, 64, (byte) -102, 4, 4, 256);
            this.field_e = new float[32768];
            var5 = 0;
            for (var6 = 0; var6 < 256; var6++) {
              var24 = var16[var6];
              var25 = var23[var6];
              for (var9 = 0; var9 < 64; var9++) {
                incrementValue$0 = var5;
                var5++;
                this.field_e[incrementValue$0] = (float)var24[var9] / 4096.0f;
                incrementValue$1 = var5;
                var5++;
                this.field_e[incrementValue$1] = (float)var25[var9] / 4096.0f;
              }
            }
            this.a((byte) 44);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ns.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 <= 77) {
          this.a(true, -89);
        }
    }

    final static cha a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          cha var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          cha stackIn_3_0 = null;
          ImageProducerRasterBuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("de");
              var5 = (cha) (var4.newInstance());
              if (param0 < 100) {
                field_j = (SoundCache) null;
              }
              var5.a(param1, param3, param2, (byte) -69);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((cha) ((Object) var5_ref)).a(param1, param3, param2, (byte) -98);
              stackIn_5_0 = var5_ref;
              return (cha) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("ns.C(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, kl param2) {
        try {
          this.field_a.a(true, param2);
          this.field_a.d(1, param0);
          if (param1 != 32221) {
            field_j = (SoundCache) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ns.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        this.field_i = new tla(this.field_a, 2);
        this.field_i.a((byte) 6, 0);
        this.field_a.e(1, true);
        this.field_a.setTextureConstantArgb(1104971864, -16777216);
        this.field_a.setTextureCombineOperations(260, 8960, 7681);
        this.field_a.b(34166, 3, 0, 770);
        this.field_a.e(0, true);
        int var2 = 67 / ((param0 + 62) / 58);
        jaggl.OpenGL.glBindProgramARB(34336, this.field_k.field_a);
        jaggl.OpenGL.glEnable(34336);
        this.field_i.b((byte) -94);
        this.field_i.a((byte) 6, 1);
        this.field_a.e(1, true);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glMatrixMode(5888);
        this.field_a.d(1, 0);
        this.field_a.b(5890, 3, 0, 770);
        this.field_a.e(0, true);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34336);
        jaggl.OpenGL.glDisable(34820);
        this.field_i.b((byte) 74);
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
          this.field_k = (pva) null;
          return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        if (this.field_i == null) {
          return;
        }
        this.field_a.e(1, true);
        if ((128 & param0) == 0) {
          if (1 != (param1 & 1)) {
            if (!this.field_m.field_g) {
              this.field_a.a(true, this.field_m.field_f[0]);
            } else {
              this.field_a.a(true, this.field_m.field_h);
            }
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
          } else {
            if (!this.field_m.field_g) {
              var4 = 16 * (this.field_a.field_Oc % 4000) / 4000;
              this.field_a.a(true, this.field_m.field_f[var4]);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f);
            } else {
              this.field_a.a(true, this.field_m.field_h);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field_l, 0.0f, 0.0f, 1.0f);
            }
          }
        } else {
          this.field_a.a(true, (kl) null);
        }
        if (param2 <= 117) {
          this.field_e = (float[]) null;
        }
        this.field_a.e(0, true);
        if ((64 & param0) != 0) {
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f);
        } else {
          BlockModel.field_y[2] = this.field_a.field_bc * this.field_a.field_tc;
          BlockModel.field_y[1] = this.field_a.field_tc * this.field_a.field_Fb;
          BlockModel.field_y[0] = this.field_a.field_wc * this.field_a.field_tc;
          jaggl.OpenGL.glProgramLocalParameter4fvARB(34336, 66, BlockModel.field_y, 0);
        }
        var4Lifetime1 = param0 & 3;
        if (var4Lifetime1 == 2) {
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05000000074505806f, 1.0f, 1.0f, 1.0f);
        } else {
          if (3 != var4Lifetime1) {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.02500000037252903f, 1.0f, 1.0f, 1.0f);
          } else {
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.10000000149011612f, 1.0f, 1.0f, 1.0f);
          }
        }
    }

    final void a(boolean param0) {
        if (null == this.field_i) {
          return;
        }
        this.field_i.a(4864, '\001');
        this.field_a.e(1, !param0 ? true : false);
        this.field_a.a(true, (kl) null);
        this.field_a.e(0, !param0 ? true : false);
        if (param0) {
          this.field_e = (float[]) null;
        }
    }

    static {
        field_d = new boolean[8];
        field_c = "No options available";
        field_f = false;
    }
}
