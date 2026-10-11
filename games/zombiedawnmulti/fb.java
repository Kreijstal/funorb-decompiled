/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static qd field_e;
    int field_m;
    private int field_n;
    static String field_g;
    private boolean field_k;
    private int field_c;
    private int field_f;
    static int[] field_d;
    private int field_j;
    int field_l;
    private int field_a;
    private int field_i;
    private int field_h;
    boolean field_b;

    final boolean b(byte param0) {
        if (param0 < 14) {
          this.field_c = -121;
          return this.field_k;
        }
        return this.field_k;
    }

    public static void d(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
        if (param0 > -29) {
          field_d = (int[]) null;
        }
    }

    final int a(int param0, byte param1) {
        int stackIn_18_0 = 0;
        if (param1 > -43) {
          this.field_b = false;
          if (this.field_b) {
            return -1;
          }
          if (this.field_h <= 55) {
            return -1;
          }
          if (param0 - this.field_m <= 0) {
            return -1;
          }
          if (-this.field_m + param0 >= 40) {
            return -1;
          }
          return this.field_n;
        }
        if (this.field_b) {
          return -1;
        }
        if (this.field_h <= 55) {
          return -1;
        }
        if (param0 - this.field_m > 0 &&
          -this.field_m + param0 < 40) {
          stackIn_18_0 = this.field_n;
        } else {
          stackIn_18_0 = -1;
        }
        return stackIn_18_0;
    }

    final static void a(ob param0, byte param1) {
        try {
          param0.field_D = new char[]{(char)63};
          int var2_int = 54 / ((23 - param1) / 40);
          param0.field_B = new int[]{-1};
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "fb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        jk.field_j = param0;
        if (param1 < 43) {
          fb.d(-36);
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        float var7 = 0.0f;
        int var4 = Math.abs(20 + (this.field_m - param2));
        if (param0 >= 81) {
          var5 = 480 - param1;
          var6 = 55;
          var7 = (float)(-(var4 * var4) - var5 * var5) + 8100.0f;
          if (0.0f < var7) {
            if (var7 > 8000.0f) {
              var7 = 8000.0f;
            }
            var6 = var6 + (int)(10.0f * (var7 / 8000.0f));
          }
          return var6;
        }
        return 73;
    }

    final void b(int param0) {
        this.field_a = param0;
        this.field_k = true;
        this.field_b = false;
    }

    final void c(byte param0) {
        this.field_k = false;
        if (param0 != 18) {
          this.field_b = false;
        }
    }

    final void a(int param0) {
        this.field_k = false;
        this.field_b = true;
        this.field_a = param0;
        this.field_h = 0;
        this.field_c = 0;
    }

    final int a(byte param0) {
        if (param0 < 37) {
          this.a((byte) -62);
          return this.field_n;
        }
        return this.field_n;
    }

    final boolean a(int param0, int param1, byte param2) {
        boolean stackIn_18_0 = false;
        if (param2 >= -32) {
          this.a(83, (byte) -68);
          if (55 <= 480 - param0) {
            return false;
          }
          if (this.field_b) {
            return false;
          }
          if (param1 <= this.field_m) {
            return false;
          }
          if (param1 >= this.field_m + 40) {
            return false;
          }
          return true;
        }
        if (55 <= 480 - param0) {
          return false;
        }
        if (this.field_b) {
          return false;
        }
        stackIn_18_0 = (param1 > this.field_m) && (param1 < this.field_m + 40);
        return stackIn_18_0;
    }

    final void c(int param0) {
        int[] var9 = null;
        int var4 = 0;
        int var2 = 76 / ((param0 - 82) / 33);
        int var4Lifetime1;
        if (this.field_h <= 0) {
          return;
        }
        if (this.field_l == 0) {
          return;
        }
        int var3 = -(255 * (-this.field_c + this.field_l) / this.field_l) + 255;
        if (var3 < 0) {
          var3 = 0;
        }
        if (var3 > 255) {
          var3 = 255;
        }
        el.field_H[this.field_a].c(this.field_m, -this.field_h + 480, var3);
        if (this.field_a != 2) {
          var4 = wa.field_b[this.field_n].field_w - wa.field_b[this.field_n].field_w * (-this.field_c + this.field_l) / this.field_l;
          wa.field_b[this.field_n].c(this.field_m + 8, -this.field_h + 504, var3);
          var9 = new int[4];
          oo.a(var9);
          oo.h(8 + this.field_m, -var4 + (wa.field_b[this.field_n].field_w + 24) + (480 - this.field_h), wa.field_b[this.field_n].field_x + 8 + this.field_m, wa.field_b[this.field_n].field_w + (24 - this.field_h + 480));
          wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 504);
          oo.b(var9);
          return;
        }
        if (this.field_l > this.field_c) {
          if (this.field_k) {
            el.field_H[this.field_a].e(this.field_m, -this.field_h + 480, lh.field_b[this.field_i] + 96);
          }
          wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 480 + 24);
          if (this.field_k) {
            wa.field_b[this.field_n].e(8 + this.field_m, 24 + (480 - this.field_h), 196 + lh.field_b[this.field_i]);
          }
          el.field_H[3].g(this.field_m, 480 - this.field_h);
          return;
        }
        var4Lifetime1 = (this.field_i + this.field_m / 3) % 50;
        if (25 < var4Lifetime1) {
          oo.d(wa.field_b[this.field_n].field_x / 2 + 8 + this.field_m, 504 - (this.field_h - wa.field_b[this.field_n].field_w / 2), lh.field_b[var4Lifetime1] * 5 / 8, 13421772, 68 - var4Lifetime1);
          oo.d(wa.field_b[this.field_n].field_x / 2 + (this.field_m + 8), -this.field_h + 480 + (24 + wa.field_b[this.field_n].field_w / 2), 4 * lh.field_b[var4Lifetime1] / 8, 11206570, 118 - var4Lifetime1);
          if (this.field_k) {
            el.field_H[this.field_a].e(this.field_m, -this.field_h + 480, lh.field_b[this.field_i] + 96);
            wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 480 + 24);
            if (this.field_k) {
              wa.field_b[this.field_n].e(8 + this.field_m, 24 + (480 - this.field_h), 196 + lh.field_b[this.field_i]);
            }
            el.field_H[3].g(this.field_m, 480 - this.field_h);
            return;
          }
          wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 480 + 24);
          if (this.field_k) {
            wa.field_b[this.field_n].e(8 + this.field_m, 24 + (480 - this.field_h), 196 + lh.field_b[this.field_i]);
          }
          el.field_H[3].g(this.field_m, 480 - this.field_h);
          return;
        }
        if (!this.field_k) {
          wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 480 + 24);
          if (this.field_k) {
            wa.field_b[this.field_n].e(8 + this.field_m, 24 + (480 - this.field_h), 196 + lh.field_b[this.field_i]);
          }
          el.field_H[3].g(this.field_m, 480 - this.field_h);
          return;
        }
        el.field_H[this.field_a].e(this.field_m, -this.field_h + 480, lh.field_b[this.field_i] + 96);
        wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 480 + 24);
        if (this.field_k) {
          wa.field_b[this.field_n].e(8 + this.field_m, 24 + (480 - this.field_h), 196 + lh.field_b[this.field_i]);
        }
        el.field_H[3].g(this.field_m, 480 - this.field_h);
    }

    final void a(int param0, int param1, int param2) {
        int stackIn_14_0 = 0;
        int stackIn_67_0 = 0;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        int fieldTemp$0 = this.field_i + 1;
        this.field_i = this.field_i + 1;
        if (fieldTemp$0 == 50) {
          this.field_i = 0;
        }
        if (this.field_m > this.field_f) {
          this.field_m = this.field_m - 2;
          if (this.field_m >= this.field_f) {
            if (!this.field_b) {
              if (this.field_k) {
                this.field_h = 70;
              } else {
                var4 = 425;
                if (var4 > param1) {
                  stackIn_14_0 = 0;
                } else {
                  stackIn_14_0 = this.a((byte) 118, param1, param0);
                }
                var5 = stackIn_14_0;
                if (Math.abs(-this.field_h + var5) > 2) {
                  if (this.field_h >= var5) {
                    this.field_h = this.field_h - 2;
                  } else {
                    this.field_h = this.field_h + 2;
                  }
                } else {
                  this.field_h = var5;
                }
                if (65 >= this.field_h) {
                  if (this.field_h < 55) {
                    this.field_h = 55;
                  }
                  if (!this.field_k &&
                    this.field_h > 65) {
                    this.field_h = 65;
                  }
                  if (param2 != 255) {
                    fb.d(30);
                  }
                  if (!this.field_b &&
                    this.field_h < 55) {
                    this.field_h = 55;
                  }
                  return;
                }
                this.field_h = 65;
                if (this.field_h < 55) {
                  this.field_h = 55;
                }
              }
            } else {
              this.field_a = 1;
              this.field_h = 65;
              this.field_c = this.field_c + 1;
              this.field_c = op.field_m.field_H - (tg.field_e.field_b[this.field_j] - field_e.a(this.field_j, (byte) 109));
              this.field_l = field_e.a(this.field_j, (byte) 108);
              if (this.field_l > this.field_c) {
                return;
              }
              this.field_a = 2;
              this.field_c = this.field_l;
              this.field_b = false;
            }
            if (!this.field_k &&
              this.field_h > 65) {
              this.field_h = 65;
            }
            if (param2 != 255) {
              fb.d(30);
            }
            if (!this.field_b &&
              this.field_h < 55) {
              this.field_h = 55;
            }
            return;
          }
          this.field_m = this.field_f;
        }
        if (!this.field_b) {
          if (this.field_k) {
            this.field_h = 70;
            if (!this.field_k) {
              if (this.field_h <= 65) {
                if (param2 != 255) {
                  fb.d(30);
                }
                if (!this.field_b &&
                  this.field_h < 55) {
                  this.field_h = 55;
                }
                return;
              }
              this.field_h = 65;
            }
            if (param2 != 255) {
              fb.d(30);
            }
            if (this.field_b) {
              return;
            }
            if (this.field_h >= 55) {
              return;
            }
            this.field_h = 55;
            return;
          }
          var4Lifetime1 = 425;
          if (var4Lifetime1 > param1) {
            stackIn_67_0 = 0;
          } else {
            stackIn_67_0 = this.a((byte) 118, param1, param0);
          }
          var5Lifetime1 = stackIn_67_0;
          if (Math.abs(-this.field_h + var5Lifetime1) > 2) {
            if (this.field_h >= var5Lifetime1) {
              this.field_h = this.field_h - 2;
              if (65 < this.field_h) {
                this.field_h = 65;
              }
              if (this.field_h < 55) {
                this.field_h = 55;
              }
              if (!this.field_k &&
                this.field_h > 65) {
                this.field_h = 65;
              }
              if (param2 != 255) {
                fb.d(30);
              }
              if (!this.field_b &&
                this.field_h < 55) {
                this.field_h = 55;
              }
              return;
            }
            this.field_h = this.field_h + 2;
          } else {
            this.field_h = var5Lifetime1;
          }
          if (65 < this.field_h) {
            this.field_h = 65;
            if (this.field_h < 55) {
              this.field_h = 55;
            }
            if (!this.field_k &&
              this.field_h > 65) {
              this.field_h = 65;
            }
            if (param2 != 255) {
              fb.d(30);
            }
            if (!this.field_b &&
              this.field_h < 55) {
              this.field_h = 55;
            }
            return;
          }
          if (this.field_h < 55) {
            this.field_h = 55;
          }
        } else {
          this.field_a = 1;
          this.field_h = 65;
          this.field_c = this.field_c + 1;
          this.field_c = op.field_m.field_H - (tg.field_e.field_b[this.field_j] - field_e.a(this.field_j, (byte) 109));
          this.field_l = field_e.a(this.field_j, (byte) 108);
          if (this.field_l > this.field_c) {
            return;
          }
          this.field_a = 2;
          this.field_c = this.field_l;
          this.field_b = false;
        }
        if (!this.field_k &&
          this.field_h > 65) {
          this.field_h = 65;
        }
        if (param2 != 255) {
          fb.d(30);
        }
        if (this.field_b) {
          return;
        }
        if (this.field_h >= 55) {
          return;
        }
        this.field_h = 55;
    }

    fb(int param0, int param1, int param2) {
        this.field_k = false;
        this.field_b = false;
        this.field_m = param0;
        this.field_f = this.field_m;
        this.field_a = 2;
        this.field_j = param2;
        this.field_h = 0;
        this.field_n = param1;
        this.field_c = 0;
    }

    static {
        field_g = "You know what you want, so should your zombies. This will hurry them up, making them move faster.";
    }
}
