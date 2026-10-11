/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends kd {
    static int field_p;
    static db[] field_n;
    ng field_s;
    static int field_l;
    ng field_k;
    static boolean[] field_o;
    int field_i;
    static int field_j;
    int field_q;
    static volatile int field_h;
    mk field_t;
    ij field_m;
    ij field_r;

    final static void a(df param0, int param1) {
        int var2_int = 0;
        df var3 = null;
        int var4 = 0;
        wf var5 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          if (null == param0.field_h) {
            return;
          }
          if (param0.field_i != 0 ||
            param0.field_k != 0) {
            for (var2_int = 0; pj.field_H > var2_int; var2_int++) {
              var3 = tf.field_d[var2_int];
              if (var3.field_g == 2 &&
                param0.field_i == var3.field_i &&
                param0.field_k == var3.field_k) {
                return;
              }
            }
          }
          if (param1 <= 106) {
            var5 = (wf) null;
            ij.a(5, 11, (wf) null);
          }
          if (null == param0.field_b) {
          }
          r.a(param0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ij.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0, ij[] param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ij[] var7 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          var3_int = this.field_i * 2 + 1;
          var4 = 1 + var3_int;
          var5 = -1;
          if (param0 != -3) {
            var7 = (ij[]) null;
            this.a(-19, (ij[]) null);
          }
          if (var3_int < param1.length &&
            param1[var3_int] != null) {
            if (var4 < param1.length &&
              null != param1[var4]) {
              stackIn_12_0 = (param1[var4].field_q > param1[var3_int].field_q) ? var3_int : var4;
              var5 = stackIn_12_0;
            } else {
              var5 = var3_int;
            }
          } else {
            if (var4 < param1.length &&
              param1[var4] != null) {
              var5 = var4;
            }
          }
          if (var5 > -1) {
            param1[this.field_i] = param1[var5];
            param1[var5].b(-3, param1);
            param1[this.field_i].field_i = this.field_i;
          } else {
            param1[this.field_i] = null;
          }
          this.field_i = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("ij.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final ij a(int param0, ij param1) {
        RuntimeException var3 = null;
        ij stackIn_3_0 = null;
        ij stackIn_7_0 = null;
        ij stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m != null) {
            stackIn_3_0 = this.field_m.a(23446, param1);
            return stackIn_3_0;
          }
          if (param1.field_m != null) {
            stackIn_7_0 = this.a(23446, param1.field_m);
            return stackIn_7_0;
          }
          if (param0 != 23446) {
            this.field_k = (ng) null;
          }
          if (this == param1) {
            return this;
          }
          this.field_s.a(param1.field_s, 82);
          this.field_s = null;
          this.field_k.a(param1.field_k, param0 - 23345);
          this.field_m = param1;
          this.field_k = null;
          this.b((byte) -128);
          stackIn_14_0 = (ij) (param1);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ij.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static String a(int param0, int param1, wf param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        sh var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param2.h((byte) -124);
            if (var3_int > param0) {
              var3_int = param0;
            }
            if (param1 != -22651) {
              var6 = (sh) null;
              ij.a(-74, (byte) 99, (sh) null, 63);
            }
            var4 = new byte[var3_int];
            param2.field_h = param2.field_h + aa.field_g.a(var3_int, -1, param2.field_j, 0, param2.field_h, var4);
            var5 = dc.a(var3_int, var4, (byte) 16, 0);
            stackIn_5_0 = var5;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = "Cabbage";
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ij.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(ij param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_m) {
            this.field_m.a(param0, param1, -1009900016, param3, param4);
            return;
          }
          if (null != param0.field_m) {
            this.a(param0.field_m, param1, -1009900016, param3, param4);
            return;
          }
          this.field_s.b(116, new bd((param3 << 16) + param1));
          if (param2 != -1009900016) {
            return;
          }
          if (param0 == this) {
            return;
          }
          param0.field_k.b(param2 ^ -1009899913, new mk(param4, this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ij.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static db[] a(int param0, byte param1, sh param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        db[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!nb.a(param3, param0, (byte) 126, param2)) {
            return null;
          }
          var4_int = 19 / ((-51 - param1) / 53);
          stackIn_4_0 = vi.b(23793);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ij.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, ij[] param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          var3_int = 51 / ((-8 - param0) / 50);
          var4 = (-1 + this.field_i) / 2;
          while (0 < this.field_i) {
            if (param1[var4].field_q > this.field_q) {
              param1[this.field_i] = param1[var4];
              param1[this.field_i].field_i = this.field_i;
              param1[var4] = this;
              this.field_i = var4;
              var4 = (-1 + this.field_i) / 2;
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ij.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != 66) {
          return;
        }
        field_o = null;
        field_n = null;
    }

    ij() {
        this.field_s = new ng();
        this.field_k = new ng();
        this.field_i = -1;
        this.field_q = 1073741823;
        this.field_m = null;
    }

    static {
        field_n = new db[15];
        field_h = -1;
        field_o = new boolean[64];
        field_j = 0;
    }
}
