/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends ms {
    private static int[] field_k;
    boolean field_p;
    private int field_n;
    int field_o;
    int field_m;
    private int[] field_l;

    public static void a() {
        field_k = null;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          if (param0 != 0) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          L2: {
            if (field_k == null) {
              break L2;
            } else {
              if (field_k.length == ((le) this).field_l.length) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          field_k = new int[((le) this).field_l.length];
          break L1;
        }
        var3 = ((le) this).field_l.length;
        var4 = param0;
        var5 = ((le) this).field_n - 1;
        var6 = ((le) this).field_n * param1;
        var7 = var3 - 1;
        var8_int = 0;
        L3: while (true) {
          if (var8_int >= var3) {
            var8 = ((le) this).field_l;
            ((le) this).field_l = field_k;
            field_k = var8;
            return;
          } else {
            var9 = var8_int + var6 & var7;
            var10 = 0;
            L4: while (true) {
              if (var10 >= ((le) this).field_n) {
                var8_int = var8_int + ((le) this).field_n;
                continue L3;
              } else {
                var11 = var8_int + var10;
                var12 = var9 + (var10 + var4 & var5);
                field_k[var11] = ((le) this).field_l[var12];
                var10++;
                continue L4;
              }
            }
          }
        }
    }

    private le() throws Throwable {
        throw new Error();
    }
}
