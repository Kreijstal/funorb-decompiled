/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private int field_g;
    static ka[] field_h;
    static int field_c;
    int field_b;
    int field_j;
    static int field_f;
    private int field_a;
    private int field_i;
    private int field_d;
    private boolean field_e;

    final boolean a(byte param0) {
        if (param0 > -46) {
          return false;
        }
        return 0 != this.field_i ? true : false;
    }

    final static ka[] a(int param0, int param1, lj param2, byte param3) {
        RuntimeException var4 = null;
        ka[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 17) {
            field_f = -112;
          }
          if (!lk.a(param3 ^ 177, param2, param1, param0)) {
            return null;
          }
          stackIn_6_0 = lb.f(param3 ^ 221);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("rl.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        if (param0 < 35) {
          return false;
        }
        if (0 != this.field_d) {
          return true;
        }
        if (this.field_a == 84) {
          return true;
        }
        if (this.field_a != 83) {
          return false;
        }
        return true;
    }

    final static ka b(boolean param0) {
        int var4_int = 0;
        ka var4 = null;
        int var5 = TorChallenge.field_F ? 1 : 0;
        int var1 = pg.field_r[0] * lg.field_e[0];
        byte[] var7 = h.field_a[0];
        int[] var3 = new int[var1];
        ka var4Lifetime1;
        int var4_intLifetime1;
        if (param0) {
          for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = td.field_m[jh.a((int) var7[var4_int], 255)];
          }
          var4 = new ka(ij.field_B, le.field_g, ug.field_e[0], dd.field_t[0], pg.field_r[0], lg.field_e[0], var3);
          p.a(0);
          return var4;
        }
        field_c = 104;
        for (var4_intLifetime1 = 0; var1 > var4_intLifetime1; var4_intLifetime1++) {
          var3[var4_intLifetime1] = td.field_m[jh.a((int) var7[var4_intLifetime1], 255)];
        }
        var4Lifetime1 = new ka(ij.field_B, le.field_g, ug.field_e[0], dd.field_t[0], pg.field_r[0], lg.field_e[0], var3);
        p.a(0);
        return var4Lifetime1;
    }

    final void b(int param0) {
        this.field_d = 0;
        this.field_a = 0;
        if (param0 != 15275) {
          return;
        }
        if (this.field_i == 0 &&
          b.field_J == 98) {
          if (this.field_j <= 0) {
            this.field_j = this.field_b;
          }
          this.field_e = false;
          this.field_j = this.field_j - 1;
        }
        if (this.field_i == 0) {
          this.field_a = b.field_J;
        }
        if (0 != this.field_i) {
          return;
        }
        if (99 != b.field_J) {
          return;
        }
        this.field_j = this.field_j + 1;
        this.field_e = false;
        if (this.field_b > this.field_j) {
          return;
        }
        this.field_j = 0;
    }

    final boolean d(int param0) {
        if (param0 > -84) {
          return false;
        }
        return this.field_a == 103 ? true : false;
    }

    final void b(int param0, int param1) {
        if (param0 < -119) {
          if (this.field_i == 0) {
            this.field_e = false;
            this.field_j = param1;
          }
          return;
        }
        this.field_d = -71;
        if (this.field_i == 0) {
          this.field_e = false;
          this.field_j = param1;
        }
    }

    final void a(int param0) {
        this.field_a = param0;
        this.field_d = 0;
        if (this.field_i == 0 &&
          b.field_J == 96) {
          if (this.field_j <= 0) {
            this.field_j = this.field_b;
          }
          this.field_j = this.field_j - 1;
          this.field_e = false;
        }
        if (0 == this.field_i) {
          this.field_a = b.field_J;
        }
        if (0 != this.field_i) {
          return;
        }
        if (b.field_J != 97) {
          return;
        }
        this.field_j = this.field_j + 1;
        if (this.field_b <= this.field_j) {
          this.field_j = 0;
        }
        this.field_e = false;
    }

    public static void b(byte param0) {
        if (param0 != -82) {
          field_h = (ka[]) null;
          field_h = null;
          return;
        }
        field_h = null;
    }

    final void a(int param0, int param1) {
        this.field_d = 0;
        this.field_a = 0;
        if (this.field_i == 0 &&
          b.field_J == 96) {
          if (this.field_j <= 0) {
            this.field_j = this.field_b;
          }
          this.field_e = false;
          this.field_j = this.field_j - 1;
        }
        if (this.field_i == param0) {
          this.field_a = b.field_J;
        }
        if (this.field_i == 0 &&
          97 == b.field_J) {
          this.field_j = this.field_j + 1;
          if (this.field_b <= this.field_j) {
            this.field_j = 0;
          }
          this.field_e = false;
        }
        if (this.field_i != 0) {
          return;
        }
        if (b.field_J != 98 &&
          b.field_J != 99) {
          return;
        }
        if (this.field_j < 0) {
          this.field_j = param1;
        }
        this.field_e = false;
    }

    final static void c(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        ij.c((byte) -98);
        if (null == bg.field_P) {
          var1 = 0 / ((-30 - param0) / 53);
          cg.a((byte) -102);
          tc.c(-119);
          pa.f((byte) 109);
          if (td.a(20422)) {
            dk.field_s.d(25, 1);
            nb.a(0, -1);
          }
          ob.b(-95);
          return;
        }
        rk.a((byte) -100, bg.field_P);
        var1Lifetime1 = 0 / ((-30 - param0) / 53);
        cg.a((byte) -102);
        tc.c(-119);
        pa.f((byte) 109);
        if (td.a(20422)) {
          dk.field_s.d(25, 1);
          nb.a(0, -1);
        }
        ob.b(-95);
    }

    final void e(int param0) {
        this.field_a = 0;
        this.field_d = param0;
        if (this.field_i == 0) {
          this.field_a = b.field_J;
        }
    }

    final boolean g(int param0) {
        if (param0 >= -109) {
          return true;
        }
        return this.field_a == 97 ? true : false;
    }

    final void a(byte param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        this.field_i = 0;
        this.field_e = param1 ? true : false;
        if (!this.field_e) {
          this.field_j = param2;
          var5 = -113 / ((-43 - param0) / 35);
          return;
        }
        this.field_j = param3;
        var5Lifetime1 = -113 / ((-43 - param0) / 35);
    }

    final boolean f(int param0) {
        if (param0 == 8543) {
          return this.field_a == 102 ? true : false;
        }
        this.c((byte) 30);
        return this.field_a == 102 ? true : false;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return true;
        }
        return this.field_a == 96 ? true : false;
    }

    final void a(byte param0, int param1, int param2) {
        if (this.field_b <= param1) {
          throw new IllegalArgumentException();
        }
        if (this.field_b <= param2) {
          throw new IllegalArgumentException();
        }
        this.field_d = 0;
        this.field_a = 0;
        if (vb.field_n == 0) {
          if (this.field_i != 0 &&
            0 != wh.field_e) {
            if (0 >= this.field_g) {
              this.field_g = v.field_W;
            }
            this.field_g = this.field_g - 1;
          }
          if (0 == vb.field_n &&
            wh.field_e == 0) {
            this.field_i = 0;
            if (param0 <= 1) {
              this.field_d = 76;
            }
            if (this.field_i == 0) {
              if (!this.field_e &&
                !ek.field_P) {
                return;
              }
              if (param1 < 0) {
                if (this.field_e) {
                  this.field_j = -1;
                }
              } else {
                if (param1 != this.field_j) {
                  this.field_e = true;
                  this.field_j = param1;
                } else {
                  this.field_e = true;
                  this.field_j = param1;
                }
              }
            }
            return;
          }
          if (param0 > 1) {
            if (this.field_i != 0) {
              return;
            }
            if (!this.field_e &&
              !ek.field_P) {
              return;
            }
            if (param1 < 0) {
              if (!this.field_e) {
                return;
              }
              this.field_j = -1;
              return;
            }
            if (param1 != this.field_j) {
            }
            this.field_e = true;
            this.field_j = param1;
            return;
          }
          this.field_d = 76;
          if (this.field_i == 0) {
            if (!this.field_e &&
              !ek.field_P) {
              return;
            }
            if (param1 < 0) {
              if (this.field_e) {
                this.field_j = -1;
              }
            } else {
              if (param1 != this.field_j) {
                this.field_e = true;
                this.field_j = param1;
              } else {
                this.field_e = true;
                this.field_j = param1;
              }
            }
          }
          return;
        }
        this.field_d = vb.field_n;
        this.field_i = vb.field_n;
        this.field_e = true;
        this.field_j = param2;
        this.field_g = pl.field_a;
        if (this.field_i == 0) {
          if (0 == vb.field_n &&
            wh.field_e == 0) {
            this.field_i = 0;
            if (param0 <= 1) {
              this.field_d = 76;
            }
            if (this.field_i == 0) {
              if (!this.field_e &&
                !ek.field_P) {
                return;
              }
              if (param1 < 0) {
                if (this.field_e) {
                  this.field_j = -1;
                }
              } else {
                if (param1 != this.field_j) {
                  this.field_e = true;
                  this.field_j = param1;
                } else {
                  this.field_e = true;
                  this.field_j = param1;
                }
              }
            }
            return;
          }
          if (param0 <= 1) {
            this.field_d = 76;
            if (this.field_i == 0) {
              if (!this.field_e &&
                !ek.field_P) {
                return;
              }
              if (param1 < 0) {
                if (this.field_e) {
                  this.field_j = -1;
                }
              } else {
                if (param1 != this.field_j) {
                  this.field_e = true;
                  this.field_j = param1;
                } else {
                  this.field_e = true;
                  this.field_j = param1;
                }
              }
            }
            return;
          }
        } else {
          if (0 != wh.field_e) {
            if (0 >= this.field_g) {
              this.field_g = v.field_W;
            }
            this.field_g = this.field_g - 1;
          }
          if (0 == vb.field_n &&
            wh.field_e == 0) {
            this.field_i = 0;
            if (param0 <= 1) {
              this.field_d = 76;
            }
            if (this.field_i != 0) {
              return;
            }
            if (!this.field_e &&
              !ek.field_P) {
              return;
            }
            if (param1 < 0) {
              if (!this.field_e) {
                return;
              }
              this.field_j = -1;
              return;
            }
            if (param1 == this.field_j) {
              this.field_e = true;
              this.field_j = param1;
              return;
            }
            this.field_e = true;
            this.field_j = param1;
            return;
          }
          if (param0 <= 1) {
            this.field_d = 76;
          }
        }
        if (this.field_i != 0) {
          return;
        }
        if (!this.field_e &&
          !ek.field_P) {
          return;
        }
        if (param1 < 0) {
          if (!this.field_e) {
            return;
          }
          this.field_j = -1;
          return;
        }
        if (param1 != this.field_j) {
        }
        this.field_e = true;
        this.field_j = param1;
    }

    rl(int param0) {
        this.field_j = 0;
        this.field_e = false;
        this.field_b = param0;
    }

    static {
        field_c = -1;
    }
}
