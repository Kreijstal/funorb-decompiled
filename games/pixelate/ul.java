/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends bg {
    static String field_n;
    private int field_o;
    static ak field_p;
    static int field_q;
    static String field_m;
    private int field_r;
    private int field_s;

    final void b(int param0, boolean param1) {
        if (param0 <= -23) {
          this.field_s = this.field_s + (!param1 ? 50 : -50);
          return;
        }
        field_p = (ak) null;
        this.field_s = this.field_s + (!param1 ? 50 : -50);
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!oo.field_d) {
            return false;
          }
          if (param0 <= 48) {
            field_q = 5;
          }
          if (ce.field_d == 2 &&
            null != fp.field_d) {
            var3 = (CharSequence) ((Object) param1);
            if (fp.field_d.equals(dh.a(var3, (byte) 26))) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ul.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_m = null;
        field_n = null;
        if (param0 > -35) {
          return;
        }
        field_p = null;
    }

    final void a(int param0, boolean param1) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_1 = false;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Pixelate.field_H ? 1 : 0;
        super.a((byte) 21);
        stackIn_3_0 = param1;
        stackIn_4_1 = (pf.field_e) && (gf.field_b);
        param1 = stackIn_3_0 | stackIn_4_1;
        if (this.field_s > this.field_r) {
          this.field_s = this.field_r;
        }
        if (!param1) {
          this.field_s = this.field_s - 1;
          var3 = -68 % ((-83 - param0) / 37);
          if (this.field_s > 0) {
            if (this.field_s < (this.field_r >> 2) + 20 &&
              this.field_s % 30 == 0) {
              this.b(255);
              mc.a(129, -120);
            } else {
              if (-20 + this.field_r > this.field_s &&
                this.field_s % (this.field_r >> 2) == 0) {
                this.b(255);
              }
            }
          } else {
            this.field_s = 0;
            mc.a(130, -123);
            if (this.field_s >= (this.field_r >> 2) + 20) {
              if (-20 + this.field_r > this.field_s &&
                this.field_s % (this.field_r >> 2) == 0) {
                this.b(255);
              }
            } else {
              if (this.field_s % 30 != 0) {
                if (-20 + this.field_r > this.field_s &&
                  this.field_s % (this.field_r >> 2) == 0) {
                  this.b(255);
                }
              } else {
                this.b(255);
                mc.a(129, -120);
              }
            }
          }
          var4 = 615 * this.field_s / this.field_r;
          if (this.field_o < var4) {
            this.field_o = this.field_o + 10;
            this.field_h = 0;
            if (this.field_o > var4) {
              this.field_o = var4;
            }
          } else {
            this.field_o = var4;
          }
          if (this.field_o > 615) {
            this.field_o = 615;
          }
          return;
        }
        var3Lifetime1 = -68 % ((-83 - param0) / 37);
        if (this.field_s <= 0) {
          this.field_s = 0;
          mc.a(130, -123);
          if (this.field_s < (this.field_r >> 2) + 20 &&
            this.field_s % 30 == 0) {
            this.b(255);
            mc.a(129, -120);
          } else {
            if (-20 + this.field_r > this.field_s &&
              this.field_s % (this.field_r >> 2) == 0) {
              this.b(255);
            }
          }
        } else {
          if (this.field_s >= (this.field_r >> 2) + 20) {
            if (-20 + this.field_r > this.field_s &&
              this.field_s % (this.field_r >> 2) == 0) {
              this.b(255);
            }
          } else {
            if (this.field_s % 30 == 0) {
              this.b(255);
              mc.a(129, -120);
            } else {
              if (-20 + this.field_r > this.field_s &&
                this.field_s % (this.field_r >> 2) == 0) {
                this.b(255);
              }
            }
          }
        }
        var4Lifetime1 = 615 * this.field_s / this.field_r;
        if (this.field_o >= var4Lifetime1) {
          this.field_o = var4Lifetime1;
        } else {
          this.field_o = this.field_o + 10;
          this.field_h = 0;
          if (this.field_o > var4Lifetime1) {
            this.field_o = var4Lifetime1;
          }
        }
        if (this.field_o > 615) {
          this.field_o = 615;
        }
        return;
    }

    final void c(int param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        int stackIn_3_0 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        if (615 > this.field_o) {
          stackIn_3_0 = -1 - this.field_o + 615;
        } else {
          stackIn_3_0 = 0;
        }
        var2 = stackIn_3_0;
        this.a(param0 ^ 119, var2, 435, this.field_o);
        var3 = -(this.field_o / param0) + 320;
        for (var4 = 0; var4 < 7; var4++) {
          var5 = 13 + (76 + var4 * 76 + 2);
          if (var3 + 5 <= var5 &&
            var3 + this.field_o - 6 >= var5) {
            t.f(1 + var5, 438, 19, 0, 128);
            t.f(2 + var5, 439, 18, 16777215, 128);
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return this.field_s <= 0 ? true : false;
        }
        this.b(-8, true);
        return this.field_s <= 0 ? true : false;
    }

    private final void a(boolean param0, int param1) {
        this.field_s = param1 * 50;
        this.field_r = this.field_s;
        if (!param0) {
          field_n = (String) null;
        }
    }

    final boolean a(int param0, byte param1) {
        this.field_s = this.field_s + param0 * 50;
        if (param1 == 73) {
          return this.field_r <= this.field_s ? true : false;
        }
        this.field_s = -66;
        return this.field_r <= this.field_s ? true : false;
    }

    ul(int param0) {
        this.a(true, param0);
        this.field_r = this.field_s;
    }

    static {
        field_n = "All games";
        field_m = "Lobby";
    }
}
