/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jba extends kca {
    static float[] field_k;
    static String field_l;
    static int field_j;

    final static int a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (!param1) {
          field_j = -65;
          var3 = param2 + -param0 >> 501386288;
          var4 = 128 + 128 * var3 / 256;
          var4 = za.a(0, (byte) 40, 255, var4);
          return var4;
        } else {
          var3 = param2 + -param0 >> 501386288;
          var4 = 128 + 128 * var3 / 256;
          var4 = za.a(0, (byte) 40, 255, var4);
          return var4;
        }
    }

    final it a(byte param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param1;
        if (sqa.a(var4, -3)) {
          if (param0 == 14) {
            var5 = (CharSequence) (Object) param1;
            var3 = jb.a(var5, (byte) 70);
            if (-1 > (var3 ^ -1)) {
              if (130 < var3) {
                return fp.field_c;
              } else {
                return uh.field_k;
              }
            } else {
              return fp.field_c;
            }
          } else {
            return null;
          }
        } else {
          return fp.field_c;
        }
    }

    jba(tra param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        if (((jba) this).a((byte) 14, param1) == fp.field_c) {
            return fm.field_l;
        }
        if (param0 == -1) {
            return null;
        }
        field_k = null;
        return null;
    }

    public static void f(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 501386288) {
            field_j = 108;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new float[16];
        field_l = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_j = 0;
    }
}
