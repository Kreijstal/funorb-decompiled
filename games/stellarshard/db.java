/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    private int field_e;
    pb field_b;
    private int field_h;
    static int field_g;
    private boolean field_j;
    private int field_i;
    private int field_a;
    static int field_c;
    pb[] field_d;
    private int field_f;

    final db a(byte param0, pb[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 72) {
            this.field_a = -127;
          }
          this.field_d = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("db.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final db a(byte param0, boolean param1) {
        this.field_j = param1 ? true : false;
        if (param0 <= 123) {
          return (db) null;
        }
        return this;
    }

    final void a(tc param0, db param1, int param2, int param3, rj param4, int param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          if (this.field_j) {
            param1.a(param3, param0, param4, 2, param5);
            param1.a((byte) 120);
          }
          if (-1 <= this.field_e) {
            param1.field_e = this.field_e;
          }
          if (this.field_h >= -1) {
            param1.field_h = this.field_h;
          }
          if (null != this.field_d) {
            param1.field_d = this.field_d;
          }
          var7_int = 64 / ((-22 - param2) / 60);
          if (-2147483648 != this.field_a) {
            param1.field_a = this.field_a;
          }
          if (-2147483648 != this.field_f) {
            param1.field_f = this.field_f;
          }
          if (-2147483648 != this.field_i) {
            param1.field_i = this.field_i;
          }
          if (null == this.field_b) {
            return;
          }
          param1.field_b = this.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("db.K(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param5).append(')').toString());
        }
    }

    final db a(int param0, boolean param1) {
        if (param1) {
          this.field_i = -34;
          this.field_i = param0;
          return this;
        }
        this.field_i = param0;
        return this;
    }

    final db a(int param0, int param1) {
        if (param0 != -1) {
          this.field_e = 114;
          this.field_e = param1;
          return this;
        }
        this.field_e = param1;
        return this;
    }

    final db a(boolean param0, int param1) {
        this.field_h = param1;
        if (param0) {
          this.a(-120, false);
          return this;
        }
        return this;
    }

    final static void a(int param0) {
        int var1;
        int var2;
        int var3;
        var3 = stellarshard.field_B;
        ii.field_F = null;
        ck.field_db = false;
        var1 = -66 % ((74 - param0) / 34);
        if (gk.field_a) {
          ei.field_G.h((byte) 52);
        } else {
          var2 = ag.field_c;
          if (0 < var2) {
            if (var2 == 1) {
              ii.field_F = lj.field_C;
            } else {
              ii.field_F = h.a(be.field_e, 0, new String[]{Integer.toString(var2)});
            }
            ii.field_F = ei.a(new CharSequence[]{(CharSequence) ((Object) ii.field_F), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) nl.field_a)}, (byte) 127);
          }
          ei.field_G.o(3);
          qh.b(-21923);
        }
    }

    final void a(db param0, boolean param1) {
        param0.field_f = this.field_f;
        param0.field_d = this.field_d;
        param0.field_b = this.field_b;
        if (!param1) {
          return;
        }
        try {
          param0.field_j = this.field_j;
          param0.field_i = this.field_i;
          param0.field_e = this.field_e;
          param0.field_h = this.field_h;
          param0.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "db.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static StringBuilder a(int param0, byte param1, char param2, StringBuilder param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          var4_int = param3.length();
          param3.setLength(param0);
          for (var5 = var4_int; param0 > var5; var5++) {
            param3.setCharAt(var5, param2);
          }
          if (param1 != 61) {
            field_g = 70;
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("db.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        if (param0 > 6) {
          this.field_h = -1;
          this.field_e = 0;
          this.field_b = null;
          this.field_f = 256;
          this.field_i = 0;
          this.field_a = 0;
          this.field_d = null;
          return;
        }
    }

    final db b(int param0, int param1) {
        if (param0 != -2147483648) {
          this.field_b = (pb) null;
          this.field_a = param1;
          return this;
        }
        this.field_a = param1;
        return this;
    }

    db() {
        this.field_b = null;
        this.field_j = false;
        this.field_e = -2;
        this.field_h = -2;
        this.field_a = -2147483648;
        this.field_i = -2147483648;
        this.field_d = null;
        this.field_f = -2147483648;
    }

    final void a(int param0, tc param1, rj param2, int param3, int param4) {
        bd stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_26_8;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          ed.a(param3 - 6315, param4 + param2.field_w, param0 + param2.field_k, this.field_d, param2.field_p, param2.field_t);
          if (this.field_b != null) {
            var6_int = param4 + param2.field_w + this.field_i;
            if (param1.field_h == 1) {
              var6_int = var6_int + (param2.field_p - this.field_b.field_w) / 2;
            }
            var7 = param0 - (-param2.field_k - this.field_a);
            if (2 == param1.field_h) {
              var6_int = var6_int + (-this.field_b.field_w + param2.field_p);
            }
            if (param1.field_d == 1) {
              var7 = var7 + (-this.field_b.field_x + param2.field_t) / 2;
            }
            if (2 == param1.field_d) {
              var7 = var7 + (-this.field_b.field_x + param2.field_t);
            }
            this.field_b.e(var6_int, var7);
          }
          if (param3 != 2) {
            this.field_d = (pb[]) null;
          }
          var6 = param1.b(param2, 0);
          if (var6 != null &&
            null != param1.field_a) {
            if (0 > this.field_e) {
              return;
            }
            stackIn_19_0 = param1.field_a;
            stackIn_19_1 = var6;
            if (this.field_i == -2147483648) {
              stackIn_20_2 = 0;
            } else {
              stackIn_20_2 = this.field_i;
            }
            stackIn_22_2 = stackIn_20_2 + (param4 + param2.field_w) + param1.field_m;
            if (this.field_a == -2147483648) {
              stackIn_23_3 = 0;
            } else {
              stackIn_23_3 = this.field_a;
            }
            stackIn_25_3 = stackIn_23_3 + param1.field_c + (param2.field_k + param0);
            stackIn_25_4 = -param1.field_f + param2.field_p - param1.field_m;
            stackIn_25_5 = -param1.field_c + (param2.field_t - param1.field_k);
            stackIn_25_6 = this.field_e;
            stackIn_25_7 = this.field_h;
            if (this.field_f == -2147483648) {
              stackIn_26_8 = 256;
            } else {
              stackIn_26_8 = this.field_f;
            }
            ((bd) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_22_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_26_8, param1.field_h, param1.field_d, param1.field_j);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_30_0 = var6_ref;
          stackIn_30_1 = new StringBuilder().append("db.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_g = 0;
        field_c = 0;
    }
}
