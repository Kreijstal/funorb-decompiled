/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bla extends eca {
    private String field_g;
    private boolean field_h;
    private vqa field_f;

    final static boolean a(int param0, boolean param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        if (param1) {
          L0: {
            bla.a(126, true, -36);
            if (0 == (24 & param0)) {
              stackIn_11_0 = 0;
              break L0;
            } else {
              stackIn_11_0 = 1;
              break L0;
            }
          }
          L1: {


            if ((544 & param0) != 544) {

              stackIn_14_1 = 0;
              break L1;
            } else {

              stackIn_14_1 = 1;
              break L1;
            }
          }
          return (stackIn_11_0 | stackIn_14_1) != 0;
        } else {
          L2: {
            if (0 == (24 & param0)) {
              stackIn_4_0 = 0;
              break L2;
            } else {
              stackIn_4_0 = 1;
              break L2;
            }
          }
          L3: {


            if ((544 & param0) != 544) {

              stackIn_7_1 = 0;
              break L3;
            } else {

              stackIn_7_1 = 1;
              break L3;
            }
          }
          return (stackIn_4_0 | stackIn_7_1) != 0;
        }
    }

    final qrb a(String param0, int param1) {
        ge var3 = null;
        RuntimeException var3_ref = null;
        qrb stackIn_2_0 = null;
        qrb stackIn_8_0 = null;
        qrb stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_f.a(param0, param1) != cca.field_o) {
              L1: {
                if (!param0.equals(this.field_g)) {
                  var3 = psb.a(param0, param1 ^ 16384);
                  if (!var3.a(4)) {
                    stackIn_8_0 = dsa.field_q;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_g = param0;
                    this.field_h = var3.b((byte) -20);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!this.field_h) {
                  stackIn_13_0 = cca.field_o;
                  break L2;
                } else {
                  stackIn_13_0 = lea.field_o;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = cca.field_o;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("bla.B(");

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
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
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

    final String b(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
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
            if (this.field_f.a(param0, 16384) == cca.field_o) {
              stackIn_3_0 = this.field_f.b(param0, -1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.a(param0, 16384) == cca.field_o) {
                stackIn_7_0 = qh.field_N;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param1 == -1) {
                    break L1;
                  } else {
                    this.field_g = (String) null;
                    break L1;
                  }
                }
                stackIn_11_0 = bqa.field_f;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("bla.C(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    bla(uf param0, uf param1) {
        super(param0);
        this.field_g = "";
        this.field_h = false;
        try {
            this.field_f = new vqa(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
