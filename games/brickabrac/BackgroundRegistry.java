/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BackgroundRegistry {
    static String field_b;
    static BackgroundScene[] scenes;
    static java.awt.Frame field_e;
    static String field_a;
    static int field_c;
    private static String field_z;

    public static void a(int param0) {
        if (param0 == 0) {
          field_e = null;
          field_a = null;
          scenes = null;
          field_b = null;
          return;
        }
        field_e = (java.awt.Frame) null;
        field_e = null;
        field_a = null;
        scenes = null;
        field_b = null;
    }

    static {
        field_z = "fd.A(";
        field_b = "This password contains your Player Name, and would be easy to guess";
        scenes = new BackgroundScene[12];
        field_a = "Exploiting a bug";
        field_c = 0;
    }
}
