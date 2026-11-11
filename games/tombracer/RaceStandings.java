/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RaceStandings {
    private int[] sortKeys;
    int[] positions;
    static PlatformTaskDispatcher field_a;
    int[] order;
    private MatchState matchState;

    final void update(int param0) {
        int var5 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_5_2 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var3Lifetime1;
        int var4Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = -103 % ((-35 - param0) / 39);
        for (var3 = 0; var3 < this.matchState.players.length; var3++) {
          stackIn_4_0 = this.sortKeys;
          stackIn_4_1 = var3;
          if (this.matchState.simulations[var3].isFinished(0)) {
            stackIn_5_2 = -999;
          } else {
            stackIn_5_2 = this.matchState.simulations[var3].b(false) + this.matchState.players[var3].getSortDepth((byte) -72);
          }
          stackIn_4_0[stackIn_4_1] = stackIn_5_2;
          if (this.matchState.hasResigned((byte) -99, var3)) {
            this.sortKeys[var3] = 2147483647;
          }
        }
        var3Lifetime1 = 0;
        for (var4 = 0; var4 < this.order.length; var4++) {
          for (var5 = var4; var5 < this.order.length; var5++) {
            var6 = this.order[var4];
            var7 = this.order[var5];
            var8 = 0;
            if (this.sortKeys[var7] < this.sortKeys[var6]) {
              var8 = 1;
            } else {
              if (this.sortKeys[var6] == this.sortKeys[var7] &&
                this.matchState.simulations[var7].tick < this.matchState.simulations[var6].tick) {
                var8 = 1;
              }
            }
            if (var8 != 0) {
              this.order[var4] = var7;
              var3Lifetime1 = 1;
              this.order[var5] = var6;
            }
          }
        }
        if (var3Lifetime1 != 0) {
          var10 = 0;
          var4Lifetime1 = var10;
          while (var10 < this.order.length) {
            this.positions[this.order[var10]] = var10;
            var10++;
          }
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 >= -119) {
          RaceStandings.releaseAllSounds(-126);
        }
    }

    final static void releaseAllSounds(int param0) {
        vb var1 = null;
        PlayingSound var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 18916) {
            field_a = (PlatformTaskDispatcher) null;
          }
          var1 = (vb) (DivisionMazeGenerator.field_e.first(-80));
          while (var1 != null) {
            var2 = new PlayingSound(var1, var1.field_f.getTargetVolume(), var1.field_f.getTargetPan());
            rs.queueSoundRelease(var2, -58);
            var1 = (vb) (DivisionMazeGenerator.field_e.next(119));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var1_ref), "kqa.D(" + param0 + ')');
        }
    }

    RaceStandings(MatchState param0) {
        try {
          this.matchState = param0;
          this.reset(false);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "kqa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void reset(boolean param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = this.matchState.players.length;
        if (param0) {
          RaceStandings.releaseAllSounds(110);
        }
        this.sortKeys = new int[var2];
        this.order = new int[var2];
        this.positions = new int[var2];
        for (var3 = 0; var3 < var2; var3++) {
          this.order[var3] = var3;
          this.positions[var3] = var3;
        }
    }

    static {
    }
}
