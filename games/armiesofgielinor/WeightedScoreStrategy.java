/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedScoreStrategy extends AiPlanningStrategy {
    private float minimumScore;
    private int candidateCount;
    static String field_i;
    static String field_m;
    private float totalWeight;
    static String field_h;

    final static kk b(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 != -20849) {
          field_m = (String) null;
        }
        js var8 = new js(pd.field_d, true, false, true, true);
        js var2 = var8;
        int var3 = VineGrowthAction.b(param1 + 20938, param0);
        int var4 = 127;
        for (var5 = 0; var5 < var2.field_i.length; var5++) {
          var6 = (var4 & var8.field_i[var5]) - 16;
          if (var6 < 0) {
            var6 = 0;
          }
          var2.field_i[var5] = (short)oe.c(var6, rn.a(~var4, var3));
        }
        return var2.a(SummonAction.field_x, fm.field_a, ol.field_A, BattleCharacter.field_t, ni.field_a);
    }

    final static boolean a(int param0, int param1) {
        fd var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (bk.field_e == null) {
            return false;
          }
          if (param0 == bk.field_e.b(false)) {
            return false;
          }
          var2 = (fd) (bk.field_e.first((byte) 111));
          while (var2 != null) {
            var3 = var2.field_k;
            if (var3 == param1) {
              return true;
            }
            var2 = (fd) (bk.field_e.next((byte) 123));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2_ref), "ge.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void reset(byte obfuscationGuard) {
        int var2 = -4 / ((obfuscationGuard + 67) / 49);
        super.reset((byte) 111);
        this.totalWeight = 0.0f;
        this.minimumScore = 3.4028234663852886e+38f;
        this.candidateCount = 0;
    }

    WeightedScoreStrategy(AiPlanner planner) {
        super(planner);
        this.minimumScore = 3.4028234663852886e+38f;
        this.totalWeight = 0.0f;
    }

    final AiActionCandidate selectCandidate(byte obfuscationGuard) {
        Object var2_ref;
        AiActionCandidate var2_ref_jb;
        float var2;
        AiActionCandidate var3;
        int var4;
        AiActionCandidate var2_ref_jbLifetime1;
        var2_ref = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.candidates.a(false)) {
          return null;
        }
        this.totalWeight = 0.0f;
        if (this.minimumScore < 1.0f) {
          var2_ref_jb = (AiActionCandidate) (this.candidates.first((byte) 102));
          while (var2_ref_jb != null) {
            var2_ref_jb.score = var2_ref_jb.score + (1.0f - this.minimumScore);
            var2_ref_jb = (AiActionCandidate) (this.candidates.next((byte) 123));
          }
          this.minimumScore = 1.0f;
        }
        if (obfuscationGuard > -28) {
          this.totalWeight = 0.7643955945968628f;
        }
        var2_ref_jbLifetime1 = (AiActionCandidate) (this.candidates.first((byte) 94));
        while (var2_ref_jbLifetime1 != null) {
          this.totalWeight = (float)((double)this.totalWeight + Math.pow((double)(var2_ref_jbLifetime1.score / this.minimumScore), 4.0));
          var2_ref_jbLifetime1 = (AiActionCandidate) (this.candidates.next((byte) 123));
        }
        var2 = (float)(Math.random() * (double)this.totalWeight);
        var3 = (AiActionCandidate) (this.candidates.first((byte) 116));
        while (var3 != null) {
          var2 = (float)((double)var2 - Math.pow((double)(var3.score / this.minimumScore), 4.0));
          if (var2 <= 0.0f) {
            return var3;
          }
          var3 = (AiActionCandidate) (this.candidates.next((byte) 123));
        }
        af.a((Throwable) null, -114, "ran out of orders! total " + this.totalWeight + ", num " + this.candidateCount + " w " + var2);
        return null;
    }

    final void submitCandidate(int obfuscationGuard, AiActionCandidate candidate) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.submitCandidate(obfuscationGuard, candidate);
          if (candidate.score < this.minimumScore) {
            this.minimumScore = candidate.score;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ge.F(").append(obfuscationGuard).append(',');
          if (candidate == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 > -98) {
          WeightedScoreStrategy.a(39, 60);
        }
        field_h = null;
        field_m = null;
        field_i = null;
    }

    static {
        field_i = "Type your password again to make sure it's correct";
        field_m = "Cancel";
    }
}
