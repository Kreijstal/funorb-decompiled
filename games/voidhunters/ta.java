/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static dja field_a;
    static int[] field_b;

    final static void a(byte param0, int param1) {
        wp.field_a = maa.field_o;
        if (param0 > -101) {
            ta.a((byte) -35);
            pw.field_a = param1;
            return;
        }
        pw.field_a = param1;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -109) {
            field_b = null;
        }
    }

    final static void a(int[] param0, int param1, wfb param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = VoidHunters.field_G;
        if (param1 <= 113) {
          return;
        } else {
          var3 = 0;
          L0: while (true) {
            if (var3 >= param0.length) {
              return;
            } else {
              L1: {
                L2: {
                  var4 = param0[var3];
                  var5 = param0[1 + var3];
                  var6 = param0[(2 + var3) % param0.length];
                  var7 = param0[(var3 - -3) % param0.length];
                  var8 = (var6 + var4) / 2;
                  var9 = (var5 - -var7) / 2;
                  var10 = var6 - var4;
                  var11 = -var5 + var7;
                  var12 = var11;
                  var13 = -var10;
                  var14 = ecb.a(var13, (byte) -77, var12);
                  var15 = 1;
                  if (param2.field_b != 0) {
                    break L2;
                  } else {
                    if (-1 != (param2.field_i ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var16 = param2.field_b - var8;
                var17 = param2.field_i - var9;
                var18 = ar.a(var16, (byte) 119, var17);
                var19 = ar.a(var10, (byte) 117, var11);
                if (var18 >= var19 >> 1754395553) {
                  break L1;
                } else {
                  var15 = 0;
                  break L1;
                }
              }
              if (var15 != 0) {
                param2.a(-124, new lsb(var8, var9, var14));
                var3 += 2;
                var3 += 2;
                continue L0;
              } else {
                var3 += 2;
                var3 += 2;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = (dja) (Object) new lka();
        field_b = new int[256];
    }
}
