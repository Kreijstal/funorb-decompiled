/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static String[] field_h;
    static IntrusiveDeque field_e;
    static long field_d;
    static int field_b;
    static int[] field_a;
    static int field_f;
    static QuickChatDynamicCommand field_g;
    static ResourceArchive field_c;

    final static int a(byte param0) {
        if (param0 != -12) {
          return 95;
        }
        return MeshMaterial.keyboardIdleTicks;
    }

    public static void releaseStatics(boolean guard) {
        field_e = null;
        if (guard) {
          field_h = null;
          field_c = null;
          field_a = null;
          field_g = null;
          return;
        }
        field_e = (IntrusiveDeque) null;
        field_h = null;
        field_c = null;
        field_a = null;
        field_g = null;
    }

    static {
        field_h = new String[]{"Retrieval", "Retribution", "Simulator"};
        field_a = new int[8192];
        field_e = new IntrusiveDeque();
        field_g = new QuickChatDynamicCommand(14, 0, 4, 1);
    }
}
