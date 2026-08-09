/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends na {
    private nq field_g;
    private String field_e;
    static os field_h;
    static String field_f;
    private boolean field_i;

    wk(dh param0, dh param1) {
        super(param0);
        this.field_e = "";
        this.field_i = false;
        try {
            this.field_g = new nq(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
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
              if (param0 == 0) {
                break L1;
              } else {
                var4 = (String) null;
                this.a(-5, (String) null);
                break L1;
              }
            }
            if (this.field_g.a((byte) 26, param1) != qr.field_e) {
              if (this.a((byte) 26, param1) != qr.field_e) {
                stackIn_9_0 = nw.field_h;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = oj.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = this.field_g.a(0, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("wk.B(").append(param0).append(',');

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
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
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

    final gf a(byte param0, String param1) {
        bj var3 = null;
        RuntimeException var3_ref = null;
        gf stackIn_3_0 = null;
        gf stackIn_7_0 = null;
        gf stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_g.a(param0, param1) == qr.field_e) {
              stackIn_3_0 = qr.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1.equals(this.field_e)) {
                  break L1;
                } else {
                  var3 = ov.a(param0 ^ 27, param1);
                  if (var3.a(true)) {
                    this.field_e = param1;
                    this.field_i = var3.c(-1);
                    break L1;
                  } else {
                    stackIn_7_0 = kt.field_a;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (this.field_i) {
                  stackIn_12_0 = qe.field_a;
                  break L2;
                } else {
                  stackIn_12_0 = qr.field_e;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("wk.E(").append(param0).append(',');

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
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_h = null;
        if (param0) {
            wk.b(true);
        }
    }

    static {
        field_h = new os();
    }
}
