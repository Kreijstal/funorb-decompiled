/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    static String field_a;
    static String field_e;
    private int[] field_d;
    static ve field_b;
    static volatile int field_c;
    static String field_f;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        var4 = -94 / ((param0 - -1) / 57);
        var3 = (((qm) this).field_d.length >> -1735415551) - 1;
        var5 = var3 & param1;
        L0: while (true) {
          var6 = ((qm) this).field_d[var5 + (var5 - -1)];
          if (var6 != -1) {
            if (((qm) this).field_d[var5 + var5] != param1) {
              var5 = var3 & var5 + 1;
              continue L0;
            } else {
              return var6;
            }
          } else {
            return -1;
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
          field_f = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          return;
        }
    }

    qm(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 1;
        L0: while (true) {
          if (param0.length - -(param0.length >> 1782997697) < var2) {
            ((qm) this).field_d = new int[var2 - -var2];
            var3 = 0;
            L1: while (true) {
              if (var2 + var2 <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (param0.length > var3) {
                    var4 = param0[var3] & -1 + var2;
                    L3: while (true) {
                      if ((((qm) this).field_d[1 + (var4 + var4)] ^ -1) == 0) {
                        ((qm) this).field_d[var4 + var4] = param0[var3];
                        ((qm) this).field_d[1 + (var4 + var4)] = var3;
                        var3++;
                        continue L2;
                      } else {
                        var4 = var2 - 1 & 1 + var4;
                        continue L3;
                      }
                    }
                  } else {
                  }
                }
              } else {
                ((qm) this).field_d[var3] = -1;
                var3++;
                continue L1;
              }
            }
          } else {
            var2 = var2 << 1;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Game drawn";
        field_a = "Report <%0> for abuse";
        field_c = 0;
        field_f = "Passwords must be between 5 and 20 letters and numbers";
    }
}
