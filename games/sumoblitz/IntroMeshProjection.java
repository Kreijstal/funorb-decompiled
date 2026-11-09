/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroMeshProjection {
    static boolean tooltipHidden;
    static int field_a;
    static ToolkitSprite[] field_e;
    static boolean[] threeLifeCompletions;
    static ToolkitSprite[] field_c;
    private static int[] field_f;
    static String cancelText;

    final static void projectIntroMesh(int[] viewTransform, int[] modelTransform, boolean sortFlag, boolean retainViewCoordinates, CompactMeshGeometry mesh, boolean transformNormals, int guard) {
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_71_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_62_0Lifetime1;
        int stackIn_62_1Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var24Lifetime1Lifetime1;
        int var25Lifetime1Lifetime1;
        int var26Lifetime1Lifetime1;
        var30 = Sumoblitz.field_L ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = viewTransform[3] >> 2;
          var22 = viewTransform[4] >> 2;
          var23 = viewTransform[5] >> 2;
          var24 = viewTransform[6] >> 2;
          var25 = viewTransform[7] >> 2;
          var26 = viewTransform[8] >> 2;
          var27 = viewTransform[9] >> 2;
          var28 = viewTransform[10] >> 2;
          var29 = viewTransform[11] >> 2;
          var12 = modelTransform[3] * var21 - (-(modelTransform[4] * var22) - modelTransform[5] * var23) >> 14;
          var13 = modelTransform[4] * var25 + (modelTransform[3] * var24 + var26 * modelTransform[5]) >> 14;
          if (guard != -1622738130) {
            return;
          }
          var18 = var23 * modelTransform[11] + (modelTransform[10] * var22 + var21 * modelTransform[9]) >> 14;
          var19 = modelTransform[11] * var26 + modelTransform[9] * var24 + var25 * modelTransform[10] >> 14;
          var17 = var27 * modelTransform[6] - (-(var28 * modelTransform[7]) - modelTransform[8] * var29) >> 14;
          var14 = var29 * modelTransform[5] + (modelTransform[4] * var28 + modelTransform[3] * var27) >> 14;
          var16 = var24 * modelTransform[6] - (-(var25 * modelTransform[7]) - modelTransform[8] * var26) >> 14;
          var15 = modelTransform[6] * var21 - (-(var22 * modelTransform[7]) - var23 * modelTransform[8]) >> 14;
          var20 = var29 * modelTransform[11] + (var27 * modelTransform[9] + modelTransform[10] * var28) >> 14;
          var21Lifetime1 = modelTransform[0] - viewTransform[0];
          var22Lifetime1 = -viewTransform[1] + modelTransform[1];
          var23Lifetime1 = -viewTransform[2] + modelTransform[2];
          var9 = var21Lifetime1 * viewTransform[3] + (viewTransform[4] * var22Lifetime1 + viewTransform[5] * var23Lifetime1) >> 16 - IntrusiveDeque.field_b;
          var11 = viewTransform[11] * var23Lifetime1 + viewTransform[10] * var22Lifetime1 + var21Lifetime1 * viewTransform[9] >> 16;
          var10 = var21Lifetime1 * viewTransform[6] + var22Lifetime1 * viewTransform[7] + viewTransform[8] * var23Lifetime1 >> 16 - IntrusiveDeque.field_b;
          var21Lifetime2 = SoftwareRasterViewport.centerX;
          var22Lifetime2 = SoftwareRasterViewport.centerY;
          var23Lifetime2 = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var23Lifetime2 < mesh.field_D) {
              var24Lifetime1 = mesh.field_Q[var23Lifetime2];
              var25Lifetime1 = mesh.field_B[var23Lifetime2];
              var26Lifetime1 = mesh.field_r[var23Lifetime2];
              var27Lifetime1 = (var12 * var24Lifetime1 + var25Lifetime1 * var15 + var18 * var26Lifetime1 >> -IntrusiveDeque.field_b + 16) + var9;
              var28Lifetime1 = (var24Lifetime1 * var13 + var25Lifetime1 * var16 + var19 * var26Lifetime1 >> -IntrusiveDeque.field_b + 16) + var10;
              var29Lifetime1 = (var26Lifetime1 * var20 + var17 * var25Lifetime1 + var24Lifetime1 * var14 >> 16) + var11;
              stackIn_62_0 = var29Lifetime1;
              stackIn_62_1 = 50;
              if (var30 != 0) {
                if (stackIn_62_0 < stackIn_62_1) {
                  stackIn_71_0 = var18;
                  break scanLoop1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_62_0 >= stackIn_62_1) {
                  ScrollViewport.field_z[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  LegacyOpenGlCubeTexture.field_o[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  LegacyOpenGlRidgedWaterEffect.field_k[var23Lifetime2] = var29Lifetime1;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                } else {
                  LegacyOpenGlRidgedWaterEffect.field_k[var23Lifetime2] = -2147483648;
                }
                if (retainViewCoordinates) {
                  PowerupTrailParticle.field_v[var23Lifetime2] = var27Lifetime1 >> IntrusiveDeque.field_b;
                  LegacyOpenGlGraphicsHeap.field_q[var23Lifetime2] = var28Lifetime1 >> IntrusiveDeque.field_b;
                  field_f[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null != mesh.field_I &&
                null != mesh.field_m &&
                null != mesh.field_M &&
                null != mesh.field_F &&
                null != mesh.field_i &&
                mesh.field_J != null &&
                mesh.field_q != null &&
                null != mesh.field_p &&
                null != mesh.field_s) {
                var23Lifetime2 = 0;
                while (!(mesh.field_n <= var23Lifetime2)) {
                  var24Lifetime1Lifetime1 = mesh.field_I[var23Lifetime2];
                  var25Lifetime1Lifetime1 = mesh.field_m[var23Lifetime2];
                  var26Lifetime1Lifetime1 = mesh.field_M[var23Lifetime2];
                  SecondaryNodeHashTable.field_b[var23Lifetime2] = var9 + (var26Lifetime1Lifetime1 * var18 + var15 * var25Lifetime1Lifetime1 + var12 * var24Lifetime1Lifetime1 >> 16);
                  LegacyOpenGlReflectionEffect.field_h[var23Lifetime2] = (var26Lifetime1Lifetime1 * var19 + (var24Lifetime1Lifetime1 * var13 + var25Lifetime1Lifetime1 * var16) >> 16) + var10;
                  LegacyOpenGlEffect.field_d[var23Lifetime2] = var11 + (var25Lifetime1Lifetime1 * var17 + var24Lifetime1Lifetime1 * var14 + var26Lifetime1Lifetime1 * var20 >> 16);
                  var24Lifetime1Lifetime1 = mesh.field_F[var23Lifetime2];
                  var25Lifetime1Lifetime1 = mesh.field_i[var23Lifetime2];
                  var26Lifetime1Lifetime1 = mesh.field_J[var23Lifetime2];
                  TextureCoordinateGeneration.field_b[var23Lifetime2] = var9 + (var25Lifetime1Lifetime1 * var15 + (var12 * var24Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var18) >> 16);
                  FontMetrics.field_e[var23Lifetime2] = (var19 * var26Lifetime1Lifetime1 + (var16 * var25Lifetime1Lifetime1 + var13 * var24Lifetime1Lifetime1) >> 16) + var10;
                  SpriteMask.field_d[var23Lifetime2] = var11 + (var14 * var24Lifetime1Lifetime1 - (-(var17 * var25Lifetime1Lifetime1) - var26Lifetime1Lifetime1 * var20) >> 16);
                  var24Lifetime1Lifetime1 = mesh.field_q[var23Lifetime2];
                  var25Lifetime1Lifetime1 = mesh.field_p[var23Lifetime2];
                  var26Lifetime1Lifetime1 = mesh.field_s[var23Lifetime2];
                  OpenGlBuffer.field_h[var23Lifetime2] = var9 + (var18 * var26Lifetime1Lifetime1 + (var25Lifetime1Lifetime1 * var15 + var24Lifetime1Lifetime1 * var12) >> 16);
                  ContentTransitionPhase.field_e[var23Lifetime2] = var10 + (var24Lifetime1Lifetime1 * var13 + var16 * var25Lifetime1Lifetime1 + var19 * var26Lifetime1Lifetime1 >> 16);
                  PowerupPickup.field_k[var23Lifetime2] = var11 + (var17 * var25Lifetime1Lifetime1 + var14 * var24Lifetime1Lifetime1 + var20 * var26Lifetime1Lifetime1 >> 16);
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (transformNormals) {
                var9 = modelTransform[3];
                var10 = modelTransform[4];
                var11 = modelTransform[5];
                var12 = modelTransform[6];
                var13 = modelTransform[7];
                var14 = modelTransform[8];
                var15 = modelTransform[9];
                var16 = modelTransform[10];
                var17 = modelTransform[11];
                var18 = 0;
                while (true) {
                  stackIn_62_0Lifetime1 = ~mesh.field_c;
                  stackIn_62_1Lifetime1 = ~var18;
                  if (stackIn_62_0Lifetime1 >= stackIn_62_1Lifetime1) {
                    break;
                  }
                  stackIn_71_0 = var18;
                  if (var30 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_71_0 >= HiscoreRequest.field_t.length) {
                    break;
                  }
                  var19 = mesh.field_x[var18];
                  var20 = mesh.field_g[var18];
                  var21Lifetime2 = mesh.field_L[var18];
                  HiscoreRequest.field_t[var18] = var19 * var9 - (-(var12 * var20) - var15 * var21Lifetime2) >> 16;
                  DualLinkedRenderResource.field_r[var18] = var20 * var13 + var19 * var10 + var21Lifetime2 * var16 >> 16;
                  AccountConnectionPhase.field_d[var18] = var17 * var21Lifetime2 + (var11 * var19 + var20 * var14) >> 16;
                  var18++;
                }
              }
            }
            stackIn_71_0 = sortFlag ? 1 : 0;
            break;
          }
          LoginDialogState.a(stackIn_71_0 != 0, mesh, -1, var8, var7_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_76_0 = var7;
          stackIn_76_1 = new StringBuilder().append("up.A(");
          if (viewTransform == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (modelTransform == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(sortFlag).append(',').append(retainViewCoordinates).append(',');
          if (mesh == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',').append(transformNormals).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_c = null;
          field_e = null;
          field_f = null;
          threeLifeCompletions = null;
          if (param0 > -9) {
            IntroMeshProjection.projectIntroMesh((int[]) null, (int[]) null, true, true, (CompactMeshGeometry) null, false, 41);
          }
          cancelText = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "up.B(" + param0 + ')');
        }
    }

    static {
        tooltipHidden = false;
        field_f = new int[8192];
        threeLifeCompletions = new boolean[25];
        cancelText = "Cancel";
    }
}
