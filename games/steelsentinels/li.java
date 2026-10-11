/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends ag {
    static long field_w;
    static fm field_x;
    static String field_y;
    static String field_C;
    static int field_v;
    static IndexedSprite[] field_z;
    static String[] field_B;
    static int field_A;
    static String field_E;
    static RgbSprite[][] field_D;

    final static boolean c(int param0) {
        if (param0 != 8) {
          li.d(28);
          if (!ParticleEffect.g(2)) {
            return false;
          }
          if ((8 & a.field_c) == 0) {
            return true;
          }
          return false;
        }
        if (!ParticleEffect.g(2)) {
          return false;
        }
        if ((8 & a.field_c) == 0) {
          return true;
        }
        return false;
    }

    final static void e(int param0) {
        if (vb.field_e) {
          SoftwareRaster.f(SoftwareRaster.field_i, SoftwareRaster.field_l, SoftwareRaster.field_b - SoftwareRaster.field_i, -SoftwareRaster.field_l + SoftwareRaster.field_d);
          qf.field_c.a(false, (byte) 127);
        }
        if (param0 == 0) {
          return;
        }
        field_D = (RgbSprite[][]) null;
    }

    li(int param0) {
        this(tj.field_e, param0);
    }

    final String c(int param0, lh param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            field_y = (String) null;
          }
          stackIn_3_0 = vn.a('*', -7477, param1.field_y.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("li.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_x = null;
        field_y = null;
        field_C = null;
        field_z = null;
        field_D = (RgbSprite[][]) null;
        if (param0 == -30874) {
          field_E = null;
          field_B = null;
          return;
        }
        li.d(-15);
        field_E = null;
        field_B = null;
    }

    private li(BitmapFont param0, int param1) {
        super(param0, param1);
    }

    static {
        field_x = new fm(11, 0, 1, 2);
        field_B = new String[]{"Close assault guns", "Flak cannons", "Explosive cannons", "Rifled cannons", "Artillery", "Bombs", "Energised kinetic weapons", "Laser weapons", "Super laser weapons", "Plasma weapons", "EMP weapons", "Rapier missiles", "Air death missiles", "Piercer rockets", "EMP rockets", "Airburst rockets", "Multirockets", "Heavy rockets", "Destructor rockets", "Atomics"};
        field_C = "This game has started.";
        field_y = "Music: ";
        field_E = "Get access to new components by expending solarite cubes on engineering. Until you engineer a component, it cannot be equipped on a sentinel.";
    }
}
