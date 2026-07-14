/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    String field_b;
    int field_g;
    boolean field_f;
    static String field_a;
    static String field_d;
    boolean field_e;
    String[] field_c;

    final static an a(di param0, int param1, int param2, di param3, int param4) {
        if (param1 <= 40) {
            Object var6 = null;
            an discarded$0 = wc.a((di) null, -35, -8, (di) null, -32);
        }
        if (!vj.a(param2, param0, param4, (byte) 121)) {
            return null;
        }
        return fn.a((byte) 126, param3.a(123, param4, param2));
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 <= 65) {
            field_d = null;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        var1 = 0;
        var2 = 101 % ((32 - param0) / 49);
        L0: while (true) {
          if (var1 >= no.field_n.length) {
            return;
          } else {
            L1: {
              if (no.field_n[var1] != 0) {
                break L1;
              } else {
                if (0 < ji.field_b[var1]) {
                  break L1;
                } else {
                  var1++;
                  continue L0;
                }
              }
            }
            L2: {
              no.field_n[var1] = no.field_n[var1] + ji.field_b[var1];
              if (256 >= no.field_n[var1]) {
                break L2;
              } else {
                no.field_n[var1] = 256;
                break L2;
              }
            }
            L3: {
              if (ji.field_b[var1] >= 0) {
                break L3;
              } else {
                if (-1 <= (no.field_n[var1] ^ -1)) {
                  no.field_n[var1] = 0;
                  ji.field_b[var1] = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (ji.field_b[var1] > -32) {
              ji.field_b[var1] = ji.field_b[var1] - 1;
              var1++;
              continue L0;
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    wc(boolean param0) {
        ((wc) this).field_f = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Advertising websites";
        field_a = "There are no valid types of game that match your preferences.";
    }
}
