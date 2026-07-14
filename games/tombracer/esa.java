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
            return null;
        }
        return ((esa) this).field_b;
    }

    final static boolean a(cn param0, cn param1, int param2, cn param3) {
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        var4 = -26 / ((param2 - 18) / 61);
        if (!param1.b(-56)) {
          return false;
        } else {
          if (param1.c("commonui", -128)) {
            L0: {
              if (!param3.b(-37)) {
                break L0;
              } else {
                if (param3.c("commonui", -125)) {
                  L1: {
                    L2: {
                      if (!param0.b(-46)) {
                        break L2;
                      } else {
                        if (!param0.c("button.gif", -124)) {
                          break L2;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L1;
                        }
                      }
                    }
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L1;
                  }
                  return stackIn_12_0 != 0;
                } else {
                  break L0;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final void a(kh param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if ((param1 ^ -1) <= -16) {
          int discarded$354 = param0.e(98);
          int discarded$355 = param0.e(-67);
          int discarded$356 = param0.d(127);
          int discarded$357 = param0.d(121);
          int discarded$358 = param0.d(126);
          int discarded$359 = param0.d(121);
          int discarded$360 = param0.d(123);
          int discarded$361 = param0.d(126);
          int discarded$362 = param0.d(124);
          int discarded$363 = param0.d(123);
          int discarded$364 = param0.h(param2 + 216);
          if (param2 == 39) {
            param0.h((byte) -95);
            var4 = param0.b((byte) 44, 8);
            ((esa) this).field_d = new BitSet(var4);
            var5 = 0;
            L0: while (true) {
              if (var5 >= var4) {
                param0.i((byte) 98);
                ((esa) this).field_b.a(param0, (byte) 123);
                return;
              } else {
                if (uha.a(param2 ^ 5940, param0)) {
                  ((esa) this).field_d.set(var5);
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final BitSet b(byte param0) {
        int var2 = 126 / ((param0 - 61) / 41);
        return ((esa) this).field_d;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 102) {
            return;
        }
        field_c = null;
    }

    public esa() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        ((esa) this).field_b = new ufa();
        ((esa) this).field_d = new BitSet(aq.a(-5640));
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
                  ((esa) this).field_d.set(var2);
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
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You have withdrawn your request to join.";
    }
}
