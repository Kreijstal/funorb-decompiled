/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ag {
    static byte[][] field_d;
    static float[] field_c;
    tk[] field_a;
    static int field_b;

    final int b(int param0, int param1) {
        int var3 = 0;
        tk var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        for (var3 = 0; var3 < this.field_a.length; var3++) {
          var4 = this.field_a[var3];
          if (param0 < var4.field_b.length) {
            return var3;
          }
          param0 = param0 - (var4.field_b.length - 1);
        }
        if (param1 != -17500) {
          ag.c(-10);
        }
        return this.field_a.length;
    }

    final int a(int param0, int param1, String param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = 0;
          if (param0 != -292767736) {
            ag.b(3);
          }
          var6 = 0;
          var7 = param2.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param2.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (var9 != 62) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (0 < var5_int) {
            stackIn_21_0 = (-param3 + param1 << 8) / var5_int;
            return stackIn_21_0;
          }
          stackIn_23_0 = 0;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ag.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        tk var6;
        int var7;
        int var8;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_a != null &&
          this.field_a.length != 0 &&
          param0 >= this.field_a[0].field_d) {
          if (this.field_a[this.field_a.length - 1].field_a < param0) {
            return -1;
          }
          if (this.field_a.length == 1) {
            return this.field_a[0].a(param1, (byte) 117);
          }
          var4 = 0;
          if (param2 < 97) {
            return -92;
          }
          for (var5 = 0; this.field_a.length > var5; var5++) {
            var6 = this.field_a[var5];
            if (var6.field_d <= param0 &&
              param0 <= var6.field_a) {
              var7 = var6.a(param1, (byte) -126);
              if (var7 != -1) {
                return var4 + var7;
              }
              return -1;
            }
            var4 = var4 + (var6.field_b.length - 1);
          }
          return -1;
        }
        return -1;
    }

    final static void a(int param0) {
        if (!pg.field_a) {
          throw new IllegalStateException();
        }
        if (param0 != 0) {
          field_c = (float[]) null;
        }
        if (hc.field_c != null) {
          hc.field_c.n(-7);
        }
        String var1 = wh.a((byte) -72);
        no.field_a = new cv(var1, (String) null, true, false, false);
        rf.field_a.a((byte) 114, vi.field_y);
        vi.field_y.b((byte) -118, no.field_a);
        vi.field_y.f((byte) -128);
    }

    final static void a(int param0, int param1) {
        wt.a(param1, (byte) 105);
        if (param0 != 0) {
          ag.c(-74);
        }
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        tk var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        tk[] var8 = this.field_a;
        tk[] var3 = var8;
        if (param0 <= 104) {
          String var7 = (String) null;
          this.a(-96, -70, (String) null, 123);
        }
        for (var4 = 0; var8.length > var4; var4++) {
          var5 = var8[var4];
          if (!(var5.field_b.length <= param1)) {
            return var5.field_b[param1];
          }
          param1 = param1 - (-1 + var5.field_b.length);
        }
        return 0;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (tt.field_l <= 32) {
          lf.a(0, 0);
        } else {
          var1 = tt.field_l % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          lf.a(0, tt.field_l - var1);
        }
        if (param0 != 0) {
          field_b = -64;
        }
    }

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        if (!param0) {
          return 73;
        }
        if (this.field_a != null &&
          this.field_a.length > 0) {
          stackIn_6_0 = this.field_a[-1 + this.field_a.length].field_a - this.field_a[0].field_d;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    public static void c(int param0) {
        int var1 = 104 / ((param0 + 8) / 42);
        field_c = null;
        field_d = (byte[][]) null;
    }

    final int a(byte param0) {
        int var4 = 0;
        int var2;
        tk[] var3;
        tk var5;
        int var7;
        String var8;
        int var6;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (param0 > -6) {
          var8 = (String) null;
          this.a(84, 121, (String) null, -67);
        }
        var2 = -1;
        if (null != this.field_a) {
          var3 = this.field_a;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a(1);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    static {
        field_c = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
    }
}
