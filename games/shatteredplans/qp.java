/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends o {
    static String field_v;
    private int field_y;
    private int field_u;
    private bi[] field_t;
    static in field_w;
    private int field_x;

    final static int[] a(boolean param0, int[] param1) {
        int var7_int = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_63_0 = null;
        int[] stackIn_65_0 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var7Lifetime1;
        int[] var7Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8_intLifetime1;
        int var8_intLifetime2;
        int var8_intLifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param1.length;
          if (null == ai.field_b ||
            !(ai.field_b.length >= var2_int * 2)) {
            ai.field_b = new int[2 * var2_int];
            en.field_b = new int[var2_int * 2];
          }
          sl.field_r = 0;
          var5 = param1[var2_int - 2];
          var6 = param1[-1 + var2_int];
          for (var7_int = 0; var7_int < var2_int; var7_int += 2) {
            var3 = var5;
            var4 = var6;
            var5 = param1[var7_int];
            var6 = param1[var7_int + 1];
            if (gf.field_i <= var5) {
              if (gf.field_i > var3) {
                var8_int = var5;
                var9 = var6;
                var10 = var3;
                var11 = var4;
                fieldTemp$18 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$18] = gf.field_i;
                fieldTemp$19 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$19] = var9 + (-var8_int + gf.field_i) * (-var9 + var11) / (var10 - var8_int);
              }
              fieldTemp$20 = sl.field_r;
              sl.field_r = sl.field_r + 1;
              ai.field_b[fieldTemp$20] = var5;
              fieldTemp$21 = sl.field_r;
              sl.field_r = sl.field_r + 1;
              ai.field_b[fieldTemp$21] = var6;
            } else {
              if (gf.field_i <= var3) {
                var8_int = var3;
                var9 = var4;
                var10 = var5;
                var11 = var6;
                fieldTemp$22 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$22] = gf.field_i;
                fieldTemp$23 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$23] = var9 + (var11 - var9) * (gf.field_i - var8_int) / (-var8_int + var10);
              }
            }
          }
          if (sl.field_r == 0) {
            stackIn_19_0 = null;
            return (int[]) (stackIn_19_0);
          }
          var7 = en.field_b;
          en.field_b = ai.field_b;
          ai.field_b = var7;
          var2_intLifetime1 = sl.field_r;
          sl.field_r = 0;
          var5Lifetime1 = en.field_b[var2_intLifetime1 - 2];
          var6Lifetime1 = en.field_b[-1 + var2_intLifetime1];
          for (var8_intLifetime1 = 0; var2_intLifetime1 > var8_intLifetime1; var8_intLifetime1 += 2) {
            var3Lifetime1 = var5Lifetime1;
            var4Lifetime1 = var6Lifetime1;
            var6Lifetime1 = en.field_b[1 + var8_intLifetime1];
            var5Lifetime1 = en.field_b[var8_intLifetime1];
            if (gf.field_l > var5Lifetime1) {
              if (var3Lifetime1 >= gf.field_l) {
                var9Lifetime1 = var5Lifetime1;
                var10Lifetime1 = var6Lifetime1;
                var11Lifetime1 = var3Lifetime1;
                var12 = var4Lifetime1;
                fieldTemp$12 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$12] = gf.field_l;
                fieldTemp$13 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$13] = (var12 - var10Lifetime1) * (-var9Lifetime1 + gf.field_l) / (var11Lifetime1 - var9Lifetime1) + var10Lifetime1;
              }
              fieldTemp$14 = sl.field_r;
              sl.field_r = sl.field_r + 1;
              ai.field_b[fieldTemp$14] = var5Lifetime1;
              fieldTemp$15 = sl.field_r;
              sl.field_r = sl.field_r + 1;
              ai.field_b[fieldTemp$15] = var6Lifetime1;
            } else {
              if (var3Lifetime1 < gf.field_l) {
                var9Lifetime1 = var3Lifetime1;
                var10Lifetime1 = var4Lifetime1;
                var11Lifetime1 = var5Lifetime1;
                var12 = var6Lifetime1;
                fieldTemp$16 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$16] = gf.field_l;
                fieldTemp$17 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$17] = var10Lifetime1 + (-var10Lifetime1 + var12) * (gf.field_l - var9Lifetime1) / (-var9Lifetime1 + var11Lifetime1);
              }
            }
          }
          if (!param0) {
            field_w = (in) null;
          }
          if (sl.field_r == 0) {
            return null;
          }
          var7Lifetime1 = en.field_b;
          en.field_b = ai.field_b;
          ai.field_b = var7Lifetime1;
          var2_intLifetime2 = sl.field_r;
          sl.field_r = 0;
          var5Lifetime2 = en.field_b[var2_intLifetime2 - 2];
          var6Lifetime2 = en.field_b[var2_intLifetime2 - 1];
          for (var8_intLifetime2 = 0; var2_intLifetime2 > var8_intLifetime2; var8_intLifetime2 += 2) {
            var4Lifetime2 = var6Lifetime2;
            var3Lifetime2 = var5Lifetime2;
            var6Lifetime2 = en.field_b[var8_intLifetime2 + 1];
            var5Lifetime2 = en.field_b[var8_intLifetime2];
            if (var6Lifetime2 >= gf.field_a) {
              if (var4Lifetime2 < gf.field_a) {
                var9Lifetime2 = var5Lifetime2;
                var10Lifetime2 = var6Lifetime2;
                var11Lifetime2 = var3Lifetime2;
                var12Lifetime1 = var4Lifetime2;
                fieldTemp$6 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$6] = var9Lifetime2 + (-var9Lifetime2 + var11Lifetime2) * (-var10Lifetime2 + gf.field_a) / (var12Lifetime1 - var10Lifetime2);
                fieldTemp$7 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$7] = gf.field_a;
              }
              fieldTemp$8 = sl.field_r;
              sl.field_r = sl.field_r + 1;
              ai.field_b[fieldTemp$8] = var5Lifetime2;
              fieldTemp$9 = sl.field_r;
              sl.field_r = sl.field_r + 1;
              ai.field_b[fieldTemp$9] = var6Lifetime2;
            } else {
              if (var4Lifetime2 >= gf.field_a) {
                var9Lifetime2 = var3Lifetime2;
                var10Lifetime2 = var4Lifetime2;
                var11Lifetime2 = var5Lifetime2;
                var12Lifetime1 = var6Lifetime2;
                fieldTemp$10 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$10] = var9Lifetime2 + (gf.field_a - var10Lifetime2) * (-var9Lifetime2 + var11Lifetime2) / (-var10Lifetime2 + var12Lifetime1);
                fieldTemp$11 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$11] = gf.field_a;
              }
            }
          }
          if (0 == sl.field_r) {
            return null;
          }
          var7Lifetime2 = en.field_b;
          en.field_b = ai.field_b;
          var2_intLifetime3 = sl.field_r;
          ai.field_b = var7Lifetime2;
          sl.field_r = 0;
          var6Lifetime3 = en.field_b[-1 + var2_intLifetime3];
          var5Lifetime3 = en.field_b[var2_intLifetime3 - 2];
          for (var8_intLifetime3 = 0; var8_intLifetime3 < var2_intLifetime3; var8_intLifetime3 += 2) {
            var3Lifetime3 = var5Lifetime3;
            var4Lifetime3 = var6Lifetime3;
            var5Lifetime3 = en.field_b[var8_intLifetime3];
            var6Lifetime3 = en.field_b[1 + var8_intLifetime3];
            if (var6Lifetime3 >= gf.field_f) {
              if (var4Lifetime3 < gf.field_f) {
                var9Lifetime3 = var3Lifetime3;
                var10Lifetime3 = var4Lifetime3;
                var11Lifetime3 = var5Lifetime3;
                var12Lifetime2 = var6Lifetime3;
                fieldTemp$0 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$0] = (gf.field_f - var10Lifetime3) * (var11Lifetime3 - var9Lifetime3) / (var12Lifetime2 - var10Lifetime3) + var9Lifetime3;
                fieldTemp$1 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$1] = gf.field_f;
              }
            } else {
              if (gf.field_f <= var4Lifetime3) {
                var9Lifetime3 = var5Lifetime3;
                var10Lifetime3 = var6Lifetime3;
                var11Lifetime3 = var3Lifetime3;
                var12Lifetime2 = var4Lifetime3;
                fieldTemp$2 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$2] = (-var9Lifetime3 + var11Lifetime3) * (gf.field_f - var10Lifetime3) / (var12Lifetime2 - var10Lifetime3) + var9Lifetime3;
                fieldTemp$3 = sl.field_r;
                sl.field_r = sl.field_r + 1;
                ai.field_b[fieldTemp$3] = gf.field_f;
              }
              fieldTemp$4 = sl.field_r;
              sl.field_r = sl.field_r + 1;
              ai.field_b[fieldTemp$4] = var5Lifetime3;
              fieldTemp$5 = sl.field_r;
              sl.field_r = sl.field_r + 1;
              ai.field_b[fieldTemp$5] = var6Lifetime3;
            }
          }
          if (sl.field_r == 0) {
            stackIn_63_0 = null;
            return (int[]) (stackIn_63_0);
          }
          var15 = new int[sl.field_r];
          var14 = var15;
          var8 = var14;
          ps.a(ai.field_b, 0, var15, 0, sl.field_r);
          stackIn_65_0 = var8;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_68_0 = var2;
          stackIn_68_1 = new StringBuilder().append("qp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
        }
    }

    public qp() {
        this(2188450, 2591221, 9543);
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param4 != 12) {
            field_v = (String) null;
          }
          if (!param0.field_k) {
            stackIn_8_0 = (param0.f(1)) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var6_int = stackIn_8_0;
          if (param0 instanceof kg) {
            param2 = param2 & ((kg) (param0)).field_y;
          }
          if (param2) {
            if (var6_int != 0) {
              stackIn_16_0 = this.field_x;
            } else {
              stackIn_16_0 = this.field_y;
            }
          } else {
            stackIn_16_0 = this.field_u;
          }
          var7 = stackIn_16_0;
          mj.a(param0.field_x, 2, var7, param3 + param0.field_q + (param0.field_n - this.field_t[0].field_p >> 1), param0.field_m + param1, this.field_t);
          stackIn_19_0 = (param2) ? 16777215 : 7105644;
          var8 = stackIn_19_0;
          this.field_c.a(param0.field_s, param1 + param0.field_m, -2 + param0.field_q + param3, param0.field_x, param0.field_n, var8, -1, 1, 1, this.field_c.field_J);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("qp.E(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static bi[] a(int param0, int param1, int param2) {
        int var3 = 124 % ((-27 - param1) / 41);
        return cr.a(param0, 1, -10, param2);
    }

    public static void b(byte param0) {
        field_w = null;
        if (param0 >= -126) {
          return;
        }
        field_v = null;
    }

    private qp(int param0, int param1, int param2) {
        this.field_t = kl.field_q;
        this.field_y = param0;
        this.field_c = sl.field_p;
        this.field_x = param1;
        this.field_u = param2;
    }

    static {
        field_v = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
