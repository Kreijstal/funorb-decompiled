/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends wj {
    private String field_p;
    private boolean field_t;
    static int field_s;
    private rd field_q;
    static int field_r;
    static int field_n;
    static boolean[] field_o;

    final na a(String param0, int param1) {
        h var3 = null;
        RuntimeException var3_ref = null;
        na stackIn_3_0 = null;
        na stackIn_10_0 = null;
        na stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_q.a(param0, param1 ^ 0) == ol.field_h) {
              stackIn_3_0 = ol.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 3917) {
                  break L1;
                } else {
                  field_o = (boolean[]) null;
                  break L1;
                }
              }
              L2: {
                if (!param0.equals(this.field_p)) {
                  var3 = jc.a(param1 + -4015, param0);
                  if (var3.a(param1 + -3917)) {
                    this.field_p = param0;
                    this.field_t = var3.b(param1 ^ 3879);
                    break L2;
                  } else {
                    stackIn_10_0 = f.field_g;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (this.field_t) {
                  stackIn_15_0 = wj.field_i;
                  break L3;
                } else {
                  stackIn_15_0 = ol.field_h;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("fd.B(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    fd(rj param0, rj param1) {
        super(param0);
        this.field_t = false;
        this.field_p = "";
        try {
            this.field_q = new rd(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "fd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_q.a(param1, 3917) == ol.field_h) {
              stackIn_3_0 = this.field_q.a(1, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.a(param1, 3917) != ol.field_h) {
                if (param0 == 1) {
                  stackIn_11_0 = ue.field_E;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = (String) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = qi.field_J;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("fd.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 != -28970) {
            fd.e(-42);
        }
    }

    static {
        field_o = new boolean[5];
        field_r = 0;
    }
}
