/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nmb extends hrb {
    private long[] field_f;
    private long field_e;
    private long field_d;
    private long field_g;
    private int field_c;
    private int field_h;

    final int a(int param0, long param1) {
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        if (param0 != 0) {
          return 1;
        }
        if (this.field_g < this.field_e) {
          this.field_d = this.field_d + (-this.field_g + this.field_e);
          this.field_g = this.field_g + (-this.field_g + this.field_e);
          this.field_e = this.field_e + param1;
          return 1;
        }
        var4 = 0;
        do {
          var4++;
          this.field_e = this.field_e + param1;
        } while (var4 < 10 &&
          this.field_g > this.field_e);
        if (this.field_e < this.field_g) {
          this.field_e = this.field_g;
        }
        return var4;
    }

    final static void d(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 > -57) {
          return;
        }
        if (gha.field_q != null) {
          var1 = gha.field_q;
          synchronized (var1) {
            gha.field_q = null;
          }
        }
    }

    final long a(byte param0) {
        this.field_g = this.field_g + this.c(-110);
        if (param0 != -81) {
          this.field_h = 67;
        }
        if (this.field_g < this.field_e) {
          return (-this.field_g + this.field_e) / 1000000L;
        }
        return 0L;
    }

    final static void a(byte param0, ana param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kpb.field_q.a(param1.field_e);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("nmb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        int var1 = 99 / ((param0 - 30) / 45);
        return wqa.field_a == lqa.field_o.field_Nb ? true : false;
    }

    nmb() {
        this.field_f = new long[10];
        this.field_g = 0L;
        this.field_d = 0L;
        this.field_e = 0L;
        this.field_c = 0;
        this.field_h = 1;
        this.field_g = System.nanoTime();
        this.field_e = System.nanoTime();
    }

    final void a(int param0) {
        if (this.field_g < this.field_e) {
          this.field_g = this.field_g + (-this.field_g + this.field_e);
        }
        this.field_d = 0L;
        if (param0 >= -78) {
          nmb.d(13);
        }
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_d;
        this.field_d = var2;
        if (-5000000000L < var4 &&
          var4 < 5000000000L) {
          this.field_f[this.field_c] = var4;
          this.field_c = (this.field_c + 1) % 10;
          if (this.field_h < 1) {
            this.field_h = this.field_h + 1;
          }
        }
        if (param0 >= -71) {
          this.field_g = 79L;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_h; var8++) {
          var6 = var6 + this.field_f[(10 + this.field_c - var8) % 10];
        }
        return var6 / (long)this.field_h;
    }

    static {
    }
}
