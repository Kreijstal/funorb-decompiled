/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends bg {
    private int field_r;
    static int field_q;
    private int field_t;
    private int field_m;
    static byte[] field_o;
    static String field_n;
    static fm field_p;
    private int field_s;

    final static tc a(byte[] param0, int param1) {
        tc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_2_0 = null;
        tc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (tc) (stackIn_2_0);
          }
          var2 = new tc(param0, fa.field_b, e.field_b, gf.field_g, ge.field_c, wo.field_f);
          re.b(140);
          var3 = -91 % ((77 - param1) / 37);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("kf.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_n = null;
        if (param0 <= 98) {
          return;
        }
        field_p = null;
    }

    final void c(int param0) {
        int var5 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        var2 = 330;
        if (this.field_r < 615) {
          stackIn_3_0 = 614 - this.field_r;
        } else {
          stackIn_3_0 = 0;
        }
        var3 = stackIn_3_0;
        this.a(param0 + 61, var3, var2, this.field_r);
        var4 = 320 - this.field_r / param0;
        for (var5 = 0; 7 > var5; var5++) {
          var6 = 13 + (76 * var5 + 76) + 2;
          if (5 + var4 <= var6 &&
            this.field_r + var4 - 6 >= var6) {
            t.f(var6, var2 + 3, 19, 0, 128);
            t.f(var6 + 1, var2 + 4, 18, 16777215, 128);
          }
        }
    }

    final void a(byte param0) {
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        super.a(param0);
        int fieldTemp$0 = this.field_s + 1;
        this.field_s = this.field_s + 1;
        if (200 <= fieldTemp$0) {
          this.field_s = 0;
          this.field_t = this.field_m * 2 / 3;
        }
        this.field_t = this.field_t - 1;
        if (this.field_t >= this.field_m - 20) {
          var2 = this.field_t * 615 / this.field_m;
          if (var2 <= this.field_r) {
            this.field_r = var2;
          } else {
            this.field_r = this.field_r + 10;
            this.field_h = 0;
            if (this.field_r > var2) {
              this.field_r = var2;
            }
          }
          if (this.field_r > 615) {
            this.field_r = 615;
          }
          return;
        }
        if (0 != this.field_t % (this.field_m >> 2)) {
          var2Lifetime1 = this.field_t * 615 / this.field_m;
          if (var2Lifetime1 <= this.field_r) {
            this.field_r = var2Lifetime1;
          } else {
            this.field_r = this.field_r + 10;
            this.field_h = 0;
            if (this.field_r > var2Lifetime1) {
              this.field_r = var2Lifetime1;
            }
          }
          if (this.field_r > 615) {
            this.field_r = 615;
          }
          return;
        }
        this.b(255);
        var2Lifetime2 = this.field_t * 615 / this.field_m;
        if (var2Lifetime2 <= this.field_r) {
          this.field_r = var2Lifetime2;
        } else {
          this.field_r = this.field_r + 10;
          this.field_h = 0;
          if (this.field_r > var2Lifetime2) {
            this.field_r = var2Lifetime2;
          }
        }
        if (this.field_r > 615) {
          this.field_r = 615;
        }
        return;
    }

    public kf() {
        this.field_s = 0;
        this.field_m = 500;
        this.field_t = 2 * this.field_m / 3;
        this.field_r = 615 * this.field_t / this.field_m;
    }

    static {
        field_n = "to over <%0> great games";
    }
}
