/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PartitioningManager implements DiffableState, SpatialStateMarker {
    private int revision;
    private PartitionZoneList[] zonelists;
    static String field_c;

    private final PartitionZone getOrCreateZone(int param0, int param1, int param2, int param3) {
        int var5 = this.hashZoneCoordinates(param3, param1, param0 + 8, param2);
        int var6 = param0 + this.zonelists.length & var5;
        if (null == this.zonelists[var6]) {
          this.zonelists[var6] = new PartitionZoneList();
        }
        ppb.field_b = this.zonelists[var6];
        return this.zonelists[var6].getOrCreateZone((byte) 120, param3, param1, param2);
    }

    final int collectBodyIds(int param0, int[] param1, int param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          var5_int = this.findZonesInBounds((byte) 93, param1, param2);
          var7 = 105 % ((-21 - param3) / 62);
          var6 = 0;
          for (var8 = 0; var5_int > var8; var8++) {
            var6 = kpb.field_s[var8].collectUniqueIds(-36, param0, var6);
          }
          stackIn_5_0 = var6;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("fba.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final PartitionZone findZone(int param0, int param1, int param2, byte param3) {
        int var5 = this.hashZoneCoordinates(param2, param1, 7, param0);
        PartitionZoneList var6 = this.zonelists[-1 + this.zonelists.length & var5];
        if (param3 < 108) {
          this.revision = 69;
        }
        ppb.field_b = var6;
        if (var6 == null) {
          return null;
        }
        return var6.findZone(100, param0, param2, param1);
    }

    final void removeBodyPartitions(int[] param0, int param1, int param2, boolean param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        PartitionZone var8 = null;
        int var9 = VoidHunters.field_G;
        try {
          var6_int = this.findZonesInBounds((byte) -102, param0, param2);
          for (var7 = param4; var7 < var6_int; var7++) {
            var8 = kpb.field_s[var7];
            AsteroidFieldFactory.field_c[var7].markChanged(param4 ^ -126);
            this.removeBodyFromZone(1, var8, param1);
          }
          if (param3) {
            this.decrementIdsAbove((byte) -63, param2, param1);
          }
          this.markChanged(-15536);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "fba.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int worldToGridX(int param0, int param1) {
        PartitionZone discarded$0 = null;
        if (param1 > -21) {
          discarded$0 = this.findZone(-94, -43, -100, (byte) -113);
        }
        if (0 > param0) {
          param0 = param0 - 65536;
        }
        return param0 / 65536;
    }

    final void saveBoundsForUpdate(int[] param0, byte param1) {
        try {
          int var3_int = 123 % ((6 - param1) / 45);
          SetReadyRoomMutatorTime.field_o[3] = param0[3];
          SetReadyRoomMutatorTime.field_o[0] = param0[0];
          SetReadyRoomMutatorTime.field_o[2] = param0[2];
          SetReadyRoomMutatorTime.field_o[1] = param0[1];
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "fba.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void finishZoneSelection(int param0, int param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        for (var3 = 1 + param0; var3 < bs.field_c; var3++) {
          kpb.field_s[var3] = null;
          AsteroidFieldFactory.field_c[var3] = null;
        }
        if (param1 <= 72) {
          this.revision = -33;
        }
        bs.field_c = param0;
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        PartitioningManager var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (PartitioningManager) (param1);
          var4 = 43 / ((param0 - 22) / 59);
          stackIn_1_0 = SetCountermeasureLauncherAimspeed.a(var3.zonelists, false, 1, this.zonelists, 122);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("fba.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void removeBodyPartitions(int param0, int[] param1, int param2, byte param3) {
        try {
          this.removeBodyPartitions(param1, param0, param2, false, 0);
          if (param3 >= -15) {
            field_c = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "fba.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void addBodyPartitions(int[] param0, byte param1, int param2, int param3) {
        int var6 = 0;
        int var5_int = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = VoidHunters.field_G;
        try {
          var5_int = this.getOrCreateZonesInBounds((byte) -123, param0, param3);
          for (var6 = 0; var6 < var5_int; var6++) {
            kpb.field_s[var6].addId(param2, -13251);
            AsteroidFieldFactory.field_c[var6].markChanged(-111);
          }
          this.markChanged(-15536);
          if (param1 < 1) {
            this.zonelists = (PartitionZoneList[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fba.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void addBodyToZone(boolean param0, int param1, int param2, int param3, int param4) {
        PartitionZone var6 = this.getOrCreateZone(-1, param1, param3, param4);
        if (!param0) {
          this.decrementIdsAbove((byte) -57, 94, 86);
        }
        var6.addId(param2, -13251);
        ppb.field_b.markChanged(-112);
    }

    private final int getOrCreateZonesInBounds(byte param0, int[] param1, int param2) {
        int var9 = 0;
        int var10 = 0;
        int incrementValue$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        PartitionZone var11 = null;
        int var12 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = VoidHunters.field_G;
        try {
          var4_int = this.worldToGridX(param1[0], -110);
          var5 = this.worldToGridX(param1[1], -80);
          if (param0 >= -37) {
            field_c = (String) null;
          }
          var6 = this.worldToGridY(param1[2], (byte) 19);
          var7 = this.worldToGridY(param1[3], (byte) 19);
          var8 = 0;
          for (var9 = var4_int; var5 >= var9; var9++) {
            for (var10 = var6; var10 <= var7; var10++) {
              var11 = this.getOrCreateZone(-1, var10, param2, var9);
              AsteroidFieldFactory.field_c[var8] = ppb.field_b;
              incrementValue$1 = var8;
              var8++;
              kpb.field_s[incrementValue$1] = var11;
            }
          }
          this.finishZoneSelection(var8, 93);
          stackIn_10_0 = var8;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("fba.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int hashZoneCoordinates(int param0, int param1, int param2, int param3) {
        int var5 = 11 * param3 + param2 * param1 + 3 * param0;
        return var5;
    }

    final int findZonesInBounds(byte param0, int[] param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        PartitionZone var12 = null;
        int var13 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = VoidHunters.field_G;
        try {
          var5 = -18 % ((35 - param0) / 54);
          var4_int = this.worldToGridX(param1[0], -35);
          var6 = this.worldToGridX(param1[1], -109);
          var7 = this.worldToGridY(param1[2], (byte) 19);
          var8 = this.worldToGridY(param1[3], (byte) 19);
          var9 = 0;
          for (var10 = var4_int; var10 <= var6; var10++) {
            for (var11 = var7; var11 <= var8; var11++) {
              var12 = this.findZone(param2, var11, var10, (byte) 110);
              if (var12 != null) {
                if (AsteroidFieldFactory.field_c.length <= var9) {
                  this.growZoneScratchArrays((byte) -16);
                }
                AsteroidFieldFactory.field_c[var9] = ppb.field_b;
                incrementValue$1 = var9;
                var9++;
                kpb.field_s[incrementValue$1] = var12;
              }
            }
          }
          this.finishZoneSelection(var9, 88);
          stackIn_14_0 = var9;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("fba.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final int collectBodyIdsInCurrentBounds(int param0, int param1) {
        if (param0 > -75) {
          this.revision = 57;
        }
        return this.collectBodyIds(-1, SetReadyRoomMutatorTime.field_o, param1, 74);
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        if (param0 <= 112) {
          field_c = (String) null;
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        PartitioningManager var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (PartitioningManager) (other);
          CarouselSlot.reportStateArrayDifferences(var3.zonelists, 1, this.zonelists, false, 5547);
          var4 = 0;
          if (SetCountermeasureLauncherAimspeed.a(var3.zonelists, false, 1, this.zonelists, -99)) {
            var4 = 1;
            System.out.println("PartitionZoneList[] zonelists has changed. ");
          }
          if (obfuscationGuard > -19) {
            field_c = (String) null;
          }
          if (var4 != 0) {
            System.out.println("This instance of PartitioningManager has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("fba.F(");
          if (other == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        PartitionZone discarded$1 = null;
        int var7 = 0;
        IsaacPacketBuffer var3 = null;
        PartitionZoneList[] var4 = null;
        int var5 = 0;
        PartitionZoneList[] var6 = null;
        PartitionZoneList var8 = null;
        int var9 = 0;
        int stackIn_6_0 = 0;
        IsaacPacketBuffer stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var9 = VoidHunters.field_G;
        try {
          var3 = param0;
          var4 = this.zonelists;
          if (param1 >= -109) {
            discarded$1 = this.getOrCreateZone(-108, -16, 66, 92);
          }
          if (var4 == null) {
            stackIn_6_0 = 0;
          } else {
            stackIn_6_0 = var4.length;
          }
          var5 = stackIn_6_0;
          var3.writeBits(-632, var5, 10);
          if (var5 != 0) {
            var6 = var4;
            for (var7 = 0; var6.length > var7; var7++) {
              var8 = var6[var7];
              stackIn_12_0 = var3;
              stackIn_12_1 = 53;
              stackIn_13_2 = (var8 != null);
              if (DateOfBirthInput.writeBoolean(stackIn_12_0, stackIn_12_1, stackIn_13_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var3, var8);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("fba.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void removeBodyFromZone(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 2) {
          return;
        }
        PartitionZone var6 = this.findZone(param2, param1, param0, (byte) 114);
        if (var6 != null) {
          ppb.field_b.markChanged(param3 - 14);
          this.removeBodyFromZone(1, var6, param4);
        }
    }

    private final void growZoneScratchArrays(byte param0) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        PartitionZoneList[] var6 = new PartitionZoneList[AsteroidFieldFactory.field_c.length * 2];
        PartitionZoneList[] var2 = var6;
        for (var3_int = 0; AsteroidFieldFactory.field_c.length > var3_int; var3_int++) {
          var6[var3_int] = AsteroidFieldFactory.field_c[var3_int];
        }
        AsteroidFieldFactory.field_c = var2;
        if (param0 != -16) {
          this.revision = -122;
        }
        PartitionZone[] var3 = new PartitionZone[2 * kpb.field_s.length];
        for (var4 = 0; var4 < kpb.field_s.length; var4++) {
          var3[var4] = kpb.field_s[var4];
        }
        kpb.field_s = var3;
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        PartitioningManager var3 = (PartitioningManager) (param1);
        if (var3.revision == this.revision) {
          return;
        }
        try {
          if (param0 < 54) {
            field_c = (String) null;
          }
          var3.revision = this.revision;
          var3.zonelists = (PartitionZoneList[]) (SpriteDimensions.copyStateArrayByMode(var3.zonelists, this.zonelists, 1, GpuSprite.field_c, false));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "fba.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void clearPartitions(byte param0) {
        this.zonelists = new PartitionZoneList[1023];
        if (param0 != -10) {
          this.zonelists = (PartitionZoneList[]) null;
        }
    }

    private final void markChanged(int param0) {
        int fieldTemp$0 = GetDebugLineLife.field_p;
        GetDebugLineLife.field_p = GetDebugLineLife.field_p + 1;
        this.revision = fieldTemp$0;
        if (param0 != -15536) {
          this.revision = -3;
        }
    }

    private final void decrementIdsAbove(byte param0, int param1, int param2) {
        int var4 = 0;
        PartitionZoneList var5;
        int var6;
        var6 = VoidHunters.field_G;
        if (param0 > -61) {
          return;
        }
        for (var4 = 0; var4 < this.zonelists.length; var4++) {
          var5 = this.zonelists[var4];
          if (var5 != null) {
            var5.decrementIdsAbove(param2, param1, (byte) -21);
          }
        }
    }

    final void updateBodyPartitions(int param0, int param1, int param2, int[] param3) {
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
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
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var13Lifetime5;
        int var13Lifetime6;
        int var13Lifetime7;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var14Lifetime5;
        int var14Lifetime6;
        int var14Lifetime7;
        var15 = VoidHunters.field_G;
        try {
          if (param1 < 0) {
            return;
          }
          var5_int = this.worldToGridX(SetReadyRoomMutatorTime.field_o[0], -78);
          var6 = this.worldToGridX(SetReadyRoomMutatorTime.field_o[1], param0 - 43);
          var7 = this.worldToGridY(SetReadyRoomMutatorTime.field_o[2], (byte) 19);
          var8 = this.worldToGridY(SetReadyRoomMutatorTime.field_o[3], (byte) 19);
          var9 = this.worldToGridX(param3[0], -81);
          var10 = this.worldToGridX(param3[param0], -110);
          var11 = this.worldToGridY(param3[2], (byte) 19);
          var12 = this.worldToGridY(param3[3], (byte) 19);
          if (var5_int == var9 &&
            var6 == var10 &&
            var11 == var7 &&
            var12 == var8) {
            return;
          }
          for (var13 = var5_int; var9 > var13; var13++) {
            for (var14 = var7; var8 >= var14; var14++) {
              this.removeBodyFromZone(var13, var14, param1, 2, param2);
            }
          }
          for (var13Lifetime1 = var10 + 1; var13Lifetime1 <= var6; var13Lifetime1++) {
            for (var14Lifetime1 = var7; var8 >= var14Lifetime1; var14Lifetime1++) {
              this.removeBodyFromZone(var13Lifetime1, var14Lifetime1, param1, 2, param2);
            }
          }
          for (var13Lifetime2 = var7; var13Lifetime2 < var11; var13Lifetime2++) {
            for (var14Lifetime2 = var5_int; var6 >= var14Lifetime2; var14Lifetime2++) {
              this.removeBodyFromZone(var14Lifetime2, var13Lifetime2, param1, 2, param2);
            }
          }
          for (var13Lifetime3 = var12 + 1; var13Lifetime3 <= var8; var13Lifetime3++) {
            for (var14Lifetime3 = var5_int; var14Lifetime3 <= var6; var14Lifetime3++) {
              this.removeBodyFromZone(var14Lifetime3, var13Lifetime3, param1, 2, param2);
            }
          }
          for (var13Lifetime4 = var9; var5_int > var13Lifetime4; var13Lifetime4++) {
            for (var14Lifetime4 = var11; var14Lifetime4 <= var12; var14Lifetime4++) {
              this.addBodyToZone(true, var14Lifetime4, param2, param1, var13Lifetime4);
            }
          }
          for (var13Lifetime5 = var6 + 1; var13Lifetime5 <= var10; var13Lifetime5++) {
            for (var14Lifetime5 = var11; var14Lifetime5 <= var12; var14Lifetime5++) {
              this.addBodyToZone(true, var14Lifetime5, param2, param1, var13Lifetime5);
            }
          }
          for (var13Lifetime6 = var11; var7 > var13Lifetime6; var13Lifetime6++) {
            for (var14Lifetime6 = var9; var10 >= var14Lifetime6; var14Lifetime6++) {
              this.addBodyToZone(true, var13Lifetime6, param2, param1, var14Lifetime6);
            }
          }
          for (var13Lifetime7 = 1 + var8; var13Lifetime7 <= var12; var13Lifetime7++) {
            for (var14Lifetime7 = var9; var14Lifetime7 <= var10; var14Lifetime7++) {
              this.addBodyToZone(true, var13Lifetime7, param2, param1, var14Lifetime7);
            }
          }
          this.markChanged(-15536);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_62_0 = var5;
          stackIn_62_1 = new StringBuilder().append("fba.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(')').toString());
        }
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          this.zonelists = (PartitionZoneList[]) (SetAutoDetail.a(10, GpuSprite.field_c, param0, 1, -102, this.zonelists));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "fba.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int worldToGridY(int param0, byte param1) {
        int discarded$0 = 0;
        if (param1 != 19) {
          discarded$0 = this.hashZoneCoordinates(-36, 62, -65, -108);
        }
        if (0 > param0) {
          param0 = param0 - 65536;
        }
        return param0 / 65536;
    }

    PartitioningManager() {
        this.revision = 0;
        this.markChanged(-15536);
        this.clearPartitions((byte) -10);
    }

    private final void removeBodyFromZone(int param0, PartitionZone param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        PartitionZoneList var10 = null;
        SerializableGameState var12 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1.removeId(param2, 8)) {
            var5 = param1.gridx;
            var6 = param1.gridy;
            var7 = param1.type;
            var8 = this.hashZoneCoordinates(var5, var6, 7, var7);
            var9 = var8 & this.zonelists.length - 1;
            var10 = this.zonelists[var9];
            if (var10 != null &&
              var10.removeZone(var7, param0 - 6776, var6, var5)) {
              this.zonelists[var9] = null;
            }
          }
          if (param0 != 1) {
            var12 = (SerializableGameState) null;
            this.differsFrom((byte) 36, (SerializableGameState) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("fba.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_c = "No votes";
    }
}
