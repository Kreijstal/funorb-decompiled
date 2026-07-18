/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    int field_f;
    static int[] field_d;
    static int[] field_b;
    int field_a;
    static int[] field_g;
    static byte[] field_c;
    static int[] field_h;
    static int field_e;

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!on.b(-93)) {
                L2: {
                  kk.field_m.a((byte) -33, dn.a(ha.field_b, false, ei.field_K), dn.a(nc.field_j, false, hp.field_D));
                  if (!kk.field_m.d(-120)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  var2 = param0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (kk.field_m.field_d < 0) {
                      break L3;
                    } else {
                      var2 = gn.field_a[kk.field_m.field_d];
                      if (var2 == 2) {
                        sl.a((byte) 85);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_12_0 = var2;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                kk.field_m.a(21657);
                if (!kk.field_m.d(-122)) {
                  continue L1;
                } else {
                  var1_int = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "cg.B(" + param0 + ')');
        }
        return stackIn_13_0;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_h = null;
        field_d = null;
        field_g = null;
        field_c = null;
    }

    cg(int param0, int param1, int param2, int param3) {
        ((cg) this).field_a = param3;
        ((cg) this).field_f = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return param1 - -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[24];
        field_d = new int[24];
        field_c = new byte[520];
        field_h = new int[24];
        field_g = new int[32];
        field_b[0] = 6;
        field_d[0] = 0;
        field_h[0] = 4;
        field_b[1] = 8;
        field_d[1] = 6;
        field_b[23] = 16;
        field_h[1] = 4;
        field_d[23] = 6;
        field_h[23] = 4;
        field_b[2] = 10;
        field_d[2] = 18;
        field_b[3] = 3;
        field_h[2] = 7;
        field_d[3] = 12;
        field_h[3] = 4;
        field_b[16] = 3;
        field_d[16] = 12;
        field_b[10] = 8;
        field_h[16] = 4;
        field_d[10] = 24;
        field_h[10] = 3;
        field_b[11] = 20;
        field_d[11] = 24;
        field_h[11] = 1;
        field_b[4] = 20;
        field_d[4] = 0;
        field_h[4] = 7;
        field_b[5] = 5;
        field_d[5] = 7;
        field_h[5] = 7;
        field_b[6] = 10;
        field_d[6] = 7;
        field_h[6] = 7;
        field_b[7] = 6;
        field_d[7] = 14;
        field_h[7] = 4;
        field_b[21] = 6;
        field_d[21] = 14;
        field_b[9] = 2;
        field_h[21] = 4;
        field_d[9] = 42;
        field_h[9] = 6;
        field_b[12] = 50;
        field_d[12] = 14;
        field_h[12] = 1;
        field_b[13] = 35;
        field_d[13] = 39;
        field_b[14] = 12;
        field_h[13] = 3;
        field_d[14] = 30;
        field_b[15] = 12;
        field_h[14] = 5;
        field_d[15] = 25;
        field_b[22] = 30;
        field_h[15] = 5;
        field_d[22] = 48;
        field_h[22] = 1;
        field_b[17] = 8;
        field_d[17] = 18;
        field_b[8] = 4;
        field_h[17] = 8;
        field_d[8] = 4;
        field_h[8] = 4;
        field_b[19] = 10;
        field_d[19] = 34;
        field_h[19] = 6;
    }
}
