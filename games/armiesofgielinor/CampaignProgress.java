/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CampaignProgress {
    static String field_c;
    static je field_a;
    static int field_b;
    private CampaignResult[][] resultsByCampaign;

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (param0) {
          field_a = (je) null;
        }
    }

    final int getCampaignScore(boolean obfuscationGuard, int campaignIndex) {
        int var5 = 0;
        CampaignResult var6 = null;
        CampaignMission var7 = null;
        int var8 = 0;
        int var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null == this.resultsByCampaign[campaignIndex]) {
          return 0;
        }
        if (obfuscationGuard) {
          this.setResult(-6, 29, -98, 117, 69);
        }
        CampaignDefinition var10 = br.getCampaign(campaignIndex, (byte) -93);
        CampaignDefinition var3 = var10;
        int var4 = 0;
        for (var5 = 0; var5 < var3.missions.length; var5++) {
          var6 = this.resultsByCampaign[campaignIndex][var5];
          var7 = var10.missions[var5];
          var8 = var6 != null ? b.calculateMissionScore(var7.scoreTurnTarget, var7.scoreDamageTarget, var6.damageTaken, (byte) 25, var6.turnsTaken) : 0;
          var4 = var4 + var8;
        }
        return var4;
    }

    final static String b(boolean param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var6 = "(" + me.field_c + " " + ba.field_F + " " + sj.field_e + ") " + nm.field_o;
        var1 = var6;
        if (fk.field_b > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < fk.field_b; var2++) {
            var7 = var1 + ' ';
            var3 = 255 & mg.field_e.payload[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 < 10) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        if (!param0) {
          return var1;
        }
        return (String) null;
    }

    final void decode(int profileVersion, PacketBuffer packet, int obfuscationGuard) {
        int nextMissionId = 0;
        int campaignMask = 0;
        int campaignIndex = 0;
        int missionIndex = 0;
        int turnsTaken = 0;
        int damageTaken = 0;
        int legacyDamage = 0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          campaignMask = packet.readUnsignedShort((byte) -104);
          campaignIndex = 0;
          if (obfuscationGuard > -109) {
            return;
          }
          while (0 != campaignMask) {
            if ((campaignMask & 1) != 0) {
              this.resultsByCampaign[campaignIndex] = new CampaignResult[64];
              while (true) {
                nextMissionId = packet.readUnsignedByte(0);
                missionIndex = nextMissionId;
                if (255 == nextMissionId) {
                  break;
                }
                if (profileVersion < 7) {
                  turnsTaken = 2000;
                  legacyDamage = packet.readUnsignedShort((byte) -104);
                  damageTaken = legacyDamage;
                } else {
                  turnsTaken = packet.readUnsignedShort((byte) -104);
                  damageTaken = packet.readUnsignedShort((byte) -104);
                }
                this.resultsByCampaign[campaignIndex][missionIndex] = new CampaignResult(turnsTaken, damageTaken);
              }
            }
            campaignMask = campaignMask >> 1;
            campaignIndex++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("cm.A(").append(profileVersion).append(',');
          if (packet == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
          if (param1 != 0) {
            CampaignProgress.b(false);
          }
          wb.a(false, (byte) 32, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "cm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int getMissionScore(int campaignIndex, int obfuscationGuard, int missionIndex) {
        int var4;
        CampaignDefinition var5;
        CampaignMission var6;
        var4 = 54 / ((67 - obfuscationGuard) / 36);
        if (this.resultsByCampaign[campaignIndex] != null &&
          null != this.resultsByCampaign[campaignIndex][missionIndex]) {
          var5 = br.getCampaign(campaignIndex, (byte) -57);
          var6 = var5.missions[missionIndex];
          return b.calculateMissionScore(var6.scoreTurnTarget, var6.scoreDamageTarget, this.resultsByCampaign[campaignIndex][missionIndex].damageTaken, (byte) 25, this.resultsByCampaign[campaignIndex][missionIndex].turnsTaken);
        }
        return 0;
    }

    final void setResult(int obfuscationGuard, int missionIndex, int turnsTaken, int campaignIndex, int damageTaken) {
        if (this.resultsByCampaign[campaignIndex] == null) {
          this.resultsByCampaign[campaignIndex] = new CampaignResult[64];
        }
        if (obfuscationGuard != 65535) {
          field_b = -24;
        }
        if ((-1 != turnsTaken ||
          -1 != damageTaken) &&
          (65535 != turnsTaken ||
          damageTaken != 65535)) {
          this.resultsByCampaign[campaignIndex][missionIndex] = new CampaignResult(turnsTaken, damageTaken);
        } else {
          this.resultsByCampaign[campaignIndex][missionIndex] = null;
        }
    }

    final static void a(int param0, boolean param1) {
        if (jj.b((byte) -73)) {
          param1 = false;
        }
        nm.a((byte) 95, param1);
        if (gl.field_b) {
          SoftwareRaster.d(ij.field_w.field_a.field_S, ij.field_w.field_a.field_ab, ij.field_w.field_a.field_gb, ij.field_w.field_a.field_ob);
          ij.field_w.field_a.b(param1, 20);
        }
        if (param0 != 2000) {
          return;
        }
        ArmiesOfGielinor.b(0, param1);
    }

    public CampaignProgress() {
        this.resultsByCampaign = new CampaignResult[3][];
    }

    static {
        field_c = "Unrated game";
    }
}
