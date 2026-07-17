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
        return (param1 & 32768) != 0 ? true : false;
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
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param2 == 16777215) {
              L1: {
                var6_int = param1 + param0.field_i;
                var7 = param0.field_n + param3;
                int discarded$2 = 1;
                bl.a(param0.field_m, var7, param0.field_p, var6_int);
                if (param0.b((byte) -34)) {
                  int discarded$3 = 0;
                  nn.a(var6_int - -2, 2 + var7, -4 + param0.field_p, param0.field_m - 4);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                bea.b(var6_int, var7, var6_int + (param0.field_m + -2), var7 - -param0.field_p);
                var8 = ((fua) this).field_d.field_z.d(124);
                if (var8 != null) {
                  var9 = var8.toString();
                  ((fua) this).field_d.field_H.c(var9, var6_int + 2, -1 + (param0.field_p + ((fua) this).field_d.field_H.field_w >> 1) + var7, 10000536, -1);
                  if (!((fua) this).field_d.b((byte) -34)) {
                    break L2;
                  } else {
                    if (!var9.startsWith(((fua) this).field_d.field_w)) {
                      break L2;
                    } else {
                      var10 = ((fua) this).field_d.field_H.b(((fua) this).field_d.field_w);
                      bea.c(2 + var6_int, var7 - -2, var10, -4 + param0.field_p, 2188450, 100);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              bea.b();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("fua.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    fua(rla param0) {
        try {
            ((fua) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fua.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
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
