/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static int field_e;
    static ge field_f;
    static String field_b;
    static int field_d;
    static int field_c;
    static int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static char a(byte param0, int param1) {
        boolean discarded$0 = false;
        int var3 = 0;
        int var2 = 255 & param0;
        if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (param1 != 63) {
            discarded$0 = cc.a(0);
        }
        if ((var2 ^ -1) <= -129) {
            if (var2 < 160) {
                var3 = se.field_K[-128 + var2];
                if (var3 == 0) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          L0: {
            var1_int = mb.field_c[0];
            var2 = 1;
            L1: while (true) {
              if (var2 >= mb.field_c.length) {
                L2: {
                  if (param0 > 34) {
                    break L2;
                  } else {
                    field_a = 35;
                    break L2;
                  }
                }
                break L0;
              } else {
                var3 = mb.field_c[var2];
                og.a(lf.field_a, var2 << -718198940, lf.field_a, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "cc.B(" + param0 + ')');
        }
    }

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_b = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this == rk.field_eb) {
              break L2;
            } else {
              if (vg.field_a == this) {
                break L2;
              } else {
                if (ad.field_q != this) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static boolean a(int param0) {
        int var1 = 100 % ((param0 - -57) / 42);
        return ei.field_e;
    }

    public static void a(byte param0) {
        if (param0 <= 98) {
            field_e = -118;
        }
        field_f = null;
        field_b = null;
    }

    static {
        field_f = new ge();
        field_b = "Type your age in years";
        field_a = 0;
    }
}
