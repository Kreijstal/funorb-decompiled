/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MissionState implements DiffableState {
    static String field_c;
    private int winner;
    private int[] teamscores;
    private int phaseChangeCountdown;
    private int missionPhase;
    private MatchResults currentMatch;
    private MissionGenerationData nextround;
    private int phaseTimer;
    static String field_h;
    MissionVariable[] customVariables;

    final int d(byte param0) {
        int var2 = -14 / ((param0 + 56) / 40);
        return this.nextround.roundsLeft;
    }

    final int g(byte param0) {
        if (param0 <= 39) {
          this.missionPhase = -39;
        }
        return this.winner;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int stackIn_26_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        MissionState var5 = null;
        try {
          var5 = (MissionState) (other);
          tja.a(var5.customVariables, 1, this.customVariables, false, 5547);
          if (null != this.nextround &&
            var5.nextround != null) {
            this.nextround.reportDifferences(var5.nextround, -123);
          }
          if (null != this.currentMatch &&
            null != var5.currentMatch) {
            this.currentMatch.reportDifferences(var5.currentMatch, -102);
          }
          var4 = 0;
          if (var5.missionPhase != this.missionPhase) {
            var4 = 1;
            System.out.println("int mission_phase has changed. before=" + var5.missionPhase + ", now=" + this.missionPhase);
          }
          if (var5.phaseChangeCountdown != this.phaseChangeCountdown) {
            var4 = 1;
            System.out.println("int phase_change_countdown has changed. before=" + var5.phaseChangeCountdown + ", now=" + this.phaseChangeCountdown);
          }
          if (this.phaseTimer != var5.phaseTimer) {
            System.out.println("int phase_timer has changed. before=" + var5.phaseTimer + ", now=" + this.phaseTimer);
            var4 = 1;
          }
          if (this.winner != var5.winner) {
            var4 = 1;
            System.out.println("int winner has changed. before=" + var5.winner + ", now=" + this.winner);
          }
          if (SetCountermeasureLauncherAimspeed.a(var5.customVariables, false, 1, this.customVariables, -77)) {
            System.out.println("MissionVariable[] custom_variables has changed. ");
            var4 = 1;
          }
          if (obfuscationGuard >= -19) {
            return;
          }
          stackIn_26_0 = (this.nextround != null) ? 0 : 1;
          if (var5.nextround != null) {
            stackIn_29_1 = 0;
          } else {
            stackIn_29_1 = 1;
          }
          if ((stackIn_26_0 ^ stackIn_29_1) != 0 ||
            this.nextround != null &&
            this.nextround.a((byte) 84, var5.nextround)) {
            System.out.println("MissionGenerationData nextround has changed. before=" + var5.nextround + ", now=" + this.nextround);
            var4 = 1;
          }
          if (GetCountermeasuresCooldown.a(this.teamscores, var5.teamscores, false)) {
            System.out.println("int[] teamscores has changed. ");
            var4 = 1;
          }
          stackIn_39_0 = (var5.currentMatch != null) ? 0 : 1;
          if (null != this.currentMatch) {
            stackIn_42_1 = 0;
          } else {
            stackIn_42_1 = 1;
          }
          if ((stackIn_39_0 ^ stackIn_42_1) != 0 ||
            null != this.currentMatch &&
            this.currentMatch.a((byte) 126, var5.currentMatch)) {
            System.out.println("MatchResults current_match has changed. before=" + var5.currentMatch + ", now=" + this.currentMatch);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionState has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_53_0 = var3;
          stackIn_53_1 = new StringBuilder().append("lbb.F(");
          if (other == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void a(int param0, GameSnapshot param1) {
        int var5_int = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Player var5 = null;
        int var6 = 0;
        int var7 = 0;
        bea var8 = null;
        bea var9 = null;
        Random var10 = null;
        String var11 = null;
        var7 = VoidHunters.field_G;
        try {
          var8 = new bea();
          var9 = var8;
          var9.seed = this.a((byte) 120);
          if (qab.a(param0 + 92, this.d(6472))) {
            var10 = new Random((long)var9.seed);
            this.b(-1, param1);
            this.a(var10, 2196, param1);
          }
          var9.optionTotals = this.c(true);
          var9.a(91, param1);
          if (MissionList.a((byte) -125)) {
            var11 = ShipCondition.field_f[param1.missionState.d(6472)];
            SetGrapplingHookCooldown.a(202, "missions_started_" + var11, 1);
            SetGrapplingHookCooldown.a(param0 + 202, "missions_started", 1);
            for (var5_int = 0; var5_int < var9.optionTotals.length; var5_int++) {
              var6 = var8.optionTotals[var5_int];
              if (0 < var6) {
                SetGrapplingHookCooldown.a(param0 + 202, "votes_for_" + ShipCondition.field_f[var5_int], var6);
              }
            }
          }
          this.b(-1);
          this.c(5, -7, 0);
          this.winner = -1;
          this.phaseChangeCountdown = 0;
          for (var4 = param0; var4 < param1.field_c.length; var4++) {
            var5 = param1.a(var4, (byte) 59);
            var5.b((byte) 127);
            var5.b(-1);
            var5.carriedOverComponents = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("lbb.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        int var2;
        boolean stackIn_7_0 = false;
        var2 = -41 % ((14 - param0) / 41);
        stackIn_7_0 = (this.missionPhase == 0) || (this.missionPhase == 1) || (this.missionPhase == 2) || (this.missionPhase == 3);
        return stackIn_7_0;
    }

    final int getPhaseChangeCountdown(byte param0) {
        int var2 = -113 % ((-74 - param0) / 52);
        return this.phaseChangeCountdown;
    }

    private final boolean a(boolean param0, GameSnapshot param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Player var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (param0) {
            return true;
          }
          for (var3_int = 0; var3_int < param1.field_c.length; var3_int++) {
            var4 = param1.a(var3_int, (byte) 59);
            if (var4.field_a &&
              54 == var4.specialorder) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("lbb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(Random param0, int param1, GameSnapshot param2) {
        int var8 = 0;
        int var12 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Player var8_ref_tfa = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Player var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        var16 = VoidHunters.field_G;
        try {
          var18 = new int[2];
          var17 = var18;
          var4 = var17;
          var5 = 0;
          var6 = 0;
          for (var7 = 0; param2.field_c.length > var7; var7++) {
            var8_ref_tfa = param2.a(var7, (byte) 59);
            if (var8_ref_tfa.field_a ||
              SetMissionResnetResourceTickTime.field_p != 0) {
              var5++;
              var9 = var8_ref_tfa.selectedTeam;
              if (var9 >= 0 &&
                var9 < var18.length) {
                var6++;
                var4[var9] = var4[var9] + 1;
              }
            }
          }
          var7Lifetime1 = -var6 + var5;
          for (var8 = 0; var8 < var7Lifetime1; var8++) {
            var9Lifetime1 = var7Lifetime1 - var8;
            var10 = 0;
            if (1 < var9Lifetime1) {
              var10 = hob.a(param0, var9Lifetime1, 122);
            }
            var11 = 0;
            for (var12 = 0; param2.field_c.length > var12; var12++) {
              var13 = param2.a(var12, (byte) 59);
              var14 = var13.selectedTeam;
              if ((var13.field_a ||
                SetMissionResnetResourceTickTime.field_p != 0) && (var14 < 0 ||
                var18.length <= var14)) {
                if (var11 == var10) {
                  var15 = ccb.a(param0, var18, (byte) -21, false);
                  var13.selectedTeam = var15;
                  var4[var15] = var4[var15] + 1;
                }
                var11++;
              }
            }
          }
          if (param1 != 2196) {
            field_h = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_38_0 = var4_ref;
          stackIn_38_1 = new StringBuilder().append("lbb.I(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        GetDebrisThrowable.a(param0, "Skipping phase countdown for " + this.missionPhase);
        this.phaseChangeCountdown = 0;
        if (param0) {
          this.customVariables = (MissionVariable[]) null;
        }
    }

    public final void b(faa param0, int param1) {
        int var7 = 0;
        int stackIn_6_0 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        faa stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean stackIn_20_2 = false;
        int stackIn_25_0 = 0;
        int stackIn_26_1 = 0;
        faa stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        boolean stackIn_29_2 = false;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa var3 = null;
        RuntimeException var3_ref = null;
        MissionVariable[] var4 = null;
        int var5 = 0;
        MissionVariable[] var6 = null;
        MissionVariable var8 = null;
        int var9 = 0;
        faa var10 = null;
        var9 = VoidHunters.field_G;
        try {
          param0.a(-632, this.missionPhase, 32);
          param0.a(-632, this.phaseChangeCountdown, 32);
          param0.a(-632, this.phaseTimer, 32);
          param0.a(-632, this.winner, 32);
          var10 = param0;
          var3 = var10;
          if (param1 >= -109) {
            return;
          }
          var4 = this.customVariables;
          if (var4 == null) {
            stackIn_6_0 = 0;
          } else {
            stackIn_6_0 = var4.length;
          }
          var5 = stackIn_6_0;
          var10.a(-632, var5, 8);
          if (0 != var5) {
            var6 = var4;
            for (var7 = 0; var6.length > var7; var7++) {
              var8 = var6[var7];
              stackIn_12_0 = var3;
              stackIn_12_1 = 80;
              stackIn_13_2 = (var8 != null);
              if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_13_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var10, var8);
              }
            }
          }
          stackIn_19_0 = (faa) (param0);
          stackIn_19_1 = 99;
          stackIn_20_2 = (this.nextround != null);
          if (vq.a(stackIn_19_0, stackIn_19_1, stackIn_20_2)) {
            this.nextround.b(param0, -112);
          }
          stackIn_25_0 = 8;
          if (this.teamscores != null) {
            stackIn_26_1 = this.teamscores.length;
          } else {
            stackIn_26_1 = 0;
          }
          pgb.a(stackIn_25_0, stackIn_26_1, 76, param0, this.teamscores);
          stackIn_28_0 = (faa) (param0);
          stackIn_28_1 = 84;
          stackIn_29_2 = (this.currentMatch != null);
          if (vq.a(stackIn_28_0, stackIn_28_1, stackIn_29_2)) {
            this.currentMatch.b(param0, -126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_35_0 = var3_ref;
          stackIn_35_1 = new StringBuilder().append("lbb.B(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 2) {
          this.teamscores = (int[]) null;
        }
        MissionVariable var6 = this.c(-1, param2);
        MissionVariable var7 = var6;
        if (var7 != null) {
          var7.value = param1;
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 < 15) {
          return true;
        }
        return wh.a(param0, (byte) 99, param1) & (((param1 & 8192) != 0 ? true : false) | bla.a(param1, false, param0) | hsb.a(param0, 65536, param1));
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        boolean stackIn_28_0 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        MissionState var5 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var5 = (MissionState) (param1);
          var4 = 97 / ((param0 - 22) / 59);
          if (this.missionPhase == var5.missionPhase &&
            this.phaseChangeCountdown == var5.phaseChangeCountdown &&
            this.phaseTimer == var5.phaseTimer &&
            this.winner == var5.winner &&
            !SetCountermeasureLauncherAimspeed.a(var5.customVariables, false, 1, this.customVariables, -22)) {
            stackIn_8_0 = (var5.nextround != null) ? 0 : 1;
            if (this.nextround != null) {
              stackIn_11_1 = 0;
            } else {
              stackIn_11_1 = 1;
            }
            if ((stackIn_8_0 ^ stackIn_11_1) == 0 && (this.nextround == null ||
              !this.nextround.a((byte) -74, var5.nextround)) && !SetBlueprintSaveTime.a(var5.teamscores, this.teamscores, (byte) 28)) {
              stackIn_19_0 = (null != this.currentMatch) ? 0 : 1;
              if (var5.currentMatch != null) {
                stackIn_22_1 = 0;
              } else {
                stackIn_22_1 = 1;
              }
              if ((stackIn_19_0 ^ stackIn_22_1) == 0 && (this.currentMatch == null ||
                !this.currentMatch.a((byte) -57, var5.currentMatch))) {
                stackIn_28_0 = false;
                decompiledFrameRemainder0 = false;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_28_0 = true;
          }
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("lbb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final int d(int param0) {
        if (param0 != 6472) {
          int[] var3 = (int[]) null;
          this.a((int[]) null, false);
        }
        return this.nextround.votedObjective;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -8) {
          this.b(54, -62, 111);
        }
        int var4 = this.b(7061, param2);
        this.b(2, var4 + param1, param2);
    }

    private final void a(GameSnapshot param0, byte param1, int param2) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        Player var8 = null;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var9 = 0;
        var10 = VoidHunters.field_G;
        try {
          var4_int = -2147483648;
          var5 = -1;
          var7 = 28 / ((-37 - param1) / 47);
          for (var6 = 0; param0.field_c.length > var6; var6++) {
            var8 = param0.a(var6, (byte) 59);
            if (var8.a((byte) -43) &&
              param2 == var8.selectedTeam) {
              var9 = var8.assists + var8.kills;
              if (var4_int < var9) {
                var5 = var9;
                var5 = var6;
              }
            }
          }
          if (var5 >= 0) {
            param0.a(var5, (byte) 59).a(255);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("lbb.KA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (param0 < 125) {
          return;
        }
        GetDebrisThrowable.a(false, "Extending phase countdown for " + this.missionPhase);
        this.phaseChangeCountdown = this.phaseChangeCountdown + 600 * Particle.field_l;
    }

    final MissionVariable a(int param0, int param1) {
        if (param0 != -31634) {
          int[] var4 = (int[]) null;
          this.a((int[]) null, false);
        }
        if (null == this.customVariables) {
          return null;
        }
        if (0 > param1) {
          return null;
        }
        if (this.customVariables.length <= param1) {
          return null;
        }
        if (this.customVariables[param1] == null) {
          return null;
        }
        return this.customVariables[param1];
    }

    private final int[] a(byte param0, GameSnapshot param1) {
        int var4 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        Player var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] stackIn_11_0 = null;
        int[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          var3 = new int[2];
          for (var4 = 0; param1.field_c.length > var4; var4++) {
            var5 = param1.a(var4, (byte) 59);
            if (var5.a((byte) -119)) {
              var6 = var5.selectedTeam;
              if (var6 >= 0 &&
                var6 < var3.length) {
                var3[var6] = var3[var6] + 1;
              }
            }
          }
          if (param0 == -63) {
            stackIn_13_0 = var3;
            return stackIn_13_0;
          }
          stackIn_11_0 = (int[]) null;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("lbb.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int[] c(boolean param0) {
        if (!param0) {
          int[] var3 = (int[]) null;
          this.a((int[]) null, true);
        }
        return this.nextround.optionTotals;
    }

    final int getPhaseTimer(byte param0) {
        if (param0 >= -87) {
          this.phaseTimer = -116;
        }
        return this.phaseTimer;
    }

    public final void b(byte param0, tv param1) {
        int var4 = 0;
        MissionState var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          var5 = (MissionState) (param1);
          var5.winner = this.winner;
          var5.phaseTimer = this.phaseTimer;
          var5.missionPhase = this.missionPhase;
          var5.phaseChangeCountdown = this.phaseChangeCountdown;
          if (param0 <= 54) {
            this.phaseTimer = 126;
          }
          var5.customVariables = (MissionVariable[]) (sqb.a(var5.customVariables, this.customVariables, 1, SetUseTrails.field_p, false));
          if (this.nextround == null) {
            var5.nextround = null;
          } else {
            if (null == var5.nextround) {
              var5.nextround = new MissionGenerationData();
            }
            this.nextround.b((byte) 98, var5.nextround);
          }
          var5.teamscores = SetTeamSelectionSpeedup.a(var5.teamscores, (byte) -57, this.teamscores);
          if (null != this.currentMatch) {
            if (var5.currentMatch == null) {
              var5.currentMatch = new MatchResults();
            }
            this.currentMatch.b((byte) 64, var5.currentMatch);
          } else {
            var5.currentMatch = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("lbb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          MissionState.a(111, -111, (byte) -58);
        }
        field_c = null;
        field_h = null;
    }

    private final int a(byte param0) {
        if (param0 != 120) {
          return 73;
        }
        return this.nextround.missionGenerationSeed;
    }

    final boolean c(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 1) {
          return true;
        }
        stackIn_6_0 = (this.f(24416)) && (GetTorqueDownshift.a(this.d(param0 + 6471), 103) > 1);
        return stackIn_6_0;
    }

    final boolean f(int param0) {
        if (param0 != 24416) {
          field_h = (String) null;
        }
        return this.nextround != null ? true : false;
    }

    private final void a(int param0, byte param1, int param2, GameSnapshot param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        Player var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var13 = VoidHunters.field_G;
        try {
          var7_int = 0;
          var9 = -90 % ((-72 - param1) / 52);
          var8 = 0;
          scanLoop1: while (true) {
            if (var8 < param3.field_c.length) {
              var10 = param3.a(var8, (byte) 59);
              if (var10.field_a) {
                var11 = var10.a(param5, 11863, param5);
                var12 = var10.a(param4, 11863, param0);
                if (var11 == 0 &&
                  param2 > var12) {
                  var7_int = 1;
                  break scanLoop1;
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (var7_int == 0) {
            this.phaseChangeCountdown = this.phaseChangeCountdown - 16;
            if (this.phaseChangeCountdown < 0) {
              this.phaseChangeCountdown = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_17_0 = var7;
          stackIn_17_1 = new StringBuilder().append("lbb.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void b(boolean param0, int param1) {
        RoundResult var3 = null;
        if (this.missionPhase == 5) {
          this.winner = param1;
          if (null != this.currentMatch) {
            var3 = new RoundResult();
            var3.winningTime = this.phaseTimer;
            var3.winner = this.winner;
            this.currentMatch.a(126, var3);
          }
          this.c(6, -7, Particle.field_l * 10);
        }
        if (param0) {
          tv var4 = (tv) null;
          this.a((byte) -35, (tv) null);
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 7061) {
          return -10;
        }
        if (null != this.customVariables &&
          param1 >= 0 &&
          param1 < this.customVariables.length) {
          if (null == this.customVariables[param1]) {
            return 0;
          }
          return this.customVariables[param1].value;
        }
        return 0;
    }

    final int a(boolean param0, int param1) {
        tv var4;
        if (param0) {
          var4 = (tv) null;
          this.a((byte) 66, (tv) null);
        }
        if (param1 < 0) {
          return 0;
        }
        if (param1 < this.teamscores.length) {
          return this.teamscores[param1];
        }
        return 0;
    }

    private final void b(int param0) {
        if (this.nextround == null) {
          return;
        }
        this.nextround.roundsLeft = this.nextround.roundsLeft - 1;
        if (!(param0 > ~this.nextround.roundsLeft)) {
          this.nextround = null;
        }
    }

    final MissionVariable c(int param0, int param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (~param1 > param0) {
          return null;
        }
        if (null != this.customVariables &&
          this.customVariables.length > param1) {
          return this.customVariables[param1];
        }
        if (null == this.customVariables) {
          this.customVariables = new MissionVariable[1 + param1];
          this.customVariables[param1] = new MissionVariable();
          return this.customVariables[param1];
        }
        MissionVariable[] var6 = new MissionVariable[1 + param1];
        MissionVariable[] var3 = var6;
        for (var4 = 0; var4 < this.customVariables.length; var4++) {
          var6[var4] = this.customVariables[var4];
        }
        var3[param1] = new MissionVariable();
        this.customVariables = var3;
        return this.customVariables[param1];
    }

    private final int[] a(GameSnapshot param0, byte param1) {
        int var7 = 0;
        int dupTemp$1 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Player var6 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var9 = new int[31];
          var3 = var9;
          var4 = 0;
          var5 = 126 / ((-8 - param1) / 48);
          while (var4 < param0.field_c.length) {
            var6 = param0.a(var4, (byte) 59);
            if (var6.field_a &&
              var6.votes != null &&
              var6.votes.length > 0) {
              for (var7 = 0; var7 < var6.votes.length; var7++) {
                if (var6.votes[var7] >= 0) {
                  dupTemp$1 = var6.votes[var7];
                  var9[dupTemp$1] = var9[dupTemp$1] + 1;
                }
              }
            }
            var4++;
          }
          stackIn_13_0 = var9;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("lbb.W(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 1) {
          this.a(-126);
        }
        this.nextround = new MissionGenerationData();
        this.nextround.missionGenerationSeed = param0;
        this.nextround.votedObjective = param2;
        this.nextround.roundsLeft = GetTorqueDownshift.a(param2, param1 ^ 57);
        this.currentMatch = new MatchResults();
    }

    final MatchResults getCurrentMatch(byte param0) {
        if (param0 > -45) {
          return (MatchResults) null;
        }
        return this.currentMatch;
    }

    private final void b(int param0, GameSnapshot param1) {
        int var7 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        int var6 = 0;
        var8 = VoidHunters.field_G;
        try {
          var9 = this.a((byte) -63, param1);
          var3 = var9;
          var4 = -var9[1] + var9[0];
          var5 = param0;
          if (var4 > 1) {
            var5 = 0;
          } else {
            if (var4 < -1) {
              var5 = 1;
            }
          }
          if (var5 != -1) {
            var6 = Math.abs(var4) / 2;
            for (var7 = 0; var7 < var6; var7++) {
              this.a(param1, (byte) -128, var5);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("lbb.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(int[] param0, boolean param1) {
        try {
          this.nextround.optionTotals = param0;
          if (param1) {
            faa var4 = (faa) null;
            this.a((faa) null, false);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lbb.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int getMissionPhase(int param0) {
        if (param0 != 8) {
          return -38;
        }
        return this.missionPhase;
    }

    final MissionVariable[] getCustomVariables(boolean param0) {
        if (param0) {
          this.d(53);
        }
        return this.customVariables;
    }

    public final void a(faa param0, boolean param1) {
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          this.missionPhase = param0.i(0, 32);
          this.phaseChangeCountdown = param0.i(0, 32);
          this.phaseTimer = param0.i(0, 32);
          this.winner = param0.i(0, 32);
          this.customVariables = (MissionVariable[]) (SetAutoDetail.a(8, SetUseTrails.field_p, param0, 1, -128, this.customVariables));
          if (kv.a(false, param0)) {
            if (null == this.nextround) {
              this.nextround = new MissionGenerationData();
            }
            this.nextround.a(param0, false);
          } else {
            this.nextround = null;
          }
          this.teamscores = wkb.a((byte) 37, this.teamscores, param0, 8);
          if (kv.a(param1, param0)) {
            if (this.currentMatch == null) {
              this.currentMatch = new MatchResults();
            }
            this.currentMatch.a(param0, false);
          } else {
            this.currentMatch = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("lbb.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(GameSnapshot param0, int param1, byte param2) {
        int var7 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        Random var6_ref_Random = null;
        int var8 = 0;
        int var9 = 0;
        GameSnapshot var10 = null;
        int[] var11 = null;
        int[] var13 = null;
        World var14 = null;
        Mission var15 = null;
        Mission var16 = null;
        int[] var19 = null;
        int[] var23 = null;
        int[] var24 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var9 = VoidHunters.field_G;
        try {
          if (this.phaseChangeCountdown > 0) {
            this.phaseChangeCountdown = this.phaseChangeCountdown - 1;
          }
          var14 = param0.world;
          this.phaseTimer = this.phaseTimer + 1;
          if (param2 != -19) {
            var10 = (GameSnapshot) null;
            this.a((GameSnapshot) null, -55, (byte) 8);
          }
          if (qrb.field_a == 1 &&
            5 != this.missionPhase) {
            for (var5 = 0; var5 < param0.field_c.length; var5++) {
              param0.a(var5, (byte) 59).savedShip = null;
            }
          }
          if (this.missionPhase == 0) {
            if (this.phaseChangeCountdown == 0) {
              stackIn_75_0 = (!SetGrapplingHookAimarc.a(param0, (byte) -106)) ? 0 : 1;
              var5Lifetime1 = stackIn_75_0;
              if (var5Lifetime1 == 0) {
                stackIn_79_0 = (!this.a(false, param0)) ? 0 : 1;
                var5Lifetime1 = stackIn_79_0;
              }
              if (var5Lifetime1 == 0) {
                return;
              }
              if (this.f(24416)) {
                this.c(3, -7, Particle.field_j);
                return;
              }
              this.c(1, -7, Particle.field_h);
              return;
            }
          } else {
            if (this.missionPhase == 1) {
              if (this.phaseChangeCountdown > 0) {
                this.a(13, (byte) -126, sl.field_a, param0, 0, -1);
              }
              if (this.phaseChangeCountdown != 0) {
                return;
              }
              var5Lifetime1 = param1;
              var6_ref_Random = new Random((long)var5Lifetime1);
              var23 = this.a(param0, (byte) -96);
              for (var8 = 0; var23.length > var8; var8++) {
                if (!tla.b(param2 ^ -110, var8)) {
                  var23[var8] = -1;
                }
              }
              var8Lifetime2 = SetSalvoUsesAllEnergy.a(-126, 14, var6_ref_Random, true, var23);
              this.a(var5Lifetime1, 1, var8Lifetime2);
              this.c(2, -7, Particle.field_z);
              return;
            }
            if (this.missionPhase == 2) {
              if (0 < this.phaseChangeCountdown) {
                this.a(30, (byte) -128, GetPhasedEnergyBeamReload.field_q, param0, 14, -2);
              }
              if (this.phaseChangeCountdown != 0) {
                return;
              }
              var24 = this.a(param0, (byte) -95);
              this.a(var24, false);
              if (qab.a(82, this.nextround.votedObjective)) {
                this.c(3, -7, Particle.field_j);
                return;
              }
              this.c(3, -7, Particle.field_j);
              this.phaseChangeCountdown = 0;
              return;
            }
            if (this.missionPhase == 3) {
              if (1 == dcb.field_f) {
                var19 = new int[2];
                var13 = var19;
                var11 = var13;
                var5_ref_int__ = var11;
                var6 = 1;
                for (var7 = 0; param0.field_c.length > var7; var7++) {
                  if (param0.field_c[var7].field_a ||
                    SetMissionResnetResourceTickTime.field_p != 0) {
                    var8Lifetime1 = param0.a(var7, (byte) 59).selectedTeam;
                    if (var8Lifetime1 >= 0 &&
                      var8Lifetime1 < var19.length) {
                      var11[var8Lifetime1] = var11[var8Lifetime1] + 1;
                    } else {
                      var6 = 0;
                    }
                  }
                }
                if (var6 != 0 &&
                  this.phaseChangeCountdown > 0) {
                  this.phaseChangeCountdown = this.phaseChangeCountdown - 1;
                }
              }
              if (this.phaseChangeCountdown == 0) {
                this.a(0, param0);
              }
              var14.a((byte) 127, param0);
              return;
            }
            if (this.missionPhase != 5) {
              if (this.missionPhase == 6) {
                if (0 != this.phaseChangeCountdown) {
                  return;
                }
                if (null != this.currentMatch &&
                  !this.f(24416) &&
                  qab.a(81, var14.d(false))) {
                  var5Lifetime1 = this.currentMatch.a(true);
                  if (0 <= var5Lifetime1 &&
                    this.teamscores.length > var5Lifetime1) {
                    this.teamscores[var5Lifetime1] = this.teamscores[var5Lifetime1] + 1;
                  }
                }
                if (SetMissionTerrainAsteroidProbability.field_o) {
                  var16 = SetDebrisPartitioned.b(false).a(3, false);
                  var16.a(true, param0, param2 ^ -112);
                } else {
                  var15 = bkb.a(0);
                  var15.a(true, param0, param2 ^ 104);
                }
                this.c(0, param2 ^ 20, Particle.field_l * 1);
                if (0 != SetMachineGunAimspeed.field_o) {
                  return;
                }
                for (var5Lifetime1 = 0; var5Lifetime1 < param0.field_c.length; var5Lifetime1++) {
                  param0.a(var5Lifetime1, (byte) 59).selectedTeam = -1;
                }
              }
            } else {
              var14.a((byte) 127, param0);
              if (this.a(false, param0)) {
                this.b(false, -1);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_88_0 = var4;
          stackIn_88_1 = new StringBuilder().append("lbb.O(");
          if (param0 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public MissionState() {
        this.teamscores = new int[SetMissionTerrainAsteroidProbability.field_p];
        this.phaseChangeCountdown = 1 * Particle.field_l;
        this.customVariables = null;
        this.missionPhase = 0;
        this.phaseTimer = 0;
        this.winner = -1;
    }

    final void c(int param0, int param1, int param2) {
        this.missionPhase = param0;
        this.phaseChangeCountdown = param2;
        if (param1 != ~this.missionPhase) {
          this.customVariables = null;
        }
        this.phaseTimer = 0;
    }

    static {
        field_h = "Email (Login):";
        field_c = "Scale down map height";
    }
}
