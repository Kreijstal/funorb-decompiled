/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends ug {
    private long[] field_l;
    private long field_h;
    static int field_d;
    private int field_i;
    private long field_f;
    static int[] field_e;
    private long field_j;
    private int field_g;
    static int field_k;

    final static er[] a(int param0, int param1, r param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 13416) {
            field_k = -9;
          }
          if (hq.a(124, param1, param0, param2)) {
            return vd.a((byte) 76);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("nl.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final long d(int param0) {
        long var6 = 0L;
        int var8 = 0;
        int var9 = Vertigo2.field_L ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_f;
        long var6Lifetime1;
        long var6Lifetime2;
        long var6Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        this.field_f = var2;
        if (param0 != -9830) {
          return -86L;
        }
        if (var4 <= -5000000000L) {
          var6 = 0L;
          for (var8 = 1; this.field_i >= var8; var8++) {
            var6 = var6 + this.field_l[(-var8 + (this.field_g + 10)) % 10];
          }
          return var6 / (long)this.field_i;
        }
        if (5000000000L <= var4) {
          var6Lifetime1 = 0L;
          for (var8Lifetime1 = 1; this.field_i >= var8Lifetime1; var8Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_l[(-var8Lifetime1 + (this.field_g + 10)) % 10];
          }
          return var6Lifetime1 / (long)this.field_i;
        }
        this.field_l[this.field_g] = var4;
        this.field_g = (1 + this.field_g) % 10;
        if (this.field_i >= 1) {
          var6Lifetime2 = 0L;
          for (var8Lifetime2 = 1; this.field_i >= var8Lifetime2; var8Lifetime2++) {
            var6Lifetime2 = var6Lifetime2 + this.field_l[(-var8Lifetime2 + (this.field_g + 10)) % 10];
          }
          return var6Lifetime2 / (long)this.field_i;
        }
        this.field_i = this.field_i + 1;
        var6Lifetime3 = 0L;
        for (var8Lifetime3 = 1; this.field_i >= var8Lifetime3; var8Lifetime3++) {
          var6Lifetime3 = var6Lifetime3 + this.field_l[(-var8Lifetime3 + (this.field_g + 10)) % 10];
        }
        return var6Lifetime3 / (long)this.field_i;
    }

    final long a(int param0) {
        this.field_h = this.field_h + this.d(-9830);
        int var2 = -114 / ((param0 - 8) / 62);
        if (this.field_j > this.field_h) {
          return (-this.field_h + this.field_j) / 1000000L;
        }
        return 0L;
    }

    final void b(int param0) {
        if (this.field_j > this.field_h) {
          this.field_h = this.field_h + (-this.field_h + this.field_j);
        }
        if (param0 == -1) {
          this.field_f = 0L;
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 == 107) {
          return 250 < hm.field_F ? true : false;
        }
        field_k = -83;
        return 250 < hm.field_F ? true : false;
    }

    public static void e(int param0) {
        int var1 = 71 % ((70 - param0) / 39);
        field_e = null;
    }

    final int a(boolean param0, long param1) {
        int var4;
        int var5;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param0) {
        }
        if (this.field_j > this.field_h) {
          this.field_f = this.field_f + (this.field_j - this.field_h);
          this.field_h = this.field_h + (this.field_j - this.field_h);
          this.field_j = this.field_j + param1;
          return 1;
        }
        var4 = 0;
        do {
          this.field_j = this.field_j + param1;
          var4++;
        } while (var4 < 10 &&
          this.field_j < this.field_h);
        if (this.field_h > this.field_j) {
          this.field_j = this.field_h;
        }
        return var4;
    }

    nl() {
        this.field_i = 1;
        this.field_h = 0L;
        this.field_l = new long[10];
        this.field_f = 0L;
        this.field_j = 0L;
        this.field_g = 0;
        this.field_h = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    static {
        field_e = new int[]{14, 15, 16, 36, 7};
    }
}
