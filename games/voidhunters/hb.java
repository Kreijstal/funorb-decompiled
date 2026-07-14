/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static int[] field_d;
    static long field_b;
    static int field_a;
    static boolean field_c;

    public static void a(int param0) {
        if (param0 != 15873) {
            field_b = -75L;
        }
        field_d = null;
    }

    final static void a(String param0, int param1) {
        String[] var3 = null;
        int var4 = 0;
        String[] var5 = null;
        nc var6 = null;
        nc[] var7 = null;
        rqa var8 = null;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        ij var13 = null;
        var9 = VoidHunters.field_G;
        var10 = ne.a((char)param1, (byte) 119, "", param0);
        var11 = ne.a('\t', (byte) 124, "", var10);
        var12 = ne.a('\n', (byte) 99, ";", var11);
        param0 = var12;
        var13 = clb.a(16);
        System.out.println("String s=" + var12);
        var3 = up.a((byte) -67, ';', var12);
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            return;
          } else {
            var5 = up.a((byte) -67, '(', var3[var4]);
            if (var5 != null) {
              if (-3 == (var5.length ^ -1)) {
                var5[1] = ne.a(')', (byte) 111, "", var5[1]);
                var6 = new nc(lob.a(-92, (CharSequence) (Object) var5[1]));
                var7 = new nc[]{var6};
                var8 = (rqa) (Object) var13.d(0);
                L1: while (true) {
                  if (var8 != null) {
                    L2: {
                      if (var8.a(true, var5[0], var7)) {
                        nc discarded$1 = var8.a(var7, param1 + -157);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var8 = (rqa) (Object) var13.a((byte) 12);
                    continue L1;
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(kka param0, byte param1) {
        be.a(32, true, param0);
        int var2 = -81 / ((param1 - -42) / 61);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 8;
    }
}
