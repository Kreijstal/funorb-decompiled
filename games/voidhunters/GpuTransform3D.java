/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class GpuTransform3D extends Transform3D {
    static ConsoleCommandRegistry field_b;
    private float m20;
    private float m03;
    private float m22;
    private float m01;
    private float m23;
    private float m00;
    private float m13;
    private float m10;
    private float m21;
    private float m12;
    private float m02;
    private float m11;

    final void set(Transform3D param0, int param1) {
        GpuTransform3D var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (GpuTransform3D) (param0);
          this.m02 = var3.m02;
          this.m20 = var3.m20;
          this.m01 = var3.m01;
          this.m10 = var3.m10;
          this.m23 = var3.m23;
          this.m22 = var3.m22;
          this.m21 = var3.m21;
          this.m12 = var3.m12;
          this.m11 = var3.m11;
          this.m03 = var3.m03;
          this.m13 = var3.m13;
          this.m00 = var3.m00;
          if (param1 == 16383) {
            return;
          }
          this.m02 = -0.5222663879394531f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("oj.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final void rotateZ(int param0, int param1) {
        float var3 = SetAutoAfkTimeout.field_s[param0 & 16383];
        float var4 = SetAutoAfkTimeout.field_p[param0 & 16383];
        float var5 = this.m00;
        float var6 = this.m01;
        float var7 = this.m02;
        this.m00 = -(this.m10 * var4) + var5 * var3;
        float var8 = this.m03;
        this.m10 = var5 * var4 + this.m10 * var3;
        this.m01 = var6 * var3 - var4 * this.m11;
        this.m11 = var3 * this.m11 + var6 * var4;
        this.m02 = var7 * var3 - this.m12 * var4;
        if (param1 == 3) {
          this.m03 = var8 * var3 - var4 * this.m13;
          this.m12 = var7 * var4 + var3 * this.m12;
          this.m13 = var3 * this.m13 + var4 * var8;
          return;
        }
        this.m12 = -1.153786063194275f;
        this.m03 = var8 * var3 - var4 * this.m13;
        this.m12 = var7 * var4 + var3 * this.m12;
        this.m13 = var3 * this.m13 + var4 * var8;
    }

    final void scale(int param0, float param1, float param2, float param3) {
        this.m02 = this.m02 * param1;
        this.m22 = this.m22 * param3;
        this.m11 = this.m11 * param2;
        this.m01 = this.m01 * param1;
        this.m00 = this.m00 * param1;
        this.m12 = this.m12 * param2;
        if (param0 == -3286) {
          this.m13 = this.m13 * param2;
          this.m03 = this.m03 * param1;
          this.m23 = this.m23 * param3;
          this.m10 = this.m10 * param2;
          this.m20 = this.m20 * param3;
          this.m21 = this.m21 * param3;
          return;
        }
    }

    final void translate(int param0, int param1, int param2, int param3) {
        if (param1 == 16383) {
          this.m13 = this.m13 + (float)param0;
          this.m23 = this.m23 + (float)param2;
          this.m03 = this.m03 + (float)param3;
          return;
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 < 65) {
          GpuTransform3D.a((byte) 104, false, 86);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final void transformDirection(float param0, float[] param1, float param2, float param3, boolean param4) {
        try {
          param1[2] = param0 * this.m21 + param3 * this.m20 + this.m22 * param2;
          param1[1] = this.m12 * param2 + (this.m11 * param0 + param3 * this.m10);
          param1[0] = param2 * this.m02 + (this.m00 * param3 + this.m01 * param0);
          if (param4) {
            this.m02 = 0.9724645614624023f;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oj.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void translate(float param0, float param1, float param2, byte param3) {
        this.m03 = this.m03 + param1;
        this.m23 = this.m23 + param0;
        this.m13 = this.m13 + param2;
        if (param3 != 13) {
          GpuTransform3D.clearSharedReferences(6);
        }
    }

    final float[] writeFirstTwoRows(byte param0, float[] param1) {
        RuntimeException var3 = null;
        float[] var4 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1[4] = this.m10;
          param1[5] = this.m11;
          param1[0] = this.m00;
          param1[3] = this.m03;
          param1[6] = this.m12;
          if (param0 != 105) {
            var4 = (float[]) null;
            this.writeColumnMajorMatrix((float[]) null, (byte) 52);
          }
          param1[7] = this.m13;
          param1[2] = this.m02;
          param1[1] = this.m01;
          stackIn_3_0 = (float[]) (param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oj.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void writeFile(File param0, int param1, byte[] param2, int param3) throws IOException {
        FileOutputStream var4 = new FileOutputStream(param0);
        var4.write(param2, 0, param3);
        if (param1 != 3) {
          return;
        }
        try {
          var4.close();
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oj.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final float[] writeColumnMajorMatrix(float[] param0, byte param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0[0] = this.m00;
          if (param1 != 114) {
            this.setRotation(-1.1722569465637207f, -0.8717162609100342f, (byte) 106, -0.6868294477462769f, -1.6954988241195679f, 0.7221444845199585f, -1.6910157203674316f, 0.8159959316253662f, 0.2177412509918213f, -0.711976170539856f);
          }
          param0[1] = this.m10;
          param0[12] = this.m03;
          param0[8] = this.m02;
          param0[4] = this.m01;
          param0[3] = 0.0f;
          param0[9] = this.m12;
          param0[6] = this.m21;
          param0[5] = this.m11;
          param0[2] = this.m20;
          param0[15] = 1.0f;
          param0[10] = this.m22;
          param0[13] = this.m13;
          param0[14] = this.m23;
          param0[7] = 0.0f;
          param0[11] = 0.0f;
          stackIn_3_0 = (float[]) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oj.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setCamera(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = SetAutoAfkTimeout.field_s[16383 & param3];
        float var8 = SetAutoAfkTimeout.field_p[16383 & param3];
        float var9 = SetAutoAfkTimeout.field_s[16383 & param4];
        float var10 = SetAutoAfkTimeout.field_p[param4 & 16383];
        float var11 = SetAutoAfkTimeout.field_s[param5 & 16383];
        float var12 = SetAutoAfkTimeout.field_p[16383 & param5];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.m00 = var14 * var10 + var11 * var9;
        this.m21 = -var8;
        this.m20 = var10 * var7;
        this.m01 = var12 * var7;
        this.m11 = var7 * var11;
        this.m10 = var10 * var13 + var12 * -var9;
        this.m22 = var9 * var7;
        this.m12 = var12 * var10 + var13 * var9;
        this.m02 = var14 * var9 + var11 * -var10;
        this.m03 = -((float)param1 * this.m01) + (float)(-param0) * this.m00 - (float)param2 * this.m02;
        this.m23 = -(this.m22 * (float)param2) + (-(this.m21 * (float)param1) + this.m20 * (float)(-param0));
        this.m13 = this.m10 * (float)(-param0) - this.m11 * (float)param1 - (float)param2 * this.m12;
    }

    final float[] writeRowMajorMatrix(float[] param0, byte param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0[3] = this.m03;
          param0[15] = 1.0f;
          if (param1 != 22) {
            this.m13 = -0.7088243961334229f;
          }
          param0[2] = this.m02;
          param0[13] = 0.0f;
          param0[5] = this.m11;
          param0[11] = this.m23;
          param0[0] = this.m00;
          param0[9] = this.m21;
          param0[12] = 0.0f;
          param0[6] = this.m12;
          param0[10] = this.m22;
          param0[14] = 0.0f;
          param0[8] = this.m20;
          param0[7] = this.m13;
          param0[1] = this.m01;
          param0[4] = this.m10;
          stackIn_3_0 = (float[]) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oj.CA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void transformPlane(float[] param0, float param1, byte param2, float param3, float param4, float param5) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var7_float = 0.0f;
        RuntimeException var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          if (param2 != 67) {
            this.m21 = -1.5288702249526978f;
          }
          if (!(param5 > 0.00390625f) &&
            !(-0.00390625f > param5)) {
            if (!(param1 > 0.00390625f) &&
              !(param1 < -0.00390625f)) {
              var10 = -param3 / param4;
              var9 = this.m23 + var10 * this.m22;
              var8 = this.m12 * var10 + this.m13;
              var7_float = this.m03 + var10 * this.m02;
            } else {
              var10 = -param3 / param1;
              var7_float = var10 * this.m01 + this.m03;
              var9 = var10 * this.m21 + this.m23;
              var8 = var10 * this.m11 + this.m13;
            }
          } else {
            var10 = -param3 / param5;
            var8 = var10 * this.m10 + this.m13;
            var7_float = var10 * this.m00 + this.m03;
            var9 = this.m20 * var10 + this.m23;
          }
          param0[1] = this.m12 * param4 + (this.m11 * param1 + this.m10 * param5);
          param0[2] = param4 * this.m22 + (this.m20 * param5 + param1 * this.m21);
          param0[0] = param4 * this.m02 + (param5 * this.m00 + this.m01 * param1);
          param0[3] = -(var9 * param0[2] + (param0[0] * var7_float + var8 * param0[1]));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("oj.H(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void setRotationX(byte param0, int param1) {
        float dupTemp$0 = 0.0f;
        if (param0 == -80) {
          this.m00 = 1.0f;
          dupTemp$0 = SetAutoAfkTimeout.field_s[param1 & 16383];
          this.m22 = dupTemp$0;
          this.m11 = dupTemp$0;
          this.m21 = SetAutoAfkTimeout.field_p[16383 & param1];
          this.m10 = 0.0f;
          this.m23 = 0.0f;
          this.m02 = 0.0f;
          this.m01 = 0.0f;
          this.m13 = 0.0f;
          this.m20 = 0.0f;
          this.m12 = -this.m21;
          this.m03 = 0.0f;
          return;
        }
        this.m13 = -0.43025723099708557f;
        this.m00 = 1.0f;
        float dupTemp$1 = SetAutoAfkTimeout.field_s[param1 & 16383];
        this.m22 = dupTemp$1;
        this.m11 = dupTemp$1;
        this.m21 = SetAutoAfkTimeout.field_p[16383 & param1];
        this.m10 = 0.0f;
        this.m23 = 0.0f;
        this.m02 = 0.0f;
        this.m01 = 0.0f;
        this.m13 = 0.0f;
        this.m20 = 0.0f;
        this.m12 = -this.m21;
        this.m03 = 0.0f;
    }

    final void setTranslation(float param0, float param1, int param2, float param3) {
        this.m13 = param1;
        if (param2 >= 44) {
          this.m21 = 0.0f;
          this.m20 = 0.0f;
          this.m22 = 1.0f;
          this.m10 = 0.0f;
          this.m03 = param0;
          this.m01 = 0.0f;
          this.m12 = 0.0f;
          this.m23 = param3;
          this.m02 = 0.0f;
          this.m11 = 1.0f;
          this.m00 = 1.0f;
          return;
        }
    }

    final void setRotation(float param0, float param1, byte param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9) {
        this.m22 = param8;
        this.m00 = param3;
        this.m23 = 0.0f;
        this.m01 = param9;
        this.m02 = param1;
        int var11 = 123 / ((param2 - 40) / 58);
        this.m13 = 0.0f;
        this.m11 = param6;
        this.m20 = param0;
        this.m12 = param4;
        this.m03 = 0.0f;
        this.m21 = param5;
        this.m10 = param7;
    }

    final void flipYZ(int param0) {
        this.m20 = -this.m20;
        this.m22 = -this.m22;
        this.m23 = -this.m23;
        this.m21 = -this.m21;
        this.m11 = -this.m11;
        this.m10 = -this.m10;
        if (param0 == 16489) {
          this.m13 = -this.m13;
          this.m12 = -this.m12;
          return;
        }
        this.m11 = 1.4025397300720215f;
        this.m13 = -this.m13;
        this.m12 = -this.m12;
    }

    final void setRigidInverse(int param0, Transform3D param1) {
        GpuTransform3D var4 = null;
        try {
          var4 = (GpuTransform3D) (param1);
          this.m02 = var4.m20;
          this.m01 = var4.m10;
          this.m00 = var4.m00;
          this.m12 = var4.m21;
          this.m10 = var4.m01;
          this.m11 = var4.m11;
          this.m20 = var4.m02;
          this.m22 = var4.m22;
          this.m21 = var4.m12;
          this.m03 = -(var4.m23 * this.m02 + (this.m01 * var4.m13 + var4.m03 * this.m00));
          this.m13 = -(var4.m03 * this.m10 + this.m11 * var4.m13 + this.m12 * var4.m23);
          if (param0 != -25609) {
            this.m13 = -1.8182164430618286f;
          }
          this.m23 = -(this.m21 * var4.m13 + this.m20 * var4.m03 + this.m22 * var4.m23);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void setTranslation(int param0, int param1, byte param2, int param3) {
        this.m13 = (float)param1;
        this.m21 = 0.0f;
        this.m12 = 0.0f;
        this.m22 = 1.0f;
        this.m11 = 1.0f;
        this.m01 = 0.0f;
        this.m20 = 0.0f;
        if (param2 < -45) {
          this.m03 = (float)param0;
          this.m23 = (float)param3;
          this.m00 = 1.0f;
          this.m02 = 0.0f;
          this.m10 = 0.0f;
          return;
        }
        GpuTransform3D.clearSharedReferences(-43);
        this.m03 = (float)param0;
        this.m23 = (float)param3;
        this.m00 = 1.0f;
        this.m02 = 0.0f;
        this.m10 = 0.0f;
    }

    final float[] writeRotationCoefficients(byte param0, float[] param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1[12] = 0.0f;
          param1[3] = 0.0f;
          param1[7] = 0.0f;
          param1[2] = this.m02;
          param1[9] = this.m21;
          param1[10] = this.m22;
          param1[14] = 0.0f;
          param1[15] = 0.0f;
          param1[0] = this.m00;
          param1[1] = this.m01;
          param1[6] = this.m12;
          param1[13] = 0.0f;
          param1[11] = 0.0f;
          param1[4] = this.m10;
          param1[8] = this.m20;
          param1[5] = this.m11;
          if (param0 != -4) {
            this.m21 = 1.1912505626678467f;
          }
          stackIn_3_0 = (float[]) (param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void setProduct(Transform3D param0, Transform3D param1, boolean param2) {
        GpuTransform3D var6 = null;
        GpuTransform3D var5 = null;
        try {
          var6 = (GpuTransform3D) (param1);
          if (!param2) {
            GpuTransform3D.a((byte) -123, false, 91);
          }
          var5 = (GpuTransform3D) (param0);
          this.m00 = var6.m02 * var5.m20 + (var5.m10 * var6.m01 + var6.m00 * var5.m00);
          this.m10 = var6.m10 * var5.m00 + var5.m10 * var6.m11 + var5.m20 * var6.m12;
          this.m20 = var5.m20 * var6.m22 + (var6.m21 * var5.m10 + var5.m00 * var6.m20);
          this.m01 = var5.m11 * var6.m01 + var5.m01 * var6.m00 + var6.m02 * var5.m21;
          this.m11 = var6.m10 * var5.m01 + var5.m11 * var6.m11 + var5.m21 * var6.m12;
          this.m21 = var6.m22 * var5.m21 + (var5.m11 * var6.m21 + var6.m20 * var5.m01);
          this.m02 = var6.m02 * var5.m22 + (var5.m02 * var6.m00 + var5.m12 * var6.m01);
          this.m12 = var6.m10 * var5.m02 + var5.m12 * var6.m11 + var6.m12 * var5.m22;
          this.m22 = var5.m12 * var6.m21 + var6.m20 * var5.m02 + var6.m22 * var5.m22;
          this.m03 = var6.m03 + (var5.m03 * var6.m00 + var6.m01 * var5.m13 + var5.m23 * var6.m02);
          this.m13 = var6.m13 + (var6.m11 * var5.m13 + var5.m03 * var6.m10 + var6.m12 * var5.m23);
          this.m23 = var6.m23 + (var5.m13 * var6.m21 + var6.m20 * var5.m03 + var6.m22 * var5.m23);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oj.I(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void setScale(int param0, float param1, float param2, float param3) {
        this.m20 = 0.0f;
        this.m00 = param1;
        this.m23 = 0.0f;
        if (param0 == 5557) {
          this.m10 = 0.0f;
          this.m02 = 0.0f;
          this.m11 = param2;
          this.m01 = 0.0f;
          this.m13 = 0.0f;
          this.m21 = 0.0f;
          this.m22 = param3;
          this.m03 = 0.0f;
          this.m12 = 0.0f;
          return;
        }
    }

    final void setIdentityWithZScale(int param0) {
        this.m03 = 0.0f;
        this.m11 = 1.0f;
        this.m13 = 0.0f;
        this.m00 = 1.0f;
        this.m21 = 0.0f;
        this.m22 = (float)param0;
        this.m23 = 0.0f;
        this.m02 = 0.0f;
        this.m01 = 0.0f;
        this.m20 = 0.0f;
        this.m12 = 0.0f;
        this.m10 = 0.0f;
    }

    final static void a(byte param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param0 != -127) {
          return;
        }
        if (null != Asteroid.field_v) {
          var3 = Asteroid.field_v.c(param1, -8703);
          if (var3 != -2) {
            if (-1 != var3) {
              var4 = Asteroid.field_v.e((byte) -108) ? 1 : 0;
              SecondaryNodeQueue.a(var3, (byte) -119, Asteroid.field_v.i(0), Asteroid.field_v.field_yb, param2, var4 != 0);
            }
            Asteroid.field_v = null;
            TileTextureOperation.d(0);
          }
          return;
        }
    }

    final void copyRotationWithXTranslation(int param0, Transform3D param1) {
        GpuTransform3D var3 = null;
        try {
          var3 = (GpuTransform3D) (param1);
          this.m11 = var3.m11;
          this.m10 = var3.m10;
          this.m23 = 0.0f;
          this.m00 = var3.m00;
          this.m21 = var3.m21;
          this.m01 = var3.m01;
          this.m02 = var3.m02;
          this.m20 = var3.m20;
          this.m12 = var3.m12;
          this.m13 = 0.0f;
          this.m22 = var3.m22;
          this.m03 = (float)param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oj.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final float[] c(float[] param0, byte param1) {
        RuntimeException var3 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0[9] = this.m13;
          if (param1 > -7) {
            this.m02 = 0.04084920510649681f;
          }
          param0[3] = 0.0f;
          param0[14] = 0.0f;
          param0[8] = this.m03;
          param0[2] = 0.0f;
          param0[15] = 1.0f;
          param0[1] = this.m10;
          param0[12] = 0.0f;
          param0[4] = this.m01;
          param0[5] = this.m11;
          param0[0] = this.m00;
          param0[13] = 0.0f;
          param0[6] = 0.0f;
          param0[7] = 0.0f;
          param0[10] = this.m23;
          param0[11] = 0.0f;
          stackIn_3_0 = (float[]) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oj.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    GpuTransform3D() {
        this.setIdentityWithZScale(1);
    }

    static {
        field_b = new ConsoleCommandRegistry();
    }
}
