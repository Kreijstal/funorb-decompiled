/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackerMusicDefinition {
    int[][] field_g;
    private int field_F;
    int[] field_J;
    int[] field_x;
    int[] field_A;
    int[] field_G;
    private int[] field_c;
    int[] field_z;
    static AchievementTracker field_f;
    int[][] field_d;
    int[] field_E;
    int[] field_y;
    int[] field_k;
    int[] field_K;
    private int field_p;
    int[] field_h;
    int[] field_H;
    int[][] field_t;
    private int[] field_e;
    int[] field_m;
    int[] field_l;
    PcmSample[] field_s;
    int[][] field_v;
    int field_i;
    byte[][] field_C;
    int[] field_q;
    private SoundCache field_o;
    int[] field_u;
    int[] field_b;
    int field_w;
    static int field_j;
    int field_D;
    int[] field_a;
    int field_L;
    int[] field_r;
    int[][] field_I;
    int[] field_n;
    int field_B;

    final static void d(int param0) {
        AlternateUsernameCredentials.field_n.playSampleWithPan(!(0.5 <= Math.random()) ? TerrainMaskSupport.field_e : ri.field_b, 100, 6144 * IterableNodeHashTable.field_c / 64, param0);
    }

    final static String c(int param0) {
        if (InstructionsScreen.field_q == EmailAvailabilityValidator.field_o) {
          return AgeValidator.field_o;
        }
        if (!di.field_g.isComplete(0)) {
          return di.field_g.email(-84);
        }
        if (MeshMaterial.field_b == EmailAvailabilityValidator.field_o) {
          return di.field_g.email(-52);
        }
        if (param0 != 31069) {
          TrackerMusicDefinition.releaseStatics(-82);
        }
        return StrongCacheEntry.field_v;
    }

    public static void releaseStatics(int guard) {
        field_f = null;
        if (guard != -32408) {
          field_j = -49;
        }
    }

    private final void a(int param0) {
        PcmSample var4;
        int var5 = EscapeVector.obfuscationControl;
        if (this.field_o == null) {
          return;
        }
        boolean var2 = true;
        if (param0 != 260404420) {
          this.field_H = (int[]) null;
        }
        for (int var3 = 0; var3 < this.field_s.length; var3++) {
          if (this.field_s[var3] == null) {
            if (this.field_E[var3] >> 4 != 0) {
              var4 = this.field_o.getVorbisSample(this.field_e[var3], (byte) -128, this.field_c[var3]);
            } else {
              var4 = this.field_o.getSynthesizedSample((byte) 55, this.field_c[var3], this.field_e[var3]);
            }
            if (var4 == null) {
              var2 = false;
            } else {
              this.field_E[var3] = SpriteCheckboxPainter.bitwiseAnd(this.field_E[var3], 15);
              this.field_s[var3] = var4;
            }
          }
        }
        if (var2) {
          this.field_o = null;
          this.field_e = null;
          this.field_c = null;
        }
    }

    final static String a(byte param0, int param1, int param2) {
        if (param2 < -1) {
          return "";
        }
        if (-1 == param2) {
          return StatefulTextPainter.field_v;
        }
        int var3 = SpriteFactorySupport.levelCount(false, param1);
        if (param0 <= 75) {
          field_f = (AchievementTracker) null;
        }
        if (var3 <= param2) {
          return "";
        }
        if (null == AudioService.field_b) {
          mj.field_e = ProxySocketConnector.field_o;
          AudioService.field_b = new String[][]{mj.field_e, ProxySocketConnector.field_o, SavedCompletionFlags.field_d, ThreeSliceButtonPainter.field_u};
        }
        return AudioService.field_b[param1][param2];
    }

    TrackerMusicDefinition(PacketBuffer param0, SoundCache param1) {
        try {
          this.field_o = param1;
          this.field_w = param0.readUnsignedByte(0) + 1;
          param0.readUnsignedByte(0);
          this.field_B = 1 + param0.readUnsignedByte(0);
          this.field_p = param0.readUnsignedByte(0) + 1;
          this.field_F = param0.readUnsignedByte(0) + 1;
          int var3_int = param0.readUnsignedByte(0);
          this.field_D = var3_int & 1;
          this.field_L = param0.readUnsignedByte(0);
          this.field_i = param0.readUnsignedByte(0);
          this.field_x = new int[this.field_w];
          int var4 = 0;
          for (int var5 = 0; var5 < this.field_w; var5++) {
            int dupTemp$0 = var4 + param0.readUnsignedByte(0);
            var4 = dupTemp$0;
            this.field_x[var5] = SpriteCheckboxPainter.bitwiseAnd(255, dupTemp$0);
          }
          this.field_C = new byte[256][];
          this.field_l = new int[256];
          ArraySupport.fill(this.field_l, 0, 256, 64);
          for (int var5Lifetime1 = 0; 256 > var5Lifetime1; var5Lifetime1++) {
            this.field_C[var5Lifetime1] = um.field_b;
          }
          for (int var5Lifetime2 = 0; var5Lifetime2 < this.field_p; var5Lifetime2++) {
            this.field_l[var5Lifetime2] = param0.readUnsignedByte(0) + 1;
            int var6 = param0.readUnsignedShort(1952);
            byte[] var16 = new byte[var6];
            if (0 < var6) {
              param0.readBytes(var16, (byte) -96, 0, var6);
              this.field_C[var5Lifetime2] = var16;
            }
          }
          this.field_u = new int[this.field_F];
          this.field_K = new int[this.field_F];
          this.field_k = new int[this.field_F];
          this.field_m = new int[this.field_F];
          this.field_I = new int[this.field_F][];
          this.field_t = new int[this.field_F][];
          this.field_d = new int[this.field_F][96];
          this.field_r = new int[this.field_F];
          this.field_H = new int[this.field_F];
          this.field_J = new int[this.field_F];
          this.field_G = new int[this.field_F];
          this.field_g = new int[this.field_F][];
          this.field_q = new int[this.field_F];
          this.field_v = new int[this.field_F][];
          int var5Lifetime3 = param0.readUnsignedShort(1952);
          this.field_y = new int[var5Lifetime3];
          this.field_n = new int[var5Lifetime3];
          this.field_E = new int[var5Lifetime3];
          this.field_e = new int[var5Lifetime3];
          this.field_a = new int[var5Lifetime3];
          this.field_b = new int[var5Lifetime3];
          this.field_s = new PcmSample[var5Lifetime3];
          this.field_c = new int[var5Lifetime3];
          this.field_h = new int[var5Lifetime3];
          this.field_z = new int[var5Lifetime3];
          this.field_A = new int[var5Lifetime3];
          int var5Lifetime4 = 0;
          for (int var6Lifetime1 = 0; var6Lifetime1 < this.field_F; var6Lifetime1++) {
            int var7 = param0.readUnsignedByte(0);
            if (var7 > 0) {
              int var4Lifetime1 = 0;
              for (int var8 = 0; var8 < 96; var8++) {
                int dupTemp$1 = var4Lifetime1 + param0.readUnsignedByte(0);
                var4Lifetime1 = dupTemp$1;
                this.field_d[var6Lifetime1][var8] = var5Lifetime4 + SpriteCheckboxPainter.bitwiseAnd(255, dupTemp$1);
              }
              this.field_u[var6Lifetime1] = param0.readUnsignedByte(0);
              int var8Lifetime1 = param0.readUnsignedByte(0);
              this.field_J[var6Lifetime1] = param0.readUnsignedByte(0);
              this.field_r[var6Lifetime1] = param0.readUnsignedByte(0);
              this.field_G[var6Lifetime1] = this.field_r[var6Lifetime1] + param0.readUnsignedByte(0);
              this.field_m[var6Lifetime1] = param0.readUnsignedByte(0);
              int var9 = param0.readUnsignedByte(0);
              this.field_q[var6Lifetime1] = param0.readUnsignedByte(0);
              this.field_k[var6Lifetime1] = param0.readUnsignedByte(0);
              this.field_K[var6Lifetime1] = this.field_k[var6Lifetime1] + param0.readUnsignedByte(0);
              int var4Lifetime1Lifetime1 = 0;
              int[] array$2 = new int[var8Lifetime1];
              this.field_v[var6Lifetime1] = array$2;
              int var10 = 0;
              for (int var11 = 0; var8Lifetime1 > var11; var11++) {
                int dupTemp$3 = var10 + param0.readSignedSmart((byte) 32);
                var10 = dupTemp$3;
                int localTemp$4 = var4Lifetime1Lifetime1 + dupTemp$3;
                var4Lifetime1Lifetime1 = localTemp$4;
                this.field_v[var6Lifetime1][var11] = localTemp$4;
              }
              int[] array$5 = new int[var8Lifetime1];
              this.field_g[var6Lifetime1] = array$5;
              int var4Lifetime1Lifetime2 = 0;
              for (int var11Lifetime1 = 0; var11Lifetime1 < var8Lifetime1; var11Lifetime1++) {
                int dupTemp$6 = var4Lifetime1Lifetime2 + param0.readUnsignedByte(0);
                var4Lifetime1Lifetime2 = dupTemp$6;
                this.field_g[var6Lifetime1][var11Lifetime1] = SpriteCheckboxPainter.bitwiseAnd(255, dupTemp$6);
              }
              int[] array$7 = new int[var9];
              this.field_I[var6Lifetime1] = array$7;
              int var4Lifetime1Lifetime3 = 0;
              int var10Lifetime1 = 0;
              for (int var11Lifetime2 = 0; var9 > var11Lifetime2; var11Lifetime2++) {
                int dupTemp$8 = var10Lifetime1 + param0.readSignedSmart((byte) 114);
                var10Lifetime1 = dupTemp$8;
                int localTemp$9 = var4Lifetime1Lifetime3 + dupTemp$8;
                var4Lifetime1Lifetime3 = localTemp$9;
                this.field_I[var6Lifetime1][var11Lifetime2] = localTemp$9;
              }
              int var4Lifetime1Lifetime4 = 0;
              int[] array$10 = new int[var9];
              this.field_t[var6Lifetime1] = array$10;
              for (int var11Lifetime3 = 0; var9 > var11Lifetime3; var11Lifetime3++) {
                int dupTemp$11 = var4Lifetime1Lifetime4 + param0.readUnsignedByte(0);
                var4Lifetime1Lifetime4 = dupTemp$11;
                this.field_t[var6Lifetime1][var11Lifetime3] = SpriteCheckboxPainter.bitwiseAnd(255, dupTemp$11);
              }
              this.field_H[var6Lifetime1] = param0.readUnsignedShort(1952);
              for (int var11Lifetime4 = 0; var11Lifetime4 < var7; var11Lifetime4++) {
                this.field_n[var5Lifetime4] = param0.readUnsignedMedium((byte) -112);
                this.field_h[var5Lifetime4] = param0.readUnsignedMedium((byte) -126);
                this.field_A[var5Lifetime4] = this.field_h[var5Lifetime4] + param0.readUnsignedMedium((byte) -107);
                this.field_a[var5Lifetime4] = param0.readUnsignedByte(0);
                this.field_z[var5Lifetime4] = param0.readByte(false);
                this.field_E[var5Lifetime4] = param0.readUnsignedByte(0);
                this.field_y[var5Lifetime4] = param0.readUnsignedByte(0);
                this.field_b[var5Lifetime4] = param0.readByte(false) - 1;
                this.field_e[var5Lifetime4] = param0.readUnsignedShort(1952);
                this.field_c[var5Lifetime4] = param0.readUnsignedShort(1952);
                var5Lifetime4++;
              }
            }
          }
          this.a(260404420);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ce.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new AchievementTracker();
    }
}
