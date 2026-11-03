/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialWidget extends ButtonWidget {
    static int field_W;
    static String mpAcceptrematch;
    int centerOffsetY;
    int selectedStep;
    int field_V;
    int centerOffsetX;
    int radius;
    static String loginm2;
    static int field_X;
    int stepCount;
    static int field_S;
    static String raMutethisplayer;
    static int field_R;

    public static void releaseStatics(byte param0) {
        raMutethisplayer = null;
        mpAcceptrematch = null;
        loginm2 = null;
        int var1 = -61 % ((param0 - 69) / 52);
    }

    final static void a(int param0, boolean param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Pool.field_O;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var6Lifetime3;
        int var7Lifetime7;
        int var7Lifetime8;
        int var7Lifetime9;
        int var7Lifetime10;
        int var7Lifetime11;
        int var7Lifetime3Lifetime1;
        if (!(LobbyPlayer.field_fc >= 0)) {
          return;
        }
        if (param1) {
          return;
        }
        int var3 = param2 - 135;
        int var4 = param0 - 35;
        int var5 = 256;
        if (LobbyPlayer.field_fc < 75) {
          var5 = (LobbyPlayer.field_fc << 8) / 75;
        }
        if (!(LobbyPlayer.field_fc <= 200)) {
          var5 = (-LobbyPlayer.field_fc + 250 << 8) / 50;
        }
        CueAim.a(63, un.field_c);
        TriangleRasterizer.useRasterClip();
        SoftwareRasterizer.clear();
        TextHotspotRegion.a(-21818);
        if (var5 < 256) {
          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, -var5 + 256);
        }
        TriangleMesh.a(112);
        if (LobbyPlayer.field_fc < 150) {
          un.field_c.drawHalfSize(var3, var4);
          var6 = -125 + LobbyPlayer.field_fc;
          if (var6 <= 0) {
            var6 = LobbyPlayer.field_fc - 140;
            if (0 < var6) {
              var7 = 256;
              if (var6 < 20) {
                var7 = 256 * var6 / 20;
              }
              ArchiveLoadStep.field_k.a(var3 + 15, var4 + 10, var7 * var5 >> 8);
              return;
            }
            return;
          }
          if (var6 >= 50) {
            var6 = LobbyPlayer.field_fc - 140;
            if (0 < var6) {
              var7Lifetime7 = 256;
              if (var6 < 20) {
                var7Lifetime7 = 256 * var6 / 20;
              }
              ArchiveLoadStep.field_k.a(var3 + 15, var4 + 10, var7Lifetime7 * var5 >> 8);
              return;
            }
            return;
          }
          if (20 > var6) {
            var7Lifetime8 = var6 * 256 / 20;
            DebugTuningSlider.field_h.drawAdditive(var3, var4, var7Lifetime8);
            var6 = LobbyPlayer.field_fc - 140;
            if (0 < var6) {
              var7Lifetime8 = 256;
              if (var6 < 20) {
                var7Lifetime8 = 256 * var6 / 20;
              }
              ArchiveLoadStep.field_k.a(var3 + 15, var4 + 10, var7Lifetime8 * var5 >> 8);
              return;
            }
            return;
          }
          if (var6 < 30) {
            DebugTuningSlider.field_h.drawAdditive(var3, var4, 256);
            var6 = LobbyPlayer.field_fc - 140;
            if (0 < var6) {
              var7Lifetime9 = 256;
              if (var6 < 20) {
                var7Lifetime9 = 256 * var6 / 20;
              }
              ArchiveLoadStep.field_k.a(var3 + 15, var4 + 10, var7Lifetime9 * var5 >> 8);
              return;
            }
            return;
          }
          var7Lifetime10 = (-var6 + 50) * 256 / 20;
          DebugTuningSlider.field_h.drawAdditive(var3, var4, var7Lifetime10);
          var6Lifetime3 = LobbyPlayer.field_fc - 140;
          if (0 < var6Lifetime3) {
            var7Lifetime11 = 256;
            if (var6Lifetime3 < 20) {
              var7Lifetime11 = 256 * var6Lifetime3 / 20;
            }
            ArchiveLoadStep.field_k.a(var3 + 15, var4 + 10, var7Lifetime11 * var5 >> 8);
            return;
          }
          return;
        }
        qf.field_k.a(var3 + 15, 10 + var4, var5);
        var6Lifetime1 = -125 + LobbyPlayer.field_fc;
        if (var6Lifetime1 <= 0) {
          var6Lifetime1 = LobbyPlayer.field_fc - 140;
          if (0 < var6Lifetime1) {
            var7Lifetime1 = 256;
            if (var6Lifetime1 < 20) {
              var7Lifetime1 = 256 * var6Lifetime1 / 20;
            }
            ArchiveLoadStep.field_k.a(var3 + 15, var4 + 10, var7Lifetime1 * var5 >> 8);
            return;
          }
          return;
        }
        if (var6Lifetime1 >= 50) {
          var6Lifetime1 = LobbyPlayer.field_fc - 140;
          if (0 < var6Lifetime1) {
            var7Lifetime2 = 256;
            if (var6Lifetime1 < 20) {
              var7Lifetime2 = 256 * var6Lifetime1 / 20;
            }
            ArchiveLoadStep.field_k.a(var3 + 15, var4 + 10, var7Lifetime2 * var5 >> 8);
            return;
          }
          return;
        }
        if (20 > var6Lifetime1) {
          var7Lifetime3 = var6Lifetime1 * 256 / 20;
          DebugTuningSlider.field_h.drawAdditive(var3, var4, var7Lifetime3);
          var6Lifetime1 = LobbyPlayer.field_fc - 140;
          if (0 < var6Lifetime1) {
            var7Lifetime3Lifetime1 = 256;
            if (var6Lifetime1 < 20) {
              var7Lifetime3Lifetime1 = 256 * var6Lifetime1 / 20;
            }
            ArchiveLoadStep.field_k.a(var3 + 15, var4 + 10, var7Lifetime3Lifetime1 * var5 >> 8);
            return;
          }
          return;
        }
        if (var6Lifetime1 < 30) {
          DebugTuningSlider.field_h.drawAdditive(var3, var4, 256);
          var6Lifetime1 = LobbyPlayer.field_fc - 140;
          if (0 >= var6Lifetime1) {
            return;
          }
          var7Lifetime4 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime4 = 256 * var6Lifetime1 / 20;
          }
          ArchiveLoadStep.field_k.a(var3 + 15, var4 + 10, var7Lifetime4 * var5 >> 8);
          return;
        }
        var7Lifetime5 = (-var6Lifetime1 + 50) * 256 / 20;
        DebugTuningSlider.field_h.drawAdditive(var3, var4, var7Lifetime5);
        var6Lifetime2 = LobbyPlayer.field_fc - 140;
        if (0 >= var6Lifetime2) {
          return;
        }
        var7Lifetime6 = 256;
        if (var6Lifetime2 < 20) {
          var7Lifetime6 = 256 * var6Lifetime2 / 20;
        }
        ArchiveLoadStep.field_k.a(var3 + 15, var4 + 10, var7Lifetime6 * var5 >> 8);
    }

    final static void a(LobbyPlayer param0, int param1) {
        LobbyPlayer var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Pool.field_O;
        try {
          param0.unlink((byte) -117);
          if (param1 >= -89) {
            return;
          }
          var2 = (LobbyPlayer) (IntrusiveNode.field_i.c((byte) 124));
          while (var2 != null) {
            if (var2.comesBeforePlayer(param0, (byte) -97)) {
              var2 = (LobbyPlayer) (IntrusiveNode.field_i.f((byte) -5));
              continue;
            }
            break;
          }
          if (var2 == null) {
            IntrusiveNode.field_i.b((byte) -11, param0);
          } else {
            TextLineLayout.insertAfter(param0, (byte) -119, var2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("er.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, String param1, int param2, int param3, BitmapFont param4, boolean param5, int param6) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          var7_int = param4.b(param1) + 6;
          var8 = param4.maxDescent + param4.maxAscent + 6;
          var9 = param2 - var7_int / 2;
          if (var9 >= 0) {
            if (var9 + var7_int > 640) {
              param2 = param2 - (-640 + (var7_int + var9));
              var9 = -var7_int + 640;
            }
          } else {
            param2 = param2 - var9;
            var9 = 0;
          }
          if (!param5) {
            field_X = 49;
          }
          var10 = -3 + (-param4.maxAscent + param0);
          if (var10 < 0) {
            param0 = param0 - var10;
            var10 = 0;
          } else {
            if (480 < var10 + var8) {
              param0 = param0 - (var10 + (var8 - 480));
              var10 = 480 - var8;
            }
          }
          SoftwareRasterizer.a(var9, var10, var7_int, var8, 3, 0, 128);
          param4.drawCentered(param1, param2, param0, param6, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("er.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private DialWidget() throws Throwable {
        throw new Error();
    }

    final boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Pool.field_O;
        try {
          if (!super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.centerOffsetX + (-this.widgetX - param1 + param6);
          var9 = -this.centerOffsetY - this.widgetY - param5 + param4;
          if (this.radius * this.radius > var8_int * var8_int + var9 * var9) {
            var10 = Math.atan2((double)var9, (double)var8_int) - pp.field_d;
            if (0.0 > var10) {
              var10 = var10 - 3.141592653589793 / (double)this.stepCount;
            } else {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.stepCount;
              }
            }
            this.selectedStep = (int)((double)this.stepCount * var10 / 6.283185307179586);
            while (this.stepCount <= this.selectedStep) {
              this.selectedStep = this.selectedStep - this.stepCount;
            }
            while (this.selectedStep < 0) {
              this.selectedStep = this.selectedStep + this.stepCount;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_17_0 = var8;
          stackIn_17_1 = new StringBuilder().append("er.AA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        mpAcceptrematch = "Accept rematch";
        loginm2 = "Error connecting to server. Please try using a different server.";
        raMutethisplayer = "Mute this player for 48 hours";
    }
}
