/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends jj implements m {
    static int field_pb;
    static ih field_rb;
    static String field_qb;
    private vd field_mb;
    private boolean field_lb;
    static String field_nb;
    private boolean field_ob;

    og(vl param0, vd param1) {
        super(param0, p.field_a, sa.field_J, false, false);
        try {
          this.field_mb = param1;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean j(int param0) {
        if (param0 >= -18) {
          return false;
        }
        if (!this.field_E) {
          return super.j(-56);
        }
        if (this.field_ob) {
          return super.j(-56);
        }
        nj var2 = dd.d((byte) 91);
        if (var2 != null) {
          this.a(false, var2, 7);
          return super.j(-56);
        }
        return super.j(-56);
    }

    final static void f(byte param0) {
        fi.field_o = false;
        if (param0 != -83) {
          return;
        }
        ne.field_a.h(16383);
    }

    final void u(int param0) {
        this.a(true, wg.a((byte) -123, 248, pi.field_h), 7);
        int var2 = 58 % ((param0 + 61) / 57);
    }

    private final void a(boolean param0, nj param1, int param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        lc var5 = null;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          this.field_ob = true;
          if (param1.field_e) {
            var4 = tk.field_s;
          } else {
            if (null == param1.field_a) {
              var4 = param1.field_c;
              if (248 == param1.field_b) {
                if (!param0) {
                  db.b(true);
                }
                var4 = pi.field_h;
                this.field_lb = true;
              }
            } else {
              var4 = ga.field_f;
              if (this.field_mb != null) {
                this.field_mb.a((byte) 121);
              }
            }
          }
          var5 = new lc((jj) (this), p.field_a, var4);
          if (param1.field_e) {
            if (param1.field_f) {
              this.b(new ge(this), param2 ^ -118);
              return;
            }
            var5.a(param2 - 21, (tg) (this), hd.field_m);
          } else {
            if (this.field_lb) {
              var5.a(-14, (tg) (this), hd.field_m);
            } else {
              if (param1.field_b == 5) {
                var5.a(-17040, dh.field_r, 11);
                var5.a(-17040, cg.field_b, 17);
              } else {
                var5.a(param2 ^ -17033, ea.field_p, -1);
              }
            }
            if (param1.field_b != 3) {
              if (param1.field_b == 6) {
                var5.a(-17040, md.field_c, 9);
              }
            } else {
              var5.a(-17040, ea.field_y, 7);
            }
          }
          if (param2 != 7) {
            return;
          }
          this.b(var5, param2 - 109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_34_0 = var4_ref;
          stackIn_34_1 = new StringBuilder().append("og.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        if (this.field_lb) {
          nk.a(true, -126, false);
          return;
        }
        try {
          nh.a((byte) 122);
          this.t(20252);
          if (param4 != -27322) {
            this.field_ob = true;
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "og.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void v(int param0) {
        int var1 = -66 / ((21 - param0) / 62);
        field_rb = null;
        field_nb = null;
        field_qb = null;
    }

    static {
        field_qb = "Mine";
        field_nb = "Your email address is used to identify this account";
    }
}
