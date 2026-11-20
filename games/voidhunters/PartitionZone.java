/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PartitionZone implements DiffableState, ofa, SortableValue {
    int[] ids;
    static java.security.SecureRandom field_a;
    int gridx;
    int type;
    static String field_g;
    int gridy;
    private int revision;
    static int field_e;

    final int collectUniqueIds(int param0, int param1, int param2) {
        int var7_int = 0;
        int incrementValue$0 = 0;
        int var4;
        int var5;
        int var8;
        int var6;
        int[] var7;
        var8 = VoidHunters.field_G;
        var4 = 0;
        if (param0 > -9) {
          this.removeId(105, -29);
        }
        while (this.ids.length > var4) {
          var5 = this.ids[var4];
          if (param1 != var5) {
            var6 = 0;
            for (var7_int = 0; var7_int < param2; var7_int++) {
              if (var5 != PartitionZoneListFactory.field_a[var7_int]) {
                continue;
              }
              var6 = 1;
              break;
            }
            if (var6 == 0) {
              if (PartitionZoneListFactory.field_a.length == param2) {
                var7 = new int[10 + PartitionZoneListFactory.field_a.length];
                ArrayOperations.copy(PartitionZoneListFactory.field_a, 0, var7, 0, PartitionZoneListFactory.field_a.length);
                PartitionZoneListFactory.field_a = var7;
              }
              incrementValue$0 = param2;
              param2++;
              PartitionZoneListFactory.field_a[incrementValue$0] = var5;
            }
          }
          var4++;
        }
        return param2;
    }

    public static void clearSharedReferences(boolean param0) {
        field_g = null;
        if (!param0) {
          PartitionZone.clearSharedReferences(true);
        }
        field_a = null;
    }

    final boolean removeId(int param0, int param1) {
        this.ids = MissionCondition.removeFirstValue(param0, (byte) 116, this.ids);
        this.markChanged((byte) -119);
        if (null == this.ids) {
          return true;
        }
        if (param1 != 8) {
          return true;
        }
        return false;
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        try {
          pgb.a(8, null != this.ids ? this.ids.length : 0, 73, param0, this.ids);
          param0.writeBits(-632, this.gridx, 8);
          if (param1 > -109) {
            this.gridy = -39;
          }
          param0.writeBits(-632, this.gridy, 8);
          param0.writeBits(-632, this.type, 2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jo.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int compareTo(Object param0, boolean param1) {
        PartitionZone var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = 114;
            return stackIn_2_0;
          }
          var3 = (PartitionZone) (param0);
          if (var3.gridx > this.gridx) {
            stackIn_20_0 = -1;
            return stackIn_20_0;
          }
          if (var3.gridx < this.gridx) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (this.gridy < var3.gridy) {
            stackIn_7_0 = -1;
            return stackIn_7_0;
          }
          if (var3.gridy < this.gridy) {
            stackIn_10_0 = 1;
            return stackIn_10_0;
          }
          if (this.type < var3.type) {
            stackIn_16_0 = -1;
            return stackIn_16_0;
          }
          if (this.type <= var3.type) {
            stackIn_22_0 = 0;
            return stackIn_22_0;
          }
          stackIn_14_0 = 1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("jo.I(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        PartitionZone var5 = null;
        try {
          if (obfuscationGuard >= -19) {
            this.ids = (int[]) null;
          }
          var5 = (PartitionZone) (other);
          var4 = 0;
          if (GetCountermeasuresCooldown.a(this.ids, var5.ids, false)) {
            var4 = 1;
            System.out.println("int[] ids has changed. ");
          }
          if (this.gridx != var5.gridx) {
            System.out.println("int gridx has changed. before=" + var5.gridx + ", now=" + this.gridx);
            var4 = 1;
          }
          if (this.gridy != var5.gridy) {
            var4 = 1;
            System.out.println("int gridy has changed. before=" + var5.gridy + ", now=" + this.gridy);
          }
          if (var5.type != this.type) {
            var4 = 1;
            System.out.println("int type has changed. before=" + var5.type + ", now=" + this.type);
          }
          if (var4 != 0) {
            System.out.println("This instance of PartitionZone has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("jo.F(");
          if (other == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        PartitionZone var3 = (PartitionZone) (param1);
        if (this.revision == var3.revision) {
          return;
        }
        try {
          var3.revision = this.revision;
          var3.ids = SetTeamSelectionSpeedup.copyIntsReusingArray(var3.ids, (byte) -55, this.ids);
          var3.gridy = this.gridy;
          var3.gridx = this.gridx;
          if (param0 <= 54) {
            IsaacPacketBuffer var4 = (IsaacPacketBuffer) null;
            this.writeState((IsaacPacketBuffer) null, 31);
          }
          var3.type = this.type;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jo.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void decrementIdsAbove(int param0, int param1) {
        int var3 = 0;
        int var4;
        IsaacPacketBuffer var5;
        var4 = VoidHunters.field_G;
        for (var3 = 0; var3 < this.ids.length; var3++) {
          if (param1 < this.ids[var3]) {
            this.ids[var3] = this.ids[var3] - 1;
            this.markChanged((byte) -82);
          }
        }
        if (param0 != 11964) {
          var5 = (IsaacPacketBuffer) null;
          this.writeState((IsaacPacketBuffer) null, 55);
        }
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          if (param1) {
            this.ids = (int[]) null;
          }
          this.ids = SetVariableActionFactory.a((byte) 37, this.ids, param0, 8);
          this.gridx = uwa.a(8, param0, (byte) 20);
          this.gridy = uwa.a(8, param0, (byte) 20);
          this.type = param0.readBits(0, 2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "jo.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        PartitionZone var3 = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (PartitionZone) (param1);
          var4 = 11 % ((22 - param0) / 59);
          stackIn_7_0 = (SetBlueprintSaveTime.a(var3.ids, this.ids, (byte) 28)) || (this.gridx != var3.gridx) || (this.gridy != var3.gridy) || (this.type != var3.type);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("jo.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void markChanged(byte param0) {
        if (param0 >= -57) {
          this.revision = -117;
        }
        int fieldTemp$0 = PlayerLeaveFactory.field_a;
        PlayerLeaveFactory.field_a = PlayerLeaveFactory.field_a + 1;
        this.revision = fieldTemp$0;
    }

    final void addId(int param0, int param1) {
        if (param1 != -13251) {
          this.collectUniqueIds(-116, 102, -62);
        }
        this.ids = AwardVictoryToTeamActionFactory.a(true, this.ids, param0, param1 + 42100, true);
        this.markChanged((byte) -77);
    }

    PartitionZone() {
        this.revision = 0;
        this.markChanged((byte) -92);
    }

    PartitionZone(int param0, int param1, int param2) {
        this.revision = 0;
        this.markChanged((byte) -92);
        this.type = param2;
        this.gridy = param1;
        this.gridx = param0;
    }

    static {
        field_g = "Blueprint Showdown";
        field_e = 500;
    }
}
