/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends cg {
    private hf field_o;
    static String field_j;
    static int field_l;
    static String[] field_m;
    static boolean field_k;
    static java.awt.Frame field_n;

    final String a(String param0, boolean param1) {
        ba var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
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
              if (this.field_o instanceof of) {
                var3 = ((of) ((Object) this.field_o)).a(-53);
                if (var3 != null) {
                  L2: {
                    if (var3.a(true) != ii.field_e) {
                      break L2;
                    } else {
                      if (param0.equals(this.field_o.field_r)) {
                        break L2;
                      } else {
                        stackIn_7_0 = r.field_r;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_9_0 = var3.b(26766);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (!param1) {
                break L3;
              } else {
                var4 = (String) null;
                this.a((String) null, -89);
                break L3;
              }
            }
            if (!param0.equals(this.field_o.field_r)) {
              stackIn_15_0 = r.field_r;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("fg.I(");

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
          throw ma.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    public static void c(boolean param0) {
        field_m = null;
        field_n = null;
        if (!param0) {
            fg.c(true);
            field_j = null;
            return;
        }
        field_j = null;
    }

    fg(hf param0, hf param1) {
        super(param0);
        try {
            this.field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "fg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final sg a(String param0, int param1) {
        ba var3 = null;
        RuntimeException var3_ref = null;
        sg stackIn_7_0 = null;
        sg stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -58) {
                break L1;
              } else {
                field_k = false;
                break L1;
              }
            }
            L2: {
              if (this.field_o instanceof of) {
                var3 = ((of) ((Object) this.field_o)).a(116);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.a(true) == ii.field_e) {
                    break L2;
                  } else {
                    stackIn_7_0 = pe.field_b;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0.equals(this.field_o.field_r)) {
                stackIn_11_0 = pe.field_b;
                break L3;
              } else {
                stackIn_11_0 = ii.field_e;
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
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("fg.M(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_11_0;
        }
    }

    static {
        field_m = new String[]{"By rating", "By win percentage"};
        field_k = false;
    }
}
