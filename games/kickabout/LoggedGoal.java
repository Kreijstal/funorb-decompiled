/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoggedGoal extends IntrusiveNode {
    private int keeperState;
    private int keeperX;
    private int kickCharge;
    private int keeperY;
    int goalType;
    static Sprite field_o;
    int scorerTeam;
    private int scorerY;
    private int scorerX;
    int scorerParticipant;
    int time;
    private int kickVelocityY;
    private boolean highKick;
    private int kickVelocityX;
    int field_f;
    private int scorerSlot;

    final static void a(Sprite param0, ArgbSprite param1, ArgbSprite param2, int param3) {
        int var4_int = 0;
        int var5 = Kickabout.field_G;
        int var4_intLifetime1;
        try {
          GameModesHelpScreen.field_L = param1;
          StrongCacheEntry.field_w = param2;
          ArchivePreloader.field_i = new ArgbSprite[73];
          for (var4_int = 0; var4_int < ArchivePreloader.field_i.length; var4_int++) {
            ArchivePreloader.field_i[var4_int] = param2;
          }
          PlayerShopScreen.field_R = new Sprite(32, 32);
          PacketBuffer.a(-49, PlayerShopScreen.field_R);
          var4_intLifetime1 = 88 / ((param3 + 76) / 44);
          param0.drawScaledAveraged(0, 0, 32, 32);
          TeamManagementScreen.e(123);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ch.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void readFromBuffer(PacketBuffer param0, byte param1) {
        try {
          this.scorerParticipant = param0.readUnsignedByte((byte) -109);
          this.scorerTeam = param0.readUnsignedByte((byte) -113);
          this.scorerSlot = param0.readUnsignedByte((byte) -122);
          this.field_f = param0.readUnsignedByte((byte) -114);
          this.scorerX = param0.readUnsignedShort((byte) 81);
          this.scorerY = param0.readUnsignedShort((byte) 81);
          int var3_int = -82 / ((-7 - param1) / 53);
          this.goalType = param0.readUnsignedByte((byte) -127);
          this.kickCharge = param0.readUnsignedByte((byte) -110);
          this.highKick = param0.readUnsignedByte((byte) -123) == 1 ? true : false;
          this.kickVelocityX = param0.readUnsignedByte((byte) -105);
          this.kickVelocityY = param0.readUnsignedByte((byte) -120);
          this.keeperX = param0.readUnsignedShort((byte) 81);
          this.keeperY = param0.readUnsignedShort((byte) 81);
          this.keeperState = param0.readUnsignedByte((byte) -118);
          this.time = param0.readUnsignedShort((byte) 81);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ch.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder var1;
        int var2;
        StringBuilder var3;
        var2 = Kickabout.field_G;
        var3 = new StringBuilder();
        var1 = var3;
        StringBuilder discarded$0 = var3.append(" p=(" + this.scorerX + "," + this.scorerY + ")/" + this.scorerTeam + "/" + this.scorerSlot + "/" + this.field_f);
        StringBuilder discarded$1 = var3.append(" b=(" + this.kickVelocityX + "," + this.kickVelocityY + ")");
        if (this.goalType == 0) {
          discarded$2 = var3.append(" !!null!!");
        } else {
          if (2 == this.goalType) {
            discarded$3 = var3.append(" cross");
          } else {
            if (this.goalType != 3) {
              if (this.goalType != 1) {
                discarded$4 = var3.append(" invalid_goaltype/" + this.goalType);
              } else {
                discarded$5 = var3.append(" kick/" + this.kickCharge + "/" + this.highKick);
              }
            } else {
              discarded$6 = var3.append(" header");
            }
          }
        }
        StringBuilder discarded$7 = var3.append(" g=(" + this.keeperX + "," + this.keeperY + ")/" + this.keeperState);
        StringBuilder discarded$8 = var3.append(" time=" + this.time);
        return "LoggedGoal{" + var3 + "}";
    }

    public static void releaseStatics(byte param0) {
        field_o = null;
        int var1 = -25 / ((28 - param0) / 44);
    }

    final void captureKickGoal(CommonGame param0, int param1, int param2, int param3, FootballerAgent param4, int param5, FootballerAgent param6, int param7, int param8) {
        try {
          this.captureGoal(param7, param2, param3, 1, param5, param0, param1 + 87, param8);
          if (param1 != 32) {
            this.kickVelocityY = -65;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ch.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void copyFrom(int param0, LoggedGoal param1) {
        try {
          this.highKick = param1.highKick;
          this.kickCharge = param1.kickCharge;
          this.keeperState = param1.keeperState;
          this.time = param1.time;
          this.keeperX = param1.keeperX;
          this.keeperY = param1.keeperY;
          this.goalType = param1.goalType;
          this.scorerY = param1.scorerY;
          this.scorerTeam = param1.scorerTeam;
          this.scorerX = param1.scorerX;
          this.kickVelocityX = param1.kickVelocityX;
          this.scorerSlot = param1.scorerSlot;
          this.scorerParticipant = param1.scorerParticipant;
          this.kickVelocityY = param1.kickVelocityY;
          if (param0 != -4) {
            ResourceArchive var4 = (ResourceArchive) null;
            LoggedGoal.ensureArchiveAvailable(-13, (ResourceArchive) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ch.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void captureGoal(int param0, int param1, int param2, int param3, int param4, CommonGame param5, int param6, int param7) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        FootballerAgent var10 = null;
        int var11 = 0;
        FootballerAgent var12 = null;
        var11 = Kickabout.field_G;
        try {
          var12 = param5.field_P[param2][param7];
          if (param6 < 109) {
            return;
          }
          var10 = param5.field_P[1 - param2][0];
          this.scorerParticipant = param0;
          this.scorerTeam = param2;
          this.scorerSlot = param7;
          this.scorerX = var12.pixelX(-124);
          this.scorerY = var12.pixelY(true);
          if (param3 == 2) {
            this.kickVelocityY = var12.field_m;
            this.goalType = 2;
            this.highKick = false;
            this.kickCharge = 0;
            this.kickVelocityX = var12.field_k;
          } else {
            if (3 != param3) {
              this.kickCharge = param4;
              this.kickVelocityX = var12.field_x;
              this.goalType = 1;
              this.highKick = var12.field_O;
              this.kickVelocityY = var12.field_P;
            } else {
              this.goalType = 3;
              this.kickCharge = 0;
              this.kickVelocityX = var12.field_k;
              this.highKick = false;
              this.kickVelocityY = var12.field_m;
            }
          }
          this.keeperX = var10.pixelX(-93);
          this.keeperY = var10.pixelY(true);
          this.time = param1;
          this.keeperState = var10.field_o;
          while (true) {
            if (127 >= Math.abs(this.kickVelocityX) &&
              Math.abs(this.kickVelocityY) <= 127) {
              return;
            }
            this.kickVelocityX = this.kickVelocityX / 2;
            this.kickVelocityY = this.kickVelocityY / 2;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_15_0 = var9;
          stackIn_15_1 = new StringBuilder().append("ch.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void captureGoalFromAction(byte param0, int param1, FootballerAgent param2, int param3, int param4, int param5, int param6, CommonGame param7, FootballerAgent param8) {
        if (param0 != 35) {
          return;
        }
        try {
          this.captureGoal(param1, param4, param6, param5, 0, param7, param0 ^ 91, param3);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ch.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean ensureArchiveAvailable(int param0, ResourceArchive param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            field_o = (Sprite) null;
          }
          stackIn_3_0 = param1.ensureAllGroupsAvailable(false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ch.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public LoggedGoal() {
        this.goalType = 0;
    }

    static {
    }
}
