/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ns extends il implements bp {
    static boolean field_pb;
    static np field_nb;
    private boolean field_vb;
    private md field_yb;
    static String field_qb;
    private boolean field_tb;
    private boolean field_sb;
    static boolean field_ob;
    private nq field_ub;
    static String field_xb;
    private boolean field_wb;
    static vk field_rb;

    final void p(int param0) {
        cf var2 = null;
        cf var2Lifetime1;
        if (param0 == -7011) {
          this.field_yb.a(4210752, 2121792, -27855);
          var2 = new cf(this, this.field_ub, pr.field_f);
          var2.a(t.field_a, (byte) 112, 15);
          this.b(var2, param0 + 6907);
          return;
        }
        this.field_tb = false;
        this.field_yb.a(4210752, 2121792, -27855);
        var2Lifetime1 = new cf(this, this.field_ub, pr.field_f);
        var2Lifetime1.a(t.field_a, (byte) 112, 15);
        this.b(var2Lifetime1, param0 + 6907);
    }

    public static void j(byte param0) {
        field_nb = null;
        field_rb = null;
        field_qb = null;
        field_xb = null;
        if (param0 > -71) {
          field_pb = false;
        }
    }

    final void i(byte param0) {
        if (!this.field_E) {
          return;
        }
        this.field_E = false;
        if (!this.field_tb) {
          if (!this.field_vb) {
            if (param0 != -104) {
              this.i((byte) -32);
              return;
            }
            return;
          }
          ur.j(0);
          if (param0 != -104) {
            this.i((byte) -32);
            return;
          }
          return;
        }
        nb.a(126);
        if (param0 == -104) {
          return;
        }
        this.i((byte) -32);
    }

    public void a(kg param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 6) {
            this.field_sb = false;
          }
          if (!this.field_sb) {
            sl.a("tochangedisplayname.ws", kq.f((byte) 126), (byte) 63);
            return;
          }
          qj.a((byte) -127, 3);
          this.i((byte) -104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ns.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    ns(tc param0, nq param1, String param2, boolean param3, boolean param4) {
        super(param0, new cf((ns) null, param1, param2), 77, 10, 10);
        try {
          this.field_sb = false;
          this.field_tb = param3 ? true : false;
          this.field_vb = param4 ? true : false;
          this.field_wb = false;
          this.field_ub = param1;
          this.field_yb = new md(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_yb.field_L = true;
          this.b((byte) -43, this.field_yb);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ns.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != param2) {
            stackIn_5_0 = super.a(param0, param1, param2 + 0, param3);
            return stackIn_5_0;
          }
          this.i((byte) -104);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ns.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2) {
        boolean stackIn_6_1 = false;
        cf stackIn_10_0 = null;
        String stackIn_11_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        cf var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        cf var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_wb) {
            return;
          }
          stackIn_6_1 = (256 == param1);
          this.field_sb = stackIn_6_1;
          this.field_wb = true;
          this.field_yb.a(4210752, 8405024, -27855);
          var6 = new cf(this, this.field_ub, param0);
          var4 = var6;
          if (5 == param1) {
            var6.a(gg.field_b, (byte) 125, 11);
            var6.a(em.field_g, (byte) 120, 17);
          } else {
            if (param1 == 256) {
              var6.a((ko) (this), 121, ts.field_E);
            } else {
              stackIn_10_0 = var6;
              if (!this.field_tb) {
                stackIn_11_1 = ss.field_e;
              } else {
                stackIn_11_1 = ts.field_E;
              }
              ((cf) (Object) stackIn_10_0).a(stackIn_11_1, (byte) 119, -1);
            }
          }
          if (param2 > -41) {
            return;
          }
          if (3 == param1) {
            var6.a(rs.field_yb, (byte) 100, 7);
          } else {
            if (param1 != 4) {
              if (param1 == 6) {
                var6.a(bf.field_d, (byte) 107, 9);
              } else {
                if (param1 != 9) {
                  this.b(var6, 110);
                  return;
                }
                var6.a((ko) (this), 126, ib.field_d);
              }
            } else {
              var6.a(pf.field_f, (byte) 122, 8);
            }
          }
          this.b(var6, 110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("ns.J(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_qb = "You can join this game";
        field_pb = true;
        field_nb = new np(1);
    }
}
