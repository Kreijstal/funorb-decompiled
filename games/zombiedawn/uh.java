/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static String field_h;
    private int field_n;
    private int field_l;
    private boolean field_j;
    private boolean field_i;
    private int field_d;
    static boolean field_g;
    private int field_m;
    private boolean field_e;
    private boolean field_f;
    private boolean field_c;
    private boolean field_p;
    static rj field_o;
    private cc[] field_b;
    private int field_a;
    private int field_k;

    final void g(int param0) {
        int var15 = 0;
        int var16 = 0;
        int var2;
        wk var3;
        ej var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var17;
        int var18;
        int var19;
        var19 = ZombieDawn.field_J;
        if (param0 != -1293) {
          return;
        }
        var2 = this.c(64);
        if (var2 != -1 &&
          this.field_c &&
          this.field_a != 0) {
          var3 = dj.field_e.field_S;
          var4 = dj.field_e.field_H;
          if (this.field_p) {
            var5 = var3.a(-(int)((float)(24 * this.field_a) / 1.0f) + ha.field_b, false);
            var6 = var3.b(ei.field_K - (int)((float)(24 * this.field_a) / 1.0f), true);
            var7 = var5 / 24;
            var8 = var6 / 24;
            var9 = var8 + this.field_a * 2;
            var10 = this.field_a * 2 + var7;
            if (var9 > var4.field_A.field_r) {
              var9 = var4.field_A.field_r;
            }
            if (var8 < 0) {
              var8 = 0;
            }
            if (var7 < 0) {
              var7 = 0;
            }
            if (var4.field_A.field_k < var10) {
              var10 = var4.field_A.field_k;
            }
            var11 = var3.a(24 * var7, (byte) -66);
            var12 = var3.a(24 * var8, 0);
            var13 = var3.a(var10 * 24, (byte) -95);
            var14 = var3.a(var9 * 24, 0);
            g.$cfr$intArgs$a$3aedf8649552(var12, 99, var13, var14, var11);
            for (var15 = var8; var15 < var9; var15++) {
              for (var16 = var7; var16 < var10; var16++) {
                var17 = var3.a(24 * var16, (byte) -66);
                var18 = var3.a(var15 * 24, 0);
                bi.a(var17, var18, 24, 24, this.field_l, 128);
              }
            }
            pa.a(-21189);
          } else {
            var5 = ha.field_b;
            var6 = ei.field_K;
            bi.d(var5, var6, this.field_a, this.field_l, 128);
          }
        }
    }

    final static java.awt.Canvas e(int param0) {
        if (param0 > -111) {
          java.awt.Canvas var2 = (java.awt.Canvas) null;
          uh.a(-18, -114, 107, (java.awt.Canvas) null);
        }
        return cn.field_b != null ? (java.awt.Canvas) ((Object) cn.field_b) : cj.field_d;
    }

    private final int c(int param0) {
        int var2 = -40 % ((param0 + 59) / 44);
        if (this.field_k == -1 ||
          this.field_b[this.field_k] == null) {
          return -1;
        }
        return this.field_b[this.field_k].b((byte) -111);
    }

    final boolean a(byte param0) {
        if (param0 <= 39) {
          this.field_a = 115;
        }
        return this.field_f;
    }

    final static boolean a(byte param0, de param1) {
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
          var2_int = param1.d((byte) -124);
          if (param0 != -36) {
            field_o = (rj) null;
          }
          stackIn_5_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("uh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        int var4 = 0;
        int var3;
        int var5;
        var5 = ZombieDawn.field_J;
        this.field_k = -1;
        if (8 + param1 > 16) {
          param1 = 8;
        }
        this.field_b = new cc[8];
        this.field_n = 0;
        var3 = -121 / ((param0 - 58) / 63);
        for (var4 = 0; 8 > var4; var4++) {
          if (null != qp.a(param1 + var4, 95)) {
            this.b(-4149, var4 + param1);
          }
        }
    }

    final void b(byte param0) {
        int var3 = 0;
        cc[] var2_ref_cc__;
        int var2;
        cc var4;
        int var5;
        g var6;
        cc[] var7;
        int var2Lifetime1;
        var5 = ZombieDawn.field_J;
        if (param0 != -55) {
          var6 = (g) null;
          this.a(87, (g) null);
        }
        var7 = this.field_b;
        var2_ref_cc__ = var7;
        for (var3 = 0; var3 < var7.length; var3++) {
          var4 = var7[var3];
          if (var4 != null) {
            var4.a((byte) 123);
          }
        }
        if (this.field_m != -1) {
          if (!this.field_e) {
            var2 = nh.field_P - 27;
            so.a(qp.field_c[this.field_m], -100 + this.field_d, var2);
            mk.field_a[this.field_m].b(this.field_d - 100, var2);
          } else {
            bj.field_q.a(mc.field_j, bd.field_d, -10 + nh.field_P, 15658734, 1);
          }
        }
        if (!this.field_f) {
          if (!this.field_i) {
            if (this.field_c) {
              this.a(param0 ^ -90, md.field_tb, tb.field_G);
            } else {
              if (this.field_j) {
                this.a(105, eb.field_b, rc.field_v);
              }
            }
          } else {
            this.a(param0 + 181, cn.field_i, fk.field_K);
          }
        } else {
          this.a(103, hn.field_h, al.field_f);
        }
        var2Lifetime1 = this.c(param0 - 66);
        if (-1 != var2Lifetime1) {
          kb.field_i[var2Lifetime1].b(3 + ha.field_b, ei.field_K + 12);
        }
    }

    private final void a(int param0, vn param1, vn param2) {
        try {
          if (param0 <= 82) {
            this.f(35);
          }
          param2.b(-(param2.field_w / 2) + bd.field_d, 400);
          so.a(param1, bd.field_d - param1.field_w / 2, 400);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "uh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        hi stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        boolean stackIn_10_3;
        hi stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        boolean stackIn_17_3;
        var5 = ZombieDawn.field_J;
        var4 = this.c(-116);
        if (var4 == -1) {
          return;
        }
        if (var4 != 9) {
          if (var4 != 10) {
            if (var4 != 13) {
              if (var4 == 15) {
                stackIn_16_0 = dj.field_e;
                stackIn_16_1 = param0;
                stackIn_16_2 = param1;
                stackIn_17_3 = (param2) ? false : true;
                ((hi) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_17_3, 120);
              } else {
                if (var4 == 12) {
                  dj.field_e.f((byte) 9);
                }
              }
            } else {
              stackIn_9_0 = dj.field_e;
              stackIn_9_1 = 1;
              stackIn_9_2 = param0;
              stackIn_10_3 = (param2) ? false : true;
              ((hi) (Object) stackIn_9_0).b(stackIn_9_1, stackIn_9_2, stackIn_10_3, param1);
            }
          } else {
            dj.field_e.a(false, -6355, param1, param0);
          }
        } else {
          dj.field_e.a(true, -6355, param1, param0);
        }
        if (param2) {
          this.field_a = 83;
        }
        this.b(-92);
    }

    private final void c(int param0, int param1) {
        int var3;
        int var4;
        var4 = ZombieDawn.field_J;
        var3 = param0;
        if (var3 != 10 &&
          9 != var3) {
          if (var3 == 15) {
            this.field_a = 120;
            this.field_l = 3158064;
            this.field_p = false;
          } else if (var3 != 13) {
            this.field_a = 0;
          } else {
            this.field_p = false;
            this.field_l = 10522624;
            this.field_a = 130;
          }
        } else {
          this.field_p = true;
          this.field_a = 3;
          this.field_l = 3390259;
        }
        if (param1 != -6126) {
          uh.c((byte) -49);
        }
    }

    final void a(int param0, int param1, boolean param2) {
        cc[] var4;
        int var5;
        cc var6;
        int var8;
        cc[] var9;
        cc var10;
        cc var11;
        int var7;
        int var5Lifetime1;
        cc[] var4Lifetime1;
        cc var6Lifetime1;
        cc var11Lifetime1;
        cc var6Lifetime2;
        cc var11Lifetime2;
        var8 = ZombieDawn.field_J;
        var9 = this.field_b;
        var4 = var9;
        for (var5 = 0; var5 < var9.length; var5++) {
          var10 = var9[var5];
          var11 = var10;
          var6 = var11;
          var11Lifetime2 = var10;
          var6Lifetime2 = var11Lifetime2;
          if (var10 != null) {
            var10.a((byte) 117, param0, param1);
          }
        }
        if (this.field_e) {
          param1 = param1 - vh.field_b;
        }
        this.field_m = -1;
        if (!param2) {
          this.field_m = 100;
        }
        if (param0 < nh.field_P - 80) {
          return;
        }
        if (this.field_e &&
          param0 > nh.field_P - 25) {
          return;
        }
        var4Lifetime1 = this.field_b;
        for (var5Lifetime1 = 0; var4Lifetime1.length > var5Lifetime1; var5Lifetime1++) {
          var11Lifetime1 = var4Lifetime1[var5Lifetime1];
          var6Lifetime1 = var11Lifetime1;
          if (var6Lifetime1 != null) {
            var7 = var11Lifetime1.a(param1, (byte) -128);
            if (var7 != -1) {
              this.field_m = var7;
              this.field_d = 20 + var11Lifetime1.field_l;
            }
          }
        }
    }

    final void a(int param0, g param1) {
        g stackIn_6_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        kd var6 = null;
        var5 = ZombieDawn.field_J;
        try {
          if (param0 != 67) {
            return;
          }
          if (!(param1 instanceof kd)) {
            stackIn_6_0 = null;
          } else {
            stackIn_6_0 = (g) (param1);
          }
          var6 = (kd) (stackIn_6_0);
          var4 = this.c(98);
          if (var4 == -1) {
            return;
          }
          if (var4 != 0) {
            if (var4 == 1) {
              if (!var6.o(70)) {
                return;
              }
            } else {
              if (var4 == 2) {
                if (!var6.t(100)) {
                  return;
                }
              } else {
                if (var4 != 3) {
                  if (4 != var4) {
                    if (var4 != 5) {
                      if (var4 != 6) {
                        if (var4 != 14) {
                          if (var4 == 7) {
                            ((ah) (param1)).o(-6253);
                            dj.field_e.a(0, (ah) (param1), (byte) 60, true, (kk) null);
                          }
                        } else {
                          var6.b(true);
                        }
                      } else {
                        if (!var6.m((byte) 124)) {
                          return;
                        }
                      }
                    } else {
                      if (!var6.p((byte) 6)) {
                        return;
                      }
                    }
                  } else {
                    if (!var6.p(param0 ^ 11379)) {
                      return;
                    }
                  }
                } else {
                  if (!var6.C(-73)) {
                    return;
                  }
                }
              }
            }
          } else {
            var6.y(98);
          }
          if (var4 != 4 &&
            5 != var4 &&
            var4 != 1 &&
            0 != var4) {
            kh.a(46, false);
          } else {
            kh.a(67, false);
          }
          this.b(-58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_47_0 = var3;
          stackIn_47_1 = new StringBuilder().append("uh.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return this.field_c;
    }

    public static void c(byte param0) {
        field_o = null;
        field_h = null;
        if (param0 <= 59) {
          field_h = (String) null;
        }
    }

    final boolean a(byte param0, int param1, int param2) {
        int var4;
        if (param0 != 118) {
          return false;
        }
        var4 = (-190 + param2) / 40;
        if (var4 >= 0 &&
          this.field_n > var4 &&
          null != this.field_b[var4]) {
          if (!this.field_b[var4].a(false, param1, param2)) {
            return false;
          }
          this.a(3158064, var4);
          return true;
        }
        return false;
    }

    final boolean d(int param0) {
        if (param0 < 111) {
          return false;
        }
        return this.field_j;
    }

    private final void f(int param0) {
        this.field_k = param0;
        this.field_i = false;
        this.field_j = false;
        this.field_c = false;
        this.field_f = false;
    }

    final boolean b(int param0, int param1) {
        if (this.field_n == 8) {
          return false;
        }
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_b[fieldTemp$0] = new cc(190 - (40 - 40 * this.field_n), param1, this.field_e);
        this.field_b[-1 + this.field_n].c(28497);
        if (param0 != -4149) {
          this.c(-64, 61);
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        int var4_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param3.getGraphics();
            cn.field_f.a(var4, param1, param2, (byte) 58);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
          }
          var4_int = 22 / ((-53 - param0) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_7_0 = var4_ref2;
          stackIn_7_1 = new StringBuilder().append("uh.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3;
        var3 = ZombieDawn.field_J;
        for (var2 = this.field_k; var2 < -1 + this.field_b.length; var2++) {
          this.field_b[var2] = this.field_b[1 + var2];
          if (null != this.field_b[var2]) {
            this.field_b[var2].field_i = this.field_b[var2].field_l - 40;
          }
        }
        if (param0 > -16) {
          field_o = (rj) null;
        }
        int fieldTemp$0 = this.field_n - 1;
        this.field_n = this.field_n - 1;
        this.field_b[fieldTemp$0] = null;
        this.f(-1);
    }

    final boolean a(int param0) {
        if (param0 >= -77) {
          field_g = false;
        }
        return this.field_i;
    }

    final void a(int param0, int param1) {
        int var4 = 0;
        cc[] var3_ref_cc__;
        int var3;
        cc var5;
        int var6;
        cc[] var7;
        var6 = ZombieDawn.field_J;
        if (param1 >= 0 &&
          this.field_b.length >= param1 &&
          null != this.field_b[param1]) {
          if (param0 != 3158064) {
            this.field_d = -14;
          }
          if (!this.field_b[param1].a(false)) {
            var7 = this.field_b;
            var3_ref_cc__ = var7;
            for (var4 = 0; var4 < var7.length; var4++) {
              var5 = var7[var4];
              if (var5 != null) {
                var5.b(2);
              }
            }
            this.f(-1);
            this.field_k = param1;
            this.field_b[param1].b(false);
            var3 = this.field_b[param1].b((byte) -126);
            if (7 == var3) {
              this.field_i = true;
              return;
            }
            if (9 == var3) {
              this.field_c = true;
              this.c(var3, -6126);
              return;
            }
            if (var3 == 10) {
              this.field_c = true;
              this.c(var3, -6126);
              return;
            }
            if (var3 == 13) {
              this.field_c = true;
              this.c(var3, -6126);
              return;
            }
            if (var3 == 15) {
              this.field_c = true;
              this.c(var3, -6126);
              return;
            }
            if (var3 == 12) {
              this.field_j = true;
              return;
            }
            this.field_f = true;
            return;
          }
          this.d((byte) -83);
          return;
        }
    }

    final void d(byte param0) {
        if (this.field_k < 0) {
          return;
        }
        if (this.field_b[this.field_k] != null) {
          this.field_b[this.field_k].b(2);
        }
        if (param0 != -83) {
          return;
        }
        this.f(param0 ^ 82);
    }

    uh() {
        this.field_d = 0;
        this.field_m = -1;
        this.field_j = false;
        this.field_i = false;
        this.field_c = false;
        this.field_f = false;
        this.field_b = new cc[8];
        this.field_n = 0;
        this.field_k = -1;
    }

    uh(boolean param0) {
        this.field_d = 0;
        this.field_m = -1;
        this.field_j = false;
        this.field_i = false;
        this.field_c = false;
        this.field_f = false;
        this.field_n = 0;
        this.field_e = param0 ? true : false;
        this.field_b = new cc[8];
        this.field_k = -1;
    }

    static {
        field_h = "Username: ";
        field_g = false;
    }
}
