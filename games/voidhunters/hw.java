/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hw {
    private int field_a;
    static asb field_e;
    private long[] field_c;
    static int[][] field_d;
    static int field_b;

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_d = (int[][]) null;
        field_e = null;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_a;
        this.field_a = this.field_a + 1;
        this.field_c[fieldTemp$0] = param0;
        if (param1 == -115) {
          if (this.field_a >= this.field_c.length) {
            this.field_a = 0;
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var12 = 0;
        int var6;
        long var7;
        int var9;
        int var10;
        int var11;
        int var13;
        long var14;
        int var16;
        int var17;
        var17 = VoidHunters.field_G;
        var6 = 500;
        if (var6 != this.field_c.length) {
          this.field_c = new long[var6];
          if (this.field_c.length <= this.field_a) {
            this.field_a = 0;
          }
        }
        param3 = param3 + param0;
        var7 = 40000000L;
        var9 = param4;
        var10 = param3;
        var11 = 16711935;
        for (var12 = 0; this.field_c.length > var12; var12++) {
          var13 = param2 * var12 / this.field_c.length + param4;
          var14 = this.field_c[var12];
          var16 = -(int)(var14 * (long)param0 / var7) + param3;
          if (~var12 == ~this.field_a) {
            c.a(10 + param3, var13, var13, param3, -16777216, 16711680);
          }
          if (var12 > 0) {
            c.a(var16, var13, var9, var10, -16777216, var11);
          }
          var10 = var16;
          var9 = var13;
        }
        if (param1 < 88) {
          this.a(13L, (byte) 97);
        }
        cka.a(-1, "Currentval=" + this.field_c[(-1 + (this.field_c.length + this.field_a)) % this.field_c.length] / 1000L, var11, -(param0 / 2) + param3, param2 + param4, 4266);
        cka.a(-1, "Maxval=" + var7 / 1000L, var11, 20 - param0 / 2 + param3, param2 + param4, 4266);
    }

    hw() {
        this.field_a = 0;
        this.field_c = new long[500];
    }

    static {
        field_d = new int[1][0];
        field_b = 0;
    }
}
