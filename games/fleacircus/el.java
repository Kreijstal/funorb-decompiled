/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends wi {
    private bi field_z;
    dd field_w;
    private boolean field_x;
    static sf field_C;
    static dd[] field_s;
    private int field_q;
    private dd field_y;
    private bi field_v;
    static String field_B;
    private bi field_u;
    boolean field_r;
    int field_A;
    int field_t;

    final static void a(String param0, byte param1) {
        try {
          if (param1 != 126) {
            el.b((byte) 28);
          }
          ae.a(109, param0);
          wf.a(ll.field_o, false, false);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "el.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_B = null;
        if (param0 != 30537) {
          return;
        }
        field_C = null;
        field_s = null;
    }

    final static boolean b(byte param0) {
        int var1 = -14 % ((param0 - 73) / 47);
        if (sg.field_h == null) {
          return false;
        }
        if (rh.field_k.b(0)) {
          return true;
        }
        return false;
    }

    final static void a(java.applet.Applet param0, int param1, byte param2, int param3, String[] param4, int param5) {
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          pi.field_e = param0.getParameter("overxgames");
          if (null == pi.field_e) {
            pi.field_e = "0";
          }
          id.field_i = param0.getParameter("overxachievements");
          if (id.field_i == null) {
            id.field_i = "0";
          }
          var6 = param0.getParameter("currency");
          if (var6 == null) {
            di.field_d = 2;
          } else {
            if (ii.a(12969, (CharSequence) ((Object) var6))) {
              di.field_d = pl.a((CharSequence) ((Object) var6), -9816);
            } else {
              di.field_d = 2;
            }
          }
          fi.field_j = param5;
          rc.field_e = param3;
          pb.field_i = param1;
          of.field_h = new dd[param4.length];
          for (var7 = 0; param4.length > var7; var7++) {
            of.field_h[var7] = new dd(317, 34);
          }
          vg.field_u = param4;
          if (param2 <= 24) {
            el.d(18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_21_0 = var6_ref;
          stackIn_21_1 = new StringBuilder().append("el.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var2;
        int var3;
        int var4;
        var2 = this.field_l;
        var3 = 0;
        if (this.field_v != null) {
          var3 = var3 + this.field_v.field_e;
        }
        if (this.field_u != null) {
          var3 = var3 + this.field_u.field_e;
        }
        if (this.field_v != null) {
          this.field_v.a(var2, this.field_a);
          var2 = var2 + this.field_v.field_c;
        }
        this.field_z.a(var2, this.field_a, -var3 + this.field_n, this.field_z.field_d);
        var2 = var2 + (-var3 + this.field_n);
        if (null == this.field_u) {
          var4 = (-this.field_q + this.field_A) * this.field_n / (this.field_t - this.field_q);
          if (param0 != 72) {
            this.field_t = 37;
          }
        } else {
          this.field_u.a(var2, this.field_a);
          var4 = (-this.field_q + this.field_A) * this.field_n / (this.field_t - this.field_q);
          if (param0 == 72) {
            if (this.field_r &&
              this.field_w != null) {
              this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
              return;
            }
            this.field_y.c(this.field_l + (var4 - this.field_y.field_w / 8), -(this.field_y.field_t / 8) + this.field_a);
            return;
          }
          this.field_t = 37;
        }
        if (!this.field_r) {
          this.field_y.c(this.field_l + (var4 - this.field_y.field_w / 8), -(this.field_y.field_t / 8) + this.field_a);
        } else {
          if (this.field_w == null) {
            this.field_y.c(this.field_l + (var4 - this.field_y.field_w / 8), -(this.field_y.field_t / 8) + this.field_a);
          } else {
            this.field_w.d(var4 + (this.field_l - this.field_w.field_w / 2), -(this.field_w.field_t / 2) + this.field_a);
          }
        }
    }

    final boolean a(byte param0) {
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int var2;
        int var3;
        int var4;
        var2 = 0;
        var3 = this.field_l;
        var4 = 0;
        if (null != this.field_v) {
          var4 = var4 + this.field_v.field_e;
        }
        if (null != this.field_u) {
          var4 = var4 + this.field_u.field_e;
        }
        if (null != this.field_v) {
          var2 = var2 != 0 | this.field_v.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
          var3 = var3 + this.field_v.field_c;
        }
        if (param0 > 67) {
          stackIn_40_0 = var2;
          if (ag.field_f >= var3) {
            var2 = stackIn_40_0 | 1;
          } else {
            if (kc.field_b >= this.field_a) {
              var2 = stackIn_40_0 | 1;
            } else {
              if (-var4 + this.field_n >= ag.field_f) {
                stackIn_48_0 = stackIn_40_0;
                stackIn_48_1 = 1;
                var2 = stackIn_48_0 | stackIn_48_1;
              } else {
                if (this.field_z.field_d >= kc.field_b) {
                  var2 = stackIn_40_0 | 1;
                } else {
                  var2 = stackIn_40_0 | 0;
                }
              }
            }
          }
        } else {
          this.field_z = (bi) null;
          stackIn_13_0 = var2;
          if (ag.field_f >= var3) {
            var2 = stackIn_13_0 | 1;
          } else {
            if (kc.field_b >= this.field_a) {
              var2 = stackIn_13_0 | 1;
            } else {
              if (-var4 + this.field_n >= ag.field_f) {
                stackIn_21_0 = stackIn_13_0;
                stackIn_21_1 = 1;
                var2 = stackIn_21_0 | stackIn_21_1;
              } else {
                if (this.field_z.field_d >= kc.field_b) {
                  var2 = stackIn_13_0 | 1;
                } else {
                  var2 = stackIn_13_0 | 0;
                }
              }
            }
          }
        }
        var3 = var3 + (this.field_n - var4);
        if (null != this.field_u) {
          var2 = var2 != 0 | this.field_u.b(var3, this.field_a, ag.field_f, kc.field_b) ? 1 : 0;
        }
        return var2 != 0;
    }

    final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        var4 = fleas.field_A ? 1 : 0;
        if (param0 >= 20) {
          if (!this.field_k) {
            this.field_g = false;
            this.field_c = false;
            return;
          }
          if (this.field_r &&
            null != this.field_w) {
            var2 = this.field_w.field_t;
          } else {
            var2 = this.field_y.field_t / 4;
          }
          if (0 == jk.field_r &&
            kc.field_f == 0) {
            this.field_g = false;
            this.field_x = false;
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
            }
            if (this.field_A > this.field_t) {
              this.field_A = this.field_t;
            }
            return;
          }
          if (!this.field_x &&
            kc.field_b < -(var2 / 2) + this.field_a) {
            this.field_g = false;
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
            }
            if (this.field_A > this.field_t) {
              this.field_A = this.field_t;
            }
            return;
          }
          if (!this.field_x &&
            kc.field_b > this.field_a - (var2 / 2 - var2)) {
            this.field_g = false;
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
            }
            if (this.field_A > this.field_t) {
              this.field_A = this.field_t;
            }
            return;
          }
          var3 = ag.field_f - this.field_l;
          if (this.field_x) {
            var3 = var3 + (this.field_n / (-this.field_q + this.field_t) >> 1);
            this.field_x = true;
            this.field_A = (this.field_t - this.field_q) * var3 / this.field_n + this.field_q;
            this.field_g = true;
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
            }
            if (this.field_A > this.field_t) {
              this.field_A = this.field_t;
            }
          } else {
            if (0 > var3) {
              this.field_g = false;
            } else {
              if (this.field_n < var3) {
                this.field_g = false;
              } else {
                var3 = var3 + (this.field_n / (-this.field_q + this.field_t) >> 1);
                this.field_x = true;
                this.field_A = (this.field_t - this.field_q) * var3 / this.field_n + this.field_q;
                this.field_g = true;
                if (this.field_A < this.field_q) {
                  this.field_A = this.field_q;
                }
                if (this.field_A > this.field_t) {
                  this.field_A = this.field_t;
                }
              }
            }
          }
          return;
        }
        el.b((byte) 72);
        if (!this.field_k) {
          this.field_g = false;
          this.field_c = false;
          return;
        }
        if (!this.field_r) {
          var2Lifetime1 = this.field_y.field_t / 4;
          if (0 == jk.field_r &&
            kc.field_f == 0) {
            this.field_g = false;
            this.field_x = false;
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
            }
            if (this.field_A > this.field_t) {
              this.field_A = this.field_t;
            }
            return;
          }
          if (!this.field_x &&
            kc.field_b < -(var2Lifetime1 / 2) + this.field_a) {
            this.field_g = false;
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
            }
            if (this.field_A > this.field_t) {
              this.field_A = this.field_t;
            }
            return;
          }
          if (!this.field_x &&
            kc.field_b > this.field_a - (var2Lifetime1 / 2 - var2Lifetime1)) {
            this.field_g = false;
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
            }
            if (this.field_A > this.field_t) {
              this.field_A = this.field_t;
            }
            return;
          }
          var3Lifetime1 = ag.field_f - this.field_l;
          if (this.field_x) {
            var3Lifetime1 = var3Lifetime1 + (this.field_n / (-this.field_q + this.field_t) >> 1);
            this.field_x = true;
            this.field_A = (this.field_t - this.field_q) * var3Lifetime1 / this.field_n + this.field_q;
            this.field_g = true;
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
            }
            if (this.field_A > this.field_t) {
              this.field_A = this.field_t;
            }
          } else {
            if (0 > var3Lifetime1) {
              this.field_g = false;
            } else {
              if (this.field_n < var3Lifetime1) {
                this.field_g = false;
              } else {
                var3Lifetime1 = var3Lifetime1 + (this.field_n / (-this.field_q + this.field_t) >> 1);
                this.field_x = true;
                this.field_A = (this.field_t - this.field_q) * var3Lifetime1 / this.field_n + this.field_q;
                this.field_g = true;
                if (this.field_A < this.field_q) {
                  this.field_A = this.field_q;
                }
                if (this.field_A > this.field_t) {
                  this.field_A = this.field_t;
                }
              }
            }
          }
          return;
        }
        if (null == this.field_w) {
          var2Lifetime2 = this.field_y.field_t / 4;
        } else {
          var2Lifetime2 = this.field_w.field_t;
        }
        if (0 == jk.field_r &&
          kc.field_f == 0) {
          this.field_g = false;
          this.field_x = false;
          if (this.field_A < this.field_q) {
            this.field_A = this.field_q;
          }
          if (this.field_A <= this.field_t) {
            return;
          }
          this.field_A = this.field_t;
          return;
        }
        if (!this.field_x) {
          if (kc.field_b < -(var2Lifetime2 / 2) + this.field_a) {
            this.field_g = false;
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
            }
            if (this.field_A <= this.field_t) {
              return;
            }
            this.field_A = this.field_t;
            return;
          }
          if (!this.field_x &&
            kc.field_b > this.field_a - (var2Lifetime2 / 2 - var2Lifetime2)) {
            this.field_g = false;
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
            }
            if (this.field_A > this.field_t) {
              this.field_A = this.field_t;
            }
            return;
          }
          var3Lifetime2 = ag.field_f - this.field_l;
          if (this.field_x) {
            var3Lifetime2 = var3Lifetime2 + (this.field_n / (-this.field_q + this.field_t) >> 1);
            this.field_x = true;
            this.field_A = (this.field_t - this.field_q) * var3Lifetime2 / this.field_n + this.field_q;
            this.field_g = true;
            if (this.field_A < this.field_q) {
              this.field_A = this.field_q;
            }
            if (this.field_A > this.field_t) {
              this.field_A = this.field_t;
            }
          } else {
            if (0 > var3Lifetime2) {
              this.field_g = false;
            } else {
              if (this.field_n < var3Lifetime2) {
                this.field_g = false;
              } else {
                var3Lifetime2 = var3Lifetime2 + (this.field_n / (-this.field_q + this.field_t) >> 1);
                this.field_x = true;
                this.field_A = (this.field_t - this.field_q) * var3Lifetime2 / this.field_n + this.field_q;
                this.field_g = true;
                if (this.field_A < this.field_q) {
                  this.field_A = this.field_q;
                }
                if (this.field_A > this.field_t) {
                  this.field_A = this.field_t;
                }
              }
            }
          }
          return;
        }
        if (this.field_x) {
          var3Lifetime3 = ag.field_f - this.field_l;
          if (!this.field_x) {
            if (0 > var3Lifetime3) {
              this.field_g = false;
              return;
            }
            if (this.field_n < var3Lifetime3) {
              this.field_g = false;
              return;
            }
          }
          var3Lifetime3 = var3Lifetime3 + (this.field_n / (-this.field_q + this.field_t) >> 1);
          this.field_x = true;
          this.field_A = (this.field_t - this.field_q) * var3Lifetime3 / this.field_n + this.field_q;
          this.field_g = true;
          if (this.field_A < this.field_q) {
            this.field_A = this.field_q;
          }
          if (this.field_A <= this.field_t) {
            return;
          }
          this.field_A = this.field_t;
          return;
        }
        if (kc.field_b > this.field_a - (var2Lifetime2 / 2 - var2Lifetime2)) {
          this.field_g = false;
          if (this.field_A < this.field_q) {
            this.field_A = this.field_q;
          }
          if (this.field_A <= this.field_t) {
            return;
          }
          this.field_A = this.field_t;
          return;
        }
        var3Lifetime4 = ag.field_f - this.field_l;
        if (!this.field_x) {
          if (0 > var3Lifetime4) {
            this.field_g = false;
            return;
          }
          if (this.field_n < var3Lifetime4) {
            this.field_g = false;
            return;
          }
        }
        var3Lifetime4 = var3Lifetime4 + (this.field_n / (-this.field_q + this.field_t) >> 1);
        this.field_x = true;
        this.field_A = (this.field_t - this.field_q) * var3Lifetime4 / this.field_n + this.field_q;
        this.field_g = true;
        if (this.field_A < this.field_q) {
          this.field_A = this.field_q;
        }
        if (this.field_A <= this.field_t) {
          return;
        }
        this.field_A = this.field_t;
        return;
    }

    el(int param0, int param1, int param2, bi param3, bi param4, bi param5, dd param6, dd param7) {
        this.field_x = false;
        this.field_q = 0;
        this.field_r = false;
        this.field_A = 50;
        this.field_t = 100;
        try {
          this.field_u = param5;
          this.field_w = param7;
          this.field_n = param2;
          this.field_y = param6;
          this.field_l = param1;
          this.field_v = param3;
          this.field_a = param0;
          this.field_z = param4;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "el.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_B = "This password is part of your Player Name, and would be easy to guess";
    }
}
