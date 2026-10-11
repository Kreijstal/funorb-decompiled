/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends ab implements pi {
    private boolean field_wb;
    static String field_zb;
    private a field_sb;
    private boolean field_yb;
    static hj[] field_Ab;
    static String field_ub;
    static String field_xb;
    static int field_Bb;
    static String field_tb;
    static hj field_vb;

    final boolean g(byte param0) {
        if (!this.field_F) {
          if (param0 == 39) {
            return super.g((byte) 39);
          }
          return false;
        }
        if (this.field_wb) {
          if (param0 == 39) {
            return super.g((byte) 39);
          }
          return false;
        }
        nd var2 = th.c((byte) -67);
        if (var2 == null) {
          if (param0 == 39) {
            return super.g((byte) 39);
          }
          return false;
        }
        this.a((byte) 100, false, var2);
        if (param0 == 39) {
          return super.g((byte) 39);
        }
        return false;
    }

    private final void a(byte param0, boolean param1, nd param2) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        nh var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        try {
          this.field_wb = true;
          var6 = 74 / ((7 - param0) / 34);
          if (!param2.field_f) {
            if (null != param2.field_j) {
              var4 = ud.field_j;
              if (this.field_sb != null) {
                this.field_sb.a((byte) 125);
              }
            } else {
              var4 = param2.field_d;
              if (param2.field_b == 248) {
                if (!param1) {
                  qf.a(true);
                }
                var4 = vn.field_e;
                this.field_yb = true;
              }
            }
          } else {
            var4 = nh.field_H;
          }
          var5 = new nh((ab) (this), de.field_I, var4);
          if (param2.field_f) {
            if (param2.field_i) {
              this.a((n) (new bj(this)), (byte) 126);
              return;
            }
            var5.a(112, (tb) (this), sf.field_j);
          } else {
            if (this.field_yb) {
              var5.a(81, (tb) (this), sf.field_j);
            } else {
              if (param2.field_b == 5) {
                var5.a(11, vn.field_b, (byte) 66);
                var5.a(17, dl.field_n, (byte) 120);
              } else {
                var5.a(-1, kn.field_i, (byte) 108);
              }
            }
            if (param2.field_b == 3) {
              var5.a(7, ek.field_u, (byte) 61);
            } else {
              if (param2.field_b == 6) {
                var5.a(9, gb.field_d, (byte) 77);
              }
            }
          }
          this.a((n) (var5), (byte) 127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("vm.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void p(int param0) {
        field_Ab = null;
        if (param0 == -7) {
          field_xb = null;
          field_ub = null;
          field_tb = null;
          field_zb = null;
          field_vb = null;
          return;
        }
        field_ub = (String) null;
        field_xb = null;
        field_ub = null;
        field_tb = null;
        field_zb = null;
        field_vb = null;
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        nd var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_yb) {
            cg.a((byte) -93, true, false);
            return;
          }
          hk.a(true);
          if (param2 != -4) {
            var7 = (nd) null;
            this.a((byte) 98, true, (nd) null);
            this.h((byte) -72);
          } else {
            this.h((byte) -72);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("vm.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void q(int param0) {
        if (param0 > -113) {
          return;
        }
        this.a((byte) -39, true, ij.a(vn.field_e, 256, 248));
    }

    vm(qj param0, a param1) {
        super(param0, de.field_I, na.field_o, false, false);
        try {
          this.field_sb = param1;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "vm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_zb = "<br>Lap: ";
        field_ub = "Unable to connect to the data server. Please check any firewall you are using.";
        field_Bb = 0;
        field_tb = "<col=2>Not complete</col>";
        field_xb = "<img=0>, <img=7>";
    }
}
