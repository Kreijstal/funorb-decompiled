/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends mfb {
    static boolean field_b;

    final static llb i(byte param0) {
        if (param0 >= -75) {
          field_b = true;
          return re.field_n.field_yb;
        }
        return re.field_n.field_yb;
    }

    final int a(byte param0) {
        int var2 = 70 / ((param0 + 48) / 43);
        return SetTorpedoEnergyUsed.field_q;
    }

    final int k(int param0) {
        if (param0 != 0) {
          return -51;
        }
        return 6;
    }

    final static int a(int param0, byte param1) {
        if (param1 != -78) {
          dm.a(-119, (byte) -85);
          if (param0 == 3) {
            return Particle.field_l * wkb.field_a;
          }
          if (param0 == 12) {
            return Particle.field_l * wkb.field_a;
          }
          return wkb.field_a * Particle.field_l;
        }
        if (param0 == 3) {
          return Particle.field_l * wkb.field_a;
        }
        if (param0 == 12) {
          return Particle.field_l * wkb.field_a;
        }
        return wkb.field_a * Particle.field_l;
    }

    final int f(byte param0) {
        if (param0 < 0) {
          this.b(-118);
          return Particle.field_m;
        }
        return Particle.field_m;
    }

    final int d(byte param0) {
        if (param0 > -52) {
          return 120;
        }
        return ana.field_f;
    }

    final int b(boolean param0) {
        if (param0) {
          return -12;
        }
        return GetPlayerRepairAmount.field_o;
    }

    final int a(boolean param0) {
        if (param0) {
          return -72;
        }
        return 39;
    }

    final int g(byte param0) {
        if (param0 >= -12) {
          field_b = true;
          return LoadSettings.field_s;
        }
        return LoadSettings.field_s;
    }

    final boolean c(boolean param0) {
        if (!param0) {
          this.c(false);
          return true;
        }
        return true;
    }

    final int b(int param0) {
        int var2 = -98 / ((7 - param0) / 47);
        return khb.field_c;
    }

    final int c(int param0) {
        if (param0 != 0) {
          return 125;
        }
        return GetMissileLauncherRandomness.field_p;
    }

    final int a(int param0) {
        if (param0 != 0) {
          field_b = false;
          return SetShipAimLines.field_q;
        }
        return SetShipAimLines.field_q;
    }

    dm() {
    }

    static {
        field_b = false;
    }
}
