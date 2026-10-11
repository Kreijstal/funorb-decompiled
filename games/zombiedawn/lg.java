/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    private int field_k;
    private int field_p;
    private int field_l;
    static int field_s;
    private int field_h;
    int field_t;
    private int field_n;
    private wa field_g;
    private int field_b;
    private int field_q;
    static long field_u;
    private float field_d;
    private int field_e;
    int field_i;
    private int field_m;
    static sf[] field_v;
    boolean field_c;
    private int field_a;
    private int field_f;
    static String field_j;
    private int field_r;
    private int field_o;

    final void b(boolean param0) {
        if (param0) {
          this.field_g.a(this.field_q, -8, this.field_e);
          return;
        }
        this.field_p = -74;
        this.field_g.a(this.field_q, -8, this.field_e);
    }

    final boolean c(int param0) {
        int var2 = 23 % ((param0 + 78) / 43);
        if (lo.field_l < this.field_m) {
          return false;
        }
        if (be.field_j > 0) {
          return true;
        }
        return false;
    }

    final void b(int param0, int param1, int param2) {
        if (param2 == -1) {
          this.field_p = param1;
          this.field_o = param0;
          return;
        }
        this.c(-74);
        this.field_p = param1;
        this.field_o = param0;
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        qh var5_ref_qh = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        kd var8 = null;
        kd var9 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = ZombieDawn.field_J;
        try {
          var3 = 8 / ((param1 - 36) / 46);
          for (var2_int = 0; param0 > var2_int; var2_int++) {
            if (sh.field_e != 0) {
              var9 = dj.field_e.a(60, (byte) 125, 930, 140, 960);
              var5 = 20 + hp.field_A.a(true) - so.c(40);
              var6 = hp.field_A.f(237239984) - so.c(60);
              var9.a(dj.field_e.field_H.a(true, var9.a(true), var6, var5, var9.f(237239984)), true);
            } else {
              var8 = dj.field_e.a(20, (byte) 120, 70, 354, 890);
              var5_ref_qh = new qh();
              var5_ref_qh.a(0, new kk(var8.a(true), 450));
              var5_ref_qh.a(0, new kk(384, 206));
              var8.a(var5_ref_qh, true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "lg.A(" + param0 + ',' + param1 + ')');
        }
    }

    lg(wa param0) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, param0);
    }

    public static void a(byte param0) {
        if (param0 != 49) {
          return;
        }
        field_v = null;
        field_j = null;
    }

    final boolean b(int param0) {
        if (param0 != 0) {
          this.b(true);
          if (be.field_j <= 0) {
            return false;
          }
          if (lo.field_l < this.field_m) {
            return true;
          }
          return false;
        }
        if (be.field_j <= 0) {
          return false;
        }
        if (lo.field_l < this.field_m) {
          return true;
        }
        return false;
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = ZombieDawn.field_J;
        var2 = this.field_p;
        var3 = this.field_o;
        if (!this.c(-127)) {
          this.field_c = false;
          return;
        }
        boolean decompiledFrameRemainder1 = true;
        if (var2 > this.field_a) {
          var2 = this.field_a;
        } else {
          if (this.field_k <= var2) {
            boolean decompiledFrameRemainder0 = true;
            if (this.field_h >= var3) {
              if (var3 >= this.field_b) {
                if (this.field_d > 0.0f) {
                  var4 = (int)(this.field_d * (float)var3 + 0.5f);
                  if (var2 < var4) {
                    var3 = (int)((float)var2 / this.field_d);
                  } else {
                    if (var4 < var2) {
                      var2 = var4;
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                var3 = this.field_b;
              }
            } else {
              var3 = this.field_h;
            }
            if ((decompiledFrameRemainder0) &&
              (this.field_d > 0.0f)) {
              var4Lifetime2 = (int)(this.field_d * (float)var3 + 0.5f);
              if (var2 < var4Lifetime2) {
                var3 = (int)((float)var2 / this.field_d);
              } else {
                if (var4Lifetime2 < var2) {
                  var2 = var4Lifetime2;
                }
              }
            }
            decompiledFrameRemainder1 = false;
          }
          else {
            var2 = this.field_k;
          }
        }
        if (decompiledFrameRemainder1) {
          if (this.field_h >= var3) {
            if (var3 < this.field_b) {
              var3 = this.field_b;
            }
          } else {
            var3 = this.field_h;
          }
          if (this.field_d > 0.0f) {
            var4Lifetime1 = (int)(this.field_d * (float)var3 + 0.5f);
            if (var2 < var4Lifetime1) {
              var3 = (int)((float)var2 / this.field_d);
            } else {
              if (var4Lifetime1 < var2) {
                var2 = var4Lifetime1;
              }
            }
          }
        }
        if (te.field_eb != var2) {
          this.field_g.a(var2, 14, var3);
        } else {
          if (kj.field_c != var3) {
            this.field_g.a(var2, 14, var3);
          }
        }
        if (~this.field_p < param0) {
          rg.field_I = (-te.field_eb + this.field_p) / 2;
        }
    }

    final void d(int param0) {
        int fieldTemp$0 = 0;
        if (null != cn.field_b) {
          return;
        }
        if (be.field_j <= 0) {
          this.field_c = false;
        }
        if (this.field_c) {
          fieldTemp$0 = this.field_n - 1;
          this.field_n = this.field_n - 1;
          if (0 < fieldTemp$0) {
            return;
          }
          this.field_n = this.field_l;
          if (lo.field_l < this.field_m) {
            this.field_c = false;
          } else {
            this.a(-1);
            if (param0 <= 13) {
              this.field_k = -32;
            }
          }
          return;
        }
        if (te.field_eb < this.field_p) {
          rg.field_I = (-te.field_eb + this.field_p) / 2;
        } else {
          if (this.field_p > 0) {
            rg.field_I = 0;
          }
        }
        if (this.field_f == te.field_eb &&
          kj.field_c == this.field_r) {
          return;
        }
        this.field_g.a(this.field_f, -125, this.field_r);
    }

    final void a(int param0, int param1, int param2) {
        this.field_t = param1;
        if (param2 < 123) {
          this.a(-55);
          this.field_i = param0;
          return;
        }
        this.field_i = param0;
    }

    final boolean c(int param0, int param1, int param2) {
        int var4 = -71 / ((-63 - param2) / 60);
        if (this.field_k > param1) {
          return false;
        }
        if (this.field_a < param1) {
          return false;
        }
        if (param0 < this.field_b) {
          return false;
        }
        if (this.field_h < param0) {
          return false;
        }
        if (0.0f == this.field_d) {
          return true;
        }
        if (Math.round((float)param0 * this.field_d) != param1) {
          return false;
        }
        return true;
    }

    final la a(boolean param0) {
        la var2 = null;
        this.field_e = kj.field_c;
        this.field_q = te.field_eb;
        if (param0) {
          this.field_g.a(this.field_t, 64, this.field_i);
          rl.field_f = false;
          var2 = nf.a(this.field_i, this.field_t, vh.field_a, 0, !param0 ? true : false, 0);
          if (var2 == null) {
            this.b(true);
          }
          return var2;
        }
        return (la) null;
    }

    private lg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, wa param8) {
        try {
          this.field_g = param8;
          this.field_a = param2;
          this.field_m = param6;
          this.field_d = 0.0f;
          this.field_c = false;
          this.field_h = param3;
          this.field_f = param4;
          this.field_l = param7;
          this.field_i = 480;
          this.field_k = param0;
          this.field_r = param5;
          this.field_t = 640;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "lg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = 20;
        field_j = "Account created successfully!";
    }
}
