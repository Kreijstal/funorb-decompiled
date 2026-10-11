/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    private int[] field_g;
    static int[] field_i;
    private int field_k;
    static boolean field_e;
    private int field_f;
    static String field_h;
    static int field_c;
    static boolean field_d;
    private int field_a;
    private int[] field_b;
    private int field_l;
    static long field_j;

    private final void b(int param0) {
        int var2 = 0;
        int var11 = TorChallenge.field_F ? 1 : 0;
        int var5 = -1640531527;
        int var4 = -1640531527;
        int var6 = -1640531527;
        int var10 = -1640531527;
        int var7 = -1640531527;
        int var9 = -1640531527;
        int var3 = -1640531527;
        int var8 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var8 = var8 + this.field_g[var2Lifetime1 + 5];
          var5 = var5 + this.field_g[2 + var2Lifetime1];
          var10 = var10 + this.field_g[7 + var2Lifetime1];
          var6 = var6 + this.field_g[var2Lifetime1 + 3];
          var7 = var7 + this.field_g[4 + var2Lifetime1];
          var3 = var3 + this.field_g[var2Lifetime1];
          var4 = var4 + this.field_g[var2Lifetime1 + 1];
          var9 = var9 + this.field_g[6 + var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_b[var2Lifetime1] = var3;
          this.field_b[1 + var2Lifetime1] = var4;
          this.field_b[var2Lifetime1 + 2] = var5;
          this.field_b[3 + var2Lifetime1] = var6;
          this.field_b[var2Lifetime1 + 4] = var7;
          this.field_b[5 + var2Lifetime1] = var8;
          this.field_b[6 + var2Lifetime1] = var9;
          this.field_b[7 + var2Lifetime1] = var10;
        }
        if (param0 >= -57) {
          this.c(75);
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var7 = var7 + this.field_b[4 + var2Lifetime2];
          var9 = var9 + this.field_b[6 + var2Lifetime2];
          var8 = var8 + this.field_b[var2Lifetime2 + 5];
          var4 = var4 + this.field_b[var2Lifetime2 + 1];
          var3 = var3 + this.field_b[var2Lifetime2];
          var5 = var5 + this.field_b[var2Lifetime2 + 2];
          var10 = var10 + this.field_b[7 + var2Lifetime2];
          var6 = var6 + this.field_b[var2Lifetime2 + 3];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_b[var2Lifetime2] = var3;
          this.field_b[1 + var2Lifetime2] = var4;
          this.field_b[var2Lifetime2 + 2] = var5;
          this.field_b[var2Lifetime2 + 3] = var6;
          this.field_b[4 + var2Lifetime2] = var7;
          this.field_b[5 + var2Lifetime2] = var8;
          this.field_b[var2Lifetime2 + 6] = var9;
          this.field_b[7 + var2Lifetime2] = var10;
        }
        this.c(-26);
        this.field_l = 256;
    }

    final int d(int param0) {
        int var2 = -24 % ((param0 - 75) / 51);
        if (this.field_l == 0) {
          this.c(-26);
          this.field_l = 256;
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        return this.field_g[fieldTemp$0];
    }

    public static void a(int param0) {
        field_h = null;
        field_i = null;
        if (param0 <= 16) {
          field_d = false;
        }
    }

    final static void a(byte param0, int param1) {
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (o.field_l > 0) {
            if (pg.field_p == null) {
              fd.a((byte) -86);
            }
            o.field_l = o.field_l - 1;
            if (0 == o.field_l) {
              ug.field_o = 0;
              df.field_O = true;
            }
          }
          if (o.field_l > 0 &&
            wb.field_p.field_db <= 0) {
            df.field_O = true;
            o.field_l = 0;
            ug.field_o = 0;
          }
          if (o.field_l == 0 &&
            ok.field_a != null) {
            ri.f(127);
          }
          if (hb.field_f > 0) {
            hb.field_f = hb.field_f - 1;
          }
          if (param0 <= 67) {
            ed.a(-124);
          }
          for (var2_int = 0; 6 > var2_int; var2_int++) {
            if (0 <= wa.field_sb[var2_int]) {
              wa.field_sb[var2_int] = wa.field_sb[var2_int] - 1;
            }
          }
          var2_intLifetime1 = 0;
          while (var2_intLifetime1 < 5) {
            stackIn_30_0 = 0;
            stackIn_30_1 = kd.field_k[var2_intLifetime1];
            if (stackIn_30_0 <= stackIn_30_1) {
              kd.field_k[var2_intLifetime1] = kd.field_k[var2_intLifetime1] - 1;
            }
            var2_intLifetime1++;
          }
          if (null == ea.field_g) {
            return;
          }
          for (var2_intLifetime2 = 0; var2_intLifetime2 < ea.field_g.length; var2_intLifetime2++) {
            if (ea.field_g[var2_intLifetime2] != null &&
              0 != ea.field_g[var2_intLifetime2].field_F) {
              ea.field_g[var2_intLifetime2] = ea.field_g[var2_intLifetime2].c((byte) 29, param1);
              if (ea.field_g[var2_intLifetime2] != null &&
                vg.a(ea.field_g[var2_intLifetime2].field_F, -1)) {
                ea.field_g[var2_intLifetime2].l(0);
              }
            }
          }
          if (hc.field_Q &&
            ub.field_n >= 0) {
            ub.field_n = ub.field_n - 1;
            cb.a(25, wb.field_p.field_H, (byte) 93, wb.field_p.field_o);
          }
          t.b(true);
          hk.a(126);
          if (we.field_f > 0) {
            we.field_f = we.field_f - 1;
          }
          if (ii.field_i > 0) {
            ii.field_i = ii.field_i - 1;
            if (ii.field_i == 0) {
              be.field_d = 0;
            }
          }
          if (we.field_f < 0) {
            we.field_f = 0;
          }
          if (ql.field_n > 25) {
            ql.field_n = 25;
          }
          if (we.field_f == 0) {
            ec.field_e = false;
          }
          if (ql.field_n > 0) {
            ql.field_n = ql.field_n - 1;
          }
          if (ql.field_n < 0) {
            ql.field_n = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "ed.E(" + param0 + ',' + param1 + ')');
        }
    }

    ed(int[] param0) {
        int var2_int = 0;
        try {
          this.field_g = new int[256];
          this.field_b = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_g[var2_int] = param0[var2_int];
          }
          this.b(-82);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ed.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (param0 != -26) {
          field_e = true;
        }
        int fieldTemp$0 = this.field_k + 1;
        this.field_k = this.field_k + 1;
        this.field_f = this.field_f + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_b[var2];
          if ((2 & var2) == 0) {
            if (0 == (1 & var2)) {
              this.field_a = this.field_a ^ this.field_a << 13;
            } else {
              this.field_a = this.field_a ^ this.field_a >>> 6;
            }
          } else {
            if ((var2 & 1) != 0) {
              this.field_a = this.field_a ^ this.field_a >>> 16;
            } else {
              this.field_a = this.field_a ^ this.field_a << 2;
            }
          }
          this.field_a = this.field_a + this.field_b[255 & 128 + var2];
          dupTemp$1 = this.field_b[jh.a(var3 >> 2, 255)] + this.field_a + this.field_f;
          var4 = dupTemp$1;
          this.field_b[var2] = dupTemp$1;
          dupTemp$2 = this.field_b[jh.a(var4 >> 8 >> 2, 255)] + var3;
          this.field_f = dupTemp$2;
          this.field_g[var2] = dupTemp$2;
        }
    }

    static {
        field_c = 0;
        field_h = "Names can only contain letters, numbers, spaces and underscores";
        field_i = new int[]{6, 433, 214, 42};
    }
}
