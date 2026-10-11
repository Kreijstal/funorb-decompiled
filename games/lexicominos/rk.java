/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends tb {
    static ee field_c;
    private int field_e;
    static volatile boolean field_m;
    static int field_g;
    private long field_j;
    private int field_l;
    private long field_h;
    private long[] field_f;
    static aj field_n;
    private long field_i;
    static aj field_d;
    static String field_k;

    final void a(byte param0) {
        this.field_i = 0L;
        if (param0 != 50) {
          field_c = (ee) null;
          if (this.field_h < this.field_j) {
            this.field_h = this.field_h + (this.field_j - this.field_h);
            return;
          }
          return;
        }
        if (this.field_h >= this.field_j) {
          return;
        }
        this.field_h = this.field_h + (this.field_j - this.field_h);
    }

    public static void a(boolean param0) {
        field_d = null;
        field_k = null;
        field_n = null;
        if (!param0) {
          return;
        }
        field_c = null;
    }

    final long b(int param0) {
        if (param0 != 255) {
          field_m = true;
          this.field_h = this.field_h + this.c(10);
          if (this.field_j <= this.field_h) {
            return 0L;
          }
          return (this.field_j - this.field_h) / 1000000L;
        }
        this.field_h = this.field_h + this.c(10);
        if (this.field_j <= this.field_h) {
          return 0L;
        }
        return (this.field_j - this.field_h) / 1000000L;
    }

    private final long c(int param0) {
        long var2;
        long var4;
        long var6;
        int var8;
        int var9;
        var9 = Lexicominos.field_L ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 - this.field_i;
        this.field_i = var2;
        if (var4 <= -5000000000L) {
          var6 = 0L;
          for (var8 = 1; this.field_l >= var8; var8++) {
            var6 = var6 + this.field_f[(this.field_e - (var8 - 10)) % 10];
          }
        } else {
          if (5000000000L <= var4) {
            var6 = 0L;
            for (var8 = 1; this.field_l >= var8; var8++) {
              var6 = var6 + this.field_f[(this.field_e - (var8 - 10)) % 10];
            }
          } else {
            this.field_f[this.field_e] = var4;
            this.field_e = (this.field_e + 1) % 10;
            if (this.field_l >= 1) {
              var6 = 0L;
              for (var8 = 1; this.field_l >= var8; var8++) {
                var6 = var6 + this.field_f[(this.field_e - (var8 - 10)) % 10];
              }
              if (param0 != 10) {
                return -86L;
              }
              return var6 / (long)this.field_l;
            }
            this.field_l = this.field_l + 1;
            var6 = 0L;
            for (var8 = 1; this.field_l >= var8; var8++) {
              var6 = var6 + this.field_f[(this.field_e - (var8 - 10)) % 10];
            }
          }
        }
        if (param0 != 10) {
          return -86L;
        }
        return var6 / (long)this.field_l;
    }

    final int a(long param0, byte param1) {
        int var4;
        int var5;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param1 > 113) {
          if (this.field_h < this.field_j) {
            this.field_i = this.field_i + (-this.field_h + this.field_j);
            this.field_h = this.field_h + (-this.field_h + this.field_j);
            this.field_j = this.field_j + param0;
            return 1;
          }
          var4 = 0;
          do {
            this.field_j = this.field_j + param0;
            var4++;
          } while (var4 < 10 &&
            this.field_j < this.field_h);
          if (this.field_j < this.field_h) {
            this.field_j = this.field_h;
          }
          return var4;
        }
        field_g = -117;
        if (this.field_h < this.field_j) {
          this.field_i = this.field_i + (-this.field_h + this.field_j);
          this.field_h = this.field_h + (-this.field_h + this.field_j);
          this.field_j = this.field_j + param0;
          return 1;
        }
        var4 = 0;
        do {
          this.field_j = this.field_j + param0;
          var4++;
        } while (var4 < 10 &&
          this.field_j < this.field_h);
        if (this.field_j < this.field_h) {
          this.field_j = this.field_h;
        }
        return var4;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, boolean param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          if (!param1) {
            rk.a(true);
          }
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param3))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (var9 < 97) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (var9 >= param0) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + param0 * var6;
                if (var6 != var10 / param0) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_42_0 = var5;
            return stackIn_42_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("rk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(')').toString());
        }
    }

    rk() {
        this.field_j = 0L;
        this.field_h = 0L;
        this.field_f = new long[10];
        this.field_e = 0;
        this.field_i = 0L;
        this.field_l = 1;
        this.field_h = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    static {
        field_m = true;
        field_n = new aj(2, 4, 4, 0);
        field_d = new aj(6, 0, 4, 2);
        field_k = "2 of 4";
    }
}
