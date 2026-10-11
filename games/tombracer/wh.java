/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends nv implements ut {
    static nh field_y;
    private int field_n;
    private boolean field_D;
    private mg field_t;
    private int field_q;
    private jma field_C;
    private boolean field_v;
    private pc field_u;
    private int field_x;
    private mma field_p;
    private int field_s;
    private up field_z;
    private int field_E;
    private boolean field_A;
    static String[][] field_w;
    private int field_o;
    private boolean field_r;

    final int a(boolean param0) {
        if (param0) {
          this.field_v = false;
          return 30;
        }
        return 30;
    }

    final void n(byte param0) {
        super.n((byte) 75);
        if (param0 <= 68) {
          this.field_n = 46;
          this.q((byte) 92);
          if (this.field_D) {
            this.field_z = null;
            return;
          }
          this.field_z = new up(this.e(6), 4, 128);
          return;
        }
        this.q((byte) 92);
        if (this.field_D) {
          this.field_z = null;
          return;
        }
        this.field_z = new up(this.e(6), 4, 128);
    }

    final void g(int param0) {
        super.g(param0 + 0);
        if (param0 == -2) {
          this.field_C.a((byte) 48, this.h((byte) 111));
          return;
        }
        this.field_C = (jma) null;
        this.field_C.a((byte) 48, this.h((byte) 111));
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
          this.j((byte) 54);
          return this.field_C;
        }
        return this.field_C;
    }

    public final int j(byte param0) {
        if (param0 == -108) {
          return !this.field_C.b((byte) 88) ? 0 : 1;
        }
        field_y = (nh) null;
        return !this.field_C.b((byte) 88) ? 0 : 1;
    }

    final void k(int param0) {
        int var3;
        int var10;
        la var11;
        boolean stackIn_7_1 = false;
        la stackIn_24_0 = null;
        int stackIn_25_1 = 0;
        la stackIn_28_0 = null;
        int stackIn_29_1 = 0;
        boolean stackIn_38_1 = false;
        mma stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_61_0 = 0;
        mma stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_69_2 = 0;
        mma stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_75_2 = 0;
        mma stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_85_2 = 0;
        mma stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_90_2 = 0;
        mma stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_97_2 = 0;
        mma stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_103_2 = 0;
        int var4;
        int var5;
        int var6;
        pc var7_ref_pc;
        int var7;
        pc var8;
        int var9;
        int var7Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        pc var8Lifetime1;
        pc var8Lifetime2;
        var10 = TombRacer.field_G ? 1 : 0;
        var11 = this.b(true);
        if (!this.i(12340).g(112) &&
          null != this.field_t) {
          this.field_t.d(param0 - 5418);
          if (this.field_t.c(0)) {
            this.field_s = 0;
            stackIn_7_1 = !(this.field_A);
            this.field_A = stackIn_7_1;
          }
        }
        if (this.field_C.f((byte) -56)) {
          this.c(false);
          return;
        }
        if (!this.field_A) {
          return;
        }
        var3 = this.field_q;
        if (0 == var3) {
          var3 = 268435456;
        }
        if (this.field_n <= 0) {
          this.field_s = var3;
        } else {
          this.field_s = this.field_s + this.field_n;
          if (this.field_s > var3) {
            this.field_s = var3;
          }
        }
        this.field_x = this.field_g.g(-25787) >> 2;
        this.field_E = hua.a((byte) 102, this.field_x);
        this.field_o = bua.a(0, this.field_x);
        var6 = this.field_g.P(0) << 16;
        if (!this.field_D) {
          this.q((byte) 92);
          stackIn_28_0 = var11;
          if (this.field_v) {
            stackIn_29_1 = 3;
          } else {
            stackIn_29_1 = 4;
          }
          ((la) (Object) stackIn_28_0).a(stackIn_29_1, this.field_g, -44, this.field_u, this.e(6), this.field_z);
          var4 = this.a(this.field_u, (byte) 72);
          this.q((byte) 92);
          var11.a(1, this.field_g, -91, this.field_u, this.e(6), this.field_z);
          var11.b(false).a((byte) 119, this.field_u, this.field_z);
          var7_ref_pc = this.field_u;
          while (var7_ref_pc.field_h != null) {
            var7_ref_pc = var7_ref_pc.field_h;
          }
          var11.b(false).a(var7_ref_pc, this.field_g, (byte) -119);
          var5 = this.a(this.field_u, (byte) -65);
        } else {
          this.q((byte) 92);
          stackIn_24_0 = var11;
          if (!this.field_v) {
            stackIn_25_1 = 4;
          } else {
            stackIn_25_1 = 3;
          }
          ((la) (Object) stackIn_24_0).a(stackIn_25_1, this.field_u, this.e(6), (byte) -123);
          var4 = this.a(this.field_u, (byte) -68);
          this.q((byte) 92);
          var11.a(1, this.field_u, this.e(6), (byte) 75);
          var5 = this.a(this.field_u, (byte) 57);
        }
        if (param0 != 5418) {
          this.a(false);
        }
        stackIn_38_1 = (var5 != var4);
        this.field_r = stackIn_38_1;
        if (!this.field_r) {
          if (this.field_C.b((byte) 83)) {
            var7 = 1;
            if (var7 != 0) {
              this.field_u.field_j = 9;
            } else {
              this.field_u.field_j = 8;
            }
            if (!this.field_D) {
              var8 = this.field_u;
              var9 = var6;
              while (var8 != null) {
                if (!var8.field_l) {
                  break;
                }
                if (null == var8.field_h) {
                  if (!this.field_r) {
                    var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                  } else {
                    var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                  }
                }
                var8 = var8.field_h;
              }
            }
            stackIn_58_0 = this.field_p;
            stackIn_58_1 = -978;
            stackIn_59_2 = (!this.field_r) ? 65280 : 16720384;
            ((mma) (Object) stackIn_58_0).a(stackIn_58_1, stackIn_59_2);
            this.field_C.a((byte) -14, this.field_r);
            return;
          }
          stackIn_61_0 = 0;
        } else {
          stackIn_61_0 = 1;
        }
        var7Lifetime1 = stackIn_61_0;
        if (var7Lifetime1 != 0) {
          this.field_u.field_j = 9;
          if (this.field_D) {
            stackIn_89_0 = this.field_p;
            stackIn_89_1 = -978;
            stackIn_90_2 = (!this.field_r) ? 65280 : 16720384;
            ((mma) (Object) stackIn_89_0).a(stackIn_89_1, stackIn_90_2);
            this.field_C.a((byte) -14, this.field_r);
            return;
          }
          var8Lifetime1 = this.field_u;
          var9Lifetime1 = var6;
          while (true) {
            if (var8Lifetime1 == null) {
              stackIn_96_0 = this.field_p;
              stackIn_96_1 = -978;
              if (!this.field_r) {
                stackIn_97_2 = 65280;
              } else {
                stackIn_97_2 = 16720384;
              }
              ((mma) (Object) stackIn_96_0).a(stackIn_96_1, stackIn_97_2);
              this.field_C.a((byte) -14, this.field_r);
              return;
            }
            if (var8Lifetime1.field_l) {
              if (null == var8Lifetime1.field_h) {
                if (!this.field_r) {
                  var11.b(false).a(var8Lifetime1.field_a, (byte) -120, 8, var9Lifetime1, 1, 0, 2, 0, var8Lifetime1.field_e, 2, 4);
                } else {
                  var11.b(false).a(var8Lifetime1.field_a, (byte) -117, 9, var9Lifetime1, 1, 0, 4, 0, var8Lifetime1.field_e, 4, 8);
                }
              }
              var8Lifetime1 = var8Lifetime1.field_h;
              continue;
            }
            break;
          }
          stackIn_102_0 = this.field_p;
          stackIn_102_1 = -978;
          if (!this.field_r) {
            stackIn_103_2 = 65280;
          } else {
            stackIn_103_2 = 16720384;
          }
          ((mma) (Object) stackIn_102_0).a(stackIn_102_1, stackIn_103_2);
          this.field_C.a((byte) -14, this.field_r);
          return;
        }
        this.field_u.field_j = 8;
        if (this.field_D) {
          stackIn_84_0 = this.field_p;
          stackIn_84_1 = -978;
          stackIn_85_2 = (!this.field_r) ? 65280 : 16720384;
          ((mma) (Object) stackIn_84_0).a(stackIn_84_1, stackIn_85_2);
          this.field_C.a((byte) -14, this.field_r);
          return;
        }
        var8Lifetime2 = this.field_u;
        var9Lifetime2 = var6;
        while (true) {
          if (var8Lifetime2 == null) {
            stackIn_68_0 = this.field_p;
            stackIn_68_1 = -978;
            if (!this.field_r) {
              stackIn_69_2 = 65280;
            } else {
              stackIn_69_2 = 16720384;
            }
            ((mma) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_69_2);
            this.field_C.a((byte) -14, this.field_r);
            return;
          }
          if (var8Lifetime2.field_l) {
            if (null == var8Lifetime2.field_h) {
              if (!this.field_r) {
                var11.b(false).a(var8Lifetime2.field_a, (byte) -120, 8, var9Lifetime2, 1, 0, 2, 0, var8Lifetime2.field_e, 2, 4);
              } else {
                var11.b(false).a(var8Lifetime2.field_a, (byte) -117, 9, var9Lifetime2, 1, 0, 4, 0, var8Lifetime2.field_e, 4, 8);
              }
            }
            var8Lifetime2 = var8Lifetime2.field_h;
            continue;
          }
          break;
        }
        stackIn_74_0 = this.field_p;
        stackIn_74_1 = -978;
        if (!this.field_r) {
          stackIn_75_2 = 65280;
        } else {
          stackIn_75_2 = 16720384;
        }
        ((mma) (Object) stackIn_74_0).a(stackIn_74_1, stackIn_75_2);
        this.field_C.a((byte) -14, this.field_r);
        return;
    }

    final int a(int param0, int param1) {
        param0 = upa.a(this.field_r, param0, (byte) -63);
        param0 = upa.a(this.field_A, param0, (byte) -57);
        if (param1 <= -48) {
          param0 = fs.a((byte) 61, param0, this.field_s);
          return param0;
        }
        this.c(-120);
        param0 = fs.a((byte) 61, param0, this.field_s);
        return param0;
    }

    public final int g(byte param0) {
        if (param0 != -108) {
          return 56;
        }
        return 16711782;
    }

    private final int a(pc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -6 / ((param1 + 5) / 38);
          stackIn_2_0 = ua.a(param0.field_e - param0.field_d, -106);
          stackIn_2_1 = -ua.a(-param0.field_k + param0.field_a, 21);
          if (param0.field_h == null) {
            stackIn_3_2 = 0;
          } else {
            stackIn_3_2 = this.a(param0.field_h, (byte) -81);
          }
          stackIn_4_0 = stackIn_2_0 - (stackIn_2_1 - stackIn_3_2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wh.P(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    wh(la param0, boolean param1) {
        super(param0, param1);
        this.field_u = new pc();
        this.field_s = 0;
        try {
          this.field_C = new jma(15);
          this.field_t = new mg();
          this.field_n = 0;
          this.field_q = 16777216;
          this.field_v = true;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) {
        if (param1 != 636) {
          this.field_u = (pc) null;
          this.field_q = param0;
          return;
        }
        this.field_q = param0;
    }

    final void a(byte param0, mg param1) {
        try {
          if (param0 != -8) {
            this.a(true);
          }
          this.field_t = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wh.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          this.field_C.a(this.h((byte) 118), (byte) 113, param1);
          this.field_t.a(15637, param1);
          param1.a((byte) -125, this.field_q >> 16, 10);
          param1.a((byte) -127, !this.field_v ? 0 : 1, 1);
          param1.a((byte) 110, !this.field_D ? 0 : 1, 1);
          param1.a((byte) -125, this.field_n >> 16, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean p(byte param0) {
        int discarded$0 = 0;
        if (param0 != 120) {
          pc var3 = (pc) null;
          discarded$0 = this.a((pc) null, (byte) 1);
          return false;
        }
        return false;
    }

    final void a(boolean param0, fsa param1) {
        try {
          super.a(param0, param1);
          this.field_p = new mma(0, 16777215, this.field_u, param1.P(0));
          if (!param0) {
            this.field_u = (pc) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wh.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(int param0) {
        int var2 = -89 % ((param0 + 46) / 45);
        return 1;
    }

    public final int c(int param0) {
        if (param0 != 17832) {
          this.field_D = true;
          return 5570594;
        }
        return 5570594;
    }

    private final void q(byte param0) {
        int var2 = this.field_g.d(3) + gqa.a(this.field_E, (byte) 24, this.field_g.c(-31) / 2);
        int var3 = this.field_g.e(param0 + 9556) + gqa.a(this.field_o, (byte) 24, this.field_g.c(-64) / 2);
        this.field_u.a(var2, var2 + gqa.a(this.field_E, (byte) 24, this.field_s), var3, gqa.a(this.field_o, (byte) 24, this.field_s) + var3, 44);
        this.field_u.field_b = this.field_s;
        this.field_u.field_i = this.field_g.P(param0 ^ 92) << 16;
        if (param0 == 92) {
          return;
        }
        this.field_o = 58;
    }

    public static void l(int param0) {
        field_w = (String[][]) null;
        field_y = null;
        if (param0 >= -116) {
          field_w = (String[][]) null;
        }
    }

    wh(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_u = new pc();
        this.field_s = 0;
        try {
          this.field_C = new jma(15, param0, param1);
          this.field_t = new mg(param0.field_E, param1);
          this.field_q = param1.b((byte) 44, 10) << 16;
          this.field_v = param1.b((byte) 44, 1) == 1 ? true : false;
          this.field_D = param1.b((byte) 44, 1) == 1 ? true : false;
          this.field_n = param1.b((byte) 44, 8) << 16;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
