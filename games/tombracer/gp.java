/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp {
    private static String[] field_l;
    private static String[] directionNames;
    private static String[] field_e;
    static float[] field_d;
    static int[] field_i;
    private static String[] effectTypeNames;
    private static String[] collisionClassNames;
    private static String[] pushModeNames;
    static int field_m;
    static int field_h;
    private static int[] field_a;
    private static String[] field_b;
    private static String[] difficultyNames;
    private static String field_z;

    public static void releaseStatics(int param0) {
        difficultyNames = null;
        pushModeNames = null;
        field_a = null;
        field_l = null;
        if (param0 < -76) {
          field_d = null;
          field_b = null;
          directionNames = null;
          field_e = null;
          field_i = null;
          collisionClassNames = null;
          effectTypeNames = null;
          return;
        }
        gp.releaseStatics(-113);
        field_d = null;
        field_b = null;
        directionNames = null;
        field_e = null;
        field_i = null;
        collisionClassNames = null;
        effectTypeNames = null;
    }

    static {
        field_z = "gp.A(";
        field_d = new float[4];
        field_m = 20;
        effectTypeNames = new String[6];
        effectTypeNames[5] = "Cold";
        effectTypeNames[4] = "Water";
        effectTypeNames[3] = "Heat";
        effectTypeNames[0] = "Damage";
        effectTypeNames[1] = "Light";
        pushModeNames = new String[3];
        pushModeNames[2] = "Push, Crush";
        pushModeNames[0] = "No Push";
        collisionClassNames = new String[5];
        pushModeNames[1] = "Push, Harmless";
        collisionClassNames[4] = "Wall";
        collisionClassNames[3] = "Block";
        collisionClassNames[1] = "Player";
        collisionClassNames[2] = "Monster";
        collisionClassNames[0] = "None";
        difficultyNames = new String[3];
        difficultyNames[2] = "Harrrrd";
        difficultyNames[1] = "Normal";
        directionNames = new String[4];
        difficultyNames[0] = "Easy";
        directionNames[2] = "Down";
        field_e = new String[8];
        directionNames[3] = "Left";
        directionNames[1] = "Right";
        directionNames[0] = "Up";
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
