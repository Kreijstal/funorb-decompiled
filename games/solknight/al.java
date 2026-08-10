/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends gg {
    int field_m;
    static int field_n;
    int[] field_h;
    static int field_p;
    int field_l;
    int field_i;
    int field_o;
    int field_k;
    int field_j;

    final static void a(byte param0, hf param1) {
        int var2_int = 0;
        hf var3 = null;
        int var4 = 0;
        java.math.BigInteger var5 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param1.field_e != null) {
              L1: {
                if (param0 == -70) {
                  break L1;
                } else {
                  var5 = (java.math.BigInteger) null;
                  al.a((gb) null, (gb) null, (byte) 2, (java.math.BigInteger) null, (java.math.BigInteger) null);
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (0 != param1.field_j) {
                    break L3;
                  } else {
                    if (-1 != (param1.field_a ^ -1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L4: while (true) {
                  if (field_p <= var2_int) {
                    break L2;
                  } else {
                    L5: {
                      var3 = kc.field_K[var2_int];
                      if (var3.field_i != 2) {
                        break L5;
                      } else {
                        if (var3.field_j != param1.field_j) {
                          break L5;
                        } else {
                          if (param1.field_a == var3.field_a) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L4;
                  }
                }
              }
              L6: {
                if (null == param1.field_g) {
                  break L6;
                } else {
                  break L6;
                }
              }
              qg.a(param1, (byte) -92);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("al.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int[] param4, int param5, int param6, int param7) {
        try {
            this.field_k = param2;
            this.field_l = param0;
            this.field_i = param1;
            this.field_h = param4;
            int var9_int = 10 % ((param3 - -67) / 56);
            this.field_o = param7;
            this.field_j = param6;
            this.field_m = param5;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "al.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(gb param0, gb param1, byte param2, java.math.BigInteger param3, java.math.BigInteger param4) {
        try {
            ci.a(param0.field_l, param0.field_m, 8, param3, 0, param4, param1);
            if (param2 <= 71) {
                java.math.BigInteger var6 = (java.math.BigInteger) null;
                al.a((gb) null, (gb) null, (byte) 9, (java.math.BigInteger) null, (java.math.BigInteger) null);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "al.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    al() {
    }

    static {
    }
}
