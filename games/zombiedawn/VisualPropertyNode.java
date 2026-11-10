/*
 * Decompiled by CFR-JS 0.4.0.
 */
class VisualPropertyNode extends DualLinkNode {
    static int field_p;
    static int[] field_v;
    static String field_r;
    static boolean field_q;
    static int field_u;
    static long field_s;
    static BufferedFile field_t;
    private static String field_z;

    VisualPropertyNode() {
    }

    public static void clearStatics(int param0) {
        field_r = null;
        field_v = null;
        if (param0 >= -121) {
          field_q = false;
          field_t = null;
          return;
        }
        field_t = null;
    }

    static {
        field_z = "ce.E(";
        field_v = new int[8192];
        field_p = 0;
        field_u = 256;
        field_q = false;
    }
}
