/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends pk {
    private int field_s;
    private int field_u;
    private rk field_n;
    private boolean field_z;
    private km field_o;
    private km field_t;
    private rk field_m;
    private boolean field_v;
    static hg field_r;
    int field_y;
    static String field_p;
    static um field_q;
    int field_x;
    static int field_w;
    private rk field_A;
    static int field_B;

    final void a(int param0) {
        int var2 = this.field_i;
        int var3 = 0;
        if (null != this.field_n) {
          var3 = var3 + this.field_n.field_j;
        }
        if (null != this.field_m) {
          var3 = var3 + this.field_m.field_j;
        }
        if (null != this.field_n) {
          this.field_n.a(var2, this.field_k);
          var2 = var2 + this.field_n.field_k;
        }
        this.field_A.c(var2, this.field_k, this.field_u - var3, this.field_A.field_i);
        int var4 = 126 % ((param0 + 4) / 63);
        var2 = var2 + (-var3 + this.field_u);
        if (this.field_m != null) {
          this.field_m.a(var2, this.field_k);
        }
        int var5 = (this.field_x - this.field_s) * this.field_u / (this.field_y - this.field_s);
        if (!this.field_v) {
          this.field_o.a(var5 + this.field_i - this.field_o.field_w / 8, this.field_k - this.field_o.field_t / 8);
          return;
        }
        if (null != this.field_t) {
          this.field_t.b(this.field_i + var5 - this.field_t.field_w / 2, this.field_k - this.field_t.field_t / 2);
          return;
        }
        this.field_o.a(var5 + this.field_i - this.field_o.field_w / 8, this.field_k - this.field_o.field_t / 8);
    }

    final static void a(String param0, byte param1, long param2) {
        CharSequence var5 = null;
        try {
          ij.field_c = param0;
          vk.field_g = 2;
          var5 = (CharSequence) ((Object) param0);
          ec.field_f = ad.a(var5, -2);
          re.field_p = param2;
          if (param1 > -74) {
            wg.b(88);
          }
          kn.field_L = true;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "wg.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(byte param0) {
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var2 = 0;
        var3 = this.field_i;
        var4 = 0;
        if (this.field_n != null) {
          var4 = var4 + this.field_n.field_j;
        }
        if (null != this.field_m) {
          var4 = var4 + this.field_m.field_j;
        }
        if (null != this.field_n) {
          var2 = var2 != 0 | this.field_n.b(var3, this.field_k, hn.field_k, rf.field_b) ? 1 : 0;
          var3 = var3 + this.field_n.field_k;
        }
        stackIn_16_0 = var2;
        if (hn.field_k >= var3) {
          var2Lifetime1 = stackIn_16_0 | 1;
        } else {
          stackIn_24_0 = stackIn_16_0;
          if (rf.field_b >= this.field_k) {
            var2Lifetime1 = stackIn_16_0 | 1;
          } else {
            stackIn_33_0 = stackIn_24_0;
            sharedTailExit_0: {
              if (hn.field_k <= this.field_u - var4) {
                stackIn_35_0 = stackIn_33_0;
                stackIn_35_1 = 1;
              } else {
                if (rf.field_b <= this.field_A.field_i) {
                  var2Lifetime1 = stackIn_24_0 | 1;
                  break sharedTailExit_0;
                }
                stackIn_35_0 = stackIn_24_0;
                stackIn_35_1 = 0;
              }
              var2Lifetime1 = stackIn_35_0 | stackIn_35_1;
            }
          }
        }
        var3 = var3 + (this.field_u - var4);
        if (this.field_m != null) {
          var2Lifetime1 = var2Lifetime1 != 0 | this.field_m.b(var3, this.field_k, hn.field_k, rf.field_b) ? 1 : 0;
        }
        if (param0 != -9) {
          return true;
        }
        return var2Lifetime1 != 0;
    }

    final void c(byte param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        int var3Lifetime7;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime2Lifetime1;
        var4 = Chess.field_G;
        if (!this.field_v) {
          var2 = this.field_o.field_t / 4;
          if (th.field_d == 0 &&
            wh.field_f == 0) {
            this.field_d = false;
            this.field_z = false;
            if (this.field_s > this.field_x) {
              this.field_x = this.field_s;
            }
            if (this.field_y < this.field_x) {
              this.field_x = this.field_y;
            }
            var3 = 77 / ((-32 - param0) / 63);
            return;
          }
          if (!this.field_z &&
            this.field_k - var2 / 2 > rf.field_b) {
            this.field_d = false;
            if (this.field_s > this.field_x) {
              this.field_x = this.field_s;
            }
            if (this.field_y < this.field_x) {
              this.field_x = this.field_y;
            }
            var3Lifetime5 = 77 / ((-32 - param0) / 63);
            return;
          }
          if (!this.field_z &&
            -(var2 / 2) + this.field_k + var2 < rf.field_b) {
            this.field_d = false;
            if (this.field_s > this.field_x) {
              this.field_x = this.field_s;
            }
            if (this.field_y < this.field_x) {
              this.field_x = this.field_y;
            }
            var3Lifetime6 = 77 / ((-32 - param0) / 63);
            return;
          }
          var3Lifetime7 = -this.field_i + hn.field_k;
          if (this.field_z) {
            var3Lifetime7 = var3Lifetime7 + (this.field_u / (-this.field_s + this.field_y) >> 1);
            this.field_x = this.field_s + (this.field_y - this.field_s) * var3Lifetime7 / this.field_u;
            this.field_z = true;
            this.field_d = true;
            if (this.field_s > this.field_x) {
              this.field_x = this.field_s;
            }
            if (this.field_y < this.field_x) {
              this.field_x = this.field_y;
            }
            var3Lifetime7 = 77 / ((-32 - param0) / 63);
          } else {
            if (var3Lifetime7 < 0) {
              this.field_d = false;
            } else {
              if (this.field_u < var3Lifetime7) {
                this.field_d = false;
              } else {
                var3Lifetime7 = var3Lifetime7 + (this.field_u / (-this.field_s + this.field_y) >> 1);
                this.field_x = this.field_s + (this.field_y - this.field_s) * var3Lifetime7 / this.field_u;
                this.field_z = true;
                this.field_d = true;
                if (this.field_s > this.field_x) {
                  this.field_x = this.field_s;
                }
                if (this.field_y < this.field_x) {
                  this.field_x = this.field_y;
                }
                var3Lifetime7 = 77 / ((-32 - param0) / 63);
              }
            }
          }
          return;
        }
        if (null != this.field_t) {
          var2Lifetime1 = this.field_t.field_t;
        } else {
          var2Lifetime1 = this.field_o.field_t / 4;
        }
        if (th.field_d != 0) {
          if (!this.field_z &&
            this.field_k - var2Lifetime1 / 2 > rf.field_b) {
            this.field_d = false;
            if (this.field_s > this.field_x) {
              this.field_x = this.field_s;
            }
            if (this.field_y < this.field_x) {
              this.field_x = this.field_y;
            }
            var3Lifetime1 = 77 / ((-32 - param0) / 63);
            return;
          }
          if (!this.field_z &&
            -(var2Lifetime1 / 2) + this.field_k + var2Lifetime1 < rf.field_b) {
            this.field_d = false;
            if (this.field_s > this.field_x) {
              this.field_x = this.field_s;
            }
            if (this.field_y < this.field_x) {
              this.field_x = this.field_y;
            }
            var3Lifetime1Lifetime1 = 77 / ((-32 - param0) / 63);
            return;
          }
          var3Lifetime1Lifetime2 = -this.field_i + hn.field_k;
          if (this.field_z) {
            var3Lifetime1Lifetime2 = var3Lifetime1Lifetime2 + (this.field_u / (-this.field_s + this.field_y) >> 1);
            this.field_x = this.field_s + (this.field_y - this.field_s) * var3Lifetime1Lifetime2 / this.field_u;
            this.field_z = true;
            this.field_d = true;
            if (this.field_s > this.field_x) {
              this.field_x = this.field_s;
            }
            if (this.field_y < this.field_x) {
              this.field_x = this.field_y;
            }
            var3Lifetime1Lifetime2 = 77 / ((-32 - param0) / 63);
          } else {
            if (var3Lifetime1Lifetime2 < 0) {
              this.field_d = false;
            } else {
              if (this.field_u < var3Lifetime1Lifetime2) {
                this.field_d = false;
              } else {
                var3Lifetime1Lifetime2 = var3Lifetime1Lifetime2 + (this.field_u / (-this.field_s + this.field_y) >> 1);
                this.field_x = this.field_s + (this.field_y - this.field_s) * var3Lifetime1Lifetime2 / this.field_u;
                this.field_z = true;
                this.field_d = true;
                if (this.field_s > this.field_x) {
                  this.field_x = this.field_s;
                }
                if (this.field_y < this.field_x) {
                  this.field_x = this.field_y;
                }
                var3Lifetime1Lifetime2 = 77 / ((-32 - param0) / 63);
              }
            }
          }
          return;
        }
        if (wh.field_f == 0) {
          this.field_d = false;
          this.field_z = false;
          if (this.field_s > this.field_x) {
            this.field_x = this.field_s;
          }
          if (this.field_y >= this.field_x) {
            var3Lifetime2 = 77 / ((-32 - param0) / 63);
            return;
          }
          this.field_x = this.field_y;
          var3Lifetime2Lifetime1 = 77 / ((-32 - param0) / 63);
          return;
        }
        if (!this.field_z &&
          this.field_k - var2Lifetime1 / 2 > rf.field_b) {
          this.field_d = false;
          if (this.field_s > this.field_x) {
            this.field_x = this.field_s;
          }
          if (this.field_y < this.field_x) {
            this.field_x = this.field_y;
          }
          var3Lifetime3 = 77 / ((-32 - param0) / 63);
          return;
        }
        if (this.field_z) {
          var3Lifetime4 = -this.field_i + hn.field_k;
          if (this.field_z) {
            var3Lifetime4 = var3Lifetime4 + (this.field_u / (-this.field_s + this.field_y) >> 1);
            this.field_x = this.field_s + (this.field_y - this.field_s) * var3Lifetime4 / this.field_u;
            this.field_z = true;
            this.field_d = true;
            if (this.field_s > this.field_x) {
              this.field_x = this.field_s;
            }
            if (this.field_y < this.field_x) {
              this.field_x = this.field_y;
            }
            var3Lifetime4 = 77 / ((-32 - param0) / 63);
          } else {
            if (var3Lifetime4 < 0) {
              this.field_d = false;
            } else {
              if (this.field_u < var3Lifetime4) {
                this.field_d = false;
              } else {
                var3Lifetime4 = var3Lifetime4 + (this.field_u / (-this.field_s + this.field_y) >> 1);
                this.field_x = this.field_s + (this.field_y - this.field_s) * var3Lifetime4 / this.field_u;
                this.field_z = true;
                this.field_d = true;
                if (this.field_s > this.field_x) {
                  this.field_x = this.field_s;
                }
                if (this.field_y < this.field_x) {
                  this.field_x = this.field_y;
                }
                var3Lifetime4 = 77 / ((-32 - param0) / 63);
              }
            }
          }
        } else {
          if (-(var2Lifetime1 / 2) + this.field_k + var2Lifetime1 < rf.field_b) {
            this.field_d = false;
            if (this.field_s > this.field_x) {
              this.field_x = this.field_s;
            }
            if (this.field_y < this.field_x) {
              this.field_x = this.field_y;
            }
            var3Lifetime4 = 77 / ((-32 - param0) / 63);
          } else {
            var3Lifetime4 = -this.field_i + hn.field_k;
            if (this.field_z) {
              var3Lifetime4 = var3Lifetime4 + (this.field_u / (-this.field_s + this.field_y) >> 1);
              this.field_x = this.field_s + (this.field_y - this.field_s) * var3Lifetime4 / this.field_u;
              this.field_z = true;
              this.field_d = true;
              if (this.field_s > this.field_x) {
                this.field_x = this.field_s;
              }
              if (this.field_y < this.field_x) {
                this.field_x = this.field_y;
              }
              var3Lifetime4 = 77 / ((-32 - param0) / 63);
            } else {
              if (var3Lifetime4 < 0) {
                this.field_d = false;
              } else {
                if (this.field_u < var3Lifetime4) {
                  this.field_d = false;
                } else {
                  var3Lifetime4 = var3Lifetime4 + (this.field_u / (-this.field_s + this.field_y) >> 1);
                  this.field_x = this.field_s + (this.field_y - this.field_s) * var3Lifetime4 / this.field_u;
                  this.field_z = true;
                  this.field_d = true;
                  if (this.field_s > this.field_x) {
                    this.field_x = this.field_s;
                  }
                  if (this.field_y < this.field_x) {
                    this.field_x = this.field_y;
                  }
                  var3Lifetime4 = 77 / ((-32 - param0) / 63);
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_p = null;
        field_r = null;
        field_q = null;
        if (param0 <= 60) {
          field_w = 21;
        }
    }

    wg(int param0, int param1, int param2, rk param3, rk param4, rk param5, km param6, km param7) {
        this.field_s = 0;
        this.field_v = false;
        this.field_z = false;
        this.field_y = 100;
        this.field_x = 50;
        try {
          this.field_o = param6;
          this.field_i = param1;
          this.field_t = param7;
          this.field_A = param4;
          this.field_m = param5;
          this.field_k = param0;
          this.field_n = param3;
          this.field_u = param2;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "wg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = new hg(8, 0, 4, 1);
        field_B = -1;
    }
}
