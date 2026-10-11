/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mda {
    static sna field_b;
    static du field_a;
    static sna field_c;

    final static int a(int param0, int param1) {
        int var2;
        var2 = 0;
        if (param0 < 0) {
          var2 += 16;
          param0 = param0 >>> 16;
        } else {
          if (param0 >= 65536) {
            var2 += 16;
            param0 = param0 >>> 16;
          }
        }
        if (256 <= param0) {
          param0 = param0 >>> 8;
          var2 += 8;
        }
        if (param0 >= param1) {
          var2 += 4;
          param0 = param0 >>> 4;
        }
        if (param0 >= 4) {
          param0 = param0 >>> 2;
          var2 += 2;
        }
        if (param0 >= 1) {
          param0 = param0 >>> 1;
          var2++;
        }
        return var2 + param0;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 15) {
          field_b = (sna) null;
        }
    }

    static {
        field_a = new du(15, 0, 1, 0);
    }
}
