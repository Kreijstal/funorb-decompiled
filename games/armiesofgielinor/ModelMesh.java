/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModelMesh extends ModelMeshBase {
    private int[] textureVertexB;
    private int[] textureVertexC;
    int[] field_R;
    private byte[] field_lb;
    private int faceCount;
    private short[] field_ab;
    private byte[] field_H;
    private boolean field_k;
    private int[] verticesZ;
    private int[] faceVertexA;
    private int[] faceVertexB;
    private int textureTriangleCount;
    private short field_A;
    int[] field_Z;
    private byte[] field_ob;
    int vertexCount;
    int[] verticesY;
    private boolean field_db;
    private int[][] faceGroups;
    private int[] verticesX;
    private int[][] vertexGroups;
    private int[] textureVertexA;
    private static ModelMesh field_ib;
    private short[] faceColors;
    int[] field_t;
    private int referencedVertexCapacity;
    private short[] field_g;
    private int[] faceVertexC;
    private short[] field_e;
    private static byte[] field_u;
    private static int[] field_gb;
    private static short[] field_C;
    private static int[] field_K;
    private static int[] field_m;
    private static boolean[] field_D;
    private static int[] field_hb;
    private static int[] field_V;
    private static boolean field_y;
    private static int[] field_z;
    private static int[] field_M;
    private static int[] field_eb;
    private static int field_cb;
    private static int field_x;
    private static int[] field_W;
    private static int[] field_O;
    private static int[] field_P;
    private static int[] field_h;
    private static int[][] field_kb;
    private static int[] field_B;
    private static boolean[] field_s;
    private static boolean field_f;
    private static int[][] field_j;
    private static int[] field_X;
    private static int[] field_n;
    private static int[][] field_U;
    private static int field_v;
    private static int[] field_T;
    private static int[] field_L;
    private static int[] field_J;
    private static int field_mb;
    private static int[] field_Q;
    private static int[] field_fb;

    private final void e() {
        int var4 = 0;
        int var3;
        int stackIn_5_0 = 0;
        int var1;
        int var2;
        for (var4 = 0; var4 < this.faceCount; var4++) {
          if (this.field_ab == null) {
            stackIn_5_0 = -1;
          } else {
            stackIn_5_0 = this.field_ab[var4];
          }
          var3 = stackIn_5_0;
          if (var3 == -1) {
            var1 = this.faceColors[var4] & 65535;
            if (this.field_R[var4] != -1) {
              if (this.field_R[var4] != -2) {
                var2 = this.field_Z[var4] & -131072;
                this.field_Z[var4] = var2 | ModelMesh.a(var1, var2 >> 17);
                var2 = this.field_t[var4] & -131072;
                this.field_t[var4] = var2 | ModelMesh.a(var1, var2 >> 17);
                var2 = this.field_R[var4] & -131072;
                this.field_R[var4] = var2 | ModelMesh.a(var1, var2 >> 17);
              }
            } else {
              var2 = this.field_Z[var4] & -131072;
              this.field_Z[var4] = var2 | ModelMesh.a(var1, var2 >> 17);
            }
          }
        }
    }

    private final static int a(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
          param1 = 2;
        } else {
          if (param1 > 126) {
            param1 = 126;
          }
        }
        return (param0 & 65408) + param1;
    }

    final void finishAnimation() {
        if (this.field_db) {
          this.e();
          this.field_db = false;
        }
        this.field_k = false;
    }

    private final void c(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var14Lifetime4;
        int var14Lifetime1Lifetime1;
        int var14Lifetime2Lifetime1;
        int var20Lifetime1Lifetime1;
        var2 = tm.field_c;
        var3 = tm.field_j;
        var4 = 0;
        var5 = this.faceVertexA[param0];
        var6 = this.faceVertexB[param0];
        var7 = this.faceVertexC[param0];
        var8 = field_O[var5];
        var9 = field_O[var6];
        var10 = field_O[var7];
        if (this.field_H != null) {
          tm.field_f = this.field_H[param0] & 255;
        } else {
          tm.field_f = 0;
        }
        if (var8 < 50) {
          var11 = field_X[var5];
          var12 = field_Q[var5];
          var13 = this.field_Z[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * tm.field_m[var10 - var8];
            field_n[var4] = var2 + (var11 + ((field_X[var7] - var11) * var14 >> 16) << 9) / 50;
            field_eb[var4] = var3 + (var12 + ((field_Q[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_fb[incrementValue$0] = var13 + (((this.field_R[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * tm.field_m[var9 - var8];
            field_n[var4] = var2 + (var11 + ((field_X[var6] - var11) * var14Lifetime4 >> 16) << 9) / 50;
            field_eb[var4] = var3 + (var12 + ((field_Q[var6] - var12) * var14Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var4;
            var4++;
            field_fb[incrementValue$1] = var13 + (((this.field_t[param0] & 65535) - var13) * var14Lifetime4 >> 16);
          }
        } else {
          field_n[var4] = field_B[var5];
          field_eb[var4] = field_V[var5];
          incrementValue$2 = var4;
          var4++;
          field_fb[incrementValue$2] = this.field_Z[param0] & 65535;
        }
        if (var9 < 50) {
          var11Lifetime1 = field_X[var6];
          var12Lifetime1 = field_Q[var6];
          var13Lifetime1 = this.field_t[param0] & 65535;
          if (var8 >= 50) {
            var14Lifetime1 = (50 - var9) * tm.field_m[var8 - var9];
            field_n[var4] = var2 + (var11Lifetime1 + ((field_X[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_eb[var4] = var3 + (var12Lifetime1 + ((field_Q[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_fb[incrementValue$3] = var13Lifetime1 + (((this.field_Z[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * tm.field_m[var10 - var9];
            field_n[var4] = var2 + (var11Lifetime1 + ((field_X[var7] - var11Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_eb[var4] = var3 + (var12Lifetime1 + ((field_Q[var7] - var12Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var4;
            var4++;
            field_fb[incrementValue$4] = var13Lifetime1 + (((this.field_R[param0] & 65535) - var13Lifetime1) * var14Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_n[var4] = field_B[var6];
          field_eb[var4] = field_V[var6];
          incrementValue$5 = var4;
          var4++;
          field_fb[incrementValue$5] = this.field_t[param0] & 65535;
        }
        if (var10 < 50) {
          var11Lifetime2 = field_X[var7];
          var12Lifetime2 = field_Q[var7];
          var13Lifetime2 = this.field_R[param0] & 65535;
          if (var9 >= 50) {
            var14Lifetime2 = (50 - var10) * tm.field_m[var9 - var10];
            field_n[var4] = var2 + (var11Lifetime2 + ((field_X[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_eb[var4] = var3 + (var12Lifetime2 + ((field_Q[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_fb[incrementValue$6] = var13Lifetime2 + (((this.field_t[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * tm.field_m[var8 - var10];
            field_n[var4] = var2 + (var11Lifetime2 + ((field_X[var5] - var11Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_eb[var4] = var3 + (var12Lifetime2 + ((field_Q[var5] - var12Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var4;
            var4++;
            field_fb[incrementValue$7] = var13Lifetime2 + (((this.field_Z[param0] & 65535) - var13Lifetime2) * var14Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_n[var4] = field_B[var7];
          field_eb[var4] = field_V[var7];
          incrementValue$8 = var4;
          var4++;
          field_fb[incrementValue$8] = this.field_R[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var11Lifetime3 = field_n[0];
        var12Lifetime3 = field_n[1];
        var13Lifetime3 = field_n[2];
        var14Lifetime3 = field_eb[0];
        var15 = field_eb[1];
        var16 = field_eb[2];
        tm.field_a = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= tm.field_l) ||
            !(var12Lifetime3 <= tm.field_l) ||
            !(var13Lifetime3 <= tm.field_l)) {
            tm.field_a = true;
          }
          if (this.field_ab != null &&
            this.field_ab[param0] != -1) {
            if (this.field_lb != null &&
              this.field_lb[param0] != -1) {
              var20 = this.field_lb[param0] & 255;
              var17 = this.textureVertexA[var20];
              var18 = this.textureVertexB[var20];
              var19 = this.textureVertexC[var20];
            } else {
              var17 = var5;
              var18 = var6;
              var19 = var7;
            }
            if (this.field_R[param0] != -1) {
              tm.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_fb[0], field_fb[1], field_fb[2], field_X[var17], field_X[var18], field_X[var19], field_Q[var17], field_Q[var18], field_Q[var19], field_O[var17], field_O[var18], field_O[var19], (int) this.field_ab[param0]);
            } else {
              tm.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_X[var17], field_X[var18], field_X[var19], field_Q[var17], field_Q[var18], field_Q[var19], field_O[var17], field_O[var18], field_O[var19], (int) this.field_ab[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_R[param0] != -1) {
              tm.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_fb[0], field_fb[1], field_fb[2]);
            } else {
              tm.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, tm.field_h[this.field_Z[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= tm.field_l) ||
          !(var12Lifetime3 <= tm.field_l) ||
          !(var13Lifetime3 <= tm.field_l) ||
          !(field_n[3] >= 0) ||
          !(field_n[3] <= tm.field_l)) {
          tm.field_a = true;
        }
        if (this.field_ab != null &&
          this.field_ab[param0] != -1) {
          if (this.field_lb != null &&
            this.field_lb[param0] != -1) {
            var20Lifetime1 = this.field_lb[param0] & 255;
            var17Lifetime1 = this.textureVertexA[var20Lifetime1];
            var18Lifetime1 = this.textureVertexB[var20Lifetime1];
            var19Lifetime1 = this.textureVertexC[var20Lifetime1];
          } else {
            var17Lifetime1 = var5;
            var18Lifetime1 = var6;
            var19Lifetime1 = var7;
          }
          var20Lifetime1Lifetime1 = this.field_ab[param0];
          if (this.field_R[param0] != -1) {
            tm.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_fb[0], field_fb[1], field_fb[2], field_X[var17Lifetime1], field_X[var18Lifetime1], field_X[var19Lifetime1], field_Q[var17Lifetime1], field_Q[var18Lifetime1], field_Q[var19Lifetime1], field_O[var17Lifetime1], field_O[var18Lifetime1], field_O[var19Lifetime1], var20Lifetime1Lifetime1);
            tm.a(var14Lifetime3, var16, field_eb[3], var11Lifetime3, var13Lifetime3, field_n[3], field_fb[0], field_fb[2], field_fb[3], field_X[var17Lifetime1], field_X[var18Lifetime1], field_X[var19Lifetime1], field_Q[var17Lifetime1], field_Q[var18Lifetime1], field_Q[var19Lifetime1], field_O[var17Lifetime1], field_O[var18Lifetime1], field_O[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            tm.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_X[var17Lifetime1], field_X[var18Lifetime1], field_X[var19Lifetime1], field_Q[var17Lifetime1], field_Q[var18Lifetime1], field_Q[var19Lifetime1], field_O[var17Lifetime1], field_O[var18Lifetime1], field_O[var19Lifetime1], var20Lifetime1Lifetime1);
            tm.a(var14Lifetime3, var16, field_eb[3], var11Lifetime3, var13Lifetime3, field_n[3], this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_X[var17Lifetime1], field_X[var18Lifetime1], field_X[var19Lifetime1], field_Q[var17Lifetime1], field_Q[var18Lifetime1], field_Q[var19Lifetime1], field_O[var17Lifetime1], field_O[var18Lifetime1], field_O[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_R[param0] != -1) {
            tm.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_fb[0], field_fb[1], field_fb[2]);
            tm.a(var14Lifetime3, var16, field_eb[3], var11Lifetime3, var13Lifetime3, field_n[3], field_fb[0], field_fb[2], field_fb[3]);
          } else {
            var17Lifetime1 = tm.field_h[this.field_Z[param0] & 65535];
            tm.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            tm.a(var14Lifetime3, var16, field_eb[3], var11Lifetime3, var13Lifetime3, field_n[3], var17Lifetime1);
          }
        }
    }

    final ModelMeshBase a(boolean param0, boolean param1, boolean param2) {
        if (!param0 &&
          field_u.length < this.faceCount) {
          field_u = new byte[this.faceCount + 100];
        }
        if (!param1 &&
          field_C.length < this.faceCount) {
          field_gb = new int[this.faceCount + 100];
          field_m = new int[this.faceCount + 100];
          field_K = new int[this.faceCount + 100];
          field_C = new short[this.faceCount + 100];
        }
        return this.a(param0, param1, field_ib, field_u, field_C, field_gb, field_m, field_K);
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param1 < param2 &&
          param1 < param3 &&
          param1 < param4) {
          return false;
        }
        if (param1 > param2 &&
          param1 > param3 &&
          param1 > param4) {
          return false;
        }
        if (param0 < param5 &&
          param0 < param6 &&
          param0 < param7) {
          return false;
        }
        if (param0 > param5 &&
          param0 > param6 &&
          param0 > param7) {
          return false;
        }
        return true;
    }

    final boolean beginAnimation() {
        if (this.vertexGroups == null) {
          return false;
        }
        field_v = 0;
        field_mb = 0;
        field_cb = 0;
        return true;
    }

    final void scaleGeometry(int scaleX, int scaleY, int scaleZ) {
        int var4 = 0;
        for (var4 = 0; var4 < this.vertexCount; var4++) {
          this.verticesX[var4] = this.verticesX[var4] * scaleX / 128;
          this.verticesY[var4] = this.verticesY[var4] * scaleY / 128;
          this.verticesZ[var4] = this.verticesZ[var4] * scaleZ / 128;
        }
        this.field_k = false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param0, param1, param2, param3, param4, param5, param6, -1L);
    }

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (field_D[param0]) {
          this.c(param0);
          return;
        }
        var2 = this.faceVertexA[param0];
        var3 = this.faceVertexB[param0];
        var4 = this.faceVertexC[param0];
        tm.field_a = field_s[param0];
        if (this.field_H != null) {
          tm.field_f = this.field_H[param0] & 255;
        } else {
          tm.field_f = 0;
        }
        if (this.field_ab != null &&
          this.field_ab[param0] != -1) {
          if (this.field_lb != null &&
            this.field_lb[param0] != -1) {
            var8 = this.field_lb[param0] & 255;
            var5 = this.textureVertexA[var8];
            var6 = this.textureVertexB[var8];
            var7 = this.textureVertexC[var8];
          } else {
            var5 = var2;
            var6 = var3;
            var7 = var4;
          }
          if (this.field_R[param0] != -1) {
            tm.a(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], this.field_Z[param0], this.field_t[param0], this.field_R[param0], field_X[var5], field_X[var6], field_X[var7], field_Q[var5], field_Q[var6], field_Q[var7], field_O[var5], field_O[var6], field_O[var7], (int) this.field_ab[param0]);
          } else {
            tm.a(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_X[var5], field_X[var6], field_X[var7], field_Q[var5], field_Q[var6], field_Q[var7], field_O[var5], field_O[var6], field_O[var7], (int) this.field_ab[param0]);
          }
        } else {
          if (this.field_R[param0] != -1) {
            tm.a(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], this.field_Z[param0] & 65535, this.field_t[param0] & 65535, this.field_R[param0] & 65535);
          } else {
            tm.a(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], tm.field_h[this.field_Z[param0] & 65535]);
          }
        }
    }

    private final static int d(int param0) {
        if (param0 < 2) {
          param0 = 2;
        } else {
          if (param0 > 126) {
            param0 = 126;
          }
        }
        return param0;
    }

    private final ModelMeshBase a(boolean param0, boolean param1, ModelMesh param2, byte[] param3, short[] param4, int[] param5, int[] param6, int[] param7) {
        int var9;
        int var9Lifetime1;
        int var9Lifetime2;
        param2.vertexCount = this.vertexCount;
        param2.referencedVertexCapacity = this.referencedVertexCapacity;
        param2.faceCount = this.faceCount;
        param2.textureTriangleCount = this.textureTriangleCount;
        if (param2.verticesX == null ||
          !(param2.verticesX.length >= this.vertexCount)) {
          param2.verticesX = new int[this.vertexCount + 100];
          param2.verticesY = new int[this.vertexCount + 100];
          param2.verticesZ = new int[this.vertexCount + 100];
        }
        for (var9 = 0; var9 < this.vertexCount; var9++) {
          param2.verticesX[var9] = this.verticesX[var9];
          param2.verticesY[var9] = this.verticesY[var9];
          param2.verticesZ[var9] = this.verticesZ[var9];
        }
        if (!param0) {
          param2.field_H = param3;
          if (this.field_H != null) {
            for (var9Lifetime1 = 0; var9Lifetime1 < this.faceCount; var9Lifetime1++) {
              param2.field_H[var9Lifetime1] = this.field_H[var9Lifetime1];
            }
          } else {
            for (var9Lifetime1 = 0; var9Lifetime1 < this.faceCount; var9Lifetime1++) {
              param2.field_H[var9Lifetime1] = (byte) 0;
            }
          }
        } else {
          param2.field_H = this.field_H;
        }
        if (!param1) {
          param2.faceColors = param4;
          param2.field_Z = param5;
          param2.field_t = param6;
          param2.field_R = param7;
          for (var9Lifetime2 = 0; var9Lifetime2 < this.faceCount; var9Lifetime2++) {
            param2.faceColors[var9Lifetime2] = this.faceColors[var9Lifetime2];
            param2.field_Z[var9Lifetime2] = this.field_Z[var9Lifetime2];
            param2.field_t[var9Lifetime2] = this.field_t[var9Lifetime2];
            param2.field_R[var9Lifetime2] = this.field_R[var9Lifetime2];
          }
        } else {
          param2.faceColors = this.faceColors;
          param2.field_Z = this.field_Z;
          param2.field_t = this.field_t;
          param2.field_R = this.field_R;
        }
        param2.faceVertexA = this.faceVertexA;
        param2.faceVertexB = this.faceVertexB;
        param2.faceVertexC = this.faceVertexC;
        param2.field_ob = this.field_ob;
        param2.field_lb = this.field_lb;
        param2.field_ab = this.field_ab;
        param2.textureVertexA = this.textureVertexA;
        param2.textureVertexB = this.textureVertexB;
        param2.textureVertexC = this.textureVertexC;
        param2.vertexGroups = this.vertexGroups;
        param2.faceGroups = this.faceGroups;
        param2.field_e = this.field_e;
        param2.field_g = this.field_g;
        param2.field_k = false;
        return (ModelMeshBase) ((Object) param2);
    }

    final void applyGroupTransform(int transformType, int[] groups, int x, int y, int z, boolean transformOption) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[] var35;
        int[] var36;
        int[] var37;
        int[] var38;
        int[] var39;
        int[] var40;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime2;
        int var15Lifetime3;
        int var13Lifetime1Lifetime1;
        int var13Lifetime1Lifetime2;
        var7 = groups.length;
        if (transformType == 0) {
          var8 = 0;
          field_v = 0;
          field_mb = 0;
          field_cb = 0;
          for (var9 = 0; var9 < var7; var9++) {
            var10 = groups[var9];
            if (var10 < this.vertexGroups.length) {
              var35 = this.vertexGroups[var10];
              for (var12 = 0; var12 < var35.length; var12++) {
                var13 = var35[var12];
                field_v = field_v + this.verticesX[var13];
                field_mb = field_mb + this.verticesY[var13];
                field_cb = field_cb + this.verticesZ[var13];
                var8++;
              }
            }
          }
          if (var8 <= 0) {
            field_v = x;
            field_mb = y;
            field_cb = z;
          } else {
            field_v = field_v / var8 + x;
            field_mb = field_mb / var8 + y;
            field_cb = field_cb / var8 + z;
          }
          return;
        }
        if (transformType == 1) {
          for (var8Lifetime1 = 0; var8Lifetime1 < var7; var8Lifetime1++) {
            var9Lifetime1 = groups[var8Lifetime1];
            if (var9Lifetime1 < this.vertexGroups.length) {
              var36 = this.vertexGroups[var9Lifetime1];
              for (var11 = 0; var11 < var36.length; var11++) {
                var12Lifetime1 = var36[var11];
                this.verticesX[var12Lifetime1] = this.verticesX[var12Lifetime1] + x;
                this.verticesY[var12Lifetime1] = this.verticesY[var12Lifetime1] + y;
                this.verticesZ[var12Lifetime1] = this.verticesZ[var12Lifetime1] + z;
              }
            }
          }
          return;
        }
        if (transformType == 2) {
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime2 = groups[var8Lifetime2];
            if (var9Lifetime2 < this.vertexGroups.length) {
              var37 = this.vertexGroups[var9Lifetime2];
              for (var11Lifetime1 = 0; var11Lifetime1 < var37.length; var11Lifetime1++) {
                var12Lifetime2 = var37[var11Lifetime1];
                this.verticesX[var12Lifetime2] = this.verticesX[var12Lifetime2] - field_v;
                this.verticesY[var12Lifetime2] = this.verticesY[var12Lifetime2] - field_mb;
                this.verticesZ[var12Lifetime2] = this.verticesZ[var12Lifetime2] - field_cb;
                if (z != 0) {
                  var13Lifetime1 = tm.field_n[z];
                  var14 = tm.field_e[z];
                  var15 = this.verticesY[var12Lifetime2] * var13Lifetime1 + this.verticesX[var12Lifetime2] * var14 + 32767 >> 16;
                  this.verticesY[var12Lifetime2] = this.verticesY[var12Lifetime2] * var14 - this.verticesX[var12Lifetime2] * var13Lifetime1 + 32767 >> 16;
                  this.verticesX[var12Lifetime2] = var15;
                }
                if (x != 0) {
                  var13Lifetime1Lifetime1 = tm.field_n[x];
                  var14Lifetime2 = tm.field_e[x];
                  var15Lifetime2 = this.verticesY[var12Lifetime2] * var14Lifetime2 - this.verticesZ[var12Lifetime2] * var13Lifetime1Lifetime1 + 32767 >> 16;
                  this.verticesZ[var12Lifetime2] = this.verticesY[var12Lifetime2] * var13Lifetime1Lifetime1 + this.verticesZ[var12Lifetime2] * var14Lifetime2 + 32767 >> 16;
                  this.verticesY[var12Lifetime2] = var15Lifetime2;
                }
                if (y != 0) {
                  var13Lifetime1Lifetime2 = tm.field_n[y];
                  var14Lifetime3 = tm.field_e[y];
                  var15Lifetime3 = this.verticesZ[var12Lifetime2] * var13Lifetime1Lifetime2 + this.verticesX[var12Lifetime2] * var14Lifetime3 + 32767 >> 16;
                  this.verticesZ[var12Lifetime2] = this.verticesZ[var12Lifetime2] * var14Lifetime3 - this.verticesX[var12Lifetime2] * var13Lifetime1Lifetime2 + 32767 >> 16;
                  this.verticesX[var12Lifetime2] = var15Lifetime3;
                }
                this.verticesX[var12Lifetime2] = this.verticesX[var12Lifetime2] + field_v;
                this.verticesY[var12Lifetime2] = this.verticesY[var12Lifetime2] + field_mb;
                this.verticesZ[var12Lifetime2] = this.verticesZ[var12Lifetime2] + field_cb;
              }
            }
          }
          return;
        }
        if (transformType == 3) {
          for (var8Lifetime3 = 0; var8Lifetime3 < var7; var8Lifetime3++) {
            var9Lifetime3 = groups[var8Lifetime3];
            if (var9Lifetime3 < this.vertexGroups.length) {
              var38 = this.vertexGroups[var9Lifetime3];
              for (var11Lifetime2 = 0; var11Lifetime2 < var38.length; var11Lifetime2++) {
                var12Lifetime3 = var38[var11Lifetime2];
                this.verticesX[var12Lifetime3] = this.verticesX[var12Lifetime3] - field_v;
                this.verticesY[var12Lifetime3] = this.verticesY[var12Lifetime3] - field_mb;
                this.verticesZ[var12Lifetime3] = this.verticesZ[var12Lifetime3] - field_cb;
                this.verticesX[var12Lifetime3] = this.verticesX[var12Lifetime3] * x / 128;
                this.verticesY[var12Lifetime3] = this.verticesY[var12Lifetime3] * y / 128;
                this.verticesZ[var12Lifetime3] = this.verticesZ[var12Lifetime3] * z / 128;
                this.verticesX[var12Lifetime3] = this.verticesX[var12Lifetime3] + field_v;
                this.verticesY[var12Lifetime3] = this.verticesY[var12Lifetime3] + field_mb;
                this.verticesZ[var12Lifetime3] = this.verticesZ[var12Lifetime3] + field_cb;
              }
            }
          }
          return;
        }
        if (transformType != 5) {
          if (transformType != 7) {
            return;
          }
          if (this.faceGroups != null) {
            for (var8Lifetime4 = 0; var8Lifetime4 < var7; var8Lifetime4++) {
              var9Lifetime4 = groups[var8Lifetime4];
              if (var9Lifetime4 < this.faceGroups.length) {
                var40 = this.faceGroups[var9Lifetime4];
                for (var11Lifetime3 = 0; var11Lifetime3 < var40.length; var11Lifetime3++) {
                  var12Lifetime4 = var40[var11Lifetime3];
                  var13Lifetime2 = this.faceColors[var12Lifetime4] & 65535;
                  var14Lifetime1 = var13Lifetime2 >> 10 & 63;
                  var15Lifetime1 = var13Lifetime2 >> 7 & 7;
                  var16 = var13Lifetime2 & 127;
                  var14Lifetime1 = var14Lifetime1 + x & 63;
                  var15Lifetime1 = var15Lifetime1 + y;
                  if (var15Lifetime1 >= 0) {
                    if (var15Lifetime1 > 7) {
                      var15Lifetime1 = 7;
                    }
                  } else {
                    var15Lifetime1 = 0;
                  }
                  var16 = var16 + z;
                  if (var16 >= 0) {
                    if (var16 > 127) {
                      var16 = 127;
                    }
                  } else {
                    var16 = 0;
                  }
                  this.faceColors[var12Lifetime4] = (short)(var14Lifetime1 << 10 | var15Lifetime1 << 7 | var16);
                }
                this.field_db = true;
              }
            }
            return;
          }
        } else {
          if (this.faceGroups != null) {
            if (this.field_H != null) {
              for (var8Lifetime4 = 0; var8Lifetime4 < var7; var8Lifetime4++) {
                var9Lifetime4 = groups[var8Lifetime4];
                if (var9Lifetime4 < this.faceGroups.length) {
                  var39 = this.faceGroups[var9Lifetime4];
                  for (var11Lifetime3 = 0; var11Lifetime3 < var39.length; var11Lifetime3++) {
                    var12Lifetime4 = var39[var11Lifetime3];
                    var13Lifetime2 = (this.field_H[var12Lifetime4] & 255) + x * 8;
                    if (var13Lifetime2 >= 0) {
                      if (var13Lifetime2 > 255) {
                        var13Lifetime2 = 255;
                      }
                    } else {
                      var13Lifetime2 = 0;
                    }
                    this.field_H[var12Lifetime4] = (byte)var13Lifetime2;
                  }
                }
              }
              return;
            }
            return;
          }
        }
    }

    private final void d() {
        int var9 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var11;
        int var12;
        int var13;
        var1 = 32767;
        var2 = 32767;
        var3 = 32767;
        var4 = -32768;
        var5 = -32768;
        var6 = -32768;
        var7 = 0;
        var8 = 0;
        for (var9 = 0; var9 < this.referencedVertexCapacity; var9++) {
          var10 = this.verticesX[var9];
          var11 = this.verticesY[var9];
          var12 = this.verticesZ[var9];
          if (var10 < var1) {
            var1 = var10;
          }
          if (var10 > var4) {
            var4 = var10;
          }
          if (var11 < var2) {
            var2 = var11;
          }
          if (var11 > var5) {
            var5 = var11;
          }
          if (var12 < var3) {
            var3 = var12;
          }
          if (var12 > var6) {
            var6 = var12;
          }
          var13 = var10 * var10 + var12 * var12;
          if (var13 > var7) {
            var7 = var13;
          }
          var13 = var13 + var11 * var11;
          if (var13 > var8) {
            var8 = var13;
          }
        }
        Math.sqrt((double)var7);
        this.field_A = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_k = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7) {
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var23Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        int var25Lifetime3;
        try {
          if (!this.field_k) {
            this.d();
          }
          var10_int = tm.field_c;
          var11 = tm.field_j;
          var12 = tm.field_n[param0];
          var13 = tm.field_e[param0];
          var14 = tm.field_n[param1];
          var15 = tm.field_e[param1];
          var16 = tm.field_n[param2];
          var17 = tm.field_e[param2];
          var18 = tm.field_n[param3];
          var19 = tm.field_e[param3];
          var20 = param5 * var18 + param6 * var19 >> 16;
          for (var21 = 0; var21 < this.vertexCount; var21++) {
            var22 = this.verticesX[var21];
            var23 = this.verticesY[var21];
            var24 = this.verticesZ[var21];
            if (param2 != 0) {
              var25 = var23 * var16 + var22 * var17 >> 16;
              var23 = var23 * var17 - var22 * var16 >> 16;
              var22 = var25;
            }
            if (param0 != 0) {
              var25Lifetime1 = var23 * var13 - var24 * var12 >> 16;
              var24 = var23 * var12 + var24 * var13 >> 16;
              var23 = var25Lifetime1;
            }
            if (param1 != 0) {
              var25Lifetime2 = var24 * var14 + var22 * var15 >> 16;
              var24 = var24 * var15 - var22 * var14 >> 16;
              var22 = var25Lifetime2;
            }
            var22 = var22 + param4;
            var23 = var23 + param5;
            var24 = var24 + param6;
            var25Lifetime3 = var23 * var19 - var24 * var18 >> 16;
            var24 = var23 * var18 + var24 * var19 >> 16;
            var23Lifetime1 = var25Lifetime3;
            field_J[var21] = var24 - var20;
            field_B[var21] = var10_int + (var22 << 9) / var24;
            field_V[var21] = var11 + (var23Lifetime1 << 9) / var24;
            if (this.textureTriangleCount > 0) {
              field_X[var21] = var22;
              field_Q[var21] = var23Lifetime1;
              field_O[var21] = var24;
            }
          }
          this.a(false, param7 >= 0L ? true : false, param7, (int) this.field_A, this.field_A << 1);
        } catch (RuntimeException runtimeException) {
        }
    }

    private final void a(boolean param0, boolean param1, long param2, int param3, int param4) {
        int incrementValue$12 = 0;
        int dupTemp$10 = 0;
        int[] arrayValue$11 = null;
        int fieldTemp$7 = 0;
        int dupTemp$8 = 0;
        int[] arrayValue$9 = null;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int dupTemp$15 = 0;
        int[] arrayValue$16 = null;
        int dupTemp$17 = 0;
        int[] arrayValue$18 = null;
        int incrementValue$19 = 0;
        int dupTemp$2 = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$3 = 0;
        int stackIn_90_0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14_int;
        int[] var14;
        int var15_int;
        int[] var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int[] var45;
        int[] var46;
        int[] var47;
        int[] var48;
        int[] var49;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14_intLifetime1;
        int var15_intLifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var19Lifetime1;
        int var8Lifetime4;
        int var15_intLifetime2;
        int var16Lifetime2;
        int var13Lifetime1Lifetime1;
        int var14_intLifetime1Lifetime1;
        int var15_intLifetime1Lifetime1;
        if (param4 >= 1600) {
          return;
        }
        var7 = 0;
        if (!field_f) {
          for (var8 = 0; var8 < 1600; var8++) {
            field_T[var8] = 0;
          }
          for (var8Lifetime4 = 0; var8Lifetime4 < 32; var8Lifetime4++) {
            field_L[var8Lifetime4] = 0;
          }
          field_x = 0;
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < this.faceCount; var8Lifetime1++) {
          regionExit1: {
            if (this.field_R[var8Lifetime1] != -2) {
              var9 = this.faceVertexA[var8Lifetime1];
              var10 = this.faceVertexB[var8Lifetime1];
              var11 = this.faceVertexC[var8Lifetime1];
              var12 = field_B[var9];
              var13 = field_B[var10];
              var14_int = field_B[var11];
              if (param0 && (var12 == -5000 ||
                var13 == -5000 ||
                var14_int == -5000)) {
                var15_int = field_X[var9];
                var16 = field_X[var10];
                var17 = field_X[var11];
                var18 = field_Q[var9];
                var19 = field_Q[var10];
                var20 = field_Q[var11];
                var21 = field_O[var9];
                var22 = field_O[var10];
                var23 = field_O[var11];
                var15_int = var15_int - var16;
                var17 = var17 - var16;
                var18 = var18 - var19;
                var20 = var20 - var19;
                var21 = var21 - var22;
                var23 = var23 - var22;
                var24 = var18 * var23 - var21 * var20;
                var25 = var21 * var17 - var15_int * var23;
                var26 = var15_int * var20 - var18 * var17;
                if (!(var16 * var24 + var19 * var25 + var22 * var26 <= 0)) {
                  field_D[var8Lifetime1] = true;
                  if (field_f) {
                    field_hb[var7] = (field_J[var9] + field_J[var10] + field_J[var11]) / 3;
                    incrementValue$12 = var7;
                    var7++;
                    field_W[incrementValue$12] = var8Lifetime1;
                  } else {
                    var27 = (field_J[var9] + field_J[var10] + field_J[var11]) / 3 + param3;
                    if (field_T[var27] < 64) {
                      dupTemp$10 = field_T[var27];
                      arrayValue$11 = field_U[var27];
                      field_T[var27] = dupTemp$10 + 1;
                      arrayValue$11[dupTemp$10] = var8Lifetime1;
                    } else {
                      var28 = field_T[var27];
                      if (var28 == 64) {
                        if (field_x == 512) {
                          break regionExit1;
                        }
                        fieldTemp$7 = field_x;
                        field_x = field_x + 1;
                        var28 = 65 + fieldTemp$7;
                        field_T[var27] = 65 + fieldTemp$7;
                      }
                      var28 -= 65;
                      dupTemp$8 = field_L[var28];
                      arrayValue$9 = field_kb[var28];
                      field_L[var28] = dupTemp$8 + 1;
                      arrayValue$9[dupTemp$8] = var8Lifetime1;
                    }
                  }
                }
                break regionExit1;
              }
              if (param1 &&
                this.a(ot.field_G + tm.field_c, vl.field_j + tm.field_j, field_V[var9], field_V[var10], field_V[var11], var12, var13, var14_int)) {
                fieldTemp$13 = ws.field_O;
                ws.field_O = ws.field_O + 1;
                MoveAttackRequest.field_I[fieldTemp$13] = param2;
                param1 = false;
              }
              if ((var12 - var13) * (field_V[var11] - field_V[var10]) - (field_V[var9] - field_V[var10]) * (var14_int - var13) > 0) {
                field_D[var8Lifetime1] = false;
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var14_int >= 0 &&
                  var12 <= tm.field_l &&
                  var13 <= tm.field_l &&
                  var14_int <= tm.field_l) {
                  field_s[var8Lifetime1] = false;
                } else {
                  field_s[var8Lifetime1] = true;
                }
                if (!field_f) {
                  var15_intLifetime2 = (field_J[var9] + field_J[var10] + field_J[var11]) / 3 + param3;
                  if (field_T[var15_intLifetime2] >= 64) {
                    var16Lifetime2 = field_T[var15_intLifetime2];
                    if (var16Lifetime2 == 64) {
                      if (field_x == 512) {
                        break regionExit1;
                      }
                      fieldTemp$14 = field_x;
                      field_x = field_x + 1;
                      var16Lifetime2 = 65 + fieldTemp$14;
                      field_T[var15_intLifetime2] = 65 + fieldTemp$14;
                    }
                    var16Lifetime2 -= 65;
                    dupTemp$15 = field_L[var16Lifetime2];
                    arrayValue$16 = field_kb[var16Lifetime2];
                    field_L[var16Lifetime2] = dupTemp$15 + 1;
                    arrayValue$16[dupTemp$15] = var8Lifetime1;
                  } else {
                    dupTemp$17 = field_T[var15_intLifetime2];
                    arrayValue$18 = field_U[var15_intLifetime2];
                    field_T[var15_intLifetime2] = dupTemp$17 + 1;
                    arrayValue$18[dupTemp$17] = var8Lifetime1;
                  }
                } else {
                  field_hb[var7] = (field_J[var9] + field_J[var10] + field_J[var11]) / 3;
                  incrementValue$19 = var7;
                  var7++;
                  field_W[incrementValue$19] = var8Lifetime1;
                }
              }
            }
          }
        }
        if (field_f) {
          CorpseConditionMarker.a(var7 - 1, 0, (byte) -127, field_hb, field_W);
          if (this.field_ob == null) {
            for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
              this.b(field_W[var8Lifetime2]);
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_P[var8Lifetime2] = 0;
            field_h[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime1 = field_W[var8Lifetime2];
            var10Lifetime1 = field_hb[var8Lifetime2];
            var11Lifetime1 = this.field_ob[var9Lifetime1];
            dupTemp$2 = field_P[var11Lifetime1];
            field_P[var11Lifetime1] = dupTemp$2 + 1;
            var12Lifetime1 = dupTemp$2;
            field_j[var11Lifetime1][var12Lifetime1] = var9Lifetime1;
            if (var11Lifetime1 >= 10) {
              if (var11Lifetime1 != 10) {
                field_M[var12Lifetime1] = var10Lifetime1;
              } else {
                field_z[var12Lifetime1] = var10Lifetime1;
              }
            } else {
              field_h[var11Lifetime1] = field_h[var11Lifetime1] + var10Lifetime1;
            }
          }
        } else {
          if (this.field_ob == null) {
            for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
              var9Lifetime1 = field_T[var8Lifetime2];
              if (var9Lifetime1 > 0) {
                stackIn_90_0 = (var9Lifetime1 <= 64) ? var9Lifetime1 : 64;
                var10Lifetime1 = stackIn_90_0;
                var45 = field_U[var8Lifetime2];
                for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                  this.b(var45[var12Lifetime1]);
                }
              }
              if (var9Lifetime1 > 64) {
                var10Lifetime1 = field_T[var8Lifetime2] - 64 - 1;
                var46 = field_kb[var10Lifetime1];
                for (var12Lifetime1 = 0; var12Lifetime1 < field_L[var10Lifetime1]; var12Lifetime1++) {
                  this.b(var46[var12Lifetime1]);
                }
              }
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_P[var8Lifetime2] = 0;
            field_h[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
            var9Lifetime1 = field_T[var8Lifetime2];
            if (var9Lifetime1 > 0) {
              if (var9Lifetime1 <= 64) {
                var10Lifetime1 = var9Lifetime1;
              } else {
                var10Lifetime1 = 64;
              }
              var47 = field_U[var8Lifetime2];
              for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                var13Lifetime1 = var47[var12Lifetime1];
                var14_intLifetime1 = this.field_ob[var13Lifetime1];
                dupTemp$0 = field_P[var14_intLifetime1];
                field_P[var14_intLifetime1] = dupTemp$0 + 1;
                var15_intLifetime1 = dupTemp$0;
                field_j[var14_intLifetime1][var15_intLifetime1] = var13Lifetime1;
                if (var14_intLifetime1 >= 10) {
                  if (var14_intLifetime1 != 10) {
                    field_M[var15_intLifetime1] = var8Lifetime2;
                  } else {
                    field_z[var15_intLifetime1] = var8Lifetime2;
                  }
                } else {
                  field_h[var14_intLifetime1] = field_h[var14_intLifetime1] + var8Lifetime2;
                }
              }
            }
            if (var9Lifetime1 > 64) {
              var10Lifetime1 = field_T[var8Lifetime2] - 64 - 1;
              var48 = field_kb[var10Lifetime1];
              for (var12Lifetime1 = 0; var12Lifetime1 < field_L[var10Lifetime1]; var12Lifetime1++) {
                var13Lifetime1Lifetime1 = var48[var12Lifetime1];
                var14_intLifetime1Lifetime1 = this.field_ob[var13Lifetime1Lifetime1];
                dupTemp$1 = field_P[var14_intLifetime1Lifetime1];
                field_P[var14_intLifetime1Lifetime1] = dupTemp$1 + 1;
                var15_intLifetime1Lifetime1 = dupTemp$1;
                field_j[var14_intLifetime1Lifetime1][var15_intLifetime1Lifetime1] = var13Lifetime1Lifetime1;
                if (var14_intLifetime1Lifetime1 >= 10) {
                  if (var14_intLifetime1Lifetime1 != 10) {
                    field_M[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  } else {
                    field_z[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  }
                } else {
                  field_h[var14_intLifetime1Lifetime1] = field_h[var14_intLifetime1Lifetime1] + var8Lifetime2;
                }
              }
            }
          }
        }
        var8Lifetime3 = 0;
        if (!(field_P[1] <= 0) ||
          !(field_P[2] <= 0)) {
          var8Lifetime3 = (field_h[1] + field_h[2]) / (field_P[1] + field_P[2]);
        }
        var9Lifetime2 = 0;
        if (!(field_P[3] <= 0) ||
          !(field_P[4] <= 0)) {
          var9Lifetime2 = (field_h[3] + field_h[4]) / (field_P[3] + field_P[4]);
        }
        var10Lifetime2 = 0;
        if (!(field_P[6] <= 0) ||
          !(field_P[8] <= 0)) {
          var10Lifetime2 = (field_h[6] + field_h[8]) / (field_P[6] + field_P[8]);
        }
        var12Lifetime2 = 0;
        var13Lifetime2 = field_P[10];
        var14 = field_j[10];
        var15 = field_z;
        if (var12Lifetime2 == var13Lifetime2) {
          var12Lifetime2 = 0;
          var13Lifetime2 = field_P[11];
          var14 = field_j[11];
          var15 = field_M;
        }
        if (var12Lifetime2 >= var13Lifetime2) {
          var11Lifetime2 = -1000;
        } else {
          var11Lifetime2 = var15[var12Lifetime2];
        }
        for (var16Lifetime1 = 0; var16Lifetime1 < 10; var16Lifetime1++) {
          while (var16Lifetime1 == 0) {
            if (var11Lifetime2 > var8Lifetime3) {
              incrementValue$4 = var12Lifetime2;
              var12Lifetime2++;
              this.b(var14[incrementValue$4]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_j[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_P[11];
                var14 = field_j[11];
                var15 = field_M;
              }
              if (var12Lifetime2 >= var13Lifetime2) {
                var11Lifetime2 = -1000;
                continue;
              }
              var11Lifetime2 = var15[var12Lifetime2];
              continue;
            }
            break;
          }
          while (var16Lifetime1 == 3) {
            if (var11Lifetime2 > var9Lifetime2) {
              incrementValue$5 = var12Lifetime2;
              var12Lifetime2++;
              this.b(var14[incrementValue$5]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_j[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_P[11];
                var14 = field_j[11];
                var15 = field_M;
              }
              if (var12Lifetime2 >= var13Lifetime2) {
                var11Lifetime2 = -1000;
                continue;
              }
              var11Lifetime2 = var15[var12Lifetime2];
              continue;
            }
            break;
          }
          while (var16Lifetime1 == 5) {
            if (var11Lifetime2 > var10Lifetime2) {
              incrementValue$6 = var12Lifetime2;
              var12Lifetime2++;
              this.b(var14[incrementValue$6]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_j[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_P[11];
                var14 = field_j[11];
                var15 = field_M;
              }
              if (var12Lifetime2 >= var13Lifetime2) {
                var11Lifetime2 = -1000;
                continue;
              }
              var11Lifetime2 = var15[var12Lifetime2];
              continue;
            }
            break;
          }
          var17Lifetime1 = field_P[var16Lifetime1];
          var49 = field_j[var16Lifetime1];
          var29 = 0;
          var19Lifetime1 = var29;
          while (var29 < var17Lifetime1) {
            this.b(var49[var29]);
            var29++;
          }
        }
        while (var11Lifetime2 != -1000) {
          incrementValue$3 = var12Lifetime2;
          var12Lifetime2++;
          this.b(var14[incrementValue$3]);
          if (var12Lifetime2 == var13Lifetime2 &&
            var14 != field_j[11]) {
            var12Lifetime2 = 0;
            var14 = field_j[11];
            var13Lifetime2 = field_P[11];
            var15 = field_M;
          }
          if (var12Lifetime2 >= var13Lifetime2) {
            var11Lifetime2 = -1000;
            continue;
          }
          var11Lifetime2 = var15[var12Lifetime2];
        }
        return;
    }

    public static void c() {
        field_ib = null;
        field_u = null;
        field_C = null;
        field_gb = null;
        field_m = null;
        field_K = null;
        field_s = null;
        field_D = null;
        field_B = null;
        field_V = null;
        field_J = null;
        field_X = null;
        field_Q = null;
        field_O = null;
        field_T = null;
        field_U = (int[][]) null;
        field_L = null;
        field_kb = (int[][]) null;
        field_hb = null;
        field_W = null;
        field_P = null;
        field_j = (int[][]) null;
        field_z = null;
        field_M = null;
        field_h = null;
        field_n = null;
        field_eb = null;
        field_fb = null;
    }

    final void applyMaskedGroupTransform(int transformType, int[] groups, int x, int y, int z, boolean transformOption, int transformMask, int[] transformMatrix) {
        int var35_int = 0;
        int var42 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[] var16_ref_int__;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int[] var25;
        int var25_int;
        int var26;
        int var27;
        int var28;
        int[] var29;
        int var29_int;
        int var30;
        int var31;
        int[] var31_ref_int__;
        int var32;
        int var33;
        int var34;
        int[] var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var43;
        int var44;
        int var45;
        int var46;
        int[] var47;
        int[] var50;
        int[] var52;
        int[] var55;
        int[] var61;
        int[] var63;
        int[] var66;
        int[] var78;
        int[] var79;
        int[] var80;
        int[] var81;
        int[] var82;
        int[] var83;
        int[] var84;
        int[] var85;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var31Lifetime1;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        var9 = groups.length;
        if (transformType == 0) {
          var10 = 0;
          field_v = 0;
          field_mb = 0;
          field_cb = 0;
          for (var11 = 0; var11 < var9; var11++) {
            var12 = groups[var11];
            if (var12 < this.vertexGroups.length) {
              var78 = this.vertexGroups[var12];
              for (var14 = 0; var14 < var78.length; var14++) {
                var15 = var78[var14];
                if (this.field_e == null ||
                  (transformMask & this.field_e[var15]) != 0) {
                  field_v = field_v + this.verticesX[var15];
                  field_mb = field_mb + this.verticesY[var15];
                  field_cb = field_cb + this.verticesZ[var15];
                  var10++;
                }
              }
            }
          }
          if (var10 <= 0) {
            field_v = x;
            field_mb = y;
            field_cb = z;
          } else {
            field_v = field_v / var10 + x;
            field_mb = field_mb / var10 + y;
            field_cb = field_cb / var10 + z;
            field_y = true;
          }
          return;
        }
        if (transformType == 1) {
          if (transformMatrix != null) {
            var10Lifetime1 = transformMatrix[0] * x + transformMatrix[1] * y + transformMatrix[2] * z + 16384 >> 15;
            var11Lifetime1 = transformMatrix[3] * x + transformMatrix[4] * y + transformMatrix[5] * z + 16384 >> 15;
            var12Lifetime1 = transformMatrix[6] * x + transformMatrix[7] * y + transformMatrix[8] * z + 16384 >> 15;
            x = var10Lifetime1;
            y = var11Lifetime1;
            z = var12Lifetime1;
          }
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < var9; var10Lifetime1Lifetime1++) {
            var11Lifetime1Lifetime1 = groups[var10Lifetime1Lifetime1];
            if (var11Lifetime1Lifetime1 < this.vertexGroups.length) {
              var79 = this.vertexGroups[var11Lifetime1Lifetime1];
              for (var13 = 0; var13 < var79.length; var13++) {
                var14Lifetime1 = var79[var13];
                if (this.field_e == null ||
                  (transformMask & this.field_e[var14Lifetime1]) != 0) {
                  this.verticesX[var14Lifetime1] = this.verticesX[var14Lifetime1] + x;
                  this.verticesY[var14Lifetime1] = this.verticesY[var14Lifetime1] + y;
                  this.verticesZ[var14Lifetime1] = this.verticesZ[var14Lifetime1] + z;
                }
              }
            }
          }
          return;
        }
        if (transformType == 2) {
          if (transformMatrix == null) {
            for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
              var11Lifetime2 = groups[var10Lifetime2];
              if (var11Lifetime2 < this.vertexGroups.length) {
                var81 = this.vertexGroups[var11Lifetime2];
                for (var13Lifetime1 = 0; var13Lifetime1 < var81.length; var13Lifetime1++) {
                  var14Lifetime2 = var81[var13Lifetime1];
                  if (this.field_e == null ||
                    (transformMask & this.field_e[var14Lifetime2]) != 0) {
                    this.verticesX[var14Lifetime2] = this.verticesX[var14Lifetime2] - field_v;
                    this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] - field_mb;
                    this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] - field_cb;
                    if (z != 0) {
                      var15Lifetime1 = tm.field_n[z];
                      var16 = tm.field_e[z];
                      var17 = this.verticesY[var14Lifetime2] * var15Lifetime1 + this.verticesX[var14Lifetime2] * var16 + 32767 >> 16;
                      this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] * var16 - this.verticesX[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.verticesX[var14Lifetime2] = var17;
                    }
                    if (x != 0) {
                      var15Lifetime1 = tm.field_n[x];
                      var16 = tm.field_e[x];
                      var17 = this.verticesY[var14Lifetime2] * var16 - this.verticesZ[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.verticesZ[var14Lifetime2] = this.verticesY[var14Lifetime2] * var15Lifetime1 + this.verticesZ[var14Lifetime2] * var16 + 32767 >> 16;
                      this.verticesY[var14Lifetime2] = var17;
                    }
                    if (y != 0) {
                      var15Lifetime1 = tm.field_n[y];
                      var16 = tm.field_e[y];
                      var17 = this.verticesZ[var14Lifetime2] * var15Lifetime1 + this.verticesX[var14Lifetime2] * var16 + 32767 >> 16;
                      this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] * var16 - this.verticesX[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.verticesX[var14Lifetime2] = var17;
                    }
                    this.verticesX[var14Lifetime2] = this.verticesX[var14Lifetime2] + field_v;
                    this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] + field_mb;
                    this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] + field_cb;
                  }
                }
              }
            }
            return;
          }
          var10Lifetime2 = transformMatrix[9];
          var11Lifetime2 = transformMatrix[10];
          var12Lifetime2 = transformMatrix[11];
          var13Lifetime1 = transformMatrix[12];
          var14Lifetime2 = transformMatrix[13];
          var15Lifetime1 = transformMatrix[14];
          if (field_y) {
            var16 = transformMatrix[0] * field_v + transformMatrix[3] * field_mb + transformMatrix[6] * field_cb + 16384 >> 15;
            var17 = transformMatrix[1] * field_v + transformMatrix[4] * field_mb + transformMatrix[7] * field_cb + 16384 >> 15;
            var18 = transformMatrix[2] * field_v + transformMatrix[5] * field_mb + transformMatrix[8] * field_cb + 16384 >> 15;
            var16 = var16 + var13Lifetime1;
            var17 = var17 + var14Lifetime2;
            var18 = var18 + var15Lifetime1;
            field_v = var16;
            field_mb = var17;
            field_cb = var18;
            field_y = false;
          }
          var61 = new int[9];
          var50 = var61;
          var16_ref_int__ = var50;
          var17 = tm.field_e[x] >> 1;
          var18 = tm.field_n[x] >> 1;
          var19 = tm.field_e[y] >> 1;
          var20 = tm.field_n[y] >> 1;
          var21 = tm.field_e[z] >> 1;
          var22 = tm.field_n[z] >> 1;
          var23 = var18 * var21 + 16384 >> 15;
          var24 = var18 * var22 + 16384 >> 15;
          var16_ref_int__[0] = var19 * var21 + var20 * var24 + 16384 >> 15;
          var16_ref_int__[1] = -var19 * var22 + var20 * var23 + 16384 >> 15;
          var16_ref_int__[2] = var20 * var17 + 16384 >> 15;
          var16_ref_int__[3] = var17 * var22 + 16384 >> 15;
          var16_ref_int__[4] = var17 * var21 + 16384 >> 15;
          var16_ref_int__[5] = -var18;
          var16_ref_int__[6] = -var20 * var21 + var19 * var24 + 16384 >> 15;
          var16_ref_int__[7] = var20 * var22 + var19 * var23 + 16384 >> 15;
          var16_ref_int__[8] = var19 * var17 + 16384 >> 15;
          var25_int = var61[0] * -field_v + var61[1] * -field_mb + var61[2] * -field_cb + 16384 >> 15;
          var26 = var61[3] * -field_v + var61[4] * -field_mb + var61[5] * -field_cb + 16384 >> 15;
          var27 = var61[6] * -field_v + var61[7] * -field_mb + var61[8] * -field_cb + 16384 >> 15;
          var28 = var25_int + field_v;
          var29_int = var26 + field_mb;
          var30 = var27 + field_cb;
          var31_ref_int__ = new int[9];
          for (var32 = 0; var32 < 3; var32++) {
            for (var33 = 0; var33 < 3; var33++) {
              var34 = 0;
              for (var35_int = 0; var35_int < 3; var35_int++) {
                var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * transformMatrix[var33 * 3 + var35_int];
              }
              var31_ref_int__[var32 * 3 + var33] = var34 + 16384 >> 15;
            }
          }
          var32 = var61[0] * var13Lifetime1 + var61[1] * var14Lifetime2 + var61[2] * var15Lifetime1 + 16384 >> 15;
          var33 = var61[3] * var13Lifetime1 + var61[4] * var14Lifetime2 + var61[5] * var15Lifetime1 + 16384 >> 15;
          var34 = var61[6] * var13Lifetime1 + var61[7] * var14Lifetime2 + var61[8] * var15Lifetime1 + 16384 >> 15;
          var32 = var32 + var28;
          var33 = var33 + var29_int;
          var34 = var34 + var30;
          var63 = new int[9];
          var52 = var63;
          var47 = var52;
          var35 = var47;
          for (var36 = 0; var36 < 3; var36++) {
            for (var37 = 0; var37 < 3; var37++) {
              var38 = 0;
              for (var39 = 0; var39 < 3; var39++) {
                var38 = var38 + transformMatrix[var36 * 3 + var39] * var31_ref_int__[var37 + var39 * 3];
              }
              var35[var36 * 3 + var37] = var38 + 16384 >> 15;
            }
          }
          var36 = transformMatrix[0] * var32 + transformMatrix[1] * var33 + transformMatrix[2] * var34 + 16384 >> 15;
          var37 = transformMatrix[3] * var32 + transformMatrix[4] * var33 + transformMatrix[5] * var34 + 16384 >> 15;
          var38 = transformMatrix[6] * var32 + transformMatrix[7] * var33 + transformMatrix[8] * var34 + 16384 >> 15;
          var36 = var36 + var10Lifetime2;
          var37 = var37 + var11Lifetime2;
          var38 = var38 + var12Lifetime2;
          for (var39 = 0; var39 < var9; var39++) {
            var40 = groups[var39];
            if (var40 < this.vertexGroups.length) {
              var80 = this.vertexGroups[var40];
              for (var42 = 0; var42 < var80.length; var42++) {
                var43 = var80[var42];
                if (this.field_e == null ||
                  (transformMask & this.field_e[var43]) != 0) {
                  var44 = var63[0] * this.verticesX[var43] + var63[1] * this.verticesY[var43] + var63[2] * this.verticesZ[var43] + 16384 >> 15;
                  var45 = var63[3] * this.verticesX[var43] + var63[4] * this.verticesY[var43] + var63[5] * this.verticesZ[var43] + 16384 >> 15;
                  var46 = var63[6] * this.verticesX[var43] + var63[7] * this.verticesY[var43] + var63[8] * this.verticesZ[var43] + 16384 >> 15;
                  var44 = var44 + var36;
                  var45 = var45 + var37;
                  var46 = var46 + var38;
                  this.verticesX[var43] = var44;
                  this.verticesY[var43] = var45;
                  this.verticesZ[var43] = var46;
                }
              }
            }
          }
        } else {
          if (transformType != 3) {
            if (transformType != 5) {
              if (transformType != 7) {
                return;
              }
              if (this.faceGroups != null) {
                for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
                  var11Lifetime2 = groups[var10Lifetime2];
                  if (var11Lifetime2 < this.faceGroups.length) {
                    var85 = this.faceGroups[var11Lifetime2];
                    for (var13Lifetime1 = 0; var13Lifetime1 < var85.length; var13Lifetime1++) {
                      var14Lifetime2 = var85[var13Lifetime1];
                      if (this.field_g == null ||
                        (transformMask & this.field_g[var14Lifetime2]) != 0) {
                        var15Lifetime1 = this.faceColors[var14Lifetime2] & 65535;
                        var16 = var15Lifetime1 >> 10 & 63;
                        var17 = var15Lifetime1 >> 7 & 7;
                        var18 = var15Lifetime1 & 127;
                        var16 = var16 + x & 63;
                        var17 = var17 + y;
                        if (var17 >= 0) {
                          if (var17 > 7) {
                            var17 = 7;
                          }
                        } else {
                          var17 = 0;
                        }
                        var18 = var18 + z;
                        if (var18 >= 0) {
                          if (var18 > 127) {
                            var18 = 127;
                          }
                        } else {
                          var18 = 0;
                        }
                        this.faceColors[var14Lifetime2] = (short)(var16 << 10 | var17 << 7 | var18);
                      }
                    }
                    this.field_db = true;
                  }
                }
                return;
              }
            } else {
              if (this.faceGroups != null) {
                if (this.field_H != null) {
                  for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
                    var11Lifetime2 = groups[var10Lifetime2];
                    if (var11Lifetime2 < this.faceGroups.length) {
                      var84 = this.faceGroups[var11Lifetime2];
                      for (var13Lifetime1 = 0; var13Lifetime1 < var84.length; var13Lifetime1++) {
                        var14Lifetime2 = var84[var13Lifetime1];
                        if (this.field_g == null ||
                          (transformMask & this.field_g[var14Lifetime2]) != 0) {
                          var15Lifetime1 = (this.field_H[var14Lifetime2] & 255) + x * 8;
                          if (var15Lifetime1 >= 0) {
                            if (var15Lifetime1 > 255) {
                              var15Lifetime1 = 255;
                            }
                          } else {
                            var15Lifetime1 = 0;
                          }
                          this.field_H[var14Lifetime2] = (byte)var15Lifetime1;
                        }
                      }
                    }
                  }
                  return;
                }
                return;
              }
            }
            return;
          }
          if (transformMatrix == null) {
            for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
              var11Lifetime2 = groups[var10Lifetime2];
              if (var11Lifetime2 < this.vertexGroups.length) {
                var83 = this.vertexGroups[var11Lifetime2];
                for (var13Lifetime1 = 0; var13Lifetime1 < var83.length; var13Lifetime1++) {
                  var14Lifetime2 = var83[var13Lifetime1];
                  if (this.field_e == null ||
                    (transformMask & this.field_e[var14Lifetime2]) != 0) {
                    this.verticesX[var14Lifetime2] = this.verticesX[var14Lifetime2] - field_v;
                    this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] - field_mb;
                    this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] - field_cb;
                    this.verticesX[var14Lifetime2] = this.verticesX[var14Lifetime2] * x / 128;
                    this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] * y / 128;
                    this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] * z / 128;
                    this.verticesX[var14Lifetime2] = this.verticesX[var14Lifetime2] + field_v;
                    this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] + field_mb;
                    this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] + field_cb;
                  }
                }
              }
            }
            return;
          }
          var10Lifetime2 = transformMatrix[9];
          var11Lifetime2 = transformMatrix[10];
          var12Lifetime2 = transformMatrix[11];
          var13Lifetime1 = transformMatrix[12];
          var14Lifetime2 = transformMatrix[13];
          var15Lifetime1 = transformMatrix[14];
          if (field_y) {
            var16 = transformMatrix[0] * field_v + transformMatrix[3] * field_mb + transformMatrix[6] * field_cb + 16384 >> 15;
            var17 = transformMatrix[1] * field_v + transformMatrix[4] * field_mb + transformMatrix[7] * field_cb + 16384 >> 15;
            var18 = transformMatrix[2] * field_v + transformMatrix[5] * field_mb + transformMatrix[8] * field_cb + 16384 >> 15;
            var16 = var16 + var13Lifetime1;
            var17 = var17 + var14Lifetime2;
            var18 = var18 + var15Lifetime1;
            field_v = var16;
            field_mb = var17;
            field_cb = var18;
            field_y = false;
          }
          var16 = x << 15 >> 7;
          var17 = y << 15 >> 7;
          var18 = z << 15 >> 7;
          var19 = var16 * -field_v + 16384 >> 15;
          var20 = var17 * -field_mb + 16384 >> 15;
          var21 = var18 * -field_cb + 16384 >> 15;
          var22 = var19 + field_v;
          var23 = var20 + field_mb;
          var24 = var21 + field_cb;
          var25 = new int[9];
          var25[0] = var16 * transformMatrix[0] + 16384 >> 15;
          var25[1] = var16 * transformMatrix[3] + 16384 >> 15;
          var25[2] = var16 * transformMatrix[6] + 16384 >> 15;
          var25[3] = var17 * transformMatrix[1] + 16384 >> 15;
          var25[4] = var17 * transformMatrix[4] + 16384 >> 15;
          var25[5] = var17 * transformMatrix[7] + 16384 >> 15;
          var25[6] = var18 * transformMatrix[2] + 16384 >> 15;
          var25[7] = var18 * transformMatrix[5] + 16384 >> 15;
          var25[8] = var18 * transformMatrix[8] + 16384 >> 15;
          var26 = var16 * var13Lifetime1 + 16384 >> 15;
          var27 = var17 * var14Lifetime2 + 16384 >> 15;
          var28 = var18 * var15Lifetime1 + 16384 >> 15;
          var26 = var26 + var22;
          var27 = var27 + var23;
          var28 = var28 + var24;
          var66 = new int[9];
          var55 = var66;
          var29 = var55;
          for (var30 = 0; var30 < 3; var30++) {
            for (var31 = 0; var31 < 3; var31++) {
              var32 = 0;
              for (var33 = 0; var33 < 3; var33++) {
                var32 = var32 + transformMatrix[var30 * 3 + var33] * var25[var31 + var33 * 3];
              }
              var29[var30 * 3 + var31] = var32 + 16384 >> 15;
            }
          }
          var30 = transformMatrix[0] * var26 + transformMatrix[1] * var27 + transformMatrix[2] * var28 + 16384 >> 15;
          var31Lifetime1 = transformMatrix[3] * var26 + transformMatrix[4] * var27 + transformMatrix[5] * var28 + 16384 >> 15;
          var32 = transformMatrix[6] * var26 + transformMatrix[7] * var27 + transformMatrix[8] * var28 + 16384 >> 15;
          var30 = var30 + var10Lifetime2;
          var31Lifetime1 = var31Lifetime1 + var11Lifetime2;
          var32 = var32 + var12Lifetime2;
          for (var33 = 0; var33 < var9; var33++) {
            var34 = groups[var33];
            if (var34 < this.vertexGroups.length) {
              var82 = this.vertexGroups[var34];
              for (var36 = 0; var36 < var82.length; var36++) {
                var37 = var82[var36];
                if (this.field_e == null ||
                  (transformMask & this.field_e[var37]) != 0) {
                  var38 = var66[0] * this.verticesX[var37] + var66[1] * this.verticesY[var37] + var66[2] * this.verticesZ[var37] + 16384 >> 15;
                  var39 = var66[3] * this.verticesX[var37] + var66[4] * this.verticesY[var37] + var66[5] * this.verticesZ[var37] + 16384 >> 15;
                  var40 = var66[6] * this.verticesX[var37] + var66[7] * this.verticesY[var37] + var66[8] * this.verticesZ[var37] + 16384 >> 15;
                  var38 = var38 + var30;
                  var39 = var39 + var31Lifetime1;
                  var40 = var40 + var32;
                  this.verticesX[var37] = var38;
                  this.verticesY[var37] = var39;
                  this.verticesZ[var37] = var40;
                }
              }
            }
          }
        }
    }

    private ModelMesh() {
        this.faceCount = 0;
        this.textureTriangleCount = 0;
        this.vertexCount = 0;
        this.field_k = false;
        this.field_db = false;
        this.referencedVertexCapacity = 0;
    }

    ModelMesh(MeshData param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        VertexNormal var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        FaceNormal var18;
        FaceNormal var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.faceCount = 0;
        this.textureTriangleCount = 0;
        this.vertexCount = 0;
        this.field_k = false;
        this.field_db = false;
        this.referencedVertexCapacity = 0;
        param0.calculateNormals();
        param0.buildSkinGroups();
        this.vertexCount = param0.vertexCount;
        this.referencedVertexCapacity = param0.referencedVertexCapacity;
        this.verticesX = param0.verticesX;
        this.verticesY = param0.verticesY;
        this.verticesZ = param0.verticesZ;
        this.faceCount = param0.faceCount;
        this.faceVertexA = param0.faceVertexA;
        this.faceVertexB = param0.faceVertexB;
        this.faceVertexC = param0.faceVertexC;
        this.field_ob = param0.field_w;
        this.field_H = param0.faceAlpha;
        this.faceColors = param0.faceColors;
        this.vertexGroups = param0.vertexGroups;
        this.faceGroups = param0.faceGroups;
        this.field_g = param0.field_A;
        this.field_e = param0.field_j;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_Z = new int[this.faceCount];
        this.field_t = new int[this.faceCount];
        this.field_R = new int[this.faceCount];
        if (param0.faceTextureIds != null) {
          this.field_ab = new short[this.faceCount];
          for (var9 = 0; var9 < this.faceCount; var9++) {
            var10 = param0.faceTextureIds[var9];
            if (var10 != -1 &&
              tm.field_o.a(true, var10)) {
              this.field_ab[var9] = (short)var10;
            } else {
              this.field_ab[var9] = (short)-1;
            }
          }
        } else {
          this.field_ab = null;
        }
        if (param0.field_E > 0 &&
          param0.field_G != null) {
          var20 = new int[param0.field_E];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.faceCount; var10Lifetime1++) {
            if (param0.field_G[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_G[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.textureTriangleCount = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_E; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_t[var10Lifetime1Lifetime1] == 0) {
              this.textureTriangleCount = this.textureTriangleCount + 1;
            }
          }
          this.textureVertexA = new int[this.textureTriangleCount];
          this.textureVertexB = new int[this.textureTriangleCount];
          this.textureVertexC = new int[this.textureTriangleCount];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_E; var11++) {
            if (var20[var11] > 0 &&
              param0.field_t[var11] == 0) {
              this.textureVertexA[var10Lifetime1Lifetime2] = param0.field_M[var11] & 65535;
              this.textureVertexB[var10Lifetime1Lifetime2] = param0.field_n[var11] & 65535;
              this.textureVertexC[var10Lifetime1Lifetime2] = param0.field_C[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_lb = new byte[this.faceCount];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.faceCount; var11Lifetime2++) {
            if (param0.field_G[var11Lifetime2] == -1) {
              this.field_lb[var11Lifetime2] = (byte)-1;
            } else {
              this.field_lb[var11Lifetime2] = (byte)var9_ref_int__[param0.field_G[var11Lifetime2] & 255];
              if (this.field_lb[var11Lifetime2] == -1 &&
                this.field_ab != null) {
                this.field_ab[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.faceCount) {
          if (param0.faceRenderTypes != null) {
            var10Lifetime2 = param0.faceRenderTypes[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (param0.faceAlpha != null) {
            var11Lifetime1 = param0.faceAlpha[var16];
          } else {
            var11Lifetime1 = 0;
          }
          if (this.field_ab != null) {
            var12 = this.field_ab[var16];
          } else {
            var12 = -1;
          }
          if (var11Lifetime1 == -2) {
            var10Lifetime2 = 3;
          }
          if (var11Lifetime1 == -1) {
            var10Lifetime2 = 2;
          }
          if (var12 != -1) {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                this.field_R[var16] = -2;
              } else {
                var19 = param0.faceNormals[var16];
                var14 = param1 + (param3 * var19.x + param4 * var19.y + param5 * var19.z) / (var8 + var8 / 2);
                this.field_Z[var16] = ModelMesh.d(var14);
                this.field_R[var16] = -1;
              }
            } else {
              if (param0.field_g != null &&
                param0.field_g[this.faceVertexA[var16]] != null) {
                var13 = param0.field_g[this.faceVertexA[var16]];
              } else {
                var13 = param0.vertexNormals[this.faceVertexA[var16]];
              }
              var14 = param1 + (param3 * var13.x + param4 * var13.y + param5 * var13.z) / (var8 * var13.contributions);
              this.field_Z[var16] = ModelMesh.d(var14);
              if (param0.field_g != null &&
                param0.field_g[this.faceVertexB[var16]] != null) {
                var13 = param0.field_g[this.faceVertexB[var16]];
              } else {
                var13 = param0.vertexNormals[this.faceVertexB[var16]];
              }
              var14 = param1 + (param3 * var13.x + param4 * var13.y + param5 * var13.z) / (var8 * var13.contributions);
              this.field_t[var16] = ModelMesh.d(var14);
              if (param0.field_g != null &&
                param0.field_g[this.faceVertexC[var16]] != null) {
                var13 = param0.field_g[this.faceVertexC[var16]];
              } else {
                var13 = param0.vertexNormals[this.faceVertexC[var16]];
              }
              var14 = param1 + (param3 * var13.x + param4 * var13.y + param5 * var13.z) / (var8 * var13.contributions);
              this.field_R[var16] = ModelMesh.d(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_R[var16] = -2;
                } else {
                  this.field_Z[var16] = 128;
                  this.field_R[var16] = -1;
                }
              } else {
                var18 = param0.faceNormals[var16];
                var14 = param1 + (param3 * var18.x + param4 * var18.y + param5 * var18.z) / (var8 + var8 / 2) << 17;
                this.field_Z[var16] = var14 | ModelMesh.a(param0.faceColors[var16] & 65535, var14 >> 17);
                this.field_R[var16] = -1;
              }
            } else {
              var15 = param0.faceColors[var16] & 65535;
              if (param0.field_g != null &&
                param0.field_g[this.faceVertexA[var16]] != null) {
                var13 = param0.field_g[this.faceVertexA[var16]];
              } else {
                var13 = param0.vertexNormals[this.faceVertexA[var16]];
              }
              var14 = param1 + (param3 * var13.x + param4 * var13.y + param5 * var13.z) / (var8 * var13.contributions) << 17;
              this.field_Z[var16] = var14 | ModelMesh.a(var15, var14 >> 17);
              if (param0.field_g != null &&
                param0.field_g[this.faceVertexB[var16]] != null) {
                var13 = param0.field_g[this.faceVertexB[var16]];
              } else {
                var13 = param0.vertexNormals[this.faceVertexB[var16]];
              }
              var14 = param1 + (param3 * var13.x + param4 * var13.y + param5 * var13.z) / (var8 * var13.contributions) << 17;
              this.field_t[var16] = var14 | ModelMesh.a(var15, var14 >> 17);
              if (param0.field_g != null &&
                param0.field_g[this.faceVertexC[var16]] != null) {
                var13 = param0.field_g[this.faceVertexC[var16]];
              } else {
                var13 = param0.vertexNormals[this.faceVertexC[var16]];
              }
              var14 = param1 + (param3 * var13.x + param4 * var13.y + param5 * var13.z) / (var8 * var13.contributions) << 17;
              this.field_R[var16] = var14 | ModelMesh.a(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    static {
        field_ib = new ModelMesh();
        field_gb = new int[1];
        field_u = new byte[1];
        field_C = new short[1];
        field_K = new int[1];
        field_m = new int[1];
        ModelMesh discarded$0 = new ModelMesh();
        ModelMesh discarded$1 = new ModelMesh();
        field_y = false;
        field_M = new int[4096];
        field_eb = new int[10];
        field_h = new int[12];
        field_V = new int[4096];
        field_s = new boolean[4096];
        field_P = new int[12];
        field_D = new boolean[4096];
        field_z = new int[4096];
        field_n = new int[10];
        field_X = new int[4096];
        field_x = 0;
        field_f = false;
        field_B = new int[4096];
        field_J = new int[4096];
        field_O = new int[4096];
        field_Q = new int[4096];
        field_j = new int[12][4096];
        if (field_f) {
          field_hb = new int[4096];
          field_W = new int[4096];
        } else {
          field_T = new int[1600];
          field_U = new int[1600][64];
          field_L = new int[32];
          field_kb = new int[32][512];
        }
        field_fb = new int[10];
    }
}
