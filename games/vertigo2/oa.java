/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends da {
    static String field_o;
    static int field_l;
    private String field_n;
    private boolean field_r;
    static int field_p;
    static cr field_s;
    private rf field_m;
    static int field_q;

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 3614) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            if (this.field_m.a(-1, param1) != ir.field_a) {
              if (this.a(param0 + -3615, param1) != ir.field_a) {
                stackIn_9_0 = mh.field_b;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = vl.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = this.field_m.b(3614, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("oa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    public static void g(int param0) {
        field_o = null;
        if (param0 > -107) {
            field_l = -41;
            field_s = null;
            return;
        }
        field_s = null;
    }

    final ba a(int param0, String param1) {
        bk var3 = null;
        RuntimeException var3_ref = null;
        ba stackIn_2_0 = null;
        ba stackIn_7_0 = null;
        ba stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_m.a(param0, param1) != ir.field_a) {
              L1: {
                if (param1.equals(this.field_n)) {
                  break L1;
                } else {
                  var3 = ig.a(param1, false);
                  if (!var3.a((byte) -100)) {
                    stackIn_7_0 = dj.field_c;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_n = param1;
                    this.field_r = var3.c((byte) -119);
                    break L1;
                  }
                }
              }
              L2: {
                if (!this.field_r) {
                  stackIn_12_0 = ir.field_a;
                  break L2;
                } else {
                  stackIn_12_0 = qm.field_G;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = ir.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("oa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    oa(kp param0, kp param1) {
        super(param0);
        this.field_r = false;
        this.field_n = "";
        try {
            this.field_m = new rf(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "oa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 0;
        field_o = "Unable to delete friend - system busy";
    }
}
