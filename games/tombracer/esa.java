/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class esa {
    static String field_c;
    private ufa field_b;
    private BitSet field_d;
    static String field_a;

    final ufa a(int param0) {
        if (param0 < 72) {
            return (ufa) null;
        }
        return this.field_b;
    }

    final static boolean a(cn param0, cn param1, int param2, cn param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = -26 / ((param2 - 18) / 61);
            if (!param1.b(-56)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1.c("commonui", -128)) {
                L1: {
                  if (!param3.b(-37)) {
                    break L1;
                  } else {
                    if (param3.c("commonui", -125)) {
                      L2: {
                        if (!param0.b(-46)) {
                          break L2;
                        } else {
                          if (!param0.c("button.gif", -124)) {
                            break L2;
                          } else {
                            return true;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("esa.D(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final void a(kh param0, int param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if ((param1 ^ -1) > -16) {
            return;
        }
        param0.e(98);
        param0.e(-67);
        param0.d(127);
        param0.d(121);
        param0.d(126);
        param0.d(121);
        param0.d(123);
        param0.d(126);
        param0.d(124);
        param0.d(123);
        param0.h(param2 + 216);
        if (param2 != 39) {
            return;
        }
        try {
            param0.h((byte) -95);
            var4_int = param0.b((byte) 44, 8);
            this.field_d = new BitSet(var4_int);
            for (var5 = 0; var5 < var4_int; var5++) {
                if (uha.a(param2 ^ 5940, param0)) {
                    this.field_d.set(var5);
                }
            }
            param0.i((byte) 98);
            this.field_b.a(param0, (byte) 123);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "esa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final BitSet b(byte param0) {
        int var2 = 126 / ((param0 - 61) / 41);
        return this.field_d;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 102) {
            return;
        }
        field_c = null;
    }

    public esa() {
        int var1;
        int var2;
        int var3;
        this.field_b = new ufa();
        this.field_d = new BitSet(aq.a(-5640));
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            if (aq.a(-5640) <= var2) {
              break L1;
            } else {
              if (var1 >= 30) {
                break L1;
              } else {
                var3 = ak.a(var2, (byte) 37);
                if (!aga.a(false, var3).field_d) {
                  this.field_d.set(var2);
                  var1++;
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          }
          return;
        }
    }

    static {
        field_a = "You have withdrawn your request to join.";
    }
}
