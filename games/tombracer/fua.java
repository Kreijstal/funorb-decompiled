/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fua implements isa {
    static ph field_b;
    static int[] field_h;
    private static String[] field_c;
    static String field_e;
    static af field_a;
    private rla field_d;
    static boolean field_g;
    static iu[] field_f;

    final static boolean a(int param0, int param1, int param2) {
        if (param0 <= 88) {
            return true;
        }
        return (param1 & 32768 ^ -1) != -1 ? true : false;
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        if (param0 >= -118) {
          field_h = null;
          field_b = null;
          field_h = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_h = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        if (param2 == 16777215) {
          L0: {
            var6 = param1 + param0.field_i;
            var7 = param0.field_n + param3;
            bl.a(param0.field_m, var7, param0.field_p, var6, 1);
            if (param0.b((byte) -34)) {
              nn.a(var6 - -2, 2 + var7, -4 + param0.field_p, param0.field_m - 4, false);
              break L0;
            } else {
              break L0;
            }
          }
          bea.b(var6, var7, var6 + (param0.field_m + -2), var7 - -param0.field_p);
          var8 = ((fua) this).field_d.field_z.d(124);
          if (var8 != null) {
            var9 = var8.toString();
            ((fua) this).field_d.field_H.c(var9, var6 + 2, -1 + (param0.field_p + ((fua) this).field_d.field_H.field_w >> 198752417) + var7, 10000536, -1);
            if (((fua) this).field_d.b((byte) -34)) {
              if (var9.startsWith(((fua) this).field_d.field_w)) {
                var10 = ((fua) this).field_d.field_H.b(((fua) this).field_d.field_w);
                bea.c(2 + var6, var7 - -2, var10, -4 + param0.field_p, 2188450, 100);
                bea.b();
                return;
              } else {
                bea.b();
                return;
              }
            } else {
              bea.b();
              return;
            }
          } else {
            bea.b();
            return;
          }
        } else {
          return;
        }
    }

    fua(rla param0) {
        ((fua) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[33];
        field_c[27] = "Vortex";
        field_c[11] = "Random Maze";
        field_c[2] = "Crusher";
        field_c[7] = "Item: Power-up";
        field_c[17] = "Pressure Switch";
        field_c[13] = "On Simple Condition";
        field_c[16] = "Spawner";
        field_c[5] = "Item: Weapon";
        field_c[30] = "Trip Beam";
        field_c[19] = "Touch Switch";
        field_c[15] = "Snake Pit";
        field_c[9] = "Platform";
        field_c[6] = "Item: Power-down";
        field_c[23] = "Text Spewer";
        field_c[26] = "Wind Zone";
        field_c[14] = "Simple Action";
        field_c[31] = "Fuse";
        field_c[24] = "Damageable";
        field_c[28] = "Portal";
        field_c[0] = "Constant Effect";
        field_c[8] = "Pit";
        field_c[29] = "Mirror";
        field_c[22] = "Player Sensor";
        field_c[10] = "Safe Zone";
        field_c[18] = "Effect Switch";
        field_c[21] = "Time Switch";
        field_c[20] = "Weapon Shooter";
        field_c[3] = "Darkness";
        field_c[32] = "Key Lock";
        field_c[1] = "Conveyor";
        field_c[25] = "Item: Misc";
        field_c[12] = "Simple Block";
        field_c[4] = "Beam Shooter";
        field_e = "Connection restored.";
        field_g = true;
    }
}
