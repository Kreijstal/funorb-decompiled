/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp {
    private static String[] field_l;
    private static String[] field_f;
    private static String[] field_e;
    static float[] field_d;
    static int[] field_i;
    private static String[] field_k;
    private static String[] field_c;
    private static String[] field_j;
    static int field_m;
    static int field_h;
    private static int[] field_a;
    private static String[] field_b;
    private static String[] field_g;
    private static String field_z;

    public static void a(int param0) {
        field_g = null;
        field_j = null;
        field_a = null;
        field_l = null;
        if (param0 >= -76) {
          gp.a(-113);
          field_d = null;
          field_b = null;
          field_f = null;
          field_e = null;
          field_i = null;
          field_c = null;
          field_k = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_f = null;
          field_e = null;
          field_i = null;
          field_c = null;
          field_k = null;
          return;
        }
    }

    static {
        field_z = "gp.A(";
        field_d = new float[4];
        field_m = 20;
        field_k = new String[6];
        field_k[5] = "Cold";
        field_k[4] = "Water";
        field_k[3] = "Heat";
        field_k[0] = "Damage";
        field_k[1] = "Light";
        field_j = new String[3];
        field_j[2] = "Push, Crush";
        field_j[0] = "No Push";
        field_c = new String[5];
        field_j[1] = "Push, Harmless";
        field_c[4] = "Wall";
        field_c[3] = "Block";
        field_c[1] = "Player";
        field_c[2] = "Monster";
        field_c[0] = "None";
        field_g = new String[3];
        field_g[2] = "Harrrrd";
        field_g[1] = "Normal";
        field_f = new String[4];
        field_g[0] = "Easy";
        field_f[2] = "Down";
        field_e = new String[8];
        field_f[3] = "Left";
        field_f[1] = "Right";
        field_f[0] = "Up";
        field_e[4] = "S";
        field_a = new int[3];
        field_e[7] = "NW";
        field_e[2] = "E";
        field_e[5] = "SW";
        field_e[6] = "W";
        field_e[0] = "N";
        field_e[1] = "NE";
        field_e[3] = "SE";
        field_a[0] = 150;
        field_i = new int[3];
        field_a[1] = 500;
        field_a[2] = 1000;
        field_l = new String[4];
        field_i[0] = 10;
        field_i[2] = 160;
        field_i[1] = 80;
        field_l[1] = "Top Down";
        field_b = new String[2];
        field_l[0] = "Normal";
        field_l[3] = "Lowest";
        field_l[2] = "Lower";
        field_b[0] = "Normal";
        field_b[1] = "Gloomy";
    }
}
