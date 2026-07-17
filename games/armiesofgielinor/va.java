/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends ms {
    int[] field_C;
    static String field_F;
    char[] field_v;
    static int field_u;
    static int field_z;
    boolean field_H;
    static int field_D;
    static String field_B;
    String field_E;
    char[] field_x;
    static hg field_w;
    static int[] field_G;
    int[] field_y;
    static String[] field_A;

    private final void a(byte param0, vh param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        char[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        char stackOut_13_2 = 0;
        char[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char stackOut_6_2 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 81 % ((param0 - 47) / 62);
              if (param2 == 1) {
                ((va) this).field_E = param1.g(1);
                break L1;
              } else {
                if (param2 != 2) {
                  if (3 != param2) {
                    if (param2 != 4) {
                      break L1;
                    } else {
                      ((va) this).field_H = true;
                      break L1;
                    }
                  } else {
                    var5 = param1.k(0);
                    ((va) this).field_v = new char[var5];
                    ((va) this).field_y = new int[var5];
                    var6 = 0;
                    L2: while (true) {
                      if (var5 <= var6) {
                        break L1;
                      } else {
                        L3: {
                          ((va) this).field_y[var6] = param1.e((byte) -104);
                          var7 = param1.a((byte) -74);
                          stackOut_12_0 = ((va) this).field_v;
                          stackOut_12_1 = var6;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if (0 == var7) {
                            stackOut_14_0 = (char[]) (Object) stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            break L3;
                          } else {
                            stackOut_13_0 = (char[]) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = we.a(-125, (byte) var7);
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            break L3;
                          }
                        }
                        stackIn_15_0[stackIn_15_1] = (char) stackIn_15_2;
                        var6++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var5 = param1.k(0);
                  ((va) this).field_C = new int[var5];
                  ((va) this).field_x = new char[var5];
                  var6 = 0;
                  L4: while (true) {
                    if (var5 <= var6) {
                      break L1;
                    } else {
                      L5: {
                        ((va) this).field_C[var6] = param1.e((byte) -104);
                        var7 = param1.a((byte) 111);
                        stackOut_5_0 = ((va) this).field_x;
                        stackOut_5_1 = var6;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (0 == var7) {
                          stackOut_7_0 = (char[]) (Object) stackIn_7_0;
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          stackIn_8_2 = stackOut_7_2;
                          break L5;
                        } else {
                          stackOut_6_0 = (char[]) (Object) stackIn_6_0;
                          stackOut_6_1 = stackIn_6_1;
                          stackOut_6_2 = we.a(-121, (byte) var7);
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_8_2 = stackOut_6_2;
                          break L5;
                        }
                      }
                      stackIn_8_0[stackIn_8_1] = (char) stackIn_8_2;
                      var6++;
                      continue L4;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("va.D(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param2 + 41);
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var5 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != ((va) this).field_y) {
            for (var2 = 0; var2 < ((va) this).field_y.length; var2++) {
                ((va) this).field_y[var2] = oe.c(((va) this).field_y[var2], 32768);
            }
        }
        if (!(((va) this).field_C == null)) {
            var5 = 0;
            var2 = var5;
            while (var5 < ((va) this).field_C.length) {
                ((va) this).field_C[var5] = oe.c(((va) this).field_C[var5], 32768);
                var5++;
            }
        }
        if (param0 <= 6) {
            Object var4 = null;
            this.a((byte) 40, (vh) null, -40);
        }
    }

    public static void h(int param0) {
        field_B = null;
        field_F = null;
        if (param0 > -91) {
            va.h(-117);
        }
        field_A = null;
        field_G = null;
        field_w = null;
    }

    final void a(byte param0, vh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 < -79) {
              L1: while (true) {
                var3_int = param1.k(0);
                if (var3_int == 0) {
                  break L0;
                } else {
                  this.a((byte) -120, param1, var3_int);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("va.B(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    va() {
        ((va) this).field_H = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "No options available";
        field_G = new int[]{7, 1, 0, 0, 2, 5, 4, 1, 1, 1, 9, 7, 11, 11, 1, 11};
        field_B = "Connection restored.";
        field_u = 0;
        field_w = new hg();
    }
}
