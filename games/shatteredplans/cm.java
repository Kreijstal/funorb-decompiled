/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    private int[] field_d;
    static bc field_a;
    static ro field_e;
    static int[] field_g;
    static boolean field_f;
    static String field_c;
    static bi field_b;

    cm(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= param0.length + (param0.length >> 926277889)) {
            var2 = var2 << 1;
        }
        ((cm) this).field_d = new int[var2 - -var2];
        for (var3 = 0; var3 < var2 - -var2; var3++) {
            ((cm) this).field_d[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = param0[var3] & -1 + var2;
            while (-1 != ((cm) this).field_d[1 + var4 - -var4]) {
                var4 = -1 + var2 & 1 + var4;
            }
            ((cm) this).field_d[var4 + var4] = param0[var3];
            ((cm) this).field_d[1 + (var4 + var4)] = var3;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = (((cm) this).field_d.length >> 1160525185) - 1;
          if (param0 == 24396) {
            break L0;
          } else {
            cm.a((byte) -59);
            break L0;
          }
        }
        var4 = var3 & param1;
        L1: while (true) {
          var5 = ((cm) this).field_d[1 + (var4 + var4)];
          if ((var5 ^ -1) == 0) {
            return -1;
          } else {
            if (((cm) this).field_d[var4 + var4] != param1) {
              var4 = var4 - -1 & var3;
              continue L1;
            } else {
              return var5;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 != -26) {
            cm.a((byte) 94);
        }
        field_a = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ro();
        field_c = "Searching for an opponent";
    }
}
