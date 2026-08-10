/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends c implements nh {
    static int field_V;
    private int field_X;
    static double field_Y;
    private jb field_W;

    final String g(int param0) {
        if (this.field_x) {
          if (this.field_m != null) {
            if (param0 != 4) {
              this.field_X = 39;
              cd.a(-25343, kc.field_b, ag.field_f + (-this.field_X + this.field_u));
              return this.field_m;
            } else {
              cd.a(-25343, kc.field_b, ag.field_f + (-this.field_X + this.field_u));
              return this.field_m;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void i(int param0) {
        super.i(param0);
        if (null != this.field_W) {
            this.field_W.a(-1283);
        }
    }

    final static void s(int param0) {
        ok.field_w = false;
        c.field_S = 0;
        gf.field_b = null;
        if (param0 > -17) {
          field_Y = -0.41482136694826427;
          gg.field_f = -1;
          aa.field_t = -1;
          return;
        } else {
          gg.field_f = -1;
          aa.field_t = -1;
          return;
        }
    }

    public final jb a(byte param0) {
        int var2 = -113 % ((param0 - -50) / 46);
        return this.field_W;
    }

    final static void a(dd[] param0, int param1, int param2, byte param3, int param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 < param4) {
                  var5_int = param0[0].field_x;
                  var6 = param0[2].field_x;
                  var7 = param0[1].field_x;
                  var8 = -61 % ((13 - param3) / 44);
                  param0[0].d(param2, param1);
                  param0[2].d(-var6 + param4 + param2, param1);
                  gb.a(ng.field_a);
                  gb.g(param2 - -var5_int, param1, param4 + param2 - var6, param0[1].field_r + param1);
                  var9 = param2 - -var5_int;
                  var10 = param2 + param4 + -var6;
                  param2 = var9;
                  L2: while (true) {
                    if (var10 <= param2) {
                      gb.b(ng.field_a);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param0[1].d(param2, param1);
                      param2 = param2 + var7;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("bc.GA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    bc(String param0, kd param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        try {
            super.a(param0, param1, param2, (byte) -93);
            this.field_X = ag.field_f - this.field_y + -param1;
            if (param3 >= -85) {
                qa var6 = (qa) null;
                this.a(-113, 27, (qa) null, (byte) 36);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bc.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(rh param0, int param1, rh param2) {
        try {
            if (param1 != 1) {
                field_Y = 0.266666013076163;
            }
            wf.field_b = param0;
            ub.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bc.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, jb param1) {
        try {
            this.field_W = param1;
            if (!param0) {
                field_V = -41;
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bc.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Y = 0.1;
    }
}
