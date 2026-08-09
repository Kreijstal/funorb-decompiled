/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static int field_b;
    static md field_a;
    static String field_c;

    final static void a(java.math.BigInteger param0, int param1, byte[] param2, ec param3, int param4, java.math.BigInteger param5, int param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var7_int = wk.a(param1, 18605);
              if (rp.field_g != null) {
                break L1;
              } else {
                rp.field_g = new java.security.SecureRandom();
                break L1;
              }
            }
            L2: {
              var13 = new int[4];
              var12 = var13;
              var8 = var12;
              if (param4 == 5471) {
                break L2;
              } else {
                field_a = (md) null;
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              if ((var9 ^ -1) <= -5) {
                L4: {
                  L5: {
                    if (null == wa.field_b) {
                      break L5;
                    } else {
                      if (wa.field_b.field_m.length >= var7_int) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  wa.field_b = new ec(var7_int);
                  break L4;
                }
                L6: {
                  L7: {
                    wa.field_b.field_o = 0;
                    wa.field_b.a(param2, 1, param1, param6);
                    wa.field_b.g(param4 + -5468, var7_int);
                    wa.field_b.a(var13, true);
                    if (t.field_d == null) {
                      break L7;
                    } else {
                      if ((t.field_d.field_m.length ^ -1) <= -101) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  t.field_d = new ec(100);
                  break L6;
                }
                t.field_d.field_o = 0;
                t.field_d.a(6, 10);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if ((var11 ^ -1) <= -5) {
                    t.field_d.i(param1, param4 ^ -5422);
                    t.field_d.a(param0, 2, param5);
                    param3.a(t.field_d.field_m, 1, t.field_d.field_o, 0);
                    param3.a(wa.field_b.field_m, param4 ^ 5470, wa.field_b.field_o, 0);
                    break L0;
                  } else {
                    t.field_d.a((byte) 63, var13[var11]);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = rp.field_g.nextInt();
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("cb.A(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ',' + param6 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 27525) {
            field_c = (String) null;
        }
        field_c = null;
    }

    static {
        field_a = new md();
        field_c = "Rot Worms";
    }
}
