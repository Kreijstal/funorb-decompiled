/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends q {
    private String field_j;
    static wg field_n;
    static int field_l;
    private boolean field_i;
    private n field_m;
    static int[] field_k;

    mk(dj param0, dj param1) {
        super(param0);
        this.field_j = "";
        this.field_i = false;
        try {
            this.field_m = new n(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 >= 0) {
            mk.a(83, true);
            ih.field_c.a((byte) -110, param1);
            return;
        }
        ih.field_c.a((byte) -110, param1);
    }

    final lh a(int param0, String param1) {
        h var3 = null;
        RuntimeException var3_ref = null;
        lh stackIn_2_0 = null;
        lh stackIn_8_0 = null;
        lh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_m.a(param0, param1) != si.field_m) {
              L1: {
                if (!param1.equals(this.field_j)) {
                  var3 = ci.a(-1, param1);
                  if (!var3.a(-76)) {
                    stackIn_8_0 = si.field_n;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_j = param1;
                    this.field_i = var3.a((byte) -52);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!this.field_i) {
                  stackIn_13_0 = si.field_m;
                  break L2;
                } else {
                  stackIn_13_0 = kk.field_w;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = si.field_m;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("mk.D(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
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
              if (param0 == 422) {
                break L1;
              } else {
                mk.c((byte) -50);
                break L1;
              }
            }
            if (this.field_m.a(-257, param1) == si.field_m) {
              stackIn_5_0 = this.field_m.b(422, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.a(-257, param1) == si.field_m) {
                stackIn_9_0 = g.field_m;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return da.field_e;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("mk.A(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_9_0;
        }
    }

    public static void c(byte param0) {
        field_k = null;
        field_n = null;
        if (param0 != -9) {
            field_k = (int[]) null;
        }
    }

    final static jg a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        cd var4 = null;
        cd stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 111 % ((param0 - 9) / 38);
            var4 = new cd();
            ((jg) ((Object) var4)).field_b = param2;
            ((jg) ((Object) var4)).field_e = param1;
            stackIn_1_0 = (cd) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("mk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return (jg) ((Object) stackIn_1_0);
    }

    static {
        field_k = new int[]{16407324, 16429852, 11199532, 9487646, 15149096};
    }
}
