/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lp {
    private int field_f;
    private int field_b;
    private int field_h;
    static int field_d;
    private int field_a;
    private int field_g;
    private int field_e;
    static int field_i;
    static String[][] field_c;

    public static void a(byte param0) {
        field_c = null;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!bh.b((byte) 107)) {
                L2: {
                  vp.field_Gb.a(ec.a(false, uo.field_a, ji.field_c), ec.a(false, uf.field_d, bg.field_k), -1);
                  if (vp.field_Gb.a(117)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (vp.field_Gb.field_j < 0) {
                      break L3;
                    } else {
                      var2 = di.field_b[vp.field_Gb.field_j];
                      if (2 != var2) {
                        break L3;
                      } else {
                        un.a(true);
                        break L3;
                      }
                    }
                  }
                }
                stackOut_12_0 = var2;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                vp.field_Gb.a((byte) -48);
                if (!vp.field_Gb.a(121)) {
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
          throw aa.a((Throwable) (Object) var1, "lp.A(" + 2 + 41);
        }
        return stackIn_13_0;
    }

    final void a() {
        int var6 = 0;
        int var7 = 0;
        int var1 = ((lp) this).field_g >> 16;
        int var2 = ((lp) this).field_b >> 16;
        int var3 = ((lp) this).field_e;
        if (var1 < 0) {
            var3 = var3 - (0 - var1);
            var1 = 0;
        }
        if (var2 < 0) {
            var3 = var3 - (0 - var2);
            var2 = 0;
        }
        if (var1 + var3 > 640) {
            var3 = 640 - var1;
        }
        if (var2 + var3 > 480) {
            var3 = 480 - var2;
        }
        int var4 = 640 - var3;
        int var5 = var1 + var2 * 640;
        for (var6 = -var3; var6 < 0; var6++) {
            for (var7 = -var3; var7 < 0; var7++) {
                int incrementValue$0 = var5;
                var5++;
                t.field_k[incrementValue$0] = t.field_k[incrementValue$0] + uj.field_Ob;
            }
            var5 = var5 + var4;
        }
    }

    final void b(int param0) {
        ((lp) this).field_g = ((lp) this).field_g + ((lp) this).field_h;
        ((lp) this).field_b = ((lp) this).field_b + ((lp) this).field_a;
        if (!(41943040 >= ((lp) this).field_g)) {
            ((lp) this).field_g = -((lp) this).field_f;
        }
        if (31457280 < ((lp) this).field_b) {
            ((lp) this).field_b = -((lp) this).field_f;
        }
        if (!(-((lp) this).field_f <= ((lp) this).field_g)) {
            ((lp) this).field_g = 41943040;
        }
        if (param0 >= -72) {
            return;
        }
        if (!(((lp) this).field_b >= -((lp) this).field_f)) {
            ((lp) this).field_b = 31457280;
        }
    }

    lp() {
        ((lp) this).field_g = ok.a(ea.field_b, -118, 640) << 16;
        ((lp) this).field_b = ok.a(ea.field_b, -100, 480) << 16;
        ((lp) this).field_e = ok.a(ea.field_b, -99, 90) - -10;
        ((lp) this).field_h = -65536 + ok.a(ea.field_b, -111, 131072);
        ((lp) this).field_a = -65536 + ok.a(ea.field_b, -123, 131072);
        ((lp) this).field_f = ((lp) this).field_e << 16;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = of.a(0.9, 65536);
        field_c = new String[][]{new String[3], new String[3]};
    }
}
