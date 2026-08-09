/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends pa {
    static int field_D;

    final static int a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param0) {
          param1 = param1 & 8191;
          if (4096 <= param1) {
            L0: {
              if (param1 < 6144) {
                stackIn_19_0 = -lo.field_q[-4096 + param1];
                break L0;
              } else {
                stackIn_19_0 = -lo.field_q[8192 - param1];
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if ((param1 ^ -1) > -2049) {
                stackIn_15_0 = lo.field_q[param1];
                break L1;
              } else {
                stackIn_15_0 = lo.field_q[4096 + -param1];
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          rd.a(false, 94);
          param1 = param1 & 8191;
          if (4096 <= param1) {
            L2: {
              if (param1 < 6144) {
                stackIn_9_0 = -lo.field_q[-4096 + param1];
                break L2;
              } else {
                stackIn_9_0 = -lo.field_q[8192 - param1];
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if ((param1 ^ -1) > -2049) {
                stackIn_5_0 = lo.field_q[param1];
                break L3;
              } else {
                stackIn_5_0 = lo.field_q[4096 + -param1];
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        ij var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 1) {
                break L1;
              } else {
                field_D = 107;
                break L1;
              }
            }
            L2: {
              super.a(param0, 5, param2, param3, param4, param5);
              var7 = np.field_H;
              if (var7 == null) {
                break L2;
              } else {
                if (!this.b(param3, 21224, param4, param0, param2)) {
                  break L2;
                } else {
                  if (!(this.field_v instanceof in)) {
                    if (!(var7.field_v instanceof in)) {
                      break L2;
                    } else {
                      ((in) ((Object) var7.field_v)).a(-12156, (rd) (this), var7);
                      np.field_H = null;
                      return;
                    }
                  } else {
                    ((in) ((Object) this.field_v)).a(-12156, (rd) (this), var7);
                    np.field_H = null;
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var7_ref);

            stackIn_11_1 = new StringBuilder().append("rd.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    private rd(int param0, int param1, int param2, int param3, io param4, sk param5, ga param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_z = param6;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "rd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        f.field_b = (58 & param1) >> -1876486332;
        c.field_c = (param1 & 13) >> -2138271422;
        if (2 >= f.field_b) {
          L0: {
            if (2 < c.field_c) {
              c.field_c = 2;
              break L0;
            } else {
              break L0;
            }
          }
          gf.field_c = param1 & 3;
          if (param0 != 20348) {
            return;
          } else {
            L1: {
              if ((gf.field_c ^ -1) >= -3) {
                break L1;
              } else {
                gf.field_c = 2;
                break L1;
              }
            }
            return;
          }
        } else {
          L2: {
            f.field_b = 2;
            if (2 < c.field_c) {
              c.field_c = 2;
              break L2;
            } else {
              break L2;
            }
          }
          gf.field_c = param1 & 3;
          if (param0 != 20348) {
            return;
          } else {
            L3: {
              if ((gf.field_c ^ -1) >= -3) {
                break L3;
              } else {
                gf.field_c = 2;
                break L3;
              }
            }
            return;
          }
        }
    }

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        field_D = 68;
    }
}
