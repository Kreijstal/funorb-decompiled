/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends pk {
    private int field_r;
    private boolean field_s;
    private boolean field_n;
    private km field_o;
    static long field_t;
    private km field_v;
    private lh field_x;
    private int field_q;
    private boolean field_p;
    km field_m;
    private int field_u;
    private String field_w;
    static int field_y;

    private final boolean c(byte param0) {
        int var2 = 69 / ((-53 - param0) / 44);
        if (!this.a((byte) -9)) {
          return false;
        }
        if (wh.field_f != 1) {
          return false;
        }
        if (this.field_p) {
          return true;
        }
        if (this.field_n) {
          return false;
        }
        return true;
    }

    final void a(boolean param0) {
        int var3;
        var3 = Chess.field_G;
        if (this.field_q == wk.field_b) {
          this.field_o.b(this.field_i, this.field_k);
        } else {
          if (uc.field_a != this.field_q) {
            this.field_m.b(this.field_i, this.field_k);
          } else {
            if (this.field_v == null) {
              this.field_m.b(this.field_i, this.field_k);
            } else {
              this.field_v.b(this.field_i, this.field_k);
            }
          }
        }
        if (this.field_x != null) {
          this.field_x.b(this.field_w, this.field_i + this.field_m.field_v / 2, this.field_m.field_u / 2 + (this.field_k + this.field_x.field_C / 2), this.field_r, this.field_u);
        }
        if (param0) {
          return;
        }
        ta.b(85);
    }

    final void a(int param0) {
        int var2 = 80 / ((param0 - 24) / 51);
        this.d((byte) 19);
        this.field_n = wh.field_f == 1 ? true : false;
    }

    private final void d(byte param0) {
        boolean stackIn_8_1 = false;
        boolean stackIn_36_1 = false;
        boolean stackIn_55_1 = false;
        boolean stackIn_72_1 = false;
        int var3;
        var3 = Chess.field_G;
        if (this.field_d) {
          this.field_q = wk.field_b;
          if (!this.field_s) {
            if (!this.c((byte) -126)) {
              this.field_d = false;
            } else {
              this.field_d = true;
            }
          } else {
            if (this.c((byte) 121)) {
              stackIn_55_1 = !(this.field_d);
              this.field_d = stackIn_55_1;
            }
          }
        } else {
          boolean decompiledFrameRemainder0 = true;
          if (!this.a((byte) -9)) {
            this.field_q = fj.field_c;
            if (!this.field_s) {
              if (!this.c((byte) -126)) {
                this.field_d = false;
              } else {
                this.field_d = true;
              }
            } else {
              if (this.c((byte) 121)) {
                stackIn_36_1 = !(this.field_d);
                this.field_d = stackIn_36_1;
              }
            }
          } else {
            if (wh.field_f == 1) {
              this.field_q = wk.field_b;
              if (!this.field_s) {
                if (!this.c((byte) -126)) {
                  this.field_d = false;
                } else {
                  this.field_d = true;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (this.c((byte) 121)) {
                  stackIn_8_1 = !(this.field_d);
                  this.field_d = stackIn_8_1;
                }
                if (param0 <= 11) {
                  this.a(false);
                }
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              this.field_q = uc.field_a;
              if (!this.field_s) {
                if (!this.c((byte) -126)) {
                  this.field_d = false;
                } else {
                  this.field_d = true;
                }
              } else {
                if (this.c((byte) 121)) {
                  stackIn_72_1 = !(this.field_d);
                  this.field_d = stackIn_72_1;
                }
              }
            }
          }
        }
        if (param0 > 11) {
          return;
        }
        this.a(false);
    }

    final boolean a(byte param0) {
        if (param0 == -9) {
          return this.field_m.c(this.field_i, this.field_k, hn.field_k, rf.field_b);
        }
        this.field_v = (km) null;
        return this.field_m.c(this.field_i, this.field_k, hn.field_k, rf.field_b);
    }

    final static void a(r param0, int param1) {
        r var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          param0.c(-2193);
          if (param1 >= -73) {
            ta.b(29);
          }
          var2 = (r) (bb.field_d.g(-18110));
          while (var2 != null) {
            if (var2.a(param0, -343)) {
              var2 = (r) (bb.field_d.a((byte) -121));
              continue;
            }
            break;
          }
          if (var2 == null) {
            bb.field_d.a((o) (param0), (byte) -43);
            return;
          }
          he.a(param0, var2, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("ta.J(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    ta(int param0, int param1, km param2, km param3, km param4, boolean param5, boolean param6) {
        this.field_n = false;
        this.field_r = 1;
        this.field_s = false;
        this.field_p = false;
        this.field_u = -1;
        try {
          this.field_p = param6 ? true : false;
          this.field_m = param2;
          this.field_i = param0;
          this.field_s = param5 ? true : false;
          this.field_v = param4;
          this.field_k = param1;
          this.field_o = param3;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ta.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(int param0) {
        qh.field_c.field_g = param0;
        qh.field_c.field_c = 0;
    }

    static {
        field_y = 0;
    }
}
