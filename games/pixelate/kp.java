/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp extends lm {
    int[] field_u;
    static int[] field_w;
    private int[][] field_B;
    private String[] field_y;
    private int[] field_x;
    static int[] field_z;
    static oh field_v;
    static vj field_t;
    static String field_A;

    final void a(int param0, we param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != -5) {
            kp.b((byte) -35);
          }
          while (true) {
            var3_int = param1.f(255);
            if (var3_int == 0) {
              return;
            }
            this.a(var3_int, 83, param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("kp.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, we param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wm var7 = null;
        int var9 = 0;
        int var4_intLifetime1;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          if (1 != param0) {
            if (2 == param0) {
              var4_int = param2.f(255);
              this.field_u = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_u[var5] = param2.a((byte) -115);
              }
            } else {
              if (param0 == 3) {
                var4_int = param2.f(255);
                this.field_B = new int[var4_int][];
                this.field_x = new int[var4_int];
                for (var5 = 0; var5 < var4_int; var5++) {
                  var6 = param2.a((byte) 52);
                  var7 = go.a(var6, -52);
                  if (var7 != null) {
                    this.field_x[var5] = var6;
                    array$0 = new int[var7.field_e];
                    this.field_B[var5] = array$0;
                    for (var8 = 0; var7.field_e > var8; var8++) {
                      this.field_B[var5][var8] = param2.a((byte) -118);
                    }
                  }
                }
              } else {
                if (param0 != 4) {
                }
              }
            }
          } else {
            this.field_y = dd.a(param2.h(5), (byte) -117, '<');
          }
          var4_intLifetime1 = -125 / ((param1 + 17) / 39);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("kp.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        byte[] var2 = null;
        if (param0 != 74) {
          kp.d((byte) -64);
        }
        if (jg.a((byte) 83)) {
          ef.field_a = true;
        } else {
          var2 = bo.a(param0 ^ 181);
          byte[] var1 = var2;
          hm.a(param0 + 41, var2, 6);
        }
    }

    public static void d(byte param0) {
        field_v = null;
        field_A = null;
        field_t = null;
        field_z = null;
        if (param0 != -58) {
          kp.b((byte) -3);
        }
        field_w = null;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 <= 123) {
          this.field_B = (int[][]) null;
        }
        if (null != this.field_u) {
          for (var2 = 0; this.field_u.length > var2; var2++) {
            this.field_u[var2] = bq.a(this.field_u[var2], 32768);
          }
        }
    }

    final static void c(byte param0) {
        int var1 = 75 / ((20 - param0) / 48);
        if (to.field_t != null) {
          to.field_t.f();
        }
        if (ib.field_h != null) {
          ib.field_h.f();
        }
    }

    final String a(byte param0) {
        int var3 = 0;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_y) {
          return "";
        }
        StringBuilder discarded$15 = var5.append(this.field_y[0]);
        if (param0 != -54) {
          this.field_B = (int[][]) null;
        }
        for (var3 = 1; this.field_y.length > var3; var3++) {
          discarded$16 = var2.append("...");
          discarded$17 = var5.append(this.field_y[var3]);
        }
        return var2.toString();
    }

    kp() {
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        field_w = new int[32];
        field_z = new int[32];
        for (var0 = 0; field_z.length > var0; var0++) {
          field_z[var0] = 66561 * ((var0 << 6) / field_z.length);
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < field_w.length; var0Lifetime1++) {
          field_w[var0Lifetime1] = (var0Lifetime1 << 6) / field_w.length * 262401;
        }
        field_A = "Please check if address is correct";
    }
}
