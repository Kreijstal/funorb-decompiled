/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    private int field_f;
    private int field_t;
    private int field_c;
    static int field_j;
    private int field_e;
    private int field_u;
    private int field_n;
    private int field_q;
    private aa field_b;
    private int field_d;
    private int field_i;
    private int field_o;
    private int field_s;
    private float field_r;
    private int field_l;
    private int field_a;
    static qh field_k;
    private boolean field_p;
    static String field_g;
    private int field_h;
    private int field_m;

    final void a(byte param0) {
        this.field_b.a(this.field_o, this.field_u, 7);
        int var2 = 67 / ((param0 + 37) / 44);
    }

    final static boolean a(wi param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 87) {
            field_j = 99;
          }
          var2_int = param0.d((byte) -121);
          stackIn_5_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("pb.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param1 < 108) {
          pb.b(44);
          var2 = param0 & 255;
          if (var2 != 0) {
            if (var2 >= 128 &&
              var2 < 160) {
              var3 = sa.field_j[-128 + var2];
              if (0 == var3) {
                var3 = 63;
              }
              var2 = var3;
            }
            return (char)var2;
          }
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        var2Lifetime1 = param0 & 255;
        if (var2Lifetime1 != 0) {
          if (var2Lifetime1 >= 128 &&
            var2Lifetime1 < 160) {
            var3Lifetime1 = sa.field_j[-128 + var2Lifetime1];
            if (0 == var3Lifetime1) {
              var3Lifetime1 = 63;
            }
            var2Lifetime1 = var3Lifetime1;
          }
          return (char)var2Lifetime1;
        }
        throw new IllegalArgumentException("" + Integer.toString(var2Lifetime1, 16));
    }

    public static void a(int param0) {
        field_k = null;
        int var1 = 28 % ((param0 - 45) / 63);
        field_g = null;
    }

    final void d(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (null != sj.field_f) {
          return;
        }
        if (param0 != -84) {
          return;
        }
        if (0 < ui.field_m) {
          if (this.field_p) {
            fieldTemp$0 = this.field_t - 1;
            this.field_t = this.field_t - 1;
            if (fieldTemp$0 > 0) {
              return;
            }
            this.field_t = this.field_m;
            if (ja.field_d < this.field_a) {
              this.field_p = false;
            } else {
              this.d(param0 ^ -43);
            }
            return;
          }
          if (kj.field_i < this.field_i) {
            el.field_e = (-kj.field_i + this.field_i) / 2;
          } else {
            if (this.field_i > 0) {
              el.field_e = 0;
            }
          }
          if (kj.field_i == this.field_q &&
            jc.field_i == this.field_n) {
            return;
          }
          this.field_b.a(this.field_n, this.field_q, 125);
          return;
        }
        this.field_p = false;
        if (this.field_p) {
          fieldTemp$1 = this.field_t - 1;
          this.field_t = this.field_t - 1;
          if (fieldTemp$1 > 0) {
            return;
          }
          this.field_t = this.field_m;
          if (ja.field_d < this.field_a) {
            this.field_p = false;
          } else {
            this.d(param0 ^ -43);
          }
          return;
        }
        if (kj.field_i < this.field_i) {
          el.field_e = (-kj.field_i + this.field_i) / 2;
        } else {
          if (this.field_i > 0) {
            el.field_e = 0;
          }
        }
        if (kj.field_i != this.field_q) {
          this.field_b.a(this.field_n, this.field_q, 125);
        } else {
          if (jc.field_i != this.field_n) {
            this.field_b.a(this.field_n, this.field_q, 125);
          }
        }
    }

    final jb c(byte param0) {
        this.field_o = jc.field_i;
        this.field_u = kj.field_i;
        this.field_b.a(this.field_e, this.field_d, 18);
        ef.field_f = false;
        int var3 = 4 / ((35 - param0) / 54);
        jb var2 = qd.a(0, this.field_d, ck.field_e, 123, 0, this.field_e);
        if (var2 != null) {
          return var2;
        }
        this.a((byte) -96);
        return var2;
    }

    final static void b(int param0) {
        if (param0 != 16) {
          field_k = (qh) null;
        }
    }

    private final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        var6 = Bounce.field_N;
        var2 = this.field_i;
        var4 = 56 % ((74 - param0) / 36);
        var3 = this.field_s;
        if (!this.b((byte) -49)) {
          this.field_p = false;
          return;
        }
        if (var2 <= this.field_c) {
          if (this.field_f > var2) {
            var2 = this.field_f;
          }
        } else {
          var2 = this.field_c;
        }
        if (this.field_l < var3) {
          var3 = this.field_l;
          if (0.0f < this.field_r) {
            var5 = (int)(0.5f + this.field_r * (float)var3);
            if (var2 < var5) {
              var3 = (int)((float)var2 / this.field_r);
            } else {
              if (var2 > var5) {
                var2 = var5;
              }
            }
          }
          if (var2 != kj.field_i) {
            this.field_b.a(var3, var2, 125);
          } else {
            if (jc.field_i != var3) {
              this.field_b.a(var3, var2, 125);
            }
          }
          if (0 < this.field_i) {
            el.field_e = (this.field_i - kj.field_i) / 2;
          }
          return;
        }
        if (this.field_h > var3) {
          var3 = this.field_h;
        }
        if (!(0.0f < this.field_r)) {
          if (var2 != kj.field_i) {
            this.field_b.a(var3, var2, 125);
          } else {
            if (jc.field_i != var3) {
              this.field_b.a(var3, var2, 125);
            }
          }
          if (0 < this.field_i) {
            el.field_e = (this.field_i - kj.field_i) / 2;
          }
          return;
        }
        var5Lifetime1 = (int)(0.5f + this.field_r * (float)var3);
        if (var2 < var5Lifetime1) {
          var3 = (int)((float)var2 / this.field_r);
        } else {
          if (var2 > var5Lifetime1) {
            var2 = var5Lifetime1;
          }
        }
        if (var2 != kj.field_i) {
          this.field_b.a(var3, var2, 125);
        } else {
          if (jc.field_i != var3) {
            this.field_b.a(var3, var2, 125);
          }
        }
        if (0 < this.field_i) {
          el.field_e = (this.field_i - kj.field_i) / 2;
        }
        return;
    }

    final static he a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
        he var9 = null;
        RuntimeException var9_ref = null;
        he stackIn_2_0 = null;
        he stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new he(param6, param7, param1, param4, param2, param3, param0);
          if (param8 <= 56) {
            stackIn_2_0 = (he) null;
            return stackIn_2_0;
          }
          of.field_b.a(1, var9);
          mi.a(param5, -99, var9);
          stackIn_4_0 = var9;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_7_0 = var9_ref;
          stackIn_7_1 = new StringBuilder().append("pb.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static int c(int param0) {
        if (param0 != 0) {
          pb.a(-21);
          return ih.field_D;
        }
        return ih.field_D;
    }

    final void a(byte param0, int param1, int param2) {
        this.field_i = param2;
        this.field_s = param1;
        if (param0 != 13) {
          this.field_i = -80;
        }
    }

    final boolean b(byte param0) {
        int var2 = 63 % ((38 - param0) / 48);
        if (this.field_a > ja.field_d) {
          return false;
        }
        if (ui.field_m > 0) {
          return true;
        }
        return false;
    }

    private pb() throws Throwable {
        throw new Error();
    }

    static {
        field_g = "Updates will sent to the email address you've given";
    }
}
