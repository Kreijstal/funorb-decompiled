/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends ph implements ga {
    private kh field_pb;
    static sb field_sb;
    static String field_qb;
    static hj[] field_rb;
    static ed field_tb;
    private boolean field_ob;
    private boolean field_ub;

    final static int a(byte param0, ma param1, ma param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -49) {
            field_tb = (ed) null;
          }
          var4 = (String) null;
          stackIn_3_0 = bf.a(0, false, (String) null, (byte) 6, param1, param2, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ok.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_sb = null;
        if (param0 != -90) {
          return;
        }
        field_qb = null;
        field_rb = null;
        field_tb = null;
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_ub) {
            ba.a(true, false, 2);
            return;
          }
          ej.f((byte) -80);
          if (param2) {
            this.p(108);
            this.n(-115);
          } else {
            this.n(-115);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("ok.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(boolean param0, ig param1, int param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        kj var5 = null;
        ig var6 = null;
        try {
          if (param2 != 10476) {
            var6 = (ig) null;
            this.a(false, (ig) null, 102);
          }
          this.field_ob = true;
          if (param1.field_f) {
            var4 = qd.field_C;
          } else {
            if (null != param1.field_a) {
              var4 = cf.field_s;
              if (this.field_pb != null) {
                this.field_pb.a(-12920);
              }
            } else {
              var4 = param1.field_d;
              if (param1.field_e == 248) {
                if (!param0) {
                  u.a(true);
                }
                this.field_ub = true;
                var4 = bg.field_d;
              }
            }
          }
          var5 = new kj((ph) (this), tk.field_a, var4);
          if (param1.field_f) {
            if (param1.field_g) {
              this.c(20317, new jj(this));
              return;
            }
            var5.a((byte) 110, (qg) (this), ui.field_s);
          } else {
            if (!this.field_ub) {
              if (param1.field_e == 5) {
                var5.a(hd.field_i, 13759, 11);
                var5.a(bg.field_b, 13759, 17);
              } else {
                var5.a(dk.field_t, 13759, -1);
              }
            } else {
              var5.a((byte) 110, (qg) (this), ui.field_s);
            }
            if (param1.field_e == 3) {
              var5.a(kf.field_u, param2 ^ 7507, 7);
            } else {
              if (6 == param1.field_e) {
                var5.a(dk.field_w, 13759, 9);
              }
            }
          }
          this.c(param2 + 9841, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("ok.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    ok(tc param0, kh param1) {
        super(param0, tk.field_a, ge.field_a, false, false);
        try {
          this.field_pb = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ok.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void p(int param0) {
        if (param0 != 10341) {
          field_tb = (ed) null;
        }
        this.a(true, fb.a(bg.field_d, 248, 0), 10476);
    }

    final boolean g(byte param0) {
        ig var2 = null;
        if (this.field_G &&
          !this.field_ob) {
          var2 = ii.a((byte) -92);
          if (var2 != null) {
            this.a(false, var2, 10476);
          }
        }
        if (param0 != -124) {
          field_rb = (hj[]) null;
        }
        return super.g((byte) -124);
    }

    static {
        int var0 = 0;
        field_rb = new hj[255];
        field_qb = "Names can only contain letters, numbers, spaces and underscores";
        for (var0 = 0; var0 < field_rb.length; var0++) {
          field_rb[var0] = new hj();
        }
    }
}
