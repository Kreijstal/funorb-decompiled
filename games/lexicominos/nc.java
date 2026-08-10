/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends kd {
    int field_j;
    int field_l;
    int[] field_m;
    long field_h;
    int field_k;
    static String field_p;
    static db field_n;
    static int field_r;
    int field_o;
    int field_s;
    int field_q;
    int field_i;

    final static tf a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tf stackIn_4_0 = null;
        tf stackIn_7_0 = null;
        tf stackIn_16_0 = null;
        tf stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackIn_4_0 = w.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 >= var2_int) {
                var3 = 0;
                L1: while (true) {
                  if (var2_int > var3) {
                    L2: {
                      var4 = param1.charAt(var3);
                      if (var4 != 45) {
                        if (-1 == dc.field_y.indexOf(var4)) {
                          stackIn_20_0 = ll.field_a;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      } else {
                        L3: {
                          if (0 == var3) {
                            break L3;
                          } else {
                            if (var3 != -1 + var2_int) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackIn_16_0 = ll.field_a;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_7_0 = vi.field_l;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("nc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              return stackIn_20_0;
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = 67 % ((param0 - 1) / 43);
        field_p = null;
        field_n = null;
    }

    nc(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            this.field_q = param3;
            this.field_s = param5;
            fieldTemp$0 = hl.field_B;
            hl.field_B = hl.field_B + 1;
            this.field_j = fieldTemp$0 & 65535;
            this.field_i = param2;
            this.field_o = param4;
            this.field_m = param6;
            this.field_l = param1;
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "nc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = null;
    }
}
