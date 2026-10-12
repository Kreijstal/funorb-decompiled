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
    private byte[] faceAlpha;
    private boolean boundsValid;
    private int[] verticesZ;
    private int[] faceVertexA;
    private int[] faceVertexB;
    private int textureTriangleCount;
    private short boundingRadius;
    int[] field_Z;
    private byte[] field_ob;
    int vertexCount;
    int[] verticesY;
    private boolean faceColorsDirty;
    private int[][] faceGroups;
    private int[] verticesX;
    private int[][] vertexGroups;
    private int[] textureVertexA;
    private static ModelMesh field_ib;
    private short[] faceColors;
    int[] field_t;
    private int referencedVertexCapacity;
    private short[] faceTransformMasks;
    private int[] faceVertexC;
    private short[] vertexTransformMasks;
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
    private static int animationPivotZ;
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
    private static int animationPivotX;
    private static int[] field_T;
    private static int[] field_L;
    private static int[] field_J;
    private static int animationPivotY;
    private static int[] field_Q;
    private static int[] field_fb;

    private final void refreshFaceLighting() {
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
        if (this.faceColorsDirty) {
          this.refreshFaceLighting();
          this.faceColorsDirty = false;
        }
        this.boundsValid = false;
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
        var2 = TriangleRasterizer.projectionCenterX;
        var3 = TriangleRasterizer.projectionCenterY;
        var4 = 0;
        var5 = this.faceVertexA[param0];
        var6 = this.faceVertexB[param0];
        var7 = this.faceVertexC[param0];
        var8 = field_O[var5];
        var9 = field_O[var6];
        var10 = field_O[var7];
        if (this.faceAlpha != null) {
          TriangleRasterizer.blendAlpha = this.faceAlpha[param0] & 255;
        } else {
          TriangleRasterizer.blendAlpha = 0;
        }
        if (var8 < 50) {
          var11 = field_X[var5];
          var12 = field_Q[var5];
          var13 = this.field_Z[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * TriangleRasterizer.field_m[var10 - var8];
            field_n[var4] = var2 + (var11 + ((field_X[var7] - var11) * var14 >> 16) << 9) / 50;
            field_eb[var4] = var3 + (var12 + ((field_Q[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_fb[incrementValue$0] = var13 + (((this.field_R[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * TriangleRasterizer.field_m[var9 - var8];
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
            var14Lifetime1 = (50 - var9) * TriangleRasterizer.field_m[var8 - var9];
            field_n[var4] = var2 + (var11Lifetime1 + ((field_X[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_eb[var4] = var3 + (var12Lifetime1 + ((field_Q[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_fb[incrementValue$3] = var13Lifetime1 + (((this.field_Z[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * TriangleRasterizer.field_m[var10 - var9];
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
            var14Lifetime2 = (50 - var10) * TriangleRasterizer.field_m[var9 - var10];
            field_n[var4] = var2 + (var11Lifetime2 + ((field_X[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_eb[var4] = var3 + (var12Lifetime2 + ((field_Q[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_fb[incrementValue$6] = var13Lifetime2 + (((this.field_t[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * TriangleRasterizer.field_m[var8 - var10];
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
        TriangleRasterizer.clipHorizontalSpans = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= TriangleRasterizer.clipWidth) ||
            !(var12Lifetime3 <= TriangleRasterizer.clipWidth) ||
            !(var13Lifetime3 <= TriangleRasterizer.clipWidth)) {
            TriangleRasterizer.clipHorizontalSpans = true;
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
              TriangleRasterizer.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_fb[0], field_fb[1], field_fb[2], field_X[var17], field_X[var18], field_X[var19], field_Q[var17], field_Q[var18], field_Q[var19], field_O[var17], field_O[var18], field_O[var19], (int) this.field_ab[param0]);
            } else {
              TriangleRasterizer.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_X[var17], field_X[var18], field_X[var19], field_Q[var17], field_Q[var18], field_Q[var19], field_O[var17], field_O[var18], field_O[var19], (int) this.field_ab[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_R[param0] != -1) {
              TriangleRasterizer.drawShadedTriangle(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_fb[0], field_fb[1], field_fb[2]);
            } else {
              TriangleRasterizer.drawFlatTriangle(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, TriangleRasterizer.colorPalette[this.field_Z[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= TriangleRasterizer.clipWidth) ||
          !(var12Lifetime3 <= TriangleRasterizer.clipWidth) ||
          !(var13Lifetime3 <= TriangleRasterizer.clipWidth) ||
          !(field_n[3] >= 0) ||
          !(field_n[3] <= TriangleRasterizer.clipWidth)) {
          TriangleRasterizer.clipHorizontalSpans = true;
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
            TriangleRasterizer.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_fb[0], field_fb[1], field_fb[2], field_X[var17Lifetime1], field_X[var18Lifetime1], field_X[var19Lifetime1], field_Q[var17Lifetime1], field_Q[var18Lifetime1], field_Q[var19Lifetime1], field_O[var17Lifetime1], field_O[var18Lifetime1], field_O[var19Lifetime1], var20Lifetime1Lifetime1);
            TriangleRasterizer.a(var14Lifetime3, var16, field_eb[3], var11Lifetime3, var13Lifetime3, field_n[3], field_fb[0], field_fb[2], field_fb[3], field_X[var17Lifetime1], field_X[var18Lifetime1], field_X[var19Lifetime1], field_Q[var17Lifetime1], field_Q[var18Lifetime1], field_Q[var19Lifetime1], field_O[var17Lifetime1], field_O[var18Lifetime1], field_O[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            TriangleRasterizer.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_X[var17Lifetime1], field_X[var18Lifetime1], field_X[var19Lifetime1], field_Q[var17Lifetime1], field_Q[var18Lifetime1], field_Q[var19Lifetime1], field_O[var17Lifetime1], field_O[var18Lifetime1], field_O[var19Lifetime1], var20Lifetime1Lifetime1);
            TriangleRasterizer.a(var14Lifetime3, var16, field_eb[3], var11Lifetime3, var13Lifetime3, field_n[3], this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_X[var17Lifetime1], field_X[var18Lifetime1], field_X[var19Lifetime1], field_Q[var17Lifetime1], field_Q[var18Lifetime1], field_Q[var19Lifetime1], field_O[var17Lifetime1], field_O[var18Lifetime1], field_O[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_R[param0] != -1) {
            TriangleRasterizer.drawShadedTriangle(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_fb[0], field_fb[1], field_fb[2]);
            TriangleRasterizer.drawShadedTriangle(var14Lifetime3, var16, field_eb[3], var11Lifetime3, var13Lifetime3, field_n[3], field_fb[0], field_fb[2], field_fb[3]);
          } else {
            var17Lifetime1 = TriangleRasterizer.colorPalette[this.field_Z[param0] & 65535];
            TriangleRasterizer.drawFlatTriangle(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            TriangleRasterizer.drawFlatTriangle(var14Lifetime3, var16, field_eb[3], var11Lifetime3, var13Lifetime3, field_n[3], var17Lifetime1);
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
        animationPivotX = 0;
        animationPivotY = 0;
        animationPivotZ = 0;
        return true;
    }

    final void scaleGeometry(int scaleX, int scaleY, int scaleZ) {
        int var4 = 0;
        for (var4 = 0; var4 < this.vertexCount; var4++) {
          this.verticesX[var4] = this.verticesX[var4] * scaleX / 128;
          this.verticesY[var4] = this.verticesY[var4] * scaleY / 128;
          this.verticesZ[var4] = this.verticesZ[var4] * scaleZ / 128;
        }
        this.boundsValid = false;
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
        TriangleRasterizer.clipHorizontalSpans = field_s[param0];
        if (this.faceAlpha != null) {
          TriangleRasterizer.blendAlpha = this.faceAlpha[param0] & 255;
        } else {
          TriangleRasterizer.blendAlpha = 0;
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
            TriangleRasterizer.a(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], this.field_Z[param0], this.field_t[param0], this.field_R[param0], field_X[var5], field_X[var6], field_X[var7], field_Q[var5], field_Q[var6], field_Q[var7], field_O[var5], field_O[var6], field_O[var7], (int) this.field_ab[param0]);
          } else {
            TriangleRasterizer.a(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_X[var5], field_X[var6], field_X[var7], field_Q[var5], field_Q[var6], field_Q[var7], field_O[var5], field_O[var6], field_O[var7], (int) this.field_ab[param0]);
          }
        } else {
          if (this.field_R[param0] != -1) {
            TriangleRasterizer.drawShadedTriangle(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], this.field_Z[param0] & 65535, this.field_t[param0] & 65535, this.field_R[param0] & 65535);
          } else {
            TriangleRasterizer.drawFlatTriangle(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], TriangleRasterizer.colorPalette[this.field_Z[param0] & 65535]);
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
          param2.faceAlpha = param3;
          if (this.faceAlpha != null) {
            for (var9Lifetime1 = 0; var9Lifetime1 < this.faceCount; var9Lifetime1++) {
              param2.faceAlpha[var9Lifetime1] = this.faceAlpha[var9Lifetime1];
            }
          } else {
            for (var9Lifetime1 = 0; var9Lifetime1 < this.faceCount; var9Lifetime1++) {
              param2.faceAlpha[var9Lifetime1] = (byte) 0;
            }
          }
        } else {
          param2.faceAlpha = this.faceAlpha;
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
        param2.vertexTransformMasks = this.vertexTransformMasks;
        param2.faceTransformMasks = this.faceTransformMasks;
        param2.boundsValid = false;
        return (ModelMeshBase) ((Object) param2);
    }

    final void applyGroupTransform(int transformType, int[] groups, int x, int y, int z, boolean transformOption) {
        int groupCount;
        int pivotVertexCount;
        int pivotGroupOrdinal;
        int pivotGroupId;
        int translationVertexOrdinal;
        int pivotVertexOrdinal;
        int pivotVertexIndex;
        int cosZ;
        int rotatedXAfterZ;
        int lightness;
        int[] pivotVertices;
        int[] translatedVertices;
        int[] rotatedVertices;
        int[] scaledVertices;
        int[] alphaFaces;
        int[] colorFaces;
        int translationGroupOrdinal;
        int rotationGroupOrdinal;
        int scaleGroupOrdinal;
        int faceGroupOrdinal;
        int translationGroupId;
        int rotationGroupId;
        int scaleGroupId;
        int faceGroupId;
        int rotationVertexOrdinal;
        int scaleVertexOrdinal;
        int faceOrdinal;
        int translationVertexIndex;
        int rotationVertexIndex;
        int scaleVertexIndex;
        int faceIndex;
        int sinZ;
        int packedColorOrAlpha;
        int hue;
        int saturation;
        int cosX;
        int cosY;
        int rotatedYAfterX;
        int rotatedXAfterY;
        int sinX;
        int sinY;
        groupCount = groups.length;
        if (transformType == 0) {
          pivotVertexCount = 0;
          animationPivotX = 0;
          animationPivotY = 0;
          animationPivotZ = 0;
          for (pivotGroupOrdinal = 0; pivotGroupOrdinal < groupCount; pivotGroupOrdinal++) {
            pivotGroupId = groups[pivotGroupOrdinal];
            if (pivotGroupId < this.vertexGroups.length) {
              pivotVertices = this.vertexGroups[pivotGroupId];
              for (pivotVertexOrdinal = 0; pivotVertexOrdinal < pivotVertices.length; pivotVertexOrdinal++) {
                pivotVertexIndex = pivotVertices[pivotVertexOrdinal];
                animationPivotX = animationPivotX + this.verticesX[pivotVertexIndex];
                animationPivotY = animationPivotY + this.verticesY[pivotVertexIndex];
                animationPivotZ = animationPivotZ + this.verticesZ[pivotVertexIndex];
                pivotVertexCount++;
              }
            }
          }
          if (pivotVertexCount <= 0) {
            animationPivotX = x;
            animationPivotY = y;
            animationPivotZ = z;
          } else {
            animationPivotX = animationPivotX / pivotVertexCount + x;
            animationPivotY = animationPivotY / pivotVertexCount + y;
            animationPivotZ = animationPivotZ / pivotVertexCount + z;
          }
          return;
        }
        if (transformType == 1) {
          for (translationGroupOrdinal = 0; translationGroupOrdinal < groupCount; translationGroupOrdinal++) {
            translationGroupId = groups[translationGroupOrdinal];
            if (translationGroupId < this.vertexGroups.length) {
              translatedVertices = this.vertexGroups[translationGroupId];
              for (translationVertexOrdinal = 0; translationVertexOrdinal < translatedVertices.length; translationVertexOrdinal++) {
                translationVertexIndex = translatedVertices[translationVertexOrdinal];
                this.verticesX[translationVertexIndex] = this.verticesX[translationVertexIndex] + x;
                this.verticesY[translationVertexIndex] = this.verticesY[translationVertexIndex] + y;
                this.verticesZ[translationVertexIndex] = this.verticesZ[translationVertexIndex] + z;
              }
            }
          }
          return;
        }
        if (transformType == 2) {
          for (rotationGroupOrdinal = 0; rotationGroupOrdinal < groupCount; rotationGroupOrdinal++) {
            rotationGroupId = groups[rotationGroupOrdinal];
            if (rotationGroupId < this.vertexGroups.length) {
              rotatedVertices = this.vertexGroups[rotationGroupId];
              for (rotationVertexOrdinal = 0; rotationVertexOrdinal < rotatedVertices.length; rotationVertexOrdinal++) {
                rotationVertexIndex = rotatedVertices[rotationVertexOrdinal];
                this.verticesX[rotationVertexIndex] = this.verticesX[rotationVertexIndex] - animationPivotX;
                this.verticesY[rotationVertexIndex] = this.verticesY[rotationVertexIndex] - animationPivotY;
                this.verticesZ[rotationVertexIndex] = this.verticesZ[rotationVertexIndex] - animationPivotZ;
                if (z != 0) {
                  sinZ = TriangleRasterizer.sineTable[z];
                  cosZ = TriangleRasterizer.cosineTable[z];
                  rotatedXAfterZ = this.verticesY[rotationVertexIndex] * sinZ + this.verticesX[rotationVertexIndex] * cosZ + 32767 >> 16;
                  this.verticesY[rotationVertexIndex] = this.verticesY[rotationVertexIndex] * cosZ - this.verticesX[rotationVertexIndex] * sinZ + 32767 >> 16;
                  this.verticesX[rotationVertexIndex] = rotatedXAfterZ;
                }
                if (x != 0) {
                  sinX = TriangleRasterizer.sineTable[x];
                  cosX = TriangleRasterizer.cosineTable[x];
                  rotatedYAfterX = this.verticesY[rotationVertexIndex] * cosX - this.verticesZ[rotationVertexIndex] * sinX + 32767 >> 16;
                  this.verticesZ[rotationVertexIndex] = this.verticesY[rotationVertexIndex] * sinX + this.verticesZ[rotationVertexIndex] * cosX + 32767 >> 16;
                  this.verticesY[rotationVertexIndex] = rotatedYAfterX;
                }
                if (y != 0) {
                  sinY = TriangleRasterizer.sineTable[y];
                  cosY = TriangleRasterizer.cosineTable[y];
                  rotatedXAfterY = this.verticesZ[rotationVertexIndex] * sinY + this.verticesX[rotationVertexIndex] * cosY + 32767 >> 16;
                  this.verticesZ[rotationVertexIndex] = this.verticesZ[rotationVertexIndex] * cosY - this.verticesX[rotationVertexIndex] * sinY + 32767 >> 16;
                  this.verticesX[rotationVertexIndex] = rotatedXAfterY;
                }
                this.verticesX[rotationVertexIndex] = this.verticesX[rotationVertexIndex] + animationPivotX;
                this.verticesY[rotationVertexIndex] = this.verticesY[rotationVertexIndex] + animationPivotY;
                this.verticesZ[rotationVertexIndex] = this.verticesZ[rotationVertexIndex] + animationPivotZ;
              }
            }
          }
          return;
        }
        if (transformType == 3) {
          for (scaleGroupOrdinal = 0; scaleGroupOrdinal < groupCount; scaleGroupOrdinal++) {
            scaleGroupId = groups[scaleGroupOrdinal];
            if (scaleGroupId < this.vertexGroups.length) {
              scaledVertices = this.vertexGroups[scaleGroupId];
              for (scaleVertexOrdinal = 0; scaleVertexOrdinal < scaledVertices.length; scaleVertexOrdinal++) {
                scaleVertexIndex = scaledVertices[scaleVertexOrdinal];
                this.verticesX[scaleVertexIndex] = this.verticesX[scaleVertexIndex] - animationPivotX;
                this.verticesY[scaleVertexIndex] = this.verticesY[scaleVertexIndex] - animationPivotY;
                this.verticesZ[scaleVertexIndex] = this.verticesZ[scaleVertexIndex] - animationPivotZ;
                this.verticesX[scaleVertexIndex] = this.verticesX[scaleVertexIndex] * x / 128;
                this.verticesY[scaleVertexIndex] = this.verticesY[scaleVertexIndex] * y / 128;
                this.verticesZ[scaleVertexIndex] = this.verticesZ[scaleVertexIndex] * z / 128;
                this.verticesX[scaleVertexIndex] = this.verticesX[scaleVertexIndex] + animationPivotX;
                this.verticesY[scaleVertexIndex] = this.verticesY[scaleVertexIndex] + animationPivotY;
                this.verticesZ[scaleVertexIndex] = this.verticesZ[scaleVertexIndex] + animationPivotZ;
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
            for (faceGroupOrdinal = 0; faceGroupOrdinal < groupCount; faceGroupOrdinal++) {
              faceGroupId = groups[faceGroupOrdinal];
              if (faceGroupId < this.faceGroups.length) {
                colorFaces = this.faceGroups[faceGroupId];
                for (faceOrdinal = 0; faceOrdinal < colorFaces.length; faceOrdinal++) {
                  faceIndex = colorFaces[faceOrdinal];
                  packedColorOrAlpha = this.faceColors[faceIndex] & 65535;
                  hue = packedColorOrAlpha >> 10 & 63;
                  saturation = packedColorOrAlpha >> 7 & 7;
                  lightness = packedColorOrAlpha & 127;
                  hue = hue + x & 63;
                  saturation = saturation + y;
                  if (saturation >= 0) {
                    if (saturation > 7) {
                      saturation = 7;
                    }
                  } else {
                    saturation = 0;
                  }
                  lightness = lightness + z;
                  if (lightness >= 0) {
                    if (lightness > 127) {
                      lightness = 127;
                    }
                  } else {
                    lightness = 0;
                  }
                  this.faceColors[faceIndex] = (short)(hue << 10 | saturation << 7 | lightness);
                }
                this.faceColorsDirty = true;
              }
            }
            return;
          }
        } else {
          if (this.faceGroups != null) {
            if (this.faceAlpha != null) {
              for (faceGroupOrdinal = 0; faceGroupOrdinal < groupCount; faceGroupOrdinal++) {
                faceGroupId = groups[faceGroupOrdinal];
                if (faceGroupId < this.faceGroups.length) {
                  alphaFaces = this.faceGroups[faceGroupId];
                  for (faceOrdinal = 0; faceOrdinal < alphaFaces.length; faceOrdinal++) {
                    faceIndex = alphaFaces[faceOrdinal];
                    packedColorOrAlpha = (this.faceAlpha[faceIndex] & 255) + x * 8;
                    if (packedColorOrAlpha >= 0) {
                      if (packedColorOrAlpha > 255) {
                        packedColorOrAlpha = 255;
                      }
                    } else {
                      packedColorOrAlpha = 0;
                    }
                    this.faceAlpha[faceIndex] = (byte)packedColorOrAlpha;
                  }
                }
              }
              return;
            }
            return;
          }
        }
    }

    private final void calculateBounds() {
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
        this.boundingRadius = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.boundsValid = true;
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
          if (!this.boundsValid) {
            this.calculateBounds();
          }
          var10_int = TriangleRasterizer.projectionCenterX;
          var11 = TriangleRasterizer.projectionCenterY;
          var12 = TriangleRasterizer.sineTable[param0];
          var13 = TriangleRasterizer.cosineTable[param0];
          var14 = TriangleRasterizer.sineTable[param1];
          var15 = TriangleRasterizer.cosineTable[param1];
          var16 = TriangleRasterizer.sineTable[param2];
          var17 = TriangleRasterizer.cosineTable[param2];
          var18 = TriangleRasterizer.sineTable[param3];
          var19 = TriangleRasterizer.cosineTable[param3];
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
          this.a(false, param7 >= 0L ? true : false, param7, (int) this.boundingRadius, this.boundingRadius << 1);
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
                this.a(ot.field_G + TriangleRasterizer.projectionCenterX, vl.field_j + TriangleRasterizer.projectionCenterY, field_V[var9], field_V[var10], field_V[var11], var12, var13, var14_int)) {
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
                  var12 <= TriangleRasterizer.clipWidth &&
                  var13 <= TriangleRasterizer.clipWidth &&
                  var14_int <= TriangleRasterizer.clipWidth) {
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
        int groupCount;
        int pivotVertexCount;
        int pivotGroupOrdinal;
        int pivotGroupId;
        int translationVertexOrdinal;
        int pivotVertexOrdinal;
        int pivotVertexIndex;
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
        int matrixRotationVertexIndex;
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
        int[] pivotVertices;
        int[] translatedVertices;
        int[] matrixRotationVertices;
        int[] rotatedVertices;
        int[] matrixScaleVertices;
        int[] scaledVertices;
        int[] alphaFaces;
        int[] colorFaces;
        int transformedTranslationX;
        int groupOrdinalOrBasisOffsetX;
        int transformedTranslationY;
        int groupIdOrBasisOffsetY;
        int transformedTranslationZ;
        int basisOffsetZ;
        int var13Lifetime1;
        int translationVertexIndex;
        int var14Lifetime2;
        int var15Lifetime1;
        int var31Lifetime1;
        int translationGroupOrdinal;
        int translationGroupId;
        groupCount = groups.length;
        if (transformType == 0) {
          pivotVertexCount = 0;
          animationPivotX = 0;
          animationPivotY = 0;
          animationPivotZ = 0;
          for (pivotGroupOrdinal = 0; pivotGroupOrdinal < groupCount; pivotGroupOrdinal++) {
            pivotGroupId = groups[pivotGroupOrdinal];
            if (pivotGroupId < this.vertexGroups.length) {
              pivotVertices = this.vertexGroups[pivotGroupId];
              for (pivotVertexOrdinal = 0; pivotVertexOrdinal < pivotVertices.length; pivotVertexOrdinal++) {
                pivotVertexIndex = pivotVertices[pivotVertexOrdinal];
                if (this.vertexTransformMasks == null ||
                  (transformMask & this.vertexTransformMasks[pivotVertexIndex]) != 0) {
                  animationPivotX = animationPivotX + this.verticesX[pivotVertexIndex];
                  animationPivotY = animationPivotY + this.verticesY[pivotVertexIndex];
                  animationPivotZ = animationPivotZ + this.verticesZ[pivotVertexIndex];
                  pivotVertexCount++;
                }
              }
            }
          }
          if (pivotVertexCount <= 0) {
            animationPivotX = x;
            animationPivotY = y;
            animationPivotZ = z;
          } else {
            animationPivotX = animationPivotX / pivotVertexCount + x;
            animationPivotY = animationPivotY / pivotVertexCount + y;
            animationPivotZ = animationPivotZ / pivotVertexCount + z;
            field_y = true;
          }
          return;
        }
        if (transformType == 1) {
          if (transformMatrix != null) {
            transformedTranslationX = transformMatrix[0] * x + transformMatrix[1] * y + transformMatrix[2] * z + 16384 >> 15;
            transformedTranslationY = transformMatrix[3] * x + transformMatrix[4] * y + transformMatrix[5] * z + 16384 >> 15;
            transformedTranslationZ = transformMatrix[6] * x + transformMatrix[7] * y + transformMatrix[8] * z + 16384 >> 15;
            x = transformedTranslationX;
            y = transformedTranslationY;
            z = transformedTranslationZ;
          }
          for (translationGroupOrdinal = 0; translationGroupOrdinal < groupCount; translationGroupOrdinal++) {
            translationGroupId = groups[translationGroupOrdinal];
            if (translationGroupId < this.vertexGroups.length) {
              translatedVertices = this.vertexGroups[translationGroupId];
              for (translationVertexOrdinal = 0; translationVertexOrdinal < translatedVertices.length; translationVertexOrdinal++) {
                translationVertexIndex = translatedVertices[translationVertexOrdinal];
                if (this.vertexTransformMasks == null ||
                  (transformMask & this.vertexTransformMasks[translationVertexIndex]) != 0) {
                  this.verticesX[translationVertexIndex] = this.verticesX[translationVertexIndex] + x;
                  this.verticesY[translationVertexIndex] = this.verticesY[translationVertexIndex] + y;
                  this.verticesZ[translationVertexIndex] = this.verticesZ[translationVertexIndex] + z;
                }
              }
            }
          }
          return;
        }
        if (transformType == 2) {
          if (transformMatrix == null) {
            for (groupOrdinalOrBasisOffsetX = 0; groupOrdinalOrBasisOffsetX < groupCount; groupOrdinalOrBasisOffsetX++) {
              groupIdOrBasisOffsetY = groups[groupOrdinalOrBasisOffsetX];
              if (groupIdOrBasisOffsetY < this.vertexGroups.length) {
                rotatedVertices = this.vertexGroups[groupIdOrBasisOffsetY];
                for (var13Lifetime1 = 0; var13Lifetime1 < rotatedVertices.length; var13Lifetime1++) {
                  var14Lifetime2 = rotatedVertices[var13Lifetime1];
                  if (this.vertexTransformMasks == null ||
                    (transformMask & this.vertexTransformMasks[var14Lifetime2]) != 0) {
                    this.verticesX[var14Lifetime2] = this.verticesX[var14Lifetime2] - animationPivotX;
                    this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] - animationPivotY;
                    this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] - animationPivotZ;
                    if (z != 0) {
                      var15Lifetime1 = TriangleRasterizer.sineTable[z];
                      var16 = TriangleRasterizer.cosineTable[z];
                      var17 = this.verticesY[var14Lifetime2] * var15Lifetime1 + this.verticesX[var14Lifetime2] * var16 + 32767 >> 16;
                      this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] * var16 - this.verticesX[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.verticesX[var14Lifetime2] = var17;
                    }
                    if (x != 0) {
                      var15Lifetime1 = TriangleRasterizer.sineTable[x];
                      var16 = TriangleRasterizer.cosineTable[x];
                      var17 = this.verticesY[var14Lifetime2] * var16 - this.verticesZ[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.verticesZ[var14Lifetime2] = this.verticesY[var14Lifetime2] * var15Lifetime1 + this.verticesZ[var14Lifetime2] * var16 + 32767 >> 16;
                      this.verticesY[var14Lifetime2] = var17;
                    }
                    if (y != 0) {
                      var15Lifetime1 = TriangleRasterizer.sineTable[y];
                      var16 = TriangleRasterizer.cosineTable[y];
                      var17 = this.verticesZ[var14Lifetime2] * var15Lifetime1 + this.verticesX[var14Lifetime2] * var16 + 32767 >> 16;
                      this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] * var16 - this.verticesX[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.verticesX[var14Lifetime2] = var17;
                    }
                    this.verticesX[var14Lifetime2] = this.verticesX[var14Lifetime2] + animationPivotX;
                    this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] + animationPivotY;
                    this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] + animationPivotZ;
                  }
                }
              }
            }
            return;
          }
          groupOrdinalOrBasisOffsetX = transformMatrix[9];
          groupIdOrBasisOffsetY = transformMatrix[10];
          basisOffsetZ = transformMatrix[11];
          var13Lifetime1 = transformMatrix[12];
          var14Lifetime2 = transformMatrix[13];
          var15Lifetime1 = transformMatrix[14];
          if (field_y) {
            var16 = transformMatrix[0] * animationPivotX + transformMatrix[3] * animationPivotY + transformMatrix[6] * animationPivotZ + 16384 >> 15;
            var17 = transformMatrix[1] * animationPivotX + transformMatrix[4] * animationPivotY + transformMatrix[7] * animationPivotZ + 16384 >> 15;
            var18 = transformMatrix[2] * animationPivotX + transformMatrix[5] * animationPivotY + transformMatrix[8] * animationPivotZ + 16384 >> 15;
            var16 = var16 + var13Lifetime1;
            var17 = var17 + var14Lifetime2;
            var18 = var18 + var15Lifetime1;
            animationPivotX = var16;
            animationPivotY = var17;
            animationPivotZ = var18;
            field_y = false;
          }
          var61 = new int[9];
          var50 = var61;
          var16_ref_int__ = var50;
          var17 = TriangleRasterizer.cosineTable[x] >> 1;
          var18 = TriangleRasterizer.sineTable[x] >> 1;
          var19 = TriangleRasterizer.cosineTable[y] >> 1;
          var20 = TriangleRasterizer.sineTable[y] >> 1;
          var21 = TriangleRasterizer.cosineTable[z] >> 1;
          var22 = TriangleRasterizer.sineTable[z] >> 1;
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
          var25_int = var61[0] * -animationPivotX + var61[1] * -animationPivotY + var61[2] * -animationPivotZ + 16384 >> 15;
          var26 = var61[3] * -animationPivotX + var61[4] * -animationPivotY + var61[5] * -animationPivotZ + 16384 >> 15;
          var27 = var61[6] * -animationPivotX + var61[7] * -animationPivotY + var61[8] * -animationPivotZ + 16384 >> 15;
          var28 = var25_int + animationPivotX;
          var29_int = var26 + animationPivotY;
          var30 = var27 + animationPivotZ;
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
          var36 = var36 + groupOrdinalOrBasisOffsetX;
          var37 = var37 + groupIdOrBasisOffsetY;
          var38 = var38 + basisOffsetZ;
          for (var39 = 0; var39 < groupCount; var39++) {
            var40 = groups[var39];
            if (var40 < this.vertexGroups.length) {
              matrixRotationVertices = this.vertexGroups[var40];
              for (var42 = 0; var42 < matrixRotationVertices.length; var42++) {
                matrixRotationVertexIndex = matrixRotationVertices[var42];
                if (this.vertexTransformMasks == null ||
                  (transformMask & this.vertexTransformMasks[matrixRotationVertexIndex]) != 0) {
                  var44 = var63[0] * this.verticesX[matrixRotationVertexIndex] + var63[1] * this.verticesY[matrixRotationVertexIndex] + var63[2] * this.verticesZ[matrixRotationVertexIndex] + 16384 >> 15;
                  var45 = var63[3] * this.verticesX[matrixRotationVertexIndex] + var63[4] * this.verticesY[matrixRotationVertexIndex] + var63[5] * this.verticesZ[matrixRotationVertexIndex] + 16384 >> 15;
                  var46 = var63[6] * this.verticesX[matrixRotationVertexIndex] + var63[7] * this.verticesY[matrixRotationVertexIndex] + var63[8] * this.verticesZ[matrixRotationVertexIndex] + 16384 >> 15;
                  var44 = var44 + var36;
                  var45 = var45 + var37;
                  var46 = var46 + var38;
                  this.verticesX[matrixRotationVertexIndex] = var44;
                  this.verticesY[matrixRotationVertexIndex] = var45;
                  this.verticesZ[matrixRotationVertexIndex] = var46;
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
                for (groupOrdinalOrBasisOffsetX = 0; groupOrdinalOrBasisOffsetX < groupCount; groupOrdinalOrBasisOffsetX++) {
                  groupIdOrBasisOffsetY = groups[groupOrdinalOrBasisOffsetX];
                  if (groupIdOrBasisOffsetY < this.faceGroups.length) {
                    colorFaces = this.faceGroups[groupIdOrBasisOffsetY];
                    for (var13Lifetime1 = 0; var13Lifetime1 < colorFaces.length; var13Lifetime1++) {
                      var14Lifetime2 = colorFaces[var13Lifetime1];
                      if (this.faceTransformMasks == null ||
                        (transformMask & this.faceTransformMasks[var14Lifetime2]) != 0) {
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
                    this.faceColorsDirty = true;
                  }
                }
                return;
              }
            } else {
              if (this.faceGroups != null) {
                if (this.faceAlpha != null) {
                  for (groupOrdinalOrBasisOffsetX = 0; groupOrdinalOrBasisOffsetX < groupCount; groupOrdinalOrBasisOffsetX++) {
                    groupIdOrBasisOffsetY = groups[groupOrdinalOrBasisOffsetX];
                    if (groupIdOrBasisOffsetY < this.faceGroups.length) {
                      alphaFaces = this.faceGroups[groupIdOrBasisOffsetY];
                      for (var13Lifetime1 = 0; var13Lifetime1 < alphaFaces.length; var13Lifetime1++) {
                        var14Lifetime2 = alphaFaces[var13Lifetime1];
                        if (this.faceTransformMasks == null ||
                          (transformMask & this.faceTransformMasks[var14Lifetime2]) != 0) {
                          var15Lifetime1 = (this.faceAlpha[var14Lifetime2] & 255) + x * 8;
                          if (var15Lifetime1 >= 0) {
                            if (var15Lifetime1 > 255) {
                              var15Lifetime1 = 255;
                            }
                          } else {
                            var15Lifetime1 = 0;
                          }
                          this.faceAlpha[var14Lifetime2] = (byte)var15Lifetime1;
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
            for (groupOrdinalOrBasisOffsetX = 0; groupOrdinalOrBasisOffsetX < groupCount; groupOrdinalOrBasisOffsetX++) {
              groupIdOrBasisOffsetY = groups[groupOrdinalOrBasisOffsetX];
              if (groupIdOrBasisOffsetY < this.vertexGroups.length) {
                scaledVertices = this.vertexGroups[groupIdOrBasisOffsetY];
                for (var13Lifetime1 = 0; var13Lifetime1 < scaledVertices.length; var13Lifetime1++) {
                  var14Lifetime2 = scaledVertices[var13Lifetime1];
                  if (this.vertexTransformMasks == null ||
                    (transformMask & this.vertexTransformMasks[var14Lifetime2]) != 0) {
                    this.verticesX[var14Lifetime2] = this.verticesX[var14Lifetime2] - animationPivotX;
                    this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] - animationPivotY;
                    this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] - animationPivotZ;
                    this.verticesX[var14Lifetime2] = this.verticesX[var14Lifetime2] * x / 128;
                    this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] * y / 128;
                    this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] * z / 128;
                    this.verticesX[var14Lifetime2] = this.verticesX[var14Lifetime2] + animationPivotX;
                    this.verticesY[var14Lifetime2] = this.verticesY[var14Lifetime2] + animationPivotY;
                    this.verticesZ[var14Lifetime2] = this.verticesZ[var14Lifetime2] + animationPivotZ;
                  }
                }
              }
            }
            return;
          }
          groupOrdinalOrBasisOffsetX = transformMatrix[9];
          groupIdOrBasisOffsetY = transformMatrix[10];
          basisOffsetZ = transformMatrix[11];
          var13Lifetime1 = transformMatrix[12];
          var14Lifetime2 = transformMatrix[13];
          var15Lifetime1 = transformMatrix[14];
          if (field_y) {
            var16 = transformMatrix[0] * animationPivotX + transformMatrix[3] * animationPivotY + transformMatrix[6] * animationPivotZ + 16384 >> 15;
            var17 = transformMatrix[1] * animationPivotX + transformMatrix[4] * animationPivotY + transformMatrix[7] * animationPivotZ + 16384 >> 15;
            var18 = transformMatrix[2] * animationPivotX + transformMatrix[5] * animationPivotY + transformMatrix[8] * animationPivotZ + 16384 >> 15;
            var16 = var16 + var13Lifetime1;
            var17 = var17 + var14Lifetime2;
            var18 = var18 + var15Lifetime1;
            animationPivotX = var16;
            animationPivotY = var17;
            animationPivotZ = var18;
            field_y = false;
          }
          var16 = x << 15 >> 7;
          var17 = y << 15 >> 7;
          var18 = z << 15 >> 7;
          var19 = var16 * -animationPivotX + 16384 >> 15;
          var20 = var17 * -animationPivotY + 16384 >> 15;
          var21 = var18 * -animationPivotZ + 16384 >> 15;
          var22 = var19 + animationPivotX;
          var23 = var20 + animationPivotY;
          var24 = var21 + animationPivotZ;
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
          var30 = var30 + groupOrdinalOrBasisOffsetX;
          var31Lifetime1 = var31Lifetime1 + groupIdOrBasisOffsetY;
          var32 = var32 + basisOffsetZ;
          for (var33 = 0; var33 < groupCount; var33++) {
            var34 = groups[var33];
            if (var34 < this.vertexGroups.length) {
              matrixScaleVertices = this.vertexGroups[var34];
              for (var36 = 0; var36 < matrixScaleVertices.length; var36++) {
                var37 = matrixScaleVertices[var36];
                if (this.vertexTransformMasks == null ||
                  (transformMask & this.vertexTransformMasks[var37]) != 0) {
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
        this.boundsValid = false;
        this.faceColorsDirty = false;
        this.referencedVertexCapacity = 0;
    }

    ModelMesh(MeshData source, int ambient, int contrast, int lightX, int lightY, int lightZ) {
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
        this.boundsValid = false;
        this.faceColorsDirty = false;
        this.referencedVertexCapacity = 0;
        source.calculateNormals();
        source.buildSkinGroups();
        this.vertexCount = source.vertexCount;
        this.referencedVertexCapacity = source.referencedVertexCapacity;
        this.verticesX = source.verticesX;
        this.verticesY = source.verticesY;
        this.verticesZ = source.verticesZ;
        this.faceCount = source.faceCount;
        this.faceVertexA = source.faceVertexA;
        this.faceVertexB = source.faceVertexB;
        this.faceVertexC = source.faceVertexC;
        this.field_ob = source.field_w;
        this.faceAlpha = source.faceAlpha;
        this.faceColors = source.faceColors;
        this.vertexGroups = source.vertexGroups;
        this.faceGroups = source.faceGroups;
        this.faceTransformMasks = source.field_A;
        this.vertexTransformMasks = source.field_j;
        var7 = (int)Math.sqrt((double)(lightX * lightX + lightY * lightY + lightZ * lightZ));
        var8 = contrast * var7 >> 8;
        this.field_Z = new int[this.faceCount];
        this.field_t = new int[this.faceCount];
        this.field_R = new int[this.faceCount];
        if (source.faceTextureIds != null) {
          this.field_ab = new short[this.faceCount];
          for (var9 = 0; var9 < this.faceCount; var9++) {
            var10 = source.faceTextureIds[var9];
            if (var10 != -1 &&
              TriangleRasterizer.textureProvider.hasTexture(true, var10)) {
              this.field_ab[var9] = (short)var10;
            } else {
              this.field_ab[var9] = (short)-1;
            }
          }
        } else {
          this.field_ab = null;
        }
        if (source.field_E > 0 &&
          source.field_G != null) {
          var20 = new int[source.field_E];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.faceCount; var10Lifetime1++) {
            if (source.field_G[var10Lifetime1] != -1) {
              dupTemp$1 = source.field_G[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.textureTriangleCount = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < source.field_E; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              source.field_t[var10Lifetime1Lifetime1] == 0) {
              this.textureTriangleCount = this.textureTriangleCount + 1;
            }
          }
          this.textureVertexA = new int[this.textureTriangleCount];
          this.textureVertexB = new int[this.textureTriangleCount];
          this.textureVertexC = new int[this.textureTriangleCount];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < source.field_E; var11++) {
            if (var20[var11] > 0 &&
              source.field_t[var11] == 0) {
              this.textureVertexA[var10Lifetime1Lifetime2] = source.field_M[var11] & 65535;
              this.textureVertexB[var10Lifetime1Lifetime2] = source.field_n[var11] & 65535;
              this.textureVertexC[var10Lifetime1Lifetime2] = source.field_C[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_lb = new byte[this.faceCount];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.faceCount; var11Lifetime2++) {
            if (source.field_G[var11Lifetime2] == -1) {
              this.field_lb[var11Lifetime2] = (byte)-1;
            } else {
              this.field_lb[var11Lifetime2] = (byte)var9_ref_int__[source.field_G[var11Lifetime2] & 255];
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
          if (source.faceRenderTypes != null) {
            var10Lifetime2 = source.faceRenderTypes[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (source.faceAlpha != null) {
            var11Lifetime1 = source.faceAlpha[var16];
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
                var19 = source.faceNormals[var16];
                var14 = ambient + (lightX * var19.x + lightY * var19.y + lightZ * var19.z) / (var8 + var8 / 2);
                this.field_Z[var16] = ModelMesh.d(var14);
                this.field_R[var16] = -1;
              }
            } else {
              if (source.field_g != null &&
                source.field_g[this.faceVertexA[var16]] != null) {
                var13 = source.field_g[this.faceVertexA[var16]];
              } else {
                var13 = source.vertexNormals[this.faceVertexA[var16]];
              }
              var14 = ambient + (lightX * var13.x + lightY * var13.y + lightZ * var13.z) / (var8 * var13.contributions);
              this.field_Z[var16] = ModelMesh.d(var14);
              if (source.field_g != null &&
                source.field_g[this.faceVertexB[var16]] != null) {
                var13 = source.field_g[this.faceVertexB[var16]];
              } else {
                var13 = source.vertexNormals[this.faceVertexB[var16]];
              }
              var14 = ambient + (lightX * var13.x + lightY * var13.y + lightZ * var13.z) / (var8 * var13.contributions);
              this.field_t[var16] = ModelMesh.d(var14);
              if (source.field_g != null &&
                source.field_g[this.faceVertexC[var16]] != null) {
                var13 = source.field_g[this.faceVertexC[var16]];
              } else {
                var13 = source.vertexNormals[this.faceVertexC[var16]];
              }
              var14 = ambient + (lightX * var13.x + lightY * var13.y + lightZ * var13.z) / (var8 * var13.contributions);
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
                var18 = source.faceNormals[var16];
                var14 = ambient + (lightX * var18.x + lightY * var18.y + lightZ * var18.z) / (var8 + var8 / 2) << 17;
                this.field_Z[var16] = var14 | ModelMesh.a(source.faceColors[var16] & 65535, var14 >> 17);
                this.field_R[var16] = -1;
              }
            } else {
              var15 = source.faceColors[var16] & 65535;
              if (source.field_g != null &&
                source.field_g[this.faceVertexA[var16]] != null) {
                var13 = source.field_g[this.faceVertexA[var16]];
              } else {
                var13 = source.vertexNormals[this.faceVertexA[var16]];
              }
              var14 = ambient + (lightX * var13.x + lightY * var13.y + lightZ * var13.z) / (var8 * var13.contributions) << 17;
              this.field_Z[var16] = var14 | ModelMesh.a(var15, var14 >> 17);
              if (source.field_g != null &&
                source.field_g[this.faceVertexB[var16]] != null) {
                var13 = source.field_g[this.faceVertexB[var16]];
              } else {
                var13 = source.vertexNormals[this.faceVertexB[var16]];
              }
              var14 = ambient + (lightX * var13.x + lightY * var13.y + lightZ * var13.z) / (var8 * var13.contributions) << 17;
              this.field_t[var16] = var14 | ModelMesh.a(var15, var14 >> 17);
              if (source.field_g != null &&
                source.field_g[this.faceVertexC[var16]] != null) {
                var13 = source.field_g[this.faceVertexC[var16]];
              } else {
                var13 = source.vertexNormals[this.faceVertexC[var16]];
              }
              var14 = ambient + (lightX * var13.x + lightY * var13.y + lightZ * var13.z) / (var8 * var13.contributions) << 17;
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
