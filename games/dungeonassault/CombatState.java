/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CombatState {
    static int[] field_e;
    static boolean[] field_w;
    PackedBitSet field_v;
    static int field_x;
    String field_f;
    static DisplayNameSelectionPanel field_c;
    static String field_n;
    static int field_a;
    static int field_r;
    DungeonTileState[] field_h;
    PackedBitSet field_p;
    static volatile long field_z;
    PackedBitSet field_j;
    private PackedBitSet field_d;
    int field_i;
    int field_B;
    int field_g;
    int field_y;
    int field_t;
    Raider field_u;
    int field_k;
    Raider[] field_A;
    private int field_s;
    int field_q;
    int field_l;
    int field_o;
    private PackedBitSet field_b;
    PackedBitSet field_m;

    CombatState(PacketBuffer param0, boolean param1) {
        this();
        try {
          this.readCombatState(111, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void raiseNearbyMonsterDetection(int param0, int param1, int param2) {
        mo discarded$0 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        DungeonTileState var12;
        DungeonTileState var13;
        DungeonTileState var14;
        DungeonTileState var15;
        DungeonTileState var16;
        DungeonTileState var17;
        DungeonTileState var18;
        DungeonTileState var19;
        DungeonTileState var20;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        int var8Lifetime7;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var9Lifetime6;
        int var9Lifetime7;
        var11 = DungeonAssault.field_K;
        if (param1 <= 0) {
          return;
        }
        stackIn_5_0 = (param2 <= 6) ? 0 : 1;
        var4 = stackIn_5_0;
        if (param0 != -3) {
          var12 = (DungeonTileState) null;
          discarded$0 = this.resolveSingleRaiderMonsterEncounter(-113, (DungeonTileState) null, (byte) -64, true);
        }
        stackIn_10_0 = (param2 >= 42) ? 0 : 1;
        var5 = stackIn_10_0;
        stackIn_13_0 = (param2 % 7 == 0) ? 0 : 1;
        var6 = stackIn_13_0;
        stackIn_16_0 = (param2 % 7 == 6) ? 0 : 1;
        var7 = stackIn_16_0;
        if (var4 != 0 &&
          var6 != 0) {
          var8 = param2 - 8;
          var9 = param1;
          if (!this.field_j.isBitSet(var8, (byte) 79)) {
            var13 = this.field_h[var8];
            if (var13.field_h != null &&
              2 == var13.field_h.field_g) {
              var13.field_q = var13.field_q + var9;
            }
          }
        }
        if (var4 != 0) {
          var8Lifetime1 = param2 - 7;
          var9Lifetime1 = param1;
          if (!this.field_j.isBitSet(var8Lifetime1, (byte) 78)) {
            var14 = this.field_h[var8Lifetime1];
            if (null != var14.field_h &&
              var14.field_h.field_g == 2) {
              var14.field_q = var14.field_q + var9Lifetime1;
            }
          }
        }
        if (var4 != 0 &&
          var7 != 0) {
          var8Lifetime2 = -6 + param2;
          var9Lifetime2 = param1;
          if (!this.field_j.isBitSet(var8Lifetime2, (byte) 90)) {
            var15 = this.field_h[var8Lifetime2];
            if (var15.field_h != null &&
              2 == var15.field_h.field_g) {
              var15.field_q = var15.field_q + var9Lifetime2;
            }
          }
        }
        if (var6 != 0) {
          var8Lifetime3 = param2 - 1;
          var9Lifetime3 = param1;
          if (!this.field_j.isBitSet(var8Lifetime3, (byte) 110)) {
            var16 = this.field_h[var8Lifetime3];
            if (var16.field_h != null &&
              var16.field_h.field_g == 2) {
              var16.field_q = var16.field_q + var9Lifetime3;
            }
          }
        }
        if (var7 != 0) {
          var8Lifetime4 = param2 + 1;
          var9Lifetime4 = param1;
          if (!this.field_j.isBitSet(var8Lifetime4, (byte) 124)) {
            var17 = this.field_h[var8Lifetime4];
            if (null != var17.field_h &&
              2 == var17.field_h.field_g) {
              var17.field_q = var17.field_q + var9Lifetime4;
            }
          }
        }
        if (var5 != 0 &&
          var6 != 0) {
          var8Lifetime5 = param2 + 6;
          var9Lifetime5 = param1;
          if (!this.field_j.isBitSet(var8Lifetime5, (byte) 82)) {
            var18 = this.field_h[var8Lifetime5];
            if (null != var18.field_h &&
              var18.field_h.field_g == 2) {
              var18.field_q = var18.field_q + var9Lifetime5;
            }
          }
        }
        if (var5 != 0) {
          var8Lifetime6 = 7 + param2;
          var9Lifetime6 = param1;
          if (!this.field_j.isBitSet(var8Lifetime6, (byte) 117)) {
            var19 = this.field_h[var8Lifetime6];
            if (var19.field_h != null &&
              var19.field_h.field_g == 2) {
              var19.field_q = var19.field_q + var9Lifetime6;
            }
          }
        }
        if (var5 != 0 &&
          var7 != 0) {
          var8Lifetime7 = 8 + param2;
          var9Lifetime7 = param1;
          if (!this.field_j.isBitSet(var8Lifetime7, (byte) 115)) {
            var20 = this.field_h[var8Lifetime7];
            if (var20.field_h != null &&
              2 == var20.field_h.field_g) {
              var20.field_q = var20.field_q + var9Lifetime7;
            }
          }
        }
        return;
    }

    final void setRaidOutcome(int param0, int param1) {
        int var4 = 0;
        Raider[] var3;
        Raider var5;
        int var6;
        Raider[] var7;
        var6 = DungeonAssault.field_K;
        this.setCombatMode(false, 128);
        if (param0 != 32768) {
          field_r = -77;
        }
        this.field_g = param1;
        if (this.field_g != 1) {
          var7 = this.field_A;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.field_n.hasAbility(ob.field_ec, param0 ^ 32863)) {
              var5.markDead(false);
            }
          }
        }
    }

    final mo resolveTargetRoomAction(byte param0, int param1) {
        int stackIn_34_0 = 0;
        int stackIn_44_0 = 0;
        DungeonTileState var3;
        ac var4;
        int var5;
        int var6;
        int var7;
        int var8;
        DungeonTileState var9;
        int var7Lifetime1;
        if (null == this.field_u) {
          throw new IllegalStateException("Combat raider is null");
        }
        if (0 != (2 & this.field_u.field_o)) {
          throw new IllegalStateException("Combat raider is incapacitated.");
        }
        if ((this.field_u.field_o & 4) != 0) {
          throw new IllegalStateException("Combat raider is dead.");
        }
        var9 = this.field_h[this.field_B];
        var3 = var9;
        var4 = var9.field_h;
        var6 = 70 % ((param0 + 23) / 40);
        var5 = this.field_u.field_k;
        if ((2 & this.field_u.field_d) != 0) {
          var5 = var5 << 1;
        }
        var5 = var5 - this.field_i;
        if (0 > var5) {
          var5 = 0;
        }
        if (var4.a((byte) -59, 13)) {
          this.clearTargetRoomAndAdvance(false);
        }
        if (var4.a((byte) -77, 14)) {
          var3.field_i = this.rollOpposedSkillCheck(var9.field_p, (byte) 124, this.field_u.field_g);
        }
        if (1 == var9.field_h.field_g) {
          if (this.field_u.field_n.hasAbility(ob.field_hc, -67) &&
            var4.a((byte) -68, 11)) {
            this.clearTargetRoomAndAdvance(false);
            return new mo(66, 36864);
          }
          if (this.rollOpposedSkillCheck(var9.field_q, (byte) 126, var5)) {
            this.clearTargetRoomAndAdvance(false);
            return new mo(66, 36864);
          }
          this.applyRoomEntryDetectionEffects(this.field_B, true, -12331);
          if (this.rollOpposedSkillCheck(var9.field_r, (byte) 126, this.field_u.field_f)) {
            this.clearTargetRoomAndAdvance(false);
            return new mo(66, 20480);
          }
          this.resolveFailedRoomAction(116);
          var7 = 0;
          if (0 != (this.field_u.field_o & 4)) {
            return new mo(66, 2048 | var7);
          }
          return new mo(66, 0 | var7);
        }
        if (var9.field_h.field_g != 2) {
          if (var9.field_h.field_g != 3) {
            throw new IllegalStateException("Can't enter combat in special room");
          }
          if (var4.a((byte) -53, 10)) {
            if (this.rollOpposedSkillCheck(var9.field_r, (byte) 124, this.field_u.field_f)) {
              this.clearTargetRoomAndAdvance(false);
              return new mo(66, 36864);
            }
            this.applyRoomTriggerDetectionEffects(true, 116, this.field_B);
            this.resolveFailedRoomAction(27);
            return new mo(66, 0);
          }
          if (this.rollOpposedSkillCheck(var9.field_q, (byte) 125, var5)) {
            this.clearTargetRoomAndAdvance(false);
            return new mo(66, 36864);
          }
          this.applyRoomEntryDetectionEffects(this.field_B, true, -12331);
          this.resolveFailedRoomAction(105);
          return new mo(66, 0);
        }
        stackIn_34_0 = (!this.rollOpposedSkillCheck(var5, (byte) 126, var9.field_q)) ? 0 : 1;
        var7Lifetime1 = stackIn_34_0;
        if (var7Lifetime1 != 0) {
          this.applyRoomEntryDetectionEffects(this.field_B, true, -12331);
        }
        if (var4.a((byte) -125, 3) &&
          var7Lifetime1 == 0) {
          if (!this.rollOpposedSkillCheck(var9.field_r, (byte) 126, this.field_u.field_f)) {
            this.resolveFailedRoomAction(2);
            stackIn_44_0 = (0 != (4 & this.field_u.field_o)) ? 2048 : 0;
            var8 = stackIn_44_0;
          } else {
            this.clearTargetRoomAndAdvance(false);
            var8 = 4096;
          }
          return new mo(66, var8);
        }
        if (var4.a((byte) -44, 15) &&
          var7Lifetime1 == 0) {
          this.moveCurrentTileToTarget(-111);
          this.setCombatMode(false, 32);
          this.setCombatMode(false, 8);
          return new mo(66, 0);
        }
        return this.resolveMonsterEncounter(var7Lifetime1 != 0, var9, param1, (byte) 98);
    }

    private final void readTileMask(PackedBitSet param0, PacketBuffer param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          param0.field_f[0] = param1.readUnsignedMedium(param2 + 22957);
          param0.field_f[1] = param1.readUnsignedShort(0);
          var4_int = param1.readUnsignedByte(true);
          param0.field_f[1] = mp.bitwiseOr(param0.field_f[1], nb.bitwiseAnd(var4_int << 16, 65536));
          param0.field_f[0] = mp.bitwiseOr(param0.field_f[0], nb.bitwiseAnd(254, var4_int) << 24);
          if (param2 != -23082) {
            this.field_t = -3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("pj.KA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void checkPartyDefeat(Raider param0, int param1) {
        boolean discarded$1 = false;
        int var3_int = 0;
        Raider[] var4 = null;
        int var5 = 0;
        Raider var6 = null;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = DungeonAssault.field_K;
        try {
          if (this.field_k != 128) {
            var3_int = 0;
            var4 = this.field_A;
            var5 = 0;
            while (true) {
              if (var4.length > var5) {
                var6 = var4[var5];
                if (var6 != null &&
                  0 == (6 & var6.field_o)) {
                  var3_int = 1;
                } else {
                  var5++;
                  continue;
                }
              }
              if (var3_int != 0) {
                break;
              }
              this.setRaidOutcome(32768, 4);
              break;
            }
          }
          if (param1 != 6) {
            discarded$1 = this.rollOpposedSkillCheck(67, (byte) -109, -29);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("pj.GA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void readCombatState(int param0, boolean param1, PacketBuffer param2) {
        DungeonTileState dupTemp$0 = null;
        Raider stackIn_19_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        var5 = DungeonAssault.field_K;
        try {
          this.readGridPassageMask(105, param2, this.field_v);
          dupTemp$0 = new DungeonTileState(3);
          this.field_h[48] = dupTemp$0;
          this.field_h[42] = dupTemp$0;
          this.field_h[6] = dupTemp$0;
          this.field_h[0] = dupTemp$0;
          this.field_h[24] = new DungeonTileState(2);
          for (var4_int = 0; 49 > var4_int; var4_int++) {
            if (0 != var4_int &&
              var4_int != 6 &&
              var4_int != 24 &&
              var4_int != 42 &&
              var4_int != 48) {
              this.field_h[var4_int] = bl.a(param1, param2, false);
            }
          }
          this.readTileMask(this.field_p, param2, -23082);
          this.readTileMask(this.field_j, param2, -23082);
          this.field_q = param2.readByte((byte) 2);
          this.field_B = param2.readByte((byte) 2);
          for (var4_intLifetime1 = 0; var4_intLifetime1 < 4; var4_intLifetime1++) {
            this.field_A[var4_intLifetime1] = DirectByteStorage.a(var4_intLifetime1, -1, param2);
          }
          if (param0 < 57) {
            this.field_y = 110;
          }
          var4_intLifetime2 = param2.readUnsignedByte(true);
          if (4 > var4_intLifetime2) {
            stackIn_19_1 = this.field_A[var4_intLifetime2];
          } else {
            stackIn_19_1 = null;
          }
          this.field_u = stackIn_19_1;
          this.field_g = param2.readUnsignedByte(true);
          this.setCombatMode(false, param2.readUnsignedByte(true));
          this.field_t = param2.readUnsignedByte(true);
          this.field_s = param2.readUnsignedByte(true);
          if (param1) {
            this.field_f = param2.readPrefixedString(-21030);
          } else {
            this.field_o = param2.readUnsignedMedium(-110);
            this.field_y = param2.readUnsignedMedium(-94);
            this.field_l = param2.readUnsignedMedium(-107);
            this.readTileMask(this.field_d, param2, -23082);
          }
          if (this.field_q != -1) {
            this.rebuildReachableTiles(this.field_q, (byte) 107);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("pj.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final boolean rollOpposedSkillCheck(int param0, byte param1, int param2) {
        int var4;
        boolean stackIn_7_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_22_0 = false;
        if (param1 < 123) {
          return false;
        }
        if (param2 == 0) {
          stackIn_7_0 = (param0 == 0) && (DraggableWidgetContainer.b(0, 2) == 0);
          return stackIn_7_0;
        }
        if (0 == param0) {
          return true;
        }
        var4 = param2 - param0;
        if (var4 < -10) {
          return false;
        }
        if (0 > var4) {
          var4 = 1 << -var4;
          stackIn_16_0 = (DraggableWidgetContainer.b(0, 1 + var4) == 0);
          return stackIn_16_0;
        }
        if (var4 > 10) {
          return true;
        }
        var4 = 1 << var4;
        stackIn_22_0 = (DraggableWidgetContainer.b(0, 1 + var4) != 0);
        return stackIn_22_0;
    }

    private final mo resolveMonsterEncounter(boolean param0, DungeonTileState param1, int param2, byte param3) {
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_1 = 0;
        mo stackIn_30_0 = null;
        int stackIn_34_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        mo stackIn_94_0 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        RaiderDefinition var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        Raider var19 = null;
        int var13Lifetime1;
        var18 = DungeonAssault.field_K;
        try {
          stackIn_4_0 = (param0) ? 0 : 1;
          var5_int = stackIn_4_0;
          var6 = this.field_u.field_n;
          if (var6.hasAbility(ob.field_Ob, param3 - 223)) {
            var5_int = 1;
          }
          if (param2 == 2) {
            var5_int = 0;
          }
          var7 = 0;
          var8 = param1.field_h.a(0, 17);
          var9 = this.field_u.field_g;
          if (param3 != 98) {
            var19 = (Raider) null;
            this.checkPartyDefeat((Raider) null, -125);
          }
          var10 = this.field_u.field_e;
          var11 = param1.field_p;
          var12 = param1.field_g;
          if ((1 & this.field_u.field_d) != 0) {
            var9 = var9 << 1;
          }
          if ((1 & this.field_t) == 0) {
            stackIn_19_0 = ((this.field_u.field_d & 4) != 0) ? 1 : 0;
          } else {
            stackIn_19_0 = 1;
          }
          var13 = stackIn_19_0;
          stackIn_21_0 = var13;
          if (param1.field_h.field_g != 2) {
            stackIn_22_1 = 0;
          } else {
            stackIn_22_1 = 1;
          }
          var13Lifetime1 = stackIn_21_0 & stackIn_22_1;
          if (var13Lifetime1 != 0) {
            var12 = var12 + 1 >> 1;
            var11 = var11 + 1 >> 1;
          }
          var11 = var11 - this.field_i;
          if (var11 < 0) {
            var11 = 0;
          }
          if (param1.field_h.a((byte) -115, 7) &&
            var9 << 1 <= var11) {
            this.setRaidOutcome(param3 + 32670, 3);
            stackIn_30_0 = new mo(66, 32768);
            return stackIn_30_0;
          }
          stackIn_34_0 = (!param0) ? 0 : 16384;
          var14 = stackIn_34_0;
          if (var5_int != 0) {
            var14 = var14 | 8192;
          }
          if (2 == param2) {
            var14 = var14 | 32768;
          }
          if (param2 == 1) {
            var10++;
            var9--;
          }
          var15 = 0;
          scanLoop1: while (true) {
            var15++;
            if (var5_int != 0) {
              if (param2 != 2) {
                stackIn_47_0 = var10;
              } else {
                stackIn_47_0 = this.field_u.field_f;
              }
              var16 = stackIn_47_0;
              if (param2 != 2) {
                stackIn_50_0 = var12;
              } else {
                stackIn_50_0 = param1.field_r;
              }
              var17 = stackIn_50_0;
              if (param2 != 2 &&
                var6.hasAbility(ob.field_jc, 87) &&
                var7 == 0) {
                var16 = var16 << 1;
                var14 = var14 | 1024;
                var7 = 1;
              }
              if (this.rollOpposedSkillCheck(var17, (byte) 124, var16) ||
                var15 > 100) {
                if (2 == param2) {
                  this.resetTargetToCurrentTile(-8);
                  var14 = var14 | 4096;
                  break scanLoop1;
                }
                if (0 >= var8) {
                  this.clearTargetRoomAndAdvance(false);
                  var14 = var14 | 4096;
                  break scanLoop1;
                }
                var14 = var14 | 512;
                var8--;
              }
              if ((0 == var16 &&
                var17 != 0 ||
                var17 > 10 + var16) &&
                (param1.field_p == 0 &&
                0 != this.field_u.field_g ||
                !(10 + param1.field_p >= this.field_u.field_g))) {
                var14 = var14 | 4096;
                if (2 == param2) {
                  this.resetTargetToCurrentTile(-8);
                } else {
                  this.clearTargetRoomAndAdvance(false);
                }
                var15 = 5;
                break scanLoop1;
              }
            }
            var5_int = 1;
            if (!this.rollOpposedSkillCheck(var9, (byte) 127, var11)) {
              continue;
            }
            if (var6.hasAbility(ob.field_kc, 87) &&
              this.field_u.field_o == 0) {
              this.field_u.field_o = this.field_u.field_o | 1;
              continue;
            }
            if (var6.hasAbility(ob.field_mc, 119) &&
              var7 == 0) {
              var14 = var14 | 1024;
              var7 = 1;
              continue;
            }
            this.resolveFailedRoomAction(param3 - 183);
            if ((4 & this.field_u.field_o) == 0) {
              if (var15 > 5) {
                var15 = 5;
              }
              return new mo(66, var14 | var15);
            }
            var14 = var14 | 2048;
            break;
          }
          if (var15 > 5) {
            var15 = 5;
          }
          stackIn_94_0 = new mo(66, var14 | var15);
          return stackIn_94_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_97_0 = var5;
          stackIn_97_1 = new StringBuilder().append("pj.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearCombatStateGlobals(int param0) {
        field_c = null;
        field_e = null;
        field_n = null;
        field_w = null;
        if (param0 < 111) {
          CombatState.sleepMillis(43, 127L);
        }
    }

    final double calculateDragonWakeRisk(int param0, int param1, int param2) {
        if (param2 <= 45) {
          return -0.5947890367550314;
        }
        return this.calculateAdjustedDragonWakeRisk(param0, this.field_y, param1, 2, this.field_o);
    }

    final void applyRoomEntryDetectionEffects(int param0, boolean param1, int param2) {
        DungeonTileState var4 = this.field_h[param0];
        ac var5 = var4.field_h;
        this.raiseDungeonMonsterDetection(var5.a(param2 ^ param2, 9), param2 ^ -21561);
        this.raiseNearbyMonsterDetection(-3, var5.a(0, 5), param0);
    }

    final void setCombatMode(boolean param0, int param1) {
        Raider[] var3;
        int var4;
        Raider var5;
        int var6;
        Raider[] var7;
        Raider[] var8;
        int var9;
        Raider var10;
        int var4Lifetime1;
        Raider[] var3Lifetime1;
        var6 = DungeonAssault.field_K;
        this.field_k = param1;
        if (32 == this.field_k) {
          var7 = this.field_A;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_d = 0;
            }
          }
          this.field_t = 0;
        }
        this.field_i = 0;
        if (param0) {
          return;
        }
        var8 = this.field_A;
        var3Lifetime1 = var8;
        var9 = 0;
        var4Lifetime1 = var9;
        while (var9 < var8.length) {
          var10 = var8[var9];
          if (var10 != null &&
            var10.field_n.hasAbility(ob.field_gc, -91) &&
            0 == (var10.field_o & 6)) {
            this.field_i = this.field_i + 1;
          }
          var9++;
        }
        return;
    }

    final mo resolveHoardGoldTheft(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 18833) {
          this.field_t = 19;
        }
        PacketBuffer var6 = new PacketBuffer(3);
        var6.writeShort(param3, -128);
        if (this.rollDragonWakeCheck(param4, param3, param2 + 18031, param1, param0)) {
          var6.writeByte(6, 16 | this.applyDragonFireToParty((byte) 47));
          this.setRaidOutcome(32768, 2);
        } else {
          var6.writeByte(6, 0);
          this.setRaidOutcome(32768, 1);
        }
        return new mo(68, var6);
    }

    final void applyDragonFireToRaider(int param0, Raider param1) {
        int var3_int = 1;
        RaiderDefinition var4 = param1.field_n;
        if (var4.hasAbility(ob.field_kc, -92) &&
          0 == (param1.field_o & 1)) {
          return;
        }
        try {
          if (var4.hasAbility(ob.field_Vb, 101)) {
            var3_int = 0;
          }
          if (var4.hasAbility(ob.field_Sb, -88) &&
            !(param1.field_g <= 1)) {
            param1.field_g = param1.field_g - 1;
            var3_int = 0;
          }
          if (var3_int == 0) {
            param1.markIncapacitated(3);
          } else {
            param1.markDead(false);
          }
          param1.field_o = param1.field_o | 8;
          if (param0 <= 97) {
            this.field_g = 87;
          }
          this.checkPartyDefeat(param1, 6);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "pj.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int findReachableApproachTile(int param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        int[] var9 = this.getConnectedNeighborTiles((byte) -107, param0);
        int[] var3 = var9;
        int[] var8 = var9;
        int[] var4 = var8;
        int var5Lifetime1;
        int var6Lifetime1;
        for (var5 = 0; var5 < var8.length; var5++) {
          var6 = var8[var5];
          if (~this.field_q == ~var6) {
            return this.field_q;
          }
        }
        var4 = var9;
        for (var5Lifetime1 = 0; var5Lifetime1 < var4.length; var5Lifetime1++) {
          var6Lifetime1 = var4[var5Lifetime1];
          if (this.field_m.isBitSet(var6Lifetime1, (byte) 70)) {
            return var6Lifetime1;
          }
        }
        if (!param1) {
          field_w = (boolean[]) null;
        }
        return -1;
    }

    final boolean canUseRaiderAbility(int param0, Raider param1) {
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_127_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Raider[] var5 = null;
        int var6 = 0;
        Raider var7 = null;
        int var8 = 0;
        Raider[] var9 = null;
        Raider[] var10 = null;
        Raider var11 = null;
        Raider[] var12 = null;
        Raider var13 = null;
        Raider var14 = null;
        Raider[] var5Lifetime1;
        Raider var7Lifetime1;
        Raider[] var5Lifetime2;
        Raider var7Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var8 = DungeonAssault.field_K;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.field_o;
          var4 = param1.field_n.field_s;
          if (var4 == -1) {
            return false;
          }
          if (param0 != (var3_int & 1)) {
            return false;
          }
          if (0 != (var3_int & 6)) {
            if (var4 != ob.field_nc &&
              var4 != ob.field_Ib) {
              return false;
            }
            if (param1.field_g <= 0) {
              return false;
            }
          }
          if (this.field_k == 128) {
            if ((var4 == ob.field_nc ||
              ob.field_Ib == var4) && var3_int == 12) {
              var9 = this.field_A;
              var5 = var9;
              for (var6 = 0; var6 < var9.length; var6++) {
                var11 = var9[var6];
                var7 = var11;
                if (var11 != null &&
                  (var11.field_o & 6) == 0) {
                  if (var11.field_n.field_z == 0) {
                    return true;
                  }
                  if (var4 == ob.field_Ib &&
                    1 == var11.field_n.field_z) {
                    return true;
                  }
                }
              }
            }
            if (ob.field_Mb == var4) {
              if (var3_int != 0) {
                return false;
              }
              var5Lifetime2 = this.field_A;
              for (var6Lifetime3 = 0; var6Lifetime3 < var5Lifetime2.length; var6Lifetime3++) {
                var7Lifetime2 = var5Lifetime2[var6Lifetime3];
                if (var7Lifetime2 != null &&
                  (4 & var7Lifetime2.field_o) != 0 &&
                  var7Lifetime2.field_g > 0) {
                  return true;
                }
              }
            }
            return false;
          }
          if (this.field_k == 32 &&
            this.field_u != param1) {
            return false;
          }
          if ((this.field_k & ob.field_cc[var4]) == 0) {
            return false;
          }
          if (this.field_u != param1) {
            if (var4 == ob.field_Wb) {
              return false;
            }
            if (ob.field_nc == var4) {
              return false;
            }
            if (var4 == ob.field_Ib) {
              return false;
            }
            if (var4 == ob.field_lc) {
              return false;
            }
            if (var4 == ob.field_Gb) {
              return false;
            }
            if (ob.field_Ub == var4) {
              return false;
            }
            if (ob.field_Zb == var4) {
              return false;
            }
          }
          if (ob.field_Mb == var4) {
            var12 = this.field_A;
            for (var6Lifetime1 = 0; var12.length > var6Lifetime1; var6Lifetime1++) {
              var13 = var12[var6Lifetime1];
              if (var13 != null &&
                (4 & var13.field_o) != 0 &&
                var13.field_g > 0) {
                return true;
              }
            }
            return false;
          }
          if (ob.field_lc == var4 &&
            this.field_h[this.field_B].field_h.field_g == 1) {
            return false;
          }
          if (var4 != ob.field_nc &&
            var4 != ob.field_Ib) {
            return true;
          }
          var10 = this.field_A;
          var5Lifetime1 = this.field_A;
          for (var6Lifetime2 = 0; var6Lifetime2 < var10.length; var6Lifetime2++) {
            var14 = var10[var6Lifetime2];
            var7Lifetime1 = var14;
            if (var7Lifetime1 != null &&
              (6 & var14.field_o) == 0) {
              if (var14.field_n.field_z == 0) {
                return true;
              }
              if (var4 == ob.field_Ib &&
                var14.field_n.field_z == 1) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_126_0 = var3;
          stackIn_126_1 = new StringBuilder().append("pj.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_127_2 = "null";
          } else {
            stackIn_127_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_126_0), ((StringBuilder) (Object) stackIn_126_1).append(stackIn_127_2).append(')').toString());
        }
    }

    private final boolean rollDragonWakeCheck(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_7_0 = false;
        if (param2 != 36864) {
          this.applyRoomFailureEffects((byte) 20, -103, true);
        }
        stackIn_7_0 = !(param4 >= param1) || ((ProxySocketConnector.a((byte) -21) < this.calculateAdjustedDragonWakeRisk(param3, param0, param1, 2, param4)));
        return stackIn_7_0;
    }

    final PackedBitSet buildRevealedTilePassageMask(byte param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        IntrusiveDeque var9;
        PackedBitSet var10;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = DungeonAssault.field_K;
        var10 = new PackedBitSet(84);
        var3 = 0;
        if (param0 > -1) {
          var9 = (IntrusiveDeque) null;
          this.visitReachableNeighborTile((IntrusiveDeque) null, -59, -23, 96, true);
        }
        for (var4 = 0; var4 < 7; var4++) {
          for (var5 = 0; 6 > var5; var5++) {
            var6 = var4 * 7 + var5;
            var7 = var6 + 1;
            if (!this.field_p.isBitSet(var6, (byte) 84)) {
              if (this.field_p.isBitSet(var7, (byte) 120)) {
                var10.setBit(var3, -94);
              }
            } else {
              var10.setBit(var3, -94);
            }
            var3++;
          }
        }
        for (var4Lifetime1 = 0; var4Lifetime1 < 6; var4Lifetime1++) {
          for (var5Lifetime1 = 0; var5Lifetime1 < 7; var5Lifetime1++) {
            var6Lifetime1 = var5Lifetime1 + 7 * var4Lifetime1;
            var7Lifetime1 = 7 + var6Lifetime1;
            if (!this.field_p.isBitSet(var6Lifetime1, (byte) 90)) {
              if (this.field_p.isBitSet(var7Lifetime1, (byte) 80)) {
                var10.setBit(var3, -79);
              }
            } else {
              var10.setBit(var3, -79);
            }
            var3++;
          }
        }
        return var10;
    }

    private final void raiseDungeonMonsterDetection(int param0, int param1) {
        int var3 = 0;
        int var4;
        int var5;
        int var7;
        DungeonTileState var6;
        var7 = DungeonAssault.field_K;
        if (param0 <= 0) {
          return;
        }
        if (param1 != 25618) {
          this.resolveHoardGoldTheft(-100, 90, 70, -104, 105);
        }
        for (var3 = 0; var3 < 49; var3++) {
          var4 = var3;
          var5 = param0;
          if (!this.field_j.isBitSet(var4, (byte) 104)) {
            var6 = this.field_h[var4];
            if (null != var6.field_h &&
              var6.field_h.field_g == 2) {
              var6.field_q = var6.field_q + var5;
            }
          }
        }
    }

    final mo resolveSingleRaiderRoomAction(int param0, int param1) {
        ac var4;
        int var5;
        int var6;
        DungeonTileState var7;
        if (this.field_u == null) {
          throw new IllegalStateException("Combat raider is null");
        }
        if (0 != (2 & this.field_u.field_o)) {
          throw new IllegalStateException("Combat raider is incapacitated.");
        }
        if ((4 & this.field_u.field_o) != 0) {
          throw new IllegalStateException("Combat raider is dead.");
        }
        var7 = this.field_h[this.field_B];
        var4 = var7.field_h;
        var5 = this.field_u.field_k;
        if ((2 & this.field_u.field_d) != 0) {
          var5 = var5 << 1;
        }
        var5 = var5 - this.field_i;
        if (0 > var5) {
          var5 = 0;
        }
        if (param0 >= -86) {
          field_e = (int[]) null;
        }
        if (var7.field_h.field_g == 1) {
          if (this.field_u.field_n.hasAbility(ob.field_hc, 72) &&
            var4.a((byte) -49, 11)) {
            this.clearTargetRoomAndAdvance(false);
            return new mo(66, 36864);
          }
          if (this.rollOpposedSkillCheck(this.field_u.field_f, (byte) 127, var5)) {
            this.clearTargetRoomAndAdvance(false);
            return new mo(66, 36864);
          }
          this.applyRoomEntryDetectionEffects(this.field_B, true, -12331);
          this.clearTargetRoomAndAdvance(false);
          return new mo(66, 20480);
        }
        if (var7.field_h.field_g == 2) {
          var6 = this.rollOpposedSkillCheck(var5, (byte) 126, var7.field_q) ? 1 : 0;
          if (var6 != 0) {
            this.applyRoomEntryDetectionEffects(this.field_B, true, -12331);
          }
          return this.resolveSingleRaiderMonsterEncounter(param1, var7, (byte) 26, var6 != 0);
        }
        if (var7.field_h.field_g != 3) {
          throw new IllegalStateException("Can't enter combat in special room");
        }
        if (!var4.a((byte) -65, 10)) {
          if (this.rollOpposedSkillCheck(var7.field_q, (byte) 127, var5)) {
            this.clearTargetRoomAndAdvance(false);
            return new mo(66, 36864);
          }
          this.applyRoomEntryDetectionEffects(this.field_B, true, -12331);
          this.resolveFailedRoomAction(113);
          return new mo(66, 0);
        }
        if (this.rollOpposedSkillCheck(var7.field_r, (byte) 124, this.field_u.field_f)) {
          this.clearTargetRoomAndAdvance(false);
          return new mo(66, 36864);
        }
        this.applyRoomTriggerDetectionEffects(true, 123, this.field_B);
        this.resolveFailedRoomAction(124);
        return new mo(66, 0);
    }

    final void enterDungeonRoom(Raider param0, boolean param1, int param2) {
        DungeonTileState var5 = null;
        boolean stackIn_11_1 = false;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_B = this.findReachableApproachTile(param2, param1);
          if (this.field_B != -1) {
            this.moveCurrentTileToTarget(-92);
          }
          this.field_p.setBit(param2, -118);
          this.field_B = param2;
          var5 = this.field_h[param2];
          if (0 == var5.field_a ||
            var5.field_a == 3) {
            this.field_j.setBit(param2, -113);
            this.field_d.setBit(param2, -77);
          }
          if (2 != var5.field_a &&
            !this.field_j.isBitSet(param2, (byte) 117)) {
            stackIn_11_1 = !(param1);
            this.setCombatMode(stackIn_11_1, 16);
            this.field_u = param0;
            return;
          }
          this.moveCurrentTileToTarget(-113);
          stackIn_15_1 = !(param1);
          this.setCombatMode(stackIn_15_1, 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("pj.V(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void applyRoomTriggerDetectionEffects(boolean param0, int param1, int param2) {
        DungeonTileState var4 = this.field_h[param2];
        ac var5 = var4.field_h;
        if (param1 < 112) {
          return;
        }
        this.raiseDungeonMonsterDetection(var5.a(0, 8), 25618);
        this.raiseNearbyMonsterDetection(-3, var5.a(0, 4), param2);
    }

    final int[] getTilePassageIndices(int param0, byte param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var6 = 0;
        int var3;
        int[] var4;
        int var5;
        int var7;
        var7 = DungeonAssault.field_K;
        var3 = 0;
        if (param0 % 7 != 0) {
          if (this.field_v.isBitSet(param0 - 1 - param0 / 7, (byte) 116)) {
            incrementValue$0 = var3;
            var3++;
            GuestPlayConfirmationForm.field_S[incrementValue$0] = param0 - 1 - param0 / 7;
            if (param0 % 7 != 6 &&
              this.field_v.isBitSet(param0 - param0 / 7, (byte) 125)) {
              incrementValue$1 = var3;
              var3++;
              GuestPlayConfirmationForm.field_S[incrementValue$1] = -(param0 / 7) + param0;
            }
          } else {
            if (param0 % 7 != 6 &&
              this.field_v.isBitSet(param0 - param0 / 7, (byte) 125)) {
              incrementValue$2 = var3;
              var3++;
              GuestPlayConfirmationForm.field_S[incrementValue$2] = -(param0 / 7) + param0;
            }
          }
        } else {
          if (param0 % 7 != 6 &&
            this.field_v.isBitSet(param0 - param0 / 7, (byte) 125)) {
            incrementValue$3 = var3;
            var3++;
            GuestPlayConfirmationForm.field_S[incrementValue$3] = -(param0 / 7) + param0;
          }
        }
        if (6 < param0 &&
          this.field_v.isBitSet(35 + param0, (byte) 88)) {
          incrementValue$4 = var3;
          var3++;
          GuestPlayConfirmationForm.field_S[incrementValue$4] = 35 + param0;
        }
        if (param0 < 42 &&
          this.field_v.isBitSet(param0 + 42, (byte) 77)) {
          incrementValue$5 = var3;
          var3++;
          GuestPlayConfirmationForm.field_S[incrementValue$5] = param0 + 42;
        }
        var4 = new int[var3];
        var5 = 111 % ((param1 - 29) / 45);
        for (var6 = 0; var6 < var3; var6++) {
          var4[var6] = GuestPlayConfirmationForm.field_S[var6];
        }
        return var4;
    }

    final int getMaximumHoardGoldToSteal(int param0) {
        int var4 = 0;
        int var2;
        Raider[] var3_ref_hb__;
        Raider var5;
        int var6;
        int var3;
        var6 = DungeonAssault.field_K;
        var2 = 0;
        var3_ref_hb__ = this.field_A;
        for (var4 = 0; var4 < var3_ref_hb__.length; var4++) {
          var5 = var3_ref_hb__[var4];
          if (var5 != null &&
            (var5.field_o & 6) == 0) {
            var2 = var2 + (var5.field_k + var5.field_e - (-var5.field_g - var5.field_f));
          }
        }
        if (param0 > -77) {
          field_w = (boolean[]) null;
        }
        var3 = 100 * var2;
        if (var3 > 50000) {
          var3 = 50000;
        }
        if (this.field_o < var3) {
          var3 = this.field_o;
        }
        return var3;
    }

    final int[] getConnectedNeighborTiles(byte param0, int param1) {
        int var3 = -77 % ((param0 - 41) / 40);
        return nf.a(this.field_v, param1, (byte) 123);
    }

    private final void applyRoomFailureEffects(byte param0, int param1, boolean param2) {
        int var10 = 0;
        ac var5;
        int var6;
        int var7;
        int var8;
        Raider[] var9;
        Raider var11;
        int var12;
        DungeonTileState var13;
        var12 = DungeonAssault.field_K;
        var13 = this.field_h[param1];
        if (param0 != -52) {
          CombatState.clearCombatStateGlobals(-22);
        }
        var5 = var13.field_h;
        if (param2) {
          var6 = var5.a(param0 ^ -52, 0);
          var7 = var5.a(0, 1);
          this.reduceRaiderAttackAndDefence(var7, var6, this.field_u, -110);
          if (var5.a((byte) -88, 6)) {
            if (var13.field_h.field_k << 1 > var13.field_l) {
              var13.field_g = var13.field_g + 1;
              var13.field_l = var13.field_l + 1;
            }
            if (var13.field_h.field_A << 1 > var13.field_j) {
              var13.field_p = var13.field_p + 1;
              var13.field_j = var13.field_j + 1;
            }
          }
          var8 = var5.a(0, 16);
          if (var8 > 0) {
            var9 = this.field_A;
            for (var10 = 0; var10 < var9.length; var10++) {
              var11 = var9[var10];
              if (var11 != null &&
                0 == (6 & var11.field_o)) {
                this.reduceRaiderAttackAndDefence(var8, var8, var11, param0 ^ 124);
              }
            }
          }
        }
    }

    final void moveCurrentTileToTarget(int param0) {
        if (-1 != this.field_q &&
          this.field_h[this.field_q].field_h.a((byte) -64, 2)) {
          this.field_j.clearBit(this.field_q, 31);
        }
        if (param0 > -83) {
          return;
        }
        this.field_q = this.field_B;
        this.rebuildReachableTiles(this.field_q, (byte) -90);
    }

    final static void sleepMillis(int param0, long param1) {
        if ((long)param0 >= param1) {
          return;
        }
        if (param1 % 10L != 0L) {
          SectorCacheStore.sleepIgnoringInterrupts(param1, (byte) -113);
        } else {
          SectorCacheStore.sleepIgnoringInterrupts(param1 - 1L, (byte) -107);
          SectorCacheStore.sleepIgnoringInterrupts(1L, (byte) -73);
        }
    }

    final void clearTargetRoomAndAdvance(boolean param0) {
        this.field_j.setBit(this.field_B, -108);
        this.field_d.setBit(this.field_B, -72);
        DungeonTileState var3 = this.field_h[this.field_B];
        DungeonTileState var2 = var3;
        if (var3.field_l > var3.field_h.field_k) {
          var2.field_l = var3.field_h.field_k;
        }
        if (var3.field_h.field_y < var3.field_s) {
          var2.field_s = var3.field_h.field_y;
        }
        if (var3.field_o > var3.field_h.field_r) {
          var2.field_o = var3.field_h.field_r;
        }
        if (var3.field_h.field_A < var3.field_j) {
          var2.field_j = var3.field_h.field_A;
        }
        this.moveCurrentTileToTarget(-111);
        this.setCombatMode(false, 32);
        this.setCombatMode(param0, 8);
    }

    final void resolveFailedRoomAction(int param0) {
        int var10 = 0;
        int stackIn_6_0 = 0;
        ac var3;
        int var4;
        RaiderDefinition var5;
        int var6;
        int var7;
        int var8;
        Raider[] var9;
        Raider var11;
        int var12;
        DungeonTileState var13;
        var12 = DungeonAssault.field_K;
        var13 = this.field_h[this.field_B];
        var3 = var13.field_h;
        var4 = var3.field_g;
        var5 = this.field_u.field_n;
        if (var4 == 3) {
          this.moveCurrentTileToTarget(-106);
          this.field_j.setBit(this.field_B, -77);
          this.field_d.setBit(this.field_B, -104);
          this.setCombatMode(false, 32);
          this.setCombatMode(false, 8);
          return;
        }
        stackIn_6_0 = (!var13.field_i) ? 0 : 1;
        var6 = stackIn_6_0;
        if (var6 != 0 &&
          !var3.a((byte) -77, 12)) {
          if (var5.hasAbility(ob.field_Vb, -100)) {
            var6 = 0;
          }
          if (var5.hasAbility(ob.field_kc, -69) &&
            var13.field_m &&
            this.field_u.field_o == 0) {
            this.field_u.field_o = this.field_u.field_o | 1;
            this.clearTargetRoomAndAdvance(false);
            return;
          }
          if (var5.hasAbility(ob.field_Sb, 88) &&
            this.field_u.field_g > 1) {
            var6 = 0;
            this.field_u.field_g = this.field_u.field_g - 1;
          }
        }
        if (var5.hasAbility(ob.field_Qb, 89)) {
          var6 = 1;
        }
        if (var6 == 0) {
          this.field_u.markIncapacitated(3);
        } else {
          this.field_u.markDead(false);
        }
        this.applyRoomFailureEffects((byte) -52, this.field_B, true);
        this.field_B = this.field_q;
        this.setCombatMode(false, 32);
        var7 = 0;
        var8 = -43 % ((62 - param0) / 32);
        var9 = this.field_A;
        for (var10 = 0; var9.length > var10; var10++) {
          var11 = var9[var10];
          if (!this.canUseRaiderAbility(0, var11)) {
            continue;
          }
          var7 = 1;
          break;
        }
        if (var7 == 0) {
          this.setCombatMode(false, 8);
        }
        this.checkPartyDefeat(this.field_u, 6);
        return;
    }

    final static String formatPlayerNameWithTitle(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 66) {
            var4 = (String) null;
            CombatState.formatPlayerNameWithTitle((byte) -8, -92, (String) null);
          }
          if (param2 == null) {
            stackIn_5_0 = ValidationStatusIcon.field_K;
          } else {
            stackIn_5_0 = (String) (param2);
          }
          param2 = stackIn_5_0;
          if (MouseInput.a(125, param1)) {
            stackIn_9_0 = SectorCacheStore.a(param1, param2, 255);
            return stackIn_9_0;
          }
          stackIn_7_0 = (String) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("pj.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final mo resolveSingleRaiderMonsterEncounter(int param0, DungeonTileState param1, byte param2, boolean param3) {
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_1 = 0;
        mo stackIn_30_0 = null;
        int stackIn_34_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        mo stackIn_73_0 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        RaiderDefinition var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var13Lifetime1;
        var18 = DungeonAssault.field_K;
        try {
          stackIn_4_0 = (param3) ? 0 : 1;
          var5_int = stackIn_4_0;
          var6 = this.field_u.field_n;
          if (var6.hasAbility(ob.field_Ob, 70)) {
            var5_int = 1;
          }
          if (param0 == 2) {
            var5_int = 0;
          }
          var7 = 0;
          var8 = param1.field_h.a(0, 17);
          var9 = this.field_u.field_g;
          var10 = this.field_u.field_e;
          var11 = param1.field_p;
          if (param2 >= 16) {
          }
          var12 = param1.field_g;
          if ((1 & this.field_u.field_d) != 0) {
            var9 = var9 << 1;
          }
          if ((1 & this.field_t) == 0) {
            stackIn_18_0 = ((this.field_u.field_d & 4) != 0) ? 1 : 0;
          } else {
            stackIn_18_0 = 1;
          }
          var13 = stackIn_18_0;
          stackIn_20_0 = var13;
          if (param1.field_h.field_g != 2) {
            stackIn_21_1 = 0;
          } else {
            stackIn_21_1 = 1;
          }
          var13Lifetime1 = stackIn_20_0 & stackIn_21_1;
          if (var13Lifetime1 != 0) {
            var11 = 1 + var11 >> 1;
            var12 = 1 + var12 >> 1;
          }
          var11 = var11 - this.field_i;
          if (var11 < 0) {
            var11 = 0;
          }
          if (param1.field_h.a((byte) -78, 7) &&
            var9 << 1 <= var11) {
            this.setRaidOutcome(32768, 3);
            stackIn_30_0 = new mo(66, 32768);
            return stackIn_30_0;
          }
          stackIn_34_0 = (param3) ? 16384 : 0;
          var14 = stackIn_34_0;
          if (var5_int != 0) {
            var14 = var14 | 8192;
          }
          if (param0 == 2) {
            var14 = var14 | 32768;
          }
          if (param0 == 1) {
            var10++;
            var9--;
          }
          var15 = 0;
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            var15++;
            if (var5_int != 0) {
              if (param0 != 2) {
                stackIn_47_0 = var10;
              } else {
                stackIn_47_0 = this.field_u.field_f;
              }
              var16 = stackIn_47_0;
              if (param0 != 2) {
                stackIn_50_0 = var12;
              } else {
                stackIn_50_0 = param1.field_r;
              }
              var17 = stackIn_50_0;
              if (param0 != 2 &&
                var6.hasAbility(ob.field_jc, 76) &&
                var7 == 0) {
                var7 = 1;
                var16 = var16 << 1;
              }
              boolean decompiledFrameRemainder1 = true;
              if (this.rollOpposedSkillCheck(var17, (byte) 127, var16)) {
                if (var8 <= 0) {
                  if (param0 == 2) {
                    this.resetTargetToCurrentTile(-8);
                  } else {
                    this.clearTargetRoomAndAdvance(false);
                  }
                  var14 = var14 | 4096;
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var8--;
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0 = !(var17 <= var16 + 5))) {
                if (param0 != 2) {
                  this.clearTargetRoomAndAdvance(false);
                } else {
                  this.resetTargetToCurrentTile(-8);
                }
                var14 = var14 | 4096;
                var15 = 5;
              }
              if (decompiledFrameRemainder0) {
                if (var15 > 5) {
                  var15 = 5;
                }
                stackIn_73_0 = new mo(66, var14 | var15);
                return stackIn_73_0;
              }
            }
            var5_int = 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_76_0 = var5;
          stackIn_76_1 = new StringBuilder().append("pj.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void reduceRaiderAttackAndDefence(int param0, int param1, Raider param2, int param3) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        Raider var7 = null;
        var6 = DungeonAssault.field_K;
        try {
          if (param2.field_n.hasAbility(ob.field_Ub, 53)) {
            if (param1 <= param2.field_e) {
              param2.field_e = param2.field_e - param1;
            } else {
              param1 = param1 - param2.field_e;
              param0 = param0 + param1;
              param2.field_e = 0;
            }
            if (param2.field_g - 1 < param0) {
              param0 = param0 - (param2.field_g - 1);
              param2.field_g = 1;
              if (param2.field_e >= param0) {
                param2.field_e = param2.field_e - param0;
              } else {
                param2.markDead(false);
              }
            } else {
              param2.field_g = param2.field_g - param0;
            }
          } else {
            if (param1 < param2.field_e) {
              param2.field_e = param2.field_e - param1;
            } else {
              param2.field_e = 0;
            }
            if (param2.field_g > param0) {
              param2.field_g = param2.field_g - param0;
            } else {
              param2.markDead(false);
            }
          }
          if (param3 > -68) {
            var7 = (Raider) null;
            this.enterDungeonRoom((Raider) null, false, -72);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("pj.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void readGridPassageMask(int param0, PacketBuffer param1, PackedBitSet param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = DungeonAssault.field_K;
        try {
          if (param0 < 96) {
            return;
          }
          for (var4_int = 0; param2.field_f.length > var4_int; var4_int++) {
            param2.field_f[var4_int] = param1.readInt(-50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("pj.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void resetTargetToCurrentTile(int param0) {
        this.field_B = this.field_q;
        this.setCombatMode(false, 32);
        if (param0 != -8) {
          this.field_l = 36;
        }
        this.setCombatMode(false, 8);
    }

    final boolean isTileSelectable(int param0, int param1) {
        if (param0 == -1) {
          return false;
        }
        DungeonTileState var3 = this.field_h[param0];
        if (param1 != 27747) {
          this.moveCurrentTileToTarget(-54);
        }
        if (this.field_k == 4) {
          return var3.field_a == 3 ? true : false;
        }
        if (8 != this.field_k &&
          this.field_k != 32) {
          return false;
        }
        return this.field_m.isBitSet(param0, (byte) 113);
    }

    private final int applyDragonFireToParty(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = DungeonAssault.field_K;
        if (param0 != 47) {
          this.setRaidOutcome(74, -22);
        }
        var2 = 0;
        for (var3 = 0; var3 < 4; var3++) {
          if (this.field_A[var3] != null &&
            (6 & this.field_A[var3].field_o) == 0 &&
            0 == DraggableWidgetContainer.b(0, 3) &&
            !this.field_A[var3].field_n.hasAbility(ob.field_bc, -85)) {
            this.applyDragonFireToRaider(param0 + 60, this.field_A[var3]);
            var2 = var2 | 1 << var3;
          }
        }
        return var2;
    }

    private final void rebuildReachableTiles(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        var5 = DungeonAssault.field_K;
        this.field_m.clearAllBits(1);
        this.field_b.clearAllBits(1);
        DiskArchiveRequest.field_I.clear(-4);
        DiskArchiveRequest.field_I.addFirst(new a(param0), false);
        this.field_m.setBit(param0, -63);
        var3 = 116 / ((10 - param1) / 60);
        while (!DiskArchiveRequest.field_I.isEmpty((byte) -69)) {
          var4 = ((a) (DiskArchiveRequest.field_I.removeLast((byte) -124))).field_j;
          if (var4 % 7 > 0) {
            this.visitReachableNeighborTile(DiskArchiveRequest.field_I, 49, var4 - 1, var4 - 1 - var4 / 7, true);
          }
          if (6 > var4 % 7) {
            this.visitReachableNeighborTile(DiskArchiveRequest.field_I, 49, 1 + var4, -(var4 / 7) + var4, false);
          }
          if (var4 > 6) {
            this.visitReachableNeighborTile(DiskArchiveRequest.field_I, 49, var4 - 7, var4 - 7 + 42, false);
          }
          if (var4 >= 42) {
            continue;
          }
          this.visitReachableNeighborTile(DiskArchiveRequest.field_I, 49, 7 + var4, var4 + 42, true);
        }
    }

    final int getTilePassageFlags(int param0, int param1) {
        if (param1 != 30813) {
          this.getTilePassageFlags(-124, -104);
        }
        int var3 = 0;
        if (param0 % 7 != 0 &&
          this.field_v.isBitSet(-(param0 / 7) - 1 + param0, (byte) 75)) {
          var3 = var3 | 1;
        }
        if (param0 % 7 != 6 &&
          this.field_v.isBitSet(param0 - param0 / 7, (byte) 110)) {
          var3 = var3 | 2;
        }
        if (param0 > 6 &&
          this.field_v.isBitSet(param0 + 35, (byte) 122)) {
          var3 = var3 | 4;
        }
        if (param0 < 42 &&
          this.field_v.isBitSet(42 + param0, (byte) 102)) {
          var3 = var3 | 8;
        }
        return var3;
    }

    private final double calculateAdjustedDragonWakeRisk(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var6;
        Raider var8;
        int var9;
        var9 = DungeonAssault.field_K;
        var6 = 0;
        for (var7 = 0; var7 < 4; var7++) {
          var8 = this.field_A[var7];
          if (var8 != null &&
            (6 & var8.field_o) == 0 &&
            var8.field_n.hasAbility(ob.field_Hb, 75)) {
            var6++;
          }
        }
        if (param3 != 2) {
          CombatState.sleepMillis(-70, 33L);
        }
        return EditableTextField.a((byte) 96, var6, param4, FullscreenFocusCanvas.a(this.field_s, (byte) -127, param0, param1), param2);
    }

    final mo applyRaiderAbility(Raider param0, PacketBuffer param1, int param2) {
        mo stackIn_9_0 = null;
        mo stackIn_16_0 = null;
        mo stackIn_21_0 = null;
        mo stackIn_25_0 = null;
        mo stackIn_30_0 = null;
        mo stackIn_33_0 = null;
        mo stackIn_37_0 = null;
        mo stackIn_41_0 = null;
        mo stackIn_54_0 = null;
        mo stackIn_57_0 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        PacketBuffer var10 = null;
        PacketBuffer var11 = null;
        Raider var12 = null;
        PacketBuffer var13 = null;
        PacketBuffer var14 = null;
        Raider var15 = null;
        PacketBuffer var16 = null;
        Raider var17 = null;
        PacketBuffer var18 = null;
        PacketBuffer var19 = null;
        PacketBuffer var20 = null;
        PacketBuffer var21 = null;
        PacketBuffer var22 = null;
        Raider var23 = null;
        PacketBuffer var25 = null;
        PacketBuffer var26 = null;
        PacketBuffer var27 = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var5Lifetime2;
        var8 = DungeonAssault.field_K;
        try {
          if (param2 <= 70) {
            this.field_B = 63;
          }
          param0.field_o = param0.field_o | 1;
          var4_int = param0.field_n.field_s;
          if (ob.field_Mb == var4_int) {
            var12 = this.field_A[param1.readUnsignedByte(true)];
            var12.field_o = var12.field_o & -5;
            var12.markIncapacitated(3);
            if (128 != this.field_k) {
              this.setCombatMode(false, 8);
            } else {
              this.setCombatMode(false, 128);
            }
            var13 = new PacketBuffer(3);
            var13.writeByte(6, 2);
            var13.writeByte(6, param0.field_j);
            var13.writeByte(6, var12.field_j);
            stackIn_9_0 = new mo(65, var13);
            return stackIn_9_0;
          }
          if (ob.field_dc != var4_int &&
            var4_int != ob.field_Nb) {
            if (var4_int != ob.field_nc &&
              var4_int != ob.field_Ib) {
              if (var4_int == ob.field_Zb) {
                var17 = this.field_A[param1.readUnsignedByte(true)];
                var17.markDead(false);
                param0.field_o = param0.field_o & -2;
                this.clearTargetRoomAndAdvance(false);
                var18 = new PacketBuffer(3);
                var18.writeByte(6, 2);
                var18.writeByte(6, param0.field_j);
                var18.writeByte(6, var17.field_j);
                stackIn_25_0 = new mo(65, var18);
                return stackIn_25_0;
              }
              if (var4_int != ob.field_lc &&
                ob.field_Gb != var4_int) {
                if (ob.field_Wb == var4_int) {
                  this.field_B = this.field_q;
                  this.setCombatMode(false, 8);
                  var20 = new PacketBuffer(2);
                  var20.writeByte(6, 1);
                  var20.writeByte(6, param0.field_j);
                  stackIn_33_0 = new mo(65, var20);
                  return stackIn_33_0;
                }
                if (var4_int == ob.field_Lb) {
                  var5 = param1.readUnsignedByte(true);
                  var6 = param1.readUnsignedByte(true);
                  this.field_p.setBit(var5, -88);
                  this.field_p.setBit(var6, -119);
                  this.setCombatMode(false, this.field_k);
                  var10 = new PacketBuffer(16);
                  var21 = var10;
                  var21.writeByte(6, 15);
                  var21.writeByte(6, param0.field_j);
                  var21.writeByte(6, var5);
                  var10.writeByte(6, var6);
                  this.field_h[var5].writeTileState(-12, true, var21);
                  var21.writeByte(6, this.getTilePassageFlags(var5, 30813));
                  this.field_h[var6].writeTileState(-12, true, var21);
                  var21.writeByte(6, this.getTilePassageFlags(var6, 30813));
                  stackIn_37_0 = new mo(65, var21);
                  return stackIn_37_0;
                }
                if (var4_int == ob.field_Pb) {
                  this.field_t = this.field_t | 1;
                  this.setCombatMode(false, this.field_k);
                  var22 = new PacketBuffer(2);
                  var22.writeByte(6, 1);
                  var22.writeByte(6, param0.field_j);
                  stackIn_41_0 = new mo(65, var22);
                  return stackIn_41_0;
                }
                if (var4_int != ob.field_fc &&
                  ob.field_Jb != var4_int &&
                  var4_int != ob.field_pc) {
                  if (var4_int != ob.field_Ub) {
                    throw new IllegalStateException("Invalid ability use!");
                  }
                  var5Lifetime2 = param1.readUnsignedByte(true);
                  var6Lifetime1 = param1.readUnsignedByte(true);
                  param0.field_e = var5Lifetime2;
                  param0.field_g = var6Lifetime1;
                  var25 = new PacketBuffer(4);
                  var25.writeByte(6, 3);
                  var25.writeByte(6, param0.field_j);
                  var25.writeByte(6, var5Lifetime2);
                  var25.writeByte(6, var6Lifetime1);
                  stackIn_57_0 = new mo(65, var25);
                  return stackIn_57_0;
                }
                var23 = this.field_A[param1.readUnsignedByte(true)];
                if (var4_int == ob.field_fc) {
                  var23.field_d = var23.field_d | 1;
                } else {
                  if (var4_int != ob.field_Jb) {
                    if (var4_int != ob.field_pc) {
                      this.setCombatMode(false, this.field_k);
                      var26 = new PacketBuffer(3);
                      var26.writeByte(6, 2);
                      var26.writeByte(6, param0.field_j);
                      var26.writeByte(6, var23.field_j);
                      return new mo(65, var26);
                    }
                    var23.field_d = var23.field_d | 4;
                  } else {
                    var23.field_d = var23.field_d | 2;
                  }
                }
                this.setCombatMode(false, this.field_k);
                var27 = new PacketBuffer(3);
                var27.writeByte(6, 2);
                var27.writeByte(6, param0.field_j);
                var27.writeByte(6, var23.field_j);
                stackIn_54_0 = new mo(65, var27);
                return stackIn_54_0;
              }
              this.clearTargetRoomAndAdvance(false);
              var19 = new PacketBuffer(2);
              var19.writeByte(6, 1);
              var19.writeByte(6, param0.field_j);
              stackIn_30_0 = new mo(65, var19);
              return stackIn_30_0;
            }
            var15 = this.field_A[param1.readUnsignedByte(true)];
            var15.markDead(false);
            param0.field_o = param0.field_o & -7;
            param0.field_o = param0.field_o & -2;
            this.setCombatMode(false, 8);
            var16 = new PacketBuffer(3);
            var16.writeByte(6, 2);
            var16.writeByte(6, param0.field_j);
            var16.writeByte(6, var15.field_j);
            stackIn_21_0 = new mo(65, var16);
            return stackIn_21_0;
          }
          var5Lifetime1 = param1.readUnsignedByte(true);
          this.field_p.setBit(var5Lifetime1, -128);
          if (ob.field_Nb == var4_int) {
            this.applyRoomEntryDetectionEffects(var5Lifetime1, false, -12331);
            this.applyRoomTriggerDetectionEffects(false, 115, var5Lifetime1);
            this.applyRoomFailureEffects((byte) -52, var5Lifetime1, false);
          }
          this.setCombatMode(false, this.field_k);
          var11 = new PacketBuffer(9);
          var14 = var11;
          var14.writeByte(6, 8);
          var14.writeByte(6, param0.field_j);
          var14.writeByte(6, var5Lifetime1);
          this.field_h[var5Lifetime1].writeTileState(-12, true, var14);
          var14.writeByte(6, this.getTilePassageFlags(var5Lifetime1, 30813));
          stackIn_16_0 = new mo(65, var14);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_61_0 = var4;
          stackIn_61_1 = new StringBuilder().append("pj.T(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void visitReachableNeighborTile(IntrusiveDeque param0, int param1, int param2, int param3, boolean param4) {
        String var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_v.isBitSet(param3, (byte) 92) &&
            !this.field_m.isBitSet(param2, (byte) 92)) {
            this.field_m.setBit(param2, -92);
            if (param1 != 49) {
              var7 = (String) null;
              CombatState.formatPlayerNameWithTitle((byte) 106, -25, (String) null);
            }
            if (!this.field_j.isBitSet(param2, (byte) 109)) {
              if (param4) {
                param3 += 84;
              }
              this.field_b.setBit(param3, param1 - 175);
            } else {
              param0.addFirst(new a(param2), false);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("pj.I(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    CombatState() {
        int var1 = 0;
        this.field_v = new PackedBitSet(84);
        this.field_h = new DungeonTileState[49];
        this.field_p = new PackedBitSet(49);
        this.field_j = new PackedBitSet(49);
        this.field_d = new PackedBitSet(49);
        this.field_g = 0;
        this.field_A = new Raider[4];
        this.field_B = -1;
        this.field_u = null;
        this.field_q = -1;
        this.field_k = 1;
        this.field_l = 0;
        for (var1 = 0; var1 < 49; var1++) {
          this.field_h[var1] = new DungeonTileState(0);
        }
        DungeonTileState dupTemp$0 = new DungeonTileState(3);
        this.field_h[48] = dupTemp$0;
        this.field_h[42] = dupTemp$0;
        this.field_h[6] = dupTemp$0;
        this.field_h[0] = dupTemp$0;
        this.field_h[24] = new DungeonTileState(2);
        this.field_p.setBit(0, -66);
        this.field_p.setBit(6, -80);
        this.field_p.setBit(42, -85);
        this.field_p.setBit(48, -84);
        this.field_b = new PackedBitSet(168);
        this.field_m = new PackedBitSet(49);
        this.field_m.setBit(0, -119);
        this.field_m.setBit(6, -76);
        this.field_m.setBit(42, -114);
        this.field_m.setBit(48, -90);
    }

    static {
        field_w = new boolean[64];
        field_n = "Email address is unavailable";
        field_x = 0;
        field_z = 0L;
    }
}
