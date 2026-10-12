/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DamageEvent extends GameEvent {
    boolean poison;
    static String field_z;
    private boolean applied;
    static String field_y;
    int damageAmount;

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        String var3 = null;
        int var4 = -81 % ((53 - obfuscationGuard) / 51);
        if (this.unit != null) {
          var3 = "EventDamage: pos: (" + this.unit.tileX + "," + this.unit.tileY + "), amount: " + this.damageAmount + ", poison: " + this.poison;
        } else {
          var3 = "EventDamage: unit: null, amount: " + this.damageAmount + ", poison: " + this.poison;
        }
        return var3;
    }

    final static ResourceArchive a(int param0, int param1, byte param2, boolean param3, boolean param4) {
        if (param2 >= 98) {
          return tk.a(param1, param4, 1, false, param3, param0);
        }
        field_z = (String) null;
        return tk.a(param1, param4, 1, false, param3, param0);
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -84) {
            return false;
          }
          this.applyToBattlefield(param2.battlefield, -26661);
          stackIn_4_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("nw.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        if (param0 <= 73) {
          field_z = (String) null;
          return QuickChatCategoryRepository.field_b;
        }
        return QuickChatCategoryRepository.field_b;
    }

    final static void a(byte[] param0, String[][] param1, int param2, RgbSprite[][] param3, int param4, boolean param5, String[][] param6, int param7, ResourceArchive param8, String[] param9, int param10, RgbSprite[][] param11, String[] param12, ResourceArchive param13, IndexedSprite[] param14, int[] param15, byte[] param16, String[] param17, ResourceArchive param18, int[] param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          SphinxActionRequest.a(param14, param8, -84, param19, param18);
          ContextualRuntimeException.a(param10 - 716, param8);
          nl.a(param16, param7, param2, param17, param6, param0, param1, param8, param11, param3, param9, param15, param12, false, param4);
          if (param10 != -5429) {
            field_z = (String) null;
          }
          tg.a(param13, 2, param5, param8);
          hf.a(param10 + 13099);
          DeployEvent.h(14570);
          TurnChangeEvent.d((byte) -112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("nw.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param9 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param12 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param13 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param14 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param15 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param16 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param17 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param18 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param19 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        int var3_int = 0;
        if (this.applied) {
          return;
        }
        try {
          this.applied = true;
          if (this.unit.statusEffectType != 7 &&
            this.unit.statusEffectType != 8) {
            this.unit.poisoned = this.unit.poisoned | this.poison;
          }
          var3_int = this.damageAmount;
          if (!(var3_int <= this.unit.bonusStrength + this.unit.strength)) {
            var3_int = this.unit.strength + this.unit.bonusStrength;
          }
          this.unit.applyStrengthDamage(this.damageAmount, true);
          if (obfuscationGuard != -26661) {
            field_y = (String) null;
          }
          if (battlefield.field_b) {
            battlefield.damageTakenByPlayer[this.unit.ownerPlayer] = battlefield.damageTakenByPlayer[this.unit.ownerPlayer] + var3_int;
            battlefield.d(this.unit.ownerPlayer, battlefield.damageTakenByPlayer[this.unit.ownerPlayer], 72, 11);
          }
          hf.a(battlefield, (byte) 9, true);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nw.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void b(byte param0, boolean param1) {
        KingBlackDragonEvent.field_C.a(0, -122, 0);
        if (param0 != 92) {
          field_z = (String) null;
        }
    }

    final static String a(String param0, byte param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        hl var7 = null;
        hl var8 = null;
        CipherPacketBuffer var9 = null;
        CharSequence var10 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param0);
          if (!hg.a((byte) -31, var10)) {
            stackIn_3_0 = SectorCacheStore.field_d;
            return stackIn_3_0;
          }
          if (th.field_a != 2) {
            stackIn_7_0 = PopupPresentation.field_l;
            return stackIn_7_0;
          }
          var8 = lg.a(param0, (byte) -34);
          if (var8 == null) {
            stackIn_10_0 = fo.a(4800, TaggedMapData.field_d, new String[]{param0});
            return stackIn_10_0;
          }
          wh.field_c.startForwardAt(true, var8);
          while (true) {
            var7 = (hl) (wh.field_c.next((byte) 123));
            if (var7 != null) {
              var7.field_Ob = var7.field_Ob - 1;
              continue;
            }
            break;
          }
          var8.unlink(param1 ^ -103);
          if (param1 != -27) {
            field_y = (String) null;
          }
          var8.unlinkSecondary((byte) -76);
          dj.field_a = dj.field_a - 1;
          var9 = vl.outgoingPacket;
          var9.writeCipheredOpcode(32161, param2);
          var9.position = var9.position + 1;
          var5 = var9.position;
          var9.writeByte(1, 1);
          var9.b(param0, 13851);
          var9.writeByteLengthPrefix(var9.position - var5, 5930);
          stackIn_17_0 = null;
          return (String) (stackIn_17_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("nw.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 != -26) {
          return;
        }
        field_y = null;
        field_z = null;
    }

    DamageEvent(Unit param0, int param1, boolean param2) {
        try {
          this.unit = param0;
          this.eventKind = 15;
          this.poison = param2 ? true : false;
          this.damageAmount = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_z = "Login";
        field_y = "Error connecting to server. Please try using a different server.";
    }
}
