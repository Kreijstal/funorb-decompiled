/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf extends fg {
    private int field_g;
    private int field_j;
    static String field_c;
    private long[] field_i;
    static String field_k;
    static String field_e;
    private long field_d;
    private long field_h;
    private long field_f;

    public static void a(byte param0) {
        field_e = null;
        if (param0 >= -106) {
          field_k = (String) null;
          field_c = null;
          field_k = null;
          return;
        }
        field_c = null;
        field_k = null;
    }

    private final long b(int param0) {
        long var2;
        long var4;
        long var6;
        int var8;
        int var9;
        long var6Lifetime1;
        long var6Lifetime2;
        long var6Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 - this.field_h;
        this.field_h = var2;
        if (-5000000000L >= var4) {
          var6 = (long)param0;
          for (var8 = 1; this.field_g >= var8; var8++) {
            var6 = var6 + this.field_i[(-var8 + this.field_j + 10) % 10];
          }
          return var6 / (long)this.field_g;
        }
        if (var4 >= 5000000000L) {
          var6Lifetime1 = (long)param0;
          for (var8Lifetime1 = 1; this.field_g >= var8Lifetime1; var8Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_i[(-var8Lifetime1 + this.field_j + 10) % 10];
          }
          return var6Lifetime1 / (long)this.field_g;
        }
        this.field_i[this.field_j] = var4;
        if (1 <= this.field_g) {
          this.field_j = (this.field_j + 1) % 10;
          var6Lifetime2 = (long)param0;
          for (var8Lifetime2 = 1; this.field_g >= var8Lifetime2; var8Lifetime2++) {
            var6Lifetime2 = var6Lifetime2 + this.field_i[(-var8Lifetime2 + this.field_j + 10) % 10];
          }
          return var6Lifetime2 / (long)this.field_g;
        }
        this.field_g = this.field_g + 1;
        this.field_j = (this.field_j + 1) % 10;
        var6Lifetime3 = (long)param0;
        for (var8Lifetime3 = 1; this.field_g >= var8Lifetime3; var8Lifetime3++) {
          var6Lifetime3 = var6Lifetime3 + this.field_i[(-var8Lifetime3 + this.field_j + 10) % 10];
        }
        return var6Lifetime3 / (long)this.field_g;
    }

    final long a(int param0) {
        this.field_d = this.field_d + this.b(0);
        if (this.field_d < this.field_f) {
          return (this.field_f - this.field_d) / 1000000L;
        }
        int var2 = -90 % ((34 - param0) / 38);
        return 0L;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 76 % ((param0 + 1) / 36);
        int var4 = param2 >> 31 & -1 + param1;
        return var4 + (param2 + (param2 >>> 31)) % param1;
    }

    final int a(long param0, byte param1) {
        int var4;
        int var5;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == 37) {
          if (this.field_f > this.field_d) {
            this.field_h = this.field_h + (-this.field_d + this.field_f);
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            this.field_f = this.field_f + param0;
            return 1;
          }
          var4 = 0;
          do {
            this.field_f = this.field_f + param0;
            var4++;
          } while (var4 < 10 &&
            this.field_d > this.field_f);
          if (this.field_f >= this.field_d) {
            return var4;
          }
          this.field_f = this.field_d;
          return var4;
        }
        field_k = (String) null;
        if (this.field_f > this.field_d) {
          this.field_h = this.field_h + (-this.field_d + this.field_f);
          this.field_d = this.field_d + (-this.field_d + this.field_f);
          this.field_f = this.field_f + param0;
          return 1;
        }
        var4 = 0;
        do {
          this.field_f = this.field_f + param0;
          var4++;
        } while (var4 < 10 &&
          this.field_d > this.field_f);
        if (this.field_f >= this.field_d) {
          return var4;
        }
        this.field_f = this.field_d;
        return var4;
    }

    final static java.net.URL a(java.applet.Applet param0, byte param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4Lifetime1;
        Object var4Lifetime2;
        try {
          var3 = null;
          if (param1 <= 74) {
            stackIn_2_0 = (java.net.URL) null;
            return stackIn_2_0;
          }
          if (e.field_c != null &&
            !e.field_c.equals(param0.getParameter("settings"))) {
            var3 = e.field_c;
            var4 = var3;
            var4Lifetime2 = var3;
          }
          var4Lifetime1 = null;
          if (null != kd.field_e &&
            !kd.field_e.equals(param0.getParameter("session"))) {
            var4Lifetime1 = kd.field_e;
          }
          stackIn_12_0 = fc.a((String) (var3), param2, (String) (var4Lifetime1), -1, 35);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("uf.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw la.a((Throwable) (stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        if (this.field_d < this.field_f) {
          this.field_d = this.field_d + (-this.field_d + this.field_f);
        }
        if (param0) {
          this.field_h = 0L;
          return;
        }
    }

    uf() {
        this.field_g = 1;
        this.field_h = 0L;
        this.field_i = new long[10];
        this.field_j = 0;
        this.field_f = 0L;
        this.field_d = 0L;
        this.field_d = System.nanoTime();
        this.field_f = System.nanoTime();
    }

    static {
        field_c = "Cancel";
        field_e = "Not yet achieved";
        field_k = "To Customer Support";
    }
}
