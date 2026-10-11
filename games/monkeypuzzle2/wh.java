/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    private ad field_c;
    static ib field_b;
    private je field_a;
    private ad field_d;
    static int[] field_e;

    public static void a(int param0) {
        if (param0 != -18728) {
          field_b = (ib) null;
          field_b = null;
          field_e = null;
          return;
        }
        field_b = null;
        field_e = null;
    }

    final static void a(String[] args, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (nf.field_F != null) {
            nf.field_F.field_G.a(args, 560186724);
          }
          if (!param1) {
            field_b = (ib) null;
          }
          if (sc.field_f == null) {
            return;
          }
          sc.field_f.field_H.a(args, 560186724);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("wh.D(");
          if (args == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final pi a(int param0, int param1) {
        byte[] var4 = null;
        pi var3 = (pi) (this.field_a.a((long)param0, (byte) 114));
        if (var3 != null) {
          return var3;
        }
        if (param1 >= ~param0) {
          var4 = this.field_c.b(255, 32767 & param0, 1);
        } else {
          var4 = this.field_d.b(255, param0, 1);
        }
        var3 = new pi();
        if (var4 != null) {
          var3.a(new gk(var4), true);
        }
        if (param0 < 32768) {
          this.field_a.a((long)param0, var3, -92);
          return var3;
        }
        var3.e(0);
        this.field_a.a((long)param0, var3, -92);
        return var3;
    }

    final static void a(byte param0, le param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$1 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if ((3 & (param1.field_j | param1.field_k)) != 0) {
            var2_int = 4 - (3 & param1.field_k);
            var3 = -(3 & param1.field_j) + 4;
            var4 = var2_int + param1.field_k;
            var5 = new int[var4 * (param1.field_j + var3)];
            var6 = var3 * var4 + var2_int;
            for (var7 = 0; param1.field_j > var7; var7++) {
              for (var8 = 0; param1.field_k > var8; var8++) {
                incrementValue$1 = var6;
                var6++;
                var5[incrementValue$1] = param1.field_s[var7 * param1.field_k + var8];
              }
              var6 = var6 + var2_int;
            }
            param1.field_k = param1.field_k + var2_int;
            param1.field_j = param1.field_j + var3;
            param1.field_q = param1.field_q - var3;
            param1.field_r = param1.field_r - var2_int;
            param1.field_s = var5;
          }
          if (param0 < -66) {
            return;
          }
          wh.a(-77);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("wh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new ib();
    }
}
