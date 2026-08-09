/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends jd {
    static gm field_k;
    static dk field_q;
    private boolean field_n;
    static String field_l;
    private String field_m;
    private ge field_p;
    static String field_o;
    static int[] field_j;

    mh(ga param0, ga param1) {
        super(param0);
        this.field_n = false;
        this.field_m = "";
        try {
            this.field_p = new ge(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 25) {
                break L1;
              } else {
                var4 = (String) null;
                this.a((String) null, 68);
                break L1;
              }
            }
            if (this.field_p.a(param1, -5) == jt.field_Bb) {
              stackIn_5_0 = this.field_p.a((byte) 25, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.a(param1, -5) != jt.field_Bb) {
                stackIn_10_0 = dl.field_g;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = ql.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("mh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final rv a(String param0, int param1) {
        kw var3 = null;
        RuntimeException var3_ref = null;
        rv stackIn_2_0 = null;
        rv stackIn_8_0 = null;
        rv stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_p.a(param0, param1) != jt.field_Bb) {
              L1: {
                if (!param0.equals(this.field_m)) {
                  var3 = kt.a(false, param0);
                  if (!var3.a((byte) -80)) {
                    stackIn_8_0 = en.field_p;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_m = param0;
                    this.field_n = var3.b((byte) -90);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!this.field_n) {
                  stackIn_13_0 = jt.field_Bb;
                  break L2;
                } else {
                  stackIn_13_0 = he.field_yb;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = jt.field_Bb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("mh.E(");

            if (param0 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public static void g(int param0) {
        field_o = null;
        field_q = null;
        field_l = null;
        field_k = null;
        field_j = null;
        if (param0 != -29635) {
            field_l = (String) null;
        }
    }

    static {
        field_l = "Connection lost. <%0>";
        field_o = null;
    }
}
