/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class MatchScoringObserver extends SimulationObserver {
    static String field_e;
    static volatile int field_h;
    private IntrusiveDeque field_c;
    static float field_g;
    MatchState field_f;
    static String field_d;

    private final boolean a(Room param0, byte param1, int param2) {
        RuntimeException var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 47) {
            this.field_c = (IntrusiveDeque) null;
          }
          stackIn_6_0 = (!this.field_f.b(param2, 0)) && (kq.a(-44, param0.getId((byte) -82)).field_d);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("tu.Q(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void onPenalty(int param0, Player param1, int param2, Room param3, int param4, int param5) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        PenaltyNotice var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        Object var9 = null;
        String var9_ref = null;
        FloatingMessage var10 = null;
        Room var11 = null;
        try {
          if (RewardChoicePhase.field_n != null) {
            RewardChoicePhase.field_n.field_y.a((byte) -105, 77, -1);
          }
          var7 = new PenaltyNotice(param1, param3, param2, param5, param4);
          this.field_c.addLast((byte) -88, var7);
          var9 = null;
          if (1 != param5) {
            var8 = -10;
            var9_ref = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(104, ConsoleWindow.field_n, new String[]{String.valueOf(var8)});
          } else {
            var8 = -5;
            var9_ref = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(107, rf.field_a, new String[]{String.valueOf(var8)});
          }
          param1.addScore(param0 - 15, var8);
          this.field_f.statistics.recordPenalty(param5, param1.getPlayerIndex(0), param0 - 19);
          if (this.field_f.j(-1878) &&
            !this.field_f.d(-67) &&
            var9_ref != null) {
            var10 = RewardChoicePhase.createTextMessage(-48, var9_ref);
            iqa.field_c.a(3, param0 - 15, var10);
          }
          if (param0 != 15) {
            var11 = (Room) null;
            this.onPenalty(77, (Player) null, 88, (Room) null, -63, 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("tu.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void onTreasureCollected(int param0, int param1, Player param2, Trap param3) {
        int var5_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        Particle var6 = null;
        Particle var7 = null;
        try {
          if (param0 == -1) {
            return;
          }
          var5_int = param0;
          if (var5_int == 0) {
            var6 = param2.getRoom((byte) 121).spawnParticle(param2.getX(3), param2.getY(9648), (byte) 100, 3145728 + param2.getElevation((byte) 115));
            var6.configure(false, 128, 15, 128, 50);
            var6.setVelocity(131072, 0, -107, 0);
          } else {
            if (1 != var5_int) {
              if (2 == var5_int) {
              }
            } else {
              var7 = param2.getRoom((byte) -109).spawnParticle(param2.getX(3), param2.getY(9648), (byte) 100, param2.getElevation((byte) 115) + 3145728);
              var7.configure(false, 128, 16, 128, 50);
              var7.setVelocity(131072, 0, -89, 0);
            }
          }
          if (param1 != 15818) {
            field_e = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("tu.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          field_d = (String) null;
        }
        field_e = null;
        field_d = null;
    }

    final void onRoomReset(int param0, Room param1) {
        if (param0 <= 12) {
          Room var4 = (Room) null;
          this.onRoomCompleted((Player) null, (Room) null, false);
        }
        if (null != RewardChoicePhase.field_n) {
          RewardChoicePhase.field_n.field_y.a((byte) -105, 256, -1);
        }
        if (null == this.field_f) {
          return;
        }
        try {
          this.field_f.copyCorpsesToRoom(true, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tu.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void onTrapDestroyed(Trap param0, int param1) {
        int var3_int = 0;
        Player var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param0.getDestroyStatType(17825792);
          if (var3_int == -1) {
            return;
          }
          var4 = param0.getRoom((byte) -65).getPlayer(-90);
          if (param1 != 1) {
            return;
          }
          var5 = var3_int;
          if (var5 == 0) {
            this.field_f.statistics.addTrapsDestroyed(1, 72, var4.getPlayerIndex(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("tu.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    void onRoomEntered(int param0, Player param1, Room param2) {
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Trap[] var5 = null;
        Trap[] var6 = null;
        Trap var8 = null;
        int var9 = 0;
        Room var10 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.field_f.k(-25319) &&
            param2 != null &&
            param2.collisionGrid != null) {
            var4_int = param2.getPlayer(-2).getPlayerIndex(param0 + 2);
            if (param2.j(0) &&
              !this.field_f.j(param0 - 1876)) {
              ProxySocketConnector.a(var4_int, 5);
            } else {
              li.b(var4_int, (byte) 116);
            }
            MatchState.d(param0 ^ -2, var4_int);
            var5 = param2.getAllTraps(16);
            var6 = var5;
            for (var7 = 0; var7 < var6.length; var7++) {
              var8 = var6[var7];
              if (var8.getStatCategory((byte) 3) == 1) {
                PenaltyNotice.a((byte) -32, var4_int);
              }
              if (2 == var8.getStatCategory((byte) 3)) {
                ComponentMount.a(13, var4_int);
              }
            }
          }
          if (param0 != -2) {
            var10 = (Room) null;
            this.onPenalty(84, (Player) null, 71, (Room) null, -32, -21);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("tu.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final PenaltyNotice pollPenaltyNotice(byte param0) {
        int var2 = -114 / ((59 - param0) / 50);
        if (this.field_c.isEmpty((byte) 14)) {
          return null;
        }
        return (PenaltyNotice) (this.field_c.removeFirst(73));
    }

    void onRoomCompleted(Player param0, Room param1, boolean param2) {
        FloatingMessage dupTemp$0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        FloatingMessage var9_ref_jha = null;
        int var10 = 0;
        int var11 = 0;
        FloatingMessage var12 = null;
        int var13 = 0;
        FloatingMessage var9_ref_jhaLifetime1;
        int var9Lifetime1;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = kq.a(105, param1.getId((byte) -82)).field_h;
          var4_int = var4_int * 2;
          var5 = param1.getTick((byte) 83);
          if (param2) {
            this.field_f = (MatchState) null;
          }
          var6 = 50;
          var7 = 0;
          if (var4_int > var5) {
            var7 = (-var5 + var4_int) * 5 / 50;
          }
          param0.addScore(0, param0.getRoomTreasureScore(-7991) + (var7 + var6));
          var8 = param0.getPlayerIndex(0);
          this.field_f.field_F[var8] = (long)var5;
          this.field_f.field_g[var8] = param1.getId((byte) -82);
          if (!this.field_f.k(-25319) &&
            !this.field_f.j(-1878) &&
            this.field_f.field_x != null &&
            !this.a(param1, (byte) 74, var8)) {
            var9 = ll.a(param1.getId((byte) -82), 0);
            if (var9 >= 0) {
              this.field_f.field_x[var8].set(var9);
            }
          }
          if (this.field_f.j(-1878) &&
            !this.field_f.d(-127)) {
            if (0 != var7) {
              var9_ref_jha = RewardChoicePhase.createTextMessage(-89, LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(112, ArrowShooterComponent.field_J, new String[]{String.valueOf(var6), String.valueOf(var7)}));
            } else {
              var9_ref_jha = RewardChoicePhase.createTextMessage(-66, LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(92, BevelOperator.field_q, new String[]{String.valueOf(var6)}));
            }
            iqa.field_c.a(0, var9_ref_jha);
            var10 = param0.getRoomTreasureScore(-7991);
            if (var10 > 0) {
              dupTemp$0 = RewardChoicePhase.createTextMessage(-96, LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(82, VariantMask.field_c, new String[]{String.valueOf(var10)}));
              var12 = dupTemp$0;
              var9_ref_jhaLifetime1 = dupTemp$0;
              iqa.field_c.a(3, 0, var12);
            }
            this.field_f.field_I[var8] = true;
          }
          if (!this.field_f.j(-1878)) {
            var13 = 0;
            var9Lifetime1 = var13;
            while (var13 < 3) {
              this.field_f.statistics.addTreasureScore(param0.getPlayerIndex(0), 65408, gp.field_i[var13] * param0.getRoomTreasure(393216, var13));
              var13++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("tu.H(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
    }

    MatchScoringObserver(MatchState param0) {
        try {
          this.field_f = param0;
          this.field_c = new IntrusiveDeque();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "<%0> has entered a game.";
        field_d = "White light beams";
        field_h = 0;
    }
}
