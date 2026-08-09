/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends kca {
    private String field_m;
    private oe field_j;
    private boolean field_l;
    static String field_n;
    static int field_k;

    final String a(int param0, String param1) {
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
            if (this.field_j.a((byte) 14, param1) != fp.field_c) {
              if (param0 == -1) {
                if (this.a((byte) 14, param1) != fp.field_c) {
                  stackIn_10_0 = dua.field_j;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = woa.field_l;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.field_j.a(param0 + 0, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("mn.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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

    final it a(byte param0, String param1) {
        us var3 = null;
        RuntimeException var3_ref = null;
        it stackIn_3_0 = null;
        it stackIn_8_0 = null;
        it stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_j.a(param0, param1) == fp.field_c) {
              stackIn_3_0 = fp.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1.equals(this.field_m)) {
                  break L1;
                } else {
                  var3 = wd.a((byte) -115, param1);
                  if (!var3.b(47)) {
                    stackIn_8_0 = tea.field_b;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_m = param1;
                    this.field_l = var3.c(81);
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_l) {
                  stackIn_13_0 = uh.field_k;
                  break L2;
                } else {
                  stackIn_13_0 = fp.field_c;
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
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("mn.A(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    mn(tra param0, tra param1) {
        super(param0);
        this.field_l = false;
        this.field_m = "";
        try {
            this.field_j = new oe(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void h(int param0) {
        oq.a((byte) 124).c(76);
        if (param0 != 30001) {
            field_n = (String) null;
        }
    }

    final static String g(int param0) {
        if (param0 > -40) {
            field_n = (String) null;
            return ofa.field_D;
        }
        return ofa.field_D;
    }

    public static void f(int param0) {
        field_n = null;
        if (param0 >= -15) {
            mn.h(-88);
        }
    }

    static {
    }
}
