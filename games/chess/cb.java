/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static volatile int field_b;
    int field_j;
    int field_i;
    static int[] field_k;
    static int field_a;
    int field_d;
    static ak field_e;
    static int field_c;
    static int[][] field_h;
    static int field_f;
    int field_g;

    final static void a(int param0, String param1, String param2) {
        try {
            i.a(false, param2, -5136, param1);
            int var3_int = 0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "cb.C(" + 82 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_k = null;
        field_h = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          L0: {
            var1 = (Object) (Object) lg.field_d;
            synchronized (var1) {
              L1: {
                L2: {
                  ph.field_h = ta.field_y;
                  si.field_o = si.field_o + 1;
                  if (0 <= lk.field_e) {
                    L3: while (true) {
                      if (sc.field_i == lk.field_e) {
                        break L2;
                      } else {
                        var2 = kl.field_h[sc.field_i];
                        sc.field_i = 1 + sc.field_i & 127;
                        if (0 <= var2) {
                          ok.field_Jb[var2] = true;
                          continue L3;
                        } else {
                          ok.field_Jb[~var2] = false;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 112) {
                        lk.field_e = sc.field_i;
                        break L2;
                      } else {
                        ok.field_Jb[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                ta.field_y = ce.field_e;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1_ref, "cb.B(" + 12 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_a = 360;
        field_e = null;
    }
}
