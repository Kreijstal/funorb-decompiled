/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs extends fp {
    private int field_g;
    static oa field_j;
    private int field_f;
    private long field_l;
    private long field_h;
    static String field_i;
    private long field_n;
    static int field_k;
    static int field_d;
    static String field_m;
    private long[] field_e;

    final void b(int param0) {
        if (param0 != -1432175600) {
          this.field_n = 67L;
          if (this.field_n > this.field_l) {
            this.field_l = this.field_l + (-this.field_l + this.field_n);
            this.field_h = 0L;
            return;
          }
          this.field_h = 0L;
          return;
        }
        if (this.field_n <= this.field_l) {
          this.field_h = 0L;
          return;
        }
        this.field_l = this.field_l + (-this.field_l + this.field_n);
        this.field_h = 0L;
    }

    final long a(int param0) {
        this.field_l = this.field_l + this.c(1);
        if (param0 != 0) {
          this.a(-15, -125L);
          if (this.field_l < this.field_n) {
            return (-this.field_l + this.field_n) / 1000000L;
          }
          return 0L;
        }
        if (this.field_l < this.field_n) {
          return (-this.field_l + this.field_n) / 1000000L;
        }
        return 0L;
    }

    public static void b(byte param0) {
        field_m = null;
        field_j = null;
        if (param0 < 53) {
          field_i = (String) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    private final long c(int param0) {
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
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = System.nanoTime();
        var4 = -this.field_h + var2;
        this.field_h = var2;
        if (var4 <= -5000000000L) {
          var6 = 0L;
          for (var8 = param0; this.field_g >= var8; var8++) {
            var6 = var6 + this.field_e[(10 - var8 + this.field_f) % 10];
          }
          return var6 / (long)this.field_g;
        }
        if (5000000000L <= var4) {
          var6Lifetime1 = 0L;
          for (var8Lifetime1 = param0; this.field_g >= var8Lifetime1; var8Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_e[(10 - var8Lifetime1 + this.field_f) % 10];
          }
          return var6Lifetime1 / (long)this.field_g;
        }
        this.field_e[this.field_f] = var4;
        if (1 <= this.field_g) {
          this.field_f = (1 + this.field_f) % 10;
          var6Lifetime2 = 0L;
          for (var8Lifetime2 = param0; this.field_g >= var8Lifetime2; var8Lifetime2++) {
            var6Lifetime2 = var6Lifetime2 + this.field_e[(10 - var8Lifetime2 + this.field_f) % 10];
          }
          return var6Lifetime2 / (long)this.field_g;
        }
        this.field_g = this.field_g + 1;
        this.field_f = (1 + this.field_f) % 10;
        var6Lifetime3 = 0L;
        for (var8Lifetime3 = param0; this.field_g >= var8Lifetime3; var8Lifetime3++) {
          var6Lifetime3 = var6Lifetime3 + this.field_e[(10 - var8Lifetime3 + this.field_f) % 10];
        }
        return var6Lifetime3 / (long)this.field_g;
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == 18907) {
          if (this.field_l < this.field_n) {
            this.field_h = this.field_h + (this.field_n - this.field_l);
            this.field_l = this.field_l + (-this.field_l + this.field_n);
            this.field_n = this.field_n + param1;
            return 1;
          }
          var4 = 0;
          do {
            var4++;
            this.field_n = this.field_n + param1;
          } while (var4 < 10 &&
            this.field_n < this.field_l);
          if (this.field_l <= this.field_n) {
            return var4;
          }
          this.field_n = this.field_l;
          return var4;
        }
        this.field_g = -122;
        if (this.field_l < this.field_n) {
          this.field_h = this.field_h + (this.field_n - this.field_l);
          this.field_l = this.field_l + (-this.field_l + this.field_n);
          this.field_n = this.field_n + param1;
          return 1;
        }
        var4 = 0;
        do {
          var4++;
          this.field_n = this.field_n + param1;
        } while (var4 < 10 &&
          this.field_n < this.field_l);
        if (this.field_l <= this.field_n) {
          return var4;
        }
        this.field_n = this.field_l;
        return var4;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        String var7 = null;
        if (em.field_h == 2) {
          var7 = ad.field_d;
        } else {
          var7 = qk.field_z;
        }
        if (param3 <= -56) {
          er.a(param4, param6, var7, param0, (byte) 122, param1, param2, param5);
          return;
        }
        tm var8 = (tm) null;
        gs.a((tm) null, false);
        er.a(param4, param6, var7, param0, (byte) 122, param1, param2, param5);
    }

    final static void a(tm param0, boolean param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2_int = hj.field_l.length - 1;
        if (!param1) {
          return;
        }
        try {
          while (var2_int >= 1) {
            hj.field_l[var2_int] = hj.field_l[-1 + var2_int];
            var2_int--;
          }
          qd.field_a = 0;
          hj.field_l[0] = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "gs.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    gs() {
        this.field_g = 1;
        this.field_l = 0L;
        this.field_f = 0;
        this.field_h = 0L;
        this.field_n = 0L;
        this.field_e = new long[10];
        this.field_l = System.nanoTime();
        this.field_n = System.nanoTime();
    }

    static {
        field_i = "<%0> must play 1 more rated game before playing with the current options.";
        field_j = new oa();
        field_k = 0;
        field_d = 2;
        field_m = "WAITING FOR <%0> PLAYERS.";
    }
}
