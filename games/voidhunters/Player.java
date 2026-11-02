/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class Player extends bha implements DiffableState {
    int unassignedForAutobalanceTimer;
    int assists;
    int[] carriedOverComponents;
    int selectedTeam;
    int aimtargety;
    int specialorder;
    int triggers;
    int deaths;
    int spawnChoice;
    Ship savedShip;
    int[] votes;
    int kills;
    int aimtargetx;

    public final boolean a(byte param0, tv param1) {
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        boolean stackIn_26_0 = false;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Player var5 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = 2 / ((param0 - 22) / 59);
          var5 = (Player) (param1);
          if (!super.a((byte) -38, param1) &&
            var5.triggers == this.triggers &&
            var5.aimtargetx == this.aimtargetx &&
            this.aimtargety == var5.aimtargety &&
            var5.specialorder == this.specialorder &&
            this.spawnChoice == var5.spawnChoice &&
            var5.selectedTeam == this.selectedTeam &&
            !SetBlueprintSaveTime.a(var5.votes, this.votes, (byte) 28)) {
            stackIn_11_0 = (this.savedShip != null) ? 0 : 1;
            if (var5.savedShip != null) {
              stackIn_14_1 = 0;
            } else {
              stackIn_14_1 = 1;
            }
            if ((stackIn_11_0 ^ stackIn_14_1) == 0 && (null == this.savedShip ||
              !this.savedShip.a((byte) -125, var5.savedShip)) && (!SetBlueprintSaveTime.a(var5.carriedOverComponents, this.carriedOverComponents, (byte) 28) &&
              this.kills == var5.kills &&
              var5.assists == this.assists &&
              this.deaths == var5.deaths &&
              var5.unassignedForAutobalanceTimer == this.unassignedForAutobalanceTimer)) {
              stackIn_26_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_26_0 = true;
          }
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("tfa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        if (this.unassignedForAutobalanceTimer > 0) {
          this.unassignedForAutobalanceTimer = this.unassignedForAutobalanceTimer - 1;
        }
        if (param0 != 11) {
          tv var3 = (tv) null;
          this.reportDifferences((tv) null, -82);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = VoidHunters.field_G;
        if (null == this.votes) {
          return 0;
        }
        var4 = 0;
        var5 = 0;
        if (param1 != 11863) {
          return -83;
        }
        while (var5 < this.votes.length) {
          var6 = this.votes[var5];
          if (var6 >= param0 &&
            param2 >= var6) {
            var4++;
          }
          var5++;
        }
        return var4;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var11 = 0;
        int var6;
        int var7;
        int[] var8;
        int var9;
        int var10;
        int var12;
        int var13;
        int[] var14;
        int[] var15;
        int[] var15Lifetime1;
        var13 = VoidHunters.field_G;
        if (0 > param1) {
          if (this.a(param3, 11863, param0) == param4) {
            return;
          }
          this.votes = SetAutozoomSpeedDivide.a(param1, true, this.votes, (byte) -14);
          return;
        }
        this.votes = SetMinimapWidth.a(this.votes, param1, (byte) -99);
        var6 = this.a(param3, param2 - 18161, param0);
        if (param4 < var6) {
          var7 = var6 - param4;
          var15 = new int[this.votes.length - var7];
          var14 = var15;
          var8 = var14;
          var9 = 0;
          var10 = 0;
          for (var11 = 0; var11 < this.votes.length; var11++) {
            var12 = this.votes[var11];
            if (var12 >= param3 &&
              param0 >= var12 &&
              var12 != param1) {
              if (var9 < var7) {
                var9++;
              } else {
                var8[var10++] = var12;
              }
            } else {
              var8[var10++] = var12;
            }
            var15Lifetime1 = var14;
            if (var15Lifetime1.length > var10) {
              continue;
            }
            break;
          }
          this.votes = var8;
        }
        if (param2 != 30024) {
          this.assists = -99;
        }
    }

    final void a(int param0) {
        this.unassignedForAutobalanceTimer = param0;
        this.selectedTeam = sja.field_c;
    }

    final void a(boolean param0, tja param1, int param2, int param3) {
        GameSnapshot var5 = null;
        Message var6 = null;
        try {
          var5 = (GameSnapshot) (param1);
          var6 = new Message(2, param3, param3);
          var5.messageLog.a(var6, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tfa.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int stackIn_23_0 = 0;
        int stackIn_26_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Player var5 = null;
        try {
          super.reportDifferences(other, -44);
          var5 = (Player) (other);
          if (this.savedShip != null &&
            var5.savedShip != null) {
            this.savedShip.reportDifferences(var5.savedShip, -122);
          }
          var4 = 0;
          if (var5.triggers != this.triggers) {
            System.out.println("int triggers has changed. before=" + var5.triggers + ", now=" + this.triggers);
            var4 = 1;
          }
          if (this.aimtargetx != var5.aimtargetx) {
            var4 = 1;
            System.out.println("int aimtargetx has changed. before=" + var5.aimtargetx + ", now=" + this.aimtargetx);
          }
          if (this.aimtargety != var5.aimtargety) {
            var4 = 1;
            System.out.println("int aimtargety has changed. before=" + var5.aimtargety + ", now=" + this.aimtargety);
          }
          if (this.specialorder != var5.specialorder) {
            var4 = 1;
            System.out.println("int specialorder has changed. before=" + var5.specialorder + ", now=" + this.specialorder);
          }
          if (var5.spawnChoice != this.spawnChoice) {
            var4 = 1;
            System.out.println("int spawn_choice has changed. before=" + var5.spawnChoice + ", now=" + this.spawnChoice);
          }
          if (this.selectedTeam != var5.selectedTeam) {
            System.out.println("int selected_team has changed. before=" + var5.selectedTeam + ", now=" + this.selectedTeam);
            var4 = 1;
          }
          if (GetCountermeasuresCooldown.a(this.votes, var5.votes, false)) {
            System.out.println("int[] votes has changed. ");
            var4 = 1;
          }
          stackIn_23_0 = (var5.savedShip != null) ? 0 : 1;
          if (null != this.savedShip) {
            stackIn_26_1 = 0;
          } else {
            stackIn_26_1 = 1;
          }
          if ((stackIn_23_0 ^ stackIn_26_1) != 0 ||
            null != this.savedShip &&
            this.savedShip.a((byte) 92, var5.savedShip)) {
            var4 = 1;
            System.out.println("Ship saved_ship has changed. before=" + var5.savedShip + ", now=" + this.savedShip);
          }
          if (GetCountermeasuresCooldown.a(this.carriedOverComponents, var5.carriedOverComponents, false)) {
            var4 = 1;
            System.out.println("int[] carried_over_components has changed. ");
          }
          if (var5.kills != this.kills) {
            var4 = 1;
            System.out.println("int kills has changed. before=" + var5.kills + ", now=" + this.kills);
          }
          if (this.assists != var5.assists) {
            var4 = 1;
            System.out.println("int assists has changed. before=" + var5.assists + ", now=" + this.assists);
          }
          if (this.deaths != var5.deaths) {
            System.out.println("int deaths has changed. before=" + var5.deaths + ", now=" + this.deaths);
            var4 = 1;
          }
          if (this.unassignedForAutobalanceTimer != var5.unassignedForAutobalanceTimer) {
            System.out.println("int unassigned_for_autobalance_timer has changed. before=" + var5.unassignedForAutobalanceTimer + ", now=" + this.unassignedForAutobalanceTimer);
            var4 = 1;
          }
          if (obfuscationGuard >= -19) {
            this.specialorder = 45;
          }
          if (var4 != 0) {
            System.out.println("This instance of MyCarouselPlayerInfo has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_52_0 = var3;
          stackIn_52_1 = new StringBuilder().append("tfa.F(");
          if (other == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(int param0, byte param1) {
        int var4_int = 0;
        int var6 = 0;
        int var3;
        int[] var4;
        int var5;
        int var7;
        var7 = VoidHunters.field_G;
        if (this.votes == null) {
          return;
        }
        var3 = -1;
        for (var4_int = 0; var4_int < this.votes.length; var4_int++) {
          if (~this.votes[var4_int] != ~param0) {
            continue;
          }
          var3 = var4_int;
          break;
        }
        if (param1 >= -10) {
          this.a(-58, (byte) 29);
        }
        if (var3 != -1) {
          if (1 < this.votes.length) {
            var4 = new int[-1 + this.votes.length];
            var5 = 0;
            for (var6 = 0; var6 < this.votes.length; var6++) {
              if (var6 != var3) {
                var4[var5] = this.votes[var6];
                var5++;
              }
            }
            this.votes = var4;
          } else {
            this.votes = null;
          }
        }
    }

    public final void b(faa param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        faa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        int stackIn_13_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.b(param0, -124);
          param0.a(-632, this.triggers, 4);
          param0.a(-632, this.aimtargetx, 32);
          if (param1 >= -109) {
            this.b((byte) 107);
          }
          param0.a(-632, this.aimtargety, 32);
          param0.a(-632, 1 + this.specialorder, 8);
          param0.a(-632, this.spawnChoice, 4);
          param0.a(-632, 1 + this.selectedTeam, 4);
          stackIn_4_0 = 4;
          if (this.votes != null) {
            stackIn_5_1 = this.votes.length;
          } else {
            stackIn_5_1 = 0;
          }
          pgb.a(stackIn_4_0, stackIn_5_1, 49, param0, this.votes);
          stackIn_7_0 = (faa) (param0);
          stackIn_7_1 = 85;
          stackIn_8_2 = (this.savedShip != null);
          if (vq.a(stackIn_7_0, stackIn_7_1, stackIn_8_2)) {
            this.savedShip.b(param0, -114);
          }
          stackIn_13_0 = 8;
          if (this.carriedOverComponents == null) {
            stackIn_14_1 = 0;
          } else {
            stackIn_14_1 = this.carriedOverComponents.length;
          }
          pgb.a(stackIn_13_0, stackIn_14_1, 63, param0, this.carriedOverComponents);
          param0.a(-632, this.kills, 16);
          param0.a(-632, this.assists, 16);
          param0.a(-632, this.deaths, 16);
          param0.a(-632, this.unassignedForAutobalanceTimer, 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("tfa.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        Player var4 = (Player) (param1);
        if (param0 <= 54) {
          return;
        }
        try {
          super.b((byte) 93, param1);
          var4.selectedTeam = this.selectedTeam;
          var4.triggers = this.triggers;
          var4.aimtargety = this.aimtargety;
          var4.spawnChoice = this.spawnChoice;
          var4.specialorder = this.specialorder;
          var4.aimtargetx = this.aimtargetx;
          var4.votes = SetTeamSelectionSpeedup.a(var4.votes, (byte) -108, this.votes);
          if (this.savedShip == null) {
            var4.savedShip = null;
          } else {
            if (var4.savedShip == null) {
              var4.savedShip = new Ship();
            }
            this.savedShip.b((byte) 93, var4.savedShip);
          }
          var4.carriedOverComponents = SetTeamSelectionSpeedup.a(var4.carriedOverComponents, (byte) -66, this.carriedOverComponents);
          var4.assists = this.assists;
          var4.unassignedForAutobalanceTimer = this.unassignedForAutobalanceTimer;
          var4.kills = this.kills;
          var4.deaths = this.deaths;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tfa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        if (param0 <= 124) {
          this.selectedTeam = 69;
        }
        this.votes = null;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, param1);
          this.triggers = param0.i(0, 4);
          this.aimtargetx = param0.i(0, 32);
          this.aimtargety = param0.i(0, 32);
          this.specialorder = -1 + param0.i(0, 8);
          this.spawnChoice = param0.i(0, 4);
          this.selectedTeam = param0.i(0, 4) - 1;
          this.votes = wkb.a((byte) 37, this.votes, param0, 4);
          if (!kv.a(param1, param0)) {
            this.savedShip = null;
          } else {
            if (this.savedShip == null) {
              this.savedShip = new Ship();
            }
            this.savedShip.a(param0, false);
          }
          this.carriedOverComponents = wkb.a((byte) 37, this.carriedOverComponents, param0, 8);
          this.kills = param0.i(0, 16);
          this.assists = param0.i(0, 16);
          this.deaths = param0.i(0, 16);
          this.unassignedForAutobalanceTimer = param0.i(0, 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tfa.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 81 % ((param0 - 12) / 41);
        stackIn_5_0 = (this.field_a) || (SetMissionResnetResourceTickTime.field_p == 1);
        return stackIn_5_0;
    }

    final void b(int param0) {
        this.deaths = 0;
        if (param0 != -1) {
          faa var3 = (faa) null;
          this.b((faa) null, 126);
        }
        this.assists = 0;
        this.kills = 0;
    }

    final void a(tja param0, int param1, int param2, int param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        Message var6 = null;
        Ship var7 = null;
        Random var8 = null;
        tja var9 = null;
        GameSnapshot var10 = null;
        try {
          this.selectedTeam = -1;
          var10 = (GameSnapshot) (param0);
          if (!var10.missionState.c((byte) 125) &&
            !qab.a(param2 + 24476, var10.world.d(false))) {
            this.selectedTeam = param1;
          }
          var6 = new Message(1, param1, param1);
          var10.messageLog.a(var6, true);
          if (param2 != -24354) {
            var9 = (tja) null;
            this.a(false, (tja) null, -66, -35);
          }
          var7 = var10.world.d(param1, 92);
          if (var7 != null) {
            this.selectedTeam = var7.getTeam((byte) 65);
            return;
          }
          if (var10.missionState.getMissionPhase(8) == 5 &&
            qab.a(34, var10.world.d(false))) {
            var8 = new Random((long)param3);
            var10.missionState.a(var8, 2196, var10);
          }
          this.unassignedForAutobalanceTimer = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("tfa.I(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    Player() {
        this.specialorder = -1;
        this.votes = null;
        this.selectedTeam = sja.field_c;
    }

    static {
    }
}
