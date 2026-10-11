/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static ng field_h;
    int field_b;
    static float field_g;
    int field_f;
    int field_a;
    private int field_d;
    private int field_e;
    int field_c;

    final static void a(boolean param0, ng param1) {
        kd var2 = null;
        RuntimeException var2_ref = null;
        kd var3 = null;
        int var4 = 0;
        ng var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          var2 = param1.field_b;
          do {
            var3 = var2.field_f;
            var2.field_c = var3;
            var2 = var3;
          } while (var2 != param1.field_b);
          var2 = param1.field_b;
          do {
            var3 = var2.field_c;
            var3.field_f = var2;
            var2 = var3;
          } while (param1.field_b != var2);
          if (!param0) {
            return;
          }
          var5 = (ng) null;
          tl.a(true, (ng) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("tl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 3) {
          ng var2 = (ng) null;
          tl.a(false, (ng) null);
        }
    }

    final int a(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_21_0 = 0;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (this.field_e == rf.a(param1, 47)) {
          this.field_d = this.field_d + 1;
          stackIn_4_0 = (20 < this.field_d) ? 3 : 1;
          var3 = stackIn_4_0 * param1;
          if (var3 > this.field_f / tg.field_j) {
            var3 = this.field_f / tg.field_j;
          } else {
            if (var3 < -this.field_f / tg.field_j) {
              var3 = -this.field_f / tg.field_j;
            }
          }
          if (param0 > 100) {
            return var3;
          }
          this.field_e = -94;
          return var3;
        }
        this.field_e = rf.a(param1, 47);
        this.field_d = 1;
        stackIn_21_0 = (20 < this.field_d) ? 3 : 1;
        var3Lifetime1 = stackIn_21_0 * param1;
        if (var3Lifetime1 > this.field_f / tg.field_j) {
          var3Lifetime1 = this.field_f / tg.field_j;
        } else {
          if (var3Lifetime1 < -this.field_f / tg.field_j) {
            var3Lifetime1 = -this.field_f / tg.field_j;
          }
        }
        if (param0 > 100) {
          return var3Lifetime1;
        }
        this.field_e = -94;
        return var3Lifetime1;
    }

    final int a(byte param0) {
        if (param0 != -123) {
          return -123;
        }
        return this.field_c * this.field_b / this.field_f;
    }

    tl(int param0, int param1) {
        this.field_f = param0;
        this.field_b = param1;
    }

    static {
        field_h = new ng();
    }
}
