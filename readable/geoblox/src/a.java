/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static int[] cameraMeshVertexX;
    static IntrusiveDeque attachedEntities;
    static String[] field_a;
    static int field_e;
    static String retryText;
    private static String field_z;

    public static void a(byte param0) {
        retryText = null;
        cameraMeshVertexX = null;
        attachedEntities = null;
        if (param0 > -63) {
            a.a((byte) 92);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_z = "a.A(";
        cameraMeshVertexX = new int[8192];
        field_a = new String[]{"Welcome to Geoblox!", "The controls", "How to play", "Bonuses", "Special geoblox", "Special geoblox cont."};
        field_e = -1;
        retryText = "Retry";
        attachedEntities = new IntrusiveDeque();
    }
}
