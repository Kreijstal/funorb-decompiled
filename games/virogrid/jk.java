/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static int field_c;
    static p field_a;
    static boolean[] field_d;
    static String field_e;
    static km field_b;
    static String field_f;

    final static int a(int param0, int param1) {
        param0 = ((-1431655766 & param0) >>> 1) + (1431655765 & param0);
        param0 = (param0 & 858993459) + ((-858993460 & param0) >>> 2);
        param0 = 252645135 & (param0 >>> 4) + param0;
        param0 = param0 + (param0 >>> 8);
        if (param1 != 522894888) {
          int discarded$2 = jk.a(-59, -15);
          param0 = param0 + (param0 >>> 16);
          return 255 & param0;
        } else {
          param0 = param0 + (param0 >>> 16);
          return 255 & param0;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_b = null;
        field_f = null;
        field_a = null;
        int var1 = 6;
    }

    final static void a(int param0) {
        dk.f(param0 + 27089);
        kf.a(4, -1);
        if (param0 != -26700) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new p();
        field_d = new boolean[]{false, false, false, false, false, false, false, false, false, true};
        field_e = "Welcome to the Kolonia I Interactive Entertainment System!         <br>What do you want to play?                     <br>      <col=ffffff>Virogrid</col>           <br>Downloading classic Earth game-set...";
        field_f = "Off";
    }
}
