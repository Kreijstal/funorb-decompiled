/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderedBall extends BallAgent {
    private int[] field_G;
    static boolean[] field_T;
    private int[] field_D;
    private FixedQuaternion field_Q;
    static String field_H;
    private int field_J;
    static int field_C;
    boolean field_I;
    int field_N;
    private boolean field_S;
    int field_E;
    private int field_O;
    private int field_K;
    private boolean field_L;
    static String field_F;
    static String field_R;
    static int field_B;
    private int field_M;

    final void updateBallVisuals(RenderedFootballer param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_12_0;
        int stackIn_12_3;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var3_intLifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        var8 = Kickabout.field_G;
        try {
          if (param0 != null) {
            stackIn_6_0 = (!param0.isMovingDiagonally(false)) ? 0 : 1;
            var3_int = stackIn_6_0;
            this.field_M = 0;
            stackIn_8_1 = param0.directionX;
            if (var3_int != 0) {
              stackIn_9_2 = 926720;
            } else {
              stackIn_9_2 = 1310720;
            }
            this.field_N = stackIn_8_1 * stackIn_9_2 + param0.field_kb;
            stackIn_11_1 = param0.field_bb;
            stackIn_11_2 = param0.directionY;
            if (var3_int != 0) {
              stackIn_12_0 = this;
              stackIn_12_3 = 602368;
            } else {
              stackIn_12_0 = this;
              stackIn_12_3 = 851968;
            }
            this.field_E = stackIn_11_1 + stackIn_11_2 * stackIn_12_3;
          }
          var3_intLifetime1 = -this.field_O + this.field_N;
          if (param1 <= 32) {
            return;
          }
          var4 = -this.field_K + this.field_E;
          this.field_K = this.field_E;
          this.field_O = this.field_N;
          if (FaceNormal.field_c) {
            var3_intLifetime1 = -var3_intLifetime1;
            var4 = -var4;
          }
          if ((var3_intLifetime1 != 0 ||
            var4 != 0) &&
            (8388608 > Math.abs(var3_intLifetime1) &&
            Math.abs(var4) < 8388608)) {
            var5 = GameLoopApplet.fixedPointDistance(var3_intLifetime1, var4, -23146);
            if (var5 != 0) {
              var4 = (int)(((long)var4 << 16) / (long)var5);
              var3_intLifetime1 = (int)(((long)var3_intLifetime1 << 16) / (long)var5);
              IntrusiveDeque.field_d.setFromAxisAngle(var3_intLifetime1, true, 0, var4, var5 >> 12);
              this.field_Q.preMultiply(IntrusiveDeque.field_d, -49);
              this.field_L = true;
            }
          }
          if (!this.field_k) {
            if (!this.field_y &&
              this.field_x) {
              var5Lifetime1 = 41;
              var6 = GameLoopApplet.fixedPointDistance(var3_intLifetime1, var4, -23146);
              var7 = var6 >> 10;
              LobbyPlayerRow.a(128, false, 240, ClientUiUpdateSupport.field_f + var7, var5Lifetime1);
            }
          } else {
            if (KitPatternMaskSupport.field_c != 0) {
              stackIn_32_0 = (KitPatternMaskSupport.field_c != 1) ? 2 : 1;
            } else {
              stackIn_32_0 = 0;
            }
            var5Lifetime1 = stackIn_32_0;
            if (0 == this.verticalVelocity) {
              var6 = 16;
            } else {
              var6 = (this.verticalVelocity >> 16) * 32;
            }
            if (KitPatternMaskSupport.field_c == 0) {
              var6 -= 40;
            }
            if (KitPatternMaskSupport.field_c == 1) {
              var6 -= 20;
            }
            if (KitPatternMaskSupport.field_c == 2) {
              var6 -= 40;
            }
            LobbyPlayerRow.a(128, false, 240, var6 + DemoIntegersCommand.field_E, var5Lifetime1);
          }
          if (this.highFriction > 0) {
            var5Lifetime2 = this.horizontalSpeedSquared(92) >> 16;
            var6Lifetime1 = var5Lifetime2 * 160 / 324;
            if (var6Lifetime1 > 255) {
              var6Lifetime1 = 255;
            }
            AccountNameAvailabilityValidator.captureBallAfterimage(this, 256, var6Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_58_0 = var3;
          stackIn_58_1 = new StringBuilder().append("ob.OA(");
          if (param0 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_R = null;
        int var1 = -60 / ((43 - param0) / 45);
        field_F = null;
        field_H = null;
        field_T = null;
    }

    final void setPositionAndStop(int param0, int param1, byte param2, int param3) {
        super.setPositionAndStop(param0, param1, param2, param3);
        this.field_N = param0;
        this.field_M = param1;
        this.field_E = param3;
    }

    final int getRenderedScale(int param0) {
        int var3 = 0;
        if (param0 != -1) {
          return 110;
        }
        int var2 = 1200;
        if (7 == this.modelId) {
          var2 = 4300;
        }
        if (0 != this.field_M) {
          var3 = (this.field_M >> 15) + 256;
          if (var3 > 512) {
            var3 = 512;
          }
          var2 = (var2 << 8) / var3;
        }
        return var2;
    }

    final void drawBall(int param0, int param1, int param2, int param3, int param4) {
        TriangleRasterizer.useRasterClip();
        TriangleRasterizer.setProjectionCenter(param1, param2);
        if (param4 != 300) {
          ChatMessage var7 = (ChatMessage) null;
          RenderedBall.formatChatMessagePrefix((byte) -13, (ChatMessage) null);
        }
        if (this.field_L) {
          this.field_Q.toRotationMatrix(8, this.field_G);
          this.field_L = false;
        }
        if (this.field_J != param3) {
          this.setRotationMatrix((byte) -113, param3, 300);
        }
        EmailSyntaxValidator.field_l[this.modelId].drawTransformed(this.field_D, this.field_G);
    }

    private final int getRenderedX(int param0) {
        if (param0 != 14963) {
          return -121;
        }
        return this.field_N >> 16;
    }

    final static int measureTutorialMessageWidth(int param0, int param1) {
        String var2 = null;
        BinaryBitmapFont var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var7 = Kickabout.field_G;
        try {
          if (param0 == -1) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var2 = TutorialMessages.field_c[param0];
          var5 = 26 / ((param1 + 55) / 54);
          var3 = IsSixCommand.field_C;
          var4 = 300;
          var6 = ((BitmapFont) ((Object) var3)).wrappedLineCount(var2, var4);
          if (var6 > 3) {
            while (((BitmapFont) ((Object) var3)).wrappedLineCount(var2, var4) > 3) {
              var4 += 20;
            }
          } else {
            if (var6 > 1) {
              while (((BitmapFont) ((Object) var3)).wrappedLineCount(var2, var4) == var6) {
                var4 += 20;
              }
              if (var4 > 500) {
                var4 = 300;
              }
            }
          }
          stackIn_14_0 = 94 + var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2_ref), "ob.MA(" + param0 + ',' + param1 + ')');
        }
    }

    final void stepPhysics(byte param0, int param1, PlayArea[] param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = this.positionX;
          var5 = this.positionY;
          var6 = this.height;
          super.stepPhysics((byte) -81, param1, param2);
          if (!this.field_I) {
            this.field_M = this.height;
            this.field_N = this.positionX;
            this.field_E = this.positionY;
            return;
          }
          this.field_N = this.field_N + (this.positionX - var4_int);
          var7 = 111 / ((param0 + 3) / 59);
          this.field_M = this.field_M + (this.height - var6);
          this.field_E = this.field_E + (this.positionY - var5);
          if (this.field_S) {
            this.field_N = this.positionX + 7 * this.field_N >> 3;
            this.field_M = this.height + 7 * this.field_M >> 3;
            this.field_E = this.positionY + this.field_E * 7 >> 3;
            var8 = this.field_N - this.positionX >> 16;
            var9 = this.field_E - this.positionY >> 16;
            var10 = -this.height + this.field_M >> 16;
            var11 = var10 * var10 + (var8 * var8 + var9 * var9);
            if (var11 > 2 &&
              -1 == this.possessorTeam) {
              return;
            }
            this.field_S = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ob.JA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int getRenderedY(boolean param0) {
        if (!param0) {
          this.field_L = false;
        }
        int var2 = this.field_E >> 16;
        int var3 = this.field_M >> 16;
        if (var3 <= 0) {
          return var2;
        }
        if (var3 >= 1000) {
          var3 = 999;
        }
        int var4 = var3 * 1000 / (-var3 + 1000);
        if (FaceNormal.field_c) {
          return var4 + var2;
        }
        return -var4 + var2;
    }

    final static boolean pollAndMergeAchievementMask(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        var5 = Kickabout.field_G;
        try {
          var1_int = -78 % ((param0 + 26) / 53);
          if (null == EmailAvailabilityValidator.field_q) {
            EmailAvailabilityValidator.field_q = TutorialScenerySupport.requestAchievementMask(4, 26731);
          }
          if (!EmailAvailabilityValidator.field_q.complete) {
            return false;
          }
          var6 = BufferedSocket.field_f;
          var7 = EmailAvailabilityValidator.field_q.resultValues;
          for (var4 = 0; var4 < 8; var4++) {
            var6[var4] = PainterStyle.bitwiseOr(var6[var4], var7[var4]);
          }
          var8 = WelcomeDialog.field_F;
          var9 = EmailAvailabilityValidator.field_q.resultValues;
          var10 = 0;
          var4Lifetime1 = var10;
          while (8 > var10) {
            var8[var10] = TextLayoutLine.bitwiseAnd(var8[var10], ~var9[var10]);
            var10++;
          }
          EmailAvailabilityValidator.field_q = null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "ob.HA(" + param0 + ')');
        }
    }

    final void drawShadow(int param0) {
        int var2 = 0;
        int var8 = Kickabout.field_G;
        int var2Lifetime1;
        WhirlpoolHasher.field_d = new int[32];
        if (param0 >= -7) {
          return;
        }
        for (var2 = 0; var2 < WhirlpoolHasher.field_d.length; var2++) {
          WhirlpoolHasher.field_d[var2] = 65793 * (var2 << 3);
        }
        var2Lifetime1 = this.field_M >> 16;
        if (var2Lifetime1 > 256) {
          var2Lifetime1 = 256;
        }
        if (var2Lifetime1 < 0) {
          var2Lifetime1 = 0;
        }
        int var3 = InstrumentNoteMask.field_i * (14 - (var2Lifetime1 * 14 >> 10)) >> 8;
        int var4 = -5 * InstrumentNoteMask.field_i >> 8;
        int var5 = 4 * InstrumentNoteMask.field_i >> 8;
        int var6 = -1 + WhirlpoolHasher.field_d.length;
        int var7 = (var2Lifetime1 * (var6 >> 1) >> 8) + (var6 >> 1);
        SpritePixelSupport.drawRadialShadow(SocialListLayoutSupport.worldToScreenX(0, this.field_N >> 16) + var4 << 4, IntKeyLookup.projectPitchY((byte) -96, this.field_E >> 16) + var5 << 4, var3 << 4, var7, WhirlpoolHasher.field_d);
    }

    final void reconcileStateFrom(MatchAgent param0, int param1, int param2, int param3) {
        BallAgent var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          var5 = (BallAgent) (param0);
          if (this.shouldDeferStateCorrection(-108, var5, param2, param1)) {
            return;
          }
          this.copyCompleteStateFrom(param0, false);
          if (param3 < 38) {
            this.field_D = (int[]) null;
          }
          if (!this.field_S) {
            if (this.possessorTeam != -1) {
              return;
            }
            var6 = -this.positionX + this.field_N >> 16;
            var7 = -this.positionY + this.field_E >> 16;
            var8 = this.field_M - this.height >> 16;
            var9 = var8 * var8 + var6 * var6 + var7 * var7;
            if (var9 > 144) {
              this.field_S = true;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("ob.LA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void setRotationMatrix(byte param0, int param1, int param2) {
        int var4 = RotaryDialPainter.sine(param2, (byte) -23);
        int var5 = ClientUiUpdateSupport.cosine(param2, false);
        this.field_J = param1;
        this.field_D[3] = 65536;
        this.field_D[1] = var4 * param1 >> 16;
        this.field_D[8] = -var4;
        int var6 = 3 / ((param0 - 11) / 54);
        this.field_D[11] = var5;
        this.field_D[10] = -var4;
        this.field_D[2] = var5 * -param1 >> 16;
        this.field_D[7] = -var5;
    }

    final static String formatChatMessagePrefix(byte param0, ChatMessage param1) {
        String stackIn_31_0 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        var4 = Kickabout.field_G;
        try {
          if (param0 != -92) {
            field_T = (boolean[]) null;
          }
          var2 = null;
          if (param1.field_h != null) {
            var5 = param1.field_h;
            var2 = var5;
            var2 = var5;
            var2 = var5;
            if (param1.field_o == 1) {
              var2 = "<img=0>" + var5;
            }
            if (param1.field_o == 2) {
              var2 = "<img=1>" + (String) (var2);
            }
          }
          var3 = "";
          if (param1.field_c != 2) {
            if (0 == param1.field_c &&
              SharedScrollbarState.field_d) {
              var3 = "[" + ButtonMenuScreen.field_z + "] ";
            }
            if (1 == param1.field_c) {
              var3 = "[" + LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, AccountNameAvailabilityValidator.field_m, new String[]{param1.field_l}) + "] ";
            }
            if (param1.field_c == 4 &&
              null != SingleChildContainer.field_x) {
              var3 = "[" + SingleChildContainer.field_x + "] ";
            }
            if (param1.field_c == 3) {
              var3 = "[#" + param1.field_l + "] ";
            }
            if (!param1.field_m) {
              var3 = var3 + (String) (var2) + ": ";
            }
          } else {
            if (!param1.field_m) {
              if (param1.field_j == 0 &&
                param1.field_p == 0) {
                var3 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, MySquadScreen.field_F, new String[]{(String) (var2)});
              } else {
                var3 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, UiLayoutNode.field_ib, new String[]{(String) (var2)});
              }
            }
          }
          stackIn_31_0 = var3;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("ob.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) (stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static void drawDottedRectangle(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
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
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Kickabout.field_G;
        try {
          var5_int = param4 + param1;
          var6 = param3 + param2;
          if (SoftwareRasterizer.field_b >= param4) {
            stackIn_4_0 = SoftwareRasterizer.field_b;
          } else {
            stackIn_4_0 = param4;
          }
          var7 = stackIn_4_0;
          if (SoftwareRasterizer.field_e >= param2) {
            stackIn_7_0 = SoftwareRasterizer.field_e;
          } else {
            stackIn_7_0 = param2;
          }
          var8 = stackIn_7_0;
          if (SoftwareRasterizer.field_c <= var5_int) {
            stackIn_10_0 = SoftwareRasterizer.field_c;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (SoftwareRasterizer.field_h > var6) {
            stackIn_13_0 = var6;
          } else {
            stackIn_13_0 = SoftwareRasterizer.field_h;
          }
          var10 = stackIn_13_0;
          if (SoftwareRasterizer.field_b <= param4 &&
            SoftwareRasterizer.field_c > param4) {
            var11 = param4 + var8 * SoftwareRasterizer.field_g;
            var12 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              SoftwareRasterizer.field_a[var11] = 16777215;
              var11 = var11 + SoftwareRasterizer.field_g * 2;
            }
          }
          if (SoftwareRasterizer.field_e <= param2 &&
            var6 < SoftwareRasterizer.field_h) {
            var11Lifetime1 = SoftwareRasterizer.field_g * param2 + var7;
            var12Lifetime1 = 1 + (var9 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              SoftwareRasterizer.field_a[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (param0 != 2) {
            RenderedBall.pollAndMergeAchievementMask(53);
          }
          if (SoftwareRasterizer.field_b <= var5_int &&
            SoftwareRasterizer.field_c > var5_int) {
            var11Lifetime2 = ((1 & var5_int - param4) + var8) * SoftwareRasterizer.field_g + var5_int;
            var12Lifetime2 = 1 + (var10 - var8) >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              SoftwareRasterizer.field_a[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + SoftwareRasterizer.field_g * 2;
            }
          }
          if (SoftwareRasterizer.field_e <= param2) {
            if (var6 >= SoftwareRasterizer.field_h) {
              return;
            }
            var11Lifetime3 = (1 & var6 - param2) + SoftwareRasterizer.field_g * var6 + var7;
            var12Lifetime3 = var9 + 1 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                break;
              }
              SoftwareRasterizer.field_a[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var5), "ob.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void render(int param0) {
        if (param0 != 64) {
          return;
        }
        int var2 = this.getRenderedScale(-1);
        int var3 = SocialListLayoutSupport.worldToScreenX(0, this.getRenderedX(param0 + 14899));
        int var4 = IntKeyLookup.projectPitchY((byte) -107, this.getRenderedY(true));
        if (SocketArchiveNetworkClient.field_v != 1) {
          var2 = (var2 << 8) / InstrumentNoteMask.field_i;
          this.drawBall(300, var3, var4, var2, 300);
        } else {
          PacketBuffer.pushSpriteRaster(-115, AvailabilityCheckRequest.field_f);
          SoftwareRasterizer.clearFramebuffer();
          var2 = (var2 << 7) / InstrumentNoteMask.field_i;
          this.drawBall(300, 64, 64, var2, 300);
          TeamManagementScreen.e(118);
          AvailabilityCheckRequest.field_f.drawHalfSize(var3 - 32, -32 + var4);
        }
    }

    RenderedBall(BallAgent param0) {
        this.field_I = true;
        try {
          this.copyCompleteStateFrom(param0, false);
          this.field_G = new int[12];
          this.field_Q = new FixedQuaternion();
          this.field_Q.toRotationMatrix(8, this.field_G);
          this.field_D = new int[12];
          this.setRotationMatrix((byte) 127, 1200, 300);
          this.field_N = this.positionX;
          this.field_M = this.height;
          this.field_E = this.positionY;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = new boolean[7];
        field_H = "Yes";
        field_F = "You must be a member to play with the current options.";
        field_R = "You must have unlocked the \"<%0>\" Achievement to wear this kit.";
        field_B = 22;
    }
}
