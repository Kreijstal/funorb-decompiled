/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PoolGameModel {
    static UiComponent field_k;
    int field_y;
    static UiComponent field_v;
    Pocket[] pockets;
    boolean field_m;
    CushionSegment[] cushionSegments;
    int field_z;
    int playerCount;
    int field_A;
    Ball[] balls;
    int field_j;
    boolean field_o;
    int field_x;
    int field_p;
    GameRules rules;
    int field_q;
    private int[] field_d;
    int[][] field_e;
    IntrusiveDeque shots;
    int field_s;
    String[] field_h;
    static BallSkin[] field_B;
    static int[] field_g;
    int field_b;
    private int[] field_a;
    IntrusiveDeque field_i;
    AimTarget[] field_r;
    private int[] field_t;

    private final void loadTableOutline(boolean param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        try {
          this.cushionSegments = new CushionSegment[param1.length / 3];
          for (var3_int = 0; var3_int < param1.length / 3; var3_int++) {
            var4 = param1[(3 * var3_int + 0) % param1.length];
            var5 = param1[(3 * var3_int + 1) % param1.length] << 16;
            var6 = param1[(2 + var3_int * 3) % param1.length] << 16;
            var7 = param1[(3 + var3_int * 3) % param1.length];
            var8 = param1[(4 + 3 * var3_int) % param1.length] << 16;
            var9 = param1[(5 + var3_int * 3) % param1.length] << 16;
            this.cushionSegments[var3_int] = new CushionSegment(var5, var6, var8, var9, var4, var7);
          }
          this.field_e = new int[param1.length / 3][2];
          this.field_d = new int[param1.length / 3];
          if (!param0) {
            this.g((byte) -43);
          }
          var10 = 0;
          var3_intLifetime1 = var10;
          while (param1.length / 3 > var10) {
            this.field_d[var10] = param1[var10 * 3];
            this.field_e[var10][0] = param1[1 + var10 * 3] << 16;
            this.field_e[var10][1] = param1[var10 * 3 + 2] << 16;
            var10++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("al.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int nearestPocketIndex(int param0, int param1) {
        int discarded$1 = 0;
        int var7 = 0;
        int var3;
        long var4;
        Ball var6;
        long var8;
        long var10;
        long var12;
        int var14;
        var14 = Pool.field_O;
        var3 = -1;
        var4 = 0L;
        if (param0 != 17897) {
          discarded$1 = this.f(-119);
        }
        var6 = this.balls[param1];
        for (var7 = 0; var7 < this.pockets.length; var7++) {
          var8 = (long)(-var6.positionX + this.pockets[var7].centerX);
          var10 = (long)(this.pockets[var7].centerY - var6.positionY);
          var12 = var8 * var8 + var10 * var10;
          if (var3 == -1 ||
            var4 > var12) {
            var4 = var12;
            var3 = var7;
          }
        }
        return var3;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 10) {
          return;
        }
        field_g = null;
        field_k = null;
        field_v = null;
        field_B = null;
    }

    final boolean f(byte param0) {
        int var3;
        Object var4;
        ShotRecord var4_ref;
        ShotRecord var5_ref_qe;
        int var5;
        Object var6;
        Ball var7;
        ShotRecord var8;
        int var5Lifetime1;
        var4 = null;
        var8 = this.currentShot(22);
        var3 = this.a(true, (byte) 76, var8) ? 1 : 0;
        if (this.field_i != null &&
          !this.field_i.isEmpty(0)) {
          var4_ref = (ShotRecord) (this.field_i.removeFirst((byte) -41));
        } else {
          var4_ref = new ShotRecord();
        }
        var4_ref.shotNumber = var8.shotNumber + 1;
        var4_ref.phase = 0;
        if (var3 != 0) {
          var4_ref.playerIndex = this.rules.nextPlayerIndex(var8, (byte) 117);
        } else {
          var4_ref.playerIndex = var8.playerIndex;
        }
        this.shots.b((byte) -14, var4_ref);
        this.field_A = var4_ref.playerIndex;
        if (var3 != 0) {
          this.field_y = 0;
          this.field_z = 0;
        }
        if ((MenuScreen.field_F & var8.endResolution) != 0) {
          this.b(ga.nextRandomInt(512, true, ea.field_r) + 1, 456);
        }
        if (param0 < 30) {
          this.field_z = -45;
        }
        if ((um.field_c & var8.endResolution) != 0) {
          if (var4_ref.cueBallX != -1) {
            if (var4_ref.cueBallY != -1) {
              this.a(var4_ref.cueBallY, (IsaacCipher) null, (byte) -118, var4_ref.cueBallX, 0);
            } else {
              this.n(-16739);
            }
          } else {
            this.n(-16739);
          }
        }
        if (var4_ref.cueBallX == -1 &&
          var4_ref.cueBallY == -1) {
          var5_ref_qe = var4_ref;
          var6 = this;
          var7 = ((PoolGameModel) (var6)).balls[0];
          var5_ref_qe.cueBallX = var7.positionX;
          var5_ref_qe.cueBallY = var7.positionY;
        } else {
          this.a(var4_ref.cueBallY, var4_ref.cueBallX, -91, 0, false);
        }
        for (var5 = 0; var5 < this.pockets.length; var5++) {
          this.pockets[var5].keepOnlyPottedBalls(this.balls, -80);
        }
        if ((var8.endResolution & OptionsScreen.field_I) != 0) {
          this.field_z = 1;
        }
        if ((var8.endResolution & AccountWelcomePanel.field_Y) == 0) {
          var4_ref.ballInHandMode = 0;
        } else {
          if ((AccountWelcomePanel.field_V & var8.endResolution) == 0) {
            if ((var8.endResolution & AccountWelcomePanel.field_R) != 0) {
              var4_ref.ballInHandMode = 1;
            } else {
              if ((var8.endResolution & AccountWelcomePanel.field_Q) != 0) {
                var4_ref.ballInHandMode = 2;
              }
            }
          } else {
            var4_ref.ballInHandMode = 3;
          }
        }
        if (0 != (var8.endResolution & ThemeSelectScreen.field_O)) {
          this.field_y = 1;
        }
        if ((ClientException.field_b & var8.endResolution) != 0) {
          var5Lifetime1 = var8.field_l & 3;
          if (var5Lifetime1 != 1) {
            if (var5Lifetime1 == 2) {
              this.rules.a(1, -1, var8.playerIndex);
            }
          } else {
            this.rules.a(0, -1, var8.playerIndex);
          }
        }
        this.rules.initializeShot(var4_ref, false);
        return false;
    }

    final void a(int param0, IsaacCipher param1, byte param2, int param3, int param4) {
        try {
          this.a(param0, param3, param1, -30896, param4, 8192);
          int var6_int = 99 / ((param2 + 26) / 53);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "al.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void e(byte param0) {
        int var3 = 110 % ((-57 - param0) / 53);
        ShotRecord var2 = this.currentShot(20);
        var2.stateBefore = this.writeStateSnapshot((byte) 91);
        var2.c(2, this.rules.h(-1));
        var2.phase = 2;
    }

    private final PacketBuffer writeStateSnapshot(byte param0) {
        int var4 = 0;
        int var4Lifetime1;
        if (param0 <= 79) {
          this.n(117);
        }
        PacketBuffer var2 = new PacketBuffer(this.f(0));
        PacketBuffer var3 = var2;
        var3.writeByte(this.balls.length, false);
        for (var4 = 0; this.balls.length > var4; var4++) {
          this.balls[var4].writeState(0, var3);
        }
        int var5 = 0;
        var4Lifetime1 = var5;
        while (var5 < this.pockets.length) {
          this.pockets[var5].write(var3, 0);
          var5++;
        }
        return var2;
    }

    final ShotRecord currentShot(int param0) {
        if (param0 < 18) {
          return (ShotRecord) null;
        }
        return (ShotRecord) (this.shots.a((byte) -127));
    }

    final void potBallsInPockets(int param0, Ball[] param1, ShotRecord param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          for (var4_int = 0; var4_int < param1.length; var4_int++) {
            if (param1[var4_int].inPlay) {
              for (var5 = 0; var5 < this.pockets.length; var5++) {
                var6 = -this.pockets[var5].centerX + param1[var4_int].positionX;
                var7 = -this.pockets[var5].centerY + param1[var4_int].positionY;
                if (FullscreenFocusCanvas.multiplyFixedChecked((long)var6, (long)var6, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var7, (long)var7, false) < (long)LoginForm.a(324, (byte) 90)) {
                  param1[var4_int].inPlay = false;
                  param1[var4_int].motionState = 0;
                  if (param1[var4_int].field_q != null) {
                    param1[var4_int].field_q.a(23655, param1[var4_int], var5);
                  }
                  param2.pottedBalls.b((byte) -23, new PotEvent(var4_int, var5));
                }
              }
            }
          }
          if (param0 != 6582) {
            this.field_b = -87;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("al.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, byte param1, ShotRecord param2) {
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var6Lifetime1;
        try {
          var5 = 119 / ((param1 + 1) / 48);
          var4_int = 1;
          if (0 >= this.field_z) {
            if ((param2.endResolution & MarkerSliderPainter.field_j) != 0) {
              var4_int = 0;
            } else {
              if (this.field_y > 0) {
                if (param0) {
                  this.field_y = this.field_y - 1;
                }
                var4_int = 0;
              }
            }
          } else {
            if (param0) {
              this.field_z = this.field_z - 1;
            }
            var4_int = 0;
          }
          if ((param2.endResolution & ll.field_f) != 0) {
            var4_int = 1;
          }
          if ((ab.field_g & param2.endResolution) != 0) {
            var6 = param2.field_l & 24;
            if (var6 != 8) {
              if (16 == var6) {
                var4_int = 1;
              }
            } else {
              var4_int = 0;
            }
          }
          if ((a.field_d & param2.endResolution) != 0) {
            var6Lifetime1 = param2.field_l & 96;
            if (32 == var6Lifetime1) {
              var4_int = 1;
            } else {
              if (64 == var6Lifetime1) {
                var4_int = 0;
              }
            }
          }
          stackIn_28_0 = var4_int;
          return stackIn_28_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_31_0 = var4;
          stackIn_31_1 = new StringBuilder().append("al.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    private final void n(int param0) {
        this.a(50, (IsaacCipher) null);
        if (param0 != -16739) {
          this.field_p = 125;
        }
    }

    private final void findOverlappingBalls(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4;
        long var6;
        ShotRecord var8;
        hh.field_e = 0;
        for (var2 = 0; this.balls.length > var2; var2++) {
          if (this.balls[var2].inPlay) {
            for (var3 = var2 + 1; this.balls.length > var3; var3++) {
              if (this.balls[var3].inPlay) {
                var4 = (long)(-this.balls[var3].positionX + this.balls[var2].positionX);
                var6 = (long)(this.balls[var2].positionY - this.balls[var3].positionY);
                var4 = FullscreenFocusCanvas.multiplyFixedChecked(var4, var4, false);
                var6 = FullscreenFocusCanvas.multiplyFixedChecked(var6, var6, false);
                if (var4 + var6 < 16777216L) {
                  DropTargetWidget.field_N[hh.field_e][0] = var2;
                  DropTargetWidget.field_N[hh.field_e][1] = var3;
                  hh.field_e = hh.field_e + 1;
                }
              }
            }
          }
        }
        if (param0 != 77) {
          var8 = (ShotRecord) null;
          this.a(true, (byte) -9, (ShotRecord) null);
        }
    }

    private final void createPockets(int param0) {
        this.pockets = new Pocket[6];
        this.pockets[0] = new Pocket(this.cushionSegments[2]);
        if (param0 != 10571) {
          this.pockets = (Pocket[]) null;
        }
        this.pockets[1] = new Pocket(this.cushionSegments[6]);
        this.pockets[2] = new Pocket(this.cushionSegments[10]);
        this.pockets[3] = new Pocket(this.cushionSegments[14]);
        this.pockets[4] = new Pocket(this.cushionSegments[18]);
        this.pockets[5] = new Pocket(this.cushionSegments[22]);
    }

    private final void b(int param0, PacketBuffer param1) {
        int var4_int = 0;
        int var11 = 0;
        ShotRecord stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        ShotRecord stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ShotRecord var4 = null;
        ShotRecord var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var6Lifetime2Lifetime1;
        var12 = Pool.field_O;
        try {
          this.shots = new IntrusiveDeque();
          var3_int = param1.readInt(true);
          for (var4_int = 0; var3_int > var4_int; var4_int++) {
            var5 = new ShotRecord();
            var5.shotNumber = param1.readInt(true);
            var5.breakSeed = param1.readShort((byte) -86);
            var6 = param1.readUnsignedByte(param0 ^ -85);
            var5.phase = 15 & var6 >> 4;
            stackIn_5_0 = var5;
            stackIn_6_1 = (8 == (8 & var6));
            stackIn_5_0.field_t = stackIn_6_1;
            var5.playerIndex = var6 & 7;
            var6Lifetime1 = param1.readUnsignedByte(-120);
            var5.groupBefore = 15 & var6Lifetime1;
            stackIn_8_0 = var5;
            stackIn_9_1 = ((var6Lifetime1 & 64) != 0);
            stackIn_8_0.field_E = stackIn_9_1;
            var5.ballInHandMode = 3 & var6Lifetime1 >> 4;
            if (var5.groupBefore == 15) {
              var5.groupBefore = -1;
            }
            var5.cueBallX = param1.readInt(true);
            var5.cueBallY = param1.readInt(true);
            if (var5.phase >= 1) {
              var5.aimAngle = (short)param1.readUnsignedShort(-1034);
              var5.elevation = (short)param1.readUnsignedShort(-1034);
              var5.power = (short)param1.readUnsignedShort(-1034);
              var5.field_D = (byte)param1.readUnsignedByte(-77);
              var5.field_H = (byte)param1.readUnsignedByte(param0 ^ -101);
            }
            if (var5.phase >= 2) {
              var6Lifetime2 = var5.pottedBalls.a(68);
              var6Lifetime2Lifetime1 = param1.readUnsignedByte(-97);
              if (var6Lifetime2Lifetime1 > 0) {
                var5.pottedBalls = new IntrusiveDeque();
                for (var7 = 0; var7 < var6Lifetime2Lifetime1; var7++) {
                  var8 = param1.readUnsignedByte(param0 ^ -125);
                  var5.pottedBalls.b((byte) 97, new PotEvent(31 & var8, var8 >> 5));
                }
              }
              var7Lifetime1 = param1.readUnsignedByte(-123);
              if (var7Lifetime1 > 0) {
                var5.field_R = new IntrusiveDeque();
                for (var8Lifetime1 = 0; var7Lifetime1 > var8Lifetime1; var8Lifetime1++) {
                  var9 = param1.readUnsignedByte(param0 ^ -97);
                  var14 = new int[param1.readUnsignedByte(-88)];
                  var13 = var14;
                  var10 = var13;
                  for (var11 = 0; var11 < var14.length; var11++) {
                    var10[var11] = param1.readUnsignedByte(cq.a(param0, -124));
                  }
                  var5.field_R.b((byte) -70, new dn(var9, var14));
                }
              }
              var5.endResolution = param1.readUnsignedMedium(81);
            }
            if (var5.phase >= 3) {
              var5.field_l = (byte)param1.readUnsignedByte(param0 - 130);
            }
            this.shots.b((byte) 94, var5);
          }
          var4 = this.currentShot(81);
          this.field_A = var4.playerIndex;
          if (param0 <= var4.phase) {
            this.h(22042);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("al.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final boolean allBallsStopped(int param0) {
        int var2 = 0;
        for (var2 = param0; this.balls.length > var2; var2++) {
          if (this.balls[var2].inPlay &&
            0 != this.balls[var2].motionState) {
            return false;
          }
        }
        return true;
    }

    final boolean h(int param0) {
        ShotRecord var2;
        var2 = this.currentShot(param0 ^ 22081);
        if (var2.phase < 2) {
          throw new IllegalStateException("");
        }
        if (param0 != 22042) {
          return true;
        }
        if (0 != (var2.endResolution & Quaternion.field_e)) {
          this.field_A = this.rules.nextPlayerIndex(var2, (byte) 94);
          return true;
        }
        if ((ag.field_e & var2.endResolution) != 0) {
          return true;
        }
        if (var2.d(116)) {
          return false;
        }
        return this.f((byte) 116);
    }

    private final void a(int param0, int param1, IsaacCipher param2, int param3, int param4, int param5) {
        int var13 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        Ball var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          if (param3 != -30896) {
            return;
          }
          var7_int = 0;
          var8 = 0;
          if (param2 != null) {
            var7_int = param2.a(23165, 524288);
            var8 = -262144 + param2.a(23165, 524288);
          }
          var9 = this.balls[param4];
          var9.field_o = false;
          var9.inPlay = true;
          var9.positionZ = -524288;
          var9.stop((byte) -105);
          var9.transformDirty = true;
          var9.orientation.setIdentity(false);
          var9.positionX = var7_int + param1;
          var9.positionY = var8 + param0;
          this.findOverlappingBalls((byte) 77);
          var10 = 0;
          var11 = 0;
          while (true) {
            if (hh.field_e > 0) {
              var12 = 0;
              for (var13 = 0; var13 < hh.field_e; var13++) {
                if (param4 == DropTargetWidget.field_N[var13][0] ||
                  param4 == DropTargetWidget.field_N[var13][1]) {
                  var12++;
                }
              }
              if (var12 == 0) {
                return;
              }
              var10 += 2048;
              if (var10 >= 262144) {
                var11 = var11 + dn.a(67108864 / (var10 >> 8), false);
              } else {
                var11 += 256;
              }
              var11 = var11 % param5;
              var9.positionX = (EightBallRules.c((byte) -121, var11) >> 4) * (var10 >> 12) + param1;
              var9.positionY = param0 + (UiComponentNode.sineFixed(var11, (byte) -62) >> 4) * (var10 >> 12);
              this.findOverlappingBalls((byte) 77);
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("al.RA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        long var11_long;
        int var12;
        long var12_long;
        long var13;
        long var14;
        long var15;
        long var16;
        long var17;
        int var18;
        long var19;
        int var19_int;
        int var20;
        long var21;
        long var23;
        long var25;
        long var27;
        long var29;
        long var31;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        if (param5 * param5 + param0 * param0 > 9216) {
          return false;
        }
        this.a(s.field_e, param2, (byte) 86, param1, param0, param5);
        var7 = 228 * param4 / 4096 + 456;
        if (param3 != 359) {
          this.b(100, 52);
        }
        for (var8 = 0; this.cushionSegments.length > var8; var8++) {
          var9 = this.cushionSegments[var8].startY - this.cushionSegments[var8].endY;
          var10 = this.cushionSegments[var8].endX - this.cushionSegments[var8].startX;
          var11_long = IterableNodeHashTable.a(param3 ^ -314, FullscreenFocusCanvas.multiplyFixedChecked((long)var9, (long)var9, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var10, (long)var10, false));
          if (-2147483648L > var11_long ||
            var11_long > 2147483647L) {
            System.out.println("Wall normal overflow " + lo.a(var11_long, 7697781));
          }
          boolean decompiledFrameRemainder0 = true;
          var9 = ArchiveProvider.divideFixed16((int)var11_long, (byte) -128, (long)var9);
          var10 = ArchiveProvider.divideFixed16((int)var11_long, (byte) -119, (long)var10);
          var11 = -NameEntryPopup.a(this.cushionSegments[var8].startX, false, var9) - NameEntryPopup.a(this.cushionSegments[var8].startY, false, var10);
          var12_long = (long)var11 + (FullscreenFocusCanvas.multiplyFixedChecked((long)var9, (long)s.field_e[0], false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var10, (long)s.field_e[1], false));
          var14 = FullscreenFocusCanvas.multiplyFixedChecked((long)var9, (long)s.field_e[9], false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var10, (long)s.field_e[10], false);
          if (var14 != 0L) {
            var16 = -var12_long / var14;
            if (-2147483648L <= var16 &&
              var16 <= 2147483647L) {
              if ((!(var16 < 0L)) &&
                (!(var16 > (long)var7))) {
                regionExit1: {
                  var18 = s.field_e[9] * (int)var16 + s.field_e[0];
                  var19_int = s.field_e[1] + s.field_e[10] * (int)var16;
                  var20 = s.field_e[2] + (int)var16 * s.field_e[11];
                  if (var10 != 0) {
                    if (this.cushionSegments[var8].startX >= this.cushionSegments[var8].endX) {
                      if (var18 < this.cushionSegments[var8].endX) {
                        break regionExit1;
                      }
                      if (var18 > this.cushionSegments[var8].startX) {
                        break regionExit1;
                      }
                    } else {
                      if (this.cushionSegments[var8].startX > var18) {
                        break regionExit1;
                      }
                      if (var18 > this.cushionSegments[var8].endX) {
                        break regionExit1;
                      }
                    }
                  }
                  if (var9 != 0) {
                    if (this.cushionSegments[var8].endY <= this.cushionSegments[var8].startY) {
                      if (this.cushionSegments[var8].endY > var19_int) {
                        break regionExit1;
                      }
                      if (this.cushionSegments[var8].startY < var19_int) {
                        break regionExit1;
                      }
                    } else {
                      if (var19_int < this.cushionSegments[var8].startY) {
                        break regionExit1;
                      }
                      if (this.cushionSegments[var8].endY < var19_int) {
                        break regionExit1;
                      }
                    }
                  }
                  if (var20 >= -1048576 &&
                    var20 <= 0) {
                    if (AccountContentDialog.field_ub != null) {
                      if (0L == (LinkButtonPainter.field_i & 16L)) {
                        return false;
                      }
                      ViewportController.a(ol.a(new int[]{var18, var19_int, var20}, (byte) 1), 16724753, -128, AccountContentDialog.field_ub.viewMatrix);
                    }
                    return false;
                  }
                }
                if (((AccountContentDialog.field_ub != null)) &&
                  ((0L != (16L & LinkButtonPainter.field_i)))) {
                  ViewportController.a(ol.a(new int[]{var18, var19_int, var20}, (byte) 1), 16764057, -79, AccountContentDialog.field_ub.viewMatrix);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              throw new IllegalStateException("Wall t overflow " + var16);
            }
          }
        }
        var8Lifetime1 = 4194304;
        for (var9Lifetime1 = 1; var9Lifetime1 < this.balls.length; var9Lifetime1++) {
          regionExit2: {
            if (this.balls[var9Lifetime1].inPlay) {
              var10Lifetime1 = -s.field_e[0] + this.balls[var9Lifetime1].positionX;
              var11Lifetime1 = -s.field_e[1] + this.balls[var9Lifetime1].positionY;
              var12 = -s.field_e[2] + this.balls[var9Lifetime1].positionZ;
              var13 = FullscreenFocusCanvas.multiplyFixedChecked((long)s.field_e[9], (long)s.field_e[9], false) + (FullscreenFocusCanvas.multiplyFixedChecked((long)s.field_e[10], (long)s.field_e[10], false) + FullscreenFocusCanvas.multiplyFixedChecked((long)s.field_e[11], (long)s.field_e[11], false));
              var15 = -2L * (FullscreenFocusCanvas.multiplyFixedChecked((long)s.field_e[9], (long)var10Lifetime1, false) - (-FullscreenFocusCanvas.multiplyFixedChecked((long)s.field_e[10], (long)var11Lifetime1, false) - FullscreenFocusCanvas.multiplyFixedChecked((long)s.field_e[11], (long)var12, false)));
              var17 = FullscreenFocusCanvas.multiplyFixedChecked((long)var10Lifetime1, (long)var10Lifetime1, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var11Lifetime1, (long)var11Lifetime1, false) - (-FullscreenFocusCanvas.multiplyFixedChecked((long)var12, (long)var12, false) + (long)var8Lifetime1);
              var19 = FullscreenFocusCanvas.multiplyFixedChecked(var15, var15, false) - 4L * FullscreenFocusCanvas.multiplyFixedChecked(var13, var17, false);
              if (var19 >= 0L) {
                var21 = IterableNodeHashTable.a(param3 ^ -278, var19);
                if (var21 <= 2147483647L &&
                  -2147483648L <= var21) {
                  var23 = (-var15 + var21) / var13 / 2L;
                  if (0L <= var23 &&
                    (long)var7 >= var23) {
                    var25 = (long)s.field_e[9] * var23 + (long)s.field_e[0];
                    var27 = (long)s.field_e[1] + var23 * (long)s.field_e[10];
                    var29 = (long)s.field_e[2] + var23 * (long)s.field_e[11];
                    if (null != AccountContentDialog.field_ub &&
                      (LinkButtonPainter.field_i & 16L) != 0L) {
                      ViewportController.a(ol.a(new int[]{(int)var25, (int)var27, (int)var29}, (byte) 1), 16724753, 112, AccountContentDialog.field_ub.viewMatrix);
                    }
                    return false;
                  }
                  var25 = (-var15 - var21) / var13 / 2L;
                  if (0L > var25) {
                    break regionExit2;
                  }
                  if ((long)var7 < var25) {
                    break regionExit2;
                  }
                  var27 = (long)s.field_e[0] + var25 * (long)s.field_e[9];
                  var29 = (long)s.field_e[10] * var25 + (long)s.field_e[1];
                  var31 = (long)s.field_e[11] * var25 + (long)s.field_e[2];
                  if (null != AccountContentDialog.field_ub &&
                    (LinkButtonPainter.field_i & 16L) != 0L) {
                    ViewportController.a(ol.a(new int[]{(int)var27, (int)var29, (int)var31}, (byte) 1), 16724753, param3 ^ -272, AccountContentDialog.field_ub.viewMatrix);
                  }
                  return false;
                }
                throw new IllegalStateException("Out of range: 0x" + Long.toString(var21, 16));
              }
            }
          }
        }
        return true;
    }

    private final void b(int param0, byte param1) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        Ball var10;
        var10 = this.balls[param0];
        if (param0 != 0) {
          return;
        }
        if (0L != (524288L & LinkButtonPainter.field_i)) {
          return;
        }
        var9 = this.currentShot(param1 ^ -23).ballInHandMode;
        if (var9 == 1) {
          if (524544 <= var10.positionY) {
            if (18349824 < var10.positionY) {
              var10.positionY = 18349824;
            }
          } else {
            var10.positionY = 524544;
          }
          if (var10.positionX >= 28311808) {
            if (37224192 < var10.positionX) {
              var10.positionX = 37224192;
            }
          } else {
            var10.positionX = 28311808;
          }
        } else {
          if (var9 != 3) {
            if (var10.positionX >= 524544) {
              if (var10.positionX > 37224192) {
                var10.positionX = 37224192;
              }
            } else {
              var10.positionX = 524544;
            }
            if (var10.positionY >= 524544) {
              if (var10.positionY > 18349824) {
                var10.positionY = 18349824;
              }
            } else {
              var10.positionY = 524544;
            }
          } else {
            if (var10.positionX > 9437184) {
              var10.positionX = 9437184;
            }
            var4 = -9437184 + var10.positionX;
            var5 = var10.positionY - 9437184;
            var6 = var4 >> 8;
            var7 = var5 >> 8;
            var8 = var6 * var6 + var7 * var7;
            if (var8 > 31690296) {
              var9 = rf.inverseSquareRoot(var8, -122);
              var10.positionY = (var5 / (var9 >> 8) << 8) + 9437184;
              var10.positionX = (var4 / (var9 >> 8) << 8) + 9437184;
            }
          }
        }
        if (param1 != -123) {
          this.a(-125);
        }
        return;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ShotRecord dupTemp$3 = null;
        ShotRecord dupTemp$4 = null;
        ShotRecord var6;
        ShotRecord var7;
        ShotRecord var8;
        if (param4 != 19063) {
          return;
        }
        regionExit1: {
          if (!this.shots.isEmpty(param4 - 19063)) {
            dupTemp$3 = this.currentShot(49);
            var7 = dupTemp$3;
            var6 = var7;
            if ((param2 & 255) == (dupTemp$3.shotNumber & 255)) {
              var7.playerIndex = param3;
              break regionExit1;
            }
          }
          dupTemp$4 = new ShotRecord(param2, param3);
          var8 = dupTemp$4;
          var6 = var8;
          this.shots.b((byte) -58, dupTemp$4);
          this.rules.initializeShot(var8, false);
        }
        this.field_A = param3;
        var6.breakSeed = param0;
        if (var6.breakSeed >= 0) {
          this.c(-95);
        }
        var6.field_I = param1;
        var6.stateBefore = this.writeStateSnapshot((byte) 98);
    }

    final void a(int param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          var3_int = param1.readUnsignedByte(-117);
          var4 = param1.readUnsignedByte(param0 ^ -113);
          var5 = param1.readShort((byte) -111);
          if (param0 != 2) {
            this.field_i = (IntrusiveDeque) null;
          }
          var6 = -1 + param1.readUnsignedByte(-119);
          this.a(var5, var6, var3_int, var4, 19063);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "al.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.currentShot(30).breakSeed = param0;
        this.c(-116);
        if (param1 != 456) {
          this.field_x = -45;
        }
    }

    final void stopAllBalls(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        if (param0 > -44) {
          return;
        }
        for (var2 = 0; var2 < this.balls.length; var2++) {
          this.balls[var2].stop((byte) 80);
        }
    }

    final void setGameType(int param0, byte param1) {
        int var3;
        var3 = param0;
        if (var3 != 0) {
          if (var3 == 1) {
            this.rules = (GameRules) ((Object) new NineBallRules(this));
          } else {
            if (var3 == 3) {
              this.rules = (GameRules) ((Object) new FreePlayRules(this));
            } else {
              if (var3 == 4) {
                this.rules = (GameRules) ((Object) new TimeTrialRules(this));
              } else {
                if (var3 == 2) {
                  this.rules = (GameRules) ((Object) new KillerRules(this));
                }
              }
            }
          }
        } else {
          this.rules = (GameRules) ((Object) new EightBallRules(this));
        }
        if (param1 > -115) {
          this.field_d = (int[]) null;
        }
    }

    final void e(int param0, int param1) {
        int var3;
        Ball var4;
        AimTarget var5;
        int var5_int;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        AimTarget var11;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        this.field_r = new AimTarget[this.balls.length + this.field_e.length];
        for (var3 = 0; this.balls.length > var3; var3++) {
          this.field_r[var3] = new AimTarget();
        }
        var3Lifetime1 = 0;
        if (param0 != 12226) {
          this.g((byte) 17);
        }
        while (this.field_e.length > var3Lifetime1) {
          this.field_r[this.balls.length + var3Lifetime1] = new AimTarget();
          var3Lifetime1++;
        }
        this.field_t = new int[this.field_r.length];
        this.field_a = new int[this.field_r.length];
        var4 = this.balls[param1];
        for (var3Lifetime2 = 0; var3Lifetime2 < this.balls.length; var3Lifetime2++) {
          this.field_r[var3Lifetime2].a(var3Lifetime2, true, true);
          if (this.field_r[var3Lifetime2].a((byte) -8, param1, this)) {
            this.field_r[var3Lifetime2].computeDistance(param0 + 1763061160, var4, this);
            this.field_a[var3Lifetime2] = this.field_r[var3Lifetime2].distance;
            this.field_t[var3Lifetime2] = var3Lifetime2;
          }
        }
        for (var3Lifetime3 = 0; this.field_e.length > var3Lifetime3; var3Lifetime3++) {
          var5_int = this.balls.length + var3Lifetime3;
          this.field_r[var5_int].a(var3Lifetime3, false, true);
          this.field_r[var5_int].computeDistance(1763073386, var4, this);
          this.field_a[var5_int] = this.field_r[var5_int].distance;
          this.field_t[var5_int] = var5_int;
        }
        StrongCacheEntry.a(this.field_a, this.field_t, (byte) -54);
        for (var3Lifetime4 = 0; this.field_r.length > var3Lifetime4; var3Lifetime4++) {
          var5 = this.field_r[this.field_t[var3Lifetime4]];
          if (var5.a((byte) -8, param1, this)) {
            var6 = var5.a(this, var4, -6661);
            var7 = var5.a(1048576);
            var8 = 8191 & -var7 + var6;
            var9 = 8191 & var6 + var7;
            var5.field_j = true;
            var10 = 0;
            scanLoop1: while (true) {
              if (var10 < var3Lifetime4) {
                boolean decompiledFrameRemainder0 = true;
                var11 = this.field_r[this.field_t[var10]];
                if (var11.a((byte) -8, param1, this)) {
                  if (var9 > var8) {
                    if (var11.field_k >= var11.field_d) {
                      if (var11.field_k >= var8 &&
                        var11.field_d <= var9) {
                        if (var11.field_k < var9) {
                          var9 = var11.field_k;
                        } else {
                          if (!(var8 >= var11.field_d)) {
                            var8 = var11.field_d;
                          }
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var5.field_j = false;
                        break scanLoop1;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      if (var11.field_k < var8 &&
                        var8 < var11.field_d &&
                        var11.field_k < var9 &&
                        var11.field_d > var9) {
                        var5.field_j = false;
                        break scanLoop1;
                      }
                      if (var11.field_k < var8 &&
                        var8 < var11.field_d) {
                        var8 = var11.field_d;
                      } else {
                        if (var9 > var11.field_k &&
                          var11.field_d > var9) {
                          var9 = var11.field_k;
                        }
                      }
                    }
                  } else {
                    if (var11.field_d > var11.field_k) {
                      if (var11.field_d <= var8) {
                        if (var9 > var11.field_k) {
                          var9 = var11.field_k;
                        }
                      } else {
                        var8 = var11.field_d;
                      }
                    } else {
                      if (var8 > var11.field_k &&
                        var9 < var11.field_d) {
                        var5.field_j = false;
                        break scanLoop1;
                      }
                      if (var11.field_d >= var9) {
                        if (var11.field_k > var8) {
                          var9 = var11.field_k;
                        }
                      } else {
                        var8 = var11.field_d;
                      }
                    }
                  }
                }
                var10++;
                continue;
              }
              break;
            }
            this.field_r[this.field_t[var3Lifetime4]].field_k = 8191 & -var7 + var6;
            this.field_r[this.field_t[var3Lifetime4]].field_d = 8191 & var7 + var6;
          }
        }
    }

    private final void allocateBalls(int param0, int param1) {
        int var3 = 0;
        if (this.balls != null &&
          this.balls.length == param1) {
          return;
        }
        this.balls = new Ball[param1];
        for (var3 = 0; var3 < this.balls.length; var3++) {
          this.balls[var3] = new Ball();
        }
        if (param0 != -14894) {
          this.field_m = true;
        }
    }

    final void c(int param0, int param1) {
        this.field_o = true;
        this.field_A = param1;
        if (param0 != -14286) {
          this.field_y = -45;
        }
    }

    final void i(byte param0) {
        int var3_int = 0;
        int var23 = Pool.field_O;
        ShotRecord var24 = this.currentShot(102);
        if (var24.phase != 1) {
          throw new IllegalStateException("Starting new shot, but not animating?");
        }
        if (null != var24.field_R) {
          var24.field_R.d((byte) 106);
        }
        var24.stateBefore = this.writeStateSnapshot((byte) 115);
        for (var3_int = 0; var3_int < this.balls.length; var3_int++) {
          this.balls[var3_int].field_c = 0;
          this.balls[var3_int].field_q = null;
        }
        if (param0 != -51) {
          PoolGameModel.a(true, 13);
        }
        this.rules.onShotStart(param0 ^ -11783);
        this.a(var24.cueBallY, var24.cueBallX, 72, 0, false);
        ShotRecord var3 = var24;
        Ball var4 = this.balls[0];
        int var5 = var3.field_D * var3.field_D + var3.field_H * var3.field_H;
        if (9216 < var5) {
          throw new IllegalStateException("Strike point out of range! " + var3.field_D + "," + var3.field_H);
        }
        int var6 = -rf.inverseSquareRoot(-(var5 << 2) + 65536, -121) >> 9;
        int var7 = ScrollPaneWithFooter.a((int) var3.elevation, true);
        int var8 = hc.a(2047, (int) var3.elevation);
        int var9 = ScrollPaneWithFooter.a((int) var3.aimAngle, true);
        int var10 = hc.a(2047, (int) var3.aimAngle);
        int var11 = var9;
        int var12 = -var10;
        int var13 = NameEntryPopup.a(var7, false, -var12);
        int var14 = NameEntryPopup.a(var7, false, var11);
        int var15 = var8;
        int var16 = 0 * var14 - var15 * var12 >> 16;
        int var17 = var15 * var11 - 0 * var13 >> 16;
        int var18 = -(var14 * var11) + var12 * var13 >> 16;
        int var19 = var6 * var13 + var3.field_D * var11 + var3.field_H * var16 >> 9;
        int var20 = var12 * var3.field_D + (var14 * var6 + var3.field_H * var17) >> 9;
        int var21 = 0 * var3.field_D + var6 * var15 + var18 * var3.field_H >> 9;
        var4.velocityX = ArchiveProvider.divideFixed16(PasswordValidator.field_q, (byte) -73, (long)(int)(FullscreenFocusCanvas.multiplyFixedChecked((long)(var3.power * var13), (long)CueAim.field_f, false) / 4096L));
        var4.velocityY = ArchiveProvider.divideFixed16(PasswordValidator.field_q, (byte) -108, (long)(int)(FullscreenFocusCanvas.multiplyFixedChecked((long)(var3.power * var14), (long)CueAim.field_f, false) / 4096L));
        var4.motionState = 1;
        int var22 = ArchiveProvider.divideFixed16(PasswordValidator.field_w, (byte) -116, (long)(int)(FullscreenFocusCanvas.multiplyFixedChecked((long)(var3.power * WireframeQuad.field_g), (long)CueAim.field_f, false) / 4096L));
        var4.angularVelocityX = NameEntryPopup.a(-NameEntryPopup.a(var14, false, var21), false, var22);
        var4.angularVelocityY = NameEntryPopup.a(NameEntryPopup.a(var13, false, var21), false, var22);
        var4.angularVelocityZ = NameEntryPopup.a(NameEntryPopup.a(var14, false, var19) - NameEntryPopup.a(var13, false, var20), false, var22);
        Ball.field_i = BufferedSocket.a(-6584, this.balls[0]);
    }

    final static void l(int param0) {
        if (GameRules.field_b == MatchingTextValidator.field_w) {
          return;
        }
        if (dn.a(true, MatchingTextValidator.field_w)) {
          s.field_c[MatchingTextValidator.field_w].onExit((byte) -6);
        }
        MatchingTextValidator.field_w = GameRules.field_b;
        if (ContextMenu.field_Sb) {
          AccountContentDialog.field_ub = null;
          TextWidgetPainter.field_e = null;
          ContextMenu.field_Sb = false;
        }
        ThemeSelectScreen.field_P = 0;
        TranslatedUiText.field_d = jc.field_c;
        int var1 = -44 % ((-83 - param0) / 40);
        if (lo.field_a) {
          ti.field_d = null;
          ArchiveIndex.field_l = new IntrusiveDeque();
          ClientException.field_g = ek.a(124);
          hp.field_c = ek.a(-110);
          lo.field_a = false;
        }
        if (l.field_a) {
          DialogLayer.a(true);
          mj.b(0);
          DialogLayer.l(-121);
          l.field_a = false;
        }
    }

    final void a(PacketBuffer param0, byte param1) {
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Pocket var5 = null;
        Ball var7 = null;
        int var8 = 0;
        int[] var9 = null;
        PacketBuffer var10 = null;
        int var4Lifetime1;
        var8 = Pool.field_O;
        try {
          this.b(2, param0);
          this.rules.a(param0, true);
          var3_int = param0.readUnsignedByte(-67);
          if (0 != var3_int) {
            if (var3_int == 1) {
              var10 = param0;
              this.allocateBalls(-14894, var10.readUnsignedByte(-95));
              for (var4 = 0; var4 < this.balls.length; var4++) {
                this.balls[var4].readState(var10, -1285);
              }
              for (var4Lifetime1 = 0; this.pockets.length > var4Lifetime1; var4Lifetime1++) {
                var5 = this.pockets[var4Lifetime1];
                var5.read((byte) 113, var10);
                if (var5.pottedBalls != null) {
                  for (var6 = 0; var5.pottedBalls.size((byte) 110) > var6; var6++) {
                    var7 = this.balls[var5.pottedBalls.get(var6, 2229)];
                    var7.positionY = var5.centerY;
                    var7.positionX = var5.centerX;
                    var7.transformDirty = true;
                  }
                }
              }
            }
          } else {
            this.b(param0.readUnsignedShort(-1034), 456);
          }
          if (param1 <= 98) {
            var9 = (int[]) null;
            this.loadTableOutline(false, (int[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("al.IA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int f(int param0) {
        int var3 = 0;
        int var2 = 1;
        int var3Lifetime1;
        for (var3 = param0; var3 < this.balls.length; var3++) {
          var2 = var2 + this.balls[var3].d(1);
        }
        int var4 = 0;
        var3Lifetime1 = var4;
        while (this.pockets.length > var4) {
          var2 = var2 + this.pockets[var4].a((byte) -119);
          var4++;
        }
        return var2;
    }

    final void k(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        System.out.println(this.balls.length + " balls");
        for (var2 = 0; var2 < this.balls.length; var2++) {
          System.out.print(Integer.toString(var2));
          System.out.print(": ");
          this.balls[var2].printState(0);
          System.out.println("");
        }
        System.out.println("pockets");
        int var3 = param0;
        var2Lifetime1 = var3;
        while (var3 < this.pockets.length) {
          System.out.print(Integer.toString(var3));
          System.out.print(": ");
          this.pockets[var3].print(true);
          System.out.println("");
          var3++;
        }
    }

    final void c(int param0) {
        int var2;
        int var3;
        ShotRecord var4;
        IsaacCipher var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        Ball var16;
        int var17;
        int[] var21;
        var2 = 9437184;
        var3 = 9437184;
        var4 = this.currentShot(25);
        if (param0 > -76) {
          return;
        }
        var21 = this.rules.a(var4.breakSeed, (byte) -32);
        if (var4.breakSeed < 0) {
          var4.breakSeed = ga.nextRandomInt(512, true, ea.field_r);
        }
        var6 = new IsaacCipher(new int[]{var4.breakSeed});
        var7 = 1;
        var8 = 1;
        var9 = 1;
        var10 = hc.a(2047, 170) * 16;
        do {
          var11 = 0;
          scanLoop1: while (true) {
            if (var11 < var7) {
              if (var21[var9] != -1) {
                var12 = var6.a(23165, 65536);
                var13 = var6.a(23165, 65536);
                var14 = 524288 * var12 / 65536 / 96;
                var15 = var13 * 524288 / 65536 / 96;
                var16 = this.balls[var21[var9]];
                var16.positionX = var2 + var14;
                var16.positionZ = -524288;
                var16.positionY = var11 * 34603008 / 32 + var3 + var15;
                var16.orientation.x = var6.a(23165, 65536);
                var16.orientation.y = var6.a(23165, 65536);
                var16.orientation.z = var6.a(23165, 65536);
                var16.orientation.w = var6.a(23165, 65536);
                var16.orientation.normalise(true);
                var16.inPlay = true;
                var16.transformDirty = true;
                var16.field_o = false;
                var16.stop((byte) -27);
                var8++;
                if (var8 >= this.balls.length) {
                  break scanLoop1;
                }
              }
              var9++;
              var11++;
              continue;
            }
            break;
          }
          var7++;
          var3 = var3 - 540672;
          var2 = var2 - 33 * var10 / 32;
        } while (this.balls.length > var8);
        var17 = 0;
        var11 = var17;
        while (var17 < this.pockets.length) {
          this.pockets[var17].keepOnlyPottedBalls(this.balls, -94);
          var17++;
        }
        if (-1 == var4.cueBallX ||
          var4.cueBallY == -1) {
          this.a(63, var6);
        }
        this.rules.l(-127);
        return;
    }

    private final int o(int param0) {
        IntrusiveNode stackIn_10_0 = null;
        int var2;
        int var3;
        IntrusiveDequeCursor var4;
        ShotRecord var5;
        IntrusiveDequeCursor var6;
        dn var7;
        ShotRecord var5Lifetime1;
        var2 = this.shots.a(32);
        var3 = 4;
        if (param0 != 12850) {
          this.allocateBalls(127, -64);
        }
        if (var2 > 0) {
          var2 = 0;
          var4 = new IntrusiveDequeCursor(this.shots);
          var5 = (ShotRecord) (var4.first(0));
          while (var5 != null) {
            if (var2 < 3) {
              var2++;
              var5 = (ShotRecord) (var4.next((byte) -71));
              continue;
            }
            break;
          }
          if (var5 == null) {
            stackIn_10_0 = var4.last((byte) -92);
          } else {
            stackIn_10_0 = var4.a(var5.previous, false);
          }
          var5Lifetime1 = (ShotRecord) (stackIn_10_0);
          while (var5Lifetime1 != null) {
            var3 += 16;
            if (1 <= var5Lifetime1.phase) {
              var3 += 8;
            }
            if (var5Lifetime1.phase >= 2) {
              var3++;
              var3 = var3 + var5Lifetime1.pottedBalls.a(param0 ^ 12801);
              var3++;
              if (var5Lifetime1.field_R != null &&
                !var5Lifetime1.field_R.isEmpty(0)) {
                var6 = new IntrusiveDequeCursor(var5Lifetime1.field_R);
                var7 = (dn) (var6.last((byte) -92));
                while (var7 != null) {
                  var3 += 2;
                  var3 = var3 + var7.field_l.length;
                  var7 = (dn) (var6.previous(-112));
                }
              }
              var3 += 3;
            }
            if (var5Lifetime1.phase >= 3) {
              var3++;
            }
            var5Lifetime1 = (ShotRecord) (var4.previous(-84));
          }
        }
        return var3;
    }

    final int a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_2 = 0;
        if (param0 != -1) {
          field_B = (BallSkin[]) null;
        }
        stackIn_5_0 = this.o(param0 + 12851);
        stackIn_5_1 = this.rules.m(param0 + 1) + 1;
        if (this.currentShot(81).breakSeed >= 0 &&
          this.currentShot(65).phase == 0) {
          stackIn_7_2 = 2;
        } else {
          stackIn_7_2 = this.f(param0 + 1);
        }
        return stackIn_5_0 + (stackIn_5_1 + stackIn_7_2);
    }

    final static void a(boolean param0, int param1) {
        int var6 = 0;
        UiComponent dupTemp$0 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        UiComponent stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_7_5 = 0;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        UiComponent var7 = null;
        int var7_int = 0;
        int var8 = 0;
        UiComponent var8_ref_vh = null;
        AlignedIconLabel var9 = null;
        int var9_int = 0;
        AlignedIconLabel var10 = null;
        int var10_int = 0;
        int var12 = 0;
        int var13 = 0;
        UiComponent var14 = null;
        int var15 = 0;
        var13 = Pool.field_O;
        try {
          fr.field_s = SoftwareRasterizer.width;
          f.field_h = SoftwareRasterizer.height;
          stackIn_3_0 = -127;
          if (param0) {
            stackIn_4_1 = PoolMatchController.field_z;
          } else {
            stackIn_4_1 = nj.field_b;
          }
          fr.$cfr$intArgs$a$e9dea5688aa5(stackIn_3_0, stackIn_4_1);
          na.field_e.a(-40 + so.field_k.height - 2, so.field_k.width, 0, 0, (byte) -114);
          MarkerSliderPainter.field_c.setBounds(0, 2147483647, 0, cl.field_d.width, ArchiveIndex.field_x);
          stackIn_6_0 = LoginRequiredScreen.field_M;
          stackIn_6_1 = 2 + ArchiveIndex.field_x;
          stackIn_6_2 = param1 ^ 2147483647;
          stackIn_6_3 = 0;
          stackIn_6_4 = cl.field_d.width;
          if (!tq.field_p) {
            stackIn_7_5 = 0;
          } else {
            stackIn_7_5 = 2 + (2 + TranslatedUiText.field_n) + 40;
          }
          ((UiComponent) (Object) stackIn_6_0).setBounds(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4 - stackIn_7_5, 18);
          jh.field_a.setBounds(ArchiveIndex.field_x + 2, 2147483647, -2 + (-TranslatedUiText.field_n + cl.field_d.width - 40), TranslatedUiText.field_n + 42, 18);
          DualLinkDeque.field_f.setScrollPaneBounds(TranslatedUiText.field_n, -22 + (cl.field_d.height - ArchiveIndex.field_x), (byte) -112, 2, cl.field_d.width, 0, ArchiveIndex.field_x + 22);
          ContentTransitionDialog.field_ob.setBounds(so.field_k.height - 40, 2147483647, 0, so.field_k.width, 40);
          ii.field_e.setBounds(0, param1 ^ 2147483647, 0, Bzip2DecoderState.field_f.width, 30);
          MusicCrossfadeStream.field_x.setBounds(30, 2147483647, 0, Bzip2DecoderState.field_f.width, -30 + (-2 + Bzip2DecoderState.field_f.height) - 40);
          var2_int = dr.field_c + 3;
          if (dg.field_T.length < 2) {
            var2_int--;
          }
          if (param0) {
            var2_int--;
          }
          var3 = (-8 + (MusicCrossfadeStream.field_x.height - 10 + (var2_int + 1) / 2)) / (var2_int + 1) - 2;
          if (30 < var3) {
            var3 = 30;
          }
          var4 = -5 + (MusicCrossfadeStream.field_x.height - (5 + var2_int * (2 + var3)));
          if (var4 > 40) {
            var4 = 40;
          }
          oi.field_q.setBounds(5, 2147483647, 5, -5 + MusicCrossfadeStream.field_x.width - 5, var4);
          var5 = 5 + var4 + 2;
          for (var6 = param1; var6 < 4 + dr.field_c; var6++) {
            if ((var6 != 1 ||
              !(dg.field_T.length < 2)) && (var6 != 3 ||
              !(ji.field_g <= 1))) {
              if (!param0 &&
                var6 == 3) {
                dupTemp$0 = oi.field_v[var6];
                var14 = dupTemp$0;
                var7 = dupTemp$0;
                oi.field_v[var6].height = 0;
                var14.width = 0;
                for (var8 = 0; FreePlayRules.field_f[var6].length > var8; var8++) {
                  if (null != FreePlayRules.field_f[var6][var8]) {
                    var9 = FreePlayRules.field_f[var6][var8];
                    FreePlayRules.field_f[var6][var8].height = 0;
                    var9.width = 0;
                  }
                }
              } else if (param0 &&
                0 == var6) {
                var7 = oi.field_v[var6];
                oi.field_v[var6].height = 0;
                var7.width = 0;
                for (var8 = 0; var8 < FreePlayRules.field_f[var6].length; var8++) {
                  if (null != FreePlayRules.field_f[var6][var8]) {
                    var9 = FreePlayRules.field_f[var6][var8];
                    FreePlayRules.field_f[var6][var8].height = 0;
                    var9.width = 0;
                  }
                }
              } else {
                if (param0) {
                  if (var6 >= 4) {
                    if (null != PlasmaBallSkin.field_p) {
                      stackIn_41_0 = (PlasmaBallSkin.field_p[-4 + var6]) ? 1 : 0;
                    } else {
                      stackIn_41_0 = 0;
                    }
                  } else {
                    stackIn_41_0 = 0;
                  }
                } else {
                  stackIn_41_0 = 0;
                }
                var7_int = stackIn_41_0;
                if (var7_int != 0) {
                  var8_ref_vh = oi.field_v[var6];
                  oi.field_v[var6].height = 0;
                  var8_ref_vh.width = 0;
                  var15 = 0;
                  var9_int = var15;
                  while (var15 < FreePlayRules.field_f[var6].length) {
                    if (FreePlayRules.field_f[var6][var15] != null) {
                      var10 = FreePlayRules.field_f[var6][var15];
                      FreePlayRules.field_f[var6][var15].height = 0;
                      var10.width = 0;
                    }
                    var15++;
                  }
                } else {
                  oi.field_v[var6].setBounds(var5, 2147483647, 5, 103, var3);
                  var8 = 110;
                  if (!param0) {
                    if (null != FreePlayRules.field_f[var6][0]) {
                      var9 = FreePlayRules.field_f[var6][0];
                      FreePlayRules.field_f[var6][0].height = 0;
                      var9.width = 0;
                    }
                  } else {
                    FreePlayRules.field_f[var6][0].setIconLabelBounds(var8, true, 2, var3, ja.field_b, 38, var5);
                    var8 += 40;
                  }
                  var9_int = 2 - var8 + (-5 + Bzip2DecoderState.field_f.width);
                  var10_int = FreePlayRules.field_f[var6].length - 1;
                  for (var11 = 0; var11 < var10_int; var11++) {
                    var12 = var11 * var9_int / var10_int;
                    FreePlayRules.field_f[var6][1 + var11].setIconLabelBounds(var12 + var8, true, 2, var3, ja.field_b, -2 + ((var11 + 1) * var9_int / var10_int - var12), var5);
                  }
                  var5 = var5 + (2 + var3);
                }
              }
            }
          }
          de.field_b.setBounds(10, 2147483647, SoftwareRasterizer.width - 360 >> 1, 360, -134 + SoftwareRasterizer.height - 10);
          Pool.field_P.setBounds(0, 2147483647, 0, de.field_b.width, 24);
          IntrusiveDequeCursor.field_b.setBounds(24, 2147483647, 0, de.field_b.width, -24 + de.field_b.height);
          IntrusiveDequeCursor.field_b.frameSprites = rp.buildNineSliceFrameSprites(32450, 3, 1, IntrusiveDequeCursor.field_b.height, 11579568, 8421504);
          c.field_e.setBounds(5, 2147483647, 5, -10 + IntrusiveDequeCursor.field_b.width, -2 + (-24 + (-10 + IntrusiveDequeCursor.field_b.height)));
          AccountContentDialog.field_vb.setBounds(-24 + (IntrusiveDequeCursor.field_b.height - 5), param1 ^ 2147483647, (-80 + IntrusiveDequeCursor.field_b.width) / 2, 80, 24);
          da.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "al.OA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 <= 68) {
          this.field_x = 56;
        }
        return !this.balls[0].inPlay ? true : false;
    }

    final void c(byte param0) {
        int var6 = 0;
        int var8 = 0;
        ShotRecord var2;
        ShotRecord var3;
        PacketBuffer var4;
        int var5;
        Pocket var7;
        Ball var9;
        int var10;
        int var5Lifetime1;
        var10 = Pool.field_O;
        if (this.currentShot(41).phase != 0) {
          return;
        }
        if (this.shots.c((byte) 113) == this.shots.a((byte) -127)) {
          return;
        }
        var2 = (ShotRecord) (this.shots.removeLast(-1));
        var3 = (ShotRecord) (this.shots.a((byte) -127));
        var3.stateBefore.position = 0;
        var4 = var3.stateBefore;
        this.allocateBalls(-14894, var4.readUnsignedByte(-65));
        for (var5 = 0; var5 < this.balls.length; var5++) {
          this.balls[var5].readState(var4, -1285);
        }
        var5Lifetime1 = 89 % ((41 - param0) / 37);
        for (var6 = 0; this.pockets.length > var6; var6++) {
          var7 = this.pockets[var6];
          var7.read((byte) 113, var4);
          if (null != var7.pottedBalls) {
            for (var8 = 0; var7.pottedBalls.size((byte) 101) > var8; var8++) {
              var9 = this.balls[var7.pottedBalls.get(var8, 2229)];
              var9.positionY = var7.centerY;
              var9.transformDirty = true;
              var9.positionX = var7.centerX;
            }
          }
        }
        var3.phase = 0;
        var3.pottedBalls.d((byte) 83);
        var3.endResolution = IntrusiveNodeHashTable.field_a;
        if (null == this.field_i) {
          this.field_i = new IntrusiveDeque();
        }
        this.field_i.a((byte) -84, var2);
        return;
    }

    final void g(byte param0) {
        ShotRecord stackIn_7_0 = null;
        int stackIn_8_1 = 0;
        ShotRecord var3;
        IntrusiveDequeCursor var4_ref_aa;
        int var4;
        PotEvent var5;
        Pocket var6;
        ShotRecord var7;
        qa.a(this.field_e, this.cushionSegments, this.balls, 0);
        var7 = this.currentShot(79);
        if (param0 > -2) {
          return;
        }
        if (var7.field_n == -1) {
          var7.field_n = NodeHashTableIterator.field_s;
        }
        this.potBallsInPockets(6582, this.balls, this.currentShot(110));
        stackIn_7_0 = var7;
        stackIn_8_1 = (!this.allBallsStopped(0)) ? 1 : 2;
        stackIn_7_0.phase = stackIn_8_1;
        var3 = this.currentShot(60);
        this.field_j = 0;
        if (!var3.pottedBalls.isEmpty(0)) {
          var4_ref_aa = new IntrusiveDequeCursor(var3.pottedBalls);
          var5 = (PotEvent) (var4_ref_aa.first(0));
          while (var5 != null) {
            var6 = this.pockets[var5.pocketIndex];
            if (var6.containsBall(var5.ballIndex, 304)) {
              break;
            }
            var6.addBall(var5.ballIndex, 75);
            this.field_j = this.field_j + 1;
            var5 = (PotEvent) (var4_ref_aa.next((byte) -71));
          }
        }
        var4 = var7.phase;
        if (0 == var4) {
          throw new IllegalStateException();
        }
        if (1 != var4 &&
          2 == var4) {
          var7.c(2, this.rules.a((byte) 121));
        }
        return;
    }

    final static void m(int param0) {
        DebugTuningSlider.d((byte) -125);
        lf.a(param0, (byte) 93);
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6;
        Ball var7;
        int var8;
        int var9;
        int var10;
        int var6Lifetime1;
        int var10Lifetime1;
        var6 = 0;
        var7 = this.balls[param3];
        var8 = var7.positionX;
        var7.positionX = param1;
        var9 = var7.positionY;
        var7.positionY = param0;
        var7.inPlay = true;
        var7.field_o = false;
        var7.stop((byte) -58);
        var7.transformDirty = true;
        if (param4) {
          this.b(param3, (byte) -123);
        }
        var6Lifetime1 = 0;
        this.findOverlappingBalls((byte) 77);
        for (var10 = 0; hh.field_e > var10; var10++) {
          if (param3 != DropTargetWidget.field_N[var10][0]) {
            if (param3 == DropTargetWidget.field_N[var10][1]) {
              var6Lifetime1++;
            }
          } else {
            var6Lifetime1++;
          }
        }
        if (var6Lifetime1 == 0) {
          var7.transformDirty = true;
          return true;
        }
        var7.positionX = var8;
        var7.positionY = var9;
        var10Lifetime1 = 87 / ((param2 + 1) / 34);
        return false;
    }

    private final void a(int param0, IsaacCipher param1) {
        ShotRecord var3 = null;
        ShotRecord var4 = null;
        Object var5 = null;
        Ball var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.a(9437184, 28311552, param1, -30896, 0, 4096);
          var3 = this.currentShot(97);
          var3.ballInHandMode = this.rules.initialBallInHandMode(false);
          var4 = var3;
          var5 = this;
          var6 = ((PoolGameModel) (var5)).balls[0];
          var4.cueBallX = var6.positionX;
          var4.cueBallY = var6.positionY;
          if (param0 < 34) {
            this.k(50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("al.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void i(int param0) {
        field_k = new UiComponent(0L, (UiComponent) null, SoftwareRasterizer.width - ff.field_e[4].field_z >> 1, -120 + SoftwareRasterizer.height, ff.field_e[4].field_z, SoftwareRasterizer.height, (String) null);
        MenuSelection.a(true, field_k);
        field_k.frameSprites = ff.field_e;
        qa.field_v = new UiComponent("tut_close", (UiComponent) null);
        UiComponent dupTemp$0 = new UiComponent("tut_skip", (UiComponent) null);
        jq.field_d = dupTemp$0;
        field_k.addChild(-111, dupTemp$0);
        UiComponent dupTemp$1 = new UiComponent("tut_prev", (UiComponent) null);
        pl.field_b = dupTemp$1;
        field_k.addChild(-104, dupTemp$1);
        pl.field_b.setBounds(72, 2147483647, 277, 15, 15);
        qa.field_v.setBounds(72, 2147483647, 297, 15, 15);
        jq.field_d.setBounds(72, 2147483647, 317, 15, 15);
        pl.field_b.activeSprite = vm.field_d[8];
        pl.field_b.capturedSprite = vm.field_d[12];
        pl.field_b.sprite = vm.field_d[4];
        pl.field_b.disabledSprite = vm.field_d[0];
        qa.field_v.disabledSprite = vm.field_d[2];
        qa.field_v.capturedSprite = vm.field_d[14];
        if (param0 != -27397) {
          return;
        }
        qa.field_v.sprite = vm.field_d[6];
        qa.field_v.activeSprite = vm.field_d[10];
        jq.field_d.activeSprite = vm.field_d[11];
        jq.field_d.sprite = vm.field_d[7];
        jq.field_d.capturedSprite = vm.field_d[15];
        jq.field_d.disabledSprite = vm.field_d[3];
    }

    final void a(int[] param0, int param1, byte param2, int param3, int param4, int param5) {
        int var14_int = 0;
        int var7_int = ScrollPaneWithFooter.a(param1, true);
        int var8 = hc.a(2047, param1);
        int var9 = ScrollPaneWithFooter.a(param3, true);
        int var10 = hc.a(2047, param3);
        param0[9] = NameEntryPopup.a(var10, false, var7_int);
        param0[10] = NameEntryPopup.a(var9, false, var7_int);
        param0[3] = var9;
        param0[5] = 0;
        param0[4] = -var10;
        param0[11] = var8;
        param0[6] = NameEntryPopup.a(param0[5], false, param0[10]) - NameEntryPopup.a(param0[4], false, param0[11]);
        param0[7] = NameEntryPopup.a(param0[3], false, param0[11]) - NameEntryPopup.a(param0[5], false, param0[9]);
        param0[8] = NameEntryPopup.a(param0[4], false, param0[9]) - NameEntryPopup.a(param0[3], false, param0[10]);
        int var11 = param5 * 65536 / 128;
        int var12 = 53 / ((param2 + 17) / 58);
        int var13 = param4 * 65536 / 128;
        try {
          var14_int = rf.inverseSquareRoot(-NameEntryPopup.a(var11, false, var11) + (65536 - NameEntryPopup.a(var13, false, var13)), -122);
          param0[0] = this.balls[0].positionX + (NameEntryPopup.a(param0[3], false, var11) + (NameEntryPopup.a(param0[6], false, var13) + NameEntryPopup.a(param0[9], false, var14_int))) * 8;
          param0[1] = this.balls[0].positionY + 8 * (NameEntryPopup.a(param0[4], false, var11) + NameEntryPopup.a(param0[7], false, var13) + NameEntryPopup.a(param0[10], false, var14_int));
          param0[2] = this.balls[0].positionZ + (NameEntryPopup.a(param0[5], false, var11) + NameEntryPopup.a(param0[8], false, var13) + NameEntryPopup.a(param0[11], false, var14_int)) * 8;
        } catch (IllegalArgumentException illegalArgumentException) {
          System.out.println("Oh dear. Strike point is way wrong: " + param5 + "," + param4 + ":\n" + illegalArgumentException.getMessage());
          throw illegalArgumentException;
        }
    }

    private final void h(byte param0) {
        this.loadTableOutline(true, new int[]{2, 18, 0, 2, 260, 0, 1, 272, -15, 1, 304, -15, 2, 316, 0, 2, 558, 0, 1, 584, -22, 1, 598, -8, 2, 576, 18, 2, 576, 270, 1, 598, 296, 1, 584, 310, 2, 558, 288, 2, 316, 288, 1, 304, 303, 1, 272, 303, 2, 260, 288, 2, 18, 288, 1, -8, 310, 1, -22, 296, 2, 0, 270, 2, 0, 18, 1, -22, -8, 1, -8, -22});
        if (param0 != -58) {
          this.a(95);
        }
    }

    PoolGameModel(int param0, int param1, String[] param2, int param3) {
        ShotRecord var5 = null;
        this.field_y = 0;
        this.field_z = 0;
        this.field_m = false;
        this.shots = new IntrusiveDeque();
        this.field_r = null;
        this.field_t = null;
        this.field_a = null;
        try {
          this.field_q = param0;
          this.playerCount = param2.length;
          this.field_A = param3;
          this.field_h = param2;
          this.setGameType(param1, (byte) -128);
          this.allocateBalls(-14894, this.rules.ballCount(26840));
          this.h((byte) -58);
          this.createPockets(10571);
          var5 = new ShotRecord();
          this.shots.b((byte) -60, var5);
          var5.playerIndex = this.field_A;
          this.b(ga.nextRandomInt(512, true, ea.field_r) + 1, 456);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "al.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_g = new int[8192];
    }
}
