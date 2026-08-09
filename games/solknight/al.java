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
        hf stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
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
                  L4: {
                    if (0 != param1.field_j) {
                      break L4;
                    } else {
                      if (-1 != (param1.field_a ^ -1)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = 0;
                  L5: while (true) {
                    if (field_p <= var2_int) {
                      break L3;
                    } else {
                      var3 = kc.field_K[var2_int];
                      stackIn_19_0 = (hf) (var3);

                      if (var4 != 0) {
                        break L2;
                      } else {
                        L6: {
                          if (stackIn_19_0.field_i != 2) {
                            break L6;
                          } else {
                            if (var3.field_j != param1.field_j) {
                              break L6;
                            } else {
                              if (param1.field_a == var3.field_a) {
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var4 == 0) {
                          continue L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L7: {
                  if (null == param1.field_g) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                stackIn_19_0 = (hf) (param1);
                break L2;
              }
              qg.a(stackIn_19_0, (byte) -92);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("al.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
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
        RuntimeException runtimeException = null;
        java.math.BigInteger var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ci.a(param0.field_l, param0.field_m, 8, param3, 0, param4, param1);
              if (param2 > 71) {
                break L1;
              } else {
                var6 = (java.math.BigInteger) null;
                al.a((gb) null, (gb) null, (byte) 9, (java.math.BigInteger) null, (java.math.BigInteger) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("al.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    al() {
    }

    static {
    }
}
