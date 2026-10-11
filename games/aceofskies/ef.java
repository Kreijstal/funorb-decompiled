/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    private int field_d;
    private int field_n;
    private int field_f;
    private boolean field_b;
    static gu field_k;
    private int field_v;
    private dj field_l;
    private int field_a;
    private int field_c;
    private int field_p;
    private int field_j;
    static String field_i;
    private int field_t;
    private int field_h;
    private int field_s;
    static String field_g;
    private int field_o;
    private float field_q;
    private int field_u;
    private int field_r;
    private int field_e;
    static int field_m;

    public static void a(int param0) {
        if (param0 == 0) {
          field_k = null;
          field_g = null;
          field_i = null;
          return;
        }
        ef.a(-0.783437192440033f, -0.508948802947998f, 119, 0.7036879658699036f, 56);
        field_k = null;
        field_g = null;
        field_i = null;
    }

    final static void a(byte param0, rk param1, gk param2) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          rj.field_b = param2;
          bl.field_g = "";
          if (param0 <= 93) {
            field_k = (gu) null;
          }
          bm.field_I = param1;
          if (!rr.field_b.startsWith("win")) {
            if (rr.field_b.startsWith("linux")) {
              bl.field_g = bl.field_g + "linux/";
            } else {
              if (rr.field_b.startsWith("mac")) {
                bl.field_g = bl.field_g + "macos/";
              }
            }
          } else {
            bl.field_g = bl.field_g + "windows/";
          }
          if (bm.field_I.field_p) {
            bl.field_g = bl.field_g + "msjava/";
          } else {
            if (!rr.field_a.startsWith("amd64") &&
              !rr.field_a.startsWith("x86_64")) {
              if (!rr.field_a.startsWith("i386") &&
                !rr.field_a.startsWith("i486") &&
                !rr.field_a.startsWith("i586") &&
                !rr.field_a.startsWith("x86")) {
                if (!rr.field_a.startsWith("ppc")) {
                  bl.field_g = bl.field_g + "universal/";
                  return;
                }
                bl.field_g = bl.field_g + "ppc/";
                return;
              }
              bl.field_g = bl.field_g + "x86/";
              return;
            }
            bl.field_g = bl.field_g + "x86_64/";
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("ef.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (param0 > -115) {
          return;
        }
        var2 = this.field_e;
        var3 = this.field_p;
        if (!this.a(false)) {
          this.field_b = false;
          return;
        }
        if (this.field_a >= var3) {
          if (this.field_o > var3) {
            var3 = this.field_o;
          }
        } else {
          var3 = this.field_a;
        }
        if (this.field_d < var2) {
          var2 = this.field_d;
          if (0.0f < this.field_q) {
            var4 = (int)(this.field_q * (float)var3 + 0.5f);
            if (var2 < var4) {
              var3 = (int)((float)var2 / this.field_q);
            } else {
              if (var4 < var2) {
                var2 = var4;
                if (td.field_b != var2) {
                  this.field_l.a(var3, false, var2);
                  if (this.field_e > 0) {
                    ci.field_g = (-td.field_b + this.field_e) / 2;
                  }
                  return;
                }
                if (var3 != ps.field_h) {
                  this.field_l.a(var3, false, var2);
                }
                if (this.field_e <= 0) {
                  return;
                }
                ci.field_g = (-td.field_b + this.field_e) / 2;
                return;
              }
            }
          }
        } else {
          if (var2 >= this.field_v) {
            if (0.0f < this.field_q) {
              var4 = (int)(this.field_q * (float)var3 + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / this.field_q);
              } else {
                if (var4 < var2) {
                  var2 = var4;
                }
              }
            }
            if (td.field_b != var2) {
              this.field_l.a(var3, false, var2);
            } else {
              if (var3 != ps.field_h) {
                this.field_l.a(var3, false, var2);
              }
            }
            if (this.field_e > 0) {
              ci.field_g = (-td.field_b + this.field_e) / 2;
            }
            return;
          }
          var2 = this.field_v;
          if (0.0f < this.field_q) {
            var4 = (int)(this.field_q * (float)var3 + 0.5f);
            if (var2 < var4) {
              var3 = (int)((float)var2 / this.field_q);
            } else {
              if (var4 < var2) {
                var2 = var4;
              }
            }
          }
        }
        if (td.field_b != var2) {
          this.field_l.a(var3, false, var2);
        } else {
          if (var3 != ps.field_h) {
            this.field_l.a(var3, false, var2);
          }
        }
        if (this.field_e <= 0) {
          return;
        }
        ci.field_g = (-td.field_b + this.field_e) / 2;
        return;
    }

    final hj b(byte param0) {
        hj var2 = null;
        hj var2Lifetime1;
        this.field_n = ps.field_h;
        this.field_r = td.field_b;
        this.field_l.a(this.field_u, false, this.field_c);
        if (param0 == -111) {
          or.field_c = false;
          var2 = uj.a(pt.field_b, 0, this.field_c, 0, 0, this.field_u);
          if (var2 == null) {
            this.c(1);
          }
          return var2;
        }
        this.field_p = -7;
        or.field_c = false;
        var2Lifetime1 = uj.a(pt.field_b, 0, this.field_c, 0, 0, this.field_u);
        if (var2Lifetime1 == null) {
          this.c(1);
        }
        return var2Lifetime1;
    }

    final static float a(float param0, float param1, int param2, float param3, int param4) {
        float[] var6 = null;
        float[] var5 = null;
        float[] var6Lifetime1;
        float[] var5Lifetime1;
        if (param2 < -30) {
          var6 = uj.field_a[param4];
          var5 = var6;
          return var6[1] * param3 + var6[0] * param0 + var6[2] * param1;
        }
        field_k = (gu) null;
        var6Lifetime1 = uj.field_a[param4];
        var5Lifetime1 = var6Lifetime1;
        return var6Lifetime1[1] * param3 + var6Lifetime1[0] * param0 + var6Lifetime1[2] * param1;
    }

    final void c(int param0) {
        if (param0 == 1) {
          this.field_l.a(this.field_n, false, this.field_r);
          return;
        }
        this.a((byte) -112);
        this.field_l.a(this.field_n, false, this.field_r);
    }

    final void a(int param0, int param1, int param2) {
        this.field_p = param2;
        this.field_e = param1;
        if (param0 != 0) {
          this.a(-48, -58, -98);
        }
    }

    final static void a(int param0, mg param1, mg param2, int param3, int param4, int param5) {
        try {
          if (param0 < 15) {
            field_g = (String) null;
          }
          as.field_c = param3;
          ej.field_a = param2;
          pp.field_a = param5;
          u.field_g = param1;
          ud.field_g = param4;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ef.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
          this.field_u = -43;
          if (this.field_s > ki.field_g) {
            return false;
          }
          if (qr.field_a > 0) {
            return true;
          }
          return false;
        }
        if (this.field_s > ki.field_g) {
          return false;
        }
        if (qr.field_a > 0) {
          return true;
        }
        return false;
    }

    final void b(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (jf.field_a != null) {
          return;
        }
        if (param0 >= 38) {
          if (qr.field_a <= 0) {
            this.field_b = false;
            if (this.field_b) {
              fieldTemp$3 = this.field_j - 1;
              this.field_j = this.field_j - 1;
              if (0 < fieldTemp$3) {
                return;
              }
              this.field_j = this.field_f;
              if (ki.field_g < this.field_s) {
                this.field_b = false;
              } else {
                this.a((byte) -122);
              }
              return;
            }
            if (this.field_e > td.field_b) {
              ci.field_g = (this.field_e - td.field_b) / 2;
            } else {
              if (0 < this.field_e) {
                ci.field_g = 0;
              }
            }
          } else {
            if (this.field_b) {
              fieldTemp$2 = this.field_j - 1;
              this.field_j = this.field_j - 1;
              if (0 < fieldTemp$2) {
                return;
              }
              this.field_j = this.field_f;
              if (ki.field_g < this.field_s) {
                this.field_b = false;
              } else {
                this.a((byte) -122);
              }
              return;
            }
            if (this.field_e > td.field_b) {
              ci.field_g = (this.field_e - td.field_b) / 2;
            } else {
              if (0 >= this.field_e) {
                if (this.field_t == td.field_b &&
                  this.field_h == ps.field_h) {
                  return;
                }
                this.field_l.a(this.field_h, false, this.field_t);
                return;
              }
              ci.field_g = 0;
            }
          }
        } else {
          ef.a(0.5743587017059326f, 1.6069247722625732f, 74, -0.5514667630195618f, -105);
          if (qr.field_a > 0) {
            if (this.field_b) {
              fieldTemp$0 = this.field_j - 1;
              this.field_j = this.field_j - 1;
              if (0 < fieldTemp$0) {
                return;
              }
              this.field_j = this.field_f;
              if (ki.field_g < this.field_s) {
                this.field_b = false;
              } else {
                this.a((byte) -122);
              }
              return;
            }
            if (this.field_e > td.field_b) {
              ci.field_g = (this.field_e - td.field_b) / 2;
            } else {
              if (0 < this.field_e) {
                ci.field_g = 0;
              }
            }
            if (this.field_t == td.field_b &&
              this.field_h == ps.field_h) {
              return;
            }
            this.field_l.a(this.field_h, false, this.field_t);
            return;
          }
          this.field_b = false;
          if (this.field_b) {
            fieldTemp$1 = this.field_j - 1;
            this.field_j = this.field_j - 1;
            if (0 < fieldTemp$1) {
              return;
            }
            this.field_j = this.field_f;
            if (ki.field_g < this.field_s) {
              this.field_b = false;
            } else {
              this.a((byte) -122);
            }
            return;
          }
          if (this.field_e > td.field_b) {
            ci.field_g = (this.field_e - td.field_b) / 2;
          } else {
            if (0 < this.field_e) {
              ci.field_g = 0;
            }
          }
        }
        if (this.field_t != td.field_b) {
          this.field_l.a(this.field_h, false, this.field_t);
        } else {
          if (this.field_h != ps.field_h) {
            this.field_l.a(this.field_h, false, this.field_t);
          }
        }
    }

    private ef() throws Throwable {
        throw new Error();
    }

    static {
        field_i = "Menu";
        field_g = "Achievements are awarded in classic mode only";
        field_k = new gu("email");
        field_m = 0;
    }
}
