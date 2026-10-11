/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends ck implements oi {
    private boolean field_lb;
    private mj field_nb;
    static String field_ob;
    static int field_pb;
    private boolean field_mb;

    final void p(int param0) {
        this.a(fb.a(248, true, ki.field_r), -8895, true);
        if (param0 < 77) {
          this.field_nb = (mj) null;
        }
    }

    jg(ei param0, mj param1) {
        super(param0, s.field_c, vj.field_b, false, false);
        try {
          this.field_nb = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(pf param0, pf param1, byte param2) {
        try {
          vf.field_E = param0;
          if (param2 != 118) {
            field_ob = (String) null;
          }
          nh.field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "jg.WB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        if (this.field_lb) {
          th.a(false, true, 4);
          return;
        }
        if (param3) {
          return;
        }
        try {
          ai.a((byte) 98);
          this.o(3);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "jg.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(ml param0, int param1, boolean param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        vf var5 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        try {
          if (param1 != -8895) {
            return;
          }
          this.field_mb = true;
          if (!param0.field_f) {
            if (null == param0.field_d) {
              var4 = param0.field_e;
              if (248 == param0.field_g) {
                if (!param2) {
                  di.a(1);
                }
                this.field_lb = true;
                var4 = ki.field_r;
              }
            } else {
              var4 = jb.field_p;
              if (this.field_nb != null) {
                this.field_nb.a(param1 ^ 8915);
              }
            }
          } else {
            var4 = mb.field_a;
          }
          var5 = new vf((ck) (this), s.field_c, var4);
          if (!param0.field_f) {
            if (!this.field_lb) {
              if (5 == param0.field_g) {
                var5.a(param1 - 22910, 11, gj.field_s);
                var5.a(-31805, 17, wc.field_z);
              } else {
                var5.a(-31805, -1, bk.field_e);
              }
            } else {
              var5.a((lf) (this), tc.field_q, (byte) 118);
            }
            if (param0.field_g == 3) {
              var5.a(-31805, 7, gh.field_a);
            } else {
              if (6 == param0.field_g) {
                var5.a(-31805, 9, a.field_d);
              }
            }
          } else {
            if (param0.field_a) {
              this.b(new sj(this), param1 ^ -30938);
              return;
            }
            var5.a((lf) (this), tc.field_q, (byte) -125);
          }
          this.b(var5, 23143);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("jg.VB(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean d(boolean param0) {
        ml var2;
        if (!this.field_G) {
          if (param0) {
            return super.d(true);
          }
          jg.i((byte) -113);
          return super.d(true);
        }
        if (this.field_mb) {
          if (param0) {
            return super.d(true);
          }
          jg.i((byte) -113);
          return super.d(true);
        }
        var2 = mj.i(0);
        if (var2 != null) {
          this.a(var2, -8895, false);
        }
        if (param0) {
          return super.d(true);
        }
        jg.i((byte) -113);
        return super.d(true);
    }

    public static void e(boolean param0) {
        if (!param0) {
          return;
        }
        field_ob = null;
    }

    final static int i(byte param0) {
        if (param0 != 113) {
          jg.e(true);
          return u.field_k;
        }
        return u.field_k;
    }

    static {
        field_ob = "Achieved";
    }
}
