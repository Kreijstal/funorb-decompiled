/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ei extends DualLinkNode {
    static String field_r;
    static int field_u;
    static em[] field_v;
    static SoftwareModelMesh field_q;
    static String field_s;
    static ug field_t;
    private static String field_z;

    public static void releaseDeclaredStaticReferences(byte param0) {
        field_t = null;
        field_q = null;
        field_v = null;
        field_s = null;
        field_r = null;
        if (param0 != -55) {
          ei.releaseDeclaredStaticReferences((byte) 66);
        }
    }

    ei() {
    }

    static {
        field_z = "ei.V(";
        field_r = "Create";
        field_s = "Name";
        field_u = 0;
        field_t = new ug(0);
    }
}
