/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LoginPayload {
    static int field_a;
    static int field_f;
    static boolean field_b;
    static String field_d;
    static boolean field_c;
    static String[] field_e;

    public static void releaseStatics(int param0) {
        if (param0 != -17053) {
          return;
        }
        field_d = null;
        field_e = null;
    }

    final static String readCookie(int param0, String param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          String stackIn_8_0 = null;
          Object stackIn_12_0 = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              var3 = (String) (JavaScriptBridge.callWindowFunction((byte) 126, "getcookies", param2));
              var4 = AppletUrlSupport.splitString(param0 ^ -9075, var3, ';');
              if (param0 != -21721) {
                LoginPayload.releaseStatics(38);
              }
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  stackIn_8_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_8_0;
                }
              }
              return null;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
              stackIn_12_0 = null;
              return (String) (stackIn_12_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var3_ref2;
            stackIn_15_1 = new StringBuilder().append("re.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1) {
        if (null != PasswordInputPainter.field_C) {
          PasswordInputPainter.field_C.drawRoot((byte) -79, param1);
        }
        if (param0 >= -81) {
          String var3 = (String) null;
          LoginPayload.a(false, (String) null, -73);
        }
    }

    final static void a(byte param0) {
        int stackIn_16_0;
        int stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_16_4;
        int stackIn_17_5;
        int stackIn_23_0;
        int stackIn_23_1;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_24_5;
        int stackIn_30_0;
        int stackIn_30_1;
        int stackIn_30_2;
        int stackIn_30_3;
        int stackIn_30_4;
        int stackIn_31_5;
        int stackIn_37_0;
        int stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        int stackIn_37_4;
        int stackIn_38_5;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        AnimatedNotification var5 = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        try {
          if (param0 != 121) {
            var4 = (String) null;
            LoginPayload.a(true, (String) null, 27);
          }
          if (!MarkerSliderPainter.field_i.isEmpty(0) &&
            ByteRecordSubmission.field_m >= 0) {
            var5 = (AnimatedNotification) (MarkerSliderPainter.field_i.last((byte) 108));
            if (var5.field_E == 0) {
              if (var5.field_w != 256) {
                var5.field_K.drawShadedGrayscale(-(var5.field_K.field_z / 2) + var5.field_J, var5.field_C - var5.field_K.field_A / 2, var5.field_w);
              } else {
                var5.field_K.draw(var5.field_J - var5.field_K.field_z / 2, -(var5.field_K.field_A / 2) + var5.field_C);
              }
            } else {
              var2 = var5.field_E * var5.field_K.field_z >> 12;
              var3 = var5.field_E * var5.field_K.field_A >> 12;
              var5.field_K.drawScaledAlpha(var5.field_J - (var2 >> 1), -(var3 >> 1) + var5.field_C, var2, var3, var5.field_w);
            }
            if (LinkButtonPainter.field_i == 0L) {
              return;
            }
            for (var2Lifetime1 = 0; 10 > var2Lifetime1; var2Lifetime1++) {
              if (var2Lifetime1 < ContentTransitionDialog.field_pb.length) {
                stackIn_16_0 = 160 + 32 * var2Lifetime1;
                stackIn_16_1 = 60;
                stackIn_16_2 = 30;
                stackIn_16_3 = 9;
                stackIn_16_4 = 4;
                if (0L != ((long)(1 << var2Lifetime1) & LinkButtonPainter.field_i)) {
                  stackIn_17_5 = 3407667;
                } else {
                  stackIn_17_5 = 3355443;
                }
                SoftwareRasterizer.fillRoundedRectangleBlended(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4, stackIn_17_5, var5.field_w / 2 + 128);
                continue;
              }
              break;
            }
            for (var2Lifetime2 = 10; var2Lifetime2 < 20; var2Lifetime2++) {
              if (var2Lifetime2 < ContentTransitionDialog.field_pb.length) {
                stackIn_23_0 = -320 + 32 * var2Lifetime2 + 160;
                stackIn_23_1 = 70;
                stackIn_23_2 = 30;
                stackIn_23_3 = 9;
                stackIn_23_4 = 4;
                if ((LinkButtonPainter.field_i & (long)(1 << var2Lifetime2)) == 0L) {
                  stackIn_24_5 = 3355443;
                } else {
                  stackIn_24_5 = 3407667;
                }
                SoftwareRasterizer.fillRoundedRectangleBlended(stackIn_23_0, stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4, stackIn_24_5, var5.field_w / 2 + 128);
                continue;
              }
              break;
            }
            for (var2Lifetime3 = 20; var2Lifetime3 < 30; var2Lifetime3++) {
              if (var2Lifetime3 < ContentTransitionDialog.field_pb.length) {
                stackIn_30_0 = 32 * var2Lifetime3 - 640 + 160;
                stackIn_30_1 = 80;
                stackIn_30_2 = 30;
                stackIn_30_3 = 9;
                stackIn_30_4 = 4;
                if (((long)(1 << var2Lifetime3) & LinkButtonPainter.field_i) != 0L) {
                  stackIn_31_5 = 3407667;
                } else {
                  stackIn_31_5 = 3355443;
                }
                SoftwareRasterizer.fillRoundedRectangleBlended(stackIn_30_0, stackIn_30_1, stackIn_30_2, stackIn_30_3, stackIn_30_4, stackIn_31_5, var5.field_w / 2 + 128);
                continue;
              }
              break;
            }
            for (var2Lifetime4 = 30; var2Lifetime4 < 40; var2Lifetime4++) {
              if (ContentTransitionDialog.field_pb.length <= var2Lifetime4) {
                break;
              }
              stackIn_37_0 = (-30 + var2Lifetime4) * 32 + 160;
              stackIn_37_1 = 90;
              stackIn_37_2 = 30;
              stackIn_37_3 = 9;
              stackIn_37_4 = 4;
              if ((LinkButtonPainter.field_i & (long)(1 << var2Lifetime4)) == 0L) {
                stackIn_38_5 = 3355443;
              } else {
                stackIn_38_5 = 3407667;
              }
              SoftwareRasterizer.fillRoundedRectangleBlended(stackIn_37_0, stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_37_4, stackIn_38_5, var5.field_w / 2 + 128);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "re.E(" + param0 + ')');
        }
    }

    abstract LoginPayloadKind payloadKind(byte param0);

    abstract void writePayload(byte param0, PacketBuffer param1);

    final static void a(boolean param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param0) {
            return;
          }
          DualLinkDeque.field_c = false;
          NetworkGameClient.field_z = false;
          if (null != MeshBoundsSupport.field_d &&
            MeshBoundsSupport.field_d.dialogOpen) {
            if (8 == param2) {
              if (ProjectedVertex.field_e) {
                param1 = ThreeSliceButtonPainter.invalidpass;
              } else {
                param1 = HighScoreRequest.invaliduserorpass;
              }
              param2 = 2;
              TextLineLayout.field_j.prefillUsername(8, SpriteState.field_x);
            }
            var3_int = 1;
            if (param2 == 10) {
              GradientPaletteSupport.a(-984040272);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (DualLinkDeque.field_c) {
                param1 = AccountWelcomePanel.substituteTemplateArguments(new String[]{param1}, -1, DialogLayer.connectionlostWithreason);
              }
              if (PolarBallSkin.field_q) {
                param1 = BufferedFile.pleasetryagain;
              }
              MeshBoundsSupport.field_d.installErrorContent(param1, param2, -257);
            }
            if (param2 != 256 &&
              param2 != 10) {
              if (ProjectedVertex.field_e) {
                return;
              }
              TextLineLayout.field_j.clearInputs((byte) -108);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("re.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = 576;
        field_b = false;
        field_c = false;
    }
}
