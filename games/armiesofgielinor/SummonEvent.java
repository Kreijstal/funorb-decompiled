/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SummonEvent extends GameEvent {
    int playerId;
    private int strengthBonus;
    private boolean applied;
    static je field_F;
    int tileX;
    static long field_G;
    static ResourceArchive field_B;
    int tileY;
    private int unitType;
    private boolean field_y;

    final static rn a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        rn stackIn_12_0 = null;
        rn stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.length();
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          if (param1 < -12) {
            stackIn_14_0 = ov.field_h;
            return stackIn_14_0;
          }
          stackIn_12_0 = (rn) null;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("mb.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        if (this.applied) {
          return;
        }
        try {
          this.applied = true;
          battlefield.a(false, this.tileX, this.unitType, this.tileY, 1, this.playerId, this.strengthBonus);
          this.unit = battlefield.getUnitAt(this.tileY, true, this.tileX);
          this.unit.packedFlag8 = this.unit.packedFlag8 | this.field_y;
          if (obfuscationGuard != -26661) {
            this.unitType = -119;
          }
          fl.a(battlefield, obfuscationGuard + 26537);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mb.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static Unit readStoredUnit(int unitType, int formatVersion, int tileY, int tileX, PacketBuffer packet, Battlefield battlefield, int obfuscationGuard, boolean detached) {
        Unit stackIn_2_0 = null;
        Unit stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Unit var16 = null;
        int var17 = 0;
        try {
          if (obfuscationGuard > -75) {
            stackIn_2_0 = (Unit) null;
            return stackIn_2_0;
          }
          var8_int = packet.readUnsignedByte(0);
          var9 = packet.readUnsignedShort((byte) -104);
          var10 = packet.readUnsignedByte(0);
          var11 = packet.readByte((byte) 110);
          var12 = packet.readUnsignedByte(0);
          var13 = packet.readUnsignedByte(0);
          var14 = packet.readUnsignedByte(0);
          var15 = packet.readUnsignedByte(0);
          if (var14 == 255) {
            var14 = -1;
          }
          var16 = new Unit(tileX, tileY, unitType, var8_int >> 5, var10, var11, var9, var13, 7 & var8_int, battlefield, var12 & 15, var12 >> 4, var14, detached, var15);
          var16.movementFlags = packet.readUnsignedByte(0);
          if ((var16.movementFlags & 4) != 0) {
            var16.displayName = packet.readNullCircumfixedString((byte) 121);
          }
          if (formatVersion > 0) {
            var17 = packet.readUnsignedByte(0);
            if ((2 & var17) != 0) {
              var16.tag = packet.readUnsignedByte(0);
            }
            if (0 != (1 & var17)) {
              var16.objectiveId = packet.readUnsignedByte(0);
            }
          }
          stackIn_15_0 = var16;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("mb.D(").append(unitType).append(',').append(formatVersion).append(',').append(tileY).append(',').append(tileX).append(',');
          if (packet == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (battlefield == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(obfuscationGuard).append(',').append(detached).append(')').toString());
        }
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        Battlefield var5 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param2.field_y = -2;
          if (param1 > -84) {
            var5 = (Battlefield) null;
            this.applyToBattlefield((Battlefield) null, 15);
          }
          stackIn_3_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("mb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        int var4 = 46 % ((53 - obfuscationGuard) / 51);
        if (verbose) {
          System.out.println("Summon event debug");
          System.out.println("Player " + this.playerId);
          System.out.println("Unit at " + this.tileX + "," + this.tileY);
          System.out.println("Type " + this.unitType + " Bonus" + this.strengthBonus);
        }
        String var3 = "EventSummon: pos: (" + this.tileX + "," + this.tileY + "), bonus: " + this.strengthBonus + ", player: " + this.playerId;
        return var3;
    }

    public static void d(byte param0) {
        field_F = null;
        if (param0 <= 103) {
          Battlefield var2 = (Battlefield) null;
          SummonEvent.readStoredUnit(48, -43, -111, 118, (PacketBuffer) null, (Battlefield) null, -109, true);
        }
        field_B = null;
    }

    SummonEvent(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        this.tileY = param2;
        this.field_y = param5 ? true : false;
        this.eventKind = 2;
        this.playerId = param4;
        this.strengthBonus = param3;
        this.unitType = param0;
        this.tileX = param1;
    }

    SummonEvent(int unitType, int tileX, int tileY, int strengthBonus, int playerId) {
        this.tileY = tileY;
        this.unitType = unitType;
        this.eventKind = 2;
        this.field_y = false;
        this.playerId = playerId;
        this.tileX = tileX;
        this.strengthBonus = strengthBonus;
    }

    static {
    }
}
