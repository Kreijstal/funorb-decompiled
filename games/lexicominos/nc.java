/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends kd {
    int field_j;
    int field_l;
    int[] field_m;
    long field_h;
    int field_k;
    static String field_p;
    static db field_n;
    static int field_r;
    int field_o;
    int field_s;
    int field_q;
    int field_i;

    final static tf a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        var2 = param1.length();
        if (var2 == 0) {
          return w.field_k;
        } else {
          if (param0 >= var2) {
            var3 = 0;
            L0: while (true) {
              if (var2 > var3) {
                var4 = param1.charAt(var3);
                if (var4 != 45) {
                  if (-1 == dc.field_y.indexOf(var4)) {
                    return ll.field_a;
                  } else {
                    var3++;
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (0 == var3) {
                      break L1;
                    } else {
                      if (var3 != -1 + var2) {
                        var3++;
                        var3++;
                        var3++;
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return ll.field_a;
                }
              } else {
                return null;
              }
            }
          } else {
            return vi.field_l;
          }
        }
    }

    public static void a(byte param0) {
        int var1 = 67 % ((param0 - 1) / 43);
        field_p = null;
        field_n = null;
    }

    nc(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((nc) this).field_q = param3;
        ((nc) this).field_s = param5;
        hl.field_B = hl.field_B + 1;
        ((nc) this).field_j = hl.field_B & 65535;
        ((nc) this).field_i = param2;
        ((nc) this).field_o = param4;
        ((nc) this).field_m = param6;
        ((nc) this).field_l = param1;
        ((nc) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = null;
    }
}
