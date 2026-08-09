/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends kca {
    static String field_l;
    private tra field_k;
    static int[] field_j;

    oe(tra param0, tra param1) {
        super(param0);
        try {
            this.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        nua var3 = null;
        RuntimeException var3_ref = null;
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
              if (!(this.field_k instanceof mk)) {
                break L1;
              } else {
                var3 = ((mk) ((Object) this.field_k)).a((byte) 92);
                if (var3 != null) {
                  L2: {
                    if (var3.b(-4666) != uh.field_k) {
                      break L2;
                    } else {
                      if (!param1.equals(this.field_k.field_o)) {
                        stackIn_7_0 = bha.field_q;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_9_0 = var3.a(103);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == -1) {
                break L3;
              } else {
                field_j = (int[]) null;
                break L3;
              }
            }
            if (!param1.equals(this.field_k.field_o)) {
              stackIn_15_0 = bha.field_q;
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

            stackIn_18_1 = new StringBuilder().append("oe.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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

    public static void b(byte param0) {
        field_l = null;
        if (param0 != -112) {
            field_j = (int[]) null;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final it a(byte param0, String param1) {
        nua var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        it stackIn_5_0 = null;
        it stackIn_11_0 = null;
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
              if (this.field_k instanceof mk) {
                var3 = ((mk) ((Object) this.field_k)).a((byte) 89);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.b(param0 ^ -4664) == uh.field_k) {
                    break L1;
                  } else {
                    stackIn_5_0 = fp.field_c;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 14) {
                break L2;
              } else {
                var4 = (String) null;
                this.a(63, (String) null);
                break L2;
              }
            }
            L3: {
              if (!param1.equals(this.field_k.field_o)) {
                stackIn_11_0 = fp.field_c;
                break L3;
              } else {
                stackIn_11_0 = uh.field_k;
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

            stackIn_14_1 = new StringBuilder().append("oe.A(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_11_0;
        }
    }

    static {
        field_l = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_j = new int[]{0, 10, 11};
    }
}
