/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mba extends uq {
    private int field_j;
    static String[] field_g;
    private int field_m;
    private int field_i;
    private int field_k;
    private int field_h;
    private int field_l;
    private int field_n;

    public final int c(byte param0) {
        if (param0 < 91) {
          this.e((byte) -93);
          return this.field_e.a(true);
        }
        return this.field_e.a(true);
    }

    private final void h(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_k < 25) {
          this.field_m = 12;
          this.field_m = this.field_m + (2 + this.h(16094)) % 4;
          if (param0 <= 125) {
            this.c((byte) -70);
            return;
          }
          return;
        }
        if (50 <= this.field_k) {
          if (this.field_k >= 75) {
            this.field_m = 0;
            this.field_m = this.field_m + (2 + this.h(16094)) % 4;
            if (param0 <= 125) {
              this.c((byte) -70);
              return;
            }
            return;
          }
          this.field_m = 4;
          this.field_m = this.field_m + (2 + this.h(16094)) % 4;
          if (param0 > 125) {
            return;
          }
          this.c((byte) -70);
          return;
        }
        this.field_m = 8;
        this.field_m = this.field_m + (2 + this.h(16094)) % 4;
        if (param0 > 125) {
          return;
        }
        this.c((byte) -70);
    }

    final void g(byte param0) {
        int var2;
        int var3;
        uq var4;
        int var5;
        int var2Lifetime1;
        int var2Lifetime2;
        var5 = TombRacer.field_G ? 1 : 0;
        if (0 == this.h(16094)) {
          this.field_k = this.a(10685).e(true).a(100, 0);
          this.field_m = -1;
          this.field_n = 0;
          this.field_i = -1;
          var2 = this.field_h;
          if (var2 == 0) {
            this.f((byte) -84);
          } else {
            if (var2 == 1) {
              this.a((byte) -93);
            }
          }
          if (param0 <= -31) {
            return;
          }
          this.g(97);
          return;
        }
        var2Lifetime1 = this.field_e.c((byte) 106) / 2 * 2;
        var3 = this.field_e.f(116) / 2 * 2;
        var4 = this.field_e.a(18641).a(25, var2Lifetime1, var3).b((byte) -95);
        if (var4 instanceof mba) {
          this.field_k = ((mba) (var4)).field_k;
        }
        this.field_m = -1;
        this.field_n = 0;
        this.field_i = -1;
        var2Lifetime2 = this.field_h;
        if (var2Lifetime2 == 0) {
          this.f((byte) -84);
        } else {
          if (var2Lifetime2 == 1) {
            this.a((byte) -93);
          }
        }
        if (param0 <= -31) {
          return;
        }
        this.g(97);
        return;
    }

    final void a(boolean param0) {
        if (param0) {
          this.field_l = sw.a(this.field_l, 6);
          this.g((byte) -49);
          return;
        }
        this.h((byte) -116);
        this.field_l = sw.a(this.field_l, 6);
        this.g((byte) -49);
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 != -84) {
          this.field_h = 93;
          var2 = this.field_e.field_h;
          if (0 == var2) {
            this.h((byte) 127);
            return;
          }
          if (var2 == 1) {
            this.b(false);
            return;
          }
          return;
        }
        var2Lifetime1 = this.field_e.field_h;
        if (0 == var2Lifetime1) {
          this.h((byte) 127);
          return;
        }
        if (var2Lifetime1 == 1) {
          this.b(false);
          return;
        }
    }

    public static void d(int param0) {
        field_g = null;
        if (param0 != -1) {
          field_g = (String[]) null;
        }
    }

    private final int h(int param0) {
        if (param0 == 16094) {
          return this.field_e.c((byte) 102) % 2 + 2 * (this.field_e.f(-77) % 2);
        }
        field_g = (String[]) null;
        return this.field_e.c((byte) 102) % 2 + 2 * (this.field_e.f(-77) % 2);
    }

    public final void a(int param0, iq param1) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        pca var12 = null;
        pca var13 = null;
        int var11Lifetime1;
        try {
          var3_int = this.field_e.c((byte) 83);
          var4 = this.field_e.f(111);
          var5 = this.field_e.a(18641).c(31);
          if (param0 < 103) {
            this.c((byte) 39);
          }
          var6 = 4;
          var7 = var5 - 5;
          if (var6 > var4) {
            return;
          }
          if (var4 >= var7) {
            return;
          }
          var8 = this.field_e.a((byte) -104);
          var9 = this.field_e.a(true);
          if (!this.field_e.b(false)) {
            if (-1 != this.field_m) {
              gqa.a(0, -83584144, var9, var8, gca.field_g[this.field_m], 0);
            }
            if (hb.d(43) &&
              this.field_i != -1) {
              gqa.a(this.field_n, -83584144, var9, var8, gca.field_g[this.field_i], 0);
            }
          }
          if (!hb.d(-81)) {
            return;
          }
          if (var4 == var6 + 1 &&
            0 < var3_int &&
            var3_int % 2 == 1) {
            var12 = this.field_e.a(18641).a(-104, var3_int - 1, var4);
            if (var12 != null && (!this.field_e.b(false) ||
              !var12.b(false))) {
              var11 = this.field_e.a(18641).d(-30551) / 2;
              gqa.a(1024, -83584144, -var11 + var9, var8 - var11, gca.field_g[25], 65536);
            }
          }
          if (-1 + var7 == var4 &&
            var3_int > 0 &&
            1 == var3_int % 2) {
            var13 = this.field_e.a(18641).a(-100, var3_int - 1, var4);
            if (var13 != null) {
              if (this.field_e.b(false) &&
                var13.b(false)) {
                return;
              }
              var11Lifetime1 = this.field_e.a(18641).d(-30551) / 2;
              gqa.a(0, -83584144, var9 - var11Lifetime1, -var11Lifetime1 + var8, gca.field_g[25], 65536);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("mba.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          return false;
        }
        return false;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
          this.field_m = -69;
        }
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
          this.field_h = -55;
          return 0;
        }
        return 0;
    }

    public final int b(byte param0) {
        int var2 = -111 % ((-23 - param0) / 53);
        return this.field_e.a((byte) -104);
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = TombRacer.field_G ? 1 : 0;
        this.h((byte) 126);
        if (param0 > -83) {
          this.c(-10);
        }
        var2 = this.field_j;
        if (0 == var2) {
          var2 = this.field_l;
          if (var2 == 0) {
            this.field_n = -512;
          } else {
            if (var2 == 4) {
              this.field_n = 512;
            } else {
              if (var2 == 6) {
                this.field_n = 1024;
              } else {
                if (2 == var2) {
                  this.field_n = 0;
                }
              }
            }
          }
          this.field_i = 18;
          return;
        }
        if (var2 == 1) {
          var2 = this.field_l;
          if (var2 == 3) {
            this.field_n = 1024;
          } else {
            if (var2 == 5) {
              this.field_n = -512;
            } else {
              if (var2 == 1) {
                this.field_n = 512;
              } else {
                if (var2 == 7) {
                  this.field_n = 0;
                }
              }
            }
          }
          this.field_i = 20;
          return;
        }
        if (var2 != 2) {
          return;
        }
        var2Lifetime1 = this.field_l;
        if (var2Lifetime1 == 3) {
          this.field_n = 0;
        } else {
          if (var2Lifetime1 == 5) {
            this.field_n = 512;
          } else {
            if (var2Lifetime1 == 1) {
              this.field_n = -512;
            } else {
              if (var2Lifetime1 == 7) {
                this.field_n = 1024;
              }
            }
          }
        }
        this.field_i = 19;
    }

    final static boolean e(int param0) {
        lqa var1 = null;
        lqa var1Lifetime1;
        if (param0 != -22766) {
          mba.e(85);
          var1 = uv.b(false);
          if (var1 == null) {
            return false;
          }
          if (jc.field_M) {
            return false;
          }
          if (var1.field_k) {
            return true;
          }
          return false;
        }
        var1Lifetime1 = uv.b(false);
        if (var1Lifetime1 == null) {
          return false;
        }
        if (jc.field_M) {
          return false;
        }
        if (var1Lifetime1.field_k) {
          return true;
        }
        return false;
    }

    final void g(int param0) {
        this.field_h = 0;
        if (param0 != -23801) {
          this.a((byte) 74);
        }
    }

    private final void b(boolean param0) {
        if (this.field_k < 50) {
          this.field_m = 16;
          if (param0) {
            this.h((byte) -45);
            return;
          }
          return;
        }
        this.field_m = 17;
        if (param0) {
          this.h((byte) -45);
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param3 == 73) {
          this.field_h = param0;
          this.field_j = param2;
          this.field_l = param1;
          return;
        }
        this.a((byte) -40);
        this.field_h = param0;
        this.field_j = param2;
        this.field_l = param1;
    }

    final boolean c(int param0) {
        if (param0 == -2) {
          return this.field_e.field_h == 1 ? true : false;
        }
        this.a((byte) -97);
        return this.field_e.field_h == 1 ? true : false;
    }

    mba() {
    }

    static {
    }
}
