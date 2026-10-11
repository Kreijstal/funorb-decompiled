/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    private int field_r;
    private int field_m;
    static int field_q;
    private int field_k;
    private int field_j;
    private int field_h;
    private int field_n;
    private int field_o;
    private int field_d;
    static bi field_t;
    private int field_i;
    private int field_f;
    private int field_p;
    private int field_g;
    static boolean field_u;
    private int field_c;
    private int field_l;
    private bn field_s;
    private int field_e;
    static qr field_a;
    private float field_v;
    private boolean field_b;

    final boolean b(int param0) {
        if (param0 != -1) {
          this.a(-62);
          if (re.field_a < this.field_p) {
            return false;
          }
          if (es.field_m > 0) {
            return true;
          }
          return false;
        }
        if (re.field_a < this.field_p) {
          return false;
        }
        if (es.field_m > 0) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1) {
        sl var2 = js.field_f;
        var2.h(param0, 255);
        var2.c(param1, (byte) -69);
        var2.c(0, (byte) -119);
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = this.field_c;
        var3 = this.field_l;
        if (!this.b(-1)) {
          this.field_b = false;
          return;
        }
        if (var2 > this.field_d) {
          var2 = this.field_d;
          if (var3 > this.field_j) {
            var3 = this.field_j;
          } else {
            if (var3 < this.field_r) {
              var3 = this.field_r;
            }
          }
          if (param0 < 35) {
            this.field_j = 102;
          }
          if (0.0f < this.field_v) {
            var4 = (int)(0.5f + this.field_v * (float)var3);
            if (var4 > var2) {
              var3 = (int)((float)var2 / this.field_v);
            } else {
              if (var2 > var4) {
                var2 = var4;
              }
            }
          }
        } else {
          if (this.field_f > var2) {
            var2 = this.field_f;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var3 > this.field_j) {
            var3 = this.field_j;
          } else {
            if (var3 < this.field_r) {
              var3 = this.field_r;
              if (param0 < 35) {
                this.field_j = 102;
              }
              if (0.0f < this.field_v) {
                var4 = (int)(0.5f + this.field_v * (float)var3);
                if (var4 > var2) {
                  var3 = (int)((float)var2 / this.field_v);
                } else {
                  if (var2 > var4) {
                    var2 = var4;
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            if (param0 < 35) {
              this.field_j = 102;
            }
            if (0.0f < this.field_v) {
              var4 = (int)(0.5f + this.field_v * (float)var3);
              if (var4 > var2) {
                var3 = (int)((float)var2 / this.field_v);
              } else {
                if (var2 > var4) {
                  var2 = var4;
                }
              }
            }
          }
        }
        if (me.field_e != var2) {
          this.field_s.a(var3, var2, -12725);
        } else {
          if (nn.field_b != var3) {
            this.field_s.a(var3, var2, -12725);
          }
        }
        if (this.field_c > 0) {
          gs.field_k = (-me.field_e + this.field_c) / 2;
        }
    }

    final static boolean a(int param0, int param1, int[] param2, bh param3, int param4) {
        RuntimeException var5 = null;
        bh var6 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3.a(16548, param1, param4)) {
            return false;
          }
          if (param0 != 0) {
            var6 = (bh) null;
            cp.a(-93, -33, (int[]) null, (bh) null, 124);
          }
          stackIn_7_0 = aj.a(1, param4, param1, param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("cp.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          field_a = (qr) null;
          field_t = null;
          field_a = null;
          return;
        }
        field_t = null;
        field_a = null;
    }

    final void a(boolean param0) {
        int fieldTemp$0 = 0;
        if (bj.field_K != null) {
          return;
        }
        if (es.field_m <= 0) {
          this.field_b = false;
        }
        if (this.field_b) {
          fieldTemp$0 = this.field_i - 1;
          this.field_i = this.field_i - 1;
          if (0 < fieldTemp$0) {
            return;
          }
          this.field_i = this.field_m;
          if (this.field_p > re.field_a) {
            this.field_b = false;
          } else {
            this.a((byte) 45);
            if (!param0) {
              this.field_j = 87;
            }
          }
          return;
        }
        if (this.field_c > me.field_e) {
          gs.field_k = (this.field_c - me.field_e) / 2;
        } else {
          if (0 < this.field_c) {
            gs.field_k = 0;
          }
        }
        if (me.field_e == this.field_e &&
          nn.field_b == this.field_h) {
          return;
        }
        this.field_s.a(this.field_h, this.field_e, -12725);
    }

    final eb a(int param0) {
        this.field_o = nn.field_b;
        this.field_n = me.field_e;
        this.field_s.a(this.field_g, this.field_k, param0 ^ -12725);
        pf.field_c = false;
        eb var2 = si.a(this.field_k, fa.field_W, 0, (byte) 125, param0, this.field_g);
        if (var2 == null) {
          this.c(param0 ^ -115);
        }
        return var2;
    }

    final void c(int param0) {
        this.field_s.a(this.field_o, this.field_n, -12725);
        int var2 = -2 % ((param0 + 68) / 46);
    }

    final void a(int param0, int param1, int param2) {
        this.field_l = param1;
        int var4 = -89 / ((param2 - 64) / 62);
        this.field_c = param0;
    }

    private cp() throws Throwable {
        throw new Error();
    }

    static {
        field_q = 0;
        field_u = true;
    }
}
