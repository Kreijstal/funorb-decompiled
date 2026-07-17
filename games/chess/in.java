/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static int[] field_j;
    static mk field_g;
    static String field_e;
    static String field_h;
    static String[][] field_f;
    static boolean field_a;
    static boolean[] field_c;
    static int field_i;
    static ci field_b;
    static le field_d;

    final static java.awt.Frame a(int param0, int param1, jk param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        tm[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        tm[] var10 = null;
        nl var11 = null;
        Object stackIn_7_0 = null;
        Object stackIn_15_0 = null;
        nl stackIn_20_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_6_0 = null;
        nl stackOut_18_0 = null;
        Object stackOut_27_0 = null;
        nl stackOut_19_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = Chess.field_G;
        try {
          L0: {
            if (param2.a(true)) {
              L1: {
                if (param0 != 0) {
                  break L1;
                } else {
                  var10 = ud.a(624968802, param2);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_14_0 = null;
                          stackIn_15_0 = stackOut_14_0;
                          return (java.awt.Frame) (Object) stackIn_15_0;
                        }
                      } else {
                        L3: {
                          if (param1 != var10[var8].field_g) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (java.awt.Frame) (Object) stackIn_7_0;
                  }
                }
              }
              var11 = param2.a(param1, param5, 107, param0, 0);
              stackOut_18_0 = (nl) var11;
              stackIn_20_0 = stackOut_18_0;
              L4: while (true) {
                if (stackIn_20_0.field_f != 0) {
                  var7 = (java.awt.Frame) var11.field_b;
                  if (var7 != null) {
                    if (var11.field_f == 2) {
                      wf.a(var7, param2, 103);
                      stackOut_27_0 = null;
                      stackIn_28_0 = stackOut_27_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    return null;
                  }
                } else {
                  bc.a(10L, (byte) -106);
                  stackOut_19_0 = (nl) var11;
                  stackIn_20_0 = stackOut_19_0;
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("in.B(").append(param0).append(44).append(param1).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + 0 + 44 + 3160 + 44 + param5 + 41);
        }
        return (java.awt.Frame) (Object) stackIn_28_0;
    }

    final static int[] a() {
        return new int[8];
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        Object var4 = null;
        nj.a(param1, 2, (String) null, param2);
        if (param0 < 78) {
            field_j = null;
        }
    }

    public static void b() {
        field_b = null;
        field_g = null;
        field_f = null;
        field_h = null;
        field_d = null;
        field_e = null;
        field_c = null;
        int var1 = 0;
        field_j = null;
    }

    final static int a(String param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = -96 % ((-37 - param1) / 60);
            if (!param2) {
              stackOut_3_0 = sj.field_d.b(param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = vl.field_M.b(param0);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("in.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new mk();
        field_h = "Private";
        field_a = false;
        field_e = "Hide private chat and appear offline to friends";
    }
}
