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
        i.a(false, param2, -5136, param1);
        int var3 = 59 % ((param0 - 43) / 38);
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_e = null;
        field_k = null;
        field_h = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Chess.field_G;
        var1 = (Object) (Object) lg.field_d;
        synchronized (var1) {
          L0: {
            L1: {
              ph.field_h = ta.field_y;
              si.field_o = si.field_o + 1;
              if (0 <= lk.field_e) {
                L2: while (true) {
                  if (sc.field_i == lk.field_e) {
                    break L1;
                  } else {
                    var2 = kl.field_h[sc.field_i];
                    sc.field_i = 1 + sc.field_i & 127;
                    if (0 <= var2) {
                      ok.field_Jb[var2] = true;
                      continue L2;
                    } else {
                      ok.field_Jb[var2 ^ -1] = false;
                      continue L2;
                    }
                  }
                }
              } else {
                var2 = 0;
                L3: while (true) {
                  if (var2 >= 112) {
                    lk.field_e = sc.field_i;
                    break L1;
                  } else {
                    ok.field_Jb[var2] = false;
                    var2++;
                    continue L3;
                  }
                }
              }
            }
            L4: {
              ta.field_y = ce.field_e;
              if (param0 == 12) {
                break L4;
              } else {
                field_k = null;
                break L4;
              }
            }
            break L0;
          }
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
