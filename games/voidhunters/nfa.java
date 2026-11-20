/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nfa extends uj {
    static int[] field_e;
    static int field_d;

    final boolean a(boolean param0) {
        if (param0) {
          nfa.clearSharedReferences(-108);
          return true;
        }
        return true;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -3408) {
          nfa.clearSharedReferences(-105);
          field_e = null;
          return;
        }
        field_e = null;
    }

    final boolean c(int param0) {
        if (param0 < 63) {
          return false;
        }
        return true;
    }

    nfa() {
    }

    final int b(byte param0) {
        if (param0 <= 79) {
          field_d = 5;
          return 103;
        }
        return 103;
    }

    final int a(int param0) {
        if (param0 != -1) {
          this.b((byte) 92);
          return SetMassDriverAimarc.field_o;
        }
        return SetMassDriverAimarc.field_o;
    }

    final int d(byte param0) {
        if (param0 != 64) {
          nfa.clearSharedReferences(64);
          return Particle.field_t;
        }
        return Particle.field_t;
    }

    static {
        field_e = new int[4];
    }
}
