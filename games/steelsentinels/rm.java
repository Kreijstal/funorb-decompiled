/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    private int field_d;
    static int field_g;
    private int field_a;
    static boolean field_p;
    static int field_n;
    int field_m;
    boolean field_c;
    private int field_b;
    private int field_k;
    static String[] field_o;
    static SceneWidget field_j;
    static boolean field_f;
    static String field_i;
    int field_e;
    static int[] field_h;
    private boolean field_l;

    final void a(int param0, int param1) {
        if (this.field_d == param0) {
          this.field_e = param1;
          this.field_l = false;
          this.field_c = true;
        }
    }

    final boolean a(int param0) {
        if (param0 == 0) {
          return 0 != this.field_d ? true : false;
        }
        this.a(false, -82);
        return 0 != this.field_d ? true : false;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_l = param0 ? true : false;
        this.field_d = param2;
        if (this.field_l) {
          this.field_e = param3;
          return;
        }
        this.field_e = param1;
    }

    final void a(boolean param0, int param1) {
        this.field_c = false;
        if (!param0) {
          this.c(-28);
        }
        this.field_b = 0;
        this.field_k = 0;
        if (this.field_d == 0 &&
          ei.field_q == 96) {
          if (this.field_e <= 0) {
            this.field_e = this.field_m;
          }
          this.field_c = true;
          this.field_l = false;
          this.field_e = this.field_e - 1;
        }
        if (0 == this.field_d) {
          this.field_b = ei.field_q;
        }
        if (this.field_d == 0 &&
          ei.field_q == 97) {
          this.field_e = this.field_e + 1;
          if (this.field_e >= this.field_m) {
            this.field_e = 0;
          }
          this.field_c = true;
          this.field_l = false;
        }
        if (this.field_d != 0) {
          return;
        }
        if (ei.field_q != 98 &&
          ei.field_q != 99) {
          return;
        }
        if (this.field_e < 0) {
          this.field_e = param1;
        }
        this.field_l = false;
        this.field_c = true;
    }

    final boolean b(int param0) {
        int var2 = -101 / ((50 - param0) / 62);
        return this.field_b == 102 ? true : false;
    }

    final boolean c(int param0) {
        if (param0 != 0) {
          return true;
        }
        if (this.field_k != 0) {
          return true;
        }
        if (this.field_b == 84) {
          return true;
        }
        if (this.field_b != 83) {
          return false;
        }
        return true;
    }

    final boolean d(int param0) {
        if (param0 == -97) {
          return this.field_b == 96 ? true : false;
        }
        this.a(2);
        return this.field_b == 96 ? true : false;
    }

    final static void b(byte param0) {
        if (param0 <= -79) {
          hh.field_g = new String[fc.field_d];
          hh.field_g[21] = am.field_a;
          hh.field_g[6] = oh.field_d;
          hh.field_g[4] = dj.field_a;
          hh.field_g[19] = ti.field_q;
          hh.field_g[15] = hj.field_u;
          hh.field_g[20] = en.field_c;
          hh.field_g[11] = sf.field_b;
          hh.field_g[18] = tc.field_v;
          hh.field_g[7] = rb.field_e;
          hh.field_g[5] = bj.field_f;
          hh.field_g[16] = bh.field_i;
          hh.field_g[17] = nf.field_d;
          hh.field_g[9] = hh.field_e;
          hh.field_g[13] = i.field_c;
          return;
        }
    }

    final void a(boolean param0) {
        this.field_b = 0;
        if (param0) {
          this.field_c = false;
          this.field_k = 0;
          if (this.field_d == 0) {
            this.field_b = ei.field_q;
          }
          if (0 == this.field_d &&
            ei.field_q == 98) {
            if (0 >= this.field_e) {
              this.field_e = this.field_m;
            }
            this.field_e = this.field_e - 1;
            this.field_l = false;
            this.field_c = true;
          }
          if (0 != this.field_d) {
            return;
          }
          if (99 != ei.field_q) {
            return;
          }
          this.field_e = this.field_e + 1;
          if (this.field_m <= this.field_e) {
            this.field_e = 0;
          }
          this.field_l = false;
          this.field_c = true;
          return;
        }
        this.a(104, 84);
        this.field_c = false;
        this.field_k = 0;
        if (this.field_d == 0) {
          this.field_b = ei.field_q;
        }
        if (0 != this.field_d) {
          if (0 != this.field_d) {
            return;
          }
          if (99 != ei.field_q) {
            return;
          }
          this.field_e = this.field_e + 1;
          if (this.field_m <= this.field_e) {
            this.field_e = 0;
          }
          this.field_l = false;
          this.field_c = true;
          return;
        }
        if (ei.field_q == 98) {
          if (0 >= this.field_e) {
            this.field_e = this.field_m;
          }
          this.field_e = this.field_e - 1;
          this.field_l = false;
          this.field_c = true;
        }
        if (0 != this.field_d) {
          return;
        }
        if (99 == ei.field_q) {
          this.field_e = this.field_e + 1;
          if (this.field_m <= this.field_e) {
            this.field_e = 0;
          }
          this.field_l = false;
          this.field_c = true;
        }
    }

    final boolean c(byte param0) {
        if (param0 == 51) {
          return this.field_b == 97 ? true : false;
        }
        rm.b((byte) 74);
        return this.field_b == 97 ? true : false;
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_m <= param1) {
          throw new IllegalArgumentException();
        }
        if (param2 >= this.field_m) {
          throw new IllegalArgumentException();
        }
        this.field_c = false;
        this.field_b = 0;
        this.field_k = 0;
        if (lb.field_gc != 0) {
          this.field_d = lb.field_gc;
          this.field_e = param2;
          this.field_k = lb.field_gc;
          this.field_a = tc.field_x;
          this.field_l = true;
        }
        if (this.field_d == 0) {
          if (0 == lb.field_gc) {
            if (nc.field_d != 0) {
              if (param0 <= 123) {
                this.d(-13);
              }
              if (0 == this.field_d) {
                if (!this.field_l &&
                  !ik.field_a) {
                  return;
                }
                if (0 > param1) {
                  if (this.field_l) {
                    this.field_e = -1;
                  }
                } else {
                  if (this.field_e == param1) {
                    this.field_e = param1;
                    this.field_l = true;
                  } else {
                    this.field_c = true;
                    this.field_e = param1;
                    this.field_l = true;
                  }
                }
              }
              return;
            }
            this.field_d = 0;
          }
          if (param0 <= 123) {
            this.d(-13);
            if (0 == this.field_d) {
              if (!this.field_l &&
                !ik.field_a) {
                return;
              }
              if (0 > param1) {
                if (this.field_l) {
                  this.field_e = -1;
                }
              } else {
                if (this.field_e == param1) {
                  this.field_e = param1;
                  this.field_l = true;
                } else {
                  this.field_c = true;
                  this.field_e = param1;
                  this.field_l = true;
                }
              }
            }
            return;
          }
          if (0 != this.field_d) {
            return;
          }
          if (this.field_l) {
            if (0 > param1) {
              if (!this.field_l) {
                return;
              }
              this.field_e = -1;
              return;
            }
            if (this.field_e != param1) {
              this.field_c = true;
            }
            this.field_e = param1;
            this.field_l = true;
            return;
          }
          if (!ik.field_a) {
            return;
          }
          if (0 > param1) {
            if (this.field_l) {
              this.field_e = -1;
            }
          } else {
            if (this.field_e != param1) {
              this.field_c = true;
            }
            this.field_e = param1;
            this.field_l = true;
          }
          return;
        }
        if (0 != nc.field_d) {
          if (this.field_a <= 0) {
            this.field_a = pg.field_B;
          }
          this.field_a = this.field_a - 1;
        }
        if (0 == lb.field_gc) {
          if (nc.field_d != 0) {
            if (param0 > 123) {
              if (0 == this.field_d) {
                if (!this.field_l &&
                  !ik.field_a) {
                  return;
                }
                if (0 > param1) {
                  if (this.field_l) {
                    this.field_e = -1;
                  }
                } else {
                  if (this.field_e == param1) {
                    this.field_e = param1;
                    this.field_l = true;
                  } else {
                    this.field_c = true;
                    this.field_e = param1;
                    this.field_l = true;
                  }
                }
              }
              return;
            }
            this.d(-13);
            if (0 == this.field_d) {
              if (!this.field_l &&
                !ik.field_a) {
                return;
              }
              if (0 > param1) {
                if (this.field_l) {
                  this.field_e = -1;
                }
              } else {
                if (this.field_e == param1) {
                  this.field_e = param1;
                  this.field_l = true;
                } else {
                  this.field_c = true;
                  this.field_e = param1;
                  this.field_l = true;
                }
              }
            }
            return;
          }
          this.field_d = 0;
        }
        if (param0 <= 123) {
          this.d(-13);
          if (0 != this.field_d) {
            return;
          }
          if (!this.field_l &&
            !ik.field_a) {
            return;
          }
        } else {
          if (0 != this.field_d) {
            return;
          }
          if (!this.field_l &&
            !ik.field_a) {
            return;
          }
        }
        if (0 > param1) {
          if (!this.field_l) {
            return;
          }
          this.field_e = -1;
          return;
        }
        if (this.field_e != param1) {
          this.field_c = true;
        }
        this.field_e = param1;
        this.field_l = true;
    }

    final void e(byte param0) {
        this.field_k = 0;
        if (param0 != 22) {
          this.d(51);
          this.field_b = 0;
          this.field_c = false;
          if (this.field_d == 0) {
            this.field_b = ei.field_q;
            return;
          }
          return;
        }
        this.field_b = 0;
        this.field_c = false;
        if (this.field_d != 0) {
          return;
        }
        this.field_b = ei.field_q;
    }

    final boolean a(byte param0) {
        int var2 = 22 % ((param0 + 5) / 55);
        return 103 == this.field_b ? true : false;
    }

    public static void d(byte param0) {
        field_j = null;
        field_h = null;
        if (param0 != -18) {
          return;
        }
        field_i = null;
        field_o = null;
    }

    rm(int param0) {
        this.field_e = 0;
        this.field_l = false;
        this.field_m = param0;
    }

    static {
        int var0 = 0;
        field_p = true;
        field_o = new String[]{"Showing by rating", "Showing by win percentage"};
        field_n = 2048;
        field_i = "Location";
        field_h = new int[129];
        field_h[0] = 0;
        for (var0 = 0; var0 < 64; var0++) {
          field_h[var0 + 1] = 257 * (var0 * 255 / 64);
          field_h[var0 + 65] = 65793 * (var0 * 255 / 64);
        }
    }
}
