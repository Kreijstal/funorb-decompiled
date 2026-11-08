/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Camera {
    static String loadingMusic;
    double eyeY;
    static UiComponent field_g;
    double targetX;
    double eyeX;
    static int field_i;
    static String muChatGame;
    static String ratingNoratings;
    double targetY;
    static String[] ratingModeName;
    static Sprite field_c;
    double eyeZ;
    static int field_b;
    static Sprite field_j;
    double targetZ;

    final void writeViewMatrix(int[] param0, boolean param1) {
        RuntimeException runtimeException = null;
        double var4 = 0.0;
        double[] var6 = null;
        double[] var8 = null;
        double[] var9 = null;
        double[] var16 = null;
        double[] var17 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0[0] = PotEvent.doubleToFixed3(4885, this.eyeX);
          param0[1] = PotEvent.doubleToFixed3(4885, this.eyeY);
          param0[2] = PotEvent.doubleToFixed3(4885, this.eyeZ);
          var8 = new double[]{-this.eyeX + this.targetX, this.targetY - this.eyeY, -this.eyeZ + this.targetZ};
          var4 = Math.atan2(Math.sqrt(var8[1] * var8[1] + var8[0] * var8[0]), var8[2]);
          if (!param1) {
            return;
          }
          LabeledChildWidget.a(-126, var8);
          var9 = new double[]{-this.targetX + this.eyeX, -this.targetY + this.eyeY, 0.0};
          var6 = var9;
          if (var4 < 0.04908738521234052) {
            var6[1] = 1.0;
            var6[0] = 0.0;
          } else {
            if (var4 < 0.7853981633974483) {
              var4 = (-Math.cos((var4 - 0.04908738521234052) * 3.141592653589793 / 0.7363107781851077) + 1.0) / 2.0;
              var6[0] = var4 * var9[0];
              var6[1] = 1.0 - var4 + var9[1] * var4;
            }
          }
          var16 = LabeledChildWidget.a(-128, LoginEncryptionSupport.crossProduct(2, var8, var9));
          var17 = LabeledChildWidget.a(-126, LoginEncryptionSupport.crossProduct(2, var16, var8));
          param0[3] = ClassicBallSkin.doubleToFixed16(16, var16[0]);
          param0[4] = ClassicBallSkin.doubleToFixed16(16, var16[1]);
          param0[5] = ClassicBallSkin.doubleToFixed16(16, var16[2]);
          param0[6] = ClassicBallSkin.doubleToFixed16(16, var17[0]);
          param0[7] = ClassicBallSkin.doubleToFixed16(16, var17[1]);
          param0[8] = ClassicBallSkin.doubleToFixed16(16, var17[2]);
          param0[9] = ClassicBallSkin.doubleToFixed16(16, var8[0]);
          param0[10] = ClassicBallSkin.doubleToFixed16(16, var8[1]);
          param0[11] = ClassicBallSkin.doubleToFixed16(16, var8[2]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("mm.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        loadingMusic = null;
        muChatGame = null;
        field_c = null;
        field_g = null;
        if (param0 != -13569) {
          field_b = -71;
        }
        ratingModeName = null;
        ratingNoratings = null;
    }

    final void setOrbitAngles(double param0, int param1, double param2) {
        this.setOrbit(param2, param0, this.getDistance(8), -6861);
        if (param1 != 1) {
          this.eyeX = -1.1479346614663757;
        }
    }

    final double getYaw(boolean param0) {
        if (!param0) {
          this.setOrbit(-0.5323192695781033, 0.018279809852695228, -0.753102219435801, -80);
        }
        if (0.0 != this.eyeY - this.targetY ||
          this.targetX != this.eyeX) {
          return Math.atan2(this.eyeY - this.targetY, this.eyeX - this.targetX);
        }
        return 1.5707963267948966;
    }

    final void c(byte param0) {
        LobbyGame.field_gc.clampCamera(false, this);
        if (param0 != -40) {
          Camera.releaseStatics(26);
        }
    }

    final int b(int param0) {
        if (param0 > -126) {
          Camera.releaseStatics(46);
        }
        double var2 = this.getPitch((byte) 103) - Math.atan(0.625);
        return (int)((-var2 + 1.5707963267948966) / (Math.atan(0.625) * 2.0) * 480.0);
    }

    private final void sanitizeNaN(byte param0) {
        if (Double.isNaN(this.eyeX)) {
          this.eyeX = 0.0;
        }
        if (Double.isNaN(this.eyeY)) {
          this.eyeY = 0.0;
        }
        if (param0 <= 81) {
          ratingModeName = (String[]) null;
        }
        if (Double.isNaN(this.eyeZ)) {
          this.eyeZ = 0.0;
        }
        if (Double.isNaN(this.targetX)) {
          this.targetX = 0.0;
        }
        if (Double.isNaN(this.targetY)) {
          this.targetY = 0.0;
        }
        if (Double.isNaN(this.targetZ)) {
          this.targetZ = 0.0;
        }
    }

    final double getDistance(int param0) {
        double var2 = this.eyeX - this.targetX;
        if (param0 != 8) {
          return 0.04953626904890074;
        }
        double var4 = this.eyeY - this.targetY;
        double var6 = -this.targetZ + this.eyeZ;
        return Math.sqrt(var6 * var6 + (var4 * var4 + var2 * var2));
    }

    final void a(int param0) {
        this.targetZ = -8.0;
        this.targetY = 144.0;
        int var2 = 114 % ((param0 + 5) / 47);
        this.targetX = 288.0;
    }

    final void focusOnCueBall(PoolMatchController param0, int param1) {
        try {
          this.targetX = (double)WidgetStyleLayer.b(126, param0.gameModel.balls[0].positionX);
          if (param1 != 1) {
            field_j = (Sprite) null;
          }
          this.targetY = (double)WidgetStyleLayer.b(param1 ^ 126, param0.gameModel.balls[0].positionY);
          this.setOrbit(3.141592653589793 * (double)param0.cueAim.azimuth / 1024.0, 3.141592653589793 * (double)(param0.cueAim.polarAngle + 32) / 1024.0, 192.0, -6861);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mm.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final double getPitch(byte param0) {
        double var2 = this.eyeX - this.targetX;
        if (param0 <= 77) {
          return -2.6664810522364304;
        }
        double var4 = -this.targetY + this.eyeY;
        double var6 = Math.sqrt(var2 * var2 + var4 * var4);
        return Math.atan2(var6, this.eyeZ - this.targetZ);
    }

    final static BrowserCookieSupport a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        BrowserCookieSupport var5 = null;
        BrowserCookieSupport stackIn_4_0 = null;
        BrowserCookieSupport stackIn_8_0 = null;
        BrowserCookieSupport stackIn_11_0 = null;
        BrowserCookieSupport stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            var2_int = param1.indexOf('@');
            if (param0 == var2_int) {
              stackIn_8_0 = WorldPointProjectionSupport.field_e;
              return stackIn_8_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(var2_int + 1);
            var5 = PlasmaBallSkin.validateEmailLocalPart(7, var3);
            if (var5 == null) {
              stackIn_13_0 = BirthDatePromptPanel.validateEmailDomain(102, var4);
              return stackIn_13_0;
            }
            stackIn_11_0 = var5;
            return stackIn_11_0;
          }
          stackIn_4_0 = CheckboxPainter.field_a;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("mm.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void copyFrom(int param0, Camera param1) {
        try {
          this.eyeZ = param1.eyeZ;
          if (param0 != 144) {
            ratingModeName = (String[]) null;
          }
          this.targetX = param1.targetX;
          this.targetZ = param1.targetZ;
          this.targetY = param1.targetY;
          this.eyeX = param1.eyeX;
          this.eyeY = param1.eyeY;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mm.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void setFromArray(double[] param0, byte param1) {
        try {
          this.targetY = param0[4];
          this.eyeY = param0[1];
          this.targetZ = param0[5];
          this.eyeX = param0[0];
          if (param1 > -33) {
            Camera var4 = (Camera) null;
            this.copyFrom(-110, (Camera) null);
          }
          this.eyeZ = param0[2];
          this.targetX = param0[3];
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mm.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void setDistance(boolean param0, double param1) {
        double var4 = -this.targetX + this.eyeX;
        double var6 = this.eyeY - this.targetY;
        double var8 = -this.targetZ + this.eyeZ;
        if (!param0) {
          return;
        }
        double var10 = Math.sqrt(var8 * var8 + (var6 * var6 + var4 * var4));
        this.eyeX = this.targetX + param1 * var4 / var10;
        this.eyeY = this.targetY + param1 * var6 / var10;
        this.eyeZ = this.targetZ + var8 * param1 / var10;
        this.c((byte) -40);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ChoiceButtonSupport.field_a.setBounds(param2, 2147483647, param4, param3, param1);
        if (LobbyPlayer.field_Ub != null) {
          LobbyPlayer.field_Ub.layoutMenuChain(param0, param6, -ProgressBarWidget.field_G + param6, (byte) 127, param1, param1);
        }
        if (param5 < 69) {
          Camera.releaseStatics(49);
        }
    }

    private final void positionEyeFromOrbit(double param0, double param1, double param2, int param3) {
        if (param3 != 144) {
          return;
        }
        if (2.945243112740431 < param1) {
          param1 = 2.945243112740431;
        }
        if (1.6689710972195777 > param1) {
          param1 = 1.6689710972195777;
        }
        double var8 = Math.sin(param1) * -param2;
        this.eyeX = this.targetX - Math.cos(param0) * var8;
        this.eyeY = this.targetY - Math.sin(param0) * var8;
        this.eyeZ = this.targetZ + Math.cos(param1) * param2;
    }

    final void setOrbit(double param0, double param1, double param2, int param3) {
        if (param3 != -6861) {
          field_c = (Sprite) null;
        }
        this.positionEyeFromOrbit(param0, param1, param2, 144);
        this.c((byte) -40);
    }

    final boolean easeTowards(Camera param0, byte param1) {
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        double var3_doubleLifetime1;
        double var3_doubleLifetime2;
        double var3_doubleLifetime3;
        double var3_doubleLifetime4;
        double var3_doubleLifetime5;
        var6 = Pool.field_O;
        try {
          var5 = 0;
          if (this.eyeX != param0.eyeX) {
            var3_double = -this.eyeX + param0.eyeX;
            if (0.5 > var3_double &&
              var3_double > -0.5) {
              this.eyeX = param0.eyeX;
            } else {
              this.eyeX = this.eyeX + var3_double / 8.0;
            }
            var5 = 1;
          }
          if (param0.eyeY != this.eyeY) {
            var3_doubleLifetime1 = param0.eyeY - this.eyeY;
            var5 = 1;
            if (0.5 > var3_doubleLifetime1 &&
              var3_doubleLifetime1 > -0.5) {
              this.eyeY = param0.eyeY;
            } else {
              this.eyeY = this.eyeY + var3_doubleLifetime1 / 8.0;
            }
          }
          if (this.eyeZ != param0.eyeZ) {
            var3_doubleLifetime2 = param0.eyeZ - this.eyeZ;
            var5 = 1;
            if (var3_doubleLifetime2 < 0.5 &&
              -0.5 < var3_doubleLifetime2) {
              this.eyeZ = param0.eyeZ;
            } else {
              this.eyeZ = this.eyeZ + var3_doubleLifetime2 / 8.0;
            }
          }
          if (this.targetX != param0.targetX) {
            var3_doubleLifetime3 = -this.targetX + param0.targetX;
            var5 = 1;
            if (0.5 > var3_doubleLifetime3 &&
              -0.5 < var3_doubleLifetime3) {
              this.targetX = param0.targetX;
            } else {
              this.targetX = this.targetX + var3_doubleLifetime3 / 8.0;
            }
          }
          if (this.targetY != param0.targetY) {
            var3_doubleLifetime4 = -this.targetY + param0.targetY;
            if (var3_doubleLifetime4 < 0.5 &&
              var3_doubleLifetime4 > -0.5) {
              this.targetY = param0.targetY;
            } else {
              this.targetY = this.targetY + var3_doubleLifetime4 / 8.0;
            }
            var5 = 1;
          }
          if (param1 != -78) {
            this.b(-34);
          }
          if (param0.targetZ != this.targetZ) {
            var3_doubleLifetime5 = -this.targetZ + param0.targetZ;
            var5 = 1;
            if (var3_doubleLifetime5 < 0.5 &&
              var3_doubleLifetime5 > -0.5) {
              this.targetZ = param0.targetZ;
            } else {
              this.targetZ = this.targetZ + var3_doubleLifetime5 / 8.0;
            }
          }
          this.sanitizeNaN((byte) 108);
          this.c((byte) -40);
          stackIn_42_0 = var5;
          return stackIn_42_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("mm.G(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    final int snapToNearestPreset(int param0, double[][] param1) {
        int var6 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        double var4 = 0.0;
        double[] var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        try {
          var3_int = 0;
          var4 = -1.0;
          for (var6 = 0; var6 < param1.length; var6++) {
            var7 = param1[var6];
            var8 = -this.eyeX + var7[0];
            var10 = var7[1] - this.eyeY;
            var12 = -this.eyeZ + var7[2];
            var14 = -this.targetX + this.eyeX;
            var16 = -this.targetY + this.eyeY;
            var18 = -this.targetZ + this.eyeZ;
            if (!(var8 * var14 + var10 * var16 + var12 * var18 < 0.0)) {
              var20 = var12 * var12 + (var10 * var10 + var8 * var8);
              if (0.0 > var4 ||
                var4 > var20) {
                var3_int = var6;
                var4 = var20;
              }
            }
          }
          if (param0 != -11024) {
            this.c((byte) -115);
          }
          this.setFromArray(param1[var3_int], (byte) -86);
          stackIn_13_0 = var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("mm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void resetToDefault(byte param0) {
        this.targetX = 288.0;
        this.targetY = 144.0;
        this.eyeX = 288.0;
        this.eyeZ = -512.0;
        this.eyeY = 144.0;
        this.targetZ = -8.0;
        if (param0 != -24) {
          Camera var3 = (Camera) null;
          this.copyFrom(13, (Camera) null);
        }
    }

    final static void configureSharedInterfaceStyle(int param0, int param1, int param2, int param3, BitmapFont param4, int param5, int param6, int param7, int param8, int param9, NineSliceFrame param10, int param11, int param12, NineSliceFrame param13, BitmapFont param14, int param15, int param16, int param17, int param18, NineSliceFrame param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          QuickChatMenu.field_ec = param14;
          HotspotRectangle.field_t = param4;
          AchievementsScreen.configureInterfaceMetrics(84, param1, param7, param6, param12);
          UsernameSuggestionsPanel.a(param18, param0, param13, -92);
          if (param16 != 2) {
            return;
          }
          DebugTuningSlider.configureTextFrameStyle(param17, 26790, param10, param3, param5, param19);
          GrowableIntListFactory.a(param9, -17, param2);
          SpriteState.a((byte) -82, param11, param8, param15);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("mm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param14 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    Camera() {
        this.resetToDefault((byte) -24);
    }

    static {
        ratingNoratings = "No players";
        muChatGame = "Game";
        loadingMusic = "Loading music";
        ratingModeName = new String[]{"By rating", "By win percentage"};
    }
}
