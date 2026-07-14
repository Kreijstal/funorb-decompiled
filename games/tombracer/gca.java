/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gca {
    static nh field_a;
    int field_c;
    static String field_l;
    static String[] field_j;
    static int field_d;
    int field_k;
    int field_h;
    static ka[] field_g;
    static int[] field_f;
    int field_b;
    int field_m;
    int field_e;
    private static String[] field_i;

    public static void b(int param0) {
        field_g = null;
        field_f = null;
        field_l = null;
        field_i = null;
        field_a = null;
        if (param0 != 4) {
          gca.b(23);
          field_j = null;
          return;
        } else {
          field_j = null;
          return;
        }
    }

    final gca a(int param0) {
        if (param0 != 6) {
          field_j = null;
          return new gca(((gca) this).field_h, ((gca) this).field_m, ((gca) this).field_k, ((gca) this).field_e, ((gca) this).field_b, ((gca) this).field_c);
        } else {
          return new gca(((gca) this).field_h, ((gca) this).field_m, ((gca) this).field_k, ((gca) this).field_e, ((gca) this).field_b, ((gca) this).field_c);
        }
    }

    final void a(byte param0, gca param1) {
        ((gca) this).field_b = param1.field_b;
        if (param0 >= -58) {
          ((gca) this).field_h = 8;
          ((gca) this).field_e = param1.field_e;
          ((gca) this).field_h = param1.field_h;
          ((gca) this).field_k = param1.field_k;
          ((gca) this).field_c = param1.field_c;
          ((gca) this).field_m = param1.field_m;
          return;
        } else {
          ((gca) this).field_e = param1.field_e;
          ((gca) this).field_h = param1.field_h;
          ((gca) this).field_k = param1.field_k;
          ((gca) this).field_c = param1.field_c;
          ((gca) this).field_m = param1.field_m;
          return;
        }
    }

    gca(int param0) {
        ((gca) this).field_m = 128;
        ((gca) this).field_k = 128;
        ((gca) this).field_h = param0;
    }

    final static void a(int param0, int param1, int param2) {
        eq.field_r = param1;
        tqa.field_g = param2;
        if (param0 != 2533) {
            field_i = null;
        }
    }

    private gca(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((gca) this).field_m = 128;
        ((gca) this).field_k = 128;
        ((gca) this).field_b = param4;
        ((gca) this).field_h = param0;
        ((gca) this).field_c = param5;
        ((gca) this).field_m = param1;
        ((gca) this).field_k = param2;
        ((gca) this).field_e = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"<%0> communed with the dead", "<%0> stumbled into a skeleton", "<%0> got a bit too close to a skeleton", "<%0> forgot to load their gun", "<%0> finally realised what 'Tomb of the Dead' meant", "Someone had a bone to pick with <%0>", "<%0> messed with the undead", "<%0> now believes in the afterlife", "<%0> now realises that the walking dead aren't friendly"};
        field_d = 0;
        field_f = new int[]{28, 32};
        field_l = "Pistols contain unlimited bullets. Try shooting the block across the chasm to move it. Fire using <img=12><img=13><img=14><img=15>";
        field_i = new String[6];
        field_i[5] = "Pressure Strip Y";
        field_i[4] = "Pressure Strip X";
        field_i[3] = "Key Lock";
        field_i[1] = "Cauldron";
        field_i[2] = "Pressure Pad (2x2)";
        field_i[0] = "Pressure Pad";
    }
}
