/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends ci implements ka {
    private boolean field_tb;
    private rf field_vb;
    private boolean field_wb;
    static da field_ub;

    jk(i param0, rf param1) {
        super(param0, uc.field_g, rc.field_p, false, false);
        try {
          this.field_vb = param1;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "jk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(int param0) {
        field_ub = null;
        if (param0 != 6) {
          field_ub = (da) null;
        }
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        if (this.field_wb) {
          hl.a(true, 24574, false);
          return;
        }
        try {
          ua.a((byte) -110);
          this.f(param4);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "jk.I(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, byte param1, wg param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        lj var5 = null;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          this.field_tb = true;
          if (param2.field_c) {
            var4 = lk.field_d;
          } else {
            if (null == param2.field_a) {
              var4 = param2.field_d;
              if (param2.field_b == 248) {
                if (!param0) {
                  pk.i(918092705);
                }
                this.field_wb = true;
                var4 = ce.field_a;
              }
            } else {
              var4 = pc.field_d;
              if (null != this.field_vb) {
                this.field_vb.a((byte) 22);
              }
            }
          }
          var5 = new lj((ci) (this), uc.field_g, var4);
          if (!param2.field_c) {
            if (this.field_wb) {
              var5.a(0, dd.field_a, (dg) (this));
            } else {
              if (param2.field_b == 5) {
                var5.a(11, cl.field_k, 1);
                var5.a(17, ph.field_e, 1);
              } else {
                var5.a(-1, u.field_e, 1);
              }
            }
            if (3 != param2.field_b) {
              if (6 == param2.field_b) {
                var5.a(9, ik.field_d, 1);
              }
            } else {
              var5.a(7, qd.field_a, 1);
            }
          } else {
            if (param2.field_f) {
              this.c(-3399, new qe(this));
              return;
            }
            var5.a(0, dd.field_a, (dg) (this));
          }
          this.c(-3399, var5);
          if (param1 > 19) {
            return;
          }
          this.field_tb = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("jk.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void h(byte param0) {
        this.a(true, (byte) 58, mh.a(248, true, ce.field_a));
        if (param0 != -63) {
          this.field_wb = false;
        }
    }

    final boolean h(int param0) {
        wg var2 = null;
        wg var2Lifetime1;
        if (param0 != 1784) {
          this.field_vb = (rf) null;
          if (!this.field_J) {
            return super.h(1784);
          }
          if (this.field_tb) {
            return super.h(1784);
          }
          var2 = r.b(83);
          if (var2 != null) {
            this.a(false, (byte) 97, var2);
            return super.h(1784);
          }
          return super.h(1784);
        }
        if (!this.field_J) {
          return super.h(1784);
        }
        if (this.field_tb) {
          return super.h(1784);
        }
        var2Lifetime1 = r.b(83);
        if (var2Lifetime1 != null) {
          this.a(false, (byte) 97, var2Lifetime1);
          return super.h(1784);
        }
        return super.h(1784);
    }

    final static int i(byte param0) {
        if (param0 < 112) {
          field_ub = (da) null;
          return ak.field_a;
        }
        return ak.field_a;
    }

    static {
    }
}
