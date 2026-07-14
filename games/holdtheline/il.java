/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_c;
    static String field_a;
    static String field_b;
    static float[] field_d;

    public static void a(int param0) {
        int var1 = -102 % ((param0 - -9) / 36);
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static bm[] a(byte param0, gn param1, int param2, int param3) {
        int var4 = 0;
        var4 = 115 / ((-67 - param0) / 52);
        if (!qg.a(param2, param3, (byte) -27, param1)) {
          return null;
        } else {
          return eg.b(false);
        }
    }

    final static jg a(int param0, int param1, int param2, int param3, byte param4) {
        jg var5 = null;
        jg var5_ref = null;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        var5 = (jg) (Object) pc.field_e.b((byte) 120);
        L0: while (true) {
          if (var5 == null) {
            if (param4 != -66) {
              il.a(-18);
              var5_ref = new jg();
              var5_ref.field_n = param0;
              var5_ref.field_l = param3;
              var5_ref.field_i = param2;
              pc.field_e.a((byte) -114, (hl) (Object) var5_ref);
              gd.a(var5_ref, (byte) 86, param1);
              return var5_ref;
            } else {
              var5_ref = new jg();
              var5_ref.field_n = param0;
              var5_ref.field_l = param3;
              var5_ref.field_i = param2;
              pc.field_e.a((byte) -114, (hl) (Object) var5_ref);
              gd.a(var5_ref, (byte) 86, param1);
              return var5_ref;
            }
          } else {
            if (var5.field_i == param2) {
              return var5;
            } else {
              var5 = (jg) (Object) pc.field_e.c((byte) -45);
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 9;
        field_b = "Go!";
        field_d = new float[]{1.0f, 0.75f, 0.5f, 0.0f};
    }
}
