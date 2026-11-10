/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fua implements isa {
    static BufferedCacheFile field_b;
    static int[] field_h;
    private static String[] behaviourTypeNames;
    static String field_e;
    static SecondaryNodeHashTable field_a;
    private DropdownList field_d;
    static boolean field_g;
    static Sprite[] field_f;

    final static boolean a(int param0, int param1, int param2) {
        if (param0 <= 88) {
          return true;
        }
        return (param1 & 32768) != 0 ? true : false;
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_a = null;
        if (param0 < -118) {
          field_b = null;
          field_h = null;
          field_e = null;
          behaviourTypeNames = null;
          return;
        }
        field_h = (int[]) null;
        field_b = null;
        field_h = null;
        field_e = null;
        behaviourTypeNames = null;
    }

    public final void a(UiWidget param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        try {
          if (param2 != 16777215) {
            return;
          }
          var6_int = param1 + param0.field_i;
          var7 = param0.field_n + param3;
          bl.a(param0.field_m, var7, param0.field_p, var6_int, 1);
          if (param0.hasKeyboardFocus((byte) -34)) {
            nn.a(var6_int + 2, 2 + var7, -4 + param0.field_p, param0.field_m - 4, false);
          }
          SoftwareRasterizer.b(var6_int, var7, var6_int + (param0.field_m - 2), var7 + param0.field_p);
          var8 = this.field_d.field_z.d(124);
          if (var8 != null) {
            var9 = var8.toString();
            this.field_d.field_H.c(var9, var6_int + 2, -1 + (param0.field_p + this.field_d.field_H.field_w >> 1) + var7, 10000536, -1);
            if (this.field_d.hasKeyboardFocus((byte) -34) &&
              var9.startsWith(this.field_d.field_w)) {
              var10 = this.field_d.field_H.b(this.field_d.field_w);
              SoftwareRasterizer.c(2 + var6_int, var7 + 2, var10, -4 + param0.field_p, 2188450, 100);
            }
          }
          SoftwareRasterizer.b();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("fua.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    fua(DropdownList param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fua.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        behaviourTypeNames = new String[33];
        behaviourTypeNames[27] = "Vortex";
        behaviourTypeNames[11] = "Random Maze";
        behaviourTypeNames[2] = "Crusher";
        behaviourTypeNames[7] = "Item: Power-up";
        behaviourTypeNames[17] = "Pressure Switch";
        behaviourTypeNames[13] = "On Simple Condition";
        behaviourTypeNames[16] = "Spawner";
        behaviourTypeNames[5] = "Item: Weapon";
        behaviourTypeNames[30] = "Trip Beam";
        behaviourTypeNames[19] = "Touch Switch";
        behaviourTypeNames[15] = "Snake Pit";
        behaviourTypeNames[9] = "Platform";
        behaviourTypeNames[6] = "Item: Power-down";
        behaviourTypeNames[23] = "Text Spewer";
        behaviourTypeNames[26] = "Wind Zone";
        behaviourTypeNames[14] = "Simple Action";
        behaviourTypeNames[31] = "Fuse";
        behaviourTypeNames[24] = "Damageable";
        behaviourTypeNames[28] = "Portal";
        behaviourTypeNames[0] = "Constant Effect";
        behaviourTypeNames[8] = "Pit";
        behaviourTypeNames[29] = "Mirror";
        behaviourTypeNames[22] = "Player Sensor";
        behaviourTypeNames[10] = "Safe Zone";
        behaviourTypeNames[18] = "Effect Switch";
        behaviourTypeNames[21] = "Time Switch";
        behaviourTypeNames[20] = "Weapon Shooter";
        behaviourTypeNames[3] = "Darkness";
        behaviourTypeNames[32] = "Key Lock";
        behaviourTypeNames[1] = "Conveyor";
        behaviourTypeNames[25] = "Item: Misc";
        behaviourTypeNames[12] = "Simple Block";
        behaviourTypeNames[4] = "Beam Shooter";
        field_e = "Connection restored.";
        field_g = true;
    }
}
