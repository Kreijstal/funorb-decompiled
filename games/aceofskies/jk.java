/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static String field_c;
    static gk field_b;
    private fq field_a;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 29770) {
            boolean discarded$0 = jk.a('>', 104);
        }
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        char[] var5 = null;
        char[] var6 = null;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (!dc.a((byte) -119, param0)) {
            var10 = wo.field_l;
            var8 = var10;
            var5 = var8;
            var2 = var5;
            var3 = 0;
            L0: while (true) {
              if (var10.length <= var3) {
                var11 = wb.field_b;
                var9 = var11;
                var6 = var9;
                var2 = var6;
                if (param1 == -26024) {
                  var7 = 0;
                  var3 = var7;
                  L1: while (true) {
                    if (var11.length > var7) {
                      var4 = var11[var7];
                      if (var4 == param0) {
                        return true;
                      } else {
                        var7++;
                        continue L1;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  field_b = (gk) null;
                  var7 = 0;
                  var3 = var7;
                  L2: while (true) {
                    if (var11.length > var7) {
                      var4 = var11[var7];
                      if (var4 == param0) {
                        return true;
                      } else {
                        var7++;
                        continue L2;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                var4 = var10[var3];
                if (param0 == var4) {
                  return true;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    final void a(byte param0, wl param1) {
        ((jk) this).field_a = param1.a((byte) -49, 24, (byte[]) null, 196584, true);
        hl discarded$7 = new hl(((jk) this).field_a, 5126, 2, 0);
        hl discarded$8 = new hl(((jk) this).field_a, 5126, 3, 8);
        if (param0 < 34) {
          return;
        } else {
          hl discarded$9 = new hl(((jk) this).field_a, 5121, 4, 20);
          return;
        }
    }

    jk() {
        du discarded$0 = new du(786336);
        int discarded$1 = ek.a((byte) 108, 1600);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Orb Points";
    }
}
