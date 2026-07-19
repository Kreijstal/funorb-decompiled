/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cm {
    static int field_j;
    int field_a;
    int field_g;
    int field_d;
    int field_e;
    static bh field_b;
    static mf field_i;
    int field_h;
    static int field_f;
    int field_c;

    final static void a(byte param0) {
        if (!hi.a((byte) -72)) {
          return;
        } else {
          if (param0 != -28) {
            cm.a((byte) 87);
            pf.a(4, 1, false);
            return;
          } else {
            pf.a(4, 1, false);
            return;
          }
        }
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_i = null;
        if (param0 < 44) {
            discarded$0 = cm.b(91);
            field_b = null;
            return;
        }
        field_b = null;
    }

    abstract void a(int param0, int param1);

    final static int b(int param0) {
        if (param0 < 34) {
            return 54;
        }
        return 1;
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            gi.a(true, 0, qh.field_D, -3300, lc.field_u, param0, ea.field_a);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (qh.field_D <= var2_int) {
                    break L3;
                  } else {
                    mh.field_y[param0 + var2_int] = var2_int;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_int = -9 % ((79 - param1) / 38);
                gi.a(false, param0, qh.field_D - -param0, -3300, ok.field_L, param0 - -param0, ak.field_f);
                break L2;
              }
              if (param0 < qh.field_D) {
                qh.field_D = param0;
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "cm.I(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_b = null;
    }
}
