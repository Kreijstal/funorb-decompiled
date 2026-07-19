/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class s {
    static String field_a;
    static int[] field_i;
    int field_f;
    static nl[][] field_e;
    int field_h;
    static String field_d;
    static String field_b;
    int field_c;
    int field_k;
    int field_j;
    int field_g;

    final static void a(boolean param0) {
        int var1 = 0;
        if (param0) {
          L0: {
            field_b = (String) null;
            if (224 > si.field_l) {
              var1 = si.field_l % 32;
              mf.a(si.field_l - -32 - var1, 21298);
              break L0;
            } else {
              mf.a(256, 21298);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (224 > si.field_l) {
              var1 = si.field_l % 32;
              mf.a(si.field_l - -32 - var1, 21298);
              break L1;
            } else {
              mf.a(256, 21298);
              break L1;
            }
          }
          return;
        }
    }

    abstract void a(int param0, int param1, int param2);

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        int var1 = -45 % ((param0 - -49) / 37);
        field_i = null;
        field_e = (nl[][]) null;
    }

    abstract void a(int param0, int param1);

    static {
        field_a = "Arcane Zero Shield blocks this spell in the first round.";
        field_d = "This game has been updated! Please reload this page.";
        field_i = new int[]{42, 43, 44};
        field_b = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
