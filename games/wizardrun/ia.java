/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends md {
    static le[] field_f;
    static o[] field_i;
    private long field_h;
    static String[] field_p;
    static int field_n;
    private int field_l;
    private long field_m;
    static int field_j;
    private int field_o;
    private long[] field_k;
    private long field_g;

    final void a(int param0) {
        this.field_g = 0L;
        if (this.field_m < this.field_h) {
          this.field_m = this.field_m + (-this.field_m + this.field_h);
        }
        if (param0 != 5) {
          this.field_k = (long[]) null;
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_i = null;
        if (param0) {
          field_p = (String[]) null;
        }
        field_p = null;
    }

    final static void a(int param0, wc param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = wizardrun.field_H;
        try {
          for (var2_int = 0; 3 > var2_int; var2_int++) {
            hj.field_b[var2_int] = 0;
          }
          for (var2_intLifetime1 = param0; var2_intLifetime1 < ca.field_e; var2_intLifetime1++) {
            if (param1.field_i == mi.field_B[var2_intLifetime1].field_i) {
              dupTemp$3 = mi.field_B[var2_intLifetime1].a((byte) 102);
              hj.field_b[dupTemp$3] = hj.field_b[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param1.a((byte) 102);
          hj.field_b[dupTemp$0] = hj.field_b[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; ca.field_e > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (mi.field_B[var3].field_i == param1.field_i) {
              var4 = mi.field_B[var3].a((byte) 102);
              if (qh.field_j < hj.field_b[var4]) {
                hj.field_b[var4] = hj.field_b[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              mi.field_B[incrementValue$2] = mi.field_B[var3];
            }
          }
          ca.field_e = var2_intLifetime2;
          fieldTemp$1 = ca.field_e;
          ca.field_e = ca.field_e + 1;
          mi.field_B[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ia.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final long b(byte param0) {
        this.field_m = this.field_m + this.a(true);
        if (param0 != 66) {
          return -28L;
        }
        if (this.field_m < this.field_h) {
          return (-this.field_m + this.field_h) / 1000000L;
        }
        return 0L;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = wizardrun.field_H;
        try {
          var1_int = id.field_b[param0];
          for (var2 = 1; var2 < id.field_b.length; var2++) {
            var3 = id.field_b[var2];
            g.a(cb.field_e, var2 << 4, cb.field_e, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ia.J(" + param0 + ')');
        }
    }

    final int a(long param0, boolean param1) {
        int var4;
        int var5;
        var5 = wizardrun.field_H;
        if (!param1) {
          this.field_l = -1;
        }
        if (this.field_h > this.field_m) {
          this.field_g = this.field_g + (this.field_h - this.field_m);
          this.field_m = this.field_m + (-this.field_m + this.field_h);
          this.field_h = this.field_h + param0;
          return 1;
        }
        var4 = 0;
        do {
          this.field_h = this.field_h + param0;
          var4++;
        } while (var4 < 10 &&
          this.field_h < this.field_m);
        if (this.field_h < this.field_m) {
          this.field_h = this.field_m;
        }
        return var4;
    }

    private final long a(boolean param0) {
        int var8 = 0;
        int var9 = wizardrun.field_H;
        if (!param0) {
          field_f = (le[]) null;
        }
        long var2 = System.nanoTime();
        long var4 = -this.field_g + var2;
        this.field_g = var2;
        if (var4 > -5000000000L &&
          var4 < 5000000000L) {
          this.field_k[this.field_l] = var4;
          this.field_l = (1 + this.field_l) % 10;
          if (this.field_o < 1) {
            this.field_o = this.field_o + 1;
          }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_o; var8++) {
          var6 = var6 + this.field_k[(this.field_l + (-var8 + 10)) % 10];
        }
        return var6 / (long)this.field_o;
    }

    ia() {
        this.field_h = 0L;
        this.field_m = 0L;
        this.field_l = 0;
        this.field_o = 1;
        this.field_k = new long[10];
        this.field_g = 0L;
        this.field_m = System.nanoTime();
        this.field_h = System.nanoTime();
    }

    static {
        field_p = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
