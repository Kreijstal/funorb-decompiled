/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlTransform3D extends Transform3D {
    private float m03;
    private float m13;
    private float m12;
    private float m23;
    private float m11;
    private float m10;
    static Sprite field_m;
    private float m22;
    private float m02;
    private float m00;
    private float m01;
    private float m20;
    private float m21;

    final float[] getRotationMatrix(byte param0) {
        GetGrapplingHookFireForce.field_p[6] = this.m21;
        GetGrapplingHookFireForce.field_p[0] = this.m00;
        GetGrapplingHookFireForce.field_p[8] = this.m02;
        GetGrapplingHookFireForce.field_p[13] = 0.0f;
        GetGrapplingHookFireForce.field_p[14] = 0.0f;
        GetGrapplingHookFireForce.field_p[10] = this.m22;
        if (param0 > 27) {
          GetGrapplingHookFireForce.field_p[5] = this.m11;
          GetGrapplingHookFireForce.field_p[4] = this.m01;
          GetGrapplingHookFireForce.field_p[12] = 0.0f;
          GetGrapplingHookFireForce.field_p[2] = this.m20;
          GetGrapplingHookFireForce.field_p[9] = this.m12;
          GetGrapplingHookFireForce.field_p[1] = this.m10;
          return GetGrapplingHookFireForce.field_p;
        }
        this.getColumnMajorMatrix(false);
        GetGrapplingHookFireForce.field_p[5] = this.m11;
        GetGrapplingHookFireForce.field_p[4] = this.m01;
        GetGrapplingHookFireForce.field_p[12] = 0.0f;
        GetGrapplingHookFireForce.field_p[2] = this.m20;
        GetGrapplingHookFireForce.field_p[9] = this.m12;
        GetGrapplingHookFireForce.field_p[1] = this.m10;
        return GetGrapplingHookFireForce.field_p;
    }

    final void transformPlane(float[] param0, float param1, float param2, float param3, int param4, float param5) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var7_float = 0.0f;
        RuntimeException var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          if (param4 != 13) {
            this.m23 = -0.19119702279567719f;
          }
          param0[0] = param5 * this.m01 + param1 * this.m00 + this.m02 * param3;
          param0[2] = param3 * this.m22 + (this.m20 * param1 + this.m21 * param5);
          if (!(0.00390625f < param1) &&
            !(-0.00390625f > param1)) {
            if (!(param5 > 0.00390625f) &&
              !(-0.00390625f > param5)) {
              var10 = -param2 / param3;
              var9 = this.m23 + this.m22 * var10;
              var8 = this.m13 + var10 * this.m12;
              var7_float = var10 * this.m02 + this.m03;
            } else {
              var10 = -param2 / param5;
              var9 = this.m23 + this.m21 * var10;
              var7_float = var10 * this.m01 + this.m03;
              var8 = var10 * this.m11 + this.m13;
            }
          } else {
            var10 = -param2 / param1;
            var8 = this.m10 * var10 + this.m13;
            var7_float = var10 * this.m00 + this.m03;
            var9 = this.m23 + this.m20 * var10;
          }
          param0[1] = param3 * this.m12 + (param1 * this.m10 + this.m11 * param5);
          param0[3] = -(param0[0] * var7_float + var8 * param0[1] + var9 * param0[2]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("epb.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void set(boolean param0, Transform3D param1) {
        OpenGlTransform3D var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (OpenGlTransform3D) (param1);
          this.m23 = var3.m23;
          this.m01 = var3.m01;
          this.m03 = var3.m03;
          this.m11 = var3.m11;
          this.m13 = var3.m13;
          this.m12 = var3.m12;
          this.m00 = var3.m00;
          this.m20 = var3.m20;
          this.m02 = var3.m02;
          this.m22 = var3.m22;
          this.m10 = var3.m10;
          this.m21 = var3.m21;
          if (!param0) {
            return;
          }
          OpenGlTransform3D.clearSharedReferences(30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("epb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void setRigidInverse(Transform3D param0, int param1) {
        OpenGlTransform3D var4 = null;
        try {
          var4 = (OpenGlTransform3D) (param0);
          this.m02 = var4.m20;
          this.m00 = var4.m00;
          this.m01 = var4.m10;
          this.m12 = var4.m21;
          this.m10 = var4.m01;
          this.m11 = var4.m11;
          if (param1 != 14) {
            this.setCamera(-58, -73, -57, 3, -107, -43);
          }
          this.m20 = var4.m02;
          this.m03 = -(this.m02 * var4.m23 + (this.m00 * var4.m03 + this.m01 * var4.m13));
          this.m21 = var4.m12;
          this.m22 = var4.m22;
          this.m13 = -(this.m12 * var4.m23 + (this.m11 * var4.m13 + var4.m03 * this.m10));
          this.m23 = -(this.m22 * var4.m23 + (var4.m03 * this.m20 + var4.m13 * this.m21));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "epb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void setIdentityWithZScale(int param0) {
        this.m03 = 0.0f;
        this.m21 = 0.0f;
        this.m23 = 0.0f;
        this.m01 = 0.0f;
        this.m20 = 0.0f;
        this.m11 = 1.0f;
        this.m13 = 0.0f;
        this.m12 = 0.0f;
        this.m10 = 0.0f;
        this.m22 = (float)param0;
        this.m02 = 0.0f;
        this.m00 = 1.0f;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 13) {
          field_m = (Sprite) null;
          field_m = null;
          return;
        }
        field_m = null;
    }

    final void flipYZ(int param0) {
        this.m11 = -this.m11;
        this.m22 = -this.m22;
        this.m20 = -this.m20;
        if (param0 == 5) {
          this.m13 = -this.m13;
          this.m23 = -this.m23;
          this.m21 = -this.m21;
          this.m12 = -this.m12;
          this.m10 = -this.m10;
          return;
        }
        this.getColumnMajorMatrix(true);
        this.m13 = -this.m13;
        this.m23 = -this.m23;
        this.m21 = -this.m21;
        this.m12 = -this.m12;
        this.m10 = -this.m10;
    }

    final float[] getColumnMajorMatrix(boolean param0) {
        GetGrapplingHookFireForce.field_p[13] = this.m13;
        GetGrapplingHookFireForce.field_p[4] = this.m01;
        GetGrapplingHookFireForce.field_p[14] = this.m23;
        GetGrapplingHookFireForce.field_p[0] = this.m00;
        GetGrapplingHookFireForce.field_p[1] = this.m10;
        GetGrapplingHookFireForce.field_p[2] = this.m20;
        GetGrapplingHookFireForce.field_p[5] = this.m11;
        GetGrapplingHookFireForce.field_p[6] = this.m21;
        GetGrapplingHookFireForce.field_p[12] = this.m03;
        GetGrapplingHookFireForce.field_p[9] = this.m12;
        GetGrapplingHookFireForce.field_p[10] = this.m22;
        GetGrapplingHookFireForce.field_p[8] = this.m02;
        if (param0) {
          return GetGrapplingHookFireForce.field_p;
        }
        this.m03 = 1.1959586143493652f;
        return GetGrapplingHookFireForce.field_p;
    }

    final void setCamera(int param0, int param1, int param2, int param3, int param4, int param5) {
        float var7 = GetFighterBayReload.field_o[16383 & param3];
        float var8 = GetFighterBayReload.field_r[param3 & 16383];
        float var9 = GetFighterBayReload.field_o[param4 & 16383];
        float var10 = GetFighterBayReload.field_r[param4 & 16383];
        float var11 = GetFighterBayReload.field_o[param5 & 16383];
        float var12 = GetFighterBayReload.field_r[16383 & param5];
        float var13 = var11 * var8;
        float var14 = var8 * var12;
        this.m00 = var9 * var11 + var14 * var10;
        this.m11 = var7 * var11;
        this.m02 = var14 * var9 + var11 * -var10;
        this.m22 = var7 * var9;
        this.m12 = var10 * var12 + var9 * var13;
        this.m01 = var7 * var12;
        this.m10 = var13 * var10 + var12 * -var9;
        this.m20 = var7 * var10;
        this.m21 = -var8;
        this.m03 = -((float)param1 * this.m01) + (float)(-param0) * this.m00 - this.m02 * (float)param2;
        this.m13 = -(this.m12 * (float)param2) + (this.m10 * (float)(-param0) - this.m11 * (float)param1);
        this.m23 = -(this.m22 * (float)param2) + (-(this.m21 * (float)param1) + (float)(-param0) * this.m20);
    }

    OpenGlTransform3D() {
        this.setIdentityWithZScale(1);
    }

    static {
    }
}
