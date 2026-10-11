/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends am {
    private int field_s;
    static int field_w;
    static int field_x;
    static la field_v;
    static long field_u;
    static String field_y;
    static la field_t;

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.field_s = param0.i(7088);
          }
          if (param1 != 35) {
            field_u = -102L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("eg.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public eg() {
        super(0, true);
        this.field_s = 585;
    }

    final static void a(int param0, int param1, fn param2, int param3, fn param4, boolean param5) {
        try {
          hn.field_z = param1;
          id.field_b = param4;
          aq.field_b = param3;
          ln.field_D = param0;
          kc.field_x = param2;
          if (!param5) {
            field_v = (la) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "eg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final int[] a(byte param0, int param1) {
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_35_0 = 0;
        int[] var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var9Lifetime1;
        var8 = Torquing.field_u;
        if (param0 <= 86) {
          eg.b(-24);
        }
        var11 = this.field_l.a(param1, 25657);
        var10 = var11;
        var9 = var10;
        var3 = var9;
        if (this.field_l.field_b) {
          var4 = dp.field_a[param1];
          for (var5 = 0; var5 < ci.field_c; var5++) {
            var6 = q.field_b[var5];
            if (this.field_s < var6 &&
              var6 < -this.field_s + 4096 &&
              -this.field_s + 2048 < var4 &&
              2048 + this.field_s > var4) {
              var7 = -var6 + 2048;
              if (0 > var7) {
                var9 = var3;
                stackIn_12_0 = -var7;
              } else {
                stackIn_12_0 = var7;
              }
              var9 = var3;
              var7 = stackIn_12_0;
              var7 = var7 << 12;
              var7 = var7 / (2048 - this.field_s);
              var9[var5] = -var7 + 4096;
            } else if (var6 > -this.field_s + 2048 &&
              var6 < 2048 + this.field_s) {
              var7 = -2048 + var4;
              if (0 <= var7) {
                stackIn_19_0 = var7;
              } else {
                stackIn_19_0 = -var7;
              }
              var7 = stackIn_19_0;
              var7 = var7 - this.field_s;
              var7 = var7 << 12;
              var9[var5] = var7 / (2048 - this.field_s);
            } else if (var4 >= this.field_s &&
              4096 - this.field_s >= var4) {
              if (this.field_s <= var6 &&
                var6 <= -this.field_s + 4096) {
                var11[var5] = 0;
              } else {
                var7 = 2048 - var4;
                if (0 <= var7) {
                  stackIn_35_0 = var7;
                } else {
                  stackIn_35_0 = -var7;
                }
                var7 = stackIn_35_0;
                var7 = var7 << 12;
                var7 = var7 / (-this.field_s + 2048);
                var9[var5] = -var7 + 4096;
              }
            } else {
              var7 = var6 - 2048;
              if (var7 >= 0) {
                stackIn_27_0 = var7;
              } else {
                stackIn_27_0 = -var7;
              }
              var7 = stackIn_27_0;
              var7 = var7 - this.field_s;
              var7 = var7 << 12;
              var9[var5] = var7 / (-this.field_s + 2048);
            }
          }
        }
        var9Lifetime1 = var3;
        return var9Lifetime1;
    }

    public static void b(int param0) {
        if (param0 >= -17) {
          field_t = (la) null;
        }
        field_v = null;
        field_y = null;
        field_t = null;
    }

    static {
        field_y = "Achievements";
        field_u = 20000000L;
    }
}
