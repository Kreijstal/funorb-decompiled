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

    final static void a(MeshBuilder param0, short param1, boolean param2, int[] param3, int[] param4) {
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
          while (param0.faceCount > var5_int) {
            if (param1 != param0.faceColors[var5_int]) {
              var5_int++;
              continue;
            }
            if (null != param0.field_Q) {
              param0.field_Q[var5_int] = (byte)2;
            } else {
              if (null != param0.field_f) {
                param0.field_f[var5_int] = (byte)-1;
              } else {
                param0.field_Q = new byte[param0.faceCount];
                param0.field_Q[var5_int] = (byte)2;
              }
            }
            var9 = param0.vertexX[param0.faceVertexA[var5_int]];
            var10 = param0.vertexY[param0.faceVertexA[var5_int]];
            var11 = param0.vertexZ[param0.faceVertexA[var5_int]];
            var12 = param0.vertexX[param0.faceVertexB[var5_int]];
            var13 = param0.vertexY[param0.faceVertexB[var5_int]];
            var14 = param0.vertexZ[param0.faceVertexB[var5_int]];
            var15 = param0.vertexX[param0.faceVertexC[var5_int]];
            var16 = param0.vertexY[param0.faceVertexC[var5_int]];
            var17 = param0.vertexZ[param0.faceVertexC[var5_int]];
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
              if (param4 != null) {
                param4[0] = -var9 + var12;
                param4[1] = -var10 + var13;
                param4[2] = var14 - var11;
              }
              var7 = var13 + var10 >> 1;
              var6 = var9 + var12 >> 1;
            } else {
              if (var19 <= var20) {
                var7 = var13 + var16 >> 1;
                var8 = var14 + var17 >> 1;
                var6 = var12 + var15 >> 1;
                if (param4 != null) {
                  param4[2] = -var14 + var17;
                  param4[0] = -var12 + var15;
                  param4[1] = -var13 + var16;
                }
              } else {
                var6 = var15 + var9 >> 1;
                if (param4 != null) {
                  param4[2] = -var11 + var17;
                  param4[1] = var16 - var10;
                  param4[0] = var15 - var9;
                }
                var7 = var16 + var10 >> 1;
                var8 = var17 + var11 >> 1;
              }
            }
            break;
          }
          if (!param2) {
            MeshColorSupport.a(false);
          }
          if (var6 == 0 &&
            var7 == 0 &&
            var8 == 0) {
            return;
          }
          param3[0] = param3[0] + var6;
          param3[1] = param3[1] + var7;
          param3[2] = param3[2] + var8;
          TutorialFactory.translateMeshOrigin(var6, 85, var8, param0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_34_0 = var5;
          stackIn_34_1 = new StringBuilder().append("pp.D(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0) {
        boolean stackIn_6_0 = false;
        if (!param0) {
          return true;
        }
        stackIn_6_0 = (ButtonWidget.isBitSet(ClientException.field_g, -13671, 26)) || (IntrusiveDeque.hasClientOption(0, (byte) -127));
        return stackIn_6_0;
    }

    final static void a(String param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var2_int = ReflectionReplySupport.field_i;
        int var3 = DebouncedValidationProvider.field_f;
        if (param1 != 1259627265) {
          return;
        }
        try {
          var4 = AlignedIconLabel.field_Lb.font.countWrappedLines(param0, 500);
          var5 = 6 + AlignedIconLabel.field_Lb.font.maxWrappedLineWidth(param0, 500);
          var6 = 2 + var4 * ArchiveIndex.field_x;
          var7 = DebugTuningSupport.adjustWidthForRightEdge(var5, 12, var2_int, 0);
          var8 = OpacityWidget.placePopupVertically(var6, var3, -1, 20);
          SoftwareRasterizer.drawRectangle(var7, var8, var5, var6, 0);
          SoftwareRasterizer.fillRectangle(1 + var7, 1 + var8, var5 - 2, -2 + var6, 16777088);
          AlignedIconLabel.field_Lb.font.drawParagraph(param0, 3 + var7, QuickChatPhraseRegistry.field_b + (var8 + 1 - AlignedIconLabel.field_Lb.font.maxAscent), 500, 1000, 0, -1, 0, 0, ArchiveIndex.field_x);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pp.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = Math.atan2(1.0, 0.0);
    }
}
