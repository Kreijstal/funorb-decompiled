/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends mk {
    private fn field_k;
    static String field_j;
    static je field_l;

    final static void c(byte param0) {
        if (param0 > -120) {
            di.c((byte) 114);
            qf.a(56);
            gl.a(124, 4);
            return;
        }
        qf.a(56);
        gl.a(124, 4);
    }

    public static void g(int param0) {
        field_l = null;
        field_j = null;
        int var1 = -96 / ((param0 - -9) / 42);
    }

    final gu a(int param0, String param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        gu stackIn_5_0 = null;
        gu stackIn_11_0 = null;
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
              if (!(this.field_k instanceof eg)) {
                break L1;
              } else {
                var3 = ((eg) ((Object) this.field_k)).a(-918933630);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a(false) != oo.field_g) {
                    stackIn_5_0 = rn.field_e;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == -3137) {
                break L2;
              } else {
                field_l = (je) null;
                break L2;
              }
            }
            L3: {
              if (!param1.equals(this.field_k.field_v)) {
                stackIn_11_0 = rn.field_e;
                break L3;
              } else {
                stackIn_11_0 = oo.field_g;
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

            stackIn_14_1 = new StringBuilder().append("di.R(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_11_0;
        }
    }

    di(fn param0, fn param1) {
        super(param0);
        try {
            this.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, String param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_k instanceof eg) {
                var3 = ((eg) ((Object) this.field_k)).a(-918933630);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.a(false) != oo.field_g) {
                      break L2;
                    } else {
                      if (!param1.equals(this.field_k.field_v)) {
                        stackIn_7_0 = ak.field_j;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_9_0 = var3.a((byte) 55);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 > 89) {
                break L3;
              } else {
                di.c((byte) 94);
                break L3;
              }
            }
            if (!param1.equals(this.field_k.field_v)) {
              stackIn_15_0 = ak.field_j;
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
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("di.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
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

    static {
        field_j = "<%0> cannot join; the game is full.";
    }
}
