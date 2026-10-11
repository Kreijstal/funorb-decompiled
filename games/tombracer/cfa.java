/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cfa implements dv {
    private int field_a;
    private int[] field_i;
    private int field_h;
    private int field_f;
    static jea field_c;
    private boolean field_e;
    w field_g;
    private ff field_j;
    private int field_d;
    static long field_b;

    final void a(int param0, byte param1) {
        int var3;
        if (this.field_e) {
          return;
        }
        if (-1 == param0) {
          this.field_j.field_H[this.field_h].b(18202625, -1);
        } else {
          var3 = 63;
          if (3 == this.field_i[param0]) {
            var3 = 64;
          } else {
            if (this.field_i[param0] == 4) {
              var3 = 64;
            }
          }
          if (this.field_i[param0] == 5) {
            var3 = 65;
          } else {
            if (this.field_i[param0] == 6) {
              var3 = 65;
            }
          }
          if (this.field_g != null) {
            this.field_g.a(new fm(var3, 0, 0, 0), -58);
          }
          this.field_j.field_H[this.field_h].b(18202625, this.field_i[param0]);
          this.field_i[param0] = -1;
          this.field_f = this.field_f + 1;
        }
        if (param0 >= 0) {
        }
        if (param1 <= 86) {
          this.field_i = (int[]) null;
        }
        this.field_a = 0;
        this.field_d = this.field_d + 1;
        this.d(-14447);
    }

    final int c(int param0) {
        if (param0 != -1) {
          this.toString();
          return this.field_a;
        }
        return this.field_a;
    }

    public static void c(byte param0) {
        if (param0 != 103) {
          return;
        }
        field_c = null;
    }

    final int a(int param0, int param1) {
        int var3 = 112 % ((-11 - param0) / 36);
        if (param1 == -1) {
          return -1;
        }
        return this.field_i[param1];
    }

    private final void d(int param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != -14447) {
          this.field_g = (w) null;
          if (this.field_f >= this.field_i.length) {
            this.field_h = -1;
          } else {
            if (this.field_j.field_P <= this.field_d) {
              this.field_h = -1;
            } else {
              this.field_h = this.field_j.field_c.field_e[this.field_d];
              if (this.field_h == -1) {
                this.field_h = -1;
              } else {
                if (!this.field_j.b((byte) 90, this.field_h)) {
                  this.field_h = -1;
                }
              }
            }
          }
          if (this.field_h != -1) {
            return;
          }
          this.field_e = true;
          return;
        }
        if (this.field_f >= this.field_i.length) {
          this.field_h = -1;
          if (this.field_h != -1) {
            return;
          }
          this.field_e = true;
          return;
        }
        if (this.field_j.field_P <= this.field_d) {
          this.field_h = -1;
          if (this.field_h != -1) {
            return;
          }
          this.field_e = true;
          return;
        }
        this.field_h = this.field_j.field_c.field_e[this.field_d];
        if (this.field_h == -1) {
          this.field_h = -1;
          if (this.field_h != -1) {
            return;
          }
          this.field_e = true;
          return;
        }
        if (this.field_j.b((byte) 90, this.field_h)) {
          if (this.field_h != -1) {
            return;
          }
          this.field_e = true;
          return;
        }
        this.field_h = -1;
        if (this.field_h == -1) {
          this.field_e = true;
        }
    }

    final int b(byte param0) {
        if (param0 <= 18) {
          this.field_h = 121;
          return this.field_d;
        }
        return this.field_d;
    }

    final int a(int param0) {
        if (param0 != -28958) {
          return 27;
        }
        return this.field_i.length;
    }

    final boolean f(int param0) {
        if (param0 != -29004) {
          return true;
        }
        return this.field_e;
    }

    final static cn e(int param0) {
        if (param0 != -1) {
          cfa.e(11);
          return of.a(false, gga.field_M.field_c);
        }
        return of.a(false, gga.field_M.field_c);
    }

    public final String toString() {
        String var4 = "CommonChooseReward[";
        String var5 = var4 + " finished=" + this.field_e;
        String var6 = var5 + " takenCount=" + this.field_f;
        String var7 = var6 + " currentPos=" + this.field_d;
        String var3 = var7 + " currentPlayerId=" + this.field_h;
        String var8 = var3;
        String var9 = var8 + " reward={" + this.field_i[0] + ", " + this.field_i[1] + ", " + this.field_i[2] + "}";
        String var10 = var9 + " currentPlayerTicks=" + this.field_a;
        String var1 = var10 + "]";
        return var1;
    }

    final void d(byte param0) {
        if (param0 != -124) {
          field_b = -84L;
          if (this.field_e) {
            return;
          }
          if (this.field_g == null) {
            if (-1 != this.field_h) {
              this.field_a = this.field_a + 1;
              return;
            }
            this.d(-14447);
            this.field_a = this.field_a + 1;
            return;
          }
          this.field_g.a(108, false);
          if (-1 == this.field_h) {
            this.d(-14447);
            this.field_a = this.field_a + 1;
            return;
          }
          this.field_a = this.field_a + 1;
          return;
        }
        if (this.field_e) {
          return;
        }
        if (this.field_g != null) {
          this.field_g.a(108, false);
          if (-1 != this.field_h) {
            this.field_a = this.field_a + 1;
            return;
          }
          this.d(-14447);
          this.field_a = this.field_a + 1;
          return;
        }
        if (-1 != this.field_h) {
          this.field_a = this.field_a + 1;
          return;
        }
        this.d(-14447);
        this.field_a = this.field_a + 1;
    }

    final int g(int param0) {
        if (param0 != -1) {
          this.a(-107, 98);
          return this.field_h;
        }
        return this.field_h;
    }

    public final void a(kh param0, boolean param1) {
        try {
          this.field_i = fa.a(0, param0, 8, this.field_i);
          this.field_d = param0.b((byte) 44, 3);
          this.field_h = uma.a(4, param0, -26803);
          this.field_a = param0.b((byte) 44, 16);
          if (param1) {
            this.a(99, -112);
          }
          this.field_e = uha.a(5907, param0);
          this.field_f = param0.b((byte) 44, 2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cfa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(byte param0, int param1) {
        int var3 = -121 % ((48 - param0) / 59);
        return this.field_i[param1] != -1 ? true : false;
    }

    cfa() {
        this.field_h = -1;
        this.field_f = 0;
    }

    cfa(ff param0) {
        this.field_h = -1;
        this.field_f = 0;
        try {
          this.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cfa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        int var4 = 0;
        qea var2;
        boolean[] var3;
        int var5;
        int var6;
        kh var7;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = new qea(new int[]{this.field_j.field_C});
        this.field_i = new int[3];
        var3 = new boolean[7];
        for (var4 = 0; this.field_i.length > var4; var4++) {
          var5 = var2.a(7, param0 ^ 28624);
          while (var3[var5]) {
            var5++;
            if (var5 < 7) {
              continue;
            }
            var5 = 0;
          }
          this.field_i[var4] = var5;
          var3[var5] = true;
        }
        if (param0 == 28624) {
          return;
        }
        var7 = (kh) null;
        this.a((kh) null, false);
    }

    final void a(byte param0) {
        if (null != this.field_g) {
          this.field_g.a(new fm(61, 0, 0, 0), -58);
          if (param0 >= -44) {
            this.field_i = (int[]) null;
            return;
          }
          return;
        }
        if (param0 < -44) {
          return;
        }
        this.field_i = (int[]) null;
    }

    static {
        field_b = 1180282300L;
    }
}
