/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt extends mk {
    static nc field_n;
    private String field_k;
    static String field_m;
    static boolean field_l;
    static wk[] field_o;
    private di field_q;
    static int field_p;
    private boolean field_j;

    final gu a(int param0, String param1) {
        fo var3 = null;
        RuntimeException var3_ref = null;
        gu stackIn_2_0 = null;
        gu stackIn_7_0 = null;
        gu stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_q.a(param0 ^ 0, param1) != rn.field_e) {
              L1: {
                if (!param1.equals(this.field_k)) {
                  var3 = dh.a(param1, (byte) 67);
                  if (var3.a((byte) -74)) {
                    this.field_k = param1;
                    this.field_j = var3.a(17);
                    break L1;
                  } else {
                    stackIn_7_0 = so.field_e;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == -3137) {
                  break L2;
                } else {
                  this.field_q = (di) null;
                  break L2;
                }
              }
              L3: {
                if (this.field_j) {
                  stackIn_14_0 = oo.field_g;
                  break L3;
                } else {
                  stackIn_14_0 = rn.field_e;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = rn.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("kt.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
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
              if (param0 > 89) {
                break L1;
              } else {
                field_n = (nc) null;
                break L1;
              }
            }
            if (this.field_q.a(-3137, param1) == rn.field_e) {
              stackIn_5_0 = this.field_q.a((byte) 126, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.a(-3137, param1) != rn.field_e) {
                stackIn_10_0 = fu.field_a;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = hk.field_Ib;
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

            stackIn_13_1 = new StringBuilder().append("kt.O(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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

    public static void g(int param0) {
        field_n = null;
        if (param0 < 91) {
            field_n = (nc) null;
            field_o = null;
            field_m = null;
            return;
        }
        field_o = null;
        field_m = null;
    }

    kt(fn param0, fn param1) {
        super(param0);
        this.field_k = "";
        this.field_j = false;
        try {
            this.field_q = new di(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Auto-respond to <%0>";
        field_l = false;
    }
}
