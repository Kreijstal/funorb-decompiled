/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    static String field_c;
    static int[] field_a;
    static int field_g;
    static int field_b;
    static kc field_d;
    static String field_f;
    static String field_e;

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_e = null;
        if (param0 >= -40) {
            int discarded$0 = tm.a(-22, (byte) -122);
        }
        field_f = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 5968) {
            return;
        }
        id.a();
        tj.field_C = 11;
        vf.field_n = new int[260];
        for (var1 = 0; var1 < 256; var1++) {
            var2 = 15.0;
            vf.field_n[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
        }
        int var5 = 256;
        var1 = var5;
        while (vf.field_n.length > var5) {
            vf.field_n[var5] = 255;
            var5++;
        }
    }

    final static int a(int param0, byte param1) {
        param0 = (1431655765 & param0 >>> 1850668257) + (param0 & 1431655765);
        param0 = (858993459 & param0) - -((param0 & -858993460) >>> 42208034);
        param0 = 252645135 & param0 - -(param0 >>> -73129372);
        param0 = param0 + (param0 >>> 1327401960);
        param0 = param0 + (param0 >>> 1461609968);
        if (param1 > -13) {
            boolean discarded$0 = tm.a(true);
        }
        return 255 & param0;
    }

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            int discarded$2 = tm.a(126, (byte) -31);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ch.field_c) {
              break L2;
            } else {
              if (!ob.field_eb.a((byte) 74)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[79];
        field_f = "Quit";
        field_c = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
        field_e = "MOST POWERFUL - ";
    }
}
