/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kk {
    static IntrusiveDeque field_f;
    static Sprite[] field_d;
    static ResourceArchive field_a;
    static BufferedRandomAccessFile field_b;
    static String field_g;
    static String field_e;
    static String field_c;

    final static int a(int param0, int param1, int param2) {
        if (param1 < 224) {
          if (param1 < param0) {
            return -1;
          }
          if (416 <= param1) {
            return -1;
          }
          if (param2 < 183) {
            return -1;
          }
          if (param2 < 214) {
            return 1;
          }
          return -1;
        }
        if (param1 >= 304) {
          if (param1 < param0) {
            return -1;
          }
          if (416 <= param1) {
            return -1;
          }
          if (param2 < 183) {
            return -1;
          }
          if (param2 < 214) {
            return 1;
          }
          return -1;
        }
        if (param2 >= 183 &&
          param2 < 214) {
          return 0;
        }
        if (param1 < param0) {
          return -1;
        }
        if (416 <= param1) {
          return -1;
        }
        if (param2 < 183) {
          return -1;
        }
        if (param2 >= 214) {
          return -1;
        }
        return 1;
    }

    abstract nk a(int param0);

    public static void clearStaticReferences(boolean param0) {
        if (!param0) {
          field_c = null;
          field_d = null;
          field_e = null;
          field_a = null;
          field_b = null;
          field_f = null;
          field_g = null;
          return;
        }
        kk.clearStaticReferences(false);
        field_c = null;
        field_d = null;
        field_e = null;
        field_a = null;
        field_b = null;
        field_f = null;
        field_g = null;
    }

    abstract void a(byte param0, PacketBuffer param1);

    static {
        field_e = "Music: ";
        field_f = new IntrusiveDeque();
    }
}
