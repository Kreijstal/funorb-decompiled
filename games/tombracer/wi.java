/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends wda {
    private int field_p;
    private int field_r;
    private boolean field_q;
    private int field_t;
    static jea field_s;
    private int field_o;

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 35, param1, this.field_o);
        if (param0 != 0) {
          this.b((byte) -115);
          return param1;
        }
        return param1;
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var8Lifetime4;
        int var9Lifetime4;
        int var8Lifetime1Lifetime1;
        int var8Lifetime2Lifetime1;
        int var9Lifetime1Lifetime1;
        int var9Lifetime2Lifetime1;
        var2 = this.field_p + this.field_n.q((byte) -80);
        if (0 >= this.field_r) {
          var3 = hua.a((byte) 100, var2 >> 2);
          var6 = -112 % ((param0 + 69) / 42);
          var4 = bua.a(0, var2 >> 2);
          var5 = doa.a(2, this.field_t, var3);
          var7 = doa.a(2, this.field_t, var4);
          if (var7 == 0) {
            var5 = lw.a(var5, (byte) -52) * this.field_t;
            var8 = this.field_n.s(25745);
            var9 = this.field_n.e(false);
            this.field_n.a((byte) -17, var5, var7);
            if (this.field_q) {
              if (this.field_n.p((byte) -103)) {
                var2 = -var2;
                this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
              }
              if (!this.field_n.C((byte) -43)) {
                if (this.field_n.s(25745) != var8 ||
                  this.field_n.e(false) != var9) {
                  this.field_o = this.field_o + this.field_t;
                }
                if (this.field_r > 0 &&
                  this.field_o >= this.field_r) {
                  this.field_j = true;
                }
                return;
              }
              var2 = 4096 - var2;
              this.field_p = dfa.a(var2 - this.field_n.q((byte) -80), 8192, 112);
            }
            if (this.field_n.s(25745) != var8) {
              this.field_o = this.field_o + this.field_t;
              if (this.field_r > 0 &&
                this.field_o >= this.field_r) {
                this.field_j = true;
              }
              return;
            }
            if (this.field_n.e(false) != var9) {
              this.field_o = this.field_o + this.field_t;
              if (this.field_r > 0 &&
                this.field_o >= this.field_r) {
                this.field_j = true;
              }
              return;
            }
            if (this.field_r <= 0) {
              return;
            }
            if (this.field_o < this.field_r) {
              return;
            }
            this.field_j = true;
            return;
          }
          if (var5 != 0) {
            var8Lifetime4 = this.field_n.s(25745);
            var9Lifetime4 = this.field_n.e(false);
            this.field_n.a((byte) -17, var5, var7);
            if (this.field_q) {
              if (this.field_n.p((byte) -103)) {
                var2 = -var2;
                this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
              }
              if (this.field_n.C((byte) -43)) {
                var2 = 4096 - var2;
                this.field_p = dfa.a(var2 - this.field_n.q((byte) -80), 8192, 112);
              }
            }
            if (this.field_n.s(25745) != var8Lifetime4 ||
              this.field_n.e(false) != var9Lifetime4) {
              this.field_o = this.field_o + this.field_t;
            }
          } else {
            var7 = lw.a(var7, (byte) -71) * this.field_t;
            var8Lifetime4 = this.field_n.s(25745);
            var9Lifetime4 = this.field_n.e(false);
            this.field_n.a((byte) -17, var5, var7);
            if (this.field_q) {
              if (this.field_n.p((byte) -103)) {
                var2 = -var2;
                this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
              }
              if (this.field_n.C((byte) -43)) {
                var2 = 4096 - var2;
                this.field_p = dfa.a(var2 - this.field_n.q((byte) -80), 8192, 112);
              }
            }
            if (this.field_n.s(25745) != var8Lifetime4 ||
              this.field_n.e(false) != var9Lifetime4) {
              this.field_o = this.field_o + this.field_t;
            }
          }
          if (this.field_r > 0 &&
            this.field_o >= this.field_r) {
            this.field_j = true;
          }
          return;
        }
        if (this.field_o + this.field_t <= this.field_r) {
          var3Lifetime1 = hua.a((byte) 100, var2 >> 2);
          var6Lifetime1 = -112 % ((param0 + 69) / 42);
          var4Lifetime1 = bua.a(0, var2 >> 2);
          var5Lifetime1 = doa.a(2, this.field_t, var3Lifetime1);
          var7Lifetime1 = doa.a(2, this.field_t, var4Lifetime1);
          if (var7Lifetime1 == 0) {
            var5Lifetime1 = lw.a(var5Lifetime1, (byte) -52) * this.field_t;
            var8Lifetime1 = this.field_n.s(25745);
            var9Lifetime1 = this.field_n.e(false);
            this.field_n.a((byte) -17, var5Lifetime1, var7Lifetime1);
            if (this.field_q) {
              if (this.field_n.p((byte) -103)) {
                var2 = -var2;
                this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
              }
              if (!this.field_n.C((byte) -43)) {
                if (this.field_n.s(25745) != var8Lifetime1 ||
                  this.field_n.e(false) != var9Lifetime1) {
                  this.field_o = this.field_o + this.field_t;
                }
                if (this.field_r > 0 &&
                  this.field_o >= this.field_r) {
                  this.field_j = true;
                }
                return;
              }
              var2 = 4096 - var2;
              this.field_p = dfa.a(var2 - this.field_n.q((byte) -80), 8192, 112);
            }
            if (this.field_n.s(25745) != var8Lifetime1) {
              this.field_o = this.field_o + this.field_t;
              if (this.field_r > 0 &&
                this.field_o >= this.field_r) {
                this.field_j = true;
              }
              return;
            }
            if (this.field_n.e(false) != var9Lifetime1) {
              this.field_o = this.field_o + this.field_t;
              if (this.field_r > 0 &&
                this.field_o >= this.field_r) {
                this.field_j = true;
              }
              return;
            }
            if (this.field_r <= 0) {
              return;
            }
            if (this.field_o < this.field_r) {
              return;
            }
            this.field_j = true;
            return;
          }
          if (var5Lifetime1 != 0) {
            var8Lifetime1Lifetime1 = this.field_n.s(25745);
            var9Lifetime1Lifetime1 = this.field_n.e(false);
            this.field_n.a((byte) -17, var5Lifetime1, var7Lifetime1);
            if (this.field_q) {
              if (this.field_n.p((byte) -103)) {
                var2 = -var2;
                this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
              }
              if (this.field_n.C((byte) -43)) {
                var2 = 4096 - var2;
                this.field_p = dfa.a(var2 - this.field_n.q((byte) -80), 8192, 112);
              }
            }
            if (this.field_n.s(25745) != var8Lifetime1Lifetime1 ||
              this.field_n.e(false) != var9Lifetime1Lifetime1) {
              this.field_o = this.field_o + this.field_t;
            }
          } else {
            var7Lifetime1 = lw.a(var7Lifetime1, (byte) -71) * this.field_t;
            var8Lifetime1Lifetime1 = this.field_n.s(25745);
            var9Lifetime1Lifetime1 = this.field_n.e(false);
            this.field_n.a((byte) -17, var5Lifetime1, var7Lifetime1);
            if (this.field_q) {
              if (this.field_n.p((byte) -103)) {
                var2 = -var2;
                this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
              }
              if (this.field_n.C((byte) -43)) {
                var2 = 4096 - var2;
                this.field_p = dfa.a(var2 - this.field_n.q((byte) -80), 8192, 112);
              }
            }
            if (this.field_n.s(25745) != var8Lifetime1Lifetime1 ||
              this.field_n.e(false) != var9Lifetime1Lifetime1) {
              this.field_o = this.field_o + this.field_t;
            }
          }
          if (this.field_r > 0 &&
            this.field_o >= this.field_r) {
            this.field_j = true;
          }
          return;
        }
        this.field_t = this.field_r - this.field_o;
        var3Lifetime2 = hua.a((byte) 100, var2 >> 2);
        var6Lifetime2 = -112 % ((param0 + 69) / 42);
        var4Lifetime2 = bua.a(0, var2 >> 2);
        var5Lifetime2 = doa.a(2, this.field_t, var3Lifetime2);
        var7Lifetime2 = doa.a(2, this.field_t, var4Lifetime2);
        if (var7Lifetime2 != 0) {
          if (var5Lifetime2 != 0) {
            var8Lifetime2 = this.field_n.s(25745);
            var9Lifetime2 = this.field_n.e(false);
            this.field_n.a((byte) -17, var5Lifetime2, var7Lifetime2);
            if (this.field_q) {
              if (this.field_n.p((byte) -103)) {
                var2 = -var2;
                this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
              }
              if (this.field_n.C((byte) -43)) {
                var2 = 4096 - var2;
                this.field_p = dfa.a(var2 - this.field_n.q((byte) -80), 8192, 112);
              }
            }
            if (this.field_n.s(25745) != var8Lifetime2 ||
              this.field_n.e(false) != var9Lifetime2) {
              this.field_o = this.field_o + this.field_t;
            }
            if (this.field_r > 0 &&
              this.field_o >= this.field_r) {
              this.field_j = true;
            }
            return;
          }
          var7Lifetime2 = lw.a(var7Lifetime2, (byte) -71) * this.field_t;
          var8Lifetime2Lifetime1 = this.field_n.s(25745);
          var9Lifetime2Lifetime1 = this.field_n.e(false);
          this.field_n.a((byte) -17, var5Lifetime2, var7Lifetime2);
          if (this.field_q) {
            if (this.field_n.p((byte) -103)) {
              var2 = -var2;
              this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
            }
            if (this.field_n.C((byte) -43)) {
              var2 = 4096 - var2;
              this.field_p = dfa.a(var2 - this.field_n.q((byte) -80), 8192, 112);
            }
          }
          if (this.field_n.s(25745) != var8Lifetime2Lifetime1 ||
            this.field_n.e(false) != var9Lifetime2Lifetime1) {
            this.field_o = this.field_o + this.field_t;
          }
          if (this.field_r <= 0) {
            return;
          }
          if (this.field_o < this.field_r) {
            return;
          }
          this.field_j = true;
          return;
        }
        var5Lifetime2 = lw.a(var5Lifetime2, (byte) -52) * this.field_t;
        var8Lifetime3 = this.field_n.s(25745);
        var9Lifetime3 = this.field_n.e(false);
        this.field_n.a((byte) -17, var5Lifetime2, var7Lifetime2);
        if (this.field_q) {
          if (this.field_n.p((byte) -103)) {
            var2 = -var2;
            this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
          }
          if (!this.field_n.C((byte) -43)) {
            if (this.field_n.s(25745) != var8Lifetime3) {
              this.field_o = this.field_o + this.field_t;
              if (this.field_r <= 0) {
                return;
              }
              if (this.field_o < this.field_r) {
                return;
              }
              this.field_j = true;
              return;
            }
            if (this.field_n.e(false) == var9Lifetime3) {
              if (this.field_r <= 0) {
                return;
              }
              if (this.field_o < this.field_r) {
                return;
              }
              this.field_j = true;
              return;
            }
            this.field_o = this.field_o + this.field_t;
            if (this.field_r <= 0) {
              return;
            }
            if (this.field_o >= this.field_r) {
              this.field_j = true;
            }
            return;
          }
          var2 = 4096 - var2;
          this.field_p = dfa.a(var2 - this.field_n.q((byte) -80), 8192, 112);
        }
        if (this.field_n.s(25745) != var8Lifetime3) {
          this.field_o = this.field_o + this.field_t;
        } else {
          if (this.field_n.e(false) != var9Lifetime3) {
            this.field_o = this.field_o + this.field_t;
          }
        }
        if (this.field_r > 0) {
          if (this.field_o < this.field_r) {
            return;
          }
          this.field_j = true;
        }
        return;
    }

    final void d(int param0, int param1) {
        if (param0 != 4) {
          return;
        }
        this.field_p = param1;
    }

    wi(la param0, int param1, int param2, int param3, boolean param4) {
        super(param0, param4);
        try {
          this.field_p = param2;
          this.field_t = param1;
          this.field_r = param3;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void c(byte param0) {
        super.c((byte) -119);
        if (param0 <= -116) {
          this.field_p = dfa.a(-this.field_p, 8192, 118);
          return;
        }
        this.c(33);
        this.field_p = dfa.a(-this.field_p, 8192, 118);
    }

    public static void e(byte param0) {
        field_s = null;
        if (param0 != -92) {
          wi.e((byte) -48);
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
          this.field_o = 76;
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
          return 18;
        }
        return 0;
    }

    final void c(int param0, int param1) {
        if (param1 != 26621) {
          this.b(99);
          this.field_t = param0;
          return;
        }
        this.field_t = param0;
    }

    final void a(kh param0, byte param1) {
        try {
          super.a(param0, (byte) -117);
          param0.a((byte) 75, this.b(0, this.field_t), 8);
          param0.a((byte) -127, this.field_r >> 16, 10);
          if (param1 > -78) {
            this.b(95);
          }
          param0.a((byte) -126, cn.a((byte) 46, this.field_p, 8192, 4), 4);
          param0.a((byte) 63, this.field_q ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wi.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    wi(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0.field_E > 7) {
            this.field_t = this.a(param1.b((byte) 44, 8), false);
          } else {
            this.field_t = param1.b((byte) 44, 4) << 16;
          }
          this.field_r = param1.b((byte) 44, 10) << 16;
          if (param0.field_E >= 10) {
            this.field_p = oo.a(4, 8192, 0, param1.b((byte) 44, 4));
            stackIn_9_1 = (1 == param1.b((byte) 44, 1));
            this.field_q = stackIn_9_1;
          } else {
            this.field_p = oo.a(3, 8192, 0, param1.b((byte) 44, 3));
            this.field_q = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("wi.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    wi(la param0, boolean param1) {
        this(param0, 131072, 0, 0, param1);
    }

    static {
    }
}
