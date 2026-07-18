/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gea extends bw {
    int field_h;
    static String field_f;
    static String field_g;
    int field_o;
    int field_j;
    static String field_l;
    int field_m;
    int field_k;
    int field_i;
    static String field_n;

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == 4231) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == baa.field_z) {
                  break L3;
                } else {
                  if (am.field_R != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              baa.field_z = new int[256];
              am.field_R = new int[256];
              var1_int = 0;
              L4: while (true) {
                if (256 <= var1_int) {
                  break L2;
                } else {
                  var2 = 6.283185307179586 * ((double)var1_int / 255.0);
                  baa.field_z[var1_int] = (int)(Math.sin(var2) * 4096.0);
                  am.field_R[var1_int] = (int)(4096.0 * Math.cos(var2));
                  var1_int++;
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "gea.B(" + param0 + ')');
        }
    }

    public static void b() {
        field_l = null;
        field_n = null;
        field_f = null;
        field_g = null;
    }

    private gea() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Quick Chat lobby";
        field_g = "No players";
        field_l = "Blocks impede your progress, the creature will have to go around instead.";
        field_n = "This move is on cooldown.";
    }
}
