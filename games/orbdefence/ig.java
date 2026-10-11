/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends dh implements ai {
    private boolean field_lb;
    private boolean field_kb;
    private rf field_jb;
    static int field_fb;
    static ki field_hb;
    static String field_gb;
    static pk field_ib;

    final boolean d(boolean param0) {
        qj var2 = null;
        qj var2Lifetime1;
        if (param0) {
          field_ib = (pk) null;
          if (!this.field_A) {
            return super.d(false);
          }
          if (this.field_lb) {
            return super.d(false);
          }
          var2 = l.a((byte) -20);
          if (var2 != null) {
            this.a(false, (byte) 126, var2);
            return super.d(false);
          }
          return super.d(false);
        }
        if (!this.field_A) {
          return super.d(false);
        }
        if (this.field_lb) {
          return super.d(false);
        }
        var2Lifetime1 = l.a((byte) -20);
        if (var2Lifetime1 != null) {
          this.a(false, (byte) 126, var2Lifetime1);
          return super.d(false);
        }
        return super.d(false);
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        if (this.field_kb) {
          wj.a(-108, false, true);
          return;
        }
        try {
          int var6_int = -48 % ((-3 - param0) / 62);
          mh.b((byte) -57);
          this.q(4210752);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ig.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void r(int param0) {
        field_ib = null;
        field_gb = null;
        field_hb = null;
        if (param0 != 11285) {
          ig.r(29);
        }
    }

    private final void a(boolean param0, byte param1, qj param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ec var5 = null;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          this.field_lb = true;
          if (param2.field_f) {
            var4 = bd.field_m;
          } else {
            if (param2.field_c != null) {
              var4 = j.field_c;
              if (null != this.field_jb) {
                this.field_jb.a((byte) -8);
              }
            } else {
              var4 = param2.field_e;
              if (param2.field_b == 248) {
                if (param0) {
                  var4 = tb.field_a;
                  this.field_kb = true;
                } else {
                  km.a(16711935);
                  var4 = tb.field_a;
                  this.field_kb = true;
                }
              }
            }
          }
          if (param1 < 115) {
            return;
          }
          var5 = new ec((dh) (this), qc.field_b, var4);
          if (param2.field_f) {
            if (param2.field_d) {
              this.a(false, new ob(this));
              return;
            }
            var5.a(sk.field_C, -34, (ag) (this));
          } else {
            if (this.field_kb) {
              var5.a(sk.field_C, -34, (ag) (this));
            } else {
              if (param2.field_b == 5) {
                var5.a(vc.field_n, 11, -15858);
                var5.a(ld.field_d, 17, -15858);
              } else {
                var5.a(vc.field_i, -1, -15858);
              }
            }
            if (3 != param2.field_b) {
              if (6 == param2.field_b) {
                var5.a(qf.field_k, 9, -15858);
              }
            } else {
              var5.a(vk.field_y, 7, -15858);
            }
          }
          this.a(false, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("ig.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    ig(sk param0, rf param1) {
        super(param0, qc.field_b, bh.field_f, false, false);
        try {
          this.field_jb = param1;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ig.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void f(byte param0) {
        int var2 = -19 % ((-21 - param0) / 42);
        this.a(true, (byte) 122, oe.a(248, tb.field_a, -3));
    }

    static {
        field_gb = "NORMO";
        field_fb = 0;
    }
}
