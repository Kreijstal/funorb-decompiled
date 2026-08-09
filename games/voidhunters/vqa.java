/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vqa extends eca {
    static int field_k;
    static goa field_i;
    static String field_f;
    static uca field_g;
    static String field_j;
    private uf field_h;

    final qrb a(String param0, int param1) {
        eeb var3 = null;
        RuntimeException var3_ref = null;
        qrb stackIn_6_0 = null;
        qrb stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_h instanceof lca) {
                var3 = ((lca) ((Object) this.field_h)).a(-782444220);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a((byte) 35) != lea.field_o) {
                    stackIn_6_0 = cca.field_o;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 16384) {
                break L2;
              } else {
                field_k = -96;
                break L2;
              }
            }
            L3: {
              if (param0.equals(this.field_h.field_j)) {
                stackIn_12_0 = lea.field_o;
                break L3;
              } else {
                stackIn_12_0 = cca.field_o;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("vqa.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_12_0;
        }
    }

    final String b(String param0, int param1) {
        eeb var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_h instanceof lca) {
                var3 = ((lca) ((Object) this.field_h)).a(-782444220);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.a((byte) 35) != lea.field_o) {
                      break L2;
                    } else {
                      if (param0.equals(this.field_h.field_j)) {
                        break L2;
                      } else {
                        stackIn_6_0 = lmb.field_a;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_8_0 = var3.c((byte) -79);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            if (param0.equals(this.field_h.field_j)) {
              if (param1 != -1) {
                vqa.f(108);
                stackIn_15_0 = null;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_11_0 = lmb.field_a;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("vqa.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return (String) ((Object) stackIn_15_0);
            }
          }
        }
    }

    public static void f(int param0) {
        if (param0 != 1) {
            return;
        }
        field_i = null;
        field_j = null;
        field_f = null;
        field_g = null;
    }

    vqa(uf param0, uf param1) {
        super(param0);
        try {
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "vqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = 1;
        field_f = "Add action (Set custom variable label)";
        field_j = "Encouraging rule breaking";
        nf discarded$0 = new nf();
    }
}
