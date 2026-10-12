/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CampaignRewardPreview {
    static int field_d;
    String description;
    private static long[] field_f;
    static String field_b;
    RgbSprite icon;
    String title;
    static String field_a;
    static RgbSprite field_e;
    static af field_g;

    final static void a(int param0, Unit param1, PacketBuffer param2) {
        try {
          bu.a(0, param1, 2, param2);
          if (param0 != 29712) {
            field_f = (long[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fu.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_f = null;
        if (param0 < 124) {
          field_a = (String) null;
        }
        field_e = null;
    }

    final static void writeAbuseReport(String targetName, int offenceId, long accountId, int obfuscationGuard, boolean mute, int packetOpcode) {
        int var7_int = 0;
        vl.outgoingPacket.writeCipheredOpcode(obfuscationGuard ^ 3982, packetOpcode);
        vl.outgoingPacket.position = vl.outgoingPacket.position + 1;
        if (obfuscationGuard != 29231) {
          return;
        }
        try {
          var7_int = vl.outgoingPacket.position;
          vl.outgoingPacket.writeLong(accountId, obfuscationGuard ^ 38346879);
          vl.outgoingPacket.b(targetName, obfuscationGuard ^ 17460);
          vl.outgoingPacket.writeByte(1, offenceId);
          vl.outgoingPacket.writeByte(obfuscationGuard - 29230, mute ? 1 : 0);
          vl.outgoingPacket.writeByteLengthPrefix(-var7_int + vl.outgoingPacket.position, 5930);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fu.B(" + (targetName != null ? "{...}" : "null") + ',' + offenceId + ',' + accountId + ',' + obfuscationGuard + ',' + mute + ',' + packetOpcode + ')');
        }
    }

    CampaignRewardPreview(int[] rewardUnitTypes, int rewardSpellId, int manaBonusPercent) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (rewardUnitTypes != null) {
            this.icon = DeployAction.field_x[rewardUnitTypes[0]];
          } else {
            if (rewardSpellId == -1) {
              if (manaBonusPercent > 0) {
                this.icon = BattleCharacter.field_h[161];
              } else {
                this.icon = null;
              }
            } else {
              this.icon = BattleCharacter.field_h[uc.spellDefinitions[rewardSpellId][2]];
            }
          }
          if (rewardUnitTypes != null) {
            this.title = ScrollContainer.unitDisplayNames[rewardUnitTypes[0]];
            this.description = ut.field_cb[rewardUnitTypes[0]];
          } else {
            if (-1 == rewardSpellId) {
              if (manaBonusPercent > 0) {
                this.title = dj.a(6609, hf.field_b, "<MANA>", Integer.toString(manaBonusPercent));
                this.description = SummonRequest.field_D;
              } else {
                this.title = null;
                this.description = null;
              }
            } else {
              this.title = fq.field_f[rewardSpellId];
              this.description = ActionRequest.field_l[rewardSpellId];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("fu.<init>(");
          if (rewardUnitTypes == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(rewardSpellId).append(',').append(manaBonusPercent).append(')').toString());
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_f = new long[256];
        field_b = "Stock";
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; 8 > var3; var3++) {
            if ((var0 & 1L) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            }
          }
          field_f[var2] = var0;
        }
        field_a = "Email is valid";
        field_g = null;
    }
}
