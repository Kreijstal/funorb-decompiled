/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int[] field_d;
    static om[] field_a;
    static String[][] field_b;
    static String field_c;

    public static void a(int param0) {
        Object var2 = null;
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 < 23) {
          var2 = null;
          int discarded$2 = mc.a(-23, (CharSequence) null, 81);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static int a(int param0, CharSequence param1, int param2) {
        if (param0 < 12) {
            mc.a(77, false);
            return gl.a(true, param2, (byte) -107, param1);
        }
        return gl.a(true, param2, (byte) -107, param1);
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 0) {
            field_a = null;
            fj.field_o.a(param1, 123);
            return;
        }
        fj.field_o.a(param1, 123);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_d = new int[256];
        field_a = null;
        var1 = 0;
        L0: while (true) {
          if (-257 >= var1) {
            field_c = "This password is part of your Player Name, and would be easy to guess";
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (-9 <= var2) {
                field_d[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (1 != (var0 & 1)) {
                  var0 = var0 >>> 1;
                  var2++;
                  var2++;
                  continue L1;
                } else {
                  var0 = -306674912 ^ var0 >>> 550483681;
                  var2++;
                  var2++;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
