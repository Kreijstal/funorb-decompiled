/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eda {
    int field_a;
    int field_b;
    static GameFont field_f;
    static int field_e;
    int field_c;
    int field_d;

    final static void a(int param0, boolean param1) {
        kea var3 = null;
        kia var2 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        kea var3Lifetime1;
        kea var3Lifetime2;
        kea var3Lifetime3;
        kea var3Lifetime4;
        kea var3Lifetime5;
        kia var2Lifetime1;
        kia var2Lifetime2;
        kia var2Lifetime3;
        kia var2Lifetime4;
        kia var2Lifetime5;
        if (param0 == 0) {
          var3 = baa.field_e;
          var2 = WeaponShooterBehaviour.field_r;
          BitPacketBuffer.a(param1, var2, var3);
          return;
        }
        if (param0 == 1) {
          var3Lifetime1 = tia.field_d;
          var2Lifetime1 = WeaponShooterBehaviour.field_r;
          BitPacketBuffer.a(param1, var2Lifetime1, var3Lifetime1);
          return;
        }
        if (param0 == 4) {
          var3Lifetime2 = PitModel.field_s;
          var2Lifetime2 = WeaponShooterBehaviour.field_r;
          BitPacketBuffer.a(param1, var2Lifetime2, var3Lifetime2);
          return;
        }
        if (2 == param0) {
          var2Lifetime3 = CourseLayoutFactory.field_d;
          var3Lifetime3 = baa.field_e;
          BitPacketBuffer.a(param1, var2Lifetime3, var3Lifetime3);
          return;
        }
        if (param0 != 3) {
          var3Lifetime4 = PitModel.field_s;
          var2Lifetime4 = CourseLayoutFactory.field_d;
          BitPacketBuffer.a(param1, var2Lifetime4, var3Lifetime4);
          return;
        }
        var2Lifetime5 = CourseLayoutFactory.field_d;
        var3Lifetime5 = tia.field_d;
        BitPacketBuffer.a(param1, var2Lifetime5, var3Lifetime5);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 < 24) {
          field_e = 15;
        }
    }

    static {
    }
}
