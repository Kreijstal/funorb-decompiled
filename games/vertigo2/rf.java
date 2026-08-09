/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends da {
    static int field_l;
    static ch field_p;
    static si field_o;
    private kp field_r;
    static tq field_n;
    static int field_q;
    static int field_s;
    static String[][] field_m;

    public static void g(int param0) {
        field_m = (String[][]) null;
        field_n = null;
        if (param0 != 29492) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    final String b(int param0, String param1) {
        of var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(this.field_r instanceof ik)) {
                break L1;
              } else {
                var3 = ((ik) ((Object) this.field_r)).a((byte) -5);
                if (var3 != null) {
                  L2: {
                    if (var3.a(-23996) != qm.field_G) {
                      break L2;
                    } else {
                      if (!param1.equals(this.field_r.field_w)) {
                        stackIn_7_0 = gl.field_a;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_9_0 = var3.d(param0 + -30797);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param1.equals(this.field_r.field_w)) {
              stackIn_13_0 = gl.field_a;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (param0 != 3614) {
                field_q = 90;
                stackIn_17_0 = null;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("rf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return (String) ((Object) stackIn_17_0);
            }
          }
        }
    }

    final ba a(int param0, String param1) {
        of var3 = null;
        RuntimeException var3_ref = null;
        ba stackIn_6_0 = null;
        ba stackIn_9_0 = null;
        ba stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_r instanceof ik) {
                var3 = ((ik) ((Object) this.field_r)).a((byte) -5);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a(-23996) != qm.field_G) {
                    stackIn_6_0 = ir.field_a;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param0 == -1) {
              L2: {
                if (param1.equals(this.field_r.field_w)) {
                  stackIn_13_0 = qm.field_G;
                  break L2;
                } else {
                  stackIn_13_0 = ir.field_a;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_9_0 = (ba) null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("rf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    rf(kp param0, kp param1) {
        super(param0);
        try {
            this.field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new tq(2);
    }
}
