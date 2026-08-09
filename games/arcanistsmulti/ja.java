/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends rl {
    static String field_t;
    private mn field_v;
    static int field_s;
    static int field_u;
    private String field_q;
    private boolean field_x;
    static boolean field_y;
    static String field_w;
    static String field_r;

    public static void d(int param0) {
        field_r = null;
        field_t = null;
        if (param0 != 0) {
            return;
        }
        field_w = null;
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
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
            if (this.field_v.a(param0, -91) != ra.field_k) {
              if (param1 < -114) {
                if (this.a(param0, -90) != ra.field_k) {
                  stackIn_10_0 = nh.field_v;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = oj.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.field_v.a(param0, (byte) -115);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ja.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    final eh a(String param0, int param1) {
        km var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        eh stackIn_2_0 = null;
        eh stackIn_7_0 = null;
        eh stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_v.a(param0, 14) != ra.field_k) {
              L1: {
                if (param0.equals(this.field_q)) {
                  break L1;
                } else {
                  var3 = ib.a(2, param0);
                  if (!var3.a((byte) -111)) {
                    stackIn_7_0 = ug.field_c;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_q = param0;
                    this.field_x = var3.a(-21813);
                    break L1;
                  }
                }
              }
              L2: {
                var3_int = 75 / ((-50 - param1) / 36);
                if (!this.field_x) {
                  stackIn_12_0 = ra.field_k;
                  break L2;
                } else {
                  stackIn_12_0 = nn.field_s;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = ra.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("ja.E(");

            if (param0 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
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

    final static kc d(byte param0) {
        if (param0 != 90) {
            ja.d((byte) -69);
            return lf.field_b.field_Cb;
        }
        return lf.field_b.field_Cb;
    }

    ja(rn param0, rn param1) {
        super(param0);
        this.field_x = false;
        this.field_q = "";
        try {
            this.field_v = new mn(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = "Remove <%0> from ignore list";
        field_s = 0;
        field_u = 200;
        field_w = "Breaking real-world laws";
        field_r = "Pause Menu";
    }
}
