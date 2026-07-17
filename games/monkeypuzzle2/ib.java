/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static le field_d;
    static int field_a;
    static le field_b;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 2) {
          L0: {
            L1: {
              if (this == (Object) (Object) qk.field_c) {
                break L1;
              } else {
                if ((Object) (Object) ea.field_a == this) {
                  break L1;
                } else {
                  if (this != (Object) (Object) wh.field_b) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    final static void c() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              L2: {
                if (var2 >= jk.field_A) {
                  break L2;
                } else {
                  L3: {
                    if (null == jk.field_C[var2]) {
                      break L3;
                    } else {
                      if (!jk.field_C[var2].h()) {
                        var2++;
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var1_int = 1;
                  break L2;
                }
              }
              if (var1_int == 0) {
                return;
              } else {
                int discarded$4 = 96;
                int discarded$5 = 100;
                jk.field_C[var2] = li.a(ke.field_h[2]);
                na.a((byte) 38, jk.field_C[var2]);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) (Object) runtimeException, "ib.B(" + 100 + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_d = null;
        int var1 = 1;
    }

    static {
    }
}
