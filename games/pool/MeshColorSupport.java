/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshColorSupport {
    static UiComponent field_c;
    static int field_b;
    static double field_d;
    static int field_a;

    public static void releaseStatics(byte param0) {
        field_c = null;
        int var1 = -30 / ((29 - param0) / 47);
    }

    final static void recenterMeshAtMarkerEdge(MeshBuilder mesh, short markerColor, boolean obfuscationGuard, int[] translation, int[] edgeDirection) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        var21 = Pool.field_O;
        try {
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var5_int = 0;
          while (mesh.faceCount > var5_int) {
            if (markerColor != mesh.faceColors[var5_int]) {
              var5_int++;
              continue;
            }
            if (null != mesh.field_Q) {
              mesh.field_Q[var5_int] = (byte)2;
            } else {
              if (null != mesh.field_f) {
                mesh.field_f[var5_int] = (byte)-1;
              } else {
                mesh.field_Q = new byte[mesh.faceCount];
                mesh.field_Q[var5_int] = (byte)2;
              }
            }
            var9 = mesh.vertexX[mesh.faceVertexA[var5_int]];
            var10 = mesh.vertexY[mesh.faceVertexA[var5_int]];
            var11 = mesh.vertexZ[mesh.faceVertexA[var5_int]];
            var12 = mesh.vertexX[mesh.faceVertexB[var5_int]];
            var13 = mesh.vertexY[mesh.faceVertexB[var5_int]];
            var14 = mesh.vertexZ[mesh.faceVertexB[var5_int]];
            var15 = mesh.vertexX[mesh.faceVertexC[var5_int]];
            var16 = mesh.vertexY[mesh.faceVertexC[var5_int]];
            var17 = mesh.vertexZ[mesh.faceVertexC[var5_int]];
            var6 = var9 - var12;
            var8 = -var14 + var11;
            var7 = -var13 + var10;
            var18 = var6 * var6 + (var7 * var7 + var8 * var8);
            var6 = var9 - var15;
            var8 = var11 - var17;
            var7 = -var16 + var10;
            var19 = var6 * var6 + (var7 * var7 + var8 * var8);
            var6 = var12 - var15;
            var8 = var14 - var17;
            var7 = var13 - var16;
            var20 = var7 * var7 + var6 * var6 + var8 * var8;
            if (var19 < var18 &&
              var20 < var18) {
              var8 = var11 + var14 >> 1;
              if (edgeDirection != null) {
                edgeDirection[0] = -var9 + var12;
                edgeDirection[1] = -var10 + var13;
                edgeDirection[2] = var14 - var11;
              }
              var7 = var13 + var10 >> 1;
              var6 = var9 + var12 >> 1;
            } else {
              if (var19 <= var20) {
                var7 = var13 + var16 >> 1;
                var8 = var14 + var17 >> 1;
                var6 = var12 + var15 >> 1;
                if (edgeDirection != null) {
                  edgeDirection[2] = -var14 + var17;
                  edgeDirection[0] = -var12 + var15;
                  edgeDirection[1] = -var13 + var16;
                }
              } else {
                var6 = var15 + var9 >> 1;
                if (edgeDirection != null) {
                  edgeDirection[2] = -var11 + var17;
                  edgeDirection[1] = var16 - var10;
                  edgeDirection[0] = var15 - var9;
                }
                var7 = var16 + var10 >> 1;
                var8 = var17 + var11 >> 1;
              }
            }
            break;
          }
          if (!obfuscationGuard) {
            MeshColorSupport.isExtraAchievementEnabled(false);
          }
          if (var6 == 0 &&
            var7 == 0 &&
            var8 == 0) {
            return;
          }
          translation[0] = translation[0] + var6;
          translation[1] = translation[1] + var7;
          translation[2] = translation[2] + var8;
          TutorialFactory.translateMeshOrigin(var6, 85, var8, mesh, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_34_0 = var5;
          stackIn_34_1 = new StringBuilder().append("pp.D(");
          if (mesh == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(markerColor).append(',').append(obfuscationGuard).append(',');
          if (translation == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (edgeDirection == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final static boolean isExtraAchievementEnabled(boolean obfuscationGuard) {
        boolean stackIn_6_0 = false;
        if (!obfuscationGuard) {
          return true;
        }
        stackIn_6_0 = (ButtonWidget.isBitSet(ClientException.field_g, -13671, 26)) || (IntrusiveDeque.hasClientOption(0, (byte) -127));
        return stackIn_6_0;
    }

    final static void drawPointerTooltip(String text, int obfuscationGuard) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var2_int = ReflectionReplySupport.field_i;
        int var3 = DebouncedValidationProvider.field_f;
        if (obfuscationGuard != 1259627265) {
          return;
        }
        try {
          var4 = AlignedIconLabel.field_Lb.font.countWrappedLines(text, 500);
          var5 = 6 + AlignedIconLabel.field_Lb.font.maxWrappedLineWidth(text, 500);
          var6 = 2 + var4 * ArchiveIndex.field_x;
          var7 = DebugTuningSupport.adjustWidthForRightEdge(var5, 12, var2_int, 0);
          var8 = OpacityWidget.placePopupVertically(var6, var3, -1, 20);
          SoftwareRasterizer.drawRectangle(var7, var8, var5, var6, 0);
          SoftwareRasterizer.fillRectangle(1 + var7, 1 + var8, var5 - 2, -2 + var6, 16777088);
          AlignedIconLabel.field_Lb.font.drawParagraph(text, 3 + var7, QuickChatPhraseRegistry.field_b + (var8 + 1 - AlignedIconLabel.field_Lb.font.maxAscent), 500, 1000, 0, -1, 0, 0, ArchiveIndex.field_x);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pp.C(" + (text != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    static {
        field_d = Math.atan2(1.0, 0.0);
    }
}
