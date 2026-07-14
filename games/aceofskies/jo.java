/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo extends wf {
    int field_k;
    static int[] field_j;
    jo field_f;
    static String field_l;
    int field_g;
    int field_i;
    int field_e;
    int field_h;

    public static void a(byte param0) {
        al var2 = null;
        field_j = null;
        if (param0 >= -118) {
          var2 = (al) null;
          rh discarded$2 = jo.a((al) null, -12, (byte) -87);
          field_l = null;
          return;
        } else {
          field_l = null;
          return;
        }
    }

    final static rh a(al param0, int param1, byte param2) {
        if (param2 >= -18) {
          jo.a((byte) 24);
          return w.a(-23159, su.a(param0, 100, param1));
        } else {
          return w.a(-23159, su.a(param0, 100, param1));
        }
    }

    jo(int param0, int param1, int param2, int param3, int param4) {
        ((jo) this).field_g = param2;
        ((jo) this).field_e = param4;
        ((jo) this).field_k = param0;
        ((jo) this).field_h = param3;
        ((jo) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "BEST HIGHSCORES";
        field_j = new int[4];
    }
}
