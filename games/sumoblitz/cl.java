/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends nt {
    private int field_y;
    static int field_s;
    private int field_u;
    private ah field_x;
    static boolean field_w;
    private int field_t;
    static ri[] field_v;
    static int[] field_z;

    final void a(GraphicsToolkit param0, int param1) {
        RuntimeException var3 = null;
        GraphicsToolkit var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 != this.field_u) {
            im.field_a.a(this.field_x.field_C + this.field_k >> 8, this.field_x.field_z + this.field_o >> 8, 0, this.field_q + (4 * this.field_p << 24), 1);
          } else {
            uc.field_a.a((float)(this.field_x.field_C + this.field_k >> 8), (float)(this.field_o + this.field_x.field_z >> 8), 1024, 0, 3, 16777215 + (this.field_p * 4 << 24), 1);
          }
          if (param1 <= -121) {
            return;
          }
          var4 = (GraphicsToolkit) null;
          this.a((GraphicsToolkit) null, 121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("cl.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 != 4) {
          return;
        }
        field_z = null;
        field_v = null;
    }

    final static void e(int param0) {
        if (null != GameClientShell.field_u) {
          return;
        }
        GameClientShell.field_u = new String[34];
        GameClientShell.field_u[16] = vp.discardText;
        GameClientShell.field_u[1] = ll.resumeGameText;
        GameClientShell.field_u[5] = rf.menuText;
        GameClientShell.field_u[11] = RasterBuffer.quitText;
        GameClientShell.field_u[14] = kf.achievementsText;
        GameClientShell.field_u[6] = rf.menuText;
        GameClientShell.field_u[12] = ff.soundText;
        GameClientShell.field_u[7] = nj.endGameText;
        GameClientShell.field_u[0] = k.startGameText;
        GameClientShell.field_u[3] = cp.instructionsText;
        int var1 = 56 % ((param0 + 26) / 42);
        GameClientShell.field_u[15] = go.logInCreateAccountText;
        GameClientShell.field_u[4] = ResourceArchive.field_j;
        GameClientShell.field_u[2] = MouseInputHandler.field_a;
        GameClientShell.field_u[13] = gu.musicText;
        GameClientShell.field_u[21] = hd.regularText;
        GameClientShell.field_u[25] = ea.difficultyText;
        GameClientShell.field_u[18] = gk.previousText;
        GameClientShell.field_u[10] = dj.scoreFilterLabels[2];
        GameClientShell.field_u[27] = ni.field_g;
        GameClientShell.field_u[23] = pt.challengeText;
        GameClientShell.field_u[24] = nq.optionsText;
        GameClientShell.field_u[17] = in.nextText;
        GameClientShell.field_u[28] = ss.restartLevelText;
        GameClientShell.field_u[19] = dn.arcadeGameText;
        GameClientShell.field_u[22] = td.editorText;
        BufferedSocket.field_i = new String[]{mn.highText, bc.lowText};
        GameClientShell.field_u[33] = mm.levelSelectText;
        GameClientShell.field_u[26] = lh.resetStatsText;
        GameClientShell.field_u[9] = dj.scoreFilterLabels[1];
        GameClientShell.field_u[20] = nt.challengeText;
        GameClientShell.field_u[32] = mm.levelSelectText;
        GameClientShell.field_u[8] = dj.scoreFilterLabels[0];
        GameClientShell.field_u[29] = hv.reassignText;
        GameClientShell.field_u[30] = ou.field_g;
        GameClientShell.field_u[31] = ls.continueText;
    }

    final boolean a(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -2567) {
          field_z = (int[]) null;
          if (this.field_p >= 64) {
            return super.a(-2567);
          }
          this.field_o = this.field_o + this.field_y;
          this.field_k = this.field_k + this.field_t;
          this.field_t = this.field_t * 251 / 285;
          this.field_y = this.field_y * 251 / 285;
          if (0 > this.field_y) {
            this.field_y = this.field_y - 1;
            if (this.field_t >= 0) {
              this.field_t = this.field_t + 1;
              return super.a(-2567);
            }
            this.field_t = this.field_t - 1;
            return super.a(-2567);
          }
          this.field_y = this.field_y + 1;
          if (this.field_t >= 0) {
            this.field_t = this.field_t + 1;
            return super.a(-2567);
          }
          this.field_t = this.field_t - 1;
          return super.a(-2567);
        }
        if (this.field_p >= 64) {
          return super.a(-2567);
        }
        this.field_o = this.field_o + this.field_y;
        this.field_k = this.field_k + this.field_t;
        this.field_t = this.field_t * 251 / 285;
        this.field_y = this.field_y * 251 / 285;
        if (0 > this.field_y) {
          this.field_y = this.field_y - 1;
          if (this.field_t >= 0) {
            this.field_t = this.field_t + 1;
            return super.a(-2567);
          }
          this.field_t = this.field_t - 1;
          return super.a(-2567);
        }
        this.field_y = this.field_y + 1;
        if (this.field_t >= 0) {
          this.field_t = this.field_t + 1;
          return super.a(-2567);
        }
        this.field_t = this.field_t - 1;
        return super.a(-2567);
    }

    cl(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ah param7) {
        super(param0, param1, param2, param3);
        try {
          this.field_u = param6;
          this.field_t = param4;
          this.field_x = param7;
          this.field_y = param5;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, lt param1, int param2) {
        pl var5 = as.field_v;
        var5.g(param2, param0 ^ -105);
        var5.position = var5.position + 1;
        int var4 = var5.position;
        var5.b((byte) 84, 1);
        var5.b((byte) 103, param1.field_k);
        if (param0 != -97) {
          return;
        }
        try {
          var5.a(param1.field_o, (byte) -17);
          var5.e(48, param1.field_n);
          var5.e(48, param1.field_p);
          var5.e(48, param1.field_q);
          var5.e(48, param1.field_l);
          var5.a(var4, false);
          var5.c(var5.position - var4, param0 - 13648);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_z = new int[2];
    }
}
