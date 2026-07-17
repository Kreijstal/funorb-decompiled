/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class t {
    static si field_b;
    static String[] field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 <= 112) {
            field_a = null;
        }
        if (0 != (1 << param0 & param1)) {
            return true;
        }
        return false;
    }

    abstract void a(uf param0, int param1);

    final static void b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (8 <= var1_int) {
                break L0;
              } else {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 3) {
                    var1_int++;
                    continue L1;
                  } else {
                    L3: {
                      if (ol.field_c[var1_int][var2][4] <= 0) {
                        break L3;
                      } else {
                        ol.field_c[var1_int][var2][4] = ol.field_c[var1_int][var2][4] - 1;
                        break L3;
                      }
                    }
                    var2++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "t.J(" + 1 + 41);
        }
    }

    final static void a(int param0) {
        we.field_c = new String[37][];
        we.field_c[5] = new String[1];
        we.field_c[13] = new String[1];
        we.field_c[14] = new String[1];
        we.field_c[7] = new String[1];
        we.field_c[15] = new String[1];
        int var1 = 106;
        we.field_c[16] = new String[1];
        we.field_c[4] = new String[1];
        we.field_c[2] = new String[1];
        we.field_c[6] = new String[1];
        we.field_c[0] = new String[1];
        we.field_c[12] = new String[1];
        we.field_c[3] = new String[1];
        we.field_c[1] = new String[1];
        we.field_c[11] = new String[1];
        we.field_c[17] = new String[1];
        we.field_c[20] = new String[2];
        we.field_c[31] = new String[2];
        we.field_c[18] = new String[1];
        we.field_c[19] = new String[1];
        we.field_c[36] = new String[1];
        we.field_c[29] = new String[1];
        we.field_c[30] = new String[1];
        we.field_c[28] = new String[1];
        we.field_c[10] = new String[1];
        we.field_c[9] = new String[1];
        we.field_c[8] = new String[1];
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        int var1 = -1;
    }

    abstract am a(boolean param0);

    final static String d(int param0) {
        int var1 = 94;
        return kg.field_P;
    }

    final static void c(int param0) {
        if (~(0 - vk.field_h) != ~jc.field_c) {
            if (jc.field_c == 250 + -vk.field_h) {
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"By rating", "By win percentage"};
    }
}
