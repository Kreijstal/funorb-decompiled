/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends cb {
    static r field_k;
    static int field_n;
    static int field_o;
    private String field_l;
    private jg field_j;
    static String field_i;
    private boolean field_m;

    final static boolean e(boolean param0) {
        if (param0) {
          od.a(16, -41);
          if (kj.a(param0)) {
            return false;
          }
          if (!hc.field_D) {
            return true;
          }
          return false;
        }
        if (kj.a(param0)) {
          return false;
        }
        if (!hc.field_D) {
          return true;
        }
        return false;
    }

    public static void f(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != 4) {
          od.a(-85, -61);
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_j.a(param1, 5) == fg.field_d) {
            stackIn_2_0 = this.field_j.a((byte) 122, param1);
            return stackIn_2_0;
          }
          var3_int = 71 / ((param0 - 49) / 56);
          if (this.a(param1, 5) != fg.field_d) {
            stackIn_7_0 = c.field_b;
            return stackIn_7_0;
          }
          stackIn_5_0 = dl.field_a;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("od.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    od(ui param0, ui param1) {
        super(param0);
        this.field_m = false;
        this.field_l = "";
        try {
          this.field_j = new jg(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "od.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ag a(String param0, int param1) {
        jf var3 = null;
        RuntimeException var3_ref = null;
        ag stackIn_3_0 = null;
        ag stackIn_6_0 = null;
        ag stackIn_11_0 = null;
        ag stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_j.a(param0, param1 + 0) == fg.field_d) {
            stackIn_3_0 = fg.field_d;
            return stackIn_3_0;
          }
          if (param1 != 5) {
            stackIn_6_0 = (ag) null;
            return stackIn_6_0;
          }
          if (!param0.equals(this.field_l)) {
            var3 = l.a(param0, (byte) -128);
            if (!var3.a(0)) {
              stackIn_11_0 = bm.field_o;
              return stackIn_11_0;
            }
            this.field_l = param0;
            this.field_m = var3.b(-118);
          }
          if (this.field_m) {
            stackIn_16_0 = sc.field_a;
          } else {
            stackIn_16_0 = fg.field_d;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("od.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var4_intLifetime1;
        var5 = MinerDisturbance.field_ab;
        try {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          if (param1 != 35) {
            if (36 == param1) {
              if (wi.field_v != null &&
                !wi.field_v.k()) {
                return;
              }
              wi.field_v = rc.b(re.field_a[param1], 100, param2, param0);
              mg.a(1963987425, wi.field_v);
            } else {
              if (param1 != 42) {
                if (46 == param1) {
                  var4_int = 4;
                  boolean decompiledNaturalLoopExit1 = false;
                  while (!(decompiledNaturalLoopExit1 = (var4_int < 0))) {
                    if (mh.field_b[var4_int] != null &&
                      !mh.field_b[var4_int].k()) {
                      var4_int--;
                      continue;
                    }
                    break;
                  }
                  if (decompiledNaturalLoopExit1) {
                    decompiledFrameCompleted1 = false;
                  }
                  if (decompiledFrameCompleted1) {
                    mh.field_b[var4_int] = rc.b(re.field_a[param1], 100, param2, param0);
                    mg.a(param3 + 1963987421, mh.field_b[var4_int]);
                    decompiledFrameRemainder0 = false;
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted1)) {
                  if (param1 == 47) {
                    var6 = 4;
                    var4_intLifetime1 = var6;
                    boolean decompiledNaturalLoopExit0 = false;
                    while (!(decompiledNaturalLoopExit0 = (var6 < 0))) {
                      if (null != si.field_b[var6] &&
                        !si.field_b[var6].k()) {
                        var6--;
                        continue;
                      }
                      break;
                    }
                    if (decompiledNaturalLoopExit0) {
                      decompiledFrameCompleted0 = false;
                    }
                    if (decompiledFrameCompleted0) {
                      si.field_b[var6] = rc.b(re.field_a[param1], 100, param2, param0);
                      mg.a(1963987425, si.field_b[var6]);
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameCompleted0)) {
                    ii.a(re.field_a[param1], false);
                  }
                }
              } else {
                if (df.field_a != null &&
                  !df.field_a.k()) {
                  return;
                }
                df.field_a = rc.b(re.field_a[param1], 100, param2, param0);
                mg.a(1963987425, df.field_a);
              }
            }
          } else {
            if (null != qg.field_b &&
              !qg.field_b.k()) {
              return;
            }
            qg.field_b = rc.b(re.field_a[param1], 100, param2, param0);
            mg.a(param3 + 1963987421, qg.field_b);
          }
          if (param3 == 4) {
            return;
          }
          od.a(-80, -28, -12, -111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var4), "od.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1) {
        aa.field_f = oi.field_J[param1];
        ge.field_d = kd.field_k[param1];
        ic.field_g = ra.field_e[param1];
        if (param0 < 77) {
          field_i = (String) null;
        }
    }

    static {
        field_n = 640;
        field_i = "       ";
        field_o = 250;
        field_k = new r();
    }
}
