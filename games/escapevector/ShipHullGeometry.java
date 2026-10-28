/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShipHullGeometry {
    static DiskCacheWorker field_b;
    IntPoint leftWing;
    static String field_a;
    static PcmSample field_j;
    IntPoint cameraOrigin;
    IntPoint nose;
    IntPoint rightWing;
    IntPoint centerNotch;
    IntPoint boundsMax;
    IntPoint boundsMin;
    static boolean field_h;

    final static void refreshAccountUi(int guard) {
        if (Checkbox.field_F != null) {
          Checkbox.field_F.refreshPanelVisibility(0);
        }
        if (ProxySocketConnector.field_r != null) {
          ProxySocketConnector.field_r.setStopAnimatingWhenNormal(true);
        }
        if (guard != 0) {
          TriangleMesh var2 = (TriangleMesh) null;
          ShipHullGeometry.drawLitMesh(19, -90, 62, -122, 5, (TriangleMesh) null, -13, -75);
        }
        RasterRestoreSupport.resetTooltipState(false);
    }

    final static void sortIntPairs(int endOffset, int[] keys, int[] values) {
        try {
          ChatMessage.sortIntPairs(endOffset + keys.length, values, 1, 0, keys);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "uk.B(" + endOffset + ',' + (keys != null ? "{...}" : "null") + ',' + (values != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != -1) {
          field_j = (PcmSample) null;
        }
        field_j = null;
        field_a = null;
        field_b = null;
    }

    final static void drawLitMesh(int highlightY, int guard, int lightX, int highlightX, int highlightZ, TriangleMesh mesh, int lightZ, int lightY) {
        int stackIn_17_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        MeshMaterial stackIn_40_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        String stackIn_56_2 = null;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var40 = EscapeVector.obfuscationControl;
        try {
          if (guard != -16711760) {
            return;
          }
          TriangleMesh var44 = mesh;
          if (var44.facePriorities != null &&
            var44.facePriorityCount > 1) {
            byte[] var60 = var44.facePriorities;
            NetworkGameClient.scatterFacesByPriority(var60, 0, EditableTextWidget.facePriorityCursors, 114, 0);
          } else {
            SelfDestructEffects.flattenFaceDepthBuckets(46);
          }
          int[] var54 = new int[mesh.normalCount];
          int[] var49 = var54;
          int[] var41 = var49;
          int[] var8 = var41;
          int[] var64 = new int[mesh.normalCount];
          int[] var62 = DisplayNameForm.field_L;
          int[] var63 = IsaacRandom.field_f;
          int[] var61 = GameplaySession.field_xb;
          for (int var13 = 0; mesh.normalCount > var13; var13++) {
            int var14 = lightZ * var61[var13] + lightX * var62[var13] + lightY * var63[var13] >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_17_0 = 128;
            } else if (128 <= var14) {
              stackIn_17_0 = 256;
            } else {
              stackIn_17_0 = 128 + var14;
            }
            int var14Lifetime2 = stackIn_17_0;
            int var15 = highlightZ * var61[var13] + var62[var13] * highlightX + highlightY * var63[var13] >> 8;
            int[] stackIn_19_0 = MenuTitleRenderSupport.field_c;
            stackIn_20_1 = (var15 < 0) ? (-var15) : (var15);
            int var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = (256 - var15Lifetime2) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (int var13Lifetime1 = 0; var13Lifetime1 < AccountSessionSupport.field_d; var13Lifetime1++) {
            int var14Lifetime1 = SavedDataQuerySupport.bucketedFaceIndices[var13Lifetime1];
            int var15Lifetime1 = mesh.faceVertexA[var14Lifetime1];
            int var16 = mesh.faceVertexB[var14Lifetime1];
            int var17 = mesh.faceVertexC[var14Lifetime1];
            if (mesh.faceNormalA[var14Lifetime1] >= DisplayNameForm.field_L.length) {
              stackIn_26_0 = -1;
            } else {
              stackIn_26_0 = mesh.faceNormalA[var14Lifetime1];
            }
            int var18 = stackIn_26_0;
            if (mesh.faceNormalB[var14Lifetime1] >= DisplayNameForm.field_L.length) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = mesh.faceNormalB[var14Lifetime1];
            }
            int var19 = stackIn_29_0;
            if (mesh.faceNormalC[var14Lifetime1] < DisplayNameForm.field_L.length) {
              stackIn_32_0 = mesh.faceNormalC[var14Lifetime1];
            } else {
              stackIn_32_0 = -1;
            }
            int var20 = stackIn_32_0;
            if (DialogueScreen.meshMaterials != null &&
              mesh.field_m != null &&
              var14Lifetime1 < mesh.field_m.length &&
              mesh.field_m[var14Lifetime1] != -1 &&
              mesh.field_m[var14Lifetime1] < DialogueScreen.meshMaterials.length) {
              stackIn_40_0 = DialogueScreen.meshMaterials[mesh.field_m[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            MeshMaterial var21 = stackIn_40_0;
            int var22 = IntroAudioSupport.field_g[var15Lifetime1];
            int var23 = DraggableWidget.field_D[var15Lifetime1];
            int var24 = IntroAudioSupport.field_g[var16];
            int var25 = DraggableWidget.field_D[var16];
            int var26 = IntroAudioSupport.field_g[var17];
            int var27 = DraggableWidget.field_D[var17];
            if (var19 == var18 &&
              var20 == var19) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 == null) {
                stackIn_50_0 = 8355711;
              } else {
                stackIn_50_0 = var21.colorRgb;
              }
              var30 = stackIn_50_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = var32 * var28 >>> 8 & -805241088 | -2030108417 & var31 * var28 >>> 8;
              var33 = var33 + 65793 * var29;
              CanvasRenderSupport.fillTriangle(var26, var22, var27, var33 >> 1 & 8355711, true, var23, var24, var25);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 == null) {
                stackIn_46_0 = 8355711;
              } else {
                stackIn_46_0 = var21.colorRgb;
              }
              int var34 = stackIn_46_0;
              int var35 = var34 & 16711935;
              int var36 = var34 & 65280;
              int var37 = (var28 * var36 & 16711908) >>> 8 | var28 * var35 >>> 8 & 1090453759;
              int var38 = (16711930 & var29 * var36) >>> 8 | -1778450177 & var35 * var29 >>> 8;
              var37 = var37 + 65793 * var31;
              int var39 = (16711870 & var30 * var36) >>> 8 | (var35 * var30 & -16711760) >>> 8;
              var38 = var38 + 65793 * var32;
              var39 = var39 + 65793 * var33;
              SavedDataQuery.fillHalfBlendGouraudTriangle(var24, var23, var22, 255 & var39 >> 8, var38 >> 16, var27, var39 >> 16, var26, var25, -15733, 255 & var39, 255 & var37, var37 >> 16, var38 & 255, (var37 & 65293) >> 8, 255 & var38 >> 8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8_ref = decompiledCaughtException;
          RuntimeException stackIn_55_0 = var8_ref;
          StringBuilder stackIn_55_1 = new StringBuilder().append("uk.A(").append(highlightY).append(',').append(guard).append(',').append(lightX).append(',').append(highlightX).append(',').append(highlightZ).append(',');
          if (mesh == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(lightZ).append(',').append(lightY).append(')').toString());
        }
    }

    ShipHullGeometry() {
        this.cameraOrigin = new IntPoint(0, 0);
        this.leftWing = new IntPoint(0, 0);
        this.rightWing = new IntPoint(0, 0);
        this.centerNotch = new IntPoint(0, 0);
        this.nose = new IntPoint(0, 0);
        this.boundsMin = new IntPoint(0, 0);
        this.boundsMax = new IntPoint(0, 0);
    }

    static {
        field_a = "Score: ";
        field_h = false;
    }
}
