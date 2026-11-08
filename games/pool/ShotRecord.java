/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShotRecord extends IntrusiveNode {
    byte field_H;
    int cueBallX;
    int breakSeed;
    int field_N;
    static String timerMinutesSecondsFractions;
    byte field_D;
    static String playerIsOut;
    static String unableToDeleteFriend;
    static int field_y;
    int field_n;
    PacketBuffer stateBefore;
    static String menu;
    static String rulePillar0;
    int ballInHandMode;
    short aimAngle;
    int field_I;
    IntrusiveDeque pottedBalls;
    byte field_w;
    int[] field_U;
    static String ratingLost;
    static String menuTimeTrialWithGuides;
    int shotNumber;
    boolean field_t;
    int playerIndex;
    static int field_o;
    static TriangleMesh[] field_S;
    int cueBallY;
    int groupBefore;
    int phase;
    static int field_J;
    short elevation;
    boolean field_E;
    short power;
    byte field_l;
    IntrusiveDeque field_R;
    long field_x;
    int endResolution;

    final boolean hasPotted(byte param0, int param1) {
        IntrusiveDequeCursor var3;
        int var4;
        PotEvent var5;
        var3 = new IntrusiveDequeCursor(this.pottedBalls);
        var4 = 105 / ((param0 + 53) / 59);
        var5 = (PotEvent) (var3.last((byte) -92));
        while (var5 != null) {
          if (var5.ballIndex == param1) {
            return true;
          }
          var5 = (PotEvent) (var3.previous(-108));
        }
        return false;
    }

    final static GrowableIntList b(boolean param0) {
        if (!param0) {
          unableToDeleteFriend = (String) null;
          return GrowableIntListFactory.createGrowableIntList(false, 1);
        }
        return GrowableIntListFactory.createGrowableIntList(false, 1);
    }

    final String describe(int param0, PoolGameModel param1) {
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String var3Lifetime1;
        String var3Lifetime2;
        String var3Lifetime3;
        try {
          if (param0 != 1) {
            ShotRecord.b(false);
          }
          var5 = "Shot " + this.shotNumber + " " + TextWidgetPainter.shotPhaseName(8, this.phase) + " player " + param1.field_h[this.playerIndex];
          var3 = var5;
          var3Lifetime1 = var5;
          var3Lifetime2 = var5;
          if (0 <= this.breakSeed) {
            var3Lifetime2 = var5 + " break seed " + this.breakSeed;
          }
          var4 = this.ballInHandMode;
          if (var4 != 2) {
            if (var4 != 3) {
              if (var4 == 1) {
                var3Lifetime2 = var3Lifetime2 + " BiH kitchen";
              }
            } else {
              var3Lifetime2 = var3Lifetime2 + " BiH D";
            }
          } else {
            var3Lifetime2 = var3Lifetime2 + " BiH anywhere";
          }
          var6 = var3Lifetime2 + " before_group_on=" + this.groupBefore;
          var3Lifetime3 = var6;
          if (null == this.stateBefore) {
            var3Lifetime3 = var6 + " before state null!";
          }
          stackIn_17_0 = var3Lifetime3;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("qe.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean isPlayPassChoicePending(int param0) {
        if (param0 > -66) {
          return false;
        }
        if (0 == (ArchiveAvailabilitySupport.field_g & this.endResolution)) {
          return false;
        }
        if ((24 & this.field_l) == 0) {
          return true;
        }
        return false;
    }

    final void writeChoices(PacketBuffer param0, byte param1) {
        if (param1 != 0) {
          return;
        }
        try {
          param0.writeByte((int) this.field_l, false);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qe.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        unableToDeleteFriend = null;
        rulePillar0 = null;
        timerMinutesSecondsFractions = null;
        playerIsOut = null;
        ratingLost = null;
        if (param0 >= 100) {
          menu = null;
          menuTimeTrialWithGuides = null;
          field_S = null;
          return;
        }
    }

    final void addEvent(int param0, int param1, int[] param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (null == this.field_R) {
            this.field_R = new IntrusiveDeque();
          }
          this.field_R.addFirst((byte) 124, new ShotEvent(param0, param2));
          if (param1 != -14) {
            field_S = (TriangleMesh[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("qe.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        ModelInstance.a(param3, param2 ^ 40844);
        SupportPageLauncher.a(param1, param3, param0, 30);
        if (param2 != -40960) {
          ShotRecord.b(false);
        }
    }

    final void readChoices(byte param0, PacketBuffer param1) {
        boolean discarded$1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.makeChoice(param1.readUnsignedByte(-105), true);
          if (!this.isAnyChoicePending(117)) {
            this.phase = 3;
          }
          if (param0 <= 13) {
            discarded$1 = this.canMakeChoice(30, -70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qe.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          if (param5 < SoftwareRasterizer.clipLeft) {
            param0 = param0 - (-param5 + SoftwareRasterizer.clipLeft);
            param5 = SoftwareRasterizer.clipLeft;
          }
          if (param3 < SoftwareRasterizer.clipTop) {
            param1 = param1 - (-param3 + SoftwareRasterizer.clipTop);
            param3 = SoftwareRasterizer.clipTop;
          }
          if (SoftwareRasterizer.clipRight < param0 + param5) {
            param0 = SoftwareRasterizer.clipRight - param5;
          }
          if (SoftwareRasterizer.clipBottom < param3 + param1) {
            param1 = SoftwareRasterizer.clipBottom - param3;
          }
          if (param0 > 0 &&
            param1 > 0) {
            var6_int = param5 + SoftwareRasterizer.width * param3;
            var7 = -param0 + SoftwareRasterizer.width;
            param3 = -param1;
            if (param4 < 94) {
              return;
            }
            while (0 > param3) {
              for (param5 = -param0; 0 > param5; param5++) {
                var8 = SoftwareRasterizer.pixels[var6_int];
                if (param2 < (65280 & var8) >> 8 &&
                  (var8 & 65280) >> 8 >= (var8 & 16711680) >> 16) {
                  var9 = ((16711680 & var8) >> 15) - 60;
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = 65280 & var8;
                  var10 = 65280 & (var10 >> 1) - (var10 >> 5);
                  var11 = (255 & var8) >> 3;
                  SoftwareRasterizer.pixels[var6_int] = RenderingInitializationSupport.bitwiseOr(var11, RenderingInitializationSupport.bitwiseOr(var9 << 16, var10));
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
              param3++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var6), "qe.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void b(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        var2 = param0;
        var3 = LobbyPlayer.field_fc;
        if (var3 < 5) {
          var2 = var3 * var3 * 8192 / 1100;
          var4 = 1;
          var5 = 0;
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (param1 == 5) {
            var4 = -1;
            var5 = 1;
          }
          if (param1 == 6) {
            var5 = -1;
            var4 = 1;
          }
          if (param1 == 7) {
            var4 = -1;
            var5 = -1;
          } else {
            if (param1 == 8) {
              var4 = -1;
              var5 = -1;
            }
          }
        } else {
          if (var3 < 105) {
            var2 = (-40960 + 16384 * var3) / 220;
            var4 = 1;
            var5 = 0;
            if (param1 == 1) {
              var5 = 1;
            }
            if (param1 == 3) {
              var4 = -1;
            }
            if (param1 == 4) {
              var5 = 1;
              var4 = 1;
            }
            if (param1 == 5) {
              var4 = -1;
              var5 = 1;
            }
            if (param1 == 6) {
              var5 = -1;
              var4 = 1;
            }
            if (param1 == 7) {
              var4 = -1;
              var5 = -1;
            } else {
              if (param1 == 8) {
                var4 = -1;
                var5 = -1;
              }
            }
          } else {
            if (120 <= var3) {
              var4 = 1;
              var5 = 0;
              if (param1 == 1) {
                var5 = 1;
              }
              if (param1 == 3) {
                var4 = -1;
              }
              if (param1 == 4) {
                var5 = 1;
                var4 = 1;
              }
              if (param1 == 5) {
                var4 = -1;
                var5 = 1;
              }
              if (param1 == 6) {
                var5 = -1;
                var4 = 1;
              }
              if (param1 == 7 ||
                param1 == 8) {
                var4 = -1;
                var5 = -1;
              }
              if (param1 == 11) {
                var4 = -1;
              }
              if (param1 == 12) {
                var4 = -1;
                var5 = -1;
              }
              if (param1 == 13) {
                var5 = -1;
                var4 = 1;
              }
              if (param1 == 14) {
                var5 = 1;
                var4 = -1;
              }
              if (param1 == 15) {
                var4 = 1;
                var5 = 1;
              }
              IsaacCipher.field_b = SoundCache.createRotationTransform(var2 * var5, false, var2 * var4);
              return;
            }
            var3 = -var3 + 120;
            var2 = 8192 - var3 * (var3 * 8192) / 3300;
            var4 = 1;
            var5 = 0;
            if (param1 == 1) {
              var5 = 1;
            }
            if (param1 == 3) {
              var4 = -1;
            }
            if (param1 == 4) {
              var5 = 1;
              var4 = 1;
            }
            if (param1 == 5) {
              var4 = -1;
              var5 = 1;
            }
            if (param1 == 6) {
              var5 = -1;
              var4 = 1;
            }
            if (param1 == 7 ||
              param1 == 8) {
              var4 = -1;
              var5 = -1;
            }
          }
        }
        if (param1 == 11) {
          var4 = -1;
        }
        if (param1 == 12) {
          var4 = -1;
          var5 = -1;
        }
        if (param1 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (param1 == 14) {
          var5 = 1;
          var4 = -1;
        }
        if (param1 == 15) {
          var4 = 1;
          var5 = 1;
        }
        IsaacCipher.field_b = SoundCache.createRotationTransform(var2 * var5, false, var2 * var4);
    }

    final byte readMove(byte param0, PacketBuffer param1) {
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param0 != -28) {
            this.stateBefore = (PacketBuffer) null;
          }
          var3_int = param1.readUnsignedByte(-78) & 255;
          if ((this.shotNumber & 255) != var3_int) {
            param1.position = param1.position + 6;
            if (var3_int >= this.shotNumber - 1) {
              return (byte) 1;
            }
            System.out.println("Read the wrong move packet. Wanted " + this.shotNumber + ", but got " + var3_int);
            stackIn_17_0 = 1;
            return (byte) stackIn_17_0;
          }
          var4 = param1.readShort((byte) -80);
          var5 = param1.readShort((byte) -108);
          var6 = param1.readShort((byte) -103);
          var7 = param1.readByte((byte) 105);
          var8 = param1.readByte((byte) 105);
          if (this.phase == 0) {
            this.field_D = (byte)var7;
            this.field_H = (byte)var8;
            this.aimAngle = (short)var4;
            this.power = (short)var6;
            this.elevation = (short)var5;
            stackIn_13_0 = 0;
            return (byte) stackIn_13_0;
          }
          if (this.aimAngle == var4 &&
            var5 == this.elevation &&
            var6 == this.power &&
            this.field_D == var7 &&
            var8 == this.field_H) {
            stackIn_11_0 = 0;
          } else {
            stackIn_11_0 = 2;
          }
          return (byte) stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("qe.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void writeEndResolution(PacketBuffer param0, byte param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.phase != 2 &&
            3 != this.phase) {
            throw new IllegalStateException("Can't write an end resolution until the shot is finished");
          }
          param0.writeMedium(this.endResolution, 66);
          if (param1 >= -65) {
            ShotRecord.charToString(false, 'ﾨ');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qe.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final String describeChoices(boolean param0) {
        String var3 = "end choice: ";
        String var2 = var3;
        var2 = var3;
        var2 = var3;
        if ((this.field_l & 1) != 0) {
          var2 = var3 + "; group 0";
        }
        if ((this.field_l & 2) != 0) {
          var2 = var2 + "; group 1";
        }
        if ((this.field_l & 16) != 0) {
          var2 = var2 + "; pass";
        }
        if (param0) {
          if ((8 & this.field_l) != 0) {
            var2 = var2 + "; play";
          }
          if ((64 & this.field_l) != 0) {
            var2 = var2 + "; opponent pass";
          }
          if (0 != (this.field_l & 32)) {
            var2 = var2 + "; opponent play";
          }
          return var2;
        }
        ShotRecord.a(82, -62, 92, 61, (byte) 96, -63);
        if ((8 & this.field_l) != 0) {
          var2 = var2 + "; play";
        }
        if ((64 & this.field_l) != 0) {
          var2 = var2 + "; opponent pass";
        }
        if (0 != (this.field_l & 32)) {
          var2 = var2 + "; opponent play";
        }
        return var2;
    }

    final void writeCueBallPlacement(PoolGameModel param0, PacketBuffer param1, int param2) {
        PoolGameModel var6 = null;
        Ball var5 = null;
        PacketBuffer var4_ref = null;
        try {
          var6 = param0;
          PoolGameModel var4 = var6;
          var5 = var6.balls[0];
          this.cueBallY = var5.positionY;
          this.cueBallX = var5.positionX;
          if (param2 != -7478) {
            this.field_t = false;
          }
          var4_ref = param1;
          var4_ref.writeInt(true, this.cueBallX);
          var4_ref.writeInt(true, this.cueBallY);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qe.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String describeOutcome(int param0) {
        if (param0 == 26859) {
          return "firstcontactid: " + this.field_n + ", pottings: " + this.pottedBalls.size(45) + (!this.field_t ? "" : ", fouled") + ", resolution: " + ArchiveAvailabilitySupport.describeResolutionFlags(this.endResolution, (byte) 10);
        }
        menu = (String) null;
        return "firstcontactid: " + this.field_n + ", pottings: " + this.pottedBalls.size(45) + (!this.field_t ? "" : ", fouled") + ", resolution: " + ArchiveAvailabilitySupport.describeResolutionFlags(this.endResolution, (byte) 10);
    }

    final boolean isGroupChoicePending(boolean param0) {
        if (!param0) {
          return true;
        }
        if (0 == (ClientException.field_b & this.endResolution)) {
          return false;
        }
        if ((3 & this.field_l) == 0) {
          return true;
        }
        return false;
    }

    final String describeAim(int param0) {
        StringBuilder stackIn_5_0 = null;
        String stackIn_5_1 = null;
        StringBuilder stackIn_6_0 = null;
        if (param0 != 0) {
          return (String) null;
        }
        stackIn_6_0 = new StringBuilder().append("ang=").append(this.aimAngle).append(",").append(this.elevation).append("; pow=").append(this.power).append("; strk=").append(this.field_D).append(",").append(this.field_H);
        if (-1 == this.cueBallX) {
          stackIn_5_0 = stackIn_6_0;
          stackIn_5_1 = "";
          return ((StringBuilder) (Object) stackIn_5_0).append(stackIn_5_1).toString();
        }
        if (this.cueBallY == -1) {
          return ((StringBuilder) (Object) stackIn_6_0).append("").toString();
        }
        return ((StringBuilder) (Object) stackIn_6_0).append(" cueball@" + this.cueBallX + "," + this.cueBallY).toString();
    }

    final void makeChoice(int param0, boolean param1) {
        int var3;
        int var4;
        PacketBuffer var5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        PacketBuffer var5Lifetime1;
        PacketBuffer var5Lifetime2;
        PacketBuffer var5Lifetime3;
        int var3Lifetime4;
        var4 = Pool.field_O;
        if ((ClientException.field_b & this.endResolution) != 0) {
          if ((3 & param0) == 0) {
            if ((ArchiveAvailabilitySupport.field_g & this.endResolution) != 0 &&
              (param0 & 24) != 0) {
              var3 = this.field_l & 24;
              if (var3 == 0) {
                var3 = param0;
                this.field_l = (byte)(this.field_l | param0);
              } else {
                if (param0 != var3) {
                  throw new IllegalStateException("Already made another play/pass choice!");
                }
              }
            }
            if ((Cp1252DecodingSupport.field_d & this.endResolution) != 0 &&
              (96 & param0) != 0) {
              var3Lifetime4 = this.field_l & 96;
              if (var3Lifetime4 != 0) {
                if (var3Lifetime4 != param0) {
                  throw new IllegalStateException("Already made another opponent play/pass choice!");
                }
              } else {
                var3Lifetime4 = param0;
                this.field_l = (byte)(this.field_l | param0);
              }
            }
            if (!this.canMakeChoice(-28872, param0)) {
              throw new IllegalStateException("Can't make a choice now!");
            }
            this.field_l = (byte)(this.field_l | param0);
            if (!param1) {
              var5 = (PacketBuffer) null;
              this.readChoices((byte) 32, (PacketBuffer) null);
            }
            return;
          }
          var3Lifetime2 = this.field_l & 3;
          if (var3Lifetime2 != 0) {
            if (var3Lifetime2 != param0) {
              throw new IllegalStateException("Already made another group choice!");
            }
            if ((ArchiveAvailabilitySupport.field_g & this.endResolution) != 0 &&
              (param0 & 24) != 0) {
              var3Lifetime2 = this.field_l & 24;
              if (var3Lifetime2 == 0) {
                var3Lifetime2 = param0;
                this.field_l = (byte)(this.field_l | param0);
              } else {
                if (param0 != var3Lifetime2) {
                  throw new IllegalStateException("Already made another play/pass choice!");
                }
              }
            }
            if ((Cp1252DecodingSupport.field_d & this.endResolution) != 0 &&
              (96 & param0) != 0) {
              var3Lifetime2 = this.field_l & 96;
              if (var3Lifetime2 != 0) {
                if (var3Lifetime2 != param0) {
                  throw new IllegalStateException("Already made another opponent play/pass choice!");
                }
              } else {
                var3Lifetime2 = param0;
                this.field_l = (byte)(this.field_l | param0);
              }
            }
            if (!this.canMakeChoice(-28872, param0)) {
              throw new IllegalStateException("Can't make a choice now!");
            }
            this.field_l = (byte)(this.field_l | param0);
            if (param1) {
              return;
            }
            var5Lifetime3 = (PacketBuffer) null;
            this.readChoices((byte) 32, (PacketBuffer) null);
            return;
          }
          var3Lifetime3 = param0;
          this.field_l = (byte)(this.field_l | param0);
        }
        if ((ArchiveAvailabilitySupport.field_g & this.endResolution) == 0) {
          if ((Cp1252DecodingSupport.field_d & this.endResolution) != 0 &&
            (96 & param0) != 0) {
            var3Lifetime1 = this.field_l & 96;
            if (var3Lifetime1 == 0) {
              var3Lifetime1 = param0;
              this.field_l = (byte)(this.field_l | param0);
            } else {
              if (var3Lifetime1 != param0) {
                throw new IllegalStateException("Already made another opponent play/pass choice!");
              }
            }
          }
        } else {
          if ((param0 & 24) == 0) {
            if ((Cp1252DecodingSupport.field_d & this.endResolution) != 0 &&
              (96 & param0) != 0) {
              var3Lifetime1 = this.field_l & 96;
              if (var3Lifetime1 == 0) {
                var3Lifetime1 = param0;
                this.field_l = (byte)(this.field_l | param0);
              } else {
                if (var3Lifetime1 != param0) {
                  throw new IllegalStateException("Already made another opponent play/pass choice!");
                }
              }
            }
          } else {
            var3Lifetime1 = this.field_l & 24;
            if (var3Lifetime1 == 0) {
              var3Lifetime1 = param0;
              this.field_l = (byte)(this.field_l | param0);
              if ((Cp1252DecodingSupport.field_d & this.endResolution) != 0 &&
                (96 & param0) != 0) {
                var3Lifetime1 = this.field_l & 96;
                if (var3Lifetime1 == 0) {
                  var3Lifetime1 = param0;
                  this.field_l = (byte)(this.field_l | param0);
                } else {
                  if (var3Lifetime1 != param0) {
                    throw new IllegalStateException("Already made another opponent play/pass choice!");
                  }
                }
              }
            } else {
              if (param0 != var3Lifetime1) {
                throw new IllegalStateException("Already made another play/pass choice!");
              }
              if ((Cp1252DecodingSupport.field_d & this.endResolution) != 0 &&
                (96 & param0) != 0) {
                var3Lifetime1 = this.field_l & 96;
                if (var3Lifetime1 == 0) {
                  var3Lifetime1 = param0;
                  this.field_l = (byte)(this.field_l | param0);
                  if (!this.canMakeChoice(-28872, param0)) {
                    throw new IllegalStateException("Can't make a choice now!");
                  }
                  this.field_l = (byte)(this.field_l | param0);
                  if (!param1) {
                    var5Lifetime1 = (PacketBuffer) null;
                    this.readChoices((byte) 32, (PacketBuffer) null);
                  }
                  return;
                }
                if (var3Lifetime1 != param0) {
                  throw new IllegalStateException("Already made another opponent play/pass choice!");
                }
              }
            }
          }
        }
        if (!this.canMakeChoice(-28872, param0)) {
          throw new IllegalStateException("Can't make a choice now!");
        }
        this.field_l = (byte)(this.field_l | param0);
        if (param1) {
          return;
        }
        var5Lifetime2 = (PacketBuffer) null;
        this.readChoices((byte) 32, (PacketBuffer) null);
    }

    final boolean isAnyChoicePending(int param0) {
        if (this.endResolution == IntrusiveNodeHashTable.field_a) {
          return false;
        }
        if (param0 < 105) {
          return false;
        }
        if (this.isGroupChoicePending(true)) {
          return true;
        }
        if (this.isPlayPassChoicePending(-103)) {
          return true;
        }
        if (!this.isOpponentChoicePending((byte) 85)) {
          return false;
        }
        return true;
    }

    final void readEndShot(byte param0, PacketBuffer param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param1.readUnsignedMedium(98);
          if (param0 < 76) {
            return;
          }
          this.setEndResolution(2, var3_int);
          if ((LinkButtonPainter.field_i & 2097152L) != 0L) {
            System.out.println("->S2C_END_SHOT: " + ArchiveAvailabilitySupport.describeResolutionFlags(this.endResolution, (byte) 10));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qe.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static String charToString(boolean param0, char param1) {
        if (param0) {
          return (String) null;
        }
        return String.valueOf(param1);
    }

    final void setEndResolution(int param0, int param1) {
        try {
          if (param0 != 2) {
            return;
          }
          if (IntrusiveNodeHashTable.field_a == this.endResolution) {
            this.endResolution = param1;
            return;
          }
          if (this.endResolution == param1) {
            return;
          }
          GrowableIntList.reportClientError(new Throwable(), "New end resolution 0b" + Integer.toString(this.endResolution, 2) + ": " + TabbedPane.b(param1, param0 ^ 87) + " does not match current one 0b" + Integer.toString(param1, 2) + ": " + TabbedPane.b(this.endResolution, 77), -8555);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean canMakeChoice(int param0, int param1) {
        boolean stackIn_27_0 = false;
        boolean stackIn_101_0 = false;
        if ((this.endResolution & ClientException.field_b) == 0) {
          if ((ArchiveAvailabilitySupport.field_g & this.endResolution) != 0 &&
            0 != (24 & param1)) {
            if ((24 & this.field_l) == 0) {
              return true;
            }
            if ((24 & this.field_l) == param1) {
              return true;
            }
            return false;
          }
          if (param0 != -28872) {
            this.elevation = (short) 5;
            if ((this.endResolution & Cp1252DecodingSupport.field_d) == 0) {
              return (param1 == 0);
            }
            if ((param1 & 96) == 0) {
              return (param1 == 0);
            }
            stackIn_27_0 = ((this.field_l & 96) == 0) || (param1 == (96 & this.field_l));
            return stackIn_27_0;
          }
        } else {
          if ((param1 & 3) != 0) {
            if ((3 & this.field_l) == 0) {
              stackIn_101_0 = true;
            } else {
              if ((3 & this.field_l) == param1) {
                return true;
              }
              stackIn_101_0 = false;
            }
            return stackIn_101_0;
          }
          if ((ArchiveAvailabilitySupport.field_g & this.endResolution) != 0 &&
            0 != (24 & param1)) {
            if ((24 & this.field_l) == 0) {
              return true;
            }
            if ((24 & this.field_l) != param1) {
              return false;
            }
            return true;
          }
          if (param0 == -28872) {
            if ((this.endResolution & Cp1252DecodingSupport.field_d) == 0) {
              return (param1 == 0);
            }
            if ((param1 & 96) == 0) {
              return (param1 == 0);
            }
            if ((this.field_l & 96) == 0) {
              return true;
            }
            if (param1 != (96 & this.field_l)) {
              return false;
            }
            return true;
          }
          this.elevation = (short) 5;
        }
        if ((this.endResolution & Cp1252DecodingSupport.field_d) == 0) {
          return (param1 == 0);
        }
        if ((param1 & 96) == 0) {
          return (param1 == 0);
        }
        if ((this.field_l & 96) == 0) {
          return true;
        }
        if (param1 == (96 & this.field_l)) {
          return true;
        }
        return false;
    }

    final boolean isOpponentChoicePending(byte param0) {
        if (param0 <= 73) {
          this.field_H = (byte) 46;
          if ((this.endResolution & Cp1252DecodingSupport.field_d) == 0) {
            return false;
          }
          if ((this.field_l & 96) == 0) {
            return true;
          }
          return false;
        }
        if ((this.endResolution & Cp1252DecodingSupport.field_d) == 0) {
          return false;
        }
        if ((this.field_l & 96) == 0) {
          return true;
        }
        return false;
    }

    ShotRecord() {
        this.field_N = -1;
        this.cueBallX = -1;
        this.field_w = (byte) 0;
        this.field_t = false;
        this.breakSeed = -1;
        this.ballInHandMode = 0;
        this.cueBallY = -1;
        this.phase = 0;
        this.field_E = false;
        this.field_I = -1;
        this.field_n = -1;
        this.power = (short) -1;
        this.pottedBalls = new IntrusiveDeque();
        this.field_x = 0L;
        this.field_l = (byte) 0;
        this.field_R = null;
        this.endResolution = IntrusiveNodeHashTable.field_a;
    }

    ShotRecord(int param0, int param1) {
        this.field_N = -1;
        this.cueBallX = -1;
        this.field_w = (byte) 0;
        this.field_t = false;
        this.breakSeed = -1;
        this.ballInHandMode = 0;
        this.cueBallY = -1;
        this.phase = 0;
        this.field_E = false;
        this.field_I = -1;
        this.field_n = -1;
        this.power = (short) -1;
        this.pottedBalls = new IntrusiveDeque();
        this.field_x = 0L;
        this.field_l = (byte) 0;
        this.field_R = null;
        this.endResolution = IntrusiveNodeHashTable.field_a;
        this.playerIndex = param1;
        this.shotNumber = param0;
    }

    static {
        timerMinutesSecondsFractions = "mm:ss.ff";
        rulePillar0 = "Honour";
        ratingLost = "Lost";
        unableToDeleteFriend = "Unable to delete friend - system busy";
        playerIsOut = "<%0> is out of lives!";
        menu = "Menu";
        menuTimeTrialWithGuides = "With Guides";
    }
}
