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
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 == 4231) {
          if (null == baa.field_z) {
            baa.field_z = new int[256];
            am.field_R = new int[256];
            var1 = 0;
            L0: while (true) {
              if (256 <= var1) {
                return;
              } else {
                var2 = 6.283185307179586 * ((double)var1 / 255.0);
                baa.field_z[var1] = (int)(Math.sin(var2) * 4096.0);
                am.field_R[var1] = (int)(4096.0 * Math.cos(var2));
                var1++;
                continue L0;
              }
            }
          } else {
            if (am.field_R == null) {
              baa.field_z = new int[256];
              am.field_R = new int[256];
              var1 = 0;
              L1: while (true) {
                if (256 <= var1) {
                  return;
                } else {
                  var2 = 6.283185307179586 * ((double)var1 / 255.0);
                  baa.field_z[var1] = (int)(Math.sin(var2) * 4096.0);
                  am.field_R[var1] = (int)(4096.0 * Math.cos(var2));
                  var1++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          field_f = null;
          if (null == baa.field_z) {
            baa.field_z = new int[256];
            am.field_R = new int[256];
            var1 = 0;
            L2: while (true) {
              if (256 > var1) {
                var2 = 6.283185307179586 * ((double)var1 / 255.0);
                baa.field_z[var1] = (int)(Math.sin(var2) * 4096.0);
                am.field_R[var1] = (int)(4096.0 * Math.cos(var2));
                var1++;
                continue L2;
              } else {
                return;
              }
            }
          } else {
            if (am.field_R == null) {
              baa.field_z = new int[256];
              am.field_R = new int[256];
              var1 = 0;
              L3: while (true) {
                if (256 > var1) {
                  var2 = 6.283185307179586 * ((double)var1 / 255.0);
                  baa.field_z[var1] = (int)(Math.sin(var2) * 4096.0);
                  am.field_R[var1] = (int)(4096.0 * Math.cos(var2));
                  var1++;
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    public static void b(int param0) {
        field_l = null;
        if (param0 != 4096) {
            field_g = null;
            field_n = null;
            field_f = null;
            field_g = null;
            return;
        }
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
