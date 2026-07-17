/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends gn {
    int field_X;
    static ip field_cb;
    static boolean field_S;
    int field_bb;
    int field_T;
    int field_U;
    static boolean field_ab;
    int field_R;
    int field_W;
    static String[] field_N;
    static ja field_P;
    static String field_Y;
    static ri field_Q;
    static cj field_M;
    static int[] field_V;
    static String field_Z;
    static String[] field_O;

    final static boolean a(int param0, ul param1, int param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var5 = param1.a(param0, true, param2);
            var4 = var5;
            if (var5 == null) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              pd.a((byte) 108, var5);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref;
            stackOut_6_1 = new StringBuilder().append("ud.B(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + -42 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        Object var13 = null;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = -((ud) this).field_y + (-param5 + -((ud) this).field_R) + param1;
              var9 = -((ud) this).field_bb + (-((ud) this).field_i + (-param6 + param0));
              if (var8_int * var8_int + var9 * var9 < ((ud) this).field_X * ((ud) this).field_X) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - mg.field_J;
                  if (var10 >= 0.0) {
                    if (var10 <= 0.0) {
                      break L1;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)((ud) this).field_U;
                      break L1;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)((ud) this).field_U;
                    break L1;
                  }
                }
                ((ud) this).field_T = (int)(var10 * (double)((ud) this).field_U / 6.283185307179586);
                L2: while (true) {
                  if (((ud) this).field_T < ((ud) this).field_U) {
                    L3: while (true) {
                      if (((ud) this).field_T >= 0) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        ((ud) this).field_T = ((ud) this).field_T + ((ud) this).field_U;
                        continue L3;
                      }
                    }
                  } else {
                    ((ud) this).field_T = ((ud) this).field_T - ((ud) this).field_U;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            } else {
              L4: {
                if (param4 == -24) {
                  break L4;
                } else {
                  var13 = null;
                  ud.a(17, -37, (ul) null, (vp) null);
                  break L4;
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("ud.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final static void a(int param0, int param1, ul param2, vp param3) {
        try {
            if (param0 != -3758) {
                field_Q = null;
            }
            vm.field_hb = param1 * wq.a((byte) 72) / 1000;
            ui.a(7478, param2);
            lh.a(-30, param2);
            bm.a(30651, param2);
            pg.a(false);
            eh.a(-1741);
            f.field_a = 0 - vm.field_hb;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ud.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1) {
        int discarded$0 = lk.b(false);
    }

    public static void f(int param0) {
        if (param0 <= 14) {
          ud.f(-15);
          field_Z = null;
          field_Q = null;
          field_V = null;
          field_cb = null;
          field_P = null;
          field_M = null;
          field_O = null;
          field_N = null;
          field_Y = null;
          return;
        } else {
          field_Z = null;
          field_Q = null;
          field_V = null;
          field_cb = null;
          field_P = null;
          field_M = null;
          field_O = null;
          field_N = null;
          field_Y = null;
          return;
        }
    }

    private ud() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = new ip();
        field_V = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_Z = "Enter name of friend to add to list";
        field_O = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
