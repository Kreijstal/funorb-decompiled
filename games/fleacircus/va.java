/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    private int field_e;
    static boolean field_m;
    private boolean field_r;
    private int field_h;
    private int field_d;
    private int field_x;
    private int field_q;
    private int field_i;
    static dd field_g;
    private int field_l;
    static String field_k;
    static int field_u;
    private int field_a;
    static String field_s;
    private int field_b;
    private int field_n;
    static int[] field_t;
    private int field_w;
    private int field_c;
    private int field_j;
    private int field_f;
    private int field_o;
    private le field_p;
    private float field_v;

    final void a(int param0) {
        this.field_p.a(this.field_b, -1062, this.field_c);
        if (param0 > -113) {
          field_m = true;
        }
    }

    private final void d(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = fleas.field_A ? 1 : 0;
        var2 = this.field_o;
        var3 = this.field_l;
        if (!this.c((byte) -114)) {
          this.field_r = false;
          return;
        }
        if (var2 <= this.field_w) {
          if (var2 < this.field_e) {
            var2 = this.field_e;
          }
        } else {
          var2 = this.field_w;
        }
        if (var3 <= this.field_q) {
          if (this.field_a <= var3) {
            if (!(this.field_v > 0.0f)) {
              if (var2 != ki.field_a) {
                this.field_p.a(var3, param0 - 1001, var2);
              } else {
                if (gm.field_nb != var3) {
                  this.field_p.a(var3, param0 - 1001, var2);
                }
              }
              if (this.field_o > 0) {
                field_u = (-ki.field_a + this.field_o) / 2;
              }
              if (param0 != -61) {
                this.field_q = 84;
              }
              return;
            }
            var4 = (int)((float)var3 * this.field_v + 0.5f);
            if (var4 > var2) {
              var3 = (int)((float)var2 / this.field_v);
              if (var2 != ki.field_a) {
                this.field_p.a(var3, param0 - 1001, var2);
              } else {
                if (gm.field_nb != var3) {
                  this.field_p.a(var3, param0 - 1001, var2);
                }
              }
            } else {
              if (var2 <= var4) {
                if (var2 != ki.field_a ||
                  gm.field_nb != var3) {
                  this.field_p.a(var3, param0 - 1001, var2);
                }
              } else {
                var2 = var4;
                if (var2 != ki.field_a) {
                  this.field_p.a(var3, param0 - 1001, var2);
                } else {
                  if (gm.field_nb != var3) {
                    this.field_p.a(var3, param0 - 1001, var2);
                  }
                }
              }
            }
            if (this.field_o > 0) {
              field_u = (-ki.field_a + this.field_o) / 2;
            }
            if (param0 == -61) {
              return;
            }
            this.field_q = 84;
            return;
          }
          var3 = this.field_a;
        } else {
          var3 = this.field_q;
        }
        if (this.field_v > 0.0f) {
          var4Lifetime1 = (int)((float)var3 * this.field_v + 0.5f);
          if (var4Lifetime1 > var2) {
            var3 = (int)((float)var2 / this.field_v);
          } else {
            if (var2 > var4Lifetime1) {
              var2 = var4Lifetime1;
            }
          }
        }
        if (var2 != ki.field_a) {
          this.field_p.a(var3, param0 - 1001, var2);
        } else {
          if (gm.field_nb != var3) {
            this.field_p.a(var3, param0 - 1001, var2);
          }
        }
        if (this.field_o > 0) {
          field_u = (-ki.field_a + this.field_o) / 2;
        }
        if (param0 == -61) {
          return;
        }
        this.field_q = 84;
    }

    final vb b(int param0) {
        vb var2 = null;
        vb var2Lifetime1;
        this.field_c = ki.field_a;
        this.field_b = gm.field_nb;
        this.field_p.a(this.field_h, param0 + 6874, this.field_f);
        if (param0 != -7936) {
          this.field_n = -70;
          h.field_h = false;
          var2 = wf.a(0, this.field_f, 0, fg.field_q, 0, this.field_h);
          if (var2 == null) {
            this.a(-121);
            return var2;
          }
          return var2;
        }
        h.field_h = false;
        var2Lifetime1 = wf.a(0, this.field_f, 0, fg.field_q, 0, this.field_h);
        if (var2Lifetime1 != null) {
          return var2Lifetime1;
        }
        this.a(-121);
        return var2Lifetime1;
    }

    final void a(byte param0) {
        int fieldTemp$0 = 0;
        int var2;
        if (null != rh.field_p) {
          return;
        }
        if (wc.field_q <= 0) {
          this.field_r = false;
        }
        if (this.field_r) {
          fieldTemp$0 = this.field_n - 1;
          this.field_n = this.field_n - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.field_n = this.field_d;
          if (this.field_j > kf.field_k) {
            this.field_r = false;
            return;
          }
          this.d((byte) -61);
          var2 = -56 / ((param0 - 24) / 47);
          return;
        }
        if (ki.field_a < this.field_o) {
          field_u = (-ki.field_a + this.field_o) / 2;
        } else {
          if (this.field_o > 0) {
            field_u = 0;
          }
        }
        if (ki.field_a == this.field_x &&
          this.field_i == gm.field_nb) {
          return;
        }
        this.field_p.a(this.field_i, -1062, this.field_x);
    }

    final static bh a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int[] param7, int param8) {
        bh var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        bh stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = -124 % ((param5 - 37) / 55);
          var9 = new bh(param1, param3, param4, param2, param0, param8, param7);
          wi.field_j.a(false, var9);
          s.a(-4471, param6, var9);
          stackIn_1_0 = var9;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_4_0 = var9_ref;
          stackIn_4_1 = new StringBuilder().append("va.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param8).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_o = param0;
        if (param1 != 0) {
          this.field_d = -117;
          this.field_l = param2;
          return;
        }
        this.field_l = param2;
    }

    final boolean c(byte param0) {
        int var2 = -30 / ((-74 - param0) / 38);
        if (kf.field_k < this.field_j) {
          return false;
        }
        if (wc.field_q > 0) {
          return true;
        }
        return false;
    }

    public static void b(byte param0) {
        field_t = null;
        field_k = null;
        field_g = null;
        field_s = null;
        if (param0 != 126) {
          int[] var2 = (int[]) null;
          va.a(-115, -85, -112, -17, 89, (byte) -77, -98, (int[]) null, 75);
        }
    }

    private va() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "Type your age in years";
        field_s = "Rescued: <%0>/<%1>";
        field_t = new int[40];
        field_u = 0;
    }
}
