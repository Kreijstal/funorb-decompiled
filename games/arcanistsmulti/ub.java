/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static int field_a;
    static int[] field_i;
    static int field_b;
    static String field_f;
    static int field_h;
    static ll[] field_e;
    static int field_g;
    static String field_d;
    static kc field_c;

    final static byte[] a(int param0, ab param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param1.d(28089, param2);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (var4_int == param3.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param1.d(28089, param0);
                var6 = (byte)param1.d(param0 + 28086, 8);
                if (var5 <= 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param3[var7] = (byte)(var6 + param1.d(hh.a(param0, 28090), var5));
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (byte[]) param3;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ub.C(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0;
    }

    final static void a(int param0, boolean param1) {
        ab var2 = he.field_e;
        var2.b((byte) -115, param0);
        var2.f(2, (byte) -128);
        var2.f(4, (byte) -43);
        var2.f(qn.k((byte) -14), (byte) -57);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 > -63) {
            ub.a(-21);
        }
        field_d = null;
        field_e = null;
        field_i = null;
        field_c = null;
    }

    final static void a(byte param0, int param1) {
        pg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        cm var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 109) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            var4 = (cm) (Object) cc.field_e.b(12623);
            L2: while (true) {
              if (var4 == null) {
                var2 = i.field_e.b(12623);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    gb.a(4, true);
                    var2 = i.field_e.a(0);
                    continue L3;
                  }
                }
              } else {
                hb.a(var4, 4, (byte) 93);
                var4 = (cm) (Object) cc.field_e.a(0);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "ub.B(" + param0 + 44 + 4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_i = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_a = 0;
        field_h = 3;
        field_f = "Only two targets left!";
        field_d = "Now, shoot the arrows as you shot the other spells, by holding the mouse button down to build up velocity and releasing to fire.";
    }
}
