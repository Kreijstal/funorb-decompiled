/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends ta implements ec {
    private int[] field_s;
    private int field_q;
    private static cf field_r;
    private static ei field_t;
    private static ei field_u;

    final void b() {
        if (!this.a((byte) 73)) {
          field_t.a((byte) 54, (q) (this));
        }
    }

    final static ja a(ec param0, int param1) {
        int var7 = 0;
        int var8 = 0;
        ja var11 = null;
        int[] var9 = null;
        int var10 = 0;
        long var2 = (long)param1;
        ja var4 = (ja) (field_r.a(var2, 4604));
        if (var4 != null) {
          return var4;
        }
        int[] var13 = param0.a(param1, be.field_d);
        int[] var12 = var13;
        int[] var5 = var12;
        int var6 = pj.a(param0.b(param1), 64);
        if (var5 != null) {
          var7 = param0.a(param1) ? 64 : 128;
          var8 = var7 * var7;
          var11 = var7 == 64 ? (ja) (field_t.a((byte) -119)) : (ja) (field_u.a((byte) 122));
          var4 = var11;
          if (var11 == null) {
            var4 = new ja(var6, new int[var8]);
          } else {
            var11.field_q = var6;
          }
          var9 = var4.field_s;
          for (var10 = var8 - 1; var10 >= 0; var10--) {
            var9[var10] = ja.i(var13[var10]);
          }
          field_r.a(var2, var4, 0);
          return var4;
        }
        return ja.a(new long[64], var6);
    }

    final static ja a(long[] param0, int param1) {
        long var8 = 0L;
        int var10 = 0;
        int var2 = be.field_a[param1];
        ja var3 = (ja) (field_t.a((byte) -114));
        if (var3 == null) {
          var3 = new ja(var2, new int[4096]);
        } else {
          var3.field_q = var2;
        }
        int var4 = be.field_a[pj.a(param1, 64)];
        int[] var5 = var3.field_s;
        int var6 = 63;
        int var7 = 4096;
        while (var6 >= 0) {
          var8 = param0[var6];
          for (var10 = 63; var10 >= 0; var10--) {
            var7--;
            var5[var7] = var8 % 2L == 0L ? var2 : var4;
            var8 = var8 >> 1;
          }
          var6--;
        }
        return var3;
    }

    public final int c(int param0) {
        return 0;
    }

    public final boolean a(int param0) {
        return this.field_s.length == 4096;
    }

    public final int[] a(int param0, float param1) {
        return this.field_s;
    }

    final static ja a(long[] param0, ec param1, int param2) {
        int incrementValue$8 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_5_0 = 0;
        q stackIn_8_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        int[] var3;
        int var4;
        int var5;
        ja var6;
        int[] var7;
        int var8;
        int var9;
        long var10;
        int var12;
        int var13;
        int[] var14;
        int[] var15;
        int var8Lifetime1;
        int var9Lifetime1;
        long var10Lifetime1;
        int var12Lifetime1;
        long var10Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        var15 = param1.a(param2, be.field_d);
        var14 = var15;
        var3 = var14;
        if (var3 == null) {
          return ja.a(param0, param1.b(param2));
        }
        stackIn_5_0 = (!param1.a(param2)) ? 128 : 64;
        var4 = stackIn_5_0;
        var5 = var4 * var4;
        if (var4 != 64) {
          stackIn_8_0 = field_u.a((byte) -98);
        } else {
          stackIn_8_0 = field_t.a((byte) -123);
        }
        var6 = (ja) (stackIn_8_0);
        if (var6 != null) {
          var6.field_q = param1.b(param2);
        } else {
          var6 = new ja(param1.b(param2), new int[var5]);
        }
        var7 = var6.field_s;
        if (var4 == 64) {
          var8 = 63;
          var9 = var5 - 1;
          while (var8 >= 0) {
            var10 = param0[var8];
            for (var12 = 63; var12 >= 0; var12--) {
              var13 = var15[var9];
              incrementValue$8 = var9;
              var9--;
              stackIn_19_0 = var7;
              stackIn_19_1 = incrementValue$8;
              if (var10 % 2L == 0L) {
                stackIn_20_2 = var13;
              } else {
                stackIn_20_2 = ja.i(var13);
              }
              stackIn_19_0[stackIn_19_1] = stackIn_20_2;
              var10 = var10 >> 1;
            }
            var8--;
          }
          return var6;
        }
        var8Lifetime1 = 63;
        var9Lifetime1 = var5 - 1;
        while (var8Lifetime1 >= 0) {
          var10Lifetime1 = param0[var8Lifetime1];
          for (var12Lifetime1 = 63; var12Lifetime1 >= 0; var12Lifetime1--) {
            if (var10Lifetime1 % 2L == 0L) {
              incrementValue$4 = var9Lifetime1;
              var9Lifetime1--;
              var7[incrementValue$4] = var15[var9Lifetime1];
              incrementValue$5 = var9Lifetime1;
              var9Lifetime1--;
              var7[incrementValue$5] = var15[var9Lifetime1];
            } else {
              incrementValue$6 = var9Lifetime1;
              var9Lifetime1--;
              var7[incrementValue$6] = ja.i(var15[var9Lifetime1]);
              incrementValue$7 = var9Lifetime1;
              var9Lifetime1--;
              var7[incrementValue$7] = ja.i(var15[var9Lifetime1]);
            }
            var10Lifetime1 = var10Lifetime1 >> 1;
          }
          var10Lifetime1Lifetime1 = param0[var8Lifetime1];
          for (var12Lifetime1Lifetime1 = 63; var12Lifetime1Lifetime1 >= 0; var12Lifetime1Lifetime1--) {
            if (var10Lifetime1Lifetime1 % 2L == 0L) {
              incrementValue$0 = var9Lifetime1;
              var9Lifetime1--;
              var7[incrementValue$0] = var15[var9Lifetime1];
              incrementValue$1 = var9Lifetime1;
              var9Lifetime1--;
              var7[incrementValue$1] = var15[var9Lifetime1];
            } else {
              incrementValue$2 = var9Lifetime1;
              var9Lifetime1--;
              var7[incrementValue$2] = ja.i(var15[var9Lifetime1]);
              incrementValue$3 = var9Lifetime1;
              var9Lifetime1--;
              var7[incrementValue$3] = ja.i(var15[var9Lifetime1]);
            }
            var10Lifetime1Lifetime1 = var10Lifetime1Lifetime1 >> 1;
          }
          var8Lifetime1--;
        }
        return var6;
    }

    private ja(int param0, int[] param1) {
        this.field_q = param0;
        this.field_s = param1;
    }

    private final static int i(int param0) {
        return param0 - (8355711 & param0 >> 1);
    }

    public static void a() {
        field_r = null;
        field_t = null;
        field_u = null;
    }

    public final boolean d(int param0) {
        return true;
    }

    public final int b(int param0) {
        return this.field_q;
    }

    static {
        field_r = new cf(16);
        field_t = new ei();
        field_u = new ei();
    }
}
