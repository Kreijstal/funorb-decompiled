/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends gj {
    static String field_f;
    static int field_i;
    static String field_o;
    static String field_m;
    private int field_n;
    private long field_l;
    private long field_h;
    private long field_k;
    static String field_g;
    private long[] field_j;
    static int[] field_d;
    private int field_e;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, byte param12, int param13, int param14, int param15) {
        int var17 = DungeonAssault.field_K;
        int var16 = 53 % ((param12 - 24) / 48);
        if (param3 >= param2) {
          if (param3 < param0) {
            sg.a(gf.field_b, param7, param8, param0, param13, param11, param1, param3, (byte) -13, param2, param6, param9, param4, param10, param14, param5, param15);
            return;
          }
          if (param2 < param0) {
            sg.a(gf.field_b, param4, param8, param3, param1, param15, param13, param0, (byte) -13, param2, param6, param5, param7, param10, param14, param9, param11);
            return;
          }
          sg.a(gf.field_b, param4, param7, param3, param10, param14, param13, param2, (byte) -13, param0, param5, param6, param8, param1, param15, param9, param11);
          return;
        }
        if (param0 > param2) {
          sg.a(gf.field_b, param7, param4, param0, param10, param14, param1, param2, (byte) -13, param3, param9, param6, param8, param13, param11, param5, param15);
          return;
        }
        if (param0 <= param3) {
          sg.a(gf.field_b, param8, param7, param2, param13, param11, param10, param3, (byte) -13, param0, param5, param9, param4, param1, param15, param6, param14);
          return;
        }
        sg.a(gf.field_b, param8, param4, param2, param1, param15, param10, param0, (byte) -13, param3, param9, param5, param7, param13, param11, param6, param14);
    }

    final int b(long param0, int param1) {
        int var4;
        int var5;
        var5 = DungeonAssault.field_K;
        if (param1 == 2048) {
          if (this.field_h < this.field_l) {
            this.field_k = this.field_k + (this.field_l - this.field_h);
            this.field_h = this.field_h + (-this.field_h + this.field_l);
            this.field_l = this.field_l + param0;
            return 1;
          }
          var4 = 0;
          do {
            this.field_l = this.field_l + param0;
            var4++;
          } while (var4 < 10 &&
            this.field_l < this.field_h);
          if (this.field_h <= this.field_l) {
            return var4;
          }
          this.field_l = this.field_h;
          return var4;
        }
        field_m = (String) null;
        if (this.field_h < this.field_l) {
          this.field_k = this.field_k + (this.field_l - this.field_h);
          this.field_h = this.field_h + (-this.field_h + this.field_l);
          this.field_l = this.field_l + param0;
          return 1;
        }
        var4 = 0;
        do {
          this.field_l = this.field_l + param0;
          var4++;
        } while (var4 < 10 &&
          this.field_l < this.field_h);
        if (this.field_h <= this.field_l) {
          return var4;
        }
        this.field_l = this.field_h;
        return var4;
    }

    final long a(int param0) {
        this.field_h = this.field_h + this.c(0);
        if (this.field_h >= this.field_l) {
          int var2 = -20 % ((64 - param0) / 62);
          return 0L;
        }
        return (this.field_l - this.field_h) / 1000000L;
    }

    public static void d(int param0) {
        field_m = null;
        if (param0 > -96) {
          return;
        }
        field_d = null;
        field_o = null;
        field_g = null;
        field_f = null;
    }

    final void b(int param0) {
        this.field_k = 0L;
        if (param0 < -86) {
          if (this.field_h < this.field_l) {
            this.field_h = this.field_h + (-this.field_h + this.field_l);
          }
          return;
        }
        fg.d(110);
        if (this.field_h < this.field_l) {
          this.field_h = this.field_h + (-this.field_h + this.field_l);
        }
    }

    private final long c(int param0) {
        long var6 = 0L;
        int var8 = 0;
        int var9 = DungeonAssault.field_K;
        long var2 = System.nanoTime();
        long var4 = -this.field_k + var2;
        long var6Lifetime1;
        long var6Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        this.field_k = var2;
        if (-5000000000L >= var4) {
          var6 = (long)param0;
          for (var8 = 1; this.field_n >= var8; var8++) {
            var6 = var6 + this.field_j[(10 + (this.field_e - var8)) % 10];
          }
          return var6 / (long)this.field_n;
        }
        if (var4 < 5000000000L) {
          this.field_j[this.field_e] = var4;
          if (this.field_n < 1) {
            this.field_n = this.field_n + 1;
          }
          this.field_e = (1 + this.field_e) % 10;
          var6Lifetime1 = (long)param0;
          for (var8Lifetime1 = 1; this.field_n >= var8Lifetime1; var8Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_j[(10 + (this.field_e - var8Lifetime1)) % 10];
          }
          return var6Lifetime1 / (long)this.field_n;
        }
        var6Lifetime2 = (long)param0;
        for (var8Lifetime2 = 1; this.field_n >= var8Lifetime2; var8Lifetime2++) {
          var6Lifetime2 = var6Lifetime2 + this.field_j[(10 + (this.field_e - var8Lifetime2)) % 10];
        }
        return var6Lifetime2 / (long)this.field_n;
    }

    fg() {
        this.field_h = 0L;
        this.field_n = 1;
        this.field_k = 0L;
        this.field_l = 0L;
        this.field_j = new long[10];
        this.field_e = 0;
        this.field_h = System.nanoTime();
        this.field_l = System.nanoTime();
    }

    static {
        field_f = "This huge, black-skinned, winged demon's claws and muscly build make it a raider's worst nightmare.<br><br>If this monster's <%attack> is at least twice as high as the <%defence> of the raider it encounters, the entire party will flee in terror!";
        field_o = "Whirling Blades";
        field_g = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_i = 10;
        field_m = "Waiting for extra data";
        field_d = new int[8192];
    }
}
