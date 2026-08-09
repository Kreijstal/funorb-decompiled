/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static cn field_a;
    static String field_b;

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 <= -117) {
              var2_int = param1.length();
              var3 = new char[var2_int];
              var4 = 0;
              L1: while (true) {
                if (var2_int <= var4) {
                  stackIn_8_0 = new String(var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3[var2_int - (1 + var4)] = param1.charAt(var4);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("sh.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static void a(int param0, lb param1) {
        kl var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              var2 = bf.field_f[2].field_b;
              if (var2 instanceof fk) {
                ((fk) ((Object) var2)).a(param1, 83);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 27886) {
                break L2;
              } else {
                field_a = (cn) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("sh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static cf[] a(int param0, String param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        cf[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        lb var7 = null;
        cf[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var3_int = param2.length;
            var4 = new cf[var3_int];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3_int) {
                L2: {
                  if (param0 < -55) {
                    break L2;
                  } else {
                    var7 = (lb) null;
                    sh.a(-87, (lb) null);
                    break L2;
                  }
                }
                stackIn_7_0 = (cf[]) (var4);
                break L0;
              } else {
                var4[var5] = mp.a(Integer.toString(var5 + 1), param1, 0, param2[var5]);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("sh.C(").append(param0).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final static int a(int param0, int param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = 41 % ((param0 - 57) / 50);
              if ((ib.field_j + -1) * ib.field_d <= param1) {
                var3_int = param1 + -((ib.field_j - 1) * ib.field_d);
                var4 = ib.field_j + var3_int;
                break L1;
              } else {
                var3_int = param1 % (ib.field_j - 1) + ib.field_j * (param1 / (-1 + ib.field_j));
                var4 = var3_int + 1;
                break L1;
              }
            }
            L2: {
              var6 = param2[var3_int] - param2[var4];
              if (0 < var6) {
                stackIn_6_0 = var6;
                break L2;
              } else {
                stackIn_6_0 = -var6;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("sh.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_a = (cn) null;
        }
        field_a = null;
    }

    static {
        field_b = "Email is valid";
    }
}
