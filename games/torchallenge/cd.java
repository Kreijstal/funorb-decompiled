/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private int field_e;
    private int field_A;
    static int field_c;
    private int field_l;
    private int field_z;
    private int field_f;
    private boolean field_k;
    private ud field_t;
    private int field_y;
    private int field_w;
    private int field_g;
    private int field_x;
    private float field_v;
    private int field_u;
    private int field_n;
    static cf field_s;
    private int field_r;
    private int field_q;
    private int field_m;
    private int field_i;
    static int field_b;
    static String field_a;
    static String field_p;
    static int[] field_d;
    static boolean field_h;
    static byte[][] field_j;
    static boolean field_o;

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param0 != -98) {
            cd.a(-79, 125, true, -81, false);
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(var5 - 65 + 97);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var8);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("cd.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4) {
        int stackIn_9_0 = 0;
        int var5;
        int var6;
        int var7;
        var5 = -42 % ((param3 - 70) / 47);
        if (!be.field_b) {
          var7 = ea.field_e;
          if (gh.field_x) {
            var7 = -12 + var7 * 2 + 1;
          }
          ba.field_i.b((byte) 121);
          ba.field_i.a(2, var7);
          be.field_b = true;
        }
        var6 = 0;
        if (!param2) {
          stackIn_9_0 = (!ub.field_i) ? 0 : 1;
          var6 = stackIn_9_0;
          ub.field_i = false;
        }
        ba.field_i.a(true, 18, true, (ka) null, 3, df.field_R, aa.field_g, kc.field_u, ph.field_d);
        md.field_j = null;
        ba.field_i.a(true, 18, true, (ka) null, 6, df.field_R, aa.field_g, kc.field_u, ph.field_d);
        ba.field_i.a(true, 18, true, (ka) null, 2, df.field_R, aa.field_g, kc.field_u, ph.field_d);
        wb.field_p.a(aa.field_g, df.field_R, wb.field_p.field_B, wb.field_p.field_H, wb.field_p.field_o, 0, 2657, wb.field_p.field_u);
        wb.field_p.a((byte) 79, df.field_R, aa.field_g);
        if (param1 != -1) {
          if (ii.field_d) {
            qh.a(param1, true);
            ii.field_d = false;
          }
          of.a(0, 0, (byte) 40, param4, param1);
        }
        if (0 <= param0 &&
          param0 < 256) {
          dg.a(param0, true);
        }
        if (!param2) {
          ub.field_i = var6 != 0;
        }
    }

    final void d(int param0) {
        if (param0 != -1) {
          return;
        }
        this.field_t.a(this.field_r, -77, this.field_y);
    }

    final boolean c(int param0) {
        if (param0 != -1) {
          this.field_q = 84;
          if (this.field_m > ul.field_l) {
            return false;
          }
          if (ee.field_o > 0) {
            return true;
          }
          return false;
        }
        if (this.field_m > ul.field_l) {
          return false;
        }
        if (ee.field_o > 0) {
          return true;
        }
        return false;
    }

    final ad a(byte param0) {
        ad var2 = null;
        this.field_y = sd.field_c;
        this.field_r = fl.field_v;
        this.field_t.a(this.field_A, -77, this.field_u);
        if (param0 < -74) {
          sa.field_c = false;
          var2 = dd.a(0, sh.field_u, 124, this.field_u, 0, this.field_A);
          if (var2 == null) {
            this.d(-1);
          }
          return var2;
        }
        return (ad) null;
    }

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = TorChallenge.field_F ? 1 : 0;
        var2 = this.field_i;
        var3 = this.field_l;
        if (!this.c(-1)) {
          this.field_k = false;
          return;
        }
        if (var3 > this.field_x) {
          var3 = this.field_x;
        } else {
          if (this.field_q <= var3) {
            if (param0 > -80) {
              return;
            }
            if (this.field_z < var2) {
              var2 = this.field_z;
            } else {
              if (this.field_e > var2) {
                var2 = this.field_e;
              }
            }
            if (!(this.field_v > 0.0f)) {
              if (var2 != sd.field_c) {
                this.field_t.a(var3, -77, var2);
              } else {
                if (fl.field_v != var3) {
                  this.field_t.a(var3, -77, var2);
                }
              }
              if (this.field_i > 0) {
                ra.field_g = (-sd.field_c + this.field_i) / 2;
              }
              return;
            }
            var4 = (int)((float)var3 * this.field_v + 0.5f);
            if (var4 > var2) {
              var3 = (int)((float)var2 / this.field_v);
            } else {
              if (var4 < var2) {
                var2 = var4;
              }
            }
            if (var2 != sd.field_c) {
              this.field_t.a(var3, -77, var2);
            } else {
              if (fl.field_v != var3) {
                this.field_t.a(var3, -77, var2);
              }
            }
            if (this.field_i > 0) {
              ra.field_g = (-sd.field_c + this.field_i) / 2;
            }
            return;
          }
          var3 = this.field_q;
        }
        if (param0 > -80) {
          return;
        }
        if (this.field_z < var2) {
          var2 = this.field_z;
        } else {
          if (this.field_e <= var2) {
            if (!(this.field_v > 0.0f)) {
              if (var2 != sd.field_c) {
                this.field_t.a(var3, -77, var2);
              } else {
                if (fl.field_v != var3) {
                  this.field_t.a(var3, -77, var2);
                }
              }
              if (this.field_i > 0) {
                ra.field_g = (-sd.field_c + this.field_i) / 2;
              }
              return;
            }
            var4Lifetime1 = (int)((float)var3 * this.field_v + 0.5f);
            if (var4Lifetime1 > var2) {
              var3 = (int)((float)var2 / this.field_v);
            } else {
              if (var4Lifetime1 < var2) {
                var2 = var4Lifetime1;
                if (var2 != sd.field_c) {
                  this.field_t.a(var3, -77, var2);
                } else {
                  if (fl.field_v != var3) {
                    this.field_t.a(var3, -77, var2);
                  }
                }
                if (this.field_i > 0) {
                  ra.field_g = (-sd.field_c + this.field_i) / 2;
                }
                return;
              }
            }
            if (var2 != sd.field_c) {
              this.field_t.a(var3, -77, var2);
              if (this.field_i > 0) {
                ra.field_g = (-sd.field_c + this.field_i) / 2;
              }
              return;
            }
            if (fl.field_v == var3) {
              if (this.field_i > 0) {
                ra.field_g = (-sd.field_c + this.field_i) / 2;
              }
              return;
            }
            this.field_t.a(var3, -77, var2);
            if (this.field_i <= 0) {
              return;
            }
            ra.field_g = (-sd.field_c + this.field_i) / 2;
            return;
          }
          var2 = this.field_e;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_v > 0.0f) {
          var4Lifetime2 = (int)((float)var3 * this.field_v + 0.5f);
          if (var4Lifetime2 > var2) {
            var3 = (int)((float)var2 / this.field_v);
          } else {
            if (var4Lifetime2 < var2) {
              var2 = var4Lifetime2;
              if (var2 != sd.field_c) {
                this.field_t.a(var3, -77, var2);
                if (this.field_i > 0) {
                  ra.field_g = (-sd.field_c + this.field_i) / 2;
                }
                return;
              }
              if (fl.field_v != var3) {
                this.field_t.a(var3, -77, var2);
              }
              decompiledFrameRemainder0 = false;
            }
          }
        }
        if (decompiledFrameRemainder0) {
          if (var2 != sd.field_c) {
            this.field_t.a(var3, -77, var2);
          } else {
            if (fl.field_v != var3) {
              this.field_t.a(var3, -77, var2);
            }
          }
        }
        if (this.field_i <= 0) {
          return;
        }
        ra.field_g = (-sd.field_c + this.field_i) / 2;
    }

    private cd() throws Throwable {
        throw new Error();
    }

    final void a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        if (gi.field_d != null) {
          return;
        }
        if (ee.field_o > 0) {
          if (this.field_k) {
            fieldTemp$1 = this.field_w - 1;
            this.field_w = this.field_w - 1;
            if (fieldTemp$1 > 0) {
              return;
            }
            this.field_w = this.field_g;
            if (this.field_m > ul.field_l) {
              this.field_k = false;
            } else {
              if (param0 != 2) {
                this.d(-73);
              }
              this.b(param0 - 92);
            }
            return;
          }
          if (this.field_i > sd.field_c) {
            ra.field_g = (this.field_i - sd.field_c) / 2;
          } else {
            if (this.field_i > 0) {
              ra.field_g = 0;
            }
          }
        } else {
          this.field_k = false;
          if (this.field_k) {
            fieldTemp$0 = this.field_w - 1;
            this.field_w = this.field_w - 1;
            if (fieldTemp$0 > 0) {
              return;
            }
            this.field_w = this.field_g;
            if (this.field_m > ul.field_l) {
              this.field_k = false;
            } else {
              if (param0 != 2) {
                this.d(-73);
              }
              this.b(param0 - 92);
            }
            return;
          }
          if (this.field_i > sd.field_c) {
            ra.field_g = (this.field_i - sd.field_c) / 2;
            if (sd.field_c == this.field_f &&
              this.field_n == fl.field_v) {
              return;
            }
            this.field_t.a(this.field_n, -77, this.field_f);
            return;
          }
          if (this.field_i <= 0) {
            if (sd.field_c == this.field_f &&
              this.field_n == fl.field_v) {
              return;
            }
            this.field_t.a(this.field_n, -77, this.field_f);
            return;
          }
          ra.field_g = 0;
        }
        if (sd.field_c != this.field_f) {
          this.field_t.a(this.field_n, -77, this.field_f);
        } else {
          if (this.field_n != fl.field_v) {
            this.field_t.a(this.field_n, -77, this.field_f);
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_i = param0;
        this.field_l = param2;
        int var4 = 74 / ((55 - param1) / 47);
    }

    public static void b(byte param0) {
        field_j = (byte[][]) null;
        field_d = null;
        field_a = null;
        field_s = null;
        field_p = null;
        if (param0 <= 72) {
          cd.b((byte) -52);
        }
    }

    static {
        field_c = 0;
        field_s = new cf();
        field_p = "Achieved";
        field_d = new int[]{10, 50, 250, 1000};
        field_a = "Creating your account";
        field_j = new byte[50][];
        field_o = false;
    }
}
