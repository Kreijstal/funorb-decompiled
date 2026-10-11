/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends fi {
    private long field_p;
    private long[] field_k;
    private int field_o;
    static hl field_i;
    private long field_n;
    private long field_m;
    static int field_l;
    private int field_j;

    final int a(byte param0, long param1) {
        int var4;
        int var5;
        int var6;
        var6 = StarCannon.field_A;
        var4 = 99 / ((param0 + 23) / 40);
        if (this.field_m > this.field_p) {
          this.field_n = this.field_n + (this.field_m - this.field_p);
          this.field_p = this.field_p + (this.field_m - this.field_p);
          this.field_m = this.field_m + param1;
          return 1;
        }
        var5 = 0;
        do {
          this.field_m = this.field_m + param1;
          var5++;
        } while (var5 < 10 &&
          this.field_p > this.field_m);
        if (this.field_m < this.field_p) {
          this.field_m = this.field_p;
        }
        return var5;
    }

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = ue.a(ik.a(param0, (byte) -113), 16778);
          if (var2 == null) {
            var2 = "";
          }
          if (param1) {
            field_i = (hl) null;
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("hf.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(byte param0) {
        int var2 = 47 % ((15 - param0) / 35);
        if (this.field_p < this.field_m) {
          this.field_p = this.field_p + (this.field_m - this.field_p);
        }
        this.field_n = 0L;
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = StarCannon.field_A;
        long var2 = System.nanoTime();
        long var4 = -this.field_n + var2;
        this.field_n = var2;
        if (var4 > -5000000000L &&
          5000000000L > var4) {
          this.field_k[this.field_o] = var4;
          this.field_o = (this.field_o + 1) % 10;
          if (this.field_j < 1) {
            this.field_j = this.field_j + 1;
          }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_j; var8++) {
          var6 = var6 + this.field_k[(10 - var8 + this.field_o) % 10];
        }
        if (param0 != 4216) {
          this.field_o = 87;
        }
        return var6 / (long)this.field_j;
    }

    final static void a(int param0, int param1, int param2, hl[] param3, int param4, int param5, hl[] param6, int param7, qe param8, int param9, int param10, boolean param11) {
        try {
          qc.a(param3, param4, param2, param6, param4, -109, param2, param7, param11, param5, param0, param8, param10, param1, param8);
          if (param9 != -11) {
            hf.b(-126);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "hf.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != -22720) {
          qe var2 = (qe) null;
          hf.a(91, -55, 77, (hl[]) null, -30, 57, (hl[]) null, 31, (qe) null, 69, -32, false);
        }
        field_i = null;
    }

    final long a(byte param0) {
        if (param0 != -51) {
          return 99L;
        }
        this.field_p = this.field_p + this.c(4216);
        if (this.field_p < this.field_m) {
          return (this.field_m - this.field_p) / 1000000L;
        }
        return 0L;
    }

    hf() {
        this.field_p = 0L;
        this.field_k = new long[10];
        this.field_n = 0L;
        this.field_o = 0;
        this.field_m = 0L;
        this.field_j = 1;
        this.field_p = System.nanoTime();
        this.field_m = System.nanoTime();
    }

    static {
        field_l = 250;
    }
}
