/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int field_b;
    static sd field_c;
    static int field_d;
    static int[] field_a;

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (-18 >= (var1_int ^ -1)) {
                    break L3;
                  } else {
                    pe.field_d[var1_int].field_e[0] = (float)(-(10 * var1_int) + 320);
                    pe.field_d[var1_int].field_e[1] = (float)(-20 - 20 * var1_int);
                    pe.field_d[var1_int].field_i[0] = (float)(320 + -(10 * var1_int));
                    pe.field_d[var1_int].field_i[1] = (float)(-20 - 20 * var1_int);
                    pe.field_d[var1_int].field_f[0] = 0.0f;
                    pe.field_d[var1_int].field_f[1] = 1000.0f;
                    var1_int++;
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var1_int = -38 / ((param0 - 78) / 46);
                bl.field_f = 640;
                mh.field_D = 640;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "fl.C(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -45) {
            fl.a((byte) 31);
        }
    }

    final static void a(int param0) {
        if ((ol.field_e ^ -1) > param0) {
          w.a(-1, 32 + ol.field_e);
          if (MonkeyPuzzle2.field_F) {
            w.a(-1, 256);
            return;
          } else {
            return;
          }
        } else {
          w.a(-1, 256);
          return;
        }
    }

    static {
        field_a = new int[11];
        field_c = new sd();
    }
}
