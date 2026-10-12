/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerProfile {
    CampaignProgress campaignProgress;
    private int runeDebit;
    int progressionCredit;
    int[] spellQuantities;
    static String field_e;
    int runeCredit;
    static String[] field_i;
    int[] unitUnlockMasks;
    int[] equippedSpellIds;
    static jl field_h;
    static int[] field_l;
    static je field_f;

    public static void b(int param0) {
        field_f = null;
        field_l = null;
        field_e = null;
        field_i = null;
        field_h = null;
        if (param0 != 0) {
          field_f = (je) null;
        }
    }

    PlayerProfile(PacketBuffer packet, boolean includeSpellQuantities) {
        this();
        int discarded$0 = 0;
        try {
          discarded$0 = this.decode(packet, -2, includeSpellQuantities);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "hm.<init>(" + (packet != null ? "{...}" : "null") + ',' + includeSpellQuantities + ')');
        }
    }

    final static int a(mo param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != -5) {
            PlayerProfile.a(-8, 127, -35, 78, 58, -62, -122);
          }
          var2_int = MeshObject.field_d;
          if (param0.field_b != 2) {
            if (param0.field_b == 4) {
              var2_intLifetime1 = fm.field_d[param0.field_b];
            } else {
              if (~oh.field_H == ~param0.field_n) {
                var2_intLifetime1 = CombatEvent.field_A[param0.field_b];
              } else {
                var2_intLifetime1 = fm.field_d[param0.field_b];
              }
            }
          } else {
            if (!param0.field_f) {
              if (0 == param0.field_a &&
                param0.field_e == 0) {
                var2_intLifetime1 = CombatEvent.field_A[param0.field_b];
              } else {
                var2_intLifetime1 = fm.field_d[param0.field_b];
              }
            } else {
              var2_intLifetime1 = MeshObject.field_d;
            }
          }
          stackIn_16_0 = var2_intLifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("hm.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getAvailableRunes(byte obfuscationGuard) {
        if (obfuscationGuard <= 44) {
          this.getAvailableRunes((byte) 121);
        }
        return -this.runeDebit + this.runeCredit;
    }

    final boolean tryDebitRunes(int amount, byte obfuscationGuard) {
        if (!(this.getAvailableRunes((byte) 57) >= amount)) {
          return false;
        }
        this.runeDebit = this.runeDebit + amount;
        if (obfuscationGuard != 103) {
          field_l = (int[]) null;
          return true;
        }
        return true;
    }

    final int getUnlockLevel(int startLevel) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = NodeDeque.unlockLevelCosts.length;
        int var3 = this.progressionCredit + this.runeCredit;
        for (var4 = startLevel; var4 < var2; var4++) {
          var5 = NodeDeque.unlockLevelCosts[var4];
          var3 = var3 - var5;
          if (0 > var3) {
            return var4;
          }
        }
        return var2;
    }

    private final int decode(PacketBuffer packet, int obfuscationGuard, boolean includeSpellQuantities) {
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int version = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int spellIndex = 0;
        int levelCost = 0;
        int var8 = 0;
        int legacyLevel;
        int levelIndex;
        int spellSlot;
        int unlockGroup;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          version = packet.readUnsignedByte(obfuscationGuard + 2);
          if (9 < version) {
            throw new RuntimeException("Unrecognized version: " + version);
          }
          if (~version <= obfuscationGuard) {
            if (version < 5 ||
              includeSpellQuantities) {
              for (spellIndex = 0; this.spellQuantities.length > spellIndex; spellIndex++) {
                this.spellQuantities[spellIndex] = packet.readUnsignedByte(0);
              }
            }
            for (spellSlot = 0; this.equippedSpellIds.length > spellSlot; spellSlot++) {
              this.equippedSpellIds[spellSlot] = packet.readUnsignedShort((byte) -104);
              if (this.equippedSpellIds[spellSlot] >= 135) {
                this.equippedSpellIds[spellSlot] = -1;
              }
            }
            this.runeCredit = packet.readInt(1);
            for (unlockGroup = 0; 7 > unlockGroup; unlockGroup++) {
              this.unitUnlockMasks[unlockGroup] = packet.readUnsignedShort((byte) -104);
            }
          }
          var5 = -1;
          if (6 > version) {
            legacyLevel = packet.readUnsignedByte(0);
            this.runeDebit = 0;
            this.progressionCredit = 0;
            for (levelIndex = 0; levelIndex < legacyLevel; levelIndex++) {
              levelCost = NodeDeque.unlockLevelCosts[levelIndex];
              this.progressionCredit = this.progressionCredit + levelCost;
            }
          } else {
            this.runeDebit = packet.readInt(1);
            this.progressionCredit = packet.readInt(1);
            this.campaignProgress.decode(version, packet, -115);
          }
          stackIn_26_0 = version;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("hm.F(");
          if (packet == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(obfuscationGuard).append(',').append(includeSpellQuantities).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        OwnerChangeEvent.field_E.a(param5, -20500, param6, param2, param4);
        if (qd.field_I != null) {
          qd.field_I.b(param1, param3, param5, -TelefragEvent.field_z + param1, param5, param0 ^ 6518);
        }
        if (param0 != -1) {
          field_i = (String[]) null;
        }
    }

    private PlayerProfile() {
        int var1 = 0;
        int var1Lifetime1;
        this.runeDebit = 0;
        this.spellQuantities = new int[135];
        this.unitUnlockMasks = new int[7];
        this.runeCredit = 0;
        this.progressionCredit = 0;
        this.equippedSpellIds = new int[5];
        for (var1 = 0; 5 > var1; var1++) {
          this.equippedSpellIds[var1] = -1;
        }
        int var3 = 0;
        var1Lifetime1 = var3;
        while (135 > var3) {
          this.spellQuantities[var3] = 0;
          var3++;
        }
        this.campaignProgress = new CampaignProgress();
    }

    static {
        field_i = new String[]{"Full health", "1/2 health", "1/3 health", "1/4 health", "1/5 health", "1/6 health"};
        field_e = "Are You Sure?";
        field_l = new int[]{0, 0, 536870912, 553634816, 544700415};
        field_h = new jl();
    }
}
