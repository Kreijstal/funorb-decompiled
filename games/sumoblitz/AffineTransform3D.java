/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AffineTransform3D extends Transform3D {
    private float m11;
    private float m22;
    private float m12;
    static int field_j;
    private float m10;
    private float m21;
    private float m00;
    private float m03;
    static bj field_o;
    private float m13;
    private float m23;
    private float m02;
    private float m20;
    private float m01;

    final void transformDirection(int guard, float y, float x, float[] destination, float z) {
        try {
          destination[2] = this.m20 * x + y * this.m21 + this.m22 * z;
          if (guard != -1416) {
            this.setScale(-0.36476919054985046f, -0.9391811490058899f, -41, 1.2040667533874512f);
          }
          destination[0] = y * this.m01 + x * this.m00 + this.m02 * z;
          destination[1] = this.m11 * y + this.m10 * x + this.m12 * z;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ut.O(" + guard + ',' + y + ',' + x + ',' + (destination != null ? "{...}" : "null") + ',' + z + ')');
        }
    }

    final void setRotationX(byte guard, int angleQ14) {
        this.m00 = 1.0f;
        float dupTemp$0 = GameProgressUpdate.field_l[angleQ14 & 16383];
        this.m22 = dupTemp$0;
        this.m11 = dupTemp$0;
        this.m21 = GameProgressUpdate.field_k[16383 & angleQ14];
        this.m01 = 0.0f;
        if (guard > 33) {
          this.m12 = -this.m21;
          this.m20 = 0.0f;
          this.m13 = 0.0f;
          this.m10 = 0.0f;
          this.m23 = 0.0f;
          this.m03 = 0.0f;
          this.m02 = 0.0f;
          return;
        }
        Transform3D var4 = (Transform3D) null;
        this.copyLinearFrom((Transform3D) null, false);
        this.m12 = -this.m21;
        this.m20 = 0.0f;
        this.m13 = 0.0f;
        this.m10 = 0.0f;
        this.m23 = 0.0f;
        this.m03 = 0.0f;
        this.m02 = 0.0f;
    }

    final void translate(int deltaY, int deltaZ, byte guard, int deltaX) {
        if (guard > 96) {
          this.m03 = this.m03 + (float)deltaZ;
          this.m13 = this.m13 + (float)deltaY;
          this.m23 = this.m23 + (float)deltaX;
          return;
        }
        float[] var6 = (float[]) null;
        this.transformPlane(1.5263985395431519f, (float[]) null, (byte) -111, 0.11366769671440125f, -1.3526464700698853f, -1.8221346139907837f);
        this.m03 = this.m03 + (float)deltaZ;
        this.m13 = this.m13 + (float)deltaY;
        this.m23 = this.m23 + (float)deltaX;
    }

    final void setIdentity(int unitZ) {
        this.m11 = 1.0f;
        this.m13 = 0.0f;
        this.m03 = 0.0f;
        this.m00 = 1.0f;
        this.m12 = 0.0f;
        this.m10 = 0.0f;
        this.m20 = 0.0f;
        this.m22 = (float)unitZ;
        this.m01 = 0.0f;
        this.m02 = 0.0f;
        this.m23 = 0.0f;
        this.m21 = 0.0f;
    }

    final float[] writeRowMajor4x4(int lastRowX, float[] destination) {
        RuntimeException var3 = null;
        float[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          destination[3] = this.m03;
          destination[13] = 0.0f;
          destination[7] = this.m13;
          destination[6] = this.m12;
          destination[14] = 0.0f;
          destination[12] = (float)lastRowX;
          destination[5] = this.m11;
          destination[2] = this.m02;
          destination[8] = this.m20;
          destination[1] = this.m01;
          destination[9] = this.m21;
          destination[15] = 1.0f;
          destination[0] = this.m00;
          destination[10] = this.m22;
          destination[11] = this.m23;
          destination[4] = this.m10;
          stackIn_1_0 = (float[]) (destination);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ut.N(").append(lastRowX).append(',');
          if (destination == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void copyFrom(int guard, Transform3D source) {
        AffineTransform3D var3 = null;
        try {
          var3 = (AffineTransform3D) (source);
          if (guard != 0) {
            this.m13 = -0.26415005326271057f;
          }
          this.m13 = var3.m13;
          this.m01 = var3.m01;
          this.m23 = var3.m23;
          this.m11 = var3.m11;
          this.m03 = var3.m03;
          this.m00 = var3.m00;
          this.m02 = var3.m02;
          this.m22 = var3.m22;
          this.m10 = var3.m10;
          this.m21 = var3.m21;
          this.m20 = var3.m20;
          this.m12 = var3.m12;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ut.C(" + guard + ',' + (source != null ? "{...}" : "null") + ')');
        }
    }

    final float[] writeColumnMajor4x4(int guard, float[] destination) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          destination[8] = this.m02;
          destination[4] = this.m01;
          destination[9] = this.m12;
          if (guard >= -55) {
            this.m13 = -0.7466111183166504f;
          }
          destination[6] = this.m21;
          destination[11] = 0.0f;
          destination[12] = this.m03;
          destination[15] = 1.0f;
          destination[13] = this.m13;
          destination[1] = this.m10;
          destination[7] = 0.0f;
          destination[2] = this.m20;
          destination[5] = this.m11;
          destination[14] = this.m23;
          destination[10] = this.m22;
          destination[3] = 0.0f;
          destination[0] = this.m00;
          stackIn_3_0 = (float[]) (destination);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ut.R(").append(guard).append(',');
          if (destination == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void setScale(float scaleY, float scaleX, int offDiagonal, float scaleZ) {
        this.m12 = (float)offDiagonal;
        this.m22 = scaleZ;
        this.m02 = 0.0f;
        this.m21 = 0.0f;
        this.m20 = 0.0f;
        this.m10 = 0.0f;
        this.m03 = 0.0f;
        this.m01 = 0.0f;
        this.m11 = scaleY;
        this.m13 = 0.0f;
        this.m00 = scaleX;
        this.m23 = 0.0f;
    }

    final void setLinear(float value01, float value11, float value10, float value00, float value02, float value22, float value20, float value12, float value21, int guard) {
        this.m20 = value20;
        this.m10 = value10;
        this.m00 = value00;
        if (guard == 18356) {
          this.m02 = value02;
          this.m01 = value01;
          this.m21 = value21;
          this.m03 = 0.0f;
          this.m11 = value11;
          this.m12 = value12;
          this.m22 = value22;
          this.m13 = 0.0f;
          this.m23 = 0.0f;
          return;
        }
        this.m00 = 0.5659931898117065f;
        this.m02 = value02;
        this.m01 = value01;
        this.m21 = value21;
        this.m03 = 0.0f;
        this.m11 = value11;
        this.m12 = value12;
        this.m22 = value22;
        this.m13 = 0.0f;
        this.m23 = 0.0f;
    }

    final void copyLinearFrom(Transform3D source, boolean guard) {
        AffineTransform3D var3 = (AffineTransform3D) (source);
        this.m02 = var3.m02;
        this.m03 = 0.0f;
        this.m01 = var3.m01;
        this.m11 = var3.m11;
        if (!guard) {
          return;
        }
        try {
          this.m10 = var3.m10;
          this.m20 = var3.m20;
          this.m00 = var3.m00;
          this.m23 = 0.0f;
          this.m21 = var3.m21;
          this.m12 = var3.m12;
          this.m22 = var3.m22;
          this.m13 = 0.0f;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ut.I(" + (source != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void setTranslation(float y, float x, float z, int offDiagonal) {
        this.m20 = 0.0f;
        this.m21 = 0.0f;
        this.m10 = 0.0f;
        this.m03 = z;
        this.m11 = 1.0f;
        this.m00 = 1.0f;
        this.m23 = x;
        this.m12 = (float)offDiagonal;
        this.m02 = 0.0f;
        this.m22 = 1.0f;
        this.m01 = 0.0f;
        this.m13 = y;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 49) {
          field_j = 12;
          field_o = null;
          return;
        }
        field_o = null;
    }

    final void setProduct(Transform3D left, byte guard, Transform3D right) {
        AffineTransform3D var7 = null;
        AffineTransform3D var5 = null;
        try {
          var7 = (AffineTransform3D) (left);
          var5 = (AffineTransform3D) (right);
          this.m00 = var7.m02 * var5.m20 + (var7.m01 * var5.m10 + var5.m00 * var7.m00);
          this.m10 = var5.m20 * var7.m12 + (var5.m00 * var7.m10 + var5.m10 * var7.m11);
          this.m01 = var7.m00 * var5.m01 + var7.m01 * var5.m11 + var5.m21 * var7.m02;
          this.m20 = var7.m21 * var5.m10 + var7.m20 * var5.m00 + var7.m22 * var5.m20;
          this.m11 = var5.m21 * var7.m12 + (var5.m01 * var7.m10 + var5.m11 * var7.m11);
          this.m21 = var5.m21 * var7.m22 + (var5.m01 * var7.m20 + var5.m11 * var7.m21);
          if (guard != 77) {
            float[] var6 = (float[]) null;
            this.transformPlane(-0.4196498990058899f, (float[]) null, (byte) 117, -0.21536625921726227f, 0.6118397116661072f, 0.4896458387374878f);
          }
          this.m02 = var5.m22 * var7.m02 + (var7.m00 * var5.m02 + var7.m01 * var5.m12);
          this.m12 = var7.m11 * var5.m12 + var7.m10 * var5.m02 + var5.m22 * var7.m12;
          this.m22 = var5.m22 * var7.m22 + (var7.m20 * var5.m02 + var7.m21 * var5.m12);
          this.m03 = var5.m13 * var7.m01 + var7.m00 * var5.m03 + var7.m02 * var5.m23 + var7.m03;
          this.m13 = var7.m12 * var5.m23 + (var5.m13 * var7.m11 + var7.m10 * var5.m03) + var7.m13;
          this.m23 = var7.m23 + (var5.m03 * var7.m20 + var7.m21 * var5.m13 + var5.m23 * var7.m22);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ut.U(" + (left != null ? "{...}" : "null") + ',' + guard + ',' + (right != null ? "{...}" : "null") + ')');
        }
    }

    final void setTranslation(int z, int x, boolean guard, int y) {
        this.m00 = 1.0f;
        this.m13 = (float)y;
        this.m12 = 0.0f;
        this.m03 = (float)z;
        this.m20 = 0.0f;
        if (!guard) {
          this.m22 = 1.0f;
          this.m11 = 1.0f;
          this.m23 = (float)x;
          this.m02 = 0.0f;
          this.m21 = 0.0f;
          this.m01 = 0.0f;
          this.m10 = 0.0f;
          return;
        }
    }

    final static void crossfadeMusicTrack(int step, byte guard, MusicTrack track, boolean loop) {
        RuntimeException var4 = null;
        MusicCrossfadeStream stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        MusicTrack stackIn_2_3;
        boolean stackIn_3_4 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = AccountConnectionPhase.field_b;
          stackIn_2_1 = 1;
          stackIn_2_2 = 1000000;
          stackIn_2_3 = (MusicTrack) (track);
          stackIn_3_4 = !(loop);
          ((MusicCrossfadeStream) (Object) stackIn_2_0).transitionToTrack(stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_3_4, step, 256);
          if (guard == -55) {
            return;
          }
          AffineTransform3D.releaseStatics((byte) 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ut.F(").append(step).append(',').append(guard).append(',');
          if (track == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(loop).append(')').toString());
        }
    }

    final void translate(byte guard, float deltaZ, float deltaY, float deltaX) {
        if (guard == 96) {
          this.m23 = this.m23 + deltaZ;
          this.m13 = this.m13 + deltaY;
          this.m03 = this.m03 + deltaX;
          return;
        }
        this.m23 = 1.0452516078948975f;
        this.m23 = this.m23 + deltaZ;
        this.m13 = this.m13 + deltaY;
        this.m03 = this.m03 + deltaX;
    }

    final float[] writeTextureMatrix4x4(float[] destination, int guard) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          destination[1] = this.m10;
          destination[5] = this.m11;
          destination[0] = this.m00;
          destination[6] = 0.0f;
          destination[15] = 1.0f;
          destination[7] = 0.0f;
          destination[3] = 0.0f;
          destination[2] = 0.0f;
          destination[10] = this.m23;
          destination[4] = this.m01;
          destination[9] = this.m13;
          destination[11] = 0.0f;
          destination[14] = 0.0f;
          destination[12] = 0.0f;
          destination[8] = this.m03;
          destination[13] = 0.0f;
          if (guard <= 61) {
            this.m02 = -0.7986855506896973f;
          }
          stackIn_3_0 = (float[]) (destination);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ut.G(");
          if (destination == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    final void scale(float scaleX, float scaleY, int guard, float scaleZ) {
        this.m13 = this.m13 * scaleY;
        this.m00 = this.m00 * scaleX;
        this.m23 = this.m23 * scaleZ;
        this.m11 = this.m11 * scaleY;
        this.m22 = this.m22 * scaleZ;
        this.m02 = this.m02 * scaleX;
        this.m03 = this.m03 * scaleX;
        this.m01 = this.m01 * scaleX;
        this.m10 = this.m10 * scaleY;
        this.m12 = this.m12 * scaleY;
        this.m20 = this.m20 * scaleZ;
        this.m21 = this.m21 * scaleZ;
        if (guard > -17) {
          float[] var6 = (float[]) null;
          this.transformPlane(-0.1824408620595932f, (float[]) null, (byte) 60, 1.0720683336257935f, 1.3190656900405884f, 0.16522423923015594f);
        }
    }

    final float[] writeFirstTwoRows(float[] destination, byte guard) {
        RuntimeException var3 = null;
        float[] var4 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          destination[0] = this.m00;
          destination[2] = this.m02;
          destination[7] = this.m13;
          destination[6] = this.m12;
          destination[5] = this.m11;
          destination[1] = this.m01;
          destination[4] = this.m10;
          destination[3] = this.m03;
          if (guard != -37) {
            var4 = (float[]) null;
            this.writeRowMajor4x4(30, (float[]) null);
          }
          stackIn_3_0 = (float[]) (destination);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ut.J(");
          if (destination == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    final void transformPlane(float normalX, float[] destination, byte guard, float normalZ, float normalY, float distance) {
        float var7_float = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        float var11 = 0.0f;
        int var12 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          destination[2] = normalY * this.m21 + this.m20 * normalX + normalZ * this.m22;
          destination[1] = normalY * this.m11 + normalX * this.m10 + this.m12 * normalZ;
          var10 = -16 / ((-36 - guard) / 45);
          destination[0] = this.m02 * normalZ + (normalY * this.m01 + this.m00 * normalX);
          if (!(normalX > 0.00390625f) &&
            !(normalX < -0.00390625f)) {
            if (!(normalY > 0.00390625f) &&
              !(normalY < -0.00390625f)) {
              var11 = -distance / normalZ;
              var8 = this.m13 + this.m12 * var11;
              var7_float = this.m03 + var11 * this.m02;
              var9 = var11 * this.m22 + this.m23;
            } else {
              var11 = -distance / normalY;
              var9 = this.m23 + var11 * this.m21;
              var7_float = this.m01 * var11 + this.m03;
              var8 = var11 * this.m11 + this.m13;
            }
          } else {
            var11 = -distance / normalX;
            var9 = this.m20 * var11 + this.m23;
            var7_float = var11 * this.m00 + this.m03;
            var8 = this.m13 + this.m10 * var11;
          }
          destination[3] = -(var8 * destination[1] + destination[0] * var7_float + var9 * destination[2]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("ut.D(").append(normalX).append(',');
          if (destination == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(',').append(normalZ).append(',').append(normalY).append(',').append(distance).append(')').toString());
        }
    }

    AffineTransform3D() {
        this.setIdentity(1);
    }

    final float[] writeLinearRowMajor4x4(float[] destination, byte guard) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          destination[9] = this.m21;
          destination[11] = 0.0f;
          destination[14] = 0.0f;
          destination[10] = this.m22;
          destination[4] = this.m10;
          destination[0] = this.m00;
          destination[5] = this.m11;
          destination[7] = 0.0f;
          destination[2] = this.m02;
          destination[12] = 0.0f;
          destination[13] = 0.0f;
          destination[6] = this.m12;
          destination[3] = 0.0f;
          if (guard != 86) {
            field_o = (bj) null;
          }
          destination[1] = this.m01;
          destination[15] = 0.0f;
          destination[8] = this.m20;
          stackIn_3_0 = (float[]) (destination);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ut.P(");
          if (destination == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        field_j = 0;
    }
}
