/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends pm {
    private fj field_h;
    static String field_j;
    static String field_k;
    static int field_f;
    private boolean field_i;
    private String field_g;

    final static void a(boolean param0, int param1) {
        if (param1 < 61) {
            field_f = 84;
            pn.a(false, (byte) -55, param0);
            return;
        }
        pn.a(false, (byte) -55, param0);
    }

    final static ln e(int param0) {
        if (param0 != 16516) {
            return (ln) null;
        }
        return (ln) ((Object) new ab());
    }

    public static void d(int param0) {
        field_k = null;
        field_j = null;
        if (param0 != 1029) {
            lk.e(-104);
        }
    }

    final rh a(String param0, int param1) {
        tk var3 = null;
        RuntimeException var3_ref = null;
        rh stackIn_2_0 = null;
        rh stackIn_7_0 = null;
        rh stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_h.a(param0, param1) != uc.field_b) {
              L1: {
                if (param0.equals(this.field_g)) {
                  break L1;
                } else {
                  var3 = um.a((byte) 110, param0);
                  if (!var3.a(36)) {
                    stackIn_7_0 = gj.field_v;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_g = param0;
                    this.field_i = var3.a(false);
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_i) {
                  stackIn_12_0 = mc.field_g;
                  break L2;
                } else {
                  stackIn_12_0 = uc.field_b;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = uc.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("lk.I(");

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
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
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

    lk(tb param0, tb param1) {
        super(param0);
        this.field_i = false;
        this.field_g = "";
        try {
            this.field_h = new fj(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -94) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            if (this.field_h.a(param0, 2) != uc.field_b) {
              if (this.a(param0, 2) == uc.field_b) {
                stackIn_8_0 = ng.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return sd.field_c;
              }
            } else {
              stackIn_4_0 = this.field_h.a(param0, (byte) -119);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("lk.B(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_8_0;
        }
    }

    static {
        field_j = "Back";
    }
}
