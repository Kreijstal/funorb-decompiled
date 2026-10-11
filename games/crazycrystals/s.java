/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends ke {
    static dl[] field_o;
    private long field_m;
    private int field_g;
    static int[] field_h;
    private int field_j;
    static String field_f;
    static char[] field_d;
    static boolean field_l;
    private long field_e;
    static long field_k;
    private long field_i;
    private long[] field_n;

    final int a(long param0, int param1) {
        int var4;
        int var5;
        var5 = CrazyCrystals.field_B;
        if (param1 != -19) {
          s.a(69, -78, -40, (byte) 66);
        }
        if (this.field_e > this.field_i) {
          this.field_m = this.field_m + (-this.field_i + this.field_e);
          this.field_i = this.field_i + (-this.field_i + this.field_e);
          this.field_e = this.field_e + param0;
          return 1;
        }
        var4 = 0;
        do {
          var4++;
          this.field_e = this.field_e + param0;
        } while (10 > var4 &&
          this.field_e < this.field_i);
        if (this.field_i > this.field_e) {
          this.field_e = this.field_i;
        }
        return var4;
    }

    final static dl[] a(int param0, int param1, int param2, byte param3) {
        if (param3 < 126) {
          return (dl[]) null;
        }
        return ue.a(9, param0, 1, param2, param1);
    }

    public static void b(byte param0) {
        field_d = null;
        field_h = null;
        if (param0 == 118) {
          field_f = null;
          field_o = null;
          return;
        }
        s.a(-125, -56, 33, (byte) -7);
        field_f = null;
        field_o = null;
    }

    final void a(int param0) {
        if (param0 != 15834) {
          return;
        }
        this.field_m = 0L;
        if (this.field_e > this.field_i) {
          this.field_i = this.field_i + (this.field_e - this.field_i);
          return;
        }
    }

    final static String a(ng param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        String var6 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var4 = 36 % ((param1 - 40) / 56);
            var3_int = param0.c(false);
            if (param2 < var3_int) {
              var3_int = param2;
            }
            var5 = new byte[var3_int];
            param0.field_f = param0.field_f + dm.field_f.a(param0.field_h, 0, -1, var3_int, param0.field_f, var5);
            var6 = gd.a((byte) 61, var5, 0, var3_int);
            stackIn_3_0 = var6;
            return stackIn_3_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_5_0 = "Cabbage";
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("s.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final long a(boolean param0) {
        this.field_i = this.field_i + this.c((byte) 14);
        if (this.field_e > this.field_i) {
          return (this.field_e - this.field_i) / 1000000L;
        }
        if (param0) {
          return 0L;
        }
        return 27L;
    }

    private final long c(byte param0) {
        long var6 = 0L;
        int var8 = 0;
        int var9 = CrazyCrystals.field_B;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_m;
        long var6Lifetime1;
        int var8Lifetime1;
        long var6Lifetime2;
        int var8Lifetime2;
        this.field_m = var2;
        if (var4 > -5000000000L) {
          if (5000000000L <= var4) {
            var6 = 0L;
            var8 = 1;
            if (param0 != 14) {
              this.a(25);
              while (this.field_g >= var8) {
                var6 = var6 + this.field_n[(10 + this.field_j - var8) % 10];
                var8++;
              }
              return var6 / (long)this.field_g;
            }
            while (this.field_g >= var8) {
              var6 = var6 + this.field_n[(10 + this.field_j - var8) % 10];
              var8++;
            }
            return var6 / (long)this.field_g;
          }
          this.field_n[this.field_j] = var4;
          this.field_j = (1 + this.field_j) % 10;
          if (this.field_g >= 1) {
            var6Lifetime2 = 0L;
            var8Lifetime2 = 1;
            if (param0 != 14) {
              this.a(25);
              while (this.field_g >= var8Lifetime2) {
                var6Lifetime2 = var6Lifetime2 + this.field_n[(10 + this.field_j - var8Lifetime2) % 10];
                var8Lifetime2++;
              }
              return var6Lifetime2 / (long)this.field_g;
            }
            while (this.field_g >= var8Lifetime2) {
              var6Lifetime2 = var6Lifetime2 + this.field_n[(10 + this.field_j - var8Lifetime2) % 10];
              var8Lifetime2++;
            }
            return var6Lifetime2 / (long)this.field_g;
          }
          this.field_g = this.field_g + 1;
        }
        var6Lifetime1 = 0L;
        var8Lifetime1 = 1;
        if (param0 != 14) {
          this.a(25);
          while (this.field_g >= var8Lifetime1) {
            var6Lifetime1 = var6Lifetime1 + this.field_n[(10 + this.field_j - var8Lifetime1) % 10];
            var8Lifetime1++;
          }
          return var6Lifetime1 / (long)this.field_g;
        }
        while (this.field_g >= var8Lifetime1) {
          var6Lifetime1 = var6Lifetime1 + this.field_n[(10 + this.field_j - var8Lifetime1) % 10];
          var8Lifetime1++;
        }
        return var6Lifetime1 / (long)this.field_g;
    }

    s() {
        this.field_m = 0L;
        this.field_g = 1;
        this.field_i = 0L;
        this.field_j = 0;
        this.field_n = new long[10];
        this.field_e = 0L;
        this.field_i = System.nanoTime();
        this.field_e = System.nanoTime();
    }

    static {
        field_d = new char[]{(char)91, (char)93, (char)35};
        field_k = 20000000L;
        field_f = "EXCLUSIVE";
    }
}
