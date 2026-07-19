/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp {
    static int[] field_a;
    static String field_b;

    final static ak a(int param0, int param1, int param2, int param3, int param4) {
        Object var5 = null;
        ak var5_ref = null;
        int var6 = 0;
        ak var7 = null;
        ak var8 = null;
        var5 = null;
        var6 = CrazyCrystals.field_B;
        if (param1 >= 114) {
          var5_ref = (ak) ((Object) hd.field_d.g(32073));
          L0: while (true) {
            if (var5_ref != null) {
              if (param0 != var5_ref.field_g) {
                var5_ref = (ak) ((Object) hd.field_d.a(false));
                continue L0;
              } else {
                return var5_ref;
              }
            } else {
              var7 = new ak();
              var7.field_j = param4;
              var7.field_h = param3;
              var7.field_g = param0;
              hd.field_d.b(0, var7);
              j.a(var7, param2, false);
              return var7;
            }
          }
        } else {
          field_b = (String) null;
          var5_ref = (ak) ((Object) hd.field_d.g(32073));
          L1: while (true) {
            if (var5_ref != null) {
              if (param0 != var5_ref.field_g) {
                var5_ref = (ak) ((Object) hd.field_d.a(false));
                continue L1;
              } else {
                return var5_ref;
              }
            } else {
              var8 = new ak();
              var5_ref = var8;
              var8.field_j = param4;
              var8.field_h = param3;
              var8.field_g = param0;
              hd.field_d.b(0, var8);
              j.a(var8, param2, false);
              return var8;
            }
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 < 102) {
            jp.a((byte) 44);
        }
    }

    static {
        field_a = new int[8192];
        field_b = "Push the rock to kill this spider.";
    }
}
