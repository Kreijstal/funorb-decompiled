/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class OpenGlModel extends Model3D {
    private float[] field_k;
    private byte[] field_q;
    private short[] field_E;
    private OpenGlVertexAttribute field_i;
    private short[] field_G;
    private OpenGlFaceAttachment[] field_D;
    private int field_w;
    private int field_u;
    private short minZ;
    private short[] field_g;
    private int field_d;
    private short[] field_b;
    private short[] field_A;
    private short[] field_n;
    private OpenGlFaceAttachmentState[] field_r;
    private short[] field_l;
    private short minX;
    private short maxZ;
    private int[] vertexY;
    static String field_m;
    private int field_B;
    private short[] field_h;
    private int[] field_H;
    static boolean field_v;
    private int[][] field_K;
    private short maxX;
    private int[] vertexZ;
    private short[] field_c;
    private float[] field_J;
    private int vertexCount;
    private byte[] field_z;
    private boolean boundsValid;
    private int field_o;
    private int[] field_F;
    private int field_x;
    private int[] vertexX;
    private short[] field_I;

    final void scale(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = VoidHunters.field_G;
        for (var4 = 0; this.vertexCount > var4; var4++) {
          if (param0 != 128) {
            this.vertexX[var4] = param0 * this.vertexX[var4] >> 7;
          }
          if (param1 != 128) {
            this.vertexY[var4] = param1 * this.vertexY[var4] >> 7;
          }
          if (param2 != 128) {
            this.vertexZ[var4] = param2 * this.vertexZ[var4] >> 7;
          }
        }
        if (this.field_i == null) {
        }
        this.boundsValid = false;
    }

    private final short getOrCreateRenderVertex(byte param0, int param1, int param2, int param3, float param4, int param5, long param6, int param7, ModelData param8, float param9) {
        int var15 = 0;
        int fieldTemp$0 = 0;
        short stackIn_7_0 = 0;
        short stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = VoidHunters.field_G;
        try {
          var12_int = this.field_H[param7];
          var13 = this.field_H[param7 + 1];
          var14 = 0;
          for (var15 = var12_int; var15 < var13; var15++) {
            var16 = this.field_c[var15];
            if (var16 != 0) {
              if (WidgetNode.field_m[var15] != param6) {
                continue;
              }
              stackIn_7_0 = (short)(-1 + var16);
              return stackIn_7_0;
            }
            var14 = var15;
            break;
          }
          this.field_c[var14] = (short)(this.field_x + 1);
          WidgetNode.field_m[var14] = param6;
          this.field_I[this.field_x] = (short)param1;
          this.field_h[this.field_x] = (short)param2;
          this.field_A[this.field_x] = (short)param5;
          this.field_z[this.field_x] = (byte)param3;
          this.field_J[this.field_x] = param9;
          this.field_k[this.field_x] = param4;
          if (param0 < 109) {
            this.field_G = (short[]) null;
          }
          fieldTemp$0 = this.field_x;
          this.field_x = this.field_x + 1;
          stackIn_12_0 = (short)fieldTemp$0;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_15_0 = var12;
          stackIn_15_1 = new StringBuilder().append("ne.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param9).append(')').toString());
        }
    }

    final void translate(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = VoidHunters.field_G;
        for (var4 = 0; var4 < this.vertexCount; var4++) {
          if (0 != param0) {
            this.vertexX[var4] = this.vertexX[var4] + param0;
          }
          if (param1 != 0) {
            this.vertexY[var4] = this.vertexY[var4] + param1;
          }
          if (param2 != 0) {
            this.vertexZ[var4] = this.vertexZ[var4] + param2;
          }
        }
        if (null == this.field_i) {
        }
        this.boundsValid = false;
    }

    final int getMaxZ() {
        if (!this.boundsValid) {
          this.updateBounds((byte) -10);
        }
        return this.maxZ;
    }

    final int getMinX() {
        if (!this.boundsValid) {
          this.updateBounds((byte) -10);
        }
        return this.minX;
    }

    private final void updateBounds(byte param0) {
        int var10 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var14Lifetime1;
        var15 = VoidHunters.field_G;
        var2 = 32767;
        var3 = 32767;
        if (param0 != -10) {
          return;
        }
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        var8 = 0;
        var9 = 0;
        for (var10 = 0; this.vertexCount > var10; var10++) {
          var11 = this.vertexX[var10];
          var12 = this.vertexY[var10];
          if (var11 > var5) {
            var5 = var11;
          }
          if (var12 < var3) {
            var3 = var12;
          }
          if (var11 < var2) {
            var2 = var11;
          }
          var13 = this.vertexZ[var10];
          if (var12 > var6) {
            var6 = var12;
          }
          if (var13 < var4) {
            var4 = var13;
          }
          if (var13 > var7) {
            var7 = var13;
          }
          var14 = var11 * var11 + var13 * var13;
          if (var8 < var14) {
            var8 = var14;
          }
          var14Lifetime1 = var13 * var13 + (var11 * var11 + var12 * var12);
          if (var9 < var14Lifetime1) {
            var9 = var14Lifetime1;
          }
        }
        this.minX = (short)var2;
        this.maxZ = (short)var7;
        this.maxX = (short)var5;
        this.minZ = (short)var4;
        Math.sqrt((double)var8);
        Math.sqrt((double)var9);
        this.boundsValid = true;
        return;
    }

    final static String replaceCharacter(char param0, byte param1, String param2, String param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        java.applet.Applet var12 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = VoidHunters.field_G;
        try {
          if (param1 <= 97) {
            var12 = (java.applet.Applet) null;
            OpenGlModel.updateUrlSessionSettings((java.net.URL) null, (byte) 9, (java.applet.Applet) null);
          }
          var4_int = param3.length();
          var5 = param2.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param3.indexOf((int) param0, var8_int);
              if (var8_int < 0) {
                break;
              }
              var8_int++;
              var6 = var6 + var7;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param3.indexOf((int) param0, var9);
            if (var10 < 0) {
              discarded$4 = var8.append(param3.substring(var9));
              stackIn_13_0 = var8.toString();
              return stackIn_13_0;
            }
            discarded$2 = var8.append(param3.substring(var9, var10));
            discarded$3 = var8.append(param2);
            var9 = 1 + var10;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ne.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static java.net.URL updateUrlSessionSettings(java.net.URL param0, byte param1, java.applet.Applet param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        Object var5 = null;
        java.net.URL stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5Lifetime1;
        Object var5Lifetime2;
        try {
          var3_int = -60 / ((param1 + 49) / 39);
          var4 = null;
          if (IntrusiveNodeHashTable.field_e != null &&
            !IntrusiveNodeHashTable.field_e.equals(param2.getParameter("settings"))) {
            var4 = IntrusiveNodeHashTable.field_e;
            var5 = var4;
            var5Lifetime2 = var4;
          }
          var5Lifetime1 = null;
          if (SetMachineGunAimarc.field_p != null &&
            !SetMachineGunAimarc.field_p.equals(param2.getParameter("session"))) {
            var5Lifetime1 = SetMachineGunAimarc.field_p;
          }
          stackIn_8_0 = OpenGlBloomEffect.rewriteUrlPathParameters(-1, param0, (byte) 50, (String) (var4), (String) (var5Lifetime1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ne.D(");
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
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int getMinZ() {
        if (!this.boundsValid) {
          this.updateBounds((byte) -10);
        }
        return this.minZ;
    }

    final int getMaxX() {
        if (!this.boundsValid) {
          this.updateBounds((byte) -10);
        }
        return this.maxX;
    }

    public static void clearSharedReferences(int param0) {
        field_m = null;
        if (param0 != -2) {
          field_m = (String) null;
        }
    }

    final static boolean pollSocketRequest(boolean param0, byte param1) {
        long dupTemp$2 = 0L;
        if (param1 != -11) {
          return true;
        }
        if (null == GetPointDefenceLaserProjectiles.field_o) {
          GetPointDefenceLaserProjectiles.field_o = TextureBezierShape.field_n.openSocket(SetNebulaProximityFadeDownshift.field_p, GetAutozoomAmountMultiply.field_p, -122);
        }
        if (GetPointDefenceLaserProjectiles.field_o.status == 0) {
          return false;
        }
        dupTemp$2 = MonotonicMillisClock.currentTimeMillis(false);
        GetTorpedoProjectileOndamageParticles.field_o = dupTemp$2;
        ModelData.lastNetworkReadTimeMillis = dupTemp$2;
        if (1 != GetPointDefenceLaserProjectiles.field_o.status) {
        }
        TextureCombineMappings.loginStage = GetMissileLauncherRandomness.field_o;
        GetPointDefenceLaserProjectiles.field_o = null;
        return true;
    }

    OpenGlModel(OpenGlToolkit param0) {
        OpenGlVertexAttribute discarded$0 = null;
        OpenGlVertexAttribute discarded$1 = null;
        OpenGlVertexAttribute discarded$2 = null;
        GameJoinNotificationText discarded$3 = null;
        this.field_B = 0;
        this.vertexCount = 0;
        this.field_d = 0;
        this.boundsValid = false;
        this.field_x = 0;
        try {
          this.field_i = new OpenGlVertexAttribute((OpenGlVertexBufferBinding) null, 5126, 3, 0);
          discarded$0 = new OpenGlVertexAttribute((OpenGlVertexBufferBinding) null, 5126, 2, 0);
          discarded$1 = new OpenGlVertexAttribute((OpenGlVertexBufferBinding) null, 5126, 3, 0);
          discarded$2 = new OpenGlVertexAttribute((OpenGlVertexBufferBinding) null, 5121, 4, 0);
          discarded$3 = new GameJoinNotificationText();
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    OpenGlModel(OpenGlToolkit param0, ModelData param1, int param2, int param3, int param4, int param5) {
        OpenGlVertexAttribute discarded$0 = null;
        OpenGlVertexAttribute discarded$1 = null;
        OpenGlVertexAttribute discarded$2 = null;
        GameJoinNotificationText discarded$3 = null;
        int var9_int = 0;
        int fieldTemp$9 = 0;
        short dupTemp$10 = 0;
        short dupTemp$11 = 0;
        short dupTemp$12 = 0;
        int var11_int = 0;
        OpenGlFaceNormal dupTemp$8 = null;
        int incrementValue$7 = 0;
        int[] array$6 = null;
        int dupTemp$4 = 0;
        int[] arrayValue$5 = null;
        int stackIn_25_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_113_0 = 0;
        long stackIn_168_0 = 0L;
        int stackIn_168_1 = 0;
        int stackIn_169_2 = 0;
        RuntimeException stackIn_211_0 = null;
        StringBuilder stackIn_211_1 = null;
        String stackIn_212_2 = null;
        StringBuilder stackIn_214_1 = null;
        String stackIn_215_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int[] var8 = null;
        long[] var9 = null;
        int var10 = 0;
        TextureMetadata var10_ref_opa = null;
        OpenGlVertexNormal[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        Object var13_ref = null;
        int var14 = 0;
        int var15_int = 0;
        OpenGlFaceNormal[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int var19_int = 0;
        int var20 = 0;
        ModelFaceAttachment var20_ref_bqa = null;
        int var21 = 0;
        ModelFaceAttachmentDefinition var21_ref_sr = null;
        float var22 = 0.0f;
        int var22_int = 0;
        float var23 = 0.0f;
        int var23_int = 0;
        float var24 = 0.0f;
        int var24_int = 0;
        float var25 = 0.0f;
        int var25_int = 0;
        float var26 = 0.0f;
        int var26_int = 0;
        float var27 = 0.0f;
        int var27_int = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        OpenGlFaceNormal var31_ref_dea = null;
        int var32_int = 0;
        OpenGlFaceNormal var32 = null;
        long var32_long = 0L;
        int var33_int = 0;
        long var33 = 0L;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        float var38 = 0.0f;
        int var39 = 0;
        float var39_float = 0.0f;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        int var43 = 0;
        float var43_float = 0.0f;
        int var44 = 0;
        float var44_float = 0.0f;
        int var45 = 0;
        float var45_float = 0.0f;
        int var46 = 0;
        float var46_float = 0.0f;
        int var47 = 0;
        float var47_float = 0.0f;
        int var48 = 0;
        float var48_float = 0.0f;
        int var49 = 0;
        float var49_float = 0.0f;
        int var50 = 0;
        float var50_float = 0.0f;
        int var51 = 0;
        float var51_float = 0.0f;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        int[] var64 = null;
        TextureProvider var65 = null;
        TextureMetadata var66 = null;
        TextureMetadata var67 = null;
        long[] var68 = null;
        ModelFaceAttachment var69 = null;
        ModelFaceAttachmentDefinition var70 = null;
        OpenGlVertexNormal var71 = null;
        OpenGlVertexNormal var72 = null;
        OpenGlVertexNormal var73 = null;
        TextureMetadata var74 = null;
        TextureMappingData var75 = null;
        OpenGlVertexNormal var77 = null;
        OpenGlVertexNormal var78 = null;
        OpenGlVertexNormal var79 = null;
        int[] var80 = null;
        int[] var81 = null;
        long[] var82 = null;
        int[] var84 = null;
        float[] var86 = null;
        int var14Lifetime1;
        int var15_intLifetime1;
        int var15_intLifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var19_intLifetime1;
        int var19_intLifetime2;
        int var19_intLifetime3;
        int var19_intLifetime4;
        int var21Lifetime1;
        int var21Lifetime2;
        int var28Lifetime1;
        int var29Lifetime1;
        int var30Lifetime1;
        int var31Lifetime1;
        int var34Lifetime1;
        int var35Lifetime1;
        int var36Lifetime1;
        float var59Lifetime1;
        float var60Lifetime1;
        float var61Lifetime1;
        float var62Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var16Lifetime5;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var20Lifetime1;
        int var20Lifetime2;
        int var18Lifetime6;
        int var19_intLifetime5;
        int var21Lifetime2Lifetime1;
        int var16Lifetime1Lifetime1;
        int var16Lifetime1Lifetime2;
        this.field_B = 0;
        this.vertexCount = 0;
        this.field_d = 0;
        this.boundsValid = false;
        this.field_x = 0;
        try {
          this.field_w = param2;
          this.field_u = param5;
          if (GetCountermeasureLauncherEnergyUsed.a(param5, 82, param2)) {
            this.field_i = new OpenGlVertexAttribute((OpenGlVertexBufferBinding) null, 5126, 3, 0);
          }
          if (OpenGlIndexBuffer.a(param5, param2, false)) {
            discarded$0 = new OpenGlVertexAttribute((OpenGlVertexBufferBinding) null, 5126, 2, 0);
          }
          if (TextLayoutLine.matchesGpuVertexDataMask(-8636, param2, param5)) {
            discarded$1 = new OpenGlVertexAttribute((OpenGlVertexBufferBinding) null, 5126, 3, 0);
          }
          if (SocketConnector.a(-6070, param5, param2)) {
            discarded$2 = new OpenGlVertexAttribute((OpenGlVertexBufferBinding) null, 5121, 4, 0);
          }
          if (GetMissionDebrisVotingChancestep.a(param2, param5, false)) {
            discarded$3 = new GameJoinNotificationText();
          }
          var65 = param0.field_a;
          this.field_H = new int[param1.field_D + 1];
          var81 = new int[param1.faceCount];
          var64 = var81;
          var8 = var64;
          for (var9_int = 0; var9_int < param1.faceCount; var9_int++) {
            boolean decompiledFrameRemainder0 = true;
            if (param1.field_E == null ||
              param1.field_E[var9_int] != 2) {
              if (null != param1.field_u &&
                param1.field_u[var9_int] != -1) {
                var10_ref_opa = var65.getTextureMetadata(-20292, param1.field_u[var9_int] & 65535);
                decompiledFrameRemainder0 = (((64 & this.field_u) != 0 &&
                  var10_ref_opa.field_r) || !(var10_ref_opa.field_m));
              }
              if (decompiledFrameRemainder0) {
                fieldTemp$9 = this.field_B;
                this.field_B = this.field_B + 1;
                var8[fieldTemp$9] = var9_int;
                dupTemp$10 = param1.faceVertexA[var9_int];
                this.field_H[dupTemp$10] = this.field_H[dupTemp$10] + 1;
                dupTemp$11 = param1.faceVertexB[var9_int];
                this.field_H[dupTemp$11] = this.field_H[dupTemp$11] + 1;
                dupTemp$12 = param1.faceVertexC[var9_int];
                this.field_H[dupTemp$12] = this.field_H[dupTemp$12] + 1;
              }
            }
          }
          this.field_d = this.field_B;
          var82 = new long[this.field_B];
          var68 = var82;
          var9 = var68;
          stackIn_25_0 = (0 == (256 & this.field_w)) ? 0 : 1;
          var10 = stackIn_25_0;
          for (var11_int = 0; this.field_B > var11_int; var11_int++) {
            boolean decompiledFrameRemainder1 = true;
            var12 = var81[var11_int];
            var13_ref = null;
            var14 = 0;
            var15_int = 0;
            var16 = 0;
            var17 = 0;
            if (null != param1.faceAttachments) {
              var18 = 0;
              for (var19_int = 0; param1.faceAttachments.length > var19_int; var19_int++) {
                var20_ref_bqa = param1.faceAttachments[var19_int];
                if (~var20_ref_bqa.faceIndex == ~var12) {
                  var21_ref_sr = GetBombletSprayAimspeed.getFaceAttachmentDefinition(var20_ref_bqa.definitionId, 0);
                  if (var21_ref_sr.field_a) {
                    var18 = 1;
                  }
                  if (var21_ref_sr.field_e != -1) {
                    var66 = var65.getTextureMetadata(-20292, var21_ref_sr.field_e);
                    if (var66.field_q != 2) {
                    }
                  }
                }
              }
              if (var18 != 0) {
                var9[var11_int] = 9223372036854775807L;
                this.field_d = this.field_d - 1;
                decompiledFrameRemainder1 = false;
              }
            }
            if (decompiledFrameRemainder1) {
              var18Lifetime6 = -1;
              if (param1.field_u != null) {
                var18Lifetime6 = param1.field_u[var12];
                if (var18Lifetime6 != -1) {
                  var67 = var65.getTextureMetadata(-20292, 65535 & var18Lifetime6);
                  var13_ref = var67;
                  if (0 != (64 & this.field_u) &&
                    var67.field_r) {
                    var13_ref = null;
                    var18Lifetime6 = -1;
                  } else {
                    var17 = var67.field_n;
                    if (0 == var67.field_p &&
                      var67.field_d != 0) {
                    }
                    var16 = var67.field_c;
                  }
                }
              }
              if (null != param1.field_r &&
                param1.field_r[var12] != 0) {
                stackIn_55_0 = 1;
              } else {
                if (var13_ref != null) {
                  stackIn_55_0 = (0 != ((TextureMetadata) (var13_ref)).field_q) ? 1 : 0;
                } else {
                  stackIn_55_0 = 0;
                }
              }
              var19_intLifetime5 = stackIn_55_0;
              if ((var10 != 0 ||
                var19_intLifetime5 != 0) && null != param1.field_m) {
                var14 = var14 + (param1.field_m[var12] << 17);
              }
              if (var19_intLifetime5 != 0) {
                var14 = var14 + 65536;
              }
              var14 = var14 + (65280 & var16 << 8);
              var15_int = var15_int + ((65535 & var18Lifetime6) << 16);
              var14 = var14 + (var17 & 255);
              var15_int = var15_int + (65535 & var11_int);
              var9[var11_int] = ((long)var14 << 32) + (long)var15_int;
            }
          }
          GetFighterBayReload.a((byte) -24, var81, var82);
          this.vertexZ = param1.vertexZ;
          this.vertexX = param1.vertexX;
          this.vertexCount = param1.field_D;
          this.vertexY = param1.vertexY;
          var11 = new OpenGlVertexNormal[this.vertexCount];
          if (param1.faceAttachments != null) {
            this.field_o = param1.faceAttachments.length;
            this.field_r = new OpenGlFaceAttachmentState[this.field_o];
            this.field_D = new OpenGlFaceAttachment[this.field_o];
            for (var12Lifetime1 = 0; this.field_o > var12Lifetime1; var12Lifetime1++) {
              var69 = param1.faceAttachments[var12Lifetime1];
              var70 = GetBombletSprayAimspeed.getFaceAttachmentDefinition(var69.definitionId, 0);
              var15_intLifetime1 = -1;
              for (var16Lifetime1 = 0; this.field_B > var16Lifetime1; var16Lifetime1++) {
                if (var81[var16Lifetime1] != var69.faceIndex) {
                  continue;
                }
                var15_intLifetime1 = var16Lifetime1;
                break;
              }
              if (-1 == var15_intLifetime1) {
                throw new RuntimeException();
              }
              var16Lifetime1Lifetime1 = GetLagStandardDeviationIn.hslPalette[65535 & param1.field_b[var69.faceIndex]] & 16777215;
              stackIn_75_0 = var16Lifetime1Lifetime1;
              if (param1.field_r == null) {
                stackIn_76_1 = 0;
              } else {
                stackIn_76_1 = param1.field_r[var69.faceIndex];
              }
              var16Lifetime1Lifetime2 = stackIn_75_0 | -stackIn_76_1 + 255 << 24;
              this.field_D[var12Lifetime1] = new OpenGlFaceAttachment(var15_intLifetime1, (int) param1.faceVertexA[var69.faceIndex], (int) param1.faceVertexB[var69.faceIndex], (int) param1.faceVertexC[var69.faceIndex], var70.field_g, var70.field_b, var70.field_e, var70.field_d, var70.field_f, var70.field_a, var70.field_c, var69.field_c);
              this.field_r[var12Lifetime1] = new OpenGlFaceAttachmentState(var16Lifetime1Lifetime2);
            }
          }
          var12Lifetime2 = 3 * this.field_B;
          this.field_g = new short[this.field_B];
          this.field_k = new float[var12Lifetime2];
          this.field_h = new short[var12Lifetime2];
          this.field_c = new short[var12Lifetime2];
          this.field_q = new byte[this.field_B];
          WidgetNode.field_m = new long[var12Lifetime2];
          this.field_E = new short[this.field_B];
          this.field_J = new float[var12Lifetime2];
          this.field_l = new short[this.field_B];
          this.field_z = new byte[var12Lifetime2];
          this.field_I = new short[var12Lifetime2];
          this.field_b = new short[this.field_B];
          this.field_A = new short[var12Lifetime2];
          if (null != param1.field_w) {
            this.field_G = new short[this.field_B];
          }
          this.field_n = new short[this.field_B];
          var13 = 0;
          for (var14Lifetime1 = 0; param1.field_D > var14Lifetime1; var14Lifetime1++) {
            var15_intLifetime2 = this.field_H[var14Lifetime1];
            this.field_H[var14Lifetime1] = var13;
            var11[var14Lifetime1] = new OpenGlVertexNormal();
            var13 = var13 + var15_intLifetime2;
          }
          this.field_H[param1.field_D] = var13;
          var75 = SetSpecialOrderBoxWidth.a(param1, var81, this.field_B, -3);
          var15 = new OpenGlFaceNormal[param1.faceCount];
          var16Lifetime2 = 0;
          while (param1.faceCount > var16Lifetime2) {
            var17Lifetime1 = param1.faceVertexA[var16Lifetime2];
            var18Lifetime1 = param1.faceVertexB[var16Lifetime2];
            var19_intLifetime1 = param1.faceVertexC[var16Lifetime2];
            var20 = this.vertexX[var18Lifetime1] - this.vertexX[var17Lifetime1];
            var21 = this.vertexY[var18Lifetime1] - this.vertexY[var17Lifetime1];
            var22_int = -this.vertexZ[var17Lifetime1] + this.vertexZ[var18Lifetime1];
            var23_int = this.vertexX[var19_intLifetime1] - this.vertexX[var17Lifetime1];
            var24_int = -this.vertexY[var17Lifetime1] + this.vertexY[var19_intLifetime1];
            var25_int = this.vertexZ[var19_intLifetime1] - this.vertexZ[var17Lifetime1];
            var26_int = -(var22_int * var24_int) + var25_int * var21;
            var27_int = var22_int * var23_int - var25_int * var20;
            var28 = -(var21 * var23_int) + var24_int * var20;
            while (true) {
              if (8192 >= var26_int &&
                8192 >= var27_int &&
                var28 <= 8192 &&
                -8192 <= var26_int &&
                var27_int >= -8192 &&
                -8192 <= var28) {
                var29 = (int)Math.sqrt((double)(var26_int * var26_int + var27_int * var27_int + var28 * var28));
                if (0 >= var29) {
                  var29 = 1;
                }
                var28 = 256 * var28 / var29;
                var27_int = 256 * var27_int / var29;
                var26_int = 256 * var26_int / var29;
                if (param1.field_E != null) {
                  stackIn_97_0 = param1.field_E[var16Lifetime2];
                } else {
                  stackIn_97_0 = 0;
                }
                var30 = stackIn_97_0;
                if (var30 != 0) {
                  if (var30 == 1) {
                    dupTemp$8 = new OpenGlFaceNormal();
                    var15[var16Lifetime2] = dupTemp$8;
                    var31_ref_dea = dupTemp$8;
                    var31_ref_dea.z = var28;
                    var31_ref_dea.y = var27_int;
                    var31_ref_dea.x = var26_int;
                  }
                } else {
                  var71 = var11[var17Lifetime1];
                  var71.x = var71.x + var26_int;
                  var71.y = var71.y + var27_int;
                  var71.z = var71.z + var28;
                  var71.contributionCount = var71.contributionCount + 1;
                  var72 = var11[var18Lifetime1];
                  var72.x = var72.x + var26_int;
                  var72.y = var72.y + var27_int;
                  var72.contributionCount = var72.contributionCount + 1;
                  var72.z = var72.z + var28;
                  var73 = var11[var19_intLifetime1];
                  var73.y = var73.y + var27_int;
                  var73.z = var73.z + var28;
                  var73.x = var73.x + var26_int;
                  var73.contributionCount = var73.contributionCount + 1;
                }
                var16Lifetime2++;
                break;
              }
              var26_int = var26_int >> 1;
              var28 = var28 >> 1;
              var27_int = var27_int >> 1;
            }
          }
          for (var16Lifetime3 = 0; this.field_B > var16Lifetime3; var16Lifetime3++) {
            var17Lifetime2 = var81[var16Lifetime3];
            var18Lifetime2 = param1.field_b[var17Lifetime2] & 65535;
            if (param1.field_M != null) {
              var19_intLifetime2 = param1.field_M[var17Lifetime2];
            } else {
              var19_intLifetime2 = -1;
            }
            if (null == param1.field_r) {
              var20Lifetime1 = 0;
            } else {
              var20Lifetime1 = param1.field_r[var17Lifetime2] & 255;
            }
            if (null == param1.field_u) {
              stackIn_113_0 = -1;
            } else {
              stackIn_113_0 = param1.field_u[var17Lifetime2];
            }
            var21Lifetime1 = stackIn_113_0;
            if (var21Lifetime1 != -1 &&
              (64 & this.field_u) != 0) {
              var74 = var65.getTextureMetadata(-20292, var21Lifetime1 & 65535);
              if (var74.field_r) {
                var21Lifetime1 = -1;
              }
            }
            var22 = 0.0f;
            var23 = 0.0f;
            var24 = 0.0f;
            var25 = 0.0f;
            var26 = 0.0f;
            var27 = 0.0f;
            var28Lifetime1 = 0;
            var29Lifetime1 = 0;
            var30Lifetime1 = 0;
            if (var21Lifetime1 != -1) {
              if (var19_intLifetime2 != -1) {
                var19_intLifetime2 = var19_intLifetime2 & 255;
                var31 = param1.field_e[var19_intLifetime2];
                if (0 != var31) {
                  var32_int = param1.faceVertexA[var17Lifetime2];
                  var33_int = param1.faceVertexB[var17Lifetime2];
                  var34 = param1.faceVertexC[var17Lifetime2];
                  var35 = var75.originX[var19_intLifetime2];
                  var36 = var75.originY[var19_intLifetime2];
                  var37 = var75.originZ[var19_intLifetime2];
                  var86 = var75.transforms[var19_intLifetime2];
                  var39 = param1.field_n[var19_intLifetime2];
                  var40 = (float)param1.field_L[var19_intLifetime2] / 256.0f;
                  if (var31 != 1) {
                    if (var31 == 2) {
                      var41 = (float)param1.field_f[var19_intLifetime2] / 256.0f;
                      var42 = (float)param1.field_I[var19_intLifetime2] / 256.0f;
                      var43 = -param1.vertexX[var32_int] + param1.vertexX[var33_int];
                      var44 = param1.vertexY[var33_int] - param1.vertexY[var32_int];
                      var45 = param1.vertexZ[var33_int] - param1.vertexZ[var32_int];
                      var46 = param1.vertexX[var34] - param1.vertexX[var32_int];
                      var47 = -param1.vertexY[var32_int] + param1.vertexY[var34];
                      var48 = -param1.vertexZ[var32_int] + param1.vertexZ[var34];
                      var49 = var44 * var48 - var45 * var47;
                      var50 = var46 * var45 - var48 * var43;
                      var51 = var47 * var43 - var46 * var44;
                      var52 = 64.0f / (float)param1.field_F[var19_intLifetime2];
                      var53 = 64.0f / (float)param1.field_a[var19_intLifetime2];
                      var54 = 64.0f / (float)param1.field_C[var19_intLifetime2];
                      var55 = (var86[2] * (float)var51 + ((float)var49 * var86[0] + (float)var50 * var86[1])) / var52;
                      var56 = ((float)var50 * var86[4] + (float)var49 * var86[3] + var86[5] * (float)var51) / var53;
                      var57 = (var86[7] * (float)var50 + var86[6] * (float)var49 + var86[8] * (float)var51) / var54;
                      var30Lifetime1 = GetSniperCannonRandomness.a(-93, var56, var55, var57);
                      SetPointDefenceLaserRandomness.a(var42, param1.vertexZ[var32_int], var41, (byte) 39, param1.vertexX[var32_int], var37, param1.vertexY[var32_int], var30Lifetime1, MissionBuilder.field_f, var35, var39, var86, var36, var40);
                      var23 = MissionBuilder.field_f[1];
                      var22 = MissionBuilder.field_f[0];
                      SetPointDefenceLaserRandomness.a(var42, param1.vertexZ[var33_int], var41, (byte) 67, param1.vertexX[var33_int], var37, param1.vertexY[var33_int], var30Lifetime1, MissionBuilder.field_f, var35, var39, var86, var36, var40);
                      var24 = MissionBuilder.field_f[0];
                      var25 = MissionBuilder.field_f[1];
                      SetPointDefenceLaserRandomness.a(var42, param1.vertexZ[var34], var41, (byte) 26, param1.vertexX[var34], var37, param1.vertexY[var34], var30Lifetime1, MissionBuilder.field_f, var35, var39, var86, var36, var40);
                      var27 = MissionBuilder.field_f[1];
                      var26 = MissionBuilder.field_f[0];
                    } else {
                      if (3 == var31) {
                        CommonGameState.computeSphericalTextureCoordinates(var86, param1.vertexZ[var32_int], var40, MissionBuilder.field_f, var37, param1.vertexX[var32_int], (byte) -82, var36, param1.vertexY[var32_int], var39, var35);
                        var23 = MissionBuilder.field_f[1];
                        var22 = MissionBuilder.field_f[0];
                        CommonGameState.computeSphericalTextureCoordinates(var86, param1.vertexZ[var33_int], var40, MissionBuilder.field_f, var37, param1.vertexX[var33_int], (byte) -82, var36, param1.vertexY[var33_int], var39, var35);
                        var24 = MissionBuilder.field_f[0];
                        var25 = MissionBuilder.field_f[1];
                        CommonGameState.computeSphericalTextureCoordinates(var86, param1.vertexZ[var34], var40, MissionBuilder.field_f, var37, param1.vertexX[var34], (byte) -82, var36, param1.vertexY[var34], var39, var35);
                        var27 = MissionBuilder.field_f[1];
                        var26 = MissionBuilder.field_f[0];
                        if ((1 & var39) != 0) {
                          if (0.5f < -var23 + var25) {
                            var28Lifetime1 = 1;
                            var25 = var25 - 1.0f;
                          } else {
                            if (0.5f < var23 - var25) {
                              var25 = var25 + 1.0f;
                              var28Lifetime1 = 2;
                            }
                          }
                          if (!(-var23 + var27 > 0.5f)) {
                            if (0.5f < var23 - var27) {
                              var27 = var27 + 1.0f;
                              var29Lifetime1 = 2;
                            }
                          } else {
                            var27 = var27 - 1.0f;
                            var29Lifetime1 = 1;
                          }
                        } else {
                          if (!(0.5f < var24 - var22)) {
                            if (0.5f < var22 - var24) {
                              var28Lifetime1 = 2;
                              var24 = var24 + 1.0f;
                            }
                          } else {
                            var24 = var24 - 1.0f;
                            var28Lifetime1 = 1;
                          }
                          if (var26 - var22 > 0.5f) {
                            var26 = var26 - 1.0f;
                            var29Lifetime1 = 1;
                          } else {
                            if (0.5f < -var26 + var22) {
                              var29Lifetime1 = 2;
                              var26 = var26 + 1.0f;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var41 = (float)param1.field_C[var19_intLifetime2] / 1024.0f;
                    TextEncodings.computeCylindricalTextureCoordinates(var86, var36, var39, var40, param1.vertexX[var32_int], param1.vertexY[var32_int], (byte) -52, var41, var37, MissionBuilder.field_f, var35, param1.vertexZ[var32_int]);
                    var22 = MissionBuilder.field_f[0];
                    var23 = MissionBuilder.field_f[1];
                    TextEncodings.computeCylindricalTextureCoordinates(var86, var36, var39, var40, param1.vertexX[var33_int], param1.vertexY[var33_int], (byte) -52, var41, var37, MissionBuilder.field_f, var35, param1.vertexZ[var33_int]);
                    var24 = MissionBuilder.field_f[0];
                    var25 = MissionBuilder.field_f[1];
                    TextEncodings.computeCylindricalTextureCoordinates(var86, var36, var39, var40, param1.vertexX[var34], param1.vertexY[var34], (byte) -52, var41, var37, MissionBuilder.field_f, var35, param1.vertexZ[var34]);
                    var27 = MissionBuilder.field_f[1];
                    var26 = MissionBuilder.field_f[0];
                    var42 = var41 / 2.0f;
                    if ((var39 & 1) == 0) {
                      if (!(var42 < var24 - var22)) {
                        if (-var24 + var22 > var42) {
                          var24 = var24 + var41;
                          var28Lifetime1 = 2;
                        }
                      } else {
                        var28Lifetime1 = 1;
                        var24 = var24 - var41;
                      }
                      if (var26 - var22 > var42) {
                        var26 = var26 - var41;
                        var29Lifetime1 = 1;
                      } else {
                        if (-var26 + var22 > var42) {
                          var29Lifetime1 = 2;
                          var26 = var26 + var41;
                        }
                      }
                    } else {
                      if (-var23 + var25 > var42) {
                        var25 = var25 - var41;
                        var28Lifetime1 = 1;
                      } else {
                        if (var42 < -var25 + var23) {
                          var28Lifetime1 = 2;
                          var25 = var25 + var41;
                        }
                      }
                      if (var27 - var23 > var42) {
                        var27 = var27 - var41;
                        var29Lifetime1 = 1;
                      } else {
                        if (-var27 + var23 > var42) {
                          var29Lifetime1 = 2;
                          var27 = var27 + var41;
                        }
                      }
                    }
                  }
                } else {
                  var32_int = param1.faceVertexA[var17Lifetime2];
                  var33_int = param1.faceVertexB[var17Lifetime2];
                  var34 = param1.faceVertexC[var17Lifetime2];
                  var35 = param1.field_t[var19_intLifetime2];
                  var36 = param1.field_i[var19_intLifetime2];
                  var37 = param1.field_H[var19_intLifetime2];
                  var38 = (float)param1.vertexX[var35];
                  var39_float = (float)param1.vertexY[var35];
                  var40 = (float)param1.vertexZ[var35];
                  var41 = -var38 + (float)param1.vertexX[var36];
                  var42 = (float)param1.vertexY[var36] - var39_float;
                  var43_float = (float)param1.vertexZ[var36] - var40;
                  var44_float = -var38 + (float)param1.vertexX[var37];
                  var45_float = -var39_float + (float)param1.vertexY[var37];
                  var46_float = (float)param1.vertexZ[var37] - var40;
                  var47_float = (float)param1.vertexX[var32_int] - var38;
                  var48_float = -var39_float + (float)param1.vertexY[var32_int];
                  var49_float = (float)param1.vertexZ[var32_int] - var40;
                  var50_float = -var38 + (float)param1.vertexX[var33_int];
                  var51_float = (float)param1.vertexY[var33_int] - var39_float;
                  var52 = (float)param1.vertexZ[var33_int] - var40;
                  var53 = (float)param1.vertexX[var34] - var38;
                  var54 = -var39_float + (float)param1.vertexY[var34];
                  var55 = (float)param1.vertexZ[var34] - var40;
                  var56 = var46_float * var42 - var45_float * var43_float;
                  var57 = var43_float * var44_float - var46_float * var41;
                  var58 = -(var44_float * var42) + var45_float * var41;
                  var59 = -(var46_float * var57) + var58 * var45_float;
                  var60 = var46_float * var56 - var44_float * var58;
                  var61 = -(var45_float * var56) + var57 * var44_float;
                  var62 = 1.0f / (var43_float * var61 + (var41 * var59 + var60 * var42));
                  var24 = (var59 * var50_float + var51_float * var60 + var61 * var52) * var62;
                  var26 = var62 * (var54 * var60 + var59 * var53 + var55 * var61);
                  var22 = var62 * (var59 * var47_float + var60 * var48_float + var61 * var49_float);
                  var61Lifetime1 = -(var42 * var56) + var57 * var41;
                  var60Lifetime1 = -(var41 * var58) + var56 * var43_float;
                  var59Lifetime1 = var58 * var42 - var57 * var43_float;
                  var62Lifetime1 = 1.0f / (var60Lifetime1 * var45_float + var59Lifetime1 * var44_float + var46_float * var61Lifetime1);
                  var25 = (var60Lifetime1 * var51_float + var50_float * var59Lifetime1 + var52 * var61Lifetime1) * var62Lifetime1;
                  var23 = (var59Lifetime1 * var47_float + var60Lifetime1 * var48_float + var61Lifetime1 * var49_float) * var62Lifetime1;
                  var27 = (var55 * var61Lifetime1 + (var60Lifetime1 * var54 + var59Lifetime1 * var53)) * var62Lifetime1;
                }
              } else {
                var24 = 1.0f;
                var23 = 1.0f;
                var27 = 0.0f;
                var25 = 1.0f;
                var28Lifetime1 = 1;
                var26 = 0.0f;
                var29Lifetime1 = 2;
                var22 = 0.0f;
              }
            }
            if (null == param1.field_E) {
              var31Lifetime1 = 0;
            } else {
              var31Lifetime1 = param1.field_E[var17Lifetime2];
            }
            if (var31Lifetime1 != 0) {
              if (var31Lifetime1 == 1) {
                var32 = var15[var17Lifetime2];
                stackIn_168_0 = (long)(var18Lifetime2 << 8) + ((long)(var30Lifetime1 << 24) + (long)var20Lifetime1) << 32;
                stackIn_168_1 = (256 + var32.z << 22) + (256 + var32.y << 12);
                if (var32.x > 0) {
                  stackIn_169_2 = 1024;
                } else {
                  stackIn_169_2 = 2048;
                }
                var33 = stackIn_168_0 + (long)(stackIn_168_1 + stackIn_169_2 + (var19_intLifetime2 << 2));
                this.field_E[var16Lifetime3] = this.getOrCreateRenderVertex((byte) 123, var32.x, var32.y, 0, var23, var32.z, var33, (int) param1.faceVertexA[var17Lifetime2], param1, var22);
                this.field_b[var16Lifetime3] = this.getOrCreateRenderVertex((byte) 123, var32.x, var32.y, 0, var25, var32.z, var33 + (long)var28Lifetime1, (int) param1.faceVertexB[var17Lifetime2], param1, var24);
                this.field_n[var16Lifetime3] = this.getOrCreateRenderVertex((byte) 112, var32.x, var32.y, 0, var27, var32.z, var33 + (long)var29Lifetime1, (int) param1.faceVertexC[var17Lifetime2], param1, var26);
              }
            } else {
              var32_long = (long)(var19_intLifetime2 << 2) + ((long)(var18Lifetime2 << 8) + (long)(var30Lifetime1 << 24) + (long)var20Lifetime1 << 32);
              var34Lifetime1 = param1.faceVertexA[var17Lifetime2];
              var35Lifetime1 = param1.faceVertexB[var17Lifetime2];
              var36Lifetime1 = param1.faceVertexC[var17Lifetime2];
              var77 = var11[var34Lifetime1];
              this.field_E[var16Lifetime3] = this.getOrCreateRenderVertex((byte) 111, var77.x, var77.y, var77.contributionCount, var23, var77.z, var32_long, var34Lifetime1, param1, var22);
              var78 = var11[var35Lifetime1];
              this.field_b[var16Lifetime3] = this.getOrCreateRenderVertex((byte) 112, var78.x, var78.y, var78.contributionCount, var25, var78.z, (long)var28Lifetime1 + var32_long, var35Lifetime1, param1, var24);
              var79 = var11[var36Lifetime1];
              this.field_n[var16Lifetime3] = this.getOrCreateRenderVertex((byte) 124, var79.x, var79.y, var79.contributionCount, var27, var79.z, var32_long + (long)var29Lifetime1, var36Lifetime1, param1, var26);
            }
            if (param1.field_r != null) {
              this.field_q[var16Lifetime3] = param1.field_r[var17Lifetime2];
            }
            if (null != param1.field_w) {
              this.field_G[var16Lifetime3] = param1.field_w[var17Lifetime2];
            }
            this.field_l[var16Lifetime3] = param1.field_b[var17Lifetime2];
            this.field_g[var16Lifetime3] = (short)var21Lifetime1;
          }
          var16Lifetime4 = 0;
          var17Lifetime3 = -10000;
          for (var18Lifetime3 = 0; this.field_d > var18Lifetime3; var18Lifetime3++) {
            var19_intLifetime3 = this.field_g[var18Lifetime3];
            if (~var17Lifetime3 != ~var19_intLifetime3) {
              var16Lifetime4++;
              var17Lifetime3 = var19_intLifetime3;
            }
          }
          this.field_F = new int[1 + var16Lifetime4];
          var17Lifetime4 = -10000;
          var16Lifetime5 = 0;
          for (var18Lifetime4 = 0; var18Lifetime4 < this.field_d; var18Lifetime4++) {
            var19_intLifetime4 = this.field_g[var18Lifetime4];
            if (var17Lifetime4 != var19_intLifetime4) {
              incrementValue$7 = var16Lifetime5;
              var16Lifetime5++;
              this.field_F[incrementValue$7] = var18Lifetime4;
              var17Lifetime4 = var19_intLifetime4;
            }
          }
          this.field_F[var16Lifetime5] = this.field_d;
          WidgetNode.field_m = null;
          this.field_I = GetBombletSprayProjectileDamage.a(this.field_I, 125, this.field_x);
          this.field_h = GetBombletSprayProjectileDamage.a(this.field_h, 99, this.field_x);
          this.field_A = GetBombletSprayProjectileDamage.a(this.field_A, 73, this.field_x);
          this.field_z = PolarDisplacementTextureOperation.a(this.field_z, this.field_x, 5666);
          this.field_J = MusicPatchPcmStream.copyFloatArray(this.field_x, 0, this.field_J);
          this.field_k = MusicPatchPcmStream.copyFloatArray(this.field_x, 0, this.field_k);
          if (param1.vertexLabels != null &&
            ReportAbuseDialog.needsVertexGroups(param2, (byte) 121, this.field_u)) {
            param1.groupVertexIndices((byte) -37, false);
          }
          if (param1.faceAttachments != null &&
            FighterBayWeaponDefinition.needsFaceAttachmentGroups(-54, param2, this.field_u)) {
            param1.groupFaceAttachmentIndices(-96);
          }
          if (null != param1.faceLabels &&
            ArchiveLoadRequest.needsFaceGroups(384, this.field_u, param2)) {
            var18Lifetime5 = 0;
            var84 = new int[256];
            var80 = var84;
            var19 = var80;
            for (var20Lifetime2 = 0; var20Lifetime2 < this.field_B; var20Lifetime2++) {
              var21Lifetime2 = param1.faceLabels[var81[var20Lifetime2]];
              if (0 <= var21Lifetime2) {
                if (var21Lifetime2 > var18Lifetime5) {
                  var18Lifetime5 = var21Lifetime2;
                }
                var19[var21Lifetime2] = var19[var21Lifetime2] + 1;
              }
            }
            this.field_K = new int[var18Lifetime5 + 1][];
            for (var20Lifetime2 = 0; var20Lifetime2 <= var18Lifetime5; var20Lifetime2++) {
              array$6 = new int[var84[var20Lifetime2]];
              this.field_K[var20Lifetime2] = array$6;
              var84[var20Lifetime2] = 0;
            }
            for (var20Lifetime2 = 0; this.field_B > var20Lifetime2; var20Lifetime2++) {
              var21Lifetime2Lifetime1 = param1.faceLabels[var81[var20Lifetime2]];
              if (0 <= var21Lifetime2Lifetime1) {
                dupTemp$4 = var19[var21Lifetime2Lifetime1];
                arrayValue$5 = this.field_K[var21Lifetime2Lifetime1];
                var19[var21Lifetime2Lifetime1] = dupTemp$4 + 1;
                arrayValue$5[dupTemp$4] = var20Lifetime2;
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_211_0 = var7;
          stackIn_211_1 = new StringBuilder().append("ne.<init>(");
          if (param0 == null) {
            stackIn_212_2 = "null";
          } else {
            stackIn_212_2 = "{...}";
          }
          stackIn_214_1 = ((StringBuilder) (Object) stackIn_211_1).append(stackIn_212_2).append(',');
          if (param1 == null) {
            stackIn_215_2 = "null";
          } else {
            stackIn_215_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_211_0), ((StringBuilder) (Object) stackIn_214_1).append(stackIn_215_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_m = "Small thruster";
        field_v = true;
    }
}
