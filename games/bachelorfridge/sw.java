/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sw extends td {
    static kv field_p;

    final ii a(op param0, int param1) {
        ii stackIn_3_0 = null;
        mna stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        mna var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        aga var9 = null;
        int var10 = 0;
        aga var11 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var11 = this.field_h.a(68, param0);
            var4 = new mna(this.field_g, new nq(var11));
            var4.field_q = this.field_i;
            var4.a(this.field_i, (byte) 106, var11, param0);
            var5 = var11.field_x;
            if (param1 == 3) {
              L1: {
                var6 = var11.field_J;
                var7 = var5;
                var8 = var6;
                if ((this.field_i ^ -1) == -3) {
                  var7--;
                  break L1;
                } else {
                  if (4 == this.field_i) {
                    var7++;
                    break L1;
                  } else {
                    if (1 != this.field_i) {
                      if (3 == this.field_i) {
                        var8++;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      var8--;
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var9 = param0.field_a[var7][var8].field_l;
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.i(107)) {
                    var4.field_o.a(new iv(new nq(var9), false, 1, 0, 29), true);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_18_0 = (mna) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = (ii) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("sw.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ii) ((Object) stackIn_18_0);
        }
    }

    sw(int param0, aga param1, int param2) {
        super(param0, param1);
        try {
            this.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "sw.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                field_p = (kv) null;
                break L1;
              }
            }
            var4_int = param0.length();
            param0.setLength(param2);
            var5 = var4_int;
            L2: while (true) {
              if (var5 >= param2) {
                stackIn_7_0 = (StringBuilder) (param0);
                break L0;
              } else {
                param0.setCharAt(var5, param3);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("sw.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_p = (kv) null;
        }
        field_p = null;
    }

    static {
    }
}
