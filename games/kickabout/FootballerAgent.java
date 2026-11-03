/*
 * Decompiled by CFR-JS 0.4.0.
 */
class FootballerAgent extends MatchAgent {
    int directionY;
    private int field_g;
    int aiWait;
    int archetype;
    int height;
    int field_x;
    int field_h;
    int verticalVelocity;
    int directionX;
    boolean field_O;
    int field_r;
    int field_z;
    static int field_p;
    int dashCooldown;
    int field_o;
    private int field_D;
    int positionX;
    boolean member;
    private int field_A;
    int directionMask;
    boolean megamode;
    int field_m;
    int field_B;
    int positionY;
    int field_q;
    private int field_t;
    boolean field_s;
    PlayerStats stats;
    static IntrusiveDeque field_f;
    int field_P;
    int action;
    int controllingParticipant;
    int actionTime;
    int field_k;
    static BitmapFont field_i;

    final boolean isMovingDiagonally(boolean param0) {
        if (param0) {
          this.actionTime = -114;
        }
        return (3 & (this.directionMask >> 2 ^ this.directionMask)) == 3 ? true : false;
    }

    public static void e(byte param0) {
        field_i = null;
        field_f = null;
        if (param0 > -49) {
          FootballerAgent.a(true, (byte) -47);
        }
    }

    final boolean e(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 292603688) {
          this.field_z = -70;
        }
        stackIn_7_0 = ((3 & (this.directionMask >> 2 ^ this.directionMask)) != 0) || (this.action == 4);
        return stackIn_7_0;
    }

    void stepMovement(int param0, PlayArea[] param1, boolean param2, boolean param3) {
        boolean stackIn_6_1 = false;
        int stackIn_22_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var8Lifetime1;
        int var7Lifetime7;
        var9 = Kickabout.field_G;
        try {
          if (this.dashCooldown > 0) {
            this.dashCooldown = this.dashCooldown - 1;
          }
          stackIn_6_1 = (param2);
          this.megamode = stackIn_6_1;
          if (this.action != 0) {
            this.actionTime = this.actionTime - 1;
          }
          var5_int = 0;
          var6 = 0;
          if (3 == this.action ||
            this.action == 12 ||
            this.action == 13) {
            if (!this.field_s) {
              if (this.stats.a((byte) 44, this.member) &&
                this.directionMask != 0) {
                this.setDirectionFromMask(this.directionMask, param0 ^ 26212);
                if (this.directionY != 0 &&
                  this.directionX != 0) {
                  stackIn_22_0 = this.field_D;
                } else {
                  stackIn_22_0 = this.field_q;
                }
                var7 = stackIn_22_0;
                this.field_m = this.directionY * var7;
                this.field_k = this.directionX * var7;
              }
              var7Lifetime7 = this.field_k;
              var8 = this.field_m;
              if (this.megamode) {
                var7Lifetime7 = var7Lifetime7 << 1;
                var8 = var8 << 1;
              }
              var5_int = var7Lifetime7;
              var6 = var8;
            } else {
              var5_int = this.field_r;
              var6 = this.field_B;
            }
          }
          if (this.action == 5) {
            var7Lifetime1 = -(this.field_o << 14) + 327680;
            if (this.field_t - var7Lifetime1 > this.positionX) {
              var5_int = var7Lifetime1;
            }
            if (this.field_t + var7Lifetime1 < this.positionX) {
              var5_int = -var7Lifetime1;
            }
          }
          if (param0 == this.action) {
            this.setDirectionFromMask(this.field_h, 26214);
          }
          if (this.action == 4) {
            if (this.directionY != 0 &&
              this.directionX != 0) {
              stackIn_40_0 = this.field_g;
            } else {
              stackIn_40_0 = this.field_A;
            }
            var7Lifetime2 = stackIn_40_0 << 1;
            if (this.stats.b(this.member, 100)) {
              this.setDirectionFromMask(this.directionMask, 26214);
            }
            var6 = var7Lifetime2 * this.directionY;
            var5_int = var7Lifetime2 * this.directionX;
          }
          stackIn_46_0 = (this.action != 0) ? 0 : 1;
          var7Lifetime3 = stackIn_46_0;
          stackIn_48_0 = var7Lifetime3;
          if (this.action != 1) {
            stackIn_49_1 = 0;
          } else {
            stackIn_49_1 = 1;
          }
          var7Lifetime4 = stackIn_48_0 | stackIn_49_1;
          stackIn_51_0 = var7Lifetime4;
          if (this.action != 11) {
            stackIn_52_1 = 0;
          } else {
            stackIn_52_1 = 1;
          }
          var7Lifetime5 = stackIn_51_0 | stackIn_52_1;
          stackIn_54_0 = var7Lifetime5;
          if (this.action != 14) {
            stackIn_55_1 = 0;
          } else {
            stackIn_55_1 = 1;
          }
          var7Lifetime6 = stackIn_54_0 | stackIn_55_1;
          if (var7Lifetime6 != 0 &&
            this.e(292603688)) {
            if (!this.isMovingDiagonally(false)) {
              stackIn_60_0 = this.field_A;
            } else {
              stackIn_60_0 = this.field_g;
            }
            var8Lifetime1 = stackIn_60_0;
            if (this.megamode) {
              var8Lifetime1 = var8Lifetime1 * 5 >> 2;
            }
            if (param3) {
              var8Lifetime1 = 9 * var8Lifetime1 / 10;
            }
            this.setDirectionFromMask(this.directionMask, 26214);
            if (this.action == 14) {
              var8Lifetime1 = 73728;
            }
            if (1 == this.action) {
              if (!this.stats.c(this.member, (byte) -62)) {
                var8Lifetime1 = var8Lifetime1 >> 2;
              } else {
                var8Lifetime1 = var8Lifetime1 >> 1;
              }
            }
            if (this.action == 11) {
              var8Lifetime1 = MenuButton.field_q[this.stats.archetype] * 3 >> 1;
              if (this.isMovingDiagonally(false)) {
                var8Lifetime1 = var8Lifetime1 * 181 >> 8;
              }
            }
            var6 = this.directionY * var8Lifetime1;
            var5_int = var8Lifetime1 * this.directionX;
          }
          var13 = lt.moveWithinAreas(var5_int, var6, param1, -61, this.height, this.positionY, this.positionX, this.verticalVelocity);
          this.positionY = var13[1];
          this.positionX = var13[0];
          this.height = var13[2];
          if (this.verticalVelocity != var13[5]) {
            if (this.verticalVelocity <= 0 &&
              var13[5] >= 0) {
              this.height = 0;
              this.verticalVelocity = 0;
            } else {
              this.verticalVelocity = var13[5];
            }
          }
          if (this.height != 0) {
            this.verticalVelocity = this.verticalVelocity - 26214;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_91_0 = var5;
          stackIn_91_1 = new StringBuilder().append("nl.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_91_0), ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        int var9 = 0;
        int var3 = this.stats.effectivePower(this.member, param1 ^ -68);
        int var4 = var3 * 14 / 100;
        if (param1 != -68) {
          FootballerAgent.e((byte) 48);
        }
        int var5 = -var4 + 14;
        int var6 = this.chargeKickDuration((byte) -99);
        param0 = (var5 + param0) % var6;
        int var7 = var6 >> 1;
        int var8 = var7 < param0 ? -param0 + var6 : param0;
        if (var5 > var8) {
          return 0;
        }
        if (-var4 + var7 >= var8) {
          var9 = (var8 - var5 << 8) / (var7 - (var5 + var4));
          return var9;
        }
        return 256;
    }

    final int computeChecksum(byte param0) {
        int var2 = this.stats.computeChecksum(0);
        var2 = fj.a(-40, var2 ^ this.field_A);
        var2 = fj.a(-40, this.field_g ^ var2);
        var2 = fj.a(-40, var2 ^ this.field_q);
        var2 = fj.a(-40, var2 ^ this.field_D);
        var2 = fj.a(-40, var2 ^ this.positionX);
        if (param0 > -61) {
          this.setAction((byte) -7, -29);
        }
        var2 = fj.a(-40, this.positionY ^ var2);
        var2 = fj.a(-40, var2 ^ this.height);
        var2 = fj.a(-40, var2 ^ this.verticalVelocity);
        var2 = fj.a(-40, this.aiWait ^ var2);
        var2 = fj.a(-40, var2 ^ this.field_o);
        var2 = fj.a(-40, var2 ^ this.field_t);
        var2 = fj.a(-40, this.directionMask ^ var2);
        var2 = fj.a(-40, this.field_h ^ var2);
        var2 = fj.a(-40, var2 ^ this.directionX);
        var2 = fj.a(-40, var2 ^ this.directionY);
        var2 = fj.a(-40, var2 ^ this.action);
        var2 = fj.a(-40, this.actionTime ^ var2);
        var2 = fj.a(-40, this.dashCooldown ^ var2);
        var2 = fj.a(-40, var2 ^ this.field_z);
        var2 = fj.a(-40, this.field_x ^ var2);
        var2 = fj.a(-40, this.field_P ^ var2);
        var2 = fj.a(-40, var2 ^ (!this.field_O ? 0 : 1));
        var2 = fj.a(-40, var2 ^ this.field_k);
        var2 = fj.a(-40, var2 ^ this.field_m);
        var2 = fj.a(-40, var2 ^ (!this.field_s ? 0 : 1));
        var2 = fj.a(-40, var2 ^ this.field_r);
        var2 = fj.a(-40, var2 ^ this.field_B);
        var2 = fj.a(-40, this.archetype ^ var2);
        var2 = fj.a(-40, var2 ^ (this.member ? 1 : 0));
        var2 = fj.a(-40, var2 ^ (this.megamode ? 1 : 0));
        return var2;
    }

    final int pixelY(boolean param0) {
        if (!param0) {
          this.field_q = 85;
        }
        return this.positionY >> 16;
    }

    final void readFullState(int param0, CipherPacketBuffer param1) {
        try {
          this.positionX = param1.l(26, param0 ^ -13927);
          this.positionY = param1.l(27, 59);
          this.height = hq.a(22531, 30, param1, 0);
          this.verticalVelocity = BufferedCacheFile.a((byte) 125, 17, param1, 0, 24, 25);
          this.directionMask = param1.l(4, 59);
          this.directionY = param1.l(2, 59) - 1;
          this.directionX = -1 + param1.l(2, param0 + 13977);
          this.action = hq.a(param0 ^ -28255, WriteIntegersCommand.a(14, false), param1, 0);
          this.actionTime = hq.a(22531, 8, param1, 0);
          this.dashCooldown = hq.a(22531, 9, param1, 0);
          this.aiWait = param1.l(3, param0 ^ -13927);
          this.field_O = ContentTransitionDialog.a(param1, (byte) -39);
          this.field_s = ContentTransitionDialog.a(param1, (byte) -39);
          this.field_k = mk.a(param1, 30, (byte) 6, 18);
          this.field_m = mk.a(param1, 30, (byte) 6, 18);
          this.field_r = mk.a(param1, 30, (byte) 6, 18);
          this.field_B = mk.a(param1, 30, (byte) 6, 18);
          this.field_h = param1.l(4, 59);
          this.field_z = param1.l(9, 59) - 5;
          this.field_x = IsaacRandom.a(11, -30273, param1);
          if (param0 != -13918) {
            CipherPacketBuffer var4 = (CipherPacketBuffer) null;
            this.readDeltaState(-70, (CipherPacketBuffer) null);
          }
          this.field_P = IsaacRandom.a(11, -30273, param1);
          this.field_A = param1.l(32, param0 + 13977);
          this.field_g = param1.l(32, 59);
          this.field_q = param1.l(32, 59);
          this.field_D = param1.l(32, 59);
          this.field_o = param1.l(12, 59);
          this.field_t = param1.l(26, 59);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "nl.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, MatchAgent param1) {
        FootballerAgent var4 = null;
        try {
          var4 = (FootballerAgent) (param1);
          this.directionY = var4.directionY;
          this.positionY = var4.positionY;
          this.field_O = var4.field_O;
          this.actionTime = var4.actionTime;
          this.field_t = var4.field_t;
          this.field_B = var4.field_B;
          this.aiWait = var4.aiWait;
          this.dashCooldown = var4.dashCooldown;
          this.directionX = var4.directionX;
          this.field_r = var4.field_r;
          this.field_q = var4.field_q;
          this.field_s = var4.field_s;
          this.controllingParticipant = var4.controllingParticipant;
          this.field_A = var4.field_A;
          this.field_z = var4.field_z;
          this.field_P = var4.field_P;
          this.field_D = var4.field_D;
          this.field_o = var4.field_o;
          this.height = var4.height;
          this.field_g = var4.field_g;
          this.directionMask = var4.directionMask;
          if (param0 > -52) {
            this.startTackle(-65, -41);
          }
          this.verticalVelocity = var4.verticalVelocity;
          this.action = var4.action;
          this.field_h = var4.field_h;
          this.field_x = var4.field_x;
          this.field_k = var4.field_k;
          this.field_m = var4.field_m;
          this.positionX = var4.positionX;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "nl.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void readDeltaState(int param0, CipherPacketBuffer param1) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (ContentTransitionDialog.a(param1, (byte) -39)) {
            this.positionX = this.positionX + BufferedCacheFile.a((byte) 125, 19, param1, 0, 23, 30);
            this.positionY = this.positionY + BufferedCacheFile.a((byte) 125, 19, param1, 0, 23, 30);
            this.height = this.height + BufferedCacheFile.a((byte) 125, 19, param1, 0, 23, 30);
          }
          this.verticalVelocity = mk.a(param1, 25, (byte) 6, 0);
          if (ContentTransitionDialog.a(param1, (byte) -39)) {
            this.directionMask = param1.l(4, 59);
            this.directionY = -1 + param1.l(2, param0 ^ 50);
            this.directionX = param1.l(2, 59) - 1;
          }
          if (ContentTransitionDialog.a(param1, (byte) -39)) {
            this.action = param1.l(WriteIntegersCommand.a(14, false), 59);
            this.actionTime = param1.l(8, param0 ^ 50);
          }
          this.dashCooldown = hq.a(param0 ^ 22538, param0, param1, 0);
          if (ContentTransitionDialog.a(param1, (byte) -39)) {
            this.aiWait = param1.l(3, 59);
          }
          if (ContentTransitionDialog.a(param1, (byte) -39)) {
            this.field_O = ContentTransitionDialog.a(param1, (byte) -39);
            this.field_h = param1.l(4, 59);
            this.field_z = -5 + param1.l(9, 59);
            this.field_x = IsaacRandom.a(11, -30273, param1);
            this.field_P = IsaacRandom.a(11, -30273, param1);
          }
          if (ContentTransitionDialog.a(param1, (byte) -39)) {
            this.field_s = ContentTransitionDialog.a(param1, (byte) -39);
            this.field_k = mk.a(param1, 30, (byte) 6, 18);
            this.field_m = mk.a(param1, 30, (byte) 6, 18);
            this.field_r = mk.a(param1, 30, (byte) 6, 18);
            this.field_B = mk.a(param1, 30, (byte) 6, 18);
          }
          if (ContentTransitionDialog.a(param1, (byte) -39)) {
            this.field_A = param1.l(32, param0 ^ 50);
            this.field_g = param1.l(32, 59);
            this.field_q = param1.l(32, 59);
            this.field_D = param1.l(32, 59);
          }
          if (this.archetype == 4 &&
            ContentTransitionDialog.a(param1, (byte) -39)) {
            this.field_o = param1.l(4, 59);
            this.field_t = param1.l(26, param0 + 50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("nl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 <= 94) {
          this.chargeKickDuration((byte) 63);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.action != 0 && (this.action != 4 ||
          !this.stats.a((byte) 44, this.member))) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final int pixelX(int param0) {
        if (param0 > -88) {
          this.d((byte) -120);
        }
        return this.positionX >> 16;
    }

    final void startDive(int param0, int param1) {
        this.setAction((byte) -31, param1);
        this.directionMask = param0 > this.positionX ? 8 : 2;
        this.field_t = param0;
        this.setDirectionFromMask(this.directionMask, 26214);
        this.actionTime = this.actionTime + this.field_o * 2;
    }

    final void setDirectionFromMask(int param0, int param1) {
        if (param0 == 0) {
          return;
        }
        this.directionX = 0;
        this.directionY = 0;
        if (param1 != 26214) {
          FootballerAgent.a(true, (byte) 88);
        }
        if ((param0 & 4) > 0) {
          this.directionY = this.directionY - 1;
        }
        if (0 < (1 & param0)) {
          this.directionY = this.directionY + 1;
        }
        if ((param0 & 2) > 0) {
          this.directionX = this.directionX - 1;
        }
        if (0 < (8 & param0)) {
          this.directionX = this.directionX + 1;
        }
        if (this.directionX == 0 &&
          0 == this.directionY) {
          this.directionY = 1;
        }
    }

    final void startTackle(int param0, int param1) {
        this.setAction((byte) -31, 3);
        this.field_k = (we.cosine(param0, false) >> 8) * (this.field_q >> 8);
        this.field_m = (ei.sine(param0, (byte) -23) >> 8) * (this.field_q >> 8);
        if (this.directionMask == 0) {
          this.setDirectionFromMask(en.b(param0, -25147), 26214);
        }
        this.actionTime = this.actionTime + this.stats.effectiveTackle(this.member, 0) / 5;
        this.controllingParticipant = param1;
        this.field_s = false;
    }

    final int chargeKickDuration(byte param0) {
        String discarded$0 = null;
        if (param0 != -99) {
          discarded$0 = this.archetypeName(-72);
        }
        int var2 = -this.stats.effectivePower(this.member, 0) + 100;
        return 80 + 120 * var2 / 100;
    }

    final int dashCooldown(byte param0) {
        if (param0 != -99) {
          this.pixelX(-27);
        }
        return 200 - (this.stats.effectiveSpeed(this.member, (byte) -127) * 2 - 120) + BuyPitchDialog.field_I[4];
    }

    final void applyPlayerStats(boolean param0, PlayerStats param1, int param2) {
        boolean stackIn_3_1 = false;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          this.stats = param1;
          stackIn_3_1 = (param0);
          this.member = stackIn_3_1;
          this.archetype = this.stats.archetype;
          if (this.stats.c(this.member, param2 - 109)) {
            stackIn_6_0 = 3;
          } else {
            stackIn_6_0 = this.archetype;
          }
          var4_int = stackIn_6_0;
          this.field_A = ea.field_j[var4_int] + (MenuButton.field_q[var4_int] - ea.field_j[var4_int]) * this.stats.effectiveSpeed(this.member, (byte) -84) / 100;
          if (this.stats.a((byte) 44, this.member)) {
            stackIn_9_0 = 0;
          } else {
            stackIn_9_0 = this.archetype;
          }
          var5 = stackIn_9_0;
          this.field_q = g.field_b[var5] + (-g.field_b[var5] + HelpTipDialog.field_J[var5]) * this.stats.effectiveTackle(this.member, param2 - 3) / 100;
          if (param2 != 3) {
            this.field_m = 74;
          }
          this.field_g = 181 * (this.field_A >> 8);
          this.field_D = (this.field_q >> 8) * 181;
          this.setDirectionFromMask(this.directionMask, 26214);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("nl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    private final String archetypeName(int param0) {
        if (this.archetype == 0) {
          return "Tank";
        }
        if (param0 != 9) {
          this.archetype = 110;
        }
        if (1 == this.archetype) {
          return "Htshot";
        }
        if (this.archetype == 3) {
          return "Ranger";
        }
        if (2 == this.archetype) {
          return "Elite";
        }
        if (4 != this.archetype) {
          return "Invalid[" + this.archetype + "]";
        }
        return "Keeper";
    }

    final static char a(boolean param0, byte param1) {
        int var3 = 0;
        int var2 = 255 & param1;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (128 <= var2 &&
          var2 < 160) {
          var3 = ts.field_c[-128 + var2];
          if (0 == var3) {
            var3 = 63;
          }
          var2 = var3;
        }
        if (!param0) {
          return (char)var2;
        }
        return '￘';
    }

    final void setAction(byte param0, int param1) {
        String discarded$0 = null;
        this.action = param1;
        this.actionTime = BuyPitchDialog.field_I[this.action];
        if (this.megamode) {
          if (8 == this.action) {
            this.actionTime = this.actionTime + 60;
          }
          if (3 == this.action) {
            this.actionTime = this.actionTime + 10;
          }
        }
        if (param0 != -31) {
          discarded$0 = this.actionName(false);
        }
    }

    private final String actionName(boolean param0) {
        if (0 == this.action) {
          return "Idle";
        }
        if (1 == this.action) {
          return "ACTION_CHARGE_KICK";
        }
        if (this.action == 2) {
          return "ACTION_KICK";
        }
        if (this.action == 3) {
          return "ACTION_TACKLE";
        }
        if (4 == this.action) {
          return "ACTION_DASH";
        }
        if (this.action == 5) {
          return "ACTION_DIVE";
        }
        if (this.action == 6) {
          return "ACTION_DIVE_STAND";
        }
        if (this.action == 7) {
          return "ACTION_FALL_TACKLED";
        }
        if (this.action == 8) {
          return "ACTION_PAUSE_TACKLED";
        }
        if (this.action == 9) {
          return "ACTION_STAND_TACKLED";
        }
        if (this.action == 10) {
          return "ACTION_TACKLE_STAND";
        }
        if (this.action == 11) {
          return "ACTION_RUN_HOME";
        }
        if (!param0) {
          return (String) null;
        }
        if (this.action == 12) {
          return "ACTION_TACKLE_SUCCESS";
        }
        if (this.action == 13) {
          return "ACTION_HEADER";
        }
        if (14 == this.action) {
          return "ACTION_KEEPER_SHUFFLE";
        }
        return "Invalid(" + this.action + ")";
    }

    public final String toString() {
        StringBuilder discarded$34 = null;
        StringBuilder discarded$130 = null;
        StringBuilder var2 = new StringBuilder("AgentFootballer[" + this.archetypeName(9) + "]");
        StringBuilder discarded$0 = var2.append("\n\t\tloc=\t[");
        GameResourceLoader.a(this.positionX, 100, var2);
        StringBuilder discarded$1 = var2.append(", ");
        GameResourceLoader.a(this.positionY, 100, var2);
        StringBuilder discarded$2 = var2.append(", ");
        GameResourceLoader.a(this.height, 100, var2);
        StringBuilder discarded$3 = var2.append(", ");
        GameResourceLoader.a(this.verticalVelocity, 100, var2);
        StringBuilder discarded$4 = var2.append(", " + this.dashCooldown + "]");
        StringBuilder discarded$5 = var2.append("\n\t\tspd=[");
        GameResourceLoader.a(this.field_A, 100, var2);
        StringBuilder discarded$6 = var2.append(", ");
        GameResourceLoader.a(this.field_g, 100, var2);
        StringBuilder discarded$7 = var2.append(", ");
        GameResourceLoader.a(this.field_q, 100, var2);
        StringBuilder discarded$8 = var2.append(", ");
        GameResourceLoader.a(this.field_D, 100, var2);
        StringBuilder discarded$9 = var2.append("]");
        StringBuilder discarded$10 = var2.append("\n\t\tstathash=" + this.stats.computeChecksum(0));
        StringBuilder discarded$33 = var2.append("\n\t\tact=\t[" + this.actionTime + ", " + this.actionName(true) + ", ai_wait=" + this.aiWait + "]");
        if (4 == this.archetype) {
          discarded$34 = var2.append("\n\t\tkeeperstate=[" + this.field_o + "," + this.field_t + "]");
        }
        StringBuilder discarded$35 = var2.append("\n\t\tdirec=\t[");
        IntrusiveNode.a(this.directionMask, -28745, 4, var2);
        StringBuilder discarded$36 = var2.append(',');
        IntrusiveNode.a(this.field_h, -28745, 4, var2);
        StringBuilder discarded$37 = var2.append("," + this.directionX + "," + this.directionY + "]");
        StringBuilder discarded$38 = var2.append("\n\t\tkick=\t[" + this.field_z + "," + this.field_x + "," + this.field_P + "," + this.field_O + "]");
        StringBuilder discarded$129 = var2.append("\n\t\ttackle=\t[" + this.field_k + "," + this.field_m + "," + this.field_s + "," + this.field_r + "," + this.field_B + "]");
        if (this.megamode) {
          discarded$130 = var2.append("\n\t\tMEGAMODE");
        }
        StringBuilder discarded$131 = var2.append("\n\t\t" + (this.member ? "" : "!") + "member, " + (!this.megamode ? "!" : "") + "mega");
        return var2.toString();
    }

    public FootballerAgent() {
        this.field_o = 0;
        this.megamode = false;
        this.controllingParticipant = -1;
    }

    final int directionMask(int param0) {
        int var2 = 0;
        if (this.directionX > 0) {
          var2 = var2 | 8;
        }
        if (this.directionX < 0) {
          var2 = var2 | 2;
        }
        if (0 < this.directionY) {
          var2 = var2 | 1;
        }
        if (param0 != 5339) {
          this.action = 35;
        }
        if (this.directionY < 0) {
          var2 = var2 | 4;
        }
        return var2;
    }

    static {
        field_p = 0;
        field_f = new IntrusiveDeque();
    }
}
